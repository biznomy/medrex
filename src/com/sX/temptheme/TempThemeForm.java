package com.sX.temptheme;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class TempThemeForm extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7868552007133115088L;
	TempTheme tempTheme = new TempBlackWhiteTheme();
	final TempThemeUtil tempThemeUtil = new TempThemeUtil(tempTheme);

	public TempThemeForm() {

		setSize(800, 600);
		setLayout(null);

		final JTextField textField = new JTextField();
		tempThemeUtil.setTheme(textField, tempTheme);
		textField.setBounds(11, 11, 100, 20);
		textField
				.setText("TextField ,,,,,,,, jlkj lksld flkj lj l asldf lkj lk lkj lsjlkklsjd fjs ldkj,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		add(textField);

		final JButton btn = new JButton();
		tempThemeUtil.setTheme(btn, tempTheme);
		btn.setText("Hello");
		btn.setBounds(11, 40, 100, 20);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tempThemeUtil.setText(textField,
						"hello hello hello hello hello hello hello hello");
			}
		});
		add(btn);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			UIManager
					.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
			JFrame f = new JFrame();
			f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			f.setSize(800, 600);
			f.getContentPane().setSize(800, 600);
			f.getContentPane().add(new TempThemeForm());
			f.setVisible(true);
		} catch (Exception e) {

		}
	}

}
