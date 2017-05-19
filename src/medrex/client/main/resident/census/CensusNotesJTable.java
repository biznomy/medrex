package medrex.client.main.resident.census;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import medrex.commons.vo.census.CensusNotes;

public class CensusNotesJTable extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "User", "Date", "Notes" // , "From" ,"To"
	};

	public List censusNotes;

	int n = 0;

	public CensusNotesJTable(List CensusRecords) {
		censusNotes = CensusRecords;
	}

	public CensusNotesJTable() {
		censusNotes = new ArrayList();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (censusNotes.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List CensusRecords) {
		censusNotes = CensusRecords;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			CensusNotes rc = (CensusNotes) censusNotes.get(row);
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MM / dd / yyyy");
			if (col == 0) {
				return (rc.getUsername());
			}
			if (col == 1) {
				// if(rc.getNotes().length()<20){
				// return (rc.getNotesDate().toString());}
				// else{
				// return(rc.getNotesDate().toString().substring(0,19).concat("...");
				// }
				// // u = Global.ltcServer.getUser(rc.getAdministeredBy());
				// return (u.getUserName());
				return (df.format(rc.getNotesDate()));
			}
			if (col == 2) {
				if (rc.getNotes().length() < 20) {
					return (rc.getNotes().toString());
				} else {
					return (rc.getNotes().toString().substring(0, 19)
							.concat("..."));
				}
				// u = Global.ltcServer.getUser(rc.getAdministeredBy());
				// return (u.getUserName());
			}
			if (col == 3) {
				return (rc.getSerial() + "");
				// u = Global.ltcServer.getUser(rc.getAdministeredBy());
				// return (u.getUserName());
			}
			return ("");
		} catch (Exception e) {
			return ("");
		}
	}
}
