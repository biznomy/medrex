package medrex.client.main.resident.weight;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import medrex.client.census.FrameCensusReportDateChooser;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;

import com.sX.swing.JxButton;

public class FrameWeightReport extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6104062229613242723L;

	public FrameWeightReport() {
		super();
		setTitle("Resident Weight");
		setSize(new Dimension(270, 200));
		setModal(true);
		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		getContentPane().add(panel, BorderLayout.CENTER);

		final JxButton patientsNotWeighedButton = new JxButton();
		patientsNotWeighedButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameCensusReportDateChooser dc = new FrameCensusReportDateChooser(
						"Patients not Weighed");
				SwingUtils.center(dc);
				dispose();
				dc.setVisible(true);
			}
		});
		patientsNotWeighedButton.setBackground(Color.WHITE);
		patientsNotWeighedButton.setForeground(ColorConstants.DEF_COLOR);
		patientsNotWeighedButton.setFont(new Font("Dialog", Font.BOLD, 12));
		patientsNotWeighedButton.setText("Patients not Weighed");
		patientsNotWeighedButton.setBounds(23, 56, 217, 26);
		panel.add(patientsNotWeighedButton);

		final JLabel chooseACategoryLabel = new JLabel();
		chooseACategoryLabel.setForeground(ColorConstants.DEF_COLOR);
		chooseACategoryLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		chooseACategoryLabel.setText("Choose a category");
		chooseACategoryLabel.setBounds(75, 10, 132, 16);
		panel.add(chooseACategoryLabel);

		final JxButton patientsWeighedButton = new JxButton();
		patientsWeighedButton.setFont(new Font("Dialog", Font.BOLD, 12));
		patientsWeighedButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameCensusReportDateChooser dc = new FrameCensusReportDateChooser(
						"Patients weighed");
				SwingUtils.center(dc);
				dispose();
				dc.setVisible(true);
			}
		});
		patientsWeighedButton.setForeground(ColorConstants.DEF_COLOR);
		patientsWeighedButton.setBackground(Color.WHITE);
		patientsWeighedButton.setText("Patients weighed");
		patientsWeighedButton.setBounds(23, 110, 217, 26);
		panel.add(patientsWeighedButton);

		final JxButton reweighsButton = new JxButton();
		reweighsButton.setFont(new Font("Dialog", Font.BOLD, 12));
		reweighsButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameCensusReportDateChooser dc = new FrameCensusReportDateChooser(
						"Residents Weight Report");
				SwingUtils.center(dc);
				dispose();
				dc.setVisible(true);
			}
		});
		reweighsButton.setForeground(ColorConstants.DEF_COLOR);
		reweighsButton.setBackground(Color.WHITE);
		reweighsButton.setText("Reweighs");
		reweighsButton.setBounds(23, 165, 217, 26);
		reweighsButton.setVisible(false);
		panel.add(reweighsButton);

	}

	public static void main(String[] args) {
		FrameWeightReport wr = new FrameWeightReport();
		SwingUtils.center(wr);
		wr.setVisible(true);
	}

}
