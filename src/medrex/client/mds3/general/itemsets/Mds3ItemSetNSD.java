package medrex.client.mds3.general.itemsets;

import medrex.client.mds3.general.Mds3ItemSet;
import medrex.client.mds3.general.Mds3Page;
import medrex.client.mds3.ui.commons.Mds3Footer;
import medrex.client.mds3.ui.commons.Mds3Header;
import medrex.client.mds3.ui.itemSpecific.PanelNSDheader;
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
import medrex.client.mds3.ui.subSections.sectionA.PanelA2300;
import medrex.client.mds3.ui.subSections.sectionA.PanelA2400;
import medrex.client.mds3.ui.subSections.sectionA.PanelAHeader;
import medrex.client.mds3.ui.subSections.sectionA.PanelHeader;
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
import medrex.client.mds3.ui.subSections.sectionI.PanelI2500;
import medrex.client.mds3.ui.subSections.sectionI.PanelI2900;
import medrex.client.mds3.ui.subSections.sectionI.PanelI3100;
import medrex.client.mds3.ui.subSections.sectionI.PanelI3200;
import medrex.client.mds3.ui.subSections.sectionI.PanelI3300;
import medrex.client.mds3.ui.subSections.sectionI.PanelI3900;
import medrex.client.mds3.ui.subSections.sectionI.PanelI4000;
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
import medrex.client.mds3.ui.subSections.sectionK.PanelK0200;
import medrex.client.mds3.ui.subSections.sectionK.PanelK0300;
import medrex.client.mds3.ui.subSections.sectionK.PanelK0500;
import medrex.client.mds3.ui.subSections.sectionK.PanelKHeader;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0100;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0150;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0210;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300A;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300B;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300C;
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
import medrex.client.mds3.ui.subSections.sectionM.PanelM1040FootOtherProblems;
import medrex.client.mds3.ui.subSections.sectionM.PanelM1040FootProblems;
import medrex.client.mds3.ui.subSections.sectionM.PanelM1040NoneOfAbove;
import medrex.client.mds3.ui.subSections.sectionM.PanelM1200;
import medrex.client.mds3.ui.subSections.sectionM.PanelMHeader;
import medrex.client.mds3.ui.subSections.sectionN.PanelN0400;
import medrex.client.mds3.ui.subSections.sectionN.PanelNHeader;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0100;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0250;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0300;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0400A;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0400B;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0400C;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0500;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0600;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0700;
import medrex.client.mds3.ui.subSections.sectionO.PanelOHeader;
import medrex.client.mds3.ui.subSections.sectionP.PanelP100;
import medrex.client.mds3.ui.subSections.sectionP.PanelPHeader;
import medrex.client.mds3.ui.subSections.sectionQ.PanelQ0100;
import medrex.client.mds3.ui.subSections.sectionQ.PanelQ0300;
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
import medrex.client.mds3.ui.subSections.sectionX.PanelX0600Continued;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0600D;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0600F;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0700;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0800;
import medrex.client.mds3.ui.subSections.sectionX.PanelX0900;
import medrex.client.mds3.ui.subSections.sectionX.PanelX1050;
import medrex.client.mds3.ui.subSections.sectionX.PanelX1100;
import medrex.client.mds3.ui.subSections.sectionX.PanelXHeader;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0100;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0150;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0300;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0400;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0500;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZHeader;

public class Mds3ItemSetNSD {

	public static Mds3ItemSet getNSDItemSet() {
		// create empty nc item set
		Mds3ItemSet nsd1ItemSet = new Mds3ItemSet();
		nsd1ItemSet.getPages().put("1", getNSDPage1());
		nsd1ItemSet.getPages().put("2", getNSDPage2());
		nsd1ItemSet.getPages().put("3", getNSDPage3());
		nsd1ItemSet.getPages().put("4", getNSDPage4());
		nsd1ItemSet.getPages().put("5", getNSDPage5());
		nsd1ItemSet.getPages().put("6", getNSDPage6());
		nsd1ItemSet.getPages().put("7", getNSDPage7());
		nsd1ItemSet.getPages().put("8", getNSDPage8());
		nsd1ItemSet.getPages().put("9", getNSDPage9());
		nsd1ItemSet.getPages().put("10", getSDPage10());
		nsd1ItemSet.getPages().put("11", getSDPage11());
		nsd1ItemSet.getPages().put("12", getNSDPage12());
		nsd1ItemSet.getPages().put("13", getNSDPage13());
		nsd1ItemSet.getPages().put("14", getNSDPage14());
		nsd1ItemSet.getPages().put("15", getNSDPage15());
		nsd1ItemSet.getPages().put("16", getNSDPage16());
		nsd1ItemSet.getPages().put("17", getNSDPage17());
		nsd1ItemSet.getPages().put("18", getNSDPage18());
		nsd1ItemSet.getPages().put("19", getNSDPage19());
		nsd1ItemSet.getPages().put("20", getNSDPage20());
		nsd1ItemSet.getPages().put("21", getNSDPage21());
		nsd1ItemSet.getPages().put("22", getNSDPage22());
		nsd1ItemSet.getPages().put("23", getNSDPage23());
		nsd1ItemSet.getPages().put("24", getNSDPage24());
		nsd1ItemSet.getPages().put("25", getNSDPage25());
		nsd1ItemSet.getPages().put("26", getNSDPage26());
		nsd1ItemSet.getPages().put("27", getNSDPage27());
		nsd1ItemSet.getPages().put("28", getNSDPage28());
		nsd1ItemSet.getPages().put("29", getNSDPage29());
		return nsd1ItemSet;

	}

	private static Mds3Page getNSDPage1() {
		// Createing page1.......
		Mds3Page nsdPage1 = new Mds3Page();
		nsdPage1.getSubSections().add(new Mds3Header());
		nsdPage1.getSubSections().add(new PanelNSDheader());
		nsdPage1.getSubSections().add(new PanelAHeader());
		nsdPage1.getSubSections().add(new PanelA0100());
		nsdPage1.getSubSections().add(new PanelA0200());
		// nsdPage1.getSubSections().add(new PanelA0310());
		nsdPage1.getSubSections().add(new PanelA0310A());
		nsdPage1.getSubSections().add(new PanelA0310B());
		nsdPage1.getSubSections().add(new PanelA0310C());
		nsdPage1.getSubSections().add(new PanelA0310D());
		nsdPage1.getSubSections().add(new PanelA0310E());
		nsdPage1.getSubSections().add(new PanelA0310F());
		nsdPage1.getSubSections().add(new Mds3Footer());
		return (nsdPage1);

	}

	private static Mds3Page getNSDPage2() {
		// creating page 2
		Mds3Page nsdPage2 = new Mds3Page();
		nsdPage2.getSubSections().add(new Mds3Header());
		nsdPage2.getSubSections().add(new PanelAHeader());
		nsdPage2.getSubSections().add(new PanelA0410());
		nsdPage2.getSubSections().add(new PanelA0500());
		nsdPage2.getSubSections().add(new PanelA0600());
		nsdPage2.getSubSections().add(new PanelA0700());
		nsdPage2.getSubSections().add(new PanelA0800());
		nsdPage2.getSubSections().add(new PanelA0900());
		nsdPage2.getSubSections().add(new PanelA1000());
		nsdPage2.getSubSections().add(new PanelA1100());
		nsdPage2.getSubSections().add(new Mds3Footer());
		return nsdPage2;
	}

	private static Mds3Page getNSDPage3() {
		// creating page 3
		Mds3Page nsdPage3 = new Mds3Page();
		nsdPage3.getSubSections().add(new Mds3Header());
		nsdPage3.getSubSections().add(new PanelAHeader());
		nsdPage3.getSubSections().add(new PanelA1200());
		nsdPage3.getSubSections().add(new PanelA1300());
		nsdPage3.getSubSections().add(new PanelA1500());
		nsdPage3.getSubSections().add(new PanelA1550());
		nsdPage3.getSubSections().add(new PanelA1600());
		nsdPage3.getSubSections().add(new PanelA1700());
		nsdPage3.getSubSections().add(new Mds3Footer());

		return nsdPage3;
	}

	private static Mds3Page getNSDPage4() {
		// creating page 4
		Mds3Page nsdPage4 = new Mds3Page();
		nsdPage4.getSubSections().add(new Mds3Header());
		nsdPage4.getSubSections().add(new PanelAHeader());
		nsdPage4.getSubSections().add(new PanelA1800());
		nsdPage4.getSubSections().add(new PanelA2000());
		nsdPage4.getSubSections().add(new PanelA2100());
		nsdPage4.getSubSections().add(new PanelA2300());
		nsdPage4.getSubSections().add(new PanelA2400());
		nsdPage4.getSubSections().add(new Mds3Footer());
		return nsdPage4;
	}

	private static Mds3Page getNSDPage5() {
		// creating page 5
		Mds3Page nsdPage5 = new Mds3Page();
		nsdPage5.getSubSections().add(new Mds3Header());
		nsdPage5.getSubSections().add(new PanelSubHeader());
		nsdPage5.getSubSections().add(new PanelBHeader());
		nsdPage5.getSubSections().add(new PanelB0100());
		nsdPage5.getSubSections().add(new PanelB0200());
		nsdPage5.getSubSections().add(new PanelB0300());
		nsdPage5.getSubSections().add(new PanelB0600());
		nsdPage5.getSubSections().add(new PanelB0700());
		nsdPage5.getSubSections().add(new PanelB0800());
		nsdPage5.getSubSections().add(new PanelB1000());
		nsdPage5.getSubSections().add(new PanelB1200());
		nsdPage5.getSubSections().add(new Mds3Footer());

		return nsdPage5;

	}

	private static Mds3Page getNSDPage6() {
		// creating page 6
		Mds3Page nsdPage6 = new Mds3Page();
		nsdPage6.getSubSections().add(new Mds3Header());
		nsdPage6.getSubSections().add(new PanelCHeader());
		nsdPage6.getSubSections().add(new PanelC0100());
		nsdPage6.getSubSections().add(new PanelC0200());
		nsdPage6.getSubSections().add(new PanelC0300());
		nsdPage6.getSubSections().add(new PanelC0300A());
		nsdPage6.getSubSections().add(new PanelC0300B());
		nsdPage6.getSubSections().add(new PanelC0300C());
		nsdPage6.getSubSections().add(new PanelC0400());
		nsdPage6.getSubSections().add(new PanelC0400A());
		nsdPage6.getSubSections().add(new PanelC0400B());
		nsdPage6.getSubSections().add(new PanelC0400C());
		nsdPage6.getSubSections().add(new PanelC0500());
		nsdPage6.getSubSections().add(new Mds3Footer());
		return nsdPage6;

	}

	private static Mds3Page getNSDPage7() {
		// creating page 7
		Mds3Page nsdPage7 = new Mds3Page();
		nsdPage7.getSubSections().add(new Mds3Header());
		nsdPage7.getSubSections().add(new PanelCHeader());
		nsdPage7.getSubSections().add(new PanelC0600());
		nsdPage7.getSubSections().add(new PanelC0700());
		nsdPage7.getSubSections().add(new PanelC0800());
		nsdPage7.getSubSections().add(new PanelC0900());
		nsdPage7.getSubSections().add(new PanelC1000());
		nsdPage7.getSubSections().add(new PanelC1300());
		nsdPage7.getSubSections().add(new PanelC1600());
		nsdPage7.getSubSections().add(new Mds3Footer());
		return nsdPage7;
	}

	private static Mds3Page getNSDPage8() {
		Mds3Page nsdPage8 = new Mds3Page();
		nsdPage8.getSubSections().add(new Mds3Header());
		nsdPage8.getSubSections().add(new PanelDHeader());
		nsdPage8.getSubSections().add(new PanelD0100());
		nsdPage8.getSubSections().add(new PanelD0200());
		nsdPage8.getSubSections().add(new PanelD0300());
		nsdPage8.getSubSections().add(new PanelD0350());
		nsdPage8.getSubSections().add(new Mds3Footer());
		return nsdPage8;

	}

	private static Mds3Page getNSDPage9() {
		Mds3Page nsdPage9 = new Mds3Page();
		nsdPage9.getSubSections().add(new Mds3Header());
		nsdPage9.getSubSections().add(new PanelDHeader());
		nsdPage9.getSubSections().add(new PanelD0500());
		nsdPage9.getSubSections().add(new PanelD0600());
		nsdPage9.getSubSections().add(new PanelD0650());
		nsdPage9.getSubSections().add(new PanelEHeader());
		nsdPage9.getSubSections().add(new PanelE0100());
		nsdPage9.getSubSections().add(new Mds3Footer());
		return nsdPage9;
	}

	private static Mds3Page getSDPage10() {
		Mds3Page nsdPage10 = new Mds3Page();
		nsdPage10.getSubSections().add(new Mds3Header());
		nsdPage10.getSubSections().add(new PanelGHeader());
		nsdPage10.getSubSections().add(new PanelG0110());
		nsdPage10.getSubSections().add(new PanelG0110A());
		nsdPage10.getSubSections().add(new PanelG0110B());
		nsdPage10.getSubSections().add(new Mds3Footer());
		return nsdPage10;
	}

	private static Mds3Page getSDPage11() {
		Mds3Page nsdPage11 = new Mds3Page();
		nsdPage11.getSubSections().add(new Mds3Header());
		nsdPage11.getSubSections().add(new PanelGHeader());
		nsdPage11.getSubSections().add(new PanelG0120A());
		nsdPage11.getSubSections().add(new PanelG0120B());
		nsdPage11.getSubSections().add(new PanelG0300());
		nsdPage11.getSubSections().add(new PanelG0400());
		nsdPage11.getSubSections().add(new PanelG0600());
		nsdPage11.getSubSections().add(new Mds3Footer());
		return nsdPage11;
	}

	private static Mds3Page getNSDPage12() {
		Mds3Page nsdPage12 = new Mds3Page();
		nsdPage12.getSubSections().add(new Mds3Header());
		nsdPage12.getSubSections().add(new PanelHHeader());
		nsdPage12.getSubSections().add(new PanelH0100());
		nsdPage12.getSubSections().add(new PanelH0200());
		nsdPage12.getSubSections().add(new PanelH0300());
		nsdPage12.getSubSections().add(new PanelH0400());
		nsdPage12.getSubSections().add(new PanelH0500());
		nsdPage12.getSubSections().add(new Mds3Footer());
		return nsdPage12;
	}

	private static Mds3Page getNSDPage13() {
		Mds3Page nsdPage13 = new Mds3Page();
		nsdPage13.getSubSections().add(new Mds3Header());
		nsdPage13.getSubSections().add(new PanelIHeader());
		nsdPage13.getSubSections().add(new PanelActiveDignosis());
		nsdPage13.getSubSections().add(new PanelHeartCirculation());
		nsdPage13.getSubSections().add(new PanelI0200());
		nsdPage13.getSubSections().add(new PanelI0600());
		nsdPage13.getSubSections().add(new PanelI0700());
		nsdPage13.getSubSections().add(new PanelI0800());
		nsdPage13.getSubSections().add(new PanelGenitourinary());
		nsdPage13.getSubSections().add(new PanelI1550());
		nsdPage13.getSubSections().add(new PanelI1650());
		nsdPage13.getSubSections().add(new PanelInfections());
		nsdPage13.getSubSections().add(new PanelI1700());
		nsdPage13.getSubSections().add(new PanelI2000());
		nsdPage13.getSubSections().add(new PanelI2100());
		nsdPage13.getSubSections().add(new PanelI2200());
		nsdPage13.getSubSections().add(new PanelI2300());
		nsdPage13.getSubSections().add(new PanelI2500());
		nsdPage13.getSubSections().add(new PanelMetabolic());
		nsdPage13.getSubSections().add(new PanelI2900());
		nsdPage13.getSubSections().add(new PanelI3100());
		nsdPage13.getSubSections().add(new PanelI3200());
		nsdPage13.getSubSections().add(new PanelI3300());
		nsdPage13.getSubSections().add(new PanelMusculoskeletal());
		nsdPage13.getSubSections().add(new PanelI3900());
		nsdPage13.getSubSections().add(new PanelI4000());
		nsdPage13.getSubSections().add(new PanelNeurological());
		nsdPage13.getSubSections().add(new PanelI4500());
		nsdPage13.getSubSections().add(new PanelI4800());
		nsdPage13.getSubSections().add(new PanelI4900());
		nsdPage13.getSubSections().add(new PanelI5000());
		nsdPage13.getSubSections().add(new PanelI5100());
		nsdPage13.getSubSections().add(new PanelI5200());
		nsdPage13.getSubSections().add(new PanelI5250());
		nsdPage13.getSubSections().add(new PanelI5300());
		nsdPage13.getSubSections().add(new PanelI5400());
		nsdPage13.getSubSections().add(new PanelI5500());
		nsdPage13.getSubSections().add(new PanelNutritional());
		nsdPage13.getSubSections().add(new PanelI5600());
		nsdPage13.getSubSections().add(new PanelPsychiatricMoodDisorder());
		nsdPage13.getSubSections().add(new PanelI5700());
		nsdPage13.getSubSections().add(new PanelI5800());
		nsdPage13.getSubSections().add(new PanelI5900());
		nsdPage13.getSubSections().add(new PanelI5950());
		nsdPage13.getSubSections().add(new PanelI6000());
		nsdPage13.getSubSections().add(new PanelPulmonary());
		nsdPage13.getSubSections().add(new PanelI6200());
		nsdPage13.getSubSections().add(new PanelI6300());
		nsdPage13.getSubSections().add(new Mds3Footer());
		return nsdPage13;
	}

	private static Mds3Page getNSDPage14() {
		Mds3Page nsdPage14 = new Mds3Page();
		nsdPage14.getSubSections().add(new Mds3Header());
		nsdPage14.getSubSections().add(new PanelIHeader());
		nsdPage14.getSubSections().add(new PanelActiveDignosis());
		nsdPage14.getSubSections().add(new PanelOther());
		nsdPage14.getSubSections().add(new PanelI8000());
		nsdPage14.getSubSections().add(new Mds3Footer());
		return nsdPage14;
	}

	private static Mds3Page getNSDPage15() {
		Mds3Page nsdPage15 = new Mds3Page();
		nsdPage15.getSubSections().add(new Mds3Header());
		nsdPage15.getSubSections().add(new PanelJHeader());
		nsdPage15.getSubSections().add(new PanelJ0100());
		nsdPage15.getSubSections().add(new PanelJ0200());
		nsdPage15.getSubSections().add(new PanelJ0300());
		nsdPage15.getSubSections().add(new PanelJ0400());
		nsdPage15.getSubSections().add(new PanelJ0500());
		nsdPage15.getSubSections().add(new PanelJ0600());
		nsdPage15.getSubSections().add(new Mds3Footer());
		return nsdPage15;
	}

	private static Mds3Page getNSDPage16() {
		Mds3Page nsdPage16 = new Mds3Page();
		nsdPage16.getSubSections().add(new Mds3Header());
		nsdPage16.getSubSections().add(new PanelJHeader());
		nsdPage16.getSubSections().add(new PanelJ0700());
		nsdPage16.getSubSections().add(new PanelJ0800());
		nsdPage16.getSubSections().add(new PanelJ0850());
		nsdPage16.getSubSections().add(new PanelJ1100());
		nsdPage16.getSubSections().add(new PanelJ1400());
		nsdPage16.getSubSections().add(new PanelJ1550());
		nsdPage16.getSubSections().add(new Mds3Footer());
		return nsdPage16;
	}

	private static Mds3Page getNSDPage17() {
		Mds3Page nsdPage17 = new Mds3Page();
		nsdPage17.getSubSections().add(new PanelJHeader());
		nsdPage17.getSubSections().add(new PanelJ1700());
		nsdPage17.getSubSections().add(new PanelJ1800());
		nsdPage17.getSubSections().add(new PanelJ1900());
		nsdPage17.getSubSections().add(new PanelKHeader());
		nsdPage17.getSubSections().add(new PanelK0200());
		nsdPage17.getSubSections().add(new PanelK0300());
		nsdPage17.getSubSections().add(new PanelK0500());
		nsdPage17.getSubSections().add(new Mds3Footer());
		return nsdPage17;
	}

	private static Mds3Page getNSDPage18() {
		Mds3Page nsdPage18 = new Mds3Page();
		nsdPage18.getSubSections().add(new PanelHeader());
		nsdPage18.getSubSections().add(new PanelSubHeader());
		nsdPage18.getSubSections().add(new PanelM0100());
		nsdPage18.getSubSections().add(new PanelM0150());
		nsdPage18.getSubSections().add(new PanelM0210());
		nsdPage18.getSubSections().add(new PanelM0300());
		nsdPage18.getSubSections().add(new PanelM0300A());
		nsdPage18.getSubSections().add(new PanelM0300B());
		nsdPage18.getSubSections().add(new PanelM0300C());
		nsdPage18.getSubSections().add(new PanelM0300D());
		nsdPage18.getSubSections().add(new Mds3Footer());
		return nsdPage18;
	}

	private static Mds3Page getNSDPage19() {
		Mds3Page nsdPage19 = new Mds3Page();
		nsdPage19.getSubSections().add(new PanelHeader());
		nsdPage19.getSubSections().add(new PanelMHeader());
		nsdPage19.getSubSections().add(new PanelM0300());
		nsdPage19.getSubSections().add(new PanelM0300E());
		nsdPage19.getSubSections().add(new PanelM0300F());
		nsdPage19.getSubSections().add(new PanelM0300G());
		nsdPage19.getSubSections().add(new PanelM0610());
		nsdPage19.getSubSections().add(new PanelM0610A());
		nsdPage19.getSubSections().add(new PanelM0610B());
		nsdPage19.getSubSections().add(new PanelM0610C());
		nsdPage19.getSubSections().add(new PanelM0700());
		nsdPage19.getSubSections().add(new PanelM0800());
		nsdPage19.getSubSections().add(new PanelM0800A());
		nsdPage19.getSubSections().add(new PanelM0800B());
		nsdPage19.getSubSections().add(new PanelM0800C());
		nsdPage19.getSubSections().add(new Mds3Footer());
		return nsdPage19;
	}

	private static Mds3Page getNSDPage20() {
		Mds3Page nsdPage20 = new Mds3Page();
		nsdPage20.getSubSections().add(new PanelHeader());
		nsdPage20.getSubSections().add(new PanelMHeader());
		nsdPage20.getSubSections().add(new PanelM0900());
		nsdPage20.getSubSections().add(new PanelM0900A());
		nsdPage20.getSubSections().add(new PanelM0900B());
		nsdPage20.getSubSections().add(new PanelM0900C());
		nsdPage20.getSubSections().add(new PanelM0900D());
		nsdPage20.getSubSections().add(new PanelM1030());
		nsdPage20.getSubSections().add(new PanelM1040FootProblems());
		nsdPage20.getSubSections().add(new PanelM1040FootOtherProblems());
		nsdPage20.getSubSections().add(new PanelM1040NoneOfAbove());
		nsdPage20.getSubSections().add(new PanelM1200());
		nsdPage20.getSubSections().add(new Mds3Footer());
		return nsdPage20;
	}

	private static Mds3Page getNSDPage21() {
		Mds3Page nsdPage21 = new Mds3Page();
		nsdPage21.getSubSections().add(new Mds3Header());
		nsdPage21.getSubSections().add(new PanelNHeader());
		nsdPage21.getSubSections().add(new PanelN0400());
		nsdPage21.getSubSections().add(new PanelOHeader());
		nsdPage21.getSubSections().add(new PanelO0100());
		nsdPage21.getSubSections().add(new PanelO0250());
		nsdPage21.getSubSections().add(new PanelO0300());
		nsdPage21.getSubSections().add(new Mds3Footer());
		return nsdPage21;
	}

	private static Mds3Page getNSDPage22() {
		Mds3Page nsdPage22 = new Mds3Page();
		nsdPage22.getSubSections().add(new Mds3Header());
		nsdPage22.getSubSections().add(new PanelOHeader());
		nsdPage22.getSubSections().add(new PanelO0400A());
		nsdPage22.getSubSections().add(new PanelO0400B());
		nsdPage22.getSubSections().add(new PanelO0400C());
		nsdPage22.getSubSections().add(new Mds3Footer());
		return nsdPage22;
	}

	private static Mds3Page getNSDPage23() {
		Mds3Page nsdPage23 = new Mds3Page();
		nsdPage23.getSubSections().add(new Mds3Header());
		nsdPage23.getSubSections().add(new PanelOHeader());
		nsdPage23.getSubSections().add(new PanelO0500());
		nsdPage23.getSubSections().add(new PanelO0600());
		nsdPage23.getSubSections().add(new PanelO0700());
		nsdPage23.getSubSections().add(new Mds3Footer());
		return nsdPage23;
	}

	private static Mds3Page getNSDPage24() {
		Mds3Page nsdPage24 = new Mds3Page();
		nsdPage24.getSubSections().add(new Mds3Header());
		nsdPage24.getSubSections().add(new PanelPHeader());
		nsdPage24.getSubSections().add(new PanelP100());
		nsdPage24.getSubSections().add(new PanelQHeader());
		nsdPage24.getSubSections().add(new PanelQ0100());
		nsdPage24.getSubSections().add(new PanelQ0300());
		nsdPage24.getSubSections().add(new Mds3Footer());
		return nsdPage24;
	}

	private static Mds3Page getNSDPage25() {

		Mds3Page nsdPage25 = new Mds3Page();
		nsdPage25.getSubSections().add(new Mds3Header());
		nsdPage25.getSubSections().add(new PanelXHeader());
		nsdPage25.getSubSections().add(new PanelX0100());
		nsdPage25.getSubSections().add(new PanelX0150());
		nsdPage25.getSubSections().add(new PanelX0200());
		nsdPage25.getSubSections().add(new PanelX0300());
		nsdPage25.getSubSections().add(new PanelX0400());
		nsdPage25.getSubSections().add(new PanelX0500());
		nsdPage25.getSubSections().add(new PanelX0600());
		nsdPage25.getSubSections().add(new PanelX0600A());
		nsdPage25.getSubSections().add(new PanelX0600B());
		nsdPage25.getSubSections().add(new PanelX0600C());
		nsdPage25.getSubSections().add(new Mds3Footer());
		return nsdPage25;
	}

	private static Mds3Page getNSDPage26() {

		Mds3Page nsdPage26 = new Mds3Page();
		nsdPage26.getSubSections().add(new Mds3Header());
		nsdPage26.getSubSections().add(new PanelXHeader());
		nsdPage26.getSubSections().add(new PanelX0600Continued());
		nsdPage26.getSubSections().add(new PanelX0600D());
		nsdPage26.getSubSections().add(new PanelX0600F());
		nsdPage26.getSubSections().add(new PanelX0700());
		nsdPage26.getSubSections().add(new PanelX0800());
		nsdPage26.getSubSections().add(new PanelX0900());
		nsdPage26.getSubSections().add(new PanelX1050());
		nsdPage26.getSubSections().add(new Mds3Footer());
		return nsdPage26;
	}

	private static Mds3Page getNSDPage27() {

		Mds3Page nsdPage27 = new Mds3Page();
		nsdPage27.getSubSections().add(new Mds3Header());
		nsdPage27.getSubSections().add(new PanelXHeader());
		nsdPage27.getSubSections().add(new PanelX1100());
		nsdPage27.getSubSections().add(new Mds3Footer());
		return nsdPage27;
	}

	private static Mds3Page getNSDPage28() {

		Mds3Page nsdPage28 = new Mds3Page();
		nsdPage28.getSubSections().add(new Mds3Header());
		nsdPage28.getSubSections().add(new PanelZHeader());
		nsdPage28.getSubSections().add(new PanelZ0100());
		nsdPage28.getSubSections().add(new PanelZ0150());
		nsdPage28.getSubSections().add(new PanelZ0300());
		nsdPage28.getSubSections().add(new Mds3Footer());
		return nsdPage28;
	}

	private static Mds3Page getNSDPage29() {

		Mds3Page nsdPage29 = new Mds3Page();
		nsdPage29.getSubSections().add(new Mds3Header());
		nsdPage29.getSubSections().add(new PanelZHeader());
		nsdPage29.getSubSections().add(new PanelZ0400());
		nsdPage29.getSubSections().add(new PanelZ0500());
		nsdPage29.getSubSections().add(new Mds3Footer());
		return nsdPage29;
	}

}
