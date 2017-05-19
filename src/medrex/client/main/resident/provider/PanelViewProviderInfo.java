package medrex.client.main.resident.provider;

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
import medrex.client.providers.ControllerProvider;
import medrex.client.providers.PanelProvidersRecordAdd;
import medrex.client.utils.SwingUtils;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.physician.PhysicianForm;
import medrex.commons.vo.providers.ProvidersRecord;
import medrex.commons.vo.providers.ProvidersRecordForm;

import com.sX.swing.JxButton;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JSpinnerDateEditor;

public class PanelViewProviderInfo extends PopUpView {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7541630505231179745L;
	private JLabel lblStartDate;
	private JLabel lblProviderName;
	private JxButton seePhysicianButton;
	private JxButton cancelButton;
	private JxButton saveButton;
	private static final Color DEF_COLOR = new Color(49, 107, 127);
	private JDateChooser dateChooser;
	private PhysicianForm phyform;
	private ControllerProvider controllerProvider;

	public PanelViewProviderInfo(final ControllerProvider controllerProvider) {
		super();
		setLayout(null);
		setBackground(Color.WHITE);
		setSize(420, 200);
		this.controllerProvider = controllerProvider;

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 420, 200);
		add(panel);

		seePhysicianButton = new JxButton();
		seePhysicianButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				PanelProvidersRecordAdd panelProvidersRecordAdd = new PanelProvidersRecordAdd(
						controllerProvider);
				SwingUtils.openInDialog(panelProvidersRecordAdd);
			}
		});
		seePhysicianButton.setArc(0.4f);
		seePhysicianButton.setBackground(Color.WHITE);
		seePhysicianButton.setForeground(DEF_COLOR);
		seePhysicianButton.setBorder(new LineBorder(new Color(180, 188, 193),
				1, false));
		seePhysicianButton.setFont(new Font("", Font.BOLD, 12));
		seePhysicianButton.setText("See Provider");
		seePhysicianButton.setBounds(117, 5, 148, 24);
		panel.add(seePhysicianButton);

		final JLabel physicianNameLabel = new JLabel();
		physicianNameLabel.setForeground(SystemColor.desktop);
		physicianNameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		physicianNameLabel.setText("Provider Name:");
		physicianNameLabel.setBounds(10, 40, 100, 25);
		panel.add(physicianNameLabel);

		final JLabel startDateLabel = new JLabel();
		startDateLabel.setForeground(SystemColor.desktop);
		startDateLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		startDateLabel.setText("Start Date:");
		startDateLabel.setBounds(10, 75, 100, 25);
		panel.add(startDateLabel);

		lblProviderName = new JLabel();
		lblProviderName.setForeground(SystemColor.desktop);
		lblProviderName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblProviderName.setText("");
		lblProviderName.setBounds(115, 40, 295, 25);
		panel.add(lblProviderName);

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
		if (controllerProvider.getCurrentSerial() != 0) {
			try {
				ProvidersRecordForm p = MedrexClientManager.getInstance()
						.getProvidersRecordForm(
								controllerProvider.getCurrentSerial());
				lblProviderName.setText(p.getProviderSurName() + ", "
						+ p.getProviderName());
				lblStartDate.setText(controllerProvider.getStartDate());
			} catch (Exception e) {

			}

		}
	}

	public boolean doSave() {
		boolean boo = false;
		try {
			ProvidersRecord prorecord = MedrexClientManager.getInstance()
					.getProvidersRecord(controllerProvider.getProviderSerial());
			prorecord.setEndDate(dateChooser.getDate());
			int serial = MedrexClientManager.getInstance()
					.insertOrUpdateProvidersRecord(prorecord);
			if (serial != 0) {
				boo = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return boo;
	}

	private SimpleDateFormat SimpleDateFormat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTitle() {
		return "Provider Information";
	}
}
