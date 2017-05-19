package medrex.client.main.admission;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import medrex.client.PanelImage;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.constants.GlobalSecurity;
import medrex.client.main.admission.smokersAssessment.PanelAssessingResident1;
import medrex.client.main.admission.smokersAssessment.PanelAssessingResident2;
import medrex.client.main.admission.smokersAssessment.PanelAssessingResident3;
import medrex.client.mds.ui.PanelMDSPage;
import medrex.client.utils.ComponentPrintable;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.enums.SubAppTypes;
import medrex.commons.intf.Form;
import medrex.commons.vo.admission.AdmissionsRecord;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxScrollPane;

public class PanelAdmissionsRecordAdd extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7355070133954814336L;
	private JButton printButton;
	private JComboBox cmbStatus;

	private JTextField txtNotes;

	private JButton cancelButton;

	private JButton saveButton;

	private PanelImage panel;

	private boolean anError = false;

	private JComboBox cmbFormType;

	private Date creationDate;

	private Form[] forms;
	private JxScrollPane scrollPane;

	private PanelMDSPage panelPager;
	private PanelMDSPage panelPager2;

	private Color DEF_BACK_COL = new Color(24, 86, 110);
	private JxButton saveAsDraftButton;

	// private PanelSocialServiceInitialAssessmentFormPage1
	// panelSocialServiceInitialAssessmentFormPage1;

	/**
	 * Create the panel
	 */
	public PanelAdmissionsRecordAdd() {
		super();
		// Global.panelAdmissionsRecordAdd = this;
		// setPreferredSize(new Dimension(1024, 920));

		setPreferredSize(new Dimension(Toolkit.getDefaultToolkit()
				.getScreenSize().width, Toolkit.getDefaultToolkit()
				.getScreenSize().height - 50));
		setSize(new Dimension(
				Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
						.getDefaultToolkit().getScreenSize().height - 50));
		setBackground(DEF_BACK_COL);
		setLayout(null);

		if (Global.currentAdmissionRecordForm
				.equalsIgnoreCase("Resident Assessment Form")) {
			forms = new Form[16];
		} else if (Global.currentAdmissionRecordForm
				.equalsIgnoreCase("Social Service Initial Assessment Form")) {
			forms = new Form[2];
		} else if (Global.currentAdmissionRecordForm
				.equalsIgnoreCase("Smokers Assessment Form")) {
			forms = new Form[3];
		} else {
			forms = new Form[11];
		}

		panelPager = new PanelMDSPage();
		panelPager.setPageCount(forms.length);
		panelPager.setBounds(29, 46, 863, 35);
		panelPager.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName().equals(
						PanelMDSPage.PAGE_BUTTON_CLICKED)) {
					showResidentAssesmentFormPage((Integer) evt.getNewValue());
				}
			}
		});
		add(panelPager);

		final JLabel typeOfFormLabel = new JLabel();
		typeOfFormLabel.setFont(new Font("", Font.BOLD, 12));
		typeOfFormLabel.setText("TYPE OF FORM");
		typeOfFormLabel.setBounds(1005, 3, 83, 16);
		typeOfFormLabel.setVisible(false);
		add(typeOfFormLabel);

		cmbFormType = new JComboBox();
		cmbFormType.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				doFormChanged();
			}
		});

		cmbFormType.setBounds(1021, 46, 249, 25);
		cmbFormType.setVisible(false);
		add(cmbFormType);

		scrollPane = new JxScrollPane();
		scrollPane.setBounds(28, 120, 971, 500);
		add(scrollPane);

		panel = new PanelImage();
		panel.setArc(0.4f);
		panel.setCurvedView(true);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		panel.setBounds(907, 3, 92, 74);
		add(panel);

		txtNotes = new JTextField();
		txtNotes.setVisible(false);
		txtNotes.setBounds(1226, 9, 22, 21);
		add(txtNotes);

		cmbStatus = new JComboBox();
		cmbStatus.setBackground(Color.WHITE);
		cmbStatus.setEditable(true);

		cmbStatus.setBounds(1111, 8, 88, 21);

		add(cmbStatus);
		cmbStatus.setVisible(false);

		// panelAdmissionRecordPageEmpty.setVisible(false);
		// panelAmissionsRecordPageResidentAssForm.setVisible(false);

		final JPanel panel_1 = new JPanel();
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_1.setLayout(flowLayout);
		panel_1.setOpaque(false);
		panel_1.setBounds(29, 3, 560, 37);
		add(panel_1);

		saveButton = new JxButton();
		// panel_1.add(saveButton);
		saveButton.setPreferredSize(new Dimension(106, 26));
		saveButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		saveButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				if (GlobalSecurity
						.isUpdatePriviledge(SubAppTypes.ADMISSION_RECORDS)) {

					if (doSave("save")) {
						// Global.panelAdmissionsRecord.updateAdmissionsRecordJTable();
						Global.frameAdmissionRecordAddNew.dispose();
					}
				}
			}
		});
		saveButton.setFont(new Font("Dialog", Font.BOLD, 12));
		saveButton.setText("Save");
		if (Global.viewOrUpdate != null) {
			if (!Global.viewOrUpdate.equalsIgnoreCase("view")) {
				panel_1.add(saveButton);
			} else {
				panel_1.remove(saveButton);
			}
		} else {
			panel_1.add(saveButton);
		}

		saveAsDraftButton = new JxButton();
		saveAsDraftButton.setPreferredSize(new Dimension(106, 26));
		// panel_1.add(saveAsDraftButton);
		saveAsDraftButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		saveAsDraftButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		saveAsDraftButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (GlobalSecurity
						.isUpdatePriviledge(SubAppTypes.ADMISSION_RECORDS)) {

					if (doSave("saveAsDraft")) {
						Global.frameAdmissionRecordAddNew.dispose();
					}
				}

			}
		});
		saveAsDraftButton.setFont(new Font("Dialog", Font.BOLD, 12));
		saveAsDraftButton.setText("Save As Draft");
		if (Global.viewOrUpdate != null) {
			if (!Global.viewOrUpdate.equalsIgnoreCase("view")) {
				panel_1.add(saveAsDraftButton);
			} else {
				panel_1.remove(saveAsDraftButton);
			}
		} else {
			panel_1.add(saveAsDraftButton);
		}

		cancelButton = new JxButton();
		cancelButton.setPreferredSize(new Dimension(106, 26));
		panel_1.add(cancelButton);
		cancelButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		cancelButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.frameAdmissionRecordAddNew.dispose();

			}
		});
		cancelButton.setFont(new Font("Dialog", Font.BOLD, 12));
		cancelButton.setText("Cancel");

		printButton = new JxButton();
		printButton.setPreferredSize(new Dimension(106, 26));
		panel_1.add(printButton);
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

		final JxButton printAllButton = new JxButton();
		printAllButton.setPreferredSize(new Dimension(106, 26));
		panel_1.add(printAllButton);
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
				try {
					for (int i = 0; i < forms.length; i++) {
						showResidentAssesmentFormPage(i + 1);
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
					try {
						printJob.print();
					} catch (Exception PrintException) {
						PrintException.printStackTrace();
					}
					fPrint.dispose();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		printAllButton.setText("Print All");
		fillCombos();
		updateData();

		final JLabel errorLabel = new JLabel();
		errorLabel.setOpaque(true);
		errorLabel.setBackground(new Color(255, 255, 102));
		errorLabel.setForeground(Color.RED);
		errorLabel.setText(" Nurse Signature Required");
		errorLabel.setBounds(29, 87, 970, 27);
		add(errorLabel);

		final JPanel panel_2 = new JPanel();
		panel_2.setFont(new Font("", Font.PLAIN, 18));
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(1020, 87, 241, 274);
		add(panel_2);

		final JLabel label = new JLabel();
		label.setForeground(new Color(0, 51, 153));
		label.setFont(new Font("", Font.BOLD, 18));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setBounds(10, 5, 221, 216);
		label
				.setText("<HTML> HELP / TIP <BR><BR> If resident is continent Please <BR> Select level of continent<HTML>");
		panel_2.add(label);

		final JCheckBox showErrorsCheckBox = new JCheckBox();
		showErrorsCheckBox.setForeground(Color.WHITE);
		showErrorsCheckBox.setSelected(true);
		showErrorsCheckBox.setOpaque(false);
		showErrorsCheckBox.setText("Show Errors");
		showErrorsCheckBox.setBounds(595, 7, 118, 24);
		showErrorsCheckBox.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				if (showErrorsCheckBox.isSelected()) {
					errorLabel.setVisible(true);
					scrollPane.setBounds(28, 120, 971, 500);
				} else {
					errorLabel.setVisible(false);
					scrollPane.setBounds(28, 81, 971, 500);
				}

			}
		});

		add(showErrorsCheckBox);

		final JCheckBox showHelpCheckBox = new JCheckBox();
		showHelpCheckBox.setForeground(Color.WHITE);
		showHelpCheckBox.setSelected(true);
		showHelpCheckBox.setOpaque(false);
		showHelpCheckBox.setText("Show Help");
		showHelpCheckBox.setBounds(719, 10, 118, 24);

		showHelpCheckBox.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				if (showHelpCheckBox.isSelected()) {
					panel_2.setVisible(true);
				} else {
					panel_2.setVisible(false);
				}
			}

		});

		add(showHelpCheckBox);
	}

	public boolean doSave(String str) {
		anError = false;
		AdmissionsRecord ar = new AdmissionsRecord();

		for (int i = 0; i < forms.length; i++) {
			if (forms[i] == null) {
				forms[i] = getForm(i);
				forms[i].doUpdate();
			}
		}

		if (cmbFormType.getSelectedItem().equals("Resident Assessment Form")) {
			// forms[0].doSave();
			if (str.equalsIgnoreCase("save")) {
				for (int i = 0; i < forms.length; i++) {
					showResidentAssesmentFormPage(i + 1);
					if (forms[i].doValidate()) {
						forms[i].doSave();
						anError = true;
						ar.setStatus("Complete");
					} else {
						showResidentAssesmentFormPage(i + 1);
						anError = false;
						break;
					}
				}
			} else {
				for (int i = 0; i < forms.length; i++) {
					forms[i].doSave();
				}
				ar.setStatus("Incomplete");
				anError = true;
			}

			ar.setFormId(Global.currentResidentAssessmentFormKey);
			// JOptionPane.showMessageDialog(this, "Saved successfully");
			// }
			//				
			// }
		} else if (cmbFormType.getSelectedItem().equals(
				"Social Service Initial Assessment Form")) {

			for (int i = 0; i < forms.length; i++) {
				forms[i].doSave();
			}
			anError = true;
			ar.setFormId(Global.currentSocialServiceInitialAssessmentKey);
			if (str.equalsIgnoreCase("save")) {
				ar.setStatus("Complete");
			} else {
				ar.setStatus("Incomplete");
			}
		} else if (cmbFormType.getSelectedItem().equals(
				"Smokers Assessment Form")) {

			for (int i = 0; i < forms.length; i++) {
				forms[i].doSave();
			}
			anError = true;
			ar.setFormId(Global.currentAssessingResident1);
			if (str.equalsIgnoreCase("save")) {
				ar.setStatus("Complete");
			} else {
				ar.setStatus("Incomplete");
			}
		} else {
			forms[0].doSave();
			Global.currentResidentAssessmentFormKey = Global.currentResidentAssessmentFormPage2Key;
			forms[0].doSave();
			for (int i = 1; i < forms.length; i++) {
				forms[i].doSave();
			}
			anError = true;
			ar.setFormId(Global.currentResidentAssessmentFormKey);
			if (str.equalsIgnoreCase("save")) {
				ar.setStatus("Complete");
			} else {
				ar.setStatus("Incomplete");
			}
		}
		ar.setSerial(Global.currentAdmissionsRecordKey);
		ar.setResidentId(Global.currentResidenceKey);
		ar.setFormType((String) cmbFormType.getSelectedItem());
		ar.setNotes(txtNotes.getText());

		Users users = new Users();
		try {
			users = MedrexClientManager.getInstance().getUser(
					Global.currentLoggedInUserKey);
		} catch (Exception e) {

		}

		// return (users.getUserType());
		ar.setUser(users.getUserName());

		if (Global.currentAdmissionsRecordKey == 0) {
			ar.setDateCreated(MedrexClientManager.getServerTime());
		} else {
			ar.setDateCreated(creationDate);
		}
		ar.setLastModified(MedrexClientManager.getServerTime());
		try {
			if (anError) {
				Global.currentAdmissionsRecordKey = MedrexClientManager
						.getInstance().insertOrUpdateAdmissionsRecord(ar);
			}

		} catch (Exception e) {

		}
		return anError;

	}

	public void fillCombos() {
		cmbFormType.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Resident Assessment Form",
				"Resident Quarterly Assessment Form",
				"Social Service Initial Assessment Form",
				"Smokers Assessment Form" }));
		cmbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Complete", "Incomplete" }));

	}

	public void updateData() {
		if (Global.currentAdmissionsRecordKey == 0) {
			cmbFormType.setEnabled(false);
			cmbFormType.setSelectedItem(Global.currentAdmissionRecordForm);

		} else {
			cmbFormType.setEnabled(false);
			AdmissionsRecord ar = null;
			try {
				ar = MedrexClientManager.getInstance().getAdmissionsRecord(
						Global.currentAdmissionsRecordKey);
			} catch (Exception e) {
			}
			cmbFormType.setSelectedItem(ar.getFormType());
			cmbStatus.setSelectedItem(ar.getStatus());
			if (ar.getStatus().equalsIgnoreCase("Complete")) {
				saveAsDraftButton.setVisible(false);
			}
			txtNotes.setText(ar.getNotes());
			creationDate = ar.getDateCreated();
		}
		// if (((String) cmbFormType.getSelectedItem())
		// .equalsIgnoreCase("Resident Assessment Form")) {
		doFormChanged();
		// }
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
				.equalsIgnoreCase("Resident Assessment Form")) {

			if (Global.currentAdmissionsRecordKey != 0) {
				AdmissionsRecord ar = null;
				try {
					ar = MedrexClientManager.getInstance().getAdmissionsRecord(
							Global.currentAdmissionsRecordKey);
				} catch (Exception e) {
				}
				Global.currentResidentAssessmentFormKey = ar.getFormId();
			} else {
				Global.currentResidentAssessmentFormKey = 0;
				Global.currentResidentAssessmentFormPage2Key = 0;
				Global.currentResidentAssessmentFormPage3Key = 0;
				Global.currentResidentAssessmentFormPage4Key = 0;
				Global.currentResidentAssessmentFormPage5Key = 0;
				Global.currentResidentAssessmentFormPage6Key = 0;
				Global.currentResidentAssessmentFormPage7Key = 0;
				Global.currentResidentAssessmentFormPage8Key = 0;
				Global.currentResidentAssessmentFormPage9Key = 0;
				Global.currentResidentAssessmentFormPage10Key = 0;
				Global.currentResidentAssessmentFormPage11Key = 0;
				Global.currentResidentAssessmentFormPage12Key = 0;
				Global.currentResidentAssessmentFormPage13Key = 0;
				Global.currentResidentAssessmentFormPage14Key = 0;
				Global.currentResidentAssessmentFormPage15Key = 0;
				Global.currentResidentAssessmentFormPage16Key = 0;
				Global.currentResidentAssessmentFormPage17Key = 0;
				Global.currentResidentAssessmentFormPage18Key = 0;
				Global.currentResidentAssessmentFormPage19Key = 0;
				Global.currentResidentAssessmentFormPage20Key = 0;
				// Global.currentResidentAssessmentFormPage21Key = 0;
				// Global.currentResidentAssessmentFormPage22Key = 0;
				Global.currentResidentImmunizationRecordKey = 0;

			}
			Global.currentResidentAssessmentFormPage = 1;

		} else if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Social Service Initial Assessment Form")) {

			if (Global.currentAdmissionsRecordKey != 0) {
				AdmissionsRecord ar = null;
				try {
					ar = MedrexClientManager.getInstance().getAdmissionsRecord(
							Global.currentAdmissionsRecordKey);
				} catch (Exception e) {
					e.printStackTrace();
				}
				Global.currentSocialServiceInitialAssessmentKey = ar
						.getFormId();

			} else {
				Global.currentSocialServiceInitialAssessmentKey = 0;
				Global.currentSocialServiceInitialAssessmentForm2Key = 0;

			}
		} else if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Smokers Assessment Form")) {

			if (Global.currentAdmissionsRecordKey != 0) {
				AdmissionsRecord ar = null;
				try {
					ar = MedrexClientManager.getInstance().getAdmissionsRecord(
							Global.currentAdmissionsRecordKey);
				} catch (Exception e) {
					e.printStackTrace();
				}
				Global.currentAssessingResident1 = ar.getFormId();

			} else {
				Global.currentAssessingResident1 = 0;
				Global.currentAssessingResident2 = 0;
				Global.currentAssessingResident3 = 0;
			}
		} else {
			if (Global.currentAdmissionsRecordKey != 0) {
				AdmissionsRecord ar = null;
				try {
					ar = MedrexClientManager.getInstance().getAdmissionsRecord(
							Global.currentAdmissionsRecordKey);
				} catch (Exception e) {
				}
				Global.currentResidentAssessmentFormKey = ar.getFormId();
			} else {
				Global.currentResidentAssessmentFormPage2Key = 0;
				Global.currentResidentAssessmentFormPage5Key = 0;
				Global.currentResidentAssessmentFormPage7Key = 0;
				Global.currentResidentAssessmentFormPage8Key = 0;
				Global.currentResidentAssessmentFormPage9Key = 0;
				Global.currentResidentAssessmentFormPage10Key = 0;
				Global.currentResidentAssessmentFormPage12Key = 0;
				Global.currentResidentQuarterlyAssessmentFormPage7 = 0;
				Global.currentResidentQuarterlyAssessmentFormPage8 = 0;
				Global.currentResidentQuarterlyAssessmentFormPage9 = 0;

			}
			Global.currentResidentAssessmentFormPage = 2;

		}

		showResidentAssesmentFormPage(1);
		
//		if (forms[0] == null) {
//			forms[0] = getForm(0);
//		}
//		scrollPane.setViewportView((Component) forms[0]);
//		scrollPane.getViewport().setViewPosition(new Point(0, 0));
//		scrollPane.updateUI();
		// panelAdmissionRecordPageEmpty.setVisible(false);
		// panelAmissionsRecordPageResidentAssForm.setVisible(true);
		// panelAmissionsRecordPageResidentAssForm.updateUI();
//		forms[0].doUpdate();

		// else {//else {
		// panelAdmissionRecordPageEmpty.setVisible(true);
		// panelAmissionsRecordPageResidentAssForm.setVisible(false);
		// panelAdmissionRecordPageEmpty.updateUI();
		// Global.currentResidentAssessmentFormPage = 0;
		// scrollPane.setViewportView(new PanelAdmissionsRecordEmptyForm());
		// scrollPane.updateUI();
		// scrollPane.setViewportView(panelAdmissionRecordEmptyForm);
		// scrollPane.updateUI();
		// }
	}

	public void showResidentAssesmentFormPage(int pageNum) {

		Global.currentResidentAssessmentFormPage = pageNum;

		Form form = forms[pageNum - 1];
		if (form == null) {
			form = getForm(pageNum - 1);
			forms[pageNum - 1] = form;
			form.doUpdate();
		}
		if (pageNum == 23 || pageNum == 11 || pageNum == 10 || pageNum == 9) {
			form.doLoad();
		}
		scrollPane.setViewportView((Component) form);
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				scrollPane.getViewport().setViewPosition(new Point(0, 0));
				scrollPane.getVerticalScrollBar().setValue(0);
				scrollPane.updateUI();
			};	
		});
	}

	public Form getForm(int index) {
		if (Global.currentAdmissionRecordForm
				.equalsIgnoreCase("Resident Assessment Form")) {
			switch (index) {
			case 0:
				return new PanelResidentAssessmentFormPage1();
			case 1:
				return new PanelResidentAssessmentFormPage4();
			case 2:
				return new PanelResidentAssessmentFormPage3();
			case 3:
				return new PanelResidentAssessmentFormPage2();
			case 4:
				return new PanelResidentAssessmentFormPage5();
			case 5:
				return new PanelResidentAssessmentFormPage6();
			case 6:
				return new PanelResidentAssessmentFormPage7();
			case 7:
				return new PanelResidentAssessmentFormPage8();
			case 8:
				return new PanelResidentAssessmentFormPage9();
			case 9:
				return new PanelResidentAssessmentFormPage10();
			case 10:
				return new PanelResidentAssessmentFormPage11();
			case 11:
				return new PanelResidentAssessmentFormPage13();
				/*
				 * case 12: return new PanelResidentAssessmentFormPage15();
				 */
			case 12:
				return new PanelResidentAssessmentFormPage16();
			case 13:
				return new PanelResidentAssessmentFormPage17();
				/*
				 * case 15: return new PanelResidentAssessmentFormPage18();
				 */
			case 14:
				return new PanelResidentImmunizationRecord();
				/*
				 * case 17: return new PanelResidentAssessmentFormPage19(); case
				 * 18: return new PanelResidentAssessmentFormPage20();
				 */
				// case 19:
				// return new PanelResidentAssessmentFormPage21();
				// case 20:
				// return new PanelResidentAssessmentFormPage22();
			case 15:
				return new PanelResidentAssessmentFormPage23();
			default:
				return null;
			}
		} else if (Global.currentAdmissionRecordForm
				.equalsIgnoreCase("Social Service Initial Assessment Form")) {
			switch (index) {
			case 0:
				return new PanelSocialServiceInitialAssessmentFormPage1();
			case 1:
				return new PanelSocialServiceInitialAssessmentFormPage2();
				// case 2:
				// return new PanelNutritionSupportAssessmentFormPage1();
			default:
				return null;
			}

		} else if (Global.currentAdmissionRecordForm
				.equalsIgnoreCase("Smokers Assessment Form")) {
			switch (index) {
			case 0:
				return new PanelAssessingResident1();
			case 1:
				return new PanelAssessingResident2();
			case 2:
				return new PanelAssessingResident3();
			default:
				return null;
			}

		} else {
			switch (index) {
			case 0:
				return new PanelResidentAssessmentFormPage2();
			case 1:
				return new PanelResidentAssessmentFormPage5();
			case 2:
				return new PanelResidentAssessmentFormPage7();
			case 3:
				return new PanelResidentAssessmentFormPage8();
			case 4:
				return new PanelResidentAssessmentFormPage9();
			case 5:
				return new PanelResidentAssessmentFormPage10();
			case 6:
				return new PanelResidentAssessmentFormPage12();
			case 7:
				return new PanelResidentQuarterlyAssessmentFormPage7();
			case 8:
				return new PanelResidentQuarterlyAssessmentFormPage8();
			case 9:
				return new PanelResidentQuarterlyAssessmentFormPage9();
			case 10:
				return new PanelResidentAssessmentFormPage13();
			default:
				return null;
			}
		}

	}

}
