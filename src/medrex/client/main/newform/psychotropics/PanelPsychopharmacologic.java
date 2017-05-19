package medrex.client.main.newform.psychotropics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.commons.intf.Form;

import com.toedter.calendar.JDateChooser;

public class PanelPsychopharmacologic extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1987773470245967862L;
	private JTextField lblSig;
	private JLabel lblSignature;
	private JDateChooser dcReassessmentDate;
	private JLabel lblReassessmentDate;
	private JRadioButton rbNo;
	private JRadioButton rbYes;
	private JLabel lblCarePlanReview;
	private JLabel lblDate;
	private JLabel lblMediaction;
	private JLabel lblDiagnosis;
	private JLabel lblRoom;
	private JLabel lblPhysician;
	private JLabel lblResidentName;
	private JTextArea txtOther;
	private JTextArea textSumary;
	private JDateChooser dcDate;
	private JTextField txtMedication;
	private JTextField txtDiagnosis;
	private JTextField txtRoom;
	private JTextField txtPhysician;
	private JTextField txtResidentName;

	public PanelPsychopharmacologic() {
		super();
		setBorder(new LineBorder(Color.black, 1, false));
		setLayout(null);
		setPreferredSize(new Dimension(800, 1000));
		setBackground(new Color(254, 251, 233));

		final JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 800, 907);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setLayout(null);
		panel_1.setBounds(10, 10, 780, 28);
		panel.add(panel_1);

		final JLabel label = new JLabel();
		label.setFont(new Font("Arial", Font.BOLD, 14));
		label.setText("PSYCHOPHARMACOLOGIC DRUG USAGE SUMMARY");
		label.setBounds(214, 0, 399, 28);
		panel_1.add(label);

		final JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setLayout(null);
		panel_2.setBounds(10, 50, 780, 220);
		panel.add(panel_2);

		final JPanel panel_3 = new JPanel();
		panel_3.setOpaque(false);
		panel_3.setLayout(null);
		panel_3.setBounds(10, 10, 439, 27);
		panel_2.add(panel_3);

		lblResidentName = new JLabel();
		lblResidentName.setText("Resident's Name:");
		lblResidentName.setBounds(10, 5, 106, 16);
		panel_3.add(lblResidentName);

		txtResidentName = new JTextField();
		txtResidentName.setBounds(130, 3, 217, 20);
		panel_3.add(txtResidentName);

		final JPanel panel_4 = new JPanel();
		panel_4.setOpaque(false);
		panel_4.setLayout(null);
		panel_4.setBounds(10, 45, 439, 27);
		panel_2.add(panel_4);

		lblPhysician = new JLabel();
		lblPhysician.setBounds(10, 5, 66, 16);
		lblPhysician.setText("Physician:");
		panel_4.add(lblPhysician);

		txtPhysician = new JTextField();
		txtPhysician.setBounds(130, 3, 217, 20);
		panel_4.add(txtPhysician);

		final JPanel panel_5 = new JPanel();
		panel_5.setOpaque(false);
		panel_5.setLayout(null);
		panel_5.setBounds(10, 75, 439, 27);
		panel_2.add(panel_5);

		lblRoom = new JLabel();
		lblRoom.setText("Room#:");
		lblRoom.setBounds(10, 5, 66, 16);
		panel_5.add(lblRoom);

		txtRoom = new JTextField();
		txtRoom.setBounds(130, 3, 217, 20);
		panel_5.add(txtRoom);

		final JPanel panel_6 = new JPanel();
		panel_6.setOpaque(false);
		panel_6.setLayout(null);
		panel_6.setBounds(10, 105, 439, 27);
		panel_2.add(panel_6);

		lblDiagnosis = new JLabel();
		lblDiagnosis.setText("Diagnosis:");
		lblDiagnosis.setBounds(10, 5, 66, 16);
		panel_6.add(lblDiagnosis);

		txtDiagnosis = new JTextField();
		txtDiagnosis.setBounds(130, 3, 217, 20);
		panel_6.add(txtDiagnosis);

		final JPanel panel_7 = new JPanel();
		panel_7.setOpaque(false);
		panel_7.setLayout(null);
		panel_7.setBounds(10, 135, 439, 27);
		panel_2.add(panel_7);

		lblMediaction = new JLabel();
		lblMediaction.setText("Medication & Dose:");
		lblMediaction.setBounds(10, 5, 116, 16);
		panel_7.add(lblMediaction);

		txtMedication = new JTextField();
		txtMedication.setBounds(130, 3, 217, 20);
		panel_7.add(txtMedication);

		final JPanel panel_8 = new JPanel();
		panel_8.setOpaque(false);
		panel_8.setLayout(null);
		panel_8.setBounds(10, 165, 439, 27);
		panel_2.add(panel_8);

		lblDate = new JLabel();
		lblDate.setText("Date:");
		lblDate.setBounds(10, 5, 66, 16);
		panel_8.add(lblDate);

		dcDate = new JDateChooser();
		dcDate.setBounds(130, 3, 217, 20);
		panel_8.add(dcDate);

		final JPanel panel_9 = new JPanel();
		panel_9.setOpaque(false);
		panel_9.setLayout(null);
		panel_9.setBounds(10, 290, 780, 167);
		panel.add(panel_9);

		final JLabel label_7 = new JLabel();
		label_7.setText("Summary:");
		label_7.setBounds(10, 0, 66, 16);
		panel_9.add(label_7);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 21, 760, 136);
		panel_9.add(scrollPane);

		textSumary = new JTextArea();
		scrollPane.setViewportView(textSumary);

		final JPanel panel_10 = new JPanel();
		panel_10.setOpaque(false);
		panel_10.setLayout(null);
		panel_10.setBounds(10, 473, 780, 213);
		panel.add(panel_10);

		final JLabel label_8 = new JLabel();
		label_8
				.setText("Recommended Level of Medication Use(please circle appropriate number response)");
		label_8.setBounds(10, 5, 487, 22);
		panel_10.add(label_8);

		final JLabel label_9 = new JLabel();
		label_9.setText("1.  Appropriate use: Recommend using as prescribed.");
		label_9.setBounds(60, 30, 372, 16);
		panel_10.add(label_9);

		final JLabel label_10 = new JLabel();
		label_10.setText("2.  Recommend a drug holiday.");
		label_10.setBounds(60, 50, 372, 16);
		panel_10.add(label_10);

		final JLabel label_11 = new JLabel();
		label_11
				.setText("3.  Recommend tapering drug dose & observation of resident's response.");
		label_11.setBounds(60, 70, 414, 16);
		panel_10.add(label_11);

		final JLabel label_12 = new JLabel();
		label_12.setText("4.  Recommend discontinuance of medication.");
		label_12.setBounds(60, 90, 414, 16);
		panel_10.add(label_12);

		final JLabel label_13 = new JLabel();
		label_13
				.setText("5.  Recommend substitute drug & observation of resident's response.");
		label_13.setBounds(60, 110, 414, 16);
		panel_10.add(label_13);

		final JLabel label_14 = new JLabel();
		label_14.setText("6.  Other(explain).");
		label_14.setBounds(60, 130, 414, 16);
		panel_10.add(label_14);

		final JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBackground(Color.WHITE);
		scrollPane_1.setOpaque(true);
		scrollPane_1.setBounds(5, 152, 765, 51);
		panel_10.add(scrollPane_1);

		txtOther = new JTextArea();
		scrollPane_1.setViewportView(txtOther);

		final JPanel panel_11 = new JPanel();
		panel_11.setOpaque(false);
		panel_11.setLayout(null);
		panel_11.setBounds(10, 700, 780, 167);
		panel.add(panel_11);

		final JPanel panel_12 = new JPanel();
		panel_12.setOpaque(false);
		panel_12.setLayout(null);
		panel_12.setBounds(10, 10, 760, 24);
		panel_11.add(panel_12);

		lblCarePlanReview = new JLabel();
		lblCarePlanReview.setText("Care Plan Review/Update");
		lblCarePlanReview.setBounds(10, 5, 153, 16);
		panel_12.add(lblCarePlanReview);

		rbYes = new JRadioButton();
		rbYes.setOpaque(false);

		rbYes.setText("YES");
		rbYes.setBounds(195, 5, 66, 18);
		panel_12.add(rbYes);

		rbNo = new JRadioButton();
		rbNo.setOpaque(false);
		rbNo.setText("NO");
		rbNo.setBounds(280, 5, 66, 18);
		panel_12.add(rbNo);

		// To add radio button in Button Group.........
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rbYes);
		bgroup.add(rbNo);

		final JPanel panel_14 = new JPanel();
		panel_14.setOpaque(false);
		panel_14.setLayout(null);
		panel_14.setBounds(10, 45, 477, 24);
		panel_11.add(panel_14);

		lblReassessmentDate = new JLabel();
		lblReassessmentDate.setText("Reassessment Date");
		lblReassessmentDate.setBounds(10, 5, 119, 16);
		panel_14.add(lblReassessmentDate);

		dcReassessmentDate = new JDateChooser();
		dcReassessmentDate.setBounds(135, 0, 217, 20);
		panel_14.add(dcReassessmentDate);

		final JPanel panel_15 = new JPanel();
		panel_15.setOpaque(false);
		panel_15.setLayout(null);
		panel_15.setBounds(10, 80, 477, 24);
		panel_11.add(panel_15);

		lblSignature = new JLabel();
		lblSignature.setText("Signature");
		lblSignature.setBounds(10, 5, 66, 16);
		panel_15.add(lblSignature);

		lblSig = new JTextField();
		lblSig.setBounds(93, 3, 254, 20);
		panel_15.add(lblSig);

	}

	public static void main(String args[]) {
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
		PanelPsychopharmacologic panel = new PanelPsychopharmacologic();
		scroller.setViewportView(panel);
		JFrame frm = new JFrame("Frame");
		frm.setSize(new Dimension(java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize()));
		frm.add(scroller);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setState(JFrame.MAXIMIZED_BOTH);
		frm.setVisible(true);

	}

	@Override
	public void doLoad() {
		// TODO Auto-generated method stub

	}

	@Override
	public int doSave() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void doUpdate() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean doValidate() {
		// TODO Auto-generated method stub
		return false;
	}

}
