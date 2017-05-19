package medrex.client.loading;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;

import com.sX.awt.Direction;
import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;

public class FrameMedrexMessage extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4204389564395787564L;
	private static final Color DEF_COLOR = new Color(49, 104, 127);
	JLabel progressBar;
	private JxButton closeButton;
	private JLabel message;
	private JxButton okButton;
	private Color BORDER = new Color(171, 195, 203);

	public FrameMedrexMessage() {
		this("");
	}

	@Override
	public void setTitle(String title) {
		super.setTitle(title);
	}

	public FrameMedrexMessage(Window obj, String str) {
		super(obj);

	}

	public FrameMedrexMessage(String str) {
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
		setSize(700, 180);
		setPreferredSize(new Dimension(getSize()));

		final JxPanel panel = new JxPanel();
		panel.setArc(0f);
		panel.setBorder(new LineBorder(Color.black, 2, false));
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		add(panel);
		// progressBar.setBorder(new LineBorder(Color.black, 1, false));
		// progressBar.setBounds(55, 183, 391, 15);
		// // progressBar.setIndeterminate(true);
		// panel.add(progressBar);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(1, 1, 699, 53);
		panel_1.setCurvedView(false);
		panel_1.setLinearGradient(new Color(174, 197, 205),
				ColorConstants.GradientBright, Direction.LEFT_TO_RIGHT);
		panel_1.setBackground(Color.WHITE);
		panel.add(panel_1);

		final JLabel label = new JLabel(new ImageIcon(
				"img//medrexMediumLogo.png"));
		label.setBounds(0, 0, 151, 53);
		panel_1.add(label);

		closeButton = new JxButton();
		closeButton.setBackground(Color.WHITE);
		closeButton.setFont(new Font("", Font.BOLD, 14));
		closeButton.setArc(0.2f);
		closeButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				closeMe();
			}
		});
		closeButton.setText("X");
		closeButton.setBounds(673, 7, 20, 20);
		panel_1.add(closeButton);

		final JxPanel strip = new JxPanel();
		strip.setBounds(1, 55, 699, 24);
		strip.setCurvedView(false);
		strip.setLinearGradient(new Color(77, 128, 144), new Color(121, 159,
				171), Direction.RIGHT_TO_LEFT);
		panel.add(strip);

		message = new JLabel();
		message.setFont(new Font("", Font.BOLD, 17));
		message.setHorizontalAlignment(SwingConstants.CENTER);
		message.setForeground(ColorConstants.DEF_COLOR);
		message.setText(str);
		message.setBounds(10, 98, 690, 38);
		panel.add(message);

		okButton = new JxButton(0.6f);
		okButton.setText("OK");
		okButton.setBounds(301, 142, 102, 30);
		okButton.setPreferredSize(new Dimension(75, 35));
		okButton.setBorderPainted(false);
		okButton.setGlassyPainted(true);
		okButton.setBorder(new LineBorder(BORDER, 1));
		okButton.setBackground(new Color(115, 155, 168));
		okButton.setFont(new Font("", Font.BOLD, 12));
		okButton.setForeground(Color.WHITE);
		okButton.setRolloverEnabled(true);
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				closeMe();
			}
		});
		panel.add(okButton);
	}

	protected void closeMe() {
		this.dispose();

	}

	public void callNotify() {
		synchronized (this) {
			notifyAll();
		}
	}

	public static void main(String args[]) {
		try {
			FrameMedrexMessage dialog = new FrameMedrexMessage("My Message");
			dialog.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			SwingUtils.center(dialog);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// public void showLoadingAndExit() {
	// this.dispose();
	// }

}
