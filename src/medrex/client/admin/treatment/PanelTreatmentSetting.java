package medrex.client.admin.treatment;

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
import javax.swing.SwingConstants;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.alert.AlertSetting;

public class PanelTreatmentSetting extends JDialog {
	private JComboBox cmbTimeType;
	private JTextField txtTimeValue;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtGenValue;
	private JComboBox cmbGenType;
	private JButton btnSave;
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);

	public PanelTreatmentSetting() {
		super();
		setLayout(null);
		setTitle("Medication Setting");
		setSize(327, 306);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 327, 300);
		add(panel);

		final JLabel medicationTimeSettingLabel = new JLabel();
		medicationTimeSettingLabel
				.setHorizontalAlignment(SwingConstants.CENTER);
		medicationTimeSettingLabel.setFont(new Font("", Font.BOLD, 16));
		medicationTimeSettingLabel.setText("Medication Time Setting");
		medicationTimeSettingLabel.setForeground(DEF_COL);
		medicationTimeSettingLabel.setBounds(10, 22, 300, 37);
		panel.add(medicationTimeSettingLabel);

		btnSave = new JButton();
		btnSave.setBackground(Color.WHITE);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (doSave()) {
					dispose();
				}
			}
		});
		btnSave.setText("Save");
		btnSave.setForeground(DEF_COL);
		btnSave.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnSave.setFont(new Font("", Font.BOLD, 12));
		btnSave.setBounds(111, 225, 94, 26);
		panel.add(btnSave);

		final JLabel generationTimeLimitLabel = new JLabel();
		generationTimeLimitLabel.setText("Auto Generation Time Limit");
		generationTimeLimitLabel.setBounds(70, 85, 188, 31);
		generationTimeLimitLabel.setForeground(DEF_COL);
		generationTimeLimitLabel.setFont(new Font("", Font.BOLD, 12));
		panel.add(generationTimeLimitLabel);

		txtGenValue = new JTextField();
		txtGenValue.setForeground(DEF_COL);
		txtGenValue.setFont(new Font("", Font.BOLD, 12));
		txtGenValue.setBounds(70, 122, 79, 21);
		panel.add(txtGenValue);

		cmbGenType = new JComboBox();
		cmbGenType.setBackground(Color.WHITE);
		cmbGenType.setBounds(171, 122, 87, 21);
		cmbGenType.setForeground(DEF_COL);
		cmbGenType.setFont(new Font("", Font.BOLD, 12));
		cmbGenType.setModel(new DefaultComboBoxModel(new String[] { "MINUTE",
				"HOUR", "DAY", "WEEK", "MONTH", "YEAR" }));
		panel.add(cmbGenType);

		final JLabel dailyTimeLimitLabel = new JLabel();
		dailyTimeLimitLabel.setText("Time Limit");
		dailyTimeLimitLabel.setForeground(DEF_COL);
		dailyTimeLimitLabel.setFont(new Font("", Font.BOLD, 12));
		dailyTimeLimitLabel.setBounds(70, 149, 188, 26);
		panel.add(dailyTimeLimitLabel);

		txtTimeValue = new JTextField();
		txtTimeValue.setBounds(70, 181, 79, 21);
		txtTimeValue.setForeground(DEF_COL);
		txtTimeValue.setFont(new Font("", Font.BOLD, 12));
		panel.add(txtTimeValue);

		cmbTimeType = new JComboBox();
		cmbTimeType.setBackground(Color.WHITE);
		cmbTimeType.setBounds(171, 181, 87, 21);
		cmbTimeType.setForeground(DEF_COL);
		cmbTimeType.setFont(new Font("", Font.BOLD, 12));
		cmbTimeType.setModel(new DefaultComboBoxModel(new String[] { "MINUTE",
				"HOUR", "DAY", "WEEK", "MONTH", "YEAR" }));
		panel.add(cmbTimeType);

		doLoad();
	}

	private void doLoad() {
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
			if (count == 4) {
				txtGenValue.setText(as.getTimeValue() + "");
				cmbGenType.setSelectedItem(as.getTimeType());
			}
			if (count == 5) {
				txtTimeValue.setText(as.getTimeValue() + "");
				cmbTimeType.setSelectedItem(as.getTimeType());
			}
		}
	}

	protected boolean doSave() {
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

		int count = 3;
		Iterator it = list.iterator();
		while (it.hasNext()) {
			count++;
			AlertSetting as = (AlertSetting) it.next();
			if (count == 4) {
				if (as == null) {
					as = new AlertSetting();
				}
				as.setSerial(4);
				as.setTimeValue(Integer.parseInt(txtGenValue.getText()));
				as.setTimeType(cmbGenType.getSelectedItem() + "");
				try {
					MedrexClientManager.getInstance()
							.insertOrUpdateAlertSetting(as);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (MedrexException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (count == 5) {
				if (as == null) {
					as = new AlertSetting();
				}
				as.setSerial(5);
				as.setTimeValue(Integer.parseInt(txtTimeValue.getText()));
				as.setTimeType(cmbTimeType.getSelectedItem() + "");
				try {
					MedrexClientManager.getInstance()
							.insertOrUpdateAlertSetting(as);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (MedrexException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return true;
	}

}
