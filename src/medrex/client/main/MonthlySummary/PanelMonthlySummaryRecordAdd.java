package medrex.client.main.MonthlySummary;

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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

import medrex.client.PanelImage;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.admission.PanelResidentAssessmentFormPage15;
import medrex.client.main.admission.PanelResidentAssessmentFormPage18;
import medrex.client.main.admission.PanelResidentAssessmentFormPage19;
import medrex.client.main.admission.PanelResidentAssessmentFormPage20;
import medrex.client.main.dietary.PanelDietaryCommunicationForm;
import medrex.client.main.dietary.PanelDietaryPlazaHealth;
import medrex.client.main.dietary.PanelEnteralFeeding;
import medrex.client.main.newform.psychotropics.PanelAbnormalInvoluntryMovementScale;
import medrex.client.main.newform.psychotropics.PanelInstructionForConductingTheResidentExamination;
import medrex.client.main.newform.psychotropics.PanelPlazaHealthCare;
import medrex.client.main.newform.psychotropics.PanelPsychopharmacologic;
import medrex.client.main.newform.psychotropics.PanelPsychopharmacologicMedications;
import medrex.client.main.newform.psychotropics.PanelPsychotropicMedicationMonthlySummary;
import medrex.client.main.newform.psychotropics.PanelPsychotropicMedicationMonthlySummaryRemaining;
import medrex.client.mds.ui.PanelMDSPage;
import medrex.client.newform.PanelMedicalOrdersLSTPage1;
import medrex.client.utils.ComponentPrintable;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.intf.Form;
import medrex.commons.vo.monthlySummary.MonthlySummaryRecord;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxScrollPane;

public class PanelMonthlySummaryRecordAdd extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5012632534140452785L;
	private JButton printButton;
	private PanelImage panel;
	private JComboBox cmbStatus;
	private JTextField txtNotes;
	private JComboBox cmbFormType;
	private Date creationDate;
	private Form[] forms;
	private JxScrollPane scrollPane;
	private PanelMDSPage panelPager;
	private Color DEF_BACK_COL = new Color(24, 86, 110);
	private Color DEF_BUT_BACK = new Color(130, 163, 175);
	private Color DEF_BUT_FORE = new Color(8, 68, 95);
	private boolean anError;

	/**
	 * Create the panel
	 */
	public PanelMonthlySummaryRecordAdd() {
		super();
		setPreferredSize(new Dimension(Toolkit.getDefaultToolkit()
				.getScreenSize().width, Toolkit.getDefaultToolkit()
				.getScreenSize().height - 50));
		setSize(new Dimension(
				Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
						.getDefaultToolkit().getScreenSize().height - 50));
		setBackground(DEF_BACK_COL);
		setLayout(null);

		if (Global.currentMonthlySummaryForm
				.equalsIgnoreCase("Monthly Summary Form")) {
			forms = new Form[9];
		} else if (Global.currentMonthlySummaryForm
				.equalsIgnoreCase("Miscellaneous Form")) {
			forms = new Form[16];
		} else if (Global.currentMonthlySummaryForm
				.equalsIgnoreCase("Miscellaneous Form 1")) {
			forms = new Form[17];
		}
		panelPager = new PanelMDSPage();
		panelPager.setPageCount(forms.length);
		panelPager.setBounds(29, 46, 863, 35);
		panelPager.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName().equals(
						PanelMDSPage.PAGE_BUTTON_CLICKED)) {
					showMonthlySummaryFormPage((Integer) evt.getNewValue());
				}
			}
		});
		add(panelPager);

		final JLabel typeOfFormLabel = new JLabel();
		typeOfFormLabel.setFont(new Font("", Font.BOLD, 12));
		typeOfFormLabel.setText("TYPE OF FORM");
		typeOfFormLabel.setBounds(540, 14, 61, 16);
		typeOfFormLabel.setVisible(false);
		add(typeOfFormLabel);

		cmbFormType = new JComboBox();
		cmbFormType.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				// doFormChanged();
			}
		});

		cmbFormType.setBounds(607, 10, 61, 25);
		cmbFormType.setVisible(false);
		add(cmbFormType);

		final JxButton saveButton = new JxButton();
		saveButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		saveButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSave();
				Global.frameMonthlySummaryRecordAdd.dispose();
			}
		});
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.setText("Save");
		saveButton.setBounds(28, 9, 106, 26);
		add(saveButton);

		final JxButton cancelButton = new JxButton();
		cancelButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		cancelButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.frameMonthlySummaryRecordAdd.dispose();
			}
		});
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setText("Cancel");
		cancelButton.setBounds(140, 9, 106, 26);
		add(cancelButton);

		final JLabel descriptionLabel = new JLabel();
		descriptionLabel.setFont(new Font("", Font.BOLD, 12));
		descriptionLabel.setText("DESCRIPTION");
		descriptionLabel.setBounds(674, 14, 61, 16);
		descriptionLabel.setVisible(false);
		add(descriptionLabel);

		txtNotes = new JTextField();
		txtNotes.setBounds(736, 12, 26, 20);
		txtNotes.setVisible(false);
		add(txtNotes);

		final JLabel statuLabel = new JLabel();
		statuLabel.setFont(new Font("", Font.BOLD, 12));
		statuLabel.setText("STATUS");
		statuLabel.setBounds(768, 18, 61, 16);
		statuLabel.setVisible(false);
		add(statuLabel);

		cmbStatus = new JComboBox();
		cmbStatus.setBounds(824, 14, 45, 25);
		cmbStatus.setVisible(false);
		add(cmbStatus);

		scrollPane = new JxScrollPane();
		scrollPane.setBounds(28, 81, 975, this.getSize().height - 81 - 50);
		add(scrollPane);

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

		printButton.setActionCommand("Print");
		printButton.setText("Print");
		printButton.setBounds(252, 9, 92, 26);
		add(printButton);

		final JxButton printAllButton = new JxButton();
		printAllButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		printAllButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		printAllButton.setFont(new Font("Dialog", Font.BOLD, 12));
		printAllButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				JFrame fPrint = new JFrame();
				fPrint.setSize(50, 50);
				fPrint.setPreferredSize(fPrint.getSize());
				SwingUtils.center(fPrint);
				fPrint.setVisible(false);
				// --- Create a new PrinterJob object
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

				// --- Create a new book to add pages to
				try {
					for (int i = 0; i < forms.length; i++) {
						// showResidentAssesmentFormPage(i + 1);
						// Component comp =
						// scrollPane.getViewport().getComponent(0);
						// ((JComponent)comp).updateUI();
						// comp.setSize(comp.getPreferredSize());
						// fPrint.getContentPane().add(comp);
						// scrollPane.setViewportView(comp);
						// PrinterJob pj = PrinterJob.getPrinterJob();
						// ComponentPrintable cp = new ComponentPrintable(comp);
						// PageFormat pageFormat = new PageFormat();
						// Paper paper = new Paper();
						// paper.setSize(594.992125984252, 841.8897637795276);
						// paper.setImageableArea(36.0, 36.0,
						// 522.99212598425197, 769.8897637795276);
						// pageFormat.setPaper(paper);
						// pageFormat.setOrientation(PageFormat.PORTRAIT);
						// pj.setPrintable(cp, pageFormat);
						// pj.print();

						showMonthlySummaryFormPage(i + 1);
						final Component comp = scrollPane.getViewport()
								.getComponent(0);
						((JComponent) comp).updateUI();
						comp.setSize(comp.getPreferredSize());
						fPrint.getContentPane().add(comp);
						fPrint.setVisible(true);
						fPrint.repaint();
						fPrint.setVisible(false);
						scrollPane.setViewportView(comp);
						comp.setSize(comp.getPreferredSize());
						final ComponentPrintable cp = new ComponentPrintable(
								comp);
						book.append(cp, pageFormat);
					}
					printJob.setPageable(book);
					// System.out.println(book.getNumberOfPages());
					// JOptionPane.showMessageDialog(null, "" +
					// book.getNumberOfPages());
					// if (printJob.printDialog()) {
					try {
						printJob.print();
					} catch (Exception PrintException) {
						PrintException.printStackTrace();
					}
					// }
					fPrint.dispose();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		printAllButton.setText("Print All");
		printAllButton.setBounds(350, 9, 106, 26);
		add(printAllButton);
		// doFormChanged();
		fillCombos();
		updateData();
	}

	public void doSave() {
		MonthlySummaryRecord monthlySum = new MonthlySummaryRecord();
		for (int i = 0; i < forms.length; i++) {
			if (forms[i] == null) {
				forms[i] = getForm(i);
				forms[i].doUpdate();
			}
		}
		if (cmbFormType.getSelectedItem().equals("Monthly Summary Form")) {
			// ------saving master table first

			anError = false;
			monthlySum.setStatus("Complete");
			monthlySum.setSerial(Global.currentMonthlySummaryRecordKey);
			monthlySum.setResidentId(Global.currentResidenceKey);
			monthlySum.setFormType((String) cmbFormType.getSelectedItem());
			monthlySum.setFormId(0);
			if (Global.currentMonthlySummaryRecordKey == 0) {
				monthlySum.setDateCreated(MedrexClientManager.getServerTime());
			} else {
				monthlySum.setDateCreated(creationDate);
			}
			monthlySum.setLastModified(MedrexClientManager.getServerTime());
			try {
				Global.currentMonthlySummaryRecordKey = MedrexClientManager
						.getInstance().insertOrUpdateMonthlySummaryRecord(
								monthlySum);
			} catch (Exception e) {
				e.printStackTrace();
			}

			// for relationship forms--------------------

			for (int i = 0; i < forms.length; i++) {
				showMonthlySummaryFormPage(i + 1);
				if (forms[i].doValidate()) {
					forms[i].doSave();
					anError = true;
					monthlySum.setStatus("Complete");
				} else {
					showMonthlySummaryFormPage(i + 1);
					anError = false;
					break;
				}
			}
		} else if (cmbFormType.getSelectedItem().equals("Miscellaneous Form")) {
			for (int i = 0; i < forms.length; i++) {
				showMonthlySummaryFormPage(i + 1);
				if (forms[i].doValidate()) {
					forms[i].doSave();
					anError = true;
					monthlySum.setStatus("Complete");
				} else {
					showMonthlySummaryFormPage(i + 1);
					anError = false;
					break;
				}
			}
			anError = false;
			monthlySum.setStatus("Complete");
			monthlySum.setSerial(Global.currentMonthlySummaryRecordKey);
			monthlySum.setResidentId(Global.currentResidenceKey);
			monthlySum.setFormType((String) cmbFormType.getSelectedItem());
			monthlySum.setFormId(Global.currentMsjnKey);
			if (Global.currentMonthlySummaryRecordKey == 0) {
				monthlySum.setDateCreated(MedrexClientManager.getServerTime());
			} else {
				monthlySum.setDateCreated(creationDate);
			}
			monthlySum.setLastModified(MedrexClientManager.getServerTime());
			try {
				Global.currentMonthlySummaryRecordKey = MedrexClientManager
						.getInstance().insertOrUpdateMonthlySummaryRecord(
								monthlySum);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else if (Global.currentMonthlySummaryForm
				.equalsIgnoreCase("Miscellaneous Form 1")) {
			for (int i = 0; i < forms.length; i++) {
				showMonthlySummaryFormPage(i + 1);
				if (forms[i].doValidate()) {
					forms[i].doSave();
					anError = true;
					monthlySum.setStatus("Complete");
				} else {
					showMonthlySummaryFormPage(i + 1);
					anError = false;
					break;
				}
			}
			anError = false;
			monthlySum.setStatus("Complete");
			monthlySum.setSerial(Global.currentMonthlySummaryRecordKey);
			monthlySum.setResidentId(Global.currentResidenceKey);
			monthlySum.setFormType((String) cmbFormType.getSelectedItem());
			monthlySum.setFormId(Global.currentDietaryCommunicationFormKey);
			if (Global.currentMonthlySummaryRecordKey == 0) {
				monthlySum.setDateCreated(MedrexClientManager.getServerTime());
			} else {
				monthlySum.setDateCreated(creationDate);
			}
			monthlySum.setLastModified(MedrexClientManager.getServerTime());
			try {
				Global.currentMonthlySummaryRecordKey = MedrexClientManager
						.getInstance().insertOrUpdateMonthlySummaryRecord(
								monthlySum);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public void fillCombos() {
		cmbFormType.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Monthly Summary Form", "Miscellaneous Form",
				"Miscellaneous Form 1"
		/*
		 * "Monthly Summary Form Page1" , "Monthly Summary Form Page2"
		 */}));

		cmbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Complete", "Incomplete" }));

	}

	public void updateData() {
		if (Global.currentMonthlySummaryRecordKey == 0) {
			cmbFormType.setEnabled(false);
			cmbFormType.setSelectedItem(Global.currentMonthlySummaryForm);
		} else {
			MonthlySummaryRecord monthRec = null;

			try {
				monthRec = MedrexClientManager.getInstance()
						.getMonthlySummaryRecord(
								Global.currentMonthlySummaryRecordKey);
			} catch (Exception e) {
			}
			cmbFormType.setSelectedItem(monthRec.getFormType());
			cmbStatus.setSelectedItem(monthRec.getStatus());
			txtNotes.setText(monthRec.getNotes());
			creationDate = monthRec.getDateCreated();
		}

		doFormChanged();

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
	}

	public void doFormChanged() {
		// System.out.println((String) cmbFormType.getSelectedItem());
		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Monthly Summary Form")) {
			if (Global.currentMonthlySummaryRecordKey != 0) {
				MonthlySummaryRecord monthlySum = null;
				try {
					monthlySum = MedrexClientManager.getInstance()
							.getMonthlySummaryRecord(
									Global.currentMonthlySummaryRecordKey);
				} catch (Exception e) {
				}

				Global.currentMonthlySummaryMainPageKey = monthlySum
						.getSerial();
				Global.currentMonthlySummaryPage1Key = monthlySum.getSerial();
				Global.currentMonthlySummaryPage2Key = monthlySum.getSerial();
				Global.currentMonthlySummaryPage3Key = monthlySum.getSerial();
				Global.currentMonthlySummaryPage4Key = monthlySum.getSerial();
				Global.currentMonthlySummaryPage5Key = monthlySum.getSerial();
				Global.currentMonthlySummaryMainPageKey = monthlySum
						.getSerial();

			} else {
				Global.currentMonthlySummaryMainPageKey = 0;
				Global.currentMonthlySummaryPage1Key = 0;
				Global.currentMonthlySummaryPage2Key = 0;
				Global.currentMonthlySummaryPage3Key = 0;
				Global.currentMonthlySummaryPage4Key = 0;
				Global.currentMonthlySummaryPage5Key = 0;
				Global.currentAdmissionAndDischargeSummaryKey = 0;

				Global.currentResidentAssessmentFormPage21Key = 0;
				Global.currentResidentAssessmentFormPage22Key = 0;

			}
		} else if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Miscellaneous Form")) {
			if (Global.currentMonthlySummaryRecordKey != 0) {
				MonthlySummaryRecord monthlySum = null;
				try {
					monthlySum = MedrexClientManager.getInstance()
							.getMonthlySummaryRecord(
									Global.currentMonthlySummaryRecordKey);
				} catch (Exception e) {
				}
				Global.currentMsjnKey = monthlySum.getFormId();
			} else {
				Global.currentPhysicianProgressNotesKey = 0;
				Global.currentResidentAssessmentFormPage21Key = 0;
				Global.currentResidentAssessmentFormPage22Key = 0;
			}
		} else if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Miscellaneous Form 1")) {
			if (Global.currentMonthlySummaryRecordKey != 0) {
				MonthlySummaryRecord monthlySum = null;
				try {
					monthlySum = MedrexClientManager.getInstance()
							.getMonthlySummaryRecord(
									Global.currentMonthlySummaryRecordKey);
				} catch (Exception e) {
				}
				Global.currentDietaryCommunicationFormKey = monthlySum
						.getFormId();
				Global.currentDietaryPlazaHealthKey = monthlySum.getFormId();
			} else {
				Global.currentDietaryCommunicationFormKey = 0;
				Global.currentEnteralFeedingKey = 0;
			}
		}
		if (forms[0] == null) {
			forms[0] = getForm(0);
		}
		scrollPane.getViewport().setViewPosition(new Point(0, 0));
		scrollPane.setViewportView((Component) forms[0]);
		scrollPane.updateUI();
		forms[0].doUpdate();
	}

	public void showMonthlySummaryFormPage(int pageNum) {

		Global.currentMonthlySummaryFormPage = pageNum;

		Form form = forms[pageNum - 1];
		if (form == null) {
			form = getForm(pageNum - 1);
			forms[pageNum - 1] = form;
			form.doUpdate();
		}
		scrollPane.getViewport().setViewPosition(new Point(0, 0));
		scrollPane.setViewportView((Component) form);
		scrollPane.updateUI();
	}

	public Form getForm(int index) {

		if (Global.currentMonthlySummaryForm
				.equalsIgnoreCase("Monthly Summary Form")) {
			switch (index) {
			case 0:
				return new PanelMonthlySummaryMainPage();
			case 1:
				return new PanelMonthlySummaryPage1();
			case 2:
				return new PanelMonthlySummaryPage2();
			case 3:
				return new PanelMonthlySummaryPage3();
			case 4:
				return new PanelMonthlySummaryPage4();
			case 5:
				return new PanelMonthlySummaryPage5();
			case 6:
				return new PanelAdmissionAndDischargeSummary();
			case 7:
				return new PanelEkgUltrasound();
			case 8:
				return new PanelEkgxray();

			default:
				return null;
			}
		} else if (Global.currentMonthlySummaryForm
				.equalsIgnoreCase("Miscellaneous Form")) {
			switch (index) {
			case 0:
				return new PanelMSJN();
			case 1:
				return new PanelInstructions();
			case 2:
				return new PanelDnrDnhForm();
			case 3:
				return new PanelResidentAssessmentFormPage21();
			case 4:
				return new PanelResidentAssessmentFormPage22();
			case 5:
				return new PanelResidentAssessmentFormPage18();
			case 6:
				return new PanelResidentAssessmentFormPage19();
			case 7:
				return new PanelResidentAssessmentFormPage20();
			case 8:
				return new PanelResidentInformation();
			case 9:
				return new PanelResidentTransferForm();
			case 10:
				return new PanelInventoryPersonalEffect();
			case 11:
				return new PanelResidentStatusSheet();
			case 12:
				return new PanelCarePlan();
			case 13:
				return new PanelInterdisciplinaryCarePlan();
				// case 14:
				// return new PanelDietaryAlertSheet();
			case 14:
				return new PanelConsentForm();
			case 15:
				return new PanelSkilledFlowSheet();
			default:

				return null;
			}
		} else {
			switch (index) {
			case 0:
				return new PanelDietaryCommunicationForm();
			case 1:
				return new PanelEnteralFeeding();
			case 2:
				return new PanelDietaryPlazaHealth();
			case 3:
				return new PanelResidentAssessmentFormPage15();
			case 4:
				return new PanelPsychopharmacologic();
			case 5:
				return new PanelInstructionForConductingTheResidentExamination();
			case 6:
				return new PanelAbnormalInvoluntryMovementScale();
			case 7:
				return new PanelPlazaHealthCare();
			case 8:
				return new PanelPsychopharmacologicMedications();
			case 9:
				return new PanelPsychotropicMedicationMonthlySummary();
			case 10:
				return new PanelPsychotropicMedicationMonthlySummaryRemaining();

			case 11:
				return new PanelAdvanceDirectivesDiscussionNursingHomeName();
			case 12:
				return new PanelMedicalOrdersLSTPage1();
			case 13:
				return new PanelMedicalOrdersLSTPage2();
			case 14:
				return new PanelMedicalOrdersLSTPage3();
			case 15:
				return new PanelMedicalOrdersLSTPage4();
			case 16:
				return new PanelDnrDnhForm();

			default:

				return null;
			}

		}

	}

	public static void main(String ar[]) {
		// SwingUtils.setupUI();
		// SwingUtils.runIt(new PanelMedicalOrdersLSTPage1());
	}

}
