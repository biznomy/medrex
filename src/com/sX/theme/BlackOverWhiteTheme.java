package com.sX.theme;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.border.LineBorder;

public class BlackOverWhiteTheme extends ThemeImpl {

	public BlackOverWhiteTheme() {
		super.defaultFont = new Font("Arial", Font.PLAIN, 11);
		super.defaultBackgroundColor = Color.WHITE;
		super.defaultForegroundColor = Color.BLACK;
		super.defaultMargin = new Insets(0, 4, 0, 0);
		super.defaultBorder = new LineBorder(super.defaultForegroundColor);
	}

}
