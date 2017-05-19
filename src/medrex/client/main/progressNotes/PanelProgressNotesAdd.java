package medrex.client.main.progressNotes;

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
import medrex.client.main.consultant.PanelConsultantPageRenalDialysisCommunicationForm;
import medrex.client.utils.ComponentPrintable;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.enums.SubAppTypes;
import medrex.commons.vo.progressNotes.ProgressNotes;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxScrollPane;

public class PanelProgressNotesAdd extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5127561771372498379L;
	private JButton printButton;
	private PanelImage panel;
	private JComboBox cmbStatus;
	private JTextField txtNotes;
	private JComboBox cmbFormType;
	private Date creationDate;
	private PanelInterDisciplinaryProgressNotesForm panelInterDisciplinaryProgressNotesForm;
	private PanelDoctorsProgressNotesForm panelDoctorsProgressNotesForm;

	public JxScrollPane scrollPane;
	private PanelConsultantPageRenalDialysisCommunicationForm panelConsultantPageRenalDialysisCommunicationForm;
	private Color DEF_BACK_COL = new Color(24, 86, 110);
	private Color DEF_BUT_BACK = new Color(130, 163, 175);
	private Color DEF_BUT_FORE = new Color(8, 68, 95);

	/**
	 * Create the panel
	 */
	public PanelProgressNotesAdd() {
		super();
		// Global.panelProgressNotesAdd = this;
		// setPreferredSize(new Dimension(1024, 768));

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
		typeOfFormLabel.setBounds(1022, 14, 54, 16);
		typeOfFormLabel.setVisible(false);
		add(typeOfFormLabel);

		cmbFormType = new JComboBox();
		cmbFormType.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				doFormChanged();
			}
		});

		cmbFormType.setBounds(1082, 10, 54, 25);
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
						.isUpdatePriviledge(SubAppTypes.PROGRESS_NOTES)) {
					doSave();
					// Global.panelProgressNotes.updateProgressNotesJTable();
					Global.frameProgressNotesAddNew.dispose();
				}
			}
		});
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.setText("Save");
		saveButton.setBounds(120, 9, 106, 26);
		add(saveButton);

		final JxButton cancelButton = new JxButton();
		cancelButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		cancelButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.frameProgressNotesAddNew.dispose();
			}
		});
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setText("Cancel");
		cancelButton.setBounds(253, 9, 106, 26);
		add(cancelButton);

		final JLabel descriptionLabel = new JLabel();
		descriptionLabel.setFont(new Font("", Font.BOLD, 12));
		descriptionLabel.setText("DESCRIPTION");
		descriptionLabel.setBounds(1142, 14, 54, 16);
		descriptionLabel.setVisible(false);
		add(descriptionLabel);

		txtNotes = new JTextField();
		txtNotes.setBounds(1199, 12, 46, 20);
		txtNotes.setVisible(false);
		add(txtNotes);

		final JLabel statuLabel = new JLabel();
		statuLabel.setFont(new Font("", Font.BOLD, 12));
		statuLabel.setText("STATUS");
		statuLabel.setBounds(1022, 50, 46, 16);
		statuLabel.setVisible(false);
		add(statuLabel);

		cmbStatus = new JComboBox();
		cmbStatus.setBounds(1082, 46, 54, 25);
		cmbStatus.setVisible(false);
		add(cmbStatus);

		scrollPane = new JxScrollPane();
		scrollPane.setBounds(28, 91, 975, this.getBounds().height - 91 - 50);
		add(scrollPane);

		panelDoctorsProgressNotesForm = new PanelDoctorsProgressNotesForm();
		panelInterDisciplinaryProgressNotesForm = new PanelInterDisciplinaryProgressNotesForm();

		panelConsultantPageRenalDialysisCommunicationForm = new PanelConsultantPageRenalDialysisCommunicationForm();
		// panelConsultantPageRenalDialysisCommunicationForm.setLayout(null);
		panelConsultantPageRenalDialysisCommunicationForm.setBounds(123, 40,
				763, 35);
		add(panelConsultantPageRenalDialysisCommunicationForm);

		panelConsultantPageRenalDialysisCommunicationForm.setVisible(true);

		panel = new PanelImage();
		panel.setArc(0.4f);
		panel.setCurvedView(true);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		panel.setBounds(909, 10, 92, 74);
		add(panel);
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
		printButton.setBounds(377, 9, 106, 26);
		add(printButton);

		// doFormChanged();

	}

	public void doSave() {

		ProgressNotes ar = new ProgressNotes();
		if (cmbFormType.getSelectedItem().equals(
				"InterDisciplinary Progress Notes")) {

			Global.panelInterdisciplinaryProgressNotesForm.doSave();

			ar.setFormId(Global.currentInterdisciplinaryProgressNotesKey);
		} else {

			if (cmbFormType.getSelectedItem().equals("Doctors Progress Notes")) {

				Global.panelDoctorsProgressNotesForm.doSave();
				ar.setFormId(Global.currentDoctorsProgressNotesKey);
			} else {
				ar.setFormId(0);
			}
		}

		ar.setSerial(Global.currentProgressNotesKey);
		ar.setResidentId(Global.currentResidenceKey);
		ar.setFormType((String) cmbFormType.getSelectedItem());
		ar.setNotes(txtNotes.getText());
		ar.setUser("Admin");
		ar.setStatus((String) cmbStatus.getSelectedItem());
		if (Global.currentProgressNotesKey == 0) {
			ar.setDateCreated(MedrexClientManager.getServerTime());
		} else {
			ar.setDateCreated(creationDate);
		}
		ar.setLastModified(MedrexClientManager.getServerTime());
		try {
			Global.currentProgressNotesKey = MedrexClientManager.getInstance()
					.insertOrUpdateProgressNotes(ar);
		} catch (Exception e) {
		}

	}

	public void fillCombos() {
		cmbFormType
				.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
						"InterDisciplinary Progress Notes",
						"Doctors Progress Notes" }));

		cmbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Complete", "Incomplete" }));
	}

	public void updateData() {
		if (Global.currentProgressNotesKey == 0) {
			cmbFormType.setEnabled(false);
			cmbFormType.setSelectedItem(Global.currentProgressNotesForm);
		} else {
			ProgressNotes ar = null;
			try {
				ar = MedrexClientManager.getInstance().getProgressNotes(
						Global.currentProgressNotesKey);
			} catch (Exception e) {
			}
			cmbFormType.setSelectedItem(ar.getFormType());
			cmbStatus.setSelectedItem(ar.getStatus());
			txtNotes.setText(ar.getNotes());
			creationDate = ar.getDateCreated();
		}
		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Doctors Progress Notes")) {

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
		doFormChanged();
	}

	public void doFormChanged() {
		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Doctors Progress Notes")) {

			if (Global.currentProgressNotesKey != 0) {
				ProgressNotes ar = null;
				try {
					ar = MedrexClientManager.getInstance().getProgressNotes(
							Global.currentProgressNotesKey);
				} catch (Exception e) {
				}
				Global.currentDoctorsProgressNotesKey = ar.getFormId();
			} else {
				Global.currentDoctorsProgressNotesKey = 0;

			}

			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelDoctorsProgressNotesForm);
			scrollPane.updateUI();

			panelConsultantPageRenalDialysisCommunicationForm.setVisible(false);
			panelConsultantPageRenalDialysisCommunicationForm.updateUI();
			// Global.panelRenalDialysisCommunicationFormPage1.updateData();
			Global.panelDoctorsProgressNotesForm.updateData();
		}

		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("InterDisciplinary Progress Notes")) {

			if (Global.currentProgressNotesKey != 0) {
				ProgressNotes ar = null;
				try {
					ar = MedrexClientManager.getInstance().getProgressNotes(
							Global.currentProgressNotesKey);
				} catch (Exception e) {
				}
				Global.currentInterdisciplinaryProgressNotesKey = ar
						.getFormId();
			} else {
				Global.currentInterdisciplinaryProgressNotesKey = 0;

			}

			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelInterDisciplinaryProgressNotesForm);
			scrollPane.updateUI();

			panelConsultantPageRenalDialysisCommunicationForm.setVisible(false);
			panelConsultantPageRenalDialysisCommunicationForm.updateUI();
			// Global.panelReferralForm.updateData();
			Global.panelInterdisciplinaryProgressNotesForm.updateData();
		}

	}

}
