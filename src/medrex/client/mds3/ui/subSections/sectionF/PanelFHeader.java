package medrex.client.mds3.ui.subSections.sectionF;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelFHeader extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2148728148963745883L;
	Theme theme = new BlackOverWhiteTheme();

	public PanelFHeader() {
		super();
		setBackground(Color.WHITE);
		setOpaque(true);
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 30));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setOpaque(false);
		panel.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		add(panel);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setLayout(null);
		panel_3.setBackground(Mds3Constants.BACKGROUND_DARKGRAY);
		panel_3.setBounds(0, 0, 230, 25);
		panel.add(panel_3);

		final JxLabel sectionALabel = new JxLabel();
		sectionALabel.setFontSize(14);
		sectionALabel.setTheme(theme);
		sectionALabel.setBounds(10, 0, 72, 25);
		sectionALabel.setForeground(Color.WHITE);

		sectionALabel.setFontStyle(Font.BOLD);
		sectionALabel.setText("Section F");
		panel_3.add(sectionALabel);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);
		panel_4.setLayout(null);
		panel_4.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_4.setBounds(230, 0, 610, 25);
		panel.add(panel_4);

		final JxLabel identificationInformationLabel = new JxLabel();
		identificationInformationLabel.setFontSize(14);
		identificationInformationLabel.setTheme(theme);
		identificationInformationLabel.setBounds(5, 2, 385, 25);
		identificationInformationLabel
				.setForeground(Mds3Constants.FONT_COLOR_DARKGRAY);

		identificationInformationLabel.setFontStyle(Font.BOLD);
		identificationInformationLabel
				.setHorizontalAlignment(SwingConstants.LEFT);
		identificationInformationLabel
				.setText("Preferences for Coustomary Routine and Activities");
		panel_4.add(identificationInformationLabel);

	}

	@Override
	public void doSave() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doUpdate() {
		// TODO Auto-generated method stub

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
		PanelFHeader panel = new PanelFHeader();
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
