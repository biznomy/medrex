package medrex.client.main.alert;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.Calendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.PopUpView;

import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.toedter.calendar.JDateChooser;

public class PanelSuspendAdd extends PopUpView {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4739848192351884729L;
	private JxButton btnCancel;
	private JxButton btnSuspend;
	private JxComboBox cmbSuspendType;
	private JTextField txtSuspendTime;
	private JDateChooser dcDate;
	SpinnerDateModel model;
	final JSpinner spinner;
	private static final Color DEF_COLOR = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);

	public PanelSuspendAdd(final int serial) {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setSize(364, 270);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 363, 268);
		add(panel);

		final JLabel suspendAfterLabel = new JLabel();
		suspendAfterLabel.setForeground(DEF_COLOR);
		suspendAfterLabel.setFont(new Font("", Font.BOLD, 16));
		suspendAfterLabel.setText("Suspend This Alert");
		suspendAfterLabel.setBounds(96, 24, 172, 36);
		panel.add(suspendAfterLabel);

		dcDate = new JDateChooser();
		dcDate.setBorder(new LineBorder(SystemColor.desktop, 1, false));
		dcDate.setDateFormatString("MM/dd/yyyy");
		dcDate.setBounds(110, 78, 124, 21);
		dcDate.setVisible(false);
		panel.add(dcDate);

		final JLabel dateLabel = new JLabel();
		dateLabel.setForeground(DEF_COLOR);
		dateLabel.setText("Date");
		dateLabel.setBounds(24, 80, 66, 16);
		dateLabel.setVisible(false);
		panel.add(dateLabel);

		final JLabel timeLabel = new JLabel();
		timeLabel.setForeground(DEF_COLOR);
		timeLabel.setText("Time");
		timeLabel.setBounds(24, 118, 66, 16);
		timeLabel.setVisible(false);
		panel.add(timeLabel);

		model = new SpinnerDateModel();
		model.setCalendarField(Calendar.HOUR_OF_DAY);
		spinner = new JSpinner(model);
		spinner.setBounds(110, 116, 106, 20);
		spinner.setVisible(false);
		panel.add(spinner);
		JSpinner.DateEditor editor = new JSpinner.DateEditor(spinner, "hh:mm a");
		spinner.setEditor(editor);

		final JLabel suspendAfterLabel_1 = new JLabel();
		suspendAfterLabel_1.setForeground(DEF_COLOR);
		suspendAfterLabel_1.setText("Suspend for the Next");
		suspendAfterLabel_1.setBounds(24, 156, 195, 16);
		panel.add(suspendAfterLabel_1);

		btnSuspend = new JxButton();
		btnSuspend.setArc(0.4f);
		btnSuspend.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (JOptionPane.showConfirmDialog(null,
						"This is Irreversible process.\n" + "Are you Sure",
						"Message", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					doSuspend(serial);
					close();
				}

			}
		});
		btnSuspend.setText("Suspend");
		btnSuspend.setBackground(Color.WHITE);
		btnSuspend.setForeground(DEF_COLOR);
		btnSuspend.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnSuspend.setFont(new Font("", Font.BOLD, 12));
		btnSuspend.setBounds(59, 232, 106, 26);
		panel.add(btnSuspend);

		btnCancel = new JxButton();
		btnCancel.setArc(0.4f);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		btnCancel.setText("Cancel");
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setForeground(DEF_COLOR);
		btnCancel.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.setBounds(202, 232, 106, 26);
		panel.add(btnCancel);

		txtSuspendTime = new JTextField();
		txtSuspendTime.setBounds(59, 184, 91, 21);
		txtSuspendTime.setForeground(DEF_COLOR);
		txtSuspendTime.setBorder(new LineBorder(DEF_COLOR, 1, false));
		panel.add(txtSuspendTime);

		cmbSuspendType = new JxComboBox();
		cmbSuspendType.setArc(0.4f);
		cmbSuspendType.setForeground(DEF_COLOR);
		cmbSuspendType.setBackground(Color.WHITE);
		cmbSuspendType.setBounds(170, 184, 85, 21);
		cmbSuspendType.setBorder(new LineBorder(DEF_COLOR, 1, false));
		cmbSuspendType.setModel(new DefaultComboBoxModel(new String[] {
				"MINUTE", "HOUR", "DAY", "MONTH" }));
		panel.add(cmbSuspendType);

		doLoad();
	}

	protected void doSuspend(int serial) {
		int time = Integer.parseInt(txtSuspendTime.getText());
		String type = cmbSuspendType.getSelectedItem().toString();
		try {
			MedrexClientManager.getInstance().suspendAlert(serial, time, type);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void doLoad() {

	}

	@Override
	public String getTitle() {
		return "Suspend Add";
	}

}
