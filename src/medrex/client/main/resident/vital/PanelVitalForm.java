package medrex.client.main.resident.vital;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.resident.vital.PanelVitalScreen.Mode;
import medrex.client.utils.SwingUtils;
import medrex.commons.vo.resident.ResidentVitalSigns;

import com.sX.swing.JxButton;
import com.sX.swing.JxTable;

public class PanelVitalForm extends JPanel {

	// TODO : it should be through a controller
	// for the time being it has been done without any controller

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Color DEF_COLOR = new Color(49, 107, 127);

	private JxTable table;

	private VitalFormJTable vitalFormTable;

	/**
	 * Create the panel
	 */
	public PanelVitalForm() {
		super();

		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(698, 396));
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});

		final JPanel panel = new JPanel();
		panel.setForeground(SystemColor.desktop);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		add(panel, BorderLayout.CENTER);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(DEF_COLOR, 1, false));
		scrollPane.setBounds(10, 10, 678, 298);
		panel.add(scrollPane);

		table = new JxTable();
		vitalFormTable = new VitalFormJTable();
		table.setModel(vitalFormTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					Global.currentVitalSignKey = (Integer) vitalFormTable
							.getValueAt(table.getSelectedRow(), 5);
					PanelVitalScreen vSel = new PanelVitalScreen(Mode.VITAL,
							null);
					JDialog d = new JDialog();
					d.setSize(new Dimension(480, 300));
					d.setUndecorated(true);
					d.setResizable(false);
					d.setModal(true);
					vSel.setDialog(d);
					d.getContentPane().add(vSel, BorderLayout.CENTER);
					SwingUtils.center(d);
					d.setVisible(true);
					updateVitalFormJTable();
				} else if (evt.getClickCount() == 1) {
					System.out.println("single click");
				}
			}
		});

		scrollPane.setViewportView(table);

		final JxButton btnAdd = new JxButton(0.4f);
		btnAdd.setForeground(DEF_COLOR);
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnAdd.setFont(new Font("", Font.BOLD, 12));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.currentVitalSignKey = 0;
				PanelVitalScreen vSel = new PanelVitalScreen(Mode.VITAL, null);
				JDialog d = new JDialog();
				d.setSize(new Dimension(480, 300));
				d.setUndecorated(true);
				d.setResizable(false);
				d.setModal(true);
				vSel.setDialog(d);
				d.getContentPane().add(vSel, BorderLayout.CENTER);
				SwingUtils.center(d);
				d.setVisible(true);

				updateVitalFormJTable();
			}
		});
		btnAdd.setText("Add New");
		btnAdd.setBounds(248, 314, 99, 26);
		panel.add(btnAdd);

		final JxButton btnView = new JxButton(0.4f);
		btnView.setForeground(DEF_COLOR);
		btnView.setBackground(Color.WHITE);
		btnView.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

			}
		});
		btnView.setFont(new Font("", Font.BOLD, 12));
		btnView.setText("View");
		btnView.setBounds(353, 314, 111, 26);
		panel.add(btnView);

		final JxButton btnDelete = new JxButton(0.4f);
		btnDelete.setForeground(DEF_COLOR);
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					int id = (Integer) vitalFormTable.getValueAt(table
							.getSelectedRow(), 5);
					MedrexClientManager.getInstance()
							.deleteResidentVitalRecord(id);
					updateVitalFormJTable();
				} catch (ClassCastException ccEx) {
					System.out.println("Please select a row to delete");
				} catch (Exception xe) {
					xe.printStackTrace();
				}
			}
		});
		btnDelete.setFont(new Font("", Font.BOLD, 12));
		btnDelete.setText("Delete");
		btnDelete.setBounds(470, 314, 106, 26);
		panel.add(btnDelete);

		final JxButton btnCancel = new JxButton(0.4f);
		btnCancel.setForeground(DEF_COLOR);
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.setText("Cancel");
		btnCancel.setBounds(582, 314, 106, 26);
		panel.add(btnCancel);

		doUpdate();
	}

	public void doUpdate() {
		updateVitalFormJTable();
	}

	public void updateVitalFormJTable() {
		List<ResidentVitalSigns> vitalSigns = null;
		try {
			vitalSigns = MedrexClientManager.getInstance().getVitalSigns(
					Global.currentResidenceKey);
			/*
			 * Collections.sort(vitalSigns, new Comparator() { // +1 if a > b //
			 * 0 if a = b // -1 if a < b public int compare(final Object a,
			 * final Object b) { Date aDate, bDate; aDate = new
			 * Date(((ResidentVitalSigns) a).getDateCreated()); bDate = new
			 * Date();
			 * 
			 * if (aDate.getTime() == bDate.getTime()) { return 0; } else return
			 * (aDate.getTime() > bDate.getTime()) ? 1 : -1; } });
			 */
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		vitalFormTable.setNewList(vitalSigns);
		vitalFormTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}

	public static void main(String arg[]) {
		SwingUtils.wrapInDialog(new PanelVitalForm()).setVisible(true);
	}

}

class VitalFormJTable extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "Temperature", "Pulse", "BP",
			"Date Created", "Created By" };

	public List<ResidentVitalSigns> vitalSignRecords;

	int n = 0;

	VitalFormJTable(List<ResidentVitalSigns> vitalSignsRecords) {
		this.vitalSignRecords = vitalSignsRecords;
	}

	VitalFormJTable() {
		vitalSignRecords = null;
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		if (vitalSignRecords == null) {
			return (0);
		} else {
			return (vitalSignRecords.size());
		}
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List<ResidentVitalSigns> resVitalSigns) {
		this.vitalSignRecords = resVitalSigns;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern("MM / dd / yyyy");
		try {

			ResidentVitalSigns rVital = vitalSignRecords.get(row);

			if (col == 0) {
				return (rVital.getTemprature() + "");
			}
			if (col == 1) {
				return (rVital.getPulse() + "");
			}
			if (col == 2) {
				return (rVital.getBp() + "");
			}
			if (col == 3) {
				return (df.format(rVital.getDateCreated()) + "");
			}
			if (col == 4) {
				return rVital.getUser().getUserName() + "";
			}
			if (col == 5) {
				return rVital.getSerial();
			}

			return ("");
		} catch (Exception e) {
			return ("");
		}

	}

}
