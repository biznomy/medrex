package com.sX.swing.widgets;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;
import medrex.commons.intf.PopUpView;

import com.sX.swing.JxButton;
import com.sX.swing.JxToggleButton;

public class PanelFlaccScale extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8001664904371031985L;
	private ButtonGroup bgConsole;
	private ButtonGroup bgCry;
	private ButtonGroup bgActivity;
	private ButtonGroup bgLegs;
	private ButtonGroup bgFace;
	private JTextField txtTotal;
	private JxToggleButton btnConsole2;
	private JxToggleButton btnConsole1;
	private JxToggleButton btnConsole0;
	private JxToggleButton btnCry2;
	private JxToggleButton btnCry1;
	private JxToggleButton btnCry0;
	private JxToggleButton btnActivity2;
	private JxToggleButton btnActivity1;
	private JxToggleButton btnActivity0;
	private JxToggleButton btnLegs2;
	private JxToggleButton btnLegs1;
	private JxToggleButton btnLegs0;
	private JxToggleButton btnFace1;
	private JxToggleButton btnFace0;
	private JxToggleButton btnFace2;
	private JxButton saveButton;
	private JxButton cancelButton;
	public static Color selectedColor = new Color(194, 194, 194);
	private int score;
	private String flaccValues;
	private int presentValue;

	// public static void main(String[] args) {
	// medrex.client.utils.SwingUtils.wrapInDialog(new
	// PanelFlaccScale()).setVisible(true);
	//
	// }
	public PanelFlaccScale() {
		super();
		setPreferredSize(new Dimension(600, 600));
		setSize(new Dimension(600, 600));
		setLayout(new BorderLayout());
		setBorder(new LineBorder(selectedColor, 4));

		final JPanel southPanel = new JPanel();
		southPanel.setBorder(new LineBorder(Color.black, 1, false));
		southPanel.setLayout(null);
		southPanel.setBackground(Color.WHITE);
		southPanel.setPreferredSize(new Dimension(500, 150));
		add(southPanel, BorderLayout.SOUTH);

		final JLabel label = new JLabel();
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setFont(new Font("", Font.BOLD, 14));
		label
				.setText("<html><body>1.the FLACC is a behavior pain assessment scale for use in non-verbal patients &nbsp unable to provide reports of pain.</body></html>");
		label.setBounds(10, 10, 570, 39);
		southPanel.add(label);

		final JLabel instructionsLabel = new JLabel();
		instructionsLabel.setFont(new Font("", Font.BOLD, 14));
		instructionsLabel.setText("<html><body><u>Instructions:");
		instructionsLabel.setBounds(10, 55, 177, 16);
		southPanel.add(instructionsLabel);

		final JLabel label_1 = new JLabel();
		label_1
				.setText("1. Rate Patient in each of the five measuring categories");
		label_1.setBounds(36, 81, 330, 16);
		southPanel.add(label_1);

		final JLabel label_2 = new JLabel();
		label_2.setText("2. Add together");
		label_2.setBounds(36, 103, 544, 16);
		southPanel.add(label_2);

		final JLabel label_3 = new JLabel();
		label_3.setText("3. Document Total Pain Score");
		label_3.setBounds(36, 125, 544, 16);
		southPanel.add(label_3);

		saveButton = new JxButton();
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		saveButton.setBackground(Color.WHITE);
		saveButton.setArc(0.4f);
		saveButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				setScore(Integer.parseInt(txtTotal.getText()));
			}

		});
		saveButton.setText("Save");
		saveButton.setBounds(400, 120, 75, 21);
		southPanel.add(saveButton);

		cancelButton = new JxButton();
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		cancelButton.setBackground(Color.WHITE);
		cancelButton.setArc(0.4f);
		cancelButton.setText("Cancel");
		cancelButton.setBounds(505, 120, 75, 21);
		southPanel.add(cancelButton);

		final JLabel totalScoreLabel = new JLabel();
		totalScoreLabel.setText("Total Score");
		totalScoreLabel.setBounds(400, 82, 75, 14);
		southPanel.add(totalScoreLabel);

		txtTotal = new JTextField();
		txtTotal.setEditable(false);
		txtTotal.setBounds(501, 79, 79, 18);
		southPanel.add(txtTotal);

		final JPanel northPanel = new JPanel();
		final FlowLayout flowLayout_1 = new FlowLayout();
		flowLayout_1.setAlignment(FlowLayout.RIGHT);
		northPanel.setLayout(flowLayout_1);
		northPanel.setBackground(Color.WHITE);
		northPanel.setPreferredSize(new Dimension(500, 50));
		add(northPanel, BorderLayout.NORTH);

		final JLabel flaccScaleLabel = new JLabel();
		flaccScaleLabel.setForeground(ColorConstants.DEF_COLOR);
		flaccScaleLabel.setFont(new Font("", Font.BOLD, 16));
		flaccScaleLabel.setText("FLACC SCALE");
		northPanel.add(flaccScaleLabel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		panel_1.setLayout(flowLayout);
		panel_1.setPreferredSize(new Dimension(250, 30));
		northPanel.add(panel_1);

		final JxButton button = new JxButton();
		button.setPreferredSize(new Dimension(20, 20));
		panel_1.add(button);
		button.setArc(0.4f);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		button.setBackground(Color.WHITE);
		button.setText("X");
		button.setBounds(705, 10, 23, 20);

		final JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new BorderLayout());
		centerPanel.setBackground(Color.WHITE);
		centerPanel.setPreferredSize(new Dimension(500, 200));
		add(centerPanel, BorderLayout.CENTER);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new GridLayout(5, 0));
		panel.setPreferredSize(new Dimension(140, 0));
		centerPanel.add(panel, BorderLayout.WEST);

		final JPanel panel_3 = new JPanel();
		panel_3.setLayout(new BorderLayout());
		panel_3.setBackground(Color.WHITE);
		panel.add(panel_3);

		final JLabel faceLabel = new JLabel();
		faceLabel.setFont(new Font("", Font.BOLD, 14));
		faceLabel.setForeground(ColorConstants.DEF_COLOR);
		faceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		faceLabel.setVerticalAlignment(SwingConstants.CENTER);
		faceLabel.setText("FACE");
		panel_3.add(faceLabel);

		final JPanel panel_2 = new JPanel();
		panel_2.setLayout(new BorderLayout());
		panel_2.setBackground(Color.WHITE);
		panel.add(panel_2);

		final JLabel faceLabel_1 = new JLabel();
		faceLabel_1.setForeground(ColorConstants.DEF_COLOR);
		faceLabel_1.setFont(new Font("", Font.BOLD, 14));
		faceLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		faceLabel_1.setText("LEGS");
		panel_2.add(faceLabel_1);

		final JPanel panel_4 = new JPanel();
		panel_4.setLayout(new BorderLayout());
		panel_4.setBackground(Color.WHITE);
		panel.add(panel_4);

		final JLabel faceLabel_1_1 = new JLabel();
		faceLabel_1_1.setForeground(ColorConstants.DEF_COLOR);
		faceLabel_1_1.setFont(new Font("", Font.BOLD, 14));
		faceLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		faceLabel_1_1.setText("ACTIVITY");
		panel_4.add(faceLabel_1_1, BorderLayout.CENTER);

		final JPanel panel_5 = new JPanel();
		panel_5.setLayout(new BorderLayout());
		panel_5.setBackground(Color.WHITE);
		panel.add(panel_5);

		final JLabel faceLabel_1_2 = new JLabel();
		faceLabel_1_2.setForeground(ColorConstants.DEF_COLOR);
		faceLabel_1_2.setFont(new Font("", Font.BOLD, 14));
		faceLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		faceLabel_1_2.setText("CRY");
		panel_5.add(faceLabel_1_2, BorderLayout.CENTER);

		final JPanel panel_6 = new JPanel();
		panel_6.setLayout(new BorderLayout());
		panel_6.setBackground(Color.WHITE);
		panel.add(panel_6);

		final JLabel faceLabel_1_3 = new JLabel();
		faceLabel_1_3.setForeground(ColorConstants.DEF_COLOR);
		faceLabel_1_3.setFont(new Font("", Font.BOLD, 14));
		faceLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		faceLabel_1_3.setText("CONSOLABILITY");
		panel_6.add(faceLabel_1_3, BorderLayout.CENTER);

		final JPanel btnPanel = new JPanel();
		btnPanel.setBackground(Color.WHITE);
		btnPanel.setLayout(new GridLayout(5, 3));
		// btnPanel.setLayout(new FlowLayout());
		centerPanel.add(btnPanel, BorderLayout.CENTER);

		bgFace = new ButtonGroup();

		btnFace0 = new JxToggleButton();
		btnFace0.setActionCommand("0");
		btnFace0.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnFace0.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				btnFace0.setBackground(selectedColor);
				updateTotalScore();
			}
		});

		btnFace0.setBackground(Color.WHITE);
		JLabel lblFace0 = new JLabel(
				"<html><body><center>0<br>No Particular expression<br>or smile</body></html>");
		btnFace0.setLayout(new FlowLayout(0, 20, 10));
		btnFace0.add(lblFace0);

		btnPanel.add(btnFace0);

		btnFace1 = new JxToggleButton();
		btnFace1.setActionCommand("1");
		btnFace1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				btnFace1.setBackground(selectedColor);
				updateTotalScore();
			}
		});
		btnFace1.setBackground(Color.WHITE);
		btnFace1.setBorder(new LineBorder(Color.BLACK, 1));
		JLabel labelFace1 = new JLabel(
				"<html><body><center>1<br>Occasional grimace or<br>frown,withdrawn,<br>disinterested</body></html>");
		btnFace1.setLayout(new FlowLayout(0, 20, 10));
		btnFace1.add(labelFace1);
		btnPanel.add(btnFace1);

		btnFace2 = new JxToggleButton();
		btnFace2.setActionCommand("2");
		btnFace2.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				btnFace2.setBackground(selectedColor);
				updateTotalScore();
			}
		});
		btnFace2.setBackground(Color.WHITE);
		btnFace2.setBorder(new LineBorder(Color.BLACK, 1));
		JLabel labelFace2 = new JLabel(
				"<html><body><center>2<br>Frequent to constant<br>frown,clenched jaw,<br>quivering chin</body></html>");
		btnFace2.setLayout(new FlowLayout(0, 20, 10));
		btnFace2.add(labelFace2);
		btnPanel.add(btnFace2);

		bgFace.add(btnFace0);
		bgFace.add(btnFace1);
		bgFace.add(btnFace2);

		bgLegs = new ButtonGroup();
		btnLegs0 = new JxToggleButton();
		btnLegs0.setActionCommand("0");
		btnLegs0.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				btnLegs0.setBackground(selectedColor);
				updateTotalScore();
			}
		});
		btnLegs0.setBackground(Color.WHITE);
		JLabel labelleg0 = new JLabel(
				"<html><body><center>0<br>Normal Position <br>or Relaxed</body></html>");
		btnLegs0.setLayout(new FlowLayout(0, 40, 10));
		btnLegs0.add(labelleg0);
		btnPanel.add(btnLegs0);

		btnLegs1 = new JxToggleButton();
		btnLegs1.setActionCommand("1");
		btnLegs1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				btnLegs1.setBackground(selectedColor);
				updateTotalScore();
			}
		});
		btnLegs1.setBackground(Color.WHITE);
		JLabel labelleg1 = new JLabel(
				"<html><body><center>1<br>Uneasy , Restless ,<br> Tense</body></html>");
		btnLegs1.setLayout(new FlowLayout(0, 30, 10));
		btnLegs1.add(labelleg1);
		btnPanel.add(btnLegs1);

		btnLegs2 = new JxToggleButton();
		btnLegs2.setActionCommand("2");
		btnLegs2.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				btnLegs2.setBackground(selectedColor);
				updateTotalScore();
			}
		});
		btnLegs2.setBackground(Color.WHITE);
		JLabel labelleg2 = new JLabel(
				"<html><body><center>2<br>Kicking Or, Legs <br> Drwan Up</body></html>");
		btnLegs2.setLayout(new FlowLayout(0, 30, 10));
		btnLegs2.add(labelleg2);
		btnPanel.add(btnLegs2);

		bgLegs.add(btnLegs0);
		bgLegs.add(btnLegs1);
		bgLegs.add(btnLegs2);

		bgActivity = new ButtonGroup();
		btnActivity0 = new JxToggleButton();
		btnActivity0.setActionCommand("0");
		btnActivity0.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				btnActivity0.setBackground(selectedColor);
				updateTotalScore();
			}
		});
		btnActivity0.setBackground(Color.WHITE);
		JLabel labelAct0 = new JLabel(
				"<html><body><center>0<br>Lying quietly, <br>Normal position , <br> Moves Easily</body></html>");
		btnActivity0.setLayout(new FlowLayout(0, 30, 10));
		btnActivity0.add(labelAct0);
		btnPanel.add(btnActivity0);

		btnActivity1 = new JxToggleButton();
		btnActivity1.setActionCommand("1");
		btnActivity1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				btnActivity1.setBackground(selectedColor);
				updateTotalScore();
			}
		});
		btnActivity1.setBackground(Color.WHITE);
		JLabel labelAct1 = new JLabel(
				"<html><body><center>1<br>Squirming, <br>Shifting Back/Forth <br> Tense</body></html>");
		btnActivity1.setLayout(new FlowLayout(0, 30, 10));
		btnActivity1.add(labelAct1);
		btnPanel.add(btnActivity1);

		btnActivity2 = new JxToggleButton();
		btnActivity2.setActionCommand("2");
		btnActivity2.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				btnActivity2.setBackground(selectedColor);
				updateTotalScore();
			}
		});
		btnActivity2.setBackground(Color.WHITE);
		JLabel labelAct2 = new JLabel(
				"<html><body><center>2<br>Arched , Rigid or <br>Jerking </body></html>");
		btnActivity2.setLayout(new FlowLayout(0, 30, 10));
		btnActivity2.add(labelAct2);
		btnPanel.add(btnActivity2);

		bgActivity.add(btnActivity0);
		bgActivity.add(btnActivity1);
		bgActivity.add(btnActivity2);

		bgCry = new ButtonGroup();
		btnCry0 = new JxToggleButton();
		btnCry0.setActionCommand("0");
		btnCry0.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				btnCry0.setBackground(selectedColor);
				updateTotalScore();
			}
		});
		btnCry0.setBackground(Color.WHITE);
		JLabel labelCry0 = new JLabel(
				"<html><body><center>0<br>No cry ,<br> Awake or Sleep</body></html>");
		btnCry0.setLayout(new FlowLayout(0, 40, 10));
		btnCry0.add(labelCry0);
		btnPanel.add(btnCry0);

		btnCry1 = new JxToggleButton();
		btnCry1.setActionCommand("1");
		btnCry1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				btnCry1.setBackground(selectedColor);
				updateTotalScore();
			}
		});
		btnCry1.setBackground(Color.WHITE);
		JLabel labelCry1 = new JLabel(
				"<html><body><center>1<br>Moans or whimpers<br>occasional complaint</body></html>");
		btnCry1.setLayout(new FlowLayout(0, 30, 10));
		btnCry1.add(labelCry1);
		btnPanel.add(btnCry1);

		btnCry2 = new JxToggleButton();
		btnCry2.setActionCommand("2");
		btnCry2.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				btnCry2.setBackground(selectedColor);
				updateTotalScore();
			}
		});
		btnCry2.setBackground(Color.WHITE);
		JLabel labelCry2 = new JLabel(
				"<html><body><center>2<br>Crying steadily<br>screams or sobs<br>frequent complaints</body></html>");
		btnCry2.setLayout(new FlowLayout(0, 30, 10));
		btnCry2.add(labelCry2);
		btnPanel.add(btnCry2);

		bgCry.add(btnCry0);
		bgCry.add(btnCry1);
		bgCry.add(btnCry2);

		bgConsole = new ButtonGroup();
		btnConsole0 = new JxToggleButton();
		btnConsole0.setActionCommand("0");
		btnConsole0.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				btnConsole0.setBackground(selectedColor);
				updateTotalScore();
			}
		});
		btnConsole0.setBackground(Color.WHITE);
		JLabel labelConsle0 = new JLabel(
				"<html><body><center>0<br>Content<br>relaxed</body></html>");
		btnConsole0.setLayout(new FlowLayout(0, 60, 10));
		btnConsole0.add(labelConsle0);
		btnPanel.add(btnConsole0);

		btnConsole1 = new JxToggleButton();
		btnConsole1.setActionCommand("1");
		btnConsole1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				btnConsole1.setBackground(selectedColor);
				updateTotalScore();
			}
		});
		btnConsole1.setBackground(Color.WHITE);
		JLabel labelConsle1 = new JLabel(
				"<html><body><center>1<br>Reassured by occasional<br>touching hugging or<br>talking to Distractible</body></html>");
		btnConsole1.setLayout(new FlowLayout(0, 20, 10));
		btnConsole1.add(labelConsle1);
		btnPanel.add(btnConsole1);

		btnConsole2 = new JxToggleButton();
		btnConsole2.setActionCommand("2");
		btnConsole2.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				btnConsole2.setBackground(selectedColor);
				updateTotalScore();
			}
		});
		btnConsole2.setBackground(Color.WHITE);
		JLabel labelConsle2 = new JLabel(
				"<html><body><center>2<br>difficult to<br>console or comfort</body></html>");
		btnConsole2.setLayout(new FlowLayout(0, 30, 10));
		btnConsole2.add(labelConsle2);
		btnPanel.add(btnConsole2);

		bgConsole.add(btnConsole0);
		bgConsole.add(btnConsole1);
		bgConsole.add(btnConsole2);
		doUpdate();
	}

	private void doUpdate() {
		SwingUtils.setSelectedButton(bgFace, 0);
		btnFace0.setBackground(selectedColor);
		SwingUtils.setSelectedButton(bgLegs, 0);
		btnLegs0.setBackground(selectedColor);
		SwingUtils.setSelectedButton(bgActivity, 0);
		btnActivity0.setBackground(selectedColor);
		SwingUtils.setSelectedButton(bgCry, 0);
		btnCry0.setBackground(selectedColor);
		SwingUtils.setSelectedButton(bgConsole, 0);
		btnConsole0.setBackground(selectedColor);
		txtTotal.setText(0 + "");
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;

	}

	public String getFlaccValues() {
		return flaccValues;
	}

	public void setFlaccValues(String flaccValues) {
		this.flaccValues = flaccValues;
		if (flaccValues != null) {
			updateData();
		}
	}

	private void updateData() {
		String arr[] = null;
		if (flaccValues != null) {
			arr = flaccValues.split(",");
		}
		int faceValue = 0;
		int legsValue = 0;
		int activityValue = 0;
		int cryValue = 0;
		int consoleValue = 0;
		if (arr != null && arr.length > 0) {
			faceValue = Integer.parseInt(arr[0]);
			legsValue = Integer.parseInt(arr[1]);
			;
			activityValue = Integer.parseInt(arr[2]);
			;
			cryValue = Integer.parseInt(arr[3]);
			;
			consoleValue = Integer.parseInt(arr[4]);
			;
		}
		SwingUtils.setSelectedButton(bgFace, faceValue);
		SwingUtils.setSelectedButton(bgLegs, legsValue);
		SwingUtils.setSelectedButton(bgActivity, activityValue);
		SwingUtils.setSelectedButton(bgCry, cryValue);
		SwingUtils.setSelectedButton(bgConsole, consoleValue);
		txtTotal.setText(getPresentValue() + "");
	}

	private void updateTotalScore() {
		flaccValues = new String();

		int faceValue = SwingUtils.getSelectedButton(bgFace);
		int legsValue = SwingUtils.getSelectedButton(bgLegs);
		int activityValue = SwingUtils.getSelectedButton(bgActivity);
		int cryValue = SwingUtils.getSelectedButton(bgCry);
		int consoleValue = SwingUtils.getSelectedButton(bgConsole);

		flaccValues = faceValue + "," + legsValue + "," + activityValue + ","
				+ cryValue + "," + consoleValue;
		setFlaccValues(flaccValues);
		int total = faceValue + legsValue + activityValue + cryValue
				+ consoleValue;
		txtTotal.setText(total + "");

	}

	@Override
	public String getTitle() {

		return "Flacc Scale";
	}

	public int getPresentValue() {
		return presentValue;
	}

	public void setPresentValue(int presentValue) {
		this.presentValue = presentValue;
		updateData();
	}
}
