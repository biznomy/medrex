package medrex.client.main.physicanOrders.physicianOrderScreen;

import java.awt.BorderLayout; 
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL;

import medrex.client.PanelImage;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.resident.diagnosis.PanelResidentDiagnosis;
import medrex.client.schedule.ScheduleConstants;
import medrex.client.schedule.ScheduleConstants.ScheduleMode;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admission.ResidentAssessmentFormPage1;
import medrex.commons.vo.others.Doctors;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderAdvanceDirectives;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderConsultations;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderDiagnosticTests;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderDiets;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderMedication;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderMiscellaneous;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderRecord;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderRespiratoryTherapy;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderSafetyPrecautions;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderTherapyTest;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderTreatment;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderTreatmentTemp;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.RehabilitationRestrorative;
import medrex.commons.vo.resident.ResidentAllergies;
import medrex.commons.vo.resident.ResidentMain;
import medrex.server.dao.physicianOrders.physicianOrderNewScreen.PhysicianOrderMedicationDao;
import medrex.server.dao.physicianOrders.physicianOrderNewScreen.PhysicianOrderRecordDAO;
import medrex.server.dao.resident.ResidentAllergiesDAO;
import medrex.server.service.physicianOrders.physicianOrderNewScreen.PhysicianOrderRecordService;
import medrex.server.service.physicianOrders.physicianOrderNewScreen.PhysicianOrderTherapyTestDAO;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.styles.RoundedBalloonStyle;
import net.java.balloontip.utils.TimingUtils;

import com.sX.awt.Direction;
import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;
import com.sX.swing.JxToggleButton;

public class PanelPhysicianOrderDetails extends JxPanel {
	/** 
	 */
	private static final long serialVersionUID = 1923037107748995685L;
	private JPanel panelCenter;
	private JPanel panelRight;
	private JPanel panelLeft;
	private JPanel panelTop;
	/*private JxButton btnInactive;
	private JxButton btnActive;*/
	private Date creationDate;
	private PanelImage panel_6;
	private JPanel panelPrescriptionPrintable;
	private String[] btnAction;
	private BalloonTip BTip;
	private String tabName;
	private JLabel[] dayLabel = new JLabel[7];
	ResidentMain rm = null;
	private JxToggleButton[] btnMenu;
	private static final Color BACKGROUND = new Color(231, 234, 234);
	private static final Color FOREGROUND = new Color(0, 69, 97);
	private static final Border BORDER = new LineBorder(
			new Color(122, 154, 167), 2, false);

	private Color[] tabColors = new Color[] { new Color(244, 193, 7),
			new Color(165, 219, 4), new Color(224, 150, 159),
			new Color(206, 65, 43), new Color(195, 229, 6),
			new Color(134, 134, 104), new Color(115, 115, 196),
			new Color(128, 111, 130), new Color(188, 7, 13),
			new Color(238, 136, 44), new Color(222, 62, 12),
			new Color(62, 156, 127), new Color(206, 64, 42),
			new Color(33, 135, 161), new Color(237, 145, 160),
			new Color(113, 149, 37), new Color(179, 211, 212),
			new Color(33, 135, 161), new Color(94, 192, 63),
			new Color(135, 134, 76),

	};
	private ButtonGroup bgGroup;
	private JPanel panel_5;
	private int currentIndex;
	private final Font FONT = new Font("Tahoma", Font.PLAIN, 12);// .deriveFont(11.0f);
	private JViewport view;
	private JPanel[] tabPanels;
	private int curIndex;
	private JxTable table;
	private Toolkit toolkit;
	private Dimension screenSize;
	private PhysicianOrderDietJTable dietTable;
	private JPanel topBlueStrip;
	private PanelImage panelImage;
	private JCheckBox cbActive;
	private JCheckBox cbInActive;
	
	private PanelShowMedicationDetails psmd;
	private JPanel panelmedication;
	
	List<ResidentAllergies> allergies;
	//private JPanel panelAllergies;
	
	public static enum DiagonisMode {
		RESIDENT_DIAGONIS, PHYSICIAN_ORDERS_DIAGONIS
	}
	public static DiagonisMode mode = DiagonisMode.RESIDENT_DIAGONIS;
	
	public PanelPhysicianOrderDetails() {
		super();
		// setSize(1024, 768);
		// setPreferredSize(getSize());
		final GridBagLayout gridBagLayout = new GridBagLayout();
		setLayout(gridBagLayout);
		
		PanelPhysicianOrderDetails.mode = DiagonisMode.PHYSICIAN_ORDERS_DIAGONIS;

		Global.panelPhysicianOrderDetails = this;
		btnAction = new String[] { "MEDICATIONS",
				"TREATMENTS", "INTRAVENOUS THERAPY", "LABORATORY TEST",
				"DIAGNOSTIC TESTS", "RESPIRATORY THERAPY", "CONSULTATIONS",
				"DIET/ENTERAL PROTOCOL", "SAFETY MEASURES", "REHABILITATION",
				"RESTORATIVE", "ADMISSION/READMISSION ORDERS", "MISC",
				/*"SKIN TREATMENTS", "OTHER",*/"ADVANCED DIRECTIVES" };

		toolkit = Toolkit.getDefaultToolkit();
		screenSize = toolkit.getScreenSize();
		// screenSize = new Dimension(1024, 768);
		setSize(new Dimension(screenSize.width, screenSize.height - 70));
		// setPreferredSize(getSize());
		setLinearGradient(new Color(156, 184, 193), new Color(231, 239, 242),
				Direction.LEFT_TO_RIGHT);
		setCurvedView(false);
		setArc(0f);

		/**************************** LAYOUT STARTS *****************************/

		panelTop = new JPanel();
		// panelTop.setBorder(new LineBorder(Color.BLUE, 1, false));
		panelTop.setLayout(null);
		panelTop.setOpaque(false);
		panelTop.setPreferredSize(new Dimension(screenSize.width, 100));
		final GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		gridBagConstraints.gridheight = 1;
		gridBagConstraints.gridwidth = 3;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridx = 0;
		add(panelTop, gridBagConstraints);

		panelLeft = new JPanel();
		// panelLeft.setBorder(new LineBorder(Color.RED, 1, false));
		panelLeft.setOpaque(false);
		panelLeft.setLayout(new BorderLayout());
		panelLeft.setSize(220, screenSize.height - 195);
		panelLeft.setPreferredSize(panelLeft.getSize());

		final GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
		gridBagConstraints2.insets = new Insets(10, 10, 10, 10);
		gridBagConstraints2.anchor = GridBagConstraints.NORTHWEST;
		gridBagConstraints2.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints2.gridheight = 1;
		gridBagConstraints2.gridwidth = 1;
		gridBagConstraints2.gridy = 1;
		gridBagConstraints2.gridx = 0;
		add(panelLeft, gridBagConstraints2);

		panelRight = new JPanel();
		// panelRight.setBorder(new LineBorder(Color.MAGENTA, 1, false));
		panelRight.setOpaque(false);
		panelRight.setLayout(new BorderLayout());
		panelRight.setSize(180, screenSize.height - 195);
		panelRight.setPreferredSize(panelRight.getSize());

		final GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
		gridBagConstraints3.insets = new Insets(10, 10, 10, 10);
		gridBagConstraints3.anchor = GridBagConstraints.NORTHEAST;
		gridBagConstraints3.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints3.gridheight = 1;
		gridBagConstraints3.gridwidth = 1;
		gridBagConstraints3.gridy = 1;
		gridBagConstraints3.gridx = 2;
		add(panelRight, gridBagConstraints3);

		panelCenter = new JPanel();
		// panelCenter.setBorder(new LineBorder(Color.GREEN, 1, false));
		panelCenter.setOpaque(false);
		panelCenter.setLayout(new BorderLayout());
		panelCenter.setSize(screenSize.width - 480, screenSize.height - 195);
		panelCenter.setPreferredSize(panelCenter.getSize());

		final GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
		gridBagConstraints4.insets = new Insets(10, 10, 10, 10);
		gridBagConstraints4.anchor = GridBagConstraints.CENTER;
		gridBagConstraints4.fill = GridBagConstraints.BOTH;
		gridBagConstraints4.gridheight = 1;
		gridBagConstraints4.gridwidth = 1;
		gridBagConstraints4.gridy = 1;
		gridBagConstraints4.gridx = 1;
		add(panelCenter, gridBagConstraints4);

		/**************************** LAYOUT ENDS *****************************/

		/* Top Panel Contents */

		int resId = Global.currentResidenceKey;
		try {
			rm = MedrexClientManager.getInstance().getResident(resId);
		} catch (RemoteException e1) {
			e1.printStackTrace();
		} catch (MedrexException e1) {
			e1.printStackTrace();
		}
		

		panelImage = new PanelImage();
		// panelImage.setBorder(new LineBorder(Color.RED, 1, false));
		panelImage.setPreferredSize(panelImage.getSize());
		panelImage.setSize(95, 95);
		panelImage
				.setLocation(screenSize.width - panelImage.getWidth() - 30, 5);
		panelImage.setCurvedView(true);
		panelImage.setArc(0.6f);
		// panelImage.setResidentKey(Global.currentResidenceKey);
		panelTop.add(panelImage);

		topBlueStrip = new JPanel();
		topBlueStrip.setLayout(null);
		topBlueStrip.setOpaque(true);
		topBlueStrip.setBackground(new Color(28, 93, 113));
		topBlueStrip.setBounds(0, 20, screenSize.width, 30);
		panelTop.add(topBlueStrip);
		
		try {
			allergies = MedrexClientManager.getInstance()
					.getResidentAllergiesforResident(
					/* 130 */Global.currentResidenceKey);
		} catch (Exception e) {
		}
	
		final JLabel genderLabel = new JLabel("Male");
		genderLabel.setText("" + rm.getSex());
		genderLabel.setForeground(Color.WHITE);
		genderLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont()
				.deriveFont(Font.BOLD).deriveFont(18f));
		genderLabel.setSize(genderLabel.getPreferredSize().width, topBlueStrip
				.getHeight());
		genderLabel.setLocation(screenSize.width - panelImage.getWidth() - 30
				- genderLabel.getPreferredSize().width - 10, -5);
		// lastLoginLabel.setAlignmentX(50);
		// lastLoginLabel.setAlignmentX(0.5f);
		topBlueStrip.add(genderLabel);

		final JLabel lastLoginLabel = new JLabel("John Grates,".toUpperCase());
		lastLoginLabel
				.setText((rm.getUserPass() + " " + rm.getUserName() + ",")
						.toUpperCase());
		lastLoginLabel.setForeground(Color.WHITE);
		lastLoginLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont()
				.deriveFont(Font.BOLD).deriveFont(18f));
		lastLoginLabel.setSize(lastLoginLabel.getPreferredSize().width,
				topBlueStrip.getHeight());
		lastLoginLabel.setLocation(screenSize.width - panelImage.getWidth()
				- genderLabel.getWidth() - 5 - 30
				- lastLoginLabel.getPreferredSize().width - 10, -5);
		// lastLoginLabel.setAlignmentX(50);
		// lastLoginLabel.setAlignmentX(0.5f);
		topBlueStrip.add(lastLoginLabel);
		
		final JLabel allergiesLabel = new JLabel("Allergies");
		if(allergies.isEmpty()){
			allergiesLabel.setText("NKDA");
		}
		else {
			for(ResidentAllergies all :allergies){
				allergiesLabel.setText("" + all.getName());
			}
		}
		
		allergiesLabel.setForeground(Color.RED);
		allergiesLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont()
				.deriveFont(Font.BOLD).deriveFont(14f));
		allergiesLabel.setSize(allergiesLabel.getPreferredSize().width, topBlueStrip
				.getHeight());
		allergiesLabel.setLocation(screenSize.width - panelImage.getWidth() - 100
				- allergiesLabel.getPreferredSize().width - 10, 8);
		// lastLoginLabel.setAlignmentX(50);
		// lastLoginLabel.setAlignmentX(0.5f);
		topBlueStrip.add(allergiesLabel);
		
		JPanel p = new JPanel();
		p.setSize(new Dimension(100, 150));
		p.setLocation(800, 50);
		p.setOpaque(false);
		panelTop.add(p);

		/* Panel Left Contents */

		final JPanel panel_LeftContents = new JPanel();
		// panel_LeftContents.setOpaque(false);
		panel_LeftContents.setLayout(new BorderLayout());
		panel_LeftContents.setBackground(Color.WHITE);
		panel_LeftContents.setBorder(new LineBorder(
				ColorConstants.GradientDark, 1, false));
		panelLeft.add(panel_LeftContents, BorderLayout.CENTER);

		final JPanel panel_01 = new JPanel();
		panel_01.setOpaque(false);
		panel_01.setLayout(new BorderLayout());
		panel_LeftContents.add(panel_01, BorderLayout.CENTER);

		final JPanel panel_PhyOrders = new JPanel();
		panel_PhyOrders.setBackground(new Color(240, 91, 65));
		panel_PhyOrders.setPreferredSize(new Dimension(0, 25));
		panel_01.add(panel_PhyOrders, BorderLayout.NORTH);

		final JLabel label_PhyOrders = new JLabel("PHYSICIAN'S ORDERS");
		label_PhyOrders.setFont(FONT);
		label_PhyOrders.setForeground(Color.WHITE);
		panel_PhyOrders.add(label_PhyOrders, BorderLayout.CENTER);

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_01.add(panel_2, BorderLayout.CENTER);
		// panel_2.setPreferredSize(new
		// Dimension(screenWidth-50,screenHeight-670));
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_2.setLayout(flowLayout);
		panel_2.setOpaque(false);
		// panel_2.setBounds(10, 144, 1041, 122);

		bgGroup = new ButtonGroup();
		btnMenu = new JxToggleButton[btnAction.length];

		for (int i = 0; i < btnAction.length; i++) {
			final int index = i;
			btnMenu[i] = new JxToggleButton(btnAction[i]);
			btnMenu[i].setFont(FONT);
			btnMenu[i].setBorderPainted(false);
			btnMenu[i].setArc(0.6f);
			btnMenu[i].setBorder(BORDER);
			btnMenu[i].setBackground(BACKGROUND);
			btnMenu[i].setForeground(FOREGROUND);
			btnMenu[i].setRolloverEnabled(true);
			btnMenu[i].setHorizontalAlignment(SwingConstants.LEFT);
			btnMenu[i].setPreferredSize(new Dimension(210, 25));
			bgGroup.add(btnMenu[i]);
			panel_2.add(btnMenu[i]);

			btnMenu[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseExited(MouseEvent e) {
					panel_2.repaint();
				}
			});
			btnMenu[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tabName = e.getActionCommand();
					displayTab(index);
					try {
						if (index == 0) {
							displayMedication();
						} else {
							displayOtherPhysicainorders();
							updatePhysicianOrderJTable();
						}
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}

			});

		}
		btnMenu[0].setSelected(true);
		/* Panel Right Contents */
		panel_5 = new JPanel();
		panel_5.setOpaque(false);
		panel_5.setLayout(new BorderLayout());
		panel_5.setBackground(Color.WHITE);
		panel_5
				.setBorder(new LineBorder(ColorConstants.GradientDark, 1, false));
		// panel_5.setPreferredSize(new Dimension(new
		// Dimension(screenWidth/5,screenHeight-100)));
		// panel_5.setBounds(0, 270, 271, 427);

		final JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setLayout(new BorderLayout());
		panel_5.add(panel_1, BorderLayout.CENTER);

		final JPanel panel_Medications = new JPanel();
		panel_Medications.setBackground(new Color(240, 91, 65));
		panel_Medications.setPreferredSize(new Dimension(0, 25));
		panel_1.add(panel_Medications, BorderLayout.NORTH);

		// active button
		cbActive = new JCheckBox("Active");
		cbActive.setOpaque(false);
		cbActive.isDisplayable();
		cbActive.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				updatePhysicianOrderJTable();
			}
		});
		//p.add(cbActive);

		// Inactive button
		cbInActive = new JCheckBox("InActive");
		cbInActive.setOpaque(false);
		cbInActive.isDisplayable();
		cbInActive.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {

			}
		});
		//p.add(cbInActive);

		final JLabel label_Medications = new JLabel("ORDERS");
		label_Medications.setFont(FONT);
		label_Medications.setForeground(Color.WHITE);
		panel_Medications.add(label_Medications, BorderLayout.CENTER);

		final JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane, BorderLayout.CENTER);
		// scrollPane.setBounds(20, 52, 680, 186);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane
				.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 1, false));

		table = new JxTable();
		table.setRowHeight(20);

		dietTable = new PhysicianOrderDietJTable();
		table.setModel(dietTable);
		scrollPane.setViewportView(table);
		table.setFont(new Font("Dialog", Font.BOLD, 12));
		// table.setFillsViewportHeight(true);
		// table.setShowVerticalLines(true);
		// table.setGridColor(ColorConstants.BORDER_COL);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {

				} else if (evt.getClickCount() == 1) {

					int id = new Integer((String) dietTable.getValueAt(table
							.getSelectedRow(), 6)).intValue();
					int formId = new Integer((String) dietTable.getValueAt(
							table.getSelectedRow(), 5)).intValue();

					if (Global.currentPhysicianOrderFormType
							.equalsIgnoreCase(PhysicianOrderFormTypes.DIET)) {
						Global.currentPhysicianOrderDietKey = formId;
						Global.currentPhysicianOrderRecordKey = id;
						if (formId != -1 && formId != 0) {
							PhysicianOrderDiets diet = null;
							try {
								diet = MedrexClientManager.getInstance()
										.getPhysicianOrderDiet(formId);
							} catch (Exception e) {

								e.printStackTrace();
							}
							//if (diet != null) {
									/*String type = "";
								if (type.equalsIgnoreCase("GTUBE")
										&& Global.currentPhysicianOrderEnteralProtocolKey != 0) {
									Global.currentPhysicianOrderEnteralProtocolKey = diet
									.getIdgtube().getSerial();
									Global.panelPhysicianOrdersDiets
											.setValueObject(diet);
								} if (type.equalsIgnoreCase("TPN")
										&& Global.currentParentalNutritionalOrderFormKey != 0) {

									Global.currentParentalNutritionalOrderFormKey = diet
									.getIdtpn().getSerial();
											
									Global.panelPhysicianOrdersDiets
											.setValueObject(diet);
								}*/
								Global.panelPhysicianOrdersDiets
								.setValueObject(diet);
							//}
						}
						
						
					}
						
					/*
					 * if(Global.currentPhysicianOrderFormType.equalsIgnoreCase(PhysicianOrderFormTypes
					 * .DIET)){ Global.currentParentalNutritionalOrderFormKey =
					 * formId; Global.currentPhysicianOrderRecordKey = id; if
					 * (formId != -1 && formId != 0) { PhysicianOrderDiets diet
					 * = null; try { diet =
					 * MedrexClientManager.getInstance().getPhysicianOrderDiet
					 * (formId); } catch (Exception e) {
					 * 
					 * e.printStackTrace(); } if(diet != null){
					 * Global.currentParentalNutritionalOrderFormKey =
					 * diet.getFormId();
					 * Global.panelPhysicianOrdersDiets.setValueObject(diet); }
					 * } }
					 */
					if (Global.currentPhysicianOrderFormType
							.equalsIgnoreCase(PhysicianOrderFormTypes.CONSULTATIONS)) {
						Global.currentPhysicianOrderConsultationskey = formId;
						Global.currentPhysicianOrderRecordKey = id;
						if (formId != -1 && formId != 0) {
							PhysicianOrderConsultations Consultations = null;
							try {
								
								Consultations = MedrexClientManager
										.getInstance()
										.getPhysicianOrderConsultations(formId);
								
							} catch (Exception e) {

								e.printStackTrace();
							}
							if (Consultations != null) {
								Global.panelPhysicianOrderConsultations
										.setValueObjectForConsultants(Consultations,id);
							}
						}
					}
					
					
					if (Global.currentPhysicianOrderFormType
							.equalsIgnoreCase(PhysicianOrderFormTypes.INTRAVENIOUS_THERAPY)) {
						Global.currentPhysicianOrderTherapyTestkey= formId;
						Global.currentPhysicianOrderRecordKey = id;
						if (formId != -1 && formId != 0) {
							PhysicianOrderTherapyTest therapyTest = null;
							try {
								therapyTest = MedrexClientManager
										.getInstance()
										.getPhysicianOrderTherapyTest(formId);
								
							} catch (Exception e) {
								e.printStackTrace();
							}
							if (therapyTest != null) {
								
								System.out.println("Global.panelPhysicianOrderTherapyTest:" +
										""+Global.panelPhysicianOrderTherapyTest);
								
								Global.panelPhysicianOrderTherapyTest
										.setValueObjectTh(therapyTest);
							}
						}
					}
					
					if (Global.currentPhysicianOrderFormType
							.equalsIgnoreCase(PhysicianOrderFormTypes.DIAGNOSTICTEST)) {
						Global.currentPhysicianOrderDiagnosticTestskey = formId;
						Global.currentPhysicianOrderRecordKey = id;
						if (formId != -1 && formId != 0) {
							PhysicianOrderDiagnosticTests Diagnostictest = null;
							try {
								Diagnostictest = MedrexClientManager
										.getInstance()
										.getPhysicianOrderDiagnosticTests(
												formId);
							} catch (Exception e) {

								e.printStackTrace();
							}
							if (Diagnostictest != null) {
								Global.panelPhysicianOrderDiagnosticTests
										.setValueObject(Diagnostictest);
							}
						}
					}
					if (Global.currentPhysicianOrderFormType == PhysicianOrderFormTypes.RESPIRATORY_THEARAPY) {
						Global.currentPhysicianOrderRespiratoryTherapyKey = formId;
						Global.currentPhysicianOrderRecordKey = id;
						if (formId != -1 && formId != 0) {
							PhysicianOrderRespiratoryTherapy respiratoryTherapy = null;
							try {
								respiratoryTherapy = MedrexClientManager
										.getInstance()
										.getPhysicianOrderRespiratoryTherapy(
												formId);
							} catch (Exception e) {

								e.printStackTrace();
							}
							if (respiratoryTherapy != null) {

								Global.panelPhysicianOrdersRespiratoryTherapy
										.setValueObject(respiratoryTherapy);
							}
						}
					}
					if (Global.currentPhysicianOrderFormType == PhysicianOrderFormTypes.ADVANCED_DIRECTIVES) {
						Global.currentPhysicianOrderAdvanceDirectivesKey = formId;
						Global.currentPhysicianOrderRecordKey = id;
						if (formId != -1 && formId != 0) {
							PhysicianOrderAdvanceDirectives advanceDirectives = null;
							try {
								advanceDirectives = MedrexClientManager
										.getInstance()
										.getPhysicianOrderAdvanceDirectives(
												formId);
							} catch (Exception e) {

								e.printStackTrace();
							}
							if (advanceDirectives != null) {

								Global.panelPhysicianOrdersAdvanceDirectives
										.setValueObject(advanceDirectives);
							}
						}
					}
					if (Global.currentPhysicianOrderFormType
							.equalsIgnoreCase("Treatment")) {
						Global.currentPhysicianOrderTreatmentKey = formId;

						Global.currentPhysicianOrderRecordKey = id;
						if (formId != -1 && formId != 0) {
							PhysicianOrderTreatment treatment = null;
							try {
								treatment = MedrexClientManager.getInstance()
										.getPhysicianOrderTreatment(formId);

							} catch (Exception e) {

								e.printStackTrace();
							}
							if (treatment != null) {
								Global.panelPhysicianOrderTreatment
										.setValueObject(treatment);
							}
						}
					}

					if (Global.currentPhysicianOrderFormType
							.equalsIgnoreCase(PhysicianOrderFormTypes.MEDICATION)) {
						Global.currentPhysicianOrderMedicationKey = formId;
						Global.currentPhysicianOrderRecordKey = id;

						// suresh
						JLabel label = new JLabel();
						label.setText("suresh");
						String msg = "Hello for testing";
						BTip = new BalloonTip(label, msg,
								new RoundedBalloonStyle(10, 10, Color.BLACK,
										Color.green),
								BalloonTip.Orientation.RIGHT_ABOVE,
								BalloonTip.AttachLocation.EAST, 100, 200, false);
						BTip.setPreferredSize(new Dimension(20, 20));
						BTip.setLocation(600, 600);
						TimingUtils.showTimedBalloon(BTip, 100);
						BTip.setVisible(true);

						if (formId != -1 && formId != 0) {
							PhysicianOrderMedication medication = null;
							try {
								medication = MedrexClientManager.getInstance()
										.getPhysicianOrderMedication(formId);
							} catch (Exception e) {

								e.printStackTrace();
							}
							if (medication != null) {

								Global.panelPhysicianOrdersMedication
										.setValueObject(medication);
							}
						}
					}

					if (Global.currentPhysicianOrderFormType
							.equalsIgnoreCase(PhysicianOrderFormTypes.TREATMENTSTEMP)) {
						Global.currentPhysicianOrderTreatmentTempKey = formId;
						Global.currentPhysicianOrderRecordKey = id;
						if (formId != -1 && formId != 0) {
							PhysicianOrderTreatmentTemp treatmentTemp = null;
							try {
								treatmentTemp = MedrexClientManager
										.getInstance()
										.getPhysicianOrderTreatmentTemp(formId);
							} catch (Exception e) {

								e.printStackTrace();
							}
							if (treatmentTemp != null) {
								Global.panelPhysicianOrderTreatmentTemp
										.setValueObject(treatmentTemp);
							}
						}
					}

					if (Global.currentPhysicianOrderFormType
							.equalsIgnoreCase(PhysicianOrderFormTypes.MISCELLANEOUS)) {
						Global.currentPhysicianOrderMiscellaneouskey = formId;
						Global.currentPhysicianOrderRecordKey = id;
						if (formId != -1 && formId != 0) {
							PhysicianOrderMiscellaneous Miscellaneous = null;
							try {
								Miscellaneous = MedrexClientManager
										.getInstance()
										.getPhysicianOrderMiscellaneous(formId);
							} catch (Exception e) {

								e.printStackTrace();
							}
							if (Miscellaneous != null) {
								Global.panelPhysicianOrderMiscellaneous
										.setValueObject(Miscellaneous);
							}
						}
					}

					if (Global.currentPhysicianOrderFormType
							.equalsIgnoreCase(PhysicianOrderFormTypes.RESTRORATIVE)) {
						Global.currentRehabilitationRestrorativekey = formId;
						Global.currentPhysicianOrderRecordKey = id;
						if (formId != -1 && formId != 0) {
							RehabilitationRestrorative rehabilitation = null;
							try {
								rehabilitation = MedrexClientManager
										.getInstance()
										.getRehabilitationRestrorative(formId);
							} catch (Exception e) {
								e.printStackTrace();
							}
							if (rehabilitation != null) {
								Global.panelRehabilitationRestrorative
										.setValueObject(rehabilitation);
							}
						}
					}
					
					
					if (Global.currentPhysicianOrderFormType
							.equalsIgnoreCase(PhysicianOrderFormTypes.SAFETY_PRECAUTIONS)) {
						Global.currentPhysicianOrderSafetyPrecautionsKey = formId;
						Global.currentPhysicianOrderRecordKey = id;
						if (formId != -1 && formId != 0) {
							PhysicianOrderSafetyPrecautions safetyPrecautions = null;
							try {
								safetyPrecautions = MedrexClientManager
										.getInstance()
										.getPhysicianOrderSafetyPrecautions(
												formId);
							} catch (Exception e) {

								e.printStackTrace();
							}
							if (safetyPrecautions != null) {

								Global.panelPhysicianOrdersSafetyPrecautions
										.setValueObject(safetyPrecautions);
							}
						}
					}

				}
			}
		});
		
		panelRight.add(panel_5, BorderLayout.CENTER);

		/* panelCenter Contents */

		final JPanel panel_9 = new JPanel();
		// panel_9=this;
		panel_9.setOpaque(false);
		panel_9.setBackground(Color.WHITE);
		// panel_9.setBorder(new EmptyBorder(30, 100, 70, 100));
		panel_9.setLayout(new BorderLayout());
		panelCenter.add(panel_9, BorderLayout.CENTER);

		view = new JViewport();
		panel_9.add(view);
		view.setPreferredSize(new Dimension(screenSize.width - 500,
				screenSize.height - 100));
		view.setIgnoreRepaint(false);
		view.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
				view.repaint();
			}
		});
		view.setOpaque(false);

		/* Updations */

		tabPanels = new JPanel[btnAction.length];
		curIndex = 0;
		btnMenu[0].setSelected(true);
		displayTab(0);
		displayMedication();
	
		//displayOtherPhysicainorders();
		
		
		
		
		/*if (Global.currentPhysicianOrderFormType
				.equalsIgnoreCase(PhysicianOrderFormTypes.MEDICATION)) {
			JPanel panelListMedication = new JPanel();
			panelListMedication.setSize(new Dimension(100,100));
			panelRight.add(panelListMedication,BorderLayout.CENTER);
		}	*/
	}

	@Override
	public void paint(Graphics g) {

		super.paint(g);

	}

	private void displayTab(int index) {
		Global.currentPhysicianOrderRecordKey = 0;
		System.out.println("index is:" + index);
		if (tabPanels[index] == null || index == 0 || index == 1 || index == 2
				|| index == 3 || index == 4 || index == 5 || index == 6
				|| index == 7 || index == 8 || index == 9  || index == 10
				|| index == 14) {
			tabPanels[index] = getTab(index);
		}
		tabPanels[index].setSize(view.getSize());
		view.setView(tabPanels[index]);
		tabPanels[index].setOpaque(false);
		curIndex = index;
		updatePhysicianOrderJTable();
	}

	private JPanel getTab(int index) {
		switch (index) {
		

		case 0:
			Global.currentPhysicianOrderFormType = PhysicianOrderFormTypes.MEDICATION;
			return new PanelResidentDiagnosis();
		case 1:
			Global.currentPhysicianOrderFormType = PhysicianOrderFormTypes.TREATMENT;
			return new PanelPhysicianOrderTreatment();
		case 2:
			Global.currentPhysicianOrderFormType = PhysicianOrderFormTypes.INTRAVENIOUS_THERAPY;
			// return new PanelPhysicianOrderTherapy();
			return new PanelPhysicianOrderTherapyTest();
		case 3:
			Global.currentPhysicianOrderFormType = PhysicianOrderFormTypes.LABORATORY_TEST;
			return new PanelPhysicianOrderLaboratoryTest();
		case 4:
			Global.currentPhysicianOrderFormType = PhysicianOrderFormTypes.DIAGNOSTICTEST;
			return new PanelPhysicianOrderDiagnosticTests();
		case 5:
			Global.currentPhysicianOrderFormType = PhysicianOrderFormTypes.RESPIRATORY_THEARAPY;
			return new PanelPhysicianOrderRespiratoryTherapy();
		case 6:
			Global.currentPhysicianOrderFormType = PhysicianOrderFormTypes.CONSULTATIONS;
			return new PanelPhysicianOrderConsultations();

		case 7:
			Global.currentPhysicianOrderFormType = PhysicianOrderFormTypes.DIET;
			return new PanelPhysicianOrdersDiets();

		case 8:
			Global.currentPhysicianOrderFormType = PhysicianOrderFormTypes.SAFETY_PRECAUTIONS;
			return new PanelPhysicianOrderSafetyPrecautions();

		case 9:
			Global.currentPhysicianOrderFormType = PhysicianOrderFormTypes.RESTRORATIVE;
			return new PanelRehabilitationRestrorative();

		case 12:
			Global.currentPhysicianOrderFormType = PhysicianOrderFormTypes.MISCELLANEOUS;
			return new PanelPhysicianOrderMiscellaneous();
			
		case 13:
			Global.currentPhysicianOrderFormType = PhysicianOrderFormTypes.ADVANCED_DIRECTIVES;
			return new PanelPhysicianOrderAdvanceDirectives();

		default:
			JPanel blankPanel = new JPanel();
			blankPanel.setOpaque(false);
			return blankPanel;
		}
	}
	
private void displayOtherPhysicainorders() {
		
		if(panelmedication!=null){
			panelRight.remove(panelmedication);
		}
		panelRight.setSize(180, screenSize.height - 195);
		panelRight.setPreferredSize(panelRight.getSize());
		panelRight.add(panel_5, BorderLayout.CENTER);
		panelRight.revalidate();
		panelRight.repaint();
	}  
	
private void displayMedication(){
		
		panelmedication = new JPanel();
		panelmedication.setOpaque(false);
		panelmedication.setLayout(new BorderLayout());
		panelmedication.setBackground(Color.WHITE);
		panelmedication
				.setBorder(new LineBorder(ColorConstants.GradientDark, 1, false));
		
		final JPanel panel_1_Medication = new JPanel();
		panel_1_Medication.setOpaque(false);
		panel_1_Medication.setLayout(new BorderLayout());
		panelmedication.add(panel_1_Medication, BorderLayout.CENTER);

		final JPanel panel_Medications_New = new JPanel();
		panel_Medications_New.setBackground(new Color(240, 91, 65));
		panel_Medications_New.setPreferredSize(new Dimension(0, 25));
		panel_1_Medication.add(panel_Medications_New, BorderLayout.NORTH);

		final JLabel label_Medications = new JLabel("ORDERS");
		label_Medications.setFont(FONT);
		label_Medications.setForeground(Color.WHITE);
		panel_Medications_New.add(label_Medications, BorderLayout.CENTER);
		
	 
	
	Users por=null;
		
		try {
			por=  MedrexClientManager.getInstance().getUser(Global.currentLoggedInUserKey);
		} catch (Exception e) {
		e.printStackTrace();
		}
		
	    List<PhysicianOrderMedication> pom=null;
	    try {
	    	pom=MedrexClientManager.getInstance().getPhysicianOrderMedicationList(Global.currentResidenceKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		
		final JScrollPane scrollPaneMediaction = new JScrollPane();
		panel_1_Medication.add(scrollPaneMediaction, BorderLayout.CENTER);
		//scrollPaneMediaction.setBounds(20, 52, 680, 186);.
		scrollPaneMediaction.setBounds(0, 0, 680, 186);
		scrollPaneMediaction.setBackground(Color.WHITE);
		//scrollPaneMediaction.getViewport().setBackground(Color.WHITE);
		scrollPaneMediaction.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 1, false));
				
		psmd=new PanelShowMedicationDetails(pom,por);
		scrollPaneMediaction.setViewportView(psmd);
		
	    panelRight.remove(panel_5);
		panelRight.setSize(200, screenSize.height - 195);
		panelRight.setPreferredSize(panelRight.getSize());
		panelRight.add(panelmedication, BorderLayout.CENTER);
		
		panelRight.repaint();
		panelRight.updateUI();
		panelRight.revalidate();
	}
	

	public void setView(JComponent com) {
		com.setOpaque(false);
		this.view.setView(com);
		com.firePropertyChange("DISPLAY_TAB", false, true);
	}

	public void updatePhysicianOrderJTable() {
		List<PhysicianOrderRecord> physRecords = null;

		boolean b = cbActive.isSelected();
		System.out.println("selected values are" + b);

		if (Global.currentPhysicianOrderFormType != null
				&& !(Global.currentPhysicianOrderFormType.equalsIgnoreCase(""))) {
			try {
				if (b) {
					GregorianCalendar cal = new GregorianCalendar();
					Date time = cal.getTime();
					DateFormat dateformar = new SimpleDateFormat(
							"yyyy-MM-dd hh:mm:ss");
					dateformar.format(time);
					physRecords = PhysicianOrderRecordDAO.getInstance()
							.getPhysicianOrderRecordsByCurrentTime();
					System.out.println("Testing");
				} else {
					physRecords = MedrexClientManager.getInstance()
							.getPhysicianOrderRecords(
									Global.currentPhysicianOrderFormType,
									Global.currentResidenceKey);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		dietTable.setNewList(physRecords);
		dietTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
		
		
	}

	public static void main(String ar[]) {
		SwingUtils.wrapInDialog(new PanelPhysicianOrderDetails()).setVisible(
				true);
	}
}
/*
 * class PhysicianOrderDietJTable extends AbstractTableModel { private String[]
 * columnNames = {"Created On","Title" };
 * 
 * public List<PhysicianOrderRecord> physicianOrderRecords;
 * 
 * int n = 0;
 * 
 * PhysicianOrderDietJTable(List<PhysicianOrderRecord> physRecords) {
 * physicianOrderRecords = physRecords;
 * 
 * }
 * 
 * PhysicianOrderDietJTable() { //Global.physicianOrderDietJTable=this;
 * physicianOrderRecords = new ArrayList<PhysicianOrderRecord>();
 * 
 * }
 * 
 * public int getColumnCount() { return columnNames.length; }
 * 
 * public int getRowCount() {
 * 
 * return (physicianOrderRecords.size()); }
 * 
 * public void setRowCount(int count) { n = n + count; }
 * 
 * public void setNewList(List<PhysicianOrderRecord> physRecords) {
 * physicianOrderRecords = physRecords; }
 * 
 * public String getColumnName(int col) { return columnNames[col]; }
 * 
 * public Object getValueAt(int row, int col) { try { Object o =
 * physicianOrderRecords.get(row); SimpleDateFormat df=new SimpleDateFormat();
 * df.applyPattern("MM / dd / yyyy  hh:mm a"); if (o instanceof
 * PhysicianOrderRecord) { PhysicianOrderRecord rc = (PhysicianOrderRecord) o;
 * if (col == 0) { return (df.format(rc.getDateCreated()) + ""); } if (col == 1)
 * { return (rc.getTitle()); } if (col == 2) { return
 * (df.format(rc.getLastModified()) + ""); } if (col == 3) { return
 * (rc.getStatus() + ""); } if (col == 4) { Users users = new Users(); users =
 * MedrexClientManager.getInstance() .getUser(Global.currentLoggedInUserKey);
 * return (users.getUserType()); } if (col == 5) { return (rc.getFormId() + "");
 * } if (col == 6) { return (rc.getSerial() + ""); } if(col == 7) { return
 * (rc.getTitle() + ""); } return ("");
 * 
 * } else { ScanForm rc = (ScanForm) o; if (col == 0) { return
 * df.format(rc.getDateCreated()) + ""; } if (col == 1) { return
 * rc.getScanFormType(); } if (col == 2) { return (""); } if(col == 3){ return
 * ("Completed"); } if (col == 4) { return ""; } if (col == 5) { return
 * (rc.getSerial() + ""); } if (col == 6) { return rc.getFileName(); } if(col ==
 * 7){ return rc.getFileName(); }
 * 
 * return ("");
 * 
 * } } catch (Exception e) { return (""); } }
 * 
 * }
 */
