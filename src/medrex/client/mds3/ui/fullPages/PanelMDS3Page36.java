package medrex.client.mds3.ui.fullPages;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.enums.ColorConstants;

import com.toedter.calendar.JDateChooser;

public class PanelMDS3Page36 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2441717145839721146L;

	public PanelMDS3Page36() {
		super();
		setPreferredSize(new Dimension(840, 1280));
		setBackground(Color.WHITE);

		final JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 840, 25);
		panel_2.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel_2.setLayout(null);
		panel_2.setPreferredSize(new Dimension(840, 25));
		add(panel_2);

		final JPanel panel_3 = new JPanel();
		panel_3.setBackground(ColorConstants.MDS_FONT_COLOR);
		final FlowLayout flowLayout_1 = new FlowLayout();
		flowLayout_1.setVgap(2);
		flowLayout_1.setHgap(10);
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_3.setLayout(flowLayout_1);
		panel_3.setBounds(3, 3, 231, 18);
		panel_2.add(panel_3);

		final JLabel sectionALabel = new JLabel();
		sectionALabel.setForeground(Color.WHITE);
		sectionALabel.setFont(new Font("Arial", Font.BOLD, 16));
		sectionALabel.setText("Section X");
		panel_3.add(sectionALabel);

		final JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_4.setBounds(246, 2, 592, 22);
		panel_2.add(panel_4);

		final JLabel identificationInformationLabel = new JLabel();
		identificationInformationLabel.setBounds(10, 0, 149, 19);
		identificationInformationLabel
				.setForeground(ColorConstants.MDS_FONT_COLOR);
		identificationInformationLabel
				.setFont(new Font("Arial", Font.BOLD, 16));
		identificationInformationLabel
				.setHorizontalAlignment(SwingConstants.LEFT);
		identificationInformationLabel.setText("Correction Request");
		panel_4.add(identificationInformationLabel);
		// final FlowLayout flowLayout = new FlowLayout();

		final JPanel panel_X1100 = new JPanel();
		panel_X1100.setBorder(new LineBorder(Mds3Constants.BORDER_LIGHTGRAY, 1,
				false));
		panel_X1100.setPreferredSize(new Dimension(840, 353));
		panel_X1100.setBackground(Color.WHITE);
		panel_X1100.setLayout(null);
		panel_X1100.setBounds(0, 25, 840, 205);
		add(panel_X1100);

		final JPanel panel_52 = new JPanel();
		panel_52.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_52.setLayout(null);
		panel_52.setBorder(new LineBorder(Mds3Constants.BORDER_LIGHTGRAY, 1,
				false));
		panel_52.setBounds(0, 0, 840, 31);
		panel_X1100.add(panel_52);

		final JLabel o0300PneumococcalVaccineLabel = new JLabel();
		o0300PneumococcalVaccineLabel.setFont(new Font("Arial", Font.BOLD, 12));
		o0300PneumococcalVaccineLabel
				.setText("X1100. RN Assessment Coordinator Attestation of Completion");
		o0300PneumococcalVaccineLabel.setBounds(10, 10, 357, 14);
		panel_52.add(o0300PneumococcalVaccineLabel);

		final JPanel panel_29 = new JPanel();
		panel_29.setBorder(new LineBorder(Mds3Constants.BORDER_LIGHTGRAY, 1,
				false));
		panel_29.setBackground(Color.WHITE);
		panel_29.setLayout(null);
		panel_29.setBounds(0, 30, 840, 60);
		panel_X1100.add(panel_29);

		final JPanel panel_54 = new JPanel();
		panel_54.setLayout(null);
		panel_54.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_54.setBounds(0, 0, 71, 60);
		panel_29.add(panel_54);

		final JPanel panel_55 = new JPanel();
		panel_55.setBorder(new LineBorder(Mds3Constants.BORDER_LIGHTGRAY, 1,
				false));
		panel_55.setLayout(null);
		panel_55.setBackground(Color.WHITE);
		panel_55.setBounds(70, 0, 770, 60);
		panel_29.add(panel_55);

		final JLabel anbspLabel = new JLabel();
		anbspLabel.setFont(new Font("", Font.BOLD, 12));
		anbspLabel.setText("A. Attesting individual's first name: ");
		anbspLabel.setBounds(10, 10, 673, 14);
		panel_55.add(anbspLabel);

		final JTextField textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(25, 30, 300, 20);
		panel_55.add(textField);

		final JPanel panel_30 = new JPanel();
		panel_30.setBorder(new LineBorder(Color.black, 1, false));
		panel_30.setLayout(null);
		panel_30.setBackground(Color.WHITE);
		panel_30.setBounds(0, 90, 840, 61);
		panel_X1100.add(panel_30);

		final JPanel panel_57 = new JPanel();
		panel_57.setLayout(null);
		panel_57.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_57.setBounds(0, 0, 71, 61);
		panel_30.add(panel_57);

		final JPanel panel_58 = new JPanel();
		panel_58.setBorder(new LineBorder(Mds3Constants.BORDER_LIGHTGRAY, 1,
				false));
		panel_58.setLayout(null);
		panel_58.setBackground(Color.WHITE);
		panel_58.setBounds(70, 0, 770, 61);
		panel_30.add(panel_58);

		final JLabel bIfLabel = new JLabel();
		bIfLabel.setFont(new Font("Arial", Font.BOLD, 12));
		bIfLabel.setText("B. Attesting individual's last name: ");
		bIfLabel.setBounds(10, 10, 424, 14);
		panel_58.add(bIfLabel);

		final JTextField textField_1 = new JTextField();
		textField_1.setBounds(25, 30, 400, 20);
		panel_58.add(textField_1);

		final JPanel panel = new JPanel();
		panel
				.setBorder(new LineBorder(Mds3Constants.BORDER_LIGHTGRAY, 1,
						false));
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 151, 840, 61);
		panel_X1100.add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 71, 61);
		panel.add(panel_1);

		final JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Mds3Constants.BORDER_LIGHTGRAY, 1,
				false));
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(71, 0, 769, 61);
		panel.add(panel_5);

		final JLabel cAttestingIndividualsLabel = new JLabel();
		cAttestingIndividualsLabel.setFont(new Font("", Font.BOLD, 12));
		cAttestingIndividualsLabel.setText("c. Attesting individual's title:");
		cAttestingIndividualsLabel.setBounds(10, 10, 371, 16);
		panel_5.add(cAttestingIndividualsLabel);

		final JTextField textField_2 = new JTextField();
		textField_2.setBounds(25, 30, 300, 20);
		panel_5.add(textField_2);

		final JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new LineBorder(Mds3Constants.BORDER_LIGHTGRAY, 1,
				false));
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(0, 212, 840, 61);
		panel_X1100.add(panel_6);

		final JPanel panel_7 = new JPanel();
		panel_7.setBounds(0, 0, 71, 61);
		panel_6.add(panel_7);

		final JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new LineBorder(Mds3Constants.BORDER_LIGHTGRAY, 1,
				false));
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(71, 0, 769, 61);
		panel_6.add(panel_8);

		final JLabel dSignatureLabel = new JLabel();
		dSignatureLabel.setText("D. Signature");
		dSignatureLabel.setBounds(10, 10, 350, 16);
		panel_8.add(dSignatureLabel);

		final JTextField textField_3 = new JTextField();
		textField_3.setBounds(25, 30, 300, 20);
		panel_8.add(textField_3);

		final JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBorder(new LineBorder(Mds3Constants.BORDER_LIGHTGRAY, 1,
				false));
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(0, 273, 840, 80);
		panel_X1100.add(panel_9);

		final JPanel panel_10 = new JPanel();
		panel_10.setBounds(0, 0, 71, 80);
		panel_9.add(panel_10);

		final JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBorder(new LineBorder(Mds3Constants.BORDER_LIGHTGRAY, 1,
				false));
		panel_11.setBackground(Color.WHITE);
		panel_11.setBounds(71, 0, 769, 80);
		panel_9.add(panel_11);

		final JLabel eAttestationDateLabel = new JLabel();
		eAttestationDateLabel.setText("E. Attestation Date");
		eAttestationDateLabel.setBounds(10, 10, 330, 16);
		panel_11.add(eAttestationDateLabel);

		final JDateChooser DateChooser = new JDateChooser();
		DateChooser.setBounds(25, 30, 150, 20);
		panel_11.add(DateChooser);

		final JLabel monthLabel = new JLabel();
		monthLabel.setText("Month");
		monthLabel.setBounds(25, 56, 35, 16);
		panel_11.add(monthLabel);

		final JLabel dayLabel = new JLabel();
		dayLabel.setText("Day");
		dayLabel.setBounds(82, 56, 35, 16);
		panel_11.add(dayLabel);

		final JLabel yearLabel = new JLabel();
		yearLabel.setText("Year");
		yearLabel.setBounds(140, 56, 35, 16);
		panel_11.add(yearLabel);

	}

}
