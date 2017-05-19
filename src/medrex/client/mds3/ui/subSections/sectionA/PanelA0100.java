package medrex.client.mds3.ui.subSections.sectionA;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

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

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelA0100 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8821606018106389313L;
	private JxText txtSPN;
	private JxText txtCMS;
	private JxText txtNPI;
	Theme theme = new BlackOverWhiteTheme();

	public PanelA0100() {
		super();
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 180));
		setBackground(Color.WHITE);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBorder(new LineBorder(Color.black, 1, false));

		panel.setLayout(null);
		// panel.setBounds(5, 0, 840, 180);
		add(panel);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setHgap(10);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_5.setLayout(flowLayout_2);
		panel_5.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5.setBounds(0, 0, 840, 25);
		panel.add(panel_5);

		final JxLabel a0100Label = new JxLabel();
		a0100Label.setTheme(theme);

		a0100Label.setFontSize(12);
		a0100Label.setFontStyle(Font.BOLD);
		a0100Label.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label.setText("A0100. Facility Provider Numbers");
		panel_5.add(a0100Label);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		// panel_6.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
		// Mds3Constants.BORDER_SIZE_1, false));
		panel_6.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6.setBounds(0, 24, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 157);
		panel.add(panel_6);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_7.setLayout(null);

		panel_7.setBounds(79, 24, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 157);
		panel.add(panel_7);

		final JxLabel aNationalProviderLabel = new JxLabel();
		aNationalProviderLabel.setTheme(theme);
		aNationalProviderLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		aNationalProviderLabel.setFontSize(12);
		aNationalProviderLabel.setFontStyle(Font.BOLD);
		aNationalProviderLabel.setText("A. National Provider Identifier(NPI)");
		aNationalProviderLabel.setBounds(10, 5, 206, 14);
		panel_7.add(aNationalProviderLabel);

		txtNPI = new JxText();
		txtNPI.setTheme(theme);
		txtNPI.setBounds(25, 28, 206, 20);
		panel_7.add(txtNPI);

		final JxLabel aNationalProviderLabel_1 = new JxLabel();
		aNationalProviderLabel_1.setTheme(theme);
		aNationalProviderLabel_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		aNationalProviderLabel_1.setFontSize(12);
		aNationalProviderLabel_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_1.setText("B.  CMS Certification Number(CCN):");
		aNationalProviderLabel_1.setBounds(10, 54, 206, 14);
		panel_7.add(aNationalProviderLabel_1);

		txtCMS = new JxText();
		txtCMS.setTheme(theme);
		txtCMS.setBounds(25, 74, 248, 20);
		panel_7.add(txtCMS);

		final JxLabel aNationalProviderLabel_1_1 = new JxLabel();
		aNationalProviderLabel_1_1.setTheme(theme);
		aNationalProviderLabel_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		aNationalProviderLabel_1_1.setFontSize(12);
		aNationalProviderLabel_1_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_1_1.setText("C.  State Provider Number : ");
		aNationalProviderLabel_1_1.setBounds(10, 102, 206, 14);
		panel_7.add(aNationalProviderLabel_1_1);

		txtSPN = new JxText();
		txtSPN.setTheme(theme);
		txtSPN.setBounds(25, 122, 341, 20);
		panel_7.add(txtSPN);

		doUpdate();

	}

	public void doSave() {
		Mds3SectionA sectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		sectionA.setA0100A((txtNPI.getText()));
		sectionA.setA0100B(txtCMS.getText());
		sectionA.setA0100C(txtSPN.getText());

	}

	public void doUpdate() {
		Mds3SectionA mds3SectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		txtNPI.setText(mds3SectionA.getA0100A());
		txtCMS.setText(mds3SectionA.getA0100B());
		txtSPN.setText(mds3SectionA.getA0100C());

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
		PanelA0100 panel = new PanelA0100();
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
