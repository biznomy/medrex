package medrex.client.mds3.ui.commons;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;

import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class Mds3Header extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7243920582706843595L;
	Theme theme = new BlackOverWhiteTheme();
	private JxText txtResidentName;

	public Mds3Header() {
		super();
		setLayout(new BorderLayout());

		setOpaque(false);
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 40));
		setBackground(Color.WHITE);
		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);

		panel.setOpaque(false);
		panel.setLayout(null);
		add(panel);

		final JxLabel residentLabel = new JxLabel();
		residentLabel.setTheme(theme);

		residentLabel.setFontSize(12);
		residentLabel.setText("Resident");
		residentLabel.setBounds(0, 9, 56, 16);
		panel.add(residentLabel);

		txtResidentName = new JxText();
		txtResidentName.setTheme(theme);
		txtResidentName.setBounds(84, 10, 195, 22);
		panel.add(txtResidentName);

		final JxLabel residentLabel_1 = new JxLabel();
		residentLabel_1.setTheme(theme);

		residentLabel_1.setFontSize(12);
		residentLabel_1.setText("Identifier");
		residentLabel_1.setBounds(308, 10, 56, 16);
		panel.add(residentLabel_1);

		final JxText textField_1 = new JxText();
		textField_1.setTheme(theme);
		textField_1.setBounds(370, 10, 213, 22);
		panel.add(textField_1);

		final JxLabel residentLabel_1_1 = new JxLabel();
		residentLabel_1_1.setTheme(theme);

		residentLabel_1_1.setFontSize(12);
		residentLabel_1_1.setText("Date");
		residentLabel_1_1.setBounds(603, 10, 56, 16);
		panel.add(residentLabel_1_1);

		final JxDateChooser dcDate = new JxDateChooser();
		dcDate.setTheme(theme);

		dcDate.setBounds(648, 10, 192, 22);
		panel.add(dcDate);
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
		Mds3Header panel = new Mds3Header();
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

	}

	public void doUpdate() {

	}

}
