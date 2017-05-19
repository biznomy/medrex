package medrex.server.service.ra;

import java.util.ArrayList;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.intf.DataObject;
import medrex.commons.vo.admission.validation.ValidationForm;
import medrex.commons.vo.ra.RAFPg1;
import medrex.commons.vo.ra.RAFPg1Sec1;
import medrex.commons.vo.ra.RAFPg1Sec2;
import medrex.commons.vo.ra.RAFPg2;
import medrex.commons.vo.ra.RAPg2Sec1;
import medrex.commons.vo.ra.RAPg2Sec2;
import medrex.commons.vo.ra.RARecord;
import medrex.server.dao.ra.RADAO;

public class RAService {

	public int insertOrUpdateRARecord(RARecord raRecord) throws MedrexException {
		return RADAO.getInstance().insertOrUpdateRARecord(raRecord);
	}

	public List<RARecord> getRARecordList(int residentId)
			throws MedrexException {
		return RADAO.getInstance().getRARecordList(residentId);
	}

	public void deleteRAFPg1Record(int serial) throws MedrexException {
		RADAO.getInstance().deleteRAFPg1Record(serial);
	}

	public void deleteRAFPg2Record(int serial) throws MedrexException {
		RADAO.getInstance().deleteRAFPg2Record(serial);
	}

	public int insertOrUpdateRAFPg1(RAFPg1 raPg1) throws MedrexException {
		return RADAO.getInstance().insertOrUpdateRAFPg1(raPg1);
	}

	public RAFPg1 getRAFP1(int serial) throws MedrexException {
		return RADAO.getInstance().getRAFP1(serial);
	}

	public int insertOrUpdateRAFPg2(RAFPg2 raPg2) throws MedrexException {
		return RADAO.getInstance().insertOrUpdateRAFPg2(raPg2);
	}

	public RAFPg2 getRAFPg2(int serial) throws MedrexException {
		return RADAO.getInstance().getRAFPg2(serial);
	}

	public void saveRAFPages(List<DataObject> listDataObjects)
			throws MedrexException {
		RARecord record = new RARecord();
		RAFPg1 pg1 = new RAFPg1();
		RAFPg2 pg2 = new RAFPg2();
		int serialPg1 = 0;
		int serialPg2 = 0;
		for (DataObject dataObject : listDataObjects) {
			if (dataObject.getClass() == RAFPg1Sec1.class) {
				RAFPg1Sec1 sec1 = (RAFPg1Sec1) dataObject;
				pg1.setSerial(sec1.getRafpg1Serial());
				pg1.setFirstName(sec1.getFirstName());
				pg1.setLastName(sec1.getLastName());
				pg1.setRoomNumber(sec1.getRoomNo());
				pg1.setDateOfBirth(sec1.getDateOfBirth());
				pg1.setAge(sec1.getAge());
				pg1.setSex(sec1.getSex());
			}
			if (dataObject.getClass() == RAFPg1Sec2.class) {
				RAFPg1Sec2 sec2 = (RAFPg1Sec2) dataObject;
				pg1.setCommSkills(sec2.getCommunicationSkill());
				pg1.setCommunicationNotes(sec2.getCommunicationNotes());
				pg1.setUsesToilet(sec2.isUseToilet());
				pg1.setUsesBedPan(sec2.isUseBedPan());
				pg1.setUrinal(sec2.isUrinal());
				pg1.setBedSideCommode(sec2.isBedSideCommode());
				pg1.setLanguagesSpoken(sec2.getLanguageSpoken());
				pg1.setCityAndState(sec2.getCityAndState());
				pg1.setLanguageNotes(sec2.getLanguageNotes());
			}
			if (dataObject.getClass() == RAPg2Sec1.class) {
				pg2.setSerial(((RAPg2Sec1) dataObject).getRapg2Serial());
				pg2.setState(((RAPg2Sec1) dataObject).getState());
			}
			if (dataObject.getClass() == RAPg2Sec2.class) {
				pg2.setDob(((RAPg2Sec2) (dataObject)).getDob());
			}
		}

		for (DataObject dataObject : listDataObjects) {
			if (dataObject.getClass() == RARecord.class) {
				record.setSerial(((RARecord) dataObject).getSerial());
				record.setFormName(((RARecord) dataObject).getFormName());
				record.setResidentId(((RARecord) dataObject).getResidentId());
				if (record.getSerial() == 0) {
					pg1.setSerial(0);
					pg2.setSerial(0);
				}
				serialPg1 = insertOrUpdateRAFPg1(pg1);
				serialPg2 = insertOrUpdateRAFPg2(pg2);
				record.setRafp1Id(serialPg1);
				record.setRafp2Id(serialPg2);
			}
		}

		insertOrUpdateRARecord(record);
	}

	public List<DataObject> getRARecord(int serial) throws MedrexException {
		List<DataObject> dataObjectList = new ArrayList<DataObject>();
		if (serial != 0) {
			RARecord rec = RADAO.getInstance().getRARecord(serial);
			dataObjectList.add(rec);

			int serialPg1 = rec.getRafp1Id();
			RAFPg1 pg1 = RADAO.getInstance().getRAFP1(serialPg1);
			RAFPg1Sec1 sec1 = new RAFPg1Sec1();
			sec1.setRafpg1Serial(pg1.getSerial());
			sec1.setFirstName(pg1.getFirstName());
			sec1.setLastName(pg1.getLastName());
			sec1.setRoomNo(pg1.getRoomNumber());
			sec1.setDateOfBirth(pg1.getDateOfBirth());
			sec1.setAge(pg1.getAge());
			sec1.setSex(pg1.getSex());
			dataObjectList.add(sec1);

			RAFPg1Sec2 sec2 = new RAFPg1Sec2();
			sec2.setCommunicationSkill(pg1.getCommSkills());
			sec2.setCommunicationNotes(pg1.getCommunicationNotes());
			sec2.setUsesToilet(pg1.isUsesToilet());
			sec2.setUsesBedPan(pg1.isUsesBedPan());
			sec2.setUrinal(pg1.isUrinal());
			sec2.setBedSideCommode(pg1.isBedSideCommode());
			sec2.setLanguageSpoken(pg1.getLanguageSpoken());
			sec2.setCityAndState(pg1.getCityAndState());
			sec2.setLanguageNotes(pg1.getLanguageNotes());
			dataObjectList.add(sec2);

			int serialPg2 = rec.getRafp2Id();
			RAFPg2 raPg2 = RADAO.getInstance().getRAFPg2(serialPg2);
			RAPg2Sec1 raPg2Sec1 = new RAPg2Sec1();
			raPg2Sec1.setState(raPg2.getState());
			raPg2Sec1.setRapg2Serial(raPg2.getSerial());
			dataObjectList.add(raPg2Sec1);

			RAPg2Sec2 raPg2Sec2 = new RAPg2Sec2();
			raPg2Sec2.setDob(raPg2.getDob());
			dataObjectList.add(raPg2Sec2);
		}
		return dataObjectList;
	}

	public void deleteRARecord(int serial) throws MedrexException {
		RARecord raRecord = RADAO.getInstance().getRARecord(serial);
		int serialPg1 = raRecord.getRafp1Id();
		int serialPg2 = raRecord.getRafp2Id();

		// delete all pages
		deleteRAFPg1Record(serialPg1);
		deleteRAFPg2Record(serialPg2);
		// delete main record
		RADAO.getInstance().deleteRARecord(serial);
	}

	// Validation test
	public ValidationForm getRaFPg1ValidationRecord(String className)
			throws MedrexException {
		return RADAO.getInstance().getRaFPg1ValidationRecord(className);
	}
}
