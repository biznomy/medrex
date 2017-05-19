package medrex.client.admin.security;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.AbstractTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.constants.GlobalSecurity;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.security.SecurityRole;

import com.sX.swing.JxButton;
import com.sX.swing.JxTable;

public class PanelSecurityRole extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3264049273859659321L;

	private SecurityRecordJTable securityRecordJTable;

	private JxTable table;
	private FrameSecurityAdd frameSecurityAdd;

	public PanelSecurityRole() {
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(660, 235));
		setLayout(null);

		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent arg0) {
				updateSecurityJTable();
			}
		});

		table = new JxTable();
		table.setBackground(Color.WHITE);
		securityRecordJTable = new SecurityRecordJTable();
		table.setModel(securityRecordJTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					int id = new Integer((String) securityRecordJTable
							.getValueAt(table.getSelectedRow(), 1)).intValue();

					Global.currentSecurityRoleKey = id;

					frameSecurityAdd = new FrameSecurityAdd(0);
					SwingUtils.center(frameSecurityAdd);
					frameSecurityAdd.setTitle("Add New Security Form");
					frameSecurityAdd.setModal(true);
					frameSecurityAdd.setVisible(true);
					updateSecurityJTable();
				} else if (evt.getClickCount() == 1) {
				}
			}
		});

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(24, 0, 636, 203);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		add(scrollPane);

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
				// user type 0. Application Role
				Global.currentRoleType = 0;
				frameSecurityAdd = new FrameSecurityAdd(0);
				SwingUtils.center(frameSecurityAdd);
				frameSecurityAdd.setTitle("Add New Security Form");
				frameSecurityAdd.setModal(true);
				frameSecurityAdd.setVisible(true);
				updateSecurityJTable();
			}
		});
		btnAdd.setText("Add New");
		btnAdd.setBounds(24, 209, 84, 26);
		add(btnAdd);

		final JxButton btnView = new JxButton(0.4f);
		btnView.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnView.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnView.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (!((String) securityRecordJTable.getValueAt(table
						.getSelectedRow(), 1)).equals("")) {
					int id = new Integer((String) securityRecordJTable
							.getValueAt(table.getSelectedRow(), 1)).intValue();

					Global.currentSecurityRoleKey = id;

					frameSecurityAdd = new FrameSecurityAdd(0);
					SwingUtils.center(frameSecurityAdd);
					frameSecurityAdd.setTitle("Add New Security Form");
					frameSecurityAdd.setModal(true);
					frameSecurityAdd.setVisible(true);
				}

				updateSecurityJTable();
			}
		});
		btnView.setFont(new Font("", Font.BOLD, 12));
		btnView.setText("View / Update");
		btnView.setBounds(325, 209, 111, 26);
		add(btnView);

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
		btnDelete.setBounds(442, 209, 106, 26);
		add(btnDelete);

		final JxButton btnCancel = new JxButton(0.4f);
		btnCancel.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnCancel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnCancel.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.setText("Cancel");
		btnCancel.setBounds(554, 209, 106, 26);
		add(btnCancel);

	}

	public void updateSecurityJTable() {
		List l = new ArrayList();

		try {
			// l = MedrexClientManager.getInstance().getAllRoles();
			l = MedrexClientManager.getInstance().getAllApplicationRoles();

		} catch (Exception e) {
		}
		GlobalSecurity.updateSecurity();
		securityRecordJTable.setNewList(l);
		securityRecordJTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}

}

class SecurityRecordJTable extends AbstractTableModel {
	/**
 * 
 */
	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "Roles" };

	public List l;

	int n = 0;

	SecurityRecordJTable(List ls) {
		l = ls;
	}

	SecurityRecordJTable() {
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
			SecurityRole srole = (SecurityRole) l.get(row);

			if (col == 0) {
				return srole.getName();
			}
			if (col == 1) {
				return (srole.getSerial() + "");
			}

			return ("");
		} catch (Exception e) {
			return ("");
		}

	}

}
