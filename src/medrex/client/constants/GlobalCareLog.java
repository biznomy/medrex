package medrex.client.constants;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import medrex.commons.vo.careLog.CareLogOption;

public class GlobalCareLog {

	public static List careLogOptions = new ArrayList();
	public static int currentCareLogKey;
	public static int currentCareLogOptionKey;
	public static int currentCareLogSubOptionKey;

	public static void initialize() {
		careLogOptions.clear();
		careLogOptions.add(new CareLogOption("HYGIENE", "img/clhygiene.png", 0,
				new String[] { "SELF", "ASSIST", "COMPLETE" }, 1, 0));
		careLogOptions.add(new CareLogOption("DENTURES", "", 0, new String[] {
				"UPPER", "LOWER" }, 2, 1));
		careLogOptions.add(new CareLogOption("GLASSES", "", 0, new String[] {
				"YES", "NO" }, 3, 1));
		careLogOptions.add(new CareLogOption("BLIND", "", 0, new String[] {
				"YES", "NO" }, 4, 1));
		careLogOptions.add(new CareLogOption("SHOWER", "img\\clshower.png", 0,
				new String[] { "7-3", "3-11", "11-7" }, 5, 0));
		careLogOptions.add(new CareLogOption("EATING", "img\\cleating.png", 0,
				new String[] { "GOOD", "FAIR", "POOR" }, 6, 0));
		careLogOptions.add(new CareLogOption("ELIMINATION-URINE",
				"img\\clurine.png", 0, new String[] { "CONTINENT",
						"INCONTINENT", "CATHETER" }, 7, 0));
		careLogOptions.add(new CareLogOption("CATHETER", "", 0, new String[] {
				"YES", "NO" }, 8, 7));
		careLogOptions.add(new CareLogOption("BLADDER TRAINING", "", 0,
				new String[] { "YES", "NO" }, 9, 7));
		careLogOptions.add(new CareLogOption("BM FREQUENCY",
				"img\\clfrequency.png", 0, new String[] { "NONE", "FORMED",
						"LOOSE", "SMALL" }, 10, 0));
		careLogOptions.add(new CareLogOption("AMBULATION",
				"img\\clambulation.png", 0, new String[] { "1ASSIST",
						"2ASSIST", "AD LIB", "RESTORATIVE", "WALKER", "CANE",
						"W/C", "ROM", "UPPER", "LOWER" }, 11, 0));
		careLogOptions.add(new CareLogOption("RISK MONITORING",
				"img\\clmonitoring.png", 0, new String[] { "FALLS",
						"RESTRAINTS", "WOUNDS", "WANDERS", "CONTRACTURES",
						"SIDERAILS" }, 12, 0));
		careLogOptions.add(new CareLogOption("TRANSER", "img\\cltransfer.png",
				0, new String[] { "SELF", "ASSIST", "TOTAL", "HOYER",
						"POSITION Q2H" }, 13, 0));
	}

	public static CareLogOption getCareLogOptionWithNum(int num) {

		Iterator i = careLogOptions.iterator();
		CareLogOption clo = null;
		while (i.hasNext()) {
			CareLogOption tempClo = (CareLogOption) i.next();
			if (tempClo.getCareLogNum() == num) {
				clo = tempClo;
				break;
			}
		}
		return (clo);
	}

	public static List getCareLogOptionsWithParentNum(int num) {

		Iterator i = careLogOptions.iterator();
		List listClo = new ArrayList();
		while (i.hasNext()) {
			CareLogOption tempClo = (CareLogOption) i.next();
			if (tempClo.getParentNum() == num) {
				listClo.add(tempClo);
			}
		}
		return (listClo);
	}

}
