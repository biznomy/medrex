package medrex.client.constants;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.loading.FrameMedrexMessage;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.SubAppTypes;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.security.SecurityRole;

public class GlobalSecurity {

	public static SecurityRole currentRole;

	public static int getPriviledge(SubAppTypes type) {
		switch (type.ID) {
		case 1:
			return (currentRole.getAccessCNA());
		case 2:
			return (currentRole.getAccessCareLog());
		case 3:
			return (currentRole.getAccessMedicationCart());
		case 4:
			return (currentRole.getAccessReports());
		case 5:
			return (currentRole.getAccessProviders());

		case 6:
			return (currentRole.getAccessCensus());
		case 7:
			return (currentRole.getAccessAdmissionRecords());
		case 8:
			return (currentRole.getAccessActivity());
		case 9:
			return (currentRole.getAccessMedicationTreatment());
		case 10:
			return (currentRole.getAccessDietary());

		case 11:
			return (currentRole.getAccessConsultant());
		case 12:
			return (currentRole.getAccessProgressNotes());
		case 13:
			return (currentRole.getAccessLabSpecialReports());
		case 14:
			return (currentRole.getAccessHistoryPhysical());
		case 15:
			return (currentRole.getAccessPhysicianOrders());

		case 16:
			return (currentRole.getAccessOtPtActSpeech());
		case 17:
			return (currentRole.getAccessMDS());
		case 18:
			return (currentRole.getAccessCarePlan());

			// suresh

		case 19:
			return (currentRole.getAccessResidentInfoAllergies());
		case 20:
			return (currentRole.getAccessResidentInfoScheduling());
		case 21:
			return (currentRole.getAccessResidentInfoVital());
		case 22:
			return (currentRole.getAccessResidentInfoWeight());
		case 23:
			return (currentRole.getAccessResidentInfoWounds());
		case 24:
			return (currentRole.getAccessResidentInfoPersonalInfo());
		case 25:
			return (currentRole.getAccessResidentInfoPayerInfo());
		case 26:
			return (currentRole.getAccessResidentInfoContactInfo());
		case 27:
			return (currentRole.getAccessResidentInfoPhysicians());

		case 28:
			return (currentRole.getAccessResidentInfoProviders());
		case 29:
			return (currentRole.getAccessResidentInfoCensus());
		case 30:
			return (currentRole.getAccessResidentInfoDiagnosis());
		case 31:
			return (currentRole.getAccessResidentInfoScan());
		case 32:
			return (currentRole.getAccessResidentInfoRoom());
			// suresh For Dashboard rights
		case 33:
			return (currentRole.getAccessResident());
		case 34:
			return (currentRole.getAccessUsers());
		case 35:
			return (currentRole.getAccessUserLogon());
		case 36:
			return (currentRole.getAccessMessages());

		case 37:
			return (currentRole.getAccessMasterlist());
		case 38:
			return (currentRole.getAccessAdmin());

			//
		default:
			return (0);
		}
	}

	public static boolean isViewPriviledge(SubAppTypes type) {
		// if (getPriviledge(type) > 0) {
		// return (true);
		// } else {
		// showMessageDialog("You are not authorized to use this functionality, Please contact system admin");
		// return (false);
		// }
		return true;
	}

	public static boolean isUpdatePriviledge(SubAppTypes type) {
		// if (getPriviledge(type) > 1) {
		// return (true);
		// } else {
		// showMessageDialog(
		// "You are not authorized to use this functionality, Please contact system admin");
		// return (false);
		// }
		return true;
	}

	public static void updateSecurity() {
		SecurityRole securityRoleApplication = null;
		SecurityRole securityRoleUser = null;
		SecurityRole securityRole = new SecurityRole();
		Users currentUser = null;
		try {
			currentUser = MedrexClientManager.getInstance().getUser(
					Global.currentLoggedInUserKey);
		} catch (Exception e) {

		}

		try {
			// securityRole =
			// MedrexClientManager.getInstance().getSecurityRole(currentUser.getRoleName());
			securityRoleApplication = MedrexClientManager.getInstance()
					.getSecurityRole(
							currentUser.getApplicationRole().getSerial());
		} catch (Exception e) {

		}

		try {
			// securityRole =
			// MedrexClientManager.getInstance().getSecurityRole(currentUser.getRoleName());
			if (currentUser.getUserRole().getSerial() != 0) {
				securityRoleUser = MedrexClientManager.getInstance()
						.getSecurityRole(currentUser.getUserRole().getSerial());
			}
		} catch (Exception e) {

		}

		if (securityRoleApplication == null) {
			securityRoleApplication = new SecurityRole();
		}

		if (securityRoleUser == null) {
			securityRoleUser = new SecurityRole();
		}

		// merge secutiry role

		securityRole
				.setAccessActivity(securityRoleApplication.getAccessActivity() > securityRoleUser
						.getAccessActivity() ? securityRoleApplication
						.getAccessActivity() : securityRoleUser
						.getAccessActivity());
		securityRole.setAccessAdmissionRecords(securityRoleApplication
				.getAccessAdmissionRecords() > securityRoleUser
				.getAccessAdmissionRecords() ? securityRoleApplication
				.getAccessAdmissionRecords() : securityRoleUser
				.getAccessAdmissionRecords());
		securityRole
				.setAccessCareLog(securityRoleApplication.getAccessCareLog() > securityRoleUser
						.getAccessCareLog() ? securityRoleApplication
						.getAccessCareLog() : securityRoleUser
						.getAccessCareLog());
		securityRole
				.setAccessCarePlan(securityRoleApplication.getAccessCarePlan() > securityRoleUser
						.getAccessCarePlan() ? securityRoleApplication
						.getAccessCarePlan() : securityRoleUser
						.getAccessCarePlan());
		securityRole
				.setAccessCensus(securityRoleApplication.getAccessCensus() > securityRoleUser
						.getAccessCensus() ? securityRoleApplication
						.getAccessCensus() : securityRoleUser.getAccessCensus());
		securityRole
				.setAccessCNA(securityRoleApplication.getAccessCNA() > securityRoleUser
						.getAccessCNA() ? securityRoleApplication
						.getAccessCNA() : securityRoleUser.getAccessCNA());
		securityRole
				.setAccessConsultant(securityRoleApplication
						.getAccessConsultant() > securityRoleUser
						.getAccessConsultant() ? securityRoleApplication
						.getAccessConsultant() : securityRoleUser
						.getAccessConsultant());
		securityRole
				.setAccessDietary(securityRoleApplication.getAccessDietary() > securityRoleUser
						.getAccessDietary() ? securityRoleApplication
						.getAccessDietary() : securityRoleUser
						.getAccessDietary());
		securityRole.setAccessHistoryPhysical(securityRoleApplication
				.getAccessHistoryPhysical() > securityRoleUser
				.getAccessHistoryPhysical() ? securityRoleApplication
				.getAccessHistoryPhysical() : securityRoleUser
				.getAccessHistoryPhysical());
		securityRole.setAccessLabSpecialReports(securityRoleApplication
				.getAccessLabSpecialReports() > securityRoleUser
				.getAccessLabSpecialReports() ? securityRoleApplication
				.getAccessLabSpecialReports() : securityRoleUser
				.getAccessLabSpecialReports());
		securityRole
				.setAccessMDS(securityRoleApplication.getAccessMDS() > securityRoleUser
						.getAccessMDS() ? securityRoleApplication
						.getAccessMDS() : securityRoleUser.getAccessMDS());
		securityRole.setAccessMedicationCart(securityRoleApplication
				.getAccessMedicationCart() > securityRoleUser
				.getAccessMedicationCart() ? securityRoleApplication
				.getAccessMedicationCart() : securityRoleUser
				.getAccessMedicationCart());
		securityRole.setAccessMedicationTreatment(securityRoleApplication
				.getAccessMedicationTreatment() > securityRoleUser
				.getAccessMedicationTreatment() ? securityRoleApplication
				.getAccessMedicationTreatment() : securityRoleUser
				.getAccessMedicationTreatment());
		securityRole.setAccessOtPtActSpeech(securityRoleApplication
				.getAccessOtPtActSpeech() > securityRoleUser
				.getAccessOtPtActSpeech() ? securityRoleApplication
				.getAccessOtPtActSpeech() : securityRoleUser
				.getAccessOtPtActSpeech());
		securityRole.setAccessPhysicianOrders(securityRoleApplication
				.getAccessPhysicianOrders() > securityRoleUser
				.getAccessPhysicianOrders() ? securityRoleApplication
				.getAccessPhysicianOrders() : securityRoleUser
				.getAccessPhysicianOrders());
		securityRole.setAccessProgressNotes(securityRoleApplication
				.getAccessProgressNotes() > securityRoleUser
				.getAccessProgressNotes() ? securityRoleApplication
				.getAccessProgressNotes() : securityRoleUser
				.getAccessProgressNotes());
		securityRole
				.setAccessProviders(securityRoleApplication
						.getAccessProviders() > securityRoleUser
						.getAccessProviders() ? securityRoleApplication
						.getAccessProviders() : securityRoleUser
						.getAccessProviders());
		securityRole
				.setAccessReports(securityRoleApplication.getAccessReports() > securityRoleUser
						.getAccessReports() ? securityRoleApplication
						.getAccessReports() : securityRoleUser
						.getAccessReports());

		// suresh
		securityRole.setAccessResidentInfoAllergies(securityRoleApplication
				.getAccessResidentInfoAllergies() > securityRoleUser
				.getAccessResidentInfoAllergies() ? securityRoleApplication
				.getAccessResidentInfoAllergies() : securityRoleUser
				.getAccessResidentInfoAllergies());

		securityRole.setAccessResidentInfoScheduling(securityRoleApplication
				.getAccessResidentInfoScheduling() > securityRoleUser
				.getAccessResidentInfoScheduling() ? securityRoleApplication
				.getAccessResidentInfoScheduling() : securityRoleUser
				.getAccessResidentInfoScheduling());

		securityRole.setAccessResidentInfoVital(securityRoleApplication
				.getAccessResidentInfoVital() > securityRoleUser
				.getAccessResidentInfoVital() ? securityRoleApplication
				.getAccessResidentInfoVital() : securityRoleUser
				.getAccessResidentInfoVital());

		securityRole.setAccessResidentInfoWeight(securityRoleApplication
				.getAccessResidentInfoWeight() > securityRoleUser
				.getAccessResidentInfoWeight() ? securityRoleApplication
				.getAccessResidentInfoWeight() : securityRoleUser
				.getAccessResidentInfoWeight());

		securityRole.setAccessResidentInfoWounds(securityRoleApplication
				.getAccessResidentInfoWounds() > securityRoleUser
				.getAccessResidentInfoWounds() ? securityRoleApplication
				.getAccessResidentInfoWounds() : securityRoleUser
				.getAccessResidentInfoWounds());

		securityRole.setAccessResidentInfoPersonalInfo(securityRoleApplication
				.getAccessResidentInfoPersonalInfo() > securityRoleUser
				.getAccessResidentInfoPersonalInfo() ? securityRoleApplication
				.getAccessResidentInfoPersonalInfo() : securityRoleUser
				.getAccessResidentInfoPersonalInfo());

		securityRole.setAccessResidentInfoPayerInfo(securityRoleApplication
				.getAccessResidentInfoPayerInfo() > securityRoleUser
				.getAccessResidentInfoPayerInfo() ? securityRoleApplication
				.getAccessResidentInfoPayerInfo() : securityRoleUser
				.getAccessResidentInfoPayerInfo());

		securityRole.setAccessResidentInfoContactInfo(securityRoleApplication
				.getAccessResidentInfoContactInfo() > securityRoleUser
				.getAccessResidentInfoContactInfo() ? securityRoleApplication
				.getAccessResidentInfoContactInfo() : securityRoleUser
				.getAccessResidentInfoContactInfo());

		securityRole.setAccessResidentInfoPhysicians(securityRoleApplication
				.getAccessResidentInfoPhysicians() > securityRoleUser
				.getAccessResidentInfoPhysicians() ? securityRoleApplication
				.getAccessResidentInfoPhysicians() : securityRoleUser
				.getAccessResidentInfoPhysicians());

		securityRole.setAccessResidentInfoProviders(securityRoleApplication
				.getAccessResidentInfoProviders() > securityRoleUser
				.getAccessResidentInfoProviders() ? securityRoleApplication
				.getAccessResidentInfoProviders() : securityRoleUser
				.getAccessResidentInfoProviders());

		securityRole.setAccessResidentInfoCensus(securityRoleApplication
				.getAccessResidentInfoCensus() > securityRoleUser
				.getAccessResidentInfoCensus() ? securityRoleApplication
				.getAccessResidentInfoCensus() : securityRoleUser
				.getAccessResidentInfoCensus());

		securityRole.setAccessResidentInfoDiagnosis(securityRoleApplication
				.getAccessResidentInfoDiagnosis() > securityRoleUser
				.getAccessResidentInfoDiagnosis() ? securityRoleApplication
				.getAccessResidentInfoDiagnosis() : securityRoleUser
				.getAccessResidentInfoDiagnosis());

		securityRole.setAccessResidentInfoScan(securityRoleApplication
				.getAccessResidentInfoScan() > securityRoleUser
				.getAccessResidentInfoScan() ? securityRoleApplication
				.getAccessResidentInfoScan() : securityRoleUser
				.getAccessResidentInfoScan());

		securityRole.setAccessResidentInfoRoom(securityRoleApplication
				.getAccessResidentInfoRoom() > securityRoleUser
				.getAccessResidentInfoRoom() ? securityRoleApplication
				.getAccessResidentInfoRoom() : securityRoleUser
				.getAccessResidentInfoRoom());

		// For dashboard rights

		securityRole
				.setAccessResident(securityRoleApplication.getAccessResident() > securityRoleUser
						.getAccessResident() ? securityRoleApplication
						.getAccessResident() : securityRoleUser
						.getAccessResident());

		securityRole
				.setAccessUsers(securityRoleApplication.getAccessUsers() > securityRoleUser
						.getAccessUsers() ? securityRoleApplication
						.getAccessUsers() : securityRoleUser.getAccessUsers());

		securityRole
				.setAccessUserLogon(securityRoleApplication
						.getAccessUserLogon() > securityRoleUser
						.getAccessUserLogon() ? securityRoleApplication
						.getAccessUserLogon() : securityRoleUser
						.getAccessUserLogon());

		securityRole
				.setAccessMessages(securityRoleApplication.getAccessMessages() > securityRoleUser
						.getAccessMessages() ? securityRoleApplication
						.getAccessMessages() : securityRoleUser
						.getAccessMessages());

		securityRole
				.setAccessMasterlist(securityRoleApplication
						.getAccessMasterlist() > securityRoleUser
						.getAccessMasterlist() ? securityRoleApplication
						.getAccessMasterlist() : securityRoleUser
						.getAccessMasterlist());

		securityRole
				.setAccessAdmin(securityRoleApplication.getAccessAdmin() > securityRoleUser
						.getAccessAdmin() ? securityRoleApplication
						.getAccessAdmin() : securityRoleUser.getAccessAdmin());

		GlobalSecurity.currentRole = securityRole;
	}

	public static void showMessageDialog(String message) {
		try {
			FrameMedrexMessage dialog = new FrameMedrexMessage(message);
			dialog.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			SwingUtils.center(dialog);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}