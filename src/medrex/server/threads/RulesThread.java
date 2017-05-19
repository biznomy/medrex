package medrex.server.threads;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import medrex.commons.vo.admin.FormSchedule;
import medrex.commons.vo.resident.ResidentMain;
import medrex.server.service.admin.formScheduler.FormScheduleService;
import medrex.server.service.resident.ResidentMainService;
import medrex.server.util.Utils;

public class RulesThread {
	private static final long MILLSECS_PER_SEC = 1000;
	private static final long MILLSECS_PER_MIN = 60 * MILLSECS_PER_SEC;
	private static final long MILLSECS_PER_HRS = 60 * MILLSECS_PER_MIN;
	private static final long MILLSECS_PER_DAY = 24 * MILLSECS_PER_HRS;

	private Timer timer;
	private static TimerTask formSchedulerTask;

	public RulesThread() {
	}

	private void schedule() {
		timer.scheduleAtFixedRate(formSchedulerTask = getFormSchedulerTask(),
				MILLSECS_PER_SEC, 10 * MILLSECS_PER_SEC);
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
		if (formSchedulerTask != null) {
			formSchedulerTask.run();
		}
	}

	public static int getDateDifferenceInDays(Date after, Date before) {
		return (int) ((after.getTime() - before.getTime()) / MILLSECS_PER_DAY);
	}

	private TimerTask getFormSchedulerTask() {
		return new TimerTask() {
			@Override
			public void run() {
				try {
					final FormScheduleService formScheduleService = new FormScheduleService();
					List<FormSchedule> schList = formScheduleService
							.getFormSchedules();

					final ResidentMainService resiMainService = new ResidentMainService();
					List<ResidentMain> resiList = resiMainService
							.getResidentMain("Active");

					if (schList != null && schList.size() > 0) {
						for (FormSchedule refRule : schList) {
							Class masterFormService = Utils
									.getMasterFormService(refRule.getForm());
							Method getAllMethod = Utils
									.getMasterFormServiceGetAllMethod(
											masterFormService, refRule
													.getForm());
							Object refFormService = masterFormService
									.newInstance();

							if (masterFormService != null) {
								for (ResidentMain refResi : resiList) {
								}
							}
						}
					}
				} catch (Exception e) {
				}
			}
		};
	}
}
