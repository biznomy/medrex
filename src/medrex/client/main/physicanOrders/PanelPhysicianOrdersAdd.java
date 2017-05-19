package medrex.client.main.physicanOrders;

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

import javax.swing.DefaultComboBoxModel;
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
import medrex.client.main.physicanOrders.prescription.PanelPrescription;
import medrex.client.main.physicanOrders.progressNotes.PanelProgressNotes2;
import medrex.client.utils.ComponentPrintable;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.physicianOrders.PhysicianOrders;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxScrollPane;

public class PanelPhysicianOrdersAdd extends JPanel {

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

	private PanelPhysicianPlazaHealthCare panelPhysicianPlazaHealthCare;

	private PanelPhysicianInfusion panelPhysicianInfusion;

	private PanelPhysicianSpeciality panelPhysicianSpeciality;

	private PanelPhysicianOrderForm1 panelPhysicianOrderForm1;

	private PanelPhysicianOrderForm2 panelPhysicianOrderForm2;

	private PanelPhysicianOrderForm3 panelPhysicianOrderForm3;

	private PanelPrescription panelPrescription;

	private PanelProgressNotes2 panelProgressNotes2;

	private JxScrollPane scrollPane;

	private Color DEF_BACK_COL = new Color(24, 86, 110);
	private Color DEF_BUT_BACK = new Color(130, 163, 175);
	private Color DEF_BUT_FORE = new Color(8, 68, 95);

	public PanelPhysicianOrdersAdd() {
		super();
		// Global.panelPhysicianOrdersAdd = this;
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
		typeOfFormLabel.setBounds(1034, 22, 72, 16);
		typeOfFormLabel.setVisible(false);
		add(typeOfFormLabel);

		cmbFormType = new JComboBox();
		cmbFormType.setVisible(false);
		cmbFormType.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				doFormChanged();
			}
		});

		cmbFormType.setBounds(1093, 18, 61, 25);
		add(cmbFormType);

		final JxButton saveButton = new JxButton();
		saveButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		saveButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSave();
				// Global.panelPhysicianOrders.updatePhysicianOrdersJTable();
				Global.framePhysicianOrdersAddNew.dispose();
			}
		});
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.setText("Save");
		saveButton.setBounds(77, 16, 106, 26);
		add(saveButton);

		final JxButton cancelButton = new JxButton();
		cancelButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		cancelButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.framePhysicianOrdersAddNew.dispose();
			}
		});
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setText("Cancel");
		cancelButton.setBounds(202, 16, 106, 26);
		add(cancelButton);

		final JLabel descriptionLabel = new JLabel();
		descriptionLabel.setFont(new Font("", Font.BOLD, 12));
		descriptionLabel.setText("DESCRIPTION");
		descriptionLabel.setBounds(1160, 35, 32, 16);
		descriptionLabel.setVisible(false);
		add(descriptionLabel);

		txtNotes = new JTextField();
		txtNotes.setBounds(1198, 20, 32, 20);
		txtNotes.setVisible(false);
		add(txtNotes);

		final JLabel statuLabel = new JLabel();
		statuLabel.setFont(new Font("", Font.BOLD, 12));
		statuLabel.setText("STATUS");
		statuLabel.setBounds(1034, 58, 46, 16);
		statuLabel.setVisible(false);
		add(statuLabel);

		cmbStatus = new JComboBox();
		cmbStatus.setVisible(false);
		cmbStatus.setBounds(1093, 54, 61, 25);
		add(cmbStatus);

		scrollPane = new JxScrollPane();
		scrollPane.setBounds(28, 88, 975, this.getSize().height - 88 - 50);
		add(scrollPane);

		panelPhysicianPlazaHealthCare = new PanelPhysicianPlazaHealthCare();

		panelPhysicianInfusion = null;

		panelPhysicianSpeciality = null;

		panelPhysicianOrderForm1 = null;

		panelPhysicianOrderForm2 = null;
		panelPhysicianOrderForm3 = null;

		panelProgressNotes2 = null;

		panel = new PanelImage();
		panel.setArc(0.4f);
		panel.setCurvedView(true);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		panel.setBounds(900, 8, 92, 74);
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
		printButton.setBounds(314, 17, 106, 26);
		add(printButton);

		// doFormChanged();

	}

	public void doSave() {
		PhysicianOrders ls = new PhysicianOrders();
		if (cmbFormType.getSelectedItem().equals(
				"Physician Plaza Health Care Form")) {
			Global.panelPhysicianPlazaHealthCare.doSave();

			ls.setFormId(Global.currentPhysicianPlazaHealthCareKey);
		} else if (cmbFormType.getSelectedItem().equals(
				"Physician Infusion Form")) {

			Global.panelPhysicianInfusion.doSave();

			ls.setFormId(Global.currentPhysicianInfusionKey);
		}

		else if (cmbFormType.getSelectedItem().equals(
				"Physician Speciality Form")) {

			Global.panelPhysicianSpeciality.doSave();

			ls.setFormId(Global.currentPhysicianSpecialityKey);
		}

		else if (cmbFormType.getSelectedItem().equals("Physician Order Form 1")) {

			Global.panelPhysicianOrderForm1.doSave();

			ls.setFormId(Global.currentPhysicianOrderForm1Key);
		} else if (cmbFormType.getSelectedItem().equals(
				"Physician Order Form 2")) {

			Global.panelPhysicianOrderForm2.doSave();

			ls.setFormId(Global.currentPhysicianOrderForm2Key);
		} else if (cmbFormType.getSelectedItem().equals(
				"Physician Order Form 3")) {

			Global.panelPhysicianOrderForm3.doSave();

			ls.setFormId(Global.currentPhysicianOrderForm3Key);
		} else if (cmbFormType.getSelectedItem().equals("Prescription")) {

			Global.panelPrescription.doSave();
			ls.setFormId(Global.currentPrescriptionKey);
		} else if (cmbFormType.getSelectedItem().equals("Progress Notes")) {

			Global.panelProgressNotes2.doSave();
			ls.setFormId(Global.currentPanelProgressNotesKey);
		} else {
			ls.setFormId(0);
		}

		ls.setSerial(Global.currentPhysisianOrdersKey);

		ls.setResidentId(Global.currentResidenceKey);

		ls.setFormType((String) cmbFormType.getSelectedItem());
		ls.setNotes(txtNotes.getText());
		ls.setUser("Admin");
		ls.setStatus((String) cmbStatus.getSelectedItem());
		if (Global.currentPhysisianOrdersKey == 0) {
			ls.setDateCreated(MedrexClientManager.getServerTime());
		} else {
			ls.setDateCreated(creationDate);
		}
		ls.setLastModified(MedrexClientManager.getServerTime());
		try {
			Global.currentPhysisianOrdersKey = MedrexClientManager
					.getInstance().insertOrUpdatePhysicianOrder(ls);
		} catch (Exception e) {

		}

	}

	public void fillCombos() {
		cmbFormType.setModel(new DefaultComboBoxModel(new String[] {
				"Physician Plaza Health Care Form", "Physician Infusion Form",
				"Physician Speciality Form", "Physician Order Form 1",
				"Physician Order Form 2", "Physician Order Form 3",
				"Prescription", "Progress Notes" }));

		cmbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Complete", "Incomplete" }));

	}

	public void updateData() {
		if (Global.currentPhysisianOrdersKey == 0) {
			cmbFormType.setEnabled(false);
			// System.out.println("Global.currentPhysicianOrderForm"+Global.currentPhysicianOrderForm);
			cmbFormType.setSelectedItem(Global.currentPhysicianOrderForm);

		} else {
			PhysicianOrders ls = null;
			try {
				ls = MedrexClientManager.getInstance().getPhysicianOrder(
						Global.currentPhysisianOrdersKey);
			} catch (Exception e) {
			}
			cmbFormType.setSelectedItem(ls.getFormType());
			cmbStatus.setSelectedItem(ls.getStatus());
			txtNotes.setText(ls.getNotes());
			creationDate = ls.getDateCreated();
		}
		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Physician Plaza Health Care Form")) {
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
				.equalsIgnoreCase("Physician Plaza Health Care Form")) {

			if (Global.currentPhysisianOrdersKey != 0) {
				PhysicianOrders ls = null;
				try {
					ls = MedrexClientManager.getInstance().getPhysicianOrder(
							Global.currentPhysisianOrdersKey);
				} catch (Exception e) {
				}
				Global.currentPhysicianPlazaHealthCareKey = ls.getFormId();
			} else {
				Global.currentPhysicianPlazaHealthCareKey = 0;

			}
			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelPhysicianPlazaHealthCare);
			scrollPane.updateUI();
			Global.panelPhysicianPlazaHealthCare.updateData();

		}

		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Physician Infusion Form")) {
			if (panelPhysicianInfusion == null) {
				panelPhysicianInfusion = new PanelPhysicianInfusion();
			}

			if (Global.currentPhysisianOrdersKey != 0) {
				PhysicianOrders ls = null;
				try {
					ls = MedrexClientManager.getInstance().getPhysicianOrder(
							Global.currentPhysisianOrdersKey);
				} catch (Exception e) {
				}
				Global.currentPhysicianInfusionKey = ls.getFormId();
			} else {
				Global.currentPhysicianInfusionKey = 0;
			}

			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelPhysicianInfusion);
			scrollPane.updateUI();
			Global.panelPhysicianInfusion.updateData();
		}

		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Physician Speciality Form")) {

			if (panelPhysicianSpeciality == null) {
				panelPhysicianSpeciality = new PanelPhysicianSpeciality();
			}

			if (Global.currentPhysisianOrdersKey != 0) {
				PhysicianOrders ls = null;
				try {
					ls = MedrexClientManager.getInstance().getPhysicianOrder(
							Global.currentPhysisianOrdersKey);
				} catch (Exception e) {
				}
				Global.currentPhysicianSpecialityKey = ls.getFormId();
			} else {
				Global.currentPhysicianSpecialityKey = 0;
			}

			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelPhysicianSpeciality);
			scrollPane.updateUI();
			Global.panelPhysicianSpeciality.updateData();
		}

		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Physician Order Form 1")) {

			if (panelPhysicianOrderForm1 == null) {
				panelPhysicianOrderForm1 = new PanelPhysicianOrderForm1();
			}

			if (Global.currentPhysisianOrdersKey != 0) {
				PhysicianOrders ls = null;
				try {
					ls = MedrexClientManager.getInstance().getPhysicianOrder(
							Global.currentPhysisianOrdersKey);
				} catch (Exception e) {
				}
				Global.currentPhysicianOrderForm1Key = ls.getFormId();
			} else {
				Global.currentPhysicianOrderForm1Key = 0;
			}

			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelPhysicianOrderForm1);
			scrollPane.updateUI();
			Global.panelPhysicianOrderForm1.updateData();
		}
		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Physician Order Form 2")) {

			if (panelPhysicianOrderForm2 == null) {
				panelPhysicianOrderForm2 = new PanelPhysicianOrderForm2();
			}

			if (Global.currentPhysisianOrdersKey != 0) {
				PhysicianOrders ls = null;
				try {
					ls = MedrexClientManager.getInstance().getPhysicianOrder(
							Global.currentPhysisianOrdersKey);
				} catch (Exception e) {
				}
				Global.currentPhysicianOrderForm2Key = ls.getFormId();
			} else {
				Global.currentPhysicianOrderForm2Key = 0;
			}

			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelPhysicianOrderForm2);
			scrollPane.updateUI();
			Global.panelPhysicianOrderForm2.updateData();
		}
		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Physician Order Form 3")) {

			// if(panelPhysicianOrderForm3 == null){
			panelPhysicianOrderForm3 = new PanelPhysicianOrderForm3();
			// }

			if (Global.currentPhysisianOrdersKey != 0) {
				PhysicianOrders ls = null;
				try {
					ls = MedrexClientManager.getInstance().getPhysicianOrder(
							Global.currentPhysisianOrdersKey);
				} catch (Exception e) {
				}
				Global.currentPhysicianOrderForm3Key = ls.getFormId();
			} else {
				Global.currentPhysicianOrderForm3Key = 0;
			}
			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelPhysicianOrderForm3);
			scrollPane.updateUI();
			Global.panelPhysicianOrderForm3.updateData();
		}

		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Prescription")) {
			// // if(panelPhysicianOrderForm3 == null){
			// panelPrescription = new PanelPrescription();
			// // // }
			//
			if (Global.currentPhysisianOrdersKey != 0) {
				PhysicianOrders ls = null;
				try {
					ls = MedrexClientManager.getInstance().getPhysicianOrder(
							Global.currentPhysisianOrdersKey);
				} catch (Exception e) {
				}
				Global.currentPrescriptionKey = ls.getFormId();
			} else {
				Global.currentPrescriptionKey = 0;
			}
			Global.panelAddNewPhysician.doFormChanged();
			// scrollPane.getViewport().setViewPosition(new Point(0, 0));
			// scrollPane.setViewportView(panelPrescription);
			// scrollPane.updateUI();
			// Global.panelPrescription.updateData();
		}

		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Progress Notes")) {
			if (Global.currentPhysisianOrdersKey != 0) {
				PhysicianOrders ls = null;
				try {
					ls = MedrexClientManager.getInstance().getPhysicianOrder(
							Global.currentPhysisianOrdersKey);
				} catch (Exception e) {
				}
				Global.currentPanelProgressNotesKey = ls.getFormId();
			} else {
				Global.currentPanelProgressNotesKey = 0;
			}
			if (panelProgressNotes2 == null) {
				panelProgressNotes2 = new PanelProgressNotes2();
			}
			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView(panelProgressNotes2);
			scrollPane.updateUI();
			Global.panelProgressNotes2.updateData();
		}

	}

}
