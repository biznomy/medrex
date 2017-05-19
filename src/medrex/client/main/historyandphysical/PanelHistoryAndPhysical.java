package medrex.client.main.historyandphysical;

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
import medrex.client.constants.FormSchedulerConstants;
import medrex.client.constants.Global;
import medrex.client.constants.GlobalSecurity;
import medrex.client.main.scan.FrameScanFormAdd;
import medrex.client.test.ImageSlider;
import medrex.client.test.ThumbnailAdapter;
import medrex.client.utils.SwingUtils;
import medrex.client.utils.controls.FrameToolTip;
import medrex.commons.enums.GuiModes;
import medrex.commons.enums.SubAppTypes;
import medrex.commons.vo.historyAndPhysical.HistoryAndPhysical;
import medrex.commons.vo.scan.ScanForm;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;

public class PanelHistoryAndPhysical extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -759392279205266424L;
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);

	private JxComboBox cmbFormType;
	private JxTable table;
	private HistoryAndPhysicalJTable historyAndPhysicalJTable;
	public FrameHistoryAndPhysicalAdd frameHistoryAndPhysical;
	public FrameScanFormAdd frameScanFormAdd;

	private ImageSlider imgSlider;
	private String[] formName = new String[] {
			"History And Physical General"/* , "Resident Immunization Form" */,
			"Cumulative Diagnosis", "Monthly Vital Signs And Weight Sheet",
			"Weekly Weights" };
	private ImageIcon[] formIcon;

	/**
	 * Create the panel
	 */
	public PanelHistoryAndPhysical() {
		super();
		Global.tabName = Global.currentResidentTabs.HISTORY_AND_PHYSICAL.Name;
		setLayout(null);
		setPreferredSize(new Dimension(718, 448));
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
		scrollPane.setBounds(20, 52, 680, 186);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(DEF_COL, 1, false));
		panel.add(scrollPane);

		table = new JxTable();
		historyAndPhysicalJTable = new HistoryAndPhysicalJTable();
		table.setModel(historyAndPhysicalJTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					int id = new Integer((String) historyAndPhysicalJTable
							.getValueAt(table.getSelectedRow(), 5)).intValue();

					if (id != -1 && id != 0) {
						Global.currentHistoryAndPhysicalKey = id;

						frameHistoryAndPhysical = (FrameHistoryAndPhysicalAdd) FrameFactory
								.createWindowOfType(FrameHistoryAndPhysicalAdd.class);
						SwingUtils.center(frameHistoryAndPhysical);
						frameHistoryAndPhysical
								.setTitle("View/Update History And Physical");
						frameHistoryAndPhysical.setModal(true);
						frameHistoryAndPhysical.setVisible(true);
					}

					else {
						String file = (String) historyAndPhysicalJTable
								.getValueAt(table.getSelectedRow(), 7);
						Global.currentScanFormImageFileName = file;
						frameScanFormAdd = (FrameScanFormAdd) FrameFactory
								.createWindowOfType(FrameScanFormAdd.class);
						SwingUtils.center(frameScanFormAdd);
						frameScanFormAdd.setTitle("View Scan Record");
						frameScanFormAdd.setModal(true);
						frameScanFormAdd.setVisible(true);
					}
					updateHistoryAndPhysicalJTable();
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
		btnAdd.setBounds(20, 248, 84, 26);
		btnAdd.setFont(new Font("", Font.BOLD, 12));
		btnAdd.addActionListener(new ActionListener() {

			public void actionPerformed(final ActionEvent e) {

				if (GlobalSecurity
						.isUpdatePriviledge(SubAppTypes.HISTORY_PHYSICAL)) {
					System.out.println("Action performed");
					Global.currentHistoryAndPhysicalKey = 0;
					Global.currentCumulativeDiagnosisFormKey = 0;

					Global.currentHistoryForm = (String) cmbFormType
							.getSelectedItem();

					frameHistoryAndPhysical = (FrameHistoryAndPhysicalAdd) FrameFactory
							.createWindowOfType(FrameHistoryAndPhysicalAdd.class);
					SwingUtils.center(frameHistoryAndPhysical);
					frameHistoryAndPhysical
							.setTitle("Add New History And Physical");
					frameHistoryAndPhysical.setModal(true);
					frameHistoryAndPhysical.setVisible(true);
					updateHistoryAndPhysicalJTable();
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
					int id = new Integer((String) historyAndPhysicalJTable
							.getValueAt(table.getSelectedRow(), 5)).intValue();

					if (id != -1 && id != 0) {
						Global.currentHistoryAndPhysicalKey = id;

						frameHistoryAndPhysical = (FrameHistoryAndPhysicalAdd) FrameFactory
								.createWindowOfType(FrameHistoryAndPhysicalAdd.class);
						SwingUtils.center(frameHistoryAndPhysical);
						frameHistoryAndPhysical
								.setTitle("View/Update History And Physical");
						frameHistoryAndPhysical.setModal(true);
						frameHistoryAndPhysical.setVisible(true);
					} else {
						String file = (String) historyAndPhysicalJTable
								.getValueAt(table.getSelectedRow(), 7);
						Global.currentScanFormImageFileName = file;
						frameScanFormAdd = (FrameScanFormAdd) FrameFactory
								.createWindowOfType(FrameScanFormAdd.class);
						SwingUtils.center(frameScanFormAdd);
						frameScanFormAdd.setTitle("View Scan Record");
						frameScanFormAdd.setModal(true);
						frameScanFormAdd.setVisible(true);
					}
					updateHistoryAndPhysicalJTable();
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
					int id = new Integer((String) historyAndPhysicalJTable
							.getValueAt(table.getSelectedRow(), 5)).intValue();

					if (id != -1 && id != 0) {
						int formId = new Integer(
								(String) historyAndPhysicalJTable.getValueAt(
										table.getSelectedRow(), 6)).intValue();
						String formType = (String) historyAndPhysicalJTable
								.getValueAt(table.getSelectedRow(), 1);
						if (formId != 0
								&& formType
										.equals(FormSchedulerConstants.HISTORY_AND_PHYSICIAL_GENERAL)) {
							MedrexClientManager.getInstance()
									.deleteHistoryAndPhysicalGeneralFormPage1(
											formId);
							MedrexClientManager.getInstance()
									.deleteHistoryAndPhysicalGeneralFormPage2(
											formId);
						}
						/*
						 * if (formId != 0 && formType
						 * .equals(FormSchedulerConstants
						 * .RESIDENT_IMMUNIZATION_FORM)) {
						 * MedrexClientManager.getInstance()
						 * .deleteResidentImmunizationRecord(formId); }
						 */

						if (formId != 0
								&& formType
										.equals(FormSchedulerConstants.CUMULATIVE_DIAGNOSIS)) {
							MedrexClientManager.getInstance()
									.deleteCumulativeDiagnosisForm(formId);
							MedrexClientManager.getInstance()
									.deleteCumulativeDiagnosisFormRow(formId);
						}
						if (formId != 0
								&& formType
										.equals(FormSchedulerConstants.MONTHLY_VITAL_SIGNS_AND_WEIGHTS_SHEET)) {
							MedrexClientManager.getInstance()
									.deleteMonthlyVitalSheetForm(formId);
							MedrexClientManager.getInstance()
									.deleteMonthlyVitalSheetFormRow(formId);
						}
						if (formId != 0
								&& formType
										.equals(FormSchedulerConstants.WEEKLY_WEIGHTS)) {
							MedrexClientManager.getInstance()
									.deleteWeeklyWeightsForm(formId);
							MedrexClientManager.getInstance()
									.deleteWeeklyWeightsFormRow(formId);
						}
						MedrexClientManager.getInstance()
								.deleteHistoryAndPhysical(id);
						Global.currentHistoryAndPhysicalKey = 0;
						Global.currentHistoryAndPhysicalGeneralFormPage1Key = 0;
						Global.currentHistoryAndPhysicalGeneralFormPage2Key = 0;
						Global.currentResidentImmunizationRecordKey = 0;
						Global.currentCumulativeDiagnosisFormKey = 0;
						Global.currentMonthlyVitalSheetFormKey = 0;
						Global.currentWeeklyWeightsFormKey = 0;
					} else {
						String file = (String) historyAndPhysicalJTable
								.getValueAt(table.getSelectedRow(), 7);
						MedrexClientManager
								.getInstance()
								.deleteScanForm(
										Global.currentResidenceKey,
										Global.currentResidentTabs.HISTORY_AND_PHYSICAL.Name,
										file);
						Global.currentScanFormImageFileName = null;
					}
					updateHistoryAndPhysicalJTable();

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
		residentInformationLabel.setText("HISTORY & PHYSICAL");
		panel.add(residentInformationLabel);

		cmbFormType = new JxComboBox();
		cmbFormType.setBackground(Color.WHITE);
		cmbFormType.setArc(0.4f);
		cmbFormType.setForeground(DEF_COL);
		cmbFormType.setBorder(new LineBorder(BORDER_COL, 1, false));
		cmbFormType.setBounds(110, 265, 249, 29);
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
				frameScanFormAdd = null;
				updateHistoryAndPhysicalJTable();

			}
		});
		scanNewButton.setText("Scan New");
		panel.add(scanNewButton);
		imgSlider = new ImageSlider();
		imgSlider.setBackground(GuiModes.DESIGNER_FORMS
				.getDefaultBackgroundColor()); //
		imgSlider.setBorder(new LineBorder(BORDER_COL, 1, false));
		imgSlider.setNormalSize(128);
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
							Global.currentHistoryAndPhysicalKey = 0;
							Global.currentCumulativeDiagnosisFormKey = 0;
							Global.currentHistoryForm = formName[index];
							// Global.currentResidentAssessmentFormKey = 0;

							frameHistoryAndPhysical = (FrameHistoryAndPhysicalAdd) FrameFactory
									.createWindowOfType(FrameHistoryAndPhysicalAdd.class);
							SwingUtils.center(frameHistoryAndPhysical);
							frameHistoryAndPhysical
									.setTitle("Add New History & Physical");
							frameHistoryAndPhysical.setModal(true);
							frameHistoryAndPhysical.setVisible(true);
							updateHistoryAndPhysicalJTable();
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

	}

	public void doUpdate() {
		updateHistoryAndPhysicalJTable();
	}

	public void openNewForm(String formName) {
		Global.currentHistoryAndPhysicalKey = 0;
		Global.currentCumulativeDiagnosisFormKey = 0;

		Global.currentHistoryForm = formName;

		frameHistoryAndPhysical = (FrameHistoryAndPhysicalAdd) FrameFactory
				.createWindowOfType(FrameHistoryAndPhysicalAdd.class);
		SwingUtils.center(frameHistoryAndPhysical);
		frameHistoryAndPhysical.setTitle("Add New History And Physical");
		frameHistoryAndPhysical.setModal(true);
		frameHistoryAndPhysical.setVisible(true);
		updateHistoryAndPhysicalJTable();
	}

	public void fillCombos() {
		String[] imgPath = new String[] { "HistoryAndPhysicalGeneral.png",
		/* "ResidentImmunizationForm.png", */"CumulativeDiagnosis.png",
				"MonthlyVitalSignsAndWeightSheet.png", "WeeklyWeights.png" };

		cmbFormType.setModel(new javax.swing.DefaultComboBoxModel(formName));

		formIcon = new ImageIcon[imgPath.length];
		for (int i = 0; i < imgPath.length; i++) {
			BufferedImage img = new BufferedImage(100, 100,
					BufferedImage.TYPE_INT_RGB);
			try {
				img = ImageIO.read(new File(
						"img/formThumbnails/History Physical/" + imgPath[i]));
				formIcon[i] = new ImageIcon(img);
				imgSlider.insertElement(img, formName[i]);

			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
		}
	}

	public void updateHistoryAndPhysicalJTable() {
		List historyAndPhysicalRecords = new ArrayList();
		List<ScanForm> scanRecords = null;
		if (Global.currentResidenceKey != 0) {
			try {
				historyAndPhysicalRecords = MedrexClientManager.getInstance()
						.getHistoryAndPhysicals(Global.currentResidenceKey);

				scanRecords = MedrexClientManager.getInstance().doLoadScans(
						Global.currentResidenceKey,
						Global.currentResidentTabs.HISTORY_AND_PHYSICAL.Name);

				// java.io.File currentDir = new java.io.File("");

				/*
				 * f = new File( currentDir.getAbsolutePath() + "\\scans\\" +
				 * Global.currentResidenceKey + "\\" +
				 * medrex.commons.enums.ResidentTabs.HISTORY_AND_PHYSICAL.Name +
				 * "\\").listFiles();
				 */

			} catch (Exception e) {

			}
		}
		if (scanRecords != null) {
			historyAndPhysicalRecords.addAll(scanRecords);
		}
		/*
		 * if (f != null) { for (int i = 0; i < f.length; i++) { if
		 * (f[i].getAbsolutePath().endsWith(".jpg")) {
		 * historyAndPhysicalRecords.add(f[i]); } else {
		 * System.out.println(f[i].getAbsolutePath()); } } }
		 * 
		 * Collections.sort(historyAndPhysicalRecords, new Comparator() { // +1
		 * if a > b // 0 if a = b // -1 if a < b public int compare(final Object
		 * a, final Object b) { Date aDate, bDate; aDate = (a instanceof
		 * HistoryAndPhysical) ? ((HistoryAndPhysical) a) .getDateCreated() :
		 * new Date(((File) a).lastModified()); bDate = (b instanceof
		 * HistoryAndPhysical) ? ((HistoryAndPhysical) b) .getDateCreated() :
		 * new Date(((File) b).lastModified());
		 * 
		 * if (aDate.getTime() == bDate.getTime()) { return 0; } else return
		 * (aDate.getTime() > bDate.getTime()) ? 1 : -1; } });
		 */

		historyAndPhysicalJTable.setNewList(historyAndPhysicalRecords);
		historyAndPhysicalJTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}

}

class HistoryAndPhysicalJTable extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5327841199434187449L;

	private String[] columnNames = { "Date Created", "Form Type",
			"Last Modified", "Status", "User" };

	public List historyAndPhysicals;

	int n = 0;

	HistoryAndPhysicalJTable(List activityRecords) {
		historyAndPhysicals = activityRecords;
	}

	HistoryAndPhysicalJTable() {
		historyAndPhysicals = new ArrayList();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (historyAndPhysicals.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List activityRecords) {
		historyAndPhysicals = activityRecords;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {

			Object o = historyAndPhysicals.get(row);
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MM / dd / yyyy");
			if (o instanceof HistoryAndPhysical) {
				HistoryAndPhysical rc = (HistoryAndPhysical) o;

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
					return (rc.getSerial() + "");
				}
				if (col == 6) {
					return rc.getFileName();
				}
				if (col == 7) {
					return rc.getFileName();
				}

				return ("");

			}
		} catch (Exception e) {
			return ("");
		}

	}
}
