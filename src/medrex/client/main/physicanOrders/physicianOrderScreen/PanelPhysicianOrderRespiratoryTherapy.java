package medrex.client.main.physicanOrders.physicianOrderScreen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.MedicationAndTreatment.FrameMedicationDesktop;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldFormatter;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderRecord;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderRespiratoryTherapy;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxPanel; //import com.sX.swing.JxTabbedPane$JxTab;
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
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.BlueOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelPhysicianOrderRespiratoryTherapy extends JxPanel {
	private JxComboBox comboBox_4;
	private JxComboBox comboBox_3;
	private JxComboBox comboBox_2;
	private JxComboBox comboBox;
	private JxLabel lblDurationFrom;
	private JxPanel panel_incentiveSpirometer;
	private JxRadioButton rbIncentiveSpirometer;
	private JxLabel lblPercent_1;
	private JxPanel panel_cpapBpap;
	private JxPanel panel_chestPhysiotherapy;
	private JxPanel panel_trachCare;
	private JxPanel panel_pulseOximetry;
	private JxPanel panel_oxygen;
	private JxText txtOxygen;
	private JxRadioButton rbChestPhysiotherapy;
	private JxRadioButton rbTrachCare;
	private JxRadioButton rbCpapBipap;
	private JxRadioButton rbPulseOximetry;
	private JxRadioButton rbOxygen;
	/**
	 * 
	 */
	private static final long serialVersionUID = 2778178067126969200L;
	// <<<<<<< .mine
	private JxText txtSetting;
	private JxText txtDuration;
	private JxText txtFrequency;
	private JxCheckBox cbBipap;
	private JxCheckBox cbCpap;
	private JxText txtMinutes;
	// private JxText txtTypeOfCollar;
	// private JxText txtSizeOfCollar;
	// private JxText txtTypeOfTrach;
	// private JxText txtSizeOfTrach;
	private JxText txtTypeOfCannula;
	private JxText txtSizeOfCannula;
	// =======
	private JxLabel lblPercent;
	private JxText txtOthers;
	private JxRadioButton rbTwiceDaily;
	// >>>>>>> .r1372
	private JxButton btnDelete;
	private JxButton btnAddNew;
	private JxButton bntSave;
	private ButtonGroup bgPrnFor = new ButtonGroup();
	private ButtonGroup bgTrachCare = new ButtonGroup();
	private ButtonGroup bgPulseOximetry = new ButtonGroup();
	private JxPanel panelPO;
	private JxComboBox cmbChestPhysiotherapyFrequency;
	private JxComboBox cmbChestPhysiotherapyNumber;
	private JxComboBox cmbTrachCausrFrequency;
	private JxComboBox cmbTrachCausrNumber;
	private JxComboBox cmbTrachSiteFrequency;
	private JxComboBox cmbTrachSiteNumber;
	private JxComboBox cmbInnerCannulaFrequency;
	private JxComboBox cmbInnerCannulaNumber;
	private JxRadioButton rbTrachCarePrn;
	private JxRadioButton rbTrachCareQhours;
	private JxRadioButton rbTrachCareQShift;
	private JxComboBox cmbTrachCareFrequency;
	private JxComboBox cmbTrachCareNumber;
	private JxRadioButton rbOthers;
	private JxRadioButton rbPrn;
	private JxRadioButton rbDaily;
	private JxRadioButton rbQShift;
	private JxComboBox cmbPulseOximetryFrequency;
	private JxComboBox cmbPulseOximetryNumber;
	private JxComboBox cmbVia;
	private JxText txtPo;
	private JxRadioButton rbPo;
	private JxRadioButton rbSob;
	private JxRadioButton rbPrnFor;
	private JxRadioButton rbContinuous;
	private JxText txtOxygenPercent;

	private ButtonGroup bg = new ButtonGroup();

	Theme theme = new BlueOverWhiteTheme();

	public PanelPhysicianOrderRespiratoryTherapy() {
		super();
		setLayout(null);
		// <<<<<<< .mine
		setPreferredSize(new Dimension(820, 700));
		// =======
		// setPreferredSize(new Dimension(855, 500));
		// >>>>>>> .r1372
		Global.panelPhysicianOrdersRespiratoryTherapy = this;
		setBackground(Color.WHITE);
		setArc(1.0f);
		setLayout(null);
		setBorder(new LineBorder(ColorConstants.DEF_COLOR, 1));
		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);

		// panel.setLayout(new BorderLayout());
		// panel.setBounds(0, 0, 826, 544);
		// add(panel);
		
		final JxLabel rLabel = new JxLabel();
		rLabel.setTheme(theme);
		rLabel.setBounds(10, 10, 800, 50);
		rLabel.setForeground(ColorConstants.DEF_COLOR);
		rLabel.setHorizontalAlignment(SwingConstants.CENTER);
		rLabel.setFontSize(18);
		rLabel.setFontStyle(Font.BOLD);
		rLabel.setPreferredSize(new Dimension(0, 50));
		rLabel.setText("RESPIRATORY THERAPY");
		add(rLabel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setLayout(new FlowLayout());
		panel_1.setBounds(10, 141, 800, 460);

		panel_1.setFontSize(12);

		add(panel_1);
		ButtonGroup bg = new ButtonGroup();

		/*
		 * rbTrachCareQShift = new JxRadioButton(); rbTrachCareQShift.setTheme
		 * (theme); rbTrachCareQShift.setActionCommand("1");
		 * bgTrachCare.add(rbTrachCareQShift);
		 * rbTrachCareQShift.setForeground(ColorConstants.DEF_COLOR);
		 * 
		 * rbTrachCareQShift.setFontSize(12);
		 * rbTrachCareQShift.setFontStyle(Font.BOLD);
		 * 
		 * rbTrachCareQShift.setText("Q SHIFT");
		 * rbTrachCareQShift.setBounds(218, 270, 73, 18);
		 * panel_1.add(rbTrachCareQShift);
		 */

		/*
		 * rbTrachCareQhours = new JxRadioButton(); rbTrachCareQhours.setTheme
		 * (theme); rbTrachCareQhours.setActionCommand("2");
		 * bgTrachCare.add(rbTrachCareQhours);
		 * rbTrachCareQhours.setForeground(ColorConstants.DEF_COLOR);
		 * 
		 * rbTrachCareQhours.setFontSize(12);
		 * rbTrachCareQhours.setFontStyle(Font.BOLD);
		 * 
		 * rbTrachCareQhours.setText("QHOURS"); rbTrachCareQhours.setBounds(295,
		 * 270, 87, 18); panel_1.add(rbTrachCareQhours);
		 * 
		 * rbTrachCarePrn = new JxRadioButton(); rbTrachCarePrn.setTheme
		 * (theme); rbTrachCarePrn.setActionCommand("3");
		 * bgTrachCare.add(rbTrachCarePrn);
		 * rbTrachCarePrn.setForeground(ColorConstants.DEF_COLOR);
		 * 
		 * Font("Tahoma", Font.BOLD, 12)); rbTrachCarePrn.setText("PRN");
		 * rbTrachCarePrn.setBounds(382, 270, 73, 18);
		 * panel_1.add(rbTrachCarePrn);
		 */

		/*
		 * txtSizeOfTrach = new JxText(); txtSizeOfTrach.setTheme (theme);
		 * txtSizeOfTrach.setForeground(ColorConstants.DEF_COLOR);
		 * txtSizeOfTrach.setBounds(665, 295, 22, 20);
		 * panel_1.add(txtSizeOfTrach);
		 */

		/*
		 * txtSizeOfCollar = new JxText(); txtSizeOfCollar.setTheme (theme);
		 * txtSizeOfCollar.setForeground(ColorConstants.DEF_COLOR);
		 * txtSizeOfCollar.setBounds(665, 323, 22, 20);
		 * panel_1.add(txtSizeOfCollar);
		 */

		/*
		 * txtTypeOfTrach = new JxText(); txtTypeOfTrach.setBounds(725, 296,
		 * txtTypeOfTrach.setTheme (theme); 22, 20);
		 * panel_1.add(txtTypeOfTrach);
		 */

		/*
		 * txtTypeOfCollar = new JxText(); txtTypeOfCollar.setBounds(725,
		 * txtTypeOfCollar.setTheme (theme); 326, 22, 20);
		 * panel_1.add(txtTypeOfCollar);
		 */

		panel_oxygen = new JxPanel();
		panel_oxygen.setTheme(theme);
		panel_oxygen.setPreferredSize(new Dimension(780, 81));

		panel_oxygen.setLayout(null);
		panel_1.add(panel_oxygen);

		final JxLabel lminuteLabel = new JxLabel();
		lminuteLabel.setTheme(theme);
		lminuteLabel.setBounds(115, 8, 66, 16);
		panel_oxygen.add(lminuteLabel);
		lminuteLabel.setForeground(ColorConstants.DEF_COLOR);

		lminuteLabel.setFontSize(12);
		// lminuteLabel.setFontStyle(Font.BOLD);
		lminuteLabel.setText("L/MINUTE");

		txtOxygenPercent = new JxText(FieldFormatter.MAX3);
		txtOxygenPercent.setTheme(theme);
		txtOxygenPercent.setBounds(191, 8, 43, 18);
		panel_oxygen.add(txtOxygenPercent);

		final JxLabel viaLabel = new JxLabel();
		viaLabel.setTheme(theme);
		viaLabel.setBounds(255, 8, 30, 16);
		panel_oxygen.add(viaLabel);
		viaLabel.setForeground(ColorConstants.DEF_COLOR);

		viaLabel.setFontSize(12);
		// viaLabel.setFontStyle(Font.BOLD);
		viaLabel.setText("VIA");

		cmbVia = new JxComboBox();
		cmbVia.setTheme(theme);
		cmbVia.setBounds(295, 8, 127, 18);
		cmbVia.setForeground(ColorConstants.DEF_COLOR);
		panel_oxygen.add(cmbVia);
		cmbVia.setModel(new DefaultComboBoxModel(new String[] { "",
				"NASAL CANNULA", "VENTIMASK", "NRB", "TRACH COLLAR" }));

		// <<<<<<< .mine
		// =======
		// >>>>>>> .r1372

		rbContinuous = new JxRadioButton();
		rbContinuous.setTheme(theme);
		rbContinuous.setBounds(10, 32, 127, 18);
		panel_oxygen.add(rbContinuous);
		rbContinuous.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {

				if (rbContinuous.isSelected()) {
					rbSob.setEnabled(false);
					rbPo.setEnabled(false);
					txtPo.setEnabled(false);
					lblPercent.setEnabled(false);

				}

			}
		});
		rbContinuous.setForeground(ColorConstants.DEF_COLOR);

		rbContinuous.setFontSize(12);
		// rbContinuous.setFontStyle(Font.BOLD);
		rbContinuous.setText(" CONTINUOUS");
		bg.add(rbContinuous);

		rbPrnFor = new JxRadioButton();
		rbPrnFor.setTheme(theme);
		rbPrnFor.setBounds(10, 56, 118, 18);
		panel_oxygen.add(rbPrnFor);
		bg.add(rbPrnFor);

		rbPrnFor.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(final ActionEvent arg0) {
				if (rbPrnFor.isSelected()) {
					rbSob.setEnabled(true);
					rbPo.setEnabled(true);

				} else {
					rbSob.setEnabled(false);
					rbPo.setEnabled(false);
				}
			}
		});
		rbPrnFor.setForeground(ColorConstants.DEF_COLOR);

		rbPrnFor.setFontSize(12);
		// rbPrnFor.setFontStyle(Font.BOLD);
		rbPrnFor.setActionCommand("  PRN         ");

		rbPrnFor.setText("  PRN      FOR   ");

		rbSob = new JxRadioButton();
		rbSob.setTheme(theme);
		rbSob.setBounds(130, 56, 55, 18);
		panel_oxygen.add(rbSob);
		rbSob.setActionCommand("1");
		rbSob.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				SwingUtils.disableComponents(panelPO, false);
			}
		});
		bgPrnFor.add(rbSob);
		rbSob.setForeground(ColorConstants.DEF_COLOR);

		rbSob.setFontSize(12);
		// rbSob.setFontStyle(Font.BOLD);

		rbSob.setText("SOB");

		rbSob.setEnabled(false);

		rbPo = new JxRadioButton();
		rbPo.setTheme(theme);
		rbPo.setBounds(199, 56, 148, 18);
		panel_oxygen.add(rbPo);
		rbPo.setActionCommand("2");
		bgPrnFor.add(rbPo);
		rbPo.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				SwingUtils.disableComponents(panelPO, true);
			}
		});
		rbPo.setForeground(ColorConstants.DEF_COLOR);

		rbPo.setFontSize(12);
		// rbPo.setFontStyle(Font.BOLD);

		rbPo.setText("Pulse Oximetry  <=");

		rbPo.setEnabled(false);
		panelPO = new JxPanel();
		panelPO.setTheme(theme);
		panelPO.setBounds(352, 38, 136, 36);
		panel_oxygen.add(panelPO);
		panelPO.setLayout(null);

		txtPo = new JxText(FieldFormatter.MAX3);
		txtPo.setTheme(theme);
		txtPo.setBounds(2, 15, 55, 19);
		panelPO.add(txtPo);

		lblPercent = new JxLabel();
		lblPercent.setTheme(theme);
		lblPercent.setForeground(ColorConstants.DEF_COLOR);
		lblPercent.setFontSize(12);
		// lblPercent.setFontStyle(Font.BOLD);
		lblPercent.setText("%");
		lblPercent.setBounds(71, 15, 30, 16);
		panelPO.add(lblPercent);

		SwingUtils.disableComponents(panelPO, false);
		final JxRadioButton radioButton = new JxRadioButton();
		radioButton.setTheme(theme);
		radioButton.setBounds(-89, 15, 63, 18);
		panelPO.add(radioButton);
		radioButton.setText("New JxRadioButton");

		txtOxygen = new JxText(FieldFormatter.MAX2);
		txtOxygen.setTheme(theme);
		txtOxygen.setBounds(76, 8, 30, 20);
		panel_oxygen.add(txtOxygen);

		final JxLabel oxygenLabel = new JxLabel();
		oxygenLabel.setTheme(theme);

		oxygenLabel.setFontSize(12);
		// oxygenLabel.setFontStyle(Font.BOLD);
		oxygenLabel.setText("OXYGEN");
		oxygenLabel.setForeground(ColorConstants.DEF_COLOR);
		oxygenLabel.setBounds(10, 10, 66, 16);
		panel_oxygen.add(oxygenLabel);

		lblPercent_1 = new JxLabel();
		lblPercent_1.setTheme(theme);

		lblPercent_1.setFontSize(12);
		// lblPercent_1.setFontStyle(Font.BOLD);
		lblPercent_1.setForeground(ColorConstants.DEF_COLOR);
		lblPercent_1.setText("%");
		lblPercent_1.setBounds(236, 10, 30, 16);
		panel_oxygen.add(lblPercent_1);

		panel_pulseOximetry = new JxPanel();
		panel_pulseOximetry.setTheme(theme);
		panel_pulseOximetry.setPreferredSize(new Dimension(780, 37));

		panel_pulseOximetry.setLayout(null);
		panel_1.add(panel_pulseOximetry);

		/*
		 * cmbPulseOximetryNumber = new JxComboBox();
		 * cmbPulseOximetryNumber.setTheme (theme);
		 * cmbPulseOximetryNumber.setModel(new DefaultComboBoxModel(new String[]
		 * {"", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		 * 
		 * cmbPulseOximetryNumber.setBounds(171, 140, 127, 18);
		 * panel_1.add(cmbPulseOximetryNumber);
		 * 
		 * cmbPulseOximetryFrequency = new JxComboBox();
		 * cmbPulseOximetryFrequency.setTheme (theme);
		 * cmbPulseOximetryFrequency.setModel(new DefaultComboBoxModel(new
		 * String[] {"", "Hourly", "Daily", "Weekly", "Monthly"}));
		 * 
		 * cmbPulseOximetryFrequency.setBounds(341, 140, 127, 18);
		 * panel_1.add(cmbPulseOximetryFrequency);
		 */
		rbQShift = new JxRadioButton();
		rbQShift.setTheme(theme);
		rbQShift.setBounds(10, 10, 73, 18);
		panel_pulseOximetry.add(rbQShift);
		rbQShift.setActionCommand("1");
		bgPulseOximetry.add(rbQShift);
		rbQShift.setForeground(ColorConstants.DEF_COLOR);
		rbQShift.setFontSize(12);
		// rbQShift.setFontStyle(Font.BOLD);
		rbQShift.setText("Q SHIFT");
		rbQShift.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				txtOthers.setEnabled(false);
			}
		});
		// =======

		rbTwiceDaily = new JxRadioButton();
		rbTwiceDaily.setTheme(theme);
		rbTwiceDaily.setBounds(102, 10, 105, 18);
		panel_pulseOximetry.add(rbTwiceDaily);
		rbTwiceDaily.setActionCommand("2");

		bgPulseOximetry.add(rbTwiceDaily);
		rbTwiceDaily.setForeground(ColorConstants.DEF_COLOR);

		rbTwiceDaily.setFontSize(12);
		// rbTwiceDaily.setFontStyle(Font.BOLD);
		rbTwiceDaily.setOpaque(false);
		rbTwiceDaily.setText("TWICE DAILY");
		rbTwiceDaily.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				txtOthers.setEnabled(false);
			}
		});

		rbDaily = new JxRadioButton();
		rbDaily.setTheme(theme);
		rbDaily.setBounds(224, 10, 73, 18);
		panel_pulseOximetry.add(rbDaily);
		rbDaily.setActionCommand("3");
		bgPulseOximetry.add(rbDaily);
		rbDaily.setForeground(ColorConstants.DEF_COLOR);

		rbDaily.setFontSize(12);
		// rbDaily.setFontStyle(Font.BOLD);

		rbDaily.setText("DAILY");
		rbDaily.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				txtOthers.setEnabled(false);
			}
		});

		rbPrn = new JxRadioButton();
		rbPrn.setTheme(theme);
		rbPrn.setBounds(303, 10, 66, 18);
		panel_pulseOximetry.add(rbPrn);
		rbPrn.setActionCommand("4");
		bgPulseOximetry.add(rbPrn);
		rbPrn.setForeground(ColorConstants.DEF_COLOR);

		rbPrn.setFontSize(12);
		// rbPrn.setFontStyle(Font.BOLD);

		rbPrn.setText("PRN");
		rbPrn.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				txtOthers.setEnabled(false);
			}
		});

		rbOthers = new JxRadioButton();
		rbOthers.setTheme(theme);
		rbOthers.setBounds(375, 10, 73, 18);
		panel_pulseOximetry.add(rbOthers);
		rbOthers.setActionCommand("1");		
		bgPulseOximetry.add(rbOthers);	
		rbOthers.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				// SwingUtils.disableComponents(txtOthers, true);
				txtOthers.setEnabled(true);
			}
		});
		rbOthers.setForeground(ColorConstants.DEF_COLOR);

		rbOthers.setFontSize(12);
		// rbOthers.setFontStyle(Font.BOLD);

		rbOthers.setText("OTHERS");

		txtOthers = new JxText();
		// txtOthers.setEnabled(false);
		txtOthers.setTheme(theme);
		txtOthers.setBounds(460, 10, 98, 18);
		panel_pulseOximetry.add(txtOthers);

		panel_cpapBpap = new JxPanel();
		panel_cpapBpap.setTheme(theme);
		panel_cpapBpap.setPreferredSize(new Dimension(780, 67));
		panel_cpapBpap.setLayout(null);

		panel_1.add(panel_cpapBpap);

		cbCpap = new JxCheckBox();
		cbCpap.setTheme(theme);
		cbCpap.setBounds(10, 40, 66, 18);
		panel_cpapBpap.add(cbCpap);

		cbCpap.setFontSize(12);
		// cbCpap.setFontStyle(Font.BOLD);
		cbCpap.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				if (cbCpap.isSelected() || cbBipap.isSelected()) {
					// dcDurationFrom.setEnabled(true);
					// dcDurationTo.setEnabled(true);
				} else {
					// dcDurationFrom.setEnabled(false);
					// dcDurationTo.setEnabled(false);
				}
			}
		});

		cbCpap.setText("CPAP");
		cbCpap.setForeground(ColorConstants.DEF_COLOR);

		cbBipap = new JxCheckBox();
		cbBipap.setTheme(theme);
		cbBipap.setBounds(77, 40, 66, 18);
		panel_cpapBpap.add(cbBipap);

		cbBipap.setFontSize(12);
		// cbBipap.setFontStyle(Font.BOLD);
		cbBipap.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				if (cbBipap.isSelected()) {
					// dcDurationFrom.setEnabled(true);
					// dcDurationTo.setEnabled(true);
				} else {
					// dcDurationFrom.setEnabled(false);
					// dcDurationTo.setEnabled(false);
				}
			}
		});

		cbBipap.setText("BIPAP");
		cbBipap.setForeground(ColorConstants.DEF_COLOR);

		final JxLabel settingLabel = new JxLabel();
		settingLabel.setTheme(theme);
		settingLabel.setBounds(181, 40, 66, 18);
		panel_cpapBpap.add(settingLabel);

		settingLabel.setFontSize(12);
		// settingLabel.setFontStyle(Font.BOLD);
		settingLabel.setForeground(ColorConstants.DEF_COLOR);
		settingLabel.setText("Setting");

		txtSetting = new JxText();
		txtSetting.setTheme(theme);
		txtSetting.setBounds(238, 40, 78, 18);
		panel_cpapBpap.add(txtSetting);

		final JxPanel panel1 = new JxPanel();
		panel1.setBackground(Color.WHITE);
		panel1.setBounds(348, 10, 422, 50);
		panel_cpapBpap.add(panel1);
		panel1.setLayout(null);

		comboBox = new JxComboBox();
		//comboBox.setBackground(Color.WHITE);
		//comboBox.setForeground(ColorConstants.DEF_COLOR);
		comboBox.setTheme(theme);
		comboBox.setBounds(27, 25, 50, 21);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "00", "01",
				"02", "03", "04", "05", "06", "07", "08", "09", "10", "11",
				"12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
				"22", "23" }));
		panel1.add(comboBox);

		final JxLabel label = new JxLabel();		
		//label.setForeground(ColorConstants.DEF_COLOR);
		label.setTheme(theme);
		label.setFontSize(14);
		label.setFontStyle(Font.BOLD);
		label.setText(":");
		label.setBounds(83, 28, 16, 14);
		panel1.add(label);

		comboBox_2 = new JxComboBox();
		//comboBox_2.setBackground(Color.WHITE);
		//comboBox_2.setForeground(ColorConstants.DEF_COLOR);
		comboBox_2.setTheme(theme);
		comboBox_2.setBounds(105, 25, 50, 21);
		String strArr[] = new String[60];
		for (int i = 0; i < strArr.length; i++) {
			if (i < 10)
				strArr[i] = "0" + Integer.toString(i);
			else
				strArr[i] = Integer.toString(i);
		}
		comboBox_2.setModel(new DefaultComboBoxModel(strArr));
		panel1.add(comboBox_2);

		comboBox_3 = new JxComboBox();
		//comboBox_3.setBackground(Color.WHITE);
		//comboBox_3.setForeground(ColorConstants.DEF_COLOR);
		comboBox_3.setTheme(theme);
		comboBox_3.setBounds(273, 25, 50, 21);
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] { "00", "01",
				"02", "03", "04", "05", "06", "07", "08", "09", "10", "11",
				"12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
				"22", "23" }));
		panel1.add(comboBox_3);

		final JxLabel label_1 = new JxLabel();
		//label_1.setForeground(ColorConstants.DEF_COLOR);
		label_1.setTheme(theme);
		label_1.setFontSize(14);
		label_1.setFontStyle(Font.BOLD);
		label_1.setText(":");
		label_1.setBounds(329, 29, 16, 14);
		panel1.add(label_1);

		comboBox_4 = new JxComboBox();		
		//comboBox_4.setBackground(Color.WHITE);
		//comboBox_4.setForeground(ColorConstants.DEF_COLOR);
		comboBox_4.setTheme(theme);
		comboBox_4.setBounds(345, 25, 50, 21);
		String strArr1[] = new String[60];
		for (int i = 0; i < strArr.length; i++) {
			if (i < 10)
				strArr1[i] = "0" + Integer.toString(i);
			else
				strArr1[i] = Integer.toString(i);
		}
		comboBox_4.setModel(new DefaultComboBoxModel(strArr1));
		panel1.add(comboBox_4);

		final JxLabel startTimeLabel = new JxLabel();
		startTimeLabel.setForeground(ColorConstants.DEF_COLOR);
		// startTimeLabel.setFontStyle(Font.BOLD);
		startTimeLabel.setText("Start Time");
		startTimeLabel.setBounds(58, 5, 74, 14);
		panel1.add(startTimeLabel);

		final JxLabel endTimeLabel = new JxLabel();
		endTimeLabel.setForeground(ColorConstants.DEF_COLOR);
		// endTimeLabel.setFontStyle(Font.BOLD);
		endTimeLabel.setText("End Time");
		endTimeLabel.setBounds(296, 5, 54, 14);
		panel1.add(endTimeLabel);

		final JxLabel lblTimes = new JxLabel();
		lblTimes.setTheme(theme);

		lblTimes.setFontSize(12);
		// lblTimes.setFontStyle(Font.BOLD);
		lblTimes.setForeground(ColorConstants.DEF_COLOR);
		lblTimes.setText("Times");
		lblTimes.setBounds(10, 19, 66, 18);
		panel.add(lblTimes);

		lblDurationFrom = new JxLabel();
		lblDurationFrom.setTheme(theme);
		lblDurationFrom.setText("");
		lblDurationFrom.setBounds(86, 22, 85, 14);
		panel.add(lblDurationFrom);

		panel_trachCare = new JxPanel();
		panel_trachCare.setTheme(theme);
		panel_trachCare.setPreferredSize(new Dimension(780, 108));

		panel_trachCare.setLayout(null);
		panel_1.add(panel_trachCare);

		final JxLabel changeInnerCannulaLabel = new JxLabel();
		changeInnerCannulaLabel.setTheme(theme);
		changeInnerCannulaLabel.setBounds(10, 16, 168, 16);
		panel_trachCare.add(changeInnerCannulaLabel);
		changeInnerCannulaLabel.setForeground(ColorConstants.DEF_COLOR);

		changeInnerCannulaLabel.setFontSize(12);
		// changeInnerCannulaLabel.setFontStyle(Font.BOLD);
		changeInnerCannulaLabel.setText("CHANGE INNER CANNULA");

		cmbInnerCannulaNumber = new JxComboBox();
		cmbInnerCannulaNumber.setTheme(theme);
		cmbInnerCannulaNumber.setBounds(246, 14, 127, 18);
		panel_trachCare.add(cmbInnerCannulaNumber);
		cmbInnerCannulaNumber.setModel(new DefaultComboBoxModel(new String[] {
				"", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

		// <<<<<<< .mine

		final JxLabel timesLabel = new JxLabel();
		timesLabel.setTheme(theme);
		timesLabel.setBounds(408, 16, 43, 16);
		panel_trachCare.add(timesLabel);
		timesLabel.setForeground(ColorConstants.DEF_COLOR);

		timesLabel.setFontSize(12);
		// timesLabel.setFontStyle(Font.BOLD);
		timesLabel.setText("TIMES");

		cmbInnerCannulaFrequency = new JxComboBox();
		cmbInnerCannulaFrequency.setTheme(theme);
		cmbInnerCannulaFrequency.setBounds(457, 14, 127, 18);
		panel_trachCare.add(cmbInnerCannulaFrequency);
		cmbInnerCannulaFrequency.setModel(new DefaultComboBoxModel(
				new String[] { "", "Hourly", "Daily", "Weekly", "Monthly" }));

		final JxLabel changeTrachSiteLabel = new JxLabel();
		changeTrachSiteLabel.setTheme(theme);
		changeTrachSiteLabel.setBounds(10, 38, 152, 16);
		panel_trachCare.add(changeTrachSiteLabel);
		changeTrachSiteLabel.setForeground(ColorConstants.DEF_COLOR);

		changeTrachSiteLabel.setFontSize(12);
		// changeTrachSiteLabel.setFontStyle(Font.BOLD);
		changeTrachSiteLabel.setText("CLEANSE TRACH SITE");

		final JxLabel changeTrachCauseLabel = new JxLabel();
		changeTrachCauseLabel.setTheme(theme);
		changeTrachCauseLabel.setBounds(10, 58, 152, 16);
		panel_trachCare.add(changeTrachCauseLabel);
		changeTrachCauseLabel.setForeground(ColorConstants.DEF_COLOR);

		changeTrachCauseLabel.setFontSize(12);
		// changeTrachCauseLabel.setFontStyle(Font.BOLD);
		changeTrachCauseLabel.setText("CHANGE TRACH COLLAR");

		final JxLabel trachCareLabel = new JxLabel();
		trachCareLabel.setTheme(theme);
		trachCareLabel.setBounds(10, 80, 73, 16);
		panel_trachCare.add(trachCareLabel);
		trachCareLabel.setForeground(ColorConstants.DEF_COLOR);

		trachCareLabel.setFontSize(12);
		// trachCareLabel.setFontStyle(Font.BOLD);
		trachCareLabel.setText("SUCTION");

		cmbTrachSiteNumber = new JxComboBox();
		cmbTrachSiteNumber.setTheme(theme);
		cmbTrachSiteNumber.setBounds(246, 36, 127, 18);
		panel_trachCare.add(cmbTrachSiteNumber);
		cmbTrachSiteNumber.setModel(new DefaultComboBoxModel(new String[] { "",
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

		cmbTrachCausrNumber = new JxComboBox();
		cmbTrachCausrNumber.setTheme(theme);
		cmbTrachCausrNumber.setBounds(246, 56, 127, 17);
		panel_trachCare.add(cmbTrachCausrNumber);
		cmbTrachCausrNumber.setModel(new DefaultComboBoxModel(new String[] {
				"", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

		cmbTrachCareNumber = new JxComboBox();
		cmbTrachCareNumber.setTheme(theme);
		cmbTrachCareNumber.setBounds(246, 76, 127, 18);
		panel_trachCare.add(cmbTrachCareNumber);
		cmbTrachCareNumber.setModel(new DefaultComboBoxModel(new String[] { "",
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

		final JxLabel timesLabel_1 = new JxLabel();
		timesLabel_1.setTheme(theme);
		timesLabel_1.setBounds(408, 38, 43, 16);
		panel_trachCare.add(timesLabel_1);
		timesLabel_1.setForeground(ColorConstants.DEF_COLOR);

		timesLabel_1.setFontSize(12);
		// timesLabel_1.setFontStyle(Font.BOLD);
		timesLabel_1.setText("TIMES");

		final JxLabel timesLabel_2 = new JxLabel();
		timesLabel_2.setTheme(theme);
		timesLabel_2.setBounds(408, 58, 43, 16);
		panel_trachCare.add(timesLabel_2);
		timesLabel_2.setForeground(ColorConstants.DEF_COLOR);

		timesLabel_2.setFontSize(12);
		// timesLabel_2.setFontStyle(Font.BOLD);
		timesLabel_2.setText("TIMES");

		final JxLabel timesLabel_2_2 = new JxLabel();
		timesLabel_2_2.setTheme(theme);
		timesLabel_2_2.setBounds(408, 80, 43, 16);
		panel_trachCare.add(timesLabel_2_2);

		timesLabel_2_2.setFontSize(12);
		// timesLabel_2_2.setFontStyle(Font.BOLD);
		timesLabel_2_2.setText("TIMES");
		timesLabel_2_2.setForeground(ColorConstants.DEF_COLOR);

		cmbTrachSiteFrequency = new JxComboBox();
		cmbTrachSiteFrequency.setTheme(theme);
		cmbTrachSiteFrequency.setBounds(457, 36, 127, 18);
		panel_trachCare.add(cmbTrachSiteFrequency);
		cmbTrachSiteFrequency.setModel(new DefaultComboBoxModel(new String[] {
				"", "Hourly", "Daily", "Weekly", "Monthly" }));

		cmbTrachCausrFrequency = new JxComboBox();
		cmbTrachCausrFrequency.setTheme(theme);
		cmbTrachCausrFrequency.setBounds(457, 56, 127, 18);
		panel_trachCare.add(cmbTrachCausrFrequency);
		cmbTrachCausrFrequency.setModel(new DefaultComboBoxModel(new String[] {
				"", "Hourly", "Daily", "Weekly", "Monthly" }));

		cmbTrachCareFrequency = new JxComboBox();
		cmbTrachCareFrequency.setTheme(theme);
		cmbTrachCareFrequency.setBounds(457, 76, 127, 18);
		panel_trachCare.add(cmbTrachCareFrequency);
		cmbTrachCareFrequency.setModel(new DefaultComboBoxModel(new String[] {
				"", "Hourly", "Daily", "Weekly", "Monthly" }));

		txtTypeOfCannula = new JxText();
		txtTypeOfCannula.setTheme(theme);
		txtTypeOfCannula.setBounds(724, 12, 49, 20);
		panel_trachCare.add(txtTypeOfCannula);

		final JxLabel sizeLabel_3 = new JxLabel();
		sizeLabel_3.setTheme(theme);
		sizeLabel_3.setBounds(689, 16, 30, 16);
		panel_trachCare.add(sizeLabel_3);

		sizeLabel_3.setFontSize(12);
		// sizeLabel_3.setFontStyle(Font.BOLD);
		sizeLabel_3.setText("TYPE");
		sizeLabel_3.setForeground(ColorConstants.DEF_COLOR);

		txtSizeOfCannula = new JxText();
		txtSizeOfCannula.setTheme(theme);
		txtSizeOfCannula.setBounds(627, 12, 57, 20);
		panel_trachCare.add(txtSizeOfCannula);
		txtSizeOfCannula.setForeground(ColorConstants.DEF_COLOR);

		final JxLabel sizeLabel = new JxLabel();
		sizeLabel.setTheme(theme);
		sizeLabel.setBounds(593, 16, 30, 16);
		panel_trachCare.add(sizeLabel);
		sizeLabel.setForeground(ColorConstants.DEF_COLOR);

		sizeLabel.setFontSize(12);
		// sizeLabel.setFontStyle(Font.BOLD);
		sizeLabel.setText("SIZE");

		panel_chestPhysiotherapy = new JxPanel();
		panel_chestPhysiotherapy.setTheme(theme);
		panel_chestPhysiotherapy.setPreferredSize(new Dimension(780, 37));

		panel_chestPhysiotherapy.setLayout(null);
		panel_1.add(panel_chestPhysiotherapy);

		final JxLabel chestPhysiotherapyLabel = new JxLabel();
		chestPhysiotherapyLabel.setTheme(theme);
		chestPhysiotherapyLabel.setBounds(10, 10, 152, 16);
		panel_chestPhysiotherapy.add(chestPhysiotherapyLabel);
		chestPhysiotherapyLabel.setForeground(ColorConstants.DEF_COLOR);

		chestPhysiotherapyLabel.setFontSize(12);
		// chestPhysiotherapyLabel.setFontStyle(Font.BOLD);
		chestPhysiotherapyLabel.setText("CHEST PHYSIOTHERAPY");

		cmbChestPhysiotherapyNumber = new JxComboBox();
		cmbChestPhysiotherapyNumber.setTheme(theme);
		cmbChestPhysiotherapyNumber.setBounds(168, 8, 83, 18);
		panel_chestPhysiotherapy.add(cmbChestPhysiotherapyNumber);
		cmbChestPhysiotherapyNumber.setModel(new DefaultComboBoxModel(
				new String[] { "", "1", "2", "3", "4", "5", "6", "7", "8", "9",
						"10" }));

		final JxLabel timesLabel_3 = new JxLabel();
		timesLabel_3.setTheme(theme);
		timesLabel_3.setBounds(297, 10, 43, 16);
		panel_chestPhysiotherapy.add(timesLabel_3);
		timesLabel_3.setForeground(ColorConstants.DEF_COLOR);

		timesLabel_3.setFontSize(12);
		// timesLabel_3.setFontStyle(Font.BOLD);
		timesLabel_3.setText("TIMES");

		cmbChestPhysiotherapyFrequency = new JxComboBox();
		cmbChestPhysiotherapyFrequency.setTheme(theme);
		cmbChestPhysiotherapyFrequency.setBounds(346, 8, 124, 18);
		panel_chestPhysiotherapy.add(cmbChestPhysiotherapyFrequency);
		cmbChestPhysiotherapyFrequency.setModel(new DefaultComboBoxModel(
				new String[] { "", "Hourly", "Daily", "Weekly", "Monthly" }));

		final JxLabel timesLabel_2_1 = new JxLabel();
		timesLabel_2_1.setTheme(theme);
		timesLabel_2_1.setBounds(522, 10, 55, 16);
		panel_chestPhysiotherapy.add(timesLabel_2_1);
		timesLabel_2_1.setForeground(ColorConstants.DEF_COLOR);

		timesLabel_2_1.setFontSize(12);
		// timesLabel_2_1.setFontStyle(Font.BOLD);
		timesLabel_2_1.setText("Minutes");

		txtMinutes = new JxText();
		txtMinutes.setTheme(theme);
		txtMinutes.setBounds(583, 8, 55, 18);
		panel_chestPhysiotherapy.add(txtMinutes);

		panel_incentiveSpirometer = new JxPanel();
		panel_incentiveSpirometer.setTheme(theme);
		panel_incentiveSpirometer.setPreferredSize(new Dimension(780, 35));

		panel_incentiveSpirometer.setLayout(null);
		panel_1.add(panel_incentiveSpirometer);

		final JxLabel incentiveSpirometerLabel = new JxLabel();
		incentiveSpirometerLabel.setTheme(theme);
		incentiveSpirometerLabel.setBounds(10, 10, 152, 14);
		panel_incentiveSpirometer.add(incentiveSpirometerLabel);

		incentiveSpirometerLabel.setFontSize(12);
		// incentiveSpirometerLabel.setFontStyle(Font.BOLD);
		incentiveSpirometerLabel.setForeground(ColorConstants.DEF_COLOR);
		incentiveSpirometerLabel.setText("INCENTIVE SPIROMETER");

		final JxLabel incentiveSpirometerLabel_1 = new JxLabel();
		incentiveSpirometerLabel_1.setTheme(theme);
		incentiveSpirometerLabel_1.setBounds(246, 10, 66, 14);
		panel_incentiveSpirometer.add(incentiveSpirometerLabel_1);

		incentiveSpirometerLabel_1.setFontSize(12);
		// incentiveSpirometerLabel_1.setFontStyle(Font.BOLD);
		incentiveSpirometerLabel_1.setForeground(ColorConstants.DEF_COLOR);
		incentiveSpirometerLabel_1.setText("Frequency");

		txtFrequency = new JxText();
		txtFrequency.setTheme(theme);
		txtFrequency.setBounds(318, 9, 57, 18);
		panel_incentiveSpirometer.add(txtFrequency);

		final JxLabel incentiveSpirometerLabel_1_1 = new JxLabel();
		incentiveSpirometerLabel_1_1.setTheme(theme);
		incentiveSpirometerLabel_1_1.setBounds(408, 10, 57, 14);
		panel_incentiveSpirometer.add(incentiveSpirometerLabel_1_1);

		incentiveSpirometerLabel_1_1.setFontSize(12);
		// incentiveSpirometerLabel_1_1.setFontStyle(Font.BOLD);
		incentiveSpirometerLabel_1_1.setForeground(ColorConstants.DEF_COLOR);
		incentiveSpirometerLabel_1_1.setText("Duration");

		txtDuration = new JxText();
		txtDuration.setTheme(theme);
		txtDuration.setBounds(471, 9, 114, 18);
		panel_incentiveSpirometer.add(txtDuration);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_1.add(panel_3);
		panel_3.setPreferredSize(new Dimension(780, 41));

		panel_3.setLayout(null);

		btnAddNew = new JxButton();
		btnAddNew.setTheme(theme);
		btnAddNew.setBounds(163, 10, 75, 21);
		panel_3.add(btnAddNew);

		btnAddNew.setForeground(ColorConstants.DEF_COLOR);

		btnAddNew.setFontSize(12);
		// btnAddNew.setFontStyle(Font.BOLD);
		btnAddNew.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {

				setBlankField();
				Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();
			}
		});
		btnAddNew.setArc(0.4f);
		btnAddNew.setText("Add New");

		bntSave = new JxButton();
		bntSave.setTheme(theme);
		bntSave.setBounds(302, 10, 75, 21);
		panel_3.add(bntSave);

		bntSave.setForeground(ColorConstants.DEF_COLOR);

		bntSave.setFontSize(12);
		// bntSave.setFontStyle(Font.BOLD);
		bntSave.setArc(0.4f);
		bntSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {

				doSave();
				Global.framePhysicianOrder.dispose();
			}
		});
		bntSave.setText("Save");

		btnDelete = new JxButton();
		btnDelete.setTheme(theme);
		btnDelete.setBounds(450, 10, 75, 21);
		panel_3.add(btnDelete);

		btnDelete.setForeground(ColorConstants.DEF_COLOR);

		btnDelete.setFontSize(12);
		// btnDelete.setFontStyle(Font.BOLD);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				doDelete();
			}
		});
		btnDelete.setArc(0.4f);
		btnDelete.setText("Delete");

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);

		panel_2.setLayout(null);
		panel_2.setBounds(10, 66, 800, 69);
		add(panel_2);

		rbOxygen = new JxRadioButton();
		rbOxygen.setTheme(theme);
		// rbOxygen.setSelected(true);

		rbOxygen.setForeground(ColorConstants.DEF_COLOR);
		rbOxygen.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				doSelection();
			}
		});
		rbOxygen.setSelected(true);

		rbOxygen.setFontSize(12);
		rbOxygen.setFontStyle(Font.BOLD);
		rbOxygen.setText("OXYGEN");
		//

		bg.add(rbOxygen);
		rbOxygen.setBounds(10, 10, 70, 24);
		panel_2.add(rbOxygen);

		rbPulseOximetry = new JxRadioButton();
		rbPulseOximetry.setTheme(theme);
		rbPulseOximetry.setSelected(false);

		rbPulseOximetry.setForeground(ColorConstants.DEF_COLOR);

		rbPulseOximetry.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSelection();
			}
		});

		rbPulseOximetry.setFontSize(12);
		rbPulseOximetry.setFontStyle(Font.BOLD);
		rbPulseOximetry.setText("PULSE OXIMETRY");
		bg.add(rbPulseOximetry);
		rbPulseOximetry.setBounds(90, 10, 125, 24);
		panel_2.add(rbPulseOximetry);

		rbCpapBipap = new JxRadioButton();
		rbCpapBipap.setTheme(theme);

		rbCpapBipap.setForeground(ColorConstants.DEF_COLOR);
		rbCpapBipap.setSelected(false);
		rbCpapBipap.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSelection();
			}
		});

		rbCpapBipap.setFontSize(12);
		rbCpapBipap.setFontStyle(Font.BOLD);
		rbCpapBipap.setText("CPAP/BIPAP");
		bg.add(rbCpapBipap);
		rbCpapBipap.setBounds(225, 10, 100, 24);
		panel_2.add(rbCpapBipap);

		rbTrachCare = new JxRadioButton();
		rbTrachCare.setTheme(theme);

		rbTrachCare.setForeground(ColorConstants.DEF_COLOR);
		rbTrachCare.setSelected(false);
		rbTrachCare.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSelection();
			}
		});

		rbTrachCare.setFontSize(12);
		rbTrachCare.setFontStyle(Font.BOLD);
		rbTrachCare.setText("TRACH CARE");
		bg.add(rbTrachCare);
		rbTrachCare.setBounds(330, 10, 105, 24);
		panel_2.add(rbTrachCare);

		rbChestPhysiotherapy = new JxRadioButton();
		rbChestPhysiotherapy.setTheme(theme);
		rbChestPhysiotherapy.setSelected(false);
		rbChestPhysiotherapy.setForeground(ColorConstants.DEF_COLOR);

		rbChestPhysiotherapy.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSelection();
			}
		});

		rbChestPhysiotherapy.setFontSize(12);
		rbChestPhysiotherapy.setFontStyle(Font.BOLD);
		rbChestPhysiotherapy.setText("CHEST PHYSIOTHERAPY");
		bg.add(rbChestPhysiotherapy);
		rbChestPhysiotherapy.setBounds(630, 10, 170, 24);
		panel_2.add(rbChestPhysiotherapy);

		rbIncentiveSpirometer = new JxRadioButton();
		rbIncentiveSpirometer.setTheme(theme);
		rbIncentiveSpirometer.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				doSelection();
			}
		});
		rbIncentiveSpirometer.setForeground(ColorConstants.DEF_COLOR);

		rbIncentiveSpirometer.setFontSize(12);
		rbIncentiveSpirometer.setFontStyle(Font.BOLD);
		rbIncentiveSpirometer.setText("INCENTIVE SPIROMETER");
		bg.add(rbIncentiveSpirometer);
		rbIncentiveSpirometer.setBounds(445, 10, 175, 24);
		panel_2.add(rbIncentiveSpirometer);

		doSelection();
	}

	public void doDelete() {
		try {
			if (Global.currentPhysicianOrderRecordKey != 0
					&& Global.currentPhysicianOrderRespiratoryTherapyKey != 0) {
				MedrexClientManager.getInstance().deletePhysicianOrderRecord(
						Global.currentPhysicianOrderRecordKey);
				MedrexClientManager
						.getInstance()
						.deletePhysicianOrderRespiratoryTherapy(
								Global.currentPhysicianOrderRespiratoryTherapyKey);

			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();
		setBlankField();
	}

	private void doSelection() {

		if (rbOxygen.isSelected()) {
			panel_oxygen.setVisible(true);
			panel_pulseOximetry.setVisible(false);
			panel_cpapBpap.setVisible(false);
			panel_trachCare.setVisible(false);
			panel_incentiveSpirometer.setVisible(false);
			panel_chestPhysiotherapy.setVisible(false);
		}

		if (rbPulseOximetry.isSelected()) {
			panel_oxygen.setVisible(false);
			panel_pulseOximetry.setVisible(true);
			panel_cpapBpap.setVisible(false);
			panel_trachCare.setVisible(false);
			panel_incentiveSpirometer.setVisible(false);
			panel_chestPhysiotherapy.setVisible(false);
		}

		if (rbCpapBipap.isSelected()) {
			panel_oxygen.setVisible(false);
			panel_pulseOximetry.setVisible(false);
			panel_cpapBpap.setVisible(true);
			panel_trachCare.setVisible(false);
			panel_incentiveSpirometer.setVisible(false);
			panel_chestPhysiotherapy.setVisible(false);
		}

		if (rbTrachCare.isSelected()) {
			panel_oxygen.setVisible(false);
			panel_pulseOximetry.setVisible(false);
			panel_cpapBpap.setVisible(false);
			panel_trachCare.setVisible(true);
			panel_incentiveSpirometer.setVisible(false);
			panel_chestPhysiotherapy.setVisible(false);
		}

		if (rbIncentiveSpirometer.isSelected()) {
			panel_oxygen.setVisible(false);
			panel_pulseOximetry.setVisible(false);
			panel_cpapBpap.setVisible(false);
			panel_trachCare.setVisible(false);
			panel_incentiveSpirometer.setVisible(true);
			panel_chestPhysiotherapy.setVisible(false);
		}

		if (rbChestPhysiotherapy.isSelected()) {
			panel_oxygen.setVisible(false);
			panel_pulseOximetry.setVisible(false);
			panel_cpapBpap.setVisible(false);
			panel_trachCare.setVisible(false);
			panel_incentiveSpirometer.setVisible(false);
			panel_chestPhysiotherapy.setVisible(true);
		}
	}

	public void doSave() {
		PhysicianOrderRespiratoryTherapy phyresp = new PhysicianOrderRespiratoryTherapy();
		phyresp.setChestPhysiotherapyFrequency(cmbChestPhysiotherapyFrequency
				.getSelectedItem().toString());
		phyresp.setChestPhysiotherapyNumber(cmbChestPhysiotherapyNumber
				.getSelectedItem().toString());
		phyresp.setContinuous(rbContinuous.isSelected());
		phyresp.setPrnFor(SwingUtils.getSelectedButton(bgPrnFor));
		phyresp.setInnerCannulaFrequency(cmbInnerCannulaFrequency
				.getSelectedItem().toString());
		phyresp.setInnerCannulaNumber(cmbInnerCannulaNumber.getSelectedItem()
				.toString());
		if (!txtOxygen.getText().equalsIgnoreCase("")) {
			phyresp.setOxygen(Integer.parseInt(txtOxygen.getText()));
		}
		if (!txtOxygenPercent.getText().equalsIgnoreCase("")) {
			phyresp.setOxygenPercentage(Integer.parseInt(txtOxygenPercent
					.getText()));
		}
		phyresp.setSetting(txtSetting.getText());

		phyresp.setPRN(rbPrnFor.isSelected());
		phyresp.setPulseOximetry(SwingUtils.getSelectedButton(bgPulseOximetry));
		//phyresp.setPulseOximetryFrequency(cmbPulseOximetryFrequency.getSelectedItem().toString());
		//phyresp.setPulseOximetryNumber(cmbPulseOximetryNumber.getSelectedItem().toString());
		phyresp.setTrachCare(SwingUtils.getSelectedButton(bgTrachCare));
		phyresp.setTrachCareFrequency(cmbTrachCareFrequency.getSelectedItem()
				.toString());
		phyresp.setTrachCareNumber(cmbTrachCareNumber.getSelectedItem()
				.toString());
		phyresp.setTrachCausrFrequency(cmbTrachCausrFrequency.getSelectedItem()
				.toString());
		phyresp.setTrachCausrNumber(cmbTrachCausrNumber.getSelectedItem()
				.toString());
		phyresp.setTrachSiteFrequency(cmbTrachSiteFrequency.getSelectedItem()
				.toString());
		phyresp.setTrachSiteNumber(cmbTrachSiteNumber.getSelectedItem()
				.toString());
		phyresp.setVia(cmbVia.getSelectedItem().toString());
		// <<<<<<< .mine
		phyresp.setSizeOfCannula(txtSizeOfCannula.getText());
		phyresp.setTypeOfCannula(txtTypeOfCannula.getText());
		// phyresp.setSizeOfCollar(txtSizeOfCollar.getText());
		// phyresp.setTypeOfCollar(txtTypeOfCollar.getText());
		// phyresp.setTypeOfTrach(txtTypeOfTrach.getText());
		// phyresp.setSizeOfTrach(txtSizeOfTrach.getText());
		phyresp.setMinutes(txtMinutes.getText());
		phyresp.setCpap(cbCpap.isSelected());
		phyresp.setBipap(cbBipap.isSelected());
		// phyresp.setDurationFrom(dcDurationFrom.getDate());
		// phyresp.setDurationTo(dcDurationTo.getDate());
		phyresp.setFrequency(txtFrequency.getText());
		phyresp.setDuration(txtDuration.getText());
		phyresp.setPulseOximetryOthers(txtOthers.getText());

		// =======
		// phyresp.setPulseOximetryOthers(txtOthers.getText());
		// >>>>>>> .r1372
		if (!txtPo.getText().equalsIgnoreCase("")) {
			phyresp.setPO(Integer.parseInt(txtPo.getText()));
		}
		phyresp.setResidentId(Global.currentResidenceKey);
		phyresp.setSerial(Global.currentPhysicianOrderRespiratoryTherapyKey);

		try {
			Global.currentPhysicianOrderRespiratoryTherapyKey = MedrexClientManager
					.getInstance()
					.insertOrUpdatePhysicianOrderRespiratoryTherapy(phyresp);
		} catch (Exception e) {

			e.printStackTrace();
		}
		PhysicianOrderRecord physRec = new PhysicianOrderRecord();
		physRec.setDateCreated(MedrexClientManager.getServerTime());
		physRec.setLastModified(MedrexClientManager.getServerTime());
		physRec.setFormId(Global.currentPhysicianOrderRespiratoryTherapyKey);
		physRec.setFormType("RespiratoryTherapy");
		// physRec.setResidentId(Global.currentResidenceKey);
		ResidentMain resmain = null;
		try {
			resmain = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);

		}

		catch (Exception e) {
			e.printStackTrace();

		}

		physRec.setResidents(resmain);

		physRec.setStatus("");
		// physRec.setUser(Global.currentLoggedInUserKey);

		Users user = null;
		try {
			user = MedrexClientManager.getInstance().getUser(
					Global.currentLoggedInUserKey);

		}

		catch (Exception e) {
			e.printStackTrace();

		}

		physRec.setUser(user);

		physRec.setTitle(cmbVia.getSelectedItem().toString());
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
		Global.currentPhysicianOrderRespiratoryTherapyKey = 0;

		cmbChestPhysiotherapyFrequency.setSelectedItem("");
		txtOxygen.setText("");
		txtOxygenPercent.setText("");
		txtPo.setText("");

		cmbChestPhysiotherapyNumber.setSelectedItem("");
		cmbInnerCannulaFrequency.setSelectedItem("");
		cmbInnerCannulaNumber.setSelectedItem("");
		// cmbPulseOximetryFrequency.setSelectedItem("");
		// cmbPulseOximetryNumber.setSelectedItem("");
		cmbTrachCareFrequency.setSelectedItem("");
		cmbTrachCareNumber.setSelectedItem("");
		cmbTrachCausrFrequency.setSelectedItem("");
		cmbTrachCausrNumber.setSelectedItem("");
		cmbTrachSiteFrequency.setSelectedItem("");
		cmbTrachSiteNumber.setSelectedItem("");
		cmbVia.setSelectedItem("");
		rbContinuous.setSelected(false);
		rbPrnFor.setSelected(false);
		SwingUtils.setSelectedButton(bgPrnFor, 0);
		SwingUtils.setSelectedButton(bgPulseOximetry, 0);
		SwingUtils.setSelectedButton(bgTrachCare, 0);
		txtSizeOfCannula.setText("");
		txtTypeOfCannula.setText("");
		// txtSizeOfCollar.setText("");
		// txtTypeOfCollar.setText("");
		// txtTypeOfTrach.setText("");
		// txtSizeOfTrach.setText("");
		txtMinutes.setText("");
		cbBipap.setSelected(false);
		cbCpap.setSelected(false);
		// dcDurationFrom.setDate(null);
		// dcDurationTo.setDate(null);
		txtFrequency.setText("");
		txtDuration.setText("");
		txtSetting.setText("");

	}

	public void setValueObject(PhysicianOrderRespiratoryTherapy resp) {
		cmbChestPhysiotherapyFrequency.setSelectedItem(resp
				.getChestPhysiotherapyFrequency());
		txtOxygenPercent.setText(resp.getOxygenPercentage() + "");
		txtPo.setText(resp.getPO() + "");
		txtOthers.setText(resp.getPulseOximetryOthers());
		cmbChestPhysiotherapyNumber.setSelectedItem(resp
				.getChestPhysiotherapyNumber());
		cmbInnerCannulaFrequency.setSelectedItem(resp
				.getInnerCannulaFrequency());
		cmbInnerCannulaNumber.setSelectedItem(resp.getInnerCannulaNumber());
		// cmbPulseOximetryFrequency.setSelectedItem(resp.getPulseOximetryFrequency());
		// cmbPulseOximetryNumber.setSelectedItem(resp.getPulseOximetryNumber());
		cmbTrachCareFrequency.setSelectedItem(resp.getTrachCareFrequency());
		cmbTrachCareNumber.setSelectedItem(resp.getTrachCareNumber());
		cmbTrachCausrFrequency.setSelectedItem(resp.getTrachCausrFrequency());
		cmbTrachCausrNumber.setSelectedItem(resp.getTrachCausrNumber());
		cmbTrachSiteFrequency.setSelectedItem(resp.getTrachSiteFrequency());
		cmbTrachSiteNumber.setSelectedItem(resp.getTrachSiteNumber());
		cmbVia.setSelectedItem(resp.getVia());
		rbContinuous.setSelected(resp.isContinuous());
		rbPrnFor.setSelected(resp.isPRN());
		SwingUtils.setSelectedButton(bgPrnFor, resp.getPrnFor());
		SwingUtils.setSelectedButton(bgPulseOximetry, resp.getPulseOximetry());
		SwingUtils.setSelectedButton(bgTrachCare, resp.getTrachCare());
		txtSetting.setText(resp.getSetting());

		txtSizeOfCannula.setText(resp.getSizeOfCannula());
		txtTypeOfCannula.setText(resp.getTypeOfCannula());
		// txtSizeOfCollar.setText(resp.getSizeOfCollar());
		// txtTypeOfCollar.setText(resp.getTypeOfCollar());
		// txtTypeOfTrach.setText(resp.getTypeOfTrach());
		// txtSizeOfTrach.setText(resp.getSizeOfTrach());
		txtMinutes.setText(resp.getMinutes());
		txtFrequency.setText(resp.getFrequency());
		txtDuration.setText(resp.getDuration());

		if (resp.isBipap() == true) {
		} else {
			// dcDurationFrom.setEnabled(false);
			// dcDurationTo.setEnabled(false);
		}

		if (resp.isCpap() == true) {
		} else {
			// dcDurationFrom.setEnabled(false);
			// dcDurationTo.setEnabled(false);
		}

		cbBipap.setSelected(resp.isBipap());
		cbCpap.setSelected(resp.isCpap());

	}

	private JxPanel getTab() {

		return new PanelDiagnosisTemp();
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		PanelPhysicianOrderRespiratoryTherapy p = new PanelPhysicianOrderRespiratoryTherapy();
		frame.getContentPane().add(p);
		frame.setSize(800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.isVisible();
		frame.setVisible(true);

	}

}
