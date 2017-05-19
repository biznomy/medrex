package medrex.client.accurities;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.GregorianCalendar;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import medrex.client.FrameLogin;
import medrex.client.admin.userLogon.ControllerUserLogon;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.loading.FrameLoading;
import medrex.client.utils.controls.TouchscreenList;
import medrex.commons.enums.GuiModes;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxPanel;
import com.sX.swing.calender.JCalendar;
import com.toedter.calendar.JDateChooser;

public class PanelAccuritiesMain extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6744323063219259566L;
	private JDateChooser toDate;
	private JDateChooser fromDate;
	private JLabel accuritiesLabel;

	private JxPanel panel;

	private JPanel topTabArea;

	private JPanel topTabsPanel;

	private JPanel topBlueStrip;

	private JPanel defaultPanel;

	private AccutiesListCell accutiesListCell;

	private TouchscreenList accList;
	// private List list = null;
	private JCalendar calendar;
	private FrameLoading fl;

	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);

	public PanelAccuritiesMain() {
		super();
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doResize();
				}
			}
		});

		Global.setPanelId = 0;
		setLayout(null);
		setPreferredSize(new Dimension(868, 768));
		// setPreferredSize(new Dimension(868, 800));

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

		final JLabel lastLoginLabel = new JLabel();
		lastLoginLabel.setForeground(Color.WHITE);
		lastLoginLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont()
				.deriveFont(16));
		lastLoginLabel.setBorder(new EmptyBorder(0, 100, 0, 0));
		lastLoginLabel.setText("<html><b>Welcome </b>"
				+ Global.currentUserLastName + ", "
				+ Global.currentUserFirstName);
		topBlueStrip.add(lastLoginLabel);

		final JLabel logLabel = new JLabel();
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
		logLabel.setText("Log off  ");
		topBlueStrip.add(logLabel);

		defaultPanel = new JPanel();
		// defaultPanel.setBorder(new LineBorder(Color.black, 1, false));
		defaultPanel.setOpaque(false);
		defaultPanel.setLayout(null);
		defaultPanel.setBounds(0, 182, 868, 576);
		add(defaultPanel);

		panel = new JxPanel();
		panel.setLayout(null);
		panel.setBounds(10, 59, 791, 486);
		defaultPanel.add(panel);
		panel.setArc(1f);
		panel.setBorder(new LineBorder(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor(), 1, false));
		panel.setBackground(Color.WHITE);
		// panel.setPreferredSize(new Dimension(750, 434));

		fl = new FrameLoading("Loading");
		fl.setTitle("Loading Acuities Details");
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				fl.callNotify();
			}
		});

		calendar = new JCalendar() {
			@Override
			public JComponent getComponentAt(final int date) {
				if (calendar != null) {
					GregorianCalendar cal = new GregorianCalendar(calendar
							.getCurrentYear(), calendar.getCurrentMonth(), date);
					// return new PanelDietryView(cal.getTime());
					return new AccutiesView(cal.getTime());
				}
				return super.getComponentAt(date);
			}

			public void tempUpdate() {
				// System.out.println("calling Update Data");
				super.updateValues();
			}

			@Override
			public void updateValues() {
				if (initialized == true) {
					new Thread(new Runnable() {
						public void run() {
							tempUpdate();
							fl.dispose();
						}
					}).start();
					fl.setVisible(true);
					fl.setTitle("Loading Acuities Details");
				} else {
					tempUpdate();
				}
			}
		};
		calendar.setBounds(34, 60, 733, 409);
		calendar.setMaximumDate(MedrexClientManager.getServerTime());
		panel.add(calendar);
		calendar.setOpaque(false);
		calendar.setHorizontalAndVerticalGap(3, 3);

		accuritiesLabel = new JLabel();
		accuritiesLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		accuritiesLabel.setBackground(Color.WHITE);
		accuritiesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		accuritiesLabel.setFont(new Font("Dialog", Font.PLAIN, 28));
		accuritiesLabel.setText("Acuities");
		accuritiesLabel.setBounds(293, 29, 200, 25);
		panel.add(accuritiesLabel);

		final JLabel tickLabel = new JLabel();
		tickLabel.setIcon(new ImageIcon("img/tick.jpg"));
		tickLabel.setBounds(571, 23, 23, 16);
		panel.add(tickLabel);

		final JLabel doneLabel = new JLabel();
		doneLabel.setForeground(SystemColor.desktop);
		doneLabel.setText("Done");
		doneLabel.setBackground(Color.WHITE);
		doneLabel.setFont(new Font("", Font.BOLD, 12));
		doneLabel.setBounds(600, 23, 66, 16);
		panel.add(doneLabel);

		final JLabel crossLabel = new JLabel();
		crossLabel.setIcon(new ImageIcon("img/cross.jpg"));
		crossLabel.setBounds(672, 23, 23, 16);
		panel.add(crossLabel);

		final JLabel pendingLabel = new JLabel();
		pendingLabel.setForeground(SystemColor.desktop);
		pendingLabel.setText("Pending");
		pendingLabel.setBackground(Color.WHITE);
		pendingLabel.setFont(new Font("", Font.BOLD, 12));
		pendingLabel.setBounds(701, 23, 66, 16);
		panel.add(pendingLabel);

		// int x = 0, y = 0, y1 = 0;
		// DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		// Date date = null;
		// try {
		// Calendar cal = Calendar.getInstance();
		// cal.add(Calendar.DATE, -7);
		// Date tempdate = cal.getTime();
		// String strDate = df.format(tempdate);
		// date = df.parse(strDate);
		// } catch (ParseException e) {
		// e.printStackTrace();
		// }
		// Date currdate = MedrexClientManager.getServerTime();
		// int numOfList = Utils.DateDifference(currdate, date);
		// for(int i = 0; i < numOfList+1; i++) {
		// y = y + 60;
		// }
		// for(int i = 0; i < numOfList+1; i++) {
		// y = y - 60;
		// accutiesListCell = new AccutiesListCell(date);
		// accutiesListCell.setBounds(x, y, 610, 50);
		// // cellPanel.add(accutiesListCell);
		// y1 = y1 + 60;
		// date.setDate(date.getDate()+1);
		// }

		// final JLabel filterByDateLabel = new JLabel();
		// filterByDateLabel.setForeground(SystemColor.desktop);
		// filterByDateLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		// filterByDateLabel.setText("From");
		// filterByDateLabel.setBounds(10, 35, 48, 16);
		// panel.add(filterByDateLabel);
		//		
		// fromDate = new JDateChooser();
		// fromDate.setMaxSelectableDate(MedrexClientManager.getServerTime());
		// fromDate.setDateFormatString("MM/dd/yyyy");
		// fromDate.setDate(MedrexClientManager.getServerTime());
		// fromDate.setForeground(ColorConstants.DEF_COLOR);
		// fromDate.setFont(new Font("Tahoma", Font.PLAIN, 10));
		// fromDate.setBounds(45, 30, 79, 22);
		// panel.add(fromDate);
		//		
		// toDate = new JDateChooser();
		// toDate.setMaxSelectableDate(MedrexClientManager.getServerTime());
		// toDate.setDateFormatString("MM/dd/yyyy");
		// toDate.setDate(MedrexClientManager.getServerTime());
		// toDate.setForeground(ColorConstants.DEF_COLOR);
		// toDate.setFont(new Font("Tahoma", Font.PLAIN, 10));
		// toDate.setBounds(159, 30, 79, 22);
		// panel.add(toDate);
		//
		// final JLabel toLabel = new JLabel();
		// toLabel.setForeground(SystemColor.desktop);
		// toLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		// toLabel.setText("To");
		// toLabel.setBounds(130, 35, 23, 16);
		// panel.add(toLabel);
		//
		// final JxButton filterButton = new JxButton(0.4f);
		// filterButton.addActionListener(new ActionListener() {
		// public void actionPerformed(final ActionEvent e) {
		// doFilter();
		// }
		// });
		// filterButton.setBackground(Color.WHITE);
		// filterButton.setForeground(DEF_COL);
		// filterButton.setFont(new Font("", Font.BOLD, 12));
		// filterButton.setText("Filter");
		// filterButton.setBounds(256, 30, 61, 22);
		// panel.add(filterButton);

	}

	/*
	 * private void doFilter() { // int x = 0, y = 0, y1 = 0; DateFormat df =
	 * new SimpleDateFormat("MM/dd/yyyy"); Date date = null; Date currdate =
	 * MedrexClientManager.getServerTime(); Date tempfromdate =
	 * fromDate.getDate(); Date temToDate = toDate.getDate(); String strFromDate
	 * = df.format(tempfromdate); String strToDate = df.format(temToDate); try {
	 * date = df.parse(strFromDate); currdate = df.parse(strToDate); } catch
	 * (ParseException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } // calendar.setMinimumDate(date); //
	 * calendar.setMaximumDate(currdate); // int numOfList =
	 * Utils.DateDifference(currdate, date); // for(int i = 0; i < numOfList+1;
	 * i++) { // y = y + 60; // } // cellPanel.removeAll(); // for(int i = 0; i
	 * < numOfList+1; i++) { // y = y - 60; // accutiesListCell = new
	 * AccutiesListCell(date); // accutiesListCell.setBounds(x, y, 610, 50); //
	 * cellPanel.add(accutiesListCell); // y1 = y1 + 60; //
	 * date.setDate(date.getDate()+1); // } // cellPanel.setPreferredSize(new
	 * Dimension(610, y1)); // scrollPane.setViewportView(cellPanel); }
	 */

	/*
	 * private void fillList() {
	 * 
	 * try{ list = MedrexClientManager.getInstance().getAccutiesDate();
	 * }catch(Exception ex){ } }
	 */

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(new Color(32, 63, 84));
		g2.fillRect(0, getHeight() - 76, getWidth(), 76);
	}

	public void doResize() {
		topTabArea.setSize(getWidth(), topTabArea.getHeight());
		topBlueStrip.setSize(getWidth(), topBlueStrip.getHeight());
		defaultPanel.setSize(getWidth(), getHeight() - defaultPanel.getY());
		panel.setLocation((defaultPanel.getWidth() - panel.getWidth()) / 2,
				(defaultPanel.getHeight() - panel.getHeight() - 36) / 2);
		this.repaint();
	}
}
