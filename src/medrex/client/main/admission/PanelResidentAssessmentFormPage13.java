package medrex.client.main.admission;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldValidation;
import medrex.client.utils.SwingUtils;
import medrex.commons.intf.Form;
import medrex.commons.vo.admission.ResidentAssessmentFormPage13;
import medrex.commons.vo.others.Doctors;
import medrex.commons.vo.others.Nurse;
import medrex.commons.vo.physician.PhysicianForm;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;

import com.jgoodies.validation.ValidationResult;
import com.sX.swing.JxCheckBox;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxLabelYesOrNo;
import com.sX.swing.JxLayeredPanel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxRadioButton;
import com.sX.swing.JxText;
import com.sX.swing.JxTextA;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelResidentAssessmentFormPage13 extends JxPanel implements Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2830533045557424439L;

	Font font = new Font("Arial", Font.PLAIN, 12);

	private JxLabelYesOrNo lblYesOrNo_8_1_1_1_1_1_1_1_1_1_2;
	private JxLabelYesOrNo lblYesOrNo_8_1_1_1_1_1_1_1_1_2_1;
	private JxLabelYesOrNo lblYesOrNo_8_1_1_1_1_1_1_1_2_1;
	private JxLabelYesOrNo lblYesOrNo_8_1_1_1_1_1_1_2_1;
	private JxLabelYesOrNo lblYesOrNo_8_1_1_1_1_1_2_1;
	private JxLabelYesOrNo lblYesOrNo_8_1_1_1_1_2_1;
	private JxLabelYesOrNo lblYesOrNo_8_1_1_1_2_1;
	private JxLabelYesOrNo lblYesOrNo_8_1_1_2_1;
	private JxLabelYesOrNo lblYesOrNo_8_1_2_1;
	private JxLabelYesOrNo lblYesOrNo_8_2_1;
	private JxLabelYesOrNo lblYesOrNo_8_2;
	private JxLabelYesOrNo lblYesOrNo_8_1_2;
	private JxLabelYesOrNo lblYesOrNo_8_1_1_2;
	private JxLabelYesOrNo lblYesOrNo_8_1_1_1_2;
	private JxLabelYesOrNo lblYesOrNo_8_1_1_1_1_2;
	private JxLabelYesOrNo lblYesOrNo_8_1_1_1_1_1_2;
	private JxLabelYesOrNo lblYesOrNo_8_1_1_1_1_1_1_2;
	private JxLabelYesOrNo lblYesOrNo_8_1_1_1_1_1_1_1_2;
	private JxLabelYesOrNo lblYesOrNo_8_1_1_1_1_1_1_1_1_2;
	private JxLabelYesOrNo lblYesOrNo_8_1_1_1_1_1_1_1_1_1;
	private JxLabelYesOrNo lblYesOrNo_8_1_1_1_1_1_1_1_1;
	private JxLabelYesOrNo lblYesOrNo_8_1_1_1_1_1_1_1;
	private JxLabelYesOrNo lblYesOrNo_8_1_1_1_1_1_1;
	private JxLabelYesOrNo lblYesOrNo_8_1_1_1_1_1;
	private JxLabelYesOrNo lblYesOrNo_8_1_1_1_1;
	private JxLabelYesOrNo lblYesOrNo_8_1_1_1;
	private JxLabelYesOrNo lblYesOrNo_8_1_1;
	private JxLabelYesOrNo lblYesOrNo_8_1;
	private JxLabelYesOrNo lblYesOrNo_8;
	private JxLabelYesOrNo lblYesOrNo;
	private JxPanel panelfourthcolumn;
	private JxPanel panelthirdcolumn;
	private JxPanel panelsecondcolumn;
	private JxPanel panelfirstcolumn;
	private JxPanel panelfirstmain;
	private ButtonGroup bg4Q10 = new ButtonGroup();
	private ButtonGroup bg4Q9 = new ButtonGroup();
	private ButtonGroup bg4Q8 = new ButtonGroup();
	private ButtonGroup bg4Q7 = new ButtonGroup();
	private ButtonGroup bg4Q6 = new ButtonGroup();
	private ButtonGroup bg4Q5 = new ButtonGroup();
	private ButtonGroup bg4Q4 = new ButtonGroup();
	private ButtonGroup bg4Q3 = new ButtonGroup();
	private ButtonGroup bg4Q2 = new ButtonGroup();
	// private ButtonGroup bg3Q10 = new ButtonGroup();
	// private ButtonGroup bg3Q9 = new ButtonGroup();
	// private ButtonGroup bg3Q8 = new ButtonGroup();
	// private ButtonGroup bg3Q7 = new ButtonGroup();
	// private ButtonGroup bg3Q6 = new ButtonGroup();
	// private ButtonGroup bg3Q5 = new ButtonGroup();
	// private ButtonGroup bg3Q4 = new ButtonGroup();
	// private ButtonGroup bg3Q3 = new ButtonGroup();
	// private ButtonGroup bg3Q2 = new ButtonGroup();
	// private ButtonGroup bg2Q10 = new ButtonGroup();
	// private ButtonGroup bg2Q9 = new ButtonGroup();
	// private ButtonGroup bg2Q8 = new ButtonGroup();
	// private ButtonGroup bg2Q7 = new ButtonGroup();
	// private ButtonGroup bg2Q6 = new ButtonGroup();
	// private ButtonGroup bg2Q5 = new ButtonGroup();
	// private ButtonGroup bg2Q4 = new ButtonGroup();
	// private ButtonGroup bg2Q3 = new ButtonGroup();
	// private ButtonGroup bg2Q2 = new ButtonGroup();
	// private ButtonGroup bg1Q10 = new ButtonGroup();
	// private ButtonGroup bg1Q9 = new ButtonGroup();
	// private ButtonGroup bg1Q8 = new ButtonGroup();
	// private ButtonGroup bg1Q7 = new ButtonGroup();
	// private ButtonGroup bg1Q6 = new ButtonGroup();
	// private ButtonGroup bg1Q5 = new ButtonGroup();
	// private ButtonGroup bg1Q4 = new ButtonGroup();
	// private ButtonGroup bg1Q3 = new ButtonGroup();
	// private ButtonGroup bg1Q2 = new ButtonGroup();
	private ButtonGroup bg4Q1 = new ButtonGroup();
	// private ButtonGroup bg3Q1 = new ButtonGroup();
	// private ButtonGroup bg2Q1 = new ButtonGroup();
	// private ButtonGroup bg1Q1 = new ButtonGroup();
	private JxDateChooser dcNurseVisit;
	private JxLabel dateLabel;
	private JxComboBox cmbNurse;
	private JxLabel ifSoWhatLabel;
	private JxPanel panel_10;
	private JxRadioButton rb4Risk;
	private JxRadioButton rb4NoRisk;
	private JxDateChooser dateChooser4;
	private ButtonGroup bg2 = new ButtonGroup();
	private JxRadioButton rb3Risk;
	private JxRadioButton rb3NoRisk;
	private JxDateChooser dateChooser3;
	private JxRadioButton rb2Risk;
	private JxRadioButton rb2NoRisk;
	private JxDateChooser dateChooser2;
	private JxRadioButton rb1Risk;
	final JxComboBox cmbPhysician;
	private JxText txtRecordNum;
	private ButtonGroup bg4 = new ButtonGroup();
	private ButtonGroup bg3 = new ButtonGroup();
	private ButtonGroup bg1 = new ButtonGroup();
	private JxLabel lblRoomNum;
	private JxLabel lblResidentName;
	JxCheckBox txtExclusionsUrinary;
	JxRadioButton rb1NoRisk;

	JxTextA txtQ2;

	JxDateChooser dateChooser1;
	private JxLayeredPanel panelLock;

	public PanelResidentAssessmentFormPage13() {
		super();
		Theme theme = new BlackOverWhiteTheme();

		Global.panelResidentAssessmentFormPage13 = this;
		setLayout(null);

		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(930, 900));

		final JxLabel incontinenceAssessmentLabel = new JxLabel();
		incontinenceAssessmentLabel.setTheme(theme);
		incontinenceAssessmentLabel.setText("ELOPEMENT RISK ASSESSMENT");
		incontinenceAssessmentLabel.setFontSize(18);

		incontinenceAssessmentLabel.setFontStyle(Font.BOLD);
		incontinenceAssessmentLabel.setBounds(290, 15, 325, 16);
		add(incontinenceAssessmentLabel);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setLayout(null);

		panel.setBounds(20, 65, 898, 781);
		add(panel);

		final JxLabel residentNameLabel = new JxLabel();
		residentNameLabel.setTheme(theme);

		residentNameLabel.setText("Resident Name:");
		residentNameLabel.setBounds(39, 26, 99, 16);
		panel.add(residentNameLabel);

		lblResidentName = new JxLabel();
		lblResidentName.setTheme(theme);

		lblResidentName.setFontStyle(Font.BOLD);
		lblResidentName.setBounds(144, 24, 243, 20);
		panel.add(lblResidentName);

		final JxLabel residentNameLabel_1 = new JxLabel();
		residentNameLabel_1.setTheme(theme);

		residentNameLabel_1.setText("Record Num:");
		residentNameLabel_1.setBounds(413, 69, 64, 16);
		panel.add(residentNameLabel_1);

		final JxLabel roomLabel = new JxLabel();
		roomLabel.setTheme(theme);

		roomLabel.setText("Room:");
		roomLabel.setBounds(413, 26, 54, 16);
		panel.add(roomLabel);

		lblRoomNum = new JxLabel();
		lblRoomNum.setTheme(theme);

		lblRoomNum.setFontStyle(Font.BOLD);
		lblRoomNum.setBounds(489, 24, 81, 20);
		panel.add(lblRoomNum);

		final JxLabel asLabel = new JxLabel();
		asLabel.setTheme(theme);

		asLabel.setText("Physician");
		asLabel.setBounds(39, 71, 54, 16);
		panel.add(asLabel);

		cmbPhysician = new JxComboBox();
		cmbPhysician.setTheme(theme);

		cmbPhysician.setFontStyle(Font.BOLD);

		cmbPhysician.setBounds(144, 67, 243, 20);
		panel.add(cmbPhysician);

		txtRecordNum = new JxText();
		txtRecordNum.setTheme(theme);

		txtRecordNum.setBounds(489, 67, 81, 20);
		panel.add(txtRecordNum);

		final JxLabel instructionsForCompletionLabel = new JxLabel();
		instructionsForCompletionLabel.setTheme(theme);

		instructionsForCompletionLabel
				.setText("Instructions for completion: Respond Y=Yes or N=No for each question.");
		instructionsForCompletionLabel.setBounds(39, 125, 485, 14);
		panel.add(instructionsForCompletionLabel);

		final JxLabel documentRiskDeterminationLabel = new JxLabel();
		documentRiskDeterminationLabel.setTheme(theme);

		documentRiskDeterminationLabel
				.setText("Document risk determination and develop care plan accordingly.");
		documentRiskDeterminationLabel.setBounds(39, 145, 421, 14);
		panel.add(documentRiskDeterminationLabel);

		final JxPanel panelmain = new JxPanel();
		panelmain.setTheme(theme);
		panelmain.setOpaque(false);
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		panelmain.setLayout(flowLayout);
		panelmain.setBounds(30, 180, 838, 579);
		panel.add(panelmain);

		/*
		 * panelLock = new JxLayeredPanel(); panelLock.setPreferredSize(new
		 * Dimension(696, 579)); panelLock.setBackground(Color.WHITE);
		 * panelLock.setOpaque(false); panelLock.setLayout(null);
		 * panelLock.setBounds(0, 0, 696, 579); panelLock.setLocked(true); //
		 * panelLock.add(panel_1); panelmain.add(panelLock);
		 */

		panelfirstmain = new JxPanel();
		panelfirstmain.setTheme(theme);
		panelfirstmain.setOpaque(false);
		panelfirstmain.setPreferredSize(new Dimension(302, 551));
		panelfirstmain.setBorder(new LineBorder(Color.black, 1, false));
		panelfirstmain.setBackground(Color.BLACK);
		panelfirstmain.setLayout(null);
		panelmain.add(panelfirstmain);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setPreferredSize(new Dimension(35, 35));
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setBackground(Color.BLACK);
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 35, 35);
		panelfirstmain.add(panel_2);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setPreferredSize(new Dimension(268, 35));
		panel_3.setBorder(new LineBorder(Color.black, 1, false));

		panel_3.setLayout(null);
		panel_3.setBounds(34, 0, 268, 35);
		panelfirstmain.add(panel_3);

		final JxLabel assessmentFactorLabel = new JxLabel();
		assessmentFactorLabel.setTheme(theme);

		assessmentFactorLabel.setText("Assessment Factor");
		assessmentFactorLabel.setBounds(32, 10, 187, 14);
		panel_3.add(assessmentFactorLabel);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);
		panel_4.setPreferredSize(new Dimension(302, 35));

		panel_4.setLayout(null);
		panel_4.setBounds(0, 33, 302, 35);
		panelfirstmain.add(panel_4);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setBorder(new LineBorder(Color.black, 1, false));

		panel_5.setLayout(null);
		panel_5.setBounds(0, 0, 35, 35);
		panel_4.add(panel_5);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setText("1");
		label.setBounds(5, 1, 25, 20);
		panel_5.add(label);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setBorder(new LineBorder(Color.black, 1, false));

		panel_6.setLayout(null);
		panel_6.setBounds(34, 0, 268, 35);
		panel_4.add(panel_6);

		final JxTextA doesResidentHaveTextArea = new JxTextA();
		doesResidentHaveTextArea.setTheme(theme);

		doesResidentHaveTextArea
				.setText("Does resident have cognitive impairment with poor decision making skills ?");

		doesResidentHaveTextArea.setWrapStyleWord(true);
		doesResidentHaveTextArea.setLineWrap(true);
		doesResidentHaveTextArea.setEditable(false);
		doesResidentHaveTextArea.setBounds(5, 1, 248, 30);
		panel_6.add(doesResidentHaveTextArea);

		final JxPanel panel_4_1 = new JxPanel();
		panel_4_1.setTheme(theme);
		panel_4_1.setPreferredSize(new Dimension(302, 35));
		panel_4_1.setLayout(null);

		panel_4_1.setBounds(0, 65, 302, 35);
		panelfirstmain.add(panel_4_1);

		final JxPanel panel_5_1 = new JxPanel();
		panel_5_1.setTheme(theme);
		panel_5_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1.setLayout(null);

		panel_5_1.setBounds(0, 0, 35, 35);
		panel_4_1.add(panel_5_1);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);

		label_1.setText("2");
		label_1.setBounds(5, 1, 25, 20);
		panel_5_1.add(label_1);

		final JxPanel panel_6_1 = new JxPanel();
		panel_6_1.setTheme(theme);
		panel_6_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1.setLayout(null);

		panel_6_1.setBounds(34, 0, 268, 35);
		panel_4_1.add(panel_6_1);

		final JxTextA doesResidentHaveTextArea_1 = new JxTextA();
		doesResidentHaveTextArea_1.setTheme(theme);

		doesResidentHaveTextArea_1.setWrapStyleWord(true);
		doesResidentHaveTextArea_1
				.setText("Is resident disoriented to place ?");
		doesResidentHaveTextArea_1.setLineWrap(true);
		doesResidentHaveTextArea_1.setEditable(false);

		doesResidentHaveTextArea_1.setBounds(5, 1, 248, 30);
		panel_6_1.add(doesResidentHaveTextArea_1);

		final JxPanel panel_4_1_1 = new JxPanel();
		panel_4_1_1.setTheme(theme);
		panel_4_1_1.setPreferredSize(new Dimension(302, 35));
		panel_4_1_1.setLayout(null);

		panel_4_1_1.setBounds(0, 98, 302, 35);
		panelfirstmain.add(panel_4_1_1);

		final JxPanel panel_5_1_1 = new JxPanel();
		panel_5_1_1.setTheme(theme);
		panel_5_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1.setLayout(null);

		panel_5_1_1.setBounds(0, 0, 35, 35);
		panel_4_1_1.add(panel_5_1_1);

		final JxLabel label_1_1 = new JxLabel();
		label_1_1.setTheme(theme);

		label_1_1.setText("3");
		label_1_1.setBounds(5, 1, 25, 20);
		panel_5_1_1.add(label_1_1);

		final JxPanel panel_6_1_1 = new JxPanel();
		panel_6_1_1.setTheme(theme);
		panel_6_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1.setLayout(null);

		panel_6_1_1.setBounds(34, 0, 268, 35);
		panel_4_1_1.add(panel_6_1_1);

		final JxTextA doesResidentHaveTextArea_1_1 = new JxTextA();
		doesResidentHaveTextArea_1_1.setTheme(theme);

		doesResidentHaveTextArea_1_1.setWrapStyleWord(true);
		doesResidentHaveTextArea_1_1
				.setText("Is resident able to physically leave the building, with or without an assistive device ?");
		doesResidentHaveTextArea_1_1.setLineWrap(true);
		doesResidentHaveTextArea_1_1.setEditable(false);

		doesResidentHaveTextArea_1_1.setBounds(5, 1, 248, 30);
		panel_6_1_1.add(doesResidentHaveTextArea_1_1);

		final JxPanel panel_4_1_1_1 = new JxPanel();
		panel_4_1_1_1.setTheme(theme);
		panel_4_1_1_1.setPreferredSize(new Dimension(302, 35));
		panel_4_1_1_1.setLayout(null);

		panel_4_1_1_1.setBounds(0, 130, 302, 35);
		panelfirstmain.add(panel_4_1_1_1);

		final JxPanel panel_5_1_1_1 = new JxPanel();
		panel_5_1_1_1.setTheme(theme);
		panel_5_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1.setLayout(null);

		panel_5_1_1_1.setBounds(0, 0, 35, 35);
		panel_4_1_1_1.add(panel_5_1_1_1);

		final JxLabel label_1_1_1 = new JxLabel();
		label_1_1_1.setTheme(theme);

		label_1_1_1.setText("4");
		label_1_1_1.setBounds(5, 1, 25, 20);
		panel_5_1_1_1.add(label_1_1_1);

		final JxPanel panel_6_1_1_1 = new JxPanel();
		panel_6_1_1_1.setTheme(theme);
		panel_6_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_1.setLayout(null);

		panel_6_1_1_1.setBounds(34, 0, 268, 35);
		panel_4_1_1_1.add(panel_6_1_1_1);

		final JxTextA doesResidentHaveTextArea_1_1_1 = new JxTextA();
		doesResidentHaveTextArea_1_1_1.setTheme(theme);

		doesResidentHaveTextArea_1_1_1.setWrapStyleWord(true);
		doesResidentHaveTextArea_1_1_1
				.setText("Has resident verbalized a desire to \"go home\" ?");
		doesResidentHaveTextArea_1_1_1.setLineWrap(true);
		doesResidentHaveTextArea_1_1_1.setEditable(false);

		doesResidentHaveTextArea_1_1_1.setBounds(5, 1, 248, 30);
		panel_6_1_1_1.add(doesResidentHaveTextArea_1_1_1);

		final JxPanel panel_4_1_1_1_1 = new JxPanel();
		panel_4_1_1_1_1.setTheme(theme);
		panel_4_1_1_1_1.setPreferredSize(new Dimension(305, 35));
		panel_4_1_1_1_1.setLayout(null);

		panel_4_1_1_1_1.setBounds(0, 162, 302, 35);
		panelfirstmain.add(panel_4_1_1_1_1);

		final JxPanel panel_5_1_1_1_1 = new JxPanel();
		panel_5_1_1_1_1.setTheme(theme);
		panel_5_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1_1.setLayout(null);

		panel_5_1_1_1_1.setBounds(0, 0, 35, 35);
		panel_4_1_1_1_1.add(panel_5_1_1_1_1);

		final JxLabel label_1_1_1_1 = new JxLabel();
		label_1_1_1_1.setTheme(theme);

		label_1_1_1_1.setText("5");
		label_1_1_1_1.setBounds(5, 1, 25, 20);
		panel_5_1_1_1_1.add(label_1_1_1_1);

		final JxPanel panel_6_1_1_1_1 = new JxPanel();
		panel_6_1_1_1_1.setTheme(theme);
		panel_6_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_1_1.setLayout(null);

		panel_6_1_1_1_1.setBounds(34, 0, 268, 35);
		panel_4_1_1_1_1.add(panel_6_1_1_1_1);

		final JxTextA doesResidentHaveTextArea_1_1_1_1 = new JxTextA();
		doesResidentHaveTextArea_1_1_1_1.setTheme(theme);

		doesResidentHaveTextArea_1_1_1_1.setWrapStyleWord(true);
		doesResidentHaveTextArea_1_1_1_1
				.setText("Is there a history of wandering or elopment, either in the facility or at home ?");
		doesResidentHaveTextArea_1_1_1_1.setLineWrap(true);
		doesResidentHaveTextArea_1_1_1_1.setEditable(false);

		doesResidentHaveTextArea_1_1_1_1.setBounds(5, 1, 248, 30);
		panel_6_1_1_1_1.add(doesResidentHaveTextArea_1_1_1_1);

		final JxPanel panel_4_1_1_1_2 = new JxPanel();
		panel_4_1_1_1_2.setTheme(theme);
		panel_4_1_1_1_2.setPreferredSize(new Dimension(302, 35));
		panel_4_1_1_1_2.setLayout(null);

		panel_4_1_1_1_2.setBounds(0, 195, 302, 53);
		panelfirstmain.add(panel_4_1_1_1_2);

		final JxPanel panel_5_1_1_1_2 = new JxPanel();
		panel_5_1_1_1_2.setTheme(theme);
		panel_5_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1_2.setLayout(null);

		panel_5_1_1_1_2.setBounds(0, 0, 35, 53);
		panel_4_1_1_1_2.add(panel_5_1_1_1_2);

		final JxLabel label_1_1_1_2 = new JxLabel();
		label_1_1_1_2.setTheme(theme);

		label_1_1_1_2.setText("6");
		label_1_1_1_2.setBounds(5, 1, 25, 20);
		panel_5_1_1_1_2.add(label_1_1_1_2);

		final JxPanel panel_6_1_1_1_2 = new JxPanel();
		panel_6_1_1_1_2.setTheme(theme);
		panel_6_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_1_2.setLayout(null);

		panel_6_1_1_1_2.setBounds(34, 0, 268, 53);
		panel_4_1_1_1_2.add(panel_6_1_1_1_2);

		final JxTextA doesResidentHaveTextArea_1_1_1_2 = new JxTextA();
		doesResidentHaveTextArea_1_1_1_2.setTheme(theme);

		doesResidentHaveTextArea_1_1_1_2.setWrapStyleWord(true);
		doesResidentHaveTextArea_1_1_1_2
				.setText("Is there a current behavior of wandering ? (i.e. wandering with no intent or purpose around the facility, seeking spouse or child) ?");
		doesResidentHaveTextArea_1_1_1_2.setLineWrap(true);
		doesResidentHaveTextArea_1_1_1_2.setEditable(false);

		doesResidentHaveTextArea_1_1_1_2.setBounds(5, 1, 248, 45);
		panel_6_1_1_1_2.add(doesResidentHaveTextArea_1_1_1_2);

		final JxPanel panel_4_1_1_1_2_1 = new JxPanel();
		panel_4_1_1_1_2_1.setTheme(theme);
		panel_4_1_1_1_2_1.setPreferredSize(new Dimension(302, 46));
		panel_4_1_1_1_2_1.setLayout(null);

		panel_4_1_1_1_2_1.setBounds(0, 245, 302, 46);
		panelfirstmain.add(panel_4_1_1_1_2_1);

		final JxPanel panel_5_1_1_1_2_1 = new JxPanel();
		panel_5_1_1_1_2_1.setTheme(theme);
		panel_5_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1_2_1.setLayout(null);

		panel_5_1_1_1_2_1.setBounds(0, 0, 35, 46);
		panel_4_1_1_1_2_1.add(panel_5_1_1_1_2_1);

		final JxLabel label_1_1_1_2_1 = new JxLabel();
		label_1_1_1_2_1.setTheme(theme);

		label_1_1_1_2_1.setText("7");
		label_1_1_1_2_1.setBounds(5, 1, 25, 20);
		panel_5_1_1_1_2_1.add(label_1_1_1_2_1);

		final JxPanel panel_6_1_1_1_2_1 = new JxPanel();
		panel_6_1_1_1_2_1.setTheme(theme);
		panel_6_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_1_2_1.setLayout(null);

		panel_6_1_1_1_2_1.setBounds(34, 0, 268, 46);
		panel_4_1_1_1_2_1.add(panel_6_1_1_1_2_1);

		final JxTextA doesResidentHaveTextArea_1_1_1_2_1 = new JxTextA();
		doesResidentHaveTextArea_1_1_1_2_1.setTheme(theme);

		doesResidentHaveTextArea_1_1_1_2_1.setWrapStyleWord(true);
		doesResidentHaveTextArea_1_1_1_2_1
				.setText("Does the resident exhibit persistent agitation, restlessness, anger over placement, etc. ?");
		doesResidentHaveTextArea_1_1_1_2_1.setLineWrap(true);
		doesResidentHaveTextArea_1_1_1_2_1.setEditable(false);

		doesResidentHaveTextArea_1_1_1_2_1.setBounds(5, 5, 248, 39);
		panel_6_1_1_1_2_1.add(doesResidentHaveTextArea_1_1_1_2_1);

		final JxPanel panel_4_1_1_1_2_2 = new JxPanel();
		panel_4_1_1_1_2_2.setTheme(theme);
		panel_4_1_1_1_2_2.setPreferredSize(new Dimension(302, 53));
		panel_4_1_1_1_2_2.setLayout(null);

		panel_4_1_1_1_2_2.setBounds(0, 289, 302, 53);
		panelfirstmain.add(panel_4_1_1_1_2_2);

		final JxPanel panel_5_1_1_1_2_2 = new JxPanel();
		panel_5_1_1_1_2_2.setTheme(theme);
		panel_5_1_1_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1_2_2.setLayout(null);

		panel_5_1_1_1_2_2.setBounds(0, 0, 35, 53);
		panel_4_1_1_1_2_2.add(panel_5_1_1_1_2_2);

		final JxLabel label_1_1_1_2_2 = new JxLabel();
		label_1_1_1_2_2.setTheme(theme);

		label_1_1_1_2_2.setText("8");
		label_1_1_1_2_2.setBounds(5, 1, 25, 20);
		panel_5_1_1_1_2_2.add(label_1_1_1_2_2);

		final JxPanel panel_6_1_1_1_2_2 = new JxPanel();
		panel_6_1_1_1_2_2.setTheme(theme);
		panel_6_1_1_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_1_2_2.setLayout(null);

		panel_6_1_1_1_2_2.setBounds(34, 0, 268, 53);
		panel_4_1_1_1_2_2.add(panel_6_1_1_1_2_2);

		final JxTextA doesResidentHaveTextArea_1_1_1_2_2 = new JxTextA();
		doesResidentHaveTextArea_1_1_1_2_2.setTheme(theme);

		doesResidentHaveTextArea_1_1_1_2_2.setWrapStyleWord(true);
		doesResidentHaveTextArea_1_1_1_2_2
				.setText("Does the resident exhibit intermittent episodes of agitation, restlessness, anger over placement, etc. ?");
		doesResidentHaveTextArea_1_1_1_2_2.setLineWrap(true);
		doesResidentHaveTextArea_1_1_1_2_2.setEditable(false);

		doesResidentHaveTextArea_1_1_1_2_2.setBounds(5, 1, 248, 45);
		panel_6_1_1_1_2_2.add(doesResidentHaveTextArea_1_1_1_2_2);

		final JxPanel panel_4_1_1_1_2_3 = new JxPanel();
		panel_4_1_1_1_2_3.setTheme(theme);
		panel_4_1_1_1_2_3.setPreferredSize(new Dimension(302, 53));
		panel_4_1_1_1_2_3.setLayout(null);

		panel_4_1_1_1_2_3.setBounds(0, 340, 302, 53);
		panelfirstmain.add(panel_4_1_1_1_2_3);

		final JxPanel panel_5_1_1_1_2_3 = new JxPanel();
		panel_5_1_1_1_2_3.setTheme(theme);
		panel_5_1_1_1_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1_2_3.setLayout(null);

		panel_5_1_1_1_2_3.setBounds(0, 0, 35, 53);
		panel_4_1_1_1_2_3.add(panel_5_1_1_1_2_3);

		final JxLabel label_1_1_1_2_3 = new JxLabel();
		label_1_1_1_2_3.setTheme(theme);

		label_1_1_1_2_3.setText("9");
		label_1_1_1_2_3.setBounds(5, 1, 25, 20);
		panel_5_1_1_1_2_3.add(label_1_1_1_2_3);

		final JxPanel panel_6_1_1_1_2_3 = new JxPanel();
		panel_6_1_1_1_2_3.setTheme(theme);
		panel_6_1_1_1_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_1_2_3.setLayout(null);

		panel_6_1_1_1_2_3.setBounds(34, 0, 268, 53);
		panel_4_1_1_1_2_3.add(panel_6_1_1_1_2_3);

		final JxTextA doesResidentHaveTextArea_1_1_1_2_3 = new JxTextA();
		doesResidentHaveTextArea_1_1_1_2_3.setTheme(theme);

		doesResidentHaveTextArea_1_1_1_2_3.setWrapStyleWord(true);
		doesResidentHaveTextArea_1_1_1_2_3
				.setText("Has the resident had apersonal tragedy or received upsetting news recently ?");
		doesResidentHaveTextArea_1_1_1_2_3.setLineWrap(true);
		doesResidentHaveTextArea_1_1_1_2_3.setEditable(false);

		doesResidentHaveTextArea_1_1_1_2_3.setBounds(5, 1, 248, 45);
		panel_6_1_1_1_2_3.add(doesResidentHaveTextArea_1_1_1_2_3);

		final JxPanel panel_4_1_1_1_2_4 = new JxPanel();
		panel_4_1_1_1_2_4.setTheme(theme);
		panel_4_1_1_1_2_4.setPreferredSize(new Dimension(302, 53));
		panel_4_1_1_1_2_4.setLayout(null);

		panel_4_1_1_1_2_4.setBounds(0, 391, 302, 53);
		panelfirstmain.add(panel_4_1_1_1_2_4);

		final JxPanel panel_5_1_1_1_2_4 = new JxPanel();
		panel_5_1_1_1_2_4.setTheme(theme);
		panel_5_1_1_1_2_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1_2_4.setLayout(null);

		panel_5_1_1_1_2_4.setBounds(0, 0, 35, 53);
		panel_4_1_1_1_2_4.add(panel_5_1_1_1_2_4);

		final JxLabel label_1_1_1_2_4 = new JxLabel();
		label_1_1_1_2_4.setTheme(theme);

		label_1_1_1_2_4.setText("10");
		label_1_1_1_2_4.setBounds(5, 1, 25, 20);
		panel_5_1_1_1_2_4.add(label_1_1_1_2_4);

		final JxPanel panel_6_1_1_1_2_4 = new JxPanel();
		panel_6_1_1_1_2_4.setTheme(theme);
		panel_6_1_1_1_2_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_1_2_4.setLayout(null);

		panel_6_1_1_1_2_4.setBounds(34, 0, 268, 53);
		panel_4_1_1_1_2_4.add(panel_6_1_1_1_2_4);

		final JxTextA doesResidentHaveTextArea_1_1_1_2_4 = new JxTextA();
		doesResidentHaveTextArea_1_1_1_2_4.setTheme(theme);

		doesResidentHaveTextArea_1_1_1_2_4.setWrapStyleWord(true);
		doesResidentHaveTextArea_1_1_1_2_4
				.setText("Does resident easily accept redirection ?");
		doesResidentHaveTextArea_1_1_1_2_4.setLineWrap(true);
		doesResidentHaveTextArea_1_1_1_2_4.setEditable(false);

		doesResidentHaveTextArea_1_1_1_2_4.setBounds(5, 1, 248, 45);
		panel_6_1_1_1_2_4.add(doesResidentHaveTextArea_1_1_1_2_4);

		final JxPanel panel_6_1_1_1_2_4_1 = new JxPanel();
		panel_6_1_1_1_2_4_1.setTheme(theme);
		panel_6_1_1_1_2_4_1.setPreferredSize(new Dimension(302, 35));
		panel_6_1_1_1_2_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_1_2_4_1.setLayout(null);

		panel_6_1_1_1_2_4_1.setBounds(0, 439, 302, 35);
		panelfirstmain.add(panel_6_1_1_1_2_4_1);

		final JxTextA doesResidentHaveTextArea_1_1_1_2_4_1 = new JxTextA();
		doesResidentHaveTextArea_1_1_1_2_4_1.setTheme(theme);

		doesResidentHaveTextArea_1_1_1_2_4_1.setWrapStyleWord(true);
		doesResidentHaveTextArea_1_1_1_2_4_1
				.setText("DETERMINATION (Check appropriate answer)");
		doesResidentHaveTextArea_1_1_1_2_4_1.setLineWrap(true);
		doesResidentHaveTextArea_1_1_1_2_4_1.setEditable(false);

		doesResidentHaveTextArea_1_1_1_2_4_1.setBounds(5, 7, 287, 24);
		panel_6_1_1_1_2_4_1.add(doesResidentHaveTextArea_1_1_1_2_4_1);

		final JxPanel panel_6_1_1_1_2_4_1_1 = new JxPanel();
		panel_6_1_1_1_2_4_1_1.setTheme(theme);
		panel_6_1_1_1_2_4_1_1.setPreferredSize(new Dimension(302, 35));
		panel_6_1_1_1_2_4_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_1_2_4_1_1.setLayout(null);

		panel_6_1_1_1_2_4_1_1.setBounds(0, 473, 302, 35);
		panelfirstmain.add(panel_6_1_1_1_2_4_1_1);

		final JxTextA doesResidentHaveTextArea_1_1_1_2_4_1_1 = new JxTextA();
		doesResidentHaveTextArea_1_1_1_2_4_1_1.setTheme(theme);

		doesResidentHaveTextArea_1_1_1_2_4_1_1.setWrapStyleWord(true);
		doesResidentHaveTextArea_1_1_1_2_4_1_1
				.setText("Resident IS NOT at risk for elopment");
		doesResidentHaveTextArea_1_1_1_2_4_1_1.setLineWrap(true);
		doesResidentHaveTextArea_1_1_1_2_4_1_1.setEditable(false);

		doesResidentHaveTextArea_1_1_1_2_4_1_1.setBounds(5, 7, 287, 24);
		panel_6_1_1_1_2_4_1_1.add(doesResidentHaveTextArea_1_1_1_2_4_1_1);

		final JxPanel panel_6_1_1_1_2_4_1_1_1 = new JxPanel();
		panel_6_1_1_1_2_4_1_1_1.setTheme(theme);
		panel_6_1_1_1_2_4_1_1_1.setPreferredSize(new Dimension(302, 46));
		panel_6_1_1_1_2_4_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_1_2_4_1_1_1.setLayout(null);

		panel_6_1_1_1_2_4_1_1_1.setBounds(0, 505, 302, 46);
		panelfirstmain.add(panel_6_1_1_1_2_4_1_1_1);

		final JxTextA doesResidentHaveTextArea_1_1_1_2_4_1_1_1 = new JxTextA();
		doesResidentHaveTextArea_1_1_1_2_4_1_1_1.setTheme(theme);

		doesResidentHaveTextArea_1_1_1_2_4_1_1_1.setWrapStyleWord(true);
		doesResidentHaveTextArea_1_1_1_2_4_1_1_1
				.setText("Resident IS AT RISK for elopement. If yes, proceed to care planning");
		doesResidentHaveTextArea_1_1_1_2_4_1_1_1.setLineWrap(true);
		doesResidentHaveTextArea_1_1_1_2_4_1_1_1.setEditable(false);

		doesResidentHaveTextArea_1_1_1_2_4_1_1_1.setBounds(5, 7, 287, 35);
		panel_6_1_1_1_2_4_1_1_1.add(doesResidentHaveTextArea_1_1_1_2_4_1_1_1);

		panelfirstcolumn = new JxPanel();
		panelfirstcolumn.setTheme(theme);
		panelfirstcolumn.setPreferredSize(new Dimension(143, 551));
		panelfirstcolumn.setLayout(null);

		panelmain.add(panelfirstcolumn);

		dateChooser1 = new JxDateChooser();
		dateChooser1.setTheme(theme);

		dateChooser1.setFontSize(12);
		dateChooser1.setDateFormatString("MM/dd/yyyy");

		dateChooser1.setBorder(new LineBorder(Color.black, 1, false));
		dateChooser1.setBounds(0, 0, 143, 34);
		panelfirstcolumn.add(dateChooser1);

		lblYesOrNo = new JxLabelYesOrNo();
		lblYesOrNo.setFont(font);
		lblYesOrNo.setBounds(0, 34, 143, 34);
		panelfirstcolumn.add(lblYesOrNo);

		/*
		 * final JxPanel panel_8 = new JxPanel(); panel_8.setTheme (theme);
		 * panel_8.setBorder(new LineBorder(Color.black, 1, false));
		 * panel_8.setLayout(null);
		 * 
		 * panel_8.setBounds(0, 34, 143, 34); panel_7.add(panel_8);
		 * 
		 * final JxRadioButton rb1Q1Yes = new JxRadioButton(); rb1Q1Yes.setTheme
		 * (theme); rb1Q1Yes.setActionCommand("1");
		 * rb1Q1Yes.addActionListener(new ActionListener() { public void
		 * actionPerformed(final ActionEvent e) { } });
		 * 
		 * bg1Q1.add(rb1Q1Yes); rb1Q1Yes.setText("Yes"); rb1Q1Yes.setBounds(10,
		 * 3, 42, 18); panel_8.add(rb1Q1Yes);
		 * 
		 * final JxRadioButton rb1Q1No = new JxRadioButton(); rb1Q1No.setTheme
		 * (theme); rb1Q1No.setActionCommand("2");
		 * 
		 * bg1Q1.add(rb1Q1No); rb1Q1No.setText("No"); rb1Q1No.setBounds(70, 3,
		 * 47, 18); panel_8.add(rb1Q1No);
		 */

		lblYesOrNo_8 = new JxLabelYesOrNo();
		lblYesOrNo_8.setFont(font);
		lblYesOrNo_8.setBounds(0, 67, 143, 32);
		panelfirstcolumn.add(lblYesOrNo_8);

		/*
		 * final JxPanel panel_8_1 = new JxPanel(); panel_8_1.setTheme (theme);
		 * panel_8_1.setBorder(new LineBorder(Color.black, 1, false));
		 * panel_8_1.setLayout(null);
		 * 
		 * panel_8_1.setBounds(0, 67, 143, 32); panel_7.add(panel_8_1);
		 * 
		 * final JxRadioButton rb1Q2No = new JxRadioButton(); rb1Q2No.setTheme
		 * (theme); rb1Q2No.setActionCommand("2"); bg1Q2.add(rb1Q2No);
		 * 
		 * rb1Q2No.setText("No"); rb1Q2No.setBounds(70, 0, 50, 18);
		 * panel_8_1.add(rb1Q2No);
		 * 
		 * final JxRadioButton rb1Q2Yes = new JxRadioButton(); rb1Q2Yes.setTheme
		 * (theme); rb1Q2Yes.setActionCommand("1"); bg1Q2.add(rb1Q2Yes);
		 * 
		 * rb1Q2Yes.setText("Yes"); rb1Q2Yes.setBounds(10, 0, 42, 18);
		 * panel_8_1.add(rb1Q2Yes);
		 */

		lblYesOrNo_8_1 = new JxLabelYesOrNo();
		lblYesOrNo_8_1.setFont(font);
		lblYesOrNo_8_1.setBounds(0, 98, 143, 34);
		panelfirstcolumn.add(lblYesOrNo_8_1);

		/*
		 * final JxPanel panel_8_1_1 = new JxPanel(); panel_8_1_1.setTheme
		 * (theme); panel_8_1_1.setBorder(new LineBorder(Color.black, 1,
		 * false)); panel_8_1_1.setLayout(null);
		 * 
		 * panel_8_1_1.setBounds(0, 98, 143, 34); panel_7.add(panel_8_1_1);
		 * 
		 * final JxRadioButton rb1Q3Yes = new JxRadioButton(); rb1Q3Yes.setTheme
		 * (theme); rb1Q3Yes.setActionCommand("1"); bg1Q3.add(rb1Q3Yes);
		 * 
		 * rb1Q3Yes.setText("Yes"); rb1Q3Yes.setBounds(10, 0, 42, 18);
		 * panel_8_1_1.add(rb1Q3Yes);
		 * 
		 * final JxRadioButton rb1Q3No = new JxRadioButton(); rb1Q3No.setTheme
		 * (theme); rb1Q3No.setActionCommand("2"); bg1Q3.add(rb1Q3No);
		 * 
		 * rb1Q3No.setText("No"); rb1Q3No.setBounds(70, 0, 56, 18);
		 * panel_8_1_1.add(rb1Q3No);
		 */

		lblYesOrNo_8_1_1 = new JxLabelYesOrNo();
		lblYesOrNo_8_1_1.setFont(font);
		lblYesOrNo_8_1_1.setBounds(0, 131, 143, 34);
		panelfirstcolumn.add(lblYesOrNo_8_1_1);

		/*
		 * final JxPanel panel_8_1_1_1 = new JxPanel(); panel_8_1_1_1.setTheme
		 * (theme); panel_8_1_1_1.setBorder(new LineBorder(Color.black, 1,
		 * false)); panel_8_1_1_1.setLayout(null);
		 * 
		 * panel_8_1_1_1.setBounds(0, 131, 143, 34); panel_7.add(panel_8_1_1_1);
		 * 
		 * final JxRadioButton rb1Q4Yes = new JxRadioButton(); rb1Q4Yes.setTheme
		 * (theme); rb1Q4Yes.setActionCommand("1"); bg1Q4.add(rb1Q4Yes);
		 * 
		 * rb1Q4Yes.setText("Yes"); rb1Q4Yes.setBounds(10, 0, 42, 18);
		 * panel_8_1_1_1.add(rb1Q4Yes);
		 * 
		 * final JxRadioButton rb1Q4No = new JxRadioButton(); rb1Q4No.setTheme
		 * (theme); rb1Q4No.setActionCommand("2"); bg1Q4.add(rb1Q4No);
		 * 
		 * rb1Q4No.setText("No"); rb1Q4No.setBounds(70, 0, 42, 18);
		 * panel_8_1_1_1.add(rb1Q4No);
		 */

		lblYesOrNo_8_1_1_1 = new JxLabelYesOrNo();
		lblYesOrNo_8_1_1_1.setFont(font);
		lblYesOrNo_8_1_1_1.setBounds(0, 163, 143, 34);
		panelfirstcolumn.add(lblYesOrNo_8_1_1_1);

		/*
		 * final JxPanel panel_8_1_1_1_1 = new JxPanel();
		 * panel_8_1_1_1_1.setTheme (theme); panel_8_1_1_1_1.setBorder(new
		 * LineBorder(Color.black, 1, false)); panel_8_1_1_1_1.setLayout(null);
		 * 
		 * panel_8_1_1_1_1.setBounds(0, 163, 143, 34);
		 * panel_7.add(panel_8_1_1_1_1);
		 * 
		 * final JxRadioButton rb1Q5Yes = new JxRadioButton(); rb1Q5Yes.setTheme
		 * (theme); rb1Q5Yes.setActionCommand("1"); bg1Q5.add(rb1Q5Yes);
		 * 
		 * rb1Q5Yes.addActionListener(new ActionListener() { public void
		 * actionPerformed(final ActionEvent e) { } }); rb1Q5Yes.setText("Yes");
		 * rb1Q5Yes.setBounds(10, 0, 42, 18); panel_8_1_1_1_1.add(rb1Q5Yes);
		 * 
		 * final JxRadioButton rb1Q5No = new JxRadioButton(); rb1Q5No.setTheme
		 * (theme); rb1Q5No.setActionCommand("2"); bg1Q5.add(rb1Q5No);
		 * 
		 * rb1Q5No.setText("No"); rb1Q5No.setBounds(70, 0, 49, 18);
		 * panel_8_1_1_1_1.add(rb1Q5No);
		 */

		lblYesOrNo_8_1_1_1_1 = new JxLabelYesOrNo();
		lblYesOrNo_8_1_1_1_1.setFont(font);
		lblYesOrNo_8_1_1_1_1.setBounds(0, 194, 143, 54);
		panelfirstcolumn.add(lblYesOrNo_8_1_1_1_1);

		/*
		 * final JxPanel panel_8_1_1_1_1_1 = new JxPanel();
		 * panel_8_1_1_1_1_1.setTheme (theme); panel_8_1_1_1_1_1.setBorder(new
		 * LineBorder(Color.black, 1, false));
		 * panel_8_1_1_1_1_1.setLayout(null);
		 * 
		 * panel_8_1_1_1_1_1.setBounds(0, 194, 143, 54);
		 * panel_7.add(panel_8_1_1_1_1_1);
		 * 
		 * final JxRadioButton rb1Q6Yes = new JxRadioButton(); rb1Q6Yes.setTheme
		 * (theme); rb1Q6Yes.setActionCommand("1"); bg1Q6.add(rb1Q6Yes);
		 * 
		 * rb1Q6Yes.setText("Yes"); rb1Q6Yes.setBounds(10, 10, 42, 18);
		 * panel_8_1_1_1_1_1.add(rb1Q6Yes);
		 * 
		 * final JxRadioButton rb1Q6No = new JxRadioButton(); rb1Q6No.setTheme
		 * (theme); rb1Q6No.setActionCommand("2"); bg1Q6.add(rb1Q6No);
		 * 
		 * rb1Q6No.setText("No"); rb1Q6No.setBounds(70, 10, 47, 18);
		 * panel_8_1_1_1_1_1.add(rb1Q6No);
		 */

		lblYesOrNo_8_1_1_1_1_1 = new JxLabelYesOrNo();
		lblYesOrNo_8_1_1_1_1_1.setFont(font);
		lblYesOrNo_8_1_1_1_1_1.setBounds(0, 246, 143, 45);
		panelfirstcolumn.add(lblYesOrNo_8_1_1_1_1_1);

		/*
		 * final JxPanel panel_8_1_1_1_1_1_1 = new JxPanel();
		 * panel_8_1_1_1_1_1_1.setTheme (theme);
		 * panel_8_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		 * panel_8_1_1_1_1_1_1.setLayout(null);
		 * 
		 * panel_8_1_1_1_1_1_1.setBounds(0, 246, 143, 45);
		 * panel_7.add(panel_8_1_1_1_1_1_1);
		 * 
		 * final JxRadioButton rb1Q7Yes = new JxRadioButton(); rb1Q7Yes.setTheme
		 * (theme); rb1Q7Yes.setActionCommand("1"); bg1Q7.add(rb1Q7Yes);
		 * 
		 * rb1Q7Yes.setText("Yes"); rb1Q7Yes.setBounds(10, 10, 42, 18);
		 * panel_8_1_1_1_1_1_1.add(rb1Q7Yes);
		 * 
		 * final JxRadioButton rb1Q7No = new JxRadioButton(); rb1Q7No.setTheme
		 * (theme); rb1Q7No.setActionCommand("2"); bg1Q7.add(rb1Q7No);
		 * 
		 * rb1Q7No.setText("No"); rb1Q7No.setBounds(70, 10, 53, 18);
		 * panel_8_1_1_1_1_1_1.add(rb1Q7No);
		 */

		lblYesOrNo_8_1_1_1_1_1_1 = new JxLabelYesOrNo();
		lblYesOrNo_8_1_1_1_1_1_1.setFont(font);
		lblYesOrNo_8_1_1_1_1_1_1.setBounds(0, 288, 143, 54);
		panelfirstcolumn.add(lblYesOrNo_8_1_1_1_1_1_1);

		/*
		 * final JxPanel panel_8_1_1_1_1_1_1_1 = new JxPanel();
		 * panel_8_1_1_1_1_1_1_1.setTheme (theme);
		 * panel_8_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
		 * false)); panel_8_1_1_1_1_1_1_1.setLayout(null);
		 * 
		 * panel_8_1_1_1_1_1_1_1.setBounds(0, 288, 143, 54);
		 * panel_7.add(panel_8_1_1_1_1_1_1_1);
		 * 
		 * final JxRadioButton rb1Q8Yes = new JxRadioButton(); rb1Q8Yes.setTheme
		 * (theme); rb1Q8Yes.setActionCommand("1"); bg1Q8.add(rb1Q8Yes);
		 * 
		 * rb1Q8Yes.setText("Yes"); rb1Q8Yes.setBounds(10, 10, 42, 18);
		 * panel_8_1_1_1_1_1_1_1.add(rb1Q8Yes);
		 * 
		 * final JxRadioButton rb1Q8No = new JxRadioButton(); rb1Q8No.setTheme
		 * (theme); rb1Q8No.setActionCommand("2"); bg1Q8.add(rb1Q8No);
		 * 
		 * rb1Q8No.setText("No"); rb1Q8No.setBounds(70, 10, 45, 18);
		 * panel_8_1_1_1_1_1_1_1.add(rb1Q8No);
		 */

		lblYesOrNo_8_1_1_1_1_1_1_1 = new JxLabelYesOrNo();
		lblYesOrNo_8_1_1_1_1_1_1_1.setFont(font);
		lblYesOrNo_8_1_1_1_1_1_1_1.setBounds(0, 338, 143, 54);
		panelfirstcolumn.add(lblYesOrNo_8_1_1_1_1_1_1_1);

		/*
		 * final JxPanel panel_8_1_1_1_1_1_1_1_1 = new JxPanel();
		 * panel_8_1_1_1_1_1_1_1_1.setTheme (theme); panel_8_1_1_1_1_1_1_1_1
		 * .setBorder(new LineBorder(Color.black, 1, false));
		 * panel_8_1_1_1_1_1_1_1_1.setLayout(null);
		 * 
		 * panel_8_1_1_1_1_1_1_1_1.setBounds(0, 338, 143, 54);
		 * panel_7.add(panel_8_1_1_1_1_1_1_1_1);
		 * 
		 * final JxRadioButton rb1Q9Yes = new JxRadioButton(); rb1Q9Yes.setTheme
		 * (theme); rb1Q9Yes.setActionCommand("1"); bg1Q9.add(rb1Q9Yes);
		 * 
		 * rb1Q9Yes.setText("Yes"); rb1Q9Yes.setBounds(10, 10, 42, 18);
		 * panel_8_1_1_1_1_1_1_1_1.add(rb1Q9Yes);
		 * 
		 * final JxRadioButton rb1Q9No = new JxRadioButton(); rb1Q9No.setTheme
		 * (theme); rb1Q9No.setActionCommand("2"); bg1Q9.add(rb1Q9No);
		 * 
		 * rb1Q9No.setText("No"); rb1Q9No.setBounds(70, 10, 46, 18);
		 * panel_8_1_1_1_1_1_1_1_1.add(rb1Q9No);
		 */

		lblYesOrNo_8_1_1_1_1_1_1_1_1 = new JxLabelYesOrNo();
		lblYesOrNo_8_1_1_1_1_1_1_1_1.setFont(font);
		lblYesOrNo_8_1_1_1_1_1_1_1_1.setBounds(0, 391, 143, 54);
		panelfirstcolumn.add(lblYesOrNo_8_1_1_1_1_1_1_1_1);

		/*
		 * final JxPanel panel_8_1_1_1_1_1_1_1_1_1 = new JxPanel();
		 * panel_8_1_1_1_1_1_1_1_1_1.setTheme (theme);
		 * panel_8_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
		 * false)); panel_8_1_1_1_1_1_1_1_1_1.setLayout(null);
		 * 
		 * panel_8_1_1_1_1_1_1_1_1_1.setBounds(0, 391, 143, 54);
		 * panel_7.add(panel_8_1_1_1_1_1_1_1_1_1);
		 * 
		 * final JxRadioButton rb1Q10Yes = new JxRadioButton();
		 * rb1Q10Yes.setTheme (theme); rb1Q10Yes.setActionCommand("1");
		 * bg1Q10.add(rb1Q10Yes);
		 * 
		 * rb1Q10Yes.setText("Yes"); rb1Q10Yes.setBounds(10, 10, 42, 18);
		 * panel_8_1_1_1_1_1_1_1_1_1.add(rb1Q10Yes);
		 * 
		 * final JxRadioButton rb1Q10No = new JxRadioButton(); rb1Q10No.setTheme
		 * (theme); rb1Q10No.setActionCommand("2"); bg1Q10.add(rb1Q10No);
		 * 
		 * rb1Q10No.setText("No"); rb1Q10No.setBounds(70, 18, 52, 18);
		 * panel_8_1_1_1_1_1_1_1_1_1.add(rb1Q10No);
		 */

		final JxPanel panel_8_1_1_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_8_1_1_1_1_1_1_1_1_1_1.setTheme(theme);

		panel_8_1_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_8_1_1_1_1_1_1_1_1_1_1.setLayout(null);

		panel_8_1_1_1_1_1_1_1_1_1_1.setBounds(0, 443, 143, 30);
		panelfirstcolumn.add(panel_8_1_1_1_1_1_1_1_1_1_1);

		final JxPanel panel_8_1_1_1_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_8_1_1_1_1_1_1_1_1_1_1_1.setTheme(theme);
		panel_8_1_1_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_8_1_1_1_1_1_1_1_1_1_1_1.setLayout(null);

		panel_8_1_1_1_1_1_1_1_1_1_1_1.setBounds(0, 472, 143, 36);
		panelfirstcolumn.add(panel_8_1_1_1_1_1_1_1_1_1_1_1);

		rb1NoRisk = new JxRadioButton();
		rb1NoRisk.setTheme(theme);

		bg1.add(rb1NoRisk);
		rb1NoRisk.setActionCommand("1");

		rb1NoRisk.setBounds(50, 10, 25, 18);
		panel_8_1_1_1_1_1_1_1_1_1_1_1.add(rb1NoRisk);

		final JxPanel panel_8_1_1_1_1_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_8_1_1_1_1_1_1_1_1_1_1_1_1.setTheme(theme);
		panel_8_1_1_1_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black,
				1, false));
		panel_8_1_1_1_1_1_1_1_1_1_1_1_1.setLayout(null);

		panel_8_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(0, 505, 143, 46);
		panelfirstcolumn.add(panel_8_1_1_1_1_1_1_1_1_1_1_1_1);

		rb1Risk = new JxRadioButton();
		rb1Risk.setTheme(theme);

		bg1.add(rb1Risk);

		rb1Risk.setActionCommand("2");
		rb1Risk.setBounds(50, 10, 24, 18);
		panel_8_1_1_1_1_1_1_1_1_1_1_1_1.add(rb1Risk);

		panelsecondcolumn = new JxPanel();
		panelsecondcolumn.setTheme(theme);
		panelsecondcolumn.setPreferredSize(new Dimension(143, 551));
		panelsecondcolumn.setLayout(null);

		panelmain.add(panelsecondcolumn);

		dateChooser2 = new JxDateChooser();
		dateChooser2.setTheme(theme);

		dateChooser2.setDateFormatString("MM/dd/yyyy");
		dateChooser2.setBorder(new LineBorder(Color.black, 1, false));

		dateChooser2.setBounds(0, 0, 143, 34);
		panelsecondcolumn.add(dateChooser2);

		lblYesOrNo_8_2 = new JxLabelYesOrNo();
		lblYesOrNo_8_2.setFont(font);
		lblYesOrNo_8_2.setBounds(0, 34, 143, 34);
		panelsecondcolumn.add(lblYesOrNo_8_2);

		/*
		 * final JxPanel panel_8_2 = new JxPanel(); panel_8_2.setTheme (theme);
		 * panel_8_2.setBorder(new LineBorder(Color.black, 1, false));
		 * panel_8_2.setLayout(null);
		 * 
		 * panel_8_2.setBounds(0, 34, 143, 34); panel_7_1.add(panel_8_2);
		 * 
		 * final JxRadioButton rb2Q1Yes = new JxRadioButton(); rb2Q1Yes.setTheme
		 * (theme); rb2Q1Yes.setActionCommand("1"); bg2Q1.add(rb2Q1Yes);
		 * 
		 * rb2Q1Yes.setText("Yes"); rb2Q1Yes.setBounds(10, 3, 54, 24);
		 * panel_8_2.add(rb2Q1Yes);
		 * 
		 * final JxRadioButton rb2Q1No = new JxRadioButton(); rb2Q1No.setTheme
		 * (theme); rb2Q1No.setActionCommand("2"); bg2Q1.add(rb2Q1No);
		 * 
		 * rb2Q1No.setText("No"); rb2Q1No.setBounds(70, 3, 47, 18);
		 * panel_8_2.add(rb2Q1No);
		 */

		lblYesOrNo_8_1_2 = new JxLabelYesOrNo();
		lblYesOrNo_8_1_2.setFont(font);
		lblYesOrNo_8_1_2.setBounds(0, 67, 143, 32);
		panelsecondcolumn.add(lblYesOrNo_8_1_2);

		/*
		 * final JxPanel panel_8_1_2 = new JxPanel(); panel_8_1_2.setTheme
		 * (theme); panel_8_1_2.setBorder(new LineBorder(Color.black, 1,
		 * false)); panel_8_1_2.setLayout(null);
		 * 
		 * panel_8_1_2.setBounds(0, 67, 143, 32); panel_7_1.add(panel_8_1_2);
		 * 
		 * final JxRadioButton rb2Q2Yes = new JxRadioButton(); rb2Q2Yes.setTheme
		 * (theme); rb2Q2Yes.setActionCommand("1"); bg2Q2.add(rb2Q2Yes);
		 * 
		 * rb2Q2Yes.setText("Yes"); rb2Q2Yes.setBounds(10, 0, 54, 24);
		 * panel_8_1_2.add(rb2Q2Yes);
		 * 
		 * final JxRadioButton rb2Q2No = new JxRadioButton(); rb2Q2No.setTheme
		 * (theme); rb2Q2No.setActionCommand("2"); bg2Q2.add(rb2Q2No);
		 * 
		 * rb2Q2No.setText("No"); rb2Q2No.setBounds(70, 3, 47, 18);
		 * panel_8_1_2.add(rb2Q2No);
		 */

		lblYesOrNo_8_1_1_2 = new JxLabelYesOrNo();
		lblYesOrNo_8_1_1_2.setFont(font);
		lblYesOrNo_8_1_1_2.setBounds(0, 98, 143, 34);
		panelsecondcolumn.add(lblYesOrNo_8_1_1_2);

		/*
		 * final JxPanel panel_8_1_1_2 = new JxPanel(); panel_8_1_1_2.setTheme
		 * (theme); panel_8_1_1_2.setBorder(new LineBorder(Color.black, 1,
		 * false)); panel_8_1_1_2.setLayout(null);
		 * 
		 * panel_8_1_1_2.setBounds(0, 98, 143, 34);
		 * panel_7_1.add(panel_8_1_1_2);
		 * 
		 * final JxRadioButton rb2Q3Yes = new JxRadioButton(); rb2Q3Yes.setTheme
		 * (theme); rb2Q3Yes.setActionCommand("1"); bg2Q3.add(rb2Q3Yes);
		 * 
		 * rb2Q3Yes.setText("Yes"); rb2Q3Yes.setBounds(10, 0, 54, 24);
		 * panel_8_1_1_2.add(rb2Q3Yes);
		 * 
		 * final JxRadioButton rb2Q3No = new JxRadioButton(); rb2Q3No.setTheme
		 * (theme); rb2Q3No.setActionCommand("2"); bg2Q3.add(rb2Q3No);
		 * 
		 * rb2Q3No.setText("No"); rb2Q3No.setBounds(70, 3, 47, 18);
		 * panel_8_1_1_2.add(rb2Q3No);
		 */

		lblYesOrNo_8_1_1_1_2 = new JxLabelYesOrNo();
		lblYesOrNo_8_1_1_1_2.setFont(font);
		lblYesOrNo_8_1_1_1_2.setBounds(0, 131, 143, 34);
		panelsecondcolumn.add(lblYesOrNo_8_1_1_1_2);

		/*
		 * final JxPanel panel_8_1_1_1_2 = new JxPanel();
		 * panel_8_1_1_1_2.setTheme (theme); panel_8_1_1_1_2.setBorder(new
		 * LineBorder(Color.black, 1, false)); panel_8_1_1_1_2.setLayout(null);
		 * 
		 * panel_8_1_1_1_2.setBounds(0, 131, 143, 34);
		 * panel_7_1.add(panel_8_1_1_1_2);
		 * 
		 * final JxRadioButton rb2Q4Yes = new JxRadioButton(); rb2Q4Yes.setTheme
		 * (theme); rb2Q4Yes.setActionCommand("1"); bg2Q4.add(rb2Q4Yes);
		 * 
		 * rb2Q4Yes.setText("Yes"); rb2Q4Yes.setBounds(10, 0, 54, 24);
		 * panel_8_1_1_1_2.add(rb2Q4Yes);
		 * 
		 * final JxRadioButton rb2Q4No = new JxRadioButton(); rb2Q4No.setTheme
		 * (theme); rb2Q4No.setActionCommand("2"); bg2Q4.add(rb2Q4No);
		 * 
		 * rb2Q4No.setText("No"); rb2Q4No.setBounds(70, 3, 47, 18);
		 * panel_8_1_1_1_2.add(rb2Q4No);
		 */

		lblYesOrNo_8_1_1_1_1_2 = new JxLabelYesOrNo();
		lblYesOrNo_8_1_1_1_1_2.setFont(font);
		lblYesOrNo_8_1_1_1_1_2.setBounds(0, 163, 143, 34);
		panelsecondcolumn.add(lblYesOrNo_8_1_1_1_1_2);

		/*
		 * final JxPanel panel_8_1_1_1_1_2 = new JxPanel();
		 * panel_8_1_1_1_1_2.setTheme (theme); panel_8_1_1_1_1_2.setBorder(new
		 * LineBorder(Color.black, 1, false));
		 * panel_8_1_1_1_1_2.setLayout(null);
		 * 
		 * panel_8_1_1_1_1_2.setBounds(0, 163, 143, 34);
		 * panel_7_1.add(panel_8_1_1_1_1_2);
		 * 
		 * final JxRadioButton rb2Q5Yes = new JxRadioButton(); rb2Q5Yes.setTheme
		 * (theme); rb2Q5Yes.setActionCommand("1"); bg2Q5.add(rb2Q5Yes);
		 * 
		 * rb2Q5Yes.setText("Yes"); rb2Q5Yes.setBounds(10, 0, 54, 24);
		 * panel_8_1_1_1_1_2.add(rb2Q5Yes);
		 * 
		 * final JxRadioButton rb2Q5No = new JxRadioButton(); rb2Q5No.setTheme
		 * (theme); rb2Q5No.setActionCommand("2"); bg2Q5.add(rb2Q5No);
		 * 
		 * rb2Q5No.setText("No"); rb2Q5No.setBounds(70, 3, 47, 18);
		 * panel_8_1_1_1_1_2.add(rb2Q5No);
		 */

		lblYesOrNo_8_1_1_1_1_1_2 = new JxLabelYesOrNo();
		lblYesOrNo_8_1_1_1_1_1_2.setFont(font);
		lblYesOrNo_8_1_1_1_1_1_2.setBounds(0, 194, 143, 54);
		panelsecondcolumn.add(lblYesOrNo_8_1_1_1_1_1_2);

		/*
		 * final JxPanel panel_8_1_1_1_1_1_2 = new JxPanel();
		 * panel_8_1_1_1_1_1_2.setTheme (theme);
		 * panel_8_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		 * panel_8_1_1_1_1_1_2.setLayout(null);
		 * 
		 * panel_8_1_1_1_1_1_2.setBounds(0, 194, 143, 54);
		 * panel_7_1.add(panel_8_1_1_1_1_1_2);
		 * 
		 * final JxRadioButton rb2Q6Yes = new JxRadioButton(); rb2Q6Yes.setTheme
		 * (theme); rb2Q6Yes.setActionCommand("1"); bg2Q6.add(rb2Q6Yes);
		 * 
		 * rb2Q6Yes.setText("Yes"); rb2Q6Yes.setBounds(10, 10, 54, 24);
		 * panel_8_1_1_1_1_1_2.add(rb2Q6Yes);
		 * 
		 * final JxRadioButton rb2Q6No = new JxRadioButton(); rb2Q6No.setTheme
		 * (theme); rb2Q6No.setActionCommand("2"); bg2Q6.add(rb2Q6No);
		 * 
		 * rb2Q6No.setText("No"); rb2Q6No.setBounds(70, 13, 47, 18);
		 * panel_8_1_1_1_1_1_2.add(rb2Q6No);
		 */

		lblYesOrNo_8_1_1_1_1_1_1_2 = new JxLabelYesOrNo();
		lblYesOrNo_8_1_1_1_1_1_1_2.setFont(font);
		lblYesOrNo_8_1_1_1_1_1_1_2.setBounds(0, 246, 143, 45);
		panelsecondcolumn.add(lblYesOrNo_8_1_1_1_1_1_1_2);

		/*
		 * final JxPanel panel_8_1_1_1_1_1_1_2 = new JxPanel();
		 * panel_8_1_1_1_1_1_1_2.setTheme (theme);
		 * panel_8_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1,
		 * false)); panel_8_1_1_1_1_1_1_2.setLayout(null);
		 * 
		 * panel_8_1_1_1_1_1_1_2.setBounds(0, 246, 143, 45);
		 * panel_7_1.add(panel_8_1_1_1_1_1_1_2);
		 * 
		 * final JxRadioButton rb2Q7Yes = new JxRadioButton(); rb2Q7Yes.setTheme
		 * (theme); rb2Q7Yes.setActionCommand("1"); bg2Q7.add(rb2Q7Yes);
		 * 
		 * rb2Q7Yes.setText("Yes"); rb2Q7Yes.setBounds(10, 0, 54, 24);
		 * panel_8_1_1_1_1_1_1_2.add(rb2Q7Yes);
		 * 
		 * final JxRadioButton rb2Q7No = new JxRadioButton(); rb2Q7No.setTheme
		 * (theme); rb2Q7No.setActionCommand("2"); bg2Q7.add(rb2Q7No);
		 * 
		 * rb2Q7No.setText("No"); rb2Q7No.setBounds(70, 3, 47, 18);
		 * panel_8_1_1_1_1_1_1_2.add(rb2Q7No);
		 */

		lblYesOrNo_8_1_1_1_1_1_1_1_2 = new JxLabelYesOrNo();
		lblYesOrNo_8_1_1_1_1_1_1_1_2.setFont(font);
		lblYesOrNo_8_1_1_1_1_1_1_1_2.setBounds(0, 288, 143, 54);
		panelsecondcolumn.add(lblYesOrNo_8_1_1_1_1_1_1_1_2);

		/*
		 * final JxPanel panel_8_1_1_1_1_1_1_1_2 = new JxPanel();
		 * panel_8_1_1_1_1_1_1_1_2.setTheme (theme); panel_8_1_1_1_1_1_1_1_2
		 * .setBorder(new LineBorder(Color.black, 1, false));
		 * panel_8_1_1_1_1_1_1_1_2.setLayout(null);
		 * 
		 * panel_8_1_1_1_1_1_1_1_2.setBounds(0, 288, 143, 54);
		 * panel_7_1.add(panel_8_1_1_1_1_1_1_1_2);
		 * 
		 * final JxRadioButton rb2Q8Yes = new JxRadioButton(); rb2Q8Yes.setTheme
		 * (theme); rb2Q8Yes.setActionCommand("1"); bg2Q8.add(rb2Q8Yes);
		 * 
		 * rb2Q8Yes.setText("Yes"); rb2Q8Yes.setBounds(10, 10, 54, 24);
		 * panel_8_1_1_1_1_1_1_1_2.add(rb2Q8Yes);
		 * 
		 * final JxRadioButton rb2Q8No = new JxRadioButton(); rb2Q8No.setTheme
		 * (theme); rb2Q8No.setActionCommand("2"); bg2Q8.add(rb2Q8No);
		 * 
		 * rb2Q8No.setText("No"); rb2Q8No.setBounds(70, 13, 47, 18);
		 * panel_8_1_1_1_1_1_1_1_2.add(rb2Q8No);
		 */

		lblYesOrNo_8_1_1_1_1_1_1_1_1_2 = new JxLabelYesOrNo();
		lblYesOrNo_8_1_1_1_1_1_1_1_1_2.setFont(font);
		lblYesOrNo_8_1_1_1_1_1_1_1_1_2.setBounds(0, 338, 143, 54);
		panelsecondcolumn.add(lblYesOrNo_8_1_1_1_1_1_1_1_1_2);

		/*
		 * final JxPanel panel_8_1_1_1_1_1_1_1_1_2 = new JxPanel();
		 * panel_8_1_1_1_1_1_1_1_1_2.setTheme (theme);
		 * panel_8_1_1_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1,
		 * false)); panel_8_1_1_1_1_1_1_1_1_2.setLayout(null);
		 * 
		 * panel_8_1_1_1_1_1_1_1_1_2.setBounds(0, 338, 143, 54);
		 * panel_7_1.add(panel_8_1_1_1_1_1_1_1_1_2);
		 * 
		 * final JxRadioButton rb2Q9Yes = new JxRadioButton(); rb2Q9Yes.setTheme
		 * (theme); rb2Q9Yes.setActionCommand("1"); bg2Q9.add(rb2Q9Yes);
		 * 
		 * rb2Q9Yes.setText("Yes"); rb2Q9Yes.setBounds(10, 10, 54, 24);
		 * panel_8_1_1_1_1_1_1_1_1_2.add(rb2Q9Yes);
		 * 
		 * final JxRadioButton rb2Q9No = new JxRadioButton(); rb2Q9No.setTheme
		 * (theme); rb2Q9No.setActionCommand("2"); bg2Q9.add(rb2Q9No);
		 * 
		 * rb2Q9No.setText("No"); rb2Q9No.setBounds(70, 13, 47, 18);
		 * panel_8_1_1_1_1_1_1_1_1_2.add(rb2Q9No);
		 */

		lblYesOrNo_8_1_1_1_1_1_1_1_1_1 = new JxLabelYesOrNo();
		lblYesOrNo_8_1_1_1_1_1_1_1_1_1.setFont(font);
		lblYesOrNo_8_1_1_1_1_1_1_1_1_1.setBounds(0, 391, 143, 54);
		panelsecondcolumn.add(lblYesOrNo_8_1_1_1_1_1_1_1_1_1);

		/*
		 * final JxPanel panel_8_1_1_1_1_1_1_1_1_1_2 = new JxPanel();
		 * panel_8_1_1_1_1_1_1_1_1_1_2.setTheme (theme);
		 * panel_8_1_1_1_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1,
		 * false)); panel_8_1_1_1_1_1_1_1_1_1_2.setLayout(null);
		 * 
		 * panel_8_1_1_1_1_1_1_1_1_1_2.setBounds(0, 391, 143, 54);
		 * panel_7_1.add(panel_8_1_1_1_1_1_1_1_1_1_2);
		 * 
		 * final JxRadioButton rb2Q10Yes = new JxRadioButton();
		 * rb2Q10Yes.setTheme (theme); rb2Q10Yes.setActionCommand("1");
		 * bg2Q10.add(rb2Q10Yes);
		 * 
		 * rb2Q10Yes.setText("Yes"); rb2Q10Yes.setBounds(10, 10, 54, 24);
		 * panel_8_1_1_1_1_1_1_1_1_1_2.add(rb2Q10Yes);
		 * 
		 * final JxRadioButton rb2Q10No = new JxRadioButton(); rb2Q10No.setTheme
		 * (theme); rb2Q10No.setActionCommand("2"); bg2Q10.add(rb2Q10No);
		 * 
		 * rb2Q10No.setText("No"); rb2Q10No.setBounds(70, 13, 47, 18);
		 * panel_8_1_1_1_1_1_1_1_1_1_2.add(rb2Q10No);
		 */

		final JxPanel panel_8_1_1_1_1_1_1_1_1_1_1_2 = new JxPanel();
		panel_8_1_1_1_1_1_1_1_1_1_1_2.setTheme(theme);

		panel_8_1_1_1_1_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_8_1_1_1_1_1_1_1_1_1_1_2.setLayout(null);

		panel_8_1_1_1_1_1_1_1_1_1_1_2.setBounds(0, 443, 143, 30);
		panelsecondcolumn.add(panel_8_1_1_1_1_1_1_1_1_1_1_2);

		final JxPanel panel_8_1_1_1_1_1_1_1_1_1_1_1_2 = new JxPanel();
		panel_8_1_1_1_1_1_1_1_1_1_1_1_2.setTheme(theme);
		panel_8_1_1_1_1_1_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black,
				1, false));
		panel_8_1_1_1_1_1_1_1_1_1_1_1_2.setLayout(null);

		panel_8_1_1_1_1_1_1_1_1_1_1_1_2.setBounds(0, 472, 143, 36);
		panelsecondcolumn.add(panel_8_1_1_1_1_1_1_1_1_1_1_1_2);

		rb2NoRisk = new JxRadioButton();
		rb2NoRisk.setTheme(theme);

		bg2.add(rb2NoRisk);

		rb2NoRisk.setActionCommand("1");
		rb2NoRisk.setBounds(50, 10, 26, 18);
		panel_8_1_1_1_1_1_1_1_1_1_1_1_2.add(rb2NoRisk);

		final JxPanel panel_8_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_8_1_1_1_1_1_1_1_1_1_1_1_1_1.setTheme(theme);
		panel_8_1_1_1_1_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black,
				1, false));
		panel_8_1_1_1_1_1_1_1_1_1_1_1_1_1.setLayout(null);

		panel_8_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(0, 505, 143, 46);
		panelsecondcolumn.add(panel_8_1_1_1_1_1_1_1_1_1_1_1_1_1);

		rb2Risk = new JxRadioButton();
		rb2Risk.setTheme(theme);

		bg2.add(rb2Risk);

		rb2Risk.setActionCommand("2");
		rb2Risk.setBounds(50, 10, 29, 18);
		panel_8_1_1_1_1_1_1_1_1_1_1_1_1_1.add(rb2Risk);

		panelthirdcolumn = new JxPanel();
		panelthirdcolumn.setTheme(theme);
		panelthirdcolumn.setPreferredSize(new Dimension(115, 551));
		panelthirdcolumn.setLayout(null);

		panelmain.add(panelthirdcolumn);

		dateChooser3 = new JxDateChooser();
		dateChooser3.setTheme(theme);

		dateChooser3.setDateFormatString("MM/dd/yyyy");
		dateChooser3.setBorder(new LineBorder(Color.black, 1, false));

		dateChooser3.setBounds(0, 0, 115, 34);
		panelthirdcolumn.add(dateChooser3);

		lblYesOrNo_8_2_1 = new JxLabelYesOrNo();
		lblYesOrNo_8_2_1.setFont(font);
		lblYesOrNo_8_2_1.setBounds(0, 34, 115, 34);
		panelthirdcolumn.add(lblYesOrNo_8_2_1);

		/*
		 * final JxPanel panel_8_2_1 = new JxPanel(); panel_8_2_1.setTheme
		 * (theme); panel_8_2_1.setBorder(new LineBorder(Color.black, 1,
		 * false)); panel_8_2_1.setLayout(null);
		 * 
		 * panel_8_2_1.setBounds(0, 34, 143, 34); panel_7_1_1.add(panel_8_2_1);
		 * 
		 * final JxRadioButton rb3Q1Yes = new JxRadioButton(); rb3Q1Yes.setTheme
		 * (theme); rb3Q1Yes.setActionCommand("1"); bg3Q1.add(rb3Q1Yes);
		 * 
		 * rb3Q1Yes.setText("Yes"); rb3Q1Yes.setBounds(10, 3, 54, 24);
		 * panel_8_2_1.add(rb3Q1Yes);
		 * 
		 * final JxRadioButton rb3Q1No = new JxRadioButton(); rb3Q1No.setTheme
		 * (theme); rb3Q1No.setActionCommand("2"); bg3Q1.add(rb3Q1No);
		 * 
		 * rb3Q1No.setText("No"); rb3Q1No.setBounds(70, 3, 47, 18);
		 * panel_8_2_1.add(rb3Q1No);
		 */

		lblYesOrNo_8_1_2_1 = new JxLabelYesOrNo();
		lblYesOrNo_8_1_2_1.setFont(font);
		lblYesOrNo_8_1_2_1.setBounds(0, 67, 115, 32);
		panelthirdcolumn.add(lblYesOrNo_8_1_2_1);

		/*
		 * final JxPanel panel_8_1_2_1 = new JxPanel(); panel_8_1_2_1.setTheme
		 * (theme); panel_8_1_2_1.setBorder(new LineBorder(Color.black, 1,
		 * false)); panel_8_1_2_1.setLayout(null);
		 * 
		 * panel_8_1_2_1.setBounds(0, 67, 143, 32);
		 * panel_7_1_1.add(panel_8_1_2_1);
		 * 
		 * final JxRadioButton rb3Q2Yes = new JxRadioButton(); rb3Q2Yes.setTheme
		 * (theme); rb3Q2Yes.setActionCommand("1"); bg3Q2.add(rb3Q2Yes);
		 * 
		 * rb3Q2Yes.setText("Yes"); rb3Q2Yes.setBounds(10, 0, 54, 24);
		 * panel_8_1_2_1.add(rb3Q2Yes);
		 * 
		 * final JxRadioButton rb3Q2No = new JxRadioButton(); rb3Q2No.setTheme
		 * (theme); rb3Q2No.setActionCommand("2"); bg3Q2.add(rb3Q2No);
		 * 
		 * rb3Q2No.setText("No"); rb3Q2No.setBounds(70, 3, 47, 18);
		 * panel_8_1_2_1.add(rb3Q2No);
		 */

		lblYesOrNo_8_1_1_2_1 = new JxLabelYesOrNo();
		lblYesOrNo_8_1_1_2_1.setFont(font);
		lblYesOrNo_8_1_1_2_1.setBounds(0, 98, 115, 34);
		panelthirdcolumn.add(lblYesOrNo_8_1_1_2_1);

		/*
		 * final JxPanel panel_8_1_1_2_1 = new JxPanel();
		 * panel_8_1_1_2_1.setTheme (theme); panel_8_1_1_2_1.setBorder(new
		 * LineBorder(Color.black, 1, false)); panel_8_1_1_2_1.setLayout(null);
		 * 
		 * panel_8_1_1_2_1.setBounds(0, 98, 143, 34);
		 * panel_7_1_1.add(panel_8_1_1_2_1);
		 * 
		 * final JxRadioButton rb3Q3Yes = new JxRadioButton(); rb3Q3Yes.setTheme
		 * (theme); rb3Q3Yes.setActionCommand("1"); bg3Q3.add(rb3Q3Yes);
		 * 
		 * rb3Q3Yes.setText("Yes"); rb3Q3Yes.setBounds(10, 0, 54, 24);
		 * panel_8_1_1_2_1.add(rb3Q3Yes);
		 * 
		 * final JxRadioButton rb3Q3No = new JxRadioButton(); rb3Q3No.setTheme
		 * (theme); rb3Q3No.setActionCommand("2"); bg3Q3.add(rb3Q3No);
		 * 
		 * rb3Q3No.setText("No"); rb3Q3No.setBounds(70, 3, 47, 18);
		 * panel_8_1_1_2_1.add(rb3Q3No);
		 */

		lblYesOrNo_8_1_1_1_2_1 = new JxLabelYesOrNo();
		lblYesOrNo_8_1_1_1_2_1.setFont(font);
		lblYesOrNo_8_1_1_1_2_1.setBounds(0, 131, 115, 34);
		panelthirdcolumn.add(lblYesOrNo_8_1_1_1_2_1);

		/*
		 * final JxPanel panel_8_1_1_1_2_1 = new JxPanel();
		 * panel_8_1_1_1_2_1.setTheme (theme); panel_8_1_1_1_2_1.setBorder(new
		 * LineBorder(Color.black, 1, false));
		 * panel_8_1_1_1_2_1.setLayout(null);
		 * 
		 * panel_8_1_1_1_2_1.setBounds(0, 131, 143, 34);
		 * panel_7_1_1.add(panel_8_1_1_1_2_1);
		 * 
		 * final JxRadioButton rb3Q4Yes = new JxRadioButton(); rb3Q4Yes.setTheme
		 * (theme); rb3Q4Yes.setActionCommand("1"); bg3Q4.add(rb3Q4Yes);
		 * 
		 * rb3Q4Yes.setText("Yes"); rb3Q4Yes.setBounds(10, 0, 54, 24);
		 * panel_8_1_1_1_2_1.add(rb3Q4Yes);
		 * 
		 * final JxRadioButton rb3Q4No = new JxRadioButton(); rb3Q4No.setTheme
		 * (theme); rb3Q4No.setActionCommand("2"); bg3Q4.add(rb3Q4No);
		 * 
		 * rb3Q4No.setText("No"); rb3Q4No.setBounds(70, 3, 47, 18);
		 * panel_8_1_1_1_2_1.add(rb3Q4No);
		 */

		lblYesOrNo_8_1_1_1_1_2_1 = new JxLabelYesOrNo();
		lblYesOrNo_8_1_1_1_1_2_1.setFont(font);
		lblYesOrNo_8_1_1_1_1_2_1.setBounds(0, 163, 115, 34);
		panelthirdcolumn.add(lblYesOrNo_8_1_1_1_1_2_1);

		/*
		 * final JxPanel panel_8_1_1_1_1_2_1 = new JxPanel();
		 * panel_8_1_1_1_1_2_1.setTheme (theme);
		 * panel_8_1_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		 * panel_8_1_1_1_1_2_1.setLayout(null);
		 * 
		 * panel_8_1_1_1_1_2_1.setBounds(0, 163, 143, 34);
		 * panel_7_1_1.add(panel_8_1_1_1_1_2_1);
		 * 
		 * final JxRadioButton rb3Q5Yes = new JxRadioButton(); rb3Q5Yes.setTheme
		 * (theme); rb3Q5Yes.setActionCommand("1"); bg3Q5.add(rb3Q5Yes);
		 * 
		 * rb3Q5Yes.setText("Yes"); rb3Q5Yes.setBounds(10, 0, 54, 24);
		 * panel_8_1_1_1_1_2_1.add(rb3Q5Yes);
		 * 
		 * final JxRadioButton rb3Q5No = new JxRadioButton(); rb3Q5No.setTheme
		 * (theme); rb3Q5No.setActionCommand("2"); bg3Q5.add(rb3Q5No);
		 * 
		 * rb3Q5No.setText("No"); rb3Q5No.setBounds(70, 3, 47, 18);
		 * panel_8_1_1_1_1_2_1.add(rb3Q5No);
		 */

		lblYesOrNo_8_1_1_1_1_1_2_1 = new JxLabelYesOrNo();
		lblYesOrNo_8_1_1_1_1_1_2_1.setFont(font);
		lblYesOrNo_8_1_1_1_1_1_2_1.setBounds(0, 194, 115, 54);
		panelthirdcolumn.add(lblYesOrNo_8_1_1_1_1_1_2_1);

		/*
		 * final JxPanel panel_8_1_1_1_1_1_2_1 = new JxPanel();
		 * panel_8_1_1_1_1_1_2_1.setTheme (theme);
		 * panel_8_1_1_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1,
		 * false)); panel_8_1_1_1_1_1_2_1.setLayout(null);
		 * 
		 * panel_8_1_1_1_1_1_2_1.setBounds(0, 194, 143, 54);
		 * panel_7_1_1.add(panel_8_1_1_1_1_1_2_1);
		 * 
		 * final JxRadioButton rb3Q6Yes = new JxRadioButton(); rb3Q6Yes.setTheme
		 * (theme); rb3Q6Yes.setActionCommand("1"); bg3Q6.add(rb3Q6Yes);
		 * 
		 * rb3Q6Yes.setText("Yes"); rb3Q6Yes.setBounds(10, 10, 54, 24);
		 * panel_8_1_1_1_1_1_2_1.add(rb3Q6Yes);
		 * 
		 * final JxRadioButton rb3Q6No = new JxRadioButton(); rb3Q6No.setTheme
		 * (theme); rb3Q6No.setActionCommand("2"); bg3Q6.add(rb3Q6No);
		 * 
		 * rb3Q6No.setText("No"); rb3Q6No.setBounds(70, 13, 47, 18);
		 * panel_8_1_1_1_1_1_2_1.add(rb3Q6No);
		 */

		lblYesOrNo_8_1_1_1_1_1_1_2_1 = new JxLabelYesOrNo();
		lblYesOrNo_8_1_1_1_1_1_1_2_1.setFont(font);
		lblYesOrNo_8_1_1_1_1_1_1_2_1.setBounds(0, 246, 115, 45);
		panelthirdcolumn.add(lblYesOrNo_8_1_1_1_1_1_1_2_1);

		/*
		 * final JxPanel panel_8_1_1_1_1_1_1_2_1 = new JxPanel();
		 * panel_8_1_1_1_1_1_1_2_1.setTheme (theme); panel_8_1_1_1_1_1_1_2_1
		 * .setBorder(new LineBorder(Color.black, 1, false));
		 * panel_8_1_1_1_1_1_1_2_1.setLayout(null);
		 * 
		 * panel_8_1_1_1_1_1_1_2_1.setBounds(0, 246, 143, 45);
		 * panel_7_1_1.add(panel_8_1_1_1_1_1_1_2_1);
		 * 
		 * final JxRadioButton rb3Q7Yes = new JxRadioButton(); rb3Q7Yes.setTheme
		 * (theme); rb3Q7Yes.setActionCommand("1"); bg3Q7.add(rb3Q7Yes);
		 * 
		 * rb3Q7Yes.setText("Yes"); rb3Q7Yes.setBounds(10, 10, 54, 24);
		 * panel_8_1_1_1_1_1_1_2_1.add(rb3Q7Yes);
		 * 
		 * final JxRadioButton rb3Q7No = new JxRadioButton(); rb3Q7No.setTheme
		 * (theme); rb3Q7No.setActionCommand("2"); bg3Q7.add(rb3Q7No);
		 * 
		 * rb3Q7No.setText("No"); rb3Q7No.setBounds(70, 13, 47, 18);
		 * panel_8_1_1_1_1_1_1_2_1.add(rb3Q7No);
		 */

		lblYesOrNo_8_1_1_1_1_1_1_1_2_1 = new JxLabelYesOrNo();
		lblYesOrNo_8_1_1_1_1_1_1_1_2_1.setFont(font);
		lblYesOrNo_8_1_1_1_1_1_1_1_2_1.setBounds(0, 288, 115, 54);
		panelthirdcolumn.add(lblYesOrNo_8_1_1_1_1_1_1_1_2_1);

		/*
		 * final JxPanel panel_8_1_1_1_1_1_1_1_2_1 = new JxPanel();
		 * panel_8_1_1_1_1_1_1_1_2_1.setTheme (theme);
		 * panel_8_1_1_1_1_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1,
		 * false)); panel_8_1_1_1_1_1_1_1_2_1.setLayout(null);
		 * 
		 * panel_8_1_1_1_1_1_1_1_2_1.setBounds(0, 288, 143, 54);
		 * panel_7_1_1.add(panel_8_1_1_1_1_1_1_1_2_1);
		 * 
		 * final JxRadioButton rb3Q8Yes = new JxRadioButton(); rb3Q8Yes.setTheme
		 * (theme); rb3Q8Yes.setActionCommand("1"); bg3Q8.add(rb3Q8Yes);
		 * 
		 * rb3Q8Yes.setText("Yes"); rb3Q8Yes.setBounds(10, 10, 54, 24);
		 * panel_8_1_1_1_1_1_1_1_2_1.add(rb3Q8Yes);
		 * 
		 * final JxRadioButton rb3Q8No = new JxRadioButton(); rb3Q8No.setTheme
		 * (theme); rb3Q8No.setActionCommand("2"); bg3Q8.add(rb3Q8No);
		 * 
		 * rb3Q8No.setText("No"); rb3Q8No.setBounds(70, 13, 47, 18);
		 * panel_8_1_1_1_1_1_1_1_2_1.add(rb3Q8No);
		 */

		lblYesOrNo_8_1_1_1_1_1_1_1_1_2_1 = new JxLabelYesOrNo();
		lblYesOrNo_8_1_1_1_1_1_1_1_1_2_1.setFont(font);
		lblYesOrNo_8_1_1_1_1_1_1_1_1_2_1.setBounds(0, 338, 115, 54);
		panelthirdcolumn.add(lblYesOrNo_8_1_1_1_1_1_1_1_1_2_1);

		/*
		 * final JxPanel panel_8_1_1_1_1_1_1_1_1_2_1 = new JxPanel();
		 * panel_8_1_1_1_1_1_1_1_1_2_1.setTheme (theme);
		 * panel_8_1_1_1_1_1_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1,
		 * false)); panel_8_1_1_1_1_1_1_1_1_2_1.setLayout(null);
		 * 
		 * panel_8_1_1_1_1_1_1_1_1_2_1.setBounds(0, 338, 143, 54);
		 * panel_7_1_1.add(panel_8_1_1_1_1_1_1_1_1_2_1);
		 * 
		 * final JxRadioButton rb3Q9Yes = new JxRadioButton(); rb3Q9Yes.setTheme
		 * (theme); rb3Q9Yes.setActionCommand("1"); bg3Q9.add(rb3Q9Yes);
		 * 
		 * rb3Q9Yes.setText("Yes"); rb3Q9Yes.setBounds(10, 10, 54, 24);
		 * panel_8_1_1_1_1_1_1_1_1_2_1.add(rb3Q9Yes);
		 * 
		 * final JxRadioButton rb3Q9No = new JxRadioButton(); rb3Q9No.setTheme
		 * (theme); rb3Q9No.setActionCommand("2"); bg3Q9.add(rb3Q9No);
		 * 
		 * rb3Q9No.setText("No"); rb3Q9No.setBounds(70, 13, 47, 18);
		 * panel_8_1_1_1_1_1_1_1_1_2_1.add(rb3Q9No);
		 */

		lblYesOrNo_8_1_1_1_1_1_1_1_1_1_2 = new JxLabelYesOrNo();
		lblYesOrNo_8_1_1_1_1_1_1_1_1_1_2.setFont(font);
		lblYesOrNo_8_1_1_1_1_1_1_1_1_1_2.setBounds(0, 391, 115, 54);
		panelthirdcolumn.add(lblYesOrNo_8_1_1_1_1_1_1_1_1_1_2);

		/*
		 * final JxPanel panel_8_1_1_1_1_1_1_1_1_1_2_1 = new JxPanel();
		 * panel_8_1_1_1_1_1_1_1_1_1_2_1.setTheme (theme);
		 * panel_8_1_1_1_1_1_1_1_1_1_2_1.setBorder(new LineBorder(Color.black,
		 * 1, false)); panel_8_1_1_1_1_1_1_1_1_1_2_1.setLayout(null);
		 * 
		 * panel_8_1_1_1_1_1_1_1_1_1_2_1.setBounds(0, 391, 143, 54);
		 * panel_7_1_1.add(panel_8_1_1_1_1_1_1_1_1_1_2_1);
		 * 
		 * final JxRadioButton rb3Q10Yes = new JxRadioButton();
		 * rb3Q10Yes.setTheme (theme); rb3Q10Yes.setActionCommand("1");
		 * bg3Q10.add(rb3Q10Yes);
		 * 
		 * rb3Q10Yes.setText("Yes"); rb3Q10Yes.setBounds(10, 10, 54, 24);
		 * panel_8_1_1_1_1_1_1_1_1_1_2_1.add(rb3Q10Yes);
		 * 
		 * final JxRadioButton rb3Q10No = new JxRadioButton(); rb3Q10No.setTheme
		 * (theme); rb3Q10No.setActionCommand("2"); bg3Q10.add(rb3Q10No);
		 * 
		 * rb3Q10No.setText("No"); rb3Q10No.setBounds(70, 13, 47, 18);
		 * panel_8_1_1_1_1_1_1_1_1_1_2_1.add(rb3Q10No);
		 */

		final JxPanel panel_8_1_1_1_1_1_1_1_1_1_1_2_1 = new JxPanel();
		panel_8_1_1_1_1_1_1_1_1_1_1_2_1.setTheme(theme);

		panel_8_1_1_1_1_1_1_1_1_1_1_2_1.setBorder(new LineBorder(Color.black,
				1, false));
		panel_8_1_1_1_1_1_1_1_1_1_1_2_1.setLayout(null);

		panel_8_1_1_1_1_1_1_1_1_1_1_2_1.setBounds(0, 443, 115, 30);
		panelthirdcolumn.add(panel_8_1_1_1_1_1_1_1_1_1_1_2_1);

		final JxPanel panel_8_1_1_1_1_1_1_1_1_1_1_1_2_1 = new JxPanel();
		panel_8_1_1_1_1_1_1_1_1_1_1_1_2_1.setTheme(theme);
		panel_8_1_1_1_1_1_1_1_1_1_1_1_2_1.setBorder(new LineBorder(Color.black,
				1, false));
		panel_8_1_1_1_1_1_1_1_1_1_1_1_2_1.setLayout(null);

		panel_8_1_1_1_1_1_1_1_1_1_1_1_2_1.setBounds(0, 472, 143, 36);
		panelthirdcolumn.add(panel_8_1_1_1_1_1_1_1_1_1_1_1_2_1);

		rb3NoRisk = new JxRadioButton();
		rb3NoRisk.setTheme(theme);

		bg3.add(rb3NoRisk);

		rb3NoRisk.setActionCommand("1");
		rb3NoRisk.setBounds(50, 10, 23, 18);
		panel_8_1_1_1_1_1_1_1_1_1_1_1_2_1.add(rb3NoRisk);

		final JxPanel panel_8_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_8_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setTheme(theme);
		panel_8_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(
				Color.black, 1, false));
		panel_8_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setLayout(null);

		panel_8_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(0, 505, 143, 46);
		panelthirdcolumn.add(panel_8_1_1_1_1_1_1_1_1_1_1_1_1_1_1);

		rb3Risk = new JxRadioButton();
		rb3Risk.setTheme(theme);

		bg3.add(rb3Risk);

		rb3Risk.setActionCommand("2");
		rb3Risk.setBounds(50, 10, 25, 18);
		panel_8_1_1_1_1_1_1_1_1_1_1_1_1_1_1.add(rb3Risk);

		panelfourthcolumn = new JxPanel();
		panelfourthcolumn.setTheme(theme);
		panelfourthcolumn.setPreferredSize(new Dimension(135, 551));
		panelfourthcolumn.setLayout(null);

		panelmain.add(panelfourthcolumn);

		dateChooser4 = new JxDateChooser();
		dateChooser4.setTheme(theme);

		dateChooser4.setDateFormatString("MM/dd/yyyy");
		dateChooser4.setBorder(new LineBorder(Color.black, 1, false));

		dateChooser4.setBounds(0, 0, 133, 34);
		panelfourthcolumn.add(dateChooser4);

		final JxPanel panel_8_2_1_1 = new JxPanel();
		panel_8_2_1_1.setTheme(theme);
		panel_8_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_1_1.setLayout(null);

		panel_8_2_1_1.setBounds(0, 34, 133, 34);
		panelfourthcolumn.add(panel_8_2_1_1);

		final JxRadioButton rb4Q1Yes = new JxRadioButton();
		rb4Q1Yes.setTheme(theme);

		rb4Q1Yes.setActionCommand("1");
		bg4Q1.add(rb4Q1Yes);

		rb4Q1Yes.setText("Yes");
		rb4Q1Yes.setBounds(10, 4, 54, 15);
		panel_8_2_1_1.add(rb4Q1Yes);

		final JxRadioButton rb4Q1No = new JxRadioButton();
		rb4Q1No.setTheme(theme);

		rb4Q1No.setActionCommand("2");
		bg4Q1.add(rb4Q1No);

		rb4Q1No.setText("No");
		rb4Q1No.setBounds(70, 4, 47, 15);
		panel_8_2_1_1.add(rb4Q1No);

		final JxPanel panel_8_1_2_1_1 = new JxPanel();
		panel_8_1_2_1_1.setTheme(theme);
		panel_8_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2_1_1.setLayout(null);

		panel_8_1_2_1_1.setBounds(0, 67, 133, 32);
		panelfourthcolumn.add(panel_8_1_2_1_1);

		final JxRadioButton rb4Q2Yes = new JxRadioButton();
		rb4Q2Yes.setTheme(theme);

		rb4Q2Yes.setActionCommand("1");
		bg4Q2.add(rb4Q2Yes);

		rb4Q2Yes.setText("Yes");
		rb4Q2Yes.setBounds(10, 4, 54, 15);
		panel_8_1_2_1_1.add(rb4Q2Yes);

		final JxRadioButton rb4Q2No = new JxRadioButton();
		rb4Q2No.setTheme(theme);

		rb4Q2No.setActionCommand("2");
		bg4Q2.add(rb4Q2No);

		rb4Q2No.setText("No");
		rb4Q2No.setBounds(70, 4, 47, 15);
		panel_8_1_2_1_1.add(rb4Q2No);

		final JxPanel panel_8_1_1_2_1_1 = new JxPanel();
		panel_8_1_1_2_1_1.setTheme(theme);
		panel_8_1_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_2_1_1.setLayout(null);

		panel_8_1_1_2_1_1.setBounds(0, 98, 133, 34);
		panelfourthcolumn.add(panel_8_1_1_2_1_1);

		final JxRadioButton rb4Q3Yes = new JxRadioButton();
		rb4Q3Yes.setTheme(theme);

		rb4Q3Yes.setActionCommand("1");
		bg4Q3.add(rb4Q3Yes);

		rb4Q3Yes.setText("Yes");
		rb4Q3Yes.setBounds(10, 4, 54, 15);
		panel_8_1_1_2_1_1.add(rb4Q3Yes);

		final JxRadioButton rb4Q3No = new JxRadioButton();
		rb4Q3No.setTheme(theme);

		rb4Q3No.setActionCommand("2");
		bg4Q3.add(rb4Q3No);

		rb4Q3No.setText("No");
		rb4Q3No.setBounds(70, 4, 47, 15);
		panel_8_1_1_2_1_1.add(rb4Q3No);

		final JxPanel panel_8_1_1_1_2_1_1 = new JxPanel();
		panel_8_1_1_1_2_1_1.setTheme(theme);
		panel_8_1_1_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_2_1_1.setLayout(null);

		panel_8_1_1_1_2_1_1.setBounds(0, 131, 133, 34);
		panelfourthcolumn.add(panel_8_1_1_1_2_1_1);

		final JxRadioButton rb4Q4Yes = new JxRadioButton();
		rb4Q4Yes.setTheme(theme);

		rb4Q4Yes.setActionCommand("1");
		bg4Q4.add(rb4Q4Yes);

		rb4Q4Yes.setText("Yes");
		rb4Q4Yes.setBounds(10, 4, 54, 15);
		panel_8_1_1_1_2_1_1.add(rb4Q4Yes);

		final JxRadioButton rb4Q4No = new JxRadioButton();
		rb4Q4No.setTheme(theme);

		rb4Q4No.setActionCommand("2");
		bg4Q4.add(rb4Q4No);

		rb4Q4No.setText("No");
		rb4Q4No.setBounds(70, 4, 47, 15);
		panel_8_1_1_1_2_1_1.add(rb4Q4No);

		final JxPanel panel_8_1_1_1_1_2_1_1 = new JxPanel();
		panel_8_1_1_1_1_2_1_1.setTheme(theme);
		panel_8_1_1_1_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_1_2_1_1.setLayout(null);

		panel_8_1_1_1_1_2_1_1.setBounds(0, 163, 133, 34);
		panelfourthcolumn.add(panel_8_1_1_1_1_2_1_1);

		final JxRadioButton rb4Q5Yes = new JxRadioButton();
		rb4Q5Yes.setTheme(theme);

		rb4Q5Yes.setActionCommand("1");
		bg4Q5.add(rb4Q5Yes);

		rb4Q5Yes.setText("Yes");
		rb4Q5Yes.setBounds(10, 4, 54, 15);
		panel_8_1_1_1_1_2_1_1.add(rb4Q5Yes);

		final JxRadioButton rb4Q5No = new JxRadioButton();
		rb4Q5No.setTheme(theme);

		rb4Q5No.setActionCommand("2");
		bg4Q5.add(rb4Q5No);

		rb4Q5No.setText("No");
		rb4Q5No.setBounds(70, 4, 47, 15);
		panel_8_1_1_1_1_2_1_1.add(rb4Q5No);

		final JxPanel panel_8_1_1_1_1_1_2_1_1 = new JxPanel();
		panel_8_1_1_1_1_1_2_1_1.setTheme(theme);
		panel_8_1_1_1_1_1_2_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_1_1_2_1_1.setLayout(null);

		panel_8_1_1_1_1_1_2_1_1.setBounds(0, 194, 133, 54);
		panelfourthcolumn.add(panel_8_1_1_1_1_1_2_1_1);

		final JxRadioButton rb4QYes = new JxRadioButton();
		rb4QYes.setTheme(theme);

		rb4QYes.setActionCommand("1");
		bg4Q6.add(rb4QYes);

		rb4QYes.setText("Yes");
		rb4QYes.setBounds(10, 4, 54, 15);
		panel_8_1_1_1_1_1_2_1_1.add(rb4QYes);

		final JxRadioButton rb4Q6No = new JxRadioButton();
		rb4Q6No.setTheme(theme);

		rb4Q6No.setActionCommand("2");
		bg4Q6.add(rb4Q6No);

		rb4Q6No.setText("No");
		rb4Q6No.setBounds(70, 4, 47, 15);
		panel_8_1_1_1_1_1_2_1_1.add(rb4Q6No);

		final JxPanel panel_8_1_1_1_1_1_1_2_1_1 = new JxPanel();
		panel_8_1_1_1_1_1_1_2_1_1.setTheme(theme);
		panel_8_1_1_1_1_1_1_2_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_8_1_1_1_1_1_1_2_1_1.setLayout(null);

		panel_8_1_1_1_1_1_1_2_1_1.setBounds(0, 246, 133, 45);
		panelfourthcolumn.add(panel_8_1_1_1_1_1_1_2_1_1);

		final JxRadioButton rb4Q7Yes = new JxRadioButton();
		rb4Q7Yes.setTheme(theme);

		rb4Q7Yes.setActionCommand("1");
		bg4Q7.add(rb4Q7Yes);

		rb4Q7Yes.setText("Yes");
		rb4Q7Yes.setBounds(10, 4, 54, 15);
		panel_8_1_1_1_1_1_1_2_1_1.add(rb4Q7Yes);

		final JxRadioButton rb4Q7No = new JxRadioButton();
		rb4Q7No.setTheme(theme);

		rb4Q7No.setActionCommand("2");
		bg4Q7.add(rb4Q7No);

		rb4Q7No.setText("No");
		rb4Q7No.setBounds(70, 4, 47, 15);
		panel_8_1_1_1_1_1_1_2_1_1.add(rb4Q7No);

		final JxPanel panel_8_1_1_1_1_1_1_1_2_1_1 = new JxPanel();
		panel_8_1_1_1_1_1_1_1_2_1_1.setTheme(theme);
		panel_8_1_1_1_1_1_1_1_2_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_8_1_1_1_1_1_1_1_2_1_1.setLayout(null);

		panel_8_1_1_1_1_1_1_1_2_1_1.setBounds(0, 288, 133, 54);
		panelfourthcolumn.add(panel_8_1_1_1_1_1_1_1_2_1_1);

		final JxRadioButton rb4Q8Yes = new JxRadioButton();
		rb4Q8Yes.setTheme(theme);

		rb4Q8Yes.setActionCommand("1");
		bg4Q8.add(rb4Q8Yes);

		rb4Q8Yes.setText("Yes");
		rb4Q8Yes.setBounds(10, 4, 54, 15);
		panel_8_1_1_1_1_1_1_1_2_1_1.add(rb4Q8Yes);

		final JxRadioButton rb4Q8No = new JxRadioButton();
		rb4Q8No.setTheme(theme);

		rb4Q8No.setActionCommand("2");
		bg4Q8.add(rb4Q8No);

		rb4Q8No.setText("No");
		rb4Q8No.setBounds(70, 4, 47, 15);
		panel_8_1_1_1_1_1_1_1_2_1_1.add(rb4Q8No);

		final JxPanel panel_8_1_1_1_1_1_1_1_1_2_1_1 = new JxPanel();
		panel_8_1_1_1_1_1_1_1_1_2_1_1.setTheme(theme);
		panel_8_1_1_1_1_1_1_1_1_2_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_8_1_1_1_1_1_1_1_1_2_1_1.setLayout(null);

		panel_8_1_1_1_1_1_1_1_1_2_1_1.setBounds(0, 338, 133, 54);
		panelfourthcolumn.add(panel_8_1_1_1_1_1_1_1_1_2_1_1);

		final JxRadioButton rb4Q9Yes = new JxRadioButton();
		rb4Q9Yes.setTheme(theme);

		rb4Q9Yes.setActionCommand("1");
		bg4Q9.add(rb4Q9Yes);

		rb4Q9Yes.setText("Yes");
		rb4Q9Yes.setBounds(10, 4, 54, 15);
		panel_8_1_1_1_1_1_1_1_1_2_1_1.add(rb4Q9Yes);

		final JxRadioButton rb4Q9No = new JxRadioButton();
		rb4Q9No.setTheme(theme);

		rb4Q9No.setActionCommand("2");
		bg4Q9.add(rb4Q9No);

		rb4Q9No.setText("No");
		rb4Q9No.setBounds(70, 4, 47, 15);
		panel_8_1_1_1_1_1_1_1_1_2_1_1.add(rb4Q9No);

		final JxPanel panel_8_1_1_1_1_1_1_1_1_1_2_1_1 = new JxPanel();
		panel_8_1_1_1_1_1_1_1_1_1_2_1_1.setTheme(theme);
		panel_8_1_1_1_1_1_1_1_1_1_2_1_1.setBorder(new LineBorder(Color.black,
				1, false));
		panel_8_1_1_1_1_1_1_1_1_1_2_1_1.setLayout(null);

		panel_8_1_1_1_1_1_1_1_1_1_2_1_1.setBounds(0, 391, 133, 52);
		panelfourthcolumn.add(panel_8_1_1_1_1_1_1_1_1_1_2_1_1);

		final JxRadioButton rb4Q10Yes = new JxRadioButton();
		rb4Q10Yes.setTheme(theme);

		rb4Q10Yes.setActionCommand("1");
		bg4Q10.add(rb4Q10Yes);

		rb4Q10Yes.setText("Yes");
		rb4Q10Yes.setBounds(10, 4, 54, 15);
		panel_8_1_1_1_1_1_1_1_1_1_2_1_1.add(rb4Q10Yes);

		final JxRadioButton rb4Q10No = new JxRadioButton();
		rb4Q10No.setTheme(theme);

		rb4Q10No.setActionCommand("2");
		bg4Q10.add(rb4Q10No);

		rb4Q10No.setText("No");
		rb4Q10No.setBounds(70, 4, 47, 15);
		panel_8_1_1_1_1_1_1_1_1_1_2_1_1.add(rb4Q10No);

		final JxPanel panel_8_1_1_1_1_1_1_1_1_1_1_2_1_1 = new JxPanel();
		panel_8_1_1_1_1_1_1_1_1_1_1_2_1_1.setTheme(theme);

		panel_8_1_1_1_1_1_1_1_1_1_1_2_1_1.setBorder(new LineBorder(Color.black,
				1, false));
		panel_8_1_1_1_1_1_1_1_1_1_1_2_1_1.setLayout(null);

		panel_8_1_1_1_1_1_1_1_1_1_1_2_1_1.setBounds(0, 443, 133, 32);
		panelfourthcolumn.add(panel_8_1_1_1_1_1_1_1_1_1_1_2_1_1);

		final JxPanel panel_8_1_1_1_1_1_1_1_1_1_1_1_2_1_1 = new JxPanel();
		panel_8_1_1_1_1_1_1_1_1_1_1_1_2_1_1.setTheme(theme);
		panel_8_1_1_1_1_1_1_1_1_1_1_1_2_1_1.setBorder(new LineBorder(
				Color.black, 1, false));
		panel_8_1_1_1_1_1_1_1_1_1_1_1_2_1_1.setLayout(null);

		panel_8_1_1_1_1_1_1_1_1_1_1_1_2_1_1.setBounds(0, 472, 133, 36);
		panelfourthcolumn.add(panel_8_1_1_1_1_1_1_1_1_1_1_1_2_1_1);

		rb4NoRisk = new JxRadioButton();
		rb4NoRisk.setTheme(theme);

		bg4.add(rb4NoRisk);

		rb4NoRisk.setActionCommand("1");
		rb4NoRisk.setBounds(50, 10, 27, 18);
		panel_8_1_1_1_1_1_1_1_1_1_1_1_2_1_1.add(rb4NoRisk);

		final JxPanel panel_8_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_8_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setTheme(theme);
		panel_8_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(
				Color.black, 1, false));
		panel_8_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setLayout(null);

		panel_8_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(0, 505, 133, 46);
		panelfourthcolumn.add(panel_8_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1);

		rb4Risk = new JxRadioButton();
		rb4Risk.setTheme(theme);

		bg4.add(rb4Risk);

		rb4Risk.setActionCommand("2");
		rb4Risk.setBounds(50, 10, 28, 18);
		panel_8_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.add(rb4Risk);

		panel_10 = new JxPanel();
		panel_10.setTheme(theme);
		panel_10.setLayout(null);

		panel_10.setBounds(20, 852, 898, 30);
		add(panel_10);

		ifSoWhatLabel = new JxLabel();
		ifSoWhatLabel.setTheme(theme);

		ifSoWhatLabel.setText("Nurse Signature:");
		ifSoWhatLabel.setBounds(21, 8, 91, 16);
		panel_10.add(ifSoWhatLabel);

		cmbNurse = new JxComboBox();
		cmbNurse.setTheme(theme);

		cmbNurse.setBounds(123, 6, 205, 20);
		panel_10.add(cmbNurse);

		dateLabel = new JxLabel();
		dateLabel.setTheme(theme);

		dateLabel.setText("Date :");
		dateLabel.setBounds(564, 11, 30, 16);
		panel_10.add(dateLabel);

		dcNurseVisit = new JxDateChooser();
		dcNurseVisit.setTheme(theme);

		dcNurseVisit.setDate(MedrexClientManager.getServerTime());
		dcNurseVisit.setDateFormatString("MM/dd/yyyy");
		dcNurseVisit.setBounds(597, 7, 168, 22);
		panel_10.add(dcNurseVisit);

		final PanelloggedInUser panel_9 = new PanelloggedInUser();
		panel_9.setBounds(118, 4, 312, 22);
		panel_10.add(panel_9);

		// panelMain = new JxLayeredPanel();
		// panelMain.setBackground(Color.WHITE);
		// panelMain.setLayout(null);
		// panelMain.setOpaque(false);
		// panelMain.setBounds(30, 180, 725, 550);
		// panelMain.setPreferredSize(new Dimension(725, 550));
		// panelMain.setFilter(new GrayFilter());
		// panelMain.setLocked(true);
		// panel.add(panelMain);

		doLoad();
		doPanelVisiblity();

		// panelLock.setLocked(true);
		// this.repaint();
	}

	public void doLoad() {
		fillCombos();
		doUpdate();
	}

	public void fillCombos() {

		try {
			List<Nurse> nurList = MedrexClientManager.getInstance()
					.getNurseRecords();
			Iterator<Nurse> i = nurList.iterator();
			while (i.hasNext()) {
				Nurse nur = i.next();
				cmbNurse.addItem(nur.getNurseSurName() + " , "
						+ nur.getNurseName());
				cmbNurse.setVisible(false);
			}
		} catch (Exception e) {
		}
		String doctorName = "";
		List l = new ArrayList();
		if (Global.currentResidenceKey != 0) {
			try {
				l = MedrexClientManager.getInstance().getPhysicianForms(
						Global.currentResidenceKey);
				Iterator<PhysicianForm> i = l.iterator();
				while (i.hasNext()) {
					PhysicianForm Phyform = i.next();
					Doctors d = Phyform.getPhysician();
					if (d.getDoctorType().getMsterName().equalsIgnoreCase(
							"PHYSICIAN")) {
						doctorName = d.getPhysicianSurName() + " , "
								+ d.getPhysicianName();
					}
				}
			} catch (Exception e) {
			}
		}
		cmbPhysician.addItem(doctorName);
	}

	private void doPanelVisiblity() {
		if ("Resident Assessment Form"
				.equalsIgnoreCase(Global.currentAdmissionRecordForm)) {
			panelfirstcolumn.setVisible(false);
			panelsecondcolumn.setVisible(false);
			panelthirdcolumn.setVisible(false);
		}
	}

	public void doUpdate() {
		int resId = Global.currentResidenceKey;
		ResidentMain rm = null;
		try {
			rm = MedrexClientManager.getInstance().getResident(resId);
			lblResidentName.setText(rm.getUserName() + " " + rm.getUserPass());
			/* TODO: Migrating to room history */
			// txtRoomNum.setText(rm.getRoom());
		} catch (Exception e) {

		}

		if (Global.currentResidentAssessmentFormKey == 0) {
			Global.currentResidentAssessmentFormPage13Key = 0;

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

		} else {
			List<ResidentAssessmentFormPage13> rafp13List = null;
			try {
				rafp13List = MedrexClientManager.getInstance()
						.getResidentAssessmentFormPage13(
								Global.currentResidenceKey,
								Global.currentResidentAssessmentFormKey);
			} catch (Exception e) {

			}

			if (rafp13List != null && rafp13List.size() > 0) {

				ResidentAssessmentFormPage13 rafp13 = rafp13List.get(0);

				Global.currentResidentAssessmentFormPage13Key = rafp13
						.getSerial();

				dcNurseVisit.setDate(rafp13.getNurseVisit());
				cmbNurse.setSelectedItem(rafp13.getNurse());

				cmbPhysician.setSelectedItem(rafp13.getPhysician());
				txtRecordNum.setText(rafp13.getRecordNum());

				dateChooser4.setDate(rafp13.getDateFactor4());

				SwingUtils.setSelectedButton(bg4Q1, Integer.parseInt(rafp13
						.getAnswer4Q1()));
				SwingUtils.setSelectedButton(bg4Q2, Integer.parseInt(rafp13
						.getAnswer4Q2()));
				SwingUtils.setSelectedButton(bg4Q3, Integer.parseInt(rafp13
						.getAnswer4Q3()));
				SwingUtils.setSelectedButton(bg4Q4, Integer.parseInt(rafp13
						.getAnswer4Q4()));
				SwingUtils.setSelectedButton(bg4Q5, Integer.parseInt(rafp13
						.getAnswer4Q5()));
				SwingUtils.setSelectedButton(bg4Q6, Integer.parseInt(rafp13
						.getAnswer4Q6()));
				SwingUtils.setSelectedButton(bg4Q7, Integer.parseInt(rafp13
						.getAnswer4Q7()));
				SwingUtils.setSelectedButton(bg4Q8, Integer.parseInt(rafp13
						.getAnswer4Q8()));
				SwingUtils.setSelectedButton(bg4Q9, Integer.parseInt(rafp13
						.getAnswer4Q9()));
				SwingUtils.setSelectedButton(bg4Q10, Integer.parseInt(rafp13
						.getAnswer4Q10()));
				SwingUtils.setSelectedButton(bg4, rafp13.getDetermination4());
				lblResidentName.setText(rafp13.getResidentName());
				lblRoomNum.setText(rafp13.getRoomNo());

			}
			if (rafp13List != null && rafp13List.size() > 1) {
				ResidentAssessmentFormPage13 rafp13 = rafp13List.get(1);

				dateChooser3.setDate(rafp13.getDateFactor4());
				SwingUtils.setSelectedButton(bg3, rafp13.getDetermination3());
				if (rafp13.getAnswer4Q1().equalsIgnoreCase("1")) {
					lblYesOrNo_8_2_1.doSetYesOrNo("Yes");
				} else if (rafp13.getAnswer4Q1() == "2") {
					lblYesOrNo_8_2_1.doSetYesOrNo("No");
				}
				if (rafp13.getAnswer4Q2().equalsIgnoreCase("1")) {
					lblYesOrNo_8_1_2_1.doSetYesOrNo("Yes");
				} else if (rafp13.getAnswer4Q2().equalsIgnoreCase("2")) {
					lblYesOrNo_8_1_2_1.doSetYesOrNo("No");
				}
				if (rafp13.getAnswer4Q3().equalsIgnoreCase("1")) {
					lblYesOrNo_8_1_1_2_1.doSetYesOrNo("Yes");
				} else if (rafp13.getAnswer4Q3().equalsIgnoreCase("2")) {
					lblYesOrNo_8_1_1_2_1.doSetYesOrNo("No");
				}
				if (rafp13.getAnswer4Q4().equalsIgnoreCase("1")) {
					lblYesOrNo_8_1_1_1_2_1.doSetYesOrNo("Yes");
				} else if (rafp13.getAnswer4Q4().equalsIgnoreCase("2")) {
					lblYesOrNo_8_1_1_1_2_1.doSetYesOrNo("No");
				}
				if (rafp13.getAnswer4Q5().equalsIgnoreCase("1")) {
					lblYesOrNo_8_1_1_1_1_2_1.doSetYesOrNo("Yes");
				} else if (rafp13.getAnswer4Q5().equalsIgnoreCase("2")) {
					lblYesOrNo_8_1_1_1_1_2_1.doSetYesOrNo("No");
				}
				if (rafp13.getAnswer4Q6().equalsIgnoreCase("1")) {
					lblYesOrNo_8_1_1_1_1_1_2_1.doSetYesOrNo("Yes");
				} else if (rafp13.getAnswer4Q6().equalsIgnoreCase("2")) {
					lblYesOrNo_8_1_1_1_1_1_2_1.doSetYesOrNo("No");
				}
				if (rafp13.getAnswer4Q7().equalsIgnoreCase("1")) {
					lblYesOrNo_8_1_1_1_1_1_1_2_1.doSetYesOrNo("Yes");
				} else if (rafp13.getAnswer4Q7().equalsIgnoreCase("2")) {
					lblYesOrNo_8_1_1_1_1_1_1_2_1.doSetYesOrNo("No");
				}
				if (rafp13.getAnswer4Q8().equalsIgnoreCase("1")) {
					lblYesOrNo_8_1_1_1_1_1_1_1_2_1.doSetYesOrNo("Yes");
				} else if (rafp13.getAnswer4Q8().equalsIgnoreCase("2")) {
					lblYesOrNo_8_1_1_1_1_1_1_1_2_1.doSetYesOrNo("No");
				}
				if (rafp13.getAnswer4Q9().equalsIgnoreCase("1")) {
					lblYesOrNo_8_1_1_1_1_1_1_1_1_2_1.doSetYesOrNo("Yes");
				} else if (rafp13.getAnswer4Q9().equalsIgnoreCase("2")) {
					lblYesOrNo_8_1_1_1_1_1_1_1_1_2_1.doSetYesOrNo("No");
				}

			}

			if (rafp13List != null && rafp13List.size() > 2) {
				ResidentAssessmentFormPage13 rafp13 = rafp13List.get(2);

				dateChooser2.setDate(rafp13.getDateFactor4());
				SwingUtils.setSelectedButton(bg2, rafp13.getDetermination2());

				if (rafp13.getAnswer4Q1().equalsIgnoreCase("1")) {
					lblYesOrNo_8_2.doSetYesOrNo("Yes");
				} else if (rafp13.getAnswer4Q1().equalsIgnoreCase("2")) {
					lblYesOrNo_8_2.doSetYesOrNo("No");
				}
				if (rafp13.getAnswer4Q2().equalsIgnoreCase("1")) {
					lblYesOrNo_8_1_2.doSetYesOrNo("Yes");
				} else if (rafp13.getAnswer4Q2().equalsIgnoreCase("2")) {
					lblYesOrNo_8_1_2.doSetYesOrNo("No");
				}
				if (rafp13.getAnswer4Q3().equalsIgnoreCase("1")) {
					lblYesOrNo_8_1_1_2.doSetYesOrNo("Yes");
				} else if (rafp13.getAnswer4Q3().equalsIgnoreCase("2")) {
					lblYesOrNo_8_1_1_2.doSetYesOrNo("No");
				}
				if (rafp13.getAnswer4Q4().equalsIgnoreCase("1")) {
					lblYesOrNo_8_1_1_1_2.doSetYesOrNo("Yes");
				} else if (rafp13.getAnswer4Q4().equalsIgnoreCase("2")) {
					lblYesOrNo_8_1_1_1_2.doSetYesOrNo("No");
				}
				if (rafp13.getAnswer4Q5().equalsIgnoreCase("1")) {
					lblYesOrNo_8_1_1_1_1_2.doSetYesOrNo("Yes");
				} else if (rafp13.getAnswer4Q5().equalsIgnoreCase("2")) {
					lblYesOrNo_8_1_1_1_1_2.doSetYesOrNo("No");
				}
				if (rafp13.getAnswer4Q6().equalsIgnoreCase("1")) {
					lblYesOrNo_8_1_1_1_1_1_2.doSetYesOrNo("Yes");
				} else if (rafp13.getAnswer4Q6().equalsIgnoreCase("2")) {
					lblYesOrNo_8_1_1_1_1_1_2.doSetYesOrNo("No");
				}
				if (rafp13.getAnswer4Q7().equalsIgnoreCase("1")) {
					lblYesOrNo_8_1_1_1_1_1_1_2.doSetYesOrNo("Yes");
				} else if (rafp13.getAnswer4Q7().equalsIgnoreCase("2")) {
					lblYesOrNo_8_1_1_1_1_1_1_2.doSetYesOrNo("No");
				}
				if (rafp13.getAnswer4Q8().equalsIgnoreCase("1")) {
					lblYesOrNo_8_1_1_1_1_1_1_1_2.doSetYesOrNo("Yes");
				} else if (rafp13.getAnswer4Q8().equalsIgnoreCase("2")) {
					lblYesOrNo_8_1_1_1_1_1_1_1_2.doSetYesOrNo("No");
				}
				if (rafp13.getAnswer4Q9().equalsIgnoreCase("1")) {
					lblYesOrNo_8_1_1_1_1_1_1_1_1_2.doSetYesOrNo("Yes");
				} else if (rafp13.getAnswer4Q9().equalsIgnoreCase("2")) {
					lblYesOrNo_8_1_1_1_1_1_1_1_1_2.doSetYesOrNo("No");
				}
			}

			if (rafp13List != null && rafp13List.size() > 3) {
				ResidentAssessmentFormPage13 rafp13 = rafp13List.get(3);

				dateChooser1.setDate(rafp13.getDateFactor4());
				SwingUtils.setSelectedButton(bg1, rafp13.getDetermination1());

				if (rafp13.getAnswer4Q1().equalsIgnoreCase("1")) {
					lblYesOrNo_8.doSetYesOrNo("Yes");
				} else if (rafp13.getAnswer4Q1().equalsIgnoreCase("2")) {
					lblYesOrNo_8.doSetYesOrNo("No");
				}
				if (rafp13.getAnswer4Q2().equalsIgnoreCase("1")) {
					lblYesOrNo_8_1.doSetYesOrNo("Yes");
				} else if (rafp13.getAnswer4Q2().equalsIgnoreCase("2")) {
					lblYesOrNo_8_1.doSetYesOrNo("No");
				}
				if (rafp13.getAnswer4Q3().equalsIgnoreCase("1")) {
					lblYesOrNo_8_1_1.doSetYesOrNo("Yes");
				} else if (rafp13.getAnswer4Q3().equalsIgnoreCase("2")) {
					lblYesOrNo_8_1_1.doSetYesOrNo("No");
				}
				if (rafp13.getAnswer4Q4().equalsIgnoreCase("1")) {
					lblYesOrNo_8_1_1_1.doSetYesOrNo("Yes");
				} else if (rafp13.getAnswer4Q4().equalsIgnoreCase("2")) {
					lblYesOrNo_8_1_1_1.doSetYesOrNo("No");
				}
				if (rafp13.getAnswer4Q5().equalsIgnoreCase("1")) {
					lblYesOrNo_8_1_1_1_1.doSetYesOrNo("Yes");
				} else if (rafp13.getAnswer4Q5().equalsIgnoreCase("2")) {
					lblYesOrNo_8_1_1_1_1.doSetYesOrNo("No");
				}
				if (rafp13.getAnswer4Q6().equalsIgnoreCase("1")) {
					lblYesOrNo_8_1_1_1_1_1.doSetYesOrNo("Yes");
				} else if (rafp13.getAnswer4Q6().equalsIgnoreCase("2")) {
					lblYesOrNo_8_1_1_1_1_1.doSetYesOrNo("No");
				}
				if (rafp13.getAnswer4Q7().equalsIgnoreCase("1")) {
					lblYesOrNo_8_1_1_1_1_1_1.doSetYesOrNo("Yes");
				} else if (rafp13.getAnswer4Q7().equalsIgnoreCase("2")) {
					lblYesOrNo_8_1_1_1_1_1_1.doSetYesOrNo("No");
				}
				if (rafp13.getAnswer4Q8().equalsIgnoreCase("1")) {
					lblYesOrNo_8_1_1_1_1_1_1_1.doSetYesOrNo("Yes");
				} else if (rafp13.getAnswer4Q8().equalsIgnoreCase("2")) {
					lblYesOrNo_8_1_1_1_1_1_1_1.doSetYesOrNo("No");
				}
				if (rafp13.getAnswer4Q9().equalsIgnoreCase("1")) {
					lblYesOrNo_8_1_1_1_1_1_1_1_1.doSetYesOrNo("Yes");
				} else if (rafp13.getAnswer4Q9().equalsIgnoreCase("2")) {
					lblYesOrNo_8_1_1_1_1_1_1_1_1.doSetYesOrNo("No");
				}
			}

			// cmb1Q1.setSelectedItem(rafp13.getAnswer1Q1());
			// SwingUtils.setSelectedButton(bg1Q1, Integer.parseInt(rafp13
			// .getAnswer1Q1()));
			// SwingUtils.setSelectedButton(bg1Q2, Integer.parseInt(rafp13
			// .getAnswer1Q2()));
			// SwingUtils.setSelectedButton(bg1Q3, Integer.parseInt(rafp13
			// .getAnswer1Q3()));
			// SwingUtils.setSelectedButton(bg1Q4, Integer.parseInt(rafp13
			// .getAnswer1Q4()));
			// SwingUtils.setSelectedButton(bg1Q5, Integer.parseInt(rafp13
			// .getAnswer1Q5()));
			// SwingUtils.setSelectedButton(bg1Q6, Integer.parseInt(rafp13
			// .getAnswer1Q6()));
			// SwingUtils.setSelectedButton(bg1Q7, Integer.parseInt(rafp13
			// .getAnswer1Q7()));
			// SwingUtils.setSelectedButton(bg1Q8, Integer.parseInt(rafp13
			// .getAnswer1Q8()));
			// SwingUtils.setSelectedButton(bg1Q9, Integer.parseInt(rafp13
			// .getAnswer1Q9()));
			// SwingUtils.setSelectedButton(bg1Q10, Integer.parseInt(rafp13
			// .getAnswer1Q10()));

			// SwingUtils.setSelectedButton(bg2Q1, Integer.parseInt(rafp13
			// .getAnswer2Q1()));
			// SwingUtils.setSelectedButton(bg2Q2, Integer.parseInt(rafp13
			// .getAnswer2Q2()));
			// SwingUtils.setSelectedButton(bg2Q3, Integer.parseInt(rafp13
			// .getAnswer2Q3()));
			// SwingUtils.setSelectedButton(bg2Q4, Integer.parseInt(rafp13
			// .getAnswer2Q4()));
			// SwingUtils.setSelectedButton(bg2Q5, Integer.parseInt(rafp13
			// .getAnswer2Q5()));
			// SwingUtils.setSelectedButton(bg2Q6, Integer.parseInt(rafp13
			// .getAnswer2Q6()));
			// SwingUtils.setSelectedButton(bg2Q7, Integer.parseInt(rafp13
			// .getAnswer2Q7()));
			// SwingUtils.setSelectedButton(bg2Q8, Integer.parseInt(rafp13
			// .getAnswer2Q8()));
			// SwingUtils.setSelectedButton(bg2Q9, Integer.parseInt(rafp13
			// .getAnswer2Q9()));
			// SwingUtils.setSelectedButton(bg2Q10, Integer.parseInt(rafp13
			// .getAnswer2Q10()));

			// SwingUtils.setSelectedButton(bg3Q1, Integer.parseInt(rafp13
			// .getAnswer3Q1()));
			// SwingUtils.setSelectedButton(bg3Q2, Integer.parseInt(rafp13
			// .getAnswer3Q2()));
			// SwingUtils.setSelectedButton(bg3Q3, Integer.parseInt(rafp13
			// .getAnswer3Q3()));
			// SwingUtils.setSelectedButton(bg3Q4, Integer.parseInt(rafp13
			// .getAnswer3Q4()));
			// SwingUtils.setSelectedButton(bg3Q5, Integer.parseInt(rafp13
			// .getAnswer3Q5()));
			// SwingUtils.setSelectedButton(bg3Q6, Integer.parseInt(rafp13
			// .getAnswer3Q6()));
			// SwingUtils.setSelectedButton(bg3Q7, Integer.parseInt(rafp13
			// .getAnswer3Q7()));
			// SwingUtils.setSelectedButton(bg3Q8, Integer.parseInt(rafp13
			// .getAnswer3Q8()));
			// SwingUtils.setSelectedButton(bg3Q9, Integer.parseInt(rafp13
			// .getAnswer3Q9()));
			// SwingUtils.setSelectedButton(bg3Q10, Integer.parseInt(rafp13
			// .getAnswer3Q10()));

		}

	}

	public int doSave() {
		ResidentAssessmentFormPage13 rafp13 = new ResidentAssessmentFormPage13();

		rafp13.setSerial(Global.currentResidentAssessmentFormPage13Key);
		rafp13.setFormId(Global.currentResidentAssessmentFormKey);

		rafp13.setNurseVisit(dcNurseVisit.getDate());
		rafp13.setNurse((String) cmbNurse.getSelectedItem());

		rafp13.setPhysician((String) cmbPhysician.getSelectedItem());
		rafp13.setRecordNum(txtRecordNum.getText());

		rafp13.setDateFactor1(dateChooser1.getDate());
		rafp13.setDetermination1(SwingUtils.getSelectedButton(bg1));

		rafp13.setDateFactor2(dateChooser2.getDate());
		rafp13.setDetermination2(SwingUtils.getSelectedButton(bg2));

		rafp13.setDateFactor3(dateChooser3.getDate());
		rafp13.setDetermination3(SwingUtils.getSelectedButton(bg3));

		rafp13.setDateFactor4(dateChooser4.getDate());
		rafp13.setDetermination4(SwingUtils.getSelectedButton(bg4));

		/* replicate for all button groups */
		// rafp13.setAnswer1Q1(SwingUtils.getSelectedButton(bg1Q1) + "");
		// rafp13.setAnswer1Q2(SwingUtils.getSelectedButton(bg1Q2) + "");
		// rafp13.setAnswer1Q3(SwingUtils.getSelectedButton(bg1Q3) + "");
		// rafp13.setAnswer1Q4(SwingUtils.getSelectedButton(bg1Q4) + "");
		// rafp13.setAnswer1Q5(SwingUtils.getSelectedButton(bg1Q5) + "");
		// rafp13.setAnswer1Q6(SwingUtils.getSelectedButton(bg1Q6) + "");
		// rafp13.setAnswer1Q7(SwingUtils.getSelectedButton(bg1Q7) + "");
		// rafp13.setAnswer1Q8(SwingUtils.getSelectedButton(bg1Q8) + "");
		// rafp13.setAnswer1Q9(SwingUtils.getSelectedButton(bg1Q9) + "");
		// rafp13.setAnswer1Q10(SwingUtils.getSelectedButton(bg1Q10) + "");
		//
		// rafp13.setAnswer2Q1(SwingUtils.getSelectedButton(bg2Q1) + "");
		// rafp13.setAnswer2Q2(SwingUtils.getSelectedButton(bg2Q2) + "");
		// rafp13.setAnswer2Q3(SwingUtils.getSelectedButton(bg2Q3) + "");
		// rafp13.setAnswer2Q4(SwingUtils.getSelectedButton(bg2Q4) + "");
		// rafp13.setAnswer2Q5(SwingUtils.getSelectedButton(bg2Q5) + "");
		// rafp13.setAnswer2Q6(SwingUtils.getSelectedButton(bg2Q6) + "");
		// rafp13.setAnswer2Q7(SwingUtils.getSelectedButton(bg2Q7) + "");
		// rafp13.setAnswer2Q8(SwingUtils.getSelectedButton(bg2Q8) + "");
		// rafp13.setAnswer2Q9(SwingUtils.getSelectedButton(bg2Q9) + "");
		// rafp13.setAnswer2Q10(SwingUtils.getSelectedButton(bg2Q10) + "");
		//
		// rafp13.setAnswer3Q1(SwingUtils.getSelectedButton(bg3Q1) + "");
		// rafp13.setAnswer3Q2(SwingUtils.getSelectedButton(bg3Q2) + "");
		// rafp13.setAnswer3Q3(SwingUtils.getSelectedButton(bg3Q3) + "");
		// rafp13.setAnswer3Q4(SwingUtils.getSelectedButton(bg3Q4) + "");
		// rafp13.setAnswer3Q5(SwingUtils.getSelectedButton(bg3Q5) + "");
		// rafp13.setAnswer3Q6(SwingUtils.getSelectedButton(bg3Q6) + "");
		// rafp13.setAnswer3Q7(SwingUtils.getSelectedButton(bg3Q7) + "");
		// rafp13.setAnswer3Q8(SwingUtils.getSelectedButton(bg3Q8) + "");
		// rafp13.setAnswer3Q9(SwingUtils.getSelectedButton(bg3Q9) + "");
		// rafp13.setAnswer3Q10(SwingUtils.getSelectedButton(bg3Q10) + "");
		rafp13.setAnswer4Q1(SwingUtils.getSelectedButton(bg4Q1) + "");
		rafp13.setAnswer4Q2(SwingUtils.getSelectedButton(bg4Q2) + "");
		rafp13.setAnswer4Q3(SwingUtils.getSelectedButton(bg4Q3) + "");
		rafp13.setAnswer4Q4(SwingUtils.getSelectedButton(bg4Q4) + "");
		rafp13.setAnswer4Q5(SwingUtils.getSelectedButton(bg4Q5) + "");
		rafp13.setAnswer4Q6(SwingUtils.getSelectedButton(bg4Q6) + "");
		rafp13.setAnswer4Q7(SwingUtils.getSelectedButton(bg4Q7) + "");
		rafp13.setAnswer4Q8(SwingUtils.getSelectedButton(bg4Q8) + "");
		rafp13.setAnswer4Q9(SwingUtils.getSelectedButton(bg4Q9) + "");
		rafp13.setAnswer4Q10(SwingUtils.getSelectedButton(bg4Q10) + "");

		rafp13.setResidentId(Global.currentResidenceKey);
		rafp13.setResidentName(lblResidentName.getText());
		rafp13.setRoomNo(lblRoomNum.getText());
		rafp13.setDateFactor4(dateChooser4.getDate());
		try {
			Global.currentResidentAssessmentFormPage13Key = MedrexClientManager
					.getInstance().insertOrUpdateResidentAssessmentFormPage13(
							rafp13);
			return (0);
		} catch (Exception e) {
			return (0);
		}
	}

	public boolean doValidate() {
		// TODO Auto-generated method stub
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;

		// if (!FieldValidation.isEmpty(temp =
		// FieldValidation.isNonEmptyAlphaField(
		// lblResidentName, "Resident Name", 0, 25))) {
		// vRes.addAllFrom(temp);
		// }
		if (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(
				cmbPhysician, "Physician"))) {
			vRes.addAllFrom(temp);
		}

		// System.out.println(FieldValidation.getMessages(vRes.getMessages()));
		if (!FieldValidation.isEmpty(vRes)) {
			FieldValidation.Msgbox(vRes, "Resident Assessment Form: Page 13");
			return false;
		} else {
			return true;
		}
	}

}
