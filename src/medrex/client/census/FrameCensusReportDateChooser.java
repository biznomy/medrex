package medrex.client.census;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
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

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.loading.FrameLoading;
import medrex.client.utils.Utils;
import medrex.commons.exception.MedrexException;
import medrex.commons.utils.MedrexReportViewer;
import medrex.commons.vo.census.CensusCountReport;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.census.CensusStatusReport;
import medrex.commons.vo.census.counts.BedHold;
import medrex.commons.vo.census.counts.Hospital;
import medrex.commons.vo.census.counts.InHouse;
import medrex.commons.vo.census.counts.OutOfPass;
import medrex.commons.vo.masterList.Status;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.ResidentWeightBean;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.util.JRLoader;

import com.sX.swing.JxButton;
import com.toedter.calendar.JDateChooser;

public class FrameCensusReportDateChooser extends JDialog {

	private static final long serialVersionUID = 1L;
	private Toolkit toolkit = null;
	private JxButton btnBack;
	private JButton btnReport;
	private JDateChooser dcTo;
	private JDateChooser dcFrom;
	private FrameLoading fl;
	private static final Color DEF_COLOR = new Color(49, 104, 127);

	public FrameCensusReportDateChooser(final String head) {
		super();
		Global.frameCensusReportDateChooser = this;
		setBackground(Color.WHITE);
		setLayout(null);
		setTitle("Choose Date");
		setSize(new Dimension(385, 185));
		setModal(true);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 378, 153);
		add(panel);

		final JLabel fromLabel = new JLabel();
		fromLabel.setForeground(DEF_COLOR);
		fromLabel.setText("From");
		fromLabel.setBounds(10, 56, 31, 14);
		panel.add(fromLabel);

		dcFrom = new JDateChooser();
		dcFrom.setDateFormatString("MM/dd/yyyy");
		dcFrom.setMaxSelectableDate(MedrexClientManager.getServerTime());
		dcFrom.setBounds(60, 55, 102, 20);
		panel.add(dcFrom);

		final JLabel toLabel = new JLabel();
		toLabel.setForeground(DEF_COLOR);
		toLabel.setText("To");
		toLabel.setBounds(203, 56, 21, 14);
		panel.add(toLabel);

		btnReport = new JxButton();
		btnReport.setForeground(DEF_COLOR);
		btnReport.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (head.equalsIgnoreCase("Room History")) {
					if (dcFrom.getDate() != null && dcTo.getDate() != null) {
						// try {
						// JasperCompileManager.compileReportToFile(
						// "report/roomHistory/roomHistory.jrxml",
						// "report/roomHistory/roomHistory.jasper");
						// } catch (JRException e1) {
						// e1.printStackTrace();
						// }
						SimpleDateFormat df = new SimpleDateFormat();
						df.applyPattern("MMM dd, yyyy  hh:mm a");
						Date dFrom = dcFrom.getDate();
						Date dTo = dcTo.getDate();
						df.format(dFrom);
						df.format(dTo);
						new HashMap();
						JRBeanArrayDataSource dataSource = null;
						System.out.println("In Form");
						Object[] reportRows = null;
						try {
							reportRows = MedrexClientManager.getInstance()
									.getRoomHistoryDataSource(dFrom, dTo);
						} catch (RemoteException e2) {
							e2.printStackTrace();
						} catch (MedrexException e2) {
							e2.printStackTrace();
						}

						DateFormat df1 = new SimpleDateFormat("MM/dd/yyyy");
						String fromDate = df1.format(dcFrom.getDate());
						String toDate = df1.format(dcTo.getDate());
						Map parameter1 = new HashMap();
						parameter1.put("fromDate", fromDate);
						parameter1.put("toDate", toDate);
						dataSource = new JRBeanArrayDataSource(reportRows);
						try {
							JasperFillManager.fillReportToFile(
									"report//roomHistory//roomHistory.jasper",
									parameter1, dataSource);
							String strPrintData = "report//roomHistory//report name.jrprint";
							JasperPrint jasperPrint = (JasperPrint) JRLoader
									.loadObject(strPrintData);
							MedrexReportViewer aViwer = new MedrexReportViewer(
									jasperPrint);
							aViwer.setExportDataFile(strPrintData);
							if (aViwer != null) {
								JFrame aFrame = new JFrame("Report Viewer");
								aFrame.getContentPane().add(aViwer);
								java.awt.Dimension screenSize = java.awt.Toolkit
										.getDefaultToolkit().getScreenSize();
								aFrame.setSize(screenSize.width / 2,
										screenSize.height / 2);
								java.awt.Insets insets = aFrame.getInsets();
								aFrame.setSize(aFrame.getWidth() + insets.left
										+ insets.right, aFrame.getHeight()
										+ insets.top + insets.bottom + 20);
								aFrame
										.setLocation((screenSize.width - aFrame
												.getWidth()) / 2,
												(screenSize.height - aFrame
														.getHeight()) / 2);
								aFrame.setVisible(true);
								aFrame.show();
							} else {
								System.out.println("No More Pages");
								JOptionPane.showMessageDialog(null,
										"No More Pages");
							}
						} catch (Exception e1) {
							e1.printStackTrace();
						}
						Global.frameCensusReportDateChooser.dispose();
					} else {
						JOptionPane.showMessageDialog(null,
								"Please select Start and End date");
					}
				} else if ("Count Report".equalsIgnoreCase(head)) {

					fl = new FrameLoading("Loading Report");
					fl.setTitle("Loading...");
					javax.swing.SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							fl.callNotify();
						}
					});
					new Thread(new Runnable() {
						public void run() {
							doCountReport();
							fl.dispose();
						}
					}).start();
					fl.setVisible(true);

				} else if ("Patients not Weighed".equalsIgnoreCase(head)
						|| "Patients weighed".equalsIgnoreCase(head)) {
					doResidentsWeightReport(head);
					dispose();
				} else {
					if (dcFrom.getDate() != null && dcTo.getDate() != null) {
						try {
							JasperCompileManager.compileReportToFile(
									"report/report1.jrxml",
									"report/report1.jasper");
						} catch (JRException e1) {
							e1.printStackTrace();
						}
						SimpleDateFormat df = new SimpleDateFormat();
						df.applyPattern("MMM dd, yyyy");
						Date dFrom = dcFrom.getDate();
						Date dTo = dcTo.getDate();
						String from = df.format(dFrom);
						String to = df.format(dTo);
						new HashMap();
						List<CensusStatus> list = null;

						try {
							if (head
									.equalsIgnoreCase("All Census History Report")) {
								list = MedrexClientManager.getInstance()
										.getAllCensus(dFrom, dTo);
							} else if (head
									.equalsIgnoreCase("Admission Report")) {
								list = MedrexClientManager.getInstance()
										.getCensusAdmissionReportData(dFrom,
												dTo);
							} else if (head
									.equalsIgnoreCase("Discharge Report")) {
								list = MedrexClientManager.getInstance()
										.getCensusDischargeReportData(dFrom,
												dTo);
							} else if (head
									.equalsIgnoreCase("Sign In / Sign Out Report")) {
								list = MedrexClientManager.getInstance()
										.getCensusSignInOutReportData(dFrom,
												dTo);
							}
						} catch (Exception ee) {

						}

						// int activeId = 0;
						// try {
						// activeId =
						// MedrexClientManager.getInstance().getMasterList(Status.class,
						// "Active");
						// } catch (RemoteException e2) {
						// e2.printStackTrace();
						// } catch (MedrexException e2) {
						// e2.printStackTrace();
						// }

						List<CensusStatusReport> l = new ArrayList<CensusStatusReport>();
						Users u = null;
						ResidentMain rm = null;
						Iterator it = list.iterator();
						while (it.hasNext()) {
							CensusStatusReport ir = new CensusStatusReport();
							CensusStatus inc = (CensusStatus) it.next();
							ir.setFromDate(from);
							ir.setToDate(to);

							try {
								u = MedrexClientManager.getInstance().getUser(
										inc.getAdministeredBy());
							} catch (RemoteException e1) {
								e1.printStackTrace();
							} catch (MedrexException e1) {
								e1.printStackTrace();
							}
							String abc = u.getUserName();

							try {
								rm = MedrexClientManager.getInstance()
										.getResident(inc.getResidentId());
							} catch (RemoteException e1) {
								e1.printStackTrace();
							} catch (MedrexException e1) {
								e1.printStackTrace();
							}
							ir.setResidentId(rm.getUserPass() + ", "
									+ rm.getUserName());
							ir.setAdministeredBy(abc.toString());
							// System.out.println("Admin is " + abc);

							if (inc.getTypeName().equalsIgnoreCase("Sign Out")) {
								// System.out.println(ir);
								// System.out.println(inc);
								// System.out.println(df);
								//								
								// System.out.println(inc.getAnticipatedDateAndTime());
								df.applyPattern("MMM dd, yyyy");
								if (inc.getAnticipatedDateAndTime() != null) {
									ir.setDate(df.format(inc
											.getAnticipatedDateAndTime())
											+ "");
									df.applyPattern("hh':'mm a");
									ir.setTime(df.format(inc
											.getAnticipatedDateAndTime())
											+ "");
								}
							} else {
								df.applyPattern("MMM dd, yyyy");
								ir
										.setDate(df
												.format(inc.getDateAndTime())
												+ "");
								df.applyPattern("hh':'mm a");
								ir
										.setTime(df
												.format(inc.getDateAndTime())
												+ "");
							}
							if (inc.getTypeName().equalsIgnoreCase("Discharge")) {
								String t = "Discharge";
								if (inc.getDischargeType() == 1) {
									t += " : " + "Discharge";
								}
								if (inc.getDischargeType() == 2) {
									t += " : " + "E R";
								}
								if (inc.getDischargeType() == 3) {
									t += " : " + "Out Of Pass";
								}
								if (inc.getDischargeType() == 4) {
									t += " : " + "Expired";
								}
								ir.setTypeName(t);
							} else {
								ir.setTypeName(inc.getTypeName());
							}

							new Status();

							// if (rm.getType().getId() == activeId) {
							l.add(ir);
							// }
						}

						JRBeanArrayDataSource dataSource;
						// Collections.sort(l, new
						// Comparator<CensusStatusReport>() {
						// public int compare(CensusStatusReport o1,
						// CensusStatusReport o2) {
						// return
						// o1.getResidentId().compareToIgnoreCase(o2.getResidentId());
						// }
						// });

						Object[] reportRows = l.toArray();
						dataSource = new JRBeanArrayDataSource(reportRows);
						try {
							JasperFillManager.fillReportToFile(
									"report//report1.jasper", new HashMap(),
									dataSource);
							String strPrintData = "report//report name.jrprint";
							JasperPrint jasperPrint = (JasperPrint) JRLoader
									.loadObject(strPrintData);
							// JasperViewer view = new
							// JasperViewer(jasperPrint,false);
							// JRViewer jv = new JRViewer(jasperPrint);
							MedrexReportViewer aViwer = new MedrexReportViewer(
									jasperPrint);
							aViwer.setExportDataFile(strPrintData);
							JFrame aFrame = new JFrame("Report Viewer");
							aFrame.getContentPane().add(aViwer);
							java.awt.Dimension screenSize = java.awt.Toolkit
									.getDefaultToolkit().getScreenSize();
							aFrame.setSize(screenSize.width / 2,
									screenSize.height / 2);
							java.awt.Insets insets = aFrame.getInsets();
							aFrame.setSize(aFrame.getWidth() + insets.left
									+ insets.right, aFrame.getHeight()
									+ insets.top + insets.bottom + 20);
							aFrame
									.setLocation((screenSize.width - aFrame
											.getWidth()) / 2,
											(screenSize.height - aFrame
													.getHeight()) / 2);
							aFrame.show();
						} catch (Exception e1) {
							e1.printStackTrace();
						}
						Global.frameCensusReportDateChooser.dispose();
					} else {
						JOptionPane.showMessageDialog(null,
								"Please select Start and End date");
					}
				}
			}
		});
		btnReport.setBackground(Color.WHITE);
		btnReport.setText("Report");
		btnReport.setBounds(145, 109, 95, 24);
		panel.add(btnReport);

		dcTo = new JDateChooser();
		dcTo.setDateFormatString("MM/dd/yyyy");
		dcTo.setMaxSelectableDate(MedrexClientManager.getServerTime());
		dcTo.setBounds(250, 55, 102, 20);
		panel.add(dcTo);

		final JLabel chooseDischargeDateLabel = new JLabel();
		chooseDischargeDateLabel.setForeground(DEF_COLOR);
		chooseDischargeDateLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		chooseDischargeDateLabel.setText(head);
		chooseDischargeDateLabel.setBounds(77, 10, 218, 20);
		panel.add(chooseDischargeDateLabel);
	}

	private void doCountReport() {
		if (dcFrom.getDate() != null && dcTo.getDate() != null) {
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MM/dd/yyyy");
			Date dFrom = dcFrom.getDate();
			Date dTo = dcTo.getDate();

			List<Date> listDate = Utils.datesBetween(dFrom, dTo);
			List<CensusCountReport> listCount = new ArrayList<CensusCountReport>();

			System.out.println(MedrexClientManager.getServerTime());
			for (Date recDate : listDate) {
				List<InHouse> listInHouse = null;
				List<CensusStatus> listAdmission = null;
				List<CensusStatus> listDischarge = null;
				List<BedHold> listBedHold = null;
				List<Hospital> listHospital = null;
				List<OutOfPass> listOutOfPass = null;

				try {
					listInHouse = MedrexClientManager.getInstance()
							.getInHouseForResidents(recDate);
					listAdmission = MedrexClientManager.getInstance()
							.getCensusDayReportAdmissionList(recDate);
					listDischarge = MedrexClientManager.getInstance()
							.getCensusDayReportDischargeList(recDate);
					listBedHold = MedrexClientManager.getInstance()
							.getBedHoldForResidents(recDate);
					listHospital = MedrexClientManager.getInstance()
							.getHospitalForResidents(recDate);
					listOutOfPass = MedrexClientManager.getInstance()
							.getOutOfPassForResidents(recDate);

				} catch (RemoteException e) {
					e.printStackTrace();
				} catch (MedrexException e) {
					e.printStackTrace();
				}

				CensusCountReport refReport = new CensusCountReport();
				refReport.setDate(df.format(recDate));
				if (listInHouse != null) {
					refReport.setInHouseCount("" + listInHouse.size());
				}
				if (listAdmission != null) {
					refReport.setAdmissionCount("" + listAdmission.size());
				}
				if (listDischarge != null) {
					refReport.setDischargeCount("" + listDischarge.size());
				}
				if (listBedHold != null) {
					refReport.setBedholdCount("" + listBedHold.size());
				}
				if (listHospital != null) {
					refReport.setHospitalCount("" + listHospital.size());
				}
				if (listOutOfPass != null) {
					refReport.setOutOnPassCount("" + listOutOfPass.size());
				}

				listCount.add(refReport);
			}
			System.out.println(MedrexClientManager.getServerTime());

			JRBeanArrayDataSource dataSource;
			Object[] reportRows = listCount.toArray();
			dataSource = new JRBeanArrayDataSource(reportRows);
			try {
				HashMap parameters = new HashMap();
				parameters.put("fromDate", df.format(dFrom));
				parameters.put("toDate", df.format(dTo));
				JasperFillManager.fillReportToFile(
						"report//censusCount//censusCount.jasper", parameters,
						dataSource);
				String strPrintData = "report//censusCount//report name.jrprint";
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
			this.dispose();
		} else {
			JOptionPane.showMessageDialog(null,
					"Please select Start and End date");
		}
	}

	private void doResidentsWeightReport(String withOrWithoutWeight) {
		if (dcFrom.getDate() != null && dcTo.getDate() != null) {
			Date dFrom = dcFrom.getDate();
			Date dTo = dcTo.getDate();
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MM/dd/yyyy");
			try {
				List<ResidentWeightBean> weithlist = MedrexClientManager
						.getInstance().getResidentsWeight(dFrom, dTo,
								withOrWithoutWeight);

				df.applyPattern("yyyy-MM-dd");
				String strFromDate = df.format(dFrom);
				String strToDate = df.format(dTo);

				JRBeanArrayDataSource weithDataSource;
				Object[] weithReportRows = weithlist.toArray();
				weithDataSource = new JRBeanArrayDataSource(weithReportRows);

				HashMap parameter = new HashMap();
				parameter.put("fromDate", strFromDate);
				parameter.put("toDate", strToDate);
				parameter.put("weithDataSource", "weithDataSource");

				JasperFillManager.fillReportToFile(
						"report//weight//weight-report.jasper", parameter,
						weithDataSource);
				String strPrintData = "report//weight//report name.jrprint";
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
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			JOptionPane.showMessageDialog(this,
					"Please Select Start and End Date");
		}
	}
}
