/**
 * 
 */
package medrex.client.census.ui.dashboard;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
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
import medrex.commons.enums.GuiModes;
import medrex.commons.enums.ResidentTabs;
import medrex.commons.vo.census.counts.SignOut;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxTable;

/**
 * @author Dev
 * 
 */
public class FrameERInfo extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3052619804568475003L;
	private JxButton btnPrint;
	private JxTable table;
	private ERTableModal refJTableModal;

	public FrameERInfo() {
		super();
		Global.currentResidenceArgument = 0;
		setSize(600, 400);
		setTitle("ER Information");
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
				FrameERInfo.this.dispose();
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
		lblTitle.setText("ER Information:");
		lblTitle.setBounds(10, 10, 574, 37);
		panelMain.add(lblTitle);

		table = new JxTable();
		table.setRowHeight(21);
		table.setRowMargin(2);
		table.setFont(GuiModes.DESIGNER_FORMS.getDefaultFont().deriveFont(12f)
				.deriveFont(Font.PLAIN));
		refJTableModal = new ERTableModal();
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
				MessageFormat header = new MessageFormat("Hospital");
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
		List records = new ArrayList();
		try {
			records = MedrexClientManager.getInstance().getSignOutsER();
		} catch (Exception e) {
			e.printStackTrace();
		}
		refJTableModal.setNewList(records);
		refJTableModal.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}
}

class ERTableModal extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4354630582483300213L;

	private String[] columnNames = { "Resident", "Date And Time" };

	private List records;
	private HashMap<SignOut, ResidentMain> residentMap;
	int n = 0;

	private Comparator<SignOut> comparator;

	public ERTableModal(List<SignOut> recordsList) {
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

	public ERTableModal() {
		this(new ArrayList());
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

		Iterator<SignOut> itr = recordsList.iterator();
		while (itr.hasNext()) {
			SignOut ref = itr.next();
			// System.out.println("Sign Out Res Id:"+ref.getResidentId());
			ResidentMain resi = null;
			try {
				resi = MedrexClientManager.getInstance().getResident(
						ref.getResidentId());
				// System.out.println("Res Name:"+resi.getUserName());
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (resi != null) {
				residentMap.put(ref, resi);
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
			SignOut rec = (SignOut) records.get(row);
			ResidentMain resi = residentMap.get(rec);

			switch (col) {
			case 0:
				if (resi != null) {
					return resi.getUserPass() + ", " + resi.getUserName();
				} else {
					return "";
				}
			case 1:
				return rec.getSignOutDate();
				// case 2 :
				// switch(rec.getToId()) {
				// case CensusConstants.HOSPITAL:
				// return "Hospital";
				// case CensusConstants.HOME:
				// return "Home";
				// case CensusConstants.OTHER_FACILITY:
				// return "Other Facility";
				// case CensusConstants.OTHER:
				// return "Other";
				// default:
				// return "";
				// }
			default:
				return "";

				/* / --- returning keys --- / */
			case 3:
				return rec.getResidentId();
			case 4:
				return rec.getSerial();
			}
		} catch (Exception e) {
			// e.printStackTrace();
			return ("");
		}
	}
}