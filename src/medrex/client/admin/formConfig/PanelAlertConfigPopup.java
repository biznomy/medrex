package medrex.client.admin.formConfig;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
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
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.text.JTextComponent;

import medrex.client.admin.formConfig.validationParser.Condition;
import medrex.client.admin.formConfig.validationParser.ConstraintItem;
import medrex.client.admin.formConfig.validationParser.ConstraintSet;
import medrex.client.admin.formConfig.validationParser.Operand;
import medrex.client.admin.formConfig.validationParser.Operator;
import medrex.client.admin.formConfig.validationParser.ValidationParser;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.activity.PanelActivityAssessmentFormPage2;
import medrex.client.main.activity.PanelActivityInitialAssessmentFormPage1;
import medrex.client.test.ra.ui.PanelRAFPg1;
import medrex.client.utils.FieldFormatter;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.activity.ActivityAssessmentFormPage2;
import medrex.commons.vo.activity.ActivityInitialAssessmentFormPage1;
import medrex.commons.vo.admission.validation.FormFieldValidation;
import medrex.commons.vo.admission.validation.ValidationForm;
import medrex.commons.vo.admission.validation.ValidationFormField;
import medrex.commons.vo.alert.FormConfigAlert;
import medrex.commons.vo.ra.RAFPg1;

import com.sX.swing.JxButton;
import com.toedter.calendar.JDateChooser;

/**
 * 
 * @author Mayank Chandela
 * 
 *         This class represents a popup window , which opens whenever we click
 *         a component inside a form page opened in form config window or
 *         internal frame. after getting type of validation for different
 *         components we save a validation object in the database, representing
 *         validation that must be applied to the field when it is opened in the
 *         real form view in resident screen.
 * 
 *         Validation class is the parent class having one to many relation with
 *         validationformField. validationformField is having same one to many
 *         relation with FormFieldValidation. ValidationFormField Validation is
 *         also holding an object for alertConfigPopUp.
 */
public class PanelAlertConfigPopup extends PopUpView {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4785823188585130983L;
	private JComboBox cmbModelCombo;
	private JPanel panelOptions;
	private JCheckBox cbCarePlan;
	private JPanel panelConstraint;
	private JPanel panelArithematicRelation;
	private JPanel panelLengthRange;
	/* private JPanel panelSelected; */
	private JPanel panelChecked;
	private JPanel panelAlpha;
	private JPanel panelEnabled;
	private JPanel panelMandatory;
	private JFormattedTextField txtArithematicValue;
	private JComboBox cmbRelation3AndOr;
	private JRadioButton rbNotSelected;
	private JRadioButton rbSelected;
	private JRadioButton rbNotChecked;
	private JRadioButton rbChecked;
	private JRadioButton rbAlphaNumeric;
	private JRadioButton rbNumeric;
	private JRadioButton rbAlpha;
	private JRadioButton rbNotEnabled;
	private JRadioButton rbEnabled;
	private JRadioButton rbNotMandatory;
	private JRadioButton rbMandatory;
	private ButtonGroup bgAlpha = new ButtonGroup();
	private static final Color DEF_COLOR = new Color(49, 104, 127);
	private static final Color BORDER_COL = new Color(180, 188, 193);
	private ButtonGroup bgLength = new ButtonGroup();
	private ButtonGroup bgMenDatory = new ButtonGroup();
	private ButtonGroup bgEnable = new ButtonGroup();
	private ButtonGroup bgChecked = new ButtonGroup();
	private ButtonGroup bgSelected = new ButtonGroup();
	private JPanel panelMaxMin;
	private JFormattedTextField txtMax;
	private JFormattedTextField txtMin;
	private JPanel panelExact;
	private JFormattedTextField txtExact;
	private JPanel PanelNoLimit;
	private JRadioButton rbMaxMin;
	private JRadioButton rbExact;
	private JRadioButton rbNoLimit;
	private JPanel panelString;
	private JxButton btnSave;
	private JxButton btnAlertInfo;
	private JxButton btnCancel;
	private JComboBox cmbConstraint;
	private JTextField txtConstraintValue;
	private JTextArea txtRelation;
	private int validationFormFieldIndex;
	private Object comp;
	private String nameOfComp;
	private JPanel currentPanel;
	private ValidationForm validationObj;
	private List<FormFieldValidation> formField;
	private ValidationFormField valformField;
	private PanelAlertConfigPopup thisPanel;
	private ArrayList<Condition> strList = new ArrayList<Condition>();
	private Condition[] cmbValues;
	private String dataTypeOfComp;
	private boolean isPanelLengthEnabled;
	private FormConfigAlert alertObj;
	private JLabel nameLabel;
	private ComboBoxModel comboModel;
	private String bgName;
	private ConstraintSet constraintSet;
	private JxButton andButton;
	private JCheckBox[] cbOptions;
	protected String fieldType;

	@Override
	public String getTitle() {
		return "Form Config";
	}

	@SuppressWarnings("unchecked")
	/*
	 * @author mayank chandela
	 * 
	 * @param index - index is the selected row number from the JTable in which
	 * all the validation displays reqCom - reqCom is the required component on
	 * which changes have to be performed or on which component we want to apply
	 * validation nameofComp - name of the component so clicked but its of no
	 * use as far as this class code is concerned. currentPanel - current panel
	 * on which this particular component resides. validationObj2 - validation
	 * parent class object which contains validationFormField object formField -
	 * representing formField validationformField - representing
	 * ValidationFormField bgName - name of button group if the component
	 * clicked is a radio button.
	 */
	public PanelAlertConfigPopup(final int index, Object reqCom,
			String nameOfComp, JPanel currentPanel,
			ValidationForm validationObj2, Object formField,
			Object valFormField, String bgName) {
		super();
		addAncestorListener(new AncestorListener() {
			public void ancestorAdded(final AncestorEvent event) {
			}

			public void ancestorMoved(final AncestorEvent event) {
			}

			public void ancestorRemoved(final AncestorEvent event) {
				Global.panelFormConfigAlert = null;
			}
		});

		setLayout(new BorderLayout());
		setSize(500, 640);
		thisPanel = this;
		this.validationFormFieldIndex = index;
		this.comp = reqCom;
		this.nameOfComp = nameOfComp;
		this.currentPanel = currentPanel;
		this.validationObj = validationObj2;
		this.formField = (List<FormFieldValidation>) formField;
		this.valformField = (ValidationFormField) valFormField;
		if (this.valformField != null) {
			this.alertObj = this.valformField.getAlert();
		} else {
			this.alertObj = null;
		}

		this.bgName = bgName;
		final JPanel panel = new JPanel();
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		panel.setLayout(flowLayout);
		panel.setPreferredSize(new Dimension(500, 800));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 500, 400);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel.add(panel_1);
		panel_1.setBackground(Color.WHITE);
		panel_1.setPreferredSize(new Dimension(490, 40));

		final JLabel formConfigLabel = new JLabel();
		formConfigLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		formConfigLabel.setForeground(ColorConstants.DEF_COLOR);
		formConfigLabel.setHorizontalAlignment(SwingConstants.CENTER);
		formConfigLabel.setBounds(211, 0, 108, 34);
		formConfigLabel.setText("Form Config");
		panel_1.add(formConfigLabel);

		cbCarePlan = new JCheckBox();
		cbCarePlan.setOpaque(false);
		cbCarePlan.setForeground(DEF_COLOR);
		cbCarePlan.setFont(new Font("Dialog", Font.BOLD, 14));
		cbCarePlan.setText("Care Plan");
		cbCarePlan.setBounds(387, 4, 103, 30);
		panel_1.add(cbCarePlan);

		nameLabel = new JLabel();
		nameLabel.setBounds(10, 10, 195, 16);
		panel_1.add(nameLabel);
		nameLabel.setForeground(ColorConstants.DEF_COLOR);
		nameLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		nameLabel.setText("Name");

		panelOptions = new JPanel();
		panelOptions.setLayout(null);
		panelOptions.setBackground(Color.WHITE);
		panelOptions.setPreferredSize(new Dimension(490, 80));
		panel.add(panelOptions);

		final JLabel optionsLabel = new JLabel();
		optionsLabel.setForeground(ColorConstants.DEF_COLOR);
		optionsLabel.setFont(new Font("", Font.BOLD, 12));
		optionsLabel.setText("Options : ");
		optionsLabel.setBounds(10, 10, 89, 16);
		panelOptions.add(optionsLabel);

		/*
		 * labelOptions = new JLabel();
		 * labelOptions.setForeground(ColorConstants.DEF_COLOR);
		 * labelOptions.setFont(new Font("", Font.BOLD, 12));
		 * labelOptions.setText("New JLabel"); labelOptions.setBounds(129, 10,
		 * 351, 60); panelOptions.add(labelOptions);
		 */

		panelMandatory = new JPanel();
		panelMandatory.setPreferredSize(new Dimension(490, 30));
		panelMandatory.setLayout(null);
		panelMandatory.setBackground(Color.WHITE);
		panel.add(panelMandatory);

		rbMandatory = new JRadioButton();
		rbMandatory.setSelected(false);
		rbMandatory.setBounds(90, 5, 113, 18);
		rbMandatory.setForeground(DEF_COLOR);
		rbMandatory.setFont(new Font("Tahoma", Font.BOLD, 12));
		rbMandatory.setActionCommand("1");
		bgMenDatory.add(rbMandatory);
		rbMandatory.setBackground(Color.WHITE);
		rbMandatory.setText("Mandatory");
		panelMandatory.add(rbMandatory);

		rbNotMandatory = new JRadioButton();
		rbNotMandatory.setBounds(240, 5, 134, 18);
		rbNotMandatory.setForeground(DEF_COLOR);
		rbNotMandatory.setFont(new Font("Tahoma", Font.BOLD, 12));
		rbNotMandatory.setActionCommand("0");
		bgMenDatory.add(rbNotMandatory);
		rbNotMandatory.setBackground(Color.WHITE);
		rbNotMandatory.setText("NotMandatory");
		panelMandatory.add(rbNotMandatory);

		panelEnabled = new JPanel();
		panelEnabled.setPreferredSize(new Dimension(490, 30));
		panelEnabled.setBackground(Color.WHITE);
		panelEnabled.setLayout(null);
		panel.add(panelEnabled);

		rbEnabled = new JRadioButton();
		rbEnabled.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (rbEnabled.isSelected()) {
					if (thisPanel.comp instanceof JTextComponent) {
						panelAlpha.setVisible(true);
						// rbAlpha.setSelected(false);
						// rbAlphaNumeric.setSelected(false);
						// rbNumeric.setSelected(false);
						SwingUtils.setSelectedButton(bgAlpha, 0);
						System.out.println(SwingUtils
								.getSelectedButton(bgAlpha));
					} else if (thisPanel.comp instanceof JCheckBox) {
						thisPanel.panelChecked.setVisible(true);
					} else if (thisPanel.comp instanceof JComboBox) {
						thisPanel.panelConstraint.setVisible(true);
					} else if (thisPanel.comp instanceof ButtonGroup) {
						panelOptions.setVisible(true);
					}
				}
			}
		});
		rbEnabled.setSelected(false);
		rbEnabled.setForeground(DEF_COLOR);
		rbEnabled.setFont(new Font("Tahoma", Font.BOLD, 12));
		rbEnabled.setActionCommand("1");
		bgEnable.add(rbEnabled);
		rbEnabled.setBackground(Color.WHITE);
		rbEnabled.setText("Enabled");
		rbEnabled.setBounds(90, 5, 99, 18);
		panelEnabled.add(rbEnabled);

		rbNotEnabled = new JRadioButton();
		rbNotEnabled.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				rbNotMandatory.setSelected(true);
				panelAlpha.setVisible(false);
				panelArithematicRelation.setVisible(false);
				panelChecked.setVisible(false);
				panelConstraint.setVisible(false);
				panelLengthRange.setVisible(false);
				if (rbNotEnabled.isSelected()) {
					if (thisPanel.comp instanceof JTextComponent) {
						// rbAlpha.setSelected(false);
						// rbAlphaNumeric.setSelected(false);
						// rbNumeric.setSelected(false);
						// SwingUtils.setSelectedButton(bgAlpha, 0);
						// System.out.println(SwingUtils.getSelectedButton(bgAlpha));
					}
					if (thisPanel.comp instanceof ButtonGroup) {
						for (int i = 0; i < cbOptions.length; i++)
							cbOptions[i].setSelected(false);
						panelOptions.setVisible(false);
					}
				}
			}
		});
		rbNotEnabled.setForeground(DEF_COLOR);
		rbNotEnabled.setFont(new Font("Tahoma", Font.BOLD, 12));
		rbNotEnabled.setActionCommand("0");
		bgEnable.add(rbNotEnabled);
		rbNotEnabled.setBackground(Color.WHITE);
		rbNotEnabled.setText("Disabled");
		rbNotEnabled.setBounds(240, 5, 154, 18);
		panelEnabled.add(rbNotEnabled);

		panelAlpha = new JPanel();
		panelAlpha.setBackground(Color.WHITE);
		panel.add(panelAlpha);
		panelAlpha.setLayout(null);
		panelAlpha.setPreferredSize(new Dimension(490, 80));

		rbAlpha = new JRadioButton();
		rbAlpha.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				fieldType = "Alpha";
				fillCombos(comp, fieldType);
				panelArithematicRelation.setVisible(false);
				panelLengthRange.setVisible(true);
				panelConstraint.setVisible(true);
			}
		});
		rbAlpha.setSelected(false);
		rbAlpha.setActionCommand("1");
		SwingUtils.setSelectedButton(bgAlpha, 1);
		bgAlpha.add(rbAlpha);
		rbAlpha.setForeground(ColorConstants.DEF_COLOR);
		rbAlpha.setBackground(Color.WHITE);
		rbAlpha.setText("Alpha");
		rbAlpha.setBounds(173, 5, 99, 18);
		panelAlpha.add(rbAlpha);

		rbNumeric = new JRadioButton();
		rbNumeric.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				fieldType = "Numeric";
				fillCombos(comp, fieldType);
				panelArithematicRelation.setVisible(false);
				panelLengthRange.setVisible(false);
				panelConstraint.setVisible(true);
			}
		});
		rbNumeric.setActionCommand("2");
		bgAlpha.add(rbNumeric);
		rbNumeric.setBackground(Color.WHITE);
		rbNumeric.setForeground(ColorConstants.DEF_COLOR);
		rbNumeric.setText("Numeric");
		rbNumeric.setBounds(173, 29, 117, 18);
		panelAlpha.add(rbNumeric);

		rbAlphaNumeric = new JRadioButton();
		rbAlphaNumeric.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				panelArithematicRelation.setVisible(false);
				panelLengthRange.setVisible(true);
				fieldType = "Alpha Numeric";
				fillCombos(comp, fieldType);
				panelConstraint.setVisible(true);
			}
		});
		rbAlphaNumeric.setActionCommand("3");
		bgAlpha.add(rbAlphaNumeric);
		rbAlphaNumeric.setForeground(ColorConstants.DEF_COLOR);
		rbAlphaNumeric.setBackground(Color.WHITE);
		rbAlphaNumeric.setText("Alpha Numeric");
		rbAlphaNumeric.setBounds(173, 53, 117, 18);
		panelAlpha.add(rbAlphaNumeric);

		panelChecked = new JPanel();
		panelChecked.setPreferredSize(new Dimension(490, 30));
		panelChecked.setBackground(Color.WHITE);
		panelChecked.setLayout(null);
		panel.add(panelChecked);

		rbChecked = new JRadioButton();
		rbChecked.setSelected(false);
		rbChecked.setForeground(DEF_COLOR);
		rbChecked.setFont(new Font("Tahoma", Font.BOLD, 12));
		rbChecked.setActionCommand("1");
		bgChecked.add(rbChecked);
		rbChecked.setBackground(Color.WHITE);
		rbChecked.setText("Checked");
		rbChecked.setBounds(90, 5, 99, 18);
		panelChecked.add(rbChecked);

		rbNotChecked = new JRadioButton();
		rbNotChecked.setForeground(DEF_COLOR);
		rbNotChecked.setFont(new Font("Tahoma", Font.BOLD, 12));
		rbNotChecked.setActionCommand("0");
		bgChecked.add(rbNotChecked);
		rbNotChecked.setBackground(Color.WHITE);
		rbNotChecked.setText("Not Checked");
		rbNotChecked.setBounds(240, 5, 117, 18);
		panelChecked.add(rbNotChecked);

		/*
		 * panelSelected = new JPanel();
		 * panelSelected.setBackground(Color.WHITE);
		 * panelSelected.setLayout(null); panelSelected.setPreferredSize(new
		 * Dimension(490, 30)); panel.add(panelSelected);
		 * 
		 * rbSelected = new JRadioButton(); rbSelected.setSelected(false);
		 * rbSelected.setForeground(DEF_COLOR); rbSelected.setFont(new
		 * Font("Tahoma", Font.BOLD, 12)); rbSelected.setActionCommand("1");
		 * bgSelected.add(rbSelected); rbSelected.setBackground(Color.WHITE);
		 * rbSelected.setText("Selected"); rbSelected.setBounds(90, 0, 95, 24);
		 * panelSelected.add(rbSelected);
		 * 
		 * rbNotSelected = new JRadioButton();
		 * rbNotSelected.setForeground(DEF_COLOR); rbNotSelected.setFont(new
		 * Font("Tahoma", Font.BOLD, 12)); rbNotSelected.setActionCommand("0");
		 * bgSelected.add(rbNotSelected);
		 * rbNotSelected.setBackground(Color.WHITE);
		 * rbNotSelected.setText("Not Selected"); rbNotSelected.setBounds(240,
		 * 0, 129, 24); panelSelected.add(rbNotSelected);
		 */

		panelLengthRange = new JPanel();
		panelLengthRange.setLayout(null);
		panelLengthRange.setBackground(Color.WHITE);
		panelLengthRange.setPreferredSize(new Dimension(490, 220));
		panel.add(panelLengthRange);

		final JPanel panel_8 = new JPanel();
		panel_8.setOpaque(false);
		panel_8.setLayout(null);
		panel_8.setBounds(0, 0, 490, 29);
		panelLengthRange.add(panel_8);

		final JLabel lengthLabel = new JLabel();
		lengthLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lengthLabel.setForeground(DEF_COLOR);
		lengthLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lengthLabel.setText("Length Range");
		lengthLabel.setBounds(146, 0, 186, 29);
		panel_8.add(lengthLabel);

		panelString = new JPanel();
		panelString.setPreferredSize(new Dimension(490, 30));
		panelLengthRange.add(panelString);
		panelString
				.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 2, false));
		panelString.setLayout(null);
		panelString.setBackground(Color.WHITE);
		panelString.setBounds(10, 27, 470, 183);

		panelMaxMin = new JPanel();
		panelMaxMin.setBackground(Color.WHITE);
		panelMaxMin.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, false));
		panelMaxMin.setLayout(null);
		panelMaxMin.setBounds(60, 5, 369, 53);
		panelString.add(panelMaxMin);

		final JLabel maxLengthLabel = new JLabel();
		maxLengthLabel.setForeground(ColorConstants.DEF_COLOR);
		maxLengthLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		maxLengthLabel.setText("Max Length");
		maxLengthLabel.setBounds(231, 5, 79, 14);
		panelMaxMin.add(maxLengthLabel);

		final JLabel minLengthLabel = new JLabel();
		minLengthLabel.setForeground(ColorConstants.DEF_COLOR);
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
		panelExact.setBounds(60, 70, 369, 44);
		panelString.add(panelExact);

		final JLabel exactLengthLabel = new JLabel();
		exactLengthLabel.setForeground(ColorConstants.DEF_COLOR);
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
		PanelNoLimit.setBounds(60, 130, 369, 33);
		panelString.add(PanelNoLimit);

		final JLabel noLimitLabel = new JLabel();
		noLimitLabel.setForeground(ColorConstants.DEF_COLOR);
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
		rbMaxMin.setBounds(25, 30, 29, 18);
		panelString.add(rbMaxMin);

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
		rbExact.setBounds(25, 80, 29, 18);
		panelString.add(rbExact);

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
		rbNoLimit.setBounds(25, 140, 29, 18);
		panelString.add(rbNoLimit);

		panelArithematicRelation = new JPanel();
		panelArithematicRelation.setLayout(null);
		panelArithematicRelation.setOpaque(false);
		panelArithematicRelation.setPreferredSize(new Dimension(490, 30));
		panel.add(panelArithematicRelation);

		cmbRelation3AndOr = new JComboBox();
		cmbRelation3AndOr.setFont(new Font("Tahoma", Font.BOLD, 12));
		cmbRelation3AndOr.setModel(new DefaultComboBoxModel(new String[] { "",
				">GREATER THAN", "<LESS THAN", "=EQUAL TO",
				">=GREATER THAN EQUAL", "<=LESS THAN EQUAL" }));
		cmbRelation3AndOr.setBackground(Color.WHITE);
		cmbRelation3AndOr.setForeground(ColorConstants.DEF_COLOR);
		cmbRelation3AndOr.setBounds(180, 5, 173, 18);
		panelArithematicRelation.add(cmbRelation3AndOr);

		final JLabel arithematicRelationLabel = new JLabel();
		arithematicRelationLabel.setForeground(ColorConstants.DEF_COLOR);
		arithematicRelationLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		arithematicRelationLabel.setText("ARITHEMATIC RELATION");
		arithematicRelationLabel.setBounds(25, 5, 151, 15);
		panelArithematicRelation.add(arithematicRelationLabel);

		txtArithematicValue = new JFormattedTextField(FieldFormatter.MAX4);
		txtArithematicValue.setBounds(360, 5, 89, 18);
		panelArithematicRelation.add(txtArithematicValue);

		panelConstraint = new JPanel();
		panelConstraint.setLayout(null);
		panelConstraint.setOpaque(false);
		panelConstraint.setPreferredSize(new Dimension(490, 210));
		panel.add(panelConstraint);

		cmbConstraint = new JComboBox();
		cmbConstraint.setFont(new Font("Tahoma", Font.BOLD, 12));
		cmbConstraint.setBackground(Color.WHITE);
		cmbConstraint.setBounds(183, 24, 229, 19);
		cmbConstraint.setForeground(ColorConstants.DEF_COLOR);
		panelConstraint.add(cmbConstraint);

		final JLabel valueLabel = new JLabel();
		valueLabel.setForeground(ColorConstants.DEF_COLOR);
		valueLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		valueLabel.setText("CONSTRAINTS");
		valueLabel.setBounds(25, 26, 100, 14);
		panelConstraint.add(valueLabel);

		andButton = new JxButton();
		andButton.addActionListener(new ActionListener() {

			public void actionPerformed(final ActionEvent arg0) {
				if (cmbConstraint.getSelectedItem().toString()
						.equalsIgnoreCase("")) {
					JOptionPane.showMessageDialog(null,
							"Must Select A Constraint", "Constraint",
							JOptionPane.ERROR_MESSAGE);
					return;
				} else if (txtConstraintValue.getText().equalsIgnoreCase("")
						&& txtConstraintValue.isVisible()) {
					JOptionPane.showMessageDialog(null,
							"Must Give A Constraint Value", "Value",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				Object selValue = cmbConstraint.getSelectedItem();
				// if(constraintSet == null){
				constraintSet = getInstanceOfConstraintSet();
				// }
				if (constraintSet.isOperand()) {
					constraintSet = new ConstraintSet();
					txtRelation.setText(constraintSet + "");
				}
				if (txtConstraintValue.isVisible()) {
					if (selValue instanceof Condition) {
						constraintSet.addOperand((Condition) selValue,
								txtConstraintValue.getText());
						constraintSet.addOperator(Operator.AND);
						txtRelation.setText(constraintSet + "");
					}
				}
				cmbConstraint.setSelectedIndex(0);
				txtConstraintValue.setText("");
				if (cmbModelCombo.isVisible()) {
					if (cmbModelCombo.getSelectedIndex() == 0
							&& cmbModelCombo.isVisible()) {
						JOptionPane.showMessageDialog(null,
								"Must Select A Constraint Value", "Value",
								JOptionPane.ERROR_MESSAGE);
						return;
					}
					if (selValue instanceof Condition) {
						constraintSet.addOperand((Condition) selValue,
								cmbModelCombo.getSelectedItem().toString());
						constraintSet.addOperator(Operator.AND);
						txtRelation.setText(constraintSet + "");
						cmbModelCombo.setSelectedIndex(0);
					}
				}
				removeFromCombo();
			}

		});
		andButton.setArc(0.4f);
		andButton.setBackground(Color.WHITE);
		andButton.setForeground(DEF_COLOR);
		andButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		andButton.setText("AND");
		andButton.setBounds(152, 107, 56, 26);
		panelConstraint.add(andButton);

		final JxButton orButton = new JxButton();
		orButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (cmbConstraint.getSelectedItem().toString()
						.equalsIgnoreCase("")) {
					JOptionPane.showMessageDialog(null,
							"Must Select A Constraint", "Constraint",
							JOptionPane.ERROR_MESSAGE);
					return;
				} else if (txtConstraintValue.getText().equalsIgnoreCase("")
						&& txtConstraintValue.isVisible()) {
					JOptionPane.showMessageDialog(null,
							"Must Select A Constraint Value", "Value",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				Object selValue = cmbConstraint.getSelectedItem();

				constraintSet = getInstanceOfConstraintSet();

				if (constraintSet.isOperand()) {
					constraintSet = new ConstraintSet();
					txtRelation.setText(constraintSet + "");
				}
				if (txtConstraintValue.isVisible()
						&& PanelAlertConfigPopup.this.comp instanceof JTextComponent) {
					if (selValue instanceof Condition) {
						constraintSet.addOperand((Condition) selValue,
								txtConstraintValue.getText());
						constraintSet.addOperator(Operator.OR);
						txtRelation.setText(constraintSet + "");
					}
				}
				if (cmbModelCombo.isVisible()
						&& PanelAlertConfigPopup.this.comp instanceof JComboBox) {
					if (cmbModelCombo.getSelectedIndex() == 0
							&& cmbModelCombo.isVisible()) {
						JOptionPane.showMessageDialog(null,
								"Must Select A Constraint Value", "Value",
								JOptionPane.ERROR_MESSAGE);
						return;
					}
					if (selValue instanceof Condition) {
						constraintSet.addOperand((Condition) selValue,
								cmbModelCombo.getSelectedItem().toString());
						constraintSet.addOperator(Operator.OR);
						txtRelation.setText(constraintSet + "");
						cmbModelCombo.setSelectedIndex(0);
					}
				}
				cmbConstraint.setSelectedIndex(0);
				txtConstraintValue.setText("");
				cmbConstraint.setModel(new DefaultComboBoxModel(cmbValues));
				strList.clear();
				for (int i = 0; i < cmbValues.length; i++) {
					strList.add(cmbValues[i]);
				}
				cmbConstraint.setModel(new DefaultComboBoxModel(cmbValues));
			}
		});
		orButton.setArc(0.4f);
		orButton.setBackground(Color.WHITE);
		orButton.setForeground(DEF_COLOR);
		orButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		orButton.setText("OR");
		orButton.setBounds(226, 107, 56, 26);
		panelConstraint.add(orButton);

		final JLabel valueLabel_1 = new JLabel();
		valueLabel_1.setForeground(ColorConstants.DEF_COLOR);
		valueLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		valueLabel_1.setText("RELATION");
		valueLabel_1.setBounds(25, 110, 100, 14);
		panelConstraint.add(valueLabel_1);

		final JxButton clearButton = new JxButton();
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				constraintSet = null;
				txtRelation.setText("");
				fillCombos(PanelAlertConfigPopup.this.comp, fieldType);

			}
		});
		clearButton.setArc(0.4f);
		clearButton.setBackground(Color.WHITE);
		clearButton.setForeground(DEF_COLOR);
		clearButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		clearButton.setText("CLEAR");
		clearButton.setBounds(374, 107, 56, 26);
		panelConstraint.add(clearButton);

		final JLabel valueLabel_1_1 = new JLabel();
		valueLabel_1_1.setForeground(ColorConstants.DEF_COLOR);
		valueLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		valueLabel_1_1.setText("VALUE");
		valueLabel_1_1.setBounds(25, 69, 92, 14);
		panelConstraint.add(valueLabel_1_1);

		txtConstraintValue = new JTextField();
		txtConstraintValue.setBounds(183, 66, 229, 21);
		panelConstraint.add(txtConstraintValue);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 140, 423, 47);
		panelConstraint.add(scrollPane);

		txtRelation = new JTextArea();
		txtRelation.setBorder(new LineBorder(new Color(0, 102, 102), 1, false));
		scrollPane.setViewportView(txtRelation);

		final JxButton okButton = new JxButton();
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				constraintSet = getInstanceOfConstraintSet();
				if (thisPanel.comp instanceof JTextComponent) {

					if (cmbConstraint.getSelectedItem().toString()
							.equalsIgnoreCase("")) {
						if (!constraintSet.isEmpty())
							constraintSet.validate();
						txtRelation.setText(constraintSet + "");
						txtConstraintValue.setText("");
						fillCombos(PanelAlertConfigPopup.this.comp, fieldType);
					} else {
						Operand op = new Operand();
						Object obj = cmbConstraint.getSelectedItem();
						if (obj instanceof Condition)
							op.setCondition((Condition) obj);
						op.setValue(txtConstraintValue.getText());
						constraintSet.addOperand(op);
						if (!constraintSet.isEmpty())
							constraintSet.validate();
						txtRelation.setText(constraintSet + "");
						fillCombos(PanelAlertConfigPopup.this.comp, fieldType);
						txtConstraintValue.setText("");
					}
				} else if (thisPanel.comp instanceof JComboBox) {
					if (cmbConstraint.getSelectedItem().toString()
							.equalsIgnoreCase("")) {
						if (!constraintSet.isEmpty())
							constraintSet.validate();
						txtRelation.setText(constraintSet + "");
						cmbModelCombo.setSelectedIndex(0);
						fillCombos(PanelAlertConfigPopup.this.comp, fieldType);
					} else {
						Operand op = new Operand();
						Object obj = cmbConstraint.getSelectedItem();
						if (obj instanceof Condition)
							op.setCondition((Condition) obj);
						op.setValue(cmbModelCombo.getSelectedItem().toString());
						constraintSet.addOperand(op);
						if (!constraintSet.isEmpty())
							constraintSet.validate();
						txtRelation.setText(constraintSet + "");
						cmbModelCombo.setSelectedIndex(0);
						fillCombos(PanelAlertConfigPopup.this.comp, fieldType);
					}
				}
			}
		});
		okButton.setBackground(Color.WHITE);
		okButton.setForeground(DEF_COLOR);
		okButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		okButton.setArc(0.4f);
		okButton.setText("OK");
		okButton.setBounds(300, 107, 56, 26);
		panelConstraint.add(okButton);

		cmbModelCombo = new JComboBox();
		cmbModelCombo.setBackground(Color.WHITE);
		cmbModelCombo.setForeground(ColorConstants.DEF_COLOR);
		cmbModelCombo.setFont(new Font("Tahoma", Font.BOLD, 12));
		cmbModelCombo.setBackground(Color.WHITE);
		cmbModelCombo.setBounds(183, 64, 229, 19);
		panelConstraint.add(cmbModelCombo);

		final JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setOpaque(false);
		panel_7.setPreferredSize(new Dimension(490, 35));
		panel.add(panel_7);

		btnSave = new JxButton();
		btnSave.setBounds(25, 5, 100, 25);
		panel_7.add(btnSave);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				// if(doValidate()){
				doSave();
				close();
				// }
			}
		});
		btnSave.setText("Save");
		btnSave.setArc(0.4f);
		btnSave.setBackground(Color.WHITE);
		btnSave.setForeground(DEF_COLOR);
		btnSave.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnSave.setFont(new Font("", Font.BOLD, 12));

		btnCancel = new JxButton();
		btnCancel.setBounds(180, 5, 100, 25);
		panel_7.add(btnCancel);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				// if (doSave()) {
				close();
				Global.panelFormConfigAlert = null;
				// }
			}
		});
		btnCancel.setText("Cancel");
		btnCancel.setArc(0.4f);
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setForeground(DEF_COLOR);
		btnCancel.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnCancel.setFont(new Font("", Font.BOLD, 12));

		btnAlertInfo = new JxButton();
		btnAlertInfo.setBounds(350, 5, 100, 25);
		panel_7.add(btnAlertInfo);
		btnAlertInfo.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				if (Global.panelFormConfigAlert != null) {
					FormConfigAlert alert = Global.panelFormConfigAlert
							.getAlertObj();
					PanelFormConfigAlertInfo alertInfo = new PanelFormConfigAlertInfo(
							alert, nameLabel.getText());
					SwingUtils.openInDialog(alertInfo);
				} else {
					PanelFormConfigAlertInfo alertInfo = new PanelFormConfigAlertInfo(
							alertObj, nameLabel.getText());
					SwingUtils.openInDialog(alertInfo);
				}
			}
		});
		btnAlertInfo.setText("Alert Info");
		btnAlertInfo.setArc(0.4f);
		btnAlertInfo.setBackground(Color.WHITE);
		btnAlertInfo.setForeground(DEF_COLOR);
		btnAlertInfo.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnAlertInfo.setFont(new Font("", Font.BOLD, 12));
		createMap(this.comp);
		doUpdate();
	}

	private void sop() {
		if (rbAlpha != null) {
			System.out.println(rbAlpha.isSelected());
		}
		if (rbNumeric != null) {
			System.out.println(rbNumeric.isSelected());
		}
		if (rbAlphaNumeric != null) {
			System.out.println(rbAlphaNumeric.isSelected());
		}
		System.out.println();
	}

	/**
	 * this method checks the type of the component clicked and based upon the
	 * type of the component clicked set different properties of the panels like
	 * to be set visible / enabled or not
	 */
	private void doUpdate() {
		// nameOfField = getFieldName(this.comp);
		nameLabel.setText(getFieldName(this.comp));
		if (this.comp instanceof ButtonGroup) {
			nameLabel.setText(getFieldName(this.comp));
			panelAlpha.setVisible(false);
			panelChecked.setVisible(false);
			panelArithematicRelation.setVisible(false);
			panelLengthRange.setVisible(false);
			panelConstraint.setVisible(false);
			isPanelLengthEnabled = false;
			ButtonGroup bgGroup = (ButtonGroup) this.comp;
			Enumeration<AbstractButton> rbuttons = (bgGroup).getElements();
			int length = 0;
			while (rbuttons.hasMoreElements()) {
				rbuttons.nextElement();
				length++;
			}
			int k = 0;
			rbuttons = bgGroup.getElements();
			JRadioButton radioOptions[] = new JRadioButton[length];
			cbOptions = new JCheckBox[length];
			while (rbuttons.hasMoreElements()) {

				radioOptions[k] = (JRadioButton) rbuttons.nextElement();
				// System.out.println("Button Name is:"+radioOptions[k].getName());
				cbOptions[k] = new JCheckBox();
				cbOptions[k].setActionCommand(radioOptions[k]
						.getActionCommand());
				cbOptions[k].setBackground(Color.WHITE);
				cbOptions[k].setText(radioOptions[k].getText());
				cbOptions[k].setBounds(200, k * 25, 100, 25);
				cbOptions[k].setForeground(ColorConstants.DEF_COLOR);
				panelOptions.add(cbOptions[k]);
				k++;
			}
		}
		if (this.comp instanceof JCheckBox) {
			panelOptions.setVisible(false);
			// panelSelected.setVisible(false);
			panelAlpha.setVisible(false);
			panelChecked.setVisible(true);
			panelArithematicRelation.setVisible(false);
			panelLengthRange.setVisible(false);
			panelConstraint.setVisible(false);
			panelMandatory.setVisible(false);
			isPanelLengthEnabled = false;
		} else if (this.comp instanceof JTextField) {
			panelOptions.setVisible(false);
			panelAlpha.setVisible(true);
			// panelSelected.setVisible(false);
			panelChecked.setVisible(false);
			panelArithematicRelation.setVisible(false);
			panelConstraint.setVisible(false);
			panelLengthRange.setVisible(false);
			isPanelLengthEnabled = true;
			cmbModelCombo.setVisible(false);
		} else if (this.comp instanceof JComboBox) {
			JComboBox cmb = ((JComboBox) this.comp);
			comboModel = cmb.getModel();
			txtConstraintValue.setVisible(false);
			cmbModelCombo.setModel(comboModel);
			cmbModelCombo.setSelectedIndex(0);
			panelOptions.setVisible(false);
			panelMandatory.setVisible(true);
			panelEnabled.setVisible(true);
			// panelSelected.setVisible(false);
			panelChecked.setVisible(false);
			panelArithematicRelation.setVisible(false);
			panelLengthRange.setVisible(false);
			panelConstraint.setVisible(true);
			fillCombos(this.comp, fieldType);
			panelAlpha.setVisible(false);
			isPanelLengthEnabled = false;
		} else if (this.comp instanceof JTextArea) {
			panelOptions.setVisible(false);
			panelAlpha.setVisible(true);
			panelChecked.setVisible(false);
			panelConstraint.setVisible(false);
			panelLengthRange.setVisible(false);
			panelArithematicRelation.setVisible(false);
			isPanelLengthEnabled = true;
			cmbModelCombo.setVisible(false);
		}
		SwingUtils.setSelectedButton(bgMenDatory, 0);
		SwingUtils.setSelectedButton(bgEnable, 1);
		SwingUtils.setSelectedButton(bgChecked, 0);
		SwingUtils.setSelectedButton(bgSelected, 0);
		updateData();
	}

	private void updateData() {
		SwingUtils.setSelectedButton(bgMenDatory, 0);
		SwingUtils.setSelectedButton(bgEnable, 1);
		SwingUtils.setSelectedButton(bgChecked, 0);
		SwingUtils.setSelectedButton(bgSelected, 0);
		updatePanels();

		if ((this.formField != null) && (this.valformField != null)) {
			String type[] = new String[10];
			String pattern[] = new String[7];

			int i = 0;
			for (FormFieldValidation formFieldVal : formField) {
				type[i] = formFieldVal.getType();
				pattern[i] = formFieldVal.getPattern();
				i++;
			}
			this.valformField.getLabelOfField();
			nameLabel.setText(valformField.getLabelOfField());

			if (this.comp instanceof JTextComponent) {
				panelOptions.setVisible(false);
				nameLabel.setText(valformField.getLabelOfField());
				panelAlpha.setVisible(true);
				panelChecked.setVisible(false);
				panelArithematicRelation.setVisible(false);
				isPanelLengthEnabled = true;

				// for selecting alpha type
				for (int j = 0; j < type.length; j++) {
					if (type[j] != null
							&& type[j].equalsIgnoreCase("AlphaType")) {
						if (pattern[j].equalsIgnoreCase("1")) {
							SwingUtils.setSelectedButton(bgAlpha, 1);
							fieldType = "Alpha";
							fillCombos(comp, fieldType);
							panelLengthRange.setVisible(true);
						}
						if (pattern[j].equalsIgnoreCase("2")) {
							fieldType = "Numeric";
							fillCombos(comp, fieldType);
							panelConstraint.setVisible(true);
							SwingUtils.setSelectedButton(bgAlpha, 2);
						}
						if (pattern[j].equalsIgnoreCase("3")) {
							fieldType = "Alpha Numeric";
							fillCombos(comp, fieldType);
							panelLengthRange.setVisible(true);
							SwingUtils.setSelectedButton(bgAlpha, 3);
						}
					}
				}
				// if validation is mandatory
				for (int j = 0; j < type.length; j++) {
					if (type[j] != null
							&& type[j].equalsIgnoreCase("Mandatory")) {
						SwingUtils.setSelectedButton(bgMenDatory, 1);
					}
				}
				// if validation is Enabled

				for (int j = 0; j < type.length; j++) {
					if (type[j] != null && type[j].equalsIgnoreCase("Enabled")) {
						SwingUtils.setSelectedButton(bgEnable, 1);
						panelAlpha.setVisible(true);
						break;
					} else {
						SwingUtils.setSelectedButton(bgEnable, 0);
						panelAlpha.setVisible(false);
					}
				}
				// if care Plan is selected
				for (int j = 0; j < type.length; j++) {
					if (type[j] != null
							&& type[j].equalsIgnoreCase("Care Plan")) {
						cbCarePlan.setSelected(true);
					}
				}
				// if validation is Length Max and Minimum
				for (int j = 0; j < type.length; j++) {
					if (type[j] != null && type[j].equalsIgnoreCase("Length")) {
						SwingUtils.setSelectedButton(bgLength, 1);
						panelLengthRange.setVisible(true);
						// rbAlpha.setSelected(true);
						updatePanels();
						String min = pattern[j].substring(0, pattern[j]
								.indexOf(","));
						String max = pattern[j].substring(pattern[j]
								.indexOf(",") + 1, pattern[j].length());
						txtMin.setText(min);
						txtMax.setText(max);

					}
				}
				// if validation is Length and Exact

				for (int j = 0; j < type.length; j++) {
					if (type[j] != null && type[j].equalsIgnoreCase("Exact")) {
						SwingUtils.setSelectedButton(bgLength, 2);
						panelLengthRange.setVisible(true);
						// rbAlpha.setSelected(true);
						updatePanels();
						txtExact.setText(pattern[j]);
					}
				}
				// if validation is Length and No limit
				for (int j = 0; j < type.length; j++) {
					if (type[j] != null && type[j].equalsIgnoreCase("NoLimit")) {
						SwingUtils.setSelectedButton(bgLength, 3);
						panelLengthRange.setVisible(true);
						// rbAlpha.setSelected(true);
						updatePanels();
					}
				}
				// for Arithematic type
				for (int j = 0; j < type.length; j++) {
					if (type[j] != null
							&& type[j].equalsIgnoreCase(">GREATER THAN")) {
						cmbRelation3AndOr.setSelectedItem(">GREATER THAN");
						txtArithematicValue.setText(pattern[j]);
						rbNumeric.setSelected(true);
						panelLengthRange.setVisible(false);
						panelConstraint.setVisible(false);
						panelArithematicRelation.setVisible(true);
					}
				}
				for (int j = 0; j < type.length; j++) {
					if (type[j] != null
							&& type[j].equalsIgnoreCase("<LESS THAN")) {
						cmbRelation3AndOr.setSelectedItem("<LESS THAN");
						txtArithematicValue.setText(pattern[j]);
						rbNumeric.setSelected(true);
						panelLengthRange.setVisible(false);
						panelConstraint.setVisible(false);
						panelArithematicRelation.setVisible(true);
					}
				}
				for (int j = 0; j < type.length; j++) {
					if (type[j] != null
							&& type[j].equalsIgnoreCase("=EQUAL TO")) {
						cmbRelation3AndOr.setSelectedItem("=EQUAL TO");
						txtArithematicValue.setText(pattern[j]);
						rbNumeric.setSelected(true);
						panelLengthRange.setVisible(false);
						panelConstraint.setVisible(false);
						panelArithematicRelation.setVisible(true);
					}
				}
				for (int j = 0; j < type.length; j++) {
					if (type[j] != null
							&& type[j].equalsIgnoreCase(">=GREATER THAN EQUAL")) {
						cmbRelation3AndOr
								.setSelectedItem(">=GREATER THAN EQUAL");
						txtArithematicValue.setText(pattern[j]);
						rbNumeric.setSelected(true);
						panelLengthRange.setVisible(false);
						panelConstraint.setVisible(false);
						panelArithematicRelation.setVisible(true);
					}
				}
				for (int j = 0; j < type.length; j++) {
					if (type[j] != null
							&& type[j].equalsIgnoreCase("<=LESS THAN EQUAL")) {
						cmbRelation3AndOr.setSelectedItem("<=LESS THAN EQUAL");
						txtArithematicValue.setText(pattern[j]);
						rbNumeric.setSelected(true);
						panelLengthRange.setVisible(false);
						panelConstraint.setVisible(false);
						panelArithematicRelation.setVisible(true);
					}
				}
				// for constraint types
				for (int j = 0; j < type.length; j++) {
					if (type[j] != null
							&& type[j].equalsIgnoreCase("Constraint")) {
						ValidationParser vp = new ValidationParser();
						constraintSet = vp.parse(pattern[j]);
						txtRelation.setText(constraintSet + "");
						panelConstraint.setVisible(true);
					}
				}
			}
			// for Radio Buttons
			else if (this.comp instanceof ButtonGroup) {
				nameLabel.setText(getFieldName(this.comp));
				// panelSelected.setVisible(true);
				panelAlpha.setVisible(false);
				panelChecked.setVisible(false);
				panelArithematicRelation.setVisible(false);
				panelLengthRange.setVisible(false);
				isPanelLengthEnabled = false;
				panelConstraint.setVisible(false);

				// if validation is Mandatory
				for (int j = 0; j < type.length; j++) {
					if (type[j] != null
							&& type[j].equalsIgnoreCase("Mandatory")) {
						SwingUtils.setSelectedButton(bgMenDatory, 1);
					}
				}
				// if care Plan is selected
				for (int j = 0; j < type.length; j++) {
					if (type[j] != null
							&& type[j].equalsIgnoreCase("Care Plan")) {
						cbCarePlan.setSelected(true);
					}
				}

				// if validation is Enabled
				for (int j = 0; j < type.length; j++) {
					if (type[j] != null && type[j].equalsIgnoreCase("Enabled")) {
						SwingUtils.setSelectedButton(bgEnable, 1);
						// panelSelected.setVisible(true);
						break;
					} else {
						// panelSelected.setVisible(false);
						SwingUtils.setSelectedButton(bgEnable, 0);
					}
				}
				// if validation is selected
				for (int j = 0; j < type.length; j++) {
					if (type[j] != null && type[j].equalsIgnoreCase("Selected")) {
						SwingUtils.setSelectedButton(bgSelected, 1);
					}
				}
				for (int j = 0; j < type.length; j++) {
					if (type[j] != null
							&& type[j].equalsIgnoreCase("Constraint")) {
						ValidationParser vp = new ValidationParser();
						constraintSet = vp.parse(pattern[j]);
						Iterator iterator = constraintSet.getIterator();
						while (iterator.hasNext()) {
							Object obj = iterator.next();
							if (obj instanceof Operand) {
								Operand op = (Operand) obj;
								String value = op.getValue();
								for (int a = 0; a < cbOptions.length; a++) {
									if (value.equalsIgnoreCase(cbOptions[a]
											.getActionCommand())) {
										cbOptions[a].setSelected(true);
									}
								}
							}

						}
					}
				}
			}

			// for check boxes
			else if (this.comp instanceof JCheckBox) {
				panelOptions.setVisible(false);
				// panelSelected.setVisible(false);
				panelAlpha.setVisible(false);
				panelChecked.setVisible(true);
				panelArithematicRelation.setVisible(false);
				panelLengthRange.setVisible(false);
				panelConstraint.setVisible(false);
				panelMandatory.setVisible(false);
				isPanelLengthEnabled = false;
				// if validation is Mandatory
				for (int j = 0; j < type.length; j++) {
					if (type[j] != null
							&& type[j].equalsIgnoreCase("Mandatory")) {
						SwingUtils.setSelectedButton(bgMenDatory, 1);
					}
				}
				// if validation is Enabled
				for (int j = 0; j < type.length; j++) {
					if (type[j] != null && type[j].equalsIgnoreCase("Enabled")) {
						SwingUtils.setSelectedButton(bgEnable, 1);
						break;
					} else {
						SwingUtils.setSelectedButton(bgEnable, 0);
					}
				}
				// if care Plan is selected
				for (int j = 0; j < type.length; j++) {
					if (type[j] != null
							&& type[j].equalsIgnoreCase("Care Plan")) {
						cbCarePlan.setSelected(true);
					}
				}

				for (int j = 0; j < type.length; j++) {
					// if validation is Checked
					if (type[j] != null
							&& type[j].equalsIgnoreCase("Constraint")) {

						ValidationParser vp = new ValidationParser();
						constraintSet = vp.parse(pattern[j]);
						Iterator<ConstraintItem> iterator = constraintSet
								.getIterator();
						while (iterator.hasNext()) {
							Object obj = iterator.next();
							if (obj instanceof Operand) {
								Operand op = (Operand) obj;
								String value = op.getValue();
								if ("Checked".equalsIgnoreCase(value)) {
									SwingUtils.setSelectedButton(bgChecked, 1);
								}
							}
						}
					}
				}
			} else if (this.comp instanceof JComboBox) {
				JComboBox cmb = ((JComboBox) this.comp);
				comboModel = cmb.getModel();
				panelOptions.setVisible(false);
				panelMandatory.setVisible(true);
				panelEnabled.setVisible(true);
				// panelSelected.setVisible(false);
				panelChecked.setVisible(false);
				panelArithematicRelation.setVisible(false);
				panelLengthRange.setVisible(false);
				panelConstraint.setVisible(true);
				panelAlpha.setVisible(false);
				isPanelLengthEnabled = false;
				// if validation is Mandatory
				for (int j = 0; j < type.length; j++) {
					if (type[j] != null
							&& type[j].equalsIgnoreCase("Mandatory")) {
						SwingUtils.setSelectedButton(bgMenDatory, 1);
					}
				}
				// if care Plan is selected
				for (int j = 0; j < type.length; j++) {
					if (type[j] != null
							&& type[j].equalsIgnoreCase("Care Plan")) {
						cbCarePlan.setSelected(true);
					}
				}
				// if validation is Enabled
				for (int j = 0; j < type.length; j++) {
					if (type[j] != null && type[j].equalsIgnoreCase("Enabled")) {
						SwingUtils.setSelectedButton(bgEnable, 1);
						break;
					} else {
						SwingUtils.setSelectedButton(bgEnable, 0);
					}
				}
				// for constraint types
				for (int j = 0; j < type.length; j++) {
					if (type[j] != null
							&& type[j].equalsIgnoreCase("Constraint")) {
						ValidationParser vp = new ValidationParser();
						constraintSet = vp.parse(pattern[j]);
						txtRelation.setText(constraintSet + "");
						panelConstraint.setVisible(true);
						txtConstraintValue.setVisible(false);
						fillCombos(this.comp, fieldType);
						cmbModelCombo.setModel(comboModel);
						cmbModelCombo.setSelectedIndex(0);
					}
				}

			}
		}

	}

	/**
	 * it will just updates the panels in case length radio button is selected
	 */
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

	/**
	 * 
	 * @param object
	 *            - component clicked inside the form
	 * @param typeOfField
	 *            - can be alpha/numeric/alphaNumeric if object is instance of
	 *            the TextComponent then checks for alpha/numeric/alphaNumeric
	 *            Otherwise just fill the ComboBox with the values Equals , not
	 *            equals , empty(blank space)
	 * 
	 */
	private void fillCombos(Object object, String typeOfField) {
		if (object instanceof JTextComponent) {
			/* if Alpha Field is selected */
			if ((typeOfField != null)
					&& (typeOfField.equalsIgnoreCase("Alpha"))) {
				strList.clear();
				cmbValues = new Condition[] { Condition.EMPTY,
						Condition.STARTS_WITH, Condition.ENDS_WITH,
						Condition.CONTAINS, Condition.NOT_CONTAINS };
				for (int i = 0; i < cmbValues.length; i++) {
					strList.add(cmbValues[i]);
				}
				cmbConstraint.setModel(new DefaultComboBoxModel(strList
						.toArray()));
			}
			/* if Numeric Field is Selected */
			if ((typeOfField != null)
					&& (typeOfField.equalsIgnoreCase("Numeric"))) {

				strList.clear();
				cmbValues = new Condition[] { Condition.EMPTY,
						Condition.GREATER_THAN, Condition.LESS_THAN,
						Condition.EQUALS, Condition.GREATER_THAN_EQUALS,
						Condition.LESS_THAN_EQUALS };
				for (int i = 0; i < cmbValues.length; i++) {
					strList.add(cmbValues[i]);
				}
				cmbConstraint.setModel(new DefaultComboBoxModel(strList
						.toArray()));
			}
			if ((typeOfField != null)
					&& (typeOfField.equalsIgnoreCase("Alpha Numeric"))) {
				strList.clear();
				cmbValues = new Condition[] { Condition.EMPTY,
						Condition.STARTS_WITH, Condition.ENDS_WITH,
						Condition.CONTAINS, Condition.NOT_CONTAINS };
				for (int i = 0; i < cmbValues.length; i++) {
					strList.add(cmbValues[i]);
				}
				cmbConstraint.setModel(new DefaultComboBoxModel(strList
						.toArray()));
			}
		} else if (object instanceof JComboBox) {
			strList.clear();
			cmbValues = new Condition[] { Condition.EMPTY, Condition.EQUALS,
					Condition.NOT_EQUALS };
			for (int i = 0; i < cmbValues.length; i++) {
				strList.add(cmbValues[i]);
			}
			cmbConstraint.setModel(new DefaultComboBoxModel(strList.toArray()));
		}

	}

	/**
	 * this method removes the (constraint)element from the ComboBox
	 * (cmbConstraint) provided that operator should be {OR}
	 */
	private void removeFromCombo() {
		String searchString = txtRelation.getText();
		if (searchString.contains("OR")) {
			searchString = searchString.substring(searchString
					.lastIndexOf("OR"), searchString.length());
		}

		if (searchString.contains("" + Condition.STARTS_WITH)) {
			strList.remove(Condition.STARTS_WITH);
		}
		if (searchString.contains("" + Condition.ENDS_WITH)) {
			strList.remove(Condition.ENDS_WITH);
		}
		if (searchString.contains("" + Condition.CONTAINS)) {
			strList.remove(Condition.CONTAINS);
		}
		if (searchString.contains("" + Condition.NOT_CONTAINS)) {
			strList.remove(Condition.NOT_CONTAINS);
		}
		if (searchString.contains("" + Condition.CHANGE)) {
			strList.remove(Condition.CHANGE);
		}
		if (searchString.contains("" + Condition.EQUALS)) {
			strList.remove(Condition.EQUALS);
		}
		if (searchString.contains("" + Condition.GREATER_THAN)) {
			strList.remove(Condition.GREATER_THAN);
		}
		if (searchString.contains("" + Condition.GREATER_THAN_EQUALS)) {
			strList.remove(Condition.GREATER_THAN_EQUALS);
		}
		if (searchString.contains("" + Condition.EQUALS)) {
			strList.remove(Condition.EQUALS);
		}
		if (searchString.contains("" + Condition.LESS_THAN)) {
			strList.remove(Condition.LESS_THAN);
		}
		if (searchString.contains("" + Condition.LESS_THAN_EQUALS)) {
			strList.remove(Condition.LESS_THAN_EQUALS);
		}
		cmbConstraint.setModel(new DefaultComboBoxModel(strList.toArray()));
	}

	/**
	 * 
	 * @param panel
	 *            - panel whose components needs to be disabled
	 * @param isEnable
	 *            - the enable property (the components should be set to enabled
	 *            or disabled enabled - pass true disabled - pass false)
	 * @return enabled or not
	 */

	private boolean setAllComponentEnableDisable(JComponent panel,
			boolean isEnable) {
		if (panel.getComponentCount() > 0) {
			Component comps[] = panel.getComponents();
			for (Component c : comps) {
				if (c instanceof JComponent) {
					JComponent comP = (JComponent) c;
					setAllComponentEnableDisable(comP, isEnable);

					c.setEnabled(isEnable);
				}
			}
		}
		return isEnable;
	}

	/**
	 * 
	 * @param panel
	 *            panel that has to be searched
	 * @param compName
	 *            - field Name
	 * @return String - data type of field
	 */
	public String getDataTypeOfField(JPanel panel, String compName) {
		if (panel instanceof PanelActivityInitialAssessmentFormPage1) {
			Class cls = panel.getClass();
			Map<String, String> map = null;
			try {
				Field f = cls.getDeclaredField("presentationMap");
				boolean access = f.isAccessible();
				f.setAccessible(true);
				map = (Map<String, String>) f.get(panel);
				f.setAccessible(access);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (map != null) {
				Map<String, String> finalMap = new HashMap<String, String>();
				for (Entry<String, String> entry : map.entrySet()) {
					finalMap.put(entry.getValue(), entry.getKey());
				}

				ActivityInitialAssessmentFormPage1 ra = new ActivityInitialAssessmentFormPage1();
				try {
					Field[] fields = ra.getClass().getDeclaredFields();
					for (Field fld : fields) {
						if (fld.getName().equalsIgnoreCase(
								finalMap.get(compName))) {
							Class fieldClass = fld.getType();
							return fieldClass.getSimpleName();
						}

					}
					// f=cRA.getField(map.get(compName));
				} catch (SecurityException e) {
					e.printStackTrace();
				}
			}
		}
		if (panel instanceof PanelActivityAssessmentFormPage2) {
			Class cls = panel.getClass();
			Map<String, String> map = null;
			try {
				Field f = cls.getDeclaredField("presentationMap");
				boolean access = f.isAccessible();
				f.setAccessible(true);
				map = (Map<String, String>) f.get(panel);
				f.setAccessible(access);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (map != null) {
				Map<String, String> finalMap = new HashMap<String, String>();
				for (Entry<String, String> entry : map.entrySet()) {
					finalMap.put(entry.getValue(), entry.getKey());
				}

				ActivityAssessmentFormPage2 ra = new ActivityAssessmentFormPage2();
				try {
					Field[] fields = ra.getClass().getDeclaredFields();
					for (Field fld : fields) {
						if (fld.getName().equalsIgnoreCase(
								finalMap.get(compName))) {
							Class fieldClass = fld.getType();
							return fieldClass.getSimpleName();
						}

					}
					// f=cRA.getField(map.get(compName));
				} catch (SecurityException e) {
					e.printStackTrace();
				}
			}
		}
		if (panel instanceof PanelRAFPg1) {
			Map<String, String> map = ((PanelRAFPg1) panel)
					.getPresentationMap();
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
		}
		// return f.getType();
		return null;
	}

	/**
	 * 
	 * @param panel
	 *            - panel in which compName is defined as a field
	 * @param compName
	 *            - component whose name has to be searched
	 * @return String - name of the field inside the panel
	 */
	public String getNameOfField(PanelRAFPg1 panel, String compName) {
		Map<String, String> map = panel.getPresentationMap2();
		RAFPg1 ra = new RAFPg1();
		try {
			Field[] fields = ra.getClass().getDeclaredFields();
			for (Field fld : fields) {
				if (fld.getName().equalsIgnoreCase(map.get(compName))) {
					return fld.getName();
				}
			}

		} catch (SecurityException e) {
			e.printStackTrace();
		}

		return null;
	}

	/* TODO: Iterative implementation. Need to rework. (D S Naruka) */

	private String getFieldName(Object object) {
		String nameOfField = "";
		if (object instanceof JTextField) {
			String str = getDefaultLabel(nameOfComp);
			nameOfField = str.substring(3, str.length());
		}
		if (object instanceof JCheckBox) {
			String str = getDefaultLabel(nameOfComp);
			nameOfField = str.substring(2, str.length());
		}
		if (object instanceof JRadioButton) {
			String str = getDefaultLabel(nameOfComp);
			nameOfField = str.substring(2, str.length());
		}
		if (object instanceof JTextArea) {
			String str = getDefaultLabel(nameOfComp);
			nameOfField = str.substring(3, str.length());
		}
		if (object instanceof JComboBox) {
			String str = getDefaultLabel(nameOfComp);
			nameOfField = str.substring(3, str.length());
		}
		if (object instanceof JList) {
			String str = getDefaultLabel(nameOfComp);
			nameOfField = str.substring(3, str.length());
		}
		if (object instanceof JDateChooser) {
			String str = getDefaultLabel(nameOfComp);
			nameOfField = str.substring(2, str.length());
		}
		if (object instanceof ButtonGroup) {
			String str = getDefaultLabel(nameOfComp);
			nameOfField = str.substring(2, str.length());
		}
		return nameOfField;
	}

	/**
	 * 
	 * @param object
	 *            - component
	 * @return String i.e. possible data type of the component for
	 *         {@link Example} JTextField will always contains data of String
	 *         Type
	 */
	private String createMap(Object object) {

		if (object instanceof JTextField) {

			dataTypeOfComp = "String";
		}
		if (object instanceof JCheckBox) {

			dataTypeOfComp = "boolean";
		}
		if (object instanceof JRadioButton) {

			dataTypeOfComp = "int";
		}
		if (object instanceof JTextArea) {

			dataTypeOfComp = "String";
		}
		if (object instanceof JComboBox) {

			dataTypeOfComp = "Object";
		}
		if (object instanceof JList) {

			dataTypeOfComp = "Object";
		}
		if (object instanceof JDateChooser) {

			dataTypeOfComp = "date";
		}
		return dataTypeOfComp;
	}

	private boolean doValidate() {
		boolean result = false;
		if (isPanelLengthEnabled) {
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

	/**
	 * This method returns the default label of the component to be displayed at
	 * the top of the pop up for {@link Example} : txtName will be broken into
	 * only Name
	 **/
	public static String getDefaultLabel(String lbl) {
		String retStr = null;
		if (lbl != null && lbl.length() > 0) {
			String[] strParts = lbl.split("[A-Z]");
			if (strParts != null && strParts.length > 0) {
				for (int i = 0, ctr = 0; i < strParts.length; i++) {
					if (i == 0) {
						retStr = (strParts[i].charAt(0) + "").toUpperCase()
								+ strParts[i].substring(1);
						ctr += strParts[i].length();
					} else {
						if (strParts[i].length() > 0) {
							retStr += strParts[i];
							ctr += strParts[i].length();
						}
					}
					if (retStr.length() > 0 && ctr < lbl.length()) {
						retStr += " " + lbl.charAt(ctr);
						ctr++;
					}
				}
			}
		}
		return retStr;
	}

	public int doSave() {
		ValidationForm vfRef = validationObj;

		ValidationFormField validationFormFld = null;
		if (this.valformField == null) {
			validationFormFld = new ValidationFormField();

			if ((this.comp instanceof ButtonGroup)) {
				validationFormFld.setComponentName(this.bgName);
				validationFormFld.setDataTyeOfField("int");
				validationFormFld.setDataTypeOfComponent("String");
				validationFormFld.setLabelOfField(getFieldName(this.comp));
				validationFormFld.getValidationFormFields().clear();
				if (Global.panelFormConfigAlert != null) {
					alertObj = Global.panelFormConfigAlert.getAlertObj();
					if (alertObj != null) {
						validationFormFld.setAlert(alertObj);
					}
					Global.panelFormConfigAlert = null;
				} else if (alertObj == null) {
					alertObj = new FormConfigAlert();
					alertObj.setLoggedInUser(Global.currentLoggedInUserKey);
					alertObj.setUserInfo(Global.currentLoggedInUserName);
					alertObj.setAlertDate(new Date());
					alertObj.setUserNames("");
					alertObj.setDepartmentNames("");
					validationFormFld.setAlert(alertObj);
				}
			} else {
				validationFormFld.setComponentName(this.nameOfComp);
				validationFormFld.setDataTyeOfField(getDataTypeOfField(
						currentPanel, nameOfComp));
				validationFormFld.setDataTypeOfComponent(dataTypeOfComp);
				validationFormFld.setLabelOfField(getFieldName(this.comp));
				validationFormFld.getValidationFormFields().clear();
				if (Global.panelFormConfigAlert != null) {
					alertObj = Global.panelFormConfigAlert.getAlertObj();
					if (alertObj != null) {
						validationFormFld.setAlert(alertObj);
					}
					Global.panelFormConfigAlert = null;
				} else if (alertObj == null) {
					alertObj = new FormConfigAlert();
					alertObj.setLoggedInUser(Global.currentLoggedInUserKey);
					alertObj.setAlertDate(new Date());
					alertObj.setUserInfo(Global.currentLoggedInUserName);
					alertObj.setUserNames("");
					alertObj.setDepartmentNames("");
					validationFormFld.setAlert(alertObj);
				}
			}
		} else {
			validationFormFld = this.valformField;
			validationFormFld.setLabelOfField(validationFormFld
					.getLabelOfField());
			validationFormFld.getValidationFormFields().clear();
			if (Global.panelFormConfigAlert != null) {
				alertObj = Global.panelFormConfigAlert.getAlertObj();
				if (alertObj != null) {
					validationFormFld.setAlert(alertObj);
				}
				Global.panelFormConfigAlert = null;
			}
		}
		FormFieldValidation formFieldValidation = null;
		FormFieldValidation formFieldValidationForAlphaType = null;
		FormFieldValidation formFieldValidationForButtonGroup = null;

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
		if (panelArithematicRelation.isVisible()) {
			formFieldValidation = new FormFieldValidation();
			formFieldValidation.setMessage("my Message");
			formFieldValidation.setType(cmbRelation3AndOr.getSelectedItem()
					.toString());
			formFieldValidation.setPattern(txtArithematicValue.getText());
			validationFormFld.getValidationFormFields()
					.add(formFieldValidation);

			if (SwingUtils.getSelectedButton(bgAlpha) == 2) {
				formFieldValidationForAlphaType = new FormFieldValidation();
				formFieldValidationForAlphaType.setType("AlphaType");
				formFieldValidationForAlphaType.setPattern("2");
			}
			validationFormFld.getValidationFormFields().add(
					formFieldValidationForAlphaType);
		}
		if (cbCarePlan.isSelected()) {
			formFieldValidation = new FormFieldValidation();
			formFieldValidation.setMessage("my Message");
			formFieldValidation.setType("Care Plan");
			validationFormFld.getValidationFormFields()
					.add(formFieldValidation);
		}
		if (panelConstraint.isVisible()) {
			constraintSet = getInstanceOfConstraintSet();
			formFieldValidation = new FormFieldValidation();
			formFieldValidation.setMessage("my Message");
			formFieldValidation.setType("Constraint");
			formFieldValidation.setPattern(constraintSet.toValidationQuery());
			validationFormFld.getValidationFormFields()
					.add(formFieldValidation);
		}
		if (panelChecked.isVisible()
				&& SwingUtils.getSelectedButton(bgChecked) == 1) {
			formFieldValidation = new FormFieldValidation();
			formFieldValidation.setMessage("my Message");
			formFieldValidation.setType("Constraint");
			constraintSet = new ConstraintSet();
			constraintSet.addOperand(Condition.EQUALS, "Checked");
			if (!constraintSet.isEmpty()) {
				constraintSet.validate();
			}
			formFieldValidation.setPattern(constraintSet.toValidationQuery());
			validationFormFld.getValidationFormFields()
					.add(formFieldValidation);
		}

		if (panelOptions.isVisible()) {
			formFieldValidationForButtonGroup = new FormFieldValidation();
			formFieldValidationForButtonGroup.setMessage("my Message");
			formFieldValidationForButtonGroup.setType("Constraint");

			constraintSet = new ConstraintSet();

			for (int i = 0; i < cbOptions.length; i++) {
				if (cbOptions[i].isSelected()) {
					constraintSet.addOperand(Condition.EQUALS, cbOptions[i]
							.getActionCommand());
					constraintSet.addOperator(Operator.OR);

				}
			}
			if (!constraintSet.isEmpty()) {
				constraintSet.validate();
			}
			formFieldValidationForButtonGroup.setPattern(constraintSet
					.toValidationQuery());
			validationFormFld.getValidationFormFields().add(
					formFieldValidationForButtonGroup);
		}
		if (panelConstraint.isVisible()) {

			formFieldValidationForAlphaType = new FormFieldValidation();
			formFieldValidationForAlphaType.setMessage("my Message");
			if ((SwingUtils.getSelectedButton(bgAlpha) == 1)) {

				formFieldValidationForAlphaType.setType("AlphaType");
				formFieldValidationForAlphaType.setPattern("1");

			} else if (SwingUtils.getSelectedButton(bgAlpha) == 2) {

				formFieldValidationForAlphaType.setType("AlphaType");
				formFieldValidationForAlphaType.setPattern("2");

			} else if (SwingUtils.getSelectedButton(bgAlpha) == 3) {

				formFieldValidationForAlphaType.setType("AlphaType");
				formFieldValidationForAlphaType.setPattern("3");

			}

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
			validationFormFld.getValidationFormFields().add(
					formFieldValidationForAlphaType);

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
			Global.panelFormConfigAlert = null;
		} catch (RemoteException e) {

			e.printStackTrace();
		} catch (MedrexException e) {

			e.printStackTrace();
		}
		return Global.currentValidationFormKey;
	}

	// returns the constraint set object

	private ConstraintSet getInstanceOfConstraintSet() {
		if (constraintSet == null) {
			constraintSet = new ConstraintSet();
		}
		return constraintSet;
	}

}
