package medrex.client.utils.controls;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.utils.SwingUtils;

public class DateTimePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5115141689381697241L;
	private Timer updater;
	private SimpleDateFormat formatter;

	private Date currentDate;
	private boolean autoUpdate;
	private String dateFormat;
	private String timeFormat;
	private JLabel lblDate;
	private JLabel lblTime;

	public DateTimePanel() {
		super();
		setOpaque(false);
		setLayout(null);
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent arg0) {
				doUpdate();
			}
		});
		setPreferredSize(new Dimension(200, 100));

		lblDate = new JLabel();
		lblDate.setVerticalAlignment(SwingConstants.BOTTOM);
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setText("Date Label");
		add(lblDate);

		lblTime = new JLabel();
		lblTime.setVerticalAlignment(SwingConstants.TOP);
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setText("Time Label");
		add(lblTime);

		dateFormat = "MMM dd, yyyy";
		timeFormat = "hh:mm:ss a";

		formatter = new SimpleDateFormat();

		updater = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				updateTime();
			}
		});
		updater.setRepeats(true);

		setAutoUpdate(true);
		updateTime();
	}

	protected void doUpdate() {
		Dimension size = SwingUtils.getComponentSize(this);
		int w = size.width;
		int h = size.height;

		lblDate.setBounds(0, 0, w, h / 2);
		lblTime.setBounds(0, h / 2, w, h / 2);
	}

	public synchronized void updateTime() {
		currentDate = MedrexClientManager.getServerTime();
		formatter.applyPattern(dateFormat);
		String date = formatter.format(currentDate);
		formatter.applyPattern(timeFormat);
		String time = formatter.format(currentDate);

		lblDate.setText(date);
		lblTime.setText(time);
	}

	/**
	 * @return the currentDate
	 */
	public Date getCurrentDate() {
		return currentDate;
	}

	/**
	 * @param currentDate
	 *            the currentDate to set
	 */
	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}

	/**
	 * @return the autoUpdate
	 */
	public boolean isAutoUpdate() {
		return autoUpdate;
	}

	/**
	 * @param autoUpdate
	 *            the autoUpdate to set
	 */
	public void setAutoUpdate(boolean autoUpdate) {
		this.autoUpdate = autoUpdate;
		if (autoUpdate) {
			// updater.setInitialDelay((60 -
			// MedrexClientManager.getServerTime().getSeconds()) * 1000);
			updater.start();
		} else {
			updater.stop();
		}
	}

	/**
	 * @return the dateFormat
	 */
	public String getDateFormat() {
		return dateFormat;
	}

	/**
	 * @param dateFormat
	 *            the dateFormat to set
	 */
	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}

	/**
	 * @return the timeFormat
	 */
	public String getTimeFormat() {
		return timeFormat;
	}

	/**
	 * @param timeFormat
	 *            the timeFormat to set
	 */
	public void setTimeFormat(String timeFormat) {
		this.timeFormat = timeFormat;
	}

	@Override
	public void setFont(Font f) {
		super.setFont(f);

		if (lblDate != null && lblTime != null) {
			lblDate.setFont(f);
			lblTime.setFont(f);
		}
	}

	@Override
	public void setForeground(Color fg) {
		super.setForeground(fg);

		if (lblDate != null && lblTime != null) {
			lblDate.setForeground(fg);
			lblTime.setForeground(fg);
		}
	}

	public static void main(String[] args) {
		SwingUtils.wrapInFrame(new DateTimePanel()).setVisible(true);
	}
}
