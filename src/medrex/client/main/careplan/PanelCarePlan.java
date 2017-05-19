package medrex.client.main.careplan;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.constants.GlobalSecurity;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.SubAppTypes;
import medrex.commons.vo.carePlan.CarePlan;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;

public class PanelCarePlan extends JPanel {

	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);

	private JxComboBox cmbFormType;
	private static final long serialVersionUID = 1L;
	private JxTable table;
	private CarePlanJTable carePlanJTable;
	public FrameCarePlanAdd frameCarePlanAdd;

	public PanelCarePlan() {
		super();

		setLayout(null);
		setPreferredSize(new Dimension(718, 448));
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});

		final JxPanel panel = new JxPanel(1f);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 20, 720, 466);
		add(panel);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 52, 680, 232);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(DEF_COL, 1, false));
		panel.add(scrollPane);

		table = new JxTable();
		carePlanJTable = new CarePlanJTable();
		table.setModel(carePlanJTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {

					int id = new Integer((String) carePlanJTable.getValueAt(
							table.getSelectedRow(), 1)).intValue();

					Global.currentCarePlanKey = id;

					frameCarePlanAdd = (FrameCarePlanAdd) FrameFactory
							.createWindowOfType(FrameCarePlanAdd.class);
					SwingUtils.center(frameCarePlanAdd);
					frameCarePlanAdd.setTitle("View/Update Care Plan Record");
					frameCarePlanAdd.setModal(true);
					frameCarePlanAdd.setVisible(true);
					updateCarePlanJTable();
				} else if (evt.getClickCount() == 1) {
					System.out.println("single click");
				}
			}
		});

		scrollPane.setViewportView(table);

		final JxButton btnAdd = new JxButton(0.4f);
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setForeground(DEF_COL);
		btnAdd.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnAdd.setBounds(52, 365, 84, 26);
		btnAdd.setFont(new Font("", Font.BOLD, 12));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (GlobalSecurity.isUpdatePriviledge(SubAppTypes.CARE_PLAN)) {
					Global.currentCarePlanKey = 0;

					Global.currentCarePalnForm = (String) cmbFormType
							.getSelectedItem();

					frameCarePlanAdd = (FrameCarePlanAdd) FrameFactory
							.createWindowOfType(FrameCarePlanAdd.class);

					SwingUtils.center(frameCarePlanAdd);
					frameCarePlanAdd.setTitle("Add New Care Plan Record");
					frameCarePlanAdd.setModal(true);
					frameCarePlanAdd.setVisible(true);
					updateCarePlanJTable();
				}
			}
		});
		btnAdd.setText("Add New");
		panel.add(btnAdd);

		final JxButton btnView = new JxButton(0.4f);
		btnView.setBackground(Color.WHITE);
		btnView.setForeground(DEF_COL);
		btnView.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnView.setBounds(437, 318, 111, 26);
		btnView.setFont(new Font("", Font.BOLD, 12));
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					int id = new Integer((String) carePlanJTable.getValueAt(
							table.getSelectedRow(), 1)).intValue();

					Global.currentCarePlanKey = id;

					frameCarePlanAdd = (FrameCarePlanAdd) FrameFactory
							.createWindowOfType(FrameCarePlanAdd.class);
					SwingUtils.center(frameCarePlanAdd);
					frameCarePlanAdd.setTitle("View/Update Care Plan Record");
					frameCarePlanAdd.setModal(true);
					frameCarePlanAdd.setVisible(true);
					updateCarePlanJTable();
				} catch (Exception ve) {
				}
			}
		});
		btnView.setText("View / Update");
		panel.add(btnView);

		final JxButton btnDelete = new JxButton(0.4f);
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setForeground(DEF_COL);
		btnDelete.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnDelete.setBounds(554, 318, 70, 26);
		btnDelete.setFont(new Font("", Font.BOLD, 12));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					int id = new Integer((String) carePlanJTable.getValueAt(
							table.getSelectedRow(), 1)).intValue();
					int formId = new Integer((String) carePlanJTable
							.getValueAt(table.getSelectedRow(), 2)).intValue();
					if (id != 0) {
						MedrexClientManager.getInstance().deleteCarePlan(id);
					}
					if (formId != 0) {
						MedrexClientManager.getInstance().deleteCarePlanRecord(
								formId);
					}
					updateCarePlanJTable();

				} catch (Exception xe) {

				}

			}
		});
		btnDelete.setText("Delete");
		panel.add(btnDelete);

		final JxButton btnCancel = new JxButton(0.4f);
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setForeground(DEF_COL);
		btnCancel.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.setText("Cancel");
		btnCancel.setBounds(630, 318, 70, 26);
		panel.add(btnCancel);

		final JLabel residentInformationLabel = new JLabel();
		residentInformationLabel.setForeground(DEF_COL);
		residentInformationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		residentInformationLabel.setBounds(10, 10, 700, 30);
		residentInformationLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		residentInformationLabel.setText("Care Plan");
		panel.add(residentInformationLabel);

		cmbFormType = new JxComboBox();
		cmbFormType.setBackground(Color.WHITE);
		cmbFormType.setArc(0.4f);
		cmbFormType.setForeground(DEF_COL);
		cmbFormType.setBorder(new LineBorder(BORDER_COL, 1, false));
		cmbFormType.setBounds(142, 366, 96, 25);
		cmbFormType.setFont(new Font("Dialog", Font.BOLD, 12));
		panel.add(cmbFormType);

		fillCombos();

	}

	public void fillCombos() {
		cmbFormType.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "Care Plan 1" }));
	}

	public void doUpdate() {
		updateCarePlanJTable();
	}

	public void updateCarePlanJTable() {
		List carePlanRecords = new ArrayList();

		if (Global.currentResidenceKey != 0) {

			try {
				carePlanRecords = MedrexClientManager.getInstance()
						.getCarePlanList(Global.currentResidenceKey);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		carePlanJTable.setNewList(carePlanRecords);
		carePlanJTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}

	class CarePlanJTable extends AbstractTableModel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		private String[] columnNames = { "Date" };

		public List carePlanRecords;

		int n = 0;

		CarePlanJTable(List carePlanRecords) {
			this.carePlanRecords = carePlanRecords;
		}

		CarePlanJTable() {
			this.carePlanRecords = new ArrayList();
		}

		public int getColumnCount() {
			return columnNames.length;
		}

		public int getRowCount() {
			return (carePlanRecords.size());
		}

		public void setRowCount(int count) {
			n = n + count;
		}

		public void setNewList(List carePlanRecords) {
			this.carePlanRecords = carePlanRecords;
		}

		@Override
		public String getColumnName(int col) {
			return columnNames[col];
		}

		public Object getValueAt(int row, int col) {
			try {
				Object o = carePlanRecords.get(row);
				SimpleDateFormat df = new SimpleDateFormat();
				df.applyPattern("MM / dd / yyyy");
				if (o instanceof CarePlan) {
					CarePlan carePlan = (CarePlan) o;

					if (col == 0) {
						return (df.format(carePlan.getDateCreated()));
					}
					if (col == 1) {
						return (carePlan.getSerial() + "");
					}
					if (col == 2) {
						return (carePlan.getFormId() + "");
					}
					return ("");
				}
				return ("");
			}

			catch (Exception e) {
				return ("");
			}
		}
	}

}
