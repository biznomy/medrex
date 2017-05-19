package medrex.client.admin.triggerWords;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.alert.FrameUsersAdd;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.admin.TriggerWord;
import medrex.commons.vo.others.Users;

import com.sX.swing.JxButton;

public class PanelTriggerWordsDialog extends PopUpView {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7247829961976531716L;
	private JTextArea textAreaDescription;
	private static final Color DEF_COLOR = new Color(49, 104, 127);
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);
	private JTextField txtWord;
	private JxButton btnDepartmentAdd;
	private JxButton btnUserAdd;
	private JTextField txtDepartment;
	protected FrameUsersAdd fua;
	private JTextField txtUsers;
	private List<Users> toUserList;
	private String usersList = "";
	private String dapartmentString = "";
	private Date myDate = null;

	public PanelTriggerWordsDialog() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(400, 250));
		setSize(400, 250);
		setForeground(GuiModes.DESIGNER_FORMS.getDefaultForegroundColor());
		setBackground(GuiModes.DESIGNER_FORMS.getDefaultBackgroundColor());
		setFont(GuiModes.DESIGNER_FORMS.getDefaultFont());

		final JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setLayout(null);
		panel.setBounds(0, 0, 400, 250);
		add(panel);

		final JxButton saveButton = new JxButton();
		saveButton.setArc(0.4f);
		saveButton.setBackground(Color.WHITE);
		saveButton.setForeground(DEF_COL);
		saveButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (doSave()) {
					close();
				}
			}
		});
		saveButton.setText("Save");
		saveButton.setBounds(156, 220, 85, 25);
		panel.add(saveButton);

		final JxButton cancelButton = new JxButton();
		cancelButton.setArc(0.4f);
		cancelButton.setBackground(Color.WHITE);
		cancelButton.setForeground(DEF_COL);
		cancelButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		cancelButton.setText("Cancel");
		cancelButton.setBounds(267, 220, 85, 25);
		panel.add(cancelButton);

		txtWord = new JTextField();
		txtWord.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		txtWord.setBorder(new LineBorder(BORDER_COL, 1, false));
		txtWord.setBounds(105, 49, 247, 25);
		panel.add(txtWord);

		final JLabel lblDietName = new JLabel();
		lblDietName.setForeground(DEF_COL);
		lblDietName.setText("Word");
		lblDietName.setBackground(Color.WHITE);
		lblDietName.setFont(new Font("", Font.BOLD, 12));
		lblDietName.setHorizontalAlignment(SwingConstants.LEFT);
		lblDietName.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDietName.setBounds(20, 53, 66, 16);
		panel.add(lblDietName);

		final JLabel lblCategory = new JLabel();
		lblCategory.setForeground(DEF_COL);
		lblCategory.setText("Description");
		lblCategory.setBackground(Color.WHITE);
		lblCategory.setFont(new Font("", Font.BOLD, 12));
		lblCategory.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategory.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCategory.setBounds(20, 94, 66, 16);
		// lblCategory.setVisible(false);
		panel.add(lblCategory);

		final JLabel lblDiet = new JLabel();
		lblDiet.setForeground(DEF_COL);
		lblDiet.setText("Add Trigger Word");
		lblDiet.setBackground(Color.WHITE);
		lblDiet.setFont(new Font("", Font.BOLD, 16));
		lblDiet.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiet.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDiet.setBounds(10, 0, 375, 43);
		panel.add(lblDiet);

		textAreaDescription = new JTextArea();
		textAreaDescription.setBorder(new LineBorder(BORDER_COL, 1, false));
		textAreaDescription.setBounds(105, 85, 247, 49);
		// textAreaDescription.setVisible(false);
		panel.add(textAreaDescription);

		final JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(BORDER_COL, 1, false));
		panel_8.setBackground(Color.WHITE);
		panel_8.setLayout(null);
		panel_8.setBounds(10, 148, 380, 67);
		panel.add(panel_8);

		final JLabel recieverLabel = new JLabel();
		recieverLabel.setBounds(10, 0, 66, 16);
		recieverLabel.setForeground(DEF_COLOR);
		recieverLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		recieverLabel.setText("Reciever");

		panel_8.add(recieverLabel);

		txtUsers = new JTextField();
		txtUsers.setBounds(100, 15, 213, 21);
		txtUsers.setEditable(false);
		txtUsers.setForeground(DEF_COLOR);
		txtUsers.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		panel_8.add(txtUsers);

		final JLabel userLabel = new JLabel();
		userLabel.setText("User");
		userLabel.setBounds(20, 20, 54, 14);
		userLabel.setForeground(DEF_COLOR);
		userLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		panel_8.add(userLabel);

		final JLabel departmentLabel = new JLabel();
		departmentLabel.setText("Department");
		departmentLabel.setBounds(20, 43, 80, 14);
		departmentLabel.setForeground(DEF_COLOR);
		departmentLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		panel_8.add(departmentLabel);

		txtDepartment = new JTextField();
		txtDepartment.setBounds(100, 40, 213, 21);
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
		btnUserAdd.setBounds(320, 15, 56, 21);
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
		btnDepartmentAdd.setBounds(320, 40, 56, 21);
		btnDepartmentAdd.setForeground(DEF_COLOR);
		btnDepartmentAdd.setBackground(Color.WHITE);
		btnDepartmentAdd.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnDepartmentAdd.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		panel_8.add(btnDepartmentAdd);

		doUpdate();
	}

	private void doUpdate() {
		if (Global.currentTriggerWordKey != 0) {
			TriggerWord tw = null;
			try {
				tw = MedrexClientManager.getInstance().getTriggerWord(
						Global.currentTriggerWordKey);
			} catch (Exception ex) {

			}
			txtWord.setText(tw.getWord());
			textAreaDescription.setText(tw.getDescription());
			txtDepartment.setText(tw.getDepartmentName());
			txtUsers.setText(tw.getUsersname());
			myDate = tw.getTriggerWordCreatedDate();
		}
	}

	protected boolean doSave() {
		boolean bool = false;
		TriggerWord tw = new TriggerWord();
		if (!txtDepartment.getText().equalsIgnoreCase("")) {
			setDepartmentString();
		}
		try {
			tw.setSerial(Global.currentTriggerWordKey);
			tw.setWord(txtWord.getText());
			tw.setDescription(textAreaDescription.getText());
			tw.setRecieverUsers(usersList.trim());
			tw.setRecieverDepartment(dapartmentString.trim());
			tw.setUsersname(txtUsers.getText());
			tw.setDepartmentName(txtDepartment.getText());
			Date serverDate = MedrexClientManager.getInstance().getServerTime();
			if (Global.currentTriggerWordKey == 0) {
				tw.setTriggerWordCreatedDate(serverDate);
			} else {
				tw.setTriggerWordCreatedDate(myDate);
			}
			tw.setTriggerWordModifiedDate(serverDate);
			int serial = MedrexClientManager.getInstance()
					.insertOrUpdateTriggerWord(tw);
			if (serial != 0) {
				bool = true;
			}
		} catch (Exception ex) {
			bool = false;
		}
		return bool;
	}

	private void setDepartmentString() {
		new ArrayList<String>();
		String str = txtDepartment.getText().trim();
		StringTokenizer st = new StringTokenizer(str);
		String uses = "";
		while (st.hasMoreTokens()) {
			String s = st.nextToken(",");
			List<Users> tempList = new ArrayList<Users>();
			try {
				tempList = (MedrexClientManager.getInstance()
						.getUserListFromDepartment(s.trim()));
				if (tempList.size() != 0) {
					Iterator i = tempList.iterator();
					while (i.hasNext()) {
						Users u = (Users) i.next();
						uses += u.getSerial() + ",";
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
		dapartmentString = uses;

	}

	@Override
	public String getTitle() {
		return "Add Trigger Word";
	}

}
