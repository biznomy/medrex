package medrex.client.main.physicanOrders;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

import medrex.client.clientManagar.MedrexClientManager;

class TimeStrComparator implements Comparator {
	public static SimpleDateFormat TIME_FORMATTER = new SimpleDateFormat(
			"hh:mm a");

	// +1 if a > b
	// 0 if a == b
	// -1 if a < b
	public final int compare(Object a, Object b) {
		Date aDate = getStringToTime((String) a);
		Date bDate = getStringToTime((String) b);
		if (aDate.getTime() == bDate.getTime()) {
			return 0;
		} else
			return (aDate.getTime() > bDate.getTime()) ? 1 : -1;
	} // end compare

	public static Date getStringToTime(String str) {
		if (str.length() == 8) {
			Date dateRef = MedrexClientManager.getServerTime();
			int hrs = Integer.parseInt(str.substring(0, 2));
			if (hrs == 12) {
				hrs = 0;
			}
			if (str.charAt(6) == 'P') {
				hrs += 12;
			}
			dateRef.setHours(hrs);
			dateRef.setMinutes((Integer.parseInt(str.substring(3, 5))));
			dateRef.setSeconds(0);
			return dateRef;
		}
		return null;
	}
} // end class StringComparator

