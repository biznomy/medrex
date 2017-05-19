package medrex.client.main.consultant;

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
import javax.swing.JScrollPane;
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
import medrex.commons.vo.consultant.Consultant;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;

public class PanelConsultantAdd extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -37696324821701457L;
	private JButton printButton;
	private PanelImage panel;

	private JComboBox cmbStatus;

	private JTextField txtNotes;

	private JComboBox cmbFormType;

	private Date creationDate;

	private PanelReportOfConsultationForm panelReportOfConsultationForm;

	private PanelReferralForm panelReferralForm;

	private PanelPharmacistEvaluationReportForm panelPharmacistEvaluationReportForm;

	private JScrollPane scrollPane;

	private JPanel panelPager;

	private PanelConsultantPageRenalDialysisCommunicationForm panelConsultantPageRenalDialysisCommunicationForm;

	private Color DEF_BACK_COL = new Color(24, 86, 110);
	private Color DEF_BUT_BACK = new Color(130, 163, 175);
	private Color DEF_BUT_FORE = new Color(8, 68, 95);

	/**
	 * Create the panel
	 */
	public PanelConsultantAdd() {
		super();
		// Global.panelConsultantAdd = this;
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
		typeOfFormLabel.setBounds(1161, 15, 43, 16);
		typeOfFormLabel.setVisible(false);
		add(typeOfFormLabel);

		cmbFormType = new JComboBox();
		cmbFormType.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				doFormChanged();
			}
		});

		cmbFormType.setBounds(1019, 40, 90, 25);
		cmbFormType.setVisible(false);
		add(cmbFormType);

		final JxButton saveButton = new JxButton();
		saveButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		saveButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (GlobalSecurity.isUpdatePriviledge(SubAppTypes.CONSULTANT)) {
					doSave();
					// Global.panelConsultant.updateConsultantJTable();
					Global.frameConsultantAddNew.dispose();
				}
			}
		});
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.setText("Save");
		saveButton.setBounds(65, 10, 106, 26);
		add(saveButton);

		final JxButton cancelButton = new JxButton();
		cancelButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		cancelButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.frameConsultantAddNew.dispose();
			}
		});
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setText("Cancel");
		cancelButton.setBounds(177, 10, 106, 26);
		add(cancelButton);

		final JLabel descriptionLabel = new JLabel();
		descriptionLabel.setFont(new Font("", Font.BOLD, 12));
		descriptionLabel.setText("DESCRIPTION");
		descriptionLabel.setBounds(1055, 15, 77, 16);
		descriptionLabel.setVisible(false);
		add(descriptionLabel);

		txtNotes = new JTextField();
		txtNotes.setBounds(1145, 37, 58, 20);
		txtNotes.setVisible(false);
		add(txtNotes);

		final JLabel statuLabel = new JLabel();
		statuLabel.setFont(new Font("", Font.BOLD, 12));
		statuLabel.setText("STATUS");
		statuLabel.setBounds(1019, 15, 30, 16);
		statuLabel.setVisible(false);
		add(statuLabel);

		cmbStatus = new JComboBox();
		cmbStatus.setBounds(1224, 40, 30, 25);
		cmbStatus.setVisible(false);
		add(cmbStatus);

		scrollPane = new JScrollPane();
		// scrollPane.setBounds(28, 81, 975, 780);

		scrollPane.setBounds(28, 81, 975, this.getSize().height - 81 - 50);
		add(scrollPane);
		panelReportOfConsultationForm = new PanelReportOfConsultationForm();

		panelReferralForm = new PanelReferralForm();
		panelReferralForm.setZoomFactor(1.3f);
		panelReferralForm = (PanelReferralForm) panelReferralForm.doZoomIn();

		panel = new PanelImage();
		panel.setArc(0.4f);
		panel.setCurvedView(true);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		panel.setBounds(902, 4, 92, 74);
		add(panel);

		panelConsultantPageRenalDialysisCommunicationForm = new PanelConsultantPageRenalDialysisCommunicationForm();
		panelConsultantPageRenalDialysisCommunicationForm.setBounds(0, 0, 815,
				35);

		panelConsultantPageRenalDialysisCommunicationForm.setVisible(true);

		fillCombos();
		updateData();

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
		printButton.setBounds(289, 10, 106, 26);
		add(printButton);
	}

	public void doSave() {
		Consultant ar = new Consultant();
		if (cmbFormType.getSelectedItem().equals(
				"Renal Dialysis Communication Form")) {

			Global.panelRenalDialysisCommunicationFormPage1.doSave();
			Global.panelRenalDialysisCommunicationFormPage2.doSave();

			ar.setFormId(Global.currentRenalDialysisCommunicationFormKey);
		}

		else if (cmbFormType.getSelectedItem().equals("Referral Form")) {

			Global.panelReferralForm.doSave();
			ar.setFormId(Global.currentReferralFormKey);
		}

		else if (cmbFormType.getSelectedItem().equals("Report of Consultation")) {

			Global.panelReportOfConsultationForm.doSave();
			ar.setFormId(Global.currentReportOfConsultationFormKey);
		}

		else if (cmbFormType.getSelectedItem().equals(
				"Pharmacist Resident Evaluation")) {
			Global.panelPharmacistEvaluationReportForm.doSave();
			ar.setFormId(Global.currentPharmacistResidentEvaluationFormKey);
		} else {
			ar.setFormId(0);
		}

		ar.setSerial(Global.currentConsultantKey);
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
			Global.currentConsultantKey = MedrexClientManager.getInstance()
					.insertOrUpdateConsultant(ar);
		} catch (Exception e) {

		}

	}

	public void fillCombos() {
		cmbFormType.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Renal Dialysis Communication Form", "Referral Form",
				"Report of Consultation", "Pharmacist Resident Evaluation" }));

		// cmbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[]
		// {
		// "Complete", "Incomplete" }));
	}

	public void updateData() {
		if (Global.currentConsultantKey == 0) {
			cmbFormType.setEnabled(false);
			cmbFormType.setSelectedItem(Global.currentConsultantForm);
		} else {
			cmbFormType.setEnabled(false);
			Consultant ar = null;
			try {
				ar = MedrexClientManager.getInstance().getConsultant(
						Global.currentConsultantKey);
			} catch (Exception e) {
			}
			cmbFormType.setSelectedItem(ar.getFormType());
			cmbStatus.setSelectedItem(ar.getStatus());
			txtNotes.setText(ar.getNotes());
			creationDate = ar.getDateCreated();
		}
		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Renal Dialysis Communication Form")) {

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
				.equalsIgnoreCase("Referral Form")) {

			if (Global.currentConsultantKey != 0) {
				Consultant ar = null;
				try {
					ar = MedrexClientManager.getInstance().getConsultant(
							Global.currentConsultantKey);
				} catch (Exception e) {
				}
				Global.currentReferralFormKey = ar.getFormId();
			} else {
				Global.currentReferralFormKey = 0;
			}

			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelReferralForm);
			scrollPane.updateUI();

			panelConsultantPageRenalDialysisCommunicationForm.setVisible(false);
			panelConsultantPageRenalDialysisCommunicationForm.updateUI();
			Global.panelReferralForm.updateData();
			Global.panelReferralForm.updateData();
		}

		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Report Of Consultation")) {

			if (Global.currentConsultantKey != 0) {
				Consultant ar = null;
				try {
					ar = MedrexClientManager.getInstance().getConsultant(
							Global.currentConsultantKey);
				} catch (Exception e) {
				}
				Global.currentReportOfConsultationFormKey = ar.getFormId();
			} else {
				Global.currentReportOfConsultationFormKey = 0;
			}
			scrollPane.getViewport().setViewPosition(new Point(0, 0));

			scrollPane.setViewportView(panelReportOfConsultationForm);
			scrollPane.updateUI();

			panelConsultantPageRenalDialysisCommunicationForm.setVisible(false);
			panelConsultantPageRenalDialysisCommunicationForm.updateUI();
			Global.panelReferralForm.updateData();
			Global.panelReportOfConsultationForm.updateData();
		}

		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Pharmacist Resident Evaluation")) {

			if (panelPharmacistEvaluationReportForm == null) {
				panelPharmacistEvaluationReportForm = new PanelPharmacistEvaluationReportForm();
			}

			if (Global.currentConsultantKey != 0) {
				Consultant ar = null;
				try {
					ar = MedrexClientManager.getInstance().getConsultant(
							Global.currentConsultantKey);
				} catch (Exception e) {
				}
				Global.currentPharmacistResidentEvaluationFormKey = ar
						.getFormId();
			} else {
				Global.currentPharmacistResidentEvaluationFormKey = 0;
			}

			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelPharmacistEvaluationReportForm);
			scrollPane.updateUI();

			panelConsultantPageRenalDialysisCommunicationForm.setVisible(false);
			panelPharmacistEvaluationReportForm.updateData();
		}

	}

}
