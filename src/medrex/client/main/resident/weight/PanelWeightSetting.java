package medrex.client.main.resident.weight;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;

import medrex.commons.enums.ColorConstants;
import medrex.commons.intf.PopUpView;

import com.sX.swing.JxButton;

public class PanelWeightSetting extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6087037176102997371L;
	private ButtonGroup bgWeightSetting = new ButtonGroup();

	public PanelWeightSetting() {
		super();
		setLayout(new BorderLayout());
		setSize(new Dimension(350, 250));
		setBorder(new LineBorder(ColorConstants.DEF_COLOR, 4));
		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		add(panel, BorderLayout.CENTER);

		final JRadioButton dateLabel = new JRadioButton();
		bgWeightSetting.add(dateLabel);
		dateLabel.setOpaque(false);
		dateLabel.setBackground(Color.WHITE);
		dateLabel.setFont(new Font("Dailog", Font.BOLD, 14));
		dateLabel.setForeground(ColorConstants.DEF_COLOR);
		dateLabel.setText("Daily");
		dateLabel.setBounds(105, 55, 137, 25);
		panel.add(dateLabel);

		final JRadioButton weightLabel = new JRadioButton();
		bgWeightSetting.add(weightLabel);
		weightLabel.setBackground(Color.WHITE);
		weightLabel.setOpaque(false);
		weightLabel.setForeground(ColorConstants.DEF_COLOR);
		weightLabel.setFont(new Font("Dailog", Font.BOLD, 14));
		weightLabel.setText("Weekly");
		weightLabel.setBounds(105, 86, 137, 29);
		panel.add(weightLabel);

		final JRadioButton biWeekly = new JRadioButton();
		bgWeightSetting.add(biWeekly);
		biWeekly.setBackground(Color.WHITE);
		biWeekly.setOpaque(false);
		biWeekly.setForeground(ColorConstants.DEF_COLOR);
		biWeekly.setFont(new Font("Dailog", Font.BOLD, 14));
		biWeekly.setText("Bi-Weekly");
		biWeekly.setBounds(105, 121, 118, 29);
		panel.add(biWeekly);

		final JRadioButton monthly = new JRadioButton();
		bgWeightSetting.add(monthly);
		monthly.setBackground(Color.WHITE);
		monthly.setOpaque(false);
		monthly.setForeground(ColorConstants.DEF_COLOR);
		monthly.setFont(new Font("Dailog", Font.BOLD, 14));
		monthly.setText("Monthly");
		monthly.setBounds(105, 156, 118, 25);
		panel.add(monthly);

		final JLabel oftenLabel = new JLabel();
		oftenLabel.setOpaque(false);
		oftenLabel.setForeground(ColorConstants.DEF_COLOR);
		oftenLabel.setFont(new Font("Dailog", Font.BOLD, 14));
		oftenLabel.setText("How Often Weight Is Measured !!!");
		oftenLabel.setBounds(54, 24, 278, 16);
		panel.add(oftenLabel);

		final JxButton saveButton = new JxButton();
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSave();
				close();
			}
		});
		saveButton.setBackground(Color.WHITE);
		saveButton.setArc(0.4f);
		saveButton.setForeground(ColorConstants.DEF_COLOR);
		saveButton
				.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.setText("Save");
		saveButton.setBounds(34, 194, 118, 26);
		panel.add(saveButton);

		final JxButton cancelButton = new JxButton();
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		cancelButton.setBackground(Color.WHITE);
		cancelButton.setForeground(ColorConstants.DEF_COLOR);
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setBorder(new LineBorder(new Color(180, 188, 193), 1,
				false));
		cancelButton.setArc(0.4f);
		cancelButton.setText("Cancel");
		cancelButton.setForeground(ColorConstants.DEF_COLOR);
		cancelButton.setBounds(185, 194, 118, 26);
		panel.add(cancelButton);

		doUpdate();

	}

	private void doUpdate() {
		/*
		 * if(Global.currentResidentWeightKey != 0){ ResidentWeight rw = null;
		 * try { rw =
		 * MedrexClientManager.getInstance().getResidentWeightRecord(Global
		 * .currentResidentWeightKey); } catch (Exception e) {
		 * 
		 * e.printStackTrace(); } }
		 */

	}

	private void doSave() {

	}

	public static void main(String[] args) {
		medrex.client.utils.SwingUtils.wrapInDialog(new PanelWeightSetting())
				.setVisible(true);
	}

	@Override
	public String getTitle() {

		return "Weight";
	}

}
