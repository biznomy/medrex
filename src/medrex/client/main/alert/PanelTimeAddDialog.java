package medrex.client.main.alert;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import medrex.commons.intf.PopUpView;

import com.sX.swing.JxTable;

public class PanelTimeAddDialog extends PopUpView {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6688660284628177705L;
	private JButton btnSave;
	private JButton btnDelete;
	private JButton btnUpdate;
	private JButton btnAdd;
	SpinnerDateModel model;
	final JSpinner spinner;
	public static final Color DEF_COL = new Color(49, 104, 127);
	private JxTable table;
	private AlertTimeJTable alertTimeJTable;
	private String textString;

	public String getTextString() {
		return textString;
	}

	public void setTextString(String textString) {
		this.textString = textString;
	}

	public PanelTimeAddDialog(String str) {
		super();
		setBackground(Color.WHITE);
		setSize(500, 370);
		setLayout(null);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(10, 10, 480, 355);
		add(panel);

		model = new SpinnerDateModel();
		model.setCalendarField(Calendar.HOUR_OF_DAY);
		spinner = new JSpinner(model);
		JSpinner.DateEditor editor = new JSpinner.DateEditor(spinner, "hh:mm a");
		spinner.setEditor(editor);
		spinner.setBounds(91, 50, 166, 20);
		panel.add(spinner);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 83, 423, 181);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(DEF_COL, 1, false));
		panel.add(scrollPane);

		table = new JxTable();
		alertTimeJTable = new AlertTimeJTable();
		table.setModel(alertTimeJTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {

				}
			}
		});

		scrollPane.setViewportView(table);

		btnAdd = new JButton();
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				List l = alertTimeJTable.alertTimeRecords;
				SimpleDateFormat df = new SimpleDateFormat();
				df.applyPattern("hh:mm a");
				Date date = (Date) spinner.getValue();
				l.add(df.format(date));
				// for (Object obj : l) {
				// System.out.println("obj" + obj);
				// }
				alertTimeJTable.setNewList(l);
				updateAlertTimeJTable();
			}
		});
		btnAdd.setBounds(288, 48, 95, 24);
		btnAdd.setText("Add");
		panel.add(btnAdd);

		// btnUpdate = new JButton();
		// btnUpdate.addActionListener(new ActionListener() {
		// public void actionPerformed(final ActionEvent e) {
		//				
		// }
		// });
		// btnUpdate.setText("Update");
		// btnUpdate.setBounds(56, 296, 95, 24);
		// panel.add(btnUpdate);

		btnDelete = new JButton();
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					List l = alertTimeJTable.alertTimeRecords;
					int i = table.getSelectedRow();
					l.remove(i);
					alertTimeJTable.setNewList(l);
				} catch (Exception ex) {

				}

				updateAlertTimeJTable();
			}
		});
		btnDelete.setText("Delete");
		btnDelete.setBounds(96, 296, 95, 24);
		panel.add(btnDelete);

		btnSave = new JButton();
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSave();
				close();
			}
		});
		btnSave.setText("Save");
		btnSave.setBounds(261, 296, 95, 24);
		panel.add(btnSave);

		doLoad(str);

	}

	private void doLoad(String str) {
		List list = new ArrayList();
		StringTokenizer temp = new StringTokenizer(str);
		while (temp.hasMoreElements()) {
			list.add(temp.nextToken(";"));
		}
		alertTimeJTable.setNewList(list);
		updateAlertTimeJTable();
	}

	private void doSave() {
		String str = "";
		Iterator it = alertTimeJTable.alertTimeRecords.iterator();
		while (it.hasNext()) {
			str += (String) it.next() + ",";
		}
		textString = str;
	}

	private void updateAlertTimeJTable() {
		alertTimeJTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}

	class AlertTimeJTable extends AbstractTableModel {
		/**
		 * 
		 */
		private static final long serialVersionUID = -5868938777126702538L;

		/**
		 * 
		 */
		private String[] columnNames = { "Time" };

		public List alertTimeRecords;

		int n = 0;

		AlertTimeJTable(List alertTimeRecords) {
			this.alertTimeRecords = alertTimeRecords;
		}

		AlertTimeJTable() {
			this.alertTimeRecords = new ArrayList();
		}

		public int getColumnCount() {
			return columnNames.length;
		}

		public int getRowCount() {
			return (alertTimeRecords.size());
		}

		public void setRowCount(int count) {
			n = n + count;
		}

		public void setNewList(List alertTimeRecords) {
			this.alertTimeRecords = alertTimeRecords;
		}

		@Override
		public String getColumnName(int col) {
			return columnNames[col];
		}

		public Object getValueAt(int row, int col) {
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("hh:mm a");
			model.getDate();
			try {
				Object o = alertTimeRecords.get(row);
				if (col == 0) {
					return (o);
				}
				return ("");
			} catch (Exception e) {
				e.printStackTrace();
				return ("");
			}
		}
	}

	@Override
	public String getTitle() {
		return "Add time";
	}

}
