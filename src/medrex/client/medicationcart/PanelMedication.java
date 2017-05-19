package medrex.client.medicationcart;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.admin.UserLogon;
import medrex.commons.vo.medicationCart.MedicationView;
import medrex.commons.vo.others.Users;

import com.sX.swing.JxButton;

public class PanelMedication extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2887224036041280519L;
	private JLabel imageLabel;
	private JLabel lblMedication;
	private JLabel lblAcceptOrDecline2;
	private JLabel lblAcceptOrDecline1;
	private JLabel lblAcceptOrDecline;
	private JLabel lblDcDate;
	private JLabel lblOrderDate;
	private JLabel lblPRN;
	private JLabel lblAA;
	private JLabel lblFrequency;
	private JLabel lblRA;
	private JLabel lblDose;
	private JLabel lblDiagnosis;
	private JLabel lblDoctorName;
	private JxButton declineButton;
	private JxButton confirmButton;
	private int rowNo = 0;
	private static final Color BACKGROUND = new Color(231, 234, 234);
	private static final Color FOREGROUND = new Color(0, 69, 97);
	private static final Border BORDER = new LineBorder(
			new Color(122, 154, 167), 2, false);
	MedicationView row = null;

	public PanelMedication() {
		super();
		Global.panelMedication = this;
		setDoubleBuffered(true);
		setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		setLayout(null);
		setBackground(Color.WHITE);
		setSize(614, 99);

		// JSeparator js=new JSeparator(SwingConstants.HORIZONTAL);
		// js.setBounds(40, 95, 570, 10);
		// js.setForeground(ColorConstants.DEF_COLOR);
		// add(js);

		// final JCheckBox lipitorCheckBox = new JCheckBox();
		// lipitorCheckBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		// lipitorCheckBox.setForeground(ColorConstants.DEF_COLOR);
		// lipitorCheckBox.setOpaque(false);
		// lipitorCheckBox.setText("Lipitor");
		// lipitorCheckBox.setBounds(10, 20, 116, 22);
		// add(lipitorCheckBox);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(10, 20, 158, 69);
		add(panel);

		final JLabel doctorLabel = new JLabel();
		doctorLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		doctorLabel.setText("Doctor");
		doctorLabel.setForeground(ColorConstants.DEF_COLOR);
		doctorLabel.setBounds(5, 5, 54, 14);
		panel.add(doctorLabel);

		final JLabel diagnosisLabel = new JLabel();
		diagnosisLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		diagnosisLabel.setText("Diagnosis");
		diagnosisLabel.setForeground(ColorConstants.DEF_COLOR);
		diagnosisLabel.setBounds(5, 30, 65, 14);
		panel.add(diagnosisLabel);

		final JLabel doseLabel = new JLabel();
		doseLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		doseLabel.setText("Dose");
		doseLabel.setForeground(ColorConstants.DEF_COLOR);
		doseLabel.setBounds(5, 50, 54, 14);
		panel.add(doseLabel);

		lblDoctorName = new JLabel();
		lblDoctorName.setText("Richard Lee");
		lblDoctorName.setForeground(new Color(198, 67, 37));
		lblDoctorName.setBounds(70, 5, 88, 16);
		panel.add(lblDoctorName);

		lblDiagnosis = new JLabel();
		lblDiagnosis.setText("High Cholestrol");
		lblDiagnosis.setForeground(new Color(198, 67, 37));
		lblDiagnosis.setBounds(70, 30, 88, 16);
		panel.add(lblDiagnosis);

		lblDose = new JLabel();
		lblDose.setText("75Mg");
		lblDose.setForeground(new Color(198, 67, 37));
		lblDose.setBounds(70, 50, 88, 16);
		panel.add(lblDose);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(168, 20, 177, 69);
		add(panel_1);

		final JLabel raLabel = new JLabel();
		raLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		raLabel.setText("RA");
		raLabel.setForeground(ColorConstants.DEF_COLOR);
		raLabel.setBounds(5, 5, 54, 14);
		panel_1.add(raLabel);

		final JLabel frequencyLabel = new JLabel();
		frequencyLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		frequencyLabel.setText("Frequency");
		frequencyLabel.setForeground(ColorConstants.DEF_COLOR);
		frequencyLabel.setBounds(5, 30, 62, 14);
		panel_1.add(frequencyLabel);

		final JLabel aaLabel = new JLabel();
		aaLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		aaLabel.setForeground(ColorConstants.DEF_COLOR);
		aaLabel.setText("AA:");
		aaLabel.setBounds(5, 50, 54, 14);
		panel_1.add(aaLabel);

		lblRA = new JLabel();
		lblRA.setText("Mouth");
		lblRA.setForeground(new Color(198, 67, 37));
		lblRA.setBounds(70, 5, 107, 16);
		panel_1.add(lblRA);

		lblFrequency = new JLabel();
		lblFrequency.setText("2x Daily");
		lblFrequency.setForeground(new Color(198, 67, 37));
		lblFrequency.setBounds(70, 30, 107, 16);
		panel_1.add(lblFrequency);

		lblAA = new JLabel();
		lblAA.setText("XXXX");
		lblAA.setForeground(new Color(198, 67, 37));
		lblAA.setBounds(70, 50, 107, 16);
		panel_1.add(lblAA);

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(344, 20, 158, 69);
		add(panel_2);

		final JLabel prnnLabel = new JLabel();
		prnnLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		prnnLabel.setText("PRN-n:");
		prnnLabel.setForeground(ColorConstants.DEF_COLOR);
		prnnLabel.setBounds(5, 5, 54, 14);
		panel_2.add(prnnLabel);

		final JLabel orderDateLabel = new JLabel();
		orderDateLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		orderDateLabel.setText("Order Date:");
		orderDateLabel.setForeground(ColorConstants.DEF_COLOR);
		orderDateLabel.setBounds(5, 30, 71, 14);
		panel_2.add(orderDateLabel);

		final JLabel dcDateLabel = new JLabel();
		dcDateLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		dcDateLabel.setText("Dc Date:");
		dcDateLabel.setForeground(ColorConstants.DEF_COLOR);
		dcDateLabel.setBounds(5, 50, 54, 14);
		panel_2.add(dcDateLabel);

		lblPRN = new JLabel();
		lblPRN.setText("XXXX");
		lblPRN.setForeground(new Color(198, 67, 37));
		lblPRN.setBounds(77, 5, 77, 16);
		panel_2.add(lblPRN);

		lblOrderDate = new JLabel();
		lblOrderDate.setText("10/29/09");
		lblOrderDate.setForeground(new Color(198, 67, 37));
		lblOrderDate.setBounds(77, 30, 77, 16);
		panel_2.add(lblOrderDate);

		lblDcDate = new JLabel();
		lblDcDate.setText("11/29/09");
		lblDcDate.setForeground(new Color(198, 67, 37));
		lblDcDate.setBounds(77, 50, 77, 16);
		panel_2.add(lblDcDate);

		confirmButton = new JxButton();
		confirmButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent arg0) {
				// System.out.println("Confirm Clicked");
				doAccept();
				confirmButton.setVisible(false);
				declineButton.setVisible(false);
				UpdateMedicationStatus(confirmButton.getText());

			}
		});

		confirmButton.setText("Confirm");
		confirmButton.setBounds(549, 10, 55, 20);
		confirmButton.setBorderPainted(false);
		confirmButton.setGlassyPainted(true);
		confirmButton.setBackground(BACKGROUND);
		confirmButton.setForeground(FOREGROUND);
		confirmButton.setBorder(BORDER);
		confirmButton.setArc(0.6f);
		add(confirmButton);

		declineButton = new JxButton();
		declineButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doDecline();
				confirmButton.setVisible(false);
				declineButton.setVisible(false);
				UpdateMedicationStatus(declineButton.getText());
			}
		});
		declineButton.setText("Decline");
		declineButton.setBounds(549, 58, 55, 20);
		declineButton.setBorderPainted(false);
		declineButton.setGlassyPainted(true);
		declineButton.setBackground(BACKGROUND);
		declineButton.setForeground(FOREGROUND);
		declineButton.setBorder(BORDER);
		declineButton.setArc(0.6f);
		add(declineButton);

		lblAcceptOrDecline1 = new JLabel();
		lblAcceptOrDecline1.setText("");
		lblAcceptOrDecline1.setBounds(500, 62, 114, 16);
		lblAcceptOrDecline1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblAcceptOrDecline1.setForeground(ColorConstants.DEF_COLOR);
		add(lblAcceptOrDecline1);

		lblAcceptOrDecline = new JLabel();
		lblAcceptOrDecline.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAcceptOrDecline.setForeground(ColorConstants.DEF_COLOR);
		lblAcceptOrDecline.setBounds(504, 10, 107, 16);
		add(lblAcceptOrDecline);
		lblAcceptOrDecline.setText("");

		lblAcceptOrDecline2 = new JLabel();
		lblAcceptOrDecline2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAcceptOrDecline2.setForeground(ColorConstants.DEF_COLOR);
		lblAcceptOrDecline2.setText("");
		lblAcceptOrDecline2.setBounds(504, 36, 110, 16);
		add(lblAcceptOrDecline2);

		lblMedication = new JLabel();
		lblMedication.setText("New JLabel");
		lblMedication.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblMedication.setForeground(new Color(198, 67, 37));
		lblMedication.setBounds(40, 0, 177, 19);
		add(lblMedication);

	}

	public void doAccept() {
		// System.out.println("in do Accept--going to doSave");
		Global.panelPhysicianOrder.doSave(true, row);
	}

	public void doDecline() {
		Global.panelPhysicianOrder.doSave(false, row);
	}

	public void updateLabels(MedicationView pOrderForm3) {
		// System.out.println("Phy order form row"+pOrderForm3);
		// System.out.println("pOrderForm3.getDiagnosis()"+pOrderForm3.getDiagnosis());
		// System.out.println("Dosage:"+ pOrderForm3.getPhyDosage());
		// System.out.println("RA"+pOrderForm3.getPhyRoute());
		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern("MM/dd/yyyy");
		lblDiagnosis.setText(pOrderForm3.getMedication());
		lblDose.setText(pOrderForm3.getDosage() + "");
		lblRA.setText(pOrderForm3.getRoute());
		lblFrequency.setText(pOrderForm3.getFrequency() + "");
		lblAA.setText(pOrderForm3.getDosage() + "");
		lblPRN.setText(pOrderForm3.getPrnIndicator() + "");
		lblOrderDate.setText("" + df.format(pOrderForm3.getOrderDate()));
		lblDcDate.setText("" + df.format(pOrderForm3.getEndDate()));
		row = pOrderForm3;
		lblMedication.setText(pOrderForm3.getMedication());
	}

	public void UpdateMedicationStatus(String status) {
		UserLogon ul = new UserLogon();
		Users user = new Users();
		try {
			ul = MedrexClientManager.getInstance().getcurrentUserLogon();
			user = MedrexClientManager.getInstance().getUser(ul.getUserId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		// System.out.println("in Update Medication Status");
		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern("MM/dd/yyyy hh:mm:a");
		// System.out.println("Status:"+status);
		if (status.equalsIgnoreCase("Confirm")) {

			// System.out.println("Status if:");
			this.lblAcceptOrDecline.setText("Accepted By:");
			this.lblAcceptOrDecline2.setText(user.getUserName() + " On");
			confirmButton.setVisible(false);
			this.declineButton.setVisible(false);
			imageLabel = new JLabel(new ImageIcon("img/tick.jpg"));
			imageLabel.setBounds(10, 3, 30, 16);
			add(imageLabel);
			repaint();
		} else {
			lblAcceptOrDecline.setText("Declined By:");
			lblAcceptOrDecline.setForeground(new Color(198, 67, 37));
			lblAcceptOrDecline2.setText(user.getUserName() + " On");
			lblAcceptOrDecline2.setForeground(new Color(198, 67, 37));
			imageLabel = new JLabel(new ImageIcon("img/cross.jpg"));
			imageLabel.setBounds(10, 3, 30, 16);
			add(imageLabel);
			confirmButton.setVisible(false);
			declineButton.setVisible(false);
		}
		lblAcceptOrDecline1.setText(""
				+ df.format(MedrexClientManager.getServerTime()));
	}
}
