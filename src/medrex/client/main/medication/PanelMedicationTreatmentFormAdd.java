package medrex.client.main.medication;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterJob;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

import medrex.client.PanelImage;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.constants.GlobalSecurity;
import medrex.client.main.medication.nurseMedicationNotes.PanelNurseMedicationNotes;
import medrex.client.main.medication.nurseTreatmentNotes.PanelNurseTreatmentNotes;
import medrex.client.mds.ui.PanelMDSPage;
import medrex.client.utils.ComponentPrintable;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.enums.SubAppTypes;
import medrex.commons.intf.Form;
import medrex.commons.vo.medication.MedicationTreatmentForm;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;

public class PanelMedicationTreatmentFormAdd extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4923252952543692712L;
	private JButton printButton;
	private PanelImage panel;
	private JComboBox cmbStatus;

	private JTextField txtNotes;

	private JComboBox cmbFormType;

	private Date creationDate;

	// private PanelMedicationTreatmentEmptyForm
	// panelMedicationTreatmentEmptyForm;

	private PanelPainManagementRecordFormPage1 panelPainManagementRecordFormPage1;

	private JScrollPane scrollPane;

	private JPanel panelPager;

	// private PanelMedicationTreatmentPageEmpty
	// panelMedicationTreatmentPageEmpty;

	// private PanelMedicationTreatmentPagePainManagementForm
	// panelMedicationTreatmentPagePainManagementForm;

	// changed by mayank

	private Form[] forms;
	private PanelMDSPage panelPager2;

	// changed by mayank
	private PanelNurseTreatmentNotes panelNurseTreatmentNotes;

	private PanelNurseMedicationNotes panelNurseMedicationNotes;

	private PanelMedicationAdministrationRecordForm panelMedicationAdministrationRecordForm;

	private PanelMedicationPRNRecordForm panelMedicationPRNRecordForm;

	private PanelMedicationRoutineRecordForm panelMedicationRoutineRecordForm;

	private PanelTreatmentPRNRecordForm panelTreatmentPRNRecordForm;

	private PanelTreatmentRoutineRecordForm panelTreatmentRoutineRecordForm;

	private PanelPressureScoreRecord panelPressureScoreRecord;

	private PanelMedicationNotes panelMedicationNotes;

	private Color DEF_BACK_COL = new Color(24, 86, 110);
	private Color DEF_BUT_BACK = new Color(130, 163, 175);
	private Color DEF_BUT_FORE = new Color(8, 68, 95);

	// private PanelDailySkilledNursesNotes panelDailySkilledNursesNotes;
	// private PanelDailySkilledNursesNotesForm2
	// panelDailySkilledNursesNotesForm2;

	/**
	 * Create the panel
	 */
	public PanelMedicationTreatmentFormAdd() {
		super();
		// Global.panelMedicationTreatmentFormAdd = this;
		// setPreferredSize(new Dimension(1024, 920));

		setPreferredSize(new Dimension(Toolkit.getDefaultToolkit()
				.getScreenSize().width, Toolkit.getDefaultToolkit()
				.getScreenSize().height - 50));
		setSize(new Dimension(
				Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
						.getDefaultToolkit().getScreenSize().height - 50));
		setBackground(DEF_BACK_COL);

		setLayout(null);

		// --------changed by mayank

		forms = new Form[2];
		panelPager2 = new PanelMDSPage();
		panelPager2.setPageCount(forms.length);
		panelPager2.setBounds(29, 46, 863, 35);
		panelPager2.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName().equals(
						PanelMDSPage.PAGE_BUTTON_CLICKED)) {
					/*
					 * showDailySkilledNursesFormPage((Integer)
					 * evt.getNewValue());
					 */
				}
			}
		});

		// -------changed by mayank

		final JLabel typeOfFormLabel = new JLabel();
		typeOfFormLabel.setFont(new Font("", Font.BOLD, 12));
		typeOfFormLabel.setText("TYPE OF FORM");
		typeOfFormLabel.setBounds(1041, 14, 52, 16);
		typeOfFormLabel.setVisible(false);
		add(typeOfFormLabel);

		cmbFormType = new JComboBox();
		cmbFormType.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				doFormChanged();
			}
		});

		cmbFormType.setBounds(1099, 10, 46, 25);
		cmbFormType.setVisible(false);
		add(cmbFormType);

		final JxButton saveButton = new JxButton();
		saveButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		saveButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (GlobalSecurity
						.isUpdatePriviledge(SubAppTypes.MEDICATION_TREATMENT)) {
					doSave();
					// Global.panelMedicationTreatmentForm.updateMedicationTreatmentFormJTable();
					Global.frameMedicationTreatmentFormAddNew.dispose();
				}
			}
		});
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.setText("Save");
		saveButton.setBounds(110, 10, 106, 26);
		add(saveButton);

		final JxButton cancelButton = new JxButton();
		cancelButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		cancelButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.frameMedicationTreatmentFormAddNew.dispose();
			}
		});
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setText("Cancel");
		cancelButton.setBounds(243, 10, 106, 26);
		add(cancelButton);

		final JLabel descriptionLabel = new JLabel();
		descriptionLabel.setFont(new Font("", Font.BOLD, 12));
		descriptionLabel.setText("DESCRIPTION");
		descriptionLabel.setBounds(1151, 14, 30, 16);
		descriptionLabel.setVisible(false);
		add(descriptionLabel);

		txtNotes = new JTextField();
		txtNotes.setBounds(1187, 12, 30, 20);
		txtNotes.setVisible(false);
		add(txtNotes);

		final JLabel statuLabel = new JLabel();
		statuLabel.setFont(new Font("", Font.BOLD, 12));
		statuLabel.setText("STATUS");
		statuLabel.setBounds(1041, 50, 46, 16);
		statuLabel.setVisible(false);
		add(statuLabel);

		cmbStatus = new JComboBox();
		cmbStatus.setBounds(1099, 46, 46, 25);
		cmbStatus.setVisible(false);
		add(cmbStatus);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 81, 975, this.getSize().height - 81 - 50);
		add(scrollPane);

		// scrollPane.setViewportView(panel);

		// panelMedicationTreatmentEmptyForm = new
		// PanelMedicationTreatmentEmptyForm();
		// panelMedicationTreatmentEmptyForm
		// .setPreferredSize(new Dimension(935, 0));
		// scrollPane.setViewportView(panelMedicationTreatmentEmptyForm);

		// panelMedicationTreatmentPageEmpty = new
		// PanelMedicationTreatmentPageEmpty();
		//
		// panelMedicationTreatmentPageEmpty.setBounds(110, 40, 778, 35);
		// add(panelMedicationTreatmentPageEmpty);
		//
		// panelMedicationTreatmentPagePainManagementForm = new
		// PanelMedicationTreatmentPagePainManagementForm();
		// panelMedicationTreatmentPagePainManagementForm.setLayout(null);
		// panelMedicationTreatmentPagePainManagementForm.setBounds(113, 40,
		// 775,
		// 35);
		// add(panelMedicationTreatmentPagePainManagementForm);
		//
		// panelMedicationTreatmentPageEmpty.setVisible(false);
		// panelMedicationTreatmentPagePainManagementForm.setVisible(false);

		panel = new PanelImage();
		panel.setArc(0.4f);
		panel.setCurvedView(true);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		panel.setBounds(909, 5, 92, 74);
		add(panel);

		printButton = new JxButton();
		printButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		printButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		printButton.setFont(new Font("Dialog", Font.BOLD, 12));
		printButton.setFont(new Font("", Font.BOLD, 12));
		printButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				JFrame fPrint = new JFrame();
				fPrint.setSize(50, 50);
				fPrint.setPreferredSize(fPrint.getSize());
				SwingUtils.center(fPrint);
				fPrint.setVisible(false);
				Book book = new Book();
				PrinterJob printJob = PrinterJob.getPrinterJob();
				PageFormat pageFormat = new PageFormat();
				Paper paper = new Paper();
				paper.setSize(594.992125984252, 841.8897637795276);
				paper.setImageableArea(36.0, 36.0, 522.99212598425197,
						769.8897637795276);
				pageFormat.setPaper(paper);
				pageFormat.setOrientation(PageFormat.PORTRAIT);
				printJob.defaultPage(pageFormat);
				printJob.setCopies(1);
				printJob.setPageable(book);
				final Component comp = scrollPane.getViewport().getComponent(0);
				((JComponent) comp).updateUI();
				comp.setSize(comp.getPreferredSize());
				fPrint.getContentPane().add(comp);
				fPrint.setVisible(true);
				fPrint.repaint();
				fPrint.setVisible(false);
				scrollPane.setViewportView(comp);
				comp.setSize(comp.getPreferredSize());
				final ComponentPrintable cp = new ComponentPrintable(comp);
				book.append(cp, pageFormat);
				try {
					printJob.print();
				} catch (Exception PrintException) {
					PrintException.printStackTrace();
				}
				fPrint.dispose();
			}
		});
		printButton.setText("Print");
		printButton.setBounds(369, 10, 106, 26);
		add(printButton);

		fillCombos();
		updateData();
		doFormChanged();
	}

	public void doSave() {
		MedicationTreatmentForm ar = new MedicationTreatmentForm();
		ar.setFormId(0);
		if (cmbFormType.getSelectedItem().equals("Pain Management Record")) {
			Global.panelPainManagementRecordFormPage1.doSave();
			ar.setFormId(Global.currentPainManagementFormPage1Key);
		}
		if (cmbFormType.getSelectedItem().equals("Nurse Treatment Notes")) {
			Global.panelNurseTreatmentNotes.doSave();
			ar.setFormId(Global.currentNurseTreatmentNotesFormKey);
		}
		if (cmbFormType.getSelectedItem().equals("Nurse Medication Notes")) {
			Global.panelNurseMedicationNotes.doSave();
			ar.setFormId(Global.currentNurseMedicationNotesFormKey);
		}
		if (cmbFormType.getSelectedItem().equals(
				"Medication Adminisration Record")) {
			Global.panelMedicationAdministrationRecordForm.doSave();
			ar.setFormId(Global.currentMedicationAdministrationRecordFormKey);
		}
		if (cmbFormType.getSelectedItem().equals("Medication PRN Record")) {
			Global.panelMedicationPRNRecordForm.doSave();
			ar.setFormId(Global.currentMedicationPRNRecordFormKey);
		}

		if (cmbFormType.getSelectedItem().equals("Medication Routine Record")) {
			Global.panelMedicationRoutineRecordForm.doSave();
			ar.setFormId(Global.currentMedicationRoutineRecordFormKey);
		}

		if (cmbFormType.getSelectedItem().equals("Treatment PRN Record")) {
			Global.panelTreatmentPRNRecordForm.doSave();
			ar.setFormId(Global.currentTreatmentPRNRecordFormKey);
		}

		if (cmbFormType.getSelectedItem().equals("Treatment Routine Record")) {
			Global.panelTreatmentRoutineRecordForm.doSave();
			ar.setFormId(Global.currentTreatmentRoutineRecordFormKey);
		}

		if (cmbFormType.getSelectedItem().equals("Pressure Sore Record")) {
			Global.panelPressureScoreRecord.doSave();
			ar.setFormId(Global.currentPressureSoreRecordFormKey);
		}
		if (cmbFormType.getSelectedItem().equals("Notes")) {
			Global.panelMedicationNotes.doSave();
			ar.setFormId(Global.currentMedicationNotesFormKey);
		}
		// -------changed by mayank
		/*
		 * if
		 * (cmbFormType.getSelectedItem().equals("Daily Skilled Nurses Notes"))
		 * { for (int i = 0; i < forms.length; i++) {
		 * //System.out.println("form while saving:" + forms[i]); if (forms[i]
		 * == null) { forms[i] = getForm(i); } } for (int i = 0; i <
		 * forms.length; i++) { forms[i].doSave(); }
		 * ar.setFormId(Global.currentDailySkilledNursesNotesKey); }
		 */
		// --------changed by mayank
		ar.setSerial(Global.currentMedicationTreatmentFormKey);
		ar.setResidentId(Global.currentResidenceKey);
		ar.setFormType((String) cmbFormType.getSelectedItem());
		ar.setNotes(txtNotes.getText());
		ar.setUser("Admin");
		ar.setStatus((String) cmbStatus.getSelectedItem());
		if (Global.currentMedicationTreatmentFormKey == 0) {
			ar.setDateCreated(MedrexClientManager.getServerTime());
		} else {
			ar.setDateCreated(creationDate);
		}
		ar.setLastModified(MedrexClientManager.getServerTime());
		try {
			Global.currentMedicationTreatmentFormKey = MedrexClientManager
					.getInstance().insertOrUpdateMedicationTreatmentForm(ar);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void fillCombos() {
		cmbFormType
				.setModel(new javax.swing.DefaultComboBoxModel(
						new String[] { "Pain Management Record",
								"Nurse Treatment Notes",
								"Nurse Medication Notes",
								"Medication Adminisration Record",
								"Medication PRN Record",
								"Medication Routine Record",
								"Treatment PRN Record",
								"Treatment Routine Record",
								"Pressure Sore Record", "Notes",/* "Daily Skilled Nurses Notes" */}));

		cmbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Complete", "Incomplete" }));

	}

	public void updateData() {
		if (Global.currentMedicationTreatmentFormKey == 0) {
			cmbFormType.setEnabled(false);
			cmbFormType.setSelectedItem(Global.currentMedicationTreatmentForm);

		} else {
			cmbFormType.setEnabled(false);
			MedicationTreatmentForm ar = null;
			try {
				ar = MedrexClientManager.getInstance()
						.getMedicationTreatmentForm(
								Global.currentMedicationTreatmentFormKey);
			} catch (Exception e) {
				e.printStackTrace();
			}
			cmbFormType.setSelectedItem(ar.getFormType());
			cmbStatus.setSelectedItem(ar.getStatus());
			txtNotes.setText(ar.getNotes());
			creationDate = ar.getDateCreated();
		}
		if (Global.currentResidenceKey != 0) {
			ResidentMain resi = null;
			try {
				resi = MedrexClientManager.getInstance().getResident(
						Global.currentResidenceKey);
			} catch (Exception e) {
				e.printStackTrace();
			}
			ImageIcon ico = resi.getImg();
			if (ico != null) {
				panel.setImage(ico.getImage());
			}
		}

		// if (((String) cmbFormType.getSelectedItem())
		// .equalsIgnoreCase("Pain Management Record")) {
		// doFormChanged();
		// }

	}

	public void doFormChanged() {
		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Pain Management Record")) {

			if (Global.currentMedicationTreatmentFormKey != 0) {
				MedicationTreatmentForm ar = null;
				try {
					ar = MedrexClientManager.getInstance()
							.getMedicationTreatmentForm(
									Global.currentMedicationTreatmentFormKey);
				} catch (Exception e) {
				}
				Global.currentPainManagementFormPage1Key = ar.getFormId();
			} else {
				Global.currentPainManagementFormPage1Key = 0;

			}
			panelPainManagementRecordFormPage1 = new PanelPainManagementRecordFormPage1();
			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelPainManagementRecordFormPage1);
			scrollPane.updateUI();
			// panelMedicationTreatmentPageEmpty.setVisible(false);
			// panelMedicationTreatmentPagePainManagementForm.setVisible(true);
			// panelMedicationTreatmentPagePainManagementForm.updateUI();
			Global.panelPainManagementRecordFormPage1.updateData();
		}

		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Nurse Treatment Notes")) {

			if (Global.currentMedicationTreatmentFormKey != 0) {
				MedicationTreatmentForm ar = null;
				try {
					ar = MedrexClientManager.getInstance()
							.getMedicationTreatmentForm(
									Global.currentMedicationTreatmentFormKey);
				} catch (Exception e) {
					e.printStackTrace();
				}
				Global.currentNurseTreatmentNotesFormKey = ar.getFormId();
				Global.currentNurseTreatmentNotesFormDialogMode = false;
				MedicationTreatmentForm ref = null;
				try {
					ref = MedrexClientManager.getInstance()
							.getMedicationTreatmentFormCurrentWhere(
									Global.currentResidenceKey,
									(String) cmbFormType.getSelectedItem());
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (ref != null) {
					if (ref.getSerial() == Global.currentMedicationTreatmentFormKey) {
						Global.currentNurseTreatmentNotesFormDialogMode = true;
					}
				}
			} else {
				Global.currentNurseTreatmentNotesFormKey = 0;
				Global.currentNurseTreatmentNotesFormDialogMode = true;

				try {
					MedicationTreatmentForm ref = MedrexClientManager
							.getInstance()
							.getMedicationTreatmentFormCurrentWhere(
									Global.currentResidenceKey,
									(String) cmbFormType.getSelectedItem());
					if (ref != null) {
						List rows = MedrexClientManager
								.getInstance()
								.getNurseTreatmentNotesFormRows(ref.getFormId());
						if (rows != null) {
							if (rows.size() < PanelNurseTreatmentNotes.MAX_ROWS) {
								Global.currentMedicationTreatmentFormKey = ref
										.getSerial();
								Global.currentNurseTreatmentNotesFormKey = ref
										.getFormId();
								updateData();
							}
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			panelNurseTreatmentNotes = new PanelNurseTreatmentNotes();
			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelNurseTreatmentNotes);
			scrollPane.updateUI();
			// panelMedicationTreatmentPageEmpty.setVisible(true);
			// panelMedicationTreatmentPagePainManagementForm.setVisible(false);

			// panelMedicationTreatmentPagePainManagementForm.updateUI();
			panelNurseTreatmentNotes.updateData();
			// Global.panelPainManagementRecordFormPage1.updateData();

		}

		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Nurse Medication Notes")) {

			if (Global.currentMedicationTreatmentFormKey != 0) {
				MedicationTreatmentForm ar = null;
				try {
					ar = MedrexClientManager.getInstance()
							.getMedicationTreatmentForm(
									Global.currentMedicationTreatmentFormKey);
				} catch (Exception e) {
				}
				Global.currentNurseMedicationNotesFormKey = ar.getFormId();
			} else {
				Global.currentNurseMedicationNotesFormKey = 0;
			}

			panelNurseMedicationNotes = new PanelNurseMedicationNotes();
			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelNurseMedicationNotes);
			scrollPane.updateUI();
			// panelMedicationTreatmentPageEmpty.setVisible(true);
			// panelMedicationTreatmentPagePainManagementForm.setVisible(false);

			// panelMedicationTreatmentPagePainManagementForm.updateUI();
			panelNurseMedicationNotes.updateData();
			// Global.panelPainManagementRecordFormPage1.updateData();

		}

		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Medication Adminisration Record")) {

			if (Global.currentMedicationTreatmentFormKey != 0) {
				MedicationTreatmentForm ar = null;
				try {
					ar = MedrexClientManager.getInstance()
							.getMedicationTreatmentForm(
									Global.currentMedicationTreatmentFormKey);
				} catch (Exception e) {
				}
				Global.currentMedicationAdministrationRecordFormKey = ar
						.getFormId();
			} else {
				Global.currentMedicationAdministrationRecordFormKey = 0;
			}

			panelMedicationAdministrationRecordForm = new PanelMedicationAdministrationRecordForm();
			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelMedicationAdministrationRecordForm);
			scrollPane.updateUI();
			// panelMedicationTreatmentPageEmpty.setVisible(true);
			// panelMedicationTreatmentPagePainManagementForm.setVisible(false);

			// panelMedicationTreatmentPagePainManagementForm.updateUI();
			panelMedicationAdministrationRecordForm.updateData();
			// Global.panelPainManagementRecordFormPage1.updateData();

		}

		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Medication PRN Record")) {

			if (Global.currentMedicationTreatmentFormKey != 0) {
				MedicationTreatmentForm ar = null;
				try {
					ar = MedrexClientManager.getInstance()
							.getMedicationTreatmentForm(
									Global.currentMedicationTreatmentFormKey);
				} catch (Exception e) {
				}
				Global.currentMedicationPRNRecordFormKey = ar.getFormId();
			} else {
				Global.currentMedicationPRNRecordFormKey = 0;
			}

			panelMedicationPRNRecordForm = new PanelMedicationPRNRecordForm();
			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelMedicationPRNRecordForm);
			scrollPane.updateUI();
			// panelMedicationTreatmentPageEmpty.setVisible(true);
			// panelMedicationTreatmentPagePainManagementForm.setVisible(false);

			// panelMedicationTreatmentPagePainManagementForm.updateUI();
			panelMedicationPRNRecordForm.updateData();
			// Global.panelPainManagementRecordFormPage1.updateData();

		}

		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Medication Routine Record")) {

			if (Global.currentMedicationTreatmentFormKey != 0) {
				MedicationTreatmentForm ar = null;
				try {
					ar = MedrexClientManager.getInstance()
							.getMedicationTreatmentForm(
									Global.currentMedicationTreatmentFormKey);
				} catch (Exception e) {
				}
				Global.currentMedicationRoutineRecordFormKey = ar.getFormId();
			} else {
				Global.currentMedicationRoutineRecordFormKey = 0;
			}

			panelMedicationRoutineRecordForm = new PanelMedicationRoutineRecordForm();
			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelMedicationRoutineRecordForm);
			scrollPane.updateUI();
			// panelMedicationTreatmentPageEmpty.setVisible(true);
			// panelMedicationTreatmentPagePainManagementForm.setVisible(false);

			// panelMedicationTreatmentPagePainManagementForm.updateUI();
			panelMedicationRoutineRecordForm.updateData();
			// Global.panelPainManagementRecordFormPage1.updateData();

		}

		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Treatment PRN Record")) {

			if (Global.currentMedicationTreatmentFormKey != 0) {
				MedicationTreatmentForm ar = null;
				try {
					ar = MedrexClientManager.getInstance()
							.getMedicationTreatmentForm(
									Global.currentMedicationTreatmentFormKey);
				} catch (Exception e) {
				}
				Global.currentTreatmentPRNRecordFormKey = ar.getFormId();
			} else {
				Global.currentTreatmentPRNRecordFormKey = 0;
			}

			panelTreatmentPRNRecordForm = new PanelTreatmentPRNRecordForm();
			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelTreatmentPRNRecordForm);
			scrollPane.updateUI();
			// panelMedicationTreatmentPageEmpty.setVisible(true);
			// panelMedicationTreatmentPagePainManagementForm.setVisible(false);

			// panelMedicationTreatmentPagePainManagementForm.updateUI();
			panelTreatmentPRNRecordForm.updateData();
			// Global.panelPainManagementRecordFormPage1.updateData();

		}

		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Treatment Routine Record")) {

			if (Global.currentMedicationTreatmentFormKey != 0) {
				MedicationTreatmentForm ar = null;
				try {
					ar = MedrexClientManager.getInstance()
							.getMedicationTreatmentForm(
									Global.currentMedicationTreatmentFormKey);
				} catch (Exception e) {
				}
				Global.currentTreatmentRoutineRecordFormKey = ar.getFormId();
			} else {
				Global.currentTreatmentRoutineRecordFormKey = 0;
			}

			panelTreatmentRoutineRecordForm = new PanelTreatmentRoutineRecordForm();
			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelTreatmentRoutineRecordForm);
			scrollPane.updateUI();
			// panelMedicationTreatmentPageEmpty.setVisible(true);
			// panelMedicationTreatmentPagePainManagementForm.setVisible(false);

			// panelMedicationTreatmentPagePainManagementForm.updateUI();
			panelTreatmentRoutineRecordForm.updateData();
			// Global.panelPainManagementRecordFormPage1.updateData();

		}

		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Pressure Sore Record")) {

			if (Global.currentMedicationTreatmentFormKey != 0) {
				MedicationTreatmentForm ar = null;
				try {
					ar = MedrexClientManager.getInstance()
							.getMedicationTreatmentForm(
									Global.currentMedicationTreatmentFormKey);
				} catch (Exception e) {
				}
				Global.currentPressureSoreRecordFormKey = ar.getFormId();
			} else {
				Global.currentPressureSoreRecordFormKey = 0;
			}

			panelPressureScoreRecord = new PanelPressureScoreRecord();
			scrollPane.getViewport().setViewPosition(new Point(0, 0));

			scrollPane.setViewportView(panelPressureScoreRecord);
			scrollPane.updateUI();
			// panelMedicationTreatmentPageEmpty.setVisible(true);
			// panelMedicationTreatmentPagePainManagementForm.setVisible(false);

			// panelMedicationTreatmentPagePainManagementForm.updateUI();
			panelPressureScoreRecord.updateData();

		}

		if (((String) cmbFormType.getSelectedItem()).equalsIgnoreCase("Notes")) {
			if (Global.currentMedicationTreatmentFormKey != 0) {
				MedicationTreatmentForm ar = null;
				try {
					ar = MedrexClientManager.getInstance()
							.getMedicationTreatmentForm(
									Global.currentMedicationTreatmentFormKey);
				} catch (Exception e) {
				}
				Global.currentMedicationNotesFormKey = ar.getFormId();
			} else {
				Global.currentMedicationNotesFormKey = 0;
			}

			panelMedicationNotes = new PanelMedicationNotes();
			scrollPane.getViewport().setViewPosition(new Point(0, 0));

			scrollPane.setViewportView(panelMedicationNotes);
			scrollPane.updateUI();
			panelMedicationNotes.updateData();
		}

		// skilled Nurses Notes

		/*
		 * if (((String) cmbFormType.getSelectedItem())
		 * .equalsIgnoreCase("Daily Skilled Nurses Notes")) {
		 * 
		 * add(panelPager2);
		 * 
		 * if (Global.currentMedicationTreatmentFormKey != 0) {
		 * MedicationTreatmentForm ar = null; try { ar =
		 * MedrexClientManager.getInstance()
		 * .getMedicationTreatmentForm(Global.currentMedicationTreatmentFormKey
		 * ); } catch (Exception e) { } Global.currentDailySkilledNursesNotesKey
		 * = ar.getFormId();
		 * 
		 * } else { Global.currentDailySkilledNursesNotesKey = 0;
		 * Global.currentDailySkilledNursesNotesForm2Key=0; } //
		 * panelDailySkilledNursesNotes = new PanelDailySkilledNursesNotes();
		 * if(forms[0] == null) { forms[0] = getForm(0); forms[0].doUpdate(); }
		 */
		// scrollPane.getViewport().setViewPosition(new Point(0, 0));
		// scrollPane.setViewportView(panelDailySkilledNursesNotes);
		// scrollPane.setViewportView((JPanel)forms[0]);
		// scrollPane.updateUI();
		// panelMedicationTreatmentPageEmpty.setVisible(false);
		// panelMedicationTreatmentPagePainManagementForm.setVisible(true);
		// panelMedicationTreatmentPagePainManagementForm.updateUI();
		// Global.panelDailySkilledNursesNotes.updateData();
		// }
	}

	public void showPainManagementForm(int pageNum) {

		switch (pageNum) {

		case 1:
			panelPainManagementRecordFormPage1.updateData();
			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelPainManagementRecordFormPage1);
			break;
		}

		scrollPane.updateUI();
	}

	// ------changed by mayank

	/*
	 * public void showDailySkilledNursesFormPage(int pageNum) { Form form =
	 * forms[pageNum - 1]; if (form == null) { form = (Form) getForm(pageNum -
	 * 1); forms[pageNum - 1] = form; form.doUpdate(); }
	 * scrollPane.getViewport().setViewPosition(new Point(0, 0));
	 * scrollPane.setViewportView((Component) form); scrollPane.updateUI();
	 * Global.currentDailySkilledNursesNotesFormPage = pageNum;
	 * 
	 * }
	 * 
	 * public Form getForm(int index) { switch (index) { case 0: return new
	 * PanelDailySkilledNursesNotes(); case 1: return new
	 * PanelDailySkilledNursesNotesForm2(); default: return null; } }
	 */
	// ------changed by mayank
}
