package medrex.client.main.resident.allergies;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldValidation;
import medrex.client.utils.SwingUtils;
import medrex.client.utils.Utils;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.masterList.Allergies;
import medrex.commons.vo.masterList.MasterList;
import medrex.commons.vo.resident.ResidentAllergies;
import medrex.commons.vo.resident.ResidentMain;

import com.jgoodies.validation.ValidationResult;
import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxTable;

public class PanelResidentAllergies extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1064498752721026036L;
	private JxButton btnDown;
	private JxButton btnUp;
	private JLabel descriptionLabel;
	private JRadioButton codeRadioButton;
	private ButtonGroup buttonGroup;
	private JTextField txtFilter;
	private JxComboBox cmbAllergies;
	private JxTable table;
	private ResidentAllergiesJTable residentAllergiesJTable;
	private int selectedrow = 0;
	private ResidentMain resident;
	private static final Color DEF_COLOR = new Color(49, 107, 127);

	public PanelResidentAllergies() {
		super();
		setForeground(SystemColor.desktop);
		setLayout(null);
		setPreferredSize(new Dimension(698, 396));
		setSize(new Dimension(550, 550));
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBounds(10, 10, 678, 313);
		add(scrollPane);

		table = new JxTable();
		scrollPane.setViewportView(table);

		cmbAllergies = new JxComboBox();
		cmbAllergies.setArc(0.4f);

		cmbAllergies.setBorder(new CompoundBorder(new LineBorder(new Color(180,
				188, 193), 1, false), new EmptyBorder(3, 3, 3, 3)));
		cmbAllergies.setForeground(DEF_COLOR);
		cmbAllergies.setBackground(Color.WHITE);
		cmbAllergies.setBounds(121, 361, 482, 24);
		add(cmbAllergies);

		final JLabel filterByLabel = new JLabel();
		filterByLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		filterByLabel.setForeground(DEF_COLOR);
		filterByLabel.setText("Filter by");
		filterByLabel.setBounds(10, 329, 57, 25);
		add(filterByLabel);

		// buttonGroup = new ButtonGroup();

		// codeRadioButton = new JRadioButton();
		// codeRadioButton.setSelected(true);
		// buttonGroup.add(codeRadioButton);
		// codeRadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		// codeRadioButton.setForeground(DEF_COLOR);
		// codeRadioButton.setBackground(Color.WHITE);
		// codeRadioButton.setText("Code");
		// codeRadioButton.setActionCommand("0");
		// codeRadioButton.setBounds(73, 337, 46, 18);
		// codeRadioButton.setEnabled(false);
		// add(codeRadioButton);

		// descriptionRadioButton = new JRadioButton();
		// buttonGroup.add(descriptionRadioButton);
		// descriptionRadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		// descriptionRadioButton.setForeground(DEF_COLOR);
		// descriptionRadioButton.setBackground(Color.WHITE);
		// descriptionRadioButton.setText("Description");
		// descriptionRadioButton.setActionCommand("1");
		// descriptionRadioButton.setBounds(125, 337, 89, 18);
		// add(descriptionRadioButton);

		descriptionLabel = new JLabel();
		// buttonGroup.add(descriptionLabel);
		descriptionLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		descriptionLabel.setForeground(DEF_COLOR);
		descriptionLabel.setBackground(Color.WHITE);
		descriptionLabel.setText("Description");
		// descriptionLabel.setActionCommand("1");
		descriptionLabel.setBounds(125, 337, 89, 18);
		add(descriptionLabel);

		txtFilter = new JTextField();
		txtFilter.setBounds(219, 334, 193, 21);
		txtFilter.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(final KeyEvent e) {
				doSearch();
			}
		});
		add(txtFilter);

		final JxButton addAllergiesButton = new JxButton(0.4f);
		addAllergiesButton.setArc(0.4f);
		addAllergiesButton.setForeground(DEF_COLOR);
		addAllergiesButton.setBackground(Color.WHITE);
		addAllergiesButton.setBorder(new LineBorder(new Color(180, 188, 193),
				1, false));
		addAllergiesButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (doValidate()) {
					doSave();
					txtFilter.setText("");
					cmbAllergies.setSelectedItem("");
					updateAllergiesJTable();
				}
			}
		});
		addAllergiesButton.setFont(new Font("Dialog", Font.BOLD, 11));
		addAllergiesButton.setText("Add New");
		addAllergiesButton.setBounds(10, 361, 105, 25);
		add(addAllergiesButton);

		final JxButton deleteAllergiesButton = new JxButton(0.4f);
		deleteAllergiesButton.setArc(0.4f);
		deleteAllergiesButton.setForeground(DEF_COLOR);
		deleteAllergiesButton.setBackground(Color.WHITE);
		deleteAllergiesButton.setBorder(new LineBorder(
				new Color(180, 188, 193), 1, false));
		deleteAllergiesButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					int id = new Integer((String) residentAllergiesJTable
							.getValueAt(table.getSelectedRow(), 6)).intValue();
					MedrexClientManager.getInstance().deleteResidentAllergies(
							id);
					updateAllergiesJTable();
				} catch (Exception xe) {
				}
			}
		});
		deleteAllergiesButton.setFont(new Font("Dialog", Font.BOLD, 11));
		deleteAllergiesButton.setText("Delete");
		deleteAllergiesButton.setBounds(609, 361, 79, 25);
		add(deleteAllergiesButton);

		residentAllergiesJTable = new ResidentAllergiesJTable();
		table.setModel(residentAllergiesJTable);

		btnUp = new JxButton(0.4f);
		btnUp.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (table.getSelectedRow() != -1) {
					doUpOrder();
					updateAllergiesJTable();
					if (selectedrow >= 0) {
						table.changeSelection(selectedrow, 0, false, false);
					}
				}
			}
		});
		btnUp.setArc(0.4f);
		btnUp.setForeground(DEF_COLOR);
		btnUp.setBackground(Color.WHITE);
		btnUp.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnUp.setFont(new Font("Dialog", Font.BOLD, 11));
		btnUp.setText("Up");
		btnUp.setBounds(423, 334, 75, 21);
		add(btnUp);

		btnDown = new JxButton(0.4f);
		btnDown.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (table.getSelectedRow() != -1) {
					doDownOrder();
					updateAllergiesJTable();
					if (selectedrow >= 0) {
						table.changeSelection(selectedrow, 0, false, false);
					}
				}
			}
		});
		btnDown.setArc(0.4f);
		btnDown.setForeground(DEF_COLOR);
		btnDown.setBackground(Color.WHITE);
		btnDown.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnDown.setFont(new Font("Dialog", Font.BOLD, 11));
		btnDown.setText("Down");
		btnDown.setBounds(508, 334, 75, 21);
		add(btnDown);
		fillCombos();
		updateAllergiesJTable();
	}

	// for specify up order to Allergy
	private void doUpOrder() {
		int topSerial = 0;
		int toporder = 0;
		int currSerial = 0;
		int currorder = 0;
		ResidentAllergies topref = null;
		ResidentAllergies currref = null;
		if (table.getSelectedRow() == 0) {
			JOptionPane.showMessageDialog(this,
					"Allergy is Already First Order", "Allergies Order",
					JOptionPane.ERROR_MESSAGE);
		} else {
			topSerial = new Integer((String) residentAllergiesJTable
					.getValueAt(table.getSelectedRow() - 1, 6)).intValue();
			toporder = (Integer) residentAllergiesJTable.getValueAt(table
					.getSelectedRow() - 1, 7);
			selectedrow = table.getSelectedRow() - 1;
			currSerial = new Integer((String) residentAllergiesJTable
					.getValueAt(table.getSelectedRow(), 6)).intValue();
			currorder = (Integer) residentAllergiesJTable.getValueAt(table
					.getSelectedRow(), 7);
			if (currSerial != 0) {
				try {
					currref = MedrexClientManager.getInstance()
							.getResidentAllergy(currSerial);
					currref.setOrder(toporder);
					MedrexClientManager.getInstance()
							.insertOrUpdateResidentAllergies(currref);

					topref = MedrexClientManager.getInstance()
							.getResidentAllergy(topSerial);
					topref.setOrder(currorder);
					MedrexClientManager.getInstance()
							.insertOrUpdateResidentAllergies(topref);

				} catch (RemoteException e) {

					e.printStackTrace();
				} catch (MedrexException e) {

					e.printStackTrace();
				}
			}
		}
	}

	// for specify down order to Allergy
	private void doDownOrder() {
		int bottomSerial = 0;
		int bottomorder = 0;
		int currSerial = 0;
		int currorder = 0;
		ResidentAllergies bottomref = null;
		ResidentAllergies currref = null;

		if (table.getRowCount() == table.getSelectedRow() + 1) {
			JOptionPane.showMessageDialog(this,
					"Allergy is Already Last Order", "Allergies Order",
					JOptionPane.ERROR_MESSAGE);
		} else {

			bottomSerial = new Integer((String) residentAllergiesJTable
					.getValueAt(table.getSelectedRow() + 1, 6)).intValue();
			bottomorder = (Integer) residentAllergiesJTable.getValueAt(table
					.getSelectedRow() + 1, 7);
			selectedrow = table.getSelectedRow() + 1;
			currSerial = new Integer((String) residentAllergiesJTable
					.getValueAt(table.getSelectedRow(), 6)).intValue();

			currorder = (Integer) residentAllergiesJTable.getValueAt(table
					.getSelectedRow(), 7);
			if (currSerial != 0) {
				try {
					currref = MedrexClientManager.getInstance()
							.getResidentAllergy(currSerial);
					currref.setOrder(bottomorder);
					MedrexClientManager.getInstance()
							.insertOrUpdateResidentAllergies(currref);

					bottomref = MedrexClientManager.getInstance()
							.getResidentAllergy(bottomSerial);
					bottomref.setOrder(currorder);
					MedrexClientManager.getInstance()
							.insertOrUpdateResidentAllergies(bottomref);

				} catch (RemoteException e) {

					e.printStackTrace();
				} catch (MedrexException e) {

					e.printStackTrace();
				}
			}
		}
	}

	private void fillCombos() {
		List<MasterList> allergyComboItems = new ArrayList<MasterList>();
		try {
			allergyComboItems = MedrexClientManager.getInstance()
					.getMasterListRecords(Allergies.class);
			resident = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
		} catch (Exception e) {
		}
		cmbAllergies.removeAllItems();
		for (int i = 0; i < allergyComboItems.size(); i++) {
			MasterList m = allergyComboItems.get(i);
			cmbAllergies.addItem(m);
		}

	}

	protected void doSearch() {
		List<String> strList = new ArrayList<String>();
		List<ResidentAllergies> allergyList = new ArrayList<ResidentAllergies>();
		String selectedValue = descriptionLabel.getText();

		try {
			if (txtFilter != null) {
				allergyList = MedrexClientManager.getInstance()
						.getResidentAllergiesForString(txtFilter.getText(),
								selectedValue);
			} else {
				allergyList = MedrexClientManager.getInstance()
						.getResidentAllergiesForString(txtFilter.getText());
			}

		} catch (Exception e) {
		}
		Iterator<ResidentAllergies> itr = allergyList.iterator();
		while (itr.hasNext()) {
			ResidentAllergies allergy = itr.next();
			strList.add("  " + allergy.getName());
		}
		cmbAllergies.setModel(new DefaultComboBoxModel(strList.toArray()));
	}

	protected void doUpdate() {
		// fillCombos();
		// updateData();
	}

	public void doSave() {
		ResidentAllergies ref = new ResidentAllergies();
		ref.setSerial(0);
		ref.setResident(resident);
		ref.setName(cmbAllergies.getSelectedItem().toString());
		ref.setConfirmed(false);
		ref.setDateCreated(MedrexClientManager.getServerTime());
		Integer order = (Integer) residentAllergiesJTable.getMaxValueOf(7);
		if (order != null) {
			ref.setOrder(order + 1);
		}
		try {
			Global.currentResidentAllergiesKey = MedrexClientManager
					.getInstance().insertOrUpdateResidentAllergies(ref);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateAllergiesJTable() {
		List<ResidentAllergies> listAllergies = new ArrayList<ResidentAllergies>();
		try {
			listAllergies = MedrexClientManager
					.getInstance()
					.getResidentAllergiesforResident(Global.currentResidenceKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
		residentAllergiesJTable.setNewList(listAllergies);
		table.getColumnModel().getColumn(2).setMinWidth(300);
		residentAllergiesJTable.fireTableStructureChanged();
	}

	public void updateData() {
		SwingUtils.setSelectedButton(buttonGroup, 1);
		updateAllergiesJTable();
	}

	public boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		System.out.println("cmbAllergies Item="
				+ cmbAllergies.getSelectedItem().toString());
		if (("").equals(cmbAllergies.getSelectedItem().toString())) {
			vRes.addError("Allergies field is mandatory.");
		}
		if (!FieldValidation.isEmpty(vRes)) {
			FieldValidation.Msgbox(vRes, "Resident Info Allergies");
			return false;
		} else {
			// JOptionPane.showMessageDialog(this, "Saved successfully");
			return true;
		}
	}
}

class ResidentAllergiesJTable extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2999215795781912381L;

	private String[] columnNames = { "Allergies", "Status", "Remarks", "Date",
			"Order" };

	public List<ResidentAllergies> residentAllergies;

	int n = 0;

	ResidentAllergiesJTable(List<ResidentAllergies> allergies) {
		residentAllergies = allergies;
	}

	ResidentAllergiesJTable() {
		residentAllergies = new ArrayList<ResidentAllergies>();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (residentAllergies.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List<ResidentAllergies> allergies) {
		residentAllergies = allergies;
		Collections.sort(residentAllergies,
				new Comparator<ResidentAllergies>() {
					public int compare(ResidentAllergies o1,
							ResidentAllergies o2) {
						if (o1 != null && o2 != null) {
							return o1.getOrder() - o2.getOrder();
						}
						return 0;
					}
				});
	}

	public Object getMaxValueOf(int col) {
		List<Comparable> colValues = new ArrayList<Comparable>();
		for (int i = 0; i < getRowCount(); i++) {
			Comparable value = (Comparable) getValueAt(i, col);
			colValues.add(value);
		}
		Collections.sort(colValues, new Comparator<Comparable>() {
			public int compare(Comparable o1, Comparable o2) {
				if (o1 != null && o2 != null) {
					return -1 * o1.compareTo(o2);
				}
				return 0;
			}
		});
		if (colValues.size() > 0) {
			return colValues.get(0);
		}
		return null;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			new SimpleDateFormat("MM/dd/yyyy");
			ResidentAllergies ref = residentAllergies.get(row);
			switch (col) {
			case 0:
				return ref.getName();
			case 1:
				return ref.isConfirmed() ? "Confirmed" : "Not Confirmed";
			case 2:
				return ref.getRemarks();
			case 3:
				return (Utils.medrexDateFormat(ref.getDateCreated()));
			case 4:
				return (row + 1);
			case 5:
				return ref;
			case 6:
				return ref.getSerial() + "";
			case 7:
				return ref.getOrder();
			default:
				return "";
			}
		} catch (Exception e) {
			return ("");
		}

	}
}
