package medrex.client.mds3.general.itemsets;

import medrex.client.mds3.general.Mds3ItemSet;
import medrex.client.mds3.general.Mds3Page;
import medrex.client.mds3.ui.commons.Mds3Footer;
import medrex.client.mds3.ui.commons.Mds3Header;
import medrex.client.mds3.ui.itemSpecific.PanelNSSSHeader;
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
import medrex.client.mds3.ui.subSections.sectionA.PanelA1200;
import medrex.client.mds3.ui.subSections.sectionA.PanelA1300;
import medrex.client.mds3.ui.subSections.sectionA.PanelA1600;
import medrex.client.mds3.ui.subSections.sectionA.PanelA1700;
import medrex.client.mds3.ui.subSections.sectionA.PanelA2400;
import medrex.client.mds3.ui.subSections.sectionA.PanelAHeader;
import medrex.client.mds3.ui.subSections.sectionG.PanelG0110;
import medrex.client.mds3.ui.subSections.sectionG.PanelG0110A;
import medrex.client.mds3.ui.subSections.sectionG.PanelG0110B;
import medrex.client.mds3.ui.subSections.sectionG.PanelGHeader;
import medrex.client.mds3.ui.subSections.sectionH.PanelH0200;
import medrex.client.mds3.ui.subSections.sectionH.PanelH0500;
import medrex.client.mds3.ui.subSections.sectionH.PanelHHeader;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0400B;
import medrex.client.mds3.ui.subSections.sectionO.PanelO0400C;
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

public class Mds3ItemSetNSSS {
	public static Mds3ItemSet getNSSSItemSet() {
		// create empty nc item set
		Mds3ItemSet nsss1ItemSet = new Mds3ItemSet();
		nsss1ItemSet.getPages().put("1", getNSSSPage1());
		nsss1ItemSet.getPages().put("2", getNSSSPage2());
		nsss1ItemSet.getPages().put("3", getNSSSPage3());
		nsss1ItemSet.getPages().put("4", getNSSSPage4());
		nsss1ItemSet.getPages().put("5", getNSSSPage5());
		nsss1ItemSet.getPages().put("6", getNSSSPage6());
		nsss1ItemSet.getPages().put("7", getNSSSPage7());
		nsss1ItemSet.getPages().put("8", getNSSSPage8());
		nsss1ItemSet.getPages().put("9", getNSSSPage9());
		nsss1ItemSet.getPages().put("10", getNSSSPage10());
		nsss1ItemSet.getPages().put("11", getNSSSPage11());
		nsss1ItemSet.getPages().put("12", getNSSSPage12());

		return nsss1ItemSet;

	}

	private static Mds3Page getNSSSPage1() {
		// Createing page1.......
		Mds3Page nsssPage1 = new Mds3Page();
		nsssPage1.getSubSections().add(new Mds3Header());
		nsssPage1.getSubSections().add(new PanelNSSSHeader());
		nsssPage1.getSubSections().add(new PanelAHeader());
		nsssPage1.getSubSections().add(new PanelA0100());
		nsssPage1.getSubSections().add(new PanelA0200());
		nsssPage1.getSubSections().add(new PanelA0310A());
		nsssPage1.getSubSections().add(new PanelA0310B());
		nsssPage1.getSubSections().add(new PanelA0310C());
		nsssPage1.getSubSections().add(new PanelA0310D());
		nsssPage1.getSubSections().add(new PanelA0310E());
		nsssPage1.getSubSections().add(new PanelA0310F());
		nsssPage1.getSubSections().add(new Mds3Footer());
		return (nsssPage1);

	}

	private static Mds3Page getNSSSPage2() {
		// creating page 2
		Mds3Page nsssPage2 = new Mds3Page();
		nsssPage2.getSubSections().add(new Mds3Header());
		nsssPage2.getSubSections().add(new PanelAHeader());
		nsssPage2.getSubSections().add(new PanelA0410());
		nsssPage2.getSubSections().add(new PanelA0500());
		nsssPage2.getSubSections().add(new PanelA0600());
		nsssPage2.getSubSections().add(new PanelA0700());
		nsssPage2.getSubSections().add(new PanelA0800());
		nsssPage2.getSubSections().add(new PanelA0900());
		nsssPage2.getSubSections().add(new PanelA1000());
		nsssPage2.getSubSections().add(new Mds3Footer());
		return nsssPage2;
	}

	private static Mds3Page getNSSSPage3() {
		// creating page 3
		Mds3Page nsssPage3 = new Mds3Page();
		nsssPage3.getSubSections().add(new Mds3Header());
		nsssPage3.getSubSections().add(new PanelAHeader());
		nsssPage3.getSubSections().add(new PanelA1200());
		nsssPage3.getSubSections().add(new PanelA1300());
		nsssPage3.getSubSections().add(new PanelA1600());
		nsssPage3.getSubSections().add(new PanelA1700());
		nsssPage3.getSubSections().add(new Mds3Footer());

		return nsssPage3;
	}

	private static Mds3Page getNSSSPage4() {
		// creating page 4
		Mds3Page nsssPage4 = new Mds3Page();
		nsssPage4.getSubSections().add(new Mds3Header());
		nsssPage4.getSubSections().add(new PanelAHeader());
		nsssPage4.getSubSections().add(new PanelA2400());
		nsssPage4.getSubSections().add(new PanelGHeader());
		nsssPage4.getSubSections().add(new PanelG0110());
		nsssPage4.getSubSections().add(new PanelG0110A());
		nsssPage4.getSubSections().add(new PanelG0110B());
		nsssPage4.getSubSections().add(new Mds3Footer());
		return nsssPage4;
	}

	private static Mds3Page getNSSSPage5() {
		// creating page 5
		Mds3Page nsssPage5 = new Mds3Page();
		nsssPage5.getSubSections().add(new Mds3Header());
		nsssPage5.getSubSections().add(new PanelHHeader());
		nsssPage5.getSubSections().add(new PanelH0200());
		nsssPage5.getSubSections().add(new PanelH0500());
		nsssPage5.getSubSections().add(new Mds3Footer());
		return nsssPage5;
	}

	private static Mds3Page getNSSSPage6() {
		// creating page 6
		Mds3Page nsssPage6 = new Mds3Page();
		nsssPage6.getSubSections().add(new Mds3Header());
		nsssPage6.getSubSections().add(new PanelOHeader());
		nsssPage6.getSubSections().add(new PanelO0400B());
		nsssPage6.getSubSections().add(new PanelO0400C());
		nsssPage6.getSubSections().add(new Mds3Footer());
		return nsssPage6;
	}

	private static Mds3Page getNSSSPage7() {
		// creating page 7
		Mds3Page nsssPage7 = new Mds3Page();
		nsssPage7.getSubSections().add(new Mds3Header());
		nsssPage7.getSubSections().add(new PanelOHeader());
		nsssPage7.getSubSections().add(new PanelO0500());
		nsssPage7.getSubSections().add(new PanelQHeader());
		nsssPage7.getSubSections().add(new PanelQ0100());
		nsssPage7.getSubSections().add(new Mds3Footer());
		return nsssPage7;
	}

	private static Mds3Page getNSSSPage8() {

		Mds3Page nsssPage8 = new Mds3Page();
		nsssPage8.getSubSections().add(new Mds3Header());
		nsssPage8.getSubSections().add(new PanelXHeader());
		nsssPage8.getSubSections().add(new PanelX0100());
		nsssPage8.getSubSections().add(new PanelX0150());
		nsssPage8.getSubSections().add(new PanelX0200());
		nsssPage8.getSubSections().add(new PanelX0300());
		nsssPage8.getSubSections().add(new PanelX0400());
		nsssPage8.getSubSections().add(new PanelX0500());
		nsssPage8.getSubSections().add(new PanelX0600());
		nsssPage8.getSubSections().add(new PanelX0600A());
		nsssPage8.getSubSections().add(new PanelX0600B());
		nsssPage8.getSubSections().add(new PanelX0600C());
		nsssPage8.getSubSections().add(new Mds3Footer());
		return nsssPage8;
	}

	private static Mds3Page getNSSSPage9() {

		Mds3Page nsssPage9 = new Mds3Page();
		nsssPage9.getSubSections().add(new Mds3Header());
		nsssPage9.getSubSections().add(new PanelXHeader());
		nsssPage9.getSubSections().add(new PanelX0600Continued());
		nsssPage9.getSubSections().add(new PanelX0600D());
		nsssPage9.getSubSections().add(new PanelX0600F());
		nsssPage9.getSubSections().add(new PanelX0700());
		nsssPage9.getSubSections().add(new PanelX0800());
		nsssPage9.getSubSections().add(new PanelX0900());
		nsssPage9.getSubSections().add(new PanelX1050());
		nsssPage9.getSubSections().add(new Mds3Footer());
		return nsssPage9;
	}

	private static Mds3Page getNSSSPage10() {

		Mds3Page nsssPage10 = new Mds3Page();
		nsssPage10.getSubSections().add(new Mds3Header());
		nsssPage10.getSubSections().add(new PanelXHeader());
		nsssPage10.getSubSections().add(new PanelX1100());
		nsssPage10.getSubSections().add(new Mds3Footer());
		return nsssPage10;
	}

	private static Mds3Page getNSSSPage11() {

		Mds3Page nsssPage11 = new Mds3Page();
		nsssPage11.getSubSections().add(new Mds3Header());
		nsssPage11.getSubSections().add(new PanelZHeader());
		nsssPage11.getSubSections().add(new PanelZ0100());
		nsssPage11.getSubSections().add(new PanelZ0150());
		nsssPage11.getSubSections().add(new PanelZ0300());
		nsssPage11.getSubSections().add(new Mds3Footer());
		return nsssPage11;
	}

	private static Mds3Page getNSSSPage12() {

		Mds3Page nsssPage12 = new Mds3Page();
		nsssPage12.getSubSections().add(new Mds3Header());
		nsssPage12.getSubSections().add(new PanelZHeader());
		nsssPage12.getSubSections().add(new PanelZ0400());
		nsssPage12.getSubSections().add(new PanelZ0500());
		nsssPage12.getSubSections().add(new Mds3Footer());
		return nsssPage12;
	}

}
