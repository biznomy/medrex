package medrex.client.main.resident.weight;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.utils.MedrexReportViewer;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.census.CensusStatusReport;
import medrex.commons.vo.masterList.Status;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.resident.ResidentMain;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.util.JRLoader;

import com.sX.swing.JxButton;
import com.toedter.calendar.JDateChooser;

public class FrameWeightReportView extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5829100353244463127L;
	private JDateChooser dcFrom;
	private JDateChooser dcTo;

	public FrameWeightReportView(final String head) {
		super();
		setTitle("View Report");
		setModal(true);
		setSize(new Dimension(350, 200));
		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		getContentPane().add(panel, BorderLayout.CENTER);

		final JLabel fromLabel = new JLabel();
		fromLabel.setForeground(ColorConstants.DEF_COLOR);
		fromLabel.setFont(new Font("", Font.BOLD, 14));
		fromLabel.setText("From");
		fromLabel.setBounds(10, 45, 46, 16);
		panel.add(fromLabel);

		final JLabel toLabel = new JLabel();
		toLabel.setForeground(ColorConstants.DEF_COLOR);
		toLabel.setFont(new Font("", Font.BOLD, 14));
		toLabel.setText("To");
		toLabel.setBounds(183, 45, 28, 16);
		panel.add(toLabel);

		dcFrom = new JDateChooser();
		dcFrom.setBackground(Color.WHITE);
		dcFrom.setBounds(62, 45, 104, 24);
		panel.add(dcFrom);

		dcTo = new JDateChooser();
		dcTo.setBackground(Color.WHITE);
		dcTo.setBounds(217, 45, 97, 24);
		panel.add(dcTo);

		final JxButton viewReportButton = new JxButton();
		viewReportButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				createReport(head);
			}
		});

		viewReportButton.setBackground(Color.WHITE);
		viewReportButton.setText("View Report");
		viewReportButton.setBounds(109, 97, 118, 26);
		viewReportButton.setForeground(ColorConstants.DEF_COLOR);
		viewReportButton.setFont(new Font("Dialog", Font.BOLD, 12));
		panel.add(viewReportButton);

	}

	protected void createReport(String head) {
		if (head.equalsIgnoreCase("Room History")) {
			if (dcFrom.getDate() != null && dcTo.getDate() != null) {

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
								+ insets.right, aFrame.getHeight() + insets.top
								+ insets.bottom + 20);
						aFrame.setLocation((screenSize.width - aFrame
								.getWidth()) / 2, (screenSize.height - aFrame
								.getHeight()) / 2);
						aFrame.setVisible(true);
						aFrame.show();
					} else {
						System.out.println("No More Pages");
						JOptionPane.showMessageDialog(null, "No More Pages");
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

			/*
			 * fl = new FrameLoading( "Loading Report");
			 * fl.setTitle("Loading...");
			 * javax.swing.SwingUtilities.invokeLater(new Runnable() { public
			 * void run() { fl.callNotify(); } }); new Thread(new Runnable() {
			 * public void run() { doCountReport(); fl.dispose(); } }).start();
			 * fl.setVisible(true);
			 */

		} else {
			if (dcFrom.getDate() != null && dcTo.getDate() != null) {
				try {
					JasperCompileManager.compileReportToFile(
							"report/report1.jrxml", "report/report1.jasper");
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
					if (head.equalsIgnoreCase("All Census History Report")) {
						list = MedrexClientManager.getInstance().getAllCensus(
								dFrom, dTo);
					} else if (head.equalsIgnoreCase("Admission Report")) {
						list = MedrexClientManager.getInstance()
								.getCensusAdmissionReportData(dFrom, dTo);
					} else if (head.equalsIgnoreCase("Discharge Report")) {
						list = MedrexClientManager.getInstance()
								.getCensusDischargeReportData(dFrom, dTo);
					} else if (head
							.equalsIgnoreCase("Sign In / Sign Out Report")) {
						list = MedrexClientManager.getInstance()
								.getCensusSignInOutReportData(dFrom, dTo);
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
						rm = MedrexClientManager.getInstance().getResident(
								inc.getResidentId());
					} catch (RemoteException e1) {
						e1.printStackTrace();
					} catch (MedrexException e1) {
						e1.printStackTrace();
					}
					ir
							.setResidentId(rm.getUserPass() + ", "
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
						ir.setDate(df.format(inc.getDateAndTime()) + "");
						df.applyPattern("hh':'mm a");
						ir.setTime(df.format(inc.getDateAndTime()) + "");
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
					JasperFillManager
							.fillReportToFile("report//report1.jasper",
									new HashMap(), dataSource);
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
					aFrame.setSize(screenSize.width / 2, screenSize.height / 2);
					java.awt.Insets insets = aFrame.getInsets();
					aFrame.setSize(aFrame.getWidth() + insets.left
							+ insets.right, aFrame.getHeight() + insets.top
							+ insets.bottom + 20);
					aFrame.setLocation(
							(screenSize.width - aFrame.getWidth()) / 2,
							(screenSize.height - aFrame.getHeight()) / 2);
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

	public static void main(String[] args) {

		FrameWeightReportView wr = new FrameWeightReportView("");
		wr.setSize(new Dimension(350, 200));
		SwingUtils.center(wr);
		wr.setVisible(true);
	}

}
