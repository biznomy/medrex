package medrex.client.newform;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

import com.lowagie.text.Font;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxFrame;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxRadioButton;
import com.sX.swing.JxText;
import com.sX.swing.JxTextA;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelAdvanceDirectivesDiscussionNursingHomeName extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -435026464118609400L;
	private JxDateChooser dcDateAtlas;
	private JxRadioButton rbNoguardian;
	private JxRadioButton rbNoPOA;
	private JxRadioButton rbNoLivingWill;
	private JxRadioButton rbNoFullCode;
	private JxRadioButton rbNoOrganDonationCard;
	private JxRadioButton rbYesOrgandonationCard;
	private JxRadioButton rbYesGuardian;
	private JxRadioButton rbYesPOA;
	private JxRadioButton rbYesLivingWill;
	private JxRadioButton rbYesDNR;
	private JxRadioButton rbYesFullCode;
	private JxLabel lblAddmissionDate;
	private JxLabel lblRoomNum;
	private JxLabel lblNurseName;
	private ButtonGroup bgFullCode;
	private ButtonGroup bgDNR;
	private ButtonGroup bgLivingWill;
	private ButtonGroup bgPOA;
	private ButtonGroup bgGuardian;
	private ButtonGroup bgOrganDonationCard;

	Theme theme = new BlackOverWhiteTheme();

	public PanelAdvanceDirectivesDiscussionNursingHomeName() {
		super();
		bgFullCode = new ButtonGroup();
		bgDNR = new ButtonGroup();
		bgLivingWill = new ButtonGroup();
		bgPOA = new ButtonGroup();
		bgGuardian = new ButtonGroup();
		bgOrganDonationCard = new ButtonGroup();

		setBackground(Color.WHITE);
		setLayout(null);

		final JxPanel jxPanel = new JxPanel();
		jxPanel.setBackground(Color.WHITE);
		jxPanel.setLayout(null);

		jxPanel.setBounds(0, 0, 676, 781);
		add(jxPanel);

		final JxLabel nameOfNursingJxLabel = new JxLabel();
		nameOfNursingJxLabel.setTheme(theme);
		nameOfNursingJxLabel.setText("Name of Nursing Home ");
		nameOfNursingJxLabel.setFontSize(18);
		nameOfNursingJxLabel.setFontStyle(Font.BOLD);
		nameOfNursingJxLabel.setBounds(214, 10, 231, 20);
		jxPanel.add(nameOfNursingJxLabel);

		final JxLabel jxLabel = new JxLabel();
		jxLabel.setText("ADVANCE DIRECTIVES DISCUSSINS ");
		jxLabel.setFontStyle(Font.BOLD);
		jxLabel.setFontSize(24);
		jxLabel.setBounds(123, 61, 474, 20);
		jxPanel.add(jxLabel);

		final JxPanel jxPanel_1 = new JxPanel();
		jxPanel_1.setTheme(theme);
		jxPanel_1.setBackground(Color.WHITE);
		jxPanel_1.setLayout(null);
		jxPanel_1.setBounds(10, 105, 656, 28);
		jxPanel.add(jxPanel_1);

		final JxLabel nameJxLabel = new JxLabel();
		nameJxLabel.setTheme(theme);
		nameJxLabel.setText("NAME:");
		nameJxLabel.setBounds(0, 0, 32, 21);
		jxPanel_1.add(nameJxLabel);

		final JxLabel _ppJxLabel = new JxLabel();
		_ppJxLabel.setTheme(theme);
		_ppJxLabel.setText("___(PP)");
		_ppJxLabel.setBounds(32, 0, 38, 14);
		jxPanel_1.add(_ppJxLabel);

		lblNurseName = new JxLabel();
		lblNurseName.setTheme(theme);
		lblNurseName.setFontSize(13);
		lblNurseName.setFontStyle(Font.BOLD);

		lblNurseName.setBounds(80, 0, 124, 21);
		jxPanel_1.add(lblNurseName);

		final JxLabel room_ppJxLabel = new JxLabel();
		room_ppJxLabel.setTheme(theme);
		room_ppJxLabel.setText("ROOM#_(PP)");
		room_ppJxLabel.setBounds(248, 0, 66, 14);
		jxPanel_1.add(room_ppJxLabel);

		lblRoomNum = new JxLabel();
		lblRoomNum.setTheme(theme);
		lblRoomNum.setFontStyle(Font.BOLD);
		lblRoomNum.setFontSize(13);
		lblRoomNum.setBounds(324, 0, 80, 21);
		jxPanel_1.add(lblRoomNum);

		final JxLabel admissionDate_pp_JxLabel = new JxLabel();
		admissionDate_pp_JxLabel.setTheme(theme);
		admissionDate_pp_JxLabel.setText("ADMISSION DATE:__(PP)");
		admissionDate_pp_JxLabel.setBounds(407, 0, 132, 21);
		jxPanel_1.add(admissionDate_pp_JxLabel);

		lblAddmissionDate = new JxLabel();
		lblAddmissionDate.setTheme(theme);
		lblAddmissionDate.setFontStyle(Font.BOLD);
		lblAddmissionDate.setFontSize(13);
		lblAddmissionDate.setBounds(541, 0, 87, 21);
		jxPanel_1.add(lblAddmissionDate);

		final JxPanel jxPanel_2 = new JxPanel();
		jxPanel_2.setBackground(Color.WHITE);
		jxPanel_2.setTheme(theme);

		jxPanel_2.setLayout(null);
		jxPanel_2.setBounds(10, 149, 656, 632);
		jxPanel.add(jxPanel_2);

		final JxLabel jxLabel_1 = new JxLabel();
		jxLabel_1.setTheme(theme);
		jxLabel_1
				.setText("<html><body>Indicate status at time of discussions bychoosing <b>Yes or No</b> after each item that is completed and is available inthe medical record.");
		jxLabel_1.setBounds(0, 0, 646, 23);
		jxPanel_2.add(jxLabel_1);

		final JxPanel jxPanel_3 = new JxPanel();
		jxPanel_3.setTheme(theme);
		jxPanel_3.setLayout(null);
		jxPanel_3.setBounds(0, 35, 534, 154);
		jxPanel_2.add(jxPanel_3);

		final JxPanel jxPanel_4 = new JxPanel();
		jxPanel_4.setTheme(theme);
		jxPanel_4.setLayout(null);
		jxPanel_4.setBounds(0, 0, 351, 19);
		jxPanel_3.add(jxPanel_4);

		final JxLabel fullCodeJxLabel = new JxLabel();
		fullCodeJxLabel.setTheme(theme);
		fullCodeJxLabel.setText("Full code");
		fullCodeJxLabel.setBounds(0, 0, 60, 15);
		jxPanel_4.add(fullCodeJxLabel);

		rbYesFullCode = new JxRadioButton();
		rbYesFullCode.setTheme(theme);
		bgFullCode.add(rbYesFullCode);
		rbYesFullCode.setText("Yes");
		rbYesFullCode.setBounds(120, 0, 50, 18);
		jxPanel_4.add(rbYesFullCode);

		rbNoFullCode = new JxRadioButton();
		rbNoFullCode.setTheme(theme);
		bgFullCode.add(rbNoFullCode);
		rbNoFullCode.setText("No");
		rbNoFullCode.setBounds(200, 0, 50, 18);
		jxPanel_4.add(rbNoFullCode);

		final JxPanel jxPanel_4_1 = new JxPanel();
		jxPanel_4_1.setTheme(theme);
		jxPanel_4_1.setLayout(null);
		jxPanel_4_1.setBounds(0, 19, 351, 19);
		jxPanel_3.add(jxPanel_4_1);

		final JxLabel fullCodeJxLabel_1 = new JxLabel();
		fullCodeJxLabel_1.setTheme(theme);
		fullCodeJxLabel_1.setText("DNR");
		fullCodeJxLabel_1.setBounds(0, 0, 60, 15);
		jxPanel_4_1.add(fullCodeJxLabel_1);

		rbYesDNR = new JxRadioButton();
		rbYesDNR.setTheme(theme);
		bgDNR.add(rbYesDNR);
		rbYesDNR.setText("Yes");
		rbYesDNR.setBounds(120, 0, 50, 18);
		jxPanel_4_1.add(rbYesDNR);

		final JxRadioButton rbNoDNR = new JxRadioButton();
		rbNoDNR.setTheme(theme);
		bgDNR.add(rbNoDNR);
		rbNoDNR.setText("No");
		rbNoDNR.setBounds(200, 0, 50, 18);
		jxPanel_4_1.add(rbNoDNR);

		final JxPanel jxPanel_4_2 = new JxPanel();
		jxPanel_4_2.setTheme(theme);
		jxPanel_4_2.setLayout(null);
		jxPanel_4_2.setBounds(0, 38, 351, 19);
		jxPanel_3.add(jxPanel_4_2);

		final JxLabel fullCodeJxLabel_2 = new JxLabel();
		fullCodeJxLabel_2.setTheme(theme);

		fullCodeJxLabel_2.setText("LIVINNG WILL");
		fullCodeJxLabel_2.setBounds(0, 0, 79, 15);
		jxPanel_4_2.add(fullCodeJxLabel_2);

		rbYesLivingWill = new JxRadioButton();
		rbYesLivingWill.setTheme(theme);
		bgLivingWill.add(rbYesLivingWill);
		rbYesLivingWill.setText("Yes");
		rbYesLivingWill.setBounds(120, 0, 50, 18);
		jxPanel_4_2.add(rbYesLivingWill);

		rbNoLivingWill = new JxRadioButton();
		rbNoLivingWill.setTheme(theme);
		bgLivingWill.add(rbNoLivingWill);
		rbNoLivingWill.setText("No");
		rbNoLivingWill.setBounds(200, 0, 50, 18);
		jxPanel_4_2.add(rbNoLivingWill);

		final JxPanel jxPanel_4_3 = new JxPanel();
		jxPanel_4_3.setTheme(theme);
		jxPanel_4_3.setLayout(null);
		jxPanel_4_3.setBounds(0, 57, 351, 19);
		jxPanel_3.add(jxPanel_4_3);

		final JxLabel fullCodeJxLabel_3 = new JxLabel();
		fullCodeJxLabel_3.setTheme(theme);
		fullCodeJxLabel_3.setText("POA");
		fullCodeJxLabel_3.setBounds(0, 0, 60, 15);
		jxPanel_4_3.add(fullCodeJxLabel_3);

		rbYesPOA = new JxRadioButton();
		rbYesPOA.setTheme(theme);
		bgPOA.add(rbYesPOA);
		rbYesPOA.setText("Yes");
		rbYesPOA.setBounds(120, 0, 50, 18);
		jxPanel_4_3.add(rbYesPOA);

		rbNoPOA = new JxRadioButton();
		rbNoPOA.setTheme(theme);
		bgPOA.add(rbNoPOA);
		rbNoPOA.setText("No");
		rbNoPOA.setBounds(200, 0, 50, 18);
		jxPanel_4_3.add(rbNoPOA);

		final JxPanel jxPanel_4_4 = new JxPanel();
		jxPanel_4_4.setTheme(theme);
		jxPanel_4_4.setLayout(null);
		jxPanel_4_4.setBounds(0, 76, 351, 19);
		jxPanel_3.add(jxPanel_4_4);

		final JxLabel fullCodeJxLabel_4 = new JxLabel();
		fullCodeJxLabel_4.setTheme(theme);
		fullCodeJxLabel_4.setText("Guardian");
		fullCodeJxLabel_4.setBounds(0, 0, 60, 15);
		jxPanel_4_4.add(fullCodeJxLabel_4);

		rbYesGuardian = new JxRadioButton();
		rbYesGuardian.setTheme(theme);
		bgGuardian.add(rbYesGuardian);
		rbYesGuardian.setText("Yes");
		rbYesGuardian.setBounds(120, 0, 50, 18);
		jxPanel_4_4.add(rbYesGuardian);

		rbNoguardian = new JxRadioButton();
		rbNoguardian.setTheme(theme);
		bgGuardian.add(rbNoguardian);
		rbNoguardian.setText("No");
		rbNoguardian.setBounds(200, 0, 50, 18);
		jxPanel_4_4.add(rbNoguardian);

		final JxPanel jxPanel_4_5 = new JxPanel();
		jxPanel_4_5.setTheme(theme);
		jxPanel_4_5.setLayout(null);
		jxPanel_4_5.setBounds(0, 96, 351, 19);
		jxPanel_3.add(jxPanel_4_5);

		final JxLabel fullCodeJxLabel_5 = new JxLabel();
		fullCodeJxLabel_5.setTheme(theme);
		fullCodeJxLabel_5.setText("Organ Donation Card");
		fullCodeJxLabel_5.setBounds(0, 0, 110, 15);
		jxPanel_4_5.add(fullCodeJxLabel_5);

		rbYesOrgandonationCard = new JxRadioButton();
		rbYesOrgandonationCard.setTheme(theme);
		bgOrganDonationCard.add(rbYesOrgandonationCard);
		rbYesOrgandonationCard.setText("Yes");
		rbYesOrgandonationCard.setBounds(120, 0, 50, 18);
		jxPanel_4_5.add(rbYesOrgandonationCard);

		rbNoOrganDonationCard = new JxRadioButton();
		rbNoOrganDonationCard.setTheme(theme);
		bgOrganDonationCard.add(rbNoOrganDonationCard);
		rbNoOrganDonationCard.setText("No");
		rbNoOrganDonationCard.setBounds(200, 0, 50, 18);
		jxPanel_4_5.add(rbNoOrganDonationCard);

		final JxLabel otherJxLabel = new JxLabel();
		otherJxLabel.setTheme(theme);
		otherJxLabel.setText("Other");
		otherJxLabel.setBounds(0, 121, 53, 14);
		jxPanel_3.add(otherJxLabel);

		final JxText jxText = new JxText();
		jxText.setTheme(theme);
		jxText.setTheme(theme);
		jxText.setBounds(59, 118, 292, 34);
		jxPanel_3.add(jxText);

		final JxPanel jxPanel_5 = new JxPanel();
		jxPanel_5.setTheme(theme);
		jxPanel_5.setLayout(null);
		jxPanel_5.setBounds(0, 200, 646, 154);
		jxPanel_2.add(jxPanel_5);

		final JxLabel contactsJxLabel = new JxLabel();
		contactsJxLabel.setTheme(theme);
		contactsJxLabel.setText("Contacts");
		contactsJxLabel.setBounds(0, 0, 60, 14);
		jxPanel_5.add(contactsJxLabel);

		final JxPanel jxPanel_6 = new JxPanel();
		jxPanel_6.setTheme(theme);
		jxPanel_6.setLayout(null);
		jxPanel_6.setBounds(0, 20, 636, 135);
		jxPanel_5.add(jxPanel_6);

		final JxPanel jxPanel_7 = new JxPanel();
		jxPanel_7.setTheme(theme);
		jxPanel_7.setLayout(null);
		jxPanel_7.setBorder(new LineBorder(Color.black, 1, false));
		jxPanel_7.setBounds(0, 0, 237, 65);
		jxPanel_6.add(jxPanel_7);

		final JxLabel fillInAutomaticallyJxLabel = new JxLabel();
		fillInAutomaticallyJxLabel.setTheme(theme);
		fillInAutomaticallyJxLabel.setFontSize(10);
		fillInAutomaticallyJxLabel
				.setText("<html><body>Fill in automatically from contacts with an +  singe<br>To add or change information.The info");
		fillInAutomaticallyJxLabel.setBounds(10, 0, 227, 65);
		jxPanel_7.add(fillInAutomaticallyJxLabel);

		final JxPanel jxPanel_7_1 = new JxPanel();
		jxPanel_7_1.setTheme(theme);
		jxPanel_7_1.setBorder(new LineBorder(Color.black, 1, false));
		jxPanel_7_1.setBounds(211, 0, 213, 65);
		jxPanel_6.add(jxPanel_7_1);

		final JxPanel jxPanel_7_1_1 = new JxPanel();
		jxPanel_7_1_1.setTheme(theme);
		jxPanel_7_1_1.setBorder(new LineBorder(Color.black, 1, false));
		jxPanel_7_1_1.setBounds(423, 0, 211, 65);
		jxPanel_6.add(jxPanel_7_1_1);

		final JxPanel jxPanel_7_2 = new JxPanel();
		jxPanel_7_2.setTheme(theme);
		jxPanel_7_2.setBorder(new LineBorder(Color.black, 1, false));
		jxPanel_7_2.setBounds(0, 64, 237, 65);
		jxPanel_6.add(jxPanel_7_2);

		final JxPanel jxPanel_7_2_1 = new JxPanel();
		jxPanel_7_2_1.setTheme(theme);
		jxPanel_7_2_1.setBorder(new LineBorder(Color.black, 1, false));
		jxPanel_7_2_1.setBounds(211, 64, 213, 65);
		jxPanel_6.add(jxPanel_7_2_1);

		final JxPanel jxPanel_7_2_1_1 = new JxPanel();
		jxPanel_7_2_1_1.setTheme(theme);
		jxPanel_7_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		jxPanel_7_2_1_1.setBounds(423, 64, 211, 65);
		jxPanel_6.add(jxPanel_7_2_1_1);

		final JxPanel jxPanel_8 = new JxPanel();
		jxPanel_8.setTheme(theme);
		jxPanel_8.setLayout(null);
		jxPanel_8.setBounds(0, 360, 656, 169);
		jxPanel_2.add(jxPanel_8);

		final JxLabel jxLabel_2 = new JxLabel();
		jxLabel_2.setTheme(theme);
		jxLabel_2
				.setText("<html><body> Summary of advance directives discussions and decissions at the time of discussins(ex. Is MOLST present,completed properly,does MOLST need revisiion or does new MOLST need to be implemented)");
		jxLabel_2.setBounds(0, 0, 656, 40);
		jxPanel_8.add(jxLabel_2);

		final JxPanel jxPanel_9 = new JxPanel();
		jxPanel_9.setTheme(theme);
		jxPanel_9.setLayout(null);
		jxPanel_9.setBorder(new LineBorder(Color.black, 1, false));
		jxPanel_9.setBounds(0, 46, 636, 109);
		jxPanel_8.add(jxPanel_9);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 636, 109);
		jxPanel_9.add(scrollPane);

		final JxTextA jxTextA = new JxTextA();
		scrollPane.setViewportView(jxTextA);
		JxPanel jxPanel_10 = new JxPanel();
		jxPanel_10.setTheme(theme);
		jxPanel_10.setFontStyle(Font.BOLD);
		jxPanel_10.setLayout(null);
		jxPanel_10.setBounds(0, 535, 585, 30);
		jxPanel_2.add(jxPanel_10);

		dcDateAtlas = new JxDateChooser();
		dcDateAtlas.setTheme(theme);
		dcDateAtlas.setBounds(71, 0, 117, 21);
		jxPanel_10.add(dcDateAtlas);

		final JxLabel dateJxLabel = new JxLabel();
		dateJxLabel.setTheme(theme);
		dateJxLabel.setText("Date:");

		final JxText jxText_1 = new JxText();
		jxText_1.setTheme(theme);
		jxText_1.setBounds(425, 0, 126, 21);
		jxPanel_10.add(jxText_1);

		final JxLabel dateJxLabel_1 = new JxLabel();
		dateJxLabel_1.setText("Date");
		dateJxLabel_1.setTheme(theme);
		dateJxLabel_1.setBounds(0, 0, 60, 21);
		jxPanel_10.add(dateJxLabel_1);

		final JxLabel signatureJxLabel = new JxLabel();
		signatureJxLabel.setText("Signature");
		signatureJxLabel.setTheme(theme);
		signatureJxLabel.setBounds(337, 0, 60, 14);
		jxPanel_10.add(signatureJxLabel);

	}

	public static void main(String args[]) {
		JxFrame frame = new JxFrame();
		JScrollBar scoller = new JScrollBar();
		PanelAdvanceDirectivesDiscussionNursingHomeName panel = new PanelAdvanceDirectivesDiscussionNursingHomeName();
		panel.add(scoller);
		frame.add(panel);
		frame.setVisible(true);
		frame.setBounds(10, 10, 500, 500);

	}

}
