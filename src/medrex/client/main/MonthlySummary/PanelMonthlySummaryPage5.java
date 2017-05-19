package medrex.client.main.MonthlySummary;

import java.awt.Color;
import java.awt.Dimension;
import java.rmi.RemoteException;
import java.util.Date;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.Form;
import medrex.commons.vo.monthlySummary.MonthlySummaryPage5;
import medrex.commons.vo.monthlySummary.MonthlySummaryRecord;
import medrex.commons.vo.resident.ResidentMain;

import com.toedter.calendar.JDateChooser;

public class PanelMonthlySummaryPage5 extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4882962382102025068L;
	private JComboBox cmbSignature3;
	private JComboBox cmbSignature2;
	private JComboBox cmbSignature1;
	private JTextArea txtAreaComments;
	private JDateChooser dcDate;
	private JTextField txtRoom;
	private JTextField txtResidentName;

	public PanelMonthlySummaryPage5() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(900, 1000));

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 900, 1000);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(10, 10, 880, 38);
		panel.add(panel_1);

		final JLabel residentLabel = new JLabel();
		residentLabel.setBounds(10, 10, 66, 16);
		residentLabel.setText("Resident :");
		panel_1.add(residentLabel);

		txtResidentName = new JTextField();
		txtResidentName.setBounds(82, 8, 369, 21);
		panel_1.add(txtResidentName);

		final JLabel roomLabel = new JLabel();
		roomLabel.setText("Room : ");
		roomLabel.setBounds(479, 11, 54, 14);
		panel_1.add(roomLabel);

		txtRoom = new JTextField();
		txtRoom.setBounds(539, 8, 79, 21);
		panel_1.add(txtRoom);

		final JLabel dateLabel = new JLabel();
		dateLabel.setText("Date :");
		dateLabel.setBounds(648, 11, 54, 14);
		panel_1.add(dateLabel);

		dcDate = new JDateChooser();
		dcDate.setBounds(691, 10, 179, 20);
		panel_1.add(dcDate);

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(10, 54, 880, 892);
		panel.add(panel_2);

		txtAreaComments = new JTextArea();
		txtAreaComments.setBorder(new LineBorder(Color.black, 1, false));
		txtAreaComments.setBounds(10, 5, 860, 877);
		panel_2.add(txtAreaComments);

		final JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(10, 952, 880, 38);
		panel.add(panel_3);

		final JLabel signatures7Label = new JLabel();
		signatures7Label.setBounds(10, 10, 93, 14);
		signatures7Label.setText("Signatures : 7 - 3");
		panel_3.add(signatures7Label);

		cmbSignature1 = new JComboBox();
		cmbSignature1.setBounds(120, 7, 195, 21);
		panel_3.add(cmbSignature1);

		final JLabel label = new JLabel();
		label.setText("3 - 11");
		label.setBounds(347, 10, 37, 14);
		panel_3.add(label);

		cmbSignature2 = new JComboBox();
		cmbSignature2.setBounds(401, 7, 195, 21);
		panel_3.add(cmbSignature2);

		final JLabel label_1 = new JLabel();
		label_1.setText("11 - 7");
		label_1.setBounds(616, 10, 37, 14);
		panel_3.add(label_1);

		cmbSignature3 = new JComboBox();
		cmbSignature3.setBounds(675, 7, 195, 21);
		panel_3.add(cmbSignature3);

		doLoad();
	}

	public void doLoad() {
		ResidentMain rm = null;
		try {
			rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		txtResidentName.setText(rm.getUserPass() + ", " + rm.getUserName());
		try {
			MedrexClientManager.getInstance().getRoomForResident(
					Global.currentResidenceKey, new Date());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// txtRoom.setText(trh.getRoom());
		doUpdate();
	}

	public int doSave() {
		MonthlySummaryRecord msr = new MonthlySummaryRecord();
		try {
			msr = MedrexClientManager.getInstance().getMonthlySummaryRecord(
					Global.currentMonthlySummaryRecordKey);
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (MedrexException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		MonthlySummaryPage5 refMonthlySummaryPage5 = new MonthlySummaryPage5();
		refMonthlySummaryPage5.setSerial(Global.currentMonthlySummaryPage5Key);
		refMonthlySummaryPage5.setResidentId(Global.currentResidenceKey);
		refMonthlySummaryPage5.setFormId(msr);
		refMonthlySummaryPage5.setSignature3((String) cmbSignature3
				.getSelectedItem());
		refMonthlySummaryPage5.setSignature2((String) cmbSignature2
				.getSelectedItem());
		refMonthlySummaryPage5.setSignature1((String) cmbSignature1
				.getSelectedItem());
		refMonthlySummaryPage5.setAreaComments(txtAreaComments.getText());
		refMonthlySummaryPage5.setDate(dcDate.getDate());
		refMonthlySummaryPage5.setRoom(txtRoom.getText());
		refMonthlySummaryPage5.setResidentName(txtResidentName.getText());

		try {
			Global.currentMonthlySummaryPage5Key = MedrexClientManager
					.getInstance().insertOrUpdateMonthlySummaryPage5(
							refMonthlySummaryPage5);
			return Global.currentMonthlySummaryPage5Key;
		} catch (Exception e) {
		}
		return 0;
	}

	public void doUpdate() {
		MonthlySummaryPage5 refMonthlySummaryPage5 = null;
		System.out.println("Key is :" + Global.currentMonthlySummaryRecordKey);
		MonthlySummaryRecord msr = new MonthlySummaryRecord();
		if (Global.currentMonthlySummaryRecordKey != 0
				&& Global.currentMonthlySummaryPage5Key != 0) {
			try {
				msr = MedrexClientManager.getInstance()
						.getMonthlySummaryRecord(
								Global.currentMonthlySummaryRecordKey);
				refMonthlySummaryPage5 = MedrexClientManager.getInstance()
						.getMonthlySummaryPage5(msr);
			} catch (Exception e) {

			}
			cmbSignature3.setSelectedItem(refMonthlySummaryPage5
					.getSignature3());
			cmbSignature2.setSelectedItem(refMonthlySummaryPage5
					.getSignature2());
			cmbSignature1.setSelectedItem(refMonthlySummaryPage5
					.getSignature1());
			txtAreaComments.setText(refMonthlySummaryPage5.getAreaComments());
			dcDate.setDate(refMonthlySummaryPage5.getDate());
			txtRoom.setText(refMonthlySummaryPage5.getRoom());
			txtResidentName.setText(refMonthlySummaryPage5.getResidentName());
			Global.currentMonthlySummaryPage5Key = refMonthlySummaryPage5
					.getSerial();
		} else {
			Global.currentMonthlySummaryPage5Key = 0;
		}

	}

	public boolean doValidate() {
		// TODO Auto-generated method stub
		return true;
	}

}
