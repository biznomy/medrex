package medrex.client.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.loading.FrameLoading;
import medrex.commons.exception.MedrexException;
import medrex.commons.utils.MedrexReportViewer;
import medrex.commons.vo.admin.NotesCategories;
import medrex.commons.vo.census.CensusCountReport;
import medrex.commons.vo.notes.Notes;
import medrex.commons.vo.notes.NotesReport;
import medrex.commons.vo.resident.ResidentMain;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.util.JRLoader;

import com.sX.awt.Direction;
import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;
import com.toedter.calendar.JDateChooser;

public class FrameCategoriesNotesReport extends JDialog {

	private static final long serialVersionUID = 1L;
	private Toolkit toolkit = null;
	private JxButton btnBack;
	private JButton btnReport;
	private JDateChooser dcTo;
	private JDateChooser dcFrom;
	private FrameLoading fl;
	private static final Color DEF_COLOR = new Color(49, 104, 127);
	private JList templateCategoryList;
	private CheckListItem checkListItems[];
	private List<NotesCategories> notesCatList;
	private String head;
	private int residentId;

	public FrameCategoriesNotesReport(final String head, int residentId) {
		super();
		Global.frameCategoriesNotesReport = this;
		setBackground(Color.WHITE);
		setLayout(null);
		setTitle("Choose Date");
		setSize(new Dimension(385, 485));
		setModal(true);
		this.head = head;
		this.residentId = residentId;

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 378, 453);
		add(panel);

		final JLabel fromLabel = new JLabel();
		fromLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		fromLabel.setForeground(DEF_COLOR);
		fromLabel.setText("From");
		fromLabel.setBounds(10, 30, 44, 14);
		panel.add(fromLabel);

		dcFrom = new JDateChooser();
		dcFrom.setDateFormatString("MM/dd/yyyy");
		dcFrom.setMaxSelectableDate(MedrexClientManager.getServerTime());
		dcFrom.setBounds(60, 30, 102, 20);
		panel.add(dcFrom);

		final JLabel toLabel = new JLabel();
		toLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		toLabel.setForeground(DEF_COLOR);
		toLabel.setText("To");
		toLabel.setBounds(198, 30, 42, 14);
		panel.add(toLabel);

		btnReport = new JxButton(0.4f);
		btnReport.setForeground(DEF_COLOR);
		btnReport.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if ("Progress Notes".equalsIgnoreCase(head)) {
					doProgressNotesReport();
					dispose();
				}
			}
		});
		btnReport.setBackground(Color.WHITE);
		btnReport.setText("Report");
		btnReport.setBounds(145, 410, 95, 24);
		panel.add(btnReport);

		dcTo = new JDateChooser();
		dcTo.setDateFormatString("MM/dd/yyyy");
		dcTo.setMaxSelectableDate(MedrexClientManager.getServerTime());
		dcTo.setBounds(250, 30, 102, 20);
		panel.add(dcTo);

		final JLabel chooseDischargeDateLabel = new JLabel();
		chooseDischargeDateLabel.setHorizontalAlignment(SwingConstants.CENTER);
		chooseDischargeDateLabel.setForeground(DEF_COLOR);
		chooseDischargeDateLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		chooseDischargeDateLabel.setText(head);
		chooseDischargeDateLabel.setBounds(35, 5, 317, 20);
		panel.add(chooseDischargeDateLabel);

		final JxPanel panelTemplateCategory = new JxPanel();
		panelTemplateCategory.setLayout(new BorderLayout());
		panelTemplateCategory.setArc(0f);
		panelTemplateCategory.setForeground(Color.WHITE);
		panelTemplateCategory.setBounds(60, 104, 292, 300);
		panelTemplateCategory.setLinearGradient(new Color(255, 255, 255),
				new Color(255, 255, 255), Direction.TOP_LEFT_TO_BOTTOM_RIGHT);
		panel.add(panelTemplateCategory);

		templateCategoryList = new JList();
		// Use a CheckListRenderer (see below)
		// to renderer list cells

		templateCategoryList.setCellRenderer(new CheckListRenderer());
		templateCategoryList
				.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		// Add a mouse listener to handle changing selection

		templateCategoryList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent event) {
				JList list = (JList) event.getSource();

				// Get index of item clicked

				int index = list.locationToIndex(event.getPoint());
				CheckListItem item = (CheckListItem) list.getModel()
						.getElementAt(index);

				// Toggle selected state

				item.setSelected(!item.isSelected());
				// Repaint cell

				list.repaint(list.getCellBounds(index, index));
			}
		});
		templateCategoryList.setPreferredSize(new Dimension(200, 190));
		templateCategoryList.setForeground(SystemColor.desktop);
		templateCategoryList.setFont(new Font("", Font.BOLD, 12));

		final JScrollPane templateCategoryScrollPane = new JScrollPane();
		panelTemplateCategory.add(templateCategoryScrollPane);
		templateCategoryScrollPane.setBorder(new LineBorder(
				SystemColor.desktop, 0, false));
		templateCategoryScrollPane.setViewportView(templateCategoryList);

		final JLabel chooseNotesTypeLabel = new JLabel();
		chooseNotesTypeLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		chooseNotesTypeLabel.setForeground(DEF_COLOR);
		chooseNotesTypeLabel.setText("Choose Notes Type");
		chooseNotesTypeLabel.setBounds(60, 68, 292, 20);
		panel.add(chooseNotesTypeLabel);

		updateData();
	}

	public void doProgressNotesReport() {
		List<Notes> notesList = null;
		List<NotesReport> notesReportList = new ArrayList<NotesReport>();
		if (dcFrom.getDate() != null && dcTo.getDate() != null) {
			new ArrayList<CensusCountReport>();

			List<NotesCategories> selectedNotesCat = new ArrayList<NotesCategories>();
			for (int i = 0; i < notesCatList.size(); i++) {
				NotesCategories notesCat = notesCatList.get(i);
				CheckListItem item = checkListItems[i];
				if (item.isSelected()) {
					selectedNotesCat.add(notesCat);
				}
			}
			ResidentMain resmain = null;
			if (!("".equalsIgnoreCase(head))) {
				try {
					notesList = MedrexClientManager.getInstance()
							.getSelectedNotesAccToFrmAndCategories(head,
									selectedNotesCat, residentId,
									dcFrom.getDate(), dcTo.getDate());
					resmain = MedrexClientManager.getInstance().getResident(
							residentId);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (MedrexException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for (Notes n : notesList) {
					NotesReport nr = new NotesReport();
					String str = (n.getNoteText()).replaceAll("\\<.*?>", "");
					nr.setNoteText(str.trim());
					notesReportList.add(nr);
					// System.out.println("Text: "+ n.getNoteText());
				}
				DateFormat df1 = new SimpleDateFormat("MM/dd/yyyy");
				String strdFrom = df1.format(dcFrom.getDate());
				String strdTo = df1.format(dcTo.getDate());
				// notes
				JRBeanArrayDataSource notesDataSource;
				Object[] notesReportRows = notesReportList.toArray();
				notesDataSource = new JRBeanArrayDataSource(notesReportRows);

				Map parameter1 = new HashMap();
				parameter1.put("fromDate", strdFrom);
				parameter1.put("toDate", strdTo);
				parameter1.put("resdentName", resmain.getUserPass() + ", "
						+ resmain.getUserName());
				parameter1.put("formName", head);
				parameter1.put("notesDataSource", notesDataSource);
				try {
					JasperFillManager.fillReportToFile(
							"report//notes//residentNotes.jasper", parameter1,
							new JREmptyDataSource());
					String strPrintData = "report//notes//report name.jrprint";
					JasperPrint jasperPrint = (JasperPrint) JRLoader
							.loadObject(strPrintData);
					MedrexReportViewer aViwer = new MedrexReportViewer(
							jasperPrint);
					aViwer.setExportDataFile(strPrintData);
					if (aViwer != null) {
						JFrame aFrame = new JFrame("Report Viewer");
						aFrame.getContentPane().add(aViwer);
						java.awt.Dimension screenSize = java.awt.Toolkit
								.getDefaultToolkit().getScreenSize();
						aFrame.setSize(screenSize.width / 2,
								screenSize.height / 2);
						java.awt.Insets insets = aFrame.getInsets();
						aFrame.setSize(aFrame.getWidth() + insets.left
								+ insets.right, aFrame.getHeight() + insets.top
								+ insets.bottom + 20);
						aFrame.setLocation((screenSize.width - aFrame
								.getWidth()) / 2, (screenSize.height - aFrame
								.getHeight()) / 2);
						aFrame.setVisible(true);
						aFrame.show();
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}

		} else {
			JOptionPane.showMessageDialog(null,
					"Please select Start and End date");
		}
	}

	private void updateData() {
		notesCatList = new ArrayList<NotesCategories>();
		try {
			notesCatList = MedrexClientManager.getInstance()
					.getNotesCategories(head);
			// cmbCategories.removeAllItems();
			checkListItems = new CheckListItem[notesCatList.size()];
			for (int i = 0; i < notesCatList.size(); i++) {
				NotesCategories nc = notesCatList.get(i);
				// cmbCategories.addItem(nc);
				System.out.println("nc is : " + nc.toString());
				checkListItems[i] = new CheckListItem(nc.toString());
				System.out.println("checkListItems" + checkListItems[i]);

			}
			DefaultListModel model = new DefaultListModel();
			for (CheckListItem item : checkListItems) {
				model.addElement(item);
			}
			templateCategoryList.setModel(model);

		} catch (Exception e) {
		}

	}
}

/**
 * for adding check boxes to the List of template category
 * 
 */
class CheckListItem {
	private String label;
	private boolean isSelected = false;

	public CheckListItem(String label) {
		this.label = label;
	}

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	@Override
	public String toString() {
		return label;
	}
}

class CheckListRenderer extends JCheckBox implements ListCellRenderer {
	/**
	 * 
	 */
	private static final long serialVersionUID = -399318884068671029L;

	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isSelected, boolean hasFocus) {
		setEnabled(list.isEnabled());
		setSelected(((CheckListItem) value).isSelected());
		setFont(list.getFont());
		setBackground(list.getBackground());
		setForeground(new Color(0, 78, 152));
		setText(value.toString());
		return this;
	}
}
