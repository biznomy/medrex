package com.sX.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSlider;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import medrex.client.utils.SwingUtils;

import com.sX.swing.widgets.PanelFaceScale;
import com.sX.swing.widgets.PanelFlaccScale;

@SuppressWarnings("serial")
public class JxPopUpButton extends JButton {
	private PanelFaceScale faceScalePopUp;
	private PanelFlaccScale flaccScalePopUp;
	private String mode;
	private String flaccValues;
	private int presentValue;
	private JPopupMenu popup;
	private JSlider slider;

	public JxPopUpButton() {
		super("0");
		addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showPopup();
			}
		});
		createGUI("FACE");
		createGUI("FLACC");
		createGUI("NUMERICAL");
	}

	private void updateFaceScore(int score) {
		this.setText(score + "");
	}

	private void updateFlaccScore(int score, String flaccValues) {
		this.setText(score + "");
		setFlaccValues(flaccValues);
	}

	private void showPopup() {
		if (mode != null && mode.equalsIgnoreCase("FACE")) {
			if (faceScalePopUp != null) {
				if (faceScalePopUp.isShowing()) {
					faceScalePopUp.close();
				} else {
					SwingUtils.openInDialogUnDecorated(faceScalePopUp, null);
				}
			}
		} else if (mode != null && mode.equalsIgnoreCase("FLACC")) {
			if (flaccScalePopUp != null) {
				if (flaccScalePopUp.isShowing()) {
					flaccScalePopUp.close();
				} else {
					flaccScalePopUp.setFlaccValues(getFlaccValues());
					flaccScalePopUp.setPresentValue(getPresentValue());
					SwingUtils.openInDialogUnDecorated(flaccScalePopUp, null);
				}
			}
		} else if (mode != null && mode.equalsIgnoreCase("NUMERICAL")) {
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
	}

	public void setMode(String PopUpMode) {
		mode = PopUpMode;
	}

	private void createGUI(String mode) {
		if (mode != null && mode.equalsIgnoreCase("NUMERICAL")) {

			// for Numerical Scale

			popup = new JPopupMenu();
			popup.setLayout(new BorderLayout(0, 0));
			popup.setBackground(Color.WHITE);

			JPanel panel = new JPanel();
			panel.setPreferredSize(new Dimension(350, 50));
			panel.setOpaque(false);

			JLabel Northlabel = new JLabel("0-10 Numeric Pain Intensity Scale");
			Northlabel.setFont(new Font("Dialog", Font.BOLD, 18));
			panel.add(Northlabel);

			JLabel l1 = new JLabel("<html><body><center>No <br>Pain");
			l1.setFont(new Font("Dialog", Font.BOLD, 15));
			l1.setPreferredSize(new Dimension(80, 20));

			JLabel l2 = new JLabel("<html><body><center>Moderate <br>Pain");
			l2.setFont(new Font("Dialog", Font.BOLD, 15));
			l2.setHorizontalAlignment(FlowLayout.LEFT);

			JLabel l3 = new JLabel(
					"<html><body><center>Worst Possible <br>Pain");
			l3.setFont(new Font("Dialog", Font.BOLD, 15));

			JPanel panelWest = new JPanel();
			panelWest.setPreferredSize(new Dimension(20, 100));
			panelWest.setOpaque(false);
			popup.add(panelWest, BorderLayout.WEST);

			JPanel panelEast = new JPanel();
			panelEast.setPreferredSize(new Dimension(20, 100));
			panelEast.setOpaque(false);
			popup.add(panelEast, BorderLayout.EAST);

			JPanel panelSouth = new JPanel();
			panelSouth.setLayout(new BorderLayout(0, 20));
			panelSouth.add(l1, BorderLayout.WEST);
			panelSouth.add(l2, BorderLayout.CENTER);
			panelSouth.add(l3, BorderLayout.EAST);
			panelSouth.setOpaque(false);

			popup.add(panel, BorderLayout.NORTH);
			popup.add(panelSouth, BorderLayout.SOUTH);

			slider = new JSlider();
			slider.setPreferredSize(new Dimension(450, 100));
			slider.setMaximum(10);
			slider.setMinimum(0);
			slider.setValue(0);
			slider.setPaintTrack(true);
			slider.setPaintTicks(true);
			slider.setPaintLabels(true);
			slider.setMinorTickSpacing(1);
			slider.setMajorTickSpacing(1);
			slider.setOpaque(false);
			popup.add(slider, BorderLayout.CENTER);

			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					JxPopUpButton.this.setText(slider.getValue() + "");
				}
			});

		}

		if (mode != null && mode.equalsIgnoreCase("FLACC")) {

			flaccScalePopUp = new PanelFlaccScale();
			flaccScalePopUp.addAncestorListener(new AncestorListener() {
				public void ancestorAdded(final AncestorEvent event) {
				}

				public void ancestorMoved(final AncestorEvent event) {
				}

				public void ancestorRemoved(final AncestorEvent event) {
					updateFlaccScore(flaccScalePopUp.getScore(),
							flaccScalePopUp.getFlaccValues());
				}
			});
		}

		if (mode != null && mode.equalsIgnoreCase("FACE")) {

			faceScalePopUp = new PanelFaceScale();
			faceScalePopUp.addAncestorListener(new AncestorListener() {
				public void ancestorAdded(final AncestorEvent event) {
				}

				public void ancestorMoved(final AncestorEvent event) {
				}

				public void ancestorRemoved(final AncestorEvent event) {

					updateFaceScore(faceScalePopUp.getScore());
				}

			});
		}

	}

	public String getFlaccValues() {
		return flaccValues;
	}

	public void setFlaccValues(String flaccValues) {
		this.flaccValues = flaccValues;
	}

	public int getPresentValue() {
		return presentValue;
	}

	public void setPresentValue(int presentValue) {
		this.presentValue = presentValue;
	}

	public static void main(String ar[]) {
		JxPopUpButton btn = new JxPopUpButton();
		btn.setMode("NUMERICAL");
		SwingUtils.wrapInDialog(btn).setVisible(true);
	}
}
