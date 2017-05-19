package com.sX.theme;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class TrialPanel extends javax.swing.JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7719728239503156043L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public TrialPanel() {
		setLayout(null);

		textField = new JTextField();
		textField.setBounds(10, 11, 86, 20);
		add(textField);
		textField.setColumns(10);

		JButton button = new JButton("New button");
		button.setBounds(108, 10, 89, 23);
		add(button);

		textField_1 = new JTextField();
		textField_1.setBounds(207, 11, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(303, 9, 137, 22);
		add(textArea);

		JTextPane textPane = new JTextPane();
		textPane.setBounds(20, 42, 420, 20);
		add(textPane);

		textField_2 = new JTextField();
		textField_2.setBounds(10, 73, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);

		JList list = new JList();
		list.setBounds(141, 92, 1, 1);
		add(list);

		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(207, 83, 149, 70);
		add(panel);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLUE);
		panel_1.setBounds(20, 124, 117, 107);
		add(panel_1);

		JLabel lblHello = new JLabel("hello");
		lblHello.setBounds(161, 193, 180, 38);
		add(lblHello);

		JButton button_1 = new JButton("ew button");
		button_1.setBounds(48, 266, 308, 23);
		add(button_1);
	}
}
