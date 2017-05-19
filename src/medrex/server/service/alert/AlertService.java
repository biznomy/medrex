package medrex.server.service.alert;

import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.alert.Alert;
import medrex.commons.vo.alert.AlertReciever;
import medrex.commons.vo.alert.AlertSetting;
import medrex.commons.vo.alert.AlertTime;
import medrex.server.dao.alert.AlertDAO;

public class AlertService {

	/*
	 * public int insertOrUpdateAlert(Alert alert) throws MedrexException { int
	 * serial = 0; serial = (AlertDAO.getInstance().insertOrUpdateAlert(alert));
	 * List pendingAlertRecords = new ArrayList(); if (alert.getSerial() != 0) {
	 * try { pendingAlertRecords = new PendingAlertService()
	 * .getPendingAlertRecords(alert.getSerial());
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } } if (pendingAlertRecords
	 * != null) { try { new PendingAlertService().deletePendingAlertRecord(alert
	 * .getSerial()); } catch (MedrexException e) { // TODO Auto-generated catch
	 * block e.printStackTrace(); } } if
	 * (alert.getStatus().equalsIgnoreCase("Active")) { if (alert.getAlertType()
	 * == 1) { if (alert.getIntervalType().equalsIgnoreCase("Minutes") ||
	 * alert.getIntervalType().equalsIgnoreCase("Hrs") || alert.getDailyTimes()
	 * == null || alert.getDailyTimes().equalsIgnoreCase("")) {
	 * alert.getBeginDate().setHours( alert.getStartTime().getHours());
	 * alert.getBeginDate().setMinutes( alert.getStartTime().getMinutes());
	 * alert.getEndDate() .setHours(alert.getStartTime().getHours());
	 * alert.getEndDate().setMinutes( alert.getStartTime().getMinutes());
	 * 
	 * long milliSeconds = (alert.getEndDate().getTime()) -
	 * (alert.getBeginDate().getTime());
	 * 
	 * long total = 0; int num = 0;
	 * 
	 * if (!(alert.getIntervalTime() == 0)) { num = alert.getIntervalTime(); }
	 * else { num = 0; }
	 * 
	 * if (alert.getIntervalType().equalsIgnoreCase("Minutes")) { total =
	 * milliSeconds / (num 60 1000); } else if
	 * (alert.getIntervalType().equalsIgnoreCase("Hrs")) { total = milliSeconds
	 * / (num 60 60 1000); } else if
	 * (alert.getIntervalType().equalsIgnoreCase("Days")) { total = milliSeconds
	 * / (num 60 60 24 1000); } else if (alert.getIntervalType()
	 * .equalsIgnoreCase("Weeks")) { total = (long) (milliSeconds / ((num
	 * 365.242199 24 60 60 1000) / 52.177457)); } else if
	 * (alert.getIntervalType().equalsIgnoreCase( "Months")) { total = (long)
	 * (milliSeconds / ((num 365.242199 24 60 60 1000) / 12)); } else if
	 * (alert.getIntervalType() .equalsIgnoreCase("Years")) { total = (long)
	 * (milliSeconds / ((num 365.242199 24 60 60 1000))); }
	 * 
	 * // System.out.println("time is :" + alert.getBeginDate() + // ", " +
	 * alert.getEndDate() + ", " + total +", " + // milliSeconds); Date time =
	 * new Date(); for (int i = 1; i <= total; i++) { if
	 * (time.before(alert.getEndDate())) {
	 * time.setTime(alert.getBeginDate().getTime() + ((milliSeconds / total)
	 * i)); time.setMinutes(alert.getStartTime().getMinutes());
	 * time.setHours(alert.getStartTime().getHours()); //
	 * System.out.println("time is:" + alert.getBeginDate().getTime() // + ", "
	 * + milliSeconds + ", " + total + ", " + i +", " + time.getTime());
	 * PendingAlert pa = new PendingAlert();
	 * pa.setBeginDate(alert.getBeginDate()); pa.setEndDate(alert.getEndDate());
	 * pa.setUpdater(alert.getUpdater()); if (alert.getRecieverUser() != null &&
	 * alert.getRecieverDepartment() != null) {
	 * pa.setRecieverId(alert.getRecieverUser() + ", " +
	 * alert.getRecieverDepartment() + "admin"); } else if
	 * (alert.getRecieverUser() != null && alert.getRecieverDepartment() ==
	 * null) { pa.setRecieverId(alert.getRecieverUser() + "admin"); } else if
	 * (alert.getRecieverUser() == null && alert.getRecieverDepartment() !=
	 * null) { pa.setRecieverId(alert.getRecieverDepartment() + "admin"); }
	 * pa.setOwnerStatus(alert.getOwnerStatus()); pa.setOwner(alert.getOwner());
	 * pa.setIntervalTime(alert.getIntervalTime());
	 * pa.setIntervalType(alert.getIntervalType());
	 * pa.setNotes(alert.getNotes()); pa.setResidentId(alert.getResidentId());
	 * pa.setAlertSerial(alert.getSerial()); pa.setStatus(alert.getStatus()); if
	 * (alert.getImmediateAlertType() == 1) { pa.setAlertTime(time); } else {
	 * pa.setAlertTime(time); }
	 * 
	 * try { new PendingAlertService() .insertOrUpdatePendingAlert(pa); } catch
	 * (MedrexException e1) { e1.printStackTrace(); } } } } else {
	 * alert.getBeginDate().setHours( alert.getStartTime().getHours());
	 * alert.getBeginDate().setMinutes( alert.getStartTime().getMinutes());
	 * alert.getEndDate() .setHours(alert.getStartTime().getHours());
	 * alert.getEndDate().setMinutes( alert.getStartTime().getMinutes());
	 * 
	 * long milliSeconds = (alert.getEndDate().getTime()) -
	 * (alert.getBeginDate().getTime());
	 * 
	 * long total = 0; int num = 0;
	 * 
	 * if (!(alert.getIntervalTime() == 0)) { num = alert.getIntervalTime(); }
	 * else { num = 0; }
	 * 
	 * if (alert.getIntervalType().equalsIgnoreCase("Minutes")) { total =
	 * milliSeconds / (num 60 1000); } else if
	 * (alert.getIntervalType().equalsIgnoreCase("Hrs")) { total = milliSeconds
	 * / (num 60 60 1000); } else if
	 * (alert.getIntervalType().equalsIgnoreCase("Days")) { total = milliSeconds
	 * / (num 60 60 24 1000); } else if (alert.getIntervalType()
	 * .equalsIgnoreCase("Weeks")) { total = (long) (milliSeconds / ((num
	 * 365.242199 24 60 60 1000) / 52.177457)); } else if
	 * (alert.getIntervalType().equalsIgnoreCase( "Months")) { total = (long)
	 * (milliSeconds / ((num 365.242199 24 60 60 1000) / 12)); } else if
	 * (alert.getIntervalType() .equalsIgnoreCase("Years")) { total = (long)
	 * (milliSeconds / ((num 365.242199 24 60 60 1000))); } Date time = new
	 * Date(); Date time2 = new Date(); List list = new ArrayList();
	 * StringTokenizer temp = new StringTokenizer(alert .getDailyTimes()); int n
	 * = 0; while (temp.hasMoreElements()) { list.add(temp.nextToken(";")); } //
	 * total = days; Date bgDate = alert.getBeginDate(); //
	 * System.out.println("Total is :" + temp); for (int i = 0; i <= total; i++)
	 * { for (int j = 0; j < list.size(); j++) { DateFormat formatter = new
	 * SimpleDateFormat( "hh:mm a"); try { time2 = (Date)
	 * formatter.parse((String) list .get(j)); } catch (ParseException e) { //
	 * TODO Auto-generated catch block e.printStackTrace(); } //
	 * System.out.println("time is :" + time); if
	 * (bgDate.before(alert.getEndDate())) {
	 * time.setTime(alert.getBeginDate().getTime() + ((milliSeconds / total)
	 * i)); time.setMinutes(time2.getMinutes());
	 * time.setHours(time2.getHours()); }
	 * 
	 * PendingAlert pa = new PendingAlert();
	 * pa.setBeginDate(alert.getBeginDate()); pa.setEndDate(alert.getEndDate());
	 * pa.setUpdater(alert.getUpdater()); if (alert.getRecieverUser() != null &&
	 * alert.getRecieverDepartment() != null) {
	 * pa.setRecieverId(alert.getRecieverUser() + ", " +
	 * alert.getRecieverDepartment() + "admin"); } else if
	 * (alert.getRecieverUser() != null && alert.getRecieverDepartment() ==
	 * null) { pa.setRecieverId(alert.getRecieverUser() + "admin"); } else if
	 * (alert.getRecieverUser() == null && alert.getRecieverDepartment() !=
	 * null) { pa.setRecieverId(alert.getRecieverDepartment() + "admin"); }
	 * pa.setIntervalTime(alert.getIntervalTime());
	 * pa.setIntervalType(alert.getIntervalType());
	 * pa.setNotes(alert.getNotes()); pa.setResidentId(alert.getResidentId());
	 * pa.setAlertSerial(alert.getSerial());
	 * pa.setOwnerStatus(alert.getOwnerStatus()); pa.setOwner(alert.getOwner());
	 * pa.setStatus(alert.getStatus()); pa.setAlertTime(time); try { new
	 * PendingAlertService() .insertOrUpdatePendingAlert(pa); } catch
	 * (MedrexException e1) { e1.printStackTrace(); } } //
	 * bgDate.setYear(time.getYear()); // bgDate.setMonth(time.getMonth()); //
	 * bgDate.setDate(time.getDate() + 1); } } } else if (alert.getAlertType()
	 * == 2) {
	 * 
	 * int total = 0; int num = 0; Date time = new Date(); int startDate =
	 * alert.getBeginDate().getDate(); if (!(alert.getIntervalTime() == 0)) {
	 * num = alert.getIntervalTime(); } else { num = 0; } time = (Date)
	 * alert.getStartTime(); Date date = (Date) alert.getStartTime();
	 * 
	 * double mon = monthsBetween(alert.getBeginDate(), alert .getEndDate());
	 * int month = (int) Math.round(mon);
	 * 
	 * long milliSeconds = (alert.getEndDate().getTime()) -
	 * (alert.getBeginDate().getTime()); int days = (int) (milliSeconds / (24 60
	 * 60 1000)); long y = 24 60 60 1000 365; int year = (int) ((milliSeconds /
	 * (24 60 60 1000)) / 365); if (days != 0) { days = days; } else { days +=
	 * 1; } if (month != 0) { month = month; } else { month += 1; } if (year !=
	 * 0) { total = year 12; } else { total = 0; }
	 * 
	 * List list = new ArrayList(); StringTokenizer temp = new
	 * StringTokenizer(alert .getDailyTimes()); int n = 0; while
	 * (temp.hasMoreElements()) { list.add(temp.nextToken(";")); } total = days;
	 * Date bgDate = alert.getBeginDate(); // System.out.println("Total is :" +
	 * total); for (int i = 0; i <= total; i++) { for (int j = 0; j <
	 * list.size(); j++) { DateFormat formatter = new
	 * SimpleDateFormat("hh:mm a"); try { time = (Date) formatter.parse((String)
	 * list.get(j)); } catch (ParseException e) { // TODO Auto-generated catch
	 * block e.printStackTrace(); } if (bgDate.before(alert.getEndDate())) {
	 * time.setYear(bgDate.getYear()); time.setMonth(bgDate.getMonth());
	 * time.setDate(bgDate.getDate()); } PendingAlert pa = new PendingAlert();
	 * pa.setBeginDate(alert.getBeginDate()); pa.setEndDate(alert.getEndDate());
	 * pa.setUpdater(alert.getUpdater()); if (alert.getRecieverUser() != null &&
	 * alert.getRecieverDepartment() != null) {
	 * pa.setRecieverId(alert.getRecieverUser() + ", " +
	 * alert.getRecieverDepartment() + "admin"); } else if
	 * (alert.getRecieverUser() != null && alert.getRecieverDepartment() ==
	 * null) { pa.setRecieverId(alert.getRecieverUser() + "admin"); } else if
	 * (alert.getRecieverUser() == null && alert.getRecieverDepartment() !=
	 * null) { pa.setRecieverId(alert.getRecieverDepartment() + "admin"); }
	 * pa.setIntervalTime(alert.getIntervalTime());
	 * pa.setIntervalType(alert.getIntervalType());
	 * pa.setNotes(alert.getNotes()); pa.setResidentId(alert.getResidentId());
	 * pa.setAlertSerial(alert.getSerial());
	 * pa.setOwnerStatus(alert.getOwnerStatus()); pa.setOwner(alert.getOwner());
	 * pa.setStatus(alert.getStatus()); pa.setAlertTime(time); try { new
	 * PendingAlertService() .insertOrUpdatePendingAlert(pa); } catch
	 * (MedrexException e1) { e1.printStackTrace(); } }
	 * bgDate.setYear(time.getYear()); bgDate.setMonth(time.getMonth());
	 * bgDate.setDate(time.getDate() + 1); } } else if (alert.getAlertType() ==
	 * 3) { if (alert.getImmediateAlertType() == 1) { Date time = new Date();
	 * PendingAlert pa = new PendingAlert();
	 * pa.setBeginDate(alert.getBeginDate()); pa.setEndDate(alert.getEndDate());
	 * pa.setUpdater(alert.getUpdater()); if (alert.getRecieverUser() != null &&
	 * alert.getRecieverDepartment() != null) {
	 * pa.setRecieverId(alert.getRecieverUser() + ", " +
	 * alert.getRecieverDepartment() + "admin"); } else if
	 * (alert.getRecieverUser() != null && alert.getRecieverDepartment() ==
	 * null) { pa.setRecieverId(alert.getRecieverUser() + "admin"); } else if
	 * (alert.getRecieverUser() == null && alert.getRecieverDepartment() !=
	 * null) { pa.setRecieverId(alert.getRecieverDepartment() + "admin"); }
	 * pa.setIntervalTime(alert.getIntervalTime());
	 * pa.setIntervalType(alert.getIntervalType());
	 * pa.setNotes(alert.getNotes()); pa.setResidentId(alert.getResidentId());
	 * pa.setAlertSerial(alert.getSerial());
	 * pa.setOwnerStatus(alert.getOwnerStatus()); pa.setOwner(alert.getOwner());
	 * pa.setStatus(alert.getStatus()); pa.setAlertTime(time); try { new
	 * PendingAlertService() .insertOrUpdatePendingAlert(pa); } catch
	 * (MedrexException e1) { e1.printStackTrace(); } } else if
	 * (alert.getImmediateAlertType() == 2) { Date time = new Date(); Date
	 * bgDate = alert.getStartTime(); // System.out.println("List size is :" +
	 * ", " // + bgDate.getDate()); time.setMinutes(bgDate.getMinutes());
	 * time.setHours(bgDate.getHours());
	 * time.setDate(alert.getBeginDate().getDate());
	 * time.setMonth(alert.getBeginDate().getMonth());
	 * time.setYear(alert.getBeginDate().getYear()); PendingAlert pa = new
	 * PendingAlert(); pa.setBeginDate(alert.getBeginDate());
	 * pa.setEndDate(alert.getEndDate()); pa.setUpdater(alert.getUpdater()); if
	 * (alert.getRecieverUser() != null && alert.getRecieverDepartment() !=
	 * null) { pa.setRecieverId(alert.getRecieverUser() + ", " +
	 * alert.getRecieverDepartment() + "admin"); } else if
	 * (alert.getRecieverUser() != null && alert.getRecieverDepartment() ==
	 * null) { pa.setRecieverId(alert.getRecieverUser() + "admin"); } else if
	 * (alert.getRecieverUser() == null && alert.getRecieverDepartment() !=
	 * null) { pa.setRecieverId(alert.getRecieverDepartment() + "admin"); }
	 * pa.setIntervalTime(alert.getIntervalTime());
	 * pa.setIntervalType(alert.getIntervalType());
	 * pa.setNotes(alert.getNotes()); pa.setResidentId(alert.getResidentId());
	 * pa.setAlertSerial(alert.getSerial());
	 * pa.setOwnerStatus(alert.getOwnerStatus()); pa.setOwner(alert.getOwner());
	 * pa.setStatus(alert.getStatus()); pa.setAlertTime(time); try { new
	 * PendingAlertService() .insertOrUpdatePendingAlert(pa); } catch
	 * (MedrexException e1) { e1.printStackTrace(); } // } } } } else { try {
	 * new PendingAlertService()
	 * .deletePendingAlertRecord(Global.currentAlertKey); } catch
	 * (MedrexException e) { e.printStackTrace(); } } return serial; }
	 */

	/*
	 * public int insertOrUpdateAlert(Alert alert) throws MedrexException { int
	 * serial = 0; serial = (AlertDAO.getInstance().insertOrUpdateAlert(alert));
	 * List<AlertTime> alertTimeRecords = new ArrayList<AlertTime>(); if (serial
	 * != 0) { try { alertTimeRecords = new AlertTimeService()
	 * .getAlertTimeRecords(alert);
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } } if (alertTimeRecords !=
	 * null) { try { new AlertTimeService().deletegetAlertTimeRecord(serial); }
	 * catch (MedrexException e) { e.printStackTrace(); } } DateFormat formatter
	 * = new SimpleDateFormat("hh:mm a"); Calendar calendar =
	 * Calendar.getInstance(); if (alert.getStartTime() != null)
	 * calendar.setTime(alert.getStartTime()); if
	 * (alert.getStatus().equalsIgnoreCase("Active")) { if (alert.getAlertType()
	 * == 1) { if ((alert.getIntervalType().equalsIgnoreCase("Minutes") ||
	 * alert.getIntervalType().equalsIgnoreCase("Hrs")) &&
	 * (alert.getDailyTimes() == null ||
	 * alert.getDailyTimes().equalsIgnoreCase(""))) { int minCount = 0; int
	 * hrCount = 0; if (alert.getIntervalType().equalsIgnoreCase("Minutes")) {
	 * minCount = 1440 / alert.getIntervalTime(); for (int min = 0; min <
	 * minCount; min++) { calendar.add(Calendar.MINUTE, alert
	 * .getIntervalTime()); AlertTime at = new AlertTime();
	 * at.setAlertId(alert); at.setTime(formatter.format(calendar.getTime()));
	 * new AlertTimeService().insertOrUpdateAlertTime(at); } } else if
	 * (alert.getIntervalType().equalsIgnoreCase("Hrs")) { hrCount = 24 /
	 * alert.getIntervalTime(); for (int hr = 0; hr < hrCount; hr++) {
	 * calendar.add(Calendar.HOUR, alert .getIntervalTime()); AlertTime at = new
	 * AlertTime(); at.setAlertId(alert);
	 * at.setTime(formatter.format(calendar.getTime())); new
	 * AlertTimeService().insertOrUpdateAlertTime(at); } } } else if
	 * (!(alert.getDailyTimes().equalsIgnoreCase(""))) { List list = new
	 * ArrayList(); StringTokenizer temp = new StringTokenizer(alert
	 * .getDailyTimes()); int n = 0; while (temp.hasMoreElements()) {
	 * list.add(temp.nextToken(";")); } Date time = new Date(); for (int j = 0;
	 * j < list.size(); j++) { try { time = (Date) formatter.parse((String)
	 * list.get(j)); } catch (ParseException e) { e.printStackTrace(); }
	 * AlertTime at = new AlertTime(); at.setAlertId(alert);
	 * at.setTime(formatter.format(time)); new
	 * AlertTimeService().insertOrUpdateAlertTime(at); } } else { AlertTime at =
	 * new AlertTime(); at.setAlertId(alert);
	 * at.setTime(formatter.format(alert.getStartTime())); new
	 * AlertTimeService().insertOrUpdateAlertTime(at); } } else if
	 * (alert.getAlertType() == 2) { List list = new ArrayList();
	 * StringTokenizer temp = new StringTokenizer(alert .getDailyTimes()); int n
	 * = 0; while (temp.hasMoreElements()) { list.add(temp.nextToken(";")); }
	 * Date time = new Date(); for (int j = 0; j < list.size(); j++) { try {
	 * time = (Date) formatter.parse((String) list.get(j)); } catch
	 * (ParseException e) { e.printStackTrace(); } AlertTime at = new
	 * AlertTime(); at.setAlertId(alert); at.setTime(formatter.format(time));
	 * new AlertTimeService().insertOrUpdateAlertTime(at); } } else if
	 * (alert.getAlertType() == 3) { if (alert.getImmediateAlertType() == 1) {
	 * AlertTime at = new AlertTime(); at.setAlertId(alert);
	 * at.setTime(formatter.format(new Date())); new
	 * AlertTimeService().insertOrUpdateAlertTime(at); } else if
	 * (alert.getImmediateAlertType() == 2) { AlertTime at = new AlertTime();
	 * at.setAlertId(alert); at.setTime(formatter.format(alert.getStartTime()));
	 * new AlertTimeService().insertOrUpdateAlertTime(at); } } } return serial;
	 * }
	 */

	public int insertOrUpdateAlert(Alert alert) throws MedrexException {
		int serial = 0;
		System.out.println("Start Time is : " + new Date());
		serial = (AlertDAO.getInstance().insertOrUpdateAlert(alert));
		insertOrUpdateDailyTimes(alert);
		insertOrUpdateAlertReciever(alert);
		new CalculatedAlertService().insertOrUpdateCalculatedAlert(alert);
		System.out.println("End Time is : " + new Date());
		return serial;
	}

	private void insertOrUpdateAlertReciever(Alert alert)
			throws MedrexException {
		if (!alert.getRecieverUser().equalsIgnoreCase("")) {
			List list = new ArrayList();
			StringTokenizer temp = new StringTokenizer(alert.getRecieverUser());
			int reciever = 0;
			while (temp.hasMoreElements()) {
				list.add(temp.nextToken(","));
			}
			for (int j = 0; j < list.size(); j++) {
				reciever = Integer.parseInt((String) list.get(j));
				AlertReciever ar = new AlertReciever();
				ar.setAlertId(alert);
				ar.setRecieverId(reciever);
				AlertDAO.getInstance().insertOrUpdateAlertReciever(ar);
			}
		}
		if (!alert.getRecieverDepartment().equalsIgnoreCase("")) {
			List list = new ArrayList();
			StringTokenizer temp = new StringTokenizer(alert
					.getRecieverDepartment());
			int reciever = 0;
			while (temp.hasMoreElements()) {
				list.add(temp.nextToken(",").trim());
			}
			for (int j = 0; j < list.size(); j++) {
				reciever = Integer.parseInt((list.get(j).toString()));
				AlertReciever ar = new AlertReciever();
				ar.setAlertId(alert);
				ar.setRecieverId(reciever);
				AlertDAO.getInstance().insertOrUpdateAlertReciever(ar);
			}
		}
	}

	private void insertOrUpdateDailyTimes(Alert alert) throws MedrexException {
		DateFormat formatter = new SimpleDateFormat("hh:mm a");
		if (alert.getAlertType() == 2) {
			List list = new ArrayList();
			StringTokenizer temp = new StringTokenizer(alert.getDailyTimes());
			while (temp.hasMoreElements()) {
				list.add(temp.nextToken(","));
			}
			Date time = new Date();
			for (int j = 0; j < list.size(); j++) {
				try {
					time = formatter.parse((String) list.get(j));
				} catch (ParseException e) {
					e.printStackTrace();
				}
				AlertTime at = new AlertTime();
				at.setAlertId(alert);
				at.setTime(formatter.format(time));
				AlertDAO.getInstance().insertOrUpdateAlertTime(at);
			}
		} else if (!(alert.getDailyTimes().equalsIgnoreCase(""))
				&& alert.getAlertType() == 1
				&& !(alert.getIntervalType().equalsIgnoreCase("Minutes"))
				&& !(alert.getIntervalType().equalsIgnoreCase("Hrs"))) {
			List list = new ArrayList();
			StringTokenizer temp = new StringTokenizer(alert.getDailyTimes());
			while (temp.hasMoreElements()) {
				list.add(temp.nextToken(","));
			}
			Date time = new Date();
			for (int j = 0; j < list.size(); j++) {
				try {
					time = formatter.parse((String) list.get(j));
				} catch (ParseException e) {
					e.printStackTrace();
				}
				AlertTime at = new AlertTime();
				at.setAlertId(alert);
				at.setTime(formatter.format(time));
				AlertDAO.getInstance().insertOrUpdateAlertTime(at);
			}
		}
	}

	private final double AVERAGE_MILLIS_PER_MONTH = 365.24 * 24 * 60 * 60
			* 1000 / 12;

	public double monthsBetween(Date d1, Date d2) {
		return (d2.getTime() - d1.getTime()) / AVERAGE_MILLIS_PER_MONTH;
	}

	public List getAlertList(int currentResidenceKey) throws MedrexException {
		return AlertDAO.getInstance().getAlertList(currentResidenceKey);
	}

	public void deleteAlertRecord(int id) throws MedrexException {
		AlertDAO.getInstance().deleteAlertRecord(id);
	}

	public Alert getAlertRecord(int currentResidenceKey) throws MedrexException {
		return AlertDAO.getInstance().getAlertRecord(currentResidenceKey);
	}

	public Alert getGlobalAlertRecord(int id) throws MedrexException {
		return AlertDAO.getInstance().getGlobalAlertRecord(id);
	}

	public List getGlobalAlertList(int globalAlertId, int key)
			throws MedrexException {
		return AlertDAO.getInstance().getGlobalAlertList(globalAlertId, key);
	}

	public void insertOrUpdateAlertSetting(AlertSetting as)
			throws MedrexException {
		AlertDAO.getInstance().insertOrUpdateAlertSetting(as);
	}

	public List getAlertSetting() throws MedrexException {
		return AlertDAO.getInstance().getAlertSetting();
	}

	public List getPendingOwnerList(int currentLoggedInUserKey)
			throws MedrexException, RemoteException {
		return AlertDAO.getInstance().getPendingOwnerList(
				currentLoggedInUserKey);
	}

}
