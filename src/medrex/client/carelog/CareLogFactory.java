/**
 * 
 */
package medrex.client.carelog;

import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;

import medrex.commons.dataObj.CareLogValue;

/**
 * @author D S Naruka
 * 
 */
public class CareLogFactory {

	private static final boolean T = true;
	private static final boolean F = false;

	/* TOILETUSE */
	private static final String TXT_TOILETUSE = "Toilet Use";
	private static final String ICO_TOILETUSE = "img/carelog/Toilet.png";

	/* TOILETUSE_ELIMINATION_URINE */
	private static final String TXT_TOILETUSE_ELIMINATION_URINE = "Elimination Urine";
	private static final String ICO_TOILETUSE_ELIMINATION_URINE = "img/toiler 1.jpg";

	/* TOILETUSE_BM_FREQUENCY */
	private static final String TXT_TOILETUSE_BM_FREQUENCY = "BM Frequency";
	private static final String ICO_TOILETUSE_BM_FREQUENCY = "img/carelog/cnadidnotoccur.png";

	/* TRANSFER */
	private static final String TXT_TRANSFER = "Transfer";
	private static final String ICO_TRANSFER = "img/carelog/Transfer.png";

	/* BEDMOBILITY */
	private static final String TXT_BEDMOBILITY = "Bed Mobility";
	private static final String ICO_BEDMOBILITY = "img/carelog/Bed Mobility.png";

	/* WALK_IN_ROOM */
	private static final String TXT_WALK_IN_ROOM = "Walk in room";
	private static final String ICO_WALK_IN_ROOM = "img/carelog/Walk in Room.png";

	/* WALK_IN_HALL */
	private static final String TXT_WALK_IN_HALL = "Walk in hall";
	private static final String ICO_WALK_IN_HALL = "img/carelog/walk in Hall.png";

	/* DRESSING */
	private static final String TXT_DRESSING = "Dressing";
	private static final String ICO_DRESSING = "img/carelog/Dressing.png";

	/* EATING */
	private static final String TXT_EATING = "Eating";
	private static final String ICO_EATING = "img/carelog/Eating.png";

	/* EATING_GOOD */
	private static final String TXT_EATING_GOOD = "Good (76% - 100%)";
	private static final String ICO_EATING_GOOD = "img/carelog/cnadidnotoccur.png";

	/* EATING_FAIR */
	private static final String TXT_EATING_FAIR = "Fair (50% - 75%)";
	private static final String ICO_EATING_FAIR = "img/carelog/cnadidnotoccur.png";

	/* EATING_POOR */
	private static final String TXT_EATING_POOR = "Poor (0% - 49%)";
	private static final String ICO_EATING_POOR = "img/carelog/cnadidnotoccur.png";

	/* SHOWER */
	private static final String TXT_SHOWER = "Shower";
	private static final String ICO_SHOWER = "img/carelog/shower.png";

	/* SHOWER_1ST */
	private static final String TXT_SHOWER_1ST = "7 - 3";
	private static final String ICO_SHOWER_1ST = "img/clshower.png.png";

	/* SHOWER_2ND */
	private static final String TXT_SHOWER_2ND = "3 - 11";
	private static final String ICO_SHOWER_2ND = "img/clshower.png.png";

	/* SHOWER_3RD */
	private static final String TXT_SHOWER_3RD = "11 - 7";
	private static final String ICO_SHOWER_3RD = "img/carelog/clshower.png";

	/* ACCEPT OR DECLINE */
	private static final String TXT_ACCEPT = "Accept";
	private static final String ICO_ACCEPT = "img/carelog/tick_mark.png";
	private static final String TXT_DECLINE = "Decline";
	private static final String ICO_DECLINE = "img/carelog/question_mark.png";

	/* LOCOMOTION */
	private static final String TXT_LOCOMOTION = "Locomotion";
	private static final String ICO_LOCOMOTION = "img/carelog/locomotion.png";

	/* LOCOMOTION_ON_UNIT */
	private static final String TXT_LOCOMOTION_ON_UNIT = "Locomotion On Unit";
	private static final String ICO_LOCOMOTION_ON_UNIT = "img/carelog/Locomotion on Unit.png";

	/* LOCOMOTION_OFF_UNIT */
	private static final String TXT_LOCOMOTION_OFF_UNIT = "Locomotion Off Unit";
	private static final String ICO_LOCOMOTION_OFF_UNIT = "img/carelog/Locomotion off Unit.png";

	/* LOCOMOTION_OPTIONS */
	private static final String TXT_LOCOMOTION_OPT_ADLIB = "AD LIB";
	private static final String ICO_LOCOMOTION_OPT_ADLIB = "img/carelog/cnadidnotoccur.png";
	private static final String TXT_LOCOMOTION_OPT_CANE = "Cane";
	private static final String ICO_LOCOMOTION_OPT_CANE = "img/carelog/cnadidnotoccur.png";
	private static final String TXT_LOCOMOTION_OPT_WALKER = "Walker";
	private static final String ICO_LOCOMOTION_OPT_WALKER = "img/carelog/cnadidnotoccur.png";
	private static final String TXT_LOCOMOTION_OPT_WHEELCHAIR = "Wheel Chair";
	private static final String ICO_LOCOMOTION_OPT_WHEELCHAIR = "img/carelog/cnadidnotoccur.png";

	/* RISK MONITORING */
	private static final String TXT_RISKMONITORING = "Risk Monitoring";
	private static final String ICO_RISKMONITORING = "img/carelog/RiskMonitoring.png";

	/* FALLRISK */
	private static final String TXT_FALLRISK = "Fall Risk";
	private static final String ICO_FALLRISK = "img/carelog/cnadidnotoccur.png";

	/* FALLRISK_OPT */
	private static final String TXT_FALLRISK_OPT_0 = "Floor Mat Checked";
	private static final String ICO_FALLRISK_OPT_0 = "img/carelog/cnadidnotoccur.png";
	private static final String TXT_FALLRISK_OPT_1 = "Bed Alarms";
	private static final String ICO_FALLRISK_OPT_1 = "img/carelog/cnadidnotoccur.png";
	private static final String TXT_FALLRISK_OPT_2 = "Chair Alarm";
	private static final String ICO_FALLRISK_OPT_2 = "img/carelog/cnadidnotoccur.png";
	private static final String TXT_FALLRISK_OPT_3 = "Bed In Lower Position";
	private static final String ICO_FALLRISK_OPT_3 = "img/carelog/cnadidnotoccur.png";

	/* RESTRAINT */
	private static final String TXT_RESTRAINT = "Restraint";
	private static final String ICO_RESTRAINT = "img/carelog/cnadidnotoccur.png";

	/* RESTRAINT_OPT */
	private static final String TXT_RESTRAINT_OPT_0 = "In Place";
	private static final String ICO_RESTRAINT_OPT_0 = "img/carelog/cnadidnotoccur.png";
	private static final String TXT_RESTRAINT_OPT_1 = "Option 1";
	private static final String ICO_RESTRAINT_OPT_1 = "img/carelog/cnadidnotoccur.png";
	private static final String TXT_RESTRAINT_OPT_2 = "Option 2";
	private static final String ICO_RESTRAINT_OPT_2 = "img/carelog/cnadidnotoccur.png";
	private static final String TXT_RESTRAINT_OPT_3 = "Option 3";
	private static final String ICO_RESTRAINT_OPT_3 = "img/carelog/cnadidnotoccur.png";

	/* ELOPMENTRISK */
	private static final String TXT_ELOPMENTRISK = "Elopment Risk";
	private static final String ICO_ELOPMENTRISK = "img/carelog/cnadidnotoccur.png";

	/* ELOPMENTRISK_OPT */
	private static final String TXT_ELOPMENTRISK_OPT_0 = "Wonder Guard";
	private static final String ICO_ELOPMENTRISK_OPT_0 = "img/carelog/cnadidnotoccur.png";
	private static final String TXT_ELOPMENTRISK_OPT_1 = "Option 1";
	private static final String ICO_ELOPMENTRISK_OPT_1 = "img/carelog/cnadidnotoccur.png";
	private static final String TXT_ELOPMENTRISK_OPT_2 = "Option 2";
	private static final String ICO_ELOPMENTRISK_OPT_2 = "img/carelog/cnadidnotoccur.png";
	private static final String TXT_ELOPMENTRISK_OPT_3 = "Option 3";
	private static final String ICO_ELOPMENTRISK_OPT_3 = "img/carelog/cnadidnotoccur.png";

	/* SIDERAILS */
	private static final String TXT_SIDERAILS = "Side rails";
	private static final String ICO_SIDERAILS = "img/carelog/cnadidnotoccur.png";

	/* SIDERAILS_OPT */
	private static final String TXT_SIDERAILS_OPT_0 = "Up";
	private static final String ICO_SIDERAILS_OPT_0 = "img/carelog/up.png";
	private static final String TXT_SIDERAILS_OPT_1 = "Down";
	private static final String ICO_SIDERAILS_OPT_1 = "img/carelog/down.png";
	private static final String TXT_SIDERAILS_OPT_2 = "Option 1";
	private static final String ICO_SIDERAILS_OPT_2 = "img/carelog/cnadidnotoccur.png";
	private static final String TXT_SIDERAILS_OPT_3 = "Option 2";
	private static final String ICO_SIDERAILS_OPT_3 = "img/carelog/cnadidnotoccur.png";

	/* assistance constants */
	private static final String TXT_ASSISTANCE_0 = "0. Independent";
	private static final String TXT_ASSISTANCE_1 = "1. Supervision";
	private static final String TXT_ASSISTANCE_2 = "2. Limited Assistance";
	private static final String TXT_ASSISTANCE_3 = "3. Extensive Assistance";
	private static final String TXT_ASSISTANCE_4 = "4. Total Dependence";
	private static final String TXT_ASSISTANCE_8 = "8. Did Not Occur";

	private static final String ICO_ASSISTANCE_0 = "img/carelog/cnaindependent.png";
	private static final String ICO_ASSISTANCE_1 = "img/carelog/cnasupervision.png";
	private static final String ICO_ASSISTANCE_2 = "img/carelog/cnalimitedassistance.png";
	private static final String ICO_ASSISTANCE_3 = "img/carelog/cnaextensiveassistance.png";
	private static final String ICO_ASSISTANCE_4 = "img/carelog/cnatotaldependence.png";
	private static final String ICO_ASSISTANCE_8 = "img/carelog/cnadidnotoccur.png";

	/* HOYER */
	private static final String TXT_HOYER = "Hoyer";
	private static final String ICO_HOYER = "img/carelog/cnadidnotoccur.png";

	/* supervision constants */
	private static final String TXT_SUPERVISION_0 = "0. No setup or physical help from staff";
	private static final String TXT_SUPERVISION_1 = "1. Setup help only";
	private static final String TXT_SUPERVISION_2 = "2. One person physical assistance";
	private static final String TXT_SUPERVISION_3 = "3. Two+ person physical assistance";
	private static final String TXT_SUPERVISION_8 = "8. ADL activity itself did not occur during entire 7 days";

	private static final String ICO_SUPERVISION_0 = "img/carelog/cnasupervision.png";
	private static final String ICO_SUPERVISION_1 = "img/carelog/cnadidnotoccur.png";
	private static final String ICO_SUPERVISION_2 = "img/carelog/cnadidnotoccur.png";
	private static final String ICO_SUPERVISION_3 = "img/carelog/cnadidnotoccur.png";
	private static final String ICO_SUPERVISION_8 = "img/carelog/cnadidnotoccur.png";

	/* assistance constants */
	private static final String TXT_MDS_H1_0 = "0. Continent";
	private static final String TXT_MDS_H1_1 = "1. Usually Continent";
	private static final String TXT_MDS_H1_2 = "2. Occasionally Continent";
	private static final String TXT_MDS_H1_3 = "3. Frequently Incontinent";
	private static final String TXT_MDS_H1_4 = "4. Incontinent";

	private static final String ICO_MDS_H1_0 = "img/carelog/cnadidnotoccur.png";
	private static final String ICO_MDS_H1_1 = "img/carelog/cnadidnotoccur.png";
	private static final String ICO_MDS_H1_2 = "img/carelog/cnadidnotoccur.png";
	private static final String ICO_MDS_H1_3 = "img/carelog/cnadidnotoccur.png";
	private static final String ICO_MDS_H1_4 = "img/carelog/Incontinence.jpg";

	/* Weight Options */

	private static final String TXT_WEIGHT = "Weight";
	private static final String ICO_WEIGHT = "img/carelog/Weight.png";

	private static final String TXT_WEIGHT_0 = "0. Yes";
	private static final String TXT_WEIGHT_1 = "1. No";

	private static final String ICO_WEIGHT_0 = "img/carelog/weightYes.png";
	private static final String ICO_WEIGHT_1 = "img/carelog/weightNo.png";

	/* Eat Options */
	private static final String TXT_EAT = "EAT";
	private static final String ICO_EAT = "img/carelog/Eat.png";

	/* Hygiene */
	private static final String TXT_HYGIENE = "PERSONAL HYGIENE";
	private static final String ICO_HYGIENE = "img/carelog/Hygiene.png";

	private int val = 0;

	private DefaultMutableTreeNode node(String title, String iconPath,
			int value, int level, boolean multipleAllowed) {
		DefaultMutableTreeNode node = new DefaultMutableTreeNode();

		CareLogValue ref = new CareLogValue();
		ref.setTitle(title);
		ref.setIcon(newIcon(iconPath));
		ref.setValue(value);
		ref.setLevel(level);
		ref.setMultipleAllowed(multipleAllowed);

		node.setUserObject(ref);

		return node;
	}

	private ImageIcon newIcon(String imagePath) {
		return new ImageIcon(imagePath);
	}

	private int getVal() {
		return ++val;
	}

	/* ROOT */
	public DefaultMutableTreeNode getValues() {
		DefaultMutableTreeNode tree = node("ROOT", "img/carelog/cnadidnotoccur.png", 0,
				0, true);

		tree.add(getBedMobilityValues());
		tree.add(getTransferValues());
		tree.add(getWalkInRoomValues());
		tree.add(getWalkInHallValues());
		tree.add(getLocomotionValues());
		tree.add(getDressingValues());
		tree.add(getEat());
		tree.add(getToiletUseValues());
		tree.add(getHygiene());
		tree.add(getEatingValues());
		tree.add(getShowerValues());
		tree.add(getRiskMonitoringValues());
		tree.add(getWeightValues());

		return tree;
	}

	/* Node 01 */
	private DefaultMutableTreeNode getToiletUseValues() {
		DefaultMutableTreeNode tree = node(TXT_TOILETUSE, ICO_TOILETUSE,
				getVal(), 1, true);
		tree = addToiletUseOptions(tree);
		return tree;
	}

	/* Node 02 */
	private DefaultMutableTreeNode getTransferValues() {
		DefaultMutableTreeNode tree = node(TXT_TRANSFER, ICO_TRANSFER,
				getVal(), 1, false);
		tree = addAssistanceForTransfer(tree);
		return tree;
	}

	/* Node 03 */
	private DefaultMutableTreeNode getBedMobilityValues() {
		DefaultMutableTreeNode tree = node(TXT_BEDMOBILITY, ICO_BEDMOBILITY,
				getVal(), 1, false);
		tree = addAssistance(tree, T, T, T, T, T, T, false, false);
		return tree;
	}

	/* Node 04 */
	private DefaultMutableTreeNode getWalkInRoomValues() {
		DefaultMutableTreeNode tree = node(TXT_WALK_IN_ROOM, ICO_WALK_IN_ROOM,
				getVal(), 1, false);
		tree = addAssistance(tree, T, T, T, T, T, T, false, false);
		return tree;
	}

	/* Node 05 */
	private DefaultMutableTreeNode getWalkInHallValues() {
		DefaultMutableTreeNode tree = node(TXT_WALK_IN_HALL, ICO_WALK_IN_HALL,
				getVal(), 1, false);
		tree = addAssistance(tree, T, T, T, T, T, T, false, false);
		return tree;
	}

	/* Node 06 */
	private DefaultMutableTreeNode getDressingValues() {
		DefaultMutableTreeNode tree = node(TXT_DRESSING, ICO_DRESSING,
				getVal(), 1, false);
		tree = addAssistance(tree, T, T, T, T, T, T, false, false);
		return tree;
	}

	/* Node 07 */
	private DefaultMutableTreeNode getEatingValues() {
		DefaultMutableTreeNode tree = node(TXT_EATING, ICO_EATING, getVal(), 1,
				false);
		tree = addEatingOptions(tree, T, T, T, false);
		return tree;
	}

	/* Node 08 */
	private DefaultMutableTreeNode getShowerValues() {
		DefaultMutableTreeNode tree = node(TXT_SHOWER, ICO_SHOWER, getVal(), 1,
				false);
		tree = addShowerOptions(tree, T, T, T, false);
		return tree;
	}

	/* Node 09 */
	private DefaultMutableTreeNode getLocomotionValues() {
		DefaultMutableTreeNode tree = node(TXT_LOCOMOTION, ICO_LOCOMOTION,
				getVal(), 1, false);
		tree = addLocomotionOptions(tree, true);
		return tree;
	}

	/* Node 10 */
	private DefaultMutableTreeNode getRiskMonitoringValues() {
		DefaultMutableTreeNode tree = node(TXT_RISKMONITORING,
				ICO_RISKMONITORING, getVal(), 1, false);
		tree = addRiskMonitoringOptions(tree);
		return tree;
	}

	/* Node 11 */

	private DefaultMutableTreeNode getWeightValues() {
		DefaultMutableTreeNode tree = node(TXT_WEIGHT, ICO_WEIGHT, getVal(), 1,
				false);
		tree = addWeightOptions(tree);
		return tree;
	}

	/* Node 12 */
	private DefaultMutableTreeNode getEat() {
		DefaultMutableTreeNode tree = node(TXT_EAT, ICO_EAT, getVal(), 1, true);
		tree = addAssistance(tree, T, T, T, T, T, T, false, false);
		return tree;
	}

	/* Node 13 */
	private DefaultMutableTreeNode getHygiene() {
		DefaultMutableTreeNode tree = node(TXT_HYGIENE, ICO_HYGIENE, getVal(),
				1, true);
		tree = addAssistance(tree, T, T, T, T, T, T, false, false);
		return tree;
	}

	private DefaultMutableTreeNode addWeightOptions(DefaultMutableTreeNode tree) {
		CareLogValue val = (CareLogValue) tree.getUserObject();
		int lvl = val.getLevel() + 1;
		tree.add(node(TXT_WEIGHT_0, ICO_WEIGHT_0, getVal(), lvl, false));
		tree.add(node(TXT_WEIGHT_1, ICO_WEIGHT_1, getVal(), lvl, false));

		return tree;
	}

	private DefaultMutableTreeNode addToiletUseOptions(
			DefaultMutableTreeNode tree) {
		CareLogValue val = (CareLogValue) tree.getUserObject();
		int lvl = val.getLevel() + 1;

		tree.add(addAssistance(node(TXT_TOILETUSE_ELIMINATION_URINE,
				ICO_TOILETUSE_ELIMINATION_URINE, getVal(), lvl, false), T, T,
				T, T, T, T, true, false));
		tree.add(addAssistance(node(TXT_TOILETUSE_BM_FREQUENCY,
				ICO_TOILETUSE_BM_FREQUENCY, getVal(), lvl, false), T, T, T, T,
				T, T, true, false));

		return tree;
	}

	private DefaultMutableTreeNode addRiskMonitoringOptions(
			DefaultMutableTreeNode tree) {
		CareLogValue val = (CareLogValue) tree.getUserObject();
		int lvl = val.getLevel() + 1;

		tree.add(addFallRiskOptions(node(TXT_FALLRISK, ICO_FALLRISK, getVal(),
				lvl, true), T, T, T, T));
		tree.add(addRestraintOptions(node(TXT_RESTRAINT, ICO_RESTRAINT,
				getVal(), lvl, false), T, T, T, T));
		tree.add(addElopmentRiskOptions(node(TXT_ELOPMENTRISK,
				ICO_ELOPMENTRISK, getVal(), lvl, false), T, T, T, T));
		tree.add(addSideRails(node(TXT_SIDERAILS, ICO_SIDERAILS, getVal(), lvl,
				false), T, T, T, T));

		return tree;
	}

	private DefaultMutableTreeNode addRestraintOptions(
			DefaultMutableTreeNode tree, boolean $a, boolean $b, boolean $c,
			boolean $d) {
		CareLogValue val = (CareLogValue) tree.getUserObject();
		int lvl = val.getLevel() + 1;

		if ($a) {
			tree.add(node(TXT_RESTRAINT_OPT_0, ICO_RESTRAINT_OPT_0, getVal(),
					lvl, false));
		}
		if ($b) {
			tree.add(node(TXT_RESTRAINT_OPT_1, ICO_RESTRAINT_OPT_1, getVal(),
					lvl, false));
		}
		if ($c) {
			tree.add(node(TXT_RESTRAINT_OPT_2, ICO_RESTRAINT_OPT_2, getVal(),
					lvl, false));
		}
		if ($d) {
			tree.add(node(TXT_RESTRAINT_OPT_3, ICO_RESTRAINT_OPT_3, getVal(),
					lvl, false));
		}

		return tree;
	}

	private DefaultMutableTreeNode addElopmentRiskOptions(
			DefaultMutableTreeNode tree, boolean $a, boolean $b, boolean $c,
			boolean $d) {
		CareLogValue val = (CareLogValue) tree.getUserObject();
		int lvl = val.getLevel() + 1;

		if ($a) {
			tree.add(node(TXT_ELOPMENTRISK_OPT_0, ICO_ELOPMENTRISK_OPT_0,
					getVal(), lvl, false));
		}
		if ($b) {
			tree.add(node(TXT_ELOPMENTRISK_OPT_1, ICO_ELOPMENTRISK_OPT_1,
					getVal(), lvl, false));
		}
		if ($c) {
			tree.add(node(TXT_ELOPMENTRISK_OPT_2, ICO_ELOPMENTRISK_OPT_2,
					getVal(), lvl, false));
		}
		if ($d) {
			tree.add(node(TXT_ELOPMENTRISK_OPT_3, ICO_ELOPMENTRISK_OPT_3,
					getVal(), lvl, false));
		}

		return tree;
	}

	private DefaultMutableTreeNode addSideRails(DefaultMutableTreeNode tree,
			boolean $a, boolean $b, boolean $c, boolean $d) {
		CareLogValue val = (CareLogValue) tree.getUserObject();
		int lvl = val.getLevel() + 1;

		if ($a) {
			tree.add(node(TXT_SIDERAILS_OPT_0, ICO_SIDERAILS_OPT_0, getVal(),
					lvl, false));
		}
		if ($b) {
			tree.add(node(TXT_SIDERAILS_OPT_1, ICO_SIDERAILS_OPT_1, getVal(),
					lvl, false));
		}
		if ($c) {
			tree.add(node(TXT_SIDERAILS_OPT_2, ICO_SIDERAILS_OPT_2, getVal(),
					lvl, false));
		}
		if ($d) {
			tree.add(node(TXT_SIDERAILS_OPT_3, ICO_SIDERAILS_OPT_3, getVal(),
					lvl, false));
		}

		return tree;
	}

	private DefaultMutableTreeNode addFallRiskOptions(
			DefaultMutableTreeNode tree, boolean $a, boolean $b, boolean $c,
			boolean $d) {
		CareLogValue val = (CareLogValue) tree.getUserObject();
		int lvl = val.getLevel() + 1;

		if ($a) {
			tree.add(node(TXT_FALLRISK_OPT_0, ICO_FALLRISK_OPT_0, getVal(),
					lvl, false));
		}
		if ($b) {
			tree.add(node(TXT_FALLRISK_OPT_1, ICO_FALLRISK_OPT_1, getVal(),
					lvl, false));
		}
		if ($c) {
			tree.add(node(TXT_FALLRISK_OPT_2, ICO_FALLRISK_OPT_2, getVal(),
					lvl, false));
		}
		if ($d) {
			tree.add(node(TXT_FALLRISK_OPT_3, ICO_FALLRISK_OPT_3, getVal(),
					lvl, false));
		}

		return tree;
	}

	private DefaultMutableTreeNode addLocomotionOptions(
			DefaultMutableTreeNode tree, boolean withLocoOpts) {
		CareLogValue val = (CareLogValue) tree.getUserObject();
		int lvl = val.getLevel() + 1;

		tree.add(addAssistance(node(TXT_LOCOMOTION_ON_UNIT,
				ICO_LOCOMOTION_ON_UNIT, getVal(), lvl, false), T, T, T, T, T,
				T, false, withLocoOpts));
		tree.add(addAssistance(node(TXT_LOCOMOTION_OFF_UNIT,
				ICO_LOCOMOTION_OFF_UNIT, getVal(), lvl, false), T, T, T, T, T,
				T, false, withLocoOpts));

		return tree;
	}

	private DefaultMutableTreeNode addShowerOptions(
			DefaultMutableTreeNode tree, boolean $G, boolean $F, boolean $P,
			boolean withMDS) {
		CareLogValue val = (CareLogValue) tree.getUserObject();
		int lvl = val.getLevel() + 1;

		if ($G) {
			tree.add(addAcceptDecline(node(TXT_SHOWER_1ST, ICO_SHOWER_1ST,
					getVal(), lvl, false), false, withMDS));
		}
		if ($F) {
			tree.add(addAcceptDecline(node(TXT_SHOWER_2ND, ICO_SHOWER_2ND,
					getVal(), lvl, false), false, withMDS));
		}
		if ($P) {
			tree.add(addAcceptDecline(node(TXT_SHOWER_3RD, ICO_SHOWER_3RD,
					getVal(), lvl, false), false, withMDS));
		}

		return tree;
	}

	private DefaultMutableTreeNode addAcceptDecline(
			DefaultMutableTreeNode tree, boolean withAssist, boolean withMDS) {
		CareLogValue val = (CareLogValue) tree.getUserObject();
		int lvl = val.getLevel() + 1;

		if (withAssist) {
			tree.add(addAssistance(node(TXT_ACCEPT, ICO_ACCEPT, getVal(), lvl,
					false), T, T, T, T, T, T, withMDS, false));
			tree.add(addAssistance(node(TXT_DECLINE, ICO_DECLINE, getVal(),
					lvl, false), T, T, T, T, T, T, withMDS, false));
		} else {
			tree.add(node(TXT_ACCEPT, ICO_ACCEPT, getVal(), lvl, false));
			tree.add(node(TXT_DECLINE, ICO_DECLINE, getVal(), lvl, false));
		}
		return tree;
	}

	private DefaultMutableTreeNode addEatingOptions(
			DefaultMutableTreeNode tree, boolean $G, boolean $F, boolean $P,
			boolean withMDS) {
		CareLogValue val = (CareLogValue) tree.getUserObject();
		int lvl = val.getLevel() + 1;

		if ($G) {
			tree.add(node(TXT_EATING_GOOD, ICO_EATING_GOOD, getVal(), lvl,
					false));
		}
		if ($F) {
			tree.add(node(TXT_EATING_FAIR, ICO_EATING_FAIR, getVal(), lvl,
					false));
		}
		if ($P) {
			tree.add(node(TXT_EATING_POOR, ICO_EATING_POOR, getVal(), lvl,
					false));
		}

		return tree;
	}

	private DefaultMutableTreeNode addAssistanceForTransfer(
			DefaultMutableTreeNode tree) {
		DefaultMutableTreeNode node = addAssistance(tree, T, T, T, T, T, T,
				false, false);

		node.add(addSupervision(node(TXT_HOYER, ICO_HOYER, getVal(), 2, false),
				T, T, T, T, T, false, false));

		return node;
	}

	private DefaultMutableTreeNode addAssistance(DefaultMutableTreeNode tree,
			boolean $0, boolean $1, boolean $2, boolean $3, boolean $4,
			boolean $8, boolean withMDS, boolean withLocoOpts) {
		CareLogValue val = (CareLogValue) tree.getUserObject();
		int lvl = val.getLevel() + 1;

		if ($0) {
			tree
					.add(addSupervision(node(TXT_ASSISTANCE_0,
							ICO_ASSISTANCE_0, getVal(), lvl, false), T, F, F,
							F, F, withMDS, withLocoOpts));
		}
		if ($1) {
			tree
					.add(addSupervision(node(TXT_ASSISTANCE_1,
							ICO_ASSISTANCE_1, getVal(), lvl, false), F, T, T,
							F, F, withMDS, withLocoOpts));
		}
		if ($2) {
			tree
					.add(addSupervision(node(TXT_ASSISTANCE_2,
							ICO_ASSISTANCE_2, getVal(), lvl, false), F, T, T,
							T, F, withMDS, withLocoOpts));
		}
		if ($3) {
			tree
					.add(addSupervision(node(TXT_ASSISTANCE_3,
							ICO_ASSISTANCE_3, getVal(), lvl, false), F, F, T,
							T, F, withMDS, withLocoOpts));
		}
		if ($4) {
			tree
					.add(addSupervision(node(TXT_ASSISTANCE_4,
							ICO_ASSISTANCE_4, getVal(), lvl, false), F, F, F,
							T, F, withMDS, withLocoOpts));
		}
		if ($8) {
			tree
					.add(addSupervision(node(TXT_ASSISTANCE_8,
							ICO_ASSISTANCE_8, getVal(), lvl, false), F, F, F,
							F, T, withMDS, withLocoOpts));
		}

		return tree;
	}

	private DefaultMutableTreeNode addSupervision(DefaultMutableTreeNode tree,
			boolean $0, boolean $1, boolean $2, boolean $3, boolean $8,
			boolean withMDS, boolean withLocoOpts) {
		CareLogValue val = (CareLogValue) tree.getUserObject();
		int lvl = val.getLevel() + 1;

		if (withMDS || withLocoOpts) {
			if (withMDS && withLocoOpts) {
				if ($0) {
					tree.add(addMdsH1(addLocoOpts(node(TXT_SUPERVISION_0,
							ICO_SUPERVISION_0, getVal(), lvl, false), T, T, T,
							T, false), T, T, T, T, T, false));
				}
				if ($1) {
					tree.add(addMdsH1(addLocoOpts(node(TXT_SUPERVISION_1,
							ICO_SUPERVISION_1, getVal(), lvl, false), T, T, T,
							T, false), T, T, T, T, T, false));
				}
				if ($2) {
					tree.add(addMdsH1(addLocoOpts(node(TXT_SUPERVISION_2,
							ICO_SUPERVISION_2, getVal(), lvl, false), T, T, T,
							T, false), T, T, T, T, T, false));
				}
				if ($3) {
					tree.add(addMdsH1(addLocoOpts(node(TXT_SUPERVISION_3,
							ICO_SUPERVISION_3, getVal(), lvl, false), T, T, T,
							T, false), T, T, T, T, T, false));
				}
				if ($8) {
					tree.add(addMdsH1(addLocoOpts(node(TXT_SUPERVISION_8,
							ICO_SUPERVISION_8, getVal(), lvl, false), T, T, T,
							T, false), T, T, T, T, T, false));
				}
			} else if (withMDS) {
				if ($0) {
					tree.add(addMdsH1(node(TXT_SUPERVISION_0,
							ICO_SUPERVISION_0, getVal(), lvl, false), T, T, T,
							T, T, false));
				}
				if ($1) {
					tree.add(addMdsH1(node(TXT_SUPERVISION_1,
							ICO_SUPERVISION_1, getVal(), lvl, false), T, T, T,
							T, T, false));
				}
				if ($2) {
					tree.add(addMdsH1(node(TXT_SUPERVISION_2,
							ICO_SUPERVISION_2, getVal(), lvl, false), T, T, T,
							T, T, false));
				}
				if ($3) {
					tree.add(addMdsH1(node(TXT_SUPERVISION_3,
							ICO_SUPERVISION_3, getVal(), lvl, false), T, T, T,
							T, T, false));
				}
				if ($8) {
					tree.add(addMdsH1(node(TXT_SUPERVISION_8,
							ICO_SUPERVISION_8, getVal(), lvl, false), T, T, T,
							T, T, false));
				}
			} else if (withLocoOpts) {
				if ($0) {
					tree.add(addLocoOpts(node(TXT_SUPERVISION_0,
							ICO_SUPERVISION_0, getVal(), lvl, false), T, T, T,
							T, false));
				}
				if ($1) {
					tree.add(addLocoOpts(node(TXT_SUPERVISION_1,
							ICO_SUPERVISION_1, getVal(), lvl, false), T, T, T,
							T, false));
				}
				if ($2) {
					tree.add(addLocoOpts(node(TXT_SUPERVISION_2,
							ICO_SUPERVISION_2, getVal(), lvl, false), T, T, T,
							T, false));
				}
				if ($3) {
					tree.add(addLocoOpts(node(TXT_SUPERVISION_3,
							ICO_SUPERVISION_3, getVal(), lvl, false), T, T, T,
							T, false));
				}
				if ($8) {
					tree.add(addLocoOpts(node(TXT_SUPERVISION_8,
							ICO_SUPERVISION_8, getVal(), lvl, false), T, T, T,
							T, false));
				}
			}
		} else {
			if ($0) {
				tree.add(node(TXT_SUPERVISION_0, ICO_SUPERVISION_0, getVal(),
						lvl, false));
			}
			if ($1) {
				tree.add(node(TXT_SUPERVISION_1, ICO_SUPERVISION_1, getVal(),
						lvl, false));
			}
			if ($2) {
				tree.add(node(TXT_SUPERVISION_2, ICO_SUPERVISION_2, getVal(),
						lvl, false));
			}
			if ($3) {
				tree.add(node(TXT_SUPERVISION_3, ICO_SUPERVISION_3, getVal(),
						lvl, false));
			}
			if ($8) {
				tree.add(node(TXT_SUPERVISION_8, ICO_SUPERVISION_8, getVal(),
						lvl, false));
			}
		}
		return tree;
	}

	private DefaultMutableTreeNode addLocoOpts(DefaultMutableTreeNode tree,
			boolean $0, boolean $1, boolean $2, boolean $3, boolean multiAllow) {
		CareLogValue val = (CareLogValue) tree.getUserObject();
		int lvl = val.getLevel() + 1;

		if ($0) {
			tree.add(node(TXT_LOCOMOTION_OPT_ADLIB, ICO_LOCOMOTION_OPT_ADLIB,
					getVal(), lvl, multiAllow));
		}
		if ($1) {
			tree.add(node(TXT_LOCOMOTION_OPT_CANE, ICO_LOCOMOTION_OPT_CANE,
					getVal(), lvl, multiAllow));
		}
		if ($2) {
			tree.add(node(TXT_LOCOMOTION_OPT_WALKER, ICO_LOCOMOTION_OPT_WALKER,
					getVal(), lvl, multiAllow));
		}
		if ($3) {
			tree.add(node(TXT_LOCOMOTION_OPT_WHEELCHAIR,
					ICO_LOCOMOTION_OPT_WHEELCHAIR, getVal(), lvl, multiAllow));
		}

		return tree;
	}

	private DefaultMutableTreeNode addMdsH1(DefaultMutableTreeNode tree,
			boolean $0, boolean $1, boolean $2, boolean $3, boolean $4,
			boolean multiAllow) {
		CareLogValue val = (CareLogValue) tree.getUserObject();
		int lvl = val.getLevel() + 1;

		if ($0) {
			tree
					.add(node(TXT_MDS_H1_0, ICO_MDS_H1_0, getVal(), lvl,
							multiAllow));
		}
		if ($1) {
			tree
					.add(node(TXT_MDS_H1_1, ICO_MDS_H1_1, getVal(), lvl,
							multiAllow));
		}
		if ($2) {
			tree
					.add(node(TXT_MDS_H1_2, ICO_MDS_H1_2, getVal(), lvl,
							multiAllow));
		}
		if ($3) {
			tree
					.add(node(TXT_MDS_H1_3, ICO_MDS_H1_3, getVal(), lvl,
							multiAllow));
		}
		if ($4) {
			tree
					.add(node(TXT_MDS_H1_4, ICO_MDS_H1_4, getVal(), lvl,
							multiAllow));
		}

		return tree;
	}
}
