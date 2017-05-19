package medrex.client.main.nursesNote;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.scan.FrameScanFormAdd;
import medrex.client.test.ImageSlider;
import medrex.client.test.ThumbnailAdapter;
import medrex.client.utils.SwingUtils;
import medrex.client.utils.controls.FrameToolTip;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.nursesNotes.NursesNotesRecord;
import medrex.commons.vo.others.Users;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;

public class PaneNursesNoteRecord extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6553803626845088756L;
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);

	public JxComboBox cmbFormType;
	private JxTable table;
	private NursesNotesJTable nursesNotesTable;
	public FrameScanFormAdd frameScanFormAdd;
	public FrameNursesNotesRecordAdd frameNursesNoteRecordAdd;

	private ImageSlider imgSlider;
	private String[] formName = new String[] { "Daily Skilled Nurses Notes" };
	private ImageIcon[] formIcon;

	/**
	 * Create the panel
	 */
	public PaneNursesNoteRecord() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(718, 448));
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});

		final JxPanel panel = new JxPanel(1f);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 20, 720, 466);
		add(panel);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 52, 680, 186);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(DEF_COL, 1, false));
		panel.add(scrollPane);

		table = new JxTable();
		nursesNotesTable = new NursesNotesJTable();
		table.setModel(nursesNotesTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {

					int id = 0, formId = 0;
					id = new Integer((String) nursesNotesTable.getValueAt(table
							.getSelectedRow(), 5)).intValue();
					formId = new Integer((String) nursesNotesTable.getValueAt(
							table.getSelectedRow(), 6)).intValue();
					String formName = table.getValueAt(table.getSelectedRow(),
							1)
							+ "";
					Global.currentNursesNotesForm = formName;
					if (id != -1 && formId != -1) {
						// System.out.println("id is"+id);
						Global.currentNursesNotesRecordKey = id;
						Global.currentDailySkilledNursesNotesKey = formId;
						frameNursesNoteRecordAdd = new FrameNursesNotesRecordAdd();
						SwingUtils.center(frameNursesNoteRecordAdd);
						frameNursesNoteRecordAdd
								.setTitle("View/Update Nurses Notes Record");
						frameNursesNoteRecordAdd.setModal(true);
						frameNursesNoteRecordAdd.setVisible(true);
					} else {

						File scannedFile = (File) nursesNotesTable.getValueAt(
								table.getSelectedRow(), 6);
						Global.currentScanFormMode = true;
						Global.currentScanFormname = scannedFile
								.getAbsolutePath();
						frameScanFormAdd = (FrameScanFormAdd) FrameFactory
								.createWindowOfType(FrameScanFormAdd.class);
						SwingUtils.center(frameScanFormAdd);
						frameScanFormAdd.setTitle("View Scan Record");
						frameScanFormAdd.setModal(true);
						frameScanFormAdd.setVisible(true);
					}
					updateNursesNotesRecordJTable();
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
		btnAdd.setBounds(20, 248, 84, 26);
		btnAdd.setFont(new Font("", Font.BOLD, 12));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.currentDailySkilledNursesNotesKey = 0;
				Global.currentDailySkilledNursesNotesForm2Key = 0;
				Global.currentDailySkilledNursesNotesKey = 0;
				Global.currentNursesNotesRecordKey = 0;
				Global.currentNursesNotesPageNo = 0;

				Global.currentNursesNotesForm = (String) cmbFormType
						.getSelectedItem();
				frameNursesNoteRecordAdd = new FrameNursesNotesRecordAdd();
				SwingUtils.center(frameNursesNoteRecordAdd);
				frameNursesNoteRecordAdd
						.setTitle("Add New Nurses Notes Record");
				frameNursesNoteRecordAdd.setModal(true);
				frameNursesNoteRecordAdd.setVisible(true);
				updateNursesNotesRecordJTable();

			}
		});
		btnAdd.setText("Add New");
		panel.add(btnAdd);

		final JxButton btnView = new JxButton(0.4f);
		btnView.setBackground(Color.WHITE);
		btnView.setForeground(DEF_COL);
		btnView.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnView.setBounds(436, 264, 111, 26);
		btnView.setFont(new Font("", Font.BOLD, 12));
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				try {
					int id = 0, formId = 0;
					id = new Integer((String) nursesNotesTable.getValueAt(table
							.getSelectedRow(), 5)).intValue();
					formId = new Integer((String) nursesNotesTable.getValueAt(
							table.getSelectedRow(), 6)).intValue();
					String formName = table.getValueAt(table.getSelectedRow(),
							1)
							+ "";
					Global.currentNursesNotesForm = formName;

					if (id != -1 && formId != -1) {
						Global.currentNursesNotesRecordKey = id;
						Global.currentDailySkilledNursesNotesKey = formId;

						frameNursesNoteRecordAdd = new FrameNursesNotesRecordAdd();
						SwingUtils.center(frameNursesNoteRecordAdd);
						frameNursesNoteRecordAdd
								.setTitle("View/Update Nurses Notes Record");
						frameNursesNoteRecordAdd.setModal(true);
						frameNursesNoteRecordAdd.setVisible(true);
					} else {
						File scannedFile = (File) nursesNotesTable.getValueAt(
								table.getSelectedRow(), 6);
						Global.currentScanFormMode = true;
						Global.currentScanFormname = scannedFile
								.getAbsolutePath();
						frameScanFormAdd = (FrameScanFormAdd) FrameFactory
								.createWindowOfType(FrameScanFormAdd.class);
						SwingUtils.center(frameScanFormAdd);
						frameScanFormAdd.setTitle("View Scan Record");
						frameScanFormAdd.setModal(true);
						frameScanFormAdd.setVisible(true);
					}
					updateNursesNotesRecordJTable();
				} catch (Exception ve) {
					ve.printStackTrace();
				}
			}
		});
		btnView.setText("View / Update");
		panel.add(btnView);

		final JxButton btnDelete = new JxButton(0.4f);
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setForeground(DEF_COL);
		btnDelete.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnDelete.setBounds(553, 264, 70, 26);
		btnDelete.setFont(new Font("", Font.BOLD, 12));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					int id = new Integer((String) nursesNotesTable.getValueAt(
							table.getSelectedRow(), 5)).intValue();
					int formId = new Integer((String) nursesNotesTable
							.getValueAt(table.getSelectedRow(), 6)).intValue();
					String formName = (String) nursesNotesTable.getValueAt(
							table.getSelectedRow(), 1);
					// System.out.println("formId: "+formId);
					if (id != -1) {
						if (formId != 0
								&& formName
										.equalsIgnoreCase("Daily Skilled Nurses Notes")) {
							MedrexClientManager.getInstance()
									.deleteNursesNotes(id);

						}
						MedrexClientManager.getInstance()
								.deleteDailySkilledNursesNotes(formId);
						MedrexClientManager
								.getInstance()
								.deleteDailySkilledNursesNotesRow(
										MedrexClientManager
												.getInstance()
												.getDailySkilledNursesNotesForm2(
														formId).getSerial());
						MedrexClientManager.getInstance()
								.deleteDailySkilledNursesNotesForm2(formId);
						Global.currentDailySkilledNursesNotesKey = 0;
						Global.currentDailySkilledNursesNotesForm2Key = 0;
						Global.currentDailySkilledNursesNotesKey = 0;
						Global.currentNursesNotesRecordKey = 0;
						Global.currentNursesNotesPageNo = 0;

					} else {
						File scannedFile = (File) nursesNotesTable.getValueAt(
								table.getSelectedRow(), 6);

						scannedFile.delete();

					}
					updateNursesNotesRecordJTable();

				} catch (Exception xe) {

				}

			}
		});
		btnDelete.setText("Delete");
		panel.add(btnDelete);

		final JxButton btnCancel = new JxButton(0.4f);
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setForeground(DEF_COL);
		btnCancel.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.setText("Cancel");
		btnCancel.setBounds(629, 264, 70, 26);
		panel.add(btnCancel);

		final JLabel residentInformationLabel = new JLabel();
		residentInformationLabel.setForeground(DEF_COL);
		residentInformationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		residentInformationLabel.setBounds(10, 10, 700, 30);
		residentInformationLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		residentInformationLabel.setText("NURSE SUMMARY");
		panel.add(residentInformationLabel);

		cmbFormType = new JxComboBox();
		cmbFormType.setBackground(Color.WHITE);
		cmbFormType.setArc(0.4f);
		cmbFormType.setForeground(DEF_COL);
		cmbFormType.setBorder(new LineBorder(BORDER_COL, 1, false));
		cmbFormType.setBounds(110, 265, 249, 29);
		cmbFormType.setFont(new Font("Dialog", Font.BOLD, 12));
		panel.add(cmbFormType);

		final JxButton scanNewButton = new JxButton(0.4f);
		scanNewButton.setBackground(Color.WHITE);
		scanNewButton.setForeground(DEF_COL);
		scanNewButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		scanNewButton.setBounds(20, 280, 84, 26);
		scanNewButton.setFont(new Font("", Font.BOLD, 12));
		scanNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {

				Global.currentScanFormname = (String) cmbFormType
						.getSelectedItem();
				Global.currentScanFormMode = false;
				frameScanFormAdd = (FrameScanFormAdd) FrameFactory
						.createWindowOfType(FrameScanFormAdd.class);
				SwingUtils.center(frameScanFormAdd);
				frameScanFormAdd.setTitle("Add New scanning Record");
				frameScanFormAdd.setModal(true);
				frameScanFormAdd.setVisible(true);
				updateNursesNotesRecordJTable();
			}
		});
		scanNewButton.setText("Scan New");
		panel.add(scanNewButton);

		imgSlider = new ImageSlider();
		imgSlider.setBackground(GuiModes.DESIGNER_FORMS
				.getDefaultBackgroundColor()); //
		imgSlider.setBorder(new LineBorder(BORDER_COL, 1, false));
		imgSlider.setNormalSize(128);
		imgSlider.setBounds(20, 312, 680, 144);

		imgSlider.addThumbnailListener(new ThumbnailAdapter() {
			final FrameToolTip frameTooltip = new FrameToolTip("", null, null);

			@Override
			public void thumbnailClicked(final int index, MouseEvent e) {
			}

			@Override
			public void thumbnailMouseOver(final int index, MouseEvent e) {

				final ActionListener alistener = new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Global.currentNursesNotesRecordKey = 0;
						Global.currentNursesNotesForm = formName[index];
						Global.currentDailySkilledNursesNotesKey = 0;

						frameNursesNoteRecordAdd = new FrameNursesNotesRecordAdd();
						SwingUtils.center(frameNursesNoteRecordAdd);
						frameNursesNoteRecordAdd
								.setTitle("Add New Nurse Record");
						frameNursesNoteRecordAdd.setModal(true);
						frameNursesNoteRecordAdd.setVisible(true);
						updateNursesNotesRecordJTable();
					}
				};

				frameTooltip.setHeading(formName[index]);
				frameTooltip.setPreviewImage(formIcon[index]);
				frameTooltip.setActionListener(alistener);
				frameTooltip.setModal(false);

				Point pt = imgSlider.getLocationOnScreen();
				frameTooltip.setLocation(e.getXOnScreen()
						- (frameTooltip.getWidth() / 2), pt.y
						- frameTooltip.getHeight());

				frameTooltip.setVisible(true);

			}

			@Override
			public void thumbnailMouseOut(int index, MouseEvent e) {
				if (!frameTooltip.hasFocus() && !frameTooltip.isFocusOwner()) {
					frameTooltip.setVisible(false);
				}
			}
		});
		panel.add(imgSlider);
		fillCombos();

	}

	public void doUpdate() {
		updateNursesNotesRecordJTable();
	}

	public void fillCombos() {
		String[] imgPath = new String[] { "DailySkilledNurses.png" };

		cmbFormType.setModel(new DefaultComboBoxModel(
				new String[] { "Daily Skilled Nurses Notes" }));

		formIcon = new ImageIcon[imgPath.length];
		for (int i = 0; i < imgPath.length; i++) {
			BufferedImage img = new BufferedImage(100, 100,
					BufferedImage.TYPE_INT_RGB);
			try {
				img = ImageIO.read(new File("img/formThumbnails/NursesNotes/"
						+ imgPath[i]));
				formIcon[i] = new ImageIcon(img);
				imgSlider.insertElement(img, formName[i]);

			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
		}

	}

	public void updateNursesNotesRecordJTable() {
		List<NursesNotesRecord> nursesNotesRec = new ArrayList<NursesNotesRecord>();
		File[] f = null;

		if (Global.currentResidenceKey != 0) {
			try {

				nursesNotesRec = MedrexClientManager.getInstance()
						.getNursesNotesRecords(Global.currentResidenceKey);

			} catch (Exception e) {
			}
		}

		if (f != null) {
			for (int i = 0; i < f.length; i++) {
				if (f[i].getAbsolutePath().endsWith(".jpg")) {
					// monthlyRec.add(f[i]);
				} else {
					// System.out.println(f[i].getAbsolutePath());
				}
			}
		}

		nursesNotesTable.setNewList(nursesNotesRec);
		nursesNotesTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}

}

class NursesNotesJTable extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6727451490460591845L;

	private String[] columnNames = { "Date Created", "Form Type",
			"Last Modified", "Status", "User" };

	public List<NursesNotesRecord> nursesNotesRecords;

	int n = 0;

	NursesNotesJTable(List<NursesNotesRecord> nNotesRecords) {
		nursesNotesRecords = nNotesRecords;

	}

	NursesNotesJTable() {
		nursesNotesRecords = new ArrayList<NursesNotesRecord>();

	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (nursesNotesRecords.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List<NursesNotesRecord> nNotesRec) {
		nursesNotesRecords = nNotesRec;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			Object o = nursesNotesRecords.get(row);
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MM / dd / yyyy  hh:mm a");
			if (o instanceof NursesNotesRecord) {
				NursesNotesRecord rc = (NursesNotesRecord) o;
				if (col == 0) {
					return (df.format(rc.getDateCreated()) + "");
				}
				if (col == 1) {
					return (rc.getFormType());
				}
				if (col == 2) {
					return (df.format(rc.getLastModified()) + "");
				}
				if (col == 3) {
					return (rc.getStatus() + "");
				}
				if (col == 4) {
					Users users = new Users();
					users = MedrexClientManager.getInstance().getUser(
							Global.currentLoggedInUserKey);
					return (users.getUserType());
				}
				if (col == 5) {
					return (rc.getSerial() + "");
				}
				if (col == 6) {
					return (rc.getFormId() + "");
				}

				return ("");

			} else {
				File rc = (File) o;
				if (col == 0) {
					return (df.format(new Date(rc.lastModified())) + "");
				}
				if (col == 1) {
					String[] fPart = rc.getName().split("-");
					return (fPart[0].replaceAll("_", " "));
				}
				if (col == 2) {
					return (df.format(new Date(rc.lastModified())) + "");
				}
				if (col == 3) {
					return ("Completed");
				}
				if (col == 4) {
					Users users = new Users();
					users = MedrexClientManager.getInstance().getUser(
							Global.currentLoggedInUserKey);
					return (users.getUserType());

				}
				if (col == 5) {
					return "-1";

				}
				if (col == 6) {
					return rc;
				}

				return ("");

			}
		} catch (Exception e) {
			return ("");
		}

	}
}
