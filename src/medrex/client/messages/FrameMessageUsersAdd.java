package medrex.client.messages;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.utils.SwingUtils;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.others.Users;

import com.sX.swing.JxButton;

public class FrameMessageUsersAdd extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8974063310192442856L;
	private JxButton cancelButton;
	private JRadioButton rbDepartment;
	private JRadioButton rbUser;
	private JList lstUsers;
	private boolean cancel;
	private List<Users> toUserList;
	private ButtonGroup bg = new ButtonGroup();
	private static final Color DEF_COLOR = new Color(49, 104, 127);

	public List<Users> getToUserList() {
		return toUserList;
	}

	public FrameMessageUsersAdd() {
		super();
		setResizable(false);
		setTitle("LTC");
		setModal(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		SwingUtils.center(this);

		cancel = true;
		toUserList = new ArrayList<Users>();

		setSize(new Dimension(348, 388));
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.WHITE);

		final JxButton okButton = new JxButton();
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				Object[] toUsers = lstUsers.getSelectedValues();
				if (rbUser.isSelected()) {
					for (int i = 0; i < toUsers.length; i++) {
						if (toUsers[i] instanceof Users) {
							Users toUser = (Users) toUsers[i];
							toUserList.add(toUser);
							// System.out.println(toUser.getUserName());
						}
					}
				} else if (rbDepartment.isSelected()) {
					toUserList.clear();
					List<Users> temp = new ArrayList<Users>();
					for (int i = 0; i < toUsers.length; i++) {
						String user = toUsers[i].toString();
						// System.out.println("Users:" + user +"i:" + i);
						try {
							temp = (MedrexClientManager.getInstance()
									.getUserListFromDepartment(user));
							toUserList.addAll(temp);
						} catch (RemoteException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (MedrexException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					// System.out.println("List size:"+temp.size());
				}
				disposeMe();
				cancel = false;
			}
		});
		okButton.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		okButton.setBackground(Color.WHITE);
		okButton.setArc(0.4f);
		okButton.setForeground(DEF_COLOR);
		okButton.setFont(new Font("", Font.BOLD, 12));
		okButton.setText("OK");
		okButton.setBounds(242, 66, 75, 23);
		getContentPane().add(okButton);

		cancelButton = new JxButton();
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				disposeMe();
			}
		});
		cancelButton.setBorder(new LineBorder(new Color(180, 188, 193), 1,
				false));
		cancelButton.setBackground(Color.WHITE);
		cancelButton.setArc(0.4f);
		cancelButton.setForeground(DEF_COLOR);
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setText("Cancel");
		cancelButton.setBounds(242, 102, 75, 23);
		getContentPane().add(cancelButton);

		final ListCellRenderer cell = new DefaultListCellRenderer() {
			/**
			 * 
			 */
			private static final long serialVersionUID = -2821442716673393370L;

			@Override
			public Component getListCellRendererComponent(JList list,
					Object value, int index, boolean isSelected,
					boolean hasfocus) {
				JLabel rLabel = (JLabel) super.getListCellRendererComponent(
						list, value, index, isSelected, hasfocus);
				if (value instanceof Users) {
					Users user = (Users) value;
					rLabel.setText(user.getUserName());
				}
				return rLabel;
			}
		};

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 65, 221, 276);
		getContentPane().add(scrollPane);

		lstUsers = new JList();
		lstUsers.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		lstUsers.setBackground(Color.WHITE);
		lstUsers.setForeground(DEF_COLOR);
		lstUsers.setFont(new Font("", Font.BOLD, 12));
		lstUsers.setBounds(10, 65, 221, 323);
		lstUsers.setFixedCellHeight(20);
		lstUsers.setCellRenderer(cell);
		getContentPane().add(lstUsers);
		scrollPane.setViewportView(lstUsers);

		rbUser = new JRadioButton();
		rbUser.setBackground(Color.WHITE);
		rbUser.setForeground(DEF_COLOR);
		rbUser.setFont(new Font("", Font.BOLD, 12));
		rbUser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				getUserList();
			}
		});
		bg.add(rbUser);
		rbUser.setText("User");
		rbUser.setBounds(10, 23, 52, 24);
		getContentPane().add(rbUser);

		rbDepartment = new JRadioButton();
		rbDepartment.setBackground(Color.WHITE);
		rbDepartment.setForeground(DEF_COLOR);
		rbDepartment.setFont(new Font("", Font.BOLD, 12));
		rbDepartment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				getDepartmentList();
			}
		});
		bg.add(rbDepartment);
		rbDepartment.setText("Department");
		rbDepartment.setBounds(83, 23, 92, 24);
		getContentPane().add(rbDepartment);

		rbUser.setSelected(true);
		getUserList();
	}

	protected void getDepartmentList() {
		List l = new ArrayList();
		l.add("Physicians");
		l.add("Nurse");
		l.add("CNA");
		l.add("RN");
		l.add("LPN");
		l.add("Manager");
		l.add("Administrator");
		lstUsers.setListData(l.toArray());
		lstUsers.repaint();
	}

	private void getUserList() {
		List l = null;
		try {
			l = MedrexClientManager.getInstance().getUsers();
		} catch (Exception e) {
			e.printStackTrace();
		}
		lstUsers.setListData(l.toArray());
		lstUsers.repaint();
	}

	public void disposeMe() {
		dispose();
		cancel = true;
	}

	public boolean isCancel() {
		return cancel;
	}

	public void setCancel(boolean cancel) {
		this.cancel = cancel;
	}
}
