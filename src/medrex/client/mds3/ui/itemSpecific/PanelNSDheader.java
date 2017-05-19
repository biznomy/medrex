package medrex.client.mds3.ui.itemSpecific;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.enums.ColorConstants;

public class PanelNSDheader extends JPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4038615736081525974L;

	public PanelNSDheader() {
		super();
		setOpaque(false);
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 100));
		setBackground(Color.WHITE);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setOpaque(false);
		panel.setLayout(null);
		add(panel);

		final JLabel minimumDataSetLabel = new JLabel();
		minimumDataSetLabel.setFont(new Font("Arial", Font.BOLD, 18));
		minimumDataSetLabel.setHorizontalAlignment(SwingConstants.CENTER);
		minimumDataSetLabel.setForeground(ColorConstants.MDS_FONT_COLOR);
		minimumDataSetLabel.setText("MINIMUM DATA SET (MDS) - VERSION 3.0");
		minimumDataSetLabel.setBounds(222, 10, 379, 26);
		panel.add(minimumDataSetLabel);

		final JLabel residentAssessmentAndLabel = new JLabel();
		residentAssessmentAndLabel.setFont(new Font("", Font.BOLD, 16));
		residentAssessmentAndLabel
				.setHorizontalAlignment(SwingConstants.CENTER);
		residentAssessmentAndLabel.setForeground(ColorConstants.MDS_FONT_COLOR);
		residentAssessmentAndLabel
				.setText("RESIDENT ASSESSMENT AND CARE SCREENING");
		residentAssessmentAndLabel.setBounds(198, 43, 422, 16);
		panel.add(residentAssessmentAndLabel);

		final JLabel residentAssessmentAndLabel_1 = new JLabel();
		residentAssessmentAndLabel_1.setFont(new Font("Arial", Font.BOLD
				| Font.ITALIC, 16));
		residentAssessmentAndLabel_1
				.setHorizontalAlignment(SwingConstants.CENTER);
		residentAssessmentAndLabel_1
				.setForeground(ColorConstants.MDS_FONT_COLOR);
		residentAssessmentAndLabel_1
				.setText("Nursing Home OMRA -Start of Therapy and Discharge (NSD) Item Set");
		residentAssessmentAndLabel_1.setBounds(148, 65, 522, 16);
		panel.add(residentAssessmentAndLabel_1);

	}

	@Override
	public void doSave() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doUpdate() {
		// TODO Auto-generated method stub

	}

}
