package com.sX.swing;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class JxFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6375246330084475996L;

	// Boolean oldValue,newValue;
	public JxFrame() {
		super();
	}

	@Override
	public void setVisible(boolean visible) {
		// addWindowListener(new WindowListener(){
		// public void windowActivated(WindowEvent e) {
		// // TODO Auto-generated method stub
		//				
		// }
		//
		// @Override
		// public void windowClosed(WindowEvent e) {
		// System.out.println("Window Closed");
		// FrameFactory.removeFromStack();
		// }
		//
		// @Override
		// public void windowClosing(WindowEvent e) {
		// // TODO Auto-generated method stub
		//				
		// }
		//
		// @Override
		// public void windowDeactivated(WindowEvent e) {
		// // TODO Auto-generated method stub
		//				
		// }
		//
		// @Override
		// public void windowDeiconified(WindowEvent e) {
		// // TODO Auto-generated method stub
		//				
		// }
		//
		// @Override
		// public void windowIconified(WindowEvent e) {
		// // TODO Auto-generated method stub
		//				
		// }
		//
		// @Override
		// public void windowOpened(WindowEvent e) {
		// System.out.println("Window Opened");
		// FrameFactory.addInStack(JxFrame.this);
		// }
		//			
		// });
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
