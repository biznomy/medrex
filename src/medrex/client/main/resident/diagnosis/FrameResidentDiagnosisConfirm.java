package medrex.client.main.resident.diagnosis;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.border.BevelBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldValidation;
import medrex.client.utils.SwingUtils;
import medrex.commons.vo.general.Icd9;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.resident.ResidentDiagnosis;
import medrex.commons.vo.resident.ResidentMain;

import com.jgoodies.validation.ValidationResult;

public class FrameResidentDiagnosisConfirm extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7091459713809048940L;
	private JComboBox cmbDiagnosis;
	private JTextField txtDoFilter;
	private ButtonGroup bgFirlter = new ButtonGroup();
	private JList lstConfirmNot;
	private JList lstConfirm;
	private List listConfirm;
	private List listConfirmNot;
	private Comparator comparator;
	private ListCellRenderer cell;
	private ResidentMain resident;
	private Users loggedInUser = null;

	public FrameResidentDiagnosisConfirm() {
		super();
		setTitle("Resident Diagnosis");
		setModal(true);
		setSize(new Dimension(440, 483));
		SwingUtils.center(this);
		getContentPane().setLayout(new BorderLayout());

		final JPanel panel = new JPanel();
		panel.setLayout(null);
		getContentPane().add(panel);

		cell = new DefaultListCellRenderer() {
			/**
			 * 
			 */
			private static final long serialVersionUID = -6720715296949692152L;

			@Override
			public Component getListCellRendererComponent(JList list,
					Object value, int index, boolean isSelected,
					boolean cellHasFocus) {
				JLabel renderer = (JLabel) super.getListCellRendererComponent(
						list, value, index, isSelected, cellHasFocus);
				if (value instanceof ResidentDiagnosis) {
					ResidentDiagnosis diag = (ResidentDiagnosis) value;
					renderer.setText(diag.getName());
				}
				return renderer;
			}
		};

		comparator = new Comparator() {
			// +ve if a > b
			// 0 if a = b
			// -ve if a < b
			public int compare(Object a, Object b) {
				ResidentDiagnosis aDiag = (ResidentDiagnosis) a, bDiag = (ResidentDiagnosis) b;
				return aDiag.getName().compareToIgnoreCase(bDiag.getName());
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

		final JLabel diagnosisToBeLabel = new JLabel();
		diagnosisToBeLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		diagnosisToBeLabel.setText("Diagnosis to be confirmed:");
		diagnosisToBeLabel.setBounds(10, 10, 171, 26);
		panel.add(diagnosisToBeLabel);

		final JLabel confirmedDiagnosisLabel = new JLabel();
		confirmedDiagnosisLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		confirmedDiagnosisLabel.setText("Confirmed Diagnosis:");
		confirmedDiagnosisLabel.setBounds(249, 10, 171, 26);
		panel.add(confirmedDiagnosisLabel);

		final JButton btnConfirm = new JButton();
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Object[] values = lstConfirmNot.getSelectedValues();
				for (int i = 0; i < values.length; i++) {
					ResidentDiagnosis diag = (ResidentDiagnosis) values[i];
					diag.setConfirmed(true);
					try {
						MedrexClientManager.getInstance()
								.insertOrUpdateResidentDiagnosis(diag);
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
		btnConfirm.setEnabled(false);
		panel.add(btnConfirm);

		final JButton btnConfirmNot = new JButton();
		btnConfirmNot.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Object[] values = lstConfirm.getSelectedValues();
				for (int i = 0; i < values.length; i++) {
					ResidentDiagnosis diag = (ResidentDiagnosis) values[i];
					diag.setConfirmed(false);
					try {
						MedrexClientManager.getInstance()
								.insertOrUpdateResidentDiagnosis(diag);
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
		btnConfirmNot.setEnabled(false);
		panel.add(btnConfirmNot);

		final JButton okButton = new JButton();
		okButton.setFont(new Font("Dialog", Font.BOLD, 12));
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				disposeMe();
			}
		});
		okButton.setText("Ok");
		okButton.setBounds(338, 374, 82, 26);
		panel.add(okButton);

		final JLabel filterByLabel = new JLabel();
		filterByLabel.setText("Filter By:");
		filterByLabel.setBounds(10, 338, 50, 20);
		panel.add(filterByLabel);

		final JRadioButton codeRadioButton = new JRadioButton();
		bgFirlter.add(codeRadioButton);
		codeRadioButton.setText("Code");
		codeRadioButton.setSelected(true);
		codeRadioButton.setActionCommand("Code");
		codeRadioButton.setBounds(66, 339, 50, 18);
		panel.add(codeRadioButton);

		final JRadioButton descriptionRadioButton = new JRadioButton();
		bgFirlter.add(descriptionRadioButton);
		descriptionRadioButton.setText("Description");
		descriptionRadioButton.setBounds(117, 339, 75, 18);
		descriptionRadioButton.setActionCommand("Description");
		panel.add(descriptionRadioButton);

		txtDoFilter = new JTextField();
		txtDoFilter.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				doSearch();
			}
		});
		txtDoFilter.setBounds(198, 336, 182, 26);
		panel.add(txtDoFilter);

		cmbDiagnosis = new JComboBox();
		cmbDiagnosis.setBackground(Color.WHITE);
		cmbDiagnosis.setBounds(10, 374, 225, 21);
		panel.add(cmbDiagnosis);

		final JButton addDiagnosisButton = new JButton();
		addDiagnosisButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (doValidate()) {
					doSave();
					updateLists();
					txtDoFilter.setText("");
					cmbDiagnosis.setSelectedItem("");
				}
			}
		});
		addDiagnosisButton.setText("Add Diagnosis");
		addDiagnosisButton.setBounds(240, 374, 85, 26);
		panel.add(addDiagnosisButton);

		fillCombos();
	}

	private void fillCombos() {
		updateLists();

		// set values of ICD code in combo.
		List<String> strList = new ArrayList<String>();
		List<Icd9> icd9List = new ArrayList<Icd9>();
		try {
			loggedInUser = MedrexClientManager.getInstance().getUser(
					Global.currentLoggedInUserKey);
			resident = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
			icd9List = MedrexClientManager.getInstance().getIcd9s();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Iterator<Icd9> itr = icd9List.iterator();
		while (itr.hasNext()) {
			Icd9 icd9Code = itr.next();
			strList.add(icd9Code.getCode() + "  " + icd9Code.getName());
		}
		cmbDiagnosis.setModel(new DefaultComboBoxModel(strList.toArray()));

	}

	private void disposeMe() {
		dispose();
	}

	private boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		if (("".equalsIgnoreCase(cmbDiagnosis.getSelectedItem() + ""))
				|| (cmbDiagnosis.getSelectedItem() == null)) {
			vRes.addError("Diagnosis field is mandatory.");
		} else {
			for (int i = 0; i < lstConfirmNot.getModel().getSize(); i++) {
				ResidentDiagnosis rd = (ResidentDiagnosis) lstConfirmNot
						.getModel().getElementAt(i);
				if ((cmbDiagnosis.getSelectedItem() + "").equalsIgnoreCase(rd
						.getName())) {
					vRes.addError("Allready added.");
				}
			}
		}
		if (!FieldValidation.isEmpty(vRes)) {
			FieldValidation.Msgbox(vRes, "Diagnosis");
			return false;
		} else {
			// JOptionPane.showMessageDialog(this, "Saved successfully");
			return true;
		}
	}

	public void doSave() {
		ResidentDiagnosis ref = new ResidentDiagnosis();
		ref.setSerial(0);
		ref.setResident(resident);
		ref.setName(cmbDiagnosis.getSelectedItem().toString());
		ref.setConfirmed(false);
		ref.setDateCreated(MedrexClientManager.getServerTime());
		ref.setDiscontinued(false);
		ref.setAddedBy(loggedInUser);
		try {
			ResidentDiagnosis rd = MedrexClientManager.getInstance()
					.getLastDiagnosisAccToOrder(Global.currentResidenceKey);
			int order = rd.getOrder();
			if (order > -1) {
				ref.setOrder(order + 1);
			}
			Global.currentResidentDiagnosisKey = MedrexClientManager
					.getInstance().insertOrUpdateResidentDiagnosis(ref);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void doSearch() {
		List<String> strList = new ArrayList<String>();
		List<Icd9> icd9List = new ArrayList<Icd9>();
		// System.out.println("buttons: "+
		// buttonGroup.getSelection().getActionCommand());
		String selectedButton = bgFirlter.getSelection().getActionCommand();

		try {
			if (txtDoFilter != null) {
				icd9List = MedrexClientManager.getInstance().getIcd9s(
						txtDoFilter.getText(), selectedButton);
			} else {
				icd9List = MedrexClientManager.getInstance().getIcd9s(
						selectedButton);
			}

		} catch (Exception e) {
		}
		Iterator<Icd9> itr = icd9List.iterator();
		while (itr.hasNext()) {
			Icd9 icd9Code = itr.next();
			strList.add(icd9Code.getCode() + "  " + icd9Code.getName());
		}
		cmbDiagnosis.setModel(new DefaultComboBoxModel(strList.toArray()));
	}

	@SuppressWarnings("unchecked")
	private void updateLists() {
		listConfirm = new ArrayList();
		listConfirmNot = new ArrayList();

		List allDiagnosis = new ArrayList();
		try {
			allDiagnosis = MedrexClientManager.getInstance()
					.getResidentDiagnosiss(Global.currentResidenceKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int i = 0; i < allDiagnosis.size(); i++) {
			ResidentDiagnosis diag = (ResidentDiagnosis) allDiagnosis.get(i);
			if (diag.isConfirmed()) {
				listConfirm.add(diag);
			} else {
				listConfirmNot.add(diag);
			}
		}
		Collections.sort(listConfirm, comparator);
		Collections.sort(listConfirmNot, comparator);
		lstConfirm.setListData(listConfirm.toArray());
		lstConfirmNot.setListData(listConfirmNot.toArray());
	}
}
