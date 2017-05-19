package medrex.client.admin.treatment;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.Treatment;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;

public class PanelTreatmentMain extends JPanel {

	private JxButton btnTreatmentSetting;
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);
	private JxTable table;
	private static final long serialVersionUID = 1L;
	private JPanel defaultPanel;
	private JxPanel panel;
	private TreatmentListTableModel tableModel;
	private PaneTreatmentDialog panelTreatmentDialog;

	public PanelTreatmentMain() {
		super();
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});
		setLayout(null);
		setOpaque(false);
		setPreferredSize(new Dimension(950, 592));

		defaultPanel = new JPanel();
		defaultPanel.setLayout(null);
		defaultPanel.setBorder(new EmptyBorder(20, 0, 0, 8));
		defaultPanel.setOpaque(false);
		defaultPanel.setBounds(0, 0, 950, 592);
		defaultPanel.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
				doUpdate();
			}
		});
		add(defaultPanel);

		panel = new JxPanel();
		panel.setArc(1f);
		panel.setBorder(new LineBorder(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor(), 1, false));
		panel.setBounds(200, 25, 750, 409);
		panel.setBackground(Color.WHITE);
		panel.setPreferredSize(new Dimension(750, 434));
		panel.setLayout(null);
		defaultPanel.add(panel);

		final JLabel lblHeading = new JLabel();
		lblHeading.setBounds(0, 0, 731, 35);
		lblHeading.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		lblHeading.setBackground(Color.WHITE);
		lblHeading.setFont(new Font("Dialog", Font.PLAIN, 28));
		lblHeading.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading.setHorizontalTextPosition(SwingConstants.CENTER);
		lblHeading.setText("Treatment");
		panel.add(lblHeading);

		JScrollPane scrollpane = new JScrollPane();
		scrollpane.setBounds(10, 42, 731, 301);
		panel.add(scrollpane);

		tableModel = new TreatmentListTableModel();
		table = new JxTable();

		// table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		//
		// for(int i=0;i<table.getColumnCount();i++){
		// TableColumnModel colModel = (TableColumnModel)
		// table.getColumnModel();
		// TableColumn col = colModel.getColumn(i);
		// int width = 100;
		//
		// TableCellRenderer renderer = col.getHeaderRenderer();
		// if (renderer == null) {
		// renderer = table.getTableHeader().getDefaultRenderer();
		// }
		// Component comp = renderer.getTableCellRendererComponent(table,
		// col.getHeaderValue(), false,
		// false, 0, 0);
		// width = comp.getPreferredSize().width+200;
		// col.setPreferredWidth(width+100);
		// }
		//		

		// cm.getColumn(2).setPreferredWidth(100);
		// cm.getColumn(3).setPreferredWidth(100);
		// cm.getColumn(4).setPreferredWidth(100);
		// table.setColumnModel(cm);
		// table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		// TableColumnModel cm = table.getColumnModel();
		// Enumeration<TableColumn> columns = cm.getColumns();
		// while(columns.hasMoreElements()){
		// System.out.println("Index is : "+columns.nextElement().getModelIndex());
		// }
		// int vColIndex = 0;
		// TableColumn col = table.getColumnModel().getColumnCount();
		// int width = 200;
		// col.setPreferredWidth(width);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (e.getClickCount() == 2) {
					long id = Long.parseLong((String) tableModel.getValueAt(
							table.getSelectedRow(), 0));
					Global.currentTreatmentKey = id;
					if (id != 0) {
						panelTreatmentDialog = (PaneTreatmentDialog) FrameFactory
								.createWindowOfType(PaneTreatmentDialog.class);
						panelTreatmentDialog.setMode("Update");
						SwingUtils.center(panelTreatmentDialog);
						panelTreatmentDialog.setTitle("View/Update Treatment");
						panelTreatmentDialog.setModal(true);
						panelTreatmentDialog.setVisible(true);

						updateTable();
					}
				}
			}
		});
		table.setModel(tableModel);
		scrollpane.setViewportView(table);

		final JxButton addNewButton = new JxButton();
		addNewButton.setArc(0.4f);
		addNewButton.setBackground(Color.WHITE);
		addNewButton.setForeground(DEF_COL);
		addNewButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		addNewButton.setFont(new Font("", Font.BOLD, 12));

		addNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.currentTreatmentKey = 0;

				panelTreatmentDialog = (PaneTreatmentDialog) FrameFactory
						.createWindowOfType(PaneTreatmentDialog.class);
				panelTreatmentDialog.setMode("Add New");
				SwingUtils.center(panelTreatmentDialog);
				panelTreatmentDialog.setTitle("Add Treatment");
				panelTreatmentDialog.setModal(true);
				panelTreatmentDialog.setVisible(true);
				updateTable();
			}
		});
		addNewButton.setText("Add New");
		addNewButton.setBounds(10, 364, 106, 26);
		panel.add(addNewButton);

		final JxButton deleteButton = new JxButton();
		deleteButton.setArc(0.4f);
		deleteButton.setBackground(Color.WHITE);
		deleteButton.setForeground(DEF_COL);
		deleteButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		deleteButton.setFont(new Font("", Font.BOLD, 12));
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				long id = Long.parseLong((String) tableModel.getValueAt(table
						.getSelectedRow(), 0));
				if (id != 0) {
					try {
						MedrexClientManager.getInstance().deleteTreatment(id);
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (MedrexException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					updateTable();
				}
			}
		});
		deleteButton.setText("Delete");
		deleteButton.setBounds(625, 364, 106, 26);
		panel.add(deleteButton);

		final JxButton viewupdateButton = new JxButton();
		viewupdateButton.setArc(0.4f);
		viewupdateButton.setBackground(Color.WHITE);
		viewupdateButton.setForeground(DEF_COL);
		viewupdateButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		viewupdateButton.setFont(new Font("", Font.BOLD, 12));
		viewupdateButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					long id = Long.parseLong((String) tableModel.getValueAt(
							table.getSelectedRow(), 0));
					Global.currentTreatmentKey = id;
					if (id != 0) {
						panelTreatmentDialog = (PaneTreatmentDialog) FrameFactory
								.createWindowOfType(PaneTreatmentDialog.class);
						panelTreatmentDialog.setMode("Update");
						SwingUtils.center(panelTreatmentDialog);
						panelTreatmentDialog.setTitle("View/Update Treatment");
						panelTreatmentDialog.setModal(true);
						panelTreatmentDialog.setVisible(true);
						panelTreatmentDialog.setMode("Update");
						updateTable();
					}
				} catch (Exception xe) {
					xe.printStackTrace();
				}
			}
		});
		viewupdateButton.setText("View/Update");
		viewupdateButton.setBounds(513, 364, 106, 26);
		panel.add(viewupdateButton);

		btnTreatmentSetting = new JxButton();
		btnTreatmentSetting.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSetting();
			}
		});
		btnTreatmentSetting.setBackground(Color.WHITE);
		btnTreatmentSetting.setForeground(DEF_COL);
		btnTreatmentSetting.setFont(new Font("", Font.BOLD, 12));
		btnTreatmentSetting.setBorder(new LineBorder(new Color(180, 188, 193),
				1, false));
		btnTreatmentSetting.setArc(0.4f);
		btnTreatmentSetting.setText("Treatment Setting");
		btnTreatmentSetting.setBounds(227, 364, 154, 26);
		panel.add(btnTreatmentSetting);

		updateTable();
		doUpdate();
	}

	protected void doSetting() {
		PanelTreatmentSetting med = (PanelTreatmentSetting) FrameFactory
				.createWindowOfType(PanelTreatmentSetting.class);
		SwingUtils.center(med);
		med.setModal(true);
		med.setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(new Color(32, 63, 84));
		g2.fillRect(0, getHeight() - 76, getWidth(), 76);
		super.paint(g);
	}

	protected void doUpdate() {
		int w = getWidth();
		int h = getHeight();
		float wF = ((float) w / 868);
		float hF = ((float) h / 592);
		defaultPanel.setSize((int) (868 * wF), (int) (592 * hF));

		if (getTopLevelAncestor() != null) {
			getTopLevelAncestor().repaint();
		} else {
			this.repaint();
		}
	}

	private void updateTable() {
		List<Treatment> list = null;
		try {
			list = MedrexClientManager.getInstance().getAllTreatments();
		} catch (Exception e) {
			e.printStackTrace();
		}
		tableModel.setRecords(list);
		tableModel.fireTableDataChanged();
		table.repaint();
	}
}

class TreatmentListTableModel extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2979949301067176286L;
	private List<Treatment> records;
	private String[] columnNames = { "NDC", "Treatment Name", "Route Name",
			"Description" };

	public TreatmentListTableModel() {
		this(new ArrayList<Treatment>());
	}

	public TreatmentListTableModel(List<Treatment> rec) {
		setRecords(rec);
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public String getColumnName(int columnIndex) {
		return columnNames[columnIndex];
	}

	public int getRowCount() {
		if (records != null) {
			return records.size();
		} else {
			return 0;
		}
	}

	public void setRecords(List<Treatment> rec) {
		this.records = rec;
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		Treatment record = records.get(rowIndex);
		if (record != null) {
			switch (columnIndex) {
			case 0:
				return record.getNdc() + "";
			case 1:
				return record.getName();
			case 2:
				return record.getRouteName();
			case 3:
				return record.getCoustionary();
			case 4:
				return record.getDescription();
			default:
				return "";
			}
		} else {
			return "";
		}
	}
}
