package medrex.client.main.physicanOrders.physicianOrderScreen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import medrex.client.PanelImage;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;
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
import medrex.commons.vo.scan.ScanForm;

import com.sX.awt.Direction;
import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;
import com.sX.swing.JxToggleButton;

public class PanelPhysicianOrderDetailsOld extends JxPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1218558638212191571L;
	private JxButton btnInactive;
	private JxButton btnActive;
	private Date creationDate;
	private PanelImage panel_6;
	private JPanel panelPrescriptionPrintable;
	private String[] btnAction;
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
	private JxPanel panel_5;
	private int currentIndex;
	private final Font FONT = new Font("Arial", Font.BOLD, 13)
			.deriveFont(13.5f);
	private int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
	private int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
	private JViewport view;
	private JPanel panelCenter;
	private JPanel[] tabPanels;
	private int curIndex;
	private JxTable table;
	private PhysicianOrderDietJTable dietTable;

	public PanelPhysicianOrderDetailsOld() {
		super();
		setArc(0f);

		// Global.panelPhysicianOrderDetails = this;
		btnAction = new String[] { "ADVANCED DIRECTIVES", "MEDICATIONS",
				"TREATMENTS", "INTRAVENOUS THERAPY", "LABORATORY TEST",
				"DIAGNOSTIC TESTS", "RESPIRATORY THERAPY", "CONSULTATIONS",
				"DIET/ENTERAL PROTOCOL", "SAFETY MEASURES", "REHABILITATION",
				"RESTORATIVE", "ADMISSION/READMISSION ORDERS", "MISC",
				"SKIN TREATMENTS", "OTHER" };

		final FlowLayout flowLayout_1 = new FlowLayout();
		flowLayout_1.setVgap(0);
		flowLayout_1.setHgap(0);
		setLayout(flowLayout_1);
		setSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));
		setPreferredSize(new Dimension(Toolkit.getDefaultToolkit()
				.getScreenSize()));
		this.setLinearGradient(new Color(156, 184, 193), new Color(231, 239,
				242), Direction.LEFT_TO_RIGHT);
		setCurvedView(false);

		final JLabel physicianOrderLabel = new JLabel();
		physicianOrderLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		physicianOrderLabel.setText("Physician Order");
		physicianOrderLabel.setForeground(Color.WHITE);

		// panel_1.add(physicianOrderLabel);

		final JPanel panel = new JPanel();
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setVgap(0);
		flowLayout_2.setHgap(0);
		flowLayout_2.setAlignment(FlowLayout.RIGHT);
		panel.setLayout(new BorderLayout());
		panel.setOpaque(false);
		panel.setPreferredSize(new Dimension(screenWidth, 150));
		add(panel);

		panelCenter = new JPanel();
		panelCenter.setLayout(new BorderLayout());
		panelCenter.setOpaque(false);
		panelCenter.setPreferredSize(new Dimension(screenWidth,
				screenHeight - 200));
		add(panelCenter);

		panel_5 = new JxPanel() {

			/**
			 * 
			 */
			private static final long serialVersionUID = -7513552838401187227L;
			/*
			 * public void paint(Graphics g) { super.setOpaque(false);
			 * 
			 * Graphics2D g2 = (Graphics2D) g; Color color =
			 * tabColors[currentIndex]; GradientPaint paint = new
			 * GradientPaint(new Point(0, 0),ColorConstants.GradientBright, new
			 * Point(0, getHeight()), ColorConstants.GradientDark);
			 * g2.setPaint(paint); Shape shape = getShape(); g2.fill(shape);
			 * 
			 * super.paint(g); }
			 * 
			 * private Shape getShape() { int w = getWidth(); int h =
			 * getHeight(); GeneralPath shape = new GeneralPath();
			 * 
			 * shape.moveTo(w/2, 0);
			 * 
			 * QuadCurve2D.Double curve = new QuadCurve2D.Double(); curve.x1 =
			 * w; curve.y1 = 0; curve.x2 = w; curve.y2 = h; curve.ctrlx = w
			 * 0.40; curve.ctrly = h/2;
			 * 
			 * shape.append(curve, true);
			 * 
			 * shape.lineTo(0, h); shape.lineTo(0, 0); shape.closePath();
			 * 
			 * return shape; }
			 */
		};
		// panel_5=this;
		panel_5.setOpaque(false);
		panel_5.setLayout(new BorderLayout());
		panel_5.setPreferredSize(new Dimension(new Dimension(screenWidth / 5,
				screenHeight - 100)));
		panel_5.setArc(1f);
		panel_5.setBounds(0, 270, 271, 427);
		panel_5.setLinearGradient(ColorConstants.GradientDark,
				ColorConstants.GradientBright, Direction.BOTTOM_TO_TOP);

		final JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setLayout(new BorderLayout());
		panel_1.setBorder(new EmptyBorder(30, 20, 70, 20));
		panel_5.add(panel_1, BorderLayout.CENTER);

		final JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane);
		scrollPane.setBounds(20, 52, 680, 186);
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
							if (diet != null) {
								String type = "";
								if (type.equalsIgnoreCase("GTUBE")
										&& Global.currentPhysicianOrderEnteralProtocolKey != 0) {
									Global.currentPhysicianOrderEnteralProtocolKey = diet
											.getFormId();
									Global.panelPhysicianOrdersDiets
											.setValueObject(diet);
								} else if (type.equalsIgnoreCase("TPN")
										&& Global.currentParentalNutritionalOrderFormKey != 0) {

									Global.currentParentalNutritionalOrderFormKey = diet
											.getFormId();
									Global.panelPhysicianOrdersDiets
											.setValueObject(diet);
								}
							}
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
					
					if (Global.currentPhysicianOrderFormType == PhysicianOrderFormTypes.INTRAVENIOUS_THERAPY) {
						Global.currentPhysicianOrderTherapyTestkey = formId;
						Global.currentPhysicianOrderRecordKey = id;
						if (formId != -1 && formId != 0) {
							PhysicianOrderTherapyTest therapyTest = null;
							try {
								therapyTest = MedrexClientManager.getInstance().getPhysicianOrderTherapyTest(formId);
							} catch (Exception e) {

								e.printStackTrace();
							}
							if (therapyTest != null) {

								Global.panelPhysicianOrderTherapyTest.setValueObjectTh(therapyTest);
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
		panelCenter.add(panel_5, BorderLayout.WEST);

		/*
		 * final JPanel panel_8 = new JPanel(); final FlowLayout flowLayout_7 =
		 * new FlowLayout(); flowLayout_7.setAlignment(FlowLayout.LEFT);
		 * panel_8.setLayout(flowLayout_7); panel_8.setOpaque(false);
		 * panel_8.setPreferredSize(new Dimension(50, 50));
		 * panel_5.add(panel_8);
		 */

		/*
		 * JPanel panel1 = new JPanel(); final FlowLayout flowLayout_4 = new
		 * FlowLayout(); flowLayout_4.setAlignment(FlowLayout.LEFT);
		 * flowLayout_4.setHgap(0); panel1.setLayout(flowLayout_4);
		 * panel1.setOpaque(false); panel1.setPreferredSize(new Dimension(new
		 * Dimension(screenWidth/5,screenHeight/20))); panel_5.add(panel1);
		 */
		/*
		 * btnActive = new JxButton(); btnActive.setFont(new Font("Dialog",
		 * Font.BOLD, 12)); btnActive.setBackground(Color.WHITE);
		 * btnActive.setPreferredSize(new Dimension(150, 35));
		 * btnActive.setArc(0.4f);
		 * btnActive.setForeground(ColorConstants.DEF_COLOR);
		 * btnActive.setText("ACTIVE MEDICATIONS"); panel1.add(btnActive);
		 * 
		 * final JPanel panel_1 = new JPanel(); panel_1.setOpaque(false);
		 * panel_1.setPreferredSize(new Dimension(0, 180));
		 * panel_5.add(panel_1);
		 * 
		 * final JPanel panel_7 = new JPanel(); final FlowLayout flowLayout_5 =
		 * new FlowLayout(); flowLayout_5.setHgap(0);
		 * panel_7.setLayout(flowLayout_5); panel_7.setOpaque(false);
		 * panel_5.add(panel_7);
		 * 
		 * btnInactive = new JxButton(); btnInactive.setFont(new Font("Dialog",
		 * Font.BOLD, 12)); btnInactive.setBackground(Color.WHITE);
		 * btnInactive.setPreferredSize(new Dimension(150, 35));
		 * btnInactive.setText("INACTIVE MEDICATIONS");
		 * btnInactive.setArc(0.4f);
		 * btnInactive.setForeground(ColorConstants.DEF_COLOR);
		 * panel_7.add(btnInactive);
		 */
		/*
		 * panel_9 = new JPanel(); final FlowLayout flowLayout_3 = new
		 * FlowLayout(); flowLayout_3.setVgap(40);
		 * panel_9.setLayout(flowLayout_3); panel_9.setOpaque(false);
		 * panel_9.setPreferredSize(new
		 * Dimension(screenWidth-50,screenHeight-200)); panelCenter.add(panel_9,
		 * BorderLayout.CENTER);
		 */

		final JPanel panel_9 = new JPanel();
		// panel_9=this;
		panel_9.setOpaque(false);
		panel_9.setBorder(new EmptyBorder(30, 100, 70, 100));
		panel_9.setLayout(new BorderLayout());
		panelCenter.add(panel_9);

		view = new JViewport();
		panel_9.add(view);
		view.setPreferredSize(new Dimension(screenWidth - 500,
				screenHeight - 100));
		view.setIgnoreRepaint(false);
		view.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
				view.repaint();
			}
		});
		view.setOpaque(false);

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel.add(panel_2, BorderLayout.WEST);
		panel_2.setPreferredSize(new Dimension(screenWidth - 50,
				screenHeight - 670));
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_2.setLayout(flowLayout);
		panel_2.setOpaque(false);
		panel_2.setBounds(10, 144, 1041, 122);

		bgGroup = new ButtonGroup();
		btnMenu = new JxToggleButton[btnAction.length];

		for (int i = 0; i < btnAction.length; i++) {
			final int index = i;
			btnMenu[i] = new JxToggleButton(btnAction[i]);
			btnMenu[i].setPreferredSize(new Dimension(btnMenu[i]
					.getPreferredSize().width + 20, 35));
			btnMenu[i].setFont(FONT);
			btnMenu[i].setBorderPainted(false);
			btnMenu[i].setArc(0.6f);
			btnMenu[i].setBorder(BORDER);
			btnMenu[i].setBackground(BACKGROUND);
			btnMenu[i].setForeground(FOREGROUND);
			btnMenu[i].setRolloverEnabled(true);
			btnMenu[i].setHorizontalAlignment(SwingConstants.CENTER);
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
					displayTab(index);
				}
			});

		}
		btnMenu[0].setSelected(true);

		final JPanel panel_3 = new JPanel();
		panel_3.setPreferredSize(new Dimension(300, 100));
		panel_3.setOpaque(false);
		panel_3.setLayout(null);
		panel.add(panel_3, BorderLayout.EAST);

		panel_6 = new PanelImage();
		panel_6.setBounds(192, 0, 108, 100);
		panel_3.add(panel_6);
		panel_6.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		panel_6.setCurvedView(true);
		panel_6.setArc(1f);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setArc(0f);
		panel_4.setLayout(new BorderLayout());
		panel.add(panel_4, BorderLayout.NORTH);
		panel_4
				.setPreferredSize(new Dimension(screenWidth, screenHeight - 740));
		panel_4.setSize(1200, 30);
		panel_4.setLinearGradient(ColorConstants.GradientDark,
				ColorConstants.GradientDark, Direction.RIGHT_TO_LEFT);
		panel_4.setCurvedView(false);

		final JLabel addNewPhysicianLabel = new JLabel();
		addNewPhysicianLabel.setForeground(Color.WHITE);
		addNewPhysicianLabel.setHorizontalAlignment(SwingConstants.CENTER);
		addNewPhysicianLabel.setText("Physician Orders");
		addNewPhysicianLabel.setFont(new Font("", Font.BOLD, 21));
		addNewPhysicianLabel.setForeground(Color.WHITE);
		panel_4.add(addNewPhysicianLabel);   

		tabPanels = new JPanel[btnAction.length];
		curIndex = 0;
		btnMenu[0].setSelected(true);
		displayTab(0);
		updatePhysicianOrderJTable();
	}

	@Override
	public void paint(Graphics g) {

		super.paint(g);

	}

	private void displayTab(int index) {
		Global.currentPhysicianOrderRecordKey = 0;
		System.out.println("index is:" + index);
		if (tabPanels[index] == null || index == 0 || index == 1 || index == 2
				|| index == 4 || index == 5 || index == 6 || index == 8
				|| index == 7 || index == 9 || index == 10 || index == 11
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
			Global.currentPhysicianOrderFormType = PhysicianOrderFormTypes.ADVANCED_DIRECTIVES;
			return new PanelPhysicianOrderAdvanceDirectives();

		case 1:
			Global.currentPhysicianOrderFormType = PhysicianOrderFormTypes.MEDICATION;
			return new PanelDiagnosisTemp();
		case 2:
			Global.currentPhysicianOrderFormType = PhysicianOrderFormTypes.TREATMENT;
			return new PanelPhysicianOrderTreatment();
		case 3:
			Global.currentPhysicianOrderFormType = PhysicianOrderFormTypes.INTRAVENIOUS_THERAPY;
			return new PanelPhysicianOrderTherapy();
		case 4:
			Global.currentPhysicianOrderFormType = PhysicianOrderFormTypes.LABORATORY_TEST;
			return new PanelPhysicianOrderLaboratoryTest();
		case 5:
			Global.currentPhysicianOrderFormType = PhysicianOrderFormTypes.DIAGNOSTICTEST;
			return new PanelPhysicianOrderDiagnosticTests();
		case 6:
			Global.currentPhysicianOrderFormType = PhysicianOrderFormTypes.RESPIRATORY_THEARAPY;
			return new PanelPhysicianOrderRespiratoryTherapy();
		case 7:
			Global.currentPhysicianOrderFormType = PhysicianOrderFormTypes.CONSULTATIONS;
			return new PanelPhysicianOrderConsultations();

		case 8:
			Global.currentPhysicianOrderFormType = PhysicianOrderFormTypes.DIET;
			return new PanelPhysicianOrdersDiets();

		case 9:
			Global.currentPhysicianOrderFormType = PhysicianOrderFormTypes.SAFETY_PRECAUTIONS;
			return new PanelPhysicianOrderSafetyPrecautions();

		case 10:
			Global.currentPhysicianOrderFormType = PhysicianOrderFormTypes.RESTRORATIVE;
			return new PanelRehabilitationRestrorative();

		case 13:
			Global.currentPhysicianOrderFormType = PhysicianOrderFormTypes.MISCELLANEOUS;
			return new PanelPhysicianOrderMiscellaneous();

		default:
			JPanel blankPanel = new JPanel();
			blankPanel.setOpaque(false);
			return blankPanel;
		}
	}

	public void setView(JComponent com) {
		com.setOpaque(false);
		this.view.setView(com);
		com.firePropertyChange("DISPLAY_TAB", false, true);
	}

	public void updatePhysicianOrderJTable() {
		List<PhysicianOrderRecord> physRecords = null;

		if (Global.currentPhysicianOrderFormType != null
				&& !(Global.currentPhysicianOrderFormType.equalsIgnoreCase(""))) {
			try {

				physRecords = MedrexClientManager.getInstance()
						.getPhysicianOrderRecords(
								Global.currentPhysicianOrderFormType,
								Global.currentResidenceKey);

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

class PhysicianOrderDietJTable extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4018606847639461245L;

	private String[] columnNames = { "Created On", "Title"};

	public List<PhysicianOrderRecord> physicianOrderRecords;

	int n = 0;

	PhysicianOrderDietJTable(List<PhysicianOrderRecord> physRecords) {
		physicianOrderRecords = physRecords;

	}

	PhysicianOrderDietJTable() {
		// Global.physicianOrderDietJTable=this;
		physicianOrderRecords = new ArrayList<PhysicianOrderRecord>();

	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {

		return (physicianOrderRecords.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List<PhysicianOrderRecord> physRecords) {
		physicianOrderRecords = physRecords;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			Object o = physicianOrderRecords.get(row);
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MM / dd / yyyy  hh:mm a");
			if (o instanceof PhysicianOrderRecord) {
				PhysicianOrderRecord rc = (PhysicianOrderRecord) o;
				if (col == 0) {
					return (df.format(rc.getDateCreated()) + "");
				}
				if (col == 1) {
					return (rc.getTitle());
				}
				if (col == 2) {
					return (df.format(rc.getLastModified()) + "");
				}
				if (col == 3) {
					return (rc.getStatus() + "");
				}
				if (col == 4) {
					Users users = new Users();
					users = MedrexClientManager.getInstance().getUser(
							Global.currentLoggedInUserKey);
					return (users.getUserType());
				}
				if (col == 5) {
					return (rc.getFormId() + "");
				}
				if (col == 6) {
					return (rc.getSerial() + "");
				}
				if (col == 7) {
					return (rc.getTitle() + "");
				}
				return ("");

			} else {
				ScanForm rc = (ScanForm) o;
				if (col == 0) {
					return df.format(rc.getDateCreated()) + "";
				}
				if (col == 1) {
					return rc.getScanFormType();
				}
				if (col == 2) {
					return ("");
				}
				if (col == 3) {
					return ("Completed");
				}
				if (col == 4) {
					return "";
				}
				if (col == 5) {
					return (rc.getSerial() + "");
				}
				if (col == 6) {
					return rc.getFileName();
				}
				if (col == 7) {
					return rc.getFileName();
				}

				return ("");

			}
		} catch (Exception e) {
			return ("");
		}
	}

}


/*class PhysicianOrderDietMedicationJTable extends AbstractTableModel {
	*//**
	 * 
	 *//*
	private static final long serialVersionUID = -4018606847639461245L;

	private String[] columnNames = { "Medication", "Dose","Frequency"};

	public List<PhysicianOrderMedication> physicianOrderMedicationRecords;

	int n = 0;

	PhysicianOrderDietMedicationJTable(List<PhysicianOrderMedication> physRecords) {
		physicianOrderMedicationRecords = physRecords;

	}

	PhysicianOrderDietMedicationJTable() {
		// Global.physicianOrderDietJTable=this;
		physicianOrderMedicationRecords = new ArrayList<PhysicianOrderMedication>();

	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {

		return (physicianOrderMedicationRecords.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List<PhysicianOrderMedication> physRecords) {
		physicianOrderMedicationRecords = physRecords;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			Object o = physicianOrderMedicationRecords.get(row);
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MM / dd / yyyy  hh:mm a");
			if (o instanceof PhysicianOrderMedication) {
				PhysicianOrderMedication rc = (PhysicianOrderMedication) o;
				if (col == 0) {
					return (rc.getMedication() + "");
				}
				if (col == 1) {
					return (rc.getDose());
				}
				if (col == 2) {
					return (rc.getFrequency1() + "");
				}
				if (col == 3) {
					return (rc.getSerial() + "");
				}
				return ("");
			}
			
			else {
				ScanForm rc = (ScanForm) o;
				if (col == 0) {
					return df.format(rc.getDateCreated()) + "";
				}
				if (col == 1) {
					return rc.getScanFormType();
				}
				if (col == 2) {
					return ("");
				}
				if (col == 3) {
					return ("Completed");
				}
				if (col == 4) {
					return "";
				}
				if (col == 5) {
					return (rc.getSerial() + "");
				}
				if (col == 6) {
					return rc.getFileName();
				}
				if (col == 7) {
					return rc.getFileName();
				}

				return ("");

			}
			
			return ("");
		} catch (Exception e) {
			return ("");
		}
	}

}*/





