package com.sX.swing;

import javax.swing.Icon;
import javax.swing.JLabel;

import com.sX.theme.Theme;
import com.sX.theme.ThemeUtil;

public class JxLabel extends JLabel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7713813148242006299L;

	public JxLabel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JxLabel(Icon image, int horizontalAlignment) {
		super(image, horizontalAlignment);
		// TODO Auto-generated constructor stub
	}

	public JxLabel(Icon image) {
		super(image);
		// TODO Auto-generated constructor stub
	}

	public JxLabel(String text, Icon icon, int horizontalAlignment) {
		super(text, icon, horizontalAlignment);
		// TODO Auto-generated constructor stub
	}

	public JxLabel(String text, int horizontalAlignment) {
		super(text, horizontalAlignment);
		// TODO Auto-generated constructor stub
	}

	public JxLabel(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	Theme theme;

	@Override
	public void setIcon(Icon icon) {
		super.setIcon(icon);
	}

	@Override
	public void setVisible(boolean visible) {
		if (visible) {
			// fireSetImage();
		}
		super.setVisible(visible);
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

// protected void fireWindowOpened() {
// WindowEvent windowEvent = new WindowEvent(this, WindowEvent.WINDOW_OPENED);
// WindowListener[] listeners = getWindowListeners();
// for(WindowListener l : listeners) {
// l.windowOpened(windowEvent);
// }
// }
// protected void fireSetImage() {
// MouseEvent mouseEvent = new MouseEvent();
// MouseListener[] listeners = getMouseListeners();
// for(MouseListener l : listeners) {
// l.mouseClicked(mouseEvent);
// }
// }
// }
