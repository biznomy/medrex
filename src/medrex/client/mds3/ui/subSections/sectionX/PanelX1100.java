package medrex.client.mds3.ui.subSections.sectionX;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionX.Mds3SectionX;

import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelX1100 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3634311112385970534L;
	Theme theme = new BlackOverWhiteTheme();
	private JxDateChooser dcX1100E;
	private JxText txtX1100B;
	private JxText txtX1100A;

	public PanelX1100() {
		super();
		setLayout(null);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 255));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);

		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 255);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1.setLayout(null);
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel.add(panel_1);

		final JxLabel x1100RnAssessmentLabel = new JxLabel();
		x1100RnAssessmentLabel.setTheme(theme);

		x1100RnAssessmentLabel.setFontSize(12);
		x1100RnAssessmentLabel.setFontStyle(Font.BOLD);
		x1100RnAssessmentLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		x1100RnAssessmentLabel
				.setText("X1100.  RN Assessment Coordinator Attestation of Completion");
		x1100RnAssessmentLabel.setBounds(11, 6, 419, 14);
		panel_1.add(x1100RnAssessmentLabel);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_2.setLayout(null);
		panel_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_2.setBounds(0, 24, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 231);
		panel.add(panel_2);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_3.setLayout(null);
		panel_3.setBounds(79, 24, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 45);
		panel.add(panel_3);

		final JxLabel bodyanbspLabel = new JxLabel();
		bodyanbspLabel.setTheme(theme);

		bodyanbspLabel.setFontSize(12);
		bodyanbspLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		bodyanbspLabel
				.setText("<html><body><b>A. </b> &nbsp <b> Attesting individual's first name : ");
		bodyanbspLabel.setBounds(10, 7, 325, 14);
		panel_3.add(bodyanbspLabel);

		txtX1100A = new JxText();
		txtX1100A.setTheme(theme);
		txtX1100A.setBounds(20, 24, 185, 18);
		panel_3.add(txtX1100A);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);
		panel_4.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_4.setLayout(null);

		panel_4.setBounds(79, 68, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 45);
		panel.add(panel_4);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontSize(12);
		label.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label
				.setText("<html><body><b>B. </b> &nbsp <b> Attesting individual's last name :");
		label.setBounds(10, 7, 262, 14);
		panel_4.add(label);

		txtX1100B = new JxText();
		txtX1100B.setTheme(theme);
		txtX1100B.setBounds(20, 24, 185, 18);
		panel_4.add(txtX1100B);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5.setLayout(null);

		panel_5.setBounds(79, 112, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 45);
		panel.add(panel_5);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);

		label_1.setFontSize(12);
		label_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_1
				.setText("<html><body><b>C. </b> &nbsp <b> Attesting individual's title :");
		label_1.setBounds(10, 7, 225, 14);
		panel_5.add(label_1);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6.setLayout(null);

		panel_6.setBounds(79, 156, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 45);
		panel.add(panel_6);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);

		label_2.setFontSize(12);
		label_2.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_2.setText("<html><body><b>D. </b> &nbsp <b> Signature");
		label_2.setBounds(11, 7, 200, 14);
		panel_6.add(label_2);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setLayout(null);

		panel_7.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7.setBounds(79, 200, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 55);
		panel.add(panel_7);

		final JxLabel label_3 = new JxLabel();
		label_3.setTheme(theme);

		label_3.setFontSize(12);
		label_3.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_3.setText("<html><body><b>E. </b> &nbsp <b> Attestation date");
		label_3.setBounds(11, 7, 514, 14);
		panel_7.add(label_3);

		dcX1100E = new JxDateChooser();
		dcX1100E.setTheme(theme);
		dcX1100E.setBounds(20, 24, 185, 18);
		dcX1100E.setDateFormatString("MM/dd/yyyy");
		panel_7.add(dcX1100E);

		final JxLabel monthLabel = new JxLabel();
		monthLabel.setTheme(theme);
		monthLabel.setText("Month");
		monthLabel.setBounds(25, 40, 54, 13);
		monthLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7.add(monthLabel);

		final JxLabel dayLabel = new JxLabel();
		dayLabel.setTheme(theme);
		dayLabel.setText("Day");
		dayLabel.setBounds(83, 40, 54, 13);
		dayLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7.add(dayLabel);

		final JxLabel yearLabel = new JxLabel();
		yearLabel.setTheme(theme);
		yearLabel.setText("Year");
		yearLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		yearLabel.setBounds(135, 40, 54, 13);
		panel_7.add(yearLabel);

		doUpdate();
	}

	public void doSave() {
		Mds3SectionX sectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		sectionX.setX1100E(dcX1100E.getDate());
		sectionX.setX1100A(txtX1100A.getText());
		sectionX.setX1100B(txtX1100B.getText());
	}

	public void doUpdate() {
		Mds3SectionX sectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		dcX1100E.setDate(sectionX.getX1100E());
		txtX1100A.setText(sectionX.getX1100A());
		txtX1100B.setText(sectionX.getX1100B());
		// txtX1100C.setText(sectionX.getX1100C());
		// txtX1100D.setText(sectionX.getX1100D());

	}

}
