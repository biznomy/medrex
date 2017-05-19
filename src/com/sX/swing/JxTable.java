package com.sX.swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class JxTable extends JTable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3671416852632319232L;
	public final static Color DEFAULT_FORE_COLOR = new Color(49, 104, 127);
	public final static Color DEFAULT_BACK_COLOR = Color.WHITE;
	public final static Color SELECTI_FORE_COLOR = DEFAULT_BACK_COLOR;
	public final static Color SELECTI_BACK_COLOR = DEFAULT_FORE_COLOR;
	public final static Font DEFAULT_FONT = new Font("Dialog", Font.PLAIN, 12);
	private JTableHeader header;
	private Border headerBorder;
	private JxTable thisTable;
	private JxTableCellRenderer defaultCellRenderer;
	private LineBorder headerLineBorder;
	private boolean autoColumnWidthAdjust;
	private static boolean isColumnBordered;

	@Override
	public int getSelectedRow() {
		int selRow = super.getSelectedRow();
		if (selRow > -1) {
			return this.convertRowIndexToModel(super.getSelectedRow());
		} else {
			return -1;
		}
	}

	public static class JxTableCellRenderer extends DefaultTableCellRenderer {

		/**
		 * 
		 */
		private static final long serialVersionUID = 2715723184488797705L;

		@Override
		public Component getTableCellRendererComponent(JTable table,
				Object value, boolean isSelected, boolean hasFocus, int row,
				int column) {
			JLabel renderer = (JLabel) super.getTableCellRendererComponent(
					table, value, isSelected, hasFocus, row, column);
			if (value instanceof String) {
				renderer.setHorizontalAlignment(SwingConstants.LEADING);
			} else if (value instanceof Number) {
				renderer.setHorizontalAlignment(SwingConstants.TRAILING);
			} else if (value instanceof Date) {
				renderer.setHorizontalAlignment(SwingConstants.CENTER);
			} else if (value instanceof Component) {
				return (Component) value;
			} else if (value instanceof Icon) {
				renderer.setIcon((Icon) value);
				renderer.setText("");
			} else {
				renderer.setHorizontalAlignment(SwingConstants.LEADING);
			}
			// if(isColumnBordered){
			// renderer.setBorder(BorderFactory.createMatteBorder(0, 1, 0 , 1,
			// ColorConstants.DEF_COLOR));
			// renderer.setHorizontalAlignment(SwingConstants.CENTER);
			// }
			return renderer;
		}
	}

	public void setColumnBordered(boolean isColumnBordered) {
		// System.out.println("setColumn bordered Called"+isColumnBordered);
		JxTable.isColumnBordered = isColumnBordered;
		// setDefaultRenderer(Object.class, new JxTableCellRenderer());
	}

	public JxTable() {
		super();
		thisTable = this;
		setShowGrid(false);
		setShowVerticalLines(false);
		setShowHorizontalLines(false);
		setForeground(DEFAULT_FORE_COLOR);
		setBackground(DEFAULT_BACK_COLOR);
		setSelectionForeground(SELECTI_FORE_COLOR);
		setSelectionBackground(SELECTI_BACK_COLOR);
		setGridColor(SELECTI_BACK_COLOR);
		setFont(DEFAULT_FONT);
		setRowHeight(16);
		setAutoCreateRowSorter(true);

		autoColumnWidthAdjust = true;

		header = getTableHeader();
		header.setReorderingAllowed(false);
		header.setResizingAllowed(false);
		header.setUpdateTableInRealTime(true);
		header.setForeground(DEFAULT_BACK_COLOR);
		header.setBackground(DEFAULT_FORE_COLOR);
		header.setFont(getFont().deriveFont(Font.BOLD));

		// headerBorder = new LineBorder(DEFAULT_FORE_COLOR, 2, false);
		headerBorder = new CompoundBorder(new MatteBorder(0, 0, 1, 0,
				Color.WHITE), new LineBorder(DEFAULT_FORE_COLOR, 2, false));
		header.setBorder(headerBorder);

		defaultCellRenderer = new JxTableCellRenderer();
		setDefaultRenderer(Object.class, defaultCellRenderer);
	}

	@Override
	public void setBackground(Color bg) {
		super.setBackground(bg);
		if (header != null) {
			header.setForeground(bg);
			setSelectionForeground(bg);
		}
	}

	@Override
	public void setForeground(Color fg) {
		super.setForeground(fg);
		if (header != null) {
			header.setBackground(fg);
			header.setBorder(new CompoundBorder(new MatteBorder(0, 0, 1, 0,
					Color.WHITE), new LineBorder(fg, 2, false)));
			setSelectionBackground(fg);
			setGridColor(fg);
		}
	}

	@Override
	public void setFont(Font font) {
		super.setFont(font);
		if (header != null) {
			header.setFont(font);
		}
	}

	public void setAutoColumnWidthAdjust(boolean autoColumnWidthAdjust) {
		this.autoColumnWidthAdjust = autoColumnWidthAdjust;
	}

	public boolean isAutoColumnWidthAdjust() {
		return autoColumnWidthAdjust;
	}

	@Override
	public void repaint() {
		super.repaint();
		try {
			if (autoColumnWidthAdjust) {
				adjustColumnPreferredWidths(thisTable);
			}
		} catch (Exception e) {
		}
	}

	private static void adjustColumnPreferredWidths(JTable table) {
		// strategy - get max width for cells in column and
		// make that the preferred width
		TableColumnModel columnModel = table.getColumnModel();

		for (int col = 0; col < table.getColumnCount(); col++) {

			int maxwidth = 0;
			tableHeader: {
				TableCellRenderer rend = table.getTableHeader()
						.getDefaultRenderer();
				((JComponent) rend).setBorder(new EmptyBorder(3, 5, 3, 5));
				Object value = table.getModel().getColumnName(col);
				Component comp = rend.getTableCellRendererComponent(table,
						value, false, false, 0, col);
				maxwidth = Math.max(comp.getPreferredSize().width, maxwidth);
			}
			for (int row = 0; row < table.getRowCount(); row++) {
				TableCellRenderer rend = table.getCellRenderer(row, col);
				((JComponent) rend).setBorder(new EmptyBorder(3, 5, 3, 5));
				Object value = table.getValueAt(row, col);
				Component comp = rend.getTableCellRendererComponent(table,
						value, false, false, row, col);
				maxwidth = Math.max(comp.getPreferredSize().width, maxwidth);
			} // for row
			TableColumn column = columnModel.getColumn(col);
			column.setPreferredWidth(maxwidth);
		} // for col
	}
}
