package medrex.client.utils;

import javax.swing.table.AbstractTableModel;

import medrex.commons.intf.ControllerTableModel;

public class MedrexTableModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5812121049140008935L;
	ControllerTableModel controllerTableModel;

	public MedrexTableModel(ControllerTableModel controllerTableModel) {
		this.controllerTableModel = controllerTableModel;
	}

	public int getColumnCount() {
		return controllerTableModel.getColumnCount();
	}

	public int getRowCount() {
		return controllerTableModel.getRowCount();
	}

	public void setRowCount(int count) {

	}

	@Override
	public String getColumnName(int col) {
		return (controllerTableModel.getColumnName(col));
	}

	// public void addOrderElement(OrderElementForm orderElementForm) {
	// orderElements.add(orderElementForm);
	// }

	// public void deleteOrderElement(int rowNum) {
	// orderElements.remove(rowNum);
	// }

	// public void updateOrderElement(OrderElementForm orderElementForm, int i)
	// {
	// OrderElementForm tempO = (OrderElementForm) orderElements.remove(i);
	// orderElementForm.setSerial(tempO.getSerial());
	// orderElements.add(i, orderElementForm);
	// }

	public Object getValueAt(int row, int col) {
		return controllerTableModel.getValueAt(row, col);
	}
}
