package com.sX.swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;

import javax.swing.Box;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class JxSheet extends JxFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 886157219873824902L;
	private TransparentBackground background;
	private Container _contentPane;
	private Container sheetPane;
	private JPanel $_glassPane;

	private class TransparentBackground extends JComponent implements Runnable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1009035572374849673L;
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
				bgUpdater.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(0);
			} finally {
				run();
			}
		}
	}

	public JxSheet() {
		super();
		background = new TransparentBackground(this);
		background.setLayout(null);
		setUndecorated(false);
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		background.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		// getLayeredPane().add("Center", background);
		// getLayeredPane().setVisible(true);
		// super.getContentPane().setLayout(new BorderLayout());
		// super.getContentPane().add(background, BorderLayout.CENTER);
		super.getContentPane().add("Center", background);
		// _contentPane = new JPanel();
		// _contentPane.setLayout(null);
		// ((JPanel) _contentPane).setOpaque(true);
		// background.add(_contentPane, BorderLayout.CENTER);
		$_glassPane = (JPanel) this.getGlassPane();
		sheetPane = new JPanel();
		sheetPane.setSize(600, 480);
		setSheetPane(sheetPane);
	}

	// public Container getContentPane() {
	// System.out.println("Content Pane: ");
	// return this._contentPane;
	// }
	//	
	// public void setContentPane(Container contentPane) {
	// this._contentPane = contentPane;
	// }

	public Container getSheetPane() {
		return this.sheetPane;
	}

	public void setSheetPane(Container sheet) {
		$_glassPane.remove(sheetPane);
		sheetPane = null;
		sheetPane = sheet;
		sheetPane.setLayout(null);
		sheetPane.setBackground(Color.WHITE);
		// sheetPane.setBounds(Utils.centerRectangle($_glassPane.getBounds(),
		// sheetPane.getBounds()));
		sheetPane.setBackground(Color.red);

		$_glassPane.setLayout(new GridBagLayout());
		((JComponent) sheetPane).setBorder(new LineBorder(Color.black, 1));
		// $_glassPane.removeAll();
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.CENTER;
		// $_glassPane.add (sheetPane, gbc);
		background.add(sheetPane, gbc);
		gbc.gridy = 1;
		gbc.weighty = Integer.MAX_VALUE;
		// $_glassPane.add (Box.createGlue(), gbc);
		background.add(Box.createGlue(), gbc);
		$_glassPane.setVisible(true);
	}
}
