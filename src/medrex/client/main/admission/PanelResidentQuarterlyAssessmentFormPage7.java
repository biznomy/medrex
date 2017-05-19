package medrex.client.main.admission;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ButtonGroup;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.intf.Form;
import medrex.commons.vo.admission.ResidentQuarterlyAssessmentFormPage7;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxRadioButton;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelResidentQuarterlyAssessmentFormPage7 extends JxPanel
		implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5691779260526796167L;
	private JxRadioButton rb10b;
	private JxRadioButton rb10a;
	private JxRadioButton rb9b;
	private JxRadioButton rb9a;
	private JxRadioButton rb8b;
	private JxRadioButton rb8a;
	private JxRadioButton rb7b;
	private JxRadioButton rb7a;
	private JxRadioButton rb6b;
	private JxRadioButton rb6a;
	private JxRadioButton rb5b;
	private JxRadioButton rb5a;
	private JxRadioButton rb4b;
	private JxRadioButton rb4a;
	private JxRadioButton rb3b;
	private JxRadioButton rb3a;
	private JxRadioButton rb2b;
	private JxRadioButton rb2a;
	private JxRadioButton rb1b;
	private JxRadioButton rb1a;
	private JxText txtRoom;
	private JxText txtResidentName;
	private ButtonGroup buttonGroup1;
	private ButtonGroup buttonGroup2;
	private ButtonGroup buttonGroup3;
	private ButtonGroup buttonGroup4;
	private ButtonGroup buttonGroup5;
	private ButtonGroup buttonGroup6;
	private ButtonGroup buttonGroup7;
	private ButtonGroup buttonGroup8;
	private ButtonGroup buttonGroup9;
	private ButtonGroup buttonGroup10;

	Theme theme = new BlackOverWhiteTheme();

	public PanelResidentQuarterlyAssessmentFormPage7() {
		super();
		setPreferredSize(new Dimension(940, 700));
		setBackground(Color.WHITE);
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);

		panel.setBounds(10, 10, 930, 657);
		add(panel);

		final JxLabel plazaRehabiliationLabel = new JxLabel();
		plazaRehabiliationLabel.setTheme(theme);

		plazaRehabiliationLabel.setText("PLAZA REHABILIATION & NURSING CENTER");
		plazaRehabiliationLabel.setBounds(255, 23, 408, 29);
		panel.add(plazaRehabiliationLabel);

		final JxLabel assessmentForSideLabel = new JxLabel();
		assessmentForSideLabel.setTheme(theme);

		assessmentForSideLabel.setText("ASSESSMENT FOR SIDE RAILS");
		assessmentForSideLabel.setBounds(309, 58, 291, 20);
		panel.add(assessmentForSideLabel);

		final JxLabel residentLabel = new JxLabel();
		residentLabel.setTheme(theme);
		residentLabel.setText("Resident :");
		residentLabel.setBounds(23, 107, 54, 14);
		panel.add(residentLabel);

		txtResidentName = new JxText();
		txtResidentName.setTheme(theme);
		txtResidentName.setBounds(98, 105, 366, 18);
		panel.add(txtResidentName);

		final JxLabel roomLabel = new JxLabel();
		roomLabel.setTheme(theme);
		roomLabel.setText("Room #");
		roomLabel.setBounds(556, 107, 54, 14);
		panel.add(roomLabel);

		txtRoom = new JxText();
		txtRoom.setTheme(theme);
		txtRoom.setBounds(616, 105, 77, 18);
		panel.add(txtRoom);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);

		panel_1.setLayout(null);
		panel_1.setBounds(23, 127, 905, 521);
		panel.add(panel_1);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);

		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 900, 34);
		panel_1.add(panel_2);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);
		label.setText("1. Is the resident non-ambulatory ?");
		label.setBounds(10, 10, 206, 14);
		panel_2.add(label);

		buttonGroup1 = new ButtonGroup();
		rb1a = new JxRadioButton();
		rb1a.setTheme(theme);
		buttonGroup1.add(rb1a);
		rb1a.setActionCommand("1");

		rb1a.setText("Yes");
		rb1a.setBounds(708, 6, 113, 22);
		panel_2.add(rb1a);

		rb1b = new JxRadioButton();
		rb1b.setTheme(theme);
		buttonGroup1.add(rb1b);
		rb1b.setActionCommand("2");

		rb1b.setText("No");
		rb1b.setBounds(827, 6, 113, 22);
		panel_2.add(rb1b);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);

		panel_3.setLayout(null);
		panel_3.setBounds(0, 35, 900, 34);
		panel_1.add(panel_3);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);
		label_1
				.setText("2. Is the resident comatose, semi - comatose, obtund, or has fluctuations in level of consciousness ?");
		label_1.setBounds(10, 10, 501, 14);
		panel_3.add(label_1);

		buttonGroup2 = new ButtonGroup();
		rb2a = new JxRadioButton();
		rb2a.setTheme(theme);
		buttonGroup2.add(rb2a);
		rb2a.setActionCommand("1");

		rb2a.setText("Yes");
		rb2a.setBounds(709, 6, 113, 22);
		panel_3.add(rb2a);

		rb2b = new JxRadioButton();
		rb2b.setTheme(theme);
		buttonGroup2.add(rb2b);
		rb2b.setActionCommand("2");

		rb2b.setText("No");
		rb2b.setBounds(828, 6, 113, 22);
		panel_3.add(rb2b);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);

		panel_4.setLayout(null);
		panel_4.setBounds(0, 73, 900, 34);
		panel_1.add(panel_4);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);
		label_2
				.setText("3. Does the resident have alteration in safety awareness due to cognitive decline ?");
		label_2.setBounds(10, 10, 457, 14);
		panel_4.add(label_2);

		buttonGroup3 = new ButtonGroup();
		rb3a = new JxRadioButton();
		rb3a.setTheme(theme);
		buttonGroup3.add(rb3a);
		rb3a.setActionCommand("1");

		rb3a.setText("Yes");
		rb3a.setBounds(710, 6, 113, 22);
		panel_4.add(rb3a);

		rb3b = new JxRadioButton();
		rb3b.setTheme(theme);
		buttonGroup3.add(rb3b);
		rb3b.setActionCommand("2");

		rb3b.setText("No");
		rb3b.setBounds(829, 6, 113, 22);
		panel_4.add(rb3b);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);

		panel_5.setLayout(null);
		panel_5.setBounds(0, 113, 900, 34);
		panel_1.add(panel_5);

		final JxLabel label_3 = new JxLabel();
		label_3.setTheme(theme);
		label_3.setText("4. Does the resident hace a history of falls ?");
		label_3.setBounds(10, 10, 421, 14);
		panel_5.add(label_3);

		buttonGroup4 = new ButtonGroup();
		rb4b = new JxRadioButton();
		rb4b.setTheme(theme);
		buttonGroup4.add(rb4b);
		rb4b.setActionCommand("2");

		rb4b.setText("No");
		rb4b.setBounds(827, 6, 113, 22);
		panel_5.add(rb4b);

		rb4a = new JxRadioButton();
		rb4a.setTheme(theme);
		buttonGroup4.add(rb4a);
		rb4a.setActionCommand("1");

		rb4a.setText("Yes");
		rb4a.setBounds(708, 6, 113, 22);
		panel_5.add(rb4a);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);

		panel_6.setLayout(null);
		panel_6.setBounds(0, 153, 900, 34);
		panel_1.add(panel_6);

		final JxLabel label_4 = new JxLabel();
		label_4.setTheme(theme);
		label_4
				.setText("5. Has the resident demonstrated poor bed mobility or difficulty moving to a sitting position on the side of the bed ?");
		label_4.setBounds(10, 10, 563, 14);
		panel_6.add(label_4);

		buttonGroup5 = new ButtonGroup();
		rb5b = new JxRadioButton();
		rb5b.setTheme(theme);
		buttonGroup5.add(rb5b);
		rb5b.setActionCommand("2");

		rb5b.setText("No");
		rb5b.setBounds(827, 6, 113, 22);
		panel_6.add(rb5b);

		rb5a = new JxRadioButton();
		rb5a.setTheme(theme);
		buttonGroup5.add(rb5a);
		rb5a.setActionCommand("1");

		rb5a.setText("Yes");
		rb5a.setBounds(708, 6, 113, 22);
		panel_6.add(rb5a);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);

		panel_7.setLayout(null);
		panel_7.setBounds(0, 193, 900, 34);
		panel_1.add(panel_7);

		final JxLabel label_5 = new JxLabel();
		label_5.setTheme(theme);
		label_5
				.setText("6. Does the resident have difficulty wth balance ot poor trunk control ?");
		label_5.setBounds(10, 10, 484, 14);
		panel_7.add(label_5);

		buttonGroup6 = new ButtonGroup();
		rb6b = new JxRadioButton();
		rb6b.setTheme(theme);
		buttonGroup6.add(rb6b);
		rb6b.setActionCommand("2");

		rb6b.setText("No");
		rb6b.setBounds(827, 6, 113, 22);
		panel_7.add(rb6b);

		rb6a = new JxRadioButton();
		rb6a.setTheme(theme);
		buttonGroup6.add(rb6a);
		rb6a.setActionCommand("1");

		rb6a.setText("Yes");
		rb6a.setBounds(708, 6, 113, 22);
		panel_7.add(rb6a);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);

		panel_8.setLayout(null);
		panel_8.setBounds(0, 233, 900, 34);
		panel_1.add(panel_8);

		final JxLabel label_6 = new JxLabel();
		label_6.setTheme(theme);
		label_6
				.setText("7. Does the resident have difficulty with postural hypotension ?");
		label_6.setBounds(10, 10, 452, 14);
		panel_8.add(label_6);

		buttonGroup7 = new ButtonGroup();
		rb7b = new JxRadioButton();
		rb7b.setTheme(theme);
		buttonGroup7.add(rb7b);
		rb7b.setActionCommand("2");

		rb7b.setText("No");
		rb7b.setBounds(827, 6, 113, 22);
		panel_8.add(rb7b);

		rb7a = new JxRadioButton();
		rb7a.setTheme(theme);
		buttonGroup7.add(rb7a);
		rb7a.setActionCommand("1");

		rb7a.setText("Yes");
		rb7a.setBounds(708, 6, 113, 22);
		panel_8.add(rb7a);

		final JxPanel panel_9 = new JxPanel();
		panel_9.setTheme(theme);

		panel_9.setLayout(null);
		panel_9.setBounds(0, 273, 900, 34);
		panel_1.add(panel_9);

		final JxLabel label_7 = new JxLabel();
		label_7.setTheme(theme);
		label_7
				.setText("8. Is the resident on any medications which would require increased safety precautions ?");
		label_7.setBounds(10, 10, 586, 14);
		panel_9.add(label_7);

		buttonGroup8 = new ButtonGroup();
		rb8b = new JxRadioButton();
		rb8b.setTheme(theme);
		buttonGroup8.add(rb8b);
		rb8b.setActionCommand("2");

		rb8b.setText("No");
		rb8b.setBounds(827, 6, 113, 22);
		panel_9.add(rb8b);

		rb8a = new JxRadioButton();
		rb8a.setTheme(theme);
		buttonGroup8.add(rb8a);
		rb8a.setActionCommand("1");

		rb8a.setText("Yes");
		rb8a.setBounds(709, 6, 113, 22);
		panel_9.add(rb8a);

		final JxPanel panel_10 = new JxPanel();
		panel_10.setTheme(theme);

		panel_10.setLayout(null);
		panel_10.setBounds(0, 313, 900, 34);
		panel_1.add(panel_10);

		final JxLabel label_8 = new JxLabel();
		label_8.setTheme(theme);
		label_8
				.setText("9. Is the resident currently using the side rail for positioning or support ?");
		label_8.setBounds(10, 10, 456, 14);
		panel_10.add(label_8);

		buttonGroup9 = new ButtonGroup();
		rb9b = new JxRadioButton();
		rb9b.setTheme(theme);
		buttonGroup9.add(rb9b);
		rb9b.setActionCommand("2");

		rb9b.setText("No");
		rb9b.setBounds(827, 6, 113, 22);
		panel_10.add(rb9b);

		rb9a = new JxRadioButton();
		rb9a.setTheme(theme);
		buttonGroup9.add(rb9a);
		rb9a.setActionCommand("1");

		rb9a.setText("Yes");
		rb9a.setBounds(708, 6, 113, 22);
		panel_10.add(rb9a);

		final JxPanel panel_11 = new JxPanel();
		panel_11.setTheme(theme);

		panel_11.setLayout(null);
		panel_11.setBounds(0, 353, 900, 34);
		panel_1.add(panel_11);

		final JxLabel label_9 = new JxLabel();
		label_9.setTheme(theme);
		label_9
				.setText("10. Has the resident currently expressed a desire to have side rails reaised while in the bed ?");
		label_9.setBounds(10, 10, 489, 14);
		panel_11.add(label_9);

		buttonGroup10 = new ButtonGroup();
		rb10b = new JxRadioButton();
		rb10b.setTheme(theme);
		buttonGroup10.add(rb10b);
		rb10b.setActionCommand("2");

		rb10b.setText("No");
		rb10b.setBounds(827, 6, 113, 22);
		panel_11.add(rb10b);

		rb10a = new JxRadioButton();
		rb10a.setTheme(theme);
		buttonGroup10.add(rb10a);
		rb10a.setActionCommand("1");

		rb10a.setText("Yes");
		rb10a.setBounds(708, 6, 113, 22);
		panel_11.add(rb10a);

		final JxPanel panel_12 = new JxPanel();
		panel_12.setTheme(theme);

		panel_12.setLayout(null);
		panel_12.setBounds(0, 393, 900, 118);
		panel_1.add(panel_12);

		final JxLabel lessRestrictiveAlternativeLabel = new JxLabel();
		lessRestrictiveAlternativeLabel.setTheme(theme);
		lessRestrictiveAlternativeLabel
				.setText("Less restrictive alternative to side rails (circle appropriate response)");
		lessRestrictiveAlternativeLabel.setBounds(10, 10, 360, 14);
		panel_12.add(lessRestrictiveAlternativeLabel);

		final JxLabel aPreiodicAssestedLabel = new JxLabel();
		aPreiodicAssestedLabel.setTheme(theme);
		aPreiodicAssestedLabel.setText("a. Preiodic Assested Toileting");
		aPreiodicAssestedLabel.setBounds(106, 35, 245, 14);
		panel_12.add(aPreiodicAssestedLabel);

		final JxLabel bFrequentStaffLabel = new JxLabel();
		bFrequentStaffLabel.setTheme(theme);
		bFrequentStaffLabel.setText("b. Frequent Staff Monitoring");
		bFrequentStaffLabel.setBounds(106, 55, 215, 14);
		panel_12.add(bFrequentStaffLabel);

		final JxLabel cResidentEducationLabel = new JxLabel();
		cResidentEducationLabel.setTheme(theme);
		cResidentEducationLabel.setText("c. Resident Education");
		cResidentEducationLabel.setBounds(106, 75, 161, 14);
		panel_12.add(cResidentEducationLabel);

		final JxLabel dResrorariveCareLabel = new JxLabel();
		dResrorariveCareLabel.setTheme(theme);
		dResrorariveCareLabel
				.setText("d. Resrorarive Care to Enhance Independence");
		dResrorariveCareLabel.setBounds(106, 95, 276, 14);
		panel_12.add(dResrorariveCareLabel);

		final JxLabel contLabel = new JxLabel();
		contLabel.setTheme(theme);
		contLabel.setText("(Con't)");
		contLabel.setBounds(808, 95, 54, 14);
		panel_12.add(contLabel);

		doLoad();
	}

	public void doLoad() {
		doUpdate();
	}

	public int doSave() {
		ResidentQuarterlyAssessmentFormPage7 residentQuarterlyAssessmentFormPage7 = new ResidentQuarterlyAssessmentFormPage7();
		residentQuarterlyAssessmentFormPage7
				.setSerial(Global.currentResidentQuarterlyAssessmentFormPage7);
		residentQuarterlyAssessmentFormPage7
				.setFormId(Global.currentResidentAssessmentFormKey);
		residentQuarterlyAssessmentFormPage7.setResidentName(txtResidentName
				.getText());
		residentQuarterlyAssessmentFormPage7.setRoom(txtRoom.getText());

		residentQuarterlyAssessmentFormPage7.setRb1(SwingUtils
				.getSelectedButton(buttonGroup1));
		residentQuarterlyAssessmentFormPage7.setRb2(SwingUtils
				.getSelectedButton(buttonGroup2));
		residentQuarterlyAssessmentFormPage7.setRb3(SwingUtils
				.getSelectedButton(buttonGroup3));
		residentQuarterlyAssessmentFormPage7.setRb4(SwingUtils
				.getSelectedButton(buttonGroup4));
		residentQuarterlyAssessmentFormPage7.setRb5(SwingUtils
				.getSelectedButton(buttonGroup5));
		residentQuarterlyAssessmentFormPage7.setRb6(SwingUtils
				.getSelectedButton(buttonGroup6));
		residentQuarterlyAssessmentFormPage7.setRb7(SwingUtils
				.getSelectedButton(buttonGroup7));
		residentQuarterlyAssessmentFormPage7.setRb8(SwingUtils
				.getSelectedButton(buttonGroup8));
		residentQuarterlyAssessmentFormPage7.setRb9(SwingUtils
				.getSelectedButton(buttonGroup9));
		residentQuarterlyAssessmentFormPage7.setRb10(SwingUtils
				.getSelectedButton(buttonGroup10));
		try {
			Global.currentResidentQuarterlyAssessmentFormPage7 = MedrexClientManager
					.getInstance()
					.insertOrUpdateResidentQuarterlyAssessmentFormPage7(
							residentQuarterlyAssessmentFormPage7);
			return (Global.currentResidentQuarterlyAssessmentFormPage7);
		} catch (Exception e) {
			return (0);
		}
	}

	public void doUpdate() {
		int resId = Global.currentResidenceKey;
		ResidentMain rm = null;
		try {
			rm = MedrexClientManager.getInstance().getResident(resId);
			txtResidentName.setText(rm.getUserName() + " " + rm.getUserPass());
			/* TODO: Migrating to room history */
			// txtRoom.setText(rm.getRoom());
		} catch (Exception e) {

		}
		if (Global.currentResidentAssessmentFormKey == 0) {
			TempRoomHistory roomHist = null;
			try {
				roomHist = MedrexClientManager.getInstance()
						.getCurrentRoomForResident(resId);
			} catch (Exception e) {
				e.printStackTrace();
			}
			/* TODO: Migrating to room history ----- Done */
			if (roomHist != null) {
				txtRoom.setText(roomHist.getRoom());
			}

			Global.currentResidentQuarterlyAssessmentFormPage7 = 0;
			SwingUtils.setSelectedButton(buttonGroup1, 0);
			SwingUtils.setSelectedButton(buttonGroup2, 0);
			SwingUtils.setSelectedButton(buttonGroup3, 0);
			SwingUtils.setSelectedButton(buttonGroup4, 0);
			SwingUtils.setSelectedButton(buttonGroup5, 0);
			SwingUtils.setSelectedButton(buttonGroup6, 0);
			SwingUtils.setSelectedButton(buttonGroup7, 0);
			SwingUtils.setSelectedButton(buttonGroup8, 0);
			SwingUtils.setSelectedButton(buttonGroup9, 0);
			SwingUtils.setSelectedButton(buttonGroup10, 0);
		} else {
			ResidentQuarterlyAssessmentFormPage7 residentQuarterlyAssessmentFormPage7 = null;
			try {
				residentQuarterlyAssessmentFormPage7 = MedrexClientManager
						.getInstance().getResidentQuarterlyAssessmentFormPage7(
								Global.currentResidentAssessmentFormKey);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (residentQuarterlyAssessmentFormPage7 != null) {
				if (residentQuarterlyAssessmentFormPage7.getRb1() != 0)
					SwingUtils.setSelectedButton(buttonGroup1,
							residentQuarterlyAssessmentFormPage7.getRb1());
				if (residentQuarterlyAssessmentFormPage7.getRb2() != 0)
					SwingUtils.setSelectedButton(buttonGroup2,
							residentQuarterlyAssessmentFormPage7.getRb2());
				if (residentQuarterlyAssessmentFormPage7.getRb3() != 0)
					SwingUtils.setSelectedButton(buttonGroup3,
							residentQuarterlyAssessmentFormPage7.getRb3());
				if (residentQuarterlyAssessmentFormPage7.getRb4() != 0)
					SwingUtils.setSelectedButton(buttonGroup4,
							residentQuarterlyAssessmentFormPage7.getRb4());
				if (residentQuarterlyAssessmentFormPage7.getRb5() != 0)
					SwingUtils.setSelectedButton(buttonGroup5,
							residentQuarterlyAssessmentFormPage7.getRb5());
				if (residentQuarterlyAssessmentFormPage7.getRb6() != 0)
					SwingUtils.setSelectedButton(buttonGroup6,
							residentQuarterlyAssessmentFormPage7.getRb6());
				if (residentQuarterlyAssessmentFormPage7.getRb7() != 0)
					SwingUtils.setSelectedButton(buttonGroup7,
							residentQuarterlyAssessmentFormPage7.getRb7());
				if (residentQuarterlyAssessmentFormPage7.getRb8() != 0)
					SwingUtils.setSelectedButton(buttonGroup8,
							residentQuarterlyAssessmentFormPage7.getRb8());
				if (residentQuarterlyAssessmentFormPage7.getRb9() != 0)
					SwingUtils.setSelectedButton(buttonGroup9,
							residentQuarterlyAssessmentFormPage7.getRb9());
				if (residentQuarterlyAssessmentFormPage7.getRb10() != 0)
					SwingUtils.setSelectedButton(buttonGroup10,
							residentQuarterlyAssessmentFormPage7.getRb10());
				txtResidentName.setText(residentQuarterlyAssessmentFormPage7
						.getResidentName());
				txtRoom.setText(residentQuarterlyAssessmentFormPage7.getRoom());
			}

		}
	}

	public boolean doValidate() {
		return false;
	}

}
