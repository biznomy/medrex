package medrex.client.accurities;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.JPanel;

import medrex.client.constants.Global;

public class FrameAccuritiesListAdd extends JDialog {

	private static final long serialVersionUID = 1L;
	private static int currentAccuritiesListKey = Global.currentAccuritiesListKey;
	private static String floor;
	private static String date;
	private static String type;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FrameAccuritiesListAdd dialog = new FrameAccuritiesListAdd(
					currentAccuritiesListKey, floor, date, type);

			dialog.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Create the dialog
	 * 
	 * @param string
	 */
	// public FrameAccuritiesListAdd(int currentAccuritiesListKey,String
	// floor,String date, String Type) {
	// super();
	// this.currentAccuritiesListKey=currentAccuritiesListKey;
	// this.floor=floor;
	// this.date=date;
	// this.type=Type;
	// getContentPane().setBackground(Color.GRAY);
	// Global.frameAccuritiesListAddNew = this;
	// setResizable(false);
	// setTitle("Medrex");
	// setSize(new Dimension(
	// Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
	// .getDefaultToolkit().getScreenSize().height - 50));
	// setSize(new Dimension(262, 345));
	// // setSize(new Dimension(445, 500));
	// // setBounds(100, 100, 1024, 768);
	//
	// // final JPanel panel = new
	// PanelAccuritiesListAdd(currentAccuritiesListKey,floor,date);
	// final JPanel panel = new
	// PanelResidentMain(currentAccuritiesListKey,floor,date,type);
	// // setSize(panel.getPreferredSize());
	// // setSize(new Dimension(
	// // Toolkit.getDefaultToolkit().getScreenSize().width-100, Toolkit
	// // .getDefaultToolkit().getScreenSize().height-50));
	// setSize(new Dimension(
	// Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
	// .getDefaultToolkit().getScreenSize().height - 50));
	// // setSize(new Dimension(700, 500));
	// getContentPane().add(panel, BorderLayout.CENTER);
	// //
	// }
	public FrameAccuritiesListAdd(int currentAccuritiesListKey, String floor,
			String date, String type) {
		super();
		this.currentAccuritiesListKey = currentAccuritiesListKey;
		this.floor = floor;
		this.date = date;
		this.type = type;
		getContentPane().setBackground(Color.GRAY);
		Global.frameAccuritiesListAddNew = this;
		setResizable(false);
		setTitle("Medrex");
		setSize(new Dimension(
				Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
						.getDefaultToolkit().getScreenSize().height - 50));
		setSize(new Dimension(262, 345));
		// setSize(new Dimension(445, 500));
		// setBounds(100, 100, 1024, 768);

		// final JPanel panel = new
		// PanelAccuritiesListAdd(currentAccuritiesListKey,floor,date);
		final JPanel panel = new PanelResidentMain(currentAccuritiesListKey,
				floor, date, type);
		setSize(panel.getPreferredSize());
		// setSize(new Dimension(
		// Toolkit.getDefaultToolkit().getScreenSize().width-100, Toolkit
		// .getDefaultToolkit().getScreenSize().height-50));
		// setSize(new Dimension(
		// Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
		// .getDefaultToolkit().getScreenSize().height - 50));
		// setSize(new Dimension(700, 500));
		setSize(730, 708);
		getContentPane().add(panel, BorderLayout.CENTER);
		// this.getParent().setVisible(false);
	}
}
