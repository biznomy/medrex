package medrex.client.MedicationAndTreatment.RoutineTreatment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import medrex.client.MedicationAndTreatment.PRNmedication.PanelMedicationPRNReason;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.PopUpView;

import com.sX.swing.JxButton;

public class PanelCautionTreatmentPopUp extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6537525211947415631L;
	private JCheckBox cbAcknowledge;
	private int status = 0;
	protected String medicationType;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String getTitle() {

		return "CAUTION";
	}

	public PanelCautionTreatmentPopUp(String medicationType) {
		super();
		setSize(400, 342);
		setLayout(new BorderLayout());
		setBackground(Color.LIGHT_GRAY);
		this.medicationType = medicationType;
		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setPreferredSize(new Dimension(0, 60));
		add(panel, BorderLayout.NORTH);

		final JLabel cautionLabel = new JLabel(new ImageIcon(
				"img//caution1.png"));
		cautionLabel.setForeground(ColorConstants.DEF_COLOR);
		cautionLabel.setFont(new Font("", Font.BOLD, 17));
		cautionLabel.setText("");
		panel.add(cautionLabel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		add(panel_1, BorderLayout.CENTER);

		cbAcknowledge = new JCheckBox();
		cbAcknowledge.setForeground(ColorConstants.DEF_COLOR);
		cbAcknowledge.setBackground(Color.WHITE);
		cbAcknowledge.setFont(new Font("", Font.BOLD, 12));
		cbAcknowledge.setText("I Acknowledge The Same");
		cbAcknowledge.setBounds(30, 166, 188, 24);
		panel_1.add(cbAcknowledge);

		final JxButton acceptButton = new JxButton();
		acceptButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				// 1 stands for acceptance
				if ("RM"
						.equalsIgnoreCase(PanelCautionTreatmentPopUp.this.medicationType)) {
					if (cbAcknowledge.isSelected()) {
						setStatus(1);
						Global.frameMedicationDashboard.setCurrentIndex(4);
						Global.frameMedicationDashboard.reDrawTheFrame();
						close();
					} else {
						JOptionPane.showMessageDialog(null,
								"check for Acknowledgement");
					}
				}
				if ("PRN"
						.equalsIgnoreCase(PanelCautionTreatmentPopUp.this.medicationType)) {
					if (cbAcknowledge.isSelected()) {
						setStatus(1);
						SwingUtils.openInDialog(new PanelMedicationPRNReason(
								Global.frameMedicationDashboard
										.getCurrentMedication()));
						close();
					} else {
						JOptionPane.showMessageDialog(null,
								"check for Acknowledgement");
					}
				}
			}
		});
		acceptButton.setFont(new Font("Dialog", Font.BOLD, 12));
		acceptButton.setForeground(ColorConstants.DEF_COLOR);
		acceptButton.setBackground(Color.WHITE);
		acceptButton.setArc(0.4f);
		acceptButton.setText("Accept");
		acceptButton.setBounds(26, 212, 102, 26);
		panel_1.add(acceptButton);

		final JxButton declineButton = new JxButton();
		declineButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				// 2 stands for decline
				setStatus(2);
				Global.frameMedicationDashboard.setCurrentIndex(6);
				Global.frameMedicationDashboard.reDrawTheFrame();
				close();
			}
		});
		declineButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		declineButton.setForeground(ColorConstants.DEF_COLOR);
		declineButton.setBackground(Color.WHITE);
		declineButton.setArc(0.4f);
		declineButton.setText("Decline");
		declineButton.setBounds(149, 212, 102, 26);
		panel_1.add(declineButton);

		final JxButton okButton = new JxButton();
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
				Global.frameMedicationDashboard.setCurrentIndex(3);
				Global.frameMedicationDashboard.reDrawTheFrame();
			}
		});
		okButton.setForeground(ColorConstants.DEF_COLOR);
		okButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		okButton.setBackground(Color.WHITE);
		okButton.setArc(0.4f);
		okButton.setText("OK");
		okButton.setBounds(273, 212, 94, 26);
		panel_1.add(okButton);

		final JTextArea thisMedicationShouldLabel = new JTextArea();
		thisMedicationShouldLabel.setForeground(ColorConstants.MED_COLOR);
		thisMedicationShouldLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		thisMedicationShouldLabel.setLineWrap(true);
		thisMedicationShouldLabel.setBorder(new LineBorder(Color.black, 1,
				false));

		String cautionName = "";
		try {
			cautionName = MedrexClientManager.getInstance().getCautionaryName(
					Global.frameMedicationDashboard.getCurrentMedication()
							.getMedicationId());
		} catch (RemoteException e1) {
			e1.printStackTrace();
		} catch (MedrexException e1) {
			e1.printStackTrace();
		}
		thisMedicationShouldLabel.setText(cautionName);
		thisMedicationShouldLabel.setBounds(30, 26, 337, 123);
		panel_1.add(thisMedicationShouldLabel);
	}

	public static void main(String ar[]) {
		// SwingUtils.wrapInDialog(new PanelCautionPopUp()).setVisible(true);

	}

}
