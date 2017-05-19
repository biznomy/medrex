package medrex.client.providers;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.utils.MedrexValidation;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.Controller;
import medrex.commons.intf.ControllerTableModel;
import medrex.commons.vo.providers.ProvidersRecordForm;

public class ControllerProvider implements Controller, ControllerTableModel {

	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "Provider Type", "Provider Name",
			"Provider Phone" };

	int n = 0;

	int currentProviderRecordFormKey = 0;
	private String startDate;
	private int providerSerial;

	private List errorList;
	private String type;

	List<ProvidersRecordForm> currentProviderRecordFormList = new ArrayList<ProvidersRecordForm>();

	public List<String> doValidate(Object bean, String field) {
		ProvidersRecordForm providersRecordForm = (ProvidersRecordForm) bean;
		MedrexValidation medrexValidation = new MedrexValidation();
		errorList = new ArrayList();

		// if (field.equals("providerName") || field.equals("")) {
		// medrexValidation.checkRangeValidation(providersRecordForm.getProviderName(),
		// 1, 20, "Name", errorList);
		// }
		//		
		if (field.equals("providerType") || field.equals("")) {
			if (providersRecordForm.getProviderType() != null) {
				medrexValidation
						.checkRequiredValidation(providersRecordForm
								.getProviderType().toString().trim(), "Type",
								errorList);
			}
		}

		if (field.equals("providerSurName") || field.equals("")) {
			if (!providersRecordForm.getProviderSurName().equalsIgnoreCase("")) {
				medrexValidation
						.checkRangeValidation(providersRecordForm
								.getProviderSurName(), 1, 10, "Contact Name",
								errorList);
			}
		}

		if (field.equals("address") || field.equals("")) {
			medrexValidation.checkRangeValidation(providersRecordForm
					.getAddress(), 5, 50, "Address", errorList);
		}

		if (field.equals("city") || field.equals("")) {
			medrexValidation.checkRangeValidation(
					providersRecordForm.getCity(), 1, 10, "City", errorList);
		}

		if (field.equals("zip") || field.equals("")) {
			medrexValidation.checkRangeValidation(providersRecordForm.getZip(),
					9, 9, "Zip", errorList);
		}

		if (field.equals("phoneNumber") || field.equals("")) {
			medrexValidation.checkRangeValidation(providersRecordForm
					.getPhoneNumber(), 10, 10, "Phone Number", errorList);
		}

		if (field.equals("fax") || field.equals("")) {
			medrexValidation.checkRangeValidation(providersRecordForm.getFax(),
					10, 10, "Fax", errorList);
		}

		if (field.equals("cellNumber") || field.equals("")) {
			medrexValidation.checkRangeValidation(providersRecordForm
					.getCellNumber(), 10, 10, "Fax", errorList);
		}

		if (field.equals("emailAddress") || field.equals("")) {
			medrexValidation.checkEmailValidation(providersRecordForm
					.getEmailAddress(), "Email Address", errorList);
		}

		if (field.equals("state") || field.equals("")) {
			if (providersRecordForm.getState() != null) {
				medrexValidation.checkRequiredValidation(providersRecordForm
						.getState().toString().trim(), "State", errorList);
			}
		}

		return errorList;
	}

	public void ProvidersJTable(List ls) {
		currentProviderRecordFormList = ls;
	}

	public void ProvidersJTable() {
		currentProviderRecordFormList = new ArrayList();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {

		return (currentProviderRecordFormList.size());

	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List listDoctors) {
		currentProviderRecordFormList = listDoctors;
	}

	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			ProvidersRecordForm rc = currentProviderRecordFormList.get(row);

			if (col == 0) {
				return (rc.getProviderType());
			}
			if (col == 1) {
				return (rc.getProviderSurName() + ", " + rc.getProviderName());
			}
			if (col == 2) {
				return (rc.getPhoneNumber() + "");
			}

			if (col == 3) {
				return (rc.getSerial() + "");
			}

			return ("");
		} catch (Exception e) {
			return ("");
		}

	}

	public int insertOrUpdateProvidersRecordForm(
			ProvidersRecordForm providersRecordForm) throws MedrexException,
			RemoteException {
		// ProvidersRecordForm refProviders = new ProvidersRecordForm();
		currentProviderRecordFormKey = MedrexClientManager.getInstance()
				.insertOrUpdateProvidersRecordForm(providersRecordForm);

		return currentProviderRecordFormKey;
	}

	public ProvidersRecordForm getProvidersRecordForm() throws MedrexException,
			RemoteException {
		return MedrexClientManager.getInstance().getProvidersRecordForm(
				currentProviderRecordFormKey);
	}

	public int getCurrentSerial() {
		return currentProviderRecordFormKey;
	}

	public void setCurrentSerial(int i) {
		this.currentProviderRecordFormKey = i;
	}

	public void setCurrentSelectedRow(int selectedRow) {

		ProvidersRecordForm providersRecordForm = currentProviderRecordFormList
				.get(selectedRow);
		setCurrentSerial(providersRecordForm.getSerial());
		System.out.println("Serial is =  " + currentProviderRecordFormKey);
	}

	public List getProvidersRecordForms() {
		List l = null;
		try {
			l = MedrexClientManager.getInstance().getProvidersRecordForms();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return l;
	}

	public void deleteProvidersRecordForm() throws MedrexException {
		try {
			MedrexClientManager.getInstance().deleteProvidersRecordForm(
					currentProviderRecordFormKey);
		} catch (MedrexException e) {
			JOptionPane.showMessageDialog(null,
					"Provider Entries Exists , Cannot Delete ",
					"Constraint Violation", JOptionPane.ERROR_MESSAGE);
			throw e;
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public int getProviderSerial() {
		return providerSerial;
	}

	public void setProviderSerial(int providerSerial) {
		this.providerSerial = providerSerial;
	}

}
