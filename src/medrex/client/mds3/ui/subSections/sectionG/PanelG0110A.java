package medrex.client.mds3.ui.subSections.sectionG;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.enums.ColorConstants;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelG0110A extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6046959678386959510L;
	Theme theme = new BlackOverWhiteTheme();

	public PanelG0110A() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 280));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBorder(new LineBorder(Color.black, 1, false));

		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 280);
		add(panel);

		final JxLabel adlSelfperformancenbspLabel = new JxLabel();
		adlSelfperformancenbspLabel.setTheme(theme);

		adlSelfperformancenbspLabel.setFontSize(12);
		adlSelfperformancenbspLabel.setBounds(10, 5, 533, 270);
		adlSelfperformancenbspLabel
				.setText("<html><b>1. ADL Self-performance</b><br> &nbsp; &nbsp; &nbsp; Code for <b>resident's performance</b> over all shifts - not including setup. If the ADL activity<br>  &nbsp; &nbsp; &nbsp; occured for three or more times at various levels of assistance, code the most dependent - except for<br> &nbsp; &nbsp; &nbsp; total dependence, which requires full staff performance everytime.<br<b>Coding:</b><br> &nbsp; &nbsp; &nbsp; <b><u>Activity Occurred 3 or More Times</u></b><br> &nbsp;0. <b>Independent</b> - no help or staff oversight at any time.<br> &nbsp;1. <b>Supervision</b> - oversight, encouragement or cueing<br> &nbsp;2. <b>Limited assistance</b> - resident involved in activity; staff provide guided maneuvering<br> &nbsp; &nbsp; &nbsp;of limbs or non-weight-bearing assistance.<br> &nbsp;3. <b>Extensive assistance</b> - resident involved in activity, staff provide weight bearing support<br> &nbsp;4. <b>Total Dependence</b> - full staff performance evertime during entire 7-day period<br> &nbsp; &nbsp; &nbsp; <b><u>Activity Occurred 2 or Fewer Times</u></b><br> &nbsp; 8. <b>Activity occurred only once or twice</b> - activity did occur but only once or twice<br> &nbsp; 8. <b>Activity did not occur</b> - activity(or any part of ADL) was not performed by resident or<br> &nbsp;&nbsp;&nbsp; staff all over the entire 7-day period.</html>");
		panel.add(adlSelfperformancenbspLabel);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontSize(12);
		label
				.setText("<html><b>2. ADL Support Provided</b><br> &nbsp; &nbsp; &nbsp; Code for <b>most support provided</b> over all<br> &nbsp; &nbsp; &nbsp; shifts; code regaredless of residents self-<br>&nbsp; &nbsp; &nbsp; &nbsp;performance classification<br><b>Coding</b><br> &nbsp; &nbsp; &nbsp;0. <b>No</b> setup or physical help from staff<br> &nbsp; &nbsp; &nbsp;1. <b>setup</b> help only<br> &nbsp; &nbsp; &nbsp;2. <b>One</b> person physical assist<br> &nbsp; &nbsp; &nbsp;3. <b>Two+</b> persons physical assist<br> &nbsp; &nbsp; &nbsp;8. ADL activity itself <b>did not occur</b> during<br> &nbsp; &nbsp; &nbsp; entire period.</html>");
		label.setBounds(565, 0, 265, 180);
		panel.add(label);

		final JxPanel panel_9 = new JxPanel();
		panel_9.setTheme(theme);
		panel_9.setLayout(null);
		panel_9.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_9.setBounds(550, 210, 290, 70);
		panel.add(panel_9);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);
		label_1.setOpaque(true);

		label_1.setFontSize(12);
		label_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		label_1.setText("<html><b><center>1.</center> Self-Performance");
		label_1.setBounds(0, 0, 145, 42);
		panel_9.add(label_1);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);
		label_2.setOpaque(true);

		label_2.setFontSize(12);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		label_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		label_2.setText("<html><b><center>2.</center> Support</b></html>");
		label_2.setBounds(145, 0, 145, 42);
		panel_9.add(label_2);

		final JxLabel enterCodesInLabel = new JxLabel();
		enterCodesInLabel.setTheme(theme);
		enterCodesInLabel.setBorder(new LineBorder(Color.black, 1, false));
		enterCodesInLabel.setOpaque(true);

		enterCodesInLabel.setFontSize(12);
		enterCodesInLabel.setFontStyle(Font.BOLD);
		enterCodesInLabel.setHorizontalAlignment(SwingConstants.CENTER);
		enterCodesInLabel.setText("Enter Codes in Boxes");
		enterCodesInLabel.setBounds(0, 42, 290, 28);
		panel_9.add(enterCodesInLabel);

	}

	public void doSave() {

	}

	public void doUpdate() {

	}

}
