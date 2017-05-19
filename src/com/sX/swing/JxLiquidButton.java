/**
 * 
 */
package com.sX.swing;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.Paint;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;

import javax.swing.AbstractButton;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 * @author D S Naruka <BR>
 *         <A
 *         href="mailto:dsn.naruka@@gmail.com">mailto:dsn.naruka@@gmail.com</A>
 * 
 */
public class JxLiquidButton extends JButton { // implements MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4772940483851232489L;
	private boolean pressed;
	private boolean rollOver;
	private Border border;
	private float scale;
	private float arc;
	private boolean borderPainted;
	private BufferedImage reflectionImage;
	private Shape shape;

	private boolean reflection;

	/**
	 * 
	 */
	public JxLiquidButton() {
		this("", null);
	}

	public JxLiquidButton(float arc) {
		this();
		setArc(arc);
	}

	/**
	 * @param icon
	 */
	public JxLiquidButton(Icon icon) {
		this("", icon);
	}

	/**
	 * @param text
	 */
	public JxLiquidButton(String text) {
		this(text, null);
	}

	/**
	 * @param a
	 */
	public JxLiquidButton(Action a) {
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
	public JxLiquidButton(String text, Icon icon) {
		super(text, icon);
		// this.addMouseListener(this);
		super.setBorderPainted(false);
		setArc(1f);
		setOpaque(false);
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
		shape = getShape();
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

	public boolean isReflection() {
		return reflection;
	}

	public void setReflection(boolean reflection) {
		this.reflection = reflection;
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

	private Shape getShape() {
		if (this.shape == null) {
			int width = getWidth();
			int height = getHeight();
			int inset = (int) (scale * 0.04f);
			int arcx = (int) (scale * arc);
			int arcy = (int) (scale * arc);
			int w = width - inset * 2 - 1;
			int h = height - (int) (scale * 0.1f) - 1;
			int sH = 0;
			if (reflection) {
				sH = (int) (height * 0.3f) - 1;
				h = h - sH;
			}

			shape = new RoundRectangle2D.Double((0) * scale, (0) * scale, w, h,
					arcx, arcy);
		}
		return shape;
	}

	@Override
	protected void paintComponent(Graphics g) {
		setOpaque(false);
		// super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Graphics2D g2Ref = (Graphics2D) g;
		if (reflection) {
			reflectionImage = new BufferedImage(getWidth(), getHeight(),
					BufferedImage.TYPE_INT_ARGB);
			g2Ref = reflectionImage.createGraphics();
		}
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION,
				RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
		g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
				RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g2Ref.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2Ref.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION,
				RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
		g2Ref.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
				RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		// g2.setColor(this.getBackground());
		// g2.fillRect(0,0,this.getWidth(),this.getHeight());

		scale = (50f / 30f) * this.getFont().getSize2D();

		// g2.clip(new RoundRectangle2D.Float((-.04f)*scale, (.02f)*scale,
		// this.getWidth()+.08f*scale, this.getHeight()+0.08f*scale, scale*.6f,
		// scale*.4f));

		drawLiquidButton(this.getBackground(), this.getWidth(), this
				.getHeight(), getText(), scale, arc * scale, arc * scale, g2,
				g2Ref);
	}

	protected void drawLiquidButton(Color base, int width, int height,
			String text, float scale, float arcx, float arcy, Graphics2D g2,
			Graphics2D g2Ref) {

		// calculate inset
		int inset = (int) (scale * 0.04f);
		int w = width - inset * 2 - 1;
		int h = height - (int) (scale * 0.1f) - 1;
		int sH = 0;
		if (reflection) {
			sH = (int) (height * 0.3f) - 1;
			h = h - sH;
		}
		// System.out.println("h: " + h + " sH: " + sH);

		// drawDropShadow(w,h,scale,arcx * 1.04f,arcy * 1.04f,g2);

		// g2.translate(inset, 0);
		// g2Ref.translate(inset, 0);
		// if (pressed) {
		// g2.translate(0, 0.06f * scale);
		// g2Ref.translate(0, 0.12f * scale);
		// }

		shape = getShape();
		// shape = new RoundRectangle2D.Double((0) * scale, (0) * scale, w, h,
		// arcx, arcy);
		drawButtonBody(w, h, scale, base, arcx, arcy, g2);
		if (reflection) {
			drawButtonBody(w, h, scale, base, arcx, arcy, g2Ref);
		}
		if (getIcon() != null) {
			drawIcon(w, h, scale, getIcon(), g2);
			if (reflection) {
				drawIcon(w, h, scale, getIcon(), g2Ref);
			}
		}
		drawText(w, h, scale, text, g2);
		if (reflection) {
			drawText(w, h, scale, text, g2Ref);
		}
		drawHighlight(w, h, scale, base, arcx * 0.8f, arcy * 0.4f, g2);
		if (reflection) {
			drawHighlight(w, h, scale, base, arcx * 0.8f, arcy * 0.4f, g2Ref);
		}
		drawBorder(w, h, scale, arcx, arcy, g2);
		if (reflection) {
			drawBorder(w, h, scale, arcx, arcy, g2Ref);
		}

		// if (pressed) {
		// g2.translate(0, 0.06f * scale);
		// g2Ref.translate(0, 0.12f * scale);
		// }
		// g2.translate(-inset, 0);
		// g2Ref.translate(-inset, 0);

		if (reflection) {
			drawReflectedShadow(w, h, sH, g2);
		}
	}

	protected void drawDropShadow(int w, int h, float scale, float arcx,
			float arcy, Graphics2D g2) {
		// g2.setColor(new Color(0, 0, 0, 50));
		// fillRoundRect(g2, (-.04f) * scale, (.02f) * scale, w + .08f * scale,
		// h
		// + 0.08f * scale, arcx, arcy);
		// g2.setColor(new Color(0, 0, 0, 100));
		// fillRoundRect(g2, 0, 0.06f * scale, w, h, arcx, arcy);
	}

	protected void drawReflectedShadow(int w, int h, int sH, Graphics2D g2) {
		BufferedImage reflection = new BufferedImage(getWidth(), h,
				BufferedImage.TYPE_INT_ARGB);

		// here we inverted the alpha gradient to suit the DST_OVER alpha
		// composite rule we use after
		Graphics2D reflectionGraphics = reflection.createGraphics();
		Paint painter = new LinearGradientPaint(new Point(0, 0), new Point(0,
				sH), new float[] { 0f, 0.5f, 1f }, new Color[] {
				new Color(1.0f, 1.0f, 1.0f, 0f),
				new Color(1.0f, 1.0f, 1.0f, 0.7f),
				new Color(1.0f, 1.0f, 1.0f, 1f) });
		reflectionGraphics.setPaint(painter);
		reflectionGraphics.fill(new Rectangle2D.Double(0, 0, getWidth(), h));

		AffineTransform tranform = AffineTransform.getScaleInstance(1.0, -1.0);
		tranform.translate(0, -h - 3);

		reflectionGraphics.setComposite(AlphaComposite.DstOver);
		reflectionGraphics.drawImage(reflectionImage, tranform, this);
		reflectionGraphics.dispose();

		// g2.drawImage(reflectionImage, 0, 0, this);
		g2.drawImage(reflection, 0, h + 3, this);
	}

	protected void drawButtonBody(int w, int h, float scale, Color base,
			float arcx, float arcy, Graphics2D g2) {

		GradientPaint bg = null;
		if (rollOver) {
			if (pressed) {
				bg = new GradientPaint(new Point(0, 0), base, new Point(0, h),
						base);
			} else {
				bg = new GradientPaint(new Point(0, 0), base, new Point(0, h),
						base.brighter());
			}
		} else {
			bg = new GradientPaint(new Point(0, 0), base.brighter(), new Point(
					0, h), base);
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

	private void drawIcon(int w, int h, float scale2, Icon icon, Graphics2D g2) {
		int gap = getIconTextGap();
		int iw = icon.getIconWidth();
		int ih = icon.getIconHeight();

		int fh = g2.getFontMetrics(getFont()).getHeight(); // +
		// g2.getFontMetrics().getAscent()
		// +
		// g2.getFontMetrics().getDescent();

		int iconx = 0;
		int icony = (h - ih - fh - gap) / 2;

		// System.out.println("h: " + h + " ih: " + ih + " fh: " + fh + " gap:"
		// + gap + " iconx: "+ iconx + " icony:" + icony);

		switch (getHorizontalAlignment()) {
		case SwingConstants.LEADING:
		case SwingConstants.LEFT:
			iconx = (int) (scale * arc * 0.5f);
			break;
		case SwingConstants.TRAILING:
		case SwingConstants.RIGHT:
			iconx = (int) (w - (scale * arc * 0.5f));
			break;
		case SwingConstants.CENTER:
			iconx = (w - iw) / 2;
			break;
		}

		icon.paintIcon(this, g2, iconx, icony);
	}

	protected void drawText(int w, int h, float scale, String text,
			Graphics2D g2) {

		// calculate the width and height
		g2.setFont(getFont());
		int fw = g2.getFontMetrics().stringWidth(text);
		int fh = g2.getFontMetrics().getAscent(); // +
		// g2.getFontMetrics().getDescent()
		// +
		// g2.getFontMetrics(getFont()).getHeight();

		int textx = 0;
		int texty = 0;
		Icon icon = getIcon();
		if (icon != null) {
			int gap = getIconTextGap();
			icon.getIconWidth();
			int ih = icon.getIconHeight();
			texty = ((h - ih - gap) / 2) + ih + gap;
		} else {
			texty = (h + fh) / 2;
		}

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
			textx = ((w - fw) / 2);
			break;
		}
		// System.out.println("h:" + h + " fh: " + fh + " textx: " + textx +
		// " texty:" + texty);

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

	@Override
	public boolean contains(int x, int y) {
		return this.contains(new Point(x, y));
	}

	@Override
	public boolean contains(Point p) {
		Point2D p2 = p;
		Shape refShape = getShape();
		// System.out.println(refShape + ", p:" + p + ", p2:" + p2);
		return refShape.contains(p2);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(300, 300);
		frame.getContentPane().setBackground(new Color(0xff, 0xff, 0xff));

		JxLiquidButton jxButton = new JxLiquidButton("FINANCIAL CHECK");
		jxButton.setFont(new Font("Arial", Font.PLAIN, 11));
		// jxButton.setBounds(10, 10, 105, 130);
		jxButton.setBounds(10, 10, 105, 21);
		jxButton.setBorderPainted(false);
		jxButton.setBorder(new LineBorder(new Color(23, 86, 111), 2, false));
		// jxButton.setPreferredSize(new Dimension(105, 130));
		jxButton.setPreferredSize(new Dimension(90, 21));
		jxButton.setBackground(new Color(196, 221, 226));
		jxButton.setToolTipText("Home");
		// jxButton.setIcon(new ImageIcon("img/RupeeManager.png"));
		jxButton.setArc(1.0f);
		jxButton.setHorizontalTextPosition(AbstractButton.CENTER);
		jxButton.setVerticalTextPosition(AbstractButton.BOTTOM);
		// jxButton.setReflection(true);
		// jxButton.setBorder(null);
		frame.getContentPane().add(jxButton);
		frame.setVisible(true);
	}
}
