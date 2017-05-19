package medrex.client.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JViewport;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;

import medrex.client.FrameLogin;
import medrex.client.admin.deshboard.FrameAssessmentsFloorsInfo;
import medrex.client.admin.deshboard.FrameAssessmentsInfo;
import medrex.client.admin.userLogon.ControllerUserLogon;
import medrex.client.census.ui.dashboard.FrameBedHoldInfo;
import medrex.client.census.ui.dashboard.FrameERInfo;
import medrex.client.census.ui.dashboard.FrameFloorTypeInfo;
import medrex.client.census.ui.dashboard.FrameHospitalInfo;
import medrex.client.census.ui.dashboard.FrameInHouseInfo;
import medrex.client.census.ui.dashboard.FrameOutOnPass;
import medrex.client.census.ui.dashboard.FrameSignOutInfo;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.dashBoard.PanelCNA;
import medrex.client.dashBoard.PanelCareLogs;
import medrex.client.dashBoard.PanelReports;
import medrex.client.main.alert.dashboard.FramePendingAlertInfo;
import medrex.client.main.careplan.dashboard.FrameCarePlanInfo;
import medrex.client.main.labReports.FrameLabReportsFloorInfo;
import medrex.client.updater.FrameClientHotFix;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.dashboard.Dashboard;

import com.sX.event.TableEventListener;
import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxButton;
import com.sX.swing.JxDataSheet;

public class PanelDashboard extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7209993769710814004L;
	// private JLabel lblCNAAdmin;
	// private JLabel lblUsers;
	// private JLabel lblReports;
	private JPanel panelMain;
	// private JPanel labReportsComponent_2;
	// private JPanel labReportsComponent_1;
	private JLabel lblCarePlan;
	private JLabel lblCarePlanCount;
	private JPanel panelCarePlanAnalyzer;
	// private JLabel lblTotalTriggeredMessage;
	// private JLabel lblMessage_1;
	// private JPanel panelTrigger;
	// private JLabel lblMessage;
	// private JPanel panelmessage;
	// private JPanel messageLabel;
	// private JLabel lblTotalMessage;
	// private JPanel messageComponent;
	private JPanel topTabArea;
	private JPanel topTabsPanel;
	private JPanel topBlueStrip;
	// private JLabel lblCareLogs;
	// private JPanel defaultPanel;
	// private JLabel genLabel;
	// private JLabel cnaAdminLabel;
	// private JLabel hrsReportLabel;
	// private JLabel assessmentLabel;
	// private JLabel reahabLabel;
	// private JPanel assessmentsComponent;
	// private JPanel panel1stFloorPending;
	// private JPanel panel2stFloorPending;
	// private JLabel lblAssessmentsValCol2;
	// private JLabel lblAssessmentsValCol1;
	// private JLabel lbl1stFloorPendingValCol1;
	// private JLabel lbl1stFloorPendingValCol2;
	// private JLabel lbl2ndFloorPendingValCol1;
	// private JLabel lbl2ndFloorPendingValCol2;
	// private JPanel labReportsComponent;
	private JLabel lblLabReportsVal;
	private JPanel panel1stFloorLabReports;
	private JLabel lbl1stFloorLabReportsVal;
	private JPanel panel2stFloorLabReports;
	private JLabel lbl2stFloorLabReportsVal;
	// private JPanel mDSPendingComponent;
	private JLabel lblMDSPendingValCol2;

	private Timer dashboardTimer;
	private int alertTime = 0;
	private String alertType;
	private JPanel panelDefault;
	private JPanel panelView;

	private String[] dataGeneral;
	private String[] dataAssessmentFirstFloor;
	private String[] dataAssessmentSecFloor;
	private String[] dataMessage;
	private String[] dataFirstCensus;
	private String[] dataSecCensus;
	private String[] dataFirstAlert;
	private String[] dataSecAlert;
	private String[] dataPrevDayCensus;

	private String[] tabs = new String[] { "DASHBOARD.png", "REPORTS.png",
			"CARELOGS.png", "CNAADMIN.png" };

	public static int TAB_COUNT;

	private final static int TAB_WIDTH = 152;
	private final static int TAB_HEIGHT = 40;
	private final static int TAB_SPACE = 15;
	public static final String TABINDEX = "TabIndex";
	private int oldIndex;

	private JLabel[] tabLabels;
	private JViewport view;

	public PanelDashboard() {
		super();
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				reAdjustTabLocation();
			}
		});
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});
		// System.out.println("size: "+
		// Toolkit.getDefaultToolkit().getScreenSize());
		setLayout(null);
		setPreferredSize(new Dimension(868, 768));

		TAB_COUNT = tabs.length;

		topTabArea = new JPanel();
		topTabArea.setLayout(new BorderLayout(0, 0));
		topTabArea.setOpaque(false);
		topTabArea.setBounds(0, 0, 868, 138);
		add(topTabArea);

		dataGeneral = new String[5];
		dataAssessmentFirstFloor = new String[3];
		dataAssessmentSecFloor = new String[3];
		dataMessage = new String[3];
		dataFirstCensus = new String[8];
		dataSecCensus = new String[8];
		dataFirstAlert = new String[6];
		dataSecAlert = new String[6];
		dataPrevDayCensus = new String[6];

		topTabsPanel = new JPanel();
		topTabsPanel.setOpaque(false);
		topTabsPanel.setLayout(null);
		topTabsPanel.setPreferredSize(new Dimension(868, 40));
		topTabArea.add(topTabsPanel, BorderLayout.SOUTH);

		// lblReports = new JLabel(new ImageIcon("img/dashboard/REPORTS.png"));
		// lblReports.setText("");
		// lblReports.setBounds(251, 0, 154, 40);
		// topTabsPanel.add(lblReports);
		//
		// lblCareLogs = new JLabel(new
		// ImageIcon("img/dashboard/CARELOGS.png"));
		// lblCareLogs.setBounds(716, 0, 152, 40);
		// lblCareLogs.setText("");
		// topTabsPanel.add(lblCareLogs);
		//		
		// lblUsers = new JLabel(new ImageIcon("img/dashboard/USER.png"));
		// lblUsers.setText("");
		// lblUsers.setBounds(411, 0, 152, 40);
		// topTabsPanel.add(lblUsers);
		//		
		// lblCNAAdmin = new JLabel(new
		// ImageIcon("img/dashboard/CNAADMIN.png"));
		// lblCNAAdmin.setText("");
		// lblCNAAdmin.setBounds(569, 0, 152, 40);
		// topTabsPanel.add(lblCNAAdmin);

		topBlueStrip = new JPanel();
		topBlueStrip.setLayout(null);
		topBlueStrip.setBackground(new Color(28, 93, 113));
		topBlueStrip.setBounds(0, 138, 868, 38);
		add(topBlueStrip);

		final JLabel lastLoginLabel = new JLabel();
		lastLoginLabel.setBounds(0, 5, 395, 32);
		lastLoginLabel.setName("lastLoginLabel");
		lastLoginLabel.setForeground(Color.WHITE);
		lastLoginLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont()
				.deriveFont(16));
		lastLoginLabel.setBorder(new EmptyBorder(0, 100, 0, 0));
		lastLoginLabel
				.setText("<html><b>Welcome </b>"
						+ Global.currentUserLastName
						+ ", "
						+ Global.currentUserFirstName
						+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Version</b>&nbsp; "
						+ Global.clientversion);
		topBlueStrip.add(lastLoginLabel);

		final JxButton btnHotFix = new JxButton();
		btnHotFix.setBounds(546, 5, 80, 28);
		btnHotFix.setName("btnHotFix");
		topBlueStrip.add(btnHotFix);
		btnHotFix.setFont(new Font("", Font.BOLD, 16));
		btnHotFix.setArc(0.6f);
		btnHotFix.setBackground(new Color(206, 221, 224, 250));
		btnHotFix.setForeground(new Color(0, 69, 97));
		btnHotFix.setRolloverEnabled(true);
		btnHotFix.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				try {
					if (FrameClientHotFix.isHotFixAvailable()) {
						FrameClientHotFix fch = new FrameClientHotFix();
						fch.setVisible(true);
						fch.updateHotFixVersion();
						fch.downloadMedrexHotFix();
						fch.extractMedrexHotFix();

						JOptionPane.showMessageDialog(null,
								"Hot Fix Deployed, Please restart Application");
						fch.dispose();
						System.exit(0);

					} else {
						JOptionPane.showMessageDialog(null,
								"No Hot Fix Available Now");
					}
				} catch (MedrexException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} finally {

				}
			}
		});
		btnHotFix.setText("Hot Fix");

		final JLabel logLabel = new JLabel();
		logLabel.setBounds(769, 5, 99, 32);
		logLabel.setName("logLabel");
		logLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent arg0) {
				(new ControllerUserLogon()).logoutUpdate();
				FrameFactory.closeAll();
				// if (Global.frameMainDesktopTmp != null) {
				// Global.frameMainDesktopTmp.dispose();
				// }
				FrameLogin frame = (FrameLogin) FrameFactory
						.createWindowOfType(FrameLogin.class);
				Global.currentMainTab = 1;
				frame.setVisible(true);
			}
		});
		logLabel.setBorder(new EmptyBorder(0, 0, 0, 50));
		logLabel.setForeground(Color.WHITE);
		logLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont()
				.deriveFont(16));
		logLabel.setHorizontalAlignment(SwingConstants.CENTER);
		logLabel.setText("Log off ");
		topBlueStrip.add(logLabel);

		panelView = new JPanel();
		panelView.setBorder(new EmptyBorder(0, 40, 0, 0));
		panelView.setOpaque(false);
		panelView.setLayout(new BorderLayout());
		// panelView.setBorder(new LineBorder(Color.RED, 1, false));
		panelView.setBounds(0, 182, 868, 477);
		add(panelView);

		// scrollPane = new JScrollPane();
		// panelView.add(scrollPane);

		view = new JViewport();
		view.setIgnoreRepaint(false);
		view.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
				view.repaint();
			}
		});
		view.setOpaque(false);
		panelView.add(view, BorderLayout.CENTER);

		panelDefault = new JPanel();
		panelDefault.setLayout(new FlowLayout());
		// panelDefault.setLayout(null);
		panelDefault.setBackground(new Color(231, 239, 242));
		// panelView.add(panelDefault);
		// scrollPane.setViewportView(panelDefault);

		panelMain = new JPanel();
		panelMain.setLayout(new GridLayout(0, 3));
		// panelMain.setLayout(null);
		// panelMain.setBounds(0,0,853,467);
		panelMain.setPreferredSize(new Dimension(823, 431));
		panelMain.setOpaque(false);
		panelDefault.add(panelMain);

		// final JPanel pnlGeneral = new JPanel();
		// panelMain.add(pnlGeneral);
		// pnlGeneral.setPreferredSize(new Dimension(251, 178));
		// pnlGeneral.setOpaque(false);
		// pnlGeneral.setLayout(null);

		// labReportsComponent = new JPanel();
		// labReportsComponent.setBounds(0, 0, 251, 178);
		// labReportsComponent.setPreferredSize(new Dimension(251, 178));
		// labReportsComponent.setLayout(new BorderLayout(0, 0));
		// labReportsComponent.setOpaque(false);
		// pnlGeneral.add(labReportsComponent);

		// final JPanel labReportsLabel = new JPanel();
		// labReportsLabel.setPreferredSize(new Dimension(0, 0));
		// labReportsLabel.setLayout(null);
		// labReportsLabel.setOpaque(false);
		// labReportsComponent.add(labReportsLabel, BorderLayout.CENTER);

		final JPanel panelLabReports = new JPanel();
		panelLabReports.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent arg0) {
				if (lblLabReportsVal.getText() != null
						&& lblLabReportsVal.getText() != ""
						&& lblLabReportsVal.getText() != "0") {
					final FrameLabReportsFloorInfo frame = (FrameLabReportsFloorInfo) FrameFactory
							.createWindowOfType(FrameLabReportsFloorInfo.class);
					frame.updateJTable(0);
					frame.setModal(true);
					frame.setVisible(true);
				}
			}
		});
		panelLabReports.setLayout(null);
		panelLabReports.setBounds(0, 39, 251, 16);
		panelLabReports.setOpaque(false);
		// labReportsLabel.add(panelLabReports);

		final JLabel lblLabReports = new JLabel();
		lblLabReports.setBorder(new EmptyBorder(0, 5, 0, 5));
		lblLabReports.setText("New Lab Reports");
		lblLabReports.setBounds(10, 0, 195, 16);
		lblLabReports.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		panelLabReports.add(lblLabReports);

		lblLabReportsVal = new JLabel();
		lblLabReportsVal.setBorder(new EmptyBorder(0, 5, 0, 5));
		lblLabReportsVal.setHorizontalAlignment(SwingConstants.CENTER);
		lblLabReportsVal.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		lblLabReportsVal.setText("0");
		lblLabReportsVal.setBounds(200, 0, 51, 16);
		panelLabReports.add(lblLabReportsVal);

		panel1stFloorLabReports = new JPanel();
		panel1stFloorLabReports.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent arg0) {
				if (lbl1stFloorLabReportsVal.getText() != null
						&& lbl1stFloorLabReportsVal.getText() != ""
						&& lbl1stFloorLabReportsVal.getText() != "0") {
					final FrameLabReportsFloorInfo frame = (FrameLabReportsFloorInfo) FrameFactory
							.createWindowOfType(FrameLabReportsFloorInfo.class);
					frame.updateJTable(1);
					frame.setModal(true);
					frame.setVisible(true);
				}
			}
		});
		panel1stFloorLabReports.setLayout(null);
		panel1stFloorLabReports.setBounds(0, 54, 250, 16);
		panel1stFloorLabReports.setOpaque(false);
		panel1stFloorLabReports.setLayout(null);

		final JLabel lblLabReportsFirstFloor = new JLabel();
		lblLabReportsFirstFloor.setBorder(new EmptyBorder(0, 5, 0, 5));
		lblLabReportsFirstFloor.setText("        1st Floor");
		lblLabReportsFirstFloor.setBounds(0, 0, 205, 16);
		lblLabReportsFirstFloor.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		panel1stFloorLabReports.add(lblLabReportsFirstFloor);

		lbl1stFloorLabReportsVal = new JLabel();
		lbl1stFloorLabReportsVal.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1stFloorLabReportsVal.setBorder(new EmptyBorder(0, 5, 0, 5));
		lbl1stFloorLabReportsVal.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		lbl1stFloorLabReportsVal.setText("0");
		lbl1stFloorLabReportsVal.setBounds(200, 0, 51, 16);
		panel1stFloorLabReports.add(lbl1stFloorLabReportsVal);

		panel2stFloorLabReports = new JPanel();
		panel2stFloorLabReports.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent arg0) {
				if (lbl2stFloorLabReportsVal.getText() != null
						&& lbl2stFloorLabReportsVal.getText() != ""
						&& lbl2stFloorLabReportsVal.getText() != "0") {
					final FrameLabReportsFloorInfo frame = (FrameLabReportsFloorInfo) FrameFactory
							.createWindowOfType(FrameLabReportsFloorInfo.class);
					frame.updateJTable(2);
					frame.setModal(true);
					frame.setVisible(true);
				}
			}
		});
		panel2stFloorLabReports.setLayout(null);
		panel2stFloorLabReports.setBounds(0, 70, 250, 16);
		panel2stFloorLabReports.setOpaque(false);
		panel2stFloorLabReports.setLayout(null);
		// labReportsLabel.add(panel2stFloorLabReports);

		final JLabel lblLabReportsSecondFloor = new JLabel();
		lblLabReportsSecondFloor.setBorder(new EmptyBorder(0, 5, 0, 5));
		lblLabReportsSecondFloor.setText("        2nd Floor");
		lblLabReportsSecondFloor.setBounds(0, 0, 205, 16);
		lblLabReportsSecondFloor.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		panel2stFloorLabReports.add(lblLabReportsSecondFloor);

		lbl2stFloorLabReportsVal = new JLabel();
		lbl2stFloorLabReportsVal.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2stFloorLabReportsVal.setBorder(new EmptyBorder(0, 5, 0, 5));
		lbl2stFloorLabReportsVal.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		lbl2stFloorLabReportsVal.setText("0");
		lbl2stFloorLabReportsVal.setBounds(200, 0, 51, 16);
		panel2stFloorLabReports.add(lbl2stFloorLabReportsVal);

		panelCarePlanAnalyzer = new JPanel();
		panelCarePlanAnalyzer.setOpaque(false);
		panelCarePlanAnalyzer.setBounds(0, 85, 251, 16);
		panelCarePlanAnalyzer.setLayout(null);

		lblCarePlan = new JLabel();
		lblCarePlan.setBorder(new EmptyBorder(0, 5, 0, 5));
		lblCarePlan.setText("Care Plan");
		lblCarePlan.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		lblCarePlan.setBounds(10, 0, 195, 16);
		panelCarePlanAnalyzer.add(lblCarePlan);

		lblCarePlanCount = new JLabel();
		lblCarePlanCount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (lblCarePlanCount.getText() != null
						&& lblCarePlanCount.getText() != ""
						&& lblCarePlanCount.getText() != "0") {
					final FrameCarePlanInfo frame = (FrameCarePlanInfo) FrameFactory
							.createWindowOfType(FrameCarePlanInfo.class);
					frame.updateJTable(2);
					frame.setModal(true);
					frame.setVisible(true);
				}
			}
		});
		lblCarePlanCount.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarePlanCount.setBorder(new EmptyBorder(0, 5, 0, 5));
		lblCarePlanCount.setText("0");
		lblCarePlanCount.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		lblCarePlanCount.setBounds(200, 0, 51, 16);
		panelCarePlanAnalyzer.add(lblCarePlanCount);

		final JPanel panelmDSPending = new JPanel();
		panelmDSPending.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent arg0) {
				if (lblMDSPendingValCol2.getText() != null
						&& lblMDSPendingValCol2.getText() != ""
						&& lblMDSPendingValCol2.getText() != "0") {
					// final FrameMDSPendingInfo frame = new
					// FrameMDSPendingInfo();
					// frame.updateJTable(0);
					// frame.setModal(true);
					// frame.setVisible(true);
				}
			}
		});
		panelmDSPending.setLayout(null);
		panelmDSPending.setBounds(0, 115, 251, 16);
		panelmDSPending.setOpaque(false);

		final JLabel lblMDSPending = new JLabel();
		lblMDSPending.setBorder(new EmptyBorder(0, 5, 0, 5));
		lblMDSPending.setText("Total MDS Pending");
		lblMDSPending.setBounds(10, 0, 173, 16);
		lblMDSPending.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		panelmDSPending.add(lblMDSPending);

		lblMDSPendingValCol2 = new JLabel();
		lblMDSPendingValCol2.setBorder(new EmptyBorder(0, 5, 0, 5));
		lblMDSPendingValCol2.setHorizontalAlignment(SwingConstants.CENTER);
		lblMDSPendingValCol2.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		lblMDSPendingValCol2.setText("0");
		lblMDSPendingValCol2.setBounds(200, 0, 51, 16);
		panelmDSPending.add(lblMDSPendingValCol2);

		// genLabel = new JLabel(new ImageIcon("img/dashboard/comGeneral.png"));
		// genLabel.setBounds(0, 0, 251, 178);

		FlowLayout fl = new FlowLayout(FlowLayout.LEFT, 10, 10);
		final JPanel panel1 = new JPanel();
		panel1.setLayout(fl);
		panel1.setOpaque(false);
		panelMain.add(panel1);

		final JxDataSheet dataSheetGeneral = new JxDataSheet();
		dataSheetGeneral.setBorderd(true);
		dataSheetGeneral.setIcon("img/dashboard/comIcon.png");
		dataSheetGeneral.setHeading("General");
		dataSheetGeneral.setBounds(0, 3, 251, 178);
		panel1.add(dataSheetGeneral);
		dataSheetGeneral.setFont(new Font("Dialog", Font.PLAIN, 11));
		dataSheetGeneral.setPreferredSize(dataSheetGeneral.getSize());
		dataSheetGeneral.setMaximumSize(dataSheetGeneral.getSize());
		dataSheetGeneral.setModel(new TempDataModelGeneral(dataGeneral));
		dataSheetGeneral.setVisible(true);
		dataSheetGeneral.addTableEventListener(new TableEventListener() {
			public void mouseClick(int row, int column, MouseEvent event) {
				if (event.getClickCount() > 1) {
					if (row == 2 /* && column==1 */) {
						if (dataGeneral[2] != null && dataGeneral[2] != ""
								&& !dataGeneral[2].equalsIgnoreCase("0")) {
							final FrameLabReportsFloorInfo frame = (FrameLabReportsFloorInfo) FrameFactory
									.createWindowOfType(FrameLabReportsFloorInfo.class);
							frame.updateJTable(2);
							frame.setModal(true);
							frame.setVisible(true);

						}
					}
					if (row == 3 /* && column==1 */) {
						if (dataGeneral[3] != null && dataGeneral[3] != ""
								&& !dataGeneral[3].equalsIgnoreCase("0")) {
							final FrameCarePlanInfo frame = (FrameCarePlanInfo) FrameFactory
									.createWindowOfType(FrameCarePlanInfo.class);
							frame.updateJTable(2);
							frame.setModal(true);
							frame.setVisible(true);
						}
					}
				}
			}
		});

		final JxDataSheet dataSheetAssessment = new JxDataSheet();
		dataSheetAssessment.setBorderd(true);
		dataSheetAssessment.setHeading("Assessment");
		dataSheetAssessment.setIcon("img/dashboard/assesmentIcon.png");
		dataSheetAssessment.setBounds(0, 3, 251, 178);
		panel1.add(dataSheetAssessment);
		dataSheetAssessment.setFont(new Font("Dialog", Font.PLAIN, 11));
		dataSheetAssessment.setPreferredSize(new Dimension(
				(int) dataSheetAssessment.getSize().getWidth(),
				(int) (dataSheetAssessment.getSize().getHeight() + 19)));
		dataSheetAssessment.setMaximumSize(new Dimension(
				(int) dataSheetAssessment.getSize().getWidth(),
				(int) (dataSheetAssessment.getSize().getHeight() + 19)));
		dataSheetAssessment.setModel(new TempDataModelAssessment(
				dataAssessmentFirstFloor, dataAssessmentSecFloor));
		dataSheetAssessment.setVisible(true);
		dataSheetAssessment.addTableEventListener(new TableEventListener() {
			public void mouseClick(int row, int column, MouseEvent event) {
				if (row == 0 && column == 1) {
					if (dataAssessmentFirstFloor[0] != null
							&& dataAssessmentFirstFloor[0] != ""
							&& !dataAssessmentFirstFloor[0]
									.equalsIgnoreCase("0")) {
						final FrameAssessmentsInfo frame = new FrameAssessmentsInfo();
						frame.updateJTable(1);
						frame.setModal(true);
						frame.setVisible(true);
					}
				}
				if (row == 0 && column == 2) {
					if (dataAssessmentSecFloor[0] != null
							&& dataAssessmentSecFloor[0] != ""
							&& !dataAssessmentSecFloor[0].equalsIgnoreCase("0")) {
						final FrameAssessmentsInfo frame = new FrameAssessmentsInfo();
						frame.updateJTable(0);
						frame.setModal(true);
						frame.setVisible(true);
					}
				}
				if (row == 1 && column == 1) {
					if (dataAssessmentFirstFloor[1] != null
							&& dataAssessmentFirstFloor[1] != ""
							&& !dataAssessmentFirstFloor[1]
									.equalsIgnoreCase("0")) {
						final FrameAssessmentsFloorsInfo frame = new FrameAssessmentsFloorsInfo();
						frame.updateJTable(3);
						frame.setModal(true);
						frame.setVisible(true);
					}
				}
				if (row == 1 && column == 2) {
					if (dataAssessmentSecFloor[1] != null
							&& dataAssessmentSecFloor[1] != ""
							&& !dataAssessmentSecFloor[1].equalsIgnoreCase("0")) {
						final FrameAssessmentsFloorsInfo frame = new FrameAssessmentsFloorsInfo();
						frame.updateJTable(0);
						frame.setModal(true);
						frame.setVisible(true);
					}
				}
				if (row == 2 && column == 1) {
					if (dataAssessmentFirstFloor[2] != null
							&& dataAssessmentFirstFloor[2] != ""
							&& !dataAssessmentFirstFloor[2]
									.equalsIgnoreCase("0")) {
						final FrameAssessmentsFloorsInfo frame = new FrameAssessmentsFloorsInfo();
						frame.updateJTable(2);
						frame.setModal(true);
						frame.setVisible(true);
					}
				}
				if (row == 2 && column == 2) {
					if (dataAssessmentSecFloor[2] != null
							&& dataAssessmentSecFloor[2] != ""
							&& !dataAssessmentSecFloor[2].equalsIgnoreCase("0")) {
						final FrameAssessmentsFloorsInfo frame = new FrameAssessmentsFloorsInfo();
						frame.updateJTable(2);
						frame.setModal(true);
						frame.setVisible(true);
					}
				}
			}
		});

		final JPanel panel2 = new JPanel();
		panel2.setLayout(fl);
		panel2.setOpaque(false);
		panelMain.add(panel2);

		final JxDataSheet dataSheetMessage = new JxDataSheet();
		dataSheetMessage.setBorderd(true);
		dataSheetMessage.setHeading("Message");
		dataSheetMessage.setIcon("img/dashboard/messageIcon.png");
		// System.out.println(dataSheetMessage.getHeading());
		dataSheetMessage.setBounds(0, 3, 251, 178);
		panel2.add(dataSheetMessage);
		dataSheetMessage.setFont(new Font("Dialog", Font.PLAIN, 11));
		dataSheetMessage.setPreferredSize(dataSheetMessage.getSize());
		dataSheetMessage.setMaximumSize(dataSheetMessage.getSize());
		dataSheetMessage.setModel(new TempDataModelMessage(dataMessage));
		dataSheetMessage.setVisible(true);
		dataSheetMessage.addTableEventListener(new TableEventListener() {
			public void mouseClick(int row, int column, MouseEvent event) {
				if (event.getClickCount() > 1) {
					// System.out.println("click on ["+row+", "+column+"]");
					if (row == 0) {
						if (!dataMessage[0].equalsIgnoreCase("0")
								&& dataMessage[0] != null
								&& dataMessage[0] != ("")) {
							Global.panelMainDashboard.selectAndOpenButton(12);
						}
					}
				}
			}
		});
		final JxDataSheet dataSheetCensus = new JxDataSheet();
		dataSheetCensus.setBorderd(true);
		dataSheetCensus.setHeading("Census");
		dataSheetCensus.setIcon("img/dashboard/censusIcon.png");
		dataSheetCensus.setBounds(0, 3, 251, 178);
		panel2.add(dataSheetCensus);
		dataSheetCensus.setFont(new Font("Dialog", Font.PLAIN, 11));
		dataSheetCensus.setPreferredSize(new Dimension((int) dataSheetCensus
				.getSize().getWidth(), (int) (dataSheetCensus.getSize()
				.getHeight() + 19)));
		dataSheetCensus.setMaximumSize(new Dimension((int) dataSheetCensus
				.getSize().getWidth(), (int) (dataSheetCensus.getSize()
				.getHeight() + 19)));
		dataSheetCensus.setModel(new TempDataModelCensus(dataFirstCensus,
				dataSecCensus));
		dataSheetCensus.setVisible(true);
		dataSheetCensus.addTableEventListener(new TableEventListener() {
			public void mouseClick(int row, int column, MouseEvent event) {
				if (event.getClickCount() > 1) {
					if (row == 0 && column == 2) {
						Global.currentResidenceArgument = 0;
						final FrameInHouseInfo frame = new FrameInHouseInfo();
						frame.setModal(true);
						frame.setVisible(true);
						if (Global.currentResidenceArgument != 0) {
							Global.frameMainOptions.openMainDesktopTmp();
						}
					}
					if (row == 1 && column == 2) {
						if (dataSecCensus[1] != null && dataSecCensus[1] != ""
								&& !dataSecCensus[1].equalsIgnoreCase("0")) {
							final FrameFloorTypeInfo frame = new FrameFloorTypeInfo(
									"1st Floor");
							frame.setModal(true);
							frame.setVisible(true);
							if (Global.currentResidenceArgument != 0) {
								Global.frameMainOptions.openMainDesktopTmp();
							}
						}
					}
					if (row == 2 && column == 2) {
						if (dataSecCensus[2] != null && dataSecCensus[2] != ""
								&& !dataSecCensus[2].equalsIgnoreCase("0")) {
							final FrameFloorTypeInfo frame = new FrameFloorTypeInfo(
									"2nd Floor");
							frame.setModal(true);
							frame.setVisible(true);
							if (Global.currentResidenceArgument != 0) {
								Global.frameMainOptions.openMainDesktopTmp();
							}
						}
					}
					if (row == 3 && column == 2) {
						if (dataSecCensus[3] != null && dataSecCensus[3] != ""
								&& !dataSecCensus[3].equalsIgnoreCase("0")) {
							Global.currentResidenceArgument = 0;
							final FrameHospitalInfo frame = new FrameHospitalInfo();
							frame.setModal(true);
							frame.setVisible(true);
							if (Global.currentResidenceArgument != 0) {
								Global.frameMainOptions.openMainDesktopTmp();
							}
						}
					}
					// if(row==4){
					// if (dataSecCensus[4] != null && dataSecCensus[4] != ""
					// && dataSecCensus[4] != "0") {
					// Global.currentResidenceArgument = 0;
					// final FrameBedHoldInfo frame = new FrameBedHoldInfo();
					// frame.setModal(true);
					// frame.setVisible(true);
					// if (Global.currentResidenceArgument != 0) {
					// Global.frameMainOptions.openMainDesktopTmp();
					// }
					// }
					// }
					if (row == 4 && column == 2) {
						if (dataSecCensus[4] != null && dataSecCensus[4] != ""
								&& !dataSecCensus[4].equalsIgnoreCase("0")) {
							Global.currentResidenceArgument = 0;
							final FrameBedHoldInfo frame = new FrameBedHoldInfo();
							frame.setModal(true);
							frame.setVisible(true);
							if (Global.currentResidenceArgument != 0) {
								Global.frameMainOptions.openMainDesktopTmp();
							}
						}
					}
					// if(row==5){
					// if(dataSecCensus[5]!=null && dataSecCensus[5]!="" &&
					// dataSecCensus[5]!="0"){
					// final FrameSignOutInfo frame = new FrameSignOutInfo();
					// frame.updateJTable(0);
					// frame.setVisible(true);
					// }
					// }
					// System.out.println("SignOutCountFirst:"+dataFirstCensus[5]+" , SignOutCountSec:"+dataSecCensus[5]);
					if (row == 5 && column == 1) {
						if (dataFirstCensus[5] != null
								&& dataFirstCensus[5] != ""
								&& !dataFirstCensus[5].equalsIgnoreCase("0")) {
							Global.currentResidenceArgument = 0;
							final FrameSignOutInfo frame = new FrameSignOutInfo();
							frame.updateJTable(1);
							frame.setModal(true);
							frame.setVisible(true);
							if (Global.currentResidenceArgument != 0) {
								Global.frameMainOptions.openMainDesktopTmp();
							}
						}
					}
					if (row == 5 && column == 2) {
						if (dataSecCensus[5] != null && dataSecCensus[5] != ""
								&& !dataSecCensus[5].equalsIgnoreCase("0")) {
							final FrameSignOutInfo frame = new FrameSignOutInfo();
							frame.updateJTable(0);
							frame.setVisible(true);
							if (Global.currentResidenceArgument != 0) {
								Global.frameMainOptions.openMainDesktopTmp();
							}
						}
					}
					if (row == 6 && column == 2) {
						if (dataSecCensus[6] != null && dataSecCensus[6] != ""
								&& !dataSecCensus[6].equalsIgnoreCase("0")) {
							Global.currentResidenceArgument = 0;
							final FrameOutOnPass frame = new FrameOutOnPass();
							frame.setModal(true);
							frame.setVisible(true);
							if (Global.currentResidenceArgument != 0) {
								Global.frameMainOptions.openMainDesktopTmp();
							}
						}
					}
					if (row == 7 && column == 2) {
						if (dataSecCensus[7] != null && dataSecCensus[7] != ""
								&& !dataSecCensus[7].equalsIgnoreCase("0")) {
							Global.currentResidenceArgument = 0;
							final FrameERInfo frame = new FrameERInfo();
							frame.setModal(true);
							frame.setVisible(true);
							if (Global.currentResidenceArgument != 0) {
								Global.frameMainOptions.openMainDesktopTmp();
							}
						}
					}
				}
			}
		});

		final JPanel panel = new JPanel();
		panel.setLayout(fl);
		panel.setBounds(568, 0, 284, 457);
		panel.setOpaque(false);
		panelMain.add(panel);

		final JxDataSheet dataSheetAlert = new JxDataSheet();
		dataSheetAlert.setBorderd(true);
		dataSheetAlert.setHeading("Alert");
		dataSheetAlert.setIcon("img/dashboard/alertIcon.png");
		dataSheetAlert.setBounds(0, 3, 251, 178);
		panel.add(dataSheetAlert);
		dataSheetAlert.setFont(new Font("Dialog", Font.PLAIN, 11));
		dataSheetAlert.setPreferredSize(dataSheetAlert.getSize());
		dataSheetAlert.setMaximumSize(dataSheetAlert.getSize());
		dataSheetAlert.setModel(new TempDataModelAlert(dataFirstAlert,
				dataSecAlert));
		dataSheetAlert.setVisible(true);
		dataSheetAlert.addTableEventListener(new TableEventListener() {
			public void mouseClick(int row, int column, MouseEvent event) {
				if (event.getClickCount() > 1) {
					System.out
							.println("click on [" + row + ", " + column + "]");
					// Resident Alert Counts
					if (row == 0 && column == 1) {
						if (dataFirstAlert[0] != null
								&& dataFirstAlert[0] != ""
								&& !(dataFirstAlert[0].equalsIgnoreCase("0"))) {
							final FramePendingAlertInfo frame = new FramePendingAlertInfo(
									"Resident Past");
							frame.updateJTable(1, "Resident Past");
							frame.setModal(true);
							frame.setVisible(true);
						}
					}
					if (row == 0 && column == 2) {
						if (dataSecAlert[0] != null && dataSecAlert[0] != ""
								&& !(dataSecAlert[0].equalsIgnoreCase("0"))) {
							final FramePendingAlertInfo frame = new FramePendingAlertInfo(
									"Resident Future");
							frame.updateJTable(1, "Resident Future");
							frame.setModal(true);
							frame.setVisible(true);
						}
					}
					if (row == 1 && column == 2) {
						if (dataSecAlert[1] != null && dataSecAlert[1] != ""
								&& !(dataSecAlert[1].equalsIgnoreCase("0"))) {
							final FramePendingAlertInfo frame = new FramePendingAlertInfo(
									"Completed");
							frame.updateJTable(1, "Completed");
							frame.setModal(true);
							frame.setVisible(true);
						}
					}
					if (row == 2 && column == 2) {
						if (dataSecAlert[2] != null && dataSecAlert[2] != ""
								&& !(dataSecAlert[2].equalsIgnoreCase("0"))) {
							final FramePendingAlertInfo frame = new FramePendingAlertInfo(
									"I Send Out");
							frame.updateJTable(1, "I Send Out");
							frame.setModal(true);
							frame.setVisible(true);
						}
					}

					// Global Alert Counts
					if (row == 3 && column == 1) {
						if (dataFirstAlert[3] != null
								&& dataFirstAlert[3] != ""
								&& !(dataFirstAlert[3].equalsIgnoreCase("0"))) {
							Global.currentInnerTab = 1;
							Global.currentAlertStatus = "Pending Past";
							Global.panelMainDashboard.selectAndOpenButton(9);
						}
					}
					if (row == 3 && column == 2) {
						if (dataSecAlert[3] != null && dataSecAlert[3] != ""
								&& !(dataSecAlert[3].equalsIgnoreCase("0"))) {
							Global.currentInnerTab = 1;
							Global.currentAlertStatus = "Pending Upcoming";
							Global.panelMainDashboard.selectAndOpenButton(9);
						}
					}
					if (row == 4 && column == 2) {
						if (dataSecAlert[4] != null && dataSecAlert[4] != ""
								&& !(dataSecAlert[4].equalsIgnoreCase("0"))) {
							Global.currentInnerTab = 1;
							Global.currentAlertStatus = "Completed";
							Global.panelMainDashboard.selectAndOpenButton(9);
						}
					}
					if (row == 5 && column == 2) {
						if (dataSecAlert[5] != null && dataSecAlert[5] != ""
								&& !(dataSecAlert[5].equalsIgnoreCase("0"))) {
							Global.currentInnerTab = 1;
							Global.currentAlertStatus = "I Send Out";
							Global.panelMainDashboard.selectAndOpenButton(9);
						}
					}
				}
			}
		});

		final JxDataSheet dataSheetPrevDayCensus = new JxDataSheet();
		dataSheetPrevDayCensus.setBorderd(true);
		dataSheetPrevDayCensus.setIcon("img/dashboard/previousIcon.png");
		dataSheetPrevDayCensus.setHeading("Previous Day Census");
		dataSheetPrevDayCensus.setBounds(0, 3, 251, 178);
		panel.add(dataSheetPrevDayCensus);
		dataSheetPrevDayCensus.setFont(new Font("Dialog", Font.PLAIN, 11));
		dataSheetPrevDayCensus.setPreferredSize(new Dimension(
				(int) dataSheetPrevDayCensus.getSize().getWidth(),
				(int) (dataSheetPrevDayCensus.getSize().getHeight() + 19)));
		dataSheetPrevDayCensus.setMaximumSize(new Dimension(
				(int) dataSheetPrevDayCensus.getSize().getWidth(),
				(int) (dataSheetPrevDayCensus.getSize().getHeight() + 19)));
		dataSheetPrevDayCensus.setModel(new TempDataModelPreviousDayCensus(
				dataPrevDayCensus));
		dataSheetPrevDayCensus.setVisible(true);
		dataSheetPrevDayCensus.addTableEventListener(new TableEventListener() {
			public void mouseClick(int row, int column, MouseEvent event) {
				if (event.getClickCount() > 1) {
					if (row == 2 && column == 1) {
					}
				}
			}
		});

		tabLabels = new JLabel[tabs.length];
		for (int i = 0; i < 4; i++) {
			final int index = i;
			tabLabels[i] = new JLabel(new ImageIcon("img/dashboard/" + tabs[i]));
			tabLabels[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					handleTabClick(index);
				}
			});
			tabLabels[i].setText("");
			tabLabels[i].setSize(TAB_WIDTH, TAB_HEIGHT);
			topTabsPanel.add(tabLabels[i]);
		}

		handleTabClick(0);
		reAdjustTabLocation();
		doResize();

		dashboardTimer = new Timer(10000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// doUpdateValues();
				// doUpdateAssessmentValues();
				// doUpdateNewLabReportsCount();
				// doUpdatePreviousDayCensus();
				// doUpdateMDSPending();
				// doUpdateMessages();
				// doCarePlanCount();
				// if(Global.currentLoggedInUserKey!=0){
				// doUpdatePendingAlerts();
				// }
			}
		});
		dashboardTimer.setRepeats(true);
		dashboardTimer.start();

		doUpdateValues();
		doUpdateAssessmentValues();
		doUpdateNewLabReportsCount();
		doUpdatePreviousDayCensus();
		doUpdateMDSPending();
		doUpdatePendingAlerts();
		doUpdateMessages();
		doCarePlanCount();
	}

	private void doResize() {
		topTabsPanel.setSize(this.getSize().width, this.getSize().height);
		topTabArea.setSize(getWidth(), topTabArea.getHeight());
		topBlueStrip.setSize(getWidth(), topBlueStrip.getHeight());
		panelView.setSize(getWidth(), getHeight() - panelView.getY());
		reAdjustTabLocation();
		view.setLocation((panelView.getWidth() - view.getWidth()) / 2,
				(panelView.getHeight() - view.getHeight() - 70) / 2);
	}

	private void reAdjustTabLocation() {
		int w = this.getSize().width;
		for (int i = 0, x = 0, y = 0; i < tabs.length; i++) {
			x = w - ((tabs.length - i) * (TAB_WIDTH - TAB_SPACE)) - 20;
			y = topTabsPanel.getHeight() - TAB_HEIGHT;
			tabLabels[i].setLocation(x, y);
		}
	}

	private void handleTabClick(int index) {
		int i = 0;
		for (i = 0; i < tabLabels.length; i++) {
			topTabsPanel.setComponentZOrder(tabLabels[i], topTabsPanel
					.getComponentCount() - 1);
		}
		topTabsPanel.setComponentZOrder(tabLabels[index], 0);
		this.firePropertyChange(TABINDEX, oldIndex, index);
		oldIndex = index;
		topTabsPanel.repaint();
		view.removeAll();
		displayTab(index);
		panelView.repaint();
	}

	private void displayTab(int index) {
		if (index >= 0) {
			JComponent com = getTab(index);
			view.setView(com);

		}
	}

	public void setView(JComponent com) {
		this.view.setView(com);
		com.setOpaque(false);
		doResize();
		com.firePropertyChange("DISPLAY_TAB", false, true);
	}

	private JPanel getTab(int index) {
		// System.out.println("Index is:"+index);
		switch (index) {
		case 0:
			return panelDefault;
		case 1:
			return new PanelReports();
		case 2:
			PanelCareLogs panelCareLogs = new PanelCareLogs();
			panelCareLogs.setOpaque(false);
			return panelCareLogs;
		case 3:
			PanelCNA panelCNA = new PanelCNA();
			panelCNA.setOpaque(false);
			return panelCNA;
		default:
			return panelDefault;
		}
	}

	private final synchronized void doUpdateMDSPending() {
		try {
			int totalMDSPending = 0;
			dataGeneral[4] = totalMDSPending + "";
		} catch (Exception ex) {

		}
	}

	private final synchronized void doUpdatePreviousDayCensus() {
		try {
			// int cenStatusAdmissionCount =
			// MedrexClientManager.getInstance().getCensusLastDayAdmissionCount();
			int cenStatusAdmissionFirstFloorCount = MedrexClientManager
					.getInstance().getCensusLastDayAdmissionFirstFloorCount();
			int cenStatusAdmissionSecondFloorCount = MedrexClientManager
					.getInstance().getCensusLastDayAdmissionSecondFloorCount();
			// int cenStatusDischargeCount =
			// MedrexClientManager.getInstance().getCensusLastDayDischargeCount();
			int cenStatusDischargeFirstFloorCount = MedrexClientManager
					.getInstance().getCensusLastDayDischargeFirstFloorCount();
			int cenStatusDischargeSecondFloorCount = MedrexClientManager
					.getInstance().getCensusLastDayDischargeSecondFloorCount();

			if (cenStatusAdmissionFirstFloorCount != 0) {
				dataPrevDayCensus[1] = cenStatusAdmissionFirstFloorCount + "";
			} else {
				dataPrevDayCensus[1] = "" + 0;
			}
			if (cenStatusAdmissionSecondFloorCount != 0) {
				dataPrevDayCensus[2] = cenStatusAdmissionSecondFloorCount + "";
			} else {
				dataPrevDayCensus[2] = "" + 0;
			}
			if (cenStatusAdmissionFirstFloorCount != 0
					|| cenStatusAdmissionSecondFloorCount != 0) {
				dataPrevDayCensus[0] = cenStatusAdmissionFirstFloorCount
						+ cenStatusAdmissionSecondFloorCount + "";
			} else {
				dataPrevDayCensus[0] = "" + 0;
			}
			if (cenStatusDischargeFirstFloorCount != 0) {
				dataPrevDayCensus[4] = cenStatusDischargeFirstFloorCount + "";
			} else {
				dataPrevDayCensus[4] = "" + 0;
			}
			if (cenStatusDischargeSecondFloorCount != 0) {
				dataPrevDayCensus[5] = cenStatusDischargeSecondFloorCount + "";
			} else {
				dataPrevDayCensus[5] = "" + 0;
			}
			if (cenStatusDischargeFirstFloorCount != 0
					|| cenStatusDischargeSecondFloorCount != 0) {
				dataPrevDayCensus[3] = cenStatusDischargeFirstFloorCount
						+ cenStatusDischargeSecondFloorCount + "";
			} else {
				dataPrevDayCensus[3] = "" + 0;
			}
		} catch (Exception ex) {

		}

	}

	private final synchronized void doUpdateNewLabReportsCount() {
		Dashboard das = null;
		try {
			das = MedrexClientManager.getInstance().getDashboard("CENSUS");
		} catch (Exception e) {
		}
		if (das != null) {
			dataGeneral[0] = das.getLabReports1stFloorCount()
					+ das.getLabReports2stFloorCount() + "";
			dataGeneral[1] = das.getLabReports1stFloorCount() + "";
			dataGeneral[2] = das.getLabReports1stFloorCount() + "";
		}
	}

	private final synchronized void doUpdateValues() {
		Dashboard census = null;
		try {
			census = MedrexClientManager.getInstance().getDashboard("CENSUS");

			if (census.getSignOutLate() > 0) {
				MedrexClientManager.getInstance()
						.getSignOutLateMoreThanHourCount();
			}
		} catch (Exception e) {
		}
		if (census != null) {
			dataSecCensus[0] = census.getInHouse() + "";
			dataSecCensus[3] = census.getHospital() + "";
			dataSecCensus[4] = census.getBedHold() + "";
			dataSecCensus[5] = census.getSignOut() + "";
			dataFirstCensus[5] = census.getSignOutLate() + "";
			dataSecCensus[6] = census.getOutOfPass() + "";
			dataSecCensus[7] = census.getEr() + "";
			try {
				dataSecCensus[1] = MedrexClientManager.getInstance()
						.get1stFloorResident()
						+ "";
				dataSecCensus[2] = MedrexClientManager.getInstance()
						.get2ndFloorResident()
						+ "";
			} catch (RemoteException e) {
				e.printStackTrace();
			} catch (MedrexException e) {
				e.printStackTrace();
			}

		}
	}

	private final synchronized void doUpdateAssessmentValues() {
		Dashboard des = null;
		try {
			des = MedrexClientManager.getInstance().getDashboard("CENSUS");
		} catch (Exception e) {
		}
		if (des != null) {
			dataAssessmentFirstFloor[0] = des.getPendingAlertFirstFloorCount()
					+ des.getPendingAlertSecondFloorCount() + "";
			dataAssessmentSecFloor[0] = des.getPendingFirstFloorCount()
					+ des.getPendingSecondFloorCount() + "";
			dataAssessmentFirstFloor[1] = des.getPendingAlertFirstFloorCount()
					+ "";
			dataAssessmentSecFloor[1] = des.getPendingFirstFloorCount() + "";
			dataAssessmentFirstFloor[2] = des.getPendingAlertSecondFloorCount()
					+ "";
			dataAssessmentSecFloor[2] = des.getPendingSecondFloorCount() + "";
		}

	}

	private final synchronized void doUpdatePendingAlerts() {
		List l = new ArrayList();
		try {
			l = MedrexClientManager.getInstance().getAllAlertCounts(
					Global.currentLoggedInUserKey);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Iterator it = l.iterator();
		while (it.hasNext()) {
			Object[] o = (Object[]) it.next();
			dataFirstAlert[0] = o[0].toString() + "";
			dataSecAlert[0] = o[1].toString() + "";
			dataSecAlert[3] = o[5].toString() + "";
			dataFirstAlert[3] = o[4].toString() + "";

			dataSecAlert[1] = o[2].toString() + "";

			dataSecAlert[2] = o[3].toString() + "";

			dataSecAlert[4] = o[6].toString() + "";

			dataSecAlert[5] = o[7].toString() + "";
		}

	}

	private final synchronized void doUpdateMessages() {
		int totalMessagesCount = 0;
		int triggerWordCount = 0;
		try {
			totalMessagesCount = MedrexClientManager.getInstance()
					.getTotalMessage(Global.currentLoggedInUserKey);
			triggerWordCount = MedrexClientManager.getInstance()
					.getTriggerWordMailCount(Global.currentLoggedInUserKey);
		} catch (RemoteException e) {

			e.printStackTrace();
		} catch (MedrexException e) {

			e.printStackTrace();
		}
		dataMessage[0] = totalMessagesCount + "";
		dataMessage[1] = triggerWordCount + "";
	}

	private final synchronized void doCarePlanCount() {
		int carePlanCount = 0;
		try {
			carePlanCount = MedrexClientManager.getInstance()
					.getCarePlanAnalyzerCount();
		} catch (RemoteException e) {

			e.printStackTrace();
		} catch (MedrexException e) {

			e.printStackTrace();
		}
		dataGeneral[3] = carePlanCount + "";
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(new Color(32, 63, 84));
		g2.fillRect(0, getHeight() - 76, getWidth(), 76);
	}

	public void doUpdate() {
		topTabArea.setSize(getWidth(), topTabArea.getHeight());
		topBlueStrip.setSize(getWidth(), topBlueStrip.getHeight());
		panelView.setSize(getWidth(), getHeight() - panelView.getY());
		this.repaint();
	}

	public static void main(String[] a) {
		SwingUtils.wrapInFrame(new PanelDashboard()).setVisible(true);
	}
}

class TempDataModelGeneral extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4620478475814991542L;
	private String[] cols = new String[] { "", "" };
	private String[] data;
	private String[] dataName;

	public TempDataModelGeneral(String[] data) {
		dataName = new String[] { "New Lab Report", "        First Floor",
				"        Second Floor", "Care Plan", "Total MDS Pending" };
		this.data = data;
	};

	public int getColumnCount() {
		return cols.length;
	}

	@Override
	public String getColumnName(int column) {
		return cols[column];
	}

	public int getRowCount() {
		return dataName.length;
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		if (columnIndex == 0) {
			return dataName[rowIndex];
		} else {
			return data[rowIndex];
		}
	}
}

class TempDataModelAssessment extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 568204838683412739L;
	private String[] cols = new String[] { "", "", "" };
	private String[] dataFirstFloor;
	private String[] dataSecFloor;
	private String[] dataName;

	public TempDataModelAssessment(String[] dataFirstFloor,
			String[] dataSecFloor) {
		dataName = new String[] { "Pending", "        First Floor",
				"        Second Floor", };
		this.dataFirstFloor = dataFirstFloor;
		this.dataSecFloor = dataSecFloor;
	};

	public int getColumnCount() {
		return cols.length;
	}

	@Override
	public String getColumnName(int column) {
		return cols[column];
	}

	public int getRowCount() {
		return dataName.length;
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		if (columnIndex == 0) {
			return dataName[rowIndex];
		}
		if (columnIndex == 1) {
			if (dataFirstFloor[0] != null && dataFirstFloor[0] != ""
					&& dataFirstFloor[0] != "0") {
				return "<Html><font color=" + "red" + ">"
						+ dataFirstFloor[rowIndex] + "</font></Html>";
			} else {
				return dataFirstFloor[rowIndex];
			}
		}
		if (columnIndex == 2) {
			return dataSecFloor[rowIndex];
		}
		return null;
	}
}

class TempDataModelMessage extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9002000594849424582L;
	private String[] cols = new String[] { "", "" };
	private String[] dataMessage;
	private String[] dataName;

	public TempDataModelMessage(String[] data) {
		dataName = new String[] { "New Messages", "New Trigger Word Alert" };
		this.dataMessage = data;
	};

	public int getColumnCount() {
		return cols.length;
	}

	@Override
	public String getColumnName(int column) {
		return cols[column];
	}

	public int getRowCount() {
		return dataName.length;
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		if (columnIndex == 0) {
			return dataName[rowIndex];
		} else {
			return dataMessage[rowIndex];
		}
	}
}

class TempDataModelCensus extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2703850974622780195L;
	private String[] cols = new String[] { "", "", "" };
	private String[] dataFirst;
	private String[] dataSec;
	private String[] dataName;

	public TempDataModelCensus(String[] dataFirst, String[] dataSec) {
		dataName = new String[] { "InHouse", "        First Floor",
				"        Second Floor", "Hospital", "Bed Hold", "Sign Out",
				"Out On Pass", "ER" };
		this.dataFirst = dataFirst;
		this.dataSec = dataSec;
	};

	public int getColumnCount() {
		return cols.length;
	}

	@Override
	public String getColumnName(int column) {
		return cols[column];
	}

	public int getRowCount() {
		return dataName.length;
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		if (columnIndex == 0) {
			return dataName[rowIndex];
		}
		if (columnIndex == 1) {
			return dataFirst[rowIndex];
		}
		if (columnIndex == 2) {
			return dataSec[rowIndex];
		}
		return null;
	}
}

class TempDataModelAlert extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8623490385557255512L;
	private String[] cols = new String[] { "", "", "" };
	private String[] dataFirst;
	private String[] dataSec;
	private String[] dataName;

	public TempDataModelAlert(String[] dataFirst, String[] dataSec) {
		dataName = new String[] { "Resident Pending Alert",
				"      Completed Alert", "      I Send Out",
				"Global Pending Alert", "      Completed Alert",
				"      I Send Out" };
		this.dataFirst = dataFirst;
		this.dataSec = dataSec;
	};

	public int getColumnCount() {
		return cols.length;
	}

	@Override
	public String getColumnName(int column) {
		return cols[column];
	}

	public int getRowCount() {
		return dataName.length;
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		if (columnIndex == 0) {
			return dataName[rowIndex];
		}
		if (columnIndex == 1) {
			return dataFirst[rowIndex];
		}
		if (columnIndex == 2) {
			return dataSec[rowIndex];
		}
		return null;
	}
}

class TempDataModelPreviousDayCensus extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8028024676819808848L;
	private String[] cols = new String[] { "", "" };
	private String[] data;
	private String[] dataName;

	public TempDataModelPreviousDayCensus(String[] data) {
		dataName = new String[] { "Admission", "     First Floor",
				"     Second Floor", "Discharge", "     First Floor",
				"     Second  Floor" };
		this.data = data;
	};

	public int getColumnCount() {
		return cols.length;
	}

	@Override
	public String getColumnName(int column) {
		return cols[column];
	}

	public int getRowCount() {
		return dataName.length;
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		if (columnIndex == 0) {
			return dataName[rowIndex];
		} else {
			return data[rowIndex];
		}
	}
}
