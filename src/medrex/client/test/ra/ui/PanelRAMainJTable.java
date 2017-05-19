package medrex.client.test.ra.ui;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import medrex.commons.vo.ra.RARecord;

public class PanelRAMainJTable extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4800666017847628041L;

	private String[] columnNames = { "Type" };

	public List<RARecord> records;

	int n = 0;

	PanelRAMainJTable(List<RARecord> records) {
		this.records = records;
	}

	PanelRAMainJTable() {
		this.records = new ArrayList<RARecord>();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		if (records != null) {
			return records.size();
		}
		return 0;
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List<RARecord> records) {
		this.records = records;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern("MM / dd / yyyy");
		try {
			Object o = records.get(row);
			if (o instanceof RARecord) {
				RARecord record = (RARecord) o;

				if (col == 0) {
					return record.getFormName();
				}
				if (col == 1) {
					return record.getRafp1Id() + "";
				}
				if (col == 2) {
					return record.getRafp2Id() + "";
				}

				if (col == 3) {
					return (record.getSerial() + "");
				}

			}
			return ("");
		}

		catch (Exception e) {
			return ("");
		}
	}
}
