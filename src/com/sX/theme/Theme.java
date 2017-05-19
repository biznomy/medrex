package com.sX.theme;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JComponent;
import javax.swing.border.Border;

import com.sX.swing.JxText;

public interface Theme {

	public Font getFont(JxText text);

	public Font getFont(JComponent cmp);

	public Color getBackgroundColor(JComponent cmp);

	public Color getForegroundColor(JComponent cmp);

	public Insets getMargin(JComponent cmp);

	public Border getBorder(JComponent cmp);
}
