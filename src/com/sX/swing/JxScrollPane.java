package com.sX.swing;

import java.awt.Component;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class JxScrollPane extends JScrollPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3841676862453625594L;

	public JxScrollPane() {

		JScrollBar scrollVertical = this.getVerticalScrollBar();
		scrollVertical.setUnitIncrement(50);

		JScrollBar scrollHorizontal = this.getHorizontalScrollBar();
		scrollHorizontal.setUnitIncrement(100);
	}

	public JxScrollPane(Component view) {
		super(view);
		// TODO Auto-generated constructor stub
	}

	public JxScrollPane(int vsbPolicy, int hsbPolicy) {
		super(vsbPolicy, hsbPolicy);
		// TODO Auto-generated constructor stub
	}

	public JxScrollPane(Component view, int vsbPolicy, int hsbPolicy) {
		super(view, vsbPolicy, hsbPolicy);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
