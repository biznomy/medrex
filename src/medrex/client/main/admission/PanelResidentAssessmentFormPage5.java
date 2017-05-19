package medrex.client.main.admission;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.BorderUIResource.CompoundBorderUIResource;
import javax.swing.plaf.basic.BasicBorders;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldValidation;
import medrex.commons.intf.Form;
import medrex.commons.vo.admission.ResidentAssessmentFormPage5;
import medrex.commons.vo.others.Nurse;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;

import com.jgoodies.validation.ValidationResult;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxRadioButton;
import com.sX.swing.JxTextA;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelResidentAssessmentFormPage5 extends JxPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1818418277099260345L;
	Theme theme = new BlackOverWhiteTheme();
	Font Font_Bold = new Font("Arial", Font.BOLD, 12);
	Font Font_Plain = new Font("Arial", Font.PLAIN, 11);
	Insets margin = new Insets(0, 2, 0, 0);
	Border border = new CompoundBorderUIResource(new LineBorder(Color.BLACK),
			new BasicBorders.MarginBorder());
	Color background = Color.WHITE;
	Color foreground = Color.BLACK;

	private JxLabel llblRoom;
	private JxLabel lblResidentName;
	private JxDateChooser dcNurseVisit;
	private JxLabel dateLabel;
	private JxComboBox cmbNurse;
	private JxLabel ifSoWhatLabel;
	private JxPanel panel_12;
	private JxRadioButton rbPredisposing4;
	private JxRadioButton rbPredisposing2;
	private JxRadioButton rbPredisposing0;
	private JxRadioButton rbMedications1;
	private JxRadioButton rbMedications4;
	private JxRadioButton rbMedications2;
	private JxRadioButton rbMedication0;
	private JxRadioButton rbSystolic4;
	private JxRadioButton rbSystolic2;
	private JxRadioButton rbSystolic0;
	private JxRadioButton rbGait7;
	private JxRadioButton rbGait6;
	private JxRadioButton rbGait5;
	private JxRadioButton rbGait4;
	private JxRadioButton rbGait3;
	private JxRadioButton rbGait2;
	private JxRadioButton rbGait1;
	private JxRadioButton rbGait0;
	private JxRadioButton rbVision4;
	private JxRadioButton rbVision2;
	private JxRadioButton rbVision0;
	private JxRadioButton rbAmbulation4;
	private JxRadioButton rbAmbulation2;
	private JxRadioButton rbAmbulation0;
	private ButtonGroup bgPredisposing = new ButtonGroup();
	private ButtonGroup bgMedications = new ButtonGroup();
	private ButtonGroup bgSystolic = new ButtonGroup();
	private ButtonGroup bgGait = new ButtonGroup();
	private ButtonGroup bgVision = new ButtonGroup();
	private ButtonGroup bgAmbulation = new ButtonGroup();
	private ButtonGroup bgFalls = new ButtonGroup();
	private JxRadioButton rbFalls3;
	private JxRadioButton rbFalls12;
	private JxRadioButton rbFallsNoFalls;
	private JxRadioButton rbConscienceIntermittent;
	private JxRadioButton rbConscienceDisOriented;
	private ButtonGroup bgConscience = new ButtonGroup();
	private JxRadioButton rbConscienceAlert;

	private JxLabel lblTotal;

	public PanelResidentAssessmentFormPage5() {
		super();

		Global.panelResidentAssessmentFormPage5 = this;
		setLayout(null);
		setBorder(new LineBorder(Color.black, 1, true));
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(930, 1200));

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
		fallRiskAssessmentLabel.setText("FALL RISK ASSESSMENT");
		fallRiskAssessmentLabel.setBounds(389, 0, 187, 26);
		panel.add(fallRiskAssessmentLabel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBackground(Color.BLACK);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 50, 140, 26);
		add(panel_1);

		final JxLabel parameterLabel = new JxLabel();
		parameterLabel.setTheme(theme);
		parameterLabel.setForeground(new Color(255, 255, 255));

		parameterLabel.setFontSize(14);
		parameterLabel.setFontStyle(Font.BOLD);
		parameterLabel.setText("Parameter");
		parameterLabel.setBounds(10, 5, 99, 16);
		panel_1.add(parameterLabel);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setBackground(Color.BLACK);
		panel_2.setLayout(null);
		panel_2.setBounds(142, 50, 64, 26);
		add(panel_2);

		final JxLabel parameterLabel_1 = new JxLabel();
		parameterLabel_1.setTheme(theme);
		parameterLabel_1.setForeground(new Color(255, 255, 255));

		parameterLabel_1.setFontSize(14);
		parameterLabel_1.setFontStyle(Font.BOLD);
		parameterLabel_1.setText(" Score");
		parameterLabel_1.setBounds(0, 0, 64, 30);
		panel_2.add(parameterLabel_1);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);

		panel_3.setFontSize(12);
		panel_3.setBackground(Color.BLACK);
		panel_3.setLayout(null);
		panel_3.setBounds(208, 50, 715, 26);
		add(panel_3);

		final JxLabel parameterLabel_2 = new JxLabel();
		parameterLabel_2.setTheme(theme);
		parameterLabel_2.setForeground(new Color(255, 255, 255));

		parameterLabel_2.setFontSize(14);
		parameterLabel_2.setFontStyle(Font.BOLD);
		parameterLabel_2.setText("Resident Condition / Status");
		parameterLabel_2.setBounds(225, 0, 283, 30);
		panel_3.add(parameterLabel_2);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);

		panel_4.setBounds(0, 76, 928, 76);
		add(panel_4);
		panel_4.setLayout(null);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setBorder(new LineBorder(Color.black, 1, false));

		panel_5.setLayout(null);
		panel_5.setBounds(0, 0, 141, 76);
		panel_4.add(panel_5);

		final JxTextA levelOfConscienceTextArea = new JxTextA();
		levelOfConscienceTextArea.setTheme(theme);
		levelOfConscienceTextArea.setEditable(false);

		levelOfConscienceTextArea.setFontSize(14);
		levelOfConscienceTextArea.setFontStyle(Font.BOLD);
		levelOfConscienceTextArea
				.setText("LEVEL OF CONSCIENCE / MENTAL STATUS");
		levelOfConscienceTextArea.setLineWrap(true);
		levelOfConscienceTextArea.setWrapStyleWord(true);

		levelOfConscienceTextArea.setBounds(10, 10, 121, 57);
		panel_5.add(levelOfConscienceTextArea);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);

		panel_6.setLayout(null);
		panel_6.setBounds(139, 0, 789, 26);
		panel_4.add(panel_6);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setBorder(new LineBorder(Color.black, 1, false));

		panel_7.setLayout(null);
		panel_7.setBounds(0, 0, 67, 26);
		panel_6.add(panel_7);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setText("0");
		label.setBounds(26, 0, 16, 26);
		panel_7.add(label);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);
		panel_8.setBorder(new LineBorder(Color.black, 1, false));

		panel_8.setLayout(null);
		panel_8.setBounds(66, 0, 659, 26);
		panel_6.add(panel_8);

		final JxLabel alertorientedLabel = new JxLabel();
		alertorientedLabel.setTheme(theme);

		alertorientedLabel.setText("ALERT - (oriented x3) OR COMATOSE");
		alertorientedLabel.setBounds(10, 5, 639, 16);
		panel_8.add(alertorientedLabel);

		final JxPanel panel_9 = new JxPanel();
		panel_9.setTheme(theme);
		panel_9.setBorder(new LineBorder(Color.black, 1, false));

		panel_9.setLayout(null);
		panel_9.setBounds(723, 0, 60, 26);
		panel_6.add(panel_9);

		rbConscienceAlert = new JxRadioButton();
		rbConscienceAlert.setTheme(theme);
		rbConscienceAlert.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				updateScore();
			}
		});
		bgConscience.add(rbConscienceAlert);

		rbConscienceAlert.setBounds(21, 3, 21, 19);
		panel_9.add(rbConscienceAlert);

		final JxPanel panel_6_1 = new JxPanel();
		panel_6_1.setTheme(theme);
		panel_6_1.setLayout(null);

		panel_6_1.setBounds(139, 25, 789, 26);
		panel_4.add(panel_6_1);

		final JxPanel panel_7_1 = new JxPanel();
		panel_7_1.setTheme(theme);
		panel_7_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1.setLayout(null);

		panel_7_1.setBounds(0, 0, 67, 26);
		panel_6_1.add(panel_7_1);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);

		label_1.setText("2");
		label_1.setBounds(26, 0, 16, 26);
		panel_7_1.add(label_1);

		final JxPanel panel_8_1 = new JxPanel();
		panel_8_1.setTheme(theme);
		panel_8_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1.setLayout(null);

		panel_8_1.setBounds(66, 0, 659, 26);
		panel_6_1.add(panel_8_1);

		final JxLabel alertorientedLabel_1 = new JxLabel();
		alertorientedLabel_1.setTheme(theme);

		alertorientedLabel_1.setText("DISORIENTED X 3 AT ALL TIMES");
		alertorientedLabel_1.setBounds(10, 5, 639, 16);
		panel_8_1.add(alertorientedLabel_1);

		final JxPanel panel_9_1 = new JxPanel();
		panel_9_1.setTheme(theme);
		panel_9_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1.setLayout(null);

		panel_9_1.setBounds(723, 0, 60, 26);
		panel_6_1.add(panel_9_1);

		rbConscienceDisOriented = new JxRadioButton();
		rbConscienceDisOriented.setTheme(theme);
		rbConscienceDisOriented.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updateScore();
			}
		});
		bgConscience.add(rbConscienceDisOriented);

		rbConscienceDisOriented.setBounds(21, 3, 21, 19);
		panel_9_1.add(rbConscienceDisOriented);

		final JxPanel panel_6_1_1 = new JxPanel();
		panel_6_1_1.setTheme(theme);
		panel_6_1_1.setLayout(null);

		panel_6_1_1.setBounds(139, 50, 789, 26);
		panel_4.add(panel_6_1_1);

		final JxPanel panel_7_1_1 = new JxPanel();
		panel_7_1_1.setTheme(theme);
		panel_7_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1.setLayout(null);

		panel_7_1_1.setBounds(0, 0, 67, 26);
		panel_6_1_1.add(panel_7_1_1);

		final JxLabel label_1_1 = new JxLabel();
		label_1_1.setTheme(theme);

		label_1_1.setText("4");
		label_1_1.setBounds(26, 0, 16, 26);
		panel_7_1_1.add(label_1_1);

		final JxPanel panel_8_1_1 = new JxPanel();
		panel_8_1_1.setTheme(theme);
		panel_8_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1.setLayout(null);

		panel_8_1_1.setBounds(66, 0, 659, 26);
		panel_6_1_1.add(panel_8_1_1);

		final JxLabel alertorientedLabel_1_1 = new JxLabel();
		alertorientedLabel_1_1.setTheme(theme);

		alertorientedLabel_1_1.setText("INTERMITTENT CONFUSION");
		alertorientedLabel_1_1.setBounds(10, 5, 639, 16);
		panel_8_1_1.add(alertorientedLabel_1_1);

		final JxPanel panel_9_1_1 = new JxPanel();
		panel_9_1_1.setTheme(theme);
		panel_9_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1.setLayout(null);

		panel_9_1_1.setBounds(723, 0, 60, 26);
		panel_6_1_1.add(panel_9_1_1);

		rbConscienceIntermittent = new JxRadioButton();
		rbConscienceIntermittent.setTheme(theme);

		rbConscienceIntermittent.setBounds(21, 3, 21, 19);
		rbConscienceIntermittent.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updateScore();
			}
		});
		bgConscience.add(rbConscienceIntermittent);
		panel_9_1_1.add(rbConscienceIntermittent);

		final JxPanel panel_4_1 = new JxPanel();
		panel_4_1.setTheme(theme);
		panel_4_1.setLayout(null);

		panel_4_1.setBounds(0, 152, 928, 76);
		add(panel_4_1);

		final JxPanel panel_5_1 = new JxPanel();
		panel_5_1.setTheme(theme);
		panel_5_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1.setLayout(null);

		panel_5_1.setBounds(0, 0, 141, 76);
		panel_4_1.add(panel_5_1);

		final JxTextA levelOfConscienceTextArea_1 = new JxTextA();
		levelOfConscienceTextArea_1.setTheme(theme);
		levelOfConscienceTextArea_1.setWrapStyleWord(true);
		levelOfConscienceTextArea_1
				.setText("HISTORY OF FALLS                 (Past 3 months)");
		levelOfConscienceTextArea_1.setLineWrap(true);

		levelOfConscienceTextArea_1.setFontSize(14);
		levelOfConscienceTextArea_1.setFontStyle(Font.BOLD);
		levelOfConscienceTextArea_1.setEditable(false);

		levelOfConscienceTextArea_1.setBounds(10, 10, 121, 57);
		panel_5_1.add(levelOfConscienceTextArea_1);

		final JxPanel panel_6_2 = new JxPanel();
		panel_6_2.setTheme(theme);
		panel_6_2.setLayout(null);

		panel_6_2.setBounds(139, 0, 789, 26);
		panel_4_1.add(panel_6_2);

		final JxPanel panel_7_2 = new JxPanel();
		panel_7_2.setTheme(theme);
		panel_7_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2.setLayout(null);

		panel_7_2.setBounds(0, 0, 67, 26);
		panel_6_2.add(panel_7_2);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);

		label_2.setFontSize(12);
		label_2.setFontStyle(Font.BOLD);
		label_2.setText("0");
		label_2.setBounds(26, 0, 16, 26);
		panel_7_2.add(label_2);

		final JxPanel panel_8_2 = new JxPanel();
		panel_8_2.setTheme(theme);
		panel_8_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2.setLayout(null);

		panel_8_2.setBounds(66, 0, 659, 26);
		panel_6_2.add(panel_8_2);

		final JxLabel alertorientedLabel_2 = new JxLabel();
		alertorientedLabel_2.setTheme(theme);

		alertorientedLabel_2.setText("NO FALLS");
		alertorientedLabel_2.setBounds(10, 5, 639, 16);
		panel_8_2.add(alertorientedLabel_2);

		final JxPanel panel_9_2 = new JxPanel();
		panel_9_2.setTheme(theme);
		panel_9_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2.setLayout(null);

		panel_9_2.setBounds(723, 0, 60, 26);
		panel_6_2.add(panel_9_2);

		rbFallsNoFalls = new JxRadioButton();
		rbFallsNoFalls.setTheme(theme);
		bgFalls.add(rbFallsNoFalls);

		rbFallsNoFalls.setBounds(21, 3, 21, 19);
		rbFallsNoFalls.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updateScore();
			}
		});
		panel_9_2.add(rbFallsNoFalls);

		final JxPanel panel_6_1_2 = new JxPanel();
		panel_6_1_2.setTheme(theme);
		panel_6_1_2.setLayout(null);

		panel_6_1_2.setBounds(139, 25, 789, 26);
		panel_4_1.add(panel_6_1_2);

		final JxPanel panel_7_1_2 = new JxPanel();
		panel_7_1_2.setTheme(theme);
		panel_7_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2.setLayout(null);

		panel_7_1_2.setBounds(0, 0, 67, 26);
		panel_6_1_2.add(panel_7_1_2);

		final JxLabel label_1_2 = new JxLabel();
		label_1_2.setTheme(theme);

		label_1_2.setText("2");
		label_1_2.setBounds(26, 0, 16, 26);
		panel_7_1_2.add(label_1_2);

		final JxPanel panel_8_1_2 = new JxPanel();
		panel_8_1_2.setTheme(theme);
		panel_8_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2.setLayout(null);

		panel_8_1_2.setBounds(66, 0, 659, 26);
		panel_6_1_2.add(panel_8_1_2);

		final JxLabel alertorientedLabel_1_2 = new JxLabel();
		alertorientedLabel_1_2.setTheme(theme);

		alertorientedLabel_1_2.setText("1 - 2 FALLS in last 3 months");
		alertorientedLabel_1_2.setBounds(10, 5, 639, 16);
		panel_8_1_2.add(alertorientedLabel_1_2);

		final JxPanel panel_9_1_2 = new JxPanel();
		panel_9_1_2.setTheme(theme);
		panel_9_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_2.setLayout(null);

		panel_9_1_2.setBounds(723, 0, 60, 26);
		panel_6_1_2.add(panel_9_1_2);

		rbFalls12 = new JxRadioButton();
		rbFalls12.setTheme(theme);
		bgFalls.add(rbFalls12);

		rbFalls12.setBounds(21, 3, 21, 19);
		rbFalls12.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updateScore();
			}
		});
		panel_9_1_2.add(rbFalls12);

		final JxPanel panel_6_1_1_1 = new JxPanel();
		panel_6_1_1_1.setTheme(theme);
		panel_6_1_1_1.setLayout(null);

		panel_6_1_1_1.setBounds(139, 50, 789, 26);
		panel_4_1.add(panel_6_1_1_1);

		final JxPanel panel_7_1_1_1 = new JxPanel();
		panel_7_1_1_1.setTheme(theme);
		panel_7_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1.setLayout(null);

		panel_7_1_1_1.setBounds(0, 0, 67, 26);
		panel_6_1_1_1.add(panel_7_1_1_1);

		final JxLabel label_1_1_1 = new JxLabel();
		label_1_1_1.setTheme(theme);

		label_1_1_1.setText("4");
		label_1_1_1.setBounds(26, 0, 16, 26);
		panel_7_1_1_1.add(label_1_1_1);

		final JxPanel panel_8_1_1_1 = new JxPanel();
		panel_8_1_1_1.setTheme(theme);
		panel_8_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1.setLayout(null);

		panel_8_1_1_1.setBounds(66, 0, 659, 26);
		panel_6_1_1_1.add(panel_8_1_1_1);

		final JxLabel alertorientedLabel_1_1_1 = new JxLabel();
		alertorientedLabel_1_1_1.setTheme(theme);

		alertorientedLabel_1_1_1.setText("3 OR MORE FALLS in last 3 months");
		alertorientedLabel_1_1_1.setBounds(10, 5, 639, 16);
		panel_8_1_1_1.add(alertorientedLabel_1_1_1);

		final JxPanel panel_9_1_1_1 = new JxPanel();
		panel_9_1_1_1.setTheme(theme);
		panel_9_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1.setLayout(null);

		panel_9_1_1_1.setBounds(723, 0, 60, 26);
		panel_6_1_1_1.add(panel_9_1_1_1);

		rbFalls3 = new JxRadioButton();
		rbFalls3.setTheme(theme);
		bgFalls.add(rbFalls3);

		rbFalls3.setBounds(21, 3, 21, 19);
		rbFalls3.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updateScore();
			}
		});
		panel_9_1_1_1.add(rbFalls3);

		final JxPanel panel_4_1_1 = new JxPanel();
		panel_4_1_1.setTheme(theme);
		panel_4_1_1.setLayout(null);

		panel_4_1_1.setBounds(0, 228, 928, 76);
		add(panel_4_1_1);

		final JxPanel panel_5_1_1 = new JxPanel();
		panel_5_1_1.setTheme(theme);
		panel_5_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1.setLayout(null);

		panel_5_1_1.setBounds(0, 0, 141, 76);
		panel_4_1_1.add(panel_5_1_1);

		final JxTextA levelOfConscienceTextArea_1_1 = new JxTextA();
		levelOfConscienceTextArea_1_1.setTheme(theme);
		levelOfConscienceTextArea_1_1.setWrapStyleWord(true);
		levelOfConscienceTextArea_1_1
				.setText("AMBULATION  /  ELIMINATION   STATUS");
		levelOfConscienceTextArea_1_1.setLineWrap(true);
		levelOfConscienceTextArea_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		levelOfConscienceTextArea_1_1.setEditable(false);

		levelOfConscienceTextArea_1_1.setBounds(10, 10, 121, 57);
		panel_5_1_1.add(levelOfConscienceTextArea_1_1);

		final JxPanel panel_6_2_1 = new JxPanel();
		panel_6_2_1.setTheme(theme);
		panel_6_2_1.setLayout(null);

		panel_6_2_1.setBounds(139, 0, 789, 26);
		panel_4_1_1.add(panel_6_2_1);

		final JxPanel panel_7_2_1 = new JxPanel();
		panel_7_2_1.setTheme(theme);
		panel_7_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1.setLayout(null);

		panel_7_2_1.setBounds(0, 0, 67, 26);
		panel_6_2_1.add(panel_7_2_1);

		final JxLabel label_2_1 = new JxLabel();
		label_2_1.setTheme(theme);

		label_2_1.setText("0");
		label_2_1.setBounds(26, 0, 16, 26);
		panel_7_2_1.add(label_2_1);

		final JxPanel panel_8_2_1 = new JxPanel();
		panel_8_2_1.setTheme(theme);
		panel_8_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_1.setLayout(null);

		panel_8_2_1.setBounds(66, 0, 659, 26);
		panel_6_2_1.add(panel_8_2_1);

		final JxLabel alertorientedLabel_2_1 = new JxLabel();
		alertorientedLabel_2_1.setTheme(theme);

		alertorientedLabel_2_1.setText("AMBULATORY  /  CONTINENT");
		alertorientedLabel_2_1.setBounds(10, 5, 639, 16);
		panel_8_2_1.add(alertorientedLabel_2_1);

		final JxPanel panel_9_2_1 = new JxPanel();
		panel_9_2_1.setTheme(theme);
		panel_9_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1.setLayout(null);

		panel_9_2_1.setBounds(723, 0, 60, 26);
		panel_6_2_1.add(panel_9_2_1);

		rbAmbulation0 = new JxRadioButton();
		rbAmbulation0.setTheme(theme);
		bgAmbulation.add(rbAmbulation0);

		rbAmbulation0.setBounds(21, 3, 21, 19);
		rbAmbulation0.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updateScore();
			}
		});
		panel_9_2_1.add(rbAmbulation0);

		final JxPanel panel_6_1_2_1 = new JxPanel();
		panel_6_1_2_1.setTheme(theme);
		panel_6_1_2_1.setLayout(null);

		panel_6_1_2_1.setBounds(139, 25, 789, 26);
		panel_4_1_1.add(panel_6_1_2_1);

		final JxPanel panel_7_1_2_1 = new JxPanel();
		panel_7_1_2_1.setTheme(theme);
		panel_7_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2_1.setLayout(null);

		panel_7_1_2_1.setBounds(0, 0, 67, 26);
		panel_6_1_2_1.add(panel_7_1_2_1);

		final JxLabel label_1_2_1 = new JxLabel();
		label_1_2_1.setTheme(theme);

		label_1_2_1.setText("2");
		label_1_2_1.setBounds(26, 0, 16, 26);
		panel_7_1_2_1.add(label_1_2_1);

		final JxPanel panel_8_1_2_1 = new JxPanel();
		panel_8_1_2_1.setTheme(theme);
		panel_8_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2_1.setLayout(null);

		panel_8_1_2_1.setBounds(66, 0, 659, 26);
		panel_6_1_2_1.add(panel_8_1_2_1);

		final JxLabel alertorientedLabel_1_2_1 = new JxLabel();
		alertorientedLabel_1_2_1.setTheme(theme);

		alertorientedLabel_1_2_1
				.setText("CHAIR BOUND - Requires restraints and assist with elimination");
		alertorientedLabel_1_2_1.setBounds(10, 5, 639, 16);
		panel_8_1_2_1.add(alertorientedLabel_1_2_1);

		final JxPanel panel_9_1_2_1 = new JxPanel();
		panel_9_1_2_1.setTheme(theme);
		panel_9_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_2_1.setLayout(null);

		panel_9_1_2_1.setBounds(723, 0, 60, 26);
		panel_6_1_2_1.add(panel_9_1_2_1);

		rbAmbulation2 = new JxRadioButton();
		rbAmbulation2.setTheme(theme);
		bgAmbulation.add(rbAmbulation2);

		rbAmbulation2.setBounds(21, 3, 21, 19);
		rbAmbulation2.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updateScore();
			}
		});
		panel_9_1_2_1.add(rbAmbulation2);

		final JxPanel panel_6_1_1_1_1 = new JxPanel();
		panel_6_1_1_1_1.setTheme(theme);
		panel_6_1_1_1_1.setLayout(null);

		panel_6_1_1_1_1.setBounds(139, 50, 789, 26);
		panel_4_1_1.add(panel_6_1_1_1_1);

		final JxPanel panel_7_1_1_1_1 = new JxPanel();
		panel_7_1_1_1_1.setTheme(theme);
		panel_7_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_1.setLayout(null);

		panel_7_1_1_1_1.setBounds(0, 0, 67, 26);
		panel_6_1_1_1_1.add(panel_7_1_1_1_1);

		final JxLabel label_1_1_1_1 = new JxLabel();
		label_1_1_1_1.setTheme(theme);

		label_1_1_1_1.setText("4");
		label_1_1_1_1.setBounds(26, 0, 16, 26);
		panel_7_1_1_1_1.add(label_1_1_1_1);

		final JxPanel panel_8_1_1_1_1 = new JxPanel();
		panel_8_1_1_1_1.setTheme(theme);
		panel_8_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_1.setLayout(null);

		panel_8_1_1_1_1.setBounds(66, 0, 659, 26);
		panel_6_1_1_1_1.add(panel_8_1_1_1_1);

		final JxLabel alertorientedLabel_1_1_1_1 = new JxLabel();
		alertorientedLabel_1_1_1_1.setTheme(theme);

		alertorientedLabel_1_1_1_1.setText("AMBULATORY / INCONTINENT");
		alertorientedLabel_1_1_1_1.setBounds(10, 5, 639, 16);
		panel_8_1_1_1_1.add(alertorientedLabel_1_1_1_1);

		final JxPanel panel_9_1_1_1_1 = new JxPanel();
		panel_9_1_1_1_1.setTheme(theme);
		panel_9_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_1.setLayout(null);

		panel_9_1_1_1_1.setBounds(723, 0, 60, 26);
		panel_6_1_1_1_1.add(panel_9_1_1_1_1);

		rbAmbulation4 = new JxRadioButton();
		rbAmbulation4.setTheme(theme);
		bgAmbulation.add(rbAmbulation4);

		rbAmbulation4.setBounds(21, 3, 21, 19);
		rbAmbulation4.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updateScore();
			}
		});
		panel_9_1_1_1_1.add(rbAmbulation4);

		final JxPanel panel_4_1_1_1 = new JxPanel();
		panel_4_1_1_1.setTheme(theme);
		panel_4_1_1_1.setLayout(null);

		panel_4_1_1_1.setBounds(0, 304, 928, 76);
		add(panel_4_1_1_1);

		final JxPanel panel_5_1_1_1 = new JxPanel();
		panel_5_1_1_1.setTheme(theme);
		panel_5_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1.setLayout(null);

		panel_5_1_1_1.setBounds(0, 0, 141, 76);
		panel_4_1_1_1.add(panel_5_1_1_1);

		final JxTextA levelOfConscienceTextArea_1_1_1 = new JxTextA();
		levelOfConscienceTextArea_1_1_1.setTheme(theme);
		levelOfConscienceTextArea_1_1_1.setWrapStyleWord(true);
		levelOfConscienceTextArea_1_1_1.setText("VISION         STATUS");
		levelOfConscienceTextArea_1_1_1.setLineWrap(true);

		levelOfConscienceTextArea_1_1_1.setFontSize(14);
		levelOfConscienceTextArea_1_1_1.setFontStyle(Font.BOLD);
		levelOfConscienceTextArea_1_1_1.setEditable(false);

		levelOfConscienceTextArea_1_1_1.setBounds(10, 10, 121, 57);
		panel_5_1_1_1.add(levelOfConscienceTextArea_1_1_1);

		final JxPanel panel_6_2_1_1 = new JxPanel();
		panel_6_2_1_1.setTheme(theme);
		panel_6_2_1_1.setLayout(null);

		panel_6_2_1_1.setBounds(139, 0, 789, 26);
		panel_4_1_1_1.add(panel_6_2_1_1);

		final JxPanel panel_7_2_1_1 = new JxPanel();
		panel_7_2_1_1.setTheme(theme);
		panel_7_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_1.setLayout(null);

		panel_7_2_1_1.setBounds(0, 0, 67, 26);
		panel_6_2_1_1.add(panel_7_2_1_1);

		final JxLabel label_2_1_1 = new JxLabel();
		label_2_1_1.setTheme(theme);

		label_2_1_1.setText("0");
		label_2_1_1.setBounds(26, 0, 16, 26);
		panel_7_2_1_1.add(label_2_1_1);

		final JxPanel panel_8_2_1_1 = new JxPanel();
		panel_8_2_1_1.setTheme(theme);
		panel_8_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_1_1.setLayout(null);

		panel_8_2_1_1.setBounds(66, 0, 659, 26);
		panel_6_2_1_1.add(panel_8_2_1_1);

		final JxLabel alertorientedLabel_2_1_1 = new JxLabel();
		alertorientedLabel_2_1_1.setTheme(theme);

		alertorientedLabel_2_1_1.setText("ADEQUATE (with or without glasses)");
		alertorientedLabel_2_1_1.setBounds(10, 5, 639, 16);
		panel_8_2_1_1.add(alertorientedLabel_2_1_1);

		final JxPanel panel_9_2_1_1 = new JxPanel();
		panel_9_2_1_1.setTheme(theme);
		panel_9_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_1.setLayout(null);

		panel_9_2_1_1.setBounds(723, 0, 60, 26);
		panel_6_2_1_1.add(panel_9_2_1_1);

		rbVision0 = new JxRadioButton();
		rbVision0.setTheme(theme);
		bgVision.add(rbVision0);

		rbVision0.setBounds(21, 3, 21, 19);
		rbVision0.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updateScore();
			}
		});
		panel_9_2_1_1.add(rbVision0);

		final JxPanel panel_6_1_2_1_1 = new JxPanel();
		panel_6_1_2_1_1.setTheme(theme);
		panel_6_1_2_1_1.setLayout(null);

		panel_6_1_2_1_1.setBounds(139, 25, 789, 26);
		panel_4_1_1_1.add(panel_6_1_2_1_1);

		final JxPanel panel_7_1_2_1_1 = new JxPanel();
		panel_7_1_2_1_1.setTheme(theme);

		panel_7_1_2_1_1.setFontSize(12);
		panel_7_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2_1_1.setLayout(null);

		panel_7_1_2_1_1.setBounds(0, 0, 67, 26);
		panel_6_1_2_1_1.add(panel_7_1_2_1_1);

		final JxLabel label_1_2_1_1 = new JxLabel();
		label_1_2_1_1.setTheme(theme);

		label_1_2_1_1.setFontSize(12);
		label_1_2_1_1.setFontStyle(Font.BOLD);
		label_1_2_1_1.setText("2");
		label_1_2_1_1.setBounds(26, 0, 16, 26);
		panel_7_1_2_1_1.add(label_1_2_1_1);

		final JxPanel panel_8_1_2_1_1 = new JxPanel();
		panel_8_1_2_1_1.setTheme(theme);
		panel_8_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2_1_1.setLayout(null);

		panel_8_1_2_1_1.setBounds(66, 0, 659, 26);
		panel_6_1_2_1_1.add(panel_8_1_2_1_1);

		final JxLabel alertorientedLabel_1_2_1_1 = new JxLabel();
		alertorientedLabel_1_2_1_1.setTheme(theme);

		alertorientedLabel_1_2_1_1.setText("POOR (with or without glasses)");
		alertorientedLabel_1_2_1_1.setBounds(10, 5, 639, 16);
		panel_8_1_2_1_1.add(alertorientedLabel_1_2_1_1);

		final JxPanel panel_9_1_2_1_1 = new JxPanel();
		panel_9_1_2_1_1.setTheme(theme);
		panel_9_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_2_1_1.setLayout(null);

		panel_9_1_2_1_1.setBounds(723, 0, 60, 26);
		panel_6_1_2_1_1.add(panel_9_1_2_1_1);

		rbVision2 = new JxRadioButton();
		rbVision2.setTheme(theme);

		bgVision.add(rbVision2);

		rbVision2.setBounds(21, 3, 21, 19);
		rbVision2.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updateScore();
			}
		});
		panel_9_1_2_1_1.add(rbVision2);

		final JxPanel panel_6_1_1_1_1_1 = new JxPanel();
		panel_6_1_1_1_1_1.setTheme(theme);
		panel_6_1_1_1_1_1.setLayout(null);

		panel_6_1_1_1_1_1.setBounds(139, 50, 789, 26);
		panel_4_1_1_1.add(panel_6_1_1_1_1_1);

		final JxPanel panel_7_1_1_1_1_1 = new JxPanel();
		panel_7_1_1_1_1_1.setTheme(theme);
		panel_7_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_1_1.setLayout(null);

		panel_7_1_1_1_1_1.setBounds(0, 0, 67, 26);
		panel_6_1_1_1_1_1.add(panel_7_1_1_1_1_1);

		final JxLabel label_1_1_1_1_1 = new JxLabel();
		label_1_1_1_1_1.setTheme(theme);

		label_1_1_1_1_1.setText("4");
		label_1_1_1_1_1.setBounds(26, 0, 16, 26);
		panel_7_1_1_1_1_1.add(label_1_1_1_1_1);

		final JxPanel panel_8_1_1_1_1_1 = new JxPanel();
		panel_8_1_1_1_1_1.setTheme(theme);
		panel_8_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_1_1.setLayout(null);

		panel_8_1_1_1_1_1.setBounds(66, 0, 659, 26);
		panel_6_1_1_1_1_1.add(panel_8_1_1_1_1_1);

		final JxLabel alertorientedLabel_1_1_1_1_1 = new JxLabel();
		alertorientedLabel_1_1_1_1_1.setTheme(theme);

		alertorientedLabel_1_1_1_1_1.setText("LEGALLY BLIND");
		alertorientedLabel_1_1_1_1_1.setBounds(10, 5, 639, 16);
		panel_8_1_1_1_1_1.add(alertorientedLabel_1_1_1_1_1);

		final JxPanel panel_9_1_1_1_1_1 = new JxPanel();
		panel_9_1_1_1_1_1.setTheme(theme);
		panel_9_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_1_1.setLayout(null);

		panel_9_1_1_1_1_1.setBounds(723, 0, 60, 26);
		panel_6_1_1_1_1_1.add(panel_9_1_1_1_1_1);

		rbVision4 = new JxRadioButton();
		rbVision4.setTheme(theme);

		bgVision.add(rbVision4);

		rbVision4.setBounds(21, 3, 21, 19);
		rbVision4.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updateScore();
			}
		});
		panel_9_1_1_1_1_1.add(rbVision4);

		final JxPanel panel_4_1_1_1_1 = new JxPanel();
		panel_4_1_1_1_1.setTheme(theme);
		panel_4_1_1_1_1.setLayout(null);

		panel_4_1_1_1_1.setBounds(0, 380, 928, 251);
		add(panel_4_1_1_1_1);

		final JxPanel panel_5_1_1_1_1 = new JxPanel();
		panel_5_1_1_1_1.setTheme(theme);
		panel_5_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1_1.setLayout(null);

		panel_5_1_1_1_1.setBounds(0, 0, 141, 250);
		panel_4_1_1_1_1.add(panel_5_1_1_1_1);

		final JxTextA levelOfConscienceTextArea_1_1_1_1 = new JxTextA();
		levelOfConscienceTextArea_1_1_1_1.setTheme(theme);
		levelOfConscienceTextArea_1_1_1_1.setWrapStyleWord(true);
		levelOfConscienceTextArea_1_1_1_1
				.setText("GAIT /                   BALANCE");
		levelOfConscienceTextArea_1_1_1_1.setLineWrap(true);

		levelOfConscienceTextArea_1_1_1_1.setFontSize(14);
		levelOfConscienceTextArea_1_1_1_1.setFontStyle(Font.BOLD);
		levelOfConscienceTextArea_1_1_1_1.setEditable(false);

		levelOfConscienceTextArea_1_1_1_1.setBounds(10, 10, 121, 57);
		panel_5_1_1_1_1.add(levelOfConscienceTextArea_1_1_1_1);

		final JxPanel panel_6_2_1_1_1 = new JxPanel();
		panel_6_2_1_1_1.setTheme(theme);
		panel_6_2_1_1_1.setLayout(null);

		panel_6_2_1_1_1.setBounds(139, 0, 789, 51);
		panel_4_1_1_1_1.add(panel_6_2_1_1_1);

		final JxPanel panel_8_2_1_1_1 = new JxPanel();
		panel_8_2_1_1_1.setTheme(theme);
		panel_8_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_1_1_1.setLayout(null);

		panel_8_2_1_1_1.setBounds(0, 0, 725, 51);
		panel_6_2_1_1_1.add(panel_8_2_1_1_1);

		final JxTextA toAssessTheTextArea = new JxTextA();
		toAssessTheTextArea.setTheme(theme);

		toAssessTheTextArea
				.setText("To assess the resident's Gait / Balance, have him/her stand on both feet without holding onto anything: walk straight forward; through a doorway; and make a turn");
		toAssessTheTextArea.setWrapStyleWord(true);
		toAssessTheTextArea.setLineWrap(true);
		toAssessTheTextArea.setEditable(false);
		toAssessTheTextArea.setBounds(10, 10, 705, 31);
		panel_8_2_1_1_1.add(toAssessTheTextArea);

		final JxPanel panel_9_2_1_1_1 = new JxPanel();
		panel_9_2_1_1_1.setTheme(theme);
		panel_9_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_1_1.setLayout(null);

		panel_9_2_1_1_1.setBounds(723, 0, 60, 51);
		panel_6_2_1_1_1.add(panel_9_2_1_1_1);

		final JxPanel panel_6_1_1_1_1_1_1 = new JxPanel();
		panel_6_1_1_1_1_1_1.setTheme(theme);
		panel_6_1_1_1_1_1_1.setLayout(null);

		panel_6_1_1_1_1_1_1.setBounds(139, 50, 789, 26);
		panel_4_1_1_1_1.add(panel_6_1_1_1_1_1_1);

		final JxPanel panel_7_1_1_1_1_1_1 = new JxPanel();
		panel_7_1_1_1_1_1_1.setTheme(theme);

		panel_7_1_1_1_1_1_1.setFontSize(12);
		panel_7_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_1_1_1.setLayout(null);

		panel_7_1_1_1_1_1_1.setBounds(0, 0, 67, 26);
		panel_6_1_1_1_1_1_1.add(panel_7_1_1_1_1_1_1);

		final JxLabel label_1_1_1_1_1_1 = new JxLabel();
		label_1_1_1_1_1_1.setTheme(theme);

		label_1_1_1_1_1_1.setFontSize(12);
		label_1_1_1_1_1_1.setFontStyle(Font.BOLD);
		label_1_1_1_1_1_1.setText("0");
		label_1_1_1_1_1_1.setBounds(26, 0, 16, 26);
		panel_7_1_1_1_1_1_1.add(label_1_1_1_1_1_1);

		final JxPanel panel_8_1_1_1_1_1_1 = new JxPanel();
		panel_8_1_1_1_1_1_1.setTheme(theme);
		panel_8_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_1_1_1.setLayout(null);

		panel_8_1_1_1_1_1_1.setBounds(66, 0, 659, 26);
		panel_6_1_1_1_1_1_1.add(panel_8_1_1_1_1_1_1);

		final JxLabel alertorientedLabel_1_1_1_1_1_1 = new JxLabel();
		alertorientedLabel_1_1_1_1_1_1.setTheme(theme);
		alertorientedLabel_1_1_1_1_1_1.setFont(Font_Bold);
		alertorientedLabel_1_1_1_1_1_1.setText("Gait / Balance normal");
		alertorientedLabel_1_1_1_1_1_1.setBounds(10, 5, 639, 16);
		panel_8_1_1_1_1_1_1.add(alertorientedLabel_1_1_1_1_1_1);

		final JxPanel panel_9_1_1_1_1_1_1 = new JxPanel();
		panel_9_1_1_1_1_1_1.setTheme(theme);
		panel_9_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_1_1_1.setLayout(null);

		panel_9_1_1_1_1_1_1.setBounds(723, 0, 60, 26);
		panel_6_1_1_1_1_1_1.add(panel_9_1_1_1_1_1_1);

		rbGait0 = new JxRadioButton();
		rbGait0.setTheme(theme);
		bgGait.add(rbGait0);

		rbGait0.setBounds(21, 3, 21, 19);
		rbGait0.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updateScore();
			}
		});
		panel_9_1_1_1_1_1_1.add(rbGait0);

		final JxPanel panel_6_1_1_1_1_1_1_1 = new JxPanel();
		panel_6_1_1_1_1_1_1_1.setTheme(theme);
		panel_6_1_1_1_1_1_1_1.setLayout(null);

		panel_6_1_1_1_1_1_1_1.setBounds(139, 74, 789, 26);
		panel_4_1_1_1_1.add(panel_6_1_1_1_1_1_1_1);

		final JxPanel panel_7_1_1_1_1_1_1_1 = new JxPanel();
		panel_7_1_1_1_1_1_1_1.setTheme(theme);
		panel_7_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_1_1_1_1.setLayout(null);

		panel_7_1_1_1_1_1_1_1.setBounds(0, 0, 67, 26);
		panel_6_1_1_1_1_1_1_1.add(panel_7_1_1_1_1_1_1_1);

		final JxLabel label_1_1_1_1_1_1_1 = new JxLabel();
		label_1_1_1_1_1_1_1.setTheme(theme);

		label_1_1_1_1_1_1_1.setText("1");
		label_1_1_1_1_1_1_1.setBounds(26, 0, 16, 26);
		panel_7_1_1_1_1_1_1_1.add(label_1_1_1_1_1_1_1);

		final JxPanel panel_8_1_1_1_1_1_1_1 = new JxPanel();
		panel_8_1_1_1_1_1_1_1.setTheme(theme);
		panel_8_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_1_1_1_1.setLayout(null);

		panel_8_1_1_1_1_1_1_1.setBounds(66, 0, 659, 26);
		panel_6_1_1_1_1_1_1_1.add(panel_8_1_1_1_1_1_1_1);

		final JxLabel alertorientedLabel_1_1_1_1_1_1_1 = new JxLabel();
		alertorientedLabel_1_1_1_1_1_1_1.setTheme(theme);

		alertorientedLabel_1_1_1_1_1_1_1
				.setText("Balance problem while standing");
		alertorientedLabel_1_1_1_1_1_1_1.setBounds(10, 5, 639, 16);
		panel_8_1_1_1_1_1_1_1.add(alertorientedLabel_1_1_1_1_1_1_1);

		final JxPanel panel_9_1_1_1_1_1_1_1 = new JxPanel();
		panel_9_1_1_1_1_1_1_1.setTheme(theme);
		panel_9_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_1_1_1_1.setLayout(null);

		panel_9_1_1_1_1_1_1_1.setBounds(723, 0, 60, 26);
		panel_6_1_1_1_1_1_1_1.add(panel_9_1_1_1_1_1_1_1);

		rbGait1 = new JxRadioButton();
		rbGait1.setTheme(theme);
		bgGait.add(rbGait1);

		rbGait1.setBounds(21, 3, 21, 19);
		rbGait1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updateScore();
			}
		});
		panel_9_1_1_1_1_1_1_1.add(rbGait1);

		final JxPanel panel_6_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_6_1_1_1_1_1_1_1_1.setTheme(theme);
		panel_6_1_1_1_1_1_1_1_1.setLayout(null);

		panel_6_1_1_1_1_1_1_1_1.setBounds(139, 99, 789, 26);
		panel_4_1_1_1_1.add(panel_6_1_1_1_1_1_1_1_1);

		final JxPanel panel_7_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_7_1_1_1_1_1_1_1_1.setTheme(theme);
		panel_7_1_1_1_1_1_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_1_1_1_1_1.setLayout(null);

		panel_7_1_1_1_1_1_1_1_1.setBounds(0, 0, 67, 26);
		panel_6_1_1_1_1_1_1_1_1.add(panel_7_1_1_1_1_1_1_1_1);

		final JxLabel label_1_1_1_1_1_1_1_1 = new JxLabel();
		label_1_1_1_1_1_1_1_1.setTheme(theme);

		label_1_1_1_1_1_1_1_1.setText("1");
		label_1_1_1_1_1_1_1_1.setBounds(26, 0, 16, 26);
		panel_7_1_1_1_1_1_1_1_1.add(label_1_1_1_1_1_1_1_1);

		final JxPanel panel_8_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_8_1_1_1_1_1_1_1_1.setTheme(theme);
		panel_8_1_1_1_1_1_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_1_1_1_1_1.setLayout(null);

		panel_8_1_1_1_1_1_1_1_1.setBounds(66, 0, 659, 26);
		panel_6_1_1_1_1_1_1_1_1.add(panel_8_1_1_1_1_1_1_1_1);

		final JxLabel alertorientedLabel_1_1_1_1_1_1_1_1 = new JxLabel();
		alertorientedLabel_1_1_1_1_1_1_1_1.setTheme(theme);

		alertorientedLabel_1_1_1_1_1_1_1_1
				.setText("Balance problem while walking");
		alertorientedLabel_1_1_1_1_1_1_1_1.setBounds(10, 5, 639, 16);
		panel_8_1_1_1_1_1_1_1_1.add(alertorientedLabel_1_1_1_1_1_1_1_1);

		final JxPanel panel_9_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_9_1_1_1_1_1_1_1_1.setTheme(theme);
		panel_9_1_1_1_1_1_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_1_1_1_1_1.setLayout(null);

		panel_9_1_1_1_1_1_1_1_1.setBounds(723, 0, 60, 26);
		panel_6_1_1_1_1_1_1_1_1.add(panel_9_1_1_1_1_1_1_1_1);

		rbGait2 = new JxRadioButton();
		rbGait2.setTheme(theme);
		bgGait.add(rbGait2);

		rbGait2.setBounds(21, 3, 21, 19);
		rbGait2.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updateScore();
			}
		});
		panel_9_1_1_1_1_1_1_1_1.add(rbGait2);

		final JxPanel panel_6_1_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_6_1_1_1_1_1_1_1_1_1.setTheme(theme);
		panel_6_1_1_1_1_1_1_1_1_1.setLayout(null);

		panel_6_1_1_1_1_1_1_1_1_1.setBounds(139, 124, 789, 26);
		panel_4_1_1_1_1.add(panel_6_1_1_1_1_1_1_1_1_1);

		final JxPanel panel_7_1_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_7_1_1_1_1_1_1_1_1_1.setTheme(theme);
		panel_7_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_7_1_1_1_1_1_1_1_1_1.setLayout(null);

		panel_7_1_1_1_1_1_1_1_1_1.setBounds(0, 0, 67, 26);
		panel_6_1_1_1_1_1_1_1_1_1.add(panel_7_1_1_1_1_1_1_1_1_1);

		final JxLabel label_1_1_1_1_1_1_1_1_1 = new JxLabel();
		label_1_1_1_1_1_1_1_1_1.setTheme(theme);

		label_1_1_1_1_1_1_1_1_1.setText("1");
		label_1_1_1_1_1_1_1_1_1.setBounds(26, 0, 16, 26);
		panel_7_1_1_1_1_1_1_1_1_1.add(label_1_1_1_1_1_1_1_1_1);

		final JxPanel panel_8_1_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_8_1_1_1_1_1_1_1_1_1.setTheme(theme);
		panel_8_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_8_1_1_1_1_1_1_1_1_1.setLayout(null);

		panel_8_1_1_1_1_1_1_1_1_1.setBounds(66, 0, 659, 26);
		panel_6_1_1_1_1_1_1_1_1_1.add(panel_8_1_1_1_1_1_1_1_1_1);

		final JxLabel alertorientedLabel_1_1_1_1_1_1_1_1_1 = new JxLabel();
		alertorientedLabel_1_1_1_1_1_1_1_1_1.setTheme(theme);

		alertorientedLabel_1_1_1_1_1_1_1_1_1
				.setText("Decreased muscular coordination");
		alertorientedLabel_1_1_1_1_1_1_1_1_1.setBounds(10, 5, 639, 16);
		panel_8_1_1_1_1_1_1_1_1_1.add(alertorientedLabel_1_1_1_1_1_1_1_1_1);

		final JxPanel panel_9_1_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_9_1_1_1_1_1_1_1_1_1.setTheme(theme);
		panel_9_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_1_1_1_1_1_1_1_1_1.setLayout(null);

		panel_9_1_1_1_1_1_1_1_1_1.setBounds(723, 0, 60, 26);
		panel_6_1_1_1_1_1_1_1_1_1.add(panel_9_1_1_1_1_1_1_1_1_1);

		rbGait3 = new JxRadioButton();
		rbGait3.setTheme(theme);
		bgGait.add(rbGait3);

		rbGait3.setBounds(21, 3, 21, 19);
		rbGait3.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updateScore();
			}
		});
		panel_9_1_1_1_1_1_1_1_1_1.add(rbGait3);

		final JxPanel panel_6_1_1_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_6_1_1_1_1_1_1_1_1_1_1.setTheme(theme);
		panel_6_1_1_1_1_1_1_1_1_1_1.setLayout(null);

		panel_6_1_1_1_1_1_1_1_1_1_1.setBounds(139, 149, 789, 26);
		panel_4_1_1_1_1.add(panel_6_1_1_1_1_1_1_1_1_1_1);

		final JxPanel panel_7_1_1_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_7_1_1_1_1_1_1_1_1_1_1.setTheme(theme);
		panel_7_1_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_7_1_1_1_1_1_1_1_1_1_1.setLayout(null);

		panel_7_1_1_1_1_1_1_1_1_1_1.setBounds(0, 0, 67, 26);
		panel_6_1_1_1_1_1_1_1_1_1_1.add(panel_7_1_1_1_1_1_1_1_1_1_1);

		final JxLabel label_1_1_1_1_1_1_1_1_1_1 = new JxLabel();
		label_1_1_1_1_1_1_1_1_1_1.setTheme(theme);

		label_1_1_1_1_1_1_1_1_1_1.setText("1");
		label_1_1_1_1_1_1_1_1_1_1.setBounds(26, 0, 16, 26);
		panel_7_1_1_1_1_1_1_1_1_1_1.add(label_1_1_1_1_1_1_1_1_1_1);

		final JxPanel panel_8_1_1_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_8_1_1_1_1_1_1_1_1_1_1.setTheme(theme);
		panel_8_1_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_8_1_1_1_1_1_1_1_1_1_1.setLayout(null);

		panel_8_1_1_1_1_1_1_1_1_1_1.setBounds(66, 0, 659, 26);
		panel_6_1_1_1_1_1_1_1_1_1_1.add(panel_8_1_1_1_1_1_1_1_1_1_1);

		final JxLabel alertorientedLabel_1_1_1_1_1_1_1_1_1_1 = new JxLabel();
		alertorientedLabel_1_1_1_1_1_1_1_1_1_1.setTheme(theme);

		alertorientedLabel_1_1_1_1_1_1_1_1_1_1
				.setText("Change in gait pattern when walking through doorway");
		alertorientedLabel_1_1_1_1_1_1_1_1_1_1.setBounds(10, 5, 639, 16);
		panel_8_1_1_1_1_1_1_1_1_1_1.add(alertorientedLabel_1_1_1_1_1_1_1_1_1_1);

		final JxPanel panel_9_1_1_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_9_1_1_1_1_1_1_1_1_1_1.setTheme(theme);
		panel_9_1_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_1_1_1_1_1_1_1_1_1_1.setLayout(null);

		panel_9_1_1_1_1_1_1_1_1_1_1.setBounds(723, 0, 60, 26);
		panel_6_1_1_1_1_1_1_1_1_1_1.add(panel_9_1_1_1_1_1_1_1_1_1_1);

		rbGait4 = new JxRadioButton();
		rbGait4.setTheme(theme);
		bgGait.add(rbGait4);

		rbGait4.setBounds(21, 3, 21, 19);
		rbGait4.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updateScore();
			}
		});
		panel_9_1_1_1_1_1_1_1_1_1_1.add(rbGait4);

		final JxPanel panel_6_1_1_1_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_6_1_1_1_1_1_1_1_1_1_1_1.setTheme(theme);
		panel_6_1_1_1_1_1_1_1_1_1_1_1.setLayout(null);

		panel_6_1_1_1_1_1_1_1_1_1_1_1.setBounds(139, 174, 789, 26);
		panel_4_1_1_1_1.add(panel_6_1_1_1_1_1_1_1_1_1_1_1);

		final JxPanel panel_7_1_1_1_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_7_1_1_1_1_1_1_1_1_1_1_1.setTheme(theme);
		panel_7_1_1_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_7_1_1_1_1_1_1_1_1_1_1_1.setLayout(null);

		panel_7_1_1_1_1_1_1_1_1_1_1_1.setBounds(0, 0, 67, 26);
		panel_6_1_1_1_1_1_1_1_1_1_1_1.add(panel_7_1_1_1_1_1_1_1_1_1_1_1);

		final JxLabel label_1_1_1_1_1_1_1_1_1_1_1 = new JxLabel();
		label_1_1_1_1_1_1_1_1_1_1_1.setTheme(theme);

		label_1_1_1_1_1_1_1_1_1_1_1.setText("1");
		label_1_1_1_1_1_1_1_1_1_1_1.setBounds(26, 0, 16, 26);
		panel_7_1_1_1_1_1_1_1_1_1_1_1.add(label_1_1_1_1_1_1_1_1_1_1_1);

		final JxPanel panel_8_1_1_1_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_8_1_1_1_1_1_1_1_1_1_1_1.setTheme(theme);
		panel_8_1_1_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_8_1_1_1_1_1_1_1_1_1_1_1.setLayout(null);

		panel_8_1_1_1_1_1_1_1_1_1_1_1.setBounds(66, 0, 659, 26);
		panel_6_1_1_1_1_1_1_1_1_1_1_1.add(panel_8_1_1_1_1_1_1_1_1_1_1_1);

		final JxLabel alertorientedLabel_1_1_1_1_1_1_1_1_1_1_1 = new JxLabel();
		alertorientedLabel_1_1_1_1_1_1_1_1_1_1_1.setTheme(theme);

		alertorientedLabel_1_1_1_1_1_1_1_1_1_1_1
				.setText("Jerking or unstable when making turns");
		alertorientedLabel_1_1_1_1_1_1_1_1_1_1_1.setBounds(10, 5, 639, 16);
		panel_8_1_1_1_1_1_1_1_1_1_1_1
				.add(alertorientedLabel_1_1_1_1_1_1_1_1_1_1_1);

		final JxPanel panel_9_1_1_1_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_9_1_1_1_1_1_1_1_1_1_1_1.setTheme(theme);
		panel_9_1_1_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_1_1_1_1_1_1_1_1_1_1_1.setLayout(null);

		panel_9_1_1_1_1_1_1_1_1_1_1_1.setBounds(723, 0, 60, 26);
		panel_6_1_1_1_1_1_1_1_1_1_1_1.add(panel_9_1_1_1_1_1_1_1_1_1_1_1);

		rbGait5 = new JxRadioButton();
		rbGait5.setTheme(theme);
		bgGait.add(rbGait5);

		rbGait5.setBounds(21, 3, 21, 19);
		rbGait5.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updateScore();
			}
		});
		panel_9_1_1_1_1_1_1_1_1_1_1_1.add(rbGait5);

		final JxPanel panel_6_1_1_1_1_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_6_1_1_1_1_1_1_1_1_1_1_1_1.setTheme(theme);
		panel_6_1_1_1_1_1_1_1_1_1_1_1_1.setLayout(null);

		panel_6_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(139, 199, 789, 26);
		panel_4_1_1_1_1.add(panel_6_1_1_1_1_1_1_1_1_1_1_1_1);

		final JxPanel panel_7_1_1_1_1_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_7_1_1_1_1_1_1_1_1_1_1_1_1.setTheme(theme);
		panel_7_1_1_1_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black,
				1, false));
		panel_7_1_1_1_1_1_1_1_1_1_1_1_1.setLayout(null);

		panel_7_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(0, 0, 67, 26);
		panel_6_1_1_1_1_1_1_1_1_1_1_1_1.add(panel_7_1_1_1_1_1_1_1_1_1_1_1_1);

		final JxLabel label_1_1_1_1_1_1_1_1_1_1_1_1 = new JxLabel();
		label_1_1_1_1_1_1_1_1_1_1_1_1.setTheme(theme);
		label_1_1_1_1_1_1_1_1_1_1_1_1.setFont(Font_Bold);
		label_1_1_1_1_1_1_1_1_1_1_1_1.setText("1");
		label_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(26, 0, 16, 26);
		panel_7_1_1_1_1_1_1_1_1_1_1_1_1.add(label_1_1_1_1_1_1_1_1_1_1_1_1);

		final JxPanel panel_8_1_1_1_1_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_8_1_1_1_1_1_1_1_1_1_1_1_1.setTheme(theme);
		panel_8_1_1_1_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black,
				1, false));
		panel_8_1_1_1_1_1_1_1_1_1_1_1_1.setLayout(null);

		panel_8_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(66, 0, 659, 26);
		panel_6_1_1_1_1_1_1_1_1_1_1_1_1.add(panel_8_1_1_1_1_1_1_1_1_1_1_1_1);

		final JxLabel alertorientedLabel_1_1_1_1_1_1_1_1_1_1_1_1 = new JxLabel();
		alertorientedLabel_1_1_1_1_1_1_1_1_1_1_1_1.setTheme(theme);

		alertorientedLabel_1_1_1_1_1_1_1_1_1_1_1_1
				.setText("Requires use of assistive devices (i.e., cane, w/c, walker, furniture)");
		alertorientedLabel_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(10, 5, 639, 16);
		panel_8_1_1_1_1_1_1_1_1_1_1_1_1
				.add(alertorientedLabel_1_1_1_1_1_1_1_1_1_1_1_1);

		final JxPanel panel_9_1_1_1_1_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_9_1_1_1_1_1_1_1_1_1_1_1_1.setTheme(theme);
		panel_9_1_1_1_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black,
				1, false));
		panel_9_1_1_1_1_1_1_1_1_1_1_1_1.setLayout(null);

		panel_9_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(723, 0, 60, 26);
		panel_6_1_1_1_1_1_1_1_1_1_1_1_1.add(panel_9_1_1_1_1_1_1_1_1_1_1_1_1);

		rbGait6 = new JxRadioButton();
		rbGait6.setTheme(theme);
		bgGait.add(rbGait6);

		rbGait6.setBounds(21, 3, 21, 19);
		rbGait6.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updateScore();
			}
		});
		panel_9_1_1_1_1_1_1_1_1_1_1_1_1.add(rbGait6);

		final JxPanel panel_6_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_6_1_1_1_1_1_1_1_1_1_1_1_1_1.setTheme(theme);
		panel_6_1_1_1_1_1_1_1_1_1_1_1_1_1.setLayout(null);

		panel_6_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(139, 224, 789, 26);
		panel_4_1_1_1_1.add(panel_6_1_1_1_1_1_1_1_1_1_1_1_1_1);

		final JxPanel panel_7_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_7_1_1_1_1_1_1_1_1_1_1_1_1_1.setTheme(theme);
		panel_7_1_1_1_1_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black,
				1, false));
		panel_7_1_1_1_1_1_1_1_1_1_1_1_1_1.setLayout(null);

		panel_7_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(0, 0, 67, 26);
		panel_6_1_1_1_1_1_1_1_1_1_1_1_1_1
				.add(panel_7_1_1_1_1_1_1_1_1_1_1_1_1_1);

		final JxLabel label_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JxLabel();
		label_1_1_1_1_1_1_1_1_1_1_1_1_1.setTheme(theme);

		label_1_1_1_1_1_1_1_1_1_1_1_1_1.setText("2");
		label_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(26, 0, 16, 26);
		panel_7_1_1_1_1_1_1_1_1_1_1_1_1_1.add(label_1_1_1_1_1_1_1_1_1_1_1_1_1);

		final JxPanel panel_8_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_8_1_1_1_1_1_1_1_1_1_1_1_1_1.setTheme(theme);
		panel_8_1_1_1_1_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black,
				1, false));
		panel_8_1_1_1_1_1_1_1_1_1_1_1_1_1.setLayout(null);

		panel_8_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(66, 0, 659, 26);
		panel_6_1_1_1_1_1_1_1_1_1_1_1_1_1
				.add(panel_8_1_1_1_1_1_1_1_1_1_1_1_1_1);

		final JxLabel alertorientedLabel_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JxLabel();
		alertorientedLabel_1_1_1_1_1_1_1_1_1_1_1_1_1.setTheme(theme);

		alertorientedLabel_1_1_1_1_1_1_1_1_1_1_1_1_1
				.setText("N/A - not able to perform function");
		alertorientedLabel_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(10, 5, 639, 16);
		panel_8_1_1_1_1_1_1_1_1_1_1_1_1_1
				.add(alertorientedLabel_1_1_1_1_1_1_1_1_1_1_1_1_1);

		final JxPanel panel_9_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_9_1_1_1_1_1_1_1_1_1_1_1_1_1.setTheme(theme);
		panel_9_1_1_1_1_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black,
				1, false));
		panel_9_1_1_1_1_1_1_1_1_1_1_1_1_1.setLayout(null);

		panel_9_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(723, 0, 60, 26);
		panel_6_1_1_1_1_1_1_1_1_1_1_1_1_1
				.add(panel_9_1_1_1_1_1_1_1_1_1_1_1_1_1);

		rbGait7 = new JxRadioButton();
		rbGait7.setTheme(theme);
		bgGait.add(rbGait7);

		rbGait7.setBounds(21, 3, 21, 19);
		rbGait7.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updateScore();
			}
		});
		panel_9_1_1_1_1_1_1_1_1_1_1_1_1_1.add(rbGait7);

		final JxPanel panel_4_1_1_1_2 = new JxPanel();
		panel_4_1_1_1_2.setTheme(theme);
		panel_4_1_1_1_2.setLayout(null);

		panel_4_1_1_1_2.setBounds(0, 630, 928, 76);
		add(panel_4_1_1_1_2);

		final JxPanel panel_5_1_1_1_2 = new JxPanel();
		panel_5_1_1_1_2.setTheme(theme);
		panel_5_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1_2.setLayout(null);

		panel_5_1_1_1_2.setBounds(0, 0, 141, 76);
		panel_4_1_1_1_2.add(panel_5_1_1_1_2);

		final JxTextA levelOfConscienceTextArea_1_1_1_2 = new JxTextA();
		levelOfConscienceTextArea_1_1_1_2.setTheme(theme);
		levelOfConscienceTextArea_1_1_1_2.setWrapStyleWord(true);
		levelOfConscienceTextArea_1_1_1_2.setText("SYSTOLIC  BLOOD  PRESSURE");
		levelOfConscienceTextArea_1_1_1_2.setLineWrap(true);

		levelOfConscienceTextArea_1_1_1_2.setFontSize(14);
		levelOfConscienceTextArea_1_1_1_2.setFontStyle(Font.BOLD);
		levelOfConscienceTextArea_1_1_1_2.setEditable(false);

		levelOfConscienceTextArea_1_1_1_2.setBounds(10, 10, 121, 57);
		panel_5_1_1_1_2.add(levelOfConscienceTextArea_1_1_1_2);

		final JxPanel panel_6_2_1_1_2 = new JxPanel();
		panel_6_2_1_1_2.setTheme(theme);
		panel_6_2_1_1_2.setLayout(null);

		panel_6_2_1_1_2.setBounds(139, 0, 789, 26);
		panel_4_1_1_1_2.add(panel_6_2_1_1_2);

		final JxPanel panel_7_2_1_1_1 = new JxPanel();
		panel_7_2_1_1_1.setTheme(theme);

		panel_7_2_1_1_1.setFontSize(12);
		panel_7_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1_1_1.setLayout(null);

		panel_7_2_1_1_1.setBounds(0, 0, 67, 26);
		panel_6_2_1_1_2.add(panel_7_2_1_1_1);

		final JxLabel label_2_1_1_1 = new JxLabel();
		label_2_1_1_1.setTheme(theme);

		label_2_1_1_1.setText("0");
		label_2_1_1_1.setBounds(26, 0, 16, 26);
		panel_7_2_1_1_1.add(label_2_1_1_1);

		final JxPanel panel_8_2_1_1_2 = new JxPanel();
		panel_8_2_1_1_2.setTheme(theme);
		panel_8_2_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_1_1_2.setLayout(null);

		panel_8_2_1_1_2.setBounds(66, 0, 659, 26);
		panel_6_2_1_1_2.add(panel_8_2_1_1_2);

		final JxLabel alertorientedLabel_2_1_1_1 = new JxLabel();
		alertorientedLabel_2_1_1_1.setTheme(theme);

		alertorientedLabel_2_1_1_1
				.setText("NO NOTED DROP between lying and standing");
		alertorientedLabel_2_1_1_1.setBounds(10, 5, 639, 16);
		panel_8_2_1_1_2.add(alertorientedLabel_2_1_1_1);

		final JxPanel panel_9_2_1_1_2 = new JxPanel();
		panel_9_2_1_1_2.setTheme(theme);
		panel_9_2_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_1_2.setLayout(null);

		panel_9_2_1_1_2.setBounds(723, 0, 60, 26);
		panel_6_2_1_1_2.add(panel_9_2_1_1_2);

		rbSystolic0 = new JxRadioButton();
		rbSystolic0.setTheme(theme);
		bgSystolic.add(rbSystolic0);

		rbSystolic0.setBounds(21, 3, 21, 19);
		rbSystolic0.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updateScore();
			}
		});
		panel_9_2_1_1_2.add(rbSystolic0);

		final JxPanel panel_6_1_2_1_1_1 = new JxPanel();
		panel_6_1_2_1_1_1.setTheme(theme);
		panel_6_1_2_1_1_1.setLayout(null);

		panel_6_1_2_1_1_1.setBounds(139, 25, 789, 26);
		panel_4_1_1_1_2.add(panel_6_1_2_1_1_1);

		final JxPanel panel_7_1_2_1_1_1 = new JxPanel();
		panel_7_1_2_1_1_1.setTheme(theme);
		panel_7_1_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2_1_1_1.setLayout(null);

		panel_7_1_2_1_1_1.setBounds(0, 0, 67, 26);
		panel_6_1_2_1_1_1.add(panel_7_1_2_1_1_1);

		final JxLabel label_1_2_1_1_1 = new JxLabel();
		label_1_2_1_1_1.setTheme(theme);

		label_1_2_1_1_1.setText("2");
		label_1_2_1_1_1.setBounds(26, 0, 16, 26);
		panel_7_1_2_1_1_1.add(label_1_2_1_1_1);

		final JxPanel panel_8_1_2_1_1_1 = new JxPanel();
		panel_8_1_2_1_1_1.setTheme(theme);
		panel_8_1_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2_1_1_1.setLayout(null);

		panel_8_1_2_1_1_1.setBounds(66, 0, 659, 26);
		panel_6_1_2_1_1_1.add(panel_8_1_2_1_1_1);

		final JxLabel alertorientedLabel_1_2_1_1_1 = new JxLabel();
		alertorientedLabel_1_2_1_1_1.setTheme(theme);

		alertorientedLabel_1_2_1_1_1
				.setText("Drop LESS THAN 20 mm Hg between lying and standing");
		alertorientedLabel_1_2_1_1_1.setBounds(10, 5, 639, 16);
		panel_8_1_2_1_1_1.add(alertorientedLabel_1_2_1_1_1);

		final JxPanel panel_9_1_2_1_1_1 = new JxPanel();
		panel_9_1_2_1_1_1.setTheme(theme);
		panel_9_1_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_2_1_1_1.setLayout(null);

		panel_9_1_2_1_1_1.setBounds(723, 0, 60, 26);
		panel_6_1_2_1_1_1.add(panel_9_1_2_1_1_1);

		rbSystolic2 = new JxRadioButton();
		rbSystolic2.setTheme(theme);
		bgSystolic.add(rbSystolic2);

		rbSystolic2.setBounds(21, 3, 21, 19);
		rbSystolic2.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updateScore();
			}
		});
		panel_9_1_2_1_1_1.add(rbSystolic2);

		final JxPanel panel_6_1_1_1_1_1_2 = new JxPanel();
		panel_6_1_1_1_1_1_2.setTheme(theme);
		panel_6_1_1_1_1_1_2.setLayout(null);

		panel_6_1_1_1_1_1_2.setBounds(139, 50, 789, 26);
		panel_4_1_1_1_2.add(panel_6_1_1_1_1_1_2);

		final JxPanel panel_7_1_1_1_1_1_2 = new JxPanel();
		panel_7_1_1_1_1_1_2.setTheme(theme);
		panel_7_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_1_1_2.setLayout(null);

		panel_7_1_1_1_1_1_2.setBounds(0, 0, 67, 26);
		panel_6_1_1_1_1_1_2.add(panel_7_1_1_1_1_1_2);

		final JxLabel label_1_1_1_1_1_2 = new JxLabel();
		label_1_1_1_1_1_2.setTheme(theme);

		label_1_1_1_1_1_2.setText("4");
		label_1_1_1_1_1_2.setBounds(26, 0, 16, 26);
		panel_7_1_1_1_1_1_2.add(label_1_1_1_1_1_2);

		final JxPanel panel_8_1_1_1_1_1_2 = new JxPanel();
		panel_8_1_1_1_1_1_2.setTheme(theme);
		panel_8_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_1_1_2.setLayout(null);

		panel_8_1_1_1_1_1_2.setBounds(66, 0, 659, 26);
		panel_6_1_1_1_1_1_2.add(panel_8_1_1_1_1_1_2);

		final JxLabel alertorientedLabel_1_1_1_1_1_2 = new JxLabel();
		alertorientedLabel_1_1_1_1_1_2.setTheme(theme);
		alertorientedLabel_1_1_1_1_1_2.setFont(Font_Bold);
		alertorientedLabel_1_1_1_1_1_2
				.setText("Drop MORE THAN 20 mm Hg between lying and standing");
		alertorientedLabel_1_1_1_1_1_2.setBounds(10, 5, 639, 16);
		panel_8_1_1_1_1_1_2.add(alertorientedLabel_1_1_1_1_1_2);

		final JxPanel panel_9_1_1_1_1_1_2 = new JxPanel();
		panel_9_1_1_1_1_1_2.setTheme(theme);
		panel_9_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_1_1_2.setLayout(null);

		panel_9_1_1_1_1_1_2.setBounds(723, 0, 60, 26);
		panel_6_1_1_1_1_1_2.add(panel_9_1_1_1_1_1_2);

		rbSystolic4 = new JxRadioButton();
		rbSystolic4.setTheme(theme);
		bgSystolic.add(rbSystolic4);

		rbSystolic4.setBounds(21, 3, 21, 19);
		rbSystolic4.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updateScore();
			}
		});
		panel_9_1_1_1_1_1_2.add(rbSystolic4);

		final JxPanel panel_4_1_1_1_1_1 = new JxPanel();
		panel_4_1_1_1_1_1.setTheme(theme);
		panel_4_1_1_1_1_1.setLayout(null);

		panel_4_1_1_1_1_1.setBounds(0, 706, 928, 151);
		add(panel_4_1_1_1_1_1);

		final JxPanel panel_5_1_1_1_1_1 = new JxPanel();
		panel_5_1_1_1_1_1.setTheme(theme);
		panel_5_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1_1_1.setLayout(null);

		panel_5_1_1_1_1_1.setBounds(0, 0, 141, 150);
		panel_4_1_1_1_1_1.add(panel_5_1_1_1_1_1);

		final JxTextA levelOfConscienceTextArea_1_1_1_1_1 = new JxTextA();
		levelOfConscienceTextArea_1_1_1_1_1.setTheme(theme);
		levelOfConscienceTextArea_1_1_1_1_1.setWrapStyleWord(true);
		levelOfConscienceTextArea_1_1_1_1_1.setText("MEDICATIONS");
		levelOfConscienceTextArea_1_1_1_1_1.setLineWrap(true);

		levelOfConscienceTextArea_1_1_1_1_1.setFontSize(14);
		levelOfConscienceTextArea_1_1_1_1_1.setFontStyle(Font.BOLD);
		levelOfConscienceTextArea_1_1_1_1_1.setEditable(false);

		levelOfConscienceTextArea_1_1_1_1_1.setBounds(10, 10, 121, 57);
		panel_5_1_1_1_1_1.add(levelOfConscienceTextArea_1_1_1_1_1);

		final JxPanel panel_6_2_1_1_1_1 = new JxPanel();
		panel_6_2_1_1_1_1.setTheme(theme);
		panel_6_2_1_1_1_1.setLayout(null);

		panel_6_2_1_1_1_1.setBounds(139, 0, 789, 51);
		panel_4_1_1_1_1_1.add(panel_6_2_1_1_1_1);

		final JxPanel panel_8_2_1_1_1_1 = new JxPanel();
		panel_8_2_1_1_1_1.setTheme(theme);
		panel_8_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_1_1_1_1.setLayout(null);

		panel_8_2_1_1_1_1.setBounds(0, 0, 725, 51);
		panel_6_2_1_1_1_1.add(panel_8_2_1_1_1_1);

		final JxTextA toAssessTheTextArea_1 = new JxTextA();
		toAssessTheTextArea_1.setTheme(theme);

		toAssessTheTextArea_1.setWrapStyleWord(true);
		toAssessTheTextArea_1
				.setText("Respond below based on the following types of medications:Anesthetics, Antihistamines, Antihypertensives Antiseizure,Benzodiazepines,Carthartics,Diuretics,Hypoglycemics,Narcotics,Psychotropics,Sedatives/hypnotics.");
		toAssessTheTextArea_1.setLineWrap(true);

		toAssessTheTextArea_1.setEditable(false);
		toAssessTheTextArea_1.setBounds(10, 10, 705, 31);
		panel_8_2_1_1_1_1.add(toAssessTheTextArea_1);

		final JxPanel panel_9_2_1_1_1_1 = new JxPanel();
		panel_9_2_1_1_1_1.setTheme(theme);
		panel_9_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_1_1_1.setLayout(null);

		panel_9_2_1_1_1_1.setBounds(723, 0, 60, 51);
		panel_6_2_1_1_1_1.add(panel_9_2_1_1_1_1);

		final JxPanel panel_6_1_1_1_1_1_1_2 = new JxPanel();
		panel_6_1_1_1_1_1_1_2.setTheme(theme);
		panel_6_1_1_1_1_1_1_2.setLayout(null);

		panel_6_1_1_1_1_1_1_2.setBounds(139, 50, 789, 26);
		panel_4_1_1_1_1_1.add(panel_6_1_1_1_1_1_1_2);

		final JxPanel panel_7_1_1_1_1_1_1_2 = new JxPanel();
		panel_7_1_1_1_1_1_1_2.setTheme(theme);
		panel_7_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_1_1_1_2.setLayout(null);

		panel_7_1_1_1_1_1_1_2.setBounds(0, 0, 67, 26);
		panel_6_1_1_1_1_1_1_2.add(panel_7_1_1_1_1_1_1_2);

		final JxLabel label_1_1_1_1_1_1_2 = new JxLabel();
		label_1_1_1_1_1_1_2.setTheme(theme);

		label_1_1_1_1_1_1_2.setText("0");
		label_1_1_1_1_1_1_2.setBounds(26, 0, 16, 26);
		panel_7_1_1_1_1_1_1_2.add(label_1_1_1_1_1_1_2);

		final JxPanel panel_8_1_1_1_1_1_1_2 = new JxPanel();
		panel_8_1_1_1_1_1_1_2.setTheme(theme);
		panel_8_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_1_1_1_2.setLayout(null);

		panel_8_1_1_1_1_1_1_2.setBounds(66, 0, 659, 26);
		panel_6_1_1_1_1_1_1_2.add(panel_8_1_1_1_1_1_1_2);

		final JxLabel alertorientedLabel_1_1_1_1_1_1_2 = new JxLabel();
		alertorientedLabel_1_1_1_1_1_1_2.setTheme(theme);

		alertorientedLabel_1_1_1_1_1_1_2
				.setText("NONE of these medications taken currently or within last 7 days");
		alertorientedLabel_1_1_1_1_1_1_2.setBounds(10, 5, 639, 16);
		panel_8_1_1_1_1_1_1_2.add(alertorientedLabel_1_1_1_1_1_1_2);

		final JxPanel panel_9_1_1_1_1_1_1_2 = new JxPanel();
		panel_9_1_1_1_1_1_1_2.setTheme(theme);
		panel_9_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_1_1_1_2.setLayout(null);

		panel_9_1_1_1_1_1_1_2.setBounds(723, 0, 60, 26);
		panel_6_1_1_1_1_1_1_2.add(panel_9_1_1_1_1_1_1_2);

		rbMedication0 = new JxRadioButton();
		rbMedication0.setTheme(theme);
		bgMedications.add(rbMedication0);

		rbMedication0.setBounds(21, 3, 21, 19);
		rbMedication0.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updateScore();
			}
		});
		panel_9_1_1_1_1_1_1_2.add(rbMedication0);

		final JxPanel panel_6_1_1_1_1_1_1_1_2 = new JxPanel();
		panel_6_1_1_1_1_1_1_1_2.setTheme(theme);
		panel_6_1_1_1_1_1_1_1_2.setLayout(null);

		panel_6_1_1_1_1_1_1_1_2.setBounds(139, 74, 789, 26);
		panel_4_1_1_1_1_1.add(panel_6_1_1_1_1_1_1_1_2);

		final JxPanel panel_7_1_1_1_1_1_1_1_2 = new JxPanel();
		panel_7_1_1_1_1_1_1_1_2.setTheme(theme);
		panel_7_1_1_1_1_1_1_1_2
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_1_1_1_1_2.setLayout(null);

		panel_7_1_1_1_1_1_1_1_2.setBounds(0, 0, 67, 26);
		panel_6_1_1_1_1_1_1_1_2.add(panel_7_1_1_1_1_1_1_1_2);

		final JxLabel label_1_1_1_1_1_1_1_2 = new JxLabel();
		label_1_1_1_1_1_1_1_2.setTheme(theme);

		label_1_1_1_1_1_1_1_2.setText("2");
		label_1_1_1_1_1_1_1_2.setBounds(26, 0, 16, 26);
		panel_7_1_1_1_1_1_1_1_2.add(label_1_1_1_1_1_1_1_2);

		final JxPanel panel_8_1_1_1_1_1_1_1_2 = new JxPanel();
		panel_8_1_1_1_1_1_1_1_2.setTheme(theme);
		panel_8_1_1_1_1_1_1_1_2
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_1_1_1_1_2.setLayout(null);

		panel_8_1_1_1_1_1_1_1_2.setBounds(66, 0, 659, 26);
		panel_6_1_1_1_1_1_1_1_2.add(panel_8_1_1_1_1_1_1_1_2);

		final JxLabel alertorientedLabel_1_1_1_1_1_1_1_2 = new JxLabel();
		alertorientedLabel_1_1_1_1_1_1_1_2.setTheme(theme);

		alertorientedLabel_1_1_1_1_1_1_1_2
				.setText("TAKES 1 - 2 of these medication taken currently and/or within last 7 days");
		alertorientedLabel_1_1_1_1_1_1_1_2.setBounds(10, 5, 639, 16);
		panel_8_1_1_1_1_1_1_1_2.add(alertorientedLabel_1_1_1_1_1_1_1_2);

		final JxPanel panel_9_1_1_1_1_1_1_1_2 = new JxPanel();
		panel_9_1_1_1_1_1_1_1_2.setTheme(theme);
		panel_9_1_1_1_1_1_1_1_2
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_1_1_1_1_2.setLayout(null);

		panel_9_1_1_1_1_1_1_1_2.setBounds(723, 0, 60, 26);
		panel_6_1_1_1_1_1_1_1_2.add(panel_9_1_1_1_1_1_1_1_2);

		rbMedications2 = new JxRadioButton();
		rbMedications2.setTheme(theme);
		bgMedications.add(rbMedications2);

		rbMedications2.setBounds(21, 3, 21, 19);
		rbMedications2.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updateScore();
			}
		});
		panel_9_1_1_1_1_1_1_1_2.add(rbMedications2);

		final JxPanel panel_6_1_1_1_1_1_1_1_1_2 = new JxPanel();
		panel_6_1_1_1_1_1_1_1_1_2.setTheme(theme);
		panel_6_1_1_1_1_1_1_1_1_2.setLayout(null);

		panel_6_1_1_1_1_1_1_1_1_2.setBounds(139, 99, 789, 26);
		panel_4_1_1_1_1_1.add(panel_6_1_1_1_1_1_1_1_1_2);

		final JxPanel panel_7_1_1_1_1_1_1_1_1_2 = new JxPanel();
		panel_7_1_1_1_1_1_1_1_1_2.setTheme(theme);
		panel_7_1_1_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_7_1_1_1_1_1_1_1_1_2.setLayout(null);

		panel_7_1_1_1_1_1_1_1_1_2.setBounds(0, 0, 67, 26);
		panel_6_1_1_1_1_1_1_1_1_2.add(panel_7_1_1_1_1_1_1_1_1_2);

		final JxLabel label_1_1_1_1_1_1_1_1_2 = new JxLabel();
		label_1_1_1_1_1_1_1_1_2.setTheme(theme);

		label_1_1_1_1_1_1_1_1_2.setText("4");
		label_1_1_1_1_1_1_1_1_2.setBounds(26, 0, 16, 26);
		panel_7_1_1_1_1_1_1_1_1_2.add(label_1_1_1_1_1_1_1_1_2);

		final JxPanel panel_8_1_1_1_1_1_1_1_1_2 = new JxPanel();
		panel_8_1_1_1_1_1_1_1_1_2.setTheme(theme);
		panel_8_1_1_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_8_1_1_1_1_1_1_1_1_2.setLayout(null);

		panel_8_1_1_1_1_1_1_1_1_2.setBounds(66, 0, 659, 26);
		panel_6_1_1_1_1_1_1_1_1_2.add(panel_8_1_1_1_1_1_1_1_1_2);

		final JxLabel alertorientedLabel_1_1_1_1_1_1_1_1_2 = new JxLabel();
		alertorientedLabel_1_1_1_1_1_1_1_1_2.setTheme(theme);

		alertorientedLabel_1_1_1_1_1_1_1_1_2
				.setText("TAKES 3 - 4  of these medication taken currently and/or within last 7 days");
		alertorientedLabel_1_1_1_1_1_1_1_1_2.setBounds(10, 5, 639, 16);
		panel_8_1_1_1_1_1_1_1_1_2.add(alertorientedLabel_1_1_1_1_1_1_1_1_2);

		final JxPanel panel_9_1_1_1_1_1_1_1_1_2 = new JxPanel();
		panel_9_1_1_1_1_1_1_1_1_2.setTheme(theme);
		panel_9_1_1_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_1_1_1_1_1_1_1_1_2.setLayout(null);

		panel_9_1_1_1_1_1_1_1_1_2.setBounds(723, 0, 60, 26);
		panel_6_1_1_1_1_1_1_1_1_2.add(panel_9_1_1_1_1_1_1_1_1_2);

		rbMedications4 = new JxRadioButton();
		rbMedications4.setTheme(theme);
		bgMedications.add(rbMedications4);

		rbMedications4.setBounds(21, 3, 21, 19);
		rbMedications4.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updateScore();
			}
		});
		panel_9_1_1_1_1_1_1_1_1_2.add(rbMedications4);

		final JxPanel panel_6_1_1_1_1_1_1_1_1_1_2 = new JxPanel();
		panel_6_1_1_1_1_1_1_1_1_1_2.setTheme(theme);
		panel_6_1_1_1_1_1_1_1_1_1_2.setLayout(null);

		panel_6_1_1_1_1_1_1_1_1_1_2.setBounds(139, 124, 789, 26);
		panel_4_1_1_1_1_1.add(panel_6_1_1_1_1_1_1_1_1_1_2);

		final JxPanel panel_7_1_1_1_1_1_1_1_1_1_2 = new JxPanel();
		panel_7_1_1_1_1_1_1_1_1_1_2.setTheme(theme);
		panel_7_1_1_1_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_7_1_1_1_1_1_1_1_1_1_2.setLayout(null);

		panel_7_1_1_1_1_1_1_1_1_1_2.setBounds(0, 0, 67, 26);
		panel_6_1_1_1_1_1_1_1_1_1_2.add(panel_7_1_1_1_1_1_1_1_1_1_2);

		final JxLabel label_1_1_1_1_1_1_1_1_1_2 = new JxLabel();
		label_1_1_1_1_1_1_1_1_1_2.setTheme(theme);

		label_1_1_1_1_1_1_1_1_1_2.setText("1");
		label_1_1_1_1_1_1_1_1_1_2.setBounds(26, 0, 16, 26);
		panel_7_1_1_1_1_1_1_1_1_1_2.add(label_1_1_1_1_1_1_1_1_1_2);

		final JxPanel panel_8_1_1_1_1_1_1_1_1_1_2 = new JxPanel();
		panel_8_1_1_1_1_1_1_1_1_1_2.setTheme(theme);
		panel_8_1_1_1_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_8_1_1_1_1_1_1_1_1_1_2.setLayout(null);

		panel_8_1_1_1_1_1_1_1_1_1_2.setBounds(66, 0, 659, 26);
		panel_6_1_1_1_1_1_1_1_1_1_2.add(panel_8_1_1_1_1_1_1_1_1_1_2);

		final JxLabel alertorientedLabel_1_1_1_1_1_1_1_1_1_2 = new JxLabel();
		alertorientedLabel_1_1_1_1_1_1_1_1_1_2.setTheme(theme);

		alertorientedLabel_1_1_1_1_1_1_1_1_1_2
				.setText("If resident had a change in medication and/or change in dosage in the last 5 days");
		alertorientedLabel_1_1_1_1_1_1_1_1_1_2.setBounds(10, 5, 639, 16);
		panel_8_1_1_1_1_1_1_1_1_1_2.add(alertorientedLabel_1_1_1_1_1_1_1_1_1_2);

		final JxPanel panel_9_1_1_1_1_1_1_1_1_1_2 = new JxPanel();
		panel_9_1_1_1_1_1_1_1_1_1_2.setTheme(theme);
		panel_9_1_1_1_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_1_1_1_1_1_1_1_1_1_2.setLayout(null);

		panel_9_1_1_1_1_1_1_1_1_1_2.setBounds(723, 0, 60, 26);
		panel_6_1_1_1_1_1_1_1_1_1_2.add(panel_9_1_1_1_1_1_1_1_1_1_2);

		rbMedications1 = new JxRadioButton();
		rbMedications1.setTheme(theme);
		bgMedications.add(rbMedications1);

		rbMedications1.setBounds(21, 3, 21, 19);
		rbMedications1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updateScore();
			}
		});
		panel_9_1_1_1_1_1_1_1_1_1_2.add(rbMedications1);

		final JxPanel panel_4_1_1_1_1_1_1 = new JxPanel();
		panel_4_1_1_1_1_1_1.setTheme(theme);
		panel_4_1_1_1_1_1_1.setLayout(null);

		panel_4_1_1_1_1_1_1.setBounds(0, 856, 928, 126);
		add(panel_4_1_1_1_1_1_1);

		final JxPanel panel_5_1_1_1_1_1_1 = new JxPanel();
		panel_5_1_1_1_1_1_1.setTheme(theme);
		panel_5_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1_1_1_1.setLayout(null);

		panel_5_1_1_1_1_1_1.setBounds(0, 0, 141, 125);
		panel_4_1_1_1_1_1_1.add(panel_5_1_1_1_1_1_1);

		final JxTextA levelOfConscienceTextArea_1_1_1_1_1_1 = new JxTextA();
		levelOfConscienceTextArea_1_1_1_1_1_1.setTheme(theme);
		levelOfConscienceTextArea_1_1_1_1_1_1.setWrapStyleWord(true);
		levelOfConscienceTextArea_1_1_1_1_1_1.setText("PREDISPOSING DISEASES");
		levelOfConscienceTextArea_1_1_1_1_1_1.setLineWrap(true);

		levelOfConscienceTextArea_1_1_1_1_1_1.setFontSize(14);
		levelOfConscienceTextArea_1_1_1_1_1_1.setFontStyle(Font.BOLD);
		levelOfConscienceTextArea_1_1_1_1_1_1.setEditable(false);

		levelOfConscienceTextArea_1_1_1_1_1_1.setBounds(10, 10, 121, 57);
		panel_5_1_1_1_1_1_1.add(levelOfConscienceTextArea_1_1_1_1_1_1);

		final JxPanel panel_6_2_1_1_1_1_1 = new JxPanel();
		panel_6_2_1_1_1_1_1.setTheme(theme);
		panel_6_2_1_1_1_1_1.setLayout(null);

		panel_6_2_1_1_1_1_1.setBounds(139, 0, 789, 51);
		panel_4_1_1_1_1_1_1.add(panel_6_2_1_1_1_1_1);

		final JxPanel panel_8_2_1_1_1_1_1 = new JxPanel();
		panel_8_2_1_1_1_1_1.setTheme(theme);
		panel_8_2_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_1_1_1_1_1.setLayout(null);

		panel_8_2_1_1_1_1_1.setBounds(0, 0, 725, 51);
		panel_6_2_1_1_1_1_1.add(panel_8_2_1_1_1_1_1);

		final JxTextA toAssessTheTextArea_1_1 = new JxTextA();
		toAssessTheTextArea_1_1.setTheme(theme);

		toAssessTheTextArea_1_1.setWrapStyleWord(true);
		toAssessTheTextArea_1_1
				.setText("Respond below based on the following predisposing conditions: Ypotension, Vertigo, CVA, Parkinson's disease, Loss of limb(s), Seizures, Arthritis, Osteoporosis, Fractures.");
		toAssessTheTextArea_1_1.setLineWrap(true);

		toAssessTheTextArea_1_1.setEditable(false);
		toAssessTheTextArea_1_1.setBounds(10, 10, 705, 31);
		panel_8_2_1_1_1_1_1.add(toAssessTheTextArea_1_1);

		final JxPanel panel_9_2_1_1_1_1_1 = new JxPanel();
		panel_9_2_1_1_1_1_1.setTheme(theme);
		panel_9_2_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_1_1_1_1.setLayout(null);

		panel_9_2_1_1_1_1_1.setBounds(723, 0, 60, 51);
		panel_6_2_1_1_1_1_1.add(panel_9_2_1_1_1_1_1);

		final JxPanel panel_6_1_1_1_1_1_1_2_1 = new JxPanel();
		panel_6_1_1_1_1_1_1_2_1.setTheme(theme);
		panel_6_1_1_1_1_1_1_2_1.setLayout(null);

		panel_6_1_1_1_1_1_1_2_1.setBounds(139, 50, 789, 26);
		panel_4_1_1_1_1_1_1.add(panel_6_1_1_1_1_1_1_2_1);

		final JxPanel panel_7_1_1_1_1_1_1_2_1 = new JxPanel();
		panel_7_1_1_1_1_1_1_2_1.setTheme(theme);
		panel_7_1_1_1_1_1_1_2_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_1_1_1_2_1.setLayout(null);

		panel_7_1_1_1_1_1_1_2_1.setBounds(0, 0, 67, 26);
		panel_6_1_1_1_1_1_1_2_1.add(panel_7_1_1_1_1_1_1_2_1);

		final JxLabel label_1_1_1_1_1_1_2_1 = new JxLabel();
		label_1_1_1_1_1_1_2_1.setTheme(theme);

		label_1_1_1_1_1_1_2_1.setText("0");
		label_1_1_1_1_1_1_2_1.setBounds(26, 0, 16, 26);
		panel_7_1_1_1_1_1_1_2_1.add(label_1_1_1_1_1_1_2_1);

		final JxPanel panel_8_1_1_1_1_1_1_2_1 = new JxPanel();
		panel_8_1_1_1_1_1_1_2_1.setTheme(theme);
		panel_8_1_1_1_1_1_1_2_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_1_1_1_2_1.setLayout(null);

		panel_8_1_1_1_1_1_1_2_1.setBounds(66, 0, 659, 26);
		panel_6_1_1_1_1_1_1_2_1.add(panel_8_1_1_1_1_1_1_2_1);

		final JxLabel alertorientedLabel_1_1_1_1_1_1_2_1 = new JxLabel();
		alertorientedLabel_1_1_1_1_1_1_2_1.setTheme(theme);

		alertorientedLabel_1_1_1_1_1_1_2_1.setText("NONE PRESENT");
		alertorientedLabel_1_1_1_1_1_1_2_1.setBounds(10, 5, 639, 16);
		panel_8_1_1_1_1_1_1_2_1.add(alertorientedLabel_1_1_1_1_1_1_2_1);

		final JxPanel panel_9_1_1_1_1_1_1_2_1 = new JxPanel();
		panel_9_1_1_1_1_1_1_2_1.setTheme(theme);
		panel_9_1_1_1_1_1_1_2_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_1_1_1_2_1.setLayout(null);

		panel_9_1_1_1_1_1_1_2_1.setBounds(723, 0, 60, 26);
		panel_6_1_1_1_1_1_1_2_1.add(panel_9_1_1_1_1_1_1_2_1);

		rbPredisposing0 = new JxRadioButton();
		rbPredisposing0.setTheme(theme);
		bgPredisposing.add(rbPredisposing0);

		rbPredisposing0.setBounds(21, 3, 21, 19);
		rbPredisposing0.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updateScore();
			}
		});
		panel_9_1_1_1_1_1_1_2_1.add(rbPredisposing0);

		final JxPanel panel_6_1_1_1_1_1_1_1_2_1 = new JxPanel();
		panel_6_1_1_1_1_1_1_1_2_1.setTheme(theme);
		panel_6_1_1_1_1_1_1_1_2_1.setLayout(null);

		panel_6_1_1_1_1_1_1_1_2_1.setBounds(139, 74, 789, 26);
		panel_4_1_1_1_1_1_1.add(panel_6_1_1_1_1_1_1_1_2_1);

		final JxPanel panel_7_1_1_1_1_1_1_1_2_1 = new JxPanel();
		panel_7_1_1_1_1_1_1_1_2_1.setTheme(theme);
		panel_7_1_1_1_1_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_7_1_1_1_1_1_1_1_2_1.setLayout(null);

		panel_7_1_1_1_1_1_1_1_2_1.setBounds(0, 0, 67, 26);
		panel_6_1_1_1_1_1_1_1_2_1.add(panel_7_1_1_1_1_1_1_1_2_1);

		final JxLabel label_1_1_1_1_1_1_1_2_1 = new JxLabel();
		label_1_1_1_1_1_1_1_2_1.setTheme(theme);

		label_1_1_1_1_1_1_1_2_1.setText("2");
		label_1_1_1_1_1_1_1_2_1.setBounds(26, 0, 16, 26);
		panel_7_1_1_1_1_1_1_1_2_1.add(label_1_1_1_1_1_1_1_2_1);

		final JxPanel panel_8_1_1_1_1_1_1_1_2_1 = new JxPanel();
		panel_8_1_1_1_1_1_1_1_2_1.setTheme(theme);
		panel_8_1_1_1_1_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_8_1_1_1_1_1_1_1_2_1.setLayout(null);

		panel_8_1_1_1_1_1_1_1_2_1.setBounds(66, 0, 659, 26);
		panel_6_1_1_1_1_1_1_1_2_1.add(panel_8_1_1_1_1_1_1_1_2_1);

		final JxLabel alertorientedLabel_1_1_1_1_1_1_1_2_1 = new JxLabel();
		alertorientedLabel_1_1_1_1_1_1_1_2_1.setTheme(theme);

		alertorientedLabel_1_1_1_1_1_1_1_2_1.setText("1 - 2 PRESENT");
		alertorientedLabel_1_1_1_1_1_1_1_2_1.setBounds(10, 5, 639, 16);
		panel_8_1_1_1_1_1_1_1_2_1.add(alertorientedLabel_1_1_1_1_1_1_1_2_1);

		final JxPanel panel_9_1_1_1_1_1_1_1_2_1 = new JxPanel();
		panel_9_1_1_1_1_1_1_1_2_1.setTheme(theme);
		panel_9_1_1_1_1_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_1_1_1_1_1_1_1_2_1.setLayout(null);

		panel_9_1_1_1_1_1_1_1_2_1.setBounds(723, 0, 60, 26);
		panel_6_1_1_1_1_1_1_1_2_1.add(panel_9_1_1_1_1_1_1_1_2_1);

		rbPredisposing2 = new JxRadioButton();
		rbPredisposing2.setTheme(theme);
		bgPredisposing.add(rbPredisposing2);

		rbPredisposing2.setBounds(21, 3, 21, 19);
		rbPredisposing2.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updateScore();
			}
		});
		panel_9_1_1_1_1_1_1_1_2_1.add(rbPredisposing2);

		final JxPanel panel_6_1_1_1_1_1_1_1_1_2_1 = new JxPanel();
		panel_6_1_1_1_1_1_1_1_1_2_1.setTheme(theme);
		panel_6_1_1_1_1_1_1_1_1_2_1.setLayout(null);

		panel_6_1_1_1_1_1_1_1_1_2_1.setBounds(139, 99, 789, 26);
		panel_4_1_1_1_1_1_1.add(panel_6_1_1_1_1_1_1_1_1_2_1);

		final JxPanel panel_7_1_1_1_1_1_1_1_1_2_1 = new JxPanel();
		panel_7_1_1_1_1_1_1_1_1_2_1.setTheme(theme);
		panel_7_1_1_1_1_1_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_7_1_1_1_1_1_1_1_1_2_1.setLayout(null);

		panel_7_1_1_1_1_1_1_1_1_2_1.setBounds(0, 0, 67, 26);
		panel_6_1_1_1_1_1_1_1_1_2_1.add(panel_7_1_1_1_1_1_1_1_1_2_1);

		final JxLabel label_1_1_1_1_1_1_1_1_2_1 = new JxLabel();
		label_1_1_1_1_1_1_1_1_2_1.setTheme(theme);

		label_1_1_1_1_1_1_1_1_2_1.setText("4");
		label_1_1_1_1_1_1_1_1_2_1.setBounds(26, 0, 16, 26);
		panel_7_1_1_1_1_1_1_1_1_2_1.add(label_1_1_1_1_1_1_1_1_2_1);

		final JxPanel panel_8_1_1_1_1_1_1_1_1_2_1 = new JxPanel();
		panel_8_1_1_1_1_1_1_1_1_2_1.setTheme(theme);
		panel_8_1_1_1_1_1_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_8_1_1_1_1_1_1_1_1_2_1.setLayout(null);

		panel_8_1_1_1_1_1_1_1_1_2_1.setBounds(66, 0, 659, 26);
		panel_6_1_1_1_1_1_1_1_1_2_1.add(panel_8_1_1_1_1_1_1_1_1_2_1);

		final JxLabel alertorientedLabel_1_1_1_1_1_1_1_1_2_1 = new JxLabel();
		alertorientedLabel_1_1_1_1_1_1_1_1_2_1.setTheme(theme);

		alertorientedLabel_1_1_1_1_1_1_1_1_2_1.setText("3 - 4 PRESENT");
		alertorientedLabel_1_1_1_1_1_1_1_1_2_1.setBounds(10, 5, 639, 16);
		panel_8_1_1_1_1_1_1_1_1_2_1.add(alertorientedLabel_1_1_1_1_1_1_1_1_2_1);

		final JxPanel panel_9_1_1_1_1_1_1_1_1_2_1 = new JxPanel();
		panel_9_1_1_1_1_1_1_1_1_2_1.setTheme(theme);
		panel_9_1_1_1_1_1_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_1_1_1_1_1_1_1_1_2_1.setLayout(null);

		panel_9_1_1_1_1_1_1_1_1_2_1.setBounds(723, 0, 60, 26);
		panel_6_1_1_1_1_1_1_1_1_2_1.add(panel_9_1_1_1_1_1_1_1_1_2_1);

		rbPredisposing4 = new JxRadioButton();
		rbPredisposing4.setTheme(theme);
		bgPredisposing.add(rbPredisposing4);

		rbPredisposing4.setBounds(21, 3, 21, 19);
		rbPredisposing4.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updateScore();
			}
		});
		panel_9_1_1_1_1_1_1_1_1_2_1.add(rbPredisposing4);

		final JxPanel panel_10 = new JxPanel();
		panel_10.setTheme(theme);
		panel_10.setLayout(null);
		panel_10.setBackground(Color.BLACK);
		panel_10.setBounds(0, 981, 864, 26);
		add(panel_10);

		final JxLabel parameterLabel_2_1 = new JxLabel();
		parameterLabel_2_1.setTheme(theme);
		parameterLabel_2_1.setForeground(new Color(255, 255, 255));

		parameterLabel_2_1.setFontSize(14);
		parameterLabel_2_1.setFontStyle(Font.BOLD);
		parameterLabel_2_1
				.setText("Total Score of 10 or above represents HIGH RISK");
		parameterLabel_2_1.setBounds(250, 0, 368, 30);
		panel_10.add(parameterLabel_2_1);

		final JxPanel panel_7_1_1_1_1_1_1_1_1_2_1_1 = new JxPanel();
		panel_7_1_1_1_1_1_1_1_1_2_1_1.setTheme(theme);
		panel_7_1_1_1_1_1_1_1_1_2_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_7_1_1_1_1_1_1_1_1_2_1_1.setLayout(null);

		panel_7_1_1_1_1_1_1_1_1_2_1_1.setBounds(861, 981, 61, 26);
		add(panel_7_1_1_1_1_1_1_1_1_2_1_1);

		lblTotal = new JxLabel();
		lblTotal.setTheme(theme);

		lblTotal.setText("        00");
		lblTotal.setBounds(22, 0, 60, 26);
		panel_7_1_1_1_1_1_1_1_1_2_1_1.add(lblTotal);

		panel_12 = new JxPanel();
		panel_12.setTheme(theme);
		panel_12.setLayout(null);

		panel_12.setBounds(10, 1031, 900, 38);
		add(panel_12);

		ifSoWhatLabel = new JxLabel();
		ifSoWhatLabel.setTheme(theme);

		ifSoWhatLabel.setText("Nurse Signature:");
		ifSoWhatLabel.setBounds(21, 5, 91, 16);
		panel_12.add(ifSoWhatLabel);

		cmbNurse = new JxComboBox();
		cmbNurse.setTheme(theme);

		cmbNurse.setBounds(123, 4, 181, 20);
		cmbNurse.setVisible(false);
		panel_12.add(cmbNurse);

		dateLabel = new JxLabel();
		dateLabel.setTheme(theme);

		dateLabel.setText("Date :");
		dateLabel.setBounds(511, 5, 42, 16);
		panel_12.add(dateLabel);

		dcNurseVisit = new JxDateChooser();
		dcNurseVisit.setTheme(theme);

		dcNurseVisit.setDate(MedrexClientManager.getServerTime());
		dcNurseVisit.setDateFormatString("MM/dd/yyyy");
		dcNurseVisit.setBounds(573, 1, 168, 26);
		panel_12.add(dcNurseVisit);

		final PanelloggedInUser panel_11 = new PanelloggedInUser();
		panel_11.setFont(Font_Plain);
		panel_11.setBounds(118, 0, 353, 38);
		panel_12.add(panel_11);

		final JxLabel residentNameLabel = new JxLabel();
		residentNameLabel.setTheme(theme);

		residentNameLabel.setText("Resident Name :");
		residentNameLabel.setBounds(159, 30, 102, 14);
		add(residentNameLabel);

		lblResidentName = new JxLabel();
		lblResidentName.setTheme(theme);
		lblResidentName.setFont(new Font("Arial", Font.BOLD, 11));
		lblResidentName.setBounds(267, 29, 172, 18);

		add(lblResidentName);

		final JxLabel roomLabel = new JxLabel();
		roomLabel.setTheme(theme);

		roomLabel.setText("Room # :");
		roomLabel.setBounds(544, 32, 54, 14);
		add(roomLabel);

		llblRoom = new JxLabel();
		llblRoom.setTheme(theme);
		llblRoom.setFont(new Font("Arial", Font.BOLD, 11));

		llblRoom.setBounds(604, 29, 77, 18);

		add(llblRoom);

		doLoad();

	}

	public void doLoad() {
		fillCombos();
		doUpdate();
	}

	public void fillCombos() {
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
			}
		} catch (Exception e) {
		}
		cmbNurse.setVisible(false);
	}

	public void updateScore() {
		try {

			int sum = 0;
			int temp = 0;
			if (rbConscienceAlert.isSelected()) {
				temp = 0;
			}
			if (rbConscienceDisOriented.isSelected()) {
				temp = 2;
			}
			if (rbConscienceIntermittent.isSelected()) {
				temp = 4;
			}
			sum = sum + temp;

			temp = 0;

			if (rbFallsNoFalls.isSelected()) {
				temp = 0;
			}
			if (rbFalls12.isSelected()) {
				temp = 2;
			}
			if (rbFalls3.isSelected()) {
				temp = 4;
			}

			sum = sum + temp;

			temp = 0;

			if (rbAmbulation0.isSelected()) {
				temp = 0;
			}
			if (rbAmbulation2.isSelected()) {
				temp = 2;
			}
			if (rbAmbulation4.isSelected()) {
				temp = 4;
			}

			sum = sum + temp;

			temp = 0;

			if (rbVision0.isSelected()) {
				temp = 0;
			}
			if (rbVision2.isSelected()) {
				temp = 2;
			}
			if (rbVision4.isSelected()) {
				temp = 4;
			}

			sum = sum + temp;

			temp = 0;

			if (rbGait0.isSelected()) {
				temp = 0;
			}

			if (rbGait1.isSelected()) {
				temp = 1;
			}

			if (rbGait2.isSelected()) {
				temp = 1;
			}

			if (rbGait3.isSelected()) {
				temp = 1;
			}

			if (rbGait4.isSelected()) {
				temp = 1;
			}

			if (rbGait5.isSelected()) {
				temp = 1;
			}

			if (rbGait6.isSelected()) {
				temp = 1;
			}

			if (rbGait7.isSelected()) {
				temp = 2;
			}

			sum = sum + temp;

			temp = 0;

			if (rbSystolic0.isSelected()) {
				temp = 0;
			}
			if (rbSystolic2.isSelected()) {
				temp = 2;
			}
			if (rbSystolic4.isSelected()) {
				temp = 4;
			}

			sum = sum + temp;

			temp = 0;

			if (rbMedication0.isSelected()) {
				temp = 0;
			}
			if (rbMedications1.isSelected()) {
				temp = 1;
			}
			if (rbMedications2.isSelected()) {
				temp = 2;
			}
			if (rbMedications4.isSelected()) {
				temp = 4;
			}

			sum = sum + temp;

			temp = 0;

			if (rbPredisposing0.isSelected()) {
				temp = 0;
			}
			if (rbPredisposing2.isSelected()) {
				temp = 2;
			}
			if (rbPredisposing4.isSelected()) {
				temp = 4;
			}

			sum = sum + temp;

			lblTotal.setText(sum + "");
		} catch (Exception e) {
			lblTotal.setText("0");
		}
	}

	public void doUpdate() {
		int resId = Global.currentResidenceKey;
		ResidentMain rm = null;
		TempRoomHistory roomHist = null;
		try {
			rm = MedrexClientManager.getInstance().getResident(resId);
			roomHist = MedrexClientManager.getInstance()
					.getCurrentRoomForResident(resId);
		} catch (Exception e) {
		}
		lblResidentName.setText(rm.getUserPass() + " " + rm.getUserName());
		/* TODO: Migrating to room history ----- Done */
		// llblRoom.setText(rm.getRoom());
		if (roomHist != null) {
			llblRoom.setText(roomHist.getRoom());
		}
		if (Global.currentResidentAssessmentFormKey == 0) {
			Global.currentResidentAssessmentFormPage5Key = 0;
			rbPredisposing4.setSelected(false);
			rbPredisposing2.setSelected(false);
			rbPredisposing0.setSelected(false);
			rbMedications1.setSelected(false);
			rbMedications4.setSelected(false);
			rbMedications2.setSelected(false);
			rbMedication0.setSelected(false);
			rbSystolic4.setSelected(false);
			rbSystolic2.setSelected(false);
			rbSystolic0.setSelected(false);
			rbGait7.setSelected(false);
			rbGait6.setSelected(false);
			rbGait5.setSelected(false);
			rbGait4.setSelected(false);
			rbGait3.setSelected(false);
			rbGait2.setSelected(false);
			rbGait1.setSelected(false);
			rbGait0.setSelected(false);
			rbVision4.setSelected(false);
			rbVision2.setSelected(false);
			rbVision0.setSelected(false);
			rbAmbulation4.setSelected(false);
			rbAmbulation2.setSelected(false);
			rbAmbulation0.setSelected(false);

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
			ResidentAssessmentFormPage5 rafp5 = null;
			rbPredisposing4.setSelected(false);
			rbPredisposing2.setSelected(false);
			rbPredisposing0.setSelected(false);
			rbMedications1.setSelected(false);
			rbMedications4.setSelected(false);
			rbMedications2.setSelected(false);
			rbMedication0.setSelected(false);
			rbSystolic4.setSelected(false);
			rbSystolic2.setSelected(false);
			rbSystolic0.setSelected(false);
			rbGait7.setSelected(false);
			rbGait6.setSelected(false);
			rbGait5.setSelected(false);
			rbGait4.setSelected(false);
			rbGait3.setSelected(false);
			rbGait2.setSelected(false);
			rbGait1.setSelected(false);
			rbGait0.setSelected(false);
			rbVision4.setSelected(false);
			rbVision2.setSelected(false);
			rbVision0.setSelected(false);
			rbAmbulation4.setSelected(false);
			rbAmbulation2.setSelected(false);
			rbAmbulation0.setSelected(false);

			try {
				rafp5 = MedrexClientManager.getInstance()
						.getResidentAssessmentFormPage5(
								Global.currentResidentAssessmentFormKey);
			} catch (Exception e) {

			}
			Global.currentResidentAssessmentFormPage5Key = rafp5.getSerial();

			dcNurseVisit.setDate(rafp5.getNurseVisit());
			cmbNurse.setSelectedItem(rafp5.getNurse());

			switch (rafp5.getScoreConscience()) {
			case 0:
				rbConscienceAlert.setSelected(true);
				break;
			case 2:
				rbConscienceDisOriented.setSelected(true);
				break;
			case 4:
				rbConscienceIntermittent.setSelected(true);
				break;
			}

			switch (rafp5.getScoreFall()) {
			case 0:
				rbFallsNoFalls.setSelected(true);
				break;
			case 2:
				rbFalls12.setSelected(true);
				break;
			case 4:
				rbFalls3.setSelected(true);
				break;
			}

			switch (rafp5.getScoreAmbulation()) {
			case 0:
				rbAmbulation0.setSelected(true);
				break;
			case 2:
				rbAmbulation2.setSelected(true);
				break;
			case 4:
				rbAmbulation4.setSelected(true);
				break;
			}

			switch (rafp5.getScoreVision()) {
			case 0:
				rbVision0.setSelected(true);
				break;
			case 2:
				rbVision2.setSelected(true);
				break;
			case 4:
				rbVision4.setSelected(true);
				break;
			}

			switch (rafp5.getScoreGait()) {
			case 0:
				rbGait0.setSelected(true);
				break;
			case 1:
				rbGait1.setSelected(true);
				break;
			case 2:
				rbGait2.setSelected(true);
				break;
			case 3:
				rbGait3.setSelected(true);
				break;
			case 4:
				rbGait4.setSelected(true);
				break;
			case 5:
				rbGait5.setSelected(true);
				break;
			case 6:
				rbGait6.setSelected(true);
				break;
			case 7:
				rbGait7.setSelected(true);
				break;
			}

			switch (rafp5.getScoreSystolic()) {
			case 0:
				rbSystolic0.setSelected(true);
				break;
			case 2:
				rbSystolic2.setSelected(true);
				break;
			case 4:
				rbSystolic4.setSelected(true);
				break;
			}

			switch (rafp5.getScoreMedication()) {
			case 0:
				rbMedication0.setSelected(true);
				break;
			case 1:
				rbMedications1.setSelected(true);
				break;
			case 2:
				rbMedications2.setSelected(true);
				break;
			case 4:
				rbMedications4.setSelected(true);
				break;
			}

			switch (rafp5.getScorePredisposing()) {
			case 0:
				rbPredisposing0.setSelected(true);
				break;
			case 2:
				rbPredisposing2.setSelected(true);
				break;
			case 4:
				rbPredisposing4.setSelected(true);
				break;
			}

		}
		updateScore();
	}

	public int doSave() {
		ResidentAssessmentFormPage5 rafp5 = new ResidentAssessmentFormPage5();
		rafp5.setSerial(Global.currentResidentAssessmentFormPage5Key);
		rafp5.setFormId(Global.currentResidentAssessmentFormKey);

		rafp5.setNurseVisit(dcNurseVisit.getDate());
		rafp5.setNurse((String) cmbNurse.getSelectedItem());

		rafp5.setScoreConscience(-1);
		rafp5.setScoreFall(-1);
		rafp5.setScoreVision(-1);
		rafp5.setScoreGait(-1);
		rafp5.setScoreSystolic(-1);
		rafp5.setScoreMedication(-1);
		rafp5.setScorePredisposing(-1);
		rafp5.setScoreAmbulation(-1);

		if (rbConscienceAlert.isSelected()) {
			rafp5.setScoreConscience(0);
		}
		if (rbConscienceDisOriented.isSelected()) {
			rafp5.setScoreConscience(2);
		}
		if (rbConscienceIntermittent.isSelected()) {
			rafp5.setScoreConscience(4);
		}

		if (rbFallsNoFalls.isSelected()) {
			rafp5.setScoreFall(0);
		}
		if (rbFalls12.isSelected()) {
			rafp5.setScoreFall(2);
		}
		if (rbFalls3.isSelected()) {
			rafp5.setScoreFall(4);
		}

		if (rbAmbulation0.isSelected()) {
			rafp5.setScoreAmbulation(0);
		}
		if (rbAmbulation2.isSelected()) {
			rafp5.setScoreAmbulation(2);
		}
		if (rbAmbulation4.isSelected()) {
			rafp5.setScoreAmbulation(4);
		}

		if (rbVision0.isSelected()) {
			rafp5.setScoreVision(0);
		}
		if (rbVision2.isSelected()) {
			rafp5.setScoreVision(2);
		}
		if (rbVision4.isSelected()) {
			rafp5.setScoreVision(4);
		}

		if (rbGait0.isSelected()) {
			rafp5.setScoreGait(0);
		}

		if (rbGait1.isSelected()) {
			rafp5.setScoreGait(1);
		}

		if (rbGait2.isSelected()) {
			rafp5.setScoreGait(2);
		}

		if (rbGait3.isSelected()) {
			rafp5.setScoreGait(3);
		}

		if (rbGait4.isSelected()) {
			rafp5.setScoreGait(4);
		}

		if (rbGait5.isSelected()) {
			rafp5.setScoreGait(5);
		}

		if (rbGait6.isSelected()) {
			rafp5.setScoreGait(6);
		}

		if (rbGait7.isSelected()) {
			rafp5.setScoreGait(7);
		}

		if (rbSystolic0.isSelected()) {
			rafp5.setScoreSystolic(0);
		}
		if (rbSystolic2.isSelected()) {
			rafp5.setScoreSystolic(2);
		}
		if (rbSystolic4.isSelected()) {
			rafp5.setScoreSystolic(4);
		}

		if (rbMedication0.isSelected()) {
			rafp5.setScoreMedication(0);
		}
		if (rbMedications1.isSelected()) {
			rafp5.setScoreMedication(1);
		}
		if (rbMedications2.isSelected()) {
			rafp5.setScoreMedication(2);
		}
		if (rbMedications4.isSelected()) {
			rafp5.setScoreMedication(4);
		}

		if (rbPredisposing0.isSelected()) {
			rafp5.setScorePredisposing(0);
		}
		if (rbPredisposing2.isSelected()) {
			rafp5.setScorePredisposing(2);
		}
		if (rbPredisposing4.isSelected()) {
			rafp5.setScorePredisposing(4);
		}

		try {
			Global.currentResidentAssessmentFormPage5Key = MedrexClientManager
					.getInstance().insertOrUpdateResidentAssessmentFormPage5(
							rafp5);
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
			FieldValidation.Msgbox(vRes, "Resident Assessment Form: Page 5");
			return false;
		} else {
			return true;
		}
	}

}
