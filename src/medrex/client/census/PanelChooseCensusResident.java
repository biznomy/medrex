package medrex.client.census;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import medrex.client.FrameLogin;
import medrex.client.accurities.PanelAccuritiesMain;
import medrex.client.admin.userLogon.ControllerUserLogon;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.PanelResidentInformation;
import medrex.client.utils.SwingUtils;
import medrex.client.utils.Utils;
import medrex.client.utils.controls.ChooseResidentList;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.census.countAudit.CountAuditStatus;
import medrex.commons.vo.resident.ResidentMain;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.ui.TextAnchor;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxButton;
import com.sX.swing.JxLiquidButton;
import com.sX.swing.JxPanel;

public class PanelChooseCensusResident extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -997206425772820763L;
	private JxLiquidButton btnResidentReport;
	private JxLiquidButton btnCountReport;
	private JxLiquidButton btnAcuitiesReport;
	private JxLiquidButton btnADayReport;
	private JxLiquidButton btnRoomHistoryReport;
	private JxLiquidButton btnCensusHistoryChart;
	private JxLiquidButton btnCensusHistoryReport;
	private JxLiquidButton btnCountAudit;
	private JxLiquidButton btnChangeRoomReport;
	private PanelResidentInformation panelResiInfo;
	private ChooseResidentList residentList;
	private JPanel topTabArea;
	private JPanel topTabsPanel;
	private JPanel topBlueStrip;
	private JPanel defaultPanel;
	private JPanel panel_4;
	private JTextField txtChooseResident;
	private JLabel logLabel;
	private JLabel lastLoginLabel;
	private JxButton nextButton;
	private Timer timer;

	private static Color BACK_COLOR = new Color(154, 163, 165);
	private static Color FONT_COLOR = new Color(5, 65, 94);

	public PanelChooseCensusResident() {
		super();
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});
		setLayout(null);
		setPreferredSize(new Dimension(868, 768));

		topTabArea = new JPanel();
		topTabArea.setLayout(new BorderLayout(0, 0));
		topTabArea.setOpaque(false);
		topTabArea.setBounds(0, 0, 868, 138);
		add(topTabArea);

		topTabsPanel = new JPanel();
		topTabsPanel.setOpaque(false);
		topTabsPanel.setLayout(null);
		topTabsPanel.setPreferredSize(new Dimension(868, 40));
		topTabArea.add(topTabsPanel, BorderLayout.SOUTH);

		topBlueStrip = new JPanel();
		topBlueStrip.setLayout(new GridLayout(0, 2));
		topBlueStrip.setBackground(new Color(28, 93, 113));
		topBlueStrip.setBounds(0, 138, 868, 38);
		add(topBlueStrip);

		lastLoginLabel = new JLabel();
		lastLoginLabel.setForeground(Color.WHITE);
		lastLoginLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont()
				.deriveFont(16));
		lastLoginLabel.setBorder(new EmptyBorder(0, 100, 0, 0));
		topBlueStrip.add(lastLoginLabel);
		lastLoginLabel.setText("<html><b>Welcome </b>"
				+ Global.currentUserLastName + ", "
				+ Global.currentUserFirstName);

		logLabel = new JLabel();
		logLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent arg0) {
				(new ControllerUserLogon()).logoutUpdate();
				FrameFactory.closeAll();
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
		logLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		topBlueStrip.add(logLabel);
		logLabel.setText("Log off ");

		defaultPanel = new JPanel();
		defaultPanel.setLayout(null);
		defaultPanel.setBorder(new EmptyBorder(20, 0, 0, 10));
		defaultPanel.setOpaque(false);
		defaultPanel.setBounds(0, 176, 868, 592);
		add(defaultPanel);

		panel_4 = new JPanel();
		panel_4.setOpaque(false);
		panel_4.setLayout(null);
		panel_4.setBounds(157, 10, 420, 464);
		defaultPanel.add(panel_4);

		final JLabel chooseResidentLabel = new JLabel();
		chooseResidentLabel.setHorizontalAlignment(SwingConstants.CENTER);
		chooseResidentLabel.setText("CHOOSE RESIDENT");
		chooseResidentLabel.setForeground(new Color(5, 65, 94));
		chooseResidentLabel.setFont(new Font("Dialog", Font.PLAIN, 28));
		chooseResidentLabel.setBounds(0, 0, 420, 35);
		panel_4.add(chooseResidentLabel);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(5, 65, 94), 1, false));
		panel_5.setBackground(Color.WHITE);
		panel_5.setArc(0.6f);
		panel_5.setBounds(10, 50, 400, 30);
		panel_4.add(panel_5);

		txtChooseResident = new JTextField();
		txtChooseResident.setForeground(new Color(5, 65, 94));
		txtChooseResident.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtChooseResident.setBounds(5, 5, 390, 20);
		txtChooseResident.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtChooseResident.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(final KeyEvent e) {
				doSearch();
			}
		});
		panel_5.add(txtChooseResident);

		residentList = new ChooseResidentList();
		// residentList.setListData(new String[] {"BEVAN MICHAEL",
		// "GILCHRIST ADAM", "BEVAN MICHAEL", "GILCHRIST ADAM", "BEVAN MICHAEL",
		// "GILCHRIST ADAM"});
		residentList.getJListComponent().setForeground(new Color(5, 65, 94));
		residentList.getJListComponent().setBackground(
				new Color(206, 221, 224, 250));
		residentList.getJListComponent().setFont(
				new Font("Dialog", Font.BOLD, 16));
		residentList.setBounds(10, 102, 400, 369);
		residentList.setPreferredSize(residentList.getBounds().getSize());
		residentList.setCellRenderer(residentList.new JxListCellRenderer() {
			@Override
			protected String getText(Object value) {
				if (value instanceof ResidentMain) {
					ResidentMain resi = (ResidentMain) value;
					return resi.getUserPass() + ", " + resi.getUserName();
				} else {
					return super.getText(value);
				}
			}
		});
		residentList.getJListComponent().addListSelectionListener(
				new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent e) {
						if (!e.getValueIsAdjusting()) {
							ResidentMain resi = (ResidentMain) residentList
									.getJListComponent().getSelectedValue();
							panelResiInfo.setResident(resi);
						} else {
							panelResiInfo.setResident(null);
						}
						// nextButton.setVisible(panelResiInfo.isVisible());
					}
				});
		residentList.getJListComponent().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 1) {
					doNext();
				}
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				doNext();
			}
		});
		panel_4.add(residentList);

		panelResiInfo = new PanelResidentInformation();
		panelResiInfo.setForeground(new Color(5, 65, 94));
		panelResiInfo.setBounds(302, 514, 200, 78);
		defaultPanel.add(panelResiInfo);

		nextButton = new JxButton();
		nextButton.setArc(0.6f);
		nextButton.setText("NEXT >>");
		nextButton.setFont(new Font("Dialog", Font.BOLD, 12));
		nextButton.setForeground(new Color(5, 65, 94));
		nextButton.setBorder(new LineBorder(new Color(5, 65, 94), 1, false));
		nextButton.setBackground(Color.WHITE);
		nextButton.setBounds(618, 480, 106, 36);
		defaultPanel.add(nextButton);
		nextButton.setVisible(false);
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (getSelectedResident() != null) {
					doNext();
				}
			}
		});

		btnCountAudit = new JxLiquidButton();
		btnCountAudit.setArc(0.6f);
		btnCountAudit.setHorizontalAlignment(SwingConstants.CENTER);
		btnCountAudit.setFont(new Font("", Font.PLAIN, 15));
		btnCountAudit.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		btnCountAudit.setBackground(BACK_COLOR);
		btnCountAudit.setForeground(FONT_COLOR);
		btnCountAudit.setText("Acuities Census Audit");
		btnCountAudit.setBounds(618, 74, 187, 30);
		defaultPanel.add(btnCountAudit);
		// btnCountAudit.setFont(new Font("Dialog", Font.BOLD, 12));
		// btnCountAudit.setForeground(new Color(5, 65, 94));
		// btnCountAudit.setBorder(new LineBorder(new Color(5, 65, 94), 1,
		// false));
		// btnCountAudit.setBackground(Color.WHITE);
		// btnCountAudit.setVisible(false);
		btnCountAudit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelAccuritiesMain accMain = new PanelAccuritiesMain();
				Global.panelMainDashboard.setView(accMain);
			}
		});

		btnCensusHistoryReport = new JxLiquidButton();
		defaultPanel.add(btnCensusHistoryReport);
		btnCensusHistoryReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameCensusStatusHistoryReportChooser frameCensusHistoryReportChooser = new FrameCensusStatusHistoryReportChooser();
				SwingUtils.center(frameCensusHistoryReportChooser);
				frameCensusHistoryReportChooser.setVisible(true);
			}
		});
		btnCensusHistoryReport.setArc(0.6f);
		btnCensusHistoryReport.setHorizontalAlignment(SwingConstants.CENTER);
		btnCensusHistoryReport.setFont(new Font("", Font.PLAIN, 15));
		btnCensusHistoryReport.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		btnCensusHistoryReport.setBackground(BACK_COLOR);
		btnCensusHistoryReport.setForeground(FONT_COLOR);
		btnCensusHistoryReport.setBounds(618, 38, 187, 30);
		btnCensusHistoryReport.setText("Report");

		btnCensusHistoryChart = new JxLiquidButton();
		btnCensusHistoryChart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List list = new ArrayList();
				new CensusStatus();
				try {
					list = MedrexClientManager.getInstance()
							.getAllCensusStatusByYear();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				DefaultStatisticalCategoryDataset defaultstatisticalcategorydataset = new DefaultStatisticalCategoryDataset();
				Iterator it1 = list.iterator();
				int i = 0;
				while (it1.hasNext()) {
					Object[] obj = (Object[]) it1.next();
					String typeName = obj[2].toString();
					System.out.println("typeName is = " + typeName);

					if (typeName.equals("Admission")) {
						double sumAdmission = Double.parseDouble(obj[0]
								.toString());
						System.out.println("adm is = " + sumAdmission);

						int year = Integer.parseInt(obj[1].toString());
						System.out.println("year is = " + year);
						String yearStr = String.valueOf(year);

						defaultstatisticalcategorydataset.add(sumAdmission,
								0.0, "Admission", yearStr);
						defaultstatisticalcategorydataset.add(null, null,
								"Discharge", yearStr);
						i++;
					}
				}

				Iterator it2 = list.iterator();
				int ii = 0;
				while (it2.hasNext()) {
					Object[] obj = (Object[]) it2.next();
					String typeName = obj[2].toString();
					System.out.println("typeName is = " + typeName);

					if (obj[2].toString().equals("Discharge")) {
						double sumAdmission = Double.parseDouble(obj[0]
								.toString());
						System.out.println("adm is = " + sumAdmission);

						int year = Integer.parseInt(obj[1].toString());
						System.out.println("year is = " + year);
						String yearStr = String.valueOf(year);
						defaultstatisticalcategorydataset.add(sumAdmission,
								0.0, "Discharge", yearStr);
						ii++;
					}
				}

				JFreeChart jfreechart = ChartFactory.createLineChart(
						"Census Status History Chart", "Year",
						"Number of Residents",
						defaultstatisticalcategorydataset,
						PlotOrientation.VERTICAL, true, true, false);
				jfreechart.setBackgroundPaint(Color.white);
				CategoryPlot categoryplot = (CategoryPlot) jfreechart.getPlot();
				categoryplot.setBackgroundPaint(Color.lightGray);
				categoryplot.setRangeGridlinePaint(Color.white);
				NumberAxis numberaxis = (NumberAxis) categoryplot
						.getRangeAxis();
				numberaxis.setStandardTickUnits(NumberAxis
						.createIntegerTickUnits());
				numberaxis.setAutoRangeIncludesZero(false);
				StatisticalBarRenderer statisticalbarrenderer = new StatisticalBarRenderer();
				statisticalbarrenderer.setDrawBarOutline(false);
				statisticalbarrenderer.setErrorIndicatorPaint(Color.black);
				statisticalbarrenderer.setIncludeBaseInRange(false);
				categoryplot.setRenderer(statisticalbarrenderer);
				statisticalbarrenderer
						.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
				statisticalbarrenderer.setBaseItemLabelsVisible(true);
				statisticalbarrenderer.setBaseItemLabelPaint(Color.yellow);
				statisticalbarrenderer
						.setBasePositiveItemLabelPosition(new ItemLabelPosition(
								ItemLabelAnchor.INSIDE6,
								TextAnchor.BOTTOM_CENTER));
				GradientPaint gradientpaint = new GradientPaint(0.0F, 0.0F,
						Color.blue, 0.0F, 0.0F, new Color(0, 0, 64));
				GradientPaint gradientpaint1 = new GradientPaint(0.0F, 0.0F,
						Color.green, 0.0F, 0.0F, new Color(0, 64, 0));
				statisticalbarrenderer.setSeriesPaint(0, gradientpaint);
				statisticalbarrenderer.setSeriesPaint(1, gradientpaint1);

				ChartFrame frame1 = new ChartFrame("Bar Chart", jfreechart);
				frame1.setVisible(true);
				frame1.setSize(800, 800);

			}
		});
		btnCensusHistoryChart.setHorizontalAlignment(SwingConstants.CENTER);
		btnCensusHistoryChart.setFont(new Font("", Font.PLAIN, 15));
		btnCensusHistoryChart.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		btnCensusHistoryChart.setBackground(BACK_COLOR);
		btnCensusHistoryChart.setForeground(FONT_COLOR);

		btnCensusHistoryChart.setArc(0.6f);
		btnCensusHistoryChart.setText("Chart");
		btnCensusHistoryChart.setBounds(618, 110, 187, 30);
		defaultPanel.add(btnCensusHistoryChart);

		btnRoomHistoryReport = new JxLiquidButton();
		btnRoomHistoryReport.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doRoomHistoryReport();
			}
		});
		btnRoomHistoryReport.setHorizontalAlignment(SwingConstants.CENTER);
		btnRoomHistoryReport.setFont(new Font("", Font.PLAIN, 15));
		btnRoomHistoryReport.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		btnRoomHistoryReport.setBackground(BACK_COLOR);
		btnRoomHistoryReport.setForeground(FONT_COLOR);
		btnRoomHistoryReport.setArc(0.6f);
		btnRoomHistoryReport.setText("Room History");
		btnRoomHistoryReport.setBounds(618, 146, 187, 30);
		defaultPanel.add(btnRoomHistoryReport);

		btnADayReport = new JxLiquidButton();
		btnADayReport.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doADayReport();
			}
		});
		btnADayReport.setHorizontalAlignment(SwingConstants.CENTER);
		btnADayReport.setFont(new Font("", Font.PLAIN, 15));
		btnADayReport.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		btnADayReport.setBackground(BACK_COLOR);
		btnADayReport.setForeground(FONT_COLOR);
		btnADayReport.setArc(0.6f);
		btnADayReport.setText("Daily Census");
		btnADayReport.setBounds(618, 182, 187, 30);
		defaultPanel.add(btnADayReport);

		btnChangeRoomReport = new JxLiquidButton();
		btnChangeRoomReport.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doChnageRoomReport();
			}
		});
		btnChangeRoomReport.setHorizontalAlignment(SwingConstants.CENTER);
		btnChangeRoomReport.setFont(new Font("", Font.PLAIN, 15));
		btnChangeRoomReport
				.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		btnChangeRoomReport.setBackground(BACK_COLOR);
		btnChangeRoomReport.setForeground(FONT_COLOR);
		btnChangeRoomReport.setArc(0.6f);
		btnChangeRoomReport.setText("Room Changes");
		btnChangeRoomReport.setBounds(618, 218, 187, 30);
		defaultPanel.add(btnChangeRoomReport);

		btnAcuitiesReport = new JxLiquidButton();
		btnAcuitiesReport.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doAcuitiesReports();
			}
		});
		btnAcuitiesReport.setHorizontalAlignment(SwingConstants.CENTER);
		btnAcuitiesReport.setFont(new Font("", Font.PLAIN, 15));
		btnAcuitiesReport.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		btnAcuitiesReport.setBackground(BACK_COLOR);
		btnAcuitiesReport.setForeground(FONT_COLOR);
		btnAcuitiesReport.setArc(0.6f);
		btnAcuitiesReport.setText("Acuities Report");
		btnAcuitiesReport.setBounds(618, 254, 187, 30);
		defaultPanel.add(btnAcuitiesReport);

		btnCountReport = new JxLiquidButton();
		btnCountReport.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doCountReport();
			}
		});
		btnCountReport.setHorizontalAlignment(SwingConstants.CENTER);
		btnCountReport.setFont(new Font("", Font.PLAIN, 15));
		btnCountReport.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		btnCountReport.setBackground(BACK_COLOR);
		btnCountReport.setForeground(FONT_COLOR);
		btnCountReport.setArc(0.6f);
		btnCountReport
				.setBorder(new LineBorder(new Color(5, 65, 94), 1, false));
		btnCountReport.setText("Count Report");
		btnCountReport.setBounds(618, 290, 187, 30);
		btnCountReport.setVisible(true);
		defaultPanel.add(btnCountReport);

		btnResidentReport = new JxLiquidButton();
		btnResidentReport.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameChooseResident chooseResident = new FrameChooseResident();
				SwingUtils.center(chooseResident);
				chooseResident.setVisible(true);
			}
		});

		btnResidentReport.setHorizontalAlignment(SwingConstants.CENTER);
		btnResidentReport.setFont(new Font("", Font.PLAIN, 15));
		btnResidentReport.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		btnResidentReport.setBackground(BACK_COLOR);
		btnResidentReport.setForeground(FONT_COLOR);
		btnResidentReport.setArc(0.6f);
		btnResidentReport.setText("Resident Reports");
		btnResidentReport.setBounds(618, 326, 187, 30);
		defaultPanel.add(btnResidentReport);

		/*
		 * timer = new Timer(10000, new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { updateCountAudit(); } });
		 * timer.setInitialDelay(0); timer.setRepeats(true); timer.start();
		 */

		doUpdate();
	}

	private void doAcuitiesReports() {
		FrameADayReport f = new FrameADayReport("Acuities Report");
		SwingUtils.center(f);
		f.setVisible(true);
	}

	private void doChnageRoomReport() {
		FrameADayReport f = new FrameADayReport("Room History Report");
		SwingUtils.center(f);
		f.setVisible(true);
	}

	protected void doADayReport() {
		// FrameADayReport frame = (FrameADayReport)
		// FrameFactory.createWindowOfType(FrameADayReport.class);
		FrameADayReport frame = new FrameADayReport("Census Report");
		SwingUtils.center(frame);
		frame.setVisible(true);
	}

	protected void doADayReportFloorWise() {
		// FrameADayReport frame = (FrameADayReport)
		// FrameFactory.createWindowOfType(FrameADayReport.class);
		FrameADayReport frame = new FrameADayReport(
				"Census Report (Floor Wise)");
		SwingUtils.center(frame);
		frame.setVisible(true);
	}

	protected void doRoomHistoryReport() {
		FrameCensusReportDateChooser frameCensusDateChooser = new FrameCensusReportDateChooser(
				"Room History");
		SwingUtils.center(frameCensusDateChooser);
		frameCensusDateChooser.setVisible(true);
	}

	protected void doCountReport() {
		FrameCensusReportDateChooser frameCensusDateChooser = new FrameCensusReportDateChooser(
				"Count Report");
		SwingUtils.center(frameCensusDateChooser);
		frameCensusDateChooser.setVisible(true);
	}

	protected void doNext() {
		System.out.println("Override doNext() method");
	}

	@Override
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(new Color(32, 63, 84));
		g2.fillRect(0, getHeight() - 76, getWidth(), 76);
		super.paint(g);
	}

	public void doUpdate() {
		topTabArea.setSize(getWidth(), topTabArea.getHeight());
		topBlueStrip.setSize(getWidth(), topBlueStrip.getHeight());
		defaultPanel.setSize(getWidth(), getHeight() - defaultPanel.getY());
		panel_4.setLocation((defaultPanel.getWidth() - panel_4.getWidth()) / 2,
				panel_4.getY());
		panelResiInfo.setLocation((int) (defaultPanel.getWidth() * 0.98f)
				- panelResiInfo.getWidth(), panelResiInfo.getY());
		nextButton.setLocation((int) (defaultPanel.getWidth() * 0.98f)
				- panelResiInfo.getWidth(), nextButton.getY());
		btnCountAudit.setLocation((int) (defaultPanel.getWidth() * 0.98f)
				- panelResiInfo.getWidth(), btnCountAudit.getY());
		btnCensusHistoryReport.setLocation(
				(int) (defaultPanel.getWidth() * 0.98f)
						- panelResiInfo.getWidth(), btnCensusHistoryReport
						.getY());
		btnCensusHistoryChart.setLocation(
				(int) (defaultPanel.getWidth() * 0.98f)
						- panelResiInfo.getWidth(), btnCensusHistoryChart
						.getY());
		btnRoomHistoryReport
				.setLocation((int) (defaultPanel.getWidth() * 0.98f)
						- panelResiInfo.getWidth(), btnRoomHistoryReport.getY());
		btnADayReport.setLocation((int) (defaultPanel.getWidth() * 0.98f)
				- panelResiInfo.getWidth(), btnADayReport.getY());
		btnChangeRoomReport.setLocation((int) (defaultPanel.getWidth() * 0.98f)
				- panelResiInfo.getWidth(), btnChangeRoomReport.getY());
		btnAcuitiesReport.setLocation((int) (defaultPanel.getWidth() * 0.98f)
				- panelResiInfo.getWidth(), btnAcuitiesReport.getY());
		btnCountReport.setLocation((int) (defaultPanel.getWidth() * 0.98f)
				- panelResiInfo.getWidth(), btnCountReport.getY());
		btnResidentReport.setLocation((int) (defaultPanel.getWidth() * 0.98f)
				- panelResiInfo.getWidth(), btnResidentReport.getY());

		this.repaint();
		doLoad();
		doSearch();
		txtChooseResident.requestFocus();
	}

	private void insertCountAudit() {
		CountAuditStatus ref = new CountAuditStatus();
		ref.setTimestamp(MedrexClientManager.getServerTime());
		try {
			MedrexClientManager.getInstance().insertOrUpdateCountAuditStatus(
					ref);
		} catch (Exception e) {
			e.printStackTrace();
		}
		timer.stop();
		updateCountAudit();
	}

	private void updateCountAudit() {
		try {
			MedrexClientManager.getInstance().getCountAuditStatusOfToday();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// System.out.println(ref);
		// btnCountAudit.setEnabled(true);
		// if(ref != null) {
		// btnCountAudit.setEnabled(false);
		// System.out.println("here");
		// } else {
		btnCountAudit.setEnabled(false);
		Date date = Utils.getTimeStringToDate("11:55 PM");
		Date date2 = Utils.getTimeStringToDate("12:00 AM");
		date2.setDate(date2.getDate() + 1);
		Date currentD = MedrexClientManager.getServerTime();
		// System.out.println("here2:" + date);
		if (currentD.after(date)) {
			btnCountAudit.setEnabled(true);
			// System.out.println("here3");
		}
		// }
		if (btnCountAudit.isEnabled()) {
			btnCountAudit.setBackground(Color.WHITE);
		} else {
			btnCountAudit.setBackground(Color.GRAY);
		}
	}

	protected void doSearch() {
		List residents = new ArrayList();
		try {
			if (txtChooseResident != null) {
				if (!txtChooseResident.getText().equalsIgnoreCase("")) {
					residents = MedrexClientManager.getInstance().getResidents(
							txtChooseResident.getText(), "", "", "Active");
				} else {
					residents = MedrexClientManager.getInstance()
							.getResidentMain("Active");
				}
			} else {
				residents = MedrexClientManager.getInstance().getResidentMain(
						"Active");
			}
			residentList.setListData(residents.toArray());
		} catch (Exception e) {
		}
	}

	public ResidentMain getSelectedResident() {
		return (ResidentMain) residentList.getJListComponent()
				.getSelectedValue();
	}

	public void doLoad() {
		txtChooseResident.setText("");

	}
}
