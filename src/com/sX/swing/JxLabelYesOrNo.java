package com.sX.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class JxLabelYesOrNo extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4334092846892223903L;
	private JLabel lblYesOrNo;

	public JxLabelYesOrNo() {
		super();
		setBorder(new LineBorder(Color.black, 1, false));
		setLayout(null);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(125, 30));

		lblYesOrNo = new JLabel();
		lblYesOrNo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblYesOrNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblYesOrNo.setText("");
		lblYesOrNo.setBounds(2, 5, 120, 25);
		add(lblYesOrNo);

	}

	public void doSetYesOrNo(String str) {
		lblYesOrNo.setText(str);
	}

}
