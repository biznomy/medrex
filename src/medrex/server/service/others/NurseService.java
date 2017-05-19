package medrex.server.service.others;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.others.Nurse;
import medrex.server.dao.NurseDAO;
import medrex.server.dao.UserDAO;

public class NurseService {

	public int insertOrUpdateNurseRecord(Nurse refNurse) throws MedrexException {
		int serial = 0;
		ImageIcon imageIcon = null;
		serial = NurseDAO.getInstance().insertOrUpdateNurseRecord(refNurse);
		imageIcon = refNurse.getImg();
		if (serial != 0) {
			String dir = "data/user/" + serial + "";
			medrex.server.util.Utils.saveImageTo("signature.jpg", dir,
					imageIcon, 50, 35);
		}
		return serial;
	}

	public List getNurseRecords() throws MedrexException {
		return (NurseDAO.getInstance().getNurseRecords());
	}

	public Nurse getNurseRecord(int serial) throws MedrexException {
		Nurse refNurse = null;
		refNurse = (NurseDAO.getInstance().getNurseRecord(serial));
		ImageIcon imageIcon = null;
		File imageFile = new File("data/user/" + serial + "/signature.jpg");
		if (imageFile.exists()) {
			try {
				Image img = ImageIO.read(imageFile);
				imageIcon = new ImageIcon(img);
				refNurse.setImg(imageIcon);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		return refNurse;
	}

	public Nurse getNurseRecordForSchedule(int serial) throws MedrexException {
		Nurse refNurse = null;
		refNurse = (NurseDAO.getInstance().getNurseRecordForSchedule(serial));
		return refNurse;
	}

	public void deleteNurseRecord(int serial) throws MedrexException {
		// try {
		NurseDAO.getInstance().deleteNurseRecord(serial);
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
			NurseDAO.getInstance().deleteNurseRecord(serial);
		}
		// else{
		// JOptionPane.showMessageDialog(null,"Access Denied"+" , Entries Exists for this User","Constraint Violation",JOptionPane.ERROR_MESSAGE);
		// }
	}

}
