package medrex.client.dashBoard;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GradientPaint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import medrex.client.census.FrameADayReport;
import medrex.client.census.FrameCensusReportDateChooser;
import medrex.client.census.FrameCensusStatusHistoryReportChooser;
import medrex.client.census.FrameChooseResident;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.census.CensusStatus;

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

import com.sX.swing.JxButton;

public class PanelReports extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1439477342629699985L;
	private JLabel lblResidentReports;
	private JxButton panelResidentReports;
	private JLabel lblCountReport;
	private JxButton panelCountReport;
	private JLabel lblAcuitiesReport;
	private JxButton panelAcuitiesReport;
	private JLabel lblRoomChanges;
	private JxButton panelRoomChanges;
	private JLabel lblDailyCensus;
	private JxButton panelDailyCensus;
	private JLabel lblRoomHistory;
	private JxButton panelRoomHistory;
	private JLabel lblReports_2;
	private JLabel lblReports_1;
	private JLabel lblChart;
	private JxButton panelChart2;
	private FrameADayReport frameAcuitiesReport;
	protected ChartFrame frame1;

	public PanelReports() {
		super();
		FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 0, 30);
		// fl.setAlignment(FlowLayout.CENTER);
		setLayout(fl);
		setBackground(new Color(231, 239, 242));
		setPreferredSize(new Dimension(868, 592));
		// setPreferredSize(new Dimension(833, 435));

		final JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(231, 239, 242));
		panel.setPreferredSize(new Dimension(868, 592));
		// panel.setBounds(25, 50, 833, 435);
		add(panel);

		panelChart2 = new JxButton(3f);
		panelChart2.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
			}
		});
		panelChart2.setBounds(27, 0, 250, 100);
		panel.add(panelChart2);
		panelChart2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				FrameCensusStatusHistoryReportChooser frameCensusHistoryReportChooser = new FrameCensusStatusHistoryReportChooser();
				SwingUtils.center(frameCensusHistoryReportChooser);
				frameCensusHistoryReportChooser.setVisible(true);
			}
		});
		panelChart2.setBorder(new LineBorder(new Color(8, 68, 95), 2, false));
		panelChart2.setLayout(null);
		panelChart2.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		panelChart2.setBackground(Color.WHITE);

		lblChart = new JLabel(new ImageIcon("img\\report\\Report.png"));
		lblChart.setText("Reports");
		lblChart.setFont(GuiModes.DESIGNER_SCREEN.getControlFont().deriveFont(
				16f));
		lblChart.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		lblChart.setBounds(0, 0, 250, 100);
		panelChart2.add(lblChart);

		panelRoomHistory = new JxButton(3f);
		panelRoomHistory.setBounds(614, 0, 250, 100);
		panel.add(panelRoomHistory);
		panelRoomHistory.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				FrameCensusReportDateChooser frameCensusDateChooser = new FrameCensusReportDateChooser(
						"Room History");
				SwingUtils.center(frameCensusDateChooser);
				frameCensusDateChooser.setVisible(true);
			}
		});
		panelRoomHistory.setBackground(Color.WHITE);
		panelRoomHistory.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		panelRoomHistory.setLayout(null);

		lblRoomHistory = new JLabel(new ImageIcon("img\\nursingHomeAdmin.jpg"));
		lblRoomHistory.setText("Room History");
		lblRoomHistory.setFont(GuiModes.DESIGNER_SCREEN.getControlFont()
				.deriveFont(16f));
		lblRoomHistory.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		lblRoomHistory.setBounds(0, 0, 250, 100);
		panelRoomHistory.add(lblRoomHistory);

		panelChart2 = new JxButton(3f);
		panelChart2.setBounds(325, 0, 250, 100);
		panel.add(panelChart2);
		panelChart2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
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
				if (frame1 == null) {
					frame1 = new ChartFrame("Bar Chart", jfreechart);
					frame1.setVisible(true);
					frame1.setSize(800, 800);
					frame1.setDefaultCloseOperation(ChartFrame.HIDE_ON_CLOSE);
				} else {
					frame1.setVisible(true);
				}
			}
		});
		panelChart2.setBorder(new LineBorder(new Color(8, 68, 95), 2, false));
		panelChart2.setLayout(null);
		panelChart2.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		panelChart2.setBackground(Color.WHITE);

		lblChart = new JLabel(new ImageIcon("img\\report\\charts.png"));
		lblChart.setText("Charts");
		lblChart.setFont(GuiModes.DESIGNER_SCREEN.getControlFont().deriveFont(
				16f));
		lblChart.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		lblChart.setBounds(0, 0, 250, 100);
		panelChart2.add(lblChart);

		panelDailyCensus = new JxButton(3f);
		panelDailyCensus.setBounds(27, 130, 250, 100);
		panel.add(panelDailyCensus);
		panelDailyCensus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				FrameADayReport frame = new FrameADayReport("Census Report");
				SwingUtils.center(frame);
				frame.setVisible(true);
			}
		});
		panelDailyCensus.setBackground(Color.WHITE);
		panelDailyCensus.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		panelDailyCensus.setLayout(null);

		lblDailyCensus = new JLabel(new ImageIcon("img\\report\\Hospital.png"));
		lblDailyCensus.setFont(GuiModes.DESIGNER_SCREEN.getControlFont()
				.deriveFont(16f));
		lblDailyCensus.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		lblDailyCensus.setText("Daily Census");
		lblDailyCensus.setBounds(0, 0, 250, 100);
		panelDailyCensus.add(lblDailyCensus);

		panelRoomChanges = new JxButton(3f);
		panelRoomChanges.setBounds(614, 130, 250, 100);
		panel.add(panelRoomChanges);
		panelRoomChanges.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				FrameADayReport f = new FrameADayReport("Room History Report");
				SwingUtils.center(f);
				f.setVisible(true);
			}
		});
		panelRoomChanges.setBackground(Color.WHITE);
		panelRoomChanges.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		panelRoomChanges.setLayout(null);

		lblRoomChanges = new JLabel(new ImageIcon("img\\report\\RoomChanges.png"));
		lblRoomChanges.setFont(GuiModes.DESIGNER_SCREEN.getControlFont()
				.deriveFont(16f));
		lblRoomChanges.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		lblRoomChanges.setText("Room Changes");
		lblRoomChanges.setBounds(0, 0, 250, 100);
		panelRoomChanges.add(lblRoomChanges);

		panelAcuitiesReport = new JxButton(3f);
		panelAcuitiesReport.setBounds(27, 258, 250, 100);
		panel.add(panelAcuitiesReport);
		panelAcuitiesReport.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				frameAcuitiesReport = new FrameADayReport("Acuities Report");
				SwingUtils.center(frameAcuitiesReport);
				frameAcuitiesReport.setVisible(true);

			}
		});
		panelAcuitiesReport.setBackground(Color.WHITE);
		panelAcuitiesReport.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		panelAcuitiesReport.setLayout(null);

		lblAcuitiesReport = new JLabel(new ImageIcon("img\\report\\Notepad.png"));
		lblAcuitiesReport.setFont(GuiModes.DESIGNER_SCREEN.getControlFont()
				.deriveFont(16f));
		lblAcuitiesReport.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		lblAcuitiesReport.setText("Acuities Report");
		lblAcuitiesReport.setBounds(0, 0, 250, 100);
		panelAcuitiesReport.add(lblAcuitiesReport);

		panelCountReport = new JxButton(3f);
		panelCountReport.setBounds(325, 258, 250, 100);
		panel.add(panelCountReport);
		panelCountReport.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				FrameCensusReportDateChooser frameCensusDateChooser = new FrameCensusReportDateChooser(
						"Count Report");
				SwingUtils.center(frameCensusDateChooser);
				frameCensusDateChooser.setVisible(true);
			}
		});
		panelCountReport.setBackground(Color.WHITE);
		panelCountReport.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		panelCountReport.setBorder(new LineBorder(new Color(8, 68, 95), 2,
				false));
		panelCountReport.setLayout(null);

		lblCountReport = new JLabel(new ImageIcon("img\\report\\PieChart.png"));
		lblCountReport.setFont(GuiModes.DESIGNER_SCREEN.getControlFont()
				.deriveFont(16f));
		lblCountReport.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		lblCountReport.setText("Count Report");
		lblCountReport.setBounds(0, 0, 250, 100);
		panelCountReport.add(lblCountReport);

		panelResidentReports = new JxButton(3f);
		panelResidentReports.setBounds(614, 258, 250, 100);
		panel.add(panelResidentReports);
		panelResidentReports.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				FrameChooseResident chooseResident = new FrameChooseResident();
				SwingUtils.center(chooseResident);
				chooseResident.setVisible(true);
			}
		});
		panelResidentReports.setBackground(Color.WHITE);
		panelResidentReports.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		panelResidentReports.setBorder(new LineBorder(new Color(8, 68, 95), 2,
				false));
		panelResidentReports.setLayout(null);

		lblResidentReports = new JLabel(new ImageIcon("img/report/Residents.png"));
		lblResidentReports.setFont(GuiModes.DESIGNER_SCREEN.getControlFont()
				.deriveFont(16f));
		lblResidentReports.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		lblResidentReports.setText("Resident Reports");
		lblResidentReports.setBounds(0, 0, 250, 100);
		panelResidentReports.add(lblResidentReports);

	}

	public static void main(String args[]) {
		SwingUtils.wrapInFrame(new PanelReports()).setVisible(true);
	}

}
