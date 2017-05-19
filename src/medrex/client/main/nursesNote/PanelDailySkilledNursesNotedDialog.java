package medrex.client.main.nursesNote;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.constants.Global;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.medication.DailySkilledNursesNotesRow;

import com.sX.swing.JxButton;
import com.toedter.calendar.JDateChooser;

public class PanelDailySkilledNursesNotedDialog extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4296939169066559859L;
	private JTextField txtSignature;
	private JTextArea txtAreaComments;
	private JDateChooser dcDate;

	public PanelDailySkilledNursesNotedDialog() {
		super();
		setBorder(new LineBorder(Color.black, 1, false));
		setBackground(Color.WHITE);
		setLayout(null);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(10, 10, 509, 393);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(10, 10, 201, 320);
		panel.add(panel_1);

		final JLabel dateLabel = new JLabel();
		dateLabel.setBorder(new LineBorder(Color.black, 1, false));
		dateLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		dateLabel.setText("      Date / Time");
		dateLabel.setBounds(10, 10, 184, 25);
		panel_1.add(dateLabel);

		final JLabel commentsLabel = new JLabel();
		commentsLabel.setBorder(new LineBorder(Color.black, 1, false));
		commentsLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		commentsLabel.setText("      Comments");
		commentsLabel.setBounds(10, 51, 184, 25);
		panel_1.add(commentsLabel);

		final JLabel signatureLabel = new JLabel();
		signatureLabel.setBorder(new LineBorder(Color.black, 1, false));
		signatureLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		signatureLabel.setText("       Signature");
		signatureLabel.setBounds(10, 278, 184, 25);
		panel_1.add(signatureLabel);

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(10, 336, 486, 42);
		panel.add(panel_2);

		final JxButton saveButton = new JxButton(0.4f);
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (doValidate()) {
					doSave();
					// Global.frameInterDisciplinaryProgressNotesFormRowDialog
					Global.frameDailySkilledNursesNotesDialog.dispose();
				}
			}

		});
		saveButton.setText("Save");
		saveButton.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		saveButton.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		saveButton.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.setBounds(51, 10, 95, 24);
		panel_2.add(saveButton);

		final JxButton cancelButton = new JxButton(0.4f);
		cancelButton.setText("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				// Global.currentInterdisciplinaryProgressNotesFormRow = null;
				// Global.frameInterDisciplinaryProgressNotesFormRowDialog
				// .dispose();
				Global.currentDailySkilledNursesNotesRow = null;
				Global.frameDailySkilledNursesNotesDialog.dispose();
			}
		});
		cancelButton.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		cancelButton.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		cancelButton.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setBounds(278, 10, 95, 24);
		panel_2.add(cancelButton);

		final JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(217, 10, 281, 320);
		panel.add(panel_3);

		dcDate = new JDateChooser();
		dcDate.setBorder(new LineBorder(Color.black, 1, false));
		dcDate.setDateFormatString("yyyy/MM/dd");
		dcDate.setBounds(10, 10, 259, 25);
		panel_3.add(dcDate);

		txtAreaComments = new JTextArea();
		txtAreaComments.setBorder(new LineBorder(Color.black, 1, false));
		txtAreaComments.setBounds(10, 51, 259, 215);
		panel_3.add(txtAreaComments);

		txtSignature = new JTextField();
		txtSignature.setBorder(new LineBorder(Color.black, 1, false));
		txtSignature.setBounds(10, 278, 259, 25);
		panel_3.add(txtSignature);
		updateData();
	}

	protected boolean doValidate() {
		// still to be implemented
		return true;
	}

	protected void doSave() {
		DailySkilledNursesNotesRow row = new DailySkilledNursesNotesRow();
		row.setDateRecord(dcDate.getDate());
		row.setComments(txtAreaComments.getText());
		row.setSignature(txtSignature.getText());
		// Global.currentInterdisciplinaryProgressNotesFormRow = row;
		Global.currentDailySkilledNursesNotesRow = row;
	}

	public void updateData() {
		if (Global.currentDailySkilledNursesNotesRow != null) {
			new SimpleDateFormat("yyyy/MM/dd");
			dcDate.setDate(Global.currentDailySkilledNursesNotesRow
					.getDateRecord());
			System.out.println(Global.currentDailySkilledNursesNotesRow
					.getDateRecord());
			txtAreaComments.setText(Global.currentDailySkilledNursesNotesRow
					.getComments());
			txtSignature.setText(Global.currentDailySkilledNursesNotesRow
					.getSignature());
		}
	}

}
