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

public class PanelC0600 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3558472072773822478L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbC0600;

	public PanelC0600() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(840, 105));
		setBackground(Color.WHITE);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);
		panel_8.setLayout(null);
		panel_8.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_3, false));
		panel_8.setBounds(0, 0, 840, 100);
		panel_8.setPreferredSize(new Dimension(840, 110));
		add(panel_8);

		final JxPanel panel_1_2 = new JxPanel();
		panel_1_2.setTheme(theme);
		panel_1_2.setBounds(10, 10, 820, 80);

		panel_8.add(panel_1_2);
		panel_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1_2.setLayout(null);
		panel_1_2.setPreferredSize(new Dimension(820, 80));

		final JxPanel panel_5_2 = new JxPanel();
		panel_5_2.setTheme(theme);
		panel_5_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_7 = new FlowLayout();
		flowLayout_7.setHgap(10);
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		panel_5_2.setLayout(flowLayout_7);
		panel_5_2.setBounds(0, 0, 820, 25);
		panel_1_2.add(panel_5_2);

		final JxLabel a0100Label_2 = new JxLabel();
		a0100Label_2.setTheme(theme);

		a0100Label_2.setFontSize(12);
		a0100Label_2.setFontStyle(Font.BOLD);
		a0100Label_2
				.setText("C0600. Should the Staff Assessment for mental status(C0700-C1000) be Conducted?");
		panel_5_2.add(a0100Label_2);

		final JxPanel panel_6_2 = new JxPanel();
		panel_6_2.setTheme(theme);

		panel_6_2.setLayout(null);
		panel_6_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_2.setBounds(0, 24, 84, 56);
		panel_1_2.add(panel_6_2);

		final JxLabel enterCodeLabel_2 = new JxLabel();
		enterCodeLabel_2.setTheme(theme);
		enterCodeLabel_2.setText("Enter Code");
		enterCodeLabel_2.setBounds(10, 10, 54, 14);
		panel_6_2.add(enterCodeLabel_2);

		cmbC0600 = new JxComboBox();
		cmbC0600.setTheme(theme);
		cmbC0600.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));

		cmbC0600.setPreferredSize(new Dimension(50, 20));
		cmbC0600.setBounds(10, 30, 50, 20);
		panel_6_2.add(cmbC0600);

		final JxPanel panel_7_2 = new JxPanel();
		panel_7_2.setTheme(theme);
		panel_7_2.setOpaque(false);
		panel_7_2.setLayout(null);
		panel_7_2.setBounds(91, 30, 699, 47);
		panel_1_2.add(panel_7_2);

		final JxLabel aNationalProviderLabel_3 = new JxLabel();
		aNationalProviderLabel_3.setTheme(theme);
		aNationalProviderLabel_3
				.setText("<html><body>0.<b>  No </b>(the resident was unable to complete the interview) skip to C1300, signs and symptoms of delirium");
		aNationalProviderLabel_3.setBounds(10, 5, 607, 14);
		panel_7_2.add(aNationalProviderLabel_3);

		final JxLabel aNationalProviderLabel_1_3 = new JxLabel();
		aNationalProviderLabel_1_3.setTheme(theme);
		aNationalProviderLabel_1_3
				.setText("<html><body>1. <b>Yes</b> (the resident was unable to complete the interview) Continue to C0700 , Short term memory OK");
		aNationalProviderLabel_1_3.setBounds(10, 25, 679, 14);
		panel_7_2.add(aNationalProviderLabel_1_3);
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
		PanelC0600 panel = new PanelC0600();
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
		Object obj = cmbC0600.getSelectedItem();
		if (obj != null) {
			sectionC.setC0600(cmbC0600.getSelectedItem().toString());
		} else {
			sectionC.setC0600("");
		}
	}

	@Override
	public void doUpdate() {
		Mds3SectionC mds3sectionC = (Mds3SectionC) Mds3Controller.getInstance()
				.getSection(Mds3SectionC.class);
		cmbC0600.setSelectedItem(mds3sectionC.getC0600());
	}
}
