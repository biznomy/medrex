package medrex.client.mds3.ui.subSections.sectionZ;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionZ.Mds3SectionZ;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelZ0100 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1679036471214542458L;
	Theme theme = new BlackOverWhiteTheme();
	private JxText txtZ0100A;
	private JxText txtZ0100B;
	private JxComboBox cmbZ0100C;
	private JxPanel panel;

	public PanelZ0100() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 200));
		setLayout(null);
		setBackground(Color.WHITE);

		panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);

		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 200);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel.add(panel_1);

		final JxLabel z0100MedicarePartLabel = new JxLabel();
		z0100MedicarePartLabel.setTheme(theme);

		z0100MedicarePartLabel.setFontSize(12);
		z0100MedicarePartLabel.setFontStyle(Font.BOLD);
		z0100MedicarePartLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		z0100MedicarePartLabel.setText("Z0100.   Medicare Part A Billing");
		z0100MedicarePartLabel.setBounds(10, 6, 308, 14);
		panel_1.add(z0100MedicarePartLabel);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);

		panel_2.setLayout(null);
		panel_2.setBounds(0, 24, Mds3Constants.PAGE_WIDTH, 176);
		panel.add(panel_2);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_3.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_3.setLayout(null);
		panel_3.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 176);
		panel_2.add(panel_3);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);
		enterCodeLabel.setText("Enter Code");
		enterCodeLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterCodeLabel.setBounds(15, 133, 54, 14);
		panel_3.add(enterCodeLabel);

		cmbZ0100C = new JxComboBox();
		cmbZ0100C.setTheme(theme);
		cmbZ0100C.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));

		cmbZ0100C.setBounds(15, 148, 50, 22);
		panel_3.add(cmbZ0100C);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);
		panel_4.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_4.setLayout(null);

		panel_4.setBounds(79, 0, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 176);
		panel_2.add(panel_4);

		final JxLabel aLabel = new JxLabel();
		aLabel.setTheme(theme);

		aLabel.setFontSize(12);
		aLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aLabel
				.setText("<html><body><b> A. </b> &nbsp <b> Medicare Part A HIPPS code </b> (RUG group followed by assessment type indicatior) :");
		aLabel.setBounds(10, 10, 486, 14);
		panel_4.add(aLabel);

		txtZ0100A = new JxText();
		txtZ0100A.setTheme(theme);
		txtZ0100A.setBounds(30, 30, 225, 22);
		panel_4.add(txtZ0100A);

		final JxLabel bLabel = new JxLabel();
		bLabel.setTheme(theme);

		bLabel.setFontSize(12);
		bLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		bLabel
				.setText("<html><body><b> B. </b> &nbsp <b> RUG version code : </b>");
		bLabel.setBounds(10, 65, 220, 14);
		panel_4.add(bLabel);

		txtZ0100B = new JxText();
		txtZ0100B.setTheme(theme);
		txtZ0100B.setBounds(30, 87, 250, 22);
		panel_4.add(txtZ0100B);

		final JxLabel cnbspLabel = new JxLabel();
		cnbspLabel.setTheme(theme);

		cnbspLabel.setFontSize(12);
		cnbspLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		cnbspLabel
				.setText("<html><body><b>C. </b> &nbsp <b> Is this a Medicare Short Stay assessment ?");
		cnbspLabel.setBounds(10, 122, 332, 14);
		panel_4.add(cnbspLabel);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontSize(12);
		label.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label.setText("<html><body> 0. &nbsp <b> No");
		label.setBounds(30, 142, 54, 14);
		panel_4.add(label);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);

		label_1.setFontSize(12);
		label_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_1.setText("<html><body> 1. &nbsp <b> Yes");
		label_1.setBounds(30, 158, 54, 14);
		panel_4.add(label_1);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionZ mds3sectionZ = (Mds3SectionZ) Mds3Controller.getInstance()
				.getSection(Mds3SectionZ.class);

		Object obj = cmbZ0100C.getSelectedItem();
		if (obj != null) {
			mds3sectionZ.setZ0100C(cmbZ0100C.getSelectedItem().toString());
		} else {
			mds3sectionZ.setZ0100C("");
		}

		mds3sectionZ.setZ0100A(txtZ0100A.getText());
		mds3sectionZ.setZ0100B(txtZ0100B.getText());

	}

	@Override
	public void doUpdate() {
		Mds3SectionZ mds3sectionZ = (Mds3SectionZ) Mds3Controller.getInstance()
				.getSection(Mds3SectionZ.class);
		cmbZ0100C.setSelectedItem(mds3sectionZ.getZ0100C());
		txtZ0100A.setText(mds3sectionZ.getZ0100A());
		txtZ0100B.setText(mds3sectionZ.getZ0100B());

	}

}
