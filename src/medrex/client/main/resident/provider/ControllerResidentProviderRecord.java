package medrex.client.main.resident.provider;

import java.util.ArrayList;
import java.util.List;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.commons.intf.ControllerTableModel;
import medrex.commons.vo.providers.ProvidersRecord;
import medrex.commons.vo.providers.ProvidersRecordForm;

public class ControllerResidentProviderRecord implements ControllerTableModel {

	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "Provider Name", "Provider Type",
			"Provider Phone" };

	public List l;

	int n = 0;

	private void ResidentProviderJTable(List l1) {
		l = l1;
	}

	private void ResidentProviderJTable() {
		l = new ArrayList();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (l.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List ls) {
		l = ls;
	}

	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			ProvidersRecord pr = (ProvidersRecord) l.get(row);
			if (col == 0) {
				ProvidersRecordForm p = MedrexClientManager.getInstance()
						.getProvidersRecordForm(pr.getProvider().getSerial());

				return p.getProviderSurName() + ", " + p.getProviderName();

			}
			if (col == 1) {
				ProvidersRecordForm p = MedrexClientManager.getInstance()
						.getProvidersRecordForm(pr.getProvider().getSerial());
				return p.getProviderType();
			}

			if (col == 2) {

				ProvidersRecordForm p = MedrexClientManager.getInstance()
						.getProvidersRecordForm(pr.getProvider().getSerial());
				return p.getPhoneNumber();
			}

			if (col == 3) {

				return pr.getSerial();
			}

			return ("");
		} catch (Exception e) {
			return ("");
		}

	}

}
