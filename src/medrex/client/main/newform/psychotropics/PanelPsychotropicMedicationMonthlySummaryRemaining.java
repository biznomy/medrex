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
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.commons.intf.Form;

import com.toedter.calendar.JDateChooser;

public class PanelPsychotropicMedicationMonthlySummaryRemaining extends JPanel
		implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3828925712778288832L;
	private JLabel lblDate;
	private JDateChooser dcDateChooser;
	private JTextField txtNurseSignature;
	private JLabel lblNurseSignature;
	private JTextArea txtTextArea;

	public PanelPsychotropicMedicationMonthlySummaryRemaining() {
		super();
		setBorder(new LineBorder(Color.black, 1, false));
		setLayout(null);
		setPreferredSize(new Dimension(800, 1000));
		setBackground(new Color(254, 252, 252));

		final JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setOpaque(false);
		panel.setLayout(null);
		panel.setBounds(1, 1, 798, 998);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setLayout(null);
		panel_1.setBounds(22, 21, 766, 197);
		panel.add(panel_1);

		final JLabel clarifyAnyBehavioralLabel = new JLabel();
		clarifyAnyBehavioralLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		clarifyAnyBehavioralLabel.setText("Clarify any behavioral concerns:");
		clarifyAnyBehavioralLabel.setBounds(50, 10, 234, 16);
		panel_1.add(clarifyAnyBehavioralLabel);

		final JLabel label = new JLabel();
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setText("6.");
		label.setBounds(10, 10, 24, 16);
		panel_1.add(label);

		final JLabel label_1 = new JLabel();
		label_1
				.setText("<html><body>(* secify types of delusions,hallucinations;describe how the resident is negatively affected by<br>the behavior ");
		label_1.setBounds(86, 32, 580, 32);
		panel_1.add(label_1);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 81, 746, 106);
		panel_1.add(scrollPane);

		txtTextArea = new JTextArea();
		scrollPane.setViewportView(txtTextArea);

		final JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setLayout(null);
		panel_2.setBounds(20, 240, 766, 102);
		panel.add(panel_2);

		lblNurseSignature = new JLabel();
		lblNurseSignature.setFont(new Font("Arial", Font.BOLD, 12));
		lblNurseSignature.setText("Nurse Signature:");
		lblNurseSignature.setBounds(10, 10, 110, 16);
		panel_2.add(lblNurseSignature);

		txtNurseSignature = new JTextField();
		txtNurseSignature.setBounds(126, 10, 171, 21);
		panel_2.add(txtNurseSignature);

		lblDate = new JLabel();
		lblDate.setFont(new Font("Arial", Font.BOLD, 12));
		lblDate.setText("Date:");
		lblDate.setBounds(420, 10, 54, 16);
		panel_2.add(lblDate);

		dcDateChooser = new JDateChooser();
		dcDateChooser.setBounds(462, 10, 181, 21);
		panel_2.add(dcDateChooser);

		final JLabel label_2 = new JLabel();
		label_2.setFont(new Font("Arial", Font.BOLD, 12));
		label_2.setText("10/09 SG");
		label_2.setBounds(10, 43, 64, 16);
		panel_2.add(label_2);
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
		PanelPsychotropicMedicationMonthlySummaryRemaining panel = new PanelPsychotropicMedicationMonthlySummaryRemaining();
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
