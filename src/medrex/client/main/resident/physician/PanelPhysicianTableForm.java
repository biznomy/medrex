package medrex.client.main.resident.physician;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.users.ControllerUsers;
import medrex.client.users.FramePhysicianFormAdd;
import medrex.client.utils.SwingUtils;
import medrex.client.utils.Utils;
import medrex.commons.vo.masterList.DoctorTypes;
import medrex.commons.vo.masterList.MasterList;
import medrex.commons.vo.others.Doctors;
import medrex.commons.vo.physician.PhysicianForm;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxTable;
import com.toedter.calendar.JDateChooser;

public class PanelPhysicianTableForm extends JPanel {

	private static final Color DEF_COLOR = new Color(49, 107, 127);

	private JxComboBox cmbPhysiciansName;

	private JxComboBox cmbPhysiciansType;

	private List physicianList;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JxTable table;

	private PhysicianFormJTable physicianFormJTable;

	public FramePhysicianFormAdd framePhysicianFormAdd;

	private JDateChooser dateChooser;

	private ResidentMain residentMain;

	/**
	 * Create the panel
	 */
	public PanelPhysicianTableForm() {
		super();
		int resSerial = Global.currentResidenceKey;
		if (resSerial != 0) {
			try {
				residentMain = MedrexClientManager.getInstance().getResident(
						resSerial);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		this.residentMain = residentMain;
		dateChooser = new JDateChooser();
		setPreferredSize(new Dimension(698, 396));
		setLayout(null);
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 680, 296);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(DEF_COLOR, 1, false));
		add(scrollPane);

		table = new JxTable();
		table.setBackground(Color.WHITE);
		physicianFormJTable = new PhysicianFormJTable();
		table.setModel(physicianFormJTable);

		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {

				if (evt.getClickCount() == 2) {
					doAddorUpdate();
					updatePhysicianFormJTable();
				} else if (evt.getClickCount() == 1) {
					System.out.println("single click");
				}

			}

		});
		/*
		 * table.addMouseListener(new java.awt.event.MouseAdapter() { public
		 * void mouseClicked(java.awt.event.MouseEvent evt) { if
		 * (evt.getClickCount() == 2) {
		 * 
		 * int id = new Integer(physicianFormJTable.getValueAt(table
		 * .getSelectedRow(), 2) + "").intValue(); Global.currentPhysicianKey =
		 * id;
		 * 
		 * framePhysicianFormAdd = new FramePhysicianFormAdd();
		 * SwingUtils.center(framePhysicianFormAdd); framePhysicianFormAdd
		 * .setTitle("View/Update Physician Record");
		 * framePhysicianFormAdd.setModal(true);
		 * framePhysicianFormAdd.setVisible(true); updatePhysicianFormJTable();
		 * } else if (evt.getClickCount() == 1) {
		 * System.out.println("single click"); } } });
		 */

		scrollPane.setViewportView(table);

		final JxButton btnAdd = new JxButton();
		btnAdd.setArc(0.4f);
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setForeground(DEF_COLOR);
		btnAdd.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnAdd.setFont(new Font("", Font.BOLD, 12));
		btnAdd.setBounds(10, 312, 106, 26);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.currentPhysicianKey = 0;
				doSave();
				updatePhysicianFormJTable();
			}
		});
		btnAdd.setText("Add New");
		add(btnAdd);

		final JxButton btnUpdate = new JxButton();
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
			}
		});
		btnUpdate.setArc(0.4f);
		btnUpdate.setBackground(Color.WHITE);
		btnUpdate.setForeground(DEF_COLOR);
		btnUpdate.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnUpdate.setFont(new Font("", Font.BOLD, 12));
		btnUpdate.setBounds(347, 344, 117, 26);

		btnUpdate.setText("View / Update");
		btnUpdate.setVisible(false);
		add(btnUpdate);

		final JxButton btnDelete = new JxButton();
		btnDelete.setArc(0.4f);
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setForeground(DEF_COLOR);
		btnDelete.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnDelete.setFont(new Font("", Font.BOLD, 12));
		btnDelete.setBounds(470, 344, 106, 26);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					int id = new Integer(physicianFormJTable.getValueAt(table
							.getSelectedRow(), 5)
							+ "").intValue();

					MedrexClientManager.getInstance().deletePhysicianForm(id);

					updatePhysicianFormJTable();
				} catch (Exception xe) {

				}

			}
		});
		btnDelete.setText("Delete");
		add(btnDelete);

		final JxButton btnCancel = new JxButton();
		btnCancel.setArc(0.4f);
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setForeground(DEF_COLOR);
		btnCancel.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.setText("Cancel");
		btnCancel.setBounds(582, 344, 106, 26);
		add(btnCancel);

		cmbPhysiciansType = new JxComboBox();
		cmbPhysiciansType.setArc(0.4f);
		cmbPhysiciansType.setBackground(Color.WHITE);
		cmbPhysiciansType.setForeground(DEF_COLOR);
		cmbPhysiciansType.setBorder(new LineBorder(new Color(180, 188, 193), 1,
				false));
		cmbPhysiciansType.setFont(new Font("", Font.BOLD, 12));
		cmbPhysiciansType.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				updatePhysicianSubCategoryCombo();
			}
		});
		cmbPhysiciansType.setBounds(122, 312, 123, 26);
		add(cmbPhysiciansType);

		cmbPhysiciansName = new JxComboBox();
		cmbPhysiciansName.setArc(0.4f);
		cmbPhysiciansName.setBackground(Color.WHITE);
		cmbPhysiciansName.setForeground(DEF_COLOR);
		cmbPhysiciansName.setBorder(new LineBorder(new Color(180, 188, 193), 1,
				false));
		cmbPhysiciansName.setFont(new Font("", Font.BOLD, 12));
		cmbPhysiciansName.setBounds(257, 312, 227, 26);
		add(cmbPhysiciansName);

		/*
		 * final JLabel endDateLabel = new JLabel();
		 * endDateLabel.setForeground(SystemColor.desktop);
		 * endDateLabel.setFont(new Font("", Font.BOLD, 11));
		 * endDateLabel.setText("End Date");
		 * endDateLabel.setBackground(Color.WHITE);
		 * endDateLabel.setForeground(DEF_COLOR); endDateLabel.setBounds(490,
		 * 312, 62, 26); add(endDateLabel);
		 * 
		 * JSpinnerDateEditor dateEditor = new JSpinnerDateEditor(); dateChooser
		 * = new JDateChooser(dateEditor);
		 * dateChooser.setDate(MedrexClientManager.getServerTime());
		 * dateChooser.setForeground(DEF_COLOR);
		 * dateChooser.setDateFormatString("MM/dd/yyyy");
		 * dateChooser.setForeground(DEF_COLOR);
		 * dateEditor.setForeground(DEF_COLOR);
		 * dateEditor.setBackground(Color.white);
		 * 
		 * dateChooser.setBounds(558, 312, 130, 26); add(dateChooser);
		 */

		doUpdate();

	}

	public void doUpdate() {
		updatePhysicianFormJTable();
		updatePhysicianCategoryCombo();
	}

	private void doAddorUpdate() {
		int id = 0;
		if (!(physicianFormJTable.getValueAt(table.getSelectedRow(), 6)
				.equals(""))) {
			id = new Integer(physicianFormJTable.getValueAt(table
					.getSelectedRow(), 6)
					+ "").intValue();
		}
		ControllerUsers controllerUsers = new ControllerUsers();
		controllerUsers.setCurrentSelectedUserType("Physicians");
		controllerUsers.setCurrentSerial(id);
		controllerUsers.setType("residentTabPhy");
		// PanelUsersAdd panelUsersAdd = new PanelUsersAdd(controllerUsers);
		PanelViewPhysiciansInfo panelViewPhysiciansInfo = new PanelViewPhysiciansInfo(
				controllerUsers);
		// panelUsersAdd.openProvider("Resident");
		SwingUtils.openInDialog(panelViewPhysiciansInfo);
	}

	public void updatePhysicianCategoryCombo() {
		/*
		 * cmbPhysiciansType.setModel(new DefaultComboBoxModel(new String[] {
		 * "", "ALT_PHYS", "CLERGY", "DENTIST","OPHTH", "PHYS", "Physicians",
		 * "PODIATRIST", "PSYCH" }));
		 */

		List<MasterList> doctorTypeComboItems = new ArrayList<MasterList>();
		try {
			doctorTypeComboItems = MedrexClientManager.getInstance()
					.getMasterListRecords(DoctorTypes.class);
		} catch (Exception e) {
		}
		cmbPhysiciansType.removeAllItems();
		for (int i = 0; i < doctorTypeComboItems.size(); i++) {
			MasterList m = doctorTypeComboItems.get(i);
			cmbPhysiciansType.addItem(m);
		}
		new DoctorTypes();
		// dType.setId(0);
		// dType.setMsterName(" ");
		// cmbPhysiciansType.insertItemAt(dType, 0);
		cmbPhysiciansType.setSelectedIndex(1);

		updatePhysicianSubCategoryCombo();
	}

	public void updatePhysicianSubCategoryCombo() {
		physicianList = null;
		try {
			// physicianList = MedrexClientManager.getInstance()
			// .getDoctorsRecords((String) cmbPhysiciansType
			// .getSelectedItem());

			int id = MedrexClientManager.getInstance().getMasterList(
					DoctorTypes.class,
					cmbPhysiciansType.getSelectedItem().toString().trim());
			if (id != 0) {
				DoctorTypes dTypes = new DoctorTypes();
				dTypes.setId(id);

				physicianList = MedrexClientManager.getInstance()
						.getDoctorsRecords(dTypes);
			}

		} catch (Exception ex) {
		}
		if (physicianList != null) {
			Iterator i = physicianList.iterator();
			cmbPhysiciansName.removeAllItems();
			while (i.hasNext()) {
				Doctors d = (Doctors) i.next();
				String names = (d.getPhysicianSurName() + ", " + d
						.getPhysicianName());
				cmbPhysiciansName.addItem(names);
			}
		}

	}

	/*
	 * public void updatePhysicianFormJTable() {
	 * 
	 * List l = new ArrayList(); if (Global.currentResidenceKey != 0) { try { l
	 * = MedrexClientManager.getInstance()
	 * .getPhysicianForms(Global.currentResidenceKey);
	 * 
	 * } catch (Exception e) { } } physicianFormJTable.setNewList(l);
	 * physicianFormJTable.fireTableStructureChanged(); table.updateUI();
	 * table.repaint(); }
	 */

	public void updatePhysicianFormJTable() {

		List l = new ArrayList();
		if (residentMain != null) {
			try {
				l = MedrexClientManager.getInstance().getPhysicianForms(
						residentMain.getSerial());

			} catch (Exception e) {
			}
		}
		physicianFormJTable.setNewList(l);
		physicianFormJTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}

	public HashMap getDoctorsMap() {
		HashMap hm = new HashMap();
		List doctors = null;
		try {
			doctors = MedrexClientManager.getInstance().getDoctorsRecords();

			Iterator i = doctors.iterator();
			while (i.hasNext()) {
				Doctors d = (Doctors) i.next();
				hm.put(d.getSerial(), d);
			}

		} catch (Exception e) {

		}

		return hm;

	}

	public void doSave() {
		PhysicianForm refPhysicianForm = new PhysicianForm();
		List physicianFormList = null;
		try {
			physicianFormList = MedrexClientManager.getInstance()
					.getPhysicianForms(residentMain.getSerial());
			/*
			 * physicianFormList = MedrexClientManager.getInstance()
			 * .getPhysicianForms(refPhysicianForm.getResidents().getSerial());
			 */

		} catch (Exception e) {
			e.printStackTrace();
		}
		Doctors d = (Doctors) physicianList.get(cmbPhysiciansName
				.getSelectedIndex());
		refPhysicianForm.setPhysician(d);
		refPhysicianForm.setResident(residentMain);

		refPhysicianForm.setStartDate(MedrexClientManager.getServerTime());
		if (dateChooser.getDate() != null) {
			System.out.println("dateChooser.getDate() ! after====="
					+ dateChooser.getDate());
			refPhysicianForm.setEndDate(dateChooser.getDate());
		}
		String newDoctorType = refPhysicianForm.getPhysician().getDoctorType()
				.toString();
		boolean isPresent = false;
		Iterator i1 = physicianFormList.iterator();
		while (i1.hasNext()) {
			PhysicianForm pf = (PhysicianForm) i1.next();
			// String
			// String
			// previousType=((Doctors)hm.get(pf.getPhysicians())).getDoctorType().toString();
			String previousType = "" + pf.getPhysician().getDoctorType();
			// String previousType =
			// hm.get(pf.getPhysicians().getDoctorType()).toString();
			// String
			// previousType=phsFormRecords.get(pf.getPhysicians().getDoctorType()).toString();

			if (newDoctorType.equalsIgnoreCase(previousType)) {
				isPresent = true;
				if (pf.getEndDate() != null) {
					if ((Utils.DateDifference(MedrexClientManager
							.getServerTime(), pf.getEndDate())) <= 0) {
						isPresent = true;
					}
				}
			}
		}

		if (isPresent) {
			JOptionPane.showMessageDialog(null, newDoctorType
					+ "already exists");
		} else {
			try {
				if (refPhysicianForm.getStartDate() != null
						&& refPhysicianForm.getEndDate() != null) {
					if ((Utils.DateDifference(refPhysicianForm.getEndDate(),
							refPhysicianForm.getStartDate())) < 0) {
						JOptionPane
								.showMessageDialog(this,
										"End Date Should be Gretter Than Current Date!");
					} else {
						Global.currentPhysicianKey = MedrexClientManager
								.getInstance().insertOrUpdatePhysicianForm(
										refPhysicianForm);
					}
				} else {
					Global.currentPhysicianKey = MedrexClientManager
							.getInstance().insertOrUpdatePhysicianForm(
									refPhysicianForm);
				}

				Global.currentPhysicianKey = MedrexClientManager.getInstance()
						.insertOrUpdatePhysicianForm(refPhysicianForm);

			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

	/*
	 * public void doSave() { PhysicianForm refPhysicianForm = new
	 * PhysicianForm();
	 * 
	 * HashMap hm = getDoctorsMap(); Date dbEndDate = null; List
	 * physicianFormList = null; try { physicianFormList =
	 * MedrexClientManager.getInstance()
	 * .getPhysicianForms(Global.currentResidenceKey);
	 * 
	 * } catch (Exception e) {
	 * 
	 * }
	 * 
	 * //refPhysicianForm.setResidentId(Global.currentResidenceKey); // int i =
	 * cmbPhysiciansName.getSelectedIndex(); Doctors d = (Doctors)
	 * physicianList.get(cmbPhysiciansName.getSelectedIndex());
	 * refPhysicianForm.setPhysicianId(d.getSerial());
	 * refPhysicianForm.setStartDate(MedrexClientManager.getServerTime());
	 * if(dateChooser.getDate()!=null){
	 * refPhysicianForm.setEndDate(dateChooser.getDate()); } String
	 * newDoctorType = d.getDoctorType().toString(); boolean isPresent = false;
	 * 
	 * Iterator ii = physicianFormList.iterator();
	 * 
	 * while (ii.hasNext()) { PhysicianForm pf = (PhysicianForm) ii.next();
	 * String previousType = ((Doctors)
	 * hm.get(pf.getPhysicianId())).getDoctorType().toString();
	 * 
	 * if (newDoctorType.equalsIgnoreCase(previousType)) { isPresent = true;
	 * if(pf.getEndDate()!=null){
	 * if((Utils.DateDifference(MedrexClientManager.getServerTime(),
	 * pf.getEndDate())) <= 0){ isPresent = true; } }
	 * 
	 * }
	 * 
	 * } if (isPresent) { JOptionPane.showMessageDialog(null, newDoctorType +
	 * " already exists"); } else { try {
	 * if(refPhysicianForm.getStartDate()!=null &&
	 * refPhysicianForm.getEndDate()!=null){
	 * if((Utils.DateDifference(refPhysicianForm
	 * .getEndDate(),refPhysicianForm.getStartDate())) < 0 ){
	 * JOptionPane.showMessageDialog(this,
	 * "End Date Should be Gretter Than Current Date!"); }else{
	 * Global.currentPhysicianKey = MedrexClientManager.getInstance()
	 * .insertOrUpdatePhysicianForm(refPhysicianForm); } }else{
	 * Global.currentPhysicianKey = MedrexClientManager.getInstance()
	 * .insertOrUpdatePhysicianForm(refPhysicianForm); }
	 * 
	 * Global.currentPhysicianKey = MedrexClientManager.getInstance()
	 * .insertOrUpdatePhysicianForm(refPhysicianForm);
	 * 
	 * } catch (Exception e1) { // TODO Auto-generated catch block
	 * e1.printStackTrace(); } }
	 * 
	 * }
	 */
}

class PhysicianFormJTable extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "Physician Name", "Physician Type",
			"Start Date", "End Date", "Physician Phone", };

	public List l;

	int n = 0;

	PhysicianFormJTable(List l1) {
		l = l1;
	}

	PhysicianFormJTable() {
		l = new ArrayList();
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

	public void setNewList(List physicianRecords) {
		l = physicianRecords;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			PhysicianForm rc = (PhysicianForm) l.get(row);
			SimpleDateFormat df = new SimpleDateFormat();

			if (col == 0) {
				// Doctors d =
				// MedrexClientManager.getInstance().getDoctorsRecord(rc.getPhysicianId());
				if (rc.getPhyName().contains("Dr.")) {
					return (rc.getPhyName() + "," + rc.getPhySurName());

				} else {
					return ("Dr. " + rc.getPhyName() + "," + rc.getPhySurName());
				}
				// MedrexClientManager.getInstance().getDoctorsRecords();
			}
			if (col == 1) {
				// Doctors d =
				// MedrexClientManager.getInstance().getDoctorsRecord(rc
				// .getPhysicianId());
				return rc.getPhyType();
			}
			if (col == 2) {
				df.applyPattern("MM / dd / yyyy");
				return (df.format(rc.getStartDate()));
			}
			if (col == 3) {
				df.applyPattern("MM / dd / yyyy");
				return (df.format(rc.getEndDate()));
			}
			if (col == 4) {
				// Doctors doctor =
				// MedrexClientManager.getInstance().getDoctorsRecord(rc.getPhysicianId());
				return rc.getPhyPhone();
			}
			if (col == 5) {

				return rc.getSerial();
			}
			if (col == 6) {
				return rc.getPhysician().getSerial();
			}
			return ("");
		} catch (Exception e) {
			return ("");
		}

	}
}
