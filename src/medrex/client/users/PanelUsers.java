package medrex.client.users;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import medrex.client.FrameLogin;
import medrex.client.admin.userLogon.ControllerUserLogon;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.client.utils.controls.JxTableMedrex;
import medrex.commons.enums.GuiModes;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxPanel;

public class PanelUsers extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JxComboBox cmbUserType;

	// private JxTable table;

	// private UsersRecordJTable usersRecordJTable;

	private JScrollPane scrollPane;

	private JxPanel panel;

	private JPanel topTabArea;

	private JPanel topTabsPanel;

	private JLabel lblTopTabs;

	private JPanel topBlueStrip;

	private JPanel defaultPanel;

	private static final Color DEF_COLOR = new Color(49, 104, 127);

	private ControllerUsers controllerUsers;

	private boolean isNew;

	private JxTableMedrex table;

	/**
	 * Create the panel
	 */
	public PanelUsers() {
		super();
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doResize();
				}
			}
		});
		Global.setPanelId = 1;
		setLayout(null);

		controllerUsers = new ControllerUsers();
		setPreferredSize(new Dimension(868, 768));

		topTabArea = new JPanel();
		topTabArea.setLayout(new BorderLayout(0, 0));
		topTabArea.setOpaque(false);
		topTabArea.setBounds(0, 0, 868, 138);
		add(topTabArea);

		topTabsPanel = new JPanel();
		topTabsPanel.setOpaque(false);
		topTabsPanel.setLayout(null);
		topTabsPanel.setPreferredSize(new Dimension(868, 40));
		topTabArea.add(topTabsPanel, BorderLayout.SOUTH);

		topBlueStrip = new JPanel();
		topBlueStrip.setLayout(new GridLayout(0, 2));
		topBlueStrip.setBackground(new Color(28, 93, 113));
		topBlueStrip.setBounds(0, 138, 868, 38);
		add(topBlueStrip);

		final JLabel lastLoginLabel = new JLabel();
		lastLoginLabel.setForeground(Color.WHITE);
		lastLoginLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont()
				.deriveFont(16));
		lastLoginLabel.setBorder(new EmptyBorder(0, 100, 0, 0));
		lastLoginLabel.setText("<html><b>Welcome </b>"
				+ Global.currentUserLastName + ", "
				+ Global.currentUserFirstName);
		topBlueStrip.add(lastLoginLabel);

		final JLabel logLabel = new JLabel();
		logLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent arg0) {
				(new ControllerUserLogon()).logoutUpdate();
				FrameFactory.closeAll();
				FrameLogin frame = (FrameLogin) FrameFactory
						.createWindowOfType(FrameLogin.class);
				Global.currentMainTab = 1;
				frame.setVisible(true);
			}
		});
		logLabel.setBorder(new EmptyBorder(0, 0, 0, 50));
		logLabel.setForeground(Color.WHITE);
		logLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont()
				.deriveFont(16));
		logLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		logLabel.setText("Log off ");
		topBlueStrip.add(logLabel);

		defaultPanel = new JPanel();
		defaultPanel.setBorder(new EmptyBorder(20, 0, 0, 10));
		defaultPanel.setOpaque(false);
		defaultPanel.setLayout(null);
		defaultPanel.setBounds(0, 176, 868, 592);
		add(defaultPanel);

		panel = new JxPanel();
		panel.setArc(1f);
		panel.setBorder(new LineBorder(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor(), 1, false));
		panel.setBounds(115, 0, 750, 434);
		panel.setBackground(Color.WHITE);
		panel.setPreferredSize(new Dimension(750, 434));
		panel.setLayout(null);
		defaultPanel.add(panel);

		scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBounds(24, 75, 702, 285);
		panel.add(scrollPane);

		table = new JxTableMedrex(controllerUsers);
		// usersRecordJTable = new UsersRecordJTable();
		// table.setModel(usersRecordJTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					/*
					 * int id = new Integer((String)
					 * usersRecordJTable.getValueAt( table.getSelectedRow(),
					 * 4)).intValue();
					 * 
					 * Global.currentUsersKey = id; Global.currentUsers =
					 * (String) usersRecordJTable
					 * .getValueAt(table.getSelectedRow(), 1);
					 * 
					 * frameUsersAdd = new FrameUsersAdd();
					 * SwingUtils.center(frameUsersAdd);
					 * frameUsersAdd.setTitle("View/Update User Form");
					 * frameUsersAdd.setModal(true);
					 * frameUsersAdd.setVisible(true); updateUsersJTable();
					 */

					// Type 1.User role
					Global.currentRoleType = 1;
					isNew = false;
					doAddorUpdate();

				} else if (evt.getClickCount() == 1) {
					// System.out.println("single click");
				}
			}
		});

		scrollPane.setViewportView(table);

		final JxButton btnAdd = new JxButton(0.4f);
		btnAdd.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnAdd.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnAdd.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnAdd.setFont(new Font("", Font.BOLD, 12));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				isNew = true;
				String currentUsersType = (String) cmbUserType
						.getSelectedItem();
				System.out.println("currentUsersType :" + currentUsersType);
				controllerUsers.setCurrentSelectedUserType(currentUsersType);
				controllerUsers.setCurrentSelectedUserId(0);
				doAddorUpdate();

				/*
				 * Global.currentUsers = (String) cmbUserType.getSelectedItem();
				 * Global.currentUsersKey = 0; frameUsersAdd = new
				 * FrameUsersAdd(); SwingUtils.center(frameUsersAdd);
				 * frameUsersAdd.setTitle("Add New User Form");
				 * frameUsersAdd.setModal(true); frameUsersAdd.setVisible(true);
				 * updateUsersJTable();
				 */
			}
		});
		btnAdd.setText("Add New");
		btnAdd.setBounds(24, 366, 84, 26);
		panel.add(btnAdd);

		final JxButton btnView = new JxButton(0.4f);
		btnView.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnView.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnView.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				/*
				 * try { int id = new Integer((String)
				 * usersRecordJTable.getValueAt( table.getSelectedRow(),
				 * 4)).intValue();
				 * 
				 * Global.currentUsers = (String) usersRecordJTable
				 * .getValueAt(table.getSelectedRow(), 1);
				 * 
				 * Global.currentUsersKey = id; frameUsersAdd = new
				 * FrameUsersAdd(); SwingUtils.center(frameUsersAdd);
				 * frameUsersAdd.setTitle("View/Update User Form");
				 * frameUsersAdd.setModal(true); frameUsersAdd.setVisible(true);
				 * updateUsersJTable(); } catch (Exception ve) { }
				 */
				// Type 1.User role
				Global.currentRoleType = 1;
				isNew = false;
				doAddorUpdate();
			}
		});
		btnView.setFont(new Font("", Font.BOLD, 12));
		btnView.setText("View / Update");
		btnView.setBounds(391, 366, 111, 26);
		panel.add(btnView);

		final JxButton btnDelete = new JxButton(0.4f);
		btnDelete.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnDelete.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnDelete.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				/*
				 * try { int id = new Integer((String)
				 * usersRecordJTable.getValueAt( table.getSelectedRow(),
				 * 4)).intValue(); Global.ltcServer.deleteUser(id);
				 * updateUsersJTable();
				 * 
				 * } catch (Exception xe) {
				 * 
				 * }
				 */
				isNew = false;
				doDelete();

			}
		});

		btnDelete.setFont(new Font("", Font.BOLD, 12));
		btnDelete.setText("Delete");
		btnDelete.setBounds(508, 366, 106, 26);
		panel.add(btnDelete);

		final JxButton btnCancel = new JxButton(0.4f);
		btnCancel.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnCancel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnCancel.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.setText("Cancel");
		btnCancel.setBounds(620, 366, 106, 26);
		panel.add(btnCancel);

		final JLabel usersInformationLabel = new JLabel();
		usersInformationLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		usersInformationLabel.setBackground(Color.WHITE);
		usersInformationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		usersInformationLabel.setFont(new Font("Dialog", Font.PLAIN, 28));
		usersInformationLabel.setText("USERS");
		usersInformationLabel.setBounds(24, 22, 702, 30);
		panel.add(usersInformationLabel);

		cmbUserType = new JxComboBox();
		cmbUserType.setArc(0.4f);
		cmbUserType.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		cmbUserType.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		cmbUserType.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		cmbUserType.setBounds(114, 366, 271, 26);
		panel.add(cmbUserType);

		fillCombos();
		updateTable();
	}

	protected void doDelete() {
		setSelectedRowSerial();
		if (controllerUsers.getCurrentSerial() != 0) {
			try {
				controllerUsers.deleteUser();
			} catch (Exception e) {

			}
			updateTable();
		} else {

		}

	}

	protected void doAddorUpdate() {
		setSelectedRowSerial();
		controllerUsers.setType("user");
		PanelUsersAdd panelUsersAdd = new PanelUsersAdd(controllerUsers);
		SwingUtils.openInDialog(panelUsersAdd);
		updateTable();

	}

	public void doAddorUpdate2() {
		controllerUsers.setType("user");
		PanelUsersAdd panelUsersAdd = new PanelUsersAdd(controllerUsers);
		SwingUtils.openInDialog(panelUsersAdd);
	}

	private void updateTable() {
		List list = null;
		try {
			list = controllerUsers.getUserRecord();
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

		controllerUsers.setNewList(list);
		table.update();

	}

	private void setSelectedRowSerial() {
		int selectedRow = -1;
		if (!isNew) {
			try {
				selectedRow = table.getSelectedRow();
				// System.out.println("Serial is =  " + selectedRow );
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (selectedRow == -1) {
			controllerUsers.setCurrentSerial(0);
		} else {
			controllerUsers.setCurrentSelectedRow(selectedRow);

		}
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(new Color(32, 63, 84));
		g2.fillRect(0, getHeight() - 76, getWidth(), 76);
	}

	public void doResize() {
		updateTable();

		topTabArea.setSize(getWidth(), topTabArea.getHeight());
		topBlueStrip.setSize(getWidth(), topBlueStrip.getHeight());
		defaultPanel.setSize(getWidth(), getHeight() - defaultPanel.getY());
		panel.setLocation((defaultPanel.getWidth() - panel.getWidth()) / 2,
				(defaultPanel.getHeight() - panel.getHeight() - 76) / 2);
		this.repaint();
	}

	/*
	 * public void updateUsersJTable() { List l = new ArrayList();
	 * 
	 * try { l = Global.ltcServer.getUsers();
	 * 
	 * } catch (Exception e) { }
	 * 
	 * usersRecordJTable.setNewList(l);
	 * usersRecordJTable.fireTableStructureChanged();
	 * GlobalSecurity.updateSecurity(); table.updateUI(); table.repaint(); }
	 */

	public void fillCombos() {
		cmbUserType.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Physicians", "Nurse", "CNA", "RN", "LPN", "Manager",
				"Administrator" }));

	}

}

/*
 * class UsersRecordJTable extends AbstractTableModel {
 *//**
	 * 
	 */
/*
 * private static final long serialVersionUID = 1L;
 * 
 * -+ +-3- - private String[] columnNames = { "User ", "User Type", "User Name"
 * };
 * 
 * public List l; public HashMap<Users, Object> userMap;
 * 
 * int n = 0;
 * 
 * UsersRecordJTable(List ls) { l = ls; userMap = new HashMap<Users, Object>();
 * }
 * 
 * UsersRecordJTable() { this(new ArrayList()); }
 * 
 * public int getColumnCount() { return columnNames.length; }
 * 
 * public int getRowCount() { return (l.size()); }
 * 
 * public void setRowCount(int count) { n = n + count; }
 * 
 * public void setNewList(List ls) { l = ls; userMap.clear();
 * 
 * Iterator itr = l.iterator(); while (itr.hasNext()) { Object obj = itr.next();
 * if (obj instanceof Users) { Users rc = (Users) obj;
 * 
 * if (rc.getUserType().equals("Physicians")) { Doctors d = null; if
 * (rc.getUserId() != 0) { try {
 * 
 * d = Global.ltcServer.getDoctorsRecord(rc .getUserId());
 * 
 * } catch (Exception e) {
 * 
 * }
 * 
 * userMap.put(rc, d); } } if (rc.getUserType().equals("Nurse")) { Nurse nurse =
 * new Nurse(); try {
 * 
 * nurse = Global.ltcServer.getNurseRecord(rc.getUserId()); } catch (Exception
 * e) { } userMap.put(rc, nurse); } if (rc.getUserType().equals("CNA")) { Nurse
 * nurse = new Nurse(); try {
 * 
 * nurse = Global.ltcServer.getNurseRecord(rc.getUserId()); } catch (Exception
 * e) { } userMap.put(rc, nurse); } if (rc.getUserType().equals("RN")) { Nurse
 * nurse = new Nurse(); try {
 * 
 * nurse = Global.ltcServer.getNurseRecord(rc.getUserId()); } catch (Exception
 * e) { } userMap.put(rc, nurse); } if (rc.getUserType().equals("LPN")) { Nurse
 * nurse = new Nurse(); try {
 * 
 * nurse = Global.ltcServer.getNurseRecord(rc.getUserId()); } catch (Exception
 * e) { } userMap.put(rc, nurse); } if (rc.getUserType().equals("Manager")) {
 * Nurse nurse = new Nurse(); try {
 * 
 * nurse = Global.ltcServer.getNurseRecord(rc.getUserId()); } catch (Exception
 * e) { } userMap.put(rc, nurse); } if
 * (rc.getUserType().equals("Administrator")) { Nurse nurse = new Nurse(); try {
 * 
 * nurse = Global.ltcServer.getNurseRecord(rc.getUserId()); } catch (Exception
 * e) { } userMap.put(rc, nurse); } } }
 * 
 * }
 * 
 * public String getColumnName(int col) { return columnNames[col]; }
 * 
 * public Object getValueAt(int row, int col) { try { Users rc = (Users)
 * l.get(row);
 * 
 * if (col == 0) { Object usrType = userMap.get(rc); if (usrType instanceof
 * Doctors) { Doctors d = (Doctors) usrType; return (d.getPhysicianSurName() +
 * ", " + d .getPhysicianName()); } if (usrType instanceof Nurse) { Nurse nurse
 * = (Nurse) usrType; return (nurse.getNurseSurName() + ", " + nurse
 * .getNurseName()); } }
 * 
 * if (col == 1) { return (rc.getUserType() + ""); } if (col == 2) { return
 * (rc.getUserName()); } if (col == 3) { return (rc.getUserId()); } if (col ==
 * 4) { return (rc.getSerial() + "");
 * 
 * }
 * 
 * return (""); } catch (Exception e) { return (""); }
 * 
 * } }
 */
