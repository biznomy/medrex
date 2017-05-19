package medrex.client.main.resident.allergies;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.border.BevelBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.vo.resident.ResidentAllergies;

public class FrameResidentAllergiesConfirm extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2927331577763951558L;
	private JList lstConfirmNot;
	private JList lstConfirm;
	private List listConfirm;
	private List listConfirmNot;
	private Comparator comparator;
	private ListCellRenderer cell;

	public FrameResidentAllergiesConfirm() {
		super();
		setTitle("Resident Allergies");
		setModal(true);
		setSize(new Dimension(440, 409));
		SwingUtils.center(this);
		getContentPane().setLayout(new BorderLayout());

		final JPanel panel = new JPanel();
		panel.setLayout(null);
		getContentPane().add(panel);

		cell = new DefaultListCellRenderer() {
			/**
			 * 
			 */
			private static final long serialVersionUID = -3607674829673382573L;

			@Override
			public Component getListCellRendererComponent(JList list,
					Object value, int index, boolean isSelected,
					boolean cellHasFocus) {
				JLabel renderer = (JLabel) super.getListCellRendererComponent(
						list, value, index, isSelected, cellHasFocus);
				if (value instanceof ResidentAllergies) {
					ResidentAllergies allergy = (ResidentAllergies) value;
					renderer.setText(allergy.getName());
				}
				return renderer;
			}
		};

		comparator = new Comparator() {
			// +ve if a > b
			// 0 if a = b
			// -ve if a < b
			public int compare(Object a, Object b) {
				ResidentAllergies aAllergy = (ResidentAllergies) a, bAllergy = (ResidentAllergies) b;
				return aAllergy.getName().compareToIgnoreCase(
						bAllergy.getName());
			}
		};

		lstConfirm = new JList();
		lstConfirm.setBorder(new BevelBorder(BevelBorder.LOWERED));
		lstConfirm.setFixedCellHeight(20);
		lstConfirm.setCellRenderer(cell);
		lstConfirm.setBounds(238, 42, 182, 277);
		panel.add(lstConfirm);

		lstConfirmNot = new JList();
		lstConfirmNot.setBorder(new BevelBorder(BevelBorder.LOWERED));
		lstConfirmNot.setFixedCellHeight(20);
		lstConfirmNot.setCellRenderer(cell);
		lstConfirmNot.setBounds(10, 42, 182, 277);
		panel.add(lstConfirmNot);

		final JLabel allergiesToBeLabel = new JLabel();
		allergiesToBeLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		allergiesToBeLabel.setText("Allergies to be confirmed:");
		allergiesToBeLabel.setBounds(10, 10, 171, 26);
		panel.add(allergiesToBeLabel);

		final JLabel confirmedAllergiesLabel = new JLabel();
		confirmedAllergiesLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		confirmedAllergiesLabel.setText("Confirmed Allergies:");
		confirmedAllergiesLabel.setBounds(249, 10, 171, 26);
		panel.add(confirmedAllergiesLabel);

		final JButton btnConfirm = new JButton();
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Object[] values = lstConfirmNot.getSelectedValues();
				for (int i = 0; i < values.length; i++) {
					ResidentAllergies allergy = (ResidentAllergies) values[i];
					allergy.setConfirmed(true);
					try {
						MedrexClientManager.getInstance()
								.insertOrUpdateResidentAllergies(allergy);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				lstConfirmNot.setSelectedIndex(-1);
				updateLists();
			}
		});
		btnConfirm.setFont(new Font("Dialog", Font.BOLD, 12));
		btnConfirm.setText(">>");
		btnConfirm.setBounds(198, 81, 34, 55);
		panel.add(btnConfirm);

		final JButton btnConfirmNot = new JButton();
		btnConfirmNot.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Object[] values = lstConfirm.getSelectedValues();
				for (int i = 0; i < values.length; i++) {
					ResidentAllergies allergy = (ResidentAllergies) values[i];
					allergy.setConfirmed(false);
					try {
						MedrexClientManager.getInstance()
								.insertOrUpdateResidentAllergies(allergy);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				lstConfirm.setSelectedIndex(-1);
				updateLists();
			}
		});
		btnConfirmNot.setFont(new Font("Dialog", Font.BOLD, 12));
		btnConfirmNot.setText("<<");
		btnConfirmNot.setBounds(198, 216, 34, 64);
		panel.add(btnConfirmNot);

		final JButton okButton = new JButton();
		okButton.setFont(new Font("Dialog", Font.BOLD, 12));
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				disposeMe();
			}
		});
		okButton.setText("Ok");
		okButton.setBounds(340, 339, 82, 26);
		panel.add(okButton);

		fillCombos();
	}

	private void fillCombos() {
		updateLists();
	}

	private void disposeMe() {
		dispose();
	}

	@SuppressWarnings("unchecked")
	private void updateLists() {
		listConfirm = new ArrayList();
		listConfirmNot = new ArrayList();

		List allAllergies = new ArrayList();
		try {
			allAllergies = MedrexClientManager
					.getInstance()
					.getResidentAllergiesforResident(Global.currentResidenceKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int i = 0; i < allAllergies.size(); i++) {
			ResidentAllergies allergy = (ResidentAllergies) allAllergies.get(i);
			if (allergy.isConfirmed()) {
				listConfirm.add(allergy);
			} else {
				listConfirmNot.add(allergy);
			}
		}
		Collections.sort(listConfirm, comparator);
		Collections.sort(listConfirmNot, comparator);
		lstConfirm.setListData(listConfirm.toArray());
		lstConfirmNot.setListData(listConfirmNot.toArray());
	}
}
