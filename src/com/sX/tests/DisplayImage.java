package com.sX.tests;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DisplayImage extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5805948109863799961L;
	private static final Dimension MAIN_SIZE = new Dimension(250, 250);
	private static final String BUTTON_PANEL = "Button Panel";

	private JPanel mainPanel;

	private JPanel btnPanel = new JPanel();
	private JPanel tfPanel = new JPanel();

	private BorderLayout borderlayout = new BorderLayout();
	private JTextField tf;
	BasicStroke stroke = new BasicStroke(5f, BasicStroke.CAP_ROUND,
			BasicStroke.JOIN_BEVEL);
	private float numberX = 80f;
	private float numberY = 80f;
	private float numberSize = 10f;
	private float numberGap = 2f;

	public DisplayImage() {
		mainPanel = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1390399330173811634L;

			@Override
			public void paint(Graphics g) {
				super.paint(g);
				System.out.println("Inside Graphics");
				// Create an instance of Graphics2D
				Graphics2D g2D = (Graphics2D) g;
				g2D.setPaint(Color.RED);
				Font font = new Font("senrif", Font.BOLD, 24);
				g2D.setFont(font);
				g2D.drawString("Here", numberX % getWidth(), numberY
						% getHeight());
				numberX += 10;
				numberY += 10;

			}
		};
		setPreferredSize(MAIN_SIZE);
		setLayout(borderlayout);
		createTFPanel();
		createBtnPanel();
		add(tfPanel, BorderLayout.NORTH);
		add(btnPanel, BorderLayout.SOUTH);
		add(mainPanel, BorderLayout.CENTER);
	}

	private void createBtnPanel() {
		JButton startBtn = new JButton("Start");
		JButton stopBtn = new JButton("Stop");
		ActionListener actionListener = new BtnListener();

		startBtn.addActionListener(actionListener);
		stopBtn.addActionListener(actionListener);
		btnPanel.add(startBtn);
		btnPanel.add(stopBtn);
	}

	private void createTFPanel() {
		JLabel l = new JLabel("Enter Number of Seconds: ");
		tf = new JTextField(3);
		tfPanel.add(l);
		tfPanel.add(tf);
	}

	private class BtnListener implements ActionListener {
		java.util.Timer clockTimer;

		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equalsIgnoreCase("Start")) {
				java.util.TimerTask task = new java.util.TimerTask() {
					@Override
					public void run() {
						System.out.println("TimerTask");
						mainPanel.repaint();
					}
				};
				clockTimer = new java.util.Timer();
				clockTimer.schedule(task, 0L, 100L);
			}
			if (e.getActionCommand().equalsIgnoreCase("Stop")) {
				if (clockTimer != null) {
					clockTimer.cancel();
					clockTimer.purge();
				}
			}
		}
	}

	private static void createAndShowUI() {
		DisplayImage displayImage = new DisplayImage();
		JFrame frame = new JFrame("Display Image");
		// frame.getContentPane().add(displayImage.mainPanel);
		frame.getContentPane().add(displayImage, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.white);
		frame.pack();
		frame.setLocationRelativeTo(null); // center the windows
		frame.setVisible(true);
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				createAndShowUI();
			}
		});
	}
}
