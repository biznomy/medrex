package com.sX.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class JxTransparentDialog extends JxFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3649488018487121444L;
	private TransparentBackground background;

	private class TransparentBackground extends JComponent implements Runnable {
		/**
		 * 
		 */
		private static final long serialVersionUID = -4569176634743783650L;
		private JFrame frame;
		private Image background;
		private Thread bgUpdater;
		private Robot robot;
		private Toolkit toolkit;

		public TransparentBackground(JFrame frame) {
			try {
				this.frame = frame;
				robot = new Robot();
				toolkit = Toolkit.getDefaultToolkit();
				updateBackground();
				bgUpdater = new Thread(this);
				bgUpdater.start();
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(0);
			}
		}

		public void updateBackground() {
			try {
				// Robot robot = new Robot();
				// Toolkit toolkit = Toolkit.getDefaultToolkit();
				Dimension dim = toolkit.getScreenSize();
				background = robot.createScreenCapture(new Rectangle(0, 0,
						(int) dim.getWidth(), (int) dim.getHeight()));
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(0);
			}
		}

		@Override
		public void paintComponent(Graphics g) {
			Point pos = this.getLocationOnScreen();
			Point offset = new Point(-pos.x, -pos.y);
			g.drawImage(background, offset.x, offset.y, null);
		}

		public void run() {
			repaint();
			// paintImmediately(frame.getBounds());
			// System.out.println("update");
			try {
				bgUpdater.sleep(1);
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(0);
			} finally {
				run();
			}
		}
	}

	public static void main(String[] args) {
		JxTransparentDialog frame = new JxTransparentDialog();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		// TransparentBackground bg = new JxTransparentDialog().new
		// TransparentBackground(frame);
		// bg.setLayout(new BorderLayout( ));
		// JButton button = new JButton("This is a button");
		// frame.getContentPane().add("North",button);
		// JLabel label = new JLabel("This is a label");
		// frame.getContentPane().add("South",label);
		frame.pack();
		frame.setSize(450, 450);
		frame.setVisible(true);
	}

	public JxTransparentDialog() {
		super();
		background = new TransparentBackground(this);
		background.setLayout(new BorderLayout());
		// getLayeredPane().add("Center", background);
		// getLayeredPane().setVisible(true);
		getContentPane().add("Center", background);
	}
}
