package medrex.client.main.admission;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.PanelImage;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldValidation;
import medrex.client.utils.SwingUtils;
import medrex.client.utils.Utils;
import medrex.commons.intf.Form;
import medrex.commons.vo.admission.ResidentAssessmentFormPage16;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.notes.Notes;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;

import com.jgoodies.validation.ValidationResult;
import com.sX.swing.JxCheckBox;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxRadioButton;
import com.sX.swing.JxText;
import com.sX.swing.notes.JxNotes;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelResidentAssessmentFormPage16 extends JxPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6177398114827854812L;

	Theme theme = new BlackOverWhiteTheme();

	private PanelImage panel_15;
	private JxLabel lblRoomNum;
	private JxLabel lblResidentName;
	private ButtonGroup btnJuice = new ButtonGroup();
	private ButtonGroup btnWater = new ButtonGroup();
	private JxRadioButton rb8OZ2;
	private JxRadioButton rb4OZ2;
	private JxRadioButton rbNo2;
	private JxRadioButton rbYes2;
	private JxRadioButton rb8OZ1;
	private JxRadioButton rb4OZ1;
	private JxRadioButton rbNo1;
	private JxRadioButton rbYes1;
	private JxCheckBox chApplesauce;
	private JxCheckBox chPudding;
	private JxText txtOtherContent;
	private JxCheckBox chOther;
	private JxText txtBlind;
	private JxText txtDeaf;
	private JxText txtHohR;
	private JxText txtHohI;
	private JxText txtEyeGlasses;
	private JxText txtHearingAid;
	private JxCheckBox chNpo;
	private JxCheckBox chNectar;
	private JxCheckBox chpudding;
	private JxCheckBox chHoney;
	private JxCheckBox chGTube;
	private JxCheckBox chCrushMeds;
	private JxText txtUpdated3;
	private JxText txtUpdated2;
	private JxText txtUpdated1;
	private JxDateChooser dcDateFilledOut;
	private JxText txtRoom;
	private JxText txtFirstName;
	private JxText txtLastName;
	private JxNotes txtComment;
	private Notes notestxtComment;
	private JxCheckBox cbFluidRestriction;
	// If true then categories list and label will display otherwise not.
	private boolean isCategories = true;

	public PanelResidentAssessmentFormPage16() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(900, 1000));
		setBackground(Color.WHITE);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);

		panel.setBounds(0, 0, 900, 1000);
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(900, 1000));
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);

		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 900, 95);
		panel.add(panel_1);

		final JxLabel residentIdentificationFormLabel = new JxLabel();

		residentIdentificationFormLabel.setTheme(theme);
		residentIdentificationFormLabel.setFontSize(18);

		residentIdentificationFormLabel
				.setHorizontalTextPosition(SwingConstants.CENTER);
		residentIdentificationFormLabel
				.setHorizontalAlignment(SwingConstants.CENTER);

		residentIdentificationFormLabel.setFontStyle(Font.BOLD);
		residentIdentificationFormLabel.setBounds(0, 56, 900, 39);
		residentIdentificationFormLabel
				.setText("RESIDENT IDENTIFICATION FORM & MEDICATION ADMINISTRATION COMMENTS");
		panel_1.add(residentIdentificationFormLabel);

		final JxLabel residentNameLabel = new JxLabel();
		residentNameLabel.setTheme(theme);

		residentNameLabel.setText("Resident Name :");
		residentNameLabel.setBounds(113, 21, 85, 14);
		panel_1.add(residentNameLabel);

		lblResidentName = new JxLabel();
		lblResidentName.setTheme(theme);
		lblResidentName.setFont(new Font("Arial", Font.BOLD, 11));
		lblResidentName.setBounds(210, 19, 193, 18);

		panel_1.add(lblResidentName);

		final JxLabel roomLabel_1 = new JxLabel();
		roomLabel_1.setTheme(theme);

		roomLabel_1.setText("Room # :");
		roomLabel_1.setBounds(467, 21, 54, 14);
		panel_1.add(roomLabel_1);

		lblRoomNum = new JxLabel();
		lblRoomNum.setTheme(theme);
		lblRoomNum.setFont(new Font("Arial", Font.BOLD, 11));

		lblRoomNum.setBounds(527, 19, 77, 18);

		panel_1.add(lblRoomNum);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);

		panel_2.setLayout(null);
		panel_2.setBounds(0, 101, 900, 800);
		panel.add(panel_2);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);

		panel_3.setFontSize(12);
		panel_3.setFontStyle(Font.BOLD);

		panel_3.setLayout(null);
		panel_3.setBounds(10, 10, 729, 610);
		panel_2.add(panel_3);

		final JxLabel residentLikesToLabel = new JxLabel();
		residentLikesToLabel.setTheme(theme);

		residentLikesToLabel.setFontSize(14);
		residentLikesToLabel.setFontStyle(Font.BOLD);
		residentLikesToLabel.setText("Resident likes to take Meds with:");
		residentLikesToLabel.setBounds(5, 0, 252, 25);
		panel_3.add(residentLikesToLabel);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);
		panel_4.setLayout(null);

		panel_4.setBounds(0, 25, 370, 34);
		panel_3.add(panel_4);

		final JxLabel waterLabel = new JxLabel();
		waterLabel.setTheme(theme);
		waterLabel.setBounds(4, 8, 57, 16);
		panel_4.add(waterLabel);

		waterLabel.setFontSize(14);
		waterLabel.setFontStyle(Font.BOLD);
		waterLabel.setText("WATER:");

		rbYes1 = new JxRadioButton();
		rbYes1.setTheme(theme);
		btnWater.add(rbYes1);
		rbYes1.setActionCommand("1");
		rbYes1.setBounds(66, 5, 47, 23);
		panel_4.add(rbYes1);

		rbYes1.setFontSize(12);
		rbYes1.setFontStyle(Font.BOLD);

		rbYes1.setText("YES");

		rbNo1 = new JxRadioButton();
		rbNo1.setTheme(theme);
		btnWater.add(rbNo1);
		rbNo1.setActionCommand("2");
		rbNo1.setBounds(118, 5, 42, 23);
		panel_4.add(rbNo1);

		rbNo1.setFontSize(12);
		rbNo1.setFontStyle(Font.BOLD);
		rbNo1.setText("NO");

		rb4OZ1 = new JxRadioButton();
		rb4OZ1.setTheme(theme);
		btnWater.add(rb4OZ1);
		rb4OZ1.setActionCommand("3");
		rb4OZ1.setBounds(165, 5, 53, 23);
		panel_4.add(rb4OZ1);

		rb4OZ1.setFontSize(12);
		rb4OZ1.setFontStyle(Font.BOLD);
		rb4OZ1.setText("4OZ.");

		rb8OZ1 = new JxRadioButton();
		rb8OZ1.setTheme(theme);
		btnWater.add(rb8OZ1);
		rb8OZ1.setActionCommand("4");

		rb8OZ1.setFontSize(12);
		rb8OZ1.setFontStyle(Font.BOLD);
		rb8OZ1.setBounds(223, 5, 51, 24);
		panel_4.add(rb8OZ1);

		rb8OZ1.setText("8OZ.");

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setLayout(null);

		panel_5.setBounds(0, 60, 370, 34);
		panel_3.add(panel_5);

		final JxLabel juiceLabel = new JxLabel();
		juiceLabel.setTheme(theme);
		juiceLabel.setBounds(4, 8, 48, 16);

		juiceLabel.setFontSize(14);
		juiceLabel.setFontStyle(Font.BOLD);
		juiceLabel.setText("JUICE:");
		panel_5.add(juiceLabel);

		rbYes2 = new JxRadioButton();
		rbYes2.setTheme(theme);
		rbYes2.setActionCommand("1");
		btnJuice.add(rbYes2);

		rbYes2.setBounds(66, 5, 47, 23);

		rbYes2.setFontSize(12);
		rbYes2.setFontStyle(Font.BOLD);
		rbYes2.setText("YES");
		panel_5.add(rbYes2);

		rbNo2 = new JxRadioButton();
		rbNo2.setTheme(theme);
		btnJuice.add(rbNo2);
		rbNo2.setActionCommand("2");

		rbNo2.setBounds(118, 5, 42, 23);

		rbNo2.setFontSize(12);
		rbNo2.setFontStyle(Font.BOLD);
		rbNo2.setText("NO");
		panel_5.add(rbNo2);

		rb4OZ2 = new JxRadioButton();
		rb4OZ2.setTheme(theme);
		btnJuice.add(rb4OZ2);
		rb4OZ2.setActionCommand("3");

		rb4OZ2.setBounds(165, 5, 53, 23);

		rb4OZ2.setFontSize(12);
		rb4OZ2.setFontStyle(Font.BOLD);
		rb4OZ2.setText("4OZ.");
		panel_5.add(rb4OZ2);

		rb8OZ2 = new JxRadioButton();
		rb8OZ2.setTheme(theme);
		btnJuice.add(rb8OZ2);
		rb8OZ2.setActionCommand("4");

		rb8OZ2.setBounds(223, 5, 53, 23);

		rb8OZ2.setFontSize(12);
		rb8OZ2.setFontStyle(Font.BOLD);
		rb8OZ2.setText("8OZ.");
		panel_5.add(rb8OZ2);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);

		panel_6.setLayout(null);
		panel_6.setBounds(0, 95, 278, 34);
		panel_3.add(panel_6);

		chApplesauce = new JxCheckBox("APPLESAUCE");

		chApplesauce.setFontSize(14);
		chApplesauce.setFontStyle(Font.BOLD);

		chApplesauce.setBounds(4, 8, 127, 16);
		panel_6.add(chApplesauce);

		chPudding = new JxCheckBox();
		chPudding.setTheme(theme);

		chPudding.setFontSize(14);
		chPudding.setFontStyle(Font.BOLD);
		chPudding.setText("PUDDING");
		chPudding.setBounds(170, 8, 94, 16);
		panel_6.add(chPudding);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);

		panel_7.setLayout(null);
		panel_7.setBounds(0, 130, 370, 34);
		panel_3.add(panel_7);

		txtOtherContent = new JxText();
		txtOtherContent.setTheme(theme);
		txtOtherContent.setEditable(true);
		txtOtherContent.setEnabled(false);

		txtOtherContent.setBounds(79, 7, 275, 20);
		panel_7.add(txtOtherContent);

		chOther = new JxCheckBox();
		chOther.setTheme(theme);
		chOther.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				doEnableDisable();

			}
		});
		chOther.setToolTipText("");
		chOther.setName("");

		chOther.setFontSize(14);
		chOther.setFontStyle(Font.BOLD);

		chOther.setText("OTHER");
		chOther.setBounds(5, 8, 68, 16);
		panel_7.add(chOther);

		final JxLabel precautionsLabel = new JxLabel();
		precautionsLabel.setTheme(theme);

		precautionsLabel.setFontSize(14);
		precautionsLabel.setFontStyle(Font.BOLD);

		precautionsLabel.setText("Special Needs:");
		precautionsLabel.setBounds(5, 172, 150, 16);
		panel_3.add(precautionsLabel);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);
		panel_8.setBounds(0, 195, 544, 34);
		panel_3.add(panel_8);
		panel_8.setLayout(null);

		final JxLabel blindLabel = new JxLabel();
		blindLabel.setTheme(theme);

		blindLabel.setFontSize(14);
		blindLabel.setFontStyle(Font.BOLD);
		blindLabel.setText("BLIND:");
		blindLabel.setBounds(4, 8, 55, 16);
		panel_8.add(blindLabel);

		txtBlind = new JxText();
		txtBlind.setTheme(theme);

		txtBlind.setBounds(60, 8, 79, 21);
		panel_8.add(txtBlind);

		final JxLabel deafLabel = new JxLabel();
		deafLabel.setTheme(theme);

		deafLabel.setFontSize(14);
		deafLabel.setFontStyle(Font.BOLD);
		deafLabel.setText("DEAF");
		deafLabel.setBounds(145, 8, 37, 16);
		panel_8.add(deafLabel);

		txtDeaf = new JxText();
		txtDeaf.setTheme(theme);

		txtDeaf.setBounds(193, 8, 79, 21);
		panel_8.add(txtDeaf);

		final JxLabel hohLabel = new JxLabel();
		hohLabel.setTheme(theme);

		hohLabel.setFontSize(14);
		hohLabel.setFontStyle(Font.BOLD);
		hohLabel.setText("HOH:");
		hohLabel.setBounds(278, 8, 46, 16);
		panel_8.add(hohLabel);

		final JxLabel rLabel = new JxLabel();

		rLabel.setFontSize(14);
		rLabel.setFontStyle(Font.BOLD);
		rLabel.setText("(R)");
		rLabel.setBounds(318, 8, 22, 16);
		panel_8.add(rLabel);

		txtHohR = new JxText();
		txtHohR.setTheme(theme);

		txtHohR.setBounds(346, 8, 79, 21);
		panel_8.add(txtHohR);

		final JxLabel iLabel = new JxLabel();
		iLabel.setTheme(theme);

		iLabel.setFontSize(14);
		iLabel.setFontStyle(Font.BOLD);
		iLabel.setText("(I)");
		iLabel.setBounds(431, 10, 22, 16);
		panel_8.add(iLabel);

		txtHohI = new JxText();
		txtHohI.setTheme(theme);

		txtHohI.setBounds(459, 8, 79, 21);
		panel_8.add(txtHohI);

		final JxPanel panel_9 = new JxPanel();
		panel_9.setTheme(theme);

		panel_9.setLayout(null);
		panel_9.setBounds(0, 230, 544, 34);
		panel_3.add(panel_9);

		final JxLabel eyeGlassesLabel = new JxLabel();
		eyeGlassesLabel.setTheme(theme);

		eyeGlassesLabel.setFontSize(14);
		eyeGlassesLabel.setFontStyle(Font.BOLD);

		eyeGlassesLabel.setText("EYE GLASSES");
		eyeGlassesLabel.setBounds(4, 8, 108, 16);
		panel_9.add(eyeGlassesLabel);

		txtEyeGlasses = new JxText();
		txtEyeGlasses.setTheme(theme);

		txtEyeGlasses.setBounds(109, 7, 168, 21);
		panel_9.add(txtEyeGlasses);

		final JxLabel hearingAidLabel = new JxLabel();
		hearingAidLabel.setTheme(theme);

		hearingAidLabel.setFontSize(14);
		hearingAidLabel.setFontStyle(Font.BOLD);
		hearingAidLabel.setText("HEARING AID");
		hearingAidLabel.setBounds(280, 8, 99, 16);
		panel_9.add(hearingAidLabel);

		txtHearingAid = new JxText();
		txtHearingAid.setTheme(theme);

		txtHearingAid.setBounds(385, 7, 152, 21);
		panel_9.add(txtHearingAid);

		final JxLabel swallowingPrecutionsLabel = new JxLabel();
		swallowingPrecutionsLabel.setTheme(theme);

		swallowingPrecutionsLabel.setFontSize(14);
		swallowingPrecutionsLabel.setFontStyle(Font.BOLD);
		swallowingPrecutionsLabel.setText("Swallowing Precutions:");
		swallowingPrecutionsLabel.setBounds(5, 272, 198, 16);
		panel_3.add(swallowingPrecutionsLabel);

		final JxPanel panel_10 = new JxPanel();
		panel_10.setTheme(theme);

		panel_10.setFontSize(12);

		panel_10.setLayout(null);
		panel_10.setBounds(0, 295, 153, 34);
		panel_3.add(panel_10);

		chNpo = new JxCheckBox();
		chNpo.setTheme(theme);

		chNpo.setFontSize(14);
		chNpo.setFontStyle(Font.BOLD);
		chNpo.setText("NPO");
		chNpo.setBounds(4, 8, 111, 16);
		panel_10.add(chNpo);

		final JxPanel panel_11 = new JxPanel();
		panel_11.setTheme(theme);
		panel_11.setLayout(null);

		panel_11.setBounds(0, 329, 544, 64);
		panel_3.add(panel_11);

		final JxLabel thickenedLiquidsLabel = new JxLabel();
		thickenedLiquidsLabel.setTheme(theme);

		thickenedLiquidsLabel.setFontSize(14);
		thickenedLiquidsLabel.setFontStyle(Font.BOLD);
		thickenedLiquidsLabel.setBounds(4, 8, 166, 16);
		thickenedLiquidsLabel.setText("THICKENED LIQUIDS:");
		panel_11.add(thickenedLiquidsLabel);

		cbFluidRestriction = new JxCheckBox();
		cbFluidRestriction.setTheme(theme);

		cbFluidRestriction.setFontSize(14);
		cbFluidRestriction.setFontStyle(Font.BOLD);
		cbFluidRestriction.setText("Fluid Restrictions :");
		cbFluidRestriction.setOpaque(false);
		cbFluidRestriction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doEnableDisable();
			}
		});
		cbFluidRestriction.setBounds(4, 35, 166, 16);
		panel_11.add(cbFluidRestriction);

		chNectar = new JxCheckBox();
		chNectar.setTheme(theme);

		chNectar.setFontSize(14);
		chNectar.setFontStyle(Font.BOLD);
		chNectar.setText("Nectar");
		chNectar.setBounds(176, 8, 70, 16);
		panel_11.add(chNectar);

		chpudding = new JxCheckBox();
		chpudding.setTheme(theme);

		chpudding.setFontSize(14);
		chpudding.setFontStyle(Font.BOLD);
		chpudding.setText("Puddding");
		chpudding.setBounds(262, 8, 100, 20);
		panel_11.add(chpudding);

		chHoney = new JxCheckBox();
		chHoney.setTheme(theme);

		chHoney.setFontSize(14);
		chHoney.setFontStyle(Font.BOLD);

		chHoney.setText("Honey");
		chHoney.setBounds(368, 8, 70, 16);
		panel_11.add(chHoney);

		chGTube = new JxCheckBox();
		chGTube.setTheme(theme);

		chGTube.setFontSize(14);
		chGTube.setFontStyle(Font.BOLD);
		chGTube.setText("G-Tube");
		chGTube.setBounds(176, 35, 80, 16);
		panel_11.add(chGTube);

		chCrushMeds = new JxCheckBox();
		chCrushMeds.setTheme(theme);

		chCrushMeds.setFontSize(14);
		chCrushMeds.setFontStyle(Font.BOLD);
		chCrushMeds.setText("Crush Meds");
		chCrushMeds.setBounds(262, 35, 105, 16);
		panel_11.add(chCrushMeds);

		final JxPanel panel_12 = new JxPanel();
		panel_12.setTheme(theme);
		panel_12.setLayout(null);

		panel_12.setBounds(0, 393, 544, 91);
		panel_3.add(panel_12);

		final JxLabel commentsLabel = new JxLabel();
		commentsLabel.setTheme(theme);

		commentsLabel.setFontSize(14);
		commentsLabel.setFontStyle(Font.BOLD);
		commentsLabel.setText("Comments:");
		commentsLabel.setBounds(4, 8, 89, 16);
		panel_12.add(commentsLabel);

		// final JScrollPane scrollPane = new JScrollPane();
		// scrollPane.setBounds(90, 8, 444, 73);
		// panel_12.add(scrollPane);

		notestxtComment = new Notes();
		notestxtComment.setFormName("Resident Assessment Form");
		notestxtComment.setUserId(Global.currentLoggedInUserKey);

		txtComment = new JxNotes(isCategories);
		txtComment.setFont(new Font("Arial", Font.PLAIN, 12));
		txtComment.setNotes(notestxtComment);
		txtComment.setBounds(90, 8, 444, 73);
		panel_12.add(txtComment);
		// scrollPane.setViewportView(txtComment);

		final JxPanel panel_13 = new JxPanel();
		panel_13.setTheme(theme);
		panel_13.setLayout(null);

		panel_13.setBounds(0, 482, 719, 34);
		panel_3.add(panel_13);

		final JxLabel lastNameLabel = new JxLabel();
		lastNameLabel.setTheme(theme);

		lastNameLabel.setFontSize(14);
		lastNameLabel.setFontStyle(Font.BOLD);
		lastNameLabel.setText("Last Name:");
		lastNameLabel.setBounds(4, 8, 78, 16);
		panel_13.add(lastNameLabel);

		final JxLabel firstNameLabel = new JxLabel();
		firstNameLabel.setTheme(theme);

		firstNameLabel.setFontSize(14);
		firstNameLabel.setFontStyle(Font.BOLD);
		firstNameLabel.setText("First Name:");
		firstNameLabel.setBounds(250, 8, 85, 16);
		panel_13.add(firstNameLabel);

		txtFirstName = new JxText();
		txtFirstName.setTheme(theme);
		txtFirstName.setFontStyle(Font.BOLD);
		txtFirstName.setEditable(false);
		txtFirstName.setBounds(350, 7, 79, 21);
		panel_13.add(txtFirstName);

		txtLastName = new JxText();
		txtLastName.setTheme(theme);
		txtLastName.setFontStyle(Font.BOLD);

		txtLastName.setBounds(125, 8, 79, 21);
		txtLastName.setEditable(false);
		panel_13.add(txtLastName);

		final JxLabel roomLabel = new JxLabel();
		roomLabel.setTheme(theme);

		roomLabel.setFontSize(14);
		roomLabel.setFontStyle(Font.BOLD);
		roomLabel.setText("Room#");
		roomLabel.setBounds(490, 8, 54, 16);
		panel_13.add(roomLabel);

		txtRoom = new JxText();
		txtRoom.setTheme(theme);
		txtRoom.setFontStyle(Font.BOLD);

		txtRoom.setBounds(630, 7, 79, 21);
		panel_13.add(txtRoom);

		final JxPanel panel_14 = new JxPanel();
		panel_14.setTheme(theme);
		panel_14.setLayout(null);

		panel_14.setBounds(0, 512, 719, 34);
		panel_3.add(panel_14);

		final JxLabel dateFilledOutLabel = new JxLabel();
		dateFilledOutLabel.setTheme(theme);

		dateFilledOutLabel.setFontSize(14);
		dateFilledOutLabel.setFontStyle(Font.BOLD);
		dateFilledOutLabel.setText("Date filled Out:");
		dateFilledOutLabel.setBounds(4, 8, 115, 16);
		panel_14.add(dateFilledOutLabel);

		dcDateFilledOut = new JxDateChooser();
		dcDateFilledOut.setTheme(theme);

		dcDateFilledOut.setFontSize(12);
		dcDateFilledOut.setBounds(125, 8, 119, 21);
		panel_14.add(dcDateFilledOut);

		final JxLabel updatedLabel = new JxLabel();
		updatedLabel.setTheme(theme);

		updatedLabel.setFontSize(14);
		updatedLabel.setFontStyle(Font.BOLD);
		updatedLabel.setText("Updated:");
		updatedLabel.setBounds(250, 8, 64, 16);
		panel_14.add(updatedLabel);

		txtUpdated1 = new JxText();
		txtUpdated1.setTheme(theme);

		txtUpdated1.setBounds(320, 8, 79, 21);
		panel_14.add(txtUpdated1);

		final JxLabel updatedLabel_1 = new JxLabel();
		updatedLabel_1.setTheme(theme);

		updatedLabel_1.setFontSize(14);
		updatedLabel_1.setFontStyle(Font.BOLD);
		updatedLabel_1.setText("Updated:");
		updatedLabel_1.setBounds(405, 8, 64, 16);
		panel_14.add(updatedLabel_1);

		txtUpdated2 = new JxText();
		txtUpdated2.setTheme(theme);

		txtUpdated2.setBounds(475, 8, 79, 21);
		panel_14.add(txtUpdated2);

		final JxLabel updatedLabel_2 = new JxLabel();
		updatedLabel_2.setTheme(theme);

		updatedLabel_2.setFontSize(14);
		updatedLabel_2.setFontStyle(Font.BOLD);
		updatedLabel_2.setText("Updated:");
		updatedLabel_2.setBounds(560, 8, 64, 16);
		panel_14.add(updatedLabel_2);

		txtUpdated3 = new JxText();
		txtUpdated3.setTheme(theme);

		txtUpdated3.setBounds(630, 8, 79, 21);
		panel_14.add(txtUpdated3);

		panel_15 = new PanelImage();
		panel_15.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		panel_15.setCurvedView(true);
		panel_15.setArc(0.4f);
		panel_15.setBounds(500, 10, 128, 128);
		panel_3.add(panel_15);

		// Checkbox chk = new Checkbox();
		// chk.setBounds(x, y, width, height)
	}

	public void doLoad() {

	}

	public void doUpdate() {
		int resId = Global.currentResidenceKey;
		ResidentMain rm = null;
		try {
			rm = MedrexClientManager.getInstance().getResident(resId);
			lblResidentName.setText(rm.getUserPass() + " " + rm.getUserName());
			/* TODO: Migrating to room history */
			// lblRoomNum.setText(rm.getRoom());
			txtFirstName.setText(rm.getUserName());
			txtLastName.setText(rm.getUserPass());
			/* TODO: Migrating to room history */
			// txtRoom.setText(rm.getRoom());
		} catch (Exception e) {
		}
		ImageIcon ic = rm.getImg();
		if (ic != null) {
			panel_15.setImage(Utils.getBufferedImageFromImageicon(rm.getImg()));
		} else {
			panel_15.setImage(null);
		}

		CensusStatus refCensusStatus = null;
		try {
			refCensusStatus = MedrexClientManager.getInstance()
					.getCensusLastAdmission(Global.currentResidenceKey);
		} catch (Exception e) {
		}

		if (refCensusStatus != null) {
			dcDateFilledOut.setDate(refCensusStatus.getTimestamp());
		}

		if (Global.currentResidentAssessmentFormKey != 0) {

			ResidentAssessmentFormPage16 rafp16 = null;
			try {
				rafp16 = MedrexClientManager.getInstance()
						.getResidentAssessmentFormPage16(
								Global.currentResidentAssessmentFormKey);
			} catch (Exception e) {

			}
			Global.currentResidentAssessmentFormPage16Key = rafp16.getSerial();
			SwingUtils.setSelectedButton(btnWater, rafp16.getWater());
			SwingUtils.setSelectedButton(btnJuice, rafp16.getJuice());
			// txtUpdated1.setText(rafp16.getUpdated1());
			// txtUpdated2.setText(rafp16.getUpdated2());
			// txtUpdated3.setText(rafp16.getUpdated3());
			// txtDateFilledOut.setText(rafp16.getDateFilledOut());
			txtComment.setNotes(rafp16.getComment());
			if (rafp16.isCrushMeds() == true) {
				chCrushMeds.setSelected(true);
			} else {
				chCrushMeds.setSelected(false);
			}
			if (rafp16.isGTube() == true) {
				chGTube.setSelected(true);
			} else {
				chGTube.setSelected(false);
			}
			if (rafp16.isHoney() == true) {
				chHoney.setSelected(true);
			} else {
				chHoney.setSelected(false);
			}
			if (rafp16.isSyrup() == true) {
				chpudding.setSelected(true);
			} else {
				chpudding.setSelected(false);
			}
			if (rafp16.isNectar() == true) {
				chNectar.setSelected(true);
			} else {
				chNectar.setSelected(false);
			}
			if (rafp16.isNpo() == true) {
				chNpo.setSelected(true);
			} else {
				chNpo.setSelected(false);
			}
			if (rafp16.isFluidRestriction()) {
				cbFluidRestriction.setSelected(true);
			} else {
				cbFluidRestriction.setSelected(false);
			}
			txtHearingAid.setText(rafp16.getHearingAid());
			txtEyeGlasses.setText(rafp16.getEyeGlasses());
			txtHohI.setText(rafp16.getHohI());
			txtHohR.setText(rafp16.getHohR());
			txtDeaf.setText(rafp16.getDeaf());
			txtBlind.setText(rafp16.getBlind());
			txtOtherContent.setText(rafp16.getOtherContent());
			if (rafp16.isOther() == true) {
				chOther.setSelected(true);
			} else {
				chOther.setSelected(false);
			}
			if (rafp16.isPudding() == true) {
				chPudding.setSelected(true);
			} else {
				chPudding.setSelected(false);
			}
			if (rafp16.isApplesauce() == true) {
				chApplesauce.setSelected(true);
			} else {
				chApplesauce.setSelected(false);
			}
			txtFirstName.setText(rafp16.getFirstName());
			txtLastName.setText(rafp16.getLastName());
			lblRoomNum.setText(rafp16.getRoom());
			doEnableDisable();
		} else {
			doEnableDisable();
			TempRoomHistory roomHist = null;
			try {
				roomHist = MedrexClientManager.getInstance()
						.getCurrentRoomForResident(resId);
			} catch (Exception e) {
				e.printStackTrace();
			}
			/* TODO: Migrating to room history ----- Done */
			if (roomHist != null) {
				lblRoomNum.setText(roomHist.getRoom());
			}
		}
	}

	private void doEnableDisable() {
		if (cbFluidRestriction.isSelected()) {
			chGTube.setEnabled(true);
			chCrushMeds.setEnabled(true);
			txtComment.setEditableNotes(true);
		} else {
			chGTube.setEnabled(false);
			chCrushMeds.setEnabled(false);
			txtComment.setEditableNotes(false);
		}

		if (chOther.isSelected()) {
			txtOtherContent.setEnabled(true);
		} else {
			txtOtherContent.setEnabled(false);
		}

	}

	public int doSave() {
		ResidentAssessmentFormPage16 residentAssessmentFormPage16 = new ResidentAssessmentFormPage16();
		residentAssessmentFormPage16
				.setSerial(Global.currentResidentAssessmentFormPage16Key);
		residentAssessmentFormPage16
				.setFormId(Global.currentResidentAssessmentFormKey);
		residentAssessmentFormPage16.setWater(SwingUtils
				.getSelectedButton(btnWater));
		residentAssessmentFormPage16.setJuice(SwingUtils
				.getSelectedButton(btnJuice));
		residentAssessmentFormPage16.setRoom(txtRoom.getText());
		residentAssessmentFormPage16.setFirstName(txtFirstName.getText());
		residentAssessmentFormPage16.setLastName(txtLastName.getText());
		// residentAssessmentFormPage16.setDateFilledOut(txtDateFilledOut.getText());
		// residentAssessmentFormPage16.setUpdated1(txtUpdated1.getText());
		// residentAssessmentFormPage16.setUpdated2(txtUpdated2.getText());
		// residentAssessmentFormPage16.setUpdated3(txtUpdated3.getText());
		residentAssessmentFormPage16.setComment(txtComment.getNotes());

		residentAssessmentFormPage16.setCrushMeds(chCrushMeds.isSelected());
		residentAssessmentFormPage16.setGTube(chGTube.isSelected());
		residentAssessmentFormPage16.setHoney(chHoney.isSelected());
		residentAssessmentFormPage16.setSyrup(chpudding.isSelected());
		residentAssessmentFormPage16.setNectar(chNectar.isSelected());
		residentAssessmentFormPage16.setNpo(chNpo.isSelected());
		residentAssessmentFormPage16.setFluidRestriction(cbFluidRestriction
				.isSelected());

		residentAssessmentFormPage16.setHearingAid(txtHearingAid.getText());
		residentAssessmentFormPage16.setEyeGlasses(txtEyeGlasses.getText());
		residentAssessmentFormPage16.setHohI(txtHohI.getText());
		residentAssessmentFormPage16.setHohR(txtHohR.getText());
		residentAssessmentFormPage16.setDeaf(txtDeaf.getText());
		residentAssessmentFormPage16.setBlind(txtBlind.getText());

		residentAssessmentFormPage16.setOtherContent(txtOtherContent.getText());
		residentAssessmentFormPage16.setOther(chOther.isSelected());
		residentAssessmentFormPage16.setPudding(chPudding.isSelected());
		residentAssessmentFormPage16.setApplesauce(chApplesauce.isSelected());
		residentAssessmentFormPage16.setFirstName(txtFirstName.getText());
		residentAssessmentFormPage16.setLastName(txtLastName.getText());
		residentAssessmentFormPage16.setRoom(txtRoom.getText());
		residentAssessmentFormPage16.setResidentId(Global.currentResidenceKey);

		try {
			Global.currentResidentAssessmentFormPage16Key = MedrexClientManager
					.getInstance().insertOrUpdateResidentAssessmentFormPage16(
							residentAssessmentFormPage16);

			// for sending trigger word message
			String str = txtComment.getTriggerWord();
			if (str != null) {
				txtComment.sendMail(str);
			}

			return (0);
		} catch (Exception e) {
			return (0);
		}
	}

	public boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;

		// if (!FieldValidation.isEmpty(temp =
		// FieldValidation.isNonEmptyAlphaField(
		// lblResidentName, "Resident Name", 0, 25))) {
		// vRes.addAllFrom(temp);
		// }
		if (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(
				btnWater, "Water"))) {
			vRes.addAllFrom(temp);
		}
		if (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(
				btnJuice, "Juice"))) {
			vRes.addAllFrom(temp);
		}

		// System.out.println(FieldValidation.getMessages(vRes.getMessages()));
		if (!FieldValidation.isEmpty(vRes)) {
			FieldValidation.Msgbox(vRes, "Resident Assessment Form: Page 16");
			return false;
		} else {
			return true;
		}
	}

	public static void main(String args[]) {
		SwingUtils.wrapInDialog(new PanelResidentAssessmentFormPage16())
				.setVisible(true);
	}
}
