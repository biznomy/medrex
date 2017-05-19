package medrex.server.report;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;

import org.apache.commons.codec.binary.Base64;

import com.sun.mail.pop3.POP3Message;

public class ReadAttachment {

	public static List<String> getMails(String host, String user,
			String password) throws NoSuchProviderException,
			MessagingException, IOException {

		// Get system properties
		Properties properties = System.getProperties();

		// Get the default Session object.
		Session session = Session.getDefaultInstance(properties);

		// Get a Store object that implements the specified protocol.
		Store store = session.getStore("pop3");
		store.connect(host, user, password);

		//
		Folder folder = store.getFolder("inbox");

		// Open the Folder.
		folder.open(Folder.READ_WRITE);

		Message[] message = folder.getMessages();
		List<String> mailAttachments = new ArrayList<String>();
		for (int a = 0; a < message.length; a++) {
			System.out.println("messages:" + message[a]);
			POP3Message msg = (POP3Message) message[a];
			BufferedReader br = new BufferedReader(new InputStreamReader(msg
					.getInputStream()));
			String content = "";
			while (br.ready()) {
				content += br.readLine();
			}
			if (content.contains("<html>")) {
				content = content.substring(content.indexOf("<html>"), content
						.lastIndexOf("</html>"));
			}
			if (content.contains("base64")) {
				// for thunder world
				if (content.contains("base64Content-Disposition")) {
					content = content.substring(703, content
							.lastIndexOf("----------"));
				}
				// for gmail
				if (content.contains("base64X-Attachment-Id")) {
					System.out.println("gmail =========");
					content = content.substring(483);
				}
				byte[] decoded = Base64.decodeBase64(content.getBytes());
				content = new String(decoded);
			}

			// FileWriter f = new FileWriter(new File("mail/" +
			// String.format("%05d", new Date().getTime()) + ".txt"));
			// f.write(decodedString);
			// f.close();
			message[a].setFlag(Flags.Flag.DELETED, true);
			if (content.contains("c_reportStandard")) {
				// System.out.println("attachment found");
				mailAttachments.add(content);
			}

		}

		folder.close(true);
		store.close();
		return mailAttachments;
	}
}
