/**
 * 
 */
package com.sX.swing;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

/**
 * @author Dev
 * 
 */
public class JxBlinkLabel extends JLabel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7762676881680488056L;
	private boolean blinking;
	private Timer blinker;
	private String tempText;
	private boolean blinkIt;

	/**
	 * 
	 */
	public JxBlinkLabel() {
		this("", null, SwingConstants.LEADING);
	}

	/**
	 * @param arg0
	 */
	public JxBlinkLabel(String lbl) {
		this(lbl, null, SwingConstants.LEADING);
	}

	/**
	 * @param arg0
	 */
	public JxBlinkLabel(Icon icon) {
		this("", icon, SwingConstants.LEADING);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public JxBlinkLabel(String lbl, int align) {
		this(lbl, null, align);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public JxBlinkLabel(Icon icon, int align) {
		this("", icon, align);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 */
	public JxBlinkLabel(String lbl, Icon icon, int align) {
		super(lbl, icon, align);
		blinker = new Timer(200, new ActionListener() {
			// private boolean blinkIt;
			public void actionPerformed(ActionEvent e) {
				// if(! ("").equalsIgnoreCase(getText())) {
				// tempText = getText();
				// }
				// if(blinkIt) {
				// setText("");
				// } else {
				// setText(tempText);
				// }
				blinkIt = !blinkIt;
				// System.out.println("repainting");
				repaint();
			}
		});
		blinker.setRepeats(true);
		blinker.setInitialDelay(0);
	}

	@Override
	public void paint(Graphics g) {
		if (!blinking || (blinking && blinkIt)) {
			super.paint(g);
		}

	}

	/**
	 * @param blinking
	 *            the blinking to set
	 */
	public void setBlinking(boolean blinking) {
		this.blinking = blinking;
		if (blinking) {
			blinker.start();
		} else {
			blinker.stop();
		}
	}

	/**
	 * @return the blinking
	 */
	public boolean isBlinking() {
		return blinking;
	}

}
