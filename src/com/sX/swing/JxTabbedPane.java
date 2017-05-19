package com.sX.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonModel;
import javax.swing.DefaultButtonModel;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.jgoodies.looks.plastic.Plastic3DLookAndFeel;
import com.sX.utils.ShapeUtils;
import com.sX.utils.SwingUtils;

public class JxTabbedPane extends JxComponent implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1043175196494922185L;
	private List<JxTab> tabs;
	private JxPanel panelView;
	private JScrollPane view;
	private JPanel tabContainer;
	private Dimension tabSize;
	private JxTabStyle tabStyle;
	private boolean autoSize;
	private int currentIndex;

	private static class JxTabArc {
		private float lX;
		private float lY;
		private float rX;
		private float rY;

		public JxTabArc(float lx, float ly, float rx, float ry) {
			this.lX = lx;
			this.lY = ly;
			this.rX = rx;
			this.rY = ry;
		}
	}

	public static enum JxTabStyle {
		RANDOM_COLORS(null, false), STYLE_0(new LineBorder(Color.BLACK, 1,
				false)), STYLE_1(new LineBorder(new Color(0, 59, 83), 6, false)), STYLE_2(
				new LineBorder(new Color(0, 59, 83), 3, false)), STYLE_3(null), STYLE_4(
				new LineBorder(new Color(0, 59, 83), 3, false), false,
				new Color(130, 163, 175), new JxTabArc(1f, 1f, 1f, 1f), false), ROUNDED(
				new LineBorder(new Color(0, 59, 83), 4, false), false,
				new Color(130, 163, 175), new JxTabArc(0.6f, 1.5f, 0.6f, 1.5f),
				false), CURVE(new LineBorder(new Color(0, 59, 83), 3, false),
				true, new Color(130, 163, 175), new JxTabArc(1f, 1f, 6f, 3f),
				false), BUTTONS(new LineBorder(Color.BLACK, 3, false), true,
				Color.WHITE, new JxTabArc(0f, 0f, 0f, 0f), false), WIN(
				new LineBorder(new Color(200, 200, 200), 1, false), true,
				Color.WHITE, new JxTabArc(0.5f, 0.5f, 0.5f, 0.5f), false), WIN2(
				new LineBorder(new Color(0, 59, 83), 1, false), false,
				Color.WHITE, new JxTabArc(0.5f, 0.5f, 0.5f, 0.5f), false, true);

		private LineBorder border;
		private boolean backgroundPainted;
		private Color background;
		private JxTabArc tabArc;
		private boolean clickGradient;
		private boolean compStyled;

		JxTabStyle() {
			this(new LineBorder(Color.BLACK, 1, false));
		}

		JxTabStyle(LineBorder border) {
			this(border, true);
		}

		JxTabStyle(LineBorder border, boolean bgPainted) {
			this(border, bgPainted, null);
		}

		JxTabStyle(LineBorder border, boolean bgPainted, Color background) {
			this(border, bgPainted, background, new JxTabArc(1f, 1f, 1f, 1f));
		}

		JxTabStyle(LineBorder border, boolean bgPainted, Color background,
				JxTabArc tabArc) {
			this(border, bgPainted, background, tabArc, true);
		}

		JxTabStyle(LineBorder border, boolean bgPainted, Color background,
				JxTabArc tabArc, boolean clickGradient) {
			this(border, bgPainted, background, tabArc, clickGradient, false);
		}

		JxTabStyle(LineBorder border, boolean bgPainted, Color background,
				JxTabArc tabArc, boolean clickGradient, boolean compStyled) {
			this.border = border;
			this.backgroundPainted = bgPainted;
			this.background = background;
			this.tabArc = tabArc;
			this.setCompStyled(compStyled);
		}

		/**
		 * @return the backgroundPainted
		 */
		public boolean isBackgroundPainted() {
			return backgroundPainted;
		}

		/**
		 * @return the background
		 */
		public Color getBackground() {
			if (this.equals(RANDOM_COLORS)) {
				return getRandomColor();
			} else {
				return background;
			}
		}

		/**
		 * @return the border
		 */
		public LineBorder getBorder() {
			return border;
		}

		/**
		 * @return the tabArc
		 */
		public JxTabArc getTabArc() {
			return tabArc;
		}

		private Color getRandomColor() {
			return new Color(getRandValue(), getRandValue(), getRandValue());
		}

		private int getRandValue() {
			int rnd = (int) (Math.random() * 256);
			return rnd;
		}

		public boolean isClickGradient() {
			return clickGradient;
		}

		/**
		 * @param compStyled
		 *            the compStyled to set
		 */
		public void setCompStyled(boolean compStyled) {
			this.compStyled = compStyled;
		}

		/**
		 * @return the compStyled
		 */
		public boolean isCompStyled() {
			return compStyled;
		}
	}

	public class JxTab extends JLabel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 2560859470026611700L;
		private JComponent com;
		private int index;
		private ButtonModel model;
		private float scale;
		private Shape o_shape;
		private Shape i_shape;
		private float arc;
		private JxTabStyle style;
		private int row;
		private boolean selected;
		private Color randCol;
		private boolean resized;

		public JxTab(int index, String name, Icon ico, JComponent com,
				Color background) {
			super(name, ico, SwingConstants.CENTER);
			Dimension pSize = super.getPreferredSize();
			int m = (int) (arc * (scale / 2));
			this.setPreferredSize(new Dimension(pSize.width + m, pSize.height
					+ m));
			this.addComponentListener(new ComponentAdapter() {
				@Override
				public void componentResized(ComponentEvent e) {
					resize();
					resized = true;
				}
			});

			this.style = JxTabbedPane.JxTabStyle.STYLE_0;
			this.randCol = null;
			this.selected = false;
			this.index = index;
			this.com = com;
			this.model = new DefaultButtonModel();
			this.model.setActionCommand(index + "");
			this.scale = (50f / 30f) * this.getFont().getSize2D();
			this.arc = 1f;
			this.setBackground(background);
			this.o_shape = ShapeUtils.getTabShape(0, 0, getWidth(),
					getHeight(), style.getTabArc().lX * scale, style
							.getTabArc().lY
							* scale, style.getTabArc().rX * scale, style
							.getTabArc().rY
							* scale);
			this.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					processMouseEvent(e);
				}
			});
		}

		private void resize() {
			this.o_shape = ShapeUtils.getTabShape(0, 0, getWidth(),
					getHeight(), style.getTabArc().lX * scale, style
							.getTabArc().lY
							* scale, style.getTabArc().rX * scale, style
							.getTabArc().rY
							* scale);
		}

		public void setTabStyle(JxTabStyle style) {
			this.style = style;
		}

		public void addActionListener(ActionListener l) {
			this.model.addActionListener(l);
			listenerList.add(ActionListener.class, l);
		}

		public void removeActionListener(ActionListener l) {
			this.model.removeActionListener(l);
		}

		public JComponent getTabComponent() {
			return com;
		}

		@Override
		protected void processMouseEvent(MouseEvent e) {
			switch (e.getID()) {
			case MouseEvent.MOUSE_RELEASED:
				// case MouseEvent.MOUSE_CLICKED :
				ActionEvent evt = new ActionEvent(this,
						ActionEvent.ACTION_PERFORMED, this.index + "");
				ActionListener[] li = listenerList
						.getListeners(ActionListener.class);
				// System.out.println("Action Hit: " + new Date().getTime());
				for (int i = 0; i < li.length; i++) {
					li[i].actionPerformed(evt);
				}
			}
		}

		@Override
		public void paint(Graphics g) {
			setOpaque(false);
			Graphics2D g2 = (Graphics2D) g;
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			// g2.setColor(Color.WHITE);

			int margin = (int) (arc * (scale / 2));
			int thick = 0;
			if (this.style.getBorder() != null) {
				g2.setPaint(new GradientPaint(new Point(0, getHeight()),
						Color.WHITE, new Point(getWidth(), 0),
						this.style.border.getLineColor()));
				g2.fill(o_shape);
				// g2.clip(o_shape);
				thick = this.style.getBorder().getThickness();
			}
			if (this.style.getBackground() != null) {
				// g2.setColor(style.getBackground());
				setBackground(style.getBackground());
				if (this.style == JxTabStyle.RANDOM_COLORS) {
					if (randCol == null) {
						randCol = style.getBackground();
						setBackground(randCol);
					}
					g2.setPaint(new GradientPaint(new Point(0, getHeight()),
							randCol.brighter(), new Point(getWidth(), 0),
							randCol.darker()));
				} else if (selected && this.style.isClickGradient()) {
					g2.setPaint(new GradientPaint(new Point(0, getHeight()),
							this.style.getBackground().brighter(), new Point(
									getWidth(), 0), style.getBackground()
									.darker()));
				} else {
					g2.setPaint(new GradientPaint(new Point(0, getHeight()),
							this.style.getBackground(),
							new Point(getWidth(), 0), style.getBackground()));
				}
			} else {
				// g2.setColor(getBackground());
				if (selected && this.style.isClickGradient()) {
					g2.setPaint(new GradientPaint(new Point(0, getHeight()),
							getBackground(), new Point(getWidth(), 0),
							getBackground()));
				} else {
					g2
							.setPaint(new GradientPaint(new Point(0,
									getHeight()), getBackground().brighter(),
									new Point(getWidth(), 0), getBackground()
											.darker()));
				}
			}
			if (i_shape == null || resized) {
				i_shape = ShapeUtils.getTabShape(thick, thick, getWidth()
						- (thick * 2), getHeight(), this.style.getTabArc().lX
						* scale, this.style.getTabArc().lY * scale, this.style
						.getTabArc().rX
						* scale, this.style.getTabArc().rY * scale);
				resized = false;
			}
			g2.fill(i_shape);
			margin = (int) (arc * ((scale + thick) / 2));
			// g2.fill(shape);
			// g2.clip(o_shape);

			super.setBorder(new EmptyBorder(margin, margin, 0, margin));
			// super.setSize(getWidth() - (2 * margin), getHeight());
			// Graphics gS = g.create();
			// gS.clipRect(margin, 0, getWidth() - (2 * margin), getHeight());
			super.paint(g);
			// super.paint(g2.create(margin, 0, getWidth() - (2 * margin),
			// getHeight()));
			// System.out.println("painting");
		}

		@Override
		public boolean contains(int x, int y) {
			return this.o_shape.contains(x, y);
		}

		@Override
		public boolean contains(Point p) {
			return this.contains(p.x, p.y);
		}

		/**
		 * @param row
		 *            the row to set
		 */
		public void setRow(int row) {
			this.row = row;
		}

		/**
		 * @return the row
		 */
		public int getRow() {
			return row;
		}

		/**
		 * @return the index
		 */
		public int getIndex() {
			return index;
		}

		/**
		 * @param index
		 *            the index to set
		 */
		public void setIndex(int index) {
			this.index = index;
		}

		/**
		 * @param selected
		 *            the selected to set
		 */
		public void setSelected(boolean selected) {
			this.selected = selected;
		}

		/**
		 * @return the selected
		 */
		public boolean isSelected() {
			return selected;
		}
	}

	/*
	 * private static final ImageIcon[] imgDefTabIcon = new ImageIcon[] { new
	 * ImageIcon("img/tabs/PERSONAL_INFO.png"), new
	 * ImageIcon("img/tabs/PAYER_INFO.png"), new
	 * ImageIcon("img/tabs/CONTACT_INFO.png"), new
	 * ImageIcon("img/tabs/PHYSICIANS.png"), new
	 * ImageIcon("img/tabs/PROVIDERS.png"), new
	 * ImageIcon("img/tabs/CENSUS.png"), new
	 * ImageIcon("img/tabs/DIAGNOSIS.png"), new ImageIcon("img/tabs/SCAN.png")
	 * }; private static final ImageIcon[] imgSelTabIcon = new ImageIcon[] { new
	 * ImageIcon("img/PERSONALINFO_yellow.png"), new
	 * ImageIcon("img/PAYER_INFO_YELLOW.png"), new
	 * ImageIcon("img/CONTACTINFO_YELLOW.png"), new
	 * ImageIcon("img/PHYSICIANS_YELLOW.png"), new
	 * ImageIcon("img/PROVIDERS_yellow.png"), new
	 * ImageIcon("img/CENSUS_yellow.png") // , // new
	 * ImageIcon("img/PROVIDERS_yellow.png"), // new
	 * ImageIcon("img/CENSUS_yellow.png") };
	 */

	public JxTabbedPane() {
		super();
		setPreferredSize(new Dimension(718, 448));
		setOpaque(false);
		setLayout(null);
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				resize();
			}
		});
		// addPropertyChangeListener(new PropertyChangeListener() {
		// public void propertyChange(PropertyChangeEvent evt) {
		// if(evt.getPropertyName() == "DISPLAY_TAB") {
		// doUpdate();
		// }
		// }
		// });

		// TAB_COUNT = imgDefTabIcon.length;
		// final JPanel panel = new JPanel();
		// panel.setBounds(0, 20, 718, 448);
		// panel.setSize(718, 448);
		// panel.setLayout(null);
		// panel.setOpaque(false);
		// add(panel);

		tabs = new ArrayList<JxTab>();
		tabSize = new Dimension(125, 35);

		tabContainer = new JPanel();
		// tabContainer.addComponentListener(new ComponentAdapter() {
		// public void componentMoved(ComponentEvent e) {
		// super.componentMoved(e);
		// repaint();
		// }
		// });
		tabContainer.setLayout(null);
		tabContainer.setBounds(0, 0, 718, 32);
		tabContainer.setOpaque(false);
		add(tabContainer);

		// tabLabels = new JLabel[TAB_COUNT];
		// for(int i = 0; i < TAB_COUNT; i++) {
		// final int index = i;
		// tabLabels[i] = new JLabel(imgDefTabIcon[i]);
		// tabLabels[i].setBounds(7 + (81 * i), 3, 93, 30);
		// tabLabels[i].addMouseListener(new MouseAdapter(){
		// public void mouseReleased(MouseEvent e) {
		// handleTabs(index);
		// }
		// });
		// panelTabs.add(tabLabels[i]);
		// }

		panelView = new JxPanel(1f);
		panelView.setLayout(new BorderLayout());
		panelView.setBounds(0, 33, 718, 408);
		panelView.setBackground(Color.WHITE);
		add(panelView, BorderLayout.CENTER);

		view = new JScrollPane();
		view.setBounds(10, 10, 708, 398);
		view.setOpaque(false);
		view.setBorder(new EmptyBorder(0, 0, 0, 0));
		panelView.add(view, BorderLayout.CENTER);

		tabStyle = JxTabStyle.STYLE_0;
		currentIndex = -1;
	}

	public void handleTabs(int index) {
		if (index >= 0 && index < tabs.size()) {
			for (int i = 0; i < tabs.size(); i++) {
				tabContainer.setComponentZOrder(tabs.get(i), tabContainer
						.getComponentCount() - 1);
			}
			tabContainer.setComponentZOrder(tabs.get(index), 0);
			tabContainer.repaint();
			displayTabs(index);
			// resize();
		} else {
			if (tabs.size() > 0 && currentIndex == -1) {
				handleTabs(0);
			}
		}
		// System.err.println("Handling Tab: " + new Date().getTime());
	}

	public void addTab(String name, Icon ico, JComponent com) {
		addTab(name, ico, com, null);
	}

	public void addTab(String name, Icon ico, JComponent com, Color background) {
		final int index = tabs.size();
		final JxTab tab = new JxTab(index, name, ico, com, background);

		tab.setTabStyle(tabStyle);
		tab.addActionListener(this);
		tab.setFont(this.getFont());
		tab.setForeground(this.getForeground());
		if (!autoSize) {
			tab.setSize(tabSize);
		}
		tabs.add(tab);
		tabContainer.add(tab);
		// handleTabs(0);

	}

	public void removeTab(int index) {
		if (index < tabs.size()) {
			for (int i = 0; i < tabs.size(); i++) {
				tabs.remove(index);
			}
		}
		for (int i = 0; i < tabs.size(); i++) {
			tabs.get(i).setIndex(i);
		}
		reAdjustTabLocation();
		// resize();
	}

	public void removeAllTabs() {
		tabs.clear();
		for (int i = 0; i < tabs.size(); i++) {
			tabs.get(i).setIndex(i);
		}
		reAdjustTabLocation();
		// resize();
	}

	private void displayTabs(int index) {
		// tabContainer.firePropertyChange(tabContainer., oldValue, newValue)
		// if(panelView != null) {
		// remove(panelView);
		// panelView = null;
		// }
		// panelView = new JxPanel(1f);
		// panelView.setLayout(new BorderLayout());
		// panelView.setBounds(0, 33, 718, 408);
		// panelView.setBackground(Color.WHITE);
		// add(panelView);

		JComponent com = tabs.get(index).getTabComponent();
		com.setOpaque(true);
		// panelView.removeAll();
		// panelView.add(com, BorderLayout.CENTER);
		if (tabStyle.isCompStyled()) {
			panelView.setBorder(tabStyle.getBorder());
		}
		if (tabStyle.isBackgroundPainted()) {
			// if(tabStyle != JxTabStyle.STYLE_4) {
			panelView.setBackground(tabs.get(index).getBackground());
		}
		// view.removeAll();
		view.setBackground(panelView.getBackground());
		view.getViewport().setBackground(panelView.getBackground());
		view.setViewportView(null);
		view.setViewportView(com);
		view.getViewport().setViewPosition(new Point(0, 0));
		if (currentIndex != -1) {
			tabs.get(currentIndex).setSelected(false);
		}
		currentIndex = index;
		tabs.get(currentIndex).setSelected(true);
		// resize();
		panelView.repaint();
		// System.out.println("Action Handled: " + new Date().getTime());
	}

	public void actionPerformed(ActionEvent e) {
		int index = Integer.parseInt(e.getActionCommand());
		if (index != currentIndex) {
			// System.err.println("Action Received: " + new Date().getTime());
			handleTabs(index);
		}
	}

	private void reAdjustTabLocation() {
		int w = this.getWidth();
		this.getHeight();
		for (int i = 0, row = 0, curW = 0, x = 0, y = 0, tabC = 0, rowT = 0; i < tabs
				.size(); i++) {
			final int TAB_WIDTH = tabSize.width;
			final int TAB_HEIGHT = tabSize.height;
			int TAB_SPACE = (int) (TAB_WIDTH * 0.2f);
			if (TAB_SPACE > 20) {
				TAB_SPACE = 20;
			}

			x = 11 + (row * TAB_WIDTH / 4)
					+ ((i - tabC) * (TAB_WIDTH - TAB_SPACE));
			y = tabContainer.getHeight() - ((row + 1) * (TAB_HEIGHT));
			tabs.get(i).setLocation(x, y);
			// System.out.println("tab:" + i + ": " + x + ", " + y);
			curW = x + TAB_WIDTH;
			if (curW + TAB_WIDTH - TAB_SPACE > w) {
				row++;
				tabC = i + 1;
				rowT = i - rowT + 1;
				w = curW;
			}
		}
		tabContainer.repaint();
		// System.err.println("readjusting");
	}

	private Dimension calculateTabContainerSize() {
		int totalTabs = tabs.size();
		int maxW = getWidth();
		int row = 0, x = 0, tabC = 0, curW = 0, rowT = 0;
		final int TAB_WIDTH = tabSize.width;
		final int TAB_HEIGHT = tabSize.height;
		int TAB_SPACE = (int) (TAB_WIDTH * 0.2f);
		if (TAB_SPACE > 20) {
			TAB_SPACE = 20;
		}

		for (int i = 0; i < totalTabs; i++) {
			// x = 11 + (row * 36) + ((i - tabC) * (TAB_WIDTH - TAB_SPACE));
			// curW = x + (TAB_WIDTH);
			// if(curW + (TAB_WIDTH - TAB_SPACE) > aW) {
			// row++;
			// tabC = i + 1;
			// rowT = i - rowT + 1;
			// aW = x + TAB_WIDTH - 22;
			// if(aW < TAB_WIDTH) {
			// aW = TAB_WIDTH;
			// }
			// }
			x = 11 + (row * TAB_WIDTH / 4)
					+ ((i - tabC) * (TAB_WIDTH - TAB_SPACE));
			curW = x + TAB_WIDTH;
			if (curW + TAB_WIDTH - TAB_SPACE > maxW) {
				row++;
				tabC = i + 1;
				rowT = i - rowT + 1;
				maxW = curW;
			}
			// System.out.println(x + ", " + row + ", " + rowT + ", " + tabC +
			// ", " + curW + ", " + aW);
		}
		// System.out.println("tCs:" + getWidth() + ", " + (row + 1) *
		// TAB_HEIGHT);
		return new Dimension(getWidth(), (row + 1) * TAB_HEIGHT);
	}

	public void resize() {
		// tabContainer.setPreferredSize(new Dimension(getWidth(),
		// tabSize.width));
		tabContainer.setSize(calculateTabContainerSize());
		reAdjustTabLocation();
		// if(panelView != null) {
		panelView.setLocation(0, tabContainer.getSize().height);
		panelView.setSize(getWidth(), getHeight()
				- tabContainer.getSize().height);
		// view.setLocation(10, 10);
		view.setSize(getWidth() - 20, getHeight()
				- tabContainer.getSize().height - 20);
		view.getViewport().setViewSize(
				new Dimension(getWidth() - 20, getHeight()
						- tabContainer.getSize().height - 20));
		// System.out.println("tC: " + tabContainer.getX() + ", " +
		// tabContainer.getY() + ", " + tabContainer.getWidth() + ", " +
		// tabContainer.getHeight());
		// System.out.println("pV: " + panelView.getX() + ", " +
		// panelView.getY() + ", " + panelView.getWidth() + ", " +
		// panelView.getHeight());
		// }
		// updateUI();
		repaint();
		// System.out.println("resizing");
	}

	@Override
	public void repaint() {
		// super.repaint();
		// tabContainer.repaint();
		if (currentIndex == -1) {
			handleTabs(currentIndex);
		}
		// System.out.println("repainting");
	}

	/**
	 * @return the tabSize
	 */
	public Dimension getTabSize() {
		return tabSize;
	}

	/**
	 * @param tabSize
	 *            the tabSize to set
	 */
	public void setTabSize(Dimension tabSize) {
		this.tabSize = tabSize;
	}

	/**
	 * @return the tabStyle
	 */
	public JxTabStyle getTabStyle() {
		return tabStyle;
	}

	/**
	 * @param tabStyle
	 *            the tabStyle to set
	 */
	public void setTabStyle(JxTabStyle tabStyle) {
		this.tabStyle = tabStyle;
	}

	public int getSelectedTab() {
		return currentIndex;
	}

	public void setSelectedTab(int index) {
		if (index < tabs.size() && index >= 0) {
			handleTabs(index);
		} else {
			throw new IllegalArgumentException("Index must lie between 0,"
					+ tabs.size() + ".");
		}
	}

	public static void main(String[] a) {
		try {
			UIManager.setLookAndFeel(new Plastic3DLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout(10, 10));
		panel.setSize(600, 600);

		JxTabbedPane tabPane = new JxTabbedPane();
		tabPane.setTabSize(new Dimension(70, 30));
		tabPane.setFont(new Font("Dialog", Font.BOLD, 12));
		tabPane.setBounds(20, 20, 860, 860);
		tabPane.setTabStyle(JxTabbedPane.JxTabStyle.WIN2);

		// tabPane.addTab("AD", null, new
		// PanelMDSAD(MDSAssessmentTypes.ADMISSION_ASSESSMENT));
		// tabPane.addTab("A", null, new
		// PanelMDSA(MDSAssessmentTypes.ADMISSION_ASSESSMENT), new
		// Color(134,134,104));
		// tabPane.addTab("B", null, new
		// PanelMDSB(MDSAssessmentTypes.ADMISSION_ASSESSMENT));
		// tabPane.addTab("C", null, new
		// PanelMDSC(MDSAssessmentTypes.ADMISSION_ASSESSMENT), new
		// Color(128,111,130));
		// tabPane.addTab("D", null, new
		// PanelMDSD(MDSAssessmentTypes.ADMISSION_ASSESSMENT));
		// tabPane.addTab("E", null, new
		// PanelMDSE(MDSAssessmentTypes.ADMISSION_ASSESSMENT), new
		// Color(165,219,4));
		// tabPane.addTab("F", null, new
		// PanelMDSF(MDSAssessmentTypes.ADMISSION_ASSESSMENT));
		// tabPane.addTab("G", null, new
		// PanelMDSG(MDSAssessmentTypes.ADMISSION_ASSESSMENT), new
		// Color(206,65,43));
		// tabPane.addTab("H", null, new
		// PanelMDSH(MDSAssessmentTypes.ADMISSION_ASSESSMENT));
		// tabPane.addTab("AA", null, new
		// PanelMDSAA(MDSAssessmentTypes.ADMISSION_ASSESSMENT), new
		// Color(165,219,4));
		// tabPane.addTab("AB", null, new
		// PanelMDSAB(MDSAssessmentTypes.ADMISSION_ASSESSMENT));
		// tabPane.addTab("AC", null, new
		// PanelMDSAC(MDSAssessmentTypes.ADMISSION_ASSESSMENT), new
		// Color(206,65,43));
		// tabPane.addTab("AD", null, new
		// PanelMDSAD(MDSAssessmentTypes.ADMISSION_ASSESSMENT));
		// tabPane.addTab("A", null, new
		// PanelMDSA(MDSAssessmentTypes.ADMISSION_ASSESSMENT), new
		// Color(134,134,104));
		// tabPane.addTab("B", null, new
		// PanelMDSB(MDSAssessmentTypes.ADMISSION_ASSESSMENT));
		// tabPane.addTab("C", null, new
		// PanelMDSC(MDSAssessmentTypes.ADMISSION_ASSESSMENT), new
		// Color(128,111,130));
		// tabPane.addTab("D", null, new
		// PanelMDSD(MDSAssessmentTypes.ADMISSION_ASSESSMENT));
		// tabPane.addTab("E", null, new
		// PanelMDSE(MDSAssessmentTypes.ADMISSION_ASSESSMENT), new
		// Color(165,219,4));
		// tabPane.addTab("F", null, new
		// PanelMDSF(MDSAssessmentTypes.ADMISSION_ASSESSMENT));
		// tabPane.addTab("G", null, new
		// PanelMDSG(MDSAssessmentTypes.ADMISSION_ASSESSMENT), new
		// Color(206,65,43));
		// tabPane.addTab("H", null, new
		// PanelMDSH(MDSAssessmentTypes.ADMISSION_ASSESSMENT));
		// tabPane.addTab("AA", null, new
		// PanelMDSAA(MDSAssessmentTypes.ADMISSION_ASSESSMENT), new
		// Color(165,219,4));
		// tabPane.addTab("AB", null, new
		// PanelMDSAB(MDSAssessmentTypes.ADMISSION_ASSESSMENT));
		// tabPane.addTab("AC", null, new
		// PanelMDSAC(MDSAssessmentTypes.ADMISSION_ASSESSMENT), new
		// Color(206,65,43));
		// tabPane.addTab("AD", null, new
		// PanelMDSAD(MDSAssessmentTypes.ADMISSION_ASSESSMENT));
		// tabPane.addTab("A", null, new
		// PanelMDSA(MDSAssessmentTypes.ADMISSION_ASSESSMENT), new
		// Color(134,134,104));
		// tabPane.addTab("B", null, new
		// PanelMDSB(MDSAssessmentTypes.ADMISSION_ASSESSMENT));
		// tabPane.addTab("C", null, new
		// PanelMDSC(MDSAssessmentTypes.ADMISSION_ASSESSMENT), new
		// Color(128,111,130));
		// tabPane.addTab("D", null, new
		// PanelMDSD(MDSAssessmentTypes.ADMISSION_ASSESSMENT));
		// tabPane.addTab("E", null, new
		// PanelMDSE(MDSAssessmentTypes.ADMISSION_ASSESSMENT), new
		// Color(165,219,4));
		// tabPane.addTab("F", null, new
		// PanelMDSF(MDSAssessmentTypes.ADMISSION_ASSESSMENT));
		// tabPane.addTab("G", null, new
		// PanelMDSG(MDSAssessmentTypes.ADMISSION_ASSESSMENT), new
		// Color(206,65,43));
		// tabPane.addTab("H", null, new
		// PanelMDSH(MDSAssessmentTypes.ADMISSION_ASSESSMENT));
		panel.add(tabPane);

		tabPane.setSelectedTab(2);
		// final JxTab t = tabPane.new JxTab(0, "AA", null, new
		// PanelMDSEmptyTab("<html>This is AA"));
		// panel.add(t, BorderLayout.CENTER);
		// panel = new JPanel() {
		// public void paint(Graphics g) {
		// super.paint(g);
		// g.setColor(Color.RED);
		// Graphics2D g2 = (Graphics2D) g;
		// g2.fill(t.getTabShape(100, 100, 600, 200, 100));
		// }
		// };
		// tabPane.resize();
		JFrame frame = SwingUtils.wrapInFrame(panel);
		frame.setSize(800, 830);
		frame.setVisible(true);
	}
}
