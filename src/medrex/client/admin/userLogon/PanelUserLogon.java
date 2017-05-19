package medrex.client.admin.userLogon;

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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import medrex.client.FrameLogin;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.admin.UserLogon;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;
import com.toedter.calendar.JDateChooser;

public class PanelUserLogon extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3434464576439894289L;
	private JxButton filterButton;
	private JDateChooser dcTo;
	private JDateChooser dcFrom;
	private static final Color DEF_COLOR = new Color(49, 104, 127);
	private JPanel tablePanel;
	private JxTable table;

	private UserLogonJTable securityRecordJTable;

	// private FrameSecurityAdd frameSecurityAdd;

	private JxPanel panel;

	private JPanel topTabArea;

	private JPanel topTabsPanel;

	private JLabel lblTopTabs;

	private JPanel topBlueStrip;

	private JPanel defaultPanel;

	public PanelUserLogon() {
		super();
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doResize();
				}
			}
		});
		setLayout(null);
		setPreferredSize(new Dimension(868, 768));

		topTabArea = new JPanel();
		topTabArea.setLayout(new BorderLayout(0, 0));
		topTabArea.setOpaque(false);
		topTabArea.setBounds(0, 0, 868, 138);
		add(topTabArea);

		topTabsPanel = new JPanel();
		topTabsPanel.setOpaque(false);
		topTabsPanel.setLayout(null);
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

		/*
		 * final JLabel logLabel = new JLabel(); logLabel.setBorder(new
		 * EmptyBorder(0, 0, 0, 50)); logLabel.setForeground(Color.WHITE);
		 * logLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont()
		 * .deriveFont(16));
		 * logLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		 * logLabel.setText("Log off   |   Support   |   Help");
		 * topBlueStrip.add(logLabel);
		 */

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
		topBlueStrip.add(logLabel);
		logLabel.setText("Log off ");

		defaultPanel = new JPanel();
		defaultPanel.setBorder(new EmptyBorder(20, 0, 0, 10));
		defaultPanel.setOpaque(false);
		defaultPanel.setLayout(null);
		defaultPanel.setBounds(0, 176, 868, 592);
		add(defaultPanel);

		panel = new JxPanel();
		panel.setArc(1f);
		panel.setBorder(new LineBorder(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor(), 1, false));
		panel.setBounds(0, 0, 750, 445);
		panel.setBackground(Color.WHITE);
		panel.setPreferredSize(new Dimension(750, 434));
		panel.setLayout(null);
		defaultPanel.add(panel);

		tablePanel = new JPanel();
		tablePanel.setLayout(new BorderLayout());
		tablePanel.setBackground(Color.WHITE);
		tablePanel.setBorder(new LineBorder(Color.black, 1, false));
		tablePanel.setBounds(24, 105, 702, 300);
		panel.add(tablePanel);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBounds(0, 0, 702, 300);
		tablePanel.add(scrollPane);

		table = new JxTable();
		table.setBackground(Color.WHITE);
		securityRecordJTable = new UserLogonJTable();
		table.setModel(securityRecordJTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					/*
					 * int id = new Integer((String) securityRecordJTable
					 * .getValueAt(table.getSelectedRow(), 1)).intValue();
					 */

					// Global.currentSecurityRoleKey = id;
					//				
					// frameSecurityAdd = new FrameSecurityAdd();
					// SwingUtils.center(frameSecurityAdd);
					// frameSecurityAdd.setTitle("Add New Security Form");
					// frameSecurityAdd.setModal(true);
					// frameSecurityAdd.setVisible(true);
					// updateSecurityJTable();
				} else if (evt.getClickCount() == 1) {
				}
			}
		});

		scrollPane.setViewportView(table);

		final JxButton btnAdd = new JxButton(0.4f);
		btnAdd.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnAdd.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnAdd.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnAdd.setFont(new Font("", Font.BOLD, 12));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.currentSecurityRoleKey = 0;
				// frameSecurityAdd = new FrameSecurityAdd();
				// SwingUtils.center(frameSecurityAdd);
				// frameSecurityAdd.setTitle("Add New Security Form");
				// frameSecurityAdd.setModal(true);
				// frameSecurityAdd.setVisible(true);
				// updateSecurityJTable();
			}
		});
		btnAdd.setText("Add New");
		btnAdd.setBounds(24, 366, 84, 26);
		// panel.add(btnAdd);

		final JxButton btnView = new JxButton(0.4f);
		btnView.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnView.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnView.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				// int id = new Integer((String)
				// securityRecordJTable.getValueAt(table.getSelectedRow(),
				// 1)).intValue();
				//
				// Global.currentSecurityRoleKey = id;
				//			
				// frameSecurityAdd = new FrameSecurityAdd();
				// SwingUtils.center(frameSecurityAdd);
				// frameSecurityAdd.setTitle("Add New Security Form");
				// frameSecurityAdd.setModal(true);
				// frameSecurityAdd.setVisible(true);
				// updateSecurityJTable();
			}
		});
		btnView.setFont(new Font("", Font.BOLD, 12));
		btnView.setText("View / Update");
		btnView.setBounds(391, 366, 111, 26);
		// panel.add(btnView);

		final JxButton btnDelete = new JxButton(0.4f);
		btnDelete.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnDelete.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnDelete.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					int id = new Integer((String) securityRecordJTable
							.getValueAt(table.getSelectedRow(), 1)).intValue();
					MedrexClientManager.getInstance().deleteSecurityRole(id);
					updateSecurityJTable();

				} catch (Exception xe) {

				}

			}
		});
		btnDelete.setFont(new Font("", Font.BOLD, 12));
		btnDelete.setText("Delete");
		btnDelete.setBounds(508, 366, 106, 26);
		// panel.add(btnDelete);

		final JxButton btnCancel = new JxButton(0.4f);
		btnCancel.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnCancel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnCancel.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.setText("Cancel");
		btnCancel.setBounds(620, 366, 106, 26);
		// panel.add(btnCancel);

		final JLabel usersInformationLabel = new JLabel();
		usersInformationLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		usersInformationLabel.setBackground(Color.WHITE);
		usersInformationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		usersInformationLabel.setFont(new Font("Dialog", Font.PLAIN, 28));
		usersInformationLabel.setText("USER LOGON HISTORY");
		usersInformationLabel.setBounds(24, 22, 702, 30);
		panel.add(usersInformationLabel);

		final JLabel fromLabel = new JLabel();
		fromLabel.setText("From");
		fromLabel.setForeground(DEF_COLOR);
		fromLabel.setFont(new Font("Dialog", Font.BOLD, 14));

		fromLabel.setBounds(200, 74, 49, 16);
		panel.add(fromLabel);

		dcFrom = new JDateChooser(MedrexClientManager.getServerTime());
		dcFrom.setBorder(new LineBorder(Color.black, 1, false));
		dcFrom.setBounds(252, 74, 93, 20);
		dcFrom.setDateFormatString("MM/dd/yyyy");
		panel.add(dcFrom);

		final JLabel toLabel = new JLabel();
		toLabel.setText("To");
		toLabel.setForeground(DEF_COLOR);
		toLabel.setFont(new Font("Dialog", Font.BOLD, 14));

		toLabel.setBounds(354, 74, 22, 16);
		panel.add(toLabel);

		dcTo = new JDateChooser(MedrexClientManager.getServerTime());
		dcTo.setBorder(new LineBorder(Color.black, 1, false));
		dcTo.setBounds(380, 74, 93, 20);
		dcTo.setDateFormatString("MM/dd/yyyy");
		panel.add(dcTo);

		filterButton = new JxButton();
		filterButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (dcFrom.getDate() != null && dcTo.getDate() != null) {
					updateSecurityJTableFilter();
				}
			}
		});
		filterButton.setText("Filter");
		filterButton.setArc(0.4f);
		filterButton.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		filterButton.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		filterButton.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		filterButton.setFont(new Font("", Font.BOLD, 12));

		filterButton.setBounds(487, 69, 106, 26);
		panel.add(filterButton);

		// tabbedPane.addTab("Temp", null, new JPanel());

		updateSecurityJTable();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(new Color(32, 63, 84));
		g2.fillRect(0, getHeight() - 76, getWidth(), 76);
	}

	public void doResize() {
		topTabArea.setSize(getWidth(), topTabArea.getHeight());
		topBlueStrip.setSize(getWidth(), topBlueStrip.getHeight());
		defaultPanel.setSize(getWidth(), getHeight() - defaultPanel.getY());
		panel.setLocation((defaultPanel.getWidth() - panel.getWidth()) / 2,
				(defaultPanel.getHeight() - panel.getHeight() - 76) / 2);
		this.repaint();
	}

	public void updateSecurityJTable() {
		List l = new ArrayList();
		try {
			l = MedrexClientManager.getInstance().getUserLogons();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// System.out.println("List is:"+l.get(0));
		securityRecordJTable.setNewList(l);
		securityRecordJTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}

	public void updateSecurityJTableFilter() {
		List l = new ArrayList();
		try {
			// if(true){
			// l = MedrexClientManager.getInstance().getUserLogons();
			// }
			// else{
			// SimpleDateFormat df=new SimpleDateFormat();
			// df.applyPattern("MM/dd/yyy");
			Date dFrom = dcFrom.getDate();
			Date dTo = dcTo.getDate();
			// System.out.println(df.format(dFrom));
			// System.out.println(df.format(dTo));
			l = MedrexClientManager.getInstance().getFilteredUsers(dFrom, dTo);
			// }
		} catch (Exception e) {
			e.printStackTrace();
		}
		// System.out.println("List is:"+l.get(0));
		securityRecordJTable.setNewList(l);
		securityRecordJTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}

}

class UserLogonJTable extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "User", "Login", "Logout" };

	public List l;

	int n = 0;

	UserLogonJTable(List ls) {
		l = ls;
	}

	UserLogonJTable() {
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

	public void setNewList(List ls) {
		l = ls;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			UserLogon userLogon = (UserLogon) l.get(row);
			if (col == 0) {
				// int userSerial = userLogon.getUserId();
				// String username = "";
				// try {
				// if(userSerial!=0){
				// Users users =
				// MedrexClientManager.getInstance().getUser(userSerial);
				// username = users.getUserName();
				// }
				//					
				// } catch (Exception e) {
				//
				// }
				return userLogon.getUserName();
			}
			if (col == 1) {

				return (userLogon.getLogin());
			}
			if (col == 2) {
				return (userLogon.getLogout());
			}

			return ("");
		} catch (Exception e) {
			return ("");
		}

	}
}
