package medrex.commons.enums;

import java.util.Date;

public enum ResidentTabs {
	RESIDENT_INFORMATION(1, "Resident Information"), ADMISSION_RECORDS(2,
			"Admission Records"), ACTIVITIES(3, "Activities"), MEDICATION_AND_TREATMENT(
			4, "Medication & Treatment"), DIETARY(5, "Dietary"), CONSULTANT(6,
			"Consultant"), PROGRESS_NOTES(7, "Progress Notes"), LAB_AND_SPECIAL_REPORTS(
			8, " Lab & Special Reports"), HISTORY_AND_PHYSICAL(9,
			"History & Physical"), PHYSICIAN_ORDERS(10, "Physician Orders"), OT_PT_ACT_SPEECH(
			11, "Ot-Pt-Act Speech"), MONTHLY_SUMMARIES(17, "MonthlySummaries"), PSYCH(
			19, "Psych"), FLOW_SHEETS(20, "FlowSheets"), DENTAL_PODIATRY(18,
			"Dental & Podiatry")/*
								 * , SOCIAL_SERVICES(16, "Social Services"),
								 * UR_DISCHARGE_PLANNING( 17,
								 * "UR Discharge Planning")
								 */, ASSESSMENTS(16, "Assessments"), MISC(12,
			"Misc"), MDS(16, "Mds"), CARE_PLAN(13, "Care Plan"), ALERT(14,
			"Alert"), DIALYSIS(22, "Dialysis"), NURSES_NOTES(23, "Nurses Notes");

	public final int Id;
	public final String Name;

	ResidentTabs(int id, String name) {
		this.Id = id;
		this.Name = name;
	}

	public static String getUniqueScanFileName(String formName) {
		return formName.replaceAll(" ", "_") + "-" + (new Date().getTime());
	}

	public static String getScanFileName(String fileName) {
		String str[] = fileName.split("-");
		return str[0].replaceAll("_", " ");
	}

	public static ResidentTabs getResidentTab(int id) {
		ResidentTabs[] allTabs = values();
		for (int i = 0; i < allTabs.length; i++) {
			if (allTabs[i].Id == id) {
				return allTabs[i];
			}
		}
		return null;
	}
}
