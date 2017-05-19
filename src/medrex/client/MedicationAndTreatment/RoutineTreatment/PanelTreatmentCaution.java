package medrex.client.MedicationAndTreatment.RoutineTreatment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import medrex.client.PanelImage;
import medrex.client.MedicationAndTreatment.FrameMedicationDesktop;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admission.ResidentAssessmentFormPage16;
import medrex.commons.vo.medicationCart.CalculatedMedication;
import medrex.commons.vo.medicationCart.Medications;
import medrex.commons.vo.physician.PhysicianForm;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderMedication;
import medrex.commons.vo.resident.ResidentAllergies;
import medrex.commons.vo.resident.ResidentDiagnosis;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;
import medrex.commons.vo.treatmentCart.TreatmentView;

import com.sX.awt.Direction;
import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;
import com.sX.swing.JxToggleButton;

public class PanelTreatmentCaution extends JxPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6133785581906708931L;
	private JLabel lblResidentName;
	private JLabel lblRoom;
	private PanelImage panelImage_1;
	private JLabel lblDob;
	private JLabel lblAllergies;
	private JLabel lblDiet;
	private JLabel lblDoctor;
	private JLabel lblDiagnosis;
	private JLabel lblFluidRestrictions;
	private JLabel lblNectorPuddingHoney;
	private JLabel lblNpo;
	private JLabel lblHearingAid;
	private JLabel lblEyeGlass;
	private JLabel lblHohI;
	private JLabel lblHohR;
	private JLabel lblDeaf;
	private JLabel lblBlind;
	private JLabel lblOtherContent;
	private JLabel lblOther;
	private JLabel lblApplesaucePudding;
	private JLabel lblJuice;
	private JLabel lblWater;
	ResidentMain rm = null;
	List<ResidentAllergies> allergyList = null;
	List<ResidentDiagnosis> diagnosis = null;
	List<PhysicianForm> phyform = null;
	String tempDiagnosis = "";
	String tempAllergies = "";
	String tempPhysicianForm = "";
	private static final Border BORDER = new LineBorder(
			new Color(122, 154, 167), 2, false);
	private static final Color BACKGROUND = new Color(206, 221, 224, 250);
	private static final Color FOREGROUND = new Color(0, 69, 97);
	private static final Font FONT = new Font("Dialog", Font.BOLD, 13)
			.deriveFont(13.5f);
	private JTextArea area;
	private TreatmentView currentTreatment = null;
	private JLabel medicineName;
	private JTextArea txtDiagnosis;
	private JTextArea txtAllergies;
	private int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	private int width = Toolkit.getDefaultToolkit().getScreenSize().width;

	public PanelTreatmentCaution(FrameMedicationDesktop frameTreatmentDesktop,
			TreatmentView currentTreatment) {
		super();
		this.currentTreatment = currentTreatment;
		setBounds(0, 0, 1000, 700);
		setArc(0);
		setLinearGradient(ColorConstants.GradientBright, new Color(148, 178,
				188), Direction.TOP_TO_BOTTOM);
		setBackground(Color.WHITE);
		setLayout(new BorderLayout());
		setSize(Toolkit.getDefaultToolkit().getScreenSize().width - 10, Toolkit
				.getDefaultToolkit().getScreenSize().height - 15);

		final JPanel northPanel = new JPanel();
		northPanel.setOpaque(false);
		northPanel.setPreferredSize(new Dimension(0, 200));
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		northPanel.setLayout(flowLayout);
		northPanel.setBackground(Color.WHITE);
		add(northPanel, BorderLayout.NORTH);

		final JLabel residentInformationLabel = new JLabel();
		residentInformationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		residentInformationLabel.setPreferredSize(new Dimension(400, 30));
		residentInformationLabel.setFont(new Font("Arial", Font.BOLD, 20));
		residentInformationLabel.setText("Resident Information");
		residentInformationLabel.setForeground(ColorConstants.MED_COLOR);
		northPanel.add(residentInformationLabel);

		final JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setPreferredSize(new Dimension((int) (width / 1.3),
				(int) (height / 3.1)));
		// panel_1.setPreferredSize(new Dimension(1000,200));
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		northPanel.add(panel_1);

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
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setPreferredSize(new Dimension(120, 200));
		northPanel.add(panel_2);

		panelImage_1 = new PanelImage();
		panelImage_1.setBorder(new LineBorder(new Color(180, 188, 193), 1,
				false));
		panelImage_1.setCurvedView(true);
		panelImage_1.setArc(0.4f);
		panelImage_1.setBounds(10, 10, 100, 120);
		panel_2.add(panelImage_1);

		final JPanel panel_11_1_1_1_1_1_1_1 = new JPanel();
		panel_11_1_1_1_1_1_1_1.setOpaque(false);
		panel_11_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_11_1_1_1_1_1_1_1.setLayout(null);
		panel_11_1_1_1_1_1_1_1.setBounds(4, 159, 110, 20);
		panel_2.add(panel_11_1_1_1_1_1_1_1);

		final JLabel thickenedLiquidsLabel_1_1_1_1_1_1_1 = new JLabel();
		thickenedLiquidsLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma",
				Font.BOLD, 12));
		thickenedLiquidsLabel_1_1_1_1_1_1_1.setText("Room");
		thickenedLiquidsLabel_1_1_1_1_1_1_1
				.setForeground(ColorConstants.MED_COLOR);
		thickenedLiquidsLabel_1_1_1_1_1_1_1.setBounds(18, 1, 54, 16);
		panel_11_1_1_1_1_1_1_1.add(thickenedLiquidsLabel_1_1_1_1_1_1_1);

		lblRoom = new JLabel();
		lblRoom.setFont(new Font("Dialog", Font.BOLD, 12));
		lblRoom.setForeground(ColorConstants.MED_COLOR);
		TempRoomHistory list1 = null;
		try {
			list1 = MedrexClientManager.getInstance().getLastRoomHistory(
					Global.currentResidenceKey);
		} catch (RemoteException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (MedrexException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		lblRoom.setText(list1.getRoom());
		lblRoom.setBounds(67, 0, 40, 19);
		panel_11_1_1_1_1_1_1_1.add(lblRoom);

		lblResidentName = new JLabel();
		lblResidentName.setFont(new Font("Dialog", Font.BOLD, 12));
		lblResidentName.setForeground(ColorConstants.DEF_COLOR);
		lblResidentName.setText("");
		lblResidentName.setBounds(10, 134, 100, 19);
		panel_2.add(lblResidentName);

		final JPanel panelTotalMedication = new JPanel();
		panelTotalMedication.setLayout(new FlowLayout());
		panelTotalMedication.setOpaque(false);
		panelTotalMedication.setPreferredSize(new Dimension(250, 0));

		final JLabel totalMedicationsLabel = new JLabel();
		totalMedicationsLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		totalMedicationsLabel.setText("ALL MEDICATIONS");
		totalMedicationsLabel.setForeground(ColorConstants.GradientDark);
		panelTotalMedication.add(totalMedicationsLabel);

		add(panelTotalMedication, BorderLayout.WEST);
		JxButton panelMedication[] = new JxButton[10];
		List<PhysicianOrderMedication> list = new ArrayList<PhysicianOrderMedication>();
		try {
			list = MedrexClientManager
					.getInstance()
					.getPhysicianOrderMedicationList(Global.currentResidenceKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
		list.size();
		for (int i = 0; i < list.size(); i++) {
			PhysicianOrderMedication md = list.get(i);
			panelMedication[i] = new JxButton(md.getMedication());
			panelMedication[i].setArc(0.4f);
			panelMedication[i].setSize(200, 30);
			panelMedication[i].setBackground(Color.WHITE);
			if (i % 2 == 1) {
				panelMedication[i].setForeground(ColorConstants.DEF_COLOR);
			} else {
				panelMedication[i].setForeground(ColorConstants.MED_COLOR);
			}
			panelMedication[i].setPreferredSize(new Dimension(
					panelMedication[i].getSize()));
			panelTotalMedication.add(panelMedication[i]);
		}
		// String[]
		JPanel centerPanel = new JPanel();
		final FlowLayout flowLayout_4 = new FlowLayout();
		flowLayout_4.setVgap(40);
		flowLayout_4.setHgap(40);
		centerPanel.setLayout(flowLayout_4);
		centerPanel.setOpaque(false);
		centerPanel.setBackground(Color.WHITE);
		add(centerPanel, BorderLayout.CENTER);

		final JPanel panelCaution = new JPanel();
		panelCaution.setBackground(Color.WHITE);
		panelCaution.setPreferredSize(new Dimension(660, 450));
		panelCaution.setLayout(null);
		panelCaution.setOpaque(true);
		panelCaution.setBorder(new LineBorder(Color.black, 1, false));
		centerPanel.add(panelCaution);

		final JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setBounds(38, 95, 566, 146);
		panelCaution.add(panel);

		final JLabel cautionLabel = new JLabel();
		cautionLabel.setFont(new Font("", Font.BOLD, 17));
		cautionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cautionLabel.setText("CAUTION");
		cautionLabel.setForeground(ColorConstants.DEF_COLOR);
		cautionLabel.setBounds(134, 10, 298, 16);
		panel.add(cautionLabel);

		final JTextArea cautionTextArea = new JTextArea();
		cautionTextArea.setBounds(141, 49, 308, 63);
		panel.add(cautionTextArea);
		cautionTextArea.setForeground(ColorConstants.MED_COLOR);
		cautionTextArea.setLineWrap(true);
		cautionTextArea.setFont(new Font("Dialog", Font.BOLD, 12));
		String cautionName = "";
		try {
			cautionName = MedrexClientManager.getInstance().getCautionaryName(
					frameTreatmentDesktop.getCurrentMedication()
							.getMedicationId());
		} catch (RemoteException e1) {
			e1.printStackTrace();
		} catch (MedrexException e1) {
			e1.printStackTrace();
		}
		cautionTextArea.setText(cautionName);

		ButtonGroup bgMedicationGroup = new ButtonGroup();
		final JxToggleButton givenButton = new JxToggleButton();
		givenButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				// doSave(1,
				// Global.frameMedicationDashboard.getCurrentMedication()) ;
			}
		});
		givenButton.setText("GIVEN");
		givenButton.setActionCommand("1");
		givenButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		final FlowLayout flowLayout_1 = new FlowLayout();
		flowLayout_1.setVgap(10);
		givenButton.setLayout(flowLayout_1);
		givenButton.setFont(FONT);
		givenButton.setBorderPainted(false);
		givenButton.setArc(0.6f);
		givenButton.setBorder(BORDER);
		givenButton.setBackground(BACKGROUND);
		givenButton.setForeground(FOREGROUND);
		givenButton.setRolloverEnabled(true);
		givenButton.setHorizontalAlignment(SwingConstants.CENTER);
		bgMedicationGroup.add(givenButton);
		givenButton.setPreferredSize(new Dimension(250, 80));
		givenButton.setBounds(76, 269, 192, 54);
		panelCaution.add(givenButton);

		final JxToggleButton notGivenButton = new JxToggleButton();
		notGivenButton.setText("NOT GIVEN");
		notGivenButton.setActionCommand("2");
		notGivenButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				SwingUtils.openInDialog(new PanelTreatmentDecline());
				doSave(2, PanelTreatmentCaution.this.currentTreatment);
			}
		});
		notGivenButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setVgap(10);
		notGivenButton.setLayout(flowLayout_1);
		notGivenButton.setFont(FONT);
		notGivenButton.setBorderPainted(false);
		notGivenButton.setArc(0.6f);
		notGivenButton.setBorder(BORDER);
		notGivenButton.setBackground(BACKGROUND);
		notGivenButton.setForeground(FOREGROUND);
		notGivenButton.setRolloverEnabled(true);
		notGivenButton.setHorizontalAlignment(SwingConstants.CENTER);
		bgMedicationGroup.add(notGivenButton);
		notGivenButton.setPreferredSize(new Dimension(250, 80));
		notGivenButton.setBounds(346, 269, 192, 54);
		panelCaution.add(notGivenButton);

		final JxToggleButton preparedButton = new JxToggleButton();
		preparedButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSave(3, PanelTreatmentCaution.this.currentTreatment);
			}
		});
		preparedButton.setText("PREPARED");
		preparedButton.setActionCommand("2");
		preparedButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		final FlowLayout flowLayout_3 = new FlowLayout();
		flowLayout_3.setVgap(10);
		preparedButton.setLayout(flowLayout_1);
		preparedButton.setFont(FONT);
		preparedButton.setBorderPainted(false);
		preparedButton.setArc(0.6f);
		preparedButton.setBorder(BORDER);
		preparedButton.setBackground(BACKGROUND);
		preparedButton.setForeground(FOREGROUND);
		// preparedButton.setRolloverEnabled(true);
		preparedButton.setHorizontalAlignment(SwingConstants.CENTER);
		bgMedicationGroup.add(preparedButton);
		preparedButton.setPreferredSize(new Dimension(250, 80));
		preparedButton.setBounds(213, 353, 192, 54);
		panelCaution.add(preparedButton);

		medicineName = new JLabel();
		medicineName.setForeground(ColorConstants.MED_COLOR);
		medicineName.setFont(new Font("", Font.BOLD, 18));
		medicineName.setHorizontalAlignment(SwingConstants.LEADING);
		medicineName.setText(frameTreatmentDesktop.getCurrentMedication()
				.getMedication()
				+ "");
		medicineName.setBounds(23, 21, 269, 26);
		panelCaution.add(medicineName);
		doLoad();
	}

	public String getTitle() {

		return ("Caution");
	}

	public void doLoad() {
		int resId = Global.currentResidenceKey;
		try {
			rm = MedrexClientManager.getInstance().getResident(resId);

			allergyList = MedrexClientManager.getInstance()
					.getResidentAllergiesforResident(resId);

			Iterator<ResidentAllergies> itr = allergyList.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
				ResidentAllergies alli = itr.next();
				tempAllergies += alli.getName();
			}
			if (!"".equalsIgnoreCase(tempAllergies)) {
				txtAllergies.setText(tempAllergies);
			}
			this.diagnosis = MedrexClientManager.getInstance()
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
			lblDob.setText(rm.getDob() + "");
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
			System.out.println("rafp16.getWater()" + rafp16.getWater());
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
			} else if (rafp16.getJuice() == 2) {
				lblJuice.setText("No");
			} else if (rafp16.getJuice() == 3) {
				lblJuice.setText("40Z");
			} else if (rafp16.getJuice() == 4) {
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

	public void doSave(int status, TreatmentView row) {

		CalculatedMedication cm = new CalculatedMedication();
		Medications m = new Medications();
		try {
			m = MedrexClientManager.getInstance().getMedications(
					row.getCalcSerial());
			cm.setUser(MedrexClientManager.getInstance().getUser(
					Global.currentLoggedInUserKey));
		} catch (RemoteException e1) {
			e1.printStackTrace();
		} catch (MedrexException e1) {
			e1.printStackTrace();
		}
		cm.setSerial(row.getFormId());
		cm.setMedSerial(m);
		cm.setTimeRecord(new Date());
		cm.setStatus(status);
		cm.setCalculatedStartTime(row.getCalculatedStartTime());
		cm.setCalculatedEndTime(row.getCalculatedEndTime());

		try {
			MedrexClientManager.getInstance()
					.insertOrUpdateCalculatedMedication(cm);
		} catch (Exception e) {

			e.printStackTrace();
		}
		Global.frameMedicationDashboard.updateResidentInfoScreen();
		Global.frameMedicationDashboard.setCurrentIndex(3);
		Global.frameMedicationDashboard.reDrawTheFrame();
	}
}
