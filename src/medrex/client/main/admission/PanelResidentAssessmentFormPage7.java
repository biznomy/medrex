package medrex.client.main.admission;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Iterator;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldValidation;
import medrex.client.utils.SwingUtils;
import medrex.commons.intf.Form;
import medrex.commons.vo.admission.ResidentAssessmentFormPage7;
import medrex.commons.vo.others.Nurse;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;

import org.jdesktop.jxlayer.JXLayer;
import org.jdesktop.jxlayer.plaf.ext.LockableUI;

import com.jgoodies.validation.ValidationResult;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxPopUpButton;
import com.sX.swing.JxRadioButton;
import com.sX.swing.JxTextA;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelResidentAssessmentFormPage7 extends JxPanel implements Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = 284706853024986277L;

	Theme theme = new BlackOverWhiteTheme();

	private JxRadioButton rbNumericalScale;
	private ButtonGroup bgScale = new ButtonGroup();
	private JxPanel panelHuman;
	private JxRadioButton rbQ6Behavioral;
	private JxRadioButton rbQ6Word;
	private JxPanel panel_4;
	private JxLabel informationObtainedFromLabel;
	private JxPanel panel_2_1_1_1_1;
	private final Color COLOR_HIGH = new Color(255, 102, 102);
	private final Color COLOR_NORM = Color.WHITE;
	private final Border BORDER_HIGH = new LineBorder(COLOR_HIGH, 1, false);
	private Border BORDER_NORM; // = new LineBorder(Color.BLACK,1 , false);
	private boolean stillHasFocus = false;

	private JxLabel lblHumanImg;
	private JxDateChooser dcNurseVisit;
	private JxLabel dateLabel;
	private JxComboBox cmbNurse;
	private JxLabel ifSoWhatLabel;
	private JxPanel panel_7;
	private JxRadioButton rbPainQ5Family;
	private JxRadioButton rbPainQ5Nurse;
	private JxRadioButton rbQ5Resident;
	// private JxCheckBox cbPainQ4Unable;
	private JxRadioButton rbPainQ4No;
	private JxRadioButton rbPainQ4Yes;
	private JxRadioButton rbPainQ3No;
	private JxRadioButton rbPainQ3Yes;
	private JxRadioButton rbPainQ2No;
	private JxRadioButton rbPainQ2Yes;
	private ButtonGroup bgQ6 = new ButtonGroup();
	private ButtonGroup bgQ5 = new ButtonGroup();
	private ButtonGroup bgQ4 = new ButtonGroup();
	private ButtonGroup bgQ3 = new ButtonGroup();
	private ButtonGroup bgQ2 = new ButtonGroup();
	private ButtonGroup bgQ1 = new ButtonGroup();

	private JxRadioButton rbPainQ1Yes;
	private JxRadioButton rbPainQ1No;

	private JxPopUpButton btnWorst;
	private JxPopUpButton btnBest;
	private JxPopUpButton btnPresent;
	private JxComboBox cmbPainLevel;

	// private JxComboBox cmbLocation;
	// private JxText txtOrigin;

	private JxLabel lblResidentName;
	private JxLabel lblRoomNum;
	private JxLabel lblCross;
	private int xCor;
	private int yCor;
	private JXLayer<JxPanel> layerContent;
	private LockableUI layerUI;
	private JxPanel panel_3;
	private JxLabel lbl;

	public int getXCor() {
		return xCor;
	}

	public void setXCor(int cor) {
		xCor = cor;
	}

	public int getYCor() {
		return yCor;
	}

	public void setYCor(int cor) {
		yCor = cor;
	}

	private static ImageIcon humanImg[] = new ImageIcon[] {
			new ImageIcon("img/human1/0.gif"), // 0
			new ImageIcon("img/human1/1.jpg"), // 1
			new ImageIcon("img/human1/2.jpg"), // 2
			new ImageIcon("img/human1/3.jpg"), // 3
			new ImageIcon("img/human1/4.jpg"), // 4
			new ImageIcon("img/human1/5.jpg"), // 5
			new ImageIcon("img/human1/6.jpg"), // 6
			new ImageIcon("img/human1/7.jpg"), // 7
			new ImageIcon("img/human1/8.jpg"), // 8
			new ImageIcon("img/human1/9.jpg"), // 9
			new ImageIcon("img/human1/10.jpg"), // 10
			new ImageIcon("img/human1/11.jpg"), // 11
			new ImageIcon("img/human1/12.jpg"), // 12
			new ImageIcon("img/human1/13.jpg"), // 13
			new ImageIcon("img/human1/14.jpg"), // 14
			new ImageIcon("img/human1/15.jpg"), // 15
			new ImageIcon("img/human1/16.jpg"), // 16
			new ImageIcon("img/human1/17.jpg"), // 17
			new ImageIcon("img/human1/18.jpg"), // 18
			new ImageIcon("img/human1/19.jpg"), // 19
			new ImageIcon("img/human1/20.jpg") // 20

	};

	PanelPainAssessment panelPainAssessmentArr[];
	private short MAX_COL = 5;
	private PanelPainAssessment currentColumn;

	public PanelResidentAssessmentFormPage7() {
		super();

		Global.panelResidentAssessmentFormPage7 = this;
		setLayout(null);
		setBorder(new LineBorder(Color.black, 1, true));
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(930, 1000));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBackground(Color.BLACK);
		panel.setLayout(null);
		panel.setBounds(0, 0, 925, 26);
		add(panel);

		final JxLabel fallRiskAssessmentLabel = new JxLabel();
		fallRiskAssessmentLabel.setTheme(theme);
		fallRiskAssessmentLabel.setForeground(new Color(255, 255, 255));
		fallRiskAssessmentLabel.setFontSize(14);
		fallRiskAssessmentLabel.setFontStyle(Font.BOLD);
		fallRiskAssessmentLabel.setText("PAIN ASSESSMENT");
		fallRiskAssessmentLabel.setBounds(389, 0, 187, 26);
		fallRiskAssessmentLabel.setTheme(theme);
		panel.add(fallRiskAssessmentLabel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBorder(new LineBorder(Color.black, 1, false));

		panel_1.setLayout(null);
		panel_1.setBounds(0, 26, 925, 287);
		add(panel_1);

		final JxLabel residentNameLabel = new JxLabel();
		residentNameLabel.setTheme(theme);

		residentNameLabel.setText("Resident Name :");
		residentNameLabel.setBounds(10, 10, 95, 16);
		panel_1.add(residentNameLabel);

		lblResidentName = new JxLabel();
		lblResidentName.setTheme(theme);
		lblResidentName.setFontStyle(Font.BOLD);

		// lblResidentName.setEditable(false);
		lblResidentName.setBounds(111, 8, 196, 20);
		panel_1.add(lblResidentName);

		final JxLabel roomNoLabel = new JxLabel();
		roomNoLabel.setTheme(theme);

		roomNoLabel.setText("Room No.");
		roomNoLabel.setFontStyle(Font.BOLD);
		roomNoLabel.setBounds(420, 10, 66, 16);
		panel_1.add(roomNoLabel);

		lblRoomNum = new JxLabel();
		lblRoomNum.setTheme(theme);
		lblRoomNum.setFontStyle(Font.BOLD);

		// lblRoomNum.setEditable(false);
		lblRoomNum.setBounds(497, 8, 148, 20);
		panel_1.add(lblRoomNum);

		final JxTextA directionsCompleteQuestionsTextArea = new JxTextA();
		directionsCompleteQuestionsTextArea.setTheme(theme);

		directionsCompleteQuestionsTextArea
				.setText("Directions:   Complete questions 1 through 4 for pain screen. When there is evidence of pain greater than 0 on pain rating, proceed with completion of entire assessment. Whenever possible, indicate the resident's exact words. If the resident is unable to answer the questions, whenever possible, involve family and/or legal representatives who are familiar with the resident and indicate the person providing answers.");
		directionsCompleteQuestionsTextArea.setWrapStyleWord(true);
		directionsCompleteQuestionsTextArea.setLineWrap(true);
		directionsCompleteQuestionsTextArea.setBounds(10, 48, 824, 57);
		panel_1.add(directionsCompleteQuestionsTextArea);

		final JxLabel oneFormShouldLabel = new JxLabel();
		oneFormShouldLabel.setTheme(theme);

		oneFormShouldLabel
				.setText("One Form should be used for each area of pain.");
		oneFormShouldLabel.setBounds(10, 109, 358, 18);
		panel_1.add(oneFormShouldLabel);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setLayout(null);

		panel_2.setBounds(10, 140, 500, 26);
		panel_1.add(panel_2);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setText("1. Do you have any pain now ?");
		label.setBounds(10, 5, 295, 16);
		panel_2.add(label);

		rbPainQ1Yes = new JxRadioButton();
		rbPainQ1Yes.setTheme(theme);

		bgQ1.add(rbPainQ1Yes);
		rbPainQ1Yes.setActionCommand("1");

		rbPainQ1Yes.setText("Yes");
		rbPainQ1Yes.setBounds(360, 1, 57, 24);
		panel_2.add(rbPainQ1Yes);

		rbPainQ1No = new JxRadioButton();
		rbPainQ1No.setTheme(theme);

		bgQ1.add(rbPainQ1No);
		rbPainQ1No.setActionCommand("2");

		rbPainQ1No.setText("No");
		rbPainQ1No.setBounds(437, 1, 57, 24);
		panel_2.add(rbPainQ1No);

		final JxPanel panel_2_1 = new JxPanel();
		panel_2_1.setTheme(theme);
		panel_2_1.setLayout(null);

		panel_2_1.setBounds(10, 164, 500, 26);
		panel_1.add(panel_2_1);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);

		label_1.setText("2. Have you recently been medicated for pain ?");
		label_1.setBounds(10, 5, 295, 16);
		panel_2_1.add(label_1);

		rbPainQ2Yes = new JxRadioButton();
		rbPainQ2Yes.setTheme(theme);

		bgQ2.add(rbPainQ2Yes);

		rbPainQ2Yes.setActionCommand("1");
		rbPainQ2Yes.setText("Yes");
		rbPainQ2Yes.setBounds(360, 1, 57, 24);
		panel_2_1.add(rbPainQ2Yes);

		rbPainQ2No = new JxRadioButton();
		rbPainQ2No.setTheme(theme);

		bgQ2.add(rbPainQ2No);

		rbPainQ2No.setActionCommand("2");
		rbPainQ2No.setText("No");
		rbPainQ2No.setBounds(437, 1, 57, 24);
		panel_2_1.add(rbPainQ2No);

		final JxPanel panel_2_1_1 = new JxPanel();
		panel_2_1_1.setTheme(theme);
		panel_2_1_1.setLayout(null);

		panel_2_1_1.setBounds(10, 189, 500, 26);
		panel_1.add(panel_2_1_1);

		final JxLabel label_1_1 = new JxLabel();
		label_1_1.setTheme(theme);

		label_1_1
				.setText("3. Have you experienced pain in the last 3 months ?");
		label_1_1.setBounds(10, 5, 344, 16);
		panel_2_1_1.add(label_1_1);

		rbPainQ3Yes = new JxRadioButton();
		rbPainQ3Yes.setTheme(theme);

		bgQ3.add(rbPainQ3Yes);

		rbPainQ3Yes.setActionCommand("1");
		rbPainQ3Yes.setText("Yes");
		rbPainQ3Yes.setBounds(360, 1, 57, 24);
		panel_2_1_1.add(rbPainQ3Yes);

		rbPainQ3No = new JxRadioButton();
		rbPainQ3No.setTheme(theme);

		bgQ3.add(rbPainQ3No);

		rbPainQ3No.setActionCommand("2");
		rbPainQ3No.setText("No");
		rbPainQ3No.setBounds(437, 1, 57, 24);
		panel_2_1_1.add(rbPainQ3No);

		final JxPanel panel_2_1_1_1 = new JxPanel();
		panel_2_1_1_1.setTheme(theme);
		panel_2_1_1_1.setLayout(null);

		panel_2_1_1_1.setBounds(10, 214, 500, 26);
		panel_1.add(panel_2_1_1_1);

		final JxLabel label_1_1_1 = new JxLabel();
		label_1_1_1.setTheme(theme);

		label_1_1_1.setText("4. Are routine of PRN medications ordered?");
		label_1_1_1.setBounds(10, 5, 344, 16);
		panel_2_1_1_1.add(label_1_1_1);

		rbPainQ4Yes = new JxRadioButton();
		rbPainQ4Yes.setTheme(theme);

		bgQ4.add(rbPainQ4Yes);

		rbPainQ4Yes.setActionCommand("1");
		rbPainQ4Yes.setText("Yes");
		rbPainQ4Yes.setBounds(360, 1, 57, 24);
		panel_2_1_1_1.add(rbPainQ4Yes);

		rbPainQ4No = new JxRadioButton();
		rbPainQ4No.setTheme(theme);

		bgQ4.add(rbPainQ4No);

		rbPainQ4No.setActionCommand("2");
		rbPainQ4No.setText("No");
		rbPainQ4No.setBounds(437, 1, 57, 24);
		panel_2_1_1_1.add(rbPainQ4No);

		final JxLabel ifNoToLabel = new JxLabel();
		ifNoToLabel.setTheme(theme);

		ifNoToLabel
				.setText("If NO to all questions above STOP here. Otherwise continue");
		ifNoToLabel.setBounds(15, 261, 567, 16);
		panel_1.add(ifNoToLabel);

		/*
		 * cbPainQ4Unable = new JxCheckBox(); cbPainQ4Unable.setTheme (theme);
		 * cbPainQ4Unable.addMouseListener(new MouseAdapter() { public void
		 * mouseClicked(final MouseEvent e) { if (cbPainQ4Unable.isSelected()) {
		 * enablePage(); rbPainQ1No.setEnabled(false);
		 * rbPainQ1Yes.setEnabled(false); rbPainQ2No.setEnabled(false);
		 * rbPainQ2Yes.setEnabled(false); rbPainQ3No.setEnabled(false);
		 * rbPainQ3Yes.setEnabled(false); rbPainQ4No.setEnabled(false);
		 * rbPainQ4Yes.setEnabled(false); bgQ1.clearSelection();
		 * bgQ2.clearSelection(); bgQ3.clearSelection(); bgQ4.clearSelection();
		 * } else { disablePage(); rbPainQ1No.setEnabled(true);
		 * rbPainQ1Yes.setEnabled(true); rbPainQ2No.setEnabled(true);
		 * rbPainQ2Yes.setEnabled(true); rbPainQ3No.setEnabled(true);
		 * rbPainQ3Yes.setEnabled(true); rbPainQ4No.setEnabled(true);
		 * rbPainQ4Yes.setEnabled(true); } } }); cbPainQ4Unable.setBounds(516,
		 * 140, 116, 100); panel_1.add(cbPainQ4Unable);
		 * 
		 * cbPainQ4Unable.setActionCommand("3");
		 * cbPainQ4Unable.setText("Unable to answer");
		 */
		panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setLayout(null);

		panel_7.setBounds(10, 964, 900, 30);
		add(panel_7);

		ifSoWhatLabel = new JxLabel();
		ifSoWhatLabel.setTheme(theme);

		ifSoWhatLabel.setText("Nurse Signature:");
		ifSoWhatLabel.setBounds(21, 5, 91, 16);
		panel_7.add(ifSoWhatLabel);

		cmbNurse = new JxComboBox();
		cmbNurse.setTheme(theme);

		cmbNurse.setBounds(123, 4, 205, 20);
		panel_7.add(cmbNurse);

		dateLabel = new JxLabel();
		dateLabel.setTheme(theme);

		dateLabel.setText("Date :");
		dateLabel.setBounds(558, 5, 42, 16);
		panel_7.add(dateLabel);

		dcNurseVisit = new JxDateChooser();
		dcNurseVisit.setTheme(theme);

		dcNurseVisit.setDate(MedrexClientManager.getServerTime());
		dcNurseVisit.setDateFormatString("MM/dd/yyyy");
		dcNurseVisit.setBounds(591, 1, 168, 26);
		panel_7.add(dcNurseVisit);

		final PanelloggedInUser panel_6 = new PanelloggedInUser();

		panel_6.setBounds(119, 2, 294, 23);
		panel_7.add(panel_6);

		final JxPanel panelNew = new JxPanel();
		panelNew.setTheme(theme);
		panelNew.setBounds(0, 0, 120, 30);
		add(panelNew);

		panelNew.setBorder(new LineBorder(Color.black, 1, false));
		panelNew.setLayout(null);

		panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setBounds(0, 314, 925, 644);

		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setLayout(null);
		add(panel_3);
		// layerUI = new LockableUI(new BufferedImageOpEffect(new
		// GrayFilter()));
		// layerContent = new JXLayer<JxPanel>(panel_3);
		// // layerContent.getGlassPane().add(panelMain);
		// layerContent.setUI(layerUI);
		// layerContent.setLayout(null);
		// layerContent.setBounds(0, 346, 925, 705);
		// add(layerContent);

		panel_2_1_1_1_1 = new JxPanel();
		panel_2_1_1_1_1.setTheme(theme);
		panel_2_1_1_1_1.setLayout(null);

		panel_2_1_1_1_1.setBounds(7, 5, 432, 26);
		panel_3.add(panel_2_1_1_1_1);

		informationObtainedFromLabel = new JxLabel();
		informationObtainedFromLabel.setTheme(theme);

		informationObtainedFromLabel.setFontSize(12);
		informationObtainedFromLabel.setFontStyle(Font.BOLD);
		informationObtainedFromLabel.setText("Information obtained from :");
		informationObtainedFromLabel.setBounds(10, 5, 166, 16);
		panel_2_1_1_1_1.add(informationObtainedFromLabel);

		rbQ5Resident = new JxRadioButton();
		rbQ5Resident.setTheme(theme);

		bgQ5.add(rbQ5Resident);

		rbQ5Resident.setActionCommand("1");
		rbQ5Resident.setText("Resident");
		rbQ5Resident.setBounds(167, 1, 75, 24);
		panel_2_1_1_1_1.add(rbQ5Resident);

		rbPainQ5Nurse = new JxRadioButton();
		rbPainQ5Nurse.setTheme(theme);

		bgQ5.add(rbPainQ5Nurse);

		rbPainQ5Nurse.setActionCommand("2");
		rbPainQ5Nurse.setText("Nurse");
		rbPainQ5Nurse.setBounds(247, 1, 75, 24);
		panel_2_1_1_1_1.add(rbPainQ5Nurse);

		rbPainQ5Family = new JxRadioButton();
		rbPainQ5Family.setTheme(theme);

		bgQ5.add(rbPainQ5Family);

		rbPainQ5Family.setActionCommand("3");
		rbPainQ5Family.setText("Family");
		rbPainQ5Family.setBounds(327, 1, 75, 24);
		panel_2_1_1_1_1.add(rbPainQ5Family);

		panel_4 = new JxPanel();
		panel_4.setTheme(theme);

		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setBounds(7, 37, 915, 83);
		panel_3.add(panel_4);

		/*
		 * final JxLabel locationOfPainLabel = new JxLabel();
		 * locationOfPainLabel.setTheme (theme); locationOfPainLabel.setText(
		 * "Location of Pain: Select body area of reported or observed pain.");
		 * locationOfPainLabel.setBounds(10, 10, 419, 16);
		 * panel_4.add(locationOfPainLabel);
		 * 
		 * cmbLocation = new JxComboBox(); cmbLocation.setTheme (theme);
		 * 
		 * cmbLocation.setModel(new DefaultComboBoxModel(new String[] { "", "1",
		 * "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		 * cmbLocation.setBounds(363, 8, 66, 20);
		 * cmbLocation.addActionListener(new ActionListener() { public void
		 * actionPerformed(final ActionEvent e) { firePropertyEvent(); } });
		 * cmbLocation.addFocusListener(new FocusAdapter() { public void
		 * focusGained(final FocusEvent e) { stillHasFocus = true;
		 * doHighlight(); }
		 * 
		 * public void focusLost(final FocusEvent e) { stillHasFocus = false;
		 * doHighlight(); } }); cmbLocation.setRenderer(new
		 * DefaultListCellRenderer() { public Component
		 * getListCellRendererComponent(JList list, Object value, int index,
		 * boolean isSelected, boolean cellHasFocus) { JxLabel renderer =
		 * (JxLabel) super.getListCellRendererComponent( list, value, index,
		 * isSelected, cellHasFocus); if (cellHasFocus || isSelected) { if
		 * (index != 0 && index != -1) { fireIndex(Integer.parseInt((String)
		 * value)); } else { fireNull(); } } return renderer; } });
		 * panel_4.add(cmbLocation);
		 */
		/*
		 * final JxLabel originHowLabel = new JxLabel(); originHowLabel.setTheme
		 * (theme);
		 * originHowLabel.setText("Origin ( When and why pain began):");
		 * originHowLabel.setBounds(10, 67, 195, 16);
		 * panel_4.add(originHowLabel);
		 * 
		 * txtOrigin = new JxText(); txtOrigin.setTheme (theme);
		 * txtOrigin.setBounds(211, 65, 218, 20); panel_4.add(txtOrigin);
		 */
		final JxLabel checkScaleUsedLabel = new JxLabel();
		checkScaleUsedLabel.setTheme(theme);

		checkScaleUsedLabel.setText("Check Scale Used:");
		checkScaleUsedLabel.setBounds(10, 30, 106, 16);
		panel_4.add(checkScaleUsedLabel);

		rbQ6Word = new JxRadioButton();
		rbQ6Word.setTheme(theme);

		rbQ6Word.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				btnPresent.setMode("FACE");
				btnWorst.setMode("FACE");
				btnBest.setMode("FACE");
			}
		});
		bgScale.add(rbQ6Word);

		rbQ6Word.setActionCommand("1");
		rbQ6Word.setText("(Wong-Bakers) Word Faces");
		rbQ6Word.setBounds(102, 30, 157, 16);
		panel_4.add(rbQ6Word);

		rbQ6Behavioral = new JxRadioButton();
		rbQ6Behavioral.setTheme(theme);

		rbQ6Behavioral.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				btnPresent.setMode("FLACC");
				btnWorst.setMode("FLACC");
				btnBest.setMode("FLACC");
			}
		});
		bgScale.add(rbQ6Behavioral);

		rbQ6Behavioral.setActionCommand("2");
		rbQ6Behavioral.setText("Behavioral Observation");
		rbQ6Behavioral.setBounds(265, 30, 141, 16);
		panel_4.add(rbQ6Behavioral);

		btnPresent = new JxPopUpButton();
		btnPresent.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				/*
				 * if(SwingUtils.getSelectedButton(bgScale)==2){ PanelFlaccScale
				 * pfScale = new PanelFlaccScale();
				 * SwingUtils.openInDialogUnDecorated
				 * (pfScale,null).setVisible(true); }
				 * if(SwingUtils.getSelectedButton(bgScale)==1){ PanelFaceScale
				 * pfScale = new PanelFaceScale();
				 * SwingUtils.openInDialogUnDecorated
				 * (pfScale,null).setVisible(true); }
				 */
			}
		});
		btnPresent.setText("0");
		btnPresent.setBackground(Color.WHITE);
		btnPresent.setBounds(566, 26, 46, 25);
		panel_4.add(btnPresent);

		final JxLabel atPresentLabel = new JxLabel();
		atPresentLabel.setTheme(theme);

		atPresentLabel.setText("at Present");
		atPresentLabel.setBounds(618, 30, 66, 16);
		panel_4.add(atPresentLabel);

		btnWorst = new JxPopUpButton();
		btnWorst.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
			}
		});
		btnWorst.setText("0");
		// btnWorst.setArc(0.4f);
		btnWorst.setBackground(Color.WHITE);
		btnWorst.setBounds(690, 26, 46, 25);
		panel_4.add(btnWorst);

		final JxLabel atPresentLabel_1 = new JxLabel();
		atPresentLabel_1.setTheme(theme);

		atPresentLabel_1.setText("at Worst");
		atPresentLabel_1.setBounds(742, 30, 56, 16);
		panel_4.add(atPresentLabel_1);

		btnBest = new JxPopUpButton();
		btnBest.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
			}
		});
		btnBest.setText("0");
		// btnBest.setArc(0.4f);
		btnBest.setBackground(Color.WHITE);
		btnBest.setBounds(804, 26, 46, 25);
		panel_4.add(btnBest);

		final JxLabel atPresentLabel_1_1 = new JxLabel();
		atPresentLabel_1_1.setTheme(theme);

		atPresentLabel_1_1.setText("at Best");
		atPresentLabel_1_1.setBounds(856, 30, 46, 16);
		panel_4.add(atPresentLabel_1_1);

		final JxLabel residentsAcceptableLevelLabel = new JxLabel();
		residentsAcceptableLevelLabel.setTheme(theme);

		residentsAcceptableLevelLabel
				.setText("Resident's Acceptable Level of Pain (1-10)");
		residentsAcceptableLevelLabel.setBounds(10, 52, 224, 16);
		panel_4.add(residentsAcceptableLevelLabel);

		cmbPainLevel = new JxComboBox();
		cmbPainLevel.setTheme(theme);

		cmbPainLevel.setBounds(260, 52, 66, 25);
		panel_4.add(cmbPainLevel);

		rbNumericalScale = new JxRadioButton();
		rbNumericalScale.setTheme(theme);

		rbNumericalScale.setActionCommand("3");
		rbNumericalScale.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				btnPresent.setMode("NUMERICAL");
				btnWorst.setMode("NUMERICAL");
				btnBest.setMode("NUMERICAL");
			}
		});
		bgScale.add(rbNumericalScale);

		rbNumericalScale.setText("Numerical Scale(1-10)");
		rbNumericalScale.setBounds(422, 27, 138, 22);
		panel_4.add(rbNumericalScale);

		final JxLabel residentsPainRatingLabel = new JxLabel();
		residentsPainRatingLabel.setTheme(theme);
		residentsPainRatingLabel.setBounds(10, 8, 158, 16);
		panel_4.add(residentsPainRatingLabel);

		residentsPainRatingLabel.setText("Resident's Pain Rating Level:");

		panelHuman = new JxPanel();
		panelHuman.setTheme(theme);
		panelHuman.setOpaque(false);

		panelHuman.setLayout(null);
		panelHuman.setBorder(new LineBorder(Color.black, 1, false));
		panelHuman.setBounds(625, 126, 297, 518);
		panel_3.add(panelHuman);

		lbl = new JxLabel(new ImageIcon("img/spot.png"));
		lbl.setBounds(0, 0, 20, 20);
		lbl.setVisible(true);
		panelHuman.add(lbl);
		lblHumanImg = new JxLabel(new ImageIcon("img/human1/0.gif"));
		lblHumanImg.setTheme(theme);
		lblHumanImg.setBounds(15, 15, 256, 490);
		lblHumanImg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Point clickedPoint = e.getLocationOnScreen();
				Point pt = panelHuman.getLocationOnScreen();
				int x = (clickedPoint.x - pt.x - 10);
				int y = (clickedPoint.y - pt.y - 10);
				currentColumn.setCoorX(x);
				currentColumn.setCoorY(y);
				lbl.setLocation(x, y);
				lbl.setVisible(true);
			}
		});
		panelHuman.add(lblHumanImg);
		panelHuman.setComponentZOrder(lbl, 0);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);

		panel_8.setLayout(null);
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setBounds(7, 126, 611, 518);
		panel_3.add(panel_8);

		final JxPanel panel_9 = new JxPanel();
		panel_9.setTheme(theme);
		panel_9.setOpaque(false);
		panel_9.setLayout(null);
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setBounds(0, 0, 136, 518);
		panel_8.add(panel_9);

		final JxLabel siteNumberLabel = new JxLabel();
		siteNumberLabel.setTheme(theme);

		siteNumberLabel.setBorder(new LineBorder(Color.black, 1, false));
		siteNumberLabel.setText(" Site Number:");
		siteNumberLabel.setBounds(0, 0, 136, 25);
		panel_9.add(siteNumberLabel);

		final JxLabel siteNumberLabel_1 = new JxLabel();
		siteNumberLabel_1.setTheme(theme);

		siteNumberLabel_1.setFontStyle(Font.BOLD);
		siteNumberLabel_1.setBorder(new LineBorder(Color.black, 1, false));
		siteNumberLabel_1.setText(" Stage :");
		siteNumberLabel_1.setBounds(0, 55, 136, 25);
		siteNumberLabel_1.setVisible(false);
		panel_9.add(siteNumberLabel_1);

		final JxLabel painOnsetLabel = new JxLabel();
		painOnsetLabel.setTheme(theme);

		painOnsetLabel.setBounds(0, 55, 136, 25);
		painOnsetLabel.setBorder(new LineBorder(Color.black, 1, false));
		painOnsetLabel.setText(" Pain Onset:");
		panel_9.add(painOnsetLabel);

		final JxLabel painOnsetLabel_1 = new JxLabel();
		painOnsetLabel_1.setTheme(theme);

		painOnsetLabel_1.setBounds(0, 110, 136, 25);
		painOnsetLabel_1.setBorder(new LineBorder(Color.black, 1, false));
		painOnsetLabel_1.setText(" Duration :");
		panel_9.add(painOnsetLabel_1);

		final JxLabel painOnsetLabel_1_1 = new JxLabel();
		painOnsetLabel_1_1.setTheme(theme);

		painOnsetLabel_1_1.setBounds(0, 165, 136, 25);
		painOnsetLabel_1_1.setBorder(new LineBorder(Color.black, 1, false));
		painOnsetLabel_1_1.setText(" Quality:");
		panel_9.add(painOnsetLabel_1_1);

		final JxLabel painOnsetLabel_1_1_1 = new JxLabel();
		painOnsetLabel_1_1_1.setTheme(theme);

		painOnsetLabel_1_1_1.setBounds(0, 220, 136, 25);
		painOnsetLabel_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		painOnsetLabel_1_1_1.setText(" Exhibits:");
		panel_9.add(painOnsetLabel_1_1_1);

		final JxLabel nonPharmacologicalLabel = new JxLabel();
		nonPharmacologicalLabel.setTheme(theme);
		nonPharmacologicalLabel.setBounds(0, 330, 136, 25);
		nonPharmacologicalLabel
				.setBorder(new LineBorder(Color.black, 1, false));

		nonPharmacologicalLabel.setFontStyle(Font.BOLD);
		nonPharmacologicalLabel.setText("Non Pharmacological :");
		nonPharmacologicalLabel.setVisible(false);
		panel_9.add(nonPharmacologicalLabel);

		final JxLabel painEffectsLabel = new JxLabel();
		painEffectsLabel.setTheme(theme);
		painEffectsLabel.setBounds(0, 330, 136, 25);
		painEffectsLabel.setBorder(new LineBorder(Color.black, 1, false));

		painEffectsLabel.setText(" Pain Effects :");
		panel_9.add(painEffectsLabel);

		final JxLabel exacerbatingFactorsLabel = new JxLabel();
		exacerbatingFactorsLabel.setTheme(theme);
		exacerbatingFactorsLabel.setBounds(0, 275, 136, 25);
		exacerbatingFactorsLabel
				.setBorder(new LineBorder(Color.black, 1, false));

		exacerbatingFactorsLabel.setText(" Exacerbating Factors :");
		panel_9.add(exacerbatingFactorsLabel);

		panelPainAssessmentArr = new PanelPainAssessment[MAX_COL];
		for (int i = 0; i < panelPainAssessmentArr.length; i++) {
			final int index = i;
			panelPainAssessmentArr[i] = new PanelPainAssessment(i + 1);
			panelPainAssessmentArr[i].setBounds(141 + (93 * i), 0, 88, 518);
			panelPainAssessmentArr[i]
					.addPropertyChangeListener(new PropertyChangeListener() {
						public void propertyChange(final PropertyChangeEvent evt) {
							if (evt
									.getPropertyName()
									.equals(
											PanelPressureSoreAssessment.PROPERTY_SITENUM_CHANGED)) {
								doSelectHuman((Integer) evt.getNewValue(),
										index);
							}
						}
					});
			panel_8.add(panelPainAssessmentArr[i]);
		}

		doLoad();
	}

	public void doLoad() {
		fillCombos();
		doUpdate();
		doSelectHuman(0, 0);
		// disablePage();
	}

	private void enablePage() {
		layerUI.setLocked(false);
	}

	private void disablePage() {
		layerUI.setLocked(true);
	}

	public void fillCombos() {
		cmbPainLevel.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "", "1", "2", "3", "4", "5", "6", "7", "8", "9",
						"10" }));
		/*
		 * cmbWorst.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
		 * "", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		 * cmbBest.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
		 * "", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		 * cmbPresent.setModel(new javax.swing.DefaultComboBoxModel(new String[]
		 * { "", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		 */

		// UserLogon ul = new UserLogon();
		// try {
		// ul = MedrexClientManager.getInstance().getcurrentUserLogon();
		// } catch (RemoteException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (MedrexException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// Users user = new Users();
		// try {
		// user = MedrexClientManager.getInstance().getUser(ul.getUserId());
		// } catch (RemoteException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (MedrexException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// cmbNurse.addItem(user.getUserName());
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
	}

	public void doUpdate() {
		int resId = Global.currentResidenceKey;
		ResidentMain rm = null;
		try {
			rm = MedrexClientManager.getInstance().getResident(resId);
			lblResidentName.setText(rm.getUserName() + " " + rm.getUserPass());
			/* TODO: Migrating to room history */
			// lblRoomNum.setText(rm.getRoom());
		} catch (Exception e) {

		}

		if (Global.currentResidentAssessmentFormKey == 0) {
			Global.currentResidentAssessmentFormPage7Key = 0;

			SwingUtils.setSelectedButton(bgQ1, 0);
			SwingUtils.setSelectedButton(bgQ2, 0);
			SwingUtils.setSelectedButton(bgQ3, 0);
			SwingUtils.setSelectedButton(bgQ4, 0);
			SwingUtils.setSelectedButton(bgQ5, 0);
			SwingUtils.setSelectedButton(bgQ6, 0);

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

			// cmbLocation.setSelectedIndex(0);
			// txtOrigin.setText("");
			// btnBest.setSelectedItem("");
			// btnPresent.setSelectedItem("");
			// btnWorst.setSelectedItem("");
			cmbPainLevel.setSelectedItem("");

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
			 * .getUserId());
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
			ResidentAssessmentFormPage7 rafp7 = null;
			try {
				rafp7 = MedrexClientManager.getInstance()
						.getResidentAssessmentFormPage7(
								Global.currentResidentAssessmentFormKey);
			} catch (Exception e) {

			}
			Global.currentResidentAssessmentFormPage7Key = rafp7.getSerial();

			dcNurseVisit.setDate(rafp7.getNurseVisit());
			cmbNurse.setSelectedItem(rafp7.getNurse());

			SwingUtils.setSelectedButton(bgQ1, rafp7.getPainQ1());
			SwingUtils.setSelectedButton(bgQ2, rafp7.getPainQ2());
			SwingUtils.setSelectedButton(bgQ3, rafp7.getPainQ3());
			SwingUtils.setSelectedButton(bgQ4, rafp7.getPainQ4());
			SwingUtils.setSelectedButton(bgQ5, rafp7.getPainQ5());
			SwingUtils.setSelectedButton(bgQ6, rafp7.getPainQ6());

			btnBest.setText(rafp7.getPainLevelBest());
			// btnPresent.setSelectedItem(rafp7.getPainLevelPresent());
			btnWorst.setText(rafp7.getPainLevelWorst());
			cmbPainLevel.setSelectedItem(rafp7.getPainLevel());
			lblResidentName.setText(rafp7.getResidentName());
			lblRoomNum.setText(rafp7.getRoomNo());
			btnPresent.setText(rafp7.getPresentValue() + "");
			btnPresent.setFlaccValues(rafp7.getFlaccValues());
			btnPresent.setPresentValue(rafp7.getPresentValue());
			SwingUtils.setSelectedButton(bgScale, rafp7.getScaleType());

			if (rafp7.getScaleType() == 2) {
				btnPresent.setMode("FLACC");
			}
			if (rafp7.getScaleType() == 1) {
				btnPresent.setMode("FACE");
			}
			if (rafp7.getScaleType() == 3) {
				btnPresent.setMode("NUMERICAL");
			}

			// txtComment.setText(rafp7.getComment());
			setXCor(rafp7.getX());
			setYCor(rafp7.getY());

			for (int i = 0; i < panelPainAssessmentArr.length; i++) {
				panelPainAssessmentArr[i].updateData();
			}
		}

	}

	public int doSave() {
		ResidentAssessmentFormPage7 rafp7 = new ResidentAssessmentFormPage7();

		rafp7.setSerial(Global.currentResidentAssessmentFormPage7Key);
		rafp7.setFormId(Global.currentResidentAssessmentFormKey);
		rafp7.setNurseVisit(dcNurseVisit.getDate());
		rafp7.setNurse((String) cmbNurse.getSelectedItem());
		rafp7.setPresentValue(Integer.parseInt(btnPresent.getText()));
		rafp7.setFlaccValues(btnPresent.getFlaccValues());
		rafp7.setScaleType(SwingUtils.getSelectedButton(bgScale));
		rafp7.setPainQ1(SwingUtils.getSelectedButton(bgQ1));
		rafp7.setPainQ2(SwingUtils.getSelectedButton(bgQ2));
		rafp7.setPainQ3(SwingUtils.getSelectedButton(bgQ3));
		rafp7.setPainQ4(SwingUtils.getSelectedButton(bgQ4));
		rafp7.setPainQ5(SwingUtils.getSelectedButton(bgQ5));
		rafp7.setPainQ6(SwingUtils.getSelectedButton(bgQ6));
		// rafp7.setLocation(cmbLocation.getSelectedItem() + "");
		// rafp7.setOrigin(txtOrigin.getText());
		rafp7.setPainLevel((String) cmbPainLevel.getSelectedItem());
		rafp7.setPainLevelWorst(btnWorst.getText());
		rafp7.setPainLevelBest(btnBest.getText());
		// rafp7.setPainLevelPresent((String) btnPresent.getSelectedItem());
		rafp7.setResidentName(lblResidentName.getText());
		rafp7.setRoomNo(lblRoomNum.getText());
		rafp7.setX(xCor);
		rafp7.setY(yCor);
		try {
			Global.currentResidentAssessmentFormPage7Key = MedrexClientManager
					.getInstance().insertOrUpdateResidentAssessmentFormPage7(
							rafp7);
		} catch (Exception e) {
			return (0);
		}

		if (Global.currentResidentAssessmentFormPage7Key != 0) {
			for (int i = 0; i < panelPainAssessmentArr.length; i++) {
				panelPainAssessmentArr[i].doSave();
			}
		}

		return (Global.currentResidentAssessmentFormPage7Key);
	}

	public void selectSite(int n) {
		currentColumn = panelPainAssessmentArr[n];
		int x = currentColumn.getCoorX();
		int y = currentColumn.getCoorY();
		lbl.setLocation(x, y);

	}

	public void doSelectHuman(int n, int index) {
		selectSite(index);
		lblHumanImg.setIcon(humanImg[n]);
		lblHumanImg.repaint();
	}

	/*
	 * public void doHighlight() { if (stillHasFocus) {
	 * cmbLocation.setBackground(COLOR_HIGH); // firePropertyEvent(); } else {
	 * cmbLocation.setBackground(COLOR_NORM); // fireNull(); }
	 * firePropertyEvent(); }
	 */
	/*
	 * public void firePropertyEvent() { if
	 * (cmbLocation.getSelectedItem().toString().equalsIgnoreCase("")) {
	 * fireNull(); } else {
	 * doSelectHuman(Integer.parseInt(cmbLocation.getSelectedItem()
	 * .toString())); } }
	 */

	public boolean doValidate() {
		// TODO Auto-generated method stub
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;

		// if (!FieldValidation.isEmpty(temp =
		// FieldValidation.isNonEmptyAlphaField(
		// lblResidentName, "Resident Name", 0, 25))) {
		// vRes.addAllFrom(temp);
		// }
		if (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(bgQ1,
				"Have you any pain now"))) {
			vRes.addAllFrom(temp);
		}
		if (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(bgQ5,
				"Information obtained form"))) {
			vRes.addAllFrom(temp);
		}

		// System.out.println(FieldValidation.getMessages(vRes.getMessages()));
		if (!FieldValidation.isEmpty(vRes)) {
			FieldValidation.Msgbox(vRes, "Resident Assessment Form: Page 7");
			return false;
		} else {
			return true;
		}
	}
}
