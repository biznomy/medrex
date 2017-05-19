package medrex.client.messages;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import medrex.client.FrameLogin;
import medrex.client.admin.userLogon.ControllerUserLogon;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.messages.MessagesRecord;
import medrex.commons.vo.others.Users;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;

public class PanelMessages extends JPanel {
	private JPanel topBlueStrip;
	private JPanel topTabsPanel;
	private JPanel topTabArea;
	private JLabel ProvidersLabel;
	private static final long serialVersionUID = 1L;
	private JTable table;
	private FrameMessagesRecordAdd frameMessagesRecordAdd;
	private FrameMessagesShowAdd frameMessagesShowAdd;
	private static final Color DEF_COLOR = new Color(49, 104, 127);
	private MessagesJTable MessagesJTable;
	private JxPanel panel;
	private JPanel defaultPanel;

	public PanelMessages() {
		super();

		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doResize();
				}
			}
		});
		// Global.frameMessages=this;
		setBackground(Color.WHITE);
		Global.panelMessages = this;
		setPreferredSize(new Dimension(1000, 800));
		setLayout(null);
		MessagesJTable = new MessagesJTable();

		topTabArea = new JPanel();
		topTabArea.setLayout(new BorderLayout());
		topTabArea.setBounds(0, 0, 868, 138);
		topTabArea.setOpaque(false);
		// topTabArea.setBounds(0, 0, 868, 138);
		add(topTabArea);

		topTabsPanel = new JPanel();
		topTabsPanel.setLayout(null);
		topTabsPanel.setOpaque(false);
		topTabsPanel.setPreferredSize(new Dimension(868, 40));
		topTabArea.add(topTabsPanel, BorderLayout.SOUTH);

		topBlueStrip = new JPanel();
		topBlueStrip.setLayout(new GridLayout(0, 2));
		topBlueStrip.setBackground(new Color(28, 93, 113));
		topBlueStrip.setBounds(0, 138, 868, 38);
		add(topBlueStrip);

		final JLabel lastLoginLabel = new JLabel();
		lastLoginLabel.setForeground(Color.WHITE);
		lastLoginLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont()
				.deriveFont(16));
		lastLoginLabel.setBorder(new EmptyBorder(0, 100, 0, 0));
		lastLoginLabel.setText("<html><b>Welcome </b>"
				+ Global.currentUserLastName + ", "
				+ Global.currentUserFirstName);
		topBlueStrip.add(lastLoginLabel);

		final JLabel logLabel = new JLabel();
		logLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent arg0) {
				(new ControllerUserLogon()).logoutUpdate();
				FrameFactory.closeAll();
				FrameLogin frame = (FrameLogin) FrameFactory
						.createWindowOfType(FrameLogin.class);
				Global.currentMainTab = 1;
				frame.setVisible(true);
			}
		});
		logLabel.setBorder(new EmptyBorder(0, 0, 0, 50));
		logLabel.setForeground(Color.WHITE);
		logLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont()
				.deriveFont(16));
		logLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		logLabel.setText("Log off ");
		topBlueStrip.add(logLabel);

		defaultPanel = new JPanel();
		defaultPanel.setOpaque(false);
		defaultPanel.setLayout(null);
		defaultPanel.setBounds(0, 176, 868, 592);
		add(defaultPanel);

		panel = new JxPanel();
		panel.setBounds(180, 0, 687, 415);
		defaultPanel.add(panel);
		panel.setArc(1f);
		panel.setBorder(new LineBorder(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor(), 1, false));
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);

		ProvidersLabel = new JLabel();
		ProvidersLabel.setBounds(250, 10, 177, 47);
		panel.add(ProvidersLabel);
		ProvidersLabel.setForeground(DEF_COLOR);
		ProvidersLabel.setFont(new Font("", Font.PLAIN, 28));
		ProvidersLabel.setText(" MESSAGES");

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(66, 66, 563, 274);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		panel.add(scrollPane);

		table = new JxTable();
		table.setOpaque(false);
		table.setBackground(Color.WHITE);
		scrollPane.setViewportView(table);
		table.setForeground(DEF_COLOR);
		table.setModel(MessagesJTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					MessagesRecord ref = (MessagesRecord) MessagesJTable
							.getValueAt(table.getSelectedRow(), 5);

					// Global.currentMessagesRecordFormKey = id;
					frameMessagesShowAdd = new FrameMessagesShowAdd();
					Global.panelMessagesShowAdd.setCurrentMessage(ref);
					frameMessagesShowAdd.setTitle("View Contact");
					SwingUtils.center(frameMessagesShowAdd);
					frameMessagesShowAdd.setModal(true);
					frameMessagesShowAdd.setVisible(true);
					ref.setNew(false);
					ref.setSerial(ref.getSerial());
					try {
						MedrexClientManager.getInstance()
								.insertOrUpdateMessagesRecord(ref);
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (MedrexException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					updateMessagesRecordJTable();
				} else if (evt.getClickCount() == 1) {
					// System.out.println("single click");
				}
			}
		});
		updateMessagesRecordJTable();
		final JxButton btnAdd = new JxButton();
		btnAdd.setBounds(66, 360, 120, 30);
		panel.add(btnAdd);
		btnAdd.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setArc(0.4f);
		btnAdd.setForeground(DEF_COLOR);
		btnAdd.setFont(new Font("", Font.BOLD, 12));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				// Global.currentMessagesRecordFormKey = 0;
				frameMessagesRecordAdd = new FrameMessagesRecordAdd();
				frameMessagesRecordAdd.setTitle("Add New Contact");
				SwingUtils.center(frameMessagesRecordAdd);
				frameMessagesRecordAdd.setModal(true);
				frameMessagesRecordAdd.setVisible(true);
				updateMessagesRecordJTable();
			}
		});
		btnAdd.setText("Send New");

		final JxButton btnUpdate = new JxButton();
		btnUpdate.setBounds(200, 360, 120, 30);
		panel.add(btnUpdate);
		btnUpdate.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnUpdate.setBackground(Color.WHITE);
		btnUpdate.setArc(0.4f);
		btnUpdate.setForeground(DEF_COLOR);
		btnUpdate.setFont(new Font("", Font.BOLD, 12));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					MessagesRecord ref = (MessagesRecord) MessagesJTable
							.getValueAt(table.getSelectedRow(), 5);

					// Global.currentMessagesRecordFormKey = id;
					frameMessagesShowAdd = new FrameMessagesShowAdd();
					Global.panelMessagesShowAdd.setCurrentMessage(ref);
					frameMessagesShowAdd.setTitle("View Contact");
					SwingUtils.center(frameMessagesShowAdd);
					frameMessagesShowAdd.setModal(true);
					frameMessagesShowAdd.setVisible(true);
					ref.setNew(false);
					ref.setSerial(ref.getSerial());
					try {
						MedrexClientManager.getInstance()
								.insertOrUpdateMessagesRecord(ref);
					} catch (RemoteException ex) {
						// TODO Auto-generated catch block
						ex.printStackTrace();
					} catch (MedrexException ex) {
						// TODO Auto-generated catch block
						ex.printStackTrace();
						updateMessagesRecordJTable();
					}
				} catch (Exception ve) {

				}

			}
		});
		btnUpdate.setText("View");

		final JxButton btnDelete = new JxButton();
		btnDelete.setBounds(335, 360, 120, 30);
		panel.add(btnDelete);
		btnDelete.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setArc(0.4f);
		btnDelete.setForeground(DEF_COLOR);
		btnDelete.setFont(new Font("", Font.BOLD, 12));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					int id = (Integer) MessagesJTable.getValueAt(table
							.getSelectedRow(), 4);

					MedrexClientManager.getInstance().deleteMessagesRecord(id);
					updateMessagesRecordJTable();

				} catch (Exception xe) {
					xe.printStackTrace();
				}
			}
		});
		btnDelete.setText("Delete");

		// final JxButton btnCancel = new JxButton();
		// btnCancel.setBounds(509, 360, 120, 30);
		// panel.add(btnCancel);
		// btnCancel.setBorder(new LineBorder(new Color(180, 188, 193), 1,
		// false));
		// btnCancel.setBackground(Color.WHITE);
		// btnCancel.setArc(0.4f);
		// btnCancel.setForeground(DEF_COLOR);
		// btnCancel.addActionListener(new ActionListener() {
		// public void actionPerformed(final ActionEvent e) {
		// new FrameMessages().dispose();
		// Global.frameMessages.openMainOptions();
		// }
		// });
		// btnCancel.setFont(new Font("", Font.BOLD, 12));
		// btnCancel.setText("Back");
		//		

	}

	public void updateMessagesRecordJTable() {
		List l = null;
		try {
			l = MedrexClientManager.getInstance().getMessagesRecords(
					Global.currentLoggedInUserKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
		MessagesJTable.setNewList(l);
		MessagesJTable.fireTableStructureChanged();
		// System.out.print("table is:"+table);
		table.updateUI();
		table.repaint();
	}

	public void doResize() {
		updateMessagesRecordJTable();

		topTabArea.setSize(getWidth(), topTabArea.getHeight());
		topBlueStrip.setSize(getWidth(), topBlueStrip.getHeight());
		defaultPanel.setSize(getWidth(), getHeight() - defaultPanel.getY());
		panel.setLocation((defaultPanel.getWidth() - panel.getWidth()) / 2,
				(defaultPanel.getHeight() - panel.getHeight() - 70) / 2);
		this.repaint();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(new Color(32, 63, 84));
		g2.fillRect(0, getHeight() - 76, getWidth(), 76);
	}

}

class MessagesJTable extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "From", "Subject", "Time Stamp", "Type" };

	public List l;

	int n = 0;

	MessagesJTable(List ls) {
		l = ls;
	}

	MessagesJTable() {
		l = new ArrayList();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (l.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List listDoctors) {
		l = listDoctors;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			MessagesRecord ref = (MessagesRecord) l.get(row);
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MM / dd / yyyy hh':'mm a");
			switch (col) {
			case 0: {
				if (ref.isNew()) {
					if (ref.getSenderId() == 0) {
						return "<html><b>" + "AUTO" + "</b></html>";
					} else {
						Users sender = MedrexClientManager.getInstance()
								.getUser(ref.getSenderId());
						return "<html><b>" + sender.getUserName()
								+ "</b></html>";
					}
				} else {
					if (ref.getSenderId() == 0) {
						return "AUTO";
					} else {
						Users sender = MedrexClientManager.getInstance()
								.getUser(ref.getSenderId());
						return sender.getUserName();
					}
				}
			}
			case 1:
				if (ref.isNew()) {
					return "<html><b>" + ref.getSubject() + "</b></html>";
				} else {
					return ref.getSubject();
				}
			case 2:
				if (ref.isNew()) {
					return "<html><b>" + (df.format(ref.getTimeRecord()))
							+ "</b></html>";
				} else {
					return (df.format(ref.getTimeRecord()));
				}
			case 3:
				if (ref.isNew()) {
					return "<html><b>" + ref.getType() + "</b></html>";
				} else {
					return ref.getType();
				}
			case 4:
				return ref.getSerial();
			case 5:
				return ref;
			}
			return ("");
		} catch (Exception e) {
			return ("");
		}

	}
}
