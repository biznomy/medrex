package medrex.client.mds3.ui.subSections.sectionA;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.mds3.SectionA.Mds3SectionA;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelA0310F extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4148940354702789650L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbA0310F;

	public PanelA0310F() {
		super();
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 124));
		setBackground(Color.WHITE);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);

		panel.setOpaque(false);
		panel.setLayout(null);
		// panel.setBounds(0, 0, 840, 820);
		add(panel);

		final JxPanel panel_7_1_1_1_1_2 = new JxPanel();
		panel_7_1_1_1_1_2.setTheme(theme);

		panel_7_1_1_1_1_2.setOpaque(false);
		panel_7_1_1_1_1_2.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		panel_7_1_1_1_1_2.setLayout(null);
		panel_7_1_1_1_1_2.setBounds(79, 0,
				Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 124);
		panel.add(panel_7_1_1_1_1_2);

		final JxLabel aNationalProviderLabel_2_1_1_2_2 = new JxLabel();
		aNationalProviderLabel_2_1_1_2_2.setTheme(theme);
		aNationalProviderLabel_2_1_1_2_2
				.setText("<html><body><b>F. Entry / Discharge reporting");
		aNationalProviderLabel_2_1_1_2_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_2_1_1_2_2.setBounds(10, 5, 422, 14);
		panel_7_1_1_1_1_2.add(aNationalProviderLabel_2_1_1_2_2);

		final JxLabel aNationalProviderLabel_1_2_1_1_2_2 = new JxLabel();
		aNationalProviderLabel_1_2_1_1_2_2.setTheme(theme);
		aNationalProviderLabel_1_2_1_1_2_2
				.setText("<html><body>01. <b>Entry Record</b>");
		aNationalProviderLabel_1_2_1_1_2_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_2_1_1_2_2.setBounds(32, 25, 342, 14);
		panel_7_1_1_1_1_2.add(aNationalProviderLabel_1_2_1_1_2_2);

		final JxLabel aNationalProviderLabel_1_1_1_1_6_1_2 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_6_1_2.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_6_1_2
				.setText("<html><body>10. <b>Discharge </b>assessment-<b> return not anticipated Record</b>");
		aNationalProviderLabel_1_1_1_1_6_1_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_6_1_2.setBounds(32, 45, 342, 14);
		panel_7_1_1_1_1_2.add(aNationalProviderLabel_1_1_1_1_6_1_2);

		final JxLabel aNationalProviderLabel_1_1_1_1_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_1_1_1_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_1_1_1_1
				.setText("<html><body>11. <b>Discharge </b>assessment-<b> return anticipated Record</b>");
		aNationalProviderLabel_1_1_1_1_1_1_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_1_1_1_1.setBounds(32, 65, 383, 14);
		panel_7_1_1_1_1_2.add(aNationalProviderLabel_1_1_1_1_1_1_1_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_2_1_2_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_2_1_2_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_2_1_2_1
				.setText("<html><body>12. <b>Death in facility</b> record</b>");
		aNationalProviderLabel_1_1_1_1_2_1_2_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_2_1_2_1.setBounds(32, 85, 617, 14);
		panel_7_1_1_1_1_2.add(aNationalProviderLabel_1_1_1_1_2_1_2_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_2_1_2_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1
				.setText("<html><body>99. <b>Not entry/ discharge</b> record</b>");
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1.setBounds(32, 105, 617, 14);
		panel_7_1_1_1_1_2.add(aNationalProviderLabel_1_1_1_1_2_1_2_1_1);

		final JxPanel panel_6_1_1 = new JxPanel();
		panel_6_1_1.setTheme(theme);
		panel_6_1_1.setLayout(null);
		// panel_6_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
		// 1, false));
		panel_6_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1_1.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 124);
		panel.add(panel_6_1_1);

		final JxLabel enterCodeLabel_1 = new JxLabel();
		enterCodeLabel_1.setTheme(theme);
		enterCodeLabel_1.setBounds(16, 9, 54, 14);
		enterCodeLabel_1.setText("Enter Code");
		panel_6_1_1.add(enterCodeLabel_1);

		cmbA0310F = new JxComboBox();
		cmbA0310F.setTheme(theme);
		cmbA0310F.setBounds(15, 31, 50, 22);

		cmbA0310F.setModel(new DefaultComboBoxModel(new String[] { "", "01",
				"10", "11", "12", "99" }));
		cmbA0310F.setPreferredSize(new Dimension(50, 20));
		panel_6_1_1.add(cmbA0310F);

		doUpdate();
	}

	public void doSave() {
		Mds3SectionA sectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		Object obj = cmbA0310F.getSelectedItem();
		if (obj != null) {
			sectionA.setA0310F((cmbA0310F.getSelectedItem().toString()));
		} else {
			sectionA.setA0310F("");
		}
	}

	@Override
	public void doUpdate() {
		Mds3SectionA mds3SectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		cmbA0310F.setSelectedItem(mds3SectionA.getA0310F());
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
		PanelA0310F panel = new PanelA0310F();
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

}
