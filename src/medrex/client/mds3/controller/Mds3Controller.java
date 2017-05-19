package medrex.client.mds3.controller;

import java.rmi.RemoteException;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.mds3.Mds3;
import medrex.commons.vo.mds3.SectionA.Mds3SectionA;
import medrex.commons.vo.mds3.SectionB.Mds3SectionB;
import medrex.commons.vo.mds3.SectionC.Mds3SectionC;
import medrex.commons.vo.mds3.SectionE.Mds3SectionE;
import medrex.commons.vo.mds3.SectionF.Mds3SectionF;
import medrex.commons.vo.mds3.SectionG.Mds3SectionG;
import medrex.commons.vo.mds3.SectionH.Mds3SectionH;
import medrex.commons.vo.mds3.SectionI.Mds3SectionI;
import medrex.commons.vo.mds3.SectionJ.Mds3SectionJ;
import medrex.commons.vo.mds3.sectionD.Mds3SectionD;
import medrex.commons.vo.mds3.sectionK.Mds3SectionK;
import medrex.commons.vo.mds3.sectionL.Mds3SectionL;
import medrex.commons.vo.mds3.sectionM.Mds3SectionM;
import medrex.commons.vo.mds3.sectionN.Mds3SectionN;
import medrex.commons.vo.mds3.sectionO.Mds3SectionO;
import medrex.commons.vo.mds3.sectionP.Mds3SectionP;
import medrex.commons.vo.mds3.sectionQ.Mds3SectionQ;
import medrex.commons.vo.mds3.sectionV.Mds3SectionV;
import medrex.commons.vo.mds3.sectionX.Mds3SectionX;
import medrex.commons.vo.mds3.sectionZ.Mds3SectionZ;

public class Mds3Controller {

	private static Mds3Controller controllerMDS = null;

	public static synchronized Mds3Controller getInstance() {

		// if obj is null create it , else just return it
		if (controllerMDS == null) {
			controllerMDS = new Mds3Controller();

		} // end if
		return (controllerMDS);
	}

	private Mds3Controller() {

	}

	private Mds3SectionA sectionA = new Mds3SectionA();
	private Mds3SectionB sectionB = new Mds3SectionB();
	private Mds3SectionC sectionC = new Mds3SectionC();
	private Mds3SectionD sectionD = new Mds3SectionD();
	private Mds3SectionE sectionE = new Mds3SectionE();
	private Mds3SectionF sectionF = new Mds3SectionF();
	private Mds3SectionG sectionG = new Mds3SectionG();
	private Mds3SectionH sectionH = new Mds3SectionH();
	private Mds3SectionI sectionI = new Mds3SectionI();
	private Mds3SectionJ sectionJ = new Mds3SectionJ();
	private Mds3SectionK sectionK = new Mds3SectionK();
	private Mds3SectionL sectionL = new Mds3SectionL();
	private Mds3SectionM sectionM = new Mds3SectionM();
	private Mds3SectionN sectionN = new Mds3SectionN();
	private Mds3SectionO sectionO = new Mds3SectionO();
	private Mds3SectionP sectionP = new Mds3SectionP();
	private Mds3SectionQ sectionQ = new Mds3SectionQ();
	private Mds3SectionV sectionV = new Mds3SectionV();
	private Mds3SectionX sectionX = new Mds3SectionX();
	private Mds3SectionZ sectionZ = new Mds3SectionZ();

	public Object getSection(final Class typeOfObject) {
		if (typeOfObject == sectionA.getClass()) {
			return sectionA;
		}
		if (typeOfObject == sectionB.getClass()) {
			return sectionB;
		}
		if (typeOfObject == sectionC.getClass()) {
			return sectionC;
		}
		if (typeOfObject == sectionD.getClass()) {
			return sectionD;
		}
		if (typeOfObject == sectionE.getClass()) {
			return sectionE;
		}
		if (typeOfObject == sectionF.getClass()) {
			return sectionF;
		}
		if (typeOfObject == sectionG.getClass()) {
			return sectionG;
		}

		if (typeOfObject == sectionH.getClass()) {
			return sectionH;
		}
		if (typeOfObject == sectionI.getClass()) {
			return sectionI;
		}
		if (typeOfObject == sectionJ.getClass()) {
			return sectionJ;
		}
		if (typeOfObject == sectionK.getClass()) {
			return sectionK;
		}
		if (typeOfObject == sectionL.getClass()) {
			return sectionL;
		}
		if (typeOfObject == sectionM.getClass()) {
			return sectionM;
		}

		if (typeOfObject == sectionN.getClass()) {
			return sectionN;
		}
		if (typeOfObject == sectionO.getClass()) {
			return sectionO;
		}

		if (typeOfObject == sectionP.getClass()) {
			return sectionP;
		}

		if (typeOfObject == sectionQ.getClass()) {
			return sectionQ;
		}
		if (typeOfObject == sectionV.getClass()) {
			return sectionV;
		}
		if (typeOfObject == sectionX.getClass()) {
			return sectionX;
		}
		if (typeOfObject == sectionZ.getClass()) {
			return sectionZ;
		}
		return null;
	}

	public void doSave() throws RemoteException {
		Mds3 mds3 = new Mds3();
		mds3.setDateCreated(MedrexClientManager.getServerTime());
		mds3.setLastModified(MedrexClientManager.getServerTime());
		mds3.setResidentId(Global.currentResidenceKey);
		mds3.setFormType(Global.currentMds3FormType);
		mds3.setSerial(Global.currentMDS3FormKey);
		mds3.setStatus("Active");
		mds3.setNotes("");
		mds3.setUser(Global.currentUserKey);
		mds3.setMdsSectionA(sectionA);
		mds3.setMdsSectionB(sectionB);
		mds3.setMdsSectionC(sectionC);
		mds3.setMdsSectionD(sectionD);
		mds3.setMdsSectionE(sectionE);
		mds3.setMdsSectionF(sectionF);
		mds3.setMdsSectionG(sectionG);
		mds3.setMdsSectionH(sectionH);
		mds3.setMdsSectionI(sectionI);
		mds3.setMdsSectionJ(sectionJ);
		mds3.setMdsSectionK(sectionK);
		mds3.setMdsSectionL(sectionL);
		mds3.setMdsSectionM(sectionM);
		mds3.setMdsSectionN(sectionN);
		mds3.setMdsSectionO(sectionO);
		mds3.setMdsSectionP(sectionP);
		mds3.setMdsSectionQ(sectionQ);
		mds3.setMdsSectionV(sectionV);
		mds3.setMdsSectionX(sectionX);
		mds3.setMdsSectionZ(sectionZ);

		/**
		 * TODO : needs to be done from MedrexClientManager
		 */
		try {

			MedrexClientManager.getInstance().insertOrUpdateMDS3(mds3);

			// Mds3Service.insertOrUpdateMDS3(mds3);
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getMDS3(int serial) throws RemoteException {
		// function to get particular MDS form by serial
		if (serial == 0) {
			sectionA = new Mds3SectionA();
			sectionB = new Mds3SectionB();
			sectionC = new Mds3SectionC();
			sectionD = new Mds3SectionD();
			sectionE = new Mds3SectionE();
			sectionF = new Mds3SectionF();
			sectionG = new Mds3SectionG();
			sectionH = new Mds3SectionH();
			sectionI = new Mds3SectionI();
			sectionJ = new Mds3SectionJ();
			sectionK = new Mds3SectionK();
			sectionL = new Mds3SectionL();
			sectionM = new Mds3SectionM();
			sectionN = new Mds3SectionN();
			sectionO = new Mds3SectionO();
			sectionP = new Mds3SectionP();
			sectionQ = new Mds3SectionQ();
			sectionV = new Mds3SectionV();
			sectionX = new Mds3SectionX();
			sectionZ = new Mds3SectionZ();
		}
		// service

		// now directly retriving the DAO function for only Testing purpose
		try {
			// Mds3 mds3 = Mds3DAO.getInstance().getMds3(serial);
			Mds3 mds3 = MedrexClientManager.getInstance().getMds3(serial);
			if (mds3.getSectionA().getSerial() != 0) {
				sectionA = mds3.getSectionA();
			}

			if (mds3.getMdsSectionB().getSerial() != 0) {
				sectionB = mds3.getMdsSectionB();
			}

			if (mds3.getMdsSectionC().getSerial() != 0) {
				sectionC = mds3.getMdsSectionC();
			}
			if (mds3.getMdsSectionD().getSerial() != 0) {
				sectionD = mds3.getMdsSectionD();
			}
			if (mds3.getMdsSectionE().getSerial() != 0) {
				sectionE = mds3.getMdsSectionE();
			}
			if (mds3.getMdsSectionF().getSerial() != 0) {
				sectionF = mds3.getMdsSectionF();
			}

			if (mds3.getMdsSectionG().getSerial() != 0) {
				sectionG = mds3.getMdsSectionG();
			}

			if (mds3.getMdsSectionH().getSerial() != 0) {
				sectionH = mds3.getMdsSectionH();
			}

			if (mds3.getMdsSectionI().getSerial() != 0) {
				sectionI = mds3.getMdsSectionI();
			}
			if (mds3.getMdsSectionJ().getSerial() != 0) {
				sectionJ = mds3.getMdsSectionJ();
			}
			if (mds3.getMdsSectionK().getSerial() != 0) {
				sectionK = mds3.getMdsSectionK();
			}

			if (mds3.getMdsSectionL().getSerial() != 0) {
				sectionL = mds3.getMdsSectionL();
			}
			if (mds3.getMdsSectionM().getSerial() != 0) {
				sectionM = mds3.getMdsSectionM();
			}
			if (mds3.getMdsSectionN().getSerial() != 0) {
				sectionN = mds3.getMdsSectionN();
			}
			if (mds3.getMdsSectionO().getSerial() != 0) {
				sectionO = mds3.getMdsSectionO();
			}
			if (mds3.getMdsSectionP().getSerial() != 0) {
				sectionP = mds3.getMdsSectionP();
			}
			if (mds3.getMdsSectionQ().getSerial() != 0) {
				sectionQ = mds3.getMdsSectionQ();
			}
			if (mds3.getMdsSectionV().getSerial() != 0) {
				sectionV = mds3.getMdsSectionV();
			}
			if (mds3.getMdsSectionX().getSerial() != 0) {
				sectionV = mds3.getMdsSectionV();
			}

			if (mds3.getMdsSectionZ().getSerial() != 0) {
				sectionZ = mds3.getMdsSectionZ();
			}

		} catch (MedrexException e) {
			e.printStackTrace();
		}

	}

	public Mds3SectionA getSectionA() {
		return sectionA;
	}

	public void setSectionA(Mds3SectionA sectionA) {
		this.sectionA = sectionA;
	}

	public Mds3SectionB getSectionB() {
		return sectionB;
	}

	public void setSectionB(Mds3SectionB sectionB) {
		this.sectionB = sectionB;
	}

	public Mds3SectionC getSectionC() {
		return sectionC;
	}

	public void setSectionC(Mds3SectionC sectionC) {
		this.sectionC = sectionC;
	}

	public Mds3SectionD getSectionD() {
		return sectionD;
	}

	public void setSectionD(Mds3SectionD sectionD) {
		this.sectionD = sectionD;
	}

	public Mds3SectionE getSectionE() {
		return sectionE;
	}

	public void setSectionE(Mds3SectionE sectionE) {
		this.sectionE = sectionE;
	}

	public Mds3SectionF getSectionF() {
		return sectionF;
	}

	public void setSectionF(Mds3SectionF sectionF) {
		this.sectionF = sectionF;
	}

	public void setSectionG(Mds3SectionG sectionG) {
		this.sectionG = sectionG;
	}

	public Mds3SectionG getSectionG() {
		return sectionG;
	}

	public Mds3SectionO getSectionO() {
		return sectionO;
	}

	public void setSectionO(Mds3SectionO sectionO) {
		this.sectionO = sectionO;
	}

	public Mds3SectionH getSectionH() {
		return sectionH;
	}

	public void setSectionH(Mds3SectionH sectionH) {
		this.sectionH = sectionH;
	}

	public Mds3SectionI getSectionI() {
		return sectionI;
	}

	public void setSectionI(Mds3SectionI sectionI) {
		this.sectionI = sectionI;
	}

	public Mds3SectionJ getSectionJ() {
		return sectionJ;
	}

	public void setSectionJ(Mds3SectionJ sectionJ) {
		this.sectionJ = sectionJ;
	}

	public Mds3SectionK getSectionK() {
		return sectionK;
	}

	public void setSectionK(Mds3SectionK sectionK) {
		this.sectionK = sectionK;
	}

	public Mds3SectionL getSectionL() {
		return sectionL;
	}

	public void setSectionL(Mds3SectionL sectionL) {
		this.sectionL = sectionL;
	}

	public Mds3SectionM getSectionM() {
		return sectionM;
	}

	public void setSectionM(Mds3SectionM sectionM) {
		this.sectionM = sectionM;
	}

	public Mds3SectionN getSectionN() {
		return sectionN;
	}

	public void setSectionN(Mds3SectionN sectionN) {
		this.sectionN = sectionN;
	}

	public Mds3SectionP getSectionP() {
		return sectionP;
	}

	public void setSectionP(Mds3SectionP sectionP) {
		this.sectionP = sectionP;
	}

	public Mds3SectionQ getSectionQ() {
		return sectionQ;
	}

	public void setSectionQ(Mds3SectionQ sectionQ) {
		this.sectionQ = sectionQ;
	}

	public Mds3SectionV getSectionV() {
		return sectionV;
	}

	public void setSectionV(Mds3SectionV sectionV) {
		this.sectionV = sectionV;
	}

	public Mds3SectionX getSectionX() {
		return sectionX;
	}

	public void setSectionX(Mds3SectionX sectionX) {
		this.sectionX = sectionX;
	}

	public Mds3SectionZ getSectionZ() {
		return sectionZ;
	}

	public void setSectionZ(Mds3SectionZ sectionZ) {
		this.sectionZ = sectionZ;
	}

	public void doUnset() {
		Mds3Controller.getInstance().setSectionA(new Mds3SectionA());
		Mds3Controller.getInstance().setSectionB(new Mds3SectionB());
		Mds3Controller.getInstance().setSectionC(new Mds3SectionC());
		Mds3Controller.getInstance().setSectionD(new Mds3SectionD());
		Mds3Controller.getInstance().setSectionE(new Mds3SectionE());
		Mds3Controller.getInstance().setSectionF(new Mds3SectionF());
		Mds3Controller.getInstance().setSectionG(new Mds3SectionG());

		Mds3Controller.getInstance().setSectionH(new Mds3SectionH());
		Mds3Controller.getInstance().setSectionI(new Mds3SectionI());
		Mds3Controller.getInstance().setSectionJ(new Mds3SectionJ());
		Mds3Controller.getInstance().setSectionK(new Mds3SectionK());
		Mds3Controller.getInstance().setSectionL(new Mds3SectionL());
		Mds3Controller.getInstance().setSectionM(new Mds3SectionM());
		Mds3Controller.getInstance().setSectionN(new Mds3SectionN());
		Mds3Controller.getInstance().setSectionP(new Mds3SectionP());
		Mds3Controller.getInstance().setSectionQ(new Mds3SectionQ());
		Mds3Controller.getInstance().setSectionV(new Mds3SectionV());
		Mds3Controller.getInstance().setSectionX(new Mds3SectionX());
		Mds3Controller.getInstance().setSectionO(new Mds3SectionO());
		Mds3Controller.getInstance().setSectionZ(new Mds3SectionZ());
	}

}
