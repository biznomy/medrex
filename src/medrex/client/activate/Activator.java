/**
 * 
 */
package medrex.client.activate;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.utils.FieldFormatter;
import medrex.client.utils.SwingUtils;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.activation.ActivationLicense;

/**
 * @author D S Naruka
 * 
 */
public class Activator extends PopUpView {

	private JButton btnCancel;
	private JButton btnActivate;
	private JFormattedTextField txtKey;
	private JLabel lblInfo;
	/**
	 * Generated serial VersionUID
	 */
	private static final long serialVersionUID = 6232547724766358516L;

	private static final String[] KEYS = { "KJASKJKLJSLFU839",
			"K30JEDID830438DL", "WKD90JASKJKLJSLF", "U839739DKJSOD73M",
			"JDS93MDKD9RD03KA", "JSMSKS9S033KDKPQ", "A02OD89C01524MJK",
			"NQM0182JDSDJSKSI", "LQMZBHGYISKIIW83", "KI28S0KLSOS877B3",
			"2N0A4SIL3D0A8AS9", "32KKS72932KAHOPD" };

	public Activator() {
		super();
		setLayout(null);
		setSize(350, 250);
		setPreferredSize(getSize());

		final JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		panel.setBounds(10, 10, 330, 230);
		panel.setLayout(null);
		add(panel);

		final JLabel licenseActivationSystemLabel = new JLabel();
		licenseActivationSystemLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		licenseActivationSystemLabel
				.setHorizontalTextPosition(SwingConstants.CENTER);
		licenseActivationSystemLabel
				.setHorizontalAlignment(SwingConstants.CENTER);
		licenseActivationSystemLabel.setBorder(new MatteBorder(0, 0, 1, 0,
				Color.black));
		licenseActivationSystemLabel.setBounds(10, 10, 310, 28);
		licenseActivationSystemLabel.setText("License Activation System");
		panel.add(licenseActivationSystemLabel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(
				EtchedBorder.LOWERED), "Activation Key",
				TitledBorder.DEFAULT_JUSTIFICATION,
				TitledBorder.DEFAULT_POSITION, null, null));
		panel_1.setLayout(null);
		panel_1.setBounds(10, 65, 310, 69);
		panel.add(panel_1);

		txtKey = new JFormattedTextField(FieldFormatter.KEY);
		txtKey.setBounds(10, 22, 290, 31);
		panel_1.add(txtKey);

		lblInfo = new JLabel();
		lblInfo.setText("");
		lblInfo.setBounds(10, 134, 310, 28);
		panel.add(lblInfo);

		btnCancel = new JButton();
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		btnCancel.setText("Cancel");
		btnCancel.setBounds(247, 194, 73, 26);
		panel.add(btnCancel);

		btnActivate = new JButton();
		btnActivate.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				doActivation();
			}
		});
		btnActivate.setText("Activate");
		btnActivate.setBounds(161, 194, 80, 26);
		panel.add(btnActivate);
	}

	private void doActivation() {
		ActivationLicense ref = null;
		try {
			ref = MedrexClientManager.getInstance().getActivationLicense(
					new Date());
		} catch (RemoteException e) {
			lblInfo.setText("Connection with server exhausted !!!");
			lblInfo.setForeground(Color.RED);
			return;
		} catch (MedrexException e) {
			lblInfo
					.setText("An error occured while retrieving your existing license information !!!");
			lblInfo.setForeground(Color.RED);
			return;
		} catch (Exception e) {
			lblInfo.setText("Unexpected error occured during Activation !!!");
			lblInfo.setForeground(Color.RED);
			return;
		}

		if (ref != null) {
			final SimpleDateFormat df = new SimpleDateFormat("MMMM dd, yyyy");
			lblInfo.setText("Your software has a valid license till "
					+ df.format(ref.getEndDate()));
			lblInfo.setForeground(Color.GREEN);
			return;
		}

		String inputKey = (String) txtKey.getValue();

		if (inputKey != null && inputKey.trim().length() == 16) {
			boolean success = activate(inputKey.trim().toUpperCase());
			if (success) {
				txtKey.setValue("");
				lblInfo.setText("Activation successfull !!!");
				lblInfo.setForeground(Color.GREEN);
				return;
			} else {
				lblInfo
						.setText("Valid Activation Key but activation failed !!!");
				lblInfo.setForeground(Color.RED);
				return;
			}
		} else {
			lblInfo.setText("Invalid Activation Key !!!");
			lblInfo.setForeground(Color.RED);
			return;
		}
	}

	public boolean activate(String inputKey) {
		int index = -1;
		for (int i = 0; i < KEYS.length; i++) {
			if (KEYS[i].equals(inputKey)) {
				index = i;
			}
		}

		/* Key not valid */
		if (index == -1) {
			return false;
		}

		/* Valid key, determine start and expiry date */
		final GregorianCalendar cal = new GregorianCalendar();
		cal.set(Calendar.YEAR, 2010);
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DATE, 5);

		System.out.println(cal.getTime());
		cal.add(Calendar.MONTH, index);
		cal.set(Calendar.DATE, 5);

		final Date startDate = cal.getTime();

		cal.add(Calendar.MONTH, 1);
		cal.add(Calendar.DATE, -1);
		final Date expiryDate = cal.getTime();

		Date curDate = new Date();
		if (!(curDate.after(startDate) && curDate.before(expiryDate))) {
			return false;
		}

		ActivationLicense license = new ActivationLicense();
		license.setActivated(true);
		license.setStartDate(startDate);
		license.setEndDate(expiryDate);

		try {
			MedrexClientManager.getInstance().insertOrUpdateActivationLicense(
					license);
		} catch (Exception e) {
			return false;
		}

		return true;
	}

	public static boolean isValidLicense() {
		// try {
		// return MedrexClientManager.getInstance().isActivationLicenseValid();
		// } catch (Exception e) {
		// return false;
		// }
		return true;
	}

	@Override
	public String getTitle() {
		return "Medrex License Activation System";
	}

	public static void main(String[] args) {
		Activator activationSystem = new Activator();
		SwingUtils.openInDialog(activationSystem);
	}
}
