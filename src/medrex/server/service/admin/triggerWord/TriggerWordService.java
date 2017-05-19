package medrex.server.service.admin.triggerWord;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.TriggerWord;
import medrex.commons.vo.others.Users;
import medrex.server.dao.admin.triggerWord.TriggerWordDAO;
import medrex.server.service.others.UserService;

public class TriggerWordService {

	public int insertOrUpdateTriggerWord(TriggerWord tw) throws MedrexException {
		return (TriggerWordDAO.getInstance().insertOrUpdateTriggerWord(tw));
	}

	public TriggerWord getTriggerWord(int serial) throws MedrexException {
		return (TriggerWordDAO.getInstance().getTriggerWord(serial));
	}

	public List<TriggerWord> getAllTriggerWords() throws MedrexException {
		return (TriggerWordDAO.getInstance().getAllTriggerWords());
	}

	public void deleteTriggerWord(int id) throws MedrexException {
		TriggerWordDAO.getInstance().deleteTriggerWord(id);
	}

	public List getTriggerWordList() throws MedrexException {
		// TODO Auto-generated method stub
		return TriggerWordDAO.getInstance().getTriggerWordList();
	}

	public List<Users> getUsersAccordingToTriggerWords(String triggerWords)
			throws MedrexException {
		List<Users> usersList = new ArrayList<Users>();
		StringTokenizer stk = new StringTokenizer(triggerWords);
		String temp = null;
		while (stk.hasMoreElements()) {
			String str = stk.nextToken(", ");
			TriggerWord tw = TriggerWordDAO.getInstance()
					.getUsersAccordingToTriggerWords(str);
			if (tw != null) {
				if (tw.getRecieverUsers() != null) {
					if (temp == null) {
						temp = tw.getRecieverUsers() + ", ";
					} else {
						temp += tw.getRecieverUsers() + ", ";
					}

				}
				if (tw.getRecieverDepartment() != null) {
					if (temp == null) {
						temp = tw.getRecieverDepartment() + ", ";
					} else {
						temp += tw.getRecieverDepartment() + ", ";
					}
				}
			}
		}
		StringTokenizer st = new StringTokenizer(temp);
		while (st.hasMoreElements()) {
			String strId = st.nextToken(", ");
			if (!strId.equalsIgnoreCase("")) {
				int usersId = Integer.parseInt(strId);
				Users user = new UserService().getUser(usersId);
				System.out.println("user: " + user.getSerial());
				usersList.add(user);
			}
		}
		return usersList;
	}

	public List<TriggerWord> getTriggerWordCreatedAndModifiedDate(
			String triggerWords) throws MedrexException {
		List<TriggerWord> twList = new ArrayList<TriggerWord>();
		StringTokenizer stk = new StringTokenizer(triggerWords);
		while (stk.hasMoreTokens()) {
			TriggerWord tw = TriggerWordDAO.getInstance()
					.getUsersAccordingToTriggerWords(stk.nextToken(", "));
			twList.add(tw);
		}
		return twList;
	}

}
