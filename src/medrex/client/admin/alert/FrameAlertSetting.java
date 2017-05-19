package medrex.client.admin.alert;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.Iterator;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.alert.AlertSetting;

public class FrameAlertSetting extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1918026787493099609L;
	private JTextField txtPastLimit;
	private JComboBox cmbPastLimit;
	private JComboBox cmbGenLimitType;
	private JTextField txtGenLimit;
	private JComboBox cmbTimeType;
	private JTextField txtAlertTime;
	private JButton btnCancel;
	private JButton btnSubmit;

	public FrameAlertSetting() {
		super();
		setBackground(Color.WHITE);
		setBounds(0, 0, 255, 350);
		setBackground(Color.WHITE);
		setTitle("Alert Settings");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		SwingUtils.center(this);
		setLayout(null);

		final JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 272, 350);

		final JLabel screenSaverSettingsLabel = new JLabel();
		screenSaverSettingsLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		screenSaverSettingsLabel.setBounds(67, 24, 113, 25);
		screenSaverSettingsLabel.setText("Alert Settings");
		screenSaverSettingsLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		panel.add(screenSaverSettingsLabel);

		final JLabel waitForLabel = new JLabel();
		waitForLabel.setText("Set time for upcoming Alert");
		waitForLabel.setBounds(37, 136, 168, 14);
		waitForLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		panel.add(waitForLabel);

		btnSubmit = new JButton();
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					if (doSave()) {
						dispose();
					}
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (MedrexException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				FrameAlertSetting.this.dispose();
			}
		});
		btnSubmit.setText("ok");
		btnSubmit.setFocusable(false);
		btnSubmit.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnSubmit.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnSubmit.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnSubmit.setFont(new Font("", Font.BOLD, 12));
		btnSubmit.setBounds(70, 285, 75, 21);
		panel.add(btnSubmit);

		txtAlertTime = new JTextField();
		txtAlertTime.setBounds(19, 171, 84, 23);
		panel.add(txtAlertTime);

		cmbTimeType = new JComboBox();
		cmbTimeType.setModel(new DefaultComboBoxModel(new String[] { "MINUTE",
				"HOUR", "DAY", "WEEK", "MONTH", "YEAR" }));
		cmbTimeType.setBounds(124, 171, 93, 23);
		panel.add(cmbTimeType);

		final JLabel setTimeForLabel = new JLabel();
		setTimeForLabel.setText("Set time for generated Alerts");
		setTimeForLabel.setBounds(35, 215, 168, 16);
		setTimeForLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		panel.add(setTimeForLabel);

		txtGenLimit = new JTextField();
		txtGenLimit.setBounds(15, 250, 87, 20);
		panel.add(txtGenLimit);

		cmbGenLimitType = new JComboBox();
		cmbGenLimitType.setBounds(120, 245, 93, 25);
		cmbGenLimitType.setModel(new DefaultComboBoxModel(new String[] { "DAY",
				"WEEK", "MONTH", "YEAR" }));
		panel.add(cmbGenLimitType);

		final JLabel setTimeForLabel_1 = new JLabel();
		setTimeForLabel_1.setText("Set time for previous alerts");
		setTimeForLabel_1.setBounds(37, 61, 168, 16);
		setTimeForLabel_1.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		panel.add(setTimeForLabel_1);

		txtPastLimit = new JTextField();
		txtPastLimit.setBounds(16, 96, 87, 20);
		panel.add(txtPastLimit);

		cmbPastLimit = new JComboBox();
		cmbPastLimit.setBounds(124, 94, 93, 25);
		cmbPastLimit.setModel(new DefaultComboBoxModel(new String[] { "MINUTE",
				"HOUR", "DAY", "WEEK", "MONTH", "YEAR" }));
		panel.add(cmbPastLimit);

		updateData();
	}

	private void updateData() {
		List list = null;
		try {
			list = MedrexClientManager.getInstance().getAlertSetting();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int count = 0;
		Iterator it = list.iterator();
		while (it.hasNext()) {
			count++;
			AlertSetting as = (AlertSetting) it.next();
			if (count == 1) {
				txtAlertTime.setText(as.getTimeValue() + "");
				cmbTimeType.setSelectedItem(as.getTimeType());
			}
			if (count == 2) {
				txtGenLimit.setText(as.getTimeValue() + "");
				cmbGenLimitType.setSelectedItem(as.getTimeType());
			}
			if (count == 3) {
				txtPastLimit.setText(as.getTimeValue() + "");
				cmbPastLimit.setSelectedItem(as.getTimeType());
			}
		}
	}

	protected boolean doSave() throws RemoteException, MedrexException {
		List list = null;
		try {
			list = MedrexClientManager.getInstance().getAlertSetting();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int count = 0;
		Iterator it = list.iterator();
		while (it.hasNext()) {
			count++;
			AlertSetting as = (AlertSetting) it.next();
			if (count == 1) {
				if (as == null) {
					as = new AlertSetting();
				}
				as.setSerial(1);
				as.setTimeValue(Integer.parseInt(txtAlertTime.getText()));
				as.setTimeType(cmbTimeType.getSelectedItem() + "");
				MedrexClientManager.getInstance()
						.insertOrUpdateAlertSetting(as);
			}
			if (count == 2) {
				if (as == null) {
					as = new AlertSetting();
				}
				as.setSerial(2);
				as.setTimeValue(Integer.parseInt(txtGenLimit.getText()));
				as.setTimeType(cmbGenLimitType.getSelectedItem() + "");
				MedrexClientManager.getInstance()
						.insertOrUpdateAlertSetting(as);
			}
			if (count == 3) {
				if (as == null) {
					as = new AlertSetting();
				}
				as.setSerial(3);
				as.setTimeValue(Integer.parseInt(txtPastLimit.getText()));
				as.setTimeType(cmbPastLimit.getSelectedItem() + "");
				MedrexClientManager.getInstance()
						.insertOrUpdateAlertSetting(as);
			}
		}
		return true;
	}
}
