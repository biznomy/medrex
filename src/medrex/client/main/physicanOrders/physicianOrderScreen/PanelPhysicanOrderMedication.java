package medrex.client.main.physicanOrders.physicianOrderScreen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.fax.FaxDemo;
import medrex.client.loading.FrameLoading;
import medrex.client.main.physicanOrders.PanelPhysicianOrderNewFax;
import medrex.client.users.PanelUserSecurity;
import medrex.client.utils.FieldFormatter;
import medrex.client.utils.MsgBox;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.Medication;
import medrex.commons.vo.admin.NursingHome;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.physicianOrders.PhysicanOrderFax;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderMedication;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderRecord;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;
import medrex.server.dao.UserDAO;
import medrex.server.dao.admin.medication.TreatmentDao;
import medrex.server.dao.physicianOrders.physicianOrderNewScreen.PhysicianOrderNewFaxDAO;

import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTabbedPane;
import com.sX.swing.JxText;
import com.sX.swing.JxTabbedPane.JxTabStyle;
import com.sX.theme.BlueOverWhiteTheme;
import com.sX.theme.Theme;
import com.toedter.calendar.JDateChooser;

import com.sX.swing.JxButton;
import com.sX.swing.JxLabel;
import com.sX.swing.JxText;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxCheckBox;
import com.sX.swing.JxRadioButton;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxTextA;
import com.sX.swing.JxPanel;


public class PanelPhysicanOrderMedication extends JxPanel {
	private JxLabel routineMedicationLabel;
	private JxRadioButton rbToDays;
	private JxRadioButton rbToDate;
	private JxComboBox cmbDay;
	private JxText txtDay;
	private JxLabel prnLabel;
	private JxLabel lPnrIndication;
	private JxTextA txtPrnIndication;
	private boolean isActive;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7968011175488196230L;
	private JxComboBox cmbList;
	private FramePhysicianOrder framePhysicianOrder;
	private JxButton deleteButton;
	private JxButton saveButton;
	private JxButton addNewButton;
	private JxTextA txtInstruction;
	// private JxComboBox cmbFrequency2;
	private JxComboBox cmbFrequency1;
	/* private ButtonGroup bgDaily = new ButtonGroup(); */
	private ButtonGroup bgYes = new ButtonGroup();
	private JxDateChooser dcDurationTo;
	private JxDateChooser dcDurationFrom;
	private JxRadioButton rbPrnNo;
	private JxRadioButton rbPrnYes;
	private  PhysicianOrderMedication psom;
	public  JxPanel panel_1;
	public  JxPanel panel_2;
	//public JxPanel panel_3;
	/*
	 * private JxRadioButton rbDurationChoose; private JxRadioButton
	 * rbDurationDaily;
	 */
	/* private JxText txtDuration1; */
	private JxComboBox txtRoute;
	private JxText txtInstructions;
	private JxComboBox cmbDose;
	private JxText txtMedication;
	private Medication medication;
	private Map<String, Integer> map = new HashMap<String, Integer>();
	private JxCheckBox cbPRN;
	private JxText txtDose;
	private JxCheckBox cbDurationNA;
	private JTabbedPane tabbedPane;
	private ButtonGroup bgToDate;
	
	Theme theme = new BlueOverWhiteTheme();
	private JxPanel panelToDate;

	public Medication getMedication() {
		return medication;
	}

	public void setMedication(Medication medication) {
		this.medication = medication;
	}

	
	public static void main(String[] args) {
		JFrame frm = new JFrame();
//		JScrollPane scroll = new JScrollPane();
		PanelPhysicanOrderMedication t = new PanelPhysicanOrderMedication();
//		scroll.setViewportView(t);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frm.getContentPane().add(scroll);
		frm.getContentPane().add(t);
		frm.setSize(500, 400);
		frm.setVisible(true);

	}
	
	/*public static void main(String []args){
		JFrame frame =new JFrame();
		PanelPhysicanOrderMedication t = new PanelPhysicanOrderMedication();
		
		frame.getContentPane().add(t);
		frame.setSize(500, 500);
		frame.setVisible(true);
	}*/

	public PanelPhysicanOrderMedication(/*PhysicianOrderMedication psom*/) {
		super();
		setBackground(Color.WHITE);
		
	 
		
		this.psom=psom;
		
		Global.panelPhysicianOrdersMedication = this;
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(600, 320));
		
		final JxPanel panel = new JxPanel();
		panel.setTheme (theme);

		panel.setLayout(new BorderLayout());
		add(panel);

	 

		final JxPanel panelCommands = new JxPanel();
		panelCommands.setTheme (theme);

		panelCommands.setLayout(null);
		panelCommands.setPreferredSize(new Dimension(0, 30));
		panel.add(panelCommands, BorderLayout.SOUTH);
		
		final JxButton addNewButton = new JxButton();
		addNewButton.setTheme (theme);

		addNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				setBlankField();
				Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();
			}
		});

		addNewButton.setForeground(ColorConstants.DEF_COLOR);

addNewButton.setFontSize(12);
addNewButton.setFontStyle(Font.BOLD);
		addNewButton.setText("Reset");
		addNewButton.setArc(0.4f);
		addNewButton.setBounds(95, 3, 117, 26);
		panelCommands.add(addNewButton);

		final JxButton saveButton = new JxButton();
		saveButton.setTheme (theme);

		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				if (doValidate()) {
					doSave();
					SwingUtils.openInDialog(new PanelPhysicianOrderNewFax());
					Global.framePhysicianOrder.dispose();
					
				}
			}
		});

		saveButton.setForeground(ColorConstants.DEF_COLOR);

saveButton.setFontSize(12);
saveButton.setFontStyle(Font.BOLD);
		saveButton.setArc(0.4f);
		saveButton.setText("Save");
		saveButton.setBounds(236, 3, 117, 26);
		panelCommands.add(saveButton);

		final JxButton deleteButton = new JxButton();
		deleteButton.setTheme (theme);

		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				
		   PhysicianOrderMedication pomActive = null;
		   isActive = false;
		   PanelShowMedicationDetails panelShow = new PanelShowMedicationDetails();
		   pomActive =     panelShow.list;
		   
		    
		      
		   
		   
				
		/*	 	if (doDelete()) {
					;
					setBlankField();
				} */
			}
		});

		deleteButton.setForeground(ColorConstants.DEF_COLOR);

deleteButton.setFontSize(12);
deleteButton.setFontStyle(Font.BOLD);
		deleteButton.setText("Discontinue");
		deleteButton.setArc(0.4f);
		deleteButton.setBounds(370, 3, 129, 26);
		panelCommands.add(deleteButton);
		
		panel_1 = new JxPanel();
		panel_1.setTheme (theme);
		
	
		panel_1.setOpaque(false);

		
		 panel_1.setName("");
		panel_1.setLayout(null);
		panel_1.setTheme(theme);
		panel_1.setBounds(21, 10, 550, 261);
		
		tabbedPane = new JTabbedPane();
		tabbedPane.setOpaque(false);
	
		tabbedPane.setPreferredSize(new Dimension(0, 0));
		tabbedPane.setBackground(Color.WHITE);
		tabbedPane.setForeground(ColorConstants.DEF_COLOR);
		//tabbedPane.setBounds(28, 61, 696, 434);
		tabbedPane.setBounds(28, 61, 550, 261);
		
		/*tabbedPane.setTabSize(new Dimension(120, 30));
		tabbedPane.setTabStyle(JTabStyle.WIN2);*/
		//tabbedPane.setForeground(JxTabStyle.WIN2.getBorder().getLineColor());
		
		
	 
		
		 
		tabbedPane.setFont(new Font("Dialog", Font.BOLD, 12));
	 
		
		panel.add(tabbedPane, BorderLayout.CENTER);

 

		cbPRN = new JxCheckBox();
		cbPRN.setTheme (theme);
		cbPRN.setVisible(false);
		cbPRN.setEnabled(false);
		cbPRN.setBounds(505, 32, 29, 18);
		cbPRN.setForeground(ColorConstants.DEF_COLOR);
		cbPRN.setVisible(false);
		cbPRN.setActionCommand("0");
		cbPRN.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				if (cbPRN.isSelected()) {
					txtPrnIndication.setEditable(true);
					txtPrnIndication.setEnabled(true);
					// txtInstruction.setEditable(true);
				} else {
					txtPrnIndication.setEditable(false);
					// txtInstruction.setEditable(false);
					txtPrnIndication.setEnabled(false);
				}
			}
		});
		


cbPRN.setFontSize(12);
cbPRN.setFontStyle(Font.BOLD);
		cbPRN.setText("");
		panel_1.add(cbPRN);
        
		final JxLabel lPnrIndication = new JxLabel();
		lPnrIndication.setTheme (theme);

lPnrIndication.setFontSize(12);
lPnrIndication.setFontStyle(Font.BOLD);
		lPnrIndication.setVisible(false);
		lPnrIndication.setBounds(370, 32, 127, 18);
		lPnrIndication.setForeground(ColorConstants.DEF_COLOR);
		lPnrIndication.setVisible(false);
		panel_1.add(lPnrIndication);
		lPnrIndication.setText("Indication For Use");

		final JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(370, 50, 174, 90);
		scrollPane_2.setVisible(false);
		panel_1.add(scrollPane_2);
	
		scrollPane_2.setBorder(new LineBorder(Color.black, 1, false));
		scrollPane_2.setBackground(Color.WHITE);
         
		txtPrnIndication = new JxTextA();
		txtPrnIndication.setTheme (theme);
		
		scrollPane_2.setViewportView(txtPrnIndication);
		txtPrnIndication.setLineWrap(true);
		 

		txtPrnIndication.setForeground(ColorConstants.DEF_COLOR);
		txtPrnIndication.setVisible(true);
		txtPrnIndication.setEditable(true);
		



//		panel.add(panel_1);
		
	/*	panel_3  = new JxPanel();
		panel_3.setBounds(21, 10, 550, 261);
		panel_3.add(panel_1);*/
		
		panel_2 = new JxPanel();
		panel_2.setTheme (theme);

		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);		
		panel_2.setBounds(386, 10, 650, 261);
		//panel_2.add(panel_1);
		//panel_3.add	(panel_1);
		 
		
		//panelUserSecurity = new PanelUserSecurity();
		tabbedPane.addTab("Routine", null, panel_1);
        tabbedPane.addTab("PRN", null, null);
         
        
	    //tabbedPane.insertTab("PRN", null, panel_1, "", 1);
	     
	    
	    tabbedPane.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent e) {
	          if(tabbedPane.getSelectedIndex()==1){
	        	  
	        	 
	        		System.out.println("I am in PNR................");
	        	   	lPnrIndication.setVisible(true);
		        	 
		        	cbPRN.setVisible(false);
		        	scrollPane_2.setVisible(true);
		        	routineMedicationLabel.setText("PRN MEDICATION");
	        		
	        	
	             
	           
	         }
	          
	          if(tabbedPane.getSelectedIndex()==0){
	        	  
	        	  
	        	System.out.println("I am in Routine................");
	        	lPnrIndication.setVisible(false);
	         
	        	cbPRN.setVisible(false);
	        	scrollPane_2.setVisible(false);
	        	routineMedicationLabel.setText("ROUTINE MEDICATION");
	        	 
	       
		         }
	          
	          
	          
	        }
	      });
		

	
		final JxLabel medicationLabel = new JxLabel();
		medicationLabel.setTheme (theme);
		medicationLabel.setBounds(10, 32, 96, 16);
		panel_1.add(medicationLabel);
		medicationLabel.setForeground(ColorConstants.DEF_COLOR);

medicationLabel.setFontSize(12);
medicationLabel.setFontStyle(Font.BOLD);
		medicationLabel.setText("MEDICATION");

		final JxLabel doseLabel = new JxLabel();
		doseLabel.setTheme (theme);
		doseLabel.setBounds(10, 89, 83, 18);
		panel_1.add(doseLabel);
		doseLabel.setForeground(ColorConstants.DEF_COLOR);

doseLabel.setFontSize(12);
doseLabel.setFontStyle(Font.BOLD);
		doseLabel.setText("DOSE");

		final JxLabel instructionsLabel = new JxLabel();
		instructionsLabel.setTheme (theme);
		instructionsLabel.setBounds(10, 113, 96, 18);
		panel_1.add(instructionsLabel);
		instructionsLabel.setForeground(ColorConstants.DEF_COLOR);

instructionsLabel.setFontSize(12);
instructionsLabel.setFontStyle(Font.BOLD);
		instructionsLabel.setText("INSTRUCTIONS");

		final JxLabel routeLabel = new JxLabel();
		routeLabel.setTheme (theme);
		routeLabel.setBounds(10, 137, 83, 18);
		panel_1.add(routeLabel);
		routeLabel.setForeground(ColorConstants.DEF_COLOR);

routeLabel.setFontSize(12);
routeLabel.setFontStyle(Font.BOLD);
		routeLabel.setText("ROUTE");

		final JxLabel frequencyLabel = new JxLabel();
		frequencyLabel.setTheme (theme);
		frequencyLabel.setBounds(10, 162, 83, 18);
		panel_1.add(frequencyLabel);
		frequencyLabel.setForeground(ColorConstants.DEF_COLOR);

frequencyLabel.setFontSize(12);
frequencyLabel.setFontStyle(Font.BOLD);
		frequencyLabel.setText("FREQUENCY");

		final JxLabel durationLabel = new JxLabel();
		durationLabel.setTheme (theme);
		durationLabel.setBounds(10, 190, 65, 18);
		panel_1.add(durationLabel);
		durationLabel.setForeground(ColorConstants.DEF_COLOR);

durationLabel.setFontSize(12);
durationLabel.setFontStyle(Font.BOLD);
		durationLabel.setText("DURATION");

		final JxLabel fromLabel = new JxLabel();
		fromLabel.setTheme (theme);
		fromLabel.setForeground(ColorConstants.DEF_COLOR);

fromLabel.setFontSize(12);
fromLabel.setFontStyle(Font.BOLD);
		fromLabel.setBounds(174, 190, 30, 15);
		panel_1.add(fromLabel);
		fromLabel.setText("From");		
		
		rbToDate = new JxRadioButton();
		rbToDate.setTheme (theme);
		rbToDate.setForeground(ColorConstants.DEF_COLOR);

		rbToDate.setSelected(true);  

rbToDate.setFontSize(12);
rbToDate.setFontStyle(Font.BOLD);
		rbToDate.setBounds(378, 190,22,15);
		panel_1.add(rbToDate);
		rbToDate.setText("");
		
		
		rbToDays = new JxRadioButton();
		rbToDays.setTheme (theme);
		rbToDays.setForeground(ColorConstants.DEF_COLOR);

		 

rbToDays.setFontSize(12);
rbToDays.setFontStyle(Font.BOLD);
		rbToDays.setBounds(378, 218,22,15);
		panel_1.add(rbToDays);
		
		
		bgToDate=new ButtonGroup();
		bgToDate.add(rbToDate);
		bgToDate.add(rbToDays);
		
		
		panelToDate = new JxPanel();
		panelToDate.setTheme (theme);
		panelToDate.setLayout(null);

		panelToDate.setBounds(400,215,142,23);
		panel_1.add(panelToDate);
		panelToDate.setForeground(ColorConstants.DEF_COLOR);
		
		txtDay = new JxText(FieldFormatter.MAX5);
		txtDay.setTheme (theme);

		txtDay.setForeground(ColorConstants.DEF_COLOR);
		txtDay.setEnabled(false);
		txtDay.setBounds(0, 0, 46, 22);
		panelToDate.add(txtDay);

		cmbDay = new JxComboBox();
		cmbDay.setTheme (theme);
		cmbDay.setEnabled(false);
		cmbDay.setBounds(70, 0, 69, 22);

		cmbDay.setForeground(ColorConstants.DEF_COLOR);
		cmbDay.setModel(new DefaultComboBoxModel(new String[] { "","Days","Week","Month"}));
		panelToDate.add(cmbDay);
		
		
		rbToDays.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSelection();
			}

		});
		
		rbToDate.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSelection();
			}

		});
		
		
		cbDurationNA = new JxCheckBox();
		cbDurationNA.setTheme (theme);
		cbDurationNA.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (cbDurationNA.isSelected()) {
					dcDurationFrom.setEnabled(false);
					dcDurationTo.setEnabled(false);
					rbToDate.setEnabled(false);
					rbToDays.setEnabled(false);
					 
					txtDay.setEnabled(false);
					cmbDay.setEnabled(false);

				}
				if (!cbDurationNA.isSelected()) {
					
					dcDurationFrom.setEnabled(true);
					rbToDate.setEnabled(true);
					rbToDays.setEnabled(true);
					dcDurationTo.setEnabled(true);
					txtDay.setEnabled(true);
				   cmbDay.setEnabled(true);
					
				 
					

				}
			}
		});

cbDurationNA.setFontSize(12);
cbDurationNA.setFontStyle(Font.BOLD);

		cbDurationNA.setText("N/A");
		cbDurationNA.setForeground(ColorConstants.DEF_COLOR);
		cbDurationNA.setBounds(112, 190, 49, 18);
		panel_1.add(cbDurationNA);

		dcDurationFrom = new JxDateChooser();
		dcDurationFrom.setTheme (theme);
		dcDurationFrom.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(final PropertyChangeEvent evt) {
				if (dcDurationFrom.getDate() != null) {
					//cbDurationNA.setEnabled(false);
				} else {
					//cbDurationNA.setEnabled(true);
				}
			}
		});
		dcDurationFrom.setBounds(210, 187, 139, 21);
		
		
		dcDurationFrom
				.setMinSelectableDate(MedrexClientManager.getServerTime());
		System.out.println(MedrexClientManager.getServerTime().toString());
		dcDurationFrom.setDateFormatString("MM/dd/yyyy");
 
		dcDurationFrom.setTheme(theme);
		panel_1.add(dcDurationFrom);

 

		txtMedication = new JxText();
		txtMedication.setTheme (theme);
		txtMedication.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(final FocusEvent arg0) {
				doSearch();
			}
		});
		txtMedication.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(final KeyEvent e) {

				doSearch();
				// String text = cmbList.getSelectedItem().toString();
				// txtMedication.setText(text);
			}

			@Override
			public void keyPressed(final KeyEvent arg0) {
				doSearch();
			}
		});
		txtMedication.setBounds(112, 30, 237, 22);
		if(this.psom!=null)
		{
			
			txtMedication.setText(psom.getMedication());
			System.out.print("Medication..........."+ txtMedication.getText());
		}
		panel_1.add(txtMedication);

		txtMedication.setForeground(ColorConstants.DEF_COLOR);

	 

		dcDurationTo = new JxDateChooser();
		dcDurationTo.setTheme (theme);
		dcDurationTo.setOpaque(true);
		dcDurationTo.setBackground(Color.white);
		Component com[]=dcDurationTo.getComponents();
	   for(int i=0;i<com.length;i++){
			
			com[i].setForeground(ColorConstants.DEF_COLOR);
		}
		dcDurationTo.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(final PropertyChangeEvent arg0) {
				if (dcDurationTo.getDate() != null) {
					//cbDurationNA.setEnabled(false);
				} else {
					//cbDurationNA.setEnabled(true);
				}

			}
		});
		dcDurationTo.setBounds(400,187,139,21);
		dcDurationTo.setEnabled(true);
		panel_1.add(dcDurationTo);
		dcDurationTo.setDateFormatString("MM/dd/yyyy");
		
	
		 
		 

		cmbDose = new JxComboBox();
		cmbDose.setTheme (theme);
		cmbDose.setBounds(192, 86, 157, 22);
		panel_1.add(cmbDose);

		cmbDose.setInputVerifier(null);
		cmbDose.setModel(new DefaultComboBoxModel(new String[] { "", "MG", "G",
				"ML", "CC", "MCG", "UNITS", "GRAINS" }));
		cmbDose.setForeground(ColorConstants.DEF_COLOR);

		txtInstructions = new JxText();
		txtInstructions.setTheme (theme);
		txtInstructions.setBounds(112, 110, 237, 22);
		txtInstructions.setForeground(ColorConstants.DEF_COLOR);
		panel_1.add(txtInstructions);

		txtRoute = new JxComboBox();
		txtRoute.setTheme (theme);
		txtRoute.setBounds(112, 134, 237, 22);
		panel_1.add(txtRoute);

		txtRoute.setForeground(ColorConstants.DEF_COLOR);
		txtRoute.setModel(new DefaultComboBoxModel(new String[] { "", "PO-By mouth",
				"IM-Intramuscular", "IV-Intravenous", "PR-Rectal", "GT-Enteral", "SQ-Subcutaneous", "SL-Sublingual", "Topical", "Nebulizer","Nasal" ,"Eyes","Buccal","Transdermal","Intradermal"}));

		cmbFrequency1 = new JxComboBox();
		cmbFrequency1.setTheme (theme);
		cmbFrequency1.setBounds(112, 159, 237, 22);
		panel_1.add(cmbFrequency1);

		cmbFrequency1.setForeground(ColorConstants.DEF_COLOR);

		routineMedicationLabel = new JxLabel();
		routineMedicationLabel.setTheme (theme);

routineMedicationLabel.setFontSize(14);
routineMedicationLabel.setFontStyle(Font.BOLD);
		routineMedicationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		routineMedicationLabel.setText("ROUTINE MEDICATION");
		routineMedicationLabel.setBounds(140, 10, 180, 14);
		routineMedicationLabel.setForeground(ColorConstants.DEF_COLOR);
		panel_1.add(routineMedicationLabel);

		txtDose = new JxText(FieldFormatter.MAX5);
		txtDose.setTheme (theme);
		txtDose.setBounds(112, 85, 76, 22);
		txtDose.setForeground(ColorConstants.DEF_COLOR);
		panel_1.add(txtDose);

		cmbList = new JxComboBox();
		cmbList.setTheme (theme);
		cmbList.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {

				if (cmbList.getSelectedItem() != null) {
					String selectedMedication = cmbList.getSelectedItem()
							.toString();
					txtMedication.setText(selectedMedication);
					List<Medication> medicationList = null;
					try {
						medicationList = MedrexClientManager.getInstance()
								.getMedication();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					Iterator<Medication> itr = medicationList.iterator();
					while (itr.hasNext()) {
						Medication medObj = itr.next();
						if (selectedMedication.equalsIgnoreCase(medObj.getNdc()
								+ " " + medObj.getName())) {
							setMedication(medObj);
						}
						}
					// close();
				 } else {
					JOptionPane.showMessageDialog(null,
							"Please Select A Medication");
				}

			}

		 
		});
		cmbList.setModel(new DefaultComboBoxModel(new String[] { "" }));

		cmbList.setForeground(ColorConstants.DEF_COLOR);
		
		cmbList.setBounds(112, 58, 237, 22);
		panel_1.add(cmbList);

		final JxLabel toLabel = new JxLabel();
		toLabel.setTheme (theme);
		toLabel.setForeground(ColorConstants.DEF_COLOR);

toLabel.setFontStyle(Font.BOLD);
		toLabel.setText("To");

		toLabel.setBounds(359, 190, 16, 16);
		panel_1.add(toLabel);

         fillCombos();
		
 
	}

 
	
	protected void doSearch() {
		List<String> strList = new ArrayList<String>();
		List<Medication> mediList = new ArrayList<Medication>();
 
		try {
			if (txtMedication != null) {
				mediList = TreatmentDao.getInstance()
						.getMedicationByPhysicianOrder(txtMedication.getText());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Iterator<Medication> itr = mediList.iterator();
		while (itr.hasNext()) {
			Medication medName = itr.next();
			strList.add(medName.getNdc() + " " + medName.getName());
		}
		cmbList.setModel(new DefaultComboBoxModel(strList.toArray()));

	}

	protected boolean doValidate() {
		boolean validated = false;
		List<String> errorList = new ArrayList<String>();
		Date startDate = dcDurationFrom.getDate();
		Date endDate = dcDurationTo.getDate();
		if (txtMedication.getText().equalsIgnoreCase("")) {
			errorList.add("Please Select A Medication");
		}
		if (cmbFrequency1.getSelectedItem().toString().equalsIgnoreCase("")) {
			errorList.add("Please Select Frquency");
		}
		if (cbPRN.isSelected() && txtPrnIndication.getText().length() <= 0) {
			errorList.add("Please Provide Indication");
		}
        
		boolean b = cbDurationNA.isSelected();  
		if (!b) {
			
			if (null == startDate) {
				errorList.add("Start Date Not Selected");
			}
			
			 if(rbToDate.isSelected()){
				 
			 if (null == endDate) {
				 
				errorList.add("End Date Not Selected");
			             }
		 
			 }
			 
			 if(rbToDays.isSelected()){
				 String numofDays = txtDay.getText().trim();
			     if(numofDays.isEmpty())
					 if(numofDays.isEmpty()){
						 
						 errorList.add("Number of Days/week/Month could not be blank"); 
					 }
				  
				 
				if( numofDays.equalsIgnoreCase("0"))   // not numofDays=="0"
				 {
				      errorList.add("Number of Days/week/Month    should be more than zero");   
				      
				 }
				 
				 if(cmbDay.getSelectedItem().toString()==""){
					 
					 errorList.add("Choose Days or Week or Month");  
					 
				 
				 }
				 
				 
				 
				 
			 }
			 
			 
			 
			
			if ((null != endDate && null != startDate)) {
				if (endDate.before(startDate)) {
					errorList.add("Start Date should be less than End Date");
				}
			}
		}
		System.out.println("Error List Size " + errorList.size());
		
		if (errorList.size() > 0) {

			MsgBox m = new MsgBox();
			Iterator<String> itr = errorList.iterator();
			String strError = "";
			while (itr.hasNext()) {
				strError += itr.next() + "\n";
			}
			m.addPrompt(strError);
			m.setTitle("Error saving Medication");
			m.setVisible(true);

			validated = false;
			return validated;

		} else {

			validated = true;
			return validated;
		}
	}

	private void fillCombos() {
		List<Object[]> list = null;
		try {
			list = MedrexClientManager.getInstance().getMedicationFrequencies();
		} catch (Exception e) {

			e.printStackTrace();
		}
		cmbFrequency1.addItem("");
	//cmbFrequency1.setModel(new DefaultComboBoxModel(list.toArray()));
		Iterator<Object[]> it = list.iterator();
		while (it.hasNext()) {

			Object obj[] = it.next();
			map.put(obj[1].toString(), (Integer) obj[0]);
			cmbFrequency1.addItem(obj[1].toString());
			//System.out.println("vluedfdfd"+ cmbFrequency1.getItemAt(2).toString());
		}
	}

	public boolean doDelete() {
		boolean flag = false;
		try {
			if (Global.currentPhysicianOrderRecordKey != 0
					&& Global.currentPhysicianOrderMedicationKey != 0) {
				MedrexClientManager.getInstance().deletePhysicianOrderRecord(
						Global.currentPhysicianOrderRecordKey);
				MedrexClientManager.getInstance()
						.deletePhysicianOrderMedication(
								Global.currentPhysicianOrderMedicationKey);
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();
		return flag;
	}

	public void doSave() {
		PhysicianOrderMedication refPhysicianOrderMedication = new PhysicianOrderMedication();
		refPhysicianOrderMedication
				.setSerial(Global.currentPhysicianOrderMedicationKey);
		
		ResidentMain res=null;
		
		try {
			res=MedrexClientManager.getInstance().getResident(Global.currentResidenceKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	/*	if(!txtDay.getText().isEmpty()){
		refPhysicianOrderMedication.setToDay(Integer.parseInt(txtDay.getText()));
		}*/
		
	//	refPhysicianOrderMedication.setToMondthDay(cmbDay.getSelectedItem().toString());
		
		refPhysicianOrderMedication.setResidents(res); 
		// refPhysicianOrderMedication.setPrnInstructionComments(txtInstruction.getText());
		refPhysicianOrderMedication.setPrnIndicationComments(txtPrnIndication
				.getText());
		refPhysicianOrderMedication.setFrequency1(map.get(cmbFrequency1
				.getSelectedItem().toString()));
		
		if (getMedication() != null) {
			refPhysicianOrderMedication.setMedicationId(getMedication()
					.getNdc());

		}
		refPhysicianOrderMedication
				.setPrnIndication(cbPRN.isSelected() ? 1 : 0);
		
		if (txtDose.getText().length() != 0) {
			refPhysicianOrderMedication.setDoseAmount(Integer.parseInt(txtDose
					.getText())); 
		} 
		
	/*	if (dcDurationFrom.isEnabled() || dcDurationFrom.isEnabled()) {
			if(rbToDate.isSelected()){
			refPhysicianOrderMedication.setDurationTo(dcDurationTo.getDate());
			refPhysicianOrderMedication.setDurationFrom(dcDurationFrom
					.getDate());
			}
		} else {
			refPhysicianOrderMedication.setDurationTo(new Date());
			refPhysicianOrderMedication.setDurationFrom(new Date());
		}
		
		if(rbToDays.isSelected()){
		
		refPhysicianOrderMedication.setDurationTo(getToDate(Integer.parseInt(txtDay.getText()) , cmbDay.getSelectedItem().toString(), dcDurationFrom.getDate()));
		}*/
		
		if(!cbDurationNA.isSelected()){
			
			if(rbToDate.isSelected()){
				refPhysicianOrderMedication.setDurationTo(dcDurationTo.getDate());
				refPhysicianOrderMedication.setDurationFrom(dcDurationFrom
						.getDate());
				
			}
			if(rbToDays.isSelected()){
				refPhysicianOrderMedication.setDurationFrom(dcDurationFrom
						.getDate());
				refPhysicianOrderMedication.setToDay(Integer.parseInt(txtDay.getText()));
				refPhysicianOrderMedication.setToMondthDay(cmbDay.getSelectedItem().toString());
				
		refPhysicianOrderMedication.setDurationTo(getToDate(Integer.parseInt(txtDay.getText()) , cmbDay.getSelectedItem().toString(), dcDurationFrom.getDate()));

				
			}
			
			
			
		}
		
		else 
		{
			refPhysicianOrderMedication.setDurationTo(new Date());
			refPhysicianOrderMedication.setDurationFrom(new Date());
		}
	 
		refPhysicianOrderMedication.setRoute(txtRoute.getSelectedItem()
				.toString());
		refPhysicianOrderMedication.setInstructions(txtInstructions.getText());
		//refPhysicianOrderMedication.setDose(txtDose.getText());
		
		refPhysicianOrderMedication.setDose(cmbDose.getSelectedItem().toString());
		
	
		//refPhysicianOrderMedication.setMedication(getMedication().getName()); 
		refPhysicianOrderMedication.setMedication(txtMedication.getText()); 
		
		try {
			Global.currentPhysicianOrderMedicationKey = MedrexClientManager
					.getInstance().insertOrUpdatePhysicianOrderMedication(
							refPhysicianOrderMedication);
		} catch (Exception e) {
			e.printStackTrace();
		}
		PhysicianOrderRecord physRec = new PhysicianOrderRecord();
		ResidentMain resmain = null;
		physRec.setDateCreated(MedrexClientManager.getServerTime());
		physRec.setLastModified(MedrexClientManager.getServerTime());
		physRec.setFormId(Global.currentPhysicianOrderMedicationKey);
		physRec.setFormType("Medication");
	 
		try{
		   resmain = MedrexClientManager.getInstance().getResident(Global.currentResidenceKey);
	         }
	 
	 catch(Exception e){
		 e.printStackTrace();
		 
	 }
		physRec.setResidents(resmain);
		physRec.setStatus("");
		
		Users usr = null;
		try{
		    usr    =	UserDAO.getInstance().getUsersByIUserId(Global.currentLoggedInUserKey);
		    System.out.println(usr.getUserName());

		}
		
		catch(Exception e){
			
			e.printStackTrace();
		}
		
	      	
	      	
		//physRec.setUser(Global.currentLoggedInUserKey); 
		physRec.setUser(usr);
		physRec.setSerial(Global.currentPhysicianOrderRecordKey);
		physRec.setTitle(refPhysicianOrderMedication.getRoute());

		try {
			Global.currentPhysicianOrderRecordKey = MedrexClientManager
					.getInstance().insertOrUpdatePhysicianOrderRecord(physRec);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (Global.panelPhysicianOrderDetails != null) {
			Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();
		}
		

		
		NursingHome nh = null;
		String fax = "";
		String CRLF = "\r\n";
		
		
		try {
			nh = MedrexClientManager.getInstance().getNursingHomeInfo(1);
		} catch (RemoteException e) {
		 
			e.printStackTrace();
		} catch (MedrexException e) {
			 
			e.printStackTrace();
		}
		fax = fax + "Nursing Home -";
		if (nh !=null){
			fax = fax + " " + nh.getName() + " "+ nh.getAddress()+ " " +nh.getCity() + " "+ nh.getState();  
		}
		fax = fax + CRLF;
		
		
		ResidentMain rm = null;
		
		try {
			rm = MedrexClientManager.getInstance().getResident(Global.currentResidenceKey);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		fax = fax + "Resident -";
		if (rm !=null){
			fax = fax + " " + rm.getUserName() + " "+ rm.getUserPass();  
		}
		fax = fax + CRLF;
		
		
		TempRoomHistory roomHist = null;
		try {
			roomHist = MedrexClientManager.getInstance()
					.getCurrentRoomForResident(Global.currentResidenceKey);
		} catch (Exception e) {
		}
		
		
		fax = fax + "Room No. -";
		if (roomHist !=null){
			fax = fax + " " + roomHist.getRoom();  
		}
		fax = fax + CRLF;
		
		fax = fax + "Dob -";
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

		if (rm !=null){
			fax = fax + " " + sdf.format(rm.getDob());  
		}
		fax = fax + CRLF;
		
		fax = fax + "Allergy Information -";
		fax = fax + CRLF;
		
		fax = fax + "Drug Name -";
		fax = fax + CRLF;
		
		fax = fax + "SIG/Route -";
		fax = fax + CRLF;
		
		fax = fax + "HOA -";
		fax = fax + CRLF;
		
		fax = fax + "Physician Name -";
		fax = fax + CRLF;
		
		fax = fax + "Physician DEA Number -";
		fax = fax + CRLF;	
		
		fax = fax + "Physician E signature -";
		fax = fax + CRLF;
		
		
	//	fax = fax + "Medication -"+ getMedication().getName();
		fax = fax + "Medication -"+ txtMedication.getText();
		
		fax = fax + CRLF;
		
		fax = fax + "Route -"+ txtRoute.getSelectedItem().toString();
		fax = fax + CRLF;
		
		fax = fax + "Instruction -"+ txtInstructions.getText();
		fax = fax + CRLF;
		
		fax = fax + "Dose -"+ txtDose.getText();
		fax = fax + CRLF;

		final String fax1=fax;
		
		int option = JOptionPane.showConfirmDialog(null, "Do you want to send fax now?", "",
                 JOptionPane.YES_NO_OPTION);

		PhysicanOrderFax pf = new PhysicanOrderFax();
		pf.setSerial(0);
		pf.setDetail(fax1);
		pf.setDate(new Date());

		if(option == JOptionPane.YES_OPTION){
			pf.setStatus("1");
			try{
			PhysicianOrderNewFaxDAO.getInstance().insertOrUpdatePhysicianOrderFax(pf);
			}
			catch(Exception e){
				
			}
			
			final FrameLoading fl = new FrameLoading("Sending Fax");
			javax.swing.SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					fl.callNotify();
				}
			});

			new Thread(new Runnable() {
				public void run() {

					for (int i = 0; i < 10000000; i++) {
					}
					System.out.println(fax1);
					try{
//					 ( new FaxDemo()).run(fax1);
					}catch(Exception e){
						System.out.println(" Fax exception "+ e.getMessage());
					}
					
					
					
					fl.dispose();
				}
			}).start();
			;

			try {
				if (!fl.isVisible())
					fl.setVisible(true);
			} catch (Exception ee) {

			}

		}
		else{
			pf.setStatus("0");
			try{
			PhysicianOrderNewFaxDAO.getInstance().insertOrUpdatePhysicianOrderFax(pf);
			}
			catch(Exception e){
				
			}
			
		}

		
		
		
		
		
	
		
		setBlankField();
		doSelection();
	
	}

	public void setValueObject(
			PhysicianOrderMedication refPhysicianOrderMedication) 
	{
		
		Global.currentPhysicianOrderMedicationKey=refPhysicianOrderMedication.getSerial();
		if (map.containsValue(refPhysicianOrderMedication.getFrequency1())) {
		
			cmbFrequency1
					.setSelectedItem(getFrequencyKey(refPhysicianOrderMedication
							.getFrequency1()));
		}
		txtDose.setText(refPhysicianOrderMedication.getDoseAmount() + "");
		dcDurationTo.setDate(refPhysicianOrderMedication.getDurationTo());
		dcDurationFrom.setDate(refPhysicianOrderMedication.getDurationFrom());
		/*
		 * if(refPhysicianOrderMedication.getDuration1()!=0){
		 * txtDuration1.setText(refPhysicianOrderMedication.getDuration1()+"");
		 * }
		 */
	 
	txtRoute.setSelectedItem(refPhysicianOrderMedication.getRoute().toString());
		
		 
	  
			
	   if(!((refPhysicianOrderMedication.getToDay())==0 && refPhysicianOrderMedication.getToMondthDay()==null)){
	    txtDay.setText(String.valueOf(refPhysicianOrderMedication.getToDay()));
	   cmbDay.setSelectedItem(refPhysicianOrderMedication.getToMondthDay()); 
	  
	   }
 
	 
		
		txtInstructions.setText(refPhysicianOrderMedication.getInstructions());
		// txtInstruction.setText(refPhysicianOrderMedication.getPrnInstructionComments());
		cmbDose.setSelectedItem(refPhysicianOrderMedication.getDose());
		txtMedication.setText(refPhysicianOrderMedication.getMedication());
		cmbFrequency1.setSelectedItem(refPhysicianOrderMedication
				.getFrequency1());
	   String PRNcommnets= 	refPhysicianOrderMedication.getPrnIndicationComments().trim();
	     if(!PRNcommnets.isEmpty()){
			tabbedPane.setSelectedIndex(1);
			txtPrnIndication.setText(refPhysicianOrderMedication.getPrnIndicationComments());
	     }
	     
	     else {tabbedPane.setSelectedIndex(0);
	     txtPrnIndication.setText(refPhysicianOrderMedication.getPrnIndicationComments());
	     
	}
			
	  
			 
		 
		panel_1.updateUI();
		
	}

	 
	private String getFrequencyKey(int value) {

		switch (value) {
		case 1:
			return "DAILY";
		case 2:
			return "2 x DAILY(BID)";
		case 3:
			return "3 x DAILY(TID)";
		case 4:
			return "4 x DAILY(QID)";
		case 5:
			return "BEFORE MEALS(AC)";
		case 6:
			return "AFTER MEALS(PC)";
		case 7:
			return "WITH MEALS(WM)";
		case 8:
			return "Q8 HOURS";
		case 9:
			return "Q6 HOURS";
		case 10:
			return "Q4 HOURS";
		case 11:
			return "BEDTIME(HS)";
		case 12:
			return "COUMADIN";
		case 13:
			return "INSULIN";
		default:
			return "";
		}
	}
	
  private void doSelection() {
		
		if (rbToDate.isSelected()) {
			dcDurationTo.setEnabled(true);
			panelToDate.setEnabled(false);
			txtDay.setEnabled(false);
			cmbDay.setEnabled(false);
		}
		if (rbToDays.isSelected()) {
			dcDurationTo.setEnabled(false);
			panelToDate.setEnabled(true);
			txtDay.setEnabled(true);
			cmbDay.setEnabled(true);
		}
	}
 
	public void setBlankField() {
		Global.currentPhysicianOrderMedicationRecordKey = 0;
		Global.currentPhysicianOrderRecordKey = 0;
		Global.currentPhysicianOrderMedicationKey = 0;
		// txtInstruction.setText("");
		/* cmbFrequency2.setSelectedItem(""); */
		cmbFrequency1.setSelectedItem("");
		txtPrnIndication.setText("");
		/* SwingUtils.setSelectedButton(bgDaily,0); */
		SwingUtils.setSelectedButton(bgYes, 0);
		dcDurationTo.setDate(null);
		dcDurationFrom.setDate(null);
		txtDose.setText("");
		/* txtDuration1.setText(""); */
		txtRoute.setSelectedItem("");
		txtInstructions.setText("");
		cmbDose.setSelectedItem("");
		txtMedication.setText("");
		/* txtDuration1.setText(""); */
		bgYes.clearSelection();
		dcDurationFrom.setEnabled(true);
		dcDurationTo.setEnabled(true);
		cbDurationNA.setSelected(false);
		rbToDate.setSelected(true);
		/* bgDaily.clearSelection(); */

	}
	
	public Date getToDate(int nums,String DWM ,Date fromDate){
		Calendar cal = Calendar.getInstance();
		 
		
		cal.setTime(fromDate);

		   
		
		 if(DWM=="Days"){
			 cal.add(Calendar.DATE, nums-1);
			 return cal.getTime();
			 
		 }
         if(DWM=="Week"){
        	 
             int days = (nums*7)-1;
        	 cal.add(Calendar.DATE, days);
        	 
                       }
 
        if(DWM=="Month"){
     
         cal.add(Calendar.MONTH, nums);
         return cal.getTime();
 	 
	 
         }
		
		
		return fromDate;
		
		
	}
	
 
	
 
	}
	

