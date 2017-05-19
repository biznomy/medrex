package medrex.server.service.admission.analyzer;

import java.util.List;

import medrex.commons.vo.admission.ResidentAssessmentFormPage1;
import medrex.commons.vo.admission.analyzer.CarePlanAnalyzerBean;

public class CarePlanAnalyzer {

	public List<CarePlanAnalyzerBean> carePlanFormPage1(
			ResidentAssessmentFormPage1 page1) {

		Analyzer analyzer = new Analyzer(page1.getSerial(),
				"Resident Assessment Form", page1.getResidentId());

		analyzer.analyzeEqualInt(page1.getCommunicationType(), 2, "Aphasic",
				"Communication");
		analyzer.analyzeEqualInt(page1.getCommunicationType(), 3, "Dysphagia",
				"Communication");
		analyzer.analyzeNotEqualString(page1.getCommunicationLanguage(),
				"English", "Non English:" + page1.getCommunicationLanguage(),
				"Communication");
		analyzer.analyzeEqualInt(page1.getCommunicationAnswers(), 2,
				"Reluctantlly", "Communication");
		analyzer.analyzeEqualInt(page1.getCommunicationAnswers(), 3,
				"Inappropriately", "Communication");
		analyzer.analyzeEqualInt(page1.getCommunicationOriented(), 2,
				"CommunicationOriented No", "Communication");
		analyzer.analyzeBoolVal(page1.isHearingAdequateAidRight(), true,
				"Adequate with aid : Right", "Hearing");
		analyzer.analyzeBoolVal(page1.isHearingAdequateAidLeft(), true,
				"Adequate with aid : Left", "Hearing");
		analyzer.analyzeBoolVal(page1.isHearingPoorRight(), true,
				"Poor : Right", "Hearing");
		analyzer.analyzeBoolVal(page1.isHearingPoorLeft(), true, "Poor : Left",
				"Hearing");
		analyzer.analyzeBoolVal(page1.isHearingDeafRight(), true,
				"Deaf : Right", "Hearing");
		analyzer.analyzeBoolVal(page1.isHearingDeafLeft(), true, "Deaf : Left",
				"Hearing");
		analyzer.analyzeBoolVal(page1.isVisionAdequateGlassesRight(), true,
				"Adequate with glasses : Right", "Vision");
		analyzer.analyzeBoolVal(page1.isVisionAdequateGlassesLeft(), true,
				"Adequate with glasses : Left", "Vision");
		analyzer.analyzeBoolVal(page1.isVisionPoorRight(), true,
				"Poor : Right", "Vision");
		analyzer.analyzeBoolVal(page1.isVisionPoorLeft(), true, "Poor : Left",
				"Vision");
		analyzer.analyzeBoolVal(page1.isVisionBlindRight(), true,
				"Blind : Right", "Vision");
		analyzer.analyzeBoolVal(page1.isVisionBlindLeft(), true,
				"Blind : Left", "Vision");
		analyzer.analyzeEqualInt(page1.getEatingType(), 1, "Dependent",
				"Eating & Nutrition");
		analyzer.analyzeEqualInt(page1.getEatingType(), 3, "Need Assist",
				"Eating & Nutrition");
		analyzer.analyzeEqualInt(page1.getEatingType(), 4, "GT",
				"Eating & Nutrition");
		analyzer.analyzeEqualInt(page1.getEatingType(), 5, "TPN",
				"Eating & Nutrition");
		analyzer.analyzeEqualInt(page1.getEatingType(), 6, "NPO",
				"Eating & Nutrition");
		analyzer.analyzeEqualInt(page1.getEatingType(), 7, "Dysphagia",
				"Eating & Nutrition");
		// analyzer.analyzeEqualInt(page1.getOralOwnTeeth(), 2, "Own Teeth: No",
		// "Oral Assessment");
		// analyzer.analyzeEqualInt(page1.getOralDentures(), 1,
		// "Own Dentures: Yes", "Oral Assessment");
		// analyzer.analyzeEqualInt(page1.getBowelContinent(), 1,
		// "Own Dentures: Yes", "Oral Assessment");

		// ListIterator it = analyzer.getCarePlanAnalysisList().listIterator();
		// while(it.hasNext()) {
		// CarePlanAnalyzerBean bean = (CarePlanAnalyzerBean) it.next();
		// System.out.println("List is :" + bean.getMessage() + ", "+
		// bean.getFormId() + ", "+ bean.getFormName() + ", "+
		// bean.getFormSubName() +", "+ bean.getResidentId());
		// }

		return analyzer.getCarePlanAnalysisList();
	}

}
