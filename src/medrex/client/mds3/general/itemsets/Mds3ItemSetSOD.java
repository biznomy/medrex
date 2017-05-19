package medrex.client.mds3.general.itemsets;

import medrex.client.mds3.general.Mds3ItemSet;
import medrex.client.mds3.general.Mds3Page;
import medrex.client.mds3.ui.commons.Mds3Footer;
import medrex.client.mds3.ui.commons.Mds3Header;
import medrex.client.mds3.ui.itemSpecific.PanelSODHeader;
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
import medrex.client.mds3.ui.subSections.sectionI.PanelI2500;
import medrex.client.mds3.ui.subSections.sectionI.PanelI2900;
import medrex.client.mds3.ui.subSections.sectionI.PanelI3100;
import medrex.client.mds3.ui.subSections.sectionI.PanelI3200;
import medrex.client.mds3.ui.subSections.sectionI.PanelI3300;
import medrex.client.mds3.ui.subSections.sectionI.PanelI3900;
import medrex.client.mds3.ui.subSections.sectionI.PanelI4000;
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
import medrex.client.mds3.ui.subSections.sectionK.PanelK0700;
import medrex.client.mds3.ui.subSections.sectionK.PanelKHeader;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0100;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0150;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0210;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300A;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300B;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300C;
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

public class Mds3ItemSetSOD {

	public static Mds3ItemSet getSODItemSet() {
		// create empty ND item set
		Mds3ItemSet sodItemSet = new Mds3ItemSet();
		sodItemSet.getPages().put("1", getSODPage1());
		sodItemSet.getPages().put("2", getSODPage2());
		sodItemSet.getPages().put("3", getSODPage3());
		sodItemSet.getPages().put("4", getSODPage4());
		sodItemSet.getPages().put("5", getSODPage5());
		sodItemSet.getPages().put("6", getSODPage6());
		sodItemSet.getPages().put("7", getSODPage7());
		sodItemSet.getPages().put("8", getSODPage8());
		sodItemSet.getPages().put("9", getSODPage9());
		sodItemSet.getPages().put("10", getSODPage10());
		sodItemSet.getPages().put("11", getSODPage11());
		sodItemSet.getPages().put("12", getSODPage12());
		sodItemSet.getPages().put("13", getSODPage13());
		sodItemSet.getPages().put("14", getSODPage14());
		sodItemSet.getPages().put("15", getSODPage15());
		sodItemSet.getPages().put("16", getSODPage16());
		sodItemSet.getPages().put("17", getSODPage17());
		sodItemSet.getPages().put("18", getSODPage18());
		sodItemSet.getPages().put("19", getSODPage19());
		sodItemSet.getPages().put("20", getSODPage20());
		sodItemSet.getPages().put("21", getSODPage21());
		sodItemSet.getPages().put("22", getSODPage22());
		sodItemSet.getPages().put("23", getSODPage23());
		sodItemSet.getPages().put("24", getSODPage24());
		sodItemSet.getPages().put("25", getSODPage25());
		sodItemSet.getPages().put("26", getSODPage26());
		sodItemSet.getPages().put("27", getSODPage27());
		sodItemSet.getPages().put("28", getSODPage28());
		sodItemSet.getPages().put("29", getSODPage29());
		sodItemSet.getPages().put("30", getSODPage30());
		sodItemSet.getPages().put("31", getSODPage31());
		sodItemSet.getPages().put("32", getSODPage32());
		return sodItemSet;
	}

	private static Mds3Page getSODPage1() {
		// Createing page1.......
		Mds3Page sodPage1 = new Mds3Page();
		sodPage1.getSubSections().add(new Mds3Header());
		sodPage1.getSubSections().add(new PanelSODHeader());
		sodPage1.getSubSections().add(new PanelAHeader());
		sodPage1.getSubSections().add(new PanelA0100());
		sodPage1.getSubSections().add(new PanelA0200());
		// sodPage1.getSubSections().add(new PanelA0310());
		sodPage1.getSubSections().add(new PanelA0310A());
		sodPage1.getSubSections().add(new PanelA0310B());
		sodPage1.getSubSections().add(new PanelA0310C());
		sodPage1.getSubSections().add(new PanelA0310D());
		sodPage1.getSubSections().add(new PanelA0310E());
		sodPage1.getSubSections().add(new PanelA0310F());
		sodPage1.getSubSections().add(new Mds3Footer());
		return (sodPage1);
	}

	private static Mds3Page getSODPage2() {
		// creating page 2
		Mds3Page sodPage2 = new Mds3Page();
		sodPage2.getSubSections().add(new Mds3Header());
		sodPage2.getSubSections().add(new PanelAHeader());
		sodPage2.getSubSections().add(new PanelA0410());
		sodPage2.getSubSections().add(new PanelA0500());
		sodPage2.getSubSections().add(new PanelA0600());
		sodPage2.getSubSections().add(new PanelA0700());
		sodPage2.getSubSections().add(new PanelA0800());
		sodPage2.getSubSections().add(new PanelA0900());
		sodPage2.getSubSections().add(new PanelA1000());
		sodPage2.getSubSections().add(new PanelA1100());
		sodPage2.getSubSections().add(new Mds3Footer());
		return sodPage2;
	}

	private static Mds3Page getSODPage3() {
		// creating page 3
		Mds3Page sodPage3 = new Mds3Page();
		sodPage3.getSubSections().add(new Mds3Header());
		sodPage3.getSubSections().add(new PanelAHeader());
		sodPage3.getSubSections().add(new PanelA1200());
		sodPage3.getSubSections().add(new PanelA1300());
		sodPage3.getSubSections().add(new PanelA1600());
		sodPage3.getSubSections().add(new PanelA1700());
		sodPage3.getSubSections().add(new PanelA1800());
		sodPage3.getSubSections().add(new PanelA2000());
		sodPage3.getSubSections().add(new Mds3Footer());

		return sodPage3;
	}

	private static Mds3Page getSODPage4() {
		// creating page 4
		Mds3Page sodPage4 = new Mds3Page();
		sodPage4.getSubSections().add(new Mds3Header());
		sodPage4.getSubSections().add(new PanelAHeader());

		sodPage4.getSubSections().add(new PanelA2100());

		sodPage4.getSubSections().add(new PanelA2300());
		sodPage4.getSubSections().add(new PanelA2400());
		sodPage4.getSubSections().add(new Mds3Footer());
		return sodPage4;
	}

	private static Mds3Page getSODPage5() {
		// creating page 5
		Mds3Page sodPage5 = new Mds3Page();
		sodPage5.getSubSections().add(new Mds3Header());
		sodPage5.getSubSections().add(new PanelSubHeader());
		sodPage5.getSubSections().add(new PanelBHeader());
		sodPage5.getSubSections().add(new PanelB0100());
		sodPage5.getSubSections().add(new PanelB0200());
		sodPage5.getSubSections().add(new PanelB0300());
		sodPage5.getSubSections().add(new PanelB0600());
		sodPage5.getSubSections().add(new PanelB0700());
		sodPage5.getSubSections().add(new PanelB0800());
		sodPage5.getSubSections().add(new PanelB1000());
		sodPage5.getSubSections().add(new PanelB1200());
		sodPage5.getSubSections().add(new Mds3Footer());

		return sodPage5;

	}

	private static Mds3Page getSODPage6() {
		// creating page 6
		Mds3Page sodPage6 = new Mds3Page();
		sodPage6.getSubSections().add(new Mds3Header());
		sodPage6.getSubSections().add(new PanelCHeader());
		sodPage6.getSubSections().add(new PanelC0100());
		sodPage6.getSubSections().add(new PanelC0200());
		sodPage6.getSubSections().add(new PanelC0300());
		sodPage6.getSubSections().add(new PanelC0300A());
		sodPage6.getSubSections().add(new PanelC0300B());
		sodPage6.getSubSections().add(new PanelC0300C());
		sodPage6.getSubSections().add(new PanelC0400());
		sodPage6.getSubSections().add(new PanelC0400A());
		sodPage6.getSubSections().add(new PanelC0400B());
		sodPage6.getSubSections().add(new PanelC0400C());
		sodPage6.getSubSections().add(new PanelC0500());
		sodPage6.getSubSections().add(new Mds3Footer());
		return sodPage6;

	}

	private static Mds3Page getSODPage7() {
		// creating page 7
		Mds3Page sodPage7 = new Mds3Page();
		sodPage7.getSubSections().add(new Mds3Header());
		sodPage7.getSubSections().add(new PanelCHeader());
		sodPage7.getSubSections().add(new PanelC0600());
		sodPage7.getSubSections().add(new PanelC0700());
		sodPage7.getSubSections().add(new PanelC0800());
		sodPage7.getSubSections().add(new PanelC0900());
		sodPage7.getSubSections().add(new PanelC1000());
		sodPage7.getSubSections().add(new PanelC1300());
		sodPage7.getSubSections().add(new PanelC1600());
		sodPage7.getSubSections().add(new Mds3Footer());
		return sodPage7;
	}

	private static Mds3Page getSODPage8() {
		Mds3Page sodPage8 = new Mds3Page();
		sodPage8.getSubSections().add(new Mds3Header());
		sodPage8.getSubSections().add(new PanelDHeader());
		sodPage8.getSubSections().add(new PanelD0100());
		sodPage8.getSubSections().add(new PanelD0200());
		sodPage8.getSubSections().add(new PanelD0300());
		sodPage8.getSubSections().add(new PanelD0350());
		sodPage8.getSubSections().add(new Mds3Footer());
		return sodPage8;

	}

	private static Mds3Page getSODPage9() {
		Mds3Page sodPage9 = new Mds3Page();
		sodPage9.getSubSections().add(new Mds3Header());
		sodPage9.getSubSections().add(new PanelDHeader());
		sodPage9.getSubSections().add(new PanelD0500());
		sodPage9.getSubSections().add(new PanelD0600());
		sodPage9.getSubSections().add(new PanelD0650());

		return sodPage9;
	}

	private static Mds3Page getSODPage10() {
		Mds3Page sodPage10 = new Mds3Page();
		sodPage10.getSubSections().add(new Mds3Header());
		sodPage10.getSubSections().add(new PanelEHeader());
		sodPage10.getSubSections().add(new PanelE0100());
		sodPage10.getSubSections().add(new PanelE0200());
		sodPage10.getSubSections().add(new PanelE0800());
		sodPage10.getSubSections().add(new PanelE0900());
		sodPage10.getSubSections().add(new Mds3Footer());
		return sodPage10;
	}

	private static Mds3Page getSODPage11() {
		Mds3Page sodPage11 = new Mds3Page();
		sodPage11.getSubSections().add(new Mds3Header());
		sodPage11.getSubSections().add(new PanelGHeader());
		sodPage11.getSubSections().add(new PanelG0110());
		sodPage11.getSubSections().add(new PanelG0110A());
		sodPage11.getSubSections().add(new PanelG0110B());
		sodPage11.getSubSections().add(new Mds3Footer());
		return sodPage11;
	}

	private static Mds3Page getSODPage12() {
		Mds3Page sodPage12 = new Mds3Page();
		sodPage12.getSubSections().add(new Mds3Header());
		sodPage12.getSubSections().add(new PanelGHeader());
		sodPage12.getSubSections().add(new PanelG0120A());
		sodPage12.getSubSections().add(new PanelG0120B());
		sodPage12.getSubSections().add(new PanelG0300());
		sodPage12.getSubSections().add(new PanelG0400());
		sodPage12.getSubSections().add(new PanelG0600());
		sodPage12.getSubSections().add(new Mds3Footer());
		return sodPage12;
	}

	private static Mds3Page getSODPage13() {
		Mds3Page sodPage13 = new Mds3Page();
		sodPage13.getSubSections().add(new Mds3Header());
		sodPage13.getSubSections().add(new PanelHHeader());
		sodPage13.getSubSections().add(new PanelH0100());
		sodPage13.getSubSections().add(new PanelH0200());
		sodPage13.getSubSections().add(new PanelH0300());
		sodPage13.getSubSections().add(new PanelH0400());
		sodPage13.getSubSections().add(new PanelH0500());
		sodPage13.getSubSections().add(new Mds3Footer());
		return sodPage13;
	}

	private static Mds3Page getSODPage14() {
		Mds3Page sodPage14 = new Mds3Page();
		sodPage14.getSubSections().add(new PanelIHeader());
		sodPage14.getSubSections().add(new PanelActiveDignosis());
		sodPage14.getSubSections().add(new PanelHeartCirculation());
		sodPage14.getSubSections().add(new PanelI0200());
		sodPage14.getSubSections().add(new PanelI0600());
		sodPage14.getSubSections().add(new PanelI0700());
		sodPage14.getSubSections().add(new PanelI0800());
		sodPage14.getSubSections().add(new PanelGenitourinary());
		sodPage14.getSubSections().add(new PanelI1550());
		sodPage14.getSubSections().add(new PanelI1650());
		sodPage14.getSubSections().add(new PanelInfections());
		sodPage14.getSubSections().add(new PanelI1700());
		sodPage14.getSubSections().add(new PanelI2000());
		sodPage14.getSubSections().add(new PanelI2100());
		sodPage14.getSubSections().add(new PanelI2200());
		sodPage14.getSubSections().add(new PanelI2300());
		sodPage14.getSubSections().add(new PanelI2500());
		sodPage14.getSubSections().add(new PanelMetabolic());
		sodPage14.getSubSections().add(new PanelI2900());
		sodPage14.getSubSections().add(new PanelI3100());
		sodPage14.getSubSections().add(new PanelI3200());
		sodPage14.getSubSections().add(new PanelI3300());
		sodPage14.getSubSections().add(new PanelMusculoskeletal());
		sodPage14.getSubSections().add(new PanelI3900());
		sodPage14.getSubSections().add(new PanelI4000());
		sodPage14.getSubSections().add(new PanelNeurological());
		sodPage14.getSubSections().add(new PanelI4400());
		sodPage14.getSubSections().add(new PanelI4500());
		sodPage14.getSubSections().add(new PanelI4800());
		sodPage14.getSubSections().add(new PanelI4900());
		sodPage14.getSubSections().add(new PanelI5000());
		sodPage14.getSubSections().add(new PanelI5100());
		sodPage14.getSubSections().add(new PanelI5200());
		sodPage14.getSubSections().add(new PanelI5250());
		sodPage14.getSubSections().add(new PanelI5300());
		sodPage14.getSubSections().add(new PanelI5400());
		sodPage14.getSubSections().add(new PanelI5500());
		sodPage14.getSubSections().add(new PanelNutritional());
		sodPage14.getSubSections().add(new PanelI5600());
		sodPage14.getSubSections().add(new PanelPsychiatricMoodDisorder());
		sodPage14.getSubSections().add(new PanelI5700());
		sodPage14.getSubSections().add(new PanelI5800());
		sodPage14.getSubSections().add(new PanelI5900());
		sodPage14.getSubSections().add(new PanelI5950());
		sodPage14.getSubSections().add(new PanelI6000());
		sodPage14.getSubSections().add(new Mds3Footer());
		return sodPage14;
	}

	private static Mds3Page getSODPage15() {
		Mds3Page sodPage15 = new Mds3Page();
		sodPage15.getSubSections().add(new PanelIHeader());
		sodPage15.getSubSections().add(new PanelActiveDignosis());
		sodPage15.getSubSections().add(new PanelPulmonary());
		sodPage15.getSubSections().add(new PanelI6200());
		sodPage15.getSubSections().add(new PanelI6300());
		sodPage15.getSubSections().add(new PanelOther());
		sodPage15.getSubSections().add(new PanelI8000());
		sodPage15.getSubSections().add(new Mds3Footer());
		return sodPage15;
	}

	private static Mds3Page getSODPage16() {
		Mds3Page sodPage16 = new Mds3Page();
		sodPage16.getSubSections().add(new Mds3Header());
		sodPage16.getSubSections().add(new PanelJHeader());
		sodPage16.getSubSections().add(new PanelJ0100());
		sodPage16.getSubSections().add(new PanelJ0200());
		sodPage16.getSubSections().add(new PanelJ0300());
		sodPage16.getSubSections().add(new PanelJ0400());
		sodPage16.getSubSections().add(new PanelJ0500());
		sodPage16.getSubSections().add(new PanelJ0600());
		sodPage16.getSubSections().add(new Mds3Footer());
		return sodPage16;
	}

	private static Mds3Page getSODPage17() {
		Mds3Page sodPage17 = new Mds3Page();
		sodPage17.getSubSections().add(new Mds3Header());
		sodPage17.getSubSections().add(new PanelJHeader());
		sodPage17.getSubSections().add(new PanelJ0700());
		sodPage17.getSubSections().add(new PanelJ0800());
		sodPage17.getSubSections().add(new PanelJ0850());
		sodPage17.getSubSections().add(new PanelJ1100());
		sodPage17.getSubSections().add(new PanelJ1400());
		sodPage17.getSubSections().add(new PanelJ1550());
		sodPage17.getSubSections().add(new Mds3Footer());
		sodPage17.getSubSections().add(new Mds3Footer());
		return sodPage17;
	}

	private static Mds3Page getSODPage18() {
		Mds3Page sodPage18 = new Mds3Page();
		sodPage18.getSubSections().add(new PanelJHeader());
		sodPage18.getSubSections().add(new PanelJ1700());
		sodPage18.getSubSections().add(new PanelJ1800());
		sodPage18.getSubSections().add(new PanelJ1900());
		sodPage18.getSubSections().add(new Mds3Footer());
		sodPage18.getSubSections().add(new Mds3Footer());
		return sodPage18;
	}

	private static Mds3Page getSODPage19() {
		Mds3Page sodPage19 = new Mds3Page();
		sodPage19.getSubSections().add(new PanelHeader());
		sodPage19.getSubSections().add(new PanelKHeader());
		sodPage19.getSubSections().add(new PanelK0200());
		sodPage19.getSubSections().add(new PanelK0300());
		sodPage19.getSubSections().add(new PanelK0500());
		sodPage19.getSubSections().add(new PanelK0700());
		sodPage19.getSubSections().add(new Mds3Footer());
		sodPage19.getSubSections().add(new Mds3Footer());
		return sodPage19;
	}

	private static Mds3Page getSODPage20() {
		Mds3Page sodPage20 = new Mds3Page();
		sodPage20.getSubSections().add(new PanelHeader());
		sodPage20.getSubSections().add(new PanelSubHeader());
		sodPage20.getSubSections().add(new PanelM0100());
		sodPage20.getSubSections().add(new PanelM0150());
		sodPage20.getSubSections().add(new PanelM0210());
		sodPage20.getSubSections().add(new PanelM0300());
		sodPage20.getSubSections().add(new PanelM0300A());
		sodPage20.getSubSections().add(new PanelM0300B());
		sodPage20.getSubSections().add(new PanelM0300C());
		sodPage20.getSubSections().add(new PanelM0300D());
		sodPage20.getSubSections().add(new Mds3Footer());
		sodPage20.getSubSections().add(new Mds3Footer());
		return sodPage20;
	}

	private static Mds3Page getSODPage21() {
		// creating page 21
		Mds3Page sodPage21 = new Mds3Page();
		sodPage21.getSubSections().add(new Mds3Header());
		sodPage21.getSubSections().add(new PanelMHeader());
		sodPage21.getSubSections().add(new PanelM0300ContinuedToNextPage());
		sodPage21.getSubSections().add(new PanelM0300E());
		sodPage21.getSubSections().add(new PanelM0300F());
		sodPage21.getSubSections().add(new PanelM0300G());
		sodPage21.getSubSections().add(new PanelM0610());
		sodPage21.getSubSections().add(new PanelM0610A());
		sodPage21.getSubSections().add(new PanelM0610B());
		sodPage21.getSubSections().add(new PanelM0610C());
		sodPage21.getSubSections().add(new PanelM0700());
		sodPage21.getSubSections().add(new PanelM0800());
		sodPage21.getSubSections().add(new PanelM0800A());
		sodPage21.getSubSections().add(new PanelM0800B());
		sodPage21.getSubSections().add(new PanelM0800C());
		sodPage21.getSubSections().add(new Mds3Footer());
		return sodPage21;
	}

	private static Mds3Page getSODPage22() {
		// creating page 22
		Mds3Page sodPage22 = new Mds3Page();
		sodPage22.getSubSections().add(new Mds3Header());
		sodPage22.getSubSections().add(new PanelMHeader());
		sodPage22.getSubSections().add(new PanelM0900());
		sodPage22.getSubSections().add(new PanelM0900A());
		sodPage22.getSubSections().add(new PanelM0900B());
		sodPage22.getSubSections().add(new PanelM0900C());
		sodPage22.getSubSections().add(new PanelM0900D());
		sodPage22.getSubSections().add(new PanelM1030());
		sodPage22.getSubSections().add(new PanelM1040());
		sodPage22.getSubSections().add(new PanelM1200());
		sodPage22.getSubSections().add(new Mds3Footer());
		return sodPage22;
	}

	private static Mds3Page getSODPage23() {
		// creating page 23
		Mds3Page sodPage23 = new Mds3Page();
		sodPage23.getSubSections().add(new Mds3Header());
		sodPage23.getSubSections().add(new PanelNHeader());
		sodPage23.getSubSections().add(new PanelN0300());
		sodPage23.getSubSections().add(new PanelM0900A());
		sodPage23.getSubSections().add(new Mds3Footer());
		return sodPage23;
	}

	private static Mds3Page getSODPage24() {
		// creating page 24
		Mds3Page sodPage24 = new Mds3Page();
		sodPage24.getSubSections().add(new Mds3Header());
		sodPage24.getSubSections().add(new PanelOHeader());
		sodPage24.getSubSections().add(new PanelO0100());
		sodPage24.getSubSections().add(new PanelO0250());
		sodPage24.getSubSections().add(new PanelO0300());
		sodPage24.getSubSections().add(new Mds3Footer());
		return sodPage24;
	}

	private static Mds3Page getSODPage25() {
		// creating page 25
		Mds3Page sodPage25 = new Mds3Page();
		sodPage25.getSubSections().add(new Mds3Header());
		sodPage25.getSubSections().add(new PanelOHeader());
		sodPage25.getSubSections().add(new PanelO0400A());
		sodPage25.getSubSections().add(new PanelO0400B());
		sodPage25.getSubSections().add(new PanelO0400C());
		sodPage25.getSubSections().add(new PanelO0400D());
		sodPage25.getSubSections().add(new Mds3Footer());
		return sodPage25;
	}

	private static Mds3Page getSODPage26() {
		// creating page 26
		Mds3Page sodPage26 = new Mds3Page();
		sodPage26.getSubSections().add(new Mds3Header());
		sodPage26.getSubSections().add(new PanelOHeader());
		sodPage26.getSubSections().add(new PanelO0500());
		sodPage26.getSubSections().add(new PanelO0600());
		sodPage26.getSubSections().add(new PanelO0700());
		sodPage26.getSubSections().add(new Mds3Footer());
		return sodPage26;
	}

	private static Mds3Page getSODPage27() {
		// creating page 27
		Mds3Page sodPage27 = new Mds3Page();
		sodPage27.getSubSections().add(new Mds3Header());
		sodPage27.getSubSections().add(new PanelPHeader());
		sodPage27.getSubSections().add(new PanelP100());
		sodPage27.getSubSections().add(new PanelQHeader());
		sodPage27.getSubSections().add(new PanelQ0100());
		sodPage27.getSubSections().add(new PanelQ0300());
		sodPage27.getSubSections().add(new Mds3Footer());
		return sodPage27;
	}

	private static Mds3Page getSODPage28() {

		Mds3Page sodPage28 = new Mds3Page();
		sodPage28.getSubSections().add(new Mds3Header());
		sodPage28.getSubSections().add(new PanelXHeader());
		sodPage28.getSubSections().add(new PanelX0100());
		sodPage28.getSubSections().add(new PanelX0150());
		sodPage28.getSubSections().add(new PanelX0200());
		sodPage28.getSubSections().add(new PanelX0300());
		sodPage28.getSubSections().add(new PanelX0400());
		sodPage28.getSubSections().add(new PanelX0500());
		sodPage28.getSubSections().add(new PanelX0600());
		sodPage28.getSubSections().add(new PanelX0600A());
		sodPage28.getSubSections().add(new PanelX0600B());
		sodPage28.getSubSections().add(new PanelX0600C());
		sodPage28.getSubSections().add(new Mds3Footer());
		return sodPage28;
	}

	private static Mds3Page getSODPage29() {

		Mds3Page sodPage29 = new Mds3Page();
		sodPage29.getSubSections().add(new Mds3Header());
		sodPage29.getSubSections().add(new PanelXHeader());
		sodPage29.getSubSections().add(new PanelX0600Continued());
		sodPage29.getSubSections().add(new PanelX0600D());
		sodPage29.getSubSections().add(new PanelX0600F());
		sodPage29.getSubSections().add(new PanelX0700());
		sodPage29.getSubSections().add(new PanelX0800());
		sodPage29.getSubSections().add(new PanelX0900());
		sodPage29.getSubSections().add(new PanelX1050());
		sodPage29.getSubSections().add(new Mds3Footer());
		return sodPage29;
	}

	private static Mds3Page getSODPage30() {

		Mds3Page sodPage30 = new Mds3Page();
		sodPage30.getSubSections().add(new Mds3Header());
		sodPage30.getSubSections().add(new PanelXHeader());
		sodPage30.getSubSections().add(new PanelX1100());
		sodPage30.getSubSections().add(new Mds3Footer());
		return sodPage30;
	}

	private static Mds3Page getSODPage31() {

		Mds3Page sodPage31 = new Mds3Page();
		sodPage31.getSubSections().add(new Mds3Header());
		sodPage31.getSubSections().add(new PanelZHeader());
		sodPage31.getSubSections().add(new PanelZ0100());
		sodPage31.getSubSections().add(new PanelZ0150());
		sodPage31.getSubSections().add(new PanelZ0300());
		sodPage31.getSubSections().add(new Mds3Footer());
		return sodPage31;
	}

	private static Mds3Page getSODPage32() {

		Mds3Page sodPage32 = new Mds3Page();
		sodPage32.getSubSections().add(new Mds3Header());
		sodPage32.getSubSections().add(new PanelZHeader());
		sodPage32.getSubSections().add(new PanelZ0400());
		sodPage32.getSubSections().add(new PanelZ0500());
		sodPage32.getSubSections().add(new Mds3Footer());
		return sodPage32;
	}

}
