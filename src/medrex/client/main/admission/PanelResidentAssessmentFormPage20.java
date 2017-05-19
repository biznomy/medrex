package medrex.client.main.admission;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldValidation;
import medrex.commons.intf.Form;
import medrex.commons.vo.admission.ResidentAssessmentFormPage20;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.notes.Notes;
import medrex.commons.vo.others.Doctors;
import medrex.commons.vo.physician.PhysicianForm;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;

import org.jdesktop.jxlayer.JXLayer;
import org.jdesktop.jxlayer.plaf.effect.BufferedImageOpEffect;
import org.jdesktop.jxlayer.plaf.ext.LockableUI;

import com.jgoodies.validation.ValidationResult;
import com.jhlabs.image.GrayFilter;
import com.sX.swing.notes.JxNotes;

public class PanelResidentAssessmentFormPage20 extends JPanel implements Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6394877973411374533L;
	private JTextField txtRoomNum;
	private JTextField txtResidentName;
	private JTextField txtRoomBed;
	private JTextField txtRecordNo;
	private JTextField txtAttendingPhysician;
	private JTextField txtMiddleName;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtSignature2;
	private JTextField txtInitial2;
	private JTextField txtSignature1;
	private JTextField txtInitial1;
	private JxNotes txtAreaComments;
	private Notes notestxtareaComments;
	private JLabel lblImage;
	private LockableUI layerUI;
	private JXLayer<JPanel> layerContent;
	private JPanel panelGlass;
	private JCheckBox chNa;
	// If true then categories list and label will display otherwise not.
	private boolean isCategories = true;

	public PanelResidentAssessmentFormPage20() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		// setBounds(0, 0, 971, 1250);
		setPreferredSize(new Dimension(970, 1120));

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(279, 0, 386, 36);
		add(panel);

		final JLabel neorologicalAssessmentLabel = new JLabel();
		neorologicalAssessmentLabel.setFont(new Font("", Font.BOLD, 18));
		neorologicalAssessmentLabel.setText("NEUROLOGICAL ASSESSMENT");
		neorologicalAssessmentLabel.setBounds(60, 10, 300, 26);
		panel.add(neorologicalAssessmentLabel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(10, 70, 951, 934);
		add(panel_1);

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setLayout(null);
		panel_2.setBounds(60, 10, 880, 32);
		panel_1.add(panel_2);

		final JLabel commentsLabel = new JLabel();
		commentsLabel.setFont(new Font("", Font.BOLD, 14));
		commentsLabel.setForeground(Color.WHITE);
		commentsLabel.setText("COMMENTS");
		commentsLabel.setBounds(373, 10, 97, 16);
		panel_2.add(commentsLabel);

		final JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(10, 42, 930, 799);
		panel_3.setPreferredSize(new Dimension(898, 801));
		panel_1.add(panel_3);

		// JScrollPane scroll = new JScrollPane();
		// scroll.setBounds(0, 5, 930, 783);
		// panel_3.add(scroll);

		notestxtareaComments = new Notes();
		notestxtareaComments.setFormName("Resident Assessment Form");
		notestxtareaComments.setUserId(Global.currentLoggedInUserKey);

		txtAreaComments = new JxNotes(isCategories);
		txtAreaComments.setNotes(notestxtareaComments);
		txtAreaComments.setBackground(Color.WHITE);
		txtAreaComments.setBounds(0, 5, 930, 783);
		// scroll.setCorner(JScrollPane.UPPER_LEFT_CORNER, txtAreaComments);
		// scroll.setViewportView(txtAreaComments);
		panel_3.add(txtAreaComments);

		panelGlass = new JPanel();
		panelGlass.setBackground(Color.WHITE);
		panelGlass.setOpaque(false);
		panelGlass.setLayout(null);
		panelGlass.setBounds(0, 5, 930, 788);

		lblImage = new JLabel(new ImageIcon("img//NA.png"));
		lblImage.setBounds(0, 5, 930, 788);

		layerUI = new LockableUI(new BufferedImageOpEffect(new GrayFilter()));
		// layerUI.getLayer().add(lblImage);
		layerContent = new JXLayer<JPanel>(txtAreaComments);
		// layerContent.getGlassPane().add(panelMain);
		layerContent.setGlassPane(panelGlass);

		layerContent.setUI(layerUI);
		layerContent.setLayout(null);
		layerContent.setBounds(0, 5, 930, 788);
		panel_3.add(layerContent);

		final JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setBackground(Color.WHITE);
		panel_4.setLayout(null);
		panel_4.setBounds(10, 847, 930, 32);
		panel_1.add(panel_4);

		final JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBounds(0, 0, 437, 32);
		panel_4.add(panel_5);

		final JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.BLACK);
		panel_6.setBounds(0, 0, 123, 32);
		panel_5.add(panel_6);

		final JLabel initialsLabel = new JLabel();
		initialsLabel.setFont(new Font("", Font.BOLD, 12));
		initialsLabel.setForeground(Color.WHITE);
		initialsLabel.setText("INITIALS");
		panel_6.add(initialsLabel);

		final JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.BLACK);
		panel_7.setLayout(null);
		panel_7.setBounds(127, 0, 310, 32);
		panel_5.add(panel_7);

		final JLabel signatureLabel = new JLabel();
		signatureLabel.setForeground(Color.WHITE);
		signatureLabel.setFont(new Font("", Font.BOLD, 12));
		signatureLabel.setText("SIGNATURE");
		signatureLabel.setBounds(100, 0, 112, 32);
		panel_7.add(signatureLabel);

		final JPanel panel_5_1 = new JPanel();
		panel_5_1.setBackground(Color.WHITE);
		panel_5_1.setLayout(null);
		panel_5_1.setBounds(569, 0, 361, 32);
		panel_4.add(panel_5_1);

		final JPanel panel_7_1 = new JPanel();
		panel_7_1.setBackground(Color.BLACK);
		panel_7_1.setLayout(null);
		panel_7_1.setBounds(0, 0, 361, 32);
		panel_5_1.add(panel_7_1);

		final JLabel signatureLabel_1 = new JLabel();
		signatureLabel_1.setFont(new Font("", Font.BOLD, 12));
		signatureLabel_1.setForeground(Color.WHITE);
		signatureLabel_1.setText("SIGNATURE");
		signatureLabel_1.setBounds(148, 0, 112, 32);
		panel_7_1.add(signatureLabel_1);

		final JPanel panel_6_1 = new JPanel();
		panel_6_1.setLayout(null);
		panel_6_1.setBounds(443, 0, 120, 32);
		panel_4.add(panel_6_1);
		panel_6_1.setBackground(Color.BLACK);

		final JLabel initialsLabel_1 = new JLabel();
		initialsLabel_1.setBounds(35, 10, 47, 16);
		initialsLabel_1.setFont(new Font("", Font.BOLD, 12));
		initialsLabel_1.setForeground(Color.WHITE);
		initialsLabel_1.setText("INITIALS");
		panel_6_1.add(initialsLabel_1);

		final JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setBackground(Color.WHITE);
		panel_8.setLayout(null);
		panel_8.setBounds(10, 877, 930, 53);
		panel_1.add(panel_8);

		final JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setBackground(Color.WHITE);
		panel_9.setLayout(null);
		panel_9.setBounds(0, 0, 124, 42);
		panel_8.add(panel_9);

		txtInitial1 = new JTextField();
		txtInitial1.setBorder(new LineBorder(Color.black, 1, false));
		txtInitial1.setBounds(8, 10, 110, 24);
		panel_9.add(txtInitial1);

		final JPanel panel_9_4 = new JPanel();
		panel_9_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4.setBackground(Color.WHITE);
		panel_9_4.setLayout(null);
		panel_9_4.setBounds(439, 0, 126, 42);
		panel_8.add(panel_9_4);

		txtInitial2 = new JTextField();
		txtInitial2.setBorder(new LineBorder(Color.black, 1, false));
		txtInitial2.setBounds(10, 10, 104, 24);
		panel_9_4.add(txtInitial2);

		final JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setBackground(Color.WHITE);
		panel_10.setLayout(null);
		panel_10.setBounds(124, 0, 315, 42);
		panel_8.add(panel_10);

		txtSignature1 = new JTextField();
		txtSignature1.setBorder(new LineBorder(Color.black, 1, false));
		txtSignature1.setBounds(10, 10, 295, 24);
		panel_10.add(txtSignature1);

		final JPanel panel_10_4 = new JPanel();
		panel_10_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_4.setBackground(Color.WHITE);
		panel_10_4.setLayout(null);
		panel_10_4.setBounds(565, 0, 365, 42);
		panel_8.add(panel_10_4);

		txtSignature2 = new JTextField();
		txtSignature2.setBorder(new LineBorder(Color.black, 1, false));
		txtSignature2.setBounds(10, 10, 350, 24);
		panel_10_4.add(txtSignature2);

		chNa = new JCheckBox();
		chNa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chNa.isSelected()) {
					disableComment();
				} else {
					enableComment();
				}
			}
		});
		chNa.setFont(new Font("Tahoma", Font.BOLD, 14));
		chNa.setForeground(Color.BLACK);
		chNa.setBackground(Color.WHITE);
		chNa.setText("N/A");
		chNa.setBounds(0, 10, 60, 32);
		panel_1.add(chNa);

		final JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1.setBackground(Color.WHITE);
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(10, 1010, 942, 62);
		add(panel_3_1);

		final JPanel panel_10_5 = new JPanel();
		panel_10_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_5.setBackground(Color.WHITE);
		panel_10_5.setLayout(null);
		panel_10_5.setBounds(4, 10, 454, 42);
		panel_3_1.add(panel_10_5);

		final JLabel nameLabel = new JLabel();
		nameLabel.setText("Name");
		nameLabel.setBounds(9, 1, 54, 14);
		panel_10_5.add(nameLabel);
		nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));

		final JLabel lastLabel = new JLabel();
		lastLabel.setText("Last");
		lastLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lastLabel.setBounds(69, 1, 84, 14);
		panel_10_5.add(lastLabel);

		final JLabel firstLabel = new JLabel();
		firstLabel.setText("First");
		firstLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		firstLabel.setBounds(222, 0, 54, 14);
		panel_10_5.add(firstLabel);

		final JLabel middleLabel = new JLabel();
		middleLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		middleLabel.setText("Middle");
		middleLabel.setBounds(346, 1, 54, 14);
		panel_10_5.add(middleLabel);

		txtLastName = new JTextField();
		txtLastName.setEditable(false);
		txtLastName.setBackground(Color.WHITE);
		txtLastName.setBounds(38, 20, 118, 18);
		panel_10_5.add(txtLastName);

		txtFirstName = new JTextField();
		txtFirstName.setEditable(false);
		txtFirstName.setBackground(Color.WHITE);
		txtFirstName.setBounds(162, 20, 147, 18);
		panel_10_5.add(txtFirstName);

		txtMiddleName = new JTextField();
		txtMiddleName.setEditable(false);
		txtMiddleName.setBackground(Color.WHITE);
		txtMiddleName.setBounds(315, 20, 129, 18);
		panel_10_5.add(txtMiddleName);

		final JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_11.setBackground(Color.WHITE);
		panel_11.setLayout(null);
		panel_11.setBounds(464, 10, 185, 42);
		panel_3_1.add(panel_11);

		final JLabel attendingPhysicianLabel = new JLabel();
		attendingPhysicianLabel.setText("Attending Physician");
		attendingPhysicianLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		attendingPhysicianLabel.setBounds(35, 0, 129, 14);
		panel_11.add(attendingPhysicianLabel);

		txtAttendingPhysician = new JTextField();
		txtAttendingPhysician.setEditable(false);
		txtAttendingPhysician.setBackground(Color.WHITE);
		txtAttendingPhysician.setBounds(10, 20, 163, 18);
		panel_11.add(txtAttendingPhysician);

		final JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_12.setBackground(Color.WHITE);
		panel_12.setLayout(null);
		panel_12.setBounds(655, 10, 123, 42);
		panel_3_1.add(panel_12);

		final JLabel recordNoLabel = new JLabel();
		recordNoLabel.setText("Record No");
		recordNoLabel.setBounds(38, 0, 70, 14);
		panel_12.add(recordNoLabel);

		txtRecordNo = new JTextField();
		txtRecordNo.setEditable(false);
		txtRecordNo.setBackground(Color.WHITE);
		txtRecordNo.setBounds(15, 20, 100, 18);
		panel_12.add(txtRecordNo);

		final JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_13.setBackground(Color.WHITE);
		panel_13.setLayout(null);
		panel_13.setBounds(784, 10, 148, 42);
		panel_3_1.add(panel_13);

		final JLabel roombedLabel = new JLabel();
		roombedLabel.setText("Room/Bed");
		recordNoLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		roombedLabel.setBounds(49, 0, 69, 14);
		panel_13.add(roombedLabel);

		txtRoomBed = new JTextField();
		txtRoomBed.setEditable(false);
		txtRoomBed.setBackground(Color.WHITE);
		roombedLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtRoomBed.setBounds(10, 20, 128, 18);
		panel_13.add(txtRoomBed);

		final JPanel panel_14 = new JPanel();
		panel_14.setBackground(Color.WHITE);
		panel_14.setLayout(null);
		panel_14.setBounds(0, 1078, 241, 36);
		add(panel_14);

		final JLabel neorologicalAssessmentLabel_1 = new JLabel();
		neorologicalAssessmentLabel_1.setFont(new Font("", Font.BOLD, 12));
		neorologicalAssessmentLabel_1.setText("NEUROLOGICAL ASSESSMENT");
		neorologicalAssessmentLabel_1.setBounds(0, 10, 192, 16);
		panel_14.add(neorologicalAssessmentLabel_1);

		final JLabel residentNameLabel = new JLabel();
		residentNameLabel.setText("Resident Name :");
		residentNameLabel.setBounds(91, 48, 79, 14);
		add(residentNameLabel);

		txtResidentName = new JTextField();
		txtResidentName.setBounds(189, 46, 211, 18);
		add(txtResidentName);

		final JLabel roomLabel = new JLabel();
		roomLabel.setText("Room # :");
		roomLabel.setBounds(469, 50, 54, 14);
		add(roomLabel);

		txtRoomNum = new JTextField();
		txtRoomNum.setBounds(543, 48, 77, 18);
		add(txtRoomNum);

		doLoad();
	}

	public void doLoad() {
		doUpdate();

	}

	public int doSave() {
		ResidentAssessmentFormPage20 refResidentAssessmentForm20 = new ResidentAssessmentFormPage20();
		refResidentAssessmentForm20
				.setSerial(Global.currentResidentAssessmentFormPage20Key);
		refResidentAssessmentForm20.setFormId(Global.currentMsjnKey);
		refResidentAssessmentForm20.setInitial1(txtInitial1.getText());
		refResidentAssessmentForm20.setInitial2(txtInitial2.getText());
		// System.out.println("Notes is"+txtAreaComments.getNotes());
		refResidentAssessmentForm20.setComments(txtAreaComments.getNotes());
		refResidentAssessmentForm20.setSignature1(txtSignature1.getText());
		refResidentAssessmentForm20.setSignature2(txtSignature2.getText());
		refResidentAssessmentForm20.setNa(chNa.isSelected());

		try {
			Global.currentResidentAssessmentFormPage20Key = MedrexClientManager
					.getInstance().insertOrUpdateResidentAssessmentFormPage20(
							refResidentAssessmentForm20);
			// System.out.println(""+Global.currentResidentAssessmentFormPage20Key);

			// for sending trigger word message
			String str = txtAreaComments.getTriggerWord();
			if (str != null) {
				txtAreaComments.sendMail(str);
			}

			return (0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (0);
	}

	public void doUpdate() {
		int resId = Global.currentResidenceKey;
		try {
			ResidentMain rm = MedrexClientManager.getInstance().getResident(
					resId);
			TempRoomHistory roomHist = MedrexClientManager.getInstance()
					.getCurrentRoomForResident(resId);
			txtResidentName.setText(rm.getUserPass() + " " + rm.getUserName());
			/* TODO: Migrating to room history ----- Done */
			// txtRoom.setText(rm.getRoom());
			if (roomHist != null) {
				txtRoomNum.setText(roomHist.getRoom());
			}
			txtLastName.setText(rm.getUserPass());
			txtMiddleName.setText("");
			txtFirstName.setText(rm.getUserName());
			/* TODO: Migrating to room history */
			// txtRoomBed.setText(rm.getRoom());
			if (roomHist != null) {
				txtRoomBed.setText(roomHist.getRoom());
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		CensusStatus refCensusStatus = null;
		try {
			refCensusStatus = MedrexClientManager.getInstance()
					.getCensusLastAdmission(Global.currentResidenceKey);
		} catch (Exception e) {
		}
		PhysicianForm pf = null;
		HashMap hm = getDoctorsMap();

		try {
			MedrexClientManager.getInstance().getAdmissionFromSubHead(
					refCensusStatus.getFromSubId());
			List<PhysicianForm> list = MedrexClientManager.getInstance()
					.getPhysicianForms(Global.currentResidenceKey);
			Iterator it = list.iterator();
			while (it.hasNext()) {
				pf = (PhysicianForm) it.next();
				// pavan changed
				String DocType = ((Doctors) hm.get(pf.getPhysician()))
						.getDoctorType().toString();
				if (DocType.equalsIgnoreCase("Physicians")) {
					txtAttendingPhysician.setText(((Doctors) hm.get(pf
					// pavan changed
							.getPhysician())).getPhysicianName()
							+ ","
							// pavan changed
							+ ((Doctors) hm.get(pf.getPhysician()))
									.getPhysicianSurName());
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		ResidentAssessmentFormPage20 refResidentAssessmentForm20 = null;
		// System.out.println("Key is :"
		// +Global.currentResidentAssessmentFormKey);
		// System.out.println("Key is :"
		// +Global.currentResidentAssessmentFormPage20Key);
		if (Global.currentMsjnKey != 0) {
			try {
				refResidentAssessmentForm20 = MedrexClientManager.getInstance()
						.getResidentAssessmentFormPage20(Global.currentMsjnKey);
			} catch (Exception e) {
			}

			Global.currentResidentAssessmentFormPage20Key = refResidentAssessmentForm20
					.getSerial();
			txtInitial1.setText(refResidentAssessmentForm20.getInitial1());
			txtInitial2.setText(refResidentAssessmentForm20.getInitial2());
			txtAreaComments.setNotes(refResidentAssessmentForm20.getComments());
			txtSignature1.setText(refResidentAssessmentForm20.getSignature1());
			txtSignature2.setText(refResidentAssessmentForm20.getSignature2());
			if (refResidentAssessmentForm20.isNa()) {
				layerContent.getGlassPane().add(lblImage);
				layerUI.setLocked(true);
				lblImage.setVisible(true);
			}
			chNa.setSelected(refResidentAssessmentForm20.isNa());
		} else {
			chNa.setSelected(false);
			layerUI.setLocked(false);
			lblImage.setVisible(false);
		}
	}

	public HashMap getDoctorsMap() {
		HashMap hm = new HashMap();
		List doctors = null;
		try {
			doctors = MedrexClientManager.getInstance().getDoctorsRecords();

			Iterator i = doctors.iterator();
			while (i.hasNext()) {
				Doctors d = (Doctors) i.next();
				hm.put(d.getSerial(), d);
			}

		} catch (Exception e) {

		}

		return hm;

	}

	public boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;

		if (!FieldValidation.isEmpty(temp = FieldValidation
				.isNonEmptyAlphaField(txtResidentName, "Resident Name", 0, 25))) {
			vRes.addAllFrom(temp);
		}

		// System.out.println(FieldValidation.getMessages(vRes.getMessages()));
		if (!FieldValidation.isEmpty(vRes)) {
			FieldValidation.Msgbox(vRes, "Resident Assessment Form: Page 20");
			return false;
		} else {
			return true;
		}
	}

	private void enableComment() {
		layerUI.setLocked(false);
		lblImage.setVisible(false);
	}

	private void disableComment() {
		layerContent.getGlassPane().add(lblImage);
		layerUI.setLocked(true);
		lblImage.setVisible(true);
	}

}
