package medrex.client.admin.security;

import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class RadioButtonRenderer extends RadioButtonPanel implements
		TableCellRenderer {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4657099126004153311L;

	RadioButtonRenderer(String[] strs) {
		super(strs);
	}

	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {
		if (value instanceof Integer) {
			setSelectedIndex(((Integer) value).intValue());
		}
		return this;
	}
}
