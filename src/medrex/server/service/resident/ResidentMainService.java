package medrex.server.service.resident;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import medrex.client.utils.Utils;
import medrex.commons.dataObj.Rooms;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.census.counts.InHouse;
import medrex.commons.vo.resident.ResidentMain;
import medrex.server.dao.census.counts.InHouseDAO;
import medrex.server.dao.physicianOrders.physicianOrderNewScreen.PhysicianOrderRecordDAO;
import medrex.server.dao.resident.ResidentInformationDAO;
import medrex.server.service.census.CensusStatusService;

public class ResidentMainService {

	public int insertOrUpdateResidentMain(ResidentMain residentMain)
			throws MedrexException {
		int serial = 0;
		ImageIcon imageIcon = null;
		// for insurance count
		if (residentMain.getSerial() != 0) {
			ResidentMain res = ResidentInformationDAO.getInstance()
					.getResident(residentMain.getSerial());
			residentMain.setInsuranceCount(res.getInsuranceCount());
		}

		serial = ResidentInformationDAO.getInstance()
				.insertOrUpdateResidentMain(residentMain);
		imageIcon = residentMain.getImg();

		if (serial != 0) {
			String dir = "data/residents/" + serial + "";
			// medrex.server.util.Utils.saveImageTo("main.jpg", dir, imageIcon);
			medrex.server.util.Utils.saveImageTo("main.jpg", dir, imageIcon,
					110, 300);
		}

		return serial;
	}

	public List<ResidentMain> getResidentMain() throws MedrexException {
		List<ResidentMain> rmList = ResidentInformationDAO.getInstance()
				.getResidentMain("Active");
		// rmList = getResidentsWithPhotograph(rmList);
		return rmList;
	}

	public List<ResidentMain> getResidentMain(String status)
			throws MedrexException {
		List<ResidentMain> rmList = ResidentInformationDAO.getInstance()
				.getResidentMain(status);
		rmList = getResidentsWithPhotograph(rmList);
		return rmList;
	}

	public List<ResidentMain> getResidentsWithOutOfPass()
			throws MedrexException {
		List<ResidentMain> rmList = ResidentInformationDAO.getInstance()
				.getResidentsWithOutOfPass();
		rmList = getResidentsWithPhotograph(rmList);
		return rmList;
	}

	private List<ResidentMain> getResidentsWithPhotograph(
			List<ResidentMain> rmList) {
		ImageIcon imageIcon = null;
		Iterator<ResidentMain> itr = rmList.iterator();
		while (itr.hasNext()) {
			ResidentMain rm = itr.next();
			File imageFile = new File("data/residents/" + rm.getSerial()
					+ "/main.jpg");
			if (imageFile.exists()) {
				try {
					Image img = ImageIO.read(imageFile);
					imageIcon = new ImageIcon(img);
					rm.setImg(imageIcon);
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}
		return rmList;
	}

	public List getResidents(String find, String firstName, String SS1,
			String status) throws MedrexException {
		return (ResidentInformationDAO.getInstance().getResidents(find,
				firstName, SS1, status));
	}

	public List getResidents(String floorType) throws MedrexException {
		return (ResidentInformationDAO.getInstance().getResidents(floorType));
	}

	public ResidentMain getResident(String lastName, String firstName,
			String SS1) throws MedrexException {
		return (ResidentInformationDAO.getInstance().getResident(lastName,
				firstName, SS1));
	}

	public ResidentMain getResident(int serial) throws MedrexException {
		ImageIcon imageIcon = null;
		ResidentMain rm = ResidentInformationDAO.getInstance().getResident(
				serial);
		File imageFile = new File("data/residents/" + serial + "/main.jpg");
		if (imageFile.exists()) {
			try {
				Image img = ImageIO.read(imageFile);
				imageIcon = new ImageIcon(img);
				rm.setImg(imageIcon);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		return rm;
	}

	public ResidentMain getResidentWithoutImg(int serial)
			throws MedrexException {
		return (ResidentInformationDAO.getInstance().getResident(serial));
	}

	public ResidentMain getResident(int residentId, int activeId)
			throws MedrexException {
		return (ResidentInformationDAO.getInstance().getResident(residentId,
				activeId));
	}

	public ResidentMain getResidentFloorWise(int residentId, String floor)
			throws MedrexException {
		return (ResidentInformationDAO.getInstance().getResidentFloorWise(
				residentId, floor));
	}

	public List getOccupiedRoom() throws MedrexException {
		return (ResidentInformationDAO.getInstance().getOccupiedRoom());
	}

	public List<ResidentMain> getActiveResident(int str) throws MedrexException {
		return ResidentInformationDAO.getInstance().getActiveResident(str);
	}

	public List<Rooms> getFirstFloorResidents() throws MedrexException {
		return ResidentInformationDAO.getInstance().getFirstFloorResidents();
	}

	public List<Rooms> getSecondFloorResidents() throws MedrexException {
		return ResidentInformationDAO.getInstance().getSecondFloorResidents();
	}

	public List getFirstFloorResidents(Date date) throws MedrexException {
		new ArrayList();

		List<Rooms> roomList = ResidentInformationDAO.getInstance()
				.getFirstFloorResidents(date);
		/*
		 * for(Rooms room: roomList){ File imageFile = new
		 * File("data/residents/" + room.getResmain().getSerial() +
		 * "/main.jpg"); if (imageFile.exists()) { try { Image img =
		 * ImageIO.read(imageFile); imageIcon = new ImageIcon(img);
		 * room.getResmain().setImg(imageIcon); } catch (IOException e) {
		 * e.printStackTrace(); }
		 * 
		 * } list.add(room); }
		 */
		return roomList;
	}

	public List getSecondFloorResidents(Date date) throws MedrexException {
		return ResidentInformationDAO.getInstance().getSecondFloorResidents(
				date);
	}

	public ResidentMain getResidentAccordingToFirstLastAndDob(String firstName,
			String lastName, Date dob) throws MedrexException {
		return ResidentInformationDAO
				.getInstance()
				.getResidentAccordingToFirstLastAndDob(firstName, lastName, dob);
	}

	public int updateInsuranceCount(int residentId) throws MedrexException {
		InHouse inHouse = new InHouseDAO().getInstance().getInHouse(residentId);
		CensusStatusService censusStatusService = new CensusStatusService();
		int tempInscount = 0;
		if (inHouse != null) {
			CensusStatus censusStatus = censusStatusService
					.getCensusLastAdmission(residentId);
			int day = Utils.DateDifference(new Date(), censusStatus
					.getDateAndTime());
			if ((day > 0) && (day <= 100)) {
				System.out.println("insurance valid");
				ResidentMain res = ResidentInformationDAO.getInstance()
						.getResident(residentId);
				if (res.getMedicalRecordNum() != null
						&& (!res.getMedicalRecordNum().equals(""))) {
					int insCount = res.getInsuranceCount();
					if (insCount != 0) {
						tempInscount = insCount - day;
					}
				}

			} else {
				System.out.println("insurance not valid");
			}
		}
		return tempInscount;
	}

	public boolean isDNR(int currentResidenceKey) throws MedrexException {
		return PhysicianOrderRecordDAO.getInstance().isDNR(currentResidenceKey);
	}

}
