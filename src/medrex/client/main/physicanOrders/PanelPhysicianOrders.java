package medrex.client.main.physicanOrders;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.FormSchedulerConstants;
import medrex.client.constants.Global;
import medrex.client.main.physicanOrders.physicianOrderScreen.FramePhysicianOrder;
import medrex.client.main.scan.FrameScanFormAdd;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.physicianOrders.PhysicianOrders;
import medrex.commons.vo.resident.ResidentDiagnosis;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;

public class PanelPhysicianOrders extends JPanel {

	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);

	class TableDiagnosisTableModel extends AbstractTableModel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 2009638011153226181L;
		private final String[] COLUMNS = new String[] { "Column 1", "Column 2",
				"Column 3" };
		private final String[][] CELLS = new String[][] {
				{ "0 - 0", "0 - 1", "0 - 2" }, { "1 - 0", "1 - 1", "1 - 2" },
				{ "2 - 0", "2 - 1", "2 - 2" }, { "3 - 0", "3 - 1", "3 - 2" },
				{ "4 - 0", "4 - 1", "4 - 2" }, };

		public int getRowCount() {
			return CELLS.length;
		}

		public int getColumnCount() {
			return COLUMNS.length;
		}

		@Override
		public String getColumnName(int column) {
			return COLUMNS[column];
		}

		public Object getValueAt(int row, int column) {
			return CELLS[row].length > column ? CELLS[row][column] : (column
					+ " - " + row);
		}
	}

	private JxTable tableDiagnosis;
	private JxComboBox cmbFormType;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JxTable table;
	private PhysicianOrdersJTable physicianOrderJTable;
	private PhysicianOrdersDiagnosisJTable physicianOrdersDiagnosisJTable;
	public FramePhysicianOrdersAdd framePhysicianOrdersAdd;
	public FrameScanFormAdd frameScanFormAdd;

	/**
	 * Create the panel
	 */
	public PanelPhysicianOrders() {
		super();
		// Global.panelPhysicianOrders=this;
		setLayout(null);
		setPreferredSize(new Dimension(718, 485));
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});

		final JxPanel panel = new JxPanel(1f);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 20, 720, 466);
		add(panel);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 52, 680, 169);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(DEF_COL, 1, false));
		panel.add(scrollPane);

		table = new JxTable();
		physicianOrderJTable = new PhysicianOrdersJTable();
		table.setModel(physicianOrderJTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					int id = new Integer((String) physicianOrderJTable
							.getValueAt(table.getSelectedRow(), 5)).intValue();
					String formType = (String) physicianOrderJTable.getValueAt(
							table.getSelectedRow(), 1);
					// System.out.println("Form Type"+formType);
					if (id != -1) {
						Global.currentPhysisianOrdersKey = id;
						// Global.currentPhysicianOrderForm = (String)
						// cmbFormType
						// .getSelectedItem();
						Global.currentPhysicianOrderForm = formType;
						framePhysicianOrdersAdd = (FramePhysicianOrdersAdd) FrameFactory
								.createWindowOfType(FramePhysicianOrdersAdd.class);
						SwingUtils.center(framePhysicianOrdersAdd);
						framePhysicianOrdersAdd
								.setTitle("View/Update Lab Record");
						framePhysicianOrdersAdd.setModal(true);
						framePhysicianOrdersAdd.setVisible(true);

					} else {
						File scannedFile = (File) physicianOrderJTable
								.getValueAt(table.getSelectedRow(), 6);

						Global.currentScanFormMode = true;
						Global.currentScanFormname = scannedFile
								.getAbsolutePath();
						frameScanFormAdd = (FrameScanFormAdd) FrameFactory
								.createWindowOfType(FrameScanFormAdd.class);
						SwingUtils.center(frameScanFormAdd);
						frameScanFormAdd.setTitle("View Scan Record");
						frameScanFormAdd.setModal(true);
						frameScanFormAdd.setVisible(true);
					}
					updatePhysicianOrdersJTable();
				} else if (evt.getClickCount() == 1) {
					System.out.println("single click");
				}
			}
		});

		scrollPane.setViewportView(table);

		final JxButton btnAdd = new JxButton(0.4f);
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setForeground(DEF_COL);
		btnAdd.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnAdd.setBounds(20, 227, 84, 26);
		btnAdd.setFont(new Font("", Font.BOLD, 12));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.currentPhysisianOrdersKey = 0;
				Global.selectedMedication = null;
				Global.currentPhysicianOrderForm = (String) cmbFormType
						.getSelectedItem();

				framePhysicianOrdersAdd = (FramePhysicianOrdersAdd) FrameFactory
						.createWindowOfType(FramePhysicianOrdersAdd.class);
				SwingUtils.center(framePhysicianOrdersAdd);
				framePhysicianOrdersAdd.setTitle("Add New Phicisian Record");
				framePhysicianOrdersAdd.setModal(true);
				framePhysicianOrdersAdd.setVisible(true);
				updatePhysicianOrdersJTable();
			}
		});
		btnAdd.setText("Add New");
		panel.add(btnAdd);

		final JxButton btnView = new JxButton(0.4f);
		btnView.setBackground(Color.WHITE);
		btnView.setForeground(DEF_COL);
		btnView.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnView.setBounds(437, 243, 111, 26);
		btnView.setFont(new Font("", Font.BOLD, 12));
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					int id = new Integer((String) physicianOrderJTable
							.getValueAt(table.getSelectedRow(), 5)).intValue();

					if (id != -1) {
						Global.currentPhysisianOrdersKey = id;

						framePhysicianOrdersAdd = (FramePhysicianOrdersAdd) FrameFactory
								.createWindowOfType(FramePhysicianOrdersAdd.class);
						SwingUtils.center(framePhysicianOrdersAdd);
						framePhysicianOrdersAdd
								.setTitle("View/Update Physician Record");
						framePhysicianOrdersAdd.setModal(true);
						framePhysicianOrdersAdd.setVisible(true);
					}

					else {

						File scannedFile = (File) physicianOrderJTable
								.getValueAt(table.getSelectedRow(), 6);
						Global.currentScanFormMode = true;
						Global.currentScanFormname = scannedFile
								.getAbsolutePath();
						frameScanFormAdd = (FrameScanFormAdd) FrameFactory
								.createWindowOfType(FrameScanFormAdd.class);
						SwingUtils.center(frameScanFormAdd);
						frameScanFormAdd.setTitle("View Scan Record");
						frameScanFormAdd.setModal(true);
						frameScanFormAdd.setVisible(true);

					}
					updatePhysicianOrdersJTable();

				} catch (Exception ve) {
				}
			}
		});
		btnView.setText("View / Update");
		panel.add(btnView);

		final JxButton btnDelete = new JxButton(0.4f);
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setForeground(DEF_COL);
		btnDelete.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnDelete.setBounds(554, 243, 70, 26);
		btnDelete.setFont(new Font("", Font.BOLD, 12));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					int id = new Integer((String) physicianOrderJTable
							.getValueAt(table.getSelectedRow(), 5)).intValue();
					int formId = new Integer((String) physicianOrderJTable
							.getValueAt(table.getSelectedRow(), 6)).intValue();
					String formType = (String) physicianOrderJTable.getValueAt(
							table.getSelectedRow(), 1);
					// System.out.println("Form id is:"+formId);
					// System.out.println("Form Type"+formType);

					if (id != -1) {
						if (formId != 0
								&& formType
										.equals(FormSchedulerConstants.PHYSICIAN_PLAZA_HEALTH_CARE_FORM)) {
							MedrexClientManager.getInstance()
									.deletePhysicianPlazaHealthCare(formId);
						}
						if (formId != 0
								&& formType
										.equals(FormSchedulerConstants.PHYSICIAN_INFUSION_FORM)) {
							MedrexClientManager.getInstance()
									.deletePhysicianInfusion(formId);
						}
						if (formId != 0
								&& formType
										.equals(FormSchedulerConstants.PHYSICIAN_SPECIALITY_FORM)) {
							MedrexClientManager.getInstance()
									.deletePhysicianSpeciality(formId);
						}
						if (formId != 0
								&& formType
										.equals(FormSchedulerConstants.PHYSICIAN_ORDER_FORM_1)) {
							MedrexClientManager.getInstance()
									.deletePhysicianOrderForm1(formId);
							MedrexClientManager.getInstance()
									.deletePhysicianOrderForm1Row(formId);
						}
						if (formId != 0
								&& formType
										.equals(FormSchedulerConstants.PHYSICIAN_ORDER_FORM_2)) {
							MedrexClientManager.getInstance()
									.deletePhysicianOrderForm2(formId);
							MedrexClientManager.getInstance()
									.deletePhysicianOrderForm2Row(formId);
						}
						if (formId != 0
								&& formType
										.equals(FormSchedulerConstants.PHYSICIAN_ORDER_FORM_3)) {
							MedrexClientManager.getInstance()
									.deletePhysicianOrderForm3(formId);
							MedrexClientManager.getInstance()
									.deletePhysicianOrderForm3Row(formId);
						}
						if (formId != 0
								&& formType
										.equals(FormSchedulerConstants.PRESCRIPTION)) {
							MedrexClientManager.getInstance()
									.deletePrescription(formId);
						}
						if (formId != 0
								&& formType
										.equals(FormSchedulerConstants.PROGRESS_NOTES)) {
							MedrexClientManager.getInstance()
									.deleteProgressNotes2(formId);
						}
						MedrexClientManager.getInstance().deletePhysicianOrder(
								id);
						Global.currentPhysisianOrdersKey = 0;
						Global.currentPhysicianPlazaHealthCareKey = 0;
						Global.currentPhysicianInfusionKey = 0;
						Global.currentPhysicianSpecialityKey = 0;
						Global.currentPhysicianOrderForm1Key = 0;
						Global.currentPhysicianOrderForm2Key = 0;
						Global.currentPhysicianOrderForm3Key = 0;
						Global.currentPrescriptionKey = 0;
						Global.currentProgressNotesKey = 0;
					} else {

						File scannedFile = (File) physicianOrderJTable
								.getValueAt(table.getSelectedRow(), 6);

						scannedFile.delete();

					}
					updatePhysicianOrdersJTable();

				} catch (Exception xe) {

				}

			}
		});
		btnDelete.setText("Delete");
		panel.add(btnDelete);

		final JxButton btnCancel = new JxButton(0.4f);
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setForeground(DEF_COL);
		btnCancel.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.setText("Cancel");
		btnCancel.setBounds(630, 243, 70, 26);
		panel.add(btnCancel);

		final JLabel residentInformationLabel = new JLabel();
		residentInformationLabel.setForeground(DEF_COL);
		residentInformationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		residentInformationLabel.setBounds(10, 10, 700, 30);
		residentInformationLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		residentInformationLabel.setText("PHYSICIANS ORDERS");
		panel.add(residentInformationLabel);

		cmbFormType = new JxComboBox();
		cmbFormType.setBackground(Color.WHITE);
		cmbFormType.setArc(0.4f);
		cmbFormType.setForeground(DEF_COL);
		cmbFormType.setBorder(new LineBorder(BORDER_COL, 1, false));
		cmbFormType.setBounds(110, 243, 249, 25);
		cmbFormType.setFont(new Font("Dialog", Font.BOLD, 12));
		panel.add(cmbFormType);

		final JxButton scanNewButton = new JxButton(0.4f);
		scanNewButton.setBackground(Color.WHITE);
		scanNewButton.setForeground(DEF_COL);
		scanNewButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		scanNewButton.setBounds(20, 259, 84, 26);
		scanNewButton.setFont(new Font("", Font.BOLD, 12));
		scanNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {

				Global.currentScanFormname = (String) cmbFormType
						.getSelectedItem();
				Global.currentScanFormMode = false;
				frameScanFormAdd = (FrameScanFormAdd) FrameFactory
						.createWindowOfType(FrameScanFormAdd.class);
				SwingUtils.center(frameScanFormAdd);
				frameScanFormAdd.setTitle("Add New scanning Record");
				frameScanFormAdd.setModal(true);
				frameScanFormAdd.setVisible(true);
				updatePhysicianOrdersJTable();
			}
		});
		scanNewButton.setText("Scan New");
		panel.add(scanNewButton);

		final JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(20, 291, 680, 114);
		scrollPane_1.setBackground(Color.WHITE);
		scrollPane_1.getViewport().setBackground(Color.WHITE);
		scrollPane_1.setBorder(new LineBorder(DEF_COL, 1, false));
		panel.add(scrollPane_1);

		physicianOrdersDiagnosisJTable = new PhysicianOrdersDiagnosisJTable();

		final JxButton button = new JxButton(0.4f);
		button.setBackground(Color.WHITE);
		button.setForeground(DEF_COL);
		button.setBorder(new LineBorder(BORDER_COL, 1, false));
		button.setBounds(594, 420, 106, 26);
		button.setFont(new Font("", Font.BOLD, 12));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (e.getActionCommand().equals("Inactive")) {
					if (tableDiagnosis.getSelectedRow() > -1) {
						FramePhysicianDiagnosisDiscontinue popup = (FramePhysicianDiagnosisDiscontinue) FrameFactory
								.createWindowOfType(FramePhysicianDiagnosisDiscontinue.class);
						popup.setVisible(true);
						if (!popup.isCanceled()) {
							ResidentDiagnosis diag = (ResidentDiagnosis) physicianOrdersDiagnosisJTable
									.getValueAt(
											tableDiagnosis.getSelectedRow(), 7);
							diag.setDiscontinued(true);
							diag.setDateDiscontinued(popup.getEndDate());
							diag.setRemarks(popup.getRemarks());
							diag.setDiscontinueBy(popup.getDiscontinueUser());
							try {
								Global.currentPhysisianOrdersKey = MedrexClientManager
										.getInstance()
										.insertOrUpdateResidentDiagnosis(diag);
							} catch (Exception e1) {
								e1.printStackTrace();
							}
							updateDiagnosisJTable();
						}
					}
				}
			}
		});
		button.setText("Inactive");
		panel.add(button);

		final JxButton btnConfirm = new JxButton(0.4f);
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (tableDiagnosis.getSelectedRow() > -1) {
					String status = physicianOrdersDiagnosisJTable.getValueAt(
							tableDiagnosis.getSelectedRow(), 4).toString();
					// System.out.println("status: "+status);
					if (("<html><body><font color =" + "red" + ">" + "NC"
							+ "</body></html>").equalsIgnoreCase(status)) {
						ResidentDiagnosis diag = (ResidentDiagnosis) physicianOrdersDiagnosisJTable
								.getValueAt(tableDiagnosis.getSelectedRow(), 7);
						diag.setConfirmed(true);
						diag.setDateConfirmed(MedrexClientManager
								.getServerTime());
						try {
							Users user = MedrexClientManager.getInstance()
									.getUser(Global.currentLoggedInUserKey);
							diag.setConfirmedBy(user);
							Global.currentPhysisianOrdersKey = MedrexClientManager
									.getInstance()
									.insertOrUpdateResidentDiagnosis(diag);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
						updateDiagnosisJTable();
					} else {
						JOptionPane.showMessageDialog(null,
								"Diagnosis is already Conrirmet/Disclined");
					}
				}
			}
		});
		btnConfirm.setBackground(Color.WHITE);
		btnConfirm.setForeground(DEF_COL);
		btnConfirm.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnConfirm.setFont(new Font("", Font.BOLD, 12));
		btnConfirm.setText("Confirm");
		btnConfirm.setBounds(476, 420, 106, 26);
		panel.add(btnConfirm);

		final JxButton btnDetails = new JxButton(0.4f);
		btnDetails.setBackground(Color.WHITE);
		btnDetails.setForeground(DEF_COL);
		btnDetails.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				FramePhysicianOrder frame = (FramePhysicianOrder) FrameFactory
						.createWindowOfType(FramePhysicianOrder.class);
				frame.setVisible(true);
			}

		});
		btnDetails.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnDetails.setFont(new Font("", Font.BOLD, 12));
		btnDetails.setText("New Order");
		btnDetails.setBounds(20, 420, 142, 26);
		panel.add(btnDetails);

		tableDiagnosis = new JxTable() {
			@Override
			public Class getColumnClass(int column) {
				return getValueAt(0, column).getClass();
			}
		};
		tableDiagnosis.setBounds(20, 338, 697, 99);
		tableDiagnosis.setModel(physicianOrdersDiagnosisJTable);
		scrollPane_1.setViewportView(tableDiagnosis);

		final JxButton btnConfirmAll = new JxButton();
		btnConfirmAll.setArc(0.4f);
		btnConfirmAll.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				List<ResidentDiagnosis> diaglist = physicianOrdersDiagnosisJTable
						.getList();
				List<String> notConfirmedYetList = new ArrayList<String>();
				if (diaglist != null) {
					Iterator<ResidentDiagnosis> listOfResDiagnosisIterator = diaglist
							.iterator();
					while (listOfResDiagnosisIterator.hasNext()) {
						ResidentDiagnosis resDiag = listOfResDiagnosisIterator
								.next();
						if (!(resDiag.isConfirmed())
								&& !(resDiag.isDiscontinued())) {
							notConfirmedYetList.add(resDiag.getName());
						}
					}
				}
				if (notConfirmedYetList.size() > 0) {
					PanelDiagnosisYetToConfirmed panel = new PanelDiagnosisYetToConfirmed(
							notConfirmedYetList);
					SwingUtils.openInDialog(panel);
					if (panel.isAccepted()) {
						List<ResidentDiagnosis> list = physicianOrdersDiagnosisJTable
								.getList();
						Iterator<ResidentDiagnosis> it = list.iterator();
						while (it.hasNext()) {
							ResidentDiagnosis residentDiagnosis = it.next();
							Users user;
							try {
								user = MedrexClientManager.getInstance()
										.getUser(Global.currentLoggedInUserKey);
								residentDiagnosis.setConfirmedBy(user);
								residentDiagnosis.setConfirmed(true);
								residentDiagnosis
										.setDateConfirmed(MedrexClientManager
												.getServerTime());
								Global.currentPhysisianOrdersKey = MedrexClientManager
										.getInstance()
										.insertOrUpdateResidentDiagnosis(
												residentDiagnosis);
							} catch (Exception e1) {

								e1.printStackTrace();
							}
							updateDiagnosisJTable();
						}
					} else {
						return;
					}
				} else {
					JOptionPane.showMessageDialog(null,
							"NO DIAGNOSIS TO CONFIRM");
				}
			}
		});
		btnConfirmAll.setFont(new Font("Arial", Font.BOLD, 12));
		btnConfirmAll.setBackground(Color.WHITE);
		btnConfirmAll.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnConfirmAll.setText("Confirm All");
		btnConfirmAll.setForeground(ColorConstants.DEF_COLOR);
		btnConfirmAll.setBounds(353, 421, 106, 26);
		panel.add(btnConfirmAll);

		
		final JxButton faxStatusButton = new JxButton(0.4f);
		faxStatusButton.setBackground(Color.WHITE);
		faxStatusButton.setForeground(DEF_COL);
		faxStatusButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				SwingUtils.openInDialog(new PanelPhysicianOrderNewFax());
			}

		});
		faxStatusButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		faxStatusButton.setFont(new Font("", Font.BOLD, 12));
		faxStatusButton.setText("Fax Status");
		faxStatusButton.setBounds(180, 420, 142, 26);
		panel.add(faxStatusButton);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		fillCombos();
		updatePhysicianOrdersJTable();
	}

	protected void doUpdate() {
		updateDiagnosisJTable();
		updatePhysicianOrdersJTable();
	}

	public void openNewForm(String formName) {
		Global.currentPhysisianOrdersKey = 0;
		Global.selectedMedication = null;
		Global.currentPhysicianOrderForm = formName;

		framePhysicianOrdersAdd = (FramePhysicianOrdersAdd) FrameFactory
				.createWindowOfType(FramePhysicianOrdersAdd.class);
		SwingUtils.center(framePhysicianOrdersAdd);
		framePhysicianOrdersAdd.setTitle("Add New Phicisian Record");
		framePhysicianOrdersAdd.setModal(true);
		framePhysicianOrdersAdd.setVisible(true);
		updatePhysicianOrdersJTable();
	}

	public void fillCombos() {
		cmbFormType.setModel(new DefaultComboBoxModel(new String[] {
				"Physician Plaza Health Care Form", "Physician Infusion Form",
				"Physician Speciality Form", "Physician Order Form 1",
				"Physician Order Form 2", "Physician Order Form 3",
				"Prescription Form", "Progress Notes" }));

	}

	public void updatePhysicianOrdersJTable() {

		List l = new ArrayList();
		File[] f = null;
		if (Global.currentResidenceKey != 0) {
			try {
				l = MedrexClientManager.getInstance().getPhysicianOrders(
						Global.currentResidenceKey);
				java.io.File currentDir = new java.io.File("");

				f = new File(
						currentDir.getAbsolutePath()
								+ "\\scans\\"
								+ Global.currentResidenceKey
								+ "\\"
								+ medrex.commons.enums.ResidentTabs.PHYSICIAN_ORDERS.Name
								+ "\\").listFiles();

			} catch (Exception e) {

			}
		}

		if (f != null) {
			for (int i = 0; i < f.length; i++) {
				l.add(f[i]);
			}
		}
		Collections.sort(l, new Comparator() {
			// +1 if a > b
			// 0 if a = b
			// -1 if a < b
			public int compare(final Object a, final Object b) {
				Date aDate, bDate;
				aDate = (a instanceof PhysicianOrders) ? ((PhysicianOrders) a)
						.getDateCreated() : new Date(((File) a).lastModified());
				bDate = (b instanceof PhysicianOrders) ? ((PhysicianOrders) b)
						.getDateCreated() : new Date(((File) b).lastModified());

				if (aDate.getTime() == bDate.getTime()) {
					return 0;
				} else
					return (aDate.getTime() > bDate.getTime()) ? 1 : -1;
				// return 0;
			}
		});

		physicianOrderJTable.setNewList(l);
		physicianOrderJTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();

		updateDiagnosisJTable();
	}

	public void updateDiagnosisJTable() {
		List l = new ArrayList();
		try {
			l = MedrexClientManager.getInstance().getResidentDiagnosiss(
					Global.currentResidenceKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		 * List tmp = new ArrayList(); for (int i = 0; i < l.size(); i++) {
		 * ResidentDiagnosis diag = (ResidentDiagnosis) l.get(i); if
		 * (!diag.isDiscontinued() && diag.isConfirmed()) { tmp.add(diag); } }
		 */
		physicianOrdersDiagnosisJTable.setNewList(l);
		physicianOrdersDiagnosisJTable.fireTableStructureChanged();
		tableDiagnosis.updateUI();
		tableDiagnosis.repaint();
	}
}

class PhysicianOrdersJTable extends AbstractTableModel {

	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "Date Created", "Form Type",
			"Last Modified", "Status", "User" };

	public List l;

	int n = 0;

	PhysicianOrdersJTable(List labRecords) {
		l = labRecords;
	}

	PhysicianOrdersJTable() {
		l = new ArrayList();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (l.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List labRecords) {
		l = labRecords;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MM / dd / yyyy");
			Object o = l.get(row);
			if (o instanceof PhysicianOrders) {
				PhysicianOrders rc = (PhysicianOrders) o;

				if (col == 0) {
					return (df.format(rc.getDateCreated()));
				}
				if (col == 1) {
					return (rc.getFormType());
				}
				if (col == 2) {
					return (df.format(rc.getLastModified()));
				}
				if (col == 3) {
					return (rc.getStatus() + "");
				}
				if (col == 4) {
					return (rc.getUser() + "");
				}
				if (col == 5) {
					return (rc.getSerial() + "");
				}
				if (col == 6) {
					return (rc.getFormId() + "");
				}
				return ("");
			}

			else {
				File rc = (File) o;
				if (col == 0) {
					return (new Date(rc.lastModified()) + "");
				}
				if (col == 1) {
					String[] fPart = rc.getName().split("-");
					return (fPart[0].replaceAll("_", " "));
				}
				if (col == 2) {
					return (new Date(rc.lastModified()) + "");
				}
				if (col == 3) {
					return ("Completed");
				}
				if (col == 4) {
					Users users = new Users();
					users = MedrexClientManager.getInstance().getUser(
							Global.currentLoggedInUserKey);
					return (users.getUserType());

				}
				if (col == 5) {
					return "-1";

				}
				if (col == 6) {
					return rc;
				}

				return ("");

			}

		}

		catch (Exception e) {
			return ("");
		}

	}
}

class PhysicianOrdersDiagnosisJTable extends AbstractTableModel {

	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "Diagnosis", /* "Status" */"Date Added",
			"Confirmed", "Inactive", "physician Initials" };

	public List l;

	int n = 0;

	PhysicianOrdersDiagnosisJTable(List records) {
		l = records;
	}

	PhysicianOrdersDiagnosisJTable() {
		l = new ArrayList();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (l.size());
	}

	@Override
	public boolean isCellEditable(int row, int column) {
		if (column == 2) {
			return true;
		} else {
			return false;
		}
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List records) {
		l = records;
	}

	public List<ResidentDiagnosis> getList() {
		return l;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			ResidentDiagnosis rc = (ResidentDiagnosis) l.get(row);
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MM / dd / yyyy");
			switch (col) {
			case 0:
				return (rc.getName());
				/*
				 * case 1: if(rc.isDiscontinued()){ return "D"; // Discontinue
				 * }else{ return rc.isConfirmed() ? "C" : "NC"; //C - Confirmed,
				 * NC - Not Confirmed }
				 */
			case 1:
				return (df.format(rc.getDateCreated()));
			case 2:
				return rc.isConfirmed() ? (df).format(rc.getDateConfirmed())
						: "";
			case 3:
				return rc.isDiscontinued() ? (df).format(rc
						.getDateDiscontinued()) : "";
			case 4:
				if (rc.isDiscontinued()) {
					return "D"; // Discontinue
				} else {
					return rc.isConfirmed() ? "C - "
							+ (df).format(rc.getDateConfirmed())
							: "<html><body><font color =" + "red" + ">" + "NC"
									+ "</body></html>"; // C - Confirmed, NC -
					// Not Confirmed
				}
			case 5:
				return ""
						+ (rc.isDiscontinued() ? "Recontinue" : "Discontinue");
			case 6:
				return (rc.getSerial() + "");
			case 7:
				return rc;
			default:
				return ("");
			}
		} catch (Exception e) {
			return ("");
		}
	}
}