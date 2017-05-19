package medrex.client.main.physicanOrders.physicianOrderScreen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderRecord;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.RehabilitationRestrorative;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;

public class PanelRehabilitationRestrorative extends JxPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 178851446036160473L;
	private JxButton deleteButton;
	private JxButton saveButton;
	private JxButton addnewButton;
	private JTextField txtDays;
	private JComboBox cmbRestrotiveFrequency;
	private JTextField txtType;
	private JCheckBox cbBendm;
	private JCheckBox cbCrossLege;
	private JCheckBox cbRemove;
	private JTextField txtApplyFrequencyHip;
	private JComboBox cmbDefaultShift;
	private JTextField txtFrequencySplints;
	private JComboBox cmbApply;
	private JComboBox cmbDuration;
	private JTextField txtSession;
	private JComboBox cmbFrequencyRehab;
	private JComboBox cmbDiscipline;
	private JCheckBox cbSteval;
	private JCheckBox cbOteval;
	private JCheckBox cbPteval;
	private JTextField txtTreatment;

	public PanelRehabilitationRestrorative() {
		super();
		Global.panelRehabilitationRestrorative = this;
		setBorder(new LineBorder(Color.black, 1, false));
		setBackground(Color.WHITE);
		setArc(1.0f);
		setLayout(new BorderLayout());

		final JLabel skinCareManagemrntLabel = new JLabel();
		skinCareManagemrntLabel.setForeground(ColorConstants.DEF_COLOR);
		skinCareManagemrntLabel.setHorizontalAlignment(SwingConstants.CENTER);
		skinCareManagemrntLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		skinCareManagemrntLabel.setPreferredSize(new Dimension(0, 20));
		skinCareManagemrntLabel.setText("REHABILITATION");
		add(skinCareManagemrntLabel, BorderLayout.NORTH);

		final JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.CENTER);

		cbPteval = new JCheckBox();
		cbPteval.setFont(new Font("Tahoma", Font.BOLD, 12));
		cbPteval.setForeground(ColorConstants.DEF_COLOR);
		cbPteval.setBackground(Color.WHITE);
		cbPteval.setBounds(20, 0, 115, 15);
		cbPteval.setText("PT EVAL");
		panel.add(cbPteval);

		cbOteval = new JCheckBox();
		cbOteval.setFont(new Font("Tahoma", Font.BOLD, 12));
		cbOteval.setForeground(ColorConstants.DEF_COLOR);
		cbOteval.setBackground(Color.WHITE);
		cbOteval.setBounds(20, 20, 115, 15);
		cbOteval.setText("OT EVAL");
		panel.add(cbOteval);

		cbSteval = new JCheckBox();
		cbSteval.setFont(new Font("Tahoma", Font.BOLD, 12));
		cbSteval.setForeground(ColorConstants.DEF_COLOR);
		cbSteval.setBackground(Color.WHITE);
		cbSteval.setBounds(20, 40, 144, 15);
		cbSteval.setText("ST EVAL");
		panel.add(cbSteval);

		final JLabel rehabOrdersLabel = new JLabel();
		rehabOrdersLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		rehabOrdersLabel.setForeground(ColorConstants.DEF_COLOR);
		rehabOrdersLabel.setText("REHAB ORDERS:");
		rehabOrdersLabel.setBounds(20, 65, 160, 15);
		panel.add(rehabOrdersLabel);

		final JLabel DISCIPLINE = new JLabel();
		DISCIPLINE.setFont(new Font("Tahoma", Font.BOLD, 12));
		DISCIPLINE.setForeground(ColorConstants.DEF_COLOR);
		DISCIPLINE.setText("DISCIPLINE");
		DISCIPLINE.setBounds(20, 85, 73, 15);
		panel.add(DISCIPLINE);

		cmbDiscipline = new JComboBox();
		cmbDiscipline.setForeground(ColorConstants.DEF_COLOR);
		cmbDiscipline.setModel(new DefaultComboBoxModel(new String[] { "",
				"PT", "OT", "ST" }));
		cmbDiscipline.setBackground(Color.WHITE);
		cmbDiscipline.setFont(new Font("Tahoma", Font.BOLD, 10));
		cmbDiscipline.setBounds(100, 85, 128, 16);
		panel.add(cmbDiscipline);

		final JLabel TREATMENT = new JLabel();
		TREATMENT.setFont(new Font("Tahoma", Font.BOLD, 12));

		TREATMENT.setForeground(ColorConstants.DEF_COLOR);
		TREATMENT.setText("TREATMENT");
		TREATMENT.setBounds(20, 105, 80, 16);
		panel.add(TREATMENT);

		txtTreatment = new JTextField();
		txtTreatment.setForeground(ColorConstants.DEF_COLOR);
		txtTreatment.setBounds(100, 105, 75, 15);
		panel.add(txtTreatment);

		final JLabel TREATMENT_1 = new JLabel();
		TREATMENT_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		TREATMENT_1.setForeground(ColorConstants.DEF_COLOR);
		TREATMENT_1.setText("FREQUENCY");
		TREATMENT_1.setBounds(190, 105, 75, 15);
		panel.add(TREATMENT_1);

		cmbFrequencyRehab = new JComboBox();
		cmbFrequencyRehab.setForeground(ColorConstants.DEF_COLOR);
		cmbFrequencyRehab.setModel(new DefaultComboBoxModel(new String[] { "",
				"dailytwiceaday" }));
		cmbFrequencyRehab.setFont(new Font("Tahoma", Font.BOLD, 10));
		cmbFrequencyRehab.setBackground(Color.WHITE);
		cmbFrequencyRehab.setBounds(265, 105, 100, 15);
		panel.add(cmbFrequencyRehab);

		final JLabel TREATMENT_2 = new JLabel();
		TREATMENT_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		TREATMENT_2.setForeground(ColorConstants.DEF_COLOR);
		TREATMENT_2.setText("SESSION");
		TREATMENT_2.setBounds(375, 105, 65, 15);
		panel.add(TREATMENT_2);

		txtSession = new JTextField();
		txtSession.setForeground(ColorConstants.DEF_COLOR);
		txtSession.setBounds(440, 105, 60, 15);
		panel.add(txtSession);

		final JLabel TREATMENT_2_1 = new JLabel();
		TREATMENT_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		TREATMENT_2_1.setForeground(ColorConstants.DEF_COLOR);
		TREATMENT_2_1.setText("DURATION");
		TREATMENT_2_1.setBounds(505, 105, 80, 15);
		panel.add(TREATMENT_2_1);

		cmbDuration = new JComboBox();
		cmbDuration.setForeground(ColorConstants.DEF_COLOR);
		cmbDuration.setModel(new DefaultComboBoxModel(new String[] { "",
				"1 week", "2 week", "3 week", "4 week", "5 week", "6 week",
				"7 week", "8 week" }));
		cmbDuration.setFont(new Font("Tahoma", Font.BOLD, 10));
		cmbDuration.setBackground(Color.WHITE);
		cmbDuration.setBounds(580, 105, 75, 15);
		panel.add(cmbDuration);

		final JLabel TREATMENT_3 = new JLabel();
		TREATMENT_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		TREATMENT_3.setForeground(ColorConstants.DEF_COLOR);
		TREATMENT_3.setForeground(ColorConstants.DEF_COLOR);
		TREATMENT_3.setText("SPLINTS :");
		TREATMENT_3.setBounds(20, 130, 86, 15);
		panel.add(TREATMENT_3);

		final JLabel TREATMENT_4 = new JLabel();
		TREATMENT_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		TREATMENT_4.setForeground(ColorConstants.DEF_COLOR);
		TREATMENT_4.setText("APPLY TO");
		TREATMENT_4.setBounds(30, 150, 94, 15);
		panel.add(TREATMENT_4);

		cmbApply = new JComboBox();
		cmbApply.setForeground(ColorConstants.DEF_COLOR);
		cmbApply.setModel(new DefaultComboBoxModel(new String[] { "",
				"UPPER EXTREMLTY L/C/BILAT", "LOWER EXTREMLTY L/R/BILAT" }));
		cmbApply.setFont(new Font("Tahoma", Font.BOLD, 10));
		cmbApply.setBackground(Color.WHITE);
		cmbApply.setBounds(170, 150, 85, 16);
		panel.add(cmbApply);

		final JLabel TREATMENT_1_1 = new JLabel();
		TREATMENT_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		TREATMENT_1_1.setForeground(ColorConstants.DEF_COLOR);
		TREATMENT_1_1.setText("FREQUENCY");
		TREATMENT_1_1.setBounds(30, 170, 110, 15);
		panel.add(TREATMENT_1_1);

		txtFrequencySplints = new JTextField();
		txtFrequencySplints.setForeground(ColorConstants.DEF_COLOR);
		txtFrequencySplints.setBounds(170, 170, 85, 15);
		panel.add(txtFrequencySplints);

		cbRemove = new JCheckBox();
		cbRemove.setBackground(Color.WHITE);
		cbRemove.setForeground(ColorConstants.DEF_COLOR);
		cbRemove.setFont(new Font("Tahoma", Font.BOLD, 12));

		cbRemove.setText("REMOVE EVERY");
		cbRemove.setBounds(30, 190, 123, 15);
		panel.add(cbRemove);

		cmbDefaultShift = new JComboBox();
		cmbDefaultShift.setForeground(ColorConstants.DEF_COLOR);
		cmbDefaultShift.setModel(new DefaultComboBoxModel(
				new String[] { "", "1 hour", "2 hour", "3 hour", "4 hour",
						"5 hour", "6 hour", "" }));
		cmbDefaultShift.setFont(new Font("Tahoma", Font.BOLD, 10));
		cmbDefaultShift.setBackground(Color.WHITE);
		cmbDefaultShift.setBounds(170, 190, 85, 16);
		panel.add(cmbDefaultShift);

		final JLabel rehabOrdersLabel_1 = new JLabel();
		rehabOrdersLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		rehabOrdersLabel_1.setForeground(ColorConstants.DEF_COLOR);
		rehabOrdersLabel_1.setText("TO CHECK SCAN INTERGITY");
		rehabOrdersLabel_1.setBounds(270, 190, 153, 16);
		panel.add(rehabOrdersLabel_1);

		final JLabel TREATMENT_3_1 = new JLabel();
		TREATMENT_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		TREATMENT_3_1.setForeground(ColorConstants.DEF_COLOR);
		TREATMENT_3_1.setText("HIP REPLACEMENT");
		TREATMENT_3_1.setBounds(20, 215, 160, 15);
		panel.add(TREATMENT_3_1);

		final JLabel TREATMENT_4_1 = new JLabel();
		TREATMENT_4_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		TREATMENT_4_1.setForeground(ColorConstants.DEF_COLOR);
		TREATMENT_4_1.setText("APPLY FREQUENCY");
		TREATMENT_4_1.setBounds(30, 235, 128, 15);
		panel.add(TREATMENT_4_1);

		txtApplyFrequencyHip = new JTextField();
		txtApplyFrequencyHip.setForeground(ColorConstants.DEF_COLOR);
		txtApplyFrequencyHip.setBounds(170, 235, 85, 15);
		panel.add(txtApplyFrequencyHip);

		cbCrossLege = new JCheckBox();
		cbCrossLege.setBackground(Color.WHITE);
		cbCrossLege.setFont(new Font("Tahoma", Font.BOLD, 12));
		cbCrossLege.setForeground(ColorConstants.DEF_COLOR);
		cbCrossLege.setText("DO NOT CROSS LEGS");
		cbCrossLege.setBounds(50, 255, 157, 15);
		panel.add(cbCrossLege);

		cbBendm = new JCheckBox();
		cbBendm.setFont(new Font("Tahoma", Font.BOLD, 12));
		cbBendm.setForeground(ColorConstants.DEF_COLOR);
		cbBendm.setBackground(Color.WHITE);
		cbBendm.setText("DO NOT BENDM 90");
		cbBendm.setBounds(50, 275, 174, 15);
		panel.add(cbBendm);

		final JLabel TREATMENT_3_2 = new JLabel();
		TREATMENT_3_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		TREATMENT_3_2.setForeground(ColorConstants.DEF_COLOR);
		TREATMENT_3_2.setText("RESTRORATIVE");
		TREATMENT_3_2.setBounds(20, 300, 123, 15);
		panel.add(TREATMENT_3_2);

		final JLabel TREATMENT_4_2 = new JLabel();
		TREATMENT_4_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		TREATMENT_4_2.setForeground(ColorConstants.DEF_COLOR);
		TREATMENT_4_2.setText("TYPE");
		TREATMENT_4_2.setBounds(30, 320, 50, 15);
		panel.add(TREATMENT_4_2);

		txtType = new JTextField();
		txtType.setForeground(ColorConstants.DEF_COLOR);
		txtType.setBounds(125, 320, 155, 15);
		panel.add(txtType);

		final JLabel TREATMENT_4_2_1 = new JLabel();
		TREATMENT_4_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		TREATMENT_4_2_1.setForeground(ColorConstants.DEF_COLOR);
		TREATMENT_4_2_1.setText("FREQUENCY");
		TREATMENT_4_2_1.setBounds(30, 340, 93, 15);
		panel.add(TREATMENT_4_2_1);

		cmbRestrotiveFrequency = new JComboBox();
		cmbRestrotiveFrequency.setForeground(ColorConstants.DEF_COLOR);
		cmbRestrotiveFrequency.setModel(new DefaultComboBoxModel(new String[] {
				"", "DAILY", "BOI", "TID", "QID" }));
		cmbRestrotiveFrequency.setFont(new Font("Tahoma", Font.BOLD, 10));
		cmbRestrotiveFrequency.setBackground(Color.WHITE);
		cmbRestrotiveFrequency.setBounds(125, 340, 155, 15);
		panel.add(cmbRestrotiveFrequency);

		final JLabel TREATMENT_4_2_1_1 = new JLabel();
		TREATMENT_4_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		TREATMENT_4_2_1_1.setForeground(ColorConstants.DEF_COLOR);
		TREATMENT_4_2_1_1.setText("DAYS/WK");
		TREATMENT_4_2_1_1.setBounds(30, 360, 64, 15);
		panel.add(TREATMENT_4_2_1_1);

		txtDays = new JTextField();
		txtDays.setForeground(ColorConstants.DEF_COLOR);
		txtDays.setBounds(125, 360, 155, 15);
		panel.add(txtDays);

		addnewButton = new JxButton();
		addnewButton.setBackground(Color.WHITE);
		addnewButton.setArc(0.4f);
		addnewButton.setFont(new Font("Dialog", Font.BOLD, 12));
		addnewButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				setBlankField();
				Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();
			}
		});
		addnewButton.setText("AddNew");
		addnewButton.setBounds(40, 410, 75, 20);
		addnewButton.setForeground(ColorConstants.DEF_COLOR);
		panel.add(addnewButton);

		saveButton = new JxButton();
		saveButton.setFont(new Font("Dialog", Font.BOLD, 12));
		saveButton.setBackground(Color.WHITE);
		saveButton.setArc(0.4f);
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSave();
				setBlankField();
				Global.framePhysicianOrder.dispose();
			}
		});
		saveButton.setText("Save");
		saveButton.setBounds(140, 410, 75, 20);
		saveButton.setForeground(ColorConstants.DEF_COLOR);
		panel.add(saveButton);

		deleteButton = new JxButton();
		deleteButton.setFont(new Font("Dialog", Font.BOLD, 12));
		deleteButton.setBackground(Color.WHITE);
		deleteButton.setArc(0.4f);
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doDelete();
				setBlankField();
			}
		});
		deleteButton.setForeground(ColorConstants.DEF_COLOR);
		deleteButton.setText("Delete");

		deleteButton.setBounds(240, 410, 75, 20);
		panel.add(deleteButton);
	}

	public void doDelete() {
		try {
			if (Global.currentPhysicianOrderRecordKey != 0
					&& Global.currentRehabilitationRestrorativekey != 0) {
				MedrexClientManager.getInstance().deletePhysicianOrderRecord(
						Global.currentPhysicianOrderRecordKey);
				MedrexClientManager.getInstance()
						.deleteRehabilitationRestrorative(
								Global.currentRehabilitationRestrorativekey);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();
	}

	public void doSave() {

		RehabilitationRestrorative refRehabilitationRestrorative = new RehabilitationRestrorative();
		refRehabilitationRestrorative.setResidentId(Global.currentResidenceKey);

		refRehabilitationRestrorative
				.setSerial(Global.currentRehabilitationRestrorativekey);
		refRehabilitationRestrorative.setDays(txtDays.getText());
		refRehabilitationRestrorative
				.setRestrotiveFrequency((String) cmbRestrotiveFrequency
						.getSelectedItem());
		refRehabilitationRestrorative.setType(txtType.getText());
		refRehabilitationRestrorative.setBendm(cbBendm.isSelected());
		refRehabilitationRestrorative.setCrossLege(cbCrossLege.isSelected());
		refRehabilitationRestrorative.setRemove(cbRemove.isSelected());
		refRehabilitationRestrorative.setApplyFrequencyHip(txtApplyFrequencyHip
				.getText());
		refRehabilitationRestrorative.setDefaultShift((String) cmbDefaultShift
				.getSelectedItem());
		refRehabilitationRestrorative.setFrequencySplints(txtFrequencySplints
				.getText());
		refRehabilitationRestrorative.setApply((String) cmbApply
				.getSelectedItem());
		refRehabilitationRestrorative.setDuration((String) cmbDuration
				.getSelectedItem());
		refRehabilitationRestrorative.setSession(txtSession.getText());
		refRehabilitationRestrorative
				.setFrequencyRehab((String) cmbFrequencyRehab.getSelectedItem());
		refRehabilitationRestrorative.setDiscipline((String) cmbDiscipline
				.getSelectedItem());
		refRehabilitationRestrorative.setSteval(cbSteval.isSelected());
		refRehabilitationRestrorative.setOteval(cbOteval.isSelected());
		refRehabilitationRestrorative.setPteval(cbPteval.isSelected());
		try {
			Global.currentRehabilitationRestrorativekey = MedrexClientManager
					.getInstance().insertOrUpdateRehabilitationRestrorative(
							refRehabilitationRestrorative);
		} catch (Exception e) {
		}
		PhysicianOrderRecord physRec = new PhysicianOrderRecord();
		physRec.setDateCreated(MedrexClientManager.getServerTime());
		physRec.setLastModified(MedrexClientManager.getServerTime());
		physRec.setFormId(Global.currentRehabilitationRestrorativekey);
		physRec.setFormType("Restrorative");
	//	physRec.setResidentId(Global.currentResidenceKey);
		   ResidentMain resmain = null;
			try{
				resmain = MedrexClientManager.getInstance().getResident(Global.currentResidenceKey);
				
			}
			
			catch (Exception e) {
	                
	                  e.printStackTrace();


			 
			}
			physRec.setResidents(resmain);

		
		
		physRec.setStatus("");
		physRec.setTitle(cmbDiscipline.getSelectedItem().toString());
		//physRec.setUser(Global.currentLoggedInUserKey);

		Users user = null;
		try{
			user = MedrexClientManager.getInstance().getUser(Global.currentLoggedInUserKey);
			
		}
		
		catch (Exception e) {
                  e.printStackTrace();


		 
		}
		 
		physRec.setUser(user);
		physRec.setSerial(Global.currentPhysicianOrderRecordKey);

		try {
			Global.currentRehabilitationRestrorativekey = MedrexClientManager
					.getInstance().insertOrUpdatePhysicianOrderRecord(physRec);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (Global.panelPhysicianOrderDetails != null) {
			Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();
		}
		setBlankField();

	}

	public void setValueObject(
			RehabilitationRestrorative refRehabilitationRestrorative) {

		txtDays.setText(refRehabilitationRestrorative.getDays());
		cmbRestrotiveFrequency.setSelectedItem(refRehabilitationRestrorative
				.getRestrotiveFrequency());
		txtType.setText(refRehabilitationRestrorative.getType());
		cbBendm.setSelected(refRehabilitationRestrorative.isBendm());
		cbCrossLege.setSelected(refRehabilitationRestrorative.isCrossLege());
		cbRemove.setSelected(refRehabilitationRestrorative.isRemove());
		txtApplyFrequencyHip.setText(refRehabilitationRestrorative
				.getApplyFrequencyHip());
		cmbDefaultShift.setSelectedItem(refRehabilitationRestrorative
				.getDefaultShift());
		txtFrequencySplints.setText(refRehabilitationRestrorative
				.getFrequencySplints());
		cmbApply.setSelectedItem(refRehabilitationRestrorative.getApply());
		cmbDuration
				.setSelectedItem(refRehabilitationRestrorative.getDuration());
		txtSession.setText(refRehabilitationRestrorative.getSession());
		cmbFrequencyRehab.setSelectedItem(refRehabilitationRestrorative
				.getFrequencyRehab());
		cmbDiscipline.setSelectedItem(refRehabilitationRestrorative
				.getDiscipline());
		cbSteval.setSelected(refRehabilitationRestrorative.isSteval());
		cbOteval.setSelected(refRehabilitationRestrorative.isOteval());
		cbPteval.setSelected(refRehabilitationRestrorative.isPteval());

	}

	public void setBlankField() {
		Global.currentRehabilitationRestrorativekey = 0;
		Global.currentPhysicianOrderRecordKey = 0;
		txtDays.setText("");
		cmbRestrotiveFrequency.setSelectedItem("");
		txtType.setText("");
		cbBendm.setSelected(false);
		cbCrossLege.setSelected(false);
		cbRemove.setSelected(false);
		txtApplyFrequencyHip.setText("");
		cmbDefaultShift.setSelectedItem("");
		txtFrequencySplints.setText("");
		cmbApply.setSelectedItem("");
		cmbDuration.setSelectedItem("");
		txtSession.setText("");
		cmbFrequencyRehab.setSelectedItem("");
		cmbDiscipline.setSelectedItem("");
		cbSteval.setSelected(false);
		cbOteval.setSelected(false);
		cbPteval.setSelected(false);
		txtTreatment.setText("");

	}
}
