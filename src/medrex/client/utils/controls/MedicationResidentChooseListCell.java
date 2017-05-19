package medrex.client.utils.controls;

import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.sX.swing.JxPanel;

public class MedicationResidentChooseListCell implements ListCellRenderer {

	public Component getListCellRendererComponent(final JList list,
			final Object value, final int index, final boolean isSelected,
			final boolean cellHasFocus) {

		final JxPanel cell = new JxPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = -8442523508966898097L;

			@Override
			public void paint(Graphics g) {
				super.paint(g);
				setOpaque(false);
				Graphics2D g2 = (Graphics2D) g;
				g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
						RenderingHints.VALUE_ANTIALIAS_ON);

				GradientPaint bg = null;
				if (isSelected) {
					bg = new GradientPaint(new Point(0, 0), list
							.getForeground().brighter(), new Point(0, list
							.getHeight()), list.getForeground().darker());
				} else {
					bg = new GradientPaint(new Point(0, 0), list
							.getBackground().brighter(), new Point(0, list
							.getHeight()), list.getBackground().darker());
				}
				g2.setPaint(bg);
				g2.fill(this.getShape());
				this.drawBorder(g2);
				super.paintChildren(g);
			}
		};

		JLabel lblResidentName = new JLabel();
		lblResidentName.setBorder(new EmptyBorder(0, 10, 0, 10));
		lblResidentName.setFont(list.getFont());
		lblResidentName.setSize(list.getWidth() - (int) (cell.getArc() * 10),
				list.getFixedCellHeight() - 10 - (int) (cell.getArc() * 10));
		lblResidentName.setText("");
		lblResidentName.setBounds(10, 10, 357, 30);

		JLabel lblMedicationTime = new JLabel();
		lblResidentName.setBorder(new EmptyBorder(0, 10, 0, 10));
		lblResidentName.setFont(list.getFont());
		lblResidentName.setSize(list.getWidth() - (int) (cell.getArc() * 10),
				list.getFixedCellHeight() - 10 - (int) (cell.getArc() * 10));
		lblMedicationTime.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMedicationTime.setText("");
		lblMedicationTime.setBounds(367, 10, 329, 30);
		cell.setLayout(null);
		cell.add(lblResidentName);
		cell.add(lblMedicationTime);

		if (value instanceof Object[]) {
			Object values[] = (Object[]) value;
			if (values[1] != null) {
				lblResidentName.setText((String) values[1]);
			}
			if (values[3] != null) {
				lblMedicationTime.setText((String) values[3]);
			}
		} else {
			if (value != null) {
				lblResidentName.setText((String) value);
			}
		}

		cell.setComponentOrientation(list.getComponentOrientation());

		int tmpInt = (list.getBounds().width - 20) / 2;
		lblResidentName.setBounds(10, 10, tmpInt, 30);
		lblMedicationTime.setBounds(tmpInt, 10, tmpInt, 30);
		return cell;
	}
}
