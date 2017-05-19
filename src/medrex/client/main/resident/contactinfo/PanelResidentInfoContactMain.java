package medrex.client.main.resident.contactinfo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.client.utils.controls.JxTableMedrex;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.resident.ResidentContact;

import com.sX.swing.JxButton;

public class PanelResidentInfoContactMain extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6072347646661237175L;
	private static final Color DEF_COLOR = new Color(49, 107, 127);
	public static ResidentContact resContactForAdvanced;
	private JxTableMedrex table;

	private ControllerResidentInfoContact controller;

	boolean isNew;
	final int mode;

	/**
	 * Create the panel
	 */
	public PanelResidentInfoContactMain(int modex) {
		super();
		mode = modex;
		setSize(new Dimension(698, 396));
		setPreferredSize(new Dimension(698, 396));
		setLayout(null);
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});

		controller = new ControllerResidentInfoContact();
		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 680, 296);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(DEF_COLOR, 1, false));
		add(scrollPane);

		table = new JxTableMedrex(controller);

		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					if (mode == 0) {
						isNew = false;
						doAddorUpdate();
					}
					{
						doSelectionForAdvancedDirective();
						close();
					}
				}
			}
		});

		scrollPane.setViewportView(table);

		final JxButton btnAdd = new JxButton();
		btnAdd.setArc(0.4f);
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setForeground(DEF_COLOR);
		btnAdd.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnAdd.setFont(new Font("", Font.BOLD, 12));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				isNew = true;
				doAddorUpdate();
			}
		});
		btnAdd.setText("Add");
		btnAdd.setBounds(10, 312, 106, 26);
		add(btnAdd);

		final JxButton btnUpdate = new JxButton();
		btnUpdate.setArc(0.4f);
		btnUpdate.setBackground(Color.WHITE);
		btnUpdate.setForeground(DEF_COLOR);
		btnUpdate.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnUpdate.setFont(new Font("", Font.BOLD, 12));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				isNew = false;
				doAddorUpdate();
			}
		});
		btnUpdate.setText("View / Update");
		btnUpdate.setBounds(122, 312, 117, 26);
		add(btnUpdate);

		final JxButton btnDelete = new JxButton();
		btnDelete.setArc(0.4f);
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setForeground(DEF_COLOR);
		btnDelete.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnDelete.setFont(new Font("", Font.BOLD, 12));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doDelete();
			}
		});
		btnDelete.setText("Delete");
		btnDelete.setBounds(245, 312, 106, 26);
		add(btnDelete);

		final JxButton btnCancel = new JxButton();
		btnCancel.setArc(0.4f);
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setForeground(DEF_COLOR);
		btnCancel.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.setText("Cancel");
		btnCancel.setBounds(357, 312, 106, 26);
		add(btnCancel);
		//

		updateTable();
	}

	public void doUpdate() {
		updateTable();
	}

	public void doAddorUpdate() {
		setSelectedRowSerial();
		PanelResidentInfoContactAdd panelResidentInfoContactAdd = new PanelResidentInfoContactAdd(
				controller);
		SwingUtils.openInDialog(panelResidentInfoContactAdd);
		updateTable();

	}

	public void doSelectionForAdvancedDirective() {
		try {
			setSelectedRowSerial();
			resContactForAdvanced = controller.getCurrentResidentContact();
			System.out.println(resContactForAdvanced.getFirstName());
		} catch (Exception e) {
			
		}
	}

	public void doDelete() {
		setSelectedRowSerial();
		try {
			controller.deleteCurrentResidentContact();
		} catch (MedrexException me) {
			JOptionPane.showMessageDialog(null, me.getMessage());
		}
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
			controller.setCurrentContactSerial(0);
		} else {
			controller.setCurrentSelectedRow(selectedRow);
		}

	}

	public void updateTable() {
		controller.setCurrentResidentSerial(Global.currentResidenceKey);
		try {
			controller.updateResidentContactList();
		} catch (MedrexException me) {
			JOptionPane.showMessageDialog(null, me.getMessage());
		}
		table.update();
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

}
