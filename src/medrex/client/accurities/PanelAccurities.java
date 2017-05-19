package medrex.client.accurities;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import medrex.client.FrameLogin;
import medrex.client.admin.userLogon.ControllerUserLogon;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.accurities.AccuritiesResult;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTabbedPane;
import com.sX.swing.JxTable;

public class PanelAccurities extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8293578987007934836L;
	private JxTable table;
	private AccuritiesJTable accuritiesJTable;

	private JLabel accuritiesLabel;
	private JxTabbedPane tabbedPane;

	private JxPanel panel;

	private JPanel topTabArea;

	private JPanel topTabsPanel;

	private JPanel topBlueStrip;

	private JPanel defaultPanel;

	public FrameAccuritiesAdd frameAccuritiesAdd;
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);

	public PanelAccurities() {
		super();

		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doResize();
				}
			}
		});

		Global.setPanelId = 0;
		setLayout(null);
		setPreferredSize(new Dimension(868, 768));

		topTabArea = new JPanel();
		topTabArea.setLayout(new BorderLayout(0, 0));
		topTabArea.setOpaque(false);
		topTabArea.setBounds(0, 0, 868, 138);
		add(topTabArea);

		topTabsPanel = new JPanel();
		topTabsPanel.setOpaque(false);
		topTabsPanel.setLayout(null);
		topTabsPanel.setPreferredSize(new Dimension(868, 40));
		topTabArea.add(topTabsPanel, BorderLayout.SOUTH);

		topBlueStrip = new JPanel();
		topBlueStrip.setLayout(new GridLayout(0, 2));
		topBlueStrip.setBackground(new Color(28, 93, 113));
		topBlueStrip.setBounds(0, 138, 868, 38);
		add(topBlueStrip);

		final JLabel lastLoginLabel = new JLabel();
		lastLoginLabel.setForeground(Color.WHITE);
		lastLoginLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont()
				.deriveFont(16));
		lastLoginLabel.setBorder(new EmptyBorder(0, 100, 0, 0));
		lastLoginLabel.setText("<html><b>Welcome </b>"
				+ Global.currentUserLastName + ", "
				+ Global.currentUserFirstName);
		topBlueStrip.add(lastLoginLabel);

		final JLabel logLabel = new JLabel();
		logLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent arg0) {
				(new ControllerUserLogon()).logoutUpdate();
				FrameFactory.closeAll();
				FrameLogin frame = (FrameLogin) FrameFactory
						.createWindowOfType(FrameLogin.class);
				Global.currentMainTab = 1;
				frame.setVisible(true);
			}
		});
		logLabel.setBorder(new EmptyBorder(0, 0, 0, 50));
		logLabel.setForeground(Color.WHITE);
		logLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont()
				.deriveFont(16));
		logLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		logLabel.setText("Log off  ");
		topBlueStrip.add(logLabel);

		defaultPanel = new JPanel();
		defaultPanel.setBorder(new EmptyBorder(20, 0, 0, 10));
		defaultPanel.setOpaque(false);
		defaultPanel.setLayout(null);
		defaultPanel.setBounds(0, 176, 868, 592);
		add(defaultPanel);

		panel = new JxPanel();
		panel.setArc(1f);
		panel.setBorder(new LineBorder(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor(), 1, false));
		panel.setBounds(10, 25, 740, 409);
		panel.setBackground(Color.WHITE);
		panel.setPreferredSize(new Dimension(750, 434));
		panel.setLayout(null);
		defaultPanel.add(panel);

		accuritiesLabel = new JLabel();
		accuritiesLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		accuritiesLabel.setBackground(Color.WHITE);
		accuritiesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		accuritiesLabel.setFont(new Font("Dialog", Font.PLAIN, 28));
		accuritiesLabel.setText("Accuties");
		accuritiesLabel.setBounds(24, 22, 702, 30);
		panel.add(accuritiesLabel);

		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern("MMM dd, yyyy");

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 104, 669, 231);
		scrollPane.setBackground(Color.WHITE);
		panel.add(scrollPane);

		table = new JxTable();
		table.setBackground(Color.WHITE);
		accuritiesJTable = new AccuritiesJTable();
		table.setModel(accuritiesJTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					Global.currentAccuritiesKey = 1;

					String date = (String) accuritiesJTable.getValueAt(table
							.getSelectedRow(), 0);

					DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);

					List accList = null;
					try {
						df.parse(date);

					} catch (Exception e) {
						e.printStackTrace();
					}
					if (accList != null) {
						Global.accuritiesList = accList;
						frameAccuritiesAdd = new FrameAccuritiesAdd();
						SwingUtils.center(frameAccuritiesAdd);
						frameAccuritiesAdd
								.setTitle("View/Update Accuties Record");
						frameAccuritiesAdd.setModal(true);
						frameAccuritiesAdd.setVisible(true);
						updateAccuritiesJTable();
					}
				} else if (evt.getClickCount() == 1) {
					// System.out.println("single click");
				}
			}
		});

		scrollPane.setViewportView(table);

		final JxButton btnAdd = new JxButton(0.4f);
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setForeground(DEF_COL);
		btnAdd.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnAdd.setBounds(39, 341, 84, 26);
		btnAdd.setFont(new Font("", Font.BOLD, 12));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.currentAccuritiesKey = 0;
				List accList = null;
				try {
					// accList = MedrexClientManager.getInstance()
					// .getAccuritiesListByDate(MedrexClientManager.getServerTime());

				} catch (Exception ex) {
					ex.printStackTrace();
				}

				if (accList.size() != 0) {
					JOptionPane.showMessageDialog(null,
							"Accutities are already added!");
				} else {
					Global.accuritiesList = new ArrayList();
					frameAccuritiesAdd = new FrameAccuritiesAdd();
					SwingUtils.center(frameAccuritiesAdd);
					frameAccuritiesAdd.setTitle("Add New Accuties Records");
					frameAccuritiesAdd.setModal(true);
					frameAccuritiesAdd.setVisible(true);
				}

				updateAccuritiesJTable();

			}
		});
		btnAdd.setText("Add New");
		panel.add(btnAdd);

		updateAccuritiesJTable();
	}

	public void updateAccuritiesJTable() {
		List currentAccuritiesRecords = new ArrayList();

		try {
			currentAccuritiesRecords = MedrexClientManager.getInstance()
					.getCurrentAccuritiesList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		List<AccuritiesResult> result = new ArrayList();

		Iterator i = currentAccuritiesRecords.iterator();

		while (i.hasNext()) {
			Object[] accuritesRecord = (Object[]) i.next();
			Date tempDate = (Date) accuritesRecord[0];
			int typeId = new Integer(accuritesRecord[1].toString()).intValue();
			int count = new Integer(accuritesRecord[2].toString()).intValue();

			Iterator iresult = result.iterator();
			int j = -1;
			boolean flag = false;
			while (iresult.hasNext()) {
				j++;
				AccuritiesResult accuritiesResult = (AccuritiesResult) iresult
						.next();

				if (accuritiesResult.getDate().compareTo(tempDate) == 0) {
					if (typeId == 1) {
						accuritiesResult.setType1(count);
					}
					if (typeId == 2) {
						accuritiesResult.setType2(count);
					}
					if (typeId == 3) {
						accuritiesResult.setType3(count);
					}
					if (typeId == 4) {
						accuritiesResult.setType4(count);
					}
					flag = true;
					result.set(j, accuritiesResult);
				}
			}
			if (!flag) {
				AccuritiesResult ar = new AccuritiesResult();
				ar.setDate(tempDate);
				if (typeId == 1) {
					ar.setType1(count);
				}
				if (typeId == 2) {
					ar.setType2(count);
				}
				if (typeId == 3) {
					ar.setType3(count);
				}
				if (typeId == 4) {
					ar.setType4(count);
				}
				result.add(ar);

			}

		}

		accuritiesJTable.setNewList(result);
		accuritiesJTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(new Color(32, 63, 84));
		g2.fillRect(0, getHeight() - 76, getWidth(), 76);
	}

	public void doResize() {
		topTabArea.setSize(getWidth(), topTabArea.getHeight());
		topBlueStrip.setSize(getWidth(), topBlueStrip.getHeight());
		defaultPanel.setSize(getWidth(), getHeight() - defaultPanel.getY());
		panel.setLocation((defaultPanel.getWidth() - panel.getWidth()) / 2,
				(defaultPanel.getHeight() - panel.getHeight() - 76) / 2);
		this.repaint();
	}
}

class AccuritiesJTable extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] columnNames = { "Date", "O2", "IV", "W.O", "T" };

	public List l;
	int n = 0;

	AccuritiesJTable(List ls) {
		l = ls;
	}

	AccuritiesJTable() {
		this(new ArrayList());
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (l.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List ls) {
		l = ls;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			Object obj = l.get(row);

			if (obj instanceof AccuritiesResult) {
				AccuritiesResult ar = (AccuritiesResult) obj;

				if (col == 0) {
					DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);

					String strDate = df.format(ar.getDate());

					return strDate;
				}
				if (col == 1) {
					return ar.getType1() + "";
				}
				if (col == 2) {
					return ar.getType2() + "";
				}
				if (col == 3) {
					return ar.getType3() + "";
				}
				if (col == 4) {
					return ar.getType4() + "";
				}

			}

			return ("");
		} catch (Exception e) {
			return ("");
		}

	}
}
