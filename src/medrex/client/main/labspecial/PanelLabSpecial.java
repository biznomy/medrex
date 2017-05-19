package medrex.client.main.labspecial;

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
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.FormSchedulerConstants;
import medrex.client.constants.Global;
import medrex.client.constants.GlobalSecurity;
import medrex.client.main.scan.FrameScanFormAdd;
import medrex.client.test.ImageSlider;
import medrex.client.test.ThumbnailAdapter;
import medrex.client.utils.SwingUtils;
import medrex.client.utils.controls.FrameToolTip;
import medrex.commons.enums.GuiModes;
import medrex.commons.enums.SubAppTypes;
import medrex.commons.vo.labSpecial.LabSpecial;
import medrex.commons.vo.others.Users;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;

public class PanelLabSpecial extends JPanel {

	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);

	private JxComboBox cmbFormType;
	private static final long serialVersionUID = 1L;
	private JxTable table;
	private LabJTable labTable;
	public FrameLabSpecialAdd frameLabSpecialAdd;
	public FrameScanFormAdd frameScanFormAdd;
	private ImageSlider imgSlider;
	private String[] formName = new String[] { "Reason For Study Form",
			"Medfax Form 1", "Medfax Form 2" };
	private ImageIcon[] formIcon;

	/**
	 * Create the panel
	 */
	public PanelLabSpecial() {
		super();
		// Global.panelLabSpecial=this;
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
		labTable = new LabJTable();
		table.setModel(labTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					int id = new Integer((String) labTable.getValueAt(table
							.getSelectedRow(), 5)).intValue();

					if (id != -1) {
						Global.currentLabSpecialKey = id;

						frameLabSpecialAdd = (FrameLabSpecialAdd) FrameFactory
								.createWindowOfType(FrameLabSpecialAdd.class);
						SwingUtils.center(frameLabSpecialAdd);
						frameLabSpecialAdd.setTitle("View/Update Lab Record");
						frameLabSpecialAdd.setModal(true);
						frameLabSpecialAdd.setVisible(true);
					} else {
						File scannedFile = (File) labTable.getValueAt(table
								.getSelectedRow(), 6);

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
					updateLabSpecialJTable();
				} else if (evt.getClickCount() == 1) {
					System.out.println("single click");
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
				if (GlobalSecurity
						.isUpdatePriviledge(SubAppTypes.LAB_SPECIAL_REPORTS)) {
					Global.currentLabSpecialKey = 0;
					Global.currentLabSpecialForm = (String) cmbFormType
							.getSelectedItem();
					frameLabSpecialAdd = (FrameLabSpecialAdd) FrameFactory
							.createWindowOfType(FrameLabSpecialAdd.class);
					SwingUtils.center(frameLabSpecialAdd);
					frameLabSpecialAdd.setTitle("Add New Lab Record");
					frameLabSpecialAdd.setModal(true);
					frameLabSpecialAdd.setVisible(true);
					updateLabSpecialJTable();
				}
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
					int id = new Integer((String) labTable.getValueAt(table
							.getSelectedRow(), 5)).intValue();

					if (id != -1) {
						Global.currentLabSpecialKey = id;

						frameLabSpecialAdd = (FrameLabSpecialAdd) FrameFactory
								.createWindowOfType(FrameLabSpecialAdd.class);
						SwingUtils.center(frameLabSpecialAdd);
						frameLabSpecialAdd.setTitle("View/Update Lab Record");
						frameLabSpecialAdd.setModal(true);
						frameLabSpecialAdd.setVisible(true);
					} else {

						File scannedFile = (File) labTable.getValueAt(table
								.getSelectedRow(), 6);
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
					updateLabSpecialJTable();
				} catch (Exception ve) {
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
					int id = new Integer((String) labTable.getValueAt(table
							.getSelectedRow(), 5)).intValue();
					int formId = new Integer((String) labTable.getValueAt(table
							.getSelectedRow(), 6)).intValue();
					String formType = (String) labTable.getValueAt(table
							.getSelectedRow(), 1);
					if (id != -1) {
						if (formId != 0
								&& formType
										.equals(FormSchedulerConstants.MEDFAX_FORM_1)) {
							MedrexClientManager.getInstance().deleteMadexForm1(
									formId);
						}
						if (formId != 0
								&& formType
										.equals(FormSchedulerConstants.MEDFAX_FORM_2)) {
							MedrexClientManager.getInstance().deleteMadexForm2(
									formId);
						}
						if (formId != 0
								&& formType
										.equals(FormSchedulerConstants.REASON_FOR_STUDY_FORM)) {
							MedrexClientManager.getInstance()
									.deleteReasonForStudy(formId);
						}
						MedrexClientManager.getInstance().deleteLabSpecial(id);
						Global.currentLabSpecialKey = 0;
						Global.currentLabReasonFormKey = 0;
						Global.currentMadexForm1Key = 0;
						Global.currentMadexForm2Key = 0;
					} else {

						File scannedFile = (File) labTable.getValueAt(table
								.getSelectedRow(), 6);

						scannedFile.delete();

					}
					updateLabSpecialJTable();

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
		residentInformationLabel.setText("LAB & SPECIAL REPORTS");
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
				updateLabSpecialJTable();
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
				if (GlobalSecurity
						.isUpdatePriviledge(SubAppTypes.MEDICATION_TREATMENT)) {
					final ActionListener alistener = new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Global.currentLabSpecialKey = 0;
							Global.currentLabSpecialForm = formName[index];
							// Global.currentResidentAssessmentFormKey = 0;

							frameLabSpecialAdd = (FrameLabSpecialAdd) FrameFactory
									.createWindowOfType(FrameLabSpecialAdd.class);
							SwingUtils.center(frameLabSpecialAdd);
							frameLabSpecialAdd
									.setTitle("Add New Lab & Special");
							frameLabSpecialAdd.setModal(true);
							frameLabSpecialAdd.setVisible(true);
							updateLabSpecialJTable();
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
		updateLabSpecialJTable();
	}

	public void openNewForm(String formName) {
		Global.currentLabSpecialKey = 0;
		Global.currentLabSpecialForm = formName;
		frameLabSpecialAdd = (FrameLabSpecialAdd) FrameFactory
				.createWindowOfType(FrameLabSpecialAdd.class);
		SwingUtils.center(frameLabSpecialAdd);
		frameLabSpecialAdd.setTitle("Add New Lab Record");
		frameLabSpecialAdd.setModal(true);
		frameLabSpecialAdd.setVisible(true);
		updateLabSpecialJTable();
	}

	public void fillCombos() {
		String[] imgPath = new String[] { "ReasonForStudyForm.png",
				"MedfaxForm1.png", "MedfaxForm2.png" };

		cmbFormType.setModel(new javax.swing.DefaultComboBoxModel(formName));

		formIcon = new ImageIcon[imgPath.length];
		for (int i = 0; i < imgPath.length; i++) {
			BufferedImage img = new BufferedImage(100, 100,
					BufferedImage.TYPE_INT_RGB);
			try {
				img = ImageIO.read(new File("img/formThumbnails/Lab Special/"
						+ imgPath[i]));
				formIcon[i] = new ImageIcon(img);
				imgSlider.insertElement(img, formName[i]);

			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
		}

	}

	public void updateLabSpecialJTable() {
		List labRecords = new ArrayList();
		File[] f = null;
		if (Global.currentResidenceKey != 0) {
			try {
				labRecords = MedrexClientManager.getInstance().getLabSpecials(
						Global.currentResidenceKey);
				java.io.File currentDir = new java.io.File("");

				f = new File(
						currentDir.getAbsolutePath()
								+ "\\scans\\"
								+ Global.currentResidenceKey
								+ "\\"
								+ medrex.commons.enums.ResidentTabs.LAB_AND_SPECIAL_REPORTS.Name
								+ "\\").listFiles();

			} catch (Exception e) {

			}
		}

		if (f != null) {
			for (int i = 0; i < f.length; i++) {
				if (f[i].getAbsolutePath().endsWith(".jpg")) {
					labRecords.add(f[i]);
				} else {
					System.out.println(f[i].getAbsolutePath());
				}
			}
		}
		Collections.sort(labRecords, new Comparator() {
			// +1 if a > b
			// 0 if a = b
			// -1 if a < b
			public int compare(final Object a, final Object b) {
				Date aDate, bDate;
				aDate = (a instanceof LabSpecial) ? ((LabSpecial) a)
						.getDateCreated() : new Date(((File) a).lastModified());
				bDate = (b instanceof LabSpecial) ? ((LabSpecial) b)
						.getDateCreated() : new Date(((File) b).lastModified());

				if (aDate.getTime() == bDate.getTime()) {
					return 0;
				} else
					return (aDate.getTime() > bDate.getTime()) ? 1 : -1;
			}
		});

		labTable.setNewList(labRecords);
		labTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}

}

class LabJTable extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "Date Created", "Form Type",
			"Last Modified", "Status", "User" };

	public List labsRecords;

	int n = 0;

	LabJTable(List labRecords) {
		labsRecords = labRecords;
	}

	LabJTable() {
		labsRecords = new ArrayList();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (labsRecords.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List labRecords) {
		labsRecords = labRecords;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {

			Object o = labsRecords.get(row);
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MM / dd / yyyy");
			if (o instanceof LabSpecial) {
				LabSpecial rc = (LabSpecial) o;

				if (col == 0) {
					return (df.format(rc.getDateCreated()));
				}
				if (col == 1) {
					return (rc.getFormType());
				}
				if (col == 2) {
					return (df.format(rc.getLastModified()));
				}
				if (col == 3) {
					return (rc.getStatus() + "");
				}
				if (col == 4) {
					return (rc.getUser() + "");
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
					return (df.format(new Date(rc.lastModified()) + ""));
				}
				if (col == 1) {
					String[] fPart = rc.getName().split("-");
					return (fPart[0].replaceAll("_", " "));
				}
				if (col == 2) {
					return (df.format(new Date(rc.lastModified()) + ""));
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
