/**
 * 
 */
package com.sX.swing;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JComponent;
import javax.swing.JScrollBar;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicArrowButton;

/**
 * @author D S Naruka
 * 
 */
public class JxScrollBar extends JScrollBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4417885245437732520L;
	private float scale;
	private float arcx;
	private float arcy;
	private Color gradientColor1;
	private Color gradientColor2;
	private Border __border;
	private BasicArrowButton arrowUp;
	private BasicArrowButton arrowDown;

	/**
	 * 
	 */
	public JxScrollBar() {
		this(JScrollBar.VERTICAL);
	}

	/**
	 * @param orientation
	 */
	public JxScrollBar(int orientation) {
		this(orientation, 0, 10, 0, 100);
	}

	/**
	 * @param orientation
	 * @param value
	 * @param extent
	 * @param min
	 * @param max
	 */
	public JxScrollBar(int orientation, int value, int extent, int min, int max) {
		super(orientation, value, extent, min, max);
		arcx = 1;
		arcy = 1;
		super.setOpaque(true);
		setGradientColor1(getBackground().brighter());
		setGradientColor2(getBackground().darker());
		// arrowUp = (BasicArrowButton) getComponent(0);
		// arrowDown = (BasicArrowButton) getComponent(1);
		// arrowUp.setOpaque(false);
		// arrowDown.setOpaque(false);
		// arrowUp.setVisible(false);
		// arrowDown.setVisible(false);
		super.setBorder(null);
	}

	/**
	 * @param g
	 */
	@Override
	public void paintComponent(Graphics g) {
		super.setBorder(null);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		scale = (50f / 30f) * this.getFont().getSize2D();
		drawScrollBar(g2, 0, 0, getWidth(), getHeight(), scale, arcx * scale,
				arcy * scale);
	}

	private void drawScrollBar(Graphics2D g2, int i, int j, int w, int h,
			float scale2, float arcx, float arcy) {
		drawTrack(g2, 0, 0, w, h, scale, arcx, arcy);
	}

	protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {

		g.drawRect((int) thumbBounds.getX(), (int) thumbBounds.getY(),
				(int) thumbBounds.getWidth(), (int) thumbBounds.getHeight());// (scrollbarthumb.getImage(),(int)thumbBounds.getX(),
		// (int)thumbBounds.getY(),
		// null);
	}

	// private void drawThumb(Graphics2D g2, int i, int j, int w, int h,
	// float scale2, float arcx, float arcy) {
	// // TODO Auto-generated method stub
	//
	// }

	private void drawTrack(Graphics2D g2, int x, int y, int width, int height,
			float scale, float arcx, float arcy) {
		Color base_B = getGradientColor1();
		Color base_D = getGradientColor2();
		int inset = (int) (scale * 0.04f);
		int w = width - inset * 2 - 1;
		int h = height - (int) (scale * 0.1f) - 1;

		// drawing track
		GradientPaint bg = new GradientPaint(new Point(x, y), base_B,
				new Point(x, h), base_D);
		g2.setPaint(bg);
		g2.fill(getRoundedRectangle(g2, x, y, w, h, scale, arcx, arcy));
		g2.setColor(getBorderColor());
		g2.setStroke(new BasicStroke(getBorderWidth()));
		g2.draw(getRoundedRectangle(g2, x, y, w, h, scale, arcx, arcy));
	}

	private float getBorderWidth() {
		Border border = getBorder();
		if (border != null) {
			if (border instanceof LineBorder) {
				return ((LineBorder) border).getThickness();
			}
		}
		return 1f;
	}

	private Color getBorderColor() {
		Border border = __border;
		if (border != null) {
			if (border instanceof LineBorder) {
				return ((LineBorder) border).getLineColor();
			}
		}
		return new Color(0, 0, 0, 150);
	}

	private Color alphaColor(Color c, int alpha) {
		return new Color(c.getRed(), c.getGreen(), c.getBlue(), alpha);
	}

	private Shape getRoundedRectangle(Graphics2D g2, int x, int y, int w,
			int h, float scale2, float arcx, float arcy) {
		return new RoundRectangle2D.Float(x, y, w, h, arcx, arcy);
	}

	/**
	 * @param gradientColor1
	 *            the gradientColor1 to set
	 */
	public void setGradientColor1(Color gradientColor1) {
		this.gradientColor1 = gradientColor1;
	}

	/**
	 * @return the gradientColor1
	 */
	public Color getGradientColor1() {
		return gradientColor1;
	}

	/**
	 * @param gradientColor2
	 *            the gradientColor2 to set
	 */
	public void setGradientColor2(Color gradientColor2) {
		this.gradientColor2 = gradientColor2;
	}

	/**
	 * @return the gradientColor2
	 */
	public Color getGradientColor2() {
		return gradientColor2;
	}

	/**
	 * @return the border
	 */
	@Override
	public Border getBorder() {
		return null;
	}

	/**
	 * @param border
	 *            the border to set
	 */
	@Override
	public void setBorder(Border border) {
		super.setBorder(null);
		__border = border;
	}

	/**
	 * @return the arcx
	 */
	public float getArcx() {
		return arcx;
	}

	/**
	 * @param arcx
	 *            the arcx to set
	 */
	public void setArcx(float arcx) {
		this.arcx = arcx;
	}

	/**
	 * @return the arcy
	 */
	public float getArcy() {
		return arcy;
	}

	/**
	 * @param arcy
	 *            the arcy to set
	 */
	public void setArcy(float arcy) {
		this.arcy = arcy;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new JxScrollBar();
	}
}