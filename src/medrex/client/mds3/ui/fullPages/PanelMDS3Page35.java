package medrex.client.mds3.ui.fullPages;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.commons.enums.ColorConstants;

public class PanelMDS3Page35 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5503585666621845497L;

	public PanelMDS3Page35() {
		super();
		setPreferredSize(new Dimension(840, 1250));
		setLayout(null);
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
		panel_4.setBackground(ColorConstants.MDS_BACK_COLOR);
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setVgap(2);
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_4.setLayout(flowLayout);
		panel_4.setBounds(246, 2, 592, 22);
		panel_2.add(panel_4);

		final JLabel identificationInformationLabel = new JLabel();
		identificationInformationLabel
				.setForeground(ColorConstants.MDS_FONT_COLOR);
		identificationInformationLabel
				.setFont(new Font("Arial", Font.BOLD, 16));
		identificationInformationLabel
				.setHorizontalAlignment(SwingConstants.LEFT);
		identificationInformationLabel.setText("Correction Request");
		panel_4.add(identificationInformationLabel);

		final JPanel panel_51 = new JPanel();
		panel_51.setBackground(Color.WHITE);
		panel_51.setLayout(null);
		panel_51.setBounds(0, 25, 840, 205);
		add(panel_51);

		final JPanel panel_52 = new JPanel();
		panel_52.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_52.setLayout(null);
		panel_52.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_52.setBounds(0, 0, 840, 31);
		panel_51.add(panel_52);

		final JLabel o0300PneumococcalVaccineLabel = new JLabel();
		o0300PneumococcalVaccineLabel.setFont(new Font("Arial", Font.BOLD, 12));
		o0300PneumococcalVaccineLabel
				.setText("X0600.  Type of Assessment - Continued");
		o0300PneumococcalVaccineLabel.setBounds(10, 10, 357, 14);
		panel_52.add(o0300PneumococcalVaccineLabel);

		final JPanel panel_O0300A = new JPanel();
		panel_O0300A.setBackground(Color.WHITE);
		panel_O0300A.setLayout(null);
		panel_O0300A.setBounds(0, 30, 840, 60);
		panel_51.add(panel_O0300A);

		final JPanel panel_54 = new JPanel();
		panel_54.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_54.setLayout(null);
		panel_54.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_54.setBounds(0, 0, 71, 61);
		panel_O0300A.add(panel_54);

		final JLabel enterCodeLabel_2 = new JLabel();
		enterCodeLabel_2.setFont(new Font("Arial", Font.PLAIN, 11));
		enterCodeLabel_2.setText("Enter Code");
		enterCodeLabel_2.setBounds(10, 10, 54, 14);
		panel_54.add(enterCodeLabel_2);

		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1" }));
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setBounds(12, 30, 43, 17);
		panel_54.add(comboBox_2);

		final JPanel panel_55 = new JPanel();
		panel_55.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_55.setLayout(null);
		panel_55.setBackground(Color.WHITE);
		panel_55.setBounds(70, 0, 770, 61);
		panel_O0300A.add(panel_55);

		final JLabel anbspLabel = new JLabel();
		anbspLabel
				.setText("<html><body><b> D.</b> &nbsp<b>Is this a Swing Bed clinical change assessment ?</b> Complete only if X0200 = 2 ");
		anbspLabel.setBounds(10, 10, 673, 14);
		panel_55.add(anbspLabel);

		final JLabel label_13 = new JLabel();
		label_13.setFont(new Font("Arial", Font.PLAIN, 12));
		label_13.setText("<html><body>0. &nbsp <b> No </b> ");
		label_13.setBounds(25, 30, 483, 14);
		panel_55.add(label_13);

		final JLabel label_14 = new JLabel();
		label_14.setFont(new Font("Arial", Font.PLAIN, 12));
		label_14.setText("<html><body>1. &nbsp <b> Yes </b> ");
		label_14.setBounds(25, 44, 329, 14);
		panel_55.add(label_14);

		final JPanel panel_O0300B = new JPanel();
		panel_O0300B.setLayout(null);
		panel_O0300B.setBackground(Color.WHITE);
		panel_O0300B.setBounds(0, 90, 840, 115);
		panel_51.add(panel_O0300B);

		final JPanel panel_57 = new JPanel();
		panel_57.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_57.setLayout(null);
		panel_57.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_57.setBounds(0, 0, 71, 115);
		panel_O0300B.add(panel_57);

		final JLabel enterCodeLabel_3 = new JLabel();
		enterCodeLabel_3.setFont(new Font("Arial", Font.PLAIN, 11));
		enterCodeLabel_3.setText("Enter Code");
		enterCodeLabel_3.setBounds(10, 22, 54, 14);
		panel_57.add(enterCodeLabel_3);

		final JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBackground(Color.WHITE);
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] { "", "01",
				"10", "11", "12", "99" }));
		comboBox_3.setBounds(12, 42, 43, 17);
		panel_57.add(comboBox_3);

		final JPanel panel_58 = new JPanel();
		panel_58.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_58.setLayout(null);
		panel_58.setBackground(Color.WHITE);
		panel_58.setBounds(70, 0, 770, 115);
		panel_O0300B.add(panel_58);

		final JLabel bIfLabel = new JLabel();
		bIfLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		bIfLabel
				.setText("<html><body><b> F.</b>&nbsp<b> Entry/discharge reporting </b>");
		bIfLabel.setBounds(10, 10, 424, 14);
		panel_58.add(bIfLabel);

		final JLabel label_15 = new JLabel();
		label_15.setFont(new Font("Arial", Font.PLAIN, 12));
		label_15.setText("<html><body>01. &nbsp<b> Entry </b> record");
		label_15.setBounds(25, 30, 348, 14);
		panel_58.add(label_15);

		final JLabel label_16 = new JLabel();
		label_16.setFont(new Font("Arial", Font.PLAIN, 12));
		label_16
				.setText("<html><body>10. &nbsp<b> Discharge </b> assessment - <b> return not anticipated </b>");
		label_16.setBounds(25, 45, 306, 14);
		panel_58.add(label_16);

		final JLabel label_17 = new JLabel();
		label_17.setFont(new Font("Arial", Font.PLAIN, 12));
		label_17
				.setText("<html><body> 11. &nbsp <b> Discharge </b> assessment - <b> return anticipated</b>");
		label_17.setBounds(25, 60, 365, 14);
		panel_58.add(label_17);

		final JLabel label = new JLabel();
		label
				.setText("<html><body> 12. &nbsp <b> Death in facility </b> record");
		label.setBounds(25, 75, 263, 14);
		panel_58.add(label);

		final JLabel label_1 = new JLabel();
		label_1
				.setText("<html><body> 99. &nbsp <b> Not entry/discharge </b> record");
		label_1.setBounds(25, 90, 197, 14);
		panel_58.add(label_1);

	}

}
