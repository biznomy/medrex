package com.sX.swing.widgets;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import medrex.client.utils.SwingUtils;
import medrex.commons.intf.PopUpView;

import com.sX.swing.JxButton;

public class PanelClock extends PopUpView {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3758749186460924453L;
	private int value;

	@Override
	public synchronized void addFocusListener(FocusListener l) {
		System.out.println("in focus Event");
		super.addFocusListener(l);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static Color selectedColor = new Color(194, 194, 194);

	public PanelClock() {
		super();
		setSize(new Dimension(170, 200));
		setLayout(new BorderLayout());
		setBorder(new LineBorder(selectedColor, 4));
		JPanel pan = new JPanel();
		pan.setBackground(Color.WHITE);
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		flowLayout.setHgap(0);
		pan.setLayout(flowLayout);
		pan.setPreferredSize(new Dimension(30, 25));
		add(pan, BorderLayout.NORTH);

		final JLabel tunnelingClockLabel = new JLabel();
		tunnelingClockLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tunnelingClockLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		tunnelingClockLabel.setPreferredSize(new Dimension(120, 20));
		tunnelingClockLabel.setText("Tunneling Clock");
		pan.add(tunnelingClockLabel);

		final JxButton button = new JxButton();
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setArc(0.4f);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		button.setBackground(Color.WHITE);
		button.setPreferredSize(new Dimension(25, 20));
		pan.add(button);
		button.setText("X");

		JPanel panel = new JPanel(new BorderLayout());
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.CENTER);

		Clock ts;
		JLabel jl = new JLabel("-----------");
		JLabel label12;
		JLabel label3;
		JLabel label6;
		JLabel label9;
		BorderLayout bl = new BorderLayout();
		bl.setHgap(100);
		panel.add(ts = new Clock(), BorderLayout.CENTER);
		panel.add(jl, BorderLayout.NORTH);
		panel.add(label12 = new JLabel("12"), BorderLayout.NORTH);
		label12.setFont(new Font("Tahoma", Font.BOLD, 14));
		label12.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label3 = new JLabel("3"), BorderLayout.EAST);
		label3.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(label6 = new JLabel("6"), BorderLayout.SOUTH);
		label6.setFont(new Font("Tahoma", Font.BOLD, 14));
		label6.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label9 = new JLabel("9"), BorderLayout.WEST);
		label9.setFont(new Font("Tahoma", Font.BOLD, 14));

		ts.setValue((float) 1.0);
		ts.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				Clock t = (Clock) e.getSource();
				int value = t.getTunnelingValue();
				setValue(value);
			}
		});

	}

	private void showPopUp() {
		// JFrame win = new JFrame("Tunneling Clock!");
		// win.getContentPane().setLayout(new BorderLayout());
		// win.setSize(200,240);
		// win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// win.setUndecorated(true);

	}

	public static void main(String[] args) {
		SwingUtils.openInDialogUnDecorated(new PanelClock(), null);
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
}
