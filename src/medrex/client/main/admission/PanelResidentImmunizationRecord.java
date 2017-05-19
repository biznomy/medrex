package medrex.client.main.admission;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.intf.Form;
import medrex.commons.vo.historyAndPhysical.ResidentImmunizationRecord;

import com.sX.swing.JxCheckBox;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxRadioButton;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelResidentImmunizationRecord extends JxPanel implements Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4678209386635180701L;

	Theme theme = new BlackOverWhiteTheme();

	private JxComboBox cmbPpvNotReceived;
	private JxDateChooser dcAnnualPPD2Immunization3;
	private JSeparator separator_26;
	private JxLabel label_8;
	private JxPanel panel_29;
	private JxDateChooser dcAnnualPPD2Immunization2;
	private JSeparator separator_25;
	private JxLabel label_7;
	private JxPanel panel_28;
	private JxDateChooser dcAnnualPPD2Immunization1;
	private JSeparator separator_24;
	private JxLabel label_6;
	private JxPanel panel_27;
	private JxLabel tetanusToxoidLabel_1;
	private JxPanel panel_26;
	private JxPanel panel_25;
	private JSeparator separator_23;
	private JSeparator separator_22;
	private JxDateChooser dtTetanus5;
	private JxLabel label_5;
	private JxPanel panel_24;
	private JSeparator separator_21;
	private JxDateChooser dtTetanus4;
	private JxLabel label_4;
	private JxPanel panel_23;
	private JSeparator separator_20;
	private JxDateChooser dtTetanus3;
	private JxLabel label_3;
	private JxPanel panel_22;
	private JSeparator separator_19;
	private JxDateChooser dtTetanus2;
	private JxLabel label_2;
	private JxPanel panel_21;
	private JSeparator separator_18;
	private JxDateChooser dtTetanus1;
	private JxLabel label_1;
	private JxPanel panel_20;
	private JxLabel tetanusToxoidLabel;
	private JxPanel panel_19;
	private JxDateChooser dcAnnualPPDImmunization;
	private JxRadioButton rbPneumovaxHistoryNo;
	private JxRadioButton rbPneumovaxHistoryYes;
	private JxLabel historyOfHavingLabel;
	private JxPanel panel_18;
	private JxText txtInfluenza;
	private JxLabel pneumovaxLabel_1;
	private JxPanel panel_10;
	private JxText txtPneumovax;
	private JxLabel pneumovaxLabel;
	private JxPanel panel_2;
	private JSeparator separator_3;
	private JSeparator separator_2;
	private JSeparator separator_1;
	private JTextPane administer7DaysTextPane;
	private JxText txtSize2;
	private JxLabel initialSkinTestLabel_7;
	private JxDateChooser dcDateRead2;
	private JxLabel initialSkinTestLabel_6;
	private JxDateChooser dcDateGiven2;
	private JxLabel initialSkinTestLabel_5;
	private JxText txtSkinTest2;
	private JxLabel initialSkinTestLabel_4;
	private JxText txtSizeInit;
	private JxDateChooser dcDateGivenInit;
	private JxDateChooser dcDateReadInit;
	private JxText txtSkinTestInit;
	private JxLabel initialSkinTestLabel_3;
	private JxLabel initialSkinTestLabel_2;
	private JxLabel initialSkinTestLabel_1;
	private JxLabel initialSkinTestLabel;
	private JxLabel ppd2StepLabel;
	private JxText txtResidentName;
	private JxDateChooser dcRecordDate;
	private JxLabel dateLabel;
	private JxText txtIdNo;
	private JxLabel residentsNameLabel_1;
	private JxLabel residentsNameLabel;
	private JxLabel plazaHealthCareLabel_1;
	private JxLabel plazaHealthCareLabel;
	private JxPanel panel_1;
	private ButtonGroup bgHistoryType = new ButtonGroup();
	private JSeparator separator_17;

	/**
	 * Create the panel
	 */
	public PanelResidentImmunizationRecord() {
		super();
		Global.panelResidentImmunizationRecord = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(800, 650));
		setLayout(null);

		panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setLayout(null);

		panel_1.setBounds(0, -11, 800, 250);
		add(panel_1);

		plazaHealthCareLabel = new JxLabel();
		plazaHealthCareLabel.setTheme(theme);
		plazaHealthCareLabel.setFont(new Font("Arial", Font.BOLD, 18));
		plazaHealthCareLabel
				.setText("PLAZA HEALTH CARE & REHABILITATION CENTER");
		plazaHealthCareLabel.setBounds(206, 15, 480, 22);
		panel_1.add(plazaHealthCareLabel);

		plazaHealthCareLabel_1 = new JxLabel();
		plazaHealthCareLabel_1.setTheme(theme);

		plazaHealthCareLabel_1.setText("RESIDENT IMMUNIZATION RECORD");
		plazaHealthCareLabel_1.setFontSize(18);
		plazaHealthCareLabel_1.setFont(new Font("Arial", Font.BOLD, 18));

		plazaHealthCareLabel_1.setBounds(271, 56, 350, 22);
		panel_1.add(plazaHealthCareLabel_1);

		residentsNameLabel = new JxLabel();
		residentsNameLabel.setTheme(theme);

		residentsNameLabel.setText("Residents Name:");
		residentsNameLabel.setBounds(10, 97, 84, 14);
		panel_1.add(residentsNameLabel);

		residentsNameLabel_1 = new JxLabel();
		residentsNameLabel_1.setTheme(theme);

		residentsNameLabel_1.setText("ID#");
		residentsNameLabel_1.setBounds(482, 97, 19, 14);
		panel_1.add(residentsNameLabel_1);

		txtIdNo = new JxText();
		txtIdNo.setTheme(theme);

		txtIdNo.setBorder(new LineBorder(Color.WHITE, 1, false));
		txtIdNo.setBounds(507, 95, 123, 18);
		panel_1.add(txtIdNo);

		dateLabel = new JxLabel();
		dateLabel.setTheme(theme);

		dateLabel.setText("Date:");
		dateLabel.setBounds(636, 97, 27, 14);
		panel_1.add(dateLabel);

		dcRecordDate = new JxDateChooser();
		dcRecordDate.setTheme(theme);

		dcRecordDate.setFontSize(12);
		dcRecordDate.setDateFormatString("MM/dd/yyyy");
		dcRecordDate.setBounds(675, 95, 112, 18);
		panel_1.add(dcRecordDate);

		txtResidentName = new JxText();
		txtResidentName.setTheme(theme);

		txtResidentName.setBorder(new LineBorder(Color.WHITE, 1, false));
		txtResidentName.setBounds(92, 95, 384, 18);
		panel_1.add(txtResidentName);

		ppd2StepLabel = new JxLabel();
		ppd2StepLabel.setTheme(theme);

		ppd2StepLabel.setText("PPD (2 Step)");
		ppd2StepLabel.setBounds(10, 125, 61, 14);
		panel_1.add(ppd2StepLabel);

		initialSkinTestLabel = new JxLabel();
		initialSkinTestLabel.setTheme(theme);

		initialSkinTestLabel.setText("Initial Skin Test:");
		initialSkinTestLabel.setBounds(10, 145, 76, 14);
		panel_1.add(initialSkinTestLabel);

		initialSkinTestLabel_1 = new JxLabel();
		initialSkinTestLabel_1.setTheme(theme);

		initialSkinTestLabel_1.setText("Date Given:");
		initialSkinTestLabel_1.setBounds(274, 145, 57, 14);
		panel_1.add(initialSkinTestLabel_1);

		initialSkinTestLabel_2 = new JxLabel();
		initialSkinTestLabel_2.setTheme(theme);

		initialSkinTestLabel_2.setText("Date Read:");
		initialSkinTestLabel_2.setBounds(455, 145, 57, 14);
		panel_1.add(initialSkinTestLabel_2);

		initialSkinTestLabel_3 = new JxLabel();
		initialSkinTestLabel_3.setTheme(theme);

		initialSkinTestLabel_3.setText("Size (mm):");
		initialSkinTestLabel_3.setBounds(636, 145, 55, 14);
		panel_1.add(initialSkinTestLabel_3);

		txtSkinTestInit = new JxText();
		txtSkinTestInit.setTheme(theme);

		txtSkinTestInit.setBounds(92, 143, 176, 18);
		panel_1.add(txtSkinTestInit);

		dcDateReadInit = new JxDateChooser();
		dcDateReadInit.setTheme(theme);

		dcDateReadInit.setFontSize(12);
		dcDateReadInit.setDateFormatString("MM/dd/yyyy");
		dcDateReadInit.setBounds(518, 143, 112, 18);
		panel_1.add(dcDateReadInit);

		dcDateGivenInit = new JxDateChooser();
		dcDateGivenInit.setTheme(theme);

		dcDateGivenInit.setFontSize(12);
		dcDateGivenInit.setDateFormatString("MM/dd/yyyy");
		dcDateGivenInit.setBounds(337, 143, 112, 18);
		panel_1.add(dcDateGivenInit);

		txtSizeInit = new JxText();
		txtSizeInit.setTheme(theme);

		txtSizeInit.setBounds(702, 143, 85, 18);
		panel_1.add(txtSizeInit);

		initialSkinTestLabel_4 = new JxLabel();
		initialSkinTestLabel_4.setTheme(theme);

		initialSkinTestLabel_4.setText("2nd Skin Test:");
		initialSkinTestLabel_4.setBounds(10, 180, 76, 14);
		panel_1.add(initialSkinTestLabel_4);

		txtSkinTest2 = new JxText();
		txtSkinTest2.setTheme(theme);

		txtSkinTest2.setBounds(92, 178, 176, 18);
		panel_1.add(txtSkinTest2);

		initialSkinTestLabel_5 = new JxLabel();
		initialSkinTestLabel_5.setTheme(theme);

		initialSkinTestLabel_5.setText("Date Given:");
		initialSkinTestLabel_5.setBounds(274, 180, 57, 14);
		panel_1.add(initialSkinTestLabel_5);

		dcDateGiven2 = new JxDateChooser();
		dcDateGiven2.setTheme(theme);

		dcDateGiven2.setFontSize(12);
		dcDateGiven2.setDateFormatString("MM/dd/yyyy");
		dcDateGiven2.setBounds(337, 178, 112, 18);
		panel_1.add(dcDateGiven2);

		initialSkinTestLabel_6 = new JxLabel();
		initialSkinTestLabel_6.setTheme(theme);

		initialSkinTestLabel_6.setText("Date Read:");
		initialSkinTestLabel_6.setBounds(455, 180, 57, 14);
		panel_1.add(initialSkinTestLabel_6);

		dcDateRead2 = new JxDateChooser();
		dcDateRead2.setTheme(theme);

		dcDateRead2.setFontSize(12);
		dcDateRead2.setDateFormatString("MM/dd/yyyy");
		dcDateRead2.setBounds(518, 178, 112, 18);
		panel_1.add(dcDateRead2);

		initialSkinTestLabel_7 = new JxLabel();
		initialSkinTestLabel_7.setTheme(theme);

		initialSkinTestLabel_7.setText("Size (mm):");
		initialSkinTestLabel_7.setBounds(636, 180, 55, 14);
		panel_1.add(initialSkinTestLabel_7);

		txtSize2 = new JxText();
		txtSize2.setTheme(theme);

		txtSize2.setBounds(702, 178, 85, 18);
		panel_1.add(txtSize2);

		administer7DaysTextPane = new JTextPane();

		administer7DaysTextPane.setFocusable(false);
		// administer7DaysTextPane.setDropMode(DropMode.ON);
		administer7DaysTextPane.setEditable(false);
		administer7DaysTextPane
				.setText("(Administer 7 days after initial test)");
		administer7DaysTextPane.setMargin(new Insets(0, 0, 0, 0));
		administer7DaysTextPane.setBounds(10, 200, 94, 28);
		panel_1.add(administer7DaysTextPane);

		separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(0, 245, 800, 5);
		panel_1.add(separator_1);

		separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(92, 114, 384, 1);
		panel_1.add(separator_2);

		separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setBounds(507, 114, 123, 1);
		panel_1.add(separator_3);

		panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setLayout(null);
		panel_2.setPreferredSize(new Dimension(500, 400));

		panel_2.setBounds(0, 239, 394, 39);
		add(panel_2);

		pneumovaxLabel = new JxLabel();
		pneumovaxLabel.setTheme(theme);

		pneumovaxLabel.setText("Pneumovax:");
		pneumovaxLabel.setBounds(10, 10, 60, 14);
		panel_2.add(pneumovaxLabel);

		txtPneumovax = new JxText();
		txtPneumovax.setTheme(theme);

		txtPneumovax.setBounds(76, 10, 314, 18);
		panel_2.add(txtPneumovax);

		panel_10 = new JxPanel();
		panel_10.setTheme(theme);
		panel_10.setLayout(null);
		panel_10.setPreferredSize(new Dimension(500, 400));

		panel_10.setBounds(401, 239, 394, 39);
		add(panel_10);

		pneumovaxLabel_1 = new JxLabel();
		pneumovaxLabel_1.setTheme(theme);

		pneumovaxLabel_1.setText("Influenza:");
		pneumovaxLabel_1.setBounds(10, 10, 60, 14);
		panel_10.add(pneumovaxLabel_1);

		txtInfluenza = new JxText();
		txtInfluenza.setTheme(theme);

		txtInfluenza.setBounds(76, 10, 314, 18);
		panel_10.add(txtInfluenza);

		panel_18 = new JxPanel();
		panel_18.setTheme(theme);
		panel_18.setLayout(null);

		panel_18.setBounds(0, 284, 394, 363);
		add(panel_18);

		historyOfHavingLabel = new JxLabel();
		historyOfHavingLabel.setTheme(theme);

		historyOfHavingLabel.setText("History of Having Pneumovax");
		historyOfHavingLabel.setBounds(10, 26, 169, 14);
		panel_18.add(historyOfHavingLabel);

		rbPneumovaxHistoryYes = new JxRadioButton();
		rbPneumovaxHistoryYes.setTheme(theme);

		bgHistoryType.add(rbPneumovaxHistoryYes);
		rbPneumovaxHistoryYes.setHorizontalTextPosition(SwingConstants.LEFT);
		rbPneumovaxHistoryYes.setHorizontalAlignment(SwingConstants.TRAILING);

		rbPneumovaxHistoryYes.setText("Yes ");
		rbPneumovaxHistoryYes.setBounds(10, 46, 53, 22);
		panel_18.add(rbPneumovaxHistoryYes);

		rbPneumovaxHistoryNo = new JxRadioButton();
		rbPneumovaxHistoryNo.setTheme(theme);

		bgHistoryType.add(rbPneumovaxHistoryNo);
		rbPneumovaxHistoryNo.setHorizontalTextPosition(SwingConstants.LEFT);
		rbPneumovaxHistoryNo.setHorizontalAlignment(SwingConstants.TRAILING);

		rbPneumovaxHistoryNo.setText("No ");
		rbPneumovaxHistoryNo.setBounds(69, 46, 44, 22);
		panel_18.add(rbPneumovaxHistoryNo);

		dcAnnualPPDImmunization = new JxDateChooser();
		dcAnnualPPDImmunization.setTheme(theme);

		dcAnnualPPDImmunization.setFontSize(12);
		dcAnnualPPDImmunization.setDateFormatString("MM/dd/yyyy");
		dcAnnualPPDImmunization.setBounds(262, 76, 122, 18);
		panel_18.add(dcAnnualPPDImmunization);

		panel_19 = new JxPanel();
		panel_19.setTheme(theme);
		panel_19.setLayout(null);

		panel_19.setBounds(10, 199, 374, 154);
		panel_18.add(panel_19);

		tetanusToxoidLabel = new JxLabel();
		tetanusToxoidLabel.setTheme(theme);

		tetanusToxoidLabel.setText("Tetanus Toxoid:");
		tetanusToxoidLabel.setBounds(0, 0, 374, 18);
		panel_19.add(tetanusToxoidLabel);

		panel_20 = new JxPanel();
		panel_20.setTheme(theme);
		panel_20.setLayout(null);

		panel_20.setBounds(0, 24, 374, 25);
		panel_19.add(panel_20);

		label_1 = new JxLabel();
		label_1.setTheme(theme);

		label_1.setText("1.");
		label_1.setBounds(3, 5, 10, 14);
		panel_20.add(label_1);

		dtTetanus1 = new JxDateChooser();
		dtTetanus1.setTheme(theme);

		dtTetanus1.setFontSize(12);
		dtTetanus1.setDateFormatString("MM/dd/yyyy");
		dtTetanus1.setBounds(22, 2, 352, 21);
		panel_20.add(dtTetanus1);

		separator_18 = new JSeparator();
		separator_18.setForeground(Color.BLACK);
		separator_18.setBounds(22, 23, 352, 1);
		panel_20.add(separator_18);

		panel_21 = new JxPanel();
		panel_21.setTheme(theme);
		panel_21.setLayout(null);

		panel_21.setBounds(0, 49, 374, 25);
		panel_19.add(panel_21);

		label_2 = new JxLabel();
		label_2.setTheme(theme);

		label_2.setText("2.");
		label_2.setBounds(3, 5, 10, 14);
		panel_21.add(label_2);

		dtTetanus2 = new JxDateChooser();
		dtTetanus2.setTheme(theme);

		dtTetanus2.setFontSize(12);
		dtTetanus2.setDateFormatString("MM/dd/yyyy");
		dtTetanus2.setBounds(22, 2, 352, 21);
		panel_21.add(dtTetanus2);

		separator_19 = new JSeparator();
		separator_19.setForeground(Color.BLACK);
		separator_19.setBounds(22, 23, 352, 1);
		panel_21.add(separator_19);

		panel_22 = new JxPanel();
		panel_22.setTheme(theme);
		panel_22.setLayout(null);

		panel_22.setBounds(0, 74, 374, 25);
		panel_19.add(panel_22);

		label_3 = new JxLabel();
		label_3.setTheme(theme);

		label_3.setText("3.");
		label_3.setBounds(3, 5, 10, 14);
		panel_22.add(label_3);

		dtTetanus3 = new JxDateChooser();
		dtTetanus3.setTheme(theme);

		dtTetanus3.setFontSize(12);
		dtTetanus3.setDateFormatString("MM/dd/yyyy");
		dtTetanus3.setBounds(22, 2, 352, 21);
		panel_22.add(dtTetanus3);

		separator_20 = new JSeparator();
		separator_20.setForeground(Color.BLACK);
		separator_20.setBounds(22, 23, 352, 1);
		panel_22.add(separator_20);

		panel_23 = new JxPanel();
		panel_23.setTheme(theme);
		panel_23.setLayout(null);

		panel_23.setBounds(0, 98, 374, 25);
		panel_19.add(panel_23);

		label_4 = new JxLabel();
		label_4.setTheme(theme);

		label_4.setText("4.");
		label_4.setBounds(3, 5, 10, 14);
		panel_23.add(label_4);

		dtTetanus4 = new JxDateChooser();
		dtTetanus4.setTheme(theme);

		dtTetanus4.setFontSize(12);
		dtTetanus4.setDateFormatString("MM/dd/yyyy");
		dtTetanus4.setBounds(22, 2, 352, 21);
		panel_23.add(dtTetanus4);

		separator_21 = new JSeparator();
		separator_21.setForeground(Color.BLACK);
		separator_21.setBounds(22, 23, 352, 1);
		panel_23.add(separator_21);

		panel_24 = new JxPanel();
		panel_24.setTheme(theme);
		panel_24.setLayout(null);

		panel_24.setBounds(0, 123, 374, 25);
		panel_19.add(panel_24);

		label_5 = new JxLabel();
		label_5.setTheme(theme);

		label_5.setText("5.");
		label_5.setBounds(3, 5, 10, 14);
		panel_24.add(label_5);

		dtTetanus5 = new JxDateChooser();
		dtTetanus5.setTheme(theme);

		dtTetanus5.setFontSize(12);
		dtTetanus5.setDateFormatString("MM/dd/yyyy");
		dtTetanus5.setBounds(22, 2, 352, 21);
		panel_24.add(dtTetanus5);

		separator_22 = new JSeparator();
		separator_22.setForeground(Color.BLACK);
		separator_22.setBounds(22, 23, 352, 1);
		panel_24.add(separator_22);

		final JxCheckBox consentOnFileCheckBox = new JxCheckBox();
		consentOnFileCheckBox.setTheme(theme);

		consentOnFileCheckBox.setText("Consent on File");
		consentOnFileCheckBox.setBounds(10, 74, 100, 18);
		panel_18.add(consentOnFileCheckBox);

		final JxLabel ifPpvNotLabel = new JxLabel();
		ifPpvNotLabel.setTheme(theme);

		ifPpvNotLabel.setText("If PPV not received, state reason: ");
		ifPpvNotLabel.setBounds(10, 107, 169, 14);
		panel_18.add(ifPpvNotLabel);

		cmbPpvNotReceived = new JxComboBox();
		cmbPpvNotReceived.setTheme(theme);

		cmbPpvNotReceived.setModel(new DefaultComboBoxModel(new String[] { "",
				"1", "2" }));
		cmbPpvNotReceived.setBounds(185, 104, 44, 21);
		panel_18.add(cmbPpvNotReceived);

		final JxLabel notEligibleLabel = new JxLabel();
		notEligibleLabel.setTheme(theme);

		notEligibleLabel.setText("1. Not eligible");
		notEligibleLabel.setBounds(41, 127, 93, 14);
		panel_18.add(notEligibleLabel);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setText("2. Offered and declined");
		label.setBounds(41, 147, 122, 14);
		panel_18.add(label);

		separator_17 = new JSeparator();
		separator_17.setOrientation(SwingConstants.HORIZONTAL);
		separator_17.setForeground(Color.BLACK);
		separator_17.setBounds(10, 186, 374, 1);
		panel_18.add(separator_17);

		final JxLabel dateOfImmunizationLabel = new JxLabel();
		dateOfImmunizationLabel.setTheme(theme);

		dateOfImmunizationLabel.setText("Date Of immunization");
		dateOfImmunizationLabel.setBounds(134, 78, 122, 14);
		panel_18.add(dateOfImmunizationLabel);

		separator_23 = new JSeparator();
		separator_23.setOrientation(SwingConstants.VERTICAL);
		separator_23.setForeground(Color.BLACK);
		separator_23.setBounds(400, 239, 1, 408);
		add(separator_23);

		panel_25 = new JxPanel();
		panel_25.setTheme(theme);
		panel_25.setLayout(null);

		panel_25.setBounds(401, 308, 394, 339);
		add(panel_25);

		panel_26 = new JxPanel();
		panel_26.setTheme(theme);
		panel_26.setLayout(null);

		panel_26.setBounds(10, 10, 384, 107);
		panel_25.add(panel_26);

		tetanusToxoidLabel_1 = new JxLabel();
		tetanusToxoidLabel_1.setTheme(theme);

		tetanusToxoidLabel_1.setText("Date of Immunization:");
		tetanusToxoidLabel_1.setBounds(0, 0, 374, 18);
		panel_26.add(tetanusToxoidLabel_1);

		panel_27 = new JxPanel();
		panel_27.setTheme(theme);
		panel_27.setLayout(null);

		panel_27.setBounds(0, 24, 374, 23);
		panel_26.add(panel_27);

		label_6 = new JxLabel();
		label_6.setTheme(theme);

		label_6.setText("1.");
		label_6.setBounds(3, 5, 10, 14);
		panel_27.add(label_6);

		separator_24 = new JSeparator();
		separator_24.setForeground(Color.BLACK);
		separator_24.setBounds(22, 23, 352, 1);
		panel_27.add(separator_24);

		dcAnnualPPD2Immunization1 = new JxDateChooser();
		dcAnnualPPD2Immunization1.setTheme(theme);

		dcAnnualPPD2Immunization1.setFontSize(12);
		dcAnnualPPD2Immunization1.setDateFormatString("MM/dd/yyyy");
		dcAnnualPPD2Immunization1.setBounds(22, 2, 352, 21);
		panel_27.add(dcAnnualPPD2Immunization1);

		panel_28 = new JxPanel();
		panel_28.setTheme(theme);
		panel_28.setLayout(null);

		panel_28.setBounds(0, 49, 374, 23);
		panel_26.add(panel_28);

		label_7 = new JxLabel();
		label_7.setTheme(theme);

		label_7.setText("2.");
		label_7.setBounds(3, 5, 10, 14);
		panel_28.add(label_7);

		separator_25 = new JSeparator();
		separator_25.setForeground(Color.BLACK);
		separator_25.setBounds(22, 23, 352, 1);
		panel_28.add(separator_25);

		dcAnnualPPD2Immunization2 = new JxDateChooser();
		dcAnnualPPD2Immunization2.setTheme(theme);

		dcAnnualPPD2Immunization2.setFontSize(12);
		dcAnnualPPD2Immunization2.setDateFormatString("MM/dd/yyyy");
		dcAnnualPPD2Immunization2.setBounds(22, 2, 352, 21);
		panel_28.add(dcAnnualPPD2Immunization2);

		panel_29 = new JxPanel();
		panel_29.setTheme(theme);
		panel_29.setLayout(null);

		panel_29.setBounds(0, 74, 374, 23);
		panel_26.add(panel_29);

		label_8 = new JxLabel();
		label_8.setTheme(theme);

		label_8.setText("3.");
		label_8.setBounds(3, 5, 10, 14);
		panel_29.add(label_8);

		separator_26 = new JSeparator();
		separator_26.setForeground(Color.BLACK);
		separator_26.setBounds(22, 23, 352, 1);
		panel_29.add(separator_26);

		dcAnnualPPD2Immunization3 = new JxDateChooser();
		dcAnnualPPD2Immunization3.setTheme(theme);

		dcAnnualPPD2Immunization3.setFontSize(12);
		dcAnnualPPD2Immunization3.setDateFormatString("MM/dd/yyyy");
		dcAnnualPPD2Immunization3.setBounds(22, 2, 352, 21);
		panel_29.add(dcAnnualPPD2Immunization3);

		final JxLabel ifInfluenzaVaccineLabel = new JxLabel();
		ifInfluenzaVaccineLabel.setTheme(theme);

		ifInfluenzaVaccineLabel
				.setText("If influenza vaccine not received, state reason ");
		ifInfluenzaVaccineLabel.setBounds(10, 123, 233, 14);
		panel_25.add(ifInfluenzaVaccineLabel);

		final JxComboBox comboBox_1 = new JxComboBox();
		comboBox_1.setTheme(theme);

		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "1", "2",
				"3", "4", "5" }));
		comboBox_1.setBounds(249, 123, 39, 21);
		panel_25.add(comboBox_1);

		final JxLabel notInFacilityLabel = new JxLabel();
		notInFacilityLabel.setTheme(theme);

		notInFacilityLabel
				.setText("1. Not in facility during this year's flu season.");
		notInFacilityLabel.setBounds(25, 160, 216, 14);
		panel_25.add(notInFacilityLabel);

		final JxLabel receivedOutsideOfLabel = new JxLabel();
		receivedOutsideOfLabel.setTheme(theme);

		receivedOutsideOfLabel.setText("2. Received outside of this facility.");
		receivedOutsideOfLabel.setBounds(25, 180, 216, 14);
		panel_25.add(receivedOutsideOfLabel);

		final JxLabel label_9 = new JxLabel();
		label_9.setTheme(theme);

		label_9.setText("3. Not eligible.");
		label_9.setBounds(25, 200, 216, 14);
		panel_25.add(label_9);

		final JxLabel label_10 = new JxLabel();
		label_10.setTheme(theme);

		label_10.setText("4. Offered and declined.");
		label_10.setBounds(25, 220, 218, 14);
		panel_25.add(label_10);

		final JxLabel label_11 = new JxLabel();
		label_11.setTheme(theme);

		label_11.setText("5. Inability to obtain vaccine.");
		label_11.setBounds(25, 240, 218, 14);
		panel_25.add(label_11);

		updateData();

		final JxCheckBox consentOfFileCheckBox = new JxCheckBox();
		consentOfFileCheckBox.setTheme(theme);

		consentOfFileCheckBox.setText("Consent of File");
		consentOfFileCheckBox.setBounds(411, 284, 123, 18);
		add(consentOfFileCheckBox);
	}

	public int doSave() {

		ResidentImmunizationRecord refResidentImmunizationRecord = new ResidentImmunizationRecord();
		refResidentImmunizationRecord.setResidentId(Global.currentResidenceKey);
		refResidentImmunizationRecord
				.setSerial(Global.currentResidentImmunizationRecordKey);
		// *************************
		refResidentImmunizationRecord
				.setFormId(Global.currentResidentAssessmentFormKey);

		// *******************************

		if (rbPneumovaxHistoryYes.isSelected()) {
			refResidentImmunizationRecord.setHistoryType(1);
		}
		if (rbPneumovaxHistoryNo.isSelected()) {
			refResidentImmunizationRecord.setHistoryType(2);
		}
		refResidentImmunizationRecord
				.setAnnualPPD2Immunization3(dcAnnualPPD2Immunization3.getDate());
		refResidentImmunizationRecord
				.setAnnualPPD2Immunization2(dcAnnualPPD2Immunization2.getDate());
		refResidentImmunizationRecord
				.setAnnualPPD2Immunization1(dcAnnualPPD2Immunization1.getDate());
		refResidentImmunizationRecord.setTetanus5(dtTetanus5.getDate());
		refResidentImmunizationRecord.setTetanus4(dtTetanus4.getDate());
		refResidentImmunizationRecord.setTetanus3(dtTetanus3.getDate());
		refResidentImmunizationRecord.setTetanus2(dtTetanus2.getDate());
		refResidentImmunizationRecord.setTetanus1(dtTetanus1.getDate());
		if (!cmbPpvNotReceived.getSelectedItem().toString()
				.equalsIgnoreCase("")) {
			refResidentImmunizationRecord.setPpv(Integer
					.parseInt(cmbPpvNotReceived.getSelectedItem() + ""));
		}
		refResidentImmunizationRecord
				.setAnnualPPDImmunization(dcAnnualPPDImmunization.getDate());
		refResidentImmunizationRecord.setInfluenza(txtInfluenza.getText());
		refResidentImmunizationRecord.setPneumovax(txtPneumovax.getText());
		refResidentImmunizationRecord.setSize2(txtSize2.getText());
		refResidentImmunizationRecord.setDateRead2(dcDateRead2.getDate());
		refResidentImmunizationRecord.setDateGiven2(dcDateGiven2.getDate());
		refResidentImmunizationRecord.setSkinTest2(txtSkinTest2.getText());
		refResidentImmunizationRecord.setSizeInit(txtSizeInit.getText());
		refResidentImmunizationRecord.setDateGivenInit(dcDateGivenInit
				.getDate());
		refResidentImmunizationRecord.setDateReadInit(dcDateReadInit.getDate());
		refResidentImmunizationRecord
				.setSkinTestInit(txtSkinTestInit.getText());
		refResidentImmunizationRecord
				.setResidentName(txtResidentName.getText());
		refResidentImmunizationRecord.setRecordDate(dcRecordDate.getDate());
		refResidentImmunizationRecord.setIdNo(txtIdNo.getText());

		try {
			Global.currentResidentImmunizationRecordKey = MedrexClientManager
					.getInstance().insertOrUpdateResidentImmunizationRecord(
							refResidentImmunizationRecord);
		} catch (Exception e) {
		}
		return Global.currentResidentImmunizationRecordKey;
	}

	public void updateData() {
		ResidentImmunizationRecord refResidentImmunizationRecord = null;

		if (Global.currentResidentAssessmentFormKey != 0) {
			try {
				refResidentImmunizationRecord = MedrexClientManager
						.getInstance().getResidentImmunizationRecord(
								Global.currentResidentAssessmentFormKey);

				Global.currentResidentImmunizationRecordKey = refResidentImmunizationRecord
						.getSerial();
			} catch (Exception e) {

			}

			if (refResidentImmunizationRecord.getHistoryType() == 1) {
				rbPneumovaxHistoryYes.setSelected(true);
			}

			if (refResidentImmunizationRecord.getHistoryType() == 2) {
				rbPneumovaxHistoryNo.setSelected(true);
			}
			dcAnnualPPD2Immunization3.setDate(refResidentImmunizationRecord
					.getAnnualPPD2Immunization3());
			dcAnnualPPD2Immunization2.setDate(refResidentImmunizationRecord
					.getAnnualPPD2Immunization2());
			dcAnnualPPD2Immunization1.setDate(refResidentImmunizationRecord
					.getAnnualPPD2Immunization1());
			dtTetanus5.setDate(refResidentImmunizationRecord.getTetanus5());
			dtTetanus4.setDate(refResidentImmunizationRecord.getTetanus4());
			dtTetanus3.setDate(refResidentImmunizationRecord.getTetanus3());
			dtTetanus2.setDate(refResidentImmunizationRecord.getTetanus2());
			dtTetanus1.setDate(refResidentImmunizationRecord.getTetanus1());
			cmbPpvNotReceived.setSelectedItem(refResidentImmunizationRecord
					.getPpv()
					+ "");
			dcAnnualPPDImmunization.setDate(refResidentImmunizationRecord
					.getAnnualPPDImmunization());
			txtInfluenza.setText(refResidentImmunizationRecord.getInfluenza());
			txtPneumovax.setText(refResidentImmunizationRecord.getPneumovax());
			txtSize2.setText(refResidentImmunizationRecord.getSize2());
			dcDateRead2.setDate(refResidentImmunizationRecord.getDateRead2());
			dcDateGiven2.setDate(refResidentImmunizationRecord.getDateGiven2());
			txtSkinTest2.setText(refResidentImmunizationRecord.getSkinTest2());
			txtSizeInit.setText(refResidentImmunizationRecord.getSizeInit());
			dcDateGivenInit.setDate(refResidentImmunizationRecord
					.getDateGivenInit());
			dcDateReadInit.setDate(refResidentImmunizationRecord
					.getDateReadInit());
			txtSkinTestInit.setText(refResidentImmunizationRecord
					.getSkinTestInit());
			txtResidentName.setText(refResidentImmunizationRecord
					.getResidentName());
			dcRecordDate.setDate(refResidentImmunizationRecord.getRecordDate());
			txtIdNo.setText(refResidentImmunizationRecord.getIdNo());
		}
	}

	@Override
	public void doLoad() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doUpdate() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean doValidate() {
		// TODO Auto-generated method stub
		return true;
	}

}
