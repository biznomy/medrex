/**
 * 
 */
package com.sX.swing;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.LinearGradientPaint;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.sX.awt.Direction;
import com.sX.theme.Theme;
import com.sX.theme.ThemeUtil;

/**
 * @author Dev
 * 
 */
public class JxPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8397952377948505924L;
	private static final float DEFAULT_ZOOM = 1.2f;
	private static final Toolkit DEFAULT_TOOLKIT;
	private static final float scaleX;
	private static final float scaleY;

	private float arc;
	private float zoomFactor;
	private boolean zoomed;
	private float scale;
	private Shape shape;
	private boolean curvedView;
	private Border border;
	private Paint panelPaint;
	Theme theme;

	/**
	 * Static initialization block
	 */
	static {
		DEFAULT_TOOLKIT = Toolkit.getDefaultToolkit();
		if (DEFAULT_TOOLKIT.getScreenSize().width > DEFAULT_TOOLKIT
				.getScreenSize().height) {
			scaleX = DEFAULT_TOOLKIT.getScreenSize().width
					/ DEFAULT_TOOLKIT.getScreenSize().height;
			scaleY = 1;
		} else {
			scaleX = 1;
			scaleY = DEFAULT_TOOLKIT.getScreenSize().height
					/ DEFAULT_TOOLKIT.getScreenSize().width;
		}
	}

	/**
	 * 
	 */
	public JxPanel() {
		super();
		construct();
	}

	/**
	 * @param layout
	 */
	public JxPanel(LayoutManager layout) {
		super(layout);
		construct();
	}

	/**
	 * @param b
	 */
	public JxPanel(boolean b) {
		super(b);
		construct();
	}

	public JxPanel(float roundedCorner) {
		this();
		arc = roundedCorner;
	}

	/**
	 * @param layout
	 * @param b
	 */
	public JxPanel(LayoutManager layout, boolean b) {
		super(layout, b);
		construct();
	}

	private void construct() {
		setOpaque(false);
		arc = 0;
		zoomFactor = DEFAULT_ZOOM;
		zoomed = false;
		curvedView = true;
		border = null;
		/*
		 * addMouseListener(new MouseAdapter() { public void mouseClicked(final
		 * MouseEvent e) { if(!zoomed) { JxPanel zoomPanel = zoomed ?
		 * doZoomOut() : doZoomIn(); JxFrame zoomFrame = new JxFrame();
		 * zoomFrame.setSize(zoomPanel.getSize().width + 50,
		 * zoomPanel.getSize().height + 50);
		 * zoomFrame.getContentPane().add(zoomPanel); //
		 * zoomFrame.setSheetPane(zoomPanel);
		 * zoomFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		 * // zoomFrame.getGlassPane().setVisible(true);
		 * zoomFrame.setVisible(true); } } });
		 */
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

	@Override
	public void paintComponent(Graphics g) {
		setOpaque(false);
		// super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		// g2.setRenderingHint(RenderingHints.KEY_RENDERING,
		// RenderingHints.VALUE_RENDER_QUALITY);
		// g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
		// RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		// g2.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING,
		// RenderingHints.VALUE_COLOR_RENDER_QUALITY);
		// g2.setRenderingHint(RenderingHints.KEY_DITHERING,
		// RenderingHints.VALUE_DITHER_ENABLE);
		// g2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,
		// RenderingHints.VALUE_STROKE_NORMALIZE);
		g2.setColor(getBackground());
		// g2.setPaintMode();
		scale = (50f / 30f) * this.getFont().getSize2D();
		if (curvedView) {
			shape = new RoundRectangle2D.Double(0, 0, getWidth() - 1,
					getHeight() - 1, arc * scale, arc * scale);
		} else {
			shape = new Rectangle2D.Double(0, 0, getWidth(), getHeight());
		}
		g2.setPaint(panelPaint);
		g2.fill(shape);
		drawBorder(g2);
		int margin = (int) (arc * (scale / 2));
		super.setBorder(new EmptyBorder(margin, margin, margin, margin));
		g2.clip(shape);
		super.paintComponent(g);
	}

	protected void drawBorder(Graphics2D g2) {
		// draw the border
		g2.setColor(getBorderColor());
		g2.setStroke(new BasicStroke(getBorderWidth()));
		g2.draw(shape);
	}

	public JxPanel doZoomIn() {
		JxPanel retPanel = null;
		try {
			retPanel = this; // (JxPanel) this.clone();
			doResize(retPanel);
			zoomed = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		// JDialog frame = new JDialog();
		// frame.setLayout(new BorderLayout());
		// frame.setModal(true);
		// frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		// JScrollPane scroll = new JScrollPane();
		// frame.getContentPane().add(scroll);
		// scroll.setViewportView(retPanel);
		// frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		// frame.setVisible(true);
		return retPanel;
	}

	public JxPanel doZoomOut() {
		JxPanel retPanel = null;
		float zoomF = zoomFactor;
		try {
			retPanel = this; // (JxPanel) this.clone();
			zoomFactor = 1 / zoomFactor;
			doResize(retPanel);
			zoomFactor = zoomF;
			zoomed = false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retPanel;
	}

	private Rectangle doResize(Rectangle bounds) {
		Rectangle retRect = new Rectangle();
		retRect.x = getScaleX(bounds.x);
		retRect.y = getScaleY(bounds.y);
		retRect.width = getScaleX(bounds.width);
		retRect.height = getScaleY(bounds.height);
		return retRect;
	}

	private Dimension doResize(Dimension size) {
		Dimension retDim = new Dimension();
		retDim.width = getScaleX(size.width);
		retDim.height = getScaleY(size.height);
		return retDim;
	}

	private Font doResize(Font f) {
		double tmp = Math.ceil(zoomFactor == 0 ? f.getSize() : f.getSize()
				* zoomFactor);
		return new Font(f.getName(), f.getStyle(), (int) (tmp * 0.9));
	}

	private Point doResize(Point point) {
		Point retPoint = new Point();
		retPoint.x = getScaleX(point.x);
		retPoint.y = getScaleY(point.y);
		return retPoint;
	}

	private void doResize(JComponent comp) {
		if (comp.getComponentCount() > 0) {
			for (int i = comp.getComponentCount() - 1; i >= 0; i--) {
				doResize((JComponent) comp.getComponent(i));
			}
		}
		/*
		 * if(comp instanceof JToggleButton) { JToggleButton toggleBut = new
		 * JToggleButton(); JToggleButton fromBut = (JToggleButton) comp;
		 * toggleBut.setBounds(fromBut.getBounds());
		 * toggleBut.setLocation(fromBut.getLocation());
		 * toggleBut.setSize(fromBut.getSize());
		 * toggleBut.setPreferredSize(fromBut.getPreferredSize());
		 * toggleBut.setText(fromBut.getText());
		 * toggleBut.setIcon(fromBut.getIcon());
		 * toggleBut.setSelected(fromBut.isSelected()); comp = toggleBut; }
		 */comp.setBounds(doResize(comp.getBounds()));
		// comp.setSize(doResize(comp.getSize()));
		comp.setSize(new Dimension(comp.getBounds().width,
				comp.getBounds().height));
		comp.setPreferredSize(new Dimension(comp.getBounds().width, comp
				.getBounds().height));
		comp.setMaximumSize(new Dimension(comp.getBounds().width, comp
				.getBounds().height));
		comp.setFont(doResize(comp.getFont()));
		// comp.setLocation(doResize(comp.getLocation()));
		// comp.setAlignmentX(getScaleX(comp.getAlignmentX()));
		// comp.setAlignmentY(getScaleY(comp.getAlignmentY()));
		comp.setLocation(new Point(comp.getBounds().x, comp.getBounds().y));
	}

	public int getScaleX(float x) {
		return (int) Math.ceil(scaleX * zoomFactor * x);
	}

	public int getScaleY(float y) {
		return (int) Math.ceil(scaleY * zoomFactor * y);
	}

	public float getZoomFactor() {
		return zoomFactor;
	}

	public void setZoomFactor(float zoomFactor) {
		this.zoomFactor = zoomFactor;
	}

	public boolean isZoomed() {
		return zoomed;
	}

	public void setZoomed(boolean zoomed) {
		this.zoomed = zoomed;
	}

	public float getArc() {
		return arc;
	}

	public void setArc(float arc) {
		this.arc = arc;
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

	/**
	 * @return the curvedView
	 */
	public boolean isCurvedView() {
		return curvedView;
	}

	/**
	 * @param curvedView
	 *            the curvedView to set
	 */
	public void setCurvedView(boolean curvedView) {
		this.curvedView = curvedView;
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

	protected float getBorderWidth() {
		Border border = getBorder();
		if (border != null) {
			if (border instanceof LineBorder) {
				return ((LineBorder) border).getThickness();
			}
		}
		return 1f;
	}

	protected Color getBorderColor() {
		Border border = this.border;
		if (border != null) {
			if (border instanceof LineBorder) {
				return ((LineBorder) border).getLineColor();
			}
		}
		return this.getBackground();
	}

	/**
	 * @return the scale
	 */
	protected float getScale() {
		return scale;
	}

	/**
	 * @param scale
	 *            the scale to set
	 */
	protected void setScale(float scale) {
		this.scale = scale;
	}

	public void setLinearGradient(Color startColor, Color endColor,
			Direction direction) {
		Point2D point1 = new Point2D.Float(0, 0), point2 = new Point2D.Float(0,
				0);
		if (Direction.LEFT_TO_RIGHT.equals(direction)) {
			point1 = new Point2D.Float(0, 0);
			point2 = new Point2D.Float(getWidth(), 0);
		}
		if (Direction.RIGHT_TO_LEFT.equals(direction)) {
			point1 = new Point2D.Float(getWidth(), 0);
			point2 = new Point2D.Float(0, 0);
		}
		if (Direction.TOP_TO_BOTTOM.equals(direction)) {
			point1 = new Point2D.Float(0, 0);
			point2 = new Point2D.Float(0, getHeight());
		}
		if (Direction.BOTTOM_TO_TOP.equals(direction)) {
			point1 = new Point2D.Float(0, getHeight());
			point2 = new Point2D.Float(0, 0);
		}
		if (Direction.TOP_LEFT_TO_BOTTOM_RIGHT.equals(direction)) {
			point1 = new Point2D.Float(0, 0);
			point2 = new Point2D.Float(getWidth(), getHeight());
		}
		if (Direction.TOP_RIGHT_TO_BOTTOM_LEFT.equals(direction)) {
			point1 = new Point2D.Float(getWidth(), 0);
			point2 = new Point2D.Float(0, getHeight());
		}
		if (Direction.BOTTOM_LEFT_TO_TOP_RIGHT.equals(direction)) {
			point1 = new Point2D.Float(0, getHeight());
			point2 = new Point2D.Float(getWidth(), 0);
		}
		if (Direction.BOTTOM_RIGHT_TO_TOP_LEFT.equals(direction)) {
			point1 = new Point2D.Float(getWidth(), getHeight());
			point2 = new Point2D.Float(0, 0);
		}
		float[] colPointArr = new float[] { 0.0f, 1.0f };
		Color[] colorArr = new Color[] { startColor, endColor };
		LinearGradientPaint paintLinear = new LinearGradientPaint(point1,
				point2, colPointArr, colorArr);
		this.panelPaint = paintLinear;
	}

}
