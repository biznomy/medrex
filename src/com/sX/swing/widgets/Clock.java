package com.sX.swing.widgets;

/*  
 * DKnob.java
 * (c) 2000 by Joakim Eriksson
 *  
 * DKnob is a component similar to JSlider but with 
 * round "user interface", a knob. 
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Arc2D;
import java.awt.geom.GeneralPath;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.EventListenerList;

public class Clock extends JComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6547936284747793175L;
	private final static float START = 90;
	private final static float LENGTH = 360;

	// private final static float START = 0;
	// private final static float LENGTH = 360;
	private final static float PI = (float) 3.1415;
	private final static float START_ANG = (START / 360) * PI * 2;
	private final static float LENGTH_ANG = (LENGTH / 360) * PI * 2;
	private final static float DRAG_RES = (float) 0.01;
	private final static float MULTIP = 180 / PI;
	// private final static Color DEFAULT_FOCUS_COLOR = new Color(0x8080ff);
	private final static Color DEFAULT_FOCUS_COLOR = Color.WHITE;
	public static Color selectedColor = new Color(194, 194, 194);
	private int tunnelingValue;

	public int getTunnelingValue() {
		return tunnelingValue;
	}

	public void setTunnelingValue(int tunnelingValue) {
		this.tunnelingValue = tunnelingValue;
	}

	private int SHADOWX = 2;
	private int SHADOWY = 2;
	private float DRAG_SPEED;
	private float CLICK_SPEED;
	private int size;
	private int middle;

	public final static int SIMPLE = 1;
	public final static int ROUND = 2;
	private int dragType = ROUND;

	private final static Dimension MIN_SIZE = new Dimension(40, 40);
	private final static Dimension PREF_SIZE = new Dimension(80, 80);

	// Set the antialiasing to get the right look!
	private final static RenderingHints AALIAS = new RenderingHints(
			RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	private ChangeEvent changeEvent = null;
	private EventListenerList listenerList = new EventListenerList();

	private Arc2D hitArc = new Arc2D.Float(Arc2D.PIE);

	private float ang = START_ANG;
	private float val;
	private int dragpos = -1;
	private float startVal;
	private Color focusColor;
	private double lastAng;
	private JLabel valueLabel;
	private String value;

	public Clock() {
		DRAG_SPEED = 0.01F;
		CLICK_SPEED = 0.01F;
		SHADOWX = 10;
		SHADOWY = 10;

		focusColor = DEFAULT_FOCUS_COLOR;

		addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				Clock t = (Clock) e.getSource();
				valueLabel.setText("Val:" + ((int) (12 * t.getValue())));
				// System.out.println((vol = (int)(12 * t.getValue())));
				setTunnelingValue(((int) (12 * t.getValue())));
			}
		});
		setPreferredSize(PREF_SIZE);
		hitArc.setAngleStart(235); // Degrees ??? Radians???
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent me) {
				dragpos = me.getX() + me.getY();
				startVal = val;

				// Fix last angle
				int xpos = middle - me.getX();
				int ypos = middle - me.getY();
				lastAng = Math.atan2(xpos, ypos);

				requestFocus();
			}

			@Override
			public void mouseClicked(MouseEvent me) {
				hitArc.setAngleExtent(-(LENGTH + 20));
				if (hitArc.contains(me.getX(), me.getY())) {
					hitArc.setAngleExtent(MULTIP * (ang - START_ANG) - 10);
					if (hitArc.contains(me.getX(), me.getY())) {
						decValue();
					} else
						incValue();
				}
			}
		});

		// Let the user control the knob with the mouse
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent me) {
				if (dragType == SIMPLE) {
					float f = DRAG_SPEED * ((me.getX() + me.getY()) - dragpos);
					setValue(startVal + f);
				} else if (dragType == ROUND) {
					// Measure relative the middle of the button!

					int xpos = middle - me.getX();
					int ypos = middle - me.getY();

					double ang = Math.atan2(xpos, ypos);

					double diff = lastAng - ang;

					float val = (float) (getValue() + (diff / LENGTH_ANG));

					if (diff > 6 && val > 1) {
						diff = lastAng + ang;
						val = (float) (getValue() + (diff / LENGTH_ANG));
					}
					if (diff < 0 && val < 0) {
						val *= -1;
					}
					setValue(val);
					lastAng = ang;
				}
			}

			@Override
			public void mouseMoved(MouseEvent me) {
			}
		});

		// Let the user control the knob with the keyboard
		addKeyListener(new KeyListener() {

			public void keyTyped(KeyEvent e) {
			}

			public void keyReleased(KeyEvent e) {
			}

			public void keyPressed(KeyEvent e) {
				int k = e.getKeyCode();
				if (k == e.VK_RIGHT)
					incValue();
				else if (k == e.VK_LEFT)
					decValue();
			}
		});

		// Handle focus so that the knob gets the correct focus highlighting.
		addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				repaint();
			}

			public void focusLost(FocusEvent e) {
				repaint();
			}
		});

		valueLabel = new JLabel();
		valueLabel.setText("Value");
		valueLabel.setBounds(10, 38, 66, 16);
		add(valueLabel);
	}

	public void setDragType(int type) {
		dragType = type;
	}

	public int getDragType() {
		return dragType;
	}

	@Override
	public boolean isManagingFocus() {
		return true;
	}

	@Override
	public boolean isFocusTraversable() {
		return true;
	}

	private void incValue() {
		setValue(val + CLICK_SPEED);
	}

	private void decValue() {
		setValue(val - CLICK_SPEED);
	}

	public float getValue() {
		return val;
	}

	public void setValue(float val) {
		if (val < 0)
			val = 0;
		if (val > 1)
			val = 1;
		this.val = val;
		ang = START_ANG - LENGTH_ANG * val;
		repaint();
		fireChangeEvent();
	}

	public void addChangeListener(ChangeListener cl) {
		listenerList.add(ChangeListener.class, cl);
	}

	public void removeChangeListener(ChangeListener cl) {
		listenerList.remove(ChangeListener.class, cl);
	}

	@Override
	public Dimension getMinimumSize() {
		return MIN_SIZE;
	}

	protected void fireChangeEvent() {
		// Guaranteed to return a non-null array
		Object[] listeners = listenerList.getListenerList();
		// Process the listeners last to first, notifying
		// those that are interested in this event
		for (int i = listeners.length - 2; i >= 0; i -= 2) {
			if (listeners[i] == ChangeListener.class) {
				// Lazily create the event:
				if (changeEvent == null)
					changeEvent = new ChangeEvent(this);
				((ChangeListener) listeners[i + 1]).stateChanged(changeEvent);
			}
		}
	}

	@Override
	public void paint(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		size = Math.min(width, height) - 22;
		middle = 10 + size / 2;

		Graphics2D g2d = (Graphics2D) g;
		g2d.setBackground(getParent().getBackground());
		g2d.addRenderingHints(AALIAS);

		// For the size of the "mouse click" area
		hitArc.setFrame(100, 100, size + 12, size + 12);

		// Paint the "markers"
		for (float a2 = START_ANG; a2 >= START_ANG - LENGTH_ANG; a2 = a2
				- (float) (LENGTH_ANG / 12.01)) {
			int x = 10 + size / 2 + (int) ((6 + size / 2) * Math.cos(a2));
			int y = 10 + size / 2 - (int) ((6 + size / 2) * Math.sin(a2));
			g.drawLine(20 + size / 2, 20 + size / 2, x, y);

		}

		// Set the position of the Zero
		float a2 = START_ANG;
		int xPos = 10 + size / 2 + (int) ((6 + size / 2) * Math.cos(a2));
		int yPos = 10 + size / 2 - (int) ((6 + size / 2) * Math.sin(a2));
		//	
		g.drawString(valueLabel.getText(), xPos + 40, yPos + 10);
		// g.drawString("3", 3, size + 100);
		// g.drawString("6", 6, size + 200);
		// g.drawString("9", 9, size + 130);

		// Paint focus if in focus
		if (hasFocus()) {
			g.setColor(Color.gray);
		} else {
			g.setColor(Color.gray);
		}

		g.fillOval(10, 10, size, size);

		g.drawArc(10, 10, size, size, 315, 270);

		g.setColor(Color.BLUE);
		g.fillOval(14, 14, size - 8, size - 8);
		g.setColor(Color.white);

		/* intersection points with the outer curve */
		int x = 10 + size / 2 + (int) (size / 2 * Math.cos(ang));
		int y = 10 + size / 2 - (int) (size / 2 * Math.sin(ang));

		Shape oldClip = g2d.getClip();
		g2d.setClip(getClipForNonFilledShape(x, y));
		g.setColor(selectedColor);
		g2d.fillOval(14, 14, size - 8, size - 8);
		g2d.setClip(oldClip);

		g.setColor(Color.red);
		g
				.drawArc(x, y, width, height, (int) Math.cos(ang), (int) Math
						.sin(ang));
		g.drawLine(10 + size / 2, 10 + size / 2, x, y);
		g.setColor(Color.BLACK);
		int s2 = Math.max(size / 6, 6);
		g.drawOval(10 + s2, 10 + s2, size - s2 * 2, size - s2 * 2);

		int dx = (int) (2 * Math.sin(ang));
		int dy = (int) (2 * Math.cos(ang));
		g.drawLine(10 + dx + size / 2, 10 + dy + size / 2, x, y);
		g.drawLine(10 - dx + size / 2, 10 - dy + size / 2, x, y);
	}

	public Shape getClipForNonFilledShape(int xIntersection, int yIntersection) {
		int xIni = 10 + size / 2
				+ (int) (size / 2 * Math.cos(Math.toRadians(90d)));
		int yIni = 10 + size / 2
				- (int) (size / 2 * Math.sin(Math.toRadians(90d)));

		int xCenter = 10 + size / 2;
		int yCenter = xCenter;

		GeneralPath shape = new GeneralPath();

		shape.moveTo(xCenter, yCenter);
		shape.lineTo(xIni, yIni);
		if (xIntersection <= xCenter && yIntersection <= yCenter) {
			// System.out.println("in 1 ");
			shape.lineTo(10, 10);
			shape.lineTo(10, yIntersection);
			shape.lineTo(xIntersection, yIntersection);
			shape.closePath();
		} else if (xIntersection <= xCenter && yIntersection >= yCenter) {
			// System.out.println("in 2");
			shape.lineTo(10, 10);
			shape.lineTo(10, yIntersection);
			shape.lineTo(xIntersection, yIntersection);
			shape.closePath();
		} else if (xIntersection >= xCenter && yIntersection >= yCenter) {
			// System.out.println("in 3");
			shape.lineTo(10, 10);
			shape.lineTo(10, size + 10);
			shape.lineTo(size + 10, size + 10);
			shape.lineTo(xIntersection, yIntersection);
			shape.closePath();
		} else if (xIntersection >= xCenter && yIntersection <= yCenter) {
			// System.out.println("in 4");
			shape.lineTo(10, 10);
			shape.lineTo(10, size + 10);
			shape.lineTo(size + 10, size + 10);
			shape.lineTo(size + 10, 10);
			shape.lineTo(xIntersection, yIntersection);

			shape.closePath();
		}

		return shape;
	}
	/*
	 * public Shape getFilledShape(int xIntersection, int yIntersection) { int
	 * xIni = 10 + size/2 + (int)(size/2 Math.cos(Math.toRadians(90d))); int
	 * yIni = 10 + size/2 - (int)(size/2 Math.sin(Math.toRadians(90d)));
	 * 
	 * int xCenter = 10 + size/2; int yCenter = xCenter;
	 * 
	 * GeneralPath shape = new GeneralPath();
	 * 
	 * shape.moveTo(xCenter, yCenter); shape.lineTo(xIni, yIni);
	 * 
	 * Ellipse2D.Double ellipse = new Ellipse2D.Double(14, 14, size-8, size-8);
	 * 
	 * GeneralPath el = new GeneralPath(ellipse);
	 * 
	 * right-top corner if(xIntersection > xCenter && yIntersection < yCenter) {
	 * QuadCurve2D.Double curve = new QuadCurve2D.Double(); curve.x1 = xIni;
	 * curve.y1 = yIni; curve.x2 = xIntersection; curve.y2 = yIntersection;
	 * curve.ctrlx = (xCenter + size + 10)/2; curve.ctrly = yIni;
	 * shape.append(curve, true); }
	 * 
	 * shape.closePath();
	 * 
	 * return shape; }
	 */
}
