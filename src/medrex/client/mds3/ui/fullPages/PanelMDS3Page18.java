package medrex.client.mds3.ui.fullPages;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.client.mds3.general.Mds3SubSection;
import medrex.commons.enums.ColorConstants;

import com.toedter.calendar.JDateChooser;

public class PanelMDS3Page18 extends JPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4740657464531319649L;

	public PanelMDS3Page18() {
		super();
		setPreferredSize(new Dimension(840, 1250));
		final FlowLayout flowLayout_6 = new FlowLayout();
		flowLayout_6.setHgap(0);
		flowLayout_6.setVgap(0);
		setLayout(flowLayout_6);
		setBackground(Color.WHITE);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(840, 40));
		add(panel);

		final JLabel residentLabel = new JLabel();
		residentLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		residentLabel.setText("Resident");
		residentLabel.setBounds(10, 9, 56, 16);
		panel.add(residentLabel);

		final JTextField textField = new JTextField();
		textField.setBounds(84, 8, 248, 20);
		panel.add(textField);

		final JLabel residentLabel_1 = new JLabel();
		residentLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		residentLabel_1.setText("Identifier");
		residentLabel_1.setBounds(354, 10, 56, 16);
		panel.add(residentLabel_1);

		final JTextField textField_1 = new JTextField();
		textField_1.setBounds(429, 8, 213, 20);
		panel.add(textField_1);

		final JLabel residentLabel_1_1 = new JLabel();
		residentLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		residentLabel_1_1.setText("Date");
		residentLabel_1_1.setBounds(668, 10, 56, 16);
		panel.add(residentLabel_1_1);

		final JDateChooser dcDate = new JDateChooser();
		dcDate.setBackground(Color.WHITE);
		dcDate.setBounds(730, 8, 100, 22);
		panel.add(dcDate);

		final JPanel panel_2 = new JPanel();
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
		sectionALabel.setText("Section I");
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
		identificationInformationLabel.setText("Active Diagnoses");
		panel_4.add(identificationInformationLabel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setPreferredSize(new Dimension(840, 260));
		add(panel_1);

		final JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_5.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5.setBounds(0, 0, 839, 41);
		panel_1.add(panel_5);

		final JLabel a0100Label = new JLabel();
		a0100Label.setBounds(11, 6, 316, 15);
		a0100Label.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label
				.setText("Active Diagnoses in the last 7 days - Check all that apply");
		panel_5.add(a0100Label);

		final JLabel a0100Label_2 = new JLabel();
		a0100Label_2.setBounds(6, 22, 781, 14);
		a0100Label_2
				.setText("Diagnoses listed in parentheses are provided as examples and should not be considered as all-inclusive lists");
		panel_5.add(a0100Label_2);

		final JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6.setBounds(0, 60, 82, 200);
		panel_1.add(panel_6);

		final JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(91, 68, 739, 190);
		panel_1.add(panel_7);

		final JLabel label = new JLabel();
		label.setFont(new Font("Arial", Font.BOLD, 12));
		label.setText("14900. Hemiplegia or Hemiparesis");
		label.setBounds(0, 2, 602, 14);
		panel_7.add(label);

		final JLabel label_1 = new JLabel();
		label_1.setFont(new Font("Arial", Font.BOLD, 12));
		label_1.setText("1500. Paraplegia");
		label_1.setBounds(0, 22, 554, 14);
		panel_7.add(label_1);

		final JLabel quadriplegiaLabel = new JLabel();
		quadriplegiaLabel.setFont(new Font("Arial", Font.BOLD, 12));
		quadriplegiaLabel.setText("15100 . Quadriplegia");
		quadriplegiaLabel.setBounds(0, 42, 488, 14);
		panel_7.add(quadriplegiaLabel);

		final JLabel label_3 = new JLabel();
		label_3.setFont(new Font("Arial", Font.BOLD, 12));
		label_3.setText("15200 . Multiple Sclerosis (MS)");
		label_3.setBounds(0, 62, 525, 14);
		panel_7.add(label_3);

		final JLabel label_4 = new JLabel();
		label_4.setFont(new Font("Arial", Font.BOLD, 12));
		label_4.setText("15250 . Huntington's disease");
		label_4.setBounds(0, 82, 554, 14);
		panel_7.add(label_4);

		final JLabel label_5 = new JLabel();
		label_5.setFont(new Font("Arial", Font.BOLD, 12));
		label_5.setText("15300. Parkinson's Disease");
		label_5.setBounds(0, 102, 525, 14);
		panel_7.add(label_5);

		final JLabel label_2 = new JLabel();
		label_2.setFont(new Font("Arial", Font.BOLD, 12));
		label_2.setText("15350. Tourette's Syndrome");
		label_2.setBounds(0, 122, 502, 14);
		panel_7.add(label_2);

		final JLabel label_6 = new JLabel();
		label_6.setFont(new Font("Arial", Font.BOLD, 12));
		label_6.setText("15400. Seizure Disorder or Epilepsy");
		label_6.setBounds(0, 142, 362, 14);
		panel_7.add(label_6);

		final JLabel label_7 = new JLabel();
		label_7.setFont(new Font("Arial", Font.BOLD, 12));
		label_7.setText("15500. Traumatic Brain Injury (TBI)");
		label_7.setBounds(0, 162, 252, 14);
		panel_7.add(label_7);

		final JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(0, 40, 840, 22);
		panel_1.add(panel_8);

		final JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_9.setBounds(0, 0, 82, 22);
		panel_8.add(panel_9);

		final JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_10.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_10.setLayout(null);
		panel_10.setBounds(80, 0, 760, 21);
		panel_8.add(panel_10);

		final JLabel neurologicalContinuedLabel = new JLabel();
		neurologicalContinuedLabel.setFont(new Font("Arial", Font.BOLD, 12));
		neurologicalContinuedLabel.setText("Neurological - Continued");
		neurologicalContinuedLabel.setBounds(10, 2, 692, 14);
		panel_10.add(neurologicalContinuedLabel);

		final JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1_1.setLayout(null);
		panel_1_1.setPreferredSize(new Dimension(840, 205));
		add(panel_1_1);

		final JPanel panel_5_1 = new JPanel();
		panel_5_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_5_1.setLayout(null);
		panel_5_1.setBounds(0, 0, 839, 41);
		panel_1_1.add(panel_5_1);

		final JPanel panel_8_1_1 = new JPanel();
		panel_8_1_1.setLayout(null);
		panel_8_1_1.setBounds(0, 0, 840, 22);
		panel_5_1.add(panel_8_1_1);

		final JPanel panel_9_1_1 = new JPanel();
		panel_9_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_9_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_9_1_1.setBounds(0, 0, 82, 22);
		panel_8_1_1.add(panel_9_1_1);

		final JPanel panel_10_1_1 = new JPanel();
		panel_10_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_10_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_10_1_1.setLayout(null);
		panel_10_1_1.setBounds(80, 0, 760, 21);
		panel_8_1_1.add(panel_10_1_1);

		final JLabel neurologicalContinuedLabel_1_1 = new JLabel();
		neurologicalContinuedLabel_1_1
				.setFont(new Font("Arial", Font.BOLD, 12));
		neurologicalContinuedLabel_1_1.setText("Nutritional");
		neurologicalContinuedLabel_1_1.setBounds(10, 2, 692, 14);
		panel_10_1_1.add(neurologicalContinuedLabel_1_1);

		final JPanel panel_8_1_2 = new JPanel();
		panel_8_1_2.setLayout(null);
		panel_8_1_2.setBounds(0, 19, 840, 22);
		panel_5_1.add(panel_8_1_2);

		final JPanel panel_9_1_2 = new JPanel();
		panel_9_1_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_9_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_9_1_2.setBounds(0, 0, 82, 22);
		panel_8_1_2.add(panel_9_1_2);

		final JPanel panel_10_1_2 = new JPanel();
		panel_10_1_2.setBackground(Color.WHITE);
		panel_10_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_10_1_2.setLayout(null);
		panel_10_1_2.setBounds(80, 0, 760, 21);
		panel_8_1_2.add(panel_10_1_2);

		final JLabel neurologicalContinuedLabel_1_2 = new JLabel();
		neurologicalContinuedLabel_1_2
				.setFont(new Font("Arial", Font.BOLD, 12));
		neurologicalContinuedLabel_1_2
				.setText("15600 Malnutrition (protein or calorie) or at risk for malnutrition");
		neurologicalContinuedLabel_1_2.setBounds(10, 2, 692, 14);
		panel_10_1_2.add(neurologicalContinuedLabel_1_2);

		final JPanel panel_6_1 = new JPanel();
		panel_6_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_1.setBounds(0, 60, 82, 145);
		panel_1_1.add(panel_6_1);

		final JPanel panel_7_1 = new JPanel();
		panel_7_1.setOpaque(false);
		panel_7_1.setLayout(null);
		panel_7_1.setBounds(91, 68, 739, 134);
		panel_1_1.add(panel_7_1);

		final JLabel label_8 = new JLabel();
		label_8.setFont(new Font("Arial", Font.BOLD, 12));
		label_8.setText("15700. Anxiety Disorder");
		label_8.setBounds(0, 2, 602, 14);
		panel_7_1.add(label_8);

		final JLabel label_1_1 = new JLabel();
		label_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		label_1_1.setText("15800. Depression");
		label_1_1.setBounds(0, 22, 554, 14);
		panel_7_1.add(label_1_1);

		final JLabel quadriplegiaLabel_1 = new JLabel();
		quadriplegiaLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		quadriplegiaLabel_1
				.setText("15900. Manic Depression (other than bipolar)");
		quadriplegiaLabel_1.setBounds(0, 42, 488, 14);
		panel_7_1.add(quadriplegiaLabel_1);

		final JLabel label_3_1 = new JLabel();
		label_3_1.setFont(new Font("Arial", Font.BOLD, 12));
		label_3_1.setText("15950. Psycotic Disorder");
		label_3_1.setBounds(0, 62, 525, 14);
		panel_7_1.add(label_3_1);

		final JLabel label_4_1 = new JLabel();
		label_4_1.setFont(new Font("Arial", Font.BOLD, 12));
		label_4_1
				.setText("16000. Schizophrenia(eg. schizoaffective and scizophreniform disorders)");
		label_4_1.setBounds(0, 82, 554, 14);
		panel_7_1.add(label_4_1);

		final JLabel label_5_1 = new JLabel();
		label_5_1.setFont(new Font("Arial", Font.BOLD, 12));
		label_5_1.setText("16100. Post Traumatic Stress Disorder(PTSD)");
		label_5_1.setBounds(0, 102, 525, 14);
		panel_7_1.add(label_5_1);

		final JPanel panel_8_1 = new JPanel();
		panel_8_1.setLayout(null);
		panel_8_1.setBounds(0, 40, 840, 22);
		panel_1_1.add(panel_8_1);

		final JPanel panel_9_1 = new JPanel();
		panel_9_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_9_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_9_1.setBounds(0, 0, 82, 22);
		panel_8_1.add(panel_9_1);

		final JPanel panel_10_1 = new JPanel();
		panel_10_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_10_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_10_1.setLayout(null);
		panel_10_1.setBounds(80, 0, 760, 21);
		panel_8_1.add(panel_10_1);

		final JLabel neurologicalContinuedLabel_1 = new JLabel();
		neurologicalContinuedLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		neurologicalContinuedLabel_1.setText("Psychiatric mood Disorder");
		neurologicalContinuedLabel_1.setBounds(10, 2, 692, 14);
		panel_10_1.add(neurologicalContinuedLabel_1);
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
		PanelMDS3Page1 panel = new PanelMDS3Page1();
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
	public void doSave() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doUpdate() {
		// TODO Auto-generated method stub

	}

}
