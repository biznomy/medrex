package medrex.client.main.progressNotes;

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
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
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
import medrex.client.main.FrameCategoriesNotesReport;
import medrex.client.main.scan.FrameScanFormAdd;
import medrex.client.test.ImageSlider;
import medrex.client.test.ThumbnailAdapter;
import medrex.client.utils.SwingUtils;
import medrex.client.utils.controls.FrameToolTip;
import medrex.commons.enums.GuiModes;
import medrex.commons.enums.SubAppTypes;
import medrex.commons.vo.notes.Notes;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.progressNotes.ProgressNotes;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;
import com.sX.swing.notes.JxNotesEditor;

public class PanelProgressNotes extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6292165934591644199L;
	private JxButton btnReport;
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);

	private JxComboBox cmbFormType;
	private JxTable table;
	private ProgressNotesJTable progressNotesJTable;
	public FrameProgressNotesAdd frameProgressNotesAdd;
	public FrameScanFormAdd frameScanFormAdd;
	private JxNotesEditor editor;
	private Date creationDate;

	private ImageSlider imgSlider;
	private String[] formName = new String[] {
	/*
	 * "Doctors Progress Notes", "InterDisciplinary Progress Notes",
	 */
	"Notes" };
	private ImageIcon[] formIcon;
	private boolean isCategories;

	/**
	 * Create the panel
	 */
	public PanelProgressNotes() {
		super();
		// Global.panelProgressNotes = this;
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
		progressNotesJTable = new ProgressNotesJTable();
		table.setModel(progressNotesJTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					int id = new Integer((String) progressNotesJTable
							.getValueAt(table.getSelectedRow(), 5)).intValue();
					String formType = (String) progressNotesJTable.getValueAt(
							table.getSelectedRow(), 1);
					if (id != -1) {
						Global.currentProgressNotesKey = id;
						if (!("Notes".equalsIgnoreCase(formType))) {
							frameProgressNotesAdd = (FrameProgressNotesAdd) FrameFactory
									.createWindowOfType(FrameProgressNotesAdd.class);
							SwingUtils.center(frameProgressNotesAdd);
							frameProgressNotesAdd
									.setTitle("View/Update Progress Notes");
							frameProgressNotesAdd.setModal(true);
							frameProgressNotesAdd.setVisible(true);
						} else {
							openNotesDialog();
						}
					} else {
						File scannedFile = (File) progressNotesJTable
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
					updateProgressNotesJTable();
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
						.isUpdatePriviledge(SubAppTypes.PROGRESS_NOTES)) {
					Global.currentProgressNotesKey = 0;
					Global.currentProgressNotesForm = (String) cmbFormType
							.getSelectedItem();
					if (!(Global.currentProgressNotesForm)
							.equalsIgnoreCase("Notes")) {
						frameProgressNotesAdd = (FrameProgressNotesAdd) FrameFactory
								.createWindowOfType(FrameProgressNotesAdd.class);
						SwingUtils.center(frameProgressNotesAdd);
						frameProgressNotesAdd
								.setTitle("Add New Progress Notes");
						frameProgressNotesAdd.setModal(true);
						frameProgressNotesAdd.setVisible(true);
					} else {
						openNotesDialog();
					}

					updateProgressNotesJTable();
				}
			}
		});
		btnAdd.setText("Add New");
		panel.add(btnAdd);

		final JxButton btnView = new JxButton(0.4f);
		btnView.setBackground(Color.WHITE);
		btnView.setForeground(DEF_COL);
		btnView.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnView.setBounds(365, 264, 100, 26);
		btnView.setFont(new Font("", Font.BOLD, 12));
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					int id = new Integer((String) progressNotesJTable
							.getValueAt(table.getSelectedRow(), 5)).intValue();

					String formType = (String) progressNotesJTable.getValueAt(
							table.getSelectedRow(), 1);
					// System.out.println("formType: "+formType+", id: "+id);
					if (id != -1) {
						Global.currentProgressNotesKey = id;
						if (!("Notes".equalsIgnoreCase(formType))) {
							frameProgressNotesAdd = (FrameProgressNotesAdd) FrameFactory
									.createWindowOfType(FrameProgressNotesAdd.class);
							SwingUtils.center(frameProgressNotesAdd);
							frameProgressNotesAdd
									.setTitle("View/Update Progress Notes");
							frameProgressNotesAdd.setModal(true);
							frameProgressNotesAdd.setVisible(true);
						} else {
							openNotesDialog();
						}
					} else {

						File scannedFile = (File) progressNotesJTable
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
					updateProgressNotesJTable();
				} catch (Exception ve) {
				}
			}
		});
		btnView.setText("View / Update");
		panel.add(btnView);

		btnReport = new JxButton(0.4f);
		btnReport.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doReport();
			}
		});
		btnReport.setBackground(Color.WHITE);
		btnReport.setForeground(DEF_COL);
		btnReport.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnReport.setFont(new Font("", Font.BOLD, 12));
		btnReport.setText("Report");
		btnReport.setBounds(621, 264, 79, 26);
		panel.add(btnReport);

		final JxButton btnDelete = new JxButton(0.4f);
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setForeground(DEF_COL);
		btnDelete.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnDelete.setBounds(470, 264, 70, 26);
		btnDelete.setFont(new Font("", Font.BOLD, 12));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {

					int id = new Integer((String) progressNotesJTable
							.getValueAt(table.getSelectedRow(), 5)).intValue();
					int formId = new Integer((String) progressNotesJTable
							.getValueAt(table.getSelectedRow(), 6)).intValue();
					String formType = (String) progressNotesJTable.getValueAt(
							table.getSelectedRow(), 1);
					System.out.println("Form Id:" + formId);

					if (id != -1) {
						if (formId != 0
								&& formType.equals("Doctors Progress Notes")) {
							MedrexClientManager.getInstance()
									.deleteDoctorProgressNotesForm(formId);
							MedrexClientManager.getInstance()
									.deleteDoctorProgressNotesFormRow(formId);
						}
						if (formId != 0
								&& formType
										.equals("InterDisciplinary Progress Notes")) {
							MedrexClientManager.getInstance()
									.deleteInterDisciplinaryProgressNotesForm(
											formId);
							MedrexClientManager
									.getInstance()
									.deleteInterDisciplinaryProgressNotesFormRow(
											formId);
						}

						MedrexClientManager.getInstance().deleteProgressNotes(
								id);
						Global.currentProgressNotesKey = 0;
						// Global.currentDoctorsProgressNotesKey = 0;
						// Global.currentInterdisciplinaryProgressNotesKey = 0;

					} else {

						File scannedFile = (File) progressNotesJTable
								.getValueAt(table.getSelectedRow(), 6);

						scannedFile.delete();

					}
					updateProgressNotesJTable();

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
		btnCancel.setBounds(545, 264, 70, 26);
		panel.add(btnCancel);

		final JLabel residentInformationLabel = new JLabel();
		residentInformationLabel.setForeground(DEF_COL);
		residentInformationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		residentInformationLabel.setBounds(10, 10, 700, 30);
		residentInformationLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		residentInformationLabel.setText("PROGRESS NOTES");
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

				Global.currentScanFormname = (String) cmbFormType
						.getSelectedItem();
				Global.currentScanFormMode = false;
				frameScanFormAdd = (FrameScanFormAdd) FrameFactory
						.createWindowOfType(FrameScanFormAdd.class);
				SwingUtils.center(frameScanFormAdd);
				frameScanFormAdd.setTitle("Add New scanning Record");
				frameScanFormAdd.setModal(true);
				frameScanFormAdd.setVisible(true);
				updateProgressNotesJTable();
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
							Global.currentProgressNotesKey = 0;
							Global.currentProgressNotesForm = formName[index];
							// Global.currentResidentAssessmentFormKey = 0;
							if (!(Global.currentProgressNotesForm)
									.equalsIgnoreCase("Notes")) {
								frameProgressNotesAdd = (FrameProgressNotesAdd) FrameFactory
										.createWindowOfType(FrameProgressNotesAdd.class);
								SwingUtils.center(frameProgressNotesAdd);
								frameProgressNotesAdd
										.setTitle("Add New Progress Notes");
								frameProgressNotesAdd.setModal(true);
								frameProgressNotesAdd.setVisible(true);
							} else {
								openNotesDialog();
							}
							updateProgressNotesJTable();
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
		if (Global.currentProgressNotesKey != 0) {
			ProgressNotes ar = null;
			try {
				ar = MedrexClientManager.getInstance().getProgressNotes(
						Global.currentProgressNotesKey);
				if (ar != null) {
					notes = ar.getProNotes();
					creationDate = ar.getDateCreated();
				}

			} catch (Exception e) {
			}
		} else {
			notes = new Notes();
			notes.setFormName("Progress Notes");
			notes.setUserId(Global.currentLoggedInUserKey);
		}
		// No need to categories for doctors.
		// If true then categories list and label will display otherwise not.
		isCategories = false;

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
		ProgressNotes ar = new ProgressNotes();
		Notes notes = editor.getNotesMain();
		int patientSeen = editor.getPatientSeen();
		ar.setSerial(Global.currentProgressNotesKey);
		ar.setResidentId(resid);
		ar.setPatientSeen(patientSeen);
		ar.setFormType("Notes");
		ar.setUser("Admin");
		ar.setStatus("Complete");

		if (Global.currentProgressNotesKey == 0) {
			Date d = MedrexClientManager.getServerTime();
			ar.setDateCreated(d);
			if (notes != null) {
				notes.setCreatedDate(d);
			}
		} else {
			ar.setDateCreated(creationDate);
		}
		ar.setLastModified(MedrexClientManager.getServerTime());
		notes.setResidentId(resid);
		ar.setProNotes(notes);

		try {
			Global.currentProgressNotesKey = MedrexClientManager.getInstance()
					.insertOrUpdateProgressNotes(ar);
		} catch (Exception e) {
		}
	}

	public void doUpdate() {
		updateProgressNotesJTable();
	}

	public void openNewForm(String formName) {
		Global.currentProgressNotesKey = 0;
		Global.currentProgressNotesForm = formName;

		frameProgressNotesAdd = (FrameProgressNotesAdd) FrameFactory
				.createWindowOfType(FrameProgressNotesAdd.class);
		SwingUtils.center(frameProgressNotesAdd);
		frameProgressNotesAdd.setTitle("Add New Progress Notes");
		frameProgressNotesAdd.setModal(true);
		frameProgressNotesAdd.setVisible(true);
		updateProgressNotesJTable();
	}

	protected void doReport() {
		FrameCategoriesNotesReport frameCategoriesNotesReport = new FrameCategoriesNotesReport(
				"Progress Notes", Global.currentResidenceKey);
		SwingUtils.center(frameCategoriesNotesReport);
		frameCategoriesNotesReport.setVisible(true);
	}

	public void fillCombos() {
		String[] imgPath = new String[] {/*
										 * "DoctorsProgressNotes.png",
										 * "InterDisciplinaryProgressNotes.png",
										 */"CumulativeDiagnosis0.png" };

		cmbFormType.setModel(new javax.swing.DefaultComboBoxModel(formName));

		formIcon = new ImageIcon[imgPath.length];
		for (int i = 0; i < imgPath.length; i++) {
			BufferedImage img = new BufferedImage(100, 100,
					BufferedImage.TYPE_INT_RGB);
			try {
				img = ImageIO.read(new File(
						"img/formThumbnails/Progress Notes/" + imgPath[i]));
				formIcon[i] = new ImageIcon(img);
				imgSlider.insertElement(img, formName[i]);

			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
		}

	}

	public void updateProgressNotesJTable() {
		List progressNotes = new ArrayList();
		File[] f = null;
		if (Global.currentResidenceKey != 0) {
			try {
				progressNotes = MedrexClientManager.getInstance()
						.getProgressNotess(Global.currentResidenceKey);
				java.io.File currentDir = new java.io.File("");

				f = new File(currentDir.getAbsolutePath() + "\\scans\\"
						+ Global.currentResidenceKey + "\\"
						+ medrex.commons.enums.ResidentTabs.PROGRESS_NOTES.Name
						+ "\\").listFiles();

			} catch (Exception e) {

			}
		}

		if (f != null) {
			for (int i = 0; i < f.length; i++) {
				if (f[i].getAbsolutePath().endsWith(".jpg")) {
					progressNotes.add(f[i]);
				} else {
					System.out.println(f[i].getAbsolutePath());
				}
			}
		}
		Collections.sort(progressNotes, new Comparator() {
			// +1 if a > b
			// 0 if a = b
			// -1 if a < b
			public int compare(final Object a, final Object b) {
				Date aDate, bDate;
				aDate = (a instanceof ProgressNotes) ? ((ProgressNotes) a)
						.getDateCreated() : new Date(((File) a).lastModified());
				bDate = (b instanceof ProgressNotes) ? ((ProgressNotes) b)
						.getDateCreated() : new Date(((File) b).lastModified());

				if (aDate.getTime() == bDate.getTime()) {
					return 0;
				} else
					return (aDate.getTime() > bDate.getTime()) ? 1 : -1;
			}
		});

		progressNotesJTable.setNewList(progressNotes);
		progressNotesJTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();

	}

}

class ProgressNotesJTable extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2773629759618708201L;

	private String[] columnNames = { "Date Created", "Form Type",
			"Last Modified", "Status", "User" };

	public List consultants;

	int n = 0;

	ProgressNotesJTable(List activityRecords) {
		consultants = activityRecords;
	}

	ProgressNotesJTable() {
		consultants = new ArrayList();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (consultants.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List activityRecords) {
		consultants = activityRecords;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			Object o = consultants.get(row);
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MM / dd / yyyy  hh:mm a");
			if (o instanceof ProgressNotes) {
				ProgressNotes rc = (ProgressNotes) o;

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
				// if(col == 7) {
				// return (rc.getFormId() + "");
				// }
				return ("");
			}

			else {
				File rc = (File) o;
				if (col == 0) {
					return (df.format(new Date(rc.lastModified()) + ""));
				}
				if (col == 1) {
					String[] fPart = rc.getName().split("-");
					return (fPart[0].replaceAll("_", " "));
				}
				if (col == 2) {
					return (df.format(new Date(rc.lastModified()) + ""));
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
