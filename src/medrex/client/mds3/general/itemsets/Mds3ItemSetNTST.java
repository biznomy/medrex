package medrex.client.mds3.general.itemsets;

import medrex.client.mds3.general.Mds3ItemSet;
import medrex.client.mds3.general.Mds3Page;
import medrex.client.mds3.ui.commons.Mds3Footer;
import medrex.client.mds3.ui.commons.Mds3Header;
import medrex.client.mds3.ui.itemSpecific.PanelNTSTheader;
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
import medrex.client.mds3.ui.subSections.sectionA.PanelA1800;
import medrex.client.mds3.ui.subSections.sectionA.PanelA2000;
import medrex.client.mds3.ui.subSections.sectionA.PanelA2100;
import medrex.client.mds3.ui.subSections.sectionA.PanelA2400;
import medrex.client.mds3.ui.subSections.sectionA.PanelAHeader;
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
import medrex.client.mds3.ui.subSections.sectionZ.PanelZHeader;

public class Mds3ItemSetNTST {

	public static Mds3ItemSet getNTSTItemSet() {
		// create empty NT/ST item set
		Mds3ItemSet ntStItemSet = new Mds3ItemSet();
		ntStItemSet.getPages().put("1", getNtStPage1());
		ntStItemSet.getPages().put("2", getNtStPage2());
		ntStItemSet.getPages().put("3", getNtStPage3());
		ntStItemSet.getPages().put("4", getNTSTPage4());
		ntStItemSet.getPages().put("5", getNTSTPage5());
		ntStItemSet.getPages().put("6", getNTSTPage6());
		ntStItemSet.getPages().put("7", getNTSTPage7());
		ntStItemSet.getPages().put("8", getNTSTPage8());
		return ntStItemSet;

	}

	private static Mds3Page getNtStPage1() {
		// Createing page1.......
		Mds3Page ntStPage1 = new Mds3Page();
		ntStPage1.getSubSections().add(new Mds3Header());
		ntStPage1.getSubSections().add(new PanelNTSTheader());
		ntStPage1.getSubSections().add(new PanelAHeader());
		ntStPage1.getSubSections().add(new PanelA0100());
		ntStPage1.getSubSections().add(new PanelA0200());
		ntStPage1.getSubSections().add(new PanelA0310A());
		ntStPage1.getSubSections().add(new PanelA0310B());
		ntStPage1.getSubSections().add(new PanelA0310C());
		ntStPage1.getSubSections().add(new PanelA0310D());
		ntStPage1.getSubSections().add(new PanelA0310E());
		ntStPage1.getSubSections().add(new PanelA0310F());
		ntStPage1.setSubSectionFooter(new Mds3Footer());
		return (ntStPage1);

	}

	private static Mds3Page getNtStPage2() {
		// creating page 2
		Mds3Page ntStPage2 = new Mds3Page();
		ntStPage2.getSubSections().add(new Mds3Header());
		ntStPage2.getSubSections().add(new PanelAHeader());
		ntStPage2.getSubSections().add(new PanelA0410());
		ntStPage2.getSubSections().add(new PanelA0500());
		ntStPage2.getSubSections().add(new PanelA0600());
		ntStPage2.getSubSections().add(new PanelA0700());
		ntStPage2.getSubSections().add(new PanelA0800());
		ntStPage2.getSubSections().add(new PanelA0900());
		ntStPage2.getSubSections().add(new PanelA1000());
		ntStPage2.getSubSections().add(new PanelA1200());
		ntStPage2.getSubSections().add(new Mds3Footer());
		return ntStPage2;
	}

	private static Mds3Page getNtStPage3() {

		// creating page 3
		Mds3Page ntStPage3 = new Mds3Page();
		ntStPage3.getSubSections().add(new Mds3Header());
		ntStPage3.getSubSections().add(new PanelAHeader());
		ntStPage3.getSubSections().add(new PanelA1300());
		ntStPage3.getSubSections().add(new PanelA1600());
		ntStPage3.getSubSections().add(new PanelA1700());
		ntStPage3.getSubSections().add(new PanelA1800());
		ntStPage3.getSubSections().add(new PanelA2000());
		ntStPage3.getSubSections().add(new PanelA2100());
		ntStPage3.getSubSections().add(new Mds3Footer());

		return ntStPage3;
	}

	private static Mds3Page getNTSTPage4() {
		// creating page 4
		Mds3Page ntstPage4 = new Mds3Page();
		ntstPage4.getSubSections().add(new Mds3Header());
		ntstPage4.getSubSections().add(new PanelAHeader());
		ntstPage4.getSubSections().add(new PanelA2400());
		ntstPage4.getSubSections().add(new Mds3Footer());
		return ntstPage4;
	}

	private static Mds3Page getNTSTPage5() {
		Mds3Page ntstPage5 = new Mds3Page();
		ntstPage5.getSubSections().add(new Mds3Header());
		ntstPage5.getSubSections().add(new PanelXHeader());
		ntstPage5.getSubSections().add(new PanelX0100());
		ntstPage5.getSubSections().add(new PanelX0150());
		ntstPage5.getSubSections().add(new PanelX0200());
		ntstPage5.getSubSections().add(new PanelX0300());
		ntstPage5.getSubSections().add(new PanelX0400());
		ntstPage5.getSubSections().add(new PanelX0500());
		ntstPage5.getSubSections().add(new PanelX0600());
		ntstPage5.getSubSections().add(new PanelX0600A());
		ntstPage5.getSubSections().add(new PanelX0600B());
		ntstPage5.getSubSections().add(new PanelX0600C());
		ntstPage5.getSubSections().add(new Mds3Footer());
		return ntstPage5;
	}

	private static Mds3Page getNTSTPage6() {
		Mds3Page ntstPage6 = new Mds3Page();
		ntstPage6.getSubSections().add(new Mds3Header());
		ntstPage6.getSubSections().add(new PanelXHeader());
		ntstPage6.getSubSections().add(new PanelX0600Continued());
		ntstPage6.getSubSections().add(new PanelX0600D());
		ntstPage6.getSubSections().add(new PanelX0600F());
		ntstPage6.getSubSections().add(new PanelX0700());
		ntstPage6.getSubSections().add(new PanelX0800());
		ntstPage6.getSubSections().add(new PanelX0900());
		ntstPage6.getSubSections().add(new PanelX1050());
		ntstPage6.getSubSections().add(new Mds3Footer());
		return ntstPage6;
	}

	private static Mds3Page getNTSTPage7() {
		Mds3Page ntstPage7 = new Mds3Page();
		ntstPage7.getSubSections().add(new Mds3Header());
		ntstPage7.getSubSections().add(new PanelXHeader());
		ntstPage7.getSubSections().add(new PanelX1100());
		ntstPage7.getSubSections().add(new Mds3Footer());
		return ntstPage7;
	}

	private static Mds3Page getNTSTPage8() {
		Mds3Page ntstPage8 = new Mds3Page();
		ntstPage8.getSubSections().add(new Mds3Header());
		ntstPage8.getSubSections().add(new PanelZHeader());
		ntstPage8.getSubSections().add(new PanelZ0400());
		ntstPage8.getSubSections().add(new Mds3Footer());
		return ntstPage8;
	}

}
