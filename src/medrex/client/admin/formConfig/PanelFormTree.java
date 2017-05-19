package medrex.client.admin.formConfig;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;

public class PanelFormTree extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8303234497536658314L;

	private JTree formTreeList;

	private static final Color DEF_COLOR = new Color(49, 104, 127);
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);

	// Form Names
	private String[] formNamesRafp = new String[] { "RAFP1" };
	private String[] formNamesAdmission = new String[] {
			"Resident Assessment Form", "Resident Quarterly Assessment Form",
			"Social Service Initial Assessment Form" };
	private String[] formNamesActivitys = new String[] {
			"Activity Initial Assessment Form Page 1",
			"Activity Initial Assessment Form Page 2" };
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
			{ "RAF Page 1", formNamesRafp },
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

	private String selectedformName;

	private String selectedFormFullPath;

	private final static String ROOT = "Forms";
	private final static int NODE_COUNT = 10;

	public PanelFormTree() {
		super();
		Global.framePanelJTree = this;
		// setBorder(new LineBorder(Color.black, 1, false));
		setSize(new Dimension(300, 400));
		setLayout(new BorderLayout());
		setBackground(Color.WHITE);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		// scrollPane.setBounds(50, 240, 230, 290);
		add(scrollPane, BorderLayout.CENTER);

		formTreeList = new JTree();
		formTreeList.setBackground(Color.WHITE);
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
		doUpdate();
	}

	private void doUpdate() {
		DefaultMutableTreeNode root = processNodes(forms);
		formTreeList.setModel(new DefaultTreeModel(root));

		if (Global.currentNoteCategoriesKey != 0) {
			try {
				MedrexClientManager.getInstance().getNotesCategories(
						Global.currentNoteCategoriesKey);
			} catch (Exception e) {
			}
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

	/**
	 * this method updates the opens the form inside internal JFrame
	 * 
	 * @return void
	 * @param rootIndex
	 *            - index of the root node rootName - root node name formNames -
	 *            string array containing form names
	 */
	private void updateTxtForm(String rootName, int rootIndex,
			String[] formNames) {
		Global.currentResidenceKey = 0;
		currentRootName = rootName;
		currentRootIndex = rootIndex;
		currentFormNames = formNames;

		for (int i = 0; i < formNames.length; i++) {
			try {
				System.out.println(formNames[i]);
				if ("RAFP1".equalsIgnoreCase(formNames[i])) {
					selectedformName = formNames[i];
					selectedFormFullPath = "medrex.client.test.ra.ui.PanelRAFPg1";
					// System.out.println("size of vf from getInstance"+validationObj.getValidationFormFields().size());
					Class cls = Class
							.forName("medrex.client.test.ra.ui.PanelRAFPg1");
					Object obj = cls.newInstance();
					if (obj instanceof JPanel) {
						PanelFormConfig cfgForm = new PanelFormConfig(
								(JPanel) obj, selectedformName,
								selectedFormFullPath);
						SwingUtils.center(cfgForm);
						cfgForm.setModal(true);
						cfgForm.setVisible(true);
						Global.framePanelJTree.dispose();
					}
				} else if ("Activity Initial Assessment Form Page 1"
						.equalsIgnoreCase(formNames[i])) {
					selectedformName = formNames[i];
					selectedFormFullPath = "medrex.client.main.activity.PanelActivityInitialAssessmentFormPage1";
					// System.out.println("size of vf from getInstance"+validationObj.getValidationFormFields().size());
					Class cls = Class
							.forName("medrex.client.main.activity.PanelActivityInitialAssessmentFormPage1");
					Object obj = cls.newInstance();
					if (obj instanceof JPanel) {
						PanelFormConfig cfgForm = new PanelFormConfig(
								(JPanel) obj, selectedformName,
								selectedFormFullPath);
						SwingUtils.center(cfgForm);
						cfgForm.setModal(true);
						cfgForm.setVisible(true);
						Global.framePanelJTree.dispose();
					}
				} else if ("Activity Initial Assessment Form Page 2"
						.equalsIgnoreCase(formNames[i])) {
					selectedformName = formNames[i];
					selectedFormFullPath = "medrex.client.main.activity.PanelActivityAssessmentFormPage2";
					// System.out.println("size of vf from getInstance"+validationObj.getValidationFormFields().size());
					Class cls = Class
							.forName("medrex.client.main.activity.PanelActivityAssessmentFormPage2");
					Object obj = cls.newInstance();
					if (obj instanceof JPanel) {
						PanelFormConfig cfgForm = new PanelFormConfig(
								(JPanel) obj, selectedformName,
								selectedFormFullPath);
						SwingUtils.center(cfgForm);
						cfgForm.setModal(true);
						cfgForm.setVisible(true);
						Global.framePanelJTree.dispose();
					}
				} else {
					PanelFormConfig cfgForm = new PanelFormConfig(new JPanel(),
							selectedformName, selectedFormFullPath);
					SwingUtils.center(cfgForm);
					cfgForm.setModal(true);
					cfgForm.setVisible(true);
					Global.framePanelJTree.dispose();
				}
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
		}
	}

	public static void main(String args[]) {
		JDialog d = new PanelFormTree();
		d.setVisible(true);
	}
}
