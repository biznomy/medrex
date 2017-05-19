package medrex.client.MedicationAndTreatment.RoutineTreatment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import medrex.client.PanelImage;
import medrex.client.MedicationAndTreatment.FrameMedicationDesktop;
import medrex.client.MedicationAndTreatment.RoutineMedication.MedicationScheduler.PanelMedication;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.admission.ResidentAssessmentFormPage16;
import medrex.commons.vo.physician.PhysicianForm;
import medrex.commons.vo.resident.ResidentAllergies;
import medrex.commons.vo.resident.ResidentDiagnosis;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;
import medrex.commons.vo.treatmentCart.TreatmentView;

import com.sX.awt.Direction;
import com.sX.swing.JxPanel;

public class PanelTreatmentResidentInfo extends JxPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5360949445269148663L;
	private static final String ParseInt = null;
	private JLabel lblFluidRestrictions;
	private JLabel lblNectorPuddingHoney;
	private JLabel lblApplesaucePudding;
	private JLabel lblJuice;
	private JLabel lblWater;
	private JLabel lblRoom;
	private JLabel lblDob;
	private JTextArea txtAllergies;
	private JLabel lblDoctor;
	private JLabel lblDiet;
	private JTextArea txtDiagnosis;
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
	ResidentMain rm = null;
	List<ResidentAllergies> allergyList = null;
	List<ResidentDiagnosis> diagnosis = null;
	List<PhysicianForm> phyform = null;
	String tempDiagnosis = "";
	String tempAllergies = "";
	String tempPhysicianForm = "";

	private int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	private int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	private JLabel thickenedLiquidsLabel_1_1_1_1_1_1_1;
	private static final Border BORDER = new LineBorder(
			new Color(122, 154, 167), 2, false);
	private static final Color BACKGROUND = new Color(206, 221, 224, 250);
	private static final Color FOREGROUND = new Color(0, 69, 97);
	private static final Font FONT = new Font("Dialog", Font.BOLD, 13)
			.deriveFont(13.5f);

	public PanelTreatmentResidentInfo(
			FrameMedicationDesktop frameTreatmentDesktop) {
		super();
		setArc(0f);
		setOpaque(false);
		setArc(0);
		setBounds(0, 0, 1000, 700);
		setLinearGradient(ColorConstants.GradientBright, new Color(148, 178,
				188), Direction.TOP_TO_BOTTOM);
		setBackground(Color.WHITE);
		setSize(width, height);
		final BorderLayout borderLayout = new BorderLayout();
		borderLayout.setVgap(20);
		setLayout(borderLayout);

		final JPanel panel = new JPanel();
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		panel.setLayout(flowLayout);
		panel.setOpaque(false);
		add(panel, BorderLayout.NORTH);
		panel.setPreferredSize(new Dimension((int) (width / 1.2),
				(int) (height / 3.5)));

		final JLabel residentInformationLabel = new JLabel();
		residentInformationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		residentInformationLabel.setPreferredSize(new Dimension(400, 30));
		residentInformationLabel.setFont(new Font("Arial", Font.BOLD, 20));
		residentInformationLabel.setText("Resident Information");
		residentInformationLabel.setForeground(ColorConstants.MED_COLOR);
		panel.add(residentInformationLabel);

		final JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setPreferredSize(new Dimension((int) (width / 1.3),
				(int) (height / 3.1)));
		// panel_1.setPreferredSize(new Dimension(1000,200));
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel.add(panel_1);

		final JLabel residentLikesToLabel = new JLabel();
		residentLikesToLabel.setBackground(Color.WHITE);
		residentLikesToLabel.setOpaque(false);
		residentLikesToLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		residentLikesToLabel.setText("Resident likes to take Meds with");
		residentLikesToLabel.setForeground(ColorConstants.DEF_COLOR);
		residentLikesToLabel.setBounds(30, 5, 219, 20);
		panel_1.add(residentLikesToLabel);

		final JPanel panel_3 = new JPanel();
		panel_3.setOpaque(false);
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(262, 5, 275, 20);
		panel_1.add(panel_3);

		final JLabel waterLabel = new JLabel();
		waterLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		waterLabel.setText("WATER");
		waterLabel.setForeground(ColorConstants.DEF_COLOR);
		waterLabel.setBounds(10, 0, 54, 16);
		panel_3.add(waterLabel);

		lblWater = new JLabel();
		lblWater.setForeground(ColorConstants.MED_COLOR);
		lblWater.setFont(new Font("", Font.PLAIN, 12));
		lblWater.setBackground(Color.WHITE);
		lblWater.setText("");
		lblWater.setForeground(ColorConstants.MED_COLOR);
		lblWater.setBounds(84, 2, 181, 16);
		panel_3.add(lblWater);

		final JPanel panel_3_1 = new JPanel();
		panel_3_1.setOpaque(false);
		panel_3_1.setBackground(Color.WHITE);
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(557, 5, 260, 20);
		panel_1.add(panel_3_1);

		final JLabel waterLabel_1 = new JLabel();
		waterLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		waterLabel_1.setText("JUICE");
		waterLabel_1.setForeground(ColorConstants.DEF_COLOR);
		waterLabel_1.setBounds(10, 0, 54, 16);
		panel_3_1.add(waterLabel_1);

		lblJuice = new JLabel();
		lblJuice.setForeground(ColorConstants.MED_COLOR);
		lblJuice.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblJuice.setBackground(Color.WHITE);
		lblJuice.setText("");
		lblJuice.setBounds(130, 0, 114, 16);
		panel_3_1.add(lblJuice);

		final JPanel panel_4 = new JPanel();
		panel_4.setOpaque(false);
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(849, 5, 128, 20);
		panel_1.add(panel_4);

		lblApplesaucePudding = new JLabel();
		lblApplesaucePudding.setBackground(Color.WHITE);
		lblApplesaucePudding.setText("");
		lblApplesaucePudding.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblApplesaucePudding.setForeground(ColorConstants.DEF_COLOR);
		lblApplesaucePudding.setBounds(10, 2, 108, 16);
		panel_4.add(lblApplesaucePudding);

		final JPanel panel_4_1 = new JPanel();
		panel_4_1.setOpaque(false);
		panel_4_1.setBackground(Color.WHITE);
		panel_4_1.setLayout(null);
		panel_4_1.setBounds(849, 31, 128, 20);
		panel_1.add(panel_4_1);

		lblOther = new JLabel();
		lblOther.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOther.setBackground(Color.WHITE);
		lblOther.setForeground(ColorConstants.DEF_COLOR);
		lblOther.setText("OTHER");
		lblOther.setBounds(10, 0, 49, 20);
		panel_4_1.add(lblOther);

		lblOtherContent = new JLabel();
		lblOtherContent.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblOtherContent.setBounds(63, 1, 65, 19);
		panel_4_1.add(lblOtherContent);

		final JLabel precautionsLabel = new JLabel();
		precautionsLabel.setOpaque(false);
		precautionsLabel.setBackground(Color.WHITE);
		precautionsLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		precautionsLabel.setText("Special Needs:");
		precautionsLabel.setForeground(ColorConstants.DEF_COLOR);
		precautionsLabel.setBounds(30, 31, 219, 20);
		panel_1.add(precautionsLabel);

		final JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setOpaque(false);
		panel_3_1_1.setBackground(Color.WHITE);
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBounds(262, 31, 275, 20);
		panel_1.add(panel_3_1_1);

		final JLabel waterLabel_1_1 = new JLabel();
		waterLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		waterLabel_1_1.setText("BLIND:");
		waterLabel_1_1.setForeground(ColorConstants.DEF_COLOR);
		waterLabel_1_1.setBounds(10, 0, 37, 16);
		panel_3_1_1.add(waterLabel_1_1);

		lblBlind = new JLabel();
		lblBlind.setForeground(ColorConstants.MED_COLOR);
		lblBlind.setFont(new Font("", Font.PLAIN, 12));
		lblBlind.setBackground(Color.WHITE);
		lblBlind.setText("");
		lblBlind.setBounds(53, 1, 26, 19);
		panel_3_1_1.add(lblBlind);

		final JLabel deafLabel = new JLabel();
		deafLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		deafLabel.setText("DEAF");
		deafLabel.setForeground(ColorConstants.DEF_COLOR);
		deafLabel.setBounds(83, 1, 37, 16);
		panel_3_1_1.add(deafLabel);

		lblDeaf = new JLabel();
		lblDeaf.setForeground(ColorConstants.MED_COLOR);
		lblDeaf.setFont(new Font("", Font.PLAIN, 12));
		lblDeaf.setBackground(Color.WHITE);
		lblDeaf.setText("");
		lblDeaf.setBounds(114, 0, 37, 19);
		panel_3_1_1.add(lblDeaf);

		final JLabel hohLabel = new JLabel();
		hohLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		hohLabel.setText("HOH(R)");
		hohLabel.setForeground(ColorConstants.DEF_COLOR);
		hohLabel.setBounds(151, 1, 46, 16);
		panel_3_1_1.add(hohLabel);

		lblHohR = new JLabel();
		lblHohR.setFont(new Font("", Font.PLAIN, 12));
		lblHohR.setForeground(ColorConstants.MED_COLOR);
		lblHohR.setBackground(Color.WHITE);
		lblHohR.setText("");
		lblHohR.setBounds(196, 0, 24, 19);
		panel_3_1_1.add(lblHohR);

		final JLabel iLabel = new JLabel();
		iLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		iLabel.setText("(I)");
		iLabel.setForeground(ColorConstants.DEF_COLOR);
		iLabel.setBounds(222, 2, 22, 16);
		panel_3_1_1.add(iLabel);

		lblHohI = new JLabel();
		lblHohI.setFont(new Font("", Font.PLAIN, 12));
		lblHohI.setForeground(ColorConstants.MED_COLOR);
		lblHohI.setBackground(Color.WHITE);
		lblHohI.setBounds(245, 0, 28, 19);
		lblHohI.setText("");
		panel_3_1_1.add(lblHohI);

		final JPanel panel_3_1_1_1 = new JPanel();
		panel_3_1_1_1.setOpaque(false);
		panel_3_1_1_1.setBackground(Color.WHITE);
		panel_3_1_1_1.setLayout(null);
		panel_3_1_1_1.setBounds(557, 31, 260, 20);
		panel_1.add(panel_3_1_1_1);

		final JLabel waterLabel_1_1_1 = new JLabel();
		waterLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		waterLabel_1_1_1.setText("EYE GLASSES");
		waterLabel_1_1_1.setForeground(ColorConstants.DEF_COLOR);
		waterLabel_1_1_1.setBounds(10, 0, 91, 16);
		panel_3_1_1_1.add(waterLabel_1_1_1);

		final JLabel hohLabel_1 = new JLabel();
		hohLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		hohLabel_1.setText("HEARING AID");
		hohLabel_1.setForeground(ColorConstants.DEF_COLOR);
		hohLabel_1.setBounds(129, 0, 85, 16);
		panel_3_1_1_1.add(hohLabel_1);

		lblEyeGlass = new JLabel();
		lblEyeGlass.setForeground(ColorConstants.MED_COLOR);
		lblEyeGlass.setFont(new Font("", Font.PLAIN, 12));
		lblEyeGlass.setBackground(Color.WHITE);
		lblEyeGlass.setText("");
		lblEyeGlass.setBounds(102, 1, 21, 19);
		panel_3_1_1_1.add(lblEyeGlass);

		lblHearingAid = new JLabel();
		lblHearingAid.setHorizontalAlignment(SwingConstants.CENTER);
		lblHearingAid.setBackground(Color.WHITE);
		lblHearingAid.setForeground(ColorConstants.MED_COLOR);
		lblHearingAid.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblHearingAid.setText("");
		lblHearingAid.setBounds(220, 0, 36, 18);
		panel_3_1_1_1.add(lblHearingAid);

		final JLabel precautionsLabel_1 = new JLabel();
		precautionsLabel_1.setBackground(Color.WHITE);
		precautionsLabel_1.setOpaque(false);
		precautionsLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		precautionsLabel_1.setText("Swallowing Precutions:");
		precautionsLabel_1.setForeground(ColorConstants.DEF_COLOR);
		precautionsLabel_1.setBounds(30, 57, 219, 20);
		panel_1.add(precautionsLabel_1);

		final JPanel panel_10 = new JPanel();
		panel_10.setOpaque(false);
		panel_10.setBackground(Color.WHITE);
		panel_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_10.setLayout(null);
		panel_10.setBounds(849, 57, 128, 20);
		panel_1.add(panel_10);

		lblNpo = new JLabel();
		lblNpo.setBackground(Color.WHITE);
		lblNpo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNpo.setForeground(ColorConstants.DEF_COLOR);
		lblNpo.setText("NPO");
		lblNpo.setBounds(10, 0, 51, 20);
		panel_10.add(lblNpo);

		final JPanel panel_11 = new JPanel();
		panel_11.setOpaque(false);
		panel_11.setBackground(Color.WHITE);
		panel_11.setLayout(null);
		panel_11.setBounds(262, 57, 275, 20);
		panel_1.add(panel_11);

		final JLabel thickenedLiquidsLabel = new JLabel();
		thickenedLiquidsLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		thickenedLiquidsLabel.setText("THICKENED LIQUIDS:");
		thickenedLiquidsLabel.setForeground(ColorConstants.DEF_COLOR);
		thickenedLiquidsLabel.setBounds(10, 0, 127, 16);
		panel_11.add(thickenedLiquidsLabel);

		lblNectorPuddingHoney = new JLabel();
		lblNectorPuddingHoney.setForeground(ColorConstants.MED_COLOR);
		lblNectorPuddingHoney.setFont(new Font("", Font.PLAIN, 12));
		lblNectorPuddingHoney.setBackground(Color.WHITE);
		lblNectorPuddingHoney.setText("");
		lblNectorPuddingHoney.setBounds(149, 2, 126, 16);
		panel_11.add(lblNectorPuddingHoney);

		final JPanel panel_11_1 = new JPanel();
		panel_11_1.setOpaque(false);
		panel_11_1.setBackground(Color.WHITE);
		panel_11_1.setLayout(null);
		panel_11_1.setBounds(30, 109, 507, 81);
		panel_1.add(panel_11_1);

		final JLabel thickenedLiquidsLabel_1 = new JLabel();
		thickenedLiquidsLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		thickenedLiquidsLabel_1.setText("Diagnosis");
		thickenedLiquidsLabel_1.setForeground(ColorConstants.DEF_COLOR);
		thickenedLiquidsLabel_1.setBounds(4, 0, 60, 16);
		panel_11_1.add(thickenedLiquidsLabel_1);

		txtDiagnosis = new JTextArea();
		txtDiagnosis.setOpaque(true);
		txtDiagnosis.setFont(new Font("", Font.PLAIN, 12));
		txtDiagnosis.setBackground(Color.WHITE);
		txtDiagnosis.setLineWrap(true);
		txtDiagnosis.setEditable(false);
		txtDiagnosis.setForeground(ColorConstants.MED_COLOR);
		txtDiagnosis.setText("");

		JScrollPane scrollDiagnosis = new JScrollPane();
		scrollDiagnosis.setOpaque(false);
		scrollDiagnosis.setBackground(Color.WHITE);
		scrollDiagnosis.setBounds(78, 10, 419, 63);
		scrollDiagnosis.setViewportView(txtDiagnosis);
		panel_11_1.add(scrollDiagnosis);

		final JPanel panel_11_1_1 = new JPanel();
		panel_11_1_1.setOpaque(false);
		panel_11_1_1.setBackground(Color.WHITE);
		panel_11_1_1.setLayout(null);
		panel_11_1_1.setBounds(262, 83, 275, 20);
		panel_1.add(panel_11_1_1);

		final JLabel thickenedLiquidsLabel_1_1 = new JLabel();
		thickenedLiquidsLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		thickenedLiquidsLabel_1_1.setText("Physician");
		thickenedLiquidsLabel_1_1.setForeground(ColorConstants.DEF_COLOR);
		thickenedLiquidsLabel_1_1.setBounds(10, 0, 60, 16);
		panel_11_1_1.add(thickenedLiquidsLabel_1_1);

		lblDoctor = new JLabel();
		lblDoctor.setFont(new Font("", Font.PLAIN, 12));
		lblDoctor.setBackground(Color.WHITE);
		lblDoctor.setForeground(ColorConstants.MED_COLOR);
		lblDoctor.setBounds(70, 0, 155, 19);
		lblDoctor.setText("");
		panel_11_1_1.add(lblDoctor);

		final JPanel panel_11_1_1_1_1 = new JPanel();
		panel_11_1_1_1_1.setOpaque(false);
		panel_11_1_1_1_1.setBackground(Color.WHITE);
		panel_11_1_1_1_1.setLayout(null);
		panel_11_1_1_1_1.setBounds(557, 83, 260, 20);
		panel_1.add(panel_11_1_1_1_1);

		final JLabel thickenedLiquidsLabel_1_1_1_1 = new JLabel();
		thickenedLiquidsLabel_1_1_1_1
				.setFont(new Font("Tahoma", Font.BOLD, 12));
		thickenedLiquidsLabel_1_1_1_1.setBackground(Color.WHITE);
		thickenedLiquidsLabel_1_1_1_1.setText("Diet");
		thickenedLiquidsLabel_1_1_1_1.setForeground(ColorConstants.DEF_COLOR);
		thickenedLiquidsLabel_1_1_1_1.setBounds(10, 0, 60, 16);
		panel_11_1_1_1_1.add(thickenedLiquidsLabel_1_1_1_1);

		lblDiet = new JLabel();
		lblDiet.setFont(new Font("", Font.PLAIN, 12));
		lblDiet.setBackground(Color.WHITE);
		lblDiet.setForeground(ColorConstants.MED_COLOR);
		lblDiet.setText("");
		lblDiet.setBounds(70, 0, 58, 19);
		panel_11_1_1_1_1.add(lblDiet);

		final JPanel panel_11_1_1_1_1_1 = new JPanel();
		panel_11_1_1_1_1_1.setOpaque(false);
		panel_11_1_1_1_1_1.setBackground(Color.WHITE);
		panel_11_1_1_1_1_1.setLayout(null);
		panel_11_1_1_1_1_1.setBounds(557, 109, 420, 81);
		panel_1.add(panel_11_1_1_1_1_1);

		final JLabel thickenedLiquidsLabel_1_1_1_1_1 = new JLabel();
		thickenedLiquidsLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD,
				12));
		thickenedLiquidsLabel_1_1_1_1_1.setBackground(Color.WHITE);
		thickenedLiquidsLabel_1_1_1_1_1.setText("Allergies");
		thickenedLiquidsLabel_1_1_1_1_1.setForeground(ColorConstants.DEF_COLOR);
		thickenedLiquidsLabel_1_1_1_1_1.setBounds(10, 0, 60, 16);
		panel_11_1_1_1_1_1.add(thickenedLiquidsLabel_1_1_1_1_1);

		txtAllergies = new JTextArea();
		txtAllergies.setOpaque(true);
		txtAllergies.setFont(new Font("", Font.PLAIN, 12));
		txtAllergies.setBackground(Color.WHITE);
		txtAllergies.setLineWrap(true);
		txtAllergies.setEditable(false);
		txtAllergies.setForeground(ColorConstants.MED_COLOR);
		txtAllergies.setText("");

		JScrollPane scrollallergies = new JScrollPane();
		scrollallergies.setBackground(Color.WHITE);
		scrollallergies.setBounds(76, 10, 334, 61);
		scrollallergies.setViewportView(txtAllergies);
		panel_11_1_1_1_1_1.add(scrollallergies);

		final JPanel panel_5 = new JPanel();
		panel_5.setOpaque(false);
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(557, 57, 260, 20);
		panel_1.add(panel_5);

		final JLabel fliudRestrictionsLabel = new JLabel();
		fliudRestrictionsLabel.setBounds(10, 0, 113, 16);
		panel_5.add(fliudRestrictionsLabel);
		fliudRestrictionsLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		fliudRestrictionsLabel.setText("Fluid Restrictions:");
		fliudRestrictionsLabel.setForeground(ColorConstants.DEF_COLOR);

		lblFluidRestrictions = new JLabel();
		lblFluidRestrictions.setBounds(129, 2, 130, 16);
		panel_5.add(lblFluidRestrictions);
		lblFluidRestrictions.setText("");
		lblFluidRestrictions.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblFluidRestrictions.setForeground(ColorConstants.MED_COLOR);

		final JPanel panel_11_1_1_1_1_1_1 = new JPanel();
		panel_11_1_1_1_1_1_1.setOpaque(false);
		panel_11_1_1_1_1_1_1.setBounds(30, 83, 219, 20);
		panel_1.add(panel_11_1_1_1_1_1_1);
		panel_11_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_11_1_1_1_1_1_1.setLayout(null);

		final JLabel thickenedLiquidsLabel_1_1_1_1_1_1 = new JLabel();
		thickenedLiquidsLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD,
				12));
		thickenedLiquidsLabel_1_1_1_1_1_1.setBackground(Color.WHITE);
		thickenedLiquidsLabel_1_1_1_1_1_1.setText("DOB");
		thickenedLiquidsLabel_1_1_1_1_1_1
				.setForeground(ColorConstants.DEF_COLOR);
		thickenedLiquidsLabel_1_1_1_1_1_1.setBounds(4, 0, 60, 16);
		panel_11_1_1_1_1_1_1.add(thickenedLiquidsLabel_1_1_1_1_1_1);

		lblDob = new JLabel();
		lblDob.setForeground(ColorConstants.MED_COLOR);
		lblDob.setFont(new Font("", Font.PLAIN, 12));
		lblDob.setBackground(Color.WHITE);
		lblDob.setBounds(70, 0, 149, 19);
		panel_11_1_1_1_1_1_1.add(lblDob);

		final JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setPreferredSize(new Dimension(150, 220));
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel.add(panel_2);

		panelImage = new PanelImage();
		panelImage
				.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		panelImage.setCurvedView(true);
		panelImage.setArc(0.4f);
		panelImage.setBounds(10, 10, 110, 118);
		panel_2.add(panelImage);

		final JPanel panel_11_1_1_1_1_1_1_1 = new JPanel();
		panel_11_1_1_1_1_1_1_1.setOpaque(false);
		panel_11_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_11_1_1_1_1_1_1_1.setLayout(null);
		panel_11_1_1_1_1_1_1_1.setBounds(10, 150, 110, 19);
		panel_2.add(panel_11_1_1_1_1_1_1_1);

		thickenedLiquidsLabel_1_1_1_1_1_1_1 = new JLabel();
		thickenedLiquidsLabel_1_1_1_1_1_1_1.setFont(new Font("Dialog",
				Font.BOLD, 12));
		thickenedLiquidsLabel_1_1_1_1_1_1_1
				.setForeground(ColorConstants.MED_COLOR);
		thickenedLiquidsLabel_1_1_1_1_1_1_1.setText("Room");
		thickenedLiquidsLabel_1_1_1_1_1_1_1.setBounds(10, 0, 54, 16);
		panel_11_1_1_1_1_1_1_1.add(thickenedLiquidsLabel_1_1_1_1_1_1_1);

		lblRoom = new JLabel();
		lblRoom.setForeground(ColorConstants.MED_COLOR);
		lblRoom.setFont(new Font("Dialog", Font.BOLD, 12));
		lblRoom.setBounds(60, 0, 50, 19);
		lblRoom.setText("");

		panel_11_1_1_1_1_1_1_1.add(lblRoom);

		lblResidentName = new JLabel();
		lblResidentName.setFont(new Font("Dialog", Font.BOLD, 12));
		lblResidentName.setForeground(ColorConstants.DEF_COLOR);
		lblResidentName.setBounds(10, 134, 110, 16);
		lblResidentName.setText("");
		panel_2.add(lblResidentName);

		doLoad();
		showMedicationPanel();
	}

	public void doLoad() {
		int resId = Global.currentResidenceKey;
		try {

			rm = MedrexClientManager.getInstance().getResident(resId);
			allergyList = MedrexClientManager.getInstance()
					.getResidentAllergiesforResident(resId);

			Iterator<ResidentAllergies> itr = allergyList.iterator();
			while (itr.hasNext()) {

				ResidentAllergies alli = itr.next();
				tempAllergies += alli.getName();
			}

			if (!"".equalsIgnoreCase(tempAllergies)) {
				txtAllergies.setText(tempAllergies);
			}

			diagnosis = MedrexClientManager.getInstance()
					.getResidentDiagnosiss(resId);
			Iterator<ResidentDiagnosis> it = diagnosis.iterator();
			while (it.hasNext()) {
				ResidentDiagnosis dia = it.next();
				tempDiagnosis += dia.getName();
			}

			if (!"".equalsIgnoreCase(tempDiagnosis)) {
				txtDiagnosis.setText(tempDiagnosis);
			}
			phyform = MedrexClientManager.getInstance()
					.getPhysicianForms(resId);
			Iterator<PhysicianForm> phy = phyform.iterator();
			while (phy.hasNext()) {
				PhysicianForm phydata = phy.next();
				if (phydata.getPhyName() != null) {
					tempPhysicianForm += phydata.getPhyName();
				}

			}
			if (!"".equalsIgnoreCase(tempPhysicianForm)) {
				lblDoctor.setText(tempPhysicianForm);
			}
			lblResidentName.setText(rm.getUserPass() + " " + rm.getUserName());
			TempRoomHistory list = MedrexClientManager.getInstance()
					.getLastRoomHistory(resId);
			thickenedLiquidsLabel_1_1_1_1_1_1_1.setText(list.getRoom());

			lblDob.setText(new SimpleDateFormat("MM/dd/yyyy").format(rm
					.getDob())
					+ "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		ResidentAssessmentFormPage16 rafp16 = null;
		try {

			rafp16 = MedrexClientManager.getInstance()
					.getResidentAssessmentFormPage16ByResidentId(
							Global.currentResidenceKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (rafp16 != null) {
			Global.currentResidentAssessmentFormPage16Key = rafp16.getSerial();

			if (rafp16.getWater() == 1) {
				lblWater.setText("Yes");
			} else if (rafp16.getWater() == 2) {
				lblWater.setText("No");
			} else if (rafp16.getWater() == 3) {
				lblWater.setText("40Z");
			} else if (rafp16.getWater() == 4) {
				lblWater.setText("80Z");
			}

			System.out.println("rafp16.getJuice()" + rafp16.getJuice());
			if (rafp16.getJuice() == 1) {
				lblJuice.setText("yes");
				lblJuice.setForeground(ColorConstants.MED_COLOR);
			} else if (rafp16.getJuice() == 2) {
				lblJuice.setText("No");
				lblJuice.setForeground(ColorConstants.MED_COLOR);
			} else if (rafp16.getJuice() == 3) {
				lblJuice.setText("40Z");
				lblJuice.setForeground(ColorConstants.MED_COLOR);
			} else if (rafp16.getJuice() == 4) {
				lblJuice.setText("80Z");
				lblJuice.setForeground(ColorConstants.MED_COLOR);
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
				lblFluidRestrictions.setText(lblFluidRestrictions.getText()
						+ "G Tube");
			}
			if (rafp16.isNectar() == true) {
			} else {
				lblNectorPuddingHoney.setText("Nector, ");
			}
			if (rafp16.isPudding() == true) {
			} else {
				lblNectorPuddingHoney.setText(lblNectorPuddingHoney.getText()
						+ "Pudding, ");
			}
			if (rafp16.isHoney() == true) {
			} else {
				lblNectorPuddingHoney.setText(lblNectorPuddingHoney.getText()
						+ "Honey");
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
			lblOtherContent.setForeground(ColorConstants.MED_COLOR);
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
				lblApplesaucePudding.setText(lblApplesaucePudding.getText()
						+ "AppleSauce");
			}
		}
	}

	public void showMedicationPanel() {
		List<TreatmentView> list = new ArrayList<TreatmentView>();
		try {
			list = MedrexClientManager.getInstance().getTreatmentsList(
					Global.currentResidenceKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
		int size = list.size();
		PanelMedication RunTimepanel[] = new PanelMedication[size];
		Iterator<TreatmentView> it = list.iterator();
		int panelNo = 0;
		double height = 0;
		while (it.hasNext()) {
			new TreatmentView();
			it.next();
			RunTimepanel[panelNo] = new PanelMedication();
			RunTimepanel[panelNo].setBounds(10, 25 + (panelNo * 38), 265, 38);
			// suresh RunTimepanel[panelNo].updateLabels(medView);
			RunTimepanel[panelNo].setMedicationType("RM");
			height = height + RunTimepanel[panelNo].getBounds().getHeight();
			panelNo++;
		}
	}

	public static void main(String args[]) {

		SwingUtils.wrapInDialog(new PanelTreatmentResidentInfo(null))
				.setVisible(true);
	}
}
