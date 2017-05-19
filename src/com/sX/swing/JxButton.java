/**
 * 
 */
package com.sX.swing;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import com.sX.theme.Theme;
import com.sX.theme.ThemeUtil;

/**
 * @author D S Naruka <BR>
 *         <A
 *         href="mailto:dsn.naruka@@gmail.com">mailto:dsn.naruka@@gmail.com</A>
 * 
 */
public class JxButton extends JButton { // implements MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -879355362034437728L;
	protected boolean pressed;
	protected boolean rollOver;
	protected Border border;
	protected float scale;
	protected float arc;
	protected boolean borderPainted;
	protected boolean glassyPainted;
	Theme theme;

	/**
	 * 
	 */
	public JxButton() {
		this("", null);
	}

	public JxButton(float arc) {
		this();
		setArc(arc);
	}

	/**
	 * @param icon
	 */
	public JxButton(Icon icon) {
		this("", icon);
	}

	/**
	 * @param text
	 */
	public JxButton(String text) {
		this(text, null);
	}

	/**
	 * @param a
	 */
	public JxButton(Action a) {
		super(a);
		// this.addMouseListener(this);
		super.setBorderPainted(false);
		setArc(1f);
		setOpaque(false);
	}

	/**
	 * @param text
	 * @param icon
	 */
	public JxButton(String text, Icon icon) {
		super(text, icon);
		// this.addMouseListener(this);
		super.setBorderPainted(false);
		setArc(0f);
		setOpaque(false);
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

	private void construct() {
		String text = getText();
		FontMetrics fm = this.getFontMetrics(getFont());
		float scale = (50f / 30f) * this.getFont().getSize2D();
		int w = fm.stringWidth(text);
		w += (int) (scale * 1.4f);
		int h = fm.getHeight();
		h += (int) (scale * .3f);

		setPreferredSize(new Dimension(w, h));
	}

	@Override
	protected void processMouseEvent(MouseEvent e) {
		super.processMouseEvent(e);
		switch (e.getID()) {
		case MouseEvent.MOUSE_ENTERED:
			rollOver = (true && isEnabled());
			this.repaint();
			break;
		case MouseEvent.MOUSE_EXITED:
			rollOver = (false && isEnabled());
			this.repaint();
			break;
		case MouseEvent.MOUSE_PRESSED:
			pressed = true;
			break;
		case MouseEvent.MOUSE_RELEASED:
			if (pressed && rollOver) {
				super.processMouseEvent(new MouseEvent((Component) e
						.getSource(), MouseEvent.MOUSE_CLICKED, e.getWhen(), e
						.getModifiers(), e.getX(), e.getY(), 1, e
						.isPopupTrigger(), e.getButton()));
			}
			pressed = false;
			break;
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
	 * @return the borderPainted
	 */
	@Override
	public boolean isBorderPainted() {
		return borderPainted;
	}

	/**
	 * @param borderPainted
	 *            the borderPainted to set
	 */
	@Override
	public void setBorderPainted(boolean borderPainted) {
		super.setBorderPainted(false);
		this.borderPainted = borderPainted;
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
		this.border = border;
	}

	/**
	 * @param glassyPainted
	 *            the glassyPainted to set
	 */
	public void setGlassyPainted(boolean glassyPainted) {
		this.glassyPainted = glassyPainted;
	}

	/**
	 * @return the glassyPainted
	 */
	public boolean isGlassyPainted() {
		return glassyPainted;
	}

	@Override
	protected void paintComponent(Graphics g) {
		setOpaque(false);
		// super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		// g2.setColor(this.getBackground());
		// g2.fillRect(0,0,this.getWidth(),this.getHeight());

		scale = (50f / 30f) * this.getFont().getSize2D();

		// g2.clip(new RoundRectangle2D.Float((-.04f)*scale, (.02f)*scale,
		// this.getWidth()+.08f*scale, this.getHeight()+0.08f*scale, scale*.6f,
		// scale*.4f));

		drawLiquidButton(this.getBackground(), this.getWidth(), this
				.getHeight(), getText(), scale, arc * scale, arc * scale, g2);

	}

	protected void drawLiquidButton(Color base, int width, int height,
			String text, float scale, float arcx, float arcy, Graphics2D g2) {

		// calculate inset
		int inset = (int) (scale * 0.04f);
		int w = width - inset * 2 - 1;
		int h = height - (int) (scale * 0.1f) - 1;

		// drawDropShadow(w,h,scale,arcx * 1.04f,arcy * 1.04f,g2);

		g2.translate(inset, 0);
		if (pressed) {
			g2.translate(0, 0.06f * scale);
		}

		drawButtonBody(w, h, scale, base, arcx, arcy, g2);
		drawText(w, h, scale, text, g2);
		if (glassyPainted) {
			drawHighlight(w, h, scale, base, arcx * 0.8f, arcy * 0.4f, g2);
		}
		drawBorder(w, h, scale, arcx, arcy, g2);

		if (pressed) {
			g2.translate(0, 0.06f * scale);
		}
		g2.translate(-inset, 0);
	}

	protected void drawDropShadow(int w, int h, float scale, float arcx,
			float arcy, Graphics2D g2) {
		g2.setColor(new Color(0, 0, 0, 50));
		fillRoundRect(g2, (-.04f) * scale, (.02f) * scale, w + .08f * scale, h
				+ 0.08f * scale, arcx, arcy);
		g2.setColor(new Color(0, 0, 0, 100));
		fillRoundRect(g2, 0, 0.06f * scale, w, h, arcx, arcy);
	}

	protected void drawButtonBody(int w, int h, float scale, Color base,
			float arcx, float arcy, Graphics2D g2) {

		Color grad_top = base.brighter();
		Color grad_bot = base.darker();
		GradientPaint bg = null;
		if (rollOver) {
			bg = new GradientPaint(new Point(0, 0), grad_top, new Point(0, h),
					grad_bot);
		} else {
			bg = new GradientPaint(new Point(0, 0), base, new Point(0, h), base);
		}
		g2.setPaint(bg);
		this.fillRoundRect(g2, (0) * scale, (0) * scale, w, h, arcx, arcy);

		// draw the inner color
		// Color inner = base.brighter();
		// inner = alphaColor(inner,75);
		// g2.setColor(inner);
		// this.fillRoundRect(g2,
		//
		// scale*(.4f),
		// scale*(.4f),
		// w-scale*.8f, h-scale*.5f,
		// arcx*.6f,arcy*.4f);
	}

	// generate the alpha version of the specified color
	protected static Color alphaColor(Color color, int alpha) {
		return new Color(color.getRed(), color.getGreen(), color.getBlue(),
				alpha);
	}

	protected void drawText(int w, int h, float scale, String text,
			Graphics2D g2) {

		// calculate the width and height
		int fw = g2.getFontMetrics().stringWidth(text);
		int fh = g2.getFontMetrics().getAscent(); // +
		// g2.getFontMetrics().getDescent()
		// + //
		// g2.getFontMetrics(getFont()).getHeight();
		int textx = 0;
		int texty = h / 2 + fh / 2;
		switch (getHorizontalAlignment()) {
		case SwingConstants.LEADING:
		case SwingConstants.LEFT:
			textx = (int) (scale * arc * 0.5f);
			break;
		case SwingConstants.TRAILING:
		case SwingConstants.RIGHT:
			textx = (int) (w - (scale * arc * 0.5f));
			break;
		case SwingConstants.CENTER:
			textx = (w - fw) / 2;
			break;
		}

		// draw the text
		g2.setColor(alphaColor(Color.black, 70));
		g2.drawString(text, (int) (textx + scale * (0.04f)),
				(int) (texty + scale * (0.04f)));
		g2.setColor(this.getForeground());
		g2.drawString(text, textx, texty);

	}

	protected void drawHighlight(int w, int h, float scale, Color base,
			float arcx, float arcy, Graphics2D g2) {

		// create the highlight
		GradientPaint highlight = new GradientPaint(new Point2D.Float(
				scale * 0.2f, scale * 0.2f), new Color(255, 255, 255, 175),
				new Point2D.Float(scale * 0.2f, scale * 0.55f), new Color(255,
						255, 255, 0));
		g2.setPaint(highlight);
		this.fillRoundRect(g2, scale * 0.2f, scale * 0.1f, w - scale * 0.4f,
				scale * 0.4f, arcx, arcy);
		this.drawRoundRect(g2, scale * 0.2f, scale * 0.1f, w - scale * 0.4f,
				scale * 0.4f, arcx, arcy);
	}

	protected void drawBorder(int w, int h, float scale, float arcx,
			float arcy, Graphics2D g2) {

		// draw the border
		g2.setColor(getBorderColor());
		g2.setStroke(new BasicStroke(getBorderWidth()));
		this.drawRoundRect(g2, scale * (0f), scale * (0f), w, h, arcx, arcy);
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
		Border border = this.border;
		if (border != null) {
			if (border instanceof LineBorder) {
				return ((LineBorder) border).getLineColor();
			}
		}
		return new Color(0, 0, 0, 150);
	}

	// float version of fill round rect
	protected static void fillRoundRect(Graphics2D g2, float x, float y,
			float w, float h, float ax, float ay) {

		g2.fill(new RoundRectangle2D.Float(x, y, w, h, ax, ay));
	}

	// float version of draw round rect
	protected static void drawRoundRect(Graphics2D g2, float x, float y,
			float w, float h, float ax, float ay) {
		g2.draw(new RoundRectangle2D.Float(x, y, w, h, ax, ay));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(300, 300);

		JxButton jxButton = new JxButton("ADD NEW RESIDENT");
		jxButton.setFont(new Font("Dialog", Font.PLAIN, 11));
		jxButton.setBounds(10, 10, 125, 23);
		jxButton.setBorderPainted(false);
		jxButton.setBorder(new LineBorder(new Color(23, 86, 111), 2, false));
		jxButton.setBackground(new Color(129, 160, 172));
		jxButton.setForeground(new Color(23, 86, 111));
		// jxButton.setBorder(null);
		frame.getContentPane().add(jxButton);
		frame.setVisible(true);
	}
}
