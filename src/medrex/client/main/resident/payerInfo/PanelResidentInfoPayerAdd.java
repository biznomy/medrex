package medrex.client.main.resident.payerInfo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

import medrex.client.PanelImage;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.utils.MsgBox;
import medrex.client.utils.PresentationModel;
import medrex.commons.enums.GuiModes;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.masterList.Insurance;
import medrex.commons.vo.masterList.MasterList;
import medrex.commons.vo.masterList.MedicareDays;
import medrex.commons.vo.masterList.PayerResponsibleParty;
import medrex.commons.vo.masterList.PayerType;
import medrex.commons.vo.resident.ResidentPayer;

import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.toedter.calendar.JDateChooser;

public class PanelResidentInfoPayerAdd extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8894711199143652381L;
	private JLabel errorLabel;
	private JPanel errorPanel;
	private JTextField txtAutorizationCode;
	private JxComboBox cmbUsedMedicareDays;
	private JxComboBox cmbInsurance;
	private JxComboBox comboBox_1;
	private JxComboBox cmbPayerType;

	private JDateChooser dateEffective;
	private JDateChooser dateEnd;

	private Map myMap;
	private PresentationModel presentationModel;

	private ControllerResidentInfoPayer residentInfoPayerController;
	private ControllerResidentInfoPayerMain residentInfoPayerMainController;

	private static final Color DEF_COLOR = new Color(49, 104, 127);

	/**
	 * Create the panel
	 */

	public PanelResidentInfoPayerAdd(
			ControllerResidentInfoPayer residentInfoPayerController) {
		super();

		myMap = new HashMap();
		this.residentInfoPayerController = residentInfoPayerController;

		setBackground(Color.WHITE);
		// Global.panelResidentInfoPayerAdd = this;
		setLayout(null);
		setBounds(1100, 100, 400, 410);

		errorPanel = new JPanel();
		errorPanel.setLayout(null);
		errorPanel.setBackground(Color.WHITE);
		errorPanel.setBounds(10, 0, 495, 20);
		add(errorPanel);

		errorLabel = new JLabel();
		errorLabel.setBounds(0, 0, 495, 20);
		errorPanel.add(errorLabel);
		errorLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		errorLabel.setForeground(Color.RED);

		final JLabel payerTypeLabel = new JLabel();
		payerTypeLabel.setForeground(DEF_COLOR);
		payerTypeLabel.setFont(new Font("", Font.BOLD, 12));
		payerTypeLabel.setText("PAYER TYPE");
		payerTypeLabel.setBounds(22, 25, 118, 16);
		add(payerTypeLabel);

		cmbPayerType = new JxComboBox();
		myMap.put("payerType", cmbPayerType);
		cmbPayerType.setArc(0.4f);
		cmbPayerType.setBackground(Color.WHITE);
		cmbPayerType.setForeground(DEF_COLOR);
		// cmbPayerType.setModel(new javax.swing.DefaultComboBoxModel(
		// new String[] { " ", "Private", "Commercial", "Medicaid",
		// "Medicare", "Hospice", "Respit" }));
		cmbPayerType.setBounds(161, 21, 192, 25);
		add(cmbPayerType);

		final JLabel effectiveDateLabel = new JLabel();
		effectiveDateLabel.setForeground(DEF_COLOR);
		effectiveDateLabel.setFont(new Font("", Font.BOLD, 12));
		effectiveDateLabel.setText("EFFECTIVE DATE");
		effectiveDateLabel.setBounds(22, 63, 118, 16);
		add(effectiveDateLabel);

		final JLabel endDateLabel = new JLabel();
		endDateLabel.setForeground(DEF_COLOR);
		endDateLabel.setFont(new Font("", Font.BOLD, 12));
		endDateLabel.setText("END DATE");
		endDateLabel.setBounds(22, 97, 118, 16);
		add(endDateLabel);

		dateEffective = new JDateChooser();
		myMap.put("effectiveDate", dateEffective);
		dateEffective.setBackground(Color.WHITE);
		dateEffective.setForeground(DEF_COLOR);
		dateEffective.setDateFormatString("MM/dd/yyyy");
		dateEffective.setBounds(161, 59, 192, 20);
		add(dateEffective);

		dateEnd = new JDateChooser();
		myMap.put("endDate", dateEnd);
		dateEnd.setBackground(Color.WHITE);
		dateEnd.setForeground(DEF_COLOR);
		dateEnd.setDateFormatString("MM/dd/yyyy");
		dateEnd.setBounds(161, 97, 192, 20);
		add(dateEnd);

		final JLabel responsiblePartyLabel = new JLabel();
		responsiblePartyLabel.setForeground(DEF_COLOR);
		responsiblePartyLabel.setFont(new Font("", Font.BOLD, 12));
		responsiblePartyLabel.setText("RESPONSIBLE PARTY");
		responsiblePartyLabel.setBounds(22, 135, 132, 16);
		add(responsiblePartyLabel);

		comboBox_1 = new JxComboBox();
		myMap.put("responsibleParty", comboBox_1);
		comboBox_1.setArc(0.4f);
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setForeground(DEF_COLOR);
		comboBox_1.setActionCommand("cmbResponsibleParty");
		// comboBox_1.setModel(new javax.swing.DefaultComboBoxModel(new String[]
		// {
		// " ", "Party1", "Party2", "Party3" }));
		comboBox_1.setBounds(161, 131, 192, 25);
		add(comboBox_1);

		final JLabel insuranceLabel = new JLabel();
		insuranceLabel.setForeground(DEF_COLOR);
		insuranceLabel.setFont(new Font("", Font.BOLD, 12));
		insuranceLabel.setText("INSURANCE");
		insuranceLabel.setBounds(22, 174, 66, 16);
		add(insuranceLabel);

		cmbInsurance = new JxComboBox();
		myMap.put("insurance", cmbInsurance);
		cmbInsurance.setArc(0.4f);
		cmbInsurance.setBackground(Color.WHITE);
		cmbInsurance.setForeground(DEF_COLOR);
		// cmbInsurance
		// .setModel(new javax.swing.DefaultComboBoxModel(new String[] {
		// " ", "Insurance1", "Insurance2", "Insurance3" }));
		cmbInsurance.setBounds(161, 170, 192, 25);
		add(cmbInsurance);

		final JLabel usedMeLabel = new JLabel();
		usedMeLabel.setForeground(DEF_COLOR);
		usedMeLabel.setFont(new Font("", Font.BOLD, 12));
		usedMeLabel.setText("USED MEDICARE DAYS");
		usedMeLabel.setBounds(22, 213, 132, 16);
		add(usedMeLabel);

		cmbUsedMedicareDays = new JxComboBox();
		myMap.put("usedMedicalDays", cmbUsedMedicareDays);
		cmbUsedMedicareDays.setArc(0.4f);
		cmbUsedMedicareDays.setBackground(Color.WHITE);
		cmbUsedMedicareDays.setForeground(DEF_COLOR);
		// cmbUsedMedicareDays.setModel(new javax.swing.DefaultComboBoxModel(
		// new String[] { " ", "1", "2", "3", "4", "5", "6", "7", "8",
		// "9", "10" }));
		cmbUsedMedicareDays.setBounds(161, 209, 192, 25);
		add(cmbUsedMedicareDays);

		final JLabel authorizationCodeLabel = new JLabel();
		authorizationCodeLabel.setForeground(DEF_COLOR);
		authorizationCodeLabel.setFont(new Font("", Font.BOLD, 12));
		authorizationCodeLabel.setText("AUTHORIZATION CODE");
		authorizationCodeLabel.setBounds(22, 254, 132, 16);
		add(authorizationCodeLabel);

		txtAutorizationCode = new JTextField();
		myMap.put("authorizationCode", txtAutorizationCode);
		txtAutorizationCode.setBackground(Color.WHITE);
		txtAutorizationCode.setForeground(DEF_COLOR);
		txtAutorizationCode.setBounds(161, 252, 192, 20);
		add(txtAutorizationCode);

		final JxButton btnSave = new JxButton();
		btnSave.setArc(0.4f);
		btnSave.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnSave.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnSave.setFont(new Font("", Font.BOLD, 12));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				// if (doValidate()) {
				if (doSave()) {
					close();
					// Global.frameResidentInfoPayerAdd.dispose();
				}
				// Global.panelResidentInfoGeneral.changePayerPanelTo1();

				// }
			}
		});
		btnSave.setText("Save");
		btnSave.setBounds(107, 326, 83, 26);
		add(btnSave);

		final JxButton btnCancel = new JxButton();
		btnCancel.setArc(0.4f);
		btnCancel.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnCancel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				// Global.frameResidentInfoPayerAdd.dispose();
				close();
			}
		});
		btnCancel.setText("Cancel");
		btnCancel.setBounds(205, 326, 83, 26);
		add(btnCancel);

		final PanelImage panel = new PanelImage();
		panel.setCurvedView(true);
		panel.setArc(0.6f);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		panel.setBounds(482, 26, 118, 125);
		add(panel);
		//
		fillCombo();
		updateData();

		presentationModel = new PresentationModel(myMap, ResidentPayer.class,
				residentInfoPayerController, errorLabel);
		presentationModel.validateAll();

	}

	private void fillCombo() {
		List<MasterList> payerTypeComboItems = new ArrayList<MasterList>();
		List<MasterList> responsiblePartyComboItems = new ArrayList<MasterList>();
		List<MasterList> insuranceComboItems = new ArrayList<MasterList>();
		List<MasterList> usedMedicareDaysComboItems = new ArrayList<MasterList>();

		try {
			payerTypeComboItems = MedrexClientManager.getInstance()
					.getMasterListRecords(PayerType.class);
			responsiblePartyComboItems = MedrexClientManager.getInstance()
					.getMasterListRecords(PayerResponsibleParty.class);
			insuranceComboItems = MedrexClientManager.getInstance()
					.getMasterListRecords(Insurance.class);
			usedMedicareDaysComboItems = MedrexClientManager.getInstance()
					.getMasterListRecords(MedicareDays.class);
		} catch (Exception e) {
			e.printStackTrace();
		}

		cmbPayerType.removeAllItems();
		for (int i = 0; i < payerTypeComboItems.size(); i++) {
			MasterList m = payerTypeComboItems.get(i);
			cmbPayerType.addItem(m);
		}
		PayerType payerType = new PayerType();
		payerType.setId(0);
		payerType.setMsterName(" ");
		cmbPayerType.insertItemAt(payerType, 0);
		cmbPayerType.setSelectedIndex(0);

		comboBox_1.removeAllItems();
		for (int i = 0; i < responsiblePartyComboItems.size(); i++) {
			MasterList m = responsiblePartyComboItems.get(i);
			comboBox_1.addItem(m);
		}
		PayerResponsibleParty responsibleParty = new PayerResponsibleParty();
		responsibleParty.setId(0);
		responsibleParty.setMsterName(" ");
		comboBox_1.insertItemAt(responsibleParty, 0);
		comboBox_1.setSelectedIndex(0);

		cmbInsurance.removeAllItems();
		for (int i = 0; i < insuranceComboItems.size(); i++) {
			MasterList m = insuranceComboItems.get(i);
			cmbInsurance.addItem(m);
		}
		Insurance insurance = new Insurance();
		insurance.setId(0);
		insurance.setMsterName(" ");
		cmbInsurance.insertItemAt(insurance, 0);
		cmbInsurance.setSelectedIndex(0);

		cmbUsedMedicareDays.removeAllItems();
		for (int i = 0; i < usedMedicareDaysComboItems.size(); i++) {
			MasterList m = usedMedicareDaysComboItems.get(i);
			cmbUsedMedicareDays.addItem(m);
		}
		MedicareDays medicareDays = new MedicareDays();
		medicareDays.setId(0);
		medicareDays.setMsterName(" ");
		cmbUsedMedicareDays.insertItemAt(medicareDays, 0);
		cmbUsedMedicareDays.setSelectedIndex(0);

	}

	public void updateData() {
		// if (Global.currentPayerKey == 0) {
		// txtAutorizationCode.setText("");
		// dateEffective.setDate(null);
		// dateEnd.setDate(null);
		// } else {
		// ResidentPayer rp = null;
		// try {
		// rp =
		// MedrexClientManager.getInstance().getResidentPayer(Global.currentPayerKey);
		// } catch (Exception e) {
		//
		// }
		// cmbPayerType.setSelectedItem(rp.getPayerType());
		// cmbInsurance.setSelectedItem(rp.getInsurance());
		// comboBox_1.setSelectedItem(rp.getResponsibleParty());
		// cmbUsedMedicareDays.setSelectedItem(rp.getUsedMedicalDays());
		// txtAutorizationCode.setText(rp.getAuthorizationCode());
		// dateEffective.setDate(rp.getEffectiveDate());
		// dateEnd.setDate(rp.getEndDate());
		// }

		if (residentInfoPayerController.getSelectedPayer() != -1) {
			ResidentPayer rp = residentInfoPayerController
					.getCurrentResidentPayer();

			cmbPayerType.setSelectedItem(rp.getPayerType());
			cmbInsurance.setSelectedItem(rp.getInsurance());
			comboBox_1.setSelectedItem(rp.getResponsibleParty());
			cmbUsedMedicareDays.setSelectedItem(rp.getUsedMedicalDays());
			txtAutorizationCode.setText(rp.getAuthorizationCode());
			dateEffective.setDate(rp.getEffectiveDate());
			dateEnd.setDate(rp.getEndDate());
		}
	}

	public boolean doSave() {
		ResidentPayer rp = new ResidentPayer();
		// rp.setSerial(Global.currentPayerKey);
		// rp.setResidentId(Global.currentResidenceKey);

		rp.setPayerType((PayerType) cmbPayerType.getSelectedItem());
		rp.setInsurance((Insurance) cmbInsurance.getSelectedItem());
		rp.setResponsibleParty((PayerResponsibleParty) comboBox_1
				.getSelectedItem());
		rp.setUsedMedicalDays((MedicareDays) cmbUsedMedicareDays
				.getSelectedItem());
		rp.setEffectiveDate(dateEffective.getDate());
		rp.setEndDate(dateEnd.getDate());
		rp.setAuthorizationCode(txtAutorizationCode.getText());

		List errors = residentInfoPayerController.doValidate(rp, "");
		if (errors.size() > 0) {
			MsgBox m = new MsgBox();
			Iterator itr = errors.iterator();
			String strError = "";
			while (itr.hasNext()) {
				strError += (String) itr.next() + "\n";
			}
			m.addPrompt(strError);
			m.setTitle("Error to save parer add");
			m.setVisible(true);
			return false;
		} else {
			residentInfoPayerController.insertOrUpdateResidentPayer(rp);

			return true;
		}

	}

	@Override
	public String getTitle() {
		return "Add New Payer";
	}

}
