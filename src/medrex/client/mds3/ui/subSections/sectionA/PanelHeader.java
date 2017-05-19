package medrex.client.mds3.ui.subSections.sectionA;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.SwingConstants;

import medrex.client.mds3.general.Mds3SubSection;
import medrex.commons.enums.ColorConstants;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelHeader extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -16759641774572814L;
	Theme theme = new BlackOverWhiteTheme();

	public PanelHeader() {
		super();
		setOpaque(false);
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(840, 100));
		setBackground(Color.WHITE);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setPreferredSize(new Dimension(840, 100));

		panel.setOpaque(false);
		panel.setLayout(null);
		add(panel);

		final JxLabel minimumDataSetLabel = new JxLabel();
		minimumDataSetLabel.setTheme(theme);

		minimumDataSetLabel.setFontStyle(Font.BOLD);
		minimumDataSetLabel.setHorizontalAlignment(SwingConstants.CENTER);
		minimumDataSetLabel.setForeground(ColorConstants.MDS_FONT_COLOR);
		minimumDataSetLabel.setText("MINIMUM DATA SET (MDS) - VERSION 3.0");
		minimumDataSetLabel.setBounds(222, 10, 379, 26);
		panel.add(minimumDataSetLabel);

		final JxLabel residentAssessmentAndLabel = new JxLabel();
		residentAssessmentAndLabel.setTheme(theme);

		residentAssessmentAndLabel.setFontStyle(Font.BOLD);
		residentAssessmentAndLabel.setFontSize(14);
		residentAssessmentAndLabel
				.setHorizontalAlignment(SwingConstants.CENTER);
		residentAssessmentAndLabel.setForeground(ColorConstants.MDS_FONT_COLOR);
		residentAssessmentAndLabel
				.setText("RESIDENT ASSESSMENT AND CARE SCREENING");
		residentAssessmentAndLabel.setBounds(198, 43, 422, 16);
		panel.add(residentAssessmentAndLabel);

		final JxLabel residentAssessmentAndLabel_1 = new JxLabel();
		residentAssessmentAndLabel_1.setTheme(theme);

		residentAssessmentAndLabel_1.setFontStyle(Font.BOLD);
		residentAssessmentAndLabel_1
				.setHorizontalAlignment(SwingConstants.CENTER);
		residentAssessmentAndLabel_1
				.setForeground(ColorConstants.MDS_FONT_COLOR);
		residentAssessmentAndLabel_1
				.setText("Nursing Home Comprehensive (NC) Item Set");
		residentAssessmentAndLabel_1.setBounds(198, 65, 422, 16);
		panel.add(residentAssessmentAndLabel_1);

	}

	@Override
	public void doSave() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doUpdate() {
		// TODO Auto-generated method stub

	}
}
