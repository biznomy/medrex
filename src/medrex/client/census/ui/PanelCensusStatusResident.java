package medrex.client.census.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.rmi.RemoteException;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.CensusStatusForResident;
import medrex.commons.vo.resident.ResidentMain;

public class PanelCensusStatusResident extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8374591092276698054L;

	public static Color GREEN = new Color(34, 139, 34);
	public static Color RED = Color.RED;
	public static Color GRAY = Color.GRAY;
	public static Color DEFAULT = Color.BLACK;

	private JLabel lblOutOfPassStatus;
	private JLabel lblOutOfPass;
	private JLabel lblSignInStatus;
	private JLabel lblSignIn;
	private JLabel lblAdmissionStatus;
	private JLabel lblAdmission;

	private CensusStatusForResident refCensusStatus;

	private ResidentMain resident;

	public PanelCensusStatusResident() {
		super();
		setOpaque(false);
		final GridLayout gridLayout = new GridLayout(0, 1);
		gridLayout.setVgap(3);
		gridLayout.setHgap(3);
		setLayout(gridLayout);
		// Global.panelCensusStatusResident=this;
		setPreferredSize(new Dimension(295, 145));

		lblAdmission = new JLabel();
		final EmptyBorder emptyBorder = new EmptyBorder(3, 3, 3, 3);
		lblAdmission.setBorder(emptyBorder);
		lblAdmission.setFont(new Font("", Font.BOLD, 14));
		lblAdmission.setText("Admission Status:");
		add(lblAdmission);

		lblAdmissionStatus = new JLabel();
		lblAdmissionStatus.setBorder(emptyBorder);
		lblAdmissionStatus.setFont(new Font("", Font.BOLD, 12));
		lblAdmissionStatus.setForeground(PanelCensusStatusResident.GRAY);
		lblAdmissionStatus.setText("No Status");
		add(lblAdmissionStatus);

		lblSignIn = new JLabel();
		lblSignIn.setFont(new Font("", Font.BOLD, 14));
		lblSignIn.setBorder(emptyBorder);
		lblSignIn.setText("Sign In Status:");
		lblSignIn.setForeground(PanelCensusStatusResident.DEFAULT);
		add(lblSignIn);

		lblSignInStatus = new JLabel();
		lblSignInStatus.setBorder(emptyBorder);
		lblSignInStatus.setFont(new Font("", Font.BOLD, 12));
		lblSignInStatus.setForeground(PanelCensusStatusResident.GRAY);
		lblSignInStatus.setText("No Status");
		add(lblSignInStatus);

		lblOutOfPass = new JLabel();
		lblOutOfPass.setBorder(emptyBorder);
		lblOutOfPass.setFont(new Font("", Font.BOLD, 14));
		lblOutOfPass.setText("Out On Pass:");
		lblOutOfPass.setForeground(PanelCensusStatusResident.DEFAULT);
		add(lblOutOfPass);

		lblOutOfPassStatus = new JLabel();
		lblOutOfPassStatus.setBorder(emptyBorder);
		lblOutOfPassStatus.setForeground(PanelCensusStatusResident.GRAY);
		lblOutOfPassStatus.setFont(new Font("", Font.BOLD, 12));
		lblOutOfPassStatus.setText("No Status");
		add(lblOutOfPassStatus);
		doUpdate();
	}

	public void doUpdate() {

		int currentResidenceKey = 0;
		if (resident != null) {
			currentResidenceKey = resident.getSerial();
		}

		refCensusStatus = null;

		try {
			refCensusStatus = MedrexClientManager.getInstance()
					.getCensusStatusForResident(currentResidenceKey);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MedrexException e) {
			e.printStackTrace();
		}

		if (refCensusStatus != null) {
			lblAdmissionStatus
					.setText(refCensusStatus.getAdmissionStatusDesc());
			lblAdmissionStatus.setForeground(refCensusStatus
					.getAdmissionSeverity().getColor());
			lblSignInStatus.setText(refCensusStatus.getSignInStatusDesc());
			lblSignInStatus.setForeground(refCensusStatus.getSignInSeverity()
					.getColor());
			lblOutOfPassStatus
					.setText(refCensusStatus.getOutOnPassStatusDesc());
			lblOutOfPassStatus.setForeground(refCensusStatus
					.getOutOnPassSeverity().getColor());
		}
	}

	public boolean isAdmittedOrDischarged() {
		return refCensusStatus.isAdmissionStatus();
	}

	public boolean isSignedInOrOut() {
		return refCensusStatus.isSignInStatus();
	}

	public boolean isDischargeToHospital() {
		return refCensusStatus.isDischargeToHospital();
	}

	@Override
	public void setForeground(Color fg) {
		super.setForeground(fg);
		if (fg != null && lblAdmission != null && lblSignIn != null
				&& lblOutOfPass != null) {
			try {
				lblAdmission.setForeground(fg);
				lblSignIn.setForeground(fg);
				lblOutOfPass.setForeground(fg);
			} catch (NullPointerException e) {
				System.err
						.println("NullPointerException: initialize the labels first\n");
			}
		}
	}

	@Override
	public void setFont(Font font) {
		super.setFont(font);
		if (font != null && lblAdmission != null && lblSignIn != null
				&& lblOutOfPass != null && lblAdmissionStatus != null
				&& lblSignInStatus != null && lblOutOfPassStatus != null) {
			try {
				Font f = font.deriveFont(font.getSize() - 2).deriveFont(
						Font.BOLD);
				lblAdmission.setFont(font);
				lblAdmissionStatus.setFont(f);
				lblSignIn.setFont(font);
				lblSignInStatus.setFont(f);
				lblOutOfPass.setFont(font);
				lblOutOfPassStatus.setFont(f);
			} catch (NullPointerException e) {
				System.err
						.println("NullPointerException: initialize the labels first\n");
			}
		}
	}

	public void setHorizontalAlignment(int alignment) {
		lblAdmission.setHorizontalAlignment(alignment);
		lblAdmissionStatus.setHorizontalAlignment(alignment);
		lblSignIn.setHorizontalAlignment(alignment);
		lblSignInStatus.setHorizontalAlignment(alignment);
		lblOutOfPass.setHorizontalAlignment(alignment);
		lblOutOfPassStatus.setHorizontalAlignment(alignment);
	}

	/**
	 * @return the resident
	 */
	public ResidentMain getResident() {
		return resident;
	}

	/**
	 * @param resident
	 *            the resident to set
	 */
	public void setResident(ResidentMain resident) {
		this.resident = resident;
		doUpdate();
		this.repaint();
	}
}
