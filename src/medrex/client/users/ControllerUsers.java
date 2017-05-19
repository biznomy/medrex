package medrex.client.users;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.ControllerTableModel;
import medrex.commons.vo.others.Doctors;
import medrex.commons.vo.others.Nurse;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.security.SecurityRole;

public class ControllerUsers implements ControllerTableModel {

	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "User", "User Type", "User Name" };

	List<Users> currentUsersList = new ArrayList<Users>();

	public HashMap<Users, Object> userMap;

	int currentUsersKey = 0;

	int n = 0;

	private String currentSelectedUserType;
	private int currentSelectedUserId;
	private int formId;
	private int userRoleId = Global.userRoleId;;
	private int userId;
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCurrentSerial() {
		return currentUsersKey;
	}

	public void setCurrentSerial(int i) {
		this.currentUsersKey = i;
	}

	public void setCurrentSelectedRow(int selectedRow) {

		Users users = currentUsersList.get(selectedRow);
		setCurrentSerial(users.getSerial());
		setCurrentSelectedUserType(users.getUserType());
		setCurrentSelectedUserId(users.getUserId());
	}

	public List getUserRecord() {
		List l = new ArrayList();

		try {
			l = MedrexClientManager.getInstance().getUsers();

		} catch (Exception e) {
		}
		return l;
	}

	public void insertOrUpdateUser(Users ar) {
		try {
			ar.setSerial(getCurrentSerial());
			ar.setUserId(currentSelectedUserId);
			ar.setFormId(currentSelectedUserId);
			SecurityRole securityRole = null;
			try {
				securityRole = MedrexClientManager.getInstance()
						.getSecurityRole(Global.userRoleId);
			} catch (Exception e) {
				e.printStackTrace();
			}

			ar.setUserRole(securityRole);

			int serial = MedrexClientManager.getInstance().insertOrUpdateUser(
					ar);
			setCurrentSerial(serial);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Users doUpdateUser() {
		Users ar = null;
		try {
			ar = MedrexClientManager.getInstance().getUser(getCurrentSerial());
			setUserId(ar.getUserId());
			Global.userRoleId = ar.getUserRole().getSerial();
		} catch (Exception e) {
		}
		return ar;
	}

	public void deleteUser() throws MedrexException {
		try {
			if (currentSelectedUserType.equalsIgnoreCase("Physicians")) {
				// MedrexClientManager.getInstance().deleteDoctorsRecord(currentSelectedUserId);
				MedrexClientManager.getInstance().deleteDoctorsRecord(
						currentSelectedUserId, currentUsersKey);
			} else {
				// MedrexClientManager.getInstance().deleteNurseRecord(currentSelectedUserId);
				MedrexClientManager.getInstance().deleteNurseRecord(
						currentSelectedUserId, currentUsersKey);
			}
			// MedrexClientManager.getInstance().deleteUser(currentUsersKey);
			MedrexClientManager.getInstance().deleteUser(currentUsersKey,
					currentSelectedUserId);

		} catch (MedrexException e) {
			JOptionPane.showMessageDialog(null, "Access Denied"
					+ " , Entries Exists for this User",
					"Constraint Violation", JOptionPane.ERROR_MESSAGE);
			throw e;
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	// for table only

	public void UsersRecordJTable(List ls) {
		currentUsersList = ls;
		userMap = new HashMap<Users, Object>();
	}

	public void UsersRecordJTable() {
		currentUsersList = new ArrayList();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (currentUsersList.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List ls) {
		currentUsersList = ls;
		// userMap.clear();
		userMap = new HashMap<Users, Object>();
		Iterator itr = currentUsersList.iterator();
		while (itr.hasNext()) {
			Object obj = itr.next();
			if (obj instanceof Users) {
				Users rc = (Users) obj;

				if (rc.getUserType().equals("Physicians")) {
					Doctors d = null;
					if (rc.getUserId() != 0) {
						try {

							d = MedrexClientManager.getInstance()
									.getDoctorsRecord(rc.getUserId());

						} catch (Exception e) {

						}

						userMap.put(rc, d);
					}
				}
				if (rc.getUserType().equals("Nurse")) {
					Nurse nurse = new Nurse();
					try {

						nurse = MedrexClientManager.getInstance()
								.getNurseRecord(rc.getUserId());
					} catch (Exception e) {
					}
					userMap.put(rc, nurse);
				}
				if (rc.getUserType().equals("CNA")) {
					Nurse nurse = new Nurse();
					try {

						nurse = MedrexClientManager.getInstance()
								.getNurseRecord(rc.getUserId());
					} catch (Exception e) {
					}
					userMap.put(rc, nurse);
				}
				if (rc.getUserType().equals("RN")) {
					Nurse nurse = new Nurse();
					try {

						nurse = MedrexClientManager.getInstance()
								.getNurseRecord(rc.getUserId());
					} catch (Exception e) {
					}
					userMap.put(rc, nurse);
				}
				if (rc.getUserType().equals("LPN")) {
					Nurse nurse = new Nurse();
					try {

						nurse = MedrexClientManager.getInstance()
								.getNurseRecord(rc.getUserId());
					} catch (Exception e) {
					}
					userMap.put(rc, nurse);
				}
				if (rc.getUserType().equals("Manager")) {
					Nurse nurse = new Nurse();
					try {

						nurse = MedrexClientManager.getInstance()
								.getNurseRecord(rc.getUserId());
					} catch (Exception e) {
					}
					userMap.put(rc, nurse);
				}
				if (rc.getUserType().equals("Administrator")) {
					Nurse nurse = new Nurse();
					try {

						nurse = MedrexClientManager.getInstance()
								.getNurseRecord(rc.getUserId());
					} catch (Exception e) {
					}
					userMap.put(rc, nurse);
				}
			}
		}

	}

	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			Users rc = currentUsersList.get(row);

			if (col == 0) {
				Object usrType = userMap.get(rc);
				if (usrType instanceof Doctors) {
					Doctors d = (Doctors) usrType;
					return (d.getPhysicianSurName() + ", " + d
							.getPhysicianName());
				}
				if (usrType instanceof Nurse) {
					Nurse nurse = (Nurse) usrType;
					return (nurse.getNurseSurName() + ", " + nurse
							.getNurseName());
				}
			}

			if (col == 1) {
				return (rc.getUserType() + "");
			}
			if (col == 2) {
				return (rc.getUserName());
			}
			if (col == 3) {
				return (rc.getUserId());
			}
			if (col == 4) {
				return (rc.getSerial() + "");
			}
			/*
			 * if (col == 5) { return (rc.getUserRoleId() + ""); }
			 */

			return ("");
		} catch (Exception e) {
			return ("");
		}

	}

	public String getCurrentSelectedUserType() {
		return currentSelectedUserType;
	}

	public void setCurrentSelectedUserType(String currentSelectedUserType) {
		this.currentSelectedUserType = currentSelectedUserType;
	}

	public int getCurrentSelectedUserId() {
		return currentSelectedUserId;
	}

	public void setCurrentSelectedUserId(int currentSelectedUserId) {
		this.currentSelectedUserId = currentSelectedUserId;
	}

	public int getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

}
