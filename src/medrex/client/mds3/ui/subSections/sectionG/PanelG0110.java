package medrex.client.mds3.ui.subSections.sectionG;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.border.LineBorder;

import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.enums.ColorConstants;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelG0110 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5203762763443266199L;
	Theme theme = new BlackOverWhiteTheme();

	@Override
	public void doSave() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doUpdate() {
		// TODO Auto-generated method stub

	}

	public PanelG0110() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 180));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 180);
		add(panel);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setLayout(null);
		panel_6.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 40);
		panel.add(panel_6);

		final JxLabel a0100Label = new JxLabel();
		a0100Label.setTheme(theme);
		a0100Label.setBounds(11, 6, 414, 30);

		a0100Label.setFontSize(12);
		a0100Label.setFontStyle(Font.BOLD);
		a0100Label.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label
				.setText("<html><b>G0110. Activities of Daily Living (ADL)Assistance</b><br>Refer to the ADL flow chart in the RAI manual to facilitate accurate coding</html>");
		panel_6.add(a0100Label);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_7.setLayout(null);

		panel_7.setBounds(0, 40, 840, 140);
		panel.add(panel_7);

		final JxLabel instructionForRuleLabel = new JxLabel();
		instructionForRuleLabel.setTheme(theme);
		instructionForRuleLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		instructionForRuleLabel.setFontSize(12);
		instructionForRuleLabel.setBounds(10, 0, 820, 140);
		instructionForRuleLabel
				.setText("<html><b>Instruction for Rule 3</b><br>* When an activity occurs thre times at any one given level, code that level.<br>* When an activity occurs three times at multiple levels, code the most dependent, exceptions are total dependence (4), activity must require full assist<br> &nbsp; &nbsp; &nbsp; everytime, and activity did not occur (8), activity must not have occured at all. Exmaples, three timesextensive assistance (3) and three times limited<br> &nbsp; &nbsp; &nbsp; assistance(2), code extensive assistance(3).<br>* When an activity occurs at various levels, but not three times at any given level, apply the the following:<br> &nbsp; &nbsp; &nbsp; *When there is combination of full staff performance, and extensive assistance, code extensive assistance.<br> &nbsp; &nbsp; &nbsp; *When there is combination of full staff performance, weight bearing assistance and/or non-weight bearing assistance code limited assistance (2).<br><b>If none of the above are met, code supervision</b></html>");
		panel_7.add(instructionForRuleLabel);
	}

}
