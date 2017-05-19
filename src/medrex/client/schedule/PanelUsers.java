package medrex.client.schedule;

import java.awt.Color;
import java.awt.Dimension;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.mail.Flags.Flag;
import javax.swing.JPanel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.main.physicanOrders.PanelAddNewPhysician;
import medrex.client.schedule.ScheduleConstants.ScheduleMode;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.schedule.Schedule;
import medrex.commons.vo.schedule.UserSchedule;
import medrex.server.dao.schedule.UserScheduleDAO;

public class PanelUsers extends JPanel {

	PanelUsersRow panelUsersRow[];

	PanelUsers(String userTypes[], PanelTotals panelTotal) {
		
		setLayout(null);
		setBackground(Color.WHITE);

		List<Users> totalUsersList = PanelScheduleAdd.userList;
		List<Users> subsetUsers = new ArrayList<Users>();
		Iterator<Users> it = totalUsersList.iterator();
		while (it.hasNext()) {
			Users user = it.next();
			boolean flag = false;
			for (int j = 0; j < userTypes.length; j++) {
				if (userTypes[j].equalsIgnoreCase(user.getUserType())) {
					flag = true;
					break;
				}
			}
			if (flag) {
				subsetUsers.add(user);
			}
		}

		panelUsersRow = new PanelUsersRow[subsetUsers.size()];
		for (int i = 0; i < subsetUsers.size(); i++) {

			panelUsersRow[i] = new PanelUsersRow(subsetUsers.get(i).getUserName(),
					subsetUsers.get(i).getSerial(), PanelScheduleAdd.fromDate, panelTotal);

			panelUsersRow[i].setBounds(0,i*PanelScheduleAdd.CELL_HEIGHT,
					PanelScheduleAdd.CELL_WIDTH * 30
							+ PanelScheduleAdd.LEFT_CELL_WIDTH,
					PanelScheduleAdd.CELL_HEIGHT);
			add(panelUsersRow[i]);
		}
		
		setSize(new Dimension(PanelScheduleAdd.CELL_WIDTH * 30
				+ PanelScheduleAdd.LEFT_CELL_WIDTH,
				((PanelScheduleAdd.CELL_HEIGHT) * 20) + 75));
		setPreferredSize(getSize());
		

	}
	
	public void toDoSave() {

		if (PanelScheduleAdd.scheduleMode == ScheduleMode.USER_SCHEDULE) {
			doSave();
		}

		else if (PanelScheduleAdd.scheduleMode == ScheduleMode.MASTER_SCHEDULE) {
			doSaveMasterSchedule();
		}

	}
static	List<UserSchedule> schedule = new ArrayList<UserSchedule>();
	public void doSaveMasterSchedule() {
	
		try {
			for (PanelUsersRow row : this.panelUsersRow) {
				for (int i = 0; i < 28; i++) {
					UserSchedule userchSchedule = new UserSchedule();
					userchSchedule.setSerial(row.serials[i]);
					String shift = row.nurseLabelRecord[i].getText();
					shift = shift.trim();
					shift = shift.replaceAll("<HTML>", "");
					shift = shift.replaceAll("<BR>", "");

					userchSchedule.setShift(shift);
					userchSchedule.setMasterDay(i + 1);
					DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
					String strDate = row.dateCount[i].getText();

					Date date = dateFormat.parse(strDate);
					userchSchedule.setDate(date);
					try {

						Users u = MedrexClientManager.getInstance().getUser(
								Integer.parseInt(row.nurseIdLabel.getText()));
						userchSchedule.setUserID(u);
						schedule.add(userchSchedule);

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			
			
  /*  //if(PanelScheduleAdd.flag==false){
    	Schedule sh = new Schedule();
		sh.setSerial(PanelScheduleAdd.id);
		sh.setFromDate(PanelScheduleAdd.fromDate);
		sh.setToDate(PanelScheduleAdd.toDate);
		sh.setUserschedules(schedule);			
		MedrexClientManager.getInstance().insertOrUpdateSchedule(sh);
   // }
*/			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void scheduleSave(){
		
		try {			
			Schedule sh = new Schedule();
			sh.setSerial(PanelScheduleAdd.id);
			sh.setFromDate(PanelScheduleAdd.fromDate);
			sh.setToDate(PanelScheduleAdd.toDate);
			sh.setUserschedules(schedule);			
			MedrexClientManager.getInstance().insertOrUpdateSchedule(sh);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@SuppressWarnings("deprecation")
	private void doSave() {
		

		try {		
			for (PanelUsersRow row : this.panelUsersRow) {
				for (int i = 0; i < 28; i++) {
					UserSchedule userchSchedule = new UserSchedule();
					userchSchedule.setSerial(row.serials[i]);
				    String shift=	row.nurseLabelRecord[i].getText();
					
					shift = shift.trim();
					shift = shift.replaceAll("<HTML>", "");
					shift = shift.replaceAll("<BR>", "");
					userchSchedule.setShift(shift);
					userchSchedule.setMasterDay(0);
					DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
					String strDate = row.dateCount[i].getText();
					Date date = dateFormat.parse(strDate);
					userchSchedule.setDate(date);
					try {

						Users u = MedrexClientManager.getInstance().getUser(
								Integer.parseInt(row.nurseIdLabel.getText()));
						userchSchedule.setUserID(u);
						schedule.add(userchSchedule);

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}

			/*Schedule sh = new Schedule();
			sh.setSerial(PanelScheduleAdd.id);
			sh.setFromDate(PanelScheduleAdd.fromDate);
			sh.setToDate(PanelScheduleAdd.toDate);
			sh.setUserschedules(schedule);
			MedrexClientManager.getInstance().insertOrUpdateSchedule(sh);*/
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	private void doUpdateNurseMasterSchedule() {
		for (PanelUsersRow row : this.panelUsersRow) {
			for (int i = 0; i < 28; i++) {
				UserSchedule us = null;
				try {
					DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
					dateFormat.parse(row.dateCount[i].getText() + "");

					us = MedrexClientManager.getInstance()
							.getUserScheduleRecordByDay(
									(Integer) (row.nurseIdObject), 1, i + 1);
					if (us != null) {
						PanelScheduleAdd.id = 1;
					}
					else {
						us = new UserSchedule();
						PanelScheduleAdd.id = 0;
					}
					row.serials[i] = us.getSerial();

					String shift = us.getShift();
					if (shift == null)
						shift = "";
					row.setShift(i, shift);
					if (us.getDate() != null) {
						row.dateCount[i].setText(""
								+ dateFormat.format(us.getDate()));
					}
					if(us.getUserID()!=null){
						row.nurseIdObject = us.getUserID().getSerial();
					}
					
					row.nurseIdLabel.setText("" + row.nurseIdObject);
					row.lblNurseSerial.setText("" + PanelScheduleAdd.id);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}
	}

	private void doUpdateNurse() {
		for (PanelUsersRow row : this.panelUsersRow) {
			for (int i = 0; i < 28; i++) {
				UserSchedule userSchedule = null;
				
				System.out.print("PanelScheduleAdd.id==:"+PanelScheduleAdd.id);
				
				try {
					if (PanelScheduleAdd.id > 0) {
						DateFormat dateFormat = new SimpleDateFormat(
								"MM-dd-yyyy");
						Date date = dateFormat.parse(row.dateCount[i].getText()
								+ "");
						int userId=(Integer) (row.nurseIdObject);
						
						userSchedule = MedrexClientManager
								.getInstance()
								.getUserScheduleRecord(
										userId, PanelScheduleAdd.id, date);
						
						row.serials[i] = userSchedule.getSerial();

						String shift = userSchedule.getShift();
						if (shift == null)
							shift = "";

						row.dateCount[i].setText(""
								+ dateFormat.format(userSchedule.getDate()));
						row.nurseIdObject = userSchedule.getUserID()
								.getSerial();
						row.nurseIdLabel.setText("" + row.nurseIdObject);
						row.setShift(i, shift);
						

					}

					else {
						UserSchedule us = null;
						DateFormat dateFormat = new SimpleDateFormat(
								"MM-dd-yyyy");
						dateFormat.parse(row.dateCount[i].getText() + "");
						us = UserScheduleDAO
								.getInstance()
								.getUserScheduleRecordByDay(
										(Integer) (row.nurseIdObject), 1, i + 1);
						
						/*if(us!=null){
							PanelScheduleAdd.id=1;
						}
						else {
							us = new UserSchedule();
							PanelScheduleAdd.id=0;
						}*/
						row.serials[i] = 0;

						String shift = us.getShift();
						if (shift == null)
							shift = "";
						row.setShift(i, shift);
						try{
						row.nurseIdObject = us.getUserID().getSerial();
						}
						catch(Exception e){
							row.nurseIdObject = 0;
						}
						row.nurseIdLabel.setText("" + row.nurseIdObject);
					}

					row.lblNurseSerial.setText("" + PanelScheduleAdd.id);
				}

				catch (Exception e) {
					e.printStackTrace();
				}

			}
		}
		
		
		
	}

	
	
	
	
	public void doUpdate(){
		if (PanelScheduleAdd.scheduleMode == ScheduleMode.USER_SCHEDULE) {
			doUpdateNurse();
		}

		else if (PanelScheduleAdd.scheduleMode == ScheduleMode.MASTER_SCHEDULE) {
			doUpdateNurseMasterSchedule();
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	

}
