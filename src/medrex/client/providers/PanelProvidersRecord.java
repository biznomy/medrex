package medrex.client.providers;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import medrex.client.FrameLogin;
import medrex.client.admin.userLogon.ControllerUserLogon;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.client.utils.controls.JxTableMedrex;
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;

public class PanelProvidersRecord extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// private ProvidersJTable providersJTable;

	private JPanel topTabArea;

	private JPanel topTabsPanel;

	private JPanel topBlueStrip;

	private JPanel defaultPanel;

	private JxPanel panel;

	private ControllerProvider controllerProvider;

	private JxTableMedrex table;

	private boolean isNew;

	/**
	 * Create the panel
	 */
	public PanelProvidersRecord() {
		super();
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});
		setLayout(null);
		setPreferredSize(new Dimension(868, 768));
		controllerProvider = new ControllerProvider();

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
		defaultPanel.setBorder(new EmptyBorder(20, 0, 0, 10));
		defaultPanel.setOpaque(false);
		defaultPanel.setLayout(null);
		defaultPanel.setBounds(0, 176, 868, 592);
		add(defaultPanel);

		panel = new JxPanel();
		panel.setArc(1f);
		panel.setBorder(new LineBorder(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor(), 1, false));
		panel.setBounds(115, 0, 750, 434);
		panel.setBackground(Color.WHITE);
		panel.setPreferredSize(new Dimension(750, 434));
		panel.setLayout(null);
		defaultPanel.add(panel);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBounds(24, 75, 702, 285);
		panel.add(scrollPane);

		table = new JxTableMedrex(controllerProvider);
		table.setBounds(24, 75, 702, 285);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					isNew = false;
					doAddorUpdate();
				} else if (evt.getClickCount() == 1) {
					System.out.println("single click");
				}
			}
		});

		scrollPane.setViewportView(table);

		final JxButton btnAdd = new JxButton();
		btnAdd.setArc(0.4f);
		btnAdd.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnAdd.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnAdd.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnAdd.setFont(new Font("", Font.BOLD, 12));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				isNew = true;
				doAddorUpdate();
			}
		});
		btnAdd.setText("Add");
		btnAdd.setBounds(273, 366, 106, 26);
		panel.add(btnAdd);

		final JxButton btnUpdate = new JxButton();
		btnUpdate.setArc(0.4f);
		btnUpdate.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnUpdate.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnUpdate.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnUpdate.setFont(new Font("", Font.BOLD, 12));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				System.out.println("table.getSelectedRow(): "
						+ table.getSelectedRow());
				if (table.getSelectedRow() != -1) {
					isNew = false;
					doAddorUpdate();
				}
			}
		});
		btnUpdate.setText("View / Update");
		btnUpdate.setBounds(385, 366, 117, 26);
		panel.add(btnUpdate);

		final JxButton btnDelete = new JxButton();
		btnDelete.setArc(0.4f);
		btnDelete.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnDelete.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnDelete.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnDelete.setFont(new Font("", Font.BOLD, 12));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				isNew = false;
				doDelete();
			}
		});
		btnDelete.setText("Delete");
		btnDelete.setBounds(508, 366, 106, 26);
		panel.add(btnDelete);

		final JxButton btnCancel = new JxButton();
		btnCancel.setArc(0.4f);
		btnCancel.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnCancel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnCancel.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
			}
		});
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.setText("Cancel");
		btnCancel.setBounds(620, 366, 106, 26);
		panel.add(btnCancel);

		final JLabel usersInformationLabel = new JLabel();
		usersInformationLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		usersInformationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		usersInformationLabel.setFont(new Font("Dialog", Font.PLAIN, 28));
		usersInformationLabel.setText("PROVIDERS");
		usersInformationLabel.setBounds(24, 22, 702, 30);
		panel.add(usersInformationLabel);

		// updateProvidersRecordJTable();
		updateTable();
	}

	protected void doDelete() {
		setSelectedRowSerial();
		if (controllerProvider.getCurrentSerial() != 0) {
			try {
				controllerProvider.deleteProvidersRecordForm();
			} catch (MedrexException e) {
				// JOptionPane.showMessageDialog(null, e.getMessage());
			}
			updateTable();
		} else {

		}

	}

	protected void doAddorUpdate() {
		setSelectedRowSerial();
		controllerProvider.setType("providerMain");
		PanelProvidersRecordAdd panelProvidersRecordAdd = new PanelProvidersRecordAdd(
				controllerProvider);
		SwingUtils.openInDialog(panelProvidersRecordAdd);
		updateTable();

	}

	private void updateTable() {
		List list = null;
		try {
			list = controllerProvider.getProvidersRecordForms();
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		controllerProvider.setNewList(list);
		table.update();

	}

	private void setSelectedRowSerial() {
		int selectedRow = -1;
		if (!isNew) {
			try {
				selectedRow = table.getSelectedRow();
				// System.out.println("Serial is =  " + selectedRow );
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (selectedRow == -1) {
			controllerProvider.setCurrentSerial(0);
		} else {
			controllerProvider.setCurrentSelectedRow(selectedRow);

		}
	}

	public void doUpdate() {
		topTabArea.setSize(getWidth(), topTabArea.getHeight());
		topBlueStrip.setSize(getWidth(), topBlueStrip.getHeight());
		defaultPanel.setSize(getWidth(), getHeight() - defaultPanel.getY());
		panel.setLocation((defaultPanel.getWidth() - panel.getWidth()) / 2,
				(defaultPanel.getHeight() - panel.getHeight() - 76) / 2);
		this.repaint();
		updateTable();
	}

	// public void updateProvidersRecordJTable() {
	// List l = new ArrayList();
	//
	// try {
	// l = Global.ltcServer.getProvidersRecordForms();
	// } catch (Exception e) {
	//
	// }
	//
	// providersJTable.setNewList(l);
	// providersJTable.fireTableStructureChanged();
	// table.updateUI();
	// table.repaint();
	//
	// }

}

// class ProvidersJTable extends AbstractTableModel {
// /**
// *
// */
// private static final long serialVersionUID = 1L;
//
// private String[] columnNames = { "Provider Type", "Provider Name",
// "Provider Phone" };
//
// public List l;
//
// int n = 0;
//
// ProvidersJTable(List ls) {
// l = ls;
// }
//
// ProvidersJTable() {
// l = new ArrayList();
// }
//
// public int getColumnCount() {
// return columnNames.length;
// }
//
// public int getRowCount() {
//
// return (l.size());
//
// }
//
// public void setRowCount(int count) {
// n = n + count;
// }
//
// public void setNewList(List listDoctors) {
// l = listDoctors;
// }
//
// public String getColumnName(int col) {
// return columnNames[col];
// }
//
// public Object getValueAt(int row, int col) {
// try {
// ProvidersRecordForm rc = (ProvidersRecordForm) l.get(row);
//
// if (col == 0) {
// return (rc.getProviderType());
// }
// if (col == 1) {
// return (rc.getProviderName() + "   " + rc.getProviderSurName());
// }
// if (col == 2) {
// return (rc.getPhoneNumber() + "");
// }
//
// if (col == 3) {
// return (rc.getSerial() + "");
// }
//
// return ("");
// } catch (Exception e) {
// return ("");
// }
//
// }
// }
