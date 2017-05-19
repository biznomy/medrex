package com.sX.swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;

import javax.swing.JPopupMenu;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.sX.utils.ShapeUtils;

public class JxPopupMenu extends JPopupMenu {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2193584446320033645L;
	private Shape shape = null;
	private Shape i_popupShape = null;
	private float arc;
	private float scale;
	private Border $__border;

	public JxPopupMenu() {
		super();
		setFont(new Font("Font", Font.PLAIN, 12));
		arc = 1f;
		scale = (50f / 30f) * getFont().getSize2D();
	}

	@Override
	public void paint(Graphics g) {
		super.setOpaque(false);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		shape = ShapeUtils.getRoundedRectangle2D(0, 0, getWidth(), getHeight(),
				arc * scale, arc * scale);
		i_popupShape = ShapeUtils.getRoundedRectangle2D(0, 0, getWidth() - 1,
				getHeight() - 1, arc * scale, arc * scale);
		g2.setColor(this.getBackground());
		g2.fill(i_popupShape);

		// if(getBorderColor() != null) {
		// g2.setColor(this.getBorderColor());
		// g2.draw(shape);
		// }

		// super paint
		// g2.clip(shape);
		int margin = (int) Math.ceil((50f / 30f) * getFont().getSize2D() * arc
				/ 2) + 1;
		// System.out.println(margin);
		super.setBorder(new EmptyBorder(margin, getBorderThickness(), margin,
				getBorderThickness()));
		super.paint(g2);

		// draw line border
		if (getBorderColor() != null) {
			g2.setColor(this.getBorderColor());
			g2.draw(shape);
		}
		// super.paint(g2);
	}

	@Override
	public Border getBorder() {
		return null;
	}

	protected Color getBorderColor() {
		Border border = $__border;
		if (border instanceof LineBorder) {
			return ((LineBorder) border).getLineColor();
		}
		return null;
	}

	protected int getBorderThickness() {
		Border border = $__border;
		if (border instanceof LineBorder) {
			return ((LineBorder) border).getThickness();
		}
		return 1;
	}

	@Override
	public void setBorder(Border border) {
		super.setBorder(null);
		$__border = border;
	}

	/*
	 * protected void firePopupMenuCanceled() { super.firePopupMenuCanceled();
	 * This.firePopupMenuCanceled(); } protected void
	 * firePopupMenuWillBecomeInvisible() {
	 * super.firePopupMenuWillBecomeInvisible();
	 * This.firePopupMenuWillBecomeInvisible(); } protected void
	 * firePopupMenuWillBecomeVisible() {
	 * super.firePopupMenuWillBecomeVisible();
	 * This.firePopupMenuWillBecomeVisible(); }
	 */

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
