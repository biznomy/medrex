package medrex.client.admin.formConfig;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.test.ra.ui.PanelRAFPg1;
import medrex.client.utils.FieldFormatter;
import medrex.client.utils.SwingUtils;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admission.validation.FormFieldValidation;
import medrex.commons.vo.admission.validation.ValidationForm;
import medrex.commons.vo.admission.validation.ValidationFormField;
import medrex.commons.vo.ra.RAFPg1;

import com.sX.swing.JxButton;
import com.toedter.calendar.JDateChooser;

public class FrameValidationPopUp extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8777751752343582630L;
	private JTextField txtConstraintValue;
	private JTextArea txtRelation;
	private ButtonGroup bgSelected = new ButtonGroup();
	private ButtonGroup bgChecked = new ButtonGroup();
	private ButtonGroup bgEnable = new ButtonGroup();
	private JRadioButton rbSelectedNo;
	private JRadioButton rbSelectedYes;
	private JRadioButton rbCheckedNo;
	private JRadioButton rbCheckedYes;
	private JRadioButton rbEnabledNo;
	private JRadioButton rbEnabledYes;
	private JTextField txtName;
	private JComboBox cmbConstraint;
	private JFormattedTextField txtExact;
	private JFormattedTextField txtMin;
	private JFormattedTextField txtMax;
	private JPanel PanelMendatory;
	private JPanel panelRelation1;
	private JPanel PanelString;
	private ButtonGroup bgAndOr = new ButtonGroup();
	private JRadioButton rbNo;
	private JRadioButton rbYes;
	private JRadioButton rbNoLimit;
	private JRadioButton rbExact;
	private JRadioButton rbMaxMin;
	private JPanel PanelNoLimit;
	private JPanel panelExact;
	private JPanel panelMaxMin;
	private ButtonGroup bgLength = new ButtonGroup();
	private ButtonGroup bgMenDatory = new ButtonGroup();
	private String nameOfComp;
	private JComponent comp;
	private String selectedformName;
	private String selectedFormFullPath;
	private JPanel currentPanel;
	private String dataTypeOfComp;
	private ValidationForm validationObj = null;
	private List<FormFieldValidation> formField = null;
	private ValidationFormField valformField = null;
	private int validationFormFieldIndex;
	private boolean isPanelStringEnabled;

	@SuppressWarnings("unchecked")
	public FrameValidationPopUp(final int index, JComponent reqCom,
			String nameOfComp, String selectedformName,
			String selectedFormFullPath, JPanel currentPanel,
			ValidationForm validationObj2, Object formField, Object valFormField) {
		super();
		setResizable(false);
		setTitle("validations");
		// setUndecorated(true);
		// Class cls = reqCom.getClass();
		// System.out.println("Comp is:"+cls.getSimpleName());
		this.validationFormFieldIndex = index;
		this.comp = reqCom;
		this.nameOfComp = nameOfComp;
		this.selectedformName = selectedformName;
		this.selectedFormFullPath = selectedFormFullPath;
		this.currentPanel = currentPanel;
		this.validationObj = validationObj2;
		System.out.println("size of vf in const:"
				+ validationObj2.getValidationFormFields().size());
		this.formField = (List<FormFieldValidation>) formField;
		this.valformField = (ValidationFormField) valFormField;
		getContentPane().setBackground(Color.WHITE);
		Global.frameValidationPopUp = this;
		getContentPane().setLayout(null);
		setBackground(Color.WHITE);
		setLayout(null);
		setModal(true);
		setSize(1065, 665);
		setLayout(null);

		PanelString = new JPanel();
		getContentPane().add(PanelString);
		PanelString.setBorder(new LineBorder(Color.BLACK, 2, false));
		PanelString.setLayout(null);
		PanelString.setBackground(Color.WHITE);
		PanelString.setBounds(15, 342, 515, 230);

		panelMaxMin = new JPanel();
		panelMaxMin.setBackground(Color.WHITE);
		panelMaxMin.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, false));
		panelMaxMin.setLayout(null);
		panelMaxMin.setBounds(124, 30, 369, 53);
		PanelString.add(panelMaxMin);

		final JLabel maxLengthLabel = new JLabel();
		maxLengthLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		maxLengthLabel.setText("Max Length");
		maxLengthLabel.setBounds(231, 5, 79, 14);
		panelMaxMin.add(maxLengthLabel);

		final JLabel minLengthLabel = new JLabel();
		minLengthLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		minLengthLabel.setText("Min Length");
		minLengthLabel.setBounds(61, 5, 129, 14);
		panelMaxMin.add(minLengthLabel);

		txtMax = new JFormattedTextField(FieldFormatter.MAX4);
		txtMax.setBounds(201, 25, 158, 18);
		panelMaxMin.add(txtMax);

		txtMin = new JFormattedTextField(FieldFormatter.MAX1);
		txtMin.setBounds(28, 25, 150, 18);
		panelMaxMin.add(txtMin);

		panelExact = new JPanel();
		panelExact.setBackground(Color.WHITE);
		panelExact.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, false));
		panelExact.setLayout(null);
		panelExact.setBounds(124, 104, 369, 44);
		PanelString.add(panelExact);

		final JLabel exactLengthLabel = new JLabel();
		exactLengthLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		exactLengthLabel.setText("Exact Length");
		exactLengthLabel.setBounds(57, 12, 117, 14);
		panelExact.add(exactLengthLabel);

		txtExact = new JFormattedTextField(FieldFormatter.MAX4);
		txtExact.setBounds(201, 10, 158, 18);
		panelExact.add(txtExact);

		PanelNoLimit = new JPanel();
		PanelNoLimit.setBackground(Color.WHITE);
		PanelNoLimit.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, false));
		PanelNoLimit.setLayout(null);
		PanelNoLimit.setBounds(124, 175, 369, 33);
		PanelString.add(PanelNoLimit);

		final JLabel noLimitLabel = new JLabel();
		noLimitLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		noLimitLabel.setText("No Limit");
		noLimitLabel.setBounds(57, 10, 54, 14);
		PanelNoLimit.add(noLimitLabel);

		rbMaxMin = new JRadioButton();
		rbMaxMin.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				updatePanels();
			}
		});
		rbMaxMin.setActionCommand("1");
		bgLength.add(rbMaxMin);
		rbMaxMin.setBackground(Color.WHITE);
		rbMaxMin.setText("");
		rbMaxMin.setBounds(62, 43, 33, 18);
		PanelString.add(rbMaxMin);

		rbExact = new JRadioButton();
		rbExact.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updatePanels();
			}
		});
		rbExact.setActionCommand("2");
		bgLength.add(rbExact);
		rbExact.setBackground(Color.WHITE);
		rbExact.setText("");
		rbExact.setBounds(62, 117, 33, 18);
		PanelString.add(rbExact);

		rbNoLimit = new JRadioButton();
		rbNoLimit.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updatePanels();
			}
		});
		rbNoLimit.setActionCommand("3");
		bgLength.add(rbNoLimit);
		rbNoLimit.setBackground(Color.WHITE);
		rbNoLimit.setText("");
		rbNoLimit.setBounds(62, 190, 33, 18);
		PanelString.add(rbNoLimit);

		panelRelation1 = new JPanel();
		panelRelation1.setBorder(new LineBorder(Color.BLACK, 2, false));
		panelRelation1.setLayout(null);
		panelRelation1.setBackground(Color.WHITE);
		panelRelation1.setBounds(529, 147, 515, 257);
		getContentPane().add(panelRelation1);

		cmbConstraint = new JComboBox();
		cmbConstraint.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (cmbConstraint.getSelectedIndex() != 0) {
					txtRelation.setText(txtRelation.getText() + " "
							+ cmbConstraint.getSelectedItem().toString());
				}
			}
		});
		cmbConstraint.setModel(new DefaultComboBoxModel(new String[] { "",
				"Starts With", "Ends With", "Contains", "Not Contains",
				"Change" }));
		cmbConstraint.setFont(new Font("Tahoma", Font.BOLD, 12));
		cmbConstraint.setBackground(Color.WHITE);
		cmbConstraint.setBounds(238, 21, 229, 24);
		panelRelation1.add(cmbConstraint);

		final JLabel valueLabel = new JLabel();
		valueLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		valueLabel.setText("CONSTRAINTS");
		valueLabel.setBounds(52, 26, 112, 14);
		panelRelation1.add(valueLabel);

		final JxButton andButton = new JxButton();
		andButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				if (cmbConstraint.getSelectedIndex() == 0) {
					JOptionPane.showMessageDialog(null,
							"Must Select A Constraint", "Constraint",
							JOptionPane.ERROR_MESSAGE);
				} else if (txtConstraintValue.getText().equalsIgnoreCase("")) {
					JOptionPane.showMessageDialog(null,
							"Must Give A Constraint Value", "Value",
							JOptionPane.ERROR_MESSAGE);
				} else {
					// System.out.println("txtRelation.getText():"+txtRelation.getText());
					String constraintSelection = txtRelation.getText();
					String constraintValue = txtConstraintValue.getText();
					// System.out.println(constraintSelection+constraintValue);
					// System.out.println(constraintSelection+constraintValue+"AND");
					txtRelation.setText(constraintSelection + " "
							+ constraintValue + " AND");
					cmbConstraint.setSelectedIndex(0);
					txtConstraintValue.setText("");
				}
			}
		});
		andButton.setArc(0.4f);
		andButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		andButton.setBackground(Color.WHITE);
		andButton.setText("AND");
		andButton.setBounds(238, 107, 56, 26);
		panelRelation1.add(andButton);

		final JxButton orButton = new JxButton();
		orButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (cmbConstraint.getSelectedIndex() == 0) {
					JOptionPane.showMessageDialog(null,
							"Must Select A Constraint", "Constraint",
							JOptionPane.ERROR_MESSAGE);
				} else if (txtConstraintValue.getText().equalsIgnoreCase("")) {
					JOptionPane.showMessageDialog(null,
							"Must Select A Constraint Value", "Value",
							JOptionPane.ERROR_MESSAGE);
				} else {
					String constraintSelection = txtRelation.getText();
					String constraintValue = txtConstraintValue.getText();
					// System.out.println(constraintSelection+constraintValue);
					// System.out.println(constraintSelection+constraintValue+"AND");
					txtRelation.setText(constraintSelection + " "
							+ constraintValue + " OR");
					cmbConstraint.setSelectedIndex(0);
					txtConstraintValue.setText("");
				}
			}
		});
		orButton.setArc(0.4f);
		orButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		orButton.setBackground(Color.WHITE);
		orButton.setText("OR");
		orButton.setBounds(300, 107, 56, 26);
		panelRelation1.add(orButton);

		final JLabel valueLabel_1 = new JLabel();
		valueLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		valueLabel_1.setText("RELATION");
		valueLabel_1.setBounds(52, 110, 112, 14);
		panelRelation1.add(valueLabel_1);

		final JxButton clearButton = new JxButton();
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				txtRelation.setText("");
			}
		});
		clearButton.setArc(0.4f);
		clearButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		clearButton.setBackground(Color.WHITE);
		clearButton.setText("CLEAR");
		clearButton.setBounds(429, 107, 56, 26);
		panelRelation1.add(clearButton);

		final JLabel valueLabel_1_1 = new JLabel();
		valueLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		valueLabel_1_1.setText("VALUE");
		valueLabel_1_1.setBounds(52, 69, 112, 14);
		panelRelation1.add(valueLabel_1_1);

		txtConstraintValue = new JTextField();
		txtConstraintValue.setBounds(238, 67, 229, 21);
		panelRelation1.add(txtConstraintValue);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(52, 150, 415, 47);
		panelRelation1.add(scrollPane);

		txtRelation = new JTextArea();
		txtRelation.setBorder(new LineBorder(Color.black, 1, false));
		scrollPane.setViewportView(txtRelation);

		final JxButton alertInfoButton = new JxButton();
		alertInfoButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Generating Alert",
						"Alert", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		alertInfoButton.setArc(0.4f);
		alertInfoButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		alertInfoButton.setBackground(Color.WHITE);
		alertInfoButton.setText("ALERT INFO");
		alertInfoButton.setBounds(317, 215, 150, 28);
		panelRelation1.add(alertInfoButton);

		final JxButton okButton = new JxButton();
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				txtRelation.setText(txtRelation.getText() + " "
						+ txtConstraintValue.getText());
			}
		});
		okButton.setBackground(Color.WHITE);
		okButton.setFont(new Font("", Font.BOLD, 12));
		okButton.setArc(0.4f);
		okButton.setText("OK");
		okButton.setBounds(362, 107, 56, 26);
		panelRelation1.add(okButton);

		PanelMendatory = new JPanel();
		PanelMendatory.setBounds(15, 147, 515, 171);
		getContentPane().add(PanelMendatory);
		PanelMendatory.setLayout(null);
		PanelMendatory.setBackground(Color.WHITE);
		PanelMendatory.setBorder(new LineBorder(Color.BLACK, 2, false));

		final JLabel isMendatoryLabel = new JLabel();
		isMendatoryLabel.setFont(new Font("", Font.BOLD, 12));
		isMendatoryLabel.setText("MANDATORY ? ");
		isMendatoryLabel.setBounds(40, 10, 131, 16);
		PanelMendatory.add(isMendatoryLabel);

		rbYes = new JRadioButton();
		rbYes.setFont(new Font("Tahoma", Font.BOLD, 12));
		rbYes.setActionCommand("1");
		bgMenDatory.add(rbYes);
		rbYes.setBackground(Color.WHITE);
		rbYes.setText("Yes");
		rbYes.setBounds(221, 11, 88, 18);
		PanelMendatory.add(rbYes);

		rbNo = new JRadioButton();
		rbNo.setFont(new Font("Tahoma", Font.BOLD, 12));
		rbNo.setActionCommand("0");
		bgMenDatory.add(rbNo);
		rbNo.setBackground(Color.WHITE);
		rbNo.setText("No");
		rbNo.setBounds(354, 11, 88, 18);
		PanelMendatory.add(rbNo);

		final JLabel isMendatoryLabel_1 = new JLabel();
		isMendatoryLabel_1.setFont(new Font("", Font.BOLD, 12));
		isMendatoryLabel_1.setText("IS ENABLED ?");
		isMendatoryLabel_1.setBounds(40, 45, 131, 16);
		PanelMendatory.add(isMendatoryLabel_1);

		final JLabel isMendatoryLabel_1_1 = new JLabel();
		isMendatoryLabel_1_1.setFont(new Font("", Font.BOLD, 12));
		isMendatoryLabel_1_1.setText("CHECKED ?");
		isMendatoryLabel_1_1.setBounds(40, 80, 131, 16);
		PanelMendatory.add(isMendatoryLabel_1_1);

		final JLabel isMendatoryLabel_1_2 = new JLabel();
		isMendatoryLabel_1_2.setFont(new Font("", Font.BOLD, 12));
		isMendatoryLabel_1_2.setText("SELECTED ?");
		isMendatoryLabel_1_2.setBounds(40, 117, 131, 16);
		PanelMendatory.add(isMendatoryLabel_1_2);

		rbEnabledYes = new JRadioButton();
		rbEnabledYes.setActionCommand("1");
		bgEnable.add(rbEnabledYes);
		rbEnabledYes.setFont(new Font("Tahoma", Font.BOLD, 12));
		rbEnabledYes.setBackground(Color.WHITE);
		rbEnabledYes.setText("Yes");
		rbEnabledYes.setBounds(221, 47, 88, 18);
		PanelMendatory.add(rbEnabledYes);

		rbEnabledNo = new JRadioButton();
		rbEnabledNo.setActionCommand("2");
		bgEnable.add(rbEnabledNo);
		rbEnabledNo.setFont(new Font("Tahoma", Font.BOLD, 12));
		rbEnabledNo.setBackground(Color.WHITE);
		rbEnabledNo.setText("No");
		rbEnabledNo.setBounds(354, 47, 88, 18);
		PanelMendatory.add(rbEnabledNo);

		rbCheckedYes = new JRadioButton();
		rbCheckedYes.setActionCommand("1");
		bgChecked.add(rbCheckedYes);
		rbCheckedYes.setFont(new Font("Tahoma", Font.BOLD, 12));
		rbCheckedYes.setBackground(Color.WHITE);
		rbCheckedYes.setText("Yes");
		rbCheckedYes.setBounds(221, 81, 88, 18);
		PanelMendatory.add(rbCheckedYes);

		rbCheckedNo = new JRadioButton();
		rbCheckedNo.setActionCommand("2");
		bgChecked.add(rbCheckedNo);
		rbCheckedNo.setFont(new Font("Tahoma", Font.BOLD, 12));
		rbCheckedNo.setBackground(Color.WHITE);
		rbCheckedNo.setText("No");
		rbCheckedNo.setBounds(354, 81, 88, 18);
		PanelMendatory.add(rbCheckedNo);

		rbSelectedYes = new JRadioButton();
		rbSelectedYes.setActionCommand("1");
		bgSelected.add(rbSelectedYes);
		rbSelectedYes.setFont(new Font("Tahoma", Font.BOLD, 12));
		rbSelectedYes.setBackground(Color.WHITE);
		rbSelectedYes.setText("Yes");
		rbSelectedYes.setBounds(221, 119, 88, 18);
		PanelMendatory.add(rbSelectedYes);

		rbSelectedNo = new JRadioButton();
		rbSelectedNo.setActionCommand("2");
		bgSelected.add(rbSelectedNo);
		rbSelectedNo.setFont(new Font("Tahoma", Font.BOLD, 12));
		rbSelectedNo.setBackground(Color.WHITE);
		rbSelectedNo.setText("No");
		rbSelectedNo.setBounds(354, 115, 88, 18);
		PanelMendatory.add(rbSelectedNo);

		createMap(this.comp);

		final JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.black, 2, false));
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(15, 63, 1029, 62);
		getContentPane().add(panel);

		final JLabel nameLabel = new JLabel();
		nameLabel.setForeground(Color.BLACK);
		nameLabel.setFont(new Font("", Font.BOLD, 14));
		nameLabel.setText("NAME OF THE FIELD");
		nameLabel.setBounds(308, 20, 169, 16);
		panel.add(nameLabel);

		txtName = new JTextField();
		txtName.setBounds(522, 20, 272, 20);
		panel.add(txtName);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(529, 123, 515, 25);
		getContentPane().add(panel_1);

		final JLabel relationsLabel = new JLabel();
		relationsLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		relationsLabel.setForeground(Color.WHITE);
		relationsLabel.setText("RELATIONS - I");
		panel_1.add(relationsLabel);

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(15, 318, 515, 25);
		getContentPane().add(panel_2);

		final JLabel lengthRangeLabel = new JLabel();
		lengthRangeLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lengthRangeLabel.setForeground(Color.WHITE);
		lengthRangeLabel.setText("LENGTH RANGE");
		panel_2.add(lengthRangeLabel);

		final JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.BLACK);
		panel_3.setBounds(15, 123, 515, 25);
		getContentPane().add(panel_3);

		final JLabel mandatoryCheckLabel = new JLabel();
		mandatoryCheckLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		mandatoryCheckLabel.setForeground(Color.WHITE);
		mandatoryCheckLabel.setText("MANDATORY CHECK");
		panel_3.add(mandatoryCheckLabel);

		final JLabel fieldValidationsLabel = new JLabel();
		fieldValidationsLabel.setBorder(new LineBorder(Color.black, 2, false));
		fieldValidationsLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		fieldValidationsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		fieldValidationsLabel.setText("FIELD VALIDATIONS");
		fieldValidationsLabel.setBounds(15, 10, 1029, 55);
		getContentPane().add(fieldValidationsLabel);

		final JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.black, 2, false));
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(15, 570, 1029, 53);
		getContentPane().add(panel_4);

		final JxButton saveButton = new JxButton();
		saveButton.setBounds(315, 15, 126, 28);
		panel_4.add(saveButton);
		saveButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (doValidate()) {
					doSave();
					Global.frameValidationPopUp.dispose();
				}
			}
		});
		saveButton.setArc(0.4f);
		saveButton.setBackground(Color.WHITE);
		saveButton.setText("Save");

		final JxButton cancelButton = new JxButton();
		cancelButton.setBounds(594, 15, 126, 28);
		panel_4.add(cancelButton);
		cancelButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		cancelButton.setArc(0.4f);
		cancelButton.setBackground(Color.WHITE);
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				Global.frameValidationPopUp.dispose();
			}
		});
		cancelButton.setText("Cancel");
		updateData();

		final JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.BLACK);
		panel_5.setBounds(529, 403, 515, 25);
		getContentPane().add(panel_5);

		final JLabel relationsIiLabel = new JLabel();
		relationsIiLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		relationsIiLabel.setForeground(Color.WHITE);
		relationsIiLabel.setText("RELATIONS - II");
		panel_5.add(relationsIiLabel);

		final JPanel panelRelation2 = new JPanel();
		panelRelation2.setBackground(Color.WHITE);
		panelRelation2.setBorder(new LineBorder(Color.black, 2, false));
		panelRelation2.setLayout(null);
		panelRelation2.setBounds(529, 428, 515, 62);
		getContentPane().add(panelRelation2);

		final JTextField txtIfRelation = new JTextField();
		txtIfRelation.setBounds(84, 24, 151, 21);
		panelRelation2.add(txtIfRelation);

		final JTextField textField_2 = new JTextField();
		textField_2.setBounds(414, 24, 77, 21);
		panelRelation2.add(textField_2);

		final JComboBox cmbRelation2AndOr = new JComboBox();
		cmbRelation2AndOr.setBounds(266, 23, 109, 21);
		panelRelation2.add(cmbRelation2AndOr);
		cmbRelation2AndOr.setModel(new DefaultComboBoxModel(new String[] { "",
				"AND", "OR" }));
		cmbRelation2AndOr.setBackground(Color.WHITE);
		cmbRelation2AndOr.setFont(new Font("Tahoma", Font.BOLD, 12));

		final JLabel ifLabel = new JLabel();
		ifLabel.setBounds(41, 26, 28, 14);
		panelRelation2.add(ifLabel);
		ifLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		ifLabel.setText("IF");

		final JPanel panel_7 = new JPanel();
		panel_7.setLayout(new FlowLayout());
		panel_7.setBackground(Color.BLACK);
		panel_7.setBorder(new LineBorder(Color.black, 2, false));
		panel_7.setBounds(529, 489, 515, 25);
		getContentPane().add(panel_7);

		final JLabel relationIiiLabel = new JLabel();
		relationIiiLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		relationIiiLabel.setForeground(Color.WHITE);
		relationIiiLabel.setText("RELATION - III");
		panel_7.add(relationIiiLabel);

		final JPanel panelRelation3 = new JPanel();
		panelRelation3.setLayout(null);
		panelRelation3.setBackground(Color.WHITE);
		panelRelation3.setBorder(new LineBorder(Color.black, 2, false));
		panelRelation3.setBounds(529, 513, 515, 59);
		getContentPane().add(panelRelation3);

		final JComboBox cmbRelation3AndOr = new JComboBox();
		cmbRelation3AndOr.setFont(new Font("Tahoma", Font.BOLD, 12));
		cmbRelation3AndOr.setModel(new DefaultComboBoxModel(new String[] { "",
				">     GREATER THAN", "<     LESS THAN", "=     EQUAL TO",
				">=  GREATER THAN  EQUAL", "<=   LESS THAN EQUAL" }));
		cmbRelation3AndOr.setBackground(Color.WHITE);
		cmbRelation3AndOr.setBounds(266, 20, 108, 21);
		panelRelation3.add(cmbRelation3AndOr);

		final JLabel arithematicRelationLabel = new JLabel();
		arithematicRelationLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		arithematicRelationLabel.setText("ARITHEMATIC RELATION");
		arithematicRelationLabel.setBounds(41, 23, 196, 14);
		panelRelation3.add(arithematicRelationLabel);

		final JTextField txtArithematicValue = new JTextField();
		txtArithematicValue.setBounds(414, 20, 79, 21);
		panelRelation3.add(txtArithematicValue);
	}

	private boolean doValidate() {
		boolean result = false;
		if (txtName.getText().equalsIgnoreCase("")) {
			JOptionPane.showMessageDialog(null, "You Must Provide A Name",
					"Provide A Name", JOptionPane.ERROR_MESSAGE);
			return result;
		}
		if (isPanelStringEnabled) {
			if (SwingUtils.getSelectedButton(bgLength) == 0) {
				JOptionPane.showMessageDialog(null,
						"You Must Select Range Type", "Range Error",
						JOptionPane.ERROR_MESSAGE);
				return result;
			}
			if (SwingUtils.getSelectedButton(bgLength) == 1) {
				if (txtMin.getText().equalsIgnoreCase("")) {
					JOptionPane.showMessageDialog(null,
							"You Must Provide A Minimum Range", "Range Error",
							JOptionPane.ERROR_MESSAGE);
					return result;
				} else if (txtMax.getText().equalsIgnoreCase("")) {
					JOptionPane.showMessageDialog(null,
							"You Must Provide A Maximum Range", "Range Error",
							JOptionPane.ERROR_MESSAGE);
					return result;
				}
			}
			if (SwingUtils.getSelectedButton(bgLength) == 2) {
				if (txtExact.getText().equalsIgnoreCase("")) {
					JOptionPane.showMessageDialog(null,
							"You Must Provide Exact Range", "Range Error",
							JOptionPane.ERROR_MESSAGE);
					return result;
				}
			}
		}
		result = true;
		return result;
	}

	private String createMap(JComponent myComp) {
		new HashMap<JComponent, String>();
		if (myComp instanceof JTextField) {
			dataTypeOfComp = "String";
		}
		if (myComp instanceof JCheckBox) {
			dataTypeOfComp = "boolean";
		}
		if (myComp instanceof JRadioButton) {
			dataTypeOfComp = "int";
		}
		if (myComp instanceof JTextArea) {
			dataTypeOfComp = "String";
		}
		if (myComp instanceof JComboBox) {
			dataTypeOfComp = "Object";
		}
		if (myComp instanceof JList) {
			dataTypeOfComp = "Object";
		}
		if (myComp instanceof JDateChooser) {
			dataTypeOfComp = "date";
		}
		return dataTypeOfComp;
	}

	protected void updatePanels() {
		if (SwingUtils.getSelectedButton(bgLength) == 3) {
			setAllComponentEnableDisable(panelMaxMin, false);
			setAllComponentEnableDisable(panelExact, false);
			setAllComponentEnableDisable(PanelNoLimit, true);
		} else if (SwingUtils.getSelectedButton(bgLength) == 2) {
			setAllComponentEnableDisable(panelMaxMin, false);
			setAllComponentEnableDisable(PanelNoLimit, false);
			setAllComponentEnableDisable(panelExact, true);
		} else if (SwingUtils.getSelectedButton(bgLength) == 1) {
			setAllComponentEnableDisable(PanelNoLimit, false);
			setAllComponentEnableDisable(panelExact, false);
			setAllComponentEnableDisable(panelMaxMin, true);
		}
	}

	private void updateData() {
		if (this.comp instanceof JRadioButton) {
			isPanelStringEnabled = setAllComponentEnableDisable(PanelString,
					false);
			// setAllComponentEnableDisable(panelRelation1,false);
		} else if (this.comp instanceof JTextField) {
			isPanelStringEnabled = true;
			// setAllComponentEnableDisable(panelRelation1, false);
		} else if (this.comp instanceof JComboBox) {
			isPanelStringEnabled = setAllComponentEnableDisable(PanelString,
					false);
			// setAllComponentEnableDisable(panelRelation1, false);
		} else if (this.comp instanceof JCheckBox) {
			isPanelStringEnabled = setAllComponentEnableDisable(PanelString,
					false);
			// setAllComponentEnableDisable(panelRelation1, false);
		} else if (this.comp instanceof JList) {
			isPanelStringEnabled = setAllComponentEnableDisable(PanelString,
					false);
			// setAllComponentEnableDisable(panelRelation1, false);
		} else if (this.comp instanceof JTextArea) {
			isPanelStringEnabled = true;
			// setAllComponentEnableDisable(panelRelation1, false);
		}
		SwingUtils.setSelectedButton(bgMenDatory, 1);
		SwingUtils.setSelectedButton(bgEnable, 1);
		SwingUtils.setSelectedButton(bgChecked, 1);
		SwingUtils.setSelectedButton(bgSelected, 1);
		// SwingUtils.setSelectedButton(bgLength, 3);
		updatePanels();
		// disableAllPanels();

		if (Global.currentValidationFormKey != 0) {
			// String formName= null,fullClassName= null,CompName=
			// null,dataTypeOfField= null,dataTypeOfComponent=
			// null,labelOfComponent= null,pattern= null;
			String type[] = new String[5];
			String labelOfComponent = null;
			String pattern = null;

			int i = 0;
			for (FormFieldValidation formFieldVal : formField) {
				type[i] = formFieldVal.getType();
				pattern = formFieldVal.getPattern();
				i++;
			}
			labelOfComponent = this.valformField.getLabelOfField();
			// setting the label of the component as specified by the user
			txtName.setText(labelOfComponent);
			// if validation is mandatory
			for (int j = 0; j < type.length; j++) {
				if (type[j] != null && type[j].equalsIgnoreCase("Mandatory")) {
					SwingUtils.setSelectedButton(bgMenDatory, 1);
				}
			}
			// if validation is Enabled

			for (int j = 0; j < type.length; j++) {
				if (type[j] != null && type[j].equalsIgnoreCase("Enabled")) {
					SwingUtils.setSelectedButton(bgEnable, 1);
				}
			}
			// if validation is Checked
			for (int j = 0; j < type.length; j++) {
				if (type[j] != null && type[j].equalsIgnoreCase("Checked")) {
					SwingUtils.setSelectedButton(bgChecked, 1);
				}
			}
			// if validation is Selected
			for (int j = 0; j < type.length; j++) {
				if (type[j] != null && type[j].equalsIgnoreCase("Selected")) {
					SwingUtils.setSelectedButton(bgSelected, 1);
				}
			}
			// if validation is Length Max and Minimum
			for (int j = 0; j < type.length; j++) {
				if (type[j] != null && type[j].equalsIgnoreCase("Length")) {
					SwingUtils.setSelectedButton(bgLength, 1);
					updatePanels();
					String min = pattern.substring(0, pattern.indexOf(","));
					String max = pattern.substring(pattern.indexOf(",") + 1,
							pattern.length());
					txtMin.setText(min);
					txtMax.setText(max);
				}
			}
			// if validation is Length and Exact

			for (int j = 0; j < type.length; j++) {
				if (type[j] != null && type[j].equalsIgnoreCase("Exact")) {
					SwingUtils.setSelectedButton(bgLength, 2);
					updatePanels();
					txtExact.setText(pattern);
				}
			}
			// if validation is Length and No limit
			// System.out.println("selected Type:"+type[0]+","+type[1]);
			for (int j = 0; j < type.length; j++) {
				if (type[j] != null && type[j].equalsIgnoreCase("NoLimit")) {
					SwingUtils.setSelectedButton(bgLength, 3);
					updatePanels();
				}
			}
		}
	}

	private boolean setAllComponentEnableDisable(JComponent panel,
			boolean isEnable) {
		if (panel.getComponentCount() > 0) {
			Component comps[] = panel.getComponents();
			for (Component c : comps) {
				if (c instanceof JComponent) {
					JComponent comP = (JComponent) c;
					setAllComponentEnableDisable(comP, isEnable);
					// boolean val=isParentEnabled(comP);
					c.setEnabled(isEnable);
				}
			}
		}
		return isEnable;
	}

	private boolean isParentEnabled(JComponent com) {
		boolean val = false;
		if (com.getComponentCount() > 0) {
			Component comps[] = com.getComponents();
			for (Component c : comps) {
				if (c instanceof JComponent) {
					JComponent comP = (JComponent) c;
					val = isParentEnabled(comP);
				}
			}
		}
		return val;
	}

	public String getDataTypeOfField(PanelRAFPg1 panel, String compName) {
		Map<String, String> map = panel.getPresentationMap();
		RAFPg1 ra = new RAFPg1();
		try {
			Field[] fields = ra.getClass().getDeclaredFields();
			for (Field fld : fields) {
				if (fld.getName().equalsIgnoreCase(map.get(compName))) {
					Class fieldClass = fld.getType();
					return fieldClass.getSimpleName();
				}

			}
			// f=cRA.getField(map.get(compName));
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		// return f.getType();
		return null;
	}

	public int doSave() {
		ValidationForm vfRef = validationObj;

		ValidationFormField validationFormFld = null;
		if (this.valformField == null) {
			validationFormFld = new ValidationFormField();
			validationFormFld.setComponentName(this.nameOfComp);
			validationFormFld.setDataTyeOfField(getDataTypeOfField(
					(PanelRAFPg1) currentPanel, nameOfComp));
			validationFormFld.setDataTypeOfComponent(dataTypeOfComp);
			// validationFormFld.setTypeOfComponent(this.comp.getName());
			validationFormFld.setLabelOfField(txtName.getText());
			validationFormFld.getValidationFormFields().clear();
		} else {
			validationFormFld = this.valformField;
			validationFormFld.setLabelOfField(txtName.getText());
			validationFormFld.getValidationFormFields().clear();
		}
		FormFieldValidation formFieldValidation = null;

		if (SwingUtils.getSelectedButton(bgMenDatory) == 1) {
			formFieldValidation = new FormFieldValidation();
			formFieldValidation.setMessage("my Message");
			formFieldValidation.setType("Mandatory");
			validationFormFld.getValidationFormFields()
					.add(formFieldValidation);
		}
		if (SwingUtils.getSelectedButton(bgEnable) == 1) {
			formFieldValidation = new FormFieldValidation();
			formFieldValidation.setMessage("my Message");
			formFieldValidation.setType("Enabled");
			validationFormFld.getValidationFormFields()
					.add(formFieldValidation);
		}
		if (SwingUtils.getSelectedButton(bgChecked) == 1) {
			formFieldValidation = new FormFieldValidation();
			formFieldValidation.setMessage("my Message");
			formFieldValidation.setType("Checked");
			validationFormFld.getValidationFormFields()
					.add(formFieldValidation);
		}
		if (SwingUtils.getSelectedButton(bgSelected) == 1) {
			formFieldValidation = new FormFieldValidation();
			formFieldValidation.setMessage("my Message");
			formFieldValidation.setType("Selected");
			validationFormFld.getValidationFormFields()
					.add(formFieldValidation);
		}
		if ((SwingUtils.getSelectedButton(bgLength) == 1)
				|| (SwingUtils.getSelectedButton(bgLength) == 2)
				|| (SwingUtils.getSelectedButton(bgLength) == 3)) {
			formFieldValidation = new FormFieldValidation();
			formFieldValidation.setMessage("my Message");
			if ((SwingUtils.getSelectedButton(bgLength) == 1)) {
				String range = (txtMin.getText() + "," + txtMax.getText());
				formFieldValidation.setType("Length");
				formFieldValidation.setPattern(range);
			} else if (SwingUtils.getSelectedButton(bgLength) == 2) {
				String range = (txtExact.getText());
				formFieldValidation.setType("Exact");
				formFieldValidation.setPattern(range);
			} else if (SwingUtils.getSelectedButton(bgLength) == 3) {
				formFieldValidation.setType("NoLimit");
			}
			validationFormFld.getValidationFormFields()
					.add(formFieldValidation);
		}
		if ((vfRef.getValidationFormFields().size() > 0)
				&& (this.validationFormFieldIndex != -1)) {
			vfRef.getValidationFormFields().remove(
					this.validationFormFieldIndex);
			vfRef.getValidationFormFields().add(this.validationFormFieldIndex,
					validationFormFld);
		} else {
			vfRef.getValidationFormFields().add(validationFormFld);
		}
		try {
			Global.currentValidationFormKey = MedrexClientManager.getInstance()
					.insertOrUpdateValidationForm(vfRef);

		} catch (RemoteException e) {

			e.printStackTrace();
		} catch (MedrexException e) {

			e.printStackTrace();
		}
		return Global.currentValidationFormKey;

	}
}
