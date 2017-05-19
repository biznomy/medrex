package medrex.client.mds3.general.itemsets;

import medrex.client.mds3.general.Mds3ItemSet;
import medrex.client.mds3.general.Mds3Page;
import medrex.client.mds3.ui.commons.Mds3Footer;
import medrex.client.mds3.ui.commons.Mds3Header;
import medrex.client.mds3.ui.fullPages.PanelMDS3Page17;
import medrex.client.mds3.ui.fullPages.PanelMDS3Page18;
import medrex.client.mds3.ui.itemSpecific.PanelNODHeader;
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

public class Mds3ItemSetNOD {

	public static Mds3ItemSet getNODItemSet() {
		// create empty ND item set
		Mds3ItemSet nodItemSet = new Mds3ItemSet();
		nodItemSet.getPages().put("1", getNODPage1());
		nodItemSet.getPages().put("2", getNODPage2());
		nodItemSet.getPages().put("3", getNODPage3());
		nodItemSet.getPages().put("4", getNODPage4());
		nodItemSet.getPages().put("5", getNODPage5());
		nodItemSet.getPages().put("6", getNODPage6());
		nodItemSet.getPages().put("7", getNODPage7());
		nodItemSet.getPages().put("8", getNODPage8());
		nodItemSet.getPages().put("9", getNODPage9());
		nodItemSet.getPages().put("10", getNODPage10());
		nodItemSet.getPages().put("11", getNODPage11());
		nodItemSet.getPages().put("12", getNODPage12());
		nodItemSet.getPages().put("13", getNODPage13());
		nodItemSet.getPages().put("14", getNODPage14());
		nodItemSet.getPages().put("15", getNODPage15());
		nodItemSet.getPages().put("16", getNODPage16());
		nodItemSet.getPages().put("17", getNODPage17());
		nodItemSet.getPages().put("18", getNODPage18());
		nodItemSet.getPages().put("19", getNODPage19());
		nodItemSet.getPages().put("20", getNODPage20());
		nodItemSet.getPages().put("21", getNODPage21());
		nodItemSet.getPages().put("22", getNODPage22());
		nodItemSet.getPages().put("23", getNODPage23());
		nodItemSet.getPages().put("24", getNODPage24());
		nodItemSet.getPages().put("25", getNODPage25());
		nodItemSet.getPages().put("26", getNODPage26());
		nodItemSet.getPages().put("27", getNODPage27());
		nodItemSet.getPages().put("28", getNODPage28());
		nodItemSet.getPages().put("29", getNODPage29());
		nodItemSet.getPages().put("30", getNODPage30());
		nodItemSet.getPages().put("31", getNODPage31());
		nodItemSet.getPages().put("31", getNODPage31());
		nodItemSet.getPages().put("31", getNODPage32());

		return nodItemSet;
	}

	private static Mds3Page getNODPage1() {
		// Createing page1.......
		Mds3Page nodPage1 = new Mds3Page();
		nodPage1.getSubSections().add(new Mds3Header());
		nodPage1.getSubSections().add(new PanelNODHeader());
		nodPage1.getSubSections().add(new PanelAHeader());
		nodPage1.getSubSections().add(new PanelA0100());
		nodPage1.getSubSections().add(new PanelA0200());
		// nodPage1.getSubSections().add(new PanelA0310());
		nodPage1.getSubSections().add(new PanelA0310A());
		nodPage1.getSubSections().add(new PanelA0310B());
		nodPage1.getSubSections().add(new PanelA0310C());
		nodPage1.getSubSections().add(new PanelA0310D());
		nodPage1.getSubSections().add(new PanelA0310E());
		nodPage1.getSubSections().add(new PanelA0310F());
		nodPage1.setSubSectionFooter(new Mds3Footer());
		return (nodPage1);
	}

	private static Mds3Page getNODPage2() {
		// creating page 2
		Mds3Page nodPage2 = new Mds3Page();
		nodPage2.getSubSections().add(new Mds3Header());
		nodPage2.getSubSections().add(new PanelAHeader());
		nodPage2.getSubSections().add(new PanelA0410());
		nodPage2.getSubSections().add(new PanelA0500());
		nodPage2.getSubSections().add(new PanelA0600());
		nodPage2.getSubSections().add(new PanelA0700());
		nodPage2.getSubSections().add(new PanelA0800());
		nodPage2.getSubSections().add(new PanelA0900());
		nodPage2.getSubSections().add(new PanelA1000());
		nodPage2.getSubSections().add(new PanelA1100());
		nodPage2.getSubSections().add(new Mds3Footer());
		return nodPage2;
	}

	private static Mds3Page getNODPage3() {
		// creating page 3
		Mds3Page nodPage3 = new Mds3Page();
		nodPage3.getSubSections().add(new Mds3Header());
		nodPage3.getSubSections().add(new PanelAHeader());
		nodPage3.getSubSections().add(new PanelA1200());
		nodPage3.getSubSections().add(new PanelA1300());
		nodPage3.getSubSections().add(new PanelA1500());
		nodPage3.getSubSections().add(new PanelA1550());
		nodPage3.getSubSections().add(new PanelA1600());
		nodPage3.getSubSections().add(new PanelA1700());
		nodPage3.getSubSections().add(new Mds3Footer());

		return nodPage3;
	}

	private static Mds3Page getNODPage4() {
		// creating page 4
		Mds3Page nodPage4 = new Mds3Page();
		nodPage4.getSubSections().add(new Mds3Header());
		nodPage4.getSubSections().add(new PanelAHeader());
		nodPage4.getSubSections().add(new PanelA1800());
		nodPage4.getSubSections().add(new PanelA2000());
		nodPage4.getSubSections().add(new PanelA2100());

		nodPage4.getSubSections().add(new PanelA2300());
		nodPage4.getSubSections().add(new PanelA2400());
		nodPage4.getSubSections().add(new Mds3Footer());
		return nodPage4;
	}

	private static Mds3Page getNODPage5() {
		// creating page 5
		Mds3Page nodPage5 = new Mds3Page();
		nodPage5.getSubSections().add(new Mds3Header());
		nodPage5.getSubSections().add(new PanelSubHeader());
		nodPage5.getSubSections().add(new PanelBHeader());
		nodPage5.getSubSections().add(new PanelB0100());
		nodPage5.getSubSections().add(new PanelB0200());
		nodPage5.getSubSections().add(new PanelB0300());
		nodPage5.getSubSections().add(new PanelB0600());
		nodPage5.getSubSections().add(new PanelB0700());
		nodPage5.getSubSections().add(new PanelB0800());
		nodPage5.getSubSections().add(new PanelB1000());
		nodPage5.getSubSections().add(new PanelB1200());
		nodPage5.getSubSections().add(new Mds3Footer());
		return nodPage5;

	}

	private static Mds3Page getNODPage6() {
		// creating page 6
		Mds3Page nodPage6 = new Mds3Page();
		nodPage6.getSubSections().add(new Mds3Header());
		nodPage6.getSubSections().add(new PanelCHeader());
		nodPage6.getSubSections().add(new PanelC0100());
		nodPage6.getSubSections().add(new PanelC0200());
		nodPage6.getSubSections().add(new PanelC0300());
		nodPage6.getSubSections().add(new PanelC0300A());
		nodPage6.getSubSections().add(new PanelC0300B());
		nodPage6.getSubSections().add(new PanelC0300C());
		nodPage6.getSubSections().add(new PanelC0400());
		nodPage6.getSubSections().add(new PanelC0400A());
		nodPage6.getSubSections().add(new PanelC0400B());
		nodPage6.getSubSections().add(new PanelC0400C());
		nodPage6.getSubSections().add(new PanelC0500());
		nodPage6.getSubSections().add(new Mds3Footer());
		return nodPage6;

	}

	private static Mds3Page getNODPage7() {
		// creating page 7
		Mds3Page nodPage7 = new Mds3Page();
		nodPage7.getSubSections().add(new Mds3Header());
		nodPage7.getSubSections().add(new PanelCHeader());
		nodPage7.getSubSections().add(new PanelC0600());
		nodPage7.getSubSections().add(new PanelC0700());
		nodPage7.getSubSections().add(new PanelC0800());
		nodPage7.getSubSections().add(new PanelC0900());
		nodPage7.getSubSections().add(new PanelC1000());
		nodPage7.getSubSections().add(new PanelC1300());
		nodPage7.getSubSections().add(new PanelC1600());
		nodPage7.getSubSections().add(new Mds3Footer());
		return nodPage7;
	}

	private static Mds3Page getNODPage8() {
		Mds3Page nodPage8 = new Mds3Page();
		nodPage8.getSubSections().add(new Mds3Header());
		nodPage8.getSubSections().add(new PanelDHeader());
		nodPage8.getSubSections().add(new PanelD0100());
		nodPage8.getSubSections().add(new PanelD0200());
		nodPage8.getSubSections().add(new PanelD0300());
		nodPage8.getSubSections().add(new PanelD0350());
		nodPage8.getSubSections().add(new Mds3Footer());
		return nodPage8;

	}

	private static Mds3Page getNODPage9() {
		Mds3Page nodPage9 = new Mds3Page();
		nodPage9.getSubSections().add(new Mds3Header());
		nodPage9.getSubSections().add(new PanelDHeader());
		nodPage9.getSubSections().add(new PanelD0500());
		nodPage9.getSubSections().add(new PanelD0600());
		nodPage9.getSubSections().add(new PanelD0650());

		return nodPage9;
	}

	private static Mds3Page getNODPage10() {
		Mds3Page nodPage10 = new Mds3Page();
		nodPage10.getSubSections().add(new Mds3Header());
		nodPage10.getSubSections().add(new PanelEHeader());
		nodPage10.getSubSections().add(new PanelE0100());
		nodPage10.getSubSections().add(new PanelE0200());
		nodPage10.getSubSections().add(new PanelE0800());
		nodPage10.getSubSections().add(new PanelE0900());
		nodPage10.getSubSections().add(new Mds3Footer());
		return nodPage10;
	}

	private static Mds3Page getNODPage11() {
		Mds3Page nodPage11 = new Mds3Page();
		nodPage11.getSubSections().add(new Mds3Header());
		nodPage11.getSubSections().add(new PanelGHeader());
		nodPage11.getSubSections().add(new PanelG0110());
		nodPage11.getSubSections().add(new PanelG0110A());
		nodPage11.getSubSections().add(new PanelG0110B());
		nodPage11.getSubSections().add(new Mds3Footer());
		return nodPage11;
	}

	private static Mds3Page getNODPage12() {
		Mds3Page nodPage12 = new Mds3Page();
		nodPage12.getSubSections().add(new Mds3Header());
		nodPage12.getSubSections().add(new PanelGHeader());
		nodPage12.getSubSections().add(new PanelG0120A());
		nodPage12.getSubSections().add(new PanelG0120B());
		nodPage12.getSubSections().add(new PanelG0300());
		nodPage12.getSubSections().add(new PanelG0400());
		nodPage12.getSubSections().add(new PanelG0600());
		nodPage12.getSubSections().add(new Mds3Footer());
		return nodPage12;
	}

	private static Mds3Page getNODPage13() {
		Mds3Page nodPage13 = new Mds3Page();
		nodPage13.getSubSections().add(new Mds3Header());
		nodPage13.getSubSections().add(new PanelHHeader());
		nodPage13.getSubSections().add(new PanelH0100());
		nodPage13.getSubSections().add(new PanelH0200());
		nodPage13.getSubSections().add(new PanelH0300());
		nodPage13.getSubSections().add(new PanelH0400());
		nodPage13.getSubSections().add(new PanelH0500());
		nodPage13.getSubSections().add(new Mds3Footer());
		return nodPage13;
	}

	private static Mds3Page getNODPage14() {
		Mds3Page nodPage14 = new Mds3Page();
		nodPage14.getSubSections().add(new PanelMDS3Page17());
		nodPage14.getSubSections().add(new Mds3Footer());
		return nodPage14;
	}

	private static Mds3Page getNODPage15() {
		Mds3Page nodPage15 = new Mds3Page();
		nodPage15.getSubSections().add(new PanelMDS3Page18());
		nodPage15.getSubSections().add(new Mds3Footer());
		return nodPage15;
	}

	private static Mds3Page getNODPage16() {
		Mds3Page nodPage16 = new Mds3Page();
		nodPage16.getSubSections().add(new Mds3Header());
		nodPage16.getSubSections().add(new PanelJHeader());
		nodPage16.getSubSections().add(new PanelJ0100());
		nodPage16.getSubSections().add(new PanelJ0200());
		nodPage16.getSubSections().add(new PanelJ0300());
		nodPage16.getSubSections().add(new PanelJ0400());
		nodPage16.getSubSections().add(new PanelJ0500());
		nodPage16.getSubSections().add(new PanelJ0600());
		nodPage16.getSubSections().add(new Mds3Footer());
		return nodPage16;
	}

	private static Mds3Page getNODPage17() {
		Mds3Page nodPage17 = new Mds3Page();
		nodPage17.getSubSections().add(new Mds3Header());
		nodPage17.getSubSections().add(new PanelJHeader());
		nodPage17.getSubSections().add(new PanelJ0700());
		nodPage17.getSubSections().add(new PanelJ0800());
		nodPage17.getSubSections().add(new PanelJ0850());
		nodPage17.getSubSections().add(new PanelJ1100());
		nodPage17.getSubSections().add(new PanelJ1400());
		nodPage17.getSubSections().add(new PanelJ1550());
		nodPage17.getSubSections().add(new Mds3Footer());
		return nodPage17;
	}

	private static Mds3Page getNODPage18() {
		Mds3Page nodPage18 = new Mds3Page();
		nodPage18.getSubSections().add(new PanelJHeader());
		nodPage18.getSubSections().add(new PanelJ1700());
		nodPage18.getSubSections().add(new PanelJ1800());
		nodPage18.getSubSections().add(new PanelJ1900());
		nodPage18.getSubSections().add(new Mds3Footer());
		return nodPage18;
	}

	private static Mds3Page getNODPage19() {
		Mds3Page nodPage19 = new Mds3Page();
		nodPage19.getSubSections().add(new PanelHeader());
		nodPage19.getSubSections().add(new PanelKHeader());
		nodPage19.getSubSections().add(new PanelK0200());
		nodPage19.getSubSections().add(new PanelK0300());
		nodPage19.getSubSections().add(new PanelK0500());
		nodPage19.getSubSections().add(new PanelK0700());
		nodPage19.getSubSections().add(new Mds3Footer());
		return nodPage19;
	}

	private static Mds3Page getNODPage20() {
		Mds3Page nodPage20 = new Mds3Page();
		nodPage20.getSubSections().add(new PanelHeader());
		nodPage20.getSubSections().add(new PanelSubHeader());
		nodPage20.getSubSections().add(new PanelM0100());
		nodPage20.getSubSections().add(new PanelM0150());
		nodPage20.getSubSections().add(new PanelM0210());
		nodPage20.getSubSections().add(new PanelM0300());
		nodPage20.getSubSections().add(new PanelM0300A());
		nodPage20.getSubSections().add(new PanelM0300B());
		nodPage20.getSubSections().add(new PanelM0300C());
		nodPage20.getSubSections().add(new PanelM0300D());
		nodPage20.getSubSections().add(new Mds3Footer());
		return nodPage20;
	}

	private static Mds3Page getNODPage21() {
		// creating page 21
		Mds3Page nodPage21 = new Mds3Page();
		nodPage21.getSubSections().add(new Mds3Header());
		nodPage21.getSubSections().add(new PanelMHeader());
		nodPage21.getSubSections().add(new PanelM0300ContinuedToNextPage());
		nodPage21.getSubSections().add(new PanelM0300E());
		nodPage21.getSubSections().add(new PanelM0300F());
		nodPage21.getSubSections().add(new PanelM0300G());
		nodPage21.getSubSections().add(new PanelM0610());
		nodPage21.getSubSections().add(new PanelM0610A());
		nodPage21.getSubSections().add(new PanelM0610B());
		nodPage21.getSubSections().add(new PanelM0610C());
		nodPage21.getSubSections().add(new PanelM0700());
		nodPage21.getSubSections().add(new PanelM0800());
		nodPage21.getSubSections().add(new PanelM0800A());
		nodPage21.getSubSections().add(new PanelM0800B());
		nodPage21.getSubSections().add(new PanelM0800C());

		return nodPage21;
	}

	private static Mds3Page getNODPage22() {
		// creating page 22
		Mds3Page nodPage22 = new Mds3Page();
		nodPage22.getSubSections().add(new Mds3Header());
		nodPage22.getSubSections().add(new PanelMHeader());
		nodPage22.getSubSections().add(new PanelM0900());
		nodPage22.getSubSections().add(new PanelM0900A());
		nodPage22.getSubSections().add(new PanelM0900B());
		nodPage22.getSubSections().add(new PanelM0900C());
		nodPage22.getSubSections().add(new PanelM0900D());
		nodPage22.getSubSections().add(new PanelM1030());
		nodPage22.getSubSections().add(new PanelM1040());
		nodPage22.getSubSections().add(new PanelM1200());
		return nodPage22;
	}

	private static Mds3Page getNODPage23() {
		// creating page 23
		Mds3Page nodPage23 = new Mds3Page();
		nodPage23.getSubSections().add(new Mds3Header());
		nodPage23.getSubSections().add(new PanelNHeader());
		nodPage23.getSubSections().add(new PanelN0300());
		nodPage23.getSubSections().add(new PanelM0900A());

		return nodPage23;
	}

	private static Mds3Page getNODPage24() {
		// creating page 24
		Mds3Page nodPage24 = new Mds3Page();
		nodPage24.getSubSections().add(new Mds3Header());
		nodPage24.getSubSections().add(new PanelOHeader());
		nodPage24.getSubSections().add(new PanelO0100());
		nodPage24.getSubSections().add(new PanelO0250());
		nodPage24.getSubSections().add(new PanelO0300());
		return nodPage24;
	}

	private static Mds3Page getNODPage25() {
		// creating page 25
		Mds3Page nodPage25 = new Mds3Page();
		nodPage25.getSubSections().add(new Mds3Header());
		nodPage25.getSubSections().add(new PanelOHeader());
		nodPage25.getSubSections().add(new PanelO0400A());
		nodPage25.getSubSections().add(new PanelO0400B());
		nodPage25.getSubSections().add(new PanelO0400C());
		nodPage25.getSubSections().add(new PanelO0400D());
		return nodPage25;
	}

	private static Mds3Page getNODPage26() {
		// creating page 26
		Mds3Page nodPage26 = new Mds3Page();
		nodPage26.getSubSections().add(new Mds3Header());
		nodPage26.getSubSections().add(new PanelOHeader());
		nodPage26.getSubSections().add(new PanelO0500());
		nodPage26.getSubSections().add(new PanelO0600());
		nodPage26.getSubSections().add(new PanelO0700());
		return nodPage26;
	}

	private static Mds3Page getNODPage27() {
		// creating page 27
		Mds3Page nodPage27 = new Mds3Page();
		nodPage27.getSubSections().add(new Mds3Header());
		nodPage27.getSubSections().add(new PanelPHeader());
		nodPage27.getSubSections().add(new PanelP100());
		nodPage27.getSubSections().add(new PanelQHeader());
		nodPage27.getSubSections().add(new PanelQ0100());
		nodPage27.getSubSections().add(new PanelQ0300());
		return nodPage27;
	}

	private static Mds3Page getNODPage28() {

		Mds3Page nodPage28 = new Mds3Page();
		nodPage28.getSubSections().add(new Mds3Header());
		nodPage28.getSubSections().add(new PanelXHeader());
		nodPage28.getSubSections().add(new PanelX0100());
		nodPage28.getSubSections().add(new PanelX0150());
		nodPage28.getSubSections().add(new PanelX0200());
		nodPage28.getSubSections().add(new PanelX0300());
		nodPage28.getSubSections().add(new PanelX0400());
		nodPage28.getSubSections().add(new PanelX0500());
		nodPage28.getSubSections().add(new PanelX0600());
		nodPage28.getSubSections().add(new PanelX0600A());
		nodPage28.getSubSections().add(new PanelX0600B());
		nodPage28.getSubSections().add(new PanelX0600C());
		return nodPage28;
	}

	private static Mds3Page getNODPage29() {

		Mds3Page nodPage29 = new Mds3Page();
		nodPage29.getSubSections().add(new Mds3Header());
		nodPage29.getSubSections().add(new PanelXHeader());
		nodPage29.getSubSections().add(new PanelX0600Continued());
		nodPage29.getSubSections().add(new PanelX0600D());
		nodPage29.getSubSections().add(new PanelX0600F());
		nodPage29.getSubSections().add(new PanelX0700());
		nodPage29.getSubSections().add(new PanelX0800());
		nodPage29.getSubSections().add(new PanelX0900());
		nodPage29.getSubSections().add(new PanelX1050());
		return nodPage29;
	}

	private static Mds3Page getNODPage30() {

		Mds3Page nodPage30 = new Mds3Page();
		nodPage30.getSubSections().add(new Mds3Header());
		nodPage30.getSubSections().add(new PanelXHeader());
		nodPage30.getSubSections().add(new PanelX1100());
		return nodPage30;
	}

	private static Mds3Page getNODPage31() {

		Mds3Page nodPage31 = new Mds3Page();
		nodPage31.getSubSections().add(new Mds3Header());
		nodPage31.getSubSections().add(new PanelZHeader());
		nodPage31.getSubSections().add(new PanelZ0100());
		nodPage31.getSubSections().add(new PanelZ0150());
		nodPage31.getSubSections().add(new PanelZ0300());
		return nodPage31;
	}

	private static Mds3Page getNODPage32() {

		Mds3Page nodPage31 = new Mds3Page();
		nodPage31.getSubSections().add(new Mds3Header());
		nodPage31.getSubSections().add(new PanelZHeader());
		nodPage31.getSubSections().add(new PanelZ0400());
		nodPage31.getSubSections().add(new PanelZ0500());
		return nodPage31;
	}

}
