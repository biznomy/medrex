package medrex.client.users;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldValidation;
import medrex.commons.enums.GuiModes;
import medrex.commons.intf.Form;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.security.SecurityRole;

import com.jgoodies.validation.ValidationResult;
import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxTabbedPane;
import com.sX.swing.JxTabbedPane.JxTabStyle;

public class PanelUsersAdd extends PopUpView {

	private PanelUserSecurity panelUserSecurity;

	private JPanel panel;

	private JCheckBox securityLevel1CheckBox_5;

	private JCheckBox securityLevel1CheckBox_4;

	private JCheckBox securityLevel1CheckBox_3;

	private JCheckBox securityLevel1CheckBox_2;

	private JCheckBox securityLevel1CheckBox_1;

	private JCheckBox securityLevel1CheckBox;

	private JCheckBox adminCheckBox;

	private JLabel lastNameLabel;

	private JPasswordField txtPasswdField;

	private JLabel userNameLabel_1;

	private JTextField txtUserName;

	private JLabel userNameLabel;

	private JxComboBox comboBox;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel userPanel;

	int num = 0;

	List roleIdList;

	private int userRoleId = 0;

	private Form[] forms;

	private ControllerUsers controllerUsers;
	private ControllerPhysicianRecordForm controllerPhysicianRecordForm;
	private ControllerNurseRecordForm controllerNurseRecordForm;

	private JxTabbedPane tabbedPane;

	// private PanelNurseRecordForm panelNurseRecordForm;
	//
	// private PanelPhysicianRecordForm panelPhysicianRecordForm;

	/**
	 * Create the panel
	 */
	public PanelUsersAdd(ControllerUsers controllerUsers) {
		super();
		this.controllerUsers = controllerUsers;

		controllerPhysicianRecordForm = new ControllerPhysicianRecordForm(
				controllerUsers);
		controllerNurseRecordForm = new ControllerNurseRecordForm(
				controllerUsers);
		setBackground(Color.WHITE);
		// Global.panelUsersAdd = this;

		setPreferredSize(new Dimension(750, 600));
		setSize(new Dimension(750, 600));
		setLayout(null);
		final JxButton saveButton = new JxButton();
		saveButton.setArc(0.4f);
		saveButton.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		saveButton.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		saveButton.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				// if (doValidate() && doValidateUser()) {

				panelUserSecurity.doSave("");
				doSave();
				if (num == 1) {
					close();
				}
				// Global.panelUsers.updateUsersJTable();

				// Global.frameUsersAddNew.dispose();
				// }
			}
		});
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.setText("Save");
		saveButton.setBounds(506, 501, 106, 26);
		if (controllerUsers.getType().equalsIgnoreCase("residentTabPhy")) {
			saveButton.setVisible(false);
		}
		add(saveButton);

		final JxButton cancelButton = new JxButton();
		cancelButton.setArc(0.4f);
		cancelButton.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		cancelButton.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		cancelButton.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setText("Cancel");
		cancelButton.setBounds(618, 501, 106, 26);
		if (controllerUsers.getType().equalsIgnoreCase("residentTabPhy")) {
			cancelButton.setVisible(false);
		}
		add(cancelButton);

		tabbedPane = new JxTabbedPane();
		tabbedPane.setBounds(28, 61, 696, 434);
		tabbedPane.setTabSize(new Dimension(120, 30));
		tabbedPane.setTabStyle(JxTabStyle.WIN2);
		tabbedPane.setForeground(JxTabStyle.WIN2.getBorder().getLineColor());
		tabbedPane.setFont(new Font("Dialog", Font.BOLD, 12));
		add(tabbedPane);

		userPanel = new JPanel();
		userPanel.setBackground(Color.WHITE);
		// userPanel.setBounds(28, 61, 696, 434);

		panelUserSecurity = new PanelUserSecurity();
		tabbedPane.addTab("User Info", null, userPanel);
		tabbedPane.addTab("User Access", null, panelUserSecurity);

		if (Global.setPanelId == 0) {
			try {
				tabbedPane.setSelectedTab(1);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		forms = new Form[2];
		forms[0] = new PanelPhysicianRecordForm(controllerUsers);
		forms[1] = new PanelNurseRecordForm(controllerUsers);

		userNameLabel = new JLabel();
		userNameLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		userNameLabel.setFont(new Font("", Font.BOLD, 18));
		userNameLabel.setText("User Name :");
		userNameLabel.setBounds(28, 23, 109, 21);
		add(userNameLabel);

		txtUserName = new JTextField();
		txtUserName.setBackground(Color.WHITE);
		txtUserName.setBounds(143, 25, 200, 20);
		add(txtUserName);

		userNameLabel_1 = new JLabel();
		userNameLabel_1.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		userNameLabel_1.setFont(new Font("Dialog", Font.BOLD, 18));
		userNameLabel_1.setText("Password:");
		userNameLabel_1.setBounds(406, 23, 93, 21);
		add(userNameLabel_1);

		txtPasswdField = new JPasswordField();
		txtPasswdField.setBackground(Color.WHITE);
		txtPasswdField.setBounds(505, 26, 200, 21);
		add(txtPasswdField);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(28, 501, 272, 68);
		add(panel);

		final JLabel securityRolesLabel = new JLabel();
		securityRolesLabel.setForeground(SystemColor.desktop);
		securityRolesLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		securityRolesLabel.setText("Security Roles");
		securityRolesLabel.setBounds(0, 10, 93, 14);
		panel.add(securityRolesLabel);

		comboBox = new JxComboBox();
		comboBox.setArc(0.4f);
		comboBox.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		comboBox.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		comboBox.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		DefaultComboBoxModel model = new DefaultComboBoxModel();

		List roleList = new ArrayList();
		roleIdList = new ArrayList();

		try {
			roleList = MedrexClientManager.getInstance().getAllRoles();

		} catch (Exception e) {
		}
		Iterator it = roleList.iterator();
		while (it.hasNext()) {
			SecurityRole securityRole = (SecurityRole) it.next();
			model.addElement(securityRole.getName());
			roleIdList.add(securityRole.getSerial());

		}
		comboBox.setModel(model);
		comboBox.setBounds(99, 8, 121, 33);
		panel.add(comboBox);

		doFormChanged();
		updateData();

	}

	public int doSave() {
		Users ar = new Users();
		String user = txtUserName.getText();
		String password = txtPasswdField.getText();
		String msg = "";
		if (user.equalsIgnoreCase("") && user != null) {
			msg += "Please Enter User Name \n";
		}
		if ((password.equalsIgnoreCase("") && password != null)) {
			msg += "Please Enter Password \n";
		}

		ar.setUserName(txtUserName.getText());
		// }
		// if (txtPasswdField.getText() != null &&
		// !(txtPasswdField.getText().equalsIgnoreCase(""))) {
		ar.setPasswdField(txtPasswdField.getText());
		if (!msg.equals("")) {
			JOptionPane.showMessageDialog(this, msg,
					"Enter User name and password", JOptionPane.OK_OPTION);
		} else {
			// System.out.println("Usre id: " +
			// controllerUsers.getCurrentSelectedUserId());
			if (controllerUsers.getCurrentSelectedUserType().equalsIgnoreCase(
					"Physicians")) {
				num = forms[0].doSave();

				// ar.setFormId(controllerUsers.getCurrentSelectedUserId());
				// ar.setUserId(controllerUsers.getCurrentSelectedUserId());

			}

			else if (controllerUsers.getCurrentSelectedUserType()
					.equalsIgnoreCase("Nurse")) {
				num = forms[1].doSave();

				// ar.setFormId(controllerUsers.getCurrentSelectedUserId());
				// ar.setUserId(controllerUsers.getCurrentSelectedUserId());

			} else if (controllerUsers.getCurrentSelectedUserType()
					.equalsIgnoreCase("CNA")) {
				num = forms[1].doSave();
				// ar.setFormId(controllerUsers.getCurrentSelectedUserId());
				// ar.setUserId(controllerUsers.getCurrentSelectedUserId());

			} else if (controllerUsers.getCurrentSelectedUserType()
					.equalsIgnoreCase("RN")) {
				num = forms[1].doSave();
				// ar.setFormId(controllerUsers.getCurrentSelectedUserId());
				// ar.setUserId(controllerUsers.getCurrentSelectedUserId());

			} else if (controllerUsers.getCurrentSelectedUserType()
					.equalsIgnoreCase("LPN")) {
				num = forms[1].doSave();
				// ar.setFormId(controllerUsers.getCurrentSelectedUserId());
				// ar.setUserId(controllerUsers.getCurrentSelectedUserId());

			} else if (controllerUsers.getCurrentSelectedUserType()
					.equalsIgnoreCase("Manager")) {
				num = forms[1].doSave();
				// ar.setFormId(controllerUsers.getCurrentSelectedUserId());
				// ar.setUserId(controllerUsers.getCurrentSelectedUserId());

			} else if (controllerUsers.getCurrentSelectedUserType()
					.equalsIgnoreCase("Administrator")) {
				num = forms[1].doSave();
				// ar.setFormId(controllerUsers.getCurrentSelectedUserId());
				// ar.setUserId(controllerUsers.getCurrentSelectedUserId());

			} else if (controllerUsers.getCurrentSelectedUserType()
					.equalsIgnoreCase("LPN")) {
				num = forms[1].doSave();
				// ar.setFormId(controllerUsers.getCurrentSelectedUserId());
				// ar.setUserId(controllerUsers.getCurrentSelectedUserId());

				// }

			} else {

				ar.setFormId(0);

			}

			ar.setUserType(controllerUsers.getCurrentSelectedUserType());

			// if (txtUserName.getText() != null &&
			// !(txtUserName.getText().equalsIgnoreCase(""))) {

			// }
			// ar.setRoleName(comboBox.getModel().getSelectedItem().toString());
			int selectedIndex = comboBox.getSelectedIndex();
			int selectedId = Integer.parseInt(roleIdList.get(selectedIndex)
					+ "");
			SecurityRole securityRole = null;
			try {
				securityRole = MedrexClientManager.getInstance()
						.getSecurityRole(selectedId);
			} catch (Exception e) {
				e.printStackTrace();
			}
			ar.setApplicationRole(securityRole);
			ar.setUserRole(securityRole);

			/*
			 * try { Global.currentUserKey =
			 * MedrexClientManager.getInstance().insertOrUpdateUser(ar); } catch
			 * (Exception e) {
			 * 
			 * }
			 */

			controllerUsers.insertOrUpdateUser(ar);
		}
		return num;

	}

	public void openProvider(String string) {
		if (string.equalsIgnoreCase("Resident")) {
			panel.setVisible(false);
			userNameLabel.setVisible(false);
			userNameLabel_1.setVisible(false);
			txtPasswdField.setVisible(false);
			txtUserName.setVisible(false);
			tabbedPane.setSelectedTab(0);
			tabbedPane.removeTab(1);
			// PanelPhysicianRecordForm panelPhysicianRecordForm = new
			// PanelPhysicianRecordForm(controllerUsers);
		}
	}

	public void updateData() {
		if (controllerUsers.getCurrentSerial() != 0) {

			Users ar = controllerUsers.doUpdateUser();

			// Global.panelUsers.cmbUserType.setSelectedItem((String)
			// ar.getUserType());
			ar.setUserId(controllerUsers.getCurrentSerial());

			txtUserName.setText(ar.getUserName());
			txtPasswdField.setText(ar.getPasswdField());

			// /vinod - write your logic here
			// comboBox.setSelectedItem(ar.getRoleName());
			Iterator itr = roleIdList.iterator();
			while (itr.hasNext()) {
				int sRoleId = Integer.parseInt(itr.next() + "");
				if (sRoleId == ar.getApplicationRole().getSerial()) {
					comboBox.setSelectedIndex(sRoleId - 1);
				}
			}

		}

		// if (((String)
		// Global.panelUsers.cmbUserType.getSelectedItem()).equalsIgnoreCase("Physicians"))
		// {
		doFormChanged();
		panelUserSecurity.updateData();
		// }

	}

	public void doFormChanged() {

		if (controllerUsers.getCurrentSelectedUserType().equalsIgnoreCase(
				"Physicians")) {
			if (controllerUsers.getCurrentSerial() != 0) {

				Users ls = null;
				try {
					// ls =
					// MedrexClientManager.getInstance().getUser(controllerUsers.getCurrentSerial());
					ls = controllerPhysicianRecordForm.getPhysicialForUser();
				} catch (Exception e) {
					e.printStackTrace();
				}
				// ls =
				// controllerPhysician.getPhysicianForUser(controllerUsers.getCurrentSerial());
				// Global.currentPhysicianRecordFormKey = ls.getUserId();
				controllerUsers.setCurrentSelectedUserId(ls.getUserId());

			} else {
				// Global.currentPhysicianRecordFormKey = 0;
				controllerUsers.setCurrentSelectedUserId(0);

			}
			userPanel.removeAll();
			userPanel.add((Component) forms[0]);
			userPanel.updateUI();
			forms[0].doUpdate();
		}

		if (controllerUsers.getCurrentSelectedUserType().equalsIgnoreCase(
				"Nurse")) {
			if (controllerUsers.getCurrentSerial() != 0) {
				Users ls = null;
				try {
					// ls =
					// MedrexClientManager.getInstance().getUser(controllerUsers.getCurrentSerial());
					ls = controllerNurseRecordForm.getNurseForUser();
				} catch (Exception e) {
					e.printStackTrace();
				}
				// Global.currentNurseRecordFormKey = ls.getUserId();
				controllerUsers.setCurrentSelectedUserId(ls.getUserId());

			} else {
				// Global.currentNurseRecordFormKey = 0;
				controllerUsers.setCurrentSelectedUserId(0);
			}
			userPanel.removeAll();
			userPanel.add((Component) forms[1]);
			userPanel.updateUI();
			forms[1].doUpdate();
		}

		if (controllerUsers.getCurrentSelectedUserType()
				.equalsIgnoreCase("CNA")) {
			if (controllerUsers.getCurrentSerial() != 0) {
				Users ls = null;
				try {
					// ls =
					// MedrexClientManager.getInstance().getUser(controllerUsers.getCurrentSerial());
					ls = controllerNurseRecordForm.getNurseForUser();
				} catch (Exception e) {
					e.printStackTrace();
				}
				// Global.currentNurseRecordFormKey = ls.getUserId();
				controllerUsers.setCurrentSelectedUserId(ls.getUserId());

			} else {
				// Global.currentNurseRecordFormKey = 0;
				controllerUsers.setCurrentSelectedUserId(0);
			}
			userPanel.removeAll();
			userPanel.add((Component) forms[1]);
			userPanel.updateUI();
			forms[1].doUpdate();
		}

		if (controllerUsers.getCurrentSelectedUserType().equalsIgnoreCase("RN")) {
			if (controllerUsers.getCurrentSerial() != 0) {
				Users ls = null;
				try {
					// ls =
					// MedrexClientManager.getInstance().getUser(controllerUsers.getCurrentSerial());
					ls = controllerNurseRecordForm.getNurseForUser();
				} catch (Exception e) {
					e.printStackTrace();
				}
				// Global.currentNurseRecordFormKey = ls.getUserId();
				controllerUsers.setCurrentSelectedUserId(ls.getUserId());

			} else {
				// Global.currentNurseRecordFormKey = 0;
				controllerUsers.setCurrentSelectedUserId(0);
			}
			userPanel.removeAll();
			userPanel.add((Component) forms[1]);
			userPanel.updateUI();
			forms[1].doUpdate();
		}

		if (controllerUsers.getCurrentSelectedUserType().equalsIgnoreCase(
				"Manager")) {
			if (controllerUsers.getCurrentSerial() != 0) {
				Users ls = null;
				try {
					// ls =
					// MedrexClientManager.getInstance().getUser(controllerUsers.getCurrentSerial());
					ls = controllerNurseRecordForm.getNurseForUser();
				} catch (Exception e) {
					e.printStackTrace();
				}
				// Global.currentNurseRecordFormKey = ls.getUserId();
				controllerUsers.setCurrentSelectedUserId(ls.getUserId());

			} else {
				// Global.currentNurseRecordFormKey = 0;
				controllerUsers.setCurrentSelectedUserId(0);
			}
			userPanel.removeAll();
			userPanel.add((Component) forms[1]);
			userPanel.updateUI();
			forms[1].doUpdate();
		}

		if (controllerUsers.getCurrentSelectedUserType().equalsIgnoreCase(
				"Administrator")) {
			if (controllerUsers.getCurrentSerial() != 0) {
				Users ls = null;
				try {
					// ls =
					// MedrexClientManager.getInstance().getUser(controllerUsers.getCurrentSerial());
					ls = controllerNurseRecordForm.getNurseForUser();
				} catch (Exception e) {
					e.printStackTrace();
				}
				// Global.currentNurseRecordFormKey = ls.getUserId();

				controllerUsers.setCurrentSelectedUserId(ls.getUserId());

			} else {
				// Global.currentNurseRecordFormKey = 0;
				controllerUsers.setCurrentSelectedUserId(0);
			}
			userPanel.removeAll();
			userPanel.add((Component) forms[1]);
			userPanel.updateUI();
			forms[1].doUpdate();
		}
		if (controllerUsers.getCurrentSelectedUserType()
				.equalsIgnoreCase("LPN")) {
			if (controllerUsers.getCurrentSerial() != 0) {
				Users ls = null;
				try {
					// ls =
					// MedrexClientManager.getInstance().getUser(controllerUsers.getCurrentSerial());
					ls = controllerNurseRecordForm.getNurseForUser();
				} catch (Exception e) {
					e.printStackTrace();
				}
				// Global.currentNurseRecordFormKey = ls.getUserId();
				controllerUsers.setCurrentSelectedUserId(ls.getUserId());

			} else {
				// Global.currentNurseRecordFormKey = 0;
				controllerUsers.setCurrentSelectedUserId(0);
			}
			userPanel.removeAll();
			userPanel.add((Component) forms[1]);
			userPanel.updateUI();
			forms[1].doUpdate();
		}

	}

	public boolean doValidateUser() {
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtUserName, "User Name Field"))) {
			vRes.addAllFrom(temp);
		}
		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtPasswdField, "Password Field"))) {
			vRes.addAllFrom(temp);
		}

		// System.out.println(FieldValidation.getMessages(vRes.getMessages()));

		if (!FieldValidation.isEmpty(vRes)) {
			FieldValidation.Msgbox(vRes, "User");
			return false;
		} else {

			// JOptionPane.showMessageDialog(this, "Saved successfully");
			return true;
		}

	}

	public boolean doValidate() {

		if (Global.currentUsers.equalsIgnoreCase("Physicians")) {
			return forms[0].doValidate();
		} else if (Global.currentUsers.equalsIgnoreCase("Nurse")) {
			return forms[1].doValidate();
		} else if (Global.currentUsers.equalsIgnoreCase("CNA")) {
			return forms[1].doValidate();
		} else if (Global.currentUsers.equalsIgnoreCase("RN")) {
			return forms[1].doValidate();
		} else if (Global.currentUsers.equalsIgnoreCase("LPN")) {
			return forms[1].doValidate();
		} else if (Global.currentUsers.equalsIgnoreCase("Manager")) {
			return forms[1].doValidate();
		} else if (Global.currentUsers.equalsIgnoreCase("Administrator")) {
			return forms[1].doValidate();
		} else if (Global.currentUsers.equalsIgnoreCase("LPN")) {
			return forms[1].doValidate();
		} else {
			return false;
		}

	}

	@Override
	public String getTitle() {
		return "Add New User Form";
	}
}
