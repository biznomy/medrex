package medrex.client.main.activity;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.Map;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;

import medrex.client.admin.formConfig.FormConfigValidation;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.admission.PanelloggedInUser;
import medrex.client.utils.SwingUtils;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.Form;
import medrex.commons.vo.activity.ActivityAssessmentFormPage2;
import medrex.commons.vo.admin.UserLogon;
import medrex.commons.vo.admission.ResidentAssessmentFormPage1;
import medrex.commons.vo.notes.Notes;
import medrex.commons.vo.others.Users;

import com.sX.swing.notes.JxNotes;
import com.toedter.calendar.JDateChooser;

public class PanelActivityAssessmentFormPage2 extends JPanel implements Form {

	private Map<String, String> presentationMap;
	private JRadioButton rbEasilyAtTime;
	private JRadioButton rbCommAtTime;
	private JRadioButton rbConfusionAtTime;
	private JCheckBox cbOrientedDis;
	private JCheckBox cbOrientedObject;
	private JCheckBox cbOrientedSituation;
	private JCheckBox cbOrientedTime;
	private JCheckBox cbOrientedPlace;
	private JCheckBox cbOrientedPerson;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ButtonGroup bgShortCategory = new ButtonGroup();
	private ButtonGroup bgLiquids = new ButtonGroup();
	private ButtonGroup bgType = new ButtonGroup();
	private ButtonGroup bgConsistency = new ButtonGroup();
	// private ButtonGroup bgDwells = new ButtonGroup();
	// private ButtonGroup bgUncoorperativeCategory = new ButtonGroup();
	// private ButtonGroup bgCoorperativeCategory = new ButtonGroup();
	private JDateChooser dcNurseVisit;
	private JLabel dateLabel;
	private JComboBox cmbNurse;
	private JLabel ifSoWhatLabel;
	private JPanel panel_3;
	private JxNotes txtCommentsArea;
	private JLabel nameLabel_2;
	private JLabel consistencyLabel_2;
	private JRadioButton rbLiquidFluid;
	private JRadioButton rbTypeOther;
	private JLabel consistencyLabel_1;
	private JLabel consistencyLabel;
	private JRadioButton rbLiquidPudding;
	private JRadioButton rbLiquidHoney;
	private JRadioButton rbLiquidNectar;
	private JRadioButton rbLiquidRegular;
	private JRadioButton rbTypeNPO;
	private JRadioButton rbTypeLowfat;
	private JRadioButton rbTypeNAS;
	private JRadioButton rbTypeRegular;
	private JRadioButton rbConsistencyPureed;
	private JRadioButton rbConsistencyChopped;
	private JRadioButton rbConsistencyMechanical;
	private JRadioButton rbConsistencyRegular;
	private JPanel panel_2;
	private JLabel nameLabel_1;
	private JCheckBox cbUnresponsive;
	private JCheckBox cbAggression;
	private JCheckBox cbAgitation;
	private JCheckBox cbDwells;
	private JCheckBox cbRepeVerb;
	private JCheckBox cbTearful;
	private JCheckBox cbWithDrawn;
	private JCheckBox cbUncoorporative;
	private JCheckBox cbMotivated;
	private JCheckBox cbHumorous;
	private JCheckBox cbCheerful;
	private JCheckBox cbCoorporative;
	private JPanel panel_1;
	private JLabel nameLabel;
	private ButtonGroup bgCommCategory = new ButtonGroup();
	private JRadioButton rbCommNeeds;
	private JRadioButton rbCommIndependent;
	private ButtonGroup bgConFusionYesNo = new ButtonGroup();
	private JRadioButton rbConfusionNo;
	private JRadioButton rbConfusionYes;
	private JLabel pLabel_1;
	private ButtonGroup bgYesNoGroup = new ButtonGroup();
	private JRadioButton rbLongNo;
	private JRadioButton rbLongYes;
	private JLabel pLabel;
	private JLabel nameLabel_9;

	private ButtonGroup bgRegularlyNaps = new ButtonGroup();

	private ButtonGroup bgPrefers = new ButtonGroup();
	private JRadioButton rbEasilyNo;
	private JRadioButton rbEasilyYes;
	private JLabel pLabel_38;
	private JLabel pLabel_37;
	private JRadioButton rbShortNo;
	private JRadioButton rbShortYes;
	private JLabel pLabel_34;
	private JLabel pLabel_33;
	private JPanel panel_115;
	private Notes notestxtCommentsArea;
	// If true then categories list and label will display otherwise not.
	private boolean isCategories = true;

	/**
	 * Create the panel
	 */
	public PanelActivityAssessmentFormPage2() {
		super();
		setBorder(new LineBorder(Color.black, 1, false));
		setPreferredSize(new Dimension(800, 1000));

		Global.panelActivityAssessmentFormPage2 = this;

		setLayout(null);
		setSize(800, 1064);
		setBackground(Color.WHITE);

		panel_115 = new JPanel();
		panel_115.setLayout(null);
		panel_115.setBackground(Color.WHITE);
		panel_115.setBounds(20, 64, 767, 174);
		add(panel_115);

		pLabel_33 = new JLabel();
		pLabel_33.setFont(new Font("Arial", Font.PLAIN, 13));
		pLabel_33.setText("Oriented to:");
		pLabel_33.setBounds(0, 0, 767, 20);
		panel_115.add(pLabel_33);

		pLabel_34 = new JLabel();
		pLabel_34.setFont(new Font("Arial", Font.PLAIN, 13));
		pLabel_34.setText("Short Term Memory:                       In Tact");
		pLabel_34.setBounds(0, 30, 767, 20);
		panel_115.add(pLabel_34);

		rbShortYes = new JRadioButton();
		bgShortCategory.add(rbShortYes);
		rbShortYes.setActionCommand("1");
		rbShortYes.setBackground(Color.WHITE);
		rbShortYes.setText("Yes");
		rbShortYes.setBounds(327, 29, 70, 18);
		panel_115.add(rbShortYes);

		rbShortNo = new JRadioButton();
		bgShortCategory.add(rbShortNo);
		rbShortNo.setActionCommand("2");
		rbShortNo.setBackground(Color.WHITE);
		rbShortNo.setText("No");
		rbShortNo.setBounds(439, 29, 66, 18);
		panel_115.add(rbShortNo);

		pLabel_37 = new JLabel();
		pLabel_37.setFont(new Font("Arial", Font.PLAIN, 13));
		pLabel_37.setText("Communication Needs:");
		pLabel_37.setBounds(0, 120, 767, 20);
		panel_115.add(pLabel_37);

		pLabel_38 = new JLabel();
		pLabel_38.setFont(new Font("Arial", Font.PLAIN, 13));
		pLabel_38.setText("Easily Understood:");
		pLabel_38.setBounds(0, 150, 767, 20);
		panel_115.add(pLabel_38);

		rbEasilyYes = new JRadioButton();
		bgRegularlyNaps.add(rbEasilyYes);
		rbEasilyYes.setActionCommand("1");
		rbEasilyYes.setBackground(Color.WHITE);
		rbEasilyYes.setText("Yes");
		rbEasilyYes.setBounds(327, 150, 49, 18);
		panel_115.add(rbEasilyYes);

		rbEasilyNo = new JRadioButton();
		bgRegularlyNaps.add(rbEasilyNo);
		rbEasilyNo.setActionCommand("2");
		rbEasilyNo.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
			}
		});
		rbEasilyNo.setBackground(Color.WHITE);
		rbEasilyNo.setText("No");
		rbEasilyNo.setBounds(439, 150, 106, 18);
		panel_115.add(rbEasilyNo);

		pLabel = new JLabel();
		pLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		pLabel.setText("Long Term Memory:                        In Tact");
		pLabel.setBounds(0, 60, 767, 20);
		panel_115.add(pLabel);

		rbLongYes = new JRadioButton();
		bgYesNoGroup.add(rbLongYes);
		rbLongYes.setActionCommand("1");
		rbLongYes.setBackground(Color.WHITE);
		rbLongYes.setText("Yes");
		rbLongYes.setBounds(327, 60, 66, 18);
		panel_115.add(rbLongYes);

		rbLongNo = new JRadioButton();
		bgYesNoGroup.add(rbLongNo);
		rbLongNo.setActionCommand("2");
		rbLongNo.setBackground(Color.WHITE);
		rbLongNo.setText("No");
		rbLongNo.setBounds(439, 60, 78, 18);
		panel_115.add(rbLongNo);

		pLabel_1 = new JLabel();
		pLabel_1.setFont(new Font("Arial", Font.PLAIN, 13));
		pLabel_1.setText("Confusion:");
		pLabel_1.setBounds(0, 90, 767, 20);
		panel_115.add(pLabel_1);

		rbConfusionYes = new JRadioButton();
		bgConFusionYesNo.add(rbConfusionYes);
		rbConfusionYes.setActionCommand("1");
		rbConfusionYes.setBackground(Color.WHITE);
		rbConfusionYes.setText("Yes");
		rbConfusionYes.setBounds(327, 90, 66, 18);
		panel_115.add(rbConfusionYes);

		rbConfusionNo = new JRadioButton();
		bgConFusionYesNo.add(rbConfusionNo);
		rbConfusionNo.setActionCommand("2");
		rbConfusionNo.setBackground(Color.WHITE);
		rbConfusionNo.setText("No");
		rbConfusionNo.setBounds(439, 90, 106, 18);
		panel_115.add(rbConfusionNo);

		rbCommIndependent = new JRadioButton();
		bgCommCategory.add(rbCommIndependent);
		rbCommIndependent.setActionCommand("1");
		rbCommIndependent.setBackground(Color.WHITE);
		rbCommIndependent.setText("Independent");
		rbCommIndependent.setBounds(327, 120, 106, 18);
		panel_115.add(rbCommIndependent);

		rbCommNeeds = new JRadioButton();
		bgCommCategory.add(rbCommNeeds);
		rbCommNeeds.setActionCommand("2");
		rbCommNeeds.setBackground(Color.WHITE);
		rbCommNeeds.setText("Needs Assistance");
		rbCommNeeds.setBounds(439, 120, 106, 18);
		panel_115.add(rbCommNeeds);

		cbOrientedPerson = new JCheckBox();
		cbOrientedPerson.setBackground(Color.WHITE);
		cbOrientedPerson.setText("Person");
		cbOrientedPerson.setBounds(100, 0, 94, 18);
		panel_115.add(cbOrientedPerson);

		cbOrientedPlace = new JCheckBox();
		cbOrientedPlace.setBackground(Color.WHITE);
		cbOrientedPlace.setText("Place");
		cbOrientedPlace.setBounds(212, 0, 94, 18);
		panel_115.add(cbOrientedPlace);

		cbOrientedTime = new JCheckBox();
		cbOrientedTime.setBackground(Color.WHITE);
		cbOrientedTime.setText("Time");
		cbOrientedTime.setBounds(327, 0, 94, 18);
		panel_115.add(cbOrientedTime);

		cbOrientedSituation = new JCheckBox();
		cbOrientedSituation.setBackground(Color.WHITE);
		cbOrientedSituation.setText("Situation");
		cbOrientedSituation.setBounds(439, 0, 92, 18);
		panel_115.add(cbOrientedSituation);

		cbOrientedObject = new JCheckBox();
		cbOrientedObject.setBackground(Color.WHITE);
		cbOrientedObject.setText("Object");
		cbOrientedObject.setBounds(547, 0, 94, 18);
		panel_115.add(cbOrientedObject);

		cbOrientedDis = new JCheckBox();
		cbOrientedDis.setBackground(Color.WHITE);
		cbOrientedDis.setText("Disoriented");
		cbOrientedDis.setBounds(652, 0, 94, 18);
		panel_115.add(cbOrientedDis);

		rbConfusionAtTime = new JRadioButton();
		bgConFusionYesNo.add(rbConfusionAtTime);
		rbConfusionAtTime.setActionCommand("3");
		rbConfusionAtTime.setBackground(Color.WHITE);
		rbConfusionAtTime.setText("At Time");
		rbConfusionAtTime.setBounds(551, 90, 106, 18);
		panel_115.add(rbConfusionAtTime);

		rbCommAtTime = new JRadioButton();
		bgCommCategory.add(rbCommAtTime);
		rbCommAtTime.setActionCommand("3");
		rbCommAtTime.setBackground(Color.WHITE);
		rbCommAtTime.setText("At Time");
		rbCommAtTime.setBounds(551, 120, 106, 18);
		panel_115.add(rbCommAtTime);

		rbEasilyAtTime = new JRadioButton();
		bgRegularlyNaps.add(rbEasilyAtTime);
		rbEasilyAtTime.setActionCommand("3");
		rbEasilyAtTime.setBackground(Color.WHITE);
		rbEasilyAtTime.setText("At Time");
		rbEasilyAtTime.setBounds(551, 150, 106, 18);
		panel_115.add(rbEasilyAtTime);

		nameLabel_9 = new JLabel();
		nameLabel_9.setFont(new Font("", Font.BOLD, 20));
		nameLabel_9.setText("Communication and Cognitive Status:");
		nameLabel_9.setBounds(20, 28, 480, 30);
		add(nameLabel_9);

		nameLabel = new JLabel();
		nameLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		nameLabel.setText("Psychosocial Well-Being and Behavioral Issues:");
		nameLabel.setBounds(20, 260, 480, 30);
		add(nameLabel);

		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(20, 296, 767, 83);
		add(panel_1);

		cbCoorporative = new JCheckBox();
		// bgCoorperativeCategory.add(cbCoorporative);
		cbCoorporative.setBackground(Color.WHITE);
		// cbCoorporative.setActionCommand("1");
		cbCoorporative.setText("Coorperative");
		cbCoorporative.setBounds(0, 0, 90, 18);
		panel_1.add(cbCoorporative);

		cbCheerful = new JCheckBox();
		// bgCoorperativeCategory.add(cbCheerful);
		cbCheerful.setBackground(Color.WHITE);
		// cbCheerful.setActionCommand("2");
		cbCheerful.setText("Cheerful");
		cbCheerful.setBounds(200, 0, 185, 18);
		panel_1.add(cbCheerful);

		cbHumorous = new JCheckBox();
		// bgCoorperativeCategory.add(cbHumorous);
		cbHumorous.setBackground(Color.WHITE);
		// cbHumorous.setActionCommand("3");
		cbHumorous.setText("Humorous");
		cbHumorous.setBounds(400, 0, 147, 18);
		panel_1.add(cbHumorous);

		cbMotivated = new JCheckBox();
		// bgCoorperativeCategory.add(cbMotivated);
		cbMotivated.setBackground(Color.WHITE);
		// cbMotivated.setActionCommand("4");
		cbMotivated.setText("Motivated");
		cbMotivated.setBounds(600, 0, 138, 18);
		panel_1.add(cbMotivated);

		cbUncoorporative = new JCheckBox();
		// bgUncoorperativeCategory.add(cbUncoorporative);
		cbUncoorporative.setBackground(Color.WHITE);
		// cbUncoorporative.setActionCommand("1");
		cbUncoorporative.setText("Uncoorperative");
		cbUncoorporative.setBounds(0, 30, 106, 18);
		panel_1.add(cbUncoorporative);

		cbWithDrawn = new JCheckBox();
		// bgUncoorperativeCategory.add(cbWithDrawn);
		cbWithDrawn.setBackground(Color.WHITE);
		// cbWithDrawn.setActionCommand("2");
		cbWithDrawn.setText("Withdrawn");
		cbWithDrawn.setBounds(200, 30, 181, 18);
		panel_1.add(cbWithDrawn);

		cbTearful = new JCheckBox();
		// bgUncoorperativeCategory.add(cbTearful);
		cbTearful.setBackground(Color.WHITE);
		// cbTearful.setActionCommand("3");
		cbTearful.setText("Tearful_Wanders");
		cbTearful.setBounds(400, 30, 128, 18);
		panel_1.add(cbTearful);

		cbRepeVerb = new JCheckBox();
		// bgUncoorperativeCategory.add(cbRepeVerb);
		cbRepeVerb.setBackground(Color.WHITE);
		// cbRepeVerb.setActionCommand("4");
		cbRepeVerb.setText("Repeated Verbalization");
		cbRepeVerb.setBounds(600, 30, 138, 18);
		panel_1.add(cbRepeVerb);

		cbDwells = new JCheckBox();
		// bgDwells.add(cbDwells);
		// cbDwells.setActionCommand("1");
		cbDwells.setBackground(Color.WHITE);
		cbDwells.setText("Dwells on Illness/Other Problems");
		cbDwells.setBounds(0, 60, 181, 18);
		panel_1.add(cbDwells);

		cbAgitation = new JCheckBox();
		// bgDwells.add(cbAgitation);
		// cbAgitation.setActionCommand("2");
		cbAgitation.setBackground(Color.WHITE);
		cbAgitation.setText("Agitation");
		cbAgitation.setBounds(200, 60, 106, 18);
		panel_1.add(cbAgitation);

		cbAggression = new JCheckBox();
		// bgDwells.add(cbAggression);
		// cbAggression.setActionCommand("3");
		cbAggression.setBackground(Color.WHITE);
		cbAggression.setText("Aggression");
		cbAggression.setBounds(400, 60, 106, 18);
		panel_1.add(cbAggression);

		cbUnresponsive = new JCheckBox();
		// bgDwells.add(cbUnresponsive);
		// cbUnresponsive.setActionCommand("4");
		cbUnresponsive.setBackground(Color.WHITE);
		cbUnresponsive.setText("Unresponsive");
		cbUnresponsive.setBounds(600, 60, 106, 18);
		panel_1.add(cbUnresponsive);

		nameLabel_1 = new JLabel();
		nameLabel_1.setFont(new Font("Dialog", Font.BOLD, 20));
		nameLabel_1.setText("Diet:");
		nameLabel_1.setBounds(20, 409, 100, 30);
		add(nameLabel_1);

		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(20, 439, 767, 83);
		add(panel_2);

		rbConsistencyRegular = new JRadioButton();
		bgConsistency.add(rbConsistencyRegular);
		rbConsistencyRegular.setBackground(Color.WHITE);
		rbConsistencyRegular.setActionCommand("1");
		rbConsistencyRegular.setText("Regular");
		rbConsistencyRegular.setBounds(110, 0, 115, 18);
		panel_2.add(rbConsistencyRegular);

		rbConsistencyMechanical = new JRadioButton();
		bgConsistency.add(rbConsistencyMechanical);
		rbConsistencyMechanical.setBackground(Color.WHITE);
		rbConsistencyMechanical.setActionCommand("2");
		rbConsistencyMechanical.setText("Mechanical Soft");
		rbConsistencyMechanical.setBounds(250, 0, 106, 18);
		panel_2.add(rbConsistencyMechanical);

		rbConsistencyChopped = new JRadioButton();
		bgConsistency.add(rbConsistencyChopped);
		rbConsistencyChopped.setBackground(Color.WHITE);
		rbConsistencyChopped.setActionCommand("3");
		rbConsistencyChopped.setText("Chopped");
		rbConsistencyChopped.setBounds(390, 0, 79, 18);
		panel_2.add(rbConsistencyChopped);

		rbConsistencyPureed = new JRadioButton();
		bgConsistency.add(rbConsistencyPureed);
		rbConsistencyPureed.setBackground(Color.WHITE);
		rbConsistencyPureed.setActionCommand("4");
		rbConsistencyPureed.setText("Pureed");
		rbConsistencyPureed.setBounds(540, 0, 73, 18);
		panel_2.add(rbConsistencyPureed);

		rbTypeRegular = new JRadioButton();
		bgType.add(rbTypeRegular);
		rbTypeRegular.setBackground(Color.WHITE);
		rbTypeRegular.setActionCommand("1");
		rbTypeRegular.setText("Regular  NCS");
		rbTypeRegular.setBounds(110, 30, 86, 18);
		panel_2.add(rbTypeRegular);

		rbTypeNAS = new JRadioButton();
		bgType.add(rbTypeNAS);
		rbTypeNAS.setBackground(Color.WHITE);
		rbTypeNAS.setActionCommand("2");
		rbTypeNAS.setText("NAS");
		rbTypeNAS.setBounds(250, 30, 86, 18);
		panel_2.add(rbTypeNAS);

		rbTypeLowfat = new JRadioButton();
		bgType.add(rbTypeLowfat);
		rbTypeLowfat.setBackground(Color.WHITE);
		rbTypeLowfat.setActionCommand("3");
		rbTypeLowfat.setText("Low Fat");
		rbTypeLowfat.setBounds(390, 30, 126, 18);
		panel_2.add(rbTypeLowfat);

		rbTypeNPO = new JRadioButton();
		bgType.add(rbTypeNPO);
		rbTypeNPO.setBackground(Color.WHITE);
		rbTypeNPO.setActionCommand("4");
		rbTypeNPO.setText("NPO");
		rbTypeNPO.setBounds(540, 30, 52, 18);
		panel_2.add(rbTypeNPO);

		rbLiquidRegular = new JRadioButton();
		bgLiquids.add(rbLiquidRegular);
		rbLiquidRegular.setBackground(Color.WHITE);
		rbLiquidRegular.setActionCommand("1");
		rbLiquidRegular.setText("Regular");
		rbLiquidRegular.setBounds(110, 60, 97, 18);
		panel_2.add(rbLiquidRegular);

		rbLiquidNectar = new JRadioButton();
		bgLiquids.add(rbLiquidNectar);
		rbLiquidNectar.setBackground(Color.WHITE);
		rbLiquidNectar.setActionCommand("2");
		rbLiquidNectar.setText("Nectar");
		rbLiquidNectar.setBounds(250, 60, 97, 18);
		panel_2.add(rbLiquidNectar);

		rbLiquidHoney = new JRadioButton();
		bgLiquids.add(rbLiquidHoney);
		rbLiquidHoney.setBackground(Color.WHITE);
		rbLiquidHoney.setActionCommand("3");
		rbLiquidHoney.setText("Honey");
		rbLiquidHoney.setBounds(390, 60, 106, 18);
		panel_2.add(rbLiquidHoney);

		rbLiquidPudding = new JRadioButton();
		bgLiquids.add(rbLiquidPudding);
		rbLiquidPudding.setBackground(Color.WHITE);
		rbLiquidPudding.setActionCommand("4");
		rbLiquidPudding.setText("Pudding");
		rbLiquidPudding.setBounds(540, 60, 97, 18);
		panel_2.add(rbLiquidPudding);

		consistencyLabel = new JLabel();
		consistencyLabel.setText("Consistency:");
		consistencyLabel.setBounds(0, 0, 79, 14);
		panel_2.add(consistencyLabel);

		consistencyLabel_1 = new JLabel();
		consistencyLabel_1.setText("Type:");
		consistencyLabel_1.setBounds(0, 30, 79, 14);
		panel_2.add(consistencyLabel_1);

		rbTypeOther = new JRadioButton();
		bgType.add(rbTypeOther);
		rbTypeOther.setBackground(Color.WHITE);
		rbTypeOther.setActionCommand("5");
		rbTypeOther.setText("Other");
		rbTypeOther.setBounds(651, 30, 106, 18);
		panel_2.add(rbTypeOther);

		rbLiquidFluid = new JRadioButton();
		bgLiquids.add(rbLiquidFluid);
		rbLiquidFluid.setActionCommand("5");
		rbLiquidFluid.setBackground(Color.WHITE);
		rbLiquidFluid.setText("Fluid Restriction");
		rbLiquidFluid.setBounds(651, 60, 106, 18);
		panel_2.add(rbLiquidFluid);

		consistencyLabel_2 = new JLabel();
		consistencyLabel_2.setText("Liquids:");
		consistencyLabel_2.setBounds(0, 60, 79, 14);
		panel_2.add(consistencyLabel_2);

		nameLabel_2 = new JLabel();
		nameLabel_2.setFont(new Font("Dialog", Font.BOLD, 20));
		nameLabel_2.setText("Comments:");
		nameLabel_2.setBounds(20, 546, 132, 26);
		add(nameLabel_2);

		notestxtCommentsArea = new Notes();
		notestxtCommentsArea.setFormName("Activity Initial Assessment");
		notestxtCommentsArea.setUserId(Global.currentLoggedInUserKey);

		txtCommentsArea = new JxNotes(isCategories);
		txtCommentsArea.setBorder(new LineBorder(Color.black, 1, false));
		// txtCommentsArea.setLineWrap(true);
		// txtCommentsArea.setWrapStyleWord(true);
		txtCommentsArea.setBounds(20, 578, 767, 357);
		add(txtCommentsArea);

		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(20, 965, 767, 30);
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
		dateLabel.setBounds(421, 5, 42, 16);
		panel_3.add(dateLabel);

		dcNurseVisit = new JDateChooser();
		dcNurseVisit.setDate(MedrexClientManager.getServerTime());
		dcNurseVisit.setDateFormatString("MM/dd/yyyy");
		dcNurseVisit.setBounds(454, 1, 168, 26);
		panel_3.add(dcNurseVisit);

		final PanelloggedInUser panel = new PanelloggedInUser();
		panel.setBounds(121, -1, 288, 28);
		panel_3.add(panel);

		doLoad();

	}

	public void fillCombos() {
		UserLogon ul = new UserLogon();
		try {
			ul = MedrexClientManager.getInstance().getcurrentUserLogon();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Users user = new Users();
		try {
			user = MedrexClientManager.getInstance().getUser(ul.getUserId());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cmbNurse.addItem(user.getUserName());
		cmbNurse.setVisible(false);

	}

	public void doLoad() {
		fillCombos();
		doUpdate();
	}

	public int doSave() {

		ActivityAssessmentFormPage2 reflActivityAssessmentFormPage2 = new ActivityAssessmentFormPage2();
		reflActivityAssessmentFormPage2
				.setResidentId(Global.currentResidenceKey);
		reflActivityAssessmentFormPage2
				.setSerial(Global.currentActivityAssessmentFormPage2Key);
		reflActivityAssessmentFormPage2
				.setFormId(Global.currentActivitysInitAssmntKey);

		reflActivityAssessmentFormPage2.setOrientedDis(cbOrientedDis
				.isSelected());
		reflActivityAssessmentFormPage2.setOrientedObject(cbOrientedObject
				.isSelected());
		reflActivityAssessmentFormPage2
				.setOrientedSituation(cbOrientedSituation.isSelected());
		reflActivityAssessmentFormPage2.setOrientedTime(cbOrientedTime
				.isSelected());
		reflActivityAssessmentFormPage2.setOrientedPlace(cbOrientedPlace
				.isSelected());
		reflActivityAssessmentFormPage2.setOrientedPerson(cbOrientedPerson
				.isSelected());

		reflActivityAssessmentFormPage2.setShortCategory(SwingUtils
				.getSelectedButton(bgShortCategory));
		reflActivityAssessmentFormPage2.setLiquids(SwingUtils
				.getSelectedButton(bgLiquids));
		reflActivityAssessmentFormPage2.setType(SwingUtils
				.getSelectedButton(bgType));
		reflActivityAssessmentFormPage2.setConsistency(SwingUtils
				.getSelectedButton(bgConsistency));
		reflActivityAssessmentFormPage2.setCooperative(cbCoorporative
				.isSelected());
		reflActivityAssessmentFormPage2.setCheerful(cbCheerful.isSelected());
		reflActivityAssessmentFormPage2.setHumorous(cbHumorous.isSelected());
		reflActivityAssessmentFormPage2.setMotivated(cbMotivated.isSelected());
		reflActivityAssessmentFormPage2.setUncooperative(cbCoorporative
				.isSelected());
		reflActivityAssessmentFormPage2.setWithdrawn(cbWithDrawn.isSelected());
		reflActivityAssessmentFormPage2.setTearful(cbTearful.isSelected());
		reflActivityAssessmentFormPage2.setRepverb(cbRepeVerb.isSelected());
		reflActivityAssessmentFormPage2.setDwells(cbDwells.isSelected());
		reflActivityAssessmentFormPage2.setAgitation(cbAgitation.isSelected());
		reflActivityAssessmentFormPage2
				.setAggression(cbAggression.isSelected());
		reflActivityAssessmentFormPage2.setUnresponsive(cbUnresponsive
				.isSelected());
		reflActivityAssessmentFormPage2.setNurseVisit(dcNurseVisit.getDate());
		reflActivityAssessmentFormPage2.setNurse((String) cmbNurse
				.getSelectedItem());
		reflActivityAssessmentFormPage2.setCommentsArea(txtCommentsArea
				.getNotes());
		reflActivityAssessmentFormPage2.setCommCategory(SwingUtils
				.getSelectedButton(bgCommCategory));
		reflActivityAssessmentFormPage2.setConFusionYesNo(SwingUtils
				.getSelectedButton(bgConFusionYesNo));
		reflActivityAssessmentFormPage2.setYesNoGroup(SwingUtils
				.getSelectedButton(bgYesNoGroup));
		reflActivityAssessmentFormPage2.setRegularlyNaps(SwingUtils
				.getSelectedButton(bgRegularlyNaps));
		reflActivityAssessmentFormPage2.setPrefers(SwingUtils
				.getSelectedButton(bgPrefers));

		try {
			Global.currentActivityAssessmentFormPage2Key = MedrexClientManager
					.getInstance().insertOrUpdateActivityAssessmentFormPage2(
							reflActivityAssessmentFormPage2);
			// for sending trigger word message
			String str = txtCommentsArea.getTriggerWord();

			if (str != null) {
				txtCommentsArea.sendMail(str);
			}
			FormConfigValidation.saveAlertMessages(
					"Activity Initial Assessment Form Page 2", this);
		} catch (Exception e) {
		}
		return Global.currentActivityAssessmentFormPage2Key;
	}

	public void doUpdate() {
		ResidentAssessmentFormPage1 rafp1 = null;
		if (Global.currentActivitysInitAssmntKey == 0) {
			try {
				rafp1 = MedrexClientManager.getInstance()
						.getLatestResidentAssessmentFormPage1(
								Global.currentResidenceKey);
			} catch (Exception e) {
			}
			if (rafp1 != null) {
				if (rafp1.getCommunicationType() == 1) {
					SwingUtils.setSelectedButton(bgRegularlyNaps, rafp1
							.getCommunicationType());
				}
				if (rafp1.getCommunicationAnswers() == 3) {
					SwingUtils.setSelectedButton(bgConFusionYesNo, 1);
				}
			}
		}
		ActivityAssessmentFormPage2 reflActivityAssessmentFormPage2 = null;

		if (Global.currentActivitysInitAssmntKey != 0) {
			try {
				reflActivityAssessmentFormPage2 = MedrexClientManager
						.getInstance().getActivityAssessmentFormPage2(
								Global.currentActivitysInitAssmntKey);
			} catch (Exception e) {

			}
			Global.currentActivityAssessmentFormPage2Key = reflActivityAssessmentFormPage2
					.getSerial();
			cbOrientedDis.setSelected(reflActivityAssessmentFormPage2
					.isOrientedDis());
			cbOrientedObject.setSelected(reflActivityAssessmentFormPage2
					.isOrientedObject());
			cbOrientedSituation.setSelected(reflActivityAssessmentFormPage2
					.isOrientedSituation());
			cbOrientedTime.setSelected(reflActivityAssessmentFormPage2
					.isOrientedTime());
			cbOrientedPlace.setSelected(reflActivityAssessmentFormPage2
					.isOrientedPlace());
			cbOrientedPerson.setSelected(reflActivityAssessmentFormPage2
					.isOrientedPerson());

			SwingUtils.setSelectedButton(bgShortCategory,
					reflActivityAssessmentFormPage2.getShortCategory());
			SwingUtils.setSelectedButton(bgLiquids,
					reflActivityAssessmentFormPage2.getLiquids());
			SwingUtils.setSelectedButton(bgType,
					reflActivityAssessmentFormPage2.getType());
			SwingUtils.setSelectedButton(bgConsistency,
					reflActivityAssessmentFormPage2.getConsistency());
			cbCoorporative.setSelected(reflActivityAssessmentFormPage2
					.isCooperative());
			cbCheerful
					.setSelected(reflActivityAssessmentFormPage2.isCheerful());
			cbHumorous
					.setSelected(reflActivityAssessmentFormPage2.isHumorous());
			cbMotivated.setSelected(reflActivityAssessmentFormPage2
					.isMotivated());
			cbUncoorporative.setSelected(reflActivityAssessmentFormPage2
					.isUncooperative());
			cbWithDrawn.setSelected(reflActivityAssessmentFormPage2
					.isWithdrawn());
			cbTearful.setSelected(reflActivityAssessmentFormPage2.isTearful());
			cbRepeVerb.setSelected(reflActivityAssessmentFormPage2.isRepverb());
			cbDwells.setSelected(reflActivityAssessmentFormPage2.isDwells());
			cbAgitation.setSelected(reflActivityAssessmentFormPage2
					.isAgitation());
			cbAggression.setSelected(reflActivityAssessmentFormPage2
					.isAggression());
			cbUnresponsive.setSelected(reflActivityAssessmentFormPage2
					.isUnresponsive());
			dcNurseVisit.setDate(reflActivityAssessmentFormPage2
					.getNurseVisit());
			cmbNurse
					.setSelectedItem(reflActivityAssessmentFormPage2.getNurse());
			txtCommentsArea.setNotes(reflActivityAssessmentFormPage2
					.getCommentsArea());
			SwingUtils.setSelectedButton(bgCommCategory,
					reflActivityAssessmentFormPage2.getCommCategory());
			SwingUtils.setSelectedButton(bgConFusionYesNo,
					reflActivityAssessmentFormPage2.getConFusionYesNo());
			SwingUtils.setSelectedButton(bgYesNoGroup,
					reflActivityAssessmentFormPage2.getYesNoGroup());
			SwingUtils.setSelectedButton(bgRegularlyNaps,
					reflActivityAssessmentFormPage2.getRegularlyNaps());
			SwingUtils.setSelectedButton(bgPrefers,
					reflActivityAssessmentFormPage2.getPrefers());
			FormConfigValidation.updateComponents(this);
		} else {
			cbOrientedDis.setSelected(false);
			cbOrientedObject.setSelected(false);
			cbOrientedSituation.setSelected(false);
			cbOrientedTime.setSelected(false);
			cbOrientedPlace.setSelected(false);
			cbOrientedPerson.setSelected(false);

			txtCommentsArea.setNotes(notestxtCommentsArea);

		}
	}

	public boolean doValidate() {
		return FormConfigValidation.validate(this);
	}

}
