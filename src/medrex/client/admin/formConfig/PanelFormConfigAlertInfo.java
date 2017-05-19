package medrex.client.admin.formConfig;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.ButtonGroup;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.alert.FrameUsersAdd;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.alert.FormConfigAlert;
import medrex.commons.vo.others.Users;

import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;

public class PanelFormConfigAlertInfo extends PopUpView {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6854276795219528281L;
	private JLabel labelLoggedInUser;
	private JEditorPane txtMessage;
	private JxComboBox cmbEnd;
	private JxComboBox cmbStartFrom;
	private JFormattedTextField txtEnd;
	private JFormattedTextField txtStartFrom;
	private static final Color DEF_COLOR = new Color(49, 104, 127);
	private static final Color BORDER_COL = new Color(180, 188, 193);
	private ButtonGroup bg = new ButtonGroup();
	private ButtonGroup bgAlertType = new ButtonGroup();
	private ButtonGroup bgOwnerStatusType = new ButtonGroup();
	private String usersList = "";
	private List<Users> toUserList;

	private JFormattedTextField txtIntervalTime;
	private JxComboBox cmbIntervalType;
	private JRadioButton rbInterval;
	private JRadioButton rbDaily;
	private JTextField txtDailyTimes;
	private JxButton btnPlus;
	private SpinnerDateModel model;
	private JSpinner spinner;
	private JRadioButton rbOneTime;
	private JxButton btnSave;
	private JTextField txtUsers;
	private JTextField txtDepartment;
	private JxButton btnUserAdd;
	private JxButton btnDepartmentAdd;
	private FormConfigAlert alertObj;
	private String fieldName;
	private JLabel dateLabel;

	public PanelFormConfigAlertInfo(FormConfigAlert alertObject,
			String nameOfField) {
		setLayout(null);
		this.alertObj = alertObject;
		Global.panelFormConfigAlert = this;
		this.fieldName = nameOfField;
		setPreferredSize(new Dimension(450, 330));
		setSize(450, 330);
		setForeground(GuiModes.DESIGNER_FORMS.getDefaultForegroundColor());
		setBackground(GuiModes.DESIGNER_FORMS.getDefaultBackgroundColor());
		setFont(GuiModes.DESIGNER_FORMS.getDefaultFont());

		/*
		 * final JPanel panel_2 = new JPanel(); panel_2.setOpaque(false);
		 * panel_2.setLayout(null); panel_2.setBounds(33, 50, 407, 130);
		 * add(panel_2);
		 * 
		 * final JLabel formLabel_2 = new JLabel();
		 * formLabel_2.setForeground(DEF_COLOR);
		 * formLabel_2.setBackground(GuiModes.DESIGNER_FORMS
		 * .getControlBackgroundColor());
		 * formLabel_2.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		 * formLabel_2.setText("Interval"); formLabel_2.setBounds(10, 37, 75,
		 * 28); panel_2.add(formLabel_2);
		 * 
		 * txtIntervalTime = new JFormattedTextField(FieldFormatter.MAX3);
		 * txtIntervalTime.setForeground(DEF_COLOR);
		 * txtIntervalTime.setBackground(GuiModes.DESIGNER_FORMS
		 * .getControlBackgroundColor());
		 * txtIntervalTime.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		 * txtIntervalTime
		 * .setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		 * txtIntervalTime.setBounds(91, 37, 80, 25);
		 * panel_2.add(txtIntervalTime);
		 * 
		 * cmbIntervalType = new JxComboBox();
		 * cmbIntervalType.addItemListener(new ItemListener() { public void
		 * itemStateChanged(final ItemEvent e) { JxComboBox cb = (JxComboBox)
		 * e.getSource(); String newSelection = (String) cb.getSelectedItem();
		 * if (newSelection.equalsIgnoreCase("Minutes") ||
		 * newSelection.equalsIgnoreCase("Hrs")) {
		 * txtDailyTimes.setEnabled(false); btnPlus.setEnabled(false); } if
		 * (newSelection.equalsIgnoreCase("Days") ||
		 * newSelection.equalsIgnoreCase("Weeks") ||
		 * newSelection.equalsIgnoreCase("Months") ||
		 * newSelection.equalsIgnoreCase("Years")) {
		 * txtDailyTimes.setEnabled(true); btnPlus.setEnabled(true); } } });
		 * cmbIntervalType.setModel(new DefaultComboBoxModel(new String[] {"",
		 * "Minutes", "Hrs", "Days", "Weeks", "Months", "Years"}));
		 * cmbIntervalType.setBackground(Color.WHITE);
		 * cmbIntervalType.setForeground(DEF_COLOR);
		 * cmbIntervalType.setArc(0.4f); cmbIntervalType.setBorder(new
		 * LineBorder(DEF_COLOR, 1, false)); cmbIntervalType.setBounds(190, 37,
		 * 75, 25); panel_2.add(cmbIntervalType);
		 * 
		 * final JLabel alertTypeLabel = new JLabel();
		 * alertTypeLabel.setForeground(DEF_COLOR);
		 * alertTypeLabel.setBackground(GuiModes.DESIGNER_FORMS
		 * .getControlBackgroundColor());
		 * alertTypeLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		 * alertTypeLabel.setText("Alert Type"); alertTypeLabel.setBounds(10,
		 * 10, 66, 16); panel_2.add(alertTypeLabel);
		 * 
		 * rbInterval = new JRadioButton(); rbInterval.addMouseListener(new
		 * MouseAdapter() { public void mouseClicked(final MouseEvent e) {
		 * txtIntervalTime.setEnabled(true); cmbIntervalType.setEnabled(true);
		 * txtDailyTimes.setEnabled(false); spinner.setEnabled(true);
		 * btnPlus.setEnabled(false); txtDailyTimes.setText(""); if
		 * (cmbIntervalType.getSelectedIndex() > 2) { btnPlus.setEnabled(true);
		 * 
		 * }
		 * 
		 * } }); bgAlertType.add(rbInterval); rbInterval.setActionCommand("1");
		 * rbInterval.setBackground(Color.WHITE);
		 * rbInterval.setForeground(DEF_COLOR);
		 * rbInterval.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		 * rbInterval.setText("Interval"); rbInterval.setBounds(91, 9, 106, 18);
		 * panel_2.add(rbInterval);
		 * 
		 * rbDaily = new JRadioButton(); rbDaily.addMouseListener(new
		 * MouseAdapter() { public void mouseClicked(final MouseEvent e) {
		 * txtIntervalTime.setText("0"); spinner.setEnabled(false);
		 * cmbIntervalType.setSelectedIndex(0);
		 * txtIntervalTime.setEnabled(false); cmbIntervalType.setEnabled(false);
		 * txtDailyTimes.setEnabled(true); btnPlus.setEnabled(true); } });
		 * bgAlertType.add(rbDaily); rbDaily.setActionCommand("2");
		 * rbDaily.setBackground(Color.WHITE); rbDaily.setForeground(DEF_COLOR);
		 * rbDaily.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		 * rbDaily.setText("Daily"); rbDaily.setBounds(214, 9, 56, 18);
		 * panel_2.add(rbDaily);
		 * 
		 * final JLabel dailyLabel = new JLabel();
		 * dailyLabel.setText("Time (s)"); dailyLabel.setBounds(10, 106, 66,
		 * 14); dailyLabel.setForeground(DEF_COLOR);
		 * dailyLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		 * panel_2.add(dailyLabel);
		 * 
		 * txtDailyTimes = new JTextField(); txtDailyTimes.setEditable(false);
		 * txtDailyTimes.setBounds(91, 103, 206, 21);
		 * txtDailyTimes.setForeground(DEF_COLOR);
		 * txtDailyTimes.setBackground(GuiModes.DESIGNER_FORMS
		 * .getControlBackgroundColor());
		 * txtDailyTimes.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		 * txtDailyTimes.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		 * panel_2.add(txtDailyTimes);
		 * 
		 * btnPlus = new JxButton(); btnPlus.addActionListener(new
		 * ActionListener() { public void actionPerformed(final ActionEvent e) {
		 * PanelTimeAddDialog ptd = new
		 * PanelTimeAddDialog(txtDailyTimes.getText());
		 * SwingUtils.openInDialog(ptd);
		 * txtDailyTimes.setText(ptd.getTextString());
		 * txtDailyTimes.setEnabled(true); } }); btnPlus.setText("+");
		 * btnPlus.setArc(0.4f); btnPlus.setBackground(Color.WHITE);
		 * btnPlus.setForeground(DEF_COLOR); btnPlus.setBorder(new
		 * LineBorder(BORDER_COL, 1, false)); btnPlus.setFont(new Font("",
		 * Font.BOLD, 12)); btnPlus.setBounds(311, 103, 41, 21);
		 * panel_2.add(btnPlus);
		 * 
		 * model = new SpinnerDateModel();
		 * model.setCalendarField(Calendar.HOUR_OF_DAY); spinner = new
		 * JSpinner(model); spinner.setBounds(91, 72, 106, 20);
		 * panel_2.add(spinner); JSpinner.DateEditor editor = new
		 * JSpinner.DateEditor(spinner, "hh:mm a"); spinner.setEditor(editor);
		 * 
		 * final JLabel startTimeLabel = new JLabel();
		 * startTimeLabel.setBounds(10, 75, 66, 16);
		 * panel_2.add(startTimeLabel); startTimeLabel.setText("Time");
		 * startTimeLabel.setFont(new Font("", Font.BOLD, 12));
		 * startTimeLabel.setForeground(DEF_COLOR);
		 * 
		 * rbOneTime = new JRadioButton(); rbOneTime.setActionCommand("3");
		 * rbOneTime.addMouseListener(new MouseAdapter() { public void
		 * mouseClicked(final MouseEvent e) { txtIntervalTime.setEnabled(false);
		 * txtDailyTimes.setEnabled(false); txtDailyTimes.setText("");
		 * cmbIntervalType.setEnabled(false); spinner.setEnabled(false);
		 * btnPlus.setEnabled(false); PanelImmediateAlertAdd pia = new
		 * PanelImmediateAlertAdd(); SwingUtils.openInDialog(pia); } });
		 * rbOneTime.setBackground(Color.WHITE); rbOneTime.setFont(new
		 * Font("Dialog", Font.BOLD, 12)); rbOneTime.setForeground(DEF_COLOR);
		 * rbOneTime.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		 * rbOneTime.setText("One Time"); rbOneTime.setBounds(303, 9, 94, 18);
		 * bgAlertType.add(rbOneTime); panel_2.add(rbOneTime);
		 */

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
		btnCancel.setBounds(250, 273, 95, 25);
		add(btnCancel);

		btnSave = new JxButton();
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSave();
				close();

			}
		});
		btnSave.setText("Save");
		btnSave.setArc(0.4f);
		btnSave.setBackground(Color.WHITE);
		btnSave.setForeground(DEF_COLOR);
		btnSave.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnSave.setFont(new Font("", Font.BOLD, 12));
		btnSave.setBounds(92, 273, 95, 25);
		add(btnSave);

		/*
		 * final JPanel panel_4 = new JPanel();
		 * panel_4.setBackground(Color.WHITE); panel_4.setLayout(null);
		 * panel_4.setBounds(33, 180, 407, 69); add(panel_4);
		 * 
		 * final JLabel beginDateLabel = new JLabel();
		 * beginDateLabel.setFont(new Font("", Font.BOLD, 12));
		 * beginDateLabel.setBounds(10, 10, 78, 14);
		 * beginDateLabel.setText("Start From");
		 * beginDateLabel.setForeground(DEF_COLOR); panel_4.add(beginDateLabel);
		 * 
		 * final JLabel endDateLabel = new JLabel(); endDateLabel.setFont(new
		 * Font("", Font.BOLD, 12)); endDateLabel.setText("End");
		 * endDateLabel.setBounds(10, 45, 78, 14);
		 * endDateLabel.setForeground(DEF_COLOR); panel_4.add(endDateLabel);
		 * 
		 * txtStartFrom = new JFormattedTextField(FieldFormatter.MAX3);
		 * txtStartFrom.setForeground(DEF_COLOR);
		 * txtStartFrom.setBackground(GuiModes.DESIGNER_FORMS
		 * .getControlBackgroundColor());
		 * txtStartFrom.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		 * txtStartFrom.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		 * txtStartFrom.setBounds(94, 6, 78, 25); panel_4.add(txtStartFrom);
		 * 
		 * txtEnd = new JFormattedTextField(FieldFormatter.MAX3);
		 * txtEnd.setForeground(DEF_COLOR);
		 * txtEnd.setBackground(GuiModes.DESIGNER_FORMS
		 * .getControlBackgroundColor());
		 * txtEnd.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		 * txtEnd.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		 * txtEnd.setBounds(94, 38, 78, 25); panel_4.add(txtEnd);
		 * 
		 * cmbStartFrom = new JxComboBox(); cmbStartFrom.setModel(new
		 * DefaultComboBoxModel(new String[] {"", "Hrs", "Days", "Weeks",
		 * "Months", "Years"})); cmbStartFrom.setBackground(Color.WHITE);
		 * cmbStartFrom.setForeground(DEF_COLOR); cmbStartFrom.setArc(0.4f);
		 * cmbStartFrom.setBorder(new LineBorder(DEF_COLOR, 1, false));
		 * cmbStartFrom.setBounds(183, 6, 75, 25); panel_4.add(cmbStartFrom);
		 * 
		 * cmbEnd = new JxComboBox(); cmbEnd.setModel(new
		 * DefaultComboBoxModel(new String[] {"", "Hrs", "Days", "Weeks",
		 * "Months", "Years"})); cmbEnd.setBackground(Color.WHITE);
		 * cmbEnd.setForeground(DEF_COLOR); cmbEnd.setArc(0.4f);
		 * cmbEnd.setBorder(new LineBorder(DEF_COLOR, 1, false));
		 * cmbEnd.setBounds(183, 38, 75, 25); panel_4.add(cmbEnd);
		 */

		final JLabel alertLabel = new JLabel();
		alertLabel.setHorizontalAlignment(SwingConstants.CENTER);
		alertLabel.setFont(new Font("", Font.BOLD, 18));
		alertLabel.setText("Form Config Alert");
		alertLabel.setForeground(DEF_COLOR);
		alertLabel.setBounds(138, 10, 167, 21);
		add(alertLabel);

		final JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_8.setLayout(null);
		panel_8.setBounds(22, 49, 407, 72);
		add(panel_8);

		final JLabel recieverLabel = new JLabel();
		recieverLabel.setBounds(10, 2, 66, 16);
		recieverLabel.setForeground(DEF_COLOR);
		recieverLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		recieverLabel.setText("Reciever");

		panel_8.add(recieverLabel);

		txtUsers = new JTextField();
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
		txtDepartment.setBounds(100, 49, 213, 21);
		txtDepartment.setEditable(false);
		txtDepartment.setForeground(DEF_COLOR);
		txtDepartment.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		panel_8.add(txtDepartment);

		btnUserAdd = new JxButton();
		btnUserAdd.addActionListener(new ActionListener() {
			private FrameUsersAdd fua;

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

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 156, 407, 100);
		add(scrollPane);

		txtMessage = new JEditorPane();
		txtMessage.setContentType("text/html");
		txtMessage.setBorder(new LineBorder(new Color(0, 153, 153), 1, false));
		if (this.fieldName != null) {
			txtMessage.setText(this.fieldName);
		}
		scrollPane.setViewportView(txtMessage);

		dateLabel = new JLabel();
		dateLabel.setForeground(ColorConstants.DEF_COLOR);
		dateLabel.setText("");
		dateLabel.setBounds(330, 10, 110, 20);
		add(dateLabel);

		final JLabel messageLabel = new JLabel();
		messageLabel.setForeground(ColorConstants.DEF_COLOR);
		messageLabel.setText("Message");
		messageLabel.setBounds(195, 134, 87, 16);
		add(messageLabel);

		labelLoggedInUser = new JLabel();
		labelLoggedInUser.setText("");
		labelLoggedInUser.setForeground(ColorConstants.DEF_COLOR);
		labelLoggedInUser.setBounds(10, 14, 122, 16);
		add(labelLoggedInUser);

		doUpdate();

	}

	private void doUpdate() {
		if (alertObj != null) {
			txtUsers.setText(alertObj.getRecieverUser());
			txtDepartment.setText(alertObj.getRecieverDepartment());
			txtMessage.setText(alertObj.getMessage());
			txtUsers.setText(alertObj.getUserNames());
			txtDepartment.setText(alertObj.getDepartmentNames());
			// SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			// System.out.println("date is:"+alertObj.getAlertDate());
			// if(alertObj.getAlertDate()!=null){
			// dateLabel.setText(df.format(alertObj.getAlertDate())+"");
			// }
			try {
				Users user = MedrexClientManager.getInstance().getUser(
						alertObj.getLoggedInUser());
				labelLoggedInUser.setText("Created By : " + user.getUserName());
			} catch (RemoteException e) {

				e.printStackTrace();
			} catch (MedrexException e) {

				e.printStackTrace();
			}

		}

	}

	protected void doSave() {

		FormConfigAlert alertRef = new FormConfigAlert();
		alertRef.setRecieverUser(usersList);
		alertRef.setRecieverDepartment(setDepartmentString());
		alertRef.setMessage(txtMessage.getText());
		alertRef.setLoggedInUser(Global.currentLoggedInUserKey);
		alertRef.setAlertDate(MedrexClientManager.getServerTime());
		alertRef.setUserInfo(Global.currentLoggedInUserName);
		alertRef.setDepartmentNames(txtDepartment.getText());
		alertRef.setUserNames(txtUsers.getText());
		setAlertObj(alertRef);
		/*
		 * try {
		 * Global.currentFormAlertConfig=MedrexClientManager.getInstance().
		 * insertFormConfigAlert(alertRef); } catch (RemoteException e) {
		 * 
		 * e.printStackTrace(); } catch (MedrexException e) {
		 * 
		 * e.printStackTrace(); }
		 */

	}

	public String setDepartmentString() {
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
		return uses;
	}

	@Override
	public String getTitle() {
		return "Form Config Alert Info";
	}

	public FormConfigAlert getAlertObj() {
		if (alertObj == null) {
			FormConfigAlert aObj = new FormConfigAlert();
			aObj.setLoggedInUser(Global.currentLoggedInUserKey);
			return aObj;
		}
		return alertObj;
	}

	public void setAlertObj(FormConfigAlert alertObj) {
		this.alertObj = alertObj;
	}
}
