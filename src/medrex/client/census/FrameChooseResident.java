package medrex.client.census;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.loading.FrameLoading;
import medrex.client.utils.SwingUtils;
import medrex.commons.exception.MedrexException;
import medrex.commons.utils.MedrexReportViewer;
import medrex.commons.vo.admission.ResidentAssessmentFormPage1;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.others.Doctors;
import medrex.commons.vo.physician.PhysicianForm;
import medrex.commons.vo.providers.ProvidersRecord;
import medrex.commons.vo.providers.ProvidersRecordForm;
import medrex.commons.vo.providers.ProvidersReport;
import medrex.commons.vo.resident.DiagnosisReport;
import medrex.commons.vo.resident.DoctorsReport;
import medrex.commons.vo.resident.PayerInfoReport;
import medrex.commons.vo.resident.ResidentContact;
import medrex.commons.vo.resident.ResidentDiagnosis;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.ResidentPayerNew;
import medrex.commons.vo.resident.TempRoomHistory;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.util.JRLoader;

import com.sX.swing.JxButton;

public class FrameChooseResident extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8296717275300310807L;
	private JList residentList;
	private static final Color DEF_COLOR = new Color(49, 104, 127);

	public FrameChooseResident() {
		super();
		setModal(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		SwingUtils.center(this);

		setSize(new Dimension(266, 335));
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.WHITE);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 280, 301);
		getContentPane().add(panel);

		final JLabel selectResidentLabel = new JLabel();
		selectResidentLabel.setForeground(DEF_COLOR);
		selectResidentLabel.setHorizontalAlignment(SwingConstants.CENTER);
		selectResidentLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		selectResidentLabel.setText("Select Resident");
		selectResidentLabel.setBounds(10, 0, 243, 24);
		panel.add(selectResidentLabel);

		final JxButton viewReportButton = new JxButton();
		viewReportButton.addActionListener(new ActionListener() {
			private FrameLoading fl;

			public void actionPerformed(final ActionEvent e) {
				fl = new FrameLoading("Loading Report");
				fl.setTitle("Loading...");
				javax.swing.SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						fl.callNotify();
					}
				});
				new Thread(new Runnable() {
					public void run() {
						viewReport();
						dispose();
						fl.dispose();
					}
				}).start();
				fl.setVisible(true);

			}
		});
		viewReportButton.setBorder(new LineBorder(new Color(180, 188, 193), 1,
				false));
		viewReportButton.setBackground(Color.WHITE);
		viewReportButton.setArc(0.4f);
		viewReportButton.setForeground(DEF_COLOR);
		viewReportButton.setFont(new Font("", Font.BOLD, 12));
		viewReportButton.setText("View Report");
		viewReportButton.setBounds(10, 271, 116, 24);
		panel.add(viewReportButton);

		final JxButton sendEmailButton = new JxButton();
		sendEmailButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Object[] objResident = residentList.getSelectedValues();
				for (int i = 0; i < objResident.length; i++) {
					if (objResident[i] instanceof ResidentMain) {
						ResidentMain res = (ResidentMain) objResident[i];
						FrameReportToEmail frameReport = new FrameReportToEmail(
								res);
						dispose();
						SwingUtils.center(frameReport);
						frameReport.setVisible(true);
					}
				}
			}
		});
		sendEmailButton.setBorder(new LineBorder(new Color(180, 188, 193), 1,
				false));
		sendEmailButton.setBackground(Color.WHITE);
		sendEmailButton.setArc(0.4f);
		sendEmailButton.setForeground(DEF_COLOR);
		sendEmailButton.setFont(new Font("", Font.BOLD, 12));
		sendEmailButton.setText("Report To E-mail");
		sendEmailButton.setBounds(147, 271, 107, 24);
		panel.add(sendEmailButton);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 30, 243, 235);
		panel.add(scrollPane);

		residentList = new JList();
		scrollPane.setViewportView(residentList);
		residentList.setForeground(DEF_COLOR);
		residentList.setFont(new Font("", Font.BOLD, 12));
		residentList.setCellRenderer(new DefaultListCellRenderer() {
			/**
			 * 
			 */
			private static final long serialVersionUID = -1160994920545826102L;

			@Override
			public Component getListCellRendererComponent(JList list,
					Object value, int index, boolean isSelected,
					boolean cellHasFocus) {
				JLabel com = (JLabel) super.getListCellRendererComponent(list,
						value, index, isSelected, cellHasFocus);
				if (value instanceof ResidentMain) {
					ResidentMain resident = (ResidentMain) value;
					com.setText(resident.getUserPass() + ", "
							+ resident.getUserName());
				}
				return com;
			}
		});

		doUpdateResidentList();
	}

	public void viewReport() {
		String spouse = null;
		String responsible = null;
		String emergency = null;
		String HospitalPreference = null;
		String ambulance = null;

		Object[] objResident = residentList.getSelectedValues();
		for (int i = 0; i < objResident.length; i++) {
			if (objResident[i] instanceof ResidentMain) {
				ResidentMain res = (ResidentMain) objResident[i];
				// System.out.println("FIRST NAME: "+
				// res.getUserName()+"\nLAST NAME: "+
				// res.getUserPass()+"\nDOB: "+
				// res.getDob()+"\nRESIDENTS ADDRESS: "
				// +res.getAddress()+"\nPHONE: "+ res.getHome()
				// +"Sex: "+res.getSex());

				// System.out.println("Date of Birth" + res.getDob());
				// System.out.println("Marital Status" +
				// res.getMaritalStatus());
				// System.out.println("SSN " + res.getCounty());
				// System.out.println("Language" + res.getLanguage());
				// System.out.println("INS " + res.getInsurance());
				// System.out.println("Scondary Insurance" +
				// res.getInsuranceSec());
				//				
				//				
				// System.out.println("Place of Birth" + res.getBirthPlace());
				// System.out.println("Marital Status" +
				// res.getMaritalStatus());
				// System.out.println("Race / Nationality" + res.get)

				// System.out.println("Pay Type" + res.get)

				// System.out.println("Place of Birth" + res.getBirthPlace());
				// System.out.println("Citizen" + res.getCitizen());
				// System.out.println("Race/Nationality" + res.getReligion());
				// System.out.println("Race/Nationality" + res.getReligion());
				// System.out.println("Religion" + res.getReligion());
				// System.out.println("Medicaid no" + res.getMedicaidNum() );
				// System.out.println("Primary language" + res.getLanguage());

				/*
				 * 
				 * System.out.println("Hospital Preference");
				 * System.out.println("Ambulance Preference");
				 * System.out.println("Power of Attorney");
				 * System.out.println("Educational Level");
				 * System.out.println("Primary Level");
				 */

				try {
					TempRoomHistory roomhist = MedrexClientManager
							.getInstance().getCurrentRoomForResident(
									res.getSerial());
					// System.out.println("Sex " + res.getSex());
					String currentroom = "";
					if (roomhist != null) {
						currentroom = roomhist.getRoom();
						// System.out.println("Station/Roombed" +
						// roomhist.getRoom());
					}

					// Resident contact info
					List<ResidentContact> resContcatList = null;
					resContcatList = MedrexClientManager.getInstance()
							.getResidentContacts(res.getSerial());
					for (ResidentContact rescont : resContcatList) {
						if ("SPOUSE".equalsIgnoreCase(rescont.getRelationship()
								.toString())) {
							// System.out.println("SPOUSE: " +
							// rescont.getRelationship());
							// System.out.println("Name SPOUSE: " +
							// rescont.getLastName()+", "+
							// rescont.getFirstName());
							spouse = rescont.getLastName() + ", "
									+ rescont.getFirstName();
						}
						if (rescont.getResponsibleParty() == 1) {
							// System.out.println("Responsible Party Relation : "
							// + rescont.getRelationship());
							// System.out.println("Responsility party Name: " +
							// rescont.getLastName()+", "+
							// rescont.getFirstName());
							responsible = rescont.getLastName() + ", "
									+ rescont.getFirstName();
						}
						if (rescont.getEmergency() == 1) {
							// System.out.println("Responsible Party Relation : "
							// + rescont.getRelationship());
							// System.out.println("Responsility party Name: " +
							// rescont.getLastName()+", "+
							// rescont.getFirstName());
							emergency = rescont.getLastName() + ", "
									+ rescont.getFirstName();
						}

						if (rescont.getPower() == 1) {
							// System.out.println("Power of Attornay : " +
							// rescont.getPower());

						}

					}

					// for last Admisstion
					CensusStatus censusStatus = MedrexClientManager
							.getInstance().getCensusLastAdmission(
									res.getSerial());

					// for ORIGINAL Admisstion or first time admission
					CensusStatus cenStatus = MedrexClientManager.getInstance()
							.getCensusOriginalAdmission(res.getSerial());

					// for getting last allergies
					ResidentAssessmentFormPage1 residentAssessmentFormPage1 = MedrexClientManager
							.getInstance()
							.getResidentAllergies(res.getSerial());
					List<ResidentPayerNew> tempResidentPayerList = MedrexClientManager
							.getInstance()
							.getResidentPayersNew(res.getSerial());
					List<PayerInfoReport> payerInfoReportList = new ArrayList<PayerInfoReport>();
					if (tempResidentPayerList != null) {
						SimpleDateFormat df = new SimpleDateFormat();
						df.applyPattern("MMM dd, yyyy");

						for (ResidentPayerNew residentPayerNew : tempResidentPayerList) {
							PayerInfoReport payerInfoReport = new PayerInfoReport();
							payerInfoReport.setType(residentPayerNew
									.getInsuranceType());
							payerInfoReport.setStartDate(df
									.format(residentPayerNew.getDateStart()));
							payerInfoReport.setEndDate(df
									.format(residentPayerNew.getEndDate()));
							payerInfoReportList.add(payerInfoReport);
						}
					}

					List<PhysicianForm> phyList = MedrexClientManager
							.getInstance().getPhysicianForms(res.getSerial());
					List<DoctorsReport> doctorReportList = new ArrayList<DoctorsReport>();
					if (phyList != null) {
						for (PhysicianForm phyForm : phyList) {
							DoctorsReport doctorsReport = new DoctorsReport();
							Doctors d = phyForm.getPhysician();// MedrexClientManager.getInstance().getDoctorsRecord(phyForm.getPhysicianId());
							if (d.getPhysicianName().contains("Dr.")) {
								doctorsReport.setDoctors(d.getPhysicianName()
										+ " " + d.getPhysicianSurName());
								doctorsReport
										.setPhoneNumber(d.getPhoneNumber());
								doctorsReport.setDoctorType(d.getDoctorType()
										.toString());
								doctorsReport.setAddress(d.getAddress());
								doctorsReport.setCity(d.getCity());
								if (d.getState() != null) {
									doctorsReport.setState(d.getState()
											.toString());
								}

							} else {
								doctorsReport.setDoctors("Dr. "
										+ d.getPhysicianName() + " "
										+ d.getPhysicianSurName());
								doctorsReport
										.setPhoneNumber(d.getPhoneNumber());
								doctorsReport.setDoctorType(d.getDoctorType()
										.toString());
								doctorsReport.setAddress(d.getAddress());
								doctorsReport.setCity(d.getCity());
								if (d.getState() != null) {
									doctorsReport.setState(d.getState()
											.toString());
								}
							}
							doctorReportList.add(doctorsReport);
						}
					}

					List<ProvidersRecord> prList = MedrexClientManager
							.getInstance().getProvidersRecords(res.getSerial());
					List<ProvidersReport> providersReportList = new ArrayList<ProvidersReport>();
					if (prList != null) {
						for (ProvidersRecord providersRecord : prList) {
							ProvidersRecordForm prForm = MedrexClientManager
									.getInstance().getProvidersRecordForm(
											providersRecord.getProvider()
													.getSerial());
							if (prForm != null) {
								ProvidersReport providersReport = new ProvidersReport();
								providersReport.setProviders(prForm
										.getProviderSurName()
										+ ", " + prForm.getProviderName());
								providersReport.setPhoneNumber(prForm
										.getPhoneNumber());
								providersReport.setProviderType(prForm
										.getProviderType().toString());
								providersReportList.add(providersReport);
								// if("HOSPITAL".equalsIgnoreCase(prForm.getProviderType().toString())){
								HospitalPreference = prForm
										.getProviderSurName()
										+ ", " + prForm.getProviderName();
								// }
								if ("AMBULANCE".equalsIgnoreCase(prForm
										.getProviderType().toString())) {
									ambulance = prForm.getProviderType()
											.toString();
								}
							}
						}
					}

					List<ResidentDiagnosis> listDiagnosis = MedrexClientManager
							.getInstance().getResidentDiagnosiss(
									res.getSerial());
					List<DiagnosisReport> diagnosisReportList = new ArrayList<DiagnosisReport>();
					if (listDiagnosis != null) {
						for (ResidentDiagnosis resDiag : listDiagnosis) {
							DiagnosisReport diagnosisReport = new DiagnosisReport();
							System.out.println("name: " + resDiag.getName());
							diagnosisReport.setDiagnosis(resDiag.getName());
							diagnosisReport.setOrder(resDiag.getOrder() + "");
							diagnosisReportList.add(diagnosisReport);
						}
					}

					JRBeanArrayDataSource payerInfoDataSource;
					Object[] payerInfoReportRows = payerInfoReportList
							.toArray();
					payerInfoDataSource = new JRBeanArrayDataSource(
							payerInfoReportRows);

					JRBeanArrayDataSource doctorsDataSource;
					Object[] doctorsRows = doctorReportList.toArray();
					doctorsDataSource = new JRBeanArrayDataSource(doctorsRows);

					JRBeanArrayDataSource providersDataSource;
					Object[] providersRows = providersReportList.toArray();
					providersDataSource = new JRBeanArrayDataSource(
							providersRows);

					JRBeanArrayDataSource diagnosisDataSource;
					Object[] diagnosisRows = diagnosisReportList.toArray();
					diagnosisDataSource = new JRBeanArrayDataSource(
							diagnosisRows);

					SimpleDateFormat df = new SimpleDateFormat();
					df.applyPattern("MMM dd, yyyy  hh:mm a");

					Map parameters = new HashMap();
					parameters.put("firstName", res.getUserName());
					parameters.put("lastName", res.getUserPass());
					SimpleDateFormat df1 = new SimpleDateFormat();
					df1.applyPattern("MMM dd, yyyy");
					String dobdate = df1.format(res.getDob());
					parameters.put("dob", dobdate);
					parameters.put("address", res.getAddress());
					parameters.put("phoneNumber", res.getHome() + "\n"
							+ res.getWork() + "\n" + res.getCell());
					parameters.put("sex", res.getSex().toString());
					parameters.put("ssn", res.getSs1().toString());
					parameters.put("citizen", res.getCitizen().toString());
					parameters.put("religion", res.getReligion().toString());
					if (res.getMedicareNum() != null) {
						parameters.put("medicare", res.getMedicareNum()
								.toString());
					}
					parameters.put("medicareNo", res.getMedicalRecordNum());
					System.out.println("Medicare nO: "
							+ res.getMedicalRecordNum());

					if (res.getMedicaidNum() != null) {
						parameters.put("medicaid", res.getMedicaidNum()
								.toString());
					}
					if (res.getVa() != 0) {
						parameters.put("va", res.getVa());
					}
					parameters.put("spouse", spouse);
					parameters.put("responsible", responsible);
					parameters.put("emergency", emergency);

					// parameters.put("dentistaddress", dentistAddress);
					// parameters.put("physicianaddress", physicianaddress);

					parameters.put("placeofbirth", res.getBirthPlace());
					parameters.put("roombed", currentroom);
					parameters.put("maritalstatus", res.getMaritalStatus()
							.toString());
					parameters.put("language", res.getLanguage().toString());
					if (res.getInsurance() != null) {
						parameters.put("insurance", res.getInsurance()
								.toString());
					}
					if (res.getInsuranceSec() != null) {
						parameters.put("secondaryinsurance", res
								.getInsuranceSec().toString());
					}

					parameters.put("hospitalpreference", HospitalPreference);
					parameters.put("Ambulance", ambulance);

					if (cenStatus != null) {
						String originaladmissiondate = df.format(cenStatus
								.getDateAndTime());
						parameters.put("originalAdmission",
								originaladmissiondate);
					}

					if (censusStatus != null) {
						String lastAdmissiondate = df.format(censusStatus
								.getDateAndTime());
						parameters.put("lastAdmission", lastAdmissiondate);
					}

					if (residentAssessmentFormPage1 != null) {
						parameters.put("allergies", residentAssessmentFormPage1
								.getAllergies());
					}
					if (payerInfoDataSource != null) {
						parameters.put("payerInfoDataSource",
								payerInfoDataSource);
					}
					if (doctorsDataSource != null) {
						System.out.println("here");
						parameters.put("doctorsDataSource", doctorsDataSource);
					}
					if (providersDataSource != null) {
						parameters.put("providersDataSource",
								providersDataSource);
					}
					if (diagnosisDataSource != null) {
						parameters.put("diagnosisDataSource",
								diagnosisDataSource);
					}

					JasperFillManager.fillReportToFile(
							"report//resident//residentReports.jasper",
							parameters, new JREmptyDataSource());
					String strPrintData = "report//resident//report name.jrprint";
					JasperPrint jasperPrint = (JasperPrint) JRLoader
							.loadObject(strPrintData);
					MedrexReportViewer aViwer = new MedrexReportViewer(
							jasperPrint);
					aViwer.setExportDataFile(strPrintData);
					JFrame aFrame = new JFrame("Report Viewer");
					aFrame.getContentPane().add(aViwer);
					java.awt.Dimension screenSize = java.awt.Toolkit
							.getDefaultToolkit().getScreenSize();
					aFrame.setSize(screenSize.width / 2, screenSize.height / 2);
					java.awt.Insets insets = aFrame.getInsets();
					aFrame.setSize(aFrame.getWidth() + insets.left
							+ insets.right, aFrame.getHeight() + insets.top
							+ insets.bottom + 20);
					aFrame.setLocation(
							(screenSize.width - aFrame.getWidth()) / 2,
							(screenSize.height - aFrame.getHeight()) / 2);
					aFrame.show();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

	private void doUpdateResidentList() {
		try {
			List<ResidentMain> resiList = MedrexClientManager.getInstance()
					.getResidentMain();
			residentList.setListData(resiList.toArray());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
