package medrex.server.threads;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import medrex.commons.exception.MedrexException;
import medrex.server.service.alert.CalculatedAlertService;

public class CalculateAlertThread {

	private Timer timer;
	private static TimerTask generateCalculatedAlertTask;
	private static final long MILLSECS_PER_SEC = 1000;
	private static final long MILLSECS_PER_MIN = 60 * MILLSECS_PER_SEC;
	private static final long MILLSECS_PER_HRS = 60 * MILLSECS_PER_MIN;
	private static final long MILLSECS_PER_DAY = 24 * MILLSECS_PER_HRS;

	private final Date START_DATE = getStartDate();

	private Date getStartDate() {
		Date date = null;
		DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			date = dfm.parse("2010-01-01 00:00:00");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public CalculateAlertThread() {
	}

	private void schedule() {
		timer.schedule(
				generateCalculatedAlertTask = generateCalculatedAlertTask(),
				START_DATE, MILLSECS_PER_DAY);
	}

	private TimerTask generateCalculatedAlertTask() {
		return new TimerTask() {
			@Override
			public void run() {
				try {
					new CalculatedAlertService()
							.generateCalculatedAlertAtFixTime();
				} catch (MedrexException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// System.out.println("Calculated Alert Thread is running: " +
				// START_DATE);
			}
		};
	}

	public void stop() {
		timer = null;
	}

	public void restart() {
		stop();
		start();
	}

	public void start() {
		if (timer == null) {
			timer = new Timer("CalculatedAlertThread", true);
			schedule();
		} else {
			throw new IllegalStateException(
					"CalculatedAlertThread is not Active yet. Try restart.");
		}
	}

}
