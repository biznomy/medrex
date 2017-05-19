package medrex.client.main.ptOtSt;

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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

import medrex.client.PanelImage;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.constants.GlobalSecurity;
import medrex.client.utils.ComponentPrintable;
import medrex.client.utils.MsgBox;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.enums.SubAppTypes;
import medrex.commons.vo.ptOtSt.PtOtSt;
import medrex.commons.vo.ptOtSt.PtOtStOccupationalTherapy;
import medrex.commons.vo.ptOtSt.PtOtStPhysicalTheray;
import medrex.commons.vo.ptOtSt.PtOtStSpeechLanguage;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxScrollPane;

public class PanelPtOtStAdd extends JPanel {

	private JButton printButton;
	private PanelImage panel;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JComboBox cmbStatus;

	private JTextField txtNotes;

	private JComboBox cmbFormType;

	private Date creationDate;

	private PanelPtOtStOccupationalDailyRecord panelPtOtStOccupationalDailyRecord;
	private PanelPtOtStOccupationalTherapy panelPtOtStOccupationalTherapy;
	private PanelPtOtStPhysicalDailyRecord panelPtOtStPhysicalDailyRecord;
	private PanelPtOtStPhysicalTheray panelPtOtStPhysicalTheray;
	private PanelPtOtStPositioningEvaluation panelPtOtStPositioningEvaluation;
	private PanelPtOtStRehabCarePlan panelPtOtStRehabCarePlan;
	private PanelPtOtStSpeechDailyRecord panelPtOtStSpeechDailyRecord;
	private PanelPtOtStSpeechLanguage panelPtOtStSpeechLanguage;
	private PanelPtOtStTherapyPhysical panelPtOtStTherapyPhysical;
	private PanelPtOtStTreatment panelPtOtStTreatment;

	private JxScrollPane scrollPane;

	private boolean allowDispose;

	private JPanel panelPager;

	private Color DEF_BACK_COL = new Color(24, 86, 110);
	private Color DEF_BUT_BACK = new Color(130, 163, 175);
	private Color DEF_BUT_FORE = new Color(8, 68, 95);

	/**
	 * Create the panel
	 */
	public PanelPtOtStAdd() {
		super();
		// Global.panelPtOtStAdd = this;
		// setPreferredSize(new Dimension(1024, 920));
		setBackground(DEF_BACK_COL);
		setPreferredSize(new Dimension(Toolkit.getDefaultToolkit()
				.getScreenSize().width, Toolkit.getDefaultToolkit()
				.getScreenSize().height - 50));
		setSize(new Dimension(
				Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
						.getDefaultToolkit().getScreenSize().height - 50));

		setLayout(null);

		final JLabel typeOfFormLabel = new JLabel();
		typeOfFormLabel.setFont(new Font("", Font.BOLD, 12));
		typeOfFormLabel.setText("TYPE OF FORM");
		typeOfFormLabel.setBounds(453, 17, 61, 16);
		typeOfFormLabel.setVisible(false);
		add(typeOfFormLabel);

		cmbFormType = new JComboBox();
		cmbFormType.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				doFormChanged();
			}
		});

		cmbFormType.setBounds(520, 13, 83, 25);
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
						.isUpdatePriviledge(SubAppTypes.OTPTACT_SPEECH)) {
					allowDispose = true;
					doSave();
					// Global.panelPtOtSt.updatePtOtStJTable();
					if (allowDispose) {
						Global.framePtOtStAddNew.dispose();
					}
				}
			}
		});
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.setText("Save");
		saveButton.setBounds(28, 13, 106, 26);
		add(saveButton);

		final JxButton cancelButton = new JxButton();
		cancelButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		cancelButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.framePtOtStAddNew.dispose();
			}
		});
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setText("Cancel");
		cancelButton.setBounds(140, 13, 106, 26);
		add(cancelButton);

		final JLabel descriptionLabel = new JLabel();
		descriptionLabel.setFont(new Font("", Font.BOLD, 12));
		descriptionLabel.setText("DESCRIPTION");
		descriptionLabel.setBounds(646, 53, 45, 16);
		descriptionLabel.setVisible(false);
		add(descriptionLabel);

		txtNotes = new JTextField();
		txtNotes.setBounds(646, 15, 26, 20);
		txtNotes.setVisible(false);
		add(txtNotes);

		final JLabel statuLabel = new JLabel();
		statuLabel.setFont(new Font("", Font.BOLD, 12));
		statuLabel.setText("STATUS");
		statuLabel.setBounds(463, 53, 32, 16);
		statuLabel.setVisible(false);
		add(statuLabel);

		cmbStatus = new JComboBox();
		cmbStatus.setBounds(506, 49, 90, 25);
		cmbStatus.setVisible(false);
		add(cmbStatus);

		scrollPane = new JxScrollPane();
		scrollPane.setBounds(28, 50, Toolkit.getDefaultToolkit()
				.getScreenSize().width - 150, this.getSize().height - 50 - 50);
		add(scrollPane);
		panelPtOtStPhysicalDailyRecord = new PanelPtOtStPhysicalDailyRecord();
		panelPtOtStOccupationalDailyRecord = new PanelPtOtStOccupationalDailyRecord();
		// panelPtOtStOccupationalDailyRecord.setBounds(0, 0, 972, 779);
		// panelPtOtStPhysicalDailyRecord.add(panelPtOtStOccupationalDailyRecord);
		panelPtOtStPhysicalTheray = new PanelPtOtStPhysicalTheray();
		panelPtOtStPositioningEvaluation = new PanelPtOtStPositioningEvaluation();
		panelPtOtStOccupationalTherapy = new PanelPtOtStOccupationalTherapy();
		panelPtOtStRehabCarePlan = new PanelPtOtStRehabCarePlan();
		panelPtOtStSpeechDailyRecord = new PanelPtOtStSpeechDailyRecord();
		panelPtOtStSpeechLanguage = new PanelPtOtStSpeechLanguage();
		panelPtOtStTherapyPhysical = new PanelPtOtStTherapyPhysical();
		panelPtOtStTreatment = new PanelPtOtStTreatment();

		panel = new PanelImage();
		panel.setArc(0.4f);
		panel.setCurvedView(true);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		panel.setBounds(
				Toolkit.getDefaultToolkit().getScreenSize().width - 110, 13,
				92, 74);
		add(panel);

		printButton = new JxButton();
		printButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		printButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
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
		printButton.setBounds(252, 12, 106, 26);
		add(printButton);

		// doFormChanged();
		fillCombos();
		updateData();

	}

	public void fillCombos() {
		cmbFormType.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "Physical Daily Record",
						"Occupational Daily Record", "Speech Daily Record",
						"Physical Therapy", "Occupational Therapy",
						"Speech Therapy", "Positioning Evaluation",
						"Rehab Care Plan",
						"Therapy ProgressNote/Re-certification/Discharge",
						"Treatment" }));

		cmbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Complete", "Incomplete" }));
	}

	public void doSave() {
		PtOtSt ls = new PtOtSt();
		if (cmbFormType.getSelectedItem().equals("Physical Daily Record")) {
			Global.panelPtOtStPhysicalDailyRecord.doSave();

			ls.setFormId(Global.currentPtOtStPhysicalDailyRecordKey);
		} else if (cmbFormType.getSelectedItem().equals(
				"Occupational Daily Record")) {
			Global.panelPtOtStOccupationalDailyRecord.doSave();

			ls.setFormId(Global.currentPtOtStOccupationalDailyRecordKey);
		} else if (cmbFormType.getSelectedItem().equals("Speech Daily Record")) {
			Global.panelPtOtStSpeechDailyRecord.doSave();

			ls.setFormId(Global.currentPtOtStSpeechDailyRecordKey);
		} else if (cmbFormType.getSelectedItem().equals("Physical Therapy")) {
			PtOtStPhysicalTheray refOld = null;
			try {
				refOld = MedrexClientManager.getInstance()
						.getExistingPhysicalTherapyForm700(
								Global.panelPtOtStPhysicalTheray
										.getCertificationFromDate(),
								Global.panelPtOtStPhysicalTheray
										.getCertificationToDate());
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("isEval:"
					+ Global.panelPtOtStPhysicalTheray.isEval() + ", eXists:"
					+ !(refOld == null) + ", obj:" + refOld);
			List<String> errors = Global.panelPtOtStPhysicalTheray.doValidate();
			if (errors.size() > 0) {
				MsgBox m = new MsgBox();
				Iterator<String> itr = errors.iterator();
				String strError = "";
				while (itr.hasNext()) {
					strError += itr.next() + "\n";
				}
				m.addPrompt(strError);
				m.setTitle("Error Saving Physical Therapy Form");
				allowDispose = false;
				m.setVisible(true);
				return;
			} else if ((Global.panelPtOtStPhysicalTheray.isEval()
					|| (refOld == null && Global.currentPtOtStPhysicalTherayKey == 0) || (refOld != null && Global.currentPtOtStPhysicalTherayKey != 0))
					&& errors.isEmpty()) {
				Global.panelPtOtStPhysicalTheray.doSave();
			} else {
				SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy");
				int msgResult = JOptionPane
						.showConfirmDialog(
								null,
								"There exists a Physical Therapy Certification Form for the given period ("
										+ df.format(refOld
												.getCertificationFromDate())
										+ " to "
										+ df.format(refOld
												.getCertificationToDate())
										+ "). Click 'OK' if you want to fill Re-Certification Form. Click 'CANCEL' to continue (or save the form as EVALUATION ONLY).",
								"Medrex", JOptionPane.OK_CANCEL_OPTION);
				if (msgResult == JOptionPane.OK_OPTION) {
					cmbFormType
							.setSelectedItem("Therapy ProgressNote/Re-certification/Discharge");
				}
				allowDispose = false;
				return;
			}
			ls.setFormId(Global.currentPtOtStPhysicalTherayKey);
		} else if (cmbFormType.getSelectedItem().equals("Occupational Therapy")) {
			// ------------changed
			PtOtStOccupationalTherapy refOld = null;
			try {
				refOld = MedrexClientManager.getInstance()
						.getExistingOccupationalTherapyForm700(
								Global.panelPtOtStOccupationalTherapy
										.getCertificationFromDate(),
								Global.panelPtOtStOccupationalTherapy
										.getCertificationToDate());
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("isEval:"
					+ Global.panelPtOtStOccupationalTherapy.isEval()
					+ ", eXists:" + !(refOld == null) + ", obj:" + refOld);
			if ((Global.panelPtOtStOccupationalTherapy.isEval()
					|| (refOld == null && Global.currentPtOtStOccupationalTherapyKey == 0) || (refOld != null && Global.currentPtOtStOccupationalTherapyKey != 0))) {
				Global.panelPtOtStOccupationalTherapy.doSave();
			} else {
				SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy");
				int msgResult = JOptionPane
						.showConfirmDialog(
								null,
								"There exists a Occupational Therapy Certification Form for the given period ("
										+ df.format(refOld
												.getCertificationFromDate())
										+ " to "
										+ df.format(refOld
												.getCertificationThroughDate())
										+ "). Click 'OK' if you want to fill Re-Certification Form. Click 'CANCEL' to continue (or save the form as EVALUATION ONLY).",
								"Medrex", JOptionPane.OK_CANCEL_OPTION);
				if (msgResult == JOptionPane.OK_OPTION) {
					cmbFormType
							.setSelectedItem("Therapy ProgressNote/Re-certification/Discharge");
				}
				allowDispose = false;
				return;
			}
			// ----------changed
			ls.setFormId(Global.currentPtOtStOccupationalTherapyKey);
		} else if (cmbFormType.getSelectedItem().equals("Speech Therapy")) {
			// ------------changed
			PtOtStSpeechLanguage refOld = null;
			try {
				refOld = MedrexClientManager.getInstance()
						.getExistingSpeechLanguageForm700(
								Global.panelPtOtStSpeechLanguage
										.getCertificationFromDate(),
								Global.panelPtOtStSpeechLanguage
										.getCertificationToDate());
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("isEval:"
					+ Global.panelPtOtStSpeechLanguage.isEval() + ", eXists:"
					+ !(refOld == null) + ", obj:" + refOld);
			if ((Global.panelPtOtStSpeechLanguage.isEval()
					|| (refOld == null && Global.currentPtOtStSpeechLanguageKey == 0) || (refOld != null && Global.currentPtOtStSpeechLanguageKey != 0))) {
				Global.panelPtOtStSpeechLanguage.doSave();
			} else {
				SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy");
				int msgResult = JOptionPane
						.showConfirmDialog(
								null,
								"There exists a Speech Therapy Certification Form for the given period ("
										+ df.format(refOld
												.getCertificationFromDate())
										+ " to "
										+ df.format(refOld
												.getCertificationThroughDate())
										+ "). Click 'OK' if you want to fill Re-Certification Form. Click 'CANCEL' to continue (or save the form as EVALUATION ONLY).",
								"Medrex", JOptionPane.OK_CANCEL_OPTION);
				if (msgResult == JOptionPane.OK_OPTION) {
					cmbFormType
							.setSelectedItem("Therapy ProgressNote/Re-certification/Discharge");
				}
				allowDispose = false;
				return;
			}
			// ----------changed
			// Global.panelPtOtStSpeechLanguage.doSave();
			ls.setFormId(Global.currentPtOtStSpeechLanguageKey);
		} else if (cmbFormType.getSelectedItem().equals(
				"Positioning Evaluation")) {
			Global.panelPtOtStPositioningEvaluation.doSave();

			ls.setFormId(Global.currentPtOtStPositioningEvaluationKey);
		} else if (cmbFormType.getSelectedItem().equals("Rehab Care Plan")) {
			Global.panelPtOtStRehabCarePlan.doSave();

			ls.setFormId(Global.currentPtOtStRehabCarePlanKey);
		} else if (cmbFormType.getSelectedItem().equals(
				"Therapy ProgressNote/Re-certification/Discharge")) {
			List<String> errors = Global.panelPtOtStTherapyPhysical
					.doValidate();
			if (errors.size() > 0) {
				MsgBox m = new MsgBox();
				Iterator<String> itr = errors.iterator();
				String strError = "";
				while (itr.hasNext()) {
					strError += itr.next() + "\n";
				}
				m.addPrompt(strError);
				m.setTitle("Error Saving Re-Certification Form");
				allowDispose = false;
				m.setVisible(true);
				return;
			} else if (errors.isEmpty()) {
				Global.panelPtOtStTherapyPhysical.doSave();
				ls.setFormId(Global.currentPtOtStTherapyPhysicalKey);
			}
		} else if (cmbFormType.getSelectedItem().equals("Treatment")) {
			Global.panelPtOtStTreatment.doSave();

			ls.setFormId(Global.currentPtOtStTreatmentKey);
		} else {
			ls.setFormId(0);
		}

		ls.setSerial(Global.currentPtOtStKey);

		ls.setResidentId(Global.currentResidenceKey);

		ls.setFormType((String) cmbFormType.getSelectedItem());
		ls.setNotes(txtNotes.getText());
		ls.setUser("Admin");
		ls.setStatus((String) cmbStatus.getSelectedItem());
		if (Global.currentPtOtStKey == 0) {
			ls.setDateCreated(MedrexClientManager.getServerTime());
		} else {
			ls.setDateCreated(creationDate);
		}
		ls.setLastModified(MedrexClientManager.getServerTime());
		try {
			Global.currentPtOtStKey = MedrexClientManager.getInstance()
					.insertOrUpdatePtOtSt(ls);
		} catch (Exception e) {

		}

	}

	public void updateData() {
		if (Global.currentPtOtStKey == 0) {
			cmbFormType.setEnabled(false);
			cmbFormType.setSelectedItem(Global.currentPtOtStForm);
		} else {
			PtOtSt ls = null;
			try {
				ls = MedrexClientManager.getInstance().getPtOtSt(
						Global.currentPtOtStKey);
			} catch (Exception e) {
			}
			cmbFormType.setSelectedItem(ls.getFormType());
			cmbStatus.setSelectedItem(ls.getStatus());
			txtNotes.setText(ls.getNotes());
			creationDate = ls.getDateCreated();
		}
		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Physical Daily Record")) {
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
				.equalsIgnoreCase("Physical Daily Record")) {
			if (Global.currentPtOtStKey != 0) {
				PtOtSt ls = null;
				try {
					ls = MedrexClientManager.getInstance().getPtOtSt(
							Global.currentPtOtStKey);
				} catch (Exception e) {
				}
				Global.currentPtOtStPhysicalDailyRecordKey = ls.getFormId();
			} else {
				Global.currentPtOtStPhysicalDailyRecordKey = 0;
			}
			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelPtOtStPhysicalDailyRecord);
			scrollPane.updateUI();
			Global.panelPtOtStPhysicalDailyRecord.updateData();
		}
		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Occupational Daily Record")) {
			if (Global.currentPtOtStKey != 0) {
				PtOtSt ls = null;
				try {
					ls = MedrexClientManager.getInstance().getPtOtSt(
							Global.currentPtOtStKey);
				} catch (Exception e) {
				}
				Global.currentPtOtStOccupationalDailyRecordKey = ls.getFormId();
			} else {
				Global.currentPtOtStOccupationalDailyRecordKey = 0;
			}
			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelPtOtStOccupationalDailyRecord);
			scrollPane.updateUI();
			Global.panelPtOtStOccupationalDailyRecord.updateData();
		}
		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Speech Daily Record")) {
			if (Global.currentPtOtStKey != 0) {
				PtOtSt ls = null;
				try {
					ls = MedrexClientManager.getInstance().getPtOtSt(
							Global.currentPtOtStKey);
				} catch (Exception e) {
				}
				Global.currentPtOtStSpeechDailyRecordKey = ls.getFormId();
			} else {
				Global.currentPtOtStSpeechDailyRecordKey = 0;
			}
			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelPtOtStSpeechDailyRecord);
			scrollPane.updateUI();
			Global.panelPtOtStSpeechDailyRecord.updateData();
		}
		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Physical Therapy")) {
			if (Global.currentPtOtStKey != 0) {
				PtOtSt ls = null;
				try {
					ls = MedrexClientManager.getInstance().getPtOtSt(
							Global.currentPtOtStKey);
				} catch (Exception e) {
				}
				Global.currentPtOtStPhysicalTherayKey = ls.getFormId();
			} else {
				Global.currentPtOtStPhysicalTherayKey = 0;
			}
			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelPtOtStPhysicalTheray);
			scrollPane.updateUI();
			Global.panelPtOtStPhysicalTheray.updateData();
		}
		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Occupational Therapy")) {
			if (Global.currentPtOtStKey != 0) {
				PtOtSt ls = null;
				try {
					ls = MedrexClientManager.getInstance().getPtOtSt(
							Global.currentPtOtStKey);
				} catch (Exception e) {
				}
				Global.currentPtOtStOccupationalTherapyKey = ls.getFormId();
			} else {
				Global.currentPtOtStOccupationalTherapyKey = 0;
			}
			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelPtOtStOccupationalTherapy);
			scrollPane.updateUI();
			Global.panelPtOtStOccupationalTherapy.updateData();
		}
		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Speech Therapy")) {
			if (Global.currentPtOtStKey != 0) {
				PtOtSt ls = null;
				try {
					ls = MedrexClientManager.getInstance().getPtOtSt(
							Global.currentPtOtStKey);
				} catch (Exception e) {
				}
				Global.currentPtOtStSpeechLanguageKey = ls.getFormId();
			} else {
				Global.currentPtOtStSpeechLanguageKey = 0;
			}
			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelPtOtStSpeechLanguage);
			scrollPane.updateUI();
			Global.panelPtOtStSpeechLanguage.updateData();
		}
		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Positioning Evaluation")) {
			if (Global.currentPtOtStKey != 0) {
				PtOtSt ls = null;
				try {
					ls = MedrexClientManager.getInstance().getPtOtSt(
							Global.currentPtOtStKey);
				} catch (Exception e) {
				}
				Global.currentPtOtStPositioningEvaluationKey = ls.getFormId();
			} else {
				Global.currentPtOtStPositioningEvaluationKey = 0;
			}
			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelPtOtStPositioningEvaluation);
			scrollPane.updateUI();
			Global.panelPtOtStPositioningEvaluation.updateData();
		}
		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Rehab Care Plan")) {
			if (Global.currentPtOtStKey != 0) {
				PtOtSt ls = null;
				try {
					ls = MedrexClientManager.getInstance().getPtOtSt(
							Global.currentPtOtStKey);
				} catch (Exception e) {
				}
				Global.currentPtOtStRehabCarePlanKey = ls.getFormId();
			} else {
				Global.currentPtOtStRehabCarePlanKey = 0;
			}
			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelPtOtStRehabCarePlan);
			scrollPane.updateUI();
			Global.panelPtOtStRehabCarePlan.updateData();
		}
		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Therapy ProgressNote/Re-certification/Discharge")) {
			if (Global.currentPtOtStKey != 0) {
				PtOtSt ls = null;
				try {
					ls = MedrexClientManager.getInstance().getPtOtSt(
							Global.currentPtOtStKey);
				} catch (Exception e) {
				}
				Global.currentPtOtStTherapyPhysicalKey = ls.getFormId();
			} else {
				Global.currentPtOtStTherapyPhysicalKey = 0;
			}
			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelPtOtStTherapyPhysical);
			scrollPane.updateUI();
			Global.panelPtOtStTherapyPhysical.updateData();
		}
		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Treatment")) {
			if (Global.currentPtOtStKey != 0) {
				PtOtSt ls = null;
				try {
					ls = MedrexClientManager.getInstance().getPtOtSt(
							Global.currentPtOtStKey);
				} catch (Exception e) {
				}
				Global.currentPtOtStTreatmentKey = ls.getFormId();
			} else {
				Global.currentPtOtStTreatmentKey = 0;
			}
			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelPtOtStTreatment);
			scrollPane.updateUI();
			Global.panelPtOtStTreatment.updateData();
		}
	}

	public void showActivityFormPage(int pageNum) {

		switch (pageNum) {
		case 1:
			panelPtOtStOccupationalDailyRecord.updateData();
			break;
		}

		scrollPane.getViewport().setViewPosition(new Point(0, 0));
		scrollPane.updateUI();
	}

}
