package medrex.client.dietary;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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
import medrex.commons.enums.GuiModes;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxPanel;
import com.sX.swing.calender.JCalendar;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;

public class PanelDietaryMain extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1157271599143028798L;

	private JLabel accuritiesLabel;

	private JxPanel panel;

	private JPanel topTabArea;

	private JPanel topTabsPanel;

	private JPanel topBlueStrip;

	private JPanel defaultPanel;

	private PanelDietaryListCell listCell;
	// private JCalendar listCell;
	private JCalendar calendar;

	private JMonthChooser dietMonth;
	private JYearChooser dietYear;
	private int month = 0;
	private int year = 0;

	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);

	public PanelDietaryMain() {
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
		/*
		 * lastLoginLabel.setText("<html><b>Welcome </b>" +
		 * Global.currentUserLastName + ", " + Global.currentUserFirstName);
		 */
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
		defaultPanel.setBackground(Color.WHITE);
		defaultPanel.setBorder(new EmptyBorder(20, 0, 0, 10));
		defaultPanel.setOpaque(false);
		defaultPanel.setLayout(null);
		defaultPanel.setBounds(0, 176, 868, 592);
		add(defaultPanel);

		panel = new JxPanel();
		panel.setArc(1f);
		panel.setBorder(new LineBorder(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor(), 1, false));
		panel.setBounds(50, 31, 808, 443);
		panel.setBackground(Color.WHITE);
		panel.setPreferredSize(new Dimension(750, 434));
		panel.setLayout(null);
		defaultPanel.add(panel);

		accuritiesLabel = new JLabel();
		accuritiesLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		accuritiesLabel.setBackground(Color.WHITE);
		accuritiesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		accuritiesLabel.setFont(new Font("Dialog", Font.PLAIN, 28));
		accuritiesLabel.setText("DIETARY");
		accuritiesLabel.setBounds(57, 10, 702, 22);
		panel.add(accuritiesLabel);

		calendar = new JCalendar() {
			@Override
			public JComponent getComponentAt(final int date) {
				// System.out.println("calendar="+calendar);
				if (calendar != null) {
					GregorianCalendar cal = new GregorianCalendar(calendar
							.getCurrentYear(), calendar.getCurrentMonth(), date);
					// System.out.println("Returning Dietry View");
					return new PanelDietryView(cal.getTime());
				}
				return super.getComponentAt(date);
			}
		};
		calendar.updateValues();
		calendar.setBounds(39, 24, 733, 409);
		panel.add(calendar);
		calendar.setOpaque(false);
		// calendar.setMinimumDate(new GregorianCalendar(2009, 11,
		// 5).getTime());
		calendar.setHorizontalAndVerticalGap(3, 3);
		calendar.setMaximumDate(MedrexClientManager.getServerTime());

		// final JLabel dateLabel = new JLabel();
		// dateLabel.setForeground(GuiModes.DESIGNER_FORMS
		// .getControlForegroundColor());
		// dateLabel.setBackground(Color.WHITE);
		// dateLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		// dateLabel.setText("Month: ");
		// dateLabel.setBounds(38, 50, 58, 30);
		// panel.add(dateLabel);

		// dietMonth = new JMonthChooser();
		// dietMonth.addPropertyChangeListener(new PropertyChangeListener() {
		// public void propertyChange(final PropertyChangeEvent evt) {
		// doMonth();
		// doUpdateDietListCell();
		// }
		// });
		// dietMonth.setBackground(Color.WHITE);
		// dietMonth.setForeground(DEF_COL);
		// dietMonth.setFont(new Font("Tahoma", Font.BOLD, 12));
		// dietMonth.setBounds(80, 57, 115, 30);
		// panel.add(dietMonth);

		// dietYear = new JYearChooser();
		// dietYear.addPropertyChangeListener(new PropertyChangeListener() {
		// public void propertyChange(final PropertyChangeEvent evt) {
		// doYear();
		// doUpdateDietListCell();
		// }
		// });
		// dietYear.setBackground(Color.WHITE);
		// dietYear.setForeground(DEF_COL);
		// dietYear.setFont(new Font("Tahoma", Font.BOLD, 12));
		// dietYear.setBounds(225, 59, 75, 30);
		// panel.add(dietYear);

		// final JLabel label = new JLabel();
		// label.setForeground(GuiModes.DESIGNER_FORMS
		// .getControlForegroundColor());
		// label.setBackground(Color.WHITE);
		// label.setFont(new Font("Dialog", Font.BOLD, 12));
		// label.setText("Year:");
		// label.setBounds(195, 55, 34, 23);
		// panel.add(label);
		// doUpdateDietListCell();

	}

	// public void displayValues(){
	// SimpleDateFormat df = new SimpleDateFormat("MMMM dd, yyyy");
	// int year = calendar.getCurrentYear();
	// int month = calendar.getCurrentMonth();
	// String str = df.format(new GregorianCalendar(year, month,
	// date).getTime());
	// // System.out.println(str);
	// SwingUtils.openInDialog(new PanelViewDiet(str));
	// doUpdateDietInfo(new Date(str));
	// }
	private void doMonth() {
		month = dietMonth.getMonth();
	}

	private void doYear() {
		year = dietYear.getYear();
	}

	private void doUpdateDietListCell() {
		Calendar calendar = Calendar.getInstance();
		int day = 1;
		calendar.set(year, month, day);
		int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

		int x = 0, y = 0, y1 = 0;
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		Date date = null;
		try {
			date = df.parse((month + 1) + "/01" + "/" + year);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < maxDay; i++) {
			y = y + 60;
		}
		for (int i = 0; i <= maxDay; i++) {
			y = y - 60;
			listCell = new PanelDietaryListCell(date);
			// listCell=new JCalendar();
			listCell.setBounds(x, y, 610, 60);
			// cellPanel.add(listCell);
			y1 = y1 + 60;
			date.setDate(date.getDate() + 1);
		}
	}

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
				(defaultPanel.getHeight() - panel.getHeight() - 76) / 2);
		this.repaint();
	}

}
