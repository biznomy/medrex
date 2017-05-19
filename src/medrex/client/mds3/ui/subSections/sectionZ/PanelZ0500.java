package medrex.client.mds3.ui.subSections.sectionZ;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionZ.Mds3SectionZ;

import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelZ0500 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3961838631551545313L;

	Theme theme = new BlackOverWhiteTheme();

	private JxDateChooser dcDateZ0500;

	public PanelZ0500() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 100));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(0, 0));
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 100);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1.setLayout(null);
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel.add(panel_1);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontSize(12);
		label
				.setText("<html><body> <b> Z0500.  Sinature of RN Assessment Coordinator Verifying Assessment Completion");
		label.setBounds(5, 6, 487, 16);
		panel_1.add(label);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		// panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_2.setLayout(null);
		panel_2.setBounds(0, 24, 25, 76);
		panel.add(panel_2);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_3.setLayout(null);
		panel_3.setBounds(24, 24, 816, 76);
		panel.add(panel_3);

		final JxLabel aSignatureLabel = new JxLabel();
		aSignatureLabel.setTheme(theme);

		aSignatureLabel.setFontSize(12);
		aSignatureLabel.setFontStyle(Font.BOLD);
		aSignatureLabel.setText("A. Signature");
		aSignatureLabel.setBounds(10, 10, 114, 16);
		panel_3.add(aSignatureLabel);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);

		label_1.setFontSize(12);
		label_1.setFontStyle(Font.BOLD);
		label_1
				.setText("<html><body><b> B. </b> &nbsp <b> Date RN Assessment Coordinator signed </b><br>&nbsp &nbsp &nbsp <b> assessment as complete: ");
		label_1.setBounds(483, 10, 294, 30);
		panel_3.add(label_1);

		dcDateZ0500 = new JxDateChooser();
		dcDateZ0500.setTheme(theme);
		dcDateZ0500.setDateFormatString("MM/dd/yyyy");
		dcDateZ0500.setBounds(500, 46, 200, 22);
		panel_3.add(dcDateZ0500);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionZ mds3sectionZ = (Mds3SectionZ) Mds3Controller.getInstance()
				.getSection(Mds3SectionZ.class);

		mds3sectionZ.setZ0400A(dcDateZ0500.getDate());

	}

	@Override
	public void doUpdate() {
		Mds3SectionZ mds3sectionZ = (Mds3SectionZ) Mds3Controller.getInstance()
				.getSection(Mds3SectionZ.class);
		dcDateZ0500.setDate(mds3sectionZ.getZ0400A());

	}

}
