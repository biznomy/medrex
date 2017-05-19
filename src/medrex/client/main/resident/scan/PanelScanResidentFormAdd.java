package medrex.client.main.resident.scan;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.InputStream;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.scan.ImageDisplayer;
import medrex.client.utils.FieldValidation;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.scan.ScanForm;

import com.asprise.util.jtwain.Source;
import com.asprise.util.jtwain.SourceManager;
import com.jgoodies.validation.ValidationResult;
import com.sX.swing.JxButton;

public class PanelScanResidentFormAdd extends JPanel {

	private JFormattedTextField txtScannedForm;
	private JLabel typesOfScannedLabel;

	private static final long serialVersionUID = 1L;

	private Date creationDate;

	private JScrollPane scrollPane;

	private JPanel panelPager;

	private Color DEF_BACK_COL = new Color(24, 86, 110);
	private Color DEF_BUT_BACK = new Color(130, 163, 175);
	private Color DEF_BUT_FORE = new Color(8, 68, 95);
	private JxButton saveButton;

	/**
	 * Create the panel
	 */
	public PanelScanResidentFormAdd() {
		super();
		Global.panelScanResidentFormAdd = this;
		setPreferredSize(new Dimension(1024, 700));
		setBackground(DEF_BACK_COL);
		setLayout(null);

		txtScannedForm = new JFormattedTextField();
		txtScannedForm.setBackground(Color.WHITE);
		txtScannedForm.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		txtScannedForm.setBounds(161, 15, 287, 18);
		add(txtScannedForm);

		saveButton = new JxButton();
		saveButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		saveButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (doValidate()) {
					Global.currentScanFormname = txtScannedForm.getText();
					doSave();
					Global.frameScanResidentFormAdd.dispose();
					Global.frameScanResidentFormAdd = null;
				}
			}
		});
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.setText("Save");
		saveButton.setVisible(false);
		saveButton.setBounds(28, 39, 106, 26);
		add(saveButton);

		final JxButton cancelButton = new JxButton();
		cancelButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		cancelButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.frameScanResidentFormAdd.dispose();
				Global.frameScanResidentFormAdd = null;
			}
		});
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setText("Cancel");
		cancelButton.setBounds(161, 39, 106, 26);
		add(cancelButton);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 81, 975, 600);
		add(scrollPane);

		typesOfScannedLabel = new JLabel();
		typesOfScannedLabel.setText("Document Name");
		typesOfScannedLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		typesOfScannedLabel.setForeground(Color.WHITE);
		typesOfScannedLabel.setBounds(28, 16, 127, 16);
		add(typesOfScannedLabel);

		if (Global.currentScanFormImageFileName == null) {
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					scan();
				}
			});
		} else {
			txtScannedForm.setEditable(false);
			txtScannedForm.setBackground(Color.WHITE);
			txtScannedForm.setForeground(GuiModes.DESIGNER_SCREEN
					.getControlForegroundColor());
			// cmbFormType.setVisible(false);
			// typesOfScannedLabel.setVisible(false);
			saveButton.setVisible(false);
			display();
		}
	}

	public boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;

		if (!FieldValidation.isEmpty(temp = FieldValidation
				.isNonEmptyAlphaField(txtScannedForm, "Document Name", 0, 255))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(vRes)) {
			FieldValidation.Msgbox(vRes, "Resident");
			return false;
		} else {
			// JOptionPane.showMessageDialog(this, "Saved successfully");
			return true;
		}
	}

	public void display() {
		System.out.println("Global.currentScanFormname:"
				+ Global.currentScanFormImageFileName);
		try {
			ScanForm sform = MedrexClientManager.getInstance().getScan(
					Global.currentResidenceKey,
					Global.currentResidentTabs.RESIDENT_INFORMATION.Name,
					Global.currentScanFormImageFileName);
			ImageIcon ic = sform.getImg();
			txtScannedForm.setText(sform.getScanFormType());
			scrollPane.setViewportView(new ImageDisplayer(ic.getImage()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void scan() {
		try {
			File currentDir = new File("");
			SourceManager.setLibraryPath(currentDir.getAbsolutePath()
					+ "\\dll\\AspriseJTwain.dll");

			Source[] sources = SourceManager.instance().getAllSources();
			Source source = null;
			if (sources != null && sources.length > 0) {
				/*
				 * TODO: Display UI to select a source of scanning from the
				 * sources array
				 */
				source = SourceManager.instance().getDefaultSource();
			} else {
				JOptionPane.showMessageDialog(this,
						"There is no source on the system!");
				return;
			}

			if (source == null) {
				JOptionPane.showMessageDialog(this,
						"There is no source on the system!");
				return;
			} else {

				source.open();
				// source.setXResolution(100);

				source.setUIEnabled(false);
				Image image = null;
				/*
				 * while(image == null) { try {
				 */image = source.acquireImage();
				/*
				 * } catch (Exception e) { e.printStackTrace(); } }
				 */

				scrollPane.setViewportView(new ImageDisplayer(image));
				source.close();
				saveButton.setVisible(true);
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
			InputStream inst = source.outputLastAcquiredImageAsJPEG();
			Image image = ImageIO.read(inst);
			ImageIcon icon = new ImageIcon(image);
			String scanFormName = medrex.commons.enums.ResidentTabs
					.getUniqueScanFileName(Global.currentScanFormname)
					+ ".jpg";

			MedrexClientManager.getInstance().doScanSave(
					Global.currentResidenceKey,
					Global.currentResidentTabs.RESIDENT_INFORMATION.Name,
					scanFormName, icon);

			/*
			 * java.io.File currentDir = new java.io.File(""); new
			 * File(currentDir.getAbsolutePath() + "\\scans\\" +
			 * Global.currentResidenceKey + "\\" +
			 * Global.currentResidentTabs.RESIDENT_INFORMATION.Name +
			 * "\\").mkdirs(); source.saveLastAcquiredImageIntoFile(new
			 * File(currentDir .getAbsolutePath() + "\\scans\\" +
			 * Global.currentResidenceKey + "\\" +
			 * Global.currentResidentTabs.Name + "\\" +
			 * medrex.commons.enums.ResidentTabs
			 * .getUniqueScanFileName(Global.currentScanFormname) + ".jpg"));
			 */

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
