package medrex.client.test.ra.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import medrex.client.admin.formConfig.FormConfigValidation;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.intf.AbstractPanelView;
import medrex.commons.intf.DataObject;
import medrex.commons.intf.Form;
import medrex.commons.vo.ra.RAFPg1;
import medrex.commons.vo.ra.RAFPg1Sec1;
import medrex.commons.vo.ra.RAFPg1Sec2;

public class PanelRAFPg1 extends AbstractPanelView implements Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1691519644329521242L;
	private JTextField txtLanguageNotes;
	private JTextArea txtCity;
	private JComboBox cmbLanguage;
	private JTextArea txtCommunicationNotes;
	private JTextField txtSex;
	private JTextField txtAge;
	// private JDateChooser dcDOB;
	private JCheckBox cbCommode;
	private JCheckBox cbUrinal;
	private JCheckBox cbBedPan;
	private JCheckBox cbToilet;
	private JRadioButton rbCommunicationDyphasic;
	private JRadioButton rbCommunicationAphasic;
	private JRadioButton rbCommunicationClear;
	private RAFPg1 raPg1 = null;
	private JTextField txtFirstName;
	private ButtonGroup bgCommunicationSkills = new ButtonGroup();

	private List<DataObject> dataObjects;
	private JTextField txtLastName;
	private JTextField txtRoomNumber;
	private Map<String, JComponent> myMap;
	private Map<String, String> presentationMap;
	private HashMap<String, ButtonGroup> myMap2;
	private HashMap<String, String> presentationMap2;

	// private PresentationModel presentationModel;

	public PanelRAFPg1() {
		super();
		setBorder(new MatteBorder(0, 0, 0, 0, Color.black));
		Global.panelRAFPg1 = this;
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(684, 640));

		myMap = new HashMap<String, JComponent>();
		presentationMap = new HashMap<String, String>();

		myMap2 = new HashMap<String, ButtonGroup>();
		presentationMap2 = new HashMap<String, String>();

		myMap2.put("buttonGroup", bgCommunicationSkills);
		presentationMap2.put("buttonGroup", "buttonGroup");
		final JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 684, 640);
		add(panel);

		final JLabel raPage1Label = new JLabel();
		raPage1Label.setForeground(Color.WHITE);
		raPage1Label.setOpaque(true);
		raPage1Label.setBackground(Color.BLACK);
		raPage1Label.setBorder(new LineBorder(Color.black, 1, false));
		raPage1Label.setFont(new Font("Tahoma", Font.BOLD, 16));
		raPage1Label.setHorizontalAlignment(SwingConstants.CENTER);
		raPage1Label.setBounds(0, 0, 684, 32);
		raPage1Label.setText("RESIDENT ASSESSMENT FORM");
		panel.add(raPage1Label);

		final JLabel firstnameLabel = new JLabel();
		firstnameLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		firstnameLabel.setText("FirstName:");
		firstnameLabel.setBounds(43, 65, 102, 22);
		panel.add(firstnameLabel);

		txtFirstName = new JTextField();
		myMap.put("txtFirstName", txtFirstName);
		presentationMap.put("txtFirstName", "firstName");
		txtFirstName.setEditable(true);
		txtFirstName.setBounds(173, 65, 153, 22);
		panel.add(txtFirstName);

		final JLabel lastNameLabel = new JLabel();
		lastNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lastNameLabel.setText("Last Name");
		lastNameLabel.setBounds(43, 111, 89, 14);
		panel.add(lastNameLabel);

		final JLabel roomNumberLabel = new JLabel();
		roomNumberLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		roomNumberLabel.setText("Room Number");
		roomNumberLabel.setBounds(43, 158, 91, 14);
		panel.add(roomNumberLabel);

		txtLastName = new JTextField();
		myMap.put("txtLastName", txtLastName);
		presentationMap.put("txtLastName", "lastName");
		txtLastName.setBounds(173, 108, 153, 21);
		panel.add(txtLastName);

		txtRoomNumber = new JTextField();
		myMap.put("txtRoomNumber", txtRoomNumber);
		presentationMap.put("txtRoomNumber", "roomNumber");
		txtRoomNumber.setBounds(173, 155, 153, 21);
		panel.add(txtRoomNumber);

		/*
		 * final JLabel dateOfLabel = new JLabel(); dateOfLabel.setFont(new
		 * Font("Tahoma", Font.PLAIN, 12));
		 * dateOfLabel.setText("Date of Birth"); dateOfLabel.setBounds(359, 69,
		 * 102, 14); panel.add(dateOfLabel);
		 * 
		 * dcDOB = new JDateChooser(); // label.setText("New JLabel");
		 * dcDOB.setBounds(480, 65, 145, 22); panel.add(dcDOB);
		 */
		final JLabel ageLabel = new JLabel();
		ageLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ageLabel.setText("Age");
		ageLabel.setBounds(359, 111, 54, 14);
		panel.add(ageLabel);

		final JLabel sexLabel = new JLabel();
		sexLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		sexLabel.setText("Sex");
		sexLabel.setBounds(359, 158, 54, 14);
		panel.add(sexLabel);

		txtAge = new JTextField();
		myMap.put("txtAge", txtAge);
		txtAge.setBounds(480, 108, 145, 20);
		panel.add(txtAge);

		txtSex = new JTextField();
		txtSex.setBounds(480, 155, 145, 20);
		panel.add(txtSex);

		final JLabel raPage1Label_1 = new JLabel();
		raPage1Label_1.setHorizontalAlignment(SwingConstants.CENTER);
		raPage1Label_1.setForeground(Color.WHITE);
		raPage1Label_1.setOpaque(true);
		raPage1Label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		raPage1Label_1.setBackground(Color.BLACK);
		raPage1Label_1.setBorder(new LineBorder(Color.black, 1, false));
		raPage1Label_1.setText("COMMUNICATION");
		raPage1Label_1.setBounds(0, 210, 684, 22);
		panel.add(raPage1Label_1);

		rbCommunicationClear = new JRadioButton();
		myMap.put("rbCommunicationClear", rbCommunicationClear);
		rbCommunicationClear.setActionCommand("1");
		bgCommunicationSkills.add(rbCommunicationClear);
		rbCommunicationClear.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rbCommunicationClear.setBackground(Color.WHITE);
		rbCommunicationClear.setLabel("Clear");
		rbCommunicationClear.setText("Clear");
		rbCommunicationClear.setBounds(194, 238, 89, 24);
		panel.add(rbCommunicationClear);

		rbCommunicationAphasic = new JRadioButton();
		myMap.put("rbCommunicationAphasic", rbCommunicationAphasic);
		rbCommunicationAphasic.setActionCommand("2");
		bgCommunicationSkills.add(rbCommunicationAphasic);
		rbCommunicationAphasic.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rbCommunicationAphasic.setBackground(Color.WHITE);
		rbCommunicationAphasic.setText("Aphasic");
		rbCommunicationAphasic.setBounds(330, 238, 89, 24);
		panel.add(rbCommunicationAphasic);

		rbCommunicationDyphasic = new JRadioButton();
		myMap.put("rbCommunicationDyphasic", rbCommunicationDyphasic);
		rbCommunicationDyphasic.setActionCommand("3");
		bgCommunicationSkills.add(rbCommunicationDyphasic);
		rbCommunicationDyphasic.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rbCommunicationDyphasic.setBackground(Color.WHITE);
		rbCommunicationDyphasic.setText("Dysphagia");
		rbCommunicationDyphasic.setBounds(480, 238, 89, 24);
		panel.add(rbCommunicationDyphasic);

		final JLabel communicationSkillsLabel = new JLabel();
		communicationSkillsLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		communicationSkillsLabel.setText("Communication Skills");
		communicationSkillsLabel.setBounds(25, 238, 131, 19);
		panel.add(communicationSkillsLabel);

		final JPanel panel_28 = new JPanel();
		panel_28.setBorder(new LineBorder(Color.black, 1, false));
		panel_28.setBackground(Color.WHITE);
		panel_28.setLayout(null);
		panel_28.setBounds(0, 321, 684, 146);
		panel.add(panel_28);

		final JPanel panel_30 = new JPanel();
		panel_30.setBackground(Color.BLACK);
		panel_30.setLayout(null);
		panel_30.setBounds(0, 0, 684, 26);
		panel_28.add(panel_30);

		final JLabel hearingLabel = new JLabel();
		hearingLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		hearingLabel.setForeground(Color.WHITE);
		hearingLabel.setText("BOWEL AND BLADDER EVALUATION");
		hearingLabel.setBounds(208, 0, 357, 26);
		panel_30.add(hearingLabel);

		final JPanel panel_31 = new JPanel();
		panel_31.setBackground(Color.WHITE);
		panel_31.setLayout(null);
		panel_31.setBounds(10, 28, 664, 26);
		panel_28.add(panel_31);

		final JLabel adequateLabel = new JLabel();
		adequateLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		adequateLabel.setText("Uses Toilet");
		adequateLabel.setBounds(24, 4, 224, 16);
		panel_31.add(adequateLabel);

		cbToilet = new JCheckBox();
		myMap.put("cbToilet", cbToilet);
		cbToilet.setBackground(Color.WHITE);
		cbToilet.setText("");
		cbToilet.setBounds(310, 0, 235, 24);
		panel_31.add(cbToilet);

		final JPanel panel_31_1 = new JPanel();
		panel_31_1.setBackground(Color.WHITE);
		panel_31_1.setLayout(null);
		panel_31_1.setBounds(10, 55, 664, 30);
		panel_28.add(panel_31_1);

		final JLabel adequateLabel_1 = new JLabel();
		adequateLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		adequateLabel_1.setText("Uses Bed Pan");
		adequateLabel_1.setBounds(23, 4, 255, 16);
		panel_31_1.add(adequateLabel_1);

		cbBedPan = new JCheckBox();
		myMap.put("cbBedPan", cbBedPan);
		cbBedPan.setBackground(Color.WHITE);
		cbBedPan.setText("");
		cbBedPan.setBounds(310, 0, 235, 24);
		panel_31_1.add(cbBedPan);

		final JPanel panel_31_1_1 = new JPanel();
		panel_31_1_1.setBackground(Color.WHITE);
		panel_31_1_1.setLayout(null);
		panel_31_1_1.setBounds(10, 85, 664, 30);
		panel_28.add(panel_31_1_1);

		final JLabel adequateLabel_1_1 = new JLabel();
		adequateLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		adequateLabel_1_1.setText("Urinal");
		adequateLabel_1_1.setBounds(21, 4, 133, 16);
		panel_31_1_1.add(adequateLabel_1_1);

		cbUrinal = new JCheckBox();
		myMap.put("cbUrinal", cbUrinal);
		cbUrinal.setBackground(Color.WHITE);
		cbUrinal.setText("");
		cbUrinal.setBounds(310, 0, 235, 24);
		panel_31_1_1.add(cbUrinal);

		final JPanel panel_31_1_1_1 = new JPanel();
		panel_31_1_1_1.setBackground(Color.WHITE);
		panel_31_1_1_1.setLayout(null);
		panel_31_1_1_1.setBounds(10, 115, 664, 30);
		panel_28.add(panel_31_1_1_1);

		final JLabel adequateLabel_1_1_1 = new JLabel();
		adequateLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		adequateLabel_1_1_1.setText("Bed Side Commode");
		adequateLabel_1_1_1.setBounds(21, 4, 133, 16);
		panel_31_1_1_1.add(adequateLabel_1_1_1);

		cbCommode = new JCheckBox();
		myMap.put("cbCommode", cbCommode);
		cbCommode.setBackground(Color.WHITE);
		cbCommode.setText("");
		cbCommode.setBounds(310, 4, 233, 24);
		panel_31_1_1_1.add(cbCommode);

		final JLabel languagesLabel = new JLabel();
		languagesLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		languagesLabel.setForeground(Color.WHITE);
		languagesLabel.setOpaque(true);
		languagesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		languagesLabel.setBackground(Color.BLACK);
		languagesLabel.setText("LANGUAGES");
		languagesLabel.setBounds(0, 467, 684, 22);
		panel.add(languagesLabel);

		cmbLanguage = new JComboBox();
		myMap.put("cmbLanguage", cmbLanguage);
		cmbLanguage.setModel(new DefaultComboBoxModel(new String[] { " ",
				"English", "Hindi" }));
		cmbLanguage.setBackground(Color.WHITE);
		cmbLanguage.setBounds(317, 495, 252, 20);
		panel.add(cmbLanguage);

		final JLabel languagesSpokenLabel = new JLabel();
		languagesSpokenLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		languagesSpokenLabel.setText("Languages Spoken");
		languagesSpokenLabel.setBounds(25, 498, 252, 14);
		panel.add(languagesSpokenLabel);

		final JLabel notesLabel = new JLabel();
		notesLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		notesLabel.setText("Notes");
		notesLabel.setBounds(25, 283, 110, 14);
		panel.add(notesLabel);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.black, 1, false));
		scrollPane.setBounds(194, 268, 469, 32);
		panel.add(scrollPane);

		txtCommunicationNotes = new JTextArea();
		myMap.put("txtCommunicationNotes", txtCommunicationNotes);
		scrollPane.setViewportView(txtCommunicationNotes);

		txtCity = new JTextArea();
		txtCity.setBorder(new LineBorder(Color.black, 1, false));
		txtCity.setBounds(317, 534, 252, 61);
		panel.add(txtCity);

		final JLabel cityAndStateLabel = new JLabel();
		cityAndStateLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cityAndStateLabel.setText("City And State");
		cityAndStateLabel.setBounds(25, 535, 131, 14);
		panel.add(cityAndStateLabel);

		final JLabel notesLabel_1 = new JLabel();
		notesLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		notesLabel_1.setText("Notes");
		notesLabel_1.setBounds(25, 604, 160, 14);
		panel.add(notesLabel_1);

		txtLanguageNotes = new JTextField();
		txtLanguageNotes.setBounds(317, 603, 252, 27);
		panel.add(txtLanguageNotes);
		doUpdate();

		// presentationModel = new PresentationModel(presentationMap,
		// RAFPg1.class, new ControllerRAFPg1(), errorLabel);
		//
		// presentationModel.validateAll();
	}

	public Map<String, String> getPresentationMap() {
		return presentationMap;
	}

	public HashMap<String, String> getPresentationMap2() {
		return presentationMap2;
	}

	public void setPresentationMap2(HashMap<String, String> presentationMap2) {
		this.presentationMap2 = presentationMap2;
	}

	public void setPresentationMap(Map<String, String> presentationMap) {
		this.presentationMap = presentationMap;
	}

	public void doLoad() {
	}

	@Override
	public List<DataObject> getDataObjects() {
		dataObjects = new ArrayList<DataObject>();

		RAFPg1Sec1 sec1 = new RAFPg1Sec1();
		sec1.setFirstName(txtFirstName.getText());
		sec1.setLastName(txtLastName.getText());
		sec1.setRoomNo(txtRoomNumber.getText());
		// sec1.setDateOfBirth(dcDOB.getDate());
		try {
			sec1.setAge(Integer.parseInt(txtAge.getText()));
		} catch (Exception e) {
		}
		sec1.setSex(txtSex.getText());
		dataObjects.add(sec1);

		RAFPg1Sec2 sec2 = new RAFPg1Sec2();
		sec2.setCommunicationSkill(SwingUtils
				.getSelectedButton(bgCommunicationSkills));
		sec2.setCommunicationNotes(txtCommunicationNotes.getText());
		sec2.setUsesToilet(cbToilet.isSelected());
		sec2.setUsesBedPan(cbBedPan.isSelected());
		sec2.setUrinal(cbUrinal.isSelected());
		sec2.setBedSideCommode(cbCommode.isSelected());
		sec2.setLanguageNotes(txtLanguageNotes.getText());
		sec2.setCityAndState(txtCity.getText());
		sec2.setLanguageNotes(txtLanguageNotes.getText());
		dataObjects.add(sec2);
		return dataObjects;
	}

	@Override
	public void setDataObjects(List<DataObject> dataObjectList) {
		if (dataObjectList != null) {
			RAFPg1Sec1 sec1 = null;
			RAFPg1Sec2 sec2 = null;
			for (DataObject dataObj : dataObjectList) {
				if (dataObj.getClass() == RAFPg1Sec1.class) {
					sec1 = (RAFPg1Sec1) dataObj;
				}
				if (dataObj.getClass() == RAFPg1Sec2.class) {
					sec2 = (RAFPg1Sec2) dataObj;
				}
			}
			if (sec1 != null) {
				txtFirstName.setText(sec1.getFirstName());
				txtLastName.setText(sec1.getLastName());
				txtRoomNumber.setText(sec1.getRoomNo());
				// dcDOB.setDate(sec1.getDateOfBirth());
				txtAge.setText(sec1.getAge() + "");
				txtSex.setText(sec1.getSex());
			}
			if (sec2 != null) {
				SwingUtils.setSelectedButton(bgCommunicationSkills, sec2
						.getCommunicationSkill());
				txtCommunicationNotes.setText(sec2.getCommunicationNotes());
				cbToilet.setSelected(sec2.isUseToilet());
				cbBedPan.setSelected(sec2.isUseBedPan());
				cbUrinal.setSelected(sec2.isUrinal());
				cbCommode.setSelected(sec2.isBedSideCommode());
				cmbLanguage.setSelectedItem(sec2.getLanguageSpoken());
				txtCity.setText(sec2.getCityAndState());
				txtLanguageNotes.setText(sec2.getLanguageNotes());
			}
		}
	}

	/* temporary using doSave for saving alert */
	public int doSave() {
		FormConfigValidation.saveAlertMessages(
				"Resident Assessment Form Page 1", this);
		return 0;
	}

	public void doUpdate() {
		FormConfigValidation.updateComponents(this);
	}

	public boolean doValidate() {
		/* TODO: Update call the migrated method */
		return FormConfigValidation.validate(this);
	}

	public String getTitle() {
		return "Resident Assessment Form Page 1";
	}
}
