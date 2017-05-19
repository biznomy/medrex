package medrex.client.admin.template;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

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
import medrex.client.utils.PresentationModel;
import medrex.commons.enums.GuiModes;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.medication.Templates;

import com.sX.swing.JxButton;
import com.sX.swing.htmlpad.JxHtmlPad;

public class PanelTemplateDialog extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7894679126483705652L;
	private static final Color DEF_COLOR = new Color(49, 104, 127);
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);

	private JxHtmlPad templateNotes;

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

	private JTree formTreeList;
	private JTextField txtForm;
	private JTextField txtTempName;
	private JLabel errorLabel;
	private ControllerTemplate controTemplate;
	private Map myMap;
	private PresentationModel presentationModel;

	public PanelTemplateDialog() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(700, 550));
		setSize(700, 550);
		setForeground(GuiModes.DESIGNER_FORMS.getDefaultForegroundColor());
		setBackground(GuiModes.DESIGNER_FORMS.getDefaultBackgroundColor());
		setFont(GuiModes.DESIGNER_FORMS.getDefaultFont());
		controTemplate = new ControllerTemplate();
		myMap = new HashMap();

		final JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setLayout(null);
		panel.setBounds(10, 10, 650, 550);
		add(panel);

		final JxButton saveButton = new JxButton();
		saveButton.setArc(0.4f);
		saveButton.setBackground(Color.WHITE);
		saveButton.setForeground(DEF_COL);
		saveButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (doSave()) {
					close();
				}
			}
		});
		saveButton.setText("Save");
		saveButton.setBounds(460, 436, 85, 25);
		panel.add(saveButton);

		final JxButton cancelButton = new JxButton();
		cancelButton.setArc(0.4f);
		cancelButton.setBackground(Color.WHITE);
		cancelButton.setForeground(DEF_COL);
		cancelButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		cancelButton.setText("Cancel");
		cancelButton.setBounds(562, 436, 85, 25);
		panel.add(cancelButton);

		templateNotes = new JxHtmlPad();
		templateNotes.setBorder(new LineBorder(SystemColor.desktop, 1, false));
		templateNotes.setBounds(190, 66, 458, 364);
		panel.add(templateNotes);

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

		txtForm = new JTextField();
		myMap.put("type", txtForm);
		txtForm.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		txtForm.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		txtForm.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		txtForm.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		txtForm.setEditable(false);
		txtForm.setBounds(190, 4, 280, 25);
		panel.add(txtForm);

		txtTempName = new JTextField();
		myMap.put("templateName", txtTempName);
		txtTempName.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		txtTempName.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		txtTempName.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		txtTempName.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		txtTempName.setBounds(299, 35, 280, 25);
		panel.add(txtTempName);

		final JLabel label = new JLabel();
		label.setText("Template Name");
		label
				.setForeground(GuiModes.DESIGNER_FORMS
						.getControlForegroundColor());
		label
				.setBackground(GuiModes.DESIGNER_FORMS
						.getControlBackgroundColor());
		label.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		label.setBounds(190, 39, 103, 16);
		panel.add(label);

		errorLabel = new JLabel();
		errorLabel.setForeground(new Color(255, 0, 0));
		errorLabel.setText("");
		errorLabel.setBounds(190, 489, 389, 14);
		panel.add(errorLabel);

		presentationModel = new PresentationModel(myMap, Templates.class,
				controTemplate, errorLabel);
		presentationModel.validateAll();

		doUpdate();
	}

	public boolean doSave() {
		Templates template = new Templates();
		boolean bool = false;
		try {
			template.setTemplateText(templateNotes.getFormattedText());
			template.setSerial(Global.currentTemplateKey);
			template.setType(txtForm.getText());
			template.setTemplateName(txtTempName.getText());
			int serial = MedrexClientManager.getInstance()
					.insertOrUpdateTemplates(template);
			if (serial != 0) {
				bool = true;
			}
		} catch (Exception e) {
			bool = false;
			e.printStackTrace();
		}
		return bool;
	}

	public void doUpdate() {

		DefaultMutableTreeNode root = processNodes(forms);
		formTreeList.setModel(new DefaultTreeModel(root));

		if (Global.currentTemplateKey != 0) {
			Templates temp = null;
			try {
				temp = MedrexClientManager.getInstance().getTemplate(
						Global.currentTemplateKey);
			} catch (Exception e) {

			}
			templateNotes.setFormattedText(temp.getTemplateText());
			txtForm.setText(temp.getType());
			txtTempName.setText(temp.getTemplateName());

		}
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
				txtForm.requestFocus();
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
		}
	}

	@Override
	public String getTitle() {
		return "Templates";
	}

}
