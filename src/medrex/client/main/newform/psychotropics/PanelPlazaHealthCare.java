package medrex.client.main.newform.psychotropics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.commons.intf.Form;

import com.toedter.calendar.JDateChooser;

public class PanelPlazaHealthCare extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3325616555280697769L;
	private JTextArea txtTreatments_2;
	private JTextArea txtResident;
	private JTextArea txtTreatments;
	private JTextArea txtStressor;
	private JTextArea txtSymptoms;
	private JTextArea txtMedicationOrder;
	private JDateChooser dcDate;
	private JTextField txtPhysician;
	private JTextField txtRoomNumber;
	private JTextField txtResidentName;
	private JLabel lblMedicationOrder;
	private JLabel lblDate;
	private JLabel lblPhysician;
	private JLabel lblRoom;
	private JLabel lblResidentName;

	public PanelPlazaHealthCare() {
		super();
		setBorder(new LineBorder(Color.black, 1, false));
		setLayout(null);
		setPreferredSize(new Dimension(800, 1000));
		setBackground(new Color(254, 252, 252));

		final JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setOpaque(false);
		panel.setLayout(null);
		panel.setBounds(0, 0, 800, 1000);
		add(panel);

		final JLabel plazaLabel = new JLabel();
		plazaLabel.setFont(new Font("Arial", Font.BOLD, 12));
		plazaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		plazaLabel.setText("Plaza HealthCare and Rehabilitation Center");
		plazaLabel.setBounds(114, 10, 539, 16);
		panel.add(plazaLabel);

		final JLabel appendix2Label = new JLabel();
		appendix2Label.setForeground(new Color(128, 64, 64));
		appendix2Label.setFont(new Font("Arial", Font.PLAIN, 12));
		appendix2Label.setHorizontalAlignment(SwingConstants.CENTER);
		appendix2Label.setText("Appendix 2");
		appendix2Label.setBounds(337, 32, 60, 14);
		panel.add(appendix2Label);

		final JLabel label = new JLabel();
		label.setForeground(new Color(128, 64, 64));
		label.setFont(new Font("Arial", Font.PLAIN, 12));
		label
				.setText("<html><body><center><u>Psychopharmacologic Medication Gradual Dose Reduction Clinically Contraindicated Physician<br></u><center><u>Woksheet</u></center></br>  ");
		label.setBounds(10, 64, 790, 32);
		panel.add(label);

		final JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setLayout(null);
		panel_1.setBounds(10, 102, 780, 30);
		panel.add(panel_1);

		lblResidentName = new JLabel();
		lblResidentName.setForeground(new Color(128, 64, 64));
		lblResidentName.setFont(new Font("Arial", Font.PLAIN, 12));
		lblResidentName.setText("Resident's Name:");
		lblResidentName.setBounds(10, 5, 104, 20);
		panel_1.add(lblResidentName);

		txtResidentName = new JTextField();
		txtResidentName.setBounds(120, 5, 349, 21);
		panel_1.add(txtResidentName);

		final JPanel panel_1_1 = new JPanel();
		panel_1_1.setOpaque(false);
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(10, 135, 780, 30);
		panel.add(panel_1_1);

		lblRoom = new JLabel();
		lblRoom.setForeground(new Color(128, 64, 64));
		lblRoom.setFont(new Font("Arial", Font.PLAIN, 12));
		plazaLabel.setForeground(new Color(128, 64, 64));
		lblRoom.setText("Room Number:");
		lblRoom.setBounds(10, 5, 98, 20);
		panel_1_1.add(lblRoom);

		txtRoomNumber = new JTextField();
		txtRoomNumber.setBounds(120, 5, 349, 21);
		panel_1_1.add(txtRoomNumber);

		final JPanel panel_1_2 = new JPanel();
		panel_1_2.setOpaque(false);
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(10, 170, 780, 30);
		panel.add(panel_1_2);

		lblPhysician = new JLabel();
		lblPhysician.setForeground(new Color(128, 64, 64));
		lblPhysician.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPhysician.setText("Physician's Signature:");
		lblPhysician.setBounds(10, 5, 107, 20);
		panel_1_2.add(lblPhysician);

		txtPhysician = new JTextField();
		txtPhysician.setBounds(120, 5, 349, 21);
		panel_1_2.add(txtPhysician);

		final JPanel panel_1_3 = new JPanel();
		panel_1_3.setOpaque(false);
		panel_1_3.setLayout(null);
		panel_1_3.setBounds(10, 205, 780, 30);
		panel.add(panel_1_3);

		lblDate = new JLabel();
		lblDate.setForeground(new Color(128, 64, 64));
		lblDate.setText("Date:");
		lblDate.setBounds(10, 5, 83, 20);
		panel_1_3.add(lblDate);

		dcDate = new JDateChooser();
		dcDate.setBounds(120, 5, 349, 21);
		panel_1_3.add(dcDate);

		final JPanel panel_1_4 = new JPanel();
		panel_1_4.setOpaque(false);
		panel_1_4.setLayout(null);
		panel_1_4.setBounds(10, 240, 780, 75);
		panel.add(panel_1_4);

		lblMedicationOrder = new JLabel();
		lblMedicationOrder.setForeground(new Color(128, 64, 64));
		lblMedicationOrder.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMedicationOrder.setText("Medication Order:");
		lblMedicationOrder.setBounds(10, 0, 98, 20);
		panel_1_4.add(lblMedicationOrder);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 20, 770, 50);
		panel_1_4.add(scrollPane);

		txtMedicationOrder = new JTextArea();
		scrollPane.setViewportView(txtMedicationOrder);

		final JPanel panel_3 = new JPanel();
		panel_3.setOpaque(false);
		panel_3.setLayout(null);
		panel_3.setBounds(10, 405, 780, 100);
		panel.add(panel_3);

		final JLabel label_2 = new JLabel();
		label_2.setForeground(new Color(128, 64, 64));
		label_2.setFont(new Font("Arial", Font.PLAIN, 12));
		label_2
				.setText("<html><body> A diagnosis but not simply a diagnistic label or code,but the description of <br>     symptoms..... ");
		label_2.setBounds(50, 5, 770, 28);
		panel_3.add(label_2);

		final JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(50, 40, 730, 50);
		panel_3.add(scrollPane_1);

		txtSymptoms = new JTextArea();
		scrollPane_1.setViewportView(txtSymptoms);

		final JLabel label_4 = new JLabel();
		label_4.setForeground(new Color(128, 64, 64));
		label_4.setText("*");
		label_4.setBounds(25, 5, 26, 14);
		panel_3.add(label_4);

		final JPanel panel_3_1 = new JPanel();
		panel_3_1.setOpaque(false);
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(10, 510, 780, 114);
		panel.add(panel_3_1);

		final JLabel label_2_1 = new JLabel();
		label_2_1.setForeground(new Color(128, 64, 64));
		label_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		label_2_1
				.setText("<html><body> Why the resident's beavioral symptoms is through to be a result of dementia with<br>"
						+ "psychosis and/or agitated behaviors,and not the result of an unrecognized painful<br>"
						+ "medical condtion of a psychosocial or envirnment<br>"
						+ "stressor............");
		label_2_1.setBounds(50, 5, 770, 56);
		panel_3_1.add(label_2_1);

		final JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setBounds(50, 60, 730, 50);
		panel_3_1.add(scrollPane_1_1);

		txtStressor = new JTextArea();
		scrollPane_1_1.setViewportView(txtStressor);

		final JLabel label_4_1 = new JLabel();
		label_4_1.setForeground(new Color(128, 64, 64));
		label_4_1.setText("*");
		label_4_1.setBounds(25, 5, 26, 14);
		panel_3_1.add(label_4_1);

		final JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setOpaque(false);
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBounds(10, 630, 780, 100);
		panel.add(panel_3_1_1);

		final JLabel label_2_1_1 = new JLabel();
		label_2_1_1.setForeground(new Color(128, 64, 64));
		label_2_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		label_2_1_1
				.setText("<html><body> A Description of the justification for the choice of a particular treatement,or<br>treatements..... ");
		label_2_1_1.setBounds(50, 5, 770, 38);
		panel_3_1_1.add(label_2_1_1);

		final JScrollPane scrollPane_1_1_1 = new JScrollPane();
		scrollPane_1_1_1.setBounds(50, 49, 730, 50);
		panel_3_1_1.add(scrollPane_1_1_1);

		txtTreatments = new JTextArea();
		scrollPane_1_1_1.setViewportView(txtTreatments);

		final JLabel label_4_1_1 = new JLabel();
		label_4_1_1.setForeground(new Color(128, 64, 64));
		label_4_1_1.setText("*");
		label_4_1_1.setBounds(25, 5, 26, 14);
		panel_3_1_1.add(label_4_1_1);

		final JPanel panel_3_1_1_1 = new JPanel();
		panel_3_1_1_1.setOpaque(false);
		panel_3_1_1_1.setLayout(null);
		panel_3_1_1_1.setBounds(10, 735, 780, 100);
		panel.add(panel_3_1_1_1);

		final JLabel label_2_1_1_1 = new JLabel();
		label_2_1_1_1.setForeground(new Color(128, 64, 64));
		label_2_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		label_2_1_1_1
				.setText("<html><body>Why the present dose is necesasary to manage the symptoms of the<br> resident.....");
		label_2_1_1_1.setBounds(50, 5, 770, 38);
		panel_3_1_1_1.add(label_2_1_1_1);

		final JScrollPane scrollPane_1_1_1_1 = new JScrollPane();
		scrollPane_1_1_1_1.setBounds(50, 49, 730, 50);
		panel_3_1_1_1.add(scrollPane_1_1_1_1);

		txtResident = new JTextArea();
		scrollPane_1_1_1_1.setViewportView(txtResident);

		final JLabel label_4_1_1_1 = new JLabel();
		label_4_1_1_1.setForeground(new Color(128, 64, 64));
		label_4_1_1_1.setText("*");
		label_4_1_1_1.setBounds(25, 5, 26, 14);
		panel_3_1_1_1.add(label_4_1_1_1);

		final JPanel panel_3_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1.setOpaque(false);
		panel_3_1_1_1_1.setLayout(null);
		panel_3_1_1_1_1.setBounds(10, 840, 780, 114);
		panel.add(panel_3_1_1_1_1);

		final JLabel label_2_1_1_1_1 = new JLabel();
		label_2_1_1_1_1.setForeground(new Color(128, 64, 64));
		label_2_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		label_2_1_1_1_1
				.setText("<html><body> Document the risk benifit to the resident when justifying the continueduse of<br> medication........");
		label_2_1_1_1_1.setBounds(50, 5, 770, 38);
		panel_3_1_1_1_1.add(label_2_1_1_1_1);

		final JScrollPane scrollPane_1_1_1_1_1 = new JScrollPane();
		scrollPane_1_1_1_1_1.setBounds(50, 49, 730, 50);
		panel_3_1_1_1_1.add(scrollPane_1_1_1_1_1);

		txtTreatments_2 = new JTextArea();
		scrollPane_1_1_1_1_1.setViewportView(txtTreatments_2);

		final JLabel label_4_1_1_1_1 = new JLabel();
		label_4_1_1_1_1.setForeground(new Color(128, 64, 64));
		label_4_1_1_1_1.setText("*");
		label_4_1_1_1_1.setBounds(25, 5, 26, 14);
		panel_3_1_1_1_1.add(label_4_1_1_1_1);

		final JLabel label_3 = new JLabel();
		label_3.setForeground(new Color(128, 64, 64));
		label_3.setFont(new Font("Arial", Font.PLAIN, 12));
		label_3
				.setText("<html><body>Clinically Contraindicated means the a resident need not undergo a gradual dose reduction or<br>behavioral interventionif;");
		label_3.setBounds(10, 321, 780, 33);
		panel.add(label_3);

		final JLabel label_1 = new JLabel();
		label_1.setForeground(new Color(128, 64, 64));
		label_1.setFont(new Font("Arial", Font.PLAIN, 12));
		label_1
				.setText("<html><body> 1.Physician justification why the continued use of the drug and the dose of the drug is<br>clinically appropriate.Please Compete;");
		label_1.setBounds(25, 360, 765, 32);
		panel.add(label_1);

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
		PanelPlazaHealthCare panel = new PanelPlazaHealthCare();
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
