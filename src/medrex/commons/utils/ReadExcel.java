package medrex.commons.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import medrex.commons.vo.census.AdmissionFromSubHead;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.general.Icd9;
import medrex.commons.vo.masterList.Citizen;
import medrex.commons.vo.masterList.County;
import medrex.commons.vo.masterList.DoctorTypes;
import medrex.commons.vo.masterList.Language;
import medrex.commons.vo.masterList.MaritalStatus;
import medrex.commons.vo.masterList.Origin;
import medrex.commons.vo.masterList.PhoneType;
import medrex.commons.vo.masterList.ProviderTypes;
import medrex.commons.vo.masterList.Relation;
import medrex.commons.vo.masterList.Religion;
import medrex.commons.vo.masterList.Sex;
import medrex.commons.vo.masterList.State;
import medrex.commons.vo.masterList.Status;
import medrex.commons.vo.others.Doctors;
import medrex.commons.vo.providers.ProvidersRecordForm;
import medrex.commons.vo.resident.ResidentContact;
import medrex.commons.vo.resident.ResidentContactPhone;
import medrex.commons.vo.resident.ResidentMain;
import medrex.server.constants.Global;

/**
 * @author D S Naruka
 */
public class ReadExcel {
	private int id = 0;
	private String xlsPath;
	private static final String DRIVER_NAME = "sun.jdbc.odbc.JdbcOdbcDriver";
	private static final String[][] STATES_ARR = new String[][] {
			{ "AK", "Alaska" }, { "AZ", "Arizona" }, { "CA", "California" },
			{ "CO", "Colorado" }, { "FL", "Florida" }, { "GA", "Georgia" },
			{ "IL", "Illinois" }, { "MA", "Massachusetts" },
			{ "MD", "Maryland" }, { "MO", "Missouri" },
			{ "NC", "North Carolina" }, { "NJ", "New Jersey" },
			{ "NV", "Nevada" }, { "NY", "New York" }, { "PA", "Pennsylvania" },
			{ "TX", "Texas" }, { "VA", "Virginia" }, { "WA", "Washington" } };
	private static final Map<String, String> STATES;

	static {
		STATES = new HashMap<String, String>();

		for (int i = 0; i < STATES_ARR.length; i++) {
			STATES.put(STATES_ARR[i][0], STATES_ARR[i][1]);
		}
	}

	public ReadExcel() {
		this("");
	}

	public ReadExcel(String xlsPath) {
		super();
		this.xlsPath = xlsPath;
	}

	private Connection getConnection() {
		try {
			Class.forName(DRIVER_NAME);
			File xlsFile = new File(xlsPath);
			String url = "";
			Connection con = null;

			if (xlsFile != null) {
				url = "jdbc:odbc:Driver={Microsoft Excel Driver (*.xls)};DBQ="
						+ xlsFile.getAbsolutePath()
						+ ";DriverID=22;READONLY=false";
			}
			if (!("").equalsIgnoreCase(url)) {
				try {
					con = DriverManager.getConnection(url);
					return con;
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<ResidentMain> getResidents() {
		Connection con = getConnection();
		Statement stmt = null;
		List<ResidentMain> list = new ArrayList<ResidentMain>();
		if (con != null) {
			try {
				stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from [Sheet1$]");

				while (rs.next()) {
					ResidentMain resident = new ResidentMain();
					/* TODO: Migrating to room history */
					// resident.setFloorType("1st floor south wing");
					resident.setUserPass(retrieveString(rs
							.getString("LAST_NAME")));
					resident.setUserName(retrieveString(rs
							.getString("FIRST_NAME"))
							+ retrieveString(rs.getString("MIDDLE_NAME")));
					resident.setNickName(retrieveString(rs
							.getString("PREFERRED_NAME")));

					String sex = rs.getString("SEX");
					if (sex != null && !("").equalsIgnoreCase(sex)) {
						if (sex.startsWith("M")) {
							sex = "Male";
						} else {
							sex = "Female";
						}
					}
					try {
						id = Global.medrexServer.getMasterList(Sex.class, sex);
					} catch (Exception e) {
						e.printStackTrace();
					}
					Sex s = new Sex();
					s.setId(id);
					resident.setSex(s);

					resident.setSs1(retrieveString(rs.getString("SSN")));
					resident
							.setAddress(retrieveString(rs.getString("ADDRESS1"))
									+ " "
									+ retrieveString(rs.getString("ADDRESS2")));
					resident.setCity(retrieveString(rs.getString("CITY")));

					// resident.setState(retrieveState(rs.getString("STATE")));
					try {
						String state = retrieveState(rs.getString("STATE"));
						id = Global.medrexServer.getMasterList(State.class,
								state);
					} catch (Exception e) {
						e.printStackTrace();
					}
					State st = new State();
					st.setId(id);
					resident.setState(st);
					String zip = retrieveZip(rs.getInt("ZIP"));
					if (zip.length() == 4) {
						zip = "0" + zip;
					}
					resident.setZip(zip);
					resident.setDob(rs.getDate("BIRTH_DATE"));
					resident.setMedicaidNum(retrieveString(rs
							.getString("MEDICAID_NUMBER")));
					resident.setMedicareNum(retrieveString(rs
							.getString("MEDICARE_NUMBER")));

					int citizen = rs.getInt("US_CITIZEN");
					String str = null;
					if (citizen == 1) {
						str = "US CITIZEN";
					} else {
						str = "NON US CITIZEN";
					}
					try {
						id = Global.medrexServer.getMasterList(Citizen.class,
								str);
					} catch (Exception e) {
						e.printStackTrace();
					}
					Citizen c = new Citizen();
					c.setId(id);
					resident.setCitizen(c);

					resident.setBirthPlace(retrieveString(rs
							.getString("BIRTH_PLACE")));

					// resident.setCounty(retrieveString(rs.getString("COUNTY")));
					try {
						String county = retrieveString(rs.getString("COUNTY"));
						id = Global.medrexServer.getMasterList(County.class,
								county);
					} catch (Exception e) {
						e.printStackTrace();
					}
					County county = new County();
					county.setId(id);
					resident.setCounty(county);

					resident.setInsuranceNum(retrieveString(rs
							.getString("OTHER_INS1_NUMBER")));
					resident.setSecondaryIns(retrieveString(rs
							.getString("OTHER_INS2_NUMBER")));

					// resident.setReligion(retrieveString(rs.getString("DESCRIPTION1")));
					try {
						String religion = retrieveString(rs
								.getString("DESCRIPTION1"));
						id = Global.medrexServer.getMasterList(Religion.class,
								religion);
					} catch (Exception e) {
						e.printStackTrace();
					}
					Religion religion = new Religion();
					religion.setId(id);
					resident.setReligion(religion);

					// System.out.println("===============:"+retrieveString(rs.getString("DESCRIPTION2")));
					try {
						String marital = retrieveString(rs
								.getString("DESCRIPTION2"));
						id = Global.medrexServer.getMasterList(
								MaritalStatus.class, marital);
					} catch (Exception e) {
						e.printStackTrace();
					}
					MaritalStatus ms = new MaritalStatus();
					ms.setId(id);
					resident.setMaritalStatus(ms);

					// served in army
					int servedInArmy = rs.getInt("SERVED_IN_ARMY");
					resident.setServedInArmy(servedInArmy);

					// additional info
					resident.setAdditionalInfo(retrieveString(rs
							.getString("ADDITIONAL_INFO")));

					// language
					// resident.setLanguage(retrieveString(rs.getString("DESCRIPTION3")));
					try {
						String language = retrieveString(rs
								.getString("DESCRIPTION3"));
						id = Global.medrexServer.getMasterList(Language.class,
								language);
					} catch (Exception e) {
						e.printStackTrace();
					}
					Language l = new Language();
					l.setId(id);
					resident.setLanguage(l);

					// resident.setOrigin(retrieveString(rs.getString("DESCRIPTION4")));
					try {
						String origion = retrieveString(rs
								.getString("DESCRIPTION4"));
						id = Global.medrexServer.getMasterList(Origin.class,
								origion);
					} catch (Exception e) {
						e.printStackTrace();
					}
					Origin or = new Origin();
					or.setId(id);
					resident.setOrigin(or);

					// resident.setType("Active");
					try {
						id = Global.medrexServer.getMasterList(Status.class,
								"Active");
					} catch (Exception e) {
						e.printStackTrace();
					}
					Status sts = new Status();
					sts.setId(id);
					resident.setType(sts);

					list.add(resident);
				}
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	public List<Icd9> getIcd9Codes() {
		Connection con = getConnection();
		Statement stmt = null;
		List<Icd9> list = new ArrayList<Icd9>();
		if (con != null) {
			try {
				stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from [Sheet3$]");
				int i = 0;
				while (rs.next()) {
					Icd9 resident = new Icd9();
					String str = retrieveString(rs.getString("ICD9_CODE"));
					if (str.charAt(0) == '0')
						str = str.substring(1);
					if (str.charAt(0) == '0')
						str = str.substring(1);
					resident.setCode(str);
					resident
							.setName(retrieveString(rs.getString("DESCRIPTION")));

					list.add(resident);
					if (i++ > 100) {
						break;
					}
				}
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	public void getMedications() throws FileNotFoundException {
		Connection con = getConnection();
		Statement stmt = null;

		if (con != null) {
			try {

				File f = new File("c:\\insertQuery.txt");
				FileOutputStream fop = new FileOutputStream(f);
				stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from [Sheet1$]");
				int i = 0;
				while (rs.next()) {

					String ndc = retrieveString(rs.getString("NDC"));
					// String Facility =
					// retrieveString(rs.getString("Facility"));
					String ProdName = retrieveString(rs.getString("ProdName"));
					String ProdDescAbbr = retrieveString(rs
							.getString("ProdDescAbbr"));
					String RouteName = retrieveString(rs.getString("RouteName"));
					String cautionary = retrieveString(rs
							.getString("Cautionary"));

					String sql = "INSERT INTO medication ( " + "      ndc "
							+ "    , code " + "    , coustionary "
							+ "    , description " + "    , name "
							+ "    , routeName) " + "  Values (" + "   " + ndc
							+ "" + "  , " + null + "" + "  , '" + cautionary
							+ "'" + "  , '" + ProdDescAbbr + "'" + "  , '"
							+ ProdName + "'" + "  , '" + RouteName + "');";

					if (!sql.contains("\n")) {

						if (f.exists()) {
							try {
								sql = sql + "\r\n";
								fop.write(sql.getBytes());
							} catch (IOException e) {
								e.printStackTrace();
							}
						}
					} else {
						System.out.println("line space");
					}

					System.out.println(sql);

					if (i++ > 1000) {
						// break;
					}
				}
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public List<Object[]> getResidentIcd9Codes() {
		Connection con = getConnection();
		Statement stmt = null;
		List<Object[]> list = new ArrayList<Object[]>();
		if (con != null) {
			try {
				stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from [Sheet4$]");
				while (rs.next()) {

					Object[] obj = new Object[3];
					obj[0] = retrieveString(rs.getString("ICD9_CODE"));
					// System.out.println("rs "+ obj[0].toString());
					obj[1] = retrieveString(rs.getString("ONSET_DATE"));
					obj[2] = retrieveString(rs.getString("SSN"));
					// System.out.println("ssn "+ obj[2].toString());
					list.add(obj);
				}
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	public List<Object[]> getResidentPhysicians() {
		Connection con = getConnection();
		Statement stmt = null;
		List<Object[]> list = new ArrayList<Object[]>();
		if (con != null) {
			try {
				stmt = con.createStatement();
				ResultSet rs = stmt
						.executeQuery("select FIRST_NAME, LAST_NAME, SSN, TYPE_CODE, Contact_FIRST_NAME, Contact_LAST_NAME"
								+ " from [Sheet5$]"
								+ " WHERE (TYPE_CODE<>'FUNERAL' AND TYPE_CODE<>'HOSPITAL' AND TYPE_CODE<>'PHARMACY' AND TYPE_CODE<>'AMBULANCE' AND TYPE_CODE<>'EMPLOYER' AND TYPE_CODE<>'MORTUARY')");

				while (rs.next()) {
					Object[] resiPhys = new Object[6];
					resiPhys[0] = retrieveString(rs.getString("FIRST_NAME"));
					resiPhys[1] = retrieveString(rs.getString("LAST_NAME"));
					resiPhys[2] = retrieveString(rs.getString("SSN"));
					resiPhys[3] = retrieveString(rs.getString("TYPE_CODE"));
					resiPhys[4] = retrieveString(rs
							.getString("Contact_FIRST_NAME"));
					resiPhys[5] = retrieveString(rs
							.getString("Contact_LAST_NAME"));

					list.add(resiPhys);
				}
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	public List<Doctors> getPhysicians() {
		Connection con = getConnection();
		Statement stmt = null;
		List<Doctors> list = new ArrayList<Doctors>();
		if (con != null) {
			try {
				stmt = con.createStatement();
				ResultSet rs = stmt
						.executeQuery("SELECT TYPE_CODE, Contact_FIRST_NAME, Contact_LAST_NAME, NPI, UPIN, ADDRESS1, ADDRESS2, CITY, STATE, ZIP"
								+ " from [Sheet5$] GROUP BY TYPE_CODE, Contact_FIRST_NAME, Contact_LAST_NAME, NPI, UPIN, ADDRESS1, ADDRESS2, CITY, STATE, ZIP "
								+ " HAVING (TYPE_CODE<>'FUNERAL' AND TYPE_CODE<>'HOSPITAL' AND TYPE_CODE<>'PHARMACY' AND TYPE_CODE<>'AMBULANCE' AND TYPE_CODE<>'EMPLOYER' AND TYPE_CODE<>'MORTUARY')");

				while (rs.next()) {
					Doctors doctor = new Doctors();
					doctor.setPhysicianName(retrieveString(rs
							.getString("Contact_FIRST_NAME")));
					doctor.setPhysicianSurName(retrieveString(rs
							.getString("Contact_LAST_NAME")));
					doctor.setNpi(retrieveString(rs.getString("NPI")));
					doctor.setAddress(retrieveString(rs.getString("ADDRESS1"))
							+ " " + retrieveString(rs.getString("ADDRESS2")));
					doctor.setCity(retrieveString(rs.getString("CITY")));

					// doctor.setState(retrieveState(rs.getString("STATE")));
					String strstate = null;
					try {
						strstate = retrieveState(rs.getString("STATE"));
						strstate = retrieveState(strstate);
						id = Global.medrexServer.getMasterList(State.class,
								strstate);
					} catch (Exception e) {
						e.printStackTrace();
					}
					State st = new State();
					st.setId(id);
					if (id == 0) {
						doctor.setState(null);
					} else {
						doctor.setState(st);
					}

					String zip = retrieveZip(rs.getInt("ZIP"));
					if (zip.length() == 4) {
						zip = "0" + zip;
					}
					doctor.setZip(zip);
					// doctor.setDoctorType(retrieveString(rs.getString("TYPE_CODE")));
					String strDoctorType = null;
					try {
						strDoctorType = retrieveString(rs
								.getString("TYPE_CODE"));
						id = Global.medrexServer.getMasterList(
								DoctorTypes.class, strDoctorType);
					} catch (Exception e) {
						e.printStackTrace();
					}
					DoctorTypes dt = new DoctorTypes();
					dt.setId(id);
					if (id == 0) {
						doctor.setDoctorType(null);
					} else {
						doctor.setDoctorType(dt);
					}

					// missing fields
					// UPIN
					list.add(doctor);
				}
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	public List<ProvidersRecordForm> getProviders() {
		Connection con = getConnection();
		Statement stmt = null;
		List<ProvidersRecordForm> list = new ArrayList<ProvidersRecordForm>();
		if (con != null) {
			try {
				stmt = con.createStatement();
				ResultSet rs = stmt
						.executeQuery("SELECT TYPE_CODE, Contact_FIRST_NAME, Contact_LAST_NAME, NPI, UPIN, ADDRESS1, ADDRESS2, CITY, STATE, ZIP"
								+ " from [Sheet5$] GROUP BY TYPE_CODE, Contact_FIRST_NAME, Contact_LAST_NAME, NPI, UPIN, ADDRESS1, ADDRESS2, CITY, STATE, ZIP "
								+ " HAVING (TYPE_CODE='FUNERAL' OR TYPE_CODE='HOSPITAL' OR TYPE_CODE='PHARMACY' OR TYPE_CODE='AMBULANCE' OR TYPE_CODE='EMPLOYER' OR TYPE_CODE='MORTUARY')");

				while (rs.next()) {
					ProvidersRecordForm provider = new ProvidersRecordForm();
					provider.setProviderName(retrieveString(rs
							.getString("Contact_FIRST_NAME")));
					provider.setProviderSurName(retrieveString(rs
							.getString("Contact_LAST_NAME")));
					provider.setNpi(retrieveString(rs.getString("NPI")));
					provider
							.setAddress(retrieveString(rs.getString("ADDRESS1"))
									+ " "
									+ retrieveString(rs.getString("ADDRESS2")));
					provider.setCity(retrieveString(rs.getString("CITY")));

					// provider.setState(retrieveState(rs.getString("STATE")));
					String strstate = null;
					try {
						strstate = retrieveString(rs.getString("STATE"));
						strstate = retrieveState(strstate);
						id = Global.medrexServer.getMasterList(State.class,
								strstate);
					} catch (Exception e) {
						e.printStackTrace();
					}
					State state = new State();
					state.setId(id);
					if (id == 0) {
						provider.setState(null);
					} else {
						provider.setState(state);
					}

					String zip = retrieveZip(rs.getInt("ZIP"));
					if (zip.length() == 4) {
						zip = "0" + zip;
					}
					provider.setZip(zip);
					// provider.setProviderType(retrieveString(rs.getString("TYPE_CODE")));
					String strProviderType = null;
					try {
						strProviderType = retrieveString(rs
								.getString("TYPE_CODE"));
						id = Global.medrexServer.getMasterList(
								ProviderTypes.class, strProviderType);
					} catch (Exception e) {
						e.printStackTrace();
					}
					ProviderTypes ptype = new ProviderTypes();
					ptype.setId(id);
					if (id == 0) {
						provider.setProviderType(null);
					} else {
						provider.setProviderType(ptype);
					}

					// missing fields
					// UPIN

					list.add(provider);
				}
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	public List<Object[]> getResidentProviders() {
		Connection con = getConnection();
		Statement stmt = null;
		List<Object[]> list = new ArrayList<Object[]>();
		if (con != null) {
			try {
				stmt = con.createStatement();
				ResultSet rs = stmt
						.executeQuery("select FIRST_NAME, LAST_NAME, SSN, TYPE_CODE, ADDRESS1, ADDRESS2, CITY"
								+ " from [Sheet5$]"
								+ " WHERE (TYPE_CODE='FUNERAL' OR TYPE_CODE='HOSPITAL' OR TYPE_CODE='PHARMACY' OR TYPE_CODE='AMBULANCE' OR TYPE_CODE='EMPLOYER' OR TYPE_CODE='MORTUARY')");

				while (rs.next()) {
					Object[] resiPhys = new Object[6];
					resiPhys[0] = retrieveString(rs.getString("FIRST_NAME"));
					resiPhys[1] = retrieveString(rs.getString("LAST_NAME"));
					resiPhys[2] = retrieveString(rs.getString("SSN"));
					resiPhys[3] = retrieveString(rs.getString("TYPE_CODE"));
					resiPhys[4] = retrieveString(retrieveString(rs
							.getString("ADDRESS1"))
							+ " " + retrieveString(rs.getString("ADDRESS2")));
					resiPhys[5] = retrieveString(retrieveString(rs
							.getString("CITY")));

					list.add(resiPhys);
				}
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	public List<Object[]> getResidentContact() {
		Connection con = getConnection();
		Statement stmt = null;
		List<Object[]> list = new ArrayList<Object[]>();
		if (con != null) {
			try {
				stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from [Sheet2$]");

				while (rs.next()) {
					Object[] resiContact = new Object[3];
					resiContact[0] = retrieveString(rs.getString("FIRST_NAME"));
					resiContact[1] = retrieveString(rs.getString("LAST_NAME"));

					ResidentContact ctc = new ResidentContact();
					ctc.setFirstName(retrieveString(rs
							.getString("Personal_FIRST_NAME")));
					ctc.setLastName(retrieveString(rs
							.getString("Personal_LAST_NAME")));

					// ctc.setRelationship(retrieveString(rs.getString("DESCRIPTION")));
					try {
						String relation = retrieveString(rs
								.getString("DESCRIPTION"));
						id = Global.medrexServer.getMasterList(Relation.class,
								relation);
					} catch (Exception e) {
						e.printStackTrace();
					}
					Relation relation = new Relation();
					relation.setId(id);
					ctc.setRelationship(relation);

					ctc.setAddress(retrieveString(rs.getString("ADDRESS1"))
							+ " " + retrieveString(rs.getString("ADDRESS2")));
					ctc.setCity(retrieveString(rs.getString("CITY")));

					// ctc.setState(retrieveState(rs.getString("STATE")));
					String strstate = null;
					try {
						strstate = retrieveString(rs.getString("STATE"));
						strstate = retrieveState(strstate);
						id = Global.medrexServer.getMasterList(State.class,
								strstate);
					} catch (Exception e) {
						e.printStackTrace();
					}
					State state = new State();
					state.setId(id);
					if (id == 0) {
						ctc.setState(null);
					} else {
						ctc.setState(state);
					}

					ctc.setZip(retrieveZip(rs.getInt("ZIP")));

					// missing
					// TYPE_CODE,

					resiContact[2] = ctc;
					list.add(resiContact);
				}
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public List<Object[]> getResidentContactNew() {
		Connection con = getConnection();
		Statement stmt = null;
		List<Object[]> list = new ArrayList<Object[]>();
		if (con != null) {
			try {
				stmt = con.createStatement();
				System.out.println("select * from [Sheet7$]");
				ResultSet rs = stmt.executeQuery("select * from [Sheet7$]");

				while (rs.next()) {
					Object[] resiContact = new Object[5];
					resiContact[0] = retrieveString(rs.getString("FIRST_NAME"));
					resiContact[1] = retrieveString(rs.getString("LAST_NAME"));
					resiContact[2] = retrieveString(rs.getString("SSN"));

					ResidentContact ctc = new ResidentContact();
					ctc.setFirstName(retrieveString(rs
							.getString("CONTACT_FIRST_NAME")));
					ctc.setLastName(retrieveString(rs
							.getString("CONTACT_LAST_NAME")));

					try {
						String relation = retrieveString(rs
								.getString("DESCRIPTION"));
						id = Global.medrexServer.getMasterList(Relation.class,
								relation);
					} catch (Exception e) {
						e.printStackTrace();
					}
					Relation relation = new Relation();
					relation.setId(id);
					ctc.setRelationship(relation);

					ctc.setAddress(retrieveString(rs.getString("ADDRESS1")));
					ctc.setCity(retrieveString(rs.getString("CITY")));

					String strstate = null;
					try {
						strstate = retrieveString(rs.getString("STATE"));
						strstate = retrieveState(strstate);
						id = Global.medrexServer.getMasterList(State.class,
								strstate);
					} catch (Exception e) {
						e.printStackTrace();
					}
					State state = new State();
					state.setId(id);
					if (id == 0) {
						ctc.setState(null);
					} else {
						ctc.setState(state);
					}

					ctc.setZip(retrieveZip(rs.getInt("ZIP")));

					resiContact[3] = ctc;
					// phone contact
					ResidentContactPhone resContactPhone = new ResidentContactPhone();
					String phone = retrieveString(rs.getString("PHONE_NUMBER"));
					phone = phone.replace(".0", "");
					resContactPhone.setNumber(phone);
					try {
						String phoneType = retrieveString(rs
								.getString("PHONE_DESCRIPTION"));
						if (phoneType.equalsIgnoreCase("Home Phone")) {
							phoneType = "Landline(Home)";
						} else if (phoneType.equalsIgnoreCase("Office Phone")) {
							phoneType = "Landline(Office)";
						} else {
							phoneType = "HandPhone";
						}
						id = Global.medrexServer.getMasterList(PhoneType.class,
								phoneType);
					} catch (Exception e) {
						e.printStackTrace();
					}
					PhoneType phType = new PhoneType();
					phType.setId(id);
					resContactPhone.setType(phType);

					resiContact[4] = resContactPhone;

					list.add(resiContact);
				}
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public List<Object[]> getResidentCensus() {
		Connection con = getConnection();
		Statement stmt = null;
		List<Object[]> list = new ArrayList<Object[]>();
		if (con != null) {
			try {
				stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from [Sheet6$]");

				while (rs.next()) {
					Object[] refObjects = new Object[7];
					Object[] censusStatus;
					refObjects[0] = retrieveString(rs.getString(2));
					refObjects[1] = retrieveString(rs.getString(1));
					refObjects[2] = retrieveSsn(rs.getString(4));

					Date date = rs.getDate(7);
					String info = rs.getString(8);
					censusStatus = getCensusObject("Admission", date, info);
					if (censusStatus != null) {
						refObjects[3] = censusStatus[0];
						refObjects[4] = censusStatus[1];
					}

					date = rs.getDate(9);
					info = rs.getString(10);
					censusStatus = getCensusObject("Discharge", date, info);
					if (censusStatus != null) {
						refObjects[5] = censusStatus[0];
						refObjects[6] = censusStatus[1];
					}

					list.add(refObjects);
				}
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	private Object[] getCensusObject(String type, Date date, String info) {
		Object[] returnArr = new Object[2];
		CensusStatus refCensus = new CensusStatus();
		refCensus.setDateAndTime(date);
		refCensus.setTimestamp(date);
		refCensus.setAdministeredBy(1);

		if ("Admission".equalsIgnoreCase(type)) {
			refCensus.setTypeName("Admission");

			if (date != null) {
				if ("Hospital".equalsIgnoreCase(info)) {
					refCensus.setFromId(1);
					// AdmissionFromSubHead refAdmissionFromSubHead = new
					// AdmissionFromSubHead();
					// refAdmissionFromSubHead.setHeadId(1);
				} else if ("Home".equalsIgnoreCase(info)) {
					refCensus.setFromId(2);
					// AdmissionFromSubHead refAdmissionFromSubHead = new
					// AdmissionFromSubHead();
					// refAdmissionFromSubHead.setHeadId(2);
				} else if ("Other Facility".equalsIgnoreCase(info)) {
					refCensus.setFromId(3);
					// AdmissionFromSubHead refAdmissionFromSubHead = new
					// AdmissionFromSubHead();
					// refAdmissionFromSubHead.setHeadId(3);
				} else if ("Other".equalsIgnoreCase(info)) {
					refCensus.setFromId(4);
					// AdmissionFromSubHead refAdmissionFromSubHead = new
					// AdmissionFromSubHead();
					// refAdmissionFromSubHead.setHeadId(3);
				} else /* Other */{
					refCensus.setFromId(4);
					AdmissionFromSubHead refAdmissionFromSubHead = new AdmissionFromSubHead();
					refAdmissionFromSubHead.setHeadId(4);
					refAdmissionFromSubHead.setName(info);
					returnArr[1] = refAdmissionFromSubHead;
				}
			} else {
				return null;
			}
			returnArr[0] = refCensus;
		} else if ("Discharge".equalsIgnoreCase(type)) {
			refCensus.setTypeName("Discharge");
			refCensus.setDischargeType(1);

			if (date != null) {
				if ("Hospital".equalsIgnoreCase(info)) {
					refCensus.setFromId(1);
					// AdmissionFromSubHead refAdmissionFromSubHead = new
					// AdmissionFromSubHead();
					// refAdmissionFromSubHead.setHeadId(1);
				} else if ("Home".equalsIgnoreCase(info)) {
					refCensus.setFromId(2);
					// AdmissionFromSubHead refAdmissionFromSubHead = new
					// AdmissionFromSubHead();
					// refAdmissionFromSubHead.setHeadId(2);
				} else if ("Other Facility".equalsIgnoreCase(info)) {
					refCensus.setFromId(3);
					// AdmissionFromSubHead refAdmissionFromSubHead = new
					// AdmissionFromSubHead();
					// refAdmissionFromSubHead.setHeadId(3);
				} else if ("Other".equalsIgnoreCase(info)) {
					refCensus.setFromId(4);
					// AdmissionFromSubHead refAdmissionFromSubHead = new
					// AdmissionFromSubHead();
					// refAdmissionFromSubHead.setHeadId(3);
				} else /* Other */{
					refCensus.setFromId(4);
					AdmissionFromSubHead refAdmissionFromSubHead = new AdmissionFromSubHead();
					refAdmissionFromSubHead.setHeadId(4);
					refAdmissionFromSubHead.setName(info);
					returnArr[1] = refAdmissionFromSubHead;
				}
			} else {
				return null;
			}
			returnArr[0] = refCensus;
		} else {
			return null;
		}
		return returnArr;
	}

	private String retrieveString(String inStr) {
		if (inStr == null) {
			return "";
		} else {
			inStr = inStr.trim();
			if (inStr.equalsIgnoreCase("") || inStr.length() == 0) {
				return "";
			} else {
				return inStr;
			}
		}
	}

	private String retrieveSsn(String ssn) {
		ssn = retrieveString(ssn);
		if (ssn != null) {
			ssn = ssn.replaceAll("-", "");
			ssn = retrieveString(ssn);
		}
		return ssn;
	}

	private String retrieveState(String state) {
		state = retrieveString(state);
		if (state != null) {
			state = STATES.get(state);
			state = retrieveString(state);
		}
		return state;
	}

	private String retrieveZip(int zip) {
		if (zip != 0) {
			return zip + "";
		} else {
			return "";
		}
	}

	public static void main(String[] args) {
		System.out.println("Testinng");

		ReadExcel reader = new ReadExcel("Cautionary.xls");
		try {
			reader.getMedications();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
