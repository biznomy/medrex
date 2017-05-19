package medrex.client.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Temp {

	private static final int BUFFER = 2048;

	public static void main(String args[]) {

		try {

			try {
				(new File("c:\\tmpzip\\")).mkdir();
			} catch (Exception e) {

			}

			unzip(new File("abc.zip"), new File("c:\\tmpzip\\"));

		} catch (Exception e) {

		}

	}

	public static File unzip(File inFile, File outFolder) {
		try {
			BufferedOutputStream out = null;
			ZipInputStream in = new ZipInputStream(new BufferedInputStream(
					new FileInputStream(inFile)));
			ZipEntry entry;
			while ((entry = in.getNextEntry()) != null) {
				// System.out.println("Extracting: " + entry);
				int count;
				byte data[] = new byte[BUFFER];

				// write the files to the disk
				out = new BufferedOutputStream(new FileOutputStream(outFolder
						.getPath()
						+ "/" + entry.getName()), BUFFER);

				while ((count = in.read(data, 0, BUFFER)) != -1) {
					out.write(data, 0, count);
				}
				cleanUp(out);
			}
			cleanUp(in);
			return outFolder;
		} catch (Exception e) {
			e.printStackTrace();
			return inFile;
		}
	}

	private static void cleanUp(InputStream in) throws Exception {
		in.close();
	}

	private static void cleanUp(OutputStream out) throws Exception {
		out.flush();
		out.close();
	}

}
