package medrex.client.main.physicanOrders.physicianOrderScreen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.MonthlySummary.PanelEnteralProtocol;
import medrex.client.main.MonthlySummary.PanelParentalNutritionalOrderForm;
import medrex.client.utils.FieldFormatter;
import medrex.client.utils.FieldValidation;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderDiets;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderRecord;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.childForms.ParentalNutritionalOrderForm;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.childForms.PhysicianOrderEnteralProtocol;
import medrex.commons.vo.resident.ResidentMain;

import com.jgoodies.validation.ValidationResult;
import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.BlueOverWhiteTheme;
import com.sX.theme.Theme;

import com.sX.swing.JxButton;
import com.sX.swing.JxLabel;
import com.sX.swing.JxText;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxCheckBox;
import com.sX.swing.JxRadioButton;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxTextA;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTextField;

import com.sX.swing.JxButton;
import com.sX.swing.JxLabel;
import com.sX.swing.JxText;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxCheckBox;
import com.sX.swing.JxRadioButton;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxTextA;
import com.sX.swing.JxPanel;

public class PanelPhysicianOrdersDiets extends JxPanel {

	private JxText txtMLDay;
	private JxText txtNursing11;
	private JxText txtNursing3;
	private JxText txtDinner;
	private JxCheckBox cbTPN;
	private JxCheckBox cbPleasureFeeds;
	private JxCheckBox cbCARDIAC;
	private JxCheckBox cbNPO;
	private JxCheckBox cbGTUBE;
	private JxCheckBox cbRENAL;
	private JxCheckBox cbNCS;
	private JxCheckBox cbNAS;
	private JxText txtNursing7;
	private JxText txtLunch;
	private JxText txtBreakfast;
	/**
	 * 
	 */
	private static final long serialVersionUID = 4957372926857040992L;
	private JxLabel lblNoOfDays;
	private JxRadioButton rbNO;
	private JxRadioButton rbYes;
	// private JxCheckBox cbSplit;
	private JxComboBox cmbWeights;
	private JxText txtCalorieCount;
	private JxComboBox cmbAsSnack;
	private JxText txtSupplements;
	private JxComboBox cmbFluidConsistency;
	// private JxText txtMlDay;
	// private JxComboBox cmbMilileters;
	// private JxComboBox cmbNumber;
	private JxComboBox cmbFluidRestriction;
	private JxComboBox cmbDietConsistency;
	private JxPanel panelFluid;
	private JxButton button;

	Theme theme = new BlueOverWhiteTheme();

	public PanelPhysicianOrdersDiets() {
		super();
		Global.panelPhysicianOrdersDiets = this;
		setLayout(new BorderLayout());
		// ColorConstants.DEF_COLOR
		setBackground(Color.WHITE);
		setArc(1f);
		setBorder(new LineBorder(ColorConstants.DEF_COLOR, 1));
		setBackground(Color.WHITE);
		final JxPanel panel = new JxPanel();
		panel.setBackground(Color.WHITE);

		panel.setTheme(theme);
		panel.setLayout(null);

		add(panel);

		final JxLabel dietTypeLabel = new JxLabel();
		dietTypeLabel.setTheme(theme);
		dietTypeLabel.setForeground(ColorConstants.DEF_COLOR);

		dietTypeLabel.setFontSize(12);
		dietTypeLabel.setFontStyle(Font.BOLD);
		dietTypeLabel.setBounds(20, 12, 67, 18);
		dietTypeLabel.setText("DIET TYPE");
		panel.add(dietTypeLabel);

		final JxLabel dietConsistencyLabel = new JxLabel();
		dietConsistencyLabel.setTheme(theme);
		dietConsistencyLabel.setForeground(ColorConstants.DEF_COLOR);

		dietConsistencyLabel.setFontSize(12);
		dietConsistencyLabel.setFontStyle(Font.BOLD);
		dietConsistencyLabel.setText("DIET CONSISTENCY");
		dietConsistencyLabel.setBounds(20, 90, 127, 16);
		panel.add(dietConsistencyLabel);

		cmbDietConsistency = new JxComboBox();
		cmbDietConsistency.setTheme(theme);
		cmbDietConsistency.setForeground(ColorConstants.DEF_COLOR);
		cmbDietConsistency.setModel(new DefaultComboBoxModel(new String[] { "",
				"PUREE", "MECHANICAL SOFT", "CHOPPED", "REGULAR" }));

		cmbDietConsistency.setBounds(177, 90, 127, 18);
		panel.add(cmbDietConsistency);

		final JxLabel fluidRestrictionLabel = new JxLabel();
		fluidRestrictionLabel.setTheme(theme);
		fluidRestrictionLabel.setForeground(ColorConstants.DEF_COLOR);

		fluidRestrictionLabel.setFontSize(12);
		fluidRestrictionLabel.setFontStyle(Font.BOLD);
		fluidRestrictionLabel.setText("FLUID RESTRICTION");
		fluidRestrictionLabel.setBounds(20, 125, 121, 16);
		panel.add(fluidRestrictionLabel);

		cmbFluidRestriction = new JxComboBox();
		cmbFluidRestriction.setTheme(theme);
		cmbFluidRestriction.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (cmbFluidRestriction.getSelectedItem().toString()
						.equalsIgnoreCase("YES")) {
					SwingUtils.disableComponents(panelFluid, true);
				}
				if (cmbFluidRestriction.getSelectedItem().toString()
						.equalsIgnoreCase("NO")) {
					SwingUtils.disableComponents(panelFluid, false);
				}
			}
		});
		cmbFluidRestriction.setForeground(ColorConstants.DEF_COLOR);
		// cbFluidRestriction.addItemListener(new ItemListener() {
		/*
		 * public void itemStateChanged(final ItemEvent arg0) {
		 * 
		 * if (cbFluidRestriction.getSelectedIndex() == 1) { enableComponents();
		 * 
		 * } else disableComponents();
		 * 
		 * }
		 */

		// });
		cmbFluidRestriction.setModel(new DefaultComboBoxModel(new String[] {
				"", "YES", "NO" }));

		cmbFluidRestriction.setBounds(177, 125, 127, 18);
		panel.add(cmbFluidRestriction);

		panelFluid = new JxPanel();
		panelFluid.setBackground(Color.WHITE);
		panelFluid.setTheme(theme);
		panelFluid.setName("");
		panelFluid.setEnabled(true);

		panelFluid.setLayout(null);
		panelFluid.setBounds(20, 152, 508, 87);
		SwingUtils.disableComponents(panelFluid, false);
		panel.add(panelFluid);

		/*
		 * cmbNumber = new JxComboBox(); cmbNumber.setTheme (theme);
		 * cmbNumber.setForeground(ColorConstants.DEF_COLOR);
		 * cmbNumber.setModel(new DefaultComboBoxModel(new String[] {""}));
		 * 
		 * cmbNumber.setBounds(24, 15, 70, 18); panelFluid.add(cmbNumber);
		 */

		/*
		 * cmbMilileters = new JxComboBox(); cmbMilileters.setTheme (theme);
		 * cmbMilileters.setForeground(ColorConstants.DEF_COLOR);
		 * cmbMilileters.setModel(new DefaultComboBoxModel(new String[] {"",
		 * 
		 * cmbMilileters.setBounds(102, 15, 70, 18);
		 * panelFluid.add(cmbMilileters);
		 */

		final JxLabel mldayLabel = new JxLabel();
		mldayLabel.setTheme(theme);
		mldayLabel.setForeground(ColorConstants.DEF_COLOR);

		mldayLabel.setFontSize(12);
		mldayLabel.setFontStyle(Font.BOLD);
		mldayLabel.setText("ML/Day");
		mldayLabel.setBounds(10, 8, 54, 16);
		panelFluid.add(mldayLabel);
		// txtDietary.setEditable(false);

		final JxLabel dietaryLabel = new JxLabel();
		dietaryLabel.setTheme(theme);
		dietaryLabel.setForeground(ColorConstants.DEF_COLOR);

		dietaryLabel.setFontSize(12);
		dietaryLabel.setFontStyle(Font.BOLD);
		dietaryLabel.setText(" DIETARY");
		dietaryLabel.setBounds(106, 8, 66, 16);
		panelFluid.add(dietaryLabel);
		// txtNursing.setEditable(false);

		/*
		 * cbSplit = new JxCheckBox(); cbSplit.addActionListener(new
		 * cbSplit.setTheme (theme); ActionListener() { public void
		 * actionPerformed(final ActionEvent arg0) { if(cbSplit.isSelected()) {
		 * txtDietary.setEditable(true); txtNursing.setEditable(true);
		 * 
		 * } else { txtDietary.setEditable(false);
		 * txtNursing.setEditable(false); } } });
		 * 
		 * 
		 * cbSplit.setText("Split"); cbSplit.setBounds(340, 15, 70, 18);
		 * panelFluid.add(cbSplit);
		 */
		final JxLabel breakfastLabel = new JxLabel();
		breakfastLabel.setTheme(theme);
		breakfastLabel.setText("Breakfast");
		breakfastLabel.setForeground(ColorConstants.DEF_COLOR);
		breakfastLabel.setBounds(106, 30, 66, 16);
		panelFluid.add(breakfastLabel);

		txtBreakfast = new JxText(FieldFormatter.BP);
	 
		txtBreakfast.addKeyListener(new KeyAdapter() {
			public void keyReleased(final KeyEvent e) {
				
				
				  int status =  	getValidStatus();
				  if(status==1)
				  {
					  //JOptionPane.showMessageDialog(null, "<html> total cannot be less than MLDays <br> It should be equal to ML/Days ", "Error",2);
					   
				  }
				  if(status ==2){
					  
					  JOptionPane.showMessageDialog(null, "<html> total cannot be more  than MLDays <br> It should be equal to ML/Days ", "Error",2);
					  txtBreakfast.setText("");
				  }
			}
		});
 
	 
	 
 
		// txtBreakfast.setTheme (theme);
		txtBreakfast.setBounds(178, 29, 70, 18);
		panelFluid.add(txtBreakfast);

		final JxLabel lunchLabel = new JxLabel();
		lunchLabel.setTheme(theme);
		lunchLabel.setText("Lunch");
		lunchLabel.setForeground(ColorConstants.DEF_COLOR);
		lunchLabel.setBounds(106, 47, 66, 16);
		panelFluid.add(lunchLabel);

		final JxLabel dinnerLabel = new JxLabel();
		dinnerLabel.setTheme(theme);
		dinnerLabel.setText("Dinner");
		dinnerLabel.setForeground(ColorConstants.DEF_COLOR);
		dinnerLabel.setBounds(106, 65, 66, 16);
		panelFluid.add(dinnerLabel);

		txtLunch = new JxText(FieldFormatter.BP);
		txtLunch.addKeyListener(new KeyAdapter() {
			public void keyReleased(final KeyEvent e) {
				
				  int status =  	getValidStatus();
				  if(status==1)
				  {
					//  JOptionPane.showMessageDialog(null, "<html> total cannot be less than MLDays <br> It should be equal to ML/Days ", "Error",2);
					  
				  }
				  if(status ==2){
					  
					  JOptionPane.showMessageDialog(null, "<html> total cannot be more  than MLDays <br> It should be equal to ML/Days ", "Error",2);
					  txtLunch.setText("");
				  }
				
				
				
			}
		});
	 
		// txtLunch.setTheme (theme);
		txtLunch.setBounds(178, 47, 70, 18);

		panelFluid.add(txtLunch);

		txtDinner = new JxText(FieldFormatter.BP);
		txtDinner.addKeyListener(new KeyAdapter() {
			public void keyReleased(final KeyEvent e) {
				
				  int status =  	getValidStatus();
				  if(status==1)
				  {
					//  JOptionPane.showMessageDialog(null, "<html> total cannot be less than MLDays <br> It should be equal to ML/Days ", "Error",2);
					  
				  }
				  if(status ==2){
					  
					  JOptionPane.showMessageDialog(null, "<html> total cannot be more  than MLDays <br> It should be equal to ML/Days ", "Error",2);
					  txtDinner.setText("");
				  }
			}
		});
		// txtDinner.setTheme (theme);
		txtDinner.setBounds(178, 65, 70, 18);

		panelFluid.add(txtDinner);

		final JxLabel mlLabel = new JxLabel();
		mlLabel.setTheme(theme);
		mlLabel.setText("ml");
		mlLabel.setForeground(ColorConstants.DEF_COLOR);
		mlLabel.setBounds(254, 31, 27, 16);
		panelFluid.add(mlLabel);

		final JxLabel mlLabel_1 = new JxLabel();
		mlLabel_1.setTheme(theme);
		mlLabel_1.setText("ml");
		mlLabel_1.setForeground(ColorConstants.DEF_COLOR);
		mlLabel_1.setBounds(254, 47, 27, 16);
		panelFluid.add(mlLabel_1);

		final JxLabel mlLabel_1_1 = new JxLabel();
		mlLabel_1_1.setTheme(theme);
		mlLabel_1_1.setText("ml");
		mlLabel_1_1.setForeground(ColorConstants.DEF_COLOR);
		mlLabel_1_1.setBounds(254, 65, 27, 16);
		panelFluid.add(mlLabel_1_1);

		final JxLabel nursingLabel = new JxLabel();
		nursingLabel.setTheme(theme);

		nursingLabel.setFontSize(12);
		nursingLabel.setFontStyle(Font.BOLD);
		nursingLabel.setForeground(ColorConstants.DEF_COLOR);
		nursingLabel.setText("NURSING");
		nursingLabel.setBounds(315, 8, 66, 16);
		panelFluid.add(nursingLabel);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);
		label.setText("7-3");
		label.setForeground(ColorConstants.DEF_COLOR);
		label.setBounds(315, 30, 66, 16);
		panelFluid.add(label);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);
		label_1.setText("3-11");
		label_1.setForeground(ColorConstants.DEF_COLOR);
		label_1.setBounds(315, 47, 66, 16);
		panelFluid.add(label_1);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);
		label_2.setText("11-7");
		label_2.setForeground(ColorConstants.DEF_COLOR);
		label_2.setBounds(315, 65, 66, 16);
		panelFluid.add(label_2);

		txtNursing7 = new JxText(FieldFormatter.BP);
		txtNursing7.addKeyListener(new KeyAdapter() {
			public void keyReleased(final KeyEvent e) {
				
				  int status =  	getValidStatus();
				  if(status==1)
				  {
					 // JOptionPane.showMessageDialog(null, "<html> total cannot be less than MLDays <br> It should be equal to ML/Days ", "Error",2);
				//	  txtNursing7.setText("");
					  
				  }
				  if(status ==2){
					  
					  JOptionPane.showMessageDialog(null, "<html> total cannot be more  than MLDays <br> It should be equal to ML/Days ", "Error",2);
					  txtNursing7.setText("");
				  }
			}
		});
		// txtNursing7.setTheme (theme);
		txtNursing7.setBounds(369, 29, 70, 18);

		panelFluid.add(txtNursing7);

		txtNursing3 = new JxText(FieldFormatter.BP);
		txtNursing3.addKeyListener(new KeyAdapter() {
			public void keyReleased(final KeyEvent e) {
				
				  int status =  	getValidStatus();
				  if(status==1)
				  {
					//  JOptionPane.showMessageDialog(null, "<html> total cannot be less than MLDays <br> It should be equal to ML/Days ", "Error",2);
					  
				  }
				  if(status ==2){
					  
					 JOptionPane.showMessageDialog(null, "<html> total cannot be more  than MLDays <br> It should be equal to ML/Days ", "Error",2);
					 txtNursing3.setText("");
				  }
			}
		});
		// txtNursing3.setTheme (theme);
		txtNursing3.setBounds(369, 47, 70, 18);

		panelFluid.add(txtNursing3);

		txtNursing11 = new JxText(FieldFormatter.BP);
		txtNursing11.addKeyListener(new KeyAdapter() {
			public void keyReleased(final KeyEvent e) {
				  int status = getValidStatus();
				  if(status==1)
				  {
					 // JOptionPane.showMessageDialog(null, "<html> total cannot be less than MLDays <br> It should be equal to ML/Days ", "Error",2);
				  }
				  if(status ==2){
					  JOptionPane.showMessageDialog(null, "<html> total cannot be more  than MLDays <br> It should be equal to ML/Days ", "Error",2);
					  txtNursing11.setText("");
				  }
			}
		});
		;
		// txtNursing11.setTheme (theme);
		txtNursing11.setBounds(369, 65, 70, 18);

		panelFluid.add(txtNursing11);

		final JxLabel mlLabel_2 = new JxLabel();
		mlLabel_2.setTheme(theme);
		mlLabel_2.setText("ml");
		mlLabel_2.setForeground(ColorConstants.DEF_COLOR);
		mlLabel_2.setBounds(445, 31, 19, 16);
		panelFluid.add(mlLabel_2);

		final JxLabel mlLabel_2_1 = new JxLabel();
		mlLabel_2_1.setTheme(theme);
		mlLabel_2_1.setText("ml");
		mlLabel_2_1.setForeground(ColorConstants.DEF_COLOR);
		mlLabel_2_1.setBounds(445, 47, 19, 16);
		panelFluid.add(mlLabel_2_1);

		final JxLabel mlLabel_2_2 = new JxLabel();
		mlLabel_2_2.setTheme(theme);
		mlLabel_2_2.setText("ml");
		mlLabel_2_2.setForeground(ColorConstants.DEF_COLOR);
		mlLabel_2_2.setBounds(445, 65, 19, 16);
		panelFluid.add(mlLabel_2_2);
		SwingUtils.disableComponents(panelFluid, false);

		txtMLDay = new JxText(FieldFormatter.BP);

		// txtMLDay.setTheme (theme);
		txtMLDay.setBounds(10, 30, 70, 18);
		panelFluid.add(txtMLDay);

		final JxLabel fluidConsistencyLabel = new JxLabel();
		fluidConsistencyLabel.setTheme(theme);
		fluidConsistencyLabel.setForeground(ColorConstants.DEF_COLOR);

		fluidConsistencyLabel.setFontSize(12);
		fluidConsistencyLabel.setFontStyle(Font.BOLD);
		fluidConsistencyLabel.setText("FLUID CONSISTENCY");
		fluidConsistencyLabel.setBounds(20, 245, 127, 16);
		panel.add(fluidConsistencyLabel);

		cmbFluidConsistency = new JxComboBox();
		cmbFluidConsistency.setTheme(theme);
		cmbFluidConsistency.setForeground(ColorConstants.DEF_COLOR);
		cmbFluidConsistency.setModel(new DefaultComboBoxModel(new String[] {
				"", "REGULAR", "NECTAR", "HONEY", "PUDDING" }));

		cmbFluidConsistency.setBounds(177, 245, 127, 18);
		panel.add(cmbFluidConsistency);

		final JxLabel supplementsLabel = new JxLabel();
		supplementsLabel.setTheme(theme);
		supplementsLabel.setForeground(ColorConstants.DEF_COLOR);

		supplementsLabel.setFontSize(12);
		supplementsLabel.setFontStyle(Font.BOLD);
		supplementsLabel.setText("SUPPLEMENTS");
		supplementsLabel.setBounds(20, 285, 99, 16);
		panel.add(supplementsLabel);

		txtSupplements = new JxText();

		txtSupplements.setTheme(theme);
		txtSupplements.setBounds(177, 285, 127, 18);
		panel.add(txtSupplements);

		final JxLabel asSnackLabel = new JxLabel();
		asSnackLabel.setTheme(theme);
		asSnackLabel.setForeground(ColorConstants.DEF_COLOR);

		asSnackLabel.setFontSize(12);
		asSnackLabel.setFontStyle(Font.BOLD);
		asSnackLabel.setText("HS SNACK");
		asSnackLabel.setBounds(20, 325, 81, 16);
		panel.add(asSnackLabel);

		cmbAsSnack = new JxComboBox();
		cmbAsSnack.setTheme(theme);
		cmbAsSnack.setForeground(ColorConstants.DEF_COLOR);
		cmbAsSnack.setModel(new DefaultComboBoxModel(new String[] { "", "YES",
				"NO" }));

		cmbAsSnack.setBounds(177, 325, 127, 18);
		panel.add(cmbAsSnack);

		final JxLabel calorieCountLabel = new JxLabel();
		calorieCountLabel.setTheme(theme);
		calorieCountLabel.setForeground(ColorConstants.DEF_COLOR);

		calorieCountLabel.setFontSize(12);
		calorieCountLabel.setFontStyle(Font.BOLD);
		calorieCountLabel.setText("CALORIE COUNT");
		calorieCountLabel.setBounds(20, 365, 105, 16);
		panel.add(calorieCountLabel);

		txtCalorieCount = new JxText(FieldFormatter.MAX3);
		txtCalorieCount.setTheme(theme);
		txtCalorieCount.setBounds(418, 364, 127, 18);
		panel.add(txtCalorieCount);

		final JxLabel weightsLabel = new JxLabel();
		weightsLabel.setTheme(theme);
		weightsLabel.setForeground(ColorConstants.DEF_COLOR);

		weightsLabel.setFontSize(12);
		weightsLabel.setFontStyle(Font.BOLD);
		weightsLabel.setText("WEIGHTS");
		weightsLabel.setBounds(20, 405, 67, 16);
		panel.add(weightsLabel);

		cmbWeights = new JxComboBox();
		cmbWeights.setTheme(theme);
		cmbWeights.setForeground(ColorConstants.DEF_COLOR);
		cmbWeights.setModel(new DefaultComboBoxModel(new String[] { "",
				"DAILY", "WEEKLY", "MONTHLY" }));

		cmbWeights.setBounds(177, 405, 127, 18);
		panel.add(cmbWeights);

		final JxButton saveButton = new JxButton();
		saveButton.setTheme(theme);

		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (doValidate()) {
					System.out.println("Entered in saved..............");
					doSave();
					
					Global.framePhysicianOrder.dispose();
				}
			}
		});
		saveButton.setForeground(ColorConstants.DEF_COLOR);

		saveButton.setFontSize(12);
		saveButton.setFontStyle(Font.BOLD);
		saveButton.setArc(0.4f);
		saveButton.setText("Save");
		saveButton.setBounds(200, 470, 75, 21);
		panel.add(saveButton);

		final JxButton deleteButton = new JxButton();
		deleteButton.setTheme(theme);
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doDelete();
				setBlankField();
			}
		});

		deleteButton.setForeground(ColorConstants.DEF_COLOR);

		deleteButton.setFontSize(12);
		deleteButton.setFontStyle(Font.BOLD);
		deleteButton.setArc(0.4f);
		deleteButton.setText("Delete");
		deleteButton.setBounds(300, 470, 75, 21);
		panel.add(deleteButton);

		final JxButton btnAddNew = new JxButton();
		btnAddNew.setTheme(theme);
		btnAddNew.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				setBlankField();
				Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();
			}
		});

		btnAddNew.setForeground(ColorConstants.DEF_COLOR);

		btnAddNew.setFontSize(12);
		btnAddNew.setFontStyle(Font.BOLD);
		btnAddNew.setArc(0.4f);
		btnAddNew.setText("Add New");
		btnAddNew.setBounds(100, 470, 75, 21);
		panel.add(btnAddNew);

		button = new JxButton();
		button.setBackground(Color.WHITE);

		button.setTheme(theme);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				// String s = cmbDietType.getSelectedItem().toString();
				// if ((cbGTUBE.isSelected())
				// && Global.currentPhysicianOrderEnteralProtocolKey != 0) {
				// try {

				// PhysicianOrderEnteralProtocol enteralProtocol =
				// MedrexClientManager
				// .getInstance()
				// .getPanelEnteralProtocol(
				// Global.currentPhysicianOrderEnteralProtocolKey);
				final PanelEnteralProtocol p = new PanelEnteralProtocol();
				// Global.panelEnteralProtocol
				// .setValueObject(enteralProtocol);
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						SwingUtils.openInDialog(p);
					}
				});
				// } catch (Exception e) {

				// e.printStackTrace();
				// }
				// }

			}
		}

		);
		button.setForeground(ColorConstants.DEF_COLOR);

		button.setFontSize(12);
		button.setFontStyle(Font.BOLD);
		button.setText("+");
		button.setEnabled(false);
		button.setBounds(515, 11, 29, 22);
		panel.add(button);

		rbYes = new JxRadioButton();
		rbYes.setTheme(theme);
		rbYes.setOpaque(false);
		rbYes.setForeground(ColorConstants.DEF_COLOR);

		rbYes.setFontSize(12);
		rbYes.setFontStyle(Font.BOLD);
		rbYes.setText("Yes");
		rbYes.setBounds(180, 365, 67, 16);
		panel.add(rbYes);

		rbNO = new JxRadioButton();
		rbNO.setTheme(theme);
		rbNO.setOpaque(false);
		rbNO.setForeground(ColorConstants.DEF_COLOR);

		rbNO.setFontSize(12);
		rbNO.setFontStyle(Font.BOLD);
		rbNO.setText("No");
		rbNO.setBounds(253, 365, 51, 16);
		panel.add(rbNO);

		ButtonGroup bgGroup = new ButtonGroup();
		bgGroup.add(rbYes);
		bgGroup.add(rbNO);

		lblNoOfDays = new JxLabel();
		lblNoOfDays.setTheme(theme);
		lblNoOfDays.setForeground(ColorConstants.DEF_COLOR);

		lblNoOfDays.setFontSize(12);
		lblNoOfDays.setFontStyle(Font.BOLD);
		lblNoOfDays.setText("Number of Days:");
		lblNoOfDays.setBounds(313, 365, 105, 16);
		panel.add(lblNoOfDays);

		cbNAS = new JxCheckBox();
		cbNAS.setBackground(Color.WHITE);
		cbNAS.setTheme(theme);

		cbNAS.setForeground(ColorConstants.DEF_COLOR);
		cbNAS.setText("NAS");
		cbNAS.setBounds(177, 10, 51, 24);
		panel.add(cbNAS);

		cbNCS = new JxCheckBox();
		cbNCS.setBackground(Color.WHITE);
		cbNCS.setTheme(theme);

		cbNCS.setForeground(ColorConstants.DEF_COLOR);
		cbNCS.setText("NCS");
		cbNCS.setBounds(240, 10, 75, 24);
		panel.add(cbNCS);

		cbRENAL = new JxCheckBox();
		cbRENAL.setBackground(Color.WHITE);
		cbRENAL.setTheme(theme);

		cbRENAL.setForeground(ColorConstants.DEF_COLOR);
		cbRENAL.setText("RENAL");
		cbRENAL.setBounds(320, 10, 75, 24);
		panel.add(cbRENAL);

		cbCARDIAC = new JxCheckBox();
		cbCARDIAC.setBackground(Color.WHITE);
		cbCARDIAC.setTheme(theme);

		cbCARDIAC.setForeground(ColorConstants.DEF_COLOR);
		cbCARDIAC.setText("CARDIAC");
		cbCARDIAC.setBounds(240, 50, 80, 24);
		panel.add(cbCARDIAC);

		cbNPO = new JxCheckBox();
		cbNPO.setBackground(Color.WHITE);
		cbNPO.setTheme(theme);

		cbNPO.setForeground(ColorConstants.DEF_COLOR);
		cbNPO.setText("NPO");
		cbNPO.setBounds(177, 50, 51, 24);
		panel.add(cbNPO);

		cbGTUBE = new JxCheckBox();
		cbGTUBE.setBackground(Color.WHITE);
		cbGTUBE.setTheme(theme);
		cbGTUBE.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {

				if (cbGTUBE.isSelected()) {
					PanelEnteralProtocol p = new PanelEnteralProtocol();
					SwingUtils.openInDialog(p);
				}
			}
		});

		cbGTUBE.setForeground(ColorConstants.DEF_COLOR);
		cbGTUBE.setText("GTUBE");
		cbGTUBE.setBounds(442, 9, 67, 24);
		panel.add(cbGTUBE);

		cbTPN = new JxCheckBox();
		cbTPN.setBackground(Color.WHITE);
		cbTPN.setTheme(theme);
		cbTPN.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (cbTPN.isSelected()) {
					PanelParentalNutritionalOrderForm pn = new PanelParentalNutritionalOrderForm();
					SwingUtils.openInDialog(pn);
				}
			}
		});

		cbTPN.setForeground(ColorConstants.DEF_COLOR);
		cbTPN.setText("TPN");
		cbTPN.setBounds(442, 50, 59, 24);
		panel.add(cbTPN);

		cbPleasureFeeds = new JxCheckBox();
		cbPleasureFeeds.setBackground(Color.WHITE);
		cbPleasureFeeds.setTheme(theme);

		cbPleasureFeeds.setForeground(ColorConstants.DEF_COLOR);
		cbPleasureFeeds.setText("PLEASURE FEEDS");
		cbPleasureFeeds.setBounds(320, 50, 125, 24);
		panel.add(cbPleasureFeeds);

		final JxButton button_1 = new JxButton();
		button_1.setBackground(Color.WHITE);
		button_1.setTheme(theme);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				// if ((cbTPN.isSelected())
				// && Global.currentParentalNutritionalOrderFormKey != 0) {
				// try {
				// ParentalNutritionalOrderForm parentalNutritionalOrderForm =
				// MedrexClientManager
				// .getInstance()
				// .getParentalNutritionalOrderForm(
				// Global.currentParentalNutritionalOrderFormKey);
				final PanelParentalNutritionalOrderForm parental = new PanelParentalNutritionalOrderForm();
				// Global.PanelparentalNutritionalOrderForm
				// .setValueObject(parentalNutritionalOrderForm);
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						SwingUtils.openInDialog(parental);
					}
				});
				// } catch (Exception e) {

				// e.printStackTrace();
				// }
				// }

			}

		});

		button_1.setText("+");
		button_1.setBounds(515, 52, 30, 22);
		button_1.setForeground(ColorConstants.DEF_COLOR);
		panel.add(button_1);

		final JxLabel dietaryLabel_1 = new JxLabel();

		dietaryLabel_1.setTheme(theme);
		dietaryLabel_1.setFontSize(18);
		dietaryLabel_1.setForeground(ColorConstants.DEF_COLOR);

		dietaryLabel_1.setFontStyle(Font.BOLD);

		dietaryLabel_1.setFontStyle(Font.BOLD);
		dietaryLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		dietaryLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		dietaryLabel_1.setPreferredSize(new Dimension(0, 50));
		dietaryLabel_1.setText("DIETARY");
		add(dietaryLabel_1, BorderLayout.NORTH);
	}

	public void doDelete() {
		try {
			if (Global.currentPhysicianOrderRecordKey != 0
					&& Global.currentPhysicianOrderDietKey != 0) {
				MedrexClientManager.getInstance().deletePhysicianOrderRecord(
						Global.currentPhysicianOrderRecordKey);
				MedrexClientManager.getInstance().deletePhysicianOrderDiet(
						Global.currentPhysicianOrderDietKey);

				// String s = cmbDietType.getSelectedItem().toString();
				if (cbGTUBE.isSelected()
						&& Global.currentPhysicianOrderEnteralProtocolKey != 0) {
					MedrexClientManager
							.getInstance()
							.deletePhysicianOrderEnteralProtocol(
									Global.currentPhysicianOrderEnteralProtocolKey);
				} else if (cbTPN.isSelected()
						&& Global.currentParentalNutritionalOrderFormKey != 0) {
					MedrexClientManager
							.getInstance()
							.deletePhysicianOrderParentalNutritionalOrderForm(
									Global.currentParentalNutritionalOrderFormKey);
				}

			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();

	}

	private void doSave() {
		PhysicianOrderDiets refPhyDiet = new PhysicianOrderDiets();

		refPhyDiet.setSerial(Global.currentPhysicianOrderDietKey);
		refPhyDiet.setAsSnack(cmbAsSnack.getSelectedItem().toString());
		if (!txtCalorieCount.getText().equalsIgnoreCase("")) {
			refPhyDiet.setCalorieCount(Integer.parseInt(txtCalorieCount
					.getText()));
		}
		refPhyDiet.setResidentId(Global.currentResidenceKey);

		// String s = cmbDietType.getSelectedItem().toString();
		if (cbGTUBE.isSelected()) {
			refPhyDiet
					.setFormId(Global.currentPhysicianOrderEnteralProtocolKey);
		}
		if (cbTPN.isSelected()) {
			refPhyDiet.setFormId(Global.currentParentalNutritionalOrderFormKey);
		}
		// refPhyDiet.setDietary(txtDietary.getText());
		refPhyDiet.setDietConsistency(cmbDietConsistency.getSelectedItem()
				.toString());

		refPhyDiet.setNas(cbNAS.isSelected());
		refPhyDiet.setNcs(cbNCS.isSelected());
		refPhyDiet.setRenal(cbRENAL.isSelected());
		refPhyDiet.setCardiac(cbCARDIAC.isSelected());
		refPhyDiet.setNpo(cbNPO.isSelected());
		refPhyDiet.setPleasureFeeds(cbPleasureFeeds.isSelected());

		refPhyDiet.setBreakfast(txtBreakfast.getText());
		refPhyDiet.setLunch(txtLunch.getText());
		refPhyDiet.setDinner(txtDinner.getText());
		refPhyDiet.setNursing11(txtNursing11.getText());
		refPhyDiet.setNursing3(txtNursing3.getText());
		refPhyDiet.setNursing7(txtNursing7.getText());

		refPhyDiet.setFluidConsistency(cmbFluidConsistency.getSelectedItem()
				.toString());
		refPhyDiet.setFluidRestriction(cmbFluidRestriction.getSelectedItem()
				.toString());
		// refPhyDiet.setMilileters(cmbMilileters.getSelectedItem().toString());

		refPhyDiet.setMlDay(txtMLDay.getText());
		// refPhyDiet.setNumber(cmbNumber.getSelectedItem().toString());
		// refPhyDiet.setNursing(txtNursing.getText());
		refPhyDiet.setSupplements(txtSupplements.getText());
		refPhyDiet.setWeights(cmbWeights.getSelectedItem().toString());
		setBlankField();

		PhysicianOrderEnteralProtocol gtubeobject = null;
		//		
		// /*Global.currentPhysicianOrderDietKey;*/
		//		
		try {
			gtubeobject = MedrexClientManager.getInstance()
					.getPanelEnteralProtocol(
							PanelEnteralProtocol.currentGTubeKey);
		} catch (Exception e) {
			gtubeobject = new PhysicianOrderEnteralProtocol();
			// e.printStackTrace();
		}

		System.out.println("Global.currentPhysicianOrderEnteralProtocol ::"
				+ Global.currentPhysicianOrderEnteralProtocolKey);

		refPhyDiet.setIdgtube(gtubeobject);

		ParentalNutritionalOrderForm tpnobject = null;

		try {
			tpnobject = MedrexClientManager.getInstance()
					.getParentalNutritionalOrderForm(
							PanelParentalNutritionalOrderForm.currenttpnkey);
		} catch (Exception e) {
			tpnobject = new ParentalNutritionalOrderForm();
			// e.printStackTrace();
		}
		refPhyDiet.setIdtpn(tpnobject);

		try {

			Global.currentPhysicianOrderDietKey = MedrexClientManager
					.getInstance().insertOrUpdatePhysicianOrderDiet(refPhyDiet);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// int formId=Global.currentPhysicianOrderDietKey;

		// System.out.println("formId==:"+formId);*/

		System.out.println("  before Global.currentPhysicianOrderDietKey ::"
				+ Global.currentPhysicianOrderDietKey);

		PhysicianOrderRecord physRec = new PhysicianOrderRecord();
		physRec.setDateCreated(MedrexClientManager.getServerTime());
		physRec.setLastModified(MedrexClientManager.getServerTime());

		physRec.setFormId(Global.currentPhysicianOrderDietKey);

		System.out.println("  After Global.currentPhysicianOrderDietKey ::"
				+ Global.currentPhysicianOrderDietKey);
		physRec.setFormType("Diet");
		// physRec.setResidentId(Global.currentResidenceKey);

		ResidentMain resmain = null;
		try {
			resmain = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);

		}

		catch (Exception e) {
			e.printStackTrace();

		}
		physRec.setResidents(resmain);
		physRec.setStatus("");
		physRec.setTitle("Diet");
		// physRec.setUser(Global.currentLoggedInUserKey);

		Users user = null;
		try {
			user = MedrexClientManager.getInstance().getUser(
					Global.currentLoggedInUserKey);

		}

		catch (Exception e) {
			e.printStackTrace();

		}

		physRec.setUser(user);
		physRec.setSerial(Global.currentPhysicianOrderRecordKey);

		try {
			Global.currentPhysicianOrderRecordKey = MedrexClientManager
					.getInstance().insertOrUpdatePhysicianOrderRecord(physRec);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (Global.panelPhysicianOrderDetails != null) {
			Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();
		}
		setBlankField();

	}

	public void setValueObject(PhysicianOrderDiets diet) {
		cmbAsSnack.setSelectedItem(diet.getAsSnack());
		txtCalorieCount.setText(diet.getCalorieCount() + "");
		cmbDietConsistency.setSelectedItem(diet.getDietConsistency());
		cmbFluidConsistency.setSelectedItem(diet.getFluidConsistency());
		cmbFluidRestriction.setSelectedItem(diet.getFluidRestriction());
		// cmbMilileters.setSelectedItem(diet.getMilileters());
		txtMLDay.setText(diet.getMlDay());
		// cmbNumber.setSelectedItem(diet.getNumber());
		txtBreakfast.setText(diet.getBreakfast());
		txtLunch.setText(diet.getLunch());
		txtDinner.setText(diet.getDinner());
		txtNursing11.setText(diet.getNursing11());
		txtNursing3.setText(diet.getNursing3());
		txtNursing7.setText(diet.getNursing7());
		cbCARDIAC.setSelected(diet.getCardiac());
		// cbGTUBE.setSelected(diet.getGtube());
		cbNAS.setSelected(diet.getNas());
		cbNCS.setSelected(diet.getNcs());
		cbNPO.setSelected(diet.getNpo());
		cbPleasureFeeds.setSelected(diet.getPleasureFeeds());
		cbRENAL.setSelected(diet.getRenal());
		// cbTPN.setSelected(diet.getTpn());
		txtSupplements.setText(diet.getSupplements());
		cmbWeights.setSelectedItem(diet.getWeights());

	}

	// PanelPhysicianOrdersDiets

	public void setBlankField() {
		Global.currentPhysicianOrderRecordKey = 0;
		Global.currentPhysicianOrderDietKey = 0;

		cmbAsSnack.setSelectedItem("");
		txtCalorieCount.setText("");
		// txtDietary.setText("");
		cmbDietConsistency.setSelectedItem("");
		cmbFluidConsistency.setSelectedItem("");
		cmbFluidRestriction.setSelectedItem("");
		// cmbMilileters.setSelectedItem("");
		txtMLDay.setText("");
		txtBreakfast.setText("");
		txtDinner.setText("");
		txtLunch.setText("");
		txtNursing11.setText("");
		txtNursing3.setText("");
		txtNursing7.setText("");
		// cmbNumber.setSelectedItem("");
		// txtNursing.setText("");
		txtSupplements.setText("");
		cmbWeights.setSelectedItem("");
		// cbSplit.setSelected(false);

		cbCARDIAC.setSelected(false);
		cbGTUBE.setSelected(false);
		cbNAS.setSelected(false);
		cbNCS.setSelected(false);
		cbNPO.setSelected(false);
		cbPleasureFeeds.setSelected(false);
		cbRENAL.setSelected(false);
		cbTPN.setSelected(false);

	}

	/*
	 * public void fillCombo(){
	 * 
	 * for( int i = 1 ; i<=50 ;i++ ) { cmbNumber.addItem(i); } }
	 */

	public boolean doValidate() {
		new ValidationResult();
		String Mliterday = txtMLDay.getText();
		int status = getValidStatus();
		if (status == 1) {
			//JOptionPane.showInputDialog("total cannot be less than MLDays");
			JOptionPane.showMessageDialog(null, "<html> total cannot be less than MLDays <br> It should be equal to ML/Days ", "Error",2);
			 
			return false;

		}
		if (status == 2) {
			JOptionPane.showMessageDialog(null, "total cannot be more  than MLDays", "Error",2);
			return false;
		}

		return true;

	}

	public int getValidStatus() {

		int sumOftxtMLDay = Integer.parseInt(txtMLDay.getText());
		int sumOfComms = sum();

		if (sumOfComms < sumOftxtMLDay) {

			return 1;
		}

		if (sumOfComms > sumOftxtMLDay) {

			return 2;
		}

		return 0;

	}

	public int sum() {

		int sum = 0;
		  
	    int lunch,breakfast,dinner,nursing7,nursing11,nursing3;
	    
	    if((txtBreakfast.getText().isEmpty())){
	    	
	    	breakfast =0;
	    }
	    
	    else {
	    	breakfast =Integer.parseInt(txtBreakfast.getText());
	 	   
	         }
   if((txtDinner.getText().isEmpty())){
	    	
	   dinner =0;
	    	
	    	
	    }
   
    else {
	   dinner =Integer.parseInt(txtDinner.getText());
	   
        }
   
   if((txtLunch.getText().isEmpty())){
   	
	   lunch =0;
	    	
	    	
	    }
   
   else {
	   lunch =Integer.parseInt(txtLunch.getText());
	   
        }
   
   if((txtNursing7.getText().isEmpty())){
	   	
	   nursing7 =0;
	    	
	    	
	    }
   else {
	   nursing7 =Integer.parseInt(txtNursing7.getText());
	   
        }
   
   
   if((txtNursing11.getText().isEmpty())){
	   	
	   nursing11 =0;
	    	
	    	
	    }
   
   else {
	   nursing11 =Integer.parseInt(txtNursing11.getText());
	   
        }
   
   if((txtNursing3.getText().isEmpty())){
	   	
	   nursing3 =0;
	    	
	    	
	    }
   else {
	   nursing3    =Integer.parseInt(txtNursing3.getText());
	   
        }
			 
		  
		sum =  breakfast
				+ lunch
				+ dinner
				+ nursing7
				+ nursing11
				+ nursing3;
		return sum;

	}

}
