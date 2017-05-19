package com.sX.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class JxTransparentFrame extends JxFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5163949266870953178L;
	private TransparentBackground background;

	private class TransparentBackground extends JComponent implements Runnable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 7047403929066696734L;
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
			System.out.println("update");
			try {
				bgUpdater.sleep(1);
				run();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Transparent Window");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		TransparentBackground bg = new JxTransparentFrame().new TransparentBackground(
				frame);
		bg.setLayout(new BorderLayout());
		JButton button = new JButton("This is a button");
		bg.add("North", button);
		JLabel label = new JLabel("This is a label");
		bg.add("South", label);
		frame.getContentPane().add("Center", bg);
		frame.pack();
		frame.setSize(450, 450);
		frame.setVisible(true);
	}

	public JxTransparentFrame() {
		super();
		background = new TransparentBackground(this);
		background.setLayout(new BorderLayout());
		getLayeredPane().add("Center", background);
	}
}
