package com.sX.swing;

import java.util.Date;

import com.sX.theme.Theme;
import com.sX.theme.ThemeUtil;
import com.toedter.calendar.IDateEditor;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

public class JxDateChooser extends JDateChooser {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6847883451730100999L;
	Theme theme;

	public JxDateChooser() {
		super();
		super.setDateFormatString("MM/DD/YYYY");
		// TODO Auto-generated constructor stub
	}

	public JxDateChooser(Date arg0, String arg1, IDateEditor arg2) {
		super(arg0, arg1, arg2);
		// TODO Auto-generated constructor stub
	}

	public JxDateChooser(Date arg0, String arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public JxDateChooser(Date arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public JxDateChooser(IDateEditor arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public JxDateChooser(JCalendar arg0, Date arg1, String arg2,
			IDateEditor arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	public JxDateChooser(String arg0, String arg1, char arg2) {
		super(arg0, arg1, arg2);
		// TODO Auto-generated constructor stub
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
		(new ThemeUtil()).setTheme(this, theme);
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
