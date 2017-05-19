package medrex.client.main.admission;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.rmi.RemoteException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.Form;
import medrex.commons.vo.admin.UserLogon;
import medrex.commons.vo.admission.ResidentQuarterlyAssessmentFormPage8;
import medrex.commons.vo.notes.Notes;
import medrex.commons.vo.others.Users;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.notes.JxNotes;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelResidentQuarterlyAssessmentFormPage8 extends JxPanel
		implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5051314538304551759L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbAlternate6;
	private JxComboBox cmbNurseSignature;
	private JxNotes txtAreaComments;
	private JxComboBox cmbAlternate5;
	private JxComboBox cmbAlternate4;
	private JxComboBox cmbAlternate3;
	private JxComboBox cmbAlternate2;
	private JxComboBox cmbAlternate1;
	private JxDateChooser dcDate;
	private Notes notestxtAreaComments;
	// If true then categories list and label will display otherwise not.
	private boolean isCategories = true;

	public PanelResidentQuarterlyAssessmentFormPage8() {
		super();
		setPreferredSize(new Dimension(840, 700));
		setBackground(Color.WHITE);
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);

		panel.setBounds(10, 10, 830, 683);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);

		panel_1.setLayout(null);
		panel_1.setBounds(10, 10, 830, 317);
		panel.add(panel_1);

		final JxLabel eAnticipatedNeedsLabel = new JxLabel();
		eAnticipatedNeedsLabel.setTheme(theme);
		eAnticipatedNeedsLabel.setBounds(119, 10, 233, 14);
		panel_1.add(eAnticipatedNeedsLabel);
		eAnticipatedNeedsLabel
				.setText("e. Anticipated Needs - Food, Drinks, Pain, etc.");

		final JxLabel fPaddingOnLabel = new JxLabel();
		fPaddingOnLabel.setTheme(theme);
		fPaddingOnLabel.setBounds(119, 30, 161, 14);
		panel_1.add(fPaddingOnLabel);
		fPaddingOnLabel.setText("f. Padding on Floor");

		final JxLabel gLowerOnLabel = new JxLabel();
		gLowerOnLabel.setTheme(theme);
		gLowerOnLabel.setBounds(119, 50, 137, 14);
		panel_1.add(gLowerOnLabel);
		gLowerOnLabel.setText("g. Lower Bed");

		final JxLabel hAssistWithLabel = new JxLabel();
		hAssistWithLabel.setTheme(theme);
		hAssistWithLabel
				.setText("h. Assist with Positioning - Use of Support Pillows.");
		hAssistWithLabel.setBounds(119, 70, 296, 14);
		panel_1.add(hAssistWithLabel);

		final JxLabel iOtherLabel = new JxLabel();
		iOtherLabel.setTheme(theme);
		iOtherLabel.setText("i. Other");
		iOtherLabel.setBounds(119, 90, 54, 14);
		panel_1.add(iOtherLabel);

		cmbAlternate1 = new JxComboBox();
		cmbAlternate1.setTheme(theme);

		cmbAlternate1.setModel(new DefaultComboBoxModel(new String[] { "", "a",
				"b", "c", "d", "e", "f", "g", "h", "i" }));
		cmbAlternate1.setBounds(10, 146, 103, 23);
		panel_1.add(cmbAlternate1);

		final JxLabel atThisTimeLabel = new JxLabel();
		atThisTimeLabel.setTheme(theme);
		atThisTimeLabel
				.setText("At this time, side rails are being used until tha MDS is completed.");
		atThisTimeLabel.setBounds(119, 150, 515, 14);
		panel_1.add(atThisTimeLabel);

		cmbAlternate2 = new JxComboBox();
		cmbAlternate2.setTheme(theme);

		cmbAlternate2.setModel(new DefaultComboBoxModel(new String[] { "", "a",
				"b", "c", "d", "e", "f", "g", "h", "i" }));
		cmbAlternate2.setBounds(10, 175, 103, 23);
		panel_1.add(cmbAlternate2);

		cmbAlternate3 = new JxComboBox();
		cmbAlternate3.setTheme(theme);

		cmbAlternate3.setModel(new DefaultComboBoxModel(new String[] { "", "a",
				"b", "c", "d", "e", "f", "g", "h", "i" }));
		cmbAlternate3.setBounds(10, 204, 103, 23);
		panel_1.add(cmbAlternate3);

		cmbAlternate4 = new JxComboBox();
		cmbAlternate4.setTheme(theme);

		cmbAlternate4.setModel(new DefaultComboBoxModel(new String[] { "", "a",
				"b", "c", "d", "e", "f", "g", "h", "i" }));
		cmbAlternate4.setBounds(10, 233, 103, 23);
		panel_1.add(cmbAlternate4);

		cmbAlternate5 = new JxComboBox();
		cmbAlternate5.setTheme(theme);

		cmbAlternate5.setModel(new DefaultComboBoxModel(new String[] { "", "a",
				"b", "c", "d", "e", "f", "g", "h", "i" }));
		cmbAlternate5.setBounds(10, 262, 103, 23);
		panel_1.add(cmbAlternate5);

		cmbAlternate6 = new JxComboBox();
		cmbAlternate6.setTheme(theme);

		cmbAlternate6.setModel(new DefaultComboBoxModel(new String[] { "", "a",
				"b", "c", "d", "e", "f", "g", "h", "i" }));
		cmbAlternate6.setBounds(10, 291, 103, 23);
		panel_1.add(cmbAlternate6);

		final JxLabel atThisTimeLabel_1 = new JxLabel();
		atThisTimeLabel_1.setTheme(theme);
		atThisTimeLabel_1
				.setText("At this time, side rails are indicated to provide safety.");
		atThisTimeLabel_1.setBounds(119, 179, 331, 14);
		panel_1.add(atThisTimeLabel_1);

		final JxLabel sideRailsAreLabel = new JxLabel();
		sideRailsAreLabel.setTheme(theme);
		sideRailsAreLabel
				.setText("Side rails are indicated and serve as an enabler to promote indipendence.");
		sideRailsAreLabel.setBounds(119, 208, 363, 14);
		panel_1.add(sideRailsAreLabel);

		final JxLabel theResidentHasLabel = new JxLabel();
		theResidentHasLabel.setTheme(theme);
		theResidentHasLabel
				.setText("The resident has expressed a desire to have side rails raised while in bed.");
		theResidentHasLabel.setBounds(119, 237, 400, 14);
		panel_1.add(theResidentHasLabel);

		final JxLabel sideRailsDoLabel = new JxLabel();
		sideRailsDoLabel.setTheme(theme);
		sideRailsDoLabel
				.setText("Side rails do not appear to be indicated at this time.");
		sideRailsDoLabel.setBounds(119, 266, 296, 14);
		panel_1.add(sideRailsDoLabel);

		final JxLabel furtherEvaluationIsLabel = new JxLabel();
		furtherEvaluationIsLabel.setTheme(theme);
		furtherEvaluationIsLabel
				.setText("Further evaluation is needed to determine appropriateness of side rails.");
		furtherEvaluationIsLabel.setBounds(119, 295, 372, 14);
		panel_1.add(furtherEvaluationIsLabel);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);

		panel_2.setLayout(null);
		panel_2.setBounds(10, 333, 815, 212);
		panel.add(panel_2);

		final JxLabel commentsLabel = new JxLabel();
		commentsLabel.setTheme(theme);

		commentsLabel.setFontSize(14);
		commentsLabel.setFontStyle(Font.BOLD);
		commentsLabel.setText("COMMENTS :");
		commentsLabel.setBounds(10, 10, 135, 24);
		panel_2.add(commentsLabel);

		notestxtAreaComments = new Notes();
		notestxtAreaComments.setFormName("Resident Quarterly Assessment Form");
		notestxtAreaComments.setUserId(Global.currentLoggedInUserKey);

		txtAreaComments = new JxNotes(isCategories);
		txtAreaComments.setNotes(notestxtAreaComments);
		txtAreaComments.setBorder(new LineBorder(Color.black, 1, false));
		txtAreaComments.setBounds(10, 40, 800, 162);
		panel_2.add(txtAreaComments);

		cmbNurseSignature = new JxComboBox();
		cmbNurseSignature.setTheme(theme);

		cmbNurseSignature.setBounds(47, 585, 388, 21);
		panel.add(cmbNurseSignature);

		final JxLabel nurseSignatureLabel = new JxLabel();
		nurseSignatureLabel.setTheme(theme);
		nurseSignatureLabel.setText("Nurse Signature");
		nurseSignatureLabel.setBounds(186, 565, 130, 14);
		panel.add(nurseSignatureLabel);

		final JxLabel dateLabel = new JxLabel();
		dateLabel.setTheme(theme);
		dateLabel.setText("Date");
		dateLabel.setBounds(771, 565, 54, 14);
		panel.add(dateLabel);

		dcDate = new JxDateChooser();
		dcDate.setTheme(theme);
		dcDate.setDate(MedrexClientManager.getServerTime());
		dcDate.setDateFormatString("MM/dd/yyyy");
		dcDate.setBounds(688, 592, 137, 21);
		panel.add(dcDate);

		final JxLabel nursesiderailassessLabel = new JxLabel();
		nursesiderailassessLabel.setTheme(theme);
		nursesiderailassessLabel.setText("Nurse.SideRail.Assess");
		nursesiderailassessLabel.setBounds(42, 652, 168, 14);
		panel.add(nursesiderailassessLabel);

		final PanelloggedInUser panel_3 = new PanelloggedInUser();
		panel_3.setBounds(42, 582, 405, 24);
		panel.add(panel_3);
		doLoad();
	}

	public void doLoad() {
		doUpdate();
		fillCombo();
	}

	public void fillCombo() {
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
		cmbNurseSignature.setVisible(false);
		cmbNurseSignature.addItem(user.getUserName());

	}

	public int doSave() {
		ResidentQuarterlyAssessmentFormPage8 residentQuarterlyAssessmentFormPage8 = new ResidentQuarterlyAssessmentFormPage8();
		residentQuarterlyAssessmentFormPage8
				.setSerial(Global.currentResidentQuarterlyAssessmentFormPage8);
		residentQuarterlyAssessmentFormPage8
				.setFormId(Global.currentResidentAssessmentFormKey);
		residentQuarterlyAssessmentFormPage8.setAlternate1(cmbAlternate1
				.getSelectedItem()
				+ "");
		residentQuarterlyAssessmentFormPage8.setAlternate2(cmbAlternate2
				.getSelectedItem()
				+ "");
		residentQuarterlyAssessmentFormPage8.setAlternate3(cmbAlternate3
				.getSelectedItem()
				+ "");
		residentQuarterlyAssessmentFormPage8.setAlternate4(cmbAlternate4
				.getSelectedItem()
				+ "");
		residentQuarterlyAssessmentFormPage8.setAlternate5(cmbAlternate5
				.getSelectedItem()
				+ "");
		residentQuarterlyAssessmentFormPage8.setAlternate6(cmbAlternate6
				.getSelectedItem()
				+ "");
		residentQuarterlyAssessmentFormPage8.setComments(txtAreaComments
				.getNotes());
		residentQuarterlyAssessmentFormPage8.setDate(dcDate.getDate());
		residentQuarterlyAssessmentFormPage8
				.setNurseSignature(cmbNurseSignature.getSelectedItem() + "");
		try {
			Global.currentResidentQuarterlyAssessmentFormPage8 = MedrexClientManager
					.getInstance()
					.insertOrUpdateResidentQuarterlyAssessmentFormPage8(
							residentQuarterlyAssessmentFormPage8);

			// for sending trigger word message
			String str = txtAreaComments.getTriggerWord();

			if (str != null) {
				txtAreaComments.sendMail(str);
			}

			return (Global.currentResidentQuarterlyAssessmentFormPage8);
		} catch (Exception e) {
			return 0;
		}

	}

	public void doUpdate() {
		if (Global.currentResidentAssessmentFormKey == 0) {
			Global.currentResidentQuarterlyAssessmentFormPage8 = 0;
			cmbAlternate1.setSelectedItem("");
			cmbAlternate2.setSelectedItem("");
			cmbAlternate3.setSelectedItem("");
			cmbAlternate4.setSelectedItem("");
			cmbAlternate5.setSelectedItem("");
			cmbAlternate6.setSelectedItem("");
		} else {
			ResidentQuarterlyAssessmentFormPage8 residentQuarterlyAssessmentFormPage8 = null;
			try {
				residentQuarterlyAssessmentFormPage8 = MedrexClientManager
						.getInstance().getResidentQuarterlyAssessmentFormPage8(
								Global.currentResidentAssessmentFormKey);
			} catch (Exception e) {

			}
			if (residentQuarterlyAssessmentFormPage8 != null) {
				cmbAlternate1
						.setSelectedItem(residentQuarterlyAssessmentFormPage8
								.getAlternate1());
				cmbAlternate2
						.setSelectedItem(residentQuarterlyAssessmentFormPage8
								.getAlternate2());
				cmbAlternate3
						.setSelectedItem(residentQuarterlyAssessmentFormPage8
								.getAlternate3());
				cmbAlternate4
						.setSelectedItem(residentQuarterlyAssessmentFormPage8
								.getAlternate4());
				cmbAlternate5
						.setSelectedItem(residentQuarterlyAssessmentFormPage8
								.getAlternate5());
				cmbAlternate6
						.setSelectedItem(residentQuarterlyAssessmentFormPage8
								.getAlternate6());
				txtAreaComments.setNotes(residentQuarterlyAssessmentFormPage8
						.getComments());
				cmbNurseSignature
						.setSelectedItem(residentQuarterlyAssessmentFormPage8
								.getNurseSignature());
				dcDate.setDate(residentQuarterlyAssessmentFormPage8.getDate());
			}
		}
	}

	public boolean doValidate() {

		return false;
	}

}
