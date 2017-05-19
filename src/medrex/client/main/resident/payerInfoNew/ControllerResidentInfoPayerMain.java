package medrex.client.main.resident.payerInfoNew;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.MedrexValidation;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.Controller;
import medrex.commons.intf.ControllerTableModel;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.ResidentPayerNew;

public class ControllerResidentInfoPayerMain implements Controller,
		ControllerTableModel {

	private List errorList;
	private ControllerResidentInfoPayer residentInfoPayerController;

	List<ResidentPayerNew> residentPayerList = new ArrayList<ResidentPayerNew>();
	List<ResidentPayerNew> deleteResidentPayerList = new ArrayList<ResidentPayerNew>();
	int currentResidentPayerSerial;
	int currentRowPayer;

	public ControllerResidentInfoPayerMain() {
		deleteResidentPayerList = new ArrayList<ResidentPayerNew>();
	}

	public List<String> doValidate(Object bean, String field) {
		ResidentMain rm = (ResidentMain) bean;
		MedrexValidation medrexValidation = new MedrexValidation();
		errorList = new ArrayList();

		if (field.equals("medicalRecordNum") || field.equals("")) {
			if (!rm.getMedicalRecordNum().equals("")) {
				medrexValidation.checkRangeValidation(rm.getMedicalRecordNum(),
						10, 11, "Medical record no.", errorList);
			}

		}
		if (field.equals("medicaidNum") || field.equals("")) {
			if (!rm.getMedicaidNum().equals("")) {
				medrexValidation.checkRangeValidation(rm.getMedicaidNum(), 12,
						12, "Medicaid no.", errorList);
			}
		}

		if (field.equals("insurance") || field.equals("")) {
			if (rm.getInsurance() != null) {
				medrexValidation.checkRequiredValidation(rm.getInsurance()
						.toString().trim(), "insurance", errorList);
			}

		}

		return errorList;
	}

	public void insertOrUpdateResidentMainNew(ResidentMain resMain)
			throws MedrexException {
		try {
			for (ResidentPayerNew residentPayerNew : residentPayerList) {

				try {
					if (residentPayerNew.getSerial() == -1) {
						residentPayerNew.setSerial(0);
					}
					MedrexClientManager.getInstance()
							.insertOrUpdateResidentPayerNew(residentPayerNew);
				} catch (MedrexException e1) {
					throw new MedrexException("Error Saving payer info New");
				} catch (RemoteException e) {
				}
			}

			resMain.setResidentPayerNew(residentPayerList);
			currentResidentPayerSerial = MedrexClientManager.getInstance()
					.insertOrUpdateResidentMain(resMain);
			// System.out.println("currentResidentPayerSerial: "+currentResidentPayerSerial);

			for (ResidentPayerNew residentPayer : deleteResidentPayerList) {
				if (residentPayer.getSerial() != 0) {
					try {
						MedrexClientManager.getInstance()
								.deleteResidentPayerNew(
										residentPayer.getSerial());
					} catch (MedrexException e1) {

						throw new MedrexException(
								"Error deleting resident payer list");
					} catch (RemoteException e) {
					}
				}
			}

		} catch (MedrexException me) {
			me.printStackTrace();
			throw new MedrexException(
					"Error saving to resident payer info data");
		} catch (RemoteException re) {
		}
	}

	public ResidentMain getCurrentResident() throws MedrexException {
		setCurrentResidentPayerSerial(Global.currentResidenceKey);
		if (currentResidentPayerSerial == 0) {
			return new ResidentMain();
		} else {
			ResidentMain residentMain = null;
			try {
				residentMain = MedrexClientManager.getInstance().getResident(
						currentResidentPayerSerial);
				int tempInscount = MedrexClientManager.getInstance()
						.updateInsuranceCount(currentResidentPayerSerial);
				if (tempInscount != 0) {
					residentMain.setInsuranceCount(tempInscount);
				}
			} catch (MedrexException me) {
				throw new MedrexException("Error retrieving resident data");
			} catch (RemoteException re) {
			}
			return residentMain;
		}
	}

	public void setResidentInfoPayerController(
			ControllerResidentInfoPayer residentInfoPayerController) {
		this.residentInfoPayerController = residentInfoPayerController;
	}

	public ControllerResidentInfoPayer getResidentInfoPayerController() {
		return residentInfoPayerController;
	}

	public int getColumnCount() {
		return 0;
	}

	public String getColumnName(int col) {
		return null;
	}

	public int getRowCount() {
		return 0;
	}

	public Object getValueAt(int row, int col) {
		return null;

	}

	public List<ResidentPayerNew> getResidentPayerList() {
		return residentPayerList;
	}

	public void setResidentPayerList(List<ResidentPayerNew> residentPayerList) {
		this.residentPayerList = residentPayerList;
	}

	public int getCurrentResidentPayerSerial() {
		return currentResidentPayerSerial;
	}

	public void setCurrentResidentPayerSerial(int currentResidentPayerSerial) {
		this.currentResidentPayerSerial = currentResidentPayerSerial;
	}

	public int getCurrentRowPayer() {
		return currentRowPayer;
	}

	public void setCurrentRowPayer(int currentRowPayer) {
		this.currentRowPayer = currentRowPayer;

	}

	public List<ResidentPayerNew> getDeleteResidentPayerList() {
		return deleteResidentPayerList;
	}

	public void setDeleteResidentPayerList(
			List<ResidentPayerNew> deleteResidentPayerList) {
		this.deleteResidentPayerList = deleteResidentPayerList;
	}

}
