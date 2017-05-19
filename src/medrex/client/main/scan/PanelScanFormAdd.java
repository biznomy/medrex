package medrex.client.main.scan;

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
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldValidation;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.scan.ScanForm;

import com.asprise.util.jtwain.Source;
import com.asprise.util.jtwain.SourceManager;
import com.jgoodies.validation.ValidationResult;

public class PanelScanFormAdd extends JPanel {

	private JTextField txtScannedForm;
	private static final long serialVersionUID = 1L;

	private Date creationDate;

	private JScrollPane scrollPane;

	private JPanel panelPager;
	private JButton saveButton;

	/**
	 * Create the panel
	 */
	public PanelScanFormAdd() {
		super();
		Global.panelScanFormAdd = this;
		setPreferredSize(new Dimension(1024, 700));
		setLayout(null);

		final JLabel documentNameLabel = new JLabel();
		documentNameLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		documentNameLabel.setText("Document Name:");
		documentNameLabel.setBounds(28, 16, 128, 32);
		add(documentNameLabel);

		txtScannedForm = new JTextField();
		txtScannedForm.setBounds(162, 24, 282, 21);
		add(txtScannedForm);

		saveButton = new JButton();
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (doValidate()) {
					doSave();
					Global.frameScanFormAdd.dispose();
				}
			}
		});
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.setText("Save");
		saveButton.setBounds(550, 10, 106, 26);
		add(saveButton);

		final JButton cancelButton = new JButton();
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.frameScanFormAdd.dispose();
			}
		});
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setText("Cancel");
		cancelButton.setBounds(683, 10, 106, 26);
		add(cancelButton);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 81, 975, 600);
		add(scrollPane);

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
			FieldValidation.Msgbox(vRes, "Resident Sacn Form");
			return false;
		} else {
			return true;
		}
	}

	public void display() {

		try {
			try {
				ScanForm sform = MedrexClientManager.getInstance().getScan(
						Global.currentResidenceKey, Global.tabName,
						Global.currentScanFormImageFileName);
				ImageIcon ic = sform.getImg();
				txtScannedForm.setText(sform.getScanFormType());
				scrollPane.setViewportView(new ImageDisplayer(ic.getImage()));
			} catch (Exception e) {
				e.printStackTrace();
			}
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
				source.setUIEnabled(false);
				Image image = null;
				image = source.acquireImage();
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
					.getUniqueScanFileName(txtScannedForm.getText())
					+ ".jpg";
			MedrexClientManager.getInstance().doScanSave(
					Global.currentResidenceKey, Global.tabName, scanFormName,
					icon);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
