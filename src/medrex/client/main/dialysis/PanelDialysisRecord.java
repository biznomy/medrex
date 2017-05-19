package medrex.client.main.dialysis;

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
import medrex.client.constants.Global;
import medrex.client.main.scan.FrameScanFormAdd;
import medrex.client.test.ImageSlider;
import medrex.client.test.ThumbnailAdapter;
import medrex.client.utils.SwingUtils;
import medrex.client.utils.controls.FrameToolTip;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.dialysis.DialysisRecord;
import medrex.commons.vo.scan.ScanForm;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;

public class PanelDialysisRecord extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -29185829451100353L;

	private JxComboBox cmbFormType;

	private JxTable table;

	private DialysisRecordsJTableNew dialysisTable;

	public FrameDialysisRecordAdd frameDialysisRecordAdd;
	private ImageSlider imgSlider;
	private String[] formName = new String[] { "Renal Dialysis Communication Form" };
	private ImageIcon[] formIcon;

	public FrameScanFormAdd frameScanFormAdd;
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);

	public PanelDialysisRecord() {
		super();
		Global.tabName = Global.currentResidentTabs.DIALYSIS.Name;
		setLayout(null);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(720, 496));
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
		dialysisTable = new DialysisRecordsJTableNew();
		table.setModel(dialysisTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					int id = (Integer) dialysisTable.getValueAt(table
							.getSelectedRow(), 5);

					if (id != -1 && id != 0) {
						String formName = dialysisTable.getValueAt(table
								.getSelectedRow(), 1)
								+ "";
						Global.currentDialysisRecordForm = formName;

						Global.currentDialysisRecordKey = id;
						frameDialysisRecordAdd = (FrameDialysisRecordAdd) FrameFactory
								.createWindowOfType(FrameDialysisRecordAdd.class);
						SwingUtils.center(frameDialysisRecordAdd);
						frameDialysisRecordAdd
								.setTitle("View/Update Dialysis Record");
						frameDialysisRecordAdd.setModal(true);
						frameDialysisRecordAdd.setVisible(true);
					}

					else {

					}
					updateDialysisRecordJTable();
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
		btnAdd.setFont(new Font("", Font.BOLD, 12));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				Global.currentDialysisRecordKey = 0;
				Global.currentRenalDialysisCommunicationFormKey = 0;

				Global.currentDialysisRecordForm = (String) cmbFormType
						.getSelectedItem();

				frameDialysisRecordAdd = (FrameDialysisRecordAdd) FrameFactory
						.createWindowOfType(FrameDialysisRecordAdd.class);
				SwingUtils.center(frameDialysisRecordAdd);
				frameDialysisRecordAdd.setTitle("Add New Dialysis Record");
				frameDialysisRecordAdd.setModal(true);
				frameDialysisRecordAdd.setVisible(true);
				updateDialysisRecordJTable();
			}
		});
		btnAdd.setText("Add New");
		btnAdd.setBounds(20, 248, 84, 26);
		panel.add(btnAdd);

		final JxButton btnView = new JxButton(0.4f);
		btnView.setBackground(Color.WHITE);
		btnView.setForeground(DEF_COL);
		btnView.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					int id = (Integer) dialysisTable.getValueAt(table
							.getSelectedRow(), 5);

					if (id != -1 && id != 0) {
						String formName = dialysisTable.getValueAt(table
								.getSelectedRow(), 1)
								+ "";
						Global.currentDialysisRecordForm = formName;
						Global.currentDialysisRecordKey = id;
						frameDialysisRecordAdd = (FrameDialysisRecordAdd) FrameFactory
								.createWindowOfType(FrameDialysisRecordAdd.class);
						SwingUtils.center(frameDialysisRecordAdd);
						frameDialysisRecordAdd
								.setTitle("View / update Dialysis Record");
						frameDialysisRecordAdd.setModal(true);
						frameDialysisRecordAdd.setVisible(true);
					}

					else {

					}
					updateDialysisRecordJTable();
				} catch (Exception ve) {
				}
			}
		});
		btnView.setFont(new Font("", Font.BOLD, 12));
		btnView.setText("View/Update");
		btnView.setBounds(387, 264, 104, 26);
		panel.add(btnView);

		final JxButton btnDelete = new JxButton(0.4f);
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setForeground(DEF_COL);
		btnDelete.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					int id = (Integer) dialysisTable.getValueAt(table
							.getSelectedRow(), 5);

					if (id != -1 && id != 0) {
						int formId = (Integer) dialysisTable.getValueAt(table
								.getSelectedRow(), 6);
						String formName = dialysisTable.getValueAt(table
								.getSelectedRow(), 1)
								+ "";
						if (formId != 0
								&& formName
										.equalsIgnoreCase("Renal Dialysis Communication Form")) {
							MedrexClientManager.getInstance()
									.deleteRenalDialysisCommunicationFormPage1(
											formId);
							MedrexClientManager.getInstance()
									.deleteRenalDialysisCommunicationFormPage2(
											formId);
						}
						MedrexClientManager.getInstance().deleteDialysisRecord(
								id);
						Global.currentDialysisRecordKey = 0;
						Global.currentRenalDialysisCommunicationFormKey = 0;
						Global.currentRenalDialysisCommunicationFormPage2Key = 0;
					} else {
						String file = (String) dialysisTable.getValueAt(table
								.getSelectedRow(), 7);
						MedrexClientManager.getInstance().deleteScanForm(
								Global.currentResidenceKey,
								Global.currentResidentTabs.DIALYSIS.Name, file);
						Global.currentScanFormImageFileName = null;
					}
					updateDialysisRecordJTable();

				} catch (Exception xe) {

				}

			}
		});
		btnDelete.setFont(new Font("", Font.BOLD, 12));
		btnDelete.setText("Delete");
		btnDelete.setBounds(505, 264, 104, 26);
		panel.add(btnDelete);

		final JxButton btnCancel = new JxButton(0.4f);
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setForeground(DEF_COL);
		btnCancel.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.setText("Cancel");
		btnCancel.setBounds(622, 264, 77, 26);
		panel.add(btnCancel);

		final JLabel residentInformationLabel = new JLabel();
		residentInformationLabel.setForeground(DEF_COL);
		residentInformationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		residentInformationLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		residentInformationLabel.setText("DIALYSIS RECORDS");
		residentInformationLabel.setBounds(10, 10, 700, 30);
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
		scanNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				Global.currentScanFormImageFileName = null;
				frameScanFormAdd = (FrameScanFormAdd) FrameFactory
						.createWindowOfType(FrameScanFormAdd.class);
				SwingUtils.center(frameScanFormAdd);
				frameScanFormAdd.setTitle("Add New scanning Record");
				frameScanFormAdd.setModal(true);
				frameScanFormAdd.setVisible(true);
				frameScanFormAdd = null;
				updateDialysisRecordJTable();
			}
		});
		scanNewButton.setFont(new Font("Dialog", Font.BOLD, 12));
		scanNewButton.setText("Scan New");
		scanNewButton.setBounds(20, 280, 84, 26);
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
						Global.currentDialysisRecordKey = 0;
						Global.currentDialysisRecordForm = formName[index];

						frameDialysisRecordAdd = (FrameDialysisRecordAdd) FrameFactory
								.createWindowOfType(FrameDialysisRecordAdd.class);
						SwingUtils.center(frameDialysisRecordAdd);
						frameDialysisRecordAdd
								.setTitle("Add New Dialysis Record");
						frameDialysisRecordAdd.setModal(true);
						frameDialysisRecordAdd.setVisible(true);
						updateDialysisRecordJTable();

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

	protected void doUpdate() {
		updateDialysisRecordJTable();
	}

	public void fillCombos() {
		String[] imgPath = new String[] { "RenalDialysisCommunicationForm.png" };

		cmbFormType.setModel(new javax.swing.DefaultComboBoxModel(formName));

		formIcon = new ImageIcon[imgPath.length];
		for (int i = 0; i < imgPath.length; i++) {
			BufferedImage img = new BufferedImage(100, 100,
					BufferedImage.TYPE_INT_RGB);
			try {
				img = ImageIO.read(new File("img/formThumbnails/Dialysis/"
						+ imgPath[i]));
				formIcon[i] = new ImageIcon(img);
				imgSlider.insertElement(img, formName[i]);

			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
		}

	}

	public void updateDialysisRecordJTable() {
		List<DialysisRecord> dialysisRecords = new ArrayList<DialysisRecord>();

		if (Global.currentResidenceKey != 0) {
			try {
				dialysisRecords = MedrexClientManager.getInstance()
						.getDialysisRecords(Global.currentResidenceKey);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		dialysisTable.setNewList(dialysisRecords);
		dialysisTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}
}

class DialysisRecordsJTableNew extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3834182748034921808L;

	private String[] columnNames = { "Date Created", "Form Type",
			"Last Modified", "Status", "User" };

	public List<DialysisRecord> DialysisRecords;

	int n = 0;

	DialysisRecordsJTableNew(List<DialysisRecord> dialysisRecords) {
		DialysisRecords = dialysisRecords;
	}

	DialysisRecordsJTableNew() {
		DialysisRecords = new ArrayList<DialysisRecord>();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (DialysisRecords.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List<DialysisRecord> dialysisRecords) {
		DialysisRecords = dialysisRecords;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {

			Object o = DialysisRecords.get(row);
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MM / dd / yyyy  hh:mm a");
			if (o instanceof DialysisRecord) {
				DialysisRecord dialysisRecord = (DialysisRecord) o;

				if (col == 0) {
					return (df.format(dialysisRecord.getDateCreated())); // +
					// "");
				}
				if (col == 1) {
					return (dialysisRecord.getFormType());
				}
				if (col == 2) {
					return (df.format(dialysisRecord.getLastModified())); // +
					// "");
				}
				if (col == 3) {
					return (dialysisRecord.getStatus()); // + "");
				}
				if (col == 4) {
					return (dialysisRecord.getUser());
				}
				if (col == 5) {
					return (dialysisRecord.getSerial()); // + "");
				}
				if (col == 6) {
					return (dialysisRecord.getFormId());
				}
				return ("");
			} else {
				ScanForm rc = (ScanForm) o;
				if (col == 0) {
					return df.format(rc.getDateCreated()) + "";
				}
				if (col == 1) {
					return rc.getScanFormType();
				}
				if (col == 2) {
					return ("");
				}
				if (col == 3) {
					return ("Completed");
				}
				if (col == 4) {
					return "";
				}
				if (col == 5) {
					return (rc.getSerial());
				}
				if (col == 6) {
					return rc.getFileName();
				}
				if (col == 7) {
					return rc.getFileName();
				}

				return ("");

			}
		}

		catch (Exception e) {
			return ("");
		}

	}
}
