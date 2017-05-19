package medrex.client.census;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;
import medrex.commons.utils.MedrexReportViewer;
import medrex.commons.vo.census.AdmissionFromSubHead;
import medrex.commons.vo.census.CensusAdmissionReport;
import medrex.commons.vo.census.CensusDischargeReport;
import medrex.commons.vo.census.CensusErReport;
import medrex.commons.vo.census.CensusHospitalReport;
import medrex.commons.vo.census.CensusOutOnPassReport;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.census.counts.Hospital;
import medrex.commons.vo.census.counts.OutOfPass;
import medrex.commons.vo.census.counts.SignOut;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.RoomChange;
import medrex.commons.vo.resident.RoomChangeReport;
import medrex.commons.vo.resident.TempRoomHistory;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.util.JRLoader;

import com.sX.swing.JxButton;
import com.toedter.calendar.JDateChooser;

public class FrameADayReport extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1901344984390762588L;
	private JxButton btnOk;
	private JDateChooser dcDate;
	private static final Color DEF_COLOR = new Color(49, 104, 127);

	private TempRoomHistory rh = null;

	private Map<String, Object> parameter1;

	public FrameADayReport(final String str) {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setTitle("Choose a Date");
		setSize(new Dimension(270, 230));
		setModal(true);

		final JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 258, 230);
		add(panel);

		final JLabel chooseADayLabel = new JLabel();
		chooseADayLabel.setBounds(42, 38, 194, 27);
		chooseADayLabel.setForeground(DEF_COLOR);
		chooseADayLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont()
				.deriveFont(12));
		if (str == "Acuities Report") {
			chooseADayLabel.setText("Choose a Day for Acuities Report");
		} else {
			chooseADayLabel.setText("Choose a Day for Census Report");
		}
		panel.add(chooseADayLabel);

		dcDate = new JDateChooser();
		dcDate.setDateFormatString("MM/dd/yyyy");
		dcDate.setBounds(79, 83, 102, 20);
		dcDate.setMaxSelectableDate(new Date());
		panel.add(dcDate);

		btnOk = new JxButton(0.4f);
		btnOk.setBackground(Color.WHITE);
		btnOk.setForeground(DEF_COLOR);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				if (dcDate.getDate() != null) {
					// makeADayReport();
					// makeTempReport();
					if (str.equalsIgnoreCase("Census Report")) {
						makeADayReport();
					} else if (str
							.equalsIgnoreCase("Census Report (Floor Wise)")) {
						// makeFloorWiseReport();
					} else if (str.equalsIgnoreCase("Room History Report")) {
						// FrameChangeRoomReport f = new
						// FrameChangeRoomReport(dcDate.getDate());
						// SwingUtils.center(f);
						// f.setVisible(true);
						makeChangeRoomReport();
					} else if (str.equalsIgnoreCase("Acuities Report")) {
						acuititesTempReports();
					}
					FrameADayReport.this.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Please select a Date");
				}
			}
		});
		btnOk.setText("Report");
		btnOk.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		btnOk.setBounds(75, 137, 106, 26);
		panel.add(btnOk);

	}

	protected void makeChangeRoomReport() {
		List<RoomChange> rcFirstFloorList = null;
		List<RoomChange> rcSecondFloorList = null;
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		String dt = df.format(dcDate.getDate());
		try {
			df.parse(dt);
			rcFirstFloorList = MedrexClientManager.getInstance()
					.getRoomChangeFirstFloor(dcDate.getDate());
			rcSecondFloorList = MedrexClientManager.getInstance()
					.getRoomChangeSecondFloor(dcDate.getDate());

		} catch (Exception e) {
			e.printStackTrace();
		}
		List<RoomChangeReport> rcrFirstFloorReportList = new ArrayList<RoomChangeReport>();
		List<RoomChangeReport> rcrSecondFloorReportList = new ArrayList<RoomChangeReport>();

		// First Floor
		Iterator<RoomChange> itr = rcFirstFloorList.iterator();
		while (itr.hasNext()) {
			RoomChangeReport acReport = new RoomChangeReport();
			RoomChange acc = itr.next();
			ResidentMain rm = null;
			try {
				rm = MedrexClientManager.getInstance().getResident(
						acc.getResidentId());
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MedrexException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			acReport.setResidentId(rm.getUserPass() + ", " + rm.getUserName());
			acReport.setFromRoom(acc.getFromRoom());
			acReport.setToRoom(acc.getToRoom());
			rcrFirstFloorReportList.add(acReport);
		}

		// Second Floor
		Iterator<RoomChange> itr1 = rcSecondFloorList.iterator();
		while (itr1.hasNext()) {
			RoomChangeReport acReport = new RoomChangeReport();
			RoomChange acc = itr1.next();
			ResidentMain rm = null;
			try {
				rm = MedrexClientManager.getInstance().getResident(
						acc.getResidentId());
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MedrexException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			acReport.setResidentId(rm.getUserPass() + ", " + rm.getUserName());
			acReport.setFromRoom(acc.getFromRoom());
			acReport.setToRoom(acc.getToRoom());
			rcrSecondFloorReportList.add(acReport);
		}

		JRBeanArrayDataSource ffChangeRoomDataSource;
		Object[] reportRows = rcrFirstFloorReportList.toArray();
		ffChangeRoomDataSource = new JRBeanArrayDataSource(reportRows);

		JRBeanArrayDataSource sfChangeRoomDataSource;
		Object[] reportSecondRows = rcrSecondFloorReportList.toArray();
		sfChangeRoomDataSource = new JRBeanArrayDataSource(reportSecondRows);

		try {
			Map parameter1 = new HashMap();
			parameter1.put("ffChangeRoomDataSource", ffChangeRoomDataSource);
			parameter1.put("sfChangeRoomDataSource", sfChangeRoomDataSource);
			parameter1.put("date", dt);
			JasperFillManager.fillReportToFile(
					"report//changeRoom//ChangeRoom.jasper", parameter1,
					new JREmptyDataSource());
			String strPrintData = "report//changeRoom//report name.jrprint";
			JasperPrint jasperPrint = (JasperPrint) JRLoader
					.loadObject(strPrintData);
			MedrexReportViewer aViwer = new MedrexReportViewer(jasperPrint);
			aViwer.setExportDataFile(strPrintData);
			JFrame aFrame = new JFrame("Report Viewer");
			aFrame.getContentPane().add(aViwer);
			java.awt.Dimension screenSize = java.awt.Toolkit
					.getDefaultToolkit().getScreenSize();
			aFrame.setSize(screenSize.width / 2, screenSize.height / 2);
			java.awt.Insets insets = aFrame.getInsets();
			aFrame.setSize(aFrame.getWidth() + insets.left + insets.right,
					aFrame.getHeight() + insets.top + insets.bottom + 20);
			aFrame.setLocation((screenSize.width - aFrame.getWidth()) / 2,
					(screenSize.height - aFrame.getHeight()) / 2);
			aFrame.show();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	private void acuititesTempReports() {

		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		String dt = df.format(dcDate.getDate());
		// I have to return the list of Parameter to set the values

		try {
			try {
				parameter1 = MedrexClientManager.getInstance()
						.getAccutiesByDate(dt);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (MedrexException e) {
			e.printStackTrace();
		}
		System.out.println("all total value" + parameter1.get("allTotal"));

		try {
			JasperFillManager.fillReportToFile(
					"report//acuities//report25.jasper", parameter1,
					new JREmptyDataSource());
		} catch (JRException e) {
			e.printStackTrace();
		}
		String strPrintData = "report//acuities//report name.jrprint";
		JasperPrint jasperPrint = null;
		try {
			jasperPrint = (JasperPrint) JRLoader.loadObject(strPrintData);
		} catch (JRException e) {
			e.printStackTrace();
		}
		MedrexReportViewer aViwer = new MedrexReportViewer(jasperPrint);
		aViwer.setExportDataFile(strPrintData);
		aViwer.setExportDataFile(strPrintData);
		JFrame aFrame = new JFrame("Report Viewer");
		aFrame.getContentPane().add(aViwer);
		java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize();
		aFrame.setSize(screenSize.width / 2, screenSize.height / 2);
		java.awt.Insets insets = aFrame.getInsets();
		aFrame.setSize(aFrame.getWidth() + insets.left + insets.right, aFrame
				.getHeight()
				+ insets.top + insets.bottom + 20);
		aFrame.setLocation((screenSize.width - aFrame.getWidth()) / 2,
				(screenSize.height - aFrame.getHeight()) / 2);
		aFrame.show();

		/*
		 * } catch (Exception e1) { e1.printStackTrace(); }
		 */

		// FrameAcuitiesReport frl = new
		// FrameAcuitiesReport(accFirstFloorReportList,
		// accSecondFloorReportList, dcDate.getDate());
		// frl.setVisible(true);
	}

	// protected void makeTempReport() {
	// List l = new ArrayList();
	// SimpleDateFormat df = new SimpleDateFormat();
	// df.applyPattern("MMM dd, yyyy  hh:mm a");
	// Date date = dcDate.getDate();
	// Map parameters = new HashMap();
	// List<CensusStatus> admissionList = null;
	// List<CensusStatus> dischargeList = null;
	// List<CensusStatus> outOnPassList = null;
	// List<CensusStatus> hospitalList = null;
	// try {
	// admissionList =
	// MedrexClientManager.getInstance().getCensusDayReportAdmissionList(date);
	// dischargeList =
	// MedrexClientManager.getInstance().getCensusDayReportDischargeList(date);
	// outOnPassList =
	// MedrexClientManager.getInstance().getCensusDayReportOutOnPassList(date);
	// hospitalList =
	// MedrexClientManager.getInstance().getCensusDayReportHospitalList(date);
	// } catch (RemoteException e2) {
	// // TODO Auto-generated catch block
	// e2.printStackTrace();
	// } catch (MedrexException e2) {
	// // TODO Auto-generated catch block
	// e2.printStackTrace();
	// }
	// List<CensusAdmissionReport> aList = new
	// ArrayList<CensusAdmissionReport>();
	// List<CensusDischargeReport> dList = new
	// ArrayList<CensusDischargeReport>();
	// List<CensusOutOnPassReport> oList = new
	// ArrayList<CensusOutOnPassReport>();
	// List<CensusHospitalReport> hList = new ArrayList<CensusHospitalReport>();
	//		
	// Users u = null;
	// ResidentMain rm = null;
	// AdmissionFromSubHead afsh = null;
	// AdmissionTransportation aft = null;
	//		
	// // Admission
	// Iterator it = admissionList.iterator();
	// while (it.hasNext()) {
	// CensusAdmissionReport car = new CensusAdmissionReport();
	// CensusStatus cs = (CensusStatus) it.next();
	// String temp = "";
	// if(cs.getFromId() == 1) {
	// temp += "Hospital";
	// } else if (cs.getFromId() == 2) {
	// temp += "Home";
	// } else if(cs.getFromId() == 3) {
	// temp += "Other Facility";
	// } else if(cs.getFromId() == 4) {
	// temp += "Other";
	// }
	// if (cs.getFromSubId() != 0) {
	// try {
	// afsh = MedrexClientManager.getInstance().getAdmissionFromSubHead(cs
	// .getFromSubId());
	// } catch (RemoteException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// } catch (MedrexException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }
	// if (afsh != null) {
	// temp += " : " + afsh.getName();
	// }
	// Users user = null;
	// try {
	// user = MedrexClientManager.getInstance().getUser(cs.getAdministeredBy());
	// } catch (RemoteException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// } catch (MedrexException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// try {
	// rm = MedrexClientManager.getInstance()
	// .getResident(cs.getResidentId());
	// } catch (RemoteException e1) {
	// e1.printStackTrace();
	// } catch (MedrexException e1) {
	// e1.printStackTrace();
	// }
	// car.setAbcd(rm.getUserPass() + ", "
	// + rm.getUserName());
	// car.setARoom(rm.getRoom());
	// car.setAComeFrom(temp);
	// car.setAUser(user.getUserName());
	//
	// aList.add(car);
	// }
	// l.add(aList);
	//		
	// //Discharge
	// Iterator it2 = dischargeList.iterator();
	// while (it2.hasNext()) {
	// CensusDischargeReport cdr = new CensusDischargeReport();
	// CensusStatus cs = (CensusStatus) it2.next();
	// String t = "";
	// if(cs.getTypeName().equalsIgnoreCase("Discharge")){
	// t = "Discharge";
	// if(cs.getDischargeType() == 1) { t += " : " + "Discharge"; }
	// if(cs.getDischargeType() == 2) { t += " : " + "E R"; }
	// if(cs.getDischargeType() == 3) { t += " : " + "Out Of Pass"; }
	// if(cs.getDischargeType() == 4) { t += " : " + "Expired"; }
	// }
	//			
	// Users user = null;
	// try {
	// user = MedrexClientManager.getInstance().getUser(cs.getAdministeredBy());
	// } catch (RemoteException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// } catch (MedrexException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// try {
	// rm = MedrexClientManager.getInstance()
	// .getResident(cs.getResidentId());
	// } catch (RemoteException e1) {
	// e1.printStackTrace();
	// } catch (MedrexException e1) {
	// e1.printStackTrace();
	// }
	// cdr.setDResidentId(rm.getUserPass() + ", "
	// + rm.getUserName());
	// cdr.setDRoom(rm.getRoom());
	// cdr.setDWentTo(t);
	// cdr.setDUser(user.getUserName());
	//
	// dList.add(cdr);
	// }
	// l.add(dList);
	//		
	// //OutOnPass
	// Iterator it3 = outOnPassList.iterator();
	// while (it3.hasNext()) {
	// CensusOutOnPassReport coopr = new CensusOutOnPassReport();
	// CensusStatus cs = (CensusStatus) it3.next();
	//			
	// Users user = null;
	// try {
	// user = MedrexClientManager.getInstance().getUser(cs.getAdministeredBy());
	// } catch (RemoteException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// } catch (MedrexException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// try {
	// rm = MedrexClientManager.getInstance()
	// .getResident(cs.getResidentId());
	// } catch (RemoteException e1) {
	// e1.printStackTrace();
	// } catch (MedrexException e1) {
	// e1.printStackTrace();
	// }
	// coopr.setOResidentId(rm.getUserPass() + ", "
	// + rm.getUserName());
	// coopr.setORoom(rm.getRoom());
	// coopr.setOUser(user.getUserName());
	//
	// oList.add(coopr);
	// }
	// l.add(oList);
	//		
	// //Hospital
	// Iterator it4 = hospitalList.iterator();
	// while (it4.hasNext()) {
	// CensusHospitalReport chr = new CensusHospitalReport();
	// CensusStatus cs = (CensusStatus) it4.next();
	// if (cs.getFromSubId() != 0) {
	// try {
	// afsh = MedrexClientManager.getInstance().getAdmissionFromSubHead(cs
	// .getFromSubId());
	// } catch (RemoteException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// } catch (MedrexException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }
	// String temp = "";
	// if(cs.getFromId() == 1) {
	// temp += "Hospital";
	// }
	// if (afsh != null) {
	// temp += " : " + afsh.getName();
	// }
	// Users user = null;
	// try {
	// user = MedrexClientManager.getInstance().getUser(cs.getAdministeredBy());
	// } catch (RemoteException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// } catch (MedrexException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// try {
	// rm = MedrexClientManager.getInstance()
	// .getResident(cs.getResidentId());
	// } catch (RemoteException e1) {
	// e1.printStackTrace();
	// } catch (MedrexException e1) {
	// e1.printStackTrace();
	// }
	// chr.setHResidentId(rm.getUserPass() + ", "
	// + rm.getUserName());
	// chr.setHHospital(temp);
	// chr.setHUser(user.getUserName());
	//
	// hList.add(chr);
	// }
	// l.add(hList);
	//		
	// FrameListReport frl = new FrameListReport(aList, dList, oList, hList,
	// dcDate.getDate());
	// frl.setVisible(true);
	//		
	// }

	// protected void makeFloorWiseReport() {
	// // List l = new ArrayList();
	// SimpleDateFormat df = new SimpleDateFormat();
	// df.applyPattern("MMM dd, yyyy  hh:mm a");
	// Date date = dcDate.getDate();
	// // Map parameters = new HashMap();
	// List<CensusStatus> admissionList = null;
	// List<CensusStatus> dischargeList = null;
	// List<CensusStatus> outOnPassList = null;
	// List<CensusStatus> hospitalList = null;
	//
	// try {
	// admissionList =
	// MedrexClientManager.getInstance().getCensusDayReportAdmissionList(date);
	// dischargeList =
	// MedrexClientManager.getInstance().getCensusDayReportDischargeList(date);
	// outOnPassList =
	// MedrexClientManager.getInstance().getCensusDayReportOutOnPassList(date);
	// hospitalList =
	// MedrexClientManager.getInstance().getCensusDayReportHospitalList(date);
	// } catch (RemoteException e2) {
	// // TODO Auto-generated catch block
	// e2.printStackTrace();
	// } catch (MedrexException e2) {
	// // TODO Auto-generated catch block
	// e2.printStackTrace();
	// }
	// List<CensusAdmissionReportI> aList = new
	// ArrayList<CensusAdmissionReportI>();
	// List<CensusDischargeReportI> dList = new
	// ArrayList<CensusDischargeReportI>();
	// List<CensusOutOnPassReportI> oList = new
	// ArrayList<CensusOutOnPassReportI>();
	// List<CensusHospitalReportI> hList = new
	// ArrayList<CensusHospitalReportI>();
	//
	// List<CensusAdmissionReportI> aList_II = new
	// ArrayList<CensusAdmissionReportI>();
	// List<CensusDischargeReportI> dList_II = new
	// ArrayList<CensusDischargeReportI>();
	// List<CensusOutOnPassReportI> oList_II = new
	// ArrayList<CensusOutOnPassReportI>();
	// List<CensusHospitalReportI> hList_II = new
	// ArrayList<CensusHospitalReportI>();
	//		
	// Users u = null;
	// ResidentMain rm = null;
	// AdmissionFromSubHead afsh = null;
	// AdmissionTransportation aft = null;
	//		
	// // Admission
	// Iterator it = admissionList.iterator();
	// while (it.hasNext()) {
	// CensusAdmissionReportI car = new CensusAdmissionReportI();
	// CensusStatus cs = (CensusStatus) it.next();
	// String temp = "";
	// if(cs.getFromId() == 1) {
	// temp += "Hospital";
	// } else if (cs.getFromId() == 2) {
	// temp += "Home";
	// } else if(cs.getFromId() == 3) {
	// temp += "Other Facility";
	// } else if(cs.getFromId() == 4) {
	// temp += "Other";
	// }
	// if (cs.getFromSubId() != 0) {
	// try {
	// afsh = MedrexClientManager.getInstance().getAdmissionFromSubHead(cs
	// .getFromSubId());
	// } catch (RemoteException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// } catch (MedrexException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }
	// if (afsh != null) {
	// temp += " : " + afsh.getName();
	// }
	// Users user = null;
	//
	// try {
	// rm = MedrexClientManager.getInstance()
	// .getResident(cs.getResidentId());
	// } catch (RemoteException e1) {
	// e1.printStackTrace();
	// } catch (MedrexException e1) {
	// e1.printStackTrace();
	// }
	// car.setAbcd(rm.getUserPass() + ", "
	// + rm.getUserName());
	// car.setARoom(rm.getRoom());
	// car.setAComeFrom(temp);
	// if(user != null) {
	// car.setAUser(user.getUserName());
	// }
	//			
	//			
	// if("1st floor south wing".equalsIgnoreCase(rm.getFloorType()) ||
	// "Main North Wing".equalsIgnoreCase(rm.getFloorType())) {
	// aList.add(car);
	// } else {
	// aList_II.add(car);
	// }
	//
	// // l.add(aList);
	// }
	//		
	// //Discharge
	// Iterator it2 = dischargeList.iterator();
	// while (it2.hasNext()) {
	// CensusDischargeReportI cdr = new CensusDischargeReportI();
	// CensusStatus cs = (CensusStatus) it2.next();
	// String t = "";
	// if(cs.getTypeName().equalsIgnoreCase("Discharge")){
	// t = "Discharge";
	// if(cs.getDischargeType() == 1) { t += " : " + "Discharge"; }
	// if(cs.getDischargeType() == 2) { t += " : " + "E R"; }
	// if(cs.getDischargeType() == 3) { t += " : " + "Out Of Pass"; }
	// if(cs.getDischargeType() == 4) { t += " : " + "Expired"; }
	// }
	//			
	// Users user = null;
	//			
	//
	// try {
	// rm = MedrexClientManager.getInstance()
	// .getResident(cs.getResidentId());
	// rh =
	// MedrexClientManager.getInstance().getRoomHistoryAccToCensus(cs.getSerial());
	// } catch (RemoteException e1) {
	// e1.printStackTrace();
	// } catch (MedrexException e1) {
	// e1.printStackTrace();
	// }
	// cdr.setDResidentId(rm.getUserPass() + ", "
	// + rm.getUserName());
	// if(rh != null) {
	// cdr.setDRoom(rh.getRoom());
	// }
	// cdr.setDWentTo(t);
	// if(user != null) {
	// cdr.setDUser(user.getUserName());
	// }
	//
	// if("1st floor south wing".equalsIgnoreCase(rm.getFloorType()) ||
	// "Main North Wing".equalsIgnoreCase(rm.getFloorType())) {
	// dList.add(cdr);
	// } else {
	// dList_II.add(cdr);
	// }
	//
	// // l.add(dList);
	// }
	//		
	// //OutOnPass
	// Iterator it3 = outOnPassList.iterator();
	// while (it3.hasNext()) {
	// CensusOutOnPassReportI coopr = new CensusOutOnPassReportI();
	// CensusStatus cs = (CensusStatus) it3.next();
	//			
	// Users user = null;
	// try {
	// user = MedrexClientManager.getInstance().getUser(cs.getAdministeredBy());
	// } catch (RemoteException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// } catch (MedrexException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// try {
	// rm = MedrexClientManager.getInstance()
	// .getResident(cs.getResidentId());
	// rh =
	// MedrexClientManager.getInstance().getRoomHistoryAccToCensus(cs.getSerial());
	// } catch (RemoteException e1) {
	// e1.printStackTrace();
	// } catch (MedrexException e1) {
	// e1.printStackTrace();
	// }
	// coopr.setOResidentId(rm.getUserPass() + ", "
	// + rm.getUserName());
	// if(rh != null) {
	// coopr.setORoom(rh.getRoom());
	// }
	// if(user != null) {
	// coopr.setOUser(user.getUserName());
	// }
	//
	// if("1st floor south wing".equalsIgnoreCase(rm.getFloorType()) ||
	// "Main North Wing".equalsIgnoreCase(rm.getFloorType())) {
	// oList.add(coopr);
	// } else {
	// oList_II.add(coopr);
	// }
	// }
	// // l.add(oList);
	//		
	// //Hospital
	// Iterator it4 = hospitalList.iterator();
	// while (it4.hasNext()) {
	// CensusHospitalReportI chr = new CensusHospitalReportI();
	// CensusStatus cs = (CensusStatus) it4.next();
	// if (cs.getFromSubId() != 0) {
	// try {
	// afsh = MedrexClientManager.getInstance().getAdmissionFromSubHead(cs
	// .getFromSubId());
	// } catch (RemoteException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// } catch (MedrexException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }
	// String temp = "";
	// if(cs.getFromId() == 1) {
	// temp += "Hospital";
	// }
	// if (afsh != null) {
	// temp += " : " + afsh.getName();
	// }
	// Users user = null;
	// try {
	// user = MedrexClientManager.getInstance().getUser(cs.getAdministeredBy());
	// } catch (RemoteException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// } catch (MedrexException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// try {
	// rm = MedrexClientManager.getInstance()
	// .getResident(cs.getResidentId());
	// } catch (RemoteException e1) {
	// e1.printStackTrace();
	// } catch (MedrexException e1) {
	// e1.printStackTrace();
	// }
	// chr.setHResidentId(rm.getUserPass() + ", "
	// + rm.getUserName());
	// chr.setHHospital(temp);
	// if(user != null) {
	// chr.setHUser(user.getUserName());
	// }
	//
	// if("1st floor south wing".equalsIgnoreCase(rm.getFloorType()) ||
	// "Main North Wing".equalsIgnoreCase(rm.getFloorType())) {
	// hList.add(chr);
	// } else {
	// hList_II.add(chr);
	// }
	// }
	// // l.add(hList);
	//		
	// FrameListReport frl = new FrameListReport(aList, dList, oList, hList,
	// aList_II, dList_II, oList_II, hList_II, dcDate.getDate());
	// frl.setVisible(true);
	// }

	protected void makeADayReport() {
		if (dcDate.getDate() != null) {
			// try {
			// JasperCompileManager.compileReportToFile(
			// "report/censusDayReport/CensusDayReport.jrxml",
			// "report/censusDayReport/CensusDayReport.jasper");
			// } catch (JRException e1) {
			// e1.printStackTrace();
			// }
			// List l = new ArrayList();
			// SimpleDateFormat df = new SimpleDateFormat();
			// df.applyPattern("MMM dd, yyyy  hh:mm a");
			// Date date = dcDate.getDate();
			// Map parameters = new HashMap();
			// List<CensusStatus> admissionList = null;
			// List<CensusStatus> dischargeList = null;
			// List<CensusStatus> outOnPassList = null;
			// List<CensusStatus> hospitalList = null;
			// try {
			// admissionList =
			// MedrexClientManager.getInstance().getCensusDayReportAdmissionList(date);
			// dischargeList =
			// MedrexClientManager.getInstance().getCensusDayReportDischargeList(date);
			// outOnPassList =
			// MedrexClientManager.getInstance().getCensusDayReportOutOnPassList(date);
			// hospitalList =
			// MedrexClientManager.getInstance().getCensusDayReportHospitalList(date);
			// } catch (RemoteException e2) {
			// // TODO Auto-generated catch block
			// e2.printStackTrace();
			// } catch (MedrexException e2) {
			// // TODO Auto-generated catch block
			// e2.printStackTrace();
			// }
			// List<CensusAdmissionReport> aList = new
			// ArrayList<CensusAdmissionReport>();
			// List<CensusDischargeReport> dList = new
			// ArrayList<CensusDischargeReport>();
			// List<CensusOutOnPassReport> oList = new
			// ArrayList<CensusOutOnPassReport>();
			// List<CensusHospitalReport> hList = new
			// ArrayList<CensusHospitalReport>();
			//			
			// Users u = null;
			// ResidentMain rm = null;
			// AdmissionFromSubHead afsh = null;
			// AdmissionTransportation aft = null;
			//			
			// // Admission
			// Iterator it = admissionList.iterator();
			// while (it.hasNext()) {
			// CensusAdmissionReport car = new CensusAdmissionReport();
			// CensusStatus cs = (CensusStatus) it.next();
			// String temp = "";
			// if(cs.getFromId() == 1) {
			// temp += "Hospital";
			// } else if (cs.getFromId() == 2) {
			// temp += "Home";
			// } else if(cs.getFromId() == 3) {
			// temp += "Other Facility";
			// } else if(cs.getFromId() == 4) {
			// temp += "Other";
			// }
			// if (cs.getFromSubId() != 0) {
			// try {
			// afsh =
			// MedrexClientManager.getInstance().getAdmissionFromSubHead(cs
			// .getFromSubId());
			// } catch (RemoteException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// } catch (MedrexException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			// }
			// if (afsh != null) {
			// temp += " : " + afsh.getName();
			// }
			// Users user = null;
			// try {
			// user =
			// MedrexClientManager.getInstance().getUser(cs.getAdministeredBy());
			// } catch (RemoteException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// } catch (MedrexException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			// try {
			// rm = MedrexClientManager.getInstance()
			// .getResident(cs.getResidentId());
			// } catch (RemoteException e1) {
			// e1.printStackTrace();
			// } catch (MedrexException e1) {
			// e1.printStackTrace();
			// }
			// car.setAresidentid(rm.getUserPass() + ", "
			// + rm.getUserName());
			// car.setAroom(rm.getRoom());
			// car.setAcomefrom(temp);
			// car.setAuser(user.getUserName());
			// car.setAcount(Integer.toString(admissionList.size()));
			//
			// aList.add(car);
			// }
			// // l.add(aList);
			//			
			// //Discharge
			// Iterator it2 = dischargeList.iterator();
			// while (it2.hasNext()) {
			// CensusDischargeReport cdr = new CensusDischargeReport();
			// CensusStatus cs = (CensusStatus) it2.next();
			// String t = "";
			// if(cs.getTypeName().equalsIgnoreCase("Discharge")){
			// t = "Discharge";
			// if(cs.getDischargeType() == 1) { t += " : " + "Discharge"; }
			// if(cs.getDischargeType() == 2) { t += " : " + "E R"; }
			// if(cs.getDischargeType() == 3) { t += " : " + "Out Of Pass"; }
			// if(cs.getDischargeType() == 4) { t += " : " + "Expired"; }
			// }
			//				
			// Users user = null;
			// try {
			// user =
			// MedrexClientManager.getInstance().getUser(cs.getAdministeredBy());
			// } catch (RemoteException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// } catch (MedrexException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			// try {
			// rm = MedrexClientManager.getInstance()
			// .getResident(cs.getResidentId());
			// rh =
			// MedrexClientManager.getInstance().getRoomHistoryAccToCensus(cs.getSerial());
			// } catch (RemoteException e1) {
			// e1.printStackTrace();
			// } catch (MedrexException e1) {
			// e1.printStackTrace();
			// }
			// cdr.setDresidentid(rm.getUserPass() + ", "
			// + rm.getUserName());
			// cdr.setDroom(rh.getRoom());
			// cdr.setDwentto(t);
			// cdr.setDuser(user.getUserName());
			// cdr.setDcount(Integer.toString(dischargeList.size()));
			//
			// dList.add(cdr);
			// }
			// // l.add(dList);
			//			
			// //OutOnPass
			// Iterator it3 = outOnPassList.iterator();
			// while (it3.hasNext()) {
			// CensusOutOnPassReport coopr = new CensusOutOnPassReport();
			// CensusStatus cs = (CensusStatus) it3.next();
			//				
			// Users user = null;
			// try {
			// user =
			// MedrexClientManager.getInstance().getUser(cs.getAdministeredBy());
			// } catch (RemoteException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// } catch (MedrexException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			// try {
			// rm = MedrexClientManager.getInstance()
			// .getResident(cs.getResidentId());
			// rh =
			// MedrexClientManager.getInstance().getRoomHistoryAccToCensus(cs.getSerial());
			// } catch (RemoteException e1) {
			// e1.printStackTrace();
			// } catch (MedrexException e1) {
			// e1.printStackTrace();
			// }
			// coopr.setOresidentid(rm.getUserPass() + ", "
			// + rm.getUserName());
			// coopr.setOroom(rh.getRoom());
			// coopr.setOuser(user.getUserName());
			// coopr.setOcount(Integer.toString(outOnPassList.size()));
			//
			// oList.add(coopr);
			// }
			// // l.add(oList);
			//			
			// //Hospital
			// Iterator it4 = hospitalList.iterator();
			// while (it4.hasNext()) {
			// CensusHospitalReport chr = new CensusHospitalReport();
			// CensusStatus cs = (CensusStatus) it4.next();
			// if (cs.getFromSubId() != 0) {
			// try {
			// afsh =
			// MedrexClientManager.getInstance().getAdmissionFromSubHead(cs
			// .getFromSubId());
			// } catch (RemoteException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// } catch (MedrexException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			// }
			// String temp = "";
			// if(cs.getFromId() == 1) {
			// temp += "Hospital";
			// }
			// if (afsh != null) {
			// temp += " : " + afsh.getName();
			// }
			// Users user = null;
			// try {
			// user =
			// MedrexClientManager.getInstance().getUser(cs.getAdministeredBy());
			// } catch (RemoteException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// } catch (MedrexException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			// try {
			// rm = MedrexClientManager.getInstance()
			// .getResident(cs.getResidentId());
			// } catch (RemoteException e1) {
			// e1.printStackTrace();
			// } catch (MedrexException e1) {
			// e1.printStackTrace();
			// }
			// chr.setHresidentid(rm.getUserPass() + ", "
			// + rm.getUserName());
			// chr.setHhospital(temp);
			// chr.setHuser(user.getUserName());
			// chr.setHcount(Integer.toString(hospitalList.size()));
			//
			// hList.add(chr);
			// }
			// l.add(hList);
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MMM dd, yyyy  hh:mm a");
			Date date = dcDate.getDate();
			// date.setHours(23);
			// date.setMinutes(59);
			List<CensusStatus> admissionList = null;
			List<CensusStatus> dischargeList = null;
			List<OutOfPass> outOnPassList = null;
			List<Hospital> hospitalList = null;
			List<SignOut> signOutEr = null;

			// CensusDayReport cad = new CensusDayReport();
			try {
				admissionList = MedrexClientManager.getInstance()
						.getCensusDayReportAdmissionList(date);
				dischargeList = MedrexClientManager.getInstance()
						.getCensusDayReportDischargeList(date);
				outOnPassList = MedrexClientManager.getInstance()
						.getOutOfPassForResidents(date);
				hospitalList = MedrexClientManager.getInstance()
						.getHospitalForResidents(date);
				signOutEr = MedrexClientManager.getInstance()
						.getErForResidents(date);

			} catch (RemoteException e2) {

				e2.printStackTrace();
			} catch (MedrexException e2) {

				e2.printStackTrace();
			}
			List<CensusAdmissionReport> aList = new ArrayList<CensusAdmissionReport>();
			List<CensusDischargeReport> dList = new ArrayList<CensusDischargeReport>();
			List<CensusOutOnPassReport> oList = new ArrayList<CensusOutOnPassReport>();
			List<CensusHospitalReport> hList = new ArrayList<CensusHospitalReport>();
			List<CensusErReport> erList1st = new ArrayList<CensusErReport>();

			List<CensusAdmissionReport> aList_II = new ArrayList<CensusAdmissionReport>();
			List<CensusDischargeReport> dList_II = new ArrayList<CensusDischargeReport>();
			List<CensusOutOnPassReport> oList_II = new ArrayList<CensusOutOnPassReport>();
			List<CensusHospitalReport> hList_II = new ArrayList<CensusHospitalReport>();
			List<CensusErReport> erList2nd = new ArrayList<CensusErReport>();

			ResidentMain rm = null;
			AdmissionFromSubHead afsh = null;
			// ER
			Iterator i = signOutEr.iterator();
			while (i.hasNext()) {
				TempRoomHistory trh = new TempRoomHistory();
				CensusErReport er = new CensusErReport();
				SignOut cs = (SignOut) i.next();
				// String temp = "";
				try {
					rm = MedrexClientManager.getInstance().getResident(
							cs.getResidentId());

					trh = MedrexClientManager.getInstance()
							.getRoomHistoriesForResident(cs.getSerial(),
									cs.getSignOutDate());

				} catch (RemoteException e1) {
					e1.printStackTrace();
				} catch (MedrexException e1) {
					e1.printStackTrace();
				}
				er.setErResidentId(rm.getUserPass() + ", " + rm.getUserName());
				er.setErDate(new Date() + "");
				if ("1st floor south wing".equalsIgnoreCase(trh.getFloor())
						|| "Main North Wing".equalsIgnoreCase(trh.getFloor())) {
					er.setErCount(Integer.toString(erList1st.size()));
					erList1st.add(er);
				} else if ("2nd floor South Wing".equalsIgnoreCase(trh
						.getFloor())
						|| "Main and north wing".equalsIgnoreCase(trh
								.getFloor())) {
					er.setErSFCount(Integer.toString(erList2nd.size()));
					erList2nd.add(er);

				}
				// System.out.println("er Res:"+er.getErResidentId()+erList1st.size()+","+erList2nd.size());
			}
			// List<CensusDayReport> cadList = new ArrayList<CensusDayReport>();

			// Admission
			Iterator it = admissionList.iterator();
			while (it.hasNext()) {
				CensusAdmissionReport car = new CensusAdmissionReport();
				CensusStatus cs = (CensusStatus) it.next();
				String temp = "";
				if (cs.getFromId() == 1) {
					temp += "Hospital";
				} else if (cs.getFromId() == 2) {
					temp += "Home";
				} else if (cs.getFromId() == 3) {
					temp += "Other Facility";
				} else if (cs.getFromId() == 4) {
					temp += "Other";
				}
				if (cs.getFromSubId() != 0) {
					try {
						afsh = MedrexClientManager.getInstance()
								.getAdmissionFromSubHead(cs.getFromSubId());
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (MedrexException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if (afsh != null) {
					temp += " : " + afsh.getName();
				}
				Users user = null;
				try {
					user = MedrexClientManager.getInstance().getUser(
							cs.getAdministeredBy());
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (MedrexException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				try {
					rm = MedrexClientManager.getInstance().getResident(
							cs.getResidentId());
				} catch (RemoteException e1) {
					e1.printStackTrace();
				} catch (MedrexException e1) {
					e1.printStackTrace();
				}
				TempRoomHistory trh = new TempRoomHistory();
				try {
					// System.out.println("dis serial is :" + cs.getSerial());
					if (cs.getSerial() != 0)
						trh = MedrexClientManager
								.getInstance()
								.getRoomForResident(cs.getSerial(), "Admission");
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (MedrexException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				car.setAresidentid(rm.getUserPass() + "," + rm.getUserName());
				if (trh != null) {
					car.setAroom(trh.getRoom());
					car.setAcomefrom(temp);
					if (user != null) {
						car.setAuser(user.getUserName());
					}

					if ("1st floor south wing".equalsIgnoreCase(trh.getFloor())
							|| "Main North Wing".equalsIgnoreCase(trh
									.getFloor())) {
						car.setAcount(Integer.toString(aList.size()));
						aList.add(car);
					} else if ("2nd floor South Wing".equalsIgnoreCase(trh
							.getFloor())
							|| "Main and north wing".equalsIgnoreCase(trh
									.getFloor())) {
						car.setAcount(Integer.toString(aList_II.size()));
						aList_II.add(car);
					}
				}
				// l.add(aList);
			}
			// if("1st floor south wing".equalsIgnoreCase(rm.getFloorType()) ||
			// "Main North Wing".equalsIgnoreCase(rm.getFloorType())) {
			// cad.setAcount(Integer.toString(aList.size()));
			// } else {
			// cad.setAcountsf(Integer.toString(aList_II.size()));
			// }

			// Discharge
			Iterator it2 = dischargeList.iterator();
			while (it2.hasNext()) {
				CensusDischargeReport cdr = new CensusDischargeReport();
				CensusStatus cs = (CensusStatus) it2.next();
				String t = "";
				if (cs.getTypeName().equalsIgnoreCase("Discharge")) {
					t = "Discharge";
					if (cs.getDischargeType() == 1) {
						t += " : " + "Discharge";
					}
					if (cs.getDischargeType() == 2) {
						t += " : " + "E R";
					}
					if (cs.getDischargeType() == 3) {
						t += " : " + "Out Of Pass";
					}
					if (cs.getDischargeType() == 4) {
						t += " : " + "Expired";
					}
				}

				Users user = null;
				try {
					user = MedrexClientManager.getInstance().getUser(
							cs.getAdministeredBy());
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (MedrexException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				try {
					rm = MedrexClientManager.getInstance().getResident(
							cs.getResidentId());
					rh = MedrexClientManager.getInstance()
							.getRoomHistoryAccToCensusDischarge(cs.getSerial());
				} catch (RemoteException e1) {
					e1.printStackTrace();
				} catch (MedrexException e1) {
					e1.printStackTrace();
				}
				/*
				 * TempRoomHistory trh = new TempRoomHistory(); try { //
				 * System.out.println("ad serial is :" + cs.getSerial()); if
				 * (cs.getSerial() != 0) trh =
				 * MedrexClientManager.getInstance().
				 * getRoomForResident(cs.getSerial(), "Discharge"); } catch
				 * (RemoteException e) { // TODO Auto-generated catch block
				 * e.printStackTrace(); } catch (MedrexException e) { // TODO
				 * Auto-generated catch block e.printStackTrace(); }
				 */
				cdr.setDresidentid(rm.getUserPass() + ", " + rm.getUserName());
				if (rh != null) {
					cdr.setDroom(rh.getRoom());
				}
				cdr.setDwentto(t);
				if (user != null) {
					cdr.setDuser(user.getUserName());
				}

				if ("1st floor south wing".equalsIgnoreCase(rh.getFloor())
						|| "Main North Wing".equalsIgnoreCase(rh.getFloor())) {
					dList.add(cdr);
				} else if ("2nd floor South Wing".equalsIgnoreCase(rh
						.getFloor())
						|| "Main and north wing"
								.equalsIgnoreCase(rh.getFloor())) {
					dList_II.add(cdr);
				}

				// l.add(dList);
			}
			// if("1st floor south wing".equalsIgnoreCase(rm.getFloorType()) ||
			// "Main North Wing".equalsIgnoreCase(rm.getFloorType())) {
			// cad.setDcount(Integer.toString(dList.size()));
			// } else {
			// cad.setDcountsf(Integer.toString(dList_II.size()));
			// }
			// OutOnPass
			Iterator<OutOfPass> it3 = outOnPassList.iterator();
			while (it3.hasNext()) {
				CensusOutOnPassReport coopr = new CensusOutOnPassReport();
				OutOfPass oop = it3.next();
				CensusStatus cs = oop.getCensusStatus();

				Users user = null;
				try {
					user = MedrexClientManager.getInstance().getUser(
							cs.getAdministeredBy());
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (MedrexException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					rm = MedrexClientManager.getInstance().getResident(
							cs.getResidentId());
					rh = MedrexClientManager.getInstance()
							.getRoomHistoryAccToCensusDischarge(cs.getSerial());
				} catch (RemoteException e1) {
					e1.printStackTrace();
				} catch (MedrexException e1) {
					e1.printStackTrace();
				}
				coopr
						.setOresidentid(rm.getUserPass() + ", "
								+ rm.getUserName());
				if (rh != null) {
					coopr.setOroom(rh.getRoom());
				}
				if (user != null) {
					coopr.setOuser(user.getUserName());
				}

				if ("1st floor south wing".equalsIgnoreCase(rh.getFloor())
						|| "Main North Wing".equalsIgnoreCase(rh.getFloor())) {
					oList.add(coopr);
				} else if ("2nd floor South Wing".equalsIgnoreCase(rh
						.getFloor())
						|| "Main and north wing"
								.equalsIgnoreCase(rh.getFloor())) {
					oList_II.add(coopr);
				}
			}
			// if("1st floor south wing".equalsIgnoreCase(rm.getFloorType()) ||
			// "Main North Wing".equalsIgnoreCase(rm.getFloorType())) {
			// cad.setOcount(Integer.toString(oList.size()));
			// } else {
			// cad.setOcountsf(Integer.toString(oList_II.size()));
			// }
			// l.add(oList);

			// Hospital
			Iterator<Hospital> it4 = hospitalList.iterator();
			while (it4.hasNext()) {
				CensusHospitalReport chr = new CensusHospitalReport();
				Hospital hosp = it4.next();
				CensusStatus cs = hosp.getCensusStatus();

				if (cs.getFromSubId() != 0) {
					try {
						afsh = MedrexClientManager.getInstance()
								.getAdmissionFromSubHead(cs.getFromSubId());
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (MedrexException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				String temp = "";
				if (cs.getFromId() == 1) {
					temp += "Hospital";
				}
				if (afsh != null) {
					temp += " : " + afsh.getName();
				}
				Users user = null;
				TempRoomHistory trh = new TempRoomHistory();
				try {
					user = MedrexClientManager.getInstance().getUser(
							cs.getAdministeredBy());
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (MedrexException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					rm = MedrexClientManager.getInstance().getResident(
							cs.getResidentId());
					trh = MedrexClientManager.getInstance()
							.getRoomHistoriesForResident(cs.getResidentId(),
									cs.getDateAndTime());
				} catch (RemoteException e1) {
					e1.printStackTrace();
				} catch (MedrexException e1) {
					e1.printStackTrace();
				}
				chr.setHresidentid(rm.getUserPass() + ", " + rm.getUserName());
				chr.setHhospital(temp);
				chr.setHcount(Integer.toString(hospitalList.size()));
				if (user != null) {
					chr.setHuser(user.getUserName());
				}
				if (trh != null) {
					if ("1st floor south wing".equalsIgnoreCase(trh.getFloor())
							|| "Main North Wing".equalsIgnoreCase(trh
									.getFloor())) {
						hList.add(chr);
					} else if ("2nd floor South Wing".equalsIgnoreCase(trh
							.getFloor())
							|| "Main and north wing".equalsIgnoreCase(trh
									.getFloor())) {
						hList_II.add(chr);
					}
				}

			}

			// fCount = aList.size() + dList.size() + oList.size() +
			// hList.size();
			// sCount = aList_II.size() + dList_II.size() + oList_II.size() +
			// hList_II.size();
			List l1 = null;
			List l2 = null;
			try {
				l1 = MedrexClientManager.getInstance().getFirstFloorResidents(
						date);
				l2 = MedrexClientManager.getInstance().getSecondFloorResidents(
						date);
			} catch (RemoteException e1) {
				e1.printStackTrace();
			} catch (MedrexException e1) {
				e1.printStackTrace();
			}
			String ffCount = Integer.toString(l1.size());
			String sfCount = Integer.toString(l2.size());
			// System.out.println("Counts are :" + ffCount +", " + sfCount);

			// if("1st floor south wing".equalsIgnoreCase(rm.getFloorType()) ||
			// "Main North Wing".equalsIgnoreCase(rm.getFloorType())) {
			// cad.setHcount(Integer.toString(hList.size()));
			// } else {
			// cad.setHcountsf(Integer.toString(hList_II.size()));
			// }

			// cadList.add(cad);
			//			
			// JRBeanArrayDataSource cadDataSource;
			// Object[] cadreportRows = cadList.toArray();
			// cadDataSource = new JRBeanArrayDataSource(cadreportRows);

			// ER
			JRBeanArrayDataSource erDataSource;
			Object[] erReportRows = erList1st.toArray();
			erDataSource = new JRBeanArrayDataSource(erReportRows);

			JRBeanArrayDataSource er2DataSource;
			Object[] er2ReportRows = erList2nd.toArray();
			er2DataSource = new JRBeanArrayDataSource(er2ReportRows);
			// ER
			JRBeanArrayDataSource admissionDataSource;
			Object[] admissionreportRows = aList.toArray();
			admissionDataSource = new JRBeanArrayDataSource(admissionreportRows);

			JRBeanArrayDataSource dischargeDataSource;
			Object[] dischargereportRows = dList.toArray();
			dischargeDataSource = new JRBeanArrayDataSource(dischargereportRows);

			JRBeanArrayDataSource outOnPassDataSource;
			Object[] outOnPassReportRows = oList.toArray();
			outOnPassDataSource = new JRBeanArrayDataSource(outOnPassReportRows);

			JRBeanArrayDataSource hospitalDataSource;
			Object[] hospitalReportRows = hList.toArray();
			hospitalDataSource = new JRBeanArrayDataSource(hospitalReportRows);

			JRBeanArrayDataSource admissionSFDataSource;
			Object[] admissionsfreportRows = aList_II.toArray();
			admissionSFDataSource = new JRBeanArrayDataSource(
					admissionsfreportRows);

			JRBeanArrayDataSource dischargeSFDataSource;
			Object[] dischargesfreportRows = dList_II.toArray();
			dischargeSFDataSource = new JRBeanArrayDataSource(
					dischargesfreportRows);

			JRBeanArrayDataSource outOnPassSFDataSource;
			Object[] outOnPasssfreportRows = oList_II.toArray();
			outOnPassSFDataSource = new JRBeanArrayDataSource(
					outOnPasssfreportRows);

			JRBeanArrayDataSource hospitalSFDataSource;
			Object[] hospitalsfReportRows = hList_II.toArray();
			hospitalSFDataSource = new JRBeanArrayDataSource(
					hospitalsfReportRows);

			DateFormat df1 = new SimpleDateFormat("MM/dd/yyyy");
			String dt = df1.format(dcDate.getDate());
			try {
				// JasperReport subreport_1 =
				// (JasperReport)JRLoader.loadObject("report//censusDayReport//CensusDayAdmissionReport.jasper");
				// JasperFillManager.fillReportToFile("report//censusDayReport//CensusDayAdmissionReport.jasper",
				// new HashMap(), admissionDataSource);

				Map parameter1 = new HashMap();
				parameter1.put("ErDataSource", erDataSource);
				parameter1.put("erCount", "" + erList1st.size());

				parameter1.put("erSFDataSource", er2DataSource);
				parameter1.put("erSFCount", "" + erList2nd.size());

				parameter1.put("admissionDataSource", admissionDataSource);
				parameter1.put("admissionCount", "" + aList.size());
				parameter1.put("dischargeDataSource", dischargeDataSource);
				parameter1.put("dischargeCount", "" + dList.size());
				parameter1.put("outOnPassDataSource", outOnPassDataSource);
				parameter1.put("outOnPassCount", "" + oList.size());
				parameter1.put("hospitalDataSource", hospitalDataSource);
				parameter1.put("hospitalCount", "" + hList.size());
				parameter1.put("admissionSFDataSource", admissionSFDataSource);
				parameter1.put("admissionCountSF", "" + aList_II.size());
				parameter1.put("dischargeSFDataSource", dischargeSFDataSource);
				parameter1.put("dischargeCountSF", "" + dList_II.size());
				parameter1.put("outOnPassSFDataSource", outOnPassSFDataSource);
				parameter1.put("outOnPassCountSF", "" + oList_II.size());
				parameter1.put("hospitalSFDataSource", hospitalSFDataSource);
				parameter1.put("hospitalCountSF", "" + hList_II.size());
				parameter1.put("date", "" + dt);
				parameter1.put("firstFloorCount", "" + ffCount);
				parameter1.put("secondFloorCount", "" + sfCount);

				JasperFillManager.fillReportToFile(
						"report//censusDayReport//CensusDayReport.jasper",
						parameter1, new JREmptyDataSource());
				String strPrintData = "report//censusDayReport//report name.jrprint";
				JasperPrint jasperPrint = (JasperPrint) JRLoader
						.loadObject(strPrintData);
				MedrexReportViewer aViwer = new MedrexReportViewer(jasperPrint);
				aViwer.setExportDataFile(strPrintData);
				JFrame aFrame = new JFrame("Report Viewer");
				aFrame.getContentPane().add(aViwer);
				java.awt.Dimension screenSize = java.awt.Toolkit
						.getDefaultToolkit().getScreenSize();
				aFrame.setSize(screenSize.width / 2, screenSize.height / 2);
				java.awt.Insets insets = aFrame.getInsets();
				aFrame.setSize(aFrame.getWidth() + insets.left + insets.right,
						aFrame.getHeight() + insets.top + insets.bottom + 20);
				aFrame.setLocation((screenSize.width - aFrame.getWidth()) / 2,
						(screenSize.height - aFrame.getHeight()) / 2);
				aFrame.show();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

}
