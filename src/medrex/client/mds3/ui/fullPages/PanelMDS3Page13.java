package medrex.client.mds3.ui.fullPages;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.commons.enums.ColorConstants;
import medrex.commons.intf.Form;

import com.toedter.calendar.JDateChooser;

public class PanelMDS3Page13 extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4358135600417349583L;

	public PanelMDS3Page13() {
		super();
		setPreferredSize(new Dimension(840, 1250));
		final FlowLayout flowLayout_6 = new FlowLayout();
		flowLayout_6.setHgap(0);
		flowLayout_6.setVgap(0);
		setLayout(flowLayout_6);
		setBackground(Color.WHITE);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(840, 40));
		add(panel);

		final JLabel residentLabel = new JLabel();
		residentLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		residentLabel.setText("Resident");
		residentLabel.setBounds(10, 9, 56, 16);
		panel.add(residentLabel);

		final JTextField textField = new JTextField();
		textField.setBounds(84, 8, 248, 20);
		panel.add(textField);

		final JLabel residentLabel_1 = new JLabel();
		residentLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		residentLabel_1.setText("Identifier");
		residentLabel_1.setBounds(354, 10, 56, 16);
		panel.add(residentLabel_1);

		final JTextField textField_1 = new JTextField();
		textField_1.setBounds(429, 8, 213, 20);
		panel.add(textField_1);

		final JLabel residentLabel_1_1 = new JLabel();
		residentLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		residentLabel_1_1.setText("Date");
		residentLabel_1_1.setBounds(668, 10, 56, 16);
		panel.add(residentLabel_1_1);

		final JDateChooser dcDate = new JDateChooser();
		dcDate.setBackground(Color.WHITE);
		dcDate.setBounds(730, 8, 100, 22);
		panel.add(dcDate);

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel_2.setLayout(null);
		panel_2.setPreferredSize(new Dimension(840, 25));
		add(panel_2);

		final JPanel panel_3 = new JPanel();
		panel_3.setBackground(ColorConstants.MDS_FONT_COLOR);
		final FlowLayout flowLayout_1 = new FlowLayout();
		flowLayout_1.setVgap(2);
		flowLayout_1.setHgap(10);
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_3.setLayout(flowLayout_1);
		panel_3.setBounds(3, 3, 231, 18);
		panel_2.add(panel_3);

		final JLabel sectionALabel = new JLabel();
		sectionALabel.setForeground(Color.WHITE);
		sectionALabel.setFont(new Font("Arial", Font.BOLD, 16));
		sectionALabel.setText("Section F");
		panel_3.add(sectionALabel);

		final JPanel panel_4 = new JPanel();
		panel_4.setBackground(ColorConstants.MDS_BACK_COLOR);
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setVgap(2);
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_4.setLayout(flowLayout);
		panel_4.setBounds(246, 2, 592, 22);
		panel_2.add(panel_4);

		final JLabel identificationInformationLabel = new JLabel();
		identificationInformationLabel
				.setForeground(ColorConstants.MDS_FONT_COLOR);
		identificationInformationLabel
				.setFont(new Font("Arial", Font.BOLD, 16));
		identificationInformationLabel
				.setHorizontalAlignment(SwingConstants.LEFT);
		identificationInformationLabel
				.setText("Preferences for Customary Routine and Activities");
		panel_4.add(identificationInformationLabel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setPreferredSize(new Dimension(840, 190));
		add(panel_1);

		final JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setHgap(10);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_5.setLayout(flowLayout_2);
		panel_5.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5.setBounds(0, 0, 840, 25);
		panel_1.add(panel_5);

		final JLabel a0100Label = new JLabel();
		a0100Label.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label.setText("A0100. Facility Provider Numbers");
		panel_5.add(a0100Label);

		final JPanel panel_8 = new JPanel();
		panel_8.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel_8.setLayout(null);
		panel_8.setBounds(0, 31, 840, 160);
		panel_1.add(panel_8);

		final JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBounds(15, 48, 84, 102);
		panel_8.add(panel_6);
		panel_6.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6.setBackground(ColorConstants.MDS_BACK_COLOR);

		final JLabel enterCodeLabel_2 = new JLabel();
		enterCodeLabel_2.setText("Enter Code");
		enterCodeLabel_2.setBounds(10, 10, 54, 14);
		panel_6.add(enterCodeLabel_2);

		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_2.setBounds(10, 30, 54, 21);
		panel_6.add(comboBox_2);

		final JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setBounds(97, 48, 733, 102);
		panel_8.add(panel_7);
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);

		final JLabel label = new JLabel();
		label
				.setText("<html><body> 0. <b> No </b> (because Interview for Daily and Activity PLreferences (D0400 and F0500) was completed by resident or family/significant<br> other)<b>--></b> Skip to and complete G0110, Activities of Daily Living (ADL) Assisstance");
		label.setBounds(10, 10, 679, 38);
		panel_7.add(label);

		final JLabel label_1 = new JLabel();
		label_1
				.setText("<html><body>1. <b> Yes</b>(because 3 or more items in Interview for Daily and Activity Preferences(F0400 and F0500) were not completed by resident <br> or familly/significant other)<b>--></b> Continue to F0800, Staff Assessment of Daily and Activity Preferences");
		label_1.setBounds(10, 50, 679, 29);
		panel_7.add(label_1);

		final JPanel panel_9 = new JPanel();
		panel_9.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_9.setLayout(null);
		panel_9.setBounds(15, 10, 815, 39);
		panel_8.add(panel_9);

		final JLabel f0700ShouldTheLabel = new JLabel();
		f0700ShouldTheLabel
				.setText("F0700. Should the Staff Assessment of Daily and Activity Preferences be Conducted?");
		f0700ShouldTheLabel.setBounds(10, 4, 749, 25);
		panel_9.add(f0700ShouldTheLabel);

		final JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1_1.setLayout(null);
		panel_1_1.setPreferredSize(new Dimension(840, 710));
		add(panel_1_1);

		final JPanel panel_8_1 = new JPanel();
		panel_8_1.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel_8_1.setLayout(null);
		panel_8_1.setBounds(0, 10, 840, 702);
		panel_1_1.add(panel_8_1);

		final JPanel panel_6_1 = new JPanel();
		panel_6_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_1.setLayout(null);
		panel_6_1.setBounds(16, 115, 84, 575);
		panel_8_1.add(panel_6_1);

		final JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_2_1.setBackground(Color.WHITE);
		comboBox_2_1.setBounds(10, 30, 54, 21);
		panel_6_1.add(comboBox_2_1);

		final JPanel panel_7_1 = new JPanel();
		panel_7_1.setBackground(Color.WHITE);
		panel_7_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1.setLayout(null);
		panel_7_1.setBounds(99, 115, 730, 442);
		panel_8_1.add(panel_7_1);

		final JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(-1, 0, 731, 29);
		panel_7_1.add(panel_10);

		final JLabel aChoosingClothesLabel = new JLabel();
		aChoosingClothesLabel.setFont(new Font("Arial", Font.BOLD, 12));
		aChoosingClothesLabel.setText("A. Choosing clothes to wear");
		aChoosingClothesLabel.setBounds(5, 10, 258, 14);
		panel_10.add(aChoosingClothesLabel);

		final JPanel panel_10_1 = new JPanel();
		panel_10_1.setLayout(null);
		panel_10_1.setBackground(Color.WHITE);
		panel_10_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_1.setBounds(-1, 28, 731, 29);
		panel_7_1.add(panel_10_1);

		final JLabel bCaringForLabel = new JLabel();
		bCaringForLabel.setFont(new Font("Arial", Font.BOLD, 12));
		bCaringForLabel.setText("B. Caring for personal belongings");
		bCaringForLabel.setBounds(5, 10, 198, 14);
		panel_10_1.add(bCaringForLabel);

		final JPanel panel_10_2 = new JPanel();
		panel_10_2.setLayout(null);
		panel_10_2.setBackground(Color.WHITE);
		panel_10_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_2.setBounds(-1, 56, 731, 29);
		panel_7_1.add(panel_10_2);

		final JLabel cReceivingTubLabel = new JLabel();
		cReceivingTubLabel.setFont(new Font("Arial", Font.BOLD, 12));
		cReceivingTubLabel.setText("C. Receiving tub bath");
		cReceivingTubLabel.setBounds(5, 10, 213, 14);
		panel_10_2.add(cReceivingTubLabel);

		final JPanel panel_10_3 = new JPanel();
		panel_10_3.setLayout(null);
		panel_10_3.setBackground(Color.WHITE);
		panel_10_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3.setBounds(-1, 84, 731, 29);
		panel_7_1.add(panel_10_3);

		final JLabel receivingShowerLabel = new JLabel();
		receivingShowerLabel.setFont(new Font("Arial", Font.BOLD, 12));
		receivingShowerLabel.setText("D.Receiving shower");
		receivingShowerLabel.setBounds(5, 10, 198, 14);
		panel_10_3.add(receivingShowerLabel);

		final JPanel panel_10_4 = new JPanel();
		panel_10_4.setLayout(null);
		panel_10_4.setBackground(Color.WHITE);
		panel_10_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_4.setBounds(-1, 112, 731, 29);
		panel_7_1.add(panel_10_4);

		final JLabel eReceivingBedLabel = new JLabel();
		eReceivingBedLabel.setFont(new Font("Arial", Font.BOLD, 12));
		eReceivingBedLabel.setText("E. Receiving bed bath");
		eReceivingBedLabel.setBounds(5, 10, 268, 14);
		panel_10_4.add(eReceivingBedLabel);

		final JPanel panel_10_5 = new JPanel();
		panel_10_5.setLayout(null);
		panel_10_5.setBackground(Color.WHITE);
		panel_10_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_5.setBounds(-1, 140, 731, 29);
		panel_7_1.add(panel_10_5);

		final JLabel fReceivingSpongeLabel = new JLabel();
		fReceivingSpongeLabel.setFont(new Font("Arial", Font.BOLD, 12));
		fReceivingSpongeLabel.setText("F. Receiving sponge bath");
		fReceivingSpongeLabel.setBounds(5, 10, 227, 14);
		panel_10_5.add(fReceivingSpongeLabel);

		final JPanel panel_10_6 = new JPanel();
		panel_10_6.setLayout(null);
		panel_10_6.setBackground(Color.WHITE);
		panel_10_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_6.setBounds(-1, 168, 731, 29);
		panel_7_1.add(panel_10_6);

		final JLabel fSnacksBetweenLabel = new JLabel();
		fSnacksBetweenLabel.setFont(new Font("Arial", Font.BOLD, 12));
		fSnacksBetweenLabel.setText("G. Snacks between meals");
		fSnacksBetweenLabel.setBounds(5, 10, 237, 14);
		panel_10_6.add(fSnacksBetweenLabel);

		final JPanel panel_10_7 = new JPanel();
		panel_10_7.setLayout(null);
		panel_10_7.setBackground(Color.WHITE);
		panel_10_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_7.setBounds(-1, 196, 731, 29);
		panel_7_1.add(panel_10_7);

		final JLabel hStayingUpLabel = new JLabel();
		hStayingUpLabel.setFont(new Font("Arial", Font.BOLD, 12));
		hStayingUpLabel.setText("H. Staying up past 8:00 pm");
		hStayingUpLabel.setBounds(5, 10, 226, 14);
		panel_10_7.add(hStayingUpLabel);

		final JPanel panel_10_8 = new JPanel();
		panel_10_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_8.setBounds(-1, 724, 725, 29);
		panel_7_1.add(panel_10_8);

		final JPanel panel_10_9 = new JPanel();
		panel_10_9.setLayout(null);
		panel_10_9.setBackground(Color.WHITE);
		panel_10_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_9.setBounds(0, 250, 730, 29);
		panel_7_1.add(panel_10_9);

		final JLabel jUseOfLabel = new JLabel();
		jUseOfLabel.setFont(new Font("Arial", Font.BOLD, 12));
		jUseOfLabel.setText("J. Use of phone in private ");
		jUseOfLabel.setBounds(5, 0, 273, 14);
		panel_10_9.add(jUseOfLabel);

		final JPanel panel_10_10 = new JPanel();
		panel_10_10.setLayout(null);
		panel_10_10.setBackground(Color.WHITE);
		panel_10_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_10.setBounds(0, 278, 730, 29);
		panel_7_1.add(panel_10_10);

		final JLabel kPlaceToLabel = new JLabel();
		kPlaceToLabel.setFont(new Font("Arial", Font.BOLD, 12));
		kPlaceToLabel.setText("k. Place to lock personal belongings");
		kPlaceToLabel.setBounds(5, 10, 340, 14);
		panel_10_10.add(kPlaceToLabel);

		final JPanel panel_10_11 = new JPanel();
		panel_10_11.setLayout(null);
		panel_10_11.setBackground(Color.WHITE);
		panel_10_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_11.setBounds(0, 306, 730, 29);
		panel_7_1.add(panel_10_11);

		final JLabel lReadingBooksLabel = new JLabel();
		lReadingBooksLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lReadingBooksLabel
				.setText("L. Reading books, newspapers, or magazines");
		lReadingBooksLabel.setBounds(5, 10, 358, 14);
		panel_10_11.add(lReadingBooksLabel);

		final JPanel panel_10_12 = new JPanel();
		panel_10_12.setLayout(null);
		panel_10_12.setBackground(Color.WHITE);
		panel_10_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_12.setBounds(0, 333, 730, 29);
		panel_7_1.add(panel_10_12);

		final JLabel mListeningToLabel = new JLabel();
		mListeningToLabel.setFont(new Font("Arial", Font.BOLD, 12));
		mListeningToLabel.setText("M. Listening to music");
		mListeningToLabel.setBounds(5, 10, 321, 14);
		panel_10_12.add(mListeningToLabel);

		final JPanel panel_10_13 = new JPanel();
		panel_10_13.setLayout(null);
		panel_10_13.setBackground(Color.WHITE);
		panel_10_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_13.setBounds(0, 360, 730, 29);
		panel_7_1.add(panel_10_13);

		final JLabel nBeingAroundLabel = new JLabel();
		nBeingAroundLabel.setFont(new Font("Arial", Font.BOLD, 12));
		nBeingAroundLabel.setText("N. Being around animals such as pets");
		nBeingAroundLabel.setBounds(5, 10, 339, 14);
		panel_10_13.add(nBeingAroundLabel);

		final JPanel panel_10_14 = new JPanel();
		panel_10_14.setLayout(null);
		panel_10_14.setBackground(Color.WHITE);
		panel_10_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_14.setBounds(0, 388, 730, 29);
		panel_7_1.add(panel_10_14);

		final JLabel oKeepingUpLabel = new JLabel();
		oKeepingUpLabel.setFont(new Font("Arial", Font.BOLD, 12));
		oKeepingUpLabel.setText("o. Keeping up with the news");
		oKeepingUpLabel.setBounds(5, 0, 317, 14);
		panel_10_14.add(oKeepingUpLabel);

		final JLabel iFamilyOrLabel = new JLabel();
		iFamilyOrLabel.setFont(new Font("Arial", Font.BOLD, 12));
		iFamilyOrLabel
				.setText("I. Family or significant other involvement in care discussions");
		iFamilyOrLabel.setBounds(5, 231, 377, 14);
		panel_7_1.add(iFamilyOrLabel);

		final JLabel pDoingThingsLabel = new JLabel();
		pDoingThingsLabel.setFont(new Font("Arial", Font.BOLD, 12));
		pDoingThingsLabel.setText("P. Doing things with group of people");
		pDoingThingsLabel.setBounds(5, 423, 321, 14);
		panel_7_1.add(pDoingThingsLabel);

		final JPanel panel_9_1 = new JPanel();
		panel_9_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_9_1.setLayout(null);
		panel_9_1.setBounds(16, 10, 814, 39);
		panel_8_1.add(panel_9_1);

		final JLabel f0700ShouldTheLabel_1 = new JLabel();
		f0700ShouldTheLabel_1
				.setText("F0800. Staff Assessment of Daily and Activity Preferences");
		f0700ShouldTheLabel_1.setBounds(10, 4, 749, 25);
		panel_9_1.add(f0700ShouldTheLabel_1);

		final JPanel panel_9_1_1 = new JPanel();
		panel_9_1_1.setBackground(Color.WHITE);
		panel_9_1_1.setLayout(null);
		panel_9_1_1.setBounds(16, 50, 814, 22);
		panel_8_1.add(panel_9_1_1);

		final JLabel f0700ShouldTheLabel_1_1 = new JLabel();
		f0700ShouldTheLabel_1_1
				.setText("Do not conduct if Interview for Daily and Activity Preferences (F0400- F0500) was completed");
		f0700ShouldTheLabel_1_1.setBounds(10, 4, 749, 16);
		panel_9_1_1.add(f0700ShouldTheLabel_1_1);

		final JPanel panel_9_1_1_1 = new JPanel();
		panel_9_1_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_9_1_1_1.setLayout(null);
		panel_9_1_1_1.setBounds(16, 72, 813, 22);
		panel_8_1.add(panel_9_1_1_1);

		final JLabel f0700ShouldTheLabel_1_1_1 = new JLabel();
		f0700ShouldTheLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		f0700ShouldTheLabel_1_1_1.setText("Resident Prefers:");
		f0700ShouldTheLabel_1_1_1.setBounds(10, 4, 749, 16);
		panel_9_1_1_1.add(f0700ShouldTheLabel_1_1_1);

		final JPanel panel_9_1_1_1_1 = new JPanel();
		panel_9_1_1_1_1.setBackground(Color.WHITE);
		panel_9_1_1_1_1.setLayout(null);
		panel_9_1_1_1_1.setBounds(16, 94, 813, 22);
		panel_8_1.add(panel_9_1_1_1_1);

		final JLabel f0700ShouldTheLabel_1_1_1_1 = new JLabel();
		f0700ShouldTheLabel_1_1_1_1.setText("Check all that apply ");
		f0700ShouldTheLabel_1_1_1_1.setBounds(10, 4, 749, 16);
		panel_9_1_1_1_1.add(f0700ShouldTheLabel_1_1_1_1);

		final JPanel panel_10_15 = new JPanel();
		panel_10_15.setLayout(null);
		panel_10_15.setBackground(Color.WHITE);
		panel_10_15.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_15.setBounds(99, 555, 731, 29);
		panel_8_1.add(panel_10_15);

		final JLabel qParticipatingInLabel = new JLabel();
		qParticipatingInLabel.setFont(new Font("Arial", Font.BOLD, 12));
		qParticipatingInLabel
				.setText("Q. Participating in favorite activities");
		qParticipatingInLabel.setBounds(5, 10, 293, 14);
		panel_10_15.add(qParticipatingInLabel);

		final JPanel panel_10_16 = new JPanel();
		panel_10_16.setLayout(null);
		panel_10_16.setBackground(Color.WHITE);
		panel_10_16.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_16.setBounds(99, 583, 731, 29);
		panel_8_1.add(panel_10_16);

		final JLabel rSpendingTimeLabel = new JLabel();
		rSpendingTimeLabel.setFont(new Font("Arial", Font.BOLD, 12));
		rSpendingTimeLabel
				.setText("R. Spending time away from the nursing home");
		rSpendingTimeLabel.setBounds(5, 10, 348, 14);
		panel_10_16.add(rSpendingTimeLabel);

		final JPanel panel_10_17 = new JPanel();
		panel_10_17.setLayout(null);
		panel_10_17.setBackground(Color.WHITE);
		panel_10_17.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_17.setBounds(99, 610, 731, 29);
		panel_8_1.add(panel_10_17);

		final JLabel sSpendingTimeLabel = new JLabel();
		sSpendingTimeLabel.setFont(new Font("Arial", Font.BOLD, 12));
		sSpendingTimeLabel.setText("s. Spending time outdoors");
		sSpendingTimeLabel.setBounds(5, 10, 406, 14);
		panel_10_17.add(sSpendingTimeLabel);

		final JPanel panel_10_18 = new JPanel();
		panel_10_18.setLayout(null);
		panel_10_18.setBackground(Color.WHITE);
		panel_10_18.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_18.setBounds(99, 637, 731, 29);
		panel_8_1.add(panel_10_18);

		final JLabel tParticipatingInLabel = new JLabel();
		tParticipatingInLabel.setFont(new Font("Arial", Font.BOLD, 12));
		tParticipatingInLabel
				.setText("T. Participating in religious activities or practices");
		tParticipatingInLabel.setBounds(5, 10, 612, 14);
		panel_10_18.add(tParticipatingInLabel);

		final JPanel panel_10_19 = new JPanel();
		panel_10_19.setLayout(null);
		panel_10_19.setBackground(Color.WHITE);
		panel_10_19.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_19.setBounds(99, 665, 731, 25);
		panel_8_1.add(panel_10_19);

		final JLabel zNoneOfLabel = new JLabel();
		zNoneOfLabel.setFont(new Font("Arial", Font.BOLD, 12));
		zNoneOfLabel.setText("z. None of the above");
		zNoneOfLabel.setBounds(5, 0, 383, 14);
		panel_10_19.add(zNoneOfLabel);
	}

	public static void main(String ar[]) {
		try {
			UIManager
					.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JScrollPane scroller = new JScrollPane();
		PanelMDS3Page13 panel = new PanelMDS3Page13();
		scroller.setViewportView(panel);
		JFrame frm = new JFrame("Frame");
		frm.setSize(new Dimension(java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize()));
		frm.add(scroller);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setState(JFrame.MAXIMIZED_BOTH);
		frm.setVisible(true);

		// SwingUtils.openInDialogforJPanel().setVisible(true);
	}

	public void doLoad() {
		// TODO Auto-generated method stub

	}

	public int doSave() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void doUpdate() {
		// TODO Auto-generated method stub

	}

	public boolean doValidate() {
		// TODO Auto-generated method stub
		return false;
	}
}
