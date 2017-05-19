package medrex.client.mds3.ui;

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
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

import medrex.client.PanelImage;
import medrex.client.constants.Global;
import medrex.client.mds.ui.PanelMDSPage;
import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.engine.Mds3ClientEngine;
import medrex.client.mds3.general.Mds3ItemSet;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.itemsets.Mds3ItemSetNC;
import medrex.client.mds3.general.itemsets.Mds3ItemSetND;
import medrex.client.mds3.general.itemsets.Mds3ItemSetNOD;
import medrex.client.mds3.general.itemsets.Mds3ItemSetNOSO;
import medrex.client.mds3.general.itemsets.Mds3ItemSetNP;
import medrex.client.mds3.general.itemsets.Mds3ItemSetNQ;
import medrex.client.mds3.general.itemsets.Mds3ItemSetNSD;
import medrex.client.mds3.general.itemsets.Mds3ItemSetNSSS;
import medrex.client.mds3.general.itemsets.Mds3ItemSetNTST;
import medrex.client.mds3.general.itemsets.Mds3ItemSetSD;
import medrex.client.mds3.general.itemsets.Mds3ItemSetSOD;
import medrex.client.mds3.general.itemsets.Mds3ItemSetSP;
import medrex.client.mds3.general.itemsets.Mds3ItemSetSSD;
import medrex.client.mds3.ui.dynamicPage.PanelMds3DynamicPage;
import medrex.client.utils.ComponentPrintable;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.intf.Form;

import com.sX.swing.JxButton;
import com.sX.swing.JxScrollPane;

public class PanelMds3RecordAdd extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6594000055784140718L;
	private JButton printButton;
	private PanelImage panel;
	private JComboBox cmbStatus;
	private JTextField txtNotes;
	private JComboBox cmbFormType;
	private Date creationDate;
	private Form[] forms;
	private JxScrollPane scrollPane;
	private PanelMds3Page panelPager;
	private Color DEF_BACK_COL = new Color(24, 86, 110);
	private Color DEF_BUT_BACK = new Color(130, 163, 175);
	private Color DEF_BUT_FORE = new Color(8, 68, 95);
	private boolean anError;
	Mds3ItemSet itemSet;
	private Integer currentPage;
	private JxButton btnRUG;

	/**
	 * Create the panel
	 */

	public PanelMds3RecordAdd() {
		super();

		setPreferredSize(new Dimension(0, Toolkit.getDefaultToolkit()
				.getScreenSize().height - 50));
		setSize(new Dimension(
				Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
						.getDefaultToolkit().getScreenSize().height - 50));
		setBackground(DEF_BACK_COL);
		setLayout(null);

		// To set the pages dynamicaly from item Mds3ItemSet
		if (Global.currentMds3FormType
				.equalsIgnoreCase("Nursing Home Comprehensive (NC) Item Set")) {
			Mds3ItemSet itemSet = Mds3ItemSetNC.getNCItemSet();
			this.itemSet = itemSet;
			forms = new Form[itemSet.getPages().size()];

		}

		if (Global.currentMds3FormType
				.equalsIgnoreCase("Nursing Home Discharge (ND) Item Set")) {
			Mds3ItemSet itemSet = Mds3ItemSetND.getNDItemSet();
			this.itemSet = itemSet;
			forms = new Form[itemSet.getPages().size()];
		}
		if (Global.currentMds3FormType
				.equalsIgnoreCase("Nursing Home and Swing Bed OMRA(NO/SO) Item Set")) {
			Mds3ItemSet itemSet = Mds3ItemSetNOSO.getNOSOItemSet();
			this.itemSet = itemSet;
			forms = new Form[itemSet.getPages().size()];
		}
		if (Global.currentMds3FormType
				.equalsIgnoreCase("Swing Bed PPS(SP) Item Set")) {
			Mds3ItemSet itemSet = Mds3ItemSetSP.getSPItemSet();
			this.itemSet = itemSet;
			forms = new Form[itemSet.getPages().size()];
		}
		if (Global.currentMds3FormType
				.equalsIgnoreCase("Swing Bed Discharge (SD) Item Set")) {
			Mds3ItemSet itemSet = Mds3ItemSetSD.getSDItemSet();
			this.itemSet = itemSet;
			forms = new Form[itemSet.getPages().size()];
		}
		if (Global.currentMds3FormType
				.equalsIgnoreCase("Nursing Home PPS(NP) Item Set")) {
			Mds3ItemSet itemSet = Mds3ItemSetNP.getNPItemSet();
			this.itemSet = itemSet;
			forms = new Form[itemSet.getPages().size()];
		}
		if (Global.currentMds3FormType
				.equalsIgnoreCase("Swing Bed OMRA-Discharge (SOD) Item Set")) {
			Mds3ItemSet itemSet = Mds3ItemSetSOD.getSODItemSet();
			this.itemSet = itemSet;
			forms = new Form[itemSet.getPages().size()];
		}
		if (Global.currentMds3FormType
				.equalsIgnoreCase("Nursing Home OMRA-Discharge(NOD) Item Set")) {
			Mds3ItemSet itemSet = Mds3ItemSetNOD.getNODItemSet();
			this.itemSet = itemSet;
			forms = new Form[itemSet.getPages().size()];
		}

		if (Global.currentMds3FormType
				.equalsIgnoreCase("Nursing Home Quarterly (NQ) Item Set")) {
			Mds3ItemSet itemSet = Mds3ItemSetNQ.getNQItemSet();
			this.itemSet = itemSet;
			forms = new Form[itemSet.getPages().size()];
		}

		if (Global.currentMds3FormType
				.equalsIgnoreCase("Nursing Home OMRA-Start of Therapy and Discharge(NSD) Item Set")) {
			Mds3ItemSet itemSet = Mds3ItemSetNSD.getNSDItemSet();
			this.itemSet = itemSet;
			forms = new Form[itemSet.getPages().size()];
		}

		if (Global.currentMds3FormType
				.equalsIgnoreCase("Nursing Home and Swing Bed Tracking (NT/ST) Item Set")) {
			Mds3ItemSet itemSet = Mds3ItemSetNTST.getNTSTItemSet();
			this.itemSet = itemSet;
			forms = new Form[itemSet.getPages().size()];
		}

		if (Global.currentMds3FormType
				.equalsIgnoreCase("Nursing Home and Swing Bed OMRA-Start of Therapy(NS/SS) Item Set")) {
			Mds3ItemSet itemSet = Mds3ItemSetNSSS.getNSSSItemSet();
			this.itemSet = itemSet;
			forms = new Form[itemSet.getPages().size()];
		}

		if (Global.currentMds3FormType
				.equalsIgnoreCase("Swing Bed OMRA-Start of Therapy and Discharge (SSD) Item Set")) {
			Mds3ItemSet itemSet = Mds3ItemSetSSD.getSSDItemSet();
			this.itemSet = itemSet;
			forms = new Form[itemSet.getPages().size()];
		}

		panelPager = new PanelMds3Page();
		panelPager.setPageCount(forms.length);
		panelPager.setBounds(29, 46, 863, 35);
		panelPager.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName().equals(
						PanelMDSPage.PAGE_BUTTON_CLICKED)) {
					showMDSFormPage(((Integer) evt.getNewValue()).intValue());
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
				// doFormChanged();
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
				itemSet.getPages().size();
				List list = new ArrayList<Mds3ItemSet>();

				// retify
				if (currentPage == null) {
					currentPage = 1;
				}

				for (int page = 1; page <= itemSet.getPages().size(); page++) {
					list = itemSet.getPages().get(page + "").getSubSections();
					for (int i = 0; i < list.size(); i++) {
						itemSet.getPages();
						// Mds3SubSection sec = (Mds3SubSection)
						// list.get(currentPage);
						Mds3SubSection sec = (Mds3SubSection) list.get(i);
						sec.doSave();
					}
				}
				try {
					Mds3Controller.getInstance().doSave();
				} catch (RemoteException e1) {
					e1.printStackTrace();
				}
				Global.frameMDS3FormAdd.dispose();
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
				Global.frameMds3RecordAdd.dispose();
			}
		});
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setText("Cancel");
		cancelButton.setBounds(140, 9, 106, 26);
		add(cancelButton);

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

		btnRUG = new JxButton(0.4f);
		btnRUG.addActionListener(new ActionListener() {

			public void actionPerformed(final ActionEvent e) {

				List list = new ArrayList<Mds3ItemSet>();
				for (int page = 1; page <= itemSet.getPages().size(); page++) {
					list = itemSet.getPages().get(page + "").getSubSections();
					for (int i = 0; i < list.size(); i++) {
						itemSet.getPages();
						// Mds3SubSection sec = (Mds3SubSection)
						// list.get(currentPage);
						Mds3SubSection sec = (Mds3SubSection) list.get(i);
						sec.doSave();
					}
				}

				Mds3ClientEngine engine = new Mds3ClientEngine();
				int value = engine.CalculateMds3ADLScore();
				double totalMinutes = engine.totalMinutes();
				double adjustedMinutes = engine.adjustedMinutes();
				double medicareShortStayAssessmentminutes = engine
						.mds3MedicareShortStayAssessment();
				String rugIVClass = engine
						.rehabilizationPlusExtensiveServiceClass();

				PanelMds3RUGPage page = new PanelMds3RUGPage(value,
						totalMinutes, adjustedMinutes,
						medicareShortStayAssessmentminutes, rugIVClass);
				SwingUtils.openInDialog(page);
				// if (totalMinutes>0 || adjustedMinutes>0||value>-1)
				// {
				// PanelMds3RUGPage page = new
				// PanelMds3RUGPage(value,totalMinutes,adjustedMinutes);
				// SwingUtils.openInDialog(page);
				// }
				// else
				// {
				// Frame frame=new Frame();
				// JOptionPane.showMessageDialog(frame,
				// "Enter Values of .....",
				// "Inane error",
				// JOptionPane.ERROR_MESSAGE);
				// frame.isVisible();
				// frame.setSize(200, 200);
				// }

			}
		});
		btnRUG.setForeground(PanelMDSPage.DEFAULT_FORE);
		btnRUG.setBackground(PanelMDSPage.DEFAULT_BACK);
		btnRUG.setBorder(PanelMDSPage.DEFAULT_BORDER);
		btnRUG.setFont(new Font("", Font.BOLD, 12));
		btnRUG.setText("RUG - IV");
		btnRUG.setBounds(362, 10, 106, 26);
		add(btnRUG);

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

		fillCombos();
		showMDSFormPage(1);

		showMDSFormPage(1);
		// doFormChanged();

	}

	public void doSave() {

		// ControllerMDS3 controller = new
		// ControllerMDS3(MDSSectionType.NC_Type, 0);
		// System.out.println("I am here");
	}

	public void fillCombos() {
		cmbFormType.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "MDS 3.0 Nursing Home Comprehensive" }));
		cmbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Complete", "Incomplete" }));
	}

	public void showMDSFormPage(int pageNum) {

		PanelMds3DynamicPage panelMds3DynamicPage = new PanelMds3DynamicPage(
				itemSet, pageNum);
		JPanel formPanel = panelMds3DynamicPage;
		scrollPane.getViewport().setViewPosition(new Point(0, 0));
		scrollPane.setViewportView(formPanel);
		scrollPane.updateUI();
		// Global.controllerMds.doTriggers();
	}
}
