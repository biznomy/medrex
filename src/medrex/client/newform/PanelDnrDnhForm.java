package medrex.client.newform;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;

import com.lowagie.text.Font;
import com.sX.swing.JxCheckBox;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxText;
import com.sX.swing.JxTextA;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelDnrDnhForm extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1873659385809955623L;
	private JxText jxText_5_1_2;
	private JxLabel signatureModuloJxLabel;
	private JxLabel familyMembersSignatureJxLabel;
	private JxLabel jxLabel_11;
	private JxText jxText_5_1_1;
	private JxLabel physicianSignatureJxLabel_1_1;
	private JxText jxText_5_1;
	private JxLabel physicianSignatureJxLabel_1;
	private JxText jxText_6;
	private JxLabel ppJxLabel_1;
	private JxText jxText_5;
	private JxLabel physicianSignatureJxLabel;
	private JxCheckBox doNotHospitaizeJxCheckBox;
	private JxCheckBox doNotResuscitateJxCheckBox;
	private JxTextA textArea_2;
	private JxLabel aJxLabel_3;
	private JxLabel aJxLabel_2;
	private JxLabel aJxLabel_1;
	private JxLabel aJxLabel;
	private JxCheckBox nursingStaffJxCheckBox_3;
	private JxCheckBox nursingStaffJxCheckBox_2;
	private JxCheckBox nursingStaffJxCheckBox_1;
	private JxLabel reasonsForDnrJxLabel_4;
	private JxLabel jxLabel_10;
	private JxLabel reasonsForDnrJxLabel_3;
	private JxLabel jxLabel_9;
	private JxLabel jxLabel_5;
	private JxText jxText_2;
	private JxPanel jxPanel_8;
	private JxTextA textArea_1;
	private JxLabel reasonsForDnrJxLabel_2;
	private JxLabel jxLabel_8;
	private JxCheckBox otherspecifyJxCheckBox;
	private JxCheckBox physicianJxCheckBox;
	private JxCheckBox nursingStaffJxCheckBox;
	private JxCheckBox jxCheckBox_8;
	private JxCheckBox jxCheckBox_7;
	private JxLabel reasonsForDnrJxLabel_1;
	private JxLabel jxLabel_6;
	private JxText jxText_1;
	private JxCheckBox jxCheckBox_5;
	private JxCheckBox jxCheckBox_4;
	private JxCheckBox jxCheckBox_3;
	private JxCheckBox jxCheckBox_2;
	private JxCheckBox jxCheckBox_1;
	private JxCheckBox jxCheckBox;
	private JxLabel reasonsForDnrJxLabel;
	private JxLabel jxLabel_4;
	private JxLabel ppJxLabel;
	private JxText jxText;
	private JxLabel jxLabel_3;
	private JxLabel diagnosisJxLabel;
	private JxLabel residentNameJxLabel;
	private JxTextA textArea;
	private JxLabel jxLabel_2;
	private JxLabel jxLabel_1;
	private JxLabel jxLabel;
	Theme theme = new BlackOverWhiteTheme();

	public PanelDnrDnhForm() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(930, 1200));

		final JxPanel jxPanel = new JxPanel();
		jxPanel.setLayout(null);
		jxPanel.setBackground(Color.WHITE);
		jxPanel.setBounds(0, 0, 930, 1200);
		add(jxPanel);

		final JxPanel jxPanel_1 = new JxPanel();
		jxPanel_1.setTheme(theme);
		jxPanel_1.setLayout(null);
		jxPanel_1.setBackground(Color.WHITE);
		jxPanel_1.setBounds(10, 10, 910, 71);
		jxPanel.add(jxPanel_1);

		jxLabel = new JxLabel();
		jxLabel.setTheme(theme);
		jxLabel.setFontSize(14);
		jxLabel.setFontStyle(Font.BOLD);
		jxLabel.setText("Plaza Healthcare and Rehabilitation Center");
		jxLabel.setBounds(261, 10, 451, 14);
		jxPanel_1.add(jxLabel);

		jxLabel_1 = new JxLabel();
		jxLabel_1.setTheme(theme);
		jxLabel.setFontSize(18);
		jxLabel.setFontStyle(Font.BOLD);
		jxLabel_1.setText("PHYSICIAN PROGRESS NOTES");
		jxLabel_1.setBounds(328, 30, 158, 14);
		jxPanel_1.add(jxLabel_1);

		jxLabel_2 = new JxLabel();
		jxLabel_2.setTheme(theme);
		jxLabel.setFontSize(18);
		jxLabel.setFontStyle(Font.BOLD);
		jxLabel_2.setText("DON NOT RESUSCITATE / DO NOT HOSPITALIZE");
		jxLabel_2.setBounds(284, 50, 243, 14);
		jxPanel_1.add(jxLabel_2);

		final JxPanel jxPanel_2 = new JxPanel();
		jxPanel_2.setTheme(theme);
		jxPanel_2.setLayout(null);
		jxPanel_2.setBackground(Color.WHITE);
		jxPanel_2.setBounds(10, 87, 910, 71);
		jxPanel.add(jxPanel_2);

		residentNameJxLabel = new JxLabel();
		residentNameJxLabel.setTheme(theme);
		residentNameJxLabel.setFontStyle(Font.BOLD);
		residentNameJxLabel.setText("RESIDENT NAME");
		residentNameJxLabel.setBounds(10, 10, 100, 14);
		jxPanel_2.add(residentNameJxLabel);

		jxLabel_3 = new JxLabel();
		jxLabel_3.setTheme(theme);
		jxLabel_3.setText("");
		jxLabel_3.setBounds(130, 10, 100, 14);
		jxPanel_2.add(jxLabel_3);

		diagnosisJxLabel = new JxLabel();
		diagnosisJxLabel.setTheme(theme);
		diagnosisJxLabel.setFontStyle(Font.BOLD);
		diagnosisJxLabel.setText("DIAGNOSIS");
		diagnosisJxLabel.setBounds(10, 30, 100, 14);
		jxPanel_2.add(diagnosisJxLabel);

		jxText = new JxText();
		jxText.setTheme(theme);
		jxText.setBounds(130, 30, 100, 14);
		jxPanel_2.add(jxText);

		ppJxLabel = new JxLabel();
		ppJxLabel.setTheme(theme);
		ppJxLabel.setFontStyle(Font.BOLD);
		ppJxLabel.setText("PP");
		ppJxLabel.setBounds(260, 30, 50, 14);
		jxPanel_2.add(ppJxLabel);

		textArea = new JxTextA();
		textArea.setBounds(330, 28, 570, 35);
		Border lineBdr5 = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
		textArea.setBorder(lineBdr5);
		jxPanel_2.add(textArea);

		final JxPanel jxPanel_3 = new JxPanel();
		jxPanel_3.setTheme(theme);
		jxPanel_3.setLayout(null);
		jxPanel_3.setBackground(Color.WHITE);
		jxPanel_3.setBounds(10, 164, 910, 197);
		jxPanel.add(jxPanel_3);

		final JxPanel jxPanel_4 = new JxPanel();
		jxPanel_4.setTheme(theme);
		jxPanel_4.setLayout(null);
		jxPanel_4.setBackground(Color.WHITE);
		jxPanel_4.setBounds(10, 10, 890, 18);
		jxPanel_3.add(jxPanel_4);

		jxLabel_4 = new JxLabel();
		jxLabel_4.setTheme(theme);
		jxLabel_4.setText("1.");
		jxLabel_4.setBounds(0, 0, 10, 14);
		jxPanel_4.add(jxLabel_4);

		reasonsForDnrJxLabel = new JxLabel();
		reasonsForDnrJxLabel.setTheme(theme);
		reasonsForDnrJxLabel
				.setText("<html> <u> REASON(s)</u> for DNR and/or DNH (CHECK ALL THAT APPLY) </html>");
		reasonsForDnrJxLabel.setBounds(15, 0, 291, 14);
		jxPanel_4.add(reasonsForDnrJxLabel);

		final JxPanel jxPanel_5 = new JxPanel();
		jxPanel_5.setTheme(theme);
		jxPanel_5.setLayout(null);
		jxPanel_5.setBackground(Color.WHITE);
		jxPanel_5.setBounds(10, 34, 890, 156);
		jxPanel_3.add(jxPanel_5);

		jxCheckBox = new JxCheckBox();
		jxCheckBox.setTheme(theme);
		jxCheckBox.setBackground(Color.WHITE);
		jxCheckBox.setText("Requested by Competent resident.");
		jxCheckBox.setBounds(10, 10, 195, 14);
		jxPanel_5.add(jxCheckBox);

		jxCheckBox_1 = new JxCheckBox();
		jxCheckBox_1.setTheme(theme);
		jxCheckBox_1.setBackground(Color.WHITE);
		jxCheckBox_1.setText("Condition irreversible, death imminent.");
		jxCheckBox_1.setBounds(10, 34, 211, 14);
		jxPanel_5.add(jxCheckBox_1);

		jxCheckBox_2 = new JxCheckBox();
		jxCheckBox_2.setTheme(theme);
		jxCheckBox_2.setBackground(Color.WHITE);
		jxCheckBox_2
				.setText("Condition irreversible, limited life expectency (within six months).");
		jxCheckBox_2.setBounds(10, 58, 340, 14);
		jxPanel_5.add(jxCheckBox_2);

		jxCheckBox_3 = new JxCheckBox();
		jxCheckBox_3.setTheme(theme);
		jxCheckBox_3.setBackground(Color.WHITE);
		jxCheckBox_3
				.setText("Chronic debiliting disorder, risks and burdens of medical intervention outweigh likely benifits.");
		jxCheckBox_3.setBounds(10, 82, 472, 14);
		jxPanel_5.add(jxCheckBox_3);

		jxCheckBox_4 = new JxCheckBox();
		jxCheckBox_4.setTheme(theme);
		jxCheckBox_4.setBackground(Color.WHITE);
		jxCheckBox_4
				.setText("Is consistent with the resident's Advance Directive/ Living Will.");
		jxCheckBox_4.setBounds(10, 106, 330, 14);
		jxPanel_5.add(jxCheckBox_4);

		jxCheckBox_5 = new JxCheckBox();
		jxCheckBox_5.setTheme(theme);
		jxCheckBox_5.setBackground(Color.WHITE);
		jxCheckBox_5.setText("Other (specify)");
		jxCheckBox_5.setBounds(10, 130, 109, 14);
		jxPanel_5.add(jxCheckBox_5);

		jxText_1 = new JxText();
		jxText_1.setTheme(theme);
		jxText_1.setBounds(142, 132, 100, 14);
		jxPanel_5.add(jxText_1);

		final JxPanel jxPanel_6 = new JxPanel();
		jxPanel_6.setTheme(theme);
		jxPanel_6.setLayout(null);
		jxPanel_6.setBackground(Color.WHITE);
		jxPanel_6.setBounds(10, 367, 910, 266);
		jxPanel.add(jxPanel_6);

		final JxPanel jxPanel_4_1 = new JxPanel();
		jxPanel_4_1.setTheme(theme);
		jxPanel_4_1.setLayout(null);
		jxPanel_4_1.setBackground(Color.WHITE);
		jxPanel_4_1.setBounds(10, 10, 890, 18);
		jxPanel_6.add(jxPanel_4_1);

		jxLabel_6 = new JxLabel();
		jxLabel_6.setTheme(theme);
		jxLabel_6.setText("2.");
		jxLabel_6.setBounds(0, 0, 10, 14);
		jxPanel_4_1.add(jxLabel_6);

		reasonsForDnrJxLabel_1 = new JxLabel();
		reasonsForDnrJxLabel_1.setTheme(theme);
		reasonsForDnrJxLabel_1
				.setText("<html> <u> DISCUSSION</u> of DNR and/or DNH, status has occured with: (CHECK ALL THAT APPLY) </html>");
		reasonsForDnrJxLabel_1.setBounds(15, 0, 496, 14);
		jxPanel_4_1.add(reasonsForDnrJxLabel_1);

		final JxPanel jxPanel_7 = new JxPanel();
		jxPanel_7.setTheme(theme);
		jxPanel_7.setLayout(null);
		jxPanel_7.setBackground(Color.WHITE);
		jxPanel_7.setBounds(10, 34, 890, 227);
		jxPanel_6.add(jxPanel_7);

		jxCheckBox_7 = new JxCheckBox();
		jxCheckBox_7.setTheme(theme);
		jxCheckBox_7.setBackground(Color.WHITE);
		jxCheckBox_7.setText("Resident");
		jxCheckBox_7.setBounds(10, 10, 195, 14);
		jxPanel_7.add(jxCheckBox_7);

		jxCheckBox_8 = new JxCheckBox();
		jxCheckBox_8.setTheme(theme);
		jxCheckBox_8.setBackground(Color.WHITE);
		jxCheckBox_8.setText("Family, Responsible Party (Specify).");
		jxCheckBox_8.setBounds(10, 30, 195, 14);
		jxPanel_7.add(jxCheckBox_8);

		jxText_2 = new JxText();
		jxText_2.setTheme(theme);
		jxText_2.setBounds(215, 32, 100, 14);
		jxPanel_7.add(jxText_2);

		jxLabel_5 = new JxLabel();
		jxLabel_5.setTheme(theme);
		jxLabel_5
				.setText("Drop down (all contacts should be the choices) just Names");
		jxLabel_5.setBounds(332, 30, 297, 14);
		jxPanel_7.add(jxLabel_5);

		jxPanel_8 = new JxPanel();
		jxPanel_8.setTheme(theme);
		jxPanel_8.setLayout(null);
		jxPanel_8.setBackground(Color.WHITE);
		jxPanel_8.setBounds(10, 50, 870, 100);
		jxPanel_7.add(jxPanel_8);

		final JxPanel jxPanel_14 = new JxPanel();
		jxPanel_14.setTheme(theme);
		jxPanel_14.setLayout(null);
		jxPanel_14.setBackground(Color.WHITE);
		jxPanel_14.setBounds(10, 10, 270, 40);
		Border lineBdr = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
		jxPanel_14.setBorder(lineBdr);
		jxPanel_8.add(jxPanel_14);

		final JxPanel jxPanel_14_1 = new JxPanel();
		jxPanel_14_1.setTheme(theme);
		jxPanel_14_1.setLayout(null);
		jxPanel_14_1.setBackground(Color.WHITE);
		jxPanel_14_1.setBounds(281, 10, 270, 40);
		Border lineBdr1 = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
		jxPanel_14_1.setBorder(lineBdr1);
		jxPanel_8.add(jxPanel_14_1);

		final JxPanel jxPanel_14_2 = new JxPanel();
		jxPanel_14_2.setTheme(theme);
		jxPanel_14_2.setLayout(null);
		jxPanel_14_2.setBackground(Color.WHITE);
		jxPanel_14_2.setBounds(281, 50, 270, 40);
		Border lineBdr4 = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
		jxPanel_14_2.setBorder(lineBdr4);
		jxPanel_8.add(jxPanel_14_2);

		final JxPanel jxPanel_14_3 = new JxPanel();
		jxPanel_14_3.setTheme(theme);
		jxPanel_14_3.setLayout(null);
		jxPanel_14_3.setBackground(Color.WHITE);
		jxPanel_14_3.setBounds(10, 50, 270, 40);
		Border lineBdr3 = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
		jxPanel_14_3.setBorder(lineBdr3);
		jxPanel_8.add(jxPanel_14_3);

		final JxPanel jxPanel_14_4 = new JxPanel();
		jxPanel_14_4.setTheme(theme);
		jxPanel_14_4.setLayout(null);
		jxPanel_14_4.setBackground(Color.WHITE);
		jxPanel_14_4.setBounds(551, 10, 270, 40);
		Border lineBdr2 = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
		jxPanel_14_4.setBorder(lineBdr2);
		jxPanel_8.add(jxPanel_14_4);

		final JxPanel jxPanel_14_5 = new JxPanel();
		jxPanel_14_5.setTheme(theme);
		jxPanel_14_5.setLayout(null);
		jxPanel_14_5.setBackground(Color.WHITE);
		jxPanel_14_5.setBounds(551, 50, 270, 40);
		Border lineBdr6 = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
		jxPanel_14_5.setBorder(lineBdr6);
		jxPanel_8.add(jxPanel_14_5);

		nursingStaffJxCheckBox = new JxCheckBox();
		nursingStaffJxCheckBox.setTheme(theme);
		nursingStaffJxCheckBox.setBackground(Color.WHITE);
		nursingStaffJxCheckBox.setText("Nursing Staff.");
		nursingStaffJxCheckBox.setBounds(10, 161, 100, 14);
		jxPanel_7.add(nursingStaffJxCheckBox);

		physicianJxCheckBox = new JxCheckBox();
		physicianJxCheckBox.setTheme(theme);
		physicianJxCheckBox.setBackground(Color.WHITE);
		physicianJxCheckBox.setText("Physician.");
		physicianJxCheckBox.setBounds(10, 181, 81, 14);
		jxPanel_7.add(physicianJxCheckBox);

		otherspecifyJxCheckBox = new JxCheckBox();
		otherspecifyJxCheckBox.setTheme(theme);
		otherspecifyJxCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
			}
		});
		otherspecifyJxCheckBox.setBackground(Color.WHITE);
		otherspecifyJxCheckBox.setText("Other (Specify).");
		otherspecifyJxCheckBox.setBounds(10, 201, 100, 14);
		jxPanel_7.add(otherspecifyJxCheckBox);

		final JxText jxText_3 = new JxText();
		jxText_3.setTheme(theme);
		jxText_3.setBounds(142, 203, 100, 14);
		jxPanel_7.add(jxText_3);

		final JxPanel jxPanel_9 = new JxPanel();
		jxPanel_9.setTheme(theme);
		jxPanel_9.setLayout(null);
		jxPanel_9.setBackground(Color.WHITE);
		jxPanel_9.setBounds(10, 639, 910, 93);
		jxPanel.add(jxPanel_9);

		final JxPanel jxPanel_4_1_1 = new JxPanel();
		jxPanel_4_1_1.setTheme(theme);
		jxPanel_4_1_1.setLayout(null);
		jxPanel_4_1_1.setBackground(Color.WHITE);
		jxPanel_4_1_1.setBounds(10, 10, 890, 76);
		jxPanel_9.add(jxPanel_4_1_1);

		jxLabel_8 = new JxLabel();
		jxLabel_8.setTheme(theme);
		jxLabel_8.setText("3.");
		jxLabel_8.setBounds(0, 0, 10, 14);
		jxPanel_4_1_1.add(jxLabel_8);

		reasonsForDnrJxLabel_2 = new JxLabel();
		reasonsForDnrJxLabel_2.setTheme(theme);
		reasonsForDnrJxLabel_2
				.setText("<html> <u>Discussion</u> of DNR and/or DNH, order has not taken place with the family because:");
		reasonsForDnrJxLabel_2.setBounds(15, 0, 416, 14);
		jxPanel_4_1_1.add(reasonsForDnrJxLabel_2);

		textArea_1 = new JxTextA();
		textArea_1.setBounds(15, 21, 865, 45);
		Border lineBdr7 = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
		textArea_1.setBorder(lineBdr7);
		jxPanel_4_1_1.add(textArea_1);

		final JxPanel jxPanel_10 = new JxPanel();
		jxPanel_10.setTheme(theme);
		jxPanel_10.setLayout(null);
		jxPanel_10.setBackground(Color.WHITE);
		jxPanel_10.setBounds(10, 738, 910, 452);
		jxPanel.add(jxPanel_10);

		final JxPanel jxPanel_4_2 = new JxPanel();
		jxPanel_4_2.setBounds(454, 5, 1, 1);
		jxPanel_4_2.setLayout(null);
		jxPanel_4_2.setBackground(Color.BLACK);
		jxPanel_10.add(jxPanel_4_2);

		jxLabel_9 = new JxLabel();
		jxLabel_9.setText("New JxLabel");
		jxLabel_9.setBounds(0, 0, 10, 14);
		jxPanel_4_2.add(jxLabel_9);

		reasonsForDnrJxLabel_3 = new JxLabel();
		reasonsForDnrJxLabel_3.setText("New JxLabel");
		reasonsForDnrJxLabel_3.setBounds(15, 0, 291, 14);
		jxPanel_4_2.add(reasonsForDnrJxLabel_3);

		final JxPanel jxPanel_4_3 = new JxPanel();
		jxPanel_4_3.setTheme(theme);
		jxPanel_4_3.setBounds(10, 10, 890, 215);
		jxPanel_10.add(jxPanel_4_3);
		jxPanel_4_3.setLayout(null);
		jxPanel_4_3.setBackground(Color.WHITE);

		jxLabel_10 = new JxLabel();
		jxLabel_10.setTheme(theme);
		jxLabel_10.setText("4.");
		jxLabel_10.setBounds(0, 0, 10, 14);
		jxPanel_4_3.add(jxLabel_10);

		reasonsForDnrJxLabel_4 = new JxLabel();
		reasonsForDnrJxLabel_4.setTheme(theme);
		reasonsForDnrJxLabel_4.setVerticalAlignment(SwingConstants.TOP);
		reasonsForDnrJxLabel_4
				.setText("<html> <p align=\"justify\"> <u>INTERVENTION</u> aimed at curing the resident or restoring the resident to better-than-present state of health is deemed fitile, of no medical benifit, and hence medically inappropriate."
						+ "The dying process is irreversible."
						+ "Resuscitation to prevent or reverse death, when it occurs, would only impose additional burden and discomfort upon the resident without any reasonable hope of benefit."
						+ "Therefore I am ordering: </p> </html>");
		reasonsForDnrJxLabel_4.setBounds(15, 0, 865, 49);
		jxPanel_4_3.add(reasonsForDnrJxLabel_4);

		final JxPanel jxPanel_11 = new JxPanel();
		jxPanel_11.setTheme(theme);
		jxPanel_11.setLayout(null);
		jxPanel_11.setBackground(Color.WHITE);
		jxPanel_11.setBounds(0, 55, 890, 18);
		jxPanel_4_3.add(jxPanel_11);

		aJxLabel = new JxLabel();
		aJxLabel.setTheme(theme);
		aJxLabel.setBounds(10, 0, 17, 14);
		jxPanel_11.add(aJxLabel);
		aJxLabel.setText("A.");

		nursingStaffJxCheckBox_1 = new JxCheckBox();
		nursingStaffJxCheckBox_1.setTheme(theme);
		nursingStaffJxCheckBox_1.setBounds(33, 0, 295, 14);
		jxPanel_11.add(nursingStaffJxCheckBox_1);
		nursingStaffJxCheckBox_1.setBackground(Color.WHITE);
		nursingStaffJxCheckBox_1
				.setText("Emphasis on Comfort, Support and Symptom Control.");

		final JxPanel jxPanel_11_1 = new JxPanel();
		jxPanel_11_1.setTheme(theme);
		jxPanel_11_1.setLayout(null);
		jxPanel_11_1.setBackground(Color.WHITE);
		jxPanel_11_1.setBounds(0, 77, 890, 18);
		jxPanel_4_3.add(jxPanel_11_1);

		aJxLabel_1 = new JxLabel();
		aJxLabel_1.setTheme(theme);
		aJxLabel_1.setText("B.");
		aJxLabel_1.setBounds(10, 0, 17, 14);
		jxPanel_11_1.add(aJxLabel_1);

		nursingStaffJxCheckBox_2 = new JxCheckBox();
		nursingStaffJxCheckBox_2.setTheme(theme);
		nursingStaffJxCheckBox_2.setBounds(33, 0, 270, 14);
		jxPanel_11_1.add(nursingStaffJxCheckBox_2);
		nursingStaffJxCheckBox_2.setBackground(Color.WHITE);
		nursingStaffJxCheckBox_2
				.setText("Don Not Resuscitate and/or Do Not Hospitalize.");

		final JxPanel jxPanel_11_2 = new JxPanel();
		jxPanel_11_2.setTheme(theme);
		jxPanel_11_2.setLayout(null);
		jxPanel_11_2.setBackground(Color.WHITE);
		jxPanel_11_2.setBounds(0, 101, 890, 36);
		jxPanel_4_3.add(jxPanel_11_2);

		aJxLabel_2 = new JxLabel();
		aJxLabel_2.setTheme(theme);
		aJxLabel_2.setText("C.");
		aJxLabel_2.setBounds(10, 0, 17, 14);
		jxPanel_11_2.add(aJxLabel_2);

		nursingStaffJxCheckBox_3 = new JxCheckBox();
		nursingStaffJxCheckBox_3.setTheme(theme);
		nursingStaffJxCheckBox_3.setVerticalAlignment(SwingConstants.TOP);
		nursingStaffJxCheckBox_3.setBounds(33, 0, 847, 31);
		jxPanel_11_2.add(nursingStaffJxCheckBox_3);
		nursingStaffJxCheckBox_3.setBackground(Color.WHITE);
		nursingStaffJxCheckBox_3
				.setText("<html> <p align=\"justify\"> The resident is not to be disturbed with tests, unless the information thereby obtainable is expected to be utilized to increase the resident comfort or otherwise benefit the resident. </p></html>");

		final JxPanel jxPanel_11_3 = new JxPanel();
		jxPanel_11_3.setTheme(theme);
		jxPanel_11_3.setLayout(null);
		jxPanel_11_3.setBackground(Color.WHITE);
		jxPanel_11_3.setBounds(0, 139, 890, 49);
		jxPanel_4_3.add(jxPanel_11_3);

		aJxLabel_3 = new JxLabel();
		aJxLabel_3.setTheme(theme);
		aJxLabel_3.setText("D.");
		aJxLabel_3.setBounds(10, 0, 17, 14);
		jxPanel_11_3.add(aJxLabel_3);

		final JxLabel additionalOrdersJxLabel = new JxLabel();
		additionalOrdersJxLabel.setTheme(theme);
		additionalOrdersJxLabel.setText("Additional Orders:");
		additionalOrdersJxLabel.setBounds(33, 0, 93, 14);
		jxPanel_11_3.add(additionalOrdersJxLabel);

		final JxText jxText_4 = new JxText();
		jxText_4.setTheme(theme);
		jxText_4.setBounds(135, 2, 100, 14);
		jxPanel_11_3.add(jxText_4);

		textArea_2 = new JxTextA();
		textArea_2.setBounds(250, 0, 630, 39);
		Border lineBdr8 = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
		textArea_2.setBorder(lineBdr8);
		jxPanel_11_3.add(textArea_2);

		final JxLabel jxLabel_7 = new JxLabel();
		jxLabel_7.setTheme(theme);
		jxLabel_7
				.setText("These orderes are based upon a sound medical assessment, after consultation with the resident and/or responsible party of the resident's condition.");
		jxLabel_7.setBounds(10, 194, 722, 14);
		jxPanel_4_3.add(jxLabel_7);

		final JxPanel jxPanel_12 = new JxPanel();
		jxPanel_12.setTheme(theme);
		jxPanel_12.setLayout(null);
		jxPanel_12.setBackground(Color.WHITE);
		jxPanel_12.setBounds(10, 231, 890, 194);
		jxPanel_10.add(jxPanel_12);

		final JxPanel jxPanel_13 = new JxPanel();
		jxPanel_13.setTheme(theme);
		jxPanel_13.setLayout(null);
		jxPanel_13.setBackground(Color.WHITE);
		jxPanel_13.setBounds(10, 10, 870, 34);
		jxPanel_12.add(jxPanel_13);

		doNotResuscitateJxCheckBox = new JxCheckBox();
		doNotResuscitateJxCheckBox.setTheme(theme);
		doNotResuscitateJxCheckBox.setFontStyle(Font.BOLD);
		doNotResuscitateJxCheckBox.setBackground(Color.WHITE);
		doNotResuscitateJxCheckBox.setText("DO NOT RESUSCITATE");
		doNotResuscitateJxCheckBox.setBounds(143, 10, 178, 18);
		jxPanel_13.add(doNotResuscitateJxCheckBox);

		doNotHospitaizeJxCheckBox = new JxCheckBox();
		doNotHospitaizeJxCheckBox.setTheme(theme);
		doNotHospitaizeJxCheckBox.setFontStyle(Font.BOLD);
		doNotHospitaizeJxCheckBox.setBackground(Color.WHITE);
		doNotHospitaizeJxCheckBox.setText("DO NOT HOSPITAIZE");
		doNotHospitaizeJxCheckBox.setBounds(460, 10, 200, 18);
		jxPanel_13.add(doNotHospitaizeJxCheckBox);

		final JxPanel jxPanel_13_1 = new JxPanel();
		jxPanel_13_1.setTheme(theme);
		jxPanel_13_1.setLayout(null);
		jxPanel_13_1.setBackground(Color.WHITE);
		jxPanel_13_1.setBounds(10, 50, 870, 34);
		jxPanel_12.add(jxPanel_13_1);

		physicianSignatureJxLabel = new JxLabel();
		physicianSignatureJxLabel.setTheme(theme);
		physicianSignatureJxLabel.setText("Physician Signature:");
		physicianSignatureJxLabel.setBounds(10, 10, 101, 14);
		jxPanel_13_1.add(physicianSignatureJxLabel);

		jxText_5 = new JxText();
		jxText_5.setTheme(theme);
		jxText_5.setBounds(125, 12, 100, 14);
		jxPanel_13_1.add(jxText_5);

		ppJxLabel_1 = new JxLabel();
		ppJxLabel_1.setTheme(theme);
		ppJxLabel_1.setText("PP");
		ppJxLabel_1.setBounds(266, 10, 60, 14);
		jxPanel_13_1.add(ppJxLabel_1);

		jxText_6 = new JxText();
		jxText_6.setTheme(theme);
		jxText_6.setBounds(360, 12, 100, 14);
		jxPanel_13_1.add(jxText_6);

		final JxDateChooser jxDateChooser = new JxDateChooser();
		jxDateChooser.setTheme(theme);
		jxDateChooser.setBounds(760, 8, 100, 20);
		jxPanel_13_1.add(jxDateChooser);

		final JxLabel dateJxLabel = new JxLabel();
		dateJxLabel.setTheme(theme);
		dateJxLabel.setText("Date");
		dateJxLabel.setBounds(710, 10, 34, 14);
		jxPanel_13_1.add(dateJxLabel);

		final JxPanel jxPanel_13_2 = new JxPanel();
		jxPanel_13_2.setTheme(theme);
		jxPanel_13_2.setLayout(null);
		jxPanel_13_2.setBackground(Color.WHITE);
		jxPanel_13_2.setBounds(10, 90, 870, 34);
		jxPanel_12.add(jxPanel_13_2);

		physicianSignatureJxLabel_1 = new JxLabel();
		physicianSignatureJxLabel_1.setTheme(theme);
		physicianSignatureJxLabel_1.setText("Resident's Signature:");
		physicianSignatureJxLabel_1.setBounds(10, 10, 104, 14);
		jxPanel_13_2.add(physicianSignatureJxLabel_1);

		jxText_5_1 = new JxText();
		jxText_5_1.setTheme(theme);
		jxText_5_1.setBounds(125, 12, 100, 14);
		jxPanel_13_2.add(jxText_5_1);

		physicianSignatureJxLabel_1_1 = new JxLabel();
		physicianSignatureJxLabel_1_1.setTheme(theme);
		physicianSignatureJxLabel_1_1.setText("Signature modulo");
		physicianSignatureJxLabel_1_1.setBounds(266, 10, 90, 14);
		jxPanel_13_2.add(physicianSignatureJxLabel_1_1);

		jxText_5_1_1 = new JxText();
		jxText_5_1_1.setTheme(theme);
		jxText_5_1_1.setBounds(360, 12, 100, 14);
		jxPanel_13_2.add(jxText_5_1_1);

		final JxDateChooser jxDateChooser_1 = new JxDateChooser();
		jxDateChooser_1.setTheme(theme);
		jxDateChooser_1.setBounds(760, 8, 100, 20);
		jxPanel_13_2.add(jxDateChooser_1);

		final JxLabel dateJxLabel_1 = new JxLabel();
		dateJxLabel_1.setTheme(theme);
		dateJxLabel_1.setText("Date");
		dateJxLabel_1.setBounds(710, 10, 33, 14);
		jxPanel_13_2.add(dateJxLabel_1);

		final JxPanel jxPanel_13_3 = new JxPanel();
		jxPanel_13_3.setLayout(null);
		jxPanel_13_3.setBackground(Color.WHITE);
		jxPanel_13_3.setBounds(10, 130, 870, 54);
		jxPanel_12.add(jxPanel_13_3);

		jxLabel_11 = new JxLabel();
		jxLabel_11.setTheme(theme);
		jxLabel_11.setText("Surrogate Decision Maker, and/or Responsible");
		jxLabel_11.setBounds(10, 10, 237, 14);
		jxPanel_13_3.add(jxLabel_11);

		familyMembersSignatureJxLabel = new JxLabel();
		familyMembersSignatureJxLabel.setTheme(theme);
		familyMembersSignatureJxLabel.setText("Family Member's Signature:");
		familyMembersSignatureJxLabel.setBounds(10, 30, 138, 14);
		jxPanel_13_3.add(familyMembersSignatureJxLabel);

		signatureModuloJxLabel = new JxLabel();
		signatureModuloJxLabel.setTheme(theme);
		signatureModuloJxLabel.setText("Signature modulo");
		signatureModuloJxLabel.setBounds(154, 30, 92, 14);
		jxPanel_13_3.add(signatureModuloJxLabel);

		jxText_5_1_2 = new JxText();
		jxText_5_1_2.setTheme(theme);
		jxText_5_1_2.setBounds(252, 30, 100, 14);
		jxPanel_13_3.add(jxText_5_1_2);

		final JxDateChooser jxDateChooser_2 = new JxDateChooser();
		jxDateChooser_2.setTheme(theme);
		jxDateChooser_2.setBounds(760, 28, 100, 20);
		jxPanel_13_3.add(jxDateChooser_2);

		final JxLabel dateJxLabel_2 = new JxLabel();
		dateJxLabel_2.setTheme(theme);
		dateJxLabel_2.setText("Date");
		dateJxLabel_2.setBounds(710, 30, 34, 14);
		jxPanel_13_3.add(dateJxLabel_2);
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
		PanelDnrDnhForm panel1 = new PanelDnrDnhForm();
		scroller.setViewportView(panel1);
		JFrame frm = new JFrame("Frame");
		frm.setSize(new Dimension(java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize()));
		frm.add(scroller);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setState(JFrame.MAXIMIZED_BOTH);
		frm.setVisible(true);

		// SwingUtils.openInDialogforJPanel().setVisible(true);

	}

}
