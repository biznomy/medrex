package medrex.server.service.scan;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.scan.ScanForm;
import medrex.server.dao.ScanFormDAO;
import medrex.server.util.Utils;

public class ScanFormService {

	public void insertOrUpdateScanForm(ScanForm scanForm)
			throws MedrexException {
		ScanFormDAO.getInstance().insertOrUpdateScanForm(scanForm);
	}

	public List getScanForms(int residentSerial) throws MedrexException {
		return (ScanFormDAO.getInstance().getScanForms(residentSerial));
	}

	public ScanForm getScanForm(int serial) throws MedrexException {
		return (ScanFormDAO.getInstance().getScanForm(serial));
	}

	public void deleteScanForm(int serial) throws MedrexException {
		try {
			ScanFormDAO.getInstance().deleteScanForm(serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void doScanSave(int residentId, String residentTabName,
			String scanFormName, ImageIcon icon) throws MedrexException {
		try {
			java.io.File currentDir = new java.io.File("");

			new File(currentDir.getAbsolutePath() + "\\scans\\" + residentId
					+ "\\" + residentTabName + "\\").mkdirs();
			String path = currentDir.getAbsolutePath() + "\\scans\\"
					+ residentId + "\\" + residentTabName + "\\";

			Utils.saveImageTo(scanFormName, path, icon, 1700, 2300);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public List<ScanForm> doLoadScans(int residentId, String residentTabName)
			throws MedrexException {
		// List<File> scanRecords = new ArrayList();
		File[] f = null;
		List<ScanForm> sfList = new ArrayList<ScanForm>();
		if (residentId != 0) {
			try {
				String currentDir = ("./scans/" + residentId + "/"
						+ residentTabName + "/");
				f = new File(currentDir).listFiles();

				// java.io.File currentDir = new java.io.File("");
				// f = new File(currentDir.getAbsolutePath() + "\\scans\\"
				// + residentId + "\\"
				// + residentTabName + "\\").listFiles();
				if (f != null) {
					for (int i = 0; i < f.length; i++) {
						String fileName = f[i].getName() + "";
						if (fileName.endsWith(".jpg")) {
							ScanForm sf = new ScanForm();

							System.out.println("files name: " + fileName);
							sf.setDateCreated(new Date(f[i].lastModified()));
							sf.setFileName(fileName);

							// System.out.println("sf name: "+
							// sf.getFileName());

							String[] fPart = f[i].getName().split("-");
							sf.setScanFormType(fPart[0].replaceAll("_", " "));
							sfList.add(sf);
						}
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sfList;
	}

	public ScanForm getScan(int residentId, String residentTabName,
			String fileName) throws MedrexException {
		File currentDir = new java.io.File("");

		File f = null;

		ScanForm sf = new ScanForm();

		Image img = null;
		try {
			f = new File(currentDir.getAbsolutePath() + "\\scans\\"
					+ residentId + "\\" + residentTabName + "\\" + fileName);
			img = ImageIO.read(f);
		} catch (IOException e) {
			throw new MedrexException(e.getMessage());
		}

		ImageIcon imageIcon = new ImageIcon(img);
		sf.setFileName(f.getName());
		sf.setDateCreated(new Date(f.lastModified()));
		System.out.println("imageIcon:" + imageIcon);
		sf.setImg(imageIcon);
		String[] fPart = f.getName().split("-");
		sf.setScanFormType(fPart[0].replaceAll("_", " "));

		return sf;
	}

	public void deleteScanForm(int residentId, String residentTabName,
			String fileName) throws MedrexException {
		File currentDir = new java.io.File("");

		File f = null;

		try {
			f = new File(currentDir.getAbsolutePath() + "\\scans\\"
					+ residentId + "\\" + residentTabName + "\\" + fileName);

			boolean result = f.delete();

			if (!result) {
				throw new MedrexException("Unable to delete scan document");
			}
		} catch (MedrexException e) {
			throw e;
		} catch (Exception e) {
			throw new MedrexException(e.getMessage());
		}
	}

	public void deleteScanFile(File file) throws MedrexException {
		file.delete();
	}

}
