package medrex.commons.utils;

import java.io.File;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.commons.exception.MedrexException;

import com.enterprisedt.net.ftp.FileTransferClient;
import com.enterprisedt.net.ftp.WriteMode;

public class FTPStandaloneDownload {

	public static boolean downloadFile(String filename) {
		// extract command-line arguments
		String host = null;
		String username = null;
		String password = null;

		if (MedrexClientManager.selectedSource.equalsIgnoreCase("Internet")) {
			host = "ftp.symantra.com";
			username = "medrex@symantra.com";
			password = "medrex";
		} else if (MedrexClientManager.selectedSource
				.equalsIgnoreCase("Local Server")) {
			// host = "ftp.symantra.com";
			// username = "medrex@symantra.com";
			// password = "medrex";

			host = "ftp.symantra.com";
			username = "medrex@symantra.com";
			password = "medrex";
		}

		FileTransferClient ftp = null;

		try {
			// create client

			ftp = new FileTransferClient();

			// set remote host
			ftp.setRemoteHost(host);
			ftp.setUserName(username);
			ftp.setPassword(password);

			// set up listener

			// the transfer notify interval must be greater than buffer size
			ftp.getAdvancedSettings().setTransferBufferSize(500);
			ftp.getAdvancedSettings().setTransferNotifyInterval(1000);

			// connect to the server

			ftp.connect();

			try {
				new File("c:\\medrexstandalonetmp").mkdir();
			} catch (Exception e) {
				throw new MedrexException("");
			}

			try {
				new File("c:\\medrexstandalonetmp\\" + filename)
						.createNewFile();
			} catch (Exception e) {
				throw new MedrexException("");
			}

			// if
			// (MedrexClientManager.selectedSource.equalsIgnoreCase("Internet")){
			ftp.downloadFile("c:\\medrexstandalonetmp\\" + filename, filename,
					WriteMode.OVERWRITE);
			//
			ftp.disconnect();
			return true;

		} catch (Exception e) {
			// e.printStackTrace();
			// throw new MedrexException("");
			System.err.println("FTP Server not found !!!");
			return false;
		}
	}

}
