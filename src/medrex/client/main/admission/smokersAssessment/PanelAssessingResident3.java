package medrex.client.main.admission.smokersAssessment;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.BorderUIResource.CompoundBorderUIResource;
import javax.swing.plaf.basic.BasicBorders;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.intf.Form;
import medrex.commons.vo.admission.smokers.AssessingResident3;

import com.jgoodies.looks.plastic.Plastic3DLookAndFeel;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxRadioButton;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelAssessingResident3 extends JxPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1554590454570699432L;

	Theme theme = new BlackOverWhiteTheme();

	Font font = new Font("Arial", Font.PLAIN, 11);
	Insets margin = new Insets(0, 2, 0, 0);
	Border border = new CompoundBorderUIResource(new LineBorder(Color.BLACK),
			new BasicBorders.MarginBorder());
	Color background = Color.WHITE;
	Color foreground = Color.BLACK;

	private ButtonGroup bgEmergency = new ButtonGroup();
	private ButtonGroup bgLighter = new ButtonGroup();
	private ButtonGroup bgExtinguish = new ButtonGroup();
	private ButtonGroup buttonGroup = new ButtonGroup();
	private ButtonGroup bgDispose = new ButtonGroup();
	private ButtonGroup bgHold = new ButtonGroup();
	private ButtonGroup bgLight = new ButtonGroup();
	private ButtonGroup bgAccess = new ButtonGroup();
	private ButtonGroup bgApron = new ButtonGroup();
	private ButtonGroup bgCigarettesLighter = new ButtonGroup();
	private ButtonGroup bgDesignated = new ButtonGroup();
	private ButtonGroup bgSmokeSafe = new ButtonGroup();
	private ButtonGroup bgHistory = new ButtonGroup();
	private JxLabel txtMedicationSpecify;

	public PanelAssessingResident3() {

		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(810, 910));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);

		panel.setLayout(null);
		panel.setBounds(82, 10, 784, 1174);
		add(panel);

		final JxLabel doesTheResidentLabel = new JxLabel();
		doesTheResidentLabel.setTheme(theme);

		doesTheResidentLabel
				.setText("Does the resident have a history of falling asleep while seated?");
		doesTheResidentLabel.setBounds(45, 10, 669, 14);
		panel.add(doesTheResidentLabel);

		final JxRadioButton rbHistoryYes = new JxRadioButton();
		rbHistoryYes.setTheme(theme);

		rbHistoryYes.setActionCommand("1");
		bgHistory.add(rbHistoryYes);

		rbHistoryYes.setText("Yes");
		rbHistoryYes.setBounds(73, 35, 45, 14);
		panel.add(rbHistoryYes);

		final JxRadioButton rbHistoryNo = new JxRadioButton();
		rbHistoryNo.setTheme(theme);

		rbHistoryNo.setActionCommand("2");
		bgHistory.add(rbHistoryNo);

		rbHistoryNo.setText("No");
		rbHistoryNo.setBounds(130, 35, 38, 14);
		panel.add(rbHistoryNo);

		final JxLabel doesTheResidentLabel_1 = new JxLabel();
		doesTheResidentLabel_1.setTheme(theme);

		doesTheResidentLabel_1
				.setText("Does the resident take any medication that could affect his/her ability to smoke safely.");
		doesTheResidentLabel_1.setBounds(45, 76, 689, 14);
		panel.add(doesTheResidentLabel_1);

		final JxLabel egCausingDrowsinessLabel = new JxLabel();
		egCausingDrowsinessLabel.setTheme(theme);

		egCausingDrowsinessLabel.setText("(e.g. causing drowsiness)?");
		egCausingDrowsinessLabel.setBounds(45, 96, 141, 14);
		panel.add(egCausingDrowsinessLabel);

		final JxRadioButton rbMedicationYes = new JxRadioButton();
		rbMedicationYes.setTheme(theme);

		rbMedicationYes.setActionCommand("1");
		bgSmokeSafe.add(rbMedicationYes);

		rbMedicationYes.setText("Yes");
		rbMedicationYes.setBounds(73, 116, 55, 14);
		panel.add(rbMedicationYes);

		final JxRadioButton rbMedicationNo = new JxRadioButton();
		rbMedicationNo.setTheme(theme);

		rbMedicationNo.setActionCommand("2");
		bgSmokeSafe.add(rbMedicationNo);

		rbMedicationNo.setText("No");
		rbMedicationNo.setBounds(130, 116, 45, 14);
		panel.add(rbMedicationNo);

		final JxLabel ifYesPleaseLabel = new JxLabel();
		ifYesPleaseLabel.setTheme(theme);

		ifYesPleaseLabel.setText("If yes, please specify: ");
		ifYesPleaseLabel.setBounds(45, 140, 125, 14);
		panel.add(ifYesPleaseLabel);

		final JxText txtMedicationSpecify = new JxText();
		txtMedicationSpecify.setTheme(theme);

		txtMedicationSpecify.setBackground(background);
		txtMedicationSpecify.setForeground(foreground);
		txtMedicationSpecify.setMargin(margin);
		txtMedicationSpecify.setBorder(border);
		txtMedicationSpecify.setBounds(45, 158, 467, 18);
		panel.add(txtMedicationSpecify);

		final JxLabel ifYesToLabel = new JxLabel();
		ifYesToLabel.setTheme(theme);

		ifYesToLabel.setFontSize(12);
		ifYesToLabel.setFontStyle(Font.BOLD);
		ifYesToLabel
				.setText("<html><body>If <font size =\"18\"</font> Yes to any of the above, the resident is a fire-risk and is <B><font  size =\"18\"</font> NOT</b> safe to smoke independently,</body></html>");
		ifYesToLabel.setBounds(45, 188, 598, 14);
		panel.add(ifYesToLabel);

		final JxLabel andASupervisedLabel = new JxLabel();
		andASupervisedLabel.setTheme(theme);

		andASupervisedLabel.setFontSize(12);
		andASupervisedLabel.setFontStyle(Font.BOLD);
		andASupervisedLabel
				.setText("and a supervised smoking schedule is to be implemented.");
		andASupervisedLabel.setBounds(45, 210, 436, 14);
		panel.add(andASupervisedLabel);

		final JxLabel ifItAppearsLabel = new JxLabel();
		ifItAppearsLabel.setTheme(theme);

		ifItAppearsLabel
				.setText("If it appears from the interview that the resident is able to smoke independently, an observation");
		ifItAppearsLabel.setBounds(45, 240, 598, 14);
		panel.add(ifItAppearsLabel);

		final JxLabel mustBeDoneLabel = new JxLabel();
		mustBeDoneLabel.setTheme(theme);

		mustBeDoneLabel.setText("must be done as fellows:");
		mustBeDoneLabel.setBounds(45, 264, 141, 14);
		panel.add(mustBeDoneLabel);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);

		label_1.setFontStyle(Font.BOLD);
		label_1.setText("3.");
		label_1.setBounds(10, 320, 17, 14);
		panel.add(label_1);

		final JxLabel directObservationLabel = new JxLabel();
		directObservationLabel.setTheme(theme);

		directObservationLabel.setFontStyle(Font.BOLD);
		directObservationLabel.setText("DIRECT OBSERVATION");
		directObservationLabel.setBounds(45, 320, 141, 14);
		panel.add(directObservationLabel);

		final JxLabel takeTheResidentLabel = new JxLabel();
		takeTheResidentLabel.setTheme(theme);

		takeTheResidentLabel
				.setText("Take the resident outdoors and ask them to smoke a cigarette. Did the resident complete the ");
		takeTheResidentLabel.setBounds(45, 346, 598, 14);
		panel.add(takeTheResidentLabel);

		final JxLabel followingTasksSafelyLabel = new JxLabel();
		followingTasksSafelyLabel.setTheme(theme);

		followingTasksSafelyLabel
				.setText("following tasks safely and independently? If no, comment on the resident's action in the ");
		followingTasksSafelyLabel.setBounds(45, 366, 461, 14);
		panel.add(followingTasksSafelyLabel);

		final JxLabel spaceProvidedIndicateLabel = new JxLabel();
		spaceProvidedIndicateLabel.setTheme(theme);

		spaceProvidedIndicateLabel
				.setText("space provided. Indicate whether the underlying cause is related to physical,cognitive,");
		spaceProvidedIndicateLabel.setBounds(45, 386, 449, 14);
		panel.add(spaceProvidedIndicateLabel);

		final JxLabel perceptualAndLabel = new JxLabel();
		perceptualAndLabel.setTheme(theme);

		perceptualAndLabel.setText("perceptual, and / or behavioral issues.");
		perceptualAndLabel.setBounds(45, 406, 449, 14);
		panel.add(perceptualAndLabel);

		final JxLabel aLabel = new JxLabel();
		aLabel.setTheme(theme);

		aLabel.setText("a.");
		aLabel.setBounds(45, 456, 17, 14);
		panel.add(aLabel);

		final JxLabel getToDesignatedLabel = new JxLabel();
		getToDesignatedLabel.setTheme(theme);

		getToDesignatedLabel.setText("Get to designated smoking area");
		getToDesignatedLabel.setBounds(73, 456, 164, 14);
		panel.add(getToDesignatedLabel);

		final JxRadioButton rbDesignatedYes = new JxRadioButton();
		rbDesignatedYes.setTheme(theme);

		rbDesignatedYes.setActionCommand("1");
		bgDesignated.add(rbDesignatedYes);

		rbDesignatedYes.setText("Yes");
		rbDesignatedYes.setBounds(297, 456, 45, 14);
		panel.add(rbDesignatedYes);

		final JxRadioButton rbDesignatedNo = new JxRadioButton();
		rbDesignatedNo.setTheme(theme);

		rbDesignatedNo.setActionCommand("2");
		bgDesignated.add(rbDesignatedNo);

		rbDesignatedNo.setText("No");
		rbDesignatedNo.setBounds(376, 456, 45, 14);
		panel.add(rbDesignatedNo);

		final JxLabel aLabel_1 = new JxLabel();
		aLabel_1.setTheme(theme);

		aLabel_1.setText("b.");
		aLabel_1.setBounds(45, 480, 23, 14);
		panel.add(aLabel_1);

		final JxLabel getToDesignatedLabel_1 = new JxLabel();
		getToDesignatedLabel_1.setTheme(theme);

		getToDesignatedLabel_1.setText("Obtain cigarettes and lighter");
		getToDesignatedLabel_1.setBounds(73, 480, 147, 14);
		panel.add(getToDesignatedLabel_1);

		final JxRadioButton rbObtainCigarettesYes = new JxRadioButton();
		rbObtainCigarettesYes.setTheme(theme);

		rbObtainCigarettesYes.setActionCommand("1");
		bgCigarettesLighter.add(rbObtainCigarettesYes);

		rbObtainCigarettesYes.setText("Yes");
		rbObtainCigarettesYes.setBounds(297, 480, 45, 14);
		panel.add(rbObtainCigarettesYes);

		final JxRadioButton rbObtainCigarettesNo = new JxRadioButton();
		rbObtainCigarettesNo.setTheme(theme);

		rbObtainCigarettesNo.setActionCommand("2");
		bgCigarettesLighter.add(rbObtainCigarettesNo);

		rbObtainCigarettesNo.setText("No");
		rbObtainCigarettesNo.setBounds(376, 480, 45, 14);
		panel.add(rbObtainCigarettesNo);

		final JxLabel aLabel_1_1 = new JxLabel();
		aLabel_1_1.setTheme(theme);

		aLabel_1_1.setText("c.");
		aLabel_1_1.setBounds(45, 504, 17, 14);
		panel.add(aLabel_1_1);

		final JxLabel getToDesignatedLabel_1_1 = new JxLabel();
		getToDesignatedLabel_1_1.setTheme(theme);

		getToDesignatedLabel_1_1.setText("Obtain and use a smoking apron");
		getToDesignatedLabel_1_1.setBounds(73, 504, 176, 14);
		panel.add(getToDesignatedLabel_1_1);

		final JxRadioButton rbSmokingApronYes = new JxRadioButton();
		rbSmokingApronYes.setTheme(theme);

		rbSmokingApronYes.setActionCommand("1");
		bgApron.add(rbSmokingApronYes);

		rbSmokingApronYes.setText("Yes");
		rbSmokingApronYes.setBounds(297, 504, 45, 14);
		panel.add(rbSmokingApronYes);

		final JxRadioButton rbSmokingApronNo = new JxRadioButton();
		rbSmokingApronNo.setTheme(theme);

		rbSmokingApronNo.setActionCommand("2");
		bgApron.add(rbSmokingApronNo);

		rbSmokingApronNo.setText("No");
		rbSmokingApronNo.setBounds(376, 504, 45, 14);
		panel.add(rbSmokingApronNo);

		final JxLabel aLabel_1_1_1 = new JxLabel();
		aLabel_1_1_1.setTheme(theme);

		aLabel_1_1_1.setText("d.");
		aLabel_1_1_1.setBounds(45, 528, 17, 14);
		panel.add(aLabel_1_1_1);

		final JxLabel getToDesignatedLabel_1_1_1 = new JxLabel();
		getToDesignatedLabel_1_1_1.setTheme(theme);

		getToDesignatedLabel_1_1_1.setText("Access an ashtray");
		getToDesignatedLabel_1_1_1.setBounds(73, 528, 176, 14);
		panel.add(getToDesignatedLabel_1_1_1);

		final JxRadioButton rbAshtrayYes = new JxRadioButton();
		rbAshtrayYes.setTheme(theme);

		rbAshtrayYes.setActionCommand("1");
		bgAccess.add(rbAshtrayYes);

		rbAshtrayYes.setText("Yes");
		rbAshtrayYes.setBounds(297, 528, 45, 14);
		panel.add(rbAshtrayYes);

		final JxRadioButton rbAshtrayNo = new JxRadioButton();
		rbAshtrayNo.setTheme(theme);

		rbAshtrayNo.setActionCommand("2");
		bgAccess.add(rbAshtrayNo);

		rbAshtrayNo.setText("No");
		rbAshtrayNo.setBounds(376, 528, 45, 14);
		panel.add(rbAshtrayNo);

		final JxLabel aLabel_1_1_1_1 = new JxLabel();
		aLabel_1_1_1_1.setTheme(theme);

		aLabel_1_1_1_1.setText("e.");
		aLabel_1_1_1_1.setBounds(45, 552, 17, 14);
		panel.add(aLabel_1_1_1_1);

		final JxLabel getToDesignatedLabel_1_1_1_1 = new JxLabel();
		getToDesignatedLabel_1_1_1_1.setTheme(theme);

		getToDesignatedLabel_1_1_1_1.setText("Light cigarette");
		getToDesignatedLabel_1_1_1_1.setBounds(73, 552, 176, 14);
		panel.add(getToDesignatedLabel_1_1_1_1);

		final JxRadioButton rbLightCigaretteYes = new JxRadioButton();
		rbLightCigaretteYes.setTheme(theme);

		rbLightCigaretteYes.setActionCommand("1");
		bgLight.add(rbLightCigaretteYes);

		rbLightCigaretteYes.setText("Yes");
		rbLightCigaretteYes.setBounds(297, 552, 45, 14);
		panel.add(rbLightCigaretteYes);

		final JxRadioButton rbLightCigaretteNo = new JxRadioButton();
		rbLightCigaretteNo.setTheme(theme);

		rbLightCigaretteNo.setActionCommand("2");
		bgLight.add(rbLightCigaretteNo);

		rbLightCigaretteNo.setText("No");
		rbLightCigaretteNo.setBounds(376, 552, 45, 14);
		panel.add(rbLightCigaretteNo);

		final JxLabel aLabel_1_1_1_1_1 = new JxLabel();
		aLabel_1_1_1_1_1.setTheme(theme);

		aLabel_1_1_1_1_1.setText("f.");
		aLabel_1_1_1_1_1.setBounds(45, 576, 17, 14);
		panel.add(aLabel_1_1_1_1_1);

		final JxLabel getToDesignatedLabel_1_1_1_1_1 = new JxLabel();
		getToDesignatedLabel_1_1_1_1_1.setTheme(theme);

		getToDesignatedLabel_1_1_1_1_1.setText("Hold cigarette securely");
		getToDesignatedLabel_1_1_1_1_1.setBounds(73, 576, 176, 14);
		panel.add(getToDesignatedLabel_1_1_1_1_1);

		final JxRadioButton rbHoldCigaretteYes = new JxRadioButton();
		rbHoldCigaretteYes.setTheme(theme);

		rbHoldCigaretteYes.setActionCommand("1");
		bgHold.add(rbHoldCigaretteYes);

		rbHoldCigaretteYes.setText("Yes");
		rbHoldCigaretteYes.setBounds(297, 576, 45, 14);
		panel.add(rbHoldCigaretteYes);

		final JxRadioButton rbHoldCigaretteNo = new JxRadioButton();
		rbHoldCigaretteNo.setTheme(theme);

		rbHoldCigaretteNo.setActionCommand("2");
		bgHold.add(rbHoldCigaretteNo);

		rbHoldCigaretteNo.setText("No");
		rbHoldCigaretteNo.setBounds(376, 576, 45, 14);
		panel.add(rbHoldCigaretteNo);

		final JxLabel aLabel_1_1_1_1_1_1 = new JxLabel();
		aLabel_1_1_1_1_1_1.setTheme(theme);

		aLabel_1_1_1_1_1_1.setText("g.");
		aLabel_1_1_1_1_1_1.setBounds(45, 600, 17, 14);
		panel.add(aLabel_1_1_1_1_1_1);

		final JxLabel getToDesignatedLabel_1_1_1_1_1_1 = new JxLabel();
		getToDesignatedLabel_1_1_1_1_1_1.setTheme(theme);

		getToDesignatedLabel_1_1_1_1_1_1.setText("Dispose of ashes in ashtray");
		getToDesignatedLabel_1_1_1_1_1_1.setBounds(73, 600, 176, 14);
		panel.add(getToDesignatedLabel_1_1_1_1_1_1);

		final JxRadioButton rbDisposeAshesYes = new JxRadioButton();
		rbDisposeAshesYes.setTheme(theme);

		rbDisposeAshesYes.setActionCommand("1");
		bgDispose.add(rbDisposeAshesYes);

		rbDisposeAshesYes.setText("Yes");
		rbDisposeAshesYes.setBounds(297, 600, 45, 14);
		panel.add(rbDisposeAshesYes);

		final JxRadioButton rbDisposeAshesNo = new JxRadioButton();
		rbDisposeAshesNo.setTheme(theme);

		rbDisposeAshesNo.setActionCommand("2");
		bgDispose.add(rbDisposeAshesNo);

		rbDisposeAshesNo.setText("No");
		rbDisposeAshesNo.setBounds(376, 600, 45, 14);
		panel.add(rbDisposeAshesNo);

		final JxLabel aLabel_1_1_1_1_1_1_1 = new JxLabel();
		aLabel_1_1_1_1_1_1_1.setTheme(theme);

		aLabel_1_1_1_1_1_1_1.setText("h.");
		aLabel_1_1_1_1_1_1_1.setBounds(45, 624, 17, 14);
		panel.add(aLabel_1_1_1_1_1_1_1);

		final JxLabel getToDesignatedLabel_1_1_1_1_1_1_1 = new JxLabel();
		getToDesignatedLabel_1_1_1_1_1_1_1.setTheme(theme);

		getToDesignatedLabel_1_1_1_1_1_1_1.setText("Extinguish cigarette");
		getToDesignatedLabel_1_1_1_1_1_1_1.setBounds(73, 624, 176, 14);
		panel.add(getToDesignatedLabel_1_1_1_1_1_1_1);

		final JxRadioButton rbExtinguishYes = new JxRadioButton();
		rbExtinguishYes.setTheme(theme);
		rbExtinguishYes.setActionCommand("1");
		bgExtinguish.add(rbExtinguishYes);

		rbExtinguishYes.setFontSize(12);
		rbExtinguishYes.setText("Yes");
		rbExtinguishYes.setBounds(297, 624, 45, 14);
		panel.add(rbExtinguishYes);

		final JxRadioButton rbExtinguishNo = new JxRadioButton();
		rbExtinguishNo.setTheme(theme);

		rbExtinguishNo.setActionCommand("2");
		bgExtinguish.add(rbExtinguishNo);

		rbExtinguishNo.setText("No");
		rbExtinguishNo.setBounds(376, 624, 45, 14);
		panel.add(rbExtinguishNo);

		final JxLabel aLabel_1_1_1_1_1_1_1_1 = new JxLabel();
		aLabel_1_1_1_1_1_1_1_1.setTheme(theme);

		aLabel_1_1_1_1_1_1_1_1.setText("i.");
		aLabel_1_1_1_1_1_1_1_1.setBounds(45, 648, 17, 14);
		panel.add(aLabel_1_1_1_1_1_1_1_1);

		final JxLabel getToDesignatedLabel_1_1_1_1_1_1_1_1 = new JxLabel();
		getToDesignatedLabel_1_1_1_1_1_1_1_1.setTheme(theme);

		getToDesignatedLabel_1_1_1_1_1_1_1_1
				.setText("Return cigarettes and lighter to storage");
		getToDesignatedLabel_1_1_1_1_1_1_1_1.setBounds(73, 648, 218, 14);
		panel.add(getToDesignatedLabel_1_1_1_1_1_1_1_1);

		final JxRadioButton rbCigarettesStorageYes = new JxRadioButton();
		rbCigarettesStorageYes.setTheme(theme);
		rbCigarettesStorageYes.setActionCommand("1");
		bgLighter.add(rbCigarettesStorageYes);

		rbCigarettesStorageYes.setFontSize(12);
		rbCigarettesStorageYes.setText("Yes");
		rbCigarettesStorageYes.setBounds(297, 648, 60, 14);
		panel.add(rbCigarettesStorageYes);

		final JxRadioButton rbCigarettesStorageNo = new JxRadioButton();
		rbCigarettesStorageNo.setTheme(theme);

		rbCigarettesStorageNo.setActionCommand("2");
		bgLighter.add(rbCigarettesStorageNo);

		rbCigarettesStorageNo.setText("No");
		rbCigarettesStorageNo.setBounds(376, 648, 45, 14);
		panel.add(rbCigarettesStorageNo);

		final JxLabel aLabel_1_1_1_1_1_1_1_1_1 = new JxLabel();
		aLabel_1_1_1_1_1_1_1_1_1.setTheme(theme);

		aLabel_1_1_1_1_1_1_1_1_1.setText("g.");
		aLabel_1_1_1_1_1_1_1_1_1.setBounds(45, 672, 17, 14);
		panel.add(aLabel_1_1_1_1_1_1_1_1_1);

		final JxLabel getToDesignatedLabel_1_1_1_1_1_1_1_1_1 = new JxLabel();
		getToDesignatedLabel_1_1_1_1_1_1_1_1_1.setTheme(theme);

		getToDesignatedLabel_1_1_1_1_1_1_1_1_1
				.setText("Able to call for emergency assistance");
		getToDesignatedLabel_1_1_1_1_1_1_1_1_1.setBounds(73, 672, 197, 14);
		panel.add(getToDesignatedLabel_1_1_1_1_1_1_1_1_1);

		final JxRadioButton rbEmergencyAssistYes = new JxRadioButton();
		rbEmergencyAssistYes.setTheme(theme);

		rbEmergencyAssistYes.setActionCommand("1");
		bgEmergency.add(rbEmergencyAssistYes);

		rbEmergencyAssistYes.setText("Yes");
		rbEmergencyAssistYes.setBounds(297, 672, 45, 14);
		panel.add(rbEmergencyAssistYes);

		final JxRadioButton rbEmergencyAssistNo = new JxRadioButton();
		rbEmergencyAssistNo.setTheme(theme);

		rbEmergencyAssistNo.setActionCommand("2");
		bgEmergency.add(rbEmergencyAssistNo);

		rbEmergencyAssistNo.setText("No");
		rbEmergencyAssistNo.setBounds(376, 672, 45, 14);
		panel.add(rbEmergencyAssistNo);

		final JxLabel ifNoToLabel = new JxLabel();
		ifNoToLabel.setTheme(theme);

		ifNoToLabel.setFontSize(14);
		ifNoToLabel.setFontStyle(Font.BOLD);
		ifNoToLabel
				.setText("If NO to any of the above, the resident is a fire-risk and is NOT able to smoke independently");
		ifNoToLabel.setBounds(45, 750, 669, 14);
		panel.add(ifNoToLabel);

		final JxLabel ifYesToLabel_1 = new JxLabel();
		ifYesToLabel_1.setTheme(theme);

		ifYesToLabel_1.setFontSize(14);
		ifYesToLabel_1.setFontStyle(Font.BOLD);
		ifYesToLabel_1
				.setText("If YES to ALL OF THE ABOVE, the resident is able to smoke independently.");
		ifYesToLabel_1.setBounds(45, 775, 637, 14);
		panel.add(ifYesToLabel_1);

		final JxText textField_1 = new JxText();
		textField_1.setTheme(theme);
		textField_1.setBounds(45, 928, 225, 18);
		panel.add(textField_1);

		final JxLabel printNametitleLabel = new JxLabel();
		printNametitleLabel.setTheme(theme);
		printNametitleLabel.setText("Print Name/Title");
		printNametitleLabel.setBounds(45, 953, 225, 14);
		panel.add(printNametitleLabel);

		final JxText textField_1_1 = new JxText();
		textField_1_1.setTheme(theme);
		textField_1_1.setBounds(318, 928, 225, 18);
		panel.add(textField_1_1);

		final JxLabel printNametitleLabel_1 = new JxLabel();
		printNametitleLabel_1.setTheme(theme);
		printNametitleLabel_1.setText("Signature");
		printNametitleLabel_1.setBounds(318, 953, 225, 14);
		panel.add(printNametitleLabel_1);

		final JxLabel quarterlyReviewLabel = new JxLabel();
		quarterlyReviewLabel.setTheme(theme);
		quarterlyReviewLabel.setText("QUARTERLY REVIEW");
		quarterlyReviewLabel.setBounds(45, 1010, 113, 23);
		panel.add(quarterlyReviewLabel);

		final JxLabel fLabel = new JxLabel();
		fLabel.setTheme(theme);

		fLabel.setText("f.");
		fLabel.setBounds(10, 10, 17, 14);
		panel.add(fLabel);

		final JxLabel fLabel_1 = new JxLabel();
		fLabel_1.setTheme(theme);

		fLabel_1.setText("g.");
		fLabel_1.setBounds(10, 76, 17, 14);
		panel.add(fLabel_1);

		final JSeparator separator = new JSeparator();
		separator.setBounds(45, 230, 694, 8);
		panel.add(separator);
	}

	public static void main(String args[]) {
		try {
			UIManager.setLookAndFeel(new Plastic3DLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PanelAssessingResident3 panelAssessingResident2 = new PanelAssessingResident3();
		JFrame f = SwingUtils.wrapInFrame(panelAssessingResident2);
		f.setVisible(true);
	}

	@Override
	public void doLoad() {
		// TODO Auto-generated method stub

	}

	public int doSave() {

		AssessingResident3 refAssessingResident3 = new AssessingResident3();
		refAssessingResident3.setResidentId(Global.currentResidenceKey);
		refAssessingResident3.setResidentId(Global.currentResidenceKey);
		refAssessingResident3.setFormId(Global.currentAssessingResident1);
		refAssessingResident3.setSerial(Global.currentAssessingResident3);
		refAssessingResident3.setEmergency(SwingUtils
				.getSelectedButton(bgEmergency));
		refAssessingResident3.setLighter(SwingUtils
				.getSelectedButton(bgLighter));
		refAssessingResident3.setExtinguish(SwingUtils
				.getSelectedButton(bgExtinguish));
		// refAssessingResident3.setttonGroup(SwingUtils.getSelectedButton(bgttonGroup));
		refAssessingResident3.setDispose(SwingUtils
				.getSelectedButton(bgDispose));
		refAssessingResident3.setHold(SwingUtils.getSelectedButton(bgHold));
		refAssessingResident3.setLight(SwingUtils.getSelectedButton(bgLight));
		refAssessingResident3.setAccess(SwingUtils.getSelectedButton(bgAccess));
		refAssessingResident3.setApron(SwingUtils.getSelectedButton(bgApron));
		// refAssessingResident3.setCigarettesLighter(SwingUtils.getSelectedButton(bgCigarettesLighter));
		refAssessingResident3.setDesignated(SwingUtils
				.getSelectedButton(bgDesignated));
		refAssessingResident3.setSmokeSafe(SwingUtils
				.getSelectedButton(bgSmokeSafe));
		refAssessingResident3.setHistory(SwingUtils
				.getSelectedButton(bgHistory));
		// refAssessingResident3.setMedicationSpecify(txtMedicationSpecify.getText());

		try {
			Global.currentAssessingResident3 = MedrexClientManager
					.getInstance().insertOrUpdateAssessingResident3(
							refAssessingResident3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Global.currentAssessingResident3;
	}

	public void doUpdate() {
		AssessingResident3 refassessingResident3 = null;

		if (Global.currentAssessingResident1 != 0) {
			try {
				refassessingResident3 = MedrexClientManager
						.getInstance()
						.getAssessingResident3(Global.currentAssessingResident1);
				if (refassessingResident3 != null) {

					Global.currentAssessingResident3 = refassessingResident3
							.getSerial();
					SwingUtils.setSelectedButton(bgEmergency,
							refassessingResident3.getEmergency());
					SwingUtils.setSelectedButton(bgLighter,
							refassessingResident3.getLighter());
					SwingUtils.setSelectedButton(bgExtinguish,
							refassessingResident3.getExtinguish());
					// SwingUtils.setSelectedButton(bgttonGroup,
					// refassessingResident3.getttonGroup());
					SwingUtils.setSelectedButton(bgDispose,
							refassessingResident3.getDispose());
					SwingUtils.setSelectedButton(bgHold, refassessingResident3
							.getHold());
					SwingUtils.setSelectedButton(bgLight, refassessingResident3
							.getLight());
					SwingUtils.setSelectedButton(bgAccess,
							refassessingResident3.getAccess());
					SwingUtils.setSelectedButton(bgApron, refassessingResident3
							.getApron());
					SwingUtils.setSelectedButton(bgCigarettesLighter,
							refassessingResident3.getCigarettesLighter());
					SwingUtils.setSelectedButton(bgDesignated,
							refassessingResident3.getDesignated());
					SwingUtils.setSelectedButton(bgSmokeSafe,
							refassessingResident3.getSmokeSafe());
					SwingUtils.setSelectedButton(bgHistory,
							refassessingResident3.getHistory());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	@Override
	public boolean doValidate() {
		// TODO Auto-generated method stub
		return true;
	}

}
