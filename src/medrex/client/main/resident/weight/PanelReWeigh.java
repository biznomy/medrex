package medrex.client.main.resident.weight;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;
import medrex.commons.enums.GuiModes;
import medrex.commons.intf.PopUpView;

import com.sX.swing.JxButton;

public class PanelReWeigh extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8344271329826626480L;
	private JxButton btnReweigh;
	private JxButton btnSaveAndReWeigh;
	private SaveMode saveMode;
	private JxButton btnSave;

	public PanelReWeigh() {
		super();
		setBorder(new LineBorder(ColorConstants.DEF_COLOR, 4, false));
		setBackground(Color.WHITE);
		setSize(new Dimension(343, 205));
		setLayout(null);

		final JLabel pleaseReweighTheLabel = new JLabel();
		pleaseReweighTheLabel.setForeground(ColorConstants.DEF_COLOR);
		pleaseReweighTheLabel.setFont(new Font("", Font.BOLD, 16));
		pleaseReweighTheLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pleaseReweighTheLabel.setText("Please Reweigh The Resident !!!");
		pleaseReweighTheLabel.setBounds(23, 33, 294, 34);
		add(pleaseReweighTheLabel);

		btnSaveAndReWeigh = new JxButton();
		btnSaveAndReWeigh.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				setSaveMode(SaveMode.SAVE_AND_REWEIGH);
				close();
			}
		});
		btnSaveAndReWeigh.setForeground(ColorConstants.DEF_COLOR);
		btnSaveAndReWeigh.setBackground(Color.WHITE);
		btnSaveAndReWeigh.setArc(0.4f);
		btnSaveAndReWeigh.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnSaveAndReWeigh.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnSaveAndReWeigh.setFont(new Font("", Font.BOLD, 12));
		btnSaveAndReWeigh.setText("Save And Reweigh");
		btnSaveAndReWeigh.setBounds(23, 93, 137, 26);

		add(btnSaveAndReWeigh);

		btnReweigh = new JxButton();
		btnReweigh.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				setSaveMode(SaveMode.REWEIGH);
				close();
			}
		});
		btnReweigh.setBackground(Color.WHITE);
		btnReweigh.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnReweigh.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnReweigh.setFont(new Font("", Font.BOLD, 12));
		btnReweigh.setForeground(ColorConstants.DEF_COLOR);
		btnReweigh.setArc(0.4f);
		btnReweigh.setText("Reweigh");
		btnReweigh.setBounds(193, 93, 124, 26);
		add(btnReweigh);

		btnSave = new JxButton();
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				setSaveMode(SaveMode.SAVE);
				close();
			}
		});
		btnSave.setBackground(Color.WHITE);
		btnSave.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnSave.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnSave.setFont(new Font("", Font.BOLD, 12));
		btnSave.setForeground(ColorConstants.DEF_COLOR);
		btnSave.setArc(0.4f);
		btnSave.setText("Save");
		btnSave.setBounds(23, 144, 137, 26);
		add(btnSave);

		final JxButton cancelButton = new JxButton();
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		cancelButton.setForeground(ColorConstants.DEF_COLOR);
		cancelButton.setArc(0.4f);
		cancelButton.setBackground(Color.WHITE);
		cancelButton.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		cancelButton.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setText("Cancel");
		cancelButton.setBounds(193, 144, 124, 26);
		add(cancelButton);

	}

	@Override
	public String getTitle() {

		return "Re-Weigh Resident";
	}

	public SaveMode getSaveMode() {
		return saveMode;
	}

	public void setSaveMode(SaveMode saveMode) {
		this.saveMode = saveMode;
	}

	public static void main(String arg[]) {
		SwingUtils.openInDialogUnDecorated(new PanelReWeigh(), null);
	}

	public enum SaveMode {
		SAVE, REWEIGH, SAVE_AND_REWEIGH
	}
}
