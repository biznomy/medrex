package medrex.client.schedule;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import medrex.client.schedule.ScheduleConstants.ScheduleMode;
import medrex.commons.intf.Form;
import medrex.commons.intf.PopUpView;

import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;
import com.sX.swing.JxRadioButton;
import com.sX.swing.JxScrollPane;
import com.sX.swing.JxText;
import com.sX.theme.BlueOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelShifts extends PopUpView {
	private JTextField textField;
	private JxRadioButton rbAvailableNight;
	private JxRadioButton rbAvailableEvening;
	private JxRadioButton rbAvailableDay;
	private JxPanel panelAvailable;
	private JxRadioButton rbAvailable;
	/**
	 * 
	 */
	private static final long serialVersionUID = -7902811134420758150L;
	private JxRadioButton rbNoCallNoShow;
	private JxRadioButton rbCallOut;
	private JxRadioButton rbBereauementDay;
	private JxRadioButton rbJuryDate;
	private JxButton btnDelete;
	private JxButton btnCancelMain;
	public  JxButton btnSave;
	private JxRadioButton rbSocial;
	private JxRadioButton rbPersonal;
	private JxRadioButton rbBirthday;
	private JxRadioButton rbVacation;
	private JxButton btnReset;
	private JxButton btnAdd;
	private JxRadioButton rbSouth;
	private JxRadioButton rbNorth;
	private JxRadioButton rbSecondFloor;
	private JxRadioButton rbFirstFloor;
	private JxRadioButton rbNight;
	private JxRadioButton rbEvening;
	private JxRadioButton rbDay;
	public static JxRadioButton rbNotAvailable;
	public static JxRadioButton rbScheduled;
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);
	private ButtonGroup bgCheckAvaility = new ButtonGroup();
	private ButtonGroup bgDecideTime;
	private ButtonGroup bgDecideFloor;
	private ButtonGroup bgDecideDirection;
	private ButtonGroup bgLeaveType;
	private ButtonGroup bgAvailibility = new ButtonGroup();

	private JList list;
	private JxPanel jxPanel;
	private JxPanel panelLeave;
	private JxPanel panelScheduled;
	private ActionListener action;
	// private String txtValue;
	public  String getShift = "";
	public String listFirstValue = "";
	public String listSecondValue = "";
	public static String[] listValues;
	private JxPanel panelLeave2;

	public PanelShifts(String listFirstValu, String listSecondValu) {
		super();
		// action=new ActionListener():
		Theme theme = new BlueOverWhiteTheme();
		this.listFirstValue = listFirstValu;
		this.listSecondValue = listSecondValu;
		setSize(845, 469);
		setPreferredSize(new Dimension(getSize()));
		System.out.println("getSize()::" + getSize());

		setBorder(new LineBorder(DEF_COL, 1, false));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);

		panel.setLayout(null);
		panel.setBounds(0, 0, 843, 469);
		add(panel);
		panel.setPreferredSize(getSize());

		final JxPanel panel_1 = new JxPanel();
		panel_1.setLayout(new FlowLayout());
		panel_1.setAlignmentX(FlowLayout.LEFT);
		panel_1.setTheme(theme);
		panel_1.setBounds(0, 43, 739, 416);
		panel.add(panel_1);

		listValues = new String[2];
		jxPanel = new JxPanel();
		jxPanel.setTheme(theme);
		jxPanel.setLayout(null);
		jxPanel.setBounds(0, 10, 519, 27);
		panel.add(jxPanel);

		if (ScheduleConstants.mode != ScheduleMode.MASTER_SCHEDULE) {
		}

		rbScheduled = new JxRadioButton();
		rbScheduled.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				doSelection();
			}
		});
		rbScheduled.setTheme(theme);
		rbScheduled.setSelected(true);

		rbScheduled.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {

			}
		});

		rbScheduled.setText("Schedule");
		rbScheduled.setBounds(10, 5, 68, 18);
		jxPanel.add(rbScheduled);

		rbNotAvailable = new JxRadioButton();
		rbNotAvailable.setTheme(theme);
		rbNotAvailable.setSelected(false);
		rbNotAvailable.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				doSelection();
			}
		});
		if (rbScheduled.isSelected()) {
			if (ScheduleConstants.mode != ScheduleMode.MASTER_SCHEDULE) {
			}
		}
		rbNotAvailable.setText("Not Available");
		rbNotAvailable.setBounds(84, 5, 95, 18);

		jxPanel.add(rbNotAvailable);

		bgCheckAvaility.add(rbScheduled);
		bgCheckAvaility.add(rbNotAvailable);

		rbAvailable = new JxRadioButton();
		rbAvailable.setTheme(theme);
		bgCheckAvaility.add(rbAvailable);
		rbAvailable.setText("Available");
		rbAvailable.setBounds(196, 6, 95, 18);
		rbAvailable.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				doSelection();
			}
		});
		jxPanel.add(rbAvailable);

		bgDecideTime = new ButtonGroup();
		bgDecideFloor = new ButtonGroup();
		bgDecideDirection = new ButtonGroup();
		bgLeaveType = new ButtonGroup();

		if (ScheduleConstants.mode != ScheduleMode.MASTER_SCHEDULE) {
		}

		/*
		 * action = new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { if (rbNotAvailable.isSelected() ==
		 * true) { String getLeaveType; if (bgLeaveType.getSelection() == null)
		 * { getLeaveType=""; }else { getLeaveType= bgLeaveType.getSelection()
		 * .getActionCommand(); System.out.println("getLeaveType====" +
		 * getLeaveType); } } }};
		 */

		/********************************************************************************************************************************************    */

		/*
		 * btnDelete = new JxButton(); btnDelete.setTheme (theme);
		 * btnDelete.addActionListener(new ActionListener() { public void
		 * actionPerformed(final ActionEvent arg0) { int
		 * index=list.getSelectedIndex();
		 * 
		 * try { list.remove(index); list.repaint(); list.updateUI();
		 * list.clearSelection(); } catch (Exception e) { e.printStackTrace(); }
		 * 
		 * //list.setListData(new String[] {}); listFirstValue="";
		 * listSecondValue=""; listValues[0]=""; listValues[1]="";
		 * 
		 * list.clearSelection(); list.isSelectionEmpty(); list.removeAll();
		 * list.repaint(); // list.clearSelection(); list.setListData(new
		 * String[] {}); listFirstValue=""; listSecondValue="";
		 * 
		 * } }); btnDelete.setText("Delete"); btnDelete.setBounds(118, 176, 120,
		 * 30); btnDelete.isDisplayable(); jxPanel_2.add(btnDelete);
		 */

		/*********************************************************************************************************************************************    */

		panelScheduled = new JxPanel();
		panel_1.add(panelScheduled);
		panelScheduled.setPreferredSize(new Dimension(300, 200));
		panelScheduled.setTheme(theme);
		panelScheduled.setLayout(null);

		final JxPanel jxPanel_1 = new JxPanel();
		jxPanel_1.setTheme(theme);
		jxPanel_1.setBounds(28, 10, 74, 103);
		panelScheduled.add(jxPanel_1);
		jxPanel_1.setLayout(null);

		rbDay = new JxRadioButton();
		rbDay.setTheme(theme);
		rbDay.setText("Day");
		rbDay.addActionListener(action);
		rbDay.setActionCommand("D");
		rbDay.setBounds(10, 10, 54, 18);
		jxPanel_1.add(rbDay);

		rbEvening = new JxRadioButton();
		rbEvening.setTheme(theme);
		rbEvening.addActionListener(action);
		rbEvening.setActionCommand("E");
		rbEvening.setText("Evening");
		rbEvening.setBounds(10, 47, 64, 18);
		jxPanel_1.add(rbEvening);

		rbNight = new JxRadioButton();
		rbNight.setTheme(theme);
		rbNight.addActionListener(action);
		rbNight.setActionCommand("N");
		rbNight.setText("Night");
		rbNight.setBounds(10, 82, 54, 18);
		jxPanel_1.add(rbNight);
		bgDecideTime.add(rbDay);
		bgDecideTime.add(rbEvening);
		bgDecideTime.add(rbNight);

		final JxPanel jxPanel_1_1 = new JxPanel();
		jxPanel_1_1.setTheme(theme);
		jxPanel_1_1.setBounds(108, 10, 97, 103);
		panelScheduled.add(jxPanel_1_1);
		jxPanel_1_1.setLayout(null);

		rbFirstFloor = new JxRadioButton();
		rbFirstFloor.setTheme(theme);
		rbFirstFloor.addActionListener(action);
		rbFirstFloor.setActionCommand("1");
		rbFirstFloor.setText("First Floor");
		rbFirstFloor.setBounds(10, 10, 77, 18);
		jxPanel_1_1.add(rbFirstFloor);

		rbSecondFloor = new JxRadioButton();
		rbSecondFloor.setTheme(theme);
		rbSecondFloor.addActionListener(action);
		rbSecondFloor.setActionCommand("2");
		rbSecondFloor.setText("Second Floor");
		rbSecondFloor.setBounds(10, 47, 87, 18);
		jxPanel_1_1.add(rbSecondFloor);
		bgDecideFloor.add(rbFirstFloor);
		bgDecideFloor.add(rbSecondFloor);

		final JxPanel jxPanel_1_1_1 = new JxPanel();
		jxPanel_1_1_1.setTheme(theme);
		jxPanel_1_1_1.setBounds(211, 10, 63, 103);
		panelScheduled.add(jxPanel_1_1_1);
		jxPanel_1_1_1.setLayout(null);

		rbNorth = new JxRadioButton();
		rbNorth.setTheme(theme);
		rbNorth.addActionListener(action);
		rbNorth.setActionCommand("N");
		rbNorth.setText("North");
		rbNorth.setBounds(10, 10, 55, 18);
		jxPanel_1_1_1.add(rbNorth);

		rbSouth = new JxRadioButton();
		rbSouth.setTheme(theme);
		rbSouth.setText("South");
		rbSouth.addActionListener(action);
		rbSouth.setActionCommand("S");
		rbSouth.setBounds(10, 47, 55, 18);
		jxPanel_1_1_1.add(rbSouth);
		bgDecideDirection.add(rbNorth);
		bgDecideDirection.add(rbSouth);
		btnAdd = new JxButton();
		btnAdd.setTheme(theme);

		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				getSchedule();

			}
		});
		btnAdd.setBounds(28, 119, 74, 20);
		panelScheduled.add(btnAdd);
		btnAdd.setText("Add");

		btnReset = new JxButton();
		btnReset.setTheme(theme);
		btnReset.setBounds(118, 119, 82, 20);
		panelScheduled.add(btnReset);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				list.setListData(new String[] {});
				listFirstValue = "";
				listSecondValue = "";
				listValues[0] = "";
				listValues[1] = "";

			}
		});
		btnReset.setText("Reset");
		list = new JList();

		final JxScrollPane jxScrollPane = new JxScrollPane(list);
		jxScrollPane.setPreferredSize(new Dimension(250, 39));
		jxScrollPane.setBounds(28, 145, 250, 39);
		panelScheduled.add(jxScrollPane);
		panelLeave = new JxPanel();
		panel_1.add(panelLeave);
		panelLeave.setPreferredSize(new Dimension(207, 300));
		panelLeave.setTheme(theme);
		panelLeave.setLayout(null);
		panelLeave.setVisible(false);

		rbVacation = new JxRadioButton();
		rbVacation.setTheme(theme);
		rbVacation.addActionListener(action);
		rbVacation.setActionCommand("V");
		rbVacation.setText("Vacation");
		rbVacation.setBounds(10, 10, 112, 18);
		panelLeave.add(rbVacation);

		rbBirthday = new JxRadioButton();
		rbBirthday.setTheme(theme);
		rbBirthday.addActionListener(action);
		rbBirthday.setActionCommand("B");
		rbBirthday.setText("Birthday");
		rbBirthday.setBounds(10, 41, 112, 18);
		panelLeave.add(rbBirthday);

		rbPersonal = new JxRadioButton();
		rbPersonal.setTheme(theme);
		rbPersonal.addActionListener(action);
		rbPersonal.setActionCommand("P");
		rbPersonal.setText("Personal Day");
		rbPersonal.setBounds(10, 71, 112, 18);
		panelLeave.add(rbPersonal);

		rbSocial = new JxRadioButton();
		rbSocial.setTheme(theme);
		rbSocial.addActionListener(action);
		rbSocial.setActionCommand("O");
		rbSocial.setText("Off");
		rbSocial.setBounds(10, 95, 112, 18);
		panelLeave.add(rbSocial);

		rbJuryDate = new JxRadioButton();
		rbJuryDate.setText("Jury Date");
		rbJuryDate.setTheme(theme);
		rbJuryDate.addActionListener(action);
		rbJuryDate.setActionCommand("J");
		rbJuryDate.setBounds(10, 125, 112, 18);
		panelLeave.add(rbJuryDate);

		rbBereauementDay = new JxRadioButton();
		rbBereauementDay.setText("Bereauement Day");
		rbBereauementDay.addActionListener(action);
		rbBereauementDay.setActionCommand("R");
		rbBereauementDay.setTheme(theme);
		rbBereauementDay.setBounds(10, 159, 112, 18);
		panelLeave.add(rbBereauementDay);

		bgLeaveType.add(rbVacation);
		bgLeaveType.add(rbBirthday);
		bgLeaveType.add(rbPersonal);
		bgLeaveType.add(rbSocial);
		bgLeaveType.add(rbJuryDate);
		bgLeaveType.add(rbBereauementDay);

		panelAvailable = new JxPanel();
		panelAvailable.setTheme(theme);
		panelAvailable.setLayout(null);
		panelAvailable.setVisible(false);
		panelAvailable.setPreferredSize(new Dimension(207, 181));
		panel_1.add(panelAvailable);

		rbAvailableDay = new JxRadioButton();
		bgAvailibility.add(rbAvailableDay);
		rbAvailableDay.setActionCommand("D");
		rbAvailableDay.setTheme(theme);
		rbAvailableDay.setText("Day");
		rbAvailableDay.setBounds(10, 10, 112, 18);
		panelAvailable.add(rbAvailableDay);

		rbAvailableEvening = new JxRadioButton();
		bgAvailibility.add(rbAvailableEvening);
		rbAvailableEvening.setActionCommand("E");
		rbAvailableEvening.setTheme(theme);
		rbAvailableEvening.setText("Evening");
		rbAvailableEvening.setBounds(10, 41, 112, 18);
		panelAvailable.add(rbAvailableEvening);

		rbAvailableNight = new JxRadioButton();
		bgAvailibility.add(rbAvailableNight);
		rbAvailableNight.setActionCommand("N");
		rbAvailableNight.setTheme(theme);
		rbAvailableNight.setText("Night");
		rbAvailableNight.setBounds(10, 71, 112, 18);
		panelAvailable.add(rbAvailableNight);
		panelLeave2 = new JxPanel();
		panel_1.add(panelLeave2);
		panelLeave2.setPreferredSize(new Dimension(400, 100));
		panelLeave2.setLayout(null);
		panelLeave2.setTheme(theme);
		panelLeave2.setVisible(false);

		rbCallOut = new JxRadioButton();
		rbCallOut.setText("Call Out");
		rbCallOut.setActionCommand("C");
		rbCallOut.setTheme(theme);
		rbCallOut.setBounds(9, 9, 83, 18);
		panelLeave2.add(rbCallOut);

		rbNoCallNoShow = new JxRadioButton();
		rbNoCallNoShow.setText("No Call No Show");
		rbNoCallNoShow.setActionCommand("A");
		rbNoCallNoShow.setTheme(theme);
		rbNoCallNoShow.setBounds(98, 9, 112, 18);
		panelLeave2.add(rbNoCallNoShow);
		bgLeaveType.add(rbCallOut);
		bgLeaveType.add(rbNoCallNoShow);

		textField = new JTextField();
		textField.setBounds(9, 43, 271, 57);
		panelLeave2.add(textField);

		btnSave = new JxButton();
		btnSave.setPreferredSize(new Dimension(50, 25));
		panel_1.add(btnSave);
		btnSave.setTheme(theme);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				// getSelectedListValue=""+list.getSelectedValue();

				getShiftValue();
				if (getShift.equalsIgnoreCase("")) {
					JOptionPane.showMessageDialog(null, "Please select Values");
				} else {
					close();
				}
			}
		});
		btnSave.setText("Save");

		btnCancelMain = new JxButton();
		btnCancelMain.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				getShift = null;
				close();
			}
		});
		btnCancelMain.setPreferredSize(new Dimension(50, 25));
		panel_1.add(btnCancelMain);
		btnCancelMain.setTheme(theme);
		btnCancelMain.setText("Cancel");
		
		

		// if(txtValue!=null){
		
		doUpdateList();
		// }
		//listValues=null;

	}

	private void doSelection() {

		if (rbScheduled.isSelected()) {
			panelScheduled.setVisible(true);
			panelLeave.setVisible(false);
			panelLeave2.setVisible(false);
			panelAvailable.setVisible(false);
		}
		if (rbNotAvailable.isSelected()) {
			panelScheduled.setVisible(false);
			panelLeave.setVisible(true);
			panelLeave2.setVisible(true);
			panelAvailable.setVisible(false);
		}

		if (rbAvailable.isSelected()) {
			panelScheduled.setVisible(false);
			panelLeave.setVisible(false);
			panelLeave2.setVisible(false);
			panelAvailable.setVisible(true);
		}

	}

	private void getShiftValue() {
		try {
			if (rbScheduled.isSelected()) {
				getShift = listFirstValue + listSecondValue;
				return;
			}
			if (rbNotAvailable.isSelected()) {
				getShift = bgLeaveType.getSelection().getActionCommand();
				return;
			}
			if (rbAvailable.isSelected()) {
				getShift = bgAvailibility.getSelection().getActionCommand();
			}
		} catch (Exception e) {
			getShift = "";
		}
	}

	private void doUpdateList() {
		
		
		
	    listValues[0] = listFirstValue;
		listValues[1] = listSecondValue;
		// String[] valTxt = { txtValue + ";" };
		list.setListData(listValues);
		
		
	}

	private void getleaveInformation() {
		// action = new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		if (bgLeaveType.getSelection() != null) {
			String getLeaveType = bgLeaveType.getSelection().getActionCommand();
			System.out.println("getLeaveType====" + getLeaveType);
		}
		// }
		// };
	}

	@Override
	public String getTitle() {
		String s = "ADD SCHEDULE";
		return s;
	}

	private void getSchedule() {
		String decideShift = bgDecideTime.getSelection().getActionCommand();
		String floor = "";
		if (bgDecideFloor.getSelection() == null) {
			floor = "";
		} else {
			floor = bgDecideFloor.getSelection().getActionCommand();
		}
		String direction = "";
		if (bgDecideDirection.getSelection() == null) {
			direction = "";
		} else {
			direction = bgDecideDirection.getSelection().getActionCommand();
		}
		if ((bgDecideFloor.getSelection() != null)
				&& (bgDecideDirection.getSelection() != null)
				&& (bgDecideTime.getSelection() != null)) {
			{
				if (listFirstValue == "") {
					listFirstValue = decideShift + floor + direction;
					listValues[0] = listFirstValue;
				} else if (listSecondValue == "") {
					String decideShift0 = listValues[0].substring(0, 1);
					if (decideShift0.equalsIgnoreCase(decideShift)) {
						JOptionPane.showMessageDialog(null,
								"Cannot add similar shifts");
					} else {
						if (decideShift.equalsIgnoreCase("D")
								|| (decideShift.equalsIgnoreCase("E") && decideShift0
										.equalsIgnoreCase("N"))) {
							listFirstValue = decideShift + floor + direction;
							listSecondValue = listValues[0];
							listValues[0] = listFirstValue;
							listValues[1] = listSecondValue;
						} else {
							listSecondValue = decideShift + floor + direction;
							listValues[1] = listSecondValue;
						}
					}

				}
				// String[] val = { decideShift + floor + floor + ";" };
				list.setListData(listValues);				
			}
		}
		/* } */
		/* }; */
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		PanelShifts panelShifts = new PanelShifts("", "");
		frame.getContentPane().add(panelShifts);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//System.out.print("getShift====::"+getShift);
		frame.setSize(532, 378);
		frame.setVisible(true);

	}

}
