package medrex.client.admin.password;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.others.Users;

import com.sX.swing.JxButton;

public class PanelLockStatus extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3344719358373080681L;
	// private String[][] data=null;
	CheckListItem arr[] = new CheckListItem[0];
	private JList list;
	int userId[] = new int[0];
	int selectedUserId[] = new int[0];
	CheckListItem item = null;
	int status = 0;
	private List userList = new ArrayList();

	public PanelLockStatus(int status) {
		super();
		this.status = status;
		setBackground(Color.WHITE);
		setLayout(null);
		setSize(400, 480);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 558, 492);
		add(panel);

		final JLabel label = new JLabel();
		label.setText("User Status");
		label.setFont(new Font("", Font.BOLD, 22));
		label.setForeground(ColorConstants.DEF_COLOR);
		label.setBounds(110, 10, 191, 30);
		panel.add(label);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 84, 368, 283);
		panel.add(scrollPane);

		fillList(status);

		list = new JList(arr);
		list.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 1, false));
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

		// final JxTable table = new JxTable();
		scrollPane.setViewportView(list);
		// table.setBackground(Color.white);
		// UserDataModel userDataModel = new UserDataModel(data);
		// table.setModel(userDataModel);

		final JxButton ChangeStatus = new JxButton(0.4f);
		ChangeStatus.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doChangeStatus();
				PanelLockStatus.this.dispose();
			}
		});
		ChangeStatus.setForeground(ColorConstants.DEF_COLOR);
		ChangeStatus.setBackground(Color.WHITE);
		ChangeStatus.setBorder(new LineBorder(ColorConstants.BORDER_COL, 1,
				false));
		ChangeStatus.setFont(new Font("", Font.BOLD, 12));
		ChangeStatus.setActionCommand("");
		ChangeStatus.setText("ChangeStatus");
		ChangeStatus.setBounds(10, 387, 110, 26);
		panel.add(ChangeStatus);

		final JxButton selectAllButton = new JxButton(0.4f);
		selectAllButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doCheckAll();
			}
		});
		selectAllButton.setForeground(ColorConstants.DEF_COLOR);
		selectAllButton.setBackground(Color.WHITE);
		selectAllButton.setBorder(new LineBorder(ColorConstants.BORDER_COL, 1,
				false));
		selectAllButton.setFont(new Font("", Font.BOLD, 12));
		selectAllButton.setText("check All");
		selectAllButton.setBounds(126, 387, 74, 26);
		panel.add(selectAllButton);

		final JxButton uncheckAllButton = new JxButton(0.4f);
		uncheckAllButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doUnCheckAll();
			}
		});
		uncheckAllButton.setForeground(ColorConstants.DEF_COLOR);
		uncheckAllButton.setBackground(Color.WHITE);
		uncheckAllButton.setBorder(new LineBorder(ColorConstants.BORDER_COL, 1,
				false));
		uncheckAllButton.setFont(new Font("", Font.BOLD, 12));
		uncheckAllButton.setText("Uncheck All");
		uncheckAllButton.setBounds(206, 387, 80, 26);
		panel.add(uncheckAllButton);

		final JxButton cancelButton = new JxButton(0.4f);
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				PanelLockStatus.this.dispose();
			}
		});
		cancelButton.setForeground(ColorConstants.DEF_COLOR);
		cancelButton.setBackground(Color.WHITE);
		cancelButton.setBorder(new LineBorder(ColorConstants.BORDER_COL, 1,
				false));
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setText("Cancel");
		cancelButton.setBounds(292, 387, 86, 26);
		panel.add(cancelButton);

		final JLabel userNameLabel = new JLabel();
		userNameLabel.setText("User Name");
		userNameLabel.setFont(new Font("", Font.BOLD, 12));
		userNameLabel.setForeground(ColorConstants.DEF_COLOR);
		userNameLabel.setBounds(33, 58, 127, 20);
		panel.add(userNameLabel);

		final JLabel statusLabel = new JLabel();
		statusLabel.setText("Status");
		statusLabel.setFont(new Font("", Font.BOLD, 12));
		statusLabel.setForeground(ColorConstants.DEF_COLOR);
		statusLabel.setBounds(206, 58, 142, 20);
		panel.add(statusLabel);
		fillList(status);
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

	// public void updateList(){
	// if(Global.userList!=null){
	// // if(Global.currentAccuritiesListKey == 1){
	// for(int i=0; i < userId.length; i++){
	// List l = Global.userList;
	// Iterator itr = l.iterator();
	// while(itr.hasNext()){
	// Users user = (Users) itr.next();
	// if(user.getUserId() == userId[i]){
	// item = (CheckListItem)list.getModel().getElementAt(i);
	// item.setSelected(true);
	// list.repaint(list.getCellBounds(i, i));
	// }
	//
	// }
	//
	// }
	// }
	// }
	public void fillList(int status) {
		String userState = "locked";
		if (status == 1) {
			userState = "UnLocked";
		}
		try {
			List<Users> users;
			users = MedrexClientManager.getInstance().getUserWithStatus(status);
			Iterator it = users.iterator();
			arr = new CheckListItem[users.size()];
			userId = new int[users.size()];
			int i = 0;
			while (it.hasNext()) {
				Users user = (Users) it.next();
				arr[i] = new CheckListItem(user.getUserName(), userState);
				userId[i] = user.getSerial();
				i++;
				userList.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void doChangeStatus() {
		selectedUserId = new int[userList.size()];
		for (int i = 0; i < arr.length; i++) {
			item = (CheckListItem) list.getModel().getElementAt(i);
			if (item.isSelected()) {
				Users user = (Users) userList.get(i);
				selectedUserId[i] = user.getSerial();
			}
		}
		try {
			MedrexClientManager.getInstance().changeUserStatus(selectedUserId,
					status);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

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
	private static final long serialVersionUID = 8628436217664057873L;
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
