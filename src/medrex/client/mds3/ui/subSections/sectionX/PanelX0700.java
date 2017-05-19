package medrex.client.mds3.ui.subSections.sectionX;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionX.Mds3SectionX;

import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelX0700 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 729453672280240371L;
	Theme theme = new BlackOverWhiteTheme();
	private JxDateChooser dcX0700B;
	private JxDateChooser dcX0700C;
	private JxDateChooser dcX0700A;

	public PanelX0700() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 202));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);

		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 202);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1.setLayout(null);
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel.add(panel_1);

		final JxLabel x0700Label = new JxLabel();
		x0700Label.setTheme(theme);

		x0700Label.setFontSize(12);
		x0700Label
				.setText("<html><body> <b> X0700.  </b> &nbsp<b>Date </b> on existinh record to be modified/inactivated - <b> Complete one only");
		x0700Label.setBounds(10, 5, 449, 14);
		panel_1.add(x0700Label);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setLayout(null);
		panel_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_2.setBounds(0, 24, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 178);
		panel.add(panel_2);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_3.setLayout(null);

		panel_3.setBounds(79, 24, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 60);
		panel.add(panel_3);

		final JxLabel anbspLabel = new JxLabel();
		anbspLabel.setTheme(theme);

		anbspLabel.setFontSize(12);
		anbspLabel
				.setText("<html><body><b>A. </b> &nbsp <b> Assessment Reference Date </b> - Complete only if X0600F = 99");
		anbspLabel.setBounds(10, 10, 467, 14);
		panel_3.add(anbspLabel);

		dcX0700A = new JxDateChooser();
		dcX0700A.setTheme(theme);
		dcX0700A.setBounds(34, 28, 160, 18);
		dcX0700A.setDateFormatString("MM/dd/yyyy");
		panel_3.add(dcX0700A);

		final JxLabel monthLabel = new JxLabel();
		monthLabel.setTheme(theme);
		monthLabel.setText("Month");
		monthLabel.setBounds(35, 45, 54, 14);
		panel_3.add(monthLabel);

		final JxLabel dayLabel = new JxLabel();
		dayLabel.setTheme(theme);

		dayLabel.setFontSize(12);
		dayLabel.setText("Day");
		dayLabel.setBounds(95, 45, 54, 14);
		panel_3.add(dayLabel);

		final JxLabel yearLabel = new JxLabel();
		yearLabel.setTheme(theme);

		yearLabel.setFontSize(12);
		yearLabel.setText("Year");
		yearLabel.setBounds(145, 45, 54, 14);
		panel_3.add(yearLabel);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);
		panel_4.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_4.setLayout(null);
		panel_4.setBounds(79, 83, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 60);
		panel.add(panel_4);

		final JxLabel bLabel = new JxLabel();
		bLabel.setTheme(theme);

		bLabel.setFontSize(12);
		bLabel
				.setText("<html><body><b> B. </b> &nbsp <b> Discharge Date </b> - Complete only if X0600F = 10, 11, or 12");
		bLabel.setBounds(10, 10, 372, 14);
		panel_4.add(bLabel);

		dcX0700C = new JxDateChooser();
		dcX0700C.setTheme(theme);
		dcX0700C.setBounds(34, 28, 160, 18);
		dcX0700C.setDateFormatString("MM/dd/yyyy");
		panel_4.add(dcX0700C);

		final JxLabel monthLabel1 = new JxLabel();
		monthLabel1.setTheme(theme);
		monthLabel1.setText("Month");
		monthLabel1.setBounds(35, 45, 54, 14);
		panel_4.add(monthLabel1);

		final JxLabel dayLabel1 = new JxLabel();
		dayLabel1.setTheme(theme);

		dayLabel1.setFontSize(12);
		dayLabel1.setText("Day");
		dayLabel1.setBounds(95, 45, 54, 14);
		panel_4.add(dayLabel1);

		final JxLabel yearLabel1 = new JxLabel();
		yearLabel1.setTheme(theme);

		yearLabel1.setFontSize(12);
		yearLabel1.setText("Year");
		yearLabel1.setBounds(145, 45, 54, 14);
		panel_4.add(yearLabel1);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setLayout(null);

		panel_5.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5.setBounds(79, 142, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 60);
		panel.add(panel_5);

		final JxLabel cLabel = new JxLabel();
		cLabel.setTheme(theme);

		cLabel.setFontSize(12);
		cLabel
				.setText("<html><body><b> C. </b> &nbsp <b> Entry Date </b> - Complete only if X0600F = 01");
		cLabel.setBounds(10, 10, 463, 14);
		panel_5.add(cLabel);

		dcX0700B = new JxDateChooser();
		dcX0700B.setTheme(theme);
		dcX0700B.setBounds(34, 28, 160, 18);
		dcX0700B.setDateFormatString("MM/dd/yyyy");
		panel_5.add(dcX0700B);

		final JxLabel monthLabel2 = new JxLabel();
		monthLabel2.setTheme(theme);
		monthLabel2.setText("Month");
		monthLabel2.setBounds(35, 45, 54, 14);
		panel_5.add(monthLabel2);

		final JxLabel dayLabel2 = new JxLabel();
		dayLabel2.setTheme(theme);

		dayLabel2.setFontSize(12);
		dayLabel2.setText("Day");
		dayLabel2.setBounds(95, 45, 54, 14);
		panel_5.add(dayLabel2);

		final JxLabel yearLabel2 = new JxLabel();
		yearLabel2.setTheme(theme);

		yearLabel2.setFontSize(12);
		yearLabel2.setText("Year");
		yearLabel2.setBounds(145, 45, 54, 14);
		panel_5.add(yearLabel2);
		doUpdate();
	}

	public void doSave() {
		Mds3SectionX sectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		sectionX.setX0700A(dcX0700A.getDate());
		sectionX.setX0700B(dcX0700B.getDate());
		sectionX.setX0700C(dcX0700C.getDate());
	}

	public void doUpdate() {
		Mds3SectionX sectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		dcX0700A.setDate(sectionX.getX0700A());
		dcX0700B.setDate(sectionX.getX0700B());
		dcX0700C.setDate(sectionX.getX0700C());
	}

}
