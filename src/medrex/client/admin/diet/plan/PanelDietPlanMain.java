package medrex.client.admin.diet.plan;

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
import medrex.commons.vo.admin.DietPlan;

import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;

public class PanelDietPlanMain extends JPanel {

	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);
	private JxTable table;
	private static final long serialVersionUID = 1L;
	private JPanel defaultPanel;
	private JxPanel panel;
	private DietPlanTableModel tableModel;
	private PanelDietPlanDialog panelDietPlanDialog;

	public PanelDietPlanMain() {
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
		lblHeading.setBounds(0, 0, 731, 30);
		lblHeading.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		lblHeading.setBackground(Color.WHITE);
		lblHeading.setFont(new Font("Dialog", Font.PLAIN, 28));
		lblHeading.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading.setHorizontalTextPosition(SwingConstants.CENTER);
		lblHeading.setText("Diet Plan");
		panel.add(lblHeading);

		JScrollPane scrollpane = new JScrollPane();
		scrollpane.setBounds(10, 42, 731, 301);
		panel.add(scrollpane);

		tableModel = new DietPlanTableModel();
		table = new JxTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (e.getClickCount() == 2) {
					int id = (Integer) tableModel.getValueAt(table
							.getSelectedRow(), 2);
					Global.currentDietPlanKey = id;
					if (id != 0) {
						panelDietPlanDialog = new PanelDietPlanDialog();
						SwingUtils.openInDialog(panelDietPlanDialog);
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
				Global.currentDietPlanKey = 0;
				panelDietPlanDialog = new PanelDietPlanDialog();
				SwingUtils.openInDialog(panelDietPlanDialog);
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
				try {
					int id = (Integer) tableModel.getValueAt(table
							.getSelectedRow(), 2);
					if (id != 0) {
						MedrexClientManager.getInstance().deleteDietPlan(id);
						updateTable();
					}
				} catch (Exception ex) {
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
					int id = (Integer) tableModel.getValueAt(table
							.getSelectedRow(), 2);
					Global.currentDietPlanKey = id;
					if (id != 0) {
						panelDietPlanDialog = new PanelDietPlanDialog();
						SwingUtils.openInDialog(panelDietPlanDialog);
						updateTable();
					}
				} catch (Exception xe) {
				}
			}
		});
		viewupdateButton.setText("View/Update");
		viewupdateButton.setBounds(513, 364, 106, 26);
		panel.add(viewupdateButton);

		updateTable();
		doUpdate();
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
		List<DietPlan> list = null;
		try {
			list = MedrexClientManager.getInstance().getAllDietPlan();
		} catch (Exception e) {
			e.printStackTrace();
		}
		tableModel.setRecords(list);
		tableModel.fireTableDataChanged();
		table.repaint();
	}
}

class DietPlanTableModel extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7057047061173526456L;
	private List<DietPlan> records;
	private String[] columnNames = { "Name", "Type" };

	public DietPlanTableModel() {
		this(new ArrayList<DietPlan>());
	}

	public DietPlanTableModel(List<DietPlan> rec) {
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

	public void setRecords(List<DietPlan> rec) {
		this.records = rec;
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		DietPlan record = records.get(rowIndex);
		if (record != null) {
			switch (columnIndex) {
			case 0:
				return record.getDietName();
			case 1:
				return record.getDietType();
			case 2:
				return record.getSerial();
			default:
				return "";
			}
		} else {
			return "";
		}
	}
}
