package medrex.client.messages;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.messages.MessagesRecord;
import medrex.commons.vo.others.Users;

import com.sX.swing.JxButton;

public class PanelMessagesShowAdd extends JPanel {

	private JLabel txtMessagesArea;
	private JLabel lastNameLabel_3;
	private JLabel ProvidersLabel;
	private JTextField txtSubject;

	private static final long serialVersionUID = 1L;
	private JTextField txtToMessages;
	private MessagesRecord currentMessage;
	private static final Color DEF_COLOR = new Color(49, 104, 127);
	private FrameMessageUsersAdd frameMessageUsersAdd;

	public PanelMessagesShowAdd() {
		super();
		setBackground(Color.WHITE);
		Global.panelMessagesShowAdd = this;
		setLayout(null);

		setPreferredSize(new Dimension(Toolkit.getDefaultToolkit()
				.getScreenSize().width, Toolkit.getDefaultToolkit()
				.getScreenSize().height - 50));
		setSize(new Dimension(
				Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
						.getDefaultToolkit().getScreenSize().height - 50));

		final JLabel firstNameLabel = new JLabel();
		firstNameLabel.setForeground(DEF_COLOR);
		firstNameLabel.setFont(new Font("", Font.BOLD, 12));
		firstNameLabel.setText("FROM           :");
		firstNameLabel.setBounds(345, 191, 75, 16);
		add(firstNameLabel);

		txtToMessages = new JTextField();
		txtToMessages.setForeground(DEF_COLOR);
		txtToMessages.setBackground(Color.WHITE);
		txtToMessages.setEditable(false);
		txtToMessages.setBounds(426, 190, 325, 20);
		add(txtToMessages);

		final JLabel lastNameLabel = new JLabel();
		lastNameLabel.setForeground(DEF_COLOR);
		lastNameLabel.setFont(new Font("", Font.BOLD, 12));
		lastNameLabel.setText("SUBJECT     :");
		lastNameLabel.setBounds(345, 220, 75, 16);
		add(lastNameLabel);

		final JxButton btnCancel = new JxButton();
		btnCancel.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnCancel.setForeground(DEF_COLOR);
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setArc(0.4f);
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.frameMessagesShowAdd.dispose();
			}
		});
		btnCancel.setText("Cancel");
		btnCancel.setBounds(345, 663, 106, 26);
		add(btnCancel);

		txtSubject = new JTextField();
		txtSubject.setForeground(DEF_COLOR);
		txtSubject.setBackground(Color.WHITE);
		txtSubject.setEditable(false);
		txtSubject.setBounds(426, 216, 325, 20);
		add(txtSubject);

		ProvidersLabel = new JLabel();
		ProvidersLabel.setForeground(DEF_COLOR);
		ProvidersLabel.setFont(new Font("", Font.BOLD, 36));
		ProvidersLabel.setText("VIEW MESSAGES");
		ProvidersLabel.setBounds(408, 92, 311, 47);
		add(ProvidersLabel);

		lastNameLabel_3 = new JLabel();
		lastNameLabel_3.setForeground(DEF_COLOR);
		lastNameLabel_3.setFont(new Font("Dialog", Font.BOLD, 12));
		lastNameLabel_3.setText("MESSAGES :");
		lastNameLabel_3.setBounds(345, 249, 70, 16);
		add(lastNameLabel_3);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(345, 271, 576, 386);
		add(scrollPane);

		txtMessagesArea = new JLabel();
		txtMessagesArea.setForeground(DEF_COLOR);
		txtMessagesArea.setVerticalAlignment(SwingConstants.TOP);
		txtMessagesArea.setHorizontalAlignment(SwingConstants.LEFT);
		txtMessagesArea.setAutoscrolls(true);
		txtMessagesArea.setBackground(Color.WHITE);
		txtMessagesArea.setOpaque(true);
		scrollPane.setViewportView(txtMessagesArea);
	}

	public void setCurrentMessage(MessagesRecord currentMessage) {
		this.currentMessage = currentMessage;
		try {
			if (currentMessage.getSenderId() != 0) {
				Users sender = MedrexClientManager.getInstance().getUser(
						currentMessage.getSenderId());
				txtToMessages.setText(sender.getUserName());
			} else {
				txtToMessages.setText("AUTO");
			}
			txtSubject.setText(currentMessage.getSubject());
			String tmp = currentMessage.getMessage().replaceAll("\n", "<br>");
			tmp = tmp.replaceAll("  ", " &nbsp;");
			if (currentMessage.getMessage().contains("<html")) {
				txtMessagesArea
						.setFont(new Font("Courier New", Font.PLAIN, 18));
				txtMessagesArea.setText(tmp);
			} else {
				txtMessagesArea.setText("<html><p>" + tmp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
