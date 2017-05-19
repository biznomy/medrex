package medrex.client.main.resident.physician;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.users.ControllerUsers;
import medrex.client.users.PanelUsersAdd;
import medrex.client.utils.SwingUtils;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.others.Doctors;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.physician.PhysicianForm;

import com.sX.swing.JxButton;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JSpinnerDateEditor;

public class PanelViewPhysiciansInfo extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3434614104972675620L;
	private JLabel lblStartDate;
	private JLabel lblPhysicianName;
	private JxButton seePhysicianButton;
	private JxButton cancelButton;
	private JxButton saveButton;
	private static final Color DEF_COLOR = new Color(49, 107, 127);
	private JDateChooser dateChooser;
	private PhysicianForm phyform;

	private ControllerUsers controllerUsers;

	public PanelViewPhysiciansInfo(final ControllerUsers controllerUsers) {
		super();
		setLayout(null);
		setBackground(Color.WHITE);
		setSize(420, 200);
		this.controllerUsers = controllerUsers;

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 420, 200);
		add(panel);

		seePhysicianButton = new JxButton();
		seePhysicianButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				PanelUsersAdd panelUsersAdd = new PanelUsersAdd(controllerUsers);
				panelUsersAdd.openProvider("Resident");
				SwingUtils.openInDialog(panelUsersAdd);
			}
		});
		seePhysicianButton.setArc(0.4f);
		seePhysicianButton.setBackground(Color.WHITE);
		seePhysicianButton.setForeground(DEF_COLOR);
		seePhysicianButton.setBorder(new LineBorder(new Color(180, 188, 193),
				1, false));
		seePhysicianButton.setFont(new Font("", Font.BOLD, 12));
		seePhysicianButton.setText("See Physician");
		seePhysicianButton.setBounds(117, 5, 148, 24);
		panel.add(seePhysicianButton);

		final JLabel physicianNameLabel = new JLabel();
		physicianNameLabel.setForeground(SystemColor.desktop);
		physicianNameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		physicianNameLabel.setText("Physician Name:");
		physicianNameLabel.setBounds(10, 40, 100, 25);
		panel.add(physicianNameLabel);

		final JLabel startDateLabel = new JLabel();
		startDateLabel.setForeground(SystemColor.desktop);
		startDateLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		startDateLabel.setText("Start Date:");
		startDateLabel.setBounds(10, 75, 100, 25);
		panel.add(startDateLabel);

		lblPhysicianName = new JLabel();
		lblPhysicianName.setForeground(SystemColor.desktop);
		lblPhysicianName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhysicianName.setText("");
		lblPhysicianName.setBounds(115, 40, 295, 25);
		panel.add(lblPhysicianName);

		lblStartDate = new JLabel();
		lblStartDate.setForeground(SystemColor.desktop);
		lblStartDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStartDate.setText("");
		lblStartDate.setBounds(115, 80, 265, 25);
		panel.add(lblStartDate);

		final JLabel startDateLabel_1 = new JLabel();
		startDateLabel_1.setForeground(SystemColor.desktop);
		startDateLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		startDateLabel_1.setText("End Date:");
		startDateLabel_1.setBounds(10, 120, 100, 25);
		panel.add(startDateLabel_1);

		JSpinnerDateEditor dateEditor = new JSpinnerDateEditor();
		dateChooser = new JDateChooser(dateEditor);
		dateChooser.setDate(MedrexClientManager.getServerTime());
		dateChooser.setDateFormatString("MM/dd/yyyy");
		dateEditor.setBackground(Color.white);

		dateChooser.setBounds(115, 128, 173, 25);
		panel.add(dateChooser);

		saveButton = new JxButton();
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (doSave()) {
					close();
				}
			}
		});
		saveButton.setArc(0.4f);
		saveButton.setBackground(Color.WHITE);
		saveButton.setForeground(DEF_COLOR);
		saveButton
				.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.setText("Save");
		saveButton.setBounds(130, 171, 95, 24);
		panel.add(saveButton);

		cancelButton = new JxButton();
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		cancelButton.setArc(0.4f);
		cancelButton.setBackground(Color.WHITE);
		cancelButton.setForeground(DEF_COLOR);
		cancelButton.setBorder(new LineBorder(new Color(180, 188, 193), 1,
				false));
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setText("Cancel");
		cancelButton.setBounds(250, 171, 95, 24);
		panel.add(cancelButton);

		doUpdate();
	}

	public void doUpdate() {

		if (controllerUsers.getCurrentSerial() != 0) {
			Users ar = controllerUsers.doUpdateUser();
			try {
				Doctors d = MedrexClientManager.getInstance().getDoctorsRecord(
						ar.getUserId());
				if (d.getPhysicianName().contains("Dr.")) {
					lblPhysicianName.setText(d.getPhysicianName() + ","
							+ d.getPhysicianSurName());

				} else {
					lblPhysicianName.setText("Dr. " + d.getPhysicianName()
							+ "," + d.getPhysicianSurName());
				}
				PhysicianForm phyform = MedrexClientManager.getInstance()
						.getPhysicianForm(Global.currentResidenceKey,
								controllerUsers.getCurrentSerial());
				dateChooser.setDate(phyform.getEndDate());
				setPhyform(phyform);
				SimpleDateFormat df = new SimpleDateFormat();
				df.applyPattern("MM / dd / yyyy");
				lblStartDate.setText(df.format(phyform.getStartDate()));
			} catch (Exception ex) {

			}

		}
	}

	public boolean doSave() {
		boolean bool = false;

		if (getPhyform() != null) {
			PhysicianForm refPhysicianForm = getPhyform();
			if (dateChooser.getDate() != null) {
				refPhysicianForm.setEndDate(dateChooser.getDate());
			}
			try {
				int id = MedrexClientManager.getInstance()
						.insertOrUpdatePhysicianForm(refPhysicianForm);
				if (id != 0) {
					bool = true;
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return bool;

	}

	public PhysicianForm getPhyform() {
		return phyform;
	}

	public void setPhyform(PhysicianForm phyform) {
		this.phyform = phyform;
	}

	@Override
	public String getTitle() {
		return "Physician Information";
	}

}
