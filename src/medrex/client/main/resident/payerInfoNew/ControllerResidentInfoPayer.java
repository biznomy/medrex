package medrex.client.main.resident.payerInfoNew;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.MedrexValidation;
import medrex.commons.intf.Controller;
import medrex.commons.intf.ControllerTableModel;
import medrex.commons.vo.resident.ResidentPayerNew;

public class ControllerResidentInfoPayer implements Controller,
		ControllerTableModel {

	private List errorList;
	private ControllerResidentInfoPayerMain residentInfoPayerMainController;

	String[] columnNames = { "Info", "Start Date", "End Date" };

	public ControllerResidentInfoPayer(
			ControllerResidentInfoPayerMain residentInfoPayerMainController) {
		this.residentInfoPayerMainController = residentInfoPayerMainController;
		this.residentInfoPayerMainController
				.setResidentInfoPayerController(this);
	}

	public List<String> doValidate(Object bean, String field) {
		ResidentPayerNew residentPayerNew = (ResidentPayerNew) bean;
		MedrexValidation medrexValidation = new MedrexValidation();
		errorList = new ArrayList();
		if (field.equals("fulldays") || field.equals("")) {
			medrexValidation.checkRangeValidation(residentPayerNew
					.getFulldays(), 0, 20, "Full Days", errorList);
			medrexValidation.checkIntValueValidation(residentPayerNew
					.getFulldays().toString(), 0, 20, "Full Days", errorList);
		}
		if (field.equals("coinsdate") || field.equals("")) {
			medrexValidation.checkRangeValidation(residentPayerNew
					.getCoinsdate(), 0, 20, "Co In Days", errorList);
			// medrexValidation.checkRequiredValidation(residentPayerNew.getCoinsdate().toString(),
			// "Co In Days", errorList);
			medrexValidation.checkIntValueValidation(residentPayerNew
					.getCoinsdate().toString(), 0, 80, "Co In Days", errorList);
		}
		if (field.equals("insuranceType") || field.equals("")) {
			if (residentPayerNew.getInsuranceType() != null) {
				medrexValidation.checkRequiredValidation(residentPayerNew
						.getInsuranceType().toString().trim(),
						"insurance type", errorList);
			}

		}
		if (field.equals("dateStart") || field.equals("")) {
			medrexValidation.checkRequiredValidation(residentPayerNew
					.getDateStart(), "start date", errorList);
		}
		if (field.equals("endDate") || field.equals("")) {
			medrexValidation.checkRequiredValidation(residentPayerNew
					.getEndDate(), "end date", errorList);
		}
		if ((residentPayerNew.getDateStart() != null)
				&& (residentPayerNew.getEndDate() != null)) {
			medrexValidation.checkDateRangeValidation(residentPayerNew
					.getEndDate(), residentPayerNew.getDateStart(), "End",
					"Start", errorList);
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
		ResidentPayerNew valueObject = residentInfoPayerMainController
				.getResidentPayerList().get(row);
		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern("MM / dd / yyyy");
		switch (col) {
		case 0:
			return valueObject.getInsuranceType();
		case 1:
			return df.format(valueObject.getDateStart());
		case 2:
			return df.format(valueObject.getEndDate());
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
		List<ResidentPayerNew> tempResidentPayerList = new ArrayList<ResidentPayerNew>();
		try {
			tempResidentPayerList = MedrexClientManager.getInstance()
					.getResidentPayersNew(Global.currentResidenceKey);
		} catch (Exception e) {

		}
		residentInfoPayerMainController
				.setResidentPayerList(tempResidentPayerList);
	}

	public void insertOrUpdateResidentPayer(ResidentPayerNew rp) {
		try {
			if (getSelectedPayer() != -1) {
				ResidentPayerNew rp1 = getCurrentResidentPayer();
				rp.setSerial(rp1.getSerial());
			}

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
			ResidentPayerNew residentPayer = residentInfoPayerMainController
					.getResidentPayerList().remove(
							residentInfoPayerMainController
									.getCurrentRowPayer());
			residentInfoPayerMainController.getDeleteResidentPayerList().add(
					residentPayer);
		}
	}

	public ResidentPayerNew getCurrentResidentPayer() {
		if (residentInfoPayerMainController.getCurrentRowPayer() == -1) {
			return new ResidentPayerNew();
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
