package medrex.client.main.physicanOrders.physicianOrderScreen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.enums.ColorConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderDiagnosticTests;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderRecord;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;
import com.sX.theme.BlueOverWhiteTheme;
import com.sX.theme.Theme;
import com.toedter.calendar.JDateChooser;

import com.sX.swing.JxButton;
import com.sX.swing.JxLabel;
import com.sX.swing.JxText;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxCheckBox;
import com.sX.swing.JxRadioButton;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxTextA;
import com.sX.swing.JxPanel;


public class PanelPhysicianOrderDiagnosticTests extends JxPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3160547519815044965L;
	private JxButton btDelete;
	private JxButton btAddNew;
	private JxButton btSave;
	private JxCheckBox cbCarotidUs;
	private JxCheckBox cbMbs;
	private JxCheckBox cbPft;
	private JxCheckBox cbEeg;
	private JxCheckBox cbEmg;
	private JxCheckBox cbTee;
	private JxCheckBox cbEcho;
	private JxCheckBox cbColonoscope;
	private JxCheckBox cbMammogram;
	private JxCheckBox cbMra;
	private JxCheckBox cbEgd;
	private JxCheckBox cbMri;
	private JxCheckBox cbPetScan;
	private JxCheckBox cbCTScan;
	private JxText txtSymptomatologyClinical;
	private JxDateChooser dcScheduleForDc;
	private JxText txtScheduleAt;
	private JxText txtSymptomatology;
	private JxText txtScheduleFor;
	private JxCheckBox cbVenois;
	private JxCheckBox cbAterial;
	private JxText txtDoppler;
	private JxText txtUS;
	private JxText txtXray;

	public PanelPhysicianOrderDiagnosticTests() {
		super();
		Global.panelPhysicianOrderDiagnosticTests = this;
		setArc(1.0f);
		setBorder(new LineBorder(ColorConstants.DEF_COLOR, 1));
		setBackground(Color.WHITE);
		setLayout(new BorderLayout());
		
		BlueOverWhiteTheme theme= new  BlueOverWhiteTheme();
		final JxLabel diagnosticTestsLabel = new JxLabel();
		diagnosticTestsLabel.setTheme (theme);
		diagnosticTestsLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		diagnosticTestsLabel.setHorizontalAlignment(SwingConstants.CENTER);

diagnosticTestsLabel.setFontStyle(Font.BOLD);
		diagnosticTestsLabel.setPreferredSize(new Dimension(0, 27));
		diagnosticTestsLabel.setText("DIAGNOSTIC TEST");
		add(diagnosticTestsLabel, BorderLayout.NORTH);

		final JxPanel panel = new JxPanel();
		panel.setTheme (theme);
		panel.setLayout(null);

		add(panel, BorderLayout.CENTER);

		final JxLabel insertFastRadLabel = new JxLabel();
		insertFastRadLabel.setTheme (theme);
		insertFastRadLabel.setForeground(ColorConstants.DEF_COLOR);

insertFastRadLabel.setFontSize(12);
insertFastRadLabel.setFontStyle(Font.BOLD);
		insertFastRadLabel
				.setText("Insert FAST RAD Requisiton for in Faciity Test, Link for Online Result and Sync to EMR");
		insertFastRadLabel.setBounds(20, 10, 626, 16);
		panel.add(insertFastRadLabel);

		final JxLabel xrayLabel = new JxLabel();
		xrayLabel.setTheme (theme);
		xrayLabel.setForeground(ColorConstants.DEF_COLOR);

xrayLabel.setFontSize(12);
xrayLabel.setFontStyle(Font.BOLD);
		xrayLabel.setText("Xray");
		xrayLabel.setBounds(20, 40, 67, 16);
		panel.add(xrayLabel);

		txtXray = new JxText();
		txtXray.setTheme (theme);
		txtXray.setBounds(184, 40, 127, 18);
		panel.add(txtXray);

		final JxLabel usLabel = new JxLabel();
		usLabel.setTheme (theme);
		usLabel.setForeground(ColorConstants.DEF_COLOR);

usLabel.setFontSize(12);
usLabel.setFontStyle(Font.BOLD);
		usLabel.setText("US");
		usLabel.setBounds(20, 60, 66, 16);
		panel.add(usLabel);

		txtUS = new JxText();
		txtUS.setTheme (theme);
		txtUS.setBounds(184, 60, 127, 18);
		panel.add(txtUS);

		final JxLabel dopplerLabel = new JxLabel();
		dopplerLabel.setTheme (theme);
		dopplerLabel.setForeground(ColorConstants.DEF_COLOR);

dopplerLabel.setFontSize(12);
dopplerLabel.setFontStyle(Font.BOLD);
		dopplerLabel.setText("Doppler");
		dopplerLabel.setBounds(20, 80, 66, 16);
		panel.add(dopplerLabel);

		txtDoppler = new JxText();
		txtDoppler.setTheme (theme);
		txtDoppler.setBounds(184, 80, 127, 18);
		panel.add(txtDoppler);

		cbAterial = new JxCheckBox();
		cbAterial.setTheme (theme);
		cbAterial.setForeground(ColorConstants.DEF_COLOR);

cbAterial.setFontSize(12);
cbAterial.setFontStyle(Font.BOLD);

		cbAterial.setText("Ateral");
		cbAterial.setBounds(94, 110, 118, 16);
		panel.add(cbAterial);

		cbVenois = new JxCheckBox();
		cbVenois.setTheme (theme);
		cbVenois.setForeground(ColorConstants.DEF_COLOR);

cbVenois.setFontSize(12);
cbVenois.setFontStyle(Font.BOLD);

		cbVenois.setText("Venos");
		cbVenois.setBounds(94, 130, 118, 16);
		panel.add(cbVenois);

		final JxLabel scheduleForLabel = new JxLabel();
		scheduleForLabel.setTheme (theme);
		scheduleForLabel.setForeground(ColorConstants.DEF_COLOR);

scheduleForLabel.setFontSize(12);
scheduleForLabel.setFontStyle(Font.BOLD);
		scheduleForLabel.setText("Schedule For");
		scheduleForLabel.setBounds(20, 155, 99, 16);
		panel.add(scheduleForLabel);

		txtScheduleFor = new JxText();
		txtScheduleFor.setTheme (theme);
		txtScheduleFor.setBounds(184, 155, 127, 18);
		panel.add(txtScheduleFor);

		final JxLabel symptoLabel = new JxLabel();
		symptoLabel.setTheme (theme);
		symptoLabel.setForeground(ColorConstants.DEF_COLOR);

symptoLabel.setFontSize(12);
symptoLabel.setFontStyle(Font.BOLD);
		symptoLabel.setText("Symptomatology");
		symptoLabel.setBounds(20, 175, 127, 16);
		panel.add(symptoLabel);

		txtSymptomatology = new JxText();
		txtSymptomatology.setTheme (theme);
		txtSymptomatology.setBounds(184, 175, 127, 18);
		panel.add(txtSymptomatology);

		final JxLabel orLabel = new JxLabel();
		orLabel.setForeground(ColorConstants.DEF_COLOR);

orLabel.setFontStyle(Font.BOLD);
		orLabel.setText("(Or Cunical Indication)");
		orLabel.setBounds(21, 190, 145, 14);
		panel.add(orLabel);

		final JxLabel sameAsLabLabel = new JxLabel();
		sameAsLabLabel.setTheme (theme);
		sameAsLabLabel.setForeground(ColorConstants.DEF_COLOR);

sameAsLabLabel.setFontSize(12);
sameAsLabLabel.setFontStyle(Font.BOLD);
		sameAsLabLabel.setText("(Same as Lab)");
		sameAsLabLabel.setBounds(317, 155, 94, 16);
		panel.add(sameAsLabLabel);

		final JxLabel label = new JxLabel();
		label.setTheme (theme);
		label.setText("");
		label.setBounds(146, 233, 66, 16);
		panel.add(label);

		final JxLabel scheduleAtLabel = new JxLabel();
		scheduleAtLabel.setTheme (theme);
		scheduleAtLabel.setForeground(ColorConstants.DEF_COLOR);

scheduleAtLabel.setFontSize(12);
scheduleAtLabel.setFontStyle(Font.BOLD);
		scheduleAtLabel.setText("Schedule At :");
		scheduleAtLabel.setBounds(20, 355, 99, 16);
		panel.add(scheduleAtLabel);

		txtScheduleAt = new JxText();
		txtScheduleAt.setTheme (theme);
		txtScheduleAt.setBounds(184, 355, 127, 18);
		panel.add(txtScheduleAt);

		final JxLabel scheduleForLabel_1 = new JxLabel();
		scheduleForLabel_1.setTheme (theme);
		scheduleForLabel_1.setForeground(ColorConstants.DEF_COLOR);

scheduleForLabel_1.setFontSize(12);
scheduleForLabel_1.setFontStyle(Font.BOLD);
		scheduleForLabel_1.setText("Schedule For :");
		scheduleForLabel_1.setBounds(20, 375, 111, 16);
		panel.add(scheduleForLabel_1);

		dcScheduleForDc = new JxDateChooser();
		dcScheduleForDc.setTheme (theme);
		dcScheduleForDc.setBounds(184, 375, 127, 18);
		panel.add(dcScheduleForDc);

		final JxLabel sameAsLabLabel_1 = new JxLabel();
		sameAsLabLabel_1.setTheme (theme);
		sameAsLabLabel_1.setForeground(ColorConstants.DEF_COLOR);

sameAsLabLabel_1.setFontSize(12);
sameAsLabLabel_1.setFontStyle(Font.BOLD);
		sameAsLabLabel_1.setText("(Same as Lab)");
		sameAsLabLabel_1.setBounds(317, 375, 94, 16);
		panel.add(sameAsLabLabel_1);

		final JxLabel symptomatologyLabel = new JxLabel();
		symptomatologyLabel.setTheme (theme);
		symptomatologyLabel.setForeground(ColorConstants.DEF_COLOR);

symptomatologyLabel.setFontSize(12);
symptomatologyLabel.setFontStyle(Font.BOLD);
		symptomatologyLabel.setText("Symptomatology :");
		symptomatologyLabel.setBounds(20, 395, 137, 16);
		panel.add(symptomatologyLabel);

		txtSymptomatologyClinical = new JxText();
		txtSymptomatologyClinical.setTheme (theme);
		txtSymptomatologyClinical.setBounds(184, 395, 127, 18);
		panel.add(txtSymptomatologyClinical);

		final JxLabel orClinicalIndicationLabel = new JxLabel();
		orClinicalIndicationLabel.setTheme (theme);
		orClinicalIndicationLabel.setForeground(ColorConstants.DEF_COLOR);

orClinicalIndicationLabel.setFontStyle(Font.BOLD);
		orClinicalIndicationLabel.setText("(Or Cunical Indication)");
		orClinicalIndicationLabel.setBounds(20, 410, 158, 14);
		panel.add(orClinicalIndicationLabel);

		cbCTScan = new JxCheckBox();
		cbCTScan.setTheme (theme);
		cbCTScan.setForeground(ColorConstants.DEF_COLOR);

cbCTScan.setFontSize(12);
cbCTScan.setFontStyle(Font.BOLD);

		cbCTScan.setText("CT Scan");
		cbCTScan.setBounds(20, 215, 118, 16);
		panel.add(cbCTScan);

		cbPetScan = new JxCheckBox();
		cbPetScan.setTheme (theme);
		cbPetScan.setForeground(ColorConstants.DEF_COLOR);

cbPetScan.setFontSize(12);
cbPetScan.setFontStyle(Font.BOLD);

		cbPetScan.setText("PET Scan");
		cbPetScan.setBounds(20, 235, 118, 16);
		panel.add(cbPetScan);

		cbMri = new JxCheckBox();
		cbMri.setTheme (theme);
		cbMri.setForeground(ColorConstants.DEF_COLOR);

cbMri.setFontSize(12);
cbMri.setFontStyle(Font.BOLD);

		cbMri.setText("MRI");
		cbMri.setBounds(20, 255, 118, 16);
		panel.add(cbMri);

		cbEgd = new JxCheckBox();
		cbEgd.setTheme (theme);
		cbEgd.setForeground(ColorConstants.DEF_COLOR);

cbEgd.setFontSize(12);
cbEgd.setFontStyle(Font.BOLD);

		cbEgd.setText("EGD");
		cbEgd.setBounds(20, 275, 118, 16);
		panel.add(cbEgd);

		cbMra = new JxCheckBox();
		cbMra.setTheme (theme);
		cbMra.setForeground(ColorConstants.DEF_COLOR);

cbMra.setFontSize(12);
cbMra.setFontStyle(Font.BOLD);

		cbMra.setText("MRA");
		cbMra.setBounds(20, 295, 118, 16);
		panel.add(cbMra);

		cbMammogram = new JxCheckBox();
		cbMammogram.setTheme (theme);
		cbMammogram.setForeground(ColorConstants.DEF_COLOR);

cbMammogram.setFontSize(12);
cbMammogram.setFontStyle(Font.BOLD);

		cbMammogram.setText("Mammogram");
		cbMammogram.setBounds(20, 315, 118, 16);
		panel.add(cbMammogram);

		cbColonoscope = new JxCheckBox();
		cbColonoscope.setTheme (theme);
		cbColonoscope.setForeground(ColorConstants.DEF_COLOR);

cbColonoscope.setFontSize(12);
cbColonoscope.setFontStyle(Font.BOLD);

		cbColonoscope.setText("Colonoscope");
		cbColonoscope.setBounds(20, 333, 118, 16);
		panel.add(cbColonoscope);

		cbEcho = new JxCheckBox();
		cbEcho.setTheme (theme);
		cbEcho.setForeground(ColorConstants.DEF_COLOR);

cbEcho.setFontSize(12);
cbEcho.setFontStyle(Font.BOLD);

		cbEcho.setText("Echo");
		cbEcho.setBounds(184, 215, 118, 16);
		panel.add(cbEcho);

		cbEmg = new JxCheckBox();
		cbEmg.setTheme (theme);
		cbEmg.setForeground(ColorConstants.DEF_COLOR);

cbEmg.setFontSize(12);
cbEmg.setFontStyle(Font.BOLD);

		cbEmg.setText("EMG");
		cbEmg.setBounds(184, 255, 118, 16);
		panel.add(cbEmg);

		cbTee = new JxCheckBox();
		cbTee.setTheme (theme);
		cbTee.setForeground(ColorConstants.DEF_COLOR);

cbTee.setFontSize(12);
cbTee.setFontStyle(Font.BOLD);

		cbTee.setText("TEE");
		cbTee.setBounds(184, 235, 118, 16);
		panel.add(cbTee);

		cbEeg = new JxCheckBox();
		cbEeg.setTheme (theme);
		cbEeg.setForeground(ColorConstants.DEF_COLOR);

cbEeg.setFontSize(12);
cbEeg.setFontStyle(Font.BOLD);

		cbEeg.setText("EEG");
		cbEeg.setBounds(184, 275, 118, 16);
		panel.add(cbEeg);

		cbPft = new JxCheckBox();
		cbPft.setTheme (theme);
		cbPft.setForeground(ColorConstants.DEF_COLOR);

cbPft.setFontSize(12);
cbPft.setFontStyle(Font.BOLD);

		cbPft.setText("PFT S");
		cbPft.setBounds(184, 295, 118, 16);
		panel.add(cbPft);

		cbCarotidUs = new JxCheckBox();
		cbCarotidUs.setTheme (theme);
		cbCarotidUs.setForeground(ColorConstants.DEF_COLOR);

cbCarotidUs.setFontSize(12);
cbCarotidUs.setFontStyle(Font.BOLD);

		cbCarotidUs.setText("Carotid US");
		cbCarotidUs.setBounds(184, 333, 118, 16);
		panel.add(cbCarotidUs);

		cbMbs = new JxCheckBox();
		cbMbs.setTheme (theme);
		cbMbs.setForeground(ColorConstants.DEF_COLOR);

cbMbs.setFontSize(12);
cbMbs.setFontStyle(Font.BOLD);

		cbMbs.setText("MBS");
		cbMbs.setBounds(184, 315, 118, 16);
		panel.add(cbMbs);

		btSave = new JxButton();
		btSave.setTheme (theme);
		btSave.setArc(0.4f);
		btSave.setForeground(ColorConstants.DEF_COLOR);

btSave.setFontSize(12);
btSave.setFontStyle(Font.BOLD);
		btSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				dosave();
				Global.framePhysicianOrder.dispose();
			}

			public void dosave() {
				PhysicianOrderDiagnosticTests phytest = new PhysicianOrderDiagnosticTests();
				phytest
						.setSerial(Global.currentPhysicianOrderDiagnosticTestskey);
				phytest.setResidentId(Global.currentResidenceKey);

				phytest.setAterial(cbAterial.isSelected());
				phytest.setColonoscope(cbColonoscope.isSelected());
				phytest.setCarotidUs(cbCarotidUs.isSelected());
				phytest.setDoppler(txtDoppler.getText());
				phytest.setEcho(cbEcho.isSelected());
				phytest.setCTScan(cbCTScan.isSelected());
				phytest.setEeg(cbEeg.isSelected());
				phytest.setEgd(cbEgd.isSelected());
				phytest.setEmg(cbEmg.isSelected());
				phytest.setMammogram(cbMammogram.isSelected());
				phytest.setMbs(cbMbs.isSelected());
				phytest.setMra(cbMra.isSelected());
				phytest.setMri(cbMri.isSelected());
				phytest.setPetScan(cbPetScan.isSelected());
				phytest.setPft(cbPft.isSelected());
				phytest.setScheduleAt(txtScheduleAt.getText());
				phytest.setScheduleAt(txtScheduleFor.getText());
				phytest.setScheduleForDC(dcScheduleForDc.getDate());
				phytest.setSymptomatology(txtSymptomatology.getText());
				phytest.setTee(cbTee.isSelected());
				phytest.setUS(txtUS.getText());
				phytest.setVenois(cbVenois.isSelected());
				phytest.setXray(txtXray.getText());

				try {
					Global.currentPhysicianOrderDiagnosticTestskey = MedrexClientManager
							.getInstance()
							.insertOrUpdatePhysicianOrderDiagnosticTests(
									phytest);
				} catch (RemoteException e) {

					e.printStackTrace();
				} catch (MedrexException e) {

					e.printStackTrace();
				}

				PhysicianOrderRecord phyord = new PhysicianOrderRecord();
				phyord.setDateCreated(MedrexClientManager.getServerTime());
				phyord.setLastModified(MedrexClientManager.getServerTime());
				phyord
						.setFormId(Global.currentPhysicianOrderDiagnosticTestskey);
				phyord.setFormType("DiagnosticTest");
			//	phyord.setResidentId(Global.currentResidenceKey);
				
				ResidentMain resmain = null;
				try{
					resmain = MedrexClientManager.getInstance().getResident(Global.currentResidenceKey);
					
				}
				
				catch (Exception e) {
					e.printStackTrace();
				 
				}
				phyord.setResidents(resmain);
				phyord.setStatus("");
				
				
				//phyord.setUser(Global.currentLoggedInUserKey);
				
				Users user = null;
				try{
					user = MedrexClientManager.getInstance().getUser(Global.currentLoggedInUserKey);
					
				}
				
				catch (Exception e) {
					e.printStackTrace();
				 
				}
				 
				phyord.setUser(user);
				phyord.setSerial(Global.currentPhysicianOrderRecordKey);
				phyord.setTitle(phytest.getXray());

				try {
					Global.currentPhysicianOrderRecordKey = MedrexClientManager
							.getInstance().insertOrUpdatePhysicianOrderRecord(
									phyord);
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (Global.panelPhysicianOrderDetails != null) {
					Global.panelPhysicianOrderDetails
							.updatePhysicianOrderJTable();
				}
				setBlankField();
			}
		});

		(btSave).setArc(0.4f);
		btSave.setText("Save");
		btSave.setBounds(420, 390, 75, 21);
		panel.add(btSave);

		btAddNew = new JxButton();
		btAddNew.setTheme (theme);
		btAddNew.setArc(0.4f);
		btAddNew.setForeground(ColorConstants.DEF_COLOR);

btAddNew.setFontSize(12);
btAddNew.setFontStyle(Font.BOLD);
		btAddNew.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				setBlankField();
				Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();
			}
		});

		(btAddNew).setArc(0.4f);
		btAddNew.setText("Add New");
		btAddNew.setBounds(500, 390, 75, 21);
		panel.add(btAddNew);

		btDelete = new JxButton();
		btDelete.setTheme (theme);
		btDelete.setForeground(ColorConstants.DEF_COLOR);

btDelete.setFontSize(12);
btDelete.setFontStyle(Font.BOLD);
		btDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				doDelete();
				setBlankField();
			}

			public void doDelete() {

				try {
					if (Global.currentPhysicianOrderRecordKey != 0
							&& Global.currentPhysicianOrderDiagnosticTestskey != 0) {
						MedrexClientManager.getInstance()
								.deletePhysicianOrderRecord(
										Global.currentPhysicianOrderRecordKey);
						MedrexClientManager
								.getInstance()
								.deletePhysicianOrderDiagnosticTests(
										Global.currentPhysicianOrderDiagnosticTestskey);

					}
				} catch (Exception e) {

					e.printStackTrace();
				}

				Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();

			}
		});

		btDelete.setArc(0.4f);
		btDelete.setText("Delete");
		btDelete.setBounds(580, 390, 75, 21);
		panel.add(btDelete);
	}

	public void setBlankField() {
		Global.currentPhysicianOrderRecordKey = 0;
		Global.currentPhysicianOrderDiagnosticTestskey = 0;

		cbAterial.setSelected(false);
		cbCarotidUs.setSelected(false);
		cbColonoscope.setSelected(false);
		cbCTScan.setSelected(false);
		cbEcho.setSelected(false);
		cbEeg.setSelected(false);
		cbEgd.setSelected(false);
		cbEmg.setSelected(false);
		cbMammogram.setSelected(false);
		cbMbs.setSelected(false);
		cbMra.setSelected(false);
		cbMri.setSelected(false);
		cbPetScan.setSelected(false);
		cbPft.setSelected(false);
		cbTee.setSelected(false);
		cbVenois.setSelected(false);
		txtDoppler.setText("");
		txtScheduleAt.setText("");
		txtScheduleFor.setText("");
		txtSymptomatology.setText("");
		txtSymptomatologyClinical.setText("");
		txtUS.setText("");
		txtXray.setText("");
		dcScheduleForDc.setDate(null);

	}

	public void setValueObject(PhysicianOrderDiagnosticTests diagtest) {

		cbAterial.setSelected(diagtest.isAterial());
		cbCarotidUs.setSelected(diagtest.isCarotidUs());
		cbColonoscope.setSelected(diagtest.isColonoscope());
		cbCTScan.setSelected(diagtest.isCTScan());
		cbEcho.setSelected(diagtest.isEcho());
		cbEeg.setSelected(diagtest.isEeg());
		cbEgd.setSelected(diagtest.isEgd());
		cbEmg.setSelected(diagtest.isEmg());
		cbMammogram.setSelected(diagtest.isMammogram());
		cbMbs.setSelected(diagtest.isMbs());
		cbMra.setSelected(diagtest.isMra());
		cbMri.setSelected(diagtest.isMri());
		cbPetScan.setSelected(diagtest.isPetScan());
		cbPft.setSelected(diagtest.isPft());
		cbTee.setSelected(diagtest.isTee());
		cbVenois.setSelected(diagtest.isVenois());
		txtDoppler.setText(diagtest.getDoppler());
		txtScheduleAt.setText(diagtest.getScheduleAt());
		dcScheduleForDc.setDate(diagtest.getScheduleForDC());
		txtScheduleFor.setText(diagtest.getScheduleFor());
		txtSymptomatology.setText(diagtest.getSymptomatology());
		txtSymptomatologyClinical.setText(diagtest.getSymptomatologyClinical());
		txtUS.setText(diagtest.getUS());
		txtXray.setText(diagtest.getXray());

	}
}
