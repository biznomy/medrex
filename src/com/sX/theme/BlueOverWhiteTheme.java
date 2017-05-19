package com.sX.theme;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.border.LineBorder;

public class BlueOverWhiteTheme extends ThemeImpl {

	public BlueOverWhiteTheme() {
		super.defaultFont = new Font("Arial", Font.PLAIN, 11);
		super.defaultBackgroundColor = Color.WHITE;
		super.defaultForegroundColor = new Color(49, 104, 127);
		super.defaultMargin = new Insets(0, 4, 0, 0);
		super.defaultBorder = new LineBorder(super.defaultForegroundColor);
	}

}
