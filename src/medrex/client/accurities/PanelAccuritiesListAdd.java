package medrex.client.accurities;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.accurities.Accurities;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;

public class PanelAccuritiesListAdd extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1215914928241925079L;
	private JxButton saveButton;
	private JxButton uncheckAllButton;
	private JxButton checkAllButton;
	private JList list;
	private static int currentAccuritiesListKey;
	private List accuritiesList = new ArrayList();
	CheckListItem arr[] = new CheckListItem[0];
	int resiId[] = new int[0];
	CheckListItem item = null;
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);
	private String floor;
	private String date;

	public PanelAccuritiesListAdd(int currentAccuritiesListKey, String floor,
			String date) {
		this.currentAccuritiesListKey = currentAccuritiesListKey;
		this.floor = floor;
		this.date = date;
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(0, 0, 412, 345);
		setPreferredSize(getSize());

		final JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 402, 345);
		add(panel);

		final JLabel selectResidentsLabel = new JLabel();
		selectResidentsLabel.setForeground(DEF_COL);
		selectResidentsLabel.setFont(new Font("", Font.BOLD, 12));
		selectResidentsLabel.setText("Select Residents");
		selectResidentsLabel.setBounds(10, 9, 179, 14);
		panel.add(selectResidentsLabel);

		fillList();

		list = new JList(arr);
		list.setBorder(new LineBorder(DEF_COL, 1, false));
		list.setCellRenderer(new CheckListRenderer());
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent event) {
				JList list = (JList) event.getSource();
				int index = list.locationToIndex(event.getPoint());
				CheckListItem item = (CheckListItem) list.getModel()
						.getElementAt(index);
				item.setSelected(!item.isSelected());
				list.repaint(list.getCellBounds(index, index));
			}
		});

		final JScrollPane listScrollPane = new JScrollPane();
		listScrollPane.setBounds(10, 29, 382, 243);
		listScrollPane.setViewportView(list);

		panel.add(listScrollPane);

		checkAllButton = new JxButton(0.4f);
		checkAllButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doCheckAll();
			}
		});
		checkAllButton.setBackground(Color.WHITE);
		checkAllButton.setForeground(DEF_COL);
		checkAllButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		checkAllButton.setFont(new Font("", Font.BOLD, 12));
		checkAllButton.setText("Check All");
		checkAllButton.setBounds(10, 278, 57, 21);
		panel.add(checkAllButton);

		uncheckAllButton = new JxButton(0.4f);
		uncheckAllButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doUnCheckAll();
			}
		});
		uncheckAllButton.setBackground(Color.WHITE);
		uncheckAllButton.setForeground(DEF_COL);
		uncheckAllButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		uncheckAllButton.setFont(new Font("", Font.BOLD, 12));
		uncheckAllButton.setText("Uncheck All");
		uncheckAllButton.setBounds(73, 278, 69, 21);
		panel.add(uncheckAllButton);

		saveButton = new JxButton(0.4f);
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSave();
				Global.frameAccuritiesListAddNew.dispose();
			}
		});
		saveButton.setBackground(Color.WHITE);
		saveButton.setForeground(DEF_COL);
		saveButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.setText("Save");
		saveButton.setBounds(153, 278, 57, 21);
		panel.add(saveButton);
		updateList();

	}

	public void fillList() {
		List<ResidentMain> residentList = null;
		final Map<ResidentMain, ResidentMain> residentMap;
		Comparator<ResidentMain> comparator;
		try {
			if (floor.equalsIgnoreCase("1st floor")) {
				residentList = MedrexClientManager.getInstance()
						.getFirstFloorResidents(new Date(date));
			}
			if (floor.equalsIgnoreCase("2nd floor")) {
				residentList = MedrexClientManager.getInstance()
						.getSecondFloorResidents(new Date(date));
			}
			residentMap = new HashMap<ResidentMain, ResidentMain>();
			for (ResidentMain resmain : residentList) {
				residentMap.put(resmain, resmain);
			}
			// for sorting list according to resient lastName, firstName
			comparator = new Comparator<ResidentMain>() {
				// -ve o1 < o2
				// 0 o1 = o2
				// +ve o1 > o2
				public int compare(ResidentMain o1, ResidentMain o2) {
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
			Collections.sort(residentList, comparator);

			residentList.iterator();
			arr = new CheckListItem[residentList.size()];
			resiId = new int[residentList.size()];

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateList() {
		if (Global.accuritiesList != null) {
			// if(Global.currentAccuritiesListKey == 1){
			for (int i = 0; i < resiId.length; i++) {
				List l = Global.accuritiesList;
				Iterator itr = l.iterator();
				while (itr.hasNext()) {
					Accurities acc = (Accurities) itr.next();
					if (acc.getResidentId() == resiId[i]
							&& acc.getTypeId() == Global.currentAccuritiesListKey) {
						item = (CheckListItem) list.getModel().getElementAt(i);
						item.setSelected(true);
						list.repaint(list.getCellBounds(i, i));
					}

				}

			}
			// }
		}
	}

	public void doCheckAll() {
		for (int i = 0; i < arr.length; i++) {
			item = (CheckListItem) list.getModel().getElementAt(i);
			item.setSelected(true);
			// Repaint cell
			list.repaint(list.getCellBounds(i, i));
		}
	}

	public void doUnCheckAll() {
		for (int i = 0; i < arr.length; i++) {
			item = (CheckListItem) list.getModel().getElementAt(i);
			item.setSelected(false);
			// Repaint cell
			list.repaint(list.getCellBounds(i, i));
		}
	}

	public void doSave() {
		if (Global.accuritiesList != null) {
			List l = Global.accuritiesList;
			accuritiesList.clear();
			Iterator itr = l.iterator();
			while (itr.hasNext()) {
				Accurities accurities = (Accurities) itr.next();
				if (accurities.getTypeId() != Global.currentAccuritiesListKey)
					accuritiesList.add(accurities);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			item = (CheckListItem) list.getModel().getElementAt(i);
			if (item.isSelected()) {
				Accurities accurities = new Accurities();
				accurities.setResidentId(resiId[i]);
				accurities.setTypeId(currentAccuritiesListKey);
				DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);

				String strDate = df.format(MedrexClientManager.getServerTime());
				Date today = null;
				try {
					today = df.parse(strDate);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				accurities.setDate(today);
				accuritiesList.add(accurities);
			}
		}

		Global.accuritiesList = accuritiesList;

	}
}

// Represents items in the list that can be selected

class CheckListItem {
	private String column1;
	private String column2;
	private boolean isSelected = false;

	public CheckListItem(String column1, String column2) {
		this.column1 = column1;
		this.column2 = column2;
	}

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	public String getColumn1() {
		return column1;
	}

	public String getColumn2() {
		return column2;
	}
}

// Handles rendering cells in the list using a check box

class CheckListRenderer extends JPanel implements ListCellRenderer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4373987617635002030L;
	private JCheckBox checkbox;
	private JLabel column2;

	public static final Color DEF_COL = new Color(49, 104, 127);

	public CheckListRenderer() {
		setLayout(new GridLayout(1, 2));
		checkbox = new JCheckBox();
		column2 = new JLabel();
		column2.setOpaque(true);
		add(checkbox);
		add(column2);
	}

	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isSelected, boolean hasFocus) {

		setEnabled(list.isEnabled());
		column2.setEnabled(list.isEnabled());
		if (value instanceof CheckListItem) {
			checkbox.setSelected(((CheckListItem) value).isSelected());
			checkbox.setText(((CheckListItem) value).getColumn1());
			column2.setText(((CheckListItem) value).getColumn2());
		} else {
			checkbox.setText((String) value);
		}
		checkbox.setFont(new Font("", Font.BOLD, 12));
		checkbox.setBackground(list.getBackground());
		checkbox.setForeground(DEF_COL);
		column2.setFont(new Font("", Font.BOLD, 12));
		column2.setBackground(list.getBackground());
		column2.setForeground(DEF_COL);

		return this;
	}
}
