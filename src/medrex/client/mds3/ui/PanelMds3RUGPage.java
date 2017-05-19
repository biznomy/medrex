package medrex.client.mds3.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import medrex.client.mds3.engine.Mds3ClientEngine;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.mds3.SectionG.Mds3SectionG;

public class PanelMds3RUGPage extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7104298522219702812L;
	private JLabel lblAdjustedMinutes;
	private JLabel lblTotalMinutes;
	private JLabel lblR;
	private JLabel lblRPES;
	private JLabel lblTotalADL;
	private Mds3SectionG Mds3SectionG;
	private Mds3ClientEngine mds3ClientEngine;
	int value;
	double totalMinutes = 0.0;
	double adjustedMinutes = 0.0;
	double medicareShortStayAssessmentminutes = 0.0;
	String rugIVClass = "";

	public PanelMds3RUGPage(int value, double totalMinutes,
			double adjustedMinutes, double medicareShortStayAssessmentminutes,
			String rugIVClass) {

		super();
		this.value = value;
		this.totalMinutes = totalMinutes;
		this.adjustedMinutes = adjustedMinutes;
		this.medicareShortStayAssessmentminutes = medicareShortStayAssessmentminutes;
		this.rugIVClass = rugIVClass;
		setBackground(Color.WHITE);
		setLayout(null);
		setSize(470, 310);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 468, 304);
		add(panel);

		final JLabel rugIiiLabel = new JLabel();
		rugIiiLabel.setFont(new Font("", Font.BOLD, 20));
		rugIiiLabel.setText("RUG - IV Group");
		rugIiiLabel.setBounds(165, 30, 147, 38);
		panel.add(rugIiiLabel);

		final JLabel totalAdlScoreLabel = new JLabel();
		totalAdlScoreLabel.setFont(new Font("Arial", Font.BOLD, 14));
		totalAdlScoreLabel.setText("Total Mds3ADL Score :");
		totalAdlScoreLabel.setBounds(169, 105, 168, 20);
		panel.add(totalAdlScoreLabel);

		lblTotalADL = new JLabel();
		lblTotalADL.setText("");
		lblTotalADL.setBounds(335, 108, 66, 16);
		panel.add(lblTotalADL);

		final JLabel rehabilitationPlusExtensiveLabel = new JLabel();
		rehabilitationPlusExtensiveLabel.setFont(new Font("Arial", Font.BOLD,
				14));
		rehabilitationPlusExtensiveLabel
				.setText("Rehabilitation Plus Extensive Services :");
		rehabilitationPlusExtensiveLabel.setBounds(46, 130, 290, 20);
		panel.add(rehabilitationPlusExtensiveLabel);

		final JLabel rehabilitationLabel = new JLabel();
		rehabilitationLabel.setFont(new Font("Arial", Font.BOLD, 14));
		rehabilitationLabel.setToolTipText("");
		rehabilitationLabel.setText("Rehabilitation :");
		rehabilitationLabel.setBounds(219, 205, 106, 16);
		panel.add(rehabilitationLabel);

		lblRPES = new JLabel();
		lblRPES.setText("");
		lblRPES.setBounds(335, 132, 66, 16);
		panel.add(lblRPES);

		lblR = new JLabel();
		lblR.setText("");
		lblR.setBounds(335, 205, 66, 16);
		panel.add(lblR);

		final JButton okButton = new JButton();
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		okButton.setText("OK");
		okButton.setBounds(190, 250, 106, 26);
		panel.add(okButton);

		final JLabel totalminutesLabel = new JLabel();
		totalminutesLabel.setFont(new Font("Arial", Font.BOLD, 14));
		totalminutesLabel.setText("Total Minutes :");
		totalminutesLabel.setBounds(222, 155, 106, 20);
		panel.add(totalminutesLabel);

		final JLabel adjustedminutesLabel = new JLabel();
		adjustedminutesLabel.setFont(new Font("Arial", Font.BOLD, 14));
		adjustedminutesLabel.setText("Adjusted Minutes :");
		adjustedminutesLabel.setBounds(193, 180, 137, 20);
		panel.add(adjustedminutesLabel);

		lblTotalMinutes = new JLabel();
		lblTotalMinutes.setText("");
		lblTotalMinutes.setBounds(335, 158, 66, 16);
		panel.add(lblTotalMinutes);

		lblAdjustedMinutes = new JLabel();
		lblAdjustedMinutes.setText("");
		lblAdjustedMinutes.setBounds(335, 182, 66, 16);
		panel.add(lblAdjustedMinutes);

		doLoad();

	}

	private void doLoad() {
		// System.out.println("medicareShortStayAssessmentminutes in RUG IV=:"+medicareShortStayAssessmentminutes);

		// lblTotalADL.setText(Global.totalADL + "");
		lblTotalADL.setText(value + "");
		// lblRPES.setText(Global.currentRFPS);
		// REHABILITATION
		if (adjustedMinutes >= 0 && totalMinutes >= 0) {
			lblRPES.setText(adjustedMinutes + "");
			lblTotalMinutes.setText(totalMinutes + "");
			lblAdjustedMinutes.setText(adjustedMinutes + "");
		} else {
			lblRPES.setText(0 + "");
			lblTotalMinutes.setText(0 + "");
			lblAdjustedMinutes.setText(0 + "");

		}
		// lblR.setText(Global.currentRehab);
		lblR.setText(rugIVClass);

	}

	@Override
	public String getTitle() {
		return "RUG - IV Group";
	}

}
