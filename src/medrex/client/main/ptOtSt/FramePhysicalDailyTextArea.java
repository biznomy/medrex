package medrex.client.main.ptOtSt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import medrex.client.constants.Global;
import medrex.commons.vo.notes.Notes;

import com.sX.swing.notes.JxNotes;

public class FramePhysicalDailyTextArea extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 681643915468570351L;
	private JxNotes txtIncidents;
	private JxNotes txtOther2;
	private JxNotes txtOther1;
	private JxNotes txtTherapeutic;
	private JxNotes txtGait;
	private JxNotes txtReed;
	private JxNotes txtTherapy;
	private JCheckBox cbEval;
	private boolean cb = false;
	private Notes row2;
	private Notes row3;
	private Notes row4;
	private Notes row5;
	private Notes row6;
	private Notes row7;
	private Notes row8;
	private boolean isSaved = false;
	private String textString;
	// If true then categories list and label will display otherwise not.
	private boolean isCategories = true;

	public FramePhysicalDailyTextArea() {
		super();
		getContentPane().setBackground(Color.WHITE);
		setSize(506, 632);
		setBackground(Color.WHITE);
		setModal(true);

		Notes defaultNote = new Notes();
		defaultNote.setFormName("Physical Daily Record");
		defaultNote.setUserId(Global.currentLoggedInUserKey);
		defaultNote.setNoteText("");

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		getContentPane().add(panel, BorderLayout.CENTER);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1.setLayout(null);
		panel_1.setBounds(10, 10, 230, 65);
		panel.add(panel_1);

		final JLabel therapyLabel = new JLabel();
		therapyLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		therapyLabel.setText("EVAL 97001");
		therapyLabel.setBounds(53, 28, 167, 14);
		panel_1.add(therapyLabel);

		final JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1.setBounds(10, 75, 230, 65);
		panel.add(panel_1_1);

		final JLabel label_1 = new JLabel();
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setText("97110");
		label_1.setBounds(53, 10, 167, 14);
		panel_1_1.add(label_1);

		final JLabel therapyLabel_1 = new JLabel();
		therapyLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		therapyLabel_1.setText("THERAPY");
		therapyLabel_1.setBounds(53, 27, 167, 14);
		panel_1_1.add(therapyLabel_1);

		final JLabel excercisesLabel = new JLabel();
		excercisesLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		excercisesLabel.setText("EXCERCISES");
		excercisesLabel.setBounds(53, 45, 167, 14);
		panel_1_1.add(excercisesLabel);

		final JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(Color.WHITE);
		panel_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(10, 140, 230, 65);
		panel.add(panel_1_2);

		final JLabel label_3 = new JLabel();
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setText("97112");
		label_3.setBounds(51, 10, 169, 14);
		panel_1_2.add(label_3);

		final JLabel neuromouscLabel = new JLabel();
		neuromouscLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		neuromouscLabel.setText("NEUROMUSC");
		neuromouscLabel.setBounds(53, 24, 167, 14);
		panel_1_2.add(neuromouscLabel);

		final JLabel reedLabel = new JLabel();
		reedLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		reedLabel.setText("RE-ED BALANCE");
		reedLabel.setBounds(53, 41, 167, 14);
		panel_1_2.add(reedLabel);

		final JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBackground(Color.WHITE);
		panel_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_3.setBounds(10, 205, 230, 65);
		panel.add(panel_1_3);

		final JLabel label_2_4 = new JLabel();
		label_2_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2_4.setText("97116");
		label_2_4.setBounds(53, 10, 167, 14);
		panel_1_3.add(label_2_4);

		final JLabel gaittrainingLabel = new JLabel();
		gaittrainingLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		gaittrainingLabel.setText("GAIT TRAINING/PATTERN");
		gaittrainingLabel.setBounds(53, 27, 167, 14);
		panel_1_3.add(gaittrainingLabel);

		final JLabel postureDevLabel = new JLabel();
		postureDevLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		postureDevLabel.setText("POSTURE DEV.");
		postureDevLabel.setBounds(53, 44, 167, 14);
		panel_1_3.add(postureDevLabel);

		final JPanel panel_1_4 = new JPanel();
		panel_1_4.setLayout(null);
		panel_1_4.setBackground(Color.WHITE);
		panel_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_4.setBounds(10, 270, 230, 65);
		panel.add(panel_1_4);

		final JLabel label = new JLabel();
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setText("97530");
		label.setBounds(52, 10, 168, 14);
		panel_1_4.add(label);

		final JLabel therapeuticLabel = new JLabel();
		therapeuticLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		therapeuticLabel.setText("THERAPEUTIC ACTIVITIES TO");
		therapeuticLabel.setBounds(52, 27, 178, 14);
		panel_1_4.add(therapeuticLabel);

		final JLabel incrFxnlLabel = new JLabel();
		incrFxnlLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		incrFxnlLabel.setText("INCR FXNL PERFORMANCE");
		incrFxnlLabel.setBounds(52, 47, 168, 14);
		panel_1_4.add(incrFxnlLabel);

		final JPanel panel_1_5 = new JPanel();
		panel_1_5.setLayout(null);
		panel_1_5.setBackground(Color.WHITE);
		panel_1_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_5.setBounds(10, 335, 230, 65);
		panel.add(panel_1_5);

		final JLabel txtOther = new JLabel();
		txtOther.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtOther.setBounds(55, 22, 148, 14);
		panel_1_5.add(txtOther);
		txtOther.setText("OTHER");

		final JPanel panel_1_6 = new JPanel();
		panel_1_6.setLayout(null);
		panel_1_6.setBackground(Color.WHITE);
		panel_1_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_6.setBounds(10, 400, 230, 65);
		panel.add(panel_1_6);

		final JLabel txtOther4 = new JLabel();
		txtOther4.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtOther4.setBounds(53, 26, 167, 14);
		panel_1_6.add(txtOther4);
		txtOther4.setText("OTHER");

		final JPanel panel_1_7 = new JPanel();
		panel_1_7.setLayout(null);
		panel_1_7.setBackground(Color.WHITE);
		panel_1_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_7.setBounds(10, 465, 230, 65);
		panel.add(panel_1_7);

		final JLabel txt = new JLabel();
		txt.setFont(new Font("Tahoma", Font.BOLD, 12));
		txt.setBounds(53, 4, 167, 14);
		panel_1_7.add(txt);
		txt.setText("INCIDENTS/EQUIPMENT/");

		final JLabel devicesLabel = new JLabel();
		devicesLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		devicesLabel.setBounds(53, 25, 167, 14);
		panel_1_7.add(devicesLabel);
		devicesLabel.setText("DEVICES/CONSULTS/NEW");

		final JLabel ordersLabel = new JLabel();
		ordersLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		ordersLabel.setBounds(53, 44, 167, 14);
		panel_1_7.add(ordersLabel);
		ordersLabel.setText("ORDERS");

		final JPanel panel_1_8 = new JPanel();
		panel_1_8.setBackground(Color.WHITE);
		panel_1_8.setLayout(null);
		panel_1_8.setBounds(10, 529, 230, 65);
		panel.add(panel_1_8);

		final JButton btnSave = new JButton();
		btnSave.setBackground(Color.WHITE);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (doSave()) {
					isSaved = true;
					Global.framePhysicalDailyTextArea.dispose();
				}
			}
		});
		btnSave.setText("Save");
		btnSave.setBounds(80, 10, 106, 26);
		panel_1_8.add(btnSave);

		final JPanel panel_1_9 = new JPanel();
		panel_1_9.setBackground(Color.WHITE);
		panel_1_9.setLayout(null);
		panel_1_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_9.setBounds(239, 10, 249, 65);
		panel.add(panel_1_9);

		cbEval = new JCheckBox();
		cbEval.setBackground(Color.WHITE);
		cbEval.setText("");
		cbEval.setBounds(106, 23, 94, 18);
		panel_1_9.add(cbEval);

		final JPanel panel_1_9_1 = new JPanel();
		panel_1_9_1.setBackground(Color.WHITE);
		panel_1_9_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_9_1.setLayout(null);
		panel_1_9_1.setBounds(239, 75, 249, 65);
		panel.add(panel_1_9_1);

		txtTherapy = new JxNotes(isCategories);
		txtTherapy.setNotes(defaultNote);
		txtTherapy.setBounds(10, 10, 229, 45);
		panel_1_9_1.add(txtTherapy);

		final JPanel panel_1_9_2 = new JPanel();
		panel_1_9_2.setLayout(null);
		panel_1_9_2.setBackground(Color.WHITE);
		panel_1_9_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_9_2.setBounds(239, 140, 249, 65);
		panel.add(panel_1_9_2);

		txtReed = new JxNotes(isCategories);
		txtReed.setNotes(defaultNote);
		txtReed.setBounds(10, 10, 229, 45);
		panel_1_9_2.add(txtReed);

		final JPanel panel_1_9_3 = new JPanel();
		panel_1_9_3.setLayout(null);
		panel_1_9_3.setBackground(Color.WHITE);
		panel_1_9_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_9_3.setBounds(239, 205, 249, 65);
		panel.add(panel_1_9_3);

		txtGait = new JxNotes(isCategories);
		txtGait.setNotes(defaultNote);
		txtGait.setBounds(10, 10, 229, 45);
		panel_1_9_3.add(txtGait);

		final JPanel panel_1_9_4 = new JPanel();
		panel_1_9_4.setLayout(null);
		panel_1_9_4.setBackground(Color.WHITE);
		panel_1_9_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_9_4.setBounds(239, 270, 249, 65);
		panel.add(panel_1_9_4);

		txtTherapeutic = new JxNotes(isCategories);
		txtTherapeutic.setNotes(defaultNote);
		txtTherapeutic.setBounds(10, 10, 229, 45);
		panel_1_9_4.add(txtTherapeutic);

		final JPanel panel_1_9_5 = new JPanel();
		panel_1_9_5.setLayout(null);
		panel_1_9_5.setBackground(Color.WHITE);
		panel_1_9_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_9_5.setBounds(239, 335, 249, 65);
		panel.add(panel_1_9_5);

		txtOther1 = new JxNotes(isCategories);
		txtOther1.setNotes(defaultNote);
		txtOther1.setBounds(10, 10, 229, 45);
		panel_1_9_5.add(txtOther1);

		final JPanel panel_1_9_6 = new JPanel();
		panel_1_9_6.setLayout(null);
		panel_1_9_6.setBackground(Color.WHITE);
		panel_1_9_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_9_6.setBounds(239, 400, 249, 65);
		panel.add(panel_1_9_6);

		txtOther2 = new JxNotes(isCategories);
		txtOther2.setNotes(defaultNote);
		txtOther2.setBounds(10, 10, 229, 45);
		panel_1_9_6.add(txtOther2);

		final JPanel panel_1_9_7 = new JPanel();
		panel_1_9_7.setLayout(null);
		panel_1_9_7.setBackground(Color.WHITE);
		panel_1_9_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_9_7.setBounds(239, 465, 249, 65);
		panel.add(panel_1_9_7);

		txtIncidents = new JxNotes(isCategories);
		txtIncidents.setBounds(10, 10, 229, 45);
		panel_1_9_7.add(txtIncidents);

		final JPanel panel_1_9_8 = new JPanel();
		panel_1_9_8.setBackground(Color.WHITE);
		panel_1_9_8.setLayout(null);
		panel_1_9_8.setBounds(239, 529, 249, 65);
		panel.add(panel_1_9_8);

		final JButton btnCancel = new JButton();
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.framePhysicalDailyTextArea.dispose();
			}
		});
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setText("Cancel");
		btnCancel.setBounds(55, 10, 106, 26);
		panel_1_9_8.add(btnCancel);
		Global.framePhysicalDailyTextArea = this;
	}

	private boolean doSave() {
		if (cbEval.isSelected()) {
			cb = true;
		}
		setRow2(txtTherapy.getNotes());
		setRow3(txtReed.getNotes());
		setRow4(txtGait.getNotes());
		setRow5(txtTherapeutic.getNotes());
		setRow6(txtOther1.getNotes());
		setRow7(txtOther2.getNotes());
		setRow8(txtIncidents.getNotes());
		return true;
	}

	public boolean isCb() {
		return cb;
	}

	public void setCb(boolean cb) {
		this.cb = cb;
	}

	public Notes getRow2() {
		return row2;
	}

	public void setRow2(Notes row2) {
		this.row2 = row2;
		if (this.txtTherapy != null) {
			this.txtTherapy.setNotes(this.row2);
		}
	}

	public Notes getRow3() {
		return row3;

	}

	public void setRow3(Notes row3) {
		this.row3 = row3;
		if (this.txtReed != null) {
			this.txtReed.setNotes(this.row3);
		}
	}

	public Notes getRow4() {
		return row4;
	}

	public void setRow4(Notes row4) {
		this.row4 = row4;
		if (this.txtGait != null) {
			this.txtGait.setNotes(this.row4);
		}
	}

	public Notes getRow5() {
		return row5;
	}

	public void setRow5(Notes row5) {
		this.row5 = row5;
		if (this.txtTherapeutic != null) {
			this.txtTherapeutic.setNotes(this.row5);
		}
	}

	public Notes getRow6() {
		return row6;
	}

	public void setRow6(Notes row6) {
		this.row6 = row6;
		if (this.txtOther1 != null) {
			this.txtOther1.setNotes(this.row6);
		}
	}

	public Notes getRow7() {
		return row7;
	}

	public void setRow7(Notes row7) {
		this.row7 = row7;
		if (this.txtOther2 != null) {
			this.txtOther2.setNotes(this.row7);
		}
	}

	public Notes getRow8() {
		return row8;
	}

	public void setRow8(Notes row8) {
		this.row8 = row8;
		if (this.txtIncidents != null) {
			this.txtIncidents.setNotes(this.row7);
		}
	}

	public boolean isSaved() {
		return isSaved;
	}

	public void setSaved(boolean isSaved) {
		this.isSaved = isSaved;
	}

	public boolean isCbSelected() {
		if (cbEval.isSelected()) {
			return true;
		} else {
			return false;
		}
	}

	public String getTxtString() {
		return "";
	}

	public void setTextString(String textString) {
		this.textString = textString;
	}

	public String getTextString() {
		return textString;
	}

	public void setCbChecked(boolean bool) {
		cbEval.setSelected(bool);
	}

	public static void main(String ar[]) {
		new FramePhysicalDailyTextArea().setVisible(true);
	}
}
