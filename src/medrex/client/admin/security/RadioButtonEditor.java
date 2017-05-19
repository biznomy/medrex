package medrex.client.admin.security;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;

public class RadioButtonEditor extends DefaultCellEditor implements
		ItemListener, ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1809807927109601688L;
	RadioButtonPanel panel;

	public RadioButtonEditor(JCheckBox checkBox, RadioButtonPanel panel) {
		super(checkBox);
		this.panel = panel;
		ButtonGroup buttonGroup = new ButtonGroup();
		JRadioButton[] buttons = panel.getButtons();
		for (int i = 0; i < buttons.length; i++) {
			buttonGroup.add(buttons[i]);
			// buttons[i].addItemListener(this);
			buttons[i].addActionListener(this);
		}
	}

	@Override
	public Component getTableCellEditorComponent(JTable table, Object value,
			boolean isSelected, int row, int column) {
		if (value instanceof Integer) {
			panel.setSelectedIndex(((Integer) value).intValue());
		}
		return panel;
	}

	@Override
	public Object getCellEditorValue() {
		return new Integer(panel.getSelectedIndex());
	}

	public void itemStateChanged(ItemEvent e) {
		super.fireEditingStopped();
	}

	public void actionPerformed(ActionEvent ae) {
		super.fireEditingStopped();
	}
}
