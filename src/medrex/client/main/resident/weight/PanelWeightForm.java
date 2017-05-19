package medrex.client.main.resident.weight;

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
import medrex.client.main.resident.vital.PanelVitalScreen;
import medrex.client.main.resident.vital.PanelVitalScreen.Mode;
import medrex.client.utils.SwingUtils;
import medrex.commons.vo.resident.ResidentWeight;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxButton;
import com.sX.swing.JxTable;

public class PanelWeightForm extends JPanel {

	// TODO : it should be through a controller
	// for the time being it has been done without any controller

	private static final long serialVersionUID = 1L;

	private static final Color DEF_COLOR = new Color(49, 107, 127);

	private JxTable table;

	private WeightFormJTable weightFormTable;

	/**
	 * Create the panel
	 */
	public PanelWeightForm() {
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
		weightFormTable = new WeightFormJTable();
		table.setModel(weightFormTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					Global.currentResidentWeightKey = (Integer) weightFormTable
							.getValueAt(table.getSelectedRow(), 3);
					PanelVitalScreen popUp = new PanelVitalScreen(Mode.WEIGHT,
							null);
					JDialog d = new JDialog();
					d.setSize(new Dimension(480, 330));
					d.setUndecorated(true);
					d.setResizable(false);
					d.setModal(true);
					popUp.setDialog(d);
					d.getContentPane().add(popUp, BorderLayout.CENTER);
					SwingUtils.center(d);
					d.setVisible(true);
					updateWeightFormJTable();
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
				Global.currentResidentWeightKey = 0;
				PanelVitalScreen popUp = new PanelVitalScreen(Mode.WEIGHT, null);
				JDialog d = new JDialog();
				d.setSize(new Dimension(480, 330));
				d.setUndecorated(true);
				d.setResizable(false);
				d.setModal(true);
				popUp.setDialog(d);
				d.getContentPane().add(popUp, BorderLayout.CENTER);
				SwingUtils.center(d);
				d.setVisible(true);

				updateWeightFormJTable();
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
				Global.currentResidentWeightKey = (Integer) weightFormTable
						.getValueAt(table.getSelectedRow(), 3);
				PanelVitalScreen popUp = new PanelVitalScreen(Mode.WEIGHT, null);
				JDialog d = new JDialog();
				d.setSize(new Dimension(480, 330));
				d.setUndecorated(true);
				d.setResizable(false);
				d.setModal(true);
				popUp.setDialog(d);
				d.getContentPane().add(popUp, BorderLayout.CENTER);
				SwingUtils.center(d);
				d.setVisible(true);
				updateWeightFormJTable();
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
					int id = (Integer) weightFormTable.getValueAt(table
							.getSelectedRow(), 3);
					MedrexClientManager.getInstance()
							.deleteResidentWeightRecord(id);
					updateWeightFormJTable();
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

		final JxButton btnReport = new JxButton(0.4f);
		btnReport.setForeground(DEF_COLOR);
		btnReport.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				FrameWeightReport frm = (FrameWeightReport) FrameFactory
						.getInstance().createWindowOfType(
								FrameWeightReport.class);
				frm.setSize(new Dimension(270, 250));
				SwingUtils.center(frm);
				frm.setVisible(true);
			}
		});
		btnReport.setBackground(Color.WHITE);
		btnReport.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnReport.setFont(new Font("", Font.BOLD, 12));
		btnReport.setText("Report");
		btnReport.setBounds(582, 314, 106, 26);
		panel.add(btnReport);

		final JxButton btnSetting = new JxButton();
		btnSetting.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				PanelWeightSetting vSel = new PanelWeightSetting();
				JDialog d = new JDialog();
				d.setSize(new Dimension(350, 250));
				d.setUndecorated(true);
				d.setResizable(false);
				d.setModal(true);
				vSel.setDialog(d);
				d.getContentPane().add(vSel, BorderLayout.CENTER);
				SwingUtils.center(d);
				d.setVisible(true);
			}
		});
		btnSetting.setArc(0.4f);
		btnSetting.setForeground(DEF_COLOR);
		btnSetting.setBackground(Color.WHITE);
		btnSetting.setFont(new Font("", Font.BOLD, 12));
		btnSetting
				.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnSetting.setText("Setting");
		btnSetting.setBounds(20, 314, 111, 26);
		panel.add(btnSetting);

		doUpdate();
	}

	public void doUpdate() {
		updateWeightFormJTable();
	}

	public void updateWeightFormJTable() {
		List<ResidentWeight> weightRecords = null;
		try {
			weightRecords = MedrexClientManager.getInstance()
					.getResidentWeights(Global.currentResidenceKey);
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
		weightFormTable.setNewList(weightRecords);
		weightFormTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}

	public static void main(String arg[]) {
		SwingUtils.wrapInDialog(new PanelWeightForm()).setVisible(true);
	}

}

class WeightFormJTable extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "Weight", "Date of weigh", "Done By" };

	public List<ResidentWeight> weightRecords;

	int n = 0;

	WeightFormJTable(List<ResidentWeight> resWeight) {
		this.weightRecords = resWeight;
	}

	WeightFormJTable() {
		weightRecords = null;
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		if (weightRecords == null) {
			return (0);
		} else {
			return (weightRecords.size());
		}
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List<ResidentWeight> resWeight) {
		this.weightRecords = resWeight;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern("MM / dd / yyyy");
		try {

			ResidentWeight rWeight = weightRecords.get(row);

			if (col == 0) {
				return (rWeight.getWeight() + "");
			}
			if (col == 1) {
				return (df.format(rWeight.getDateOfCreation()) + "");
			}
			if (col == 2) {
				return (rWeight.getUser().getUserName() + "");
			}
			if (col == 3) {
				return (rWeight.getSerial());
			}
			return ("");
		} catch (Exception e) {
			return ("");
		}

	}

}
