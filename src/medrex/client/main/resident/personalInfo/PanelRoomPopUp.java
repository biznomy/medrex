package medrex.client.main.resident.personalInfo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

import medrex.client.utils.SwingUtils;
import medrex.client.utils.controls.JxTableMedrex;
import medrex.commons.intf.PopUpView;

import com.sX.swing.JxComboBox;

public class PanelRoomPopUp extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2605928373716000226L;
	private JLabel oldRoom;
	private JLabel lastBed;
	private JxTableMedrex table;
	private ControllerRoomList controllerRoomList;
	private JxComboBox cmbFloorType;
	private static final Color DEF_COLOR = new Color(49, 104, 127);

	public PanelRoomPopUp(final ControllerRoomList controllerRoomList) {
		super();
		this.controllerRoomList = controllerRoomList;
		setLayout(null);
		setBackground(Color.WHITE);
		setSize(221, 293);

		final JLabel fLabel = new JLabel();
		fLabel.setForeground(DEF_COLOR);
		fLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		fLabel.setText("FLOOR #");
		fLabel.setBounds(10, 13, 66, 16);
		add(fLabel);

		cmbFloorType = new JxComboBox();
		cmbFloorType.setBackground(Color.WHITE);
		cmbFloorType.setForeground(DEF_COLOR);
		cmbFloorType.setArc(0.4f);
		cmbFloorType.setBorder(new LineBorder(DEF_COLOR, 1, false));
		cmbFloorType.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				updateRoomSubCategory();
			}
		});
		cmbFloorType.setBounds(70, 9, 128, 25);
		add(cmbFloorType);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 40, 219, 220);
		add(scrollPane);

		table = new JxTableMedrex(controllerRoomList);
		table.setBackground(Color.WHITE);

		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					doUpdateRoomAndFloorType();
					close();
				}
				table.getSelectedRow();
				int col = table.getSelectedColumn();
				if (col == 1) {
					String str = controllerRoomList.getValueAt(table
							.getSelectedRow(), 2)
							+ "";
					if (!str.equals("")) {
						int id = new Integer(str).intValue();
						doBedHoldInfo(id);
					}

				}
			}
		});

		scrollPane.setViewportView(table);
		scrollPane.setBackground(Color.WHITE);

		lastBed = new JLabel();
		lastBed.setText("Last Known Bed: ");
		lastBed.setForeground(DEF_COLOR);
		lastBed.setFont(new Font("Dialog", Font.BOLD, 12));
		lastBed.setBounds(10, 266, 102, 16);
		add(lastBed);

		oldRoom = new JLabel();
		oldRoom.setForeground(DEF_COLOR);
		oldRoom.setFont(new Font("Dialog", Font.BOLD, 12));
		oldRoom.setBounds(132, 266, 79, 16);
		add(oldRoom);

		controllerRoomList.getAllRooms("1st floor south wing");

		updateRoomCategoryCombo();
		updateTable();
		updateRoomOnBedHold();
	}

	public void updateTable() {
		if (controllerRoomList.getOldRoom() != null) {
			oldRoom.setText(controllerRoomList.getOldRoom());
		}

		table.update();
	}

	public void doUpdateRoomAndFloorType() {
		controllerRoomList.setFloorType(cmbFloorType.getSelectedItem() + "");
		setSelectedRowSerial();
	}

	public void doBedHoldInfo(int serial) {
		PanelBedHoldInfo panelBedHoldInfo = new PanelBedHoldInfo(serial);
		SwingUtils.openInDialog(panelBedHoldInfo);
	}

	public void setSelectedRowSerial() {
		int selectedRow = -1;
		try {
			selectedRow = table.getSelectedRow();
		} catch (Exception e) {

		}
		String r = table.getValueAt(selectedRow, 0).toString();
		controllerRoomList.setRoom(r);
	}

	public void updateRoomOnBedHold() {
		List rooms = controllerRoomList.getRoomsOnBedHold();
		if (rooms != null) {
			// table.set
		}
	}

	public void updateRoomCategoryCombo() {
		cmbFloorType.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "1st floor south wing", "Main North Wing",
						"2nd floor South Wing", "Main and north wing" }));

		cmbFloorType.setSelectedIndex(0);
	}

	public void updateRoomSubCategory() {
		controllerRoomList.getAllRooms(cmbFloorType.getSelectedItem() + "");
		updateTable();
	}

	@Override
	public String getTitle() {
		return "Room List";
	}
}
