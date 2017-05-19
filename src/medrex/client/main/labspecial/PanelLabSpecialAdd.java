package medrex.client.main.labspecial;

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
import medrex.commons.vo.labSpecial.LabSpecial;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;

public class PanelLabSpecialAdd extends JPanel {

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

	// private PanelLabSpecialEmptyForm panelLabSpecialEmptyForm;
	//
	// private PanelLabSpecialPageEmpty panelLabSpecialPageEmpty;

	private PanelLabSpecialpageReasonSForm panelLabSpecialpageReasonSForm;

	private PanelLabReasonForStudyPage1 panelLabReasonForStudyPage1;

	private PanelMadexForm1 panelMadexForm1;

	private PanelMadexForm2 panelMadexForm2;

	private JScrollPane scrollPane;

	private JPanel panelPager;

	private Color DEF_BACK_COL = new Color(24, 86, 110);
	private Color DEF_BUT_BACK = new Color(130, 163, 175);
	private Color DEF_BUT_FORE = new Color(8, 68, 95);

	/**
	 * Create the panel
	 */
	public PanelLabSpecialAdd() {
		super();
		// Global.panelLabSpecialAdd = this;
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
		typeOfFormLabel.setBounds(1033, 14, 52, 16);
		typeOfFormLabel.setVisible(false);
		add(typeOfFormLabel);

		cmbFormType = new JComboBox();
		cmbFormType.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				doFormChanged();
			}
		});

		cmbFormType.setBounds(1090, 10, 52, 25);
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
						.isUpdatePriviledge(SubAppTypes.LAB_SPECIAL_REPORTS)) {
					doSave();
					// Global.panelLabSpecial.updateLabSpecialJTable();
					Global.frameLabSpecialAddNew.dispose();
				}
			}
		});
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.setText("Save");
		saveButton.setBounds(115, 10, 106, 26);
		add(saveButton);

		final JxButton cancelButton = new JxButton();
		cancelButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		cancelButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.frameLabSpecialAddNew.dispose();
			}
		});
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setText("Cancel");
		cancelButton.setBounds(248, 10, 106, 26);
		add(cancelButton);

		final JLabel descriptionLabel = new JLabel();
		descriptionLabel.setFont(new Font("", Font.BOLD, 12));
		descriptionLabel.setText("DESCRIPTION");
		descriptionLabel.setBounds(1148, 14, 41, 16);
		descriptionLabel.setVisible(false);
		add(descriptionLabel);

		txtNotes = new JTextField();
		txtNotes.setBounds(1195, 12, 17, 20);
		txtNotes.setVisible(false);
		add(txtNotes);

		final JLabel statuLabel = new JLabel();
		statuLabel.setFont(new Font("", Font.BOLD, 12));
		statuLabel.setText("STATUS");
		statuLabel.setBounds(1033, 50, 33, 16);
		statuLabel.setVisible(false);
		add(statuLabel);

		cmbStatus = new JComboBox();
		cmbStatus.setBounds(1090, 46, 52, 25);
		cmbStatus.setVisible(false);
		add(cmbStatus);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 81, 975, this.getSize().height - 81 - 50);
		add(scrollPane);

		panelLabReasonForStudyPage1 = new PanelLabReasonForStudyPage1();
		// scrollPane.setViewportView(panel);

		panelLabSpecialpageReasonSForm = new PanelLabSpecialpageReasonSForm();
		// panelLabSpecialpageReasonSForm.setLayout(null);
		// panelLabSpecialpageReasonSForm.setBounds(29, 642, 968, 35);
		add(panelLabSpecialpageReasonSForm);

		panelLabSpecialpageReasonSForm.setVisible(false);

		panelMadexForm1 = new PanelMadexForm1();

		// panelMadexForm1.setBounds(29, 642, 968, 35);
		// add(panelMadexForm1);

		panelMadexForm2 = new PanelMadexForm2();
		// add(panelMadexForm2);

		// panelMadexForm1.setVisible(false);
		// panelMadexForm2.setVisible(false);

		panel = new PanelImage();
		panel.setArc(0.4f);
		panel.setCurvedView(true);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		panel.setBounds(909, 5, 92, 74);
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
		printButton.setBounds(376, 10, 106, 26);
		add(printButton);

		// doFormChanged();

	}

	public void doSave() {
		LabSpecial ls = new LabSpecial();
		if (cmbFormType.getSelectedItem().equals("Reason For Study Form")) {
			Global.panelLabReasonForStudyPage1.doSave();

			ls.setFormId(Global.currentLabReasonFormKey);
		}
		if (cmbFormType.getSelectedItem().equals("Medfax Form 1")) {
			try {
				Global.panelMadexForm1.doSave();
			} catch (Exception e) {
				// System.out.println("here:labspecial");
				e.printStackTrace();
			}

			ls.setFormId(Global.currentMadexForm1Key);
		}

		if (cmbFormType.getSelectedItem().equals("Medfax Form 2")) {
			// try {
			Global.panelMadexForm2.doSave();
			// }
			// catch(Exception e) {
			System.out.println("here:labspecial2");
			// }

			ls.setFormId(Global.currentMadexForm2Key);
		}

		ls.setSerial(Global.currentLabSpecialKey);

		ls.setResidentId(Global.currentResidenceKey);

		ls.setFormType((String) cmbFormType.getSelectedItem());
		ls.setNotes(txtNotes.getText());
		ls.setUser("Admin");
		ls.setStatus((String) cmbStatus.getSelectedItem());
		if (Global.currentLabSpecialKey == 0) {
			ls.setDateCreated(MedrexClientManager.getServerTime());
		} else {
			ls.setDateCreated(creationDate);
		}
		ls.setLastModified(MedrexClientManager.getServerTime());
		try {
			Global.currentLabSpecialKey = MedrexClientManager.getInstance()
					.insertOrUpdateLabSpecial(ls);
		} catch (Exception e) {

		}

	}

	public void fillCombos() {
		cmbFormType.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Reason For Study Form", "Medfax Form 1", "Medfax Form 2" }));

		cmbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Complete", "Incomplete" }));

	}

	public void updateData() {
		if (Global.currentLabSpecialKey == 0) {
			cmbFormType.setEnabled(false);
			cmbFormType.setSelectedItem(Global.currentLabSpecialForm);

		} else {
			LabSpecial ls = null;
			try {
				ls = MedrexClientManager.getInstance().getLabSpecial(
						Global.currentLabSpecialKey);
			} catch (Exception e) {
			}
			cmbFormType.setSelectedItem(ls.getFormType());
			cmbStatus.setSelectedItem(ls.getStatus());
			txtNotes.setText(ls.getNotes());
			creationDate = ls.getDateCreated();
		}
		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Reason For Study Form")) {
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
				.equalsIgnoreCase("Reason For Study Form")) {

			if (Global.currentLabSpecialKey != 0) {
				LabSpecial ls = null;
				try {
					ls = MedrexClientManager.getInstance().getLabSpecial(
							Global.currentLabSpecialKey);
				} catch (Exception e) {
				}
				Global.currentLabReasonFormKey = ls.getFormId();
			} else {
				Global.currentLabReasonFormKey = 0;

			}

			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelLabReasonForStudyPage1);
			scrollPane.updateUI();
			panelLabSpecialpageReasonSForm.setVisible(true);
			panelLabSpecialpageReasonSForm.updateUI();
			Global.panelLabReasonForStudyPage1.updateData();

		}

		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Medfax Form 1")) {

			if (Global.currentLabSpecialKey != 0) {
				LabSpecial ls = null;
				try {
					ls = MedrexClientManager.getInstance().getLabSpecial(
							Global.currentLabSpecialKey);
				} catch (Exception e) {
				}
				Global.currentMadexForm1Key = ls.getFormId();
			} else {
				Global.currentMadexForm1Key = 0;

			}

			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelMadexForm1);
			scrollPane.updateUI();
			panelLabSpecialpageReasonSForm.setVisible(true);
			panelLabSpecialpageReasonSForm.updateUI();
			Global.panelMadexForm1.updateData();

		}

		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Medfax Form 2")) {

			if (Global.currentLabSpecialKey != 0) {
				LabSpecial ls = null;
				try {
					ls = MedrexClientManager.getInstance().getLabSpecial(
							Global.currentLabSpecialKey);
				} catch (Exception e) {
				}
				Global.currentMadexForm2Key = ls.getFormId();
			} else {
				Global.currentMadexForm2Key = 0;

			}

			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelMadexForm2);
			scrollPane.updateUI();
			panelLabSpecialpageReasonSForm.setVisible(true);
			panelLabSpecialpageReasonSForm.updateUI();
			Global.panelMadexForm2.updateData();

		}
	}

	public void showActivityFormPage(int pageNum) {

		switch (pageNum) {
		case 1:
			panelLabReasonForStudyPage1.updateData();
			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelLabReasonForStudyPage1);
			break;
		}

		scrollPane.updateUI();
	}

}
