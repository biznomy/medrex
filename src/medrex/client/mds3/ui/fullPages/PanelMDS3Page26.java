package medrex.client.mds3.ui.fullPages;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.mds3.general.Mds3SubSection;
import medrex.commons.enums.ColorConstants;

import com.toedter.calendar.JDateChooser;

public class PanelMDS3Page26 extends JPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4511293385938295395L;

	public PanelMDS3Page26() {
		super();
		setBorder(new LineBorder(Color.black, 1, false));
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(840, 1250));

		final JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 7, 840, 35);
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setPreferredSize(new Dimension(840, 35));
		add(panel_1);

		final JLabel residentLabel = new JLabel();
		residentLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		residentLabel.setText("Resident");
		residentLabel.setBounds(10, 9, 56, 16);
		panel_1.add(residentLabel);

		final JTextField txtresident = new JTextField();
		txtresident.setBounds(84, 8, 248, 20);
		panel_1.add(txtresident);

		final JLabel residentLabel_1 = new JLabel();
		residentLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		residentLabel_1.setText("Identifier");
		residentLabel_1.setBounds(354, 10, 56, 16);
		panel_1.add(residentLabel_1);

		final JTextField txtidentifier = new JTextField();
		txtidentifier.setBounds(429, 8, 213, 20);
		panel_1.add(txtidentifier);

		final JLabel residentLabel_1_1 = new JLabel();
		residentLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		residentLabel_1_1.setText("Date");
		residentLabel_1_1.setBounds(668, 10, 56, 16);
		panel_1.add(residentLabel_1_1);

		final JDateChooser dcDate = new JDateChooser();
		dcDate.setBackground(Color.WHITE);
		dcDate.setBounds(730, 8, 100, 22);
		panel_1.add(dcDate);

		final JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 47, 840, 25);
		panel_2.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel_2.setLayout(null);
		panel_2.setPreferredSize(new Dimension(840, 25));
		add(panel_2);

		final JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel_3.setBounds(3, 3, 231, 18);
		panel_2.add(panel_3);

		final JLabel sectionALabel = new JLabel();
		sectionALabel.setBounds(10, 2, 74, 19);
		sectionALabel.setForeground(Color.WHITE);
		sectionALabel.setFont(new Font("Arial", Font.BOLD, 16));
		sectionALabel.setText("Section N");
		panel_3.add(sectionALabel);

		final JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_4.setBounds(246, 2, 592, 21);
		panel_2.add(panel_4);

		final JLabel identificationInformationLabel = new JLabel();
		identificationInformationLabel.setBounds(5, 2, 92, 19);
		identificationInformationLabel
				.setForeground(ColorConstants.MDS_FONT_COLOR);
		identificationInformationLabel
				.setFont(new Font("Arial", Font.BOLD, 16));
		identificationInformationLabel
				.setHorizontalAlignment(SwingConstants.LEFT);
		identificationInformationLabel.setText("Medications");
		panel_4.add(identificationInformationLabel);

		final JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setLayout(null);
		panel_6.setBounds(0, 72, 840, 70);
		panel_6.setBackground(Color.WHITE);
		add(panel_6);

		final JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setLayout(null);
		panel.setBounds(0, 0, 840, 20);
		panel.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6.add(panel);

		final JLabel n0300injectionsLabel = new JLabel();
		n0300injectionsLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		n0300injectionsLabel.setText("N0300.Injection");
		n0300injectionsLabel.setBounds(10, 2, 200, 14);
		panel.add(n0300injectionsLabel);

		final JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 20, 80, 50);
		panel_6.add(panel_5);
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5.setLayout(null);

		final JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(20, 20, 35, 23);
		panel_5.add(comboBox);

		final JLabel enterDaysLabel = new JLabel();
		enterDaysLabel.setText("Enter Days");
		enterDaysLabel.setBounds(10, 0, 54, 14);
		panel_5.add(enterDaysLabel);

		final JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_14.setLayout(null);
		panel_14.setBounds(80, 20, 760, 50);
		panel_14.setBackground(Color.WHITE);
		panel_6.add(panel_14);

		final JLabel label = new JLabel();
		label
				.setText("<html><body><b> Record the number of days that injections of any type </b> were received during the last 7 days or since admission/<br> 7 days .If 0-->Skip to N0400,Medication received ");
		label.setBounds(10, 5, 750, 45);
		panel_14.add(label);

		final JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);
		panel_7.setBounds(0, 142, 840, 120);
		panel_7.setBackground(Color.WHITE);
		add(panel_7);

		final JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(Color.black, 1, false));
		panel_15.setLayout(null);
		panel_15.setBounds(0, 0, 840, 20);
		panel_15.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_7.add(panel_15);

		final JLabel n0300injectionsLabel_1 = new JLabel();
		n0300injectionsLabel_1.setBounds(35, 0, 120, 20);
		panel_15.add(n0300injectionsLabel_1);
		n0300injectionsLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		n0300injectionsLabel_1.setText("N0350. Insulin");

		final JPanel panel_8 = new JPanel();
		panel_8.setBounds(0, 20, 80, 100);
		panel_7.add(panel_8);
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_8.setLayout(null);

		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(20, 20, 35, 23);
		panel_8.add(comboBox_1);

		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setBounds(20, 65, 35, 23);
		panel_8.add(comboBox_2);

		final JLabel enterDaysLabel_1 = new JLabel();
		enterDaysLabel_1.setText("Enter Days ");
		enterDaysLabel_1.setBounds(10, 47, 70, 14);
		panel_8.add(enterDaysLabel_1);

		final JLabel enterDaysLabel_2 = new JLabel();
		enterDaysLabel_2.setText("Enter Days ");
		enterDaysLabel_2.setBounds(10, 0, 70, 14);
		panel_8.add(enterDaysLabel_2);

		final JPanel panel_9 = new JPanel();
		panel_9.setBounds(80, 20, 760, 100);
		panel_7.add(panel_9);
		panel_9.setLayout(null);
		panel_9.setBorder(new LineBorder(Color.black, 1, false));

		final JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setLayout(null);
		panel_10.setBounds(0, 0, 760, 50);
		panel_10.setBackground(Color.WHITE);
		panel_9.add(panel_10);

		final JLabel label_1 = new JLabel();
		label_1
				.setText("<html><body><b> A. Insulin injections -Record the number of days that insulin injections </b> were received during the last 7 days or since admission/<br> &nbsp &nbsp reenry if less than 7 days ");
		label_1.setBounds(10, 5, 750, 45);
		panel_10.add(label_1);

		final JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_11.setBounds(0, 50, 760, 50);
		panel_11.setBackground(Color.WHITE);
		panel_9.add(panel_11);

		final JLabel label_2 = new JLabel();
		label_2.setBounds(10, 5, 750, 45);
		label_2
				.setText("<html><body><b> B. Order for insulin -Record the number of days the physician (or authorized assistant or practitioner)changed the resident's <br> &nbsp &nbsp insulin orders </b> during the last 7 days or since admission /reentry if less than 7 days");
		panel_11.add(label_2);

		final JPanel panel_7_1 = new JPanel();
		panel_7_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1.setLayout(null);
		panel_7_1.setBounds(0, 262, 840, 240);
		panel_7_1.setBackground(Color.WHITE);
		add(panel_7_1);

		final JPanel panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(Color.black, 1, false));
		panel_16.setLayout(null);
		panel_16.setBounds(0, 0, 840, 20);
		panel_16.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_7_1.add(panel_16);

		final JLabel n0300injectionsLabel_1_1 = new JLabel();
		n0300injectionsLabel_1_1.setBounds(22, 0, 387, 20);
		panel_16.add(n0300injectionsLabel_1_1);
		n0300injectionsLabel_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		n0300injectionsLabel_1_1.setText("N0400.Medications Received");

		final JPanel panel_7_2 = new JPanel();
		panel_7_2.setBounds(0, 20, 840, 20);
		panel_7_1.add(panel_7_2);
		panel_7_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2.setBackground(Color.WHITE);
		panel_7_2.setLayout(null);

		final JLabel n0300injectionsLabel_1_2 = new JLabel();
		n0300injectionsLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		n0300injectionsLabel_1_2
				.setText("Check all medications the resident received at any time during the last7 days or since admission/reentry if less than 7 days ");
		n0300injectionsLabel_1_2.setBounds(45, 2, 750, 14);
		panel_7_2.add(n0300injectionsLabel_1_2);

		final JPanel panel_12 = new JPanel();
		panel_12.setBounds(0, 40, 80, 200);
		panel_7_1.add(panel_12);
		panel_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_12.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_12.setLayout(null);

		final JCheckBox checkBox = new JCheckBox();
		checkBox.setBackground(Color.WHITE);
		checkBox.setText("New JCheckBox");
		checkBox.setBounds(30, 5, 15, 15);
		panel_12.add(checkBox);

		final JCheckBox checkBox_1 = new JCheckBox();
		checkBox_1.setBackground(Color.WHITE);
		checkBox_1.setText("New JCheckBox");
		checkBox_1.setBounds(30, 30, 15, 15);
		panel_12.add(checkBox_1);

		final JCheckBox checkBox_2 = new JCheckBox();
		checkBox_2.setBackground(Color.WHITE);
		checkBox_2.setText("New JCheckBox");
		checkBox_2.setBounds(30, 55, 15, 15);
		panel_12.add(checkBox_2);

		final JCheckBox checkBox_3 = new JCheckBox();
		checkBox_3.setBackground(Color.WHITE);
		checkBox_3.setText("New JCheckBox");
		checkBox_3.setBounds(30, 80, 15, 15);
		panel_12.add(checkBox_3);

		final JCheckBox checkBox_4 = new JCheckBox();
		checkBox_4.setBackground(Color.WHITE);
		checkBox_4.setText("New JCheckBox");
		checkBox_4.setBounds(30, 105, 15, 15);
		panel_12.add(checkBox_4);

		final JCheckBox checkBox_5 = new JCheckBox();
		checkBox_5.setBackground(Color.WHITE);
		checkBox_5.setText("New JCheckBox");
		checkBox_5.setBounds(30, 130, 15, 15);
		panel_12.add(checkBox_5);

		final JCheckBox checkBox_6 = new JCheckBox();
		checkBox_6.setBackground(Color.WHITE);
		checkBox_6.setText("New JCheckBox");
		checkBox_6.setBounds(30, 155, 15, 15);
		panel_12.add(checkBox_6);

		final JCheckBox checkBox_7 = new JCheckBox();
		checkBox_7.setBackground(Color.WHITE);
		checkBox_7.setText("New JCheckBox");
		checkBox_7.setBounds(30, 180, 15, 15);
		panel_12.add(checkBox_7);

		final JPanel panel_13 = new JPanel();
		panel_13.setBounds(80, 40, 760, 200);
		panel_7_1.add(panel_13);
		panel_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_13.setLayout(null);

		final JPanel panel_13_1 = new JPanel();
		panel_13_1.setBounds(0, 0, 760, 25);
		panel_13.add(panel_13_1);
		panel_13_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_1.setBackground(Color.WHITE);
		panel_13_1.setLayout(null);

		final JLabel aantipsychoticLabel = new JLabel();
		aantipsychoticLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		aantipsychoticLabel.setText("A. Antipsychotic");
		aantipsychoticLabel.setBounds(10, 2, 200, 15);
		panel_13_1.add(aantipsychoticLabel);

		final JPanel panel_13_2 = new JPanel();
		panel_13_2.setBounds(0, 25, 760, 25);
		panel_13.add(panel_13_2);
		panel_13_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_2.setBackground(Color.WHITE);
		panel_13_2.setLayout(null);

		final JLabel bAntianxietyLabel = new JLabel();
		bAntianxietyLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		bAntianxietyLabel.setText("B. Antianxiety");
		bAntianxietyLabel.setBounds(10, 2, 200, 15);
		panel_13_2.add(bAntianxietyLabel);

		final JPanel panel_13_3 = new JPanel();
		panel_13_3.setBounds(0, 50, 760, 25);
		panel_13.add(panel_13_3);
		panel_13_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_3.setBackground(Color.WHITE);
		panel_13_3.setLayout(null);

		final JLabel cAntidepressantLabel = new JLabel();
		cAntidepressantLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		cAntidepressantLabel.setText("C. Antidepressant");
		cAntidepressantLabel.setBounds(10, 2, 200, 15);
		panel_13_3.add(cAntidepressantLabel);

		final JPanel panel_13_4 = new JPanel();
		panel_13_4.setBounds(0, 75, 760, 25);
		panel_13.add(panel_13_4);
		panel_13_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_4.setBackground(Color.WHITE);
		panel_13_4.setLayout(null);

		final JLabel dHypnoticLabel = new JLabel();
		dHypnoticLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		dHypnoticLabel.setText("D. Hypnotic");
		dHypnoticLabel.setBounds(10, 2, 200, 15);
		panel_13_4.add(dHypnoticLabel);

		final JPanel panel_13_5 = new JPanel();
		panel_13_5.setBounds(0, 100, 760, 25);
		panel_13.add(panel_13_5);
		panel_13_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_5.setBackground(Color.WHITE);
		panel_13_5.setLayout(null);

		final JLabel label_3_4 = new JLabel();
		label_3_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_3_4
				.setText("<html><body><b> E. Anticoagulant</b> (warfarin,heparin,or low- molecular weight heparin)");
		label_3_4.setBounds(10, 2, 460, 15);
		panel_13_5.add(label_3_4);

		final JPanel panel_13_6 = new JPanel();
		panel_13_6.setBounds(0, 125, 760, 25);
		panel_13.add(panel_13_6);
		panel_13_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_6.setBackground(Color.WHITE);
		panel_13_6.setLayout(null);

		final JLabel fAntibioticLabel = new JLabel();
		fAntibioticLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		fAntibioticLabel.setText("F. Antibiotic");
		fAntibioticLabel.setBounds(10, 2, 200, 15);
		panel_13_6.add(fAntibioticLabel);

		final JPanel panel_13_7 = new JPanel();
		panel_13_7.setBounds(0, 150, 760, 25);
		panel_13.add(panel_13_7);
		panel_13_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_7.setBackground(Color.WHITE);
		panel_13_7.setLayout(null);

		final JLabel gDiureticLabel = new JLabel();
		gDiureticLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		gDiureticLabel.setText("G. Diuretic");
		gDiureticLabel.setBounds(10, 2, 200, 15);
		panel_13_7.add(gDiureticLabel);

		final JPanel panel_13_8 = new JPanel();
		panel_13_8.setBounds(0, 175, 760, 25);
		panel_13.add(panel_13_8);
		panel_13_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_8.setBackground(Color.WHITE);
		panel_13_8.setLayout(null);

		final JLabel label_3_7 = new JLabel();
		label_3_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3_7.setText("Z. None of the above were received");
		label_3_7.setBounds(10, 2, 386, 15);
		panel_13_8.add(label_3_7);
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
