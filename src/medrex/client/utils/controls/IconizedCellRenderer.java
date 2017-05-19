package medrex.client.utils.controls;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class IconizedCellRenderer implements ListCellRenderer {
	protected DefaultListCellRenderer defaultRenderer = new DefaultListCellRenderer();
	protected Font DEFAULT_FONT;

	public IconizedCellRenderer() {
		super();
		DEFAULT_FONT = null;
	}

	public IconizedCellRenderer(Font f) {
		super();
		DEFAULT_FONT = f;
	}

	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isSelected, boolean cellHasFocus) {
		JLabel renderer = (JLabel) defaultRenderer
				.getListCellRendererComponent(list, value, index, isSelected,
						cellHasFocus);
		if (DEFAULT_FONT != null) {
			renderer.setFont(DEFAULT_FONT);
		}

		if (value instanceof Object[]) {
			Object values[] = (Object[]) value;
			if (values[0] != null) {
				renderer.setText((String) values[0]);
			}
			if (values[1] != null) {
				renderer.setIcon((Icon) values[1]);
			}
			if (values[2] != null) {
				renderer.setFont((Font) values[2]);
			}
			if (values[3] != null) {
				renderer.setForeground((Color) values[3]);
			}
		} else {
			if (value != null) {
				renderer.setText((String) value);
			}
		}
		return renderer;
	}
}
