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

public class PanelX1050 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7441212443998881892L;
	Theme theme = new BlackOverWhiteTheme();
	private JxTextA txtX1050Z;
	private JxCheckBox cbX1050Z;
	private JxCheckBox cbX1050A;

	public PanelX1050() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 115));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);

		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 115);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel.add(panel_1);

		final JxLabel x1050Label = new JxLabel();
		x1050Label.setTheme(theme);

		x1050Label.setFontSize(12);
		x1050Label.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		x1050Label
				.setText("<html><body><b> X1050. </b> &nbsp <b> Reasons for Inactivation </b> - Complete only if Type of Record is to inactivate a record in error (X0100 = 3)");
		x1050Label.setBounds(10, 5, 681, 14);
		panel_1.add(x1050Label);

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
		checkAllThatLabel.setBounds(55, 3, 177, 14);
		panel_2.add(checkAllThatLabel);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_3.setLayout(null);
		panel_3.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_3.setBounds(0, 43, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 72);
		panel.add(panel_3);

		cbX1050A = new JxCheckBox();
		cbX1050A.setTheme(theme);

		cbX1050A.setText("New JxCheckBox");
		cbX1050A.setBounds(33, 4, 17, 17);
		panel_3.add(cbX1050A);

		cbX1050Z = new JxCheckBox();
		cbX1050Z.setTheme(theme);

		cbX1050Z.setText("New JxCheckBox");
		cbX1050Z.setBounds(33, 40, 17, 17);
		panel_3.add(cbX1050Z);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);
		panel_4.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_4.setLayout(null);

		panel_4.setBounds(79, 43, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 25);
		panel.add(panel_4);

		final JxLabel anbspLabel = new JxLabel();
		anbspLabel.setTheme(theme);

		anbspLabel.setFontSize(12);
		anbspLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		anbspLabel
				.setText("<html><body><b>A. </b> &nbsp <b> Event did not occur </b>");
		anbspLabel.setBounds(10, 6, 206, 14);
		panel_4.add(anbspLabel);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5.setLayout(null);

		panel_5.setBounds(79, 67, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 48);
		panel.add(panel_5);

		final JxLabel znbspLabel = new JxLabel();
		znbspLabel.setTheme(theme);

		znbspLabel.setFontSize(12);
		znbspLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		znbspLabel
				.setText("<html><body><b>Z. </b> &nbsp <b> Other error requiring inactivation </b> <br> &nbsp &nbsp &nbsp if  \"other\" checked , please specify :");
		znbspLabel.setBounds(10, 10, 254, 28);
		panel_5.add(znbspLabel);

		txtX1050Z = new JxTextA();
		txtX1050Z.setTheme(theme);
		txtX1050Z.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		txtX1050Z.setBounds(245, 10, 472, 28);
		panel_5.add(txtX1050Z);
		doUpdate();
	}

	public void doSave() {
		Mds3SectionX mds3sectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		mds3sectionX.setX1050A(cbX1050A.isSelected());
		mds3sectionX.setX1050Z(cbX1050Z.isSelected());
		// mds3sectionX.setX1050z1((txtX1050Z.getText()));
	}

	public void doUpdate() {
		Mds3SectionX mds3sectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		mds3sectionX.setX1050A(mds3sectionX.isX1050A());
		mds3sectionX.setX1050Z(mds3sectionX.isX1050Z());
		txtX1050Z.setText(txtX1050Z.getText());
	}

}
