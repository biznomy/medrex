package medrex.client.main.resident.ADL;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

import medrex.client.utils.SwingUtils;
import medrex.client.utils.controls.JxTableMedrex;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.scheduling.scheduling;

import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;

public class PanelResidentADLScheduling extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4897464773887485612L;

	private static final Color DEF_COLOR = new Color(49, 104, 127);

	private List<scheduling> listSch = null;
	boolean isNew;
	private JxTableMedrex table;
	private ControllerResidentSchedulingAdd controllerResidentSchedulingAdd;
	private JxComboBox comboBox;

	// private String controller;
	public PanelResidentADLScheduling() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 712, 248);
		add(panel);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(DEF_COLOR, 1, false));
		scrollPane.setBounds(10, 10, 695, 227);
		panel.add(scrollPane);

		controllerResidentSchedulingAdd = new ControllerResidentSchedulingAdd();
		table = new JxTableMedrex(controllerResidentSchedulingAdd);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					// String serialStr =
					// controllerResidentSchedulingAdd.getValueAt(table.getSelectedRow(),
					// 8)+"";
					// if(serialStr!=null){
					// int id = new Integer(serialStr).intValue();
					// System.out.println("id: +++++++++++++++++++++++++++++++"+id);
					// }
					isNew = false;
					try {
						doAddorUpdate();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});
		scrollPane.setViewportView(table);

		final JxButton addNewButton = new JxButton();
		addNewButton.setBackground(Color.WHITE);
		addNewButton.setForeground(DEF_COLOR);
		addNewButton.setBorder(new LineBorder(new Color(180, 188, 193), 1,
				false));
		addNewButton.setFont(new Font("", Font.BOLD, 12));
		addNewButton.setArc(0.4f);
		addNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				isNew = true;
				doAddorUpdate();
				updateCombo();
			}
		});
		addNewButton.setBounds(7, 254, 98, 26);
		add(addNewButton);
		addNewButton.setText("Add New");

		comboBox = new JxComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setForeground(DEF_COLOR);
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				// getComboElement();
			}
		});

		comboBox.setModel(new DefaultComboBoxModel(
				controllerResidentSchedulingAdd.getComboList().toArray()));

		// comboBox.setModel(new
		// DefaultComboBoxModel(controllerResidentSchedulingAdd.getComboList()));
		comboBox.setBounds(123, 252, 218, 26);
		comboBox.setArc(0.4f);
		add(comboBox);

		final JxButton updateButton = new JxButton();
		updateButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				isNew = false;
				doAddorUpdate();

			}
		});
		updateButton.setBackground(Color.WHITE);
		updateButton.setForeground(DEF_COLOR);
		updateButton.setBorder(new LineBorder(new Color(180, 188, 193), 1,
				false));
		updateButton.setFont(new Font("", Font.BOLD, 12));
		updateButton.setText("Update");
		updateButton.setArc(0.4f);
		updateButton.setBounds(367, 254, 106, 26);
		add(updateButton);

		final JxButton deleteButton_1 = new JxButton();
		deleteButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				isNew = false;
				addCombovalues((String) comboBox.getSelectedItem());
				doDelete();
			}
		});
		deleteButton_1.setBackground(Color.WHITE);
		deleteButton_1.setForeground(DEF_COLOR);
		deleteButton_1.setBorder(new LineBorder(new Color(180, 188, 193), 1,
				false));
		deleteButton_1.setFont(new Font("", Font.BOLD, 12));
		deleteButton_1.setText("Delete");
		deleteButton_1.setArc(0.4f);
		deleteButton_1.setBounds(495, 254, 106, 26);
		deleteButton_1.setBorder(new LineBorder(new Color(180, 188, 193), 1,
				false));
		deleteButton_1.setText("Delete");
		add(deleteButton_1);

		updateTable();

		updateCombo();
	}

	private void updateCombo() {
		new ArrayList<String>();
		for (scheduling sch : listSch) {
			comboBox.removeItem(sch.getProcedureType());
		}
	}

	private void addCombovalues(String str) {
		// comboBox.setModel(new
		// DefaultComboBoxModel(controllerResidentSchedulingAdd.getScheList().toArray()));
		System.out.println("str: " + str);
		comboBox.addItem(str);

	}

	protected void doDelete() {
		String strtype = table.getValueAt(table.getSelectedRow(), 0) + "";
		String selectedItem = (String) comboBox.getSelectedItem();
		setSelectedRowSerial();
		try {
			controllerResidentSchedulingAdd.delete(selectedItem);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		updateTable();
		System.out.println("strtype: " + strtype);
		addCombovalues(strtype);
	}

	public void doUpdate() {
		updateTable();
	}

	public void setSelectedRowSerial() {
		int selectedRow = -1;
		if (!isNew) {
			try {
				selectedRow = table.getSelectedRow();
			} catch (Exception e) {

			}
		}
		if (selectedRow == -1) {
			controllerResidentSchedulingAdd.setCurrentSerial(0);
		} else {
			controllerResidentSchedulingAdd.setCurrentSelectedRow(selectedRow);
		}
	}

	public void doAddorUpdate() {
		String selectedItem = (String) comboBox.getSelectedItem();
		setSelectedRowSerial();
		if ((table.getSelectedRowCount() > 0 && !isNew)
				|| (table.getSelectedRowCount() == 0 && isNew)) {
			PanelResidentSchudlingAdd panelResidentSchudlingAdd = new PanelResidentSchudlingAdd(
					controllerResidentSchedulingAdd, selectedItem);
			SwingUtils.openInDialog(panelResidentSchudlingAdd);
			updateTable();
		}

	}

	// protected void getComboElement() {
	//		
	// String selectedItem = (String) comboBox.getSelectedItem();
	// PanelResidentSchudlingAdd panelResidentSchudlingAdd = new
	// PanelResidentSchudlingAdd(selectedItem);
	// // panelResidentSchudlingAdd.setVisible(true);.
	// medrex.client.utils.SwingUtils.openInDialog(panelResidentSchudlingAdd);
	// }

	public void updateTable() {
		List list = null;

		try {
			list = controllerResidentSchedulingAdd.getResidentScheduling();
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		listSch = list;
		controllerResidentSchedulingAdd.setNewList(list);
		table.update();

	}

}