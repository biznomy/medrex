package medrex.client.admin.formManager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.rmi.RemoteException;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.formManager.Form;
import medrex.commons.vo.formManager.Tab;
import medrex.server.dao.formManager.FormManagerDao;

public class PanelFormTree extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTree formTreeList;

	private static final Color DEF_COLOR = new Color(49, 104, 127);
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);
	public String selectedNode;
	private int currentFormId;

	// Form Names
	private String[] formNamesRafp = new String[] { "RAFP1" };
	private String[] formNamesAdmission = null;/*
												 * new String[] {
												 * "Resident Assessment Form",
												 * "Resident Quarterly Assessment Form"
												 * ,
												 * "Social Service Initial Assessment Form"
												 * };
												 */
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

	private Object[][] forms = null;/*
									 * {
									 * 
									 * { "RAF Page 1", formNamesRafp}, {
									 * "Admission Details", formNamesAdmission
									 * }, { "Activities", formNamesActivitys },
									 * { "Medication & Treatment",
									 * formNamesMedication }, { "Dietary" ,
									 * formNamesDietary }, { "Consultant",
									 * formNamesConsultant }, {
									 * "Progress Notes", formNamesProgressNotes
									 * }, { "Lab & Special Reports",
									 * formNamesLabSpecial }, {
									 * "History & Physical", formNamesHistory },
									 * { "Physician Orders",
									 * formNamesPhysicianOrders }, {
									 * "Pt-Ot-Act Speech", formNamesPtOtSt } }
									 */

	private String currentRootName;
	private int currentRootIndex;
	private String[] currentFormNames;

	private String selectedformName;

	private String selectedFormFullPath;

	private String[] admissionTab;

	private final static String ROOT = "Forms";
	private final static int NODE_COUNT = 10;

	public PanelFormTree() {
		super();
		setSize(new Dimension(300, 400));
		setLayout(new BorderLayout());
		setBackground(Color.WHITE);
		List<Tab> tabs = null;
		try {
			tabs = FormManagerDao.getInstance().getAllTabs();
			System.out.println("fdsjkfjkldsjfdsjfjdsklf");
		} catch (Exception e) {
			e.printStackTrace();
		}
		setTree(tabs);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);

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
				selectedNode = event.getNewLeadSelectionPath()
						.getLastPathComponent().toString();
				setSelectedNode(selectedNode);
				try {
					currentFormId = MedrexClientManager.getInstance()
							.getFormIdByName(selectedNode);
					setCurrentFormId(currentFormId);
				} catch (RemoteException e) {
					e.printStackTrace();
				} catch (MedrexException e) {
					e.printStackTrace();
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

	public String getSelectedNode() {
		return selectedNode;
	}

	public void setSelectedNode(String selectedNode) {
		this.selectedNode = selectedNode;
	}

	private void setTree(List<Tab> tabs) {
		System.out.println("tabSize" + tabs.size());
		forms = new Object[tabs.size()][tabs.size()];
		admissionTab = new String[tabs.size()];
		for (int tabIndex = 0; tabIndex < tabs.size(); tabIndex++) {
			Tab t = tabs.get(tabIndex);
			if (t != null) {

				admissionTab[tabIndex] = t.getTabName();
				System.out.println("TabName:" + admissionTab[tabIndex]);

				if (t.getForms() != null) {
					List<Form> forms = t.getForms();
					formNamesAdmission = new String[forms.size()];
					forms.iterator();
					for (int i = 0; i < forms.size(); i++) {
						Form form = forms.get(i);

						formNamesAdmission[i] = form.getFormName();
						System.out.println("FormName:" + formNamesAdmission[i]);
					}
					/**
					 * TODO:This Loop has to be written again(its Just for
					 * displaying tabs correctly in tree for only two dummy
					 * tabs)
					 */
					for (int j = tabIndex; j < tabs.size(); j++) {
						if (j == 0) {
							this.forms[j][j + 1] = formNamesAdmission;
							this.forms[j][j] = admissionTab[j];
						}
						if (j == 1) {
							this.forms[j][j] = formNamesAdmission;
							this.forms[j][j - 1] = admissionTab[j];
						}
					}
				}
			}
		}
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
		root = new DefaultMutableTreeNode("TABS");

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
		Global.currentResidenceKey = 0;
		currentRootName = rootName;
		currentRootIndex = rootIndex;
		currentFormNames = formNames;

		for (int i = 0; i < formNames.length; i++) {
			try {
				System.out.println(formNames[i]);
				setSelectedformName(formNames[i]);
				Global.frameFormManager.setNewForm(formNames[i]);
				/*
				 * if("RAFP1".equalsIgnoreCase(formNames[i])){
				 * selectedformName=formNames[i];
				 * selectedFormFullPath="medrex.client.test.ra.ui.PanelRAFPg1";
				 * /
				 * /System.out.println("size of vf from getInstance"+validationObj
				 * .getValidationFormFields().size()); Class cls =
				 * Class.forName("medrex.client.test.ra.ui.PanelRAFPg1"); Object
				 * obj = cls.newInstance(); if (obj instanceof JPanel) {
				 * PanelFormConfig cfgForm = new
				 * PanelFormConfig((JPanel)obj,selectedformName
				 * ,selectedFormFullPath); SwingUtils.center(cfgForm);
				 * cfgForm.setModal(true); cfgForm.setVisible(true);
				 * Global.framePanelJTree.dispose(); } } else
				 * if("Activity Initial Assessment Form Page 1"
				 * .equalsIgnoreCase(formNames[i])){
				 * selectedformName=formNames[i];selectedFormFullPath=
				 * "medrex.client.main.activity.PanelActivityInitialAssessmentFormPage1"
				 * ;
				 * //System.out.println("size of vf from getInstance"+validationObj
				 * .getValidationFormFields().size()); Class cls =
				 * Class.forName(
				 * "medrex.client.main.activity.PanelActivityInitialAssessmentFormPage1"
				 * ); Object obj = cls.newInstance(); if (obj instanceof JPanel)
				 * { PanelFormConfig cfgForm = new
				 * PanelFormConfig((JPanel)obj,selectedformName
				 * ,selectedFormFullPath); SwingUtils.center(cfgForm);
				 * cfgForm.setModal(true); cfgForm.setVisible(true);
				 * Global.framePanelJTree.dispose(); } } else
				 * if("Activity Initial Assessment Form Page 2"
				 * .equalsIgnoreCase(formNames[i])){
				 * selectedformName=formNames[i];selectedFormFullPath=
				 * "medrex.client.main.activity.PanelActivityAssessmentFormPage2"
				 * ;
				 * //System.out.println("size of vf from getInstance"+validationObj
				 * .getValidationFormFields().size()); Class cls =
				 * Class.forName(
				 * "medrex.client.main.activity.PanelActivityAssessmentFormPage2"
				 * ); Object obj = cls.newInstance(); if (obj instanceof JPanel)
				 * { PanelFormConfig cfgForm = new
				 * PanelFormConfig((JPanel)obj,selectedformName
				 * ,selectedFormFullPath); SwingUtils.center(cfgForm);
				 * cfgForm.setModal(true); cfgForm.setVisible(true);
				 * Global.framePanelJTree.dispose(); } } else{ PanelFormConfig
				 * cfgForm = new PanelFormConfig(new
				 * JPanel(),selectedformName,selectedFormFullPath);
				 * SwingUtils.center(cfgForm); cfgForm.setModal(true);
				 * cfgForm.setVisible(true); Global.framePanelJTree.dispose(); }
				 */
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
		}
	}

	public String getSelectedformName() {
		return selectedformName;
	}

	public void setSelectedformName(String selectedformName) {
		this.selectedformName = selectedformName;
	}

	public int getCurrentFormId() {
		return currentFormId;
	}

	public void setCurrentFormId(int currentFormId) {
		this.currentFormId = currentFormId;
	}

	// public static void main(String args[]){
	// JDialog d=new PanelFormTree();
	// d.setVisible(true);
	// }
}
