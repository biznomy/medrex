package medrex.client.main.physicanOrders;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.AbstractTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.loading.FrameLoading;
import medrex.client.main.scan.FrameScanFormAdd;
import medrex.client.utils.SwingUtils;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.physicianOrders.PhysicanOrderFax;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderRecord;
import medrex.commons.vo.resident.ResidentDiagnosis;
import medrex.commons.vo.scan.ScanForm;
import medrex.server.dao.physicianOrders.physicianOrderNewScreen.*;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxScrollBar;
import com.sX.swing.JxScrollPane;
import com.sX.swing.JxTable;

public class PanelPhysicianOrderNewFax extends PopUpView {
	private JxTable tabelFTPTechnolist;
	private JxTable tabelFTPPending;
	private JxTable tabelFTPSent;
	private PhysicianOrdersNewFaxTechnolistJTable physicianOrdersNewFaxtechJTabel;
	private PhysicianOrdersNewFaxPendingJTable physicianOrdersNewFaxPendJTabel;
	private PhysicianOrdersNewFaxSentJTable physicianOrdersNewFaxSentJTabel;

	public PanelPhysicianOrderNewFax() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setSize(800, 600);

		// doRender();
		physicianOrdersNewFaxPendJTabel = new PhysicianOrdersNewFaxPendingJTable();
		physicianOrdersNewFaxSentJTabel = new PhysicianOrdersNewFaxSentJTable();
		physicianOrdersNewFaxtechJTabel = new PhysicianOrdersNewFaxTechnolistJTable();

		final JxPanel jxPanel = new JxPanel();
		jxPanel.setBackground(Color.WHITE);
		jxPanel.setLayout(null);
		jxPanel.setBounds(10, 10, 713, 472);
		add(jxPanel);

		final JxPanel jxPanel_1 = new JxPanel();
		jxPanel_1.setBackground(Color.WHITE);
		jxPanel_1.setLayout(null);
		jxPanel_1.setBounds(10, 10, 595, 138);
		jxPanel.add(jxPanel_1);

		final JxLabel faxToPharmacypendingJxLabel = new JxLabel();
		faxToPharmacypendingJxLabel.setBackground(Color.WHITE);
		faxToPharmacypendingJxLabel.setFont(new Font("Arial", Font.BOLD, 20));
		faxToPharmacypendingJxLabel.setText("Fax To Pharmacy(Pending)");
		faxToPharmacypendingJxLabel.setBounds(0, 0, 514, 24);

		jxPanel_1.add(faxToPharmacypendingJxLabel);

		final JxScrollPane jxScrollPane = new JxScrollPane();
		jxScrollPane.setBackground(Color.WHITE);
		jxScrollPane.setBounds(0, 30, 585, 100);
		jxPanel_1.add(jxScrollPane);

		tabelFTPPending = new JxTable();
		tabelFTPPending.setBackground(Color.WHITE);
		tabelFTPPending.setModel(physicianOrdersNewFaxPendJTabel);

		tabelFTPPending.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					String detail = (String) physicianOrdersNewFaxPendJTabel
							.getValueAt(tabelFTPPending.getSelectedRow(), 2);
					JOptionPane.showMessageDialog(null, detail);
					
				}
			}
		});

		jxScrollPane.setViewportView(tabelFTPPending);

		final JxPanel jxPanel_1_1 = new JxPanel();
		jxPanel_1_1.setBackground(Color.WHITE);
		jxPanel_1_1.setLayout(null);
		jxPanel_1_1.setBounds(10, 179, 595, 145);
		jxPanel.add(jxPanel_1_1);

		final JxLabel faxToPharmacypendingJxLabel_1 = new JxLabel();
		faxToPharmacypendingJxLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		faxToPharmacypendingJxLabel_1.setText("Fax To Pharmacy (Sent)");
		faxToPharmacypendingJxLabel_1.setBounds(0, 0, 514, 24);
		jxPanel_1_1.add(faxToPharmacypendingJxLabel_1);

		final JxScrollPane jxScrollPane_1 = new JxScrollPane();
		jxScrollPane_1.setBackground(Color.WHITE);
		jxScrollPane_1.setBounds(0, 30, 585, 100);
		jxPanel_1_1.add(jxScrollPane_1);

		tabelFTPSent = new JxTable();
		tabelFTPSent.setBackground(Color.WHITE);
		tabelFTPSent.setModel(physicianOrdersNewFaxSentJTabel);
		tabelFTPSent.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					String detail = (String) physicianOrdersNewFaxSentJTabel
							.getValueAt(tabelFTPSent.getSelectedRow(), 2);
					JOptionPane.showMessageDialog(null, detail);
					
				}
			}
		});


		jxScrollPane_1.setViewportView(tabelFTPSent);

		final JxPanel jxPanel_1_1_1 = new JxPanel();
		jxPanel_1_1_1.setBackground(Color.WHITE);
		jxPanel_1_1_1.setLayout(null);
		jxPanel_1_1_1.setBounds(10, 330, 595, 113);
		jxPanel.add(jxPanel_1_1_1);

		final JxLabel faxToPharmacypendingJxLabel_1_1 = new JxLabel();
		faxToPharmacypendingJxLabel_1_1
				.setFont(new Font("Arial", Font.BOLD, 20));
		faxToPharmacypendingJxLabel_1_1
				.setText("Fax To Pharmacy (Acknowledged)");
		faxToPharmacypendingJxLabel_1_1.setBounds(0, 0, 514, 24);
		jxPanel_1_1_1.add(faxToPharmacypendingJxLabel_1_1);

		final JxScrollPane jxScrollPane_2 = new JxScrollPane();
		jxScrollPane_2.setBackground(Color.WHITE);
		jxScrollPane_2.setBounds(0, 30, 585, 100);
		jxPanel_1_1_1.add(jxScrollPane_2);

		tabelFTPTechnolist = new JxTable();
		tabelFTPTechnolist.setBackground(Color.WHITE);
		tabelFTPTechnolist.setModel(physicianOrdersNewFaxtechJTabel);

		jxScrollPane_2.setViewportView(tabelFTPTechnolist);

		final JButton btnSendNow = new JButton();
		btnSendNow.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {	
			}
		});
		btnSendNow.setText("Send Now");
		btnSendNow.setBounds(611, 50, 92, 26);
		jxPanel.add(btnSendNow);

		doUpdate();

	}

	public void doRender() {

		JFrame frame = new JFrame();
		frame.setTitle("New Fax");
		frame.setBounds(0, 0, 800, 700);
		frame.setVisible(true);
		frame.add(this);

	}

	public void doUpdate() {
		updatePhysicianOrderpendFax();
		updatePhysicianOrderSentFax();
		updatePhysicianOrderTechFax();
	}

	private void updatePhysicianOrderSentFax() {
		List<PhysicanOrderFax> l = null;
		try {
			l = PhysicianOrderNewFaxDAO.getInstance()
					.getPhysicianOrderFaxDetailByStatus("1");
			// System.out.println("" + l.get(0));

		} catch (Exception e) {

		}

		physicianOrdersNewFaxSentJTabel.setNewList(l);
		physicianOrdersNewFaxSentJTabel.fireTableStructureChanged();
		tabelFTPSent.updateUI();
		tabelFTPSent.repaint();

	}

	private void updatePhysicianOrderTechFax() {
		List<PhysicanOrderFax> l = null;
		try {
			l = PhysicianOrderNewFaxDAO.getInstance()
					.getPhysicianOrderFaxDetailByStatus("2");
			// System.out.println("" + l.get(0));

		} catch (Exception e) {

		}

		physicianOrdersNewFaxtechJTabel.setNewList(l);
		physicianOrdersNewFaxtechJTabel.fireTableStructureChanged();
		tabelFTPTechnolist.updateUI();
		tabelFTPTechnolist.repaint();

	}

	private void updatePhysicianOrderpendFax() {

		List<PhysicanOrderFax> l = null;

		try {
			l = PhysicianOrderNewFaxDAO.getInstance()
					.getPhysicianOrderFaxDetailByStatus("0");
			// System.out.println("" + l.get(0));

		} catch (Exception e) {

		}

		physicianOrdersNewFaxPendJTabel.setNewList(l);
		physicianOrdersNewFaxPendJTabel.fireTableStructureChanged();
		tabelFTPPending.updateUI();
		tabelFTPPending.repaint();
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

}

class PhysicianOrdersNewFaxPendingJTable extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4018606847639461245L;

	private String[] columnNames = { "Serial", "Date" };

	public List<PhysicanOrderFax> physicianOrderFax;

	int n = 0;

	PhysicianOrdersNewFaxPendingJTable(List<PhysicanOrderFax> physRecords) {
		physicianOrderFax = physRecords;

	}

	PhysicianOrdersNewFaxPendingJTable() {
		// Global.physicianOrderDietJTable=this;
		physicianOrderFax = new ArrayList<PhysicanOrderFax>();

	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {

		return (physicianOrderFax.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List<PhysicanOrderFax> physRecords) {
		physicianOrderFax = physRecords;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			Object o = physicianOrderFax.get(row);
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MM / dd / yyyy  hh:mm a");
			if (o instanceof PhysicanOrderFax) {
				PhysicanOrderFax pof = (PhysicanOrderFax) o;
				switch (col) {
				case 0:
					return (pof.getSerial()) + "";

				case 2:
					return (pof.getDetail());

				case 1:

					return (df.format(pof.getDate()));

				default:
					return ("");
				}
			}
			return ("");

		} catch (Exception e) {
			return ("");
		}
	}

}

class PhysicianOrdersNewFaxSentJTable extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4018606847639461245L;

	private String[] columnNames = { "Serial", "Date" };

	public List<PhysicanOrderFax> physicianOrderFax;

	int n = 0;

	PhysicianOrdersNewFaxSentJTable(List<PhysicanOrderFax> physRecords) {
		physicianOrderFax = physRecords;

	}

	PhysicianOrdersNewFaxSentJTable() {
		// Global.physicianOrderDietJTable=this;
		physicianOrderFax = new ArrayList<PhysicanOrderFax>();

	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {

		return (physicianOrderFax.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List<PhysicanOrderFax> physRecords) {
		physicianOrderFax = physRecords;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			Object o = physicianOrderFax.get(row);
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MM / dd / yyyy  hh:mm a");
			if (o instanceof PhysicanOrderFax) {
				PhysicanOrderFax pof = (PhysicanOrderFax) o;
				switch (col) {
				case 0:
					return (pof.getSerial()+"");
				case 2:
					return (pof.getDetail());
				case 1:
					return (df.format(pof.getDate()));
				default:
					return ("");
				}
			}
			return ("");

		} catch (Exception e) {
			return ("");
		}
	}

}

class PhysicianOrdersNewFaxTechnolistJTable extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4018606847639461245L;

	private String[] columnNames = { "Serial", "Date" };

	public List<PhysicanOrderFax> physicianOrderFax;

	int n = 0;

	PhysicianOrdersNewFaxTechnolistJTable(List<PhysicanOrderFax> physRecords) {
		physicianOrderFax = physRecords;

	}

	PhysicianOrdersNewFaxTechnolistJTable() {
		// Global.physicianOrderDietJTable=this;
		physicianOrderFax = new ArrayList<PhysicanOrderFax>();

	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {

		return (physicianOrderFax.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List<PhysicanOrderFax> physRecords) {
		physicianOrderFax = physRecords;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			Object o = physicianOrderFax.get(row);
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MM / dd / yyyy  hh:mm a");
			if (o instanceof PhysicanOrderFax) {
				PhysicanOrderFax pof = (PhysicanOrderFax) o;
				switch (col) {
				case 0:
					return (pof.getSerial() + "");

				case 2:
					return (pof.getDetail());

				case 1:

					return (df.format(pof.getDate()));

				default:
					return ("");
				}
			}
			return ("");

		} catch (Exception e) {
			return ("");
		}
	}

}

/*
 * class PhysicianOrdersNewFaxJTable extends AbstractTableModel {
 * 
 * private String[] columnNames = { "Serail", "Detail",
 * "PhysicanOrderMedicationId", "Date", "Status" };
 * 
 * public List l;
 * 
 * int n = 0;
 * 
 * PhysicianOrdersNewFaxJTable(List records) { l = records; }
 * 
 * PhysicianOrdersNewFaxJTable() { l = new ArrayList(); }
 * 
 * public int getColumnCount() { return columnNames.length; }
 * 
 * public int getRowCount() { return (l.size()); }
 * 
 * @Override public boolean isCellEditable(int row, int column) { if (column ==
 * 2) { return true; } else { return false; } }
 * 
 * 
 * public void setRowCount(int count) { n = n + count; }
 * 
 * public void setNewList(List records) { l = records; }
 * 
 * public List< PhysicanOrderFax> getList() { return l; }
 * 
 * @Override public String getColumnName(int col) { return columnNames[col]; }
 * 
 * 
 * public Object getValueAt(int row, int col) { try { PhysicanOrderFax pof =
 * (PhysicanOrderFax) l.get(row); SimpleDateFormat df = new SimpleDateFormat();
 * df.applyPattern("MM / dd / yyyy");
 * 
 * switch (col) { case 0: return (pof.getSerial());
 * 
 * case 1: return (pof.getDetail());
 * 
 * case 2:
 * 
 * return (pof.getPhysicanOrderMedicationID());
 * 
 * case 3:
 * 
 * return (df.format(pof.getDate()));
 * 
 * case 4: default: return ("");
 * 
 * 
 * 
 * } }
 * 
 * catch(Exception e ) { return (""); } }
 * 
 * }
 */

