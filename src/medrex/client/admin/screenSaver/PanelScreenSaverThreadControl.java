package medrex.client.admin.screenSaver;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;

import javax.swing.Timer;

import medrex.client.FrameLogin;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.Config;

import com.sX.frameFactory.FrameFactory;
import com.sun.jna.Native;
import com.sun.jna.Structure;
import com.sun.jna.win32.StdCallLibrary;

/**
 * Utility method to retrieve the idle time on Windows and sample code to test
 * it. JNA shall be present in your classpath for this to work (and compile).
 * 
 * @author ochafik
 */
public class PanelScreenSaverThreadControl {
	private int time;
	private Timer screenSaver;
	private boolean isMatch;
	private static final int DEF_TIME = 5;

	public PanelScreenSaverThreadControl() throws RemoteException,
			MedrexException {
		int time2 = readFile();
		if (time2 != 0) {
			setTime(time2);
		} else {
			setTime(DEF_TIME);
		}
		isMatch = false;
		screenSaver = new Timer(1000 * 60, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// runThread();
			}
		});
		// screenSaver.setRepeats(true);
		// screenSaver.start();
	}

	public int readFile() throws RemoteException, MedrexException {
		int time1 = 0;
		Config config = MedrexClientManager.getInstance()
				.getScreenSaverConfig();
		time1 = Integer.parseInt(config.getConfigValue());
		return time1;
	}

	public interface Kernel32 extends StdCallLibrary {
		Kernel32 INSTANCE = (Kernel32) Native.loadLibrary("kernel32",
				Kernel32.class);

		/**
		 * Retrieves the number of milliseconds that have elapsed since the
		 * system was started.
		 * 
		 * @see http://msdn2.microsoft.com/en-us/library/ms724408.aspx
		 * @return number of milliseconds that have elapsed since the system was
		 *         started.
		 */
		public int GetTickCount();
	};

	public interface User32 extends StdCallLibrary {
		User32 INSTANCE = (User32) Native.loadLibrary("user32", User32.class);

		/**
		 * Contains the time of the last input.
		 * 
		 * @see http 
		 *      ://msdn.microsoft.com/library/default.asp?url=/library/en-us/
		 *      winui/winui/windowsuserinterface/userinput/keyboardinput/
		 *      keyboardinputreference/keyboardinputstructures/lastinputinfo.asp
		 */
		public static class LASTINPUTINFO extends Structure {
			public int cbSize = 8;

			// / Tick count of when the last input event was received.
			public int dwTime;
		}

		/**
		 * Retrieves the time of the last input event.
		 * 
		 * @see http 
		 *      ://msdn.microsoft.com/library/default.asp?url=/library/en-us/
		 *      winui/winui/windowsuserinterface/userinput/keyboardinput/
		 *      keyboardinputreference
		 *      /keyboardinputfunctions/getlastinputinfo.asp
		 * @return time of the last input event, in milliseconds
		 */
		public boolean GetLastInputInfo(LASTINPUTINFO result);
	};

	/**
	 * Get the amount of milliseconds that have elapsed since the last input
	 * event (mouse or keyboard)
	 * 
	 * @return idle time in milliseconds
	 */
	public static int getIdleTimeMillisWin32() {
		User32.LASTINPUTINFO lastInputInfo = new User32.LASTINPUTINFO();
		User32.INSTANCE.GetLastInputInfo(lastInputInfo);
		return Kernel32.INSTANCE.GetTickCount() - lastInputInfo.dwTime;
	}

	enum State {
		UNKNOWN, ONLINE, IDLE, AWAY
	};

	public static void main(String[] args) {

	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public synchronized void runThread() {
		// System.out.println("Set time is :" + Global.currentScreenSaverTime);
		if (getTime() != 0) {
			State state = State.UNKNOWN;
			new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");

			// for (;;) {
			int idleSec = getIdleTimeMillisWin32() / 1000;

			State newState = idleSec < getTime() * 60 ? State.ONLINE
					: idleSec > 1 * 60 ? State.AWAY : State.IDLE;

			if (newState != state) {
				state = newState;
				// System.out.println(dateFormat.format(MedrexClientManager.getServerTime())
				// + " # "
				// + state);
				// System.out.println("Idle seconds :" + idleSec);

				if (state == State.AWAY) {
					if (!isMatch && idleSec > 60 + 1) {
						System.out.println("logoff");
						FrameFactory.closeAll();
						FrameLogin fLogin = (FrameLogin) FrameFactory
								.createWindowOfType(FrameLogin.class);
						fLogin.setVisible(true);
						if (Global.frameMainDesktopTmp != null) {
							Global.frameMainDesktopTmp.dispose();
						}
						isMatch = true;
					}
				}
			}
			try {
				Thread.sleep(1000);
			} catch (Exception ex) {
			}
			// }
		}
	}

}