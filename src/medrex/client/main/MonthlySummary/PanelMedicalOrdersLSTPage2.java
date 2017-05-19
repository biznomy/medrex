package medrex.client.main.MonthlySummary;

import java.awt.Color;
import java.awt.Dimension;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.intf.Form;
import medrex.commons.vo.resident.ResidentMain;

import com.lowagie.text.Font;
import com.sX.swing.JxCheckBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelMedicalOrdersLSTPage2 extends JxPanel implements Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5377304598904336982L;
	private JxLabel datetimeJxLabel;
	private JxLabel printPhysicianNameJxLabel;
	private JxLabel physicianSignatureJxLabel;
	private JxText jxText_5_1;
	private JxText jxText_5;
	private JxText jxText_2;
	private JxLabel physicianSigJxLabel;
	private JxCheckBox jxCheckBox_12_5;
	private JxCheckBox jxCheckBox_12_2;
	private JxCheckBox jxCheckBox_12_4;
	private JxCheckBox jxCheckBox_12_1;
	private JxCheckBox jxCheckBox_12_3;
	private JxCheckBox jxCheckBox_12;
	private JxLabel whoMadeTheJxLabel;
	private JxLabel printSecondWitnessJxLabel;
	private JxText jxText_4;
	private JxLabel printFirstWitnessJxLabel;
	private JxText jxText_3_1;
	private JxLabel printNameOfJxLabel;
	private JxText jxText_3;
	private JxLabel jxLabel_16;
	private JxText jxText_1;
	private JxLabel jxLabel_15;
	private JxCheckBox jxCheckBox_11;
	private JxText jxText;
	private JxLabel jxLabel_14;
	private JxLabel jxLabel_13;
	private JxLabel checkOneJxLabel_1;
	private JxLabel antibioticsJxLabel_1;
	private JxLabel jxLabel_12;
	private JxCheckBox jxCheckBox_10_7;
	private JxCheckBox jxCheckBox_10_6;
	private JxLabel jxLabel_10;
	private JxCheckBox jxCheckBox_10_5;
	private JxLabel checkOneJxLabel;
	private JxLabel antibioticsJxLabel;
	private JxCheckBox jxCheckBox_10_3;
	private JxCheckBox jxCheckBox_10_2;
	private JxCheckBox jxCheckBox_10_4;
	private JxCheckBox jxCheckBox_10_1;
	private JxCheckBox jxCheckBox_10;
	private JxLabel jxLabel_9;
	private JxLabel datetimeJxLabel_1;
	private JxLabel lblDOB;
	private JxCheckBox jxCheckBox_9;
	private JxCheckBox jxCheckBox_8;
	private JxLabel jxLabel_7;
	private JxLabel jxLabel_5;
	private JxCheckBox jxCheckBox_7;
	private JxCheckBox jxCheckBox_6;
	private JxCheckBox jxCheckBox_5;
	private JxCheckBox jxCheckBox_4;
	private JxLabel jxLabel_4;
	private JxCheckBox jxCheckBox_2;
	private JxCheckBox jxCheckBox_1;
	private JxLabel jxLabel_3;
	private JxLabel jxLabel_2;
	private JxLabel lblResuscitationInstructions;
	private JxLabel lblSectionA;
	private JxLabel lastNameJxLabel_2;
	private JxLabel lastNameJxLabel_1;
	private JxLabel lastNameJxLabel;
	private JxLabel jxLabel_18_2;
	private JxLabel lblFirstName;
	private JxLabel lblLastName;
	Theme theme = new BlackOverWhiteTheme();

	private PanelToBeAddedDynamically[] rows;

	public PanelMedicalOrdersLSTPage2() {
		super();
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(930, 1200));
		setLayout(null);

		final JxPanel jxPanel = new JxPanel();
		jxPanel.setTheme(theme);
		jxPanel.setBackground(Color.WHITE);
		jxPanel.setLayout(null);
		jxPanel.setBounds(0, 0, 930, 1200);
		add(jxPanel);

		final JxPanel jxPanel_1 = new JxPanel();
		jxPanel_1.setTheme(theme);
		jxPanel_1.setBackground(Color.WHITE);
		jxPanel_1.setBorder(new LineBorder(Color.black, 1, false));
		jxPanel_1.setLayout(null);
		jxPanel_1.setBounds(0, 0, 930, 74);
		jxPanel.add(jxPanel_1);

		final JxPanel jxPanel_2 = new JxPanel();
		// jxPanel_2.setTheme(null);
		jxPanel_2.setBackground(Color.WHITE);
		jxPanel_2.setLayout(null);
		jxPanel_2.setBounds(0, 0, 930, 31);
		jxPanel_1.add(jxPanel_2);

		final JxPanel jxPanel_14 = new JxPanel();
		// jxPanel_14.setTheme(null);
		jxPanel_14.setBackground(Color.BLACK);
		jxPanel_14.setLayout(null);
		jxPanel_14.setBounds(0, 0, 930, 31);
		jxPanel_2.add(jxPanel_14);

		final JxLabel jxLabel = new JxLabel();
		jxLabel.setTheme(theme);
		jxLabel.setFontSize(12);
		jxLabel.setFontStyle(Font.BOLD);
		jxLabel.setForeground(new Color(255, 255, 255));
		jxLabel.setBackground(Color.BLACK);
		jxLabel
				.setText("THE PATIENT KEEPS THE ORIGIONAL MOLST FROM DURING TRAVEL TO DIFFERENT CARE SETTINGS.THE PHYSICIAN KEEPS A COPY.");
		jxLabel.setBounds(0, 10, 930, 14);
		jxPanel_14.add(jxLabel);

		lastNameJxLabel = new JxLabel();
		lastNameJxLabel.setTheme(theme);
		lastNameJxLabel.setText("LAST NAME");
		lastNameJxLabel.setBounds(2, 56, 100, 11);
		jxPanel_1.add(lastNameJxLabel);

		lastNameJxLabel_1 = new JxLabel();
		lastNameJxLabel_1.setTheme(theme);
		lastNameJxLabel_1.setText("FIRST NAME");
		lastNameJxLabel_1.setBounds(150, 56, 100, 14);
		jxPanel_1.add(lastNameJxLabel_1);

		lastNameJxLabel_2 = new JxLabel();
		lastNameJxLabel_2.setTheme(theme);
		lastNameJxLabel_2.setText("MIDDLE INITIAL OF PATIENT");
		lastNameJxLabel_2.setBounds(300, 56, 150, 14);
		jxPanel_1.add(lastNameJxLabel_2);

		final JxLabel jxLabel_1 = new JxLabel();
		jxLabel_1.setText("DATE OF BIRTH(MM/DD/YYYY)");
		jxLabel_1.setBounds(702, 76, 171, 20);
		jxPanel_1.add(jxLabel_1);

		lblLastName = new JxLabel();
		lblLastName.setTheme(theme);
		lblLastName.setFontStyle(Font.BOLD);
		lblLastName.setText("");
		lblLastName.setBounds(2, 30, 100, 11);
		jxPanel_1.add(lblLastName);

		lblFirstName = new JxLabel();
		lblFirstName.setTheme(theme);
		lblFirstName.setFontStyle(Font.BOLD);
		lblFirstName.setText("");
		lblFirstName.setBounds(150, 30, 100, 11);
		jxPanel_1.add(lblFirstName);

		jxLabel_18_2 = new JxLabel();
		// jxLabel_18_2.setTheme(null);
		jxLabel_18_2.setTheme(theme);
		jxLabel_18_2.setText("");
		jxLabel_18_2.setBounds(300, 30, 150, 11);
		jxPanel_1.add(jxLabel_18_2);

		datetimeJxLabel_1 = new JxLabel();
		datetimeJxLabel_1.setTheme(theme);
		datetimeJxLabel_1.setText("DATE OF BIRTH (MM/DD/YYYY)");
		datetimeJxLabel_1.setBounds(750, 54, 159, 14);
		jxPanel_1.add(datetimeJxLabel_1);

		lblDOB = new JxLabel();
		lblDOB.setTheme(theme);
		lblDOB.setFontStyle(Font.BOLD);
		lblDOB.setText("");
		lblDOB.setBounds(750, 28, 107, 14);
		jxPanel_1.add(lblDOB);

		jxLabel_2 = new JxLabel();
		jxLabel_2.setTheme(theme);
		jxLabel_2.setVerticalAlignment(SwingConstants.TOP);
		jxLabel_2
				.setText("<html><body>Life-sustaining treatment may be ordered for a trial period to determine if there if benifit to the patient.If a Life-sustaining treatnent is started,but turns"
						+ ""
						+ "<br"
						+ "out not to be helpful,the treatment can be stopped></body></html> ");
		jxLabel_2.setBounds(0, 112, 930, 14);
		jxPanel.add(jxLabel_2);

		final JxPanel jxPanel_6 = new JxPanel();
		jxPanel_6.setTheme(theme);
		jxPanel_6.setLayout(null);
		jxPanel_6.setBackground(Color.WHITE);
		jxPanel_6.setBounds(0, 143, 930, 133);
		jxPanel.add(jxPanel_6);

		jxLabel_3 = new JxLabel();
		jxLabel_3.setTheme(theme);
		jxLabel_3.setBounds(0, 0, 930, 32);
		jxLabel_3
				.setText("<html><body><b>Treatment Guidelines</b> No matter what else is chosen,the patient will be treated with dignity and respect,and health care providers will offer<br> comfort measure.<i>Check <u> one</u></i><body></html>");
		jxPanel_6.add(jxLabel_3);

		final JxCheckBox jxCheckBox = new JxCheckBox();
		jxCheckBox.setTheme(theme);
		jxCheckBox.setBackground(Color.WHITE);
		jxCheckBox
				.setText("<html><body><b>Comfort measure only </b> Comfort measure are medical care and treatment provided with the parimary goal of releving pain and others symptoms amd"
						+ "<br> reducing suffering.Reasonable measure will be made to offer food abd fluids by mouth.medication,tuning in bed,wound care and others measure"
						+ "<br> will be used to relive pain and suffering.oxygen,suctioning and manual treatment of airway obstruction will be used as needed for comfort.");
		jxCheckBox.setBounds(0, 35, 905, 39);
		jxPanel_6.add(jxCheckBox);

		jxCheckBox_1 = new JxCheckBox();
		jxCheckBox_1.setTheme(theme);
		jxCheckBox_1.setBackground(Color.WHITE);
		jxCheckBox_1
				.setText("<html><body><b>Limited medical interventions</b> The patient will receive medication by mouth or through a vein,heart monitoring and all others necessary treatment,<br> based on MOLST orders.");
		jxCheckBox_1.setBounds(0, 80, 930, 32);
		jxPanel_6.add(jxCheckBox_1);

		jxCheckBox_2 = new JxCheckBox();
		jxCheckBox_2.setTheme(theme);
		jxCheckBox_2.setBackground(Color.WHITE);
		jxCheckBox_2
				.setText("<html><body><b>No limitations on medical onterventions</b> The patient will receive all needed treatment");
		jxCheckBox_2.setBounds(0, 111, 736, 18);
		jxPanel_6.add(jxCheckBox_2);

		final JxPanel jxLabel_6 = new JxPanel();
		jxLabel_6.setTheme(theme);
		jxLabel_6.setLayout(null);
		jxLabel_6.setBackground(Color.WHITE);
		jxLabel_6.setBounds(0, 288, 930, 169);
		jxPanel.add(jxLabel_6);

		jxLabel_4 = new JxLabel();
		jxLabel_4.setTheme(theme);
		jxLabel_4.setBounds(2, 2, 586, 23);
		jxLabel_6.add(jxLabel_4);
		jxLabel_4
				.setText("<html><body><b>Instructions for Intubation and Mechanical Ventilation</b><i> Check<u> one</u></i><body></html>");

		final JxCheckBox jxCheckBox_3 = new JxCheckBox();
		jxCheckBox_3.setTheme(theme);
		jxCheckBox_3.setBackground(Color.WHITE);
		jxCheckBox_3
				.setText("<html><body><b> Do not intubate(DNI)</b> Do not place a tube down the patient's throat or connev=ct to a breathing machine that pumps air into and out of lugs.Treatments"
						+ "<br> are available for symptoms of shortness of breath,such as oxygen and morphine.(This box should not be checked if full CPR is checked in Section A.)");
		jxCheckBox_3.setBounds(2, 23, 930, 38);
		jxLabel_6.add(jxCheckBox_3);

		jxCheckBox_4 = new JxCheckBox();
		jxCheckBox_4.setTheme(theme);
		jxCheckBox_4.setBackground(Color.WHITE);
		jxCheckBox_4
				.setText("<html><body> <b>A trial period</b> <i> Check one or both</i> ");
		jxCheckBox_4.setBounds(2, 67, 351, 18);
		jxLabel_6.add(jxCheckBox_4);

		jxCheckBox_5 = new JxCheckBox();
		jxCheckBox_5.setTheme(theme);
		jxCheckBox_5.setBackground(Color.WHITE);
		jxCheckBox_5
				.setText("<html><body><b> Intubation and mechanical ventilation");
		jxCheckBox_5.setBounds(33, 85, 696, 18);
		jxLabel_6.add(jxCheckBox_5);

		jxCheckBox_6 = new JxCheckBox();
		jxCheckBox_6.setTheme(theme);
		jxCheckBox_6.setBackground(Color.WHITE);
		jxCheckBox_6
				.setText("<html><body><b>Noninvasive ventilation(e.g. BIPAP),if the health care professional agrees that it is appropriate");
		jxCheckBox_6.setBounds(33, 108, 696, 18);
		jxLabel_6.add(jxCheckBox_6);

		jxCheckBox_7 = new JxCheckBox();
		jxCheckBox_7.setTheme(theme);
		jxCheckBox_7.setBackground(Color.WHITE);
		jxCheckBox_7
				.setText("<html><body><b>intubation and long-term mechanical vetilation,if needed</b>"
						+ "Place a tube down the patient's throat and conect to a breathing machine as long as <br> it is medically needed");
		jxCheckBox_7.setBounds(2, 132, 918, 35);
		jxLabel_6.add(jxCheckBox_7);

		final JxPanel jxPanel_7 = new JxPanel();
		jxPanel_7.setTheme(theme);
		jxPanel_7.setBackground(Color.WHITE);
		jxPanel_7.setLayout(null);
		jxPanel_7.setBounds(0, 471, 930, 67);
		jxPanel.add(jxPanel_7);

		jxLabel_5 = new JxLabel();
		jxLabel_5.setTheme(theme);
		jxLabel_5.setText("Future Hospitalization/Transfer");
		jxLabel_5.setFontStyle(Font.BOLD);
		jxLabel_5.setBounds(0, 0, 187, 20);
		jxPanel_7.add(jxLabel_5);

		jxCheckBox_8 = new JxCheckBox();
		jxCheckBox_8.setTheme(theme);
		jxCheckBox_8.setBackground(Color.WHITE);
		jxCheckBox_8.setFontStyle(Font.BOLD);
		jxCheckBox_8
				.setText("Don not send the hospital unless pain or severe symptoms cannot be otherwise controlled.");
		jxCheckBox_8.setBounds(0, 26, 723, 18);
		jxPanel_7.add(jxCheckBox_8);

		jxCheckBox_9 = new JxCheckBox();
		jxCheckBox_9.setTheme(theme);
		jxCheckBox_9.setBackground(Color.WHITE);
		jxCheckBox_9.setFontStyle(Font.BOLD);
		jxCheckBox_9
				.setText("Send to the hospital if, necessary, based on MOLST orders");
		jxCheckBox_9.setBounds(0, 49, 723, 18);
		jxPanel_7.add(jxCheckBox_9);

		jxLabel_7 = new JxLabel();
		jxLabel_7.setTheme(theme);
		jxLabel_7.setText("Check one:");
		jxLabel_7.setBounds(193, 3, 60, 14);
		jxPanel_7.add(jxLabel_7);

		final JxPanel jxPanel_8 = new JxPanel();
		jxPanel_8.setTheme(theme);
		jxPanel_8.setLayout(null);
		jxPanel_8.setBackground(Color.WHITE);
		jxPanel_8.setBounds(0, 558, 930, 124);
		jxPanel.add(jxPanel_8);

		jxLabel_9 = new JxLabel();
		jxLabel_9.setTheme(theme);
		jxLabel_9.setFontStyle(Font.BOLD);
		jxLabel_9.setText("Aritificially Administered Fluids and Nutrition");
		jxLabel_9.setBounds(0, 0, 260, 14);
		jxPanel_8.add(jxLabel_9);

		final JxLabel jxLabel_11 = new JxLabel();
		jxLabel_11.setTheme(theme);
		jxLabel_11.setVerticalAlignment(SwingConstants.TOP);
		jxLabel_11
				.setText("<html><p align=\"justify\"> When a patient can no longer eat or drink, liquid food or fluids can be givenby a tube inserted in the stomach or fluids can be given by samll plastic tube (catheter) inserted directely into the vain."
						+ "If a patient chooses not to have either a feeding tube or IV fluids, food and fluids are offered as tolarated using careful hnad feeding."
						+ "Check one each for feeding tube and IV fluids:</p>");
		jxLabel_11.setBounds(0, 14, 930, 31);
		jxPanel_8.add(jxLabel_11);

		jxCheckBox_10 = new JxCheckBox();
		jxCheckBox_10.setTheme(theme);
		jxCheckBox_10.setBackground(Color.WHITE);
		jxCheckBox_10.setText("No feeding tube");
		jxCheckBox_10.setBounds(10, 51, 100, 18);
		jxPanel_8.add(jxCheckBox_10);

		jxCheckBox_10_1 = new JxCheckBox();
		jxCheckBox_10_1.setTheme(theme);
		jxCheckBox_10_1.setBackground(Color.WHITE);
		jxCheckBox_10_1.setText("A trail period of feeding tube");
		jxCheckBox_10_1.setBounds(10, 75, 167, 18);
		jxPanel_8.add(jxCheckBox_10_1);

		jxCheckBox_10_2 = new JxCheckBox();
		jxCheckBox_10_2.setTheme(theme);
		jxCheckBox_10_2.setBackground(Color.WHITE);
		jxCheckBox_10_2.setText("No IV fluids");
		jxCheckBox_10_2.setBounds(213, 52, 100, 18);
		jxPanel_8.add(jxCheckBox_10_2);

		jxCheckBox_10_3 = new JxCheckBox();
		jxCheckBox_10_3.setTheme(theme);
		jxCheckBox_10_3.setBackground(Color.WHITE);
		jxCheckBox_10_3.setText("A trail perid of IV fluids");
		jxCheckBox_10_3.setBounds(213, 76, 146, 18);
		jxPanel_8.add(jxCheckBox_10_3);

		jxCheckBox_10_4 = new JxCheckBox();
		jxCheckBox_10_4.setTheme(theme);
		jxCheckBox_10_4.setBackground(Color.WHITE);
		jxCheckBox_10_4.setText("Long-term feeding tube; if needed");
		jxCheckBox_10_4.setBounds(10, 99, 199, 18);
		jxPanel_8.add(jxCheckBox_10_4);

		final JxPanel jxPanel_9 = new JxPanel();
		jxPanel_9.setTheme(theme);
		jxPanel_9.setLayout(null);
		jxPanel_9.setBackground(Color.WHITE);
		jxPanel_9.setBounds(0, 704, 930, 93);
		jxPanel.add(jxPanel_9);

		antibioticsJxLabel = new JxLabel();
		antibioticsJxLabel.setTheme(theme);
		antibioticsJxLabel.setFontStyle(1);
		antibioticsJxLabel.setText("Antibiotics");
		antibioticsJxLabel.setBounds(0, 0, 70, 20);
		jxPanel_9.add(antibioticsJxLabel);

		checkOneJxLabel = new JxLabel();
		checkOneJxLabel.setTheme(theme);
		checkOneJxLabel.setText("Check one:");
		checkOneJxLabel.setBounds(74, 4, 60, 14);
		jxPanel_9.add(checkOneJxLabel);

		jxCheckBox_10_5 = new JxCheckBox();
		jxCheckBox_10_5.setTheme(theme);
		jxCheckBox_10_5.setBackground(Color.WHITE);
		jxCheckBox_10_5.setFontStyle(Font.BOLD);
		jxCheckBox_10_5.setText("Do not use antibiotics.");
		jxCheckBox_10_5.setBounds(10, 24, 154, 18);
		jxPanel_9.add(jxCheckBox_10_5);

		jxCheckBox_10_6 = new JxCheckBox();
		jxCheckBox_10_6.setTheme(theme);
		jxCheckBox_10_6.setBackground(Color.WHITE);
		jxCheckBox_10_6.setFontStyle(Font.BOLD);
		jxCheckBox_10_6
				.setText("Determine use or limitation of antibiotics when infection occurs.");
		jxCheckBox_10_6.setBounds(10, 48, 392, 18);
		jxPanel_9.add(jxCheckBox_10_6);

		jxCheckBox_10_7 = new JxCheckBox();
		jxCheckBox_10_7.setTheme(theme);
		jxCheckBox_10_7.setBackground(Color.WHITE);
		jxCheckBox_10_7.setFontStyle(Font.BOLD);
		jxCheckBox_10_7.setText("Use antibiotics");
		jxCheckBox_10_7.setBounds(10, 72, 109, 18);
		jxPanel_9.add(jxCheckBox_10_7);

		jxLabel_10 = new JxLabel();
		jxLabel_10.setTheme(theme);
		jxLabel_10.setText("Use other comfort measuers to relieve symptoms.");
		jxLabel_10.setBounds(178, 26, 260, 14);
		jxPanel_9.add(jxLabel_10);

		jxLabel_12 = new JxLabel();
		jxLabel_12.setTheme(theme);
		jxLabel_12.setText("to treat infections, if medically indicated.");
		jxLabel_12.setBounds(125, 74, 344, 14);
		jxPanel_9.add(jxLabel_12);

		final JxPanel jxPanel_10 = new JxPanel();
		jxPanel_10.setTheme(theme);
		jxPanel_10.setLayout(null);
		jxPanel_10.setBackground(Color.WHITE);
		jxPanel_10.setBounds(0, 819, 930, 25);
		jxPanel.add(jxPanel_10);

		antibioticsJxLabel_1 = new JxLabel();
		antibioticsJxLabel_1.setTheme(theme);
		antibioticsJxLabel_1.setFontStyle(1);
		antibioticsJxLabel_1.setText("Other Instructions");
		antibioticsJxLabel_1.setBounds(0, 0, 115, 20);
		jxPanel_10.add(antibioticsJxLabel_1);

		checkOneJxLabel_1 = new JxLabel();
		checkOneJxLabel_1.setTheme(theme);
		checkOneJxLabel_1
				.setText("about starting or stopping treatements discussed with the doctor or about other tratements not listed above (dialysis, transfusions, etc.");
		checkOneJxLabel_1.setBounds(121, 4, 670, 14);
		jxPanel_10.add(checkOneJxLabel_1);

		final JxPanel jxPanel_11 = new JxPanel();
		jxPanel_11.setTheme(theme);
		jxPanel_11.setLayout(null);
		jxPanel_11.setBackground(Color.WHITE);
		jxPanel_11.setBounds(0, 866, 930, 193);
		jxPanel.add(jxPanel_11);

		jxLabel_13 = new JxLabel();
		jxLabel_13.setTheme(theme);
		jxLabel_13
				.setText("Consent for Life-Sustaining Treatment Orders (Section E)");
		jxLabel_13.setFontStyle(Font.BOLD);
		jxLabel_13.setBounds(0, 0, 327, 14);
		jxPanel_11.add(jxLabel_13);

		jxLabel_14 = new JxLabel();
		jxLabel_14.setTheme(theme);
		jxLabel_14
				.setText("(Same as Section B, which is the consent for Section A)");
		jxLabel_14.setBounds(347, 0, 273, 14);
		jxPanel_11.add(jxLabel_14);

		final JxPanel jxPanel_12 = new JxPanel();
		jxPanel_12.setTheme(theme);
		jxPanel_12.setLayout(null);
		jxPanel_12.setBackground(Color.WHITE);
		jxPanel_12.setBounds(0, 20, 930, 43);
		jxPanel_11.add(jxPanel_12);

		jxText = new JxText();
		jxText.setTheme(theme);
		jxText.setBounds(0, 0, 95, 21);
		jxPanel_12.add(jxText);

		jxLabel_15 = new JxLabel();
		jxLabel_15.setTheme(theme);
		jxLabel_15.setText("Signature");
		jxLabel_15.setBounds(0, 27, 95, 14);
		jxPanel_12.add(jxLabel_15);

		jxCheckBox_11 = new JxCheckBox();
		jxCheckBox_11.setTheme(theme);
		jxCheckBox_11.setTheme(theme);
		jxCheckBox_11.setTheme(theme);
		jxCheckBox_11.setBackground(Color.WHITE);
		jxCheckBox_11.setText("Check if Verval consent");
		jxCheckBox_11.setBounds(160, 10, 169, 18);
		jxPanel_12.add(jxCheckBox_11);

		jxText_1 = new JxText();
		jxText_1.setTheme(theme);
		jxText_1.setBounds(400, 0, 95, 21);
		jxPanel_12.add(jxText_1);

		jxLabel_16 = new JxLabel();
		jxLabel_16.setTheme(theme);
		jxLabel_16.setText("DATE/TIME");
		jxLabel_16.setBounds(400, 27, 60, 14);
		jxPanel_12.add(jxLabel_16);

		final JxPanel jxPanel_12_1 = new JxPanel();
		jxPanel_12_1.setTheme(theme);
		jxPanel_12_1.setLayout(null);
		jxPanel_12_1.setBackground(Color.WHITE);
		jxPanel_12_1.setBounds(0, 63, 930, 43);
		jxPanel_11.add(jxPanel_12_1);

		jxText_3 = new JxText();
		jxText_3.setTheme(theme);
		jxText_3.setBounds(0, 0, 95, 21);
		jxPanel_12_1.add(jxText_3);

		printNameOfJxLabel = new JxLabel();
		printNameOfJxLabel.setTheme(theme);
		printNameOfJxLabel.setText("PRINT NAME OF DECISION MAKER");
		printNameOfJxLabel.setBounds(0, 27, 176, 14);
		jxPanel_12_1.add(printNameOfJxLabel);

		final JxPanel jxPanel_12_2 = new JxPanel();
		jxPanel_12_2.setTheme(theme);
		jxPanel_12_2.setLayout(null);
		jxPanel_12_2.setBackground(Color.WHITE);
		jxPanel_12_2.setBounds(0, 106, 930, 43);
		jxPanel_11.add(jxPanel_12_2);

		jxText_3_1 = new JxText();
		jxText_3_1.setTheme(theme);
		jxText_3_1.setBounds(0, 0, 95, 21);
		jxPanel_12_2.add(jxText_3_1);

		printFirstWitnessJxLabel = new JxLabel();
		printFirstWitnessJxLabel.setTheme(theme);
		printFirstWitnessJxLabel.setText("PRINT FIRST WITNESS NAME");
		printFirstWitnessJxLabel.setBounds(0, 27, 152, 14);
		jxPanel_12_2.add(printFirstWitnessJxLabel);

		jxText_4 = new JxText();
		jxText_4.setTheme(theme);
		jxText_4.setBounds(400, 0, 95, 21);
		jxPanel_12_2.add(jxText_4);

		printSecondWitnessJxLabel = new JxLabel();
		printSecondWitnessJxLabel.setTheme(theme);
		printSecondWitnessJxLabel.setText("PRINT SECOND WITNESS NAME");
		printSecondWitnessJxLabel.setBounds(400, 27, 165, 14);
		jxPanel_12_2.add(printSecondWitnessJxLabel);

		whoMadeTheJxLabel = new JxLabel();
		whoMadeTheJxLabel.setTheme(theme);
		whoMadeTheJxLabel.setFontStyle(Font.BOLD);
		whoMadeTheJxLabel.setText("Who made the decision?");
		whoMadeTheJxLabel.setBounds(0, 149, 170, 14);
		jxPanel_11.add(whoMadeTheJxLabel);

		jxCheckBox_12 = new JxCheckBox();
		jxCheckBox_12.setTheme(theme);
		jxCheckBox_12.setBackground(Color.WHITE);
		jxCheckBox_12.setText("Patient");
		jxCheckBox_12.setBounds(231, 147, 100, 18);
		jxPanel_11.add(jxCheckBox_12);

		jxCheckBox_12_1 = new JxCheckBox();
		jxCheckBox_12_1.setTheme(theme);
		jxCheckBox_12_1.setBackground(Color.WHITE);
		jxCheckBox_12_1.setText("Health Care Agent");
		jxCheckBox_12_1.setBounds(412, 147, 124, 18);
		jxPanel_11.add(jxCheckBox_12_1);

		jxCheckBox_12_2 = new JxCheckBox();
		jxCheckBox_12_2.setTheme(theme);
		jxCheckBox_12_2.setBackground(Color.WHITE);
		jxCheckBox_12_2
				.setText("Based on clear and convincing evedence of patient's wishes");
		jxCheckBox_12_2.setBounds(576, 147, 313, 18);
		jxPanel_11.add(jxCheckBox_12_2);

		jxCheckBox_12_3 = new JxCheckBox();
		jxCheckBox_12_3.setTheme(theme);
		jxCheckBox_12_3.setBackground(Color.WHITE);
		jxCheckBox_12_3.setText("Public Health Law Surrogate");
		jxCheckBox_12_3.setBounds(231, 171, 163, 18);
		jxPanel_11.add(jxCheckBox_12_3);

		jxCheckBox_12_4 = new JxCheckBox();
		jxCheckBox_12_4.setTheme(theme);
		jxCheckBox_12_4.setTheme(theme);
		jxCheckBox_12_4.setBackground(Color.WHITE);
		jxCheckBox_12_4.setText("Minor's Parent/Guardian");
		jxCheckBox_12_4.setBounds(412, 171, 140, 18);
		jxPanel_11.add(jxCheckBox_12_4);

		jxCheckBox_12_5 = new JxCheckBox();
		jxCheckBox_12_5.setTheme(theme);
		jxCheckBox_12_5.setBackground(Color.WHITE);
		jxCheckBox_12_5.setText("1750-b Surrogate");
		jxCheckBox_12_5.setBounds(576, 171, 155, 18);
		jxPanel_11.add(jxCheckBox_12_5);

		final JxPanel jxPanel_13 = new JxPanel();
		jxPanel_13.setTheme(theme);
		jxPanel_13.setLayout(null);
		jxPanel_13.setBackground(Color.WHITE);
		jxPanel_13.setBounds(0, 1080, 930, 67);
		jxPanel.add(jxPanel_13);

		physicianSigJxLabel = new JxLabel();
		physicianSigJxLabel.setTheme(theme);
		physicianSigJxLabel.setFontStyle(Font.BOLD);
		physicianSigJxLabel.setText("Physician Signature for Section E");
		physicianSigJxLabel.setBounds(0, 0, 215, 14);
		jxPanel_13.add(physicianSigJxLabel);

		jxText_2 = new JxText();
		jxText_2.setTheme(theme);
		jxText_2.setBounds(0, 20, 63, 21);
		jxPanel_13.add(jxText_2);

		physicianSignatureJxLabel = new JxLabel();
		physicianSignatureJxLabel.setTheme(theme);
		physicianSignatureJxLabel.setText("PHYSICIAN SIGNATURE");
		physicianSignatureJxLabel.setBounds(0, 53, 125, 14);
		jxPanel_13.add(physicianSignatureJxLabel);

		jxText_5 = new JxText();
		jxText_5.setTheme(theme);
		jxText_5.setBounds(140, 20, 63, 21);
		jxPanel_13.add(jxText_5);

		jxText_5_1 = new JxText();
		jxText_5_1.setTheme(theme);
		jxText_5_1.setBounds(284, 20, 63, 21);
		jxPanel_13.add(jxText_5_1);

		printPhysicianNameJxLabel = new JxLabel();
		printPhysicianNameJxLabel.setTheme(theme);
		printPhysicianNameJxLabel.setText("PRINT PHYSICIAN NAME");
		printPhysicianNameJxLabel.setBounds(140, 54, 125, 14);
		jxPanel_13.add(printPhysicianNameJxLabel);

		datetimeJxLabel = new JxLabel();
		datetimeJxLabel.setTheme(theme);
		datetimeJxLabel.setText("DATE/TIME");
		datetimeJxLabel.setBounds(287, 54, 60, 14);
		jxPanel_13.add(datetimeJxLabel);

		final JxPanel panel_2 = new JxPanel();
		// panel_2.setTheme(null);
		panel_2.setLayout(null);
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(0, 73, 930, 10);
		jxPanel.add(panel_2);

		final JxPanel jxPanel_4 = new JxPanel();
		// jxPanel_4.setTheme(null);
		jxPanel_4.setLayout(null);
		jxPanel_4.setBackground(Color.BLACK);
		jxPanel_4.setBounds(0, 82, 100, 30);
		jxPanel.add(jxPanel_4);

		lblSectionA = new JxLabel();
		lblSectionA.setTheme(theme);
		lblSectionA.setFontSize(14);
		lblSectionA.setForeground(new Color(255, 255, 255));
		lblSectionA.setText("SECTION E");
		lblSectionA.setBounds(0, 10, 86, 14);
		jxPanel_4.add(lblSectionA);

		final JxPanel jxPanel_5 = new JxPanel();
		jxPanel_5.setTheme(theme);
		jxPanel_5.setLayout(null);
		jxPanel_5.setBackground(UIManager.getColor("Button.shadow"));
		jxPanel_5.setBounds(100, 82, 830, 30);
		jxPanel.add(jxPanel_5);

		lblResuscitationInstructions = new JxLabel();
		lblResuscitationInstructions.setTheme(theme);
		lblResuscitationInstructions.setBounds(10, 5, 820, 17);
		lblResuscitationInstructions.setFontStyle(Font.BOLD);
		lblResuscitationInstructions.setFontSize(12);
		lblResuscitationInstructions
				.setText("Orders For Other Life Sustaining Treatement and Future Hospitalization When the Patient has a Pulse and the Patient is Breathing");
		jxPanel_5.add(lblResuscitationInstructions);

		final JxPanel panel_2_1 = new JxPanel();
		panel_2_1.setTheme(theme);
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(UIManager.getColor("Button.shadow"));
		panel_2_1.setBounds(0, 129, 930, 10);
		jxPanel.add(panel_2_1);

		final JxPanel panel_2_1_1 = new JxPanel();
		panel_2_1_1.setTheme(theme);
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBackground(UIManager.getColor("Button.shadow"));
		panel_2_1_1.setBounds(0, 277, 930, 10);
		jxPanel.add(panel_2_1_1);

		final JxPanel panel_2_1_1_1 = new JxPanel();
		panel_2_1_1_1.setTheme(theme);
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBackground(UIManager.getColor("Button.shadow"));
		panel_2_1_1_1.setBounds(0, 460, 930, 10);
		jxPanel.add(panel_2_1_1_1);

		final JxPanel panel_2_1_1_1_1 = new JxPanel();
		panel_2_1_1_1_1.setTheme(theme);
		panel_2_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1.setBackground(UIManager.getColor("Button.shadow"));
		panel_2_1_1_1_1.setBounds(0, 542, 930, 10);
		jxPanel.add(panel_2_1_1_1_1);

		final JxPanel panel_2_1_1_1_2 = new JxPanel();
		panel_2_1_1_1_2.setTheme(theme);
		panel_2_1_1_1_2.setLayout(null);
		panel_2_1_1_1_2.setBackground(UIManager.getColor("Button.shadow"));
		panel_2_1_1_1_2.setBounds(0, 688, 930, 10);
		jxPanel.add(panel_2_1_1_1_2);

		final JxPanel panel_2_1_1_1_2_1 = new JxPanel();
		panel_2_1_1_1_2_1.setTheme(theme);
		panel_2_1_1_1_2_1.setLayout(null);
		panel_2_1_1_1_2_1.setBackground(UIManager.getColor("Button.shadow"));
		panel_2_1_1_1_2_1.setBounds(0, 803, 930, 10);
		jxPanel.add(panel_2_1_1_1_2_1);

		final JxPanel panel_2_1_1_1_2_1_1 = new JxPanel();
		panel_2_1_1_1_2_1_1.setTheme(theme);
		panel_2_1_1_1_2_1_1.setLayout(null);
		panel_2_1_1_1_2_1_1.setBackground(UIManager.getColor("Button.shadow"));
		panel_2_1_1_1_2_1_1.setBounds(0, 850, 930, 10);
		jxPanel.add(panel_2_1_1_1_2_1_1);

		final JxPanel panel_2_1_1_1_2_1_1_1 = new JxPanel();
		panel_2_1_1_1_2_1_1_1.setTheme(theme);
		panel_2_1_1_1_2_1_1_1.setLayout(null);
		panel_2_1_1_1_2_1_1_1
				.setBackground(UIManager.getColor("Button.shadow"));
		panel_2_1_1_1_2_1_1_1.setBounds(0, 1065, 930, 10);
		jxPanel.add(panel_2_1_1_1_2_1_1_1);

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
		PanelMedicalOrdersLSTPage2 panel = new PanelMedicalOrdersLSTPage2();
		scroller.setViewportView(panel);
		JFrame frm = new JFrame("Frame");
		frm.setSize(new Dimension(java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize()));
		frm.add(scroller);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setState(JFrame.MAXIMIZED_BOTH);
		frm.setVisible(true);

		// SwingUtils.openInDialogforJPanel().setVisible(true);

	}

	@Override
	public void doLoad() {

	}

	@Override
	public int doSave() {

		return 0;
	}

	@Override
	public void doUpdate() {
		int resID = Global.currentResidenceKey;
		ResidentMain rm = null;

		try {
			rm = MedrexClientManager.getInstance().getResident(resID);
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		lblLastName.setText(rm.getUserPass());
		lblFirstName.setText(rm.getUserName());

		SimpleDateFormat sdf = new SimpleDateFormat();
		lblDOB.setText(sdf.format(rm.getDob()));

	}

	@Override
	public boolean doValidate() {

		return false;
	}

}
