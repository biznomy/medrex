package medrex.client.main.admission.smokersAssessment;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.BorderUIResource.CompoundBorderUIResource;
import javax.swing.plaf.basic.BasicBorders;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.intf.Form;
import medrex.commons.vo.admission.smokers.AssessingResident2;

import com.sX.swing.JxCheckBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxRadioButton;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelAssessingResident2 extends JxPanel implements Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4633633751216465163L;
	Font font = new Font("Arial", Font.PLAIN, 12);
	Insets margin = new Insets(0, 2, 0, 0);
	Border border = new CompoundBorderUIResource(new LineBorder(Color.BLACK),
			new BasicBorders.MarginBorder());
	Color background = Color.WHITE;
	Color foreground = Color.BLACK;

	private JxRadioButton rbConsumeAlcohalNo;
	private JxRadioButton rbConsumeAlcohalYes;
	private JxRadioButton rbSetFireNo;
	private JxRadioButton rbSetFireYes;
	private JxRadioButton rbBurnClothNo;
	private JxRadioButton rbBurnClothYes;
	private JxRadioButton rbButtsNo;
	private JxRadioButton rbButtsYes;
	private JxRadioButton rbAssistiveDeviceNo;
	private JxRadioButton rbAssistiveDeviceYes;
	private JxText txtPhysicalLimitationSpecify;
	private JxRadioButton rbPhysicalLimitationNo;
	private JxRadioButton rbPhysicalLimitationYes;
	private JxText txtSmokingArea;
	private JxText txtExplainAboutSmoking;
	private JxCheckBox cbnumberOfTimesCheckBox;
	private JxCheckBox cbneverCheckBox;
	private ButtonGroup bgMaterialUnsafty = new ButtonGroup();
	private ButtonGroup bgConsume = new ButtonGroup();
	private ButtonGroup bgBurn = new ButtonGroup();
	private ButtonGroup bgDispose = new ButtonGroup();
	private ButtonGroup bgAssistive = new ButtonGroup();
	private ButtonGroup bgRisk = new ButtonGroup();
	private JxText textField;
	Theme theme = new BlackOverWhiteTheme();

	public PanelAssessingResident2() {
		super();
		setBackground(Color.WHITE);
		setSize(850, 1120);
		setLayout(null);
		setPreferredSize(new Dimension(810, 910));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);

		panel.setLayout(null);
		panel.setBounds(100, 0, 766, 830);
		add(panel);

		final JxLabel eHowOfenLabel = new JxLabel();
		eHowOfenLabel.setTheme(theme);

		eHowOfenLabel
				.setText("e.      How ofen have you fallen asleep while smoking a cigarette?");
		eHowOfenLabel.setBounds(12, 0, 756, 27);
		panel.add(eHowOfenLabel);

		cbneverCheckBox = new JxCheckBox();
		cbneverCheckBox.setTheme(theme);

		cbneverCheckBox.setText("Never");
		cbneverCheckBox.setBounds(59, 30, 64, 18);
		panel.add(cbneverCheckBox);

		cbnumberOfTimesCheckBox = new JxCheckBox();
		cbnumberOfTimesCheckBox.setTheme(theme);

		cbnumberOfTimesCheckBox.setText("Number of times:");
		cbnumberOfTimesCheckBox.setBounds(198, 30, 126, 18);
		panel.add(cbnumberOfTimesCheckBox);

		textField = new JxText();
		textField.setTheme(theme);

		textField.setBackground(background);
		textField.setForeground(foreground);
		textField.setMargin(margin);
		textField.setBorder(border);
		textField.setBounds(388, 30, 79, 21);
		panel.add(textField);

		final JxLabel explainLabel = new JxLabel();
		explainLabel.setTheme(theme);

		explainLabel.setText("Explain :");
		explainLabel.setBounds(45, 60, 68, 14);
		panel.add(explainLabel);

		txtExplainAboutSmoking = new JxText();
		txtExplainAboutSmoking.setTheme(theme);

		txtExplainAboutSmoking.setBackground(background);
		txtExplainAboutSmoking.setForeground(foreground);
		txtExplainAboutSmoking.setMargin(margin);
		txtExplainAboutSmoking.setBorder(border);
		txtExplainAboutSmoking.setBounds(45, 80, 550, 21);
		panel.add(txtExplainAboutSmoking);

		final JxLabel fWhatWouldLabel = new JxLabel();
		fWhatWouldLabel.setTheme(theme);

		fWhatWouldLabel
				.setText("<html><body>f.&nbsp;&nbsp;&nbsp;    What would you do if there were an emergency in the smoking area? (Without cueing, <br>&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;resident should state that he/she would call for help and leave the area )</body></html>");
		fWhatWouldLabel.setBounds(12, 130, 625, 33);
		panel.add(fWhatWouldLabel);

		txtSmokingArea = new JxText();
		txtSmokingArea.setTheme(theme);

		txtSmokingArea.setBackground(background);
		txtSmokingArea.setForeground(foreground);
		txtSmokingArea.setMargin(margin);
		txtSmokingArea.setBorder(border);
		txtSmokingArea.setBounds(45, 176, 550, 21);
		panel.add(txtSmokingArea);

		final JxLabel ifResidentHasLabel = new JxLabel();
		ifResidentHasLabel.setTheme(theme);

		ifResidentHasLabel
				.setText("<html><body>If resident has fallen asleep more than once while smoking, or is unable to answer part(f) correctly,<br> then the resident is a fire risk. Stop the questionnaire now. Resident must be placed on a <br>smoking schedule and be accompanied by staff.</body><html>");
		ifResidentHasLabel.setBounds(12, 215, 621, 45);
		panel.add(ifResidentHasLabel);

		final JxLabel riskFactorsLabel = new JxLabel();
		riskFactorsLabel.setTheme(theme);

		riskFactorsLabel.setFontSize(12);
		riskFactorsLabel.setFontStyle(Font.BOLD);
		riskFactorsLabel.setText(" RISK FACTORS");
		riskFactorsLabel.setBounds(45, 310, 165, 14);
		panel.add(riskFactorsLabel);

		final JxLabel aAreThereLabel = new JxLabel();
		aAreThereLabel.setTheme(theme);

		aAreThereLabel
				.setText("<html><body>      Are there any physical Limitations that have implications on the resident's ability to <br> &nbsp; &nbsp; &nbsp; &nbsp;smoke (e.g. arthritis, hand injury, paralysis)?</body><html>");
		aAreThereLabel.setBounds(45, 339, 568, 27);
		panel.add(aAreThereLabel);

		rbPhysicalLimitationYes = new JxRadioButton();
		rbPhysicalLimitationYes.setTheme(theme);

		rbPhysicalLimitationYes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (!txtPhysicalLimitationSpecify.isEnabled()) {
					txtPhysicalLimitationSpecify.setEnabled(true);
				}
			}
		});
		rbPhysicalLimitationYes.setActionCommand("1");
		bgRisk.add(rbPhysicalLimitationYes);

		rbPhysicalLimitationYes.setText("Yes");
		rbPhysicalLimitationYes.setBounds(59, 375, 54, 18);
		panel.add(rbPhysicalLimitationYes);

		rbPhysicalLimitationNo = new JxRadioButton();
		rbPhysicalLimitationNo.setTheme(theme);

		rbPhysicalLimitationNo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent arg0) {
				txtPhysicalLimitationSpecify.setEnabled(false);
				txtPhysicalLimitationSpecify.setText("");
			}
		});
		rbPhysicalLimitationNo.setActionCommand("2");
		bgRisk.add(rbPhysicalLimitationNo);

		rbPhysicalLimitationNo.setText("No");
		rbPhysicalLimitationNo.setBounds(120, 376, 70, 18);
		panel.add(rbPhysicalLimitationNo);

		final JxLabel ifYesPleaseLabel = new JxLabel();
		ifYesPleaseLabel.setTheme(theme);

		ifYesPleaseLabel.setText("if yes, please specify : ");
		ifYesPleaseLabel.setBounds(45, 400, 137, 14);
		panel.add(ifYesPleaseLabel);

		txtPhysicalLimitationSpecify = new JxText();
		txtPhysicalLimitationSpecify.setTheme(theme);

		txtPhysicalLimitationSpecify.setBackground(background);
		txtPhysicalLimitationSpecify.setForeground(foreground);
		txtPhysicalLimitationSpecify.setMargin(margin);
		txtPhysicalLimitationSpecify.setBorder(border);

		txtPhysicalLimitationSpecify.setBounds(45, 420, 550, 21);
		panel.add(txtPhysicalLimitationSpecify);

		final JxLabel bnbspnbspnbspDoesLabel = new JxLabel();
		bnbspnbspnbspDoesLabel.setTheme(theme);

		bnbspnbspnbspDoesLabel
				.setText("<html><body> Does the resident use assistive devices that may alter his/her ability to smoke(e.g. splints neck collar)");
		bnbspnbspnbspDoesLabel.setBounds(37, 462, 583, 11);
		panel.add(bnbspnbspnbspDoesLabel);

		rbAssistiveDeviceYes = new JxRadioButton();
		rbAssistiveDeviceYes.setTheme(theme);

		rbAssistiveDeviceYes.setActionCommand("1");
		bgAssistive.add(rbAssistiveDeviceYes);

		rbAssistiveDeviceYes.setText("Yes");
		rbAssistiveDeviceYes.setBounds(59, 484, 54, 18);
		panel.add(rbAssistiveDeviceYes);

		rbAssistiveDeviceNo = new JxRadioButton();
		rbAssistiveDeviceNo.setTheme(theme);

		rbAssistiveDeviceNo.setActionCommand("2");
		bgAssistive.add(rbAssistiveDeviceNo);

		rbAssistiveDeviceNo.setText("No");
		rbAssistiveDeviceNo.setBounds(120, 483, 69, 18);
		panel.add(rbAssistiveDeviceNo);

		final JxLabel nbspnbspnbspnbspisTheResidentLabel = new JxLabel();
		nbspnbspnbspnbspisTheResidentLabel.setTheme(theme);

		nbspnbspnbspnbspisTheResidentLabel.setFontSize(12);
		nbspnbspnbspnbspisTheResidentLabel
				.setText("<html><body>Is the resident known to engage in the following unsafe smoking practices?</body></html>");
		nbspnbspnbspnbspisTheResidentLabel.setBounds(37, 515, 525, 14);
		panel.add(nbspnbspnbspnbspisTheResidentLabel);

		rbButtsYes = new JxRadioButton();
		rbButtsYes.setTheme(theme);

		rbButtsYes.setActionCommand("1");
		bgDispose.add(rbButtsYes);
		rbButtsYes.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
			}
		});

		rbButtsYes.setText("Yes");
		rbButtsYes.setBounds(90, 570, 51, 14);
		panel.add(rbButtsYes);

		rbButtsNo = new JxRadioButton();
		rbButtsNo.setTheme(theme);

		rbButtsNo.setActionCommand("2");
		bgDispose.add(rbButtsNo);

		rbButtsNo.setText("No");
		rbButtsNo.setBounds(150, 570, 52, 14);
		panel.add(rbButtsNo);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);

		label_1
				.setText("<html><body>(1) &nbsp;&nbsp;&nbsp; Dispose of ashes/cigarette butts in an unsafe manner</body></html>");
		label_1.setBounds(59, 540, 340, 18);
		panel.add(label_1);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);

		label_2
				.setText("<html><body>(2)&nbsp;&nbsp;&nbsp; Burn marks noted on clothes or self</body></html>");
		label_2.setBounds(59, 600, 363, 14);
		panel.add(label_2);

		rbBurnClothYes = new JxRadioButton();
		rbBurnClothYes.setTheme(theme);

		rbBurnClothYes.setActionCommand("1");
		bgBurn.add(rbBurnClothYes);

		rbBurnClothYes.setText("Yes");
		rbBurnClothYes.setBounds(90, 625, 54, 14);
		panel.add(rbBurnClothYes);

		rbBurnClothNo = new JxRadioButton();
		rbBurnClothNo.setTheme(theme);

		rbBurnClothNo.setActionCommand("2");
		bgBurn.add(rbBurnClothNo);

		rbBurnClothNo.setText("No");
		rbBurnClothNo.setBounds(150, 625, 68, 14);
		panel.add(rbBurnClothNo);

		final JxLabel dnbspnbspnbspnbspisTheLabel = new JxLabel();
		dnbspnbspnbspnbspisTheLabel.setTheme(theme);

		dnbspnbspnbspnbspisTheLabel
				.setText("<html><body>Is the resident known to attempt to set fires or use ignition material unsafely?</body></html>");
		dnbspnbspnbspnbspisTheLabel.setBounds(37, 660, 442, 14);
		panel.add(dnbspnbspnbspnbspisTheLabel);

		rbSetFireYes = new JxRadioButton();
		rbSetFireYes.setTheme(theme);

		rbSetFireYes.setActionCommand("1");
		bgMaterialUnsafty.add(rbSetFireYes);

		rbSetFireYes.setText("Yes");
		rbSetFireYes.setBounds(90, 686, 46, 14);
		panel.add(rbSetFireYes);

		rbSetFireNo = new JxRadioButton();
		rbSetFireNo.setTheme(theme);

		rbSetFireNo.setActionCommand("2");
		bgMaterialUnsafty.add(rbSetFireNo);

		rbSetFireNo.setText("No");
		rbSetFireNo.setBounds(150, 686, 70, 14);
		panel.add(rbSetFireNo);

		final JxLabel enbspnbspnbspnbspdoesTheLabel = new JxLabel();
		enbspnbspnbspnbspdoesTheLabel.setTheme(theme);

		enbspnbspnbspnbspdoesTheLabel
				.setText("<html><body>Does the resident consume alcohol?</body></html>");
		enbspnbspnbspnbspdoesTheLabel.setBounds(37, 720, 259, 14);
		panel.add(enbspnbspnbspnbspdoesTheLabel);

		rbConsumeAlcohalYes = new JxRadioButton();
		rbConsumeAlcohalYes.setTheme(theme);

		rbConsumeAlcohalYes.setActionCommand("1");
		bgConsume.add(rbConsumeAlcohalYes);

		rbConsumeAlcohalYes.setText("Yes");
		rbConsumeAlcohalYes.setBounds(90, 745, 51, 14);
		panel.add(rbConsumeAlcohalYes);

		rbConsumeAlcohalNo = new JxRadioButton();
		rbConsumeAlcohalNo.setTheme(theme);

		rbConsumeAlcohalNo.setActionCommand("2");
		bgConsume.add(rbConsumeAlcohalNo);

		rbConsumeAlcohalNo.setText("No");
		rbConsumeAlcohalNo.setBounds(150, 745, 62, 14);
		panel.add(rbConsumeAlcohalNo);

		final JxLabel aLabel = new JxLabel();
		aLabel.setTheme(theme);

		aLabel.setText("a.");
		aLabel.setBounds(12, 338, 10, 14);
		panel.add(aLabel);

		final JxLabel bLabel = new JxLabel();
		bLabel.setTheme(theme);

		bLabel.setText("b.");
		bLabel.setBounds(12, 460, 11, 14);
		panel.add(bLabel);

		final JxLabel bLabel_1 = new JxLabel();
		bLabel_1.setTheme(theme);
		bLabel_1.setText("c.");
		bLabel_1.setBounds(12, 515, 11, 14);
		panel.add(bLabel_1);

		final JxLabel bLabel_2 = new JxLabel();
		bLabel_2.setTheme(theme);

		bLabel_2.setText("d.");
		bLabel_2.setBounds(12, 660, 11, 14);
		panel.add(bLabel_2);

		final JxLabel bLabel_3 = new JxLabel();
		bLabel_3.setTheme(theme);

		bLabel_3.setText("e.");
		bLabel_3.setBounds(12, 720, 11, 14);
		panel.add(bLabel_3);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);
		label.setBounds(12, 310, 34, 14);
		panel.add(label);

		label.setFontSize(12);
		label.setFontStyle(Font.BOLD);
		label.setText("2.        ");
		doUpdate();

	}

	public int doSave() {

		AssessingResident2 refAssessingResident2 = new AssessingResident2();
		refAssessingResident2.setResidentId(Global.currentResidenceKey);
		refAssessingResident2.setSerial(Global.currentAssessingResident2);
		refAssessingResident2.setFormId(Global.currentAssessingResident1);
		refAssessingResident2.setMaterialUnsafty(SwingUtils
				.getSelectedButton(bgMaterialUnsafty));
		refAssessingResident2.setConsume(SwingUtils
				.getSelectedButton(bgConsume));
		refAssessingResident2.setBurn(SwingUtils.getSelectedButton(bgBurn));
		refAssessingResident2.setDispose(SwingUtils
				.getSelectedButton(bgDispose));
		refAssessingResident2.setAssistive(SwingUtils
				.getSelectedButton(bgAssistive));
		refAssessingResident2.setRisk(SwingUtils.getSelectedButton(bgRisk));
		refAssessingResident2.setNeverCheckBox(cbneverCheckBox.isSelected());
		refAssessingResident2.setNumberOfTimesCheckBox(cbnumberOfTimesCheckBox
				.isSelected());
		refAssessingResident2.setTField(textField.getText());
		refAssessingResident2.setExplainAboutSmoking(txtExplainAboutSmoking
				.getText());
		refAssessingResident2.setSmokingArea(txtSmokingArea.getText());
		refAssessingResident2
				.setPhysicalLimitationSpecify(txtPhysicalLimitationSpecify
						.getText());
		try {
			Global.currentAssessingResident2 = MedrexClientManager
					.getInstance().insertOrUpdateAssessingResident2(
							refAssessingResident2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Global.currentAssessingResident2;
	}

	public void doUpdate() {
		AssessingResident2 refassessingResident2 = null;

		if (Global.currentAssessingResident1 != 0) {
			try {
				refassessingResident2 = MedrexClientManager
						.getInstance()
						.getAssessingResident2(Global.currentAssessingResident1);
				if (refassessingResident2 != null) {
					Global.currentAssessingResident2 = refassessingResident2
							.getSerial();
					SwingUtils.setSelectedButton(bgMaterialUnsafty,
							refassessingResident2.getMaterialUnsafty());
					SwingUtils.setSelectedButton(bgConsume,
							refassessingResident2.getConsume());
					SwingUtils.setSelectedButton(bgBurn, refassessingResident2
							.getBurn());
					SwingUtils.setSelectedButton(bgDispose,
							refassessingResident2.getDispose());
					SwingUtils.setSelectedButton(bgAssistive,
							refassessingResident2.getAssistive());
					SwingUtils.setSelectedButton(bgRisk, refassessingResident2
							.getRisk());
					cbneverCheckBox.setSelected(refassessingResident2
							.isNeverCheckBox());
					cbnumberOfTimesCheckBox.setSelected(refassessingResident2
							.isNumberOfTimesCheckBox());
					textField.setText(refassessingResident2.getTField());
					txtExplainAboutSmoking.setText(refassessingResident2
							.getExplainAboutSmoking());
					txtSmokingArea.setText(refassessingResident2
							.getSmokingArea());
					txtPhysicalLimitationSpecify.setText(refassessingResident2
							.getPhysicalLimitationSpecify());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public boolean doValidate() {

		return true;
	}

	public void doLoad() {

	}

}
