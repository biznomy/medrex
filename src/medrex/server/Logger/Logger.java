package medrex.server.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import medrex.commons.enums.LoggerAction;
import medrex.commons.enums.LoggerCriticality;
import medrex.commons.enums.LoggerModule;
import medrex.commons.enums.LoggerType;

public class Logger {
	public static Boolean StdOutON = false;
	private static Logger logger = null;
	private static String logRootDirectory = "log/";

	private Logger() {
		File root = new File(logRootDirectory);
		if (!root.exists()) {
			root.mkdirs();

		}
	}

	public static synchronized Logger getInstance() {
		if (logger == null) {
			logger = new Logger();
		}
		return logger;
	}

	// OverLoaded Log Methods

	public synchronized void log(LoggerType type, LoggerCriticality critical,
			LoggerModule module, LoggerAction act, String message) {
		logAppender(type, critical, module, act, message);
	}

	public synchronized void log(LoggerCriticality criticality,
			LoggerModule module, LoggerAction act, String message) {
		log(LoggerType.DEBUG, criticality, module, act, message);
	}

	public synchronized void log(LoggerModule module, LoggerAction act,
			String message) {
		log(LoggerType.DEBUG, LoggerCriticality.INFORMATION, module, act,
				message);
	}

	public synchronized void log(LoggerAction act, String message) {
		log(LoggerType.DEBUG, LoggerCriticality.INFORMATION,
				LoggerModule.GENERAL, act, message);
	}

	public synchronized void log(String message) {
		log(LoggerType.DEBUG, LoggerCriticality.INFORMATION,
				LoggerModule.GENERAL, LoggerAction.GET, message);
	}

	private synchronized void logAppender(LoggerType type,
			LoggerCriticality critical, LoggerModule module, LoggerAction act,
			String message) {
		// SimpleDateFormat TimeFormat =new SimpleDateFormat();
		// TimeFormat.applyPattern("hh:mm:ss");
		// System.out.println("Time Before Wrilting On File:"+TimeFormat.format(new
		// Date()));
		PrintWriter pw = null;
		try {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			SimpleDateFormat df_File = new SimpleDateFormat("yyyy-MM-dd");
			pw = new PrintWriter(new FileWriter(logRootDirectory + "log" + type
					+ "-" + df_File.format(new Date()) + ".log", true));
			if (!(module == LoggerModule.MASTERLIST)) {
				pw.println(df.format(new Date()) + "\t" + type + "\t"
						+ critical + "\t" + module + "\t" + act + "\t"
						+ message);
				pw.flush();
			}
			if (StdOutON) {
				System.out.println(df.format(new Date()) + "" + type + "\t"
						+ critical + "\t" + module + "\t" + act + "\t"
						+ message);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// Close the PrintWriter
			if (pw != null)
				pw.close();
		}
		// System.out.println("Time After Wrilting On File:"+TimeFormat.format(new
		// Date()));
	}

	// public static void main(String arg[]) {
	// getInstance().log(LoggerType.DEBUG,LoggerCriticality.INFORMATION,LoggerModule.GENERAL,LoggerAction.GET,"myMessage");
	// }

}
