/**
 * 
 */
package com.sX.swing;

import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPopupMenu;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * @author D S Naruka
 * 
 */
public class JSliderButton extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8584838125187909211L;
	private JPopupMenu popup;
	private JSlider slider;

	public JSliderButton() {
		super("0%");
		addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				togglePopup();
			}
		});

		setMargin(new Insets(0, 0, 0, 0));

		popup = new JPopupMenu();

		slider = new JSlider();
		slider.setMaximum(100);
		slider.setMinimum(0);
		slider.setValue(0);
		slider.setPaintTrack(true);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMinorTickSpacing(5);
		slider.setMajorTickSpacing(25);
		popup.add(slider);

		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				JSliderButton.this.setText(slider.getValue() + "%");
			}
		});
	}

	private void togglePopup() {
		if (popup != null) {
			if (popup.isShowing()) {
				popup.setVisible(false);
			} else {
				this.remove(popup);
				this.add(popup);
				popup.show(this, 0, this.getHeight());
			}
		}
	}

	public int getMinimum() {
		return slider.getMinimum();
	}

	public int getMaximum() {
		return slider.getMaximum();
	}

	public void setMinimum(int minimum) {
		slider.setMinimum(minimum);
	}

	public void setMaximum(int maximum) {
		slider.setMaximum(maximum);
	}

	public int getValue() {
		return slider.getValue();
	}

	public void setValue(int value) {
		slider.setValue(value);
	}

	@Override
	public void setBackground(Color bg) {
		super.setBackground(bg);
		if (slider != null) {
			slider.setBackground(bg);
		}
	}

	@Override
	public void setForeground(Color fg) {
		super.setForeground(fg);
		if (slider != null) {
			slider.setForeground(fg);
		}
	}

	/*
	 * public static void main(String[] args) { try {
	 * UIManager.setLookAndFeel(new Plastic3DLookAndFeel()); } catch (Exception
	 * e) { e.printStackTrace(); }
	 * 
	 * JPanel panel = new JPanel(); panel.setSize(500, 500);
	 * panel.setPreferredSize(panel.getSize()); panel.setLayout(null);
	 * 
	 * JSliderButton btn = new JSliderButton(); btn.setSize(36,23);
	 * btn.setLocation(100, 150); btn.setOpaque(true); panel.add(btn);
	 * 
	 * JButton btn2 = new JButton(); btn2.addMouseListener(new MouseAdapter() {
	 * public void mouseClicked(MouseEvent e) { System.out.println("normal"); }
	 * }); btn2.setText("0%"); btn2.setSize(36,23); btn2.setLocation(200, 150);
	 * btn2.setOpaque(true); panel.add(btn2);
	 * 
	 * JFrame frame = SwingUtils.wrapInFrame(panel); frame.setVisible(true); }
	 */
}
