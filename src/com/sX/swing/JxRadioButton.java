package com.sX.swing;

/**
 * @author Davinder S Naruka
 */
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JRadioButton;

import com.sX.theme.Theme;
import com.sX.theme.ThemeUtil;

public class JxRadioButton extends JRadioButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4748251511081865168L;
	Theme theme;

	public void setTheme(Theme theme) {
		this.theme = theme;
		(new ThemeUtil()).setTheme(this, theme);
	}

	public JxRadioButton() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JxRadioButton(Action arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public JxRadioButton(Icon arg0, boolean arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public JxRadioButton(Icon arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public JxRadioButton(String arg0, boolean arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public JxRadioButton(String arg0, Icon arg1, boolean arg2) {
		super(arg0, arg1, arg2);
		// TODO Auto-generated constructor stub
	}

	public JxRadioButton(String arg0, Icon arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public JxRadioButton(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setToolTipText(String text) {
		(new ThemeUtil()).setToolTipText(this, theme, text, false);
	}

	public void setFontStyle(int style) {
		(new ThemeUtil()).setFontStyle(this, style);
	}

	public void setFontSize(int size) {
		(new ThemeUtil()).setFontSize(this, size);
	}
}