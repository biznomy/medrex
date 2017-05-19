package medrex.client.main.admission;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldValidation;
import medrex.commons.intf.Form;
import medrex.commons.vo.admission.ResidentAssessmentFormPage2;
import medrex.commons.vo.others.Nurse;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;

import com.jgoodies.validation.ValidationResult;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTextA;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelResidentAssessmentFormPage2 extends JxPanel implements Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8711437833029503657L;

	Theme theme = new BlackOverWhiteTheme();

	private JxLabel lblRoom;
	private JxLabel lblResidentName;
	private JxLabel lblNurseVisit;

	private JxComboBox cmbSensory;

	private JxComboBox cmbMoisture;

	private JxComboBox cmbActivity;

	private JxComboBox cmbMobility;

	private JxComboBox cmbNutrition;

	private JxComboBox cmbFriction;

	private JxLabel lblTotal;

	private JxComboBox cmbNurse;

	/**
	 * Create the panel
	 */
	public PanelResidentAssessmentFormPage2() {
		super();

		Global.panelResidentAssessmentFormPage2 = this;

		setBorder(new LineBorder(Color.black, 1, false));
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(930, 1200));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setTheme(theme);
		panel.setBackground(Color.BLACK);
		panel.setLayout(null);
		panel.setBounds(0, 36, 930, 26);
		add(panel);

		final JxLabel bradenScaleLabel = new JxLabel();
		bradenScaleLabel.setTheme(theme);
		bradenScaleLabel.setForeground(new Color(255, 255, 255));

		bradenScaleLabel.setFontSize(14);
		bradenScaleLabel.setFontStyle(Font.BOLD);
		// bradenScaleLabel.setSize(fontSize);
		bradenScaleLabel
				.setText("BRADEN SCALE - For predicting Pressure Sore Risk");
		bradenScaleLabel.setBounds(253, 0, 366, 26);
		panel.add(bradenScaleLabel);

		final JxLabel highRiskTotalLabel = new JxLabel();
		highRiskTotalLabel.setTheme(theme);

		highRiskTotalLabel.setFontSize(12);
		highRiskTotalLabel.setFontStyle(Font.BOLD);
		highRiskTotalLabel
				.setText(" HIGH RISK: Total Score < 12                                                MODERATE RISK Total Score 13-14                                            LOW RISK Total Score 15-18 ");
		highRiskTotalLabel.setBounds(0, 61, 930, 26);
		add(highRiskTotalLabel);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setTheme(theme);
		panel_2.setBounds(153, 93, 777, 26);
		add(panel_2);
		panel_2.setBackground(Color.BLACK);
		panel_2.setLayout(null);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setTheme(theme);
		panel_1.setBackground(Color.BLACK);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 93, 152, 26);
		add(panel_1);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setTheme(theme);
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setLayout(null);

		panel_3.setBounds(0, 120, 152, 177);
		add(panel_3);

		final JxLabel sensoryPerceptionLabel = new JxLabel();
		sensoryPerceptionLabel.setTheme(theme);
		sensoryPerceptionLabel.setTheme(theme);

		sensoryPerceptionLabel.setFontSize(12);
		sensoryPerceptionLabel.setFontStyle(Font.BOLD);
		sensoryPerceptionLabel.setText(" SENSORY PERCEPTION");
		sensoryPerceptionLabel.setBounds(0, 0, 152, 22);
		panel_3.add(sensoryPerceptionLabel);

		final JxTextA abilityTextArea = new JxTextA();
		abilityTextArea.setTheme(theme);

		abilityTextArea.setLineWrap(true);
		abilityTextArea
				.setText("Ability to respond meaning fully to pressure-related discomfort.");

		abilityTextArea.setEditable(false);
		abilityTextArea.setBounds(4, 24, 142, 117);
		panel_3.add(abilityTextArea);

		final JxPanel panel_3_1 = new JxPanel();
		panel_3_1.setTheme(theme);
		panel_3_1.setTheme(theme);
		panel_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1.setLayout(null);

		panel_3_1.setBounds(151, 120, 178, 177);
		add(panel_3_1);

		final JxLabel completelyLimitedLabel = new JxLabel();
		completelyLimitedLabel.setTheme(theme);
		completelyLimitedLabel.setTheme(theme);

		completelyLimitedLabel.setFontSize(12);
		completelyLimitedLabel.setFontStyle(Font.BOLD);
		completelyLimitedLabel.setText(" 1. COMPLETELY LIMITED");
		completelyLimitedLabel.setBounds(0, 0, 178, 22);
		panel_3_1.add(completelyLimitedLabel);


		final JxTextA unresponsivedoesNotTextArea = new JxTextA();
		unresponsivedoesNotTextArea.setTheme(theme);


		unresponsivedoesNotTextArea.setWrapStyleWord(true);

		unresponsivedoesNotTextArea
				.setText("Unresponsive(does not moan, flinch, or grasp) to painful stimuli, due to diminished level of consciousness or sedation                              OR                               limited ability to feel pain over most of body surface");
		unresponsivedoesNotTextArea.setLineWrap(true);
		unresponsivedoesNotTextArea.setEditable(false);
		unresponsivedoesNotTextArea.setBounds(5, 24, 163, 143);
		panel_3_1.add(unresponsivedoesNotTextArea);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);
		panel_4.setTheme(theme);

		panel_4.setFontSize(12);
		panel_4.setBackground(Color.BLACK);
		panel_4.setLayout(null);
		panel_4.setBounds(862, 120, 68, 177);
		add(panel_4);

		cmbSensory = new JxComboBox();
		cmbSensory.setTheme(theme);
		cmbSensory.setTheme(theme);
		cmbSensory.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				updateScore();
			}
		});
		cmbSensory.setTheme(theme);

		cmbSensory.setBounds(0, 0, 68, 35);
		panel_4.add(cmbSensory);

		final JxPanel panel_3_1_1 = new JxPanel();
		panel_3_1_1.setTheme(theme);
		panel_3_1_1.setTheme(theme);
		panel_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1.setLayout(null);

		panel_3_1_1.setBounds(326, 120, 178, 177);
		add(panel_3_1_1);

		final JxLabel completelyLimitedLabel_1 = new JxLabel();
		completelyLimitedLabel_1.setTheme(theme);
		completelyLimitedLabel_1.setTheme(theme);

		completelyLimitedLabel_1.setFontSize(12);
		completelyLimitedLabel_1.setFontStyle(Font.BOLD);
		completelyLimitedLabel_1.setText("  2. VERY LIMITED");
		completelyLimitedLabel_1.setBounds(0, 0, 178, 22);
		panel_3_1_1.add(completelyLimitedLabel_1);

		final JxTextA unresponsivedoesNotTextArea_1 = new JxTextA();
		unresponsivedoesNotTextArea_1.setTheme(theme);

		unresponsivedoesNotTextArea_1.setWrapStyleWord(true);
		unresponsivedoesNotTextArea_1
				.setText("Responds only to painful stimuli. Cannot communicate discomfort except by moaning or restlessness.                                   OR                                          has a sensory impairment which limits the ability to feet pain or discomfort over 1/2 of body.");
		unresponsivedoesNotTextArea_1.setLineWrap(true);
		unresponsivedoesNotTextArea_1.setEditable(false);
		unresponsivedoesNotTextArea_1.setBounds(5, 24, 163, 145);
		panel_3_1_1.add(unresponsivedoesNotTextArea_1);

		final JxPanel panel_3_1_1_1 = new JxPanel();
		panel_3_1_1_1.setTheme(theme);
		panel_3_1_1_1.setTheme(theme);
		panel_3_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1_1.setLayout(null);

		panel_3_1_1_1.setBounds(502, 120, 178, 177);
		add(panel_3_1_1_1);

		final JxLabel completelyLimitedLabel_1_1 = new JxLabel();
		completelyLimitedLabel_1_1.setTheme(theme);
		completelyLimitedLabel_1_1.setTheme(theme);

		completelyLimitedLabel_1_1.setFontSize(12);
		completelyLimitedLabel_1_1.setFontStyle(Font.BOLD);
		completelyLimitedLabel_1_1.setText("  3. SLIGHTLY LIMITED");
		completelyLimitedLabel_1_1.setBounds(0, 0, 178, 22);
		panel_3_1_1_1.add(completelyLimitedLabel_1_1);

		final JxTextA unresponsivedoesNotTextArea_1_1 = new JxTextA();
		unresponsivedoesNotTextArea_1_1.setTheme(theme);

		unresponsivedoesNotTextArea_1_1.setWrapStyleWord(true);
		unresponsivedoesNotTextArea_1_1
				.setText("Responds to verbal commands but cannot always communicate discomfort or need to be turned.                                     OR                                               has some sensory impairment which limits ability to feel pain or discomfort in 1 or 2 extremities.");
		unresponsivedoesNotTextArea_1_1.setLineWrap(true);
		unresponsivedoesNotTextArea_1_1.setEditable(false);
		unresponsivedoesNotTextArea_1_1.setBounds(5, 24, 172, 143);
		panel_3_1_1_1.add(unresponsivedoesNotTextArea_1_1);

		final JxPanel panel_3_1_1_1_1 = new JxPanel();
		panel_3_1_1_1_1.setTheme(theme);
		panel_3_1_1_1_1.setTheme(theme);
		panel_3_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1_1_1.setLayout(null);

		panel_3_1_1_1_1.setBounds(678, 120, 184, 177);
		add(panel_3_1_1_1_1);

		final JxLabel completelyLimitedLabel_1_1_1 = new JxLabel();
		completelyLimitedLabel_1_1_1.setTheme(theme);
		completelyLimitedLabel_1_1_1.setTheme(theme);

		completelyLimitedLabel_1_1_1.setFontSize(12);
		completelyLimitedLabel_1_1_1.setFontStyle(Font.BOLD);
		completelyLimitedLabel_1_1_1.setText("  4. NO IMPAIRMENT");
		completelyLimitedLabel_1_1_1.setBounds(0, 0, 178, 22);
		panel_3_1_1_1_1.add(completelyLimitedLabel_1_1_1);

		final JxTextA unresponsivedoesNotTextArea_1_1_1 = new JxTextA();
		unresponsivedoesNotTextArea_1_1_1.setTheme(theme);

		unresponsivedoesNotTextArea_1_1_1.setWrapStyleWord(true);
		unresponsivedoesNotTextArea_1_1_1
				.setText("Responds to verbal commands. Has no sensory deficit which would limit ability to fel or voice pain or discomfort.");
		unresponsivedoesNotTextArea_1_1_1.setLineWrap(true);
		unresponsivedoesNotTextArea_1_1_1.setEditable(false);
		unresponsivedoesNotTextArea_1_1_1.setBounds(5, 24, 163, 129);
		panel_3_1_1_1_1.add(unresponsivedoesNotTextArea_1_1_1);

		final JxPanel panel_3_2 = new JxPanel();
		panel_3_2.setTheme(theme);
		panel_3_2.setTheme(theme);
		panel_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2.setLayout(null);

		panel_3_2.setBounds(0, 294, 152, 113);
		add(panel_3_2);

		final JxLabel sensoryPerceptionLabel_1 = new JxLabel();
		sensoryPerceptionLabel_1.setTheme(theme);
		sensoryPerceptionLabel_1.setTheme(theme);

		sensoryPerceptionLabel_1.setFontSize(12);
		sensoryPerceptionLabel_1.setFontStyle(Font.BOLD);
		sensoryPerceptionLabel_1.setText("  MOISTURE");
		sensoryPerceptionLabel_1.setBounds(0, 0, 152, 22);
		panel_3_2.add(sensoryPerceptionLabel_1);

		final JxTextA abilityTextArea_1 = new JxTextA();
		abilityTextArea_1.setTheme(theme);

		abilityTextArea_1.setWrapStyleWord(true);
		abilityTextArea_1
				.setText("Degree to which skin is exposed to moisture");
		abilityTextArea_1.setLineWrap(true);
		abilityTextArea_1.setEditable(false);

		abilityTextArea_1.setBounds(4, 24, 142, 72);
		panel_3_2.add(abilityTextArea_1);

		final JxPanel panel_3_1_2 = new JxPanel();
		panel_3_1_2.setTheme(theme);
		panel_3_1_2.setTheme(theme);
		panel_3_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_2.setLayout(null);

		panel_3_1_2.setBounds(151, 294, 178, 113);
		add(panel_3_1_2);

		final JxLabel completelyLimitedLabel_2 = new JxLabel();
		completelyLimitedLabel_2.setTheme(theme);
		completelyLimitedLabel_2.setTheme(theme);

		completelyLimitedLabel_2.setFontSize(12);
		completelyLimitedLabel_2.setFontStyle(Font.BOLD);
		completelyLimitedLabel_2.setText(" 1. CONSTANTLY MOIST");
		completelyLimitedLabel_2.setBounds(0, 0, 178, 22);
		panel_3_1_2.add(completelyLimitedLabel_2);

		final JxTextA unresponsivedoesNotTextArea_2 = new JxTextA();
		unresponsivedoesNotTextArea_2.setTheme(theme);

		unresponsivedoesNotTextArea_2.setWrapStyleWord(true);
		unresponsivedoesNotTextArea_2
				.setText("Skin is kept moist almost constantly by perspiration, urine, etc. Dampness is detected every time patient is moved or turned.");
		unresponsivedoesNotTextArea_2.setLineWrap(true);
		unresponsivedoesNotTextArea_2.setEditable(false);

		unresponsivedoesNotTextArea_2.setBounds(5, 24, 163, 80);
		panel_3_1_2.add(unresponsivedoesNotTextArea_2);

		final JxPanel panel_3_1_1_2 = new JxPanel();
		panel_3_1_1_2.setTheme(theme);
		panel_3_1_1_2.setTheme(theme);
		panel_3_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1_2.setLayout(null);

		panel_3_1_1_2.setBounds(326, 294, 178, 113);
		add(panel_3_1_1_2);

		final JxLabel completelyLimitedLabel_1_2 = new JxLabel();
		completelyLimitedLabel_1_2.setTheme(theme);
		completelyLimitedLabel_1_2.setTheme(theme);

		completelyLimitedLabel_1_2.setFontSize(12);
		completelyLimitedLabel_1_2.setFontStyle(Font.BOLD);
		completelyLimitedLabel_1_2.setText("  2. OFTEN MOIST");
		completelyLimitedLabel_1_2.setBounds(0, 0, 178, 22);
		panel_3_1_1_2.add(completelyLimitedLabel_1_2);

		final JxTextA unresponsivedoesNotTextArea_1_2 = new JxTextA();
		unresponsivedoesNotTextArea_1_2.setTheme(theme);

		unresponsivedoesNotTextArea_1_2.setWrapStyleWord(true);
		unresponsivedoesNotTextArea_1_2
				.setText("Skin is often but not always moist. Linen must be changed at least once a shift");
		unresponsivedoesNotTextArea_1_2.setLineWrap(true);
		unresponsivedoesNotTextArea_1_2.setEditable(false);

		unresponsivedoesNotTextArea_1_2.setBounds(5, 24, 163, 80);
		panel_3_1_1_2.add(unresponsivedoesNotTextArea_1_2);

		final JxPanel panel_3_1_1_1_2 = new JxPanel();
		panel_3_1_1_1_2.setTheme(theme);
		panel_3_1_1_1_2.setTheme(theme);
		panel_3_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1_1_2.setLayout(null);

		panel_3_1_1_1_2.setBounds(502, 294, 178, 113);
		add(panel_3_1_1_1_2);

		final JxLabel completelyLimitedLabel_1_1_2 = new JxLabel();
		completelyLimitedLabel_1_1_2.setTheme(theme);
		completelyLimitedLabel_1_1_2.setTheme(theme);

		completelyLimitedLabel_1_1_2.setFontSize(12);
		completelyLimitedLabel_1_1_2.setFontStyle(Font.BOLD);
		completelyLimitedLabel_1_1_2.setText("  3. OCCASIONALLY MOIST");
		completelyLimitedLabel_1_1_2.setBounds(0, 0, 178, 22);
		panel_3_1_1_1_2.add(completelyLimitedLabel_1_1_2);

		final JxTextA unresponsivedoesNotTextArea_1_1_2 = new JxTextA();
		unresponsivedoesNotTextArea_1_1_2.setTheme(theme);

		unresponsivedoesNotTextArea_1_1_2.setWrapStyleWord(true);
		unresponsivedoesNotTextArea_1_1_2
				.setText("Skin is occasionally moist, requiring an extra linen change approximately once a day.");
		unresponsivedoesNotTextArea_1_1_2.setLineWrap(true);
		unresponsivedoesNotTextArea_1_1_2.setEditable(false);

		unresponsivedoesNotTextArea_1_1_2.setBounds(5, 24, 163, 80);
		panel_3_1_1_1_2.add(unresponsivedoesNotTextArea_1_1_2);

		final JxPanel panel_3_1_1_1_1_1 = new JxPanel();
		panel_3_1_1_1_1_1.setTheme(theme);
		panel_3_1_1_1_1_1.setTheme(theme);
		panel_3_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1_1_1_1.setLayout(null);

		panel_3_1_1_1_1_1.setBounds(678, 294, 184, 113);
		add(panel_3_1_1_1_1_1);

		final JxLabel completelyLimitedLabel_1_1_1_1 = new JxLabel();
		completelyLimitedLabel_1_1_1_1.setTheme(theme);
		completelyLimitedLabel_1_1_1_1.setTheme(theme);
		completelyLimitedLabel_1_1_1_1
				.setFont(new Font("Arial", Font.BOLD, 12));
		completelyLimitedLabel_1_1_1_1.setText("  4. RARELY MOIST");
		completelyLimitedLabel_1_1_1_1.setBounds(0, 0, 178, 22);
		panel_3_1_1_1_1_1.add(completelyLimitedLabel_1_1_1_1);

		final JxTextA unresponsivedoesNotTextArea_1_1_1_1 = new JxTextA();
		unresponsivedoesNotTextArea_1_1_1_1.setTheme(theme);

		unresponsivedoesNotTextArea_1_1_1_1.setWrapStyleWord(true);
		unresponsivedoesNotTextArea_1_1_1_1
				.setText("Skin is usually dry, linen only requires changing at routine intervals.");
		unresponsivedoesNotTextArea_1_1_1_1.setLineWrap(true);
		unresponsivedoesNotTextArea_1_1_1_1.setEditable(false);

		unresponsivedoesNotTextArea_1_1_1_1.setBounds(5, 24, 163, 74);
		panel_3_1_1_1_1_1.add(unresponsivedoesNotTextArea_1_1_1_1);

		final JxPanel panel_4_1 = new JxPanel();
		panel_4_1.setTheme(theme);
		panel_4_1.setTheme(theme);

		panel_4_1.setFontSize(12);
		panel_4_1.setLayout(null);
		panel_4_1.setBackground(Color.BLACK);
		panel_4_1.setBounds(862, 294, 68, 113);
		add(panel_4_1);

		cmbMoisture = new JxComboBox();
		cmbMoisture.setTheme(theme);
		cmbMoisture.setTheme(theme);
		cmbMoisture.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				updateScore();
			}
		});
		cmbMoisture.setTheme(theme);

		cmbMoisture.setBounds(0, 0, 68, 35);
		panel_4_1.add(cmbMoisture);

		final JxPanel panel_3_3 = new JxPanel();
		panel_3_3.setTheme(theme);
		panel_3_3.setTheme(theme);
		panel_3_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_3.setLayout(null);

		panel_3_3.setBounds(0, 404, 152, 113);
		add(panel_3_3);

		final JxLabel sensoryPerceptionLabel_2 = new JxLabel();
		sensoryPerceptionLabel_2.setTheme(theme);
		sensoryPerceptionLabel_2.setTheme(theme);

		sensoryPerceptionLabel_2.setFontSize(12);
		sensoryPerceptionLabel_2.setFontStyle(Font.BOLD);
		sensoryPerceptionLabel_2.setText("  ACTIVITY");
		sensoryPerceptionLabel_2.setBounds(0, 0, 152, 22);
		panel_3_3.add(sensoryPerceptionLabel_2);

		final JxTextA abilityTextArea_2 = new JxTextA();
		abilityTextArea_2.setTheme(theme);

		abilityTextArea_2.setText("Degree of physical activity");
		abilityTextArea_2.setLineWrap(true);
		abilityTextArea_2.setEditable(false);

		abilityTextArea_2.setBounds(4, 24, 142, 38);
		panel_3_3.add(abilityTextArea_2);

		final JxPanel panel_3_1_3 = new JxPanel();
		panel_3_1_3.setTheme(theme);
		panel_3_1_3.setTheme(theme);
		panel_3_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_3.setLayout(null);

		panel_3_1_3.setBounds(151, 404, 178, 113);
		add(panel_3_1_3);

		final JxLabel completelyLimitedLabel_3 = new JxLabel();
		completelyLimitedLabel_3.setTheme(theme);
		completelyLimitedLabel_3.setTheme(theme);

		completelyLimitedLabel_3.setFontSize(12);
		completelyLimitedLabel_3.setFontStyle(Font.BOLD);
		completelyLimitedLabel_3.setText(" 1. BEDFAST");
		completelyLimitedLabel_3.setBounds(0, 0, 178, 22);
		panel_3_1_3.add(completelyLimitedLabel_3);

		final JxTextA unresponsivedoesNotTextArea_3 = new JxTextA();
		unresponsivedoesNotTextArea_3.setTheme(theme);

		unresponsivedoesNotTextArea_3.setWrapStyleWord(true);
		unresponsivedoesNotTextArea_3.setText("Confined to bed");
		unresponsivedoesNotTextArea_3.setLineWrap(true);
		unresponsivedoesNotTextArea_3.setEditable(false);

		unresponsivedoesNotTextArea_3.setBounds(5, 24, 163, 62);
		panel_3_1_3.add(unresponsivedoesNotTextArea_3);

		final JxPanel panel_3_1_1_3 = new JxPanel();
		panel_3_1_1_3.setTheme(theme);
		panel_3_1_1_3.setTheme(theme);
		panel_3_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1_3.setLayout(null);

		panel_3_1_1_3.setBounds(326, 404, 178, 113);
		add(panel_3_1_1_3);

		final JxLabel completelyLimitedLabel_1_3 = new JxLabel();
		completelyLimitedLabel_1_3.setTheme(theme);
		completelyLimitedLabel_1_3.setTheme(theme);

		completelyLimitedLabel_1_3.setFontSize(12);
		completelyLimitedLabel_1_3.setFontStyle(Font.BOLD);
		completelyLimitedLabel_1_3.setText("  2. CHAIRFAST");
		completelyLimitedLabel_1_3.setBounds(0, 0, 178, 22);
		panel_3_1_1_3.add(completelyLimitedLabel_1_3);

		final JxTextA unresponsivedoesNotTextArea_1_3 = new JxTextA();
		unresponsivedoesNotTextArea_1_3.setTheme(theme);
		unresponsivedoesNotTextArea_1_3.setWrapStyleWord(true);
		unresponsivedoesNotTextArea_1_3
				.setText("Ability to walk severely limited or nonexistent. Cannot bear own weight and/or must be assisted into chair or wheelchair");
		unresponsivedoesNotTextArea_1_3.setLineWrap(true);
		unresponsivedoesNotTextArea_1_3.setEditable(false);

		unresponsivedoesNotTextArea_1_3.setBounds(5, 24, 163, 80);
		panel_3_1_1_3.add(unresponsivedoesNotTextArea_1_3);

		final JxPanel panel_3_1_1_1_3 = new JxPanel();
		panel_3_1_1_1_3.setTheme(theme);
		panel_3_1_1_1_3.setTheme(theme);
		panel_3_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1_1_3.setLayout(null);

		panel_3_1_1_1_3.setBounds(502, 404, 178, 113);
		add(panel_3_1_1_1_3);

		final JxLabel completelyLimitedLabel_1_1_3 = new JxLabel();
		completelyLimitedLabel_1_1_3.setTheme(theme);
		completelyLimitedLabel_1_1_3.setTheme(theme);

		completelyLimitedLabel_1_1_3.setFontSize(12);
		completelyLimitedLabel_1_1_3.setFontStyle(Font.BOLD);
		completelyLimitedLabel_1_1_3.setText("  3. WALKS OCCASIONALLY");
		completelyLimitedLabel_1_1_3.setBounds(0, 0, 178, 22);
		panel_3_1_1_1_3.add(completelyLimitedLabel_1_1_3);

		final JxTextA unresponsivedoesNotTextArea_1_1_3 = new JxTextA();
		unresponsivedoesNotTextArea_1_1_3.setTheme(theme);

		unresponsivedoesNotTextArea_1_1_3.setWrapStyleWord(true);
		unresponsivedoesNotTextArea_1_1_3
				.setText("Walks occasionally during day but for very short distances, or without assistance. Spends majority of each shift in bed or chair");
		unresponsivedoesNotTextArea_1_1_3.setLineWrap(true);
		unresponsivedoesNotTextArea_1_1_3.setEditable(false);

		unresponsivedoesNotTextArea_1_1_3.setBounds(5, 24, 163, 86);
		panel_3_1_1_1_3.add(unresponsivedoesNotTextArea_1_1_3);

		final JxPanel panel_3_1_1_1_1_2 = new JxPanel();
		panel_3_1_1_1_1_2.setTheme(theme);
		panel_3_1_1_1_1_2.setTheme(theme);
		panel_3_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1_1_1_2.setLayout(null);

		panel_3_1_1_1_1_2.setBounds(678, 404, 184, 113);
		add(panel_3_1_1_1_1_2);

		final JxLabel completelyLimitedLabel_1_1_1_2 = new JxLabel();
		completelyLimitedLabel_1_1_1_2.setTheme(theme);
		completelyLimitedLabel_1_1_1_2.setTheme(theme);
		completelyLimitedLabel_1_1_1_2
				.setFont(new Font("Arial", Font.BOLD, 12));
		completelyLimitedLabel_1_1_1_2.setText("  4. WALKS FREQUENTLY");
		completelyLimitedLabel_1_1_1_2.setBounds(0, 0, 178, 22);
		panel_3_1_1_1_1_2.add(completelyLimitedLabel_1_1_1_2);

		final JxTextA unresponsivedoesNotTextArea_1_1_1_2 = new JxTextA();
		unresponsivedoesNotTextArea_1_1_1_2.setTheme(theme);

		unresponsivedoesNotTextArea_1_1_1_2.setWrapStyleWord(true);
		unresponsivedoesNotTextArea_1_1_1_2
				.setText("Walks outside the room at least twice a day and inside room at least once every 2 hours during waking hours.");
		unresponsivedoesNotTextArea_1_1_1_2.setLineWrap(true);
		unresponsivedoesNotTextArea_1_1_1_2.setEditable(false);

		unresponsivedoesNotTextArea_1_1_1_2.setBounds(5, 24, 163, 76);
		panel_3_1_1_1_1_2.add(unresponsivedoesNotTextArea_1_1_1_2);

		final JxPanel panel_4_2 = new JxPanel();
		panel_4_2.setTheme(theme);
		panel_4_2.setTheme(theme);

		panel_4_2.setFontSize(12);
		panel_4_2.setLayout(null);
		panel_4_2.setBackground(Color.BLACK);
		panel_4_2.setBounds(862, 404, 68, 113);
		add(panel_4_2);

		cmbActivity = new JxComboBox();
		cmbActivity.setTheme(theme);
		cmbActivity.setTheme(theme);
		cmbActivity.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				updateScore();
			}
		});
		cmbActivity.setTheme(theme);

		cmbActivity.setBounds(0, 0, 68, 35);
		panel_4_2.add(cmbActivity);

		final JxPanel panel_3_3_1 = new JxPanel();
		panel_3_3_1.setTheme(theme);
		panel_3_3_1.setTheme(theme);
		panel_3_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_3_1.setLayout(null);

		panel_3_3_1.setBounds(0, 514, 152, 113);
		add(panel_3_3_1);

		final JxLabel sensoryPerceptionLabel_2_1 = new JxLabel();
		sensoryPerceptionLabel_2_1.setTheme(theme);
		sensoryPerceptionLabel_2_1.setTheme(theme);

		sensoryPerceptionLabel_2_1.setFontSize(12);
		sensoryPerceptionLabel_2_1.setFontStyle(Font.BOLD);
		sensoryPerceptionLabel_2_1.setText("  MOBILITY");
		sensoryPerceptionLabel_2_1.setBounds(0, 0, 152, 22);
		panel_3_3_1.add(sensoryPerceptionLabel_2_1);

		final JxTextA abilityTextArea_2_1 = new JxTextA();
		abilityTextArea_2_1.setTheme(theme);

		abilityTextArea_2_1.setWrapStyleWord(true);
		abilityTextArea_2_1
				.setText("Ability to change and control body position");
		abilityTextArea_2_1.setLineWrap(true);
		abilityTextArea_2_1.setEditable(false);

		abilityTextArea_2_1.setBounds(4, 24, 142, 38);
		panel_3_3_1.add(abilityTextArea_2_1);

		final JxPanel panel_3_1_3_1 = new JxPanel();
		panel_3_1_3_1.setTheme(theme);
		panel_3_1_3_1.setTheme(theme);
		panel_3_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_3_1.setLayout(null);

		panel_3_1_3_1.setBounds(151, 514, 178, 113);
		add(panel_3_1_3_1);

		final JxLabel completelyLimitedLabel_3_1 = new JxLabel();
		completelyLimitedLabel_3_1.setTheme(theme);
		completelyLimitedLabel_3_1.setTheme(theme);

		completelyLimitedLabel_3_1.setFontSize(12);
		completelyLimitedLabel_3_1.setFontStyle(Font.BOLD);
		completelyLimitedLabel_3_1.setText(" 1.COMPLETELY IMMOBILE");
		completelyLimitedLabel_3_1.setBounds(0, 0, 178, 22);
		panel_3_1_3_1.add(completelyLimitedLabel_3_1);

		final JxTextA unresponsivedoesNotTextArea_3_1 = new JxTextA();
		unresponsivedoesNotTextArea_3_1.setTheme(theme);

		unresponsivedoesNotTextArea_3_1.setWrapStyleWord(true);
		unresponsivedoesNotTextArea_3_1
				.setText("Does not make even slight changes in body or extremity position without assistance");
		unresponsivedoesNotTextArea_3_1.setLineWrap(true);
		unresponsivedoesNotTextArea_3_1.setEditable(false);

		unresponsivedoesNotTextArea_3_1.setBounds(5, 24, 163, 62);
		panel_3_1_3_1.add(unresponsivedoesNotTextArea_3_1);

		final JxPanel panel_3_1_1_3_1 = new JxPanel();
		panel_3_1_1_3_1.setTheme(theme);
		panel_3_1_1_3_1.setTheme(theme);
		panel_3_1_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1_3_1.setLayout(null);

		panel_3_1_1_3_1.setBounds(326, 514, 178, 113);
		add(panel_3_1_1_3_1);

		final JxLabel completelyLimitedLabel_1_3_1 = new JxLabel();
		completelyLimitedLabel_1_3_1.setTheme(theme);
		completelyLimitedLabel_1_3_1.setTheme(theme);

		completelyLimitedLabel_1_3_1.setFontSize(12);
		completelyLimitedLabel_1_3_1.setFontStyle(Font.BOLD);
		completelyLimitedLabel_1_3_1.setText("  2. VERY LIMITED");
		completelyLimitedLabel_1_3_1.setBounds(0, 0, 178, 22);
		panel_3_1_1_3_1.add(completelyLimitedLabel_1_3_1);

		final JxTextA unresponsivedoesNotTextArea_1_3_1 = new JxTextA();
		unresponsivedoesNotTextArea_1_3_1.setTheme(theme);

		unresponsivedoesNotTextArea_1_3_1.setWrapStyleWord(true);
		unresponsivedoesNotTextArea_1_3_1
				.setText("Make occasional slight changes in body or extremity position but unable to make frequent or significant changes independentaly.");
		unresponsivedoesNotTextArea_1_3_1.setLineWrap(true);
		unresponsivedoesNotTextArea_1_3_1.setEditable(false);

		unresponsivedoesNotTextArea_1_3_1.setBounds(5, 24, 163, 80);
		panel_3_1_1_3_1.add(unresponsivedoesNotTextArea_1_3_1);

		final JxPanel panel_3_1_1_1_3_1 = new JxPanel();
		panel_3_1_1_1_3_1.setTheme(theme);
		panel_3_1_1_1_3_1.setTheme(theme);
		panel_3_1_1_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1_1_3_1.setLayout(null);

		panel_3_1_1_1_3_1.setBounds(502, 514, 178, 113);
		add(panel_3_1_1_1_3_1);

		final JxLabel completelyLimitedLabel_1_1_3_1 = new JxLabel();
		completelyLimitedLabel_1_1_3_1.setTheme(theme);
		completelyLimitedLabel_1_1_3_1.setTheme(theme);
		completelyLimitedLabel_1_1_3_1
				.setFont(new Font("Arial", Font.BOLD, 12));
		completelyLimitedLabel_1_1_3_1.setText("  3. SLIGHTLY LIMITED");
		completelyLimitedLabel_1_1_3_1.setBounds(5, 0, 178, 22);
		panel_3_1_1_1_3_1.add(completelyLimitedLabel_1_1_3_1);

		final JxTextA unresponsivedoesNotTextArea_1_1_3_1 = new JxTextA();
		unresponsivedoesNotTextArea_1_1_3_1.setTheme(theme);

		unresponsivedoesNotTextArea_1_1_3_1.setWrapStyleWord(true);
		unresponsivedoesNotTextArea_1_1_3_1
				.setText("Makes frequent though slight changes in body or extremity position independentaly.");
		unresponsivedoesNotTextArea_1_1_3_1.setLineWrap(true);
		unresponsivedoesNotTextArea_1_1_3_1.setEditable(false);

		unresponsivedoesNotTextArea_1_1_3_1.setBounds(5, 24, 163, 86);
		panel_3_1_1_1_3_1.add(unresponsivedoesNotTextArea_1_1_3_1);

		final JxPanel panel_3_1_1_1_1_2_1 = new JxPanel();
		panel_3_1_1_1_1_2_1.setTheme(theme);
		panel_3_1_1_1_1_2_1.setTheme(theme);
		panel_3_1_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1_1_1_2_1.setLayout(null);

		panel_3_1_1_1_1_2_1.setBounds(678, 514, 184, 113);
		add(panel_3_1_1_1_1_2_1);

		final JxLabel completelyLimitedLabel_1_1_1_2_1 = new JxLabel();
		completelyLimitedLabel_1_1_1_2_1.setTheme(theme);
		completelyLimitedLabel_1_1_1_2_1.setTheme(theme);

		completelyLimitedLabel_1_1_1_2_1.setFontSize(12);
		completelyLimitedLabel_1_1_1_2_1.setFontStyle(Font.BOLD);
		completelyLimitedLabel_1_1_1_2_1.setText("  4. NO LIMITATIONS");
		completelyLimitedLabel_1_1_1_2_1.setBounds(0, 0, 178, 22);
		panel_3_1_1_1_1_2_1.add(completelyLimitedLabel_1_1_1_2_1);

		final JxTextA unresponsivedoesNotTextArea_1_1_1_2_1 = new JxTextA();
		unresponsivedoesNotTextArea_1_1_1_2_1.setTheme(theme);

		unresponsivedoesNotTextArea_1_1_1_2_1.setWrapStyleWord(true);
		unresponsivedoesNotTextArea_1_1_1_2_1
				.setText("Makes major and frequent changes in position without assistance.");
		unresponsivedoesNotTextArea_1_1_1_2_1.setLineWrap(true);
		unresponsivedoesNotTextArea_1_1_1_2_1.setEditable(false);

		unresponsivedoesNotTextArea_1_1_1_2_1.setBounds(5, 24, 163, 76);
		panel_3_1_1_1_1_2_1.add(unresponsivedoesNotTextArea_1_1_1_2_1);

		final JxPanel panel_4_2_1 = new JxPanel();
		panel_4_2_1.setTheme(theme);
		panel_4_2_1.setTheme(theme);

		panel_4_2_1.setFontSize(12);
		panel_4_2_1.setLayout(null);
		panel_4_2_1.setBackground(Color.BLACK);
		panel_4_2_1.setBounds(862, 514, 68, 113);
		add(panel_4_2_1);

		cmbMobility = new JxComboBox();
		cmbMobility.setTheme(theme);
		cmbMobility.setTheme(theme);
		cmbMobility.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				updateScore();
			}
		});
		cmbMobility.setTheme(theme);

		cmbMobility.setBounds(0, 0, 68, 35);
		panel_4_2_1.add(cmbMobility);

		final JxPanel panel_3_4 = new JxPanel();
		panel_3_4.setTheme(theme);
		panel_3_4.setTheme(theme);
		panel_3_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_4.setLayout(null);

		panel_3_4.setBounds(0, 624, 152, 229);
		add(panel_3_4);

		final JxLabel sensoryPerceptionLabel_3 = new JxLabel();
		sensoryPerceptionLabel_3.setTheme(theme);
		sensoryPerceptionLabel_3.setTheme(theme);

		sensoryPerceptionLabel_3.setFontSize(12);
		sensoryPerceptionLabel_3.setFontStyle(Font.BOLD);
		sensoryPerceptionLabel_3.setText("  NUTRITION");
		sensoryPerceptionLabel_3.setBounds(0, 0, 152, 22);
		panel_3_4.add(sensoryPerceptionLabel_3);

		final JxLabel abilityTextArea_3 = new JxLabel();
		abilityTextArea_3.setTheme(theme);
		abilityTextArea_3.setVerticalAlignment(SwingConstants.TOP);

		// abilityTextArea_3.setWrapStyleWord(true);
		abilityTextArea_3
				.setText("<html><p align=\"justify\">Usual food intake pattern NPO:</p>"
						+ "<p align=\"justify\">Nothing by mouth IV:Intravenously TNP:Total parenteral nutrition </p>");
		// abilityTextArea_3.setLineWrap(true);
		// abilityTextArea_3.setEditable(false);

		abilityTextArea_3.setBounds(4, 24, 142, 117);
		panel_3_4.add(abilityTextArea_3);

		final JxPanel panel_3_1_4 = new JxPanel();
		panel_3_1_4.setTheme(theme);
		panel_3_1_4.setTheme(theme);
		panel_3_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_4.setLayout(null);

		panel_3_1_4.setBounds(151, 624, 178, 229);
		add(panel_3_1_4);

		final JxLabel completelyLimitedLabel_4 = new JxLabel();
		completelyLimitedLabel_4.setTheme(theme);
		completelyLimitedLabel_4.setTheme(theme);

		completelyLimitedLabel_4.setFontSize(12);
		completelyLimitedLabel_4.setFontStyle(Font.BOLD);
		completelyLimitedLabel_4.setText(" 1. VERY POOR");
		completelyLimitedLabel_4.setBounds(0, 0, 178, 22);
		panel_3_1_4.add(completelyLimitedLabel_4);

		final JxTextA unresponsivedoesNotTextArea_4 = new JxTextA();
		unresponsivedoesNotTextArea_4.setTheme(theme);

		unresponsivedoesNotTextArea_4.setWrapStyleWord(true);
		unresponsivedoesNotTextArea_4
				.setText("Nevers eats a complete meal. Rarely eats more than 1/3 of any food offered. Eats 2 servings or less of protein(meat or dairy products) per day. Take fluids poorly. Does not take a liquid supplement                                OR                                                   is NPO and / or maintained on clear liquieds or IV for more than 5 days.");
		unresponsivedoesNotTextArea_4.setLineWrap(true);
		unresponsivedoesNotTextArea_4.setEditable(false);

		unresponsivedoesNotTextArea_4.setBounds(5, 24, 163, 195);
		panel_3_1_4.add(unresponsivedoesNotTextArea_4);

		final JxPanel panel_3_1_1_4 = new JxPanel();
		panel_3_1_1_4.setTheme(theme);
		panel_3_1_1_4.setTheme(theme);
		panel_3_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1_4.setLayout(null);

		panel_3_1_1_4.setBounds(326, 624, 178, 229);
		add(panel_3_1_1_4);

		final JxLabel completelyLimitedLabel_1_4 = new JxLabel();
		completelyLimitedLabel_1_4.setTheme(theme);
		completelyLimitedLabel_1_4.setTheme(theme);

		completelyLimitedLabel_1_4.setFontSize(12);
		completelyLimitedLabel_1_4.setFontStyle(Font.BOLD);
		completelyLimitedLabel_1_4.setText("  2. PROBABLY INADEQUATE");
		completelyLimitedLabel_1_4.setBounds(0, 0, 178, 22);
		panel_3_1_1_4.add(completelyLimitedLabel_1_4);

		final JxLabel unresponsivedoesNotTextArea_1_4 = new JxLabel();
		unresponsivedoesNotTextArea_1_4.setTheme(theme);

		unresponsivedoesNotTextArea_1_4.setTheme(theme);
		unresponsivedoesNotTextArea_1_4
				.setVerticalAlignment(SwingConstants.TOP);
		unresponsivedoesNotTextArea_1_4
				.setVerticalTextPosition(SwingConstants.TOP);
		// unresponsivedoesNotTextArea_1_4.setWrapStyleWord(true);
		unresponsivedoesNotTextArea_1_4
				.setText("<html><p align=\"justify\">Rarely eats a complete meal and generally eats only about 1/2 of any food offered. Protein intake includes only 3 servings of meat or dairy products per day. Occasionally will take a dietary supplement if offered.</p>"
						+ "<p align=\"center\">OR</p>"
						+ "<p align=\"justify\">receive less than optimum amount of liquid diet or tube feeding.</p>");
		// unresponsivedoesNotTextArea_1_4.setLineWrap(true);
		// unresponsivedoesNotTextArea_1_4.setEditable(false);

		unresponsivedoesNotTextArea_1_4.setBounds(5, 24, 163, 195);
		panel_3_1_1_4.add(unresponsivedoesNotTextArea_1_4);

		final JxPanel panel_3_1_1_1_4 = new JxPanel();
		panel_3_1_1_1_4.setTheme(theme);
		panel_3_1_1_1_4.setTheme(theme);
		panel_3_1_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1_1_4.setLayout(null);

		panel_3_1_1_1_4.setBounds(502, 624, 178, 229);
		add(panel_3_1_1_1_4);

		final JxLabel completelyLimitedLabel_1_1_4 = new JxLabel();
		completelyLimitedLabel_1_1_4.setTheme(theme);
		completelyLimitedLabel_1_1_4.setTheme(theme);

		completelyLimitedLabel_1_1_4.setFontSize(12);
		completelyLimitedLabel_1_1_4.setFontStyle(Font.BOLD);
		completelyLimitedLabel_1_1_4.setText("  3. ADEQUATE");
		completelyLimitedLabel_1_1_4.setBounds(0, 0, 178, 22);
		panel_3_1_1_1_4.add(completelyLimitedLabel_1_1_4);

		final JxTextA unresponsivedoesNotTextArea_1_1_4 = new JxTextA();
		unresponsivedoesNotTextArea_1_1_4.setTheme(theme);

		unresponsivedoesNotTextArea_1_1_4.setWrapStyleWord(true);
		unresponsivedoesNotTextArea_1_1_4
				.setText("Eats over half of most meals. Eats a total of 4 servings of protein(meat, dairy products) each day. Occasionally will refuse a meat, but will usually take a supplement if offered,                           OR                                                                                   is on a tube feeding or TPN regimen, which probably meets most of nutritional needs.");
		unresponsivedoesNotTextArea_1_1_4.setLineWrap(true);
		unresponsivedoesNotTextArea_1_1_4.setEditable(false);

		unresponsivedoesNotTextArea_1_1_4.setBounds(5, 24, 163, 195);
		panel_3_1_1_1_4.add(unresponsivedoesNotTextArea_1_1_4);

		final JxPanel panel_3_1_1_1_1_3 = new JxPanel();
		panel_3_1_1_1_1_3.setTheme(theme);
		panel_3_1_1_1_1_3.setTheme(theme);
		panel_3_1_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1_1_1_3.setLayout(null);

		panel_3_1_1_1_1_3.setBounds(678, 624, 184, 229);
		add(panel_3_1_1_1_1_3);

		final JxLabel completelyLimitedLabel_1_1_1_3 = new JxLabel();
		completelyLimitedLabel_1_1_1_3.setTheme(theme);
		completelyLimitedLabel_1_1_1_3.setTheme(theme);
		completelyLimitedLabel_1_1_1_3
				.setFont(new Font("Arial", Font.BOLD, 12));
		completelyLimitedLabel_1_1_1_3.setText("  4. EXCELLENT");
		completelyLimitedLabel_1_1_1_3.setBounds(0, 0, 178, 22);
		panel_3_1_1_1_1_3.add(completelyLimitedLabel_1_1_1_3);

		final JxTextA unresponsivedoesNotTextArea_1_1_1_3 = new JxTextA();
		unresponsivedoesNotTextArea_1_1_1_3.setTheme(theme);

		unresponsivedoesNotTextArea_1_1_1_3.setWrapStyleWord(true);
		unresponsivedoesNotTextArea_1_1_1_3
				.setText("Eats most of every meal. Usually eats a total of 4 or more servings of meat and dairy products. Occasionally eats between meals. Does not require supplementation");
		unresponsivedoesNotTextArea_1_1_1_3.setLineWrap(true);
		unresponsivedoesNotTextArea_1_1_1_3.setEditable(false);

		unresponsivedoesNotTextArea_1_1_1_3.setBounds(5, 24, 163, 195);
		panel_3_1_1_1_1_3.add(unresponsivedoesNotTextArea_1_1_1_3);

		final JxPanel panel_4_3 = new JxPanel();
		panel_4_3.setTheme(theme);
		panel_4_3.setTheme(theme);

		panel_4_3.setFontSize(12);
		panel_4_3.setLayout(null);
		panel_4_3.setBackground(Color.BLACK);
		panel_4_3.setBounds(862, 625, 68, 228);
		add(panel_4_3);

		cmbNutrition = new JxComboBox();
		cmbNutrition.setTheme(theme);
		cmbNutrition.setTheme(theme);
		cmbNutrition.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				updateScore();
			}
		});
		cmbNutrition.setTheme(theme);

		cmbNutrition.setBounds(0, 0, 68, 35);
		panel_4_3.add(cmbNutrition);

		final JxPanel panel_3_4_1 = new JxPanel();
		panel_3_4_1.setTheme(theme);
		panel_3_4_1.setTheme(theme);
		panel_3_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_4_1.setLayout(null);

		panel_3_4_1.setBounds(0, 852, 152, 229);
		add(panel_3_4_1);

		final JxLabel sensoryPerceptionLabel_3_1 = new JxLabel();
		sensoryPerceptionLabel_3_1.setTheme(theme);
		sensoryPerceptionLabel_3_1.setTheme(theme);

		sensoryPerceptionLabel_3_1.setFontSize(12);
		sensoryPerceptionLabel_3_1.setFontStyle(Font.BOLD);
		sensoryPerceptionLabel_3_1.setText("  FRICTION AND SHEAR");
		sensoryPerceptionLabel_3_1.setBounds(0, 0, 152, 22);
		panel_3_4_1.add(sensoryPerceptionLabel_3_1);

		final JxTextA abilityTextArea_3_1 = new JxTextA();
		abilityTextArea_3_1.setTheme(theme);

		abilityTextArea_3_1.setWrapStyleWord(true);
		abilityTextArea_3_1
				.setText("Usual food intake pattern                                                                                             NPO: Nothing by mouth     IV:Intravenously                 TNP:Total parenteral nutrition ");
		abilityTextArea_3_1.setLineWrap(true);
		abilityTextArea_3_1.setEditable(false);

		abilityTextArea_3_1.setBounds(4, 24, 142, 117);
		panel_3_4_1.add(abilityTextArea_3_1);

		final JxPanel panel_3_1_4_1 = new JxPanel();
		panel_3_1_4_1.setTheme(theme);
		panel_3_1_4_1.setTheme(theme);
		panel_3_1_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_4_1.setLayout(null);

		panel_3_1_4_1.setBounds(151, 852, 178, 229);
		add(panel_3_1_4_1);

		final JxLabel completelyLimitedLabel_4_1 = new JxLabel();
		completelyLimitedLabel_4_1.setTheme(theme);
		completelyLimitedLabel_4_1.setTheme(theme);

		completelyLimitedLabel_4_1.setFontSize(12);
		completelyLimitedLabel_4_1.setFontStyle(Font.BOLD);
		completelyLimitedLabel_4_1.setText(" 1. PROBLEM");
		completelyLimitedLabel_4_1.setBounds(0, 0, 178, 22);
		panel_3_1_4_1.add(completelyLimitedLabel_4_1);

		final JxTextA unresponsivedoesNotTextArea_4_1 = new JxTextA();
		unresponsivedoesNotTextArea_4_1.setTheme(theme);

		unresponsivedoesNotTextArea_4_1.setWrapStyleWord(true);
		unresponsivedoesNotTextArea_4_1
				.setText("Requires moderate to maximum assistance in moving. Complete lifting without sliding against sheets is impossible. Frequently slides down in bed or chair, requiring frequent repositioning with maximum assistance. Spasticity, contractures, or agitation leads to almost constant friction.");
		unresponsivedoesNotTextArea_4_1.setLineWrap(true);
		unresponsivedoesNotTextArea_4_1.setEditable(false);

		unresponsivedoesNotTextArea_4_1.setBounds(5, 24, 163, 195);
		panel_3_1_4_1.add(unresponsivedoesNotTextArea_4_1);

		final JxPanel panel_3_1_1_4_1 = new JxPanel();
		panel_3_1_1_4_1.setTheme(theme);
		panel_3_1_1_4_1.setTheme(theme);
		panel_3_1_1_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1_4_1.setLayout(null);

		panel_3_1_1_4_1.setBounds(326, 852, 178, 229);
		add(panel_3_1_1_4_1);

		final JxLabel completelyLimitedLabel_1_4_1 = new JxLabel();
		completelyLimitedLabel_1_4_1.setTheme(theme);
		completelyLimitedLabel_1_4_1.setTheme(theme);

		completelyLimitedLabel_1_4_1.setFontSize(12);
		completelyLimitedLabel_1_4_1.setFontStyle(Font.BOLD);
		completelyLimitedLabel_1_4_1.setText("  2.POTENTIAL PROBLEM");
		completelyLimitedLabel_1_4_1.setBounds(0, 0, 178, 22);
		panel_3_1_1_4_1.add(completelyLimitedLabel_1_4_1);

		final JxTextA unresponsivedoesNotTextArea_1_4_1 = new JxTextA();
		unresponsivedoesNotTextArea_1_4_1.setTheme(theme);

		unresponsivedoesNotTextArea_1_4_1.setWrapStyleWord(true);
		unresponsivedoesNotTextArea_1_4_1
				.setText("Moves freely or requires minimum assistance. During a move, skin probably slides to some extent against sheets, chair, restraints, or other devices. Maintains relatively good position in chair or bed most of the time, but occasionally slides down.");
		unresponsivedoesNotTextArea_1_4_1.setLineWrap(true);
		unresponsivedoesNotTextArea_1_4_1.setEditable(false);

		unresponsivedoesNotTextArea_1_4_1.setBounds(5, 24, 163, 195);
		panel_3_1_1_4_1.add(unresponsivedoesNotTextArea_1_4_1);

		final JxPanel panel_3_1_1_1_4_1 = new JxPanel();
		panel_3_1_1_1_4_1.setTheme(theme);
		panel_3_1_1_1_4_1.setTheme(theme);
		panel_3_1_1_1_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1_1_4_1.setLayout(null);

		panel_3_1_1_1_4_1.setBounds(502, 852, 178, 229);
		add(panel_3_1_1_1_4_1);

		final JxLabel completelyLimitedLabel_1_1_4_1 = new JxLabel();
		completelyLimitedLabel_1_1_4_1.setTheme(theme);
		completelyLimitedLabel_1_1_4_1.setTheme(theme);
		completelyLimitedLabel_1_1_4_1
				.setFont(new Font("Arial", Font.BOLD, 12));
		completelyLimitedLabel_1_1_4_1.setText("  3. NO APPARENT PROBLEM");
		completelyLimitedLabel_1_1_4_1.setBounds(0, 0, 178, 22);
		panel_3_1_1_1_4_1.add(completelyLimitedLabel_1_1_4_1);

		final JxTextA unresponsivedoesNotTextArea_1_1_4_1 = new JxTextA();
		unresponsivedoesNotTextArea_1_1_4_1.setTheme(theme);

		unresponsivedoesNotTextArea_1_1_4_1.setWrapStyleWord(true);
		unresponsivedoesNotTextArea_1_1_4_1
				.setText("Moves in bed and in chair independently and has sufficient muscle strength to lift up completely during move. Maintains good position in bed or chair at all times.");
		unresponsivedoesNotTextArea_1_1_4_1.setLineWrap(true);
		unresponsivedoesNotTextArea_1_1_4_1.setEditable(false);

		unresponsivedoesNotTextArea_1_1_4_1.setBounds(5, 24, 163, 195);
		panel_3_1_1_1_4_1.add(unresponsivedoesNotTextArea_1_1_4_1);

		final JxPanel panel_3_1_1_1_1_3_1 = new JxPanel();
		panel_3_1_1_1_1_3_1.setTheme(theme);
		panel_3_1_1_1_1_3_1.setTheme(theme);
		panel_3_1_1_1_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1_1_1_3_1.setLayout(null);

		panel_3_1_1_1_1_3_1.setBounds(678, 852, 184, 229);
		add(panel_3_1_1_1_1_3_1);

		final JxPanel panel_4_3_1 = new JxPanel();
		panel_4_3_1.setTheme(theme);
		panel_4_3_1.setTheme(theme);

		panel_4_3_1.setFontSize(12);
		panel_4_3_1.setLayout(null);
		panel_4_3_1.setBackground(Color.BLACK);
		panel_4_3_1.setBounds(862, 853, 68, 228);
		add(panel_4_3_1);

		cmbFriction = new JxComboBox();
		cmbFriction.setTheme(theme);
		cmbFriction.setTheme(theme);
		cmbFriction.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				updateScore();
			}
		});
		cmbFriction.setTheme(theme);

		cmbFriction.setBounds(0, 0, 68, 35);
		panel_4_3_1.add(cmbFriction);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setTheme(theme);
		panel_5.setLayout(null);
		panel_5.setBackground(Color.BLACK);
		panel_5.setBounds(0, 1080, 862, 26);
		add(panel_5);

		final JxLabel totalScoreOfLabel = new JxLabel();
		totalScoreOfLabel.setTheme(theme);
		totalScoreOfLabel.setBounds(263, 5, 335, 19);
		totalScoreOfLabel.setTheme(theme);
		totalScoreOfLabel.setForeground(new Color(255, 255, 255));
		totalScoreOfLabel.setBackground(Color.BLACK);
		totalScoreOfLabel
				.setText("Total Score of 12 or Less Represents HIGH RISK");
		panel_5.add(totalScoreOfLabel);

		final JxLabel totalScoreLabel = new JxLabel();
		totalScoreLabel.setTheme(theme);
		totalScoreLabel.setTheme(theme);
		totalScoreLabel.setForeground(new Color(255, 255, 255));
		totalScoreLabel.setText("TOTAL SCORE");
		totalScoreLabel.setBounds(746, 6, 106, 16);
		panel_5.add(totalScoreLabel);

		lblTotal = new JxLabel();
		lblTotal.setTheme(theme);
		lblTotal.setTheme(theme);
		lblTotal.setBorder(new LineBorder(Color.black, 1, false));

		lblTotal.setFontSize(14);
		lblTotal.setFontStyle(Font.BOLD);
		lblTotal.setBounds(862, 1080, 68, 26);
		add(lblTotal);

		final JxLabel nurseLabel = new JxLabel();
		nurseLabel.setTheme(theme);
		nurseLabel.setTheme(theme);
		nurseLabel.setText("Nurse :");
		nurseLabel.setBounds(4, 1136, 47, 16);
		add(nurseLabel);

		cmbNurse = new JxComboBox();
		cmbNurse.setTheme(theme);
		cmbNurse.setTheme(theme);

		cmbNurse.setBounds(220, 1132, 206, 25);
		add(cmbNurse);

		final JxLabel dateLabel = new JxLabel();
		dateLabel.setTheme(theme);
		dateLabel.setTheme(theme);
		dateLabel.setText("Date :");
		dateLabel.setBounds(667, 1136, 38, 16);
		add(dateLabel);

		lblNurseVisit = new JxLabel();
		lblNurseVisit.setTheme(theme);
		lblNurseVisit.setTheme(theme);

		lblNurseVisit.setFontStyle(Font.BOLD);
		// lblNurseVisit.setDate(MedrexClientManager.getServerTime());
		// dcNurseVisit.setDateFormatString("MM/dd/yyyy");
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		lblNurseVisit.setText(sdf.format(MedrexClientManager.getServerTime()));
		lblNurseVisit.setBounds(713, 1132, 206, 26);
		add(lblNurseVisit);

		final JxLabel residentNameLabel = new JxLabel();
		residentNameLabel.setTheme(theme);
		residentNameLabel.setTheme(theme);
		residentNameLabel.setText("Resident Name :");
		residentNameLabel.setBounds(81, 10, 98, 14);
		add(residentNameLabel);

		lblResidentName = new JxLabel();
		lblResidentName.setTheme(theme);
		lblResidentName.setTheme(theme);

		lblResidentName.setFontStyle(Font.BOLD);
		lblResidentName.setBounds(193, 7, 233, 21);
		add(lblResidentName);

		final JxLabel roomLabel = new JxLabel();
		roomLabel.setTheme(theme);
		roomLabel.setTheme(theme);
		roomLabel.setText("Room #:");
		roomLabel.setBounds(578, 10, 54, 14);
		add(roomLabel);

		lblRoom = new JxLabel();
		lblRoom.setTheme(theme);
		lblRoom.setTheme(theme);

		lblRoom.setFontStyle(Font.BOLD);
		lblRoom.setBounds(641, 7, 79, 21);
		add(lblRoom);

		doLoad();

		final PanelloggedInUser panel_6 = new PanelloggedInUser();
		// panel_6.setFont(font);
		panel_6.setBounds(50, 1132, 358, 26);
		add(panel_6);
	}

	public void doLoad() {
		fillCombos();
		doUpdate();

	}

	public void fillCombos() {
		cmbSensory.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "4" }));
		cmbMoisture.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "4" }));
		cmbActivity.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "4" }));
		cmbMobility.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "4" }));
		cmbNutrition.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "4" }));
		cmbFriction.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));

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

	public void updateScore() {

		int score = 0;
		try {
			if (!cmbSensory.getSelectedItem().toString().equalsIgnoreCase("")) {
				score += Integer.parseInt(cmbSensory.getSelectedItem() + "");
			}
			if (!cmbMoisture.getSelectedItem().toString().equalsIgnoreCase("")) {
				score += Integer.parseInt(cmbMoisture.getSelectedItem() + "");
			}
			if (!cmbActivity.getSelectedItem().toString().equalsIgnoreCase("")) {
				score += Integer.parseInt(cmbActivity.getSelectedItem() + "");
			}
			if (!cmbMobility.getSelectedItem().toString().equalsIgnoreCase("")) {
				score += Integer.parseInt(cmbMobility.getSelectedItem() + "");
			}
			if (!cmbNutrition.getSelectedItem().toString().equalsIgnoreCase("")) {
				score += Integer.parseInt(cmbNutrition.getSelectedItem() + "");
			}
			if (!cmbFriction.getSelectedItem().toString().equalsIgnoreCase("")) {
				score += Integer.parseInt(cmbFriction.getSelectedItem() + "");
			}
		} catch (Exception e) {
		}
		lblTotal.setText(score + "");
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
		// txtRoom.setText(rm.getRoom());
		if (roomHist != null) {
			lblRoom.setText(roomHist.getRoom());
		}
		if (Global.currentResidentAssessmentFormPage1Key == 0) {
			Global.currentResidentAssessmentFormPage2Key = 0;
			cmbSensory.setSelectedItem("");
			cmbMoisture.setSelectedItem("");
			cmbActivity.setSelectedItem("");
			cmbMobility.setSelectedItem("");
			cmbNutrition.setSelectedItem("");
			cmbFriction.setSelectedItem("");

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
			 * cmbNurse.addItem(n.getNurseName() + " " + n.getNurseSurName()); }
			 * 
			 * else { cmbNurse.removeAllItems();
			 * 
			 * cmbNurse.addItem(""); } } catch (Exception e) {
			 * e.printStackTrace(); }
			 */

		} else {
			ResidentAssessmentFormPage2 rafp2 = null;

			try {
				rafp2 = MedrexClientManager.getInstance()
						.getResidentAssessmentFormPage2(
								Global.currentResidentAssessmentFormPage1Key);
			} catch (Exception e) {

			}
			Global.currentResidentAssessmentFormPage2Key = rafp2.getSerial();
			cmbSensory.setSelectedItem(rafp2.getScoreSensory() + "");
			cmbMoisture.setSelectedItem(rafp2.getScoreMoisture() + "");
			cmbActivity.setSelectedItem(rafp2.getScoreActivity() + "");
			cmbMobility.setSelectedItem(rafp2.getScoreMobility() + "");
			cmbNutrition.setSelectedItem(rafp2.getScoreNutrition() + "");
			cmbFriction.setSelectedItem(rafp2.getScoreFriction() + "");

			// dcNurseVisit.setDate(rafp2.getNurseVisit());
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
			lblNurseVisit.setText(sdf.format(rafp2.getNurseVisit()));
			cmbNurse.setSelectedItem(rafp2.getNurse());

		}
		updateScore();
	}

	public int doSave() {
		ResidentAssessmentFormPage2 rafp2 = new ResidentAssessmentFormPage2();
		rafp2.setSerial(Global.currentResidentAssessmentFormPage2Key);
		rafp2.setFormId(Global.currentResidentAssessmentFormPage1Key);

		// rafp2.setNurseVisit(dcNurseVisit.getDate());
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

		try {
			rafp2.setNurseVisit(sdf.parse(lblNurseVisit.getText()));
		} catch (ParseException e2) {

			e2.printStackTrace();
		}
		rafp2.setNurse((String) cmbNurse.getSelectedItem());

		try {
			if (!cmbSensory.getSelectedItem().toString().equalsIgnoreCase("")) {
				rafp2.setScoreSensory(new Integer((String) cmbSensory
						.getSelectedItem()).intValue());
			}
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			if (!cmbMoisture.getSelectedItem().toString().equalsIgnoreCase("")) {
				rafp2.setScoreMoisture(new Integer((String) cmbMoisture
						.getSelectedItem()).intValue());
			}
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			if (!cmbActivity.getSelectedItem().toString().equalsIgnoreCase("")) {
				rafp2.setScoreActivity(new Integer((String) cmbActivity
						.getSelectedItem()).intValue());
			}
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			if (!cmbMobility.getSelectedItem().toString().equalsIgnoreCase("")) {
				rafp2.setScoreMobility(new Integer((String) cmbMobility
						.getSelectedItem()).intValue());
			}
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			if (!cmbNutrition.getSelectedItem().toString().equalsIgnoreCase("")) {
				rafp2.setScoreNutrition(new Integer((String) cmbNutrition
						.getSelectedItem()).intValue());
			}
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			if (!cmbFriction.getSelectedItem().toString().equalsIgnoreCase("")) {
				rafp2.setScoreFriction(new Integer((String) cmbFriction
						.getSelectedItem()).intValue());
			}
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			Global.currentResidentAssessmentFormPage2Key = MedrexClientManager
					.getInstance().insertOrUpdateResidentAssessmentFormPage2(
							rafp2);
			return (Global.currentResidentAssessmentFormPage2Key);
		} catch (Exception e) {
			return (0);

		}
	}

	public boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;

		if (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(
				cmbSensory, "Sensory Options"))) {
			vRes.addAllFrom(temp);
		}
		/*
		 * if (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(
		 * cmbActivity, "Activity Options"))) { vRes.addAllFrom(temp); } if
		 * (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(
		 * cmbFriction, "Friction Options"))) { vRes.addAllFrom(temp); } if
		 * (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(
		 * cmbMobility, "Mobility Options"))) { vRes.addAllFrom(temp); } if
		 * (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(
		 * cmbMoisture, "Moisture Options"))) { vRes.addAllFrom(temp); } if
		 * (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(
		 * cmbNutrition, "Nutrition Options"))) { vRes.addAllFrom(temp); }
		 */

		// System.out.println(FieldValidation.getMessages(vRes.getMessages()));
		// System.out.println(FieldValidation.getMessages(vRes.getMessages()));
		if (!FieldValidation.isEmpty(vRes)) {
			FieldValidation.Msgbox(vRes, "Resident Assessment Form: Page 2");
			return false;
		} else {
			// JOptionPane.showMessageDialog(this, "Saved successfully");
			return true;
		}

	}

}
