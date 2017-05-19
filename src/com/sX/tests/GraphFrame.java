package com.sX.tests;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 * A simple animated graph...
 * 
 * @author talha
 */
class GraphPanel extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5215939911063695616L;
	int[] time, volt;
	int count, currentcount;
	final Timer timer;
	final Random r = new Random();

	public GraphPanel(int total) {
		volt = new int[total];
		time = new int[total];
		newRandomGraph();
		count = total;
		currentcount = 0;
		timer = new Timer(20, this);
		setBackground(Color.BLACK);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setColor(Color.YELLOW);
		for (int i = 0; i < currentcount; i++) {
			g2.drawLine(time[i], volt[i], time[i + 1], volt[i + 1]);
		}
		g2.setColor(Color.RED);
		for (int i = 0; i <= count; i += 100) {
			g2.drawLine(0, i, time.length, i);
		}
	}

	public void actionPerformed(ActionEvent e) {
		currentcount++;
		if (currentcount == count - 1)
			timer.stop();
		repaint();
	}

	public void redraw() {
		currentcount = 0;
		if (!timer.isRunning())
			timer.start();
	}

	public void newRandomGraph() {
		volt[0] = count / 2;
		for (int i = 1; i < count; i++) {
			time[i] = i;
			int y = (r.nextBoolean()) ? 1 : -1;
			volt[i] = volt[i - 1] + y * r.nextInt(10);
		}
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(count, count);
	}

}

public class GraphFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1241945632344182049L;
	GraphPanel graph;

	public GraphFrame() {
		super("Graph Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		graph = new GraphPanel(600);
		getContentPane().add(graph, BorderLayout.CENTER);

		JPanel controls = new JPanel();
		JButton redraw = new JButton("(Re)Draw Graph");
		redraw.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				graph.redraw();
			}
		});
		controls.add(redraw);
		JButton reseed = new JButton("Reseed (new Data)");
		reseed.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				graph.newRandomGraph();
				graph.redraw();
			}
		});
		controls.add(reseed);
		getContentPane().add(controls, BorderLayout.SOUTH);

		pack();
		setLocationRelativeTo(null);
	}

	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				new GraphFrame().setVisible(true);
			}
		});
	}

}
