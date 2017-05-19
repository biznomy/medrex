package medrex.client.mds3.ui.subSections.sectionA;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.SectionA.Mds3SectionA;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelA0410 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2105591640972914408L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbA0410;

	public PanelA0410() {
		super();
		setPreferredSize(new Dimension(840, 75));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);
		panel.setBounds(0, 0, 840, 75);

		add(panel);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_6.setLayout(flowLayout_2);
		panel_6.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel.add(panel_6);

		final JxLabel a0500Label = new JxLabel();
		a0500Label.setTheme(theme);

		a0500Label.setFontSize(12);
		a0500Label.setFontStyle(Font.BOLD);
		a0500Label.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0500Label.setText("A0410.Submission Requirement");
		panel_6.add(a0500Label);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		// panel_7.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
		// Mds3Constants.BORDER_SIZE_1, false));
		panel_7.setLayout(null);
		panel_7.setBounds(0, 24, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 51);
		panel.add(panel_7);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);
		enterCodeLabel.setBounds(15, 0, 54, 14);
		enterCodeLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterCodeLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7.add(enterCodeLabel);
		enterCodeLabel.setText("Enter Code");

		cmbA0410 = new JxComboBox();
		cmbA0410.setTheme(theme);
		cmbA0410.setPreferredSize(new Dimension(50, 20));
		cmbA0410.setModel(new DefaultComboBoxModel(new String[] { " ", "1",
				"2", "3" }));

		cmbA0410.setBounds(15, 20, 50, 22);
		panel_7.add(cmbA0410);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);
		panel_8.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_8.setLayout(null);
		panel_8.setBounds(79, 24, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 51);
		panel.add(panel_8);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontSize(12);
		label.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label
				.setText("<html><body>1.<b> Neither federal nor state required submission</b>");
		label.setBounds(21, 3, 283, 14);
		panel_8.add(label);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);

		label_1.setFontSize(12);
		label_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_1
				.setText("<html><body>2. <b>State but not federal required submission</b>");
		label_1.setBounds(21, 18, 248, 14);
		panel_8.add(label_1);

		final JxLabel federalRequiredSubmissionLabel = new JxLabel();
		federalRequiredSubmissionLabel.setTheme(theme);

		federalRequiredSubmissionLabel.setFontSize(12);
		federalRequiredSubmissionLabel
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		federalRequiredSubmissionLabel
				.setText("<html><body>3.<b> Federal required submission</b>");
		federalRequiredSubmissionLabel.setBounds(21, 32, 335, 14);
		panel_8.add(federalRequiredSubmissionLabel);

		final JxLabel forNursingHomesLabel = new JxLabel();
		forNursingHomesLabel.setTheme(theme);
		forNursingHomesLabel.setText("(FOR NURSING HOMES ONLY)");
		forNursingHomesLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		forNursingHomesLabel.setBounds(270, 16, 181, 14);
		panel_8.add(forNursingHomesLabel);
		doUpdate();
	}

	public static void main(String ar[]) {
		try {
			UIManager
					.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JScrollPane scroller = new JScrollPane();
		PanelA0410 panel = new PanelA0410();
		scroller.setViewportView(panel);
		JFrame frm = new JFrame("Frame");
		frm.setSize(new Dimension(java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize()));
		frm.add(scroller);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setState(JFrame.MAXIMIZED_BOTH);
		frm.setVisible(true);

		// SwingUtils.openInDialogforJxPanel().setVisible(true);
	}

	public void doSave() {
		Mds3SectionA sectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		Object obj = cmbA0410.getSelectedItem();
		System.out
				.println(" ************************************************************ ");
		if (obj != null) {
			sectionA.setA0410((cmbA0410.getSelectedItem().toString()));
		} else {
			sectionA.setA0410("");
		}
	}

	@Override
	public void doUpdate() {
		Mds3SectionA mds3SectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		cmbA0410.setSelectedItem(mds3SectionA.getA0410());

	}

}
