package medrex.client.admin.security;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.AbstractTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.constants.GlobalSecurity;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.others.Doctors;
import medrex.commons.vo.others.Nurse;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.security.SecurityRole;

import com.sX.swing.JxButton;
import com.sX.swing.JxTable;

public class PanelUsersRole extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4990270715487930032L;

	private JxTable table;

	private UsersRecordJTable usersRecordJTable;

	private JScrollPane scrollPane;

	private JPanel topTabArea;

	private JPanel topTabsPanel;

	private JLabel lblTopTabs;

	private JPanel topBlueStrip;

	private JPanel defaultPanel;

	private FrameSecurityAdd frameSecurityAdd;

	public PanelUsersRole() {
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(660, 235));
		setLayout(null);

		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent arg0) {
				updateUsersJTable();
			}
		});

		scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBounds(0, 0, 660, 203);
		add(scrollPane);

		table = new JxTable();
		usersRecordJTable = new UsersRecordJTable();
		table.setModel(usersRecordJTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					int id = new Integer((String) usersRecordJTable.getValueAt(
							table.getSelectedRow(), 4)).intValue();

					Global.currentUsersKey = id;
					Global.currentUsers = (String) usersRecordJTable
							.getValueAt(table.getSelectedRow(), 5);
					// Type 1.User role
					Global.currentRoleType = 1;

					int roleId = new Integer((String) usersRecordJTable
							.getValueAt(table.getSelectedRow(), 6)).intValue();

					Global.currentSecurityRoleKey = roleId;

					frameSecurityAdd = new FrameSecurityAdd(1);

					SwingUtils.center(frameSecurityAdd);
					frameSecurityAdd.setTitle("Add New Security Form");
					frameSecurityAdd.setModal(true);
					frameSecurityAdd.setVisible(true);
					updateUsersJTable();
				} else if (evt.getClickCount() == 1) {
					// System.out.println("single click");
				}
			}
		});

		scrollPane.setViewportView(table);

		/*
		 * final JxButton btnAdd = new JxButton(0.4f);
		 * btnAdd.setBackground(GuiModes
		 * .DESIGNER_FORMS.getControlBackgroundColor());
		 * btnAdd.setForeground(GuiModes
		 * .DESIGNER_FORMS.getControlForegroundColor());
		 * btnAdd.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		 * btnAdd.setFont(new Font("", Font.BOLD, 12));
		 * btnAdd.addActionListener(new ActionListener() { public void
		 * actionPerformed(final ActionEvent e) {
		 * 
		 * // Global.currentUsers = (String) cmbUserType.getSelectedItem();
		 * Global.currentUsersKey = 0; // Type 1.User role
		 * Global.currentRoleType=1; frameUsersAdd = new FrameUsersAdd();
		 * SwingUtils.center(frameUsersAdd);
		 * frameUsersAdd.setTitle("Add New User Form");
		 * frameUsersAdd.setModal(true); frameUsersAdd.setVisible(true);
		 * updateUsersJTable(); } }); btnAdd.setText("Add New");
		 * btnAdd.setBounds(0, 209, 84, 26); add(btnAdd);
		 */

		final JxButton btnView = new JxButton(0.4f);
		btnView.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnView.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnView.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					int id = new Integer((String) usersRecordJTable.getValueAt(
							table.getSelectedRow(), 4)).intValue();

					Global.currentUsers = (String) usersRecordJTable
							.getValueAt(table.getSelectedRow(), 5);

					Global.currentUsersKey = id;
					// Type 1.User role
					Global.currentRoleType = 1;

					int roleId = new Integer((String) usersRecordJTable
							.getValueAt(table.getSelectedRow(), 6)).intValue();
					Global.currentSecurityRoleKey = roleId;

					frameSecurityAdd = new FrameSecurityAdd(1);
					SwingUtils.center(frameSecurityAdd);
					frameSecurityAdd.setTitle("Add New Security Form");
					frameSecurityAdd.setModal(true);
					frameSecurityAdd.setVisible(true);
					updateUsersJTable();
				} catch (Exception ve) {
				}
			}
		});
		btnView.setFont(new Font("", Font.BOLD, 12));
		btnView.setText("View / Update");
		btnView.setBounds(325, 209, 111, 26);
		add(btnView);

		final JxButton btnDelete = new JxButton(0.4f);
		btnDelete.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnDelete.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnDelete.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					int id = new Integer((String) usersRecordJTable.getValueAt(
							table.getSelectedRow(), 4)).intValue();
					MedrexClientManager.getInstance().deleteUser(id);
					updateUsersJTable();

				} catch (Exception xe) {

				}

			}
		});
		btnDelete.setFont(new Font("", Font.BOLD, 12));
		btnDelete.setText("Delete");
		btnDelete.setBounds(442, 209, 106, 26);
		add(btnDelete);

		final JxButton btnCancel = new JxButton(0.4f);
		btnCancel.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnCancel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnCancel.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.setText("Cancel");
		btnCancel.setBounds(554, 209, 106, 26);
		add(btnCancel);
	}

	public void updateUsersJTable() {
		List l = new ArrayList();

		try {
			l = MedrexClientManager.getInstance().getUsers();

		} catch (Exception e) {
		}

		usersRecordJTable.setNewList(l);
		usersRecordJTable.fireTableStructureChanged();
		GlobalSecurity.updateSecurity();
		table.updateUI();
		table.repaint();
	}
}

class UsersRecordJTable extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List roleIdList = new ArrayList();
	private String[] columnNames = { "User ", "Security Roles" };

	public List l;
	public HashMap<Users, Object> userMap;
	public List roleList;
	public List roleListId;
	int n = 0;

	UsersRecordJTable(List ls) {
		l = ls;
		userMap = new HashMap<Users, Object>();
	}

	UsersRecordJTable() {
		this(new ArrayList());
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (l.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List ls) {
		l = ls;
		userMap.clear();

		Iterator itr = l.iterator();
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

		roleList = new ArrayList();
		roleListId = new ArrayList();
		try {
			roleList = MedrexClientManager.getInstance().getAllRoles();

		} catch (Exception e) {
		}
		Iterator it = roleList.iterator();
		while (it.hasNext()) {
			SecurityRole securityRole = (SecurityRole) it.next();
			roleListId.add(securityRole);
		}

	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			Users rc = (Users) l.get(row);

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

				// List roleList = new ArrayList();
				//				
				//
				// try {
				// roleList = MedrexClientManager.getInstance().getAllRoles();
				//
				// } catch (Exception e) {
				// }
				// Iterator it=roleList.iterator();
				// while(it.hasNext()){
				// SecurityRole securityRole=(SecurityRole)it.next();
				// if(securityRole.getSerial()==rc.getApplicationRole()){
				// return securityRole.getName();
				// }
				// // roleIdList.add(securityRole.getSerial());
				// }

				Iterator it = roleListId.iterator();
				while (it.hasNext()) {
					SecurityRole securityRole = (SecurityRole) it.next();
					if (rc.getApplicationRole().getSerial() == securityRole
							.getSerial()) {
						return securityRole.getName();
					}
				}

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
			if (col == 5) {
				return (rc.getUserType() + "");
			}

			if (col == 6) {
				return (rc.getUserRole().getSerial() + "");
			}

			return ("");
		} catch (Exception e) {
			return ("");
		}

	}
}
