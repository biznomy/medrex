package medrex.client.main.physicanOrders.physicianOrderScreen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldFormatter;
import medrex.commons.enums.ColorConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderMiscellaneous;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderRecord;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

import com.sX.swing.JxButton;
import com.sX.swing.JxLabel;
import com.sX.swing.JxText;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxCheckBox;
import com.sX.swing.JxRadioButton;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxTextA;
import com.sX.swing.JxPanel;


public class PanelPhysicianOrderMiscellaneous extends JxPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5731801364870547677L;
	private JxText txtOrganism;
	private JxButton btnDelete;
	private JxButton btnSave;
	private JxButton btnAddNew;
	private JxButton btnPrintDialysisSheet;
	private JxButton btnDummyButon;
	private JxTextA txtSpecifyReasonForTransfer;
	private JxButton btnTransferForm;
	private JxText txtSpecifyLocation;
	private JxComboBox cmbDischargeOrder;
	private JxText txtCallMd;
	private JxText txtMeasure;
	private JxComboBox cmbFrequency;
	private JxComboBox cmbLocationAmbulatoryStatus;
	private JList lstDialysis;
	private JList lstShowerDays;
	private JxText txtLocationDialysis;
	private JxComboBox cmbDevice;
	private JxComboBox cmbWeightBearingStatus;
	private JxComboBox cmbAmbulatiryStatus;
	private JxComboBox cmbIsolationPrecautions;
	
	Theme theme = new BlackOverWhiteTheme();

	public PanelPhysicianOrderMiscellaneous() {
		super();
		setBorder(new LineBorder(Color.black, 1, false));
		Global.panelPhysicianOrderMiscellaneous = this;
		setLayout(new BorderLayout());
		setBackground(Color.WHITE);
		setArc(1.0f);

		final JxLabel miscellaneousFormLabel = new JxLabel();
		miscellaneousFormLabel.setTheme (theme);
		miscellaneousFormLabel.setFont(new Font("", Font.BOLD, 18));
		miscellaneousFormLabel.setForeground(ColorConstants.DEF_COLOR);
		miscellaneousFormLabel.setHorizontalAlignment(SwingConstants.CENTER);

miscellaneousFormLabel.setFontStyle(Font.BOLD);
		miscellaneousFormLabel.setPreferredSize(new Dimension(0, 25));
		miscellaneousFormLabel.setText("MISCELLANEOUS FORM");
		add(miscellaneousFormLabel, BorderLayout.NORTH);

		final JxPanel panel = new JxPanel();
		panel.setTheme (theme);
		panel.setPreferredSize(new Dimension(0, 0));
		panel.setForeground(ColorConstants.DEF_COLOR);
		panel.setLayout(null);

		add(panel, BorderLayout.CENTER);

		final JxLabel isolationPrecautionLabel = new JxLabel();
		isolationPrecautionLabel.setTheme (theme);
		isolationPrecautionLabel.setForeground(ColorConstants.DEF_COLOR);

isolationPrecautionLabel.setFontSize(12);
isolationPrecautionLabel.setFontStyle(Font.BOLD);
		isolationPrecautionLabel.setText("ISOLATION PRECAUTIONS");
		isolationPrecautionLabel.setBounds(30, 10, 160, 15);
		panel.add(isolationPrecautionLabel);

		cmbIsolationPrecautions = new JxComboBox();
		cmbIsolationPrecautions.setTheme (theme);

		cmbIsolationPrecautions.setForeground(ColorConstants.DEF_COLOR);
		cmbIsolationPrecautions.setModel(new DefaultComboBoxModel(new String[] {
				"", "CONTACT", "DROPLET" }));

		cmbIsolationPrecautions.setBounds(220, 10, 120, 15);
		panel.add(cmbIsolationPrecautions);

		final JxLabel ambulatoryStatusLabel = new JxLabel();
		ambulatoryStatusLabel.setTheme (theme);
		ambulatoryStatusLabel.setForeground(ColorConstants.DEF_COLOR);

ambulatoryStatusLabel.setFontSize(12);
ambulatoryStatusLabel.setFontStyle(Font.BOLD);
		ambulatoryStatusLabel.setText("AMBULATORY STATUS");
		ambulatoryStatusLabel.setBounds(30, 50, 160, 15);
		panel.add(ambulatoryStatusLabel);

		cmbAmbulatiryStatus = new JxComboBox();
		cmbAmbulatiryStatus.setTheme (theme);

		cmbAmbulatiryStatus.setForeground(ColorConstants.DEF_COLOR);
		cmbAmbulatiryStatus.setModel(new DefaultComboBoxModel(new String[] {
				"", "NON", "1 ASSIST", "2 ASSIST" }));

		cmbAmbulatiryStatus.setBounds(220, 50, 120, 15);
		panel.add(cmbAmbulatiryStatus);

		final JxLabel locationLabel = new JxLabel();
		locationLabel.setTheme (theme);
		locationLabel.setForeground(ColorConstants.DEF_COLOR);

locationLabel.setFontSize(12);
locationLabel.setFontStyle(Font.BOLD);

		locationLabel.setText("LOCATION");
		locationLabel.setBounds(375, 30, 80, 15);
		panel.add(locationLabel);

		cmbLocationAmbulatoryStatus = new JxComboBox();
		cmbLocationAmbulatoryStatus.setTheme (theme);
		cmbLocationAmbulatoryStatus.setModel(new DefaultComboBoxModel(
				new String[] { "", "SPUTUM", "WOUND", "URINE", "STOOL" }));
		cmbLocationAmbulatoryStatus.setForeground(ColorConstants.DEF_COLOR);

		cmbLocationAmbulatoryStatus.setBounds(465, 30, 120, 15);
		panel.add(cmbLocationAmbulatoryStatus);

		final JxLabel deviecLabel = new JxLabel();
		deviecLabel.setTheme (theme);
		deviecLabel.setForeground(ColorConstants.DEF_COLOR);

deviecLabel.setFontSize(12);
deviecLabel.setFontStyle(Font.BOLD);

		deviecLabel.setText("DEVICE");
		deviecLabel.setBounds(30, 70, 160, 15);
		panel.add(deviecLabel);

		cmbDevice = new JxComboBox();
		cmbDevice.setTheme (theme);

		cmbDevice.setForeground(ColorConstants.DEF_COLOR);
		cmbDevice.setModel(new DefaultComboBoxModel(new String[] { "",
				"WALKER", "QUAD CANE", "STRAIGHT CANE" }));

		cmbDevice.setBounds(220, 70, 120, 15);
		panel.add(cmbDevice);

		final JxLabel weightBearingStatusLabel = new JxLabel();
		weightBearingStatusLabel.setTheme (theme);
		weightBearingStatusLabel.setForeground(ColorConstants.DEF_COLOR);

weightBearingStatusLabel.setFontSize(12);
weightBearingStatusLabel.setFontStyle(Font.BOLD);
		weightBearingStatusLabel.setText("WEIGHT BEARING STATUS");
		weightBearingStatusLabel.setBounds(30, 90, 160, 15);
		panel.add(weightBearingStatusLabel);

		cmbWeightBearingStatus = new JxComboBox();
		cmbWeightBearingStatus.setTheme (theme);
		cmbWeightBearingStatus.setModel(new DefaultComboBoxModel(new String[] {
				"", "FULL", "PWB", "TTWB", "NWB" }));

		cmbWeightBearingStatus.setForeground(ColorConstants.DEF_COLOR);

		cmbWeightBearingStatus.setBounds(220, 90, 120, 15);
		panel.add(cmbWeightBearingStatus);

		final JxLabel showerDaysLabel = new JxLabel();
		showerDaysLabel.setTheme (theme);
		showerDaysLabel.setForeground(ColorConstants.DEF_COLOR);

showerDaysLabel.setFontSize(12);
showerDaysLabel.setFontStyle(Font.BOLD);

		showerDaysLabel.setText("SHOWER DAYS");
		showerDaysLabel.setBounds(30, 110, 160, 15);
		panel.add(showerDaysLabel);

		lstShowerDays = new JList();
		lstShowerDays.setFont(new Font("", Font.PLAIN, 9));
		lstShowerDays.setForeground(ColorConstants.DEF_COLOR);
		lstShowerDays.setSelectionBackground(ColorConstants.DEF_COLOR);
		lstShowerDays.setToolTipText("");
		lstShowerDays.setModel(new DefaultComboBoxModel(new String[] {
				"MONDAY", "TUESDAY", "WEDNESDAY", "THUSDAY", "FRIDAY",
				"SATURDAY", "SUNDAY" }));
		lstShowerDays.setBorder(new LineBorder(Color.black, 1, false));
		lstShowerDays.setBounds(220, 110, 120, 100);
		panel.add(lstShowerDays);

		final JxLabel dialysisLabel = new JxLabel();
		dialysisLabel.setTheme (theme);
		dialysisLabel.setForeground(ColorConstants.DEF_COLOR);

dialysisLabel.setFontSize(12);
dialysisLabel.setFontStyle(Font.BOLD);

		dialysisLabel.setText("DIALYSIS");
		dialysisLabel.setBounds(30, 215, 160, 15);
		panel.add(dialysisLabel);

		lstDialysis = new JList();
		lstDialysis.setForeground(ColorConstants.DEF_COLOR);
		lstDialysis.setSelectionBackground(ColorConstants.DEF_COLOR);
		lstDialysis.setFont(new Font("", Font.PLAIN, 9));
		lstDialysis.setBorder(new LineBorder(Color.black, 1, false));
		lstDialysis.setModel(new DefaultComboBoxModel(new String[] { "MONDAY",
				"TUESDAY", "WEDNESDAY", "THUSDAY", "FRIDAY", "SATURDAY",
				"SUNDAY" }));
		lstDialysis.setBounds(220, 215, 120, 100);
		panel.add(lstDialysis);

		final JxLabel locationLabel_1 = new JxLabel();
		locationLabel_1.setTheme (theme);
		locationLabel_1.setForeground(ColorConstants.DEF_COLOR);

locationLabel_1.setFontSize(12);
locationLabel_1.setFontStyle(Font.BOLD);
		locationLabel_1.setText("LOCATION");
		locationLabel_1.setBounds(375, 200, 80, 15);
		panel.add(locationLabel_1);

		txtLocationDialysis = new JxText();
		txtLocationDialysis.setTheme (theme);
		txtLocationDialysis.setForeground(ColorConstants.DEF_COLOR);
		txtLocationDialysis.setBounds(465, 200, 120, 15);
		panel.add(txtLocationDialysis);

		final JxLabel abdominalGirthLabel = new JxLabel();
		abdominalGirthLabel.setTheme (theme);
		abdominalGirthLabel.setForeground(ColorConstants.DEF_COLOR);

abdominalGirthLabel.setFontSize(12);
abdominalGirthLabel.setFontStyle(Font.BOLD);

		abdominalGirthLabel.setText("ABDOMINAL GIRTH");
		abdominalGirthLabel.setBounds(30, 315, 160, 15);
		panel.add(abdominalGirthLabel);

		final JxLabel measureLabel = new JxLabel();
		measureLabel.setTheme (theme);
		measureLabel.setForeground(ColorConstants.DEF_COLOR);

measureLabel.setFontSize(12);
measureLabel.setFontStyle(Font.BOLD);

		measureLabel.setText("MEASURE");
		measureLabel.setBounds(90, 330, 90, 15);
		panel.add(measureLabel);

		txtMeasure = new JxText();
		txtMeasure.setTheme (theme);
		txtMeasure.setForeground(ColorConstants.DEF_COLOR);
		txtMeasure.setBounds(220, 330, 120, 15);
		panel.add(txtMeasure);

		final JxLabel frequencyLabel = new JxLabel();
		frequencyLabel.setTheme (theme);
		frequencyLabel.setForeground(ColorConstants.DEF_COLOR);

frequencyLabel.setFontSize(12);
frequencyLabel.setFontStyle(Font.BOLD);

		frequencyLabel.setText("FREQUENCY");
		frequencyLabel.setBounds(375, 330, 80, 15);
		panel.add(frequencyLabel);

		cmbFrequency = new JxComboBox();
		cmbFrequency.setTheme (theme);
		cmbFrequency.setModel(new DefaultComboBoxModel(new String[] { "",
				"DAILY", "TWICE A DAY", "WEEKLY" }));
		cmbFrequency.setName("");
		cmbFrequency.setForeground(ColorConstants.DEF_COLOR);


		cmbFrequency.setBounds(470, 330, 120, 15);
		panel.add(cmbFrequency);

		final JxLabel callMdIfLabel = new JxLabel();
		callMdIfLabel.setTheme (theme);
		callMdIfLabel.setForeground(ColorConstants.DEF_COLOR);

callMdIfLabel.setFontSize(12);
callMdIfLabel.setFontStyle(Font.BOLD);

		callMdIfLabel.setText("CALL MD IF  >=");
		callMdIfLabel.setBounds(90, 350, 90, 15);
		panel.add(callMdIfLabel);

		txtCallMd = new JxText(FieldFormatter.MAX4);
		txtCallMd.setTheme (theme);
		txtCallMd.setForeground(ColorConstants.DEF_COLOR);
		txtCallMd.setBounds(220, 350, 120, 15);
		panel.add(txtCallMd);

		final JxLabel dischargeOrderLabel = new JxLabel();
		dischargeOrderLabel.setTheme (theme);
		dischargeOrderLabel.setForeground(ColorConstants.DEF_COLOR);

dischargeOrderLabel.setFontSize(12);
dischargeOrderLabel.setFontStyle(Font.BOLD);

		dischargeOrderLabel.setText("DISCHARGE ORDER");
		dischargeOrderLabel.setBounds(30, 370, 160, 15);
		panel.add(dischargeOrderLabel);

		cmbDischargeOrder = new JxComboBox();
		cmbDischargeOrder.setTheme (theme);
		cmbDischargeOrder.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				if (cmbDischargeOrder.getSelectedItem().toString()
						.equalsIgnoreCase("HOSPITAL")) {
					btnTransferForm.setVisible(true);
				}
				if (cmbDischargeOrder.getSelectedItem().toString()
						.equalsIgnoreCase("ALTERNATIVE FACILITY")) {
					btnTransferForm.setVisible(true);
				}
				if (cmbDischargeOrder.getSelectedItem().toString()
						.equalsIgnoreCase("HOME")) {
					btnTransferForm.setVisible(false);
				}
			}
		});
		cmbDischargeOrder.setModel(new DefaultComboBoxModel(new String[] { "",
				"HOSPITAL", "ALTERNATIVE FACILITY", "HOME" }));
		cmbDischargeOrder.setForeground(ColorConstants.DEF_COLOR);

cmbDischargeOrder.setFontStyle(Font.BOLD);

		cmbDischargeOrder.setBounds(220, 370, 120, 15);
		panel.add(cmbDischargeOrder);

		final JxLabel specifyLocationLabel = new JxLabel();
		specifyLocationLabel.setTheme (theme);
		specifyLocationLabel.setForeground(ColorConstants.DEF_COLOR);

specifyLocationLabel.setFontSize(12);
specifyLocationLabel.setFontStyle(Font.BOLD);

		specifyLocationLabel.setText("SPECIFY LOCATION");
		specifyLocationLabel.setBounds(30, 390, 160, 15);
		panel.add(specifyLocationLabel);

		txtSpecifyLocation = new JxText();
		txtSpecifyLocation.setTheme (theme);
		txtSpecifyLocation.setForeground(ColorConstants.DEF_COLOR);
		txtSpecifyLocation.setBounds(220, 390, 120, 15);
		panel.add(txtSpecifyLocation);

		final JxLabel ifHospitalSpecifyLabel = new JxLabel();
		ifHospitalSpecifyLabel.setTheme (theme);

		ifHospitalSpecifyLabel.setForeground(ColorConstants.DEF_COLOR);

ifHospitalSpecifyLabel.setFontSize(12);
ifHospitalSpecifyLabel.setFontStyle(Font.BOLD);
		ifHospitalSpecifyLabel
				.setText("IF HOSPITAL SPECIFY REASON FOR TRANSFER");
		ifHospitalSpecifyLabel.setBounds(30, 410, 268, 15);
		panel.add(ifHospitalSpecifyLabel);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.black, 1, false));
		scrollPane.setForeground(ColorConstants.DEF_COLOR);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(300, 410, 250, 25);
		panel.add(scrollPane);

		txtSpecifyReasonForTransfer = new JxTextA();
		txtSpecifyReasonForTransfer.setTheme (theme);
		txtSpecifyReasonForTransfer.setForeground(ColorConstants.DEF_COLOR);

		scrollPane.setViewportView(txtSpecifyReasonForTransfer);

		btnTransferForm = new JxButton();
		btnTransferForm.setTheme (theme);
		btnTransferForm.setArc(0.4f);
		btnTransferForm.setForeground(ColorConstants.DEF_COLOR);

btnTransferForm.setFontSize(12);
btnTransferForm.setFontStyle(Font.BOLD);

		btnTransferForm.setText("TRANSFER FORM");
		btnTransferForm.setBounds(365, 350, 150, 20);
		btnTransferForm.setVisible(false);
		panel.add(btnTransferForm);

		btnDummyButon = new JxButton();
		btnDummyButon.setTheme (theme);
		btnDummyButon.setArc(0.4f);
		btnDummyButon.setForeground(ColorConstants.DEF_COLOR);

btnDummyButon.setFontSize(12);
btnDummyButon.setFontStyle(Font.BOLD);

		btnDummyButon.setText("DUMMY BUTTON");
		btnDummyButon.setBounds(400, 120, 150, 20);
		panel.add(btnDummyButon);

		btnPrintDialysisSheet = new JxButton();
		btnPrintDialysisSheet.setTheme (theme);
		btnPrintDialysisSheet.setArc(0.4f);
		btnPrintDialysisSheet.setForeground(ColorConstants.DEF_COLOR);

btnPrintDialysisSheet.setFontSize(12);
btnPrintDialysisSheet.setFontStyle(Font.BOLD);

		btnPrintDialysisSheet.setText("PRINT DIALYSIS SHEET");
		btnPrintDialysisSheet.setBounds(400, 152, 150, 20);
		panel.add(btnPrintDialysisSheet);

		final JxLabel organismLabel = new JxLabel();
		organismLabel.setTheme (theme);
		organismLabel.setForeground(ColorConstants.DEF_COLOR);

organismLabel.setFontSize(12);
organismLabel.setFontStyle(Font.BOLD);
		organismLabel.setText("ORGANISM");
		organismLabel.setBounds(30, 30, 160, 15);
		panel.add(organismLabel);

		txtOrganism = new JxText();
		txtOrganism.setTheme (theme);
		txtOrganism.setForeground(ColorConstants.DEF_COLOR);
		txtOrganism.setBounds(220, 30, 120, 15);
		panel.add(txtOrganism);

		btnAddNew = new JxButton();
		btnAddNew.setTheme (theme);
		btnAddNew.setArc(0.4f);
		btnAddNew.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				setBlankField();
				Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();
			}
		});
		btnAddNew.setForeground(ColorConstants.DEF_COLOR);

btnAddNew.setFontSize(12);
btnAddNew.setFontStyle(Font.BOLD);

		setArc(1.0f);
		btnAddNew.setText("Add New");
		btnAddNew.setBounds(643, 158, 86, 25);
		panel.add(btnAddNew);

		btnSave = new JxButton();
		btnSave.setTheme (theme);
		btnSave.setArc(0.4f);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				doSave();
				setBlankField();
				Global.framePhysicianOrder.dispose();
			}
		});
		btnSave.setForeground(ColorConstants.DEF_COLOR);

btnSave.setFontSize(12);
btnSave.setFontStyle(Font.BOLD);

		setArc(1.0f);
		btnSave.setText("Save");
		btnSave.setBounds(643, 203, 86, 25);
		panel.add(btnSave);

		btnDelete = new JxButton();
		btnDelete.setTheme (theme);
		btnDelete.setArc(0.4f);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doDelete();
				setBlankField();
			}
		});
		btnDelete.setForeground(ColorConstants.DEF_COLOR);

btnDelete.setFontSize(12);
btnDelete.setFontStyle(Font.BOLD);

		setArc(1.0f);
		btnDelete.setText("Delete");
		btnDelete.setBounds(643, 248, 86, 25);
		panel.add(btnDelete);
	}

	private void doDelete() {

		try {
			if (Global.currentPhysicianOrderRecordKey != 0
					&& Global.currentPhysicianOrderMiscellaneouskey != 0) {
				MedrexClientManager.getInstance().deletePhysicianOrderRecord(
						Global.currentPhysicianOrderRecordKey);
				MedrexClientManager.getInstance()
						.deletePhysicianOrderMiscellaneous(
								Global.currentPhysicianOrderMiscellaneouskey);

			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();

	}

	public void doSave() {

		PhysicianOrderMiscellaneous phymisc = new PhysicianOrderMiscellaneous();
		// phymisc.setSerial(Global.currentPhysicianOrderMiscellaneouskey);
		// phymisc.setResidentId(Global.currentResidenceKey);

		phymisc.setAmbulatiryStatus(cmbAmbulatiryStatus.getSelectedItem()
				.toString());
		phymisc.setCallMd(txtCallMd.getText());
		phymisc.setDevice(cmbDevice.getSelectedItem().toString());
		phymisc.setDischargeOrder(cmbDischargeOrder.getSelectedItem()
				.toString());
		phymisc.setFrequency(cmbFrequency.getSelectedItem().toString());
		phymisc.setIsolationPrecautions(cmbIsolationPrecautions
				.getSelectedItem().toString());
		phymisc.setLocationAmbulatoryStatus(cmbLocationAmbulatoryStatus
				.getSelectedItem().toString());
		phymisc.setLocationDialysis(txtLocationDialysis.getText());
		phymisc.setMeasure(txtMeasure.getText());
		phymisc.setOrganism(txtOrganism.getText());
		phymisc.setSpecifyLocation(txtSpecifyLocation.getText());
		phymisc.setSpecifyReasonForTransfer(txtSpecifyReasonForTransfer
				.getText());
		phymisc.setWeightBearingStatus(cmbWeightBearingStatus.getSelectedItem()
				.toString());
		phymisc.setShowerDays(lstShowerDays.getSelectedIndices());
		phymisc.setDialysis(lstDialysis.getSelectedIndices());

		try {
			Global.currentPhysicianOrderMiscellaneouskey = MedrexClientManager
					.getInstance().insertOrUpdatePhysicianOrderMiscellaneous(
							phymisc);
		} catch (RemoteException e) {

			e.printStackTrace();
		} catch (MedrexException e) {

			e.printStackTrace();
		}

		PhysicianOrderRecord phyormisc = new PhysicianOrderRecord();
		phyormisc.setDateCreated(MedrexClientManager.getServerTime());
		phyormisc.setLastModified(MedrexClientManager.getServerTime());
		phyormisc.setFormId(Global.currentPhysicianOrderMiscellaneouskey);
		phyormisc.setFormType("Miscellaneous");
		//phyormisc.setResidentId(Global.currentResidenceKey);
		
	    ResidentMain resmain = null;
		try{
			resmain = MedrexClientManager.getInstance().getResident(Global.currentResidenceKey);
			
		}
		
		catch (Exception e) {
		 
		}
		phyormisc.setResidents(resmain);
		
		phyormisc.setStatus("");
		phyormisc
				.setTitle(cmbIsolationPrecautions.getSelectedItem().toString());
	
		
		Users user = null;
		try{
			user = MedrexClientManager.getInstance().getUser(Global.currentLoggedInUserKey);
			
		}
		
		catch (Exception e) {
		 
		}
		 
		phyormisc.setUser(user);
		phyormisc.setSerial(Global.currentPhysicianOrderRecordKey);

		try {
			Global.currentPhysicianOrderRecordKey = MedrexClientManager
					.getInstance()
					.insertOrUpdatePhysicianOrderRecord(phyormisc);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (Global.panelPhysicianOrderDetails != null) {
			Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();
		}
	}

	public void setBlankField() {
		Global.currentPhysicianOrderRecordKey = 0;
		Global.currentPhysicianOrderConsultationskey = 0;

		cmbAmbulatiryStatus.setSelectedItem("");
		cmbDevice.setSelectedItem("");
		cmbDischargeOrder.setSelectedItem("");
		cmbFrequency.setSelectedItem("");
		cmbIsolationPrecautions.setSelectedItem("");
		cmbLocationAmbulatoryStatus.setSelectedItem("");
		cmbWeightBearingStatus.setSelectedItem("");
		txtCallMd.setText("");
		txtLocationDialysis.setText("");
		txtMeasure.setText("");
		txtOrganism.setText("");
		txtSpecifyLocation.setText("");
		txtSpecifyReasonForTransfer.setText("");
		lstDialysis.setSelectedIndices(new int[] { -1 });
		lstShowerDays.setSelectedIndices(new int[] { -1 });
	}

	public void setValueObject(PhysicianOrderMiscellaneous misc) {
		cmbAmbulatiryStatus.setSelectedItem(misc.getAmbulatiryStatus());
		cmbDevice.setSelectedItem(misc.getDevice());
		cmbDischargeOrder.setSelectedItem(misc.getDischargeOrder());
		cmbFrequency.setSelectedItem(misc.getFrequency());
		cmbIsolationPrecautions.setSelectedItem(misc.getIsolationPrecautions());
		cmbLocationAmbulatoryStatus.setSelectedItem(misc
				.getLocationAmbulatoryStatus());
		cmbWeightBearingStatus.setSelectedItem(misc.getWeightBearingStatus());
		txtCallMd.setText(misc.getCallMd());
		txtLocationDialysis.setText(misc.getLocationDialysis());
		txtMeasure.setText(misc.getMeasure());
		txtOrganism.setText(misc.getOrganism());
		txtSpecifyLocation.setText(misc.getSpecifyLocation());
		txtSpecifyReasonForTransfer.setText(misc.getSpecifyReasonForTransfer());
		lstDialysis.setSelectedIndices(misc.getDialysis());
		lstShowerDays.setSelectedIndices(misc.getShowerDays());
	}
}
