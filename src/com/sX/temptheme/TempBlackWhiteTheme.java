package com.sX.temptheme;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class TempBlackWhiteTheme implements TempTheme {

	@Override
	public Color getBackground() {

		return Color.WHITE;
	}

	@Override
	public Border getBorder() {
		return new LineBorder(getForeground());

	}

	@Override
	public Font getFont() {
		return new Font("Arial", Font.PLAIN, 18);
	}

	@Override
	public Color getForeground() {
		return Color.BLACK;
	}

	@Override
	public Insets getMargin() {
		return new Insets(0, 4, 0, 0);
	}

}
