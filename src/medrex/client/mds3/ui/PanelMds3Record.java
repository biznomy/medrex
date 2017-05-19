package medrex.client.mds3.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.scan.FrameScanFormAdd;
import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3ItemSet;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.itemsets.Mds3ItemSetNC;
import medrex.client.utils.SwingUtils;
import medrex.commons.vo.mds3.Mds3;
import medrex.commons.vo.mds3.SectionA.Mds3SectionA;

import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;

public class PanelMds3Record extends JPanel {

	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);

	private JxComboBox cmbFormType;
	private static final long serialVersionUID = 1L;
	private JxTable table;
	private MDSFormJTable mDSFormTable;
	public FrameScanFormAdd frameScanFormAdd;
	public FrameMds3RecordAdd frameMds3RecordAdd;

	public PanelMds3Record() {
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
		mDSFormTable = new MDSFormJTable();
		table.setModel(mDSFormTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			// private FrameMDSRecordAdd frameMDSFormAdd;

			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					try {
						int id = new Integer((String) mDSFormTable.getValueAt(
								table.getSelectedRow(), 5)).intValue();
						if (id != -1) {
							Global.currentMDS3FormKey = id;
							Global.currentMds3FormType = (String) cmbFormType
									.getSelectedItem();
							Mds3Controller.getInstance().getMDS3(id);
							if (Global.currentMds3FormType
									.equalsIgnoreCase("NC")) {
								Mds3ItemSet itemSet = Mds3ItemSetNC
										.getNCItemSet();
								itemSet.getPages().size();
								List list = new ArrayList<Mds3ItemSet>();
								if (Global.currentMds3Page == null) {
									Global.currentMds3Page = 1;
								}
								list = itemSet.getPages().get(
										Global.currentMds3Page + "")
										.getSubSections();
								for (int i = 0; i < list.size(); i++) {
									// Mds3SubSection sec = (Mds3SubSection)
									// list.get(Global.currentMds3Page);
									Mds3SubSection sec = (Mds3SubSection) list
											.get(i);
									sec.doUpdate();

								}
							}

							frameMds3RecordAdd = new FrameMds3RecordAdd();
							SwingUtils.center(frameMds3RecordAdd);
							frameMds3RecordAdd
									.setTitle("View/Update MDS Reports");
							frameMds3RecordAdd.setModal(true);
							frameMds3RecordAdd.setVisible(true);
						}
						updateMDSFormJTable();
					} catch (Exception ve) {
						ve.printStackTrace();
					}

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
			private FrameMds3RecordAdd frameMds3RecordAdd;

			public void actionPerformed(final ActionEvent e) {
				Global.currentMDS3FormKey = 0;
				new ArrayList<Mds3SectionA>();
				try {
					Mds3Controller.getInstance().doUnset();
				} catch (Exception e1) {
					e1.printStackTrace();
				}

				Global.currentMds3FormType = cmbFormType.getSelectedItem()
						.toString();
				frameMds3RecordAdd = new FrameMds3RecordAdd();
				SwingUtils.center(frameMds3RecordAdd);
				frameMds3RecordAdd.setTitle("Add New MDS3 Reports");
				frameMds3RecordAdd.setModal(true);
				frameMds3RecordAdd.setVisible(true);
				updateMDSFormJTable();
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
			private Window frameMDSFormAdd;

			public void actionPerformed(final ActionEvent e) {
				try {
					int id = new Integer((String) mDSFormTable.getValueAt(table
							.getSelectedRow(), 5)).intValue();
					if (id != -1) {
						Global.currentMDS3FormKey = id;
						Global.currentMds3FormType = (String) cmbFormType
								.getSelectedItem();
						Mds3Controller.getInstance().getMDS3(id);
						if (Global.currentMds3FormType.equalsIgnoreCase("NC")) {
							Mds3ItemSet itemSet = Mds3ItemSetNC.getNCItemSet();
							itemSet.getPages().size();
							List list = new ArrayList<Mds3ItemSet>();
							if (Global.currentMds3Page == null) {
								Global.currentMds3Page = 1;
							}
							list = itemSet.getPages().get(
									Global.currentMds3Page + "")
									.getSubSections();
							for (int i = 0; i < list.size(); i++) {
								// Mds3SubSection sec = (Mds3SubSection)
								// list.get(Global.currentMds3Page);
								Mds3SubSection sec = (Mds3SubSection) list
										.get(i);
								sec.doUpdate();

							}
						}

						frameMds3RecordAdd = new FrameMds3RecordAdd();
						SwingUtils.center(frameMds3RecordAdd);
						frameMds3RecordAdd.setTitle("View/Update MDS Reports");
						frameMds3RecordAdd.setModal(true);
						frameMds3RecordAdd.setVisible(true);
					}
					updateMDSFormJTable();
				} catch (Exception ve) {
					ve.printStackTrace();
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
					int id = new Integer((String) mDSFormTable.getValueAt(table
							.getSelectedRow(), 5)).intValue();
					if (id != -1) {
						Global.currentMDS3FormKey = id;
						Global.currentMds3FormType = (String) cmbFormType
								.getSelectedItem();
						// suresh I have to go through every layer
						MedrexClientManager.getInstance().deleteMDS3(id);

						// Mds3DAO.getInstance().deleteMDS3(id);
						Global.currentMDS3FormKey = 0;
					}
					updateMDSFormJTable();
				} catch (Exception ve) {
					ve.printStackTrace();
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
		residentInformationLabel.setText("MDS REPORTS");
		panel.add(residentInformationLabel);

		cmbFormType = new JxComboBox();
		cmbFormType.setBackground(Color.WHITE);
		cmbFormType.setArc(0.4f);
		cmbFormType.setForeground(DEF_COL);
		cmbFormType.setBorder(new LineBorder(BORDER_COL, 1, false));
		cmbFormType.setBounds(142, 383, 447, 25);
		cmbFormType.setFont(new Font("Dialog", Font.BOLD, 12));
		panel.add(cmbFormType);

		final JxButton scanNewButton = new JxButton(0.4f);
		scanNewButton.setBackground(Color.WHITE);
		scanNewButton.setForeground(DEF_COL);
		scanNewButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		scanNewButton.setBounds(52, 397, 84, 26);
		scanNewButton.setFont(new Font("", Font.BOLD, 12));
		scanNewButton.setText("Scan New");
		panel.add(scanNewButton);
		fillCombos();
	}

	public void doUpdate() {
		updateMDSFormJTable();
	}

	public void fillCombos() {
		cmbFormType
				.setModel(new DefaultComboBoxModel(
						new String[] {
								"Nursing Home Comprehensive (NC) Item Set",
								"Nursing Home Discharge (ND) Item Set",
								"Nursing Home and Swing Bed OMRA(NO/SO) Item Set",
								"Swing Bed PPS(SP) Item Set",
								"Swing Bed Discharge (SD) Item Set",
								"Nursing Home PPS(NP) Item Set",
								"Swing Bed OMRA-Discharge (SOD) Item Set",
								"Nursing Home OMRA-Discharge(NOD) Item Set",
								"Nursing Home Quarterly (NQ) Item Set",
								"Nursing Home OMRA-Start of Therapy and Discharge(NSD) Item Set",
								"Nursing Home and Swing Bed Tracking (NT/ST) Item Set",
								"Nursing Home and Swing Bed OMRA-Start of Therapy(NS/SS) Item Set",
								"Swing Bed OMRA-Start of Therapy and Discharge (SSD) Item Set" }));
	}

	public void updateMDSFormJTable() {
		List mDSFormRecords = new ArrayList();
		if (Global.currentResidenceKey != 0) {
			try {
				// mDSFormRecords =
				// Mds3DAO.getInstance().getMDS3Sections(Global.currentResidenceKey);
				mDSFormRecords = MedrexClientManager.getInstance()
						.getMDS3Sections(Global.currentResidenceKey);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		mDSFormTable.setNewList(mDSFormRecords);
		mDSFormTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}

	public void openNewForm(String formName) {
		// Global.currentMDSFormKey = 0;
		// Global.currentMDSAssessmentType =
		// MDSAssessmentTypes.getTypeOf(formName);
		//		
		// frameMDSFormAdd = new FrameMDSRecordAdd();
		// SwingUtils.center(frameMDSFormAdd);
		// frameMDSFormAdd.setTitle("Add New MDS Reports");
		// frameMDSFormAdd.setModal(true);
		// frameMDSFormAdd.setVisible(true);
		//		
		// updateMDSFormJTable();
	}

}

class MDSFormJTable extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "Date Created", "Form Type",
			"Last Modified", "Status", "User" };

	public List mDSFormsRecords;

	int n = 0;

	MDSFormJTable(List mDSFormRecords) {
		mDSFormsRecords = mDSFormRecords;
	}

	MDSFormJTable() {
		mDSFormsRecords = new ArrayList();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (mDSFormsRecords.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List mDSFormRecords) {
		mDSFormsRecords = mDSFormRecords;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {

			Object o = mDSFormsRecords.get(row);
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MM / dd / yyyy");
			if (o instanceof Mds3) {
				Mds3 rc = (Mds3) o;

				if (col == 0) {
					return (df.format(rc.getDateCreated()));
				}
				if (col == 1) {
					return (rc.getFormType() + "");
				}
				if (col == 2) {
					return (df.format(rc.getLastModified()));
				}
				if (col == 3) {
					return (rc.getStatus() + "");
				}
				if (col == 4) {
					return (rc.getUser() + "");
				}
				if (col == 5) {
					return (rc.getSerial() + "");
				}
				return ("");
			}

			return ("");

		} catch (Exception e) {
			return ("");
		}

	}
}
