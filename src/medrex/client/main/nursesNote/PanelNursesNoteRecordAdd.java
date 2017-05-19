package medrex.client.main.nursesNote;

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
import medrex.client.mds.ui.PanelMDSPage;
import medrex.client.utils.ComponentPrintable;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.intf.Form;
import medrex.commons.vo.nursesNotes.NursesNotesRecord;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxScrollPane;

public class PanelNursesNoteRecordAdd extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5505740247005153355L;
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
	public PanelNursesNoteRecordAdd() {
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
					showNursesNotesFormPage((Integer) evt.getNewValue());
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
				doFormChanged();
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
				Global.frameNursesNotesRecordAdd.dispose();
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
				Global.frameNursesNotesRecordAdd.dispose();
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

						showNursesNotesFormPage(i + 1);
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
		fillCombos();
		updateData();
		doFormChanged();

	}

	public void doSave() {

		NursesNotesRecord nursesSum = new NursesNotesRecord();
		for (int i = 0; i < forms.length; i++) {
			if (forms[i] == null) {
				forms[i] = getForm(i);
				forms[i].doUpdate();
			}
		}
		if (cmbFormType.getSelectedItem().equals("Daily Skilled Nurses Notes")) {

			for (int i = 0; i < forms.length; i++) {
				showNursesNotesFormPage(i + 1);
				if (forms[i].doValidate()) {
					forms[i].doSave();
					anError = true;
					nursesSum.setStatus("Complete");
				} else {
					showNursesNotesFormPage(i + 1);
					anError = false;
					break;
				}
			}
			anError = false;
			nursesSum.setStatus("Complete");
			nursesSum.setSerial(Global.currentNursesNotesRecordKey);
			nursesSum.setResidentId(Global.currentResidenceKey);
			nursesSum.setFormType((String) cmbFormType.getSelectedItem());
			nursesSum.setFormId(Global.currentDailySkilledNursesNotesKey);
			if (Global.currentNursesNotesRecordKey == 0) {
				nursesSum.setDateCreated(MedrexClientManager.getServerTime());
			} else {
				nursesSum.setDateCreated(creationDate);
			}
			nursesSum.setLastModified(MedrexClientManager.getServerTime());
			try {
				Global.currentNursesNotesRecordKey = MedrexClientManager
						.getInstance().insertOrUpdateNursesNotes(nursesSum);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void fillCombos() {
		cmbFormType.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "Daily Skilled Nurses Notes" }));

		cmbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Complete", "Incomplete" }));

	}

	public void updateData() {
		if (Global.currentNursesNotesRecordKey == 0) {
			cmbFormType.setEnabled(false);
			cmbFormType.setSelectedItem(Global.currentNursesNotesForm);

		} else {
			NursesNotesRecord nurseRec = null;

			try {
				nurseRec = MedrexClientManager.getInstance()
						.getNursesNotesRecord(
								Global.currentNursesNotesRecordKey);
			} catch (Exception e) {
				e.printStackTrace();
			}
			cmbFormType.setSelectedItem(nurseRec.getFormType());
			cmbStatus.setSelectedItem(nurseRec.getStatus());
			txtNotes.setText(nurseRec.getNotes());
			creationDate = nurseRec.getDateCreated();
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
				.equalsIgnoreCase("Daily Skilled Nurses Notes")) {
			if (Global.currentNursesNotesRecordKey != 0) {
				try {
					MedrexClientManager.getInstance().getNursesNotesRecord(
							Global.currentNursesNotesRecordKey);
				} catch (Exception e) {

				}
			}
		}

		if (forms[0] == null) {
			forms[0] = getForm(0);
		}
		scrollPane.getViewport().setViewPosition(new Point(0, 0));
		scrollPane.setViewportView((Component) forms[0]);
		scrollPane.updateUI();
		// System.out.println("Form[o]"+forms[0]);
		forms[0].doUpdate();
	}

	public void showNursesNotesFormPage(int pageNum) {

		Global.currentNursesNotesPageNo = pageNum;

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

		if (Global.currentNursesNotesForm
				.equalsIgnoreCase("Daily Skilled Nurses Notes")) {
			switch (index) {
			case 0:
				return new PanelDailySkilledNursesNotes();
			case 1:
				return new PanelDailySkilledNursesNotesForm2();
			default:
				return null;
			}
		}
		return null;

	}

}
