package medrex.client.census;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;

import com.sX.swing.JxButton;

public class FrameCensusStatusHistoryReportChooser extends JDialog {

	private static final long serialVersionUID = 1L;
	private Toolkit toolkit = null;
	private JxButton admissionReportButton;
	private JButton dischargeReportButton;
	private JButton allCensusHistoryButton;
	private JxButton signInOutReportButton;
	private static final Color DEF_COLOR = new Color(49, 104, 127);

	public FrameCensusStatusHistoryReportChooser() {
		super();
		setBackground(Color.WHITE);
		setTitle("Report Chooser");
		Global.frameCensusStatusHistoryReportChoooser = this;
		setSize(new Dimension(230, 277));
		setModal(true);
		setLayout(null);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 222, 250);
		add(panel);

		final JLabel chooseReportLabel = new JLabel();
		chooseReportLabel.setForeground(DEF_COLOR);
		chooseReportLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		chooseReportLabel.setText("Choose Report");
		chooseReportLabel.setBounds(70, 10, 112, 28);
		panel.add(chooseReportLabel);

		allCensusHistoryButton = new JxButton();
		allCensusHistoryButton.setForeground(DEF_COLOR);
		allCensusHistoryButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameCensusReportDateChooser frameCensusDateChooser = new FrameCensusReportDateChooser(
						"All Census History Report");
				SwingUtils.center(frameCensusDateChooser);
				frameCensusDateChooser.setVisible(true);
				Global.frameCensusStatusHistoryReportChoooser.dispose();
			}
		});
		allCensusHistoryButton.setBackground(Color.WHITE);
		allCensusHistoryButton.setText("All Census History Report");
		allCensusHistoryButton.setBounds(35, 50, 156, 21);
		panel.add(allCensusHistoryButton);

		dischargeReportButton = new JxButton();
		dischargeReportButton.setForeground(DEF_COLOR);
		dischargeReportButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameCensusReportDateChooser frameCensusDateChooser = new FrameCensusReportDateChooser(
						"Discharge Report");
				SwingUtils.center(frameCensusDateChooser);
				frameCensusDateChooser.setVisible(true);
				Global.frameCensusStatusHistoryReportChoooser.dispose();
			}
		});
		dischargeReportButton.setBackground(Color.WHITE);
		dischargeReportButton.setText("Discharge Report");
		dischargeReportButton.setBounds(35, 150, 156, 21);
		panel.add(dischargeReportButton);

		admissionReportButton = new JxButton();
		admissionReportButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameCensusReportDateChooser frameCensusDateChooser = new FrameCensusReportDateChooser(
						"Admission Report");
				SwingUtils.center(frameCensusDateChooser);
				frameCensusDateChooser.setVisible(true);
				Global.frameCensusStatusHistoryReportChoooser.dispose();
			}
		});
		admissionReportButton.setText("Admission Report");
		admissionReportButton.setBounds(35, 100, 156, 21);
		admissionReportButton.setForeground(DEF_COLOR);
		admissionReportButton.setBackground(Color.white);
		panel.add(admissionReportButton);

		signInOutReportButton = new JxButton();
		signInOutReportButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameCensusReportDateChooser frameCensusDateChooser = new FrameCensusReportDateChooser(
						"Sign In / Sign Out Report");
				SwingUtils.center(frameCensusDateChooser);
				frameCensusDateChooser.setVisible(true);
				Global.frameCensusStatusHistoryReportChoooser.dispose();
			}
		});
		signInOutReportButton.setText("Sin In / Sign Out Report");
		signInOutReportButton.setBounds(35, 194, 156, 21);
		signInOutReportButton.setForeground(DEF_COLOR);
		signInOutReportButton.setBackground(Color.white);
		panel.add(signInOutReportButton);
	}
}
