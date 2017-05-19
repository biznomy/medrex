package medrex.client.main.resident.personalInfo;

import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;

import javax.swing.JLabel;
import javax.swing.JPanel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.census.counts.BedHold;
import medrex.commons.vo.resident.ResidentMain;

public class PanelBedHoldInfo extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 705446406237516284L;
	private JLabel dischargeDate;
	private JLabel roomNo;
	private JLabel residentName;
	private int serial;

	private static final Color DEF_COLOR = new Color(49, 104, 127);

	public PanelBedHoldInfo(int serial) {
		super();
		this.serial = serial;
		setLayout(null);
		setBackground(Color.WHITE);
		setSize(260, 120);

		final JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 116, 269, -114);
		add(panel);

		final JLabel residentNameLabel = new JLabel();
		residentNameLabel.setText("Resident Name:");
		residentNameLabel.setForeground(DEF_COLOR);
		residentNameLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		residentNameLabel.setBounds(10, 44, 96, 22);
		add(residentNameLabel);

		final JLabel roomNoLabel = new JLabel();
		roomNoLabel.setText("Room No:");
		roomNoLabel.setForeground(DEF_COLOR);
		roomNoLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		roomNoLabel.setBounds(10, 72, 96, 16);
		add(roomNoLabel);

		final JLabel dischargeDateLabel = new JLabel();
		dischargeDateLabel.setText("Discharge Date:");
		dischargeDateLabel.setForeground(DEF_COLOR);
		dischargeDateLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		dischargeDateLabel.setBounds(10, 94, 96, 16);
		add(dischargeDateLabel);

		final JLabel onBedholdLabel = new JLabel();
		onBedholdLabel.setText("On BedHold");
		onBedholdLabel.setForeground(DEF_COLOR);
		onBedholdLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		onBedholdLabel.setBounds(10, 8, 237, 16);
		add(onBedholdLabel);

		residentName = new JLabel();
		residentName.setForeground(DEF_COLOR);
		residentName.setFont(new Font("Dialog", Font.BOLD, 12));
		residentName.setBounds(112, 47, 135, 16);
		add(residentName);

		roomNo = new JLabel();
		roomNo.setForeground(DEF_COLOR);
		roomNo.setFont(new Font("Dialog", Font.BOLD, 12));
		roomNo.setBounds(119, 72, 66, 16);
		add(roomNo);

		dischargeDate = new JLabel();
		dischargeDate.setForeground(DEF_COLOR);
		dischargeDate.setFont(new Font("Dialog", Font.BOLD, 12));
		dischargeDate.setBounds(112, 94, 103, 16);
		add(dischargeDate);

		doUpdate();
	}

	public void doUpdate() {
		try {
			ResidentMain res = MedrexClientManager.getInstance().getResident(
					serial);
			residentName.setText(res.getUserPass() + ", " + res.getUserName());
			roomNo.setText(res.getOldroom());
			BedHold bed = MedrexClientManager.getInstance().getBedHold(serial);
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MM dd, yyyy");
			dischargeDate.setText(df.format(bed.getDischargedOn()) + "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getTitle() {
		return "Resident On BedHold";
	}

}
