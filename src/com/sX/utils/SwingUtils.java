package com.sX.utils;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class SwingUtils {
	public static Rectangle centerRectangle(Rectangle viewPort,
			Rectangle toBeCentered) {
		Rectangle result = new Rectangle();
		result.x = (viewPort.width - toBeCentered.width) / 2;
		result.y = (viewPort.height - toBeCentered.height) / 2;
		result.width = toBeCentered.width;
		result.height = toBeCentered.height;
		return result;
	}

	/* for testing & debugging phase only */
	public static JFrame wrapInFrame(JComponent com) {
		return wrapInFrame(com, "Test Window");
	}

	public static JFrame wrapInFrame(JComponent com, String title) {
		JFrame f = new JFrame(title);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Dimension size = getComponentSize(com);
		f.setSize(size.width + 10, size.height + 30);
		f.getContentPane().add(com, BorderLayout.CENTER);
		return f;
	}

	public static Dimension getComponentSize(JComponent com) {
		Dimension retSize = new Dimension();
		Dimension exSize, prSize;
		exSize = com.getSize();
		prSize = com.getPreferredSize();
		retSize.width = (exSize.width != 0) ? exSize.width : prSize.width;
		retSize.height = (exSize.height != 0) ? exSize.height : prSize.height;
		return retSize;
	}

}
