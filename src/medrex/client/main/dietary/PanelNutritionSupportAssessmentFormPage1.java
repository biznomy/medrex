package medrex.client.main.dietary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.NumberFormat;

import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldFormatter;
import medrex.commons.intf.Form;
import medrex.commons.vo.dietary.NutritionSupportAssessmentFormPage1;

import com.toedter.calendar.JDateChooser;

public class PanelNutritionSupportAssessmentFormPage1 extends JPanel implements
		Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6127828298415170162L;
	private JTextArea txtPlan;
	private JTextArea txtNutritionAssessment;
	private JTextField txtBeeper;
	private JTextField txtTime;
	private JDateChooser dcDate;
	private JTextField txtDietitan;
	private JTextField txtDietEducation;
	private JCheckBox cbLowRisk;
	private JCheckBox cbModerateRisk;
	private JCheckBox cbHighRisk;
	private JTextField txtNutritionGoal;
	private JTextField txtNutritionDiagnosis;
	private JTextField txtFluidsPerDay;
	private JTextField txtFluids;
	private JTextField txtProteinPerDay;
	private JTextField txtProtein;
	private JTextField txtCaloriesPerDay;
	private JTextField txtCalories;
	private JTextField txtEstimatedNutritionNeeds;
	private JTextField txtPMHX;
	private JTextField txtNutritionFocusedPhysicalExam;
	private JCheckBox cbSe;
	private JCheckBox cbSignificant;
	private JCheckBox cbNAweightLoss;
	private JTextField txtWeightLoss;
	private JCheckBox cbNAweightChange;
	private JTextField txtWeightChange;
	private JCheckBox cbSevere;
	private JCheckBox cbModerate;
	private JCheckBox cbMild;
	private JCheckBox cbMalnutrition;
	private JCheckBox cbWNL;
	private JTextField txtPercentUsualBodyWeight;
	private JTextField txtwtInterpretation;
	private JCheckBox cbwtInterpretation;
	private JCheckBox cbWNLs;
	private JTextField txtBodyMassIndex;
	private JFormattedTextField txtBMI;
	private JTextField txtUsualBodyWeight;
	private JTextField txtAdjustments;
	private JTextField txtDesiredBodyWeight;
	private JFormattedTextField txtHeight;
	private JFormattedTextField txtWeight;
	private JTextField txtLabs;
	private JTextField txtPertinentMedications;
	private JTextField txtProvides;
	private JTextField txtNutritionSupport;

	public PanelNutritionSupportAssessmentFormPage1() {
		super();
		Global.panelNutritionSupportAssessmentForm = this;
		setLayout(null);
		setBackground(Color.WHITE);
		setBounds(0, 0, 928, 949);
		setPreferredSize(new Dimension(900, 950));

		final JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 10, 916, 928);
		add(panel);

		final JPanel panel_3_1_1_2_2 = new JPanel();
		panel_3_1_1_2_2.setBackground(Color.WHITE);
		panel_3_1_1_2_2.setLayout(null);
		panel_3_1_1_2_2.setBounds(10, 10, 875, 30);
		panel.add(panel_3_1_1_2_2);

		final JLabel residentNameLabel_1_1_2_2 = new JLabel();
		residentNameLabel_1_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		residentNameLabel_1_1_2_2.setText("Nutrition Support :");
		residentNameLabel_1_1_2_2.setBounds(10, 5, 143, 20);
		panel_3_1_1_2_2.add(residentNameLabel_1_1_2_2);

		txtNutritionSupport = new JTextField();
		txtNutritionSupport.setBorder(new LineBorder(Color.black, 1, false));
		txtNutritionSupport.setBounds(215, 5, 653, 21);
		panel_3_1_1_2_2.add(txtNutritionSupport);

		final JPanel panel_3_1_1_2_2_1 = new JPanel();
		panel_3_1_1_2_2_1.setBackground(Color.WHITE);
		panel_3_1_1_2_2_1.setLayout(null);
		panel_3_1_1_2_2_1.setBounds(10, 40, 875, 30);
		panel.add(panel_3_1_1_2_2_1);

		final JLabel residentNameLabel_1_1_2_2_1 = new JLabel();
		residentNameLabel_1_1_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		residentNameLabel_1_1_2_2_1.setText("Provides :");
		residentNameLabel_1_1_2_2_1.setBounds(10, 5, 143, 20);
		panel_3_1_1_2_2_1.add(residentNameLabel_1_1_2_2_1);

		txtProvides = new JTextField();
		txtProvides.setBorder(new LineBorder(Color.black, 1, false));
		txtProvides.setBounds(215, 5, 653, 21);
		panel_3_1_1_2_2_1.add(txtProvides);

		final JPanel panel_3_1_1_2_2_1_1 = new JPanel();
		panel_3_1_1_2_2_1_1.setBackground(Color.WHITE);
		panel_3_1_1_2_2_1_1.setLayout(null);
		panel_3_1_1_2_2_1_1.setBounds(10, 70, 875, 30);
		panel.add(panel_3_1_1_2_2_1_1);

		final JLabel residentNameLabel_1_1_2_2_1_1 = new JLabel();
		residentNameLabel_1_1_2_2_1_1
				.setFont(new Font("Tahoma", Font.BOLD, 14));
		residentNameLabel_1_1_2_2_1_1.setText("Pertinent Medications :");
		residentNameLabel_1_1_2_2_1_1.setBounds(10, 5, 187, 20);
		panel_3_1_1_2_2_1_1.add(residentNameLabel_1_1_2_2_1_1);

		txtPertinentMedications = new JTextField();
		txtPertinentMedications
				.setBorder(new LineBorder(Color.black, 1, false));
		txtPertinentMedications.setBounds(215, 5, 653, 21);
		panel_3_1_1_2_2_1_1.add(txtPertinentMedications);

		final JPanel panel_3_1_1_2_2_1_1_1 = new JPanel();
		panel_3_1_1_2_2_1_1_1.setBackground(Color.WHITE);
		panel_3_1_1_2_2_1_1_1.setLayout(null);
		panel_3_1_1_2_2_1_1_1.setBounds(10, 100, 875, 30);
		panel.add(panel_3_1_1_2_2_1_1_1);

		final JLabel residentNameLabel_1_1_2_2_1_1_1 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD,
				14));
		residentNameLabel_1_1_2_2_1_1_1.setText("Labs :");
		residentNameLabel_1_1_2_2_1_1_1.setBounds(10, 5, 187, 20);
		panel_3_1_1_2_2_1_1_1.add(residentNameLabel_1_1_2_2_1_1_1);

		txtLabs = new JTextField();
		txtLabs.setBorder(new LineBorder(Color.black, 1, false));
		txtLabs.setBounds(215, 5, 652, 21);
		panel_3_1_1_2_2_1_1_1.add(txtLabs);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(10, 130, 875, 370);
		panel.add(panel_1);

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setLayout(null);
		panel_2.setBounds(1, 0, 480, 220);
		panel_1.add(panel_2);

		final JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(10, 3, 460, 25);
		panel_2.add(panel_3);

		final JLabel residentNameLabel_1_1_2_2_1_1_1_1 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD,
				14));
		residentNameLabel_1_1_2_2_1_1_1_1.setText("ANTHROPOMETRICS");
		residentNameLabel_1_1_2_2_1_1_1_1.setBounds(10, 5, 187, 20);
		panel_3.add(residentNameLabel_1_1_2_2_1_1_1_1);

		final JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(Color.WHITE);
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(10, 30, 460, 30);
		panel_2.add(panel_3_1);

		final JLabel residentNameLabel_1_1_2_2_1_1_1_1_1 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_1_1_1.setText("Weight");
		residentNameLabel_1_1_2_2_1_1_1_1_1.setBounds(10, 5, 164, 20);
		panel_3_1.add(residentNameLabel_1_1_2_2_1_1_1_1_1);

		txtWeight = new JFormattedTextField(FieldFormatter.FLOAT3Dizit);
		txtWeight.setText("" + 0);
		txtWeight.setBorder(new LineBorder(Color.black, 1, false));
		txtWeight.setBounds(214, 6, 236, 18);
		panel_3_1.add(txtWeight);
		txtWeight.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				JTextField textField = (JTextField) e.getSource();
				String text = textField.getText();
				// if((e.getKeyCode()>=48 && e.getKeyCode()<=57)
				// ||(e.getKeyCode()>=96 && e.getKeyCode()<=105)
				// ||e.getKeyCode()==46
				// ||e.getKeyCode()==8){
				txtBMI.setText(text);
				// txtHeight.setText(""+0);
				// }
				// else{
				// txtBMI.setText(""+0);
				// txtWeight.setText(""+0);
				// }
			}
		});

		// txtBMI.getText());
		// currentNumberFormat = NumberFormat.getNumberInstance(currentLocale);
		// Number n = currentNumberFormat.parse(s);
		//         

		txtWeight.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(final FocusEvent e) {
				if (txtWeight.getText().equals("")) {
					txtWeight.setText("" + 0);
					txtBMI.setText("" + 0);
				} else {
					NumberFormat numberFormat = NumberFormat.getInstance();
					numberFormat.setMaximumFractionDigits(2);
					try {
						txtBMI.setText(numberFormat.format(Double
								.valueOf(txtWeight.getText())
								/ (Double.valueOf(txtHeight.getText()) * Double
										.valueOf(txtHeight.getText())))
								+ "");
					} catch (NumberFormatException ex) {
						System.out
								.println("Entered Wrong Input for weight or Height");
					}
				}
			}
		});
		final JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBackground(Color.WHITE);
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBounds(10, 60, 460, 30);
		panel_2.add(panel_3_1_1);

		final JLabel residentNameLabel_1_1_2_2_1_1_1_1_1_1 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_1_1_1_1.setText("Height");
		residentNameLabel_1_1_2_2_1_1_1_1_1_1.setBounds(10, 5, 164, 20);
		panel_3_1_1.add(residentNameLabel_1_1_2_2_1_1_1_1_1_1);

		txtHeight = new JFormattedTextField(FieldFormatter.FLOAT1Dizit);
		txtHeight.setText("" + 0);
		txtHeight.setBorder(new LineBorder(Color.black, 1, false));
		txtHeight.setBounds(214, 6, 236, 18);
		panel_3_1_1.add(txtHeight);
		txtHeight.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				JTextField textField = (JTextField) e.getSource();
				String text = textField.getText();
				// if(txtWeight.getText().equals(""))
				txtBMI.setText(text);
				// else
				// txtBMI.setText(txtWeight.getText()+" X "+ "("+
				// text+" X "+text+")");
				// if((e.getKeyCode()>=48 && e.getKeyCode()<=57)
				// ||(e.getKeyCode()>=96 && e.getKeyCode()<=105)
				// ||e.getKeyCode()==46
				// ||e.getKeyCode()==8){
				// try{
				// if(txtHeight.getText().equals("")){
				// txtBMI.setText(""+0);
				// }else{
				// txtBMI.setText(Double.valueOf(txtWeight.getText())/(Double.valueOf(txtHeight.getText())*Double.valueOf(txtHeight.getText()))+"");
				// }
				// }catch(NumberFormatException nfex){
				// System.out.println("Wrong Value Entered for height or weight");
				// }
				// }
				// else{
				// txtHeight.setText(""+0);
				// txtBMI.setText(txtWeight.getText());
				// }
			}
		});
		txtHeight.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(final FocusEvent e) {
				if (txtHeight.getText().equals("")) {
					txtHeight.setText("" + 0);
					txtBMI.setText("" + 0);
				} else {
					NumberFormat numberFormat = NumberFormat.getInstance();
					numberFormat.setMaximumFractionDigits(2);
					try {
						txtBMI.setText(numberFormat.format(Double
								.valueOf(txtWeight.getText())
								/ (Double.valueOf(txtHeight.getText()) * Double
										.valueOf(txtHeight.getText())))
								+ "");
					} catch (NumberFormatException ex) {
						System.out
								.println("Entered Wrong Input for weight or Height");
					}
				}
			}
		});
		final JPanel panel_3_1_1_1 = new JPanel();
		panel_3_1_1_1.setBackground(Color.WHITE);
		panel_3_1_1_1.setLayout(null);
		panel_3_1_1_1.setBounds(10, 90, 460, 30);
		panel_2.add(panel_3_1_1_1);

		final JLabel residentNameLabel_1_1_2_2_1_1_1_1_1_1_1 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_1_1_1_1_1.setText("Desired Body Weight");
		residentNameLabel_1_1_2_2_1_1_1_1_1_1_1.setBounds(10, 5, 164, 20);
		panel_3_1_1_1.add(residentNameLabel_1_1_2_2_1_1_1_1_1_1_1);

		txtDesiredBodyWeight = new JTextField();
		txtDesiredBodyWeight.setBorder(new LineBorder(Color.black, 1, false));
		txtDesiredBodyWeight.setBounds(214, 6, 236, 18);
		panel_3_1_1_1.add(txtDesiredBodyWeight);

		final JPanel panel_3_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1.setBackground(Color.WHITE);
		panel_3_1_1_1_1.setLayout(null);
		panel_3_1_1_1_1.setBounds(10, 120, 460, 30);
		panel_2.add(panel_3_1_1_1_1);

		final JLabel residentNameLabel_1_1_2_2_1_1_1_1_1_1_1_1 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_1_1_1_1_1_1.setText("Adjustments");
		residentNameLabel_1_1_2_2_1_1_1_1_1_1_1_1.setBounds(10, 5, 164, 20);
		panel_3_1_1_1_1.add(residentNameLabel_1_1_2_2_1_1_1_1_1_1_1_1);

		txtAdjustments = new JTextField();
		txtAdjustments.setBorder(new LineBorder(Color.black, 1, false));
		txtAdjustments.setBounds(214, 6, 236, 18);
		panel_3_1_1_1_1.add(txtAdjustments);

		final JPanel panel_3_1_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1_1.setBackground(Color.WHITE);
		panel_3_1_1_1_1_1.setLayout(null);
		panel_3_1_1_1_1_1.setBounds(10, 150, 460, 30);
		panel_2.add(panel_3_1_1_1_1_1);

		final JLabel residentNameLabel_1_1_2_2_1_1_1_1_1_1_1_1_1 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_1_1_1_1_1_1_1
				.setText("Usual Body Weight");
		residentNameLabel_1_1_2_2_1_1_1_1_1_1_1_1_1.setBounds(10, 5, 164, 20);
		panel_3_1_1_1_1_1.add(residentNameLabel_1_1_2_2_1_1_1_1_1_1_1_1_1);

		txtUsualBodyWeight = new JTextField();
		txtUsualBodyWeight.setBorder(new LineBorder(Color.black, 1, false));
		txtUsualBodyWeight.setBounds(214, 6, 236, 18);
		panel_3_1_1_1_1_1.add(txtUsualBodyWeight);

		final JPanel panel_3_1_1_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_3_1_1_1_1_1_1.setLayout(null);
		panel_3_1_1_1_1_1_1.setBounds(10, 180, 460, 30);
		panel_2.add(panel_3_1_1_1_1_1_1);

		final JLabel residentNameLabel_1_1_2_2_1_1_1_1_1_1_1_1_1_1 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_1_1_1_1_1_1_1_1.setText("BMI");
		residentNameLabel_1_1_2_2_1_1_1_1_1_1_1_1_1_1.setBounds(10, 5, 164, 20);
		panel_3_1_1_1_1_1_1.add(residentNameLabel_1_1_2_2_1_1_1_1_1_1_1_1_1_1);

		txtBMI = new JFormattedTextField(FieldFormatter.FLOAT3Dizit);
		txtBMI.setText("" + 0);
		txtBMI.setBorder(new LineBorder(Color.black, 1, false));
		txtBMI.setBounds(214, 6, 236, 18);
		panel_3_1_1_1_1_1_1.add(txtBMI);

		final JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(480, 0, 387, 220);
		panel_1.add(panel_2_1);

		final JPanel panel_3_2 = new JPanel();
		panel_3_2.setBackground(Color.WHITE);
		panel_3_2.setLayout(null);
		panel_3_2.setBounds(10, 3, 356, 25);
		panel_2_1.add(panel_3_2);

		final JLabel residentNameLabel_1_1_2_2_1_1_1_1_2 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_1_1_2.setFont(new Font("Tahoma",
				Font.BOLD, 14));
		residentNameLabel_1_1_2_2_1_1_1_1_2.setText("WEIGHT INTERPRETATION");
		residentNameLabel_1_1_2_2_1_1_1_1_2.setBounds(10, 5, 230, 20);
		panel_3_2.add(residentNameLabel_1_1_2_2_1_1_1_1_2);

		final JPanel panel_3_1_2 = new JPanel();
		panel_3_1_2.setBackground(Color.WHITE);
		panel_3_1_2.setLayout(null);
		panel_3_1_2.setBounds(10, 30, 350, 30);
		panel_2_1.add(panel_3_1_2);

		final JLabel residentNameLabel_1_1_2_2_1_1_1_1_1_2 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_1_1_1_2.setText("Body Mass Index :");
		residentNameLabel_1_1_2_2_1_1_1_1_1_2.setBounds(10, 5, 89, 20);
		panel_3_1_2.add(residentNameLabel_1_1_2_2_1_1_1_1_1_2);

		txtBodyMassIndex = new JTextField();
		txtBodyMassIndex.setBorder(new LineBorder(Color.black, 1, false));
		txtBodyMassIndex.setBounds(129, 6, 112, 18);
		panel_3_1_2.add(txtBodyMassIndex);

		cbWNLs = new JCheckBox();
		cbWNLs.setBorder(new LineBorder(Color.black, 1, false));
		cbWNLs.setBackground(Color.WHITE);
		cbWNLs.setText("WNLs");
		cbWNLs.setBounds(262, 5, 71, 22);
		panel_3_1_2.add(cbWNLs);

		final JPanel panel_3_1_1_2 = new JPanel();
		panel_3_1_1_2.setBackground(Color.WHITE);
		panel_3_1_1_2.setLayout(null);
		panel_3_1_1_2.setBounds(10, 60, 367, 30);
		panel_2_1.add(panel_3_1_1_2);

		txtwtInterpretation = new JTextField();
		txtwtInterpretation.setBorder(new LineBorder(Color.black, 1, false));
		txtwtInterpretation.setBounds(130, 6, 216, 18);
		panel_3_1_1_2.add(txtwtInterpretation);

		cbwtInterpretation = new JCheckBox();
		cbwtInterpretation.setBorder(new LineBorder(Color.black, 1, false));
		cbwtInterpretation.setBackground(Color.WHITE);
		cbwtInterpretation.setText("");
		cbwtInterpretation.setBounds(10, 4, 21, 22);
		panel_3_1_1_2.add(cbwtInterpretation);

		final JPanel panel_3_1_1_1_2 = new JPanel();
		panel_3_1_1_1_2.setBackground(Color.WHITE);
		panel_3_1_1_1_2.setLayout(null);
		panel_3_1_1_1_2.setBounds(10, 90, 367, 30);
		panel_2_1.add(panel_3_1_1_1_2);

		final JLabel residentNameLabel_1_1_2_2_1_1_1_1_1_1_1_2 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		residentNameLabel_1_1_2_2_1_1_1_1_1_1_1_2
				.setText("% Usual Body Weight");
		residentNameLabel_1_1_2_2_1_1_1_1_1_1_1_2.setBounds(10, 5, 114, 20);
		panel_3_1_1_1_2.add(residentNameLabel_1_1_2_2_1_1_1_1_1_1_1_2);

		txtPercentUsualBodyWeight = new JTextField();
		txtPercentUsualBodyWeight.setBorder(new LineBorder(Color.black, 1,
				false));
		txtPercentUsualBodyWeight.setBounds(130, 6, 49, 18);
		panel_3_1_1_1_2.add(txtPercentUsualBodyWeight);

		cbWNL = new JCheckBox();
		cbWNL.setOpaque(false);
		cbWNL.setText("WNL");
		cbWNL.setBounds(185, 5, 71, 22);
		panel_3_1_1_1_2.add(cbWNL);

		cbMalnutrition = new JCheckBox();
		cbMalnutrition.setOpaque(false);
		cbMalnutrition.setText("Malnutrition");
		cbMalnutrition.setBounds(262, 3, 114, 22);
		panel_3_1_1_1_2.add(cbMalnutrition);

		final JPanel panel_3_1_1_1_1_2 = new JPanel();
		panel_3_1_1_1_1_2.setBackground(Color.WHITE);
		panel_3_1_1_1_1_2.setLayout(null);
		panel_3_1_1_1_1_2.setBounds(10, 120, 367, 30);
		panel_2_1.add(panel_3_1_1_1_1_2);

		cbMild = new JCheckBox();
		cbMild.setOpaque(false);
		cbMild.setText("Mild (85-95%)");
		cbMild.setBounds(10, 0, 110, 22);
		panel_3_1_1_1_1_2.add(cbMild);

		cbModerate = new JCheckBox();
		cbModerate.setOpaque(false);
		cbModerate.setActionCommand("");
		cbModerate.setText("Moderate(75-84%)");
		cbModerate.setBounds(126, 0, 130, 22);
		panel_3_1_1_1_1_2.add(cbModerate);

		cbSevere = new JCheckBox();
		cbSevere.setOpaque(false);
		cbSevere.setText("Severe(65-74%)");
		cbSevere.setBounds(262, 0, 131, 22);
		panel_3_1_1_1_1_2.add(cbSevere);

		final JPanel panel_3_1_1_1_1_1_2 = new JPanel();
		panel_3_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_3_1_1_1_1_1_2.setLayout(null);
		panel_3_1_1_1_1_1_2.setBounds(10, 150, 367, 30);
		panel_2_1.add(panel_3_1_1_1_1_1_2);

		final JLabel residentNameLabel_1_1_2_2_1_1_1_1_1_1_1_1_1_2 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_1_1_1_1_1_1_1_2.setText("Weight Change");
		residentNameLabel_1_1_2_2_1_1_1_1_1_1_1_1_1_2.setBounds(10, 5, 102, 20);
		panel_3_1_1_1_1_1_2.add(residentNameLabel_1_1_2_2_1_1_1_1_1_1_1_1_1_2);

		txtWeightChange = new JTextField();
		txtWeightChange.setBorder(new LineBorder(Color.black, 1, false));
		txtWeightChange.setBounds(133, 7, 63, 18);
		panel_3_1_1_1_1_1_2.add(txtWeightChange);

		final JLabel mild_2 = new JLabel();
		mild_2.setText("Gain / Loss");
		mild_2.setBounds(208, 5, 69, 20);
		panel_3_1_1_1_1_1_2.add(mild_2);

		cbNAweightChange = new JCheckBox();
		cbNAweightChange.setOpaque(false);
		cbNAweightChange.setText("N/A");
		cbNAweightChange.setBounds(264, 5, 95, 22);
		panel_3_1_1_1_1_1_2.add(cbNAweightChange);

		final JPanel panel_3_1_1_1_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_3_1_1_1_1_1_1_1.setLayout(null);
		panel_3_1_1_1_1_1_1_1.setBounds(10, 180, 375, 30);
		panel_2_1.add(panel_3_1_1_1_1_1_1_1);

		final JLabel residentNameLabel_1_1_2_2_1_1_1_1_1_1_1_1_1_1_1 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_1_1_1_1_1_1_1_1_1
				.setText("% weight Loss");
		residentNameLabel_1_1_2_2_1_1_1_1_1_1_1_1_1_1_1
				.setBounds(10, 5, 86, 20);
		panel_3_1_1_1_1_1_1_1
				.add(residentNameLabel_1_1_2_2_1_1_1_1_1_1_1_1_1_1_1);

		txtWeightLoss = new JTextField();
		txtWeightLoss.setBorder(new LineBorder(Color.black, 1, false));
		txtWeightLoss.setBounds(132, 7, 63, 18);
		panel_3_1_1_1_1_1_1_1.add(txtWeightLoss);

		cbNAweightLoss = new JCheckBox();
		cbNAweightLoss.setOpaque(false);
		cbNAweightLoss.setText("N/A");
		cbNAweightLoss.setBounds(206, 5, 53, 22);
		panel_3_1_1_1_1_1_1_1.add(cbNAweightLoss);

		cbSignificant = new JCheckBox();
		cbSignificant.setOpaque(false);
		cbSignificant.setText("Significant");
		cbSignificant.setBounds(265, 4, 86, 22);
		panel_3_1_1_1_1_1_1_1.add(cbSignificant);

		cbSe = new JCheckBox();
		cbSe.setOpaque(false);
		cbSe.setText("Se");
		cbSe.setBounds(336, 4, 37, 22);
		panel_3_1_1_1_1_1_1_1.add(cbSe);

		final JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setLayout(null);
		panel_4.setBounds(1, 220, 866, 60);
		panel_1.add(panel_4);

		final JPanel panel_3_1_1_2_2_1_1_2 = new JPanel();
		panel_3_1_1_2_2_1_1_2.setBackground(Color.WHITE);
		panel_3_1_1_2_2_1_1_2.setLayout(null);
		panel_3_1_1_2_2_1_1_2.setBounds(2, 2, 861, 28);
		panel_4.add(panel_3_1_1_2_2_1_1_2);

		final JLabel residentNameLabel_1_1_2_2_1_1_2 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_2.setFont(new Font("Tahoma", Font.BOLD,
				12));
		residentNameLabel_1_1_2_2_1_1_2
				.setText("Nutrition Focused Physical exam");
		residentNameLabel_1_1_2_2_1_1_2.setBounds(10, 5, 199, 21);
		panel_3_1_1_2_2_1_1_2.add(residentNameLabel_1_1_2_2_1_1_2);

		txtNutritionFocusedPhysicalExam = new JTextField();
		txtNutritionFocusedPhysicalExam.setBorder(new LineBorder(Color.black,
				1, false));
		txtNutritionFocusedPhysicalExam.setBounds(215, 5, 644, 20);
		panel_3_1_1_2_2_1_1_2.add(txtNutritionFocusedPhysicalExam);

		final JPanel panel_3_1_1_2_2_1_1_2_1 = new JPanel();
		panel_3_1_1_2_2_1_1_2_1.setBackground(Color.WHITE);
		panel_3_1_1_2_2_1_1_2_1.setLayout(null);
		panel_3_1_1_2_2_1_1_2_1.setBounds(2, 28, 861, 28);
		panel_4.add(panel_3_1_1_2_2_1_1_2_1);

		final JLabel residentNameLabel_1_1_2_2_1_1_2_1 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD,
				12));
		residentNameLabel_1_1_2_2_1_1_2_1.setText("PMHX");
		residentNameLabel_1_1_2_2_1_1_2_1.setBounds(10, 5, 187, 20);
		panel_3_1_1_2_2_1_1_2_1.add(residentNameLabel_1_1_2_2_1_1_2_1);

		txtPMHX = new JTextField();
		txtPMHX.setBorder(new LineBorder(Color.black, 1, false));
		txtPMHX.setBounds(215, 5, 643, 20);
		panel_3_1_1_2_2_1_1_2_1.add(txtPMHX);

		final JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(Color.WHITE);
		panel_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1.setLayout(null);
		panel_4_1.setBounds(1, 280, 866, 90);
		panel_1.add(panel_4_1);

		final JPanel panel_3_1_1_2_2_1_1_2_2 = new JPanel();
		panel_3_1_1_2_2_1_1_2_2.setBackground(Color.WHITE);
		panel_3_1_1_2_2_1_1_2_2.setLayout(null);
		panel_3_1_1_2_2_1_1_2_2.setBounds(2, 2, 861, 28);
		panel_4_1.add(panel_3_1_1_2_2_1_1_2_2);

		final JLabel residentNameLabel_1_1_2_2_1_1_2_2 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_2_2.setFont(new Font("Tahoma", Font.BOLD,
				12));
		residentNameLabel_1_1_2_2_1_1_2_2
				.setText("ESTIMATED NUTRITION NEEDS :");
		residentNameLabel_1_1_2_2_1_1_2_2.setBounds(10, 5, 206, 21);
		panel_3_1_1_2_2_1_1_2_2.add(residentNameLabel_1_1_2_2_1_1_2_2);

		txtEstimatedNutritionNeeds = new JTextField();
		txtEstimatedNutritionNeeds.setBorder(new LineBorder(Color.black, 1,
				false));
		txtEstimatedNutritionNeeds.setBounds(288, 6, 568, 20);
		panel_3_1_1_2_2_1_1_2_2.add(txtEstimatedNutritionNeeds);

		final JLabel residentNameLabel_1_1_2_2_1_1_2_1_1 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_2_1_1.setText("Based On");
		residentNameLabel_1_1_2_2_1_1_2_1_1.setBounds(215, 7, 111, 20);
		panel_3_1_1_2_2_1_1_2_2.add(residentNameLabel_1_1_2_2_1_1_2_1_1);

		final JPanel panel_3_1_1_2_2_1_1_2_2_1 = new JPanel();
		panel_3_1_1_2_2_1_1_2_2_1.setBackground(Color.WHITE);
		panel_3_1_1_2_2_1_1_2_2_1.setLayout(null);
		panel_3_1_1_2_2_1_1_2_2_1.setBounds(2, 29, 861, 28);
		panel_4_1.add(panel_3_1_1_2_2_1_1_2_2_1);

		final JLabel residentNameLabel_1_1_2_2_1_1_2_2_1 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_2_2_1.setText("Calories");
		residentNameLabel_1_1_2_2_1_1_2_2_1.setBounds(10, 5, 80, 21);
		panel_3_1_1_2_2_1_1_2_2_1.add(residentNameLabel_1_1_2_2_1_1_2_2_1);

		txtCaloriesPerDay = new JTextField();
		txtCaloriesPerDay.setBorder(new LineBorder(Color.black, 1, false));
		txtCaloriesPerDay.setBounds(288, 6, 567, 20);
		panel_3_1_1_2_2_1_1_2_2_1.add(txtCaloriesPerDay);

		final JLabel residentNameLabel_1_1_2_2_1_1_2_1_1_1 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_2_1_1_1.setText("per Day");
		residentNameLabel_1_1_2_2_1_1_2_1_1_1.setBounds(215, 7, 67, 20);
		panel_3_1_1_2_2_1_1_2_2_1.add(residentNameLabel_1_1_2_2_1_1_2_1_1_1);

		txtCalories = new JTextField();
		txtCalories.setBorder(new LineBorder(Color.black, 1, false));
		txtCalories.setBounds(96, 5, 113, 20);
		panel_3_1_1_2_2_1_1_2_2_1.add(txtCalories);

		final JPanel panel_3_1_1_2_2_1_1_2_2_2 = new JPanel();
		panel_3_1_1_2_2_1_1_2_2_2.setBackground(Color.WHITE);
		panel_3_1_1_2_2_1_1_2_2_2.setLayout(null);
		panel_3_1_1_2_2_1_1_2_2_2.setBounds(2, 58, 861, 28);
		panel_4_1.add(panel_3_1_1_2_2_1_1_2_2_2);

		final JLabel residentNameLabel_1_1_2_2_1_1_2_2_2 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_2_2_2.setText("Protein(grams):");
		residentNameLabel_1_1_2_2_1_1_2_2_2.setBounds(10, 5, 75, 21);
		panel_3_1_1_2_2_1_1_2_2_2.add(residentNameLabel_1_1_2_2_1_1_2_2_2);

		txtProteinPerDay = new JTextField();
		txtProteinPerDay.setBorder(new LineBorder(Color.black, 1, false));
		txtProteinPerDay.setBounds(288, 6, 104, 20);
		panel_3_1_1_2_2_1_1_2_2_2.add(txtProteinPerDay);

		final JLabel residentNameLabel_1_1_2_2_1_1_2_1_1_2 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_2_1_1_2.setText("Per Day");
		residentNameLabel_1_1_2_2_1_1_2_1_1_2.setBounds(215, 7, 62, 20);
		panel_3_1_1_2_2_1_1_2_2_2.add(residentNameLabel_1_1_2_2_1_1_2_1_1_2);

		txtProtein = new JTextField();
		txtProtein.setBorder(new LineBorder(Color.black, 1, false));
		txtProtein.setBounds(94, 6, 115, 20);
		panel_3_1_1_2_2_1_1_2_2_2.add(txtProtein);

		final JLabel residentNameLabel_1_1_2_2_1_1_2_1_1_2_1 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_2_1_1_2_1.setText("grams/kg/day");
		residentNameLabel_1_1_2_2_1_1_2_1_1_2_1.setBounds(421, 5, 75, 20);
		panel_3_1_1_2_2_1_1_2_2_2.add(residentNameLabel_1_1_2_2_1_1_2_1_1_2_1);

		final JLabel residentNameLabel_1_1_2_2_1_1_2_1_1_2_1_1 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_2_1_1_2_1_1.setText("Fluids(ml)");
		residentNameLabel_1_1_2_2_1_1_2_1_1_2_1_1.setBounds(518, 5, 52, 20);
		panel_3_1_1_2_2_1_1_2_2_2
				.add(residentNameLabel_1_1_2_2_1_1_2_1_1_2_1_1);

		txtFluids = new JTextField();
		txtFluids.setBorder(new LineBorder(Color.black, 1, false));
		txtFluids.setBounds(583, 5, 108, 20);
		panel_3_1_1_2_2_1_1_2_2_2.add(txtFluids);

		final JLabel residentNameLabel_1_1_2_2_1_1_2_1_1_2_2 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_2_1_1_2_2.setText("Per Day");
		residentNameLabel_1_1_2_2_1_1_2_1_1_2_2.setBounds(697, 5, 62, 20);
		panel_3_1_1_2_2_1_1_2_2_2.add(residentNameLabel_1_1_2_2_1_1_2_1_1_2_2);

		txtFluidsPerDay = new JTextField();
		txtFluidsPerDay.setBorder(new LineBorder(Color.black, 1, false));
		txtFluidsPerDay.setBounds(765, 5, 91, 20);
		panel_3_1_1_2_2_1_1_2_2_2.add(txtFluidsPerDay);

		final JPanel panel_3_1_1_2_2_2 = new JPanel();
		panel_3_1_1_2_2_2.setBackground(Color.WHITE);
		panel_3_1_1_2_2_2.setLayout(null);
		panel_3_1_1_2_2_2.setBounds(10, 506, 875, 114);
		panel.add(panel_3_1_1_2_2_2);

		final JLabel residentNameLabel_1_1_2_2_2 = new JLabel();
		residentNameLabel_1_1_2_2_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		residentNameLabel_1_1_2_2_2.setText("NUTRITION ASSESSMENT:");
		residentNameLabel_1_1_2_2_2.setBounds(10, 5, 167, 20);
		panel_3_1_1_2_2_2.add(residentNameLabel_1_1_2_2_2);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.black, 1, false));
		scrollPane.setBounds(221, 7, 647, 97);
		panel_3_1_1_2_2_2.add(scrollPane);

		txtNutritionAssessment = new JTextArea();
		scrollPane.setViewportView(txtNutritionAssessment);

		final JPanel panel_3_1_1_2_2_2_1 = new JPanel();
		panel_3_1_1_2_2_2_1.setBackground(Color.WHITE);
		panel_3_1_1_2_2_2_1.setLayout(null);
		panel_3_1_1_2_2_2_1.setBounds(10, 680, 875, 133);
		panel.add(panel_3_1_1_2_2_2_1);

		final JLabel residentNameLabel_1_1_2_2_2_1 = new JLabel();
		residentNameLabel_1_1_2_2_2_1
				.setFont(new Font("Tahoma", Font.BOLD, 12));
		residentNameLabel_1_1_2_2_2_1.setText("PLAN :");
		residentNameLabel_1_1_2_2_2_1.setBounds(10, 5, 178, 20);
		panel_3_1_1_2_2_2_1.add(residentNameLabel_1_1_2_2_2_1);

		final JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(221, 8, 648, 115);
		panel_3_1_1_2_2_2_1.add(scrollPane_1);

		txtPlan = new JTextArea();
		scrollPane_1.setViewportView(txtPlan);

		final JPanel panel_3_1_1_2_2_3 = new JPanel();
		panel_3_1_1_2_2_3.setBackground(Color.WHITE);
		panel_3_1_1_2_2_3.setLayout(null);
		panel_3_1_1_2_2_3.setBounds(10, 620, 875, 30);
		panel.add(panel_3_1_1_2_2_3);

		final JLabel residentNameLabel_1_1_2_2_3 = new JLabel();
		residentNameLabel_1_1_2_2_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		residentNameLabel_1_1_2_2_3.setText("D : NUTRITION DIAGNOSIS:");
		residentNameLabel_1_1_2_2_3.setBounds(10, 5, 184, 20);
		panel_3_1_1_2_2_3.add(residentNameLabel_1_1_2_2_3);

		txtNutritionDiagnosis = new JTextField();
		txtNutritionDiagnosis.setBorder(new LineBorder(Color.black, 1, false));
		txtNutritionDiagnosis.setBounds(222, 5, 647, 21);
		panel_3_1_1_2_2_3.add(txtNutritionDiagnosis);

		final JPanel panel_3_1_1_2_2_4 = new JPanel();
		panel_3_1_1_2_2_4.setBackground(Color.WHITE);
		panel_3_1_1_2_2_4.setLayout(null);
		panel_3_1_1_2_2_4.setBounds(10, 650, 875, 30);
		panel.add(panel_3_1_1_2_2_4);

		final JLabel residentNameLabel_1_1_2_2_4 = new JLabel();
		residentNameLabel_1_1_2_2_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		residentNameLabel_1_1_2_2_4.setText("I : NUTRITION GOAL");
		residentNameLabel_1_1_2_2_4.setBounds(10, 5, 175, 20);
		panel_3_1_1_2_2_4.add(residentNameLabel_1_1_2_2_4);

		txtNutritionGoal = new JTextField();
		txtNutritionGoal.setBorder(new LineBorder(Color.black, 1, false));
		txtNutritionGoal.setBounds(230, 6, 638, 21);
		panel_3_1_1_2_2_4.add(txtNutritionGoal);

		final JPanel panel_3_1_1_2_2_4_1 = new JPanel();
		panel_3_1_1_2_2_4_1.setBackground(Color.WHITE);
		panel_3_1_1_2_2_4_1.setLayout(null);
		panel_3_1_1_2_2_4_1.setBounds(10, 812, 859, 30);
		panel.add(panel_3_1_1_2_2_4_1);

		final JLabel residentNameLabel_1_1_2_2_4_1 = new JLabel();
		residentNameLabel_1_1_2_2_4_1
				.setFont(new Font("Tahoma", Font.BOLD, 12));
		residentNameLabel_1_1_2_2_4_1.setText("NUTRIONAL RISK :");
		residentNameLabel_1_1_2_2_4_1.setBounds(10, 5, 112, 20);
		panel_3_1_1_2_2_4_1.add(residentNameLabel_1_1_2_2_4_1);

		cbHighRisk = new JCheckBox();
		cbHighRisk.setActionCommand("HIGH");
		cbHighRisk.setBackground(Color.WHITE);
		cbHighRisk.setBorder(new LineBorder(Color.black, 1, false));
		cbHighRisk.setText("HIGH");
		cbHighRisk.setBounds(221, 5, 112, 22);
		panel_3_1_1_2_2_4_1.add(cbHighRisk);

		cbModerateRisk = new JCheckBox();
		cbModerateRisk.setBackground(Color.WHITE);
		cbModerateRisk.setBorder(new LineBorder(Color.black, 1, false));
		cbModerateRisk.setText("MODERATE ");
		cbModerateRisk.setBounds(340, 5, 122, 22);
		panel_3_1_1_2_2_4_1.add(cbModerateRisk);

		cbLowRisk = new JCheckBox();
		cbLowRisk.setOpaque(false);
		cbLowRisk.setActionCommand("");
		cbLowRisk.setBorder(new LineBorder(Color.black, 1, false));
		cbLowRisk.setText("LOW ");
		cbLowRisk.setBounds(487, 5, 193, 22);
		panel_3_1_1_2_2_4_1.add(cbLowRisk);

		final JPanel panel_3_1_1_2_2_3_1 = new JPanel();
		panel_3_1_1_2_2_3_1.setBackground(Color.WHITE);
		panel_3_1_1_2_2_3_1.setLayout(null);
		panel_3_1_1_2_2_3_1.setBounds(10, 842, 875, 30);
		panel.add(panel_3_1_1_2_2_3_1);

		final JLabel residentNameLabel_1_1_2_2_3_1 = new JLabel();
		residentNameLabel_1_1_2_2_3_1
				.setFont(new Font("Tahoma", Font.BOLD, 12));
		residentNameLabel_1_1_2_2_3_1.setText("DIET EDUCATION/FOOD &DRUG :");
		residentNameLabel_1_1_2_2_3_1.setBounds(10, 5, 206, 20);
		panel_3_1_1_2_2_3_1.add(residentNameLabel_1_1_2_2_3_1);

		txtDietEducation = new JTextField();
		txtDietEducation.setBorder(new LineBorder(Color.black, 1, false));
		txtDietEducation.setBounds(222, 5, 645, 21);
		panel_3_1_1_2_2_3_1.add(txtDietEducation);

		final JPanel panel_3_1_1_2_2_1_1_2_2_2_1 = new JPanel();
		panel_3_1_1_2_2_1_1_2_2_2_1.setBackground(Color.WHITE);
		panel_3_1_1_2_2_1_1_2_2_2_1.setLayout(null);
		panel_3_1_1_2_2_1_1_2_2_2_1.setBounds(10, 872, 875, 28);
		panel.add(panel_3_1_1_2_2_1_1_2_2_2_1);

		final JLabel residentNameLabel_1_1_2_2_1_1_2_2_2_1 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_2_2_2_1.setFont(new Font("Tahoma",
				Font.PLAIN, 10));
		residentNameLabel_1_1_2_2_1_1_2_2_2_1.setText("40501");
		residentNameLabel_1_1_2_2_1_1_2_2_2_1.setBounds(10, 5, 75, 21);
		panel_3_1_1_2_2_1_1_2_2_2_1.add(residentNameLabel_1_1_2_2_1_1_2_2_2_1);

		txtDietitan = new JTextField();
		txtDietitan.setBorder(new LineBorder(Color.black, 1, false));
		txtDietitan.setBounds(288, 6, 104, 20);
		panel_3_1_1_2_2_1_1_2_2_2_1.add(txtDietitan);

		final JLabel residentNameLabel_1_1_2_2_1_1_2_1_1_2_3 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_2_1_1_2_3.setFont(new Font("Tahoma",
				Font.PLAIN, 12));
		residentNameLabel_1_1_2_2_1_1_2_1_1_2_3.setText("DIETITAN");
		residentNameLabel_1_1_2_2_1_1_2_1_1_2_3.setBounds(215, 7, 62, 20);
		panel_3_1_1_2_2_1_1_2_2_2_1
				.add(residentNameLabel_1_1_2_2_1_1_2_1_1_2_3);

		final JLabel residentNameLabel_1_1_2_2_1_1_2_1_1_2_1_2 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_2_1_1_2_1_2.setFont(new Font("Tahoma",
				Font.PLAIN, 12));
		residentNameLabel_1_1_2_2_1_1_2_1_1_2_1_2.setText("DATE");
		residentNameLabel_1_1_2_2_1_1_2_1_1_2_1_2.setBounds(398, 5, 43, 19);
		panel_3_1_1_2_2_1_1_2_2_2_1
				.add(residentNameLabel_1_1_2_2_1_1_2_1_1_2_1_2);

		final JLabel residentNameLabel_1_1_2_2_1_1_2_1_1_2_1_1_1 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_2_1_1_2_1_1_1.setText("TIME");
		residentNameLabel_1_1_2_2_1_1_2_1_1_2_1_1_1.setBounds(562, 5, 75, 20);
		panel_3_1_1_2_2_1_1_2_2_2_1
				.add(residentNameLabel_1_1_2_2_1_1_2_1_1_2_1_1_1);

		txtTime = new JTextField();
		txtTime.setBorder(new LineBorder(Color.black, 1, false));
		txtTime.setBounds(597, 5, 94, 20);
		panel_3_1_1_2_2_1_1_2_2_2_1.add(txtTime);

		final JLabel residentNameLabel_1_1_2_2_1_1_2_1_1_2_2_1 = new JLabel();
		residentNameLabel_1_1_2_2_1_1_2_1_1_2_2_1.setText("BEEPER");
		residentNameLabel_1_1_2_2_1_1_2_1_1_2_2_1.setBounds(720, 5, 62, 20);
		panel_3_1_1_2_2_1_1_2_2_2_1
				.add(residentNameLabel_1_1_2_2_1_1_2_1_1_2_2_1);

		txtBeeper = new JTextField();
		txtBeeper.setBorder(new LineBorder(Color.black, 1, false));
		txtBeeper.setBounds(788, 5, 78, 20);
		panel_3_1_1_2_2_1_1_2_2_2_1.add(txtBeeper);

		dcDate = new JDateChooser();
		dcDate.setBorder(new LineBorder(Color.black, 1, false));
		dcDate.setBounds(450, 6, 106, 20);
		panel_3_1_1_2_2_1_1_2_2_2_1.add(dcDate);

		final JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBounds(10, 900, 184, 22);
		panel.add(panel_5);

		final JLabel label = new JLabel();
		label.setText("46084(6/09)");
		label.setBounds(10, 0, 81, 14);
		panel_5.add(label);
		// doLoad();
	}

	public void updateData() {
		NutritionSupportAssessmentFormPage1 refNutritionSupportAssessmentFormPage1 = null;
		// System.out.println(Global.currentNutritionSupportAssessmentFormKey);
		if (Global.currentNutritionSupportAssessmentFormKey != 0) {
			try {
				refNutritionSupportAssessmentFormPage1 = MedrexClientManager
						.getInstance()
						.getNutritionSupportAssessmentFormPage1(
								Global.currentNutritionSupportAssessmentFormKey);
				// System.out.println(refNutritionSupportAssessmentFormPage1);
				refNutritionSupportAssessmentFormPage1.getBeeper();
			} catch (Exception e) {
				e.printStackTrace();
			}
			Global.currentNutritionSupportAssessmentFormKey = refNutritionSupportAssessmentFormPage1
					.getSerial();
			txtBeeper.setText(refNutritionSupportAssessmentFormPage1
					.getBeeper());
			txtTime.setText(refNutritionSupportAssessmentFormPage1.getTime());
			dcDate.setDate(refNutritionSupportAssessmentFormPage1.getDate());
			txtDietitan.setText(refNutritionSupportAssessmentFormPage1
					.getDietitan());
			txtDietEducation.setText(refNutritionSupportAssessmentFormPage1
					.getDietEducation());
			cbLowRisk.setSelected(refNutritionSupportAssessmentFormPage1
					.isLowRisk());
			cbModerateRisk.setSelected(refNutritionSupportAssessmentFormPage1
					.isModerateRisk());
			cbHighRisk.setSelected(refNutritionSupportAssessmentFormPage1
					.isHighRisk());
			txtNutritionGoal.setText(refNutritionSupportAssessmentFormPage1
					.getNutritionGoal());
			txtNutritionDiagnosis
					.setText(refNutritionSupportAssessmentFormPage1
							.getNutritionDiagnosis());
			txtFluidsPerDay.setText(refNutritionSupportAssessmentFormPage1
					.getFluidsPerDay());
			txtFluids.setText(refNutritionSupportAssessmentFormPage1
					.getFluids());
			txtProteinPerDay.setText(refNutritionSupportAssessmentFormPage1
					.getProteinPerDay());
			txtProtein.setText(refNutritionSupportAssessmentFormPage1
					.getProtein());
			txtCaloriesPerDay.setText(refNutritionSupportAssessmentFormPage1
					.getCaloriesPerDay());
			txtCalories.setText(refNutritionSupportAssessmentFormPage1
					.getCalories());
			txtEstimatedNutritionNeeds
					.setText(refNutritionSupportAssessmentFormPage1
							.getEstimatedNutritionNeeds());
			txtPMHX.setText(refNutritionSupportAssessmentFormPage1.getPMHX());
			txtNutritionFocusedPhysicalExam
					.setText(refNutritionSupportAssessmentFormPage1
							.getNutritionFocusedPhysicalExam());
			cbSe.setSelected(refNutritionSupportAssessmentFormPage1.isSe());
			cbSignificant.setSelected(refNutritionSupportAssessmentFormPage1
					.isSignificant());
			cbNAweightLoss.setSelected(refNutritionSupportAssessmentFormPage1
					.isNAweightLoss());
			txtWeightLoss.setText(refNutritionSupportAssessmentFormPage1
					.getWeightLoss());
			cbNAweightChange.setSelected(refNutritionSupportAssessmentFormPage1
					.isNAweightChange());
			txtWeightChange.setText(refNutritionSupportAssessmentFormPage1
					.getWeightChange());
			cbSevere.setSelected(refNutritionSupportAssessmentFormPage1
					.isSevere());
			cbModerate.setSelected(refNutritionSupportAssessmentFormPage1
					.isModerate());
			cbMild.setSelected(refNutritionSupportAssessmentFormPage1.isMild());
			cbMalnutrition.setSelected(refNutritionSupportAssessmentFormPage1
					.isMalnutrition());
			cbWNL.setSelected(refNutritionSupportAssessmentFormPage1.isWNL());
			txtPercentUsualBodyWeight
					.setText(refNutritionSupportAssessmentFormPage1
							.getPercentUsualBodyWeight());
			txtwtInterpretation.setText(refNutritionSupportAssessmentFormPage1
					.getWtTextInterpretation());
			cbwtInterpretation
					.setSelected(refNutritionSupportAssessmentFormPage1
							.isWtInterpretation());
			cbWNLs.setSelected(refNutritionSupportAssessmentFormPage1.isWNLs());
			txtBodyMassIndex.setText(refNutritionSupportAssessmentFormPage1
					.getBodyMassIndex());
			txtUsualBodyWeight.setText(refNutritionSupportAssessmentFormPage1
					.getUsualBodyWeight());
			txtAdjustments.setText(refNutritionSupportAssessmentFormPage1
					.getAdjustments());
			txtDesiredBodyWeight.setText(refNutritionSupportAssessmentFormPage1
					.getDesiredBodyWeight());
			txtWeight.setText(refNutritionSupportAssessmentFormPage1
					.getWeight()
					+ "");
			txtHeight.setText(refNutritionSupportAssessmentFormPage1
					.getHeight()
					+ "");
			txtBMI
					.setText(""
							+ refNutritionSupportAssessmentFormPage1.getBMI());
			txtLabs.setText(refNutritionSupportAssessmentFormPage1.getLabs());
			txtPertinentMedications
					.setText(refNutritionSupportAssessmentFormPage1
							.getPertinentMedications());
			txtProvides.setText(refNutritionSupportAssessmentFormPage1
					.getProvides());
			txtNutritionSupport.setText(refNutritionSupportAssessmentFormPage1
					.getNutritionSupport());
			txtNutritionAssessment
					.setText(refNutritionSupportAssessmentFormPage1
							.getNutritionAssessment());
			txtPlan.setText(refNutritionSupportAssessmentFormPage1.getPlan());
		}
	}

	public void doLoad() {
		// doUpdate();
	}

	public int doSave() {
		// System.out.println("serial: " +
		// Global.currentNutritionSupportAssessmentFormKey);
		// System.out.println("formId: " +
		// Global.currentSocialServiceInitialAssessmentKey);

		NutritionSupportAssessmentFormPage1 refNutritionSupportAssessmentFormPage1 = new NutritionSupportAssessmentFormPage1();
		refNutritionSupportAssessmentFormPage1
				.setResidentId(Global.currentResidenceKey);
		refNutritionSupportAssessmentFormPage1
				.setSerial(Global.currentNutritionSupportAssessmentFormKey);
		refNutritionSupportAssessmentFormPage1
				.setFormId(Global.currentSocialServiceInitialAssessmentKey);
		refNutritionSupportAssessmentFormPage1.setBeeper(txtBeeper.getText());
		refNutritionSupportAssessmentFormPage1.setTime(txtTime.getText());
		refNutritionSupportAssessmentFormPage1.setDate(dcDate.getDate());
		refNutritionSupportAssessmentFormPage1.setDietitan(txtDietitan
				.getText());
		refNutritionSupportAssessmentFormPage1
				.setDietEducation(txtDietEducation.getText());
		refNutritionSupportAssessmentFormPage1.setLowRisk(cbLowRisk
				.isSelected());
		refNutritionSupportAssessmentFormPage1.setModerateRisk(cbModerateRisk
				.isSelected());
		refNutritionSupportAssessmentFormPage1.setHighRisk(cbHighRisk
				.isSelected());
		refNutritionSupportAssessmentFormPage1
				.setNutritionGoal(txtNutritionGoal.getText());
		refNutritionSupportAssessmentFormPage1
				.setNutritionDiagnosis(txtNutritionDiagnosis.getText());
		refNutritionSupportAssessmentFormPage1.setFluidsPerDay(txtFluidsPerDay
				.getText());
		refNutritionSupportAssessmentFormPage1.setFluids(txtFluids.getText());
		refNutritionSupportAssessmentFormPage1
				.setProteinPerDay(txtProteinPerDay.getText());
		refNutritionSupportAssessmentFormPage1.setProtein(txtProtein.getText());
		refNutritionSupportAssessmentFormPage1
				.setCaloriesPerDay(txtCaloriesPerDay.getText());
		refNutritionSupportAssessmentFormPage1.setCalories(txtCalories
				.getText());
		refNutritionSupportAssessmentFormPage1
				.setEstimatedNutritionNeeds(txtEstimatedNutritionNeeds
						.getText());
		refNutritionSupportAssessmentFormPage1.setPMHX(txtPMHX.getText());
		refNutritionSupportAssessmentFormPage1
				.setNutritionFocusedPhysicalExam(txtNutritionFocusedPhysicalExam
						.getText());
		refNutritionSupportAssessmentFormPage1.setSe(cbSe.isSelected());
		refNutritionSupportAssessmentFormPage1.setSignificant(cbSignificant
				.isSelected());
		refNutritionSupportAssessmentFormPage1.setNAweightLoss(cbNAweightLoss
				.isSelected());
		refNutritionSupportAssessmentFormPage1.setWeightLoss(txtWeightLoss
				.getText());
		refNutritionSupportAssessmentFormPage1
				.setNAweightChange(cbNAweightChange.isSelected());
		refNutritionSupportAssessmentFormPage1.setWeightChange(txtWeightChange
				.getText());
		refNutritionSupportAssessmentFormPage1.setSevere(cbSevere.isSelected());
		refNutritionSupportAssessmentFormPage1.setModerate(cbModerate
				.isSelected());
		refNutritionSupportAssessmentFormPage1.setMild(cbMild.isSelected());
		refNutritionSupportAssessmentFormPage1.setMalnutrition(cbMalnutrition
				.isSelected());
		refNutritionSupportAssessmentFormPage1.setWNL(cbWNL.isSelected());
		refNutritionSupportAssessmentFormPage1
				.setPercentUsualBodyWeight(txtPercentUsualBodyWeight.getText());
		refNutritionSupportAssessmentFormPage1
				.setWtTextInterpretation(txtwtInterpretation.getText());
		refNutritionSupportAssessmentFormPage1
				.setWtInterpretation(cbwtInterpretation.isSelected());
		refNutritionSupportAssessmentFormPage1.setWNLs(cbWNLs.isSelected());
		refNutritionSupportAssessmentFormPage1
				.setBodyMassIndex(txtBodyMassIndex.getText());

		refNutritionSupportAssessmentFormPage1
				.setUsualBodyWeight(txtUsualBodyWeight.getText());
		refNutritionSupportAssessmentFormPage1.setAdjustments(txtAdjustments
				.getText());
		refNutritionSupportAssessmentFormPage1
				.setDesiredBodyWeight(txtDesiredBodyWeight.getText());
		if (txtBMI.getText().equals("")) {
			txtBMI.setText("" + 0);
			refNutritionSupportAssessmentFormPage1.setBMI(Double.valueOf(txtBMI
					.getText()));
		} else
			refNutritionSupportAssessmentFormPage1.setBMI(Double.valueOf(txtBMI
					.getText()));
		if (txtHeight.getText().equals("")) {
			txtHeight.setText("" + 0);
			refNutritionSupportAssessmentFormPage1.setHeight(Double
					.valueOf(txtHeight.getText()));
		} else
			refNutritionSupportAssessmentFormPage1.setHeight(Double
					.valueOf(txtHeight.getText()));
		if (txtWeight.getText().equals("")) {
			txtWeight.setText("" + 0);
			refNutritionSupportAssessmentFormPage1.setWeight(Double
					.valueOf(txtWeight.getText()));
		} else
			refNutritionSupportAssessmentFormPage1.setWeight(Double
					.valueOf(txtWeight.getText()));
		refNutritionSupportAssessmentFormPage1.setLabs(txtLabs.getText());
		refNutritionSupportAssessmentFormPage1
				.setPertinentMedications(txtPertinentMedications.getText());
		refNutritionSupportAssessmentFormPage1.setProvides(txtProvides
				.getText());
		refNutritionSupportAssessmentFormPage1
				.setNutritionSupport(txtNutritionSupport.getText());
		refNutritionSupportAssessmentFormPage1
				.setNutritionAssessment(txtNutritionAssessment.getText());
		refNutritionSupportAssessmentFormPage1.setPlan(txtPlan.getText());
		// System.out.println("BMI text"+refNutritionSupportAssessmentFormPage1.getBMI());
		try {
			Global.currentNutritionSupportAssessmentFormKey = MedrexClientManager
					.getInstance()
					.insertOrUpdateNutritionSupportAssessmentFormPage1(
							refNutritionSupportAssessmentFormPage1);
			// System.out.println("serial Key is:"+Global.currentNutritionSupportAssessmentFormKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Global.currentNutritionSupportAssessmentFormKey;
	}

	public void doUpdate() {
		updateData();
	}

	public boolean doValidate() {

		return false;
	}

}
