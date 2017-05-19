package medrex.client.mds3.ui.subSections.sectionC;

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
import medrex.commons.vo.mds3.SectionC.Mds3SectionC;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelC0700 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8677380183896976206L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbC0700;

	public PanelC0700() {
		super();
		setPreferredSize(new Dimension(840, 170));
		setBackground(Color.WHITE);
		setLayout(null);

		final JxPanel panelc0700 = new JxPanel();
		panelc0700.setTheme(theme);
		panelc0700.setLayout(null);
		panelc0700.setPreferredSize(new Dimension(840, 180));
		panelc0700.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panelc0700.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_2, false));
		panelc0700.setBounds(0, 0, 840, 170);
		add(panelc0700);

		final JxPanel panel_5_1_1_1 = new JxPanel();
		panel_5_1_1_1.setTheme(theme);
		panel_5_1_1_1.setBounds(5, 5, 830, 30);
		panel_5_1_1_1.setLayout(null);
		panelc0700.add(panel_5_1_1_1);
		panel_5_1_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		panel_5_1_1_1.setPreferredSize(new Dimension(820, 30));

		final JxLabel a0100Label_1_1_1 = new JxLabel();
		a0100Label_1_1_1.setTheme(theme);
		a0100Label_1_1_1.setBounds(11, 6, 202, 15);

		a0100Label_1_1_1.setFontSize(12);
		a0100Label_1_1_1.setFontStyle(Font.BOLD);
		a0100Label_1_1_1.setText("Staff Assessment for Mental Status");
		panel_5_1_1_1.add(a0100Label_1_1_1);

		final JxPanel panel_5_1_1_3 = new JxPanel();
		panel_5_1_1_3.setTheme(theme);
		panel_5_1_1_3.setBounds(5, 35, 830, 30);

		panel_5_1_1_3.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		final FlowLayout flowLayout_12 = new FlowLayout();
		flowLayout_12.setHgap(10);
		flowLayout_12.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_3.setLayout(flowLayout_12);
		panel_5_1_1_3.setPreferredSize(new Dimension(820, 30));
		panelc0700.add(panel_5_1_1_3);

		final JxLabel a0100Label_1_1_3 = new JxLabel();
		a0100Label_1_1_3.setTheme(theme);
		panel_5_1_1_3.add(a0100Label_1_1_3);

		a0100Label_1_1_3.setFontSize(12);
		a0100Label_1_1_3
				.setText("Do Not Conduct if brief interview for mental status (c0200-C0500 ) was completed");

		final JxPanel panel_5_1_1 = new JxPanel();
		panel_5_1_1.setTheme(theme);
		panel_5_1_1.setBounds(5, 65, 830, 25);
		panel_5_1_1.setPreferredSize(new Dimension(820, 25));
		panel_5_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_5 = new FlowLayout();
		flowLayout_5.setHgap(10);
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_5_1_1.setLayout(flowLayout_5);
		panelc0700.add(panel_5_1_1);

		final JxLabel a0100Label_1_1 = new JxLabel();
		a0100Label_1_1.setTheme(theme);

		a0100Label_1_1.setFontSize(12);
		a0100Label_1_1.setFontStyle(Font.BOLD);
		a0100Label_1_1.setText("C0700. Short Term Memory OK");
		panel_5_1_1.add(a0100Label_1_1);

		final JxPanel panel_1_1 = new JxPanel();
		panel_1_1.setTheme(theme);
		panel_1_1.setBounds(5, 90, 830, 80);
		panelc0700.add(panel_1_1);

		panel_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1_1.setLayout(null);
		panel_1_1.setPreferredSize(new Dimension(820, 80));

		final JxPanel panel_6_1 = new JxPanel();
		panel_6_1.setTheme(theme);
		panel_6_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_9 = new FlowLayout();
		flowLayout_9.setVgap(8);
		panel_6_1.setLayout(flowLayout_9);
		panel_6_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1.setBounds(0, 0, 81, 80);
		panel_1_1.add(panel_6_1);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);
		enterCodeLabel.setText("Enter Code");
		panel_6_1.add(enterCodeLabel);

		cmbC0700 = new JxComboBox();
		cmbC0700.setTheme(theme);
		cmbC0700.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));

		cmbC0700.setPreferredSize(new Dimension(50, 20));
		panel_6_1.add(cmbC0700);

		final JxPanel panel_7_1 = new JxPanel();
		panel_7_1.setTheme(theme);
		panel_7_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));

		panel_7_1.setLayout(null);
		panel_7_1.setBounds(80, 0, 750, 80);
		panel_1_1.add(panel_7_1);

		final JxLabel aNationalProviderLabel_3_1 = new JxLabel();
		aNationalProviderLabel_3_1.setTheme(theme);

		aNationalProviderLabel_3_1.setFontSize(12);
		aNationalProviderLabel_3_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_3_1
				.setText("Seems or appear to recall after 5 minutes");
		aNationalProviderLabel_3_1.setBounds(10, 5, 706, 14);
		panel_7_1.add(aNationalProviderLabel_3_1);

		final JxLabel aNationalProviderLabel_1_3_1 = new JxLabel();
		aNationalProviderLabel_1_3_1.setTheme(theme);
		aNationalProviderLabel_1_3_1
				.setText("<html><body>0.   &nbsp <b>Memory OK");
		aNationalProviderLabel_1_3_1.setBounds(20, 25, 311, 14);
		panel_7_1.add(aNationalProviderLabel_1_3_1);

		final JxLabel aNationalProviderLabel_1_3_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_1.setTheme(theme);
		aNationalProviderLabel_1_3_1_1
				.setText("<html><body>1. &nbsp <b>Memory Problem");
		aNationalProviderLabel_1_3_1_1.setBounds(20, 45, 311, 14);
		panel_7_1.add(aNationalProviderLabel_1_3_1_1);
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
		PanelC0700 panel = new PanelC0700();
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
		Mds3SectionC sectionC = (Mds3SectionC) Mds3Controller.getInstance()
				.getSection(Mds3SectionC.class);
		Object ob = cmbC0700.getSelectedItem();
		if (ob != null) {
			sectionC.setC0700(cmbC0700.getSelectedItem().toString());
		} else {
			sectionC.setC0700("");
		}
	}

	public void doUpdate() {
		Mds3SectionC mds3sectionC = (Mds3SectionC) Mds3Controller.getInstance()
				.getSection(Mds3SectionC.class);
		cmbC0700.setSelectedItem(mds3sectionC.getC0700());
	}

}
