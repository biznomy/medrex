package medrex.client.main.resident.payerInfo;

import java.util.ArrayList;
import java.util.List;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.MedrexValidation;
import medrex.commons.intf.Controller;
import medrex.commons.intf.ControllerTableModel;
import medrex.commons.vo.resident.ResidentPayer;

public class ControllerResidentInfoPayer implements Controller,
		ControllerTableModel {

	private List errorList;
	private ControllerResidentInfoPayerMain residentInfoPayerMainController;

	String[] columnNames = { "Payer Type", "Effective Date", "End Date" };

	public ControllerResidentInfoPayer(
			ControllerResidentInfoPayerMain residentInfoPayerMainController) {
		this.residentInfoPayerMainController = residentInfoPayerMainController;
		this.residentInfoPayerMainController
				.setResidentInfoPayerController(this);
	}

	public List<String> doValidate(Object bean, String field) {
		ResidentPayer residentPayer = (ResidentPayer) bean;
		MedrexValidation medrexValidation = new MedrexValidation();
		errorList = new ArrayList();

		if (field.equals("payerType") || field.equals("")) {
			if (residentPayer.getPayerType() != null) {
				medrexValidation.checkRequiredValidation(residentPayer
						.getPayerType().toString().trim(), "payer type",
						errorList);
			}

		}
		if (field.equals("responsibleParty") || field.equals("")) {
			if (residentPayer.getResponsibleParty() != null) {
				medrexValidation.checkRequiredValidation(residentPayer
						.getResponsibleParty().toString().trim(),
						"responsible party", errorList);
			}

		}
		if (field.equals("insurance") || field.equals("")) {
			if (residentPayer.getInsurance() != null) {
				medrexValidation.checkRequiredValidation(residentPayer
						.getInsurance().toString().trim(), "insurance",
						errorList);
			}

		}
		if (field.equals("usedMedicalDays") || field.equals("")) {
			if (residentPayer.getUsedMedicalDays() != null) {
				medrexValidation.checkRequiredValidation(residentPayer
						.getUsedMedicalDays().toString().trim(),
						"used medical days", errorList);
			}

		}
		if (field.equals("authorizationCode") || field.equals("")) {
			medrexValidation.checkRangeValidation(residentPayer
					.getAuthorizationCode(), 5, 10, "Authorization code",
					errorList);
		}
		if (field.equals("effectiveDate") || field.equals("")) {
			medrexValidation.checkRequiredValidation(residentPayer
					.getEffectiveDate(), "effective date", errorList);
		}
		if (field.equals("endDate") || field.equals("")) {
			medrexValidation.checkRequiredValidation(
					residentPayer.getEndDate(), "end date", errorList);
		}
		if ((residentPayer.getEffectiveDate() != null)
				&& (residentPayer.getEndDate() != null)) {
			medrexValidation.checkDateRangeValidation(residentPayer
					.getEndDate(), residentPayer.getEffectiveDate(), "End",
					"Effective", errorList);
		}

		return errorList;
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public String getColumnName(int col) {
		return columnNames[col];
	}

	public int getRowCount() {
		return residentInfoPayerMainController.getResidentPayerList().size();
	}

	public Object getValueAt(int row, int col) {
		ResidentPayer valueObject = residentInfoPayerMainController
				.getResidentPayerList().get(row);

		switch (col) {
		case 0:
			return valueObject.getPayerType();
		case 1:
			return valueObject.getEffectiveDate();
		case 2:
			return valueObject.getEndDate();
		default:
			return "";
		}

	}

	public void setSelectedPayer(int selected) {
		residentInfoPayerMainController.setCurrentRowPayer(selected);

	}

	public int getSelectedPayer() {
		return (residentInfoPayerMainController.getCurrentRowPayer());
	}

	public void updateResidentInfoPayerList() {
		List<ResidentPayer> tempResidentPayerList = new ArrayList<ResidentPayer>();
		try {
			tempResidentPayerList = MedrexClientManager.getInstance()
					.getResidentPayers(Global.currentResidenceKey);
		} catch (Exception e) {

		}
		residentInfoPayerMainController
				.setResidentPayerList(tempResidentPayerList);
	}

	public void insertOrUpdateResidentPayer(ResidentPayer rp) {
		try {
			// int residentId=getCurrentResidentPayer().getResidentId();
			// int serial = getCurrentResidentPayer().getSerial();
			// rp.setResidentId(residentId);
			// rp.setSerial(serial);

			if (residentInfoPayerMainController.getCurrentRowPayer() == -1) {
				residentInfoPayerMainController.getResidentPayerList().add(rp);
			} else {
				residentInfoPayerMainController.getResidentPayerList().set(
						residentInfoPayerMainController.getCurrentRowPayer(),
						rp);
			}

		} catch (Exception ee) {
		}

	}

	public void deleteCurrentResidentInfoPayer() {
		if (residentInfoPayerMainController.getCurrentRowPayer() == -1) {

		} else {
			ResidentPayer residentPayer = residentInfoPayerMainController
					.getResidentPayerList().remove(
							residentInfoPayerMainController
									.getCurrentRowPayer());
			residentInfoPayerMainController.getDeleteResidentPayerList().add(
					residentPayer);
		}
	}

	public ResidentPayer getCurrentResidentPayer() {
		if (residentInfoPayerMainController.getCurrentRowPayer() == -1) {
			return new ResidentPayer();
		} else {
			return (residentInfoPayerMainController.getResidentPayerList()
					.get(residentInfoPayerMainController.getCurrentRowPayer()));
		}
	}

	public ControllerResidentInfoPayerMain getResidentInfoPayerMainController() {
		return residentInfoPayerMainController;
	}

	public void setResidentInfoPayerMainController(
			ControllerResidentInfoPayerMain residentInfoPayerMainController) {
		this.residentInfoPayerMainController = residentInfoPayerMainController;
	}

}
