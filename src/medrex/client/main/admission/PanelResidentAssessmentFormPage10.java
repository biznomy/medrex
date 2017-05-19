package medrex.client.main.admission;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldValidation;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.Form;
import medrex.commons.vo.admin.UserLogon;
import medrex.commons.vo.admission.ResidentAssessmentFormPage10;
import medrex.commons.vo.notes.Notes;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;

import org.jdesktop.jxlayer.JXLayer;
import org.jdesktop.jxlayer.plaf.effect.BufferedImageOpEffect;
import org.jdesktop.jxlayer.plaf.ext.LockableUI;

import com.jgoodies.validation.ValidationResult;
import com.jhlabs.image.GrayFilter;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxText;
import com.sX.swing.JxTextA;
import com.sX.swing.notes.JxNotes;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelResidentAssessmentFormPage10 extends JxPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3986676727585976884L;
	Theme theme = new BlackOverWhiteTheme();
	Font font = new Font("Arial", Font.PLAIN, 11);

	private JxText txtTotal;
	private JxPanel panelMain;
	private JxLabel lblRoom;
	private JxLabel lblResidentName;
	private JxDateChooser dcNurseVisit;
	private JxLabel dateLabel;
	private JxComboBox cmbNurse;
	private JxLabel ifSoWhatLabel;
	private JxPanel panel_9;
	private JxComboBox cmbCognition2;
	private JxComboBox cmbMobility;
	private JxComboBox cmbCognition;
	private JXLayer<JxPanel> layerContent;
	private LockableUI layerUI;

	boolean drawMode = false;
	int x;
	int y;

	private Container panel_38;
	private Notes notesPlanForCare;
	private JxNotes notes;
	// If true then categories list and label will display otherwise not.
	private boolean isCategories = true;

	public PanelResidentAssessmentFormPage10() {
		super();

		Global.panelResidentAssessmentFormPage10 = this;
		setLayout(null);

		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(930, 1200));

		final JxLabel incontinenceAssessmentLabel = new JxLabel();
		incontinenceAssessmentLabel.setTheme(theme);
		incontinenceAssessmentLabel.setFontSize(18);

		incontinenceAssessmentLabel.setFontStyle(Font.BOLD);
		incontinenceAssessmentLabel.setText("INCONTINENCE ASSESSMENT");
		incontinenceAssessmentLabel.setBounds(325, 50, 350, 16);
		add(incontinenceAssessmentLabel);

		final JxLabel residentNameLabel = new JxLabel();
		residentNameLabel.setTheme(theme);
		residentNameLabel.setText("Resident Name :");
		residentNameLabel.setBounds(192, 10, 86, 14);
		add(residentNameLabel);

		lblResidentName = new JxLabel();
		lblResidentName.setTheme(theme);

		lblResidentName.setFontStyle(Font.BOLD);
		lblResidentName.setBounds(300, 8, 186, 18);
		add(lblResidentName);

		final JxLabel roomLabel = new JxLabel();
		roomLabel.setTheme(theme);
		roomLabel.setText("Room # :");
		roomLabel.setBounds(518, 10, 54, 14);
		add(roomLabel);

		lblRoom = new JxLabel();
		lblRoom.setTheme(theme);

		lblRoom.setFontStyle(Font.BOLD);
		lblRoom.setBounds(578, 8, 77, 18);
		add(lblRoom);

		panelMain = new JxPanel();

		panelMain.setTheme(theme);

		panelMain.setBorder(new LineBorder(Color.black, 1, false));
		panelMain.setTheme (theme);

		panelMain.setPreferredSize(new Dimension(930, 1130));
		panelMain.setLayout(null);
		panelMain.setBounds(10, 56, 898, 1080);

		layerUI = new LockableUI(new BufferedImageOpEffect(new GrayFilter()));
		layerContent = new JXLayer<JxPanel>(panelMain);
		layerContent.setUI(layerUI);
		layerContent.setLayout(null);
		layerContent.setBounds(5, 60, 920, 1144);
		add(layerContent);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBounds(0, 0, 885, 1070);
		panelMain.add(panel);
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setLayout(null);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label
				.setText("11. Continence Management Programs ( Do not answer the question if question 9 is Yes or question 10 is No)");
		label.setBounds(26, 33, 663, 14);
		panel.add(label);

		final JxTextA determineWhichCharacteristicsTextArea = new JxTextA();
		determineWhichCharacteristicsTextArea.setTheme(theme);

		determineWhichCharacteristicsTextArea
				.setText("Determine which characteristics best describe resident's situation. Enter the corresponding number in the box at the bottom of each column. Match scoring to program recommendations.");

		determineWhichCharacteristicsTextArea.setWrapStyleWord(true);
		determineWhichCharacteristicsTextArea.setLineWrap(true);
		determineWhichCharacteristicsTextArea.setEditable(false);
		determineWhichCharacteristicsTextArea.setBounds(26, 70, 771, 32);
		panel.add(determineWhichCharacteristicsTextArea);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);

		panel_1.setLayout(null);
		panel_1.setBounds(10, 120, 277, 359);
		panel.add(panel_1);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setBorder(new LineBorder(Color.black, 1, false));

		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 277, 38);
		panel_1.add(panel_2);

		final JxLabel cognitionLabel = new JxLabel();
		cognitionLabel.setTheme(theme);

		cognitionLabel.setFontSize(12);
		cognitionLabel.setFontStyle(Font.BOLD);
		cognitionLabel.setText("Cognition");
		cognitionLabel.setBounds(100, 10, 107, 14);
		panel_2.add(cognitionLabel);

		final JxPanel panel_2_1 = new JxPanel();
		panel_2_1.setTheme(theme);
		panel_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1.setLayout(null);

		panel_2_1.setBounds(0, 37, 277, 38);
		panel_1.add(panel_2_1);

		final JxLabel cognitionLabel_1 = new JxLabel();
		cognitionLabel_1.setTheme(theme);

		cognitionLabel_1.setText("Unusual mental status");
		cognitionLabel_1.setBounds(80, 10, 122, 14);
		panel_2_1.add(cognitionLabel_1);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);

		panel_3.setLayout(null);
		panel_3.setBounds(0, 73, 277, 58);
		panel_1.add(panel_3);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);
		panel_4.setBorder(new LineBorder(Color.black, 1, false));

		panel_4.setLayout(null);
		panel_4.setBounds(0, 0, 50, 58);
		panel_3.add(panel_4);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);

		label_1.setFontSize(14);
		label_1.setText("4");
		label_1.setBounds(18, 18, 22, 22);
		panel_4.add(label_1);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setBorder(new LineBorder(Color.black, 1, false));

		panel_5.setLayout(null);
		panel_5.setBounds(45, 0, 232, 58);
		panel_3.add(panel_5);

		final JxTextA alertAndOrientedTextArea = new JxTextA();
		alertAndOrientedTextArea.setTheme(theme);

		alertAndOrientedTextArea.setText("Alert and Oriented");

		alertAndOrientedTextArea.setWrapStyleWord(true);
		alertAndOrientedTextArea.setEditable(false);
		alertAndOrientedTextArea.setLineWrap(true);
		alertAndOrientedTextArea.setBounds(10, 10, 212, 38);
		panel_5.add(alertAndOrientedTextArea);

		final JxPanel panel_3_1 = new JxPanel();
		panel_3_1.setTheme(theme);
		panel_3_1.setLayout(null);

		panel_3_1.setBounds(0, 127, 277, 58);
		panel_1.add(panel_3_1);

		final JxPanel panel_4_1 = new JxPanel();
		panel_4_1.setTheme(theme);
		panel_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1.setLayout(null);

		panel_4_1.setBounds(0, 0, 50, 58);
		panel_3_1.add(panel_4_1);

		final JxLabel label_1_1 = new JxLabel();
		label_1_1.setTheme(theme);

		label_1_1.setFontSize(14);
		label_1_1.setText("3");
		label_1_1.setBounds(18, 18, 22, 22);
		panel_4_1.add(label_1_1);

		final JxPanel panel_5_1 = new JxPanel();
		panel_5_1.setTheme(theme);
		panel_5_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1.setLayout(null);

		panel_5_1.setBounds(45, 0, 232, 58);
		panel_3_1.add(panel_5_1);

		final JxTextA alertAndOrientedTextArea_1 = new JxTextA();
		alertAndOrientedTextArea_1.setTheme(theme);

		alertAndOrientedTextArea_1.setWrapStyleWord(true);
		alertAndOrientedTextArea_1
				.setText("Forgetful, but can follow commands");
		alertAndOrientedTextArea_1.setLineWrap(true);
		alertAndOrientedTextArea_1.setEditable(false);

		alertAndOrientedTextArea_1.setBounds(10, 10, 212, 38);
		panel_5_1.add(alertAndOrientedTextArea_1);

		final JxPanel panel_3_1_1 = new JxPanel();
		panel_3_1_1.setTheme(theme);
		panel_3_1_1.setLayout(null);

		panel_3_1_1.setBounds(0, 181, 277, 58);
		panel_1.add(panel_3_1_1);

		final JxPanel panel_4_1_1 = new JxPanel();
		panel_4_1_1.setTheme(theme);
		panel_4_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1_1.setLayout(null);

		panel_4_1_1.setBounds(0, 0, 50, 58);
		panel_3_1_1.add(panel_4_1_1);

		final JxLabel label_1_1_1 = new JxLabel();
		label_1_1_1.setTheme(theme);

		label_1_1_1.setFontSize(14);
		label_1_1_1.setText("2");
		label_1_1_1.setBounds(18, 18, 22, 22);
		panel_4_1_1.add(label_1_1_1);

		final JxPanel panel_5_1_1 = new JxPanel();
		panel_5_1_1.setTheme(theme);
		panel_5_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1.setLayout(null);

		panel_5_1_1.setBounds(45, 0, 232, 58);
		panel_3_1_1.add(panel_5_1_1);

		final JxTextA alertAndOrientedTextArea_1_1 = new JxTextA();
		alertAndOrientedTextArea_1_1.setTheme(theme);

		alertAndOrientedTextArea_1_1.setWrapStyleWord(true);
		alertAndOrientedTextArea_1_1
				.setText("Mild confusion, but follows commands");
		alertAndOrientedTextArea_1_1.setLineWrap(true);
		alertAndOrientedTextArea_1_1.setEditable(false);

		alertAndOrientedTextArea_1_1.setBounds(10, 10, 212, 38);
		panel_5_1_1.add(alertAndOrientedTextArea_1_1);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);

		panel_8.setLayout(null);
		panel_8.setBounds(158, 485, 429, 32);
		panel.add(panel_8);

		final JxLabel totalLabel = new JxLabel();
		totalLabel.setTheme(theme);

		totalLabel.setBounds(0, 0, 65, 32);
		panel_8.add(totalLabel);
		totalLabel.setText("Total:");

		txtTotal = new JxText();
		txtTotal.setTheme(theme);

		txtTotal.setBounds(71, 6, 138, 21);
		panel_8.add(txtTotal);

		final JxPanel panel_3_1_1_1 = new JxPanel();
		panel_3_1_1_1.setTheme(theme);
		panel_3_1_1_1.setLayout(null);

		panel_3_1_1_1.setBounds(0, 236, 277, 58);
		panel_1.add(panel_3_1_1_1);

		final JxPanel panel_4_1_1_1 = new JxPanel();
		panel_4_1_1_1.setTheme(theme);
		panel_4_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1_1_1.setLayout(null);

		panel_4_1_1_1.setBounds(0, 0, 50, 58);
		panel_3_1_1_1.add(panel_4_1_1_1);

		final JxLabel label_1_1_1_1 = new JxLabel();
		label_1_1_1_1.setTheme(theme);

		label_1_1_1_1.setFontSize(14);
		label_1_1_1_1.setText("1");
		label_1_1_1_1.setBounds(18, 18, 22, 22);
		panel_4_1_1_1.add(label_1_1_1_1);

		final JxPanel panel_5_1_1_1 = new JxPanel();
		panel_5_1_1_1.setTheme(theme);
		panel_5_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1.setLayout(null);

		panel_5_1_1_1.setBounds(45, 0, 232, 58);
		panel_3_1_1_1.add(panel_5_1_1_1);

		final JxTextA alertAndOrientedTextArea_1_1_1 = new JxTextA();
		alertAndOrientedTextArea_1_1_1.setTheme(theme);

		alertAndOrientedTextArea_1_1_1.setWrapStyleWord(true);
		alertAndOrientedTextArea_1_1_1
				.setText("Confused, combative, comatose, or cannot follow commands");
		alertAndOrientedTextArea_1_1_1.setLineWrap(true);
		alertAndOrientedTextArea_1_1_1.setEditable(false);

		alertAndOrientedTextArea_1_1_1.setBounds(10, 10, 212, 38);
		panel_5_1_1_1.add(alertAndOrientedTextArea_1_1_1);

		cmbCognition = new JxComboBox();
		cmbCognition.setTheme(theme);

		cmbCognition.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				getTotal();
			}
		});
		cmbCognition.setBorder(new LineBorder(Color.black, 1, false));

		cmbCognition.setBounds(0, 293, 50, 56);
		panel_1.add(cmbCognition);

		final JxPanel panel_1_1 = new JxPanel();
		panel_1_1.setTheme(theme);
		panel_1_1.setLayout(null);

		panel_1_1.setBounds(300, 120, 277, 359);
		panel.add(panel_1_1);

		final JxPanel panel_2_2 = new JxPanel();
		panel_2_2.setTheme(theme);
		panel_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_2.setLayout(null);

		panel_2_2.setBounds(0, 0, 277, 38);
		panel_1_1.add(panel_2_2);

		final JxLabel cognitionLabel_2 = new JxLabel();
		cognitionLabel_2.setTheme(theme);

		cognitionLabel_2.setFontSize(12);
		cognitionLabel_2.setFontStyle(Font.BOLD);
		cognitionLabel_2.setText("Mobility");
		cognitionLabel_2.setBounds(100, 10, 107, 14);
		panel_2_2.add(cognitionLabel_2);

		final JxPanel panel_2_1_1 = new JxPanel();
		panel_2_1_1.setTheme(theme);
		panel_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1.setLayout(null);

		panel_2_1_1.setBounds(0, 37, 277, 38);
		panel_1_1.add(panel_2_1_1);

		final JxTextA alertAndOrientedTextArea_2_1 = new JxTextA();
		alertAndOrientedTextArea_2_1.setTheme(theme);

		alertAndOrientedTextArea_2_1.setWrapStyleWord(true);
		alertAndOrientedTextArea_2_1
				.setText("Can walk to bathroom, transfer to toilet; manage clothing, wipe, etc.");
		alertAndOrientedTextArea_2_1.setLineWrap(true);
		alertAndOrientedTextArea_2_1.setEditable(false);

		alertAndOrientedTextArea_2_1.setBounds(50, 4, 212, 30);
		panel_2_1_1.add(alertAndOrientedTextArea_2_1);

		final JxPanel panel_3_2 = new JxPanel();
		panel_3_2.setTheme(theme);
		panel_3_2.setLayout(null);

		panel_3_2.setBounds(0, 73, 277, 58);
		panel_1_1.add(panel_3_2);

		final JxPanel panel_4_2 = new JxPanel();
		panel_4_2.setTheme(theme);
		panel_4_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_2.setLayout(null);

		panel_4_2.setBounds(0, 0, 50, 58);
		panel_3_2.add(panel_4_2);

		final JxLabel label_1_2 = new JxLabel();
		label_1_2.setTheme(theme);

		label_1_2.setFontSize(14);
		label_1_2.setText("4");
		label_1_2.setBounds(18, 18, 22, 22);
		panel_4_2.add(label_1_2);

		final JxPanel panel_5_2 = new JxPanel();
		panel_5_2.setTheme(theme);
		panel_5_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2.setLayout(null);

		panel_5_2.setBounds(45, 0, 232, 58);
		panel_3_2.add(panel_5_2);

		final JxTextA alertAndOrientedTextArea_2 = new JxTextA();
		alertAndOrientedTextArea_2.setTheme(theme);

		alertAndOrientedTextArea_2.setWrapStyleWord(true);
		alertAndOrientedTextArea_2.setText("Alone, with reasonable speed");
		alertAndOrientedTextArea_2.setLineWrap(true);
		alertAndOrientedTextArea_2.setEditable(false);

		alertAndOrientedTextArea_2.setBounds(10, 10, 212, 38);
		panel_5_2.add(alertAndOrientedTextArea_2);

		final JxPanel panel_3_1_2 = new JxPanel();
		panel_3_1_2.setTheme(theme);
		panel_3_1_2.setLayout(null);

		panel_3_1_2.setBounds(0, 127, 277, 58);
		panel_1_1.add(panel_3_1_2);

		final JxPanel panel_4_1_2 = new JxPanel();
		panel_4_1_2.setTheme(theme);
		panel_4_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1_2.setLayout(null);

		panel_4_1_2.setBounds(0, 0, 50, 58);
		panel_3_1_2.add(panel_4_1_2);

		final JxLabel label_1_1_2 = new JxLabel();
		label_1_1_2.setTheme(theme);

		label_1_1_2.setFontSize(14);
		label_1_1_2.setText("3");
		label_1_1_2.setBounds(18, 18, 22, 22);
		panel_4_1_2.add(label_1_1_2);

		final JxPanel panel_5_1_2 = new JxPanel();
		panel_5_1_2.setTheme(theme);
		panel_5_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_2.setLayout(null);

		panel_5_1_2.setBounds(45, 0, 232, 58);
		panel_3_1_2.add(panel_5_1_2);

		final JxTextA alertAndOrientedTextArea_1_2 = new JxTextA();
		alertAndOrientedTextArea_1_2.setTheme(theme);

		alertAndOrientedTextArea_1_2.setWrapStyleWord(true);
		alertAndOrientedTextArea_1_2.setText("Alone, with verbal prompting");
		alertAndOrientedTextArea_1_2.setLineWrap(true);
		alertAndOrientedTextArea_1_2.setEditable(false);

		alertAndOrientedTextArea_1_2.setBounds(10, 10, 212, 38);
		panel_5_1_2.add(alertAndOrientedTextArea_1_2);

		final JxPanel panel_3_1_1_2 = new JxPanel();
		panel_3_1_1_2.setTheme(theme);
		panel_3_1_1_2.setLayout(null);

		panel_3_1_1_2.setBounds(0, 181, 277, 58);
		panel_1_1.add(panel_3_1_1_2);

		final JxPanel panel_4_1_1_2 = new JxPanel();
		panel_4_1_1_2.setTheme(theme);
		panel_4_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1_1_2.setLayout(null);

		panel_4_1_1_2.setBounds(0, 0, 50, 58);
		panel_3_1_1_2.add(panel_4_1_1_2);

		final JxLabel label_1_1_1_2 = new JxLabel();
		label_1_1_1_2.setTheme(theme);

		label_1_1_1_2.setFontSize(14);
		label_1_1_1_2.setText("2");
		label_1_1_1_2.setBounds(18, 18, 22, 22);
		panel_4_1_1_2.add(label_1_1_1_2);

		final JxPanel panel_5_1_1_2 = new JxPanel();
		panel_5_1_1_2.setTheme(theme);
		panel_5_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_2.setLayout(null);

		panel_5_1_1_2.setBounds(45, 0, 232, 58);
		panel_3_1_1_2.add(panel_5_1_1_2);

		final JxTextA alertAndOrientedTextArea_1_1_2 = new JxTextA();
		alertAndOrientedTextArea_1_1_2.setTheme(theme);

		alertAndOrientedTextArea_1_1_2.setWrapStyleWord(true);
		alertAndOrientedTextArea_1_1_2.setText("Needs assistance one side");
		alertAndOrientedTextArea_1_1_2.setLineWrap(true);
		alertAndOrientedTextArea_1_1_2.setEditable(false);

		alertAndOrientedTextArea_1_1_2.setBounds(10, 10, 212, 38);
		panel_5_1_1_2.add(alertAndOrientedTextArea_1_1_2);

		final JxPanel panel_3_1_1_1_1 = new JxPanel();
		panel_3_1_1_1_1.setTheme(theme);
		panel_3_1_1_1_1.setLayout(null);

		panel_3_1_1_1_1.setBounds(0, 236, 277, 58);
		panel_1_1.add(panel_3_1_1_1_1);

		final JxPanel panel_4_1_1_1_1 = new JxPanel();
		panel_4_1_1_1_1.setTheme(theme);
		panel_4_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1_1_1_1.setLayout(null);

		panel_4_1_1_1_1.setBounds(0, 0, 50, 58);
		panel_3_1_1_1_1.add(panel_4_1_1_1_1);

		final JxLabel label_1_1_1_1_1 = new JxLabel();
		label_1_1_1_1_1.setTheme(theme);

		label_1_1_1_1_1.setFontSize(14);
		label_1_1_1_1_1.setText("1");
		label_1_1_1_1_1.setBounds(18, 18, 22, 22);
		panel_4_1_1_1_1.add(label_1_1_1_1_1);

		final JxPanel panel_5_1_1_1_1 = new JxPanel();
		panel_5_1_1_1_1.setTheme(theme);
		panel_5_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1_1.setLayout(null);

		panel_5_1_1_1_1.setBounds(45, 0, 232, 58);
		panel_3_1_1_1_1.add(panel_5_1_1_1_1);

		final JxTextA alertAndOrientedTextArea_1_1_1_1 = new JxTextA();
		alertAndOrientedTextArea_1_1_1_1.setTheme(theme);

		alertAndOrientedTextArea_1_1_1_1.setWrapStyleWord(true);
		alertAndOrientedTextArea_1_1_1_1
				.setText("Immobile or needs assistance more than one side");
		alertAndOrientedTextArea_1_1_1_1.setLineWrap(true);
		alertAndOrientedTextArea_1_1_1_1.setEditable(false);

		alertAndOrientedTextArea_1_1_1_1.setBounds(10, 10, 212, 38);
		panel_5_1_1_1_1.add(alertAndOrientedTextArea_1_1_1_1);

		cmbMobility = new JxComboBox();
		cmbMobility.setTheme(theme);

		cmbMobility.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				getTotal();
			}
		});
		cmbMobility.setBorder(new LineBorder(Color.black, 1, false));

		cmbMobility.setBounds(0, 293, 50, 56);
		panel_1_1.add(cmbMobility);

		final JxPanel panel_1_1_1 = new JxPanel();
		panel_1_1_1.setTheme(theme);
		panel_1_1_1.setLayout(null);

		panel_1_1_1.setBounds(600, 120, 277, 359);
		panel.add(panel_1_1_1);

		final JxPanel panel_2_2_1 = new JxPanel();
		panel_2_2_1.setTheme(theme);
		panel_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_2_1.setLayout(null);

		panel_2_2_1.setBounds(0, 0, 277, 38);
		panel_1_1_1.add(panel_2_2_1);

		final JxLabel cognitionLabel_2_1 = new JxLabel();
		cognitionLabel_2_1.setTheme(theme);

		cognitionLabel_2_1.setFontSize(12);
		cognitionLabel_2_1.setFontStyle(Font.BOLD);
		cognitionLabel_2_1.setText("Cognition");
		cognitionLabel_2_1.setBounds(100, 10, 107, 14);
		panel_2_2_1.add(cognitionLabel_2_1);

		final JxPanel panel_2_1_1_1 = new JxPanel();
		panel_2_1_1_1.setTheme(theme);
		panel_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1.setLayout(null);

		panel_2_1_1_1.setBounds(0, 37, 277, 38);
		panel_1_1_1.add(panel_2_1_1_1);

		final JxTextA alertAndOrientedTextArea_2_1_1 = new JxTextA();
		alertAndOrientedTextArea_2_1_1.setTheme(theme);

		alertAndOrientedTextArea_2_1_1.setWrapStyleWord(true);
		alertAndOrientedTextArea_2_1_1
				.setText("Is aware of need / urge to void and / or defecate");
		alertAndOrientedTextArea_2_1_1.setLineWrap(true);
		alertAndOrientedTextArea_2_1_1.setEditable(false);

		alertAndOrientedTextArea_2_1_1.setBounds(50, 4, 212, 30);
		panel_2_1_1_1.add(alertAndOrientedTextArea_2_1_1);

		final JxPanel panel_3_2_1 = new JxPanel();
		panel_3_2_1.setTheme(theme);
		panel_3_2_1.setLayout(null);

		panel_3_2_1.setBounds(0, 73, 277, 58);
		panel_1_1_1.add(panel_3_2_1);

		final JxPanel panel_4_2_1 = new JxPanel();
		panel_4_2_1.setTheme(theme);
		panel_4_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_2_1.setLayout(null);

		panel_4_2_1.setBounds(0, 0, 50, 58);
		panel_3_2_1.add(panel_4_2_1);

		final JxLabel label_1_2_1 = new JxLabel();
		label_1_2_1.setTheme(theme);

		label_1_2_1.setFontSize(14);
		label_1_2_1.setText("4");
		label_1_2_1.setBounds(18, 18, 22, 22);
		panel_4_2_1.add(label_1_2_1);

		final JxPanel panel_5_2_1 = new JxPanel();
		panel_5_2_1.setTheme(theme);
		panel_5_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2_1.setLayout(null);

		panel_5_2_1.setBounds(45, 0, 232, 58);
		panel_3_2_1.add(panel_5_2_1);

		final JxTextA alertAndOrientedTextArea_2_2 = new JxTextA();
		alertAndOrientedTextArea_2_2.setTheme(theme);

		alertAndOrientedTextArea_2_2.setWrapStyleWord(true);
		alertAndOrientedTextArea_2_2.setText("Always");
		alertAndOrientedTextArea_2_2.setLineWrap(true);
		alertAndOrientedTextArea_2_2.setEditable(false);

		alertAndOrientedTextArea_2_2.setBounds(10, 10, 212, 38);
		panel_5_2_1.add(alertAndOrientedTextArea_2_2);

		final JxPanel panel_3_1_2_1 = new JxPanel();
		panel_3_1_2_1.setTheme(theme);
		panel_3_1_2_1.setLayout(null);

		panel_3_1_2_1.setBounds(0, 127, 277, 58);
		panel_1_1_1.add(panel_3_1_2_1);

		final JxPanel panel_4_1_2_1 = new JxPanel();
		panel_4_1_2_1.setTheme(theme);
		panel_4_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1_2_1.setLayout(null);

		panel_4_1_2_1.setBounds(0, 0, 50, 58);
		panel_3_1_2_1.add(panel_4_1_2_1);

		final JxLabel label_1_1_2_1 = new JxLabel();
		label_1_1_2_1.setTheme(theme);

		label_1_1_2_1.setFontSize(14);
		label_1_1_2_1.setText("3");
		label_1_1_2_1.setBounds(18, 18, 22, 22);
		panel_4_1_2_1.add(label_1_1_2_1);

		final JxPanel panel_5_1_2_1 = new JxPanel();
		panel_5_1_2_1.setTheme(theme);
		panel_5_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_2_1.setLayout(null);

		panel_5_1_2_1.setBounds(45, 0, 232, 58);
		panel_3_1_2_1.add(panel_5_1_2_1);

		final JxTextA alertAndOrientedTextArea_1_2_1 = new JxTextA();
		alertAndOrientedTextArea_1_2_1.setTheme(theme);

		alertAndOrientedTextArea_1_2_1.setWrapStyleWord(true);
		alertAndOrientedTextArea_1_2_1.setText("Two times a day");
		alertAndOrientedTextArea_1_2_1.setLineWrap(true);
		alertAndOrientedTextArea_1_2_1.setEditable(false);

		alertAndOrientedTextArea_1_2_1.setBounds(10, 10, 212, 38);
		panel_5_1_2_1.add(alertAndOrientedTextArea_1_2_1);

		final JxPanel panel_3_1_1_2_1 = new JxPanel();
		panel_3_1_1_2_1.setTheme(theme);
		panel_3_1_1_2_1.setLayout(null);

		panel_3_1_1_2_1.setBounds(0, 181, 277, 58);
		panel_1_1_1.add(panel_3_1_1_2_1);

		final JxPanel panel_4_1_1_2_1 = new JxPanel();
		panel_4_1_1_2_1.setTheme(theme);
		panel_4_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1_1_2_1.setLayout(null);

		panel_4_1_1_2_1.setBounds(0, 0, 50, 58);
		panel_3_1_1_2_1.add(panel_4_1_1_2_1);

		final JxLabel label_1_1_1_2_1 = new JxLabel();
		label_1_1_1_2_1.setTheme(theme);

		label_1_1_1_2_1.setFontSize(14);
		label_1_1_1_2_1.setText("2");
		label_1_1_1_2_1.setBounds(18, 18, 22, 22);
		panel_4_1_1_2_1.add(label_1_1_1_2_1);

		final JxPanel panel_5_1_1_2_1 = new JxPanel();
		panel_5_1_1_2_1.setTheme(theme);
		panel_5_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_2_1.setLayout(null);

		panel_5_1_1_2_1.setBounds(45, 0, 232, 58);
		panel_3_1_1_2_1.add(panel_5_1_1_2_1);

		final JxTextA alertAndOrientedTextArea_1_1_2_1 = new JxTextA();
		alertAndOrientedTextArea_1_1_2_1.setTheme(theme);

		alertAndOrientedTextArea_1_1_2_1.setWrapStyleWord(true);
		alertAndOrientedTextArea_1_1_2_1.setText("Less than two times per day");
		alertAndOrientedTextArea_1_1_2_1.setLineWrap(true);
		alertAndOrientedTextArea_1_1_2_1.setEditable(false);

		alertAndOrientedTextArea_1_1_2_1.setBounds(10, 10, 212, 38);
		panel_5_1_1_2_1.add(alertAndOrientedTextArea_1_1_2_1);

		cmbCognition2 = new JxComboBox();
		cmbCognition2.setTheme(theme);

		cmbCognition2.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				getTotal();
			}
		});
		cmbCognition2.setBorder(new LineBorder(Color.black, 1, false));

		cmbCognition2.setBounds(0, 237, 50, 56);
		panel_1_1_1.add(cmbCognition2);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setLayout(null);

		panel_6.setBounds(158, 526, 566, 117);
		panel.add(panel_6);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setBorder(new LineBorder(Color.black, 1, false));

		panel_7.setLayout(null);
		panel_7.setBounds(0, 0, 284, 30);
		panel_6.add(panel_7);

		final JxLabel resultLabel = new JxLabel();
		resultLabel.setTheme(theme);

		resultLabel.setFontSize(12);
		resultLabel.setFontStyle(Font.BOLD);
		resultLabel.setText("Result");
		resultLabel.setBounds(99, 10, 54, 14);
		panel_7.add(resultLabel);

		final JxPanel panel_7_1 = new JxPanel();
		panel_7_1.setTheme(theme);
		panel_7_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1.setLayout(null);

		panel_7_1.setBounds(281, 0, 284, 30);
		panel_6.add(panel_7_1);

		final JxLabel programRecommendationLabel = new JxLabel();
		programRecommendationLabel.setTheme(theme);

		programRecommendationLabel.setFontSize(12);
		programRecommendationLabel.setFontStyle(Font.BOLD);
		programRecommendationLabel.setBounds(64, 5, 210, 20);
		panel_7_1.add(programRecommendationLabel);
		programRecommendationLabel.setText("Program Recommendation");

		final JxPanel panel_7_2 = new JxPanel();
		panel_7_2.setTheme(theme);
		panel_7_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2.setLayout(null);

		panel_7_2.setBounds(0, 28, 284, 30);
		panel_6.add(panel_7_2);

		final JxLabel resultLabel_1 = new JxLabel();
		resultLabel_1.setTheme(theme);

		resultLabel_1.setText("9 - 12");
		resultLabel_1.setBounds(100, 10, 130, 14);
		panel_7_2.add(resultLabel_1);

		final JxPanel panel_7_2_1 = new JxPanel();
		panel_7_2_1.setTheme(theme);
		panel_7_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1.setLayout(null);

		panel_7_2_1.setBounds(281, 28, 284, 30);
		panel_6.add(panel_7_2_1);

		final JxLabel resultLabel_1_1 = new JxLabel();
		resultLabel_1_1.setTheme(theme);

		resultLabel_1_1.setText("Prompted Voiding / Toileting");
		resultLabel_1_1.setBounds(64, 10, 171, 14);
		panel_7_2_1.add(resultLabel_1_1);

		final JxPanel panel_7_2_2 = new JxPanel();
		panel_7_2_2.setTheme(theme);
		panel_7_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_2.setLayout(null);

		panel_7_2_2.setBounds(0, 56, 284, 30);
		panel_6.add(panel_7_2_2);

		final JxLabel resultLabel_1_2 = new JxLabel();
		resultLabel_1_2.setTheme(theme);

		resultLabel_1_2.setText("6-8");
		resultLabel_1_2.setBounds(100, 10, 130, 14);
		panel_7_2_2.add(resultLabel_1_2);

		final JxPanel panel_7_2_2_1 = new JxPanel();
		panel_7_2_2_1.setTheme(theme);
		panel_7_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_2_1.setLayout(null);

		panel_7_2_2_1.setBounds(281, 56, 284, 30);
		panel_6.add(panel_7_2_2_1);

		final JxLabel resultLabel_1_2_1 = new JxLabel();
		resultLabel_1_2_1.setTheme(theme);

		resultLabel_1_2_1.setText("");
		resultLabel_1_2_1.setBounds(64, 10, 130, 14);
		panel_7_2_2_1.add(resultLabel_1_2_1);

		final JxPanel panel_7_2_2_2 = new JxPanel();
		panel_7_2_2_2.setTheme(theme);
		panel_7_2_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_2_2.setLayout(null);

		panel_7_2_2_2.setBounds(0, 83, 284, 30);
		panel_6.add(panel_7_2_2_2);

		final JxLabel resultLabel_1_2_2 = new JxLabel();
		resultLabel_1_2_2.setTheme(theme);

		resultLabel_1_2_2.setText("1-5");
		resultLabel_1_2_2.setBounds(100, 10, 130, 14);
		panel_7_2_2_2.add(resultLabel_1_2_2);

		final JxPanel panel_7_2_2_2_1 = new JxPanel();
		panel_7_2_2_2_1.setTheme(theme);
		panel_7_2_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_2_2_1.setLayout(null);

		panel_7_2_2_2_1.setBounds(281, 83, 284, 30);
		panel_6.add(panel_7_2_2_2_1);

		final JxLabel resultLabel_1_2_2_1 = new JxLabel();
		resultLabel_1_2_2_1.setTheme(theme);

		resultLabel_1_2_2_1.setText("Absorbant Products");
		resultLabel_1_2_2_1.setBounds(64, 10, 130, 14);
		panel_7_2_2_2_1.add(resultLabel_1_2_2_1);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);

		label_2.setText("12. Care plan recommendations based on assessment :");
		label_2.setBounds(39, 680, 663, 14);
		panel.add(label_2);

		final JxLabel aProgramLabel = new JxLabel();
		aProgramLabel.setTheme(theme);

		aProgramLabel.setText("A. Program:");
		aProgramLabel.setBounds(49, 700, 112, 14);
		panel.add(aProgramLabel);

		final JxTextA anyAdditionalConsiderationsTextArea = new JxTextA();
		anyAdditionalConsiderationsTextArea.setTheme(theme);

		anyAdditionalConsiderationsTextArea.setEditable(false);
		anyAdditionalConsiderationsTextArea.setWrapStyleWord(true);
		anyAdditionalConsiderationsTextArea.setLineWrap(true);
		anyAdditionalConsiderationsTextArea
				.setText("B. Any Additional considerations for plan of care (e.g., hemorrhoids, pain, medications that affect continence, diuretics, Parkinson's disopyramide, antispasmodics, antihistamines, drugs that stimulate or block sympathetic nervous system, calcium channel blockers, narcotic; current or recent UTI, depression ):");
		anyAdditionalConsiderationsTextArea.setBounds(49, 720, 725, 56);
		panel.add(anyAdditionalConsiderationsTextArea);

		panel_9 = new JxPanel();
		panel_9.setTheme(theme);
		panel_9.setLayout(null);

		panel_9.setBounds(42, 1022, 732, 30);
		panel.add(panel_9);

		ifSoWhatLabel = new JxLabel();
		ifSoWhatLabel.setTheme(theme);

		ifSoWhatLabel.setText("Nurse Signature:");
		ifSoWhatLabel.setBounds(21, 5, 91, 16);
		panel_9.add(ifSoWhatLabel);

		cmbNurse = new JxComboBox();
		cmbNurse.setTheme(theme);

		cmbNurse.setBounds(123, 4, 205, 20);
		panel_9.add(cmbNurse);

		dateLabel = new JxLabel();
		dateLabel.setTheme(theme);

		dateLabel.setText("Date :");
		dateLabel.setBounds(421, 5, 30, 16);
		panel_9.add(dateLabel);

		dcNurseVisit = new JxDateChooser();
		dcNurseVisit.setTheme(theme);

		dcNurseVisit.setDate(MedrexClientManager.getServerTime());
		dcNurseVisit.setDateFormatString("MM/dd/yyyy");
		dcNurseVisit.setBounds(454, 1, 168, 26);
		panel_9.add(dcNurseVisit);

		final JxPanel panel_10 = new JxPanel();
		panel_10.setTheme(theme);

		panel_10.setLayout(null);
		panel_10.setBounds(46, 795, 725, 221);
		panel.add(panel_10);

		notesPlanForCare = new Notes();
		notesPlanForCare.setFormName("Resident Assessment Form");
		notesPlanForCare.setUserId(Global.currentLoggedInUserKey);
		notesPlanForCare.setNoteText("");

		notes = new JxNotes(isCategories);
		notes.setFont(font);
		notes.setNotes(notesPlanForCare);
		notes.setBorder(new LineBorder(Color.black, 1, false));
		notes.setBounds(0, 0, 715, 215);
		panel_10.add(notes);

		doLoad();

	}

	public void doLoad() {
		fillCombos();
		doUpdate();
		if (Global.panelResidentAssessmentFormPage9 != null) {
			PanelResidentAssessmentFormPage9 refp9 = Global.panelResidentAssessmentFormPage9;
			if (refp9.cbNA.isSelected() && refp9 != null) {
				layerUI.setLocked(true);
			} else {
				layerUI.setLocked(false);
			}
		} else {
			layerUI.setLocked(false);
		}
	}

	private void getTotal() {
		int total = 0;
		if (!(cmbCognition.getSelectedItem().toString().equalsIgnoreCase(""))) {
			total += Integer.parseInt(cmbCognition.getSelectedItem() + "");
		}
		if (!(cmbMobility.getSelectedItem().toString().equalsIgnoreCase(""))) {
			total += Integer.parseInt(cmbMobility.getSelectedItem() + "");
		}
		if (!(cmbCognition2.getSelectedItem().toString().equalsIgnoreCase(""))) {
			total += Integer.parseInt(cmbCognition2.getSelectedItem() + "");
		}
		txtTotal.setText(total + "");
	}

	public void fillCombos() {
		cmbCognition.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "", "1", "2", "3", "4" }));
		cmbMobility.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"", "1", "2", "3", "4" }));
		cmbCognition2.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "", "2", "3", "4" }));

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
		cmbNurse.addItem(user.getUserName());
	}

	public void doUpdate() {
		int resId = Global.currentResidenceKey;
		TempRoomHistory roomHist = null;
		ResidentMain rm = null;
		try {
			rm = MedrexClientManager.getInstance().getResident(resId);
			roomHist = MedrexClientManager.getInstance()
					.getCurrentRoomForResident(resId);
		} catch (Exception e) {
		}
		lblResidentName.setText(rm.getUserPass() + " " + rm.getUserName());
		/* TODO: Migrating to room history */
		// txtRoom.setText(rm.getRoom());
		if (roomHist != null) {
			lblRoom.setText(roomHist.getRoom());
		}
		if (Global.currentResidentAssessmentFormKey == 0) {
			Global.currentResidentAssessmentFormPage10Key = 0;

			cmbCognition.setSelectedItem("");
			cmbMobility.setSelectedItem("");
			cmbCognition2.setSelectedItem("");
			notes.setNotes(notesPlanForCare);

			/*
			 * Users users = null;
			 * 
			 * try { users =MedrexClientManager.getInstance().getUser(Global.
			 * currentLoggedInUserKey);
			 * 
			 * if (users.getUserType().equalsIgnoreCase("Nurse")) {
			 * 
			 * Nurse n = (Nurse)
			 * MedrexClientManager.getInstance().getNurseRecord(users
			 * .getSerial());
			 * 
			 * cmbNurse.removeAllItems();
			 * 
			 * cmbNurse.addItem(n.getNurseName() + " " + n.getNurseSurName());
			 * 
			 * }
			 * 
			 * else { cmbNurse.removeAllItems();
			 * 
			 * cmbNurse.addItem(""); } } catch (Exception e) {
			 * e.printStackTrace(); }
			 */

		} else {
			ResidentAssessmentFormPage10 rafp10 = null;
			try {
				rafp10 = MedrexClientManager.getInstance()
						.getResidentAssessmentFormPage10(
								Global.currentResidentAssessmentFormKey);
			} catch (Exception e) {

			}
			Global.currentResidentAssessmentFormPage10Key = rafp10.getSerial();

			dcNurseVisit.setDate(rafp10.getNurseVisit());
			cmbNurse.setSelectedItem(rafp10.getNurse());

			cmbCognition.setSelectedItem(rafp10.getAnswerCognition());
			cmbMobility.setSelectedItem(rafp10.getAnswerMobility());
			cmbCognition2.setSelectedItem(rafp10.getAnswerCognition2());
			notes.setNotes(rafp10.getNotes());
		}
	}

	public int doSave() {
		ResidentAssessmentFormPage10 rafp10 = new ResidentAssessmentFormPage10();

		rafp10.setSerial(Global.currentResidentAssessmentFormPage10Key);
		rafp10.setFormId(Global.currentResidentAssessmentFormKey);

		rafp10.setNurseVisit(dcNurseVisit.getDate());
		rafp10.setNurse((String) cmbNurse.getSelectedItem());

		rafp10.setAnswerCognition((String) cmbCognition.getSelectedItem());
		rafp10.setAnswerCognition2((String) cmbCognition2.getSelectedItem());
		rafp10.setAnswerMobility((String) cmbMobility.getSelectedItem());
		notes.setNotes(notes.getNotes());
		try {
			Global.currentResidentAssessmentFormPage10Key = MedrexClientManager
					.getInstance().insertOrUpdateResidentAssessmentFormPage10(
							rafp10);
			return (0);
		} catch (Exception e) {
			return (0);

		}
	}

	public boolean doValidate() {
		// TODO Auto-generated method stub
		ValidationResult vRes = new ValidationResult();
		// System.out.println(FieldValidation.getMessages(vRes.getMessages()));
		if (!FieldValidation.isEmpty(vRes)) {
			FieldValidation.Msgbox(vRes, "Resident Assessment Form: Page 10");
			return false;
		} else {
			return true;
		}
	}

	public void setEnable(boolean b) {
		if (b == true) {
			System.out.println("bool is:" + b);
			cmbCognition2.setEnabled(true);
			cmbMobility.setEnabled(true);
			// cmbNurse.setEnabled(true);
			// dcNurseVisit.setEnabled(true);
			cmbCognition.setEnabled(true);
		} else {
			System.out.println("bool in false is:" + b);
			cmbCognition2.setEnabled(false);
			cmbMobility.setEnabled(false);
			// cmbNurse.setEnabled(false);
			// dcNurseVisit.setEnabled(false);
			cmbCognition.setEnabled(false);
		}
	}

}
