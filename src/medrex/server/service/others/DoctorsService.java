package medrex.server.service.others;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.masterList.DoctorTypes;
import medrex.commons.vo.others.Doctors;
import medrex.server.dao.DoctorsDAO;
import medrex.server.dao.UserDAO;

public class DoctorsService {

	public int insertOrUpdateDoctorsRecord(Doctors refDoctors)
			throws MedrexException {
		int serial = 0;
		ImageIcon imageIcon = null;
		serial = DoctorsDAO.getInstance().insertOrUpdateDoctorsRecord(
				refDoctors);
		imageIcon = refDoctors.getImg();
		if (serial != 0) {
			String dir = "data/user/" + serial + "";
			medrex.server.util.Utils.saveImageTo("signature.jpg", dir,
					imageIcon, 50, 35);
		}
		return serial;
	}

	public List getDoctorsRecords() throws MedrexException {
		return (DoctorsDAO.getInstance().getDoctorsRecords());
	}

	public List getDoctorsRecords(int residentSerial) throws MedrexException {
		return (DoctorsDAO.getInstance().getDoctorsRecords(residentSerial));
	}

	public List getDoctorsRecords(DoctorTypes type) throws MedrexException {
		return (DoctorsDAO.getInstance().getDoctorsRecords(type));
	}

	public Doctors getDoctorsRecord(DoctorTypes typeCode, String firstName,
			String lastName) throws MedrexException {
		return (DoctorsDAO.getInstance().getDoctorsRecord(typeCode, firstName,
				lastName));
	}

	public Doctors getDoctorsRecord(int serial) throws MedrexException {
		Doctors refDoct = null;
		refDoct = (DoctorsDAO.getInstance().getDoctorsRecord(serial));
		ImageIcon imageIcon = null;
		File imageFile = new File("data/user/" + serial + "/signature.jpg");
		if (imageFile.exists()) {
			try {
				Image img = ImageIO.read(imageFile);
				imageIcon = new ImageIcon(img);
				refDoct.setImg(imageIcon);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		return refDoct;
	}

	public void deleteDoctorsRecord(int serial) throws MedrexException {
		// try {
		DoctorsDAO.getInstance().deleteDoctorsRecord(serial);
		// } catch (Exception e) {
		// TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}

	public void deleteDoctorsRecord(int serial, int userId)
			throws MedrexException {
		boolean res = UserDAO.getInstance().isUserPhysicianRelationExist(
				userId, serial);
		if (!res) {
			DoctorsDAO.getInstance().deleteDoctorsRecord(serial);
		}
		// else{
		// JOptionPane.showMessageDialog(null,"Access Denied"+" , Entries Exists for this User","Constraint Violation",JOptionPane.ERROR_MESSAGE);
		// }
	}

}
