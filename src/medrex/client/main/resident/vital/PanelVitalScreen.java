package medrex.client.main.resident.vital;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.ButtonGroup;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.admission.PanelResidentAssessmentFormPage1;
import medrex.client.main.admission.message.MessageSender;
import medrex.client.main.resident.weight.PanelReWeigh;
import medrex.client.main.resident.weight.PanelReWeigh.SaveMode;
import medrex.client.utils.FieldFormatter;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;
import medrex.commons.enums.GuiModes;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.admin.AmbulationWeight;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.resident.ResidentVitalSigns;
import medrex.commons.vo.resident.ResidentWeight;

import com.jgoodies.validation.ValidationResult;
import com.jgoodies.validation.util.PropertyValidationSupport;
import com.sX.awt.Direction;
import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;
import com.toedter.calendar.JDateChooser;

public class PanelVitalScreen extends PopUpView {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5833188541178416541L;
	private JRadioButton rbWheelChair;
	private JRadioButton rbHoyerLift;
	private JRadioButton rbWalker;
	private JRadioButton rbBedScale;
	private JRadioButton rbChair;
	private JPanel panel;
	private ButtonGroup bgTraveller = new ButtonGroup();
	private JxButton btnBackSpace;
	private JxButton btnDiv;
	private JxButton btnDecimal;
	private JxButton cButton;
	private JxButton cancelButton;
	private JFormattedTextField txtBP;
	private JFormattedTextField txtPulse;
	private JFormattedTextField txtTemprature;
	private JxButton[] btnArr;
	private JxButton btnEnterData;
	private JxButton btnZero;
	private Map<String, JTextField> map = new HashMap<String, JTextField>();
	private JFormattedTextField focusedComponent;
	private JDateChooser dcDate;
	private Mode mode;
	private JFormattedTextField txtWeight;
	private JLabel weightLabel;
	private JLabel tempratureLabel;
	private JLabel pulseLabel;
	private JLabel bpLabel;
	private JLabel ambulationLabel;
	private JFormattedTextField txtAmbulation;
	private JComponent comp;
	private JLabel netWeighttLabel;
	private JTextField txtnetWeight;

	/*
	 * private ControllerResidentVitalRecord residentVitalController; private
	 * Map presentationMap; private PresentationModel presentationModel;
	 */
	public PanelVitalScreen(Mode openMode, JComponent com) {
		super();
		// residentVitalController = new ControllerResidentVitalRecord();
		// presentationMap = new HashMap();
		mode = openMode;
		comp = com;
		setLayout(new BorderLayout());
		setBorder(new LineBorder(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor(), 4));
		if (mode.equals(Mode.VITAL)) {
			setSize(new Dimension(480, 280));
		}
		if (mode.equals(Mode.VITAL)) {
			setSize(new Dimension(480, 300));
		}

		final JxPanel panelMain = new JxPanel();
		panelMain.setPreferredSize(new Dimension(0, 0));
		panelMain.setBounds(0, 0, 450, 450);
		final BorderLayout borderLayout = new BorderLayout();
		panelMain.setLayout(borderLayout);
		panelMain.setArc(0);
		// panelMain.setBackground(Color.WHITE);
		panelMain.setLinearGradient(ColorConstants.GradientBright, new Color(
				175, 198, 205), Direction.LEFT_TO_RIGHT);
		add(panelMain);

		final JPanel panelFields = new JPanel();
		panelFields.setOpaque(false);
		panelFields.setLayout(new FlowLayout());
		panelFields.setPreferredSize(new Dimension(200, 280));
		panelMain.add(panelFields, BorderLayout.WEST);

		final JLabel recordVitalSignsLabel = new JLabel();
		recordVitalSignsLabel.setFont(new Font("", Font.BOLD, 14));
		recordVitalSignsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		recordVitalSignsLabel.setPreferredSize(new Dimension(150, 20));
		recordVitalSignsLabel.setText("Record Vital Signs");
		panelFields.add(recordVitalSignsLabel);

		weightLabel = new JLabel();
		weightLabel.setFont(new Font("", Font.BOLD, 14));
		weightLabel.setHorizontalAlignment(SwingConstants.CENTER);
		weightLabel.setHorizontalTextPosition(SwingConstants.TRAILING);
		weightLabel.setForeground(ColorsWidget.voilet);
		weightLabel.setIconTextGap(4);
		weightLabel.setPreferredSize(new Dimension(150, 20));
		weightLabel.setText("Total Weight");
		panelFields.add(weightLabel);

		txtWeight = new JFormattedTextField(FieldFormatter.FLOAT3DizitWithPrec1);
		// presentationMap.put("weight", txtWeight);
		txtWeight.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				focusedComponent = txtWeight;
				doCalculateNetWeight();
			}
		});
		txtWeight.setPreferredSize(new Dimension(150, 20));
		panelFields.add(txtWeight);

		ambulationLabel = new JLabel();
		ambulationLabel.setFont(new Font("", Font.BOLD, 14));
		ambulationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ambulationLabel.setHorizontalTextPosition(SwingConstants.TRAILING);
		ambulationLabel.setForeground(Color.RED);
		ambulationLabel.setIconTextGap(4);
		ambulationLabel.setPreferredSize(new Dimension(150, 20));
		ambulationLabel.setText("Ambulation");
		panelFields.add(ambulationLabel);

		txtAmbulation = new JFormattedTextField(
				FieldFormatter.FLOAT3DizitWithPrec1);
		txtAmbulation.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(final KeyEvent e) {
				doCalculateNetWeight();
			}
		});
		txtAmbulation.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(final FocusEvent e) {
			}
		});
		txtAmbulation.setPreferredSize(new Dimension(150, 20));
		txtAmbulation.setFocusable(true);
		panelFields.add(txtAmbulation);

		tempratureLabel = new JLabel();
		tempratureLabel.setFont(new Font("", Font.BOLD, 14));
		tempratureLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tempratureLabel.setHorizontalTextPosition(SwingConstants.TRAILING);
		tempratureLabel.setForeground(ColorsWidget.voilet);
		tempratureLabel.setIconTextGap(4);
		tempratureLabel.setPreferredSize(new Dimension(150, 20));
		tempratureLabel.setText("Temperature");
		panelFields.add(tempratureLabel);

		txtTemprature = new JFormattedTextField(
				FieldFormatter.FLOAT3DizitWithPrec1);
		// presentationMap.put("temprature", txtTemprature);
		txtTemprature.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				// System.out.println("Focus Gained");
				focusedComponent = txtTemprature;

			}
		});
		txtTemprature.setPreferredSize(new Dimension(150, 20));
		map.put("Temprature", txtTemprature);
		panelFields.add(txtTemprature);

		pulseLabel = new JLabel();
		pulseLabel.setFont(new Font("", Font.BOLD, 14));
		pulseLabel.setForeground(Color.RED);
		pulseLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pulseLabel.setPreferredSize(new Dimension(150, 20));
		pulseLabel.setText("Pulse");
		panelFields.add(pulseLabel);

		txtPulse = new JFormattedTextField(FieldFormatter.MAX3);
		// presentationMap.put("pulse", txtPulse);
		txtPulse.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				focusedComponent = txtPulse;

			}
		});
		txtPulse.setPreferredSize(new Dimension(150, 20));
		panelFields.add(txtPulse);

		bpLabel = new JLabel();
		bpLabel.setFont(new Font("", Font.BOLD, 14));
		bpLabel.setHorizontalAlignment(SwingConstants.CENTER);
		bpLabel.setForeground(ColorConstants.DEF_COLOR);
		bpLabel.setPreferredSize(new Dimension(150, 20));
		bpLabel.setText("B.P");
		panelFields.add(bpLabel);

		txtBP = new JFormattedTextField(FieldFormatter.BP);
		// presentationMap.put("bp", txtBP);
		txtBP.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {

				focusedComponent = txtBP;

			}
		});
		txtBP.setPreferredSize(new Dimension(150, 20));
		map.put("BP", txtBP);
		panelFields.add(txtBP);

		/*
		 * final JLabel label = new JLabel(); label.setPreferredSize(new
		 * Dimension(150, 5)); label.setText(""); panelFields.add(label);
		 */

		netWeighttLabel = new JLabel();
		netWeighttLabel.setFont(new Font("", Font.BOLD, 14));
		netWeighttLabel.setHorizontalAlignment(SwingConstants.CENTER);
		netWeighttLabel.setForeground(ColorConstants.DEF_COLOR);
		netWeighttLabel.setPreferredSize(new Dimension(150, 20));
		netWeighttLabel.setText("Net Weight");
		panelFields.add(netWeighttLabel);

		txtnetWeight = new JTextField();
		txtnetWeight.setPreferredSize(new Dimension(150, 20));
		txtnetWeight.setFocusable(false);
		panelFields.add(txtnetWeight);

		final JLabel label1 = new JLabel();
		label1.setPreferredSize(new Dimension(150, 5));
		label1.setText("");
		panelFields.add(label1);

		cancelButton = new JxButton();
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
			}
		});
		cancelButton.setBackground(Color.WHITE);
		cancelButton.setArc(0.6f);
		cancelButton.setMargin(new Insets(2, 14, 2, 14));
		cancelButton.setPreferredSize(new Dimension(100, 40));
		cancelButton.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		cancelButton.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setText("CANCEL");
		panelFields.add(cancelButton);

		final JPanel panelCenter = new JPanel();
		panelCenter.setLayout(null);
		panelCenter.setOpaque(false);
		panelCenter.setPreferredSize(new Dimension(280, 2800));
		panelMain.add(panelCenter, BorderLayout.CENTER);

		final JPanel panelButtons = new JPanel();
		panelButtons.setBounds(0, 0, 200, 168);
		panelButtons.setOpaque(false);
		final FlowLayout flowLayout_1 = new FlowLayout();
		panelButtons.setLayout(flowLayout_1);
		panelButtons.setPreferredSize(new Dimension(200, 200));
		panelCenter.add(panelButtons);

		final JPanel panelCalc = new JPanel();
		panelCalc.setBounds(200, 0, 55, 168);
		panelCalc.setOpaque(false);
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setHgap(0);
		panelCalc.setLayout(flowLayout_2);
		panelCalc.setPreferredSize(new Dimension(40, 180));
		panelCenter.add(panelCalc);

		btnDecimal = new JxButton();
		btnDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				focusedComponent
						.setText(focusedComponent.getText().concat("."));
			}
		});
		btnDecimal.setArc(0.6f);
		btnDecimal.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnDecimal.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnDecimal.setFont(new Font("", Font.BOLD, 12));
		btnDecimal.setPreferredSize(new Dimension(50, 50));
		btnDecimal.setText(".");
		panelCalc.add(btnDecimal);

		btnDiv = new JxButton();
		btnDiv.setArc(0.6f);
		btnDiv.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnDiv.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnDiv.setFont(new Font("", Font.BOLD, 12));
		btnDiv.setPreferredSize(new Dimension(50, 50));
		btnDiv.setText("/");
		panelCalc.add(btnDiv);

		btnBackSpace = new JxButton();
		btnBackSpace.setArc(0.6f);
		btnBackSpace.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnBackSpace.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnBackSpace.setFont(new Font("", Font.BOLD, 12));
		btnBackSpace.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String value = focusedComponent.getText();
				if (value.length() > 0) {
					value = value.substring(0, value.length() - 1);
				}
				focusedComponent.setText(value);

			}

		});
		btnBackSpace.setPreferredSize(new Dimension(50, 50));
		btnBackSpace.setText("<<");
		panelCalc.add(btnBackSpace);

		final JPanel panelEnterData = new JPanel();
		panelEnterData.setBounds(0, 170, 255, 55);
		panelEnterData.setOpaque(false);
		panelEnterData.setLayout(null);
		panelEnterData.setPreferredSize(new Dimension(230, 65));
		panelCenter.add(panelEnterData);

		cButton = new JxButton();
		cButton.setArc(0.6f);
		cButton.setBackground(Color.WHITE);
		cButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				focusedComponent.setText("");
			}
		});
		cButton.setBounds(18, 0, 50, 50);
		cButton.setHorizontalAlignment(SwingConstants.CENTER);
		cButton.setIconTextGap(5);
		cButton.setMargin(new Insets(2, 14, 2, 14));
		cButton.setPreferredSize(new Dimension(50, 50));
		cButton.setText("C");
		cButton.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		cButton.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		cButton.setFont(new Font("", Font.BOLD, 12));
		panelEnterData.add(cButton);

		btnZero = new JxButton();
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				focusedComponent.setText(focusedComponent.getText().concat(
						0 + ""));
			}
		});
		btnZero.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnZero.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnZero.setFont(new Font("", Font.BOLD, 12));
		btnZero.setArc(0.6f);
		btnZero.setBounds(78, 0, 50, 50);
		btnZero.setPreferredSize(new Dimension(50, 50));
		btnZero.setText("0");
		panelEnterData.add(btnZero);

		btnEnterData = new JxButton();
		btnEnterData.setArc(0.6f);

		btnEnterData.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnEnterData.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnEnterData.setFont(new Font("", Font.BOLD, 12));
		btnEnterData.setBounds(136, 0, 118, 50);
		btnEnterData.addActionListener(new ActionListener() {

			private PanelReWeigh reWghPanel;
			private SaveMode savingMode;

			public void actionPerformed(ActionEvent e) {
				if (mode.equals(Mode.WEIGHT)) {
					if (doValidate()) {
						doSave();
						close();
					} else {
						reWghPanel = new PanelReWeigh();
						SwingUtils.openInDialogUnDecorated(reWghPanel, null);
						savingMode = reWghPanel.getSaveMode();
						if (savingMode != null) {
							if (savingMode.equals(SaveMode.REWEIGH)) {

								txtWeight.setText("");
							} else if (savingMode.equals(SaveMode.SAVE)) {

								doSave();
								close();
							} else if (savingMode
									.equals(SaveMode.SAVE_AND_REWEIGH)) {
								txtWeight.setText("");
								doSave();
							}
						}
					}
				} else if (mode.equals(Mode.VITAL)) {
					if (doValidate()) {
						doSave();
						close();
					}
				} else if (mode.equals(Mode.RESIDENT_ASSESSMENT)) {
					updateResidentAssessmentVital();
				}

			}

		});
		btnEnterData.setPreferredSize(new Dimension(100, 50));
		btnEnterData.setVerticalTextPosition(SwingConstants.CENTER);
		btnEnterData.setVerticalAlignment(SwingConstants.CENTER);
		btnEnterData.setText("OK");
		panelEnterData.add(btnEnterData);

		dcDate = new JDateChooser();
		dcDate.setDateFormatString("MM/dd/yyyy");
		dcDate.setDate(MedrexClientManager.getServerTime());
		dcDate.setBounds(131, 231, 124, 20);
		dcDate.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		dcDate.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		dcDate.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		dcDate.setFont(new Font("", Font.PLAIN, 10));
		panelCenter.add(dcDate);
		dcDate.setOpaque(false);
		// JComponent c = (JComponent)dcDate.getComponent(1);

		final JLabel dateLabel = new JLabel();
		dateLabel.setFont(new Font("", Font.BOLD, 12));
		dateLabel.setText("Record Date : ");
		dateLabel.setBounds(22, 231, 99, 16);
		panelCenter.add(dateLabel);

		panel = new JPanel();
		panel.setOpaque(false);
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(0, 50));
		panelMain.add(panel, BorderLayout.SOUTH);

		rbWheelChair = new JRadioButton();
		rbWheelChair.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (rbWheelChair.isSelected()) {
					txtAmbulation.setText(getAmbulationWeight(SwingUtils
							.getSelectedButton(bgTraveller))
							+ "");
					doCalculateNetWeight();
					doUpdateAmbulation(rbWheelChair.getText());
				}
			}
		});
		rbWheelChair.setBackground(Color.WHITE);
		rbWheelChair.setActionCommand("1");
		bgTraveller.add(rbWheelChair);
		rbWheelChair.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		rbWheelChair.setFont(new Font("", Font.BOLD, 12));
		rbWheelChair.setOpaque(false);
		rbWheelChair.setText("Weel Chair");
		rbWheelChair.setBounds(24, 15, 89, 24);
		panel.add(rbWheelChair);

		rbChair = new JRadioButton();
		rbChair.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (rbChair.isSelected()) {
					txtAmbulation.setText(getAmbulationWeight(SwingUtils
							.getSelectedButton(bgTraveller))
							+ "");
					doCalculateNetWeight();
					doUpdateAmbulation(rbChair.getText());
				}
			}
		});
		rbChair.setBackground(Color.WHITE);
		rbChair.setActionCommand("2");
		rbChair.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		rbChair.setFont(new Font("", Font.BOLD, 12));
		bgTraveller.add(rbChair);
		rbChair.setOpaque(false);
		rbChair.setText("Chair");
		rbChair.setBounds(119, 15, 63, 24);
		panel.add(rbChair);

		rbBedScale = new JRadioButton();
		rbBedScale.setBackground(Color.WHITE);
		rbBedScale.setActionCommand("3");
		rbBedScale.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (rbBedScale.isSelected()) {
					txtAmbulation.setText(getAmbulationWeight(SwingUtils
							.getSelectedButton(bgTraveller))
							+ "");
					doCalculateNetWeight();
					doUpdateAmbulation(rbBedScale.getText());
				}
			}
		});
		rbBedScale.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		bgTraveller.add(rbBedScale);
		rbBedScale.setFont(new Font("", Font.BOLD, 12));
		rbBedScale.setOpaque(false);
		rbBedScale.setText("Bed Scale");
		rbBedScale.setBounds(188, 15, 82, 24);
		panel.add(rbBedScale);

		rbWalker = new JRadioButton();
		rbWalker.setBackground(Color.WHITE);
		rbWalker.setActionCommand("4");
		rbWalker.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (rbWalker.isSelected()) {
					txtAmbulation.setText(getAmbulationWeight(SwingUtils
							.getSelectedButton(bgTraveller))
							+ "");
					doCalculateNetWeight();
					doUpdateAmbulation(rbWalker.getText());
				}
			}
		});
		rbWalker.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		rbWalker.setFont(new Font("", Font.BOLD, 12));
		bgTraveller.add(rbWalker);
		rbWalker.setOpaque(false);
		rbWalker.setText("Walker");
		rbWalker.setBounds(276, 15, 75, 24);
		panel.add(rbWalker);

		rbHoyerLift = new JRadioButton();
		rbHoyerLift.setBackground(Color.WHITE);
		rbHoyerLift.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (rbHoyerLift.isSelected()) {
					txtAmbulation.setText(getAmbulationWeight(SwingUtils
							.getSelectedButton(bgTraveller))
							+ "");
					doCalculateNetWeight();
					doUpdateAmbulation(rbHoyerLift.getText());
				}
			}
		});
		rbHoyerLift.setActionCommand("5");
		rbHoyerLift.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		rbHoyerLift.setFont(new Font("", Font.BOLD, 12));
		bgTraveller.add(rbHoyerLift);
		rbHoyerLift.setOpaque(false);
		rbHoyerLift.setText("Hoyer Lift");
		rbHoyerLift.setBounds(357, 15, 89, 24);
		panel.add(rbHoyerLift);

		final JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setPreferredSize(new Dimension(0, 10));
		panelMain.add(panel_1, BorderLayout.NORTH);

		/*
		 * String date = new
		 * SimpleDateFormat("dd/MM/yyyy").format(MedrexClientManager
		 * .getServerTime()); JTextField t = (JTextField) c; t.setText(date);
		 */
		btnArr = new JxButton[15];
		for (int i = 0; i < 9; i++) {
			final int index = i;
			btnArr[i] = new JxButton();

			btnArr[i].addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					String val = btnArr[index].getText();

					focusedComponent.setText(focusedComponent.getText().concat(
							val));
					doCalculateNetWeight();
				}
			});
			btnArr[i].setBackground(Color.WHITE);
			btnArr[i].setBackground(GuiModes.DESIGNER_FORMS
					.getControlBackgroundColor());
			btnArr[i].setForeground(GuiModes.DESIGNER_FORMS
					.getControlForegroundColor());
			btnArr[i].setFont(new Font("", Font.BOLD, 12));
			btnArr[i].setArc(0.6f);
			btnArr[i].setMargin(new Insets(2, 14, 2, 14));
			btnArr[i].setPreferredSize(new Dimension(50, 50));
			btnArr[i].setText((i + 1) + "");
			panelButtons.add(btnArr[i]);

		}

		// presentationModel = new PresentationModel(presentationMap,
		// ResidentVitalSigns.class, residentVitalController, null);
		// presentationModel.validateAll();
		doUpdate();
	}

	private void doCalculateNetWeight() {
		double weightnum = 0.0;
		double ambnum = 0.0;
		if (((!"".equalsIgnoreCase(txtWeight.getText())))) {
			if (!"".equalsIgnoreCase(txtAmbulation.getText())) {
				weightnum = Double.parseDouble(txtWeight.getText());
				ambnum = Double.parseDouble(txtAmbulation.getText());
			} else {
				weightnum = Double.parseDouble(txtWeight.getText());
				ambnum = 0.0;
			}
			txtnetWeight.setText((weightnum - ambnum) + "");
		}
	}

	private boolean doValidate() {
		if (mode.equals(Mode.VITAL)) {
			/*
			 * if(txtTemprature.getText().equalsIgnoreCase("")){ return false; }
			 * if(txtBP.getText().equalsIgnoreCase("")){ return false; }
			 * if(txtPulse.getText().equalsIgnoreCase("")){ return false; }
			 * return true;
			 */
		}
		if (mode.equals(Mode.WEIGHT)) {
			/*
			 * if(txtWeight.getText().equalsIgnoreCase("")){ return false; }
			 */
			try {
				ResidentWeight resWeight = MedrexClientManager.getInstance()
						.getResidentLatestWeight(Global.currentResidenceKey);
				if (resWeight != null) {
					double weight = resWeight.getWeight();
					if (txtWeight.getText().equalsIgnoreCase("")) {
						return false;
					}
					if (!txtWeight.getText().equalsIgnoreCase("")) {
						if ((Double.parseDouble(txtWeight.getText())
								- Double.parseDouble(txtAmbulation.getText()) < (weight - 4.9) || Double
								.parseDouble(txtWeight.getText())
								- Double.parseDouble(txtAmbulation.getText()) > (weight + 4.9))) {
							return false;
						}
					}
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
			return true;
		}
		return true;
	}

	private void doUpdate() {
		if (mode.equals(Mode.WEIGHT)) {
			txtTemprature.setVisible(false);
			txtBP.setVisible(false);
			txtPulse.setVisible(false);
			tempratureLabel.setVisible(false);
			pulseLabel.setVisible(false);
			bpLabel.setVisible(false);

			weightLabel.setVisible(true);
			txtWeight.setVisible(true);
			panel.setVisible(true);
			ambulationLabel.setVisible(true);
			txtAmbulation.setVisible(true);
			netWeighttLabel.setVisible(true);
			txtnetWeight.setVisible(true);

			if (Global.currentResidentWeightKey != 0) {
				ResidentWeight rw = null;
				try {
					rw = MedrexClientManager.getInstance()
							.getResidentWeightRecord(
									Global.currentResidentWeightKey);
				} catch (Exception e) {

					e.printStackTrace();
				}
				txtWeight.setText(rw.getWeight()
						+ getAmbulationWeight(rw.getAmbulationType()) + "");
				int ampbulationType = rw.getAmbulationType();
				SwingUtils.setSelectedButton(bgTraveller, rw
						.getAmbulationType());
				txtAmbulation
						.setText(getAmbulationWeight(ampbulationType) + "");
				dcDate.setDate(rw.getDateOfCreation());
			} else {
				txtAmbulation.setText(0.0 + "");
			}

		}
		if (mode.equals(Mode.VITAL)) {
			txtTemprature.setVisible(true);
			txtBP.setVisible(true);
			txtPulse.setVisible(true);
			tempratureLabel.setVisible(true);
			pulseLabel.setVisible(true);
			bpLabel.setVisible(true);

			txtWeight.setVisible(false);
			weightLabel.setVisible(false);
			panel.setVisible(false);
			ambulationLabel.setVisible(false);
			txtAmbulation.setVisible(false);
			netWeighttLabel.setVisible(false);
			txtnetWeight.setVisible(false);

			if (Global.currentVitalSignKey == 0) {

			} else {
				try {
					ResidentVitalSigns vSigns = MedrexClientManager
							.getInstance().getVitalSign(
									Global.currentVitalSignKey);
					txtTemprature.setText(vSigns.getTemprature() + "");
					txtPulse.setText(vSigns.getPulse() + "");
					txtBP.setText(vSigns.getBp() + "");
					dcDate.setDate(vSigns.getDateCreated());

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		if (mode.equals(Mode.RESIDENT_ASSESSMENT)) {
			txtAmbulation.setVisible(false);
			ambulationLabel.setVisible(false);
			netWeighttLabel.setVisible(false);
			txtnetWeight.setVisible(false);
			if (comp != null
					&& comp instanceof PanelResidentAssessmentFormPage1) {
				PanelResidentAssessmentFormPage1 panel = (PanelResidentAssessmentFormPage1) comp;
				ResidentVitalSigns vitals = panel.getVitals();
				txtTemprature.setText(vitals.getTemprature() + "");
				txtBP.setText(vitals.getBp() + "");
				txtPulse.setText(vitals.getPulse() + "");
				txtWeight.setText(vitals.getWeight() + "");
			}
		}

	}

	protected void doSave() {
		new ResidentVitalSigns();
		new ResidentWeight();
		if (mode.equals(Mode.VITAL)) {

			ResidentVitalSigns rVital = new ResidentVitalSigns();
			rVital.setSerial(Global.currentVitalSignKey);
			if (!txtTemprature.getText().equalsIgnoreCase("")) {
				rVital.setTemprature(Double
						.parseDouble(txtTemprature.getText()));
			} else {
				rVital.setTemprature(0.0);
			}
			if (!txtPulse.getText().equalsIgnoreCase("")) {
				rVital.setPulse(Integer.parseInt(txtPulse.getText()));
			} else {
				rVital.setPulse(0);
			}
			if (!txtBP.getText().equalsIgnoreCase("")) {
				rVital.setBp(txtBP.getText());
			} else {
				rVital.setBp("");
			}
			rVital.setAmbulation(SwingUtils.getSelectedButton(bgTraveller));
			rVital.setRemarks("OK");
			rVital.setDateCreated(dcDate.getDate());
			rVital.setResidentId(Global.currentResidenceKey);
			Users user = null;

			/*
			 * List errors = residentVitalController.doValidate(vital, "");
			 * 
			 * if (errors.size() > 0) { MsgBox m = new MsgBox(); Iterator itr =
			 * errors.iterator(); String strError = ""; while (itr.hasNext()) {
			 * strError += (String) itr.next() + "\n"; } m.addPrompt(strError);
			 * m.setTitle("Error Saving Vital Info"); m.setVisible(true); }
			 * else{
			 */
			try {
				user = MedrexClientManager.getInstance().getUser(
						Global.currentLoggedInUserKey);
				rVital.setUser(user);
				Global.currentVitalSignKey = MedrexClientManager.getInstance()
						.insertOrUpdateVitals(rVital);
			} catch (Exception e) {
				e.printStackTrace();
			}
			// }
		}
		if (mode.equals(Mode.WEIGHT)) {

			ResidentWeight rw = new ResidentWeight();
			rw.setDateOfCreation(dcDate.getDate());
			if (!"".equalsIgnoreCase(txtAmbulation.getText())
					&& !(txtWeight.getText().equalsIgnoreCase(""))) {
				double ambulationWeight = Double.parseDouble(txtAmbulation
						.getText());
				double totalWeightMeasured = Double.parseDouble(txtWeight
						.getText());
				rw.setWeight(totalWeightMeasured - ambulationWeight);
				rw.setAmbulationType(SwingUtils.getSelectedButton(bgTraveller));
			} else {
				rw.setWeight(0.0);
				rw.setAmbulationType(0);
			}
			try {
				rw.setUser(MedrexClientManager.getInstance().getUser(
						Global.currentLoggedInUserKey));
			} catch (Exception e) {

				e.printStackTrace();
			}
			rw.setResidentId(Global.currentResidenceKey);
			rw.setSerial(Global.currentResidentWeightKey);
			/*
			 * List errors = residentVitalController.doValidate(weight, "");
			 * 
			 * if (errors.size() > 0) { MsgBox m = new MsgBox(); Iterator itr =
			 * errors.iterator(); String strError = ""; while (itr.hasNext()) {
			 * strError += (String) itr.next() + "\n"; } m.addPrompt(strError);
			 * m.setTitle("Error Saving Weight Info"); m.setVisible(true); }
			 * else{
			 */
			try {
				Global.currentResidentWeightKey = MedrexClientManager
						.getInstance().insertOrUpdateResidentWeight(rw);
			} catch (Exception e) {

				e.printStackTrace();
			}
			/* } */
			saveAlertMessages("Resident Weight Info !!!!");
		}

	}

	/*
	 * public static void main(String args[]){ JFrame frm = new
	 * JFrame("Value Editor");
	 * frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 * frm.getContentPane().add(new JxValueSelector()); frm.setVisible(true);
	 * frm.setSize(new Dimension(500,400)); // SwingUtils.wrapInDialog(new
	 * JxValueSelector()).setVisible(true); JxValueSelector vSel = new
	 * JxValueSelector(Mode.VITAL); SwingUtils.openInDialog(vSel);
	 * vSel.setVisible(true);
	 * 
	 * // JDialog d = new JDialog(); // SwingUtils.center(d); // d.add(vSel); //
	 * d.setUndecorated(true); // d.setSize(new Dimension(530,350)); //
	 * d.setVisible(true); }
	 */
	public interface ColorsWidget {
		public static Color cream = new Color(234, 234, 234);
		public static Color voilet = new Color(107, 90, 141);
		public static Color btnBack = new Color(205, 196, 199);
		public static Color boundary = new Color(153, 97, 69);
	}

	@Override
	public String getTitle() {

		return "Value Editor";
	}

	private void saveAlertMessages(String formName) {
		List<ValidationResult> vResList = new ArrayList<ValidationResult>();
		// for previous one month.
		int previousMonths = 1;
		ValidationResult vResOneMonth = null;
		ValidationResult vResSixMonth = null;
		try {
			ResidentWeight resWeightOneMonthBefore = MedrexClientManager
					.getInstance().getPreviousResidentWeightRecord(
							Global.currentResidenceKey, previousMonths);
			if (resWeightOneMonthBefore != null) {
				double weight = resWeightOneMonthBefore.getWeight();
				double perc = (weight * 0.05);
				double minRange = weight - perc;
				double maxRange = weight + perc;
				vResOneMonth = checkWeightRange(txtWeight, "Weight", minRange,
						maxRange, weight, perc, "One");
			}
			// for previous six months
			previousMonths = 6;
			ResidentWeight resWeightSixMonthsBefore = MedrexClientManager
					.getInstance().getPreviousResidentWeightRecord(
							Global.currentResidenceKey, previousMonths);
			if (resWeightSixMonthsBefore != null) {
				double weight = resWeightSixMonthsBefore.getWeight();
				double perc = (weight * 0.10);
				double minRange = weight - perc;
				double maxRange = weight + perc;
				vResSixMonth = checkWeightRange(txtWeight, "Weight", minRange,
						maxRange, weight, perc, "Six");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (vResSixMonth != null) {
			vResOneMonth.addWarning(vResSixMonth.getMessagesText());
		}
		if (vResOneMonth != null) {
			vResList.add(vResOneMonth);
		}

		/**
		 * Message Sender -class for sending messages containing Methods -
		 * getRecievers, send Message
		 **/
		MessageSender.sendMessage(vResList, formName, "Administrator");

	}

	public ValidationResult checkWeightRange(JTextField f, String name,
			double min, double max, double previousWeight, double changeperc,
			String months) {
		PropertyValidationSupport supp = new PropertyValidationSupport(f, name);
		if (!("".equalsIgnoreCase(f.getText()))) {
			double value = Double.parseDouble(f.getText());
			if (!((value > min) && (value < max)))

				if (months.equalsIgnoreCase("One")) {
					supp.addWarning(name, "has been changed from "
							+ previousWeight + " to " + value + " in last "
							+ months + " Month by : " + changeperc
							+ " Unit (5%)");
				}
			if (months.equalsIgnoreCase("Six")) {
				supp.addWarning(name, "has been changed from " + previousWeight
						+ " to " + value + " in last " + months
						+ " Month by : " + changeperc + " Unit (10%)");
			}

		}

		return supp.getResult();
	}

	private void updateResidentAssessmentVital() {
		JComponent comp = this.comp;
		if (comp != null && comp instanceof PanelResidentAssessmentFormPage1) {
			PanelResidentAssessmentFormPage1 panel = (PanelResidentAssessmentFormPage1) comp;

			ResidentVitalSigns vitals = new ResidentVitalSigns();
			if (!txtTemprature.getText().equalsIgnoreCase("")) {
				vitals.setTemprature(Double
						.parseDouble(txtTemprature.getText()));
			} else {
				vitals.setTemprature(0.0);
			}
			if (!txtTemprature.getText().equalsIgnoreCase("")) {
				vitals.setBp(txtBP.getText());
			} else {
				vitals.setBp("");
			}
			if (!txtTemprature.getText().equalsIgnoreCase("")) {
				vitals.setPulse(Integer.parseInt(txtPulse.getText()));
			} else {
				vitals.setPulse(0);
			}
			if (!txtWeight.getText().equalsIgnoreCase("")) {
				vitals.setWeight(Double.parseDouble(txtWeight.getText()));
			} else {
				vitals.setWeight(0.0);
			}
			panel.setVitals(vitals);
			this.close();
		}
	}

	public double getAmbulationWeight(int ampbulationType) {
		List<AmbulationWeight> ambList = null;
		double weight = 0.0;
		try {
			ambList = MedrexClientManager.getInstance().getAmbulationWeights();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (AmbulationWeight amb : ambList) {
			// wheel chair
			if (ampbulationType == 1
					&& ("Weel Chair".equalsIgnoreCase(amb.getAmbulationType()))) {
				weight = amb.getWeight();
			}
			// chair
			if (ampbulationType == 2
					&& ("Chair".equalsIgnoreCase(amb.getAmbulationType()))) {
				weight = amb.getWeight();
			}
			// bed Scale
			if (ampbulationType == 3
					&& ("Bed Scale".equalsIgnoreCase(amb.getAmbulationType()))) {
				weight = amb.getWeight();
			}
			// walker
			if (ampbulationType == 4
					&& ("Walker".equalsIgnoreCase(amb.getAmbulationType()))) {
				weight = amb.getWeight();
			}
			// hoyer Lift
			if (ampbulationType == 5
					&& ("Hoyer Lift".equalsIgnoreCase(amb.getAmbulationType()))) {
				weight = amb.getWeight();
			}
		}
		return weight;
	}

	public enum Mode {
		WEIGHT, VITAL, RESIDENT_ASSESSMENT;
	}

	private void doUpdateAmbulation(String ambType) {
		ambulationLabel.setText(ambType);
	}
}
