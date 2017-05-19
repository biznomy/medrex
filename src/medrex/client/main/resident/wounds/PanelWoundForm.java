package medrex.client.main.resident.wounds;

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

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.vo.admission.ResidentAssessmentFormPage14;

import com.sX.swing.JxButton;
import com.sX.swing.JxTable;

public class PanelWoundForm extends JPanel {

	// TODO : it should be through a controller
	// for the time being it has been done without any controller

	private static final long serialVersionUID = 1L;

	private static final Color DEF_COLOR = new Color(49, 107, 127);

	private JxTable table;

	private WoundFormJTable woundFormTable;

	private FrameWoundRecordAdd frameWoundRecordAdd;

	/**
	 * Create the panel
	 */
	public PanelWoundForm() {
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
		woundFormTable = new WoundFormJTable();
		table.setModel(woundFormTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					Global.currentResidentAssessmentFormPage14Key = (Integer) woundFormTable
							.getValueAt(table.getSelectedRow(), 3);
					boolean isNew = false;
					openForm("Wound Assessment Form", isNew);
					updateWoundFormJTable();
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
				boolean isNew = true;
				openForm("Wound Record Form", isNew);
				updateWoundFormJTable();

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
					int id = (Integer) woundFormTable.getValueAt(table
							.getSelectedRow(), 3);
					MedrexClientManager.getInstance()
							.deleteResidentAssessmentFormPage14(id);
					updateWoundFormJTable();
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
		updateWoundFormJTable();
	}

	public void updateWoundFormJTable() {
		List<ResidentAssessmentFormPage14> woundsRec = null;
		try {
			woundsRec = MedrexClientManager.getInstance()
					.getResidentAssessmentFormPage14OfResident(
							Global.currentResidenceKey);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		woundFormTable.setNewList(woundsRec);
		woundFormTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}

	public static void main(String arg[]) {
		SwingUtils.wrapInDialog(new PanelWoundForm()).setVisible(true);
	}

	public void openForm(String formName, boolean isNew) {
		if (isNew) {
			Global.currentResidentAssessmentFormPage14Key = 0;
		}
		frameWoundRecordAdd = new FrameWoundRecordAdd();
		SwingUtils.center(frameWoundRecordAdd);
		frameWoundRecordAdd.setTitle("Add New Wound Record");
		frameWoundRecordAdd.setModal(true);
		frameWoundRecordAdd.setVisible(true);
		updateWoundFormJTable();
	}

}

class WoundFormJTable extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "Form Name", "Date Created", "Created By" };

	public List<ResidentAssessmentFormPage14> woundRecords;

	int n = 0;

	WoundFormJTable(List<ResidentAssessmentFormPage14> woundsRecords) {
		this.woundRecords = woundsRecords;
	}

	WoundFormJTable() {
		woundRecords = null;
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		if (woundRecords == null) {
			return (0);
		} else {
			return (woundRecords.size());
		}
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List<ResidentAssessmentFormPage14> woundRec) {
		this.woundRecords = woundRec;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern("MM / dd / yyyy");
		try {

			ResidentAssessmentFormPage14 woundRecord = woundRecords.get(row);

			if (col == 0) {
				return (woundRecord.getFormName());
			}
			if (col == 1) {
				return (df.format(woundRecord.getDateOfCreation()) + "");
			}
			if (col == 2) {
				return (woundRecord.getUser().getUserName());
			}
			if (col == 3) {
				return woundRecord.getSerial();
			}
			return ("");
		} catch (Exception e) {
			return ("");
		}

	}

}
