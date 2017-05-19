package medrex.client.main.resident.payerInfoNew;

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

import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.MsgBox;
import medrex.client.utils.PresentationModel;
import medrex.client.utils.SwingUtils;
import medrex.client.utils.controls.JxTableMedrex;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.masterList.Insurance;
import medrex.commons.vo.masterList.MasterList;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.toedter.calendar.JDateChooser;

public class PanelResidentInfoPayerMain extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6008851667645907178L;
	private JDateChooser dcEffective_date;
	private JxComboBox cmbInsuranceSec;
	private JCheckBox chPrivate;
	private JLabel medicaidLabel;
	private JCheckBox checkboxVA_1;
	private static final Color DEF_COLOR = new Color(49, 107, 127);
	private JTextField txtMedicareNum;
	private JTextField txtMedicalRecordNum;
	private JTextField txtMedicaidNum;

	private JxTableMedrex table;
	private JxComboBox cmbInsurance;

	private JLabel errorLabel;
	private JPanel errorPanel;

	private Map presentationMap;
	private PresentationModel presentationModel;
	private ControllerResidentInfoPayerMain residentInfoPayerMainController;
	private ControllerResidentInfoPayer residentInfoPayerController;
	private int count = 0;

	private boolean isNew;
	private JCheckBox chPartA;
	private JCheckBox chPartB;
	private AbstractButton txtMedicareSecond;

	/**
	 * Create the panel
	 */
	public PanelResidentInfoPayerMain() {
		super();

		presentationMap = new HashMap();
		residentInfoPayerMainController = new ControllerResidentInfoPayerMain();

		setBackground(Color.WHITE);
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});

		setPreferredSize(new Dimension(600, 350));
		setLayout(null);

		errorPanel = new JPanel();
		errorPanel.setLayout(null);
		errorPanel.setBackground(Color.WHITE);
		errorPanel.setBounds(10, 5, 495, 20);
		add(errorPanel);

		errorLabel = new JLabel();
		errorLabel.setBounds(0, 0, 495, 20);
		errorPanel.add(errorLabel);
		errorLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		errorLabel.setForeground(Color.RED);

		chPrivate = new JCheckBox();
		chPrivate.setBackground(Color.WHITE);
		chPrivate.setBounds(130, 30, 14, 18);
		add(chPrivate);

		final JLabel privateLabel = new JLabel();
		privateLabel.setForeground(DEF_COLOR);
		privateLabel.setFont(new Font("", Font.BOLD, 12));
		privateLabel.setText("MEDICARE");
		privateLabel.setText("Private");
		privateLabel.setBounds(30, 30, 72, 14);
		add(privateLabel);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(DEF_COLOR, 1, false));
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBounds(30, 175, 427, 100);
		add(scrollPane);

		residentInfoPayerController = new ControllerResidentInfoPayer(
				residentInfoPayerMainController);

		table = new JxTableMedrex(residentInfoPayerController);
		scrollPane.setViewportView(table);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					isNew = false;
					doAddorUpdate();
				}
			}
		});

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
		Add.setText("Add Payer Info");
		Add.setBounds(480, 180, 120, 26);
		add(Add);

		final JxButton updateButton = new JxButton();
		updateButton.setBackground(Color.WHITE);
		updateButton.setForeground(DEF_COLOR);
		updateButton.setBorder(new LineBorder(new Color(180, 188, 193), 1,
				false));
		updateButton.setArc(0.4f);
		updateButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (table.getSelectedRowCount() > 0) {
					isNew = false;
					doAddorUpdate();
				}
			}
		});
		updateButton.setFont(new Font("", Font.BOLD, 12));
		updateButton.setText("View / Update");
		updateButton.setBounds(480, 210, 120, 26);
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
		deleteButton.setBounds(480, 240, 120, 26);
		add(deleteButton);

		medicaidLabel = new JLabel();
		medicaidLabel.setForeground(DEF_COLOR);
		medicaidLabel.setFont(new Font("", Font.BOLD, 12));
		medicaidLabel.setText("MEDICAID");
		medicaidLabel.setBounds(30, 50, 98, 16);
		add(medicaidLabel);

		txtMedicaidNum = new JTextField();
		presentationMap.put("medicaidNum", txtMedicaidNum);
		txtMedicaidNum.setForeground(DEF_COLOR);
		txtMedicaidNum.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtMedicaidNum.setBounds(130, 50, 162, 20);
		add(txtMedicaidNum);

		final JLabel medicalRecordNoLabel = new JLabel();
		medicalRecordNoLabel.setForeground(DEF_COLOR);
		medicalRecordNoLabel.setFont(new Font("", Font.BOLD, 12));
		medicalRecordNoLabel.setText("MEDICARE");
		medicalRecordNoLabel.setBounds(30, 75, 131, 16);
		add(medicalRecordNoLabel);

		txtMedicalRecordNum = new JTextField();
		presentationMap.put("medicalRecordNum", txtMedicalRecordNum);
		txtMedicalRecordNum.setForeground(DEF_COLOR);
		txtMedicalRecordNum.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtMedicalRecordNum.setBounds(130, 75, 162, 20);
		add(txtMedicalRecordNum);

		final JLabel medicareNoLabel = new JLabel();
		medicareNoLabel.setForeground(DEF_COLOR);
		medicareNoLabel.setFont(new Font("", Font.BOLD, 12));
		medicareNoLabel.setText("INSURANCE");
		medicareNoLabel.setBounds(29, 123, 87, 16);
		add(medicareNoLabel);

		cmbInsuranceSec = new JxComboBox();
		cmbInsuranceSec.setBackground(Color.WHITE);
		presentationMap.put("insuranceSec", cmbInsuranceSec);
		cmbInsuranceSec.setArc(0.4f);
		cmbInsuranceSec.setForeground(DEF_COLOR);
		cmbInsuranceSec.setBounds(211, 146, 171, 20);
		add(cmbInsuranceSec);

		cmbInsurance = new JxComboBox();
		presentationMap.put("insurance", cmbInsurance);

		cmbInsurance.setArc(0.4f);
		cmbInsurance.setBackground(Color.WHITE);
		cmbInsurance.setForeground(DEF_COLOR);
		cmbInsurance.setBounds(211, 121, 169, 20);
		add(cmbInsurance);

		List<MasterList> insuranceComboItems = new ArrayList<MasterList>();
		try {
			insuranceComboItems = MedrexClientManager.getInstance()
					.getMasterListRecords(Insurance.class);
		} catch (Exception e) {

		}
		cmbInsurance.removeAllItems();
		for (int i = 0; i < insuranceComboItems.size(); i++) {
			MasterList m = insuranceComboItems.get(i);
			cmbInsurance.addItem(m);
			cmbInsuranceSec.addItem(m);
		}
		Insurance insurance = new Insurance();
		insurance.setId(0);
		insurance.setMsterName("");
		cmbInsurance.insertItemAt(insurance, 0);
		cmbInsurance.setSelectedIndex(0);

		final JxButton btnSave = new JxButton();
		btnSave.setBackground(Color.WHITE);
		btnSave.setForeground(DEF_COLOR);
		btnSave.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnSave.setArc(0.4f);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSave();
				Global.currentResidenceArgument = Global.currentResidenceKey;
				Global.panelMainDesktopTmp.updateResidentList();
				Global.panelMainDesktopTmp
						.setSelected(Global.currentResidenceKey);
				Global.panelMainDesktopTmp.doUpdate();

				// Global.panelMainDesktopTmp.updateResidentList();
			}
		});
		btnSave.setFont(new Font("", Font.BOLD, 12));
		btnSave.setText("Save");
		btnSave.setBounds(290, 300, 72, 25);
		add(btnSave);

		final JxButton btnCancel = new JxButton();
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setForeground(DEF_COLOR);
		btnCancel.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnCancel.setArc(0.4f);
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.setText("Cancel");
		btnCancel.setBounds(377, 300, 80, 25);
		add(btnCancel);

		final JLabel partALabel = new JLabel();
		partALabel.setForeground(DEF_COLOR);
		partALabel.setFont(new Font("", Font.BOLD, 12));
		partALabel.setText("Part A");
		partALabel.setBounds(133, 98, 56, 16);
		add(partALabel);

		chPartA = new JCheckBox();
		chPartA.setBackground(Color.WHITE);
		chPartA.setBounds(186, 98, 14, 18);
		add(chPartA);

		final JLabel partBLabel = new JLabel();
		partBLabel.setForeground(DEF_COLOR);
		partBLabel.setFont(new Font("", Font.BOLD, 12));
		partBLabel.setText("Part B");
		partBLabel.setBounds(218, 100, 50, 16);
		add(partBLabel);

		chPartB = new JCheckBox();
		chPartB.setBackground(Color.WHITE);
		chPartB.setBounds(267, 99, 14, 18);
		add(chPartB);

		final JLabel medicareNoLabel_1 = new JLabel();
		medicareNoLabel_1.setFont(new Font("", Font.BOLD, 12));
		medicareNoLabel_1.setForeground(DEF_COLOR);
		medicareNoLabel_1.setText("SECONDARY INSURANCE");
		medicareNoLabel_1.setBounds(28, 145, 164, 16);
		add(medicareNoLabel_1);

		final JLabel effLabel = new JLabel();
		effLabel.setForeground(DEF_COLOR);
		effLabel.setFont(new Font("", Font.BOLD, 12));
		effLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		effLabel.setText("EFFECTIVE DATE");
		effLabel.setBounds(290, 101, 106, 14);
		add(effLabel);

		dcEffective_date = new JDateChooser();
		dcEffective_date.setBorder(new LineBorder(DEF_COLOR, 1, false));
		dcEffective_date.setDateFormatString("MM/dd/yyyy");
		dcEffective_date.setBounds(398, 100, 98, 20);
		add(dcEffective_date);

		updateData();

		presentationModel = new PresentationModel(presentationMap,
				ResidentMain.class, residentInfoPayerMainController, errorLabel);

		presentationModel.validateAll();
	}

	public void doUpdate() {
		updateTable();
		// updateData();
	}

	public void doSave() {
		if (Global.currentResidenceKey != 0) {
			ResidentMain resMain = null;
			try {
				resMain = residentInfoPayerMainController.getCurrentResident();
			} catch (MedrexException me) {
				JOptionPane.showMessageDialog(null, me.getMessage());
			}
			if (resMain.getMedicalRecordNum() != null
					&& (!txtMedicalRecordNum.getText().equals(""))) {
				if (resMain.getInsuranceCount() != 0) {
					resMain.setInsuranceCount(resMain.getInsuranceCount());
				} else {
					resMain.setInsuranceCount(100);
				}
			}
			// System.out.println("**********************************" +
			// Global.currentResidenceKey);
			resMain.setMedicaidNum(txtMedicaidNum.getText());
			resMain.setMedicalRecordNum(txtMedicalRecordNum.getText());
			resMain.setInsurance((Insurance) cmbInsurance.getSelectedItem());
			resMain.setInsuranceSec((Insurance) cmbInsuranceSec
					.getSelectedItem());
			resMain.setEff_dte(dcEffective_date.getDate());
			resMain.setPrivate(chPrivate.isSelected());
			resMain.setPartA(chPartA.isSelected());
			resMain.setPartB(chPartB.isSelected());
			List errors = residentInfoPayerMainController.doValidate(resMain,
					"");
			if (errors.size() > 0) {
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
					residentInfoPayerMainController
							.insertOrUpdateResidentMainNew(resMain);
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

	public void updateData() {
		if (Global.currentResidenceKey != 0) {
			ResidentMain resMain = null;
			try {
				resMain = residentInfoPayerMainController.getCurrentResident();
			} catch (MedrexException me) {
				JOptionPane.showMessageDialog(null, me.getMessage());
			}
			txtMedicaidNum.setText(resMain.getMedicaidNum());
			txtMedicalRecordNum.setText(resMain.getMedicalRecordNum());
			cmbInsurance.setSelectedItem(resMain.getInsurance());
			cmbInsuranceSec.setSelectedItem(resMain.getInsuranceSec());

			dcEffective_date.setDate(resMain.getEff_dte());

			chPrivate.setSelected(resMain.isPrivate());
			chPartA.setSelected(resMain.isPartA());
			chPartB.setSelected(resMain.isPartB());
			if (resMain.getInsuranceCount() != 0) {
				count = resMain.getInsuranceCount();
				int first = resMain.getInsuranceCount() - 80;
				if (first != 0) {
				}
				if (first <= 0) {
				}
				if (resMain.getInsuranceCount() >= 80) {
				} else {
					txtMedicareSecond.setText(resMain.getInsuranceCount() + "");
				}
			}

		} else {
			txtMedicaidNum.setText("");
			txtMedicalRecordNum.setText("");
			cmbInsurance.setSelectedIndex(0);
		}
		residentInfoPayerController.updateResidentInfoPayerList();

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
		String medicaidNum = txtMedicaidNum.getText();
		String medicalRecordNum = txtMedicalRecordNum.getText();
		String insurance = cmbInsurance.getSelectedItem() + "";
		String insuranceSec = cmbInsuranceSec.getSelectedItem() + "";
		boolean boolPrivate = chPrivate.isSelected();

		PanelResidentInfoPayerAdd panelResidentInfoPayerAdd = new PanelResidentInfoPayerAdd(
				residentInfoPayerController, medicaidNum, medicalRecordNum,
				insurance, insuranceSec, boolPrivate, count);
		SwingUtils.openInDialog(panelResidentInfoPayerAdd);
		updateTable();
	}

	public void doDelete() {
		setSelectedRow();
		residentInfoPayerController.deleteCurrentResidentInfoPayer();
		updateTable();
	}

}
