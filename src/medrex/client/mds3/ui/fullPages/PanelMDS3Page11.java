package medrex.client.mds3.ui.fullPages;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.commons.enums.ColorConstants;
import medrex.commons.intf.Form;

import com.toedter.calendar.JDateChooser;

public class PanelMDS3Page11 extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2650974227947383154L;

	public PanelMDS3Page11() {
		super();
		setPreferredSize(new Dimension(840, 800));
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
		sectionALabel.setText("Section E");
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
		identificationInformationLabel.setText("Behavior");
		panel_4.add(identificationInformationLabel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setPreferredSize(new Dimension(840, 135));
		add(panel_1);

		final JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setHgap(10);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_5.setLayout(flowLayout_2);
		panel_5.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5.setBounds(0, 0, 840, 25);
		panel_1.add(panel_5);

		final JLabel a0100Label = new JLabel();
		a0100Label.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label.setText("E0900. Wandering - Presence & Frequency");
		panel_5.add(a0100Label);

		final JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6.setBounds(0, 24, 84, 111);
		panel_1.add(panel_6);

		final JLabel enterCodeLabel_2 = new JLabel();
		enterCodeLabel_2.setBounds(15, 6, 54, 14);
		enterCodeLabel_2.setText("Enter Code");
		panel_6.add(enterCodeLabel_2);

		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setPreferredSize(new Dimension(50, 20));
		comboBox_2.setBounds(15, 26, 50, 20);
		panel_6.add(comboBox_2);

		final JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(91, 30, 739, 102);
		panel_1.add(panel_7);

		final JLabel aNationalProviderLabel = new JLabel();
		aNationalProviderLabel.setFont(new Font("Arial", Font.BOLD, 12));
		aNationalProviderLabel.setText("Has the resident wandered?");
		aNationalProviderLabel.setBounds(10, 5, 206, 14);
		panel_7.add(aNationalProviderLabel);

		final JLabel label = new JLabel();
		label
				.setText("<html><body>0.<b> Behavior not exhibited --></b> Skip to E1100, Change in Behavioral or Other Symptoms");
		label.setBounds(43, 25, 567, 14);
		panel_7.add(label);

		final JLabel label_1 = new JLabel();
		label_1
				.setText("<html><body>1. <b> Behavior of this type occurred 1 to 3 days.</b>");
		label_1.setBounds(43, 45, 281, 14);
		panel_7.add(label_1);

		final JLabel label_2 = new JLabel();
		label_2
				.setText("<html><body>2.<b> Behavior of this type occurred 4 to 6 days</b> ,but less than daily");
		label_2.setBounds(43, 64, 470, 14);
		panel_7.add(label_2);

		final JLabel label_3 = new JLabel();
		label_3
				.setText("<html><body>3. <b> Behavior of this type occurred daily");
		label_3.setBounds(43, 84, 252, 14);
		panel_7.add(label_3);

		final JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1.setLayout(null);
		panel_1_1.setPreferredSize(new Dimension(840, 189));
		add(panel_1_1);

		final JPanel panel_5_1 = new JPanel();
		panel_5_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_3 = new FlowLayout();
		flowLayout_3.setHgap(10);
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel_5_1.setLayout(flowLayout_3);
		panel_5_1.setBounds(0, -1, 840, 26);
		panel_1_1.add(panel_5_1);

		final JLabel a0100Label_1 = new JLabel();
		a0100Label_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1.setText("E1000. Wandering - Impact");
		panel_5_1.add(a0100Label_1);

		final JPanel panel_6_1 = new JPanel();
		panel_6_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_4 = new FlowLayout();
		flowLayout_4.setVgap(8);
		panel_6_1.setLayout(flowLayout_4);
		panel_6_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1.setBounds(0, 23, 84, 166);
		panel_1_1.add(panel_6_1);

		final JLabel enterCodeLabel = new JLabel();
		enterCodeLabel.setText("Enter Code");
		panel_6_1.add(enterCodeLabel);

		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox.setBackground(Color.WHITE);
		comboBox.setPreferredSize(new Dimension(50, 20));
		panel_6_1.add(comboBox);

		final JPanel panel_7_1 = new JPanel();
		panel_7_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1.setBackground(Color.WHITE);
		panel_7_1.setLayout(null);
		panel_7_1.setBounds(80, 23, 760, 97);
		panel_1_1.add(panel_7_1);

		final JLabel aNationalProviderLabel_2 = new JLabel();
		aNationalProviderLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel_2
				.setText("<html><body><b> A. Does the wandering place the resident at significant risk of getting to a potentially dangerous place</b>(e.g.. stairs, outside of the facility)?");
		aNationalProviderLabel_2.setBounds(10, 5, 719, 34);
		panel_7_1.add(aNationalProviderLabel_2);

		final JLabel aNationalProviderLabel_1_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel_1_1_1.setText("<html><body>0. <b> No");
		aNationalProviderLabel_1_1_1.setBounds(32, 45, 206, 14);
		panel_7_1.add(aNationalProviderLabel_1_1_1);

		final JLabel label_4 = new JLabel();
		label_4.setText("<html><body>1. <b>Yes");
		label_4.setBounds(32, 65, 54, 14);
		panel_7_1.add(label_4);

		final JPanel panel_7_1_2 = new JPanel();
		panel_7_1_2.setBackground(Color.WHITE);
		panel_7_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2.setLayout(null);
		panel_7_1_2.setBounds(80, 119, 760, 70);
		panel_1_1.add(panel_7_1_2);

		final JLabel aNationalProviderLabel_2_2 = new JLabel();
		aNationalProviderLabel_2_2
				.setText("B. Does the wandering significantly intrude on the privacy or activities of others");
		aNationalProviderLabel_2_2.setBounds(10, 5, 666, 22);
		panel_7_1_2.add(aNationalProviderLabel_2_2);

		final JLabel aNationalProviderLabel_1_1_1_2 = new JLabel();
		aNationalProviderLabel_1_1_1_2.setText("<html><body>0. <b> No");
		aNationalProviderLabel_1_1_1_2.setBounds(38, 33, 206, 14);
		panel_7_1_2.add(aNationalProviderLabel_1_1_1_2);

		final JLabel label_4_1 = new JLabel();
		label_4_1.setText("<html><body>1. <b>Yes");
		label_4_1.setBounds(38, 53, 187, 14);
		panel_7_1_2.add(label_4_1);

		final JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(Color.WHITE);
		panel_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1_2.setLayout(null);
		panel_1_2.setPreferredSize(new Dimension(840, 160));
		add(panel_1_2);

		final JPanel panel_5_2 = new JPanel();
		panel_5_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_2.setLayout(null);
		panel_5_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_5_2.setBounds(0, -1, 840, 47);
		panel_1_2.add(panel_5_2);

		final JLabel a0100Label_2 = new JLabel();
		a0100Label_2.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_2.setBounds(11, 6, 399, 14);
		a0100Label_2.setText("E1100. Change in Behavior or Other Symptoms");
		panel_5_2.add(a0100Label_2);

		final JLabel considerAllOfLabel = new JLabel();
		considerAllOfLabel
				.setText("Consider all of the symptoms assessed in items E0100 through E1000");
		considerAllOfLabel.setBounds(21, 23, 498, 14);
		panel_5_2.add(considerAllOfLabel);

		final JPanel panel_6_2 = new JPanel();
		panel_6_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_2.setLayout(null);
		panel_6_2.setBounds(0, 43, 84, 117);
		panel_1_2.add(panel_6_2);

		final JLabel enterCodeLabel_2_1 = new JLabel();
		enterCodeLabel_2_1.setText("Enter Code");
		enterCodeLabel_2_1.setBounds(15, 6, 54, 14);
		panel_6_2.add(enterCodeLabel_2_1);

		final JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_2_1.setBackground(Color.WHITE);
		comboBox_2_1.setPreferredSize(new Dimension(50, 20));
		comboBox_2_1.setBounds(15, 26, 50, 20);
		panel_6_2.add(comboBox_2_1);

		final JPanel panel_7_2 = new JPanel();
		panel_7_2.setBackground(Color.WHITE);
		panel_7_2.setLayout(null);
		panel_7_2.setBounds(91, 47, 739, 109);
		panel_1_2.add(panel_7_2);

		final JLabel aNationalProviderLabel_1 = new JLabel();
		aNationalProviderLabel_1
				.setText("<html><body>How does resident's current behavior status, care rejection, or wandering <b>compare to prior assessment(OBRA or PPS)?");
		aNationalProviderLabel_1.setBounds(10, 5, 626, 14);
		panel_7_2.add(aNationalProviderLabel_1);

		final JLabel label_5 = new JLabel();
		label_5.setText("<html><body> 0 .<b> Same");
		label_5.setBounds(43, 25, 567, 14);
		panel_7_2.add(label_5);

		final JLabel label_1_1 = new JLabel();
		label_1_1.setText("<html><body>1 <b>Improved");
		label_1_1.setBounds(43, 45, 281, 14);
		panel_7_2.add(label_1_1);

		final JLabel label_2_1 = new JLabel();
		label_2_1.setText("<html><body>2 <b< Worse");
		label_2_1.setBounds(43, 64, 470, 14);
		panel_7_2.add(label_2_1);

		final JLabel label_3_1 = new JLabel();
		label_3_1
				.setText("<html><body>3. <b> N/A </b> because no prior MDS assessment");
		label_3_1.setBounds(43, 84, 252, 14);
		panel_7_2.add(label_3_1);
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
		PanelMDS3Page11 panel = new PanelMDS3Page11();
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

	public void doLoad() {
		// TODO Auto-generated method stub

	}

	public int doSave() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void doUpdate() {
		// TODO Auto-generated method stub

	}

	public boolean doValidate() {
		// TODO Auto-generated method stub
		return false;
	}
}
