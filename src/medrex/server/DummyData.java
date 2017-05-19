package medrex.server;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import medrex.commons.vo.census.AdmissionFromHead;
import medrex.commons.vo.census.AdmissionFromSubHead;
import medrex.commons.vo.census.AdmissionTransportation;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.general.Icd9;
import medrex.commons.vo.masterList.Citizen;
import medrex.commons.vo.masterList.County;
import medrex.commons.vo.masterList.DoctorTypes;
import medrex.commons.vo.masterList.EmptyComboItem;
import medrex.commons.vo.masterList.Insurance;
import medrex.commons.vo.masterList.Language;
import medrex.commons.vo.masterList.MaritalStatus;
import medrex.commons.vo.masterList.MedicareDays;
import medrex.commons.vo.masterList.Origin;
import medrex.commons.vo.masterList.PayerResponsibleParty;
import medrex.commons.vo.masterList.PayerType;
import medrex.commons.vo.masterList.PhoneType;
import medrex.commons.vo.masterList.ProviderTypes;
import medrex.commons.vo.masterList.Relation;
import medrex.commons.vo.masterList.Religion;
import medrex.commons.vo.masterList.Sex;
import medrex.commons.vo.masterList.State;
import medrex.commons.vo.masterList.Status;
import medrex.commons.vo.medication.Templates;
import medrex.commons.vo.others.Doctors;
import medrex.commons.vo.others.Nurse;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.physician.PhysicianForm;
import medrex.commons.vo.providers.ProvidersRecord;
import medrex.commons.vo.providers.ProvidersRecordForm;
import medrex.commons.vo.resident.ResidentContact;
import medrex.commons.vo.resident.ResidentContactPhone;
import medrex.commons.vo.resident.ResidentDiagnosis;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.ResidentPayer;
import medrex.commons.vo.security.SecurityRole;
import medrex.server.constants.Global;

public class DummyData {

	public static void insertDummyData() {
		System.out.println("vinod");
		insertResidents();

		insertUsers();
		insertSecurityRoles();
		insertPhysicianUsers();

		insertCensusLists();

		insertTemplateText();
		// System.out.println("INSERTING Marital status ......");

	}

	public static void insertResidents(List<ResidentMain> list) {
		Iterator<ResidentMain> itr = list.iterator();
		while (itr.hasNext()) {
			ResidentMain resident = itr.next();
			try {
				Global.medrexServer.insertOrUpdateResidentMain(resident);
			} catch (Exception e) {
			}
		}
	}

	public static void insertIcd9s(List<Icd9> list) {
		Iterator<Icd9> itr = list.iterator();
		while (itr.hasNext()) {
			Icd9 ref = itr.next();
			try {
				System.out.println("ICD9 Codes " + ref.getCode());

				Global.medrexServer.insertOrUpdateIcd9(ref);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		/*
		 * try { Global.medrexServer.insertOrUpdateIcd9(list); } catch
		 * (Exception e) { System.out.println(e.getMessage()); }
		 */
	}

	public static void insertResidentContact(List<Object[]> list) {
		Iterator<Object[]> itr = list.iterator();
		while (itr.hasNext()) {
			Object[] objArr = itr.next();
			String fName = (String) objArr[0];
			String lName = (String) objArr[1];
			ResidentContact ctc = (ResidentContact) objArr[2];

			try {
				ResidentMain resident = Global.medrexServer.getResident(lName,
						fName, "");
				if (resident != null) {
					resident.setSerial(resident.getSerial());
					ctc.setResidentId(resident);
				} else {
					System.out
							.println("Resident "
									+ lName
									+ " "
									+ fName
									+ "not found Skipping insertion of Resident Contact "
									+ ctc.getFirstName());
				}
				Global.medrexServer.insertOrUpdateResidentContact(ctc);
			} catch (Exception e) {
			}
		}
	}

	public static void insertResidentContactNew(List<Object[]> list) {
		Iterator<Object[]> itr = list.iterator();
		while (itr.hasNext()) {
			Object[] objArr = itr.next();
			String fName = (String) objArr[0];
			String lName = (String) objArr[1];
			String ssn = (String) objArr[2];
			ssn = ssn.replace(".0", "");

			ResidentContact ctc = (ResidentContact) objArr[3];
			ResidentContactPhone contPhone = (ResidentContactPhone) objArr[4];
			try {
				ResidentMain resident = Global.medrexServer.getResident(lName,
						fName, ssn);
				if (resident != null) {
					resident.setSerial(resident.getSerial());
					System.out.println("resident serial: "
							+ resident.getSerial());
					ctc.setResidentId(resident);

					System.out.println("Contact info:  " + ctc.getLastName()
							+ " " + ctc.getFirstName());

					ResidentContact rescont = Global.medrexServer
							.getResidentContact(ctc.getLastName(), ctc
									.getFirstName());
					int contactId = 0;
					if (rescont == null) {
						contactId = Global.medrexServer
								.insertOrUpdateResidentContact(ctc);
						rescont = new ResidentContact();
					} else {
						contactId = rescont.getSerial();
					}

					rescont.setSerial(contactId);
					contPhone.setContactId(rescont);
					Global.medrexServer
							.insertOrUpdateResidentContactPhone(contPhone);

					System.out.println("Contact:  " + rescont.getSerial() + " "
							+ rescont.getLastName() + " "
							+ rescont.getFirstName()
							+ " insertion Resident contact phones");

				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void insertPhysicians(List<Doctors> list) {
		Iterator<Doctors> itr = list.iterator();
		int i = 0;
		while (itr.hasNext()) {
			Users users = new Users();
			users.setUserName("doctor" + ++i);
			users.setPasswdField("doctor" + i);
			users.setUserType("Physicians");
			// users.setRoleName("general");
			SecurityRole suecRole2 = null;
			try {
				suecRole2 = Global.medrexServer.getSecurityRole(2);
			} catch (Exception e) {
				e.printStackTrace();
			}
			users.setApplicationRole(suecRole2);

			Doctors ref = itr.next();
			int key = 0;
			try {
				key = Global.medrexServer.insertOrUpdateDoctorsRecord(ref);
				users.setUserId(key);
				Global.medrexServer.insertOrUpdateUser(users);
			} catch (Exception e) {
			}
		}
	}

	public static void insertResidentIcd9(List<Object[]> list) {
		Iterator<Object[]> itr = list.iterator();
		String str = "";
		while (itr.hasNext()) {
			Object[] obj = itr.next();
			ResidentDiagnosis rd = new ResidentDiagnosis();

			ResidentMain res = new ResidentMain();
			try {
				str = obj[2].toString();
				if (str.indexOf(".0") == str.length() - 2) {
					str = str.substring(0, str.length() - 2);
				}
				res = Global.medrexServer.getResident("", "", str);
			} catch (Exception e) {

			}
			if (res == null) {
				System.out.println("Resident with ssn no. " + str
						+ " not found"
						+ "Skipping insertion of Resident ICD9 Code "
						+ (String) obj[0]);
				continue;
			}

			Icd9 icd9 = new Icd9();
			icd9.setCode("");
			icd9.setName("");
			try {
				String abcd = (String) obj[0];
				if (abcd.indexOf(".0") == abcd.length() - 2) {
					abcd = abcd.substring(0, abcd.length() - 2);
				}
				icd9 = Global.medrexServer.getIcd9ByCode(abcd);
			} catch (Exception e) {

			}

			rd.setSerial(0);
			// try{
			rd.setDateCreated(new Date());

			rd.setResident(res);
			if (icd9 != null) {
				rd.setName(icd9.getCode() + " " + icd9.getName());

			} else {
				continue;
			}

			rd.setConfirmed(true);
			rd.setDiscontinued(false);

			try {
				// key = Global.medrexServer.insertOrUpdateDoctorsRecord(ref);
				// users.setUserId(key);
				Global.medrexServer.insertOrUpdateResidentDiagnosis(rd);
			} catch (Exception e) {
			}
		}
	}

	public static void insertResidentPhysicians(List<Object[]> list) {
		Iterator<Object[]> itr = list.iterator();
		while (itr.hasNext()) {
			Object[] objArr = itr.next();
			String fName = (String) objArr[0];
			String lName = (String) objArr[1];
			String ssn = (String) objArr[2];
			if (ssn.indexOf(".0") == ssn.length() - 2) {
				ssn = ssn.substring(0, ssn.length() - 2);
			}
			String typeCode = (String) objArr[3];
			String phyFName = (String) objArr[4];
			String phyLName = (String) objArr[5];
			PhysicianForm phy = new PhysicianForm();

			try {
				ResidentMain resident = Global.medrexServer.getResident(lName,
						fName, ssn);
				if (resident != null) {
					// phy.setResidentId(resident.getSerial());
				} else {
					System.out
							.println("Resident with SSN no. "
									+ ssn
									+ " not found Skipping insertion of Resident Doctor "
									+ phyFName + " " + phyLName);
				}
				int dId = Global.medrexServer.getMasterList(DoctorTypes.class,
						typeCode);
				DoctorTypes dTypes = new DoctorTypes();
				if (dId == 0) {
					dTypes.setId(0);
				} else {
					dTypes.setId(dId);
				}

				Doctors doctor = Global.medrexServer.getDoctorsRecord(dTypes,
						phyFName, phyLName);
				if (doctor != null) {
					phy.setPhysician(doctor);
				}

				Global.medrexServer.insertOrUpdatePhysicianForm(phy);
			} catch (Exception e) {
			}
		}
	}

	public static void insertProviders(List<ProvidersRecordForm> list) {
		Iterator<ProvidersRecordForm> itr = list.iterator();
		int i = 1;
		while (itr.hasNext()) {
			ProvidersRecordForm ref = itr.next();
			try {
				ref.setProviderName("Provider " + i++);
				Global.medrexServer.insertOrUpdateProvidersRecordForm(ref);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void insertResidentProviders(List<Object[]> list) {
		Iterator<Object[]> itr = list.iterator();
		while (itr.hasNext()) {
			Object[] objArr = itr.next();
			String fName = (String) objArr[0];
			String lName = (String) objArr[1];
			String ssn = (String) objArr[2];
			if (ssn.indexOf(".0") == ssn.length() - 2) {
				ssn = ssn.substring(0, ssn.length() - 2);
			}
			String typeCode = (String) objArr[3];
			String address = (String) objArr[4];
			String city = (String) objArr[5];
			ProvidersRecord providersRecord = new ProvidersRecord();

			try {
				ResidentMain resident = Global.medrexServer.getResident(lName,
						fName, ssn);
				if (resident != null) {
					providersRecord.setResident(resident);
				}
				int pId = Global.medrexServer.getMasterList(
						ProviderTypes.class, typeCode);
				ProviderTypes pTypes = new ProviderTypes();
				if (pId == 0) {
					pTypes.setId(0);
				} else {
					pTypes.setId(pId);
				}

				ProvidersRecordForm provider = Global.medrexServer
						.getProvidersRecordForm(pTypes, address, city);
				if (provider != null) {
					providersRecord.setProvider(provider);
				}

				Global.medrexServer
						.insertOrUpdateProvidersRecord(providersRecord);
			} catch (Exception e) {
			}
		}
	}

	public static void insertResidentCensus(List<Object[]> list) {
		Iterator<Object[]> itr = list.iterator();
		while (itr.hasNext()) {
			Object[] objArr = itr.next();
			String fName = (String) objArr[0];
			String lName = (String) objArr[1];
			String ssn = (String) objArr[2];
			if (ssn.indexOf(".0") == ssn.length() - 2) {
				ssn = ssn.substring(0, ssn.length() - 2);
			}
			CensusStatus admissionRecord = (CensusStatus) objArr[3];
			AdmissionFromSubHead admissionFrom = (AdmissionFromSubHead) objArr[4];
			CensusStatus dischargeRecord = (CensusStatus) objArr[5];
			AdmissionFromSubHead dischargeTo = (AdmissionFromSubHead) objArr[6];

			try {
				if (admissionFrom != null) {
					List<AdmissionFromSubHead> listInfo = Global.medrexServer
							.getAdmissionFromSubHeads(
									admissionFrom.getHeadId(), admissionFrom
											.getName());

					if (listInfo != null && listInfo.size() > 0) {
						AdmissionFromSubHead ref = listInfo.get(0);
						admissionRecord.setFromSubId(ref.getSerial());
					} else {
						if (admissionFrom.getName() != null
								&& admissionFrom.getName().trim().length() > 0) {
							Global.medrexServer
									.insertOrUpdateAdmissionFromSubHead(admissionFrom);
							admissionRecord.setFromSubId(admissionFrom
									.getSerial());
						}
					}
				}
				if (dischargeTo != null) {
					List<AdmissionFromSubHead> listInfo = Global.medrexServer
							.getAdmissionFromSubHeads(dischargeTo.getHeadId(),
									dischargeTo.getName());

					if (listInfo != null && listInfo.size() > 0) {
						AdmissionFromSubHead ref = listInfo.get(0);
						dischargeRecord.setFromSubId(ref.getSerial());
					} else {
						if (dischargeTo.getName() != null
								&& dischargeTo.getName().trim().length() > 0) {
							Global.medrexServer
									.insertOrUpdateAdmissionFromSubHead(dischargeTo);
							dischargeRecord.setFromSubId(dischargeTo
									.getSerial());
						}
					}
				}

				ResidentMain resident = Global.medrexServer.getResident(lName,
						fName, ssn);
				if (resident == null) {
					resident = Global.medrexServer
							.getResident(lName, fName, "");
					if (resident == null) {
						resident = Global.medrexServer.getResident(fName,
								lName, "");
						if (resident == null) {
							resident = Global.medrexServer.getResident("", "",
									ssn);
							if (resident == null) {
								System.out
										.println("Resident: "
												+ lName
												+ ", "
												+ fName
												+ " with SSN: "
												+ ssn
												+ " is missing. Skipping insertion of Census for this resident");
							}
						}
					}
				}
				if (resident != null) {
					if (admissionRecord != null) {
						admissionRecord.setResidentId(resident.getSerial());
						Global.medrexServer
								.insertOrUpdateCensusStatus(admissionRecord);
					}
					if (dischargeRecord != null) {
						dischargeRecord.setResidentId(resident.getSerial());
						Global.medrexServer
								.insertOrUpdateCensusStatus(dischargeRecord);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static void insertResidents() {

		// insertResidentPayer(residentId, "111", "Medicare");
		// ctcId = insertResidentContact(residentId,
		// "address1",
		// "New York",
		// "kailashm_004@yahoo.com",
		// "George",
		// "Bush",
		// "If there is any problem regarding John Adam then plz let me know",
		// "Brother", "35371");
		//
		// insertResidentContactPhone(ctcId, "9818198849", "HandPhone");
		//
		// insertProviderRecord(residentId, "adam", "gilcrist",
		// "Ambulance", "9818198849");
		// insertProviderRecord(residentId, "demi", "moore", "Lab",
		// "9871192345");
		// insertProviderRecord(residentId, "browne", "gray", "X-ray",
		// "9810193839");
		//
		// residentId = insertResident("John", "Grates", "Male", "102-2",
		// "0123",
		// "0234", "0345", "0456", "address", "2341567498", "0987956420",
		// "jhonnick", "0212209897", "0212653879", "0214376893",
		// "0212719405", "34265", "Sau Paulo", "Sau Paulo",
		// "1st floor south wing");
		// insertResidentPayer(residentId, "111", "Medicare");
		// ctcId = insertResidentContact(residentId,
		// "address1",
		// "New York",
		// "kailashm_004@yahoo.com",
		// "George",
		// "Bush",
		// "If there is any problem regarding John Adam then plz let me know",
		// "Brother", "35371");
		//
		// insertResidentContactPhone(ctcId, "9818198849", "HandPhone");
		//
		// insertProviderRecord(residentId, "adam", "gilcrist",
		// "Ambulance", "9818198849");
		// insertProviderRecord(residentId, "demi", "moore", "Lab",
		// "9871192345");
		// insertProviderRecord(residentId, "browne", "gray", "X-ray",
		// "9810193839");
		//
		// residentId = insertResident("Don", "Gorazd", "Male", "111-2", "0123",
		// "0234", "0345", "0456", "address2", "0212645745", "0476987100",
		// "donnick", "0123426223", "0212653879", "0214376893",
		// "0212719405", "34265", "Argentina", "Argentina",
		// "Main North Wing");
		//
		// insertResidentPayer(residentId, "111", "Medicare");
		// ctcId = insertResidentContact(residentId,
		// "address1",
		// "New York",
		// "kailashm_004@yahoo.com",
		// "George",
		// "Bush",
		// "If there is any problem regarding John Adam then plz let me know",
		// "Brother", "35371");
		//
		// insertResidentContactPhone(ctcId, "9818198849", "HandPhone");
		//
		// insertProviderRecord(residentId, "adam", "gilcrist",
		// "Ambulance", "9818198849");
		// insertProviderRecord(residentId, "demi", "moore", "Lab",
		// "9871192345");
		// insertProviderRecord(residentId, "browne", "gray", "X-ray",
		// "9810193839");
		//
		// residentId = insertResident("Lau", "Nick", "Male", "112-1", "0123",
		// "0234", "0345", "0456", "address3", "0900884566", "0212624345",
		// "laumnick", "0893456218", "0212653879", "0214376893",
		// "0212719405", "34265", "Chile", "Chile", "Main North Wing");
		// insertResidentPayer(residentId, "111", "Medicare");
		// ctcId = insertResidentContact(residentId,
		// "address1",
		// "New York",
		// "kailashm_004@yahoo.com",
		// "George",
		// "Bush",
		// "If there is any problem regarding John Adam then plz let me know",
		// "Brother", "35371");
		//
		// insertResidentContactPhone(ctcId, "9818198849", "HandPhone");
		//
		// insertProviderRecord(residentId, "adam", "gilcrist",
		// "Ambulance", "9818198849");
		// insertProviderRecord(residentId, "demi", "moore", "Lab",
		// "9871192345");
		// insertProviderRecord(residentId, "browne", "gray", "X-ray",
		// "9810193839");
		//
		// residentId = insertResident("Sherry", "Gorazd", "Female", "201",
		// "0123",
		// "0234", "0345", "0456", "address4", "0213542950", "0567439879",
		// "sherrynick", "0212209897", "0212653879", "0214376893",
		// "0212719405", "34265", "Columbia", "Columbia",
		// "2nd floor South Wing");
		//
		// insertResidentPayer(residentId, "111", "Medicare");
		// ctcId = insertResidentContact(residentId,
		// "address1",
		// "New York",
		// "kailashm_004@yahoo.com",
		// "George",
		// "Bush",
		// "If there is any problem regarding John Adam then plz let me know",
		// "Brother", "35371");
		//
		// insertResidentContactPhone(ctcId, "9818198849", "HandPhone");
		//
		// insertProviderRecord(residentId, "adam", "gilcrist",
		// "Ambulance", "9818198849");
		// insertProviderRecord(residentId, "demi", "moore", "Lab",
		// "9871192345");
		// insertProviderRecord(residentId, "browne", "gray", "X-ray",
		// "9810193839");
		//
		// residentId = insertResident("tom", "Lim", "Female", "202", "0123",
		// "0234", "0345", "0456", "address5", "0212645745", "0212624345",
		// "tomnick", "0212209897", "0212653879", "0214376893",
		// "0212719405", "34265", "Mexico", "Mexico",
		// "2nd floor South Wing");
		// insertResidentPayer(residentId, "111", "Medicare");
		// ctcId = insertResidentContact(residentId,
		// "address1",
		// "New York",
		// "kailashm_004@yahoo.com",
		// "George",
		// "Bush",
		// "If there is any problem regarding John Adam then plz let me know",
		// "Brother", "35371");
		//
		// insertResidentContactPhone(ctcId, "9818198849", "HandPhone");
		//
		// insertProviderRecord(residentId, "adam", "gilcrist",
		// "Ambulance", "9818198849");
		// insertProviderRecord(residentId, "demi", "moore", "Lab",
		// "9871192345");
		// insertProviderRecord(residentId, "browne", "gray", "X-ray",
		// "9810193839");
		//
		// residentId = insertResident("Arnauld", "Schwaznegar", "Male",
		// "112-1",
		// "0123", "0234", "0345", "0456", "address6", "0895648762",
		// "0956789345", "arnauldnick", "0212209897", "0212653879",
		// "0214376893", "0212719405", "34265", "Venezuela", "Venezuela",
		// "Main and north wing");
		// insertResidentPayer(residentId, "111", "Medicare");
		// ctcId = insertResidentContact(residentId,
		// "address1",
		// "New York",
		// "kailashm_004@yahoo.com",
		// "George",
		// "Bush",
		// "If there is any problem regarding John Adam then plz let me know",
		// "Brother", "35371");
		//
		// insertResidentContactPhone(ctcId, "9818198849", "HandPhone");
		//
		// insertProviderRecord(residentId, "adam", "gilcrist",
		// "Ambulance", "9818198849");
		// insertProviderRecord(residentId, "demi", "moore", "Lab",
		// "9871192345");
		// insertProviderRecord(residentId, "browne", "gray", "X-ray",
		// "9810193839");
		//
		// residentId = insertResident("Demi", "Moore", "Female", "212-2",
		// "0123",
		// "0234", "0345", "0456", "sddress7", "0212645745", "0212624345",
		// "deminick", "0212209897", "0212653879", "0214376893",
		// "0212719405", "34265", "London", "London",
		// "Main and north wing");
		// insertResidentPayer(residentId, "111", "Medicare");
		// ctcId = insertResidentContact(residentId,
		// "address1",
		// "New York",
		// "kailashm_004@yahoo.com",
		// "George",
		// "Bush",
		// "If there is any problem regarding John Adam then plz let me know",
		// "Brother", "35371");
		//
		// insertResidentContactPhone(ctcId, "9818198849", "HandPhone");
		//
		// insertProviderRecord(residentId, "adam", "gilcrist",
		// "Ambulance", "9818198849");
		// insertProviderRecord(residentId, "demi", "moore", "Lab",
		// "9871192345");
		// insertProviderRecord(residentId, "browne", "gray", "X-ray",
		// "9810193839");
		//
		// residentId = insertResident("Sylvestor", "Stallone", "Male", "102-1",
		// "0123", "0234", "0345", "0456", "address8", "0987009961",
		// "0212624345", "sylvestornick", "0212209897", "0212653879",
		// "0214376893", "0212719405", "34265", "Frankfurt", "Frankfurt",
		// "1st floor south wing");
		// insertResidentPayer(residentId, "111", "Medicare");
		// ctcId = insertResidentContact(residentId,
		// "address1",
		// "New York",
		// "kailashm_004@yahoo.com",
		// "George",
		// "Bush",
		// "If there is any problem regarding John Adam then plz let me know",
		// "Brother", "35371");
		//
		// insertResidentContactPhone(ctcId, "9818198849", "HandPhone");
		//
		// insertProviderRecord(residentId, "adam", "gilcrist",
		// "Ambulance", "9818198849");
		// insertProviderRecord(residentId, "demi", "moore", "Lab",
		// "9871192345");
		// insertProviderRecord(residentId, "browne", "gray", "X-ray",
		// "9810193839");
		//
		// residentId = insertResident("Adam", "Gilchrist", "Male", "104-3",
		// "0123",
		// "0234", "0345", "0456", "address9", "0212645745", "0212624345",
		// "adam2nick", "0212209897", "0212653879", "0214376893",
		// "0212719405", "34265", "France", "France",
		// "1st floor south wing");
		//
		// insertResidentPayer(residentId, "333", "Medicare");
		// ctcId = insertResidentContact(residentId,
		// "address1",
		// "New York",
		// "george_004@yahoo.com",
		// "George",
		// "Bush",
		// "If there is any problem regarding John Adam then plz let me know",
		// "Brother", "35371");
		//
		// insertResidentContactPhone(ctcId, "0124639870", "HandPhone");
		//
		// insertProviderRecord(residentId, "adam", "gilcrist",
		// "Ambulance", "9818198849");
		// insertProviderRecord(residentId, "demi", "moore", "Lab",
		// "9871192345");
		// insertProviderRecord(residentId, "browne", "gray", "X-ray",
		// "9810193839");
		//
		// residentId = insertResident("Michael", "Bevan", "Male", "116-1",
		// "0123",
		// "0234", "0345", "0456", "address10", "0365783425",
		// "0989007756", "michelnick", "0212209897", "0212653879",
		// "0214376893", "0212719405", "34265", "Greece", "Greece",
		// "Main North Wing");
		//
		// insertResidentPayer(residentId, "222", "Commercial");
		//
		// ctcId = insertResidentContact(residentId,
		// "address2",
		// "Sau Paulo",
		// "neio555@yahoo.co.in",
		// "Tom",
		// "Nick",
		// "If there is any problem regarding John Adam then plz let me know",
		// "Brother", "65891");
		//
		// insertResidentContactPhone(ctcId, "0212798783", "Landline(Home)");
		//
		// insertProviderRecord(residentId, "adam", "gilcrist",
		// "Ambulance", "9818198849");
		// insertProviderRecord(residentId, "demi", "moore", "Lab",
		// "9871192345");
		// insertProviderRecord(residentId, "browne", "gray", "X-ray",
		// "9810193839");
		//
		// residentId = insertResident("Alec", "Stewart", "Male", "116-2",
		// "0123",
		// "0234", "0345", "0456", "address11", "0212645745",
		// "0212624345", "alecnick", "0212209897", "0212653879",
		// "0214376893", "0212719405", "34265", "Italy", "Italy",
		// "Main North Wing");
		// insertResidentPayer(residentId, "111", "Medicare");
		// ctcId = insertResidentContact(residentId,
		// "address1",
		// "New York",
		// "kailashm_004@yahoo.com",
		// "George",
		// "Bush",
		// "If there is any problem regarding John Adam then plz let me know",
		// "Brother", "35371");
		//
		// insertResidentContactPhone(ctcId, "9818198849", "HandPhone");
		//
		// insertProviderRecord(residentId, "adam", "gilcrist",
		// "Ambulance", "9818198849");
		// insertProviderRecord(residentId, "demi", "moore", "Lab",
		// "9871192345");
		// insertProviderRecord(residentId, "browne", "gray", "X-ray",
		// "9810193839");
		//
		// residentId = insertResident("Browne", "Gray", "Male", "206-1",
		// "0123",
		// "0234", "0345", "0456", "address12", "0123214276",
		// "0256745398", "brownenick", "0212209897", "0212653879",
		// "0214376893", "0212719405", "34265", "Hong Kong", "Hong Kong",
		// "2nd floor South Wing");
		// insertResidentPayer(residentId, "111", "Medicare");
		// ctcId = insertResidentContact(residentId,
		// "address1",
		// "New York",
		// "kailashm_004@yahoo.com",
		// "George",
		// "Bush",
		// "If there is any problem regarding John Adam then plz let me know",
		// "Brother", "35371");
		//
		// insertResidentContactPhone(ctcId, "9818198849", "HandPhone");
		//
		// insertProviderRecord(residentId, "adam", "gilcrist",
		// "Ambulance", "9818198849");
		// insertProviderRecord(residentId, "demi", "moore", "Lab",
		// "9871192345");
		// insertProviderRecord(residentId, "browne", "gray", "X-ray",
		// "9810193839");
		//
		// residentId = insertResident("Crat", "Prince", "Male", "206-2",
		// "0123",
		// "0234", "0345", "0456", "address13", "0212645745",
		// "0212624345", "cratnick", "0212209897", "0212653879",
		// "0214376893", "0212719405", "34265", "Sydney", "Sydney",
		// "2nd floor South Wing");
		// insertResidentPayer(residentId, "111", "Medicare");
		// ctcId = insertResidentContact(residentId,
		// "address1",
		// "New York",
		// "kailashm_004@yahoo.com",
		// "George",
		// "Bush",
		// "If there is any problem regarding John Adam then plz let me know",
		// "Brother", "35371");
		//
		// insertResidentContactPhone(ctcId, "9818198849", "HandPhone");
		//
		// insertProviderRecord(residentId, "adam", "gilcrist",
		// "Ambulance", "9818198849");
		// insertProviderRecord(residentId, "demi", "moore", "Lab",
		// "9871192345");
		// insertProviderRecord(residentId, "browne", "gray", "X-ray",
		// "9810193839");
	}

	private static void insertSecurityRoles() {

		insertSecurityRoleAdmin();
		insertSecurityRoleNurse();
		insertSecurityRoleCNA();
		insertSecurityRoleGeneral();

	}

	private static void insertPhysicianUsers() {

		insertPhysicianUser("john", "john", "Physicians", "John", "Grates",
				"9876785645");
		insertPhysicianUser("tom", "tom", "Physicians", "tom", "Lim",
				"9808998874");
		insertPhysicianUser("alec", "alec", "Physicians", "Alec", "Stewart",
				"9818198849");

	}

	private static void insertUsers() {

		insertNurseUser("admin", "admin", "Administrator", "admin", "admin",
				"9817173646");
		// insertNurseUser("temp", "temp", "Nurse", "temp",
		// "temp", "9817173646");
		//		
	}

	private static void insertCensusLists() {

		insertFromHead("Hospital");
		insertFromSubHead(1, "Hospital 1");
		insertFromSubHead(1, "Hospital 2");
		insertFromSubHead(1, "Hospital 3");
		insertFromSubHead(1, "Hospital 4");

		insertFromHead("Home");
		insertFromSubHead(2, "Home 1");
		insertFromSubHead(2, "Home 2");
		insertFromSubHead(2, "Home 3");
		insertFromSubHead(2, "Home 4");

		insertFromHead("Long Term Care");
		insertFromSubHead(3, "LTC 1");
		insertFromSubHead(3, "LTC 2");
		insertFromSubHead(3, "LTC 3");
		insertFromSubHead(3, "LTC 4");

		insertTransportation("Ambulance");
		insertTransportation("Car");
		insertTransportation("Van");

	}

	private static void insertFromHead(String name) {
		AdmissionFromHead afh = new AdmissionFromHead();

		afh.setName(name);

		try {
			Global.medrexServer.insertOrUpdateAdmissionFromHead(afh);
		} catch (Exception e) {

		}

	}

	private static void insertFromSubHead(int i, String name) {
		AdmissionFromSubHead afsh = new AdmissionFromSubHead();

		afsh.setHeadId(i);
		afsh.setName(name);

		try {
			Global.medrexServer.insertOrUpdateAdmissionFromSubHead(afsh);
		} catch (Exception e) {

		}

	}

	private static void insertTransportation(String name) {
		AdmissionTransportation at = new AdmissionTransportation();

		at.setName(name);

		try {
			Global.medrexServer.insertOrUpdateAdmissionTransportation(at);
		} catch (Exception e) {

		}

	}

	private static void insertNurseUser(String name, String passwd,
			String type, String firstname, String lastname, String phone) {
		int currentNurseRecordFormKey = 0;
		Users users = new Users();
		users.setUserName(name);
		users.setPasswdField(passwd);
		users.setUserType(type);

		if (users.getUserName().equalsIgnoreCase("admin")) {
			// users.setRoleName("admin");
			SecurityRole suecRole1 = null;
			try {
				suecRole1 = Global.medrexServer.getSecurityRole(1);
			} catch (Exception e) {
				e.printStackTrace();
			}

			users.setApplicationRole(suecRole1);
		} else {
			// users.setRoleName("general");
			SecurityRole suecRole2 = null;
			try {
				suecRole2 = Global.medrexServer.getSecurityRole(2);
			} catch (Exception e) {
				e.printStackTrace();
			}

			users.setApplicationRole(suecRole2);
		}

		Nurse nurse = new Nurse();
		nurse.setNurseName(firstname);
		nurse.setNurseSurName(lastname);
		nurse.setPhone(phone);

		try {
			currentNurseRecordFormKey = Global.medrexServer
					.insertOrUpdateNurseRecord(nurse);
		} catch (Exception e) {

		}

		users.setUserId(currentNurseRecordFormKey);
		try {
			Global.medrexServer.insertOrUpdateUser(users);
		} catch (Exception e) {

		}

	}

	private static void insertPhysicianUser(String name, String passwd,
			String type, String firstname, String lastname, String phone) {
		int currentPhysicianRecordFormKey = 0;
		Users users = new Users();
		users.setUserName(name);
		users.setPasswdField(passwd);
		users.setUserType(type);
		// users.setRoleName("general");
		SecurityRole suecRole2 = null;
		try {
			suecRole2 = Global.medrexServer.getSecurityRole(2);
		} catch (Exception e) {
			e.printStackTrace();
		}

		users.setApplicationRole(suecRole2);

		Doctors d = new Doctors();
		d.setPhysicianName(firstname);
		d.setPhysicianSurName(lastname);
		d.setPhoneNumber(phone);
		// d.setDoctorType(type);

		try {
			// Global.currentPhysicianRecordFormKey =
			// Global.medrexServer.insertOrUpdateDoctorsRecord(d);
			currentPhysicianRecordFormKey = Global.medrexServer
					.insertOrUpdateDoctorsRecord(d);
		} catch (Exception ec) {

		}
		users.setUserId(currentPhysicianRecordFormKey);
		try {
			Global.medrexServer.insertOrUpdateUser(users);
		} catch (Exception e) {

		}
	}

	private static int insertResident(String name, String lastName, String sex,
			String room, String insuranceno, String medicalno,
			String medicareno, String medicaidno, String address,
			String cellno, String homephone, String nickname, String secins,
			String secinsid, String ssnumber, String workphone, String zip,
			String birthplace, String city, String floorType) {

		ResidentMain rm = new ResidentMain();
		/* TODO: Migrating to room history */
		// rm.setFloorType(floorType);
		rm.setUserName(name);
		rm.setUserPass(lastName);
		// rm.setSex(sex);
		/* TODO: Migrating to room history */
		// rm.setRoom(room);
		rm.setInsuranceNum("123456");
		rm.setMedicalRecordNum("111111");
		rm.setMedicareNum("222222");
		rm.setMedicaidNum("333333");

		rm.setAddress(address);
		rm.setBirthPlace(birthplace);
		rm.setCell(cellno);
		// rm.setCitizen("Permanent");
		// rm.setCounty("Primary");
		rm.setCurrentAdmitDate(new Date());
		rm.setDischargeDate(new Date());
		rm.setDob(new Date());
		rm.setHome(homephone);

		// rm.setMaritalStatus("Married");
		rm.setMcIns(1);
		rm.setNickName(nickname);
		rm.setOriginalAdmitDate(new Date());
		// rm.setReligion("Islam");
		rm.setSecondaryIns(secins);
		rm.setSecondaryInsId(secinsid);
		rm.setSs1(ssnumber);
		rm.setSs2("");
		rm.setSs3("");
		// rm.setState("New York");
		// rm.setType("Active");
		rm.setVa(1);
		rm.setWork(workphone);
		rm.setZip(zip);
		rm.setCity(city);

		try {
			return Global.medrexServer.insertOrUpdateResidentMain(rm);
		} catch (Exception e) {
			return 0;
		}
	}

	private static void insertResidentPayer(int residentId, String authcode,
			String payertype) {

		ResidentPayer rp = new ResidentPayer();
		ResidentMain res = new ResidentMain();
		res.setSerial(residentId);
		rp.setResidentId(res);
		// rp.setResidentId(Global.currentResidenceKey);
		rp.setAuthorizationCode(authcode);
		rp.setEffectiveDate(new Date());
		rp.setEndDate(new Date());
		// rp.setPayerType(payertype);

		try {
			Global.medrexServer.insertOrUpdateResidentPayer(rp);
		} catch (Exception er) {

		}

	}

	private static int insertResidentContact(int residentId, String address,
			String city, String email, String firstname, String lastname,
			String notes, String relation, String zip) {
		ResidentContact rc = new ResidentContact();
		// rc.setResidentId(Global.currentResidenceKey);
		// rc.setResidentId(residentId);
		rc.setAddress(address);
		rc.setCity(city);
		rc.setEmail(email);
		rc.setFirstName(firstname);
		rc.setLastName(lastname);
		rc.setNotes(notes);
		// rc.setRelationship(relation);
		rc.setZip(zip);
		// rc.setSex("Male");
		// rc.setState("New York");

		try {
			return Global.medrexServer.insertOrUpdateResidentContact(rc);
		} catch (Exception er) {

		}
		return 0;
	}

	private static void insertResidentContactPhone(int contactId, String phone,
			String type) {
		ResidentContactPhone rcp = new ResidentContactPhone();
		// rcp.setContactId(Global.currentcontactKey);
		// rcp.setContactId(contactId);
		rcp.setNumber(phone);
		PhoneType ph = new PhoneType();
		ph.setMsterName(type);
		rcp.setType(ph);
		rcp.setIsPrimary(1);

		try {
			Global.medrexServer.insertOrUpdateResidentContactPhone(rcp);
		} catch (Exception er) {

		}
	}

	private static void insertProviderRecord(int residentId, String name,
			String lastname, String type, String phone) {
		ProvidersRecord pr = new ProvidersRecord();
		ProvidersRecordForm prf = new ProvidersRecordForm();
		prf.setProviderName(name);
		prf.setProviderSurName(lastname);
		// prf.setProviderType(type);
		prf.setPhoneNumber(phone);
		try {
			Global.medrexServer.insertOrUpdateProvidersRecordForm(prf);
		} catch (Exception ed) {

		}
		pr.setProvider(pr.getProvider());
		try {
			Global.medrexServer.insertOrUpdateProvidersRecord(pr);
		} catch (Exception ef) {

		}

	}

	private static void insertSecurityRoleAdmin() {

		SecurityRole securityRole = new SecurityRole();
		securityRole.setName("admin");

		securityRole.setAccessActivity(2);
		securityRole.setAccessAdmissionRecords(2);
		securityRole.setAccessCareLog(2);
		securityRole.setAccessCarePlan(2);
		securityRole.setAccessCensus(2);
		securityRole.setAccessCNA(2);
		securityRole.setAccessConsultant(2);
		securityRole.setAccessDietary(2);
		securityRole.setAccessHistoryPhysical(2);
		securityRole.setAccessLabSpecialReports(2);
		securityRole.setAccessMDS(2);
		securityRole.setAccessMedicationCart(2);
		securityRole.setAccessMedicationTreatment(2);
		securityRole.setAccessOtPtActSpeech(2);
		securityRole.setAccessPhysicianOrders(2);
		securityRole.setAccessProgressNotes(2);
		securityRole.setAccessProviders(2);
		securityRole.setAccessReports(2);

		try {
			Global.medrexServer.insertOrUpdatedSecurityRole(securityRole);
		} catch (Exception e) {

		}

	}

	private static void insertSecurityRoleNurse() {

		SecurityRole securityRole = new SecurityRole();
		securityRole.setName("medicationnurse");
		securityRole.setAccessMedicationTreatment(2);
		securityRole.setAccessMedicationCart(2);

		try {
			Global.medrexServer.insertOrUpdatedSecurityRole(securityRole);
		} catch (Exception e) {

		}

	}

	private static void insertSecurityRoleCNA() {

		SecurityRole securityRole = new SecurityRole();
		securityRole.setName("cna");

		securityRole.setAccessCNA(2);

		try {
			Global.medrexServer.insertOrUpdatedSecurityRole(securityRole);
		} catch (Exception e) {

		}

	}

	private static void insertSecurityRoleGeneral() {

		SecurityRole securityRole = new SecurityRole();
		securityRole.setName("general");

		securityRole.setAccessActivity(1);
		securityRole.setAccessAdmissionRecords(1);
		securityRole.setAccessCareLog(1);
		securityRole.setAccessCarePlan(1);
		securityRole.setAccessCensus(1);
		securityRole.setAccessCNA(1);
		securityRole.setAccessConsultant(1);
		securityRole.setAccessDietary(1);
		securityRole.setAccessHistoryPhysical(1);
		securityRole.setAccessLabSpecialReports(1);
		securityRole.setAccessMDS(1);
		securityRole.setAccessMedicationCart(1);
		securityRole.setAccessMedicationTreatment(1);
		securityRole.setAccessOtPtActSpeech(1);
		securityRole.setAccessPhysicianOrders(1);
		securityRole.setAccessProgressNotes(1);
		securityRole.setAccessProviders(1);
		securityRole.setAccessReports(1);

		try {
			Global.medrexServer.insertOrUpdatedSecurityRole(securityRole);
		} catch (Exception e) {

		}

	}

	private static void insertTemplateText() {
		insertTmpText("This is the 1st Template.");
		insertTmpText("This is the 2nd Template.");
		insertTmpText("This is the 3rd Template.");
		insertTmpText("This is the 4th Template.");
		insertTmpText("This is the 5th Template.");
	}

	public static void insertMaritalStatus() {
		insertMaritalStatusData("Married");
		insertMaritalStatusData("Single");
		insertMaritalStatusData("Separated");
		insertMaritalStatusData("Divorced");
		insertMaritalStatusData("Widowed");
		insertMaritalStatusData("Never Married");
		insertMaritalStatusData("Unknown");
		insertMaritalStatusData("Living With Partner");
		insertMaritalStatusData("Other");
	}

	public static void insertEmpty() {
		insertEmptyString("");
	}

	public static void insertState() {
		insertStateData("Alabama");
		insertStateData("Alaska");
		insertStateData("Arizona");
		insertStateData("Arkansas");
		insertStateData("California");
		insertStateData("Colorado");
		insertStateData("Connecticut");
		insertStateData("Delaware");
		insertStateData("Florida");
		insertStateData("Georgia");
		insertStateData("Hawaii");
		insertStateData("Idaho");
		insertStateData("Illinois");
		insertStateData("Indiana");
		insertStateData("Iowa");
		insertStateData("Kansas");
		insertStateData("Kentucky");
		insertStateData("Louisiana");
		insertStateData("Maine");
		insertStateData("Maryland");
		insertStateData("Massachusetts");
		insertStateData("Michigan");
		insertStateData("Minnesota");
		insertStateData("Mississippi");
		insertStateData("Missouri");
		insertStateData("Montana");
		insertStateData("Nebraska");
		insertStateData("Nevada");
		insertStateData("New Hampshire");
		insertStateData("New Jersey");
		insertStateData("New Mexico");
		insertStateData("New York");
		insertStateData("North Carolina");
		insertStateData("North Dakota");
		insertStateData("Ohio");
		insertStateData("Oklahoma");
		insertStateData("Oregon");
		insertStateData("Pennsylvania");
		insertStateData("Rhode Island");
		insertStateData("South Carolina");
		insertStateData("South Dakota");
		insertStateData("Tennessee");
		insertStateData("Texas");
		insertStateData("Utah");
		insertStateData("Vermont");
		insertStateData("Virginia");
		insertStateData("Washington");
		insertStateData("West Virginia");
		insertStateData("Wisconsin");
		insertStateData("Wyoming");

	}

	public static void insertSex() {
		insertSexData("Male");
		insertSexData("Female");
	}

	public static void insertCitizen() {
		insertCitizenData("US CITIZEN");
		insertCitizenData("NON US CITIZEN");
	}

	public static void insertReligion() {
		insertReligionData("ADVENTIS");
		insertReligionData("APOSTOLIC");
		insertReligionData("Baptist");
		insertReligionData("Catholic");
		insertReligionData("PENTECOSTAL");
		insertReligionData("Protestant");
		insertReligionData("NonSectarian");
		insertReligionData("Methodist");
		insertReligionData("Jewish");
		insertReligionData("Muslim");
		insertReligionData("None");
		insertReligionData("Single");
		insertReligionData("Unknown");
		insertReligionData("Christian");
		insertReligionData("Lutheran");
		insertReligionData("Episcopal");
		insertReligionData("GREEK ORTHODOX");
		insertReligionData("Other");
	}

	public static void insertLanguage() {
		insertLanguageData("English");
		insertLanguageData("Spanish");
		insertLanguageData("Other");
	}

	public static void insertOrigin() {
		insertOriginData("Hispanic");
		insertOriginData("Black, not of Hispanic origin");
		insertOriginData("White, not of Hispanic origin");
		insertOriginData("Other");
	}

	public static void insertStatus() {
		insertStatusData("Active");
		insertStatusData("Inactive");
	}

	public static void insertCounty() {
		insertCountyData("UNION");
		insertCountyData("ESSEX");
		insertCountyData("HUNTERDON");
		insertCountyData("SOMERSET");
	}

	public static void insertPayerType() {
		insertPayerTypeData("Private");
		insertPayerTypeData("Commercial");
		insertPayerTypeData("Medicaid");
		insertPayerTypeData("Medicare");
		insertPayerTypeData("Hospice");
		insertPayerTypeData("Respit");
	}

	public static void insertPayerResponsibleParty() {
		insertResponsiblePartyData("Party1");
		insertResponsiblePartyData("Party2");
		insertResponsiblePartyData("Party3");
	}

	public static void insertInsurance() {
		insertInsuranceData("Insurance1");
		insertInsuranceData("Insurance2");
		insertInsuranceData("Insurance3");
	}

	public static void insertMedicareDays() {
		insertMedicareDaysData("1");
		insertMedicareDaysData("2");
		insertMedicareDaysData("3");
		insertMedicareDaysData("4");
		insertMedicareDaysData("5");
		insertMedicareDaysData("6");
		insertMedicareDaysData("7");
		insertMedicareDaysData("8");
		insertMedicareDaysData("9");
		insertMedicareDaysData("10");
	}

	public static void insertRelation() {
		insertRelationData("AUNT");
		insertRelationData("BOY FRIEND");
		insertRelationData("BROTHER");
		insertRelationData("BROTHER IN LAW");
		insertRelationData("CASE MANAGER");
		insertRelationData("COMMON LAW WIFE");
		insertRelationData("COUSIN");
		insertRelationData("COUSIN-IN-LAW");
		insertRelationData("DAUGHER");
		insertRelationData("DAUGHTER");
		insertRelationData("DAUGHTER IN LAW");
		insertRelationData("DETECTIVE");
		insertRelationData("EX BROTHER IN-LAW");
		insertRelationData("EX-HUSBAND");
		insertRelationData("FATHER");
		insertRelationData("FRIEND");
		insertRelationData("GIRL FRIEND");
		insertRelationData("GODFATHER");
		insertRelationData("GRANDDAUGHTER");
		insertRelationData("GRANDSON");
		insertRelationData("GUARDIAN");
		insertRelationData("LANDLADY");
		insertRelationData("LAWYER");
		insertRelationData("LEGAL GUARDIAN");
		insertRelationData("MOTHER");
		insertRelationData("NEIGHBOR");
		insertRelationData("NEPHEW");
		insertRelationData("NEPHEW IN LAW");
		insertRelationData("NIECE");
		insertRelationData("OTHER");
		insertRelationData("PASTER");
		insertRelationData("SELF");
		insertRelationData("SISTER");
		insertRelationData("SISTER-IN-LAW");
		insertRelationData("SOCIAL WORKER");
		insertRelationData("SON");
		insertRelationData("SON IN LAW");
		insertRelationData("SPOUSE");
		insertRelationData("STEP DAUGHTER");
		insertRelationData("STEPSON");
		insertRelationData("TWIN BROTHER");
		insertRelationData("UNCLE");
		insertRelationData("WIFE");
	}

	public static void insertPhoneTypes() {
		insertPhoneTypesData("HandPhone");
		insertPhoneTypesData("Landline(Home)");
		insertPhoneTypesData("Landline(Office)");
	}

	public static void insertProviderTypes() {
		insertProviderTypesData("AMBULANCE");
		insertProviderTypesData("EMPLOYER");
		insertProviderTypesData("FUNERAL");
		insertProviderTypesData("HOSPITAL");
		insertProviderTypesData("MORTUARY");
		insertProviderTypesData("PHARMACY");
	}

	public static void insertDoctorTypes() {
		insertDoctorTypesData("ALT_PHYS");
		insertDoctorTypesData("CLERGY");
		insertDoctorTypesData("DENTIST");
		insertDoctorTypesData("OPHTH");
		insertDoctorTypesData("PHYS");
		insertDoctorTypesData("Physicians");
		insertDoctorTypesData("PODIATRIST");
		insertDoctorTypesData("PSYCH");
	}

	private static void insertDoctorTypesData(String str) {
		DoctorTypes dTypes = new DoctorTypes();
		dTypes.setMsterName(str);
		try {
			Global.medrexServer.insertOrUpdateMasterListRecord(dTypes);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void insertProviderTypesData(String str) {
		ProviderTypes providerTypes = new ProviderTypes();
		providerTypes.setMsterName(str);
		try {
			Global.medrexServer.insertOrUpdateMasterListRecord(providerTypes);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void insertPhoneTypesData(String str) {
		PhoneType ph = new PhoneType();
		ph.setMsterName(str);
		try {
			Global.medrexServer.insertOrUpdateMasterListRecord(ph);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void insertRelationData(String str) {
		Relation rel = new Relation();
		rel.setMsterName(str);
		try {
			Global.medrexServer.insertOrUpdateMasterListRecord(rel);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void insertMedicareDaysData(String str) {
		MedicareDays medDays = new MedicareDays();
		medDays.setMsterName(str);
		try {
			Global.medrexServer.insertOrUpdateMasterListRecord(medDays);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void insertInsuranceData(String str) {
		Insurance ins = new Insurance();
		ins.setMsterName(str);
		try {
			Global.medrexServer.insertOrUpdateMasterListRecord(ins);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void insertResponsiblePartyData(String str) {
		PayerResponsibleParty resParty = new PayerResponsibleParty();
		resParty.setMsterName(str);
		try {
			Global.medrexServer.insertOrUpdateMasterListRecord(resParty);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void insertPayerTypeData(String str) {
		PayerType payerType = new PayerType();
		payerType.setMsterName(str);
		try {
			Global.medrexServer.insertOrUpdateMasterListRecord(payerType);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void insertCountyData(String str) {
		County county = new County();
		county.setMsterName(str);
		try {
			Global.medrexServer.insertOrUpdateMasterListRecord(county);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void insertStatusData(String str) {
		Status st = new Status();
		st.setMsterName(str);
		try {
			Global.medrexServer.insertOrUpdateMasterListRecord(st);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void insertOriginData(String str) {
		Origin or = new Origin();
		or.setMsterName(str);
		try {
			Global.medrexServer.insertOrUpdateMasterListRecord(or);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void insertLanguageData(String str) {
		Language lang = new Language();
		lang.setMsterName(str);
		try {
			Global.medrexServer.insertOrUpdateMasterListRecord(lang);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void insertReligionData(String str) {
		Religion religion = new Religion();
		religion.setMsterName(str);
		try {
			Global.medrexServer.insertOrUpdateMasterListRecord(religion);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void insertCitizenData(String str) {
		Citizen citizen = new Citizen();
		citizen.setMsterName(str);
		try {
			Global.medrexServer.insertOrUpdateMasterListRecord(citizen);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void insertSexData(String str) {
		Sex s = new Sex();
		s.setMsterName(str);
		try {
			Global.medrexServer.insertOrUpdateMasterListRecord(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void insertStateData(String str) {
		State st = new State();
		st.setMsterName(str);
		try {
			Global.medrexServer.insertOrUpdateMasterListRecord(st);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void insertMaritalStatusData(String str) {
		MaritalStatus ms = new MaritalStatus();
		ms.setMsterName(str);
		try {
			Global.medrexServer.insertOrUpdateMasterListRecord(ms);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void insertEmptyString(String str) {
		EmptyComboItem item = new EmptyComboItem();
		item.setMsterName(str);
		try {
			Global.medrexServer.insertOrUpdateMasterListRecord(item);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void insertTmpText(String str) {
		Templates templates = new Templates();
		templates.setTemplateText(str);
		try {
			Global.medrexServer.insertOrUpdateTemplates(templates);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * public static MasterList getMasterList(String class1, String
	 * retrieveString) { MasterList ml = null; try { ml =
	 * Global.medrexServer.getMasterList(class1, retrieveString); } catch
	 * (Exception e) { e.printStackTrace(); } return ml; }
	 */

}
