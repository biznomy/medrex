/**
 * 
 */
package com.sX.swing;

import java.awt.AWTEvent;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Point2D;
import java.awt.geom.RoundRectangle2D;
import java.util.Vector;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.sX.theme.Theme;
import com.sX.theme.ThemeUtil;
import com.sX.utils.ShapeUtils;

/**
 * @author Nikhil
 * 
 */
public class JxComboBox extends JComboBox {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6192482442054318943L;
	private boolean pressed;
	private boolean rollOver;
	private Border border;
	private float scale;
	private float arc;
	private JButton thisButton;
	private JxComboBox thisCombo;
	private MouseListener mouseListener;
	private JPopupMenu popupMenu;
	private Component comboEditor;
	private Border editorMarginBorder;
	private Shape shape;
	private boolean iconized;
	private int horizontalAlignment;
	private boolean borderPainted;
	private boolean glassyPainted;
	Theme theme;

	/**
	 * 
	 */
	public JxComboBox() {
		super();
		construct();
	}

	/**
	 * @param model
	 */
	public JxComboBox(ComboBoxModel model) {
		super(model);
		construct();
	}

	/**
	 * @param items
	 */
	public JxComboBox(Object[] items) {
		super(items);
		construct();
	}

	/**
	 * @param items
	 */
	public JxComboBox(Vector<?> items) {
		super(items);
		construct();
	}

	private void construct() {
		super.setBorder(null);
		thisCombo = this;
		comboEditor = super.editor.getEditorComponent();
		// document = comboEditor.getDocument();
		editorMarginBorder = new EmptyBorder(1, 5, 1, 1);
		iconized = true;
		borderPainted = true;
		horizontalAlignment = SwingConstants.LEADING;
		mouseListener = new MouseListener() {
			public void mouseClicked(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {
				thisCombo.repaint();
			}

			public void mouseExited(MouseEvent e) {
				rollOver = false;
				thisCombo.repaint();
			}

			public void mousePressed(MouseEvent e) {
				pressed = true;
			}

			public void mouseReleased(MouseEvent e) {
				pressed = false;
			}
		};
		this.addMouseListener(mouseListener);
		setArc(0f);
		enableEvents(AWTEvent.MOUSE_EVENT_MASK);
		enableEvents(AWTEvent.PAINT_EVENT_MASK);
		popupMenu = getComponentPopupMenu();
		thisButton = (JButton) getComponent(0);
		thisButton.addMouseListener(mouseListener);
		setRenderer(new DefaultListCellRenderer() {
			/**
			 * 
			 */
			private static final long serialVersionUID = -5061410916478589964L;

			@Override
			public Component getListCellRendererComponent(JList list,
					Object value, int index, boolean isSelected,
					boolean cellHasFocus) {
				JLabel renderer = (JLabel) super.getListCellRendererComponent(
						list, value, index, isSelected, cellHasFocus);
				if (cellHasFocus || isSelected) {
					renderer.setForeground(thisCombo.getBackground());
					renderer.setBackground(thisCombo.getForeground());
				}
				return renderer;
			}
		});
		this.repaint();
	}

	/**
	 * @param arc
	 *            the arc to set
	 */
	public void setArc(float arc) {
		this.arc = arc;
	}

	/**
	 * @return the arc
	 */
	public float getArc() {
		return arc;
	}

	/**
	 * @return the border
	 */
	@Override
	public Border getBorder() {
		return null;
	}

	/**
	 * @return the iconized
	 */
	public boolean isIconized() {
		return iconized;
	}

	/**
	 * @return the horizontalAlignment
	 */
	public int getHorizontalAlignment() {
		return horizontalAlignment;
	}

	/**
	 * @param iconized
	 *            the iconized to set
	 */
	public void setIconized(boolean iconized) {
		this.iconized = iconized;
	}

	/**
	 * @param horizontalAlignment
	 *            the horizontalAlignment to set
	 */
	public void setHorizontalAlignment(int horizontalAlignment) {
		this.horizontalAlignment = horizontalAlignment;
	}

	/**
	 * @return the borderPainted
	 */
	public boolean isBorderPainted() {
		return borderPainted;
	}

	/**
	 * @param borderPainted
	 *            the borderPainted to set
	 */
	public void setBorderPainted(boolean borderPainted) {
		this.borderPainted = borderPainted;
	}

	/**
	 * @return the glassyPainted
	 */
	public boolean isGlassyPainted() {
		return glassyPainted;
	}

	/**
	 * @param glassyPainted
	 *            the glassyPainted to set
	 */
	public void setGlassyPainted(boolean glassyPainted) {
		this.glassyPainted = glassyPainted;
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
	protected void processMouseEvent(MouseEvent e) {
		// super.processMouseEvent(e);
		switch (e.getID()) {
		case MouseEvent.MOUSE_CLICKED:
		case MouseEvent.MOUSE_DRAGGED:
		case MouseEvent.MOUSE_ENTERED:
			rollOver = true;
		case MouseEvent.MOUSE_EXITED:
			rollOver = false;
		case MouseEvent.MOUSE_MOVED:
		case MouseEvent.MOUSE_PRESSED:
			pressed = true;
		case MouseEvent.MOUSE_RELEASED:
			pressed = false;

			paint(getGraphics());
		}
	}

	@Override
	public void paint(Graphics g) {
		super.setOpaque(false);
		// super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		scale = (50f / 30f) * this.getFont().getSize2D();
		drawLiquidCombo(this.getBackground(), this.getWidth(),
				this.getHeight(), (getSelectedItem() == null ? ""
						: getSelectedItem().toString()), scale, arc * scale,
				arc * scale, g2);
		if (isEditable()) {
			if (comboEditor instanceof Component) {
				JComponent cEditor = (JComponent) comboEditor;
				cEditor.setBorder(null);
				cEditor.setOpaque(true);
				cEditor.setForeground(this.getForeground());
				cEditor.setBorder(editorMarginBorder);
				cEditor.setBounds(0, 0,
						(int) (getWidth() - (scale * arc * 2.5f)),
						getHeight() - 3);
				cEditor.paint(g);
				cEditor.repaint(0, 0,
						(int) (getWidth() - (scale * arc * 2.5f)),
						getHeight() - 3);
				drawBorder(this.getWidth(), getHeight() - (int) (scale * 0.1f)
						- 1, scale, scale * arc, scale * arc, g2);
			}
		}
		g2.setClip(shape);
	}

	protected void drawLiquidCombo(Color base, int width, int height,
			String text, float scale, float arcx, float arcy, Graphics2D g2) {

		// calculate inset
		int inset = (int) (scale * 0.04f);
		int w = width - inset * 2 - 1;
		int h = height - (int) (scale * 0.1f) - 1;

		// drawDropShadow(w,h,scale,arcx * 1.04f,arcy * 1.04f,g2);
		if (shape == null) {
			shape = new RoundRectangle2D.Float(0, 0, w, h, arcx, arcy);
		}

		g2.translate(inset, 0);
		if (pressed) {
			g2.translate(0, 0.06f * scale);
		}

		drawComboBody(w, h, scale, base, arcx, arcy, g2);
		drawText(w + 4, h, scale, text, g2);
		if (glassyPainted) {
			drawHighlight(w, h, scale, base, arcx * 0.8f, arcy * 0.4f, g2);
		}
		if (iconized) {
			int iconWh = (int) ((h / 2.5f > 10) ? h / 2.5f : 10);
			int iconX = (int) (getWidth() - (arc * scale / 2));
			int iconY = (getHeight() - iconWh / 2) / 2;
			drawIcon(g2, iconX, iconY, iconWh, iconWh);
		}
		if (borderPainted) {
			drawBorder(w, h, scale, arcx, arcy, g2);
		}
		if (pressed) {
			g2.translate(0, 0.06f * scale);
		}
		g2.translate(-inset, 0);
	}

	private void drawIcon(Graphics2D g2, int x, int y, int w, int h) {
		Shape triangle = ShapeUtils.getTriangle(w, h);
		triangle = ShapeUtils.rotateShape(triangle, 90);
		triangle = ShapeUtils.translateShape(triangle, x, y);
		g2.setColor(getForeground());
		g2.fill(triangle);
	}

	protected void drawDropShadow(int w, int h, float scale, float arcx,
			float arcy, Graphics2D g2) {
		g2.setColor(new Color(0, 0, 0, 50));
		fillRoundRect(g2, (-.04f) * scale, (.02f) * scale, w + .08f * scale, h
				+ 0.08f * scale, arcx, arcy);
		g2.setColor(new Color(0, 0, 0, 100));
		fillRoundRect(g2, 0, 0.06f * scale, w, h, arcx, arcy);
	}

	protected void drawComboBody(int w, int h, float scale, Color base,
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
		// g2.drawString(text, ((int) ((float) textx + scale * (0.04f))) +2 ,
		// (int) ((float) texty + scale * (0.04f)));
		g2.setColor(this.getForeground());
		g2.drawString(text, textx + 4, texty);
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

}
