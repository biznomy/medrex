package medrex.client.main.historyandphysical;

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
import medrex.client.constants.GlobalSecurity;
import medrex.client.main.admission.PanelResidentImmunizationRecord;
import medrex.client.mds.ui.PanelMDSPage;
import medrex.client.utils.ComponentPrintable;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.enums.SubAppTypes;
import medrex.commons.intf.Form;
import medrex.commons.vo.historyAndPhysical.HistoryAndPhysical;
import medrex.commons.vo.physicianOrders.PhysicianOrders;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxScrollPane;

public class PanelHistoryAndPhysicalAdd extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7320502352712569173L;
	private JButton printButton;
	private PanelImage panel;
	private JComboBox cmbStatus;

	private JTextField txtNotes;

	private JComboBox cmbFormType;

	private Date creationDate;

	private Form[] forms;

	private boolean anError;

	private PanelHistoryAndPhysicalGeneralFormPage1 panelHistoryAndPhysicalGeneralFormPage1;

	private PanelHistoryAndPhysicalGeneralFormPage2 panelHistoryAndPhysicalGeneralFormPage2;

	private PanelResidentImmunizationRecord panelResidentImmunizationRecord;

	PanelCumulativeDiagnosisForm panelCumulativeDiagnosisForm;

	PanelMontlhlyVitalSheetForm panelMontlhlyVitalSheetForm;

	PanelWeeklyWeightsForm panelWeeklyWeightsForm;

	private JxScrollPane scrollPane;

	// private PanelMDSPage panelPager;

	// private PanelConsultantPageEmpty panelConsultantPageEmpty;

	// private PanelConsultantPageRenalDialysisCommunicationForm
	// panelConsultantPageRenalDialysisCommunicationForm;

	private PanelMDSPage panelPager;

	private Color DEF_BACK_COL = new Color(24, 86, 110);
	private Color DEF_BUT_BACK = new Color(130, 163, 175);
	private Color DEF_BUT_FORE = new Color(8, 68, 95);

	/**
	 * Create the panel
	 */
	public PanelHistoryAndPhysicalAdd() {
		super();
		// Global.panelHistoryAndPhysicalAdd = this;
		setPreferredSize(new Dimension(Toolkit.getDefaultToolkit()
				.getScreenSize().width, Toolkit.getDefaultToolkit()
				.getScreenSize().height - 50));
		setSize(new Dimension(
				Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
						.getDefaultToolkit().getScreenSize().height - 50));
		setBackground(DEF_BACK_COL);
		setLayout(null);

		final JLabel typeOfFormLabel = new JLabel();
		typeOfFormLabel.setFont(new Font("", Font.BOLD, 12));
		typeOfFormLabel.setText("TYPE OF FORM");
		typeOfFormLabel.setBounds(1007, 15, 48, 16);
		typeOfFormLabel.setVisible(false);
		add(typeOfFormLabel);

		cmbFormType = new JComboBox();
		cmbFormType.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				doFormChanged();
			}
		});

		cmbFormType.setBounds(1010, 56, 203, 25);
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
						.isUpdatePriviledge(SubAppTypes.HISTORY_PHYSICAL)) {
					doSave();
					// Global.panelHistoryAndPhysical.updateHistoryAndPhysicalJTable();
					Global.frameHistoryAndPhysicalAddNew.dispose();
				}
			}
		});
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.setText("Save");
		saveButton.setBounds(106, 7, 106, 26);
		add(saveButton);

		final JxButton cancelButton = new JxButton();
		cancelButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		cancelButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.frameHistoryAndPhysicalAddNew.dispose();
			}
		});
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setText("Cancel");
		cancelButton.setBounds(239, 7, 106, 26);
		add(cancelButton);

		final JLabel descriptionLabel = new JLabel();
		descriptionLabel.setFont(new Font("", Font.BOLD, 12));
		descriptionLabel.setText("DESCRIPTION");
		descriptionLabel.setBounds(1079, 15, 48, 16);
		descriptionLabel.setVisible(false);
		add(descriptionLabel);

		txtNotes = new JTextField();
		txtNotes.setBounds(1211, 13, 59, 20);
		txtNotes.setVisible(false);
		add(txtNotes);

		final JLabel statuLabel = new JLabel();
		statuLabel.setFont(new Font("", Font.BOLD, 12));
		statuLabel.setText("STATUS");
		statuLabel.setBounds(1148, 15, 32, 16);
		statuLabel.setVisible(false);
		add(statuLabel);

		cmbStatus = new JComboBox();
		cmbStatus.setBounds(1219, 56, 40, 25);
		cmbStatus.setVisible(false);
		add(cmbStatus);

		scrollPane = new JxScrollPane();
		scrollPane.setBounds(28, 81, 975, this.getSize().height - 81 - 50);
		add(scrollPane);

		// panelHistoryAndPhysicalGeneralFormPage1 = new
		// PanelHistoryAndPhysicalGeneralFormPage1();
		//
		// panelHistoryAndPhysicalGeneralFormPage2 = new
		// PanelHistoryAndPhysicalGeneralFormPage2();
		//
		// panelCumulativeDiagnosisForm = new PanelCumulativeDiagnosisForm();

		// panelConsultantPageEmpty = new PanelConsultantPageEmpty();

		// panelMontlhlyVitalSheetForm = new PanelMontlhlyVitalSheetForm();
		//
		// panelWeeklyWeightsForm = new PanelWeeklyWeightsForm();
		//
		// panelResidentImmunizationRecord = new
		// PanelResidentImmunizationRecord();

		// panelConsultantPageEmpty.setBounds(106, 40, 783, 35);
		// add(panelConsultantPageEmpty);

		if (Global.currentHistoryForm
				.equalsIgnoreCase("History And Physical General")) {
			forms = new Form[2];
		} else if (Global.currentHistoryForm
				.equalsIgnoreCase("Cumulative Diagnosis")) {
			forms = new Form[1];
		} else if (Global.currentHistoryForm
				.equalsIgnoreCase("Monthly Vital Signs And Weight Sheet")) {
			forms = new Form[1];
		} else if (Global.currentHistoryForm.equalsIgnoreCase("Weekly Weights")) {
			forms = new Form[1];
		}
		panelPager = new PanelMDSPage();
		panelPager.setPageCount(forms.length);
		panelPager.setBounds(29, 46, 863, 35);
		panelPager.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName().equals(
						PanelMDSPage.PAGE_BUTTON_CLICKED)) {
					showHistoryAndPhysicalForm((Integer) evt.getNewValue());
				}
			}
		});
		add(panelPager);

		// panelConsultantPageEmpty.setVisible(false);
		panelPager.setVisible(true);

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
			public void actionPerformed(final ActionEvent arg0) {
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
		printButton.setBounds(363, 7, 106, 26);
		add(printButton);

		fillCombos();
		updateData();
		// doFormChanged();

	}

	private void showHistoryAndPhysicalForm(Integer pageNum) {
		// Global.currentHistoryAndPhysicalKey = pageNum;

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

		if (Global.currentHistoryForm
				.equalsIgnoreCase("History And Physical General")) {
			switch (index) {
			case 0:
				return new PanelHistoryAndPhysicalGeneralFormPage1();
			case 1:
				return new PanelHistoryAndPhysicalGeneralFormPage2();
			default:
				return null;
			}
		} else if (Global.currentHistoryForm
				.equalsIgnoreCase("Cumulative Diagnosis")) {
			switch (index) {
			case 0:
				return new PanelCumulativeDiagnosisForm();
			default:

				return null;
			}
		} else if (Global.currentHistoryForm
				.equalsIgnoreCase("Monthly Vital Signs And Weight Sheet")) {
			switch (index) {
			case 0:
				return new PanelMontlhlyVitalSheetForm();
			default:

				return null;
			}
		} else {
			switch (index) {
			case 0:
				return new PanelWeeklyWeightsForm();
			default:
				return null;
			}

		}
	}

	public void doSave() {
		HistoryAndPhysical ar = new HistoryAndPhysical();
		ar.setFormId(0);
		for (int i = 0; i < forms.length; i++) {
			if (forms[i] == null) {
				forms[i] = getForm(i);
				forms[i].doUpdate();
			}
		}
		if (cmbFormType.getSelectedItem()
				.equals("History And Physical General")) {

			for (int i = 0; i < forms.length; i++) {
				showHistoryAndPhysicalForm(i + 1);
				if (forms[i].doValidate()) {
					forms[i].doSave();
					anError = true;
					ar.setStatus("Complete");
				} else {
					showHistoryAndPhysicalForm(i + 1);
					anError = false;
					break;
				}
			}
			anError = false;
			ar.setFormId(Global.currentHistoryAndPhysicalGeneralFormPage1Key);
			ar.setSerial(Global.currentHistoryAndPhysicalKey);
			ar.setResidentId(Global.currentResidenceKey);
			ar.setFormType((String) cmbFormType.getSelectedItem());
			ar.setNotes(txtNotes.getText());
			ar.setUser("Admin");
			ar.setStatus((String) cmbStatus.getSelectedItem());
			if (Global.currentConsultantKey == 0) {
				ar.setDateCreated(MedrexClientManager.getServerTime());
			} else {
				ar.setDateCreated(creationDate);
			}
			ar.setLastModified(MedrexClientManager.getServerTime());
			try {
				Global.currentHistoryAndPhysicalKey = MedrexClientManager
						.getInstance().insertOrUpdateHistoryAndPhysical(ar);
			} catch (Exception e) {

			}
		}
		if (cmbFormType.getSelectedItem().equals("Resident Immunization Form")) {

			for (int i = 0; i < forms.length; i++) {
				showHistoryAndPhysicalForm(i + 1);
				if (forms[i].doValidate()) {
					forms[i].doSave();
					anError = true;
					ar.setStatus("Complete");
				} else {
					showHistoryAndPhysicalForm(i + 1);
					anError = false;
					break;
				}
			}
			anError = false;
			ar.setFormId(Global.currentResidentImmunizationKey);
			ar.setSerial(Global.currentHistoryAndPhysicalKey);
			ar.setResidentId(Global.currentResidenceKey);
			ar.setFormType((String) cmbFormType.getSelectedItem());
			ar.setNotes(txtNotes.getText());
			ar.setUser("Admin");
			ar.setStatus((String) cmbStatus.getSelectedItem());
			if (Global.currentConsultantKey == 0) {
				ar.setDateCreated(MedrexClientManager.getServerTime());
			} else {
				ar.setDateCreated(creationDate);
			}
			ar.setLastModified(MedrexClientManager.getServerTime());
			try {
				Global.currentHistoryAndPhysicalKey = MedrexClientManager
						.getInstance().insertOrUpdateHistoryAndPhysical(ar);
			} catch (Exception e) {

			}
		}

		if (cmbFormType.getSelectedItem().equals("Cumulative Diagnosis")) {
			for (int i = 0; i < forms.length; i++) {
				showHistoryAndPhysicalForm(i + 1);
				if (forms[i].doValidate()) {
					forms[i].doSave();
					anError = true;
					ar.setStatus("Complete");
				} else {
					showHistoryAndPhysicalForm(i + 1);
					anError = false;
					break;
				}
			}
			anError = false;
			ar.setFormId(Global.currentCumulativeDiagnosisFormKey);
			ar.setSerial(Global.currentHistoryAndPhysicalKey);
			ar.setResidentId(Global.currentResidenceKey);
			ar.setFormType((String) cmbFormType.getSelectedItem());
			ar.setNotes(txtNotes.getText());
			ar.setUser("Admin");
			ar.setStatus((String) cmbStatus.getSelectedItem());
			if (Global.currentConsultantKey == 0) {
				ar.setDateCreated(MedrexClientManager.getServerTime());
			} else {
				ar.setDateCreated(creationDate);
			}
			ar.setLastModified(MedrexClientManager.getServerTime());
			try {
				Global.currentHistoryAndPhysicalKey = MedrexClientManager
						.getInstance().insertOrUpdateHistoryAndPhysical(ar);
			} catch (Exception e) {

			}

		}

		if (cmbFormType.getSelectedItem().equals(
				"Monthly Vital Signs And Weight Sheet")) {
			for (int i = 0; i < forms.length; i++) {
				showHistoryAndPhysicalForm(i + 1);
				if (forms[i].doValidate()) {
					forms[i].doSave();
					anError = true;
					ar.setStatus("Complete");
				} else {
					showHistoryAndPhysicalForm(i + 1);
					anError = false;
					break;
				}
			}
			anError = false;
			ar.setFormId(Global.currentMonthlyVitalSheetFormKey);
			ar.setSerial(Global.currentHistoryAndPhysicalKey);
			ar.setResidentId(Global.currentResidenceKey);
			ar.setFormType((String) cmbFormType.getSelectedItem());
			ar.setNotes(txtNotes.getText());
			ar.setUser("Admin");
			ar.setStatus((String) cmbStatus.getSelectedItem());
			if (Global.currentConsultantKey == 0) {
				ar.setDateCreated(MedrexClientManager.getServerTime());
			} else {
				ar.setDateCreated(creationDate);
			}
			ar.setLastModified(MedrexClientManager.getServerTime());
			try {
				Global.currentHistoryAndPhysicalKey = MedrexClientManager
						.getInstance().insertOrUpdateHistoryAndPhysical(ar);
			} catch (Exception e) {

			}

		}

		if (cmbFormType.getSelectedItem().equals("Weekly Weights")) {
			for (int i = 0; i < forms.length; i++) {
				showHistoryAndPhysicalForm(i + 1);
				if (forms[i].doValidate()) {
					forms[i].doSave();
					anError = true;
					ar.setStatus("Complete");
				} else {
					showHistoryAndPhysicalForm(i + 1);
					anError = false;
					break;
				}
			}
			anError = false;
			ar.setFormId(Global.currentWeeklyWeightsFormKey);
			ar.setSerial(Global.currentHistoryAndPhysicalKey);
			ar.setResidentId(Global.currentResidenceKey);
			ar.setFormType((String) cmbFormType.getSelectedItem());
			ar.setNotes(txtNotes.getText());
			ar.setUser("Admin");
			ar.setStatus((String) cmbStatus.getSelectedItem());
			if (Global.currentConsultantKey == 0) {
				ar.setDateCreated(MedrexClientManager.getServerTime());
			} else {
				ar.setDateCreated(creationDate);
			}
			ar.setLastModified(MedrexClientManager.getServerTime());
			try {
				Global.currentHistoryAndPhysicalKey = MedrexClientManager
						.getInstance().insertOrUpdateHistoryAndPhysical(ar);
			} catch (Exception e) {

			}

		}

	}

	public void fillCombos() {
		cmbFormType.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"History And Physical General", "Resident Immunization Form",
				"Cumulative Diagnosis", "Monthly Vital Signs And Weight Sheet",
				"Weekly Weights" }));

		cmbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Complete", "Incomplete" }));
	}

	public void updateData() {
		if (Global.currentHistoryAndPhysicalKey == 0) {
			cmbFormType.setEnabled(false);
			cmbFormType.setSelectedItem(Global.currentHistoryForm);

		} else {
			HistoryAndPhysical ar = null;
			try {
				ar = MedrexClientManager.getInstance().getHistoryAndPhysical(
						Global.currentHistoryAndPhysicalKey);
			} catch (Exception e) {
			}
			cmbFormType.setSelectedItem(ar.getFormType());
			cmbStatus.setSelectedItem(ar.getStatus());
			txtNotes.setText(ar.getNotes());
			creationDate = ar.getDateCreated();
		}
		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("History And Physical General")) {
			doFormChanged();
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
	}

	public void doFormChanged() {
		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("History And Physical General")) {

			if (Global.currentHistoryAndPhysicalKey != 0) {
				HistoryAndPhysical ar = null;
				try {
					ar = MedrexClientManager.getInstance()
							.getHistoryAndPhysical(
									Global.currentHistoryAndPhysicalKey);
				} catch (Exception e) {
				}
				Global.currentHistoryAndPhysicalGeneralFormPage1Key = ar
						.getFormId();
			} else {
				Global.currentHistoryAndPhysicalGeneralFormPage1Key = 0;
				Global.currentHistoryAndPhysicalGeneralFormPage2Key = 0;
			}
		}

		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Cumulative Diagnosis")) {

			if (Global.currentHistoryAndPhysicalKey != 0) {
				HistoryAndPhysical ar = null;
				try {
					ar = MedrexClientManager.getInstance()
							.getHistoryAndPhysical(
									Global.currentHistoryAndPhysicalKey);
				} catch (Exception e) {
				}
				Global.currentCumulativeDiagnosisFormKey = ar.getFormId();
			} else {
				Global.currentCumulativeDiagnosisFormKey = 0;
			}
		}

		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Monthly Vital Signs And Weight Sheet")) {

			if (Global.currentHistoryAndPhysicalKey != 0) {
				HistoryAndPhysical ar = null;
				try {
					ar = MedrexClientManager.getInstance()
							.getHistoryAndPhysical(
									Global.currentHistoryAndPhysicalKey);
				} catch (Exception e) {
				}
				Global.currentMonthlyVitalSheetFormKey = ar.getFormId();
			} else {
				Global.currentMonthlyVitalSheetFormKey = 0;
				// Global.currentHistoryAndPhysicalGeneralFormPage2Key=0;
			}
		}

		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Resident Immunization Form")) {

			if (Global.currentPhysisianOrdersKey != 0) {
				PhysicianOrders ls = null;
				try {
					ls = MedrexClientManager.getInstance().getPhysicianOrder(
							Global.currentPhysisianOrdersKey);
				} catch (Exception e) {
				}
				Global.currentResidentImmunizationRecordKey = ls.getFormId();
			} else {
				Global.currentResidentImmunizationRecordKey = 0;
			}
		}
		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Weekly Weights")) {

			if (Global.currentHistoryAndPhysicalKey != 0) {
				HistoryAndPhysical ar = null;
				try {
					ar = MedrexClientManager.getInstance()
							.getHistoryAndPhysical(
									Global.currentHistoryAndPhysicalKey);
				} catch (Exception e) {
				}
				Global.currentWeeklyWeightsFormKey = ar.getFormId();
			} else {
				Global.currentWeeklyWeightsFormKey = 0;
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
}
