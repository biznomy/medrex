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

public class PanelA0800 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1734366195786126422L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbA0800;

	public PanelA0800() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(840, 75));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		final FlowLayout flowLayout_1 = new FlowLayout();
		flowLayout_1.setVgap(0);
		flowLayout_1.setHgap(0);
		panel.setLayout(flowLayout_1);

		panel.setBounds(0, 0, 840, 75);
		add(panel);

		final JxPanel panel_5_1 = new JxPanel();
		panel_5_1.setTheme(theme);
		panel_5_1.setLayout(null);
		panel_5_1.setPreferredSize(new Dimension(840, 75));
		panel.add(panel_5_1);

		final JxPanel panel_6_1 = new JxPanel();
		panel_6_1.setTheme(theme);
		final FlowLayout flowLayout_6 = new FlowLayout();
		flowLayout_6.setAlignment(FlowLayout.LEFT);
		panel_6_1.setLayout(flowLayout_6);
		panel_6_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel_5_1.add(panel_6_1);

		final JxLabel a0500Label_1 = new JxLabel();
		a0500Label_1.setTheme(theme);

		a0500Label_1.setFontSize(12);
		a0500Label_1.setFontStyle(Font.BOLD);
		a0500Label_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0500Label_1.setText("A0800. Gender");
		panel_6_1.add(a0500Label_1);

		final JxPanel panel_7_1 = new JxPanel();
		panel_7_1.setTheme(theme);
		panel_7_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		// panel_7_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
		// Mds3Constants.BORDER_SIZE_1, false));
		panel_7_1.setLayout(null);
		panel_7_1.setBounds(0, 25, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 50);
		panel_5_1.add(panel_7_1);

		final JxLabel enterCodeLabel_1 = new JxLabel();
		enterCodeLabel_1.setTheme(theme);
		enterCodeLabel_1.setText("Enter Code");
		enterCodeLabel_1.setBounds(15, 5, 54, 14);
		enterCodeLabel_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7_1.add(enterCodeLabel_1);

		cmbA0800 = new JxComboBox();
		cmbA0800.setTheme(theme);
		cmbA0800.setPreferredSize(new Dimension(50, 20));

		cmbA0800.setModel(new DefaultComboBoxModel(
				new String[] { "", "1", "2" }));
		cmbA0800.setBounds(15, 20, 50, 22);
		panel_7_1.add(cmbA0800);

		final JxPanel panel_8_1 = new JxPanel();
		panel_8_1.setTheme(theme);
		panel_8_1.setBorder(new LineBorder(Color.black, 1, false));

		panel_8_1.setLayout(null);
		panel_8_1.setBounds(79, 25, 761, 50);
		panel_5_1.add(panel_8_1);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);

		label_2.setFontSize(12);
		label_2.setFontStyle(Font.BOLD);
		label_2.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_2.setText("1. Male");
		label_2.setBounds(10, 8, 238, 14);
		panel_8_1.add(label_2);

		final JxLabel label_1_1 = new JxLabel();
		label_1_1.setTheme(theme);

		label_1_1.setFontSize(12);
		label_1_1.setFontStyle(Font.BOLD);
		label_1_1.setText("2. Female");
		label_1_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_1_1.setBounds(10, 28, 396, 14);
		panel_8_1.add(label_1_1);
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
		PanelA0800 panel = new PanelA0800();
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
		Object obj = cmbA0800.getSelectedItem();
		if (obj != null) {
			sectionA.setA0800((cmbA0800.getSelectedItem().toString()));
		} else {
			sectionA.setA0800("");
		}
	}

	public void doUpdate() {
		Mds3SectionA mds3SectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		cmbA0800.setSelectedItem(mds3SectionA.getA0800());

	}

}
