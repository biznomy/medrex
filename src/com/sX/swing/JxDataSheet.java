/**
 * 
 */
package com.sX.swing;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

import medrex.commons.enums.ColorConstants;

import com.sX.event.TableEventListener;
import com.sX.utils.ShapeUtils;

/**
 * @author D S Naruka <BR>
 *         <A href="mailto:dsn.naruka@gmail.com">mailto:dsn.naruka@gmail.com</A>
 * 
 */
public class JxDataSheet extends JxComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1835808662299400507L;

	public static enum JxDataSheetStyle {
		DEFAULT(new Color(160, 179, 193), new Color(133, 155, 176), 10,
				new Color(61, 89, 101), Color.white, new Color[][] {
						new Color[] { new Color(82, 109, 118),
								new Color(168, 188, 197) },
						new Color[] { new Color(82, 109, 118), Color.WHITE } }), BLUE(
				new Color(160, 179, 193), new Color(133, 155, 176), 3,
				new Color(11, 39, 51), Color.white, new Color[][] {
						new Color[] { new Color(82, 109, 118),
								new Color(168, 188, 197) },
						new Color[] { new Color(82, 109, 118), Color.WHITE } });

		private Color borderColor01;
		private Color borderColor02;
		private Color foreground;
		private Color background;
		private Color[][] rowColors;
		private int borderThickness;

		private JxDataSheetStyle(Color borderColor01, Color borderColor02,
				int borderThickness, Color foreground, Color background,
				Color[][] rowColors) {
			this.borderColor01 = borderColor01;
			this.borderColor02 = borderColor02;
			this.borderThickness = borderThickness;
			this.foreground = foreground;
			this.background = background;
			this.rowColors = rowColors;
		}
	}

	// private Shape shape;
	// private float arc;
	// private float scale;
	private JLabel label;
	private JLabel generalLabel;
	private JxDataSheetStyle style;
	private JxTable dataTable;
	private boolean collapsed;
	private boolean isAnimating;
	private Timer timer;
	private JScrollPane scrollPane;
	private Dimension originalSize;
	private JButton btnCollapser;
	private ImageIcon icoNotCollapsed = new ImageIcon(
			"img/icons/collapse_-.png");
	private ImageIcon icoCollapsed = new ImageIcon("img/icons/collapse_+.png");
	private JPanel panelCenter;
	private String heading;
	private JPanel panel;
	private String icon;
	private boolean isBorderd;

	public JxDataSheet() {
		super();
		setLayout(new BorderLayout());
		setOpaque(false);
		arc = 1.5f;
		style = JxDataSheetStyle.DEFAULT;
		panel = new JPanel();
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(0, 30));
		panel.setOpaque(false);
		add(panel, BorderLayout.NORTH);

		// label = new JLabel(new ImageIcon("img/dashboard/comIcon.png"));
		// label.setText("");
		// label.setBounds(28, 1, 25, 25);
		// panel.add(label);

		btnCollapser = new JButton(icoNotCollapsed);
		btnCollapser.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				btnCollapser.setEnabled(false);
				setCollapsed(!collapsed);
			}
		});
		btnCollapser.setText("");
		btnCollapser.setBackground(new Color(90, 148, 63, 0));
		btnCollapser.setBounds(12, 10, 12, 10);
		btnCollapser.setBorderPainted(false);
		btnCollapser.setOpaque(false);
		panel.add(btnCollapser);

		panelCenter = new JPanel();
		panelCenter.setLayout(new BorderLayout());
		panelCenter.setOpaque(false);
		// panelCenter.setBorder(new LineBorder(Color.RED, 1, false));
		add(panelCenter, BorderLayout.CENTER);

		scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.getViewport().setOpaque(false);
		// scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		// scrollPane.setViewportBorder(new EmptyBorder(0, 0, 0, 0));
		panelCenter.add(scrollPane, BorderLayout.CENTER);

		dataTable = new JxTable() {
			/**
			 * 
			 */
			private static final long serialVersionUID = -7181450097940967935L;

			@Override
			public void repaint() {
				try {
					adjustColumnPreferredWidths(dataTable);
				} catch (Exception e) {
				}
			}

			@Override
			public void paint(Graphics g) {
				super.paint(g);
				paintEmptyRows(g);
			}

			protected void paintEmptyRows(Graphics g) {
				final int rowCount = getRowCount();
				final int colCount = getColumnCount();
				final Rectangle clip = g.getClipBounds();
				if (rowCount * rowHeight < clip.height) {
					for (int i = rowCount; i <= clip.height / rowHeight; ++i) {
						g.setColor(style.rowColors[i
								% style.rowColors[1].length][1]);
						g
								.fillRect(clip.x, i * rowHeight, clip.width,
										rowHeight);
						int x = clip.x;
						for (int j = 0; j < colCount; ++j) {
							int w = this.getColumnModel().getColumn(j)
									.getWidth();
							x += w;
							Component com = JxDataSheet.this
									.getTableCellRendererComponent(dataTable,
											"", false, false, i, j + 1);
							com.setSize(w, rowHeight);
							com.setPreferredSize(new Dimension(w, rowHeight));
							Graphics gSub = g.create(x, i * rowHeight, w,
									rowHeight);
							com.print(gSub);
						}
					}
				}
			}
		};
		dataTable.setOpaque(false);
		dataTable.setDefaultRenderer(Object.class, new TableCellRenderer() {
			public Component getTableCellRendererComponent(JTable table,
					Object value, boolean isSelected, boolean hasFocus,
					int row, int column) {
				return JxDataSheet.this.getTableCellRendererComponent(
						dataTable, value, isSelected, hasFocus, row, column);
			}
		});
		dataTable.setModel(new TempDataModel());
		dataTable.getTableHeader().setVisible(false);
		dataTable.getTableHeader().setPreferredSize(new Dimension(2, 0));
		dataTable.setShowVerticalLines(true);
		dataTable.setShowHorizontalLines(true);
		dataTable.setAutoColumnWidthAdjust(false);
		dataTable.setFillsViewportHeight(true);
		dataTable.setIntercellSpacing(new Dimension(0, 0));
		dataTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				fireMouseEvent(dataTable.getSelectedRow(), dataTable
						.getSelectedColumn(), e);
			}
		});
		scrollPane.setViewportView(dataTable);

		final JPanel panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(0, (int) (arc * 15)));
		panel_2.setOpaque(false);
		add(panel_2, BorderLayout.SOUTH);

		setMinimumSize(new Dimension(270, (int) (arc * 48)));
		setMaximumSize(new Dimension(270, 178));
	}

	public boolean isBorderd() {
		return isBorderd;
	}

	public void setBorderd(boolean isBorderd) {
		// System.out.println("Set Bordered Called"+isBorderd);
		this.isBorderd = isBorderd;
		dataTable.setColumnBordered(isBorderd);
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
		label = new JLabel(new ImageIcon(icon));
		label.setText("");
		label.setBounds(28, 1, 25, 25);
		panel.add(label);
	}

	public Component getTableCellRendererComponent(final JxTable table,
			final Object value, final boolean isSelected,
			final boolean hasFocus, final int row, final int column) {
		JLabel renderer = new JLabel();

		renderer.setText((String) value);
		renderer.setOpaque(true);
		renderer.setForeground(table.getForeground());
		renderer.setBackground(table.getBackground());
		// renderer.setBorder(new EmptyBorder(0, 4, 0, 4));
		if (isBorderd && (column != 0 /* && column !=2) */)) {
			renderer.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0,
					ColorConstants.DEF_COLOR));
			renderer.setHorizontalAlignment(SwingConstants.CENTER);
		}
		if (style.rowColors.length > 0) {
			renderer.setForeground(style.rowColors[row
					% style.rowColors[0].length][0]);
			renderer.setBackground(style.rowColors[row
					% style.rowColors[1].length][1]);
		}

		if (value instanceof String) {
			renderer.setHorizontalAlignment(SwingConstants.LEADING);
		} else if (value instanceof Number) {
			renderer.setHorizontalAlignment(SwingConstants.TRAILING);
		} else if (value instanceof Date) {
			renderer.setHorizontalAlignment(SwingConstants.CENTER);
		} else {
			renderer.setHorizontalAlignment(SwingConstants.LEADING);
		}

		if (column > 0) {
			renderer.setHorizontalAlignment(SwingConstants.CENTER);
			renderer.setPreferredSize(new Dimension(120, table.getRowHeight()));
		}

		if (isSelected) {
			renderer.setForeground(table.getSelectionForeground());
			renderer.setBackground(table.getSelectionBackground());
		}

		return renderer;
	}

	public void addTableEventListener(TableEventListener l) {
		listenerList.add(TableEventListener.class, l);
	}

	public TableEventListener[] getTableEventListeners() {
		return listenerList.getListeners(TableEventListener.class);
	}

	protected void fireMouseEvent(int row, int column, MouseEvent event) {
		TableEventListener[] listeners = getTableEventListeners();
		for (TableEventListener l : listeners) {
			l.mouseClick(row, column, event);
		}
	}

	@Override
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		Shape shape = getShape();
		float scale = getScale();
		float arcScale = arc * scale;

		Paint paint = new GradientPaint(new Point(0, 0), style.borderColor01,
				new Point(0, getHeight()), style.borderColor02);
		g2.setPaint(paint);
		g2.fill(shape);
		int bMar = (int) (style.borderThickness / 1.8f);

		paint = new GradientPaint(new Point(0, 0), new Color(255, 255, 255, 0),
				new Point(0, getHeight() / 2), new Color(255, 255, 255, 200),
				true);
		g2.setPaint(paint);
		g2.fill(shape);

		// style.borderColor01.darker()
		g2.setColor(style.borderColor01.darker());
		g2.setStroke(new BasicStroke(2));
		g2.draw(ShapeUtils.getComWidgetShape(0.5, 0.5, getWidth() - 1,
				getHeight() - 1, arcScale));
		g2.setStroke(new BasicStroke(1));

		Shape innerBorderShape = ShapeUtils.getComWidgetShape(bMar, bMar,
				getWidth() - (2 * bMar), getHeight() - (2 * bMar), arcScale);
		paint = new GradientPaint(new Point(bMar, bMar), new Color(255, 255,
				255, 0), new Point((getWidth() - (2 * bMar)) / 2, bMar),
				new Color(255, 255, 255, 220), true);
		g2.setPaint(paint);
		g2.fill(innerBorderShape);
		paint = new GradientPaint(new Point(bMar, bMar), new Color(255, 255,
				255, 80), new Point(bMar, getHeight()), style.borderColor02);
		g2.setPaint(paint);
		g2.fill(innerBorderShape);

		g2.setColor(style.background);
		Shape container = ShapeUtils.getComWidgetShape(style.borderThickness,
				style.borderThickness,
				getWidth() - (2 * style.borderThickness), getHeight()
						- (2 * style.borderThickness), arcScale);

		g2.fill(container);
		g2.setColor(style.foreground);
		g2.draw(container);

		// super.setBorder(new EmptyBorder(style.borderThickness - 3,
		// style.borderThickness + 1, style.borderThickness,
		// style.borderThickness));
		super.paint(g);
	}

	private static void adjustColumnPreferredWidths(JTable table) {
		TableColumnModel columnModel = table.getColumnModel();
		for (int col = 1; col < table.getColumnCount(); col++) {
			TableColumn column = columnModel.getColumn(col);
			column.setPreferredWidth(5);
		}
	}

	@Override
	public Shape getShape() {
		shape = ShapeUtils.getComWidgetShape(0, 0, getWidth(), getHeight(), arc
				* scale);
		return shape;
	}

	@Override
	public void setShape(Shape shape) {
		throw new IllegalStateException(
				"setShape method can't be used in JxDataSheet component");
	}

	@Override
	public float getScale() {
		if (scale == 0) {
			scale = (50f / 30f) * getFont().getSize2D();
		}
		return scale;
	}

	public void setModel(TableModel model) {
		dataTable.setModel(model);
	}

	public TableModel getModel() {
		return dataTable.getModel();
	}

	@Override
	public void setScale(float scale) {
		if (scale > 0) {
			this.scale = scale;
		}
	}

	@Override
	public void setFont(Font font) {
		super.setFont(font);
		scale = (50f / 30f) * getFont().getSize2D();
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
		generalLabel = new JLabel(heading);
		// generalLabel.setText();
		generalLabel.setBounds(59, 8, 421, 16);
		generalLabel.setFont(new Font("Arial", Font.BOLD, 15));
		generalLabel.setForeground(this.style.foreground);
		panel.add(generalLabel);
	}

	public void setCollapsed(boolean collapsed) {
		this.collapsed = collapsed;

		if (collapsed) {
			if (!isAnimating) {
				// shrink
				isAnimating = true;
				final Dimension dim = JxDataSheet.this.getPreferredSize();
				final Dimension size = JxDataSheet.this.getSize();
				Math.max(dim.width, size.width);
				final int height = Math.max(dim.height, size.height);
				final int minHeight = (int) (arc * 48);

				timer = new Timer(20, new ActionListener() {
					private int i = 10;

					public void actionPerformed(ActionEvent e) {
						int curH = height - i;
						int toInc = Math.min(10, curH - minHeight);
						// int centerH = (int) Math.min(curH - (arc * 15) + 30,
						// 0);
						// panelCenter.setPreferredSize(new Dimension(dim.width,
						// centerH));
						// scrollPane.setPreferredSize(panelCenter.getPreferredSize());
						if (curH > minHeight) {
							JxDataSheet.this.setSize(size.width, height
									- (i += toInc));
							JxDataSheet.this.setPreferredSize(new Dimension(
									dim.width, height - (i += toInc)));
						} else {
							JxDataSheet.this.setSize(size.width, minHeight);
							JxDataSheet.this.setPreferredSize(new Dimension(
									dim.width, minHeight));
							stopIt();
							btnCollapser.setIcon(icoCollapsed);
							btnCollapser.setEnabled(true);
							panelCenter.setVisible(false);
						}
						updateParent();
					}
				});
				timer.setInitialDelay(1);
				timer.setRepeats(true);
				timer.start();
				isAnimating = false;
			}
		} else {
			if (!isAnimating) {
				// grow
				isAnimating = true;
				final Dimension dim = JxDataSheet.this.getPreferredSize();
				final Dimension size = JxDataSheet.this.getSize();
				Math.max(dim.width, size.width);
				final int height = Math.max(dim.height, size.height);
				final int maxHeight = getMaximumSize().height;

				panelCenter.setVisible(true);
				timer = new Timer(20, new ActionListener() {
					private int i = 10;

					public void actionPerformed(ActionEvent e) {
						int curH = height + i;
						int toInc = Math.min(10, maxHeight - curH);
						// int centerH = (int) Math.min(curH - (arc * 15) + 30,
						// 0);
						// panelCenter.setPreferredSize(new Dimension(dim.width,
						// centerH));
						// scrollPane.setPreferredSize(panelCenter.getPreferredSize());
						if (curH < maxHeight) {
							JxDataSheet.this.setSize(size.width, height
									+ (i += toInc));
							JxDataSheet.this.setPreferredSize(new Dimension(
									dim.width, height + (i += toInc)));
						} else {
							JxDataSheet.this.setSize(size.width, maxHeight);
							JxDataSheet.this.setPreferredSize(new Dimension(
									dim.width, maxHeight));
							stopIt();
							btnCollapser.setIcon(icoNotCollapsed);
							btnCollapser.setEnabled(true);
						}
						updateParent();
					}
				});
				timer.setInitialDelay(1);
				timer.setRepeats(true);
				timer.start();
				isAnimating = false;
			}
		}
	}

	public void stopIt() {
		if (timer != null) {
			timer.stop();
		}
	}

	public void updateParent() {
		Container parentCom = getParent();
		if (parentCom != null) {
			JComponent parent = (JComponent) parentCom;
			parent.updateUI();
		}
	}

	public boolean isCollapsed() {
		return collapsed;
	}

	@Override
	public boolean contains(Point p) {
		return this.contains(p.x, p.y);
	}

	@Override
	public boolean contains(int x, int y) {
		shape = getShape();
		return this.shape.contains(x, y);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setSize(300, 1024);

		JxDataSheet jxDataSheet = new JxDataSheet();
		jxDataSheet.setFont(new Font("Dialog", Font.PLAIN, 11));
		jxDataSheet.setBounds(10, 200, 250, 400);
		jxDataSheet.setPreferredSize(jxDataSheet.getSize());
		jxDataSheet.setMaximumSize(jxDataSheet.getSize());
		jxDataSheet.setBorderd(true);
		// jxDataSheet.setBorder(new LineBorder(new Color(23, 86, 111), 2,
		// false));
		// jxDataSheet.setBackground(new Color(129, 160, 172));
		// jxDataSheet.setForeground(new Color(23, 86, 111));
		// jxDataSheet.setBorder(null);
		jxDataSheet.setModel(new TempDataModel());
		frame.getContentPane().add(jxDataSheet);

		final JLabel comLabel = new JLabel(new ImageIcon(
				"img/dashboard/comGeneral.png"));
		comLabel.setBounds(10, 10, 270, 178);
		comLabel.setPreferredSize(comLabel.getSize());
		frame.getContentPane().add(comLabel);

		frame.setVisible(true);
	}
}

class TempDataModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8115482323228847453L;

	private String[] cols = new String[] { "Particulars", "Done", "Not Done" };

	private String[][] data;

	public TempDataModel() {
		data = new String[][] { new String[] { "Data 01, Data 02" },
				new String[] { "Data 01, Data 02" },
				new String[] { "Data 01, Data 02" },
				new String[] { "Data 01, Data 02" } };
	}

	public int getColumnCount() {
		return cols.length;
	}

	@Override
	public String getColumnName(int column) {
		return cols[column];
	}

	public int getRowCount() {
		return 5;
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		return "5";
	}
}
