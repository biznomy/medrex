package medrex.client.main.ptOtSt;

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
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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
import medrex.commons.vo.others.Users;
import medrex.commons.vo.ptOtSt.PtOtSt;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;

public class PanelPtOtSt extends JPanel {

	private JButton btnSpeechDailyRecord;
	private JButton btnPhysicalTherapyDailyRecord;
	private JxButton btnOccupationalDailyRecord;
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);

	private JxComboBox cmbFormType;
	private static final long serialVersionUID = 1L;
	private JxTable table;
	private PtOtStJTable ptOtStTable;
	public FramePtOtStAdd framePtOtStAdd;
	public FrameScanFormAdd frameScanFormAdd;

	private ImageSlider imgSlider;
	private String[] formName = new String[] { /* "Physical Daily Record", */
	/* "Occupational Daily Record", "Speech Daily Record", */
	"Physical Therapy", "Occupational Therapy", "Speech Therapy",
			"Positioning Evaluation", "Rehab Care Plan",
			"Therapy ProgressNote/Re-certification/Discharge", "Treatment" };
	private ImageIcon[] formIcon;

	/**
	 * Create the panel
	 */
	public PanelPtOtSt() {
		super();
		// Global.panelPtOtSt=this;
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
		ptOtStTable = new PtOtStJTable();
		table.setModel(ptOtStTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					int id = new Integer((String) ptOtStTable.getValueAt(table
							.getSelectedRow(), 5)).intValue();

					if (id != -1) {
						Global.currentPtOtStKey = id;

						framePtOtStAdd = (FramePtOtStAdd) FrameFactory
								.createWindowOfType(FramePtOtStAdd.class);
						SwingUtils.center(framePtOtStAdd);
						framePtOtStAdd.setTitle("View/Update Pt Ot St Record");
						framePtOtStAdd.setModal(true);
						framePtOtStAdd.setVisible(true);
					}

					else {
						File scannedFile = (File) ptOtStTable.getValueAt(table
								.getSelectedRow(), 6);

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
					updatePtOtStJTable();
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
						.isUpdatePriviledge(SubAppTypes.OTPTACT_SPEECH)) {
					Global.currentPtOtStKey = 0;
					Global.currentPtOtStForm = (String) cmbFormType
							.getSelectedItem();

					framePtOtStAdd = (FramePtOtStAdd) FrameFactory
							.createWindowOfType(FramePtOtStAdd.class);
					SwingUtils.center(framePtOtStAdd);
					framePtOtStAdd.setTitle("Add New Ot-Pt-Act Speech");
					framePtOtStAdd.setModal(true);
					framePtOtStAdd.setVisible(true);
					updatePtOtStJTable();
				}
			}
		});
		btnAdd.setText("Add New");
		panel.add(btnAdd);

		final JxButton btnView = new JxButton(0.4f);
		btnView.setBackground(Color.WHITE);
		btnView.setForeground(DEF_COL);
		btnView.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnView.setBounds(436, 248, 111, 26);
		btnView.setFont(new Font("", Font.BOLD, 12));
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					int id = new Integer((String) ptOtStTable.getValueAt(table
							.getSelectedRow(), 5)).intValue();

					if (id != -1) {
						Global.currentPtOtStKey = id;

						framePtOtStAdd = (FramePtOtStAdd) FrameFactory
								.createWindowOfType(FramePtOtStAdd.class);
						SwingUtils.center(framePtOtStAdd);
						framePtOtStAdd.setTitle("View/Update Lab Record");
						framePtOtStAdd.setModal(true);
						framePtOtStAdd.setVisible(true);
					}

					else {

						File scannedFile = (File) ptOtStTable.getValueAt(table
								.getSelectedRow(), 6);
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
					updatePtOtStJTable();
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
		btnDelete.setBounds(553, 248, 70, 26);
		btnDelete.setFont(new Font("", Font.BOLD, 12));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					int id = new Integer((String) ptOtStTable.getValueAt(table
							.getSelectedRow(), 5)).intValue();
					int formId = new Integer((String) ptOtStTable.getValueAt(
							table.getSelectedRow(), 6)).intValue();
					String formType = (String) ptOtStTable.getValueAt(table
							.getSelectedRow(), 1);
					if (id != -1) {
						if (formId != 0
								&& formType
										.equals(FormSchedulerConstants.OCCUPATIONAL_DAILY_RECORD)) {
							MedrexClientManager
									.getInstance()
									.deletePtOtStOccupationalDailyRecord(formId);
						}
						if (formId != 0
								&& formType
										.equals(FormSchedulerConstants.SPEECH_DAILY_RECORD)) {
							MedrexClientManager.getInstance()
									.deletePtOtStSpeechDailyRecord(formId);
						}
						if (formId != 0
								&& formType
										.equals(FormSchedulerConstants.PHYSICAL_DAILY_RECORD)) {
							MedrexClientManager.getInstance()
									.deletePtOtStPhysicalDailyRecord(formId);
						}
						if (formId != 0
								&& formType
										.equals(FormSchedulerConstants.PHYSICAL_THERAPY)) {
							MedrexClientManager.getInstance()
									.deletePtOtStPhysicalTheray(formId);
						}
						if (formId != 0
								&& formType
										.equals(FormSchedulerConstants.OCCUPATIONAL_THERAPY)) {
							MedrexClientManager.getInstance()
									.deletePtOtStOccupationalTherapy(formId);
						}
						if (formId != 0
								&& formType
										.equals(FormSchedulerConstants.SPEECH_THERAPY)) {
							MedrexClientManager.getInstance()
									.deletePtOtStSpeechLanguage(formId);
						}
						if (formId != 0
								&& formType
										.equals(FormSchedulerConstants.POSITIONING_EVALUATION)) {
							MedrexClientManager.getInstance()
									.deletePtOtStPositioningEvaluation(formId);
						}
						if (formId != 0
								&& formType
										.equals(FormSchedulerConstants.REHAB_CARE_PLAN)) {
							MedrexClientManager.getInstance()
									.deletePtOtStRehabCarePlan(formId);
						}
						if (formId != 0
								&& formType
										.equals(FormSchedulerConstants.THERAPY_PROGRESSNOTE_RECERTIFICATION_DISCHARGE)) {
							MedrexClientManager.getInstance()
									.deletePtOtStTherapyPhysical(formId);
						}
						if (formId != 0
								&& formType
										.equals(FormSchedulerConstants.TREATMENT)) {
							MedrexClientManager.getInstance()
									.deletePtOtStTreatment(formId);
						}
						MedrexClientManager.getInstance().deletePtOtSt(id);
						Global.currentPtOtStKey = 0;
						Global.currentPtOtStPhysicalDailyRecordKey = 0;
						Global.currentPtOtStOccupationalDailyRecordKey = 0;
						Global.currentPtOtStSpeechDailyRecordKey = 0;
						Global.currentPtOtStPhysicalTherayKey = 0;
						Global.currentPtOtStOccupationalTherapyKey = 0;
						Global.currentPtOtStSpeechLanguageKey = 0;
						Global.currentPtOtStPositioningEvaluationKey = 0;
						Global.currentPtOtStRehabCarePlanKey = 0;
						Global.currentPtOtStTherapyPhysicalKey = 0;
						Global.currentPtOtStTreatmentKey = 0;
					} else {

						File scannedFile = (File) ptOtStTable.getValueAt(table
								.getSelectedRow(), 6);

						scannedFile.delete();

					}
					updatePtOtStJTable();

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
		btnCancel.setBounds(629, 248, 70, 26);
		panel.add(btnCancel);

		final JLabel residentInformationLabel = new JLabel();
		residentInformationLabel.setForeground(DEF_COL);
		residentInformationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		residentInformationLabel.setBounds(10, 10, 700, 30);
		residentInformationLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		residentInformationLabel.setText("OT-PT-ACT SPEECH");
		panel.add(residentInformationLabel);

		cmbFormType = new JxComboBox();
		cmbFormType.setBackground(Color.WHITE);
		cmbFormType.setArc(0.4f);
		cmbFormType.setForeground(DEF_COL);
		cmbFormType.setBorder(new LineBorder(BORDER_COL, 1, false));
		cmbFormType.setBounds(110, 248, 244, 29);
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

				updatePtOtStJTable();
			}
		});
		scanNewButton.setText("Scan New");
		panel.add(scanNewButton);

		final JxButton mdsButton = new JxButton(0.4f);
		mdsButton.setBackground(Color.WHITE);
		mdsButton.setForeground(DEF_COL);
		mdsButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		mdsButton.setBounds(360, 248, 70, 26);
		mdsButton.setFont(new Font("", Font.BOLD, 12));
		mdsButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
//				(FrameFactory.createWindowOfType(FrameMDSOTPTACTAdd.class))
//						.setVisible(true);
			}
		});
		mdsButton.setText("MDS");
		panel.add(mdsButton);

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
							Global.currentPtOtStKey = 0;
							Global.currentPtOtStForm = formName[index];
							// Global.currentResidentAssessmentFormKey = 0;

							framePtOtStAdd = (FramePtOtStAdd) FrameFactory
									.createWindowOfType(FramePtOtStAdd.class);
							SwingUtils.center(framePtOtStAdd);
							framePtOtStAdd.setTitle("Add New Ot-Pt-Act Speech");
							framePtOtStAdd.setModal(true);
							framePtOtStAdd.setVisible(true);
							updatePtOtStJTable();
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

		btnOccupationalDailyRecord = new JxButton(0.4f);
		btnOccupationalDailyRecord.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (GlobalSecurity
						.isUpdatePriviledge(SubAppTypes.OTPTACT_SPEECH)) {
					Global.currentPtOtStKey = 0;
					Global.currentPtOtStForm = "Occupational Daily Record";
					framePtOtStAdd = (FramePtOtStAdd) FrameFactory
							.createWindowOfType(FramePtOtStAdd.class);
					SwingUtils.center(framePtOtStAdd);
					framePtOtStAdd.setTitle("Add New Ot-Pt-Act Speech");
					framePtOtStAdd.setModal(true);
					framePtOtStAdd.setVisible(true);
					updatePtOtStJTable();
				}
			}
		});
		btnOccupationalDailyRecord.setBackground(Color.WHITE);
		btnOccupationalDailyRecord.setForeground(DEF_COL);
		btnOccupationalDailyRecord.setBorder(new LineBorder(BORDER_COL, 1,
				false));
		btnOccupationalDailyRecord.setBounds(513, 280, 187, 26);
		btnOccupationalDailyRecord.setFont(new Font("", Font.BOLD, 12));
		btnOccupationalDailyRecord.setText("Occupational Daily Record");
		// btnOccupationalDailyRecord.setBounds(360, 280, 189, 26);
		panel.add(btnOccupationalDailyRecord);

		btnSpeechDailyRecord = new JxButton(0.4f);
		btnSpeechDailyRecord.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (GlobalSecurity
						.isUpdatePriviledge(SubAppTypes.OTPTACT_SPEECH)) {
					Global.currentPtOtStKey = 0;
					Global.currentPtOtStForm = "Speech Daily Record";
					framePtOtStAdd = (FramePtOtStAdd) FrameFactory
							.createWindowOfType(FramePtOtStAdd.class);
					SwingUtils.center(framePtOtStAdd);
					framePtOtStAdd.setTitle("Add New Ot-Pt-Act Speech");
					framePtOtStAdd.setModal(true);
					framePtOtStAdd.setVisible(true);
					updatePtOtStJTable();
				}
			}
		});
		btnSpeechDailyRecord.setText("Speech Daily Record");
		btnSpeechDailyRecord.setBounds(110, 280, 171, 26);
		btnSpeechDailyRecord.setBackground(Color.WHITE);
		btnSpeechDailyRecord.setForeground(DEF_COL);
		btnSpeechDailyRecord.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnSpeechDailyRecord.setFont(new Font("", Font.BOLD, 12));
		panel.add(btnSpeechDailyRecord);

		btnPhysicalTherapyDailyRecord = new JxButton(0.4f);
		btnPhysicalTherapyDailyRecord.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (GlobalSecurity
						.isUpdatePriviledge(SubAppTypes.OTPTACT_SPEECH)) {
					Global.currentPtOtStKey = 0;
					Global.currentPtOtStForm = "Physical Daily Record";
					framePtOtStAdd = (FramePtOtStAdd) FrameFactory
							.createWindowOfType(FramePtOtStAdd.class);
					SwingUtils.center(framePtOtStAdd);
					framePtOtStAdd.setTitle("Add New Ot-Pt-Act Speech");
					framePtOtStAdd.setModal(true);
					framePtOtStAdd.setVisible(true);
					updatePtOtStJTable();
				}
			}
		});
		btnPhysicalTherapyDailyRecord.setText("Physical Daily Record");
		btnPhysicalTherapyDailyRecord.setBackground(Color.WHITE);
		btnPhysicalTherapyDailyRecord.setForeground(DEF_COL);
		btnPhysicalTherapyDailyRecord.setBorder(new LineBorder(BORDER_COL, 1,
				false));
		btnPhysicalTherapyDailyRecord.setFont(new Font("", Font.BOLD, 12));
		btnPhysicalTherapyDailyRecord.setBounds(312, 280, 171, 26);
		panel.add(btnPhysicalTherapyDailyRecord);

		fillCombos();

	}

	public void doUpdate() {
		updatePtOtStJTable();
	}

	public void openNewForm(String formName) {
		Global.currentPtOtStKey = 0;
		Global.currentPtOtStForm = formName;

		framePtOtStAdd = (FramePtOtStAdd) FrameFactory
				.createWindowOfType(FramePtOtStAdd.class);
		SwingUtils.center(framePtOtStAdd);
		framePtOtStAdd.setTitle("Add New Ot-Pt-Act Speech");
		framePtOtStAdd.setModal(true);
		framePtOtStAdd.setVisible(true);
		updatePtOtStJTable();
	}

	public void fillCombos() {
		String[] imgPath = new String[] { /*
										 * "PhysicalDailyRecord.png",
										 * "OccupationalDailyRecord.png",
										 * "SpeechDailyRecord.png",
										 */
		"PhysicalTherapy.png", "OccupationalTherapy.png", "SpeechTherapy.png",
				"PositioningEvaluation.png", "RehabCarePlan.png",
				"TherapyProgressNote_Re-certification_Discharge.png",
				"Treatment.png" };

		cmbFormType.setModel(new javax.swing.DefaultComboBoxModel(formName));

		formIcon = new ImageIcon[imgPath.length];
		for (int i = 0; i < imgPath.length; i++) {
			BufferedImage img = new BufferedImage(100, 100,
					BufferedImage.TYPE_INT_RGB);
			try {
				img = ImageIO.read(new File(
						"img/formThumbnails/PtOtAct Speech/" + imgPath[i]));
				formIcon[i] = new ImageIcon(img);
				imgSlider.insertElement(img, formName[i]);

			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
		}

	}

	public void updatePtOtStJTable() {
		List ptOtStRecords = new ArrayList();
		File[] f = null;

		if (Global.currentResidenceKey != 0) {
			try {
				ptOtStRecords = MedrexClientManager.getInstance().getPtOtSts(
						Global.currentResidenceKey);
				java.io.File currentDir = new java.io.File("");

				f = new File(
						currentDir.getAbsolutePath()
								+ "\\scans\\"
								+ Global.currentResidenceKey
								+ "\\"
								+ medrex.commons.enums.ResidentTabs.OT_PT_ACT_SPEECH.Name
								+ "\\").listFiles();

			} catch (Exception e) {

			}
		}

		if (f != null) {
			for (int i = 0; i < f.length; i++) {
				ptOtStRecords.add(f[i]);
			}
		}
		Collections.sort(ptOtStRecords, new Comparator() {
			// +1 if a > b
			// 0 if a = b
			// -1 if a < b
			public int compare(final Object a, final Object b) {
				Date aDate, bDate;
				aDate = (a instanceof PtOtSt) ? ((PtOtSt) a).getDateCreated()
						: new Date(((File) a).lastModified());
				bDate = (b instanceof PtOtSt) ? ((PtOtSt) b).getDateCreated()
						: new Date(((File) b).lastModified());

				if (aDate.getTime() == bDate.getTime()) {
					return 0;
				} else
					return (aDate.getTime() > bDate.getTime()) ? 1 : -1;
			}
		});

		ptOtStTable.setNewList(ptOtStRecords);
		ptOtStTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}

}

class PtOtStJTable extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "Date Created", "Form Type",
			"Last Modified", "Status", "User" };

	public List ptOtStsRecords;

	int n = 0;

	PtOtStJTable(List ptOtStRecords) {
		ptOtStsRecords = ptOtStRecords;
	}

	PtOtStJTable() {
		ptOtStsRecords = new ArrayList();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (ptOtStsRecords.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List ptOtStRecords) {
		ptOtStsRecords = ptOtStRecords;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			Object o = ptOtStsRecords.get(row);
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MM / dd / yyyy");
			if (o instanceof PtOtSt) {
				PtOtSt rc = (PtOtSt) o;

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
