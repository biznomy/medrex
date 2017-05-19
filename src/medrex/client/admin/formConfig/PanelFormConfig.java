package medrex.client.admin.formConfig;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyVetoException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.JViewport;
import javax.swing.border.LineBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.AbstractTableModel;

import medrex.client.admin.formConfig.validationParser.ConstraintSet;
import medrex.client.admin.formConfig.validationParser.ValidationParser;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.test.ra.ui.PanelRAFPg1;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.admission.validation.FormFieldValidation;
import medrex.commons.vo.admission.validation.ValidationForm;
import medrex.commons.vo.admission.validation.ValidationFormField;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.styles.RoundedBalloonStyle;
import net.java.balloontip.utils.TimingUtils;

import com.sX.awt.Direction;
import com.sX.swing.JxButton;
import com.sX.swing.JxLayeredPanel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;
import com.toedter.calendar.JDateChooser;

public class PanelFormConfig extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5167151232912776488L;
	private static final Color DEF_COLOR = new Color(49, 104, 127);
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);

	// Form Names
	private String[] formNamesRafp = new String[] { "RAFP1" };
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

	private final static String ROOT = "Forms";
	private final static int NODE_COUNT = 10;

	private JTree formTreeList;
	private JPanel panelForm;
	private JPanel innerPanelForm;
	// private JXLayer<JxLayeredPanel> layerContent;
	// private LockableUI layerUI;
	private PanelRAFPg1 panelrafp1;
	private JInternalFrame internalFrame;
	private JxLayeredPanel panelLockable;
	public JPanel currentSubjectPanel;
	private String selectedformName;
	private String selectedFormFullPath;
	private JxTable table;
	private ConfigJTable configSummaryTable;
	private ValidationForm validationObj;
	private Object reqCom;
	protected List<FormFieldValidation> formFieldVal;
	private JPanel addedPanel;
	private List<ValidationFormField> validationFormFieldObject;
	private Rectangle rectCoords;
	private JPanel glassPane;
	// private JPanel layerWrapper;
	private JScrollPane scrollPane;

	public PanelFormConfig(JPanel SelectedPanel, final String selectedformName,
			final String selectedFormFullPath) {

		this.selectedformName = selectedformName;
		this.selectedFormFullPath = selectedFormFullPath;
		this.addedPanel = SelectedPanel;

		setLayout(null);

		setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
				.getDefaultToolkit().getScreenSize().height);

		setForeground(GuiModes.DESIGNER_FORMS.getDefaultForegroundColor());
		setBackground(Color.WHITE);
		setFont(GuiModes.DESIGNER_FORMS.getDefaultFont());

		final JxPanel panel = new JxPanel();
		panel.setBackground(Color.WHITE);
		getContentPane().add(panel);
		getContentPane().setBackground(Color.WHITE);
		panel.setOpaque(false);
		panel.setLayout(null);
		panel.setArc(0f);
		panel.setBounds(0, 0, 1400, 750);
		panel.setLinearGradient(ColorConstants.GradientBright, new Color(185,
				205, 212), Direction.LEFT_TO_RIGHT);

		panelForm = new JPanel();
		panelForm.setOpaque(false);
		panelForm.setLayout(null);
		panelForm.setBackground(Color.WHITE);
		panelForm.setBounds(400, 0, 809, 705);
		panel.add(panelForm);

		innerPanelForm = new JPanel();
		innerPanelForm.setOpaque(false);
		innerPanelForm.setLayout(null);
		innerPanelForm.setBackground(Color.WHITE);
		innerPanelForm.setBounds(0, 0, 804, 695);
		panelForm.add(innerPanelForm);

		glassPane = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = -1243551158140571705L;

			@Override
			public void paint(Graphics g) {
				super.setOpaque(false);
				if (rectCoords != null) {
					g.setColor(new Color(255, 0, 0, 100));
					g.fillRect(rectCoords.x, rectCoords.y, rectCoords.width,
							rectCoords.height);
				}

				super.paint(g);
			}
		};
		glassPane.setBackground(Color.WHITE);
		glassPane.setOpaque(false);

		glassPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				handleClick(e);
			}
		});

		panelLockable = new JxLayeredPanel();
		panelLockable.setGlassPane(glassPane);
		panelLockable.getGlassPane().setVisible(true);
		panelLockable.setLayout(null);
		panelLockable.setBackground(Color.WHITE);
		panelLockable.setBounds(0, 0, 804, 695);
		// panelLockable.setBorder(new LineBorder(Color.RED, 5));
		// panelForm.add(panelLockable);
		//		

		/*
		 * layerUI = new LockableUI(new BufferedImageOpEffect(new
		 * OpacityFilter())) { public long getLayerEventMask() { return 0; } };
		 * 
		 * layerContent = new JXLayer<JxLayeredPanel>(panelLockable); //
		 * layerContent.getGlassPane().setLayout(new BorderLayout()); //
		 * layerContent.setUI(new LockableUI() { // public long
		 * getLayerEventMask() { // return 0; // } // });
		 * 
		 * layerContent.setUI(layerUI); layerContent.setBackground(Color.WHITE);
		 * layerContent.setLayout(new BorderLayout()); //
		 * layerContent.setLocation(0, 0); layerContent.setSize(600,700);
		 * layerContent.setPreferredSize(new Dimension(1600,1700)); //
		 * panelForm.add(layerContent);
		 * 
		 * // layerWrapper = new JPanel(); // layerWrapper.setLayout(null); //
		 * layerWrapper.add(layerContent);
		 * 
		 * scrollPane = new JScrollPane(layerContent);
		 */

		scrollPane = new JScrollPane(panelLockable);
		scrollPane.setBounds(0, 0, 920, 838);
		scrollPane.setBorder(new LineBorder(Color.BLUE, 4));
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(DEF_COL, 1, false));

		internalFrame = new JInternalFrame("Form View Area");
		internalFrame.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(final AncestorEvent arg0) {

				internalFrame.requestFocus();
				try {
					internalFrame.setSelected(true);
				} catch (PropertyVetoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			public void ancestorMoved(final AncestorEvent arg0) {
			}

			public void ancestorRemoved(final AncestorEvent arg0) {
			}
		});

		internalFrame.setBackground(Color.WHITE);
		internalFrame.getContentPane().add(scrollPane);
		// internalFrame.setLayout(new ScrollPaneLayout());
		internalFrame.setBounds(0, 0, 920, 838);
		internalFrame.setSize(920, 838);
		innerPanelForm.add(internalFrame);
		internalFrame.setClosable(false);
		internalFrame.setIconifiable(false);
		internalFrame.setMaximizable(false);
		internalFrame.setVisible(true);
		try {
			internalFrame.setMaximum(true);
		} catch (PropertyVetoException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		configSummaryTable = new ConfigJTable();

		final JScrollPane scrollPane2 = new JScrollPane();
		scrollPane2.setBounds(50, 115, 295, 282);
		scrollPane2.setBackground(Color.WHITE);
		scrollPane2.getViewport().setBackground(Color.WHITE);
		scrollPane2.setBorder(new LineBorder(DEF_COL, 1, false));
		panel.add(scrollPane2);

		final JxButton cancelButton = new JxButton();
		cancelButton.setArc(0.4f);
		cancelButton.setBackground(Color.WHITE);
		cancelButton.setForeground(DEF_COL);
		cancelButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				dispose();
			}
		});
		cancelButton.setText("Back");
		cancelButton.setBounds(52, 462, 137, 35);
		panel.add(cancelButton);

		table = new JxTable();
		table.setModel(configSummaryTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			@SuppressWarnings("unchecked")
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 1) {
					BalloonTip BTip = null;
					formFieldVal = (List<FormFieldValidation>) configSummaryTable
							.getValueAt(table.getSelectedRow(), 3);
					ValidationFormField valFormField = (ValidationFormField) configSummaryTable
							.getValueAt(table.getSelectedRow(), 4);
					configSummaryTable.getValueAt(table.getSelectedRow(), 6)
							.toString();
					String msg = valFormField.getLabelOfField().concat(" , ");
					for (FormFieldValidation ffv : formFieldVal) {
						if (ffv.getPattern() != null) {
							if (ffv.getType().equalsIgnoreCase("Constraint")) {
								ValidationParser vp = new ValidationParser();
								ConstraintSet constraintSet = vp.parse(ffv
										.getPattern());
								msg = msg.concat(ffv.getType()).concat("  ")
										.concat(constraintSet + "")
										.concat("  ");
							} else {
								msg = msg.concat(ffv.getType()).concat("  ")
										.concat(ffv.getPattern()).concat("  ");
							}
						} else {
							if (ffv.getType() != null) {
								msg = msg.concat("  ").concat(ffv.getType());
							}
						}
					}
					BTip = new BalloonTip(table, msg, new RoundedBalloonStyle(
							10, 10, Color.WHITE, ColorConstants.DEF_COLOR),
							BalloonTip.Orientation.LEFT_ABOVE,
							BalloonTip.AttachLocation.NORTHWEST, 20, 20, false);
					TimingUtils.showTimedBalloon(BTip, 1000);
				}
				if (evt.getClickCount() == 2) {
					int id = new Integer((String) configSummaryTable
							.getValueAt(table.getSelectedRow(), 2)).intValue();
					if (id != -1) {

						String nameOfComp = (String) configSummaryTable
								.getValueAt(table.getSelectedRow(), 6);
						formFieldVal = (List<FormFieldValidation>) configSummaryTable
								.getValueAt(table.getSelectedRow(), 3);
						validationObj.setFormName(selectedformName);
						validationObj.setFullClassName(selectedFormFullPath);
						ValidationFormField valFormField = (ValidationFormField) configSummaryTable
								.getValueAt(table.getSelectedRow(), 4);
						if (valFormField.getComponentName().startsWith("bg")) {
							ButtonGroup bgGroup = null;
							if (currentSubjectPanel != null) {
								try {
									Class cls = currentSubjectPanel.getClass();
									Field f = cls.getDeclaredField(nameOfComp);
									boolean access = f.isAccessible();
									f.setAccessible(true);
									bgGroup = (ButtonGroup) f
											.get(currentSubjectPanel);
									f.setAccessible(access);
									showButtonGroupValidation(bgGroup,
											nameOfComp);
								} catch (Exception e) {
									e.printStackTrace();
								}
							}

						} else {
							if (currentSubjectPanel != null) {
								try {
									Class cls = currentSubjectPanel.getClass();
									Field f = cls.getDeclaredField(nameOfComp);
									boolean access = f.isAccessible();
									f.setAccessible(true);
									reqCom = f.get(currentSubjectPanel);
									f.setAccessible(access);
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
							PanelAlertConfigPopup frm = new PanelAlertConfigPopup(
									table.getSelectedRow(), reqCom, nameOfComp,
									currentSubjectPanel, validationObj,
									formFieldVal, valFormField, "");
							SwingUtils.openInDialog(frm);
							frm.setBackground(Color.WHITE);
							frm.setVisible(true);

						}
					} else {

					}
					updateConfigRecordJTable();
				}
			}
		});
		scrollPane2.setViewportView(table);

		final JLabel fieldInformationLabel = new JLabel();
		fieldInformationLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		fieldInformationLabel.setForeground(ColorConstants.DEF_COLOR);
		fieldInformationLabel.setText("FIELD INFORMATION");
		fieldInformationLabel.setBounds(118, 45, 199, 35);
		panel.add(fieldInformationLabel);

		final JxButton deleteButton = new JxButton();
		deleteButton.setBackground(Color.WHITE);
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					int id = -1;
					ValidationFormField valFormField = (ValidationFormField) configSummaryTable
							.getValueAt(table.getSelectedRow(), 4);
					id = (valFormField).getSerial();

					if (id != -1) {
						MedrexClientManager.getInstance()
								.deleteValidationFormField(id);
						validationObj = MedrexClientManager.getInstance()
								.getValidations(validationObj.getSerial());
					}
					updateConfigRecordJTable();
				} catch (Exception xe) {
					xe.printStackTrace();
				}

			}
		});
		deleteButton.setText("Delete");
		deleteButton.setArc(0.4f);
		deleteButton.setForeground(DEF_COL);
		deleteButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		deleteButton.setFont(new Font("", Font.BOLD, 12));
		deleteButton.setBounds(224, 462, 121, 35);
		panel.add(deleteButton);

		this.validationObj = getInstanceOfValidation();
		updateConfigRecordJTable();
		doUpdate();
	}

	/**
	 * this function will remove the validation form field object from
	 * validation form to refresh the object
	 * 
	 * @param valFormField
	 *            - object to be removed
	 */

	protected void removeValidationFormField(ValidationFormField valFormField) {
		for (ValidationFormField v : validationObj.getValidationFormFields()) {
			if (v.getComponentName().equalsIgnoreCase(
					valFormField.getComponentName())) {
				validationObj.getValidationFormFields().remove(v);
			}
		}
	}

	/**
	 * update the table that contains field information
	 */

	private void updateConfigRecordJTable() {
		ValidationForm valRec = null;
		try {
			valRec = getInstanceOfValidation();

		} catch (Exception e) {
		}

		List<ValidationFormField> vffList = new ArrayList<ValidationFormField>();
		if (valRec != null) {
			Iterator<ValidationFormField> i = valRec.getValidationFormFields()
					.iterator();
			while (i.hasNext()) {
				vffList.add(i.next());
			}
		}

		this.validationFormFieldObject = vffList;
		if (vffList != null) {
			configSummaryTable.setNewList(vffList);
			configSummaryTable.fireTableStructureChanged();
			table.updateUI();
			table.repaint();
		}
	}

	/**
	 * handles the click event if any component is clicked
	 * 
	 * @param e
	 *            - event parameter containing x,y coordinates.
	 */

	private void handleClick(MouseEvent e) {
		Object reqCom = null;
		int x = e.getX(), y = e.getY();
		x += panelLockable.getX();
		y += panelLockable.getY();
		x += currentSubjectPanel.getX();
		y += currentSubjectPanel.getY();

		System.out.println("x: " + x + " y:" + y);
		this.reqCom = retrieveComponentAt(currentSubjectPanel, e.getX(), e
				.getY());
		reqCom = this.reqCom;

		if (reqCom != null && reqCom instanceof JComponent) {
			JComponent com = (JComponent) reqCom;
			Container parent = com.getParent();

			if (parent instanceof JViewport) {
				Container p = parent.getParent();

				if (p instanceof JScrollPane) {
					drawRectangle(p.getLocation(), p.getSize());
				}
			} else {
				Point offset = determinePoint(com, com.getLocation());
				drawRectangle(offset, com.getSize());

			}

		}

		if (reqCom != null) {
			if (reqCom instanceof JRadioButton) {

				showButtonGroupValidation(getButtonGroup(reqCom),
						getButtonGroupName(reqCom));
			} else if (reqCom instanceof JDateChooser) {

			} else {
				showValidationPopUp();
			}
		}
	}

	/**
	 * this method is called when a component clicked is JRadioButton
	 * 
	 * @param bgGroup
	 *            - Button Group
	 * @param bgName
	 *            - Button GroupName
	 */

	@SuppressWarnings("unchecked")
	private void showButtonGroupValidation(ButtonGroup bgGroup, String bgName) {

		validationObj.setFormName(selectedformName);
		validationObj.setFullClassName(selectedFormFullPath);

		int selectedRow = isFieldAlreadyExist(bgName);

		if (selectedRow >= 0) {

			String nameOfComp = (String) configSummaryTable.getValueAt(
					selectedRow, 6);
			formFieldVal = (List<FormFieldValidation>) configSummaryTable
					.getValueAt(selectedRow, 3);
			validationObj.setFormName(selectedformName);
			validationObj.setFullClassName(selectedFormFullPath);
			reqCom = bgGroup;
			ValidationFormField valFormField = (ValidationFormField) configSummaryTable
					.getValueAt(selectedRow, 4);
			PanelAlertConfigPopup frm = new PanelAlertConfigPopup(selectedRow,
					reqCom, nameOfComp, currentSubjectPanel, validationObj,
					formFieldVal, valFormField, bgName);
			SwingUtils.openInDialog(frm);
		} else {
			validationObj.setFormName(selectedformName);
			validationObj.setFullClassName(selectedFormFullPath);
			reqCom = bgGroup;
			PanelAlertConfigPopup frm = new PanelAlertConfigPopup(-1, reqCom,
					retrieveNameOf(reqCom), currentSubjectPanel, validationObj,
					null, null, bgName);
			SwingUtils.openInDialog(frm);
		}
		updateConfigRecordJTable();
	}

	/**
	 * this method is called when any component except RadioNutton is Clicked.
	 */

	@SuppressWarnings("unchecked")
	private void showValidationPopUp() {

		validationObj.setFormName(selectedformName);
		validationObj.setFullClassName(selectedFormFullPath);
		int selectedRow = isFieldAlreadyExist(retrieveNameOf(reqCom));

		if (selectedRow >= 0) {

			String nameOfComp = (String) configSummaryTable.getValueAt(
					selectedRow, 6);
			formFieldVal = (List<FormFieldValidation>) configSummaryTable
					.getValueAt(selectedRow, 3);
			validationObj.setFormName(selectedformName);
			validationObj.setFullClassName(selectedFormFullPath);
			Object valFormField = configSummaryTable.getValueAt(selectedRow, 4);
			try {
				Class cls = currentSubjectPanel.getClass();
				Field f = cls.getDeclaredField(nameOfComp);
				boolean access = f.isAccessible();
				f.setAccessible(true);
				reqCom = f.get(currentSubjectPanel);
				f.setAccessible(access);
			} catch (Exception e) {
				e.printStackTrace();
			}
			PanelAlertConfigPopup frm = new PanelAlertConfigPopup(selectedRow,
					reqCom, nameOfComp, currentSubjectPanel, validationObj,
					formFieldVal, valFormField, "");
			SwingUtils.openInDialog(frm);
		} else {
			validationObj.setFormName(selectedformName);
			validationObj.setFullClassName(selectedFormFullPath);
			PanelAlertConfigPopup frm = new PanelAlertConfigPopup(-1, reqCom,
					retrieveNameOf(reqCom), currentSubjectPanel, validationObj,
					null, null, "");
			SwingUtils.openInDialog(frm);
		}
		updateConfigRecordJTable();
	}

	/**
	 * generic method return the component after recursively finding the
	 * component contained inside a panel
	 * 
	 * @param com
	 * @param x
	 * @param y
	 * @return component that is retrieved
	 */

	private JComponent retrieveComponentAt(JComponent com, int x, int y) {
		if (com != null) {

			if (com.contains(x, y)) {
				if (isRequiredComponent(com)) {
					return com;
				} else {
					if (com.getComponentCount() > 0) {
						Component comps[] = com.getComponents();
						for (Component c : comps) {
							if (c instanceof JComponent) {
								JComponent comP = (JComponent) c;
								int newX = x - comP.getX();
								int newY = y - comP.getY();
								JComponent reqCom = retrieveComponentAt(comP,
										newX, newY);
								if (reqCom != null
										&& isRequiredComponent(reqCom)) {
									return reqCom;
								}
							}
						}
					} else {
						return null;
					}
				}
			}
		}
		return null;
	}

	/**
	 * this generic method will return the button group.
	 * 
	 * @param radioButton
	 * @return button group in which radio button is contained
	 */

	private ButtonGroup getButtonGroup(Object radioButton) {
		Field[] fields = currentSubjectPanel.getClass().getDeclaredFields();
		List<Field> fList = new ArrayList<Field>();
		for (Field f : fields) {
			Class fClass = f.getType();
			new ButtonGroup();

			if (fClass.getSimpleName().equals("ButtonGroup")) {
				fList.add(f);
			}
		}
		try {
			for (Field f : fList) {
				boolean access = f.isAccessible();
				f.setAccessible(true);
				Object obj = f.get(currentSubjectPanel);
				f.setAccessible(access);

				if (SwingUtils.isInButtonGroup((ButtonGroup) obj, radioButton)) {

					return (ButtonGroup) obj;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	private String getButtonGroupName(Object radioButton) {
		Field[] fields = currentSubjectPanel.getClass().getDeclaredFields();
		List<Field> fList = new ArrayList<Field>();
		for (Field f : fields) {
			Class fClass = f.getType();
			if (fClass.getSimpleName().equals("ButtonGroup")) {
				fList.add(f);
			}
		}
		try {
			for (Field f : fList) {
				boolean access = f.isAccessible();
				f.setAccessible(true);
				Object obj = f.get(currentSubjectPanel);
				f.setAccessible(access);

				if (SwingUtils.isInButtonGroup((ButtonGroup) obj, radioButton)) {
					return f.getName();
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	/**
	 * this generic method returns the name of the component.
	 * 
	 * @param reqCom2
	 * @return name of the component.
	 */

	private String retrieveNameOf(Object reqCom2) {
		if (reqCom2 != null) {
			Class rcClass = reqCom2.getClass();
			Field[] fields = currentSubjectPanel.getClass().getDeclaredFields();
			List<Field> fList = new ArrayList<Field>();
			for (Field f : fields) {
				Class fClass = f.getType();
				if (fClass == rcClass) {
					fList.add(f);
				}
			}
			try {
				for (Field f : fList) {
					boolean access = f.isAccessible();
					f.setAccessible(true);
					Object obj = f.get(currentSubjectPanel);
					f.setAccessible(access);
					if (reqCom2.equals(obj)) {

						return f.getName();
					}
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return null;

	}

	/**
	 * the function returns true if the component is required to be searched or
	 * required to show the pop up.
	 * 
	 * @param com
	 * @return true /false
	 */

	private boolean isRequiredComponent(Object com) {
		if (com instanceof JTextField)
			return true;
		if (com instanceof JTextArea)
			return true;
		if (com instanceof JRadioButton)
			return true;
		if (com instanceof JCheckBox)
			return true;
		if (com instanceof JComboBox)
			return true;
		if (com instanceof JList)
			return true;
		if (com instanceof JDateChooser)
			return true;
		return false;
	}

	public void doUpdate() {

		viewPanel(addedPanel);

	}

	/**
	 * a genric method which will add the required panel to the frame.
	 * 
	 * @param addedPanel
	 */

	private void viewPanel(final JPanel addedPanel) {

		currentSubjectPanel = addedPanel;
		addedPanel.setLocation(0, 0);
		addedPanel.setSize(addedPanel.getPreferredSize());

		panelLockable.removeAll();

		panelLockable.add(addedPanel);
		panelLockable.setPreferredSize(addedPanel.getPreferredSize());
		panelLockable.setSize(addedPanel.getPreferredSize());
		panelLockable.repaint();

		scrollPane.setViewportView(panelLockable);

		panelLockable.setLocked(true);
		this.repaint();
	}

	public class ConfigJTable extends AbstractTableModel {
		/**
		 * 
		 */
		private static final long serialVersionUID = -8523115794288881321L;

		private String[] columnNames = { "Control Name", "Data Type" };

		public List<ValidationFormField> validationForm;
		int n = 0;

		ConfigJTable(List<ValidationFormField> validationFrm) {
			this.validationForm = validationFrm;

		}

		ConfigJTable() {
			this.validationForm = new ArrayList<ValidationFormField>();
		}

		public int getColumnCount() {
			return columnNames.length;
		}

		public int getRowCount() {
			return (validationForm.size());
		}

		public void setRowCount(int count) {
			n = n + count;
		}

		public void setNewList(List<ValidationFormField> valRec) {
			validationForm = valRec;
		}

		@Override
		public String getColumnName(int col) {
			return columnNames[col];
		}

		public Object getValueAt(int row, int col) {
			try {
				Object o = validationForm.get(row);

				if (o instanceof ValidationFormField) {
					ValidationFormField rc = (ValidationFormField) o;
					if (col == 0) {
						return rc.getLabelOfField();
					}
					if (col == 1) {
						return rc.getDataTypeOfComponent();
					}
					if (col == 2) {
						return (rc.getSerial() + "");
					}
					if (col == 3) {

						return (rc.getValidationFormFields());
					}
					if (col == 4) {
						return rc;
					}
					if (col == 5) {
						return rc.getLabelOfField();
					}
					if (col == 6) {
						return rc.getComponentName();
					}
					return ("");
				} else {
					if (col == 0) {

					}
					if (col == 1) {

					}
					if (col == 2) {

					}
					return ("");
				}
			} catch (Exception e) {
				return ("");
			}
		}

	}

	private ValidationForm getInstanceOfValidation() {
		ValidationForm vf = null;
		try {
			vf = MedrexClientManager.getInstance().getAllValidations(
					selectedFormFullPath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (vf == null) {
			vf = new ValidationForm();
		}
		if (vf != null) {
			validationObj = vf;
		}
		return validationObj;
	}

	/**
	 * function will return the row no if the field for the retrieved component
	 * exist.
	 * 
	 * @param retrievedNameOfComp
	 *            : the component whose field has to be determined
	 */

	private int isFieldAlreadyExist(String retrievedNameOfComp) {
		int rowNo = -1;
		for (int i = 0; i < this.validationFormFieldObject.size(); i++) {
			ValidationFormField vff = this.validationFormFieldObject.get(i);
			if (vff.getComponentName().equalsIgnoreCase(retrievedNameOfComp)) {
				rowNo = i;
				return rowNo;
			}
		}
		return rowNo;
	}

	/**
	 * it will determine the location of the component recursively if there
	 * exist a parent.
	 * */

	private Point determinePoint(Container com, Point p) {
		Container parent = com.getParent();
		p.x += (parent.getLocation().x > 0) ? parent.getLocation().x : 0;
		p.y += (parent.getLocation().y > 0) ? parent.getLocation().y : 0;
		if (parent instanceof JxLayeredPanel) {
			return p;
		} else {
			return determinePoint(parent, p);
		}
	}

	/**
	 * function to draw rectangle on to the component which is clicked
	 * */

	private void drawRectangle(Point loc, Dimension dim) {
		if (reqCom != null) {

			int x = loc.x, y = loc.y;

			int height = dim.height;
			int width = dim.width;

			// System.out.println("locX: "+x+" ,locY: "+y+",Width :"+width+",Height :"+height);
			rectCoords = new Rectangle(x, y, width, height);
			glassPane.repaint();
		}
	}

}
