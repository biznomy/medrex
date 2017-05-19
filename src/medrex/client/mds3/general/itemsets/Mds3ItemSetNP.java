package medrex.client.mds3.general.itemsets;

import medrex.client.mds3.general.Mds3ItemSet;
import medrex.client.mds3.general.Mds3Page;
import medrex.client.mds3.ui.commons.Mds3Footer;
import medrex.client.mds3.ui.commons.Mds3Header;
import medrex.client.mds3.ui.fullPages.PanelMDS3Page17;
import medrex.client.mds3.ui.fullPages.PanelMDS3Page18;
import medrex.client.mds3.ui.itemSpecific.PanelNPHeader;
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
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0200;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0250;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0300;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0400;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0500;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZHeader;

public class Mds3ItemSetNP {

	public static Mds3ItemSet getNPItemSet() {

		// create empty np item set
		Mds3ItemSet nP1ItemSet = new Mds3ItemSet();
		nP1ItemSet.getPages().put("1", getNPPage1());
		nP1ItemSet.getPages().put("2", getNPPage2());
		nP1ItemSet.getPages().put("3", getNPPage3());
		nP1ItemSet.getPages().put("4", getNPPage4());
		nP1ItemSet.getPages().put("5", getNPPage5());
		nP1ItemSet.getPages().put("6", getNPPage6());
		nP1ItemSet.getPages().put("7", getNPPage7());
		nP1ItemSet.getPages().put("8", getNPPage8());
		nP1ItemSet.getPages().put("9", getNPPage9());
		nP1ItemSet.getPages().put("10", getNPPage10());
		nP1ItemSet.getPages().put("11", getNPPage11());
		nP1ItemSet.getPages().put("12", getNPPage12());
		nP1ItemSet.getPages().put("13", getNPPage13());
		nP1ItemSet.getPages().put("14", getNPPage14());
		nP1ItemSet.getPages().put("15", getNPPage15());
		nP1ItemSet.getPages().put("16", getNPPage16());
		nP1ItemSet.getPages().put("17", getNPPage17());
		nP1ItemSet.getPages().put("18", getNPPage18());
		nP1ItemSet.getPages().put("19", getNPPage19());
		nP1ItemSet.getPages().put("20", getNPPage20());
		nP1ItemSet.getPages().put("21", getNPPage21());
		nP1ItemSet.getPages().put("22", getNPPage22());
		nP1ItemSet.getPages().put("23", getNPPage23());
		nP1ItemSet.getPages().put("24", getNPPage24());
		nP1ItemSet.getPages().put("25", getNPPage25());
		nP1ItemSet.getPages().put("26", getNPPage26());
		nP1ItemSet.getPages().put("27", getNPPage27());
		nP1ItemSet.getPages().put("28", getNPPage28());
		nP1ItemSet.getPages().put("29", getNPPage29());
		nP1ItemSet.getPages().put("30", getNPPage30());
		nP1ItemSet.getPages().put("31", getNPPage31());
		nP1ItemSet.getPages().put("32", getNPPage32());
		nP1ItemSet.getPages().put("33", getNPPage33());

		return nP1ItemSet;

	}

	private static Mds3Page getNPPage1() {
		// Createing page1.......
		Mds3Page nPPage1 = new Mds3Page();
		nPPage1.getSubSections().add(new Mds3Header());
		nPPage1.getSubSections().add(new PanelNPHeader());
		nPPage1.getSubSections().add(new PanelAHeader());
		nPPage1.getSubSections().add(new PanelA0100());
		nPPage1.getSubSections().add(new PanelA0200());
		// nPPage1.getSubSections().add(new PanelA0310());
		nPPage1.getSubSections().add(new PanelA0310A());
		nPPage1.getSubSections().add(new PanelA0310B());
		nPPage1.getSubSections().add(new PanelA0310C());
		nPPage1.getSubSections().add(new PanelA0310D());
		nPPage1.getSubSections().add(new PanelA0310E());
		nPPage1.getSubSections().add(new PanelA0310F());
		// ncPage1.setSubSectionFooter(new Mds3Footer());
		return (nPPage1);
	}

	private static Mds3Page getNPPage2() {
		// creating page 2
		Mds3Page nPPage2 = new Mds3Page();
		nPPage2.getSubSections().add(new Mds3Header());
		nPPage2.getSubSections().add(new PanelAHeader());
		nPPage2.getSubSections().add(new PanelA0410());
		nPPage2.getSubSections().add(new PanelA0500());
		nPPage2.getSubSections().add(new PanelA0600());
		nPPage2.getSubSections().add(new PanelA0700());
		nPPage2.getSubSections().add(new PanelA0800());
		nPPage2.getSubSections().add(new PanelA0900());
		nPPage2.getSubSections().add(new PanelA1000());
		nPPage2.getSubSections().add(new PanelA1100());
		nPPage2.getSubSections().add(new Mds3Footer());
		return nPPage2;

	}

	private static Mds3Page getNPPage3() {

		// creating page 3
		Mds3Page nPPage3 = new Mds3Page();
		nPPage3.getSubSections().add(new Mds3Header());
		nPPage3.getSubSections().add(new PanelAHeader());
		nPPage3.getSubSections().add(new PanelA1200());
		nPPage3.getSubSections().add(new PanelA1300());
		nPPage3.getSubSections().add(new PanelA1500());
		nPPage3.getSubSections().add(new PanelA1550());
		nPPage3.getSubSections().add(new PanelA1600());
		nPPage3.getSubSections().add(new PanelA1700());
		nPPage3.getSubSections().add(new Mds3Footer());

		return nPPage3;

	}

	private static Mds3Page getNPPage4() {
		// creating page 4
		Mds3Page npPage4 = new Mds3Page();
		npPage4.getSubSections().add(new Mds3Header());
		npPage4.getSubSections().add(new PanelAHeader());
		npPage4.getSubSections().add(new PanelA1800());
		npPage4.getSubSections().add(new PanelA2000());
		npPage4.getSubSections().add(new PanelA2100());
		npPage4.getSubSections().add(new PanelA2200());
		npPage4.getSubSections().add(new PanelA2300());
		npPage4.getSubSections().add(new PanelA2400());
		npPage4.getSubSections().add(new Mds3Footer());
		return npPage4;
	}

	private static Mds3Page getNPPage5() {
		// creating page 5
		Mds3Page npPage5 = new Mds3Page();
		npPage5.getSubSections().add(new Mds3Header());
		npPage5.getSubSections().add(new PanelSubHeader());
		npPage5.getSubSections().add(new PanelBHeader());
		npPage5.getSubSections().add(new PanelB0100());
		npPage5.getSubSections().add(new PanelB0200());
		npPage5.getSubSections().add(new PanelB0300());
		npPage5.getSubSections().add(new PanelB0600());
		npPage5.getSubSections().add(new PanelB0700());
		npPage5.getSubSections().add(new PanelB0800());
		npPage5.getSubSections().add(new PanelB1000());
		npPage5.getSubSections().add(new PanelB1200());
		npPage5.getSubSections().add(new Mds3Footer());
		return npPage5;

	}

	private static Mds3Page getNPPage6() {
		// creating page 6
		Mds3Page npPage6 = new Mds3Page();
		npPage6.getSubSections().add(new Mds3Header());
		npPage6.getSubSections().add(new PanelCHeader());
		npPage6.getSubSections().add(new PanelC0100());
		npPage6.getSubSections().add(new PanelC0200());
		npPage6.getSubSections().add(new PanelC0300());
		npPage6.getSubSections().add(new PanelC0300A());
		npPage6.getSubSections().add(new PanelC0300B());
		npPage6.getSubSections().add(new PanelC0300C());
		npPage6.getSubSections().add(new PanelC0400());
		npPage6.getSubSections().add(new PanelC0400A());
		npPage6.getSubSections().add(new PanelC0400B());
		npPage6.getSubSections().add(new PanelC0400C());
		npPage6.getSubSections().add(new PanelC0500());
		npPage6.getSubSections().add(new Mds3Footer());
		return npPage6;

	}

	private static Mds3Page getNPPage7() {
		// creating page 7
		Mds3Page npPage7 = new Mds3Page();
		npPage7.getSubSections().add(new Mds3Header());
		npPage7.getSubSections().add(new PanelCHeader());
		npPage7.getSubSections().add(new PanelC0600());
		npPage7.getSubSections().add(new PanelC0700());
		npPage7.getSubSections().add(new PanelC0800());
		npPage7.getSubSections().add(new PanelC0900());
		npPage7.getSubSections().add(new PanelC1000());
		npPage7.getSubSections().add(new PanelC1300());
		npPage7.getSubSections().add(new PanelC1600());
		npPage7.getSubSections().add(new Mds3Footer());
		return npPage7;
	}

	private static Mds3Page getNPPage8() {
		Mds3Page npPage8 = new Mds3Page();
		npPage8.getSubSections().add(new Mds3Header());
		npPage8.getSubSections().add(new PanelDHeader());
		npPage8.getSubSections().add(new PanelD0100());
		npPage8.getSubSections().add(new PanelD0200());
		npPage8.getSubSections().add(new PanelD0300());
		npPage8.getSubSections().add(new PanelD0350());
		npPage8.getSubSections().add(new Mds3Footer());
		return npPage8;

	}

	private static Mds3Page getNPPage9() {
		Mds3Page npPage9 = new Mds3Page();
		npPage9.getSubSections().add(new Mds3Header());
		npPage9.getSubSections().add(new PanelDHeader());
		npPage9.getSubSections().add(new PanelD0500());
		npPage9.getSubSections().add(new PanelD0600());
		npPage9.getSubSections().add(new PanelD0650());
		npPage9.getSubSections().add(new Mds3Footer());
		return npPage9;
	}

	private static Mds3Page getNPPage10() {
		Mds3Page npPage10 = new Mds3Page();
		npPage10.getSubSections().add(new Mds3Header());
		npPage10.getSubSections().add(new PanelEHeader());
		npPage10.getSubSections().add(new PanelE0100());
		npPage10.getSubSections().add(new PanelE0200());
		npPage10.getSubSections().add(new PanelE0800());
		npPage10.getSubSections().add(new PanelE0900());
		npPage10.getSubSections().add(new Mds3Footer());
		return npPage10;
	}

	private static Mds3Page getNPPage11() {
		Mds3Page npPage11 = new Mds3Page();
		npPage11.getSubSections().add(new Mds3Header());
		npPage11.getSubSections().add(new PanelGHeader());
		npPage11.getSubSections().add(new PanelG0110());
		npPage11.getSubSections().add(new PanelG0110A());
		npPage11.getSubSections().add(new PanelG0110B());
		npPage11.getSubSections().add(new Mds3Footer());
		return npPage11;
	}

	private static Mds3Page getNPPage12() {
		Mds3Page npPage12 = new Mds3Page();
		npPage12.getSubSections().add(new Mds3Header());
		npPage12.getSubSections().add(new PanelGHeader());
		npPage12.getSubSections().add(new PanelG0120A());
		npPage12.getSubSections().add(new PanelG0120B());
		npPage12.getSubSections().add(new PanelG0300());
		npPage12.getSubSections().add(new PanelG0400());
		npPage12.getSubSections().add(new PanelG0600());
		npPage12.getSubSections().add(new Mds3Footer());
		return npPage12;
	}

	private static Mds3Page getNPPage13() {
		Mds3Page npPage13 = new Mds3Page();
		npPage13.getSubSections().add(new Mds3Header());
		npPage13.getSubSections().add(new PanelGHeader());
		npPage13.getSubSections().add(new PanelH0100());
		npPage13.getSubSections().add(new PanelH0200());
		npPage13.getSubSections().add(new PanelH0300());
		npPage13.getSubSections().add(new PanelH0400());
		npPage13.getSubSections().add(new PanelH0500());
		npPage13.getSubSections().add(new Mds3Footer());
		return npPage13;
	}

	private static Mds3Page getNPPage14() {
		Mds3Page npPage14 = new Mds3Page();
		npPage14.getSubSections().add(new PanelMDS3Page17());
		npPage14.getSubSections().add(new Mds3Footer());
		return npPage14;
	}

	private static Mds3Page getNPPage15() {
		Mds3Page npPage15 = new Mds3Page();
		npPage15.getSubSections().add(new PanelMDS3Page18());
		npPage15.getSubSections().add(new Mds3Footer());
		return npPage15;
	}

	private static Mds3Page getNPPage16() {
		Mds3Page npPage16 = new Mds3Page();
		npPage16.getSubSections().add(new Mds3Header());
		npPage16.getSubSections().add(new PanelJHeader());
		npPage16.getSubSections().add(new PanelJ0100());
		npPage16.getSubSections().add(new PanelJ0200());
		npPage16.getSubSections().add(new PanelJ0300());
		npPage16.getSubSections().add(new PanelJ0400());
		npPage16.getSubSections().add(new PanelJ0500());
		npPage16.getSubSections().add(new PanelJ0600());
		npPage16.getSubSections().add(new Mds3Footer());
		return npPage16;
	}

	private static Mds3Page getNPPage17() {
		Mds3Page npPage17 = new Mds3Page();
		npPage17.getSubSections().add(new Mds3Header());
		npPage17.getSubSections().add(new PanelJHeader());
		npPage17.getSubSections().add(new PanelJ0700());
		npPage17.getSubSections().add(new PanelJ0800());
		npPage17.getSubSections().add(new PanelJ0850());
		npPage17.getSubSections().add(new PanelJ1100());
		npPage17.getSubSections().add(new PanelJ1400());
		npPage17.getSubSections().add(new PanelJ1550());
		npPage17.getSubSections().add(new Mds3Footer());
		return npPage17;
	}

	private static Mds3Page getNPPage18() {
		Mds3Page npPage18 = new Mds3Page();
		npPage18.getSubSections().add(new Mds3Header());
		npPage18.getSubSections().add(new PanelJHeader());
		npPage18.getSubSections().add(new PanelJ1700());
		npPage18.getSubSections().add(new PanelJ1800());
		npPage18.getSubSections().add(new PanelJ1900());
		npPage18.getSubSections().add(new Mds3Footer());
		return npPage18;
	}

	private static Mds3Page getNPPage19() {
		Mds3Page npPage19 = new Mds3Page();
		npPage19.getSubSections().add(new PanelHeader());
		npPage19.getSubSections().add(new PanelKHeader());
		npPage19.getSubSections().add(new PanelK0100());
		npPage19.getSubSections().add(new PanelK0200());
		npPage19.getSubSections().add(new PanelK0300());
		npPage19.getSubSections().add(new PanelK0500());
		npPage19.getSubSections().add(new PanelK0700());
		npPage19.getSubSections().add(new Mds3Footer());
		return npPage19;
	}

	private static Mds3Page getNPPage20() {
		Mds3Page npPage20 = new Mds3Page();
		npPage20.getSubSections().add(new PanelHeader());
		npPage20.getSubSections().add(new PanelSubHeader());
		npPage20.getSubSections().add(new PanelM0100());
		npPage20.getSubSections().add(new PanelM0150());
		npPage20.getSubSections().add(new PanelM0210());
		npPage20.getSubSections().add(new PanelM0300());
		npPage20.getSubSections().add(new PanelM0300A());
		npPage20.getSubSections().add(new PanelM0300B());
		npPage20.getSubSections().add(new PanelM0300C());
		npPage20.getSubSections().add(new PanelM0300D());
		npPage20.getSubSections().add(new Mds3Footer());
		return npPage20;
	}

	private static Mds3Page getNPPage21() {
		// creating page 21
		Mds3Page npPage21 = new Mds3Page();
		npPage21.getSubSections().add(new Mds3Header());
		npPage21.getSubSections().add(new PanelMHeader());
		npPage21.getSubSections().add(new PanelM0300ContinuedToNextPage());
		npPage21.getSubSections().add(new PanelM0300E());
		npPage21.getSubSections().add(new PanelM0300F());
		npPage21.getSubSections().add(new PanelM0300G());
		npPage21.getSubSections().add(new PanelM0610());
		npPage21.getSubSections().add(new PanelM0610A());
		npPage21.getSubSections().add(new PanelM0610B());
		npPage21.getSubSections().add(new PanelM0610C());
		npPage21.getSubSections().add(new PanelM0700());
		npPage21.getSubSections().add(new PanelM0800());
		npPage21.getSubSections().add(new PanelM0800A());
		npPage21.getSubSections().add(new PanelM0800B());
		npPage21.getSubSections().add(new PanelM0800C());

		return npPage21;
	}

	private static Mds3Page getNPPage22() {
		// creating page 22
		Mds3Page npPage22 = new Mds3Page();
		npPage22.getSubSections().add(new Mds3Header());
		npPage22.getSubSections().add(new PanelMHeader());
		npPage22.getSubSections().add(new PanelM0900());
		npPage22.getSubSections().add(new PanelM0900A());
		npPage22.getSubSections().add(new PanelM0900B());
		npPage22.getSubSections().add(new PanelM0900C());
		npPage22.getSubSections().add(new PanelM0900D());
		npPage22.getSubSections().add(new PanelM1030());
		npPage22.getSubSections().add(new PanelM1040());
		npPage22.getSubSections().add(new PanelM1200());
		return npPage22;
	}

	private static Mds3Page getNPPage23() {
		// creating page 23
		Mds3Page npPage23 = new Mds3Page();
		npPage23.getSubSections().add(new Mds3Header());
		npPage23.getSubSections().add(new PanelNHeader());
		npPage23.getSubSections().add(new PanelN0300());
		npPage23.getSubSections().add(new PanelM0900A());

		return npPage23;
	}

	private static Mds3Page getNPPage24() {
		// creating page 24
		Mds3Page npPage24 = new Mds3Page();
		npPage24.getSubSections().add(new Mds3Header());
		npPage24.getSubSections().add(new PanelOHeader());
		npPage24.getSubSections().add(new PanelO0100());
		npPage24.getSubSections().add(new PanelO0250());
		npPage24.getSubSections().add(new PanelO0300());
		return npPage24;
	}

	private static Mds3Page getNPPage25() {
		// creating page 25
		Mds3Page npPage25 = new Mds3Page();
		npPage25.getSubSections().add(new Mds3Header());
		npPage25.getSubSections().add(new PanelOHeader());
		npPage25.getSubSections().add(new PanelO0400A());
		npPage25.getSubSections().add(new PanelO0400B());
		npPage25.getSubSections().add(new PanelO0400C());

		return npPage25;
	}

	private static Mds3Page getNPPage26() {
		// creating page 26
		Mds3Page npPage26 = new Mds3Page();
		npPage26.getSubSections().add(new Mds3Header());
		npPage26.getSubSections().add(new PanelOHeader());
		npPage26.getSubSections().add(new PanelO0400D());
		npPage26.getSubSections().add(new PanelO0400E());
		npPage26.getSubSections().add(new PanelO0500());
		npPage26.getSubSections().add(new PanelO0600());
		npPage26.getSubSections().add(new PanelO0700());
		return npPage26;
	}

	private static Mds3Page getNPPage27() {
		// creating page 27
		Mds3Page npPage27 = new Mds3Page();
		npPage27.getSubSections().add(new Mds3Header());
		npPage27.getSubSections().add(new PanelPHeader());
		npPage27.getSubSections().add(new PanelP100());

		return npPage27;
	}

	private static Mds3Page getNPPage28() {
		Mds3Page npPage31 = new Mds3Page();
		npPage31.getSubSections().add(new Mds3Header());
		npPage31.getSubSections().add(new PanelQHeader());
		npPage31.getSubSections().add(new PanelQ0100());
		npPage31.getSubSections().add(new PanelQ0300());
		npPage31.getSubSections().add(new PanelQ0300());
		npPage31.getSubSections().add(new PanelQ0400());
		npPage31.getSubSections().add(new PanelQ0500());
		npPage31.getSubSections().add(new PanelQ0600());
		return npPage31;
	}

	private static Mds3Page getNPPage29() {

		Mds3Page npPage29 = new Mds3Page();
		npPage29.getSubSections().add(new Mds3Header());
		npPage29.getSubSections().add(new PanelXHeader());
		npPage29.getSubSections().add(new PanelX0100());
		npPage29.getSubSections().add(new PanelX0150());
		npPage29.getSubSections().add(new PanelX0200());
		npPage29.getSubSections().add(new PanelX0300());
		npPage29.getSubSections().add(new PanelX0400());
		npPage29.getSubSections().add(new PanelX0500());
		npPage29.getSubSections().add(new PanelX0600());
		npPage29.getSubSections().add(new PanelX0600A());
		npPage29.getSubSections().add(new PanelX0600B());
		npPage29.getSubSections().add(new PanelX0600C());
		return npPage29;
	}

	private static Mds3Page getNPPage30() {

		Mds3Page npPage30 = new Mds3Page();
		npPage30.getSubSections().add(new Mds3Header());
		npPage30.getSubSections().add(new PanelXHeader());
		npPage30.getSubSections().add(new PanelX0600Continued());
		npPage30.getSubSections().add(new PanelX0600D());
		npPage30.getSubSections().add(new PanelX0600F());
		npPage30.getSubSections().add(new PanelX0700());
		npPage30.getSubSections().add(new PanelX0800());
		npPage30.getSubSections().add(new PanelX0900());
		npPage30.getSubSections().add(new PanelX1050());
		return npPage30;
	}

	private static Mds3Page getNPPage31() {

		Mds3Page npPage31 = new Mds3Page();
		npPage31.getSubSections().add(new Mds3Header());
		npPage31.getSubSections().add(new PanelXHeader());
		npPage31.getSubSections().add(new PanelX1100());
		return npPage31;
	}

	private static Mds3Page getNPPage32() {

		Mds3Page npPage32 = new Mds3Page();
		npPage32.getSubSections().add(new Mds3Header());
		npPage32.getSubSections().add(new PanelZHeader());
		npPage32.getSubSections().add(new PanelZ0100());
		npPage32.getSubSections().add(new PanelZ0150());
		npPage32.getSubSections().add(new PanelZ0200());
		npPage32.getSubSections().add(new PanelZ0250());
		npPage32.getSubSections().add(new PanelZ0300());
		return npPage32;
	}

	private static Mds3Page getNPPage33() {

		Mds3Page npPage33 = new Mds3Page();
		npPage33.getSubSections().add(new Mds3Header());
		npPage33.getSubSections().add(new PanelZHeader());
		npPage33.getSubSections().add(new PanelZ0400());
		npPage33.getSubSections().add(new PanelZ0500());
		return npPage33;
	}

}
