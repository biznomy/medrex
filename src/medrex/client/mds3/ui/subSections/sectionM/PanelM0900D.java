package medrex.client.mds3.ui.subSections.sectionM;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionM.Mds3SectionM;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelM0900D extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2947823503756130256L;

	Theme theme = new BlackOverWhiteTheme();

	private JxComboBox cmbM09000D;

	public PanelM0900D() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(841, 50));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);
		panel.setBounds(0, 0, 841, 50);
		add(panel);

		final JxPanel panel_34 = new JxPanel();
		panel_34.setTheme(theme);
		panel_34.setBounds(0, 0, 80, 50);
		panel.add(panel_34);
		panel_34.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_34.setLayout(null);

		cmbM09000D = new JxComboBox();
		cmbM09000D.setTheme(theme);
		cmbM09000D.setModel(new DefaultComboBoxModel(new String[] { " ", "0",
				"D" }));

		cmbM09000D.setBounds(15, 20, 58, 22);
		panel_34.add(cmbM09000D);

		final JxLabel enterNumberLabel = new JxLabel();
		enterNumberLabel.setTheme(theme);
		enterNumberLabel.setText("Enter Number");
		enterNumberLabel.setBounds(5, 2, 73, 14);
		panel_34.add(enterNumberLabel);

		final JxPanel panel_16 = new JxPanel();
		panel_16.setTheme(theme);
		panel_16.setBounds(79, 0, 760, 50);
		panel.add(panel_16);
		panel_16.setLayout(null);
		panel_16.setBorder(new LineBorder(Color.black, 1, false));

		final JxLabel bStageLabel = new JxLabel();
		bStageLabel.setTheme(theme);
		bStageLabel.setText("<html><body><b>  D.  Stage 2 ");

		bStageLabel.setFontSize(12);
		bStageLabel.setBounds(10, 0, 500, 40);
		panel_16.add(bStageLabel);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionM mds3sectionM = (Mds3SectionM) Mds3Controller.getInstance()
				.getSection(Mds3SectionM.class);

		Object obj = cmbM09000D.getSelectedItem();
		if (obj != null) {
			mds3sectionM.setM0900D(cmbM09000D.getSelectedItem().toString());
		} else {
			mds3sectionM.setM0900D("");
		}
	}

	@Override
	public void doUpdate() {
		Mds3SectionM mds3sectionM = (Mds3SectionM) Mds3Controller.getInstance()
				.getSection(Mds3SectionM.class);
		cmbM09000D.setSelectedItem(mds3sectionM.getM0900D());
	}
}
