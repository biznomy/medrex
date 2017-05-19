package medrex.client.main.resident.payerInfo;

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
import medrex.commons.vo.resident.ResidentPayer;

public class ControllerResidentInfoPayerMain implements Controller,
		ControllerTableModel {

	private List errorList;
	private ControllerResidentInfoPayer residentInfoPayerController;

	List<ResidentPayer> residentPayerList = new ArrayList<ResidentPayer>();
	List<ResidentPayer> deleteResidentPayerList = new ArrayList<ResidentPayer>();
	int currentResidentPayerSerial;
	int currentRowPayer;

	public ControllerResidentInfoPayerMain() {
		deleteResidentPayerList = new ArrayList<ResidentPayer>();
	}

	public List<String> doValidate(Object bean, String field) {
		ResidentMain rm = (ResidentMain) bean;
		MedrexValidation medrexValidation = new MedrexValidation();
		errorList = new ArrayList();

		if (field.equals("insuranceNum") || field.equals("")) {
			if (!rm.getInsuranceNum().equals("")) {
				medrexValidation.checkSizeValidation(rm.getInsuranceNum(), 1,
						20, "Insurance No.", errorList);
			}

		}
		if (field.equals("medicalRecordNum") || field.equals("")) {
			if (!rm.getMedicalRecordNum().endsWith("")) {
				medrexValidation.checkSizeValidation(rm.getMedicalRecordNum(),
						1, 20, "Medical record no.", errorList);
			}

		}
		if (field.equals("medicareNum") || field.equals("")) {
			medrexValidation.checkSizeValidation(rm.getMedicareNum(), 11, 11,
					"Medicare no.", errorList);
		}
		if (field.equals("medicaidNum") || field.equals("")) {
			if (!rm.getMedicaidNum().equals("")) {
				medrexValidation.checkRangeValidation(rm.getMedicaidNum(), 12,
						12, "Medicaid/Medi-cal", errorList);
			}

		}
		if (field.equals("county") || field.equals("")) {
			if (rm.getCounty() != null) {
				medrexValidation.checkRequiredValidation(rm.getCounty()
						.toString().trim(), "county", errorList);
			}

		}
		if (field.equals("secondaryIns") || field.equals("")) {
			if (!rm.getSecondaryIns().equals("")) {
				medrexValidation.checkRangeValidation(rm.getSecondaryIns(), 1,
						20, "Secondary Ins", errorList);
			}

		}
		if (field.equals("secondaryInsId") || field.equals("")) {
			if (!rm.getSecondaryInsId().equals("")) {
				medrexValidation.checkRangeValidation(rm.getSecondaryInsId(),
						1, 20, "Secondary Ins id", errorList);
			}

		}
		/*
		 * if (field.equals("originalAdmitDate") || field.equals("")) {
		 * medrexValidation.checkRequiredValidation(rm.getOriginalAdmitDate(),
		 * "original admit date", errorList); } if
		 * (field.equals("currentAdmitDate") || field.equals("")) {
		 * medrexValidation.checkRequiredValidation(rm.getCurrentAdmitDate(),
		 * "current admit date", errorList); } if (field.equals("dischargeDate")
		 * || field.equals("")) {
		 * medrexValidation.checkRequiredValidation(rm.getDischargeDate(),
		 * "discharge date", errorList); }
		 */

		if ((rm.getOriginalAdmitDate() != null)
				&& (rm.getCurrentAdmitDate() != null)
				&& (rm.getDischargeDate() != null)) {
			medrexValidation.checkDateRangeValidation(rm.getCurrentAdmitDate(),
					rm.getOriginalAdmitDate(), rm.getDischargeDate(),
					"Current Admit Date", "Original Admit Date",
					"Discharge Date", errorList);

		}

		return errorList;
	}

	public void insertOrUpdateResidentMain(ResidentMain resMain)
			throws MedrexException {
		try {
			for (ResidentPayer residentPayer : residentPayerList) {

				try {
					if (residentPayer.getSerial() == -1) {
						residentPayer.setSerial(0);
					}
					MedrexClientManager.getInstance()
							.insertOrUpdateResidentPayer(residentPayer);
				} catch (MedrexException e1) {
					throw new MedrexException("Error Saving payer info");
				} catch (RemoteException e) {
				}
			}

			// resMain.setResidentPayer(residentPayerList);
			currentResidentPayerSerial = MedrexClientManager.getInstance()
					.insertOrUpdateResidentMain(resMain);

			/*
			 * for(ResidentPayer residentPayer : residentPayerList){
			 * residentPayer.setResidentId(resMain);
			 * 
			 * try{ if(residentPayer.getSerial()==-1){
			 * residentPayer.setSerial(0); }
			 * MedrexClientManager.getInstance().insertOrUpdateResidentPayer
			 * (residentPayer); } catch (MedrexException e1) { throw new
			 * MedrexException ("Error Saving payer info"); } catch
			 * (RemoteException e) { FrameMedrexServerMessage f =
			 * (FrameMedrexServerMessage)
			 * FrameFactory.createWindowOfType(FrameMedrexServerMessage.class);
			 * } }
			 */

			for (ResidentPayer residentPayer : deleteResidentPayerList) {
				if (residentPayer.getSerial() != 0) {
					try {
						MedrexClientManager.getInstance().deleteResidentPayer(
								residentPayer.getSerial());
					} catch (MedrexException e1) {
						throw new MedrexException(
								"Error deleting resident payer list");
					} catch (RemoteException e) {
					}
				}
			}

		} catch (MedrexException me) {
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

	public List<ResidentPayer> getResidentPayerList() {
		return residentPayerList;
	}

	public void setResidentPayerList(List<ResidentPayer> residentPayerList) {
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

	public List<ResidentPayer> getDeleteResidentPayerList() {
		return deleteResidentPayerList;
	}

	public void setDeleteResidentPayerList(
			List<ResidentPayer> deleteResidentPayerList) {
		this.deleteResidentPayerList = deleteResidentPayerList;
	}

}
