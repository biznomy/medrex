package medrex.client.mds3.general.itemsets;

import medrex.client.mds3.general.Mds3ItemSet;
import medrex.client.mds3.general.Mds3Page;
import medrex.client.mds3.ui.commons.Mds3Footer;
import medrex.client.mds3.ui.commons.Mds3Header;
import medrex.client.mds3.ui.itemSpecific.PanelNDHeader;
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
import medrex.client.mds3.ui.subSections.sectionG.PanelG0120A;
import medrex.client.mds3.ui.subSections.sectionG.PanelG0120B;
import medrex.client.mds3.ui.subSections.sectionG.PanelG0300;
import medrex.client.mds3.ui.subSections.sectionG.PanelG0400;
import medrex.client.mds3.ui.subSections.sectionG.PanelG0600;
import medrex.client.mds3.ui.subSections.sectionG.PanelGHeader;
import medrex.client.mds3.ui.subSections.sectionH.PanelH0100;
import medrex.client.mds3.ui.subSections.sectionH.PanelH0300;
import medrex.client.mds3.ui.subSections.sectionH.PanelH0400;
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
import medrex.client.mds3.ui.subSections.sectionM.PanelM1040;
import medrex.client.mds3.ui.subSections.sectionM.PanelM1200;
import medrex.client.mds3.ui.subSections.sectionM.PanelMHeader;
import medrex.client.mds3.ui.subSections.sectionN.PanelN0400;
import medrex.client.mds3.ui.subSections.sectionN.PanelNHeader;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0100;
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
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0400;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0500;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZHeader;

public class Mds3ItemSetND {

	public static Mds3ItemSet getNDItemSet() {
		// create empty ND item set
		Mds3ItemSet ndItemSet = new Mds3ItemSet();
		ndItemSet.getPages().put("1", getNDPage1());
		ndItemSet.getPages().put("2", getNDPage2());
		ndItemSet.getPages().put("3", getNDPage3());
		ndItemSet.getPages().put("4", getNDPage4());
		ndItemSet.getPages().put("5", getNDPage5());
		ndItemSet.getPages().put("6", getNDPage6());
		ndItemSet.getPages().put("7", getNDPage7());
		ndItemSet.getPages().put("8", getNDPage8());
		ndItemSet.getPages().put("9", getNDPage9());
		ndItemSet.getPages().put("10", getNDPage10());
		ndItemSet.getPages().put("11", getNDPage11());
		ndItemSet.getPages().put("12", getNDPage12());
		ndItemSet.getPages().put("13", getNDPage13());
		ndItemSet.getPages().put("14", getNDPage14());
		ndItemSet.getPages().put("15", getNDPage15());
		ndItemSet.getPages().put("16", getNDPage16());
		ndItemSet.getPages().put("17", getNDPage17());
		ndItemSet.getPages().put("18", getNDPage18());
		ndItemSet.getPages().put("19", getNDPage19());
		ndItemSet.getPages().put("20", getNDPage20());
		ndItemSet.getPages().put("21", getNDPage21());
		ndItemSet.getPages().put("22", getNDPage22());
		ndItemSet.getPages().put("23", getNDPage23());
		ndItemSet.getPages().put("24", getNDPage24());
		ndItemSet.getPages().put("25", getNDPage25());
		ndItemSet.getPages().put("26", getNDPage26());
		ndItemSet.getPages().put("27", getNDPage27());
		return ndItemSet;
	}

	private static Mds3Page getNDPage1() {
		// Createing page1.......
		Mds3Page ndPage1 = new Mds3Page();
		ndPage1.getSubSections().add(new Mds3Header());
		ndPage1.getSubSections().add(new PanelNDHeader());
		ndPage1.getSubSections().add(new PanelAHeader());
		ndPage1.getSubSections().add(new PanelA0100());
		ndPage1.getSubSections().add(new PanelA0200());
		// ndPage1.getSubSections().add(new PanelA0310());
		ndPage1.getSubSections().add(new PanelA0310A());
		ndPage1.getSubSections().add(new PanelA0310B());
		ndPage1.getSubSections().add(new PanelA0310C());
		ndPage1.getSubSections().add(new PanelA0310D());
		ndPage1.getSubSections().add(new PanelA0310E());
		ndPage1.getSubSections().add(new PanelA0310F());
		ndPage1.getSubSections().add(new Mds3Footer());
		return (ndPage1);
	}

	private static Mds3Page getNDPage2() {
		// creating page 2
		Mds3Page ndPage2 = new Mds3Page();
		ndPage2.getSubSections().add(new Mds3Header());
		ndPage2.getSubSections().add(new PanelAHeader());
		ndPage2.getSubSections().add(new PanelA0410());
		ndPage2.getSubSections().add(new PanelA0500());
		ndPage2.getSubSections().add(new PanelA0600());
		ndPage2.getSubSections().add(new PanelA0700());
		ndPage2.getSubSections().add(new PanelA0800());
		ndPage2.getSubSections().add(new PanelA0900());
		ndPage2.getSubSections().add(new PanelA1000());
		ndPage2.getSubSections().add(new PanelA1100());
		ndPage2.getSubSections().add(new Mds3Footer());
		return ndPage2;
	}

	private static Mds3Page getNDPage3() {
		// creating page 3
		Mds3Page ndPage3 = new Mds3Page();
		ndPage3.getSubSections().add(new Mds3Header());
		ndPage3.getSubSections().add(new PanelAHeader());
		ndPage3.getSubSections().add(new PanelA1200());
		ndPage3.getSubSections().add(new PanelA1300());
		ndPage3.getSubSections().add(new PanelA1500());
		ndPage3.getSubSections().add(new PanelA1550());
		ndPage3.getSubSections().add(new PanelA1600());
		ndPage3.getSubSections().add(new PanelA1700());
		ndPage3.getSubSections().add(new Mds3Footer());

		return ndPage3;
	}

	private static Mds3Page getNDPage4() {
		// creating page 4
		Mds3Page ndPage4 = new Mds3Page();
		ndPage4.getSubSections().add(new Mds3Header());
		ndPage4.getSubSections().add(new PanelAHeader());
		ndPage4.getSubSections().add(new PanelA1800());
		ndPage4.getSubSections().add(new PanelA2000());
		ndPage4.getSubSections().add(new PanelA2100());
		ndPage4.getSubSections().add(new PanelA2300());
		ndPage4.getSubSections().add(new PanelA2400());
		ndPage4.getSubSections().add(new Mds3Footer());
		return ndPage4;
	}

	private static Mds3Page getNDPage5() {
		// creating page 5
		Mds3Page ndPage5 = new Mds3Page();
		ndPage5.getSubSections().add(new Mds3Header());
		ndPage5.getSubSections().add(new PanelSubHeader());
		ndPage5.getSubSections().add(new PanelBHeader());
		ndPage5.getSubSections().add(new PanelB0100());
		ndPage5.getSubSections().add(new PanelB0200());
		ndPage5.getSubSections().add(new PanelB0300());
		ndPage5.getSubSections().add(new PanelB0600());
		ndPage5.getSubSections().add(new PanelB0700());
		ndPage5.getSubSections().add(new PanelB0800());
		ndPage5.getSubSections().add(new PanelB1000());
		ndPage5.getSubSections().add(new PanelB1200());
		ndPage5.getSubSections().add(new Mds3Footer());
		return ndPage5;
	}

	private static Mds3Page getNDPage6() {
		// creating page 6
		Mds3Page ndPage6 = new Mds3Page();
		ndPage6.getSubSections().add(new Mds3Header());
		ndPage6.getSubSections().add(new PanelCHeader());
		ndPage6.getSubSections().add(new PanelC0200());
		ndPage6.getSubSections().add(new PanelC0300());
		ndPage6.getSubSections().add(new PanelC0300A());
		ndPage6.getSubSections().add(new PanelC0300B());
		ndPage6.getSubSections().add(new PanelC0300C());
		ndPage6.getSubSections().add(new PanelC0400());
		ndPage6.getSubSections().add(new PanelC0400A());
		ndPage6.getSubSections().add(new PanelC0400B());
		ndPage6.getSubSections().add(new PanelC0400C());
		ndPage6.getSubSections().add(new PanelC0500());
		ndPage6.getSubSections().add(new Mds3Footer());
		return ndPage6;

	}

	private static Mds3Page getNDPage7() {
		// creating page 7
		Mds3Page ndPage7 = new Mds3Page();
		ndPage7.getSubSections().add(new Mds3Header());
		ndPage7.getSubSections().add(new PanelCHeader());
		ndPage7.getSubSections().add(new PanelC0600());
		ndPage7.getSubSections().add(new PanelC0700());
		ndPage7.getSubSections().add(new PanelC0800());
		ndPage7.getSubSections().add(new PanelC0900());
		ndPage7.getSubSections().add(new PanelC1000());
		ndPage7.getSubSections().add(new PanelC1300());
		ndPage7.getSubSections().add(new PanelC1600());
		ndPage7.getSubSections().add(new Mds3Footer());
		return ndPage7;
	}

	private static Mds3Page getNDPage8() {
		Mds3Page ndPage8 = new Mds3Page();
		ndPage8.getSubSections().add(new Mds3Header());
		ndPage8.getSubSections().add(new PanelDHeader());
		ndPage8.getSubSections().add(new PanelD0100());
		ndPage8.getSubSections().add(new PanelD0200());
		ndPage8.getSubSections().add(new PanelD0300());
		ndPage8.getSubSections().add(new PanelD0350());
		ndPage8.getSubSections().add(new Mds3Footer());
		return ndPage8;

	}

	private static Mds3Page getNDPage9() {
		Mds3Page ndPage9 = new Mds3Page();
		ndPage9.getSubSections().add(new Mds3Header());
		ndPage9.getSubSections().add(new PanelDHeader());
		ndPage9.getSubSections().add(new PanelD0500());
		ndPage9.getSubSections().add(new PanelD0600());
		ndPage9.getSubSections().add(new PanelD0650());
		ndPage9.getSubSections().add(new Mds3Footer());
		return ndPage9;
	}

	private static Mds3Page getNDPage10() {
		Mds3Page ndPage10 = new Mds3Page();
		ndPage10.getSubSections().add(new Mds3Header());
		ndPage10.getSubSections().add(new PanelDHeader());
		ndPage10.getSubSections().add(new PanelE0100());
		ndPage10.getSubSections().add(new Mds3Footer());
		return ndPage10;
	}

	private static Mds3Page getNDPage11() {
		Mds3Page ndPage11 = new Mds3Page();
		ndPage11.getSubSections().add(new Mds3Header());
		ndPage11.getSubSections().add(new PanelGHeader());
		ndPage11.getSubSections().add(new PanelG0120A());
		ndPage11.getSubSections().add(new PanelG0120B());
		ndPage11.getSubSections().add(new PanelG0300());
		ndPage11.getSubSections().add(new PanelG0400());
		ndPage11.getSubSections().add(new PanelG0600());
		ndPage11.getSubSections().add(new Mds3Footer());
		return ndPage11;
	}

	private static Mds3Page getNDPage12() {
		Mds3Page ndPage12 = new Mds3Page();
		ndPage12.getSubSections().add(new Mds3Header());
		ndPage12.getSubSections().add(new PanelHHeader());
		ndPage12.getSubSections().add(new PanelH0100());
		ndPage12.getSubSections().add(new PanelH0300());
		ndPage12.getSubSections().add(new PanelH0400());
		ndPage12.getSubSections().add(new Mds3Footer());
		return ndPage12;

	}

	private static Mds3Page getNDPage13() {
		Mds3Page ndPage13 = new Mds3Page();
		ndPage13.getSubSections().add(new Mds3Header());
		ndPage13.getSubSections().add(new PanelIHeader());
		ndPage13.getSubSections().add(new PanelActiveDignosis());
		ndPage13.getSubSections().add(new PanelHeartCirculation());
		ndPage13.getSubSections().add(new PanelI0200());
		ndPage13.getSubSections().add(new PanelI0600());
		ndPage13.getSubSections().add(new PanelI0700());
		ndPage13.getSubSections().add(new PanelI0800());
		ndPage13.getSubSections().add(new PanelGenitourinary());
		ndPage13.getSubSections().add(new PanelI1550());
		ndPage13.getSubSections().add(new PanelI1650());
		ndPage13.getSubSections().add(new PanelInfections());
		ndPage13.getSubSections().add(new PanelI1700());
		ndPage13.getSubSections().add(new PanelI2000());
		ndPage13.getSubSections().add(new PanelI2100());
		ndPage13.getSubSections().add(new PanelI2200());
		ndPage13.getSubSections().add(new PanelI2300());
		ndPage13.getSubSections().add(new PanelI2500());
		ndPage13.getSubSections().add(new PanelMetabolic());
		ndPage13.getSubSections().add(new PanelI2900());
		ndPage13.getSubSections().add(new PanelI3100());
		ndPage13.getSubSections().add(new PanelI3200());
		ndPage13.getSubSections().add(new PanelI3300());
		ndPage13.getSubSections().add(new PanelMusculoskeletal());
		ndPage13.getSubSections().add(new PanelI3900());
		ndPage13.getSubSections().add(new PanelI4000());
		ndPage13.getSubSections().add(new PanelNeurological());
		ndPage13.getSubSections().add(new PanelI4500());
		ndPage13.getSubSections().add(new PanelI4800());
		ndPage13.getSubSections().add(new PanelI4900());
		ndPage13.getSubSections().add(new PanelI5000());
		ndPage13.getSubSections().add(new PanelI5100());
		ndPage13.getSubSections().add(new PanelI5200());
		ndPage13.getSubSections().add(new PanelI5250());
		ndPage13.getSubSections().add(new PanelI5300());
		ndPage13.getSubSections().add(new PanelI5400());
		ndPage13.getSubSections().add(new PanelI5500());
		ndPage13.getSubSections().add(new PanelNutritional());
		ndPage13.getSubSections().add(new PanelI5600());
		ndPage13.getSubSections().add(new PanelPsychiatricMoodDisorder());
		ndPage13.getSubSections().add(new PanelI5700());
		ndPage13.getSubSections().add(new PanelI5800());
		ndPage13.getSubSections().add(new PanelI5900());
		ndPage13.getSubSections().add(new PanelI5950());
		ndPage13.getSubSections().add(new PanelI6000());
		ndPage13.getSubSections().add(new PanelPulmonary());
		ndPage13.getSubSections().add(new PanelI6200());
		ndPage13.getSubSections().add(new PanelI6300());
		ndPage13.getSubSections().add(new Mds3Footer());
		return ndPage13;

	}

	private static Mds3Page getNDPage14() {
		Mds3Page ndPage14 = new Mds3Page();
		ndPage14.getSubSections().add(new Mds3Header());
		ndPage14.getSubSections().add(new PanelIHeader());
		ndPage14.getSubSections().add(new PanelActiveDignosis());
		ndPage14.getSubSections().add(new PanelI8000());
		ndPage14.getSubSections().add(new Mds3Footer());
		return ndPage14;
	}

	private static Mds3Page getNDPage15() {
		Mds3Page ndPage15 = new Mds3Page();
		ndPage15.getSubSections().add(new Mds3Header());
		ndPage15.getSubSections().add(new PanelJHeader());
		ndPage15.getSubSections().add(new PanelJ0100());
		ndPage15.getSubSections().add(new PanelJ0200());
		ndPage15.getSubSections().add(new PanelJ0300());
		ndPage15.getSubSections().add(new PanelJ0400());
		ndPage15.getSubSections().add(new PanelJ0500());
		ndPage15.getSubSections().add(new PanelJ0600());
		ndPage15.getSubSections().add(new Mds3Footer());
		return ndPage15;
	}

	private static Mds3Page getNDPage16() {
		Mds3Page ndPage16 = new Mds3Page();
		ndPage16.getSubSections().add(new Mds3Header());
		ndPage16.getSubSections().add(new PanelJHeader());
		ndPage16.getSubSections().add(new PanelJ0700());
		ndPage16.getSubSections().add(new PanelJ0800());
		ndPage16.getSubSections().add(new PanelJ0850());
		ndPage16.getSubSections().add(new PanelJ1100());
		ndPage16.getSubSections().add(new PanelJ1400());
		ndPage16.getSubSections().add(new PanelJ1550());
		ndPage16.getSubSections().add(new Mds3Footer());
		return ndPage16;
	}

	private static Mds3Page getNDPage17() {
		Mds3Page ncPage17 = new Mds3Page();
		ncPage17.getSubSections().add(new Mds3Header());
		ncPage17.getSubSections().add(new PanelJHeader());
		ncPage17.getSubSections().add(new PanelJ1700());
		ncPage17.getSubSections().add(new PanelJ1800());
		ncPage17.getSubSections().add(new PanelJ1900());
		ncPage17.getSubSections().add(new PanelKHeader());
		ncPage17.getSubSections().add(new PanelK0200());
		ncPage17.getSubSections().add(new PanelK0300());
		ncPage17.getSubSections().add(new PanelK0500());
		ncPage17.getSubSections().add(new Mds3Footer());
		return ncPage17;
	}

	private static Mds3Page getNDPage18() {
		Mds3Page ndPage18 = new Mds3Page();
		ndPage18.getSubSections().add(new Mds3Header());
		ndPage18.getSubSections().add(new PanelMHeader());
		ndPage18.getSubSections().add(new PanelSubHeader());
		ndPage18.getSubSections().add(new PanelM0100());
		ndPage18.getSubSections().add(new PanelM0150());
		ndPage18.getSubSections().add(new PanelM0210());
		ndPage18.getSubSections().add(new PanelM0300());
		ndPage18.getSubSections().add(new PanelM0300A());
		ndPage18.getSubSections().add(new PanelM0300B());
		ndPage18.getSubSections().add(new PanelM0300C());
		ndPage18.getSubSections().add(new PanelM0300D());
		ndPage18.getSubSections().add(new Mds3Footer());

		return ndPage18;
	}

	private static Mds3Page getNDPage19() {
		Mds3Page ndPage19 = new Mds3Page();
		ndPage19.getSubSections().add(new Mds3Header());
		ndPage19.getSubSections().add(new PanelMHeader());
		ndPage19.getSubSections().add(new PanelM0300());
		ndPage19.getSubSections().add(new PanelM0300E());
		ndPage19.getSubSections().add(new PanelM0300F());
		ndPage19.getSubSections().add(new PanelM0300G());
		ndPage19.getSubSections().add(new PanelM0610());
		ndPage19.getSubSections().add(new PanelM0610A());
		ndPage19.getSubSections().add(new PanelM0610B());
		ndPage19.getSubSections().add(new PanelM0610C());
		ndPage19.getSubSections().add(new PanelM0700());
		ndPage19.getSubSections().add(new PanelM0800());
		ndPage19.getSubSections().add(new PanelM0800A());
		ndPage19.getSubSections().add(new PanelM0800B());
		ndPage19.getSubSections().add(new PanelM0800C());
		ndPage19.getSubSections().add(new Mds3Footer());
		return ndPage19;
	}

	private static Mds3Page getNDPage20() {
		Mds3Page ndPage20 = new Mds3Page();
		ndPage20.getSubSections().add(new Mds3Header());
		ndPage20.getSubSections().add(new PanelMHeader());
		ndPage20.getSubSections().add(new PanelM0900());
		ndPage20.getSubSections().add(new PanelM0900A());
		ndPage20.getSubSections().add(new PanelM0900B());
		ndPage20.getSubSections().add(new PanelM0900C());
		ndPage20.getSubSections().add(new PanelM0900D());
		ndPage20.getSubSections().add(new PanelM1030());
		ndPage20.getSubSections().add(new PanelM1040());
		ndPage20.getSubSections().add(new PanelM1200());
		ndPage20.getSubSections().add(new Mds3Footer());
		return ndPage20;
	}

	private static Mds3Page getNDPage21() {
		Mds3Page ndPage21 = new Mds3Page();
		ndPage21.getSubSections().add(new Mds3Header());
		ndPage21.getSubSections().add(new PanelNHeader());
		ndPage21.getSubSections().add(new PanelN0400());
		ndPage21.getSubSections().add(new PanelOHeader());
		ndPage21.getSubSections().add(new PanelO0100());
		ndPage21.getSubSections().add(new Mds3Footer());
		return ndPage21;
	}

	private static Mds3Page getNDPage22() {
		Mds3Page ndPage22 = new Mds3Page();
		ndPage22.getSubSections().add(new Mds3Header());
		ndPage22.getSubSections().add(new PanelOHeader());
		ndPage22.getSubSections().add(new PanelO0600());
		ndPage22.getSubSections().add(new PanelO0700());
		ndPage22.getSubSections().add(new PanelPHeader());
		ndPage22.getSubSections().add(new PanelP100());
		ndPage22.getSubSections().add(new Mds3Footer());
		return ndPage22;
	}

	private static Mds3Page getNDPage23() {

		Mds3Page ndPage23 = new Mds3Page();
		ndPage23.getSubSections().add(new Mds3Header());
		ndPage23.getSubSections().add(new PanelQHeader());
		ndPage23.getSubSections().add(new PanelQ0100());
		ndPage23.getSubSections().add(new PanelQ0300());
		ndPage23.getSubSections().add(new Mds3Footer());
		return ndPage23;
	}

	private static Mds3Page getNDPage24() {

		Mds3Page ndPage34 = new Mds3Page();
		ndPage34.getSubSections().add(new Mds3Header());
		ndPage34.getSubSections().add(new PanelXHeader());
		ndPage34.getSubSections().add(new PanelX0100());
		ndPage34.getSubSections().add(new PanelX0150());
		ndPage34.getSubSections().add(new PanelX0200());
		ndPage34.getSubSections().add(new PanelX0300());
		ndPage34.getSubSections().add(new PanelX0400());
		ndPage34.getSubSections().add(new PanelX0500());
		ndPage34.getSubSections().add(new PanelX0600());
		ndPage34.getSubSections().add(new PanelX0600A());
		ndPage34.getSubSections().add(new PanelX0600B());
		ndPage34.getSubSections().add(new PanelX0600C());
		ndPage34.getSubSections().add(new Mds3Footer());
		return ndPage34;
	}

	private static Mds3Page getNDPage25() {

		Mds3Page ndPage25 = new Mds3Page();
		ndPage25.getSubSections().add(new Mds3Header());
		ndPage25.getSubSections().add(new PanelXHeader());
		ndPage25.getSubSections().add(new PanelX0600Continued());
		ndPage25.getSubSections().add(new PanelX0600D());
		ndPage25.getSubSections().add(new PanelX0600F());
		ndPage25.getSubSections().add(new PanelX0700());
		ndPage25.getSubSections().add(new PanelX0800());
		ndPage25.getSubSections().add(new PanelX0900());
		ndPage25.getSubSections().add(new PanelX1050());
		ndPage25.getSubSections().add(new Mds3Footer());
		return ndPage25;
	}

	private static Mds3Page getNDPage26() {

		Mds3Page ndPage26 = new Mds3Page();
		ndPage26.getSubSections().add(new Mds3Header());
		ndPage26.getSubSections().add(new PanelXHeader());
		ndPage26.getSubSections().add(new PanelX1100());
		ndPage26.getSubSections().add(new Mds3Footer());
		return ndPage26;
	}

	private static Mds3Page getNDPage27() {

		Mds3Page ndPage27 = new Mds3Page();
		ndPage27.getSubSections().add(new Mds3Header());
		ndPage27.getSubSections().add(new PanelZHeader());
		ndPage27.getSubSections().add(new PanelZ0400());
		ndPage27.getSubSections().add(new PanelZ0500());
		ndPage27.getSubSections().add(new Mds3Footer());
		return ndPage27;
	}

}
