package com.sX.temptheme;

import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.plaf.BorderUIResource.CompoundBorderUIResource;
import javax.swing.plaf.basic.BasicBorders;

public class ThemeUtil {

	TempTheme tempTheme;

	ThemeUtil(TempTheme tempTheme) {
		this.tempTheme = tempTheme;
	}

	public void setTheme(JTextField component, TempTheme tempTheme) {

		setDefault(component, tempTheme);
		component.setMargin(tempTheme.getMargin());
		component.setBorder(new CompoundBorderUIResource(tempTheme.getBorder(),
				new BasicBorders.MarginBorder()));

	}

	private void setDefault(JComponent component, TempTheme tempTheme) {
		component.setFont(tempTheme.getFont());
		component.setBackground(tempTheme.getBackground());
		component.setForeground(tempTheme.getForeground());
	}

	public void setTheme(JComponent component, TempTheme tempTheme) {

		setDefault(component, tempTheme);
	}

}
