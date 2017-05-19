package medrex.client.mds3.ui.subSections.sectionX;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionX.Mds3SectionX;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelX0600D extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7036744892692498873L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbX0600D;

	public PanelX0600D() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 60));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);

		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 60);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1.setLayout(null);
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_1.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 60);
		panel.add(panel_1);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);

		enterCodeLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterCodeLabel.setText("Enter Code");
		enterCodeLabel.setBounds(14, 13, 54, 14);
		panel_1.add(enterCodeLabel);

		cmbX0600D = new JxComboBox();
		cmbX0600D.setTheme(theme);
		cmbX0600D.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));

		cmbX0600D.setBounds(15, 29, 50, 22);
		panel_1.add(cmbX0600D);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_3.setLayout(null);

		panel_3.setBounds(79, 0, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 60);
		panel.add(panel_3);

		final JxLabel dLabel = new JxLabel();
		dLabel.setTheme(theme);

		dLabel.setFontSize(12);
		dLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		dLabel
				.setText("<html><body><b> D. </b> &nbsp <b> Is this a swing Bed clinical change assessment? </b>  Complete only if X0200 = 2");
		dLabel.setBounds(10, 10, 447, 14);
		panel_3.add(dLabel);

		final JxLabel body0nbspLabel = new JxLabel();
		body0nbspLabel.setTheme(theme);

		body0nbspLabel.setFontSize(12);
		body0nbspLabel.setText("<html><body>0 .   &nbsp  <b>   No");
		body0nbspLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		body0nbspLabel.setBounds(31, 28, 66, 14);
		panel_3.add(body0nbspLabel);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontSize(12);
		label.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label.setText("<html><body>1.   &nbsp &nbsp<b> Yes");
		label.setBounds(31, 42, 66, 14);
		panel_3.add(label);

		doUpdate();
	}

	public void doSave() {
		Mds3SectionX sectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		Object obj = cmbX0600D.getSelectedItem();
		if (obj != null) {
			sectionX.setX0600D(cmbX0600D.getSelectedItem().toString());
		} else {
			sectionX.setX0600D("");
		}
	}

	public void doUpdate() {
		Mds3SectionX mds3SectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		cmbX0600D.setSelectedItem(mds3SectionX.getX0600D());

	}
}
