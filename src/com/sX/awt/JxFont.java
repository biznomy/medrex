/**
 * 
 */
package com.sX.awt;

import java.awt.Font;
import java.text.AttributedCharacterIterator.Attribute;
import java.util.Map;

/**
 * @author Dev
 * 
 */
public class JxFont extends Font {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8050898430728908547L;

	/**
	 * @param attributes
	 */
	public JxFont(Map<? extends Attribute, ?> attributes) {
		super(attributes);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param style
	 * @param size
	 */
	public JxFont(String name, int style, int size) {
		super(name, style, size);
		// TODO Auto-generated constructor stub
	}

	public JxFont(Font font, double incSize) {
		this(font.getName(), font.getStyle(), (int) (incSize == 0 ? font
				.getSize() : font.getSize() * incSize));
	}
}
