/**
 * 
 */
package com.sX.swing.widgets;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JClockButton extends JButton {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3530563933439896263L;
	public static Color selectedColor = new Color(194, 194, 194);
	private JPopupMenu popup;
	private Clock clock;
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public JClockButton() {
		super("0");
		addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				togglePopup();
			}
		});

		popup = new JPopupMenu();
		popup.setBackground(Color.WHITE);
		popup.setLayout(new BorderLayout());
		clock = new Clock();
		clock.requestFocus();
		clock.requestFocusInWindow();
		clock.setPreferredSize(new Dimension(180, 180));

		popup.add(clock, BorderLayout.CENTER);
		popup.setSize(new Dimension(370, 400));

		clock.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				JClockButton.this.setText(clock.getTunnelingValue() + "");
			}
		});

		popup.setBorder(new LineBorder(selectedColor, 4));
		JPanel pan = new JPanel();
		pan.setBackground(Color.WHITE);
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		flowLayout.setHgap(0);
		pan.setLayout(flowLayout);
		pan.setPreferredSize(new Dimension(30, 25));
		popup.add(pan, BorderLayout.NORTH);

		final JLabel tunnelingClockLabel = new JLabel();
		tunnelingClockLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tunnelingClockLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		tunnelingClockLabel.setPreferredSize(new Dimension(120, 20));
		tunnelingClockLabel.setText("Tunneling Clock");
		pan.add(tunnelingClockLabel);

		new JLabel("-----------");
		JLabel label12;
		JLabel label3;
		JLabel label6;
		JLabel label9;
		BorderLayout bl = new BorderLayout();
		bl.setHgap(100);

		popup.add(label12 = new JLabel("12"), BorderLayout.NORTH);
		label12.setFont(new Font("Tahoma", Font.BOLD, 14));
		label12.setHorizontalAlignment(SwingConstants.CENTER);
		popup.add(label3 = new JLabel("3"), BorderLayout.EAST);
		label3.setFont(new Font("Tahoma", Font.BOLD, 14));
		popup.add(label6 = new JLabel("6"), BorderLayout.SOUTH);
		label6.setFont(new Font("Tahoma", Font.BOLD, 14));
		label6.setHorizontalAlignment(SwingConstants.CENTER);
		popup.add(label9 = new JLabel("9"), BorderLayout.WEST);
		label9.setFont(new Font("Tahoma", Font.BOLD, 14));

		setMargin(new Insets(0, 0, 0, 0));

	}

	private void togglePopup() {
		if (popup != null) {
			if (popup.isShowing()) {
				// popup.requestFocus();
				// popup.requestFocusInWindow();
				popup.setVisible(false);
			} else {
				this.remove(popup);
				this.add(popup);
				popup.show(this, 0, this.getHeight());
				// popup.requestFocus();
				// popup.requestFocusInWindow();
				popup.transferFocus();
			}
		}
	}

	@Override
	public void setBackground(Color bg) {
		super.setBackground(bg);
		if (clock != null) {
			clock.setBackground(bg);
		}
	}

	@Override
	public void setForeground(Color fg) {
		super.setForeground(fg);
		if (clock != null) {
			clock.setForeground(fg);
		}
	}

	public static void main(String ar[]) {
		JFrame frm = new JFrame();
		frm.getContentPane().add(new JClockButton());
		frm.setSize(300, 400);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// SwingUtils.wrapInDialog(new JClockButton()).setVisible(true);
	}

}
