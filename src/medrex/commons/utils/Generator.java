package medrex.commons.utils;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class Generator extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6974784338843149893L;
	private JTextField textField;
	private static final String[] KEYS = { "KJASKJKLJSLFU839",
			"K30JEDID830438DL", "WKD90JASKJKLJSLF", "U839739DKJSOD73M",
			"JDS93MDKD9RD03KA", "JSMSKS9S033KDKPQ", "A02OD89C01524MJK",
			"NQM0182JDSDJSKSI", "LQMZBHGYISKIIW83", "KI28S0KLSOS877B3",
			"2N0A4SIL3D0A8AS9", "32KKS72932KAHOPD" };

	public Generator() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(800, 600);
		getContentPane().setLayout(null);
		getContentPane().setSize(800, 600);

		String[] nh = { "Plaza Nursing Home (YRTFGDDI)" };
		JList listNusingHome = new JList(nh);
		listNusingHome.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listNusingHome.setSelectedIndex(0);

		listNusingHome.setBounds(10, 79, 245, 260);
		getContentPane().add(listNusingHome);

		String[] dt = { "5 Dec 2010 - 4 Jan 2011", "5 Jan 2010 - 4 Feb 2011",
				"5 Feb 2011 - 4 Mar 2011", "5 Mar 2011 - 4 Apr 2011",
				"5 Apr 2010 - 4 May 2011", "5 May 2011 - 4 June 2011",
				"5 June 2011 - 4 July 2011", "5 July 2011 - 4 Aug 2011",
				"5 Aug 2011 - 4 Sep 2011", "5 Sep 2011 - 4 Oct 2011",
				"5 Oct 2011 - 4 Nov 2011", "5 Nov 2011 - 4 Dec 2011" };
		final JList listDate = new JList(dt);
		listDate.setBounds(329, 79, 256, 260);
		listDate.setSelectedIndex(0);
		getContentPane().add(listDate);

		textField = new JTextField();
		textField.setBounds(329, 350, 245, 31);
		getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnGenerateKey = new JButton("Generate Key");
		btnGenerateKey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(KEYS[listDate.getSelectedIndex()]);
				JOptionPane.showMessageDialog(null, KEYS[listDate
						.getSelectedIndex()]);
			}
		});
		btnGenerateKey.setBounds(26, 353, 187, 31);
		getContentPane().add(btnGenerateKey);

		JLabel lblLicenseGenerator = new JLabel("License Generator");
		lblLicenseGenerator.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLicenseGenerator.setBounds(252, 11, 157, 14);
		getContentPane().add(lblLicenseGenerator);

		JLabel lblSelectNursingHome = new JLabel("Select Nursing Home");
		lblSelectNursingHome.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSelectNursingHome.setBounds(10, 54, 245, 14);
		getContentPane().add(lblSelectNursingHome);

		JLabel lblSelectLicensePeriod = new JLabel("Select License period");
		lblSelectLicensePeriod.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSelectLicensePeriod.setBounds(329, 54, 245, 14);
		getContentPane().add(lblSelectLicensePeriod);
		setVisible(true);

	}

	public static void main(String args[]) {
		new Generator();
	}
}
