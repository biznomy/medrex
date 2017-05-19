package medrex.client.main.ptOtSt;

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

public class FrameAddTextArea extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1336626598385258600L;
	private JxNotes txtAreaRow8;
	private JxNotes txtAreaRow7;
	private JxNotes txtAreaRow6;
	private JxNotes txtAreaRow5;
	private JxNotes txtAreaRow3;
	private JxNotes txtAreaRow2;
	private JCheckBox cbEval97001;
	private String textString;
	private JLabel addValuesInLabel;
	private boolean cb = false;
	private Notes row2;
	private Notes row3;
	private Notes row4;
	private Notes row5;
	private Notes row6;
	private Notes row7;
	private Notes row8;
	private JxNotes txtAreaRow4;
	private boolean isSaved = false;
	// If true then categories list and label will display otherwise not.
	private boolean isCategories = true;

	public FrameAddTextArea() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setSize(506, 700);
		Global.frameAddTextArea = this;
		getContentPane().setBackground(Color.WHITE);
		setModal(true);

		addValuesInLabel = new JLabel();
		addValuesInLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		addValuesInLabel.setBounds(33, 24, 450, 29);
		add(addValuesInLabel);

		final JButton btnSave = new JButton();
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (doSave()) {
					isSaved = true;
					Global.frameAddTextArea.dispose();
				}
			}
		});
		btnSave.setText("Save");
		btnSave.setBackground(Color.WHITE);
		btnSave.setBounds(144, 632, 95, 24);
		add(btnSave);

		final JButton btnCancel = new JButton();
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.frameAddTextArea.dispose();
			}
		});
		btnCancel.setText("Cancel");
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBounds(300, 632, 95, 24);
		add(btnCancel);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(33, 24, 450, 587);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 450, 44);
		panel.add(panel_1);

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 185, 44);
		panel_1.add(panel_2);

		final JLabel eval97001Label = new JLabel();
		eval97001Label.setFont(new Font("Tahoma", Font.BOLD, 12));
		eval97001Label.setText("EVAL 97001");
		eval97001Label.setBounds(34, 0, 101, 30);
		panel_2.add(eval97001Label);

		cbEval97001 = new JCheckBox();
		cbEval97001.setBackground(Color.WHITE);
		cbEval97001.setText("");
		cbEval97001.setBounds(232, 10, 21, 22);
		panel_1.add(cbEval97001);

		final JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(0, 43, 450, 67);
		panel.add(panel_1_1);

		final JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(0, 0, 185, 67);
		panel_1_1.add(panel_2_1);

		final JLabel eval97001Label_1 = new JLabel();
		eval97001Label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		eval97001Label_1
				.setText("<html>97110<br> THERAPY<br> EXERCISES</html>");
		eval97001Label_1.setBounds(41, 7, 106, 54);
		panel_2_1.add(eval97001Label_1);

		Notes defaultNotes = new Notes();
		defaultNotes.setFormName("Occupational Daily Record");
		defaultNotes.setUserId(Global.currentLoggedInUserKey);
		defaultNotes.setNoteText("");

		txtAreaRow2 = new JxNotes(isCategories);
		txtAreaRow2.setNotes(defaultNotes);
		txtAreaRow2.setBounds(205, 10, 235, 47);
		panel_1_1.add(txtAreaRow2);

		final JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBounds(0, 109, 450, 67);
		panel.add(panel_1_1_1);

		final JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBackground(Color.WHITE);
		panel_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBounds(0, 0, 185, 67);
		panel_1_1_1.add(panel_2_1_1);

		final JLabel eval97001Label_1_1 = new JLabel();
		eval97001Label_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		eval97001Label_1_1
				.setText("<html>97112<br> NEUROMUSC.<br> RE-ED/BALANCE</html> ");
		eval97001Label_1_1.setBounds(41, 7, 106, 54);
		panel_2_1_1.add(eval97001Label_1_1);

		Notes defaultNotes3 = new Notes();
		defaultNotes3.setFormName("Occupational Daily Record");
		defaultNotes3.setUserId(Global.currentLoggedInUserKey);
		defaultNotes3.setNoteText("");

		txtAreaRow3 = new JxNotes(isCategories);
		txtAreaRow3.setNotes(defaultNotes3);
		txtAreaRow3.setBounds(202, 10, 238, 47);
		panel_1_1_1.add(txtAreaRow3);

		final JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBounds(0, 175, 450, 86);
		panel.add(panel_1_1_1_1);

		final JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBounds(0, 0, 185, 86);
		panel_1_1_1_1.add(panel_2_1_1_1);

		final JLabel eval97001Label_1_1_1 = new JLabel();
		eval97001Label_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		eval97001Label_1_1_1
				.setText("<html>97530<br>THERAPEUTIC ACTIVITIES<br>TO INCR FXNL <br>PERFORMANCE</html>");
		eval97001Label_1_1_1.setBounds(41, 7, 106, 69);
		panel_2_1_1_1.add(eval97001Label_1_1_1);

		Notes defaultNotes4 = new Notes();
		defaultNotes4.setFormName("Occupational Daily Record");
		defaultNotes4.setUserId(Global.currentLoggedInUserKey);
		defaultNotes4.setNoteText("");

		txtAreaRow4 = new JxNotes(isCategories);
		txtAreaRow4.setNotes(defaultNotes4);
		txtAreaRow4.setBounds(202, 10, 238, 66);
		panel_1_1_1_1.add(txtAreaRow4);

		final JPanel panel_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1.setBounds(0, 260, 450, 86);
		panel.add(panel_1_1_1_1_1);

		final JPanel panel_2_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1.setBounds(0, 0, 185, 86);
		panel_1_1_1_1_1.add(panel_2_1_1_1_1);

		final JLabel eval97001Label_1_1_1_1 = new JLabel();
		eval97001Label_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		eval97001Label_1_1_1_1.setText("<html>97535 <br>SELF CARE/ADL</html>");
		eval97001Label_1_1_1_1.setBounds(41, 7, 106, 69);
		panel_2_1_1_1_1.add(eval97001Label_1_1_1_1);

		Notes defaultNotes5 = new Notes();
		defaultNotes5.setFormName("Occupational Daily Record");
		defaultNotes5.setUserId(Global.currentLoggedInUserKey);
		defaultNotes5.setNoteText("");

		txtAreaRow5 = new JxNotes(isCategories);
		txtAreaRow5.setNotes(defaultNotes5);
		txtAreaRow5.setBounds(206, 10, 234, 66);
		panel_1_1_1_1_1.add(txtAreaRow5);

		final JPanel panel_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1_1.setBounds(0, 345, 450, 67);
		panel.add(panel_1_1_1_1_1_1);

		final JPanel panel_2_1_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1_1.setBounds(0, 0, 185, 67);
		panel_1_1_1_1_1_1.add(panel_2_1_1_1_1_1);

		final JLabel eval97001Label_1_1_1_1_1 = new JLabel();
		eval97001Label_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		eval97001Label_1_1_1_1_1.setText("Other");
		eval97001Label_1_1_1_1_1.setBounds(41, 7, 106, 51);
		panel_2_1_1_1_1_1.add(eval97001Label_1_1_1_1_1);

		Notes defaultNotes6 = new Notes();
		defaultNotes6.setFormName("Occupational Daily Record");
		defaultNotes6.setUserId(Global.currentLoggedInUserKey);
		defaultNotes6.setNoteText("");

		txtAreaRow6 = new JxNotes(isCategories);
		txtAreaRow6.setNotes(defaultNotes6);
		txtAreaRow6.setBounds(203, 10, 237, 47);
		panel_1_1_1_1_1_1.add(txtAreaRow6);

		final JPanel panel_1_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1_1_1.setBounds(0, 411, 450, 67);
		panel.add(panel_1_1_1_1_1_1_1);

		final JPanel panel_2_1_1_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1_1_1.setBounds(0, 0, 185, 67);
		panel_1_1_1_1_1_1_1.add(panel_2_1_1_1_1_1_1);

		final JLabel eval97001Label_1_1_1_1_1_1 = new JLabel();
		eval97001Label_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		eval97001Label_1_1_1_1_1_1.setText("Other");
		eval97001Label_1_1_1_1_1_1.setBounds(41, 7, 106, 51);
		panel_2_1_1_1_1_1_1.add(eval97001Label_1_1_1_1_1_1);

		Notes defaultNotes7 = new Notes();
		defaultNotes7.setFormName("Occupational Daily Record");
		defaultNotes7.setUserId(Global.currentLoggedInUserKey);
		defaultNotes7.setNoteText("");

		txtAreaRow7 = new JxNotes(isCategories);
		txtAreaRow7.setNotes(defaultNotes7);
		txtAreaRow7.setBounds(202, 10, 238, 47);
		panel_1_1_1_1_1_1_1.add(txtAreaRow7);

		final JPanel panel_1_1_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1_1_1_1.setBounds(0, 477, 450, 108);
		panel.add(panel_1_1_1_1_1_1_1_1);

		final JPanel panel_2_1_1_1_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1_1_1_1.setBounds(0, 0, 185, 108);
		panel_1_1_1_1_1_1_1_1.add(panel_2_1_1_1_1_1_1_1);

		final JLabel eval97001Label_1_1_1_1_1_1_1 = new JLabel();
		eval97001Label_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		eval97001Label_1_1_1_1_1_1_1
				.setText("<html>INCIDENTS/<br>EQUIPMENT/<br>DEVICES/<br>CONSULTS/NEW<br>ORDERS</html>");
		eval97001Label_1_1_1_1_1_1_1.setBounds(41, 7, 106, 91);
		panel_2_1_1_1_1_1_1_1.add(eval97001Label_1_1_1_1_1_1_1);

		Notes defaultNotes8 = new Notes();
		defaultNotes8.setFormName("Occupational Daily Record");
		defaultNotes8.setUserId(Global.currentLoggedInUserKey);
		defaultNotes8.setNoteText("");

		txtAreaRow8 = new JxNotes(isCategories);
		txtAreaRow8.setNotes(defaultNotes8);
		txtAreaRow8.setBounds(205, 10, 235, 88);
		panel_1_1_1_1_1_1_1_1.add(txtAreaRow8);

		// doLoad();

	}

	// private void doLoad() {
	// isCbSelected();
	// txtAreaRow2.getNotes();
	// txtAreaRow3.getNotes();
	// txtAreaRow4.getNotes();
	// txtAreaRow5.getNotes();
	// txtAreaRow6.getNotes();
	// txtAreaRow7.getNotes();
	// txtAreaRow8.getNotes();
	// }

	protected boolean doSave() {
		if (cbEval97001.isSelected()) {
			cb = true;
		}
		setRow2(txtAreaRow2.getNotes());
		setRow3(txtAreaRow3.getNotes());
		setRow4(txtAreaRow4.getNotes());
		setRow5(txtAreaRow5.getNotes());
		setRow6(txtAreaRow6.getNotes());
		setRow7(txtAreaRow7.getNotes());
		setRow8(txtAreaRow8.getNotes());
		return true;
	}

	public boolean isCbSelected() {
		if (cbEval97001.isSelected()) {
			return true;
		} else {
			return false;
		}
	}

	public String getTxtString() {
		return "";
	}

	public void setTxtString(String txtString) {
		textString = txtString;
		// textArea.setText(txtString);
	}

	public Notes getRow2() {
		return row2;
	}

	public void setRow2(Notes row2) {
		this.row2 = row2;
		if (this.txtAreaRow2 != null) {
			this.txtAreaRow2.setNotes(this.row2);
		}
	}

	public Notes getRow3() {
		return row3;
	}

	public void setRow3(Notes row3) {
		this.row3 = row3;
		if (this.txtAreaRow3 != null) {
			this.txtAreaRow3.setNotes(this.row3);
		}
	}

	public Notes getRow4() {
		return row4;
	}

	public void setRow4(Notes row4) {
		this.row4 = row4;
		if (this.txtAreaRow4 != null) {
			this.txtAreaRow4.setNotes(this.row4);
		}
	}

	public Notes getRow5() {
		return row5;
	}

	public void setRow5(Notes row5) {
		this.row5 = row5;
		if (this.txtAreaRow5 != null) {
			this.txtAreaRow5.setNotes(this.row5);
		}
	}

	public Notes getRow6() {
		return row6;
	}

	public void setRow6(Notes row6) {
		this.row6 = row6;
		if (this.txtAreaRow6 != null) {
			this.txtAreaRow6.setNotes(this.row6);
		}
	}

	public Notes getRow7() {
		return row7;
	}

	public void setRow7(Notes row7) {
		this.row7 = row7;
		if (this.txtAreaRow7 != null) {
			this.txtAreaRow7.setNotes(this.row7);
		}
	}

	public Notes getRow8() {
		return row8;
	}

	public void setRow8(Notes row8) {
		this.row8 = row8;
		if (this.txtAreaRow8 != null) {
			this.txtAreaRow8.setNotes(this.row8);
		}
	}

	public void setLabel(String stre) {

	}

	public void setCbChecked(boolean bool) {
		cbEval97001.setSelected(bool);
	}

	public boolean isSaved() {
		return isSaved;
	}

	public void setSaved(boolean isSaved) {
		this.isSaved = isSaved;
	}
	// public static void main(String ar[]){
	// new FrameAddTextArea().setVisible(true);
	// }
}
