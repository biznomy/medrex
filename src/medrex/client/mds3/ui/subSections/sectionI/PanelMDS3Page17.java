package medrex.client.mds3.ui.subSections.sectionI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.client.mds3.general.Mds3SubSection;
import medrex.commons.enums.ColorConstants;

import com.sX.swing.JxCheckBox;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelMDS3Page17 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1047116129858966021L;
	Theme theme = new BlackOverWhiteTheme();

	public PanelMDS3Page17() {
		super();
		setPreferredSize(new Dimension(800, 1100));
		final FlowLayout flowLayout_6 = new FlowLayout();
		flowLayout_6.setVgap(0);
		flowLayout_6.setHgap(0);
		setLayout(flowLayout_6);
		setBackground(Color.WHITE);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);

		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(800, 35));
		add(panel);

		final JxLabel residentLabel = new JxLabel();
		residentLabel.setTheme(theme);

		residentLabel.setFontSize(12);
		residentLabel.setText("Resident");
		residentLabel.setBounds(10, 9, 56, 16);
		panel.add(residentLabel);

		final JxText textField = new JxText();
		textField.setTheme(theme);
		textField.setBounds(84, 8, 248, 20);
		panel.add(textField);

		final JxLabel residentLabel_1 = new JxLabel();
		residentLabel_1.setTheme(theme);

		residentLabel_1.setFontSize(12);
		residentLabel_1.setText("Identifier");
		residentLabel_1.setBounds(338, 9, 56, 16);
		panel.add(residentLabel_1);

		final JxText textField_1 = new JxText();
		textField_1.setTheme(theme);
		textField_1.setBounds(400, 8, 213, 20);
		panel.add(textField_1);

		final JxLabel residentLabel_1_1 = new JxLabel();
		residentLabel_1_1.setTheme(theme);

		residentLabel_1_1.setFontSize(12);
		residentLabel_1_1.setText("Date");
		residentLabel_1_1.setBounds(637, 9, 56, 16);
		panel.add(residentLabel_1_1);

		final JxDateChooser dcDate = new JxDateChooser();
		dcDate.setTheme(theme);
		dcDate.setDateFormatString("dd/MM/yyyy");

		dcDate.setBounds(699, 8, 100, 22);
		panel.add(dcDate);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel_2.setLayout(null);
		panel_2.setPreferredSize(new Dimension(800, 35));
		add(panel_2);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setBackground(ColorConstants.MDS_FONT_COLOR);
		final FlowLayout flowLayout_1 = new FlowLayout();
		flowLayout_1.setVgap(2);
		flowLayout_1.setHgap(10);
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_3.setLayout(flowLayout_1);
		panel_3.setBounds(3, 3, 231, 18);
		panel_2.add(panel_3);

		final JxLabel sectionALabel = new JxLabel();
		sectionALabel.setTheme(theme);
		sectionALabel.setForeground(Color.WHITE);

		sectionALabel.setFontStyle(Font.BOLD);
		sectionALabel.setText("Section I");
		panel_3.add(sectionALabel);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);
		panel_4.setBackground(ColorConstants.MDS_BACK_COLOR);
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setVgap(2);
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_4.setLayout(flowLayout);
		panel_4.setBounds(246, 2, 552, 23);
		panel_2.add(panel_4);

		final JxLabel identificationInformationLabel = new JxLabel();
		identificationInformationLabel.setTheme(theme);
		identificationInformationLabel
				.setForeground(ColorConstants.MDS_FONT_COLOR);

		identificationInformationLabel.setFontStyle(Font.BOLD);
		identificationInformationLabel
				.setHorizontalAlignment(SwingConstants.LEFT);
		identificationInformationLabel.setText("Active Diagnosis");
		panel_4.add(identificationInformationLabel);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);

		panel_5.setBounds(0, 27, 838, 8);
		panel_2.add(panel_5);

		final JxPanel panel_1_1_2 = new JxPanel();
		panel_1_1_2.setTheme(theme);

		panel_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setPreferredSize(new Dimension(800, 80));
		add(panel_1_1_2);

		final JxPanel panel_5_1_2 = new JxPanel();
		panel_5_1_2.setTheme(theme);
		panel_5_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_7 = new FlowLayout();
		flowLayout_7.setHgap(10);
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		panel_5_1_2.setLayout(flowLayout_7);
		panel_5_1_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_2.setBounds(0, 0, 800, 38);
		panel_1_1_2.add(panel_5_1_2);

		final JxLabel a0100Label_1_2 = new JxLabel();
		a0100Label_1_2.setTheme(theme);

		a0100Label_1_2.setFontSize(12);
		a0100Label_1_2.setName("");
		a0100Label_1_2
				.setText("<html><b>Active diagnosis in the last 7 days - Check all that apply<br></b>Diagnosis listed in the parantheses are provided as examples and shouls not be considered as all - inclusive lists");
		panel_5_1_2.add(a0100Label_1_2);

		final JxPanel panel_7_1_2_1 = new JxPanel();
		panel_7_1_2_1.setTheme(theme);
		panel_7_1_2_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_7_1_2_1.setLayout(null);
		panel_7_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2_1.setBounds(0, 37, 800, 21);
		panel_1_1_2.add(panel_7_1_2_1);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setOpaque(true);
		panel_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1.setBounds(0, 0, 48, 21);
		panel_7_1_2_1.add(panel_1);

		final JxLabel cancerLabel = new JxLabel();
		cancerLabel.setTheme(theme);

		cancerLabel.setFontSize(12);
		cancerLabel.setFontStyle(Font.BOLD);
		cancerLabel.setText("Cancer");
		cancerLabel.setBounds(54, 5, 378, 14);
		panel_7_1_2_1.add(cancerLabel);

		final JxPanel panel_6_1_2 = new JxPanel();
		panel_6_1_2.setTheme(theme);
		panel_6_1_2.setOpaque(true);
		panel_6_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_8 = new FlowLayout();
		flowLayout_8.setVgap(8);
		panel_6_1_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_2.setLayout(flowLayout_8);
		panel_6_1_2.setBounds(0, 37, 48, 43);
		panel_1_1_2.add(panel_6_1_2);

		final JxPanel panel_7_1_2 = new JxPanel();
		panel_7_1_2.setTheme(theme);
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setHgap(13);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_7_1_2.setLayout(flowLayout_2);
		panel_7_1_2.setOpaque(false);
		panel_7_1_2.setBounds(48, 59, 752, 21);
		panel_1_1_2.add(panel_7_1_2);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);
		label
				.setText("<html><b>10100. Cancer </b>(with or without metastatis)");
		panel_7_1_2.add(label);

		final JxPanel panel_1_1_2_1 = new JxPanel();
		panel_1_1_2_1.setTheme(theme);

		panel_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_2_1.setLayout(null);
		panel_1_1_2_1.setPreferredSize(new Dimension(800, 190));
		add(panel_1_1_2_1);

		final JxPanel panel_7_1_2_1_1 = new JxPanel();
		panel_7_1_2_1_1.setTheme(theme);
		panel_7_1_2_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_7_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2_1_1.setLayout(null);
		panel_7_1_2_1_1.setBounds(0, -1, 800, 22);
		panel_1_1_2_1.add(panel_7_1_2_1_1);

		final JxLabel cancerLabel_1 = new JxLabel();
		cancerLabel_1.setTheme(theme);

		cancerLabel_1.setFontSize(12);
		cancerLabel_1.setFontStyle(Font.BOLD);
		cancerLabel_1.setText("Heart Circulation");
		cancerLabel_1.setBounds(54, 5, 378, 14);
		panel_7_1_2_1_1.add(cancerLabel_1);

		final JxPanel panel_6_1_2_1 = new JxPanel();
		panel_6_1_2_1.setTheme(theme);
		panel_6_1_2_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_2_1.setBounds(0, -1, 48, 23);
		panel_7_1_2_1_1.add(panel_6_1_2_1);
		panel_6_1_2_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		final FlowLayout flowLayout_4 = new FlowLayout();
		flowLayout_4.setVgap(8);
		panel_6_1_2_1.setLayout(flowLayout_4);

		final JxPanel panel_7_1_2_1_1_1 = new JxPanel();
		panel_7_1_2_1_1_1.setTheme(theme);

		panel_7_1_2_1_1_1.setLayout(null);
		panel_7_1_2_1_1_1.setBounds(48, 21, 751, 169);
		panel_1_1_2_1.add(panel_7_1_2_1_1_1);

		final JxLabel cancerLabel_1_1 = new JxLabel();
		cancerLabel_1_1.setTheme(theme);
		cancerLabel_1_1
				.setText("<html><b>10200. Anemia</b>(eg. aplastic , iron deficiency, pernicious and sickle cell)");
		cancerLabel_1_1.setBounds(10, 2, 479, 14);
		panel_7_1_2_1_1_1.add(cancerLabel_1_1);

		final JxLabel cancerLabel_1_1_1 = new JxLabel();
		cancerLabel_1_1_1.setTheme(theme);
		cancerLabel_1_1_1
				.setText("<html><b>10300. Atrial Fibrillation or other Dysrhythmias</b>(eg. bradycardias and tachycardias)");
		cancerLabel_1_1_1.setBounds(10, 20, 479, 14);
		panel_7_1_2_1_1_1.add(cancerLabel_1_1_1);

		final JxLabel cancerLabel_1_1_2 = new JxLabel();
		cancerLabel_1_1_2.setTheme(theme);
		cancerLabel_1_1_2
				.setText("<html><b>10400 . Coronary Artery Diseases(CAD)</b>(eg ,angima , myocardial infraction , and artheroscelerotic heart disease(ASHD))");
		cancerLabel_1_1_2.setBounds(10, 40, 737, 14);
		panel_7_1_2_1_1_1.add(cancerLabel_1_1_2);

		final JxLabel cancerLabel_1_1_3 = new JxLabel();
		cancerLabel_1_1_3.setTheme(theme);
		cancerLabel_1_1_3
				.setText("<html><b>10500. Deep Venous Thrombosis(DVT), pulmonary Embolus(PE), or Pulmonary Thrombo-Embolism(PTE)");
		cancerLabel_1_1_3.setBounds(10, 60, 609, 14);
		panel_7_1_2_1_1_1.add(cancerLabel_1_1_3);

		final JxLabel cancerLabel_1_1_4 = new JxLabel();
		cancerLabel_1_1_4.setTheme(theme);
		cancerLabel_1_1_4
				.setText("<html><b> 10600. Heart Failure</b>(eg. congestion heart failure(CHF) and pulmonary edema)");
		cancerLabel_1_1_4.setBounds(10, 80, 479, 14);
		panel_7_1_2_1_1_1.add(cancerLabel_1_1_4);

		final JxLabel cancerLabel_1_1_5 = new JxLabel();
		cancerLabel_1_1_5.setTheme(theme);
		cancerLabel_1_1_5.setText("<html><b>10700. Hypertension");
		cancerLabel_1_1_5.setBounds(10, 100, 479, 14);
		panel_7_1_2_1_1_1.add(cancerLabel_1_1_5);

		final JxLabel cancerLabel_1_1_6 = new JxLabel();
		cancerLabel_1_1_6.setTheme(theme);
		cancerLabel_1_1_6.setText("<html><b>10800. Orthosatatic Hypotension");
		cancerLabel_1_1_6.setBounds(10, 120, 479, 14);
		panel_7_1_2_1_1_1.add(cancerLabel_1_1_6);

		final JxLabel cancerLabel_1_1_7 = new JxLabel();
		cancerLabel_1_1_7.setTheme(theme);
		cancerLabel_1_1_7
				.setText("<html><b>10900. Peripheral Vascular disease(PVD) or Peripheral Arterial Disease(PAD)");
		cancerLabel_1_1_7.setBounds(10, 140, 479, 14);
		panel_7_1_2_1_1_1.add(cancerLabel_1_1_7);

		final JxPanel panel_6_1_2_1_1 = new JxPanel();
		panel_6_1_2_1_1.setTheme(theme);
		panel_6_1_2_1_1.setLayout(null);
		panel_6_1_2_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_2_1_1.setBounds(0, 20, 48, 170);
		panel_1_1_2_1.add(panel_6_1_2_1_1);
		panel_6_1_2_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));

		final JxCheckBox checkBox = new JxCheckBox();
		checkBox.setTheme(theme);

		checkBox.setActionCommand("");
		checkBox.setBounds(20, 2, 15, 15);
		checkBox.setText("");
		panel_6_1_2_1_1.add(checkBox);

		final JxCheckBox checkBox_1 = new JxCheckBox();
		checkBox_1.setTheme(theme);

		checkBox_1.setText("New JxCheckBox");
		checkBox_1.setBounds(20, 20, 15, 15);
		panel_6_1_2_1_1.add(checkBox_1);

		final JxCheckBox checkBox_2 = new JxCheckBox();
		checkBox_2.setTheme(theme);

		checkBox_2.setText("New JxCheckBox");
		checkBox_2.setBounds(20, 40, 15, 15);
		panel_6_1_2_1_1.add(checkBox_2);

		final JxCheckBox checkBox_3 = new JxCheckBox();
		checkBox_3.setTheme(theme);

		checkBox_3.setText("New JxCheckBox");
		checkBox_3.setBounds(20, 59, 15, 15);
		panel_6_1_2_1_1.add(checkBox_3);

		final JxCheckBox checkBox_4 = new JxCheckBox();
		checkBox_4.setTheme(theme);

		checkBox_4.setText("New JxCheckBox");
		checkBox_4.setBounds(20, 80, 15, 15);
		panel_6_1_2_1_1.add(checkBox_4);

		final JxCheckBox checkBox_5 = new JxCheckBox();
		checkBox_5.setTheme(theme);

		checkBox_5.setText("New JxCheckBox");
		checkBox_5.setBounds(20, 101, 15, 15);
		panel_6_1_2_1_1.add(checkBox_5);

		final JxCheckBox checkBox_6 = new JxCheckBox();
		checkBox_6.setTheme(theme);

		checkBox_6.setText("New JxCheckBox");
		checkBox_6.setBounds(20, 122, 15, 15);
		panel_6_1_2_1_1.add(checkBox_6);

		final JxCheckBox checkBox_7 = new JxCheckBox();
		checkBox_7.setTheme(theme);

		checkBox_7.setText("New JxCheckBox");
		checkBox_7.setBounds(20, 140, 15, 15);
		panel_6_1_2_1_1.add(checkBox_7);

		final JxPanel panel_1_1_2_1_1 = new JxPanel();
		panel_1_1_2_1_1.setTheme(theme);

		panel_1_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_2_1_1.setLayout(null);
		panel_1_1_2_1_1.setPreferredSize(new Dimension(800, 84));
		add(panel_1_1_2_1_1);

		final JxPanel panel_7_1_2_1_1_2 = new JxPanel();
		panel_7_1_2_1_1_2.setTheme(theme);
		panel_7_1_2_1_1_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_7_1_2_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2_1_1_2.setLayout(null);
		panel_7_1_2_1_1_2.setBounds(0, 0, 800, 21);
		panel_1_1_2_1_1.add(panel_7_1_2_1_1_2);

		final JxLabel cancerLabel_1_2 = new JxLabel();
		cancerLabel_1_2.setTheme(theme);

		cancerLabel_1_2.setFontSize(12);
		cancerLabel_1_2.setFontStyle(Font.BOLD);
		cancerLabel_1_2.setText("Gastrointestinal");
		cancerLabel_1_2.setBounds(54, 5, 378, 14);
		panel_7_1_2_1_1_2.add(cancerLabel_1_2);

		final JxPanel panel_6_1_2_1_2 = new JxPanel();
		panel_6_1_2_1_2.setTheme(theme);
		panel_6_1_2_1_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_2_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		final FlowLayout flowLayout_3 = new FlowLayout();
		flowLayout_3.setVgap(8);
		panel_6_1_2_1_2.setLayout(flowLayout_3);
		panel_6_1_2_1_2.setBounds(0, -1, 48, 22);
		panel_7_1_2_1_1_2.add(panel_6_1_2_1_2);

		final JxPanel panel_7_1_2_1_1_1_1 = new JxPanel();
		panel_7_1_2_1_1_1_1.setTheme(theme);

		panel_7_1_2_1_1_1_1.setLayout(null);
		panel_7_1_2_1_1_1_1.setBounds(48, 20, 742, 63);
		panel_1_1_2_1_1.add(panel_7_1_2_1_1_1_1);

		final JxLabel cancerLabel_1_1_8 = new JxLabel();
		cancerLabel_1_1_8.setTheme(theme);
		cancerLabel_1_1_8.setText("<html><b>11100. Cirrhosis");
		cancerLabel_1_1_8.setBounds(10, 2, 479, 14);
		panel_7_1_2_1_1_1_1.add(cancerLabel_1_1_8);

		final JxLabel cancerLabel_1_1_1_1 = new JxLabel();
		cancerLabel_1_1_1_1.setTheme(theme);
		cancerLabel_1_1_1_1
				.setText("<html><b>11200. Gastrophageal Reflux Disease(GERD) or Ulcer</b>(eg. esophageal , gastric, and peptic ulcers)");
		cancerLabel_1_1_1_1.setBounds(10, 20, 605, 14);
		panel_7_1_2_1_1_1_1.add(cancerLabel_1_1_1_1);

		final JxLabel cancerLabel_1_1_2_1 = new JxLabel();
		cancerLabel_1_1_2_1.setTheme(theme);
		cancerLabel_1_1_2_1
				.setText("<html><b>11300. Ulcerative Colitis, Crohn's Disease or Inflammatory Bowel Disease");
		cancerLabel_1_1_2_1.setBounds(10, 40, 696, 14);
		panel_7_1_2_1_1_1_1.add(cancerLabel_1_1_2_1);

		final JxPanel panel_6_1_2_1_1_1 = new JxPanel();
		panel_6_1_2_1_1_1.setTheme(theme);
		panel_6_1_2_1_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_2_1_1_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		panel_6_1_2_1_1_1.setLayout(null);
		panel_6_1_2_1_1_1.setBounds(0, 20, 48, 64);
		panel_1_1_2_1_1.add(panel_6_1_2_1_1_1);

		final JxCheckBox checkBox_8 = new JxCheckBox();
		checkBox_8.setTheme(theme);

		checkBox_8.setText("New JxCheckBox");
		checkBox_8.setBounds(20, 2, 15, 15);
		panel_6_1_2_1_1_1.add(checkBox_8);

		final JxCheckBox checkBox_1_1 = new JxCheckBox();
		checkBox_1_1.setTheme(theme);

		checkBox_1_1.setText("New JxCheckBox");
		checkBox_1_1.setBounds(20, 20, 15, 15);
		panel_6_1_2_1_1_1.add(checkBox_1_1);

		final JxCheckBox checkBox_2_1 = new JxCheckBox();
		checkBox_2_1.setTheme(theme);

		checkBox_2_1.setText("New JxCheckBox");
		checkBox_2_1.setBounds(20, 40, 15, 15);
		panel_6_1_2_1_1_1.add(checkBox_2_1);

		final JxPanel panel_1_1_2_1_2 = new JxPanel();
		panel_1_1_2_1_2.setTheme(theme);

		panel_1_1_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_2_1_2.setLayout(null);
		panel_1_1_2_1_2.setPreferredSize(new Dimension(800, 106));
		add(panel_1_1_2_1_2);

		final JxPanel panel_7_1_2_1_1_3 = new JxPanel();
		panel_7_1_2_1_1_3.setTheme(theme);
		panel_7_1_2_1_1_3.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_7_1_2_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2_1_1_3.setLayout(null);
		panel_7_1_2_1_1_3.setBounds(0, -1, 800, 22);
		panel_1_1_2_1_2.add(panel_7_1_2_1_1_3);

		final JxLabel cancerLabel_1_3 = new JxLabel();
		cancerLabel_1_3.setTheme(theme);

		cancerLabel_1_3.setFontSize(12);
		cancerLabel_1_3.setFontStyle(Font.BOLD);
		cancerLabel_1_3.setText("Genitourinary");
		cancerLabel_1_3.setBounds(54, 5, 378, 14);
		panel_7_1_2_1_1_3.add(cancerLabel_1_3);

		final JxPanel panel_6_1_2_1_2_1 = new JxPanel();
		panel_6_1_2_1_2_1.setTheme(theme);
		panel_6_1_2_1_2_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_2_1_2_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_5 = new FlowLayout();
		flowLayout_5.setVgap(8);
		panel_6_1_2_1_2_1.setLayout(flowLayout_5);
		panel_6_1_2_1_2_1.setBounds(0, -1, 48, 23);
		panel_7_1_2_1_1_3.add(panel_6_1_2_1_2_1);

		final JxPanel panel_7_1_2_1_1_1_2 = new JxPanel();
		panel_7_1_2_1_1_1_2.setTheme(theme);

		panel_7_1_2_1_1_1_2.setLayout(null);
		panel_7_1_2_1_1_1_2.setBounds(48, 21, 742, 84);
		panel_1_1_2_1_2.add(panel_7_1_2_1_1_1_2);

		final JxLabel cancerLabel_1_1_9 = new JxLabel();
		cancerLabel_1_1_9.setTheme(theme);
		cancerLabel_1_1_9
				.setText("<html><b>11400. Benign Prostatic Hyperplasia(BPH)");
		cancerLabel_1_1_9.setBounds(10, 2, 479, 14);
		panel_7_1_2_1_1_1_2.add(cancerLabel_1_1_9);

		final JxLabel cancerLabel_1_1_1_2 = new JxLabel();
		cancerLabel_1_1_1_2.setTheme(theme);
		cancerLabel_1_1_1_2
				.setText("<html><b>11500. Renal insufficiency, Renal Failure , or End- Stage Renal Diseases(ESRD)");
		cancerLabel_1_1_1_2.setBounds(10, 20, 479, 14);
		panel_7_1_2_1_1_1_2.add(cancerLabel_1_1_1_2);

		final JxLabel cancerLabel_1_1_2_2 = new JxLabel();
		cancerLabel_1_1_2_2.setTheme(theme);
		cancerLabel_1_1_2_2.setText("<html><b>11550. Neurogenic Bladder");
		cancerLabel_1_1_2_2.setBounds(10, 40, 737, 14);
		panel_7_1_2_1_1_1_2.add(cancerLabel_1_1_2_2);

		final JxLabel cancerLabel_1_1_3_1 = new JxLabel();
		cancerLabel_1_1_3_1.setTheme(theme);
		cancerLabel_1_1_3_1.setText("<html><b>11650. Obstructive Uropathy");
		cancerLabel_1_1_3_1.setBounds(10, 60, 609, 14);
		panel_7_1_2_1_1_1_2.add(cancerLabel_1_1_3_1);

		final JxPanel panel_6_1_2_1_1_2 = new JxPanel();
		panel_6_1_2_1_1_2.setTheme(theme);
		panel_6_1_2_1_1_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_2_1_1_2.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		panel_6_1_2_1_1_2.setLayout(null);
		panel_6_1_2_1_1_2.setBounds(0, 20, 48, 86);
		panel_1_1_2_1_2.add(panel_6_1_2_1_1_2);

		final JxCheckBox checkBox_9 = new JxCheckBox();
		checkBox_9.setTheme(theme);

		checkBox_9.setText("New JxCheckBox");
		checkBox_9.setBounds(20, 2, 15, 15);
		panel_6_1_2_1_1_2.add(checkBox_9);

		final JxCheckBox checkBox_1_2 = new JxCheckBox();
		checkBox_1_2.setTheme(theme);

		checkBox_1_2.setText("New JxCheckBox");
		checkBox_1_2.setBounds(20, 20, 15, 15);
		panel_6_1_2_1_1_2.add(checkBox_1_2);

		final JxCheckBox checkBox_2_2 = new JxCheckBox();
		checkBox_2_2.setTheme(theme);

		checkBox_2_2.setText("New JxCheckBox");
		checkBox_2_2.setBounds(20, 40, 15, 15);
		panel_6_1_2_1_1_2.add(checkBox_2_2);

		final JxCheckBox checkBox_3_1 = new JxCheckBox();
		checkBox_3_1.setTheme(theme);

		checkBox_3_1.setText("New JxCheckBox");
		checkBox_3_1.setBounds(20, 61, 15, 15);
		panel_6_1_2_1_1_2.add(checkBox_3_1);

		final JxPanel panel_1_1_2_1_3 = new JxPanel();
		panel_1_1_2_1_3.setTheme(theme);

		panel_1_1_2_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_2_1_3.setLayout(null);
		panel_1_1_2_1_3.setPreferredSize(new Dimension(800, 165));
		add(panel_1_1_2_1_3);

		final JxPanel panel_7_1_2_1_1_4 = new JxPanel();
		panel_7_1_2_1_1_4.setTheme(theme);
		panel_7_1_2_1_1_4.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_7_1_2_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2_1_1_4.setLayout(null);
		panel_7_1_2_1_1_4.setBounds(0, -1, 800, 22);
		panel_1_1_2_1_3.add(panel_7_1_2_1_1_4);

		final JxLabel cancerLabel_1_4 = new JxLabel();
		cancerLabel_1_4.setTheme(theme);

		cancerLabel_1_4.setFontSize(12);
		cancerLabel_1_4.setFontStyle(Font.BOLD);
		cancerLabel_1_4.setText("Infections");
		cancerLabel_1_4.setBounds(54, 5, 378, 14);
		panel_7_1_2_1_1_4.add(cancerLabel_1_4);

		final JxPanel panel_6_1_2_1_4 = new JxPanel();
		panel_6_1_2_1_4.setTheme(theme);
		panel_6_1_2_1_4.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_2_1_4.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		final FlowLayout flowLayout_9 = new FlowLayout();
		flowLayout_9.setVgap(8);
		panel_6_1_2_1_4.setLayout(flowLayout_9);
		panel_6_1_2_1_4.setBounds(0, -1, 48, 24);
		panel_7_1_2_1_1_4.add(panel_6_1_2_1_4);

		final JxPanel panel_7_1_2_1_1_1_3 = new JxPanel();
		panel_7_1_2_1_1_1_3.setTheme(theme);

		panel_7_1_2_1_1_1_3.setLayout(null);
		panel_7_1_2_1_1_1_3.setBounds(48, 21, 742, 143);
		panel_1_1_2_1_3.add(panel_7_1_2_1_1_1_3);

		final JxLabel cancerLabel_1_1_10 = new JxLabel();
		cancerLabel_1_1_10.setTheme(theme);
		cancerLabel_1_1_10
				.setText("<html><b>11700. Multidrug - Resident Organism(MDRO)");
		cancerLabel_1_1_10.setBounds(10, 2, 479, 14);
		panel_7_1_2_1_1_1_3.add(cancerLabel_1_1_10);

		final JxLabel cancerLabel_1_1_1_3 = new JxLabel();
		cancerLabel_1_1_1_3.setTheme(theme);
		cancerLabel_1_1_1_3.setText("<html><b>12000. Pneumonia");
		cancerLabel_1_1_1_3.setBounds(10, 20, 479, 14);
		panel_7_1_2_1_1_1_3.add(cancerLabel_1_1_1_3);

		final JxLabel cancerLabel_1_1_2_3 = new JxLabel();
		cancerLabel_1_1_2_3.setTheme(theme);
		cancerLabel_1_1_2_3.setText("<html><b>12100. Septicemia");
		cancerLabel_1_1_2_3.setBounds(10, 40, 737, 14);
		panel_7_1_2_1_1_1_3.add(cancerLabel_1_1_2_3);

		final JxLabel cancerLabel_1_1_3_2 = new JxLabel();
		cancerLabel_1_1_3_2.setTheme(theme);
		cancerLabel_1_1_3_2.setText("<html><b>12200. Tuberculosis");
		cancerLabel_1_1_3_2.setBounds(10, 60, 609, 14);
		panel_7_1_2_1_1_1_3.add(cancerLabel_1_1_3_2);

		final JxLabel cancerLabel_1_1_4_1 = new JxLabel();
		cancerLabel_1_1_4_1.setTheme(theme);
		cancerLabel_1_1_4_1
				.setText("<html><b>12300. Urinary Tract Infection (UTI)(Last 30 days)");
		cancerLabel_1_1_4_1.setBounds(10, 80, 479, 14);
		panel_7_1_2_1_1_1_3.add(cancerLabel_1_1_4_1);

		final JxLabel cancerLabel_1_1_5_1 = new JxLabel();
		cancerLabel_1_1_5_1.setTheme(theme);
		cancerLabel_1_1_5_1
				.setText("<html><b>12400. Virul Hepatitis</b>(eg Hep- A,B,C,D,E)");
		cancerLabel_1_1_5_1.setBounds(10, 100, 479, 14);
		panel_7_1_2_1_1_1_3.add(cancerLabel_1_1_5_1);

		final JxLabel cancerLabel_1_1_6_1 = new JxLabel();
		cancerLabel_1_1_6_1.setTheme(theme);
		cancerLabel_1_1_6_1.setText("<html><b>12500. Wound Infection");
		cancerLabel_1_1_6_1.setBounds(10, 120, 479, 14);
		panel_7_1_2_1_1_1_3.add(cancerLabel_1_1_6_1);

		final JxPanel panel_6_1_2_1_1_3 = new JxPanel();
		panel_6_1_2_1_1_3.setTheme(theme);
		panel_6_1_2_1_1_3.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_2_1_1_3.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		panel_6_1_2_1_1_3.setLayout(null);
		panel_6_1_2_1_1_3.setBounds(0, 22, 48, 143);
		panel_1_1_2_1_3.add(panel_6_1_2_1_1_3);

		final JxCheckBox checkBox_10 = new JxCheckBox();
		checkBox_10.setTheme(theme);

		checkBox_10.setText("New JxCheckBox");
		checkBox_10.setBounds(20, 2, 15, 15);
		panel_6_1_2_1_1_3.add(checkBox_10);

		final JxCheckBox checkBox_1_3 = new JxCheckBox();
		checkBox_1_3.setTheme(theme);

		checkBox_1_3.setText("New JxCheckBox");
		checkBox_1_3.setBounds(20, 20, 15, 15);
		panel_6_1_2_1_1_3.add(checkBox_1_3);

		final JxCheckBox checkBox_2_3 = new JxCheckBox();
		checkBox_2_3.setTheme(theme);

		checkBox_2_3.setText("New JxCheckBox");
		checkBox_2_3.setBounds(20, 40, 15, 15);
		panel_6_1_2_1_1_3.add(checkBox_2_3);

		final JxCheckBox checkBox_3_2 = new JxCheckBox();
		checkBox_3_2.setTheme(theme);

		checkBox_3_2.setText("New JxCheckBox");
		checkBox_3_2.setBounds(20, 59, 15, 15);
		panel_6_1_2_1_1_3.add(checkBox_3_2);

		final JxCheckBox checkBox_4_1 = new JxCheckBox();
		checkBox_4_1.setTheme(theme);

		checkBox_4_1.setText("New JxCheckBox");
		checkBox_4_1.setBounds(20, 80, 15, 15);
		panel_6_1_2_1_1_3.add(checkBox_4_1);

		final JxCheckBox checkBox_5_1 = new JxCheckBox();
		checkBox_5_1.setTheme(theme);

		checkBox_5_1.setText("New JxCheckBox");
		checkBox_5_1.setBounds(20, 101, 15, 15);
		panel_6_1_2_1_1_3.add(checkBox_5_1);

		final JxCheckBox checkBox_6_1 = new JxCheckBox();
		checkBox_6_1.setTheme(theme);

		checkBox_6_1.setText("New JxCheckBox");
		checkBox_6_1.setBounds(20, 122, 15, 15);
		panel_6_1_2_1_1_3.add(checkBox_6_1);

		final JxPanel panel_1_1_2_1_3_1 = new JxPanel();
		panel_1_1_2_1_3_1.setTheme(theme);

		panel_1_1_2_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_2_1_3_1.setLayout(null);
		panel_1_1_2_1_3_1.setPreferredSize(new Dimension(800, 123));
		add(panel_1_1_2_1_3_1);

		final JxPanel panel_7_1_2_1_1_4_1 = new JxPanel();
		panel_7_1_2_1_1_4_1.setTheme(theme);
		panel_7_1_2_1_1_4_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_7_1_2_1_1_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2_1_1_4_1.setLayout(null);
		panel_7_1_2_1_1_4_1.setBounds(0, -1, 800, 22);
		panel_1_1_2_1_3_1.add(panel_7_1_2_1_1_4_1);

		final JxLabel cancerLabel_1_4_1 = new JxLabel();
		cancerLabel_1_4_1.setTheme(theme);

		cancerLabel_1_4_1.setFontSize(12);
		cancerLabel_1_4_1.setFontStyle(Font.BOLD);
		cancerLabel_1_4_1.setText("Metabolic");
		cancerLabel_1_4_1.setBounds(54, 5, 378, 14);
		panel_7_1_2_1_1_4_1.add(cancerLabel_1_4_1);

		final JxPanel panel_6_1_2_1_4_1 = new JxPanel();
		panel_6_1_2_1_4_1.setTheme(theme);
		panel_6_1_2_1_4_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_2_1_4_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_10 = new FlowLayout();
		flowLayout_10.setVgap(8);
		panel_6_1_2_1_4_1.setLayout(flowLayout_10);
		panel_6_1_2_1_4_1.setBounds(0, -1, 48, 23);
		panel_7_1_2_1_1_4_1.add(panel_6_1_2_1_4_1);

		final JxPanel panel_7_1_2_1_1_1_3_1 = new JxPanel();
		panel_7_1_2_1_1_1_3_1.setTheme(theme);

		panel_7_1_2_1_1_1_3_1.setLayout(null);
		panel_7_1_2_1_1_1_3_1.setBounds(48, 21, 742, 101);
		panel_1_1_2_1_3_1.add(panel_7_1_2_1_1_1_3_1);

		final JxLabel cancerLabel_1_1_10_1 = new JxLabel();
		cancerLabel_1_1_10_1.setTheme(theme);
		cancerLabel_1_1_10_1
				.setText("<html><b>12900. Diabetes Mellitus(DM)</b>(eg. diabetic retinopathy, nephropathy, and neuropathy)");
		cancerLabel_1_1_10_1.setBounds(10, 2, 479, 14);
		panel_7_1_2_1_1_1_3_1.add(cancerLabel_1_1_10_1);

		final JxLabel cancerLabel_1_1_1_3_1 = new JxLabel();
		cancerLabel_1_1_1_3_1.setTheme(theme);
		cancerLabel_1_1_1_3_1.setText("<html><b>13100. Hyponatremia");
		cancerLabel_1_1_1_3_1.setBounds(10, 20, 479, 14);
		panel_7_1_2_1_1_1_3_1.add(cancerLabel_1_1_1_3_1);

		final JxLabel cancerLabel_1_1_2_3_1 = new JxLabel();
		cancerLabel_1_1_2_3_1.setTheme(theme);
		cancerLabel_1_1_2_3_1.setText("<html><b>13200. Hyperkalemia");
		cancerLabel_1_1_2_3_1.setBounds(10, 40, 737, 14);
		panel_7_1_2_1_1_1_3_1.add(cancerLabel_1_1_2_3_1);

		final JxLabel cancerLabel_1_1_3_2_1 = new JxLabel();
		cancerLabel_1_1_3_2_1.setTheme(theme);
		cancerLabel_1_1_3_2_1
				.setText("<html><b>13300. Hyperlipidemia</b>(eg. hypercholesterolemia)");
		cancerLabel_1_1_3_2_1.setBounds(10, 60, 609, 14);
		panel_7_1_2_1_1_1_3_1.add(cancerLabel_1_1_3_2_1);

		final JxLabel cancerLabel_1_1_4_1_1 = new JxLabel();
		cancerLabel_1_1_4_1_1.setTheme(theme);
		cancerLabel_1_1_4_1_1
				.setText("<html><b>13400. Thyroid Disorder</b>(eg. hypothyroidism, hyperthyroidism, and Hshimoto's thyroiditis)");
		cancerLabel_1_1_4_1_1.setBounds(10, 80, 479, 14);
		panel_7_1_2_1_1_1_3_1.add(cancerLabel_1_1_4_1_1);

		final JxPanel panel_6_1_2_1_1_3_1 = new JxPanel();
		panel_6_1_2_1_1_3_1.setTheme(theme);
		panel_6_1_2_1_1_3_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_2_1_1_3_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		panel_6_1_2_1_1_3_1.setLayout(null);
		panel_6_1_2_1_1_3_1.setBounds(0, 20, 48, 103);
		panel_1_1_2_1_3_1.add(panel_6_1_2_1_1_3_1);

		final JxCheckBox checkBox_10_1 = new JxCheckBox();
		checkBox_10_1.setTheme(theme);

		checkBox_10_1.setText("New JxCheckBox");
		checkBox_10_1.setBounds(20, 2, 15, 15);
		panel_6_1_2_1_1_3_1.add(checkBox_10_1);

		final JxCheckBox checkBox_1_3_1 = new JxCheckBox();
		checkBox_1_3_1.setTheme(theme);

		checkBox_1_3_1.setText("New JxCheckBox");
		checkBox_1_3_1.setBounds(20, 20, 15, 15);
		panel_6_1_2_1_1_3_1.add(checkBox_1_3_1);

		final JxCheckBox checkBox_2_3_1 = new JxCheckBox();
		checkBox_2_3_1.setTheme(theme);

		checkBox_2_3_1.setText("New JxCheckBox");
		checkBox_2_3_1.setBounds(20, 40, 15, 15);
		panel_6_1_2_1_1_3_1.add(checkBox_2_3_1);

		final JxCheckBox checkBox_3_2_1 = new JxCheckBox();
		checkBox_3_2_1.setTheme(theme);

		checkBox_3_2_1.setText("New JxCheckBox");
		checkBox_3_2_1.setBounds(20, 59, 15, 15);
		panel_6_1_2_1_1_3_1.add(checkBox_3_2_1);

		final JxCheckBox checkBox_4_1_1 = new JxCheckBox();
		checkBox_4_1_1.setTheme(theme);

		checkBox_4_1_1.setText("New JxCheckBox");
		checkBox_4_1_1.setBounds(20, 80, 15, 15);
		panel_6_1_2_1_1_3_1.add(checkBox_4_1_1);

		final JxPanel panel_1_1_2_1_3_1_1 = new JxPanel();
		panel_1_1_2_1_3_1_1.setTheme(theme);

		panel_1_1_2_1_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_2_1_3_1_1.setLayout(null);
		panel_1_1_2_1_3_1_1.setPreferredSize(new Dimension(800, 102));
		add(panel_1_1_2_1_3_1_1);

		final JxPanel panel_7_1_2_1_1_4_1_1 = new JxPanel();
		panel_7_1_2_1_1_4_1_1.setTheme(theme);
		panel_7_1_2_1_1_4_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_7_1_2_1_1_4_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2_1_1_4_1_1.setLayout(null);
		panel_7_1_2_1_1_4_1_1.setBounds(0, -1, 800, 22);
		panel_1_1_2_1_3_1_1.add(panel_7_1_2_1_1_4_1_1);

		final JxLabel cancerLabel_1_4_1_1 = new JxLabel();
		cancerLabel_1_4_1_1.setTheme(theme);

		cancerLabel_1_4_1_1.setFontSize(12);
		cancerLabel_1_4_1_1.setFontStyle(Font.BOLD);
		cancerLabel_1_4_1_1.setText("Musculoskeletal");
		cancerLabel_1_4_1_1.setBounds(54, 5, 378, 14);
		panel_7_1_2_1_1_4_1_1.add(cancerLabel_1_4_1_1);

		final JxPanel panel_6_1_2_1_4_1_1 = new JxPanel();
		panel_6_1_2_1_4_1_1.setTheme(theme);
		panel_6_1_2_1_4_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_2_1_4_1_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_11 = new FlowLayout();
		flowLayout_11.setVgap(8);
		panel_6_1_2_1_4_1_1.setLayout(flowLayout_11);
		panel_6_1_2_1_4_1_1.setBounds(0, -1, 48, 24);
		panel_7_1_2_1_1_4_1_1.add(panel_6_1_2_1_4_1_1);

		final JxPanel panel_7_1_2_1_1_1_3_1_1 = new JxPanel();
		panel_7_1_2_1_1_1_3_1_1.setTheme(theme);

		panel_7_1_2_1_1_1_3_1_1.setLayout(null);
		panel_7_1_2_1_1_1_3_1_1.setBounds(48, 21, 742, 80);
		panel_1_1_2_1_3_1_1.add(panel_7_1_2_1_1_1_3_1_1);

		final JxLabel cancerLabel_1_1_10_1_1 = new JxLabel();
		cancerLabel_1_1_10_1_1.setTheme(theme);
		cancerLabel_1_1_10_1_1
				.setText("<html><b>13700. Arthiritis</b>(eg degenerative joint disease(DJD), osteoarthritis , and rhematoid arthritis (RA))");
		cancerLabel_1_1_10_1_1.setBounds(10, 2, 694, 14);
		panel_7_1_2_1_1_1_3_1_1.add(cancerLabel_1_1_10_1_1);

		final JxLabel cancerLabel_1_1_1_3_1_1 = new JxLabel();
		cancerLabel_1_1_1_3_1_1.setTheme(theme);
		cancerLabel_1_1_1_3_1_1.setText("<html><b>13800 Osteoporosis");
		cancerLabel_1_1_1_3_1_1.setBounds(10, 20, 479, 14);
		panel_7_1_2_1_1_1_3_1_1.add(cancerLabel_1_1_1_3_1_1);

		final JxLabel cancerLabel_1_1_2_3_1_1 = new JxLabel();
		cancerLabel_1_1_2_3_1_1.setTheme(theme);
		cancerLabel_1_1_2_3_1_1
				.setText("<html><b>13900.Hip Fracture - </b> any fracture that has a relationship to current status , treatments , monitoring");
		cancerLabel_1_1_2_3_1_1.setBounds(10, 40, 717, 14);
		panel_7_1_2_1_1_1_3_1_1.add(cancerLabel_1_1_2_3_1_1);

		final JxLabel cancerLabel_1_1_3_2_1_1 = new JxLabel();
		cancerLabel_1_1_3_2_1_1.setTheme(theme);
		cancerLabel_1_1_3_2_1_1.setText("<html><b>14000.  Other Fractures");
		cancerLabel_1_1_3_2_1_1.setBounds(10, 60, 609, 14);
		panel_7_1_2_1_1_1_3_1_1.add(cancerLabel_1_1_3_2_1_1);

		final JxPanel panel_6_1_2_1_1_3_1_1 = new JxPanel();
		panel_6_1_2_1_1_3_1_1.setTheme(theme);
		panel_6_1_2_1_1_3_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_2_1_1_3_1_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		panel_6_1_2_1_1_3_1_1.setLayout(null);
		panel_6_1_2_1_1_3_1_1.setBounds(0, 21, 48, 81);
		panel_1_1_2_1_3_1_1.add(panel_6_1_2_1_1_3_1_1);

		final JxCheckBox checkBox_10_1_1 = new JxCheckBox();
		checkBox_10_1_1.setTheme(theme);

		checkBox_10_1_1.setText("New JxCheckBox");
		checkBox_10_1_1.setBounds(20, 2, 15, 15);
		panel_6_1_2_1_1_3_1_1.add(checkBox_10_1_1);

		final JxCheckBox checkBox_1_3_1_1 = new JxCheckBox();
		checkBox_1_3_1_1.setTheme(theme);

		checkBox_1_3_1_1.setText("New JxCheckBox");
		checkBox_1_3_1_1.setBounds(20, 20, 15, 15);
		panel_6_1_2_1_1_3_1_1.add(checkBox_1_3_1_1);

		final JxCheckBox checkBox_2_3_1_1 = new JxCheckBox();
		checkBox_2_3_1_1.setTheme(theme);

		checkBox_2_3_1_1.setText("New JxCheckBox");
		checkBox_2_3_1_1.setBounds(20, 40, 15, 15);
		panel_6_1_2_1_1_3_1_1.add(checkBox_2_3_1_1);

		final JxCheckBox checkBox_4_1_1_1 = new JxCheckBox();
		checkBox_4_1_1_1.setTheme(theme);

		checkBox_4_1_1_1.setText("New JxCheckBox");
		checkBox_4_1_1_1.setBounds(20, 61, 15, 15);
		panel_6_1_2_1_1_3_1_1.add(checkBox_4_1_1_1);

		final JxPanel panel_1_1_2_1_3_1_2 = new JxPanel();
		panel_1_1_2_1_3_1_2.setTheme(theme);

		panel_1_1_2_1_3_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_2_1_3_1_2.setLayout(null);
		panel_1_1_2_1_3_1_2.setPreferredSize(new Dimension(800, 125));
		add(panel_1_1_2_1_3_1_2);

		final JxPanel panel_7_1_2_1_1_4_1_2 = new JxPanel();
		panel_7_1_2_1_1_4_1_2.setTheme(theme);
		panel_7_1_2_1_1_4_1_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_7_1_2_1_1_4_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2_1_1_4_1_2.setLayout(null);
		panel_7_1_2_1_1_4_1_2.setBounds(0, -1, 800, 23);
		panel_1_1_2_1_3_1_2.add(panel_7_1_2_1_1_4_1_2);

		final JxLabel cancerLabel_1_4_1_2 = new JxLabel();
		cancerLabel_1_4_1_2.setTheme(theme);

		cancerLabel_1_4_1_2.setFontSize(12);
		cancerLabel_1_4_1_2.setFontStyle(Font.BOLD);
		cancerLabel_1_4_1_2.setText("Neurological");
		cancerLabel_1_4_1_2.setBounds(54, 5, 378, 14);
		panel_7_1_2_1_1_4_1_2.add(cancerLabel_1_4_1_2);

		final JxPanel panel_6_1_2_1_4_1_2 = new JxPanel();
		panel_6_1_2_1_4_1_2.setTheme(theme);
		panel_6_1_2_1_4_1_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_2_1_4_1_2.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_12 = new FlowLayout();
		flowLayout_12.setVgap(8);
		panel_6_1_2_1_4_1_2.setLayout(flowLayout_12);
		panel_6_1_2_1_4_1_2.setBounds(0, -1, 48, 24);
		panel_7_1_2_1_1_4_1_2.add(panel_6_1_2_1_4_1_2);

		final JxPanel panel_7_1_2_1_1_1_3_1_2 = new JxPanel();
		panel_7_1_2_1_1_1_3_1_2.setTheme(theme);

		panel_7_1_2_1_1_1_3_1_2.setLayout(null);
		panel_7_1_2_1_1_1_3_1_2.setBounds(48, 21, 742, 101);
		panel_1_1_2_1_3_1_2.add(panel_7_1_2_1_1_1_3_1_2);

		final JxLabel cancerLabel_1_1_10_1_2 = new JxLabel();
		cancerLabel_1_1_10_1_2.setTheme(theme);
		cancerLabel_1_1_10_1_2.setText("<html><b>14200. Alzheimer's Disease");
		cancerLabel_1_1_10_1_2.setBounds(10, 2, 479, 14);
		panel_7_1_2_1_1_1_3_1_2.add(cancerLabel_1_1_10_1_2);

		final JxLabel cancerLabel_1_1_1_3_1_2 = new JxLabel();
		cancerLabel_1_1_1_3_1_2.setTheme(theme);
		cancerLabel_1_1_1_3_1_2.setText("<html><b>14300. Aphasia");
		cancerLabel_1_1_1_3_1_2.setBounds(10, 18, 479, 14);
		panel_7_1_2_1_1_1_3_1_2.add(cancerLabel_1_1_1_3_1_2);

		final JxLabel cancerLabel_1_1_2_3_1_2 = new JxLabel();
		cancerLabel_1_1_2_3_1_2.setTheme(theme);
		cancerLabel_1_1_2_3_1_2.setText("<html><b>14400. Cerebral Palsy");
		cancerLabel_1_1_2_3_1_2.setBounds(10, 36, 737, 14);
		panel_7_1_2_1_1_1_3_1_2.add(cancerLabel_1_1_2_3_1_2);

		final JxLabel cancerLabel_1_1_3_2_1_2 = new JxLabel();
		cancerLabel_1_1_3_2_1_2.setTheme(theme);
		cancerLabel_1_1_3_2_1_2
				.setText("<html><b>14500. Cerebrovascular Accident(CVA), Transient Ischemic Attack (TIA), or Stroke");
		cancerLabel_1_1_3_2_1_2.setBounds(10, 55, 609, 14);
		panel_7_1_2_1_1_1_3_1_2.add(cancerLabel_1_1_3_2_1_2);

		final JxLabel cancerLabel_1_1_4_1_1_1 = new JxLabel();
		cancerLabel_1_1_4_1_1_1.setTheme(theme);
		cancerLabel_1_1_4_1_1_1
				.setText("<html><b>14800. Dementia</b> (eg) Non - Alzheimer's dematia such as vascular or multi - infract demantia; mixed dementialfrontemporal demantia<br> such as Pick's Disease ; and demantia related to stroke, pakinson's or creutzfeldt-jakob disease");
		cancerLabel_1_1_4_1_1_1.setBounds(10, 75, 732, 25);
		panel_7_1_2_1_1_1_3_1_2.add(cancerLabel_1_1_4_1_1_1);

		final JxPanel panel_6_1_2_1_1_3_1_2 = new JxPanel();
		panel_6_1_2_1_1_3_1_2.setTheme(theme);
		panel_6_1_2_1_1_3_1_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_2_1_1_3_1_2.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		panel_6_1_2_1_1_3_1_2.setLayout(null);
		panel_6_1_2_1_1_3_1_2.setBounds(0, 21, 48, 104);
		panel_1_1_2_1_3_1_2.add(panel_6_1_2_1_1_3_1_2);

		final JxCheckBox checkBox_10_1_2 = new JxCheckBox();
		checkBox_10_1_2.setTheme(theme);

		checkBox_10_1_2.setText("New JxCheckBox");
		checkBox_10_1_2.setBounds(20, 2, 15, 15);
		panel_6_1_2_1_1_3_1_2.add(checkBox_10_1_2);

		final JxCheckBox checkBox_1_3_1_2 = new JxCheckBox();
		checkBox_1_3_1_2.setTheme(theme);

		checkBox_1_3_1_2.setText("New JxCheckBox");
		checkBox_1_3_1_2.setBounds(20, 20, 15, 15);
		panel_6_1_2_1_1_3_1_2.add(checkBox_1_3_1_2);

		final JxCheckBox checkBox_2_3_1_2 = new JxCheckBox();
		checkBox_2_3_1_2.setTheme(theme);

		checkBox_2_3_1_2.setText("New JxCheckBox");
		checkBox_2_3_1_2.setBounds(20, 40, 15, 15);
		panel_6_1_2_1_1_3_1_2.add(checkBox_2_3_1_2);

		final JxCheckBox checkBox_3_2_1_1 = new JxCheckBox();
		checkBox_3_2_1_1.setTheme(theme);

		checkBox_3_2_1_1.setText("New JxCheckBox");
		checkBox_3_2_1_1.setBounds(20, 59, 15, 15);
		panel_6_1_2_1_1_3_1_2.add(checkBox_3_2_1_1);

		final JxCheckBox checkBox_4_1_1_2 = new JxCheckBox();
		checkBox_4_1_1_2.setTheme(theme);

		checkBox_4_1_1_2.setText("New JxCheckBox");
		checkBox_4_1_1_2.setBounds(20, 80, 15, 15);
		panel_6_1_2_1_1_3_1_2.add(checkBox_4_1_1_2);

		final JxPanel panel_7_1_2_1_1_4_1_2_1 = new JxPanel();
		panel_7_1_2_1_1_4_1_2_1.setTheme(theme);
		panel_7_1_2_1_1_4_1_2_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_7_1_2_1_1_4_1_2_1.setPreferredSize(new Dimension(800, 25));
		panel_7_1_2_1_1_4_1_2_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2_1_1_4_1_2_1.setLayout(null);
		add(panel_7_1_2_1_1_4_1_2_1);

		final JxLabel cancerLabel_1_4_1_2_1 = new JxLabel();
		cancerLabel_1_4_1_2_1.setTheme(theme);

		cancerLabel_1_4_1_2_1.setFontSize(12);
		cancerLabel_1_4_1_2_1.setFontStyle(Font.BOLD);
		cancerLabel_1_4_1_2_1
				.setText("Neurological Diagnosis continued on next page");
		cancerLabel_1_4_1_2_1.setBounds(54, 5, 378, 14);
		panel_7_1_2_1_1_4_1_2_1.add(cancerLabel_1_4_1_2_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_1
				.setForeground(ColorConstants.MDS_FONT_COLOR);

		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_1.setFontSize(14);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_1
				.setPreferredSize(new Dimension(800, 30));
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_1
				.setText("MDS 3.0 Nursing Home Comprehensive (NC) Version 1.00.2 10/01/2010");
		add(aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_1);
	}

	public static void main(String ar[]) {
		try {
			UIManager
					.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JScrollPane scroller = new JScrollPane();
		PanelMDS3Page17 panel = new PanelMDS3Page17();
		scroller.setViewportView(panel);
		JFrame frm = new JFrame("Frame");
		frm.setSize(new Dimension(java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize()));
		frm.add(scroller);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setState(JFrame.MAXIMIZED_BOTH);
		frm.setVisible(true);

		// SwingUtils.openInDialogforJxPanel().setVisible(true);
	}

	@Override
	public void doSave() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doUpdate() {
		// TODO Auto-generated method stub

	}

}
