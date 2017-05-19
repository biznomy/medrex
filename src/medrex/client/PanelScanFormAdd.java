package medrex.client;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import medrex.client.constants.Global;
import medrex.client.main.scan.ImageDisplayer;
import medrex.commons.enums.GuiModes;

import com.asprise.util.jtwain.Source;
import com.asprise.util.jtwain.SourceManager;
import com.sX.swing.JxButton;

public class PanelScanFormAdd extends JPanel {

	private static final long serialVersionUID = 1L;

	private Date creationDate;

	private JScrollPane scrollPane;

	private JPanel panelPager;

	private Color DEF_BACK_COL = new Color(24, 86, 110);
	private Color DEF_BUT_BACK = new Color(130, 163, 175);
	private Color DEF_BUT_FORE = new Color(8, 68, 95);

	/**
	 * Create the panel
	 */
	public PanelScanFormAdd() {
		super();
		// Global.panelScanFormAdd = this;
		setPreferredSize(new Dimension(1024, 920));
		setBackground(DEF_BACK_COL);
		setLayout(null);

		final JxButton saveButton = new JxButton();
		saveButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		saveButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSave();
				/*
				 * 
				 * if(Global.currentResidentTabs ==
				 * medrex.enums.ResidentTabs.AdmissionRecords){
				 * Global.panelAdmissionsRecord.updateAdmissionsRecordJTable();
				 * //Global.panelAdmissionsRecord.frameScanFormAdd.dispose(); }
				 * 
				 * 
				 * else if(Global.currentResidentTabs ==
				 * medrex.enums.ResidentTabs.Activities){
				 * Global.panelActivitysRecord.updateActivitysRecordJTable();
				 * //Global.panelActivitysRecord.frameScanFormAdd.dispose(); }
				 * else if(Global.currentResidentTabs ==
				 * medrex.enums.ResidentTabs.Dietary){
				 * Global.panelDietary.updateDietaryJTable();
				 * //Global.panelDietary.frameScanFormAdd.dispose(); } else
				 * if(Global.currentResidentTabs ==
				 * medrex.enums.ResidentTabs.MedicationTreatment){
				 * Global.panelMedicationTreatmentForm
				 * .updateMedicationTreatmentFormJTable();
				 * //Global.panelMedicationTreatmentForm
				 * .frameScanFormAdd.dispose(); } else
				 * if(Global.currentResidentTabs ==
				 * medrex.enums.ResidentTabs.Consultant){
				 * Global.panelConsultant.updateConsultantJTable();
				 * //Global.panelConsultant.frameScanFormAdd.dispose(); } else
				 * if(Global.currentResidentTabs ==
				 * medrex.enums.ResidentTabs.ProgressNotes){
				 * Global.panelProgressNotes.updateProgressNotesJTable();
				 * //Global.panelConsultant.frameScanFormAdd.dispose(); }
				 * 
				 * 
				 * 
				 * 
				 * else if(Global.currentResidentTabs ==
				 * medrex.enums.ResidentTabs.LabSpecialReports){
				 * Global.panelLabSpecial.updateLabSpecialJTable();
				 * //Global.panelLabSpecial.frameScanFormAdd.dispose(); } else
				 * if(Global.currentResidentTabs ==
				 * medrex.enums.ResidentTabs.HistoryPhysical){
				 * Global.panelHistoryAndPhysical
				 * .updateHistoryAndPhysicalJTable();
				 * //Global.panelHistoryAndPhysical.frameScanFormAdd.dispose();
				 * } else if(Global.currentResidentTabs ==
				 * medrex.enums.ResidentTabs.PhysicianOrders){
				 * Global.panelPhysicianOrders.updatePhysicianOrdersJTable();
				 * //Global.panelPhysicianOrders.frameScanFormAdd.dispose(); }
				 * 
				 * else if(Global.currentResidentTabs ==
				 * medrex.enums.ResidentTabs.OtPtActSpeech){
				 * Global.panelPtOtSt.updatePtOtStJTable();
				 * //Global.panelPtOtSt.frameScanFormAdd.dispose(); }
				 */
				Global.frameScanFormAdd.dispose();

			}
		});
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.setText("Save");
		saveButton.setBounds(28, 10, 106, 26);
		add(saveButton);

		final JxButton cancelButton = new JxButton();
		cancelButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		cancelButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				// Global.panelActivitysRecord.frameScanFormAdd.dispose();
				Global.frameScanFormAdd.dispose();
			}
		});
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setText("Cancel");
		cancelButton.setBounds(161, 10, 106, 26);
		add(cancelButton);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 81, 975, 780);
		add(scrollPane);

		if (!Global.currentScanFormMode) {
			scan();
		} else {
			saveButton.setVisible(false);
			display();

		}

	}

	public void display() {

		try {
			new java.io.File("");

			Image image = ImageIO.read(new File(Global.currentScanFormname));
			// Image image = ImageIO.read(new File(currentDir.getAbsolutePath()
			// +
			// "\\scans\\"+Global.currentResidenceKey+"\\"+Global.currentResidentTabs+"\\"
			// + Global.currentScanFormname));

			scrollPane.setViewportView(new ImageDisplayer(image));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void scan() {
		try {

			// Source source = SourceManager.instance().getDefaultSource();
			Source source = SourceManager.instance().selectSourceUI();

			if (source == null) {
				JOptionPane.showMessageDialog(this,
						"There is no source on the system!");
				return;
			} else {

				source.open();
				source.setUIEnabled(false);

				Image image = source.acquireImage();

				scrollPane.setViewportView(new ImageDisplayer(image));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SourceManager.closeSourceManager();
		}
	}

	public void doSave() {

		try {
			Source source = SourceManager.instance().getDefaultSource();

			java.io.File currentDir = new java.io.File("");

			File mkFile = new File(currentDir.getAbsolutePath() + "\\scans\\"

			+ Global.currentResidenceKey + "\\"
					+ Global.currentResidentTabs.Name + "\\");
			mkFile.mkdirs();

			source.saveLastAcquiredImageIntoFile(new File(currentDir
					.getAbsolutePath()
					+ "\\scans\\"
					+ Global.currentResidenceKey
					+ "\\"
					+ Global.currentResidentTabs.Name
					+ "\\"
					+ medrex.commons.enums.ResidentTabs
							.getUniqueScanFileName(Global.currentScanFormname)
					+ ".jpg"));
		} catch (Exception ex) {
			ex.printStackTrace();

		}
	}

}
