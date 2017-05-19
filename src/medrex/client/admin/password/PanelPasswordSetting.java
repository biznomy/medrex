package medrex.client.admin.password;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.admin.PasswordSetting;

import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;

public class PanelPasswordSetting extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3048164439532248113L;
	private JRadioButton unlockedRadioButton;
	private JRadioButton lockedRadioButton;
	private JxComboBox cmbMaxDays;
	private JTextField txtAttempts;
	private ButtonGroup buttonGroup = new ButtonGroup();

	public PanelPasswordSetting() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setSize(360, 325);

		final JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 380, 325);

		final JLabel numberOfAttemptsLabel = new JLabel();
		numberOfAttemptsLabel.setForeground(ColorConstants.DEF_COLOR);
		numberOfAttemptsLabel.setText("Number Of Attempts");
		numberOfAttemptsLabel.setBounds(10, 83, 145, 16);
		panel.add(numberOfAttemptsLabel);

		final JLabel maximumDaysLabel = new JLabel();
		maximumDaysLabel.setForeground(ColorConstants.DEF_COLOR);
		maximumDaysLabel.setText("Maximum Days");
		maximumDaysLabel.setBounds(10, 123, 145, 16);
		panel.add(maximumDaysLabel);

		cmbMaxDays = new JxComboBox();
		cmbMaxDays.setArc(0.4f);
		cmbMaxDays.setBackground(Color.WHITE);
		cmbMaxDays.setForeground(ColorConstants.DEF_COLOR);
		cmbMaxDays.setModel(new DefaultComboBoxModel(new String[] { "", "30",
				"60", "90", "unlimited" }));
		cmbMaxDays.setBounds(184, 119, 158, 20);
		panel.add(cmbMaxDays);

		final JLabel changeLockStatusLabel = new JLabel();
		changeLockStatusLabel.setForeground(ColorConstants.DEF_COLOR);
		changeLockStatusLabel.setText("Status Of Users");
		changeLockStatusLabel.setBounds(10, 166, 118, 16);
		panel.add(changeLockStatusLabel);

		lockedRadioButton = new JRadioButton();
		lockedRadioButton.setActionCommand("0");
		buttonGroup.add(lockedRadioButton);
		lockedRadioButton.setBackground(Color.WHITE);
		lockedRadioButton.setForeground(ColorConstants.DEF_COLOR);
		lockedRadioButton.setText("Locked");
		lockedRadioButton.setBounds(184, 162, 67, 24);
		panel.add(lockedRadioButton);

		unlockedRadioButton = new JRadioButton();
		unlockedRadioButton.setActionCommand("1");
		buttonGroup.add(unlockedRadioButton);
		unlockedRadioButton.setBackground(Color.WHITE);
		unlockedRadioButton.setForeground(ColorConstants.DEF_COLOR);
		unlockedRadioButton.setText("UnLocked");
		unlockedRadioButton.setBounds(257, 167, 85, 14);
		panel.add(unlockedRadioButton);
		SwingUtils.setSelectedButton(buttonGroup, 0);

		final JButton applyButton = new JxButton(0.4f);
		applyButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				PasswordSetting ps = new PasswordSetting();
				if (!(txtAttempts.getText().equalsIgnoreCase(""))
						&& (cmbMaxDays.getSelectedItem() != null)) {
					ps.setSerial(1);
					ps.setNoOfAttempts(Integer.parseInt(txtAttempts.getText()));
					if (cmbMaxDays.getSelectedItem().toString()
							.equalsIgnoreCase("Unlimited")) {
						ps.setMaximumDays(0);
					} else {
						ps.setMaximumDays(Integer.parseInt(cmbMaxDays
								.getSelectedItem()
								+ ""));
					}
					try {
						Global.currentPasswordSettingKey = MedrexClientManager
								.getInstance().insertOrUpdatePasswordSettings(
										ps);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				PanelPasswordSetting.this.dispose();
			}
		});
		applyButton.setForeground(ColorConstants.DEF_COLOR);
		applyButton.setBackground(Color.WHITE);
		applyButton.setBorder(new LineBorder(ColorConstants.BORDER_COL, 1,
				false));
		applyButton.setFont(new Font("", Font.BOLD, 12));
		applyButton.setText("Apply");
		applyButton.setBounds(10, 254, 106, 26);
		panel.add(applyButton);

		final JButton cancelButton = new JxButton(0.4f);
		cancelButton.setBorder(new LineBorder(ColorConstants.BORDER_COL, 1,
				false));
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				PanelPasswordSetting.this.dispose();
			}
		});
		cancelButton.setBackground(Color.WHITE);
		cancelButton.setText("Cancel");
		cancelButton.setForeground(ColorConstants.DEF_COLOR);
		cancelButton.setBounds(185, 254, 106, 26);
		panel.add(cancelButton);

		txtAttempts = new JTextField();
		txtAttempts.setForeground(ColorConstants.DEF_COLOR);
		txtAttempts.setBounds(184, 81, 158, 20);
		panel.add(txtAttempts);

		final JButton button = new JxButton(0.4f);
		button.setBorder(new LineBorder(ColorConstants.BORDER_COL, 1, false));
		button.setFont(new Font("", Font.BOLD, 12));
		button.setFont(new Font("", Font.BOLD, 14));
		button.setForeground(ColorConstants.DEF_COLOR);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				PanelLockStatus lockstatus = new PanelLockStatus(SwingUtils
						.getSelectedButton(buttonGroup));
				SwingUtils.center(lockstatus);
				lockstatus.setModal(true);
				lockstatus.setVisible(true);
			}
		});
		button.setBackground(Color.WHITE);
		button.setText("+");
		button.setBounds(183, 212, 26, 24);
		panel.add(button);

		final JLabel clickHereToLabel = new JLabel();
		clickHereToLabel.setForeground(ColorConstants.DEF_COLOR);
		clickHereToLabel.setText("Click Here To See The Status");
		clickHereToLabel.setBounds(10, 212, 174, 16);
		panel.add(clickHereToLabel);

		final JLabel customPasswordSettingLabel = new JLabel();
		customPasswordSettingLabel.setFont(new Font("", Font.BOLD, 22));
		customPasswordSettingLabel.setForeground(ColorConstants.DEF_COLOR);
		customPasswordSettingLabel.setText("Custom Password Setting");
		customPasswordSettingLabel.setBounds(48, 22, 272, 34);
		panel.add(customPasswordSettingLabel);
		doUpdate();
	}

	// public static void main(String args[]){
	// JFrame frm=new JFrame("Password Settings");
	// frm.setSize(new Dimension(400,300));
	// frm.setVisible(true);
	// frm.getContentPane().add(new PanelPasswordSetting());
	// SwingUtils.wrapInFrame(new PanelPasswordSetting(),
	// "Password Setings").setVisible(true);
	// PanelPasswordSetting setting=new PanelPasswordSetting();
	// setting.setBackground(Color.WHITE);
	// setting.setSize(new Dimension(380,450));
	// setting.setVisible(true);
	// }
	public void doUpdate() {
		try {
			PasswordSetting ps = MedrexClientManager.getInstance()
					.getPasswordSetting();
			if (ps != null) {
				txtAttempts.setText(ps.getNoOfAttempts() + "");
				if (ps.getMaximumDays() == 0) {
					cmbMaxDays.setSelectedItem("unlimited");
				}
				cmbMaxDays.setSelectedItem(ps.getMaximumDays() + "");
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

}
