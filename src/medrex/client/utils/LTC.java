package medrex.client.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import medrex.client.clientManagar.MedrexClientManager;

public class LTC {

	public static ArrayList getRoomNumbers() {
		ArrayList roomNumbers = new ArrayList();

		roomNumbers.add("501");
		roomNumbers.add("502");
		roomNumbers.add("503");
		roomNumbers.add("504");
		roomNumbers.add("601");
		roomNumbers.add("602");
		roomNumbers.add("603");
		roomNumbers.add("604");
		roomNumbers.add("701");
		roomNumbers.add("702");
		roomNumbers.add("703");
		roomNumbers.add("704");
		roomNumbers.add("801");
		roomNumbers.add("802");
		roomNumbers.add("803");
		roomNumbers.add("804");
		return roomNumbers;
	}

	public static String[] getRooms(String thisRoom) {
		ArrayList freeRooms = new ArrayList();
		ArrayList totalRooms = getRoomNumbers();
		List residents = null;
		try {
			// residents =
			// ResidentInformationDAO.getInstance().getResidentMain();
			residents = MedrexClientManager.getInstance().getResidentMain();
		} catch (Exception e) {

		}
		String roomNumber;

		Iterator i = totalRooms.iterator();

		while (i.hasNext()) {
			roomNumber = (String) i.next();
			Boolean flag = false;
			Iterator ir = residents.iterator();
			while (ir.hasNext()) {
				/* TODO: Migrating to room history */
				// if (resi.getRoom().trim().equalsIgnoreCase(roomNumber)) {
				flag = true;
				break;
				// }
			}
			if (!flag) {
				freeRooms.add(roomNumber);
			}
		}

		if (!thisRoom.trim().equalsIgnoreCase("")) {
			freeRooms.add(thisRoom);
		}

		String[] freeRoomNums = new String[freeRooms.size()];

		for (int ii = 0; ii < freeRoomNums.length; ii++) {
			freeRoomNums[ii] = (String) freeRooms.get(ii);
		}

		return freeRoomNums;

	}

	public static void copyfile(String srFile, String dtFile) {
		try {
			File f1 = new File(srFile);
			File f2 = new File(dtFile);
			InputStream in = new FileInputStream(f1);

			// For Append the file.
			// OutputStream out = new FileOutputStream(f2,true);

			// For Overwrite the file.
			OutputStream out = new FileOutputStream(f2);

			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			in.close();
			out.close();
			System.out.println("File copied.");
		} catch (FileNotFoundException ex) {
			System.out
					.println(ex.getMessage() + " in the specified directory.");
			System.exit(0);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
