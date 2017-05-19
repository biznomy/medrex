package com.sX.theme;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sX.swing.JxButton;

public class JxButtonTheme extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1052331993651227416L;
	public JxButton blueWhite;
	public JxButton blackWhite;
	public JxButton mixed;

	public JxButtonTheme() {
		setSize(800, 600);
		setLayout(null);

		blueWhite = new JxButton();
		blueWhite.setForeground(Color.YELLOW);
		blueWhite.setBackground(Color.BLUE);
		blueWhite.setFont(new Font("Arial", Font.BOLD, 12));
		blueWhite.setBounds(10, 10, 100, 20);
		blueWhite.setText("Blue White");
		blueWhite.setArc(3);
		add(blueWhite);

		blackWhite = new JxButton();
		blackWhite.setForeground(Color.WHITE);
		blackWhite.setBackground(Color.BLACK);
		blackWhite.setFont(new Font("Tahom", Font.BOLD, 12));
		blackWhite.setBounds(10, 40, 100, 20);
		blackWhite.setText("Black White");
		blackWhite.setArc(0);
		add(blackWhite);

		mixed = new JxButton();
		mixed.setForeground(Color.ORANGE);
		mixed.setBackground(Color.RED);
		mixed.setFont(new Font("Arial", Font.BOLD, 8));
		mixed.setBounds(10, 70, 100, 20);
		mixed.setText("Orange White");
		mixed.setArc(5);
		add(mixed);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(800, 600);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.getContentPane().setSize(800, 600);
		f.getContentPane().add(new JxButtonTheme());
		f.setVisible(true);
	}

}
