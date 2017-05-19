package medrex.client.tutorial.hibernate;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.tutorial.hibernate.TutDoctor;
import medrex.commons.vo.tutorial.hibernate.TutPhones;
import medrex.commons.vo.tutorial.hibernate.TutResident;
import medrex.commons.vo.tutorial.hibernate.TutRoom;
import medrex.server.dao.HibernateUtil;
import medrex.server.dao.tutorial.hibernate.TutHibernateMainDAO;

public class TutMain {
	private static Date currentDate;

	public static void main(String[] args) {
		HibernateUtil.initTutorial();
		/*
		 * GregorianCalendar class is used to get the Current time
		 * ................
		 */
		GregorianCalendar cal = new GregorianCalendar();
		currentDate = cal.getTime();
		// doSave() method is used to save the data in database.........
		doSave();
		// updateTable() method is used to update the table.....
		updateTable();
		// doDelete() is used to delete the selected row............
		doDelete();
		// getSelectd Resident with number of children greater than
		// five.................................
		getSelectedResident();
		// getSelectd Resident with selected
		// doctor.................................
		getSelectedResidentwithDoctorName();
		// getSeleted Residents with no doctor..........................
		getSelectedResidentwithNoDoctor();
	}

	public static void getSelectedResidentwithNoDoctor() {
		List<TutResident> result = null;
		try {
			result = TutHibernateMainDAO.getInstance()
					.getSelectedResidentwithNoDoctor();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out
				.println("Seleted Resident who have No doctor.................................................................................................");
		System.out
				.println("*****************************************************************************************************************************************");
		System.out.println("residentserial" + "\t" + "doctorserial" + "\t"
				+ "phones" + "\t" + "residentdateofbirth" + "\t"
				+ "residentnumberofchildren" + "\t" + "residentname" + "\t"
				+ "residentroomID");
		System.out
				.println("******************************************************************************************************************************************");
		for (TutResident resident : result) {

			System.out.print(resident.getSerial() + "\t\t");
			System.out.print(resident.getDoctor().getSerial() + "\t\t");
			String phoneIds = "";
			for (TutPhones phone : resident.getPhones()) {
				phoneIds += phone.getSerial() + ";";
			}
			System.out.print(phoneIds + "\t");
			System.out.print(resident.getDateOfBirth() + "\t\t");
			System.out.print(resident.getNoOfChildren() + "\t\t\t");
			System.out.print(resident.getName() + "\t\t");
			System.out.print(resident.getRoom().getSerial() + "\t\t");
			System.out.println();
		}
		System.out
				.println("*******************************************************************************************************************************");

	}

	public static void getSelectedResidentwithDoctorName() {
		List<TutResident> result = null;
		try {
			result = TutHibernateMainDAO.getInstance()
					.getSelectedResidentWithSeletedDoctor();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out
				.println("Seleted Resident who have seleted doctor.......................................................................................");
		System.out
				.println("*******************************************************************************************************************************");
		System.out.println("residentserial" + "\t" + "doctorserial" + "\t"
				+ "phones" + "\t" + "residentdateofbirth" + "\t"
				+ "residentnumberofchildren" + "\t" + "residentname" + "\t"
				+ "residentroomID");
		System.out
				.println("*******************************************************************************************************************************");
		for (TutResident resident : result) {

			System.out.print(resident.getSerial() + "\t\t");
			System.out.print(resident.getDoctor().getSerial() + "\t\t");
			String phoneIds = "";
			for (TutPhones phone : resident.getPhones()) {
				phoneIds += phone.getSerial() + ";";
			}
			System.out.print(phoneIds + "\t");
			System.out.print(resident.getDateOfBirth() + "\t\t");
			System.out.print(resident.getNoOfChildren() + "\t\t\t");
			System.out.print(resident.getName() + "\t\t");
			System.out.print(resident.getRoom().getSerial() + "\t\t");
			System.out.println();
		}
		System.out
				.println("*******************************************************************************************************************************");

	}

	public static void getSelectedResident() {
		List<TutResident> result = null;
		try {
			result = TutHibernateMainDAO.getInstance()
					.getSelectedResidentNumberOfChilrenGreaterThanThree();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out
				.println("Seleted Resident who have number of children Greater than five................................................................");
		System.out
				.println("*******************************************************************************************************************************");
		System.out.println("residentserial" + "\t" + "doctorserial" + "\t"
				+ "phones" + "\t" + "residentdateofbirth" + "\t"
				+ "residentnumberofchildren" + "\t" + "residentname" + "\t"
				+ "residentroomID");
		System.out
				.println("*******************************************************************************************************************************");
		for (TutResident resident : result) {

			System.out.print(resident.getSerial() + "\t\t");
			System.out.print(resident.getDoctor().getSerial() + "\t\t");
			String phoneIds = "";
			for (TutPhones phone : resident.getPhones()) {
				phoneIds += phone.getSerial() + ";";
			}
			System.out.print(phoneIds + "\t");
			System.out.print(resident.getDateOfBirth() + "\t\t");
			System.out.print(resident.getNoOfChildren() + "\t\t\t");
			System.out.print(resident.getName() + "\t\t");
			System.out.print(resident.getRoom().getSerial() + "\t\t");
			System.out.println();

		}
		System.out
				.println("*******************************************************************************************************************************");
	}

	private static void doDelete() {
		try {
			TutHibernateMainDAO.getInstance().deleteTutHibernaterecords(1);
		} catch (MedrexException e) {
			System.out.println("No row exist............................");
			// e.printStackTrace();

		}
		System.out
				.println("Afte Deletion---------------------------------------------------------------------------------------------------------------------------");
		updateTable();
		System.out
				.println("----------------------------------------------------------------------------------------------------------------------------------------");
	}

	public static void doSave() {

		// *************skip*************************************
		// List<TutPhones> phonelist=new ArrayList<TutPhones>();
		// phonelist.add(new TutPhones("mobile","9650126825"));
		// *************skip*************************************

		/*
		 * first create the object of TutRoom class and pass the parameter in
		 * its constructor . after passing value we get a object of TutRoom
		 * class which contain some records
		 */
		TutRoom room = new TutRoom("102");

		/*
		 * after this create the object of TutDoctor class and pass the
		 * parameter in its constructor . after passing value we get a object of
		 * TutDoctor class which contain some records
		 */
		TutDoctor doctors = new TutDoctor("pavan");
		/*
		 * After this we create the object of TutResident class and pass the
		 * parameter in its constructor .
		 * 
		 * we use mapping in its because we want to save parent class object
		 * (TutResident) and child class object(TutDoctor,TutPhones) will we
		 * save automatically by using one-to-one and one-to-many and
		 * many-to-one relationship respectively........................
		 */
		List<TutResident> residentList = new ArrayList<TutResident>();
		residentList.add(new TutResident("Herry", currentDate, 5, room,
				doctors, new TutPhones("mobile", "9650126825"), new TutPhones(
						"mobile", "9650126825")));
		residentList.add(new TutResident("Merry", currentDate, 6, room,
				doctors, new TutPhones("mobile", "9650126825")));
		residentList.add(new TutResident("Rahul", currentDate, 3, room,
				doctors, new TutPhones("mobile", "9650126825"), new TutPhones(
						"mobile", "9650126825")));
		residentList.add(new TutResident("Robin", currentDate, 7, room,
				doctors, new TutPhones("mobile", "9650126825")));
		residentList.add(new TutResident("Gabber", currentDate, 9, room,
				doctors, new TutPhones("mobile", "9650126825"), new TutPhones(
						"mobile", "9650126825"), new TutPhones("mobile",
						"9650126825")));
		// TutResident resident=new
		// TutResident("Herry",currentDate,5,hospital,doctors,phonelist);
		try {
			/*
			 * Call insertOrUpdateTutHibernaterecord(resident) method with
			 * TutResident type object........
			 */
			for (TutResident tutResident : residentList) {
				TutHibernateMainDAO.getInstance()
						.insertOrUpdateTutHibernaterecord(tutResident);
			}

		} catch (MedrexException e) {
			e.printStackTrace();
		}

	}

	public static void updateTable() {
		// Initilize a result variable of type List of
		// TutResident..................
		List<TutResident> result = null;

		try {
			// Call a function to update the table an receive the result into
			// result type variable,..............,,,,,,,,...
			result = TutHibernateMainDAO.getInstance().getTutHibernaterecords();
		} catch (MedrexException e) {
			e.printStackTrace();
		}
		System.out
				.println("*******************************************************************************************************************************");
		System.out.println("residentserial" + "\t" + "doctorserial" + "\t"
				+ "phones" + "\t" + "residentdateofbirth" + "\t"
				+ "residentnumberofchildren" + "\t" + "residentname" + "\t"
				+ "residentroomID");
		System.out
				.println("*******************************************************************************************************************************");
		for (TutResident resident : result) {

			System.out.print(resident.getSerial() + "\t\t");
			System.out.print(resident.getDoctor().getSerial() + "\t\t");
			String phoneIds = "";
			for (TutPhones phone : resident.getPhones()) {
				phoneIds += phone.getSerial() + ";";
			}
			System.out.print(phoneIds + "\t");
			System.out.print(resident.getDateOfBirth() + "\t\t");
			System.out.print(resident.getNoOfChildren() + "\t\t\t");
			System.out.print(resident.getName() + "\t\t");
			System.out.print(resident.getRoom().getSerial() + "\t\t");
			System.out.println();

		}
		System.out
				.println("*******************************************************************************************************************************");
	}
}
