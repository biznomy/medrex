package medrex.client.schedule;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterJob;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.schedule.ScheduleConstants.ScheduleMode;
import medrex.client.utils.ComponentPrintable;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.schedule.Schedule;
import medrex.commons.vo.schedule.UserSchedule;

import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;
import com.sX.swing.JxScrollPane;

public class PanelScheduleAdd extends PopUpView {

	private JLabel panelCNA;
	int selection = 0;
	private JLabel panelNurse;
	private JLabel panelStaff;
	/**
	 * 
	 */
	private static final long serialVersionUID = -1746303234172201567L;

	List<Users> currentNurseList = new ArrayList<Users>();
	public static List<Users> userList = new ArrayList<Users>();

	public static PanelUsersRow[] nurseRows;

	private HashMap<Integer, Users> IdOfTotalusers;
	private int count = 0;
	public static PanelTotalRowAccuties accuites;
	public static int id;
	public static Date fromDate;
	public static Date toDate;
	private GregorianCalendar cal;
	private int nurseTotal;
	private JxButton printButton;

	public static PanelTotals panelNurseTotal;
	public static PanelTotals panelCNATotal;
	public static PanelTotals panelStaffTotal;

	private PanelTotalRowAccuties panelTotalRowAccuties;
	private JPanel parentPanel;
	private JPanel contentPanel;
	private JxScrollPane scrollPane;

	PanelUsers panelNurses;
	PanelUsers panelCNAs;
	PanelUsers panelStaffs;

	JProgressBar pbar;
	static final int MY_MINIMUM = 0;
	static final int MY_MAXIMUM = 100;

	public static ScheduleMode scheduleMode;

	public static final int CELL_WIDTH = 35;
	public static final int CELL_HEIGHT = 25;
	public static final int LEFT_CELL_WIDTH = 120;
	public static final int LEFT_CELL_ToDYNAMIC_PANEL_WIDTH = 50;
	public static final int RIGHT_CELL_ToDYNAMIC_PANEL_WIDTH = 50;
	public static final Color WEEK1 = new Color(250, 235, 215);
	public static final Color WEEK2 = new Color(238, 232, 170);
	public static final Color WEEK3 = new Color(224, 255, 255);
	public static final Color WEEK4 = new Color(255, 228, 225);

	public static Color getBackgroundColor(int day) {
		if (day >= 0 && day <= 6) {
			return WEEK1;
		}
		if (day >= 7 && day <= 13) {
			return WEEK2;
		}
		if (day >= 14 && day <= 20) {
			return WEEK3;
		}
		if (day >= 21 && day <= 27) {
			return WEEK4;
		}
		return WEEK1;
	}

	@SuppressWarnings("unchecked")
	public PanelScheduleAdd(int id, int diff, final Date fromDate,
			final Date toDate, final ScheduleMode mode) {
		try {
			this.fromDate = fromDate;
			this.cal = new GregorianCalendar();
			this.cal.setTime(this.fromDate);
			this.id = id;
			this.toDate = toDate;
			this.scheduleMode = mode;

		} catch (Exception e) {
			System.out.println("date may not null");
		}
		setBounds(0, 0, 1200, 700);
		setLayout(null);
		updateUsersList();

		parentPanel = new JPanel();
		parentPanel.setLayout(null);
		parentPanel.setBackground(Color.WHITE);

		parentPanel.setBounds(0, 0, 1150, 600);
		add(parentPanel);

		if (this.scheduleMode != ScheduleMode.MASTER_SCHEDULE) {
			PanelFromDateToToDate panelFromDateToToDate = new PanelFromDateToToDate(
					fromDate, toDate);
			panelFromDateToToDate.setBackground(Color.WHITE);
			count++;
			panelFromDateToToDate.setBounds(332, 0, 768,
					PanelScheduleAdd.CELL_HEIGHT);
			parentPanel.add(panelFromDateToToDate);
		}

		PanelHeaderCount panelHeaderCount = new PanelHeaderCount(fromDate);
		panelHeaderCount.setBackground(Color.WHITE);
		count++;
		panelHeaderCount.setBounds(0, 50+PanelScheduleAdd.CELL_HEIGHT,
				PanelScheduleAdd.CELL_WIDTH * 30
						+ PanelScheduleAdd.LEFT_CELL_WIDTH,
				PanelScheduleAdd.CELL_HEIGHT);
		parentPanel.add(panelHeaderCount);

		PanelHeaderDays panelHeaderDays = new PanelHeaderDays();
		panelHeaderDays.setBackground(Color.WHITE);
		panelHeaderDays.setBounds(0, 50+PanelScheduleAdd.CELL_HEIGHT * (2),
				PanelScheduleAdd.CELL_WIDTH * 30
						+ PanelScheduleAdd.LEFT_CELL_WIDTH,
				PanelScheduleAdd.CELL_HEIGHT);
		parentPanel.add(panelHeaderDays);
		count++;
		
		scrollPane=new JxScrollPane();
		scrollPane.setBounds(0, 50+PanelScheduleAdd.CELL_HEIGHT * (3),
				PanelScheduleAdd.CELL_WIDTH * 29
						+ PanelScheduleAdd.LEFT_CELL_WIDTH,
				PanelScheduleAdd.CELL_HEIGHT *10);
		parentPanel.add(scrollPane);
		
		contentPanel = new JPanel();
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		scrollPane.setViewportView(contentPanel);
		//scrollPane.add(contentPanel);
		
		
	    /*contentPanel.setBounds(0, 50+PanelScheduleAdd.CELL_HEIGHT * (3),
				PanelScheduleAdd.CELL_WIDTH * 30
						+ PanelScheduleAdd.LEFT_CELL_WIDTH,
				PanelScheduleAdd.CELL_HEIGHT * 5);*/
		//scrollPane.add(contentPanel);
		
		

		IdOfTotalusers = new HashMap<Integer, Users>();

		IdOfTotalusers.keySet().iterator();

		int nurseStatheight = 18;


		panelNurseTotal = new PanelTotals(nurseTotal,"Nurse");
		panelNurseTotal.setBackground(Color.WHITE);
		panelNurseTotal.setBounds(0, 50+PanelScheduleAdd.CELL_HEIGHT
				* (nurseStatheight), PanelScheduleAdd.CELL_WIDTH * 28
				+ PanelScheduleAdd.LEFT_CELL_WIDTH,
				PanelScheduleAdd.CELL_HEIGHT);
		parentPanel.add(panelNurseTotal);
		count++;

		panelCNATotal = new PanelTotals(nurseTotal,"CNA");
		panelCNATotal.setBackground(Color.WHITE);
		panelCNATotal.setBounds(0, 50+PanelScheduleAdd.CELL_HEIGHT
				* (nurseStatheight+1), PanelScheduleAdd.CELL_WIDTH * 28
				+ PanelScheduleAdd.LEFT_CELL_WIDTH,
				PanelScheduleAdd.CELL_HEIGHT);
		parentPanel.add(panelCNATotal);
		count++;
		
		panelStaffTotal = new PanelTotals(nurseTotal,"Staff");
		panelStaffTotal.setBackground(Color.WHITE);
		panelStaffTotal.setBounds(0, 50+PanelScheduleAdd.CELL_HEIGHT
				* (nurseStatheight+2), PanelScheduleAdd.CELL_WIDTH * 28
				+ PanelScheduleAdd.LEFT_CELL_WIDTH,
				PanelScheduleAdd.CELL_HEIGHT);
		parentPanel.add(panelStaffTotal);
		count++;

		
		
		
		panelTotalRowAccuties = new PanelTotalRowAccuties(fromDate);
		panelTotalRowAccuties.setBackground(Color.WHITE);
		panelTotalRowAccuties.setBounds(0, 50+PanelScheduleAdd.CELL_HEIGHT
				* (nurseStatheight + 3), PanelScheduleAdd.CELL_WIDTH * 28
				+ PanelScheduleAdd.LEFT_CELL_WIDTH,
				PanelScheduleAdd.CELL_HEIGHT);
		parentPanel.add(panelTotalRowAccuties);
		
		if (this.scheduleMode != ScheduleMode.MASTER_SCHEDULE) {
			panelTotalRowAccuties.setVisible(true);
		}
		else{
			panelTotalRowAccuties.setVisible(false);
		}

		count++;

		JxButton btSave = new JxButton();
		btSave.setBounds(10, 0, 50, 22);
		btSave.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		btSave.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		btSave.setFont(new Font("Arial", Font.BOLD, 12));
		btSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				toDoSave();
				close();
			}

		});
		btSave.setText("Save");
		btSave.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btSave.setBounds(20, 3, 50, 22);

		parentPanel.add(btSave);

		printButton = new JxButton();
		printButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		printButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		printButton.setFont(new Font("Arial", Font.BOLD, 12));
		printButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				PanelScheduleAdd panelMasterScheduleMain = new PanelScheduleAdd(
						0, 0, fromDate, toDate, mode);
				JFrame fPrint = new JFrame();

				fPrint.setSize(50, 50);
				fPrint.setPreferredSize(fPrint.getSize());
				SwingUtils.center(fPrint);
				fPrint.setVisible(false);

				Book book = new Book();
				PrinterJob printJob = PrinterJob.getPrinterJob();
				PageFormat pageFormat = new PageFormat();
				Paper paper = new Paper();
				paper.setSize(1100.992125984252, 1000.8897637795276);
				paper.setImageableArea(36.0, 36.0, 522.99212598425197,
						769.8897637795276);
				pageFormat.setPaper(paper);
				pageFormat.setOrientation(PageFormat.PORTRAIT);
				printJob.defaultPage(pageFormat);
				printJob.setCopies(1);
				printJob.setPageable(book);
				fPrint.setVisible(true);
				fPrint.repaint();
				fPrint.setVisible(false);
				final ComponentPrintable cp = new ComponentPrintable(
						panelMasterScheduleMain);
				book.append(cp, pageFormat);
				try {
					printJob.print();
				} catch (Exception PrintException) {
					PrintException.printStackTrace();
				}
				fPrint.dispose();
			}
		});

		printButton.setActionCommand("Print");
		printButton.setText("Print");
		printButton.setBounds(92, 3, 50, 22);
		// parentPanel.add(printButton);

		parentPanel.setPreferredSize(new Dimension(PanelScheduleAdd.CELL_WIDTH
				* 28 + PanelScheduleAdd.LEFT_CELL_WIDTH + 50,
				(PanelScheduleAdd.CELL_HEIGHT) * count));

		panelCNA = new JLabel(new ImageIcon());
		panelCNA.addMouseListener(new MouseAdapter() {
			public void mouseClicked(final MouseEvent arg0) {
				doSelection(0);
			}

		});


		panelCNA.setBounds(92, 3, 70, 40);
		panelCNA.setOpaque(true);
		panelCNA.setBackground(Color.WHITE);
		parentPanel.add(panelCNA);

		panelNurse = new JLabel();

		panelNurse.setBounds(162, 3, 70, 40);
		panelNurse.setOpaque(true);
		panelNurse.setBackground(Color.WHITE);
		panelNurse.addMouseListener(new MouseAdapter() {
			public void mouseClicked(final MouseEvent arg0) {
				doSelection(1);
			}

		});
		
		parentPanel.add(panelNurse);
		
		panelStaff = new JLabel();

		panelStaff.setBounds(232, 3, 70, 40);
		panelStaff.setOpaque(true);
		panelStaff.setBackground(Color.WHITE);
		panelStaff.addMouseListener(new MouseAdapter() {
			public void mouseClicked(final MouseEvent arg0) {
				doSelection(2);
			}

		});


		parentPanel.add(panelStaff);
		
		panelNurses = new PanelUsers(new String[] { /*"RN",*/"Nurse"/*,"LPN"*/},panelNurseTotal);
		contentPanel.add(panelNurses);
		
		panelCNAs = new PanelUsers(new String[] {"CNA"},panelCNATotal);
		contentPanel.add(panelCNAs);
		
		panelStaffs = new PanelUsers(new String[] {"Manager"/*,"Administrator"*/},panelStaffTotal);
		contentPanel.add(panelStaffs);
		
		/*scrollPane.setBounds(0, 50+PanelScheduleAdd.CELL_HEIGHT * (3),
				PanelScheduleAdd.CELL_WIDTH * 30
						+ PanelScheduleAdd.LEFT_CELL_WIDTH,
				PanelScheduleAdd.CELL_HEIGHT *10);*/
		
		/*contentPanel.setPreferredSize(new Dimension(PanelScheduleAdd.CELL_WIDTH
				* 28 + PanelScheduleAdd.LEFT_CELL_WIDTH + 50,
				(PanelScheduleAdd.CELL_HEIGHT)*count));
		*/
		
		



		doSelection(0);
		doUpdate();
		setBackground(Color.WHITE);

	}

	public void doSelection(int select) {

		switch (select) {
		case 0:
			panelCNA.setIcon(new ImageIcon("img/schedule/CNA_high.png"));
			panelCNAs.setVisible(true);
			panelNurse.setIcon(new ImageIcon("img/schedule/Nurse.png"));
			panelNurses.setVisible(false);
			panelStaff.setIcon(new ImageIcon("img/schedule/Staff.png"));
			panelStaffs.setVisible(false);
			break;
		case 1:
			panelCNA.setIcon(new ImageIcon("img/schedule/CNA.png"));
			panelCNAs.setVisible(false);
			panelNurse.setIcon(new ImageIcon("img/schedule/Nurse_High.png"));
			panelNurses.setVisible(true);
			panelStaff.setIcon(new ImageIcon("img/schedule/Staff.png"));
			panelStaffs.setVisible(false);
			break;
		case 2:
			panelCNA.setIcon(new ImageIcon("img/schedule/CNA.png"));
			panelCNAs.setVisible(false);
			panelNurse.setIcon(new ImageIcon("img/schedule/Nurse.png"));
			panelNurses.setVisible(false);
			panelStaff.setIcon(new ImageIcon("img/schedule/Staff_High.png"));
			panelStaffs.setVisible(true);
			break;	
		default:
		}
	}
	
	public static	boolean flag=true;

	private void toDoSave() {
		
		
		
		panelNurses.toDoSave();	
		panelCNAs.toDoSave();
		panelStaffs.toDoSave();
		PanelUsers.scheduleSave();
		PanelUsers.schedule=new ArrayList<UserSchedule>();
		
	}

	public Date getDate(int date_of_month, Date fromDate) {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(fromDate);
		calendar.set(Calendar.DATE, date_of_month);
		return calendar.getTime();
	}

	private void updateUsersList() {
		try {
			// To get the List of total users from Users type
			// object................
			userList = MedrexClientManager.getInstance().getUsers();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void doUpdate() {
		
	    panelNurses.doUpdate();
		panelCNAs.doUpdate();
		panelStaffs.doUpdate();
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
