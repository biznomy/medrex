package medrex.client.main.resident.payerInfo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldFormatter;
import medrex.client.utils.MsgBox;
import medrex.client.utils.PresentationModel;
import medrex.client.utils.SwingUtils;
import medrex.client.utils.controls.JxTableMedrex;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.masterList.County;
import medrex.commons.vo.masterList.MasterList;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JSpinnerDateEditor;

public class PanelResidentInfoPayerMain extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3713136348002058500L;
	private JTextArea txtAdditionalInfo;
	private JCheckBox checkboxVA_1;
	private static final Color DEF_COLOR = new Color(49, 107, 127);
	private JLabel errorLabel;
	private JPanel errorPanel;
	private JTextField txtSecondaryInsId;
	private JTextField txtSecondaryIns;
	private JxComboBox cmbCounty;
	private JFormattedTextField txtMedicaidNum;
	private JTextField txtMedicareNum;
	private JFormattedTextField txtMedicalRecordNum;
	private JFormattedTextField txtInsuranceNum;

	private JxTableMedrex table;

	private JDateChooser dateCurrentAdmit;
	private JDateChooser dateDischarge;
	private JDateChooser dateOrignigalAdmit;

	private JCheckBox cbMc;
	private JCheckBox cbVa;

	private Map presentationMap;
	private PresentationModel presentationModel;
	private ControllerResidentInfoPayerMain residentInfoPayerMainController;
	private ControllerResidentInfoPayer residentInfoPayerController;

	boolean isNew;
	private JCheckBox cbServedInArmy;

	// private ResidentInfoPayerController residentInfoPayerController;

	/**
	 * Create the panel
	 */
	public PanelResidentInfoPayerMain() {
		super();

		presentationMap = new HashMap();
		residentInfoPayerMainController = new ControllerResidentInfoPayerMain();

		Global.panelResidentInfoPayerMainTmp = this;
		setBackground(Color.WHITE);
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});

		setPreferredSize(new Dimension(698, 396));
		setLayout(null);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(DEF_COLOR, 1, false));
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBounds(10, 10, 427, 100);
		add(scrollPane);

		residentInfoPayerController = new ControllerResidentInfoPayer(
				residentInfoPayerMainController);

		table = new JxTableMedrex(residentInfoPayerController);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					isNew = false;
					doAddorUpdate();
				}
			}
		});
		scrollPane.setViewportView(table);

		final JxButton Add = new JxButton();
		Add.setBackground(Color.WHITE);
		Add.setForeground(DEF_COLOR);
		Add.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		Add.setArc(0.4f);
		Add.setFont(new Font("", Font.BOLD, 12));
		Add.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				isNew = true;
				doAddorUpdate();
			}
		});
		Add.setText("Add New Payer");
		Add.setBounds(453, 10, 120, 26);
		add(Add);

		final JxButton updateButton = new JxButton();
		updateButton.setBackground(Color.WHITE);
		updateButton.setForeground(DEF_COLOR);
		updateButton.setBorder(new LineBorder(new Color(180, 188, 193), 1,
				false));
		updateButton.setArc(0.4f);
		updateButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				isNew = false;
				doAddorUpdate();

			}
		});
		updateButton.setFont(new Font("", Font.BOLD, 12));
		updateButton.setText("View / Update");
		updateButton.setBounds(453, 42, 120, 26);
		add(updateButton);

		final JxButton deleteButton = new JxButton();
		deleteButton.setBackground(Color.WHITE);
		deleteButton.setForeground(DEF_COLOR);
		deleteButton.setBorder(new LineBorder(new Color(180, 188, 193), 1,
				false));
		deleteButton.setArc(0.4f);
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doDelete();
			}
		});
		deleteButton.setFont(new Font("", Font.BOLD, 12));
		deleteButton.setText("Delete");
		deleteButton.setBounds(453, 74, 120, 26);
		add(deleteButton);

		final JLabel insuaranceNLabel = new JLabel();
		insuaranceNLabel.setForeground(DEF_COLOR);
		insuaranceNLabel.setFont(new Font("", Font.BOLD, 12));
		insuaranceNLabel.setText("INSURANCE NO.");
		insuaranceNLabel.setBounds(10, 129, 98, 16);
		add(insuaranceNLabel);

		txtInsuranceNum = new JFormattedTextField(FieldFormatter.GENERAL);
		presentationMap.put("insuranceNum", txtInsuranceNum);
		txtInsuranceNum.setForeground(DEF_COLOR);
		txtInsuranceNum.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtInsuranceNum.setBounds(158, 127, 131, 20);
		add(txtInsuranceNum);

		final JLabel originalAdmitDateLabel = new JLabel();
		originalAdmitDateLabel.setForeground(DEF_COLOR);
		originalAdmitDateLabel.setFont(new Font("", Font.BOLD, 12));
		originalAdmitDateLabel.setText("ORIGINAL ADMIT DATE");
		originalAdmitDateLabel.setBounds(295, 129, 142, 16);
		add(originalAdmitDateLabel);

		dateOrignigalAdmit = new JDateChooser(new JSpinnerDateEditor());
		presentationMap.put("originalAdmitDate", dateOrignigalAdmit);
		dateOrignigalAdmit.setForeground(DEF_COLOR);
		dateOrignigalAdmit.setDateFormatString("MM/dd/yyyy");
		dateOrignigalAdmit.setBounds(442, 127, 131, 20);
		// dateOrignigalAdmit.setDate(new Date("1/1/1970"));
		add(dateOrignigalAdmit);

		final JLabel medicalRecordNoLabel = new JLabel();
		medicalRecordNoLabel.setForeground(DEF_COLOR);
		medicalRecordNoLabel.setFont(new Font("", Font.BOLD, 12));
		medicalRecordNoLabel.setText("MEDICAL RECORD NO.");
		medicalRecordNoLabel.setBounds(10, 154, 131, 16);
		add(medicalRecordNoLabel);

		txtMedicalRecordNum = new JFormattedTextField(FieldFormatter.GENERAL);
		presentationMap.put("medicalRecordNum", txtMedicalRecordNum);
		txtMedicalRecordNum.setForeground(DEF_COLOR);
		txtMedicalRecordNum.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtMedicalRecordNum.setBounds(158, 153, 131, 20);
		add(txtMedicalRecordNum);

		final JLabel lbllll = new JLabel();
		lbllll.setForeground(DEF_COLOR);
		lbllll.setFont(new Font("", Font.BOLD, 12));
		lbllll.setText("CURRENT ADMIT DATE");
		lbllll.setBounds(295, 154, 142, 16);
		add(lbllll);

		dateCurrentAdmit = new JDateChooser(new JSpinnerDateEditor());
		presentationMap.put("currentAdmitDate", dateCurrentAdmit);
		dateCurrentAdmit.setForeground(DEF_COLOR);
		dateCurrentAdmit.setDateFormatString("MM/dd/yyyy");
		dateCurrentAdmit.setBounds(442, 153, 131, 20);
		// dateCurrentAdmit.setDate(new Date("1/1/1970"));
		add(dateCurrentAdmit);

		final JLabel medicareNoLabel = new JLabel();
		medicareNoLabel.setForeground(DEF_COLOR);
		medicareNoLabel.setFont(new Font("", Font.BOLD, 12));
		medicareNoLabel.setText("MEDICARE NO.");
		medicareNoLabel.setBounds(10, 180, 120, 16);
		add(medicareNoLabel);

		txtMedicareNum = new JTextField();
		presentationMap.put("medicareNum", txtMedicareNum);
		txtMedicareNum.setForeground(DEF_COLOR);
		txtMedicareNum.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtMedicareNum.setBounds(158, 179, 131, 20);
		add(txtMedicareNum);

		final JLabel date = new JLabel();
		date.setForeground(DEF_COLOR);
		date.setFont(new Font("", Font.BOLD, 12));
		date.setText("DISCHARGE");
		date.setBounds(295, 180, 131, 16);
		add(date);

		dateDischarge = new JDateChooser(new JSpinnerDateEditor());
		presentationMap.put("dischargeDate", dateDischarge);
		dateDischarge.setForeground(DEF_COLOR);
		dateDischarge.setDateFormatString("MM/dd/yyyy");
		dateDischarge.setBounds(442, 179, 131, 20);
		// dateDischarge.setDate(new Date("1/1/1970"));
		add(dateDischarge);

		final JLabel medicaidMedicalLabel = new JLabel();
		medicaidMedicalLabel.setForeground(DEF_COLOR);
		medicaidMedicalLabel.setFont(new Font("", Font.BOLD, 12));
		medicaidMedicalLabel.setText("MEDICAID / MEDI-CAL");
		medicaidMedicalLabel.setBounds(10, 206, 131, 16);
		add(medicaidMedicalLabel);

		txtMedicaidNum = new JFormattedTextField(FieldFormatter.GENERAL);
		presentationMap.put("medicaidNum", txtMedicaidNum);
		txtMedicaidNum.setForeground(DEF_COLOR);
		txtMedicaidNum.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtMedicaidNum.setBounds(158, 205, 131, 20);
		add(txtMedicaidNum);

		final JLabel countryLabel = new JLabel();
		countryLabel.setForeground(DEF_COLOR);
		countryLabel.setFont(new Font("", Font.BOLD, 12));
		countryLabel.setText("COUNTY");
		countryLabel.setBounds(295, 206, 131, 16);
		add(countryLabel);

		cmbCounty = new JxComboBox();
		presentationMap.put("county", cmbCounty);
		cmbCounty.setBackground(Color.WHITE);
		cmbCounty.setForeground(DEF_COLOR);
		cmbCounty.setArc(0.4f);
		cmbCounty.setBorder(new LineBorder(DEF_COLOR, 1, false));
		// cmbCounty.setModel(new javax.swing.DefaultComboBoxModel(new String[]
		// {
		// " ", "UNION", "ESSEX","HUNTERDON","SOMERSET" }));
		cmbCounty.setBounds(442, 205, 131, 20);
		add(cmbCounty);

		List<MasterList> countyComboItems = new ArrayList<MasterList>();
		try {
			countyComboItems = MedrexClientManager.getInstance()
					.getMasterListRecords(County.class);
		} catch (Exception e) {

		}

		cmbCounty.removeAllItems();
		for (int i = 0; i < countyComboItems.size(); i++) {
			MasterList m = countyComboItems.get(i);
			cmbCounty.addItem(m);
		}
		County c = new County();
		c.setId(0);
		c.setMsterName(" ");
		cmbCounty.insertItemAt(c, 0);
		cmbCounty.setSelectedIndex(0);

		final JLabel secondaryInsLabel = new JLabel();
		secondaryInsLabel.setForeground(DEF_COLOR);
		secondaryInsLabel.setFont(new Font("", Font.BOLD, 12));
		secondaryInsLabel.setText("SECONDARY INS.");
		secondaryInsLabel.setBounds(10, 232, 131, 16);
		add(secondaryInsLabel);

		txtSecondaryIns = new JTextField();
		presentationMap.put("secondaryIns", txtSecondaryIns);
		txtSecondaryIns.setForeground(DEF_COLOR);
		txtSecondaryIns.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtSecondaryIns.setBounds(158, 231, 131, 20);
		add(txtSecondaryIns);

		final JLabel mcCoLabel = new JLabel();
		mcCoLabel.setForeground(DEF_COLOR);
		mcCoLabel.setFont(new Font("", Font.BOLD, 12));
		mcCoLabel.setText("MC / CO INS");
		mcCoLabel.setBounds(295, 232, 87, 16);
		add(mcCoLabel);

		cbMc = new JCheckBox();
		cbMc.setForeground(DEF_COLOR);
		cbMc.setBackground(Color.WHITE);
		cbMc.setBounds(442, 231, 14, 20);
		add(cbMc);

		final JLabel secondaryInsLabel_1 = new JLabel();
		secondaryInsLabel_1.setForeground(DEF_COLOR);
		secondaryInsLabel_1.setFont(new Font("", Font.BOLD, 12));
		secondaryInsLabel_1.setText("SECONDARY INS. ID# ");
		secondaryInsLabel_1.setBounds(10, 258, 131, 16);
		add(secondaryInsLabel_1);

		txtSecondaryInsId = new JTextField();
		presentationMap.put("secondaryInsId", txtSecondaryInsId);
		txtSecondaryInsId.setForeground(DEF_COLOR);
		txtSecondaryInsId.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtSecondaryInsId.setBounds(158, 257, 131, 20);
		add(txtSecondaryInsId);

		final JLabel vaLabel = new JLabel();
		vaLabel.setForeground(DEF_COLOR);
		vaLabel.setFont(new Font("", Font.BOLD, 12));
		vaLabel.setText("V.A");
		vaLabel.setBounds(295, 256, 66, 20);
		add(vaLabel);

		cbVa = new JCheckBox();
		cbVa.setForeground(DEF_COLOR);
		cbVa.setBackground(Color.WHITE);
		cbVa.setBounds(442, 257, 14, 20);
		add(cbVa);

		final JxButton btnSave = new JxButton();
		btnSave.setBackground(Color.WHITE);
		btnSave.setForeground(DEF_COLOR);
		btnSave.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnSave.setArc(0.4f);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				// if(doValidate())
				// {
				doSave();

				// }
			}
		});
		btnSave.setFont(new Font("", Font.BOLD, 12));
		btnSave.setText("Save");
		btnSave.setBounds(553, 353, 60, 25);
		add(btnSave);

		final JxButton btnCancel = new JxButton();
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setForeground(DEF_COLOR);
		btnCancel.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnCancel.setArc(0.4f);
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.setText("Cancel");
		btnCancel.setBounds(619, 353, 60, 25);
		add(btnCancel);

		errorPanel = new JPanel();
		errorPanel.setLayout(null);
		errorPanel.setBackground(Color.WHITE);
		errorPanel.setBounds(10, 358, 495, 20);
		add(errorPanel);

		final JLabel additionalInfoLabel = new JLabel();
		additionalInfoLabel.setForeground(DEF_COLOR);
		additionalInfoLabel.setFont(new Font("", Font.BOLD, 12));
		additionalInfoLabel.setText("ADDITIONAL INFORMATION");
		additionalInfoLabel.setBounds(10, 283, 151, 16);
		add(additionalInfoLabel);

		final JLabel servedInArmyLabel = new JLabel();
		servedInArmyLabel.setForeground(DEF_COLOR);
		servedInArmyLabel.setFont(new Font("", Font.BOLD, 12));
		servedInArmyLabel.setText("SERVED IN ARMY");
		servedInArmyLabel.setBounds(295, 281, 131, 20);
		add(servedInArmyLabel);

		final JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setForeground(DEF_COLOR);
		scrollPane_1.setBorder(new LineBorder(DEF_COLOR, 1, false));
		scrollPane_1.setBounds(10, 304, 563, 43);
		add(scrollPane_1);

		txtAdditionalInfo = new JTextArea();
		scrollPane_1.setViewportView(txtAdditionalInfo);

		cbServedInArmy = new JCheckBox();
		cbServedInArmy.setForeground(DEF_COLOR);
		cbServedInArmy.setBackground(Color.WHITE);
		cbServedInArmy.setBounds(442, 279, 14, 20);
		add(cbServedInArmy);

		errorLabel = new JLabel();
		errorLabel.setBounds(0, 0, 495, 20);
		errorPanel.add(errorLabel);
		errorLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		errorLabel.setForeground(Color.RED);

		presentationModel = new PresentationModel(presentationMap,
				ResidentMain.class, residentInfoPayerMainController, errorLabel);

		//
		updateData();

		presentationModel.validateAll();
	}

	public void doUpdate() {
		updateTable();
		updateData();
	}

	public void doSave() {
		if (Global.currentResidenceKey != 0) {
			ResidentMain resMain = null;
			try {
				resMain = residentInfoPayerMainController.getCurrentResident();
			} catch (MedrexException me) {
				JOptionPane.showMessageDialog(null, me.getMessage());
			}
			resMain.setInsuranceNum(txtInsuranceNum.getText());
			resMain.setMedicalRecordNum(txtMedicalRecordNum.getText());
			resMain.setMedicareNum(txtMedicareNum.getText());
			resMain.setMedicaidNum(txtMedicaidNum.getText());
			resMain.setSecondaryIns(txtSecondaryIns.getText());
			resMain.setSecondaryInsId(txtSecondaryInsId.getText());

			resMain.setOriginalAdmitDate(dateOrignigalAdmit.getDate());
			resMain.setCurrentAdmitDate(dateCurrentAdmit.getDate());
			resMain.setDischargeDate((dateDischarge.getDate()));
			if (cmbCounty.getSelectedItem() == null) {
				resMain.setCounty(null);
			} else {
				resMain.setCounty((County) cmbCounty.getSelectedItem());
			}

			if (cbMc.isSelected()) {
				resMain.setMcIns(1);
			} else {
				resMain.setMcIns(0);
			}

			if (cbVa.isSelected()) {
				resMain.setVa(1);
			} else {
				resMain.setVa(0);
			}

			if (cbServedInArmy.isSelected()) {
				resMain.setServedInArmy(1);
			} else {
				resMain.setServedInArmy(0);
			}

			resMain.setAdditionalInfo(txtAdditionalInfo.getText());

			List errors = residentInfoPayerMainController.doValidate(resMain,
					"");
			if (errors.size() > 0) {
				// JOptionPane.showMessageDialog(null, "error");
				MsgBox m = new MsgBox();
				Iterator itr = errors.iterator();
				String strError = "";
				while (itr.hasNext()) {
					strError += (String) itr.next() + "\n";
				}
				m.addPrompt(strError);
				m.setTitle("Error saving payer info");
				m.setVisible(true);
			} else {
				try {
					// Global.currentResidenceKey =
					// MedrexClientManager.getInstance()
					// .insertOrUpdateResidentMain(resMain);
					residentInfoPayerMainController
							.insertOrUpdateResidentMain(resMain);
					JOptionPane.showMessageDialog(this, "Saved successfully");
				} catch (MedrexException me) {
					JOptionPane.showMessageDialog(null, me.getMessage());
				}

			}

		} else {
			JOptionPane.showMessageDialog(this,
					"Please save Resident information first");
		}
	}

	// public void updatePayerJTable() {
	// List residentPayers = new ArrayList();
	// if (Global.currentResidenceKey != 0) {
	// try {
	// residentPayers = MedrexClientManager.getInstance()
	// .getResidentPayers(Global.currentResidenceKey);
	// } catch (Exception eee) {
	//
	// }
	// }
	// // payerJTable.setNewList(residentPayers);
	// // payerJTable.fireTableStructureChanged();
	// table.updateUI();
	// table.repaint();
	// }

	public void updateData() {
		if (Global.currentResidenceKey != 0) {
			ResidentMain resMain = null;
			try {
				resMain = residentInfoPayerMainController.getCurrentResident();
			} catch (MedrexException me) {
				JOptionPane.showMessageDialog(null, me.getMessage());
			}
			txtInsuranceNum.setValue(resMain.getInsuranceNum());
			txtMedicalRecordNum.setValue(resMain.getMedicalRecordNum());
			txtMedicareNum.setText(resMain.getMedicareNum());
			txtMedicaidNum.setValue(resMain.getMedicaidNum());
			txtSecondaryIns.setText(resMain.getSecondaryIns());
			txtSecondaryInsId.setText(resMain.getSecondaryInsId());
			dateOrignigalAdmit.setDate(resMain.getOriginalAdmitDate());
			dateCurrentAdmit.setDate(resMain.getCurrentAdmitDate());
			dateDischarge.setDate(resMain.getDischargeDate());
			cmbCounty.setSelectedItem(resMain.getCounty());
			txtAdditionalInfo.setText(resMain.getAdditionalInfo());

			if (resMain.getMcIns() == 0) {
				cbMc.setSelected(false);
			} else {
				cbMc.setSelected(true);
			}

			if (resMain.getVa() == 0) {
				cbVa.setSelected(false);
			} else {
				cbVa.setSelected(true);
			}

			if (resMain.getServedInArmy() == 0) {
				cbServedInArmy.setSelected(false);
			} else {
				cbServedInArmy.setSelected(true);
			}
		} else {
			txtInsuranceNum.setText("");
			txtMedicalRecordNum.setText("");
			txtMedicareNum.setText("");
			txtMedicaidNum.setText("");
			txtSecondaryIns.setText("");
			txtSecondaryInsId.setText("");
			dateOrignigalAdmit.setDate(null);
			dateCurrentAdmit.setDate(null);
			dateDischarge.setDate(null);
			cbMc.setSelected(false);
			cbVa.setSelected(false);
			cmbCounty.setSelectedIndex(0);

		}

		residentInfoPayerController.updateResidentInfoPayerList();

		presentationModel = new PresentationModel(presentationMap,
				ResidentMain.class, residentInfoPayerMainController, errorLabel);
		presentationModel.validateAll();
		updateTable();

	}

	public void updateTable() {
		table.update();
	}

	public void setSelectedRow() {
		int selectedRow = -1;
		if (!isNew) {
			try {
				selectedRow = table.getSelectedRow();
			} catch (Exception e) {

			}
		}
		if (selectedRow == -1) {
			residentInfoPayerController.setSelectedPayer(-1);
		} else {
			residentInfoPayerController.setSelectedPayer(selectedRow);
		}

	}

	public void doAddorUpdate() {
		setSelectedRow();
		PanelResidentInfoPayerAdd panelResidentInfoPayerAdd = new PanelResidentInfoPayerAdd(
				residentInfoPayerController);
		SwingUtils.openInDialog(panelResidentInfoPayerAdd);
		updateTable();
	}

	public void doDelete() {
		setSelectedRow();
		residentInfoPayerController.deleteCurrentResidentInfoPayer();
		updateTable();
	}

}
