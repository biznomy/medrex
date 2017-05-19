package medrex.client.main.dietary;

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
import medrex.client.utils.ComponentPrintable;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.enums.SubAppTypes;
import medrex.commons.vo.dietary.Dietary;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxScrollPane;

public class PanelDietaryAdd extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -383684476279602963L;
	private JButton printButton;
	private PanelImage panel;
	private JComboBox cmbStatus;
	private JTextField txtNotes;
	private JComboBox cmbFormType;
	private Date creationDate;
	// private PanelAdmissionsRecordEmptyForm panelAdmissionRecordEmptyForm;
	// private PanelDietaryCommunicationForm panelDietaryCommunicationForm;

	private PanelDietaryResidentDiagnosis panelDietaryResidentDiagnosis;
	// private PanelEnteralFeeding panelEnteralFeeding;
	// private PanelDietaryPlazaHealth panelDietaryPlazaHealth;

	private PanelNutritionSupportAssessmentFormPage1 panelNutritionSupportAssessmentFormPage1;
	private PanelDietaryAlertSheet panelDietaryASheet;

	private JxScrollPane scrollPane;
	private JPanel panelPager;
	// private PanelDietaryPageEmpty panelDietaryPageEmpty;

	private Color DEF_BACK_COL = new Color(24, 86, 110);
	private Color DEF_BUT_BACK = new Color(130, 163, 175);
	private Color DEF_BUT_FORE = new Color(8, 68, 95);

	/**
	 * Create the panel
	 */
	public PanelDietaryAdd() {
		super();
		// Global.panelDietaryAdd = this;
		// setPreferredSize(new Dimension(1024, 920));
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
		typeOfFormLabel.setBounds(1039, 14, 26, 16);
		typeOfFormLabel.setVisible(false);
		add(typeOfFormLabel);

		cmbFormType = new JComboBox();
		cmbFormType.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				doFormChanged();
			}
		});

		cmbFormType.setBounds(1071, 10, 51, 25);
		cmbFormType.setVisible(false);
		add(cmbFormType);

		final JxButton saveButton = new JxButton();
		saveButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		saveButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (GlobalSecurity.isUpdatePriviledge(SubAppTypes.DIETARY)) {
					doSave();
					// Global.panelDietary.updateDietaryJTable();
					Global.frameDietaryAddNew.dispose();
				}
			}
		});
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.setText("Save");
		saveButton.setBounds(100, 9, 106, 26);
		add(saveButton);

		final JxButton cancelButton = new JxButton();
		cancelButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		cancelButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.frameDietaryAddNew.dispose();
			}
		});
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setText("Cancel");
		cancelButton.setBounds(233, 9, 106, 26);

		add(cancelButton);

		final JLabel descriptionLabel = new JLabel();
		descriptionLabel.setFont(new Font("", Font.BOLD, 12));
		descriptionLabel.setText("DESCRIPTION");
		descriptionLabel.setBounds(1128, 14, 51, 16);
		descriptionLabel.setVisible(false);
		add(descriptionLabel);

		txtNotes = new JTextField();
		txtNotes.setBounds(1185, 12, 32, 20);
		txtNotes.setVisible(false);
		add(txtNotes);

		final JLabel statuLabel = new JLabel();
		statuLabel.setFont(new Font("", Font.BOLD, 12));
		statuLabel.setText("STATUS");
		statuLabel.setBounds(1039, 50, 26, 16);
		statuLabel.setVisible(false);
		add(statuLabel);

		cmbStatus = new JComboBox();
		cmbStatus.setBounds(1071, 46, 51, 25);
		cmbStatus.setVisible(false);
		add(cmbStatus);

		scrollPane = new JxScrollPane();
		scrollPane.setBounds(28, 81, 975, this.getSize().height - 81 - 50);
		add(scrollPane);

		// panelAdmissionRecordEmptyForm = new PanelAdmissionsRecordEmptyForm();
		// panelAdmissionRecordEmptyForm.setPreferredSize(new Dimension(935,
		// 0));
		// scrollPane.setViewportView(panelAdmissionRecordEmptyForm);

		// panelDietaryPageEmpty = new PanelDietaryPageEmpty();
		//
		// panelDietaryPageEmpty.setBounds(99, 40, 773, 35);
		// add(panelDietaryPageEmpty);

		// panelDietaryCommunicationForm = new PanelDietaryCommunicationForm();
		panelDietaryResidentDiagnosis = new PanelDietaryResidentDiagnosis();
		// panelEnteralFeeding = new PanelEnteralFeeding();
		// panelDietaryPlazaHealth = new PanelDietaryPlazaHealth();
		panelNutritionSupportAssessmentFormPage1 = new PanelNutritionSupportAssessmentFormPage1();
		panelDietaryASheet = new PanelDietaryAlertSheet();
		// panelAmissionsRecordPageResidentAssForm = new
		// PanelDietaryPageResidentAssForm();
		// panelAmissionsRecordPageResidentAssForm.setLayout(null);
		// panelAmissionsRecordPageResidentAssForm.setBounds(29, 642, 968, 35);
		// add(panelAmissionsRecordPageResidentAssForm);

		// panelDietaryPageEmpty.setVisible(false);
		// panelAmissionsRecordPageResidentAssForm.setVisible(false);

		panel = new PanelImage();
		panel.setArc(0.4f);
		panel.setCurvedView(true);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		panel.setBounds(909, 5, 92, 74);
		add(panel);
		// doFormChanged();

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
		printButton.setBounds(365, 9, 106, 26);
		add(printButton);

		fillCombos();
		updateData();
	}

	public void doSave() {
		Dietary ar = new Dietary();
		/*
		 * if
		 * (cmbFormType.getSelectedItem().equals("Dietary Communication Form"))
		 * { Global.panelDietaryCommunicationForm.doSave();
		 * ar.setFormId(Global.currentDietaryCommunicationFormKey); }
		 * 
		 * else
		 */if (cmbFormType.getSelectedItem().equals("Nutrition Assessment")) {
			Global.panelDietaryResidentDiagnosis.doSave();
			ar.setFormId(Global.currentDietaryResidentDiagnosisKey);
		}/*
		 * else if (cmbFormType.getSelectedItem().equals(
		 * "Enteral Feeding Progress Notes")) {
		 * Global.panelEnteralFeeding.doSave();
		 * ar.setFormId(Global.currentEnteralFeedingKey); }
		 *//*
			 * else if (cmbFormType.getSelectedItem().equals(
			 * "Consultant Dietician Nutritional Recommendations")) {
			 * Global.panelDietaryPlazaHealth.doSave();
			 * ar.setFormId(Global.currentDietaryPlazaHealthKey); }else
			 */
		if (cmbFormType.getSelectedItem().equals(
				"Nutrition Support Assessment Form")) {
			Global.currentNutritionSupportAssessmentFormKey = Global.panelNutritionSupportAssessmentForm
					.doSave();
			// System.out.println("Form ID Is Setting :"+Global.currentNutritionSupportAssessmentFormKey);
			ar.setFormId(Global.currentNutritionSupportAssessmentFormKey);
		} else if (cmbFormType.getSelectedItem().equals("Dietary Alert Sheet")) {
			Global.currentDietaryAlertSheetKey = Global.panelDietaryAlertSheet
					.doSave();
			ar.setFormId(Global.currentDietaryAlertSheetKey);
		}
		// changed
		// else {
		// ar.setFormId(0);
		// }
		ar.setSerial(Global.currentDietaryKey);
		ar.setResidentId(Global.currentResidenceKey);
		ar.setFormType((String) cmbFormType.getSelectedItem());
		ar.setNotes(txtNotes.getText());
		ar.setUser("Admin");
		ar.setStatus((String) cmbStatus.getSelectedItem());
		if (Global.currentDietaryKey == 0) {
			ar.setDateCreated(MedrexClientManager.getServerTime());
		} else {
			ar.setDateCreated(creationDate);
		}
		ar.setLastModified(MedrexClientManager.getServerTime());
		try {
			Global.currentDietaryKey = MedrexClientManager.getInstance()
					.insertOrUpdateDietary(ar);
		} catch (Exception e) {

		}

	}

	public void fillCombos() {
		cmbFormType.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
		/* "Dietary Communication Form", */
		"Nutrition Assessment",
		/* "Enteral Feeding Progress Notes", */
		/*
		 * "Consultant Dietician Nutritional Recommendations",
		 */"Nutrition Support Assessment Form", "Dietary Alert Sheet" }));

		cmbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Complete", "Incomplete" }));

	}

	public void updateData() {
		if (Global.currentDietaryKey == 0) {
			cmbFormType.setEnabled(false);
			cmbFormType.setSelectedItem(Global.currentDietaryForm);
		} else {
			Dietary ar = null;
			try {
				ar = MedrexClientManager.getInstance().getDietary(
						Global.currentDietaryKey);
			} catch (Exception e) {
			}
			cmbFormType.setSelectedItem(ar.getFormType());
			cmbStatus.setSelectedItem(ar.getStatus());
			txtNotes.setText(ar.getNotes());
			creationDate = ar.getDateCreated();
		}
		/*
		 * if (((String) cmbFormType.getSelectedItem())
		 * .equalsIgnoreCase("Dietary Communication Form")) { doFormChanged(); }
		 */
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
		/*
		 * if (((String) cmbFormType.getSelectedItem())
		 * .equalsIgnoreCase("Dietary Communication Form")) {
		 * 
		 * if (Global.currentDietaryKey != 0) { Dietary ar = null; try { ar =
		 * MedrexClientManager
		 * .getInstance().getDietary(Global.currentDietaryKey); } catch
		 * (Exception e) { } Global.currentDietaryCommunicationFormKey =
		 * ar.getFormId(); } else { Global.currentDietaryCommunicationFormKey =
		 * 0;
		 * 
		 * } // Global.currentDietaryCommunicationFormPage = 1;
		 * scrollPane.getViewport().setViewPosition(new Point(0, 0));
		 * scrollPane.setViewportView(panelDietaryCommunicationForm); //
		 * panelDietaryPageEmpty.setVisible(false); //
		 * panelAdmissionRecordEmptyForm.setVisible(false);
		 * scrollPane.updateUI();
		 * 
		 * //
		 * PanelDietaryAdd.panelAmissionsRecordPageResidentAssForm.setVisible(
		 * true); // panelAmissionsRecordPageResidentAssForm.updateUI();
		 * Global.panelDietaryCommunicationForm.updateData(); }
		 */

		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Nutrition Assessment")) {
			if (Global.currentDietaryKey != 0) {
				Dietary ar = null;
				try {
					ar = MedrexClientManager.getInstance().getDietary(
							Global.currentDietaryKey);
				} catch (Exception e) {
				}
				Global.currentDietaryResidentDiagnosisKey = ar.getFormId();
			} else {
				Global.currentDietaryResidentDiagnosisKey = 0;

			}
			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelDietaryResidentDiagnosis);
			// panelDietaryPageEmpty.setVisible(false);
			// panelAdmissionRecordEmptyForm.setVisible(false);
			scrollPane.updateUI();

			Global.panelDietaryResidentDiagnosis.updateData();
		}

		/*
		 * if (((String) cmbFormType.getSelectedItem())
		 * .equalsIgnoreCase("Enteral Feeding Progress Notes")) {
		 * 
		 * if (Global.currentDietaryKey != 0) { Dietary ar = null; try { ar =
		 * MedrexClientManager
		 * .getInstance().getDietary(Global.currentDietaryKey); } catch
		 * (Exception e) { } Global.currentEnteralFeedingKey = ar.getFormId(); }
		 * else { Global.currentEnteralFeedingKey = 0;
		 * 
		 * } scrollPane.getViewport().setViewPosition(new Point(0, 0));
		 * scrollPane.setViewportView(panelEnteralFeeding); //
		 * panelDietaryPageEmpty.setVisible(false); //
		 * panelAdmissionRecordEmptyForm.setVisible(false);
		 * scrollPane.updateUI();
		 * 
		 * Global.panelEnteralFeeding.updateData(); }
		 */

		/*
		 * if (((String) cmbFormType.getSelectedItem())
		 * .equalsIgnoreCase("Consultant Dietician Nutritional Recommendations"
		 * )) {
		 * 
		 * if (Global.currentDietaryKey != 0) { Dietary ar = null; try { ar =
		 * MedrexClientManager
		 * .getInstance().getDietary(Global.currentDietaryKey); } catch
		 * (Exception e) { } Global.currentDietaryPlazaHealthKey =
		 * ar.getFormId(); } else { Global.currentDietaryPlazaHealthKey = 0;
		 * 
		 * } scrollPane.getViewport().setViewPosition(new Point(0, 0));
		 * scrollPane.setViewportView(panelDietaryPlazaHealth); //
		 * panelDietaryPageEmpty.setVisible(false); //
		 * panelAdmissionRecordEmptyForm.setVisible(false);
		 * scrollPane.updateUI();
		 * 
		 * Global.panelDietaryPlazaHealth.updateData(); }
		 */
		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Nutrition Support Assessment Form")) {

			if (Global.currentDietaryKey != 0) {
				Dietary ar = null;
				try {
					ar = MedrexClientManager.getInstance().getDietary(
							Global.currentDietaryKey);
				} catch (Exception e) {
				}
				Global.currentNutritionSupportAssessmentFormKey = ar
						.getFormId();
			} else {
				Global.currentNutritionSupportAssessmentFormKey = 0;

			}
			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane
					.setViewportView(panelNutritionSupportAssessmentFormPage1);
			// panelDietaryPageEmpty.setVisible(false);
			// panelAdmissionRecordEmptyForm.setVisible(false);
			scrollPane.updateUI();
			Global.panelNutritionSupportAssessmentForm.updateData();
		}

		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Dietary Alert Sheet")) {

			if (Global.currentDietaryKey != 0) {
				Dietary ar = null;
				try {
					ar = MedrexClientManager.getInstance().getDietary(
							Global.currentDietaryKey);
				} catch (Exception e) {
				}
				Global.currentDietaryAlertSheetKey = ar.getFormId();
			} else {
				Global.currentDietaryAlertSheetKey = 0;

			}
			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelDietaryASheet);
			scrollPane.updateUI();
			Global.panelDietaryAlertSheet.updateData();
		}

		/*
		 * else { panelDietaryPageEmpty.setVisible(true);
		 * //panelAmissionsRecordPageResidentAssForm.setVisible(false);
		 * panelDietaryPageEmpty.updateUI();
		 * //Global.currentDietaryCommunicationFormPage = 0;
		 * scrollPane.setViewportView(panelAdmissionRecordEmptyForm);
		 * scrollPane.updateUI(); //
		 * scrollPane.setViewportView(panelAdmissionRecordEmptyForm); //
		 * scrollPane.updateUI(); }
		 */
	}

}
