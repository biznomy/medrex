package medrex.client.masterList;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import medrex.client.constants.Global;
import medrex.client.utils.MsgBox;
import medrex.client.utils.PresentationModel;
import medrex.commons.enums.GuiModes;
import medrex.commons.intf.Form;
import medrex.commons.vo.masterList.MasterList;

import com.sX.swing.JxButton;

public class PanelMasterListAdd extends JPanel {

	private JTextField txtMasterListName;

	private JLabel MasterListLabel;

	private static final long serialVersionUID = 1L;

	private JPanel masterListPanel;

	private Form[] forms;

	private ControllerMasterList controller;

	private Map myMap;
	private PresentationModel presentationModel;

	// private PanelNurseRecordForm panelNurseRecordForm;
	//
	// private PanelPhysicianRecordForm panelPhysicianRecordForm;

	public PanelMasterListAdd(ControllerMasterList controller) {
		super();
		setBackground(Color.WHITE);
		this.controller = controller;
		myMap = new HashMap();
		// Global.panelUsersAdd = this;

		setPreferredSize(new Dimension(360, 180));
		setLayout(null);

		masterListPanel = new JPanel();
		masterListPanel.setBackground(Color.WHITE);
		// userPanel.setBounds(28, 61, 696, 434);

		if (Global.setPanelId == 0) {
			try {
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 339, 174);
		add(panel);
		// forms[0] = new PanelPhysicianRecordForm();
		// forms[1] = new PanelNurseRecordForm();

		MasterListLabel = new JLabel();
		MasterListLabel.setHorizontalAlignment(SwingConstants.CENTER);
		MasterListLabel.setBounds(105, 21, 139, 24);
		panel.add(MasterListLabel);
		MasterListLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		MasterListLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		MasterListLabel.setText(controller.getTypeName());

		txtMasterListName = new JTextField();
		myMap.put("msterName", txtMasterListName);
		txtMasterListName.setBounds(70, 75, 200, 21);
		panel.add(txtMasterListName);

		// txtMasterListName.setText(txtValue);

		txtMasterListName.setBackground(Color.WHITE);
		// panelUserSecurity = new PanelUserSecurity();

		final JxButton btnSave = new JxButton();
		btnSave.setBounds(35, 130, 93, 26);
		panel.add(btnSave);
		btnSave.setArc(0.4f);
		btnSave.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnSave.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnSave.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				if (doSave())
					Global.frameMasterListAddNew.dispose();

			}
		});
		btnSave.setFont(new Font("", Font.BOLD, 12));
		btnSave.setText("Save");

		final JxButton btnCancel = new JxButton();
		btnCancel.setBounds(215, 130, 93, 26);
		panel.add(btnCancel);
		btnCancel.setArc(0.4f);
		btnCancel.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnCancel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnCancel.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.frameMasterListAddNew.dispose();
			}
		});
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.setText("Cancel");

		final JLabel errorLabel = new JLabel();
		errorLabel.setForeground(new Color(255, 0, 0));
		errorLabel.setText("");
		errorLabel.setBounds(35, 110, 273, 14);
		panel.add(errorLabel);

		presentationModel = new PresentationModel(myMap, MasterList.class,
				controller, errorLabel);
		presentationModel.validateAll();

		doUpdate();
	}

	public boolean doSave() {
		MasterList ia = controller.getRecord();
		// ia.setId(controller.getCurrentSerial());
		ia.setMsterName(txtMasterListName.getText());
		List errors = controller.doValidate(ia, "");
		if (errors != null && errors.size() > 0) {
			MsgBox m = new MsgBox();
			Iterator itr = errors.iterator();
			String strError = "";
			while (itr.hasNext()) {
				strError += (String) itr.next() + "\n";
			}
			m.addPrompt(strError);
			m.setTitle("Error Saving Source");
			m.setVisible(true);
			return false;
		} else {
			try {
				controller.insertOrUpdateRecord(ia);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
	}

	public void doUpdate() {
		if (controller.getCurrentSerial() != 0) {
			MasterList mster = controller.getRecord();
			// System.out.println(mster);
			if (mster != null) {
				txtMasterListName.setText(mster.getMsterName());
			} else {
				txtMasterListName.setText("");
			}
		} else {
			txtMasterListName.setText("");
		}
	}

	// public void updateData() {
	// if (Global.currentUsersKey != 0) {
	//
	// Users ar = null;
	// try {
	// ar = Global.ltcServer.getUser(Global.currentUsersKey);
	// } catch (Exception e) {
	// }
	// // Global.panelUsers.cmbUserType.setSelectedItem((String)
	// // ar.getUserType());
	// ar.setUserId(Global.currentUsersKey);
	// txtMasterListName.setText(ar.getPasswdField());
	//
	// // /vinod - write your logic here
	// // comboBox.setSelectedItem(ar.getRoleName());
	// Iterator itr = roleIdList.iterator();
	// while (itr.hasNext()) {
	// int sRoleId = Integer.parseInt(itr.next() + "");
	// if (sRoleId == ar.getApplicationRole()) {
	// }
	// }
	//
	// }
	//
	// // if (((String)
	// //
	// Global.panelUsers.cmbUserType.getSelectedItem()).equalsIgnoreCase("Physicians"))
	// // {
	// doFormChanged();
	// // }
	//
	// }

	// public void doFormChanged() {
	//
	// if (Global.currentUsers.equalsIgnoreCase("Physicians")) {
	// if (Global.currentUsersKey != 0) {
	// Users ls = null;
	// try {
	// ls = Global.ltcServer.getUser(Global.currentUsersKey);
	// } catch (Exception e) {
	// }
	// Global.currentPhysicianRecordFormKey = ls.getUserId();
	//
	// } else {
	// Global.currentPhysicianRecordFormKey = 0;
	// }
	// masterListPanel.removeAll();
	// masterListPanel.add((Component) forms[0]);
	// masterListPanel.updateUI();
	// forms[0].doUpdate();
	// }
	//
	// if (Global.currentUsers.equalsIgnoreCase("Nurse")) {
	// if (Global.currentUsersKey != 0) {
	// Users ls = null;
	// try {
	// ls = Global.ltcServer.getUser(Global.currentUsersKey);
	// } catch (Exception e) {
	// }
	// Global.currentNurseRecordFormKey = ls.getUserId();
	//
	// } else {
	// Global.currentNurseRecordFormKey = 0;
	// }
	// masterListPanel.removeAll();
	// masterListPanel.add((Component) forms[1]);
	// masterListPanel.updateUI();
	// forms[1].doUpdate();
	// }
	//
	// if (Global.currentUsers.equalsIgnoreCase("CNA")) {
	// if (Global.currentUsersKey != 0) {
	// Users ls = null;
	// try {
	// ls = Global.ltcServer.getUser(Global.currentUsersKey);
	// } catch (Exception e) {
	// }
	// Global.currentNurseRecordFormKey = ls.getUserId();
	//
	// } else {
	// Global.currentNurseRecordFormKey = 0;
	// }
	// masterListPanel.removeAll();
	// masterListPanel.add((Component) forms[1]);
	// masterListPanel.updateUI();
	// forms[1].doUpdate();
	// }
	//
	// if (Global.currentUsers.equalsIgnoreCase("RN")) {
	// if (Global.currentUsersKey != 0) {
	// Users ls = null;
	// try {
	// ls = Global.ltcServer.getUser(Global.currentUsersKey);
	// } catch (Exception e) {
	// }
	// Global.currentNurseRecordFormKey = ls.getUserId();
	//
	// } else {
	// Global.currentNurseRecordFormKey = 0;
	// }
	// masterListPanel.removeAll();
	// masterListPanel.add((Component) forms[1]);
	// masterListPanel.updateUI();
	// forms[1].doUpdate();
	// }
	//
	// if (Global.currentUsers.equalsIgnoreCase("Manager")) {
	// if (Global.currentUsersKey != 0) {
	// Users ls = null;
	// try {
	// ls = Global.ltcServer.getUser(Global.currentUsersKey);
	// } catch (Exception e) {
	// }
	// Global.currentNurseRecordFormKey = ls.getUserId();
	//
	// } else {
	// Global.currentNurseRecordFormKey = 0;
	// }
	// masterListPanel.removeAll();
	// masterListPanel.add((Component) forms[1]);
	// masterListPanel.updateUI();
	// forms[1].doUpdate();
	// }
	//
	// if (Global.currentUsers.equalsIgnoreCase("Administrator")) {
	// if (Global.currentUsersKey != 0) {
	// Users ls = null;
	// try {
	// ls = Global.ltcServer.getUser(Global.currentUsersKey);
	// } catch (Exception e) {
	// }
	// Global.currentNurseRecordFormKey = ls.getUserId();
	//
	// } else {
	// Global.currentNurseRecordFormKey = 0;
	// }
	// masterListPanel.removeAll();
	// masterListPanel.add((Component) forms[1]);
	// masterListPanel.updateUI();
	// forms[1].doUpdate();
	// }
	// if (Global.currentUsers.equalsIgnoreCase("LPN")) {
	// if (Global.currentUsersKey != 0) {
	// Users ls = null;
	// try {
	// ls = Global.ltcServer.getUser(Global.currentUsersKey);
	// } catch (Exception e) {
	// }
	// Global.currentNurseRecordFormKey = ls.getUserId();
	//
	// } else {
	// Global.currentNurseRecordFormKey = 0;
	// }
	// masterListPanel.removeAll();
	// masterListPanel.add((Component) forms[1]);
	// masterListPanel.updateUI();
	// forms[1].doUpdate();
	// }
	//
	// }

	// public boolean doValidateUser() {
	// ValidationResult vRes = new ValidationResult();
	// ValidationResult temp;
	// if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
	// txtMasterListName, "Password Field"))) {
	// vRes.addAllFrom(temp);
	// }
	//
	// // System.out.println(FieldValidation.getMessages(vRes.getMessages()));
	//
	// if (!FieldValidation.isEmpty(vRes)) {
	// FieldValidation.Msgbox(vRes, "User");
	// return false;
	// } else {
	//
	// // JOptionPane.showMessageDialog(this, "Saved successfully");
	// return true;
	// }
	//
	// }
	//
	// public boolean doValidate() {
	//
	// if (Global.currentUsers.equalsIgnoreCase("Physicians")) {
	// return forms[0].doValidate();
	// } else if (Global.currentUsers.equalsIgnoreCase("Nurse")) {
	// return forms[1].doValidate();
	// } else if (Global.currentUsers.equalsIgnoreCase("CNA")) {
	// return forms[1].doValidate();
	// } else if (Global.currentUsers.equalsIgnoreCase("RN")) {
	// return forms[1].doValidate();
	// } else if (Global.currentUsers.equalsIgnoreCase("LPN")) {
	// return forms[1].doValidate();
	// } else if (Global.currentUsers.equalsIgnoreCase("Manager")) {
	// return forms[1].doValidate();
	// } else if (Global.currentUsers.equalsIgnoreCase("Administrator")) {
	// return forms[1].doValidate();
	// } else if (Global.currentUsers.equalsIgnoreCase("LPN")) {
	// return forms[1].doValidate();
	// } else {
	// return false;
	// }
	//
	// }
}
