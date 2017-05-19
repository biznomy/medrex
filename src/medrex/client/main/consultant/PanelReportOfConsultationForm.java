package medrex.client.main.consultant;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.rmi.RemoteException;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.UserLogon;
import medrex.commons.vo.consultant.ReportOfConsultationForm;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.resident.ResidentMain;

import com.toedter.calendar.JDateChooser;

public class PanelReportOfConsultationForm extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 108708151146626387L;
	private JLabel diagnosisLabel_5;
	private JLabel r404Label;
	private JLabel from63Label;
	private JPanel panel_9;
	JComboBox cmbSignaturePhysician;
	private JComboBox cmbSignatureConsultant;
	private JLabel diagnosisLabel_4;
	private JTextField txtDoctor;
	private JLabel diagnosisLabel_3;
	private JDateChooser dcDateOfConsultation;
	private JLabel diagnosisLabel_2;
	private JTextArea txtRecommendations;
	private JLabel diagnosisLabel_1;
	private JTextArea txtDiagnosis;
	private JLabel diagnosisLabel;
	private JTextArea txtFindings;
	private JLabel lastNameLabel_9;
	private JLabel reportOfConsultationLabel_1;
	private JPanel panel_8;
	private JLabel lastNameLabel_8;
	private JTextArea txtReportRequested;
	private JLabel lastNameLabel_7;
	private JPanel panel_6;
	private JDateChooser dcReportDate;
	private JLabel dateLabel;
	private JTextField txtToConsulting;
	private JLabel lastNameLabel_6;
	private JTextField txtFromAttending;
	private JLabel lastNameLabel_5;
	private JTextField txtRecordNo;
	private JLabel lastNameLabel_4;
	private JTextField txtRoomNo;
	private JLabel lastNameLabel_3;
	private JPanel panel_7;
	private JPanel panel_5;
	private JPanel panel_3;
	private JTextField txtMiddleName;
	private JLabel lastNameLabel_2;
	private JTextField txtFirstName;
	private JLabel lastNameLabel_1;
	private JTextField txtLastName;
	private JLabel lastNameLabel;
	private JPanel panel_4;
	private JPanel panel_2;
	private JPanel panel_1;
	private JPanel panel;
	private JLabel reportOfConsultationLabel;

	/**
	 * Create the panel
	 */
	public PanelReportOfConsultationForm() {
		super();
		Global.panelReportOfConsultationForm = this;
		setPreferredSize(new Dimension(900, 1000));
		setFont(new Font("", Font.BOLD, 16));
		setBackground(Color.WHITE);
		setLayout(null);

		reportOfConsultationLabel = new JLabel();
		reportOfConsultationLabel.setFont(new Font("", Font.BOLD, 16));
		reportOfConsultationLabel.setText("REPORT OF CONSULTATION");
		reportOfConsultationLabel.setBounds(326, 24, 226, 19);
		add(reportOfConsultationLabel);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(5, 49, 877, 1000);
		add(panel);

		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 861, 61);
		panel.add(panel_1);

		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(0, 2, 861, 29);
		panel_1.add(panel_2);

		lastNameLabel = new JLabel();
		lastNameLabel.setText("Last Name");
		lastNameLabel.setBounds(2, 0, 54, 14);
		panel_2.add(lastNameLabel);

		txtLastName = new JTextField();
		txtLastName.setEditable(false);
		txtLastName.setBackground(Color.WHITE);
		txtLastName.setBounds(60, 3, 145, 20);
		panel_2.add(txtLastName);

		lastNameLabel_1 = new JLabel();
		lastNameLabel_1.setText("First");
		lastNameLabel_1.setBounds(220, 1, 33, 14);
		panel_2.add(lastNameLabel_1);

		txtFirstName = new JTextField();
		txtFirstName.setBackground(Color.WHITE);
		txtFirstName.setEditable(false);
		txtFirstName.setBounds(259, 3, 145, 20);
		panel_2.add(txtFirstName);

		lastNameLabel_2 = new JLabel();
		lastNameLabel_2.setText("Middle");
		lastNameLabel_2.setBounds(421, 1, 54, 14);
		panel_2.add(lastNameLabel_2);

		txtMiddleName = new JTextField();
		txtMiddleName.setBackground(Color.WHITE);
		txtMiddleName.setEditable(false);
		txtMiddleName.setBounds(462, 3, 145, 20);
		panel_2.add(txtMiddleName);

		panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(621, 0, 240, 29);
		panel_2.add(panel_3);

		panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setLayout(null);
		panel_5.setBounds(0, 0, 120, 29);
		panel_3.add(panel_5);

		lastNameLabel_3 = new JLabel();
		lastNameLabel_3.setText("Room No.");
		lastNameLabel_3.setBounds(3, 0, 47, 14);
		panel_5.add(lastNameLabel_3);

		txtRoomNo = new JTextField();
		txtRoomNo.setBackground(Color.WHITE);
		txtRoomNo.setEditable(false);
		txtRoomNo.setBounds(53, 3, 58, 20);
		panel_5.add(txtRoomNo);

		panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(119, 0, 121, 29);
		panel_3.add(panel_7);

		lastNameLabel_4 = new JLabel();
		lastNameLabel_4.setText("Record no.");
		lastNameLabel_4.setBounds(3, 0, 53, 14);
		panel_7.add(lastNameLabel_4);

		txtRecordNo = new JTextField();
		txtRecordNo.setBackground(Color.WHITE);
		txtRecordNo.setEditable(false);
		txtRecordNo.setBounds(56, 3, 60, 20);
		panel_7.add(txtRecordNo);

		panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setBackground(Color.WHITE);
		panel_4.setLayout(null);
		panel_4.setBounds(0, 29, 861, 32);
		panel_1.add(panel_4);

		lastNameLabel_5 = new JLabel();
		lastNameLabel_5.setText("From Attending Physician");
		lastNameLabel_5.setBounds(2, 0, 121, 14);
		panel_4.add(lastNameLabel_5);

		txtFromAttending = new JTextField();
		txtFromAttending.setBackground(Color.WHITE);
		txtFromAttending.setEditable(false);
		txtFromAttending.setBounds(135, 3, 145, 20);
		panel_4.add(txtFromAttending);

		lastNameLabel_6 = new JLabel();
		lastNameLabel_6.setText("To:Consulting Physician");
		lastNameLabel_6.setBounds(287, 1, 121, 14);
		panel_4.add(lastNameLabel_6);

		txtToConsulting = new JTextField();
		txtToConsulting.setBackground(Color.WHITE);
		txtToConsulting.setEditable(false);
		txtToConsulting.setBounds(412, 3, 187, 20);
		panel_4.add(txtToConsulting);

		dateLabel = new JLabel();
		dateLabel.setText("Date");
		dateLabel.setBounds(670, 0, 36, 14);
		panel_4.add(dateLabel);

		dcReportDate = new JDateChooser();
		dcReportDate.setDateFormatString("MM/dd/yyyy");
		dcReportDate.setBounds(733, 5, 118, 20);
		panel_4.add(dcReportDate);

		panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setLayout(null);
		panel_6.setBounds(0, 58, 860, 131);
		panel.add(panel_6);

		lastNameLabel_7 = new JLabel();
		lastNameLabel_7.setText("Report Requested Regarding");
		lastNameLabel_7.setBounds(10, 3, 140, 14);
		panel_6.add(lastNameLabel_7);

		txtReportRequested = new JTextArea();
		txtReportRequested.setBorder(new LineBorder(Color.black, 1, false));
		txtReportRequested.setWrapStyleWord(true);
		txtReportRequested.setLineWrap(true);
		txtReportRequested.setBounds(13, 22, 837, 63);
		panel_6.add(txtReportRequested);

		lastNameLabel_8 = new JLabel();
		lastNameLabel_8.setText("Signature Of Attending Physician");
		lastNameLabel_8.setBounds(10, 92, 158, 14);
		panel_6.add(lastNameLabel_8);

		cmbSignaturePhysician = new JComboBox();
		cmbSignaturePhysician.setBackground(Color.WHITE);
		cmbSignaturePhysician.setBounds(183, 91, 284, 21);
		panel_6.add(cmbSignaturePhysician);

		panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setBackground(Color.WHITE);
		panel_8.setLayout(null);
		panel_8.setBounds(0, 189, 861, 746);
		panel.add(panel_8);

		reportOfConsultationLabel_1 = new JLabel();
		reportOfConsultationLabel_1.setFont(new Font("Dialog", Font.BOLD, 16));
		reportOfConsultationLabel_1.setText("REPORT");
		reportOfConsultationLabel_1.setBounds(370, 10, 75, 19);
		panel_8.add(reportOfConsultationLabel_1);

		lastNameLabel_9 = new JLabel();
		lastNameLabel_9.setText("Findings");
		lastNameLabel_9.setBounds(10, 33, 54, 14);
		panel_8.add(lastNameLabel_9);

		txtFindings = new JTextArea();
		txtFindings.setBorder(new LineBorder(Color.black, 1, false));
		txtFindings.setWrapStyleWord(true);
		txtFindings.setLineWrap(true);
		txtFindings.setBounds(12, 53, 839, 346);
		panel_8.add(txtFindings);

		diagnosisLabel = new JLabel();
		diagnosisLabel.setText("Diagnosis");
		diagnosisLabel.setBounds(10, 410, 54, 14);
		panel_8.add(diagnosisLabel);

		txtDiagnosis = new JTextArea();
		txtDiagnosis.setBorder(new LineBorder(Color.black, 1, false));
		txtDiagnosis.setLineWrap(true);
		txtDiagnosis.setWrapStyleWord(true);
		txtDiagnosis.setBounds(12, 428, 839, 64);
		panel_8.add(txtDiagnosis);

		diagnosisLabel_1 = new JLabel();
		diagnosisLabel_1.setText("Recommendations");
		diagnosisLabel_1.setBounds(10, 498, 87, 14);
		panel_8.add(diagnosisLabel_1);

		txtRecommendations = new JTextArea();
		txtRecommendations.setBorder(new LineBorder(Color.black, 1, false));
		txtRecommendations.setLineWrap(true);
		txtRecommendations.setWrapStyleWord(true);
		txtRecommendations.setBounds(12, 518, 839, 162);
		panel_8.add(txtRecommendations);

		diagnosisLabel_2 = new JLabel();
		diagnosisLabel_2.setText("Date Of Consultation:");
		diagnosisLabel_2.setBounds(4, 700, 105, 14);
		panel_8.add(diagnosisLabel_2);

		dcDateOfConsultation = new JDateChooser();
		dcDateOfConsultation.setDateFormatString("MM/dd/yyyy");
		dcDateOfConsultation.setBounds(114, 700, 143, 20);
		panel_8.add(dcDateOfConsultation);

		diagnosisLabel_3 = new JLabel();
		diagnosisLabel_3.setText("Dr.");
		diagnosisLabel_3.setBounds(271, 701, 22, 14);
		panel_8.add(diagnosisLabel_3);

		txtDoctor = new JTextField();
		txtDoctor.setBounds(293, 700, 211, 20);
		panel_8.add(txtDoctor);

		diagnosisLabel_4 = new JLabel();
		diagnosisLabel_4.setText("Signature Of Consultants");
		diagnosisLabel_4.setBounds(630, 725, 143, 14);
		panel_8.add(diagnosisLabel_4);

		cmbSignatureConsultant = new JComboBox();
		cmbSignatureConsultant.setBackground(Color.WHITE);
		cmbSignatureConsultant.setBounds(559, 700, 292, 20);
		panel_8.add(cmbSignatureConsultant);

		panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setLayout(null);
		panel_9.setBounds(0, 932, 860, 29);
		panel.add(panel_9);

		from63Label = new JLabel();
		from63Label.setFont(new Font("", Font.BOLD, 12));
		from63Label.setText("From 63");
		from63Label.setBounds(3, 2, 54, 14);
		panel_9.add(from63Label);

		r404Label = new JLabel();
		r404Label.setFont(new Font("", Font.PLAIN, 10));
		r404Label.setText("R404");
		r404Label.setBounds(3, 15, 54, 10);
		panel_9.add(r404Label);

		diagnosisLabel_5 = new JLabel();
		diagnosisLabel_5.setFont(new Font("", Font.BOLD, 12));
		diagnosisLabel_5.setText("REPORT OF CONSULTATION");
		diagnosisLabel_5.setBounds(627, 5, 190, 14);
		panel_9.add(diagnosisLabel_5);

		fillCombos();
		updateData();
	}

	public void fillCombos() {
		UserLogon ul = new UserLogon();
		try {
			ul = MedrexClientManager.getInstance().getcurrentUserLogon();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Users user = new Users();
		try {
			user = MedrexClientManager.getInstance().getUser(ul.getUserId());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cmbSignatureConsultant.addItem(user.getUserName());

		cmbSignaturePhysician.addItem(user.getUserName());
	}

	public void updateData() {
		ResidentMain rm = null;

		try {
			rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
			txtLastName.setText(rm.getUserPass());
			txtFirstName.setText(rm.getUserName());
			/* TODO: Migrating to room history */
			// txtRoomNo.setText(rm.getRoom());
		} catch (Exception e) {

		}

		if (Global.currentReportOfConsultationFormKey == 0) {
			dcReportDate.setDate(null);
			txtReportRequested.setText("");
			cmbSignaturePhysician.setSelectedItem("");
			txtFindings.setText("");
			txtDiagnosis.setText("");
			txtRecommendations.setText("");
			dcDateOfConsultation.setDate(null);
			txtDoctor.setText("");
			cmbSignatureConsultant.setSelectedItem("");

		} else {
			ReportOfConsultationForm rocf = null;
			try {
				rocf = MedrexClientManager.getInstance()
						.getReportOfConsultationForm(
								((Global.currentReportOfConsultationFormKey)));
			} catch (Exception e) {

			}
			dcReportDate.setDate(rocf.getDateRecord());
			txtReportRequested.setText(rocf.getReportRequestedRegarding());
			cmbSignaturePhysician
					.setSelectedItem(rocf.getSignatureConsultant());
			txtFindings.setText(rocf.getFindings());
			txtDiagnosis.setText(rocf.getDiagnosis());
			txtRecommendations.setText(rocf.getRecommendations());
			dcDateOfConsultation.setDate(rocf.getDateOfConsultation());
			txtDoctor.setText(rocf.getDoctor());
			cmbSignatureConsultant.setSelectedItem(rocf
					.getSignatureConsultant());
		}

	}

	public void doSave() {
		ReportOfConsultationForm rocf = new ReportOfConsultationForm();
		rocf.setSerial(Global.currentReportOfConsultationFormKey);
		rocf.setResidentId(Global.currentResidenceKey);

		rocf.setDateRecord(dcReportDate.getDate());
		rocf.setReportRequestedRegarding(txtReportRequested.getText());
		rocf.setSignatureConsultant((String) cmbSignaturePhysician
				.getSelectedItem());
		rocf.setFindings(txtFindings.getText());
		rocf.setDiagnosis(txtDiagnosis.getText());
		rocf.setRecommendations(txtRecommendations.getText());
		rocf.setDateOfConsultation(dcDateOfConsultation.getDate());
		rocf.setDoctor(txtDoctor.getText());
		rocf.setSignatureConsultant((String) cmbSignatureConsultant
				.getSelectedItem());

		try {
			Global.currentReportOfConsultationFormKey = MedrexClientManager
					.getInstance().insertOrUpdateReportOfConsultationForm(rocf);
		} catch (Exception e) {
		}

	}

}
