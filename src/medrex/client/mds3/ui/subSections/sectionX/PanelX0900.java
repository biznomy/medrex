package medrex.client.mds3.ui.subSections.sectionX;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionX.Mds3SectionX;

import com.sX.swing.JxCheckBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTextA;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelX0900 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8225725252647986316L;
	Theme theme = new BlackOverWhiteTheme();
	private JxTextA txtX0900Z;
	private JxCheckBox cbX0900Z;
	private JxCheckBox cbX0900D;
	private JxCheckBox cbX0900C;
	private JxCheckBox cbX0900B;
	private JxCheckBox cbX0900A;

	public PanelX0900() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 180));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);

		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 180);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1.setLayout(null);
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel.add(panel_1);

		final JxLabel x0900nbspLabel = new JxLabel();
		x0900nbspLabel.setTheme(theme);

		x0900nbspLabel.setFontSize(12);
		x0900nbspLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		x0900nbspLabel
				.setText("<html><body><b> X0900. </b>&nbsp  <b>Reasons for Modification </b> - Complete only if Type of Record is to modify a record in error ( X0100 = 2)");
		x0900nbspLabel.setBounds(10, 6, 598, 14);
		panel_1.add(x0900nbspLabel);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_2.setLayout(null);

		panel_2.setBounds(0, 24, 840, 20);
		panel.add(panel_2);

		final JxLabel checkAllThatLabel = new JxLabel();
		checkAllThatLabel.setTheme(theme);

		checkAllThatLabel.setFontSize(12);
		checkAllThatLabel.setFontStyle(Font.BOLD);
		checkAllThatLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		checkAllThatLabel.setText("Check all that apply");
		checkAllThatLabel.setBounds(55, 4, 284, 14);
		panel_2.add(checkAllThatLabel);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_3.setLayout(null);
		panel_3.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_3.setBounds(0, 43, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 137);
		panel.add(panel_3);

		cbX0900A = new JxCheckBox();
		cbX0900A.setTheme(theme);

		cbX0900A.setText("New JxCheckBox");
		cbX0900A.setBounds(33, 4, 17, 17);
		panel_3.add(cbX0900A);

		cbX0900B = new JxCheckBox();
		cbX0900B.setTheme(theme);

		cbX0900B.setText("New JxCheckBox");
		cbX0900B.setBounds(33, 28, 17, 17);
		panel_3.add(cbX0900B);

		cbX0900C = new JxCheckBox();
		cbX0900C.setTheme(theme);

		cbX0900C.setText("New JxCheckBox");
		cbX0900C.setBounds(33, 50, 17, 17);
		panel_3.add(cbX0900C);

		cbX0900D = new JxCheckBox();
		cbX0900D.setTheme(theme);

		cbX0900D.setText("New JxCheckBox");
		cbX0900D.setBounds(33, 76, 17, 17);
		panel_3.add(cbX0900D);

		cbX0900Z = new JxCheckBox();
		cbX0900Z.setTheme(theme);

		cbX0900Z.setText("New JxCheckBox");
		cbX0900Z.setBounds(33, 105, 17, 17);
		panel_3.add(cbX0900Z);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);
		panel_4.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_4.setLayout(null);

		panel_4.setBounds(79, 43, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 25);
		panel.add(panel_4);

		final JxLabel aLabel = new JxLabel();
		aLabel.setTheme(theme);

		aLabel.setFontSize(12);
		aLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aLabel.setText("<html><body><b> A. </b> &nbsp <b> Transcription error");
		aLabel.setBounds(22, 5, 213, 14);
		panel_4.add(aLabel);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5.setLayout(null);

		panel_5.setBounds(79, 67, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 25);
		panel.add(panel_5);

		final JxLabel bLabel = new JxLabel();
		bLabel.setTheme(theme);

		bLabel.setFontSize(12);
		bLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		bLabel.setText("<html><body><b> B. </b> &nbsp <b> Data entry error");
		bLabel.setBounds(22, 5, 187, 14);
		panel_5.add(bLabel);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6.setLayout(null);

		panel_6.setBounds(79, 91, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 25);
		panel.add(panel_6);

		final JxLabel cLabel = new JxLabel();
		cLabel.setTheme(theme);

		cLabel.setFontSize(12);
		cLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		cLabel
				.setText("<html><body><b> C. </b> &nbsp <b> Software product error");
		cLabel.setBounds(22, 5, 194, 14);
		panel_6.add(cLabel);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7.setLayout(null);

		panel_7.setBounds(79, 115, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 25);
		panel.add(panel_7);

		final JxLabel dLabel = new JxLabel();
		dLabel.setTheme(theme);

		dLabel.setFontSize(12);
		dLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		dLabel.setText("<html><body><b> D. </b> &nbsp <b> Item coding error");
		dLabel.setBounds(22, 5, 244, 14);
		panel_7.add(dLabel);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);
		panel_8.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_8.setLayout(null);

		panel_8.setBounds(79, 139, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 41);
		panel.add(panel_8);

		final JxLabel zLabel = new JxLabel();
		zLabel.setTheme(theme);

		zLabel.setFontSize(12);
		zLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		zLabel
				.setText("<html><body><b> Z. </b> &nbsp <b> Other error requiring modification </b> <br> &nbsp &nbsp &nbsp if \"other\" checked, please specify :");
		zLabel.setBounds(22, 8, 234, 25);
		panel_8.add(zLabel);

		txtX0900Z = new JxTextA();
		txtX0900Z.setTheme(theme);
		txtX0900Z.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		txtX0900Z.setBounds(262, 6, 467, 25);
		panel_8.add(txtX0900Z);

		doUpdate();

	}

	public void doSave() {
		Mds3SectionX sectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		// sectionX.setX0900z1(txtX0900Z.getText());
		sectionX.setX0900A(cbX0900A.isSelected());
		sectionX.setX0900B(cbX0900B.isSelected());
		sectionX.setX0900C(cbX0900C.isSelected());
		sectionX.setX0900D(cbX0900D.isSelected());
		sectionX.setX0900Z(cbX0900Z.isSelected());
	}

	public void doUpdate() {
		Mds3SectionX mds3SectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		txtX0900Z.setText(txtX0900Z.getText());
		mds3SectionX.setX0900A(mds3SectionX.isX0900A());
		mds3SectionX.setX0900B(mds3SectionX.isX0900B());
		mds3SectionX.setX0900C(mds3SectionX.isX0900C());
		mds3SectionX.setX0900D(mds3SectionX.isX0900D());
		mds3SectionX.setX0900Z(mds3SectionX.isX0900Z());
	}
}
