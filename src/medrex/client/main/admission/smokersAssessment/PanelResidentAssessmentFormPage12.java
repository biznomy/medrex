package medrex.client.main.admission.smokersAssessment;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.admission.PanelloggedInUser;
import medrex.client.utils.FieldValidation;
import medrex.client.utils.SwingUtils;
import medrex.commons.intf.Form;
import medrex.commons.vo.admission.ResidentAssessmentFormPage12;
import medrex.commons.vo.notes.Notes;
import medrex.commons.vo.others.Nurse;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;

import com.jgoodies.validation.ValidationResult;
import com.sX.swing.notes.JxNotes;
import com.toedter.calendar.JDateChooser;

public class PanelResidentAssessmentFormPage12 extends JPanel implements Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3189820107446511677L;
	private JDateChooser dcNurseVisit;
	private JLabel dateLabel;
	private JComboBox cmbNurse;
	private JLabel ifSoWhatLabel;
	private JPanel panel_3;
	private JRadioButton rbQ7No;
	private JRadioButton rbQ7Yes;
	private JxNotes txtQ6;
	private JxNotes txtQ5;
	private JRadioButton rbQ5No;
	private JRadioButton rbQ5Yes;
	private JxNotes txtQ4;
	private JRadioButton rbQ4No;
	private JRadioButton rbQ4Yes;
	private JxNotes txtQ3;
	private JRadioButton rbQ3No;
	private JRadioButton rbQ3Yes;
	private JRadioButton rbQ1No;
	private ButtonGroup bg7 = new ButtonGroup();
	private ButtonGroup bg5 = new ButtonGroup();
	private ButtonGroup bg4 = new ButtonGroup();
	private ButtonGroup bg3 = new ButtonGroup();
	private ButtonGroup bg1 = new ButtonGroup();
	private JTextField txtTargetBehaviour;
	private JTextField txtRoomNum;
	private JTextField txtResidentName;
	JCheckBox txtExclusionsUrinary;
	final JRadioButton rbQ1Yes;

	final JDateChooser dateChooser;

	JComboBox cmbAssessment;
	private Notes notestxtQ2;
	private JxNotes txtQ2;
	private Notes notestxtQ3;
	private Notes notestxtQ4;
	private Notes notestxtQ5;
	private Notes notestxtQ6;

	// If true then categories list and label will display otherwise not.
	private boolean isCategories = true;

	public PanelResidentAssessmentFormPage12() {
		super();

		// Global.panelResidentAssessmentFormPage12 = this;
		setLayout(null);

		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(930, 1200));

		final JLabel incontinenceAssessmentLabel = new JLabel();
		incontinenceAssessmentLabel.setText("BEHAVORIAL ASSESSMENT");
		incontinenceAssessmentLabel.setFont(new Font("", Font.BOLD, 16));
		incontinenceAssessmentLabel.setBounds(290, 10, 233, 16);
		add(incontinenceAssessmentLabel);

		final JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(20, 65, 898, 892);
		add(panel);

		final JLabel residentNameLabel = new JLabel();
		residentNameLabel.setText("Resident Name:");
		residentNameLabel.setBounds(39, 26, 99, 16);
		panel.add(residentNameLabel);

		txtResidentName = new JTextField();
		txtResidentName.setBounds(144, 24, 243, 20);
		panel.add(txtResidentName);

		final JLabel residentNameLabel_1 = new JLabel();
		residentNameLabel_1.setText("Date :");
		residentNameLabel_1.setBounds(419, 69, 48, 16);
		panel.add(residentNameLabel_1);

		dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("MM/dd/yyyy");
		dateChooser.setBounds(473, 65, 151, 20);
		panel.add(dateChooser);

		final JLabel roomLabel = new JLabel();
		roomLabel.setText("Room:");
		roomLabel.setBounds(413, 27, 54, 14);
		panel.add(roomLabel);

		txtRoomNum = new JTextField();
		txtRoomNum.setBounds(473, 24, 81, 20);
		panel.add(txtRoomNum);

		final JLabel asLabel = new JLabel();
		asLabel.setText("Assessment completed by");
		asLabel.setBounds(39, 71, 138, 14);
		panel.add(asLabel);

		cmbAssessment = new JComboBox();
		cmbAssessment.setBackground(Color.WHITE);
		cmbAssessment.setBounds(183, 67, 204, 21);
		panel.add(cmbAssessment);

		final JLabel targetedBehaviourLabel = new JLabel();
		targetedBehaviourLabel.setText("Targeted Behavior:");
		targetedBehaviourLabel.setBounds(39, 109, 99, 14);
		panel.add(targetedBehaviourLabel);

		txtTargetBehaviour = new JTextField();
		txtTargetBehaviour.setBounds(144, 107, 243, 20);
		panel.add(txtTargetBehaviour);

		final JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(39, 168, 812, 83);
		panel.add(panel_1);

		final JTextArea textArea = new JTextArea();
		textArea
				.setText("1. Have non-drug interventions / approaches been tried?                                                                                  If No, attempt non drug intervention(s) prior to initiation of a Medication");
		textArea.setBackground(Color.WHITE);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		textArea.setBounds(10, 10, 459, 63);
		panel_1.add(textArea);

		rbQ1Yes = new JRadioButton();
		bg1.add(rbQ1Yes);
		rbQ1Yes.setActionCommand("1");
		rbQ1Yes.setBackground(Color.WHITE);
		rbQ1Yes.setText("Yes");
		rbQ1Yes.setBounds(520, 10, 49, 18);
		panel_1.add(rbQ1Yes);

		rbQ1No = new JRadioButton();
		bg1.add(rbQ1No);
		rbQ1No.setBackground(Color.WHITE);
		rbQ1No.setActionCommand("2");
		rbQ1No.setText("No");
		rbQ1No.setBounds(575, 11, 49, 18);
		panel_1.add(rbQ1No);

		final JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(39, 257, 812, 83);
		panel.add(panel_1_1);

		final JTextArea textArea_1 = new JTextArea();
		textArea_1.setWrapStyleWord(true);
		textArea_1.setText("2.What interventions have been attempted ?");
		textArea_1.setLineWrap(true);
		textArea_1.setEditable(false);
		textArea_1.setBackground(Color.WHITE);
		textArea_1.setBounds(10, 10, 266, 18);
		panel_1_1.add(textArea_1);

		// final JScrollPane scrollPane = new JScrollPane();
		// scrollPane.setBounds(10, 34, 449, 39);
		// panel_1_1.add(scrollPane);

		notestxtQ2 = new Notes();
		notestxtQ2.setFormName("Resident Assessment Form");
		notestxtQ2.setUserId(Global.currentLoggedInUserKey);
		notestxtQ2.setNoteText("");

		txtQ2 = new JxNotes(isCategories);
		txtQ2.setNotes(notestxtQ2);
		// scrollPane.setViewportView(txtQ2);
		txtQ2.setBorder(new LineBorder(Color.black, 1, false));
		// txtQ2.setWrapStyleWord(true);
		// txtQ2.setLineWrap(true);
		txtQ2.setBackground(Color.WHITE);
		txtQ2.setBounds(10, 34, 449, 39);
		// txtQ2.setEditableNotes(false);
		panel_1_1.add(txtQ2);

		final JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(Color.WHITE);
		panel_1_2.setBounds(39, 346, 812, 105);
		panel.add(panel_1_2);

		final JTextArea textArea_2 = new JTextArea();
		textArea_2.setWrapStyleWord(true);
		textArea_2
				.setText("3. Could this behavior be due to a medical cause such as fever, pain, constipation, infection, unable to communication barrier, etc. ?");
		textArea_2.setLineWrap(true);
		textArea_2.setEditable(false);
		textArea_2.setBackground(Color.WHITE);
		textArea_2.setBounds(10, 10, 459, 38);
		panel_1_2.add(textArea_2);

		rbQ3Yes = new JRadioButton();
		rbQ3Yes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtQ3.setEditableNotes(true);
			}
		});
		bg3.add(rbQ3Yes);
		rbQ3Yes.setBackground(Color.WHITE);
		rbQ3Yes.setActionCommand("1");
		rbQ3Yes.setText("Yes");
		rbQ3Yes.setBounds(520, 10, 49, 18);
		panel_1_2.add(rbQ3Yes);

		rbQ3No = new JRadioButton();
		rbQ3No.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtQ3.setNotes(notestxtQ3);
				txtQ3.setEditableNotes(false);
			}
		});
		bg3.add(rbQ3No);
		rbQ3No.setBackground(Color.WHITE);
		rbQ3No.setActionCommand("2");
		rbQ3No.setText("No");
		rbQ3No.setBounds(575, 11, 49, 18);
		panel_1_2.add(rbQ3No);

		final JLabel ifYesExplainLabel = new JLabel();
		ifYesExplainLabel.setText("If yes, explain");
		ifYesExplainLabel.setBounds(20, 55, 79, 14);
		panel_1_2.add(ifYesExplainLabel);

		// final JScrollPane scrollPane1 = new JScrollPane();
		// scrollPane1.setBounds(94, 54, 375, 39);
		// panel_1_2.add(scrollPane1);

		notestxtQ3 = new Notes();
		notestxtQ3.setFormName("Resident Assessment Form");
		notestxtQ3.setUserId(Global.currentLoggedInUserKey);
		notestxtQ3.setNoteText("");

		txtQ3 = new JxNotes(isCategories);
		txtQ3.setNotes(notestxtQ3);
		// scrollPane1.setViewportView(txtQ3);
		txtQ3.setBorder(new LineBorder(Color.black, 1, false));
		// txtQ3.setWrapStyleWord(true);
		// txtQ3.setLineWrap(true);
		txtQ3.setBackground(UIManager.getColor("Button.background"));
		txtQ3.setBounds(94, 54, 375, 39);
		txtQ3.setEditableNotes(false);
		panel_1_2.add(txtQ3);

		final JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setBackground(Color.WHITE);
		panel_1_2_1.setBounds(39, 457, 812, 105);
		panel.add(panel_1_2_1);

		final JTextArea textArea_2_1 = new JTextArea();
		textArea_2_1.setWrapStyleWord(true);
		textArea_2_1
				.setText("4. Could this behavior be due to environmental causes such as excessive heat or cold, loud noise, too many people, too dark or light, etc ?");
		textArea_2_1.setLineWrap(true);
		textArea_2_1.setEditable(false);
		textArea_2_1.setBackground(Color.WHITE);
		textArea_2_1.setBounds(10, 10, 459, 38);
		panel_1_2_1.add(textArea_2_1);

		rbQ4Yes = new JRadioButton();
		rbQ4Yes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtQ4.setEditableNotes(true);
			}
		});
		bg4.add(rbQ4Yes);
		rbQ4Yes.setBackground(Color.WHITE);
		rbQ4Yes.setActionCommand("1");
		rbQ4Yes.setText("Yes");
		rbQ4Yes.setBounds(520, 10, 49, 18);
		panel_1_2_1.add(rbQ4Yes);

		rbQ4No = new JRadioButton();
		rbQ4No.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtQ4.setNotes(notestxtQ4);
				txtQ4.setEditableNotes(false);
			}
		});
		bg4.add(rbQ4No);
		rbQ4No.setBackground(Color.WHITE);
		rbQ4No.setActionCommand("2");
		rbQ4No.setText("No");
		rbQ4No.setBounds(575, 11, 49, 18);
		panel_1_2_1.add(rbQ4No);

		final JLabel ifYesExplainLabel_1 = new JLabel();
		ifYesExplainLabel_1.setText("If yes, explain");
		ifYesExplainLabel_1.setBounds(20, 55, 79, 14);
		panel_1_2_1.add(ifYesExplainLabel_1);

		// final JScrollPane scrollPane2 = new JScrollPane();
		// scrollPane2.setBounds(94, 54, 375, 39);
		// panel_1_2_1.add(scrollPane2);

		notestxtQ4 = new Notes();
		notestxtQ4.setFormName("Resident Assessment Form");
		notestxtQ4.setUserId(Global.currentLoggedInUserKey);

		txtQ4 = new JxNotes(isCategories);
		txtQ4.setNotes(notestxtQ4);
		// scrollPane2.setViewportView(txtQ4);
		txtQ4.setBorder(new LineBorder(Color.black, 1, false));
		// txtQ4.setWrapStyleWord(true);
		// txtQ4.setLineWrap(true);
		txtQ4.setBackground(UIManager.getColor("Button.background"));
		txtQ4.setBounds(94, 54, 375, 39);
		txtQ4.setEditableNotes(false);
		panel_1_2_1.add(txtQ4);

		final JPanel panel_1_2_1_1 = new JPanel();
		panel_1_2_1_1.setLayout(null);
		panel_1_2_1_1.setBackground(Color.WHITE);
		panel_1_2_1_1.setBounds(39, 568, 812, 105);
		panel.add(panel_1_2_1_1);

		final JTextArea textArea_2_1_1 = new JTextArea();
		textArea_2_1_1.setWrapStyleWord(true);
		textArea_2_1_1
				.setText("5. Could this behavior be related to events in the resident's life such as death of family member, change in daily routine, new C.N.A or nurse, family member visits or lack of visiting, etc.");
		textArea_2_1_1.setLineWrap(true);
		textArea_2_1_1.setEditable(false);
		textArea_2_1_1.setBackground(Color.WHITE);
		textArea_2_1_1.setBounds(10, 10, 459, 42);
		panel_1_2_1_1.add(textArea_2_1_1);

		rbQ5Yes = new JRadioButton();
		rbQ5Yes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtQ5.setEditableNotes(true);
			}
		});
		bg5.add(rbQ5Yes);
		rbQ5Yes.setBackground(Color.WHITE);
		rbQ5Yes.setActionCommand("1");
		rbQ5Yes.setText("Yes");
		rbQ5Yes.setBounds(520, 10, 49, 18);
		panel_1_2_1_1.add(rbQ5Yes);

		rbQ5No = new JRadioButton();
		rbQ5No.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtQ5.setNotes(notestxtQ5);
				txtQ5.setEditableNotes(false);
			}
		});
		bg5.add(rbQ5No);
		rbQ5No.setBackground(Color.WHITE);
		rbQ5No.setActionCommand("2");
		rbQ5No.setText("No");
		rbQ5No.setBounds(575, 11, 49, 18);
		panel_1_2_1_1.add(rbQ5No);

		final JLabel ifYesExplainLabel_1_1 = new JLabel();
		ifYesExplainLabel_1_1.setText("If yes, explain");
		ifYesExplainLabel_1_1.setBounds(20, 55, 79, 14);
		panel_1_2_1_1.add(ifYesExplainLabel_1_1);

		// final JScrollPane scrollPane3 = new JScrollPane();
		// scrollPane3.setBounds(94, 54, 375, 39);
		// panel_1_2_1_1.add(scrollPane3);

		notestxtQ5 = new Notes();
		notestxtQ5.setFormName("Resident Assessment Form");
		notestxtQ5.setUserId(Global.currentLoggedInUserKey);

		txtQ5 = new JxNotes(isCategories);
		txtQ5.setNotes(notestxtQ5);
		// scrollPane3.setViewportView(txtQ5);
		txtQ5.setBorder(new LineBorder(Color.black, 1, false));
		// txtQ5.setWrapStyleWord(true);
		// txtQ5.setLineWrap(true);
		txtQ5.setBackground(UIManager.getColor("Button.background"));
		txtQ5.setBounds(94, 54, 375, 39);
		txtQ5.setEditableNotes(false);
		panel_1_2_1_1.add(txtQ5);

		final JPanel panel_1_2_1_1_1 = new JPanel();
		panel_1_2_1_1_1.setLayout(null);
		panel_1_2_1_1_1.setBackground(Color.WHITE);
		panel_1_2_1_1_1.setBounds(39, 679, 812, 105);
		panel.add(panel_1_2_1_1_1);

		final JTextArea textArea_2_1_1_1 = new JTextArea();
		textArea_2_1_1_1.setWrapStyleWord(true);
		textArea_2_1_1_1
				.setText("6. How long has the resident been exhibiting this behavior ?");
		textArea_2_1_1_1.setLineWrap(true);
		textArea_2_1_1_1.setEditable(false);
		textArea_2_1_1_1.setBackground(Color.WHITE);
		textArea_2_1_1_1.setBounds(10, 10, 459, 42);
		panel_1_2_1_1_1.add(textArea_2_1_1_1);

		// final JScrollPane scrollPane4 = new JScrollPane();
		// scrollPane4.setBounds(94, 56, 375, 39);
		// panel_1_2_1_1_1.add(scrollPane4);

		notestxtQ6 = new Notes();
		notestxtQ6.setFormName("Resident Assessment Form");
		notestxtQ6.setUserId(Global.currentLoggedInUserKey);

		txtQ6 = new JxNotes(isCategories);
		txtQ6.setNotes(notestxtQ6);
		// scrollPane4.setViewportView(txtQ6);
		txtQ6.setBorder(new LineBorder(Color.black, 1, false));
		// txtQ6.setWrapStyleWord(true);
		// txtQ6.setLineWrap(true);
		txtQ6.setBackground(Color.WHITE);
		txtQ6.setBounds(94, 56, 375, 39);
		// txtQ6.setEditableNotes(false);
		panel_1_2_1_1_1.add(txtQ6);

		final JPanel panel_1_2_1_1_2 = new JPanel();
		panel_1_2_1_1_2.setLayout(null);
		panel_1_2_1_1_2.setBackground(Color.WHITE);
		panel_1_2_1_1_2.setBounds(39, 790, 812, 54);
		panel.add(panel_1_2_1_1_2);

		final JTextArea textArea_2_1_1_2 = new JTextArea();
		textArea_2_1_1_2.setWrapStyleWord(true);
		textArea_2_1_1_2
				.setText("7. Has the resident been added to the weekly Quality Indicator meeting for review by the interdisciplinary Team ?");
		textArea_2_1_1_2.setLineWrap(true);
		textArea_2_1_1_2.setEditable(false);
		textArea_2_1_1_2.setBackground(Color.WHITE);
		textArea_2_1_1_2.setBounds(10, 10, 459, 42);
		panel_1_2_1_1_2.add(textArea_2_1_1_2);

		rbQ7Yes = new JRadioButton();
		bg7.add(rbQ7Yes);
		rbQ7Yes.setBackground(Color.WHITE);
		rbQ7Yes.setActionCommand("1");
		rbQ7Yes.setText("Yes");
		rbQ7Yes.setBounds(520, 10, 49, 18);
		panel_1_2_1_1_2.add(rbQ7Yes);

		rbQ7No = new JRadioButton();
		bg7.add(rbQ7No);
		rbQ7No.setBackground(Color.WHITE);
		rbQ7No.setActionCommand("2");
		rbQ7No.setText("No");
		rbQ7No.setBounds(575, 11, 49, 18);
		panel_1_2_1_1_2.add(rbQ7No);

		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(20, 980, 898, 30);
		add(panel_3);

		ifSoWhatLabel = new JLabel();
		ifSoWhatLabel.setText("Nurse Signature:");
		ifSoWhatLabel.setBounds(21, 5, 91, 16);
		panel_3.add(ifSoWhatLabel);

		cmbNurse = new JComboBox();
		cmbNurse.setBackground(Color.WHITE);
		cmbNurse.setBounds(123, 4, 205, 20);
		panel_3.add(cmbNurse);

		dateLabel = new JLabel();
		dateLabel.setText("Date :");
		dateLabel.setBounds(576, 5, 42, 16);
		panel_3.add(dateLabel);

		dcNurseVisit = new JDateChooser();
		dcNurseVisit.setDate(MedrexClientManager.getServerTime());
		dcNurseVisit.setDateFormatString("MM/dd/yyyy");
		dcNurseVisit.setBounds(609, 1, 168, 26);
		panel_3.add(dcNurseVisit);

		final PanelloggedInUser panel_2 = new PanelloggedInUser();
		panel_2.setBounds(118, 3, 370, 20);
		panel_3.add(panel_2);

		doLoad();

	}

	public void doLoad() {

		fillCombos();
		doUpdate();
	}

	public void fillCombos() {
		cmbAssessment.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "Physician", "Nurse" }));

		// UserLogon ul = new UserLogon();
		// try {
		// ul = MedrexClientManager.getInstance().getcurrentUserLogon();
		// } catch (RemoteException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (MedrexException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// Users user = new Users();
		// try {
		// user = MedrexClientManager.getInstance().getUser(ul.getUserId());
		// } catch (RemoteException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (MedrexException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// cmbNurse.addItem(user.getUserName());
		try {
			List<Nurse> nurList = MedrexClientManager.getInstance()
					.getNurseRecords();
			Iterator<Nurse> i = nurList.iterator();
			while (i.hasNext()) {
				Nurse nur = i.next();
				cmbNurse.addItem(nur.getNurseSurName() + " , "
						+ nur.getNurseName());
				cmbNurse.setVisible(false);
			}
		} catch (Exception e) {
		}
	}

	public void doUpdate() {
		int resId = Global.currentResidenceKey;
		ResidentMain rm = null;
		try {
			rm = MedrexClientManager.getInstance().getResident(resId);
			txtResidentName.setText(rm.getUserName() + " " + rm.getUserPass());
			// txtRoomNum.setText(rm.getRoom());
		} catch (Exception e) {

		}

		if (Global.currentResidentAssessmentFormKey == 0) {
			Global.currentResidentAssessmentFormPage12Key = 0;

			TempRoomHistory roomHist = null;
			try {
				roomHist = MedrexClientManager.getInstance()
						.getCurrentRoomForResident(resId);
			} catch (Exception e) {
				e.printStackTrace();
			}
			/* TODO: Migrating to room history ----- Done */
			if (roomHist != null) {
				txtRoomNum.setText(roomHist.getRoom());
			}

			dateChooser.setDate(MedrexClientManager.getServerTime());
			txtTargetBehaviour.setText("");
			SwingUtils.setSelectedButton(bg1, 0);
			txtQ2.setNotes(notestxtQ2);
			SwingUtils.setSelectedButton(bg3, 0);
			txtQ3.setNotes(notestxtQ3);
			SwingUtils.setSelectedButton(bg4, 0);
			txtQ4.setNotes(notestxtQ4);
			SwingUtils.setSelectedButton(bg5, 0);
			txtQ5.setNotes(notestxtQ5);
			txtQ6.setNotes(notestxtQ6);
			SwingUtils.setSelectedButton(bg7, 0);

			/*
			 * Users users = null;
			 * 
			 * try { users =MedrexClientManager.getInstance().getUser(Global.
			 * currentLoggedInUserKey);
			 * 
			 * if (users.getUserType().equalsIgnoreCase("Nurse")) {
			 * 
			 * Nurse n = (Nurse)
			 * MedrexClientManager.getInstance().getNurseRecord(users
			 * .getSerial());
			 * 
			 * cmbNurse.removeAllItems();
			 * 
			 * cmbNurse.addItem(n.getNurseName() + " " + n.getNurseSurName());
			 * 
			 * }
			 * 
			 * else { cmbNurse.removeAllItems();
			 * 
			 * cmbNurse.addItem(""); } } catch (Exception e) {
			 * e.printStackTrace(); }
			 */

		} else {
			ResidentAssessmentFormPage12 rafp12 = null;
			try {
				rafp12 = MedrexClientManager.getInstance()
						.getResidentAssessmentFormPage12(
								Global.currentResidentAssessmentFormKey);
			} catch (Exception e) {

			}
			Global.currentResidentAssessmentFormPage12Key = rafp12.getSerial();

			dcNurseVisit.setDate(rafp12.getNurseVisit());
			cmbNurse.setSelectedItem(rafp12.getNurse());

			dateChooser.setDate(rafp12.getDateAssessment());
			txtTargetBehaviour.setText(rafp12.getTargetedBehavior());
			SwingUtils.setSelectedButton(bg1, rafp12.getQ1());
			txtQ2.setNotes(rafp12.getQ2Text());
			// SwingUtils.setSelectedButton(bg3, rafp12.getQ3());

			switch (rafp12.getQ3()) {
			case 1:
				rbQ3Yes.setSelected(true);
				txtQ3.setEditableNotes(true);
				txtQ3.setNotes(rafp12.getQ3Text());

				break;
			case 2:
				rbQ3No.setSelected(true);
				txtQ3.setEditableNotes(false);
				break;
			}

			// txtQ3.setText(rafp12.getQ3Text());
			// SwingUtils.setSelectedButton(bg4, rafp12.getQ4());

			switch (rafp12.getQ4()) {
			case 1:
				rbQ4Yes.setSelected(true);
				txtQ4.setEditableNotes(true);
				txtQ4.setNotes(rafp12.getQ4Text());
				break;
			case 2:
				rbQ4No.setSelected(true);
				txtQ4.setEditableNotes(false);
				break;
			}
			// txtQ4.setText(rafp12.getQ4Text());
			// SwingUtils.setSelectedButton(bg5, rafp12.getQ5());
			switch (rafp12.getQ5()) {
			case 1:
				rbQ5Yes.setSelected(true);
				txtQ5.setEditableNotes(true);
				txtQ5.setNotes(rafp12.getQ5Text());
				break;
			case 2:
				rbQ5No.setSelected(true);
				txtQ5.setEditableNotes(false);
				break;
			}

			// txtQ5.setText(rafp12.getQ5Text());
			txtQ6.setNotes(rafp12.getQ6Text());
			SwingUtils.setSelectedButton(bg7, rafp12.getQ7());
			txtResidentName.setText(rafp12.getResidentName());
			txtRoomNum.setText(rafp12.getRoomNo());

		}

	}

	public int doSave() {
		ResidentAssessmentFormPage12 rafp12 = new ResidentAssessmentFormPage12();

		rafp12.setSerial(Global.currentResidentAssessmentFormPage12Key);
		System.out.println("Global.currentResidentAssessmentFormPage12Key: "
				+ Global.currentResidentAssessmentFormPage12Key);
		rafp12.setFormId(Global.currentResidentAssessmentFormKey);

		rafp12.setNurseVisit(dcNurseVisit.getDate());
		rafp12.setNurse((String) cmbNurse.getSelectedItem());

		rafp12.setDateAssessment(dateChooser.getDate());
		rafp12.setTargetedBehavior(txtTargetBehaviour.getText());
		rafp12.setQ1(SwingUtils.getSelectedButton(bg1));
		rafp12.setQ2Text(txtQ2.getNotes());
		rafp12.setQ3(SwingUtils.getSelectedButton(bg3));
		rafp12.setQ3Text(txtQ3.getNotes());
		rafp12.setQ4(SwingUtils.getSelectedButton(bg4));
		rafp12.setQ4Text(txtQ4.getNotes());
		rafp12.setQ5(SwingUtils.getSelectedButton(bg5));
		rafp12.setQ5Text(txtQ5.getNotes());
		rafp12.setQ6Text(txtQ6.getNotes());
		rafp12.setQ7(SwingUtils.getSelectedButton(bg7));
		rafp12.setResidentName(txtResidentName.getText());
		rafp12.setRoomNo(txtRoomNum.getText());
		try {
			Global.currentResidentAssessmentFormPage12Key = MedrexClientManager
					.getInstance().insertOrUpdateResidentAssessmentFormPage12(
							rafp12);

			// for sending trigger word message
			String str = txtQ2.getTriggerWord();
			if (str == null) {
				str = txtQ3.getTriggerWord();
			} else {
				str += txtQ3.getTriggerWord();
			}
			if (str == null) {
				str = txtQ4.getTriggerWord();
			} else {
				str += txtQ4.getTriggerWord();
			}
			if (str == null) {
				str = txtQ5.getTriggerWord();
			} else {
				str += txtQ5.getTriggerWord();
			}
			if (str == null) {
				str = txtQ6.getTriggerWord();
			} else {
				str += txtQ6.getTriggerWord();
			}

			if (str != null) {
				txtQ6.sendMail(str);
			}

			return (0);
		} catch (Exception e) {
			return (0);
		}
	}

	public boolean doValidate() {
		// TODO Auto-generated method stub
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;

		if (!FieldValidation.isEmpty(temp = FieldValidation
				.isNonEmptyAlphaField(txtResidentName, "Resident Name", 0, 25))) {
			vRes.addAllFrom(temp);
		}
		if (!FieldValidation.isEmpty(temp = FieldValidation
				.isNonEmptyAlphaField(txtTargetBehaviour, "Targeted Behaviour",
						0, 25))) {
			vRes.addAllFrom(temp);
		}

		// System.out.println(FieldValidation.getMessages(vRes.getMessages()));
		if (!FieldValidation.isEmpty(vRes)) {
			FieldValidation.Msgbox(vRes, "Resident Assessment Form: Page 12");
			return false;
		} else {
			return true;
		}
	}

}
