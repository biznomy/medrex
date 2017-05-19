package com.sX.utils;

import java.awt.Rectangle;

public class Utils {
	public static Rectangle centerRectangle(Rectangle viewPort,
			Rectangle toBeCentered) {
		Rectangle result = new Rectangle();
		result.x = (viewPort.width - toBeCentered.width) / 2;
		result.y = (viewPort.height - toBeCentered.height) / 2;
		result.width = toBeCentered.width;
		result.height = toBeCentered.height;
		return result;
	}
}
