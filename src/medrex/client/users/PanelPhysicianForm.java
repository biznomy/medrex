package medrex.client.users;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.others.Doctors;
import medrex.commons.vo.physician.PhysicianForm;

public class PanelPhysicianForm extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JComboBox cmbPhysicianType;

	private List l = null;

	private HashMap map = null;

	/**
	 * Create the panel
	 */
	private PanelPhysicianForm() {
		super();
		Global.panelPhysicianForm = this;
		setLayout(null);
		setPreferredSize(new Dimension(550, 500));

		final JLabel payerTypeLabel = new JLabel();
		payerTypeLabel.setFont(new Font("", Font.BOLD, 12));
		payerTypeLabel.setText("PHYSICIAN TYPE");
		payerTypeLabel.setBounds(22, 25, 118, 16);
		add(payerTypeLabel);

		cmbPhysicianType = new JComboBox();
		cmbPhysicianType.setEditable(true);
		cmbPhysicianType.setModel(new DefaultComboBoxModel(new String[] {}));
		cmbPhysicianType.setBounds(161, 21, 192, 25);
		add(cmbPhysicianType);

		final JButton btnSave = new JButton();
		btnSave.setFont(new Font("", Font.BOLD, 12));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSave();
				// Global.panelPhysicianTableForm.updatePhysicianFormJTable();
				Global.framePhysicianFormAdd.dispose();
			}
		});
		btnSave.setText("Save");
		btnSave.setBounds(107, 326, 83, 26);
		add(btnSave);

		final JButton btnCancel = new JButton();
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				Global.framePhysicianFormAdd.dispose();
			}
		});
		btnCancel.setText("Cancel");
		btnCancel.setBounds(205, 326, 83, 26);
		add(btnCancel);

		fillCombos();
		updateData();
	}

	public void fillCombos() {

		map = new HashMap();
		l = null;
		try {
			l = MedrexClientManager.getInstance().getDoctorsRecords();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Iterator i = l.iterator();
		while (i.hasNext()) {
			Doctors d = (Doctors) i.next();
			String str = d.getPhysicianSurName() + ", " + d.getPhysicianName();

			cmbPhysicianType.addItem(str);

			Integer serial = d.getSerial();

			map.put(str, serial);
		}
	}

	public void doSave() {

		PhysicianForm refPhysicianForm = new PhysicianForm();
		// refPhysicianForm.setResident(
		// MedrexClientManager.getInstance().getResident(Global.currentResidenceKey)
		// );
		refPhysicianForm.setSerial(Global.currentPhysicianKey);
		// refPhysicianForm.setPhysicianId((Integer) map.get(cmbPhysicianType
		// .getSelectedItem()));

		PhysicianForm pf = null;

		try {
			int tmpId = ((Integer) map.get(cmbPhysicianType.getSelectedItem()))
					.intValue();
			pf = MedrexClientManager.getInstance().getPhysicianForm(
					Global.currentResidenceKey, tmpId);
		} catch (Exception e) {

		}
		if (pf != null) {
			JOptionPane.showMessageDialog(null,
					"This physician is already exists");
		} else {

			try {
				Global.currentPhysicianKey = MedrexClientManager.getInstance()
						.insertOrUpdatePhysicianForm(refPhysicianForm);
			} catch (Exception e) {
			}
		}
	}

	public void updateData() {

		Doctors d = null;

		if (Global.currentPhysicianKey != 0) {
			try {
				MedrexClientManager.getInstance().getPhysicianForm(
						Global.currentPhysicianKey);
			} catch (Exception e) {

			}
			cmbPhysicianType.setSelectedItem(d.getPhysicianSurName() + ", "
					+ d.getPhysicianName());
		}
	}

}
