package medrex.client.main.admission;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Iterator;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldValidation;
import medrex.client.utils.SwingUtils;
import medrex.commons.intf.Form;
import medrex.commons.vo.admission.ResidentAssessmentFormPage6;
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

public class PanelResidentAssessmentFormPage6 extends JxPanel implements Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6329109011272207673L;

	Theme theme = new BlackOverWhiteTheme();

	private JxLabel lblRoom;
	private JxLabel lblResidentName;
	private JxDateChooser dcNurseVisit;
	private JxLabel dateLabel;
	private JxComboBox cmbNurse;
	private JxLabel ifSoWhatLabel;
	private JxPanel panel_10;
	private JxComboBox cmbMentalQ11;
	private JxComboBox cmbMentalQ10;
	private JxComboBox cmbMentalQ9;
	private JxComboBox cmbMentalQ8;
	private JxComboBox cmbMentalQ7;
	private JxComboBox cmbMentalQ6;
	private JxComboBox cmbMentalQ5;
	private JxComboBox cmbMentalQ4;
	private JxComboBox cmbMentalQ3;
	private JxComboBox cmbMentalQ2;
	private JxComboBox cmbMentalQ1;
	private JxRadioButton rbSideQ12No;
	private JxRadioButton rbSideQ12Yes;
	private JxRadioButton rbSideQ11No;
	private JxRadioButton rbSideQ11Yes;
	private JxRadioButton rbSideQ10No;
	private JxRadioButton rbSideQ10Yes;
	private JxRadioButton rbSideQ9No;
	private JxRadioButton rbSideQ9Yes;
	private JxRadioButton rbSideQ8No;
	private JxRadioButton rbSideQ8Yes;

	private ButtonGroup bgQ1 = new ButtonGroup();
	private ButtonGroup bgQ2 = new ButtonGroup();
	private ButtonGroup bgQ3 = new ButtonGroup();
	private ButtonGroup bgQ4 = new ButtonGroup();
	private ButtonGroup bgQ5 = new ButtonGroup();
	private ButtonGroup bgQ6 = new ButtonGroup();
	private ButtonGroup bgQ7 = new ButtonGroup();
	private ButtonGroup bgQ8 = new ButtonGroup();
	private ButtonGroup bgQ9 = new ButtonGroup();
	private ButtonGroup bgQ10 = new ButtonGroup();
	private ButtonGroup bgQ11 = new ButtonGroup();
	private ButtonGroup bgQ12 = new ButtonGroup();
	private ButtonGroup bgRecommendations = new ButtonGroup();
	private ButtonGroup bgOrder = new ButtonGroup();

	private JxRadioButton rbSideQ7No;
	private JxRadioButton rbSideQ7Yes;
	private JxRadioButton rbSideQ2Yes;
	private JxRadioButton rbSideQ2No;

	private JxRadioButton rbFalls3;
	private JxRadioButton rbFalls12;
	private JxRadioButton rbFallsNoFalls;
	private JxRadioButton rbConscienceIntermittent;
	private JxRadioButton rbConscienceDisOriented;
	private JxRadioButton rbConscienceAlert;

	private JxLabel lblTotal;

	public PanelResidentAssessmentFormPage6() {
		super();

		Global.panelResidentAssessmentFormPage6 = this;
		setLayout(null);
		setBorder(new LineBorder(Color.black, 1, true));
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(930, 1200));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBackground(Color.BLACK);
		panel.setLayout(null);
		panel.setBounds(0, 31, 925, 26);
		add(panel);

		final JxLabel fallRiskAssessmentLabel = new JxLabel();
		fallRiskAssessmentLabel.setTheme(theme);
		fallRiskAssessmentLabel.setForeground(new Color(255, 255, 255));

		fallRiskAssessmentLabel.setFontSize(14);
		fallRiskAssessmentLabel.setFontStyle(Font.BOLD);
		fallRiskAssessmentLabel.setText("SIDE RAIL ASSESSMENT");
		fallRiskAssessmentLabel.setBounds(389, 0, 187, 26);
		panel.add(fallRiskAssessmentLabel);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setBorder(new LineBorder(Color.black, 1, false));

		panel_2.setLayout(null);
		panel_2.setBounds(0, 63, 925, 595);
		add(panel_2);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setTheme(theme);
		panel_1.setBounds(3, 0, 915, 30);
		panel_2.add(panel_1);

		panel_1.setLayout(null);

		final JxLabel isTheResidentLabel = new JxLabel();
		isTheResidentLabel.setTheme(theme);
		isTheResidentLabel.setTheme(theme);
		isTheResidentLabel.setText("1.  Is the resident non-ambulatory?");
		isTheResidentLabel.setBounds(10, 5, 784, 16);
		panel_1.add(isTheResidentLabel);

		final JxRadioButton rbSideQ1Yes = new JxRadioButton();
		rbSideQ1Yes.setTheme(theme);
		rbSideQ1Yes.setTheme(theme);
		rbSideQ1Yes.setActionCommand("1");
		bgQ1.add(rbSideQ1Yes);

		rbSideQ1Yes.setText("Yes");
		rbSideQ1Yes.setBounds(800, 1, 46, 24);
		panel_1.add(rbSideQ1Yes);

		final JxRadioButton rbSideQ1No = new JxRadioButton();
		rbSideQ1No.setTheme(theme);
		rbSideQ1No.setTheme(theme);
		rbSideQ1No.setActionCommand("2");
		bgQ1.add(rbSideQ1No);

		rbSideQ1No.setText("No");
		rbSideQ1No.setBounds(860, 1, 46, 24);
		panel_1.add(rbSideQ1No);

		final JxPanel panel_1_1 = new JxPanel();
		panel_1_1.setTheme(theme);
		panel_1_1.setTheme(theme);
		panel_1_1.setBounds(3, 30, 915, 30);
		panel_2.add(panel_1_1);
		panel_1_1.setLayout(null);

		final JxLabel isTheResidentLabel_1 = new JxLabel();
		isTheResidentLabel_1.setTheme(theme);
		isTheResidentLabel_1.setTheme(theme);
		isTheResidentLabel_1
				.setText("2.  Is the resident comatose, Semi comatose, obtunded or has fluctuations in levels of consciousness ?");
		isTheResidentLabel_1.setBounds(10, 5, 784, 16);
		panel_1_1.add(isTheResidentLabel_1);

		rbSideQ2Yes = new JxRadioButton();
		rbSideQ2Yes.setTheme(theme);
		rbSideQ2Yes.setTheme(theme);
		rbSideQ2Yes.setActionCommand("1");
		bgQ2.add(rbSideQ2Yes);

		rbSideQ2Yes.setText("Yes");
		rbSideQ2Yes.setBounds(800, 1, 46, 24);
		panel_1_1.add(rbSideQ2Yes);

		rbSideQ2No = new JxRadioButton();
		rbSideQ2No.setTheme(theme);
		rbSideQ2No.setTheme(theme);
		rbSideQ2No.setActionCommand("2");
		bgQ2.add(rbSideQ2No);

		rbSideQ2No.setText("No");
		rbSideQ2No.setBounds(860, 1, 46, 24);
		panel_1_1.add(rbSideQ2No);

		final JxPanel panel_1_1_1 = new JxPanel();
		panel_1_1_1.setTheme(theme);
		panel_1_1_1.setTheme(theme);
		panel_1_1_1.setBounds(3, 60, 915, 30);
		panel_2.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);

		final JxLabel isTheResidentLabel_1_1 = new JxLabel();
		isTheResidentLabel_1_1.setTheme(theme);
		isTheResidentLabel_1_1.setTheme(theme);
		isTheResidentLabel_1_1
				.setText("3.  Does the resident have a history of falls ?");
		isTheResidentLabel_1_1.setBounds(10, 5, 784, 16);
		panel_1_1_1.add(isTheResidentLabel_1_1);

		final JxRadioButton rbSideQ3Yes = new JxRadioButton();
		rbSideQ3Yes.setTheme(theme);
		rbSideQ3Yes.setTheme(theme);
		rbSideQ3Yes.setActionCommand("1");
		bgQ3.add(rbSideQ3Yes);

		rbSideQ3Yes.setText("Yes");
		rbSideQ3Yes.setBounds(800, 1, 46, 24);
		panel_1_1_1.add(rbSideQ3Yes);

		final JxRadioButton rbSideQ3No = new JxRadioButton();
		rbSideQ3No.setTheme(theme);
		rbSideQ3No.setTheme(theme);
		rbSideQ3No.setActionCommand("2");
		bgQ3.add(rbSideQ3No);

		rbSideQ3No.setText("No");
		rbSideQ3No.setBounds(860, 1, 46, 24);
		panel_1_1_1.add(rbSideQ3No);

		final JxPanel panel_1_1_1_1 = new JxPanel();
		panel_1_1_1_1.setTheme(theme);
		panel_1_1_1_1.setTheme(theme);
		panel_1_1_1_1.setBounds(3, 90, 915, 30);
		panel_2.add(panel_1_1_1_1);
		panel_1_1_1_1.setLayout(null);

		final JxLabel isTheResidentLabel_1_1_1 = new JxLabel();
		isTheResidentLabel_1_1_1.setTheme(theme);
		isTheResidentLabel_1_1_1.setTheme(theme);
		isTheResidentLabel_1_1_1
				.setText("4.  Does the resident have alteration in safety awareness due to cognitive decline ?");
		isTheResidentLabel_1_1_1.setBounds(10, 5, 784, 16);
		panel_1_1_1_1.add(isTheResidentLabel_1_1_1);

		final JxRadioButton rbSideQ4Yes = new JxRadioButton();
		rbSideQ4Yes.setTheme(theme);
		rbSideQ4Yes.setTheme(theme);
		rbSideQ4Yes.setActionCommand("1");
		bgQ4.add(rbSideQ4Yes);

		rbSideQ4Yes.setText("Yes");
		rbSideQ4Yes.setBounds(800, 1, 46, 24);
		panel_1_1_1_1.add(rbSideQ4Yes);

		final JxRadioButton rbSideQ4No = new JxRadioButton();
		rbSideQ4No.setTheme(theme);
		rbSideQ4No.setTheme(theme);
		rbSideQ4No.setActionCommand("2");
		bgQ4.add(rbSideQ4No);

		rbSideQ4No.setText("No");
		rbSideQ4No.setBounds(860, 1, 46, 24);
		panel_1_1_1_1.add(rbSideQ4No);

		final JxPanel panel_1_1_1_1_1 = new JxPanel();
		panel_1_1_1_1_1.setTheme(theme);
		panel_1_1_1_1_1.setTheme(theme);
		panel_1_1_1_1_1.setBounds(3, 120, 915, 30);
		panel_2.add(panel_1_1_1_1_1);
		panel_1_1_1_1_1.setLayout(null);

		final JxLabel isTheResidentLabel_1_1_1_1 = new JxLabel();
		isTheResidentLabel_1_1_1_1.setTheme(theme);
		isTheResidentLabel_1_1_1_1.setTheme(theme);
		isTheResidentLabel_1_1_1_1
				.setText("5.  Has the resident demonstrated poor bed mobility or difficulty moving to a sitting position on the side of the bed ?");
		isTheResidentLabel_1_1_1_1.setBounds(10, 5, 784, 16);
		panel_1_1_1_1_1.add(isTheResidentLabel_1_1_1_1);

		final JxRadioButton rbSideQ5Yes = new JxRadioButton();
		rbSideQ5Yes.setTheme(theme);
		rbSideQ5Yes.setTheme(theme);
		rbSideQ5Yes.setActionCommand("1");
		bgQ5.add(rbSideQ5Yes);

		rbSideQ5Yes.setText("Yes");
		rbSideQ5Yes.setBounds(800, 1, 46, 24);
		panel_1_1_1_1_1.add(rbSideQ5Yes);

		final JxRadioButton rbSideQ5No = new JxRadioButton();
		rbSideQ5No.setTheme(theme);
		rbSideQ5No.setTheme(theme);
		rbSideQ5No.setActionCommand("2");
		bgQ5.add(rbSideQ5No);

		rbSideQ5No.setText("No");
		rbSideQ5No.setBounds(860, 1, 46, 24);
		panel_1_1_1_1_1.add(rbSideQ5No);

		final JxPanel panel_1_1_1_1_1_1 = new JxPanel();
		panel_1_1_1_1_1_1.setTheme(theme);
		panel_1_1_1_1_1_1.setTheme(theme);
		panel_1_1_1_1_1_1.setBounds(3, 150, 915, 30);
		panel_2.add(panel_1_1_1_1_1_1);
		panel_1_1_1_1_1_1.setLayout(null);

		final JxLabel isTheResidentLabel_1_1_1_1_1 = new JxLabel();
		isTheResidentLabel_1_1_1_1_1.setTheme(theme);
		isTheResidentLabel_1_1_1_1_1.setTheme(theme);
		isTheResidentLabel_1_1_1_1_1
				.setText("6.  Does the resident have difficulty with balance or poor trunk control ?");
		isTheResidentLabel_1_1_1_1_1.setBounds(10, 5, 784, 16);
		panel_1_1_1_1_1_1.add(isTheResidentLabel_1_1_1_1_1);

		final JxRadioButton rbSideQ6Yes = new JxRadioButton();
		rbSideQ6Yes.setTheme(theme);
		rbSideQ6Yes.setTheme(theme);
		rbSideQ6Yes.setActionCommand("1");
		bgQ6.add(rbSideQ6Yes);

		rbSideQ6Yes.setText("Yes");
		rbSideQ6Yes.setBounds(800, 1, 46, 24);
		panel_1_1_1_1_1_1.add(rbSideQ6Yes);

		final JxRadioButton rbSideQ6No = new JxRadioButton();
		rbSideQ6No.setTheme(theme);
		rbSideQ6No.setTheme(theme);
		rbSideQ6No.setActionCommand("2");
		bgQ6.add(rbSideQ6No);

		rbSideQ6No.setText("No");
		rbSideQ6No.setBounds(860, 1, 46, 24);
		panel_1_1_1_1_1_1.add(rbSideQ6No);

		final JxPanel panel_1_1_2 = new JxPanel();
		panel_1_1_2.setTheme(theme);
		panel_1_1_2.setTheme(theme);
		panel_1_1_2.setLayout(null);

		panel_1_1_2.setBounds(3, 178, 915, 30);
		panel_2.add(panel_1_1_2);

		final JxLabel isTheResidentLabel_1_2 = new JxLabel();
		isTheResidentLabel_1_2.setTheme(theme);
		isTheResidentLabel_1_2.setTheme(theme);
		isTheResidentLabel_1_2
				.setText("7. Does the resident have difficulty with postural hypotension ?");
		isTheResidentLabel_1_2.setBounds(10, 5, 784, 16);
		panel_1_1_2.add(isTheResidentLabel_1_2);

		rbSideQ7Yes = new JxRadioButton();
		rbSideQ7Yes.setTheme(theme);
		rbSideQ7Yes.setTheme(theme);
		rbSideQ7Yes.setActionCommand("1");
		bgQ7.add(rbSideQ7Yes);

		rbSideQ7Yes.setText("Yes");
		rbSideQ7Yes.setBounds(800, 1, 46, 24);
		panel_1_1_2.add(rbSideQ7Yes);

		rbSideQ7No = new JxRadioButton();
		rbSideQ7No.setTheme(theme);
		rbSideQ7No.setTheme(theme);
		rbSideQ7No.setActionCommand("2");
		bgQ7.add(rbSideQ7No);

		rbSideQ7No.setText("No");
		rbSideQ7No.setBounds(860, 1, 46, 24);
		panel_1_1_2.add(rbSideQ7No);

		final JxPanel panel_1_1_2_1 = new JxPanel();
		panel_1_1_2_1.setTheme(theme);
		panel_1_1_2_1.setTheme(theme);
		panel_1_1_2_1.setLayout(null);

		panel_1_1_2_1.setBounds(3, 209, 915, 30);
		panel_2.add(panel_1_1_2_1);

		final JxLabel isTheResidentLabel_1_2_1 = new JxLabel();
		isTheResidentLabel_1_2_1.setTheme(theme);
		isTheResidentLabel_1_2_1.setTheme(theme);
		isTheResidentLabel_1_2_1
				.setText("8. Is the resident on any medications which would require safety precautions ?");
		isTheResidentLabel_1_2_1.setBounds(10, 5, 784, 16);
		panel_1_1_2_1.add(isTheResidentLabel_1_2_1);

		rbSideQ8Yes = new JxRadioButton();
		rbSideQ8Yes.setTheme(theme);
		rbSideQ8Yes.setTheme(theme);
		bgQ8.add(rbSideQ8Yes);
		rbSideQ8Yes.setActionCommand("1");

		rbSideQ8Yes.setText("Yes");
		rbSideQ8Yes.setBounds(800, 1, 46, 24);
		panel_1_1_2_1.add(rbSideQ8Yes);

		rbSideQ8No = new JxRadioButton();
		rbSideQ8No.setTheme(theme);
		rbSideQ8No.setTheme(theme);
		bgQ8.add(rbSideQ8No);
		rbSideQ8No.setActionCommand("2");

		rbSideQ8No.setText("No");
		rbSideQ8No.setBounds(860, 1, 46, 24);
		panel_1_1_2_1.add(rbSideQ8No);

		final JxPanel panel_1_1_2_1_1 = new JxPanel();
		panel_1_1_2_1_1.setTheme(theme);
		panel_1_1_2_1_1.setTheme(theme);
		panel_1_1_2_1_1.setLayout(null);

		panel_1_1_2_1_1.setBounds(3, 236, 915, 30);
		panel_2.add(panel_1_1_2_1_1);

		final JxLabel isTheResidentLabel_1_2_1_1 = new JxLabel();
		isTheResidentLabel_1_2_1_1.setTheme(theme);
		isTheResidentLabel_1_2_1_1.setTheme(theme);
		isTheResidentLabel_1_2_1_1
				.setText("9. Is the resident currently using the side rail for positioning or support ?");
		isTheResidentLabel_1_2_1_1.setBounds(10, 5, 784, 16);
		panel_1_1_2_1_1.add(isTheResidentLabel_1_2_1_1);

		rbSideQ9Yes = new JxRadioButton();
		rbSideQ9Yes.setTheme(theme);
		rbSideQ9Yes.setTheme(theme);
		bgQ9.add(rbSideQ9Yes);
		rbSideQ9Yes.setActionCommand("1");

		rbSideQ9Yes.setText("Yes");
		rbSideQ9Yes.setBounds(800, 1, 46, 24);
		panel_1_1_2_1_1.add(rbSideQ9Yes);

		rbSideQ9No = new JxRadioButton();
		rbSideQ9No.setTheme(theme);
		rbSideQ9No.setTheme(theme);
		bgQ9.add(rbSideQ9No);
		rbSideQ9No.setActionCommand("2");

		rbSideQ9No.setText("No");
		rbSideQ9No.setBounds(860, 1, 46, 24);
		panel_1_1_2_1_1.add(rbSideQ9No);

		final JxPanel panel_1_1_2_1_1_1 = new JxPanel();
		panel_1_1_2_1_1_1.setTheme(theme);
		panel_1_1_2_1_1_1.setTheme(theme);
		panel_1_1_2_1_1_1.setLayout(null);

		panel_1_1_2_1_1_1.setBounds(3, 264, 915, 30);
		panel_2.add(panel_1_1_2_1_1_1);

		final JxLabel isTheResidentLabel_1_2_1_1_1 = new JxLabel();
		isTheResidentLabel_1_2_1_1_1.setTheme(theme);
		isTheResidentLabel_1_2_1_1_1.setTheme(theme);
		isTheResidentLabel_1_2_1_1_1
				.setText("10. Has the resident expressed the desire to have side rails raised while in bed for their own safety and / or comfort ?");
		isTheResidentLabel_1_2_1_1_1.setBounds(10, 5, 784, 16);
		panel_1_1_2_1_1_1.add(isTheResidentLabel_1_2_1_1_1);

		rbSideQ10Yes = new JxRadioButton();
		rbSideQ10Yes.setTheme(theme);
		rbSideQ10Yes.setTheme(theme);
		bgQ10.add(rbSideQ10Yes);
		rbSideQ10Yes.setActionCommand("1");

		rbSideQ10Yes.setText("Yes");
		rbSideQ10Yes.setBounds(800, 1, 46, 24);
		panel_1_1_2_1_1_1.add(rbSideQ10Yes);

		rbSideQ10No = new JxRadioButton();
		rbSideQ10No.setTheme(theme);
		rbSideQ10No.setTheme(theme);
		bgQ10.add(rbSideQ10No);
		rbSideQ10No.setActionCommand("2");

		rbSideQ10No.setText("No");
		rbSideQ10No.setBounds(860, 1, 46, 24);
		panel_1_1_2_1_1_1.add(rbSideQ10No);

		final JxPanel panel_1_1_2_1_1_1_1 = new JxPanel();
		panel_1_1_2_1_1_1_1.setTheme(theme);
		panel_1_1_2_1_1_1_1.setTheme(theme);
		panel_1_1_2_1_1_1_1.setLayout(null);

		panel_1_1_2_1_1_1_1.setBounds(3, 292, 915, 30);
		panel_2.add(panel_1_1_2_1_1_1_1);

		final JxLabel isTheResidentLabel_1_2_1_1_1_1 = new JxLabel();
		isTheResidentLabel_1_2_1_1_1_1.setTheme(theme);
		isTheResidentLabel_1_2_1_1_1_1.setTheme(theme);
		isTheResidentLabel_1_2_1_1_1_1
				.setText("11. Has the resident requested that side rails not be released while sleeping ?");
		isTheResidentLabel_1_2_1_1_1_1.setBounds(10, 5, 784, 16);
		panel_1_1_2_1_1_1_1.add(isTheResidentLabel_1_2_1_1_1_1);

		rbSideQ11Yes = new JxRadioButton();
		rbSideQ11Yes.setTheme(theme);
		rbSideQ11Yes.setTheme(theme);
		bgQ11.add(rbSideQ11Yes);
		rbSideQ11Yes.setActionCommand("1");

		rbSideQ11Yes.setText("Yes");
		rbSideQ11Yes.setBounds(800, 1, 46, 24);
		panel_1_1_2_1_1_1_1.add(rbSideQ11Yes);

		rbSideQ11No = new JxRadioButton();
		rbSideQ11No.setTheme(theme);
		rbSideQ11No.setTheme(theme);
		bgQ11.add(rbSideQ11No);
		rbSideQ11No.setActionCommand("2");

		rbSideQ11No.setText("No");
		rbSideQ11No.setBounds(860, 1, 46, 24);
		panel_1_1_2_1_1_1_1.add(rbSideQ11No);

		final JxPanel panel_1_1_2_1_1_1_1_1 = new JxPanel();
		panel_1_1_2_1_1_1_1_1.setTheme(theme);
		panel_1_1_2_1_1_1_1_1.setTheme(theme);
		panel_1_1_2_1_1_1_1_1.setLayout(null);

		panel_1_1_2_1_1_1_1_1.setBounds(3, 320, 915, 30);
		panel_2.add(panel_1_1_2_1_1_1_1_1);

		final JxLabel isTheResidentLabel_1_2_1_1_1_1_1 = new JxLabel();
		isTheResidentLabel_1_2_1_1_1_1_1.setTheme(theme);
		isTheResidentLabel_1_2_1_1_1_1_1.setTheme(theme);
		isTheResidentLabel_1_2_1_1_1_1_1
				.setText("12. Is the resident visually challenged ?");
		isTheResidentLabel_1_2_1_1_1_1_1.setBounds(10, 5, 784, 16);
		panel_1_1_2_1_1_1_1_1.add(isTheResidentLabel_1_2_1_1_1_1_1);

		rbSideQ12Yes = new JxRadioButton();
		rbSideQ12Yes.setTheme(theme);
		rbSideQ12Yes.setTheme(theme);
		bgQ12.add(rbSideQ12Yes);
		rbSideQ12Yes.setActionCommand("1");

		rbSideQ12Yes.setText("Yes");
		rbSideQ12Yes.setBounds(800, 1, 46, 24);
		panel_1_1_2_1_1_1_1_1.add(rbSideQ12Yes);

		rbSideQ12No = new JxRadioButton();
		rbSideQ12No.setTheme(theme);
		rbSideQ12No.setTheme(theme);
		bgQ12.add(rbSideQ12No);
		rbSideQ12No.setActionCommand("2");

		rbSideQ12No.setText("No");
		rbSideQ12No.setBounds(860, 1, 46, 24);
		panel_1_1_2_1_1_1_1_1.add(rbSideQ12No);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setTheme(theme);

		panel_3.setLayout(null);
		panel_3.setBounds(3, 370, 915, 30);
		panel_2.add(panel_3);

		final JxLabel recommendationsLabel = new JxLabel();
		recommendationsLabel.setTheme(theme);
		recommendationsLabel.setTheme(theme);

		recommendationsLabel.setFontSize(12);
		recommendationsLabel.setFontStyle(Font.BOLD);
		recommendationsLabel.setText("RECOMMENDATIONS");
		recommendationsLabel.setBounds(10, 5, 130, 16);
		panel_3.add(recommendationsLabel);

		final JxRadioButton rbRecommendationLeft = new JxRadioButton();
		rbRecommendationLeft.setTheme(theme);
		rbRecommendationLeft.setTheme(theme);
		bgRecommendations.add(rbRecommendationLeft);
		rbRecommendationLeft.setActionCommand("1");

		rbRecommendationLeft.setText("Left");
		rbRecommendationLeft.setBounds(159, 1, 57, 24);
		panel_3.add(rbRecommendationLeft);

		final JxRadioButton rbRecommendationRight = new JxRadioButton();
		rbRecommendationRight.setTheme(theme);
		rbRecommendationRight.setTheme(theme);
		bgRecommendations.add(rbRecommendationRight);
		rbRecommendationRight.setActionCommand("2");

		rbRecommendationRight.setText("Right");
		rbRecommendationRight.setBounds(222, 1, 57, 24);
		panel_3.add(rbRecommendationRight);

		final JxRadioButton rbRecommendationBilaterals = new JxRadioButton();
		rbRecommendationBilaterals.setTheme(theme);
		rbRecommendationBilaterals.setTheme(theme);
		bgRecommendations.add(rbRecommendationBilaterals);
		rbRecommendationBilaterals.setActionCommand("3");

		rbRecommendationBilaterals.setText("Bilateral");
		rbRecommendationBilaterals.setBounds(297, 1, 80, 24);
		panel_3.add(rbRecommendationBilaterals);

		final JxRadioButton rbRecommendationHalfRails = new JxRadioButton();
		rbRecommendationHalfRails.setTheme(theme);
		rbRecommendationHalfRails.setTheme(theme);
		bgRecommendations.add(rbRecommendationHalfRails);
		rbRecommendationHalfRails.setActionCommand("4");

		rbRecommendationHalfRails.setText("HalfRail");
		rbRecommendationHalfRails.setBounds(383, 1, 80, 24);
		panel_3.add(rbRecommendationHalfRails);

		final JxRadioButton rbRecommendationNone = new JxRadioButton();
		rbRecommendationNone.setTheme(theme);
		rbRecommendationNone.setTheme(theme);
		bgRecommendations.add(rbRecommendationNone);
		rbRecommendationNone.setActionCommand("5");

		rbRecommendationNone.setText("None");
		rbRecommendationNone.setBounds(469, 1, 80, 24);
		panel_3.add(rbRecommendationNone);

		final JxTextA physiciansOrderMustTextArea = new JxTextA();
		physiciansOrderMustTextArea.setTheme(theme);

		physiciansOrderMustTextArea.setFontSize(12);
		physiciansOrderMustTextArea.setFontStyle(Font.BOLD);
		physiciansOrderMustTextArea
				.setText("Physicians order must be written for 72 hours, for full side rails. IDCP Team members must be notified and can only give continued approval for side rails after 72 hours. Resident / Family consent must be signed and placed in medical record.");
		physiciansOrderMustTextArea.setWrapStyleWord(true);
		physiciansOrderMustTextArea.setLineWrap(true);
		physiciansOrderMustTextArea.setBounds(10, 416, 905, 43);
		panel_2.add(physiciansOrderMustTextArea);

		final JxRadioButton rbOrder1 = new JxRadioButton();
		rbOrder1.setTheme(theme);
		rbOrder1.setTheme(theme);
		bgOrder.add(rbOrder1);

		rbOrder1.setActionCommand("1");
		rbOrder1
				.setText("AT THIS TIME: side rails are indicated to provide safety .");
		rbOrder1.setBounds(71, 455, 467, 24);
		panel_2.add(rbOrder1);

		final JxRadioButton rbOrder2 = new JxRadioButton();
		rbOrder2.setTheme(theme);
		rbOrder2.setTheme(theme);
		bgOrder.add(rbOrder2);

		rbOrder2.setActionCommand("2");
		rbOrder2
				.setText("Side rails are indicated and serve as an enabler to promote independence.");
		rbOrder2.setBounds(71, 481, 467, 24);
		panel_2.add(rbOrder2);

		final JxRadioButton rbOrder3 = new JxRadioButton();
		rbOrder3.setTheme(theme);
		rbOrder3.setTheme(theme);
		bgOrder.add(rbOrder3);

		rbOrder3.setActionCommand("3");
		rbOrder3
				.setText("The resident has expressed a desire to have side rails raised while in bed.");
		rbOrder3.setBounds(71, 511, 467, 24);
		panel_2.add(rbOrder3);

		final JxRadioButton rbOrder4 = new JxRadioButton();
		rbOrder4.setTheme(theme);
		rbOrder4.setTheme(theme);
		bgOrder.add(rbOrder4);

		rbOrder4.setActionCommand("4");
		rbOrder4
				.setText("Side rails do not appear to be indicated at this time.");
		rbOrder4.setBounds(71, 541, 467, 24);
		panel_2.add(rbOrder4);

		final JxRadioButton rbOrder5 = new JxRadioButton();
		rbOrder5.setTheme(theme);
		rbOrder5.setTheme(theme);
		bgOrder.add(rbOrder5);

		rbOrder5.setActionCommand("5");
		rbOrder5.setText("Does not have ambulatory ability");
		rbOrder5.setBounds(71, 571, 467, 24);
		panel_2.add(rbOrder5);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);
		panel_4.setTheme(theme);
		panel_4.setBackground(Color.BLACK);
		panel_4.setLayout(null);
		panel_4.setBounds(0, 658, 102, 40);
		add(panel_4);

		final JxTextA maximumScoreTextArea = new JxTextA();
		maximumScoreTextArea.setTheme(theme);
		maximumScoreTextArea.setText("MAXIMUM SCORE");
		maximumScoreTextArea.setWrapStyleWord(true);
		maximumScoreTextArea.setLineWrap(true);
		maximumScoreTextArea.setForeground(new Color(255, 255, 255));

		maximumScoreTextArea.setFontSize(12);
		maximumScoreTextArea.setFontStyle(Font.BOLD);
		maximumScoreTextArea.setBackground(Color.BLACK);
		maximumScoreTextArea.setBounds(20, 3, 62, 37);
		panel_4.add(maximumScoreTextArea);

		final JxPanel panel_4_1 = new JxPanel();
		panel_4_1.setTheme(theme);
		panel_4_1.setTheme(theme);
		panel_4_1.setLayout(null);
		panel_4_1.setBackground(Color.BLACK);
		panel_4_1.setBounds(103, 658, 102, 40);
		add(panel_4_1);

		final JxTextA maximumScoreTextArea_1 = new JxTextA();
		maximumScoreTextArea_1.setTheme(theme);
		maximumScoreTextArea_1.setWrapStyleWord(true);
		maximumScoreTextArea_1.setText("RESIDENT SCORE");
		maximumScoreTextArea_1.setLineWrap(true);
		maximumScoreTextArea_1.setForeground(new Color(255, 255, 255));

		maximumScoreTextArea_1.setFontSize(12);
		maximumScoreTextArea_1.setFontStyle(Font.BOLD);
		maximumScoreTextArea_1.setBackground(Color.BLACK);
		maximumScoreTextArea_1.setBounds(20, 3, 62, 37);
		panel_4_1.add(maximumScoreTextArea_1);

		final JxPanel panel_4_1_1 = new JxPanel();
		panel_4_1_1.setTheme(theme);
		panel_4_1_1.setTheme(theme);
		panel_4_1_1.setLayout(null);
		panel_4_1_1.setBackground(Color.BLACK);
		panel_4_1_1.setBounds(206, 658, 719, 40);
		add(panel_4_1_1);

		final JxTextA maximumScoreTextArea_1_1 = new JxTextA();
		maximumScoreTextArea_1_1.setTheme(theme);
		maximumScoreTextArea_1_1.setWrapStyleWord(true);
		maximumScoreTextArea_1_1.setText("MINI - MENTAL STATUS EXAMINATION");
		maximumScoreTextArea_1_1.setLineWrap(true);
		maximumScoreTextArea_1_1.setForeground(new Color(255, 255, 255));

		maximumScoreTextArea_1_1.setFontSize(12);
		maximumScoreTextArea_1_1.setFontStyle(Font.BOLD);
		maximumScoreTextArea_1_1.setBackground(Color.BLACK);
		maximumScoreTextArea_1_1.setBounds(230, 10, 225, 16);
		panel_4_1_1.add(maximumScoreTextArea_1_1);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setTheme(theme);
		panel_5.setLayout(null);

		panel_5.setBounds(0, 698, 925, 32);
		add(panel_5);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setTheme(theme);

		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setLayout(null);
		panel_6.setBounds(0, 0, 103, 32);
		panel_5.add(panel_6);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);
		label.setTheme(theme);
		label.setText("5");
		label.setBounds(40, 7, 17, 16);
		panel_6.add(label);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setTheme(theme);
		panel_7.setLayout(null);
		panel_7.setBorder(new LineBorder(Color.black, 1, false));

		panel_7.setBounds(102, 0, 103, 32);
		panel_5.add(panel_7);

		cmbMentalQ1 = new JxComboBox();
		cmbMentalQ1.setTheme(theme);
		cmbMentalQ1.setTheme(theme);
		cmbMentalQ1.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				updateScore();
			}
		});

		cmbMentalQ1.setBounds(25, 3, 46, 25);
		panel_7.add(cmbMentalQ1);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);
		panel_8.setTheme(theme);
		panel_8.setLayout(null);
		panel_8.setBorder(new LineBorder(Color.black, 1, false));

		panel_8.setBounds(204, 0, 721, 32);
		panel_5.add(panel_8);

		final JxTextA whatIsTheTextArea = new JxTextA();
		whatIsTheTextArea.setTheme(theme);

		whatIsTheTextArea
				.setText("What is the date (e.g., day of the week , day of the month, year , season ) ?");
		whatIsTheTextArea.setEditable(false);
		whatIsTheTextArea.setWrapStyleWord(true);
		whatIsTheTextArea.setLineWrap(true);
		whatIsTheTextArea.setBounds(8, 6, 600, 16);
		panel_8.add(whatIsTheTextArea);

		final JxPanel panel_5_1 = new JxPanel();
		panel_5_1.setTheme(theme);
		panel_5_1.setTheme(theme);
		panel_5_1.setLayout(null);

		panel_5_1.setBounds(0, 729, 925, 32);
		add(panel_5_1);

		final JxPanel panel_6_1 = new JxPanel();
		panel_6_1.setTheme(theme);
		panel_6_1.setTheme(theme);
		panel_6_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1.setLayout(null);

		panel_6_1.setBounds(0, 0, 103, 32);
		panel_5_1.add(panel_6_1);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);
		label_1.setTheme(theme);
		label_1.setText("5");
		label_1.setBounds(40, 7, 17, 16);
		panel_6_1.add(label_1);

		final JxPanel panel_7_1 = new JxPanel();
		panel_7_1.setTheme(theme);
		panel_7_1.setTheme(theme);
		panel_7_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1.setLayout(null);

		panel_7_1.setBounds(102, 0, 103, 32);
		panel_5_1.add(panel_7_1);

		cmbMentalQ2 = new JxComboBox();
		cmbMentalQ2.setTheme(theme);
		cmbMentalQ2.setTheme(theme);
		cmbMentalQ2.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				updateScore();
			}
		});

		cmbMentalQ2.setBounds(25, 3, 46, 25);
		panel_7_1.add(cmbMentalQ2);

		final JxPanel panel_8_1 = new JxPanel();
		panel_8_1.setTheme(theme);
		panel_8_1.setTheme(theme);
		panel_8_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1.setLayout(null);

		panel_8_1.setBounds(204, 0, 721, 32);
		panel_5_1.add(panel_8_1);

		final JxTextA whatIsTheTextArea_1 = new JxTextA();
		whatIsTheTextArea_1.setTheme(theme);

		whatIsTheTextArea_1.setWrapStyleWord(true);
		whatIsTheTextArea_1
				.setText("Where are we: (hospital, state, county, town, floor) ?");
		whatIsTheTextArea_1.setLineWrap(true);
		whatIsTheTextArea_1.setEditable(false);
		whatIsTheTextArea_1.setBounds(8, 6, 600, 16);
		panel_8_1.add(whatIsTheTextArea_1);

		final JxPanel panel_5_1_1 = new JxPanel();
		panel_5_1_1.setTheme(theme);
		panel_5_1_1.setTheme(theme);
		panel_5_1_1.setLayout(null);

		panel_5_1_1.setBounds(0, 760, 925, 57);
		add(panel_5_1_1);

		final JxPanel panel_6_1_1 = new JxPanel();
		panel_6_1_1.setTheme(theme);
		panel_6_1_1.setTheme(theme);
		panel_6_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1.setLayout(null);

		panel_6_1_1.setBounds(0, 0, 103, 57);
		panel_5_1_1.add(panel_6_1_1);

		final JxLabel label_1_1 = new JxLabel();
		label_1_1.setTheme(theme);
		label_1_1.setTheme(theme);
		label_1_1.setText("3");
		label_1_1.setBounds(40, 7, 17, 16);
		panel_6_1_1.add(label_1_1);

		final JxPanel panel_7_1_1 = new JxPanel();
		panel_7_1_1.setTheme(theme);
		panel_7_1_1.setTheme(theme);
		panel_7_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1.setLayout(null);

		panel_7_1_1.setBounds(102, 0, 103, 57);
		panel_5_1_1.add(panel_7_1_1);

		cmbMentalQ3 = new JxComboBox();
		cmbMentalQ3.setTheme(theme);
		cmbMentalQ3.setTheme(theme);
		cmbMentalQ3.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				updateScore();
			}
		});

		cmbMentalQ3.setBounds(24, 10, 46, 25);
		panel_7_1_1.add(cmbMentalQ3);

		final JxPanel panel_8_1_1 = new JxPanel();
		panel_8_1_1.setTheme(theme);
		panel_8_1_1.setTheme(theme);
		panel_8_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1.setLayout(null);

		panel_8_1_1.setBounds(204, 0, 721, 57);
		panel_5_1_1.add(panel_8_1_1);

		final JxTextA whatIsTheTextArea_1_1 = new JxTextA();
		whatIsTheTextArea_1_1.setTheme(theme);

		whatIsTheTextArea_1_1.setWrapStyleWord(true);
		whatIsTheTextArea_1_1
				.setText("Name 3 objects, taking 1 second to say each. Then ask the patient to repeat all three. Give 1 point for each correct answer. Then repeat them until patient learns all three. Count trials and record .  Number of trials");
		whatIsTheTextArea_1_1.setLineWrap(true);
		whatIsTheTextArea_1_1.setEditable(false);
		whatIsTheTextArea_1_1.setBounds(8, 6, 703, 41);
		panel_8_1_1.add(whatIsTheTextArea_1_1);

		final JxPanel panel_5_1_2 = new JxPanel();
		panel_5_1_2.setTheme(theme);
		panel_5_1_2.setTheme(theme);
		panel_5_1_2.setLayout(null);

		panel_5_1_2.setBounds(0, 816, 925, 32);
		add(panel_5_1_2);

		final JxPanel panel_6_1_2 = new JxPanel();
		panel_6_1_2.setTheme(theme);
		panel_6_1_2.setTheme(theme);
		panel_6_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_2.setLayout(null);

		panel_6_1_2.setBounds(0, 0, 103, 32);
		panel_5_1_2.add(panel_6_1_2);

		final JxLabel label_1_2 = new JxLabel();
		label_1_2.setTheme(theme);
		label_1_2.setTheme(theme);
		label_1_2.setText("5");
		label_1_2.setBounds(40, 7, 17, 16);
		panel_6_1_2.add(label_1_2);

		final JxPanel panel_7_1_2 = new JxPanel();
		panel_7_1_2.setTheme(theme);
		panel_7_1_2.setTheme(theme);
		panel_7_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2.setLayout(null);

		panel_7_1_2.setBounds(102, 0, 103, 32);
		panel_5_1_2.add(panel_7_1_2);

		cmbMentalQ4 = new JxComboBox();
		cmbMentalQ4.setTheme(theme);
		cmbMentalQ4.setTheme(theme);
		cmbMentalQ4.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				updateScore();
			}
		});

		cmbMentalQ4.setBounds(25, 3, 46, 25);
		panel_7_1_2.add(cmbMentalQ4);

		final JxPanel panel_8_1_2 = new JxPanel();
		panel_8_1_2.setTheme(theme);
		panel_8_1_2.setTheme(theme);
		panel_8_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2.setLayout(null);

		panel_8_1_2.setBounds(204, 0, 721, 32);
		panel_5_1_2.add(panel_8_1_2);

		final JxTextA whatIsTheTextArea_1_2 = new JxTextA();
		whatIsTheTextArea_1_2.setTheme(theme);

		whatIsTheTextArea_1_2.setWrapStyleWord(true);
		whatIsTheTextArea_1_2
				.setText("Serial 7's. Give 1 point for each correct answer. Stop after 5 answers. If subject refuses, ask him to spell \"world\" backwards.");
		whatIsTheTextArea_1_2.setLineWrap(true);
		whatIsTheTextArea_1_2.setEditable(false);
		whatIsTheTextArea_1_2.setBounds(8, 6, 703, 16);
		panel_8_1_2.add(whatIsTheTextArea_1_2);

		final JxPanel panel_5_1_2_1 = new JxPanel();
		panel_5_1_2_1.setTheme(theme);
		panel_5_1_2_1.setTheme(theme);
		panel_5_1_2_1.setLayout(null);

		panel_5_1_2_1.setBounds(0, 846, 925, 32);
		add(panel_5_1_2_1);

		final JxPanel panel_6_1_2_1 = new JxPanel();
		panel_6_1_2_1.setTheme(theme);
		panel_6_1_2_1.setTheme(theme);
		panel_6_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_2_1.setLayout(null);

		panel_6_1_2_1.setBounds(0, 0, 103, 32);
		panel_5_1_2_1.add(panel_6_1_2_1);

		final JxLabel label_1_2_1 = new JxLabel();
		label_1_2_1.setTheme(theme);
		label_1_2_1.setTheme(theme);
		label_1_2_1.setText("3");
		label_1_2_1.setBounds(40, 7, 17, 16);
		panel_6_1_2_1.add(label_1_2_1);

		final JxPanel panel_7_1_2_1 = new JxPanel();
		panel_7_1_2_1.setTheme(theme);
		panel_7_1_2_1.setTheme(theme);
		panel_7_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2_1.setLayout(null);

		panel_7_1_2_1.setBounds(102, 0, 103, 32);
		panel_5_1_2_1.add(panel_7_1_2_1);

		cmbMentalQ5 = new JxComboBox();
		cmbMentalQ5.setTheme(theme);
		cmbMentalQ5.setTheme(theme);
		cmbMentalQ5.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				updateScore();
			}
		});

		cmbMentalQ5.setBounds(25, 3, 46, 25);
		panel_7_1_2_1.add(cmbMentalQ5);

		final JxPanel panel_8_1_2_1 = new JxPanel();
		panel_8_1_2_1.setTheme(theme);
		panel_8_1_2_1.setTheme(theme);
		panel_8_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2_1.setLayout(null);

		panel_8_1_2_1.setBounds(204, 0, 721, 32);
		panel_5_1_2_1.add(panel_8_1_2_1);

		final JxTextA whatIsTheTextArea_1_2_1 = new JxTextA();
		whatIsTheTextArea_1_2_1.setTheme(theme);

		whatIsTheTextArea_1_2_1.setWrapStyleWord(true);
		whatIsTheTextArea_1_2_1
				.setText("Ask the patient to name the 3 objects cited above. Give 1 point for each correct answer.");
		whatIsTheTextArea_1_2_1.setLineWrap(true);
		whatIsTheTextArea_1_2_1.setEditable(false);
		whatIsTheTextArea_1_2_1.setBounds(8, 6, 600, 16);
		panel_8_1_2_1.add(whatIsTheTextArea_1_2_1);

		final JxPanel panel_5_1_2_1_1 = new JxPanel();
		panel_5_1_2_1_1.setTheme(theme);
		panel_5_1_2_1_1.setTheme(theme);
		panel_5_1_2_1_1.setLayout(null);

		panel_5_1_2_1_1.setBounds(0, 877, 925, 32);
		add(panel_5_1_2_1_1);

		final JxPanel panel_6_1_2_1_1 = new JxPanel();
		panel_6_1_2_1_1.setTheme(theme);
		// panel.setTheme(theme);
		panel_6_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_2_1_1.setLayout(null);

		panel_6_1_2_1_1.setBounds(0, 0, 103, 32);
		panel_5_1_2_1_1.add(panel_6_1_2_1_1);

		final JxLabel label_1_2_1_1 = new JxLabel();
		label_1_2_1_1.setTheme(theme);
		label_1_2_1_1.setTheme(theme);
		label_1_2_1_1.setText("2");
		label_1_2_1_1.setBounds(40, 7, 17, 16);
		panel_6_1_2_1_1.add(label_1_2_1_1);

		final JxPanel panel_7_1_2_1_1 = new JxPanel();
		panel_7_1_2_1_1.setTheme(theme);
		panel_7_1_2_1_1.setTheme(theme);
		panel_7_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2_1_1.setLayout(null);

		panel_7_1_2_1_1.setBounds(102, 0, 103, 32);
		panel_5_1_2_1_1.add(panel_7_1_2_1_1);

		cmbMentalQ6 = new JxComboBox();
		cmbMentalQ6.setTheme(theme);
		cmbMentalQ6.setTheme(theme);

		cmbMentalQ6.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				updateScore();
			}
		});

		cmbMentalQ6.setBounds(25, 3, 46, 25);
		panel_7_1_2_1_1.add(cmbMentalQ6);

		final JxPanel panel_8_1_2_1_1 = new JxPanel();
		panel_8_1_2_1_1.setTheme(theme);
		panel_8_1_2_1_1.setTheme(theme);
		panel_8_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2_1_1.setLayout(null);

		panel_8_1_2_1_1.setBounds(204, 0, 721, 32);
		panel_5_1_2_1_1.add(panel_8_1_2_1_1);

		final JxTextA whatIsTheTextArea_1_2_1_1 = new JxTextA();
		whatIsTheTextArea_1_2_1_1.setTheme(theme);

		whatIsTheTextArea_1_2_1_1.setWrapStyleWord(true);
		whatIsTheTextArea_1_2_1_1
				.setText("Point to a pencil and a watch and ask the patient to name them.");
		whatIsTheTextArea_1_2_1_1.setLineWrap(true);
		whatIsTheTextArea_1_2_1_1.setEditable(false);
		whatIsTheTextArea_1_2_1_1.setBounds(8, 6, 600, 16);
		panel_8_1_2_1_1.add(whatIsTheTextArea_1_2_1_1);

		final JxPanel panel_5_1_2_1_1_1 = new JxPanel();
		panel_5_1_2_1_1_1.setTheme(theme);
		panel_5_1_2_1_1_1.setTheme(theme);
		panel_5_1_2_1_1_1.setLayout(null);

		panel_5_1_2_1_1_1.setBounds(0, 906, 925, 32);
		add(panel_5_1_2_1_1_1);

		final JxPanel panel_6_1_2_1_1_1 = new JxPanel();
		panel_6_1_2_1_1_1.setTheme(theme);
		panel_6_1_2_1_1_1.setTheme(theme);
		panel_6_1_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_2_1_1_1.setLayout(null);

		panel_6_1_2_1_1_1.setBounds(0, 0, 103, 32);
		panel_5_1_2_1_1_1.add(panel_6_1_2_1_1_1);

		final JxLabel label_1_2_1_1_1 = new JxLabel();
		label_1_2_1_1_1.setTheme(theme);
		label_1_2_1_1_1.setTheme(theme);
		label_1_2_1_1_1.setText("1");
		label_1_2_1_1_1.setBounds(40, 7, 17, 16);
		panel_6_1_2_1_1_1.add(label_1_2_1_1_1);

		final JxPanel panel_7_1_2_1_1_1 = new JxPanel();
		panel_7_1_2_1_1_1.setTheme(theme);
		panel_7_1_2_1_1_1.setTheme(theme);
		panel_7_1_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2_1_1_1.setLayout(null);

		panel_7_1_2_1_1_1.setBounds(102, 0, 103, 32);
		panel_5_1_2_1_1_1.add(panel_7_1_2_1_1_1);

		cmbMentalQ7 = new JxComboBox();
		cmbMentalQ7.setTheme(theme);
		cmbMentalQ7.setTheme(theme);
		cmbMentalQ7.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				updateScore();
			}
		});

		cmbMentalQ7.setBounds(25, 3, 46, 25);
		panel_7_1_2_1_1_1.add(cmbMentalQ7);

		final JxPanel panel_8_1_2_1_1_1 = new JxPanel();
		panel_8_1_2_1_1_1.setTheme(theme);
		// panel.setTheme(theme);
		panel_8_1_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2_1_1_1.setLayout(null);

		panel_8_1_2_1_1_1.setBounds(204, 0, 721, 32);
		panel_5_1_2_1_1_1.add(panel_8_1_2_1_1_1);

		final JxTextA whatIsTheTextArea_1_2_1_1_1 = new JxTextA();
		whatIsTheTextArea_1_2_1_1_1.setTheme(theme);

		whatIsTheTextArea_1_2_1_1_1.setWrapStyleWord(true);
		whatIsTheTextArea_1_2_1_1_1
				.setText("Ask the patient to repeat the following : \"No if's ands, or buts.\" (1 point)");
		whatIsTheTextArea_1_2_1_1_1.setLineWrap(true);
		whatIsTheTextArea_1_2_1_1_1.setEditable(false);
		whatIsTheTextArea_1_2_1_1_1.setBounds(8, 6, 600, 16);
		panel_8_1_2_1_1_1.add(whatIsTheTextArea_1_2_1_1_1);

		final JxPanel panel_5_1_2_1_1_1_1 = new JxPanel();
		panel_5_1_2_1_1_1_1.setTheme(theme);
		panel_5_1_2_1_1_1_1.setTheme(theme);
		panel_5_1_2_1_1_1_1.setLayout(null);

		panel_5_1_2_1_1_1_1.setBounds(0, 936, 925, 32);
		add(panel_5_1_2_1_1_1_1);

		final JxPanel panel_6_1_2_1_1_1_1 = new JxPanel();
		panel_6_1_2_1_1_1_1.setTheme(theme);
		panel_6_1_2_1_1_1_1.setTheme(theme);
		panel_6_1_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_2_1_1_1_1.setLayout(null);

		panel_6_1_2_1_1_1_1.setBounds(0, 0, 103, 32);
		panel_5_1_2_1_1_1_1.add(panel_6_1_2_1_1_1_1);

		final JxLabel label_1_2_1_1_1_1 = new JxLabel();
		label_1_2_1_1_1_1.setTheme(theme);
		label_1_2_1_1_1_1.setTheme(theme);
		label_1_2_1_1_1_1.setText("3");
		label_1_2_1_1_1_1.setBounds(40, 7, 17, 16);
		panel_6_1_2_1_1_1_1.add(label_1_2_1_1_1_1);

		final JxPanel panel_7_1_2_1_1_1_1 = new JxPanel();
		panel_7_1_2_1_1_1_1.setTheme(theme);
		panel_7_1_2_1_1_1_1.setTheme(theme);
		panel_7_1_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2_1_1_1_1.setLayout(null);

		panel_7_1_2_1_1_1_1.setBounds(102, 0, 103, 32);
		panel_5_1_2_1_1_1_1.add(panel_7_1_2_1_1_1_1);

		cmbMentalQ8 = new JxComboBox();
		cmbMentalQ8.setTheme(theme);
		cmbMentalQ8.setTheme(theme);
		cmbMentalQ8.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				updateScore();
			}
		});

		cmbMentalQ8.setBounds(25, 3, 46, 25);
		panel_7_1_2_1_1_1_1.add(cmbMentalQ8);

		final JxPanel panel_8_1_2_1_1_1_1 = new JxPanel();
		panel_8_1_2_1_1_1_1.setTheme(theme);
		panel_8_1_2_1_1_1_1.setTheme(theme);
		panel_8_1_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2_1_1_1_1.setLayout(null);

		panel_8_1_2_1_1_1_1.setBounds(204, 0, 721, 32);
		panel_5_1_2_1_1_1_1.add(panel_8_1_2_1_1_1_1);

		final JxTextA whatIsTheTextArea_1_2_1_1_1_1 = new JxTextA();
		whatIsTheTextArea_1_2_1_1_1_1.setTheme(theme);

		whatIsTheTextArea_1_2_1_1_1_1.setWrapStyleWord(true);
		whatIsTheTextArea_1_2_1_1_1_1
				.setText("Follow a 3 stage command: \" Take a paper in your right hand, fold it in half, and put in on the floor\" (3 points).");
		whatIsTheTextArea_1_2_1_1_1_1.setLineWrap(true);
		whatIsTheTextArea_1_2_1_1_1_1.setEditable(false);
		whatIsTheTextArea_1_2_1_1_1_1.setBounds(8, 6, 600, 16);
		panel_8_1_2_1_1_1_1.add(whatIsTheTextArea_1_2_1_1_1_1);

		final JxPanel panel_5_1_2_1_1_1_1_1 = new JxPanel();
		panel_5_1_2_1_1_1_1_1.setTheme(theme);
		panel_5_1_2_1_1_1_1_1.setTheme(theme);
		panel_5_1_2_1_1_1_1_1.setLayout(null);

		panel_5_1_2_1_1_1_1_1.setBounds(0, 965, 925, 32);
		add(panel_5_1_2_1_1_1_1_1);

		final JxPanel panel_6_1_2_1_1_1_1_1 = new JxPanel();
		panel_6_1_2_1_1_1_1_1.setTheme(theme);
		panel_6_1_2_1_1_1_1_1.setTheme(theme);
		panel_6_1_2_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_2_1_1_1_1_1.setLayout(null);

		panel_6_1_2_1_1_1_1_1.setBounds(0, 0, 103, 32);
		panel_5_1_2_1_1_1_1_1.add(panel_6_1_2_1_1_1_1_1);

		final JxLabel label_1_2_1_1_1_1_1 = new JxLabel();
		label_1_2_1_1_1_1_1.setTheme(theme);
		label_1_2_1_1_1_1_1.setTheme(theme);
		label_1_2_1_1_1_1_1.setText("1");
		label_1_2_1_1_1_1_1.setBounds(40, 7, 17, 16);
		panel_6_1_2_1_1_1_1_1.add(label_1_2_1_1_1_1_1);

		final JxPanel panel_7_1_2_1_1_1_1_1 = new JxPanel();
		panel_7_1_2_1_1_1_1_1.setTheme(theme);
		panel_7_1_2_1_1_1_1_1.setTheme(theme);
		panel_7_1_2_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2_1_1_1_1_1.setLayout(null);

		panel_7_1_2_1_1_1_1_1.setBounds(102, 0, 103, 32);
		panel_5_1_2_1_1_1_1_1.add(panel_7_1_2_1_1_1_1_1);

		cmbMentalQ9 = new JxComboBox();
		cmbMentalQ9.setTheme(theme);
		cmbMentalQ9.setTheme(theme);
		cmbMentalQ9.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				updateScore();
			}
		});

		cmbMentalQ9.setBounds(25, 3, 46, 25);
		panel_7_1_2_1_1_1_1_1.add(cmbMentalQ9);

		final JxPanel panel_8_1_2_1_1_1_1_1 = new JxPanel();
		panel_8_1_2_1_1_1_1_1.setTheme(theme);
		panel_8_1_2_1_1_1_1_1.setTheme(theme);
		panel_8_1_2_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2_1_1_1_1_1.setLayout(null);

		panel_8_1_2_1_1_1_1_1.setBounds(204, 0, 721, 32);
		panel_5_1_2_1_1_1_1_1.add(panel_8_1_2_1_1_1_1_1);

		final JxTextA whatIsTheTextArea_1_2_1_1_1_1_1 = new JxTextA();
		whatIsTheTextArea_1_2_1_1_1_1_1.setTheme(theme);

		whatIsTheTextArea_1_2_1_1_1_1_1.setWrapStyleWord(true);
		whatIsTheTextArea_1_2_1_1_1_1_1
				.setText("Read and obey the following sign: \"Close your eyes.\"");
		whatIsTheTextArea_1_2_1_1_1_1_1.setLineWrap(true);
		whatIsTheTextArea_1_2_1_1_1_1_1.setEditable(false);
		whatIsTheTextArea_1_2_1_1_1_1_1.setBounds(8, 6, 600, 16);
		panel_8_1_2_1_1_1_1_1.add(whatIsTheTextArea_1_2_1_1_1_1_1);

		final JxPanel panel_5_1_2_1_1_1_1_1_1 = new JxPanel();
		panel_5_1_2_1_1_1_1_1_1.setTheme(theme);
		panel_5_1_2_1_1_1_1_1_1.setTheme(theme);
		panel_5_1_2_1_1_1_1_1_1.setLayout(null);

		panel_5_1_2_1_1_1_1_1_1.setBounds(0, 995, 925, 32);
		add(panel_5_1_2_1_1_1_1_1_1);

		final JxPanel panel_6_1_2_1_1_1_1_1_1 = new JxPanel();
		panel_6_1_2_1_1_1_1_1_1.setTheme(theme);
		panel_6_1_2_1_1_1_1_1_1.setTheme(theme);
		panel_6_1_2_1_1_1_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_2_1_1_1_1_1_1.setLayout(null);

		panel_6_1_2_1_1_1_1_1_1.setBounds(0, 0, 103, 32);
		panel_5_1_2_1_1_1_1_1_1.add(panel_6_1_2_1_1_1_1_1_1);

		final JxLabel label_1_2_1_1_1_1_1_1 = new JxLabel();
		label_1_2_1_1_1_1_1_1.setTheme(theme);
		label_1_2_1_1_1_1_1_1.setTheme(theme);
		label_1_2_1_1_1_1_1_1.setText("1");
		label_1_2_1_1_1_1_1_1.setBounds(40, 7, 17, 16);
		panel_6_1_2_1_1_1_1_1_1.add(label_1_2_1_1_1_1_1_1);

		final JxPanel panel_7_1_2_1_1_1_1_1_1 = new JxPanel();
		panel_7_1_2_1_1_1_1_1_1.setTheme(theme);
		panel_7_1_2_1_1_1_1_1_1.setTheme(theme);
		panel_7_1_2_1_1_1_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_2_1_1_1_1_1_1.setLayout(null);

		panel_7_1_2_1_1_1_1_1_1.setBounds(102, 0, 103, 32);
		panel_5_1_2_1_1_1_1_1_1.add(panel_7_1_2_1_1_1_1_1_1);

		cmbMentalQ10 = new JxComboBox();
		cmbMentalQ10.setTheme(theme);
		cmbMentalQ10.setTheme(theme);
		cmbMentalQ10.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				updateScore();
			}
		});

		cmbMentalQ10.setBounds(25, 3, 46, 25);
		panel_7_1_2_1_1_1_1_1_1.add(cmbMentalQ10);

		final JxPanel panel_8_1_2_1_1_1_1_1_1 = new JxPanel();
		panel_8_1_2_1_1_1_1_1_1.setTheme(theme);
		panel_8_1_2_1_1_1_1_1_1.setTheme(theme);
		panel_8_1_2_1_1_1_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2_1_1_1_1_1_1.setLayout(null);

		panel_8_1_2_1_1_1_1_1_1.setBounds(204, 0, 721, 32);
		panel_5_1_2_1_1_1_1_1_1.add(panel_8_1_2_1_1_1_1_1_1);

		final JxTextA whatIsTheTextArea_1_2_1_1_1_1_1_1 = new JxTextA();
		whatIsTheTextArea_1_2_1_1_1_1_1_1.setTheme(theme);

		whatIsTheTextArea_1_2_1_1_1_1_1_1.setWrapStyleWord(true);
		whatIsTheTextArea_1_2_1_1_1_1_1_1
				.setText("Write a sentence. (1 point)");
		whatIsTheTextArea_1_2_1_1_1_1_1_1.setLineWrap(true);
		whatIsTheTextArea_1_2_1_1_1_1_1_1.setEditable(false);
		whatIsTheTextArea_1_2_1_1_1_1_1_1.setBounds(8, 6, 600, 16);
		panel_8_1_2_1_1_1_1_1_1.add(whatIsTheTextArea_1_2_1_1_1_1_1_1);

		final JxPanel panel_5_1_2_1_1_1_1_1_1_1 = new JxPanel();
		panel_5_1_2_1_1_1_1_1_1_1.setTheme(theme);
		panel_5_1_2_1_1_1_1_1_1_1.setTheme(theme);
		panel_5_1_2_1_1_1_1_1_1_1.setLayout(null);

		panel_5_1_2_1_1_1_1_1_1_1.setBounds(0, 1024, 925, 95);
		add(panel_5_1_2_1_1_1_1_1_1_1);

		final JxPanel panel_6_1_2_1_1_1_1_1_1_1 = new JxPanel();
		panel_6_1_2_1_1_1_1_1_1_1.setTheme(theme);
		panel_6_1_2_1_1_1_1_1_1_1.setTheme(theme);
		panel_6_1_2_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_6_1_2_1_1_1_1_1_1_1.setLayout(null);

		panel_6_1_2_1_1_1_1_1_1_1.setBounds(0, 0, 103, 95);
		panel_5_1_2_1_1_1_1_1_1_1.add(panel_6_1_2_1_1_1_1_1_1_1);

		final JxLabel label_1_2_1_1_1_1_1_1_1 = new JxLabel();
		label_1_2_1_1_1_1_1_1_1.setTheme(theme);
		label_1_2_1_1_1_1_1_1_1.setTheme(theme);
		label_1_2_1_1_1_1_1_1_1.setText("1");
		label_1_2_1_1_1_1_1_1_1.setBounds(40, 45, 17, 16);
		panel_6_1_2_1_1_1_1_1_1_1.add(label_1_2_1_1_1_1_1_1_1);

		final JxPanel panel_7_1_2_1_1_1_1_1_1_1 = new JxPanel();
		panel_7_1_2_1_1_1_1_1_1_1.setTheme(theme);
		panel_7_1_2_1_1_1_1_1_1_1.setTheme(theme);
		panel_7_1_2_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_7_1_2_1_1_1_1_1_1_1.setLayout(null);

		panel_7_1_2_1_1_1_1_1_1_1.setBounds(102, 0, 103, 95);
		panel_5_1_2_1_1_1_1_1_1_1.add(panel_7_1_2_1_1_1_1_1_1_1);

		cmbMentalQ11 = new JxComboBox();
		cmbMentalQ11.setTheme(theme);
		cmbMentalQ11.setTheme(theme);
		cmbMentalQ11.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				updateScore();
			}
		});

		cmbMentalQ11.setBounds(25, 39, 46, 25);
		panel_7_1_2_1_1_1_1_1_1_1.add(cmbMentalQ11);

		final JxPanel panel_8_1_2_1_1_1_1_1_1_1 = new JxPanel();
		panel_8_1_2_1_1_1_1_1_1_1.setTheme(theme);
		panel_8_1_2_1_1_1_1_1_1_1.setTheme(theme);
		panel_8_1_2_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_8_1_2_1_1_1_1_1_1_1.setLayout(null);

		panel_8_1_2_1_1_1_1_1_1_1.setBounds(204, 0, 721, 95);
		panel_5_1_2_1_1_1_1_1_1_1.add(panel_8_1_2_1_1_1_1_1_1_1);

		final JxTextA whatIsTheTextArea_1_2_1_1_1_1_1_1_1 = new JxTextA();
		whatIsTheTextArea_1_2_1_1_1_1_1_1_1.setTheme(theme);

		whatIsTheTextArea_1_2_1_1_1_1_1_1_1.setWrapStyleWord(true);
		whatIsTheTextArea_1_2_1_1_1_1_1_1_1
				.setText("Copy this design. (1 point)");
		whatIsTheTextArea_1_2_1_1_1_1_1_1_1.setLineWrap(true);
		whatIsTheTextArea_1_2_1_1_1_1_1_1_1.setEditable(false);
		whatIsTheTextArea_1_2_1_1_1_1_1_1_1.setBounds(8, 38, 155, 16);
		panel_8_1_2_1_1_1_1_1_1_1.add(whatIsTheTextArea_1_2_1_1_1_1_1_1_1);

		final JxLabel label_2 = new JxLabel(new ImageIcon("img/residentassessment/rafp6img.jpg"));
		label_2.setTheme(theme);
		label_2.setTheme(theme);
		label_2.setBounds(169, 10, 144, 75);
		panel_8_1_2_1_1_1_1_1_1_1.add(label_2);

		final JxPanel panel_5_1_2_1_1_1_1_1_1_2 = new JxPanel();
		panel_5_1_2_1_1_1_1_1_1_2.setTheme(theme);
		panel_5_1_2_1_1_1_1_1_1_2.setTheme(theme);
		panel_5_1_2_1_1_1_1_1_1_2.setLayout(null);

		panel_5_1_2_1_1_1_1_1_1_2.setBounds(0, 1120, 925, 40);
		add(panel_5_1_2_1_1_1_1_1_1_2);

		final JxPanel panel_6_1_2_1_1_1_1_1_1_2 = new JxPanel();
		panel_6_1_2_1_1_1_1_1_1_2.setTheme(theme);
		panel_6_1_2_1_1_1_1_1_1_2.setTheme(theme);
		panel_6_1_2_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_6_1_2_1_1_1_1_1_1_2.setLayout(null);

		panel_6_1_2_1_1_1_1_1_1_2.setBounds(0, 0, 103, 40);
		panel_5_1_2_1_1_1_1_1_1_2.add(panel_6_1_2_1_1_1_1_1_1_2);

		final JxTextA maxScore30TextArea = new JxTextA();
		maxScore30TextArea.setTheme(theme);

		maxScore30TextArea.setFontSize(12);
		maxScore30TextArea.setFontStyle(Font.BOLD);
		maxScore30TextArea.setText("Max. Score    30 points");
		maxScore30TextArea.setWrapStyleWord(true);
		maxScore30TextArea.setLineWrap(true);

		maxScore30TextArea.setBounds(10, 3, 83, 35);
		panel_6_1_2_1_1_1_1_1_1_2.add(maxScore30TextArea);

		final JxPanel panel_7_1_2_1_1_1_1_1_1_2 = new JxPanel();
		panel_7_1_2_1_1_1_1_1_1_2.setTheme(theme);
		panel_7_1_2_1_1_1_1_1_1_2.setTheme(theme);
		panel_7_1_2_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_7_1_2_1_1_1_1_1_1_2.setLayout(null);

		panel_7_1_2_1_1_1_1_1_1_2.setBounds(102, 0, 103, 40);
		panel_5_1_2_1_1_1_1_1_1_2.add(panel_7_1_2_1_1_1_1_1_1_2);

		lblTotal = new JxLabel();
		lblTotal.setTheme(theme);
		lblTotal.setTheme(theme);

		lblTotal.setBounds(24, 10, 54, 14);
		panel_7_1_2_1_1_1_1_1_1_2.add(lblTotal);

		final JxPanel panel_8_1_2_1_1_1_1_1_1_2 = new JxPanel();
		panel_8_1_2_1_1_1_1_1_1_2.setTheme(theme);
		panel_8_1_2_1_1_1_1_1_1_2.setTheme(theme);
		panel_8_1_2_1_1_1_1_1_1_2.setForeground(new Color(255, 255, 255));
		panel_8_1_2_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_8_1_2_1_1_1_1_1_1_2.setLayout(null);

		panel_8_1_2_1_1_1_1_1_1_2.setBounds(204, 0, 721, 40);
		panel_5_1_2_1_1_1_1_1_1_2.add(panel_8_1_2_1_1_1_1_1_1_2);

		final JxTextA whatIsTheTextArea_1_2_1_1_1_1_1_1_2 = new JxTextA();
		whatIsTheTextArea_1_2_1_1_1_1_1_1_2.setTheme(theme);
		whatIsTheTextArea_1_2_1_1_1_1_1_1_2.setForeground(new Color(255, 255,
				255));
		whatIsTheTextArea_1_2_1_1_1_1_1_1_2.setFont(new Font("Arial",
				Font.BOLD, 12));
		whatIsTheTextArea_1_2_1_1_1_1_1_1_2.setBackground(Color.BLACK);
		whatIsTheTextArea_1_2_1_1_1_1_1_1_2.setWrapStyleWord(true);
		whatIsTheTextArea_1_2_1_1_1_1_1_1_2.setText("RESIDENT TOTAL");
		whatIsTheTextArea_1_2_1_1_1_1_1_1_2.setLineWrap(true);
		whatIsTheTextArea_1_2_1_1_1_1_1_1_2.setEditable(false);
		whatIsTheTextArea_1_2_1_1_1_1_1_1_2.setBounds(0, 0, 163, 40);
		panel_8_1_2_1_1_1_1_1_1_2.add(whatIsTheTextArea_1_2_1_1_1_1_1_1_2);

		panel_10 = new JxPanel();
		panel_10.setTheme(theme);
		panel_10.setTheme(theme);
		panel_10.setLayout(null);

		panel_10.setBounds(10, 1160, 910, 36);
		add(panel_10);

		ifSoWhatLabel = new JxLabel();
		ifSoWhatLabel.setTheme(theme);
		ifSoWhatLabel.setTheme(theme);
		ifSoWhatLabel.setText("Nurse Signature:");
		ifSoWhatLabel.setBounds(21, 5, 91, 16);
		panel_10.add(ifSoWhatLabel);

		cmbNurse = new JxComboBox();
		cmbNurse.setTheme(theme);
		cmbNurse.setTheme(theme);

		cmbNurse.setBounds(123, 4, 205, 20);

		panel_10.add(cmbNurse);

		dateLabel = new JxLabel();
		dateLabel.setTheme(theme);
		dateLabel.setTheme(theme);
		dateLabel.setText("Date :");
		dateLabel.setBounds(509, 5, 30, 16);
		panel_10.add(dateLabel);

		dcNurseVisit = new JxDateChooser();
		dcNurseVisit.setTheme(theme);
		dcNurseVisit.setTheme(theme);
		dcNurseVisit.setDate(MedrexClientManager.getServerTime());
		dcNurseVisit.setDateFormatString("MM/dd/yyyy");
		dcNurseVisit.setBounds(542, 1, 168, 26);
		panel_10.add(dcNurseVisit);

		final PanelloggedInUser panel_9 = new PanelloggedInUser();
		panel_9.setBounds(116, 0, 294, 25);
		panel_10.add(panel_9);

		final JxLabel residentNameLabel = new JxLabel();
		residentNameLabel.setTheme(theme);
		residentNameLabel.setTheme(theme);
		residentNameLabel.setText("Resident Name :");
		residentNameLabel.setBounds(239, 8, 79, 14);
		add(residentNameLabel);

		lblResidentName = new JxLabel();
		lblResidentName.setTheme(theme);
		lblResidentName.setTheme(theme);

		lblResidentName.setFontStyle(Font.BOLD);
		lblResidentName.setBounds(326, 7, 196, 18);
		add(lblResidentName);

		final JxLabel roomLabel = new JxLabel();
		roomLabel.setTheme(theme);
		roomLabel.setTheme(theme);
		roomLabel.setText("Room # :");
		roomLabel.setBounds(552, 8, 54, 14);
		add(roomLabel);

		lblRoom = new JxLabel();
		lblRoom.setTheme(theme);
		lblRoom.setTheme(theme);

		lblRoom.setFontStyle(Font.BOLD);
		lblRoom.setBounds(600, 6, 77, 18);
		add(lblRoom);

		doLoad();
	}

	public void doLoad() {
		fillCombos();
		doUpdate();
	}

	public void fillCombos() {
		cmbMentalQ1.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "4", "5" }));
		cmbMentalQ2.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "4", "5" }));
		cmbMentalQ3.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));
		cmbMentalQ4.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "4", "5" }));
		cmbMentalQ5.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));
		cmbMentalQ6.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2" }));
		cmbMentalQ7.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1" }));
		cmbMentalQ9.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1" }));
		cmbMentalQ8.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));
		cmbMentalQ10.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1" }));
		cmbMentalQ11.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1" }));

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
		TempRoomHistory roomHist = null;
		try {
			rm = MedrexClientManager.getInstance().getResident(resId);
			roomHist = MedrexClientManager.getInstance()
					.getCurrentRoomForResident(resId);
		} catch (Exception e) {
		}
		lblResidentName.setText(rm.getUserPass() + " " + rm.getUserName());
		/* TODO: Migrating to room history ----- Done */
		// lblRoom.setText(rm.getRoom());
		if (roomHist != null) {
			lblRoom.setText(roomHist.getRoom());
		}
		if (Global.currentResidentAssessmentFormKey == 0) {
			Global.currentResidentAssessmentFormPage6Key = 0;
			SwingUtils.setSelectedButton(bgQ1, 0);
			SwingUtils.setSelectedButton(bgQ2, 0);
			SwingUtils.setSelectedButton(bgQ3, 0);
			SwingUtils.setSelectedButton(bgQ4, 0);
			SwingUtils.setSelectedButton(bgQ5, 0);
			SwingUtils.setSelectedButton(bgQ6, 0);
			SwingUtils.setSelectedButton(bgQ7, 0);
			SwingUtils.setSelectedButton(bgQ8, 0);
			SwingUtils.setSelectedButton(bgQ9, 0);
			SwingUtils.setSelectedButton(bgQ10, 0);
			SwingUtils.setSelectedButton(bgQ11, 0);
			SwingUtils.setSelectedButton(bgQ12, 0);
			SwingUtils.setSelectedButton(bgRecommendations, 0);
			SwingUtils.setSelectedButton(bgOrder, 0);

			cmbMentalQ1.setSelectedItem("");
			cmbMentalQ2.setSelectedItem("");
			cmbMentalQ3.setSelectedItem("");
			cmbMentalQ4.setSelectedItem("");
			cmbMentalQ5.setSelectedItem("");
			cmbMentalQ6.setSelectedItem("");
			cmbMentalQ7.setSelectedItem("");
			cmbMentalQ8.setSelectedItem("");
			cmbMentalQ9.setSelectedItem("");
			cmbMentalQ10.setSelectedItem("");

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
			ResidentAssessmentFormPage6 rafp6 = null;
			try {
				rafp6 = MedrexClientManager.getInstance()
						.getResidentAssessmentFormPage6(
								Global.currentResidentAssessmentFormKey);
			} catch (Exception e) {

			}
			Global.currentResidentAssessmentFormPage6Key = rafp6.getSerial();

			dcNurseVisit.setDate(rafp6.getNurseVisit());
			cmbNurse.setSelectedItem(rafp6.getNurse());

			SwingUtils.setSelectedButton(bgQ1, rafp6.getSideQ1());
			SwingUtils.setSelectedButton(bgQ2, rafp6.getSideQ2());
			SwingUtils.setSelectedButton(bgQ3, rafp6.getSideQ3());
			SwingUtils.setSelectedButton(bgQ4, rafp6.getSideQ4());
			SwingUtils.setSelectedButton(bgQ5, rafp6.getSideQ5());
			SwingUtils.setSelectedButton(bgQ6, rafp6.getSideQ6());
			SwingUtils.setSelectedButton(bgQ7, rafp6.getSideQ7());
			SwingUtils.setSelectedButton(bgQ8, rafp6.getSideQ8());
			SwingUtils.setSelectedButton(bgQ9, rafp6.getSideQ9());
			SwingUtils.setSelectedButton(bgQ10, rafp6.getSideQ10());
			SwingUtils.setSelectedButton(bgQ11, rafp6.getSideQ11());
			SwingUtils.setSelectedButton(bgQ12, rafp6.getSideQ12());
			SwingUtils.setSelectedButton(bgRecommendations, rafp6
					.getRecommendations());
			SwingUtils.setSelectedButton(bgOrder, rafp6.getOrderPhysicians());

			cmbMentalQ1.setSelectedItem(rafp6.getMentalQ1());
			cmbMentalQ2.setSelectedItem(rafp6.getMentalQ2());
			cmbMentalQ3.setSelectedItem(rafp6.getMentalQ3());
			cmbMentalQ4.setSelectedItem(rafp6.getMentalQ4());
			cmbMentalQ5.setSelectedItem(rafp6.getMentalQ5());
			cmbMentalQ6.setSelectedItem(rafp6.getMentalQ6());
			cmbMentalQ7.setSelectedItem(rafp6.getMentalQ7());
			cmbMentalQ8.setSelectedItem(rafp6.getMentalQ8());
			cmbMentalQ9.setSelectedItem(rafp6.getMentalQ9());
			cmbMentalQ10.setSelectedItem(rafp6.getMentalQ10());
			cmbMentalQ11.setSelectedItem(rafp6.getMentalQ11());

		}
		updateScore();
	}

	public void updateScore() {
		int sum = 0;

		sum = sum + SwingUtils.getComboBoxValue(cmbMentalQ1);
		sum = sum + SwingUtils.getComboBoxValue(cmbMentalQ2);
		sum = sum + SwingUtils.getComboBoxValue(cmbMentalQ3);
		sum = sum + SwingUtils.getComboBoxValue(cmbMentalQ4);
		sum = sum + SwingUtils.getComboBoxValue(cmbMentalQ5);
		sum = sum + SwingUtils.getComboBoxValue(cmbMentalQ6);
		sum = sum + SwingUtils.getComboBoxValue(cmbMentalQ7);
		sum = sum + SwingUtils.getComboBoxValue(cmbMentalQ8);
		sum = sum + SwingUtils.getComboBoxValue(cmbMentalQ9);
		sum = sum + SwingUtils.getComboBoxValue(cmbMentalQ10);

		lblTotal.setText(sum + "");

	}

	public int doSave() {
		ResidentAssessmentFormPage6 rafp6 = new ResidentAssessmentFormPage6();
		rafp6.setSerial(Global.currentResidentAssessmentFormPage6Key);
		rafp6.setFormId(Global.currentResidentAssessmentFormKey);

		rafp6.setNurseVisit(dcNurseVisit.getDate());
		rafp6.setNurse((String) cmbNurse.getSelectedItem());

		rafp6.setSideQ1(SwingUtils.getSelectedButton(bgQ1));
		rafp6.setSideQ2(SwingUtils.getSelectedButton(bgQ2));
		rafp6.setSideQ3(SwingUtils.getSelectedButton(bgQ3));
		rafp6.setSideQ4(SwingUtils.getSelectedButton(bgQ4));
		rafp6.setSideQ5(SwingUtils.getSelectedButton(bgQ5));
		rafp6.setSideQ6(SwingUtils.getSelectedButton(bgQ6));
		rafp6.setSideQ7(SwingUtils.getSelectedButton(bgQ7));
		rafp6.setSideQ8(SwingUtils.getSelectedButton(bgQ8));
		rafp6.setSideQ9(SwingUtils.getSelectedButton(bgQ9));
		rafp6.setSideQ10(SwingUtils.getSelectedButton(bgQ10));
		rafp6.setSideQ11(SwingUtils.getSelectedButton(bgQ11));
		rafp6.setSideQ12(SwingUtils.getSelectedButton(bgQ12));
		rafp6.setOrderPhysicians(SwingUtils.getSelectedButton(bgOrder));
		rafp6.setRecommendations(SwingUtils
				.getSelectedButton(bgRecommendations));

		rafp6.setMentalQ1((String) cmbMentalQ1.getSelectedItem());
		rafp6.setMentalQ2((String) cmbMentalQ2.getSelectedItem());
		rafp6.setMentalQ3((String) cmbMentalQ3.getSelectedItem());
		rafp6.setMentalQ4((String) cmbMentalQ4.getSelectedItem());
		rafp6.setMentalQ5((String) cmbMentalQ5.getSelectedItem());
		rafp6.setMentalQ6((String) cmbMentalQ6.getSelectedItem());
		rafp6.setMentalQ7((String) cmbMentalQ7.getSelectedItem());
		rafp6.setMentalQ8((String) cmbMentalQ8.getSelectedItem());
		rafp6.setMentalQ9((String) cmbMentalQ9.getSelectedItem());
		rafp6.setMentalQ10((String) cmbMentalQ10.getSelectedItem());
		rafp6.setMentalQ11((String) cmbMentalQ11.getSelectedItem());

		try {
			Global.currentResidentAssessmentFormPage6Key = MedrexClientManager
					.getInstance().insertOrUpdateResidentAssessmentFormPage6(
							rafp6);
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
		if (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(bgQ1,
				"Resident non-ambulatory"))) {
			vRes.addAllFrom(temp);
		}
		if (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(bgQ3,
				"Resident have a history of falls"))) {
			vRes.addAllFrom(temp);
		}

		// System.out.println(FieldValidation.getMessages(vRes.getMessages()));
		if (!FieldValidation.isEmpty(vRes)) {
			FieldValidation.Msgbox(vRes, "Resident Assessment Form: Page 6");
			return false;
		} else {
			return true;
		}
	}

}
