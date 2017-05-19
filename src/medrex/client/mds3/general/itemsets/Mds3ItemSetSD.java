package medrex.client.mds3.general.itemsets;

import medrex.client.mds3.general.Mds3ItemSet;
import medrex.client.mds3.general.Mds3Page;
import medrex.client.mds3.ui.commons.Mds3Footer;
import medrex.client.mds3.ui.commons.Mds3Header;
import medrex.client.mds3.ui.itemSpecific.PanelSDheader;
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
import medrex.client.mds3.ui.subSections.sectionL.PanelL0200;
import medrex.client.mds3.ui.subSections.sectionL.PanelLHeader;
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
import medrex.client.mds3.ui.subSections.sectionN.PanelN0300;
import medrex.client.mds3.ui.subSections.sectionN.PanelNHeader;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0100;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0250;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0300;
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
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0300;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0400;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0500;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZHeader;

public class Mds3ItemSetSD {

	public static Mds3ItemSet getSDItemSet() {

		// create empty sd item set
		Mds3ItemSet sd1ItemSet = new Mds3ItemSet();
		sd1ItemSet.getPages().put("1", getSDPage1());
		sd1ItemSet.getPages().put("2", getSDPage2());
		sd1ItemSet.getPages().put("3", getSDPage3());
		sd1ItemSet.getPages().put("4", getSDPage4());
		sd1ItemSet.getPages().put("5", getSDPage5());
		sd1ItemSet.getPages().put("6", getSDPage6());
		sd1ItemSet.getPages().put("7", getSDPage7());
		sd1ItemSet.getPages().put("8", getSDPage8());
		sd1ItemSet.getPages().put("9", getSDPage9());
		sd1ItemSet.getPages().put("10", getSDPage10());
		sd1ItemSet.getPages().put("11", getSDPage11());
		sd1ItemSet.getPages().put("12", getSDPage12());
		sd1ItemSet.getPages().put("13", getSDPage13());
		sd1ItemSet.getPages().put("14", getSDPage14());
		sd1ItemSet.getPages().put("15", getSDPage15());
		sd1ItemSet.getPages().put("16", getSDPage16());
		sd1ItemSet.getPages().put("17", getSDPage17());
		sd1ItemSet.getPages().put("18", getSDPage18());
		sd1ItemSet.getPages().put("19", getSDPage19());
		sd1ItemSet.getPages().put("20", getSDPage20());
		sd1ItemSet.getPages().put("21", getSDPage21());
		sd1ItemSet.getPages().put("22", getSDPage22());
		sd1ItemSet.getPages().put("23", getSDPage23());
		sd1ItemSet.getPages().put("24", getSDPage24());
		sd1ItemSet.getPages().put("25", getSDPage25());
		sd1ItemSet.getPages().put("26", getSDPage26());
		sd1ItemSet.getPages().put("27", getSDPage27());
		return sd1ItemSet;

	}

	private static Mds3Page getSDPage1() {

		// Createing page1.......
		Mds3Page sdPage1 = new Mds3Page();
		sdPage1.getSubSections().add(new Mds3Header());
		sdPage1.getSubSections().add(new PanelSDheader());
		sdPage1.getSubSections().add(new PanelAHeader());
		sdPage1.getSubSections().add(new PanelA0100());
		sdPage1.getSubSections().add(new PanelA0200());
		// sdPage1.getSubSections().add(new PanelA0310());
		sdPage1.getSubSections().add(new PanelA0310A());
		sdPage1.getSubSections().add(new PanelA0310B());
		sdPage1.getSubSections().add(new PanelA0310C());
		sdPage1.getSubSections().add(new PanelA0310D());
		sdPage1.getSubSections().add(new PanelA0310E());
		sdPage1.getSubSections().add(new PanelA0310F());
		sdPage1.getSubSections().add(new Mds3Footer());
		return (sdPage1);
	}

	private static Mds3Page getSDPage2() {

		// creating page 2
		Mds3Page sdPage2 = new Mds3Page();
		sdPage2.getSubSections().add(new Mds3Header());
		sdPage2.getSubSections().add(new PanelAHeader());
		sdPage2.getSubSections().add(new PanelA0410());
		sdPage2.getSubSections().add(new PanelA0500());
		sdPage2.getSubSections().add(new PanelA0600());
		sdPage2.getSubSections().add(new PanelA0700());
		sdPage2.getSubSections().add(new PanelA0800());
		sdPage2.getSubSections().add(new PanelA0900());
		sdPage2.getSubSections().add(new PanelA1000());
		sdPage2.getSubSections().add(new PanelA1100());
		sdPage2.getSubSections().add(new Mds3Footer());
		return sdPage2;
	}

	private static Mds3Page getSDPage3() {

		// creating page 3
		Mds3Page sdPage3 = new Mds3Page();
		sdPage3.getSubSections().add(new Mds3Header());
		sdPage3.getSubSections().add(new PanelAHeader());
		sdPage3.getSubSections().add(new PanelA1200());
		sdPage3.getSubSections().add(new PanelA1300());
		sdPage3.getSubSections().add(new PanelA1600());
		sdPage3.getSubSections().add(new PanelA1700());
		sdPage3.getSubSections().add(new PanelA1800());
		sdPage3.getSubSections().add(new PanelA2000());
		sdPage3.getSubSections().add(new Mds3Footer());

		return sdPage3;
	}

	private static Mds3Page getSDPage4() {
		// creating page 4
		Mds3Page sdPage4 = new Mds3Page();
		sdPage4.getSubSections().add(new Mds3Header());
		sdPage4.getSubSections().add(new PanelAHeader());

		sdPage4.getSubSections().add(new PanelA2100());

		sdPage4.getSubSections().add(new PanelA2300());
		sdPage4.getSubSections().add(new PanelA2400());
		sdPage4.getSubSections().add(new Mds3Footer());
		return sdPage4;
	}

	private static Mds3Page getSDPage5() {
		// creating page 5
		Mds3Page sdPage5 = new Mds3Page();
		sdPage5.getSubSections().add(new Mds3Header());
		sdPage5.getSubSections().add(new PanelSubHeader());
		sdPage5.getSubSections().add(new PanelBHeader());
		sdPage5.getSubSections().add(new PanelB0100());
		sdPage5.getSubSections().add(new PanelB0200());
		sdPage5.getSubSections().add(new PanelB0300());
		sdPage5.getSubSections().add(new PanelB0600());
		sdPage5.getSubSections().add(new PanelB0700());
		sdPage5.getSubSections().add(new PanelB0800());
		sdPage5.getSubSections().add(new PanelB1000());
		sdPage5.getSubSections().add(new PanelB1200());
		sdPage5.getSubSections().add(new Mds3Footer());

		return sdPage5;

	}

	private static Mds3Page getSDPage6() {
		// creating page 6
		Mds3Page sdPage6 = new Mds3Page();
		sdPage6.getSubSections().add(new Mds3Header());
		sdPage6.getSubSections().add(new PanelCHeader());
		sdPage6.getSubSections().add(new PanelC0100());
		sdPage6.getSubSections().add(new PanelC0200());
		sdPage6.getSubSections().add(new PanelC0300());
		sdPage6.getSubSections().add(new PanelC0300A());
		sdPage6.getSubSections().add(new PanelC0300B());
		sdPage6.getSubSections().add(new PanelC0300C());
		sdPage6.getSubSections().add(new PanelC0400());
		sdPage6.getSubSections().add(new PanelC0400A());
		sdPage6.getSubSections().add(new PanelC0400B());
		sdPage6.getSubSections().add(new PanelC0400C());
		sdPage6.getSubSections().add(new PanelC0500());
		sdPage6.getSubSections().add(new Mds3Footer());
		return sdPage6;

	}

	private static Mds3Page getSDPage7() {
		// creating page 7
		Mds3Page sdPage7 = new Mds3Page();
		sdPage7.getSubSections().add(new Mds3Header());
		sdPage7.getSubSections().add(new PanelCHeader());
		sdPage7.getSubSections().add(new PanelC0600());
		sdPage7.getSubSections().add(new PanelC0700());
		sdPage7.getSubSections().add(new PanelC0800());
		sdPage7.getSubSections().add(new PanelC0900());
		sdPage7.getSubSections().add(new PanelC1000());
		sdPage7.getSubSections().add(new PanelC1300());
		sdPage7.getSubSections().add(new PanelC1600());
		sdPage7.getSubSections().add(new Mds3Footer());
		return sdPage7;
	}

	private static Mds3Page getSDPage8() {
		Mds3Page sdPage8 = new Mds3Page();
		sdPage8.getSubSections().add(new Mds3Header());
		sdPage8.getSubSections().add(new PanelDHeader());
		sdPage8.getSubSections().add(new PanelD0100());
		sdPage8.getSubSections().add(new PanelD0200());
		sdPage8.getSubSections().add(new PanelD0300());
		sdPage8.getSubSections().add(new PanelD0350());
		sdPage8.getSubSections().add(new Mds3Footer());
		return sdPage8;

	}

	private static Mds3Page getSDPage9() {
		Mds3Page sdPage9 = new Mds3Page();
		sdPage9.getSubSections().add(new Mds3Header());
		sdPage9.getSubSections().add(new PanelDHeader());
		sdPage9.getSubSections().add(new PanelD0500());
		sdPage9.getSubSections().add(new PanelD0600());
		sdPage9.getSubSections().add(new PanelD0650());
		sdPage9.getSubSections().add(new PanelEHeader());
		sdPage9.getSubSections().add(new PanelE0100());
		sdPage9.getSubSections().add(new Mds3Footer());
		return sdPage9;
	}

	private static Mds3Page getSDPage10() {
		Mds3Page sdPage10 = new Mds3Page();
		sdPage10.getSubSections().add(new Mds3Header());
		sdPage10.getSubSections().add(new PanelGHeader());
		sdPage10.getSubSections().add(new PanelG0110());
		sdPage10.getSubSections().add(new PanelG0110A());
		sdPage10.getSubSections().add(new PanelG0110B());
		sdPage10.getSubSections().add(new Mds3Footer());
		return sdPage10;
	}

	private static Mds3Page getSDPage11() {
		Mds3Page sdPage11 = new Mds3Page();
		sdPage11.getSubSections().add(new Mds3Header());
		sdPage11.getSubSections().add(new PanelGHeader());
		sdPage11.getSubSections().add(new PanelG0120A());
		sdPage11.getSubSections().add(new PanelG0120B());
		sdPage11.getSubSections().add(new PanelG0300());
		sdPage11.getSubSections().add(new PanelG0400());
		sdPage11.getSubSections().add(new PanelG0600());
		sdPage11.getSubSections().add(new Mds3Footer());
		return sdPage11;
	}

	private static Mds3Page getSDPage12() {
		Mds3Page sdPage12 = new Mds3Page();
		sdPage12.getSubSections().add(new Mds3Header());
		sdPage12.getSubSections().add(new PanelHHeader());
		sdPage12.getSubSections().add(new PanelH0100());
		sdPage12.getSubSections().add(new PanelH0300());
		sdPage12.getSubSections().add(new PanelH0400());
		sdPage12.getSubSections().add(new Mds3Footer());
		return sdPage12;
	}

	private static Mds3Page getSDPage13() {
		Mds3Page sdPage13 = new Mds3Page();
		sdPage13.getSubSections().add(new Mds3Header());
		sdPage13.getSubSections().add(new PanelIHeader());
		sdPage13.getSubSections().add(new PanelActiveDignosis());
		sdPage13.getSubSections().add(new PanelHeartCirculation());
		sdPage13.getSubSections().add(new PanelI0200());
		sdPage13.getSubSections().add(new PanelI0600());
		sdPage13.getSubSections().add(new PanelI0700());
		sdPage13.getSubSections().add(new PanelI0800());
		sdPage13.getSubSections().add(new PanelGenitourinary());
		sdPage13.getSubSections().add(new PanelI1550());
		sdPage13.getSubSections().add(new PanelI1650());
		sdPage13.getSubSections().add(new PanelInfections());
		sdPage13.getSubSections().add(new PanelI1700());
		sdPage13.getSubSections().add(new PanelI2000());
		sdPage13.getSubSections().add(new PanelI2100());
		sdPage13.getSubSections().add(new PanelI2200());
		sdPage13.getSubSections().add(new PanelI2300());
		sdPage13.getSubSections().add(new PanelI2500());
		sdPage13.getSubSections().add(new PanelMetabolic());
		sdPage13.getSubSections().add(new PanelI2900());
		sdPage13.getSubSections().add(new PanelI3100());
		sdPage13.getSubSections().add(new PanelI3200());
		sdPage13.getSubSections().add(new PanelI3300());
		sdPage13.getSubSections().add(new PanelMusculoskeletal());
		sdPage13.getSubSections().add(new PanelI3900());
		sdPage13.getSubSections().add(new PanelI4000());
		sdPage13.getSubSections().add(new PanelNeurological());
		sdPage13.getSubSections().add(new PanelI4500());
		sdPage13.getSubSections().add(new PanelI4800());
		sdPage13.getSubSections().add(new PanelI4900());
		sdPage13.getSubSections().add(new PanelI5000());
		sdPage13.getSubSections().add(new PanelI5100());
		sdPage13.getSubSections().add(new PanelI5200());
		sdPage13.getSubSections().add(new PanelI5250());
		sdPage13.getSubSections().add(new PanelI5300());
		sdPage13.getSubSections().add(new PanelI5400());
		sdPage13.getSubSections().add(new PanelI5500());
		sdPage13.getSubSections().add(new PanelNutritional());
		sdPage13.getSubSections().add(new PanelI5600());
		sdPage13.getSubSections().add(new PanelPsychiatricMoodDisorder());
		sdPage13.getSubSections().add(new PanelI5700());
		sdPage13.getSubSections().add(new PanelI5800());
		sdPage13.getSubSections().add(new PanelI5900());
		sdPage13.getSubSections().add(new PanelI5950());
		sdPage13.getSubSections().add(new PanelI6000());
		sdPage13.getSubSections().add(new PanelPulmonary());
		sdPage13.getSubSections().add(new PanelI6200());
		sdPage13.getSubSections().add(new PanelI6300());
		sdPage13.getSubSections().add(new Mds3Footer());
		return sdPage13;
	}

	private static Mds3Page getSDPage14() {
		Mds3Page sdPage14 = new Mds3Page();
		sdPage14.getSubSections().add(new Mds3Header());
		sdPage14.getSubSections().add(new PanelIHeader());
		sdPage14.getSubSections().add(new PanelActiveDignosis());
		sdPage14.getSubSections().add(new PanelOther());
		sdPage14.getSubSections().add(new PanelI8000());
		sdPage14.getSubSections().add(new Mds3Footer());
		return sdPage14;
	}

	private static Mds3Page getSDPage15() {
		Mds3Page sdPage15 = new Mds3Page();
		sdPage15.getSubSections().add(new Mds3Header());
		sdPage15.getSubSections().add(new PanelJHeader());
		sdPage15.getSubSections().add(new PanelJ0100());
		sdPage15.getSubSections().add(new PanelJ0200());
		sdPage15.getSubSections().add(new PanelJ0300());
		sdPage15.getSubSections().add(new PanelJ0400());
		sdPage15.getSubSections().add(new PanelJ0500());
		sdPage15.getSubSections().add(new PanelJ0600());
		sdPage15.getSubSections().add(new Mds3Footer());
		return sdPage15;
	}

	private static Mds3Page getSDPage16() {
		Mds3Page sdPage16 = new Mds3Page();
		sdPage16.getSubSections().add(new Mds3Header());
		sdPage16.getSubSections().add(new PanelJHeader());
		sdPage16.getSubSections().add(new PanelJ0700());
		sdPage16.getSubSections().add(new PanelJ0800());
		sdPage16.getSubSections().add(new PanelJ0850());
		sdPage16.getSubSections().add(new PanelJ1100());
		sdPage16.getSubSections().add(new PanelJ1400());
		sdPage16.getSubSections().add(new PanelJ1550());
		sdPage16.getSubSections().add(new Mds3Footer());
		return sdPage16;
	}

	private static Mds3Page getSDPage17() {
		Mds3Page sdPage17 = new Mds3Page();
		sdPage17.getSubSections().add(new PanelJHeader());
		sdPage17.getSubSections().add(new PanelJ1700());
		sdPage17.getSubSections().add(new PanelJ1800());
		sdPage17.getSubSections().add(new PanelJ1900());
		sdPage17.getSubSections().add(new PanelKHeader());
		sdPage17.getSubSections().add(new PanelK0200());
		sdPage17.getSubSections().add(new PanelK0300());
		sdPage17.getSubSections().add(new PanelK0500());
		sdPage17.getSubSections().add(new Mds3Footer());
		return sdPage17;
	}

	private static Mds3Page getSDPage18() {
		Mds3Page sdPage18 = new Mds3Page();
		sdPage18.getSubSections().add(new PanelHeader());
		sdPage18.getSubSections().add(new PanelSubHeader());
		sdPage18.getSubSections().add(new PanelM0100());
		sdPage18.getSubSections().add(new PanelM0150());
		sdPage18.getSubSections().add(new PanelM0210());
		sdPage18.getSubSections().add(new PanelM0300());
		sdPage18.getSubSections().add(new PanelM0300A());
		sdPage18.getSubSections().add(new PanelM0300B());
		sdPage18.getSubSections().add(new PanelM0300C());
		sdPage18.getSubSections().add(new PanelM0300D());
		sdPage18.getSubSections().add(new Mds3Footer());
		return sdPage18;
	}

	private static Mds3Page getSDPage19() {

		Mds3Page sdPage19 = new Mds3Page();
		sdPage19.getSubSections().add(new Mds3Header());
		sdPage19.getSubSections().add(new PanelHeader());
		sdPage19.getSubSections().add(new PanelM0300E());
		sdPage19.getSubSections().add(new PanelM0300F());
		sdPage19.getSubSections().add(new PanelM0300G());
		sdPage19.getSubSections().add(new PanelM0610());
		sdPage19.getSubSections().add(new PanelM0610A());
		sdPage19.getSubSections().add(new PanelM0610B());
		sdPage19.getSubSections().add(new PanelM0610C());
		sdPage19.getSubSections().add(new PanelM0700());
		sdPage19.getSubSections().add(new PanelM0800());
		sdPage19.getSubSections().add(new PanelM0800A());
		sdPage19.getSubSections().add(new PanelM0800B());
		sdPage19.getSubSections().add(new PanelM0800C());
		sdPage19.getSubSections().add(new PanelLHeader());
		sdPage19.getSubSections().add(new PanelL0200());
		sdPage19.getSubSections().add(new Mds3Footer());
		return sdPage19;

	}

	private static Mds3Page getSDPage20() {
		Mds3Page sdPage20 = new Mds3Page();
		sdPage20.getSubSections().add(new Mds3Header());
		sdPage20.getSubSections().add(new PanelMHeader());
		sdPage20.getSubSections().add(new PanelM0900());
		sdPage20.getSubSections().add(new PanelM0900A());
		sdPage20.getSubSections().add(new PanelM0900B());
		sdPage20.getSubSections().add(new PanelM0900C());
		sdPage20.getSubSections().add(new PanelM0900D());
		sdPage20.getSubSections().add(new PanelM1030());
		sdPage20.getSubSections().add(new PanelM1040());
		sdPage20.getSubSections().add(new PanelM1200());
		sdPage20.getSubSections().add(new Mds3Footer());
		return sdPage20;
	}

	private static Mds3Page getSDPage21() {
		// creating page 21
		Mds3Page sdPage21 = new Mds3Page();
		sdPage21.getSubSections().add(new Mds3Header());
		sdPage21.getSubSections().add(new PanelNHeader());
		sdPage21.getSubSections().add(new PanelN0300());
		sdPage21.getSubSections().add(new PanelM0900A());
		sdPage21.getSubSections().add(new PanelOHeader());
		sdPage21.getSubSections().add(new PanelO0100());
		sdPage21.getSubSections().add(new PanelO0250());
		sdPage21.getSubSections().add(new PanelO0300());
		sdPage21.getSubSections().add(new Mds3Footer());
		return sdPage21;
	}

	private static Mds3Page getSDPage22() {
		// creating page 22
		Mds3Page sdPage22 = new Mds3Page();
		sdPage22.getSubSections().add(new Mds3Header());
		sdPage22.getSubSections().add(new PanelOHeader());
		sdPage22.getSubSections().add(new PanelO0500());
		sdPage22.getSubSections().add(new PanelO0600());
		sdPage22.getSubSections().add(new PanelO0700());
		sdPage22.getSubSections().add(new PanelPHeader());
		sdPage22.getSubSections().add(new PanelP100());
		sdPage22.getSubSections().add(new Mds3Footer());
		return sdPage22;
	}

	private static Mds3Page getSDPage23() {
		Mds3Page sdPage23 = new Mds3Page();
		sdPage23.getSubSections().add(new Mds3Header());
		sdPage23.getSubSections().add(new PanelQHeader());
		sdPage23.getSubSections().add(new PanelQ0100());
		sdPage23.getSubSections().add(new PanelQ0300());
		sdPage23.getSubSections().add(new Mds3Footer());
		return sdPage23;
	}

	private static Mds3Page getSDPage24() {

		Mds3Page sdPage24 = new Mds3Page();
		sdPage24.getSubSections().add(new Mds3Header());
		sdPage24.getSubSections().add(new PanelXHeader());
		sdPage24.getSubSections().add(new PanelX0100());
		sdPage24.getSubSections().add(new PanelX0150());
		sdPage24.getSubSections().add(new PanelX0200());
		sdPage24.getSubSections().add(new PanelX0300());
		sdPage24.getSubSections().add(new PanelX0400());
		sdPage24.getSubSections().add(new PanelX0500());
		sdPage24.getSubSections().add(new PanelX0600());
		sdPage24.getSubSections().add(new PanelX0600A());
		sdPage24.getSubSections().add(new PanelX0600B());
		sdPage24.getSubSections().add(new PanelX0600C());
		sdPage24.getSubSections().add(new Mds3Footer());
		return sdPage24;
	}

	private static Mds3Page getSDPage25() {

		Mds3Page sdPage25 = new Mds3Page();
		sdPage25.getSubSections().add(new Mds3Header());
		sdPage25.getSubSections().add(new PanelXHeader());
		sdPage25.getSubSections().add(new PanelX0600Continued());
		sdPage25.getSubSections().add(new PanelX0600D());
		sdPage25.getSubSections().add(new PanelX0600F());
		sdPage25.getSubSections().add(new PanelX0700());
		sdPage25.getSubSections().add(new PanelX0800());
		sdPage25.getSubSections().add(new PanelX0900());
		sdPage25.getSubSections().add(new PanelX1050());
		sdPage25.getSubSections().add(new Mds3Footer());
		return sdPage25;
	}

	private static Mds3Page getSDPage26() {

		Mds3Page sdPage26 = new Mds3Page();
		sdPage26.getSubSections().add(new Mds3Header());
		sdPage26.getSubSections().add(new PanelXHeader());
		sdPage26.getSubSections().add(new PanelX1100());
		sdPage26.getSubSections().add(new Mds3Footer());
		return sdPage26;
	}

	private static Mds3Page getSDPage27() {

		Mds3Page sdPage27 = new Mds3Page();
		sdPage27.getSubSections().add(new Mds3Header());
		sdPage27.getSubSections().add(new PanelZHeader());
		sdPage27.getSubSections().add(new PanelZ0300());
		sdPage27.getSubSections().add(new PanelZ0400());
		sdPage27.getSubSections().add(new PanelZ0500());
		sdPage27.getSubSections().add(new Mds3Footer());
		return sdPage27;
	}

}
