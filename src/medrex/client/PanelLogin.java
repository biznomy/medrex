package medrex.client;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import medrex.client.activate.Activator;
import medrex.client.admin.screenSaver.PanelScreenSaverThreadControl;
import medrex.client.admin.userLogon.ControllerUserLogon;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.constants.GlobalSecurity;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.PasswordSetting;
import medrex.commons.vo.census.AdmissionFromSubHead;
import medrex.commons.vo.census.AdmissionTransportation;
import medrex.commons.vo.others.Doctors;
import medrex.commons.vo.others.Nurse;
import medrex.commons.vo.others.Users;

import com.sX.swing.JxButton;

public class PanelLogin extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9020968397148280104L;

	private JPasswordField txtPass;

	private JTextField txtUser;

	private FrameLogin frameLogin;

	private int maxAttempts;

	private static int clickCount;

	private static int noOfDays;

	/**
	 * Create the panel
	 */
	public PanelLogin(FrameLogin fl) {
		super();
		try {
			PasswordSetting ps = MedrexClientManager.getInstance()
					.getPasswordSetting();
			if (ps != null) {
				maxAttempts = ps.getNoOfAttempts();
				noOfDays = ps.getMaximumDays();
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		clickCount = 0;
		frameLogin = fl;

		setLayout(null);
		setBorder(new BevelBorder(BevelBorder.LOWERED));
		setBackground(SystemColor.desktop);
		setPreferredSize(new Dimension(300, 200));

		final JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		panel.setBackground(new Color(255, 255, 255));
		panel.setLayout(null);
		panel.setBounds(0, 15, 300, 45);
		add(panel);

		final JLabel ltcLoginLabel = new JLabel();
		ltcLoginLabel.setForeground(SystemColor.desktop);
		ltcLoginLabel.setFont(new Font("Arial", Font.BOLD, 28));
		ltcLoginLabel.setText("MEDREX LOGIN");
		ltcLoginLabel.setBounds(28, 10, 231, 25);
		panel.add(ltcLoginLabel);

		final JLabel userIdLabel = new JLabel();
		userIdLabel.setForeground(new Color(255, 255, 255));
		userIdLabel.setFont(new Font("Arial", Font.BOLD, 12));
		userIdLabel.setText("User ID");
		userIdLabel.setBounds(33, 88, 66, 16);
		add(userIdLabel);

		txtUser = new JTextField();
		txtUser.setText("");
		txtUser.setBounds(107, 86, 150, 20);
		add(txtUser);

		final JLabel passwordLabel = new JLabel();
		passwordLabel.setForeground(new Color(255, 255, 255));
		passwordLabel.setFont(new Font("Arial", Font.BOLD, 12));
		passwordLabel.setText("Password");
		passwordLabel.setBounds(33, 123, 66, 16);
		add(passwordLabel);

		txtPass = new JPasswordField();
		txtPass.setText("");
		txtPass.setBounds(107, 121, 150, 20);
		add(txtPass);

		final JxButton okButton = new JxButton();
		okButton.setBackground(GuiModes.DESIGNER_FORMS
				.getDefaultBackgroundColor());
		okButton.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());

		okButton.addActionListener(new ActionListener() {
			@SuppressWarnings("unchecked")
			public void actionPerformed(final ActionEvent e) {
				// try {
				// boolean isAdmin=false;
				// isAdmin
				// =MedrexClientManager.getAdminUsers(txtUser.getText());
				// for(Users user : users){
				// System.out.println("is admin"+isAdmin);
				// if(user.getUserName().equalsIgnoreCase(txtUser.getText())){
				// if(isAdmin){
				// clickCount=0;
				// }
				// } catch (MedrexException e2) {
				// e2.printStackTrace();
				// } catch (RemoteException e3) {
				// e3.printStackTrace();
				// }
				// if(clickCount < (maxAttempts-1) ){
				loginAction();
				// clickCount++;
				// }
				// else{
				// JOptionPane.showMessageDialog(null,
				// "You Have Exceeded The Maximum Number of Attempts");
				// JOptionPane.showMessageDialog(null,
				// "Your Account has been locked\n\tPlease Contact Your Administrator");
				// try {
				// MedrexClientManager.getInstance().lockUserStatus(txtUser.getText());
				// } catch (Exception e1) {
				// e1.printStackTrace();
				// }
				// txtUser.setEditable(false);
				// txtPass.setEditable(false);
				// }
			}
		});
		okButton.setBorder(new EmptyBorder(0, 0, 0, 0));
		okButton.setBorderPainted(false);
		okButton.setText("OK");
		okButton.setBounds(47, 164, 75, 26);
		add(okButton);
		frameLogin.getRootPane().setDefaultButton(okButton);

		final JxButton cancelButton = new JxButton();
		cancelButton.setBackground(GuiModes.DESIGNER_FORMS
				.getDefaultBackgroundColor());
		cancelButton.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());

		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				System.exit(0);
			}
		});
		cancelButton.setBorder(new EmptyBorder(0, 0, 0, 0));
		cancelButton.setBorderPainted(false);
		cancelButton.setText("Cancel");
		cancelButton.setBounds(141, 164, 75, 26);
		add(cancelButton);

	}

	public void loginAction() {
		// DummyData dummyData=new DummyData();
		// try {
		// List residents=MedrexClientManager.getInstance().getResidentMain();
		// if (residents.size() == 0) {
		// dummyData.insertDummyData();
		// }
		// } catch (Exception e) {
		// e.printStackTrace();
		// }

		String user = txtUser.getText();
		String password = txtPass.getText();

		boolean check = false;
		try {
			String msg = "";
			if (user.equalsIgnoreCase("") && user != null) {
				msg += "Please Enter User Name \n";
			}
			if ((password.equalsIgnoreCase("") && password != null)) {
				msg += "Please Enter Password \n";
			}
			if (!msg.equals("")) {
				JOptionPane.showMessageDialog(this, msg,
						"Enter User name and password", JOptionPane.OK_OPTION);
			} else {
				check = MedrexClientManager.getInstance().isValidUserLogin(
						user, password);
				List users = MedrexClientManager.getInstance().getUsers();
				Users thisUser = null;
				Iterator iterator = users.iterator();
				while (iterator.hasNext()) {
					Users temp = (Users) iterator.next();
					if (temp.getUserName().equalsIgnoreCase(user)) {
						thisUser = temp;
						break;
					}
				}

				// initialize cache

				iterator = users.iterator();
				Global.userMap = new HashMap<Integer, Users>();
				while (iterator.hasNext()) {
					Users temp = (Users) iterator.next();
					Global.userMap.put(new Integer(temp.getSerial()), temp);
				}

				List<AdmissionFromSubHead> afsh = null;
				Global.admissionFromSubHeadMap = new HashMap<Integer, AdmissionFromSubHead>();
				afsh = MedrexClientManager.getInstance()
						.getAdmissionFromSubHeads(1);
				iterator = afsh.iterator();
				while (iterator.hasNext()) {
					AdmissionFromSubHead temp = (AdmissionFromSubHead) iterator
							.next();
					Global.admissionFromSubHeadMap.put(new Integer(temp
							.getSerial()), temp);
				}
				afsh = MedrexClientManager.getInstance()
						.getAdmissionFromSubHeads(2);
				iterator = afsh.iterator();
				while (iterator.hasNext()) {
					AdmissionFromSubHead temp = (AdmissionFromSubHead) iterator
							.next();
					Global.admissionFromSubHeadMap.put(new Integer(temp
							.getSerial()), temp);
				}
				afsh = MedrexClientManager.getInstance()
						.getAdmissionFromSubHeads(3);
				iterator = afsh.iterator();
				while (iterator.hasNext()) {
					AdmissionFromSubHead temp = (AdmissionFromSubHead) iterator
							.next();
					Global.admissionFromSubHeadMap.put(new Integer(temp
							.getSerial()), temp);
				}
				afsh = MedrexClientManager.getInstance()
						.getAdmissionFromSubHeads(4);
				iterator = afsh.iterator();
				while (iterator.hasNext()) {
					AdmissionFromSubHead temp = (AdmissionFromSubHead) iterator
							.next();
					Global.admissionFromSubHeadMap.put(new Integer(temp
							.getSerial()), temp);
				}

				List<AdmissionTransportation> at = null;
				Global.admissionTransportMap = new HashMap<Integer, AdmissionTransportation>();
				at = MedrexClientManager.getInstance()
						.getAdmissionTransportations(1);
				iterator = at.iterator();
				while (iterator.hasNext()) {
					AdmissionTransportation temp = (AdmissionTransportation) iterator
							.next();
					Global.admissionTransportMap.put(new Integer(temp
							.getSerial()), temp);
				}

				if (Global.IS_DEMO && !Activator.isValidLicense()) {
					Activator activationSystem = new Activator();
					SwingUtils.openInDialog(activationSystem);
					if (!Activator.isValidLicense()) {
						System.exit(ABORT);
					}
				}

				try {
					Global.currentLoggedInUserKey = thisUser.getSerial();
					Global.currentLoggedInUserType = thisUser.getUserType();
					Global.currentUserType = thisUser.getUserType();
					Global.currentLoggedInUserName = thisUser.getUserName();
					Users usr = MedrexClientManager.getInstance().getUser(
							thisUser.getSerial());
					if (thisUser.getUserType().equalsIgnoreCase("Physicians")) {
						Doctors doct = MedrexClientManager.getInstance()
								.getDoctorsRecord(usr.getUserId());
						Global.currentUserFirstName = doct.getPhysicianName();
						Global.currentUserLastName = doct.getPhysicianSurName();
					} else {
						Nurse nur = MedrexClientManager.getInstance()
								.getNurseRecord(usr.getUserId());
						Global.currentUserFirstName = nur.getNurseName();
						Global.currentUserLastName = nur.getNurseSurName();
					}
				} catch (Exception e) {

				}
				if (check) {
					GlobalSecurity.updateSecurity();
					new ControllerUserLogon().loginUpdate();
					frameLogin.openMainOptions();
					new PanelScreenSaverThreadControl();
				} else {
					JOptionPane.showMessageDialog(this,
							"Invalid Username/password");
				}
			}
		} catch (MedrexException me) {
			System.out.println("3");
			System.out.println("medrex problem" + me.getMessage());

		} catch (RemoteException re) {
			System.out.println("4");
		}
	}

}
