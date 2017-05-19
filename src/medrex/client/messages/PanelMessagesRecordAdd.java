package medrex.client.messages;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldValidation;
import medrex.client.utils.SwingUtils;
import medrex.commons.vo.messages.MessagesRecord;
import medrex.commons.vo.others.Users;

import com.jgoodies.validation.ValidationResult;
import com.sX.swing.JxButton;

public class PanelMessagesRecordAdd extends JPanel {

	private JTextArea txtMessagesArea;
	private JLabel lastNameLabel_3;
	private JLabel ProvidersLabel;
	private JTextField txtSubject;

	private static final long serialVersionUID = 1L;
	private JTextField txtToMessages;
	private List<Users> toUserList;

	private FrameMessageUsersAdd frameMessageUsersAdd;
	private static final Color DEF_COLOR = new Color(49, 104, 127);

	public PanelMessagesRecordAdd() {
		super();
		setBackground(Color.WHITE);
		Global.panelMessagesRecordAdd = this;
		setLayout(null);
		setSize(new Dimension(536, 497));
		// setPreferredSize(new Dimension(
		// 615, 718));

		// setSize(new Dimension(550, 550 ));

		final JLabel firstNameLabel = new JLabel();
		firstNameLabel.setForeground(DEF_COLOR);
		firstNameLabel.setFont(new Font("", Font.BOLD, 12));
		firstNameLabel.setText("TO                 :");
		firstNameLabel.setBounds(50, 191, 79, 16);
		add(firstNameLabel);

		txtToMessages = new JTextField();
		txtToMessages.setForeground(DEF_COLOR);
		txtToMessages.setBackground(Color.WHITE);
		txtToMessages.setEditable(false);
		txtToMessages.setBounds(130, 190, 325, 20);

		add(txtToMessages);

		final JLabel lastNameLabel = new JLabel();
		lastNameLabel.setForeground(DEF_COLOR);
		lastNameLabel.setFont(new Font("", Font.BOLD, 12));
		lastNameLabel.setText("SUBJECT     :");
		lastNameLabel.setBounds(50, 217, 79, 16);
		add(lastNameLabel);

		final JxButton btnSave = new JxButton();
		btnSave.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnSave.setArc(0.4f);
		btnSave.setForeground(DEF_COLOR);
		btnSave.setBackground(Color.WHITE);
		btnSave.setFont(new Font("", Font.BOLD, 12));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				if (doValidate()) {
					MessagesRecord rm = new MessagesRecord();
					if (Global.currentMessagesRecordFormKey == 0) {
						rm.setSerial(0);
					} else {
						try {
							rm = MedrexClientManager
									.getInstance()
									.getMessagesRecord(
											Global.currentMessagesRecordFormKey);
						} catch (Exception ee) {

						}
					}
					doSave();
					Global.panelMessages.updateMessagesRecordJTable();
					Global.frameMessagesRecordAdd.dispose();
				}
			}
		});
		btnSave.setText("Send");
		btnSave.setBounds(130, 429, 106, 26);
		add(btnSave);

		final JxButton btnCancel = new JxButton();
		btnCancel.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnCancel.setArc(0.4f);
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setForeground(DEF_COLOR);
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				Global.frameMessagesRecordAdd.dispose();
			}
		});
		btnCancel.setText("Cancel");
		btnCancel.setBounds(242, 429, 106, 26);
		add(btnCancel);

		txtSubject = new JTextField();
		txtSubject.setForeground(DEF_COLOR);
		txtSubject.setBackground(Color.WHITE);
		txtSubject.setBounds(130, 216, 325, 20);
		add(txtSubject);

		ProvidersLabel = new JLabel();
		ProvidersLabel.setForeground(DEF_COLOR);
		ProvidersLabel.setFont(new Font("", Font.BOLD, 36));
		ProvidersLabel.setText("SEND MESSAGES");
		ProvidersLabel.setBounds(146, 92, 318, 47);
		add(ProvidersLabel);

		lastNameLabel_3 = new JLabel();
		lastNameLabel_3.setForeground(DEF_COLOR);
		lastNameLabel_3.setFont(new Font("Dialog", Font.BOLD, 12));
		lastNameLabel_3.setText("MESSAGES :");
		lastNameLabel_3.setBounds(50, 245, 70, 16);
		add(lastNameLabel_3);

		txtMessagesArea = new JTextArea();
		txtMessagesArea.setForeground(DEF_COLOR);
		txtMessagesArea.setBorder(new TitledBorder(null, "",
				TitledBorder.DEFAULT_JUSTIFICATION,
				TitledBorder.DEFAULT_POSITION, null, null));
		txtMessagesArea.setWrapStyleWord(true);
		txtMessagesArea.setLineWrap(true);
		txtMessagesArea.setBounds(130, 242, 325, 150);
		add(txtMessagesArea);

		final JxButton button = new JxButton();
		button.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		button.setArc(0.4f);
		button.setBackground(Color.WHITE);
		button.setForeground(DEF_COLOR);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {

				frameMessageUsersAdd = new FrameMessageUsersAdd();
				frameMessageUsersAdd.setTitle("Add User");
				SwingUtils.center(frameMessageUsersAdd);
				frameMessageUsersAdd.setModal(true);
				frameMessageUsersAdd.setVisible(true);

				if (!frameMessageUsersAdd.isCancel()) {
					toUserList = frameMessageUsersAdd.getToUserList();
					toUserList.toArray();
					String temp = "";
					for (int i = 0; i < toUserList.size(); i++) {
						Users curUser = toUserList.get(i);
						if (curUser != null) {
							temp += curUser.getUserName();
							if (i != toUserList.size() - 1) {
								temp += ", ";
							}
						}
					}
					txtToMessages.setText(temp);
				}
			}
		});
		button.setText("<<");
		button.setBounds(461, 190, 42, 21);
		add(button);

		updateData();

	}

	public void doSave() {
		MessagesRecord ref = new MessagesRecord();
		ref.setSenderId(Global.currentLoggedInUserKey);
		ref.setMessage(txtMessagesArea.getText());
		ref.setReceiverId(0);
		ref.setSubject(txtSubject.getText());
		ref.setTimeRecord(MedrexClientManager.getServerTime());
		ref.setNew(true);
		ref.setType("Message");

		try {
			MedrexClientManager.getInstance().insertOrUpdateMessagesRecord(ref,
					toUserList);
		} catch (Exception eee) {
			eee.printStackTrace();
		}
	}

	public void updateData() {

		MessagesRecord ref = null;
		if (Global.currentMessagesRecordFormKey != 0) {
			try {
				ref = MedrexClientManager.getInstance().getMessagesRecord(
						Global.currentMessagesRecordFormKey);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			txtMessagesArea.setText(ref.getMessage());
			txtSubject.setText(ref.getSubject());

		}
	}

	public boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtToMessages, "To Field"))) {
			vRes.addAllFrom(temp);
		}
		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtSubject, "Subject Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtMessagesArea, "Message Field"))) {
			vRes.addAllFrom(temp);
		}

		System.out.println(FieldValidation.getMessages(vRes.getMessages()));

		if (!FieldValidation.isEmpty(vRes)) {
			FieldValidation.Msgbox(vRes, "Messages ");
			return false;
		} else {
			// FieldValidation.Msgbox("Saved successfully", "Provider ");
			JOptionPane.showMessageDialog(this, "Sent successfully");
			return true;
		}
	}

	public static void main(String a[]) {
		JDialog jd = new JDialog();
		jd.add(new PanelMessagesRecordAdd());
		jd.setBounds(0, 0, 700, 800);
		SwingUtils.center(jd);
		jd.setModal(true);
		jd.setVisible(true);

	}
}
