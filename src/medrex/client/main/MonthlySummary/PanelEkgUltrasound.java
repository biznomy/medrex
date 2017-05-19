package medrex.client.main.MonthlySummary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.Form;
import medrex.commons.vo.resident.ResidentContact;
import medrex.commons.vo.resident.ResidentContactPhone;
import medrex.commons.vo.resident.ResidentMain;

import com.toedter.calendar.JDateChooser;

public class PanelEkgUltrasound extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5893909763251530597L;
	private JCheckBox cbbilateralVenouslower;
	private JCheckBox cbbilateralVenousboth;
	private JCheckBox cbbilateralVenousDopplerlower;
	private JCheckBox cbbilateralVenousDopplerboth;
	private JCheckBox cbbilateralVenousDopplerupper;
	private JCheckBox cbbilateralVenousDoppler;
	private JCheckBox cbbilateralArterialDopplerboth;
	private JCheckBox cbbilateralArterialDopplerlower;
	private JCheckBox cbbilateralArterialDopplerupper;
	private JCheckBox cbbilateralArterialDoppler;
	private JCheckBox cbedema;
	private JCheckBox cbstroke;
	private JCheckBox cbpainInJoint;
	private JCheckBox cbhypertension;
	private JCheckBox cbswellingLimbs;
	private JCheckBox cbvaricoseVeins;
	private JCheckBox cbpelvicSwelling;
	private JCheckBox cbhypothyroidism;
	private JCheckBox cbabdominalPain;
	private JCheckBox cbfacialWeakness;
	private JCheckBox cbinfectionOfKidney;
	private JCheckBox cbabdominalDistension;
	private JCheckBox cbdvtDeep;
	private JCheckBox cbswellingMassIn;
	private JCheckBox cbpvdPeripheral;
	private JCheckBox cbperipheralVascularComplications;
	private JTextField txtSpecify;
	private JTextField txtother;
	private JTextField txtXrayspecify;
	private JCheckBox cbxray;
	private JCheckBox cbEcho;
	private JCheckBox cbOther;
	private JCheckBox cbEkg;
	private JDateChooser dcdate3;
	private JTextField txtSignature;
	private JCheckBox cbbilateralVenousupper;
	private JCheckBox cbbilateralVenous;
	private JCheckBox cbpelvic;
	private JCheckBox cbcarotidthyroid;
	private JCheckBox cbabdominalrenal;
	private JCheckBox cbother;
	private JCheckBox cbhomebound;
	private JCheckBox cbsnf;
	private JTextField txtpreauthorization;
	private JTextField txtpolicy;
	private JTextField txtinsurance;
	private JTextField txtFax;
	private JTextField txtTelephone;
	private JTextField txtOrderingPhysicianNameFirst;
	private JTextField txtOrderingPhysicianNameLast;
	private JTextField txtmedicaid;
	private JTextField txtmedicare;
	private JTextField txtphone;
	private JTextField txtaddress;
	private JTextField txtSocialSecurity3;
	private JTextField txtSocialSecurity2;
	private JTextField txtSocialSecurity1;
	private JRadioButton rbfemale;
	private JRadioButton rbmale;
	private JDateChooser dcdatedatefbirth;
	private JTextField txtFirstname;
	private JTextField txtpatient;
	private JTextField txtRoom;
	private JTextField txtFacility;
	private JDateChooser dcdateService;
	private JTextField txtPtAcc;
	private JButton btnv2Encoded;
	private JButton btnv2Xml;
	private ButtonGroup bgGender = new ButtonGroup();

	public PanelEkgUltrasound() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH,
				Mds3Constants.PAGE_HEIGHT));

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setFont(new Font("Arial", Font.BOLD, 16));
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH,
				Mds3Constants.PAGE_HEIGHT);
		panel.setLayout(null);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 400, 300);
		panel_1.setBackground(Color.WHITE);
		panel.add(panel_1);

		btnv2Encoded = new JButton();
		btnv2Encoded.setBounds(0, 0, 70, 25);
		btnv2Encoded.setText("HL7");
		btnv2Encoded.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				// JOptionPane.showMessageDialog(null, (new
				// HL7HapiMessage()).getV2xMessage("Artwood", "raymond", "56"));

			}
		});

		btnv2Xml = new JButton();
		btnv2Xml.setBounds(71, 0, 70, 25);
		btnv2Xml.setText("HL7 xml");
		btnv2Xml.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				// JOptionPane.showMessageDialog(null, (new
				// HL7HapiMessage()).getV2xMessagexml("Artwood", "raymond",
				// "56"));

			}
		});

		panel_1.add(btnv2Encoded);

		panel_1.add(btnv2Xml);

		final JLabel label = new JLabel();
		label.setFont(new Font("Arial", Font.BOLD, 14));
		label.setText("101 N. 3rd Street");
		label.setBounds(203, 42, 187, 22);
		panel_1.add(label);

		final JLabel label_1 = new JLabel();
		label_1.setFont(new Font("Arial", Font.BOLD, 14));
		label_1.setText("Brooklyn, NY 11211");
		label_1.setBounds(195, 65, 187, 22);
		panel_1.add(label_1);

		final JLabel label_2 = new JLabel();
		label_2.setFont(new Font("Arial", Font.BOLD, 14));
		label_2.setText("405 Candlewood Commons");
		label_2.setBounds(168, 120, 202, 22);
		panel_1.add(label_2);

		final JLabel label_3 = new JLabel();
		label_3.setFont(new Font("Arial", Font.BOLD, 14));
		label_3.setText("Howell, NJ 07731");
		label_3.setBounds(200, 145, 173, 22);
		panel_1.add(label_3);

		final JLabel label_4 = new JLabel();
		label_4.setFont(new Font("Arial", Font.BOLD, 14));
		label_4.setText("Tel: 718.594.1001");
		label_4.setBounds(203, 196, 187, 22);
		panel_1.add(label_4);

		final JLabel label_5 = new JLabel();
		label_5.setFont(new Font("Arial", Font.BOLD, 14));
		label_5.setText("Fax: 718.594.1006");
		label_5.setBounds(203, 219, 187, 22);
		panel_1.add(label_5);

		final JLabel label_6 = new JLabel();
		label_6.setBackground(Color.BLUE);
		label_6.setText("");
		label_6.setBounds(21, 21, 123, 113);
		panel_1.add(label_6);

		final JLabel label_3_1 = new JLabel();
		label_3_1.setFont(new Font("Arial Black", Font.BOLD, 16));
		label_3_1.setText("  F A S T R A D");
		label_3_1.setBounds(10, 140, 142, 22);
		panel_1.add(label_3_1);

		final JLabel label_3_2 = new JLabel();
		label_3_2.setText("    MOBILE RADIOLOGY ");
		label_3_2.setBounds(20, 160, 142, 22);
		panel_1.add(label_3_2);

		final JLabel label_3_3 = new JLabel();
		label_3_3.setFont(new Font("Arial", Font.BOLD, 18));
		label_3_3.setText("  1-888-594-5910 ");
		label_3_3.setBounds(20, 200, 158, 22);
		panel_1.add(label_3_3);

		final JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(399, 0, 440, 300);
		panel_2.setBackground(Color.WHITE);
		panel.add(panel_2);

		final JLabel label_7 = new JLabel();
		label_7.setFont(new Font("Arial", Font.BOLD, 20));
		label_7.setText("  EKG-ULTRASOUND-ECHO REQUISITION");
		label_7.setBounds(10, 24, 408, 42);
		panel_2.add(label_7);

		final JLabel label_7_1 = new JLabel();
		label_7_1.setFont(new Font("Arial", Font.BOLD, 20));
		label_7_1.setText("              HOMEBOUND SERVICE");
		label_7_1.setBounds(20, 72, 398, 42);
		panel_2.add(label_7_1);

		final JLabel label_7_1_1 = new JLabel();
		label_7_1_1.setFont(new Font("Arial", Font.BOLD, 16));
		label_7_1_1.setText("Accession Number");
		label_7_1_1.setBounds(66, 120, 147, 30);
		panel_2.add(label_7_1_1);

		final JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_4.setLayout(null);
		panel_4.setBounds(219, 120, 211, 63);
		panel_2.add(panel_4);

		final JLabel label_8 = new JLabel();
		label_8.setFont(new Font("", Font.BOLD, 14));
		label_8.setText("PT Account #");
		label_8.setBounds(5, 5, 100, 24);
		panel_4.add(label_8);

		txtPtAcc = new JTextField();
		txtPtAcc.setBounds(105, 10, 100, 21);
		panel_4.add(txtPtAcc);

		final JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(0, 299, 450, 370);
		panel_3.setBackground(Color.WHITE);
		panel.add(panel_3);

		final JLabel label_9 = new JLabel();
		label_9.setText("Date of Service");
		label_9.setBounds(10, 10, 122, 22);
		panel_3.add(label_9);

		final JLabel label_9_1 = new JLabel();
		label_9_1.setText("Facility Name");
		label_9_1.setBounds(10, 38, 122, 22);
		panel_3.add(label_9_1);

		final JLabel label_9_2 = new JLabel();
		label_9_2.setText("PATIENT NAME");
		label_9_2.setBounds(10, 66, 122, 22);
		panel_3.add(label_9_2);

		final JLabel label_9_3 = new JLabel();
		label_9_3.setText("DATE OF BIRTH");
		label_9_3.setBounds(10, 94, 122, 22);
		panel_3.add(label_9_3);

		final JLabel label_9_4 = new JLabel();
		label_9_4.setText("SOCIAL SECURITY #");
		label_9_4.setBounds(10, 122, 122, 22);
		panel_3.add(label_9_4);

		final JLabel label_9_5 = new JLabel();
		label_9_5.setText("ADDRESS");
		label_9_5.setBounds(10, 150, 122, 22);
		panel_3.add(label_9_5);

		final JLabel label_9_6 = new JLabel();
		label_9_6.setText("PHONE");
		label_9_6.setBounds(10, 178, 122, 22);
		panel_3.add(label_9_6);

		final JLabel label_9_7 = new JLabel();
		label_9_7.setText("MEDICARE #");
		label_9_7.setBounds(10, 206, 122, 22);
		panel_3.add(label_9_7);

		final JLabel label_9_8 = new JLabel();
		label_9_8.setText("MEDICAID #");
		label_9_8.setBounds(10, 234, 122, 22);
		panel_3.add(label_9_8);

		final JLabel label_9_9 = new JLabel();
		label_9_9.setText("INSURANCE CO.");
		label_9_9.setBounds(10, 262, 122, 22);
		panel_3.add(label_9_9);

		final JLabel label_9_10 = new JLabel();
		label_9_10.setText("POLICY #");
		label_9_10.setBounds(10, 290, 122, 22);
		panel_3.add(label_9_10);

		final JLabel label_9_11 = new JLabel();
		label_9_11.setText("PREAUTHORIZATION #");
		label_9_11.setBounds(10, 318, 134, 22);
		panel_3.add(label_9_11);

		final JLabel label_9_12 = new JLabel();
		label_9_12.setText("PATIENT:");
		label_9_12.setBounds(10, 346, 80, 22);
		panel_3.add(label_9_12);

		final JLabel roomLabel = new JLabel();
		roomLabel.setText("Room #");
		roomLabel.setBounds(269, 38, 62, 22);
		panel_3.add(roomLabel);

		cbsnf = new JCheckBox();
		cbsnf.setBackground(Color.WHITE);
		cbsnf.setText("SNF");
		cbsnf.setBounds(100, 345, 80, 24);
		panel_3.add(cbsnf);

		cbhomebound = new JCheckBox();
		cbhomebound.setBackground(Color.WHITE);
		cbhomebound.setText("HOMEBOUND");
		cbhomebound.setBounds(195, 345, 109, 24);
		panel_3.add(cbhomebound);

		cbother = new JCheckBox();
		cbother.setBackground(Color.WHITE);
		cbother.setText("OTHER");
		cbother.setBounds(324, 345, 93, 24);
		panel_3.add(cbother);

		dcdateService = new JDateChooser();
		dcdateService.setBounds(120, 13, 153, 16);
		panel_3.add(dcdateService);

		txtFacility = new JTextField();
		txtFacility.setBounds(110, 38, 153, 20);
		panel_3.add(txtFacility);

		txtpatient = new JTextField();
		txtpatient.setBounds(120, 67, 143, 20);
		panel_3.add(txtpatient);

		dcdatedatefbirth = new JDateChooser();
		dcdatedatefbirth.setBounds(110, 100, 142, 20);
		panel_3.add(dcdatedatefbirth);

		txtSocialSecurity1 = new JTextField();
		txtSocialSecurity1.setBounds(140, 125, 71, 20);
		panel_3.add(txtSocialSecurity1);

		txtaddress = new JTextField();
		txtaddress.setBounds(100, 151, 340, 20);
		panel_3.add(txtaddress);

		txtphone = new JTextField();
		txtphone.setBounds(100, 179, 340, 20);
		panel_3.add(txtphone);

		txtmedicare = new JTextField();
		txtmedicare.setBounds(100, 207, 340, 20);
		panel_3.add(txtmedicare);

		txtmedicaid = new JTextField();
		txtmedicaid.setBounds(100, 235, 340, 20);
		panel_3.add(txtmedicaid);

		txtinsurance = new JTextField();
		txtinsurance.setBounds(120, 263, 320, 20);
		panel_3.add(txtinsurance);

		txtpolicy = new JTextField();
		txtpolicy.setBounds(90, 290, 350, 20);
		panel_3.add(txtpolicy);

		txtpreauthorization = new JTextField();
		txtpreauthorization.setBounds(156, 319, 284, 20);
		panel_3.add(txtpreauthorization);

		txtFirstname = new JTextField();
		txtFirstname.setBounds(269, 67, 143, 20);
		panel_3.add(txtFirstname);

		txtRoom = new JTextField();
		txtRoom.setBounds(319, 40, 121, 20);
		panel_3.add(txtRoom);

		txtSocialSecurity2 = new JTextField();
		txtSocialSecurity2.setBounds(240, 125, 71, 20);
		panel_3.add(txtSocialSecurity2);

		txtSocialSecurity3 = new JTextField();
		txtSocialSecurity3.setBounds(335, 125, 71, 20);
		panel_3.add(txtSocialSecurity3);

		rbmale = new JRadioButton();
		rbmale.setBackground(Color.WHITE);
		rbmale.setText("male");
		rbmale.setBounds(255, 103, 71, 16);
		bgGender.add(rbmale);
		panel_3.add(rbmale);

		rbfemale = new JRadioButton();
		rbfemale.setBackground(Color.WHITE);
		rbfemale.setText("female");
		rbfemale.setBounds(335, 103, 71, 16);
		bgGender.add(rbfemale);
		panel_3.add(rbfemale);

		final JLabel firstLabel = new JLabel();
		firstLabel.setText("FIRST");
		firstLabel.setBounds(293, 88, 71, 12);
		panel_3.add(firstLabel);

		final JLabel lastLabel = new JLabel();
		lastLabel.setText("LAST");
		lastLabel.setBounds(156, 88, 71, 12);
		panel_3.add(lastLabel);

		final JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBounds(450, 299, 390, 300);
		panel.add(panel_5);

		final JLabel orderingPhysicianLabel = new JLabel();
		orderingPhysicianLabel.setFont(new Font("Arial", Font.BOLD, 16));
		orderingPhysicianLabel.setText("   ORDERING PHYSICIAN");
		orderingPhysicianLabel.setBounds(10, 10, 234, 26);
		panel_5.add(orderingPhysicianLabel);

		final JLabel nameLastLabel = new JLabel();
		nameLastLabel.setText("Name: Last");
		nameLastLabel.setBounds(10, 50, 70, 22);
		panel_5.add(nameLastLabel);

		final JLabel firstLabel_1 = new JLabel();
		firstLabel_1.setText("First");
		firstLabel_1.setBounds(51, 78, 32, 22);
		panel_5.add(firstLabel_1);

		final JLabel telLabel = new JLabel();
		telLabel.setText("Tel.");
		telLabel.setBounds(10, 110, 38, 22);
		panel_5.add(telLabel);

		final JLabel label_9_5_4 = new JLabel();
		label_9_5_4.setText("Fax");
		label_9_5_4.setBounds(10, 135, 38, 22);
		panel_5.add(label_9_5_4);

		txtOrderingPhysicianNameLast = new JTextField();
		txtOrderingPhysicianNameLast.setBounds(100, 51, 257, 20);
		panel_5.add(txtOrderingPhysicianNameLast);

		txtOrderingPhysicianNameFirst = new JTextField();
		txtOrderingPhysicianNameFirst.setBounds(100, 79, 257, 20);
		panel_5.add(txtOrderingPhysicianNameFirst);

		txtTelephone = new JTextField();
		txtTelephone.setBounds(51, 111, 306, 20);
		panel_5.add(txtTelephone);

		txtFax = new JTextField();
		txtFax.setBounds(51, 136, 306, 20);
		panel_5.add(txtFax);

		final JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6.setBackground(Color.WHITE);
		panel_6.setLayout(null);
		panel_6.setBounds(10, 174, 370, 116);
		panel_5.add(panel_6);

		final JLabel techCommentsTimeLabel = new JLabel();
		techCommentsTimeLabel.setText("Tech Comments:           Time:");
		techCommentsTimeLabel.setBounds(10, 5, 274, 16);
		panel_6.add(techCommentsTimeLabel);

		final JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBounds(450, 600, 385, 460);
		panel.add(panel_7);

		final JLabel clinicalSymptomsLabel = new JLabel();
		clinicalSymptomsLabel.setFont(new Font("Arial", Font.BOLD, 16));
		clinicalSymptomsLabel
				.setText("Clinical Symptoms / Diagnosis Required:");
		clinicalSymptomsLabel.setBounds(10, 10, 354, 28);
		panel_7.add(clinicalSymptomsLabel);

		final JLabel checkAllThatLabel = new JLabel();
		checkAllThatLabel.setFont(new Font("Arial", Font.BOLD, 16));
		checkAllThatLabel.setText("Check all that apply:");
		checkAllThatLabel.setBounds(10, 39, 162, 28);
		panel_7.add(checkAllThatLabel);

		cbperipheralVascularComplications = new JCheckBox();
		cbperipheralVascularComplications
				.setText("Peripheral Vascular Complications");
		cbperipheralVascularComplications.setBounds(10, 65, 354, 24);
		panel_7.add(cbperipheralVascularComplications);

		cbpvdPeripheral = new JCheckBox();
		cbpvdPeripheral.setText("PVD - Peripheral Vascular Disease");
		cbpvdPeripheral.setBounds(10, 90, 354, 24);
		panel_7.add(cbpvdPeripheral);

		cbswellingMassIn = new JCheckBox();
		cbswellingMassIn.setText("Swelling Mass in Neck or Head");
		cbswellingMassIn.setBounds(10, 115, 354, 24);
		panel_7.add(cbswellingMassIn);

		cbdvtDeep = new JCheckBox();
		cbdvtDeep.setText("DVT - Deep Vein Thrombosis");
		cbdvtDeep.setBounds(10, 140, 186, 24);
		panel_7.add(cbdvtDeep);

		cbabdominalDistension = new JCheckBox();
		cbabdominalDistension.setText("Abdominal Distension");
		cbabdominalDistension.setBounds(10, 165, 172, 24);
		panel_7.add(cbabdominalDistension);

		cbinfectionOfKidney = new JCheckBox();
		cbinfectionOfKidney.setText("Infection of Kidney");
		cbinfectionOfKidney.setBounds(10, 190, 172, 24);
		panel_7.add(cbinfectionOfKidney);

		cbfacialWeakness = new JCheckBox();
		cbfacialWeakness.setText("Facial Weakness");
		cbfacialWeakness.setBounds(10, 215, 172, 24);
		panel_7.add(cbfacialWeakness);

		cbabdominalPain = new JCheckBox();
		cbabdominalPain.setText("Abdominal Pain");
		cbabdominalPain.setBounds(10, 240, 186, 24);
		panel_7.add(cbabdominalPain);

		cbhypothyroidism = new JCheckBox();
		cbhypothyroidism.setText("Hypothyroidism");
		cbhypothyroidism.setBounds(10, 265, 172, 24);
		panel_7.add(cbhypothyroidism);

		cbpelvicSwelling = new JCheckBox();
		cbpelvicSwelling.setText("Pelvic Swelling");
		cbpelvicSwelling.setBounds(10, 290, 172, 24);
		panel_7.add(cbpelvicSwelling);

		cbvaricoseVeins = new JCheckBox();
		cbvaricoseVeins.setText("Varicose Veins");
		cbvaricoseVeins.setBounds(10, 315, 162, 24);
		panel_7.add(cbvaricoseVeins);

		cbswellingLimbs = new JCheckBox();
		cbswellingLimbs.setText("Swelling Limbs");
		cbswellingLimbs.setBounds(10, 340, 172, 24);
		panel_7.add(cbswellingLimbs);

		cbhypertension = new JCheckBox();
		cbhypertension.setText("Hypertension");
		cbhypertension.setBounds(10, 365, 172, 24);
		panel_7.add(cbhypertension);

		cbpainInJoint = new JCheckBox();
		cbpainInJoint.setText("Pain in Joint");
		cbpainInJoint.setBounds(10, 390, 172, 24);
		panel_7.add(cbpainInJoint);

		cbstroke = new JCheckBox();
		cbstroke.setText("Stroke");
		cbstroke.setBounds(10, 415, 162, 24);
		panel_7.add(cbstroke);

		cbedema = new JCheckBox();
		cbedema.setText("Edema");
		cbedema.setBounds(10, 436, 153, 24);
		panel_7.add(cbedema);

		final JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_8.setLayout(null);
		panel_8.setBounds(200, 150, 180, 300);
		panel_7.add(panel_8);

		final JLabel otherSymptomsLabel = new JLabel();
		otherSymptomsLabel.setFont(new Font("Arial", Font.BOLD, 16));
		otherSymptomsLabel.setText("Other Symptoms");
		otherSymptomsLabel.setBounds(5, 5, 165, 23);
		panel_8.add(otherSymptomsLabel);

		final JLabel specifyLabel = new JLabel();
		specifyLabel.setFont(new Font("Arial", Font.BOLD, 16));
		specifyLabel.setText("Specify:");
		specifyLabel.setBounds(5, 31, 134, 23);
		panel_8.add(specifyLabel);

		txtSpecify = new JTextField();
		txtSpecify.setOpaque(false);
		txtSpecify.setBounds(10, 60, 165, 230);
		panel_8.add(txtSpecify);

		final JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_2, false));
		panel_9.setLayout(null);
		panel_9.setBounds(10, 670, 430, 300);
		panel.add(panel_9);

		final JLabel pleaseCheckOneLabel = new JLabel();
		pleaseCheckOneLabel.setFont(new Font("Arial", Font.BOLD, 16));
		pleaseCheckOneLabel.setText("Please Check One or More Below:");
		pleaseCheckOneLabel.setBounds(10, 10, 325, 23);
		panel_9.add(pleaseCheckOneLabel);

		cbabdominalrenal = new JCheckBox();
		cbabdominalrenal.setBackground(Color.WHITE);
		cbabdominalrenal.setText("ABDOMINAL/RENAL");
		cbabdominalrenal.setBounds(10, 30, 275, 24);
		panel_9.add(cbabdominalrenal);

		cbcarotidthyroid = new JCheckBox();
		cbcarotidthyroid.setBackground(Color.WHITE);
		cbcarotidthyroid.setText("CAROTID/THYROID");
		cbcarotidthyroid.setBounds(10, 60, 275, 24);
		panel_9.add(cbcarotidthyroid);

		cbpelvic = new JCheckBox();
		cbpelvic.setBackground(Color.WHITE);
		cbpelvic.setText("PELVIC");
		cbpelvic.setBounds(10, 90, 275, 24);
		panel_9.add(cbpelvic);

		cbbilateralVenous = new JCheckBox();
		cbbilateralVenous.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
			}
		});
		cbbilateralVenous.setBackground(Color.WHITE);
		cbbilateralVenous.setText("BILATERAL VENOUS & ARTERIAL DOPPLER");
		cbbilateralVenous.setBounds(10, 120, 275, 24);
		panel_9.add(cbbilateralVenous);

		cbbilateralVenousupper = new JCheckBox();
		cbbilateralVenousupper.setBackground(Color.WHITE);
		cbbilateralVenousupper.setText("Upper");
		cbbilateralVenousupper.setBounds(40, 145, 71, 24);
		panel_9.add(cbbilateralVenousupper);

		cbbilateralVenousDoppler = new JCheckBox();
		cbbilateralVenousDoppler.setBackground(Color.WHITE);
		cbbilateralVenousDoppler.setText("BILATERAL VENOUS DOPPLER");
		cbbilateralVenousDoppler.setBounds(10, 177, 275, 24);
		panel_9.add(cbbilateralVenousDoppler);

		cbbilateralVenousDopplerupper = new JCheckBox();
		cbbilateralVenousDopplerupper.setBackground(Color.WHITE);
		cbbilateralVenousDopplerupper.setText("Upper");
		cbbilateralVenousDopplerupper.setBounds(40, 200, 71, 24);
		panel_9.add(cbbilateralVenousDopplerupper);

		cbbilateralArterialDoppler = new JCheckBox();
		cbbilateralArterialDoppler.setBackground(Color.WHITE);
		cbbilateralArterialDoppler.setText("BILATERAL ARTERIAL DOPPLER");
		cbbilateralArterialDoppler.setBounds(10, 235, 275, 24);
		panel_9.add(cbbilateralArterialDoppler);

		cbbilateralArterialDopplerupper = new JCheckBox();
		cbbilateralArterialDopplerupper.setBackground(Color.WHITE);
		cbbilateralArterialDopplerupper.setText("Upper");
		cbbilateralArterialDopplerupper.setBounds(40, 265, 71, 24);
		panel_9.add(cbbilateralArterialDopplerupper);

		cbbilateralVenouslower = new JCheckBox();
		cbbilateralVenouslower.setBackground(Color.WHITE);
		cbbilateralVenouslower.setText("Lower");
		cbbilateralVenouslower.setBounds(129, 145, 71, 24);
		panel_9.add(cbbilateralVenouslower);

		cbbilateralVenousboth = new JCheckBox();
		cbbilateralVenousboth.setBackground(Color.WHITE);
		cbbilateralVenousboth.setText("Both");
		cbbilateralVenousboth.setBounds(225, 145, 71, 24);
		panel_9.add(cbbilateralVenousboth);

		cbbilateralVenousDopplerlower = new JCheckBox();
		cbbilateralVenousDopplerlower.setBackground(Color.WHITE);
		cbbilateralVenousDopplerlower.setText("Lower");
		cbbilateralVenousDopplerlower.setBounds(130, 200, 71, 24);
		panel_9.add(cbbilateralVenousDopplerlower);

		cbbilateralVenousDopplerboth = new JCheckBox();
		cbbilateralVenousDopplerboth.setBackground(Color.WHITE);
		cbbilateralVenousDopplerboth.setText("Both");
		cbbilateralVenousDopplerboth.setBounds(230, 200, 71, 24);
		panel_9.add(cbbilateralVenousDopplerboth);

		cbbilateralArterialDopplerlower = new JCheckBox();
		cbbilateralArterialDopplerlower.setBackground(Color.WHITE);
		cbbilateralArterialDopplerlower.setText("Lower");
		cbbilateralArterialDopplerlower.setBounds(130, 265, 71, 24);
		panel_9.add(cbbilateralArterialDopplerlower);

		cbbilateralArterialDopplerboth = new JCheckBox();
		cbbilateralArterialDopplerboth.setBackground(Color.WHITE);
		cbbilateralArterialDopplerboth.setText("Both");
		cbbilateralArterialDopplerboth.setBounds(235, 265, 71, 24);
		panel_9.add(cbbilateralArterialDopplerboth);

		final JPanel panel_9_1 = new JPanel();
		panel_9_1.setBackground(Color.WHITE);
		panel_9_1
				.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK, 5, false));
		panel_9_1.setLayout(null);
		panel_9_1.setBounds(10, 975, 430, 85);
		panel.add(panel_9_1);

		cbEcho = new JCheckBox();
		cbEcho.setBackground(Color.WHITE);
		cbEcho.setText("ECHO");
		cbEcho.setBounds(10, 5, 275, 24);
		panel_9_1.add(cbEcho);

		cbEkg = new JCheckBox();
		cbEkg.setBackground(Color.WHITE);
		cbEkg.setText("EKG");
		cbEkg.setBounds(10, 30, 140, 24);
		panel_9_1.add(cbEkg);

		cbOther = new JCheckBox();
		cbOther.setBackground(Color.WHITE);
		cbOther.setText("OTHER");
		cbOther.setBounds(10, 55, 106, 24);
		panel_9_1.add(cbOther);

		cbxray = new JCheckBox();
		cbxray.setBackground(Color.WHITE);
		cbxray.setText("X-RAY SPECIFY");
		cbxray.setBounds(155, 30, 130, 24);
		panel_9_1.add(cbxray);

		txtXrayspecify = new JTextField();
		txtXrayspecify.setBounds(298, 32, 122, 20);
		panel_9_1.add(txtXrayspecify);

		txtother = new JTextField();
		txtother.setBounds(123, 60, 146, 19);
		panel_9_1.add(txtother);

		final JPanel panel_9_2 = new JPanel();
		panel_9_2.setBackground(Color.WHITE);
		panel_9_2
				.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK, 5, false));
		panel_9_2.setLayout(null);
		panel_9_2.setBounds(10, 1065, 820, 85);
		panel.add(panel_9_2);

		final JLabel allAbdominalStudiesLabel = new JLabel();
		allAbdominalStudiesLabel.setFont(new Font("", Font.BOLD, 12));
		allAbdominalStudiesLabel
				.setText("                 All Abdominal Studies include Renal. All Arterial Studies include segmental PVR. All Pelvic Studies include Renal/Abdominal.");
		allAbdominalStudiesLabel.setBounds(10, 10, 800, 16);
		panel_9_2.add(allAbdominalStudiesLabel);

		final JLabel allAbdominalStudiesLabel_1 = new JLabel();
		allAbdominalStudiesLabel_1
				.setText("                                                                          We will follow any physician modification to this form.");
		allAbdominalStudiesLabel_1.setBounds(10, 32, 800, 16);
		panel_9_2.add(allAbdominalStudiesLabel_1);

		final JLabel allAbdominalStudiesLabel_2 = new JLabel();
		allAbdominalStudiesLabel_2
				.setText("                                      When multiple tests are ordered it may be necessary to perform them on separate occasions.");
		allAbdominalStudiesLabel_2.setBounds(10, 54, 800, 16);
		panel_9_2.add(allAbdominalStudiesLabel_2);

		final JPanel panel_9_2_1 = new JPanel();
		panel_9_2_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_9_2_1.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_9_2_1.setLayout(null);
		panel_9_2_1.setBounds(10, 1155, 820, 115);
		panel.add(panel_9_2_1);

		final JLabel personSigningBelowLabel = new JLabel();
		personSigningBelowLabel
				.setText("    Person signing below verifies the medical necessity of the test being performed. The signature also verifies the presence of physicians’");
		personSigningBelowLabel.setBounds(10, 10, 800, 16);
		panel_9_2_1.add(personSigningBelowLabel);

		final JLabel personSigningBelowLabel_1 = new JLabel();
		personSigningBelowLabel_1
				.setText("    order for the test being performed. Doctor certifies that this patient, because of age, physical limitations, and for the care of the patient,");
		personSigningBelowLabel_1.setBounds(10, 26, 800, 16);
		panel_9_2_1.add(personSigningBelowLabel_1);

		final JLabel personSigningBelowLabel_2 = new JLabel();
		personSigningBelowLabel_2
				.setText("    the exam should not be conducted outside the above location.");
		personSigningBelowLabel_2.setBounds(10, 42, 800, 16);
		panel_9_2_1.add(personSigningBelowLabel_2);

		final JLabel signatureLabel = new JLabel();
		signatureLabel.setFont(new Font("Arial", Font.BOLD, 16));
		signatureLabel.setText("Signature");
		signatureLabel.setBounds(10, 64, 109, 30);
		panel_9_2_1.add(signatureLabel);

		final JLabel signatureLabel_1 = new JLabel();
		signatureLabel_1.setFont(new Font("Arial", Font.BOLD, 16));
		signatureLabel_1.setText("Date");
		signatureLabel_1.setBounds(436, 64, 109, 30);
		panel_9_2_1.add(signatureLabel_1);

		dcdate3 = new JDateChooser();
		dcdate3.setBounds(519, 70, 151, 20);
		panel_9_2_1.add(dcdate3);

		txtSignature = new JTextField();
		txtSignature.setBounds(96, 70, 225, 35);
		panel_9_2_1.add(txtSignature);
		doLoad();

	}

	public static void main(String ar[]) {
		try {
			UIManager
					.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JScrollPane scroller = new JScrollPane();
		PanelEkgUltrasound panel = new PanelEkgUltrasound();
		scroller.setViewportView(panel);
		JFrame frm = new JFrame("Frame");
		frm.setSize(new Dimension(java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize()));
		frm.add(scroller);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setState(JFrame.MAXIMIZED_BOTH);
		frm.setVisible(true);
		// SwingUtils.openInDialogforJPanel().setVisible(true);

	}

	public void doLoad() {

		int currentResidentid = Global.currentResidenceKey;

		if (currentResidentid != 0) {
			try {
				ResidentMain residentMain = MedrexClientManager.getInstance()
						.getResident(Global.currentResidenceKey);
				ResidentContact residentContact = MedrexClientManager
						.getInstance().getResidentContact(
								Global.currentResidenceKey);
				ResidentContactPhone residentContactPhone = MedrexClientManager
						.getInstance().getResidentContactPhone(
								Global.currentResidenceKey);
				// ResidentStatusSheet residentStatusSheet =
				// MedrexClientManager.getInstance().getResidentStatusSheet(currentResidentid);

				txtpatient.setText(residentContact.getLastName());
				txtFirstname.setText(residentContact.getFirstName());
				txtaddress.setText(residentContact.getAddress());
				dcdatedatefbirth.setDate(residentMain.getDob());
				txtpolicy.setText(residentMain.getInsuranceNum());
				txtmedicaid.setText(residentMain.getMedicaidNum());
				dcdateService.setDate(residentMain.getAdmittedOn());
				txtphone.setText(residentContactPhone.getNumber());
				txtmedicare.setText(residentMain.getMedicareNum());
				txtSocialSecurity1.setText(residentMain.getSs1());
				txtSocialSecurity2.setText(residentMain.getSs2());
				txtSocialSecurity3.setText(residentMain.getSs3());
				dcdate3.setDate(new Date());
				// txtRoom.setText(residentStatusSheet.getRoom());
				// bgGender.isSelected(bgGender,residentContact.getSex());

			} catch (RemoteException e) {
				e.printStackTrace();
			} catch (MedrexException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public int doSave() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void doUpdate() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean doValidate() {
		// TODO Auto-generated method stub
		return false;
	}

}
