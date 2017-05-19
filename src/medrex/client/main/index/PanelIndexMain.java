package medrex.client.main.index;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import medrex.client.constants.Global;
import medrex.client.main.activity.FrameActivitysRecordAdd;
import medrex.client.main.admission.FrameAdmissionRecordAdd;
import medrex.client.main.consultant.FrameConsultantAdd;
import medrex.client.main.dietary.FrameDietaryAdd;
import medrex.client.main.historyandphysical.FrameHistoryAndPhysicalAdd;
import medrex.client.main.labspecial.FrameLabSpecialAdd;
import medrex.client.main.medication.FrameMedicationTreatmentFormAdd;
import medrex.client.main.physicanOrders.FramePhysicianOrdersAdd;
import medrex.client.main.progressNotes.FrameProgressNotesAdd;
import medrex.client.main.ptOtSt.FramePtOtStAdd;
import medrex.client.test.ImageSlider;
import medrex.client.test.ThumbnailAdapter;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxPanel;

public class PanelIndexMain extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 288337808959372935L;
	private JTree formTreeList;
	private ImageSlider imgSlider;
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);

	// Form Names
	private String[] formNamesAdmission = new String[] {
			"Resident Assessment Form", "Resident Quarterly Assessment Form",
			"Social Service Initial Assessment Form" };
	private String[] formNamesActivitys = new String[] { "Activity Initial Assessment" };
	private String[] formNamesMedication = new String[] {
			"Pain Management Record", "Nurse Treatment Notes",
			"Nurse Medication Notes", "Medication Adminisration Record",
			"Medication PRN Record", "Medication Routine Record",
			"Treatment PRN Record", "Treatment Routine Record",
			"Pressure Sore Record", "Notes", "Daily Skilled Nurses Notes" };
	private String[] formNamesDietary = new String[] {
			"Dietary Communication Form", "Dietary Resident Diagnosis Form",
			"Enteral Feeding Progress Notes",
			"Consultant Dietician Nutritional Recommendations" };
	private String[] formNamesConsultant = new String[] {
			"Renal Dialysis Communication Form", "Referral Form",
			"Report of Consultation", "Pharmacist Resident Evaluation" };
	private String[] formNamesProgressNotes = new String[] {
			"Doctors Progress Notes", "InterDisciplinary Progress Notes" };
	private String[] formNamesLabSpecial = new String[] {
			"Reason For Study Form", "Medfax Form 1", "Medfax Form 2" };
	private String[] formNamesHistory = new String[] {
			"History And Physical General", "Resident Immunization Form",
			"Cumulative Diagnosis", "Monthly Vital Signs And Weight Sheet",
			"Weekly Weights" };
	private String[] formNamesPhysicianOrders = new String[] {
			"Physician Plaza Health Care Form", "Physician Infusion Form",
			"Physician Speciality Form", "Physician Order Form 1",
			"Physician Order Form 2", "Physician Order Form 3", "Prescription",
			"Progress Notes" };
	private String[] formNamesPtOtSt = new String[] { "Physical Daily Record",
			"Occupational Daily Record", "Speech Daily Record",
			"Physical Therapy", "Occupational Therapy", "Speech Therapy",
			"Positioning Evaluation", "Rehab Care Plan",
			"Therapy ProgressNote/Re-certification/Discharge", "Treatment" };

	// Image Names
	private String[] imgNamesAdmission = new String[] {
			"ResidentAssessmentForm.png",
			"ResidentQuarterlyAssessmentForm.png",
			"SocialServiceInitialAssessment.png" };
	private String[] imgNamesActivitys = new String[] { "ActivityInitialAssessment.png" };
	private String[] imgNamesMedication = new String[] { "PainMgtRecord.png",
			"NurseTreatmentNotes.png", "NurseMedicationNotes.png",
			"MedicationAdmn.png", "MedicationPRN.png", "MedicationRoutine.png",
			"TreatmentPRN.png", "TreatmentRoutine.png",
			"PressureSoreRecord.png", "Notes.png", "DailySkilledNurses.png" };
	private String[] imgNamesDietary = new String[] {
			"DietaryCommunicationForm.png", "DietaryResidentDiagnosisForm.png",
			"EnteralFeedingProgressNotes.png",
			"ConsultantDieticianNutritionalRecommendations.png" };
	private String[] imgNamesConsultant = new String[] {
			"RenalDialysisCommunicationForm.png", "ReferralForm.png",
			"ReportofConsultation.png", "PharmacistResidentEvaluation.png" };
	private String[] imgNamesProgressNotes = new String[] {
			"DoctorsProgressNotes.png", "InterDisciplinaryProgressNotes.png" };
	private String[] imgNamesLabSpecial = new String[] {
			"ReasonForStudyForm.png", "MedfaxForm1.png", "MedfaxForm2.png" };
	private String[] imgNamesHistory = new String[] {
			"HistoryAndPhysicalGeneral.png", "ResidentImmunizationForm.png",
			"CumulativeDiagnosis.png", "MonthlyVitalSignsAndWeightSheet.png",
			"WeeklyWeights.png" };
	private String[] imgNamesPhysicianOrders = new String[] {
			"PhysicianPlazaHealthCareForm.png", "PhysicianInfusionForm.png",
			"PhysicianSpecialityForm.png", "PhysicianOrderForm1.png",
			"PhysicianOrderForm2.png", "PhysicianOrderForm3.png",
			"Prescription.png", "ProgressNotes.png" };
	private String[] imgNamesPtOtSt = new String[] { "PhysicalDailyRecord.png",
			"OccupationalDailyRecord.png", "SpeechDailyRecord.png",
			"PhysicalTherapy.png", "OccupationalTherapy.png",
			"SpeechTherapy.png", "PositioningEvaluation.png",
			"RehabCarePlan.png",
			"TherapyProgressNote_Re-certification_Discharge.png",
			"Treatment.png" };

	private Object[][] forms = new Object[][] {
			{ "Admission Details", formNamesAdmission,
					"img/formThumbnails/Admission Details/", imgNamesAdmission },
			{ "Activities", formNamesActivitys,
					"img/formThumbnails/Activities/", imgNamesActivitys },
			{ "Medication & Treatment", formNamesMedication,
					"img/formThumbnails/Medication/", imgNamesMedication },
			{ "Dietary", formNamesDietary, "img/formThumbnails/Dietary/",
					imgNamesDietary },
			{ "Consultant", formNamesConsultant,
					"img/formThumbnails/Consultant/", imgNamesConsultant },
			{ "Progress Notes", formNamesProgressNotes,
					"img/formThumbnails/Progress Notes/", imgNamesProgressNotes },
			{ "Lab & Special Reports", formNamesLabSpecial,
					"img/formThumbnails/Lab Special/", imgNamesLabSpecial },
			{ "History & Physical", formNamesHistory,
					"img/formThumbnails/History Physical/", imgNamesHistory },
			{ "Physician Orders", formNamesPhysicianOrders,
					"img/formThumbnails/Physician Orders/",
					imgNamesPhysicianOrders },
			{ "Pt-Ot-Act Speech", formNamesPtOtSt,
					"img/formThumbnails/PtOtAct Speech/", imgNamesPtOtSt } };
	private String currentRootName;
	private int currentRootIndex;
	private String[] currentFormNames;

	private final static String ROOT = "Forms";
	private final static int NODE_COUNT = 10;

	/**
	 * Create the panel
	 */
	public PanelIndexMain() {
		super();
		// Global.panelActivitysRecord = this;
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

		final JLabel residentInformationLabel = new JLabel();
		residentInformationLabel.setForeground(DEF_COL);
		residentInformationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		residentInformationLabel.setBounds(10, 10, 700, 30);
		residentInformationLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		residentInformationLabel.setText("INDEX");
		panel.add(residentInformationLabel);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 46, 180, 368);
		panel.add(scrollPane);

		formTreeList = new JTree();
		formTreeList.addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(final TreeSelectionEvent event) {
				DefaultMutableTreeNode node = (DefaultMutableTreeNode) formTreeList
						.getLastSelectedPathComponent();
				if (node == null) {
					return;
				}
				DefaultMutableTreeNode parent = (DefaultMutableTreeNode) node
						.getParent();
				if (parent == null) {
					return;
				}
				loadThumbnails(node);
			}
		});
		scrollPane.setViewportView(formTreeList);

		imgSlider = new ImageSlider();
		imgSlider.setOrientation(SwingConstants.VERTICAL);
		imgSlider.setBounds(196, 46, 514, 368);
		imgSlider.setBackground(GuiModes.DESIGNER_FORMS
				.getDefaultBackgroundColor()); //
		imgSlider.setBorder(new LineBorder(BORDER_COL, 1, false));
		imgSlider.setNormalSize(350);
		imgSlider.addThumbnailListener(new ThumbnailAdapter() {
			@Override
			public void thumbnailClicked(final int index, MouseEvent e) {
				setCurrentFormKey(0);
				setCurrentForm(index);
				final JDialog frame = loadCurrentFrame(index);
				SwingUtils.center(frame);
				frame.setModal(true);
				frame.setVisible(true);
			}

			@Override
			public void thumbnailDoubleClicked(int index, MouseEvent e) {
			}
		});
		panel.add(imgSlider);

		doUpdate();
	}

	protected void loadThumbnails(DefaultMutableTreeNode node) {
		Object value = node.getUserObject();
		if (node.isLeaf()) {
			DefaultMutableTreeNode parent = (DefaultMutableTreeNode) node
					.getParent();
			Object parentValue = parent.getUserObject();
			String rootName = null, imgPath = null, imgName = null, formName = null;
			int rootIndex = 0;

			if (parentValue == null) {
				return;
			}
			for (int i = 0; i < NODE_COUNT; i++) {
				if (parentValue.equals(forms[i][0])) {
					imgPath = (String) forms[i][2];
					String[] formNames = (String[]) forms[i][1];
					String[] imageNames = (String[]) forms[i][3];
					for (int j = 0; j < formNames.length; j++) {
						if (value.equals(formNames[j])) {
							formName = formNames[j];
							imgName = imageNames[j];
							break;
						}
					}
					rootIndex = i;
					rootName = (String) forms[i][0];
					break;
				}
			}
			if (imgPath != null && imgName != null && imgName.length() > 0) {
				updateSlider(rootName, rootIndex, imgPath,
						new String[] { imgName }, new String[] { formName });
			}
		} else {
			String rootName = null, imgPath = null, imgNames[] = null, formNames[] = null;
			int rootIndex = 0;

			if (value == null) {
				return;
			}
			for (int i = 0; i < NODE_COUNT; i++) {
				if (value.equals(forms[i][0])) {
					imgPath = (String) forms[i][2];
					formNames = (String[]) forms[i][1];
					imgNames = (String[]) forms[i][3];
					rootName = (String) forms[i][0];
					rootIndex = i;
					break;
				}
			}
			if (imgPath != null && imgNames != null && imgNames.length > 0) {
				updateSlider(rootName, rootIndex, imgPath, imgNames, formNames);
				// System.out.println("formNames: "+formNames);
			}
		}
	}

	private void updateSlider(String rootName, int rootIndex, String imgPath,
			String[] imgNames, String[] formNames) {
		imgSlider.removeAllElements();
		currentRootName = rootName;
		currentRootIndex = rootIndex;
		currentFormNames = formNames;

		for (int i = 0; i < imgNames.length; i++) {
			BufferedImage img = new BufferedImage(125, 125,
					BufferedImage.TYPE_INT_RGB);
			try {
				img = ImageIO.read(new File(imgPath + imgNames[i]));
				System.out.println("formNames[i]: " + formNames[i]);
				imgSlider.insertElement(img, formNames[i]);
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
		}
	}

	protected JDialog loadCurrentFrame(int index) {
		JDialog dialog = null;
		switch (currentRootIndex) {
		case 0:
			dialog = (FrameAdmissionRecordAdd) FrameFactory
					.createWindowOfType(FrameAdmissionRecordAdd.class);
			break;
		case 1:
			dialog = new FrameActivitysRecordAdd();
			break;
		case 2:
			dialog = (FrameMedicationTreatmentFormAdd) FrameFactory
					.createWindowOfType(FrameMedicationTreatmentFormAdd.class);
			break;
		case 3:
			dialog = (FrameDietaryAdd) FrameFactory
					.createWindowOfType(FrameDietaryAdd.class);
			break;
		case 4:
			dialog = (FrameConsultantAdd) FrameFactory
					.createWindowOfType(FrameConsultantAdd.class);
			break;
		case 5:
			dialog = (FrameProgressNotesAdd) FrameFactory
					.createWindowOfType(FrameProgressNotesAdd.class);
			break;
		case 6:
			dialog = (FrameLabSpecialAdd) FrameFactory
					.createWindowOfType(FrameLabSpecialAdd.class);
			break;
		case 7:
			dialog = (FrameHistoryAndPhysicalAdd) FrameFactory
					.createWindowOfType(FrameHistoryAndPhysicalAdd.class);
			break;
		case 8:
			dialog = (FramePhysicianOrdersAdd) FrameFactory
					.createWindowOfType(FramePhysicianOrdersAdd.class);
			break;
		case 9:
			dialog = (FramePtOtStAdd) FrameFactory
					.createWindowOfType(FramePtOtStAdd.class);
			break;
		}
		if (dialog != null) {
			dialog.setTitle(currentFormNames[index]);
		}
		return dialog;
	}

	protected void setCurrentForm(int index) {
		switch (currentRootIndex) {
		case 0:
			Global.currentAdmissionRecordForm = currentFormNames[index];
			break;
		case 1:
			Global.currentActivityForm = currentFormNames[index];
			break;
		case 2:
			Global.currentMedicationTreatmentForm = currentFormNames[index];
			break;
		case 3:
			Global.currentDietaryForm = currentFormNames[index];
			break;
		case 4:
			Global.currentConsultantForm = currentFormNames[index];
			break;
		case 5:
			Global.currentProgressNotesForm = currentFormNames[index];
			break;
		case 6:
			Global.currentLabSpecialForm = currentFormNames[index];
			break;
		case 7:
			Global.currentHistoryForm = currentFormNames[index];
			break;
		case 8:
			Global.currentPhysicianOrderForm = currentFormNames[index];
			break;
		case 9:
			Global.currentPtOtStForm = currentFormNames[index];
			break;
		}
	}

	protected void setCurrentFormKey(int key) {
		switch (currentRootIndex) {
		case 0:
			Global.currentAdmissionsRecordKey = key;
			break;
		case 1:
			Global.currentActivitysRecordKey = key;
			break;
		case 2:
			Global.currentMedicationTreatmentFormKey = key;
			break;
		case 3:
			Global.currentDietaryKey = key;
			break;
		case 4:
			Global.currentConsultantKey = key;
			break;
		case 5:
			Global.currentProgressNotesKey = key;
			break;
		case 6:
			Global.currentLabSpecialKey = key;
			break;
		case 7:
			Global.currentHistoryAndPhysicalKey = key;
			break;
		case 8:
			Global.currentPhysisianOrdersKey = key;
			break;
		case 9:
			Global.currentPtOtStKey = key;
			break;
		}
	}

	protected void doUpdate() {
		fillCombos();
	}

	public void fillCombos() {
		DefaultMutableTreeNode root = processNodes(forms);
		formTreeList.setModel(new DefaultTreeModel(root));
	}

	private DefaultMutableTreeNode processNodes(Object[][] nodes) {
		DefaultMutableTreeNode root;
		root = new DefaultMutableTreeNode(ROOT);

		for (int i = 0; i < nodes.length; i++) {
			Object childObj = nodes[i][0];
			Object[] childrenObj = (Object[]) nodes[i][1];
			DefaultMutableTreeNode child = new DefaultMutableTreeNode(childObj);
			for (int j = 0; j < childrenObj.length; j++) {
				child.add(new DefaultMutableTreeNode(childrenObj[j]));
			}
			root.add(child);
		}
		return root;
	}

	public static void main(String[] args) {
		SwingUtils.wrapInFrame(new PanelIndexMain()).setVisible(true);
	}
}