package medrex.client.main.resident.census;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.Utils;
import medrex.commons.vo.census.CensusStatus;

public class PanelCensusStatus extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static Color GREEN = new Color(34, 139, 34);
	public static Color RED = Color.RED;
	public static Color GRAY = Color.GRAY;
	public static Color DEFAULT = Color.BLACK;

	private JLabel lblOutOfPass;
	private JLabel admissionStatusLabel_2;
	private JLabel lblSignInStatus;
	private JLabel admissionStatusLabel_1;
	private JLabel lblAdmissionStatus;
	private JLabel lblAdmission;
	private JLabel censusStatusLabel;

	private CensusStatus admission;
	private CensusStatus discharge;
	private CensusStatus signIn;
	private CensusStatus signOut;
	private boolean admittedOrDischarged;
	private boolean signedInOrOut;

	public PanelCensusStatus() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(400, 350));
		admission = null;
		discharge = null;
		signIn = null;
		signOut = null;

		censusStatusLabel = new JLabel();
		censusStatusLabel.setFont(new Font("", Font.BOLD, 20));
		censusStatusLabel.setHorizontalAlignment(SwingConstants.CENTER);
		censusStatusLabel.setForeground(PanelCensusStatus.DEFAULT);
		censusStatusLabel.setText("Census Status");
		censusStatusLabel.setBounds(10, 10, 380, 37);
		add(censusStatusLabel);

		lblAdmission = new JLabel();
		lblAdmission.setFont(new Font("", Font.BOLD, 18));
		lblAdmission.setText("Admission Status:");
		lblAdmission.setForeground(PanelCensusStatus.DEFAULT);
		lblAdmission.setBounds(10, 94, 380, 24);
		add(lblAdmission);

		lblAdmissionStatus = new JLabel();
		lblAdmissionStatus.setFont(new Font("", Font.BOLD, 16));
		lblAdmissionStatus.setForeground(PanelCensusStatus.GRAY);
		lblAdmissionStatus.setText("No Status");
		lblAdmissionStatus.setBounds(56, 124, 334, 24);
		add(lblAdmissionStatus);

		admissionStatusLabel_1 = new JLabel();
		admissionStatusLabel_1.setFont(new Font("", Font.BOLD, 18));
		admissionStatusLabel_1.setText("Sign In Status:");
		admissionStatusLabel_1.setForeground(PanelCensusStatus.DEFAULT);
		admissionStatusLabel_1.setBounds(10, 177, 380, 24);
		add(admissionStatusLabel_1);

		lblSignInStatus = new JLabel();
		lblSignInStatus.setFont(new Font("", Font.BOLD, 16));
		lblSignInStatus.setForeground(PanelCensusStatus.GRAY);
		lblSignInStatus.setText("No Status");
		lblSignInStatus.setBounds(56, 207, 334, 24);
		add(lblSignInStatus);

		admissionStatusLabel_2 = new JLabel();
		admissionStatusLabel_2.setFont(new Font("", Font.BOLD, 18));
		admissionStatusLabel_2.setText("Out On Pass:");
		admissionStatusLabel_2.setForeground(PanelCensusStatus.DEFAULT);
		admissionStatusLabel_2.setBounds(10, 260, 380, 24);
		add(admissionStatusLabel_2);

		lblOutOfPass = new JLabel();
		lblOutOfPass.setForeground(PanelCensusStatus.GRAY);
		lblOutOfPass.setFont(new Font("", Font.BOLD, 16));
		lblOutOfPass.setText("No Status");
		lblOutOfPass.setBounds(56, 290, 334, 24);
		add(lblOutOfPass);
		doUpdate();
	}

	public void doUpdate() {
		// false if discharged, true if admitted
		admittedOrDischarged = false;
		// false if signed out, true if signed in
		signedInOrOut = false;

		try {
			admission = MedrexClientManager.getInstance().getCensusStatus(
					Global.currentResidenceKey, "Admission");
			discharge = MedrexClientManager.getInstance().getCensusStatus(
					Global.currentResidenceKey, "Discharge");
			signIn = MedrexClientManager.getInstance().getCensusStatus(
					Global.currentResidenceKey, "Sign In");
			signOut = MedrexClientManager.getInstance().getCensusStatus(
					Global.currentResidenceKey, "Sign Out");
		} catch (Exception e1) {
			// e1.printStackTrace();
		}
		lblAdmissionStatus.setText("No Status");
		lblAdmissionStatus.setForeground(PanelCensusStatus.GRAY);
		lblSignInStatus.setText("No Status");
		lblSignInStatus.setForeground(PanelCensusStatus.GRAY);

		if (admission == null && discharge == null) { // when no entry is made
			admittedOrDischarged = false;
			signedInOrOut = false;
			lblAdmissionStatus.setText("No Status");
			lblAdmissionStatus.setForeground(PanelCensusStatus.GRAY);
			System.out.println("here: No admission status");
		}
		if (admission != null && discharge == null) { // when admitted, but
			// never discharged
			admittedOrDischarged = true;
			signedInOrOut = true;
			lblAdmissionStatus.setText("Admitted");
			lblAdmissionStatus.setForeground(PanelCensusStatus.GREEN);
			System.out.println("here: Admitted");
		}
		if (admission != null && discharge != null) { // when admitted and
			// discharged more than
			// once
			if (admission.getDateAndTime().before(discharge.getDateAndTime())) { // when
				// dischargeDate
				// is
				// after
				// admissionDate
				admittedOrDischarged = false;
				signedInOrOut = true;
				lblAdmissionStatus.setText("Discharge");
				lblAdmissionStatus.setForeground(PanelCensusStatus.RED);
			} else {
				admittedOrDischarged = true;
				signedInOrOut = false;
				lblAdmissionStatus.setText("Admitted");
				lblAdmissionStatus.setForeground(PanelCensusStatus.GREEN);
			}
		}
		if (signOut == null) { // neither signedOut, nor signedIn
			signedInOrOut = true;
			lblSignInStatus.setText("No Status");
			lblSignInStatus.setForeground(PanelCensusStatus.GRAY);
			System.out.println("here: No signing status");
		}
		if (signOut == null && admission != null && discharge == null) { // neither
			// signedOut,
			// nor
			// signedIn
			signedInOrOut = true;
			lblSignInStatus.setText("In");
			lblSignInStatus.setForeground(PanelCensusStatus.GREEN);
		}
		if (signIn == null && signOut != null) { // signed Out, but not signed
			// in
			signedInOrOut = false;
			SimpleDateFormat df = new SimpleDateFormat(
					"MMM dd, yyyy  'at'  hh':'mm a");
			lblSignInStatus.setText("Out since: "
					+ df.format(signOut.getDateAndTime()));
			lblSignInStatus.setForeground(PanelCensusStatus.RED);
		}
		if (signIn != null && signOut != null) { // signed Out and signed In
			// more than once
			if (signOut.getDateAndTime().before(signIn.getDateAndTime())) {
				signedInOrOut = true;
				lblSignInStatus.setText("In");
				lblSignInStatus.setForeground(PanelCensusStatus.GREEN);
			} else {
				signedInOrOut = false;
				SimpleDateFormat df = new SimpleDateFormat(
						"MMM dd, yyyy  'at'  hh':'mm a");
				lblSignInStatus.setText("Out since: "
						+ df.format(signOut.getDateAndTime()));
				lblSignInStatus.setForeground(PanelCensusStatus.RED);
			}
		}

		// out of pass calculation
		if (admission == null) {
			lblOutOfPass.setText("No Status");
			lblOutOfPass.setForeground(PanelCensusStatus.GRAY);
		}
		if (admission != null && discharge == null) {
			lblOutOfPass.setText("- N/A -");
			lblOutOfPass.setForeground(PanelCensusStatus.GREEN);
		}
		if (admission != null && discharge != null) {
			int noOfDays = 0;
			// assuming if admissionDate > dischargeDate
			System.out.println(admission.getDateAndTime()
					+ " > "
					+ discharge.getDateAndTime()
					+ " = "
					+ (admission.getDateAndTime().compareTo(
							discharge.getDateAndTime()) > 0));
			if (admission.getDateAndTime()
					.compareTo(discharge.getDateAndTime()) > 0) {
				try {
					CensusStatus curD = null, curA = null;
					noOfDays = 0;
					List d = MedrexClientManager.getInstance()
							.getCensusStatuss(Global.currentResidenceKey,
									"Discharge");
					List a = MedrexClientManager.getInstance()
							.getCensusStatuss(Global.currentResidenceKey,
									"Admission");
					Iterator dItr = d.iterator();
					Iterator aItr = a.iterator();
					while (dItr.hasNext()) {
						curD = (CensusStatus) dItr.next();
						curA = (CensusStatus) aItr.next();
						noOfDays += Utils.DateDifference(curA.getDateAndTime(),
								curD.getDateAndTime());
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else { // if dischargeDate <= admissionDate
				try {
					CensusStatus curD = null, curA = null;
					noOfDays = 0;
					List d = MedrexClientManager.getInstance()
							.getCensusStatuss(Global.currentResidenceKey,
									"Discharge");
					List a = MedrexClientManager.getInstance()
							.getCensusStatuss(Global.currentResidenceKey,
									"Admission");
					Iterator dItr = d.iterator();
					Iterator aItr = a.iterator();
					curD = (CensusStatus) dItr.next();
					Date curDate = MedrexClientManager.getServerTime();
					if (curD.getDateAndTime().before(curDate)) {
						noOfDays += Utils.DateDifference(curDate, curD
								.getDateAndTime());
					}
					while (dItr.hasNext()) {
						curD = (CensusStatus) dItr.next();
						curA = (CensusStatus) aItr.next();
						noOfDays += Utils.DateDifference(curA.getDateAndTime(),
								curD.getDateAndTime());
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			// if (noOfDays > 0) {
			// lblOutOfPass.setText(noOfDays + " days");
			// lblOutOfPass.setForeground(PanelCensusStatus.GREEN);
			// if (noOfDays > 21) {
			// lblOutOfPass.setForeground(PanelCensusStatus.RED);
			// }
			// } else {
			lblOutOfPass.setText("None");
			lblOutOfPass.setForeground(PanelCensusStatus.GREEN);
			// }
		}
		/*
		 * if(admission != null) { lblAdmissionStatus.setText("Admitted");
		 * admittedOrDischarged = true;
		 * lblAdmissionStatus.setForeground(PanelCensusStatus.GREEN);
		 * if(discharge != null) {
		 * if(admission.getDateAndTime().before(discharge.getDateAndTime())) {
		 * admittedOrDischarged = true; lblAdmissionStatus.setText("Admitted");
		 * lblAdmissionStatus.setForeground(PanelCensusStatus.GREEN); { int days
		 * = Utils.DateDifference(discharge.getDateAndTime(),
		 * admission.getDateAndTime()); lblOutOfPass.setText(days + " days");
		 * if(days >= 21) lblOutOfPass.setForeground(PanelCensusStatus.RED);
		 * else lblOutOfPass.setForeground(PanelCensusStatus.GREEN); } } else {
		 * admittedOrDischarged = false;
		 * lblAdmissionStatus.setText("Discharged");
		 * lblAdmissionStatus.setForeground(PanelCensusStatus.RED); { int days =
		 * Utils.DateDifference(MedrexClientManager.getServerTime(),
		 * admission.getDateAndTime()); lblOutOfPass.setText(days + " days");
		 * if(days >= 21) lblOutOfPass.setForeground(PanelCensusStatus.RED);
		 * else lblOutOfPass.setForeground(PanelCensusStatus.GREEN); } } } else
		 * { admittedOrDischarged = false; } if(signIn != null) { signedInOrOut
		 * = true; lblSignInStatus.setText("In");
		 * lblSignInStatus.setForeground(PanelCensusStatus.GREEN); if(signOut !=
		 * null) { if(signIn.getDateAndTime().before(signOut.getDateAndTime()))
		 * { Date d = signOut.getDateAndTime(); if(d != null) { signedInOrOut =
		 * false; SimpleDateFormat df = new
		 * SimpleDateFormat("MMM dd, yyyy  'AT'  hh':'mm a");
		 * lblSignInStatus.setText("Out since: " + df.format(d));
		 * lblSignInStatus.setForeground(PanelCensusStatus.RED); } } } } else {
		 * signedInOrOut = false; lblSignInStatus.setText("- N/A -");
		 * lblSignInStatus.setForeground(PanelCensusStatus.GRAY); }
		 * 
		 * } else { Global.currentCensusStatus = new CensusStatus();
		 * Global.currentCensusStatus.setResidentId(Global.currentResidenceKey);
		 * }
		 */
	}

	public boolean isAdmittedOrDischarged() {
		return admittedOrDischarged;
	}

	public boolean isSignedInOrOut() {
		return signedInOrOut;
	}
}