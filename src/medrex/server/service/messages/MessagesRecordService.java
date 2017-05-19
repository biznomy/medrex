package medrex.server.service.messages;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.messages.MessagesRecord;
import medrex.commons.vo.others.Users;
import medrex.server.dao.messages.MessagesRecordDAO;

public class MessagesRecordService {

	public void insertOrUpdateMessagesRecord(MessagesRecord messagesRecord)
			throws MedrexException {
		MessagesRecordDAO.getInstance().insertOrUpdateMessagesRecord(
				messagesRecord);
	}

	public int insertOrUpdateMessagesRecord(MessagesRecord messagesRecord,
			List<Users> rUsers) throws MedrexException {
		return MessagesRecordDAO.getInstance().insertOrUpdateMessagesRecord(
				messagesRecord, rUsers);
	}

	public List getMessagesRecords(int residentSerial) throws MedrexException {
		return (MessagesRecordDAO.getInstance()
				.getMessagesRecords(residentSerial));
	}

	public List getMessagesRecords() throws MedrexException {
		return (MessagesRecordDAO.getInstance().getMessagesRecords());
	}

	public MessagesRecord getMessagesRecord(int serial) throws MedrexException {
		return (MessagesRecordDAO.getInstance().getMessagesRecord(serial));
	}

	public void deleteMessagesRecord(int serial) throws MedrexException {
		MessagesRecordDAO.getInstance().deleteMessagesRecord(serial);
	}

	public int getTotalMessage(int currentLoggedInUserKey)
			throws MedrexException {
		return MessagesRecordDAO.getInstance().getTotalMessage(
				currentLoggedInUserKey);
	}

	public int getTriggerWordMailCount(int currentLoggedInUserKey)
			throws MedrexException {
		return MessagesRecordDAO.getInstance().getTriggerWordMailCount(
				currentLoggedInUserKey);
	}

}
