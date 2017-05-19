package com.sX.temptheme;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.border.Border;

public interface TempTheme {

	Font getFont();

	Border getBorder();

	Insets getMargin();

	Color getForeground();

	Color getBackground();

}
