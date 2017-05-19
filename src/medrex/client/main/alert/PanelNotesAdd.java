package medrex.client.main.alert;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.SpinnerDateModel;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.alert.CalculatedAlert;
import medrex.commons.vo.messages.MessagesRecord;
import medrex.commons.vo.others.Users;

import com.sX.swing.JxButton;
import com.toedter.calendar.JDateChooser;

public class PanelNotesAdd extends PopUpView {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3070279244030309777L;
	private JTextArea txtMessage;
	private JRadioButton rbChangeStatus;
	private JxButton btnSend;
	private JLabel lblStatus;
	private JDateChooser dcDate;
	private JTextArea txtAreaComments;
	private JEditorPane txtAreaNotes;
	private JxButton btnCancel;
	private JxButton btnComplete;
	SpinnerDateModel model;
	final JSpinner spinner;
	private static final Color DEF_COLOR = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);
	SimpleDateFormat df = new SimpleDateFormat();

	public PanelNotesAdd(final int serial, final String str, final int status,
			final int owner) {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setSize(410, 506);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 410, 506);
		add(panel);

		final JLabel addANoteLabel = new JLabel();
		addANoteLabel.setForeground(DEF_COLOR);
		addANoteLabel.setFont(new Font("", Font.BOLD, 16));
		addANoteLabel.setText("Add a Note and Complete the Pending Alert");
		addANoteLabel.setBounds(33, 10, 342, 38);
		// addANoteLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		panel.add(addANoteLabel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(10, 54, 382, 254);
		panel.add(panel_1);

		final JLabel notesLabel = new JLabel();
		notesLabel.setForeground(DEF_COLOR);
		notesLabel.setText("Notes");
		notesLabel.setBounds(21, 7, 66, 16);
		notesLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		panel_1.add(notesLabel);

		final JScrollPane scrollPane = new JScrollPane(txtAreaNotes);
		scrollPane.setBounds(100, 5, 272, 70);
		panel_1.add(scrollPane);

		txtAreaNotes = new JEditorPane();
		txtAreaNotes.setContentType("text/html");
		txtAreaNotes.setBorder(new LineBorder(Color.black, 1, false));
		txtAreaNotes.setBounds(114, 21, 244, 51);
		txtAreaNotes.setForeground(DEF_COLOR);
		panel_1.add(txtAreaNotes);
		scrollPane.setViewportView(txtAreaNotes);

		final JLabel dateLabel = new JLabel();
		dateLabel.setForeground(DEF_COLOR);
		dateLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		dateLabel.setText("Date");
		dateLabel.setBounds(21, 91, 44, 16);
		panel_1.add(dateLabel);

		final JLabel timeLabel = new JLabel();
		timeLabel.setForeground(DEF_COLOR);
		timeLabel.setText("Time");
		timeLabel.setBounds(21, 128, 44, 16);
		timeLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		panel_1.add(timeLabel);

		model = new SpinnerDateModel();
		model.setCalendarField(Calendar.HOUR_OF_DAY);
		spinner = new JSpinner(model);
		spinner.setBounds(100, 126, 106, 20);
		JSpinner.DateEditor editor = new JSpinner.DateEditor(spinner, "hh:mm a");
		spinner.setEditor(editor);
		panel_1.add(spinner);

		final JLabel statusLabel = new JLabel();
		statusLabel.setForeground(DEF_COLOR);
		statusLabel.setText("Status");
		statusLabel.setBounds(21, 160, 44, 16);
		statusLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		panel_1.add(statusLabel);

		final JLabel commentsLabel = new JLabel();
		commentsLabel.setForeground(DEF_COLOR);
		commentsLabel.setText("Comments");
		commentsLabel.setBounds(21, 182, 66, 16);
		commentsLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		panel_1.add(commentsLabel);

		final JScrollPane scrollPaneNew = new JScrollPane();
		scrollPaneNew.setBounds(100, 182, 272, 70);
		panel_1.add(scrollPaneNew);

		txtAreaComments = new JTextArea();
		txtAreaComments.setBorder(new LineBorder(Color.black, 1, false));
		txtAreaComments.setBounds(114, 204, 244, 51);
		txtAreaComments.setForeground(DEF_COLOR);
		panel_1.add(txtAreaComments);
		scrollPaneNew.setViewportView(txtAreaComments);

		lblStatus = new JLabel();
		lblStatus.setText("New JLabel");
		lblStatus.setForeground(DEF_COLOR);
		lblStatus.setBounds(100, 160, 244, 16);
		lblStatus.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		panel_1.add(lblStatus);

		dcDate = new JDateChooser();
		dcDate.setBorder(new LineBorder(SystemColor.desktop, 1, false));
		dcDate.setDateFormatString("MM/dd/yyyy");
		dcDate.setBounds(100, 89, 124, 21);
		panel_1.add(dcDate);

		btnComplete = new JxButton();
		btnComplete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (!(txtAreaComments.getText().equalsIgnoreCase(""))) {
					doComplete(serial, str);
					close();
				} else {
					JOptionPane.showMessageDialog(null, "Please Add a Comment");
				}
			}
		});
		btnComplete.setText("Complete");
		btnComplete.setArc(0.4f);
		btnComplete.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		btnComplete.setBackground(Color.WHITE);
		btnComplete.setForeground(DEF_COLOR);
		btnComplete.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnComplete.setBounds(80, 314, 106, 26);
		panel.add(btnComplete);

		btnCancel = new JxButton();
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		btnCancel.setText("Cancel");
		btnCancel.setBounds(231, 314, 106, 26);
		btnCancel.setArc(0.4f);
		btnCancel.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnCancel.setForeground(DEF_COLOR);
		panel.add(btnCancel);

		if ((Global.currentLoggedInUserType.equalsIgnoreCase("Administrator") || owner == Global.currentLoggedInUserKey)
				&& status == 2) {

			final JSeparator separator = new JSeparator();
			separator.setBounds(0, 346, 410, 2);
			panel.add(separator);

			final JLabel changeStatusToLabel = new JLabel();
			changeStatusToLabel.setText("Change Status to");
			changeStatusToLabel.setForeground(DEF_COLOR);
			changeStatusToLabel.setFont(GuiModes.DESIGNER_FORMS
					.getControlFont());
			changeStatusToLabel.setBounds(33, 354, 106, 16);
			panel.add(changeStatusToLabel);

			rbChangeStatus = new JRadioButton();
			rbChangeStatus.setBackground(Color.WHITE);
			rbChangeStatus.setForeground(DEF_COLOR);
			rbChangeStatus.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
			rbChangeStatus.setText("Pending");
			rbChangeStatus.setBounds(159, 350, 86, 24);
			panel.add(rbChangeStatus);

			final JLabel messageLabel = new JLabel();
			messageLabel.setText("Message");
			messageLabel.setForeground(DEF_COLOR);
			messageLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
			messageLabel.setBounds(33, 387, 66, 16);
			panel.add(messageLabel);

			btnSend = new JxButton();
			btnSend.addActionListener(new ActionListener() {
				public void actionPerformed(final ActionEvent e) {
					if (rbChangeStatus.isSelected()
							&& !(txtMessage.getText().equalsIgnoreCase(""))) {
						changeStatus(serial);
						close();
					} else {
						JOptionPane.showMessageDialog(null,
								"Please select Pending & Fill Message");
					}
				}
			});
			btnSend.setBackground(Color.WHITE);
			btnSend
					.setBorder(new LineBorder(new Color(180, 188, 193), 1,
							false));
			btnSend.setArc(0.4f);
			btnSend.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
			btnSend.setBackground(Color.WHITE);
			btnSend.setBorder(new LineBorder(BORDER_COL, 1, false));
			btnSend.setForeground(DEF_COLOR);
			btnSend.setText("Send");
			btnSend.setBounds(160, 467, 106, 26);
			panel.add(btnSend);

			final JScrollPane scrollPaneNew2 = new JScrollPane();
			scrollPaneNew2.setBounds(105, 385, 272, 70);
			panel.add(scrollPaneNew2);

			txtMessage = new JTextArea();
			txtMessage.setBorder(new LineBorder(Color.black, 1, false));
			txtMessage.setForeground(DEF_COLOR);
			txtMessage.setBounds(105, 391, 287, 55);
			panel.add(txtMessage);
			scrollPaneNew2.setViewportView(txtMessage);

		}

		doLoad(serial, owner, status);
	}

	protected void changeStatus(int serial) {
		df.applyPattern("MM / dd / yyyy hh:mm a");
		CalculatedAlert pa = new CalculatedAlert();
		Users user = new Users();
		try {
			try {
				pa = MedrexClientManager.getInstance().getCalculatedAlertBean(
						serial);
			} catch (RemoteException e) {
				e.printStackTrace();
			} catch (MedrexException e) {
				e.printStackTrace();
			}
			try {
				user = MedrexClientManager.getInstance().getUser(
						Global.currentLoggedInUserKey);
			} catch (RemoteException e1) {
				e1.printStackTrace();
			} catch (MedrexException e1) {
				e1.printStackTrace();
			}
			if (pa.getOwnerStatus() == 2 && rbChangeStatus.isSelected()) {
				pa.setOwnerStatus(1);
				pa.setNotes(pa.getNotes() + "<p><font color = rgb(160,0,0)>"
						+ df.format(new Date()) + "<br><b>"
						+ user.getUserName() + " : " + txtMessage.getText()
						+ "</b></font></p>");
				try {
					MedrexClientManager.getInstance()
							.insertOrUpdateCalculatedAlert(pa);
					sendMessage(txtMessage.getText(), pa.getUpdater());
				} catch (RemoteException e) {
					e.printStackTrace();
				} catch (MedrexException e) {
					e.printStackTrace();
				}
			}

		} catch (Exception ex) {

		}
	}

	protected void sendMessage(String message, int reciever) {
		MessagesRecord ref = new MessagesRecord();
		ref.setSenderId(Global.currentLoggedInUserKey);
		ref
				.setMessage("<html>Changed Alert Status to Pending with following Message :<br><b>"
						+ message + "</b></html>");
		ref.setReceiverId(reciever);
		ref.setSubject("Alert :" + "Changes status to Pending");
		ref.setTimeRecord(MedrexClientManager.getServerTime());
		ref.setType("Alert");
		ref.setNew(true);
		try {
			MedrexClientManager.getInstance().insertOrUpdateMessagesRecord(ref);
		} catch (Exception eee) {
			eee.printStackTrace();
		}
	}

	protected void doComplete(int id, String str) {
		df.applyPattern("MM / dd / yyyy hh:mm a");
		CalculatedAlert pa = new CalculatedAlert();
		Users user = new Users();
		try {
			// int id = new Integer((String) pendingAlertJTable.getValueAt(table
			// .getSelectedRow(), 4)).intValue();
			try {
				pa = MedrexClientManager.getInstance().getCalculatedAlertBean(
						id);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MedrexException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				user = MedrexClientManager.getInstance().getUser(
						Global.currentLoggedInUserKey);
			} catch (RemoteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (MedrexException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			/*
			 * if (pa.getOwnerStatus() == 2) {
			 * JOptionPane.showMessageDialog(null, "Completed by " +
			 * user.getUserName()); updateAlertJTable(str); } else
			 */if (pa.getOwnerStatus() == 1) {
				pa.setOwnerStatus(2);
				pa.setUpdater(Global.currentLoggedInUserKey);
				pa.setComments(txtAreaComments.getText());
				pa.setNotes(pa.getNotes() + "<p><font color = rgb(49,104,127)>"
						+ df.format(new Date()) + "<br><b>"
						+ user.getUserName() + " : "
						+ txtAreaComments.getText() + "</b></font></p>");
				// PanelAddNote frame = new PanelAddNote(pa);
				// SwingUtils.center(frame);
				// frame.setVisible(true);
				try {
					MedrexClientManager.getInstance()
							.insertOrUpdateCalculatedAlert(pa);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (MedrexException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			// updateAlertJTable(str);

		} catch (Exception ex) {

		}
	}

	private void doLoad(int serial, int owner, int status) {
		CalculatedAlert pa = new CalculatedAlert();
		try {
			pa = MedrexClientManager.getInstance().getCalculatedAlertBean(
					serial);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		txtAreaNotes.setText(pa.getNotes());
		dcDate.setDate(pa.getAlertDate());
		spinner.setValue(pa.getAlertDate());
		if (pa.getOwnerStatus() == 1) {
			lblStatus.setText("Pending");
		} else {
			lblStatus.setText("Completed");
		}
		// txtAreaComments.setText(pa.getComments());
		txtAreaNotes.setEditable(false);
		dcDate.setEnabled(false);
		spinner.setEnabled(false);
		if ((Global.currentLoggedInUserType.equalsIgnoreCase("Administrator") || owner == Global.currentLoggedInUserKey)
				&& status == 2) {
			txtMessage.setText("");
			rbChangeStatus.setSelected(false);
		}
	}

	@Override
	public String getTitle() {
		return "Add a Note and Complete the Pending Alert";
	}

}
