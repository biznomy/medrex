package medrex.client.mds3.ui.subSections.sectionB;

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
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.mds3.SectionB.Mds3SectionB;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelB0100 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -74450337711772399L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbB0100;

	public PanelB0100() {
		super();
		setPreferredSize(new Dimension(840, 100));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBounds(0, 0, 840, 100);
		panel_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1.setLayout(null);

		panel_1.setPreferredSize(new Dimension(0, 0));
		add(panel_1);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setHgap(10);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_5.setLayout(flowLayout_2);

		panel_1.add(panel_5);

		final JxLabel a0100Label = new JxLabel();
		a0100Label.setTheme(theme);

		a0100Label.setFontSize(12);
		a0100Label.setFontStyle(Font.BOLD);
		a0100Label.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label.setText("B0100.  Comatose");
		panel_5.add(a0100Label);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setLayout(null);

		panel_1.add(panel_6);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);
		enterCodeLabel.setBounds(15, 10, 54, 14);
		enterCodeLabel.setText("Enter Code");
		panel_6.add(enterCodeLabel);

		cmbB0100 = new JxComboBox();
		cmbB0100.setTheme(theme);
		cmbB0100.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));

		cmbB0100.setBounds(15, 30, 50, 22);
		panel_6.add(cmbB0100);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY, 1,
				false));
		panel_7.setLayout(null);

		panel_7.setBounds(80, 24, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 75);
		panel_1.add(panel_7);

		final JxLabel aNationalProviderLabel = new JxLabel();
		aNationalProviderLabel.setTheme(theme);

		aNationalProviderLabel.setFontSize(12);
		aNationalProviderLabel.setFontStyle(Font.BOLD);
		aNationalProviderLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel
				.setText("Persistent vegetative state/no discernible consciousness");
		aNationalProviderLabel.setBounds(10, 5, 333, 14);
		panel_7.add(aNationalProviderLabel);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontSize(12);
		label.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label
				.setText("<html><body> 0. &nbsp <b>No--></b> Continue to B0200, Hearing");
		label.setBounds(25, 25, 219, 14);
		panel_7.add(label);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);

		label_1.setFontSize(12);
		label_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_1
				.setText("<html><body>1. &nbsp <b>Yes --></b> Skip to G0110, Activities of Daily Living(ADL) Assistance ");
		label_1.setBounds(25, 45, 395, 27);
		panel_7.add(label_1);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel_1.add(panel_2);

		final JxLabel b0200ComatoseLabel = new JxLabel();
		b0200ComatoseLabel.setTheme(theme);

		b0200ComatoseLabel.setFontSize(12);
		b0200ComatoseLabel.setFontStyle(Font.BOLD);
		b0200ComatoseLabel.setText("B0200.  Comatose");
		b0200ComatoseLabel.setBounds(10, 5, 657, 20);
		panel_2.add(b0200ComatoseLabel);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		// panel.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
		// Mds3Constants.BORDER_SIZE_1, false));
		panel.setBounds(0, 22, 80, 77);
		panel_1.add(panel);
		panel.setLayout(null);
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
		PanelB0100 panel = new PanelB0100();
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
		Mds3SectionB sectionB = (Mds3SectionB) Mds3Controller.getInstance()
				.getSection(Mds3SectionB.class);
		Object obj = cmbB0100.getSelectedItem();
		if (obj != null) {
			sectionB.setB0100(cmbB0100.getSelectedItem().toString());
		} else {
			sectionB.setB0100("");
		}
	}

	public void doUpdate() {
		Mds3SectionB mds3SectionB = (Mds3SectionB) Mds3Controller.getInstance()
				.getSection(Mds3SectionB.class);
		cmbB0100.setSelectedItem(mds3SectionB.getB0100());

	}

}
