package com.sX.swing;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JDialog;

public class JxDialog extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1183275185715146749L;

	// Boolean oldValue,newValue;
	public JxDialog() {
		super();
	}

	@Override
	public void setVisible(boolean visible) {
		if (visible) {
			fireWindowOpened();
		}
		super.setVisible(visible);
	}

	protected void fireWindowOpened() {
		WindowEvent windowEvent = new WindowEvent(this,
				WindowEvent.WINDOW_OPENED);
		WindowListener[] listeners = getWindowListeners();
		for (WindowListener l : listeners) {
			l.windowOpened(windowEvent);
		}
	}
}
