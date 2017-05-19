package medrex.client.utils.controls;

import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class JTableButtonCellEditor extends AbstractCellEditor implements
		TableCellRenderer, TableCellEditor {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7880938816278312778L;
	JTable table;
	JButton renderButton;
	JButton editButton;
	String text;

	public JTableButtonCellEditor() {
		super();
		this.table = table;
		renderButton = new JButton() {
			/**
			 * 
			 */
			private static final long serialVersionUID = -8281848595128912596L;

			@Override
			protected void processMouseEvent(MouseEvent e) {
				try {
					super.processMouseEvent(e);

				} catch (Exception e1) {
					// e1.printStackTrace();
				}
			}
		};
		editButton = new JButton() {
			@Override
			protected void processMouseEvent(MouseEvent e) {

				try {
					super.processMouseEvent(e);
				} catch (Exception e1) {
					// e1.printStackTrace();
				}
			}
		};
		editButton.setFocusPainted(false);
	}

	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {
		if (hasFocus) {
			renderButton.setForeground(table.getForeground());
			renderButton.setBackground(UIManager.getColor("Button.background"));
		} else if (isSelected) {
			renderButton.setForeground(table.getSelectionForeground());
			renderButton.setBackground(table.getSelectionBackground());
		} else {
			renderButton.setForeground(table.getForeground());
			renderButton.setBackground(UIManager.getColor("Button.background"));
		}

		renderButton.setText((value == null) ? "" : value.toString());
		return renderButton;
	}

	public Component getTableCellEditorComponent(JTable table, Object value,
			boolean isSelected, int row, int column) {
		text = (value == null) ? "" : value.toString();
		editButton.setText(text);
		return editButton;
	}

	public Object getCellEditorValue() {
		return text;
	}

	public void addActionListener(ActionListener l) {
		editButton.addActionListener(l);
	}
}
