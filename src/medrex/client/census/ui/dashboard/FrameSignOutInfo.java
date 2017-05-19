/**
 * 
 */
package medrex.client.census.ui.dashboard;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.DefaultComboBoxModel;
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
import medrex.commons.enums.GuiModes;
import medrex.commons.enums.ResidentTabs;
import medrex.commons.vo.census.SignOutTo;
import medrex.commons.vo.census.counts.SignOut;
import medrex.commons.vo.resident.ResidentContact;
import medrex.commons.vo.resident.ResidentContactPhone;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxTable;

/**
 * @author Dev
 * 
 */
public class FrameSignOutInfo extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2644849069838618609L;
	private JxButton btnPrint;
	private JxTable table;
	private SignOutToTableModal refJTableModal;
	private JxComboBox comboBox;

	public FrameSignOutInfo() {
		super();
		Global.currentResidenceArgument = 0;
		setSize(600, 400);
		setTitle("Sign Out Information");
		setResizable(false);
		// setModal(true);
		// setAlwaysOnTop(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		SwingUtils.center(this);

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
				FrameSignOutInfo.this.dispose();
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
		lblTitle.setText("Sign Out Information:");
		lblTitle.setBounds(10, 10, 418, 37);
		panelMain.add(lblTitle);

		table = new JxTable();
		table.setRowHeight(21);
		table.setRowMargin(2);
		table.setFont(GuiModes.DESIGNER_FORMS.getDefaultFont().deriveFont(12f)
				.deriveFont(Font.PLAIN));
		refJTableModal = new SignOutToTableModal();
		table.setModel(refJTableModal);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					int id = (Integer) refJTableModal.getValueAt(table
							.getSelectedRow(), 4);

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

		comboBox = new JxComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				updateJTable(comboBox.getSelectedIndex());
			}
		});
		comboBox.setArc(0.4f);
		comboBox.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		comboBox.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		comboBox.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		comboBox.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "All",
				"Late", "Late More Than Hour" }));
		comboBox.setBounds(434, 15, 150, 28);
		panelMain.add(comboBox);

		btnPrint = new JxButton();
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				MessageFormat header = new MessageFormat("Sign Out");
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

	public void updateJTable() {
		updateJTable(0);
	}

	public void doClose() {
		this.dispose();
	}

	public void updateJTable(int type) {

		switch (type) {
		case 1:
			if (comboBox.getSelectedIndex() != 1) {
				comboBox.setSelectedIndex(1);
			}
			break;
		case 2:
			if (comboBox.getSelectedIndex() != 2) {
				comboBox.setSelectedIndex(2);
			}
			break;
		default:
			if (comboBox.getSelectedIndex() != 0) {
				comboBox.setSelectedIndex(0);
			}
			break;
		}

		List records = new ArrayList();
		List recordsWithoutEr = new ArrayList();
		try {
			switch (type) {
			case 1:
				records = MedrexClientManager.getInstance().getSignOutsLate();
				break;
			case 2:
				records = MedrexClientManager.getInstance()
						.getSignOutsLateMoreThanHour();
				break;
			default:
				records = MedrexClientManager.getInstance().getSignOuts();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Iterator it = records.iterator();
		while (it.hasNext()) {
			SignOut so = (SignOut) it.next();
			if (!so.isEr()) {
				recordsWithoutEr.add(so);
			}
		}
		refJTableModal.setNewList(recordsWithoutEr);
		// refJTableModal.setNewList(records);
		refJTableModal.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}
}

class SignOutToTableModal extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2239758620843296587L;

	private String[] columnNames = { "Resident", "To", "Responsible Party",
			"Contact #" };

	private List<SignOut> records;
	private Map<SignOut, ResidentMain> residentMap;
	private Map<SignOut, SignOutTo> signOutToMap;
	private Map<SignOut, ResidentContact> resposiblePartyMap;
	private Map<SignOut, ResidentContactPhone> contactMap;

	int n = 0;

	private Comparator<SignOut> comparator;

	public SignOutToTableModal(List<SignOut> recordsList) {
		comparator = new Comparator<SignOut>() {
			// -ve o1 < o2
			// 0 o1 = o2
			// +ve o1 > o2
			public int compare(SignOut o1, SignOut o2) {
				int obj = 0;
				if (o1 != null && o2 != null) {
					ResidentMain resi1 = residentMap.get(o1);
					ResidentMain resi2 = residentMap.get(o2);
					String str1 = resi1.getUserPass();
					String str2 = resi2.getUserPass();
					return str1.compareToIgnoreCase(str2);
				}
				return obj;
			}
		};
		setNewList(recordsList);
	}

	public SignOutToTableModal() {
		this(new ArrayList<SignOut>());
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (records.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List<SignOut> recordsList) {
		records = recordsList;
		residentMap = new HashMap<SignOut, ResidentMain>();
		signOutToMap = new HashMap<SignOut, SignOutTo>();
		resposiblePartyMap = new HashMap<SignOut, ResidentContact>();
		contactMap = new HashMap<SignOut, ResidentContactPhone>();

		Iterator<SignOut> itr = recordsList.iterator();
		while (itr.hasNext()) {
			SignOut ref = itr.next();
			ResidentMain resi = null;
			SignOutTo to = null;
			ResidentContact ctc = null;
			ResidentContactPhone ctcPhone = null;

			try {
				resi = MedrexClientManager.getInstance().getResident(
						ref.getResidentId());
				to = MedrexClientManager.getInstance().getSignOutTo(
						ref.getToId());
				ctc = MedrexClientManager.getInstance().getResidentContact(
						ref.getResponsibleContactId());
				ctcPhone = MedrexClientManager.getInstance()
						.getResidentContactPhonePrimary(
								ref.getResponsibleContactId());
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (resi != null) {
				residentMap.put(ref, resi);
			}
			if (to != null) {
				signOutToMap.put(ref, to);
			}
			if (ctc != null) {
				resposiblePartyMap.put(ref, ctc);
			}
			if (ctcPhone != null) {
				contactMap.put(ref, ctcPhone);
			}
		}
		Collections.sort(records, comparator);
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			SignOut rec = records.get(row);
			ResidentMain resi = residentMap.get(rec);
			SignOutTo to = signOutToMap.get(rec);
			ResidentContact ctc = resposiblePartyMap.get(rec);
			ResidentContactPhone ctcPhone = contactMap.get(rec);

			switch (col) {
			case 0:
				if (resi != null) {
					return resi.getUserPass() + ", " + resi.getUserName();
				} else {
					return "";
				}
			case 1:
				if (to != null) {
					return to.getName();
				} else {
					return "";
				}
			case 2:
				if (ctc != null) {
					return ctc.getLastName() + ", " + ctc.getFirstName();
				}
			case 3:
				if (ctcPhone != null) {
					return ctcPhone.getNumber();
				} else {
					return "";
				}
			default:
				return "";

				/* / --- returning keys --- / */
			case 4:
				return rec.getResidentId();
			case 5:
				return rec.getSerial();
			}
		} catch (Exception e) {
			// e.printStackTrace();
			return ("");
		}
	}
}