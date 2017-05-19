package medrex.client.main.admission;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JScrollPane;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.Form;
import medrex.commons.vo.admission.ResidentAssessmentFormPage23;
import medrex.commons.vo.admission.analyzer.CarePlanValues;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;
import com.sX.swing.JxTextA;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelResidentAssessmentFormPage23 extends JxPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2198025381715621763L;

	Theme theme = new BlackOverWhiteTheme();

	private JxTable table;
	// private JScrollPane scrollPaneVision;
	// private JScrollPane scrollPaneHearing;
	// private JxTextA txtAreaVision;
	// private JxTextA txtAreaHearing;
	// private JxLabel lblVisionRightValue;
	// private JxLabel lblVisionLeftValue;
	// private JxLabel lblHearingRightValue;
	// private JxLabel lblHearingLeftValue;
	// private JxLabel lblVisionRightNeeds;
	// private JxLabel lblVisionLeftNeeds;
	// private JxLabel lblHearingDeafNeeds;
	// private JxLabel lblHearingRightNeeds;
	// private JxLabel lblHearingLeftNeeds;
	// private JxLabel lblVisionRightField;
	// private JxLabel lblVisionLeftField;
	// private JxLabel lblHearingRightField;
	// private JxLabel lblHearingLeftField;
	private JScrollPane scrollPaneCommunication;
	private JxTextA txtAreaCommunication;
	// private JxLabel lblOrientedValue;
	// private JxLabel lblOrientedNeeds;
	// private JxLabel lblOrientedField;
	// private JxLabel lblQAValue;
	// private JxLabel lblQANeeds;
	// private JxLabel lblQAlField;
	// private JxLabel lblLanguageValue;
	// private JxLabel lblLanguageNeeds;
	// private JxLabel lblLanguageField;
	// private JxLabel lblCommunicationValue;
	// private JxLabel lblCommunicationNeeds;
	// private JxLabel lblCommunicationField;
	public static final Color DEF_COL = new Color(49, 104, 127);
	private int key = 0;

	// private CarePlanJTable careTable;
	// static ImageIcon iconCross = new ImageIcon("img/cross.jpg");
	// static ImageIcon iconTick = new ImageIcon("img/tick.jpg");

	public PanelResidentAssessmentFormPage23() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(930, 550));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);

		panel.setLayout(null);
		panel.setBounds(0, 0, 930, 550);
		add(panel);

		final JxLabel carePlanInfoLabel = new JxLabel();
		carePlanInfoLabel.setTheme(theme);
		carePlanInfoLabel.setFontSize(18);
		// carePlanInfoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		carePlanInfoLabel
				.setText("                                                               Care Plan Info");
		// carePlanInfoLabel.setHorizontalAlignment(SwingConstants.CENTER);

		carePlanInfoLabel.setFontStyle(Font.BOLD);
		carePlanInfoLabel.setBounds(0, 22, 930, 27);
		panel.add(carePlanInfoLabel);

		// final JxLabel nameLabel = new JxLabel();
		// nameLabel.setTheme (theme);
		// nameLabel.setText("Name");
		// nameLabel.setForeground(DEF_COL);

		/*
		 * nameLabel.setFontSize(14); nameLabel.setFontStyle(Font.BOLD); //
		 * nameLabel.setBounds(10, 33, 129, 27); // panel.add(nameLabel); // //
		 * final JxLabel fieldLabel = new JxLabel(); fieldLabel.setTheme
		 * (theme); // fieldLabel.setText("Field"); //
		 * fieldLabel.setForeground(DEF_COL);
		 * 
		 * fieldLabel.setFontSize(14); fieldLabel.setFontStyle(Font.BOLD); //
		 * fieldLabel.setBounds(251, 33, 73, 27); // panel.add(fieldLabel); //
		 * // final JxLabel needsCarePlanLabel = new JxLabel();
		 * needsCarePlanLabel.setTheme (theme); //
		 * needsCarePlanLabel.setText("Needs Care Plan"); //
		 * needsCarePlanLabel.setForeground(DEF_COL);
		 * 
		 * needsCarePlanLabel.setFontSize(14);
		 * needsCarePlanLabel.setFontStyle(Font.BOLD); //
		 * needsCarePlanLabel.setBounds(355, 36, 129, 21); //
		 * panel.add(needsCarePlanLabel); // // final JxLabel valueLabel = new
		 * JxLabel(); valueLabel.setTheme (theme); //
		 * valueLabel.setText("Value"); // valueLabel.setForeground(DEF_COL);
		 * 
		 * valueLabel.setFontSize(14); valueLabel.setFontStyle(Font.BOLD); //
		 * valueLabel.setBounds(516, 36, 142, 21); // panel.add(valueLabel); //
		 * // final JxLabel communicationLabel = new JxLabel();
		 * communicationLabel.setTheme (theme); //
		 * communicationLabel.setText("Communication:"); //
		 * communicationLabel.setForeground(DEF_COL);
		 * 
		 * communicationLabel.setFontSize(12);
		 * communicationLabel.setFontStyle(Font.BOLD); //
		 * communicationLabel.setBounds(10, 93, 242, 21); //
		 * panel.add(communicationLabel); // // lblCommunicationField = new
		 * JxLabel(); lblCommunicationField.setTheme (theme); //
		 * lblCommunicationField.setBounds(251, 93, 54, 21); //
		 * panel.add(lblCommunicationField); // // lblCommunicationNeeds = new
		 * JxLabel(); lblCommunicationNeeds.setTheme (theme); //
		 * lblCommunicationNeeds.setBounds(355, 93, 54, 21); //
		 * panel.add(lblCommunicationNeeds); // // lblCommunicationValue = new
		 * JxLabel(); lblCommunicationValue.setTheme (theme); //
		 * lblCommunicationValue.setForeground(DEF_COL);
		 * 
		 * lblCommunicationValue.setFontSize(12);
		 * lblCommunicationValue.setFontStyle(Font.BOLD); //
		 * lblCommunicationValue.setBounds(516, 93, 142, 21); //
		 * panel.add(lblCommunicationValue); // // final JxLabel
		 * communicationlanguagesSpokenLabel = new JxLabel();
		 * communicationlanguagesSpokenLabel.setTheme (theme); //
		 * communicationlanguagesSpokenLabel.setForeground(DEF_COL);
		 * 
		 * communicationlanguagesSpokenLabel.setFontSize(12);
		 * communicationlanguagesSpokenLabel.setFontStyle(Font.BOLD); //
		 * communicationlanguagesSpokenLabel //
		 * .setText("Communication: (Language(s) Spoken)"); //
		 * communicationlanguagesSpokenLabel.setBounds(10, 130, 242, 21); //
		 * panel.add(communicationlanguagesSpokenLabel); // // lblLanguageField
		 * = new JxLabel(); lblLanguageField.setTheme (theme); //
		 * lblLanguageField.setBounds(251, 120, 54, 21); //
		 * panel.add(lblLanguageField); // // lblLanguageNeeds = new JxLabel();
		 * lblLanguageNeeds.setTheme (theme); // lblLanguageNeeds.setBounds(355,
		 * 130, 54, 21); // panel.add(lblLanguageNeeds); // // lblLanguageValue
		 * = new JxLabel(); lblLanguageValue.setTheme (theme); //
		 * lblLanguageValue.setForeground(DEF_COL);
		 * 
		 * lblLanguageValue.setFontSize(12);
		 * lblLanguageValue.setFontStyle(Font.BOLD); //
		 * lblLanguageValue.setBounds(516, 130, 142, 21); //
		 * panel.add(lblLanguageValue); // // final JxLabel answerQuestionLabel
		 * = new JxLabel(); answerQuestionLabel.setTheme (theme); //
		 * answerQuestionLabel.setForeground(DEF_COL);
		 * 
		 * answerQuestionLabel.setFontSize(12);
		 * answerQuestionLabel.setFontStyle(Font.BOLD); //
		 * answerQuestionLabel.setText("Communication: (Answer Questions)"); //
		 * answerQuestionLabel.setBounds(10, 165, 221, 21); //
		 * panel.add(answerQuestionLabel); // // lblQAlField = new JxLabel();
		 * lblQAlField.setTheme (theme); // lblQAlField.setBounds(251, 165, 54,
		 * 21); // panel.add(lblQAlField); // // lblQANeeds = new JxLabel();
		 * lblQANeeds.setTheme (theme); // lblQANeeds.setBounds(355, 165, 54,
		 * 21); // panel.add(lblQANeeds); // // lblQAValue = new JxLabel();
		 * lblQAValue.setTheme (theme); // lblQAValue.setForeground(DEF_COL);
		 * 
		 * lblQAValue.setFontSize(12); lblQAValue.setFontStyle(Font.BOLD); //
		 * lblQAValue.setBounds(516, 165, 142, 21); // panel.add(lblQAValue); //
		 * // final JxLabel communicationLabel_1 = new JxLabel();
		 * communicationLabel_1.setTheme (theme); //
		 * communicationLabel_1.setForeground(DEF_COL);
		 * 
		 * communicationLabel_1.setFontSize(12);
		 * communicationLabel_1.setFontStyle(Font.BOLD); //
		 * communicationLabel_1.setText("Communication: (Oriented)"); //
		 * communicationLabel_1.setBounds(10, 200, 206, 21); //
		 * panel.add(communicationLabel_1); // // lblOrientedField = new
		 * JxLabel(); lblOrientedField.setTheme (theme); //
		 * lblOrientedField.setBounds(251, 194, 54, 20); //
		 * panel.add(lblOrientedField); // // lblOrientedNeeds = new JxLabel();
		 * lblOrientedNeeds.setTheme (theme); // lblOrientedNeeds.setBounds(355,
		 * 200, 73, 20); // panel.add(lblOrientedNeeds); // // lblOrientedValue
		 * = new JxLabel(); lblOrientedValue.setTheme (theme); //
		 * lblOrientedValue.setForeground(DEF_COL);
		 * 
		 * lblOrientedValue.setFontSize(12);
		 * lblOrientedValue.setFontStyle(Font.BOLD); //
		 * lblOrientedValue.setBounds(516, 200, 142, 21); //
		 * panel.add(lblOrientedValue); // // final JxLabel carePlanLabel = new
		 * JxLabel(); carePlanLabel.setTheme (theme);
		 * 
		 * carePlanLabel.setFontSize(14); carePlanLabel.setFontStyle(Font.BOLD);
		 * // carePlanLabel.setForeground(DEF_COL); //
		 * carePlanLabel.setText("Care Plan"); // carePlanLabel.setBounds(704,
		 * 39, 87, 16); // panel.add(carePlanLabel);
		 * 
		 * scrollPaneCommunication = new JScrollPane();
		 * scrollPaneCommunication.setBounds(704, 80, 195, 141);
		 * panel.add(scrollPaneCommunication);
		 * 
		 * txtAreaCommunication = new JxTextA(); txtAreaCommunication.setTheme
		 * (theme);
		 * 
		 * txtAreaCommunication.setFontSize(12);
		 * txtAreaCommunication.setFontStyle(Font.BOLD);
		 * scrollPaneCommunication.setCorner(JScrollPane.UPPER_LEFT_CORNER,
		 * txtAreaCommunication);
		 * scrollPaneCommunication.setViewportView(txtAreaCommunication);
		 * 
		 * // final JxLabel adequateWithAidLabel = new JxLabel();
		 * adequateWithAidLabel.setTheme (theme); //
		 * adequateWithAidLabel.setText("Hearing: Left");
		 * 
		 * adequateWithAidLabel.setFontSize(12);
		 * adequateWithAidLabel.setFontStyle(Font.BOLD); //
		 * adequateWithAidLabel.setBounds(10, 255, 206, 16); //
		 * adequateWithAidLabel.setForeground(DEF_COL); //
		 * panel.add(adequateWithAidLabel); // // final JxLabel hearingPoorLabel
		 * = new JxLabel(); hearingPoorLabel.setTheme (theme); //
		 * hearingPoorLabel.setText("Hearing: Right");
		 * 
		 * hearingPoorLabel.setFontSize(12);
		 * hearingPoorLabel.setFontStyle(Font.BOLD); //
		 * hearingPoorLabel.setBounds(10, 290, 100, 16); //
		 * hearingPoorLabel.setForeground(DEF_COL); //
		 * panel.add(hearingPoorLabel); // // final JxLabel
		 * visionAdequateWithLabel = new JxLabel();
		 * visionAdequateWithLabel.setTheme (theme); //
		 * visionAdequateWithLabel.setText("Vision: Left");
		 * 
		 * visionAdequateWithLabel.setFontSize(12);
		 * visionAdequateWithLabel.setFontStyle(Font.BOLD); //
		 * visionAdequateWithLabel.setBounds(10, 375, 195, 16); //
		 * visionAdequateWithLabel.setForeground(DEF_COL); //
		 * panel.add(visionAdequateWithLabel); // // final JxLabel
		 * visionPoorLabel = new JxLabel(); visionPoorLabel.setTheme (theme); //
		 * visionPoorLabel.setText("Vision: Right");
		 * 
		 * visionPoorLabel.setFontSize(12);
		 * visionPoorLabel.setFontStyle(Font.BOLD); //
		 * visionPoorLabel.setBounds(10, 412, 100, 16); //
		 * visionPoorLabel.setForeground(DEF_COL); //
		 * panel.add(visionPoorLabel); // // lblHearingLeftField = new
		 * JxLabel(); lblHearingLeftField.setTheme (theme); //
		 * lblHearingLeftField.setText(""); //
		 * lblHearingLeftField.setForeground(DEF_COL); //
		 * lblHearingLeftField.setBounds(251, 253, 54, 20); //
		 * panel.add(lblHearingLeftField); // // lblHearingRightField = new
		 * JxLabel(); lblHearingRightField.setTheme (theme); //
		 * lblHearingRightField.setText(""); //
		 * lblHearingRightField.setForeground(DEF_COL); //
		 * lblHearingRightField.setBounds(251, 288, 54, 20); //
		 * panel.add(lblHearingRightField); // // lblVisionLeftField = new
		 * JxLabel(); lblVisionLeftField.setTheme (theme); //
		 * lblVisionLeftField.setText(""); //
		 * lblVisionLeftField.setForeground(DEF_COL); //
		 * lblVisionLeftField.setBounds(251, 373, 54, 20); //
		 * panel.add(lblVisionLeftField); // // lblVisionRightField = new
		 * JxLabel(); lblVisionRightField.setTheme (theme); //
		 * lblVisionRightField.setText(""); //
		 * lblVisionRightField.setForeground(DEF_COL); //
		 * lblVisionRightField.setBounds(251, 410, 54, 20); //
		 * panel.add(lblVisionRightField); // // lblHearingLeftNeeds = new
		 * JxLabel(); lblHearingLeftNeeds.setTheme (theme); //
		 * lblHearingLeftNeeds.setText(""); //
		 * lblHearingLeftNeeds.setForeground(DEF_COL); //
		 * lblHearingLeftNeeds.setBounds(355, 253, 54, 20); //
		 * panel.add(lblHearingLeftNeeds); // // lblHearingRightNeeds = new
		 * JxLabel(); lblHearingRightNeeds.setTheme (theme); //
		 * lblHearingRightNeeds.setText(""); //
		 * lblHearingRightNeeds.setBounds(355, 288, 54, 20); //
		 * lblHearingRightNeeds.setForeground(DEF_COL); //
		 * panel.add(lblHearingRightNeeds); // // lblHearingDeafNeeds = new
		 * JxLabel(); lblHearingDeafNeeds.setTheme (theme); //
		 * lblHearingDeafNeeds.setText(""); //
		 * lblHearingDeafNeeds.setForeground(DEF_COL); //
		 * lblHearingDeafNeeds.setBounds(355, 321, 54, 20); //
		 * panel.add(lblHearingDeafNeeds); // // lblVisionLeftNeeds = new
		 * JxLabel(); lblVisionLeftNeeds.setTheme (theme); //
		 * lblVisionLeftNeeds.setToolTipText(""); //
		 * lblVisionLeftNeeds.setText(""); //
		 * lblVisionLeftNeeds.setForeground(DEF_COL); //
		 * lblVisionLeftNeeds.setBounds(355, 373, 54, 20); //
		 * panel.add(lblVisionLeftNeeds); // // lblVisionRightNeeds = new
		 * JxLabel(); lblVisionRightNeeds.setTheme (theme); //
		 * lblVisionRightNeeds.setText(""); //
		 * lblVisionRightNeeds.setForeground(DEF_COL); //
		 * lblVisionRightNeeds.setBounds(355, 410, 54, 20); //
		 * panel.add(lblVisionRightNeeds); // // lblHearingLeftValue = new
		 * JxLabel(); lblHearingLeftValue.setTheme (theme); //
		 * lblHearingLeftValue.setText("");
		 * 
		 * lblHearingLeftValue.setFontSize(12);
		 * lblHearingLeftValue.setFontStyle(Font.BOLD); //
		 * lblHearingLeftValue.setForeground(DEF_COL); //
		 * lblHearingLeftValue.setBounds(516, 253, 142, 20); //
		 * panel.add(lblHearingLeftValue); // // lblHearingRightValue = new
		 * JxLabel(); lblHearingRightValue.setTheme (theme); //
		 * lblHearingRightValue.setText(""); //
		 * lblHearingRightValue.setForeground(DEF_COL);
		 * 
		 * lblHearingRightValue.setFontSize(12);
		 * lblHearingRightValue.setFontStyle(Font.BOLD); //
		 * lblHearingRightValue.setBounds(516, 288, 142, 20); //
		 * panel.add(lblHearingRightValue); // // lblVisionLeftValue = new
		 * JxLabel(); lblVisionLeftValue.setTheme (theme); //
		 * lblVisionLeftValue.setText(""); //
		 * lblVisionLeftValue.setForeground(DEF_COL);
		 * 
		 * lblVisionLeftValue.setFontSize(12);
		 * lblVisionLeftValue.setFontStyle(Font.BOLD); //
		 * lblVisionLeftValue.setBounds(516, 373, 142, 20); //
		 * panel.add(lblVisionLeftValue); // // lblVisionRightValue = new
		 * JxLabel(); lblVisionRightValue.setTheme (theme); //
		 * lblVisionRightValue.setText(""); //
		 * lblVisionRightValue.setForeground(DEF_COL);
		 * 
		 * lblVisionRightValue.setFontSize(12);
		 * lblVisionRightValue.setFontStyle(Font.BOLD); //
		 * lblVisionRightValue.setBounds(516, 410, 142, 20); //
		 * panel.add(lblVisionRightValue);
		 * 
		 * scrollPaneHearing = new JScrollPane();
		 * scrollPaneHearing.setBounds(704, 251, 195, 90);
		 * panel.add(scrollPaneHearing);
		 * 
		 * txtAreaHearing = new JxTextA(); txtAreaHearing.setTheme (theme);
		 * txtAreaHearing.setForeground(DEF_COL);
		 * 
		 * txtAreaHearing.setFontSize(12);
		 * txtAreaHearing.setFontStyle(Font.BOLD);
		 * scrollPaneHearing.setCorner(JScrollPane.UPPER_LEFT_CORNER,
		 * txtAreaHearing); scrollPaneHearing.setViewportView(txtAreaHearing);
		 * 
		 * scrollPaneVision = new JScrollPane(); scrollPaneVision.setBounds(704,
		 * 375, 195, 91); panel.add(scrollPaneVision);
		 * 
		 * txtAreaVision = new JxTextA(); txtAreaVision.setTheme (theme);
		 * txtAreaVision.setForeground(DEF_COL);
		 * 
		 * txtAreaVision.setFontSize(12); txtAreaVision.setFontStyle(Font.BOLD);
		 * scrollPaneVision .setCorner(JScrollPane.UPPER_LEFT_CORNER,
		 * txtAreaVision); scrollPaneVision.setViewportView(txtAreaVision);
		 */

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 80, 646, 386);
		panel.add(scrollPane);

		table = new JxTable();
		table.setFont(new Font("Arial", Font.PLAIN, 12));
		// careTable = new CarePlanJTable();
		// table.setModel(careTable);
		scrollPane.setViewportView(table);

		final JxLabel comminicationLabel = new JxLabel();
		comminicationLabel.setTheme(theme);

		comminicationLabel.setText("Intervention :");
		comminicationLabel.setBounds(704, 58, 100, 16);
		panel.add(comminicationLabel);

		/*
		 * final JxLabel hearingLabel = new JxLabel(); hearingLabel.setTheme
		 * (theme); hearingLabel.setText("Hearing :");
		 * hearingLabel.setForeground(DEF_COL); hearingLabel.setBounds(704, 227,
		 * 66, 16); panel.add(hearingLabel);
		 * 
		 * final JxLabel visionLabel = new JxLabel(); visionLabel.setTheme
		 * (theme); visionLabel.setText("Vision :");
		 * visionLabel.setForeground(DEF_COL); visionLabel.setBounds(704, 353,
		 * 66, 16); panel.add(visionLabel);
		 */

		doLoad();
	}

	public void doLoad() {
		// txtAreaCommunication.setEnabled(false);
		// txtAreaHearing.setEnabled(false);
		// txtAreaVision.setEnabled(false);
		ResidentAssessmentFormPage23 rePage23;
		List<ResidentAssessmentFormPage23> list = new ArrayList<ResidentAssessmentFormPage23>();
		PanelResidentAssessmentFormPage1 refp1 = Global.panelResidentAssessmentFormPage1;

		// Communication
		rePage23 = new ResidentAssessmentFormPage23();
		rePage23.setName("Communication");
		if (refp1.rbCommunicationAphasic.isSelected() == true
				|| refp1.rbCommunicationDysphasic.isSelected() == true) {
			// lblCommunicationNeeds.setIcon(iconTick);
		} else {
			// lblCommunicationNeeds.setIcon(iconCross);
		}
		if (refp1.rbCommunicationClear.isSelected() == true
				|| refp1.rbCommunicationAphasic.isSelected() == true
				|| refp1.rbCommunicationDysphasic.isSelected() == true) {
			// lblCommunicationField.setIcon(iconTick);
		} else {
			// lblCommunicationField.setIcon(iconCross);
		}
		if (refp1.rbCommunicationClear.isSelected() == true) {
			// lblCommunicationValue.setText("Clear");
			rePage23.setValue("Clear");
		} else if (refp1.rbCommunicationAphasic.isSelected() == true) {
			// lblCommunicationValue.setText("Aphasic");
			rePage23.setValue("Aphasic");
		} else if (refp1.rbCommunicationDysphasic.isSelected() == true) {
			// lblCommunicationValue.setText("Dysphasic");
			rePage23.setValue("Dysphasic");
		} else {
			rePage23.setValue("");
		}

		if (rePage23.getValue().equalsIgnoreCase("Aphasic")
				|| rePage23.getValue().equalsIgnoreCase("Dysphasic")) {
			list.add(rePage23);
		}

		rePage23 = new ResidentAssessmentFormPage23();
		rePage23.setName("Communication: Language(s) spoken");
		if (refp1.cmbCommunicationLanguages.getSelectedItem() != null) {
			// lblLanguageField.setIcon(iconTick);
			// lblLanguageValue.setText(refp1.cmbCommunicationLanguages
			// .getSelectedItem()
			// + "");
			rePage23.setValue(refp1.cmbCommunicationLanguages.getSelectedItem()
					+ "");
		} else {
			// lblLanguageField.setIcon(iconCross);
		}
		if ((refp1.cmbCommunicationLanguages.getSelectedItem() + "")
				.equalsIgnoreCase("English")) {
			// lblLanguageNeeds.setIcon(iconCross);
		} else {
			// txtAreaCommunication.setEnabled(false);
			// lblLanguageNeeds.setIcon(iconTick);
		}
		if (!rePage23.getValue().equalsIgnoreCase("English")) {
			list.add(rePage23);
			// txtAreaCommunication.setEnabled(true);
		}

		rePage23 = new ResidentAssessmentFormPage23();
		rePage23.setName("Communication: (Answer Questions)");
		// suresh if (refp1.rbReluctantly.isSelected() == true
		// suresh || refp1.rbInappropriately.isSelected() == true)
		{
			// lblQANeeds.setIcon(iconTick);
			// suresh } else {
			// lblQANeeds.setIcon(iconCross);
		}
		// suresh if (refp1.rbReadily.isSelected() == true
		// suresh || refp1.rbReluctantly.isSelected() == true
		// suresh || refp1.rbInappropriately.isSelected() == true)
		{
			// lblQAlField.setIcon(iconTick);
			// suresh } else {
			// lblQAlField.setIcon(iconCross);
		}
		// suresh if (refp1.rbReadily.isSelected() == true)
		{
			// lblQAValue.setText("Readily");
			rePage23.setValue("Readily");
			// txtAreaCommunication.setEnabled(false);
			// suresh } else if (refp1.rbReluctantly.isSelected() == true)
			{
				// lblQAValue.setText("Reluctantly");
				rePage23.setValue("Reluctantly");
				// suresh } else if (refp1.rbInappropriately.isSelected() ==
				// true) {
				// lblQAValue.setText("Inappropriately");
				rePage23.setValue("Inappropriately");
				// suresh } else {
				rePage23.setValue("");
			}

			if (rePage23.getValue().equalsIgnoreCase("Reluctantly")
					|| rePage23.getValue().equalsIgnoreCase("Inappropriately")) {
				list.add(rePage23);
				// txtAreaCommunication.setEnabled(true);
			}

			rePage23 = new ResidentAssessmentFormPage23();
			rePage23.setName("Communication: (Oriented)");
			/*
			 * if (refp1.rbCommOrientedNo.isSelected() == true) { //
			 * lblOrientedNeeds.setIcon(iconTick); rePage23.setValue("No"); }
			 * else { // lblOrientedNeeds.setIcon(iconCross);
			 * rePage23.setValue(""); // txtAreaCommunication.setEnabled(false);
			 * } if (refp1.rbCommOrientedYes.isSelected() == true ||
			 * refp1.rbCommOrientedNo.isSelected() == true) { //
			 * lblOrientedField.setIcon(iconTick); } else { //
			 * lblOrientedField.setIcon(iconCross); } if
			 * (refp1.rbCommOrientedYes.isSelected() == true) { //
			 * lblOrientedValue.setText("Yes"); } else if
			 * (refp1.rbCommOrientedNo.isSelected() == true) { //
			 * lblOrientedValue.setText("No"); }
			 */

			/*
			 * if (rePage23.getValue().equalsIgnoreCase("No")) {
			 * list.add(rePage23); // txtAreaCommunication.setEnabled(true); }
			 */

			// Hearing
			rePage23 = new ResidentAssessmentFormPage23();
			rePage23.setName("Hearing: Left");
			if (refp1.cbHearingAdequateWithAidLeft.isSelected()
					|| refp1.cbHearingDeafLef.isSelected()
					|| refp1.cbHearingPoorLeft.isSelected()) {
				// lblHearingLeftNeeds.setIcon(iconTick);
				// lblHearingLeftField.setIcon(iconTick);
			} else if (refp1.cbHearingAdequateLeft.isSelected()) {
				// lblHearingLeftField.setIcon(iconTick);
				// lblHearingLeftNeeds.setIcon(iconCross);
				// lblHearingLeftValue.setText("Adequate Left");
			} else {
				// lblHearingLeftField.setIcon(iconCross);
				// lblHearingLeftNeeds.setIcon(iconCross);
			}

			if (refp1.cbHearingAdequateWithAidLeft.isSelected()) {
				// lblHearingLeftValue.setText("Adequate with Aid: Left");
				rePage23.setValue("Adequate with Aid");
			} else if (refp1.cbHearingDeafLef.isSelected()) {
				// lblHearingLeftValue.setText("Deaf: Left");
				rePage23.setValue("Deaf");
			} else if (refp1.cbHearingPoorLeft.isSelected()) {
				// lblHearingLeftValue.setText("Poor: Left");
				rePage23.setValue("Poor");
			} else {
				rePage23.setValue("");
				// txtAreaHearing.setEnabled(false);
			}

			if (rePage23.getName().equalsIgnoreCase("Hearing: Left")
					&& (rePage23.getValue().equalsIgnoreCase(
							"Adequate with Aid")
							|| rePage23.getValue().equalsIgnoreCase("Deaf") || rePage23
							.getValue().equalsIgnoreCase("Poor"))) {
				list.add(rePage23);
				// txtAreaHearing.setEnabled(true);
			}

			rePage23 = new ResidentAssessmentFormPage23();
			rePage23.setName("Hearing: Right");
			if (refp1.cbHearingAdequateWithAidRight.isSelected()
					|| refp1.cbHearingDeafRight.isSelected()
					|| refp1.cbHearingPoorRight.isSelected()) {
				// lblHearingRightField.setIcon(iconTick);
				// lblHearingRightNeeds.setIcon(iconTick);
			} else if (refp1.cbHearingAdequateRight.isSelected()) {
				// lblHearingRightField.setIcon(iconTick);
				// lblHearingRightNeeds.setIcon(iconCross);
				// lblHearingRightValue.setText("Adequate Right");
			} else {
				// lblHearingRightField.setIcon(iconCross);
				// lblHearingRightNeeds.setIcon(iconCross);
			}
			if (refp1.cbHearingAdequateWithAidRight.isSelected()) {
				// lblHearingRightValue.setText("Adequate with Aid: Right");
				rePage23.setValue("Adequate with Aid");
			} else if (refp1.cbHearingDeafRight.isSelected()) {
				// lblHearingRightValue.setText("Deaf: Right");
				rePage23.setValue("Deaf");

			} else if (refp1.cbHearingPoorRight.isSelected()) {
				// lblHearingRightValue.setText("Poor: Right");
				rePage23.setValue("Poor");
			} else {
				rePage23.setValue("");
				// txtAreaHearing.setEnabled(false);
			}

			if (rePage23.getName().equalsIgnoreCase("Hearing: Right")
					&& (rePage23.getValue().equalsIgnoreCase(
							"Adequate with Aid")
							|| rePage23.getValue().equalsIgnoreCase("Deaf") || rePage23
							.getValue().equalsIgnoreCase("Poor"))) {
				list.add(rePage23);
				// txtAreaHearing.setEnabled(true);
			}

			// Vision
			rePage23 = new ResidentAssessmentFormPage23();
			rePage23.setName("Vision: Left");
			if (refp1.cbVisionAdequateGlassesLeft.isSelected()
					|| refp1.cbVisionBlindLeft.isSelected()
					|| refp1.cbVisionPoorLeft.isSelected()) {
				// lblVisionLeftField.setIcon(iconTick);
				// lblVisionLeftNeeds.setIcon(iconTick);
			} else if (refp1.cbVisionAdequateLeft.isSelected()) {
				// lblVisionLeftField.setIcon(iconTick);
				// lblVisionLeftNeeds.setIcon(iconCross);
				// lblVisionLeftValue.setText("Adequate Left");
			} else {
				// lblVisionLeftField.setIcon(iconCross);
				// lblVisionLeftNeeds.setIcon(iconCross);
			}
			if (refp1.cbVisionAdequateGlassesLeft.isSelected()) {
				// lblVisionLeftValue.setText("Adequate with Glasses: Left");
				rePage23.setValue("Adequate with Glasses");
			} else if (refp1.cbVisionBlindLeft.isSelected()) {
				// lblVisionLeftValue.setText("Bling: Left");
				rePage23.setValue("Blind");
			} else if (refp1.cbVisionPoorLeft.isSelected()) {
				// lblVisionLeftValue.setText("Poor: Left");
				rePage23.setValue("Poor");
			} else {
				rePage23.setValue("");
				// txtAreaVision.setEnabled(false);
			}

			if (rePage23.getName().equalsIgnoreCase("Vision: Left")
					&& (rePage23.getValue().equalsIgnoreCase(
							"Adequate with Glasses")
							|| rePage23.getValue().equalsIgnoreCase("Blind") || rePage23
							.getValue().equalsIgnoreCase("Poor"))) {
				list.add(rePage23);
				// txtAreaVision.setEnabled(true);
			}

			rePage23 = new ResidentAssessmentFormPage23();
			rePage23.setName("Vision: Right");
			if (refp1.cbVisionAdequateGlassesRight.isSelected()
					|| refp1.cbVisionBlindRight.isSelected()
					|| refp1.cbVisionPoorRight.isSelected()) {
				// lblVisionRightField.setIcon(iconTick);
				// lblVisionRightNeeds.setIcon(iconTick);
			} else if (refp1.cbVisionAdequateRight.isSelected()) {
				// lblVisionRightNeeds.setIcon(iconCross);
				// // lblVisionRightField.setIcon(iconTick);
				// lblVisionRightValue.setText("Adequate Right");
			} else {
				// lblVisionRightNeeds.setIcon(iconCross);
				// lblVisionRightField.setIcon(iconCross);
			}
			if (refp1.cbVisionAdequateGlassesRight.isSelected()) {
				// lblVisionRightValue.setText("Adequate with Glasses: Right");
				rePage23.setValue("Adequate with Glasses");
			} else if (refp1.cbVisionBlindRight.isSelected()) {
				// lblVisionRightValue.setText("Bling: Right");
				rePage23.setValue("Blind");
			} else if (refp1.cbVisionPoorRight.isSelected()) {
				// lblVisionRightValue.setText("Poor: Right");
				rePage23.setValue("Poor");
			} else {
				rePage23.setValue("");
				// txtAreaVision.setEnabled(false);
			}

			if (rePage23.getName().equalsIgnoreCase("Vision: Right")
					&& (rePage23.getValue().equalsIgnoreCase(
							"Adequate with Glasses")
							|| rePage23.getValue().equalsIgnoreCase("Blind") || rePage23
							.getValue().equalsIgnoreCase("Poor"))) {
				list.add(rePage23);
				// txtAreaVision.setEnabled(true);
			}
			if (refp1.rbCommunicationAphasic.isSelected()
					|| refp1.rbCommunicationDysphasic.isSelected()
					|| !(refp1.cmbCommunicationLanguages.getSelectedItem() + "")
							.equalsIgnoreCase("English")
			/* || refp1.rbCommOrientedNo.isSelected() */
			// suresh || refp1.rbReluctantly.isSelected()
			// suresh || refp1.rbInappropriately.isSelected()
			) {
				// txtAreaCommunication.setEnabled(true);
			} else {
				// txtAreaCommunication.setEnabled(false);
			}

			if (refp1.cbHearingAdequateWithAidLeft.isSelected()
					|| refp1.cbHearingAdequateWithAidRight.isSelected()
					|| refp1.cbHearingDeafLef.isSelected()
					|| refp1.cbHearingDeafRight.isSelected()
					|| refp1.cbHearingPoorLeft.isSelected()
					|| refp1.cbHearingPoorRight.isSelected()) {
				// txtAreaHearing.setEnabled(true);
			} else {
				// txtAreaHearing.setEnabled(false);
			}

			if (refp1.cbVisionAdequateGlassesLeft.isSelected()
					|| refp1.cbVisionAdequateGlassesRight.isSelected()
					|| refp1.cbVisionBlindLeft.isSelected()
					|| refp1.cbVisionBlindRight.isSelected()
					|| refp1.cbVisionPoorLeft.isSelected()
					|| refp1.cbVisionPoorRight.isSelected()) {
				// txtAreaVision.setEnabled(true);
			} else {
				// txtAreaVision.setEnabled(false);
			}

			CarePlanValues carePlanValues = new CarePlanValues();
			try {
				carePlanValues = MedrexClientManager.getInstance()
						.getCarePlanValues(
								Global.currentResidentAssessmentFormKey,
								Global.currentResidenceKey);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MedrexException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (carePlanValues != null) {
				// txtAreaCommunication.setText(carePlanValues
				// .getCarePlanCommunication());
				// txtAreaHearing.setText(carePlanValues.getCarePlanHearing());
				// txtAreaVision.setText(carePlanValues.getCarePlanVision());
			} else {
				// txtAreaCommunication.setText("");
				// txtAreaHearing.setText("");
				// txtAreaVision.setText("");
			}
			// suresh add
		}
		updateTable(list);

	}

	public int doSave() {
		CarePlanValues careValues = null;
		try {
			careValues = MedrexClientManager.getInstance().getCarePlanValues(
					Global.currentResidentAssessmentFormKey,
					Global.currentResidenceKey);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (careValues != null) {
			careValues.setSerial(careValues.getSerial());
			// careValues.setCarePlanCommunication(txtAreaCommunication.getText());
			// careValues.setCarePlanHearing(txtAreaHearing.getText());
			// careValues.setCarePlanVision(txtAreaVision.getText());
			careValues.setFormId(Global.currentResidentAssessmentFormKey);
			careValues.setResidentId(Global.currentResidenceKey);
		} else {
			careValues = new CarePlanValues();
			// careValues.setSerial(careValues.getSerial());
			// careValues.setCarePlanCommunication(txtAreaCommunication.getText());
			// careValues.setCarePlanHearing(txtAreaHearing.getText());
			// careValues.setCarePlanVision(txtAreaVision.getText());
			careValues.setFormId(Global.currentResidentAssessmentFormKey);
			careValues.setResidentId(Global.currentResidenceKey);
		}

		try {
			key = MedrexClientManager.getInstance()
					.insertOrUpdateCarePlanValues(careValues);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return key;
	}

	public void doUpdate() {

	}

	public boolean doValidate() {
		return false;
	}

	private void updateTable(List<ResidentAssessmentFormPage23> list) {
		// careTable.setNewList(list);
		// careTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
		// System.out.println("List size is :" +list.size());
	}

}

/*
 * class CarePlanJTable extends AbstractTableModel { private String[]
 * columnNames = { "Name", "Value" };
 * 
 * public List<ResidentAssessmentFormPage23> carePlanRecords;
 * 
 * int n = 0;
 * 
 * CarePlanJTable(List<ResidentAssessmentFormPage23> carePlanRecords) {
 * this.carePlanRecords = carePlanRecords; }
 * 
 * CarePlanJTable() { carePlanRecords = new ArrayList(); }
 * 
 * public int getColumnCount() { return columnNames.length; }
 * 
 * public int getRowCount() { return (carePlanRecords.size()); }
 * 
 * public void setNewList(List<ResidentAssessmentFormPage23> carePlanRecords) {
 * this.carePlanRecords = carePlanRecords; }
 * 
 * public String getColumnName(int col) { return columnNames[col]; }
 * 
 * public Object getValueAt(int row, int col) { Object o =
 * carePlanRecords.get(row); try { if (o instanceof
 * ResidentAssessmentFormPage23) { ResidentAssessmentFormPage23 rc =
 * (ResidentAssessmentFormPage23) o;
 * 
 * if (col == 0) { return rc.getName(); } // if (col == 1) { // if
 * (rc.isField()) { // return new JxLabel( //
 * PanelResidentAssessmentFormPage23.iconTick); // } else { // return new
 * JxLabel( // PanelResidentAssessmentFormPage23.iconCross); // } // } // if
 * (col == 2) { // if (rc.isNeeds()) { // return new JxLabel( //
 * PanelResidentAssessmentFormPage23.iconTick); // } else { // return new
 * JxLabel( // PanelResidentAssessmentFormPage23.iconCross); // } // } if (col
 * == 1) { return rc.getValue(); } } } catch (Exception e) {
 * e.printStackTrace(); } return ""; } }
 */
