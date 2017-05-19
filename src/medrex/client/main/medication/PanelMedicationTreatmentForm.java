package medrex.client.main.medication;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.constants.GlobalSecurity;
import medrex.client.main.scan.FrameScanFormAdd;
import medrex.client.test.ImageSlider;
import medrex.client.test.ThumbnailAdapter;
import medrex.client.utils.SwingUtils;
import medrex.client.utils.controls.FrameToolTip;
import medrex.commons.enums.GuiModes;
import medrex.commons.enums.SubAppTypes;
import medrex.commons.vo.medication.MedicationTreatmentForm;
import medrex.commons.vo.scan.ScanForm;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;

public class PanelMedicationTreatmentForm extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2966511172114780059L;
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);

	private JxComboBox cmbFormType;

	private JxTable table;

	private MedicationTreatmentFormsJTable medicationTreatmentFormTable;

	public FrameMedicationTreatmentFormAdd frameMedicationTreatmentFormAdd;

	public FrameScanFormAdd frameScanFormAdd;
	private ImageSlider imgSlider;
	private String[] formName = new String[] { "Pain Management Record",
	/*
	 * "Nurse Treatment Notes", "Nurse Medication Notes",
	 * "Medication Adminisration Record", "Medication PRN Record",
	 * "Medication Routine Record",
	 */"Treatment PRN Record", "Treatment Routine Record",
			"Pressure Sore Record", "Notes", /* "Daily Skilled Nurses Notes" */};
	private ImageIcon[] formIcon;

	/**
	 * Create the panel
	 */
	public PanelMedicationTreatmentForm() {
		super();
		Global.tabName = Global.currentResidentTabs.MEDICATION_AND_TREATMENT.Name;
		setLayout(null);
		setPreferredSize(new Dimension(718, 486));
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
		scrollPane.setBounds(20, 52, 680, 190);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(DEF_COL, 1, false));
		panel.add(scrollPane);

		table = new JxTable();
		medicationTreatmentFormTable = new MedicationTreatmentFormsJTable();
		table.setModel(medicationTreatmentFormTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					int id = (Integer) medicationTreatmentFormTable.getValueAt(
							table.getSelectedRow(), 5);

					if (id != -1 && id != 0) {
						Global.currentMedicationTreatmentFormKey = id;
						frameMedicationTreatmentFormAdd = (FrameMedicationTreatmentFormAdd) FrameFactory
								.createWindowOfType(FrameMedicationTreatmentFormAdd.class);
						SwingUtils.center(frameMedicationTreatmentFormAdd);
						frameMedicationTreatmentFormAdd
								.setTitle("View/Update Medication Treatment Form");
						frameMedicationTreatmentFormAdd.setModal(true);
						frameMedicationTreatmentFormAdd.setVisible(true);

					} else {
						String file = (String) medicationTreatmentFormTable
								.getValueAt(table.getSelectedRow(), 7);
						Global.currentScanFormImageFileName = file;
						frameScanFormAdd = (FrameScanFormAdd) FrameFactory
								.createWindowOfType(FrameScanFormAdd.class);
						SwingUtils.center(frameScanFormAdd);
						frameScanFormAdd.setTitle("View Scan Record");
						frameScanFormAdd.setModal(true);
						frameScanFormAdd.setVisible(true);

					}
					updateMedicationTreatmentFormJTable();
				} else if (evt.getClickCount() == 1) {
					// System.out.println("single click");
				}
			}
		});

		scrollPane.setViewportView(table);

		final JxButton btnAdd = new JxButton(0.4f);
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setForeground(DEF_COL);
		btnAdd.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnAdd.setBounds(20, 248, 84, 26);
		btnAdd.setFont(new Font("", Font.BOLD, 12));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (GlobalSecurity
						.isUpdatePriviledge(SubAppTypes.MEDICATION_TREATMENT)) {
					Global.currentMedicationTreatmentFormKey = 0;
					Global.currentMedicationTreatmentForm = (String) cmbFormType
							.getSelectedItem();
					// Global.currentResidentAssessmentFormKey = 0;
					frameMedicationTreatmentFormAdd = (FrameMedicationTreatmentFormAdd) FrameFactory
							.createWindowOfType(FrameMedicationTreatmentFormAdd.class);
					SwingUtils.center(frameMedicationTreatmentFormAdd);
					frameMedicationTreatmentFormAdd
							.setTitle("Add New Medical Treatment Form");
					frameMedicationTreatmentFormAdd.setModal(true);
					frameMedicationTreatmentFormAdd.setVisible(true);
					updateMedicationTreatmentFormJTable();
				}
			}
		});
		btnAdd.setText("Add New");
		panel.add(btnAdd);

		final JxButton btnView = new JxButton(0.4f);
		btnView.setBackground(Color.WHITE);
		btnView.setForeground(DEF_COL);
		btnView.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnView.setBounds(436, 264, 111, 26);
		btnView.setFont(new Font("", Font.BOLD, 12));
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					int id = (Integer) medicationTreatmentFormTable.getValueAt(
							table.getSelectedRow(), 5);

					if (id != -1 && id != 0) {
						Global.currentMedicationTreatmentFormKey = id;

						frameMedicationTreatmentFormAdd = (FrameMedicationTreatmentFormAdd) FrameFactory
								.createWindowOfType(FrameMedicationTreatmentFormAdd.class);
						SwingUtils.center(frameMedicationTreatmentFormAdd);
						frameMedicationTreatmentFormAdd
								.setTitle("View/Update Medication Treatment Form");
						frameMedicationTreatmentFormAdd.setModal(true);
						frameMedicationTreatmentFormAdd.setVisible(true);
					} else {
						String file = (String) medicationTreatmentFormTable
								.getValueAt(table.getSelectedRow(), 7);
						Global.currentScanFormImageFileName = file;
						frameScanFormAdd = (FrameScanFormAdd) FrameFactory
								.createWindowOfType(FrameScanFormAdd.class);
						SwingUtils.center(frameScanFormAdd);
						frameScanFormAdd.setTitle("View Scan Record");
						frameScanFormAdd.setModal(true);
						frameScanFormAdd.setVisible(true);
					}
					updateMedicationTreatmentFormJTable();
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
		btnDelete.setBounds(553, 264, 70, 26);
		btnDelete.setFont(new Font("", Font.BOLD, 12));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					int id = (Integer) medicationTreatmentFormTable.getValueAt(
							table.getSelectedRow(), 5);

					if (id != -1 && id != 0) {
						String formType = (String) medicationTreatmentFormTable
								.getValueAt(table.getSelectedRow(), 1);
						int formId = (Integer) medicationTreatmentFormTable
								.getValueAt(table.getSelectedRow(), 6);
						// System.out.println("Serial and FormId" + id + "\n" +
						// formId);
						if (formId != 0
								&& formType.equals("Pain Management Record")) {
							MedrexClientManager
									.getInstance()
									.deletePainManagementRecordFormPage1(formId);
							MedrexClientManager.getInstance()
									.deletePainManagementRecordFormPage1Row(
											formId);
						}
						if (formId != 0
								&& formType.equals("Nurse Treatment Notes")) {
							MedrexClientManager.getInstance()
									.deleteNurseTreatmentNotesForm(formId);
							MedrexClientManager.getInstance()
									.deleteNurseTreatmentNotesFormRow(formId);
							MedrexClientManager.getInstance()
									.deleteNurseTreatmentNotesFormRow1(formId);
						}
						if (formId != 0
								&& formType.equals("Nurse Medication Notes")) {
							MedrexClientManager.getInstance()
									.deleteNurseMedicationNotesForm(formId);
							MedrexClientManager.getInstance()
									.deleteNurseMedicationNotesFormRow(formId);
							MedrexClientManager.getInstance()
									.deleteNurseMedicationNotesFormRow1(formId);
						}
						if (formId != 0
								&& formType
										.equals("Medication Adminisration Record")) {
							MedrexClientManager.getInstance()
									.deleteMedicationAdministrationRecordForm(
											formId);
							MedrexClientManager
									.getInstance()
									.deleteMedicationAdministrationRecordFormCol(
											formId);
						}
						if (formId != 0
								&& formType.equals("Medication PRN Record")) {
							MedrexClientManager.getInstance()
									.deleteMedicationPRNRecordForm(formId);
							MedrexClientManager.getInstance()
									.deleteMedicationPRNRecordFormRow(formId);
							MedrexClientManager.getInstance()
									.deleteMedicationPRNRecordFormCol(formId);
						}
						if (formId != 0
								&& formType.equals("Medication Routine Record")) {
							MedrexClientManager.getInstance()
									.deleteMedicationRoutineRecordForm(formId);
							MedrexClientManager.getInstance()
									.deleteMedicationRoutineRecordFormRow(
											formId);
							MedrexClientManager.getInstance()
									.deleteMedicationRoutineRecordFormCol(
											formId);
						}
						if (formId != 0
								&& formType.equals("Treatment PRN Record")) {
							MedrexClientManager.getInstance()
									.deleteTreatmentPRNRecordForm(formId);
							MedrexClientManager.getInstance()
									.deleteTreatmentPRNRecordFormRow(formId);
							MedrexClientManager.getInstance()
									.deleteTreatmentPRNRecordFormCol(formId);
						}
						if (formId != 0
								&& formType.equals("Treatment Routine Record")) {
							MedrexClientManager.getInstance()
									.deleteTreatmentRoutineRecordForm(formId);
							MedrexClientManager
									.getInstance()
									.deleteTreatmentRoutineRecordFormRow(formId);
							MedrexClientManager
									.getInstance()
									.deleteTreatmentRoutineRecordFormCol(formId);
						}
						if (formId != 0
								&& formType.equals("Pressure Sore Record")) {
							MedrexClientManager.getInstance()
									.deletePressureSoreRecordForm(formId);
							MedrexClientManager.getInstance()
									.deletePressureSoreRecordFormRow(formId);
						}
						if (formType.equals("Notes")) {
							MedrexClientManager.getInstance()
									.deleteMedicationNotes(formId);
						}
						if (formId != 0
								&& formType
										.equals("Daily Skilled Nurses Notes")) {
							MedrexClientManager
									.getInstance()
									.deleteDailySkilledNursesNotesRow(
											Global.currentDailySkilledNursesNotesForm2Key);
							MedrexClientManager
									.getInstance()
									.deleteDailySkilledNursesNotesForm2(
											Global.currentDailySkilledNursesNotesKey);
							MedrexClientManager.getInstance()
									.deleteDailySkilledNursesNotes(formId);
						}
						MedrexClientManager.getInstance()
								.deleteMedicationTreatmentForm(id);
						Global.currentMedicationTreatmentFormKey = 0;
						Global.currentPainManagementFormPage1Key = 0;
						Global.currentNurseTreatmentNotesFormKey = 0;
						Global.currentNurseMedicationNotesFormKey = 0;
						Global.currentMedicationAdministrationRecordFormKey = 0;
						Global.currentMedicationPRNRecordFormKey = 0;
						Global.currentMedicationRoutineRecordFormKey = 0;
						Global.currentTreatmentPRNRecordFormKey = 0;
						Global.currentTreatmentRoutineRecordFormKey = 0;
						Global.currentPressureSoreRecordFormKey = 0;
						Global.currentMedicationNotesFormKey = 0;
						Global.currentDailySkilledNursesNotesKey = 0;
					} else {
						String file = (String) medicationTreatmentFormTable
								.getValueAt(table.getSelectedRow(), 7);
						MedrexClientManager
								.getInstance()
								.deleteScanForm(
										Global.currentResidenceKey,
										Global.currentResidentTabs.MEDICATION_AND_TREATMENT.Name,
										file);
						Global.currentScanFormImageFileName = null;
					}
					updateMedicationTreatmentFormJTable();

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
		btnCancel.setBounds(629, 264, 70, 26);
		panel.add(btnCancel);

		final JLabel residentInformationLabel = new JLabel();
		residentInformationLabel.setForeground(DEF_COL);
		residentInformationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		residentInformationLabel.setBounds(10, 10, 700, 30);
		residentInformationLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		residentInformationLabel.setText("MEDICATION & TREATMENT");
		panel.add(residentInformationLabel);

		cmbFormType = new JxComboBox();
		cmbFormType.setBackground(Color.WHITE);
		cmbFormType.setArc(0.4f);
		cmbFormType.setForeground(DEF_COL);
		cmbFormType.setBorder(new LineBorder(BORDER_COL, 1, false));
		cmbFormType.setBounds(110, 265, 249, 25);
		cmbFormType.setFont(new Font("Dialog", Font.BOLD, 12));
		panel.add(cmbFormType);

		final JxButton scanNewButton = new JxButton(0.4f);
		scanNewButton.setBackground(Color.WHITE);
		scanNewButton.setForeground(DEF_COL);
		scanNewButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		scanNewButton.setBounds(20, 280, 84, 26);
		scanNewButton.setFont(new Font("", Font.BOLD, 12));
		scanNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				Global.currentScanFormImageFileName = null;
				frameScanFormAdd = (FrameScanFormAdd) FrameFactory
						.createWindowOfType(FrameScanFormAdd.class);
				SwingUtils.center(frameScanFormAdd);
				frameScanFormAdd.setTitle("Add New scanning Record");
				frameScanFormAdd.setModal(true);
				frameScanFormAdd.setVisible(true);
				updateMedicationTreatmentFormJTable();
			}
		});
		scanNewButton.setText("Scan New");
		panel.add(scanNewButton);

		imgSlider = new ImageSlider();
		imgSlider.setBackground(GuiModes.DESIGNER_FORMS
				.getDefaultBackgroundColor()); //
		imgSlider.setBorder(new LineBorder(BORDER_COL, 1, false));
		// imgSlider.setNormalSize(128);
		imgSlider.setBounds(20, 312, 680, 144);
		imgSlider.addThumbnailListener(new ThumbnailAdapter() {
			final FrameToolTip frameTooltip = new FrameToolTip("", null, null);

			@Override
			public void thumbnailClicked(final int index, MouseEvent e) {
			}

			@Override
			public void thumbnailMouseOver(final int index, MouseEvent e) {
				if (GlobalSecurity
						.isUpdatePriviledge(SubAppTypes.MEDICATION_TREATMENT)) {
					final ActionListener alistener = new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Global.currentMedicationTreatmentFormKey = 0;
							Global.currentMedicationTreatmentForm = formName[index];

							frameMedicationTreatmentFormAdd = (FrameMedicationTreatmentFormAdd) FrameFactory
									.createWindowOfType(FrameMedicationTreatmentFormAdd.class);
							SwingUtils.center(frameMedicationTreatmentFormAdd);
							frameMedicationTreatmentFormAdd
									.setTitle("Add New Medical Treatment Form");
							frameMedicationTreatmentFormAdd.setModal(true);
							frameMedicationTreatmentFormAdd.setVisible(true);
							updateMedicationTreatmentFormJTable();
						}
					};

					frameTooltip.setHeading(formName[index]);
					frameTooltip.setPreviewImage(formIcon[index]);
					frameTooltip.setActionListener(alistener);
					frameTooltip.setModal(false);

					Point pt = imgSlider.getLocationOnScreen();
					frameTooltip.setLocation(e.getXOnScreen()
							- (frameTooltip.getWidth() / 2), pt.y
							- frameTooltip.getHeight());

					frameTooltip.setVisible(true);
				}
			}

			@Override
			public void thumbnailMouseOut(int index, MouseEvent e) {
				if (!frameTooltip.hasFocus() && !frameTooltip.isFocusOwner()) {
					frameTooltip.setVisible(false);
				}
			}
		});
		panel.add(imgSlider);
		fillCombos();

		// imgSlider.setLocation(0, 0);
		// imgSlider.setSize(2 *
		// Toolkit.getDefaultToolkit().getScreenSize().width, 350); //
		// Global.frameMainDesktopTmp.getRootPane().getLayeredPane().add(imgSlider,
		// LayeredDockPanel.DOCK_LAYER); //
		// Global.frameMainDesktopTmp.getRootPane().getLayeredPane().removeAll();
		// //
		// Global.frameMainDesktopTmp.getRootPane().getLayeredPane().setLayout(null);
		// Global.frameMainDesktopTmp.getRootPane().getLayeredPane().add(imgSlider);
		// //
		// Global.frameMainDesktopTmp.getContentPane().add(imgSlider, 0);
	}

	public void doUpdate() {
		updateMedicationTreatmentFormJTable();
	}

	public void openNewForm(String formName) {
		Global.currentMedicationTreatmentFormKey = 0;
		Global.currentMedicationTreatmentForm = formName;
		// Global.currentResidentAssessmentFormKey = 0;
		frameMedicationTreatmentFormAdd = (FrameMedicationTreatmentFormAdd) FrameFactory
				.createWindowOfType(FrameMedicationTreatmentFormAdd.class);
		SwingUtils.center(frameMedicationTreatmentFormAdd);
		frameMedicationTreatmentFormAdd
				.setTitle("Add New Medical Treatment Form");
		frameMedicationTreatmentFormAdd.setModal(true);
		frameMedicationTreatmentFormAdd.setVisible(true);
		updateMedicationTreatmentFormJTable();
	}

	public void updateMedicationTreatmentFormJTable() {
		List residentActivityRecords = new ArrayList();
		List<ScanForm> scanRecords = null;

		if (Global.currentResidenceKey != 0) {
			try {
				residentActivityRecords = MedrexClientManager
						.getInstance()
						.getMedicationTreatmentForms(Global.currentResidenceKey);

				scanRecords = MedrexClientManager
						.getInstance()
						.doLoadScans(
								Global.currentResidenceKey,
								Global.currentResidentTabs.MEDICATION_AND_TREATMENT.Name);
				/*
				 * java.io.File currentDir = new java.io.File("");
				 * 
				 * f = new File( currentDir.getAbsolutePath() + "\\scans\\" +
				 * Global.currentResidenceKey + "\\" +
				 * medrex.commons.enums.ResidentTabs
				 * .MEDICATION_AND_TREATMENT.Name + "\\").listFiles();
				 */
			} catch (Exception e) {

			}

		}

		if (scanRecords != null) {
			residentActivityRecords.addAll(scanRecords);
		}

		/*
		 * if (f != null) { for (int i = 0; i < f.length; i++) { if
		 * (f[i].getAbsolutePath().endsWith(".jpg")) {
		 * residentActivityRecords.add(f[i]); } else { //
		 * System.out.println(f[i].getAbsolutePath()); } } }
		 * 
		 * Collections.sort(residentActivityRecords, new Comparator() { // +1 if
		 * a > b // 0 if a = b // -1 if a < b public int compare(final Object a,
		 * final Object b) { Date aDate, bDate; aDate = (a instanceof
		 * MedicationTreatmentForm) ? ((MedicationTreatmentForm) a)
		 * .getDateCreated() : new Date(((File) a).lastModified()); bDate = (b
		 * instanceof MedicationTreatmentForm) ? ((MedicationTreatmentForm) b)
		 * .getDateCreated() : new Date(((File) b).lastModified());
		 * 
		 * if (aDate.getTime() == bDate.getTime()) { return 0; } else return
		 * (aDate.getTime() > bDate.getTime()) ? 1 : -1; } });
		 */

		medicationTreatmentFormTable.setNewList(residentActivityRecords);
		medicationTreatmentFormTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}

	private void fillCombos() {
		String[] imgPath = new String[] { "PainMgtRecord.png",
		/*
		 * "NurseTreatmentNotes.png", "NurseMedicationNotes.png",
		 * "MedicationAdmn.png", "MedicationPRN.png", "MedicationRoutine.png",
		 */"TreatmentPRN.png", "TreatmentRoutine.png",
				"PressureSoreRecord.png", "Notes.png" /* ,"DailySkilledNurses.png" */};

		cmbFormType.setModel(new javax.swing.DefaultComboBoxModel(formName));

		formIcon = new ImageIcon[imgPath.length];
		for (int i = 0; i < imgPath.length; i++) {
			BufferedImage img = new BufferedImage(100, 100,
					BufferedImage.TYPE_INT_RGB);
			try {
				img = ImageIO.read(new File("img/formThumbnails/Medication/"
						+ imgPath[i]));
				formIcon[i] = new ImageIcon(img);
				// ImageLabel com = new ImageLabel(new ImageIcon(img), 32, 32);
				// imgSlider.addDockElement(com, formName[i]);

				imgSlider.insertElement(img, formName[i]);
				// com.addMouseListener(new MouseAdapter() {
				// public void mouseClicked(MouseEvent arg0) {
				// if (GlobalSecurity
				// .isUpdatePriviledge(SubAppTypes.MEDICATION_TREATMENT)) {
				// Global.currentMedicationTreatmentFormKey = 0;
				// Global.currentMedicationTreatmentForm = formName[index]; //
				// Global.currentResidentAssessmentFormKey = 0;
				// frameMedicationTreatmentFormAdd =
				// (FrameMedicationTreatmentFormAdd)
				// FrameFactory.createWindowOfType(FrameMedicationTreatmentFormAdd.class);
				// SwingUtils.center(frameMedicationTreatmentFormAdd);
				// frameMedicationTreatmentFormAdd
				// .setTitle("Add New Medical Treatment Form");
				// frameMedicationTreatmentFormAdd.setModal(true);
				// frameMedicationTreatmentFormAdd.setVisible(true);
				// updateMedicationTreatmentFormJTable();
				// }
				// }
				// });

			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
		}

	}
}

class MedicationTreatmentFormsJTable extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2318678325555988126L;

	private String[] columnNames = { "Date Created", "Form Type",
			"Last Modified", "Status", "User" };

	public List medicationTreatmentForms;

	int n = 0;

	MedicationTreatmentFormsJTable(List activityRecords) {
		medicationTreatmentForms = activityRecords;
	}

	MedicationTreatmentFormsJTable() {
		medicationTreatmentForms = new ArrayList();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (medicationTreatmentForms.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List activityRecords) {
		medicationTreatmentForms = activityRecords;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			Object o = medicationTreatmentForms.get(row);
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MM / dd / yyyy  hh:mm a");
			if (o instanceof MedicationTreatmentForm) {

				MedicationTreatmentForm rc = (MedicationTreatmentForm) o;

				if (col == 0) {
					return (df.format(rc.getDateCreated()) + "");
				}
				if (col == 1) {
					return (rc.getFormType());
				}
				if (col == 2) {
					return (df.format(rc.getLastModified()) + "");
				}
				if (col == 3) {
					return (rc.getStatus() + "");
				}
				if (col == 4) {
					return (rc.getUser() + "");
				}
				if (col == 5) {
					return rc.getSerial();
				}
				if (col == 6) {
					return rc.getFormId();
				}

				return ("");
			} else {
				ScanForm rc = (ScanForm) o;
				if (col == 0) {
					return df.format(rc.getDateCreated()) + "";
				}
				if (col == 1) {
					return rc.getScanFormType();
				}
				if (col == 2) {
					return ("");
				}
				if (col == 3) {
					return ("Completed");
				}
				if (col == 4) {
					return "";
				}
				if (col == 5) {
					return (rc.getSerial());
				}
				if (col == 6) {
					return rc.getFileName();
				}
				if (col == 7) {
					return rc.getFileName();
				}

				return ("");

			}
		}

		catch (Exception e) {
			return ("");
		}

	}
}
