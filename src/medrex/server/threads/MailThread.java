package medrex.server.threads;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import medrex.commons.vo.reports.LabReport;
import medrex.commons.vo.reports.Report;
import medrex.commons.vo.resident.ResidentMain;
import medrex.server.report.LabReportParser;
import medrex.server.report.ReadAttachment;
import medrex.server.service.labReport.LabReportService;
import medrex.server.service.resident.ResidentMainService;

public class MailThread {

	private static final long MILLSECS_PER_SEC = 1000;
	private static final long MILLSECS_PER_MIN = 60 * MILLSECS_PER_SEC;
	private static final long MILLSECS_PER_HRS = 60 * MILLSECS_PER_MIN;
	private static final long MILLSECS_PER_DAY = 24 * MILLSECS_PER_HRS;

	private Timer timer;
	private static TimerTask downloadMailTask;
	private static TimerTask saveMailTask;

	public MailThread() {

	}

	private void schedule() {
		/*
		 * timer.schedule( downloadMailTask = getDownloadMailTask(),
		 * MILLSECS_PER_SEC, MILLSECS_PER_MIN );
		 * 
		 * timer.scheduleAtFixedRate( saveMailTask = getSaveMailTask(),
		 * MILLSECS_PER_SEC, MILLSECS_PER_SEC 10 );
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
		downloadMailTask.run();
		saveMailTask.run();
	}

	private TimerTask getDownloadMailTask() {
		return new TimerTask() {
			@Override
			public void run() {
				try {
					String host = "mail.technolabs.in";
					String user = "testmail@technolabs.in";
					String password = "testmail";

					List mails = ReadAttachment.getMails(host, user, password);
					Iterator<String> i = mails.iterator();
					int num = 0;
					while (i.hasNext()) {
						num++;
						String htmlContent = i.next();
						CreateFileAndWriteContent(htmlContent, num);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
	}

	private TimerTask getSaveMailTask() {
		return new TimerTask() {
			@Override
			public void run() {
				try {
					File folder = new File("mail/");
					File[] listOfFiles = folder.listFiles();

					for (int i = 0; i < listOfFiles.length; i++) {
						if (listOfFiles[i].isFile()) {
							String fileName = listOfFiles[i].getName();
							String mailContent = readFileAsString("mail/"
									+ fileName);

							LabReport labReport = LabReportParser
									.getLabResults(mailContent);
							String firstName = labReport.getPatientFirstName();
							String lastName = labReport.getPatientLastName();
							Date dob = labReport.getDob();
							String reportTitle = labReport.getType();
							System.out.println("firstName: " + firstName
									+ ", lastName: " + lastName + ", dob:"
									+ dob);
							ResidentMain resident = (new ResidentMainService())
									.getResidentAccordingToFirstLastAndDob(
											firstName, lastName, dob);
							if (resident != null) {
								int resId = resident.getSerial();
								System.out.println("id:" + resId);
								Report rep = new Report();
								rep.setResidentId(resId);
								rep.setFirstName(firstName);
								rep.setLastName(lastName);
								rep.setDob(dob);
								rep.setReportDate(new Date());
								rep.setReportTitle(reportTitle);
								rep.setLabReportText(mailContent);
								rep.setNew(true);
								new LabReportService()
										.insertOrUpdatedLabReportText(rep);
								// delete file after inserting content
								File file = new File("mail/" + fileName);
								file.delete();
							}

						}
					}
				} catch (Exception e) {
				}
			}
		};
	}

	private static String readFileAsString(String filePath)
			throws java.io.IOException {
		StringBuffer fileData = new StringBuffer(1000);
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		char[] buf = new char[1024];
		int numRead = 0;
		while ((numRead = reader.read(buf)) != -1) {
			String readData = String.valueOf(buf, 0, numRead);
			fileData.append(readData);
			buf = new char[1024];
		}
		reader.close();
		return fileData.toString();
	}

	private void CreateFileAndWriteContent(String content, int num) {
		String filePath = "mail/";
		String fileName = ((Long) System.currentTimeMillis()).toString();
		filePath = filePath + fileName + String.format("%05d", num) + ".txt";
		try {
			File newFile = new File(filePath);
			if (newFile.createNewFile()) {
				BufferedWriter writer = new BufferedWriter(new FileWriter(
						newFile));
				writer.write(content);
				writer.close();
			} else {
				System.out.println("File Created");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
