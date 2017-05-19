package com.sX.theme;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JComponent;
import javax.swing.border.Border;

import com.sX.swing.JxText;

public abstract class ThemeImpl implements Theme {

	public Font defaultFont;
	public Color defaultBackgroundColor;
	public Color defaultForegroundColor;
	public Insets defaultMargin;
	public Border defaultBorder;

	public Color textFocusBorderColor;
	public Color textErrorBorderColor;

	public Font getFont(JComponent cmp) {
		return defaultFont;
	}

	public Color getBackgroundColor(JComponent cmp) {
		return defaultBackgroundColor;
	}

	public Color getForegroundColor(JComponent cmp) {
		return defaultForegroundColor;
	}

	public Insets getMargin(JComponent cmp) {
		return defaultMargin;
	}

	public Border getBorder(JComponent cmp) {
		return defaultBorder;
	}

	public Font getFont(JxText text) {
		return defaultFont;
	}

}
