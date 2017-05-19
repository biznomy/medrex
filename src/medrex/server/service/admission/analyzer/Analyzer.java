package medrex.server.service.admission.analyzer;

import java.util.ArrayList;
import java.util.List;

import medrex.commons.vo.admission.analyzer.CarePlanAnalyzerBean;

public class Analyzer {

	private int formId;
	private String formName;
	private int residentId;
	private List<CarePlanAnalyzerBean> list = new ArrayList<CarePlanAnalyzerBean>();
	CarePlanAnalyzerBean cpa;

	public Analyzer(int serial, String formName, int residentId) {
		this.formId = serial;
		this.formName = formName;
		this.residentId = residentId;
	}

	public void analyzeEqualInt(int value, int equalVal, String message,
			String formSubName) {
		if (value == equalVal) {
			addMessageToList(formSubName, message);
		}
	}

	public void analyzeNotEqualString(String lan, String eqLan, String message,
			String formSubName) {
		if (!(lan.equalsIgnoreCase(eqLan))) {
			addMessageToList(formSubName, message);
		}
	}

	public void analyzeBoolVal(boolean val, boolean val2, String message,
			String formSubName) {
		if (val == val2) {
			addMessageToList(formSubName, message);
		}
	}

	public void addMessageToList(String formSubName, String message) {
		cpa = new CarePlanAnalyzerBean();
		cpa.setFormName(formName);
		cpa.setFormId(formId);
		cpa.setResidentId(residentId);
		cpa.setFormSubName(formSubName);
		cpa.setMessage(message);
		list.add(cpa);
	}

	public List<CarePlanAnalyzerBean> getCarePlanAnalysisList() {
		return list;
	}

}
