package medrex.server.threads;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import medrex.commons.vo.census.counts.BedHold;
import medrex.commons.vo.dashboard.Dashboard;
import medrex.commons.vo.resident.ResidentMain;
import medrex.server.service.admin.formScheduler.PendingFormService;
import medrex.server.service.census.counts.BedHoldService;
import medrex.server.service.census.counts.HospitalService;
import medrex.server.service.census.counts.InHouseService;
import medrex.server.service.census.counts.OutOfPassService;
import medrex.server.service.census.counts.SignOutService;
import medrex.server.service.dashboard.DashboardService;
import medrex.server.service.resident.ResidentMainService;

public class CountThread {
	private static final long MILLSECS_PER_SEC = 1000;
	private static final long MILLSECS_PER_MIN = 60 * MILLSECS_PER_SEC;
	private static final long MILLSECS_PER_HRS = 60 * MILLSECS_PER_MIN;
	private static final long MILLSECS_PER_DAY = 24 * MILLSECS_PER_HRS;

	private Timer timer;
	private static TimerTask dashboardCensusTask;
	private static TimerTask serverCensusTask;
	private static TimerTask dashboardAssessmentsTask;
	private static TimerTask serverAssessmentsTaskForAlert;
	private static TimerTask insuranceDayCountTask;

	public CountThread() {
	}

	private void schedule() {
		timer.scheduleAtFixedRate(
				dashboardCensusTask = getDashboardCensusTask(),
				MILLSECS_PER_SEC, 10 * MILLSECS_PER_SEC);

		timer.scheduleAtFixedRate(serverCensusTask = getServerCensusTask(),
				MILLSECS_PER_SEC, 10 * MILLSECS_PER_SEC // MILLSECS_PER_DAY);
				);
		// for Dashboard Assessments
		timer.scheduleAtFixedRate(
				dashboardAssessmentsTask = getDashboardAssessmentsTask(),
				MILLSECS_PER_SEC, 10 * MILLSECS_PER_SEC);

		// for Payer info insurance count
		/*
		 * timer.scheduleAtFixedRate( insuranceDayCountTask =
		 * getInsuranceDayCountTask(), Utils.getTimeStringToDate("11:59 PM"),
		 * MILLSECS_PER_DAY );
		 */
	}

	public void start() {
		if (timer == null) {
			timer = new Timer("CountThread", true);
			schedule();
		} else {
			throw new IllegalStateException(
					"CountThread is not Active yet. Try restart.");
		}
	}

	public void stop() {
		timer = null;
	}

	public void restart() {
		stop();
		start();
	}

	public void doUpdate() {
		dashboardCensusTask.run();
		serverCensusTask.run();
	}

	public static int getDateDifferenceInDays(Date after, Date before) {
		return (int) ((after.getTime() - before.getTime()) / MILLSECS_PER_DAY);
	}

	private TimerTask getDashboardCensusTask() {
		return new TimerTask() {
			@Override
			public void run() {
				try {
					int inHouse = (new InHouseService()).count();
					int hospital = (new HospitalService()).count();
					int bedHold = (new BedHoldService()).count();
					int outOfPass = (new OutOfPassService()).count();
					SignOutService sOutService = new SignOutService();
					int sOut = sOutService.count();
					int sOutLate = sOutService.countLate();
					int er = sOutService.countEr();

					Dashboard census = (new DashboardService()).get("CENSUS");

					if (census == null) {
						census = new Dashboard();
						census.setName("CENSUS");
					}

					census.setInHouse(inHouse);
					census.setHospital(hospital);
					census.setBedHold(bedHold);
					census.setSignOut(sOut);
					census.setSignOutLate(sOutLate);
					census.setOutOfPass(outOfPass);
					census.setEr(er);
					// System.out.println("ServerThread : DashboardCensusTask");
					(new DashboardService()).insertOrUpdate(census);
				} catch (Exception e) {
				}
			}
		};
	}

	private TimerTask getServerCensusTask() {
		return new TimerTask() {
			@Override
			public void run() {
				try {
					// System.out.println("ServerThread : ServerCensusTask");
					// Census --- BedHold
					BedHoldService service = new BedHoldService();
					List<BedHold> bedHoldList = service.getAll();

					Iterator<BedHold> itr = bedHoldList.iterator();
					while (itr.hasNext()) {
						BedHold refBedHold = itr.next();
						int diffInDays = getDateDifferenceInDays(new Date(),
								refBedHold.getTimestamp());
						if (diffInDays >= 10) {
							// bedHold - 1
							service.delete(refBedHold.getResidentId());
						}
					}

					// Census --- OutOfPass
					ResidentMainService resiService = new ResidentMainService();
					List<ResidentMain> residentList = resiService
							.getResidentMain();

					Iterator<ResidentMain> itrResi = residentList.iterator();
					while (itrResi.hasNext()) {
						ResidentMain refResident = itrResi.next();
						int diffInDays = getDateDifferenceInDays(new Date(),
								refResident.getOutOfPassTimestamp());
						refResident.setOutOfPassCount(diffInDays);
						resiService.insertOrUpdateResidentMain(refResident);
					}
				} catch (Exception e) {
				}
			}
		};
	}

	// for Dashboard Assessments
	private TimerTask getDashboardAssessmentsTask() {
		return new TimerTask() {
			@Override
			public void run() {
				try {
					// System.out.println("ServerThread : DashboardAssessmentsTask");
					PendingFormService pendingFormService = new PendingFormService();
					int pendingFirstFloor = pendingFormService
							.pendingFirstFloorCount();
					int pendingSecondFloor = pendingFormService
							.pendingSecondFloorCount();
					int pendingAlertFirstFloor = pendingFormService
							.countPendingAlertFirstFloor();
					int pendingAlertSecondFloor = pendingFormService
							.countPendingAlertSecondFloor();

					Dashboard assessment = (new DashboardService())
							.get("CENSUS");
					assessment.setPendingFirstFloorCount(pendingFirstFloor);
					assessment.setPendingSecondFloorCount(pendingSecondFloor);
					assessment
							.setPendingAlertFirstFloorCount(pendingAlertFirstFloor);
					assessment
							.setPendingAlertSecondFloorCount(pendingAlertSecondFloor);

					(new DashboardService()).insertOrUpdate(assessment);
				} catch (Exception e) {
				}
			}
		};
	}

	// for Payer info insurance count
	private TimerTask getInsuranceDayCountTask() {
		return new TimerTask() {
			@Override
			public void run() {
				try {
					ResidentMainService residentMainService = new ResidentMainService();
					List allResidentList = residentMainService
							.getResidentMain();
					Iterator<ResidentMain> itr = allResidentList.iterator();
					while (itr.hasNext()) {
						ResidentMain res = itr.next();
						if (res.getMedicalRecordNum() != null
								&& (!res.getMedicalRecordNum().equals(""))) {
							int insCount = res.getInsuranceCount();
							if (insCount != 0) {
								res.setInsuranceCount(insCount - 1);
								System.out.println("serial:=====: "
										+ res.getSerial());
								residentMainService
										.insertOrUpdateResidentMain(res);
							}

						}
					}
				} catch (Exception e) {
				}
			}
		};
	}

}
