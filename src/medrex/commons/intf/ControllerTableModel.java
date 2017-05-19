package medrex.commons.intf;

public interface ControllerTableModel {

	public int getColumnCount();

	public int getRowCount();

	public String getColumnName(int col);

	public Object getValueAt(int row, int col);

}
