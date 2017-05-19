package com.sX.swing;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.border.LineBorder;

import medrex.commons.enums.ColorConstants;

import com.sX.awt.Direction;

public class PanelProgress extends JxPanel implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6058778380905214812L;
	private JLabel labelMsg2;
	static JProgressBar progressBar;
	static PanelProgress _this;

	public PanelProgress() {
		super();
		_this = this;
		setLayout(null);
		setSize(500, 250);
		setPreferredSize(getSize());
		setLinearGradient(new Color(140, 181, 200),
				ColorConstants.GradientBright, Direction.LEFT_TO_RIGHT);
		setCurvedView(false);
		final JLabel labelMsg1 = new JLabel();
		labelMsg1.setFont(new Font("Tahoma", Font.BOLD, 16));
		labelMsg1.setText("Saving Work In Progress Please Wait");
		labelMsg1.setForeground(ColorConstants.DEF_COLOR);
		labelMsg1.setBounds(113, 23, 327, 34);
		add(labelMsg1);

		labelMsg2 = new JLabel();
		labelMsg2.setText("");
		labelMsg2.setBounds(175, 76, 36, 34);
		labelMsg2.setFont(new Font("Tahoma", Font.BOLD, 16));
		labelMsg2.setForeground(ColorConstants.DEF_COLOR);
		add(labelMsg2);

		progressBar = new JProgressBar();
		progressBar.setBounds(67, 162, 391, 20);
		progressBar.setBorderPainted(true);
		progressBar.setBorder(new LineBorder(Color.BLACK));
		progressBar.setForeground(ColorConstants.DEF_COLOR);
		progressBar.setMaximum(100);
		progressBar.setMinimum(0);
		_this.add(progressBar);

		final JLabel labelMsg2_1 = new JLabel();
		labelMsg2_1.setText(" % completed");
		labelMsg2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		labelMsg2_1.setForeground(ColorConstants.DEF_COLOR);
		labelMsg2_1.setBounds(212, 76, 131, 34);

		_this.add(labelMsg2_1);

	}

	private static void createAndShowGUI() {
		JFrame aFrame = new JFrame("Work in Progress....");
		_this.callNotify();
		aFrame.getContentPane().add(_this);
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aFrame.pack();
		aFrame.setVisible(true);
	}

	public static void main(String args[]) {
		PanelProgress t = new PanelProgress();
		new Thread(t).start();
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

	private void callNotify() {
		synchronized (this) {
			notifyAll();
		}
	}

	public void run() {
		while (true) {
			try {
				synchronized (this) {
					wait();
				}
			} catch (InterruptedException e) {
			}
			for (int i = 0; i <= 100; i++) {
				_this.updateProgress(i);
				_this.updateText("" + i);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
				}
			}
		}
	}

	public void updateText(String text) {
		labelMsg2.setText(text);
	}

	public void updateProgress(int perc) {
		progressBar.setValue(perc);
		updateUI();
	}

	public String getTitle() {
		return "Testing";
	}
}