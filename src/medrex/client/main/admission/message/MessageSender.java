package medrex.client.main.admission.message;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.messages.MessagesRecord;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.resident.ResidentMain;

import com.jgoodies.validation.ValidationResult;

public class MessageSender {
	public MessageSender() {
	}

	/**
	 * method to get the user id set of specified department
	 * 
	 * @return the set of UserIds with specified Department
	 */
	public static Set<Integer> getRecievers(String department) {
		Set<Integer> receivers = new HashSet<Integer>();
		List<Users> users = null;
		try {
			users = MedrexClientManager.getInstance()
					.getUserListFromDepartment(department);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String receiverIds = "";
		for (Users user : users) {
			receiverIds = receiverIds + user.getSerial() + ",";
		}

		if (receiverIds != null && receiverIds.length() > 0) {
			String[] rIds = receiverIds.split(",");
			for (String rId : rIds) {
				int id = Integer.parseInt(rId.trim());

				receivers.add(id);
			}
		}
		return receivers;
	}

	/**
	 * it is a generic method to send messages to the concerned department
	 * 
	 * @param vResList
	 *            - List Of Validation Result
	 * @param formName
	 *            - Form Name for Which the alert has to be generated.
	 * @param recieverDepartment
	 * 
	 */
	public static void sendMessage(List<ValidationResult> vResList,
			String formName, String recieverDepartment) {

		ResidentMain resident = null;
		try {
			resident = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
		} catch (Exception e) {
			e.printStackTrace();
		}

		/* Creating Alert Messages */

		String header = "";
		header += "<B>" + formName + "</B><BR/>";
		if (resident != null) {
			header += "<B>Resident:</B> ";
			header += resident.getUserPass() + ", " + resident.getUserName();
			header += "<BR/>";
		}
		header += "<BR/><HR/>";
		header += "<BR/>";

		String footer = "";
		footer += "<BR/><HR/>";
		footer += "<BR/>";
		footer += "<B>User:</B> " + Global.currentLoggedInUserName + "<BR/>";
		footer += "<B>Date:</B> " + MedrexClientManager.getServerTime();

		Set<Integer> recievers = getRecievers(recieverDepartment);
		for (ValidationResult res : vResList) {
			boolean hasErrors = res.hasWarnings();
			if (hasErrors) {
				Iterator<Integer> it = recievers.iterator();
				while (it.hasNext()) {
					Integer id = it.next();
					MessagesRecord msgRec = new MessagesRecord();
					msgRec.setNew(true);
					msgRec.setMessage("<div style='padding:10px;'>" + header
							+ res.getMessagesText() + footer + "</div>");
					msgRec.setReceiverId(id);
					msgRec.setType("Alert");
					msgRec.setSenderId(Global.currentLoggedInUserKey);
					msgRec.setSubject(formName);
					msgRec.setTimeRecord(MedrexClientManager.getServerTime());

					try {
						MedrexClientManager.getInstance()
								.insertOrUpdateMessagesRecord(msgRec);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

}
