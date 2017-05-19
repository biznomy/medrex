package com.sX.swing;

import java.awt.Font;
import java.awt.Shape;

import javax.swing.JComponent;

public class JxComponent extends JComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4627021362847803321L;
	protected float arc;
	protected float scale;
	protected Shape shape;

	public JxComponent() {
		super();
		setFont(new Font("Font", Font.PLAIN, 12));
		arc = 1f;
		scale = (50f / 30f) * getFont().getSize2D();
	}

	@Override
	public void setFont(Font font) {
		super.setFont(font);
		if (font != null) {
			scale = (50f / 30f) * font.getSize2D();
		}
	}

	/**
	 * @return the arc
	 */
	public float getArc() {
		return arc;
	}

	/**
	 * @param arc
	 *            the arc to set
	 */
	public void setArc(float arc) {
		this.arc = arc;
	}

	/**
	 * @return the scale
	 */
	public float getScale() {
		return scale;
	}

	/**
	 * @param scale
	 *            the scale to set
	 */
	public void setScale(float scale) {
		this.scale = scale;
	}

	/**
	 * @return the shape
	 */
	public Shape getShape() {
		return shape;
	}

	/**
	 * @param shape
	 *            the shape to set
	 */
	public void setShape(Shape shape) {
		this.shape = shape;
	}
}
