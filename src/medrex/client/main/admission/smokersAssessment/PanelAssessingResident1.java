package medrex.client.main.admission.smokersAssessment;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.BorderUIResource.CompoundBorderUIResource;
import javax.swing.plaf.basic.BasicBorders;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.intf.Form;
import medrex.commons.vo.admission.smokers.AssessingResident1;

import com.sX.swing.JxCheckBox;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxRadioButton;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelAssessingResident1 extends JxPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4702052803993782846L;
	Theme theme = new BlackOverWhiteTheme();
	Font font = new Font("Arial", Font.PLAIN, 12);
	Insets margin = new Insets(0, 2, 0, 0);
	Border border = new CompoundBorderUIResource(new LineBorder(Color.BLACK),
			new BasicBorders.MarginBorder());
	Color background = Color.WHITE;
	Color foreground = Color.BLACK;

	private ButtonGroup bgYesnotifyAttendingPhysician = new ButtonGroup();
	private JxRadioButton noRadioButton;
	private JxRadioButton yesRadioButton;
	private JxText txtFirstCigarette;
	private JxText txtManyCigarettes;
	private JxText txtSourceOfInformation;
	private JxCheckBox cbAttendingPhysician;
	private JxCheckBox cbNursing;
	private JxCheckBox cbDiscussion;
	private JxCheckBox cbReview;
	private JxCheckBox cbFamily;
	private JxCheckBox cbObservation;
	private JxRadioButton rbSmokeNo;
	private JxRadioButton rbSmokeYes;
	private JxText txtRoom;
	private JxText txtNameOfResident;
	private JxText txtExplainInShort;
	private JxText txtTimeOfAssessing;
	private ButtonGroup bgAssistanceSmoking = new ButtonGroup();
	private JxDateChooser dcDateOfIndependently;
	private JxDateChooser dcBirthDate;
	private ButtonGroup bgSmoke = new ButtonGroup();
	private AssessingResident1 refAssessingResident1;
	private JxRadioButton rbYesnotifyAttendingPhysician;

	public PanelAssessingResident1() {
		super();
		setBackground(Color.WHITE);
		setSize(810, 1015);
		setPreferredSize(new Dimension(810, 1150));

		// setPreferredSize(getSize());
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);

		panel.setLayout(null);
		panel.setBounds(190, 0, 834, 1111);
		add(panel);

		final JxLabel plazaHealthcareLabel = new JxLabel();
		plazaHealthcareLabel.setTheme(theme);
		plazaHealthcareLabel.setFontStyle(Font.BOLD);
		plazaHealthcareLabel.setFontSize(18);
		plazaHealthcareLabel.setBounds(170, 24, 409, 24);
		plazaHealthcareLabel
				.setText("Plaza HealthCare & Rehabilitation Center");
		panel.add(plazaHealthcareLabel);

		final JxLabel assessingResidentsAbilityLabel = new JxLabel();

		assessingResidentsAbilityLabel
				.setText("       ASSESSING RESIDENT'S ABILITY TO SMOKE INDEPENDENTLY");
		assessingResidentsAbilityLabel.setFontStyle(Font.BOLD);
		assessingResidentsAbilityLabel.setBounds(170, 45, 420, 24);
		panel.add(assessingResidentsAbilityLabel);

		final JxLabel nameOfResidentLabel = new JxLabel();
		nameOfResidentLabel.setTheme(theme);

		nameOfResidentLabel.setText("Name of Resident");
		nameOfResidentLabel.setBounds(10, 104, 105, 14);
		panel.add(nameOfResidentLabel);

		txtNameOfResident = new JxText();
		txtNameOfResident.setTheme(theme);

		txtNameOfResident.setBackground(background);
		txtNameOfResident.setForeground(foreground);
		txtNameOfResident.setMargin(margin);
		txtNameOfResident.setBorder(border);

		txtNameOfResident.setBounds(143, 101, 246, 21);
		panel.add(txtNameOfResident);

		final JxLabel dateOfBirthLabel = new JxLabel();
		dateOfBirthLabel.setTheme(theme);

		dateOfBirthLabel.setText("Date of Birth");
		dateOfBirthLabel.setBounds(425, 104, 74, 14);
		panel.add(dateOfBirthLabel);

		final JxLabel dateLabel = new JxLabel();
		dateLabel.setTheme(theme);

		dateLabel.setText("Date : ");
		dateLabel.setBounds(10, 155, 42, 14);
		panel.add(dateLabel);

		final JxLabel timeLabel = new JxLabel();
		timeLabel.setTheme(theme);

		timeLabel.setText("Time :");
		timeLabel.setBounds(425, 155, 42, 14);
		panel.add(timeLabel);

		txtTimeOfAssessing = new JxText();
		txtTimeOfAssessing.setTheme(theme);

		txtTimeOfAssessing.setBackground(background);
		txtTimeOfAssessing.setForeground(foreground);
		txtTimeOfAssessing.setMargin(margin);
		txtTimeOfAssessing.setBorder(border);

		txtTimeOfAssessing.setBounds(505, 152, 42, 21);
		panel.add(txtTimeOfAssessing);

		final JxLabel roomLabel = new JxLabel();
		roomLabel.setTheme(theme);

		roomLabel.setText("Room:");
		roomLabel.setBounds(562, 155, 40, 14);
		panel.add(roomLabel);

		txtRoom = new JxText();
		txtRoom.setTheme(theme);

		txtRoom.setBackground(background);
		txtRoom.setForeground(foreground);
		txtRoom.setMargin(margin);
		txtRoom.setBorder(border);

		txtRoom.setBounds(605, 152, 79, 21);
		panel.add(txtRoom);

		final JxLabel doesResidentSmokeLabel = new JxLabel();
		doesResidentSmokeLabel.setTheme(theme);

		doesResidentSmokeLabel
				.setText("<html><body><I><B>DOES RESIDENT SMOKE?</B></I></BODY></HTML>");
		doesResidentSmokeLabel.setBounds(10, 217, 167, 20);
		panel.add(doesResidentSmokeLabel);

		final JxLabel yesLabel = new JxLabel();
		yesLabel.setTheme(theme);

		yesLabel.setFontStyle(Font.BOLD);
		yesLabel.setText("YES");
		yesLabel.setBounds(206, 217, 22, 20);
		panel.add(yesLabel);

		rbSmokeYes = new JxRadioButton();
		rbSmokeYes.setTheme(theme);
		rbSmokeYes.setActionCommand("1");
		bgSmoke.add(rbSmokeYes);

		rbSmokeYes.setText("");
		rbSmokeYes.setBounds(235, 217, 22, 20);
		panel.add(rbSmokeYes);

		final JxLabel noLabel = new JxLabel();
		noLabel.setTheme(theme);

		noLabel.setFontStyle(Font.BOLD);
		noLabel.setText("No");
		noLabel.setBounds(280, 217, 22, 20);
		panel.add(noLabel);

		rbSmokeNo = new JxRadioButton();
		rbSmokeNo.setTheme(theme);

		rbSmokeNo.setActionCommand("2");
		bgSmoke.add(rbSmokeNo);

		rbSmokeNo.setText("");
		rbSmokeNo.setBounds(300, 217, 16, 20);
		panel.add(rbSmokeNo);

		final JxLabel ifYesProceedLabel = new JxLabel();
		ifYesProceedLabel.setTheme(theme);

		ifYesProceedLabel.setFontStyle(Font.BOLD);
		ifYesProceedLabel.setText("If YES, Proceed with this assessment.");
		ifYesProceedLabel.setBounds(13, 262, 239, 14);
		panel.add(ifYesProceedLabel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);

		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(22, 295, 10, 10);
		panel.add(panel_1);

		final JxLabel basedOnTheLabel = new JxLabel();
		basedOnTheLabel.setTheme(theme);

		basedOnTheLabel
				.setText("<html><p align = \"justify\">Based on the outcome of the following assessment, residents must be deemed able to smoke safely without assistance from staff. If the resident does not meet these criteria, he/she will be placed on a smoking schedule and accompanied by staff.");
		basedOnTheLabel.setBounds(50, 292, 641, 49);
		panel.add(basedOnTheLabel);

		final JxLabel thisFormIsLabel = new JxLabel();
		thisFormIsLabel.setTheme(theme);

		thisFormIsLabel
				.setText("<html><body>This form is to be completed when the resident is awake and alert, oriented to time,place, and <br>person and is able to ambulate independently or propel himself, or herself, in a wheelchair. If the<br> resident does not meet these criteria, they will be placed on a smoking schedule and accompanied<br> by staff.</body><html>");
		thisFormIsLabel.setBounds(13, 348, 699, 73);
		panel.add(thisFormIsLabel);

		final JxLabel informationSourcesLabel = new JxLabel();
		informationSourcesLabel.setTheme(theme);

		informationSourcesLabel.setFontStyle(Font.BOLD);
		informationSourcesLabel
				.setText("Information Sources : (check all that apply);");
		informationSourcesLabel.setBounds(13, 436, 271, 24);
		panel.add(informationSourcesLabel);

		cbObservation = new JxCheckBox();
		cbObservation.setTheme(theme);

		cbObservation.setText("Observation");
		cbObservation.setBounds(13, 478, 151, 18);
		panel.add(cbObservation);

		cbFamily = new JxCheckBox();
		cbFamily.setTheme(theme);

		cbFamily.setText("Family/caregiver");
		cbFamily.setBounds(13, 499, 196, 18);
		panel.add(cbFamily);

		cbReview = new JxCheckBox();
		cbReview.setTheme(theme);

		cbReview.setText("Chart review for smoking incidents");
		cbReview.setBounds(13, 520, 281, 18);
		panel.add(cbReview);

		cbDiscussion = new JxCheckBox();
		cbDiscussion.setTheme(theme);

		cbDiscussion.setText("Discussion with resident");
		cbDiscussion.setBounds(383, 478, 226, 18);
		panel.add(cbDiscussion);

		cbNursing = new JxCheckBox();
		cbNursing.setTheme(theme);

		cbNursing.setText("Nursing/Team report");
		cbNursing.setBounds(383, 499, 231, 18);
		panel.add(cbNursing);

		cbAttendingPhysician = new JxCheckBox();
		cbAttendingPhysician.setTheme(theme);

		cbAttendingPhysician
				.setText("<html><body>Attending physician and/ or pharmacist <br>related to medication regimen</body></html>");
		cbAttendingPhysician.setBounds(383, 520, 265, 25);
		panel.add(cbAttendingPhysician);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontStyle(Font.BOLD);
		label.setText("1.");
		label.setBounds(13, 620, 16, 14);
		panel.add(label);

		final JxLabel residentPerspectiveLabel = new JxLabel();
		residentPerspectiveLabel.setTheme(theme);

		residentPerspectiveLabel.setFontStyle(Font.BOLD);
		residentPerspectiveLabel.setText("RESIDENT PERSPECTIVE");
		residentPerspectiveLabel.setBounds(35, 620, 232, 14);
		panel.add(residentPerspectiveLabel);

		final JxLabel sourceOfInformationLabel = new JxLabel();
		sourceOfInformationLabel.setTheme(theme);

		sourceOfInformationLabel
				.setText("Source of information, if not resident");
		sourceOfInformationLabel.setBounds(35, 643, 235, 14);
		panel.add(sourceOfInformationLabel);

		txtSourceOfInformation = new JxText();
		txtSourceOfInformation.setTheme(theme);

		txtSourceOfInformation.setBackground(background);
		txtSourceOfInformation.setForeground(foreground);
		txtSourceOfInformation.setMargin(margin);
		txtSourceOfInformation.setBorder(border);
		txtSourceOfInformation.setBounds(330, 640, 322, 21);
		panel.add(txtSourceOfInformation);

		final JxLabel aLabel = new JxLabel();
		aLabel.setTheme(theme);

		aLabel.setText("a.");
		aLabel.setBounds(35, 693, 10, 14);
		panel.add(aLabel);

		final JxLabel wouldYouLikeLabel = new JxLabel();
		wouldYouLikeLabel.setTheme(theme);

		wouldYouLikeLabel.setText("Would you like to quit smoking");
		wouldYouLikeLabel.setBounds(60, 693, 207, 14);
		panel.add(wouldYouLikeLabel);

		final JxLabel bLabel = new JxLabel();
		bLabel.setTheme(theme);

		bLabel.setText("b.");
		bLabel.setBounds(35, 750, 16, 14);
		panel.add(bLabel);

		final JxLabel howManyCigarettesLabel = new JxLabel();
		howManyCigarettesLabel.setTheme(theme);

		howManyCigarettesLabel
				.setText("How many cigarettes do you smoke every day?");
		howManyCigarettesLabel.setBounds(60, 750, 269, 14);
		panel.add(howManyCigarettesLabel);

		txtManyCigarettes = new JxText();
		txtManyCigarettes.setTheme(theme);

		txtManyCigarettes.setBackground(background);
		txtManyCigarettes.setForeground(foreground);
		txtManyCigarettes.setMargin(margin);
		txtManyCigarettes.setBorder(border);
		txtManyCigarettes.setBounds(330, 747, 322, 21);
		panel.add(txtManyCigarettes);

		final JxLabel cLabel = new JxLabel();
		cLabel.setTheme(theme);

		cLabel.setText("c.");
		cLabel.setBounds(35, 800, 10, 14);
		panel.add(cLabel);

		final JxLabel whenIsYourLabel = new JxLabel();
		whenIsYourLabel.setTheme(theme);

		whenIsYourLabel.setText("When is your first cigarette of the day?");
		whenIsYourLabel.setBounds(60, 800, 226, 14);
		panel.add(whenIsYourLabel);

		txtFirstCigarette = new JxText();
		txtFirstCigarette.setTheme(theme);

		txtFirstCigarette.setBackground(background);
		txtFirstCigarette.setForeground(foreground);
		txtFirstCigarette.setMargin(margin);
		txtFirstCigarette.setBorder(border);
		txtFirstCigarette.setBounds(330, 797, 322, 21);
		panel.add(txtFirstCigarette);

		final JxLabel dLabel = new JxLabel();

		dLabel.setText("d.");
		dLabel.setBounds(35, 850, 11, 14);
		panel.add(dLabel);

		final JxLabel doYouNeedLabel = new JxLabel();
		doYouNeedLabel.setTheme(theme);

		doYouNeedLabel.setText("Do you need assistance smoking?");
		doYouNeedLabel.setBounds(60, 850, 244, 14);
		panel.add(doYouNeedLabel);

		final JxLabel explainLabel = new JxLabel();
		explainLabel.setTheme(theme);

		explainLabel.setText("Explain");
		explainLabel.setBounds(13, 953, 54, 14);
		panel.add(explainLabel);

		txtExplainInShort = new JxText();
		txtExplainInShort.setTheme(theme);

		txtExplainInShort.setBackground(background);
		txtExplainInShort.setForeground(foreground);
		txtExplainInShort.setMargin(margin);
		txtExplainInShort.setBorder(border);
		txtExplainInShort.setBounds(80, 950, 572, 21);
		panel.add(txtExplainInShort);

		dcBirthDate = new JxDateChooser();
		dcBirthDate.setTheme(theme);

		// dcBirthDate.setDateFormatString("MMMMM d, yyyy");
		dcBirthDate.setDateFormatString("MM/dd//yyyy");
		dcBirthDate.setBounds(505, 101, 102, 21);
		panel.add(dcBirthDate);

		dcDateOfIndependently = new JxDateChooser();
		dcDateOfIndependently.setTheme(theme);

		dcDateOfIndependently.setDateFormatString("MM/dd//yyyy");
		dcDateOfIndependently.setBounds(143, 152, 246, 21);
		panel.add(dcDateOfIndependently);

		yesRadioButton = new JxRadioButton();
		yesRadioButton.setTheme(theme);

		yesRadioButton.setActionCommand("1");
		bgAssistanceSmoking.add(yesRadioButton);

		yesRadioButton.setText("Yes");
		yesRadioButton.setBounds(64, 875, 50, 15);
		panel.add(yesRadioButton);

		noRadioButton = new JxRadioButton();
		noRadioButton.setTheme(theme);

		noRadioButton.setActionCommand("2");
		bgAssistanceSmoking.add(noRadioButton);

		noRadioButton.setText("No");
		noRadioButton.setBounds(143, 875, 42, 15);
		panel.add(noRadioButton);

		rbYesnotifyAttendingPhysician = new JxRadioButton();
		rbYesnotifyAttendingPhysician.setTheme(theme);

		bgYesnotifyAttendingPhysician.add(rbYesnotifyAttendingPhysician);
		rbYesnotifyAttendingPhysician.setActionCommand("1");

		rbYesnotifyAttendingPhysician
				.setText("Yes(Notify attending physician.)");
		rbYesnotifyAttendingPhysician.setBounds(60, 710, 202, 18);
		panel.add(rbYesnotifyAttendingPhysician);

		final JxRadioButton noRadioButton_1 = new JxRadioButton();
		noRadioButton_1.setTheme(theme);

		bgYesnotifyAttendingPhysician.add(noRadioButton_1);
		noRadioButton_1.setActionCommand("2");

		noRadioButton_1.setText("No");
		noRadioButton_1.setBounds(275, 710, 54, 18);
		panel.add(noRadioButton_1);
		doUpdate();
	}

	public void doLoad() {

	}

	public int doSave() {

		AssessingResident1 refAssessingResident1 = new AssessingResident1();
		refAssessingResident1.setResidentId(Global.currentResidenceKey);
		refAssessingResident1
				.setFormId(Global.currentMonthlySummaryMainPageKey);
		refAssessingResident1.setSerial(Global.currentAssessingResident1);
		refAssessingResident1.setExplainInShort(txtExplainInShort.getText());
		refAssessingResident1.setTimeOfAssessing(txtTimeOfAssessing.getText());
		refAssessingResident1.setAssistanceSmoking(SwingUtils
				.getSelectedButton(bgAssistanceSmoking));
		refAssessingResident1.setDateOfIndependently(dcDateOfIndependently
				.getDate());
		refAssessingResident1.setBirthDate(dcBirthDate.getDate());
		refAssessingResident1.setSmoke(SwingUtils.getSelectedButton(bgSmoke));
		refAssessingResident1.setNameOfResident(txtNameOfResident.getText());
		refAssessingResident1.setRoom(txtRoom.getText());
		refAssessingResident1.setObservation(cbObservation.isSelected());
		refAssessingResident1.setFamily(cbFamily.isSelected());
		refAssessingResident1.setReview(cbReview.isSelected());
		refAssessingResident1.setDiscussion(cbDiscussion.isSelected());
		refAssessingResident1.setNursing(cbNursing.isSelected());
		refAssessingResident1.setAttendingPhysician(cbAttendingPhysician
				.isSelected());
		refAssessingResident1.setSourceOfInformation(txtSourceOfInformation
				.getText());
		refAssessingResident1.setManyCigarettes(txtManyCigarettes.getText());
		refAssessingResident1.setFirstCigarette(txtFirstCigarette.getText());
		refAssessingResident1.setYesnotifyAttendingPhysician(SwingUtils
				.getSelectedButton(bgYesnotifyAttendingPhysician));

		try {
			Global.currentAssessingResident1 = MedrexClientManager
					.getInstance().insertOrUpdateAssessingResident1(
							refAssessingResident1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Global.currentAssessingResident1;

	}

	public void doUpdate() {
		AssessingResident1 refassessingResident1 = null;

		if (Global.currentAssessingResident1 != 0) {
			try {
				refassessingResident1 = MedrexClientManager
						.getInstance()
						.getAssessingResident1(Global.currentAssessingResident1);
				if (refassessingResident1 != null) {

					txtNameOfResident.setText(refassessingResident1
							.getNameOfResident());
					txtExplainInShort.setText(refassessingResident1
							.getExplainInShort());
					txtTimeOfAssessing.setText(refassessingResident1
							.getTimeOfAssessing());
					SwingUtils.setSelectedButton(bgAssistanceSmoking,
							refassessingResident1.getAssistanceSmoking());
					dcDateOfIndependently.setDate(refassessingResident1
							.getDateOfIndependently());
					dcBirthDate.setDate(refassessingResident1.getBirthDate());
					SwingUtils.setSelectedButton(bgSmoke, refassessingResident1
							.getSmoke());
					txtNameOfResident.setText(refassessingResident1
							.getNameOfResident());
					txtRoom.setText(refassessingResident1.getRoom());
					cbObservation.setSelected(refassessingResident1
							.isObservation());
					cbFamily.setSelected(refassessingResident1.isFamily());
					cbReview.setSelected(refassessingResident1.isReview());
					cbDiscussion.setSelected(refassessingResident1
							.isDiscussion());
					cbNursing.setSelected(refassessingResident1.isNursing());
					cbAttendingPhysician.setSelected(refassessingResident1
							.isAttendingPhysician());
					txtSourceOfInformation.setText(refassessingResident1
							.getSourceOfInformation());
					txtManyCigarettes.setText(refassessingResident1
							.getManyCigarettes());
					txtFirstCigarette.setText(refassessingResident1
							.getFirstCigarette());
					SwingUtils.setSelectedButton(bgYesnotifyAttendingPhysician,
							refassessingResident1
									.getYesnotifyAttendingPhysician());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	public boolean doValidate() {
		// TODO Auto-generated method stub
		return true;
	}

}
