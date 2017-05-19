package medrex.server.service.admin.nursingHome;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.NursingHome;
import medrex.server.dao.admin.nursingHome.NursingHomeDAO;
import medrex.server.dao.resident.ResidentInformationDAO;

public class NursingHomeService {

	public int insertOrUpdateNursinhHome(NursingHome nh) throws MedrexException {
		int serial = 0;
		ImageIcon imageIcon = null;
		NursingHomeDAO.getInstance().insertOrUpdateNursinhHome(nh);

		if (nh.getSerial() != 0) {
			ResidentInformationDAO.getInstance().getResident(nh.getSerial());

		}

		serial = NursingHomeDAO.getInstance().insertOrUpdateNursinhHome(nh);
		imageIcon = nh.getImg();

		if (serial != 0) {
			String dir = "data/nursinghome/" + serial + "";
			// medrex.server.util.Utils.saveImageTo("main.jpg", dir, imageIcon);
			medrex.server.util.Utils.saveImageTo("main.jpg", dir, imageIcon,
					110, 300);
		}

		return serial;
	}

	public NursingHome getNursingHomeInfo(int i) throws MedrexException {
		NursingHome nh = NursingHomeDAO.getInstance().getNursingHomeInfo(i);
		ImageIcon imageIcon = null;
		File imageFile = new File("data/nursinghome/" + i + "/main.jpg");
		if (imageFile.exists()) {
			try {
				Image img = ImageIO.read(imageFile);
				imageIcon = new ImageIcon(img);
				nh.setImg(imageIcon);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		return nh;
	}

}
