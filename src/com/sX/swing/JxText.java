package com.sX.swing;

/**
 * @author Davinder S Naruka
 */
import java.text.Format;

import javax.swing.JFormattedTextField;

import com.sX.theme.Theme;
import com.sX.theme.ThemeUtil;

public class JxText extends JFormattedTextField {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5618758833034235314L;
	Theme theme;

	public JxText(AbstractFormatter arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public JxText(AbstractFormatterFactory arg0, Object arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public JxText(AbstractFormatterFactory arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public JxText(Format arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public JxText(Object arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
		(new ThemeUtil()).setTheme(this, theme);
	}

	public JxText() {
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

	@Override
	public void setText(String text) {
		super.setText(text);
		super.setSelectionStart(0);
		super.setSelectionEnd(0);

	}

}