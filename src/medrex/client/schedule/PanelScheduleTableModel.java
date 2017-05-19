package medrex.client.schedule;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import medrex.commons.vo.schedule.Schedule;

public class PanelScheduleTableModel extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8475392794787147252L;
	private List<Schedule> records;
	private static final DateFormat dateFormat = new SimpleDateFormat(
			"MM-dd-yyyy ");

	public List<Schedule> getRecords() {
		return records;
	}

	public void setRecords(List<Schedule> records) {
		this.records = records;
	}

	public String[] getColumnNames() {
		return columnName;
	}

	public void setColumnNames(String[] columnNames) {
		columnName = columnNames;
	}

	private String[] columnName = { "From Date", "To Date" };

	public int getRowCount() {
		if (records != null) {
			return records.size();
		}
		return 0;
	}

	public int getColumnCount() {
		if (columnName != null) {
			return columnName.length;
		}
		return 0;
	}

	@Override
	public String getColumnName(int col) {
		if (columnName != null) {
			return columnName[col];
		}
		return "";
	}

	public Object getValueAt(int row, int col) {
		if (records != null) {
			try {
				Schedule obj = records.get(row);
				if (obj != null) {
					switch (col) {
					case 0:
						return dateFormat.format(obj.getFromDate());
					case 1:
						return dateFormat.format(obj.getToDate());
					case 2:
						return obj.getSerial();
					case 3:
						return obj.getFromDate();
					case 4:
						return obj.getToDate();
					}
				}
			} catch (Exception e) {
				return "";
			}
		}
		return "";
	}

}
