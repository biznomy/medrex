package medrex.client.mds3.general.itemsets;

import medrex.client.mds3.general.Mds3ItemSet;
import medrex.client.mds3.general.Mds3Page;
import medrex.client.mds3.ui.commons.Mds3Footer;
import medrex.client.mds3.ui.commons.Mds3Header;
import medrex.client.mds3.ui.itemSpecific.PanelNOSOheader;
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
import medrex.client.mds3.ui.subSections.sectionB.PanelB0700;
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
import medrex.client.mds3.ui.subSections.sectionC.PanelC1000;
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
import medrex.client.mds3.ui.subSections.sectionG.PanelGHeader;
import medrex.client.mds3.ui.subSections.sectionH.PanelH0200;
import medrex.client.mds3.ui.subSections.sectionH.PanelH0500;
import medrex.client.mds3.ui.subSections.sectionH.PanelHHeader;
import medrex.client.mds3.ui.subSections.sectionI.PanelActiveDignosis;
import medrex.client.mds3.ui.subSections.sectionI.PanelI2000;
import medrex.client.mds3.ui.subSections.sectionI.PanelI2100;
import medrex.client.mds3.ui.subSections.sectionI.PanelI2900;
import medrex.client.mds3.ui.subSections.sectionI.PanelI4400;
import medrex.client.mds3.ui.subSections.sectionI.PanelI4900;
import medrex.client.mds3.ui.subSections.sectionI.PanelI5100;
import medrex.client.mds3.ui.subSections.sectionI.PanelI5200;
import medrex.client.mds3.ui.subSections.sectionI.PanelI5300;
import medrex.client.mds3.ui.subSections.sectionI.PanelI6200;
import medrex.client.mds3.ui.subSections.sectionI.PanelI6300;
import medrex.client.mds3.ui.subSections.sectionI.PanelIHeader;
import medrex.client.mds3.ui.subSections.sectionI.PanelInfections;
import medrex.client.mds3.ui.subSections.sectionI.PanelMetabolic;
import medrex.client.mds3.ui.subSections.sectionI.PanelNeurological;
import medrex.client.mds3.ui.subSections.sectionI.PanelPulmonary;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ1100;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJ1550;
import medrex.client.mds3.ui.subSections.sectionJ.PanelJHeader;
import medrex.client.mds3.ui.subSections.sectionK.PanelK0300;
import medrex.client.mds3.ui.subSections.sectionK.PanelK0500;
import medrex.client.mds3.ui.subSections.sectionK.PanelK0700;
import medrex.client.mds3.ui.subSections.sectionK.PanelKHeader;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300B;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300C;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300D;
import medrex.client.mds3.ui.subSections.sectionM.PanelM0300F;
import medrex.client.mds3.ui.subSections.sectionM.PanelM1030;
import medrex.client.mds3.ui.subSections.sectionM.PanelM1040;
import medrex.client.mds3.ui.subSections.sectionM.PanelM1200;
import medrex.client.mds3.ui.subSections.sectionM.PanelMHeader;
import medrex.client.mds3.ui.subSections.sectionN.PanelNHeader;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0100;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0400A;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0400B;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0400C;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0400D;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0500;
import medrex.client.mds3.ui.subSections.sectionO.PanelOHeader;
import medrex.client.mds3.ui.subSections.sectionQ.PanelQ0100;
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

public class Mds3ItemSetNOSO {

	public static Mds3ItemSet getNOSOItemSet() {
		// create empty nc item set
		Mds3ItemSet nosoItemSet = new Mds3ItemSet();
		nosoItemSet.getPages().put("1", getNoSoPage1());
		nosoItemSet.getPages().put("2", getNoSoPage2());
		nosoItemSet.getPages().put("3", getNoSoPage3());
		nosoItemSet.getPages().put("4", getNoSoPage4());
		nosoItemSet.getPages().put("5", getNoSoPage5());
		nosoItemSet.getPages().put("6", getNoSoPage6());
		nosoItemSet.getPages().put("7", getNoSoPage7());
		nosoItemSet.getPages().put("8", getNoSoPage8());
		nosoItemSet.getPages().put("9", getNoSoPage9());
		nosoItemSet.getPages().put("10", getNoSoPage10());
		nosoItemSet.getPages().put("11", getNoSoPage11());
		nosoItemSet.getPages().put("12", getNoSoPage12());
		nosoItemSet.getPages().put("13", getNoSoPage13());
		nosoItemSet.getPages().put("14", getNoSoPage14());
		nosoItemSet.getPages().put("15", getNoSoPage15());
		nosoItemSet.getPages().put("16", getNoSoPage16());
		nosoItemSet.getPages().put("17", getNoSoPage17());
		nosoItemSet.getPages().put("18", getNoSoPage18());
		nosoItemSet.getPages().put("19", getNoSoPage19());
		nosoItemSet.getPages().put("20", getNoSoPage20());

		return nosoItemSet;
	}

	private static Mds3Page getNoSoPage1() {
		// Creating page1.......
		Mds3Page nosoPage1 = new Mds3Page();
		nosoPage1.getSubSections().add(new Mds3Header());
		nosoPage1.getSubSections().add(new PanelNOSOheader());
		nosoPage1.getSubSections().add(new PanelAHeader());
		nosoPage1.getSubSections().add(new PanelA0100());
		nosoPage1.getSubSections().add(new PanelA0200());
		nosoPage1.getSubSections().add(new PanelA0310A());
		nosoPage1.getSubSections().add(new PanelA0310B());
		nosoPage1.getSubSections().add(new PanelA0310C());
		nosoPage1.getSubSections().add(new PanelA0310D());
		nosoPage1.getSubSections().add(new PanelA0310E());
		nosoPage1.getSubSections().add(new PanelA0310F());
		nosoPage1.getSubSections().add(new Mds3Footer());
		return (nosoPage1);

	}

	private static Mds3Page getNoSoPage2() {
		// creating page 2
		Mds3Page nosoPage2 = new Mds3Page();
		nosoPage2.getSubSections().add(new Mds3Header());
		nosoPage2.getSubSections().add(new PanelAHeader());
		nosoPage2.getSubSections().add(new PanelA0410());
		nosoPage2.getSubSections().add(new PanelA0500());
		nosoPage2.getSubSections().add(new PanelA0600());
		nosoPage2.getSubSections().add(new PanelA0700());
		nosoPage2.getSubSections().add(new PanelA0800());
		nosoPage2.getSubSections().add(new PanelA0900());
		nosoPage2.getSubSections().add(new PanelA1000());
		nosoPage2.getSubSections().add(new PanelA1100());
		nosoPage2.getSubSections().add(new Mds3Footer());
		return nosoPage2;
	}

	private static Mds3Page getNoSoPage3() {
		// creating page 3
		Mds3Page nosoPage3 = new Mds3Page();
		nosoPage3.getSubSections().add(new Mds3Header());
		nosoPage3.getSubSections().add(new PanelAHeader());
		nosoPage3.getSubSections().add(new PanelA1200());
		nosoPage3.getSubSections().add(new PanelA1300());
		nosoPage3.getSubSections().add(new PanelA1600());
		nosoPage3.getSubSections().add(new PanelA1700());
		nosoPage3.getSubSections().add(new PanelA1800());
		nosoPage3.getSubSections().add(new PanelA2000());
		nosoPage3.getSubSections().add(new PanelA2100());
		nosoPage3.getSubSections().add(new Mds3Footer());

		return nosoPage3;
	}

	private static Mds3Page getNoSoPage4() {
		// creating page 4
		Mds3Page nosoPage4 = new Mds3Page();
		nosoPage4.getSubSections().add(new Mds3Header());
		nosoPage4.getSubSections().add(new PanelAHeader());
		nosoPage4.getSubSections().add(new PanelA2300());
		nosoPage4.getSubSections().add(new PanelA2400());
		nosoPage4.getSubSections().add(new PanelSubHeader());
		nosoPage4.getSubSections().add(new PanelBHeader());
		nosoPage4.getSubSections().add(new PanelB0100());
		nosoPage4.getSubSections().add(new PanelB0700());
		nosoPage4.getSubSections().add(new Mds3Footer());
		return nosoPage4;
	}

	private static Mds3Page getNoSoPage5() {
		// creating page 5
		Mds3Page nosoPage5 = new Mds3Page();
		nosoPage5.getSubSections().add(new Mds3Header());
		nosoPage5.getSubSections().add(new PanelCHeader());
		nosoPage5.getSubSections().add(new PanelC0200());
		nosoPage5.getSubSections().add(new PanelC0300());
		nosoPage5.getSubSections().add(new PanelC0300A());
		nosoPage5.getSubSections().add(new PanelC0300B());
		nosoPage5.getSubSections().add(new PanelC0300C());
		nosoPage5.getSubSections().add(new PanelC0400());
		nosoPage5.getSubSections().add(new PanelC0400A());
		nosoPage5.getSubSections().add(new PanelC0400B());
		nosoPage5.getSubSections().add(new PanelC0400C());
		nosoPage5.getSubSections().add(new PanelC0500());
		nosoPage5.getSubSections().add(new Mds3Footer());

		return nosoPage5;

	}

	private static Mds3Page getNoSoPage6() {
		// creating page 6
		Mds3Page nosoPage6 = new Mds3Page();
		nosoPage6.getSubSections().add(new Mds3Header());
		nosoPage6.getSubSections().add(new PanelCHeader());
		nosoPage6.getSubSections().add(new PanelC0600());
		nosoPage6.getSubSections().add(new PanelC0700());
		nosoPage6.getSubSections().add(new PanelC1000());
		nosoPage6.getSubSections().add(new Mds3Footer());
		return nosoPage6;
	}

	private static Mds3Page getNoSoPage7() {
		// creating page 7
		Mds3Page nosoPage7 = new Mds3Page();
		nosoPage7.getSubSections().add(new Mds3Header());
		nosoPage7.getSubSections().add(new PanelDHeader());
		nosoPage7.getSubSections().add(new PanelD0100());
		nosoPage7.getSubSections().add(new PanelD0200());
		nosoPage7.getSubSections().add(new PanelD0300());
		nosoPage7.getSubSections().add(new PanelD0350());
		nosoPage7.getSubSections().add(new Mds3Footer());
		return nosoPage7;
	}

	private static Mds3Page getNoSoPage8() {
		// creating page 8
		Mds3Page nosoPage8 = new Mds3Page();
		nosoPage8.getSubSections().add(new Mds3Header());
		nosoPage8.getSubSections().add(new PanelDHeader());
		nosoPage8.getSubSections().add(new PanelD0500());
		nosoPage8.getSubSections().add(new PanelD0600());
		nosoPage8.getSubSections().add(new PanelD0650());
		nosoPage8.getSubSections().add(new Mds3Footer());
		return nosoPage8;
	}

	private static Mds3Page getNoSoPage9() {
		// creating page 9
		Mds3Page nosoPage9 = new Mds3Page();
		nosoPage9.getSubSections().add(new Mds3Header());
		nosoPage9.getSubSections().add(new PanelEHeader());
		nosoPage9.getSubSections().add(new PanelE0100());
		nosoPage9.getSubSections().add(new PanelE0200());
		nosoPage9.getSubSections().add(new PanelE0800());
		nosoPage9.getSubSections().add(new PanelE0900());
		nosoPage9.getSubSections().add(new Mds3Footer());
		return nosoPage9;

	}

	private static Mds3Page getNoSoPage10() {
		// creating page 10
		Mds3Page nosoPage10 = new Mds3Page();
		nosoPage10.getSubSections().add(new Mds3Header());
		nosoPage10.getSubSections().add(new PanelGHeader());
		nosoPage10.getSubSections().add(new PanelG0110());
		nosoPage10.getSubSections().add(new PanelG0110A());
		nosoPage10.getSubSections().add(new PanelG0110B());
		nosoPage10.getSubSections().add(new PanelHHeader());
		nosoPage10.getSubSections().add(new PanelH0200());
		nosoPage10.getSubSections().add(new PanelH0500());
		nosoPage10.getSubSections().add(new Mds3Footer());
		return nosoPage10;

	}

	private static Mds3Page getNoSoPage11() {
		// creating page 11
		Mds3Page nosoPage11 = new Mds3Page();
		nosoPage11.getSubSections().add(new Mds3Header());
		nosoPage11.getSubSections().add(new PanelIHeader());
		nosoPage11.getSubSections().add(new PanelActiveDignosis());
		nosoPage11.getSubSections().add(new PanelInfections());
		nosoPage11.getSubSections().add(new PanelI2000());
		nosoPage11.getSubSections().add(new PanelI2100());
		nosoPage11.getSubSections().add(new PanelMetabolic());
		nosoPage11.getSubSections().add(new PanelI2900());
		nosoPage11.getSubSections().add(new PanelNeurological());
		nosoPage11.getSubSections().add(new PanelI4400());
		nosoPage11.getSubSections().add(new PanelI4900());
		nosoPage11.getSubSections().add(new PanelI5100());
		nosoPage11.getSubSections().add(new PanelI5200());
		nosoPage11.getSubSections().add(new PanelI5300());
		nosoPage11.getSubSections().add(new PanelPulmonary());
		nosoPage11.getSubSections().add(new PanelI6200());
		nosoPage11.getSubSections().add(new PanelI6300());
		nosoPage11.getSubSections().add(new PanelJHeader());
		nosoPage11.getSubSections().add(new PanelJ1100());
		nosoPage11.getSubSections().add(new PanelJ1550());
		nosoPage11.getSubSections().add(new PanelKHeader());
		nosoPage11.getSubSections().add(new PanelK0300());
		nosoPage11.getSubSections().add(new PanelK0500());
		nosoPage11.getSubSections().add(new PanelK0700());
		nosoPage11.getSubSections().add(new Mds3Footer());
		return nosoPage11;

	}

	private static Mds3Page getNoSoPage12() {
		Mds3Page nosoPage12 = new Mds3Page();
		nosoPage12.getSubSections().add(new Mds3Header());
		nosoPage12.getSubSections().add(new PanelHeader());
		nosoPage12.getSubSections().add(new PanelSubHeader());
		nosoPage12.getSubSections().add(new PanelM0300());
		nosoPage12.getSubSections().add(new PanelM0300B());
		nosoPage12.getSubSections().add(new PanelM0300C());
		nosoPage12.getSubSections().add(new PanelM0300D());
		nosoPage12.getSubSections().add(new PanelM0300F());
		nosoPage12.getSubSections().add(new PanelM1030());
		nosoPage12.getSubSections().add(new PanelM1040());
		nosoPage12.getSubSections().add(new Mds3Footer());
		return nosoPage12;
	}

	private static Mds3Page getNoSoPage13() {
		Mds3Page nosoPage13 = new Mds3Page();
		nosoPage13.getSubSections().add(new Mds3Header());
		nosoPage13.getSubSections().add(new PanelMHeader());
		nosoPage13.getSubSections().add(new PanelM1200());
		nosoPage13.getSubSections().add(new PanelNHeader());
		nosoPage13.getSubSections().add(new PanelOHeader());
		nosoPage13.getSubSections().add(new PanelO0100());
		nosoPage13.getSubSections().add(new Mds3Footer());
		return nosoPage13;
	}

	private static Mds3Page getNoSoPage14() {
		// creating page 14
		Mds3Page nosoPage14 = new Mds3Page();
		nosoPage14.getSubSections().add(new Mds3Header());
		nosoPage14.getSubSections().add(new PanelOHeader());
		nosoPage14.getSubSections().add(new PanelO0400A());
		nosoPage14.getSubSections().add(new PanelO0400B());
		nosoPage14.getSubSections().add(new PanelO0400C());
		nosoPage14.getSubSections().add(new Mds3Footer());
		return nosoPage14;
	}

	private static Mds3Page getNoSoPage15() {
		// creating page 26
		Mds3Page nosoPage15 = new Mds3Page();
		nosoPage15.getSubSections().add(new Mds3Header());
		nosoPage15.getSubSections().add(new PanelOHeader());
		nosoPage15.getSubSections().add(new PanelO0400D());
		nosoPage15.getSubSections().add(new PanelO0500());
		nosoPage15.getSubSections().add(new PanelQHeader());
		nosoPage15.getSubSections().add(new PanelQ0100());
		nosoPage15.getSubSections().add(new Mds3Footer());
		return nosoPage15;
	}

	private static Mds3Page getNoSoPage16() {

		Mds3Page nosoPage16 = new Mds3Page();
		nosoPage16.getSubSections().add(new Mds3Header());
		nosoPage16.getSubSections().add(new PanelXHeader());
		nosoPage16.getSubSections().add(new PanelX0100());
		nosoPage16.getSubSections().add(new PanelX0150());
		nosoPage16.getSubSections().add(new PanelX0200());
		nosoPage16.getSubSections().add(new PanelX0300());
		nosoPage16.getSubSections().add(new PanelX0400());
		nosoPage16.getSubSections().add(new PanelX0500());
		nosoPage16.getSubSections().add(new PanelX0600());
		nosoPage16.getSubSections().add(new PanelX0600A());
		nosoPage16.getSubSections().add(new PanelX0600B());
		nosoPage16.getSubSections().add(new PanelX0600C());
		nosoPage16.getSubSections().add(new Mds3Footer());
		return nosoPage16;
	}

	private static Mds3Page getNoSoPage17() {

		Mds3Page nosoPage17 = new Mds3Page();
		nosoPage17.getSubSections().add(new Mds3Header());
		nosoPage17.getSubSections().add(new PanelXHeader());
		nosoPage17.getSubSections().add(new PanelX0600Continued());
		nosoPage17.getSubSections().add(new PanelX0600D());
		nosoPage17.getSubSections().add(new PanelX0600F());
		nosoPage17.getSubSections().add(new PanelX0700());
		nosoPage17.getSubSections().add(new PanelX0800());
		nosoPage17.getSubSections().add(new PanelX0900());
		nosoPage17.getSubSections().add(new PanelX1050());
		nosoPage17.getSubSections().add(new Mds3Footer());
		return nosoPage17;
	}

	private static Mds3Page getNoSoPage18() {

		Mds3Page nosoPage18 = new Mds3Page();
		nosoPage18.getSubSections().add(new Mds3Header());
		nosoPage18.getSubSections().add(new PanelXHeader());
		nosoPage18.getSubSections().add(new PanelX1100());
		nosoPage18.getSubSections().add(new Mds3Footer());
		return nosoPage18;
	}

	private static Mds3Page getNoSoPage19() {

		Mds3Page nosoPage19 = new Mds3Page();
		nosoPage19.getSubSections().add(new Mds3Header());
		nosoPage19.getSubSections().add(new PanelZHeader());
		nosoPage19.getSubSections().add(new PanelZ0100());
		nosoPage19.getSubSections().add(new PanelZ0150());
		nosoPage19.getSubSections().add(new PanelZ0300());
		nosoPage19.getSubSections().add(new Mds3Footer());
		return nosoPage19;
	}

	private static Mds3Page getNoSoPage20() {

		Mds3Page nosoPage20 = new Mds3Page();
		nosoPage20.getSubSections().add(new Mds3Header());
		nosoPage20.getSubSections().add(new PanelZHeader());
		nosoPage20.getSubSections().add(new PanelZ0400());
		nosoPage20.getSubSections().add(new PanelZ0500());
		nosoPage20.getSubSections().add(new Mds3Footer());
		return nosoPage20;
	}
}
