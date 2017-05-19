package medrex.client.mds3.ui.subSections.sectionB;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.enums.ColorConstants;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelSubHeader extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9205930757812337154L;
	Theme theme = new BlackOverWhiteTheme();

	public PanelSubHeader() {
		super();
		setPreferredSize(new Dimension(840, 78));
		setBackground(Color.WHITE);
		setLayout(null);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);
		panel_8.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_3, false));

		panel_8.setLayout(null);
		panel_8.setBounds(0, 0, 840, 67);
		add(panel_8);

		final JxPanel panel_9 = new JxPanel();
		panel_9.setTheme(theme);
		panel_9.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_9.setLayout(null);
		panel_9.setBounds(10, 10, 820, 47);
		panel_8.add(panel_9);

		final JxLabel lookBackPeriodLabel = new JxLabel();
		lookBackPeriodLabel.setFontSize(14);
		lookBackPeriodLabel.setTheme(theme);
		lookBackPeriodLabel.setForeground(ColorConstants.MDS_FONT_COLOR);

		lookBackPeriodLabel.setFontStyle(Font.BOLD);
		lookBackPeriodLabel
				.setText("Look back period for all items is 7 days unless another time frame is indicated");
		lookBackPeriodLabel.setBounds(44, 10, 735, 27);
		panel_9.add(lookBackPeriodLabel);

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
		PanelSubHeader panel = new PanelSubHeader();
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

	@Override
	public void doSave() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doUpdate() {
		// TODO Auto-generated method stub

	}

}
