package medrex.client.test;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;

public class AnimDemo extends JApplet implements Runnable, ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -994028572698012862L;

	boolean runFlag, trails = true;

	Thread runner = null;

	JButton startButton = new JButton("Start"),
			stopButton = new JButton("Stop"), trailsButton = new JButton(
					"Toggle Trails"), clearButton = new JButton("Clear");

	Container cp;

	// *****************************************************************
	@Override
	public void init() {
		cp = getContentPane();
		cp.setLayout(new FlowLayout());

		cp.add(startButton);
		cp.add(stopButton);
		cp.add(trailsButton);
		cp.add(clearButton);

		startButton.addActionListener(this);
		stopButton.addActionListener(this);
		trailsButton.addActionListener(this);
		clearButton.addActionListener(this);
	}

	// *****************************************************************
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == startButton) {
			if (runner == null) {
				runFlag = true;
				runner = new Thread(this);
				runner.start();
			}
		} else if (e.getSource() == stopButton) {
			runFlag = false;
			runner = null;
		} else if (e.getSource() == clearButton) {
			Graphics g = cp.getGraphics();
			Dimension d = getSize();

			g.fillRect(0, 0, d.width, d.height);
			repaint(); // redraws JButtons
		} else
			// toggle trails on/off
			trails = !trails;
	}

	// *****************************************************************
	public void run() {
		Graphics g;
		Dimension d;
		int c = 0; // "sleep" counter
		int x, y, // ball's x, y position
		dx = 4, dy = 4; // increment of motion in x and y

		g = cp.getGraphics();
		d = getSize();
		x = 150;
		y = 100;

		while (runFlag) {
			// draw the ball
			g.drawRect(x, y, 4, 4);

			c++;
			try {
				if (c % 4 == 0)
					runner.sleep(20);
			} catch (InterruptedException e) {
				// do nothing
			}

			if (!trails) {
				// erase the "ball" to bk color
				g.setColor(cp.getBackground());
				g.drawRect(x, y, 4, 4);
				g.setColor(Color.BLACK);
			}

			// change direction in x and/or y if at edge
			if (x > d.width || x < 0)
				dx = -dx;
			if (y > d.height || y < 0)
				dy = -dy;

			// change x and y position
			x += dx;
			y += dy;

			trailsButton.repaint(); // so Button stays "on top"
			// do this for all buttons if they are to remain "on top"
		} // end while
	} // end run()
}