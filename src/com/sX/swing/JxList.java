package com.sX.swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

/**
 * @Vinod kumar
 */

public class JxList extends JxPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8024884845311631319L;
	private JScrollPane scrollPane;
	public final static Color SELECTI_BG_COLOR = Color.WHITE;
	private JList list;

	public JxList() {
		super();
		setSize(400, 500);
		setPreferredSize(getSize());
		setLayout(null);
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				// doResize();
			}
		});

		list = new JList();
		list.setForeground(SystemColor.desktop);
		list.setFont(new Font("", Font.BOLD, 12));

		scrollPane = new JScrollPane();
		scrollPane.setBorder(null);
		scrollPane.setViewportView(list);
		scrollPane.setBounds(10, 10, 180, 200);
		add(scrollPane);

		setBackground(SELECTI_BG_COLOR);
	}

	public void setModel(DefaultComboBoxModel model) {
		list.setModel(model);
	}

	@Override
	public void setBackground(Color bg) {
		if (list != null) {
			list.setSelectionBackground(bg);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(600, 500);

		JxList jxList = new JxList();
		jxList.setModel(new DefaultComboBoxModel(
				new String[] { "Nikhil", "Devendra1", "Vinod", "Devendra2",
						"Mayank", "Rakesh", "Nikhil", "Devendra1", "Vinod",
						"Devendra2", "Mayank", "Rakesh" }));
		jxList.setBounds(50, 25, 200, 220);
		jxList.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(jxList);

		JxList jxList2 = new JxList();
		jxList2.setModel(new DefaultComboBoxModel(
				new String[] { "Nikhil", "Devendra1", "Vinod", "Devendra2",
						"Mayank", "Rakesh", "Nikhil", "Devendra1", "Vinod",
						"Devendra2", "Mayank", "Rakesh" }));
		jxList2.setBounds(320, 25, 200, 120);
		jxList2.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(jxList2);

		frame.setVisible(true);
	}

}
