package medrex.client.loading;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

import medrex.commons.enums.ColorConstants;

import com.sX.awt.Direction;
import com.sX.swing.JxPanel;

public class FrameLoading extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6751122389326621364L;
	private static final Color DEF_COLOR = new Color(49, 104, 127);
	JLabel progressBar;

	public FrameLoading() {
		this("");
	}

	@Override
	public void setTitle(String title) {
		super.setTitle(title);
	}

	public FrameLoading(Window obj, String str) {
		super(obj);
		/*
		 * setBackground(Color.WHITE); // setBackground(new Color(232,240,245));
		 * setBackground(new Color(191,203,214)); setLayout(null);
		 * setAlwaysOnTop(true); setUndecorated(true); // (new
		 * LineBorder(Color.BLACK)); setModal(true); callNotify(); pack();
		 * getContentPane().setLayout(new BorderLayout());
		 * setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); Dimension
		 * screen = Toolkit.getDefaultToolkit().getScreenSize(); Double xx = new
		 * Double((screen.getWidth() - 226) / 2); Double yy = new
		 * Double((screen.getHeight() - 135) / 2);
		 * 
		 * setLocation(xx.intValue(), yy.intValue()); setSize(260, 135);
		 * setPreferredSize(new Dimension(getSize()));
		 * 
		 * final JxPanel panel = new JxPanel(); //
		 * panel.setBackground(Color.WHITE); // panel.(new Color(232,240,245));
		 * // panel.setBackground(new Color(191,203,214)); panel.setBounds(10,
		 * 10, 249, 115); panel.setCurvedView(false);
		 * panel.setLinearGradient(ColorConstants.GradientDark,
		 * ColorConstants.GradientBright, Direction.RIGHT_TO_LEFT);
		 * panel.setLayout(null);
		 * 
		 * add(panel);
		 * 
		 * final JLabel pleasWaitLabel = new JLabel();
		 * pleasWaitLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		 * pleasWaitLabel.setText(str); pleasWaitLabel.setBounds(73, 10, 113,
		 * 35); pleasWaitLabel.setForeground(DEF_COLOR);
		 * panel.add(pleasWaitLabel);
		 * 
		 * final JxPanel panel_1 = new JxPanel(); // panel_1.setBackground(new
		 * Color(232,240,245)); // panel_1.setBackground(Color.WHITE); //
		 * panel_1.setBackground(new Color(191,203,214)); panel_1.setBounds(2,
		 * 2, 256, 35); panel.setCurvedView(false);
		 * panel_1.setLinearGradient(ColorConstants.GradientDark,
		 * ColorConstants.GradientBright, Direction.RIGHT_TO_LEFT); final
		 * FlowLayout flowLayout = new FlowLayout();
		 * flowLayout.setAlignment(FlowLayout.LEFT);
		 * panel_1.setLayout(flowLayout);
		 * 
		 * panel.add(panel_1);
		 * 
		 * progressBar = new JProgressBar(); progressBar.setBounds(27, 111, 202,
		 * 14); progressBar.setIndeterminate(true); panel.add(progressBar);
		 * 
		 * final JxPanel strip = new JxPanel(); strip.setBounds(0, 28, 260, 13);
		 * strip.setCurvedView(false);
		 * strip.setLinearGradient(ColorConstants.GradientDark,
		 * ColorConstants.GradientBright, Direction.LEFT_TO_RIGHT);
		 * panel.add(strip);
		 */
	}

	public FrameLoading(String str) {
		// super(obj);
		setBackground(Color.WHITE);
		setLayout(null);
		setAlwaysOnTop(true);
		setUndecorated(true);
		setModal(true);
		callNotify();
		pack();
		getContentPane().setLayout(new BorderLayout());
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Double xx = new Double((screen.getWidth() - 180) / 2);
		Double yy = new Double((screen.getHeight() - 100) / 2);
		setTitle(this.getTitle());
		setLocation(xx.intValue(), yy.intValue());
		setSize(260, 135);
		setPreferredSize(new Dimension(getSize()));

		final JxPanel panel = new JxPanel();
		panel.setArc(0f);
		// panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setBorder(new LineBorder(Color.black, 2, false));
		// panel.setLinearGradient(new Color(174,197,205),
		// ColorConstants.GradientBright, Direction.RIGHT_TO_LEFT);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		add(panel);

		final JLabel pleasWaitLabel = new JLabel();
		pleasWaitLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		pleasWaitLabel.setText(str);
		pleasWaitLabel.setBounds(55, 55, 195, 30);
		pleasWaitLabel.setForeground(DEF_COLOR);
		panel.add(pleasWaitLabel);

		progressBar = new JLabel(new ImageIcon("img//ProgressBar1.gif"));
		progressBar.setBorder(new LineBorder(Color.black, 1, false));
		progressBar.setBounds(55, 95, 156, 15);
		// progressBar.setIndeterminate(true);
		panel.add(progressBar);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(1, 1, 257, 30);
		panel_1.setCurvedView(false);
		panel_1.setLinearGradient(new Color(174, 197, 205),
				ColorConstants.GradientBright, Direction.LEFT_TO_RIGHT);
		panel_1.setBackground(Color.WHITE);
		panel.add(panel_1);

		final JLabel label = new JLabel(new ImageIcon(
				"img//medrexSmallLogo.png"));
		label.setBounds(0, 0, 86, 25);
		panel_1.add(label);

		final JxPanel strip = new JxPanel();
		strip.setBounds(1, 30, 257, 19);
		strip.setCurvedView(false);
		strip.setLinearGradient(new Color(77, 128, 144), new Color(121, 159,
				171), Direction.RIGHT_TO_LEFT);
		panel.add(strip);
	}

	public void callNotify() {
		synchronized (this) {
			notifyAll();
		}
	}

	public static void main(String args[]) {
		try {
			FrameLoading dialog = new FrameLoading();
			dialog.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// public void showLoadingAndExit() {
	// this.dispose();
	// }

}
