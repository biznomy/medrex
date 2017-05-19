package medrex.client.constants;

public class GlobalCNA {

	public static String toolTipText[][] = new String[8][2];
	public static String toolTipTextA[][] = new String[9][2];
	public static String toolTipTextB[] = new String[9];

	public static int results[][] = new int[8][2];

	public static int currentADL;
	public static int currentADLA;
	public static int currentADLB;
	public static int tempADLA;
	public static int tempADLB;

	public static int currentCNAkey;

	// public static int adlSerials[] = new int[8];

	public static void initializeToolTips() {
		toolTipText[0][0] = "BED MOBILITY";
		toolTipText[0][1] = "How resident moves to and from lying position, turns side to side and positions body while in bed";

		toolTipText[1][0] = "TRANSFER";
		toolTipText[1][1] = "How resident moves between surfaces - to/from : bed, chair, wheelchari, standing position (EXCLUDE to/from bath/toilet)";

		toolTipText[2][0] = "WALK IN ROOM";
		toolTipText[2][1] = "How resident walks between location in his/her room";

		toolTipText[3][0] = "WALK IN HALL";
		toolTipText[3][1] = "How resident walks in corridor on unit";

		toolTipText[4][0] = "LOCOMOTION ON UNIT";
		toolTipText[4][1] = "How resident moves between locations in his/her room and adjancent corridor on same floor. If in wheelchair, self-sufficiency once in chair";

		toolTipText[5][0] = "LOCOMOTION OFF UNIT";
		toolTipText[5][1] = "How resident moves to and returns from off unit location (e.g areas set aside for dining, activities, or treatments). If facility has only one floor, how resident moves to and from distant areas on the floor. If in wheelchair, self-sufficiency once in chair";

		toolTipText[6][0] = "DRESSING";
		toolTipText[6][1] = "How resident puts on , fastens, and takes off all items of street clothing, including donning / roving prosthesis";

		toolTipText[7][0] = "TOILET USE";
		toolTipText[7][1] = "How resident uses the toilet room (or commode, bedpan, urinal) transfer on /off toilet, cleanses, changes pad, manages ostomy or catheter, adjusts clothes";

		// //////////////////////////

		toolTipTextA[0][0] = "INDEPENDENT";
		toolTipTextA[0][1] = "No help or oversight --OR-- Help/oversight provided only 1 or 2 times during last 7 Days";

		toolTipTextA[1][0] = "SUPERVISION";
		toolTipTextA[1][1] = "Oversight encouragement or cueing provided 3 or more times during last 7 days --OR-- Suspension(3 or more times) plus physical assistance provided only 1 or 2 times during last 7 days";

		toolTipTextA[2][0] = "LIMITED ASSISTANCE";
		toolTipTextA[2][1] = "Resident highly involved in activity; received physical help in guided maneuvering of limbs of other nonweight bearing assistance 3 or more times -- OR-- More help provided only 1 or 2 times during last 7 days";

		toolTipTextA[3][0] = "EXTENSIVE ASSISTANCE";
		toolTipTextA[3][1] = "While resident performed part of activity, over last 7 day period, help of following types provided 3 or more times (1) Weight bearing support (2) Full staff performance during part (but not all ) of last 7 days";

		toolTipTextA[4][0] = "TOTAL DEPENDENCE";
		toolTipTextA[4][1] = "Full staff performance of activity during entire 7 days";

		toolTipTextA[5][0] = "ACTIVITY DID NOT OCCUR";
		toolTipTextA[5][1] = "Activity did not occur for last 7 days";

		toolTipTextA[8][0] = "ACTIVITY DID NOT OCCUR";
		toolTipTextA[8][1] = "Activity did not occur for last 7 days";

		// ////////////////////////////////

		toolTipTextB[0] = "No setup or physical help from staff";
		toolTipTextB[1] = "Setup help only";
		toolTipTextB[2] = "One person physical assist";
		toolTipTextB[3] = "Two+ person physical assist";
		toolTipTextB[8] = "ADL activity itself did not occur during entire 7 days";

	}

	public static void resetResults() {
		for (int i = 0; i < 8; i++) {
			// adlSerials[0]=0;
			results[i][0] = -1;
			results[i][1] = -1;
		}
	}

}
