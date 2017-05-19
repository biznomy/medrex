package medrex.client.schedule;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import medrex.client.FrameLogin;
import medrex.client.admin.userLogon.ControllerUserLogon;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.schedule.ScheduleConstants.ScheduleMode;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.schedule.Schedule;
import medrex.commons.vo.schedule.UserSchedule;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;
import com.sX.swing.ProgressBar;
import com.sX.swing.ProgressBar.Task;
import com.toedter.calendar.JDateChooser;

public class PanelScheduleMain extends PopUpView {

	private JxButton btnMasterSchedule;
	private static JDateChooser dcToDate;
	private static JDateChooser dcFromDate;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JScrollPane scrollPane;
	private JxPanel panel;
	private JPanel topTabArea;
	private JPanel topTabsPanel;
	private JLabel lblTopTabs;
	private JPanel topBlueStrip;
	private JPanel defaultPanel;
	private static final Color DEF_COLOR = new Color(49, 104, 127);
	private boolean isNew;
	private static final long MILLSECS_PER_DAY = 24 * 60 * 60 * 1000;
	private JxTable table;
	private static PanelScheduleTableModel tableModel;
	private Date toDate;
	private Date fromDate;
	private int dateDifference = 28;
	private GregorianCalendar cal;

	/**
	 * Create the panel
	 */
	public PanelScheduleMain() {
		super();

		tableModel = new PanelScheduleTableModel();
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doResize();
				}
			}
		});
		Global.setPanelId = 1;
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
		logLabel.setText("Log off ");
		topBlueStrip.add(logLabel);

		defaultPanel = new JPanel();
		defaultPanel.setBorder(new EmptyBorder(20, 0, 0, 10));
		defaultPanel.setOpaque(false);
		defaultPanel.setLayout(null);
		defaultPanel.setBounds(0, 176, 868, 592);
		add(defaultPanel);

		panel = new JxPanel();
		panel.setArc(1f);
		panel.setBorder(new LineBorder(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor(), 1, false));
		panel.setBounds(115, 0, 750, 434);
		panel.setBackground(Color.WHITE);
		panel.setPreferredSize(new Dimension(750, 434));
		panel.setLayout(null);
		defaultPanel.add(panel);

		scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBounds(24, 75, 702, 285);
		panel.add(scrollPane);

		table = new JxTable();

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (e.getClickCount() == 2) {
					ScheduleConstants.mode=ScheduleMode.USER_SCHEDULE;
					
					int rowIndex = table.getSelectedRow();

					if (rowIndex >= 0) {
						int serial = (Integer) tableModel.getValueAt(rowIndex,
								2);
						Date from = (Date) tableModel.getValueAt(rowIndex, 3);
						Date to = (Date) tableModel.getValueAt(rowIndex, 4);
						// dateDifference = DateDifference(to, from);
						if (from != null) {

							PanelScheduleAdd panelUsersAdd = new PanelScheduleAdd(
									serial, dateDifference, from, to,ScheduleConstants.mode);
							SwingUtils.openInDialog(panelUsersAdd);

						} else {
							Frame f = new Frame();
							f.setSize(200, 200);
							f.isVisible();
							JOptionPane.showMessageDialog(f,
									"Error to reterive from date......");

						}
						updateTable();

					}
				}
			}
		});
		table.setModel(tableModel);
		scrollPane.setViewportView(table);

		scrollPane.setViewportView(table);
		table.setModel(tableModel);

		this.cal = new GregorianCalendar();
		// this.cal.setTime(this.fromDate);
		final JxButton btnAdd = new JxButton(0.4f);
		btnAdd.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(final ActionEvent e) {
				openSchedule();
			}
		});

		btnAdd.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnAdd.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnAdd.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnAdd.setFont(new Font("", Font.BOLD, 12));

		btnAdd.setText("Add New");
		btnAdd.setBounds(24, 366, 84, 26);
		panel.add(btnAdd);
		final JxButton btnView = new JxButton(0.4f);
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				ScheduleConstants.mode=ScheduleMode.USER_SCHEDULE;
				int rowIndex = table.getSelectedRow();

				if (rowIndex >= 0) {
					int serial = (Integer) tableModel.getValueAt(rowIndex, 2);
					Date from = (Date) tableModel.getValueAt(rowIndex, 3);
					Date to = (Date) tableModel.getValueAt(rowIndex, 4);
					// dateDifference = DateDifference(to, from);
					if (from != null) {

						PanelScheduleAdd panelUsersAdd = new PanelScheduleAdd(
								serial, dateDifference, from, to,ScheduleConstants.mode);
						SwingUtils.openInDialog(panelUsersAdd);

					} else {
						Frame f = new Frame();
						f.setSize(200, 200);
						f.isVisible();
						JOptionPane.showMessageDialog(f,
								"Error to reterive from date......");

					}
					updateTable();

				}

			}
		});
		btnView.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnView.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnView.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());

		btnView.setFont(new Font("", Font.BOLD, 12));
		btnView.setText("View / Update");
		btnView.setBounds(418, 366, 84, 26);
		panel.add(btnView);

		final JxButton btnDelete = new JxButton(0.4f);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {

				int rowIndex = table.getSelectedRow();
				if (rowIndex >= 0) {
					int serial = (Integer) tableModel.getValueAt(rowIndex, 2);
					doDelete(serial);
					updateTable();
				} else {
					Frame f = new Frame();
					f.setSize(200, 200);
					f.isVisible();
					JOptionPane.showMessageDialog(f,
							"Please select any row ......");
				}
			}
		});

		btnDelete.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnDelete.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnDelete.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());

		btnDelete.setFont(new Font("", Font.BOLD, 12));
		btnDelete.setText("Delete");
		btnDelete.setBounds(545, 365, 84, 26);
		panel.add(btnDelete);

		final JxButton btnCancel = new JxButton(0.4f);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				// close();
			}
		});
		btnCancel.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnCancel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnCancel.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.setText("Cancel");
		btnCancel.setBounds(642, 366, 84, 26);
		panel.add(btnCancel);

		final JLabel usersInformationLabel = new JLabel();
		usersInformationLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		usersInformationLabel.setBackground(Color.WHITE);
		usersInformationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		usersInformationLabel.setFont(new Font("Dialog", Font.PLAIN, 28));
		usersInformationLabel.setText("SCHEDULE");
		usersInformationLabel.setBounds(24, 22, 702, 30);
		panel.add(usersInformationLabel);

		final JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setLayout(null);
		panel_1.setBounds(114, 366, 170, 26);
		panel.add(panel_1);

		final JLabel fromLabel = new JLabel();
		fromLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		fromLabel.setForeground(new Color(49, 104, 127));
		fromLabel.setBounds(2, 0, 35, 26);
		fromLabel.setText("From");
		panel_1.add(fromLabel);

		dcFromDate = new JDateChooser();
		dcFromDate.setDateFormatString("MM/dd/yyyy");
		dcFromDate.setBounds(32, 1, 122, 26);
		panel_1.add(dcFromDate);

		btnMasterSchedule = new JxButton();
		btnMasterSchedule.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnMasterSchedule.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnMasterSchedule.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnMasterSchedule.setFont(new Font("", Font.BOLD, 12));
		btnMasterSchedule.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				ScheduleConstants.mode=ScheduleMode.MASTER_SCHEDULE;
                System.out.println("ScheduleConstants.mode==="+ScheduleConstants.mode);
				/*PanelScheduleAdd(0,
						dateDifference, fromDate, toDate)*/
				
				Date fromDate=new Date(01/01/1970);
				Date toDate=new Date(01/01/1970);
				
				
				PanelScheduleAdd panelUsersAdd = new PanelScheduleAdd(
						0, dateDifference, fromDate, toDate,ScheduleConstants.mode);
				SwingUtils.openInDialog(panelUsersAdd);
				
				
				
			}
		});
		btnMasterSchedule.setText("Master Schedule");
		btnMasterSchedule.setBounds(24, 396, 113, 26);
		panel.add(btnMasterSchedule);

		/*
		 * final JLabel fromLabel_2 = new JLabel(); fromLabel_2.setFont(new
		 * Font("Dialog", Font.BOLD, 12)); fromLabel_2.setForeground(new
		 * Color(49, 104, 127)); fromLabel_2.setText("To");
		 * fromLabel_2.setBounds(157, 0, 24, 26); panel_1.add(fromLabel_2);
		 */

		new Schedule();
		updateTable();
	}

	private void openSchedule() {
		ScheduleConstants.mode=ScheduleMode.USER_SCHEDULE;
		
		fromDate = dcFromDate.getDate();
		// dateDifference = DateDifference(toDate, fromDate);
		if (fromDate != null) {
			cal.setTime(fromDate);
			// cal.set(Calendar.DATE,
			// Integer.parseInt(columns[i].txtDate.getText()));
			cal.set(Calendar.DATE, fromDate.getDate());
			cal.get(Calendar.WEEK_OF_MONTH);
			int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

			/*
			 * List<Schedule> ourRecords = new ArrayList<Schedule>();
			 * ourRecords=tableModel.getRecords(); for(Schedule
			 * record:ourRecords){ Date from=record.getFromDate();
			 * cal.setTime(fromDate); cal.add(Calendar.DATE, 29); Date
			 * beforedate=cal.getTime(); //cal.add(Calendar.DATE, -29);
			 * if(from.after(beforedate) ) {
			 * 
			 * }
			 * 
			 * }
			 */

			if (dayOfWeek == 1) {
				List<Schedule> ourRecords = new ArrayList<Schedule>();
				ourRecords = tableModel.getRecords();
				boolean flag = true;
				for (Schedule record : ourRecords) {
					Date from = record.getFromDate();
					Date to = record.getToDate();
					cal.setTime(from);
					cal.add(Calendar.DATE, -29);
					Date fromless28 = cal.getTime();
					// cal.add(Calendar.DATE, -29);
					if (fromDate.before(fromless28) || fromDate.after(to)) {

						flag = true;

					} else {
						flag = false;
						break;
					}

				}
				cal.setTime(fromDate);
				cal.add(Calendar.DATE, 27);
				toDate = cal.getTime();
				if (flag == true) {
					ProgressBar bar = new ProgressBar(
							new Task<PanelScheduleAdd>() {
								@Override
								protected PanelScheduleAdd doInBackground()
										throws Exception {
									return new PanelScheduleAdd(0,
											dateDifference, fromDate, toDate,ScheduleConstants.mode);
								}
							}, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									final PanelScheduleAdd panelUsersAdd = (PanelScheduleAdd) e
											.getSource();
									SwingUtils.openInDialog(panelUsersAdd);
									updateTable();
								}
							});
					bar.execute();
				} else {
					JOptionPane.showMessageDialog(null,
							"Date schedule already exists");
				}

			} else {
				JOptionPane.showMessageDialog(null,
						"select the sunday date......");
			}
		} else {

			JOptionPane.showMessageDialog(null, "select from Date......");

		}
	}

	private void doDelete(int scheduleSerial) {
		try {
			// ScheduleDAO.getInstance().deleteScheduleRecord(scheduleSerial);
			MedrexClientManager.getInstance().deleteScheduleRecord(
					scheduleSerial);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * public int DateDifference(Date afterDate, Date beforeDate) { int getDate
	 * = 0;
	 * 
	 * try { getDate = (int) ((afterDate.getTime() - beforeDate.getTime()) /
	 * MILLSECS_PER_DAY); ; } catch (Exception e) { return (-1); }
	 * 
	 * return getDate; }
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
				(defaultPanel.getHeight() - panel.getHeight() - 76) / 2);
		this.repaint();
	}

	public void updateTable() {

		List<Schedule> ourRecords = new ArrayList<Schedule>();
		try {
			
			ourRecords = MedrexClientManager.getInstance().getScheduleRecords();
			
//			System.out.println("ourRecords.get(0).getSerial()==="+ourRecords.get(0).getSerial());

		} catch (MedrexException e) {

			e.printStackTrace();
		}
		


		if (ourRecords != null  /*&& ourRecords.get(0).getSerial()!=1*/) {
			tableModel.setRecords(ourRecords);
			tableModel.fireTableDataChanged();

			tableModel.fireTableStructureChanged();
		}
		
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

}
