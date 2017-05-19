package medrex.client.main.resident.provider;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.providers.ControllerProvider;
import medrex.client.utils.SwingUtils;
import medrex.client.utils.Utils;
import medrex.commons.vo.masterList.MasterList;
import medrex.commons.vo.masterList.ProviderTypes;
import medrex.commons.vo.providers.ProvidersRecord;
import medrex.commons.vo.providers.ProvidersRecordForm;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxTable;
import com.toedter.calendar.JDateChooser;

public class PanelResidentProviderRecord extends JPanel {

	private JxComboBox cmbProvidersName;
	private static final Color DEF_COLOR = new Color(49, 107, 127);
	private JxComboBox cmbProvidersType;

	List providerList;

	private static final long serialVersionUID = 1L;

	private JxTable table;

	private ResidentProviderJTable residentProviderJTable;
	private ControllerResidentProviderRecord controllerResidentProviderRecord;
	private JDateChooser dateChooser;
	private ResidentMain residentMain;

	public PanelResidentProviderRecord() {
		super();

		int resSerial = Global.currentResidenceKey;
		if (resSerial != 0) {
			try {
				residentMain = MedrexClientManager.getInstance().getResident(
						resSerial);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		this.residentMain = residentMain;

		controllerResidentProviderRecord = new ControllerResidentProviderRecord();

		// Global.panelResidentProviderRecord = this;
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(698, 396));
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});

		final JPanel panel = new JPanel();
		panel.setForeground(SystemColor.desktop);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		add(panel, BorderLayout.CENTER);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 680, 296);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(DEF_COLOR, 1, false));
		panel.add(scrollPane);

		// table = new JxTableMedrex(controllerResidentProviderRecord);

		table = new JxTable();
		residentProviderJTable = new ResidentProviderJTable();
		table.setModel(residentProviderJTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					doAddorUpdate();
					updateResidentProviderJTable();
				}
			}
		});

		scrollPane.setViewportView(table);

		final JxButton btnAdd = new JxButton();
		btnAdd.setArc(0.4f);
		btnAdd.setForeground(DEF_COLOR);
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnAdd.setFont(new Font("", Font.BOLD, 12));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.currentProviderRecordKey = 0;
				doSave();
				updateResidentProviderJTable();
			}
		});
		btnAdd.setText("Add New");
		btnAdd.setBounds(10, 312, 105, 26);
		panel.add(btnAdd);

		final JxButton btnDelete = new JxButton();
		btnDelete.setArc(0.4f);
		btnDelete.setForeground(DEF_COLOR);
		btnDelete.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnDelete.setBackground(Color.WHITE);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					int id = new Integer(residentProviderJTable.getValueAt(
							table.getSelectedRow(), 5)
							+ "").intValue();

					MedrexClientManager.getInstance().deleteProvidersRecord(id);

					updateResidentProviderJTable();
				} catch (Exception xe) {

				}

			}
		});
		btnDelete.setFont(new Font("", Font.BOLD, 12));
		btnDelete.setText("Delete");
		btnDelete.setBounds(470, 344, 106, 26);
		panel.add(btnDelete);

		final JxButton btnCancel = new JxButton();
		btnCancel.setArc(0.4f);
		btnCancel.setForeground(DEF_COLOR);
		btnCancel.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.setText("Cancel");
		btnCancel.setBounds(582, 344, 106, 26);
		panel.add(btnCancel);

		cmbProvidersType = new JxComboBox();
		cmbProvidersType.setArc(0.4f);
		cmbProvidersType.setBorder(new LineBorder(new Color(180, 188, 193), 1,
				false));
		cmbProvidersType.setForeground(DEF_COLOR);
		cmbProvidersType.setBackground(Color.WHITE);
		cmbProvidersType.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				updateProviderSubCategoryCombo();
			}
		});
		cmbProvidersType.setBounds(121, 312, 155, 26);
		cmbProvidersType.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] {}));
		panel.add(cmbProvidersType);

		cmbProvidersName = new JxComboBox();
		cmbProvidersName.setArc(0.4f);
		cmbProvidersName.setBorder(new LineBorder(new Color(180, 188, 193), 1,
				false));
		cmbProvidersName.setForeground(DEF_COLOR);
		cmbProvidersName.setBackground(Color.WHITE);
		cmbProvidersName.setBounds(282, 312, 202, 26);
		panel.add(cmbProvidersName);

		/*
		 * final JLabel endDateLabel = new JLabel(); endDateLabel.setFont(new
		 * Font("", Font.BOLD, 11)); endDateLabel.setText("End Date");
		 * endDateLabel.setBackground(Color.WHITE);
		 * endDateLabel.setForeground(DEF_COLOR); endDateLabel.setBounds(490,
		 * 312, 54, 26); panel.add(endDateLabel);
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
		 * dateChooser.setBounds(550, 312, 140, 26); panel.add(dateChooser);
		 */

		doUpdate();
	}

	public void doUpdate() {
		updateResidentProviderJTable();
		updateProviderCategoryCombo();
	}

	private void doAddorUpdate() {
		int id = 0;
		int serial = 0;
		String strdate = null;
		if (!(residentProviderJTable.getValueAt(table.getSelectedRow(), 6)
				.equals(""))) {
			id = new Integer(residentProviderJTable.getValueAt(table
					.getSelectedRow(), 6)
					+ "").intValue();
		}
		if (!(residentProviderJTable.getValueAt(table.getSelectedRow(), 3)
				.equals(""))) {
			strdate = residentProviderJTable.getValueAt(table.getSelectedRow(),
					3)
					+ "";
		}

		if (!(residentProviderJTable.getValueAt(table.getSelectedRow(), 5)
				.equals(""))) {
			serial = new Integer(residentProviderJTable.getValueAt(table
					.getSelectedRow(), 5)
					+ "").intValue();
		}

		ControllerProvider controllerProvider = new ControllerProvider();
		controllerProvider.setCurrentSerial(id);
		controllerProvider.setType("residentTabPro");
		controllerProvider.setStartDate(strdate);
		controllerProvider.setProviderSerial(serial);
		// PanelProvidersRecordAdd panelProvidersRecordAdd = new
		// PanelProvidersRecordAdd(controllerProvider);
		PanelViewProviderInfo panelViewProviderInfo = new PanelViewProviderInfo(
				controllerProvider);
		SwingUtils.openInDialog(panelViewProviderInfo);
	}

	public void updateProviderCategoryCombo() {
		/*
		 * cmbProvidersType.setModel(new javax.swing.DefaultComboBoxModel( new
		 * String[] {"AMBULANCE", "EMPLOYER",
		 * "FUNERAL","HOSPITAL","MORTUARY","PHARMACY" }));
		 */

		List<MasterList> providerTypesComboItems = new ArrayList<MasterList>();
		try {
			providerTypesComboItems = MedrexClientManager.getInstance()
					.getMasterListRecords(ProviderTypes.class);
		} catch (Exception e) {

		}
		cmbProvidersType.removeAllItems();
		for (int i = 0; i < providerTypesComboItems.size(); i++) {
			MasterList m = providerTypesComboItems.get(i);
			cmbProvidersType.addItem(m);
		}
		new ProviderTypes();
		// providerTypes.setId(0);
		// providerTypes.setMsterName(" ");
		// cmbProvidersType.insertItemAt(providerTypes, 0);
		cmbProvidersType.setSelectedIndex(1);

		updateProviderSubCategoryCombo();
	}

	public void updateProviderSubCategoryCombo() {
		providerList = null;
		try {
			// providerList = MedrexClientManager.getInstance()
			// .getProvidersRecordForms((String) cmbProvidersType
			// .getSelectedItem());

			int id = MedrexClientManager.getInstance().getMasterList(
					ProviderTypes.class,
					cmbProvidersType.getSelectedItem().toString().trim());
			if (id != 0) {
				ProviderTypes pTypes = new ProviderTypes();
				pTypes.setId(id);

				providerList = MedrexClientManager.getInstance()
						.getProvidersRecordForms(pTypes);
			}
		} catch (Exception ex) {
		}
		if (providerList != null) {
			Iterator i = providerList.iterator();
			cmbProvidersName.removeAllItems();
			while (i.hasNext()) {
				ProvidersRecordForm p = (ProvidersRecordForm) i.next();
				String names = (p.getProviderSurName() + "," + p
						.getProviderName());
				cmbProvidersName.addItem(names);
			}
		}

	}

	/*
	 * public void updateResidentProviderJTable() {
	 * 
	 * List l = new ArrayList(); if (Global.currentResidenceKey != 0) { try { l
	 * = MedrexClientManager.getInstance()
	 * .getProvidersRecords(Global.currentResidenceKey);
	 * 
	 * } catch (Exception e) {
	 * 
	 * } } residentProviderJTable.setNewList(l);
	 * residentProviderJTable.fireTableStructureChanged(); table.updateUI();
	 * table.repaint(); }
	 */

	public void updateResidentProviderJTable() {

		List l = new ArrayList();
		if (residentMain != null) {
			try {
				l = MedrexClientManager.getInstance().getProvidersRecords(
						residentMain.getSerial());

			} catch (Exception e) {

			}
		}
		residentProviderJTable.setNewList(l);
		residentProviderJTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}

	public void doSave() {
		ProvidersRecord refProviderRecord = new ProvidersRecord();
		boolean mess = false;
		try {
			int id = MedrexClientManager.getInstance().getMasterList(
					ProviderTypes.class,
					cmbProvidersType.getSelectedItem().toString().trim());
			mess = MedrexClientManager.getInstance().getProvidersRecordsOfType(
					residentMain.getSerial(), id);

		} catch (Exception e) {
			e.printStackTrace();
		}

		if (mess == false) {
			refProviderRecord.setResident(residentMain);
			ProvidersRecordForm p = (ProvidersRecordForm) providerList
					.get(cmbProvidersName.getSelectedIndex());
			refProviderRecord.setProvider(p);
			refProviderRecord.setStartDate(MedrexClientManager.getServerTime());
			try {
				if (refProviderRecord.getStartDate() != null
						&& refProviderRecord.getEndDate() != null) {
					if ((Utils.DateDifference(refProviderRecord.getEndDate(),
							refProviderRecord.getStartDate())) < 0) {
						JOptionPane
								.showMessageDialog(this,
										"End Date should be Greater Than Current Date!");
					} else {
						Global.currentProviderRecordKey = MedrexClientManager
								.getInstance().insertOrUpdateProvidersRecord(
										refProviderRecord);
					}
				}
				Global.currentProviderRecordKey = MedrexClientManager
						.getInstance().insertOrUpdateProvidersRecord(
								refProviderRecord);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			JOptionPane.showMessageDialog(this, cmbProvidersType
					.getSelectedItem()
					+ " already exists");
		}
	}

	/*
	 * public void doSave() {
	 * 
	 * ProvidersRecord refProviderRecord = new ProvidersRecord();
	 * 
	 * boolean mess = false; try { int id =
	 * MedrexClientManager.getInstance().getMasterList(ProviderTypes.class,
	 * cmbProvidersType.getSelectedItem().toString().trim());
	 * 
	 * // mess =
	 * MedrexClientManager.getInstance().getProvidersRecordsOfType(Global
	 * .currentResidenceKey
	 * ,cmbProvidersType.getSelectedItem().toString().trim()); mess =
	 * MedrexClientManager
	 * .getInstance().getProvidersRecordsOfType(Global.currentResidenceKey,id);
	 * } catch (Exception e) {
	 * 
	 * } if(mess==false){
	 * refProviderRecord.setResidentId(Global.currentResidenceKey);
	 * 
	 * ProvidersRecordForm p = (ProvidersRecordForm) providerList
	 * .get(cmbProvidersName.getSelectedIndex());
	 * refProviderRecord.setProviderId(p.getSerial());
	 * refProviderRecord.setStartDate(MedrexClientManager.getServerTime()); //
	 * refProviderRecord.setEndDate(dateChooser.getDate());
	 * 
	 * try { if(refProviderRecord.getStartDate()!=null &&
	 * refProviderRecord.getEndDate()!=null){
	 * if((Utils.DateDifference(refProviderRecord
	 * .getEndDate(),refProviderRecord.getStartDate())) < 0 ){
	 * JOptionPane.showMessageDialog(this,
	 * "End Date Should be Gretter Than Current Date!"); }else{
	 * Global.currentProviderRecordKey = MedrexClientManager.getInstance()
	 * .insertOrUpdateProvidersRecord(refProviderRecord); } }
	 * Global.currentProviderRecordKey = MedrexClientManager.getInstance()
	 * .insertOrUpdateProvidersRecord(refProviderRecord);
	 * 
	 * } catch (Exception e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } } else{ JOptionPane.showMessageDialog(this,
	 * cmbProvidersType.getSelectedItem()+ " already exists"); }
	 * 
	 * }
	 */

}

class ResidentProviderJTable extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "Provider Name", "Provider Type",
			"Provider Phone", "Start Date", "End Date" };

	public List l;

	int n = 0;

	ResidentProviderJTable(List l1) {
		l = l1;
	}

	ResidentProviderJTable() {
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

	public void setNewList(List ls) {
		l = ls;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			ProvidersRecord pr = (ProvidersRecord) l.get(row);
			SimpleDateFormat df = new SimpleDateFormat();
			if (col == 0) {
				// ProvidersRecordForm p = (ProvidersRecordForm)
				// MedrexClientManager.getInstance()
				// .getProvidersRecordForm(pr.getProviderId());
				//
				return pr.getProviderSurName() + ", " + pr.getProviderName();

			}
			if (col == 1) {
				// ProvidersRecordForm p = (ProvidersRecordForm)
				// MedrexClientManager.getInstance()
				// .getProvidersRecordForm(pr.getProviderId());
				return pr.getProviderType();
			}

			if (col == 2) {

				// ProvidersRecordForm p = (ProvidersRecordForm)
				// MedrexClientManager.getInstance()
				// .getProvidersRecordForm(pr.getProviderId());
				return pr.getProviderPhone();
			}

			if (col == 3) {
				df.applyPattern("MM / dd / yyyy");
				return (df.format(pr.getStartDate()));
			}

			if (col == 4) {
				df.applyPattern("MM / dd / yyyy");
				return (df.format(pr.getEndDate()));
			}

			if (col == 5) {

				return pr.getSerial();
			}
			if (col == 6) {
				return pr.getProvider().getSerial();
			}

			return ("");
		} catch (Exception e) {
			return ("");
		}

	}
}
