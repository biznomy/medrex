/**
 * 
 */
package com.sX.swing;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;

import com.sX.utils.SwingUtils;

/**
 * @author D S Naruka
 * 
 */
public class ProgressBar extends JDialog {

	/**
	 * Generated serial VersionUID
	 */
	private static final long serialVersionUID = -4893834827280676346L;

	public static abstract class Task<T> extends SwingWorker<T, Void> {

		private ProgressBar bar;
		private T completionResult;

		private void setBar(ProgressBar bar) {
			this.bar = bar;
		}

		@Override
		protected void done() {
			super.done();
			try {
				completionResult = get();
			} catch (Exception e) {
				e.printStackTrace();
			}
			bar.fireProgressCompletion(completionResult);
		}
	}

	private static class BlankAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
		}
	}

	private Task<?> task;
	private ActionListener actionOnCompletion;

	public ProgressBar(final Task<?> task) {
		this(task, new BlankAction());
	}

	public ProgressBar(final Task<?> task,
			final ActionListener actionOnCompletion) {
		JProgressBar pBar = new JProgressBar();
		pBar.setIndeterminate(true);
		getContentPane().add(pBar);

		setSize(300, 30);
		setUndecorated(true);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle screenViewPort = new Rectangle(new Point(0, 0), screen);
		Rectangle bounds = SwingUtils.centerRectangle(screenViewPort, this
				.getBounds());
		setBounds(bounds);

		this.actionOnCompletion = actionOnCompletion;
		setTask(task);
	}

	public final void setTask(Task<?> task) {
		if (task == null) {
			throw new IllegalArgumentException(" argument bar can't be null ");
		}

		this.task = task;
		this.task.setBar(this);
	}

	private void fireProgressCompletion(Object completionResult) {
		setVisible(false);
		ActionEvent event = new ActionEvent(completionResult,
				ActionEvent.ACTION_PERFORMED, "performed");
		actionOnCompletion.actionPerformed(event);
	}

	public void execute() {
		setVisible(true);
		task.execute();
	}

	public static void main(String[] args) {
		ProgressBar bar = new ProgressBar(new Task<Object>() {
			@Override
			protected Object doInBackground() throws Exception {
				for (int i = 0; i < 10; i++) {
					System.out.println("in process " + i);
					try {
						Thread.sleep(500L);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				return Integer.valueOf(0);
			}
		});
		bar.execute();
	}
}
