package medrex.client.admin.formScheduler;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.border.LineBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldFormatter;
import medrex.client.utils.MsgBox;
import medrex.client.utils.PresentationModel;
import medrex.commons.enums.GuiModes;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.admin.FormSchedule;

import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;

/**
 * @author D S Naruka
 */
public class PanelFormScheduleDialog extends PopUpView {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1016826074567380904L;
	private JTextField txtForm;
	private static final Color DEF_COLOR = new Color(49, 104, 127);
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);

	private JFormattedTextField txtAlertAfter;
	private JFormattedTextField txtTimeFrame;
	private JxComboBox cmbType;
	private JxComboBox cmbForm;
	private JxComboBox cmbTimeFrame;
	private JxComboBox cmbAlertAfter;
	private JTree formTreeList;

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

	private Object[][] forms = new Object[][] {
			{ "Admission Details", formNamesAdmission },
			{ "Activities", formNamesActivitys },
			{ "Medication & Treatment", formNamesMedication },
			{ "Dietary", formNamesDietary },
			{ "Consultant", formNamesConsultant },
			{ "Progress Notes", formNamesProgressNotes },
			{ "Lab & Special Reports", formNamesLabSpecial },
			{ "History & Physical", formNamesHistory },
			{ "Physician Orders", formNamesPhysicianOrders },
			{ "Pt-Ot-Act Speech", formNamesPtOtSt } };
	private String currentRootName;
	private int currentRootIndex;
	private String[] currentFormNames;

	private final static String ROOT = "Forms";
	private final static int NODE_COUNT = 10;

	private ControllerFormScheduler controllerFormScheduler;
	private Map myMap;
	private PresentationModel presentationModel;
	private JLabel errorLabel;

	@Override
	public String getTitle() {
		return "Form Schedule";
	}

	public PanelFormScheduleDialog() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(600, 300));
		setSize(600, 300);
		setForeground(GuiModes.DESIGNER_FORMS.getDefaultForegroundColor());
		setBackground(GuiModes.DESIGNER_FORMS.getDefaultBackgroundColor());
		setFont(GuiModes.DESIGNER_FORMS.getDefaultFont());

		controllerFormScheduler = new ControllerFormScheduler();
		myMap = new HashMap();

		final JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setLayout(null);
		panel.setBounds(196, 10, 390, 30);
		add(panel);

		final JLabel formLabel = new JLabel();
		formLabel.setText("Form");
		formLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		formLabel.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		formLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		formLabel.setBounds(10, 0, 75, 28);
		panel.add(formLabel);

		txtForm = new JTextField();
		myMap.put("form", txtForm);
		txtForm.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		txtForm.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		txtForm.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		txtForm.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		txtForm.setEditable(false);
		txtForm.setBounds(104, 4, 280, 25);
		panel.add(txtForm);

		final JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setLayout(null);
		panel_1.setBounds(196, 44, 300, 28);
		add(panel_1);

		final JLabel formLabel_1 = new JLabel();
		formLabel_1.setText("Type");
		formLabel_1.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		formLabel_1.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		formLabel_1.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		formLabel_1.setBounds(10, 0, 75, 28);
		panel_1.add(formLabel_1);

		cmbType = new JxComboBox();
		myMap.put("type", cmbType);
		cmbType.setBackground(Color.WHITE);
		cmbType.setForeground(DEF_COLOR);
		cmbType.setArc(0.4f);
		cmbType.setBorder(new LineBorder(DEF_COLOR, 1, false));
		cmbType.setBounds(104, 2, 174, 25);
		panel_1.add(cmbType);

		final JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setLayout(null);
		panel_2.setBounds(196, 78, 300, 28);
		add(panel_2);

		final JLabel formLabel_2 = new JLabel();
		formLabel_2.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		formLabel_2.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		formLabel_2.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		formLabel_2.setText("Time Frame");
		formLabel_2.setBounds(10, 0, 75, 28);
		panel_2.add(formLabel_2);

		txtTimeFrame = new JFormattedTextField(FieldFormatter.MAX3);
		// myMap.put("timeFrom", txtTimeFrame);
		txtTimeFrame.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		txtTimeFrame.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		txtTimeFrame.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		txtTimeFrame.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		txtTimeFrame.setBounds(104, 2, 80, 25);
		panel_2.add(txtTimeFrame);

		cmbTimeFrame = new JxComboBox();
		myMap.put("timeFromType", cmbTimeFrame);
		cmbTimeFrame.setBackground(Color.WHITE);
		cmbTimeFrame.setForeground(DEF_COLOR);
		cmbTimeFrame.setArc(0.4f);
		cmbTimeFrame.setBorder(new LineBorder(DEF_COLOR, 1, false));
		cmbTimeFrame.setBounds(200, 0, 75, 25);
		panel_2.add(cmbTimeFrame);

		final JPanel panel_2_1 = new JPanel();
		panel_2_1.setOpaque(false);
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(196, 112, 300, 28);
		add(panel_2_1);

		final JLabel formLabel_2_1 = new JLabel();
		formLabel_2_1.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		formLabel_2_1.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		formLabel_2_1.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		formLabel_2_1.setText("Alert After");
		formLabel_2_1.setBounds(10, 0, 75, 28);
		panel_2_1.add(formLabel_2_1);

		txtAlertAfter = new JFormattedTextField(FieldFormatter.MAX3);
		// myMap.put("alertAfter", txtAlertAfter);
		txtAlertAfter.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		txtAlertAfter.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		txtAlertAfter.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		txtAlertAfter.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		txtAlertAfter.setBounds(104, 2, 80, 25);
		panel_2_1.add(txtAlertAfter);

		cmbAlertAfter = new JxComboBox();
		myMap.put("alertAfterType", cmbAlertAfter);
		cmbAlertAfter.setBackground(Color.WHITE);
		cmbAlertAfter.setForeground(DEF_COLOR);
		cmbAlertAfter.setArc(0.4f);
		cmbAlertAfter.setBorder(new LineBorder(DEF_COLOR, 1, false));
		cmbAlertAfter.setBounds(200, 0, 75, 25);
		panel_2_1.add(cmbAlertAfter);

		final JxButton btnCancel = new JxButton();
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		btnCancel.setText("Cancel");
		btnCancel.setArc(0.4f);
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setForeground(DEF_COL);
		btnCancel.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.setBounds(491, 265, 95, 25);
		add(btnCancel);

		final JxButton btnOk = new JxButton();
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (doValidate()) {
					if (doSave()) {
						close();
					}
				}
			}
		});
		btnOk.setText("Ok");
		btnOk.setArc(0.4f);
		btnOk.setBackground(Color.WHITE);
		btnOk.setForeground(DEF_COL);
		btnOk.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnOk.setFont(new Font("", Font.BOLD, 12));
		btnOk.setBounds(382, 265, 95, 25);
		add(btnOk);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 180, 290);
		add(scrollPane);

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
				loadTree(node);
			}
		});
		scrollPane.setViewportView(formTreeList);

		errorLabel = new JLabel();
		errorLabel.setForeground(new Color(255, 0, 0));
		errorLabel.setFont(new Font("", Font.BOLD, 12));
		errorLabel.setText("");
		errorLabel.setBounds(314, 224, 208, 16);
		add(errorLabel);

		presentationModel = new PresentationModel(myMap, FormSchedule.class,
				controllerFormScheduler, errorLabel);
		presentationModel.validateAll();

		fillCombos();
		doUpdate();

		/*
		 * cmbForm = new JxComboBox(); cmbForm.setBounds(616, 10, 174, 25);
		 * add(cmbForm); cmbForm.setBackground(Color.WHITE);
		 * cmbForm.setForeground(DEF_COLOR); cmbForm.setArc(0.4f);
		 * cmbForm.setBorder(new LineBorder(DEF_COLOR, 1, false));
		 */
	}

	private void fillCombos() {
		/*
		 * cmbForm.setModel(new DefaultComboBoxModel(new String[] { "",
		 * FormSchedulerConstants.RESIDENT_ADMISSION_ASSESSMENT ,
		 * FormSchedulerConstants.ACTIVITY_INITIAL_ASSESSMENT,
		 * FormSchedulerConstants.PAIN_MANAGEMENT_RECORD,
		 * FormSchedulerConstants.NURSE_TREATMENT_NOTES,
		 * FormSchedulerConstants.NURSE_MEDICATION_NOTES,
		 * FormSchedulerConstants.MEDICATION_ADMINISTRATION_NOTES,
		 * FormSchedulerConstants.MEDICATION_PRN_RECORD,
		 * FormSchedulerConstants.MEDICATION_ROUTINE_RECORD,
		 * FormSchedulerConstants.TREATMENT_PRN_RECORD,
		 * FormSchedulerConstants.TREATMENT_ROUTINE_RECORD,
		 * FormSchedulerConstants.PRESSURE_SORE_RECORD,
		 * FormSchedulerConstants.DIETARY_COMMUNICATION_FORM,
		 * FormSchedulerConstants.DIETARY_RESIDENT_DIAGNOSIS_FORM,
		 * FormSchedulerConstants.ENTERAL_FEEDING_PROGRESS_NOTES,
		 * FormSchedulerConstants
		 * .CONSULTANT_DIETICIAN_NURITIONAL_RECOMMEDATIONS,
		 * FormSchedulerConstants.RENAL_DIALYSIS_COMMUNICATION_FORM,
		 * FormSchedulerConstants.REFFERAL_FORM,
		 * FormSchedulerConstants.REPORT_OF_CONSULTATION,
		 * FormSchedulerConstants.PHARMACIST_RESIDENT_EVALUATION,
		 * FormSchedulerConstants.DOCTORS_PROGRESS_NOTES,
		 * FormSchedulerConstants.INTERDISPLINARY_PROGRESS_NOTES,
		 * FormSchedulerConstants.REASON_FOR_STUDY_FORM,
		 * FormSchedulerConstants.MEDFAX_FORM_1,
		 * FormSchedulerConstants.MEDFAX_FORM_2,
		 * FormSchedulerConstants.HISTORY_AND_PHYSICIAL_GENERAL,
		 * FormSchedulerConstants.RESIDENT_IMMUNIZATION_FORM,
		 * FormSchedulerConstants.CUMULATIVE_DIAGNOSIS,
		 * FormSchedulerConstants.MONTHLY_VITAL_SIGNS_AND_WEIGHTS_SHEET,
		 * FormSchedulerConstants.WEEKLY_WEIGHTS,
		 * FormSchedulerConstants.PHYSICIAN_PLAZA_HEALTH_CARE_FORM,
		 * FormSchedulerConstants.PHYSICIAN_INFUSION_FORM,
		 * FormSchedulerConstants.PHYSICIAN_SPECIALITY_FORM,
		 * FormSchedulerConstants.PHYSICIAN_ORDER_FORM_1,
		 * FormSchedulerConstants.PHYSICIAN_ORDER_FORM_2,
		 * FormSchedulerConstants.PHYSICIAN_ORDER_FORM_3,
		 * FormSchedulerConstants.PRESCRIPTION,
		 * FormSchedulerConstants.PROGRESS_NOTES,
		 * FormSchedulerConstants.OCCUPATIONAL_DAILY_RECORD,
		 * FormSchedulerConstants.SPEECH_DAILY_RECORD,
		 * FormSchedulerConstants.PHYSICAL_THERAPY,
		 * FormSchedulerConstants.OCCUPATIONAL_THERAPY,
		 * FormSchedulerConstants.SPEECH_THERAPY,
		 * FormSchedulerConstants.POSITIONING_EVALUATION,
		 * FormSchedulerConstants.REHAB_CARE_PLAN,
		 * FormSchedulerConstants.THERAPY_PROGRESSNOTE_RECERTIFICATION_DISCHARGE
		 * , FormSchedulerConstants.TREATMENT }));
		 */

		cmbType.setModel(new DefaultComboBoxModel(new String[] { "",
				"Admission", "Discharge" }));
		cmbTimeFrame.setModel(new DefaultComboBoxModel(new String[] { "",
				"Hours", "Days", "Weeks" }));
		cmbAlertAfter.setModel(new DefaultComboBoxModel(new String[] { "",
				"Hours", "Days", "Weeks" }));

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

	protected void loadTree(DefaultMutableTreeNode node) {
		Object value = node.getUserObject();
		if (node.isLeaf()) {
			DefaultMutableTreeNode parent = (DefaultMutableTreeNode) node
					.getParent();
			Object parentValue = parent.getUserObject();
			String rootName = null, formName = null;
			int rootIndex = 0;

			if (parentValue == null) {
				return;
			}
			for (int i = 0; i < NODE_COUNT; i++) {
				if (parentValue.equals(forms[i][0])) {
					String[] formNames = (String[]) forms[i][1];
					for (int j = 0; j < formNames.length; j++) {
						if (value.equals(formNames[j])) {
							formName = formNames[j];
							break;
						}
					}
					rootIndex = i;
					rootName = (String) forms[i][0];
					break;
				}
			}
			updateTxtForm(rootName, rootIndex, new String[] { formName });
		} else {
			String rootName = null, formNames[] = null;
			int rootIndex = 0;

			if (value == null) {
				return;
			}
			for (int i = 0; i < NODE_COUNT; i++) {
				if (value.equals(forms[i][0])) {
					formNames = (String[]) forms[i][1];
					rootName = formNames[0];
					// rootName = (String) forms[i][0];
					rootIndex = i;
					break;
				}
			}
			updateTxtForm(rootName, rootIndex, formNames);
		}
	}

	private void updateTxtForm(String rootName, int rootIndex,
			String[] formNames) {
		currentRootName = rootName;
		currentRootIndex = rootIndex;
		currentFormNames = formNames;

		for (int i = 0; i < formNames.length; i++) {
			try {
				txtForm.setText(formNames[i]);
				cmbType.setSelectedIndex(0);
				txtTimeFrame.setText("");
				txtAlertAfter.setText("");
				txtForm.requestFocus();
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
		}
	}

	public void doUpdate() {
		updateData();
		presentationModel = new PresentationModel(myMap, FormSchedule.class,
				controllerFormScheduler, errorLabel);
		presentationModel.validateAll();
	}

	public boolean doSave() {
		FormSchedule ref = new FormSchedule();
		ref.setSerial(Global.currentFormScheduleKey);

		ref.setForm(txtForm.getText());
		ref.setType(cmbType.getSelectedItem() + "");
		if (txtTimeFrame.getText().equalsIgnoreCase("")
				|| txtTimeFrame.getText() == null) {
			ref.setTimeFrom(0);
		} else {
			ref.setTimeFrom(Integer.parseInt(txtTimeFrame.getText()));
		}
		ref.setTimeFromType(cmbTimeFrame.getSelectedItem() + "");
		if (txtAlertAfter.getText() != "" || txtAlertAfter.getText() != null) {
			ref.setAlertAfter(0);
		} else {
			ref.setAlertAfter(Integer.parseInt(txtAlertAfter.getText()));
		}
		ref.setAlertAfterType(cmbAlertAfter.getSelectedItem() + "");

		List errors = controllerFormScheduler.doValidate(ref, "");
		if (errors.size() > 0) {
			MsgBox m = new MsgBox();
			Iterator itr = errors.iterator();
			String strError = "";
			while (itr.hasNext()) {
				strError += (String) itr.next() + "\n";
			}
			m.addPrompt(strError);
			m.setTitle("Error Saving Form Scheduler");
			m.setVisible(true);
			return false;
		} else {
			try {
				MedrexClientManager.getInstance().insertOrUpdateFormSchedule(
						ref);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return true;
	}

	public boolean doValidate() {
		return true;
	}

	public void updateData() {
		if (Global.currentFormScheduleKey != 0) {
			FormSchedule ref = null;
			try {
				ref = MedrexClientManager.getInstance().getFormSchedule(
						Global.currentFormScheduleKey);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (ref != null) {
				txtForm.setText(ref.getForm());
				cmbType.setSelectedItem(ref.getType());
				txtTimeFrame.setText(ref.getTimeFrom() + "");
				cmbTimeFrame.setSelectedItem(ref.getTimeFromType());
				txtAlertAfter.setText(ref.getAlertAfter() + "");
				cmbAlertAfter.setSelectedItem(ref.getAlertAfterType());
			}
		} else {
			txtForm.setText("");
			cmbType.setSelectedIndex(0);
			txtTimeFrame.setText("");
			txtAlertAfter.setText("");
			cmbTimeFrame.setSelectedIndex(0);
			cmbAlertAfter.setSelectedIndex(0);
		}

	}
}
