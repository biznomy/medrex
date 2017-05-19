package com.sX.theme;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sX.swing.JxButton;
import com.sX.swing.JxCheckBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxRadioButton;
import com.sX.swing.JxText;

/*import com.jgoodies.forms.layout.FormLayout;
 import com.jgoodies.forms.layout.ColumnSpec;
 import com.jgoodies.forms.factories.FormFactory;
 import com.jgoodies.forms.layout.RowSpec;*/

public class MyForm extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1544074691972927213L;
	private JxText textField;
	private JxText textField_1;

	public MyForm() {
		Theme theme = new BlackOverWhiteTheme();

		setSize(800, 600);
		setLayout(null);

		JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBounds(33, 107, 649, 273);
		add(panel_1);
		panel_1.setLayout(null);

		JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBounds(91, 27, 422, 83);
		panel_1.add(panel);
		panel.setLayout(null);

		JxLabel lblFirstname = new JxLabel("Firstname");
		lblFirstname.setTheme(theme);
		lblFirstname.setBounds(12, 12, 83, 16);
		panel.add(lblFirstname);

		textField = new JxText();
		textField.setTheme(theme);
		textField.setBounds(98, 9, 116, 22);
		panel.add(textField);
		textField.setColumns(10);

		JxLabel lblLastname = new JxLabel("Lastname");
		lblLastname.setTheme(theme);
		lblLastname.setBounds(12, 40, 76, 16);
		panel.add(lblLastname);

		textField_1 = new JxText();
		textField_1.setTheme(theme);
		textField_1.setBounds(98, 40, 116, 22);
		panel.add(textField_1);
		textField_1.setColumns(10);

		JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setBounds(91, 122, 422, 65);
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JxCheckBox chckbxMarried = new JxCheckBox("Married");
		chckbxMarried.setTheme(theme);
		chckbxMarried.setBounds(12, 10, 98, 20);
		panel_2.add(chckbxMarried);

		JxRadioButton rdbtnMale = new JxRadioButton("Male");
		rdbtnMale.setTheme(theme);
		rdbtnMale.setBounds(12, 36, 111, 20);
		panel_2.add(rdbtnMale);

		JxRadioButton rdbtnFemale = new JxRadioButton("Female");
		rdbtnFemale.setTheme(theme);
		rdbtnFemale.setBounds(153, 36, 111, 20);
		panel_2.add(rdbtnFemale);

		JxButton btnSave = new JxButton("Save");
		btnSave.setTheme(theme);
		btnSave.setBounds(87, 229, 77, 22);
		panel_1.add(btnSave);

		JxButton btnCance = new JxButton("Cancel");
		btnCance.setTheme(theme);
		btnCance.setBounds(233, 229, 77, 22);
		panel_1.add(btnCance);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setSize(800, 600);
		f.getContentPane().setSize(800, 600);
		f.getContentPane().add(new MyForm());
		f.setVisible(true);
	}
}
