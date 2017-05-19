package medrex.client.main.resident.census;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import medrex.client.constants.Global;
import medrex.commons.vo.census.AdmissionFromSubHead;
import medrex.commons.vo.census.AdmissionTransportation;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.others.Users;

public class CensusJTable extends AbstractTableModel {
	/**
	 *  
	 */
	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "Type", "Administered By", "Date", "Time",
			"From/To" };

	public List<CensusStatus> CensusStatusRecords;

	int n = 0;

	public CensusJTable(List<CensusStatus> CensusRecords) {
		CensusStatusRecords = CensusRecords;
	}

	public CensusJTable() {
		CensusStatusRecords = new ArrayList<CensusStatus>();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (CensusStatusRecords.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List<CensusStatus> CensusRecords) {
		CensusStatusRecords = CensusRecords;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			CensusStatus rc = CensusStatusRecords.get(row);
			SimpleDateFormat df = new SimpleDateFormat();
			// AdmissionFromHead afh = null;
			AdmissionFromSubHead afsh = null;
			AdmissionTransportation aft = null;
			String temp = null;
			Users u = null;

			if (col == 0) {
				if (rc.getTypeName().equalsIgnoreCase("Discharge")) {
					String t = "Discharge";
					if (rc.getDischargeType() == 1) {
						t += " : " + "Discharge";
					}
					if (rc.getDischargeType() == 2) {
						t += " : " + "E R";
					}
					if (rc.getDischargeType() == 3) {
						t += " : " + "Out Of Pass";
					}
					if (rc.getDischargeType() == 4) {
						t += " : " + "Expired";
					}
					return t;
				} else {
					if (rc.isEr()) {
						return rc.getTypeName() + " (ER)";
					}
					return (rc.getTypeName());
				}
			}
			if (col == 1) {
				// return "";
				// u =
				// MedrexClientManager.getInstance().getUser(rc.getAdministeredBy());
				u = Global.userMap.get(new Integer(rc.getAdministeredBy()));
				String abc = "";
				if (u != null) {
					abc = u.getUserName();
				}
				return abc;
			}
			if (col == 2) {
				df.applyPattern("MM / dd / yyyy");
				return (df.format(rc.getDateAndTime()) + "");
			}
			if (col == 3) {
				df.applyPattern("hh':'mm a");
				return (df.format(rc.getDateAndTime()) + "");
			}
			if (col == 4) {
				temp = "";
				// if (rc.getFromId() != 0) {
				// afh =
				// MedrexClientManager.getInstance().getAdmissionFromHead(rc.getFromId());
				// }
				// if (afh != null) {
				// temp += afh.getName();
				// }
				if (rc.getFromId() == 1) {
					temp += "Hospital";
				} else if (rc.getFromId() == 2) {
					temp += "Home";
				} else if (rc.getFromId() == 3) {
					temp += "Other Facility";
				} else if (rc.getFromId() == 4) {
					temp += "Other";
				}

				if (rc.getFromSubId() != 0) {
					// afsh =
					// MedrexClientManager.getInstance().getAdmissionFromSubHead(rc
					// .getFromSubId());

					afsh = Global.admissionFromSubHeadMap.get(new Integer(rc
							.getFromSubId()));
				}
				if (afsh != null) {
					temp += " : " + afsh.getName();
				}
				if (rc.getFromTransport() != 0) {
					// aft =
					// MedrexClientManager.getInstance().getAdmissionTransportation(rc
					// .getFromTransport());

					aft = Global.admissionTransportMap.get(new Integer(rc
							.getFromTransport()));
				}
				if (aft != null) {
					temp += " : " + aft.getName();
				}

				// if(rc.getSignOutToId() != 0) {
				// SignOutTo sot =
				// MedrexClientManager.getInstance().getSignOutTo(rc
				// .getSignOutToId());
				// temp += sot.getName() + " : ";
				// }
				//				
				// if(rc.getResidentContactId() != 0) {
				// ResidentContact resiCtc = MedrexClientManager.getInstance()
				// .getResidentContact(rc.getResidentContactId());
				// temp += resiCtc.getLastName() + ", " +
				// resiCtc.getFirstName();
				// }

				return temp;
			}
			if (col == 5) {
				// temp = rc.getDischargeTo();
				// if(rc.getDischargeType() == 1) { temp += " : " + "Discharge";
				// }
				// if(rc.getDischargeType() == 2) { temp += " : " + "E R"; }
				// return temp;
			}
			if (col == 6) {
				return (rc.getSerial() + "");
			}
			if (col == 7) {
				return (rc.getTypeName());
			}
			if (col == 8) {
				int status = 0;
				if (rc.isEr()) {
					status = 1;
				}
				return (status);
			}
			return ("");
		} catch (Exception e) {
			return ("");
		}
	}
}
