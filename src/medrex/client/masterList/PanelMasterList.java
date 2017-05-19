package medrex.client.masterList;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import medrex.client.FrameLogin;
import medrex.client.admin.userLogon.ControllerUserLogon;
import medrex.client.constants.Global;
import medrex.client.constants.GlobalSecurity;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.masterList.Allergies;
import medrex.commons.vo.masterList.Citizen;
import medrex.commons.vo.masterList.County;
import medrex.commons.vo.masterList.DoctorTypes;
import medrex.commons.vo.masterList.Insurance;
import medrex.commons.vo.masterList.Language;
import medrex.commons.vo.masterList.MaritalStatus;
import medrex.commons.vo.masterList.MasterList;
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

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;

public class PanelMasterList extends JPanel {

	private static final long serialVersionUID = 1L;

	public JxComboBox cmbMasterListType;

	private JxTable table;

	private MasterListRecordJTable MasterListRecordJTable;

	public FrameMasterListAdd frameMasterListAdd;

	private JScrollPane scrollPane;

	private JxPanel panel;

	private JPanel topTabArea;

	private JPanel topTabsPanel;

	private JLabel lblTopTabs;

	private JPanel topBlueStrip;

	private JPanel defaultPanel;

	private Class updateType;

	private ControllerMasterList controller;
	public boolean isNew;

	private static final Color DEF_COLOR = new Color(49, 104, 127);

	public PanelMasterList() {
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
		setPreferredSize(new Dimension(868, 768));

		controller = new ControllerMasterList(MasterList.class);

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
		logLabel.setText("Log off  ");
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
		panel.setBounds(0, 0, 750, 434);
		panel.setBackground(Color.WHITE);
		panel.setPreferredSize(new Dimension(750, 434));
		panel.setLayout(null);
		defaultPanel.add(panel);

		scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBounds(20, 95, 702, 285);
		panel.add(scrollPane);

		table = new JxTable();
		MasterListRecordJTable = new MasterListRecordJTable(controller);
		table.setModel(MasterListRecordJTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {

					isNew = false;
					setSelectedRowSerial();

					frameMasterListAdd = new FrameMasterListAdd(controller);
					SwingUtils.center(frameMasterListAdd);
					frameMasterListAdd.setTitle("View/Update Form");
					frameMasterListAdd.setModal(true);
					frameMasterListAdd.setVisible(true);
					updateMasterListJTable();

					// int id = new Integer((String)
					// MasterListRecordJTable.getValueAt(
					// table.getSelectedRow(), 1)).intValue();
					//
					// Global.currentUsersKey = id;
					// Global.currentUsers = (String) MasterListRecordJTable
					// .getValueAt(table.getSelectedRow(), 0);
					//
					// frameMasterListAdd = new FrameMasterListAdd(controller);
					// SwingUtils.center(frameMasterListAdd);
					// frameMasterListAdd.setTitle("View/Update User Form");
					// frameMasterListAdd.setModal(true);
					// frameMasterListAdd.setVisible(true);
					// updateMasterListJTable();
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
				setSelectedRowSerial();

				frameMasterListAdd = new FrameMasterListAdd(controller);
				SwingUtils.center(frameMasterListAdd);
				frameMasterListAdd.setTitle("View/Update Form");
				frameMasterListAdd.setModal(true);
				frameMasterListAdd.setVisible(true);
				updateMasterListJTable();

				// frameMasterListAdd = new FrameMasterListAdd(controller);
				// SwingUtils.center(frameMasterListAdd);
				// frameMasterListAdd.setTitle("Add New User Form");
				// frameMasterListAdd.setModal(true);
				// frameMasterListAdd.setVisible(true);
				// updateMasterListJTable();
				// Global.currentUsers = (String)
				// cmbMasterListType.getSelectedItem();
				// Global.currentUsersKey = 0;
				// frameUsersAdd = new FrameMasterListAdd();
				// SwingUtils.center(frameUsersAdd);
				// frameUsersAdd.setTitle("Add New User Form");
				// frameUsersAdd.setModal(true);
				// frameUsersAdd.setVisible(true);

			}
		});
		btnAdd.setText("Add New");
		btnAdd.setBounds(20, 395, 111, 26);
		panel.add(btnAdd);

		final JxButton btnView = new JxButton(0.4f);
		btnView.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnView.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnView.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					// String val = (String)
					// controller.getValueAt(table.getSelectedRow(), 0);
					// System.out.println(val);
					// int id = new Integer((String)
					// MasterListRecordJTable.getValueAt(
					// table.getSelectedRow(), 1)).intValue();
					// System.out.println(id);

					// Global.currentUsersKey = id;
					// Global.currentUsers = (String) MasterListRecordJTable
					// .getValueAt(table.getSelectedRow(), 0);
					// System.out.println(Global.currentUsers);
					isNew = false;
					setSelectedRowSerial();
					if (controller.getCurrentSerial() != 0) {
						frameMasterListAdd = new FrameMasterListAdd(controller);
						SwingUtils.center(frameMasterListAdd);
						frameMasterListAdd.setTitle("View/Update Form");
						frameMasterListAdd.setModal(true);
						frameMasterListAdd.setVisible(true);
					}
					updateMasterListJTable();

					// setSelectedRowSerial();

					// frameMasterListAdd = new FrameMasterListAdd(controller);
					// SwingUtils.center(frameMasterListAdd);
					// frameMasterListAdd.setTitle("View/Update "
					// +cmbMasterListType.getSelectedItem()+ " Form");
					// frameMasterListAdd.setModal(true);
					// frameMasterListAdd.setVisible(true);
					// updateMasterListJTable();

					// int id = new Integer((String)
					// MasterListRecordJTable.getValueAt(
					// table.getSelectedRow(), 4)).intValue();
					//
					// Global.currentUsers = (String) MasterListRecordJTable
					// .getValueAt(table.getSelectedRow(), 1);
					//
					// Global.currentUsersKey = id;

				} catch (Exception ve) {
				}
			}
		});
		btnView.setFont(new Font("", Font.BOLD, 12));
		btnView.setText("View / Update");
		btnView.setBounds(215, 395, 111, 26);
		panel.add(btnView);

		final JxButton btnDelete = new JxButton(0.4f);
		btnDelete.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnDelete.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnDelete.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					isNew = false;
					doDelete();
					// int id = new Integer((String)
					// MasterListRecordJTable.getValueAt(
					// table.getSelectedRow(), 4)).intValue();
					// Global.ltcServer.deleteUser(id);
					// updateMasterListJTable();

				} catch (Exception xe) {

				}

			}
		});
		btnDelete.setFont(new Font("", Font.BOLD, 12));
		btnDelete.setText("Delete");
		btnDelete.setBounds(410, 395, 111, 26);
		panel.add(btnDelete);

		final JxButton btnCancel = new JxButton(0.4f);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

			}
		});
		btnCancel.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnCancel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnCancel.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.setText("Cancel");
		btnCancel.setBounds(610, 395, 111, 26);
		panel.add(btnCancel);

		final JLabel usersInformationLabel = new JLabel();
		usersInformationLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		usersInformationLabel.setBackground(Color.WHITE);
		usersInformationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		usersInformationLabel.setFont(new Font("Dialog", Font.PLAIN, 28));
		usersInformationLabel.setText("Master List");
		usersInformationLabel.setBounds(24, 22, 702, 30);
		panel.add(usersInformationLabel);

		cmbMasterListType = new JxComboBox();
		cmbMasterListType.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent e) {
				Object obj = cmbMasterListType.getSelectedItem();
				if (obj != null) {
					updateType = obj.getClass();
					updateMasterListJTable();
				} else {
					updateType = MasterList.class;
					updateMasterListJTable();
				}
			}
		});
		cmbMasterListType.setArc(0.4f);
		cmbMasterListType.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		cmbMasterListType.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		cmbMasterListType.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		cmbMasterListType.setBounds(230, 60, 271, 26);
		panel.add(cmbMasterListType);

		fillCombos();
		cmbMasterListType.setSelectedIndex(1);
		cmbMasterListType.setSelectedIndex(0);
	}

	protected void doDelete() {
		setSelectedRowSerial();
		if (controller.getCurrentSerial() != 0) {
			try {
				controller.deleteRecord();
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			updateMasterListJTable();
		}
	}

	private void setSelectedRowSerial() {
		int selectedRow = -1;
		if (!isNew) {
			try {
				selectedRow = table.getSelectedRow();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (selectedRow == -1) {
			controller.setCurrentSerial(0);
		} else {
			controller.setCurrentSelectedRow(selectedRow);
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
		topTabArea.setSize(getWidth(), topTabArea.getHeight());
		topBlueStrip.setSize(getWidth(), topBlueStrip.getHeight());
		defaultPanel.setSize(getWidth(), getHeight() - defaultPanel.getY());
		panel.setLocation((defaultPanel.getWidth() - panel.getWidth()) / 2,
				(defaultPanel.getHeight() - panel.getHeight() - 76) / 2);
		this.repaint();
	}

	public void updateMasterListJTable() {
		controller.setType(updateType);

		List<MasterList> l = null;
		try {
			l = controller.getRecords();
		} catch (Exception e) {
		}
		if (l == null) {
			l = new ArrayList<MasterList>();
		}
		MasterListRecordJTable.setNewList(l);
		MasterListRecordJTable.fireTableStructureChanged();
		GlobalSecurity.updateSecurity();
		table.updateUI();
		table.repaint();
	}

	public void fillCombos() {
		Citizen citizen = new Citizen();
		citizen.setMsterName("Citizen");

		Language language = new Language();
		language.setMsterName("Language");

		MaritalStatus maritalStatus = new MaritalStatus();
		maritalStatus.setMsterName("Marital Status");

		Origin origin = new Origin();
		origin.setMsterName("Origin");

		Religion religion = new Religion();
		religion.setMsterName("Religion");

		Sex sex = new Sex();
		sex.setMsterName("Sex");

		State state = new State();
		state.setMsterName("State");

		Status status = new Status();
		status.setMsterName("Status");

		County county = new County();
		county.setMsterName("County");

		PayerType parerType = new PayerType();
		parerType.setMsterName("PayerType");

		PayerResponsibleParty payerResponsibleParty = new PayerResponsibleParty();
		payerResponsibleParty.setMsterName("ResponsibleParty");

		Insurance ins = new Insurance();
		ins.setMsterName("Insurance");

		MedicareDays mdays = new MedicareDays();
		mdays.setMsterName("MedicareDays");

		Relation relation = new Relation();
		relation.setMsterName("Relation");

		PhoneType phoneType = new PhoneType();
		phoneType.setMsterName("PhoneType");

		ProviderTypes providerTypes = new ProviderTypes();
		providerTypes.setMsterName("ProviderTypes");

		DoctorTypes doctorType = new DoctorTypes();
		doctorType.setMsterName("DoctorTypes");

		Allergies allergies = new Allergies();
		allergies.setMsterName("Allergies");

		cmbMasterListType.setModel(new DefaultComboBoxModel(new MasterList[] {
				citizen, language, maritalStatus, origin, religion, sex, state,
				status, county, parerType, payerResponsibleParty, ins, mdays,
				relation, phoneType, providerTypes, doctorType, allergies }));

	}

}

class MasterListRecordJTable extends AbstractTableModel {

	private static final long serialVersionUID = 1L;

	private ControllerMasterList controller;
	public List<MasterList> l;

	MasterListRecordJTable(List<MasterList> ls, ControllerMasterList controller) {
		this.controller = controller;
		setNewList(ls);
	}

	MasterListRecordJTable(ControllerMasterList controller) {
		this(new ArrayList<MasterList>(), controller);
	}

	public int getColumnCount() {
		return controller.getColumnCount();
	}

	public int getRowCount() {
		return controller.getRowCount();
	}

	@Override
	public String getColumnName(int column) {
		return controller.getColumnName(column);
	}

	public void setNewList(List<MasterList> rec) {
		controller.setNewList(rec);
	}

	public Object getValueAt(int row, int column) {
		return controller.getValueAt(row, column);
	}
}
