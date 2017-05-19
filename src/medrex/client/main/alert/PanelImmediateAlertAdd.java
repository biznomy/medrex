package medrex.client.main.alert;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.alert.Alert;

import com.sX.swing.JxButton;
import com.toedter.calendar.JDateChooser;

public class PanelImmediateAlertAdd extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2588912394717508618L;
	private JxButton btnCancel;
	private JxButton btnOk;
	private JDateChooser dcDate;
	private JRadioButton rbTimeStamp;
	private JRadioButton rbImmediate;
	private static final Color DEF_COLOR = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);
	private ButtonGroup bgImmediateAlertType = new ButtonGroup();
	private String result = "";
	private Date times;
	private Date date;
	SpinnerDateModel model;
	final JSpinner spinner;

	@Override
	public String getTitle() {
		return "Add Immediate Alert";
	}

	public PanelImmediateAlertAdd() {
		super();
		setLayout(null);
		setSize(362, 180);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 361, 191);
		add(panel);

		final JLabel alertTypeLabel = new JLabel();
		alertTypeLabel.setText("Alert Type");
		alertTypeLabel.setBounds(26, 38, 75, 14);
		alertTypeLabel.setFont(new Font("", Font.BOLD, 12));
		alertTypeLabel.setForeground(DEF_COLOR);
		panel.add(alertTypeLabel);

		rbImmediate = new JRadioButton();
		rbImmediate.setActionCommand("1");
		rbImmediate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				dcDate.setEnabled(false);
				spinner.setEnabled(false);
			}
		});
		rbImmediate.setBackground(Color.WHITE);
		rbImmediate.setText("Immediate");
		rbImmediate.setBounds(107, 34, 99, 22);
		rbImmediate.setFont(new Font("", Font.BOLD, 12));
		rbImmediate.setForeground(DEF_COLOR);
		bgImmediateAlertType.add(rbImmediate);
		panel.add(rbImmediate);

		rbTimeStamp = new JRadioButton();
		rbTimeStamp.setActionCommand("2");
		rbTimeStamp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				dcDate.setEnabled(true);
				spinner.setEnabled(true);
			}
		});
		rbTimeStamp.setBackground(Color.WHITE);
		rbTimeStamp.setText("Time Stamp");
		rbTimeStamp.setFont(new Font("", Font.BOLD, 12));
		rbTimeStamp.setForeground(DEF_COLOR);
		rbTimeStamp.setBounds(212, 34, 95, 22);
		bgImmediateAlertType.add(rbTimeStamp);
		panel.add(rbTimeStamp);

		btnOk = new JxButton();
		btnOk.setArc(0.4f);
		btnOk.setBackground(Color.WHITE);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				setString("Yes");
				if (Integer.parseInt(bgImmediateAlertType.getSelection()
						.getActionCommand()) == 2) {
					setTimeStampValues();
				}
				close();
			}
		});
		btnOk.setText("Ok");
		btnOk.setFont(new Font("", Font.BOLD, 12));
		btnOk.setForeground(DEF_COLOR);
		btnOk.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnOk.setBounds(75, 145, 73, 24);
		panel.add(btnOk);

		btnCancel = new JxButton();
		btnCancel.setArc(0.4f);
		btnCancel.setBackground(Color.WHITE);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				setString("No");
				close();
			}
		});
		btnCancel.setText("Cancel");
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.setForeground(DEF_COLOR);
		btnCancel.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnCancel.setBounds(176, 145, 73, 24);
		panel.add(btnCancel);

		final JLabel dateLabel = new JLabel();
		dateLabel.setText("Date");
		dateLabel.setBounds(26, 75, 31, 14);
		dateLabel.setFont(new Font("", Font.BOLD, 12));
		dateLabel.setForeground(DEF_COLOR);
		panel.add(dateLabel);

		dcDate = new JDateChooser();
		dcDate.setBounds(75, 70, 150, 24);
		dcDate.setBorder(new LineBorder(SystemColor.desktop, 1, false));
		dcDate.setDateFormatString("MM/dd/yyyy");
		panel.add(dcDate);

		final JLabel timeLabel = new JLabel();
		timeLabel.setText("Time");
		timeLabel.setBounds(26, 109, 31, 14);
		timeLabel.setFont(new Font("", Font.BOLD, 12));
		timeLabel.setForeground(DEF_COLOR);
		panel.add(timeLabel);

		model = new SpinnerDateModel();
		model.setCalendarField(Calendar.HOUR_OF_DAY);
		spinner = new JSpinner(model);
		spinner.setBounds(75, 107, 106, 20);
		panel.add(spinner);
		JSpinner.DateEditor editor = new JSpinner.DateEditor(spinner, "hh:mm a");
		spinner.setEditor(editor);

		doLoad();
	}

	protected void setTimeStampValues() {
		times = (Date) spinner.getValue();
		date = dcDate.getDate();
	}

	public Date getTimes() {
		return this.times;
	}

	public Date getDate() {
		return this.date;
	}

	private void doLoad() {
		Date date = MedrexClientManager.getServerTime();
		SimpleDateFormat simpleFormat = new SimpleDateFormat("MM/dd/yyyy");
		simpleFormat.format(date);
		dcDate.setDate(date);
		if (Global.currentAlertKey != 0) {
			Alert alert = new Alert();
			try {
				alert = MedrexClientManager.getInstance().getAlertRecord(
						Global.currentAlertKey);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MedrexException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (alert.getImmediateAlertType() == 2) {
				rbTimeStamp.setSelected(true);
				dcDate.setEnabled(true);
				dcDate.setDate(alert.getBeginDate());
				spinner.setValue(alert.getStartTime());
			} else {
				rbImmediate.setSelected(true);
				dcDate.setEnabled(false);
				spinner.setEnabled(false);
			}
		} else {
			rbImmediate.setSelected(true);
			dcDate.setEnabled(false);
			spinner.setEnabled(false);
		}

	}

	public String getString() {
		return result;
	}

	public void setString(String str) {
		result = str;
	}

	public String getButtonGroup() {
		return bgImmediateAlertType.getSelection().getActionCommand();
	}

}
