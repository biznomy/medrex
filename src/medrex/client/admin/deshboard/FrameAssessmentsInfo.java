package medrex.client.admin.deshboard;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.table.AbstractTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.enums.ResidentTabs;
import medrex.commons.vo.admin.PendingCountBean;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxTable;

/**
 * @author Dev
 * 
 */
public class FrameAssessmentsInfo extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1557528133762133037L;
	private JxTable table;
	private AssessmentsTableModal refJTableModal;

	public FrameAssessmentsInfo() {
		super();
		Global.currentResidenceArgument = 0;
		setSize(600, 400);
		setTitle("Assessments Information");
		setResizable(false);
		setModal(true);
		setAlwaysOnTop(true);
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
				Global.currentResidenceArgument = 0;
				FrameAssessmentsInfo.this.dispose();
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
		lblTitle.setText("Assessments Information:");
		lblTitle.setBounds(10, 10, 574, 37);
		panelMain.add(lblTitle);

		table = new JxTable();
		table.setRowHeight(21);
		table.setRowMargin(2);
		table.setFont(GuiModes.DESIGNER_FORMS.getDefaultFont().deriveFont(12f)
				.deriveFont(Font.PLAIN));
		refJTableModal = new AssessmentsTableModal();
		table.setModel(refJTableModal);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					int id = (Integer) refJTableModal.getValueAt(table
							.getSelectedRow(), 3);
					System.out.println("id: " + id);
					if (id != 0) {
						Global.currentMainTab = 0;
						Global.currentResidenceArgument = id;
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.ADMISSION_RECORDS, null);
						FrameAssessmentsInfo.this.dispose();
					}
				}
			}
		});

		scrollPane.setViewportView(table);
		updateJTable(0);
	}

	public void updateJTable(int type) {
		List records = new ArrayList();
		try {
			switch (type) {
			case 0:
				records = MedrexClientManager.getInstance()
						.getPendingFormsAccordingResident();
				break;
			case 1:
				records = MedrexClientManager.getInstance().getPendingAlert();
				break;
			default:
				records = MedrexClientManager.getInstance()
						.getPendingFormsAccordingResident();
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		List<PendingCountBean> tempPendingRecords = new ArrayList();

		Iterator it = records.iterator();
		while (it.hasNext()) {
			PendingCountBean bean = new PendingCountBean();
			Object[] pendingRecord = (Object[]) it.next();
			int residentId = new Integer(pendingRecord[0].toString())
					.intValue();
			int pendingCount = new Integer(pendingRecord[1].toString())
					.intValue();
			bean.setResidentId(residentId);
			bean.setPendingCount(pendingCount);
			tempPendingRecords.add(bean);
		}

		refJTableModal.setNewList(tempPendingRecords);
		refJTableModal.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}
}

class AssessmentsTableModal extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9151203741836215271L;

	private String[] columnNames = { "Resident", "Total Pending From" };

	private List<PendingCountBean> records;
	private Map<PendingCountBean, ResidentMain> residentMap;

	int n = 0;

	private Comparator<PendingCountBean> comparator;

	public AssessmentsTableModal(List<PendingCountBean> recordsList) {
		comparator = new Comparator<PendingCountBean>() {
			// -ve o1 < o2
			// 0 o1 = o2
			// +ve o1 > o2
			public int compare(PendingCountBean o1, PendingCountBean o2) {
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

	public AssessmentsTableModal() {
		this(new ArrayList<PendingCountBean>());
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

	public void setNewList(List<PendingCountBean> recordsList) {
		records = recordsList;
		residentMap = new HashMap<PendingCountBean, ResidentMain>();

		Iterator<PendingCountBean> itr = recordsList.iterator();
		while (itr.hasNext()) {
			PendingCountBean ref = itr.next();
			ResidentMain resi = null;
			try {
				resi = MedrexClientManager.getInstance().getResident(
						ref.getResidentId());
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
			PendingCountBean rec = records.get(row);
			ResidentMain resi = residentMap.get(rec);

			switch (col) {
			case 0:
				if (resi != null) {
					return resi.getUserPass() + ", " + resi.getUserName();
				} else {
					return "";
				}
			case 1:
				return rec.getPendingCount();

			default:
				return "";

				/* / --- returning keys --- / */
			case 3:
				return rec.getResidentId();
			}
		} catch (Exception e) {
			// e.printStackTrace();
			return ("");
		}
	}
}
