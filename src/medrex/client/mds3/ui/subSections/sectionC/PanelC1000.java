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

public class PanelC1000 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -523203463427955245L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmb1000;

	public PanelC1000() {
		super();
		setPreferredSize(new Dimension(840, 155));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panelC1000 = new JxPanel();
		panelC1000.setTheme(theme);
		panelC1000.setBackground(ColorConstants.MDS_FONT_COLOR);
		panelC1000.setLayout(null);
		panelC1000.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_2, false));
		panelC1000.setBounds(0, 0, 840, 150);
		add(panelC1000);

		final JxPanel panel_1_1_2_2 = new JxPanel();
		panel_1_1_2_2.setTheme(theme);
		panel_1_1_2_2.setBounds(5, 0, 830, 145);
		panel_1_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_2_2.setLayout(null);
		panel_1_1_2_2.setPreferredSize(new Dimension(830, 150));
		panelC1000.add(panel_1_1_2_2);

		final JxPanel panel_6_1_1_2 = new JxPanel();
		panel_6_1_1_2.setTheme(theme);
		panel_6_1_1_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		panel_6_1_1_2.setLayout(null);
		panel_6_1_1_2.setBounds(0, 25, 81, 120);
		panel_1_1_2_2.add(panel_6_1_1_2);

		final JxLabel enterCodeLabel_1_1 = new JxLabel();
		enterCodeLabel_1_1.setTheme(theme);
		enterCodeLabel_1_1.setText("Enter Code");
		enterCodeLabel_1_1.setBounds(15, 9, 54, 14);
		panel_6_1_1_2.add(enterCodeLabel_1_1);

		cmb1000 = new JxComboBox();
		cmb1000.setTheme(theme);
		cmb1000.setModel(new DefaultComboBoxModel(new String[] { "", "0", "1",
				"2", "3" }));

		cmb1000.setPreferredSize(new Dimension(50, 20));
		cmb1000.setBounds(17, 31, 50, 20);
		panel_6_1_1_2.add(cmb1000);

		final JxPanel panel_7_1_1_1 = new JxPanel();
		panel_7_1_1_1.setTheme(theme);

		panel_7_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		panel_7_1_1_1.setLayout(null);
		panel_7_1_1_1.setBounds(80, 25, 750, 120);
		panel_1_1_2_2.add(panel_7_1_1_1);

		final JxPanel panel_7_1_2_1 = new JxPanel();
		panel_7_1_2_1.setTheme(theme);
		panel_7_1_2_1.setOpaque(false);
		panel_7_1_2_1.setLayout(null);
		panel_7_1_2_1.setBounds(10, 3, 719, 108);
		panel_7_1_1_1.add(panel_7_1_2_1);

		final JxLabel aNationalProviderLabel_3_1_1_1 = new JxLabel();
		aNationalProviderLabel_3_1_1_1.setTheme(theme);

		aNationalProviderLabel_3_1_1_1.setFontSize(12);
		aNationalProviderLabel_3_1_1_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_3_1_1_1
				.setText("Made Decisions regarding tasks of daily life");
		aNationalProviderLabel_3_1_1_1.setBounds(10, 5, 706, 14);
		panel_7_1_2_1.add(aNationalProviderLabel_3_1_1_1);

		final JxLabel aNationalProviderLabel_1_3_1_2_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_2_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_2_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_2_1
				.setText("<html>0. &nbsp<b>Independant - </b> decisions consistent/reasonable");
		aNationalProviderLabel_1_3_1_2_1.setBounds(20, 25, 311, 14);
		panel_7_1_2_1.add(aNationalProviderLabel_1_3_1_2_1);

		final JxLabel aNationalProviderLabel_1_3_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_1_1_1
				.setText("<html>1. &nbsp <b>Modified independance - </b> some difficulty in new situations only");
		aNationalProviderLabel_1_3_1_1_1_1.setBounds(20, 45, 493, 14);
		panel_7_1_2_1.add(aNationalProviderLabel_1_3_1_1_1_1);

		final JxLabel aNationalProviderLabel_1_3_1_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_1_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_1_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_1_1_1_1
				.setText("<html>2. &nbsp<b>Moderately impaired - </b>decisions poor ; cues/ supervision required");
		aNationalProviderLabel_1_3_1_1_1_1_1.setBounds(20, 65, 493, 14);
		panel_7_1_2_1.add(aNationalProviderLabel_1_3_1_1_1_1_1);

		final JxLabel aNationalProviderLabel_1_3_1_1_1_1_2 = new JxLabel();
		aNationalProviderLabel_1_3_1_1_1_1_2.setTheme(theme);

		aNationalProviderLabel_1_3_1_1_1_1_2.setFontSize(12);
		aNationalProviderLabel_1_3_1_1_1_1_2
				.setText("<html>3. &nbsp<b>severely impaired - </b>never / rarely made decisions");
		aNationalProviderLabel_1_3_1_1_1_1_2.setBounds(20, 85, 493, 14);
		panel_7_1_2_1.add(aNationalProviderLabel_1_3_1_1_1_1_2);

		final JxPanel panel_5_1_1_2_2 = new JxPanel();
		panel_5_1_1_2_2.setTheme(theme);
		panel_5_1_1_2_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1_2_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		final FlowLayout flowLayout_19 = new FlowLayout();
		flowLayout_19.setHgap(10);
		flowLayout_19.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2_2.setLayout(flowLayout_19);
		panel_5_1_1_2_2.setPreferredSize(new Dimension(830, 30));
		panel_5_1_1_2_2.setBounds(0, 0, 830, 26);
		panel_1_1_2_2.add(panel_5_1_1_2_2);

		final JxLabel a0100Label_1_1_2_2 = new JxLabel();
		a0100Label_1_1_2_2.setTheme(theme);

		a0100Label_1_1_2_2.setFontSize(12);
		a0100Label_1_1_2_2.setFontStyle(Font.BOLD);
		a0100Label_1_1_2_2
				.setText("C1000.  Cognitive skills for daily Decision Making");
		panel_5_1_1_2_2.add(a0100Label_1_1_2_2);
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
		PanelC1000 panel = new PanelC1000();
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
		Object ob = cmb1000.getSelectedItem();
		if (ob != null) {
			sectionC.setC1000(cmb1000.getSelectedItem().toString());
		}
		sectionC.setC1000("");
	}

	public void doUpdate() {
		Mds3SectionC mds3sectionC = (Mds3SectionC) Mds3Controller.getInstance()
				.getSection(Mds3SectionC.class);
		cmb1000.setSelectedItem(mds3sectionC.getC1000());
	}
}
