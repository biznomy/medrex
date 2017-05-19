package medrex.client.mds3.general.itemsets;

import medrex.client.mds3.general.Mds3ItemSet;
import medrex.client.mds3.general.Mds3Page;
import medrex.client.mds3.ui.commons.Mds3Footer;
import medrex.client.mds3.ui.commons.Mds3Header;
import medrex.client.mds3.ui.fullPages.PanelMDS3Page17;
import medrex.client.mds3.ui.fullPages.PanelMDS3Page18;
import medrex.client.mds3.ui.fullPages.PanelMDS3Page26;
import medrex.client.mds3.ui.itemSpecific.PanelSPHeader;
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
import medrex.client.mds3.ui.subSections.sectionC.PanelC0400;
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
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0300;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0400;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZ0500;
import medrex.client.mds3.ui.subSections.sectionZ.PanelZHeader;

public class Mds3ItemSetSP {

	public static Mds3ItemSet getSPItemSet() {
		// create empty SP item set
		Mds3ItemSet sp1ItemSet = new Mds3ItemSet();
		sp1ItemSet.getPages().put("1", getSPPage1());
		sp1ItemSet.getPages().put("2", getSPPage2());
		sp1ItemSet.getPages().put("3", getSPPage3());
		sp1ItemSet.getPages().put("4", getSPPage4());
		sp1ItemSet.getPages().put("5", getSPPage5());
		sp1ItemSet.getPages().put("6", getSPPage6());
		sp1ItemSet.getPages().put("7", getSPPage7());
		sp1ItemSet.getPages().put("8", getSPPage8());
		sp1ItemSet.getPages().put("9", getSPPage9());
		sp1ItemSet.getPages().put("10", getSPPage10());
		sp1ItemSet.getPages().put("11", getSPPage11());
		sp1ItemSet.getPages().put("12", getSPPage12());
		sp1ItemSet.getPages().put("13", getSPPage13());
		sp1ItemSet.getPages().put("14", getSPPage14());
		sp1ItemSet.getPages().put("15", getSPPage15());
		sp1ItemSet.getPages().put("16", getSPPage16());
		sp1ItemSet.getPages().put("17", getSPPage17());
		sp1ItemSet.getPages().put("18", getSPPage18());
		sp1ItemSet.getPages().put("19", getSPPage19());
		sp1ItemSet.getPages().put("20", getSPPage20());
		sp1ItemSet.getPages().put("21", getSPPage21());
		sp1ItemSet.getPages().put("22", getSPPage22());
		sp1ItemSet.getPages().put("23", getSPPage23());
		sp1ItemSet.getPages().put("24", getSPPage24());
		sp1ItemSet.getPages().put("25", getSPPage25());
		sp1ItemSet.getPages().put("26", getSPPage26());
		sp1ItemSet.getPages().put("27", getSPPage27());
		sp1ItemSet.getPages().put("28", getSPPage28());
		sp1ItemSet.getPages().put("29", getSPPage29());
		sp1ItemSet.getPages().put("30", getSPPage30());
		sp1ItemSet.getPages().put("31", getSPPage31());
		sp1ItemSet.getPages().put("32", getSPPage32());
		sp1ItemSet.getPages().put("33", getSPPage33());
		return sp1ItemSet;

	}

	private static Mds3Page getSPPage1() {
		// Createing page1.......
		Mds3Page spPage1 = new Mds3Page();
		spPage1.getSubSections().add(new Mds3Header());
		spPage1.getSubSections().add(new PanelSPHeader());
		spPage1.getSubSections().add(new PanelAHeader());
		spPage1.getSubSections().add(new PanelA0100());
		spPage1.getSubSections().add(new PanelA0200());
		// spPage1.getSubSections().add(new PanelA0310());
		spPage1.getSubSections().add(new PanelA0310A());
		spPage1.getSubSections().add(new PanelA0310B());
		spPage1.getSubSections().add(new PanelA0310C());
		spPage1.getSubSections().add(new PanelA0310D());
		spPage1.getSubSections().add(new PanelA0310E());
		spPage1.getSubSections().add(new PanelA0310F());
		// ncPage1.setSubSectionFooter(new Mds3Footer());
		return (spPage1);

	}

	private static Mds3Page getSPPage2() {
		// creating page 2
		Mds3Page spPage2 = new Mds3Page();
		spPage2.getSubSections().add(new Mds3Header());
		spPage2.getSubSections().add(new PanelAHeader());
		spPage2.getSubSections().add(new PanelA0410());
		spPage2.getSubSections().add(new PanelA0500());
		spPage2.getSubSections().add(new PanelA0600());
		spPage2.getSubSections().add(new PanelA0700());
		spPage2.getSubSections().add(new PanelA0800());
		spPage2.getSubSections().add(new PanelA0900());
		spPage2.getSubSections().add(new PanelA1000());
		spPage2.getSubSections().add(new PanelA1100());
		spPage2.getSubSections().add(new Mds3Footer());
		return spPage2;

	}

	private static Mds3Page getSPPage3() {

		// creating page 3
		Mds3Page spPage3 = new Mds3Page();
		spPage3.getSubSections().add(new Mds3Header());
		spPage3.getSubSections().add(new PanelAHeader());
		spPage3.getSubSections().add(new PanelA1200());
		spPage3.getSubSections().add(new PanelA1300());
		spPage3.getSubSections().add(new PanelA1600());
		spPage3.getSubSections().add(new PanelA1700());
		spPage3.getSubSections().add(new PanelA1800());
		spPage3.getSubSections().add(new PanelA2000());
		spPage3.getSubSections().add(new Mds3Footer());

		return spPage3;

	}

	private static Mds3Page getSPPage4() {
		// creating page 4
		Mds3Page spPage4 = new Mds3Page();
		spPage4.getSubSections().add(new Mds3Header());
		spPage4.getSubSections().add(new PanelAHeader());

		spPage4.getSubSections().add(new PanelA2100());

		spPage4.getSubSections().add(new PanelA2300());
		spPage4.getSubSections().add(new PanelA2400());
		spPage4.getSubSections().add(new Mds3Footer());
		return spPage4;
	}

	private static Mds3Page getSPPage5() {
		// creating page 5
		Mds3Page spPage5 = new Mds3Page();
		spPage5.getSubSections().add(new Mds3Header());
		spPage5.getSubSections().add(new PanelSubHeader());
		spPage5.getSubSections().add(new PanelBHeader());
		spPage5.getSubSections().add(new PanelB0100());
		spPage5.getSubSections().add(new PanelB0200());
		spPage5.getSubSections().add(new PanelB0300());
		spPage5.getSubSections().add(new PanelB0600());
		spPage5.getSubSections().add(new PanelB0700());
		spPage5.getSubSections().add(new PanelB0800());
		spPage5.getSubSections().add(new PanelB1000());
		spPage5.getSubSections().add(new PanelB1200());
		spPage5.getSubSections().add(new Mds3Footer());

		return spPage5;
	}

	private static Mds3Page getSPPage6() {
		// creating page 6
		Mds3Page spPage6 = new Mds3Page();
		spPage6.getSubSections().add(new Mds3Header());
		spPage6.getSubSections().add(new PanelCHeader());
		spPage6.getSubSections().add(new PanelC0100());
		spPage6.getSubSections().add(new PanelC0200());
		spPage6.getSubSections().add(new PanelC0300());
		spPage6.getSubSections().add(new PanelC0400());
		spPage6.getSubSections().add(new PanelC0500());
		spPage6.getSubSections().add(new Mds3Footer());
		return spPage6;
	}

	private static Mds3Page getSPPage7() {
		// creating page 7
		Mds3Page spPage7 = new Mds3Page();
		spPage7.getSubSections().add(new Mds3Header());
		spPage7.getSubSections().add(new PanelCHeader());
		spPage7.getSubSections().add(new PanelC0600());
		spPage7.getSubSections().add(new PanelC0700());
		spPage7.getSubSections().add(new PanelC0800());
		spPage7.getSubSections().add(new PanelC0900());
		spPage7.getSubSections().add(new PanelC1000());
		spPage7.getSubSections().add(new PanelC1300());
		spPage7.getSubSections().add(new PanelC1600());
		spPage7.getSubSections().add(new Mds3Footer());
		return spPage7;
	}

	private static Mds3Page getSPPage8() {
		// creating page 8
		Mds3Page spPage8 = new Mds3Page();
		spPage8.getSubSections().add(new Mds3Header());
		spPage8.getSubSections().add(new PanelDHeader());
		spPage8.getSubSections().add(new PanelD0100());
		spPage8.getSubSections().add(new PanelD0200());
		spPage8.getSubSections().add(new PanelD0300());
		spPage8.getSubSections().add(new PanelD0350());
		spPage8.getSubSections().add(new Mds3Footer());
		return spPage8;
	}

	private static Mds3Page getSPPage9() {
		// creating page 9
		Mds3Page spPage9 = new Mds3Page();
		spPage9.getSubSections().add(new Mds3Header());
		spPage9.getSubSections().add(new PanelDHeader());
		spPage9.getSubSections().add(new PanelD0500());
		spPage9.getSubSections().add(new PanelD0600());
		spPage9.getSubSections().add(new PanelD0650());
		spPage9.getSubSections().add(new Mds3Footer());
		return spPage9;
	}

	private static Mds3Page getSPPage10() {
		// creating page 10
		Mds3Page spPage10 = new Mds3Page();
		spPage10.getSubSections().add(new Mds3Header());
		spPage10.getSubSections().add(new PanelEHeader());
		spPage10.getSubSections().add(new PanelE0100());
		spPage10.getSubSections().add(new PanelE0200());
		spPage10.getSubSections().add(new PanelE0800());
		spPage10.getSubSections().add(new PanelE0900());
		spPage10.getSubSections().add(new Mds3Footer());
		return spPage10;

	}

	private static Mds3Page getSPPage11() {
		// creating page 11
		Mds3Page spPage11 = new Mds3Page();
		spPage11.getSubSections().add(new Mds3Header());
		spPage11.getSubSections().add(new PanelGHeader());
		spPage11.getSubSections().add(new PanelG0110());
		spPage11.getSubSections().add(new PanelG0110A());
		spPage11.getSubSections().add(new PanelG0110B());
		spPage11.getSubSections().add(new Mds3Footer());
		return spPage11;

	}

	private static Mds3Page getSPPage12() {
		// creating page 12
		Mds3Page spPage12 = new Mds3Page();
		spPage12.getSubSections().add(new Mds3Header());
		spPage12.getSubSections().add(new PanelGHeader());
		spPage12.getSubSections().add(new PanelG0120A());
		spPage12.getSubSections().add(new PanelG0120B());
		spPage12.getSubSections().add(new PanelG0300());
		spPage12.getSubSections().add(new PanelG0400());
		spPage12.getSubSections().add(new PanelG0600());
		spPage12.getSubSections().add(new Mds3Footer());
		return spPage12;

	}

	private static Mds3Page getSPPage13() {
		// creating page 13
		Mds3Page spPage13 = new Mds3Page();
		spPage13.getSubSections().add(new Mds3Header());
		spPage13.getSubSections().add(new PanelHHeader());
		spPage13.getSubSections().add(new PanelH0100());
		spPage13.getSubSections().add(new PanelH0200());
		spPage13.getSubSections().add(new PanelH0300());
		spPage13.getSubSections().add(new PanelH0400());
		spPage13.getSubSections().add(new PanelH0500());
		spPage13.getSubSections().add(new Mds3Footer());
		return spPage13;
	}

	private static Mds3Page getSPPage14() {
		// creating page 14
		Mds3Page spPage14 = new Mds3Page();
		spPage14.getSubSections().add(new PanelMDS3Page17());
		spPage14.getSubSections().add(new Mds3Footer());
		return spPage14;

	}

	private static Mds3Page getSPPage15() {
		// creating page 15
		Mds3Page spPage15 = new Mds3Page();
		spPage15.getSubSections().add(new PanelMDS3Page18());
		spPage15.getSubSections().add(new Mds3Footer());
		return spPage15;

	}

	private static Mds3Page getSPPage16() {
		// creating page 16
		Mds3Page spPage16 = new Mds3Page();
		spPage16.getSubSections().add(new Mds3Header());
		spPage16.getSubSections().add(new PanelJHeader());
		spPage16.getSubSections().add(new PanelJ0100());
		spPage16.getSubSections().add(new PanelJ0200());
		spPage16.getSubSections().add(new PanelJ0300());
		spPage16.getSubSections().add(new PanelJ0400());
		spPage16.getSubSections().add(new PanelJ0500());
		spPage16.getSubSections().add(new PanelJ0600());
		spPage16.getSubSections().add(new Mds3Footer());
		return spPage16;

	}

	private static Mds3Page getSPPage17() {
		// creating page 17
		Mds3Page spPage17 = new Mds3Page();
		spPage17.getSubSections().add(new Mds3Header());
		spPage17.getSubSections().add(new PanelJHeader());
		spPage17.getSubSections().add(new PanelJ0700());
		spPage17.getSubSections().add(new PanelJ0800());
		spPage17.getSubSections().add(new PanelJ0850());
		spPage17.getSubSections().add(new PanelJ1100());
		spPage17.getSubSections().add(new PanelJ1400());
		spPage17.getSubSections().add(new PanelJ1550());
		spPage17.getSubSections().add(new Mds3Footer());
		return spPage17;

	}

	private static Mds3Page getSPPage18() {
		// creating page 18
		Mds3Page spPage18 = new Mds3Page();
		spPage18.getSubSections().add(new Mds3Header());
		spPage18.getSubSections().add(new PanelJHeader());
		spPage18.getSubSections().add(new PanelJ1700());
		spPage18.getSubSections().add(new PanelJ1800());
		spPage18.getSubSections().add(new PanelJ1900());
		spPage18.getSubSections().add(new Mds3Footer());
		return spPage18;

	}

	private static Mds3Page getSPPage19() {
		// creating page 19
		Mds3Page spPage19 = new Mds3Page();
		spPage19.getSubSections().add(new Mds3Header());
		spPage19.getSubSections().add(new PanelKHeader());
		spPage19.getSubSections().add(new PanelK0200());
		spPage19.getSubSections().add(new PanelK0300());
		spPage19.getSubSections().add(new PanelK0500());
		spPage19.getSubSections().add(new PanelK0700());
		spPage19.getSubSections().add(new Mds3Footer());
		return spPage19;

	}

	private static Mds3Page getSPPage20() {

		Mds3Page spPage20 = new Mds3Page();
		spPage20.getSubSections().add(new Mds3Header());
		spPage20.getSubSections().add(new PanelHeader());
		spPage20.getSubSections().add(new PanelSubHeader());
		spPage20.getSubSections().add(new PanelM0100());
		spPage20.getSubSections().add(new PanelM0150());
		spPage20.getSubSections().add(new PanelM0210());
		spPage20.getSubSections().add(new PanelM0300());
		spPage20.getSubSections().add(new PanelM0300A());
		spPage20.getSubSections().add(new PanelM0300B());
		spPage20.getSubSections().add(new PanelM0300C());
		spPage20.getSubSections().add(new PanelM0300D());

		return spPage20;
	}

	private static Mds3Page getSPPage21() {

		Mds3Page spPage21 = new Mds3Page();
		spPage21.getSubSections().add(new Mds3Header());
		spPage21.getSubSections().add(new PanelMHeader());
		spPage21.getSubSections().add(new PanelSubHeader());
		spPage21.getSubSections().add(new PanelM0300());
		spPage21.getSubSections().add(new PanelM0300E());
		spPage21.getSubSections().add(new PanelM0300F());
		spPage21.getSubSections().add(new PanelM0300G());
		spPage21.getSubSections().add(new PanelM0610());
		spPage21.getSubSections().add(new PanelM0610A());
		spPage21.getSubSections().add(new PanelM0610B());
		spPage21.getSubSections().add(new PanelM0610C());
		spPage21.getSubSections().add(new PanelM0700());
		spPage21.getSubSections().add(new PanelM0800());
		spPage21.getSubSections().add(new PanelM0800A());
		spPage21.getSubSections().add(new PanelM0800B());
		spPage21.getSubSections().add(new PanelM0800C());
		return spPage21;
	}

	private static Mds3Page getSPPage22() {

		Mds3Page spPage22 = new Mds3Page();
		spPage22.getSubSections().add(new Mds3Header());
		spPage22.getSubSections().add(new PanelMHeader());
		spPage22.getSubSections().add(new PanelM0900());
		spPage22.getSubSections().add(new PanelM0900A());
		spPage22.getSubSections().add(new PanelM0900B());
		spPage22.getSubSections().add(new PanelM0900C());
		spPage22.getSubSections().add(new PanelM0900D());
		spPage22.getSubSections().add(new PanelM1030());
		spPage22.getSubSections().add(new PanelM1040());
		spPage22.getSubSections().add(new PanelM1200());

		return spPage22;

	}

	private static Mds3Page getSPPage23() {

		Mds3Page spPage23 = new Mds3Page();
		spPage23.getSubSections().add(new PanelMDS3Page26());
		return spPage23;
	}

	private static Mds3Page getSPPage24() {

		Mds3Page spPage24 = new Mds3Page();
		spPage24.getSubSections().add(new Mds3Header());
		spPage24.getSubSections().add(new PanelOHeader());
		spPage24.getSubSections().add(new PanelO0100());
		spPage24.getSubSections().add(new PanelO0250());
		spPage24.getSubSections().add(new PanelO0300());
		return spPage24;
	}

	private static Mds3Page getSPPage25() {

		Mds3Page spPage25 = new Mds3Page();
		spPage25.getSubSections().add(new Mds3Header());
		spPage25.getSubSections().add(new PanelOHeader());
		spPage25.getSubSections().add(new PanelO0400A());
		spPage25.getSubSections().add(new PanelO0400B());
		spPage25.getSubSections().add(new PanelO0400C());
		spPage25.getSubSections().add(new PanelO0400D());
		return spPage25;
	}

	private static Mds3Page getSPPage26() {

		Mds3Page spPage26 = new Mds3Page();
		spPage26.getSubSections().add(new Mds3Header());
		spPage26.getSubSections().add(new PanelOHeader());
		spPage26.getSubSections().add(new PanelO0500());
		spPage26.getSubSections().add(new PanelO0600());
		spPage26.getSubSections().add(new PanelO0700());
		return spPage26;
	}

	private static Mds3Page getSPPage27() {

		Mds3Page spPage27 = new Mds3Page();
		spPage27.getSubSections().add(new Mds3Header());
		spPage27.getSubSections().add(new PanelPHeader());
		spPage27.getSubSections().add(new PanelP100());
		return spPage27;
	}

	private static Mds3Page getSPPage28() {

		Mds3Page spPage28 = new Mds3Page();
		spPage28.getSubSections().add(new Mds3Header());
		spPage28.getSubSections().add(new PanelQHeader());
		spPage28.getSubSections().add(new PanelQ0100());
		spPage28.getSubSections().add(new PanelQ0300());
		spPage28.getSubSections().add(new PanelQ0300());
		spPage28.getSubSections().add(new PanelQ0400());
		spPage28.getSubSections().add(new PanelQ0500());
		spPage28.getSubSections().add(new PanelQ0600());
		return spPage28;

	}

	private static Mds3Page getSPPage29() {

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

	private static Mds3Page getSPPage30() {

		Mds3Page spPage30 = new Mds3Page();
		spPage30.getSubSections().add(new Mds3Header());
		spPage30.getSubSections().add(new PanelXHeader());
		spPage30.getSubSections().add(new PanelX0600Continued());
		spPage30.getSubSections().add(new PanelX0600D());
		spPage30.getSubSections().add(new PanelX0600F());
		spPage30.getSubSections().add(new PanelX0700());
		spPage30.getSubSections().add(new PanelX0800());
		spPage30.getSubSections().add(new PanelX0900());
		spPage30.getSubSections().add(new PanelX1050());
		return spPage30;
	}

	private static Mds3Page getSPPage31() {

		Mds3Page spPage31 = new Mds3Page();
		spPage31.getSubSections().add(new Mds3Header());
		spPage31.getSubSections().add(new PanelXHeader());
		spPage31.getSubSections().add(new PanelX1100());
		return spPage31;
	}

	private static Mds3Page getSPPage32() {

		Mds3Page spPage32 = new Mds3Page();
		spPage32.getSubSections().add(new Mds3Header());
		spPage32.getSubSections().add(new PanelZHeader());
		spPage32.getSubSections().add(new PanelZ0100());
		spPage32.getSubSections().add(new PanelZ0150());
		spPage32.getSubSections().add(new PanelZ0300());
		return spPage32;
	}

	private static Mds3Page getSPPage33() {

		Mds3Page spPage33 = new Mds3Page();
		spPage33.getSubSections().add(new Mds3Header());
		spPage33.getSubSections().add(new PanelZHeader());
		spPage33.getSubSections().add(new PanelZ0400());
		spPage33.getSubSections().add(new PanelZ0500());
		return spPage33;
	}

}
