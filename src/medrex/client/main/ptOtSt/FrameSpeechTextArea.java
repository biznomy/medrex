package medrex.client.main.ptOtSt;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import medrex.client.constants.Global;
import medrex.commons.vo.notes.Notes;

import com.sX.swing.notes.JxNotes;

public class FrameSpeechTextArea extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1918411417915810607L;
	private JComboBox cmb6;
	private JComboBox cmb5;
	private JComboBox cmb4;
	private JComboBox cmb3;
	private JComboBox cmb2;
	private JComboBox cmb1;
	private JxNotes txtIncidents;
	private JxNotes txtOthers;
	private JxNotes txtCognitiveSkills;
	private JxNotes txtSpeechLanguage;
	private JxNotes txtSpeechEval;
	private JxNotes txtSwallowTreatment;
	private JCheckBox cbSwallowEval;
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
	private int totalMin;
	private int min1;
	private int min2;
	private int min3;
	private int min4;
	private int min5;
	private int min6;
	// If true then categories list and label will display otherwise not.
	private boolean isCategories = true;

	public FrameSpeechTextArea() {
		super();
		getContentPane().setBackground(Color.WHITE);
		setSize(506, 632);
		setBackground(Color.WHITE);
		setLayout(null);
		setModal(true);
		Global.frameSpeechTextArea = this;

		final JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 506, 598);
		add(panel_1);
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);

		Notes defaultNote = new Notes();
		defaultNote.setFormName("Speech Daily Record");
		defaultNote.setUserId(Global.currentLoggedInUserKey);
		defaultNote.setNoteText("");

		final JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(3, 5, 216, 77);
		panel_1.add(panel_2);

		final JLabel swallowEvalLabel = new JLabel();
		swallowEvalLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		swallowEvalLabel.setText("Swallow Eval");
		swallowEvalLabel.setBounds(22, 10, 184, 22);
		panel_2.add(swallowEvalLabel);

		final JLabel label = new JLabel();
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setText("92110");
		label.setBounds(22, 38, 137, 14);
		panel_2.add(label);

		final JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(3, 82, 216, 77);
		panel_1.add(panel_2_1);

		final JLabel label_1 = new JLabel();
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setText("92526");
		label_1.setBounds(25, 10, 162, 14);
		panel_2_1.add(label_1);

		final JLabel swallowTreatmentLabel = new JLabel();
		swallowTreatmentLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		swallowTreatmentLabel.setText("Swallow");
		swallowTreatmentLabel.setBounds(25, 33, 117, 14);
		panel_2_1.add(swallowTreatmentLabel);

		final JLabel treatmentLabel = new JLabel();
		treatmentLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		treatmentLabel.setText("Treatment");
		treatmentLabel.setBounds(25, 53, 130, 14);
		panel_2_1.add(treatmentLabel);

		final JPanel panel_2_2 = new JPanel();
		panel_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_2.setLayout(null);
		panel_2_2.setBackground(Color.WHITE);
		panel_2_2.setBounds(3, 159, 216, 77);
		panel_1.add(panel_2_2);

		final JLabel speechEvalLabel = new JLabel();
		speechEvalLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		speechEvalLabel.setText("Speech Eval");
		speechEvalLabel.setBounds(25, 10, 143, 14);
		panel_2_2.add(speechEvalLabel);

		final JLabel label_2 = new JLabel();
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setText("92506");
		label_2.setBounds(25, 36, 131, 14);
		panel_2_2.add(label_2);

		final JPanel panel_2_3 = new JPanel();
		panel_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_3.setLayout(null);
		panel_2_3.setBackground(Color.WHITE);
		panel_2_3.setBounds(3, 236, 216, 77);
		panel_1.add(panel_2_3);

		final JLabel label_3 = new JLabel();
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setText("92507");
		label_3.setBounds(22, 10, 111, 14);
		panel_2_3.add(label_3);

		final JLabel speechLabel = new JLabel();
		speechLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		speechLabel.setText("Speech");
		speechLabel.setBounds(22, 30, 158, 14);
		panel_2_3.add(speechLabel);

		final JLabel languageTxLabel = new JLabel();
		languageTxLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		languageTxLabel.setText("Language TX");
		languageTxLabel.setBounds(22, 50, 158, 14);
		panel_2_3.add(languageTxLabel);

		final JPanel panel_2_4 = new JPanel();
		panel_2_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_4.setLayout(null);
		panel_2_4.setBackground(Color.WHITE);
		panel_2_4.setBounds(3, 313, 216, 77);
		panel_1.add(panel_2_4);

		final JLabel label_4 = new JLabel();
		label_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_4.setText("92532");
		label_4.setBounds(23, 10, 126, 14);
		panel_2_4.add(label_4);

		final JLabel developmentLabel = new JLabel();
		developmentLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		developmentLabel.setText("Development");
		developmentLabel.setBounds(22, 32, 171, 14);
		panel_2_4.add(developmentLabel);

		final JLabel cognitiveSkillsLabel = new JLabel();
		cognitiveSkillsLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		cognitiveSkillsLabel.setText("Cognitive Skills");
		cognitiveSkillsLabel.setBounds(23, 52, 170, 14);
		panel_2_4.add(cognitiveSkillsLabel);

		final JPanel panel_2_5 = new JPanel();
		panel_2_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_5.setLayout(null);
		panel_2_5.setBackground(Color.WHITE);
		panel_2_5.setBounds(3, 390, 216, 77);
		panel_1.add(panel_2_5);

		final JLabel otherLabel = new JLabel();
		otherLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		otherLabel.setText("Other");
		otherLabel.setBounds(23, 28, 168, 14);
		panel_2_5.add(otherLabel);

		final JPanel panel_2_6 = new JPanel();
		panel_2_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_6.setLayout(null);
		panel_2_6.setBackground(Color.WHITE);
		panel_2_6.setBounds(3, 467, 216, 77);
		panel_1.add(panel_2_6);

		final JLabel incidentsLabel = new JLabel();
		incidentsLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		incidentsLabel.setText("Incidents");
		incidentsLabel.setBounds(10, 0, 170, 14);
		panel_2_6.add(incidentsLabel);

		final JLabel equipmentLabel = new JLabel();
		equipmentLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		equipmentLabel.setText("Equipment");
		equipmentLabel.setBounds(10, 20, 134, 14);
		panel_2_6.add(equipmentLabel);

		final JLabel devicesLabel = new JLabel();
		devicesLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		devicesLabel.setText("Devices");
		devicesLabel.setBounds(10, 40, 151, 14);
		panel_2_6.add(devicesLabel);

		final JLabel consultsNewOrdersLabel = new JLabel();
		consultsNewOrdersLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		consultsNewOrdersLabel.setText("Consults New Orders");
		consultsNewOrdersLabel.setBounds(10, 60, 185, 14);
		panel_2_6.add(consultsNewOrdersLabel);

		final JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(3, 544, 495, 45);
		panel_1.add(panel_3);

		final JButton saveButton = new JButton();
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (doSave()) {
					setMin1(Integer.parseInt(cmb1.getSelectedItem().toString()));
					setMin2(Integer.parseInt(cmb2.getSelectedItem().toString()));
					setMin3(Integer.parseInt(cmb3.getSelectedItem().toString()));
					setMin4(Integer.parseInt(cmb4.getSelectedItem().toString()));
					setMin5(Integer.parseInt(cmb5.getSelectedItem().toString()));
					setMin6(Integer.parseInt(cmb6.getSelectedItem().toString()));
					isSaved = true;
					int total = getMin1() + getMin2() + getMin3() + getMin4()
							+ getMin5() + getMin6();
					totalMin = total;
					setTotalMin(totalMin);
					Global.frameSpeechTextArea.dispose();
				}
			}
		});
		saveButton.setBackground(Color.WHITE);
		saveButton.setText("Save");
		saveButton.setBounds(95, 10, 95, 24);
		panel_3.add(saveButton);

		final JButton cancelButton = new JButton();
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.frameSpeechTextArea.dispose();
			}
		});
		cancelButton.setBackground(Color.WHITE);
		cancelButton.setText("Cancel");
		cancelButton.setBounds(273, 10, 95, 24);
		panel_3.add(cancelButton);

		final JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(216, 5, 278, 77);
		panel_1.add(panel_4);

		cbSwallowEval = new JCheckBox();
		cbSwallowEval.setBackground(Color.WHITE);
		cbSwallowEval.setText("");
		cbSwallowEval.setBounds(99, 24, 47, 24);
		panel_4.add(cbSwallowEval);

		final JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1.setBackground(Color.WHITE);
		panel_4_1.setBounds(216, 82, 278, 77);
		panel_1.add(panel_4_1);

		txtSwallowTreatment = new JxNotes(isCategories);
		txtSwallowTreatment.setBorder(new LineBorder(Color.black, 1, false));
		txtSwallowTreatment.setNotes(defaultNote);
		txtSwallowTreatment.setBounds(10, 10, 200, 57);
		panel_4_1.add(txtSwallowTreatment);

		cmb1 = new JComboBox();
		cmb1.setModel(new DefaultComboBoxModel(new String[] { "0", "15", "30",
				"45", "60", "75", "90" }));
		cmb1.setBackground(Color.WHITE);
		cmb1.setOpaque(false);
		cmb1.setBounds(215, 10, 53, 23);
		panel_4_1.add(cmb1);

		final JLabel totalMinLabel = new JLabel();
		totalMinLabel.setText("Total Min");
		totalMinLabel.setBounds(215, 45, 54, 14);
		panel_4_1.add(totalMinLabel);

		final JPanel panel_4_2 = new JPanel();
		panel_4_2.setLayout(null);
		panel_4_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_2.setBackground(Color.WHITE);
		panel_4_2.setBounds(216, 159, 278, 77);
		panel_1.add(panel_4_2);

		cmb2 = new JComboBox();
		cmb2.setModel(new DefaultComboBoxModel(new String[] { "0", "15", "30",
				"45", "60", "75", "90" }));
		cmb2.setBackground(Color.WHITE);
		cmb2.setBounds(215, 10, 53, 23);
		panel_4_2.add(cmb2);

		final JLabel totalMinuLabel = new JLabel();
		totalMinuLabel.setText("Total Min");
		totalMinuLabel.setBounds(215, 45, 54, 14);
		panel_4_2.add(totalMinuLabel);

		txtSpeechEval = new JxNotes(isCategories);
		txtSpeechEval.setNotes(defaultNote);
		txtSpeechEval.setBounds(10, 10, 200, 57);
		panel_4_2.add(txtSpeechEval);

		final JPanel panel_4_3 = new JPanel();
		panel_4_3.setLayout(null);
		panel_4_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_3.setBackground(Color.WHITE);
		panel_4_3.setBounds(216, 236, 278, 77);
		panel_1.add(panel_4_3);

		cmb3 = new JComboBox();
		cmb3.setModel(new DefaultComboBoxModel(new String[] { "0", "15", "30",
				"45", "60", "75", "90" }));
		cmb3.setBackground(Color.WHITE);
		cmb3.setBounds(215, 10, 53, 23);
		panel_4_3.add(cmb3);

		final JLabel totalMinLabel_1 = new JLabel();
		totalMinLabel_1.setText("Total Min");
		totalMinLabel_1.setBounds(215, 45, 54, 14);
		panel_4_3.add(totalMinLabel_1);

		txtSpeechLanguage = new JxNotes(isCategories);
		txtSpeechLanguage.setNotes(defaultNote);
		txtSpeechLanguage.setBounds(10, 10, 200, 57);
		panel_4_3.add(txtSpeechLanguage);

		final JPanel panel_4_4 = new JPanel();
		panel_4_4.setLayout(null);
		panel_4_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_4.setBackground(Color.WHITE);
		panel_4_4.setBounds(216, 313, 278, 77);
		panel_1.add(panel_4_4);

		cmb4 = new JComboBox();
		cmb4.setModel(new DefaultComboBoxModel(new String[] { "0", "15", "30",
				"45", "60", "75", "90" }));
		cmb4.setBackground(Color.WHITE);
		cmb4.setBounds(215, 10, 53, 23);
		panel_4_4.add(cmb4);

		final JLabel totalMinLabel_2 = new JLabel();
		totalMinLabel_2.setText("Total Min");
		totalMinLabel_2.setBounds(214, 45, 54, 14);
		panel_4_4.add(totalMinLabel_2);

		txtCognitiveSkills = new JxNotes(isCategories);
		txtCognitiveSkills.setNotes(defaultNote);
		txtCognitiveSkills.setBounds(10, 10, 200, 57);
		panel_4_4.add(txtCognitiveSkills);

		final JPanel panel_4_5 = new JPanel();
		panel_4_5.setLayout(null);
		panel_4_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_5.setBackground(Color.WHITE);
		panel_4_5.setBounds(216, 390, 278, 77);
		panel_1.add(panel_4_5);

		cmb5 = new JComboBox();
		cmb5.setModel(new DefaultComboBoxModel(new String[] { "0", "15", "30",
				"45", "60", "75", "90" }));
		cmb5.setBackground(Color.WHITE);
		cmb5.setBounds(215, 10, 53, 23);
		panel_4_5.add(cmb5);

		final JLabel totalMinLabel_3 = new JLabel();
		totalMinLabel_3.setText("Total Min");
		totalMinLabel_3.setBounds(214, 45, 54, 14);
		panel_4_5.add(totalMinLabel_3);

		txtOthers = new JxNotes(isCategories);
		txtOthers.setNotes(defaultNote);
		txtOthers.setBounds(10, 10, 200, 57);
		panel_4_5.add(txtOthers);

		final JPanel panel_4_6 = new JPanel();
		panel_4_6.setLayout(null);
		panel_4_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_6.setBackground(Color.WHITE);
		panel_4_6.setBounds(216, 467, 278, 77);
		panel_1.add(panel_4_6);

		cmb6 = new JComboBox();
		cmb6.setModel(new DefaultComboBoxModel(new String[] { "0", "15", "30",
				"45", "60", "75", "90" }));
		cmb6.setBackground(Color.WHITE);
		cmb6.setBounds(215, 10, 53, 23);
		panel_4_6.add(cmb6);

		final JLabel totalMinLabel_4 = new JLabel();
		totalMinLabel_4.setText("Total Min");
		totalMinLabel_4.setBounds(215, 45, 54, 14);
		panel_4_6.add(totalMinLabel_4);

		txtIncidents = new JxNotes(isCategories);
		txtIncidents.setNotes(defaultNote);
		txtIncidents.setBounds(10, 10, 200, 57);
		panel_4_6.add(txtIncidents);
		// setVisible(true);
	}

	private boolean doSave() {
		if (cbSwallowEval.isSelected()) {
			cb = true;
		}
		setRow2(txtSwallowTreatment.getNotes());
		setRow3(txtSpeechEval.getNotes());
		setRow4(txtSpeechLanguage.getNotes());
		setRow5(txtCognitiveSkills.getNotes());
		setRow6(txtOthers.getNotes());
		setRow7(txtIncidents.getNotes());
		// setTotalMin(totalMin);
		return true;
	}

	// public static void main(String args[]){
	// // JFrame frm=new JFrame("Speech Text Area");
	// // frm.getContentPane().add(new FrameSpeechTextArea());
	// // frm.setVisible(true);
	// // frm.setSize(506, 650);
	// new FrameSpeechTextArea().setVisible(true);
	// }
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
		if (this.txtSwallowTreatment != null) {
			this.txtSwallowTreatment.setNotes(this.row2);
		}
	}

	public Notes getRow3() {
		return row3;

	}

	public void setRow3(Notes row3) {
		this.row3 = row3;
		if (this.txtSpeechEval != null) {
			this.txtSpeechEval.setNotes(this.row3);
		}
	}

	public Notes getRow4() {
		return row4;
	}

	public void setRow4(Notes row4) {
		this.row4 = row4;
		if (this.txtSpeechLanguage != null) {
			this.txtSpeechLanguage.setNotes(this.row4);
		}
	}

	public Notes getRow5() {
		return row5;
	}

	public void setRow5(Notes row5) {
		this.row5 = row5;
		if (this.txtCognitiveSkills != null) {
			this.txtCognitiveSkills.setNotes(this.row5);
		}
	}

	public Notes getRow6() {
		return row6;
	}

	public void setRow6(Notes row6) {
		this.row6 = row6;
		if (this.txtOthers != null) {
			this.txtOthers.setNotes(this.row6);
		}
	}

	public Notes getRow7() {
		return row7;
	}

	public void setRow7(Notes row7) {
		this.row7 = row7;
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
		if (cbSwallowEval.isSelected()) {
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
		cbSwallowEval.setSelected(bool);
	}

	public int getTotalMin() {
		return totalMin;
	}

	public void setTotalMin(int totalMin) {
		this.totalMin = totalMin;
	}

	public int getMin1() {
		return min1;
	}

	public void setMin1(int min1) {
		this.min1 = min1;
		this.cmb1.setSelectedItem(this.min1 + "");
	}

	public int getMin2() {
		return min2;
	}

	public void setMin2(int min2) {
		this.min2 = min2;
		this.cmb2.setSelectedItem(this.min2 + "");
	}

	public int getMin3() {
		return min3;
	}

	public void setMin3(int min3) {
		this.min3 = min3;
		this.cmb3.setSelectedItem(this.min3 + "");
	}

	public int getMin4() {
		return min4;
	}

	public void setMin4(int min4) {
		this.min4 = min4;
		this.cmb4.setSelectedItem(this.min4 + "");
	}

	public int getMin5() {
		return min5;
	}

	public void setMin5(int min5) {
		this.min5 = min5;
		this.cmb5.setSelectedItem(this.min5 + "");
	}

	public int getMin6() {
		return min6;
	}

	public void setMin6(int min6) {
		this.min6 = min6;
		this.cmb6.setSelectedItem(this.min6 + "");
	}

}
