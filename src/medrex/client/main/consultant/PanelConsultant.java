package medrex.client.main.consultant;

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
import medrex.client.constants.GlobalSecurity;
import medrex.client.main.scan.FrameScanFormAdd;
import medrex.client.test.ImageSlider;
import medrex.client.test.ThumbnailAdapter;
import medrex.client.utils.SwingUtils;
import medrex.client.utils.controls.FrameToolTip;
import medrex.commons.enums.GuiModes;
import medrex.commons.enums.SubAppTypes;
import medrex.commons.vo.consultant.Consultant;
import medrex.commons.vo.scan.ScanForm;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;

public class PanelConsultant extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5594472781936341085L;
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);

	private JxComboBox cmbFormType;
	private JxTable table;
	private ConsultantsJTable consultantTable;
	public FrameConsultantAdd frameConsultantAdd;
	public FrameScanFormAdd frameScanFormAdd;
	private ImageSlider imgSlider;
	private String[] formName = new String[] { "Referral Form",
			"Report of Consultation", "Pharmacist Resident Evaluation" };

	private ImageIcon[] formIcon;

	/**
	 * Create the panel
	 */
	public PanelConsultant() {
		super();
		Global.tabName = Global.currentResidentTabs.CONSULTANT.Name;
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
		consultantTable = new ConsultantsJTable();
		table.setModel(consultantTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					int id = new Integer((String) consultantTable.getValueAt(
							table.getSelectedRow(), 5)).intValue();

					if (id != -1 && id != 0) {
						Global.currentConsultantKey = id;

						frameConsultantAdd = (FrameConsultantAdd) FrameFactory
								.createWindowOfType(FrameConsultantAdd.class);
						SwingUtils.center(frameConsultantAdd);
						frameConsultantAdd.setTitle("View/Update Consultant");
						frameConsultantAdd.setModal(true);
						frameConsultantAdd.setVisible(true);

					} else {
						String file = (String) consultantTable.getValueAt(table
								.getSelectedRow(), 7);
						Global.currentScanFormImageFileName = file;

						frameScanFormAdd = (FrameScanFormAdd) FrameFactory
								.createWindowOfType(FrameScanFormAdd.class);
						SwingUtils.center(frameScanFormAdd);
						frameScanFormAdd.setTitle("View Scan Record");
						frameScanFormAdd.setModal(true);
						frameScanFormAdd.setVisible(true);
					}
					updateConsultantJTable();
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
				if (GlobalSecurity.isUpdatePriviledge(SubAppTypes.CONSULTANT)) {
					Global.currentConsultantKey = 0;
					Global.currentRenalDialysisCommunicationFormKey = 0;
					Global.currentConsultantForm = (String) cmbFormType
							.getSelectedItem();

					frameConsultantAdd = (FrameConsultantAdd) FrameFactory
							.createWindowOfType(FrameConsultantAdd.class);
					SwingUtils.center(frameConsultantAdd);
					frameConsultantAdd.setTitle("Add New Consultant");
					frameConsultantAdd.setModal(true);
					frameConsultantAdd.setVisible(true);
					updateConsultantJTable();
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
					int id = new Integer((String) consultantTable.getValueAt(
							table.getSelectedRow(), 5)).intValue();

					if (id != -1 && id != 0) {
						Global.currentConsultantKey = id;

						frameConsultantAdd = (FrameConsultantAdd) FrameFactory
								.createWindowOfType(FrameConsultantAdd.class);
						SwingUtils.center(frameConsultantAdd);
						frameConsultantAdd.setTitle("View/Update Consultant");
						frameConsultantAdd.setModal(true);
						frameConsultantAdd.setVisible(true);
					} else {
						String file = (String) consultantTable.getValueAt(table
								.getSelectedRow(), 7);
						Global.currentScanFormImageFileName = file;
						frameScanFormAdd = (FrameScanFormAdd) FrameFactory
								.createWindowOfType(FrameScanFormAdd.class);
						SwingUtils.center(frameScanFormAdd);
						frameScanFormAdd.setTitle("View Scan Record");
						frameScanFormAdd.setModal(true);
						frameScanFormAdd.setVisible(true);
					}
					updateConsultantJTable();
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
					int id = new Integer((String) consultantTable.getValueAt(
							table.getSelectedRow(), 5)).intValue();

					if (id != -1 && id != 0) {
						int formId = new Integer((String) consultantTable
								.getValueAt(table.getSelectedRow(), 6))
								.intValue();
						String formType = (String) consultantTable.getValueAt(
								table.getSelectedRow(), 1);

						if (formId != 0 && formType.equals("Referral Form")) {
							MedrexClientManager.getInstance()
									.deleteReferralForm(formId);
						}
						if (formId != 0
								&& formType.equals("Report of Consultation")) {
							MedrexClientManager.getInstance()
									.deleteReportOfConsultationForm(formId);
						}
						if (formId != 0
								&& formType
										.equals("Pharmacist Resident Evaluation")) {
							MedrexClientManager.getInstance()
									.deletePharmacistEvaluationReportForm(
											formId);
						}
						MedrexClientManager.getInstance().deleteConsultant(id);
						Global.currentConsultantKey = 0;
						Global.currentRenalDialysisCommunicationFormKey = 0;
						Global.currentRenalDialysisCommunicationFormPage2Key = 0;
						Global.currentReferralFormKey = 0;
						Global.currentReportOfConsultationFormKey = 0;
						Global.currentPharmacistResidentEvaluationFormKey = 0;
					} else {
						String file = (String) consultantTable.getValueAt(table
								.getSelectedRow(), 7);
						MedrexClientManager.getInstance().deleteScanForm(
								Global.currentResidenceKey,
								Global.currentResidentTabs.CONSULTANT.Name,
								file);
						Global.currentScanFormImageFileName = null;
					}
					updateConsultantJTable();

				} catch (Exception xe) {
					xe.printStackTrace();
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
		residentInformationLabel.setText("CONSULTANT");
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
				Global.currentScanFormImageFileName = null;
				frameScanFormAdd = (FrameScanFormAdd) FrameFactory
						.createWindowOfType(FrameScanFormAdd.class);
				SwingUtils.center(frameScanFormAdd);
				frameScanFormAdd.setTitle("Add New scanning Record");
				frameScanFormAdd.setModal(true);
				frameScanFormAdd.setVisible(true);
				frameScanFormAdd = null;
				updateConsultantJTable();
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
							Global.currentConsultantKey = 0;
							Global.currentConsultantForm = formName[index];
							// Global.currentResidentAssessmentFormKey = 0;

							frameConsultantAdd = (FrameConsultantAdd) FrameFactory
									.createWindowOfType(FrameConsultantAdd.class);
							SwingUtils.center(frameConsultantAdd);
							frameConsultantAdd.setTitle("Add New Consustant");
							frameConsultantAdd.setModal(true);
							frameConsultantAdd.setVisible(true);
							updateConsultantJTable();
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
		updateConsultantJTable();
	}

	public void openNewForm(String formName) {
		Global.currentConsultantKey = 0;
		Global.currentRenalDialysisCommunicationFormKey = 0;
		Global.currentConsultantForm = formName;

		frameConsultantAdd = (FrameConsultantAdd) FrameFactory
				.createWindowOfType(FrameConsultantAdd.class);
		SwingUtils.center(frameConsultantAdd);
		frameConsultantAdd.setTitle("Add New Consultant");
		frameConsultantAdd.setModal(true);
		frameConsultantAdd.setVisible(true);
		updateConsultantJTable();
	}

	public void fillCombos() {
		String[] imgPath = new String[] { "ReferralForm.png",
				"ReportofConsultation.png", "PharmacistResidentEvaluation.png" };

		cmbFormType.setModel(new javax.swing.DefaultComboBoxModel(formName));

		formIcon = new ImageIcon[imgPath.length];
		for (int i = 0; i < imgPath.length; i++) {
			BufferedImage img = new BufferedImage(100, 100,
					BufferedImage.TYPE_INT_RGB);
			try {
				img = ImageIO.read(new File("img/formThumbnails/Consultant/"
						+ imgPath[i]));
				formIcon[i] = new ImageIcon(img);
				imgSlider.insertElement(img, formName[i]);

			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
		}

	}

	public void updateConsultantJTable() {
		List consultantRecords = new ArrayList();
		List<ScanForm> scanRecords = null;

		if (Global.currentResidenceKey != 0) {
			try {
				consultantRecords = MedrexClientManager.getInstance()
						.getConsultants(Global.currentResidenceKey);
				new java.io.File("");

				scanRecords = MedrexClientManager.getInstance().doLoadScans(
						Global.currentResidenceKey,
						Global.currentResidentTabs.CONSULTANT.Name);
			} catch (Exception e) {

			}
		}

		if (scanRecords != null) {
			consultantRecords.addAll(scanRecords);
		}

		/*
		 * if (f != null) { for (int i = 0; i < f.length; i++) { if
		 * (f[i].getAbsolutePath().endsWith(".jpg")) {
		 * consultantRecords.add(f[i]); } else {
		 * System.out.println(f[i].getAbsolutePath()); } } }
		 * Collections.sort(consultantRecords, new Comparator() { // +1 if a > b
		 * // 0 if a = b // -1 if a < b public int compare(final Object a, final
		 * Object b) { Date aDate, bDate; aDate = (a instanceof Consultant) ?
		 * ((Consultant) a) .getDateCreated() : new Date(((File)
		 * a).lastModified()); bDate = (b instanceof Consultant) ? ((Consultant)
		 * b) .getDateCreated() : new Date(((File) b).lastModified());
		 * 
		 * if (aDate.getTime() == bDate.getTime()) { return 0; } else return
		 * (aDate.getTime() > bDate.getTime()) ? 1 : -1; } });
		 */

		consultantTable.setNewList(consultantRecords);
		consultantTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}

}

class ConsultantsJTable extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5254160542629547170L;

	private String[] columnNames = { "Date Created", "Form Type",
			"Last Modified", "Status", "User" };

	public List consultants;

	int n = 0;

	ConsultantsJTable(List activityRecords) {
		consultants = activityRecords;
	}

	ConsultantsJTable() {
		consultants = new ArrayList();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (consultants.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List activityRecords) {
		consultants = activityRecords;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {

			Object o = consultants.get(row);
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MM / dd / yyyy  hh:mm a");
			if (o instanceof Consultant) {

				Consultant rc = (Consultant) o;

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
					return (rc.getSerial() + "");
				}
				if (col == 6) {
					return rc.getFileName();
				}
				if (col == 7) {
					return rc.getFileName();
				}

				return ("");
			}
		} catch (Exception e) {
			return ("");
		}
	}
}
