package medrex.client.main.dialysis;

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
import medrex.client.mds.ui.PanelMDSPage;
import medrex.client.utils.ComponentPrintable;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.intf.Form;
import medrex.commons.vo.dialysis.DialysisRecord;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxScrollPane;

public class PanelDialysisRecordAdd extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 643858412029474484L;
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

	/**
	 * Create the panel
	 */
	public PanelDialysisRecordAdd() {
		super();
		setPreferredSize(new Dimension(Toolkit.getDefaultToolkit()
				.getScreenSize().width, Toolkit.getDefaultToolkit()
				.getScreenSize().height - 50));
		setSize(new Dimension(
				Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
						.getDefaultToolkit().getScreenSize().height - 50));
		setBackground(DEF_BACK_COL);
		setLayout(null);

		forms = new Form[2];

		panelPager = new PanelMDSPage();
		panelPager.setPageCount(forms.length);
		panelPager.setBounds(29, 46, 863, 35);
		panelPager.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName().equals(
						PanelMDSPage.PAGE_BUTTON_CLICKED)) {
					showDialysisFormPage((Integer) evt.getNewValue());
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
		scrollPane.setBounds(28, 81, 971, this.getSize().height - 81 - 50);
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

		final JPanel panel_1 = new JPanel();
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_1.setLayout(flowLayout);
		panel_1.setOpaque(false);
		panel_1.setBounds(29, 3, 560, 37);
		add(panel_1);

		saveButton = new JxButton();
		saveButton.setPreferredSize(new Dimension(106, 26));
		saveButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		saveButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				if (doSave("save")) {
					Global.frameDialysisRecordAdd.dispose();
				}
			}
		});
		saveButton.setFont(new Font("Dialog", Font.BOLD, 12));
		saveButton.setText("Save");
		panel_1.add(saveButton);

		cancelButton = new JxButton();
		cancelButton.setPreferredSize(new Dimension(106, 26));
		panel_1.add(cancelButton);
		cancelButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		cancelButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.frameDialysisRecordAdd.dispose();

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
						showDialysisFormPage(i + 1);
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
	}

	public boolean doSave(String str) {
		anError = false;
		DialysisRecord dialysisRecord = new DialysisRecord();

		for (int i = 0; i < forms.length; i++) {
			if (forms[i] == null) {
				forms[i] = getForm(i);
				forms[i].doUpdate();
			}
		}
		if (cmbFormType.getSelectedItem().equals(
				"Renal Dialysis Communication Form")) {

			if (str.equalsIgnoreCase("save")) {
				for (int i = 0; i < forms.length; i++) {
					showDialysisFormPage(i + 1);
					if (forms[i].doValidate()) {
						forms[i].doSave();
						anError = true;
						dialysisRecord.setStatus("Complete");
					} else {
						showDialysisFormPage(i + 1);
						anError = false;
						break;
					}
				}
			} else {
				for (int i = 0; i < forms.length; i++) {
					forms[i].doSave();
				}
				dialysisRecord.setStatus("Incomplete");
				anError = true;
			}

			dialysisRecord
					.setFormId(Global.currentRenalDialysisCommunicationFormKey);

		}
		dialysisRecord.setSerial(Global.currentDialysisRecordKey);
		dialysisRecord.setResidentId(Global.currentResidenceKey);
		dialysisRecord.setFormType((String) cmbFormType.getSelectedItem());
		dialysisRecord.setNotes(txtNotes.getText());

		Users users = new Users();
		try {
			users = MedrexClientManager.getInstance().getUser(
					Global.currentLoggedInUserKey);
		} catch (Exception e) {

		}
		dialysisRecord.setUser(users.getUserName());

		if (Global.currentDialysisRecordKey == 0) {
			dialysisRecord.setDateCreated(MedrexClientManager.getServerTime());
		} else {
			dialysisRecord.setDateCreated(creationDate);
		}
		dialysisRecord.setLastModified(MedrexClientManager.getServerTime());
		try {
			if (anError) {
				Global.currentDialysisRecordKey = MedrexClientManager
						.getInstance().insertOrUpdateDialysisRecord(
								dialysisRecord);
			}
		} catch (Exception e) {

		}
		return anError;

	}

	public void fillCombos() {
		cmbFormType.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "Renal Dialysis Communication Form" }));
		cmbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Complete", "Incomplete" }));

	}

	public void updateData() {
		if (Global.currentDialysisRecordKey == 0) {
			cmbFormType.setEnabled(false);
			cmbFormType.setSelectedItem(Global.currentDialysisRecordForm);

		} else {
			cmbFormType.setEnabled(false);
			DialysisRecord ar = null;
			try {
				ar = MedrexClientManager.getInstance().getDialysisRecord(
						Global.currentDialysisRecordKey);
			} catch (Exception e) {
			}
			cmbFormType.setSelectedItem(ar.getFormType());
			cmbStatus.setSelectedItem(ar.getStatus());
			txtNotes.setText(ar.getNotes());
			creationDate = ar.getDateCreated();
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
		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Renal Dialysis Communication Form")) {

			if (Global.currentDialysisRecordKey != 0) {
				DialysisRecord ar = null;
				try {
					ar = MedrexClientManager.getInstance().getDialysisRecord(
							Global.currentDialysisRecordKey);
				} catch (Exception e) {
				}
				Global.currentRenalDialysisCommunicationFormKey = ar
						.getFormId();
			} else {
				Global.currentRenalDialysisCommunicationFormKey = 0;
				Global.currentRenalDialysisCommunicationFormPage2Key = 0;
			}
		}
		if (forms[0] == null) {
			forms[0] = getForm(0);
		}
		scrollPane.setViewportView((Component) forms[0]);
		scrollPane.getViewport().setViewPosition(new Point(0, 0));
		scrollPane.updateUI();
		forms[0].doUpdate();
	}

	public void showDialysisFormPage(int pageNum) {

		Form form = forms[pageNum - 1];
		if (form == null) {
			form = getForm(pageNum - 1);
			forms[pageNum - 1] = form;
			form.doUpdate();
		}
		scrollPane.setViewportView((Component) form);
		scrollPane.getViewport().setViewPosition(new Point(0, 0));
		scrollPane.updateUI();
	}

	public Form getForm(int index) {
		if (Global.currentDialysisRecordForm
				.equalsIgnoreCase("Renal Dialysis Communication Form")) {
			switch (index) {
			case 0:
				return new PanelRenalDialysisCommunicationFormPage1();
			case 1:
				return new PanelRenalDialysisCommunicationFormPage2();
			default:
				return null;
			}
		}
		return null;
	}

}
