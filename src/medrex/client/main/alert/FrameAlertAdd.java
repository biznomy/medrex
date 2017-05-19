package medrex.client.main.alert;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.loading.FrameLoading;
import medrex.client.utils.FieldFormatter;
import medrex.client.utils.MsgBox;
import medrex.client.utils.PresentationModel;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.alert.Alert;
import medrex.commons.vo.others.Users;

import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.toedter.calendar.JDateChooser;

public class FrameAlertAdd extends PopUpView {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3864381036292957405L;
	private JRadioButton rbOneTime;
	private JxComboBox cmbAlertTypeUntil;
	private JFormattedTextField txtAlertUntil;
	private JRadioButton rbCompleted;
	private JRadioButton rbPending;
	private JxButton btnDepartmentAdd;
	private JTextField txtDepartment;
	private JxButton btnUserAdd;
	private JTextField txtUsers;
	private JTextField txtDailyTimes;
	private JxButton btnSave;
	private JDateChooser dcEnd;
	private JDateChooser dcBegin;
	private JDateChooser dcDate;
	private JCheckBox cbSuspend;
	private JxComboBox cmbSignature;
	private JCheckBox cbSignature;
	private JCheckBox cbOutOfPass;
	private JCheckBox cbDischarged;
	private JTextArea txtNotes;
	private JRadioButton rbInActive;
	private JRadioButton rbActive;
	private JFormattedTextField txtSuspendTime;
	private JFormattedTextField txtIntervalTime;
	private JxComboBox cmbIntervalType;
	private JxComboBox cmbSuspendType;
	private static final Color DEF_COLOR = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);
	private ButtonGroup bg = new ButtonGroup();
	private ButtonGroup bgAlertType = new ButtonGroup();
	private ButtonGroup bgOwnerStatusType = new ButtonGroup();
	private JRadioButton rbInterval;
	private JRadioButton rbDaily;
	private JxButton btnPlus;
	private String strTime;
	SpinnerDateModel model;
	final JSpinner spinner;
	private final int GLOBAL_ALERT_ID = 100000;

	private ControllerAlertAdd conAlertAdd;
	private Map myMap;
	private PresentationModel presentationModel;
	private JLabel errorLabel;
	private List<Users> toUserList;
	private FrameLoading fl;

	private FrameUsersAdd fua;

	private String dapartmentString = "";

	private String isImmediate = "";

	private String getImmediateBg = "";

	private Date immediateDate;
	private Date immediateTimes;

	private String usersList = "";

	SimpleDateFormat simpleFormat = new SimpleDateFormat("MM/dd/yyyy");
	Date date = MedrexClientManager.getServerTime();

	public String getStrTime() {
		return txtDailyTimes.getText();
	}

	public void setStrTime(String strTime) {
		this.strTime = strTime;
		txtDailyTimes.setText(strTime);
	}

	@Override
	public String getTitle() {
		return "Alert";
	}

	public FrameAlertAdd(final String str) {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(450, 734));
		setSize(450, 734);
		setForeground(GuiModes.DESIGNER_FORMS.getDefaultForegroundColor());
		setBackground(GuiModes.DESIGNER_FORMS.getDefaultBackgroundColor());
		setFont(GuiModes.DESIGNER_FORMS.getDefaultFont());
		myMap = new HashMap();
		conAlertAdd = new ControllerAlertAdd();
		simpleFormat.format(date);

		final JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setLayout(null);
		panel_2.setBounds(33, 190, 407, 130);
		add(panel_2);

		final JLabel formLabel_2 = new JLabel();
		formLabel_2.setForeground(DEF_COLOR);
		formLabel_2.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		formLabel_2.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		formLabel_2.setText("Interval");
		formLabel_2.setBounds(10, 37, 75, 28);
		panel_2.add(formLabel_2);

		txtIntervalTime = new JFormattedTextField(FieldFormatter.MAX3);
		txtIntervalTime.setForeground(DEF_COLOR);
		txtIntervalTime.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		txtIntervalTime.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		txtIntervalTime.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		txtIntervalTime.setBounds(91, 37, 80, 25);
		panel_2.add(txtIntervalTime);

		cmbIntervalType = new JxComboBox();
		cmbIntervalType.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent e) {
				JxComboBox cb = (JxComboBox) e.getSource();
				String newSelection = (String) cb.getSelectedItem();
				if (newSelection.equalsIgnoreCase("Minutes")
						|| newSelection.equalsIgnoreCase("Hrs")) {
					txtDailyTimes.setEnabled(false);
					btnPlus.setEnabled(false);
				}
				if (newSelection.equalsIgnoreCase("Days")
						|| newSelection.equalsIgnoreCase("Weeks")
						|| newSelection.equalsIgnoreCase("Months")
						|| newSelection.equalsIgnoreCase("Years")) {
					txtDailyTimes.setEnabled(true);
					btnPlus.setEnabled(true);
				}
			}
		});
		cmbIntervalType.setModel(new DefaultComboBoxModel(new String[] { "",
				"Minutes", "Hrs", "Days", "Weeks", "Months", "Years" }));
		cmbIntervalType.setBackground(Color.WHITE);
		cmbIntervalType.setForeground(DEF_COLOR);
		cmbIntervalType.setArc(0.4f);
		cmbIntervalType.setBorder(new LineBorder(DEF_COLOR, 1, false));
		cmbIntervalType.setBounds(190, 37, 75, 25);
		panel_2.add(cmbIntervalType);

		final JLabel alertTypeLabel = new JLabel();
		alertTypeLabel.setForeground(DEF_COLOR);
		alertTypeLabel.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		alertTypeLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		alertTypeLabel.setText("Alert Type");
		alertTypeLabel.setBounds(10, 10, 66, 16);
		panel_2.add(alertTypeLabel);

		rbInterval = new JRadioButton();
		rbInterval.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtIntervalTime.setEnabled(true);
				cmbIntervalType.setEnabled(true);
				txtDailyTimes.setEnabled(false);
				spinner.setEnabled(true);
				btnPlus.setEnabled(false);
				txtDailyTimes.setText("");
				dcBegin.setEnabled(true);
				dcEnd.setEnabled(true);
				if (cmbIntervalType.getSelectedIndex() > 2) {
					btnPlus.setEnabled(true);

				}

			}
		});
		bgAlertType.add(rbInterval);
		rbInterval.setActionCommand("1");
		rbInterval.setBackground(Color.WHITE);
		rbInterval.setForeground(DEF_COLOR);
		rbInterval.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		rbInterval.setText("Interval");
		rbInterval.setBounds(91, 9, 106, 18);
		panel_2.add(rbInterval);

		rbDaily = new JRadioButton();
		rbDaily.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtIntervalTime.setText("0");
				spinner.setEnabled(false);
				cmbIntervalType.setSelectedIndex(0);
				txtIntervalTime.setEnabled(false);
				cmbIntervalType.setEnabled(false);
				txtDailyTimes.setEnabled(true);
				btnPlus.setEnabled(true);
				dcBegin.setEnabled(true);
				dcEnd.setEnabled(true);
			}
		});
		bgAlertType.add(rbDaily);
		rbDaily.setActionCommand("2");
		rbDaily.setBackground(Color.WHITE);
		rbDaily.setForeground(DEF_COLOR);
		rbDaily.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		rbDaily.setText("Daily");
		rbDaily.setBounds(214, 9, 56, 18);
		panel_2.add(rbDaily);

		final JLabel dailyLabel = new JLabel();
		dailyLabel.setText("Time (s)");
		dailyLabel.setBounds(10, 106, 66, 14);
		dailyLabel.setForeground(DEF_COLOR);
		dailyLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		panel_2.add(dailyLabel);

		txtDailyTimes = new JTextField();
		txtDailyTimes.setEditable(false);
		txtDailyTimes.setBounds(91, 103, 206, 21);
		txtDailyTimes.setForeground(DEF_COLOR);
		txtDailyTimes.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		txtDailyTimes.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		txtDailyTimes.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		panel_2.add(txtDailyTimes);

		btnPlus = new JxButton();
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				PanelTimeAddDialog ptd = new PanelTimeAddDialog(txtDailyTimes
						.getText());
				// ptd.setTextString(txtDailyTimes.getText());
				SwingUtils.openInDialog(ptd);
				txtDailyTimes.setText(ptd.getTextString());
				txtDailyTimes.setEnabled(true);
			}
		});
		btnPlus.setText("+");
		btnPlus.setArc(0.4f);
		btnPlus.setBackground(Color.WHITE);
		btnPlus.setForeground(DEF_COLOR);
		btnPlus.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnPlus.setFont(new Font("", Font.BOLD, 12));
		btnPlus.setBounds(311, 103, 41, 21);
		panel_2.add(btnPlus);

		model = new SpinnerDateModel();
		model.setCalendarField(Calendar.HOUR_OF_DAY);
		spinner = new JSpinner(model);
		spinner.setBounds(91, 72, 106, 20);
		panel_2.add(spinner);
		JSpinner.DateEditor editor = new JSpinner.DateEditor(spinner, "hh:mm a");
		spinner.setEditor(editor);

		final JLabel startTimeLabel = new JLabel();
		startTimeLabel.setBounds(10, 75, 66, 16);
		panel_2.add(startTimeLabel);
		startTimeLabel.setText("Time");
		startTimeLabel.setFont(new Font("", Font.BOLD, 12));
		startTimeLabel.setForeground(DEF_COLOR);

		rbOneTime = new JRadioButton();
		rbOneTime.setActionCommand("3");
		rbOneTime.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtIntervalTime.setEnabled(false);
				txtDailyTimes.setEnabled(false);
				txtDailyTimes.setText("");
				cmbIntervalType.setEnabled(false);
				spinner.setEnabled(false);
				btnPlus.setEnabled(false);
				dcBegin.setEnabled(false);
				dcEnd.setEnabled(false);
				dcBegin.setDate(date);
				dcEnd.setDate(date);
				PanelImmediateAlertAdd pia = new PanelImmediateAlertAdd();
				SwingUtils.openInDialog(pia);
				isImmediate = pia.getString();
				getImmediateBg = pia.getButtonGroup();
				if (Integer.parseInt(getImmediateBg) == 2) {
					immediateDate = pia.getDate();
					immediateTimes = pia.getTimes();
				}
				if (isImmediate.equalsIgnoreCase("No")) {
					rbInterval.setSelected(true);
					txtIntervalTime.setEnabled(true);
					cmbIntervalType.setEnabled(true);
					spinner.setEnabled(true);
					btnPlus.setEnabled(true);
					dcBegin.setEnabled(true);
					dcEnd.setEnabled(true);
				}
			}
		});
		rbOneTime.setBackground(Color.WHITE);
		rbOneTime.setFont(new Font("Dialog", Font.BOLD, 12));
		rbOneTime.setForeground(DEF_COLOR);
		rbOneTime.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		rbOneTime.setText("One Time");
		rbOneTime.setBounds(303, 9, 94, 18);
		bgAlertType.add(rbOneTime);
		panel_2.add(rbOneTime);

		final JxButton btnCancel = new JxButton();
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		btnCancel.setText("Cancel");
		btnCancel.setArc(0.4f);
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setForeground(DEF_COLOR);
		btnCancel.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.setBounds(244, 699, 95, 25);
		add(btnCancel);

		btnSave = new JxButton();
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (doSave(str)) {
					close();
				}
			}
		});
		btnSave.setText("Save");
		btnSave.setArc(0.4f);
		btnSave.setBackground(Color.WHITE);
		btnSave.setForeground(DEF_COLOR);
		btnSave.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnSave.setFont(new Font("", Font.BOLD, 12));
		btnSave.setBounds(105, 699, 95, 25);
		add(btnSave);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(33, 40, 407, 38);
		add(panel);

		final JLabel statusLabel = new JLabel();
		statusLabel.setFont(new Font("", Font.BOLD, 12));
		statusLabel.setBounds(10, 10, 54, 14);
		statusLabel.setForeground(DEF_COLOR);
		statusLabel.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		panel.add(statusLabel);
		statusLabel.setText("Status");

		rbActive = new JRadioButton();
		rbActive.setFocusable(false);
		rbActive.setFont(new Font("", Font.BOLD, 11));
		rbActive.setBackground(Color.WHITE);
		rbActive.setBounds(100, 10, 106, 18);
		rbActive.setForeground(DEF_COLOR);
		rbActive.setActionCommand("Active");
		bg.add(rbActive);
		panel.add(rbActive);
		rbActive.setText("Active");

		rbInActive = new JRadioButton();
		rbInActive.setFocusable(false);
		rbInActive.setFont(new Font("", Font.BOLD, 11));
		rbInActive.setBackground(Color.WHITE);
		rbInActive.setBounds(211, 8, 106, 18);
		rbInActive.setForeground(DEF_COLOR);
		rbInActive.setActionCommand("Inactive");
		bg.add(rbInActive);
		panel.add(rbInActive);
		rbInActive.setText("InActive");

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(33, 78, 407, 81);
		add(panel_1);

		final JLabel notesLabel = new JLabel();
		notesLabel.setFont(new Font("", Font.BOLD, 12));
		notesLabel.setText("Notes");
		notesLabel.setBounds(10, 5, 54, 14);
		notesLabel.setForeground(DEF_COLOR);
		panel.add(statusLabel);
		panel_1.add(notesLabel);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(100, 5, 272, 70);
		panel_1.add(scrollPane);

		txtNotes = new JTextArea();
		myMap.put("notes", txtNotes);
		txtNotes.setBorder(new LineBorder(Color.black, 1, false));
		txtNotes.setBounds(100, 5, 272, 70);
		txtNotes.setForeground(DEF_COLOR);
		panel_1.add(txtNotes);
		scrollPane.setViewportView(txtNotes);

		final JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(33, 160, 407, 28);
		add(panel_3);

		final JLabel dateLabel = new JLabel();
		dateLabel.setFont(new Font("", Font.BOLD, 12));
		dateLabel.setBounds(10, 10, 54, 14);
		panel_3.add(dateLabel);
		dateLabel.setForeground(DEF_COLOR);
		dateLabel.setText("Date");

		dcDate = new JDateChooser();
		dcDate.setBorder(new LineBorder(SystemColor.desktop, 1, false));
		dcDate.setDateFormatString("MM/dd/yyyy");
		dcDate.setBounds(100, 4, 124, 21);
		panel_3.add(dcDate);

		final JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setLayout(null);
		panel_4.setBounds(33, 322, 407, 69);
		add(panel_4);

		final JLabel beginDateLabel = new JLabel();
		beginDateLabel.setFont(new Font("", Font.BOLD, 12));
		beginDateLabel.setBounds(10, 10, 78, 14);
		beginDateLabel.setText("Begin Date");
		beginDateLabel.setForeground(DEF_COLOR);
		panel_4.add(beginDateLabel);

		final JLabel endDateLabel = new JLabel();
		endDateLabel.setFont(new Font("", Font.BOLD, 12));
		endDateLabel.setText("End Date");
		endDateLabel.setBounds(10, 45, 78, 14);
		endDateLabel.setForeground(DEF_COLOR);
		panel_4.add(endDateLabel);

		dcBegin = new JDateChooser();
		myMap.put("beginDate", dcBegin);
		dcBegin.setBorder(new LineBorder(SystemColor.desktop, 1, false));
		dcBegin.setDateFormatString("MM/dd/yyyy");
		dcBegin.setBounds(94, 8, 124, 21);
		panel_4.add(dcBegin);

		dcEnd = new JDateChooser();
		// myMap.put("endDate", dcEnd);
		dcEnd.setBorder(new LineBorder(SystemColor.desktop, 1, false));
		dcEnd.setDateFormatString("MM/dd/yyyy");
		dcEnd.setBounds(94, 43, 124, 21);
		panel_4.add(dcEnd);

		final JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBounds(33, 390, 407, 28);
		add(panel_5);

		if (str.equalsIgnoreCase("Resident Alert")) {

			cbDischarged = new JCheckBox();
			cbDischarged.setFont(new Font("", Font.BOLD, 11));
			cbDischarged.setBackground(Color.WHITE);
			cbDischarged.setText("Discharged");
			cbDischarged.setBounds(10, 5, 94, 18);
			cbDischarged.setForeground(DEF_COLOR);
			panel_5.add(cbDischarged);

			cbOutOfPass = new JCheckBox();
			cbOutOfPass.setFont(new Font("", Font.BOLD, 11));
			cbOutOfPass.setBackground(Color.WHITE);
			cbOutOfPass.setText("Out of Pass");
			cbOutOfPass.setBounds(122, 5, 94, 18);
			cbOutOfPass.setForeground(DEF_COLOR);
			panel_5.add(cbOutOfPass);

		}
		final JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setLayout(null);
		panel_6.setBounds(33, 420, 407, 56);
		add(panel_6);

		cbSignature = new JCheckBox();
		cbSignature.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (cbSignature.isSelected() == true) {
					cmbSignature.setEnabled(true);
				} else {
					cmbSignature.setEnabled(false);
					cmbSignature.setSelectedItem("");
				}
			}
		});
		cbSignature.setFont(new Font("", Font.BOLD, 11));
		cbSignature.setBackground(Color.WHITE);
		cbSignature.setBounds(100, 5, 130, 18);
		cbSignature.setText("(Check to Active)");
		cbSignature.setForeground(DEF_COLOR);
		panel_6.add(cbSignature);

		cmbSignature = new JxComboBox();
		cmbSignature.setBackground(Color.WHITE);
		cmbSignature.setBounds(100, 29, 206, 21);
		cmbSignature.setForeground(DEF_COLOR);
		cmbSignature.setArc(0.4f);
		panel_6.add(cmbSignature);

		final JLabel signatureLabel = new JLabel();
		signatureLabel.setFont(new Font("", Font.BOLD, 12));
		signatureLabel.setText("Signature");
		signatureLabel.setBounds(10, 5, 79, 14);
		signatureLabel.setForeground(DEF_COLOR);
		panel_6.add(signatureLabel);

		final JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_7.setLayout(null);
		panel_7.setBounds(33, 475, 407, 60);
		add(panel_7);

		cbSuspend = new JCheckBox();
		cbSuspend.setFont(new Font("", Font.BOLD, 11));
		cbSuspend.setBackground(Color.WHITE);
		cbSuspend.setBounds(100, 6, 117, 18);
		cbSuspend.setText("(Check to Active)");
		cbSuspend.setForeground(DEF_COLOR);
		cbSuspend.setVisible(false);
		cbSuspend.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (cbSuspend.isSelected() == true) {
					txtSuspendTime.setEnabled(true);
					cmbSuspendType.setEnabled(true);
				} else {
					txtSuspendTime.setEnabled(false);
					cmbSuspendType.setEnabled(false);
					txtSuspendTime.setText("");
					cmbSuspendType.setSelectedItem("");
				}
			}
		});
		panel_7.add(cbSuspend);

		final JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(10, 30, 300, 28);
		panel_7.add(panel_2_1);
		panel_2_1.setOpaque(false);
		panel_2_1.setLayout(null);

		final JLabel formLabel_2_1 = new JLabel();
		formLabel_2_1.setForeground(DEF_COLOR);
		formLabel_2_1.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		formLabel_2_1.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		formLabel_2_1.setText("Time");
		formLabel_2_1.setVisible(false);
		formLabel_2_1.setBounds(10, 0, 75, 28);
		panel_2_1.add(formLabel_2_1);

		txtSuspendTime = new JFormattedTextField(FieldFormatter.MAX3);
		txtSuspendTime.setForeground(DEF_COLOR);
		txtSuspendTime.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		txtSuspendTime.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		txtSuspendTime.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		txtSuspendTime.setBounds(90, 2, 80, 25);
		txtSuspendTime.setVisible(false);
		panel_2_1.add(txtSuspendTime);

		cmbSuspendType = new JxComboBox();
		cmbSuspendType.setModel(new DefaultComboBoxModel(new String[] { "",
				"Minutes", "Hrs", "Days", "Months" }));
		cmbSuspendType.setBackground(Color.WHITE);
		cmbSuspendType.setForeground(DEF_COLOR);
		cmbSuspendType.setArc(0.4f);
		cmbSuspendType.setBorder(new LineBorder(DEF_COLOR, 1, false));
		cmbSuspendType.setBounds(200, 0, 75, 25);
		cmbSuspendType.setVisible(false);
		panel_2_1.add(cmbSuspendType);

		final JLabel suspendLabel = new JLabel();
		suspendLabel.setFont(new Font("", Font.BOLD, 12));
		suspendLabel.setText("Suspend");
		suspendLabel.setBounds(10, 0, 63, 28);
		suspendLabel.setForeground(DEF_COLOR);
		suspendLabel.setVisible(false);
		panel_7.add(suspendLabel);

		final JLabel alertLabel = new JLabel();
		alertLabel.setFont(new Font("", Font.BOLD, 18));
		alertLabel.setText("Alert");
		alertLabel.setForeground(DEF_COLOR);
		alertLabel.setBounds(192, 10, 81, 21);
		add(alertLabel);

		errorLabel = new JLabel();
		errorLabel.setForeground(new Color(255, 0, 0));
		errorLabel.setText("");
		errorLabel.setBounds(33, 677, 407, 16);
		add(errorLabel);

		final JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_8.setLayout(null);
		panel_8.setBounds(33, 537, 407, 72);
		add(panel_8);

		final JLabel recieverLabel = new JLabel();
		recieverLabel.setBounds(10, 2, 66, 16);
		recieverLabel.setForeground(DEF_COLOR);
		recieverLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		recieverLabel.setText("Reciever");

		panel_8.add(recieverLabel);

		txtUsers = new JTextField();
		myMap.put("recieverUser", txtUsers);
		txtUsers.setBounds(100, 27, 213, 21);
		txtUsers.setEditable(false);
		txtUsers.setForeground(DEF_COLOR);
		txtUsers.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		panel_8.add(txtUsers);

		final JLabel userLabel = new JLabel();
		userLabel.setText("User");
		userLabel.setBounds(20, 27, 54, 14);
		userLabel.setForeground(DEF_COLOR);
		userLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		panel_8.add(userLabel);

		final JLabel departmentLabel = new JLabel();
		departmentLabel.setText("Department");
		departmentLabel.setBounds(20, 49, 80, 14);
		departmentLabel.setForeground(DEF_COLOR);
		departmentLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		panel_8.add(departmentLabel);

		txtDepartment = new JTextField();
		myMap.put("recieverDepartment", txtDepartment);
		txtDepartment.setBounds(100, 49, 213, 21);
		txtDepartment.setEditable(false);
		txtDepartment.setForeground(DEF_COLOR);
		txtDepartment.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		panel_8.add(txtDepartment);

		btnUserAdd = new JxButton();
		btnUserAdd.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				fua = new FrameUsersAdd("User");
				SwingUtils.center(fua);
				fua.setVisible(true);

				if (!fua.isCancel()) {
					toUserList = fua.getToUserList();
					toUserList.toArray();
					String temp = "";
					for (int i = 0; i < toUserList.size(); i++) {
						Users curUser = toUserList.get(i);
						if (curUser != null) {
							temp += curUser.getUserName();
							usersList += curUser.getSerial();
							if (i != toUserList.size() - 1) {
								temp += ",";
								usersList += ",";
							}
						}
					}
					txtUsers.setText(temp);
					txtUsers.requestFocus();
				}
			}
		});
		btnUserAdd.setText("+");
		btnUserAdd.setArc(0.4f);
		btnUserAdd.setBounds(341, 27, 56, 21);
		btnUserAdd.setForeground(DEF_COLOR);
		btnUserAdd.setBackground(Color.WHITE);
		btnUserAdd.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnUserAdd.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		panel_8.add(btnUserAdd);

		btnDepartmentAdd = new JxButton();
		btnDepartmentAdd.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameUsersAdd fua = new FrameUsersAdd("Department");
				SwingUtils.center(fua);
				fua.setVisible(true);
				fua.getToUserList();
				Object[] temp2 = null;
				if (fua.isCancel() == false) {
					temp2 = fua.getSelectedList();
				}
				String string = "";
				if (temp2 != null) {
					for (int i = 0; i < temp2.length; i++) {
						string += temp2[i].toString() + ", ";
					}
				}
				txtDepartment.setText(string);
				txtDepartment.requestFocus();
			}
		});
		btnDepartmentAdd.setText("+");
		btnDepartmentAdd.setArc(0.4f);
		btnDepartmentAdd.setBounds(340, 49, 56, 21);
		btnDepartmentAdd.setForeground(DEF_COLOR);
		btnDepartmentAdd.setBackground(Color.WHITE);
		btnDepartmentAdd.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnDepartmentAdd.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		panel_8.add(btnDepartmentAdd);

		final JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setLayout(null);
		panel_9.setBounds(33, 610, 407, 28);
		add(panel_9);

		final JLabel ownerStatusLabel = new JLabel();
		ownerStatusLabel.setText("Owner Status");
		ownerStatusLabel.setBounds(10, 10, 78, 14);
		ownerStatusLabel.setForeground(DEF_COLOR);
		ownerStatusLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		panel_9.add(ownerStatusLabel);

		rbPending = new JRadioButton();
		rbPending.setActionCommand("1");
		bgOwnerStatusType.add(rbPending);
		rbPending.setBackground(Color.WHITE);
		rbPending.setText("Pending");
		rbPending.setBounds(94, 8, 73, 18);
		rbPending.setForeground(DEF_COLOR);
		rbPending.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		panel_9.add(rbPending);

		rbCompleted = new JRadioButton();
		rbCompleted.setActionCommand("2");
		bgOwnerStatusType.add(rbCompleted);
		rbCompleted.setBackground(Color.WHITE);
		rbCompleted.setText("Completed");
		rbCompleted.setForeground(DEF_COLOR);
		rbCompleted.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		rbCompleted.setBounds(222, 8, 86, 18);
		panel_9.add(rbCompleted);

		final JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBackground(Color.WHITE);
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBounds(33, 640, 407, 28);
		add(panel_2_1_1);

		final JLabel formLabel_2_1_1 = new JLabel();
		formLabel_2_1_1.setText("Don't show Alert until");
		formLabel_2_1_1.setForeground(DEF_COLOR);
		formLabel_2_1_1.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		formLabel_2_1_1.setBounds(10, 5, 127, 14);
		formLabel_2_1_1.setVisible(false);
		panel_2_1_1.add(formLabel_2_1_1);

		txtAlertUntil = new JFormattedTextField();
		txtAlertUntil.setBounds(143, 0, 80, 25);
		txtAlertUntil.setForeground(DEF_COLOR);
		txtAlertUntil.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		txtAlertUntil.setVisible(false);
		panel_2_1_1.add(txtAlertUntil);

		cmbAlertTypeUntil = new JxComboBox();
		cmbAlertTypeUntil.setBackground(Color.WHITE);
		cmbAlertTypeUntil.setModel(new DefaultComboBoxModel(new String[] { "",
				"Minutes", "Hours", "Days" }));
		cmbAlertTypeUntil.setBorder(new LineBorder(new Color(49, 104, 127), 1,
				false));
		cmbAlertTypeUntil.setArc(0.4f);
		cmbAlertTypeUntil.setForeground(DEF_COLOR);
		cmbAlertTypeUntil.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		cmbAlertTypeUntil.setBounds(245, 0, 75, 25);
		cmbAlertTypeUntil.setVisible(false);
		panel_2_1_1.add(cmbAlertTypeUntil);

		presentationModel = new PresentationModel(myMap, Alert.class,
				conAlertAdd, errorLabel);
		presentationModel.validateAll();

		fillcombo();
		doLoad(str);

	}

	public void disableSaveBtn() {
		btnSave.setEnabled(false);
	}

	private void fillcombo() {
		String result = null;
		try {
			result = MedrexClientManager.getInstance().getUserName(
					Global.currentLoggedInUserKey);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cmbSignature.addItem(result);
	}

	private final double AVERAGE_MILLIS_PER_MONTH = 365.24 * 24 * 60 * 60
			* 1000 / 12;

	public double monthsBetween(Date d1, Date d2) {
		return (d2.getTime() - d1.getTime()) / AVERAGE_MILLIS_PER_MONTH;
	}

	public void setDepartmentString() {
		new ArrayList<String>();
		String str = txtDepartment.getText().trim();
		StringTokenizer st = new StringTokenizer(str);
		String uses = "";
		while (st.hasMoreTokens()) {
			String s = st.nextToken(",");
			// System.out.println("s: "+s);
			List<Users> tempList = new ArrayList<Users>();

			try {
				tempList = (MedrexClientManager.getInstance()
						.getUserListFromDepartment(s.trim()));
				if (tempList.size() != 0) {
					Iterator i = tempList.iterator();
					while (i.hasNext()) {
						Users u = (Users) i.next();
						uses += u.getSerial() + ",";
						// System.out.println("u.getUserName(): "+u.getUserName());
						// usertemplist.add(u.getUserName());
					}
				}
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MedrexException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// System.out.println("usertemplist: "+uses);
		dapartmentString = uses;

		// Iterator it = usertemplist.iterator();
		// while(it.hasNext()){
		// dapartmentString += (String) it.next() + ", ";
		// // dapartmentString += ", ";
		// System.out.println("depart:" + dapartmentString);
		// }

		/*
		 * for (int i = 0; i < usertemplist.size(); i++) { curUser = (String)
		 * usertemplist.get(i); if (curUser != null) { // temp +=
		 * curUser.getUserName(); if (i != usertemplist.size() - 1) { curUser +=
		 * ", "; } } }
		 */

	}

	protected boolean doSave(String str) {
		String strError = "";
		// System.out.println("keys are:" + Global.currentAlertKey +" , "+
		// Global.currentPendingAlertKey);
		if (!txtDepartment.getText().equalsIgnoreCase("")) {
			setDepartmentString();
		}

		final Alert alert = new Alert();
		alert.setSerial(Global.currentAlertKey);

		if (str.equalsIgnoreCase("Resident Alert")) {
			alert.setResidentId(Global.currentResidenceKey);
		} else if (str.equalsIgnoreCase("Global Alert")) {
			alert.setResidentId(GLOBAL_ALERT_ID);
		}
		alert.setOwnerStatus(Integer.parseInt(bgOwnerStatusType.getSelection()
				.getActionCommand()));
		alert.setRecieverUser(usersList.trim());
		alert.setRecieverDepartment(dapartmentString.trim());
		alert.setDepartment(txtDepartment.getText());
		alert.setDailyTimes(txtDailyTimes.getText());
		alert.setUser(txtUsers.getText());
		if (rbInterval.isSelected()) {
			if (txtDailyTimes.getText() != null) {
				alert.setDailyTimes(txtDailyTimes.getText());
			}
		}

		if (isImmediate.equalsIgnoreCase("Yes")) {
			if (Integer.parseInt(getImmediateBg) == 2) {
				alert.setStartTime(immediateTimes);
				alert.setBeginDate(immediateDate);
			} else {
				alert.setBeginDate(dcDate.getDate());
			}
			alert.setEndDate(dcDate.getDate());
			alert.setImmediateAlertType(Integer.parseInt(getImmediateBg));
		} else {
			alert.setBeginDate(dcBegin.getDate());
			alert.setEndDate(dcEnd.getDate());
			alert.setImmediateAlertType(0);
			alert.setStartTime((Date) spinner.getValue());
		}

		if ((cmbAlertTypeUntil.getSelectedIndex() == 0 && txtAlertUntil
				.getText().equalsIgnoreCase(""))
				|| ((cmbAlertTypeUntil.getSelectedIndex() == -1) && txtAlertUntil
						.getText().equalsIgnoreCase("0"))) {
			alert.setAlertUntilTime(0);
			alert.setAlertUntilType(null);
		} else {
			alert.setAlertUntilTime(Integer.parseInt(txtAlertUntil.getText()));
			alert.setAlertUntilType(cmbAlertTypeUntil.getSelectedItem()
					.toString());
		}

		alert.setDate(dcDate.getDate());
		if (str.equalsIgnoreCase("Resident Alert")) {
			alert.setOutOfPass(cbOutOfPass.isSelected());
			alert.setDischarged(cbDischarged.isSelected());
		}
		alert.setNotes(txtNotes.getText());

		alert.setOwner(Global.currentLoggedInUserKey);
		if (!(txtIntervalTime.getText().equalsIgnoreCase(""))) {
			alert.setIntervalTime(Integer.parseInt(txtIntervalTime.getText()));
		} else {
			alert.setIntervalTime(0);
		}
		alert.setIntervalType(cmbIntervalType.getSelectedItem().toString());
		alert.setStatus(bg.getSelection().getActionCommand());
		alert.setAlertType(Integer.parseInt(bgAlertType.getSelection()
				.getActionCommand()));

		if (cbSignature.isSelected() == true) {
			alert.setSignature(cmbSignature.getSelectedItem().toString());
		} else {
			alert.setSignature(null);
		}
		if (cbSuspend.isSelected() == true) {
			alert.setSuspendTime(Integer.parseInt(txtSuspendTime.getText()));
			alert.setSuspendType(cmbSuspendType.getSelectedItem().toString());
		} else {
			alert.setSuspendTime(0);
			alert.setSuspendType(null);
		}
		if (txtUsers.getText() == null && txtDepartment.getText() != null) {
			txtUsers.setText(" ");
			txtUsers.requestFocus();
		}
		if (txtDepartment.getText() == null && txtUsers.getText() != null) {
			txtDepartment.setText(" ");
			txtDepartment.requestFocus();
		}
		List errors = conAlertAdd.doValidate(alert, "");
		MsgBox m = new MsgBox();
		if (errors.size() > 0) {

			Iterator itr = errors.iterator();

			while (itr.hasNext()) {
				strError += (String) itr.next() + "\n";
			}
			m.addPrompt(strError);
			m.setTitle("Error to save parer add");
			m.setVisible(true);
			return false;
		} else {
			if (txtIntervalTime.getText() != null) {
				int i = Integer.parseInt(txtIntervalTime.getText());

				if (i == 0 && rbInterval.isSelected()
						&& !(rbDaily.isSelected())) {
					strError += "Interval Time can not be 0 \n";
					m.addPrompt(strError);
					m.setTitle("Error to save parer add");
					m.setVisible(true);
					return false;
				}
			}
			if (txtDepartment.getText().equalsIgnoreCase("")
					&& txtUsers.getText().equalsIgnoreCase("")) {
				strError += "Please select any of the reciever \n";
				m.addPrompt(strError);
				m.setTitle("Error to save parer add");
				m.setVisible(true);
				return false;
			}
			fl = new FrameLoading(FrameAlertAdd.this.getDialog(), "Saving");
			fl.setTitle("Saving");
			javax.swing.SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					fl.callNotify();
				}
			});
			new Thread(new Runnable() {
				public void run() {
					try {
						Global.currentAlertKey = MedrexClientManager
								.getInstance().insertOrUpdateAlert(alert);
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (MedrexException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					// if (doSave(str)) {
					fl.dispose();
					FrameAlertAdd.this.close();
					// }
				}
			}).start();
			fl.setVisible(true);
			// fl.setTitle("Saving");
			// if ((txtIntervalTime.getText().equalsIgnoreCase("0")) &&
			// rbInterval.isSelected() && !(rbDaily.isSelected())) {
			// JOptionPane.showMessageDialog(null,
			// "Interval Time can not be 0");
			// return false;
			// } else {

			// }

			// List pendingAlertRecords = new ArrayList();
			//
			// if (Global.currentAlertKey != 0) {
			// try {
			// pendingAlertRecords = MedrexClientManager.getInstance()
			// .getPendingAlertRecords(Global.currentAlertKey);
			//
			// } catch (Exception e) {
			// e.printStackTrace();
			// }
			// }
			//
			// if (pendingAlertRecords != null) {
			// try {
			// MedrexClientManager.getInstance().deletePendingAlertRecord(
			// Global.currentAlertKey);
			// } catch (RemoteException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// } catch (MedrexException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			// }
			//
			// if (bg.getSelection().getActionCommand() == "Active") {
			//
			// if (bgAlertType.getSelection().getActionCommand() == "1") {
			//
			// int total = 0;
			// int num = 0;
			// Date time = MedrexClientManager.getServerTime();
			// int startDate = dcBegin.getDate().getDate();
			// if (!(txtIntervalTime.getText().equalsIgnoreCase(""))) {
			// num = Integer.parseInt(txtIntervalTime.getText());
			// } else {
			// num = 0;
			// }
			// time = (Date) spinner.getValue();
			// Date date = (Date) spinner.getValue();
			//
			// double mon = monthsBetween(dcBegin.getDate(), dcEnd.getDate());
			// int month = (int) Math.round(mon);
			//
			// long milliSeconds = (dcEnd.getDate().getTime())
			// - (dcBegin.getDate().getTime());
			// int days = (int) (milliSeconds / (24 * 60 * 60 * 1000));
			// long y = 24 * 60 * 60 * 1000 * 365;
			// int year = (int) ((milliSeconds / (24 * 60 * 60 * 1000)) / 365);
			// if (days != 0) {
			// days = days;
			// } else {
			// days += 1;
			// }
			// if (month != 0) {
			// month = month;
			// } else {
			// month += 1;
			// }
			// if (year != 0) {
			// total = year * 12;
			// } else {
			// total = 0;
			// }
			// if (cmbIntervalType.getSelectedItem().toString()
			// .equalsIgnoreCase("Minutes")) {
			// total = (total + month + days * 24 * 60) / num;
			// } else if (cmbIntervalType.getSelectedItem().toString()
			// .equalsIgnoreCase("Hrs")) {
			// total = (total + month + days * 24) / num;
			// } else if (cmbIntervalType.getSelectedItem().toString()
			// .equalsIgnoreCase("Days")) {
			// total = (total + month + days) / num;
			// } else if (cmbIntervalType.getSelectedItem().toString()
			// .equalsIgnoreCase("Months")) {
			// total = (total + month) / num;
			// }
			// time = dcBegin.getDate();
			// time.setHours(date.getHours());
			// time.setMinutes(date.getMinutes());
			//
			// for (int i = 1; i <= total; i++) {
			// Date bgDate = dcBegin.getDate();
			// if (cmbIntervalType.getSelectedItem().toString()
			// .equalsIgnoreCase("Minutes")) {
			// if (bgDate.before(dcEnd.getDate())) {
			// time.setMinutes(time.getMinutes() + num);
			// }
			// } else if (cmbIntervalType.getSelectedItem().toString()
			// .equalsIgnoreCase("Hrs")) {
			// if (bgDate.before(dcEnd.getDate())) {
			// time.setHours(time.getHours() + num);
			// }
			// } else if (cmbIntervalType.getSelectedItem().toString()
			// .equalsIgnoreCase("Days")) {
			// bgDate.setDate(bgDate.getDate() + (num * i));
			// if (bgDate.before(dcEnd.getDate())) {
			// time = bgDate;
			// time.setHours(date.getHours());
			// time.setMinutes(date.getMinutes());
			// }
			// } else if (cmbIntervalType.getSelectedItem().toString()
			// .equalsIgnoreCase("Months")) {
			// if (bgDate.before(dcEnd.getDate())) {
			// bgDate.setMonth(bgDate.getMonth() + (num * i));
			// time = bgDate;
			// time.setHours(date.getHours());
			// time.setMinutes(date.getMinutes());
			// }
			// }
			// PendingAlert pa = new PendingAlert();
			// pa.setBeginDate(dcBegin.getDate());
			// pa.setEndDate(dcEnd.getDate());
			// pa.setUpdater(Global.currentLoggedInUserKey);
			// if (txtUsers.getText() != null && dapartmentString != null) {
			// pa.setRecieverId(txtUsers.getText() + ", " + dapartmentString +
			// "admin");
			// } else if (txtUsers.getText() != null && dapartmentString ==
			// null) {
			// pa.setRecieverId(txtUsers.getText() + "admin");
			// } else if (txtUsers.getText() == null && dapartmentString !=
			// null) {
			// pa.setRecieverId(dapartmentString + "admin");
			// }
			// pa.setOwnerStatus(Integer.parseInt(bgOwnerStatusType.getSelection().getActionCommand()));
			// pa.setOwner(Global.currentLoggedInUserKey);
			// pa.setIntervalTime(Integer.parseInt(txtIntervalTime
			// .getText()));
			// pa.setIntervalType(cmbIntervalType.getSelectedItem()
			// .toString());
			// pa.setNotes(txtNotes.getText());
			// if (str.equalsIgnoreCase("Resident Alert")) {
			// pa.setResidentId(Global.currentResidenceKey);
			// } else if (str.equalsIgnoreCase("Global Alert")) {
			// pa.setResidentId(GLOBAL_ALERT_ID);
			// }
			// pa.setAlertSerial(Global.currentAlertKey);
			// pa.setSerial(Global.currentPendingAlertKey);
			// pa.setStatus(bg.getSelection().getActionCommand());
			// pa.setAlertTime(time);
			// try {
			// MedrexClientManager.getInstance()
			// .insertOrUpdatePendingAlert(pa);
			// } catch (RemoteException e1) {
			// // TODO Auto-generated catch block
			// e1.printStackTrace();
			// } catch (MedrexException e1) {
			// // TODO Auto-generated catch block
			// e1.printStackTrace();
			// }
			//
			// }
			//
			// } else if (bgAlertType.getSelection().getActionCommand() == "2")
			// {
			//
			// int total = 0;
			// int num = 0;
			// Date time = MedrexClientManager.getServerTime();
			// int startDate = dcBegin.getDate().getDate();
			// if (!(txtIntervalTime.getText().equalsIgnoreCase(""))) {
			// num = Integer.parseInt(txtIntervalTime.getText());
			// } else {
			// num = 0;
			// }
			// time = (Date) spinner.getValue();
			// Date date = (Date) spinner.getValue();
			//
			// double mon = monthsBetween(dcBegin.getDate(), dcEnd.getDate());
			// int month = (int) Math.round(mon);
			//
			// long milliSeconds = (dcEnd.getDate().getTime())
			// - (dcBegin.getDate().getTime());
			// int days = (int) (milliSeconds / (24 * 60 * 60 * 1000));
			// long y = 24 * 60 * 60 * 1000 * 365;
			// int year = (int) ((milliSeconds / (24 * 60 * 60 * 1000)) / 365);
			// if (days != 0) {
			// days = days;
			// } else {
			// days += 1;
			// }
			// if (month != 0) {
			// month = month;
			// } else {
			// month += 1;
			// }
			// if (year != 0) {
			// total = year * 12;
			// } else {
			// total = 0;
			// }
			//
			// List list = new ArrayList();
			// StringTokenizer temp = new StringTokenizer(txtDailyTimes
			// .getText());
			// int n = 0;
			// while (temp.hasMoreElements()) {
			// list.add(temp.nextToken(";"));
			// }
			// total = days;
			// Date bgDate = dcBegin.getDate();
			// // System.out.println("Total is :" + total);
			// for (int i = 0; i <= total; i++) {
			//					
			// for (int j = 0; j < list.size(); j++) {
			// DateFormat formatter = new SimpleDateFormat("hh:mm a");
			// try {
			// time = (Date) formatter.parse((String) list.get(j));
			// } catch (ParseException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			//						
			// if (bgDate.before(dcEnd.getDate())) {
			// time.setYear(bgDate.getYear());
			// time.setMonth(bgDate.getMonth());
			// time.setDate(bgDate.getDate());
			// }
			//
			//						
			// PendingAlert pa = new PendingAlert();
			// pa.setBeginDate(dcBegin.getDate());
			// pa.setUpdater(Global.currentLoggedInUserKey);
			// pa.setEndDate(dcEnd.getDate());
			// // pa.setRecieverId(txtUsers.getText() + ", " +
			// dapartmentString);
			// if (txtUsers.getText() != null && dapartmentString != null) {
			// pa.setRecieverId(txtUsers.getText() + ", " + dapartmentString +
			// ", " + "admin");
			// } else if (txtUsers.getText() != null && dapartmentString ==
			// null) {
			// pa.setRecieverId(txtUsers.getText() + ", " + "admin");
			// } else if (txtUsers.getText() == null && dapartmentString !=
			// null) {
			// pa.setRecieverId(dapartmentString + ", " + "admin");
			// }
			// pa.setIntervalTime(Integer.parseInt(txtIntervalTime
			// .getText()));
			// pa.setIntervalType(cmbIntervalType.getSelectedItem()
			// .toString());
			// pa.setNotes(txtNotes.getText());
			// if (str.equalsIgnoreCase("Resident Alert")) {
			// pa.setResidentId(Global.currentResidenceKey);
			// } else if (str.equalsIgnoreCase("Global Alert")) {
			// pa.setResidentId(GLOBAL_ALERT_ID);
			// }
			// pa.setAlertSerial(Global.currentAlertKey);
			// pa.setOwnerStatus(Integer.parseInt(bgOwnerStatusType.getSelection().getActionCommand()));
			// pa.setOwner(Global.currentLoggedInUserKey);
			// pa.setSerial(Global.currentPendingAlertKey);
			// pa.setStatus(bg.getSelection().getActionCommand());
			// pa.setAlertTime(time);
			// try {
			// MedrexClientManager.getInstance()
			// .insertOrUpdatePendingAlert(pa);
			// } catch (RemoteException e1) {
			// // TODO Auto-generated catch block
			// e1.printStackTrace();
			// } catch (MedrexException e1) {
			// // TODO Auto-generated catch block
			// e1.printStackTrace();
			// }
			// }
			// bgDate.setYear(time.getYear());
			// bgDate.setMonth(time.getMonth());
			// bgDate.setDate(time.getDate() + 1);
			// }
			// }
			//
			// } else {
			// try {
			// MedrexClientManager.getInstance().deletePendingAlertRecord(
			// Global.currentAlertKey);
			// } catch (RemoteException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// } catch (MedrexException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			// }
		}
		return true;
	}

	public void doLoad(String str) {
		// System.out.println("Alert key is :" + Global.currentAlertKey);

		if (Global.currentAlertKey != 0) {
			Alert alert = new Alert();
			try {
				// if (str.equalsIgnoreCase("Resident Alert")) {
				alert = MedrexClientManager.getInstance().getAlertRecord(
						Global.currentAlertKey);
				// } else if (str.equalsIgnoreCase("Global Alert")) {
				// alert =
				// MedrexClientManager.getInstance().getGlobalAlertRecord(globalAlertId);
				// }
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MedrexException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			dcDate.setDate(alert.getDate());
			txtDepartment.setText(alert.getDepartment());
			dcBegin.setDate(alert.getBeginDate());
			dcEnd.setDate(alert.getEndDate());
			cmbSignature.setSelectedItem(alert.getSignature());
			cmbIntervalType.setSelectedItem(alert.getIntervalType());
			txtIntervalTime.setText(alert.getIntervalTime() + "");
			cmbSuspendType.setSelectedItem(alert.getSuspendType());
			if (alert.getAlertType() == 3) {
				txtDailyTimes.setText("");
				txtIntervalTime.setEnabled(false);
				cmbIntervalType.setEnabled(false);
				spinner.setEnabled(false);
				btnPlus.setEnabled(false);
				dcBegin.setEnabled(false);
				dcEnd.setEnabled(false);
				rbOneTime.setSelected(true);
			} else if (alert.getAlertType() == 2) {
				rbDaily.setSelected(true);
				txtDailyTimes.setText(alert.getDailyTimes() + "");
			} else {
				rbInterval.setSelected(true);
				spinner.setValue(alert.getStartTime());
				txtDailyTimes.setText(alert.getDailyTimes() + "");
			}
			txtNotes.setText(alert.getNotes());
			txtSuspendTime.setText(alert.getSuspendTime() + "");
			txtAlertUntil.setText(alert.getAlertUntilTime() + "");
			cmbAlertTypeUntil.setSelectedItem(alert.getAlertUntilType());
			if (str.equalsIgnoreCase("Resident Alert")) {
				cbDischarged.setSelected(alert.isDischarged());
				cbOutOfPass.setSelected(alert.isOutOfPass());
			}
			// txtDailyTimes.setText(alert.getDailyTimes());

			SwingUtils.setSelectedButton(bgOwnerStatusType, alert
					.getOwnerStatus());
			txtUsers.setText(alert.getUser());
			// txtDepartment.setText(alert.getRecieverDepartment());
			SwingUtils.setSelectedButton(bgAlertType, alert.getAlertType());
			if (alert.getAlertType() == 1) {
				SwingUtils.setSelectedButton(bgAlertType, alert.getAlertType());
				btnPlus.setEnabled(false);
			} else {
				spinner.setEnabled(false);
			}
			if (alert.getSuspendTime() != 0 && alert.getSuspendType() != null) {
				cbSuspend.setSelected(true);
			} else {
				cbSuspend.setSelected(false);
			}
			if (alert.getSignature() != null) {
				cbSignature.setSelected(true);
			} else {
				cbSignature.setSelected(false);
			}
			if (alert.getStatus().toString().equalsIgnoreCase("Active")) {
				rbActive.setSelected(true);
				rbInActive.setSelected(false);
			} else {
				rbActive.setSelected(false);
				rbInActive.setSelected(true);
			}
			if (cmbIntervalType.getSelectedIndex() > 2) {
				btnPlus.setEnabled(true);
			}
			if (rbInterval.isSelected()) {
				if (alert.getDailyTimes() != null) {
					txtDailyTimes.setEnabled(true);
					txtDailyTimes.setEditable(true);
					spinner.setEnabled(true);
				} else {
					txtDailyTimes.setEnabled(true);
					spinner.setEnabled(true);
					txtDailyTimes.setEditable(true);
				}
			}

		} else {
			dcDate.setDate(date);
			dcBegin.setDate(null);
			dcEnd.setDate(null);
			cmbSignature.setSelectedIndex(0);
			cmbIntervalType.setSelectedIndex(3);
			cmbSuspendType.setSelectedIndex(0);
			txtIntervalTime.setText("0");
			txtNotes.setText("");
			txtSuspendTime.setText("");
			if (str.equalsIgnoreCase("Resident Alert")) {
				cbDischarged.setSelected(true);
				cbOutOfPass.setSelected(true);
			}
			rbActive.setSelected(true);
			cbSignature.setSelected(false);
			cbSuspend.setSelected(false);
			txtSuspendTime.setEnabled(false);
			cmbSuspendType.setEnabled(false);
			txtIntervalTime.setEnabled(true);
			cmbIntervalType.setEnabled(true);
			cmbSignature.setEnabled(false);
			rbInterval.setSelected(true);
			rbDaily.setSelected(false);
			txtDailyTimes.setEnabled(false);
			btnPlus.setEnabled(false);
			rbPending.setSelected(true);
			txtUsers.setText("");
			txtDepartment.setText("");
			txtAlertUntil.setText("");
			cmbAlertTypeUntil.setSelectedIndex(0);
			cmbIntervalType.requestFocus();
			if (cmbIntervalType.getSelectedIndex() > 2) {
				btnPlus.setEnabled(true);
			}
		}
		presentationModel = new PresentationModel(myMap, Alert.class,
				conAlertAdd, errorLabel);
		presentationModel.validateAll();
	}

}