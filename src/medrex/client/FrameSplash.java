package medrex.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

import medrex.client.constants.Global;

import com.sX.swing.JxFrame;

public class FrameSplash extends JxFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblVersion;
	private JLabel lblCurrentVersion;

	/**
	 * Launch the application
	 * 
	 * @param args
	 */

	/**
	 * Create the frame
	 */
	public FrameSplash() {
		super();
		setAlwaysOnTop(true);
		setSize(400, 275);
		getContentPane().setLayout(new BorderLayout());
		getContentPane().setBackground(new Color(0, 153, 153));
		setTitle("Long Term Care");
		setUndecorated(true);
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Double xx = new Double((screen.getWidth() - 400) / 2);
		Double yy = new Double((screen.getHeight() - 275) / 2);

		setLocation(xx.intValue(), yy.intValue());

		final JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(SystemColor.desktop, 8, false));
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(1024, 768));
		panel.setBackground(new Color(232, 240, 245));
		getContentPane().add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBounds(24, 10, 360, 257);
		panel_1.setLayout(null);
		panel_1.setPreferredSize(new Dimension(400, 300));
		panel_1.setBackground(new Color(232, 240, 245));
		panel.add(panel_1);

		final JLabel ltcLabel = new JLabel(new ImageIcon("img/medrexLogo.png"));
		ltcLabel.setBackground(new Color(232, 240, 245));
		ltcLabel.setBounds(26, -8, 287, 177);
		panel_1.add(ltcLabel);

		final JLabel initializingPleaseLabel = new JLabel();
		initializingPleaseLabel.setForeground(SystemColor.desktop);
		initializingPleaseLabel.setFont(new Font("", Font.BOLD, 16));
		initializingPleaseLabel
				.setText("<html><p>Initializing ... Please Wait ...<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Version&nbsp;&nbsp;&nbsp;"
						+ Global.clientversion + "</p></html>");
		initializingPleaseLabel.setBounds(75, 200, 234, 47);
		panel_1.add(initializingPleaseLabel);
	}
}
