package medrex.client.admin.formManager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.formManager.FormPage;
import medrex.commons.vo.formManager.Tab;
import medrex.server.dao.formManager.FormManagerDao;

import com.sX.swing.JxButton;
import com.sX.swing.JxTable;

public class FrameFormManager extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7860713769092641889L;
	private JxTable table;
	private FormsRecordsJTable formPageTable;
	private JLabel formLabel;
	private int selectedrow = 0;
	private int selectedidofForm;
	private int selectedTabId;
	private int currentSelectedFormId;
	private boolean isNew;
	private String currentSelectedForm;

	public String getCurrentSelectedForm() {
		return currentSelectedForm;
	}

	public void setCurrentSelectedForm(String currentSelectedForm) {
		this.currentSelectedForm = currentSelectedForm;
	}

	public int getSelectedTabId() {
		return selectedTabId;
	}

	public void setSelectedTabId(int selectedTabId) {
		this.selectedTabId = selectedTabId;
	}

	public FrameFormManager() {
		super();
		Global.frameFormManager = this;

		setResizable(false);
		setSize(new Dimension(
				Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
						.getDefaultToolkit().getScreenSize().height - 50));
		setSize(new Dimension(1024, 768));
		setBounds(100, 100, 1157, 768);

		final PanelFormTree panel = new PanelFormTree();
		panel.setPreferredSize(new Dimension(250, 100));
		this.currentSelectedFormId = panel.getCurrentFormId();

		getContentPane().add(panel, BorderLayout.WEST);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		getContentPane().add(panel_1, BorderLayout.CENTER);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(57, 97, 678, 235);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane
				.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 1, false));
		panel_1.add(scrollPane);

		table = new JxTable();
		formPageTable = new FormsRecordsJTable();
		table.setModel(formPageTable);
		table.addMouseListener(new MouseAdapter() {
			private PanelFormAdd panelFormAdd;

			@Override
			public void mouseClicked(final MouseEvent evt) {

				if (evt.getClickCount() == 2) {
					isNew = false;
					int form_serial = new Integer((String) formPageTable
							.getValueAt(table.getSelectedRow(), 2)).intValue();

					System.out.println("form Page serial is : " + form_serial);
					int form_pageSerial = new Integer((String) formPageTable
							.getValueAt(table.getSelectedRow(), 0)).intValue();
					System.out.println("form Page serial is : "
							+ form_pageSerial);

					System.out.println("selected tab id is " + selectedTabId);
					if (form_pageSerial != -1) {
						Global.currentFrameFormManagerKey = form_pageSerial;
						PanelFormAdd panelFormAdd = new PanelFormAdd(
								form_serial, isNew);
						JDialog dialog = SwingUtils.openInDialog(panelFormAdd);
						dialog.setVisible(true);
						dialog.setFocusable(true);
						dialog.setAlwaysOnTop(true);
						dialog.setEnabled(true);
					}
				}

			}
		});
		table.setBounds(57, 97, 678, 235);

		scrollPane.setViewportView(table);

		formLabel = new JLabel();
		formLabel.setHorizontalAlignment(SwingConstants.CENTER);
		formLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		formLabel.setText("");
		formLabel.setForeground(ColorConstants.DEF_COLOR);
		formLabel.setBounds(45, 37, 700, 30);
		panel_1.add(formLabel);

		final JxButton btnAdd = new JxButton();
		btnAdd.addActionListener(new ActionListener() {
			private int formId;

			public void actionPerformed(final ActionEvent arg0) {
				isNew = true;
				String selectedNode = panel.getSelectedNode();
				selectedTabId = getSelectedidofForm();
				try {
					formId = MedrexClientManager.getInstance().getFormIdByName(
							selectedNode);
					if (formId != 0) {
						new PanelFormAdd(formId, isNew);
					}
				} catch (RemoteException e) {
					e.printStackTrace();
				} catch (MedrexException e) {
					e.printStackTrace();
				}
				PanelFormAdd panelFormAdd = new PanelFormAdd(formId, isNew);
				JDialog dialog = SwingUtils.wrapInDialog(panelFormAdd);
				dialog.setFocusable(true);
				dialog.setAlwaysOnTop(true);
				dialog.setEnabled(true);
				panelFormAdd.setDialog(dialog);
				dialog.setVisible(true);

			}
		});
		btnAdd.setForeground(ColorConstants.DEF_COLOR);
		btnAdd.setArc(0.4F);
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnAdd.setText("Add New");
		btnAdd.setBounds(57, 375, 111, 26);
		panel_1.add(btnAdd);

		final JxButton btnView = new JxButton();
		btnView.setForeground(ColorConstants.DEF_COLOR);
		btnView.setArc(0.4f);
		btnView.setBackground(Color.WHITE);
		btnView.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnView.setText("View / Update");
		btnView.setBounds(220, 375, 111, 26);
		panel_1.add(btnView);

		final JxButton btnDelete = new JxButton();
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				int form_serial = new Integer((String) formPageTable
						.getValueAt(table.getSelectedRow(), 2)).intValue();
				System.out
						.println("parrent id means current selected form id : "
								+ currentSelectedFormId);

				int form_pageSerial = currentSelectedFormId;

				if (form_pageSerial != -1 && form_serial != -1) {
					try {
						// FormManagerDao.getInstance().deleteForm_formPage(form_pageSerial);
						MedrexClientManager.getInstance().deleteForm_formPage(
								form_pageSerial, form_serial);
						System.out.println("testing");
					} catch (MedrexException e) {
						e.printStackTrace();
					} catch (RemoteException e) {
						e.printStackTrace();
					}
				}
			}
		});
		btnDelete.setForeground(ColorConstants.DEF_COLOR);
		btnDelete.setArc(0.4f);
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnDelete.setText("Delete");
		btnDelete.setBounds(383, 375, 111, 26);
		panel_1.add(btnDelete);

		final JxButton btnUp = new JxButton();
		btnUp.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (table.getSelectedRow() != -1) {
					doUpOrder();
					if (selectedrow >= 0) {
						table.changeSelection(selectedrow, 0, false, false);
					}
				}
			}
		});
		btnUp.setBackground(Color.WHITE);
		btnUp.setForeground(ColorConstants.DEF_COLOR);
		btnUp.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnUp.setArc(0.4f);
		btnUp.setText("Up");
		btnUp.setBounds(764, 156, 111, 26);
		panel_1.add(btnUp);

		final JxButton btnDown = new JxButton();
		btnDown.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (table.getSelectedRow() != -1) {
					doDownOrder();
					if (selectedrow >= 0) {
						table.changeSelection(selectedrow, 0, false, false);
					}
				}
			}
		});
		btnDown.setForeground(ColorConstants.DEF_COLOR);
		btnDown.setBackground(Color.WHITE);
		btnDown.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnDown.setArc(0.4f);
		btnDown.setText("Down");
		btnDown.setBounds(764, 216, 111, 26);
		panel_1.add(btnDown);

		final JLabel parrentLabel = new JLabel();
		parrentLabel.setText("Parrent");
		parrentLabel.setForeground(ColorConstants.DEF_COLOR);
		parrentLabel.setBounds(85, 469, 67, 25);
		panel_1.add(parrentLabel);

		final JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				selectedidofForm = comboBox.getSelectedIndex();
				setSelectedidofForm(selectedidofForm);

			}
		});
		comboBox.setBounds(158, 469, 577, 25);
		comboBox.addItem(null);
		// display all the form from FormPage table
		try {
			// List<Tab> allFormPage =
			// FormManagerDao.getInstance().getAllTabs();
			List<Tab> allFormPage = MedrexClientManager.getInstance()
					.getAllTabs();
			new ArrayList<String>();
			for (Tab formpage : allFormPage) {
				if (formpage != null) {
					comboBox.addItem(formpage.getTabName());
				}
			}
		} catch (Exception e) {
		}
		panel_1.add(comboBox);

		final JxButton button = new JxButton();
		button.setForeground(ColorConstants.DEF_COLOR);
		button.setBackground(Color.WHITE);

		button.addActionListener(new ActionListener() {

			public void actionPerformed(final ActionEvent arg0) {
				String selectedNode = panel.getSelectedNode();
				selectedTabId = getSelectedidofForm();
				try {
					int formId = MedrexClientManager.getInstance()
							.getFormIdByName(selectedNode);
					// FormManagerDao.getInstance().insertOrUpdateForm(formId,selectedTabId);
					MedrexClientManager.getInstance().insertOrUpdateForm(
							formId, selectedTabId);

				} catch (MedrexException e) {
					e.printStackTrace();
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		button.setText("Save");
		button.setBounds(280, 519, 106, 26);
		panel_1.add(button);

	}

	public int getSelectedidofForm() {
		return selectedidofForm;
	}

	public void setSelectedidofForm(int selectedidofForm) {
		this.selectedidofForm = selectedidofForm;
	}

	public void doUpdate() {
		updateFormPageRecordTable();
	}

	public void updateFormPageRecordTable() {

		List<FormPage> list = null;
		try {
			// list =
			// FormManagerDao.getInstance().getAllFormPages(formLabel.getText());
			list = MedrexClientManager.getInstance().getAllFormPages(
					formLabel.getText());
			formPageTable.setNewList(list);
			formPageTable.fireTableStructureChanged();
			table.updateUI();
			table.repaint();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public void setNewForm(String selectedForm) {
		try {
			formLabel.setText(selectedForm);
			setCurrentSelectedForm(selectedForm);
			currentSelectedFormId = FormManagerDao.getInstance()
					.getFormIdByName(selectedForm);

			updateFormPageRecordTable();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String ar[]) {
		FrameFormManager frm = new FrameFormManager();
		frm.setSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));
		frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frm.setVisible(true);

	}

	/**
	 * TODO:This function is Used to set panel Order, Up by one step/has to be
	 * shifted to service
	 * 
	 */

	private void doUpOrder() {
		int topSerial = 0;
		int toporder = 0;
		int currSerial = 0;
		int currorder = 0;
		FormPage topref = null;
		FormPage currref = null;
		if (table.getSelectedRow() == 0) {
			JOptionPane.showMessageDialog(this, "Already First Order",
					"Form Page Order", JOptionPane.ERROR_MESSAGE);
		} else {
			topSerial = new Integer((String) formPageTable.getValueAt(table
					.getSelectedRow() - 1, 2)).intValue();// to get Serial
			toporder = new Integer((String) formPageTable.getValueAt(table
					.getSelectedRow() - 1, 0)).intValue();// to get Order
			selectedrow = table.getSelectedRow() - 1; // toporder-1;

			currSerial = new Integer((String) formPageTable.getValueAt(table
					.getSelectedRow(), 2)).intValue();
			currorder = new Integer((String) formPageTable.getValueAt(table
					.getSelectedRow(), 0)).intValue();

			if (currSerial != 0) {
				try {
					// currref =
					// FormManagerDao.getInstance().getFormPageWithId(currSerial);
					currref = MedrexClientManager.getInstance()
							.getFormPageWithId(currSerial);
					currref.setPageNo(toporder);
					// FormManagerDao.getInstance().insertOrUpdateFormPage(currref);
					MedrexClientManager.getInstance().insertOrUpdateFormPage(
							currref);

					// topref =
					// FormManagerDao.getInstance().getFormPageWithId(topSerial);
					topref = MedrexClientManager.getInstance()
							.getFormPageWithId(topSerial);
					topref.setPageNo(currorder);
					MedrexClientManager.getInstance().insertOrUpdateFormPage(
							topref);

				} catch (Exception e) {

					e.printStackTrace();
				}
			}
		}
		updateFormPageRecordTable();
	}

	/**
	 * This function is Used to set panel Order, down by one step / has to be
	 * shifted to service
	 */
	private void doDownOrder() {
		int bottomSerial = 0;
		int bottomorder = 0;
		int currSerial = 0;
		int currorder = 0;
		FormPage bottomref = null;
		FormPage currref = null;

		if (table.getRowCount() == table.getSelectedRow() + 1) {
			JOptionPane.showMessageDialog(this, "Already Last Order",
					"Form Page Order", JOptionPane.ERROR_MESSAGE);
		} else {

			bottomSerial = new Integer((String) formPageTable.getValueAt(table
					.getSelectedRow() + 1, 2)).intValue();
			bottomorder = new Integer((String) formPageTable.getValueAt(table
					.getSelectedRow() + 1, 0));
			selectedrow = table.getSelectedRow() + 1;

			currSerial = new Integer((String) formPageTable.getValueAt(table
					.getSelectedRow(), 2)).intValue();
			currorder = new Integer((String) formPageTable.getValueAt(table
					.getSelectedRow(), 0));
			if (currSerial != 0) {
				try {
					currref = MedrexClientManager.getInstance()
							.getFormPageWithId(currSerial);
					currref.setPageNo(bottomorder);
					MedrexClientManager.getInstance().insertOrUpdateFormPage(
							currref);

					bottomref = MedrexClientManager.getInstance()
							.getFormPageWithId(bottomSerial);
					bottomref.setPageNo(currorder);
					MedrexClientManager.getInstance().insertOrUpdateFormPage(
							bottomref);
				} catch (Exception e) {

					e.printStackTrace();
				}
			}
		}
		updateFormPageRecordTable();

	}

}

class FormsRecordsJTable extends AbstractTableModel {
	/**
	 * this class is used for displaying form Page data in table
	 */
	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "PAGE NUMBER", "PAGE NAME " };

	public List<FormPage> formPages;

	int n = 0;

	FormsRecordsJTable(List<FormPage> formPages) {
		this.formPages = formPages;
	}

	FormsRecordsJTable() {
		formPages = new ArrayList<FormPage>();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (formPages.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List<FormPage> formPages) {
		this.formPages = formPages;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			Object o = formPages.get(row);
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MM / dd / yyyy  hh:mm a");
			if (o instanceof FormPage) {
				FormPage rc = (FormPage) o;
				if (col == 0) {
					return (rc.getPageNo() + "");
				}
				if (col == 1) {

					return (rc.getClassName().replaceFirst(
							"medrex.client.formpages.", ""));
				}
				if (col == 2) {
					return (rc.getSerial() + "");
				}
				return ("");
			}
		} catch (Exception e) {
			return ("");
		}
		return "";

	}

}
