package medrex.server.exceptionHandler;

import medrex.commons.enums.LoggerAction;
import medrex.commons.enums.LoggerCriticality;
import medrex.commons.enums.LoggerModule;
import medrex.commons.enums.LoggerType;
import medrex.server.Logger.Logger;

public class ExceptionHandler {
	public static ExceptionHandler excHandler = null;
	public static boolean stackTraceOn = true;

	public static synchronized ExceptionHandler getInstance() {
		if (excHandler == null) {
			excHandler = new ExceptionHandler();
		}
		return excHandler;
	}

	public synchronized void handle(Exception exc,
			LoggerCriticality criticality, LoggerModule module,
			LoggerAction action, String message) {
		System.out.println("Handing Exception...");
		String excMessage = null;
		String stackTrace = null;
		stackTrace = stackTrace(exc);
		if (stackTraceOn) {
			excMessage = message + "\r" + exc.getMessage() + "\r" + stackTrace
					+ "\r\r";
		} else {
			excMessage = message + "\r" + exc.getMessage() + "\r\r";
		}
		Logger.getInstance().log(LoggerType.EXCEPTION,
				LoggerCriticality.WARNING, module, action, excMessage);
	}

	// public Populator getPopulator() {
	// return null;
	// }

	// public Throwable handle(JDBCConnectionException jd, Object... obj){
	// System.out.println("MySQL Connectin Exception...");
	// HibernateUtil.resetSessionFactory();
	// return new MedrexException("Error retrieving Residents Main Infomation");
	// }

	public synchronized String stackTrace(Exception exc) {
		StackTraceElement[] stackTraceElements = exc.getStackTrace();
		String msg = "";
		for (int i = 0; i < stackTraceElements.length; i++) {
			msg = msg + "\t at " + stackTraceElements[i].toString() + "\n";
		}
		return msg;
	}
}
