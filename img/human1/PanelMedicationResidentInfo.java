package medrex.client.MedicationAndTreatment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JLabel;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import com.sX.swing.JxButton;
import com.sX.swing.widgets.PanelFaceScale;

import medrex.client.PanelImage;
import medrex.client.MedicationAndTreatment.medicationScheduler.PanelMedication;
import medrex.client.MedicationAndTreatment.medicationScheduler.PanelMedicationScheduler;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.client.utils.Utils;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.admission.ResidentAssessmentFormPage16;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.physician.PhysicianForm;
import medrex.commons.vo.resident.ResidentAllergies;
import medrex.commons.vo.resident.ResidentDiagnosis;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;
import medrex.server.dao.ResidentDiagnosisDAO;
import medrex.server.dao.admission.ResidentAssessmentFormDAO;
import medrex.server.dao.physicianOrders.PhysicianFormDAO;
import medrex.server.dao.resident.ResidentAllergiesDAO;
import medrex.server.dao.resident.ResidentInformationDAO;
import medrex.server.service.physician.PhysicianFormService;
import medrex.server.service.resident.ResidentDiagnosisService;

public class PanelMedicationResidentInfo extends JPanel {
	private static final String ParseInt = null;
	private JLabel lblFluidRestrictions;
	private JLabel lblNectorPuddingHoney;
	private JLabel lblApplesaucePudding;
	private JLabel lblJuice;
	private JLabel lblWater;
	private JLabel lblRoom;
	private JLabel lblDob;
	private JLabel lblPatient;
	private JLabel lblAllergies;
	private JLabel lblDoctor;
	private JLabel lblDiet;
	private JLabel lblDiagnosis;
	private PanelImage panelImage;
	private JLabel lblNpo;
	private JLabel lblHearingAid;
	private JLabel lblEyeGlass;
	private JLabel lblHohI;
	private JLabel lblHohR;
	private JLabel lblDeaf;
	private JLabel lblBlind;
	private JLabel lblOtherContent;
	private JLabel lblOther;
	private PanelImage panel_15;
	private JLabel lblResidentName;

	private int height  = Toolkit.getDefaultToolkit().getScreenSize().height;
	private int width  = Toolkit.getDefaultToolkit().getScreenSize().width;
	public PanelMedicationResidentInfo(FrameMedicationDesktop frameMedicationDesktop) {
		super();
		setBackground(Color.WHITE);
		final BorderLayout borderLayout = new BorderLayout();
		borderLayout.setVgap(50);
		borderLayout.setHgap(20);
		setLayout(borderLayout);

		final JPanel panel = new JPanel();
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setVgap(20);
		flowLayout.setHgap(20);
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel.setLayout(flowLayout);
		panel.setOpaque(false);
		add(panel, BorderLayout.NORTH);
		panel.setPreferredSize(new Dimension(width,height/4));

		final JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(1000, 200));
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel.add(panel_1);

		final JLabel residentLikesToLabel = new JLabel();
		residentLikesToLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		residentLikesToLabel.setText("Resident likes to take Meds with");
		residentLikesToLabel.setForeground(ColorConstants.DEF_COLOR);
		residentLikesToLabel.setBounds(2, 0, 219, 14);
		panel_1.add(residentLikesToLabel);

		final JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(2, 15, 220, 20);
		panel_1.add(panel_3);

		final JLabel waterLabel = new JLabel();
		waterLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		waterLabel.setText("WATER");
		waterLabel.setForeground(ColorConstants.DEF_COLOR);
		waterLabel.setBounds(0, 0, 54, 16);
		panel_3.add(waterLabel);

		lblWater = new JLabel();
		lblWater.setFont(new Font("", Font.BOLD, 12));
		lblWater.setBackground(Color.WHITE);
		lblWater.setText("40Z");
		lblWater.setForeground(ColorConstants.MED_COLOR);
		lblWater.setBounds(93, 0, 100, 16);
		panel_3.add(lblWater);

		final JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(Color.WHITE);
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(307, 15, 220, 20);
		panel_1.add(panel_3_1);

		final JLabel waterLabel_1 = new JLabel();
		waterLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		waterLabel_1.setText("JUICE");
		waterLabel_1.setForeground(ColorConstants.DEF_COLOR);
		waterLabel_1.setBounds(0, 0, 54, 16);
		panel_3_1.add(waterLabel_1);

		lblJuice = new JLabel();
		lblJuice.setBackground(Color.WHITE);
		lblJuice.setText("80Z");
		lblJuice.setForeground(ColorConstants.MED_COLOR);
		lblJuice.setBounds(97, 0, 100, 16);
		panel_3_1.add(lblJuice);

		final JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(572, 15, 220, 20);
		panel_1.add(panel_4);

		lblApplesaucePudding = new JLabel();
		lblApplesaucePudding.setBackground(Color.WHITE);
		lblApplesaucePudding.setText("Pudding");
		lblApplesaucePudding.setForeground(ColorConstants.MED_COLOR);
		lblApplesaucePudding.setBounds(10, 0, 180, 16);
		panel_4.add(lblApplesaucePudding);

		final JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(Color.WHITE);
		panel_4_1.setLayout(null);
		panel_4_1.setBounds(612, 55, 176, 20);
		panel_1.add(panel_4_1);

		lblOther = new JLabel();
		lblOther.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOther.setBackground(Color.WHITE);
		lblOther.setForeground(ColorConstants.DEF_COLOR);
		lblOther.setText("OTHER");
		lblOther.setBounds(0, 0, 75, 20);
		panel_4_1.add(lblOther);

		lblOtherContent = new JLabel();
		lblOtherContent.setBounds(86, 1, 80, 19);
		lblOtherContent.setForeground(ColorConstants.MED_COLOR);
		panel_4_1.add(lblOtherContent);

		final JLabel precautionsLabel = new JLabel();
		precautionsLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		precautionsLabel.setText("Special Needs:");
		precautionsLabel.setForeground(ColorConstants.DEF_COLOR);
		precautionsLabel.setBounds(2, 37, 93, 16);
		panel_1.add(precautionsLabel);

		final JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBackground(Color.WHITE);
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBounds(2, 55, 273, 20);
		panel_1.add(panel_3_1_1);

		final JLabel waterLabel_1_1 = new JLabel();
		waterLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		waterLabel_1_1.setText("BLIND:");
		waterLabel_1_1.setForeground(ColorConstants.DEF_COLOR);
		waterLabel_1_1.setBounds(0, 0, 54, 16);
		panel_3_1_1.add(waterLabel_1_1);

		lblBlind = new JLabel();
		lblBlind.setBackground(Color.WHITE);
		lblBlind.setForeground(ColorConstants.MED_COLOR);
		lblBlind.setText("yes");
		lblBlind.setBounds(36, 1, 43, 19);
		panel_3_1_1.add(lblBlind);

		final JLabel deafLabel = new JLabel();
		deafLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		deafLabel.setText("DEAF");
		deafLabel.setForeground(ColorConstants.DEF_COLOR);
		deafLabel.setBounds(83, 1, 37, 16);
		panel_3_1_1.add(deafLabel);

		lblDeaf = new JLabel();
		lblDeaf.setBackground(Color.WHITE);
		lblDeaf.setForeground(ColorConstants.MED_COLOR);
		lblDeaf.setText("yes");
		lblDeaf.setBounds(114, 0, 37, 19);
		panel_3_1_1.add(lblDeaf);

		final JLabel hohLabel = new JLabel();
		hohLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		hohLabel.setText("HOH(R)");
		hohLabel.setForeground(ColorConstants.DEF_COLOR);
		hohLabel.setBounds(151, 1, 46, 16);
		panel_3_1_1.add(hohLabel);

		lblHohR = new JLabel();
		lblHohR.setBackground(Color.WHITE);
		lblHohR.setForeground(ColorConstants.MED_COLOR);
		lblHohR.setText("jhs");
		lblHohR.setBounds(196, 0, 24, 19);
		panel_3_1_1.add(lblHohR);

		final JLabel iLabel = new JLabel();
		iLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		iLabel.setText("(I)");
		iLabel.setForeground(ColorConstants.DEF_COLOR);
		iLabel.setBounds(222, 2, 22, 16);
		panel_3_1_1.add(iLabel);

		lblHohI = new JLabel();
		lblHohI.setBackground(Color.WHITE);
		lblHohI.setBounds(245, 0, 28, 19);
		lblHohI.setText("no");
		lblHohI.setForeground(ColorConstants.MED_COLOR);
		panel_3_1_1.add(lblHohI);

		final JPanel panel_3_1_1_1 = new JPanel();
		panel_3_1_1_1.setBackground(Color.WHITE);
		panel_3_1_1_1.setLayout(null);
		panel_3_1_1_1.setBounds(307, 55, 273, 20);
		panel_1.add(panel_3_1_1_1);

		final JLabel waterLabel_1_1_1 = new JLabel();
		waterLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		waterLabel_1_1_1.setText("EYE GLASSES");
		waterLabel_1_1_1.setForeground(ColorConstants.DEF_COLOR);
		waterLabel_1_1_1.setBounds(0, 0, 91, 16);
		panel_3_1_1_1.add(waterLabel_1_1_1);

		final JLabel hohLabel_1 = new JLabel();
		hohLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		hohLabel_1.setText("HEARING AID");
		hohLabel_1.setForeground(ColorConstants.DEF_COLOR);
		hohLabel_1.setBounds(151, 1, 85, 16);
		panel_3_1_1_1.add(hohLabel_1);

		lblEyeGlass = new JLabel();
		lblEyeGlass.setBackground(Color.WHITE);
		lblEyeGlass.setForeground(ColorConstants.MED_COLOR);
		lblEyeGlass.setText("jhdusg");
		lblEyeGlass.setBounds(98, 1, 43, 19);
		panel_3_1_1_1.add(lblEyeGlass);

		lblHearingAid = new JLabel();
		lblHearingAid.setBackground(Color.WHITE);
		lblHearingAid.setForeground(ColorConstants.MED_COLOR);
		lblHearingAid.setText("yes");
		lblHearingAid.setBounds(242, 0, 28, 20);
		panel_3_1_1_1.add(lblHearingAid);

		final JLabel precautionsLabel_1 = new JLabel();
		precautionsLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		precautionsLabel_1.setText("Swallowing Precutions:");
		precautionsLabel_1.setForeground(ColorConstants.DEF_COLOR);
		precautionsLabel_1.setBounds(2, 77, 184, 16);
		panel_1.add(precautionsLabel_1);

		final JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		panel_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_10.setLayout(null);
		panel_10.setBounds(2, 95, 76, 20);
		panel_1.add(panel_10);

		lblNpo = new JLabel();
		lblNpo.setBackground(Color.WHITE);
		lblNpo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNpo.setForeground(ColorConstants.DEF_COLOR);
		lblNpo.setText("NPO");
		lblNpo.setBounds(0, 0, 122, 20);
		panel_10.add(lblNpo);

		final JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.WHITE);
		panel_11.setLayout(null);
		panel_11.setBounds(101, 95, 748, 20);
		panel_1.add(panel_11);

		final JLabel thickenedLiquidsLabel = new JLabel();
		thickenedLiquidsLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		thickenedLiquidsLabel.setText("THICKENED LIQUIDS:");
		thickenedLiquidsLabel	.setForeground(ColorConstants.DEF_COLOR);
		thickenedLiquidsLabel.setBounds(4, 0, 127, 16);
		panel_11.add(thickenedLiquidsLabel);

		lblNectorPuddingHoney = new JLabel();
		lblNectorPuddingHoney.setBackground(Color.WHITE);
		lblNectorPuddingHoney.setText("Nector");
		lblNectorPuddingHoney.setForeground(ColorConstants.MED_COLOR);
		lblNectorPuddingHoney.setBounds(149, 0, 250, 16);
		panel_11.add(lblNectorPuddingHoney);

		final JLabel fliudRestrictionsLabel = new JLabel();
		fliudRestrictionsLabel.setText("Fliud Restrictions:");
		fliudRestrictionsLabel.setForeground(ColorConstants.DEF_COLOR);
		fliudRestrictionsLabel.setBounds(416, 0, 113, 16);
		panel_11.add(fliudRestrictionsLabel);

		lblFluidRestrictions = new JLabel();
		lblFluidRestrictions.setText("G Tube");
		lblFluidRestrictions.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFluidRestrictions.setForeground(ColorConstants.MED_COLOR);
		lblFluidRestrictions.setBounds(548, 0, 200, 16);
		panel_11.add(lblFluidRestrictions);

		final JPanel panel_11_1 = new JPanel();
		panel_11_1.setBackground(Color.WHITE);
		panel_11_1.setLayout(null);
		panel_11_1.setBounds(2, 121, 273, 20);
		panel_1.add(panel_11_1);

		final JLabel thickenedLiquidsLabel_1 = new JLabel();
		thickenedLiquidsLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		thickenedLiquidsLabel_1.setText("Diagnosis");
		thickenedLiquidsLabel_1.setForeground(ColorConstants.DEF_COLOR);
		thickenedLiquidsLabel_1.setBounds(4, 0, 60, 16);
		panel_11_1.add(thickenedLiquidsLabel_1);

		lblDiagnosis = new JLabel();
		lblDiagnosis.setBackground(Color.WHITE);
		lblDiagnosis.setForeground(ColorConstants.MED_COLOR);
		lblDiagnosis.setText("do");
		lblDiagnosis.setBounds(70, 0, 203, 19);
		panel_11_1.add(lblDiagnosis);

		final JPanel panel_11_1_1 = new JPanel();
		panel_11_1_1.setBackground(Color.WHITE);
		panel_11_1_1.setLayout(null);
		panel_11_1_1.setBounds(307, 121, 273, 20);
		panel_1.add(panel_11_1_1);

		final JLabel thickenedLiquidsLabel_1_1 = new JLabel();
		thickenedLiquidsLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		thickenedLiquidsLabel_1_1.setText("Doctor");
		thickenedLiquidsLabel_1_1.setForeground(ColorConstants.DEF_COLOR);
		thickenedLiquidsLabel_1_1.setBounds(4, 0, 60, 16);
		panel_11_1_1.add(thickenedLiquidsLabel_1_1);

		lblDoctor = new JLabel();
		lblDoctor.setBackground(Color.WHITE);
		lblDoctor.setBounds(70, 0, 203, 19);
		lblDoctor.setText("Dr.Lee");
		lblDoctor.setForeground(ColorConstants.MED_COLOR);
		panel_11_1_1.add(lblDoctor);

		final JPanel panel_11_1_1_1 = new JPanel();
		panel_11_1_1_1.setBackground(Color.WHITE);
		panel_11_1_1_1.setLayout(null);
		panel_11_1_1_1.setBounds(611, 121, 273, 20);
		panel_1.add(panel_11_1_1_1);

		final JLabel thickenedLiquidsLabel_1_1_1 = new JLabel();
		thickenedLiquidsLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		thickenedLiquidsLabel_1_1_1.setBackground(Color.WHITE);
		thickenedLiquidsLabel_1_1_1.setText("Patient");
		thickenedLiquidsLabel_1_1_1.setForeground(ColorConstants.DEF_COLOR);
		thickenedLiquidsLabel_1_1_1.setBounds(4, 0, 60, 16);
		panel_11_1_1_1.add(thickenedLiquidsLabel_1_1_1);

		lblPatient = new JLabel();
		lblPatient.setBackground(Color.WHITE);
		lblPatient.setForeground(ColorConstants.MED_COLOR);
		lblPatient.setText("Peter");
		lblPatient.setBounds(70, 0, 203, 19);
		panel_11_1_1_1.add(lblPatient);

		final JPanel panel_11_1_1_1_1 = new JPanel();
		panel_11_1_1_1_1.setBackground(Color.WHITE);
		panel_11_1_1_1_1.setLayout(null);
		panel_11_1_1_1_1.setBounds(2, 147, 273, 20);
		panel_1.add(panel_11_1_1_1_1);

		final JLabel thickenedLiquidsLabel_1_1_1_1 = new JLabel();
		thickenedLiquidsLabel_1_1_1_1
				.setFont(new Font("Tahoma", Font.BOLD, 12));
		thickenedLiquidsLabel_1_1_1_1.setBackground(Color.WHITE);
		thickenedLiquidsLabel_1_1_1_1.setText("Diet");
		thickenedLiquidsLabel_1_1_1_1	.setForeground(ColorConstants.DEF_COLOR);
		thickenedLiquidsLabel_1_1_1_1.setBounds(4, 0, 60, 16);
		panel_11_1_1_1_1.add(thickenedLiquidsLabel_1_1_1_1);

		lblDiet = new JLabel();
		lblDiet.setBackground(Color.WHITE);
		lblDiet.setForeground(ColorConstants.MED_COLOR);
		lblDiet.setText("parantha");
		lblDiet.setBounds(70, 0, 203, 19);
		panel_11_1_1_1_1.add(lblDiet);

		final JPanel panel_11_1_1_1_1_1 = new JPanel();
		panel_11_1_1_1_1_1.setBackground(Color.WHITE);
		panel_11_1_1_1_1_1.setLayout(null);
		panel_11_1_1_1_1_1.setBounds(307, 147, 273, 20);
		panel_1.add(panel_11_1_1_1_1_1);

		final JLabel thickenedLiquidsLabel_1_1_1_1_1 = new JLabel();
		thickenedLiquidsLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD,
				12));
		thickenedLiquidsLabel_1_1_1_1_1.setBackground(Color.WHITE);
		thickenedLiquidsLabel_1_1_1_1_1.setText("Allergies");
		thickenedLiquidsLabel_1_1_1_1_1.setForeground(ColorConstants.DEF_COLOR);
		thickenedLiquidsLabel_1_1_1_1_1.setBounds(4, 0, 60, 16);
		panel_11_1_1_1_1_1.add(thickenedLiquidsLabel_1_1_1_1_1);

		lblAllergies = new JLabel();
		lblAllergies.setBackground(Color.WHITE);
		lblAllergies.setBounds(70, 0, 203, 19);
		lblAllergies.setText("No");
		lblAllergies.setForeground(ColorConstants.MED_COLOR);
		panel_11_1_1_1_1_1.add(lblAllergies);

		final JPanel panel_11_1_1_1_1_1_1 = new JPanel();
		panel_11_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_11_1_1_1_1_1_1.setLayout(null);
		panel_11_1_1_1_1_1_1.setBounds(611, 147, 273, 20);
		panel_1.add(panel_11_1_1_1_1_1_1);

		final JLabel thickenedLiquidsLabel_1_1_1_1_1_1 = new JLabel();
		thickenedLiquidsLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD,
				12));
		thickenedLiquidsLabel_1_1_1_1_1_1.setBackground(Color.WHITE);
		thickenedLiquidsLabel_1_1_1_1_1_1.setText("DOB");
		thickenedLiquidsLabel_1_1_1_1_1_1.setForeground(ColorConstants.DEF_COLOR);
		thickenedLiquidsLabel_1_1_1_1_1_1.setBounds(4, 0, 60, 16);
		panel_11_1_1_1_1_1_1.add(thickenedLiquidsLabel_1_1_1_1_1_1);

		lblDob = new JLabel();
		lblDob.setBackground(Color.WHITE);
		lblDob.setBounds(70, 0, 203, 19);
		lblDob.setForeground(ColorConstants.MED_COLOR);
		panel_11_1_1_1_1_1_1.add(lblDob);

		final JPanel panel_2 = new JPanel();
		panel_2.setOpaque(true);
		panel_2.setPreferredSize(new Dimension(120,200));
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel.add(panel_2);

		panelImage = new PanelImage();
		panelImage.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		panelImage.setCurvedView(true);
		panelImage.setArc(0.4f);
		panelImage.setBounds(10, 10, 100, 120);
		panel_2.add(panelImage);

		final JPanel panel_11_1_1_1_1_1_1_1 = new JPanel();
		panel_11_1_1_1_1_1_1_1.setOpaque(false);
		panel_11_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_11_1_1_1_1_1_1_1.setLayout(null);
		panel_11_1_1_1_1_1_1_1.setBounds(10, 159, 110, 20);
		panel_2.add(panel_11_1_1_1_1_1_1_1);

		final JLabel thickenedLiquidsLabel_1_1_1_1_1_1_1 = new JLabel();
		thickenedLiquidsLabel_1_1_1_1_1_1_1.setText("Room");
		thickenedLiquidsLabel_1_1_1_1_1_1_1.setForeground(ColorConstants.DEF_COLOR);
		thickenedLiquidsLabel_1_1_1_1_1_1_1.setBounds(18, 1, 54, 16);
		panel_11_1_1_1_1_1_1_1.add(thickenedLiquidsLabel_1_1_1_1_1_1_1);

		lblRoom = new JLabel();
		lblRoom.setBounds(82, 0, 40, 19);
		lblRoom.setText("");

		panel_11_1_1_1_1_1_1_1.add(lblRoom);

		lblResidentName = new JLabel();
		lblResidentName.setBounds(10, 134, 100, 19);
		lblResidentName.setForeground(ColorConstants.MED_COLOR);
		lblResidentName.setText("ARROYO, FELIX");
		panel_2.add(lblResidentName);

		final JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new BorderLayout());
		add(centerPanel, BorderLayout.CENTER);

		final PanelMedicationScheduler panelMedicationScheduler = new PanelMedicationScheduler();
		centerPanel.add(panelMedicationScheduler,BorderLayout.CENTER);

		final JPanel panel_6 = new JPanel();
		final FlowLayout flowLayout_1 = new FlowLayout();
		flowLayout_1.setVgap(20);
		panel_6.setLayout(flowLayout_1);
		panel_6.setBackground(Color.WHITE);
		panel_6.setPreferredSize(new Dimension((int) (width/4.5), (int) (height/1.5)));
		centerPanel.add(panel_6, BorderLayout.EAST);

		final JxButton backButton = new JxButton();
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.frameMedicationDashboard.setCurrentIndex(2);
				Global.frameMedicationDashboard.reDrawTheFrame();
			}
		});
		backButton.setBackground(Color.WHITE);
		backButton.setArc(0.4f);
		backButton.setForeground(ColorConstants.DEF_COLOR);
		backButton.setPreferredSize(new Dimension(200, 50));
		backButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		backButton.setText("BACK TO MEDICATION");
		panel_6.add(backButton);
		
		final JxButton painAssessmentButton = new JxButton();
		painAssessmentButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				SwingUtils.openInDialogUnDecorated(new PanelFaceScale(), null);
			}
		});
		painAssessmentButton.setBackground(Color.WHITE);
		painAssessmentButton.setArc(0.4f);
		painAssessmentButton.setForeground(ColorConstants.DEF_COLOR);
		painAssessmentButton.setPreferredSize(new Dimension(200, 50));
		painAssessmentButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		painAssessmentButton.setText("PAIN ASSESSMENT");
		panel_6.add(painAssessmentButton);

		final JPanel medicationPanel = new JPanel();
		medicationPanel.setBorder(new LineBorder(Color.black, 1, false));
		medicationPanel.setBackground(Color.WHITE);
		medicationPanel.setLayout(null);
		medicationPanel.setPreferredSize(new Dimension(300, 300));
		panel_6.add(medicationPanel);
		
		PanelMedication[] panelMedication = new PanelMedication[5];
		for(int i = 0;i <5; i++){
			panelMedication[i] = new PanelMedication();
			panelMedication[i].setBounds(1, 25+(i *38), 289,38);
			medicationPanel.add(panelMedication[i]);
		}

		final JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setVgap(0);
		flowLayout_2.setHgap(0);
		panel_7.setLayout(flowLayout_2);
		panel_7.setBounds(16, 8, 25, 19);
		medicationPanel.add(panel_7);

		final JCheckBox checkBox = new JCheckBox();
		checkBox.setBackground(Color.WHITE);
		checkBox.setText("");
		panel_7.add(checkBox);

		final JPanel panel_8 = new JPanel();
		final FlowLayout flowLayout_3 = new FlowLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel_8.setLayout(flowLayout_3);
		panel_8.setOpaque(false);
		panel_8.setBounds(43, 5, 137, 19);
		medicationPanel.add(panel_8);

		final JLabel medicationLabel = new JLabel();
		medicationLabel.setForeground(ColorConstants.DEF_COLOR);
		medicationLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		medicationLabel.setText("Medication");
		panel_8.add(medicationLabel);

		final JPanel panel_9 = new JPanel();
		final FlowLayout flowLayout_4 = new FlowLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		panel_9.setLayout(flowLayout_4);
		panel_9.setOpaque(false);
		panel_9.setBounds(180, 5, 45, 19);
		medicationPanel.add(panel_9);

		final JLabel doseLabel = new JLabel();
		doseLabel.setForeground(ColorConstants.DEF_COLOR);
		doseLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		doseLabel.setText("Dose");
		doseLabel.setForeground(ColorConstants.DEF_COLOR);
		panel_9.add(doseLabel);

		final JPanel panel_12 = new JPanel();
		panel_12.setOpaque(false);
		panel_12.setBounds(225, 5, 75, 19);
		medicationPanel.add(panel_12);

		final JLabel frequencyLabel = new JLabel();
		frequencyLabel.setForeground(ColorConstants.DEF_COLOR);
		frequencyLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		frequencyLabel.setText("Frequency");
		frequencyLabel.setForeground(ColorConstants.DEF_COLOR);
		panel_12.add(frequencyLabel);

		final JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setOpaque(true);
		panel_5.setPreferredSize(new Dimension(width/10, 0));
		centerPanel.add(panel_5, BorderLayout.WEST);
		doLoad();
	}

	public void doLoad() {
		int resId = 199;
		System.out.println("Resident Id " + resId);
		ResidentMain rm = null;
		List<ResidentAllergies> allergyList = null;
		List<ResidentDiagnosis> diagnosis = null;
		List<PhysicianForm> phyform = null;
		String tempDiagnosis = "";
		String tempAllergies = "";
		String tempPhysicianForm = "";

		try {
			rm = ResidentInformationDAO.getInstance().getResident(resId);

			allergyList = ResidentAllergiesDAO.getInstance()
					.getResidentAllergiesforResident(resId);

			Iterator<ResidentAllergies> itr = allergyList.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
				ResidentAllergies alli = itr.next();
				tempAllergies += alli.getName();
			}
			diagnosis = ResidentDiagnosisDAO.getInstance()
					.getResidentDiagnosiss(resId);
			Iterator<ResidentDiagnosis> it = diagnosis.iterator();
			while (it.hasNext()) {
				ResidentDiagnosis dia = it.next();
				tempDiagnosis += dia.getName();
			}
			phyform = PhysicianFormDAO.getInstance().getPhysicianForms(resId);
			Iterator<PhysicianForm> phy = phyform.iterator();
			while (phy.hasNext()) {
				PhysicianForm phydata = phy.next();
				if (phydata.getPhyName() != null) {
					tempPhysicianForm += phydata.getPhyName();
				}

			}

			lblDiagnosis.setText(tempDiagnosis);
			lblAllergies.setText(tempAllergies);
			lblDoctor.setText(tempPhysicianForm);
			lblResidentName.setText(rm.getUserPass() + " " + rm.getUserName());
			lblDob.setText(rm.getDob() + "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		ResidentAssessmentFormPage16 rafp16 = null;
		try {
			rafp16 = ResidentAssessmentFormDAO.getInstance()
					.getResidentAssessmentFormPage16(3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Global.currentResidentAssessmentFormPage16Key = rafp16.getSerial();
//		SwingUtils.setSelectedButton(btnWater, rafp16.getWater());
//		SwingUtils.setSelectedButton(btnJuice, rafp16.getJuice());
		System.out.println("rafp16.getWater()"+rafp16.getWater());
		if(rafp16.getWater() == 1){
			lblWater.setText("Yes");
		}
		else if(rafp16.getWater() == 2){
			lblWater.setText("No");
		}
		else if(rafp16.getWater() == 3){
			lblWater.setText("40Z");
		}
		else if(rafp16.getWater() == 4){
			lblWater.setText("80Z");
		}

		System.out.println("rafp16.getJuice()"+ rafp16.getJuice());
		if(rafp16.getJuice() == 1){
			lblJuice.setText("yes");
		}
		else if(rafp16.getJuice() == 2){
			lblJuice.setText("No");
		}
		else if(rafp16.getJuice() == 3){
			lblJuice.setText("40Z");
		}
		else if(rafp16.getJuice() == 4){
			lblJuice.setText("80Z");
		}
		
		lblBlind.setText(rafp16.getBlind());
		lblDeaf.setText(rafp16.getDeaf());
		lblHearingAid.setText(rafp16.getHearingAid());


		if (rafp16.isCrushMeds() == true) {
		} else {
			lblFluidRestrictions.setText("Crush Meds");
		}
		if (rafp16.isGTube() == true) {
		} else {
			lblFluidRestrictions.setText(lblFluidRestrictions.getText()+"G Tube");
		}
		if (rafp16.isNectar() == true) {
		} else {
			lblNectorPuddingHoney.setText("Nector, ");
		}
		if (rafp16.isPudding() == true) {
		} else {
			lblNectorPuddingHoney.setText(lblNectorPuddingHoney.getText()+ "Pudding, ");
		}
		if (rafp16.isHoney() == true) {
		} else {
			lblNectorPuddingHoney.setText(lblNectorPuddingHoney.getText()+ "Honey");
		}
		if (rafp16.isNpo() == true) {
			lblNpo.setEnabled(true);
		} else {
			lblNpo.setEnabled(false);
		}
		if (rafp16.isFluidRestriction()) {
			lblFluidRestrictions.setEnabled(true);
		} else {
			lblFluidRestrictions.setEnabled(false);
		}
		lblHearingAid.setText(rafp16.getHearingAid());
		lblHohI.setText(rafp16.getHohI());
		lblHohR.setText(rafp16.getHohR());
		lblDeaf.setText(rafp16.getDeaf());
		lblBlind.setText(rafp16.getBlind());
		lblOtherContent.setText(rafp16.getOtherContent());
		if (rafp16.isOther() == true) {
			lblOther.setEnabled(true);
		} else {
			lblOther.setEnabled(false);
		}
		if (rafp16.isPudding() == true) {
		} else {
			lblApplesaucePudding.setText("Pudding, ");
		}
		if (rafp16.isApplesauce() == true) {
		} else {
			lblApplesaucePudding.setText(lblApplesaucePudding.getText()+ "AppleSauce");
		}
		
	}

}
