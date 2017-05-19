package medrex.client.main.physicanOrders.physicianOrderScreen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderRecord;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderSafetyPrecautions;
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


public class PanelPhysicianOrderSafetyPrecautions extends JxPanel {
	private JCheckBox cbSelfRelease;
	private JxCheckBox cblowBed;
	private JxPanel panelTest;
	private JxComboBox cmbWanderguardTest;
	/**
	 * 
	 */
	private static final long serialVersionUID = -119937077907127264L;
	private JxComboBox cmbSideRailsSecond;
	private JxButton btDelete;
	private JxButton btSave;
	private JxButton btAddNew;
	private JxText txtLimit;
	private JxComboBox cmbAlcoholicBeverages;
	private JxTextA txtSpecialInstruction;
	private JxComboBox cmbOutOnPass;
	private JxDateChooser dcExpirationDate;
	private JxComboBox cmbWandorGuard;
	private JxComboBox cmbReason;
	private JxComboBox cmbSideRails;
	private JxCheckBox cbFloorMats;
	private JxCheckBox cbSeatBelt;
	private JxCheckBox cbDicem;
	private JxCheckBox cbWedgeCushion;
	private JxCheckBox cbSensorAlarm;
	private JxCheckBox cbWcAlarm;
	private JxCheckBox cbBedAlarm;
	private JxComboBox cmbFallRisk;
	private JxPanel panelFallRisk;
	private JxPanel panelSeatBelt;
	private JxPanel panelWandorGuard;
	
	Theme theme = new BlueOverWhiteTheme();

	public PanelPhysicianOrderSafetyPrecautions() {
		super();
		setPreferredSize(new Dimension(655, 480));
		Global.panelPhysicianOrdersSafetyPrecautions = this;
		setBackground(Color.WHITE);
		setLayout(new BorderLayout());
		setBorder(new LineBorder(ColorConstants.DEF_COLOR, 1));

		final JxLabel saftyPrecautionsLabel = new JxLabel();
		
		saftyPrecautionsLabel.setTheme (theme);
		saftyPrecautionsLabel.setFontSize(14);
		saftyPrecautionsLabel.setForeground(ColorConstants.DEF_COLOR);
		saftyPrecautionsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		saftyPrecautionsLabel.setPreferredSize(new Dimension(0, 35));

saftyPrecautionsLabel.setFontStyle(Font.BOLD);
		saftyPrecautionsLabel.setText("SAFETY PRECAUTIONS");
		add(saftyPrecautionsLabel, BorderLayout.NORTH);

		final JxPanel panel = new JxPanel();
		panel.setBackground(Color.WHITE);
		panel.setTheme (theme);
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		panel.setLayout(flowLayout);
		panel.setPreferredSize(new Dimension(655, 480));
		// panel.setPreferredSize(new Dimension(1055, 580));

		add(panel, BorderLayout.CENTER);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setTheme (theme);

		panel_1.setLayout(null);
		panel_1.setPreferredSize(new Dimension(655, 25));
		panel.add(panel_1);

		final JxLabel fallRiskLabel = new JxLabel();
		fallRiskLabel.setTheme (theme);
		fallRiskLabel.setForeground(ColorConstants.DEF_COLOR);

fallRiskLabel.setFontSize(12);
fallRiskLabel.setFontStyle(Font.BOLD);
		fallRiskLabel.setText("FALL RISK ");
		fallRiskLabel.setBounds(20, 8, 84, 16);
		panel_1.add(fallRiskLabel);

		cmbFallRisk = new JxComboBox();
		cmbFallRisk.setBackground(Color.WHITE);
		cmbFallRisk.setTheme (theme);
		cmbFallRisk.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				if (cmbFallRisk.getSelectedItem().toString().equalsIgnoreCase(
						"YES")) {
					panelFallRisk.setVisible(true);
				}
				if (cmbFallRisk.getSelectedItem().toString().equalsIgnoreCase(
						"NO")) {
					panelFallRisk.setVisible(false);
				}
			}
		});
		cmbFallRisk.setForeground(ColorConstants.DEF_COLOR);

cmbFallRisk.setFontSize(12);
cmbFallRisk.setFontStyle(Font.BOLD);
		cmbFallRisk.setModel(new DefaultComboBoxModel(new String[] { "", "Yes",
				"No" }));

		cmbFallRisk.setBounds(135, 5, 127, 18);
		panel_1.add(cmbFallRisk);

		panelFallRisk = new JxPanel();
		panelFallRisk.setBackground(Color.WHITE);
		panelFallRisk.setTheme (theme);

		panelFallRisk.setLayout(null);
		panelFallRisk.setVisible(false);
		panelFallRisk.setPreferredSize(new Dimension(655, 170));
		panel.add(panelFallRisk);

		cbBedAlarm = new JxCheckBox();
		cbBedAlarm.setBackground(Color.WHITE);
		cbBedAlarm.setTheme (theme);
		cbBedAlarm.setForeground(ColorConstants.DEF_COLOR);

cbBedAlarm.setFontSize(12);
cbBedAlarm.setFontStyle(Font.BOLD);

		cbBedAlarm.setText("BED ALARM");
		cbBedAlarm.setBounds(135, 6, 127, 18);
		panelFallRisk.add(cbBedAlarm);

		cbWcAlarm = new JxCheckBox();
		cbWcAlarm.setBackground(Color.WHITE);
		cbWcAlarm.setTheme (theme);
		cbWcAlarm.setForeground(ColorConstants.DEF_COLOR);

cbWcAlarm.setFontSize(12);
cbWcAlarm.setFontStyle(Font.BOLD);

		cbWcAlarm.setText("W/C ALARM");
		cbWcAlarm.setBounds(135, 26, 127, 18);
		panelFallRisk.add(cbWcAlarm);

		cbSensorAlarm = new JxCheckBox();
		cbSensorAlarm.setBackground(Color.WHITE);
		cbSensorAlarm.setTheme (theme);
		cbSensorAlarm.setForeground(ColorConstants.DEF_COLOR);

cbSensorAlarm.setFontSize(12);
cbSensorAlarm.setFontStyle(Font.BOLD);

		cbSensorAlarm.setText("SENSOR ALARM");
		cbSensorAlarm.setBounds(135, 46, 140, 18);
		panelFallRisk.add(cbSensorAlarm);

		cbWedgeCushion = new JxCheckBox();
		cbWedgeCushion.setBackground(Color.WHITE);
		cbWedgeCushion.setTheme (theme);
		cbWedgeCushion.setForeground(ColorConstants.DEF_COLOR);

cbWedgeCushion.setFontSize(12);
cbWedgeCushion.setFontStyle(Font.BOLD);

		cbWedgeCushion.setText("WEDGE CUSHION");
		cbWedgeCushion.setBounds(135, 66, 140, 18);
		panelFallRisk.add(cbWedgeCushion);

		cbDicem = new JxCheckBox();
		cbDicem.setBackground(Color.WHITE);
		cbDicem.setTheme (theme);
		cbDicem.setForeground(ColorConstants.DEF_COLOR);

cbDicem.setFontSize(12);
cbDicem.setFontStyle(Font.BOLD);

		cbDicem.setText("DICEM");
		cbDicem.setBounds(135, 86, 118, 18);
		panelFallRisk.add(cbDicem);

		cbSeatBelt = new JxCheckBox();
		cbSeatBelt.setBackground(Color.WHITE);
		cbSeatBelt.setTheme (theme);
		cbSeatBelt.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {

				if (cbSeatBelt.isSelected()) {
					SwingUtils.disableComponents(panelSeatBelt, true);
				} else {
					SwingUtils.disableComponents(panelSeatBelt, false);
				}
			}
		});
		cbSeatBelt.setForeground(ColorConstants.DEF_COLOR);

cbSeatBelt.setFontSize(12);
cbSeatBelt.setFontStyle(Font.BOLD);

		cbSeatBelt.setText("SEAT BELT");
		cbSeatBelt.setBounds(135, 106, 118, 18);
		panelFallRisk.add(cbSeatBelt);

		panelSeatBelt = new JxPanel();
		panelSeatBelt.setBackground(Color.WHITE);
		panelSeatBelt.setTheme (theme);

		panelSeatBelt.setLayout(null);
		panelSeatBelt.setBounds(315, 106, 140, 18);
		panelFallRisk.add(panelSeatBelt);
		SwingUtils.disableComponents(panelSeatBelt, false);

		cbSelfRelease = new JCheckBox();
		cbSelfRelease.setFont(new Font("Tahoma", Font.BOLD, 12));
		cbSelfRelease.setForeground(ColorConstants.DEF_COLOR);
		cbSelfRelease.setBackground(Color.WHITE);
		cbSelfRelease.setText("SELF RELEASE");
		cbSelfRelease.setBounds(0, 0, 118, 18);
		panelSeatBelt.add(cbSelfRelease);

		cbFloorMats = new JxCheckBox();
		cbFloorMats.setBackground(Color.WHITE);
		cbFloorMats.setTheme (theme);
		cbFloorMats.setForeground(ColorConstants.DEF_COLOR);

cbFloorMats.setFontSize(12);
cbFloorMats.setFontStyle(Font.BOLD);

		cbFloorMats.setText("FLOOR MATS");
		cbFloorMats.setBounds(135, 146, 118, 18);
		panelFallRisk.add(cbFloorMats);

		cblowBed = new JxCheckBox();
		cblowBed.setForeground(ColorConstants.DEF_COLOR);
		cblowBed.setBackground(Color.WHITE);
		cblowBed.setTheme (theme);
		cblowBed.setFont(new Font("", Font.BOLD, 12));

		cblowBed.setText("LOW BED");
		cblowBed.setBounds(135, 126, 118, 18);
		panelFallRisk.add(cblowBed);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setTheme (theme);

		panel_4.setLayout(null);
		panel_4.setPreferredSize(new Dimension(655, 245));
		panel.add(panel_4);

		final JxLabel sideLabel = new JxLabel();
		sideLabel.setTheme (theme);
		sideLabel.setForeground(ColorConstants.DEF_COLOR);

sideLabel.setFontSize(12);
sideLabel.setFontStyle(Font.BOLD);
		sideLabel.setText("SIDE RAILS");
		sideLabel.setBounds(20, 15, 86, 16);
		panel_4.add(sideLabel);

		cmbSideRails = new JxComboBox();
		cmbSideRails.setBackground(Color.WHITE);
		cmbSideRails.setTheme (theme);
		cmbSideRails.setForeground(ColorConstants.DEF_COLOR);

cmbSideRails.setFontSize(12);
cmbSideRails.setFontStyle(Font.BOLD);
		cmbSideRails.setModel(new DefaultComboBoxModel(new String[] { "", "1",
				"2" }));

		cmbSideRails.setBounds(150, 15, 63, 18);
		panel_4.add(cmbSideRails);

		final JxLabel reasonLabel = new JxLabel();
		reasonLabel.setTheme (theme);
		reasonLabel.setForeground(ColorConstants.DEF_COLOR);

reasonLabel.setFontSize(12);
reasonLabel.setFontStyle(Font.BOLD);
		reasonLabel.setText("REASON");
		reasonLabel.setBounds(350, 15, 66, 16);
		panel_4.add(reasonLabel);

		cmbReason = new JxComboBox();
		cmbReason.setBackground(Color.WHITE);
		cmbReason.setTheme (theme);
		cmbReason.setForeground(ColorConstants.DEF_COLOR);

cmbReason.setFontSize(12);
cmbReason.setFontStyle(Font.BOLD);
		cmbReason.setModel(new DefaultComboBoxModel(new String[] {"", "SAFETY", "Turn and Position", "Resident Request"}));

		cmbReason.setBounds(422, 15, 127, 18);
		panel_4.add(cmbReason);

		final JxLabel wandorGaurdLabel = new JxLabel();
		wandorGaurdLabel.setTheme (theme);
		wandorGaurdLabel.setForeground(ColorConstants.DEF_COLOR);

wandorGaurdLabel.setFontSize(12);
wandorGaurdLabel.setFontStyle(Font.BOLD);
		wandorGaurdLabel.setText("WANDERGUARD");
		wandorGaurdLabel.setBounds(20, 40, 105, 16);
		panel_4.add(wandorGaurdLabel);

		cmbWandorGuard = new JxComboBox();
		cmbWandorGuard.setBackground(Color.WHITE);
		cmbWandorGuard.setTheme (theme);
		cmbWandorGuard.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				if (cmbWandorGuard.getSelectedItem().toString()
						.equalsIgnoreCase("YES")) {
					panelTest.setVisible(true);
					panelWandorGuard.setVisible(true);
					//SwingUtils.disableComponents(panelWandorGuard, true);
					
					//SwingUtils.disableComponents(panelTest, true);
				}
				if (cmbWandorGuard.getSelectedItem().toString()
						.equalsIgnoreCase("NO")) {
					
					panelTest.setVisible(false);
					panelWandorGuard.setVisible(false);
					//SwingUtils.disableComponents(panelWandorGuard, false);
					//SwingUtils.disableComponents(panelTest, false);
				}
			}
		});
		cmbWandorGuard.setForeground(ColorConstants.DEF_COLOR);

cmbWandorGuard.setFontSize(12);
cmbWandorGuard.setFontStyle(Font.BOLD);
		cmbWandorGuard.setModel(new DefaultComboBoxModel(new String[] { "",
				"YES", "NO" }));

		cmbWandorGuard.setBounds(150, 40, 127, 18);
		panel_4.add(cmbWandorGuard);

		panelWandorGuard = new JxPanel();
		panelWandorGuard.setBackground(Color.WHITE);
		panelWandorGuard.setTheme (theme);
		panelWandorGuard.setLayout(null);
		panelWandorGuard.setBounds(20, 65, 272, 18);
		panel_4.add(panelWandorGuard);
		SwingUtils.disableComponents(panelWandorGuard, false);
		panelWandorGuard.setVisible(false);

		final JxLabel expirationDateLabel = new JxLabel();
		expirationDateLabel.setTheme (theme);
		expirationDateLabel.setBounds(0, 0, 111, 16);
		panelWandorGuard.add(expirationDateLabel);
		expirationDateLabel.setForeground(ColorConstants.DEF_COLOR);

expirationDateLabel.setFontSize(12);
expirationDateLabel.setFontStyle(Font.BOLD);
		expirationDateLabel.setText("EXPIRATION DATE");

		dcExpirationDate = new JxDateChooser();
		dcExpirationDate.setTheme (theme);
		dcExpirationDate.setBounds(130, 0, 127, 18);
		panelWandorGuard.add(dcExpirationDate);
		dcExpirationDate.setForeground(ColorConstants.DEF_COLOR);
		dcExpirationDate.setDateFormatString("MM/dd/yyyy");

		final JxLabel outOnPassLabel = new JxLabel();
		outOnPassLabel.setTheme (theme);
		outOnPassLabel.setForeground(ColorConstants.DEF_COLOR);

outOnPassLabel.setFontSize(12);
outOnPassLabel.setFontStyle(Font.BOLD);
		outOnPassLabel.setText("OUT ON PASS WITH RESPONSIBLE PARTY");
		outOnPassLabel.setBounds(20, 90, 260, 16);
		panel_4.add(outOnPassLabel);

		cmbOutOnPass = new JxComboBox();
		cmbOutOnPass.setBackground(Color.WHITE);
		cmbOutOnPass.setTheme (theme);
		cmbOutOnPass.setForeground(ColorConstants.DEF_COLOR);

cmbOutOnPass.setFontSize(12);
cmbOutOnPass.setFontStyle(Font.BOLD);
		cmbOutOnPass.setModel(new DefaultComboBoxModel(new String[] { "",
				"YES", "NO" }));

		cmbOutOnPass.setBounds(285, 90, 127, 18);
		panel_4.add(cmbOutOnPass);

		final JxLabel specialInstructionsLabel = new JxLabel();
		specialInstructionsLabel.setTheme (theme);
		specialInstructionsLabel.setForeground(ColorConstants.DEF_COLOR);

specialInstructionsLabel.setFontSize(12);
specialInstructionsLabel.setFontStyle(Font.BOLD);
		specialInstructionsLabel
				.setText("<html><center>SPECIAL INSTRUCTIONS<br> Related to out on pass");
		specialInstructionsLabel.setBounds(20, 115, 242, 30);
		panel_4.add(specialInstructionsLabel);

		txtSpecialInstruction = new JxTextA();
		txtSpecialInstruction.setBorder(new LineBorder(ColorConstants.BORDER_COL, 1, false));
		txtSpecialInstruction.setTheme (theme);
		txtSpecialInstruction.setForeground(ColorConstants.DEF_COLOR);
		txtSpecialInstruction.setBounds(285, 115, 272, 49);
		panel_4.add(txtSpecialInstruction);

		final JxLabel mayHaveAlcoholicLabel = new JxLabel();
		mayHaveAlcoholicLabel.setTheme (theme);
		mayHaveAlcoholicLabel.setForeground(ColorConstants.DEF_COLOR);

mayHaveAlcoholicLabel.setFontSize(12);
mayHaveAlcoholicLabel.setFontStyle(Font.BOLD);
		mayHaveAlcoholicLabel.setText("MAY HAVE ALCOHOLIC BEVERAGES");
		mayHaveAlcoholicLabel.setBounds(20, 174, 228, 16);
		panel_4.add(mayHaveAlcoholicLabel);

		cmbAlcoholicBeverages = new JxComboBox();
		cmbAlcoholicBeverages.setBackground(Color.WHITE);
		cmbAlcoholicBeverages.setTheme (theme);
		cmbAlcoholicBeverages.setForeground(ColorConstants.DEF_COLOR);

cmbAlcoholicBeverages.setFontSize(12);
cmbAlcoholicBeverages.setFontStyle(Font.BOLD);
		cmbAlcoholicBeverages.setModel(new DefaultComboBoxModel(new String[] {
				"", "YES", "NO" }));

		cmbAlcoholicBeverages.setBounds(285, 174, 127, 18);
		panel_4.add(cmbAlcoholicBeverages);

		final JxLabel limitLabel = new JxLabel();
		limitLabel.setTheme (theme);
		limitLabel.setForeground(ColorConstants.DEF_COLOR);

limitLabel.setFontSize(12);
limitLabel.setFontStyle(Font.BOLD);
		limitLabel.setText("LIMIT");
		limitLabel.setBounds(428, 174, 66, 16);
		panel_4.add(limitLabel);

		txtLimit = new JxText();
		txtLimit.setTheme (theme);
		txtLimit.setForeground(ColorConstants.DEF_COLOR);
		txtLimit.setBounds(477, 174, 127, 18);
		panel_4.add(txtLimit);

		btAddNew = new JxButton();
		btAddNew.setBackground(Color.WHITE);
		btAddNew.setTheme (theme);
		btAddNew.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {

				setBlankField();
			}
		});
		btAddNew.setArc(0.4f);

		btAddNew.setForeground(ColorConstants.DEF_COLOR);

btAddNew.setFontSize(12);
btAddNew.setFontStyle(Font.BOLD);
		btAddNew.setActionCommand("Add NeW");
		btAddNew.setText("Add New");
		btAddNew.setBounds(40, 210, 75, 21);
		panel_4.add(btAddNew);

		btSave = new JxButton();
		btSave.setBackground(Color.WHITE);
		btSave.setTheme (theme);
		btSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {

				doSave();
				Global.framePhysicianOrder.dispose();
			}
		});
		btSave.setArc(0.4f);
		btSave.setForeground(ColorConstants.DEF_COLOR);

btSave.setFontSize(12);
btSave.setFontStyle(Font.BOLD);

		btSave.setText("Save");
		btSave.setBounds(140, 210, 75, 21);
		panel_4.add(btSave);

		btDelete = new JxButton();
		btDelete.setBackground(Color.WHITE);
		btDelete.setTheme (theme);
		btDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doDelete();
			}
		});
		btDelete.setArc(0.4f);
		btDelete.setForeground(ColorConstants.DEF_COLOR);

btDelete.setFontSize(12);
btDelete.setFontStyle(Font.BOLD);

		btDelete.setText("Delete");
		btDelete.setBounds(240, 210, 75, 21);
		panel_4.add(btDelete);

		cmbSideRailsSecond = new JxComboBox();
		cmbSideRailsSecond.setBackground(Color.WHITE);
		cmbSideRailsSecond.setForeground(ColorConstants.DEF_COLOR);
		cmbSideRailsSecond.setTheme (theme);
		cmbSideRailsSecond.setModel(new DefaultComboBoxModel(new String[] { "",
				"1/4", "1/2", "3/4" }));

		cmbSideRailsSecond.setBounds(215, 15, 63, 18);
		panel_4.add(cmbSideRailsSecond);

		panelTest = new JxPanel();
		panelTest.setBackground(Color.WHITE);
		panelTest.setTheme (theme);
		panelTest.setLayout(null);

		panelTest.setBounds(350, 40, 219, 25);
		panel_4.add(panelTest);
		panelTest.setVisible(false);

		final JxLabel testLabel = new JxLabel();
		testLabel.setTheme (theme);
		testLabel.setBounds(0, 0, 66, 16);
		panelTest.add(testLabel);

testLabel.setFontSize(12);
testLabel.setFontStyle(Font.BOLD);
		testLabel.setForeground(ColorConstants.DEF_COLOR);
		testLabel.setText("TEST");

		cmbWanderguardTest = new JxComboBox();
		cmbWanderguardTest.setBackground(Color.WHITE);
		cmbWanderguardTest.setForeground(ColorConstants.DEF_COLOR);
		cmbWanderguardTest.setTheme (theme);
		cmbWanderguardTest.setBounds(72, 0, 127, 18);
		panelTest.add(cmbWanderguardTest);
		cmbWanderguardTest.setModel(new DefaultComboBoxModel(new String[] {"", "Daily", "Weekly", "Monthly"}));

	}

	public void doDelete() {
		try {
			if (Global.currentPhysicianOrderRecordKey != 0
					&& Global.currentPhysicianOrderSafetyPrecautionsKey != 0) {
				MedrexClientManager.getInstance().deletePhysicianOrderRecord(
						Global.currentPhysicianOrderRecordKey);
				MedrexClientManager
						.getInstance()
						.deletePhysicianOrderSafetyPrecautions(
								Global.currentPhysicianOrderSafetyPrecautionsKey);

			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();
		setBlankField();

	}

	public void doSave() {
		PhysicianOrderSafetyPrecautions physafety = new PhysicianOrderSafetyPrecautions();
		physafety.setAlcoholicBeverages(cmbAlcoholicBeverages.getSelectedItem()
				.toString());
		physafety.setBedAlarm(cbBedAlarm.isSelected());
		physafety.setDicem(cbDicem.isSelected());
		physafety.setExpirationDate(dcExpirationDate.getDate());
		physafety.setFallRisk(cmbFallRisk.getSelectedItem().toString());
		physafety.setFloorMats(cbFloorMats.isSelected());
		physafety
				.setSideRails2(cmbSideRailsSecond.getSelectedItem().toString());
		physafety.setLimit(txtLimit.getText());
		physafety.setOutOnPass(cmbOutOnPass.getSelectedItem().toString());
		physafety.setReason(cmbReason.getSelectedItem().toString());
		physafety.setResidentId(Global.currentResidenceKey);
		physafety.setSeatBelt(cbSeatBelt.isSelected());
	//	physafety.setSelfR(cmbSelfRelease.getSelectedItem().toString());
		
		physafety.setSelfRelease(cbSelfRelease.isSelected());
		physafety.setTest(cmbWanderguardTest.getSelectedItem().toString());
		physafety.setSensorAlarm(cbSensorAlarm.isSelected());
		physafety.setSerial(Global.currentPhysicianOrderSafetyPrecautionsKey);
		physafety.setSideRails(cmbSideRails.getSelectedItem().toString());
		physafety.setSpecialInstruction(txtSpecialInstruction.getText());
		physafety.setWandorGuard(cmbWandorGuard.getSelectedItem().toString());
		physafety.setWcAlarm(cbWcAlarm.isSelected());
		physafety.setWedgeCushion(cbWedgeCushion.isSelected());

		try {
			Global.currentPhysicianOrderSafetyPrecautionsKey = MedrexClientManager
					.getInstance()
					.insertOrUpdatePhysicianOrderSafetyPrecautions(physafety);
		} catch (Exception e) {

			e.printStackTrace();
		}

		PhysicianOrderRecord physRec = new PhysicianOrderRecord();
		physRec.setDateCreated(MedrexClientManager.getServerTime());
		physRec.setLastModified(MedrexClientManager.getServerTime());
		physRec.setFormId(Global.currentPhysicianOrderSafetyPrecautionsKey);
		physRec.setFormType("Safety Precautions");
	//	physRec.setResidentId(Global.currentResidenceKey);
	    ResidentMain resmain = null;
		try{
			resmain = MedrexClientManager.getInstance().getResident(Global.currentResidenceKey);
			
		}
		
		catch (Exception e) {
			e.printStackTrace();
		 
		}
		physRec.setResidents(resmain);
		
		physRec.setStatus("");
	//	physRec.setUser(Global.currentLoggedInUserKey);
		


		Users user = null;
		try{
			user = MedrexClientManager.getInstance().getUser(Global.currentLoggedInUserKey);
			
		}
		
		catch (Exception e) {
			e.printStackTrace();
		 
		}
		 
		physRec.setUser(user);
		physRec.setTitle("FALL RISK-"
				+ cmbFallRisk.getSelectedItem().toString());
		physRec.setSerial(Global.currentPhysicianOrderRecordKey);

		try {
			Global.currentPhysicianOrderRecordKey = MedrexClientManager
					.getInstance().insertOrUpdatePhysicianOrderRecord(physRec);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (Global.panelPhysicianOrderDetails != null) {
			Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();
		}
		setBlankField();
	}

	public void setBlankField() {
		Global.currentPhysicianOrderRecordKey = 0;
		Global.currentPhysicianOrderSafetyPrecautionsKey = 0;

		cmbAlcoholicBeverages.setSelectedItem("");
		dcExpirationDate.setDate(null);
		cmbFallRisk.setSelectedItem("");
		cmbOutOnPass.setSelectedItem("");
		cmbReason.setSelectedItem("");
		//cmbSelfRelease.setSelectedItem("");
		cmbSideRails.setSelectedItem("");
		cmbWandorGuard.setSelectedItem("");
		txtLimit.setText("");
		txtSpecialInstruction.setText("");
		cbBedAlarm.setSelected(false);
		cbDicem.setSelected(false);
		cbFloorMats.setSelected(false);
		cbSeatBelt.setSelected(false);
		cbSelfRelease.setSelected(false);
		cbSensorAlarm.setSelected(false);
		cbWcAlarm.setSelected(false);
		cbWedgeCushion.setSelected(false);

	}

	public void setValueObject(PhysicianOrderSafetyPrecautions PhySafety) {
		if (PhySafety.getExpirationDate() != null) {
			dcExpirationDate.setDate(PhySafety.getExpirationDate());
		}
		cmbAlcoholicBeverages
				.setSelectedItem(PhySafety.getAlcoholicBeverages());
		cmbFallRisk.setSelectedItem(PhySafety.getFallRisk());
		cmbOutOnPass.setSelectedItem(PhySafety.getOutOnPass());
		cmbReason.setSelectedItem(PhySafety.getReason());
		cmbSideRails.setSelectedItem(PhySafety.getSideRails());
		cmbWandorGuard.setSelectedItem(PhySafety.getWandorGuard());
		txtLimit.setText(PhySafety.getLimit());
		cmbSideRailsSecond.setSelectedItem(PhySafety.getSideRails2());
		txtSpecialInstruction.setText(PhySafety.getSpecialInstruction());
		cbBedAlarm.setSelected(PhySafety.isBedAlarm());
		cbDicem.setSelected(PhySafety.isDicem());
		cbFloorMats.setSelected(PhySafety.isFloorMats());
		cbSeatBelt.setSelected(PhySafety.isSeatBelt());
		cbSensorAlarm.setSelected(PhySafety.isSensorAlarm());
		cbWcAlarm.setSelected(PhySafety.isWcAlarm());
		cbWedgeCushion.setSelected(PhySafety.isWedgeCushion());
	}
}
