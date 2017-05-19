package medrex.client.census.ui.dashboard;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.table.AbstractTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.dataObj.Rooms;
import medrex.commons.enums.GuiModes;
import medrex.commons.enums.ResidentTabs;

import com.sX.swing.JxButton;
import com.sX.swing.JxTable;

public class FrameFloorTypeInfo extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7264659274103886228L;
	private JxButton btnPrint;
	private JxTable table;
	private FloorTableModal refJTableModal;

	private String floorType;

	public FrameFloorTypeInfo(String floor) {
		super();
		Global.currentResidenceArgument = 0;
		setSize(600, 400);
		setTitle("Floor Information");
		setResizable(false);
		// setModal(true);
		// setAlwaysOnTop(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		SwingUtils.center(this);
		floorType = floor;

		final JPanel panelMain = new JPanel();
		panelMain.setBackground(GuiModes.DESIGNER_FORMS
				.getDefaultBackgroundColor());
		panelMain.setLayout(null);
		getContentPane().add(panelMain, BorderLayout.CENTER);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(GuiModes.DESIGNER_FORMS
				.getDefaultBackgroundColor());
		scrollPane.getViewport().setBackground(
				GuiModes.DESIGNER_FORMS.getDefaultBackgroundColor());
		scrollPane.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		scrollPane.setBounds(10, 53, 574, 271);
		panelMain.add(scrollPane);

		final JxButton btnOk = new JxButton();
		btnOk.setArc(0.4f);
		btnOk
				.setBackground(GuiModes.DESIGNER_FORMS
						.getControlBackgroundColor());
		btnOk
				.setForeground(GuiModes.DESIGNER_FORMS
						.getControlForegroundColor());
		btnOk.setHorizontalAlignment(SwingConstants.CENTER);
		btnOk.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		btnOk.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent evt) {
				// Global.currentResidenceArgument = 0;
				FrameFloorTypeInfo.this.dispose();
			}
		});
		btnOk.setText("Ok");
		btnOk.setBounds(501, 330, 83, 28);
		panelMain.add(btnOk);

		final JLabel lblTitle = new JLabel();
		lblTitle.setFont(GuiModes.DESIGNER_FORMS.getDefaultFont().deriveFont(
				28f));
		lblTitle.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lblTitle.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitle.setText("Floor Information:");
		lblTitle.setBounds(10, 10, 574, 37);
		panelMain.add(lblTitle);

		table = new JxTable();
		table.setRowHeight(21);
		table.setRowMargin(2);
		table.setFont(GuiModes.DESIGNER_FORMS.getDefaultFont().deriveFont(12f)
				.deriveFont(Font.PLAIN));
		refJTableModal = new FloorTableModal();
		table.setModel(refJTableModal);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					int id = (Integer) refJTableModal.getValueAt(table
							.getSelectedRow(), 3);

					if (id != 0) {
						Global.currentMainTab = 0;
						Global.currentInnerTab = 5;
						Global.currentResidenceArgument = id;
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.RESIDENT_INFORMATION, null);
						doClose();
					}

				}
			}
		});

		scrollPane.setViewportView(table);

		btnPrint = new JxButton();
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				MessageFormat header = new MessageFormat("Floor Information");
				try {
					table.print(JTable.PrintMode.FIT_WIDTH, header, null);
				} catch (java.awt.print.PrinterException e) {
					System.err.format("Cannot print %s%n", e.getMessage());
				}
			}
		});
		btnPrint.setText("Print");
		btnPrint.setArc(0.4f);
		btnPrint.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnPrint.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnPrint.setHorizontalAlignment(SwingConstants.CENTER);
		btnPrint.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		btnPrint.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnPrint.setBounds(363, 331, 106, 26);
		panelMain.add(btnPrint);
		updateJTable();
	}

	public void doClose() {
		this.dispose();
	}

	public void updateJTable() {
		List<Rooms> records = new ArrayList();
		try {
			if (floorType.equalsIgnoreCase("1st Floor")) {
				records = MedrexClientManager.getInstance()
						.getFirstFloorResidents();
			} else if (floorType.equalsIgnoreCase("2nd Floor")) {
				records = MedrexClientManager.getInstance()
						.getSecondFloorResidents();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		refJTableModal.setNewList(records);
		refJTableModal.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}
}

class FloorTableModal extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5841708621766544560L;

	private String[] columnNames = { "Resident", "Floor", "Room No." };

	private List<Rooms> records;

	int n = 0;

	public FloorTableModal(List<Rooms> recordsList) {
		setNewList(recordsList);
	}

	public FloorTableModal() {
		this(new ArrayList<Rooms>());
	}

	// public FloorTableModal() {
	// // TODO Auto-generated constructor stub
	// }

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (records.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List<Rooms> recordsList) {
		records = recordsList;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			Rooms rm = records.get(row);
			switch (col) {
			case 0:
				return rm.getResmain().getUserPass() + ", "
						+ rm.getResmain().getUserName();
			case 1:
				return rm.getCurrentFloor();
			case 2:
				return rm.getCurrentRoom();
			default:
				return "";
			case 3:
				return rm.getResmain().getSerial();
			}

		} catch (Exception e) {
			e.printStackTrace();
			return ("");
		}
	}
}
