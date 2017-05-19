package medrex.server.service.resident;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.resident.ResidentContact;
import medrex.commons.vo.resident.ResidentContactPhone;
import medrex.server.dao.resident.ResidentInformationDAO;

public class ResidentContactService {

	public int insertOrUpdateResidentContact(ResidentContact residentContact)
			throws MedrexException {
		int serial = 0;
		ImageIcon imageIcon = null;
		serial = ResidentInformationDAO.getInstance()
				.insertOrUpdateResidentContact(residentContact);
		imageIcon = residentContact.getSignature();
		if (serial != 0) {
			String dir = "data/residents/contact/" + serial + "";
			medrex.server.util.Utils.saveImageTo("signature.jpg", dir,
					imageIcon);

		}
		return serial;
	}

	public List getResidentContacts(int residentSerial) throws MedrexException {
		return (ResidentInformationDAO.getInstance()
				.getResidentContacts(residentSerial));
	}

	public List getResidentContactsWithSignature(int residentSerial)
			throws MedrexException {
		List<ResidentContact> ctcList = getResidentContacts(residentSerial);
		List<ResidentContact> ctcListNew = new ArrayList<ResidentContact>();
		Iterator<ResidentContact> itr = ctcList.iterator();
		while (itr.hasNext()) {
			ResidentContact ctc = itr.next();
			File imageFile = new File("data/residents/contact/"
					+ ctc.getSerial() + "/signature.jpg");
			if (imageFile.exists()) {
				try {
					Image img = ImageIO.read(imageFile);
					ctc.setSignature(new ImageIcon(img));
					ctcListNew.add(ctc);
				} catch (Exception e) {
					// e.printStackTrace();
				}

			}
		}
		return ctcListNew;
	}

	public List getResidentContactsWithSignature(int residentSerial,
			String likeStr) throws MedrexException {
		List<ResidentContact> ctcList = getResidentContacts(residentSerial,
				likeStr);
		List<ResidentContact> ctcListNew = new ArrayList<ResidentContact>();
		Iterator<ResidentContact> itr = ctcList.iterator();
		while (itr.hasNext()) {
			ResidentContact ctc = itr.next();
			File imageFile = new File("data/residents/contact/"
					+ ctc.getSerial() + "/signature.jpg");
			if (imageFile.exists()) {
				try {
					Image img = ImageIO.read(imageFile);
					ctc.setSignature(new ImageIcon(img));
				} catch (Exception e) {
					// e.printStackTrace();
				}
			}
			ctcListNew.add(ctc);
		}
		return ctcListNew;
	}

	public List getResidentContacts(int residentSerial, String likeStr)
			throws MedrexException {
		return (ResidentInformationDAO.getInstance().getResidentContacts(
				residentSerial, likeStr));
	}

	public ResidentContact getResidentContact(int serial)
			throws MedrexException {
		ImageIcon imageIcon = null;
		ResidentContact residentContact = ResidentInformationDAO.getInstance()
				.getResidentContact(serial);
		File imageFile = new File("data/residents/contact/" + serial
				+ "/signature.jpg");
		if (imageFile.exists()) {
			try {
				Image img = ImageIO.read(imageFile);
				imageIcon = new ImageIcon(img);
				residentContact.setSignature(imageIcon);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		return residentContact;
	}

	public ResidentContact getResidentContact(String lastName, String firstName)
			throws MedrexException {
		return (ResidentInformationDAO.getInstance().getResidentContact(
				lastName, firstName));
	}

	public void deleteResidentContact(int serial) throws MedrexException {
		ResidentInformationDAO.getInstance().deleteResidentContact(serial);
	}

	// Resident Contact Phone

	public int insertOrUpdateResidentContactPhone(
			ResidentContactPhone residentContactPhone) throws MedrexException {
		return ResidentInformationDAO.getInstance()
				.insertOrUpdateResidentContactPhone(residentContactPhone);
	}

	public List getResidentContactPhones(int residentContactSerial)
			throws MedrexException {
		return (ResidentInformationDAO.getInstance()
				.getResidentContactPhones(residentContactSerial));
	}

	public ResidentContactPhone getResidentContactPhone(int serial)
			throws MedrexException {
		return (ResidentInformationDAO.getInstance()
				.getResidentContactPhone(serial));
	}

	public ResidentContactPhone getResidentContactPhonePrimary(
			int residentContactSerial) throws MedrexException {
		return (ResidentInformationDAO.getInstance()
				.getResidentContactPhonePrimary(residentContactSerial));
	}

	public void deleteAllPhonesForContact(int residentContactSerial)
			throws MedrexException {
		ResidentInformationDAO.getInstance().deleteAllPhonesForContact(
				residentContactSerial);
	}

	public void deleteResidentContactPhone(int serial) throws MedrexException {
		ResidentInformationDAO.getInstance().deleteResidentContactPhone(serial);
	}

}
