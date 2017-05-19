package com.sX.swing;

import java.awt.Color;
import java.awt.Graphics;

public class JxToggleBtn extends JxToggleButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3297782673341954444L;

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		if (super.rollOver) {
			this.setForeground(Color.WHITE);
		} else {

			if (this.isSelected()) {
				this.setForeground(Color.WHITE);
			} else {
				this.setForeground(new Color(0, 69, 97));
			}
		}

	}

	public JxToggleBtn(String text) {
		this.setText(text);
	}
}
