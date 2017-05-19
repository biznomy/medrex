package com.sX.swing;

import javax.swing.JTextArea;
import javax.swing.text.Document;

import com.sX.theme.Theme;
import com.sX.theme.ThemeUtil;

public class JxTextA extends JTextArea {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3744697121420834619L;
	Theme theme;

	public JxTextA() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JxTextA(Document doc, String text, int rows, int columns) {
		super(doc, text, rows, columns);
		// TODO Auto-generated constructor stub
	}

	public JxTextA(Document doc) {
		super(doc);
		// TODO Auto-generated constructor stub
	}

	public JxTextA(int rows, int columns) {
		super(rows, columns);
		// TODO Auto-generated constructor stub
	}

	public JxTextA(String text, int rows, int columns) {
		super(text, rows, columns);
		// TODO Auto-generated constructor stub
	}

	public JxTextA(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setToolTipText(String text) {
		(new ThemeUtil()).setToolTipText(this, theme, text, false);
	}

	public void setFontStyle(int style) {
		(new ThemeUtil()).setFontStyle(this, style);
	}

	public void setFontSize(float size) {
		(new ThemeUtil()).setFontSize(this, size);
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
		(new ThemeUtil()).setTheme(this, theme);
	}

}
