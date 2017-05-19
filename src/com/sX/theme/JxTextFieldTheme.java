package com.sX.theme;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.BorderUIResource.CompoundBorderUIResource;
import javax.swing.plaf.basic.BasicBorders;

import com.sX.swing.JxText;

public class JxTextFieldTheme extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8451755051558338272L;
	public JxText blueWhite;
	public JxText blackWhite;
	public JxText mixed;
	private JPanel panel;
	private JPanel panel_1;

	public JxTextFieldTheme() {
		setSize(800, 600);
		setLayout(null);

		blueWhite = new JxText();
		blueWhite.setForeground(Color.BLUE);
		blueWhite.setFont(new Font("Arial", Font.BOLD, 12));
		blueWhite.setMargin(new Insets(0, 4, 0, 0));
		Border border = new CompoundBorderUIResource(
				new LineBorder(Color.BLUE), new BasicBorders.MarginBorder());
		blueWhite.setBorder(border);
		blueWhite.setBounds(10, 10, 100, 20);
		blueWhite.setText("Blue White");
		add(blueWhite);

		blackWhite = new JxText();
		blackWhite.setForeground(Color.BLACK);
		blackWhite.setFont(new Font("Tahoma", Font.BOLD, 12));
		blackWhite.setBorder(new LineBorder(Color.BLACK));
		blackWhite.setBounds(10, 40, 100, 20);
		blackWhite.setText("Black White");
		add(blackWhite);

		mixed = new JxText();
		mixed.setForeground(Color.GREEN);
		mixed.setFont(new Font("Times New Roman", Font.BOLD, 10));
		mixed.setBorder(new LineBorder(Color.orange));
		mixed.setBounds(10, 70, 100, 20);
		mixed.setText("Mixed");
		add(mixed);

		panel = new TrialPanel();
		panel.setBounds(142, 11, 538, 256);
		add(panel);

		panel_1 = new TrialPanel3();
		panel_1.setBounds(10, 272, 538, 149);
		add(panel_1);

		TrialPanel2 trialPanel2 = new TrialPanel2();
		trialPanel2.setBounds(156, 421, 538, 149);
		add(trialPanel2);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(800, 600);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.getContentPane().setSize(800, 600);
		f.getContentPane().add(new JxTextFieldTheme());
		f.setVisible(true);
	}
}
