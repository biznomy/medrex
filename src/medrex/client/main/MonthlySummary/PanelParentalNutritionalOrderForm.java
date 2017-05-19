package medrex.client.main.MonthlySummary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.enums.ColorConstants;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.childForms.ParentalNutritionalOrderForm;

import com.sX.swing.JxButton;
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


public class PanelParentalNutritionalOrderForm extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2892537372088722392L;
	private JxButton btDelete;
	private JxButton btUpdate;
	private JxButton btSave;
	private JxTextA txtLabCbfComment;
	private JxText txtOrderedValid;
	private JxText txtDate;
	private JxText txtDateOrdered;
	private JxText txtRnSignature;
	private JxText txtMdSignature;
	private JxText txtRnName;
	private JxText txtMdName;
	private JxText txtOtherAdditive;
	private JxText txtMviAdult;
	private JxText txtRegularHumenInsulin;
	private JxText txtMultiraceCone;
	private JxText txtCalciumGluconate;
	private JxText txtMagnesiumSulphate;
	private JxText txtPotassiumAcetate;
	private JxText txtPotassiumChloride;
	private JxText txtPorassiumPhosphate;
	private JxText txtSodiumPhosphate;
	private JxText txtSodiumAcetate;
	private JxText txtSodiumChloride;
	private JxText txtOneHrTaper;
	private JxText txtTotalVolume;
	private JxText txtOver;
	private JxText txtOneHrRamp;
	private JxText txtFatEmulsion;
	private JxText txtDextrose;
	private JxText txtAminoAcids;
	private JxText txtBaseSolution;
	private JxText txtPtWgt;
	private JxText txtRm;
	private JxText txtPatientName;
	// private JxText txtFaculty;
	private JxText txtUnit;
	public static int currenttpnkey;

	/**
	 * @param args
	 * 
	 * 
	 */
	
	Theme theme = new BlueOverWhiteTheme();
	
	
	public static void main(String[] args) {

		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			UIManager
					.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (InstantiationException e) {

			e.printStackTrace();
		} catch (IllegalAccessException e) {

			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {

			e.printStackTrace();
		}
		JFrame frm = new JFrame();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PanelParentalNutritionalOrderForm p = new PanelParentalNutritionalOrderForm();
		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(p);
		frm.getContentPane().add(scroll);
		frm.setSize(950, 700);
		frm.setVisible(true);

	}

	public PanelParentalNutritionalOrderForm() {
		super();
		Global.PanelparentalNutritionalOrderForm = this;
		setBackground(Color.WHITE);
		setLayout(null);
		setSize(new Dimension(935, 600));
		setPreferredSize(new Dimension(1000, 800));

		final JxPanel panel = new JxPanel();
		panel.setTheme (theme);

panel.setFontStyle(Font.BOLD);
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(950, 1250));

		panel.setBounds(0, 0, 932, 1326);
		add(panel);

		JScrollPane scroll = new JScrollPane();
		scroll.setBackground(Color.WHITE);
		scroll.setBounds(0, 0, 990, 750);
		scroll.setViewportView(panel);
		add(scroll);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme (theme);

		panel_1.setLayout(null);
		panel_1.setBounds(383, 10, 260, 20);
		panel.add(panel_1);

		final JxLabel specialtyRxLabel = new JxLabel();
		specialtyRxLabel.setTheme (theme);

specialtyRxLabel.setFontStyle(Font.BOLD);
specialtyRxLabel.setFontSize(18);
		specialtyRxLabel.setHorizontalAlignment(SwingConstants.CENTER);
		specialtyRxLabel.setText("Specialty RX");
		specialtyRxLabel.setBounds(10, 0, 217, 20);
		panel_1.add(specialtyRxLabel);

		final JxLabel fax9082416338Label = new JxLabel();
		fax9082416338Label.setTheme (theme);

fax9082416338Label.setFontSize(14);
fax9082416338Label.setFontStyle(Font.BOLD);
		fax9082416338Label.setText("FAX: 908-241-6338");
		fax9082416338Label.setBounds(700, 21, 158, 20);
		panel.add(fax9082416338Label);

		final JxLabel parentalNutritionalOrderLabel = new JxLabel();
		parentalNutritionalOrderLabel.setTheme (theme);
		parentalNutritionalOrderLabel
				.setHorizontalAlignment(SwingConstants.CENTER);

parentalNutritionalOrderLabel.setFontSize(14);
parentalNutritionalOrderLabel.setFontStyle(Font.BOLD);
		parentalNutritionalOrderLabel.setText("Parental Nutrition Order Form");
		parentalNutritionalOrderLabel.setBounds(383, 50, 243, 20);
		panel.add(parentalNutritionalOrderLabel);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme (theme);
		panel_2.setLayout(null);

		panel_2.setBounds(10, 70, 912, 68);
		panel.add(panel_2);

		/*
		 * txtFaculty = new JxText(); txtFaculty.setBounds(110, 8, 214, 20);
		txtFaculty.setTheme (theme);
		 * panel_2.add(txtFaculty);
		 */

		final JxLabel patientNameLabel = new JxLabel();
		patientNameLabel.setTheme (theme);

patientNameLabel.setFontSize(12);
patientNameLabel.setFontStyle(Font.BOLD);
		patientNameLabel.setHorizontalAlignment(SwingConstants.LEADING);
		patientNameLabel.setText("Patient Name:");
		patientNameLabel.setBounds(10, 11, 91, 16);
		panel_2.add(patientNameLabel);

		txtPatientName = new JxText();
		txtPatientName.setTheme (theme);
		txtPatientName.setBounds(111, 9, 189, 20);
		panel_2.add(txtPatientName);

		final JxLabel unitLabel = new JxLabel();
		unitLabel.setTheme (theme);
		unitLabel.setHorizontalAlignment(SwingConstants.LEADING);

unitLabel.setFontSize(12);
unitLabel.setFontStyle(Font.BOLD);
		unitLabel.setText("Unit:");
		unitLabel.setBounds(315, 10, 29, 16);
		panel_2.add(unitLabel);

		txtUnit = new JxText();
		txtUnit.setTheme (theme);
		txtUnit.setBounds(354, 8, 146, 20);
		panel_2.add(txtUnit);

		final JxLabel rmLabel = new JxLabel();
		rmLabel.setTheme (theme);

rmLabel.setFontSize(12);
rmLabel.setFontStyle(Font.BOLD);
		rmLabel.setHorizontalAlignment(SwingConstants.LEADING);
		rmLabel.setText("Rm#:");
		rmLabel.setBounds(315, 36, 33, 16);
		panel_2.add(rmLabel);

		txtRm = new JxText();
		txtRm.setTheme (theme);
		txtRm.setBounds(354, 34, 146, 20);
		panel_2.add(txtRm);

		final JxLabel ptWgtLabel = new JxLabel();
		ptWgtLabel.setTheme (theme);

ptWgtLabel.setFontStyle(Font.BOLD);
		ptWgtLabel.setText("Pt Wgt:");
		ptWgtLabel.setBounds(618, 38, 48, 16);
		panel_2.add(ptWgtLabel);

		txtPtWgt = new JxText();
		txtPtWgt.setTheme (theme);
		txtPtWgt.setBounds(672, 35, 110, 20);
		panel_2.add(txtPtWgt);

		final JxLabel kgLabel = new JxLabel();
		kgLabel.setTheme (theme);

kgLabel.setFontSize(12);
kgLabel.setFontStyle(Font.BOLD);
		kgLabel.setText("Kg");
		kgLabel.setBounds(788, 38, 48, 16);
		panel_2.add(kgLabel);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme (theme);
		panel_3.setLayout(null);

		panel_3.setBounds(10, 190, 912, 145);
		panel.add(panel_3);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme (theme);

		panel_8.setLayout(null);
		panel_8.setBounds(0, 5, 912, 22);
		panel_3.add(panel_8);

		final JxPanel panel_9 = new JxPanel();
		panel_9.setTheme (theme);

		panel_9.setLayout(null);
		panel_9.setBounds(0, 0, 304, 20);
		panel_8.add(panel_9);

		final JxLabel baseSolutionLabel = new JxLabel();
		baseSolutionLabel.setTheme (theme);
		baseSolutionLabel.setBounds(10, 0, 266, 20);
		panel_9.add(baseSolutionLabel);

baseSolutionLabel.setFontSize(14);
baseSolutionLabel.setFontStyle(Font.BOLD);
		baseSolutionLabel.setText("BASE SOLUTION");

		final JxPanel panel_10 = new JxPanel();
		panel_10.setTheme (theme);

		panel_10.setLayout(null);
		panel_10.setBounds(304, 0, 304, 21);
		panel_8.add(panel_10);

		txtBaseSolution = new JxText();
		txtBaseSolution.setTheme (theme);
		txtBaseSolution.setBounds(5, 2, 245, 18);
		panel_10.add(txtBaseSolution);

		final JxPanel panel_11 = new JxPanel();
		panel_11.setTheme (theme);

		panel_11.setLayout(null);
		panel_11.setBounds(0, 32, 912, 28);
		panel_3.add(panel_11);

		final JxPanel panel_12 = new JxPanel();
		panel_12.setTheme (theme);

		panel_12.setLayout(null);
		panel_12.setBounds(0, 0, 304, 20);
		panel_11.add(panel_12);

		final JxLabel aminoAcidsLabel = new JxLabel();
		aminoAcidsLabel.setTheme (theme);

aminoAcidsLabel.setFontSize(14);
aminoAcidsLabel.setFontStyle(Font.BOLD);
		aminoAcidsLabel.setText("AMINO ACIDS");
		aminoAcidsLabel.setBounds(10, 0, 258, 20);
		panel_12.add(aminoAcidsLabel);

		final JxPanel panel_13 = new JxPanel();
		panel_13.setTheme (theme);

		panel_13.setLayout(null);
		panel_13.setBounds(304, 0, 304, 35);
		panel_11.add(panel_13);

		txtAminoAcids = new JxText();
		txtAminoAcids.setTheme (theme);
		txtAminoAcids.setBounds(5, 5, 245, 18);
		panel_13.add(txtAminoAcids);

		final JxLabel gramsLabel = new JxLabel();
		gramsLabel.setTheme (theme);

gramsLabel.setFontSize(12);
gramsLabel.setFontStyle(Font.BOLD);
		gramsLabel.setText("Grams");
		gramsLabel.setBounds(251, -1, 54, 34);
		panel_13.add(gramsLabel);

		final JxPanel panel_14 = new JxPanel();
		panel_14.setTheme (theme);

		panel_14.setLayout(null);
		panel_14.setBounds(608, 0, 304, 35);
		panel_11.add(panel_14);

		final JxLabel usual115gmkgdayLabel = new JxLabel();
		usual115gmkgdayLabel.setTheme (theme);
		usual115gmkgdayLabel
				.setText("<HTML><BODY>Usual 1-1.5gm/kg/day kcal/gm)</BODY><HTML>");
		usual115gmkgdayLabel.setBounds(10, 0, 215, 20);
		panel_14.add(usual115gmkgdayLabel);

		final JxLabel label = new JxLabel();
		label.setTheme (theme);
		label.setHorizontalAlignment(SwingConstants.TRAILING);
		label.setText("(4");
		label.setBounds(240, 3, 54, 14);
		panel_14.add(label);

		final JxPanel panel_15 = new JxPanel();
		panel_15.setTheme (theme);

		panel_15.setLayout(null);
		panel_15.setBounds(0, 65, 912, 35);
		panel_3.add(panel_15);

		final JxPanel panel_16 = new JxPanel();
		panel_16.setTheme (theme);

		panel_16.setLayout(null);
		panel_16.setBounds(0, 0, 304, 35);
		panel_15.add(panel_16);

		final JxLabel dextroseLabel = new JxLabel();
		dextroseLabel.setTheme (theme);

dextroseLabel.setFontSize(14);
dextroseLabel.setFontStyle(Font.BOLD);
		dextroseLabel.setText("DEXTROSE");
		dextroseLabel.setBounds(10, 0, 284, 20);
		panel_16.add(dextroseLabel);

		final JxPanel panel_17 = new JxPanel();
		panel_17.setTheme (theme);

		panel_17.setLayout(null);
		panel_17.setBounds(304, 0, 304, 35);
		panel_15.add(panel_17);

		txtDextrose = new JxText();
		txtDextrose.setTheme (theme);
		txtDextrose.setBounds(5, 5, 245, 18);
		panel_17.add(txtDextrose);

		final JxLabel gramsLabel_1 = new JxLabel();
		gramsLabel_1.setTheme (theme);

gramsLabel_1.setFontSize(12);
gramsLabel_1.setFontStyle(Font.BOLD);
		gramsLabel_1.setText("Grams");
		gramsLabel_1.setBounds(251, 0, 54, 20);
		panel_17.add(gramsLabel_1);

		final JxPanel panel_18 = new JxPanel();
		panel_18.setTheme (theme);

		panel_18.setLayout(null);
		panel_18.setBounds(608, 0, 304, 35);
		panel_15.add(panel_18);

		final JxLabel usual35gmkgdayLabel = new JxLabel();
		usual35gmkgdayLabel.setTheme (theme);
		usual35gmkgdayLabel
				.setText("<HTML><BODY>Usual 3-5gm/kg/day<br>5-8mg/kg/min(3.4kcal/gm)</BODY></HTML>");
		usual35gmkgdayLabel.setBounds(10, 0, 215, 35);
		panel_18.add(usual35gmkgdayLabel);

		final JxLabel usualLabel = new JxLabel();
		usualLabel.setTheme (theme);
		usualLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		usualLabel.setText("Usual");
		usualLabel.setBounds(240, 3, 54, 14);
		panel_18.add(usualLabel);

		final JxPanel panel_19 = new JxPanel();
		panel_19.setTheme (theme);

		panel_19.setLayout(null);
		panel_19.setBounds(0, 105, 912, 35);
		panel_3.add(panel_19);

		final JxPanel panel_20 = new JxPanel();
		panel_20.setTheme (theme);

		panel_20.setLayout(null);
		panel_20.setBounds(0, 0, 304, 35);
		panel_19.add(panel_20);

		final JxLabel fatEmulsionLabel = new JxLabel();
		fatEmulsionLabel.setTheme (theme);

fatEmulsionLabel.setFontSize(14);
fatEmulsionLabel.setFontStyle(Font.BOLD);
		fatEmulsionLabel.setText("FAT EMULSION");
		fatEmulsionLabel.setBounds(10, 0, 284, 20);
		panel_20.add(fatEmulsionLabel);

		final JxPanel panel_21 = new JxPanel();
		panel_21.setTheme (theme);

		panel_21.setLayout(null);
		panel_21.setBounds(304, 0, 304, 35);
		panel_19.add(panel_21);

		txtFatEmulsion = new JxText();
		txtFatEmulsion.setTheme (theme);
		txtFatEmulsion.setBounds(5, 5, 245, 18);
		panel_21.add(txtFatEmulsion);

		final JxLabel gramsLabel_2 = new JxLabel();
		gramsLabel_2.setTheme (theme);

gramsLabel_2.setFontSize(12);
gramsLabel_2.setFontStyle(Font.BOLD);
		gramsLabel_2.setText("Grams");
		gramsLabel_2.setBounds(250, -1, 54, 20);
		panel_21.add(gramsLabel_2);

		final JxLabel usualLabel_1 = new JxLabel();
		usualLabel_1.setTheme (theme);
		usualLabel_1
				.setText("<HTML><BODY>Usual <= 1gm/kg/day or 20%-405<br>of TPN (9kcal/gm)</BODY></HTML>");
		usualLabel_1.setBounds(614, 0, 215, 35);
		panel_19.add(usualLabel_1);

		final JxLabel kcalLabel = new JxLabel();
		kcalLabel.setTheme (theme);
		kcalLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		kcalLabel.setText("kcal");
		kcalLabel.setBounds(848, 3, 54, 14);
		panel_19.add(kcalLabel);

		final JxPanel panel_22 = new JxPanel();
		panel_22.setTheme (theme);

		panel_22.setLayout(null);
		panel_22.setBounds(10, 340, 912, 61);
		panel.add(panel_22);

		final JxLabel totalVolumeLabel = new JxLabel();
		totalVolumeLabel.setTheme (theme);

totalVolumeLabel.setFontSize(14);
totalVolumeLabel.setFontStyle(Font.BOLD);
		totalVolumeLabel.setText("TOTAL VOLUME");
		totalVolumeLabel.setBounds(10, 5, 117, 20);
		panel_22.add(totalVolumeLabel);

		txtTotalVolume = new JxText();
		txtTotalVolume.setTheme (theme);
		txtTotalVolume.setBounds(133, 5, 79, 20);
		panel_22.add(txtTotalVolume);

		final JxLabel mlOverLabel = new JxLabel();
		mlOverLabel.setTheme (theme);

mlOverLabel.setFontSize(12);
mlOverLabel.setFontStyle(Font.BOLD);
		mlOverLabel.setText("ml over    24hrs    or    over");
		mlOverLabel.setBounds(218, 7, 197, 20);
		panel_22.add(mlOverLabel);

		txtOver = new JxText();
		txtOver.setTheme (theme);
		txtOver.setBounds(421, 5, 79, 20);
		panel_22.add(txtOver);

		final JxLabel hrsWith1hrLabel = new JxLabel();
		hrsWith1hrLabel.setTheme (theme);

hrsWith1hrLabel.setFontSize(12);
hrsWith1hrLabel.setFontStyle(Font.BOLD);
		hrsWith1hrLabel.setText("hrs with 1hr ramp @");
		hrsWith1hrLabel.setBounds(506, 7, 137, 20);
		panel_22.add(hrsWith1hrLabel);

		txtOneHrRamp = new JxText();
		txtOneHrRamp.setTheme (theme);
		txtOneHrRamp.setBounds(649, 5, 79, 20);
		panel_22.add(txtOneHrRamp);

		final JxLabel cchrLabel = new JxLabel();
		cchrLabel.setTheme (theme);

cchrLabel.setFontSize(12);
cchrLabel.setFontStyle(Font.BOLD);
		cchrLabel.setText("cc/hr");
		cchrLabel.setBounds(734, 7, 94, 20);
		panel_22.add(cchrLabel);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme (theme);

label_1.setFontSize(12);
label_1.setFontStyle(Font.BOLD);
		label_1.setText("& 1hr taper @");
		label_1.setBounds(506, 37, 94, 20);
		panel_22.add(label_1);

		txtOneHrTaper = new JxText();
		txtOneHrTaper.setTheme (theme);
		txtOneHrTaper.setBounds(649, 35, 79, 20);
		panel_22.add(txtOneHrTaper);

		final JxLabel cchrLabel_1 = new JxLabel();
		cchrLabel_1.setTheme (theme);

cchrLabel_1.setFontSize(12);
cchrLabel_1.setFontStyle(Font.BOLD);
		cchrLabel_1.setText("cc/hr");
		cchrLabel_1.setBounds(734, 37, 94, 20);
		panel_22.add(cchrLabel_1);

		final JxLabel usual2030mlkgOrLabel = new JxLabel();
		usual2030mlkgOrLabel.setTheme (theme);

usual2030mlkgOrLabel.setFontSize(12);
usual2030mlkgOrLabel.setFontStyle(Font.BOLD);
		usual2030mlkgOrLabel.setText("(usual 20-30ml/KG or 1ml/kcal)");
		usual2030mlkgOrLabel.setBounds(10, 37, 202, 20);
		panel_22.add(usual2030mlkgOrLabel);

		final JxPanel panel_23 = new JxPanel();
		panel_23.setTheme (theme);
		panel_23.setLayout(null);

		panel_23.setBounds(10, 405, 912, 396);
		panel.add(panel_23);

		final JxPanel panel_24 = new JxPanel();
		panel_24.setTheme (theme);

		panel_24.setLayout(null);
		panel_24.setBounds(0, 0, 912, 30);
		panel_23.add(panel_24);

		final JxPanel panel_40 = new JxPanel();
		panel_40.setTheme (theme);

		panel_40.setLayout(null);
		panel_40.setBounds(0, 0, 304, 30);
		panel_24.add(panel_40);

		final JxLabel additivesPerBagsLabel = new JxLabel();
		additivesPerBagsLabel.setTheme (theme);

additivesPerBagsLabel.setFontStyle(Font.BOLD);
		additivesPerBagsLabel.setText("Additives per Bags");
		additivesPerBagsLabel.setBounds(10, 7, 284, 20);
		panel_40.add(additivesPerBagsLabel);

		final JxPanel panel_41 = new JxPanel();
		panel_41.setTheme (theme);

		panel_41.setLayout(null);
		panel_41.setBounds(304, 0, 304, 30);
		panel_24.add(panel_41);

		final JxPanel panel_42 = new JxPanel();
		panel_42.setTheme (theme);

		panel_42.setLayout(null);
		panel_42.setBounds(608, 0, 304, 30);
		panel_24.add(panel_42);

		final JxPanel panel_25 = new JxPanel();
		panel_25.setTheme (theme);

		panel_25.setLayout(null);
		panel_25.setBounds(0, 30, 912, 30);
		panel_23.add(panel_25);

		final JxPanel panel_43 = new JxPanel();
		panel_43.setTheme (theme);

		panel_43.setLayout(null);
		panel_43.setBounds(0, 0, 304, 30);
		panel_25.add(panel_43);

		final JxLabel sodiumChlorideLabel = new JxLabel();
		sodiumChlorideLabel.setTheme (theme);

sodiumChlorideLabel.setFontSize(12);
sodiumChlorideLabel.setFontStyle(Font.BOLD);
		sodiumChlorideLabel.setText("Sodium Chloride");
		sodiumChlorideLabel.setBounds(10, 7, 284, 20);
		panel_43.add(sodiumChlorideLabel);

		final JxPanel panel_44 = new JxPanel();
		panel_44.setTheme (theme);
		panel_44.setLayout(null);

		panel_44.setBounds(304, 0, 304, 30);
		panel_25.add(panel_44);

		txtSodiumChloride = new JxText();
		txtSodiumChloride.setTheme (theme);
		txtSodiumChloride.setBounds(5, 5, 250, 20);
		panel_44.add(txtSodiumChloride);

		final JxLabel meqLabel = new JxLabel();
		meqLabel.setTheme (theme);
		meqLabel.setHorizontalAlignment(SwingConstants.TRAILING);

meqLabel.setFontStyle(Font.BOLD);
		meqLabel.setText("mEq");
		meqLabel.setBounds(256, 7, 38, 20);
		panel_44.add(meqLabel);

		final JxLabel amountLabel = new JxLabel();
		amountLabel.setTheme (theme);
		amountLabel.setBounds(0, -24, 284, 30);
		panel_44.add(amountLabel);

amountLabel.setFontStyle(Font.BOLD);
		amountLabel.setText("Amount");

		final JxPanel panel_45 = new JxPanel();
		panel_45.setTheme (theme);

		panel_45.setLayout(null);
		panel_45.setBounds(608, 0, 304, 30);
		panel_25.add(panel_45);

		final JxLabel usual50150meqLabel = new JxLabel();
		usual50150meqLabel.setTheme (theme);

usual50150meqLabel.setFontSize(14);
usual50150meqLabel.setFontStyle(Font.BOLD);
		usual50150meqLabel.setText("Usual (50-150mEq)");
		usual50150meqLabel.setBounds(10, 7, 250, 20);
		panel_45.add(usual50150meqLabel);

		final JxPanel panel_26 = new JxPanel();
		panel_26.setTheme (theme);
		panel_26.setLayout(null);

		panel_26.setBounds(0, 60, 912, 30);
		panel_23.add(panel_26);

		final JxPanel panel_46 = new JxPanel();
		panel_46.setTheme (theme);

		panel_46.setLayout(null);
		panel_46.setBounds(0, 0, 304, 30);
		panel_26.add(panel_46);

		final JxLabel sodiumAcetateLabel = new JxLabel();
		sodiumAcetateLabel.setTheme (theme);

sodiumAcetateLabel.setFontSize(12);
sodiumAcetateLabel.setFontStyle(Font.BOLD);
		sodiumAcetateLabel.setText("Sodium Acetate");
		sodiumAcetateLabel.setBounds(10, 7, 284, 20);
		panel_46.add(sodiumAcetateLabel);

		final JxPanel panel_47 = new JxPanel();
		panel_47.setTheme (theme);

		panel_47.setLayout(null);
		panel_47.setBounds(304, 0, 304, 30);
		panel_26.add(panel_47);

		txtSodiumAcetate = new JxText();
		txtSodiumAcetate.setTheme (theme);
		txtSodiumAcetate.setBounds(5, 5, 250, 20);
		panel_47.add(txtSodiumAcetate);

		final JxLabel meqLabel_1 = new JxLabel();
		meqLabel_1.setTheme (theme);

meqLabel_1.setFontStyle(Font.BOLD);
		meqLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		meqLabel_1.setText("mEq");
		meqLabel_1.setBounds(256, 7, 38, 20);
		panel_47.add(meqLabel_1);

		final JxPanel panel_48 = new JxPanel();
		panel_48.setTheme (theme);

		panel_48.setLayout(null);
		panel_48.setBounds(608, 0, 304, 30);
		panel_26.add(panel_48);

		final JxPanel panel_27 = new JxPanel();
		panel_27.setTheme (theme);

		panel_27.setLayout(null);
		panel_27.setBounds(0, 90, 912, 30);
		panel_23.add(panel_27);

		final JxPanel panel_49 = new JxPanel();
		panel_49.setTheme (theme);

		panel_49.setLayout(null);
		panel_49.setBounds(0, 0, 304, 30);
		panel_27.add(panel_49);

		final JxLabel sodiumPhosphateLabel = new JxLabel();
		sodiumPhosphateLabel.setTheme (theme);

sodiumPhosphateLabel.setFontSize(12);
sodiumPhosphateLabel.setFontStyle(Font.BOLD);
		sodiumPhosphateLabel.setText("Sodium Phosphate");
		sodiumPhosphateLabel.setBounds(10, 7, 284, 20);
		panel_49.add(sodiumPhosphateLabel);

		final JxPanel panel_50 = new JxPanel();
		panel_50.setTheme (theme);

		panel_50.setLayout(null);
		panel_50.setBounds(304, 0, 304, 30);
		panel_27.add(panel_50);

		txtSodiumPhosphate = new JxText();
		txtSodiumPhosphate.setTheme (theme);
		txtSodiumPhosphate.setBounds(5, 5, 250, 20);
		panel_50.add(txtSodiumPhosphate);

		final JxLabel mmLabel = new JxLabel();
		mmLabel.setTheme (theme);

mmLabel.setFontStyle(Font.BOLD);
		mmLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		mmLabel.setText("mM");
		mmLabel.setBounds(256, 7, 38, 20);
		panel_50.add(mmLabel);

		final JxPanel panel_51 = new JxPanel();
		panel_51.setTheme (theme);

		panel_51.setLayout(null);
		panel_51.setBounds(608, 0, 304, 30);
		panel_27.add(panel_51);

		final JxLabel x133Label = new JxLabel();
		x133Label.setTheme (theme);

x133Label.setFontSize(13);
x133Label.setFontStyle(Font.BOLD);
		x133Label.setText("x 1.33 = mEq Na+");
		x133Label.setBounds(10, 7, 250, 20);
		panel_51.add(x133Label);

		final JxPanel panel_28 = new JxPanel();
		panel_28.setTheme (theme);

		panel_28.setLayout(null);
		panel_28.setBounds(0, 120, 912, 30);
		panel_23.add(panel_28);

		final JxPanel panel_52 = new JxPanel();
		panel_52.setTheme (theme);

		panel_52.setLayout(null);
		panel_52.setBounds(0, 0, 304, 30);
		panel_28.add(panel_52);

		final JxLabel potassiumPhosphateLabel = new JxLabel();
		potassiumPhosphateLabel.setTheme (theme);

potassiumPhosphateLabel.setFontSize(12);
potassiumPhosphateLabel.setFontStyle(Font.BOLD);
		potassiumPhosphateLabel.setText("Potassium Phosphate");
		potassiumPhosphateLabel.setBounds(10, 7, 284, 20);
		panel_52.add(potassiumPhosphateLabel);

		final JxPanel panel_53 = new JxPanel();
		panel_53.setTheme (theme);

		panel_53.setLayout(null);
		panel_53.setBounds(304, 0, 304, 30);
		panel_28.add(panel_53);

		txtPorassiumPhosphate = new JxText();
		txtPorassiumPhosphate.setTheme (theme);
		txtPorassiumPhosphate.setBounds(5, 5, 250, 20);
		panel_53.add(txtPorassiumPhosphate);

		final JxLabel mmLabel_1 = new JxLabel();
		mmLabel_1.setTheme (theme);

mmLabel_1.setFontStyle(Font.BOLD);
		mmLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		mmLabel_1.setText("mM");
		mmLabel_1.setBounds(256, 7, 38, 20);
		panel_53.add(mmLabel_1);

		final JxPanel panel_54 = new JxPanel();
		panel_54.setTheme (theme);

		panel_54.setLayout(null);
		panel_54.setBounds(608, 0, 304, 30);
		panel_28.add(panel_54);

		final JxLabel x147meqLabel = new JxLabel();
		x147meqLabel.setTheme (theme);

x147meqLabel.setFontSize(14);
x147meqLabel.setFontStyle(Font.BOLD);
		x147meqLabel.setText("x 1.47 +mEq K+");
		x147meqLabel.setBounds(10, 7, 128, 20);
		panel_54.add(x147meqLabel);

		final JxLabel usualPo4Label = new JxLabel();
		usualPo4Label.setTheme (theme);
		usualPo4Label.setFontStyle(Font.BOLD);
		usualPo4Label.setText("(Usual PO4-15-40mM)");
		usualPo4Label.setBounds(144, 7, 139, 20);
		panel_54.add(usualPo4Label);

		final JxPanel panel_29 = new JxPanel();
		panel_29.setTheme (theme);

		panel_29.setLayout(null);
		panel_29.setBounds(0, 150, 912, 30);
		panel_23.add(panel_29);

		final JxPanel panel_55 = new JxPanel();
		panel_55.setTheme (theme);
		panel_55.setLayout(null);

		panel_55.setBounds(0, 0, 304, 30);
		panel_29.add(panel_55);

		final JxLabel potassiumChlorideLabel = new JxLabel();
		potassiumChlorideLabel.setTheme (theme);

potassiumChlorideLabel.setFontSize(12);
potassiumChlorideLabel.setFontStyle(Font.BOLD);
		potassiumChlorideLabel.setText("Potassium Chloride");
		potassiumChlorideLabel.setBounds(10, 7, 284, 20);
		panel_55.add(potassiumChlorideLabel);

		final JxPanel panel_56 = new JxPanel();
		panel_56.setTheme (theme);
		panel_56.setLayout(null);

		panel_56.setBounds(304, 0, 304, 30);
		panel_29.add(panel_56);

		txtPotassiumChloride = new JxText();
		txtPotassiumChloride.setTheme (theme);
		txtPotassiumChloride.setBounds(5, 5, 250, 20);
		panel_56.add(txtPotassiumChloride);

		final JxLabel meqLabel_2 = new JxLabel();
		meqLabel_2.setTheme (theme);

meqLabel_2.setFontStyle(Font.BOLD);
		meqLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
		meqLabel_2.setText("mEq");
		meqLabel_2.setBounds(256, 7, 38, 20);
		panel_56.add(meqLabel_2);

		final JxPanel panel_57 = new JxPanel();
		panel_57.setTheme (theme);

		panel_57.setLayout(null);
		panel_57.setBounds(608, 0, 304, 30);
		panel_29.add(panel_57);

		final JxLabel usual20100meqLabel = new JxLabel();
		usual20100meqLabel.setTheme (theme);

usual20100meqLabel.setFontSize(14);
usual20100meqLabel.setFontStyle(Font.BOLD);
		usual20100meqLabel.setText("Usual (20-100mEq)");
		usual20100meqLabel.setBounds(10, 7, 250, 20);
		panel_57.add(usual20100meqLabel);

		final JxPanel panel_30 = new JxPanel();
		panel_30.setTheme (theme);

		panel_30.setLayout(null);
		panel_30.setBounds(0, 180, 912, 30);
		panel_23.add(panel_30);

		final JxPanel panel_58 = new JxPanel();
		panel_58.setTheme (theme);

		panel_58.setLayout(null);
		panel_58.setBounds(0, 0, 304, 30);
		panel_30.add(panel_58);

		final JxLabel potassiumAcetateLabel = new JxLabel();
		potassiumAcetateLabel.setTheme (theme);

potassiumAcetateLabel.setFontSize(12);
potassiumAcetateLabel.setFontStyle(Font.BOLD);
		potassiumAcetateLabel.setText("Potassium Acetate");
		potassiumAcetateLabel.setBounds(10, 7, 284, 20);
		panel_58.add(potassiumAcetateLabel);

		final JxPanel panel_59 = new JxPanel();
		panel_59.setTheme (theme);

		panel_59.setLayout(null);
		panel_59.setBounds(304, 0, 304, 30);
		panel_30.add(panel_59);

		txtPotassiumAcetate = new JxText();
		txtPotassiumAcetate.setTheme (theme);
		txtPotassiumAcetate.setBounds(5, 5, 250, 20);
		panel_59.add(txtPotassiumAcetate);

		final JxLabel meqLabel_3 = new JxLabel();
		meqLabel_3.setTheme (theme);

meqLabel_3.setFontStyle(Font.BOLD);
		meqLabel_3.setHorizontalAlignment(SwingConstants.TRAILING);
		meqLabel_3.setText("mEq");
		meqLabel_3.setBounds(256, 7, 38, 20);
		panel_59.add(meqLabel_3);

		final JxPanel panel_60 = new JxPanel();
		panel_60.setTheme (theme);

		panel_60.setLayout(null);
		panel_60.setBounds(608, 0, 304, 30);
		panel_30.add(panel_60);

		final JxPanel panel_31 = new JxPanel();
		panel_31.setTheme (theme);
		panel_31.setLayout(null);

		panel_31.setBounds(0, 210, 912, 30);
		panel_23.add(panel_31);

		final JxPanel panel_61 = new JxPanel();
		panel_61.setTheme (theme);

		panel_61.setLayout(null);
		panel_61.setBounds(0, 0, 304, 30);
		panel_31.add(panel_61);

		final JxLabel magnesiumSulphateLabel = new JxLabel();
		magnesiumSulphateLabel.setTheme (theme);

magnesiumSulphateLabel.setFontSize(12);
magnesiumSulphateLabel.setFontStyle(Font.BOLD);
		magnesiumSulphateLabel.setText("Magnesium Sulfate");
		magnesiumSulphateLabel.setBounds(10, 7, 284, 20);
		panel_61.add(magnesiumSulphateLabel);

		final JxPanel panel_62 = new JxPanel();
		panel_62.setTheme (theme);

		panel_62.setLayout(null);
		panel_62.setBounds(304, 0, 304, 30);
		panel_31.add(panel_62);

		txtMagnesiumSulphate = new JxText();
		txtMagnesiumSulphate.setTheme (theme);
		txtMagnesiumSulphate.setBounds(5, 5, 250, 20);
		panel_62.add(txtMagnesiumSulphate);

		final JxLabel meqLabel_4 = new JxLabel();
		meqLabel_4.setTheme (theme);

meqLabel_4.setFontStyle(Font.BOLD);
		meqLabel_4.setHorizontalAlignment(SwingConstants.TRAILING);
		meqLabel_4.setText("mEq");
		meqLabel_4.setBounds(256, 7, 38, 20);
		panel_62.add(meqLabel_4);

		final JxPanel panel_63 = new JxPanel();
		panel_63.setTheme (theme);

		panel_63.setLayout(null);
		panel_63.setBounds(608, 0, 304, 30);
		panel_31.add(panel_63);

		final JxLabel usual412meqLabel = new JxLabel();
		usual412meqLabel.setTheme (theme);

usual412meqLabel.setFontSize(14);
usual412meqLabel.setFontStyle(Font.BOLD);
		usual412meqLabel.setText("Usual (4-12mEq)");
		usual412meqLabel.setBounds(10, 7, 250, 20);
		panel_63.add(usual412meqLabel);

		final JxPanel panel_32 = new JxPanel();
		panel_32.setTheme (theme);

		panel_32.setLayout(null);
		panel_32.setBounds(0, 240, 912, 30);
		panel_23.add(panel_32);

		final JxPanel panel_64 = new JxPanel();
		panel_64.setTheme (theme);
		panel_64.setLayout(null);

		panel_64.setBounds(0, 0, 304, 30);
		panel_32.add(panel_64);

		final JxLabel calciumGluconateLabel = new JxLabel();
		calciumGluconateLabel.setTheme (theme);

calciumGluconateLabel.setFontSize(12);
calciumGluconateLabel.setFontStyle(Font.BOLD);
		calciumGluconateLabel.setText("Calcium Gluconate");
		calciumGluconateLabel.setBounds(10, 7, 284, 20);
		panel_64.add(calciumGluconateLabel);

		final JxPanel panel_65 = new JxPanel();
		panel_65.setTheme (theme);

		panel_65.setLayout(null);
		panel_65.setBounds(304, 0, 304, 30);
		panel_32.add(panel_65);

		txtCalciumGluconate = new JxText();
		txtCalciumGluconate.setTheme (theme);
		txtCalciumGluconate.setBounds(5, 5, 250, 20);
		panel_65.add(txtCalciumGluconate);

		final JxLabel meqLabel_5 = new JxLabel();
		meqLabel_5.setTheme (theme);

meqLabel_5.setFontStyle(Font.BOLD);
		meqLabel_5.setHorizontalAlignment(SwingConstants.TRAILING);
		meqLabel_5.setText("mEq");
		meqLabel_5.setBounds(256, 7, 38, 20);
		panel_65.add(meqLabel_5);

		final JxPanel panel_66 = new JxPanel();
		panel_66.setTheme (theme);

		panel_66.setLayout(null);
		panel_66.setBounds(608, 0, 304, 30);
		panel_32.add(panel_66);

		final JxLabel usual45135meqLabel = new JxLabel();
		usual45135meqLabel.setTheme (theme);

usual45135meqLabel.setFontSize(13);
usual45135meqLabel.setFontStyle(Font.BOLD);
		usual45135meqLabel.setText("Usual (4.5-13.5mEq)");
		usual45135meqLabel.setBounds(10, 7, 250, 20);
		panel_66.add(usual45135meqLabel);

		final JxPanel panel_33 = new JxPanel();
		panel_33.setTheme (theme);
		panel_33.setLayout(null);

		panel_33.setBounds(0, 270, 912, 30);
		panel_23.add(panel_33);

		final JxPanel panel_67 = new JxPanel();
		panel_67.setTheme (theme);

		panel_67.setLayout(null);
		panel_67.setBounds(0, 0, 304, 30);
		panel_33.add(panel_67);

		final JxLabel multirace4ConeLabel = new JxLabel();
		multirace4ConeLabel.setTheme (theme);

multirace4ConeLabel.setFontSize(12);
multirace4ConeLabel.setFontStyle(Font.BOLD);
		multirace4ConeLabel.setText("Multirace-4 Cone");
		multirace4ConeLabel.setBounds(10, 7, 284, 20);
		panel_67.add(multirace4ConeLabel);

		final JxPanel panel_68 = new JxPanel();
		panel_68.setTheme (theme);

		panel_68.setLayout(null);
		panel_68.setBounds(304, 0, 304, 30);
		panel_33.add(panel_68);

		txtMultiraceCone = new JxText();
		txtMultiraceCone.setTheme (theme);
		txtMultiraceCone.setBounds(5, 5, 250, 20);
		panel_68.add(txtMultiraceCone);

		final JxLabel mlLabel = new JxLabel();
		mlLabel.setTheme (theme);

mlLabel.setFontStyle(Font.BOLD);
		mlLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		mlLabel.setText("ml");
		mlLabel.setBounds(261, 7, 33, 20);
		panel_68.add(mlLabel);

		final JxPanel panel_69 = new JxPanel();
		panel_69.setTheme (theme);

		panel_69.setLayout(null);
		panel_69.setBounds(608, 0, 304, 30);
		panel_33.add(panel_69);

		final JxLabel zn5mgCuLabel = new JxLabel();
		zn5mgCuLabel.setTheme (theme);

zn5mgCuLabel.setFontSize(12);
zn5mgCuLabel.setFontStyle(Font.BOLD);
		zn5mgCuLabel.setText("Zn 5mg, Cu 1mg, Mn0.5mg, Cr 10mcg");
		zn5mgCuLabel.setBounds(10, 7, 294, 20);
		panel_69.add(zn5mgCuLabel);

		final JxPanel panel_34 = new JxPanel();
		panel_34.setTheme (theme);

		panel_34.setLayout(null);
		panel_34.setBounds(0, 300, 912, 30);
		panel_23.add(panel_34);

		final JxPanel panel_70 = new JxPanel();
		panel_70.setTheme (theme);

		panel_70.setLayout(null);
		panel_70.setBounds(0, 0, 304, 30);
		panel_34.add(panel_70);

		final JxLabel regularHumenInsulinLabel = new JxLabel();
		regularHumenInsulinLabel.setTheme (theme);

regularHumenInsulinLabel.setFontSize(12);
regularHumenInsulinLabel.setFontStyle(Font.BOLD);
		regularHumenInsulinLabel.setText("Regular Human Insulin");
		regularHumenInsulinLabel.setBounds(10, 7, 284, 20);
		panel_70.add(regularHumenInsulinLabel);

		final JxPanel panel_71 = new JxPanel();
		panel_71.setTheme (theme);
		panel_71.setLayout(null);

		panel_71.setBounds(304, 0, 304, 30);
		panel_34.add(panel_71);

		txtRegularHumenInsulin = new JxText();
		txtRegularHumenInsulin.setTheme (theme);
		txtRegularHumenInsulin.setBounds(5, 5, 250, 20);
		panel_71.add(txtRegularHumenInsulin);

		final JxLabel unitsLabel = new JxLabel();
		unitsLabel.setTheme (theme);

unitsLabel.setFontStyle(Font.BOLD);
		unitsLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		unitsLabel.setText("Units");
		unitsLabel.setBounds(256, 7, 38, 20);
		panel_71.add(unitsLabel);

		final JxPanel panel_72 = new JxPanel();
		panel_72.setTheme (theme);

		panel_72.setLayout(null);
		panel_72.setBounds(608, 0, 304, 30);
		panel_34.add(panel_72);

		final JxPanel panel_35 = new JxPanel();
		panel_35.setTheme (theme);

		panel_35.setLayout(null);
		panel_35.setBounds(0, 330, 912, 30);
		panel_23.add(panel_35);

		final JxPanel panel_73 = new JxPanel();
		panel_73.setTheme (theme);

		panel_73.setLayout(null);
		panel_73.setBounds(0, 0, 304, 30);
		panel_35.add(panel_73);

		final JxLabel mviAdultLabel = new JxLabel();
		mviAdultLabel.setTheme (theme);

mviAdultLabel.setFontSize(12);
mviAdultLabel.setFontStyle(Font.BOLD);
		mviAdultLabel.setText("MVI Adult");
		mviAdultLabel.setBounds(10, 7, 284, 20);
		panel_73.add(mviAdultLabel);

		final JxPanel panel_74 = new JxPanel();
		panel_74.setTheme (theme);

		panel_74.setLayout(null);
		panel_74.setBounds(304, 0, 304, 30);
		panel_35.add(panel_74);

		txtMviAdult = new JxText();
		txtMviAdult.setTheme (theme);
		txtMviAdult.setBounds(5, 5, 250, 20);
		panel_74.add(txtMviAdult);

		final JxLabel label_12 = new JxLabel();
		label_12.setTheme (theme);

label_12.setFontSize(12);
label_12.setFontStyle(Font.BOLD);
		label_12.setHorizontalAlignment(SwingConstants.TRAILING);
		label_12.setText("10 ml");
		label_12.setBounds(256, 7, 38, 20);
		panel_74.add(label_12);

		final JxPanel panel_75 = new JxPanel();
		panel_75.setTheme (theme);

		panel_75.setLayout(null);
		panel_75.setBounds(608, 0, 304, 30);
		panel_35.add(panel_75);

		final JxLabel including150mcgVitLabel = new JxLabel();
		including150mcgVitLabel.setTheme (theme);

including150mcgVitLabel.setFontSize(14);
including150mcgVitLabel.setFontStyle(Font.BOLD);
		including150mcgVitLabel.setText("(including 150mcg Vit K)");
		including150mcgVitLabel.setBounds(10, 7, 250, 20);
		panel_75.add(including150mcgVitLabel);

		final JxPanel panel_36 = new JxPanel();
		panel_36.setTheme (theme);

		panel_36.setLayout(null);
		panel_36.setBounds(0, 360, 912, 30);
		panel_23.add(panel_36);

		final JxPanel panel_76 = new JxPanel();
		panel_76.setTheme (theme);

		panel_76.setLayout(null);
		panel_76.setBounds(0, 0, 304, 30);
		panel_36.add(panel_76);

		final JxLabel otherAdditivesLabel = new JxLabel();
		otherAdditivesLabel.setTheme (theme);

otherAdditivesLabel.setFontSize(12);
otherAdditivesLabel.setFontStyle(Font.BOLD);
		otherAdditivesLabel.setText("OTHER ADDITIVES");
		otherAdditivesLabel.setBounds(10, 7, 284, 20);
		panel_76.add(otherAdditivesLabel);

		final JxPanel panel_77 = new JxPanel();
		panel_77.setTheme (theme);

		panel_77.setLayout(null);
		panel_77.setBounds(304, 0, 304, 30);
		panel_36.add(panel_77);

		txtOtherAdditive = new JxText();
		txtOtherAdditive.setTheme (theme);
		txtOtherAdditive.setBounds(5, 5, 250, 20);
		panel_77.add(txtOtherAdditive);

		final JxPanel panel_78 = new JxPanel();
		panel_78.setTheme (theme);

		panel_78.setLayout(null);
		panel_78.setBounds(608, 0, 304, 30);
		panel_36.add(panel_78);

		final JxPanel panel_88 = new JxPanel();
		panel_88.setTheme (theme);

		panel_88.setLayout(null);
		panel_88.setBounds(10, 805, 912, 102);
		panel.add(panel_88);

		final JxPanel panel_89 = new JxPanel();
		panel_89.setTheme (theme);

		panel_89.setLayout(null);
		panel_89.setBounds(10, 30, 892, 65);
		panel_88.add(panel_89);

		final JxPanel panel_90 = new JxPanel();
		panel_90.setTheme (theme);
		panel_90.setLayout(null);

		panel_90.setBounds(0, 0, 892, 65);
		panel_89.add(panel_90);

		final JxLabel cbfWDifLabel = new JxLabel();
		cbfWDifLabel.setTheme (theme);

cbfWDifLabel.setFontSize(12);
cbfWDifLabel.setFontStyle(Font.BOLD);
		cbfWDifLabel.setText("CBF w Dif CMP, CO2 PO4, Mg weekly");
		cbfWDifLabel.setBounds(10, 0, 233, 20);
		panel_90.add(cbfWDifLabel);

		final JScrollPane textField_25 = new JScrollPane();
		textField_25.setBorder(new LineBorder(Color.black, 1, false));
		textField_25.setBounds(249, 5, 633, 50);
		panel_90.add(textField_25);

		txtLabCbfComment = new JxTextA();
		txtLabCbfComment.setTheme (theme);
		textField_25.setViewportView(txtLabCbfComment);

		final JxLabel labsPleaseFaxLabel = new JxLabel();
		labsPleaseFaxLabel.setTheme (theme);

labsPleaseFaxLabel.setFontSize(14);
labsPleaseFaxLabel.setFontStyle(Font.BOLD);
		labsPleaseFaxLabel
				.setText("Labs: please fax most current values to pharmacy");
		labsPleaseFaxLabel.setBounds(10, 5, 586, 20);
		panel_88.add(labsPleaseFaxLabel);

		final JxPanel panel_92 = new JxPanel();
		panel_92.setTheme (theme);

		panel_92.setLayout(null);
		panel_92.setBounds(10, 910, 912, 145);
		panel.add(panel_92);

		final JxLabel mdNameLabel = new JxLabel();
		mdNameLabel.setTheme (theme);

mdNameLabel.setFontSize(12);
mdNameLabel.setFontStyle(Font.BOLD);
		mdNameLabel.setText("MD Name:");
		mdNameLabel.setBounds(10, 7, 76, 20);
		panel_92.add(mdNameLabel);

		txtMdName = new JxText();
		txtMdName.setTheme (theme);
		txtMdName.setBounds(113, 5, 279, 20);
		panel_92.add(txtMdName);

		final JxLabel mdSignatureLabel = new JxLabel();
		mdSignatureLabel.setTheme (theme);

mdSignatureLabel.setFontSize(12);
mdSignatureLabel.setFontStyle(Font.BOLD);
		mdSignatureLabel.setText("MD Signature:");
		mdSignatureLabel.setBounds(10, 35, 97, 20);
		panel_92.add(mdSignatureLabel);

		txtMdSignature = new JxText();
		txtMdSignature.setTheme (theme);
		txtMdSignature.setBounds(113, 33, 279, 20);
		panel_92.add(txtMdSignature);

		final JxLabel dateOrderedLabel = new JxLabel();
		dateOrderedLabel.setTheme (theme);

dateOrderedLabel.setFontSize(12);
dateOrderedLabel.setFontStyle(Font.BOLD);
		dateOrderedLabel.setText("Date Ordered:");
		dateOrderedLabel.setBounds(10, 63, 97, 20);
		panel_92.add(dateOrderedLabel);

		txtDateOrdered = new JxText();
		txtDateOrdered.setTheme (theme);
		txtDateOrdered.setBounds(113, 61, 279, 20);
		panel_92.add(txtDateOrdered);

		final JxLabel rnNameLabel = new JxLabel();
		rnNameLabel.setTheme (theme);

rnNameLabel.setFontSize(12);
rnNameLabel.setFontStyle(Font.BOLD);
		rnNameLabel.setText("RN Name:");
		rnNameLabel.setBounds(431, 7, 76, 20);
		panel_92.add(rnNameLabel);

		txtRnName = new JxText();
		txtRnName.setTheme (theme);
		txtRnName.setBounds(534, 5, 279, 20);
		panel_92.add(txtRnName);

		final JxLabel rnSignatureLabel = new JxLabel();
		rnSignatureLabel.setTheme (theme);

rnSignatureLabel.setFontSize(12);
rnSignatureLabel.setFontStyle(Font.BOLD);
		rnSignatureLabel.setText("RN Signature:");
		rnSignatureLabel.setBounds(431, 35, 97, 20);
		panel_92.add(rnSignatureLabel);

		txtRnSignature = new JxText();
		txtRnSignature.setTheme (theme);
		txtRnSignature.setBounds(534, 33, 279, 20);
		panel_92.add(txtRnSignature);

		final JxLabel dateLabel = new JxLabel();
		dateLabel.setTheme (theme);

dateLabel.setFontSize(12);
dateLabel.setFontStyle(Font.BOLD);
		dateLabel.setText("Date:");
		dateLabel.setBounds(431, 63, 54, 20);
		panel_92.add(dateLabel);

		txtDate = new JxText();
		txtDate.setTheme (theme);
		txtDate.setBounds(534, 61, 279, 20);
		panel_92.add(txtDate);

		final JxLabel ordersValidForLabel = new JxLabel();
		ordersValidForLabel.setTheme (theme);

ordersValidForLabel.setFontSize(12);
ordersValidForLabel.setFontStyle(Font.BOLD);
		ordersValidForLabel.setText("Orders Valid For");
		ordersValidForLabel.setBounds(10, 91, 97, 20);
		panel_92.add(ordersValidForLabel);

		txtOrderedValid = new JxText();
		txtOrderedValid.setTheme (theme);
		txtOrderedValid.setBounds(113, 89, 279, 20);
		panel_92.add(txtOrderedValid);

		final JxLabel daysFromLabel = new JxLabel();
		daysFromLabel.setTheme (theme);

daysFromLabel.setFontSize(12);
daysFromLabel.setFontStyle(Font.BOLD);
		daysFromLabel.setText("Days  From");
		daysFromLabel.setBounds(434, 91, 76, 20);
		panel_92.add(daysFromLabel);

		final JxDateChooser dcFrom = new JxDateChooser();
		dcFrom.setTheme (theme);
		new SimpleDateFormat("MM/dd/yyyy");
		dcFrom.setBounds(534, 89, 111, 20);
		panel_92.add(dcFrom);

		final JxLabel toLabel = new JxLabel();
		toLabel.setTheme (theme);

toLabel.setFontSize(12);
toLabel.setFontStyle(Font.BOLD);
		toLabel.setText("To");
		toLabel.setBounds(670, 91, 24, 20);
		panel_92.add(toLabel);

		final JxDateChooser dcTo = new JxDateChooser();
		dcTo.setTheme (theme);
		new SimpleDateFormat("MM/dd/yyyy");
		dcTo.setBounds(702, 89, 111, 20);
		panel_92.add(dcTo);

		final JxLabel allOrdersMustLabel = new JxLabel();
		allOrdersMustLabel.setTheme (theme);

allOrdersMustLabel.setFontSize(12);
allOrdersMustLabel.setFontStyle(Font.BOLD);
		allOrdersMustLabel
				.setText("<HTML><BODY>All orders must be received by 11A.M. to ensure same day delivery. After 11A.M., it will be delivered the following morning.</BODY></HTML>");
		allOrdersMustLabel.setBounds(10, 119, 892, 20);
		panel_92.add(allOrdersMustLabel);

		final JxPanel panel_91 = new JxPanel();
		panel_91.setTheme (theme);
		panel_91.setForeground(Color.WHITE);

		panel_91.setLayout(null);
		panel_91.setBounds(250, 1061, 444, 30);
		panel.add(panel_91);

		btSave = new JxButton();
		btSave.setTheme (theme);

btSave.setFontSize(12);
btSave.setFontStyle(Font.BOLD);

		btSave.setText("Save");
		btSave.setBounds(10, 5, 100, 20);
		panel_91.add(btSave);

		btUpdate = new JxButton();
		btUpdate.setTheme (theme);

btUpdate.setFontSize(12);
btUpdate.setFontStyle(Font.BOLD);

		btUpdate.setText("Update");
		btUpdate.setBounds(150, 5, 100, 20);
		panel_91.add(btUpdate);

		btDelete = new JxButton();
		btDelete.setTheme (theme);

btDelete.setFontSize(12);
btDelete.setFontStyle(Font.BOLD);

		btDelete.setText("Delete");
		btDelete.setBounds(290, 5, 100, 20);
		panel_91.add(btDelete);

		
		final JxButton saveButton = new JxButton();
		saveButton.setTheme (theme);
		saveButton.setArc(0.4f);

		saveButton.setForeground(ColorConstants.DEF_COLOR);

saveButton.setFontSize(12);
saveButton.setFontStyle(Font.BOLD);
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				doSave();
				close();
			}
		});
		saveButton.setText("Save");
		saveButton.setBounds(190, 10, 129, 20);
		panel.add(saveButton);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme (theme);
		panel_4.setBounds(10, 160, 912, 24);
		panel.add(panel_4);

		panel_4.setLayout(null);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme (theme);

		panel_5.setLayout(null);
		panel_5.setBounds(0, 0, 304, 24);
		panel_4.add(panel_5);

		final JxLabel administerViaLabel = new JxLabel();
		administerViaLabel.setTheme (theme);

administerViaLabel.setFontSize(14);
administerViaLabel.setFontStyle(Font.BOLD);
		administerViaLabel.setText("Administer via");
		administerViaLabel.setBounds(10, 0, 139, 20);
		panel_5.add(administerViaLabel);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme (theme);

		panel_6.setLayout(null);
		panel_6.setBounds(304, 0, 304, 24);
		panel_4.add(panel_6);

		final JxLabel piccLineLabel = new JxLabel();
		piccLineLabel.setTheme (theme);

piccLineLabel.setFontSize(14);
piccLineLabel.setFontStyle(Font.BOLD);
		piccLineLabel.setText("");
		piccLineLabel.setBounds(10, 0, 230, 20);
		panel_6.add(piccLineLabel);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme (theme);

		panel_7.setLayout(null);
		panel_7.setBounds(608, 0, 304, 24);
		panel_4.add(panel_7);

		final JxLabel peropheralLinedexLabel = new JxLabel();
		peropheralLinedexLabel.setTheme (theme);
		peropheralLinedexLabel.setBounds(10, 0, 274, 20);
		panel_7.add(peropheralLinedexLabel);

peropheralLinedexLabel.setFontSize(14);
peropheralLinedexLabel.setFontStyle(Font.BOLD);
		peropheralLinedexLabel.setText("");

		final JxRadioButton centralLineRadioButton = new JxRadioButton();
		centralLineRadioButton.setTheme (theme);

		centralLineRadioButton.setText("Central Line");
		centralLineRadioButton.setBounds(318, 144, 113, 15);
		panel.add(centralLineRadioButton);

		final JxRadioButton centralLineRadioButton_1 = new JxRadioButton();
		centralLineRadioButton_1.setTheme (theme);

		centralLineRadioButton_1.setText("PICC Line (verified on X-Ray)");
		centralLineRadioButton_1.setBounds(622, 144, 181, 15);
		panel.add(centralLineRadioButton_1);

		final JxButton saveButton_1 = new JxButton();
		saveButton_1.setTheme (theme);
		saveButton_1.setArc(0.4f);

		saveButton_1.setForeground(ColorConstants.DEF_COLOR);

saveButton_1.setFontSize(12);
saveButton_1.setFontStyle(Font.BOLD);
		saveButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				doSave();
				close();
			}
		});
		saveButton_1.setArc(0.4f);
		saveButton_1.setText("Save");
		saveButton_1.setBounds(357, 896, 129, 23);
		add(saveButton_1);
	}

	public void doSave() {
		ParentalNutritionalOrderForm refParentalNutritionalOrderForm = new ParentalNutritionalOrderForm();
		refParentalNutritionalOrderForm
				.setSerial(Global.currentParentalNutritionalOrderFormKey);
		refParentalNutritionalOrderForm
				.setResidentId(Global.currentResidenceKey);
		refParentalNutritionalOrderForm.setLabCbfComment(txtLabCbfComment
				.getText());
		refParentalNutritionalOrderForm.setOrderedValid(txtOrderedValid
				.getText());
		refParentalNutritionalOrderForm.setDate(txtDate.getText());
		refParentalNutritionalOrderForm
				.setDateOrdered(txtDateOrdered.getText());
		refParentalNutritionalOrderForm
				.setRnSignature(txtRnSignature.getText());
		refParentalNutritionalOrderForm
				.setMdSignature(txtMdSignature.getText());
		refParentalNutritionalOrderForm.setRnName(txtRnName.getText());
		refParentalNutritionalOrderForm.setMdName(txtMdName.getText());
		refParentalNutritionalOrderForm.setOtherAdditive(txtOtherAdditive
				.getText());
		refParentalNutritionalOrderForm.setMviAdult(txtMviAdult.getText());
		refParentalNutritionalOrderForm
				.setRegularHumenInsulin(txtRegularHumenInsulin.getText());
		refParentalNutritionalOrderForm.setMultiraceCone(txtMultiraceCone
				.getText());
		refParentalNutritionalOrderForm.setCalciumGluconate(txtCalciumGluconate
				.getText());
		refParentalNutritionalOrderForm
				.setMagnesiumSulphate(txtMagnesiumSulphate.getText());
		refParentalNutritionalOrderForm.setPotassiumAcetate(txtPotassiumAcetate
				.getText());
		refParentalNutritionalOrderForm
				.setPotassiumChloride(txtPotassiumChloride.getText());
		refParentalNutritionalOrderForm
				.setPorassiumPhosphate(txtPorassiumPhosphate.getText());
		refParentalNutritionalOrderForm.setSodiumPhosphate(txtSodiumPhosphate
				.getText());
		refParentalNutritionalOrderForm.setSodiumAcetate(txtSodiumAcetate
				.getText());
		refParentalNutritionalOrderForm.setSodiumChloride(txtSodiumChloride
				.getText());
		refParentalNutritionalOrderForm.setOneHrTaper(txtOneHrTaper.getText());
		refParentalNutritionalOrderForm
				.setTotalVolume(txtTotalVolume.getText());
		refParentalNutritionalOrderForm.setOver(txtOver.getText());
		refParentalNutritionalOrderForm.setOneHrRamp(txtOneHrRamp.getText());
		refParentalNutritionalOrderForm
				.setFatEmulsion(txtFatEmulsion.getText());
		refParentalNutritionalOrderForm.setDextrose(txtDextrose.getText());
		refParentalNutritionalOrderForm.setAminoAcids(txtAminoAcids.getText());
		refParentalNutritionalOrderForm.setBaseSolution(txtBaseSolution
				.getText());
		refParentalNutritionalOrderForm.setPtWgt(txtPtWgt.getText());
		refParentalNutritionalOrderForm.setRm(txtRm.getText());
		refParentalNutritionalOrderForm
				.setPatientName(txtPatientName.getText());
		// refParentalNutritionalOrderForm.setFaculty(txtFaculty.getText());
		refParentalNutritionalOrderForm.setUnit(txtUnit.getText());
		try {
			/*Global.currentParentalNutritionalOrderFormKey*/ currenttpnkey = MedrexClientManager
					.getInstance().insertOrUpdateParentalNutritionalOrderForm(
							refParentalNutritionalOrderForm);
		} catch (Exception e) {
		}
	}

	public void setValueObject(
			ParentalNutritionalOrderForm refParentalNutritionalOrderForm) {
		txtLabCbfComment.setText(refParentalNutritionalOrderForm
				.getLabCbfComment());
		txtOrderedValid.setText(refParentalNutritionalOrderForm
				.getOrderedValid());
		txtDate.setText(refParentalNutritionalOrderForm.getDate());
		txtDateOrdered
				.setText(refParentalNutritionalOrderForm.getDateOrdered());
		txtRnSignature
				.setText(refParentalNutritionalOrderForm.getRnSignature());
		txtMdSignature
				.setText(refParentalNutritionalOrderForm.getMdSignature());
		txtRnName.setText(refParentalNutritionalOrderForm.getRnName());
		txtMdName.setText(refParentalNutritionalOrderForm.getMdName());
		txtOtherAdditive.setText(refParentalNutritionalOrderForm
				.getOtherAdditive());
		txtMviAdult.setText(refParentalNutritionalOrderForm.getMviAdult());
		txtRegularHumenInsulin.setText(refParentalNutritionalOrderForm
				.getRegularHumenInsulin());
		txtMultiraceCone.setText(refParentalNutritionalOrderForm
				.getMultiraceCone());
		txtCalciumGluconate.setText(refParentalNutritionalOrderForm
				.getCalciumGluconate());
		txtMagnesiumSulphate.setText(refParentalNutritionalOrderForm
				.getMagnesiumSulphate());
		txtPotassiumAcetate.setText(refParentalNutritionalOrderForm
				.getPotassiumAcetate());
		txtPotassiumChloride.setText(refParentalNutritionalOrderForm
				.getPotassiumChloride());
		txtPorassiumPhosphate.setText(refParentalNutritionalOrderForm
				.getPorassiumPhosphate());
		txtSodiumPhosphate.setText(refParentalNutritionalOrderForm
				.getSodiumPhosphate());
		txtSodiumAcetate.setText(refParentalNutritionalOrderForm
				.getSodiumAcetate());
		txtSodiumChloride.setText(refParentalNutritionalOrderForm
				.getSodiumChloride());
		txtOneHrTaper.setText(refParentalNutritionalOrderForm.getOneHrTaper());
		txtTotalVolume
				.setText(refParentalNutritionalOrderForm.getTotalVolume());
		txtOver.setText(refParentalNutritionalOrderForm.getOver());
		txtOneHrRamp.setText(refParentalNutritionalOrderForm.getOneHrRamp());
		txtFatEmulsion
				.setText(refParentalNutritionalOrderForm.getFatEmulsion());
		txtDextrose.setText(refParentalNutritionalOrderForm.getDextrose());
		txtAminoAcids.setText(refParentalNutritionalOrderForm.getAminoAcids());
		txtBaseSolution.setText(refParentalNutritionalOrderForm
				.getBaseSolution());
		txtPtWgt.setText(refParentalNutritionalOrderForm.getPtWgt());
		txtRm.setText(refParentalNutritionalOrderForm.getRm());
		txtPatientName
				.setText(refParentalNutritionalOrderForm.getPatientName());
		// txtFaculty.setText(refParentalNutritionalOrderForm.getFaculty());
		txtUnit.setText(refParentalNutritionalOrderForm.getUnit());

	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

}
