package medrex.server.util;

import java.awt.Container;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import medrex.server.service.activity.ActivitysRecordService;
import medrex.server.service.admission.AdmissionRecordService;
import medrex.server.service.consultant.ConsultantService;
import medrex.server.service.dietary.DietaryService;
import medrex.server.service.historyAndPhysical.HistoryAndPhysicalService;
import medrex.server.service.labSpecial.LabSpecialService;
import medrex.server.service.medication.medicationTreatmentFormService;
import medrex.server.service.physicianOrders.PhysicianOrdersService;
import medrex.server.service.progressNotes.ProgressNotesService;
import medrex.server.service.ptOtSt.PtOtStService;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGEncodeParam;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

public class Utils {

	private static final long MILLSECS_PER_DAY = 24 * 60 * 60 * 1000;
	// Form Names
	private static String[] formNamesAdmission = new String[] { "Resident Assessment Form" };
	private static String[] formNamesActivitys = new String[] { "Activity Initial Assessment" };
	private static String[] formNamesMedication = new String[] {
			"Pain Management Record", "Nurse Treatment Notes",
			"Nurse Medication Notes", "Medication Adminisration Record",
			"Medication PRN Record", "Medication Routine Record",
			"Treatment PRN Record", "Treatment Routine Record",
			"Pressure Sore Record", "Notes" };
	private static String[] formNamesDietary = new String[] {
			"Dietary Communication Form", "Dietary Resident Diagnosis Form",
			"Enteral Feeding Progress Notes",
			"Consultant Dietician Nutritional Recommendations" };
	private static String[] formNamesConsultant = new String[] {
			"Renal Dialysis Communication Form", "Referral Form",
			"Report of Consultation", "Pharmacist Resident Evaluation" };
	private static String[] formNamesProgressNotes = new String[] {
			"Doctors Progress Notes", "InterDisciplinary Progress Notes" };
	private static String[] formNamesLabSpecial = new String[] {
			"Reason For Study Form", "Medfax Form 1", "Medfax Form 2" };
	private static String[] formNamesHistory = new String[] {
			"History And Physical General", "Resident Immunization Form",
			"Cumulative Diagnosis", "Monthly Vital Signs And Weight Sheet",
			"Weekly Weights" };
	private static String[] formNamesPhysicianOrders = new String[] {
			"Physician Plaza Health Care Form", "Physician Infusion Form",
			"Physician Speciality Form", "Physician Order Form 1",
			"Physician Order Form 2", "Physician Order Form 3", "Prescription",
			"Progress Notes" };
	private static String[] formNamesPtOtSt = new String[] {
			"Physical Daily Record", "Occupational Daily Record",
			"Speech Daily Record", "Physical Therapy", "Occupational Therapy",
			"Speech Therapy", "Positioning Evaluation", "Rehab Care Plan",
			"Therapy ProgressNote/Re-certification/Discharge", "Treatment" };

	private static Object[][] forms = new Object[][] {
			{ "Admission Details", formNamesAdmission,
					AdmissionRecordService.class },
			{ "Activities", formNamesActivitys, ActivitysRecordService.class },
			{ "Medication & Treatment", formNamesMedication,
					medicationTreatmentFormService.class },
			{ "Dietary", formNamesDietary, DietaryService.class },
			{ "Consultant", formNamesConsultant, ConsultantService.class },
			{ "Progress Notes", formNamesProgressNotes,
					ProgressNotesService.class },
			{ "Lab & Special Reports", formNamesLabSpecial,
					LabSpecialService.class },
			{ "History & Physical", formNamesHistory,
					HistoryAndPhysicalService.class },
			{ "Physician Orders", formNamesPhysicianOrders,
					PhysicianOrdersService.class },
			{ "Pt-Ot-Act Speech", formNamesPtOtSt, PtOtStService.class } };

	private static Object[][] methods = new Object[][] {
			{ AdmissionRecordService.class, "getAdmissionsRecords" },
			{ ActivitysRecordService.class, "getActivitysRecords" },
			{ medicationTreatmentFormService.class,
					"getMedicationTreatmentForms" },
			{ DietaryService.class, "getDietarys" },
			{ ConsultantService.class, "getConsultants" },
			{ ProgressNotesService.class, "getProgressNotess" },
			{ LabSpecialService.class, "getLabSpecials" },
			{ HistoryAndPhysicalService.class, "getHistoryAndPhysicals" },
			{ PhysicianOrdersService.class, "getPhysicianOrders" },
			{ PtOtStService.class, "getPtOtSts" } };

	public static int DateDifference(Date after, Date before) {
		return (int) ((after.getTime() - before.getTime()) / MILLSECS_PER_DAY);
	}

	public static int getMaxDaysInMonth(Date date) {
		switch (date.getMonth() + 1) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			return isLeapYear(date.getYear()) ? 29 : 28;
		default:
			return 0;
		}
	}

	public static boolean isLeapYear(int year) {
		return (new GregorianCalendar()).isLeapYear(year);

	}

	// hh:mm a
	public static Date getTimeStringToDate(String str) {
		if (str.length() == 8) {
			Date dateRef = new Date();
			int hrs = Integer.parseInt(str.substring(0, 2));
			if (hrs == 12) {
				hrs = 0;
			}
			if (str.charAt(6) == 'P') {
				hrs += 12;
			}
			dateRef.setHours(hrs);
			dateRef.setMinutes((Integer.parseInt(str.substring(3, 5))));
			dateRef.setSeconds(0);
			return dateRef;
		}
		return null;
	}

	public static int convertInt(String str) {
		if (str == null) {
			str = "0";
		}
		if (str.equalsIgnoreCase("")) {
			str = "0";
		}

		return (Integer.parseInt(str));
	}

	public static void saveImageTo(String imageName, String path,
			ImageIcon imageIcon) {

		new File(path).mkdirs();
		File outputFile = new File(path + "/" + imageName);
		if (imageIcon != null) {
			BufferedImage bfImage = Utils
					.getBufferedImageFromImageicon(imageIcon);
			try {
				ImageIO.write(bfImage, "jpg", outputFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static BufferedImage getBufferedImageFromImageicon(ImageIcon a) {
		Image img = a.getImage();
		BufferedImage bfimg = null;
		bfimg = new BufferedImage(img.getWidth(null), img.getHeight(null),
				BufferedImage.TYPE_INT_RGB);
		bfimg.getGraphics().drawImage(img, 0, 0, null);
		return bfimg;

	}

	public static void saveImageTo(String imageName, String path,
			ImageIcon imageIcon, int thumbHeight, int quality) {
		// System.out.println("Thumbnail.resize  "+infile+"  "+outfile+" "+thumbHeight+"  "+quality);
		// load image from INFILE
		// Image image = Toolkit.getDefaultToolkit().getImage(infile);
		new File(path).mkdirs();
		if (imageIcon != null) {
			Image image = imageIcon.getImage();
			MediaTracker mediaTracker = new MediaTracker(new Container());
			mediaTracker.addImage(image, 0);
			try {
				mediaTracker.waitForID(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// determine thumbnail size from WIDTH and HEIGHT

			int imageWidth = image.getWidth(null);
			int imageHeight = image.getHeight(null);
			double imageRatio = (double) imageWidth / (double) imageHeight;
			int thumbWidth = (int) (thumbHeight * imageRatio);

			// draw original image to thumbnail image object and
			// scale it to the new size on-the-fly
			BufferedImage thumbImage = new BufferedImage(thumbWidth,
					thumbHeight, BufferedImage.TYPE_INT_RGB);
			Graphics2D graphics2D = thumbImage.createGraphics();
			graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
					RenderingHints.VALUE_INTERPOLATION_BILINEAR);
			graphics2D.drawImage(image, 0, 0, thumbWidth, thumbHeight, null);

			// save thumbnail image to OUTFILE
			try {
				BufferedOutputStream out = new BufferedOutputStream(
						new FileOutputStream(path + "/" + imageName));
				JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
				JPEGEncodeParam param = encoder
						.getDefaultJPEGEncodeParam(thumbImage);

				quality = Math.max(0, Math.min(quality, 100));
				param.setQuality(quality / 100.0f, false);
				encoder.setJPEGEncodeParam(param);
				encoder.encode(thumbImage);
				out.close();
			} catch (Exception e) {

			}

			System.out.println("Done.");
		}

	}

	public static Class getMasterFormService(String form) {
		for (int i = 0; i < 10; i++) {
			String[] subForms = (String[]) forms[i][1];
			for (int j = 0; j < subForms.length; j++) {
				if (subForms[j].equalsIgnoreCase(form)) {
					Class cls = (Class) forms[i][2];
					return cls;
				}
			}
		}
		return null;
	}

	public static Method getMasterFormServiceGetAllMethod(
			Class masterFormService, String form) {
		for (int i = 0; i < 10; i++) {
			if (methods[i][0].equals(masterFormService)) {
				Method m = null;
				try {
					m = masterFormService.getDeclaredMethod(
							(String) methods[i][1], int.class);
				} catch (Exception e) {
					e.printStackTrace();
				}
				return m;
			}
		}
		return null;
	}

}
