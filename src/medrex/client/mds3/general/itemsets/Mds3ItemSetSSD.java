package medrex.client.mds3.general.itemsets;

import medrex.client.mds3.general.Mds3ItemSet;
import medrex.client.mds3.general.Mds3Page;
import medrex.client.mds3.ui.commons.Mds3Footer;
import medrex.client.mds3.ui.commons.Mds3Header;
import medrex.client.mds3.ui.itemSpecific.PanelSSDheader;
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

public class Mds3ItemSetSSD {

	public static Mds3ItemSet getSSDItemSet() {
		// create empty ND item set
		Mds3ItemSet ssdItemSet = new Mds3ItemSet();
		ssdItemSet.getPages().put("1", getSSDPage1());
		ssdItemSet.getPages().put("2", getSSDPage2());
		ssdItemSet.getPages().put("3", getSSDPage3());
		ssdItemSet.getPages().put("4", getSSDPage4());
		ssdItemSet.getPages().put("5", getSSDPage5());
		ssdItemSet.getPages().put("6", getSSDPage6());
		ssdItemSet.getPages().put("7", getSSDPage7());
		ssdItemSet.getPages().put("8", getSSDPage8());
		ssdItemSet.getPages().put("9", getSSDPage9());
		ssdItemSet.getPages().put("10", getSSDPage10());
		ssdItemSet.getPages().put("11", getSSDPage11());
		ssdItemSet.getPages().put("12", getSSDPage12());
		ssdItemSet.getPages().put("13", getSSDPage13());
		ssdItemSet.getPages().put("14", getSSDPage14());
		ssdItemSet.getPages().put("15", getSSDPage15());
		ssdItemSet.getPages().put("16", getSSDPage16());
		ssdItemSet.getPages().put("17", getSSDPage17());
		ssdItemSet.getPages().put("18", getSSDPage18());
		ssdItemSet.getPages().put("19", getSSDPage19());
		ssdItemSet.getPages().put("20", getSSDPage20());
		ssdItemSet.getPages().put("21", getSSDPage21());
		ssdItemSet.getPages().put("22", getSSDPage22());
		ssdItemSet.getPages().put("23", getSSDPage23());
		ssdItemSet.getPages().put("24", getSSDPage24());
		ssdItemSet.getPages().put("25", getSSDPage25());
		ssdItemSet.getPages().put("26", getSSDPage26());
		ssdItemSet.getPages().put("27", getSSDPage27());
		ssdItemSet.getPages().put("28", getSSDPage28());
		ssdItemSet.getPages().put("29", getSSDPage29());

		return ssdItemSet;
	}

	private static Mds3Page getSSDPage1() {
		// Createing page1.......
		Mds3Page ssdPage1 = new Mds3Page();
		ssdPage1.getSubSections().add(new Mds3Header());
		ssdPage1.getSubSections().add(new PanelSSDheader());
		ssdPage1.getSubSections().add(new PanelAHeader());
		ssdPage1.getSubSections().add(new PanelA0100());
		ssdPage1.getSubSections().add(new PanelA0200());
		// ssdPage1.getSubSections().add(new PanelA0310());
		ssdPage1.getSubSections().add(new PanelA0310A());
		ssdPage1.getSubSections().add(new PanelA0310B());
		ssdPage1.getSubSections().add(new PanelA0310C());
		ssdPage1.getSubSections().add(new PanelA0310D());
		ssdPage1.getSubSections().add(new PanelA0310E());
		ssdPage1.getSubSections().add(new PanelA0310F());
		ssdPage1.getSubSections().add(new Mds3Footer());
		return (ssdPage1);
	}

	private static Mds3Page getSSDPage2() {
		// creating page 2
		Mds3Page ssdPage2 = new Mds3Page();
		ssdPage2.getSubSections().add(new Mds3Header());
		ssdPage2.getSubSections().add(new PanelAHeader());
		ssdPage2.getSubSections().add(new PanelA0410());
		ssdPage2.getSubSections().add(new PanelA0500());
		ssdPage2.getSubSections().add(new PanelA0600());
		ssdPage2.getSubSections().add(new PanelA0700());
		ssdPage2.getSubSections().add(new PanelA0800());
		ssdPage2.getSubSections().add(new PanelA0900());
		ssdPage2.getSubSections().add(new PanelA1000());
		ssdPage2.getSubSections().add(new PanelA1100());
		ssdPage2.getSubSections().add(new Mds3Footer());
		return ssdPage2;
	}

	private static Mds3Page getSSDPage3() {
		// creating page 3
		Mds3Page ssdPage3 = new Mds3Page();
		ssdPage3.getSubSections().add(new Mds3Header());
		ssdPage3.getSubSections().add(new PanelAHeader());
		ssdPage3.getSubSections().add(new PanelA1200());
		ssdPage3.getSubSections().add(new PanelA1300());
		ssdPage3.getSubSections().add(new PanelA1600());
		ssdPage3.getSubSections().add(new PanelA1700());
		ssdPage3.getSubSections().add(new PanelA1800());
		ssdPage3.getSubSections().add(new PanelA2000());
		ssdPage3.getSubSections().add(new Mds3Footer());

		return ssdPage3;
	}

	private static Mds3Page getSSDPage4() {
		// creating page 4
		Mds3Page ssdPage4 = new Mds3Page();
		ssdPage4.getSubSections().add(new Mds3Header());
		ssdPage4.getSubSections().add(new PanelAHeader());

		ssdPage4.getSubSections().add(new PanelA2100());

		ssdPage4.getSubSections().add(new PanelA2300());
		ssdPage4.getSubSections().add(new PanelA2400());
		ssdPage4.getSubSections().add(new Mds3Footer());
		return ssdPage4;
	}

	private static Mds3Page getSSDPage5() {
		// creating page 5
		Mds3Page ssdPage5 = new Mds3Page();
		ssdPage5.getSubSections().add(new Mds3Header());
		ssdPage5.getSubSections().add(new PanelSubHeader());
		ssdPage5.getSubSections().add(new PanelBHeader());
		ssdPage5.getSubSections().add(new PanelB0100());
		ssdPage5.getSubSections().add(new PanelB0200());
		ssdPage5.getSubSections().add(new PanelB0300());
		ssdPage5.getSubSections().add(new PanelB0600());
		ssdPage5.getSubSections().add(new PanelB0700());
		ssdPage5.getSubSections().add(new PanelB0800());
		ssdPage5.getSubSections().add(new PanelB1000());
		ssdPage5.getSubSections().add(new PanelB1200());
		ssdPage5.getSubSections().add(new Mds3Footer());

		return ssdPage5;

	}

	private static Mds3Page getSSDPage6() {
		// creating page 6
		Mds3Page ssdPage6 = new Mds3Page();
		ssdPage6.getSubSections().add(new Mds3Header());
		ssdPage6.getSubSections().add(new PanelCHeader());
		ssdPage6.getSubSections().add(new PanelC0100());
		ssdPage6.getSubSections().add(new PanelC0200());
		ssdPage6.getSubSections().add(new PanelC0300());
		ssdPage6.getSubSections().add(new PanelC0300A());
		ssdPage6.getSubSections().add(new PanelC0300B());
		ssdPage6.getSubSections().add(new PanelC0300C());
		ssdPage6.getSubSections().add(new PanelC0400());
		ssdPage6.getSubSections().add(new PanelC0400A());
		ssdPage6.getSubSections().add(new PanelC0400B());
		ssdPage6.getSubSections().add(new PanelC0400C());
		ssdPage6.getSubSections().add(new PanelC0500());
		ssdPage6.getSubSections().add(new Mds3Footer());
		return ssdPage6;

	}

	private static Mds3Page getSSDPage7() {
		// creating page 7
		Mds3Page ssdPage7 = new Mds3Page();
		ssdPage7.getSubSections().add(new Mds3Header());
		ssdPage7.getSubSections().add(new PanelCHeader());
		ssdPage7.getSubSections().add(new PanelC0600());
		ssdPage7.getSubSections().add(new PanelC0700());
		ssdPage7.getSubSections().add(new PanelC0800());
		ssdPage7.getSubSections().add(new PanelC0900());
		ssdPage7.getSubSections().add(new PanelC1000());
		ssdPage7.getSubSections().add(new PanelC1300());
		ssdPage7.getSubSections().add(new PanelC1600());
		ssdPage7.getSubSections().add(new Mds3Footer());
		return ssdPage7;
	}

	private static Mds3Page getSSDPage8() {
		Mds3Page ssdPage8 = new Mds3Page();
		ssdPage8.getSubSections().add(new Mds3Header());
		ssdPage8.getSubSections().add(new PanelDHeader());
		ssdPage8.getSubSections().add(new PanelD0100());
		ssdPage8.getSubSections().add(new PanelD0200());
		ssdPage8.getSubSections().add(new PanelD0300());
		ssdPage8.getSubSections().add(new PanelD0350());
		ssdPage8.getSubSections().add(new Mds3Footer());
		return ssdPage8;

	}

	private static Mds3Page getSSDPage9() {
		Mds3Page ssdPage9 = new Mds3Page();
		ssdPage9.getSubSections().add(new Mds3Header());
		ssdPage9.getSubSections().add(new PanelDHeader());
		ssdPage9.getSubSections().add(new PanelD0500());
		ssdPage9.getSubSections().add(new PanelD0600());
		ssdPage9.getSubSections().add(new PanelD0650());
		ssdPage9.getSubSections().add(new PanelEHeader());
		ssdPage9.getSubSections().add(new PanelE0100());
		ssdPage9.getSubSections().add(new Mds3Footer());
		return ssdPage9;
	}

	private static Mds3Page getSSDPage10() {
		Mds3Page ssdPage10 = new Mds3Page();
		ssdPage10.getSubSections().add(new Mds3Header());
		ssdPage10.getSubSections().add(new PanelGHeader());
		ssdPage10.getSubSections().add(new PanelG0110());
		ssdPage10.getSubSections().add(new PanelG0110A());
		ssdPage10.getSubSections().add(new PanelG0110B());
		ssdPage10.getSubSections().add(new Mds3Footer());
		return ssdPage10;
	}

	private static Mds3Page getSSDPage11() {
		Mds3Page ssdPage11 = new Mds3Page();
		ssdPage11.getSubSections().add(new Mds3Header());
		ssdPage11.getSubSections().add(new PanelGHeader());
		ssdPage11.getSubSections().add(new PanelG0120A());
		ssdPage11.getSubSections().add(new PanelG0120B());
		ssdPage11.getSubSections().add(new PanelG0300());
		ssdPage11.getSubSections().add(new PanelG0400());
		ssdPage11.getSubSections().add(new PanelG0600());
		ssdPage11.getSubSections().add(new Mds3Footer());
		return ssdPage11;
	}

	private static Mds3Page getSSDPage12() {
		Mds3Page ssdPage12 = new Mds3Page();
		ssdPage12.getSubSections().add(new Mds3Header());
		ssdPage12.getSubSections().add(new PanelHHeader());
		ssdPage12.getSubSections().add(new PanelH0100());
		ssdPage12.getSubSections().add(new PanelH0200());
		ssdPage12.getSubSections().add(new PanelH0300());
		ssdPage12.getSubSections().add(new PanelH0400());
		ssdPage12.getSubSections().add(new PanelH0500());
		ssdPage12.getSubSections().add(new Mds3Footer());
		return ssdPage12;
	}

	private static Mds3Page getSSDPage13() {
		Mds3Page ssdPage13 = new Mds3Page();
		ssdPage13.getSubSections().add(new PanelIHeader());
		ssdPage13.getSubSections().add(new PanelActiveDignosis());
		ssdPage13.getSubSections().add(new PanelHeartCirculation());
		ssdPage13.getSubSections().add(new PanelI0200());
		ssdPage13.getSubSections().add(new PanelI0600());
		ssdPage13.getSubSections().add(new PanelI0700());
		ssdPage13.getSubSections().add(new PanelI0800());
		ssdPage13.getSubSections().add(new PanelGenitourinary());
		ssdPage13.getSubSections().add(new PanelI1550());
		ssdPage13.getSubSections().add(new PanelI1650());
		ssdPage13.getSubSections().add(new PanelInfections());
		ssdPage13.getSubSections().add(new PanelI1700());
		ssdPage13.getSubSections().add(new PanelI2000());
		ssdPage13.getSubSections().add(new PanelI2100());
		ssdPage13.getSubSections().add(new PanelI2200());
		ssdPage13.getSubSections().add(new PanelI2300());
		ssdPage13.getSubSections().add(new PanelI2500());
		ssdPage13.getSubSections().add(new PanelMetabolic());
		ssdPage13.getSubSections().add(new PanelI2900());
		ssdPage13.getSubSections().add(new PanelI3100());
		ssdPage13.getSubSections().add(new PanelI3200());
		ssdPage13.getSubSections().add(new PanelI3300());
		ssdPage13.getSubSections().add(new PanelMusculoskeletal());
		ssdPage13.getSubSections().add(new PanelI3900());
		ssdPage13.getSubSections().add(new PanelI4000());
		ssdPage13.getSubSections().add(new PanelNeurological());
		ssdPage13.getSubSections().add(new PanelI4500());
		ssdPage13.getSubSections().add(new PanelI4800());
		ssdPage13.getSubSections().add(new PanelI4900());
		ssdPage13.getSubSections().add(new PanelI5000());
		ssdPage13.getSubSections().add(new PanelI5100());
		ssdPage13.getSubSections().add(new PanelI5200());
		ssdPage13.getSubSections().add(new PanelI5250());
		ssdPage13.getSubSections().add(new PanelI5300());
		ssdPage13.getSubSections().add(new PanelI5400());
		ssdPage13.getSubSections().add(new PanelI5500());
		ssdPage13.getSubSections().add(new PanelNutritional());
		ssdPage13.getSubSections().add(new PanelI5600());
		ssdPage13.getSubSections().add(new PanelPsychiatricMoodDisorder());
		ssdPage13.getSubSections().add(new PanelI5700());
		ssdPage13.getSubSections().add(new PanelI5800());
		ssdPage13.getSubSections().add(new PanelI5900());
		ssdPage13.getSubSections().add(new PanelI5950());
		ssdPage13.getSubSections().add(new PanelI6000());
		ssdPage13.getSubSections().add(new PanelPulmonary());
		ssdPage13.getSubSections().add(new PanelI6200());
		ssdPage13.getSubSections().add(new PanelI6300());
		ssdPage13.getSubSections().add(new Mds3Footer());
		return ssdPage13;
	}

	private static Mds3Page getSSDPage14() {
		Mds3Page ssdPage14 = new Mds3Page();
		ssdPage14.getSubSections().add(new PanelIHeader());
		ssdPage14.getSubSections().add(new PanelActiveDignosis());
		ssdPage14.getSubSections().add(new PanelI8000());
		ssdPage14.getSubSections().add(new Mds3Footer());
		return ssdPage14;
	}

	private static Mds3Page getSSDPage15() {
		Mds3Page ssdPage15 = new Mds3Page();
		ssdPage15.getSubSections().add(new Mds3Header());
		ssdPage15.getSubSections().add(new PanelJHeader());
		ssdPage15.getSubSections().add(new PanelJ0100());
		ssdPage15.getSubSections().add(new PanelJ0200());
		ssdPage15.getSubSections().add(new PanelJ0300());
		ssdPage15.getSubSections().add(new PanelJ0400());
		ssdPage15.getSubSections().add(new PanelJ0500());
		ssdPage15.getSubSections().add(new PanelJ0600());
		ssdPage15.getSubSections().add(new Mds3Footer());
		return ssdPage15;
	}

	private static Mds3Page getSSDPage16() {
		Mds3Page ssdPage16 = new Mds3Page();
		ssdPage16.getSubSections().add(new Mds3Header());
		ssdPage16.getSubSections().add(new PanelJHeader());
		ssdPage16.getSubSections().add(new PanelJ0700());
		ssdPage16.getSubSections().add(new PanelJ0800());
		ssdPage16.getSubSections().add(new PanelJ0850());
		ssdPage16.getSubSections().add(new PanelJ1100());
		ssdPage16.getSubSections().add(new PanelJ1400());
		ssdPage16.getSubSections().add(new PanelJ1550());
		ssdPage16.getSubSections().add(new Mds3Footer());
		return ssdPage16;
	}

	private static Mds3Page getSSDPage17() {
		Mds3Page ssdPage17 = new Mds3Page();
		ssdPage17.getSubSections().add(new PanelJHeader());
		ssdPage17.getSubSections().add(new PanelJ1700());
		ssdPage17.getSubSections().add(new PanelJ1800());
		ssdPage17.getSubSections().add(new PanelJ1900());
		ssdPage17.getSubSections().add(new PanelKHeader());
		ssdPage17.getSubSections().add(new PanelK0200());
		ssdPage17.getSubSections().add(new PanelK0300());
		ssdPage17.getSubSections().add(new PanelK0500());
		ssdPage17.getSubSections().add(new Mds3Footer());
		return ssdPage17;
	}

	private static Mds3Page getSSDPage18() {
		Mds3Page ssdPage18 = new Mds3Page();
		ssdPage18.getSubSections().add(new PanelHeader());
		ssdPage18.getSubSections().add(new PanelMHeader());
		ssdPage18.getSubSections().add(new PanelSubHeader());
		ssdPage18.getSubSections().add(new PanelM0100());
		ssdPage18.getSubSections().add(new PanelM0150());
		ssdPage18.getSubSections().add(new PanelM0210());
		ssdPage18.getSubSections().add(new PanelM0300());
		ssdPage18.getSubSections().add(new PanelM0300A());
		ssdPage18.getSubSections().add(new PanelM0300B());
		ssdPage18.getSubSections().add(new PanelM0300C());
		ssdPage18.getSubSections().add(new PanelM0300D());
		ssdPage18.getSubSections().add(new Mds3Footer());
		return ssdPage18;
	}

	private static Mds3Page getSSDPage19() {
		Mds3Page ssdPage19 = new Mds3Page();
		ssdPage19.getSubSections().add(new PanelHeader());
		ssdPage19.getSubSections().add(new PanelMHeader());
		ssdPage19.getSubSections().add(new PanelM0300());
		ssdPage19.getSubSections().add(new PanelM0300E());
		ssdPage19.getSubSections().add(new PanelM0300F());
		ssdPage19.getSubSections().add(new PanelM0300G());
		ssdPage19.getSubSections().add(new PanelM0610());
		ssdPage19.getSubSections().add(new PanelM0610A());
		ssdPage19.getSubSections().add(new PanelM0610B());
		ssdPage19.getSubSections().add(new PanelM0610C());
		ssdPage19.getSubSections().add(new PanelM0700());
		ssdPage19.getSubSections().add(new PanelM0800());
		ssdPage19.getSubSections().add(new PanelM0800A());
		ssdPage19.getSubSections().add(new PanelM0800B());
		ssdPage19.getSubSections().add(new PanelM0800C());
		ssdPage19.getSubSections().add(new Mds3Footer());
		return ssdPage19;
	}

	private static Mds3Page getSSDPage20() {
		Mds3Page ssdPage20 = new Mds3Page();
		ssdPage20.getSubSections().add(new PanelHeader());
		ssdPage20.getSubSections().add(new PanelMHeader());
		ssdPage20.getSubSections().add(new PanelM0900());
		ssdPage20.getSubSections().add(new PanelM0900A());
		ssdPage20.getSubSections().add(new PanelM0900B());
		ssdPage20.getSubSections().add(new PanelM0900C());
		ssdPage20.getSubSections().add(new PanelM0900D());
		ssdPage20.getSubSections().add(new PanelM1030());
		ssdPage20.getSubSections().add(new PanelM1040FootProblems());
		ssdPage20.getSubSections().add(new PanelM1040FootOtherProblems());
		ssdPage20.getSubSections().add(new PanelM1040NoneOfAbove());
		ssdPage20.getSubSections().add(new PanelM1200());
		ssdPage20.getSubSections().add(new Mds3Footer());
		return ssdPage20;
	}

	private static Mds3Page getSSDPage21() {
		Mds3Page ssdPage21 = new Mds3Page();
		ssdPage21.getSubSections().add(new Mds3Header());
		ssdPage21.getSubSections().add(new PanelNHeader());
		ssdPage21.getSubSections().add(new PanelN0400());
		ssdPage21.getSubSections().add(new PanelOHeader());
		ssdPage21.getSubSections().add(new PanelO0100());
		ssdPage21.getSubSections().add(new PanelO0250());
		ssdPage21.getSubSections().add(new PanelO0300());
		ssdPage21.getSubSections().add(new Mds3Footer());
		return ssdPage21;
	}

	private static Mds3Page getSSDPage22() {
		Mds3Page ssdPage22 = new Mds3Page();
		ssdPage22.getSubSections().add(new Mds3Header());
		ssdPage22.getSubSections().add(new PanelOHeader());
		ssdPage22.getSubSections().add(new PanelO0400A());
		ssdPage22.getSubSections().add(new PanelO0400B());
		ssdPage22.getSubSections().add(new PanelO0400C());
		ssdPage22.getSubSections().add(new Mds3Footer());
		return ssdPage22;
	}

	private static Mds3Page getSSDPage23() {
		Mds3Page ssdPage23 = new Mds3Page();
		ssdPage23.getSubSections().add(new Mds3Header());
		ssdPage23.getSubSections().add(new PanelOHeader());
		ssdPage23.getSubSections().add(new PanelO0500());
		ssdPage23.getSubSections().add(new PanelO0600());
		ssdPage23.getSubSections().add(new PanelO0700());
		ssdPage23.getSubSections().add(new Mds3Footer());
		return ssdPage23;
	}

	private static Mds3Page getSSDPage24() {
		Mds3Page ssdPage24 = new Mds3Page();
		ssdPage24.getSubSections().add(new Mds3Header());
		ssdPage24.getSubSections().add(new PanelPHeader());
		ssdPage24.getSubSections().add(new PanelP100());
		ssdPage24.getSubSections().add(new PanelQHeader());
		ssdPage24.getSubSections().add(new PanelQ0100());
		ssdPage24.getSubSections().add(new PanelQ0300());
		ssdPage24.getSubSections().add(new Mds3Footer());
		return ssdPage24;
	}

	private static Mds3Page getSSDPage25() {

		Mds3Page ssdPage25 = new Mds3Page();
		ssdPage25.getSubSections().add(new Mds3Header());
		ssdPage25.getSubSections().add(new PanelXHeader());
		ssdPage25.getSubSections().add(new PanelX0100());
		ssdPage25.getSubSections().add(new PanelX0150());
		ssdPage25.getSubSections().add(new PanelX0200());
		ssdPage25.getSubSections().add(new PanelX0300());
		ssdPage25.getSubSections().add(new PanelX0400());
		ssdPage25.getSubSections().add(new PanelX0500());
		ssdPage25.getSubSections().add(new PanelX0600());
		ssdPage25.getSubSections().add(new PanelX0600A());
		ssdPage25.getSubSections().add(new PanelX0600B());
		ssdPage25.getSubSections().add(new PanelX0600C());
		ssdPage25.getSubSections().add(new Mds3Footer());
		return ssdPage25;
	}

	private static Mds3Page getSSDPage26() {

		Mds3Page ssdPage26 = new Mds3Page();
		ssdPage26.getSubSections().add(new Mds3Header());
		ssdPage26.getSubSections().add(new PanelXHeader());
		ssdPage26.getSubSections().add(new PanelX0600Continued());
		ssdPage26.getSubSections().add(new PanelX0600D());
		ssdPage26.getSubSections().add(new PanelX0600F());
		ssdPage26.getSubSections().add(new PanelX0700());
		ssdPage26.getSubSections().add(new PanelX0800());
		ssdPage26.getSubSections().add(new PanelX0900());
		ssdPage26.getSubSections().add(new PanelX1050());
		ssdPage26.getSubSections().add(new Mds3Footer());
		return ssdPage26;
	}

	private static Mds3Page getSSDPage27() {

		Mds3Page ssdPage27 = new Mds3Page();
		ssdPage27.getSubSections().add(new Mds3Header());
		ssdPage27.getSubSections().add(new PanelXHeader());
		ssdPage27.getSubSections().add(new PanelX1100());
		ssdPage27.getSubSections().add(new Mds3Footer());
		return ssdPage27;
	}

	private static Mds3Page getSSDPage28() {

		Mds3Page ssdPage28 = new Mds3Page();
		ssdPage28.getSubSections().add(new Mds3Header());
		ssdPage28.getSubSections().add(new PanelZHeader());
		ssdPage28.getSubSections().add(new PanelZ0100());
		ssdPage28.getSubSections().add(new PanelZ0150());
		ssdPage28.getSubSections().add(new PanelZ0300());
		ssdPage28.getSubSections().add(new Mds3Footer());
		return ssdPage28;
	}

	private static Mds3Page getSSDPage29() {

		Mds3Page ssdPage29 = new Mds3Page();
		ssdPage29.getSubSections().add(new Mds3Header());
		ssdPage29.getSubSections().add(new PanelZHeader());
		ssdPage29.getSubSections().add(new PanelZ0400());
		ssdPage29.getSubSections().add(new PanelZ0500());
		ssdPage29.getSubSections().add(new Mds3Footer());
		return ssdPage29;
	}

}
