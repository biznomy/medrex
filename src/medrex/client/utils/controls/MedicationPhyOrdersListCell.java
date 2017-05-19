package medrex.client.utils.controls;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class MedicationPhyOrdersListCell extends JPanel implements
		ListCellRenderer {
	/**
	 * 
	 */
	private static final long serialVersionUID = -151705398264652037L;
	private JLabel selRectagle;
	private JLabel lblMedicationTime;
	private JLabel lblResidentName;

	public MedicationPhyOrdersListCell() {
		setLayout(null);
		setSize(706, 50);
		add(getSelRectagle());
		add(getLblResidentName());
		add(getLblMedicationTime());
	}

	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isSelected, boolean cellHasFocus) {

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

		setComponentOrientation(list.getComponentOrientation());

		/*
		 * JList.DropLocation dropLocation = list.getDropLocation(); if
		 * (dropLocation != null && !dropLocation.isInsert() &&
		 * dropLocation.getIndex() == index) {
		 * 
		 * bg = UIManager.getColor("List.dropCellBackground"); fg =
		 * UIManager.getColor("List.dropCellForeground");
		 * 
		 * isSelected = true; }
		 */
		selRectagle.setVisible(isSelected);
		setBackground(list.getBackground());
		setForeground(list.getForeground());

		/*
		 * if (isSelected) { setBackground(bg == null ?
		 * list.getSelectionBackground() : bg); setForeground(fg == null ?
		 * list.getSelectionForeground() : fg); } else {
		 * setBackground(list.getBackground());
		 * setForeground(list.getForeground()); }
		 */
		Border border = null;
		if (cellHasFocus) {
			if (isSelected) {
				border = UIManager
						.getBorder("List.focusSelectedCellHighlightBorder");
			}
			if (border == null) {
				border = UIManager.getBorder("List.focusCellHighlightBorder");
			}
		} else {
			border = new EmptyBorder(1, 1, 1, 1);
		}

		setEnabled(list.isEnabled());
		setFont(list.getFont());
		int tmpInt = (list.getBounds().width - 20) / 2;
		lblResidentName.setBounds(10, 10, tmpInt, 30);
		lblMedicationTime.setBounds(tmpInt, 10, tmpInt, 30);
		selRectagle.setSize(list.getBounds().width - 10, 40);
		return this;
	}

	/**
	 * @return
	 */
	protected JLabel getSelRectagle() {
		if (selRectagle == null) {
			selRectagle = new JLabel();
			selRectagle.setBorder(new LineBorder(new Color(51, 102, 204), 3,
					true));
			selRectagle.setFont(new Font("", Font.BOLD, 16));
			selRectagle.setText("");
			selRectagle.setBounds(5, 5, 696, 40);
		}
		return selRectagle;
	}

	protected JLabel getLblResidentName() {
		if (lblResidentName == null) {
			lblResidentName = new JLabel();
			lblResidentName.setFont(new Font("", Font.BOLD, 20));
			lblResidentName.setText("");
			lblResidentName.setBounds(10, 10, 489, 30);
		}
		return lblResidentName;
	}

	/**
	 * @return
	 */
	protected JLabel getLblMedicationTime() {
		if (lblMedicationTime == null) {
			lblMedicationTime = new JLabel();
			lblMedicationTime.setFont(new Font("", Font.BOLD, 14));
			lblMedicationTime.setHorizontalAlignment(SwingConstants.RIGHT);
			lblMedicationTime.setText("");
			lblMedicationTime.setBounds(500, 10, 196, 30);
		}
		return lblMedicationTime;
	}
}
