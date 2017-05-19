/**
 * 
 */
package com.sX.swing;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Point2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 * @author D S Naruka <BR>
 *         <A href="mailto:dsn.naruka@gmail.com">mailto:dsn.naruka@gmail.com</A>
 * 
 */
public class JxToggleButton extends JToggleButton implements MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -650750470099912224L;
	private boolean pressed;
	public boolean rollOver;
	private Border border;
	private float scale;
	private float arc;
	private boolean borderPainted;
	private Dimension preferredSize;

	/**
	 * 
	 */
	public JxToggleButton() {
		this("", null);
	}

	public JxToggleButton(float arc) {
		this();
		setArc(arc);
	}

	/**
	 * @param icon
	 */
	public JxToggleButton(Icon icon) {
		this("", icon);
	}

	/**
	 * @param text
	 */
	public JxToggleButton(String text) {
		this(text, null);
	}

	/**
	 * @param a
	 */
	public JxToggleButton(Action a) {
		super(a);
		super.setPreferredSize(null);
		this.addMouseListener(this);
		super.setBorderPainted(false);
		setArc(1f);
		// this.setOpaque(false);
	}

	/**
	 * @param text
	 * @param icon
	 */
	public JxToggleButton(String text, Icon icon) {
		super(text, icon);
		super.setPreferredSize(null);
		this.addMouseListener(this);
		super.setBorderPainted(false);
		setArc(1f);
		// this.setOpaque(false);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
	 */
	public void mouseClicked(MouseEvent e) {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
	 */
	public void mouseEntered(MouseEvent e) {
		rollOver = true;
		this.repaint();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
	 */
	public void mouseExited(MouseEvent e) {
		rollOver = false;
		this.repaint();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
	 */
	public void mousePressed(MouseEvent e) {
		pressed = true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
	 */
	public void mouseReleased(MouseEvent e) {
		pressed = false;
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

	@Override
	public Dimension getPreferredSize() {
		if (this.preferredSize == null) {
			String text = getText();
			FontMetrics fm = this.getFontMetrics(getFont());
			scale = (50f / 30f) * this.getFont().getSize2D();
			int w = fm.stringWidth(text);
			w += (int) (scale * 1.6f);
			int h = fm.getHeight();
			h += (int) (scale * .5f);
			return new Dimension(w, h);
		}
		return this.preferredSize;
	}

	@Override
	public void setPreferredSize(Dimension preferredSize) {
		this.preferredSize = preferredSize;
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

		// g2.clip(new RoundRectangle2D.Float((-.04f) * scale, (.02f) * scale,
		// this.getWidth() + .08f * scale, this.getHeight() + 0.08f
		// * scale, scale * arc, scale * arc)); //.6f, scale * .4f));

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
		// grad_bot = new Color(grad_bot.getRed(), grad_bot.getGreen(),
		// grad_top.getBlue()); //base.darker();
		GradientPaint bg = null;
		if (rollOver) {
			bg = new GradientPaint(new Point(0, 0), grad_top, new Point(0, h),
					grad_bot);
			// g2.setPaint(bg);
			// bg = new GradientPaint(new Point(0, 0), grad_top, new Point(0,
			// h/2),
			// grad_bot);
			g2.setPaint(bg);
			// bg = new GradientPaint(new Point(0, h/2), grad_bot, new Point(0,
			// h),
			// grad_top);
			// g2.setPaint(bg);
			fillRoundRect(g2, (0) * scale, (0) * scale, w, h, arcx, arcy);
			drawHighlight(w, h, scale, base, arcx * 0.8f, arcy * 0.4f, g2);
			drawBorder(w, h, scale, arcx, arcy, g2);
		}

		if (isSelected()) {
			bg = new GradientPaint(new Point(0, 0), base, new Point(0, h), base);
			g2.setPaint(bg);
			fillRoundRect(g2, (0) * scale, (0) * scale, w, h, arcx, arcy);
			drawHighlight(w, h, scale, base, arcx * 0.8f, arcy * 0.4f, g2);
			drawBorder(w, h, scale, arcx, arcy, g2);
		}

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
		int fw = g2.getFontMetrics(getFont()).stringWidth(text);
		int fh = g2.getFontMetrics(getFont()).getAscent(); // +
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
		Border border = this.border;
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
		frame.getContentPane().setBackground(Color.WHITE);

		ButtonGroup bgGroup = new ButtonGroup();
		final Border BORDER = new LineBorder(new Color(103, 144, 161), 2, false);

		JxToggleButton jxButton[] = new JxToggleButton[10];
		for (int i = 0; i < 10; i++) {
			jxButton[i] = new JxToggleButton("DASHBOARD");
			jxButton[i].setFont(new Font("Dialog", Font.BOLD, 13));
			jxButton[i].setBounds(10, 10 + (i * 42), 127, 32);
			jxButton[i].setBorderPainted(false);
			jxButton[i].setArc(0.4f);
			jxButton[i].setBorder(BORDER);
			jxButton[i].setBackground(new Color(209, 220, 224, 100));
			jxButton[i].setForeground(new Color(0, 69, 97));
			jxButton[i].setRolloverEnabled(true);
			jxButton[i].setHorizontalAlignment(SwingConstants.LEFT);
			bgGroup.add(jxButton[i]);
			frame.getContentPane().add(jxButton[i]);
			// jxButton.setBorder(null);
		}
		frame.setVisible(true);
	}
}
