package medrex.client.main.MonthlySummary;

import medrex.client.utils.SwingUtils;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.List;
 
import javax.swing.ButtonGroup; 
import javax.swing.JButton;
import javax.swing.JLabel; 
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.resident.contactinfo.ControllerResidentInfoContact;
import medrex.client.main.resident.contactinfo.PanelResidentContactPhoneAdd;
import medrex.client.main.resident.contactinfo.PanelResidentInfoContactMain;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.Form;
import medrex.commons.vo.admin.NursingHome;
import medrex.commons.vo.notes.Notes;
import medrex.commons.vo.resident.ResidentContact;
import medrex.commons.vo.resident.ResidentContactPhone;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;

import com.lowagie.text.Font;
import com.sX.swing.JxFrame;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxRadioButton;
import com.sX.swing.JxText;
import com.sX.swing.notes.JxNotes;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;


public class PanelAdvanceDirectivesDiscussionNursingHomeName extends JPanel
		implements Form {
	
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 7901092931321067804L;
	private JxLabel lblNurseName_2;
	private JxLabel lblNurseName_1;
	private JxRadioButton rbNoguardian;
	private JxRadioButton rbNoPOA;
	private JxRadioButton rbNoLivingWill;
	private JxRadioButton rbNoFullCode;
	private JxRadioButton rbNoOrganDonationCard;
	private JxRadioButton rbYesOrgandonationCard;
	private JxRadioButton rbYesGuardian;
	private JxRadioButton rbYesPOA;
	private JxRadioButton rbYesLivingWill;
	private JxRadioButton rbYesDNR;
	private JxRadioButton rbYesFullCode;
	private JxLabel lblAddmissionDate;
	private JxLabel lblRoomNum;
	private JxLabel lblName;
	private ButtonGroup bgFullCode;
	private ButtonGroup bgDNR;
	private ButtonGroup bgLivingWill;
	private ButtonGroup bgPOA;
	private ButtonGroup bgGuardian;
	private ButtonGroup bgOrganDonationCard;
	private JxNotes notes;
	private boolean isCategories = true;
	private Notes notesPlanForCare;
	JxLabel nameOfNursingJxLabel;
	JLabel lblContactName;
	JLabel lblRelationship;
	JLabel lblContactNumber;

	Theme theme = new BlackOverWhiteTheme();

	public PanelAdvanceDirectivesDiscussionNursingHomeName() {
		super();
		setLayout(null);
		setPreferredSize((new Dimension(900, 750)));
		setBackground(Color.WHITE);
		bgPOA = new ButtonGroup();
		bgGuardian = new ButtonGroup();
		bgOrganDonationCard = new ButtonGroup();
		bgFullCode = new ButtonGroup();
		bgDNR = new ButtonGroup();
		bgLivingWill = new ButtonGroup();
		
		

		final JxPanel jxPanel = new JxPanel();
		jxPanel.setBackground(Color.WHITE);
		jxPanel.setLayout(null);

		jxPanel.setBounds(0,0,900,1200);
		add(jxPanel);

		nameOfNursingJxLabel = new JxLabel();
		nameOfNursingJxLabel.setTheme(theme);
		nameOfNursingJxLabel.setText("");
		nameOfNursingJxLabel.setFontSize(18);
		nameOfNursingJxLabel.setFontStyle(Font.BOLD);
		nameOfNursingJxLabel.setBounds(188, 25, 450, 20);
		jxPanel.add(nameOfNursingJxLabel);

		final JxLabel jxLabel = new JxLabel();
		jxLabel.setText("ADVANCE DIRECTIVES DISCUSSIONS ");
		jxLabel.setFontStyle(Font.BOLD);
		jxLabel.setFontSize(24);
		jxLabel.setBounds(188, 63, 474, 20);
		jxPanel.add(jxLabel);

		final JxPanel jxPanel_1 = new JxPanel();
		jxPanel_1.setTheme(theme);
		jxPanel_1.setBackground(Color.WHITE);
		jxPanel_1.setLayout(null);
		jxPanel_1.setBounds(10, 105, 748, 28);
		jxPanel.add(jxPanel_1);

		final JxLabel nameJxLabel = new JxLabel();
		nameJxLabel.setTheme(theme);
		nameJxLabel.setText("NAME:");
		nameJxLabel.setBounds(1, 0, 50, 21);
		jxPanel_1.add(nameJxLabel);

		final JxLabel _ppJxLabel = new JxLabel();
		_ppJxLabel.setTheme(theme);
		_ppJxLabel.setText("");
		_ppJxLabel.setBounds(40, 0, 50, 20);
		jxPanel_1.add(_ppJxLabel);

		lblName = new JxLabel();
		lblName.setText("");
		lblName.setTheme(theme);
		lblName.setFontStyle(Font.BOLD);				
		lblName.setBounds(40, 0, 224, 20);
		jxPanel_1.add(lblName);

		final JxLabel room_ppJxLabel = new JxLabel();
		room_ppJxLabel.setTheme(theme);
		room_ppJxLabel.setText("ROOM#");
		room_ppJxLabel.setBounds(270, 0, 50, 21);
		jxPanel_1.add(room_ppJxLabel);

		lblRoomNum = new JxLabel();
		lblRoomNum.setText("");
		lblRoomNum.setTheme(theme);
		lblRoomNum.setFontStyle(Font.BOLD);
		lblRoomNum.setFontSize(13);
		lblRoomNum.setBounds(330, 0, 134, 20);
		jxPanel_1.add(lblRoomNum);

		final JxLabel admissionDate_pp_JxLabel = new JxLabel();
		admissionDate_pp_JxLabel.setTheme(theme);
		admissionDate_pp_JxLabel.setText("ADMISSION DATE:");
		admissionDate_pp_JxLabel.setBounds(503, 0, 100, 21);
		jxPanel_1.add(admissionDate_pp_JxLabel);

		lblAddmissionDate = new JxLabel();
		lblAddmissionDate.setText("");
		lblAddmissionDate.setTheme(theme);
		lblAddmissionDate.setFontStyle(Font.BOLD);
		lblAddmissionDate.setFontSize(13);
		lblAddmissionDate.setBounds(609, 0, 129, 20);
		jxPanel_1.add(lblAddmissionDate);

		final JxPanel jxPanel_2 = new JxPanel();
		jxPanel_2.setBackground(Color.WHITE);
		jxPanel_2.setTheme(theme);

		jxPanel_2.setLayout(null);
		jxPanel_2.setBounds(10, 149, 748, 574);
		jxPanel.add(jxPanel_2);

		final JxLabel jxLabel_1 = new JxLabel();
		jxLabel_1.setTheme(theme);
		jxLabel_1
				.setText("<html><body>Indicate status at time of discussions bychoosing <b>Yes or No</b> after each item that is completed and is available inthe medical record.");
		jxLabel_1.setBounds(0, 0, 646, 23);
		jxPanel_2.add(jxLabel_1);

		final JxPanel jxPanel_3 = new JxPanel();
		jxPanel_3.setBackground(Color.WHITE);
		jxPanel_3.setTheme(theme);
		jxPanel_3.setLayout(null);
		jxPanel_3.setBounds(0, 35, 646, 154);
		jxPanel_2.add(jxPanel_3);

		final JxPanel jxPanel_4 = new JxPanel();
		jxPanel_4.setBackground(Color.WHITE);
		jxPanel_4.setTheme(theme);
		jxPanel_4.setLayout(null);
		jxPanel_4.setBounds(0, 0, 636, 19);
		jxPanel_3.add(jxPanel_4);

		final JxLabel fullCodeJxLabel = new JxLabel();
		fullCodeJxLabel.setTheme(theme);
		fullCodeJxLabel.setText("Full code");
		fullCodeJxLabel.setBounds(0, 0, 60, 15);
		jxPanel_4.add(fullCodeJxLabel);

		rbYesFullCode = new JxRadioButton();
		rbYesFullCode.setBackground(Color.WHITE);
		rbYesFullCode.setTheme(theme);
		bgFullCode.add(rbYesFullCode);
		rbYesFullCode.setText("Yes");
		rbYesFullCode.setBounds(120, 0, 50, 18);
		jxPanel_4.add(rbYesFullCode);

		rbNoFullCode = new JxRadioButton();
		rbNoFullCode.setBackground(Color.WHITE);
		rbNoFullCode.setTheme(theme);
		bgFullCode.add(rbNoFullCode);
		rbNoFullCode.setText("No");
		rbNoFullCode.setBounds(200, 0, 50, 18);
		jxPanel_4.add(rbNoFullCode);

		final JxPanel jxPanel_4_1 = new JxPanel();
		jxPanel_4_1.setBackground(Color.WHITE);
		jxPanel_4_1.setTheme(theme);
		jxPanel_4_1.setLayout(null);
		jxPanel_4_1.setBounds(0, 19, 636, 19);
		jxPanel_3.add(jxPanel_4_1);

		final JxLabel fullCodeJxLabel_1 = new JxLabel();
		fullCodeJxLabel_1.setTheme(theme);
		fullCodeJxLabel_1.setText("DNR");
		fullCodeJxLabel_1.setBounds(0, 0, 60, 15);
		jxPanel_4_1.add(fullCodeJxLabel_1);

		rbYesDNR = new JxRadioButton();
		rbYesDNR.setBackground(Color.WHITE);
		rbYesDNR.setTheme(theme);
		bgDNR.add(rbYesDNR);
		rbYesDNR.setText("Yes");
		rbYesDNR.setBounds(120, 0, 50, 18);
		jxPanel_4_1.add(rbYesDNR);

		final JxRadioButton rbNoDNR = new JxRadioButton();
		rbNoDNR.setBackground(Color.WHITE);
		rbNoDNR.setTheme(theme);
		bgDNR.add(rbNoDNR);
		rbNoDNR.setText("No");
		rbNoDNR.setBounds(200, 0, 50, 18);
		jxPanel_4_1.add(rbNoDNR);

		final JxPanel jxPanel_4_2 = new JxPanel();
		jxPanel_4_2.setBackground(Color.WHITE);
		jxPanel_4_2.setTheme(theme);
		jxPanel_4_2.setLayout(null);
		jxPanel_4_2.setBounds(0, 38, 636, 19);
		jxPanel_3.add(jxPanel_4_2);

		final JxLabel fullCodeJxLabel_2 = new JxLabel();
		fullCodeJxLabel_2.setTheme(theme);

		fullCodeJxLabel_2.setText("LIVINNG WILL");
		fullCodeJxLabel_2.setBounds(0, 0, 79, 15);
		jxPanel_4_2.add(fullCodeJxLabel_2);

		rbYesLivingWill = new JxRadioButton();
		rbYesLivingWill.setTheme(theme);
		rbYesLivingWill.setBackground(Color.WHITE);
		bgLivingWill.add(rbYesLivingWill);
		rbYesLivingWill.setText("Yes");
		rbYesLivingWill.setBounds(120, 0, 50, 18);
		jxPanel_4_2.add(rbYesLivingWill);

		rbNoLivingWill = new JxRadioButton();
		rbNoLivingWill.setTheme(theme);
		rbNoLivingWill.setBackground(Color.WHITE);
		bgLivingWill.add(rbNoLivingWill);
		rbNoLivingWill.setText("No");
		rbNoLivingWill.setBounds(200, 0, 50, 18);
		jxPanel_4_2.add(rbNoLivingWill);

		final JxPanel jxPanel_4_3 = new JxPanel();
		jxPanel_4_3.setTheme(theme);
		jxPanel_4_3.setBackground(Color.WHITE);
		jxPanel_4_3.setLayout(null);
		jxPanel_4_3.setBounds(0, 57, 636, 19);
		jxPanel_3.add(jxPanel_4_3);

		final JxLabel fullCodeJxLabel_3 = new JxLabel();
		fullCodeJxLabel_3.setTheme(theme);
		fullCodeJxLabel_3.setText("POA");
		fullCodeJxLabel_3.setBounds(0, 0, 60, 15);
		jxPanel_4_3.add(fullCodeJxLabel_3);

		rbYesPOA = new JxRadioButton();
		rbYesPOA.setTheme(theme);
		rbYesPOA.setBackground(Color.WHITE);
		bgPOA.add(rbYesPOA);
		rbYesPOA.setText("Yes");
		rbYesPOA.setBounds(120, 0, 50, 18);
		jxPanel_4_3.add(rbYesPOA);

		rbNoPOA = new JxRadioButton();
		rbNoPOA.setTheme(theme);
		rbNoPOA.setBackground(Color.WHITE);
		bgPOA.add(rbNoPOA);
		rbNoPOA.setText("No");
		rbNoPOA.setBounds(200, 0, 50, 18);
		jxPanel_4_3.add(rbNoPOA);

		final JxPanel jxPanel_4_4 = new JxPanel();
		jxPanel_4_4.setTheme(theme);
		jxPanel_4_4.setBackground(Color.WHITE);
		jxPanel_4_4.setLayout(null);
		jxPanel_4_4.setBounds(0, 76, 636, 19);
		jxPanel_3.add(jxPanel_4_4);

		final JxLabel fullCodeJxLabel_4 = new JxLabel();
		fullCodeJxLabel_4.setTheme(theme);
		fullCodeJxLabel_4.setText("Guardian");
		fullCodeJxLabel_4.setBounds(0, 0, 60, 15);
		jxPanel_4_4.add(fullCodeJxLabel_4);

		rbYesGuardian = new JxRadioButton();
		rbYesGuardian.setTheme(theme);
		rbYesGuardian.setBackground(Color.WHITE);
		bgGuardian.add(rbYesGuardian);
		rbYesGuardian.setText("Yes");
		rbYesGuardian.setBounds(120, 0, 50, 18);
		jxPanel_4_4.add(rbYesGuardian);

		rbNoguardian = new JxRadioButton();
		rbNoguardian.setTheme(theme);
		rbNoguardian.setBackground(Color.WHITE);
		bgGuardian.add(rbNoguardian);
		rbNoguardian.setText("No");
		rbNoguardian.setBounds(200, 0, 50, 18);
		jxPanel_4_4.add(rbNoguardian);

		final JxPanel jxPanel_4_5 = new JxPanel();
		jxPanel_4_5.setTheme(theme);
		jxPanel_4_5.setBackground(Color.WHITE);
		jxPanel_4_5.setLayout(null);
		jxPanel_4_5.setBounds(0, 96, 636, 19);
		jxPanel_3.add(jxPanel_4_5);

		final JxLabel fullCodeJxLabel_5 = new JxLabel();
		fullCodeJxLabel_5.setTheme(theme);
		fullCodeJxLabel_5.setText("Organ Donation Card");
		fullCodeJxLabel_5.setBounds(0, 0, 110, 15);
		jxPanel_4_5.add(fullCodeJxLabel_5);

		rbYesOrgandonationCard = new JxRadioButton();
		rbYesOrgandonationCard.setTheme(theme);
		rbYesOrgandonationCard.setBackground(Color.WHITE);
		bgOrganDonationCard.add(rbYesOrgandonationCard);
		rbYesOrgandonationCard.setText("Yes");
		rbYesOrgandonationCard.setBounds(120, 0, 50, 18);
		jxPanel_4_5.add(rbYesOrgandonationCard);

		rbNoOrganDonationCard = new JxRadioButton();
		rbNoOrganDonationCard.setTheme(theme);
		rbNoOrganDonationCard.setBackground(Color.WHITE);
		bgOrganDonationCard.add(rbNoOrganDonationCard);
		rbNoOrganDonationCard.setText("No");
		rbNoOrganDonationCard.setBounds(200, 0, 50, 18);
		jxPanel_4_5.add(rbNoOrganDonationCard);

		final JxLabel otherJxLabel = new JxLabel();
		otherJxLabel.setTheme(theme);
		otherJxLabel.setText("Other");
		otherJxLabel.setBounds(0, 121, 53, 14);
		jxPanel_3.add(otherJxLabel);

		final JxText jxText = new JxText();
		jxText.setTheme(theme);
		jxText.setTheme(theme);
		jxText.setBounds(59, 118, 577, 34);
		jxPanel_3.add(jxText);

		final JxPanel jxPanel_5 = new JxPanel();
		jxPanel_5.setTheme(theme);
		jxPanel_5.setBackground(Color.WHITE);
		jxPanel_5.setLayout(null);
		jxPanel_5.setBounds(0, 200, 646, 154);
		jxPanel_2.add(jxPanel_5);

		final JxPanel jxPanel_6 = new JxPanel();
		jxPanel_6.setTheme(theme);
		jxPanel_6.setBackground(Color.WHITE);
		jxPanel_6.setLayout(null);
		jxPanel_6.setBounds(0, 0, 636, 135);
		jxPanel_5.add(jxPanel_6);

		final JxPanel jxPanel_7 = new JxPanel();
		jxPanel_7.setTheme(theme);
		jxPanel_7.setBackground(Color.WHITE);
		jxPanel_7.setLayout(null);
		jxPanel_7.setBorder(new LineBorder(Color.black, 1, false));
		jxPanel_7.setBounds(0, 0, 237, 28);
		jxPanel_6.add(jxPanel_7);

		final JLabel contactNameLabel = new JLabel();
		contactNameLabel.setText("Contact Name");
		contactNameLabel.setBounds(39, 0, 88, 16);
		jxPanel_7.add(contactNameLabel);

		final JxPanel jxPanel_7_1 = new JxPanel();
		jxPanel_7_1.setLayout(null);
		jxPanel_7_1.setTheme(theme);
		jxPanel_7_1.setBackground(Color.WHITE);
		jxPanel_7_1.setBorder(new LineBorder(Color.black, 1, false));
		jxPanel_7_1.setBounds(236, 0, 187, 28);
		jxPanel_6.add(jxPanel_7_1);

		final JLabel relationshipLabel = new JLabel();
		relationshipLabel.setBounds(9, 0, 65, 16);
		relationshipLabel.setText("Relationship");
		jxPanel_7_1.add(relationshipLabel);

		final JxPanel jxPanel_7_1_1 = new JxPanel();
		jxPanel_7_1_1.setLayout(null);
		jxPanel_7_1_1.setTheme(theme);
		jxPanel_7_1_1.setBackground(Color.WHITE);
		jxPanel_7_1_1.setBorder(new LineBorder(Color.black, 1, false));
		jxPanel_7_1_1.setBounds(422, 0, 211, 28);
		jxPanel_6.add(jxPanel_7_1_1);

		final JLabel contactNosLabel = new JLabel();
		contactNosLabel.setText("Contact Number");
		contactNosLabel.setBounds(10, 0, 108, 16);
		jxPanel_7_1_1.add(contactNosLabel);

		final JxPanel jxPanel_7_2 = new JxPanel();
		jxPanel_7_2.setLayout(null);
		jxPanel_7_2.setTheme(theme);
		jxPanel_7_2.setBackground(Color.WHITE);
		jxPanel_7_2.setBorder(new LineBorder(Color.black, 1, false));
		jxPanel_7_2.setBounds(0, 25, 237, 28);
		jxPanel_6.add(jxPanel_7_2);

		final JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				PanelResidentInfoContactMain panel = new PanelResidentInfoContactMain(1);
				SwingUtils.openInDialog(panel);
				lblContactName.setText("");
				lblRelationship.setText("");
				lblContactNumber.setText("");
				lblContactName.setText( panel.resContactForAdvanced.getFirstName()+ " "+panel.resContactForAdvanced.getLastName());
				lblRelationship.setText(panel.resContactForAdvanced.getRelationship().getMsterName());
				List contacts = panel.resContactForAdvanced.getResidentContactPhoneList();
				if(contacts.size()>0){
					ResidentContactPhone rc = (ResidentContactPhone)contacts.get(0);
					lblContactNumber.setText(rc.getNumber());
				}
				//lblFirstName.setText(panel.resContactForAdvanced.getFirstName());
			}
		});
		button.setText("New JButton");
		button.setBounds(0, 0, 30, 30);
		jxPanel_7_2.add(button);

		lblContactName = new JLabel();
		lblContactName.setText("");
		lblContactName.setBounds(39, 6, 191, 16);
		jxPanel_7_2.add(lblContactName);

		final JxPanel jxPanel_7_2_1 = new JxPanel();
		jxPanel_7_2_1.setLayout(null);
		jxPanel_7_2_1.setTheme(theme);
		jxPanel_7_2_1.setBackground(Color.WHITE);
		jxPanel_7_2_1.setBorder(new LineBorder(Color.black, 1, false));
		jxPanel_7_2_1.setBounds(235, 25, 187, 28);
		jxPanel_6.add(jxPanel_7_2_1);

		lblRelationship = new JLabel();
		lblRelationship.setText("");
		lblRelationship.setBounds(10, 6, 167, 16);
		jxPanel_7_2_1.add(lblRelationship);

		final JxPanel jxPanel_7_2_1_1 = new JxPanel();
		jxPanel_7_2_1_1.setLayout(null);
		jxPanel_7_2_1_1.setTheme(theme);
		jxPanel_7_2_1_1.setBackground(Color.WHITE);
		jxPanel_7_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		jxPanel_7_2_1_1.setBounds(422, 25, 211, 28);
		jxPanel_6.add(jxPanel_7_2_1_1);

		lblContactNumber = new JLabel();
		lblContactNumber.setText("");
		lblContactNumber.setBounds(10, 6, 191, 16);
		jxPanel_7_2_1_1.add(lblContactNumber);

		final JxPanel jxPanel_8 = new JxPanel();
		jxPanel_8.setTheme(theme);
		jxPanel_8.setBackground(Color.WHITE);
		jxPanel_8.setLayout(null);
		jxPanel_8.setBounds(0, 360, 656, 169);
		jxPanel_2.add(jxPanel_8);

		final JxLabel jxLabel_2 = new JxLabel();
		jxLabel_2.setTheme(theme);
		jxLabel_2.setBackground(Color.WHITE);
		jxLabel_2
				.setText("<html><body> Summary of advance directives discussions and decisions at the time of discussions (ex. Is MOLST present, completed properly, does MOLST need revision or does new MOLST need to be implemented):");
		jxLabel_2.setBounds(0, 0, 656, 40);
		jxPanel_8.add(jxLabel_2);

		final JxPanel panel = new JxPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 46, 656, 123);
		jxPanel_8.add(panel);
		JxPanel jxPanel_10 = new JxPanel();
		jxPanel_10.setTheme(theme);
		jxPanel_10.setFontStyle(Font.BOLD);
		jxPanel_10.setBackground(Color.WHITE);
		jxPanel_10.setLayout(null);
		jxPanel_10.setBounds(0, 535, 646, 30);
		jxPanel_2.add(jxPanel_10);
		
		notes = new JxNotes(isCategories);
		notes.setNotes(notesPlanForCare);
		notes.setBorder(new LineBorder(Color.BLACK, 1, false));
		notes.setBounds(10, 0, 625, 123);
		panel.add(notes);
		
		
		final JxLabel dateJxLabel = new JxLabel();
		dateJxLabel.setTheme(theme);
		dateJxLabel.setText("Date:");
		
		final JxLabel dateJxLabel_1 = new JxLabel();
		dateJxLabel_1.setText("Date");
		dateJxLabel_1.setTheme(theme);
		dateJxLabel_1.setBounds(0, 2, 35, 20);
		jxPanel_10.add(dateJxLabel_1);

		final JxLabel signatureJxLabel = new JxLabel();
		signatureJxLabel.setText("Signature");
		signatureJxLabel.setTheme(theme);
		signatureJxLabel.setBounds(337, 2, 53, 20);
		jxPanel_10.add(signatureJxLabel);

		lblNurseName_1 = new JxLabel();
		lblNurseName_1.setFontStyle(1);
		lblNurseName_1.setFontSize(13);
		lblNurseName_1.setText("");
		lblNurseName_1.setBounds(40, 1, 124, 20);
		jxPanel_10.add(lblNurseName_1);

		lblNurseName_2 = new JxLabel();
		lblNurseName_2.setFontStyle(1);
		lblNurseName_2.setFontSize(13);
		lblNurseName_2.setText("");
		lblNurseName_2.setBounds(400, 1, 124, 20);
		jxPanel_10.add(lblNurseName_2);
		
	} 

	public static void main(String args[]) {
		JxFrame frame = new JxFrame();
		JScrollBar scoller = new JScrollBar();
		PanelAdvanceDirectivesDiscussionNursingHomeName panel = new PanelAdvanceDirectivesDiscussionNursingHomeName();
		panel.add(scoller);
		frame.add(panel);
		frame.setVisible(true);
		frame.setBounds(10, 10, 500, 500);
	}

	@Override
	public void doLoad() {

	}

	@Override
	public int doSave() {

		return 0;
	}

	@Override
	public void doUpdate() {
		int resID = Global.currentResidenceKey;
		ResidentMain rm = null;
		List<ResidentContact> contacts = null;
		
		try {
			rm = MedrexClientManager.getInstance().getResident(resID);
			lblName.setText(rm.getUserName() + " " + rm.getUserPass());	
			

		}

		catch (Exception e) {
			e.printStackTrace();
		}
		
		TempRoomHistory roomHist = null;
		try {
			roomHist = MedrexClientManager.getInstance()
					.getCurrentRoomForResident(resID);
		} catch (Exception e) {
			e.printStackTrace();
		}
		/* TODO: Migrating to room history ----- Done */
		if (roomHist != null) {
			lblRoomNum.setText(roomHist.getRoom());
		}

		
				
		if(rm.getAdmittedOn() != null){
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
			lblAddmissionDate.setText("" + sdf.format(rm.getAdmittedOn()));
			
		}
		
		try{
			NursingHome nh = MedrexClientManager.getInstance().getNursingHomeInfo(1);
			nameOfNursingJxLabel.setText(nh.getName());
			}
			catch(Exception ee){
				
			}
		
	}

	@Override
	public boolean doValidate() {

		return false;
	}

}
