package medrex.client.mds3.general.itemsets;

import medrex.client.mds3.general.Mds3ItemSet;
import medrex.client.mds3.general.Mds3Page;
import medrex.client.mds3.ui.commons.Mds3Footer;
import medrex.client.mds3.ui.commons.Mds3Header;
import medrex.client.mds3.ui.itemSpecific.PanelNQheader;
import medrex.client.mds3.ui.subSections.sectionA.PanelA0100;
import medrex.client.mds3.ui.subSections.sectionA.PanelA0200;
import medrex.client.mds3.ui.subSections.sectionA.PanelA0310A;
import medrex.client.mds3.ui.subSections.sectionA.PanelA0310B;
import medrex.client.mds3.ui.subSections.sectionA.PanelA0310C;
import medrex.client.mds3.ui.subSections.sectionA.PanelA0310D;
import medrex.client.mds3.ui.subSections.sectionA.PanelA0310E;
import medrex.client.mds3.ui.subSections.sectionA.PanelA0310F;
import medrex.client.mds3.ui.subSections.sectionA.PanelA0410;
import medrex.client.mds3.ui.subSections.sectionA.PanelA0500;
import medrex.client.mds3.ui.subSections.sectionA.PanelA0600;
import medrex.client.mds3.ui.subSections.sectionA.PanelA0700;
import medrex.client.mds3.ui.subSections.sectionA.PanelA0800;
import medrex.client.mds3.ui.subSections.sectionA.PanelA0900;
import medrex.client.mds3.ui.subSections.sectionA.PanelA1000;
import medrex.client.mds3.ui.subSections.sectionA.PanelA1100;
import medrex.client.mds3.ui.subSections.sectionA.PanelA1200;
import medrex.client.mds3.ui.subSections.sectionA.PanelA1300;
import medrex.client.mds3.ui.subSections.sectionA.PanelA1500;
import medrex.client.mds3.ui.subSections.sectionA.PanelA1550;
import medrex.client.mds3.ui.subSections.sectionA.PanelA1600;
import medrex.client.mds3.ui.subSections.sectionA.PanelA1700;
import medrex.client.mds3.ui.subSections.sectionA.PanelA1800;
import medrex.client.mds3.ui.subSections.sectionA.PanelA2000;
import medrex.client.mds3.ui.subSections.sectionA.PanelA2100;
import medrex.client.mds3.ui.subSections.sectionA.PanelA2200;
import medrex.client.mds3.ui.subSections.sectionA.PanelA2300;
import medrex.client.mds3.ui.subSections.sectionA.PanelA2400;
import medrex.client.mds3.ui.subSections.sectionA.PanelAHeader;
import medrex.client.mds3.ui.subSections.sectionB.PanelB0100;
import medrex.client.mds3.ui.subSections.sectionB.PanelB0200;
import medrex.client.mds3.ui.subSections.sectionB.PanelB0300;
import medrex.client.mds3.ui.subSections.sectionB.PanelB0600;
import medrex.client.mds3.ui.subSections.sectionB.PanelB0700;
import medrex.client.mds3.ui.subSections.sectionB.PanelB0800;
import medrex.client.mds3.ui.subSections.sectionB.PanelB1000;
import medrex.client.mds3.ui.subSections.sectionB.PanelB1200;
import medrex.client.mds3.ui.subSections.sectionB.PanelBHeader;
import medrex.client.mds3.ui.subSections.sectionB.PanelSubHeader;
import medrex.client.mds3.ui.subSections.sectionC.PanelC0100;
import medrex.client.mds3.ui.subSections.sectionC.PanelC0200;
import medrex.client.mds3.ui.subSections.sectionC.PanelC0300;
import medrex.client.mds3.ui.subSections.sectionC.PanelC0300A;
import medrex.client.mds3.ui.subSections.sectionC.PanelC0300B;
import medrex.client.mds3.ui.subSections.sectionC.PanelC0300C;
import medrex.client.mds3.ui.subSections.sectionC.PanelC0400;
import medrex.client.mds3.ui.subSections.sectionC.PanelC0400A;
import medrex.client.mds3.ui.subSections.sectionC.PanelC0400B;
import medrex.client.mds3.ui.subSections.sectionC.PanelC0400C;
import medrex.client.mds3.ui.subSections.sectionC.PanelC0500;
import medrex.client.mds3.ui.subSections.sectionC.PanelC0600;
import medrex.client.mds3.ui.subSections.sectionC.PanelC0700;
import medrex.client.mds3.ui.subSections.sectionC.PanelC0800;
import medrex.client.mds3.ui.subSections.sectionC.PanelC0900;
import medrex.client.mds3.ui.subSections.sectionC.PanelC1000;
import medrex.client.mds3.ui.subSections.sectionC.PanelC1300;
import medrex.client.mds3.ui.subSections.sectionC.PanelC1600;
import medrex.client.mds3.ui.subSections.sectionC.PanelCHeader;
import medrex.client.mds3.ui.subSections.sectionD.PanelD0100;
import medrex.client.mds3.ui.subSections.sectionD.PanelD0200;
import medrex.client.mds3.ui.subSections.sectionD.PanelD0300;
import medrex.client.mds3.ui.subSections.sectionD.PanelD0350;
import medrex.client.mds3.ui.subSections.sectionD.PanelD0500;
import medrex.client.mds3.ui.subSections.sectionD.PanelD0600;
import medrex.client.mds3.ui.subSections.sectionD.PanelD0650;
import medrex.client.mds3.ui.subSections.sectionD.PanelDHeader;
import medrex.client.mds3.ui.subSections.sectionE.PanelE0100;
import medrex.client.mds3.ui.subSections.sectionE.PanelE0200;
import medrex.client.mds3.ui.subSections.sectionE.PanelE0800;
import medrex.client.mds3.ui.subSections.sectionE.PanelE0900;
import medrex.client.mds3.ui.subSections.sectionE.PanelEHeader;
import medrex.client.mds3.ui.subSections.sectionG.PanelG0110;
import medrex.client.mds3.ui.subSections.sectionG.PanelG0110A;
import medrex.client.mds3.ui.subSections.sectionG.PanelG0110B;
import medrex.client.mds3.ui.subSections.sectionG.PanelG0120A;
import medrex.client.mds3.ui.subSections.sectionG.PanelG0120B;
import medrex.client.mds3.ui.subSections.sectionG.PanelG0300;
import medrex.client.mds3.ui.subSections.sectionG.PanelG0400;
import medrex.client.mds3.ui.subSections.sectionG.PanelG0600;
import medrex.client.mds3.ui.subSections.sectionG.PanelGHeader;
import medrex.client.mds3.ui.subSections.sectionH.PanelH0100;
import medrex.client.mds3.ui.subSections.sectionH.PanelH0200;
import medrex.client.mds3.ui.subSections.sectionH.PanelH0300;
import medrex.client.mds3.ui.subSections.sectionH.PanelH0400;
import medrex.client.mds3.ui.subSections.sectionH.PanelH0500;
import medrex.client.mds3.ui.subSections.sectionH.PanelHHeader;
import medrex.client.mds3.ui.subSections.sectionI.PanelActiveDignosis;
import medrex.client.mds3.ui.subSections.sectionI.PanelGenitourinary;
import medrex.client.mds3.ui.subSections.sectionI.PanelHeartCirculation;
import medrex.client.mds3.ui.subSections.sectionI.PanelI0200;
import medrex.client.mds3.ui.subSections.sectionI.PanelI0600;
import medrex.client.mds3.ui.subSections.sectionI.PanelI0700;
import medrex.client.mds3.ui.subSections.sectionI.PanelI0800;
import medrex.client.mds3.ui.subSections.sectionI.PanelI1550;
import medrex.client.mds3.ui.subSections.sectionI.PanelI1650;
import medrex.client.mds3.ui.subSections.sectionI.PanelI1700;
import medrex.client.mds3.ui.subSections.sectionI.PanelI2000;
import medrex.client.mds3.ui.subSections.sectionI.PanelI2100;
import medrex.client.mds3.ui.subSections.sectionI.PanelI2200;
import medrex.client.mds3.ui.subSections.sectionI.PanelI2300;
import medrex.client.mds3.ui.subSections.sectionI.PanelI2400;
import medrex.client.mds3.ui.subSections.sectionI.PanelI2500;
import medrex.client.mds3.ui.subSections.sectionI.PanelI2900;
import medrex.client.mds3.ui.subSections.sectionI.PanelI3100;
import medrex.client.mds3.ui.subSections.sectionI.PanelI3200;
import medrex.client.mds3.ui.subSections.sectionI.PanelI3300;
import medrex.client.mds3.ui.subSections.sectionI.PanelI3900;
import medrex.client.mds3.ui.subSections.sectionI.PanelI4000;
import medrex.client.mds3.ui.subSections.sectionI.PanelI4200;
import medrex.client.mds3.ui.subSections.sectionI.PanelI4300;
import medrex.client.mds3.ui.subSections.sectionI.PanelI4400;
import medrex.client.mds3.ui.subSections.sectionI.PanelI4500;
import medrex.client.mds3.ui.subSections.sectionI.PanelI4800;
import medrex.client.mds3.ui.subSections.sectionI.PanelI4900;
import medrex.client.mds3.ui.subSections.sectionI.PanelI5000;
import medrex.client.mds3.ui.subSections.sectionI.PanelI5100;
import medrex.client.mds3.ui.subSections.sectionI.PanelI5200;
import medrex.client.mds3.ui.subSections.sectionI.PanelI5250;
import medrex.client.mds3.ui.subSections.sectionI.PanelI5300;
import medrex.client.mds3.ui.subSections.sectionI.PanelI5400;
import medrex.client.mds3.ui.subSections.sectionI.PanelI5500;
import medrex.client.mds3.ui.subSections.sectionI.PanelI5600;
import medrex.client.mds3.ui.subSections.sectionI.PanelI5700;
import medrex.client.mds3.ui.subSections.sectionI.PanelI5800;
import medrex.client.mds3.ui.subSections.sectionI.PanelI5900;
import medrex.client.mds3.ui.subSections.sectionI.PanelI5950;
import medrex.client.mds3.ui.subSections.sectionI.PanelI6000;
import medrex.client.mds3.ui.subSections.sectionI.PanelI6100;
import medrex.client.mds3.ui.subSections.sectionI.PanelI6200;
import medrex.client.mds3.ui.subSections.sectionI.PanelI6300;
import medrex.client.mds3.ui.subSections.sectionI.PanelI8000;
import medrex.client.mds3.ui.subSections.sectionI.PanelIHeader;
import medrex.client.mds3.ui.subSections.sectionI.PanelInfections;
import medrex.client.mds3.ui.subSections.sectionI.PanelMetabolic;
import medrex.client.mds3.ui.subSections.sectionI.PanelMusculoskeletal;
import medrex.client.mds3.ui.subSections.sectionI.PanelNeurological;
import medrex.client.mds3.ui.subSections.sectionI.PanelNutritional;
import medrex.client.mds3.ui.subSections.sectionI.PanelOther;
import medrex.client.mds3.ui.subSections.sectionI.PanelPsychiatricMoodDisorder;
import medrex.client.mds3.ui.subSections.sectionI.PanelPulmonary;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ0100;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ0200;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ0300;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ0400;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ0500;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ0600;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ0700;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ0800;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ0850;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ1100;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ1400;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ1550;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ1700;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ1800;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ1900;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJHeader;
import medrex.client.mds3.ui.subSections.sectionK.PanelK0100;
import medrex.client.mds3.ui.subSections.sectionK.PanelK0200;
import medrex.client.mds3.ui.subSections.sectionK.PanelK0300;
import medrex.client.mds3.ui.subSections.sectionK.PanelK0500;
import medrex.client.mds3.ui.subSections.sectionK.PanelK0700;
import medrex.client.mds3.ui.subSections.sectionK.PanelKHeader;
import medrex.client.mds3.ui.subSections.sectionL.PanelL0200;
import medrex.client.mds3.ui.subSections.sectionL.PanelLHeader;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0100;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0150;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0210;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300A;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300B;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300C;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300Continued;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300ContinuedToNextPage;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300D;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300E;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300F;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300G;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0610;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0610A;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0610B;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0610C;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0700;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0800;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0800A;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0800B;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0800C;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0900;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0900A;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0900B;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0900C;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0900D;
import medrex.client.mds3.ui.subSections.sectionM.PanelM1030;
import medrex.client.mds3.ui.subSections.sectionM.PanelM1040;
import medrex.client.mds3.ui.subSections.sectionM.PanelM1200;
import medrex.client.mds3.ui.subSections.sectionM.PanelMHeader;
import medrex.client.mds3.ui.subSections.sectionN.PanelN0300;
import medrex.client.mds3.ui.subSections.sectionN.PanelNHeader;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0100;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0250;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0300;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0400A;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0400B;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0400C;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0400D;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0400E;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0500;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0600;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0700;
import medrex.client.mds3.ui.subSections.sectionO.PanelOHeader;
import medrex.client.mds3.ui.subSections.sectionP.PanelP100;
import medrex.client.mds3.ui.subSections.sectionP.PanelPHeader;
import medrex.client.mds3.ui.subSections.sectionQ.PanelQ0100;
import medrex.client.mds3.ui.subSections.sectionQ.PanelQ0300;
import medrex.client.mds3.ui.subSections.sectionQ.PanelQ0400;
import medrex.client.mds3.ui.subSections.sectionQ.PanelQ0500;
import medrex.client.mds3.ui.subSections.sectionQ.PanelQ0600;
import medrex.client.mds3.ui.subSections.sectionQ.PanelQHeader;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0100;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0150;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0200;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0300;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0400;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0500;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0600;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0600A;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0600B;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0600C;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0700;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0800;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0900;
import medrex.client.mds3.ui.subSections.sectionX.PanelX1050;
import medrex.client.mds3.ui.subSections.sectionX.PanelX1100;
import medrex.client.mds3.ui.subSections.sectionX.PanelXHeader;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0100;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0150;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0200;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0250;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0300;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0400;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0500;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZHeader;

public class Mds3ItemSetNQ {

	public static Mds3ItemSet getNQItemSet() {
		// create empty nq item set
		Mds3ItemSet nq1ItemSet = new Mds3ItemSet();
		nq1ItemSet.getPages().put("1", getNQPage1());
		nq1ItemSet.getPages().put("2", getNQPage2());
		nq1ItemSet.getPages().put("3", getNQPage3());
		nq1ItemSet.getPages().put("4", getNQPage4());
		nq1ItemSet.getPages().put("5", getNQPage5());
		nq1ItemSet.getPages().put("6", getNQPage6());
		nq1ItemSet.getPages().put("7", getNQPage7());
		nq1ItemSet.getPages().put("8", getNQPage8());
		nq1ItemSet.getPages().put("9", getNQPage9());
		nq1ItemSet.getPages().put("10", getNQPage10());
		nq1ItemSet.getPages().put("11", getNQPage11());
		nq1ItemSet.getPages().put("12", getNQPage12());
		nq1ItemSet.getPages().put("13", getNQPage13());
		nq1ItemSet.getPages().put("14", getNQPage14());
		nq1ItemSet.getPages().put("15", getNQPage15());
		nq1ItemSet.getPages().put("16", getNQPage16());
		nq1ItemSet.getPages().put("17", getNQPage17());
		nq1ItemSet.getPages().put("18", getNQPage18());
		nq1ItemSet.getPages().put("19", getNQPage19());
		nq1ItemSet.getPages().put("20", getNQPage20());
		nq1ItemSet.getPages().put("21", getNQPage21());
		nq1ItemSet.getPages().put("22", getNQPage22());
		nq1ItemSet.getPages().put("23", getNQPage23());
		nq1ItemSet.getPages().put("24", getNQPage24());
		nq1ItemSet.getPages().put("25", getNQPage25());
		nq1ItemSet.getPages().put("26", getNQPage26());
		nq1ItemSet.getPages().put("27", getNQPage27());
		nq1ItemSet.getPages().put("28", getNQPage28());
		nq1ItemSet.getPages().put("29", getNQPage29());
		nq1ItemSet.getPages().put("30", getNQPage30());
		nq1ItemSet.getPages().put("31", getNQPage31());
		nq1ItemSet.getPages().put("32", getNQPage32());
		nq1ItemSet.getPages().put("33", getNQPage33());

		return nq1ItemSet;
	}

	private static Mds3Page getNQPage1() {
		// Createing page1.......
		Mds3Page nqPage1 = new Mds3Page();
		nqPage1.getSubSections().add(new Mds3Header());
		nqPage1.getSubSections().add(new PanelNQheader());
		nqPage1.getSubSections().add(new PanelAHeader());
		nqPage1.getSubSections().add(new PanelA0100());
		nqPage1.getSubSections().add(new PanelA0200());
		nqPage1.getSubSections().add(new PanelA0310A());
		nqPage1.getSubSections().add(new PanelA0310B());
		nqPage1.getSubSections().add(new PanelA0310C());
		nqPage1.getSubSections().add(new PanelA0310D());
		nqPage1.getSubSections().add(new PanelA0310E());
		nqPage1.getSubSections().add(new PanelA0310F());
		nqPage1.getSubSections().add(new Mds3Footer());
		return (nqPage1);

	}

	private static Mds3Page getNQPage2() {
		// creating page 2
		Mds3Page nqPage2 = new Mds3Page();
		nqPage2.getSubSections().add(new Mds3Header());
		nqPage2.getSubSections().add(new PanelAHeader());
		nqPage2.getSubSections().add(new PanelA0410());
		nqPage2.getSubSections().add(new PanelA0500());
		nqPage2.getSubSections().add(new PanelA0600());
		nqPage2.getSubSections().add(new PanelA0700());
		nqPage2.getSubSections().add(new PanelA0800());
		nqPage2.getSubSections().add(new PanelA0900());
		nqPage2.getSubSections().add(new PanelA1000());
		nqPage2.getSubSections().add(new PanelA1100());
		nqPage2.getSubSections().add(new Mds3Footer());
		return nqPage2;
	}

	private static Mds3Page getNQPage3() {

		// creating page 3
		Mds3Page nqPage3 = new Mds3Page();
		nqPage3.getSubSections().add(new Mds3Header());
		nqPage3.getSubSections().add(new PanelAHeader());
		nqPage3.getSubSections().add(new PanelA1200());
		nqPage3.getSubSections().add(new PanelA1300());
		nqPage3.getSubSections().add(new PanelA1500());
		nqPage3.getSubSections().add(new PanelA1550());
		nqPage3.getSubSections().add(new PanelA1600());
		nqPage3.getSubSections().add(new PanelA1700());
		nqPage3.getSubSections().add(new Mds3Footer());

		return nqPage3;
	}

	private static Mds3Page getNQPage4() {
		// creating page 4
		Mds3Page nqPage4 = new Mds3Page();
		nqPage4.getSubSections().add(new Mds3Header());
		nqPage4.getSubSections().add(new PanelAHeader());
		nqPage4.getSubSections().add(new PanelA1800());
		nqPage4.getSubSections().add(new PanelA2000());
		nqPage4.getSubSections().add(new PanelA2100());
		nqPage4.getSubSections().add(new PanelA2200());
		nqPage4.getSubSections().add(new PanelA2300());
		nqPage4.getSubSections().add(new PanelA2400());
		nqPage4.getSubSections().add(new Mds3Footer());
		return nqPage4;
	}

	private static Mds3Page getNQPage5() {
		// creating page 5
		Mds3Page nqPage5 = new Mds3Page();
		nqPage5.getSubSections().add(new Mds3Header());
		nqPage5.getSubSections().add(new PanelSubHeader());
		nqPage5.getSubSections().add(new PanelBHeader());
		nqPage5.getSubSections().add(new PanelB0100());
		nqPage5.getSubSections().add(new PanelB0200());
		nqPage5.getSubSections().add(new PanelB0300());
		nqPage5.getSubSections().add(new PanelB0600());
		nqPage5.getSubSections().add(new PanelB0700());
		nqPage5.getSubSections().add(new PanelB0800());
		nqPage5.getSubSections().add(new PanelB1000());
		nqPage5.getSubSections().add(new PanelB1200());
		nqPage5.getSubSections().add(new Mds3Footer());
		return nqPage5;
	}

	private static Mds3Page getNQPage6() {
		// creating page 6
		Mds3Page nqPage6 = new Mds3Page();
		nqPage6.getSubSections().add(new Mds3Header());
		nqPage6.getSubSections().add(new PanelCHeader());
		nqPage6.getSubSections().add(new PanelC0100());
		nqPage6.getSubSections().add(new PanelC0200());
		nqPage6.getSubSections().add(new PanelC0300());
		nqPage6.getSubSections().add(new PanelC0300A());
		nqPage6.getSubSections().add(new PanelC0300B());
		nqPage6.getSubSections().add(new PanelC0300C());
		nqPage6.getSubSections().add(new PanelC0400());
		nqPage6.getSubSections().add(new PanelC0400A());
		nqPage6.getSubSections().add(new PanelC0400B());
		nqPage6.getSubSections().add(new PanelC0400C());
		nqPage6.getSubSections().add(new PanelC0500());
		nqPage6.getSubSections().add(new Mds3Footer());
		return nqPage6;

	}

	private static Mds3Page getNQPage7() {
		// creating page 7
		Mds3Page nqPage7 = new Mds3Page();
		nqPage7.getSubSections().add(new Mds3Header());
		nqPage7.getSubSections().add(new PanelCHeader());
		nqPage7.getSubSections().add(new PanelC0600());
		nqPage7.getSubSections().add(new PanelC0700());
		nqPage7.getSubSections().add(new PanelC0800());
		nqPage7.getSubSections().add(new PanelC0900());
		nqPage7.getSubSections().add(new PanelC1000());
		nqPage7.getSubSections().add(new PanelC1300());
		nqPage7.getSubSections().add(new PanelC1600());
		nqPage7.getSubSections().add(new Mds3Footer());
		return nqPage7;

	}

	private static Mds3Page getNQPage8() {
		// creating page 8
		Mds3Page nqPage8 = new Mds3Page();
		nqPage8.getSubSections().add(new Mds3Header());
		nqPage8.getSubSections().add(new PanelDHeader());
		nqPage8.getSubSections().add(new PanelD0100());
		nqPage8.getSubSections().add(new PanelD0200());
		nqPage8.getSubSections().add(new PanelD0300());
		nqPage8.getSubSections().add(new PanelD0350());
		return nqPage8;

	}

	private static Mds3Page getNQPage9() {
		// creating page 9
		Mds3Page nqPage9 = new Mds3Page();
		nqPage9.getSubSections().add(new Mds3Header());
		nqPage9.getSubSections().add(new PanelDHeader());
		nqPage9.getSubSections().add(new PanelD0500());
		nqPage9.getSubSections().add(new PanelD0600());
		nqPage9.getSubSections().add(new PanelD0650());
		nqPage9.getSubSections().add(new Mds3Footer());
		return nqPage9;
	}

	private static Mds3Page getNQPage10() {
		// creating page 10
		Mds3Page nqPage10 = new Mds3Page();
		nqPage10.getSubSections().add(new Mds3Header());
		nqPage10.getSubSections().add(new PanelEHeader());
		nqPage10.getSubSections().add(new PanelE0100());
		nqPage10.getSubSections().add(new PanelE0200());
		nqPage10.getSubSections().add(new PanelE0800());
		nqPage10.getSubSections().add(new PanelE0900());
		nqPage10.getSubSections().add(new Mds3Footer());
		return nqPage10;
	}

	private static Mds3Page getNQPage11() {
		// creating page 11
		Mds3Page nqPage11 = new Mds3Page();
		nqPage11.getSubSections().add(new Mds3Header());
		nqPage11.getSubSections().add(new PanelGHeader());
		nqPage11.getSubSections().add(new PanelG0110());
		nqPage11.getSubSections().add(new PanelG0110A());
		nqPage11.getSubSections().add(new PanelG0110B());
		nqPage11.getSubSections().add(new Mds3Footer());
		return nqPage11;

	}

	private static Mds3Page getNQPage12() {
		// creating page 12
		Mds3Page nqPage12 = new Mds3Page();
		nqPage12.getSubSections().add(new Mds3Header());
		nqPage12.getSubSections().add(new PanelGHeader());
		nqPage12.getSubSections().add(new PanelG0120A());
		nqPage12.getSubSections().add(new PanelG0120B());
		nqPage12.getSubSections().add(new PanelG0300());
		nqPage12.getSubSections().add(new PanelG0400());
		nqPage12.getSubSections().add(new PanelG0600());
		nqPage12.getSubSections().add(new Mds3Footer());
		return nqPage12;

	}

	private static Mds3Page getNQPage13() {
		// creating page 13
		Mds3Page nqPage13 = new Mds3Page();
		nqPage13.getSubSections().add(new Mds3Header());
		nqPage13.getSubSections().add(new PanelHHeader());
		nqPage13.getSubSections().add(new PanelH0100());
		nqPage13.getSubSections().add(new PanelH0200());
		nqPage13.getSubSections().add(new PanelH0300());
		nqPage13.getSubSections().add(new PanelH0400());
		nqPage13.getSubSections().add(new PanelH0500());
		nqPage13.getSubSections().add(new Mds3Footer());
		return nqPage13;

	}

	private static Mds3Page getNQPage14() {
		// creating page 14
		Mds3Page nqPage14 = new Mds3Page();
		nqPage14.getSubSections().add(new Mds3Header());
		nqPage14.getSubSections().add(new PanelIHeader());
		nqPage14.getSubSections().add(new PanelActiveDignosis());
		nqPage14.getSubSections().add(new PanelHeartCirculation());
		nqPage14.getSubSections().add(new PanelI0200());
		nqPage14.getSubSections().add(new PanelI0600());
		nqPage14.getSubSections().add(new PanelI0700());
		nqPage14.getSubSections().add(new PanelI0800());
		nqPage14.getSubSections().add(new PanelGenitourinary());
		nqPage14.getSubSections().add(new PanelI1550());
		nqPage14.getSubSections().add(new PanelI1650());
		nqPage14.getSubSections().add(new PanelInfections());
		nqPage14.getSubSections().add(new PanelI1700());
		nqPage14.getSubSections().add(new PanelI2000());
		nqPage14.getSubSections().add(new PanelI2100());
		nqPage14.getSubSections().add(new PanelI2200());
		nqPage14.getSubSections().add(new PanelI2300());
		nqPage14.getSubSections().add(new PanelI2400());
		nqPage14.getSubSections().add(new PanelI2500());
		nqPage14.getSubSections().add(new PanelMetabolic());
		nqPage14.getSubSections().add(new PanelI2900());
		nqPage14.getSubSections().add(new PanelI3100());
		nqPage14.getSubSections().add(new PanelI3200());
		nqPage14.getSubSections().add(new PanelI3300());
		nqPage14.getSubSections().add(new PanelMusculoskeletal());
		nqPage14.getSubSections().add(new PanelI3900());
		nqPage14.getSubSections().add(new PanelI4000());
		nqPage14.getSubSections().add(new PanelNeurological());
		nqPage14.getSubSections().add(new PanelI4200());
		nqPage14.getSubSections().add(new PanelI4300());
		nqPage14.getSubSections().add(new PanelI4400());
		nqPage14.getSubSections().add(new PanelI4500());
		nqPage14.getSubSections().add(new PanelI4800());
		nqPage14.getSubSections().add(new PanelI4900());
		nqPage14.getSubSections().add(new PanelI5000());
		nqPage14.getSubSections().add(new PanelI5100());
		nqPage14.getSubSections().add(new PanelI5200());
		nqPage14.getSubSections().add(new PanelI5250());
		nqPage14.getSubSections().add(new PanelI5300());
		nqPage14.getSubSections().add(new PanelI5400());
		nqPage14.getSubSections().add(new PanelI5500());
		nqPage14.getSubSections().add(new PanelNutritional());
		nqPage14.getSubSections().add(new PanelI5600());
		nqPage14.getSubSections().add(new Mds3Footer());
		return nqPage14;
	}

	private static Mds3Page getNQPage15() {
		// creating page 15
		Mds3Page nqPage15 = new Mds3Page();
		nqPage15.getSubSections().add(new Mds3Header());
		nqPage15.getSubSections().add(new PanelIHeader());
		nqPage15.getSubSections().add(new PanelActiveDignosis());
		nqPage15.getSubSections().add(new PanelPsychiatricMoodDisorder());
		nqPage15.getSubSections().add(new PanelI5700());
		nqPage15.getSubSections().add(new PanelI5800());
		nqPage15.getSubSections().add(new PanelI5900());
		nqPage15.getSubSections().add(new PanelI5950());
		nqPage15.getSubSections().add(new PanelI6000());
		nqPage15.getSubSections().add(new PanelI6100());
		nqPage15.getSubSections().add(new PanelPulmonary());
		nqPage15.getSubSections().add(new PanelI6200());
		nqPage15.getSubSections().add(new PanelI6300());
		nqPage15.getSubSections().add(new PanelOther());
		nqPage15.getSubSections().add(new PanelI8000());
		nqPage15.getSubSections().add(new Mds3Footer());
		return nqPage15;
	}

	private static Mds3Page getNQPage16() {
		// creating page 16
		Mds3Page nqPage16 = new Mds3Page();
		nqPage16.getSubSections().add(new Mds3Header());
		nqPage16.getSubSections().add(new PanelJHeader());
		nqPage16.getSubSections().add(new PanelJ0100());
		nqPage16.getSubSections().add(new PanelJ0200());
		nqPage16.getSubSections().add(new PanelJ0300());
		nqPage16.getSubSections().add(new PanelJ0400());
		nqPage16.getSubSections().add(new PanelJ0500());
		nqPage16.getSubSections().add(new PanelJ0600());
		nqPage16.getSubSections().add(new Mds3Footer());
		return nqPage16;
	}

	private static Mds3Page getNQPage17() {
		// creating page 17
		Mds3Page nqPage17 = new Mds3Page();
		nqPage17.getSubSections().add(new Mds3Header());
		nqPage17.getSubSections().add(new PanelJHeader());
		nqPage17.getSubSections().add(new PanelJ0700());
		nqPage17.getSubSections().add(new PanelJ0800());
		nqPage17.getSubSections().add(new PanelJ0850());
		nqPage17.getSubSections().add(new PanelJ1100());
		nqPage17.getSubSections().add(new PanelJ1400());
		nqPage17.getSubSections().add(new PanelJ1550());
		nqPage17.getSubSections().add(new Mds3Footer());
		return nqPage17;
	}

	private static Mds3Page getNQPage18() {
		// creating page 18
		Mds3Page nqPage18 = new Mds3Page();
		nqPage18.getSubSections().add(new Mds3Header());
		nqPage18.getSubSections().add(new PanelJHeader());
		nqPage18.getSubSections().add(new PanelJ1700());
		nqPage18.getSubSections().add(new PanelJ1800());
		nqPage18.getSubSections().add(new PanelJ1900());
		nqPage18.getSubSections().add(new Mds3Footer());
		return nqPage18;
	}

	private static Mds3Page getNQPage19() {
		// creating page 19
		Mds3Page nqPage19 = new Mds3Page();
		nqPage19.getSubSections().add(new Mds3Header());
		nqPage19.getSubSections().add(new PanelKHeader());
		nqPage19.getSubSections().add(new PanelK0100());
		nqPage19.getSubSections().add(new PanelK0200());
		nqPage19.getSubSections().add(new PanelK0300());
		nqPage19.getSubSections().add(new PanelK0500());
		nqPage19.getSubSections().add(new PanelK0700());
		nqPage19.getSubSections().add(new PanelLHeader());
		nqPage19.getSubSections().add(new PanelL0200());
		nqPage19.getSubSections().add(new Mds3Footer());
		return nqPage19;
	}

	private static Mds3Page getNQPage20() {
		// creating page 20
		Mds3Page nqPage20 = new Mds3Page();
		nqPage20.getSubSections().add(new Mds3Header());
		nqPage20.getSubSections().add(new PanelMHeader());
		nqPage20.getSubSections().add(new PanelSubHeader());
		nqPage20.getSubSections().add(new PanelM0100());
		nqPage20.getSubSections().add(new PanelM0150());
		nqPage20.getSubSections().add(new PanelM0210());
		nqPage20.getSubSections().add(new PanelM0300());
		nqPage20.getSubSections().add(new PanelM0300A());
		nqPage20.getSubSections().add(new PanelM0300B());
		nqPage20.getSubSections().add(new PanelM0300C());
		nqPage20.getSubSections().add(new PanelM0300D());
		nqPage20.getSubSections().add(new PanelM0300Continued());
		nqPage20.getSubSections().add(new Mds3Footer());
		return nqPage20;
	}

	private static Mds3Page getNQPage21() {
		// creating page 21
		Mds3Page nqPage21 = new Mds3Page();
		nqPage21.getSubSections().add(new Mds3Header());
		nqPage21.getSubSections().add(new PanelMHeader());
		nqPage21.getSubSections().add(new PanelM0300ContinuedToNextPage());
		nqPage21.getSubSections().add(new PanelM0300E());
		nqPage21.getSubSections().add(new PanelM0300F());
		nqPage21.getSubSections().add(new PanelM0300G());
		nqPage21.getSubSections().add(new PanelM0610());
		nqPage21.getSubSections().add(new PanelM0610A());
		nqPage21.getSubSections().add(new PanelM0610B());
		nqPage21.getSubSections().add(new PanelM0610C());
		nqPage21.getSubSections().add(new PanelM0700());
		nqPage21.getSubSections().add(new PanelM0800());
		nqPage21.getSubSections().add(new PanelM0800A());
		nqPage21.getSubSections().add(new PanelM0800B());
		nqPage21.getSubSections().add(new PanelM0800C());
		nqPage21.getSubSections().add(new Mds3Footer());
		return nqPage21;
	}

	private static Mds3Page getNQPage22() {
		// creating page 22
		Mds3Page nqPage22 = new Mds3Page();
		nqPage22.getSubSections().add(new Mds3Header());
		nqPage22.getSubSections().add(new PanelMHeader());
		nqPage22.getSubSections().add(new PanelM0900());
		nqPage22.getSubSections().add(new PanelM0900A());
		nqPage22.getSubSections().add(new PanelM0900B());
		nqPage22.getSubSections().add(new PanelM0900C());
		nqPage22.getSubSections().add(new PanelM0900D());
		nqPage22.getSubSections().add(new PanelM1030());
		nqPage22.getSubSections().add(new PanelM1040());
		nqPage22.getSubSections().add(new PanelM1200());
		nqPage22.getSubSections().add(new Mds3Footer());
		return nqPage22;
	}

	private static Mds3Page getNQPage23() {
		// creating page 23
		Mds3Page nqPage23 = new Mds3Page();
		nqPage23.getSubSections().add(new Mds3Header());
		nqPage23.getSubSections().add(new PanelNHeader());
		nqPage23.getSubSections().add(new PanelN0300());
		nqPage23.getSubSections().add(new PanelM0900A());
		nqPage23.getSubSections().add(new Mds3Footer());
		return nqPage23;
	}

	private static Mds3Page getNQPage24() {
		// creating page 24
		Mds3Page nqPage24 = new Mds3Page();
		nqPage24.getSubSections().add(new Mds3Header());
		nqPage24.getSubSections().add(new PanelOHeader());
		nqPage24.getSubSections().add(new PanelO0100());
		nqPage24.getSubSections().add(new PanelO0250());
		nqPage24.getSubSections().add(new PanelO0300());
		nqPage24.getSubSections().add(new Mds3Footer());
		return nqPage24;
	}

	private static Mds3Page getNQPage25() {
		// creating page 25
		Mds3Page nqPage25 = new Mds3Page();
		nqPage25.getSubSections().add(new Mds3Header());
		nqPage25.getSubSections().add(new PanelOHeader());
		nqPage25.getSubSections().add(new PanelO0400A());
		nqPage25.getSubSections().add(new PanelO0400B());
		nqPage25.getSubSections().add(new PanelO0400C());
		nqPage25.getSubSections().add(new Mds3Footer());
		return nqPage25;
	}

	private static Mds3Page getNQPage26() {
		// creating page 26
		Mds3Page nqPage26 = new Mds3Page();
		nqPage26.getSubSections().add(new Mds3Header());
		nqPage26.getSubSections().add(new PanelOHeader());
		nqPage26.getSubSections().add(new PanelO0400D());
		nqPage26.getSubSections().add(new PanelO0400E());
		nqPage26.getSubSections().add(new PanelO0500());
		nqPage26.getSubSections().add(new PanelO0600());
		nqPage26.getSubSections().add(new PanelO0700());
		nqPage26.getSubSections().add(new Mds3Footer());
		return nqPage26;
	}

	private static Mds3Page getNQPage27() {
		// creating page 27
		Mds3Page nqPage27 = new Mds3Page();
		nqPage27.getSubSections().add(new Mds3Header());
		nqPage27.getSubSections().add(new PanelPHeader());
		nqPage27.getSubSections().add(new PanelP100());
		nqPage27.getSubSections().add(new Mds3Footer());
		return nqPage27;
	}

	private static Mds3Page getNQPage28() {
		// creating page 28
		Mds3Page nqPage28 = new Mds3Page();
		nqPage28.getSubSections().add(new Mds3Header());
		nqPage28.getSubSections().add(new PanelQHeader());
		nqPage28.getSubSections().add(new PanelQ0100());
		nqPage28.getSubSections().add(new PanelQ0300());
		nqPage28.getSubSections().add(new PanelQ0400());
		nqPage28.getSubSections().add(new PanelQ0500());
		nqPage28.getSubSections().add(new PanelQ0600());
		nqPage28.getSubSections().add(new Mds3Footer());
		return nqPage28;
	}

	private static Mds3Page getNQPage29() {
		// creating page 29
		Mds3Page nqPage29 = new Mds3Page();
		nqPage29.getSubSections().add(new Mds3Header());
		nqPage29.getSubSections().add(new PanelXHeader());
		nqPage29.getSubSections().add(new PanelX0100());
		nqPage29.getSubSections().add(new PanelX0150());
		nqPage29.getSubSections().add(new PanelX0200());
		nqPage29.getSubSections().add(new PanelX0300());
		nqPage29.getSubSections().add(new PanelX0400());
		nqPage29.getSubSections().add(new PanelX0500());
		nqPage29.getSubSections().add(new PanelX0600());
		nqPage29.getSubSections().add(new PanelX0600A());
		nqPage29.getSubSections().add(new PanelX0600B());
		nqPage29.getSubSections().add(new PanelX0600C());
		nqPage29.getSubSections().add(new Mds3Footer());
		return nqPage29;
	}

	private static Mds3Page getNQPage30() {
		// creating page 30
		Mds3Page nqPage30 = new Mds3Page();
		nqPage30.getSubSections().add(new Mds3Header());
		nqPage30.getSubSections().add(new PanelXHeader());
		nqPage30.getSubSections().add(new PanelX0600());
		nqPage30.getSubSections().add(new PanelX0700());
		nqPage30.getSubSections().add(new PanelX0800());
		nqPage30.getSubSections().add(new PanelX0900());
		nqPage30.getSubSections().add(new PanelX1050());
		nqPage30.getSubSections().add(new Mds3Footer());
		return nqPage30;
	}

	private static Mds3Page getNQPage31() {
		// creating page 31
		Mds3Page nqPage31 = new Mds3Page();
		nqPage31.getSubSections().add(new Mds3Header());
		nqPage31.getSubSections().add(new PanelXHeader());
		nqPage31.getSubSections().add(new PanelX1100());
		nqPage31.getSubSections().add(new Mds3Footer());
		return nqPage31;
	}

	private static Mds3Page getNQPage32() {

		Mds3Page nqPage32 = new Mds3Page();
		nqPage32.getSubSections().add(new Mds3Header());
		nqPage32.getSubSections().add(new PanelZHeader());
		nqPage32.getSubSections().add(new PanelZ0100());
		nqPage32.getSubSections().add(new PanelZ0150());
		nqPage32.getSubSections().add(new PanelZ0200());
		nqPage32.getSubSections().add(new PanelZ0250());
		nqPage32.getSubSections().add(new PanelZ0300());
		nqPage32.getSubSections().add(new Mds3Footer());
		return nqPage32;
	}

	private static Mds3Page getNQPage33() {

		Mds3Page nqPage33 = new Mds3Page();
		nqPage33.getSubSections().add(new Mds3Header());
		nqPage33.getSubSections().add(new PanelZHeader());
		nqPage33.getSubSections().add(new PanelZ0400());
		nqPage33.getSubSections().add(new PanelZ0500());
		nqPage33.getSubSections().add(new Mds3Footer());
		return nqPage33;
	}

}
