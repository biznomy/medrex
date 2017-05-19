package medrex.client.main.dietary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
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
import medrex.client.main.progressNotes.FrameProgressNotesAdd;
import medrex.client.main.scan.FrameScanFormAdd;
import medrex.client.test.ImageSlider;
import medrex.client.test.ThumbnailAdapter;
import medrex.client.utils.SwingUtils;
import medrex.client.utils.controls.FrameToolTip;
import medrex.commons.enums.GuiModes;
import medrex.commons.enums.SubAppTypes;
import medrex.commons.vo.dietary.Dietary;
import medrex.commons.vo.notes.Notes;
import medrex.commons.vo.scan.ScanForm;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;
import com.sX.swing.notes.JxNotesEditor;

public class PanelDietary extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8718121322669561249L;
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);

	public JxComboBox cmbFormType;

	private JxTable table;

	private DietaryJTable dietaryTable;

	public FrameDietaryAdd frameDietaryAdd;

	public FrameScanFormAdd frameScanFormAdd;
	private ImageSlider imgSlider;
	private String[] formName = new String[] {
	/* "Dietary Communication Form", */
	"Nutrition Assessment",
	/* "Enteral Feeding Progress Notes", */
	/* "Consultant Dietician Nutritional Recommendations" , */
	"Nutrition Support Assessment Form", "Dietary Notes", "Dietary Alert Sheet" };
	private ImageIcon[] formIcon;
	private JxNotesEditor editor;
	private boolean isCategories;
	private Date creationDate;

	/**
	 * Create the panel
	 */
	public PanelDietary() {
		super();
		Global.tabName = Global.currentResidentTabs.DIETARY.Name;
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
		dietaryTable = new DietaryJTable();
		table.setModel(dietaryTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					int id = new Integer((String) dietaryTable.getValueAt(table
							.getSelectedRow(), 5)).intValue();

					if (id != -1 && id != 0) {
						String frmName = (dietaryTable.getValueAt(table
								.getSelectedRow(), 1)).toString();
						Global.currentDietaryKey = id;
						if (!("Notes".equalsIgnoreCase(frmName))) {
							frameDietaryAdd = (FrameDietaryAdd) FrameFactory
									.createWindowOfType(FrameDietaryAdd.class);
							SwingUtils.center(frameDietaryAdd);
							frameDietaryAdd.setTitle("Add New Dietary");
							frameDietaryAdd.setModal(true);
							frameDietaryAdd.setVisible(true);
						} else {
							openNotesDialog();
						}
					} else {
						String file = (String) dietaryTable.getValueAt(table
								.getSelectedRow(), 7);
						Global.currentScanFormImageFileName = file;
						frameScanFormAdd = (FrameScanFormAdd) FrameFactory
								.createWindowOfType(FrameScanFormAdd.class);
						SwingUtils.center(frameScanFormAdd);
						frameScanFormAdd.setTitle("View Scan Record");
						frameScanFormAdd.setModal(true);
						frameScanFormAdd.setVisible(true);
					}
					updateDietaryJTable();
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
			private FrameProgressNotesAdd frameProgressNotesAdd;

			public void actionPerformed(final ActionEvent e) {
				// if (GlobalSecurity.isUpdatePriviledge(SubAppTypes.DIETARY)) {
				Global.currentDietaryKey = 0;
				Global.currentDietaryCommunicationFormKey = 0;
				Global.currentDietaryResidentDiagnosisKey = 0;

				Global.currentDietaryForm = (String) cmbFormType
						.getSelectedItem();

				if (!(Global.currentDietaryForm)
						.equalsIgnoreCase("Dietary Notes")) {

					frameDietaryAdd = (FrameDietaryAdd) FrameFactory
							.createWindowOfType(FrameDietaryAdd.class);
					SwingUtils.center(frameDietaryAdd);
					frameDietaryAdd.setTitle("Add New Dietary");
					frameDietaryAdd.setModal(true);
					frameDietaryAdd.setVisible(true);
				} else {
					openNotesDialog();
				}
				updateDietaryJTable();
				// }
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
					int id = new Integer((String) dietaryTable.getValueAt(table
							.getSelectedRow(), 5)).intValue();

					if (id != -1 && id != 0) {
						String frmName = (dietaryTable.getValueAt(table
								.getSelectedRow(), 1)).toString();
						Global.currentDietaryKey = id;
						if (!("Notes".equalsIgnoreCase(frmName))) {
							frameDietaryAdd = (FrameDietaryAdd) FrameFactory
									.createWindowOfType(FrameDietaryAdd.class);
							SwingUtils.center(frameDietaryAdd);
							frameDietaryAdd.setTitle("Add New Dietary");
							frameDietaryAdd.setModal(true);
							frameDietaryAdd.setVisible(true);
						} else {
							openNotesDialog();
						}
					} else {
						String file = (String) dietaryTable.getValueAt(table
								.getSelectedRow(), 7);
						Global.currentScanFormImageFileName = file;
						frameScanFormAdd = (FrameScanFormAdd) FrameFactory
								.createWindowOfType(FrameScanFormAdd.class);
						SwingUtils.center(frameScanFormAdd);
						frameScanFormAdd.setTitle("View Scan Record");
						frameScanFormAdd.setModal(true);
						frameScanFormAdd.setVisible(true);

					}
					updateDietaryJTable();
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
					int id = new Integer((String) dietaryTable.getValueAt(table
							.getSelectedRow(), 5)).intValue();

					if (id != -1 && id != 0) {
						int formId = new Integer((String) dietaryTable
								.getValueAt(table.getSelectedRow(), 6))
								.intValue();
						String formType = (String) dietaryTable.getValueAt(
								table.getSelectedRow(), 1);

						/*
						 * if (formId != 0 &&
						 * formType.equals(FormSchedulerConstants
						 * .DIETARY_COMMUNICATION_FORM)) {
						 * MedrexClientManager.getInstance
						 * ().deleteDietaryCommunicationForm(formId); }
						 */
						if (formId != 0
								&& formType
										.equals(FormSchedulerConstants.DIETARY_RESIDENT_DIAGNOSIS_FORM)) {
							MedrexClientManager.getInstance()
									.deleteDietaryResidentDiagnosis(formId);
						}

						System.out
								.println("Coming from Constant : "
										+ FormSchedulerConstants.DIETARY_RESIDENT_DIAGNOSIS_FORM);
						System.out.println("comming form FormTyep :  "
								+ formType);

						/*
						 * if (formId != 0 &&
						 * formType.equals(FormSchedulerConstants
						 * .ENTERAL_FEEDING_PROGRESS_NOTES)) {
						 * MedrexClientManager
						 * .getInstance().deleteEnteralFeeding(formId); }
						 */
						/*
						 * if (formId != 0 &&
						 * formType.equals(FormSchedulerConstants
						 * .CONSULTANT_DIETICIAN_NURITIONAL_RECOMMEDATIONS)) {
						 * MedrexClientManager
						 * .getInstance().deleteDietaryPlazaHealth(formId);
						 * MedrexClientManager
						 * .getInstance().deleteDietaryPlazaHealthRow(formId); }
						 */
						if (formId != 0
								&& formType
										.equals(FormSchedulerConstants.NUTRITION_SUPPORT_ASSESSMENT_FORM)) {
							MedrexClientManager.getInstance()
									.deleteNutritionSupportAssessmentFormPage1(
											formId);
						}
						if (formId != 0
								&& formType
										.equals(FormSchedulerConstants.DIETARY_ALERT_SHEET)) {
							MedrexClientManager.getInstance()
									.deleteDietaryAlertSheet(formId);
						}
						MedrexClientManager.getInstance().deleteDietary(id);
						Global.currentDietaryKey = 0;
						// Global.currentDietaryCommunicationFormKey = 0;
						Global.currentDietaryResidentDiagnosisKey = 0;
						Global.currentEnteralFeedingKey = 0;
						Global.currentDietaryPlazaHealthKey = 0;
						Global.currentNutritionSupportAssessmentFormKey = 0;
					} else {
						String file = (String) dietaryTable.getValueAt(table
								.getSelectedRow(), 7);
						MedrexClientManager.getInstance().deleteScanForm(
								Global.currentResidenceKey,
								Global.currentResidentTabs.DIETARY.Name, file);
						Global.currentScanFormImageFileName = null;

					}
					updateDietaryJTable();

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
		residentInformationLabel.setText("DIETARY");
		panel.add(residentInformationLabel);

		cmbFormType = new JxComboBox();
		cmbFormType.setBackground(Color.WHITE);
		cmbFormType.setArc(0.4f);
		cmbFormType.setForeground(DEF_COL);
		cmbFormType.setBorder(new LineBorder(BORDER_COL, 1, false));
		cmbFormType.setBounds(110, 265, 276, 29);
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
				updateDietaryJTable();
			}
		});
		scanNewButton.setFont(new Font("Dialog", Font.BOLD, 12));
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
							Global.currentDietaryKey = 0;
							Global.currentDietaryForm = formName[index];
							// Global.currentResidentAssessmentFormKey = 0;
							if (!(Global.currentDietaryForm
									.equalsIgnoreCase("Dietary Notes"))) {
								frameDietaryAdd = (FrameDietaryAdd) FrameFactory
										.createWindowOfType(FrameDietaryAdd.class);
								SwingUtils.center(frameDietaryAdd);
								frameDietaryAdd.setTitle("Add New Dietary");
								frameDietaryAdd.setModal(true);
								frameDietaryAdd.setVisible(true);
							} else {
								openNotesDialog();
							}
							updateDietaryJTable();
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

	private void openNotesDialog() {
		Notes notes = null;
		if (Global.currentDietaryKey != 0) {
			Dietary ar = null;
			try {
				ar = MedrexClientManager.getInstance().getDietary(
						Global.currentDietaryKey);
				if (ar != null) {
					notes = ar.getDietaryNotes();
					creationDate = ar.getDateCreated();
				}

			} catch (Exception e) {
			}
		} else {
			notes = new Notes();
			notes.setFormName("Dietary Notes");
			notes.setUserId(Global.currentLoggedInUserKey);
		}

		// If true then categories list and label will display otherwise not.
		isCategories = true;

		editor = new JxNotesEditor(notes, isCategories);
		editor.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		editor.setTitle("Notes Editor");
		editor.setVisible(true);
		if (!editor.isCancel()) {
			doSaveNotes();
		}
	}

	protected void doSaveNotes() {
		int resid = Global.currentResidenceKey;
		Dietary dietary = new Dietary();
		Notes notes = editor.getNotesMain();
		dietary.setSerial(Global.currentDietaryKey);
		dietary.setResidentId(resid);
		dietary.setFormType("Notes");
		dietary.setUser("Admin");
		dietary.setStatus("Complete");

		if (Global.currentDietaryKey == 0) {
			Date d = MedrexClientManager.getServerTime();
			dietary.setDateCreated(d);
			if (notes != null) {
				notes.setCreatedDate(d);
			}
		} else {
			dietary.setDateCreated(creationDate);
		}
		dietary.setLastModified(MedrexClientManager.getServerTime());
		notes.setResidentId(resid);
		dietary.setDietaryNotes(notes);

		try {
			Global.currentDietaryKey = MedrexClientManager.getInstance()
					.insertOrUpdateDietary(dietary);
		} catch (Exception e) {
		}
	}

	public void openNewForm(String formName) {
		Global.currentDietaryKey = 0;
		Global.currentDietaryCommunicationFormKey = 0;

		Global.currentDietaryForm = formName;

		frameDietaryAdd = (FrameDietaryAdd) FrameFactory
				.createWindowOfType(FrameDietaryAdd.class);
		SwingUtils.center(frameDietaryAdd);
		frameDietaryAdd.setTitle("Add New Dietary");
		frameDietaryAdd.setModal(true);
		frameDietaryAdd.setVisible(true);
		updateDietaryJTable();
	}

	private void doUpdate() {
		updateDietaryJTable();
	}

	public void fillCombos() {
		String[] imgPath = new String[] { /* "DietaryCommunicationForm.png", */
				"NutritionAssessmentForm.png", /*
												 * "EnteralFeedingProgressNotes.png",
												 */
				/* "ConsultantDieticianNutritionalRecommendations.png", */"Nutrition.png",
				"Notes.png", "DietaryAlertSheet.png" };

		cmbFormType.setModel(new DefaultComboBoxModel(new String[] {/*
																	 * "Dietary Communication Form",
																	 */
		"Nutrition Assessment", /* "Enteral Feeding Progress Notes", *//*
																		 * "Consultant Dietician Nutritional Recommendations",
																		 */
		"Nutrition Support Assessment Form", "Dietary Notes",
				"Dietary Alert Sheet" }));

		formIcon = new ImageIcon[imgPath.length];
		for (int i = 0; i < imgPath.length; i++) {
			BufferedImage img = new BufferedImage(100, 100,
					BufferedImage.TYPE_INT_RGB);
			try {
				img = ImageIO.read(new File("img/formThumbnails/Dietary/"
						+ imgPath[i]));
				formIcon[i] = new ImageIcon(img);
				imgSlider.insertElement(img, formName[i]);

			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
		}

	}

	public void updateDietaryJTable() {
		List dietarys = new ArrayList();
		List<ScanForm> scanRecords = null;
		if (Global.currentResidenceKey != 0) {
			try {
				dietarys = MedrexClientManager.getInstance().getDietarys(
						Global.currentResidenceKey);
				scanRecords = MedrexClientManager.getInstance().doLoadScans(
						Global.currentResidenceKey,
						Global.currentResidentTabs.DIETARY.Name);

				// java.io.File currentDir = new java.io.File("");
				/*
				 * f = new File(currentDir.getAbsolutePath() + "\\scans\\" +
				 * Global.currentResidenceKey + "\\" +
				 * medrex.commons.enums.ResidentTabs.DIETARY.Name + "\\")
				 * .listFiles();
				 */
			} catch (Exception e) {

			}
		}
		if (scanRecords != null) {
			dietarys.addAll(scanRecords);
		}
		/*
		 * if (f != null) { for (int i = 0; i < f.length; i++) { if
		 * (f[i].getAbsolutePath().endsWith(".jpg")) { dietarys.add(f[i]); }
		 * else { System.out.println(f[i].getAbsolutePath()); }
		 * 
		 * } } Collections.sort(dietarys, new Comparator() { // +1 if a > b // 0
		 * if a = b // -1 if a < b public int compare(final Object a, final
		 * Object b) { Date aDate, bDate; aDate = (a instanceof Dietary) ?
		 * ((Dietary) a).getDateCreated() : new Date(((File) a).lastModified());
		 * bDate = (b instanceof Dietary) ? ((Dietary) b).getDateCreated() : new
		 * Date(((File) b).lastModified());
		 * 
		 * if (aDate.getTime() == bDate.getTime()) { return 0; } else return
		 * (aDate.getTime() > bDate.getTime()) ? 1 : -1; } });
		 */
		dietaryTable.setNewList(dietarys);
		dietaryTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}

}

class DietaryJTable extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5444986444809077798L;

	private String[] columnNames = { "Date Created", "Form Type",
			"Last Modified", "Status", "User" };

	public List dietarys;

	int n = 0;

	DietaryJTable(List dietaryss) {
		dietarys = dietaryss;
	}

	DietaryJTable() {
		dietarys = new ArrayList();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (dietarys.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List admissionRecords) {
		dietarys = admissionRecords;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			Object o = dietarys.get(row);
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MM / dd / yyyy");
			if (o instanceof Dietary) {
				Dietary rc = (Dietary) o;
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
