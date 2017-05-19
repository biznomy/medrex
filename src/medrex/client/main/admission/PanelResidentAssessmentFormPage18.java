package medrex.client.main.admission;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldValidation;
import medrex.commons.intf.Form;
import medrex.commons.vo.admission.ResidentAssessmentFormPage18;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;

import com.jgoodies.validation.ValidationResult;
import com.toedter.calendar.JDateChooser;

public class PanelResidentAssessmentFormPage18 extends JPanel implements Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1518449417441409309L;
	private JDateChooser dcAdmitDate;
	private JCheckBox cbNursingOffice40;
	private JCheckBox cbNursingOffice39;
	private JCheckBox cbNursingOffice38;
	private JCheckBox cbNursingOffice37;
	private JCheckBox cbNursingOffice36;
	private JCheckBox cbNursingOffice35;
	private JCheckBox cbNursingOffice34;
	private JCheckBox cbNursingOffice33;
	private JCheckBox cbNursingOffice32;
	private JCheckBox cbNursingOffice31;
	private JCheckBox cbNursingOffice30;
	private JCheckBox cbNursingOffice29;
	private JCheckBox cbNursingOffice28;
	private JCheckBox cbNursingOffice27;
	private JCheckBox cbNursingOffice26;
	private JCheckBox cbNursingOffice25;
	private JCheckBox cbNursingOffice24;
	private JCheckBox cbNursingOffice23;
	private JCheckBox cbNursingOffice22;
	private JCheckBox cbNursingOffice21;
	private JCheckBox cbNursingOffice20;
	private JCheckBox cbNursingOffice19;
	private JCheckBox cbNursingOffice18;
	private JCheckBox cbNursingOffice17;
	private JCheckBox cbNursingOffice16;
	private JCheckBox cbNursingOffice15;
	private JCheckBox cbNursingOffice14;
	private JCheckBox cbNursingOffice13;
	private JCheckBox cbNursingOffice12;
	private JCheckBox cbNursingOffice11;
	private JCheckBox cbnNrsingOffice10;
	private JCheckBox cbNursingOffice9;
	private JCheckBox cbNursingOffice8;
	private JCheckBox cbNursingOffice7;
	private JCheckBox cbNursingOffice6;
	private JCheckBox cbNursingOffice5;
	private JCheckBox cbNursingOffice4;
	private JCheckBox cbNursingOffice3;
	private JCheckBox cbNursingOffice2;
	private JCheckBox cbNursingOffice1;
	private JCheckBox cbSuperVisor40;
	private JCheckBox cbSuperVisor39;
	private JCheckBox cbSuperVisor38;
	private JCheckBox cbSuperVisor37;
	private JCheckBox cbSuperVisor36;
	private JCheckBox cbSuperVisor35;
	private JCheckBox cbSuperVisor34;
	private JCheckBox cbSuperVisor33;
	private JCheckBox cbSuperVisor32;
	private JCheckBox cbSuperVisor31;
	private JCheckBox cbSuperVisor30;
	private JCheckBox cbSuperVisor29;
	private JCheckBox cbSuperVisor28;
	private JCheckBox cbSuperVisor27;
	private JCheckBox cbSuperVisor26;
	private JCheckBox cbSuperVisor25;
	private JCheckBox cbSuperVisor24;
	private JCheckBox cbSuperVisor23;
	private JCheckBox cbSuperVisor22;
	private JCheckBox cbSuperVisor21;
	private JCheckBox cbSuperVisor20;
	private JCheckBox cbSuperVisor19;
	private JCheckBox cbSuperVisor18;
	private JCheckBox cbSuperVisor17;
	private JCheckBox cbSuperVisor16;
	private JCheckBox cbSuperVisor15;
	private JCheckBox cbSuperVisor14;
	private JCheckBox cbSuperVisor13;
	private JCheckBox cbSuperVisor12;
	private JCheckBox cbSuperVisor11;
	private JCheckBox cbSuperVisor10;
	private JCheckBox cbSuperVisor9;
	private JCheckBox cbSuperVisor8;
	private JCheckBox cbSuperVisor7;
	private JCheckBox cbSuperVisor6;
	private JCheckBox cbSuperVisor5;
	private JCheckBox cbSuperVisor4;
	private JCheckBox cbSuperVisor3;
	private JCheckBox cbSuperVisor2;
	private JCheckBox cbSuperVisor1;
	private JCheckBox cbAdmittingNurse40;
	private JCheckBox cbAdmittingNurse39;
	private JCheckBox cbAdmittingNurse38;
	private JCheckBox cbAdmittingNurse37;
	private JCheckBox cbAdmittingNurse36;
	private JCheckBox cbAdmittingNurse35;
	private JCheckBox cbAdmittingNurse34;
	private JCheckBox cbAdmittingNurse33;
	private JCheckBox cbAdmittingNurse32;
	private JCheckBox cbAdmittingNurse31;
	private JCheckBox cbAdmittingNurse30;
	private JCheckBox cbAdmittingNurse29;
	private JCheckBox cbAdmittingNurse28;
	private JCheckBox cbAdmittingNurse27;
	private JCheckBox cbAdmittingNurse26;
	private JCheckBox cbAdmittingNurse25;
	private JCheckBox cbAdmittingNurse24;
	private JCheckBox cbAdmittingNurse23;
	private JCheckBox cbAdmittingNurse22;
	private JCheckBox cbAdmittingNurse21;
	private JCheckBox cbAdmittingNurse20;
	private JCheckBox cbAdmittingNurse19;
	private JCheckBox cbAdmittingNurse18;
	private JCheckBox cbAdmittingNurse17;
	private JCheckBox cbAdmittingNurse16;
	private JCheckBox cbAdmittingNurse15;
	private JCheckBox cbAdmittingNurse14;
	private JCheckBox cbAdmittingNurse13;
	private JCheckBox cbAdmittingNurse12;
	private JCheckBox cbAdmittingNurse11;
	private JCheckBox cbAdmittingNurse10;
	private JCheckBox cbAdmittingNurse9;
	private JCheckBox cbAdmittingNurse8;
	private JCheckBox cbAdmittingNurse7;
	private JCheckBox cbAdmittingNurse6;
	private JCheckBox cbAdmittingNurse5;
	private JCheckBox cbAdmittingNurse4;
	private JCheckBox cbAdmittingNurse3;
	private JCheckBox cbAdmittingNurse2;
	private JCheckBox cbAdmittingNurse1;
	private JTextField txtRoom;
	private JTextField txtName;

	public PanelResidentAssessmentFormPage18() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(900, 1500));
		setBackground(Color.WHITE);

		final JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 900, 1500);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 900, 95);
		panel.add(panel_1);

		final JLabel admissionCheklistAndLabel = new JLabel();
		admissionCheklistAndLabel
				.setHorizontalTextPosition(SwingConstants.CENTER);
		admissionCheklistAndLabel.setHorizontalAlignment(SwingConstants.CENTER);
		admissionCheklistAndLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		admissionCheklistAndLabel.setBounds(0, 0, 900, 95);
		admissionCheklistAndLabel
				.setText("ADMISSION CHEKLIST AND CHART REVIEW");
		panel_1.add(admissionCheklistAndLabel);

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(0, 94, 900, 32);
		panel.add(panel_2);

		final JLabel nameLabel = new JLabel();
		nameLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		nameLabel.setText("NAME:");
		nameLabel.setBounds(25, 8, 54, 16);
		panel_2.add(nameLabel);

		txtName = new JTextField();
		txtName.setBounds(85, 7, 390, 20);
		panel_2.add(txtName);

		final JLabel rmLabel = new JLabel();
		rmLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		rmLabel.setText("RM#");
		rmLabel.setBounds(500, 8, 39, 16);
		panel_2.add(rmLabel);

		txtRoom = new JTextField();
		txtRoom.setBounds(545, 7, 95, 20);
		panel_2.add(txtRoom);

		final JLabel admitDateLabel = new JLabel();
		admitDateLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		admitDateLabel.setText("ADMIT DATE");
		admitDateLabel.setBounds(658, 7, 90, 16);
		panel_2.add(admitDateLabel);

		dcAdmitDate = new JDateChooser();
		dcAdmitDate.setDateFormatString("MM/dd/yyyy");
		dcAdmitDate.setBounds(764, 6, 102, 20);
		panel_2.add(dcAdmitDate);

		final JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(0, 125, 900, 1375);
		panel.add(panel_3);

		final JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setLayout(null);
		panel_4.setBounds(0, 32, 495, 1241);
		panel_3.add(panel_4);

		final JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(0, 0, 495, 32);
		panel_4.add(panel_5);
		panel_5.setBorder(new LineBorder(Color.black, 1, false));

		final JLabel faceSheetIsLabel = new JLabel();
		faceSheetIsLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		faceSheetIsLabel.setBounds(5, 1, 485, 30);
		faceSheetIsLabel.setText("Face Sheet is complete");
		panel_5.add(faceSheetIsLabel);

		final JPanel panel_5_1 = new JPanel();
		panel_5_1.setLayout(null);
		panel_5_1.setBackground(Color.WHITE);
		panel_5_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1.setBounds(0, 31, 495, 32);
		panel_4.add(panel_5_1);

		final JLabel pertinentHospLabsLabel = new JLabel();
		pertinentHospLabsLabel.setBounds(6, 6, 484, 15);
		pertinentHospLabsLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pertinentHospLabsLabel
				.setText("Pertinent hosp labs, xrays, EKG, consults, surg repts. eic, are placed in chart... Msc sect.");
		panel_5_1.add(pertinentHospLabsLabel);

		final JPanel panel_5_2 = new JPanel();
		panel_5_2.setLayout(null);
		panel_5_2.setBackground(Color.WHITE);
		panel_5_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2.setBounds(0, 62, 495, 32);
		panel_4.add(panel_5_2);

		final JLabel headingsCompleteOnLabel = new JLabel();
		headingsCompleteOnLabel.setBounds(5, 6, 242, 16);
		headingsCompleteOnLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		headingsCompleteOnLabel
				.setText("Headings complete on all pages of the cbart");
		panel_5_2.add(headingsCompleteOnLabel);

		final JPanel panel_5_3 = new JPanel();
		panel_5_3.setLayout(null);
		panel_5_3.setBackground(Color.WHITE);
		panel_5_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_3.setBounds(0, 93, 495, 32);
		panel_4.add(panel_5_3);

		final JLabel label_2 = new JLabel();
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_2.setBounds(5, 6, 181, 14);
		label_2.setText("Allergy label on front inside cover");
		panel_5_3.add(label_2);

		final JPanel panel_5_4 = new JPanel();
		panel_5_4.setLayout(null);
		panel_5_4.setBackground(Color.WHITE);
		panel_5_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_4.setBounds(0, 124, 495, 32);
		panel_4.add(panel_5_4);

		final JLabel medicareCertificationOnLabel = new JLabel();
		medicareCertificationOnLabel.setBounds(6, 6, 482, 15);
		medicareCertificationOnLabel
				.setFont(new Font("Tahoma", Font.PLAIN, 12));
		medicareCertificationOnLabel
				.setText("Medicare Certification on chart (lf Medicare)...complete wfth dates, reason for coverage");
		panel_5_4.add(medicareCertificationOnLabel);

		final JPanel panel_5_5 = new JPanel();
		panel_5_5.setLayout(null);
		panel_5_5.setBackground(Color.WHITE);
		panel_5_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_5.setBounds(0, 155, 495, 32);
		panel_4.add(panel_5_5);

		final JLabel mdNotifiedOfLabel = new JLabel();
		mdNotifiedOfLabel.setBounds(5, 6, 232, 15);
		mdNotifiedOfLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mdNotifiedOfLabel
				.setText("MD notified of admission... orders received");
		panel_5_5.add(mdNotifiedOfLabel);

		final JPanel panel_5_6 = new JPanel();
		panel_5_6.setLayout(null);
		panel_5_6.setBackground(Color.WHITE);
		panel_5_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_6.setBounds(0, 186, 495, 32);
		panel_4.add(panel_5_6);

		final JLabel mdOrdersIncludeLabel = new JLabel();
		mdOrdersIncludeLabel.setBounds(5, 6, 103, 15);
		mdOrdersIncludeLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mdOrdersIncludeLabel.setText("MD Orders include.");
		panel_5_6.add(mdOrdersIncludeLabel);

		final JPanel panel_5_7 = new JPanel();
		panel_5_7.setLayout(null);
		panel_5_7.setBackground(Color.WHITE);
		panel_5_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_7.setBounds(0, 217, 495, 32);
		panel_4.add(panel_5_7);

		final JLabel dietLabel = new JLabel();
		dietLabel.setBounds(25, 6, 22, 15);
		dietLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		dietLabel.setText("Diet");
		panel_5_7.add(dietLabel);

		final JPanel panel_5_8 = new JPanel();
		panel_5_8.setLayout(null);
		panel_5_8.setBackground(Color.WHITE);
		panel_5_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_8.setBounds(0, 248, 495, 32);
		panel_4.add(panel_5_8);

		final JLabel medicationsMedLabel = new JLabel();
		medicationsMedLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		medicationsMedLabel.setBounds(25, 6, 270, 14);
		medicationsMedLabel
				.setText("Medications. .. med, route, dose, freq, diagnosis");
		panel_5_8.add(medicationsMedLabel);

		final JPanel panel_5_9 = new JPanel();
		panel_5_9.setLayout(null);
		panel_5_9.setBackground(Color.WHITE);
		panel_5_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_9.setBounds(0, 279, 495, 32);
		panel_4.add(panel_5_9);

		final JLabel fluAndPneumoLabel = new JLabel();
		fluAndPneumoLabel.setBounds(25, 6, 148, 16);
		fluAndPneumoLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		fluAndPneumoLabel.setText("Flu and pneumo vac orders");
		panel_5_9.add(fluAndPneumoLabel);

		final JPanel panel_5_10 = new JPanel();
		panel_5_10.setLayout(null);
		panel_5_10.setBackground(Color.WHITE);
		panel_5_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_10.setBounds(0, 310, 495, 32);
		panel_4.add(panel_5_10);

		final JLabel label_3_6 = new JLabel();
		label_3_6.setBounds(25, 6, 99, 15);
		label_3_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_3_6.setText("2 step PPD orders");
		panel_5_10.add(label_3_6);

		final JPanel panel_5_11 = new JPanel();
		panel_5_11.setLayout(null);
		panel_5_11.setBackground(Color.WHITE);
		panel_5_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_11.setBounds(0, 341, 495, 32);
		panel_4.add(panel_5_11);

		final JLabel treatmentsMedSiteLabel = new JLabel();
		treatmentsMedSiteLabel.setBounds(25, 6, 161, 15);
		treatmentsMedSiteLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		treatmentsMedSiteLabel.setText("Treatments... med, site, freq");
		panel_5_11.add(treatmentsMedSiteLabel);

		final JPanel panel_5_11_1 = new JPanel();
		panel_5_11_1.setLayout(null);
		panel_5_11_1.setBackground(Color.WHITE);
		panel_5_11_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_11_1.setBounds(0, 372, 495, 32);
		panel_4.add(panel_5_11_1);

		final JLabel therapyOrdersIfLabel = new JLabel();
		therapyOrdersIfLabel.setBounds(25, 6, 149, 15);
		therapyOrdersIfLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		therapyOrdersIfLabel.setText("Therapy orders if applicable");
		panel_5_11_1.add(therapyOrdersIfLabel);

		final JPanel panel_5_11_2 = new JPanel();
		panel_5_11_2.setLayout(null);
		panel_5_11_2.setBackground(Color.WHITE);
		panel_5_11_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_11_2.setBounds(0, 403, 495, 32);
		panel_4.add(panel_5_11_2);

		final JLabel applicableLabel = new JLabel();
		applicableLabel.setBounds(25, 6, 91, 15);
		applicableLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		applicableLabel.setText("Consults needed");
		panel_5_11_2.add(applicableLabel);

		final JPanel panel_5_11_3 = new JPanel();
		panel_5_11_3.setLayout(null);
		panel_5_11_3.setBackground(Color.WHITE);
		panel_5_11_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_11_3.setBounds(0, 434, 495, 32);
		panel_4.add(panel_5_11_3);

		final JLabel labsOrderedLabel = new JLabel();
		labsOrderedLabel.setBounds(25, 6, 434, 14);
		labsOrderedLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		labsOrderedLabel
				.setText("Labs ordered & entered in book... medication monitoring, i.e. Lasix/lytes, Pbarb levels, etc");
		panel_5_11_3.add(labsOrderedLabel);

		final JPanel panel_5_11_4 = new JPanel();
		panel_5_11_4.setLayout(null);
		panel_5_11_4.setBackground(Color.WHITE);
		panel_5_11_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_11_4.setBounds(0, 465, 495, 32);
		panel_4.add(panel_5_11_4);

		final JLabel weightAndFrequencyLabel = new JLabel();
		weightAndFrequencyLabel.setBounds(25, 6, 123, 15);
		weightAndFrequencyLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		weightAndFrequencyLabel.setText("Weight and frequency");
		panel_5_11_4.add(weightAndFrequencyLabel);

		final JPanel panel_5_11_5 = new JPanel();
		panel_5_11_5.setLayout(null);
		panel_5_11_5.setBackground(Color.WHITE);
		panel_5_11_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_11_5.setBounds(0, 496, 495, 32);
		panel_4.add(panel_5_11_5);

		final JLabel tubeFeedingformulaCchrLabel = new JLabel();
		tubeFeedingformulaCchrLabel.setBounds(25, 6, 380, 15);
		tubeFeedingformulaCchrLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tubeFeedingformulaCchrLabel
				.setText("Tube feeding...formula, cc/hr. # of hrs to hang, total volume/ 24 hrs");
		panel_5_11_5.add(tubeFeedingformulaCchrLabel);

		final JPanel panel_5_11_6 = new JPanel();
		panel_5_11_6.setLayout(null);
		panel_5_11_6.setBackground(Color.WHITE);
		panel_5_11_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_11_6.setBounds(0, 527, 495, 32);
		panel_4.add(panel_5_11_6);

		final JLabel label_3_13 = new JLabel();
		label_3_13.setBounds(25, 6, 236, 15);
		label_3_13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_3_13.setText("Tube feeding flush, amount and frequency");
		panel_5_11_6.add(label_3_13);

		final JPanel panel_5_11_7 = new JPanel();
		panel_5_11_7.setLayout(null);
		panel_5_11_7.setBackground(Color.WHITE);
		panel_5_11_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_11_7.setBounds(0, 558, 495, 32);
		panel_4.add(panel_5_11_7);

		final JLabel ordersAreTranscribedLabel = new JLabel();
		ordersAreTranscribedLabel.setBounds(5, 6, 267, 15);
		ordersAreTranscribedLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ordersAreTranscribedLabel
				.setText("Orders are transcribed to MAR and TAR correctly");
		panel_5_11_7.add(ordersAreTranscribedLabel);

		final JPanel panel_5_11_8 = new JPanel();
		panel_5_11_8.setLayout(null);
		panel_5_11_8.setBackground(Color.WHITE);
		panel_5_11_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_11_8.setBounds(0, 589, 495, 32);
		panel_4.add(panel_5_11_8);

		final JLabel psychMedicationMonitoringLabel = new JLabel();
		psychMedicationMonitoringLabel.setBounds(5, 6, 309, 15);
		psychMedicationMonitoringLabel.setFont(new Font("Tahoma", Font.PLAIN,
				12));
		psychMedicationMonitoringLabel
				.setText("Psych medication monitoring sheets initiated if applicable");
		panel_5_11_8.add(psychMedicationMonitoringLabel);

		final JPanel panel_5_11_9 = new JPanel();
		panel_5_11_9.setLayout(null);
		panel_5_11_9.setBackground(Color.WHITE);
		panel_5_11_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_11_9.setBounds(0, 620, 495, 32);
		panel_4.add(panel_5_11_9);

		final JLabel medicationOrderedFrornLabel = new JLabel();
		medicationOrderedFrornLabel.setBounds(5, 6, 191, 15);
		medicationOrderedFrornLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		medicationOrderedFrornLabel
				.setText("Medication ordered frorn pharmacy");
		panel_5_11_9.add(medicationOrderedFrornLabel);

		final JPanel panel_5_11_10 = new JPanel();
		panel_5_11_10.setLayout(null);
		panel_5_11_10.setBackground(Color.WHITE);
		panel_5_11_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_11_10.setBounds(0, 651, 495, 32);
		panel_4.add(panel_5_11_10);

		final JLabel nursingAdmissionAssessmentLabel = new JLabel();
		nursingAdmissionAssessmentLabel.setBounds(5, 6, 223, 15);
		nursingAdmissionAssessmentLabel.setFont(new Font("Tahoma", Font.PLAIN,
				12));
		nursingAdmissionAssessmentLabel
				.setText("Nursing admission assessment completed");
		panel_5_11_10.add(nursingAdmissionAssessmentLabel);

		final JPanel panel_5_11_11 = new JPanel();
		panel_5_11_11.setLayout(null);
		panel_5_11_11.setBackground(Color.WHITE);
		panel_5_11_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_11_11.setBounds(0, 682, 495, 32);
		panel_4.add(panel_5_11_11);

		final JLabel bbAssessmentComoletedLabel = new JLabel();
		bbAssessmentComoletedLabel.setBounds(5, 6, 226, 15);
		bbAssessmentComoletedLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		bbAssessmentComoletedLabel
				.setText("B&B assessment comoleted if incontinent");
		panel_5_11_11.add(bbAssessmentComoletedLabel);

		final JPanel panel_5_11_12 = new JPanel();
		panel_5_11_12.setLayout(null);
		panel_5_11_12.setBackground(Color.WHITE);
		panel_5_11_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_11_12.setBounds(0, 713, 495, 32);
		panel_4.add(panel_5_11_12);

		final JLabel label_3_19 = new JLabel();
		label_3_19.setBounds(5, 6, 187, 15);
		label_3_19.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_3_19.setText("Elopement assessment completed");
		panel_5_11_12.add(label_3_19);

		final JPanel panel_5_11_13 = new JPanel();
		panel_5_11_13.setLayout(null);
		panel_5_11_13.setBackground(Color.WHITE);
		panel_5_11_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_11_13.setBounds(0, 744, 495, 32);
		panel_4.add(panel_5_11_13);

		final JLabel fallAssessrnentCompletedLabel = new JLabel();
		fallAssessrnentCompletedLabel.setBounds(5, 6, 145, 15);
		fallAssessrnentCompletedLabel
				.setFont(new Font("Tahoma", Font.PLAIN, 12));
		fallAssessrnentCompletedLabel.setText("Fall assessrnent completed");
		panel_5_11_13.add(fallAssessrnentCompletedLabel);

		final JPanel panel_5_11_14 = new JPanel();
		panel_5_11_14.setLayout(null);
		panel_5_11_14.setBackground(Color.WHITE);
		panel_5_11_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_11_14.setBounds(0, 775, 495, 32);
		panel_4.add(panel_5_11_14);

		final JLabel painAssessmenvPainLabel = new JLabel();
		painAssessmenvPainLabel.setBounds(5, 6, 249, 15);
		painAssessmenvPainLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		painAssessmenvPainLabel
				.setText("Pain Assessment/ Pain Flow Sheet completed");
		panel_5_11_14.add(painAssessmenvPainLabel);

		final JPanel panel_5_11_15 = new JPanel();
		panel_5_11_15.setLayout(null);
		panel_5_11_15.setBackground(Color.WHITE);
		panel_5_11_15.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_11_15.setBounds(0, 806, 495, 32);
		panel_4.add(panel_5_11_15);

		final JLabel setfadMinistrationOfLabel = new JLabel();
		setfadMinistrationOfLabel.setBounds(5, 6, 181, 15);
		setfadMinistrationOfLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		setfadMinistrationOfLabel.setText("Setf-Administration of Medication");
		panel_5_11_15.add(setfadMinistrationOfLabel);

		final JPanel panel_5_11_15_1 = new JPanel();
		panel_5_11_15_1.setLayout(null);
		panel_5_11_15_1.setBackground(Color.WHITE);
		panel_5_11_15_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_11_15_1.setBounds(0, 837, 495, 32);
		panel_4.add(panel_5_11_15_1);

		final JLabel sideRailAssessmentLabel = new JLabel();
		sideRailAssessmentLabel.setBounds(5, 6, 174, 15);
		sideRailAssessmentLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		sideRailAssessmentLabel.setText("Side Rail Assessment completed");
		panel_5_11_15_1.add(sideRailAssessmentLabel);

		final JPanel panel_5_11_15_2 = new JPanel();
		panel_5_11_15_2.setLayout(null);
		panel_5_11_15_2.setBackground(Color.WHITE);
		panel_5_11_15_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_11_15_2.setBounds(0, 868, 495, 32);
		panel_4.add(panel_5_11_15_2);

		final JLabel woundAssessmentbradenLabel = new JLabel();
		woundAssessmentbradenLabel.setBounds(5, 6, 192, 15);
		woundAssessmentbradenLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		woundAssessmentbradenLabel.setText("Wound Assessment (Braden Scale)");
		panel_5_11_15_2.add(woundAssessmentbradenLabel);

		final JPanel panel_5_11_15_3 = new JPanel();
		panel_5_11_15_3.setLayout(null);
		panel_5_11_15_3.setBackground(Color.WHITE);
		panel_5_11_15_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_11_15_3.setBounds(0, 899, 495, 32);
		panel_4.add(panel_5_11_15_3);

		final JLabel woundDocumentationSheetLabel = new JLabel();
		woundDocumentationSheetLabel.setBounds(5, 6, 300, 15);
		woundDocumentationSheetLabel
				.setFont(new Font("Tahoma", Font.PLAIN, 12));
		woundDocumentationSheetLabel
				.setText("Wound documentation sheet initiated for each wound");
		panel_5_11_15_3.add(woundDocumentationSheetLabel);

		final JPanel panel_5_11_15_4 = new JPanel();
		panel_5_11_15_4.setLayout(null);
		panel_5_11_15_4.setBackground(Color.WHITE);
		panel_5_11_15_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_11_15_4.setBounds(0, 930, 495, 32);
		panel_4.add(panel_5_11_15_4);

		final JLabel initiateLabel = new JLabel();
		initiateLabel.setBounds(5, 6, 42, 15);
		initiateLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		initiateLabel.setText("Initiate:");
		panel_5_11_15_4.add(initiateLabel);

		final JPanel panel_5_11_15_5 = new JPanel();
		panel_5_11_15_5.setLayout(null);
		panel_5_11_15_5.setBackground(Color.WHITE);
		panel_5_11_15_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_11_15_5.setBounds(0, 961, 495, 32);
		panel_4.add(panel_5_11_15_5);

		final JLabel mealConsumptionRecordLabel = new JLabel();
		mealConsumptionRecordLabel.setBounds(25, 6, 141, 15);
		mealConsumptionRecordLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mealConsumptionRecordLabel.setText("Meal Consumption Record");
		panel_5_11_15_5.add(mealConsumptionRecordLabel);

		final JPanel panel_5_11_15_6 = new JPanel();
		panel_5_11_15_6.setLayout(null);
		panel_5_11_15_6.setBackground(Color.WHITE);
		panel_5_11_15_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_11_15_6.setBounds(0, 992, 495, 32);
		panel_4.add(panel_5_11_15_6);

		final JLabel weeklySkinAssessmentLabel = new JLabel();
		weeklySkinAssessmentLabel.setBounds(25, 6, 165, 15);
		weeklySkinAssessmentLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		weeklySkinAssessmentLabel.setText("Weekly Skin Assessment Form");
		panel_5_11_15_6.add(weeklySkinAssessmentLabel);

		final JPanel panel_5_11_15_7 = new JPanel();
		panel_5_11_15_7.setLayout(null);
		panel_5_11_15_7.setBackground(Color.WHITE);
		panel_5_11_15_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_11_15_7.setBounds(0, 1023, 495, 32);
		panel_4.add(panel_5_11_15_7);

		final JLabel picturesTakenOfLabel = new JLabel();
		picturesTakenOfLabel.setBounds(5, 6, 165, 15);
		picturesTakenOfLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		picturesTakenOfLabel.setText("Pictures taken of each wound");
		panel_5_11_15_7.add(picturesTakenOfLabel);

		final JPanel panel_5_11_15_8 = new JPanel();
		panel_5_11_15_8.setLayout(null);
		panel_5_11_15_8.setBackground(Color.WHITE);
		panel_5_11_15_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_11_15_8.setBounds(0, 1054, 495, 32);
		panel_4.add(panel_5_11_15_8);

		final JLabel vsHtAndLabel = new JLabel();
		vsHtAndLabel.setBounds(5, 6, 415, 15);
		vsHtAndLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		vsHtAndLabel
				.setText("VS, Ht and Wt documented in approprtate areas in cnart... VS record, H&P");
		panel_5_11_15_8.add(vsHtAndLabel);

		final JPanel panel_5_11_15_9 = new JPanel();
		panel_5_11_15_9.setLayout(null);
		panel_5_11_15_9.setBackground(Color.WHITE);
		panel_5_11_15_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_11_15_9.setBounds(0, 1085, 495, 32);
		panel_4.add(panel_5_11_15_9);

		final JLabel valuablesRecordIsLabel = new JLabel();
		valuablesRecordIsLabel.setBounds(5, 6, 162, 15);
		valuablesRecordIsLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		valuablesRecordIsLabel.setText("Valuables record is completed");
		panel_5_11_15_9.add(valuablesRecordIsLabel);

		final JPanel panel_5_11_15_10 = new JPanel();
		panel_5_11_15_10.setLayout(null);
		panel_5_11_15_10.setBackground(Color.WHITE);
		panel_5_11_15_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_11_15_10.setBounds(0, 1116, 495, 32);
		panel_4.add(panel_5_11_15_10);

		final JLabel armBandAppliedLabel = new JLabel();
		armBandAppliedLabel.setBounds(5, 6, 189, 15);
		armBandAppliedLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		armBandAppliedLabel.setText("Arm band applied to resident wrist");
		panel_5_11_15_10.add(armBandAppliedLabel);

		final JPanel panel_5_11_15_11 = new JPanel();
		panel_5_11_15_11.setLayout(null);
		panel_5_11_15_11.setBackground(Color.WHITE);
		panel_5_11_15_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_11_15_11.setBounds(0, 1147, 495, 32);
		panel_4.add(panel_5_11_15_11);

		final JLabel hospitalArmBandLabel = new JLabel();
		hospitalArmBandLabel.setBounds(5, 6, 149, 15);
		hospitalArmBandLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		hospitalArmBandLabel.setText("Hospital arm band removed");
		panel_5_11_15_11.add(hospitalArmBandLabel);

		final JPanel panel_5_11_15_12 = new JPanel();
		panel_5_11_15_12.setLayout(null);
		panel_5_11_15_12.setBackground(Color.WHITE);
		panel_5_11_15_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_11_15_12.setBounds(0, 1178, 495, 32);
		panel_4.add(panel_5_11_15_12);

		final JLabel carePlanInitiatedLabel = new JLabel();
		carePlanInitiatedLabel.setBounds(5, 6, 462, 15);
		carePlanInitiatedLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		carePlanInitiatedLabel
				.setText("Care Plan initiated with interim entries... wounds, TF, dialysis safeyy precautions, etc");
		panel_5_11_15_12.add(carePlanInitiatedLabel);

		final JPanel panel_5_11_15_12_1 = new JPanel();
		panel_5_11_15_12_1.setLayout(null);
		panel_5_11_15_12_1.setBackground(Color.WHITE);
		panel_5_11_15_12_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_11_15_12_1.setBounds(0, 1209, 495, 32);
		panel_4.add(panel_5_11_15_12_1);

		final JLabel chartIsInLabel = new JLabel();
		chartIsInLabel.setBounds(5, 6, 129, 15);
		chartIsInLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chartIsInLabel.setText("Chart is in correct order");
		panel_5_11_15_12_1.add(chartIsInLabel);

		final JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setBounds(0, 1, 495, 32);
		panel_3.add(panel_6);

		final JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_7.setLayout(null);
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setBounds(494, 1, 135, 1272);
		panel_3.add(panel_7);

		final JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setBounds(0, 0, 135, 32);
		panel_7.add(panel_8);

		final JLabel admittingNurseLabel = new JLabel();
		admittingNurseLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		admittingNurseLabel.setText("Admitting Nurse");
		panel_8.add(admittingNurseLabel);

		final JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setBounds(0, 31, 135, 32);
		panel_7.add(panel_9);

		cbAdmittingNurse1 = new JCheckBox();
		cbAdmittingNurse1.setBackground(Color.WHITE);
		cbAdmittingNurse1.setText("");
		panel_9.add(cbAdmittingNurse1);

		final JPanel panel_9_1 = new JPanel();
		panel_9_1.setBackground(Color.WHITE);
		panel_9_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1.setBounds(0, 62, 135, 32);
		panel_7.add(panel_9_1);

		cbAdmittingNurse2 = new JCheckBox();
		cbAdmittingNurse2.setBackground(Color.WHITE);
		cbAdmittingNurse2.setText("");
		panel_9_1.add(cbAdmittingNurse2);

		final JPanel panel_9_2 = new JPanel();
		panel_9_2.setBackground(Color.WHITE);
		panel_9_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2.setBounds(0, 93, 135, 32);
		panel_7.add(panel_9_2);

		cbAdmittingNurse3 = new JCheckBox();
		cbAdmittingNurse3.setBackground(Color.WHITE);
		cbAdmittingNurse3.setText("");
		panel_9_2.add(cbAdmittingNurse3);

		final JPanel panel_9_3 = new JPanel();
		panel_9_3.setBackground(Color.WHITE);
		panel_9_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3.setBounds(0, 124, 135, 32);
		panel_7.add(panel_9_3);

		cbAdmittingNurse4 = new JCheckBox();
		cbAdmittingNurse4.setBackground(Color.WHITE);
		cbAdmittingNurse4.setText("");
		panel_9_3.add(cbAdmittingNurse4);

		final JPanel panel_9_4 = new JPanel();
		panel_9_4.setBackground(Color.WHITE);
		panel_9_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4.setBounds(0, 155, 135, 32);
		panel_7.add(panel_9_4);

		cbAdmittingNurse5 = new JCheckBox();
		cbAdmittingNurse5.setBackground(Color.WHITE);
		cbAdmittingNurse5.setText("");
		panel_9_4.add(cbAdmittingNurse5);

		final JPanel panel_9_5 = new JPanel();
		panel_9_5.setBackground(Color.WHITE);
		panel_9_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5.setBounds(0, 186, 135, 32);
		panel_7.add(panel_9_5);

		cbAdmittingNurse6 = new JCheckBox();
		cbAdmittingNurse6.setBackground(Color.WHITE);
		cbAdmittingNurse6.setText("");
		panel_9_5.add(cbAdmittingNurse6);

		final JPanel panel_9_6 = new JPanel();
		panel_9_6.setBackground(Color.WHITE);
		panel_9_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_6.setBounds(0, 217, 135, 32);
		panel_7.add(panel_9_6);

		cbAdmittingNurse7 = new JCheckBox();
		cbAdmittingNurse7.setBackground(Color.WHITE);
		cbAdmittingNurse7.setText("");
		panel_9_6.add(cbAdmittingNurse7);

		final JPanel panel_9_7 = new JPanel();
		panel_9_7.setBackground(Color.WHITE);
		panel_9_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_7.setBounds(0, 248, 135, 32);
		panel_7.add(panel_9_7);

		cbAdmittingNurse8 = new JCheckBox();
		cbAdmittingNurse8.setBackground(Color.WHITE);
		cbAdmittingNurse8.setText("");
		panel_9_7.add(cbAdmittingNurse8);

		final JPanel panel_9_8 = new JPanel();
		panel_9_8.setBackground(Color.WHITE);
		panel_9_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_8.setBounds(0, 279, 135, 32);
		panel_7.add(panel_9_8);

		cbAdmittingNurse9 = new JCheckBox();
		cbAdmittingNurse9.setBackground(Color.WHITE);
		cbAdmittingNurse9.setText("");
		panel_9_8.add(cbAdmittingNurse9);

		final JPanel panel_9_9 = new JPanel();
		panel_9_9.setBackground(Color.WHITE);
		panel_9_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_9.setBounds(0, 310, 135, 32);
		panel_7.add(panel_9_9);

		cbAdmittingNurse10 = new JCheckBox();
		cbAdmittingNurse10.setBackground(Color.WHITE);
		cbAdmittingNurse10.setText("");
		panel_9_9.add(cbAdmittingNurse10);

		final JPanel panel_9_10 = new JPanel();
		panel_9_10.setBackground(Color.WHITE);
		panel_9_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_10.setBounds(0, 341, 135, 32);
		panel_7.add(panel_9_10);

		cbAdmittingNurse11 = new JCheckBox();
		cbAdmittingNurse11.setBackground(Color.WHITE);
		cbAdmittingNurse11.setText("");
		panel_9_10.add(cbAdmittingNurse11);

		final JPanel panel_9_11 = new JPanel();
		panel_9_11.setBackground(Color.WHITE);
		panel_9_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_11.setBounds(0, 372, 135, 32);
		panel_7.add(panel_9_11);

		cbAdmittingNurse12 = new JCheckBox();
		cbAdmittingNurse12.setBackground(Color.WHITE);
		cbAdmittingNurse12.setText("");
		panel_9_11.add(cbAdmittingNurse12);

		final JPanel panel_9_12 = new JPanel();
		panel_9_12.setBackground(Color.WHITE);
		panel_9_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_12.setBounds(0, 403, 135, 32);
		panel_7.add(panel_9_12);

		cbAdmittingNurse13 = new JCheckBox();
		cbAdmittingNurse13.setBackground(Color.WHITE);
		cbAdmittingNurse13.setText("");
		panel_9_12.add(cbAdmittingNurse13);

		final JPanel panel_9_13 = new JPanel();
		panel_9_13.setBackground(Color.WHITE);
		panel_9_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_13.setBounds(0, 434, 135, 32);
		panel_7.add(panel_9_13);

		cbAdmittingNurse14 = new JCheckBox();
		cbAdmittingNurse14.setBackground(Color.WHITE);
		cbAdmittingNurse14.setText("");
		panel_9_13.add(cbAdmittingNurse14);

		final JPanel panel_9_14 = new JPanel();
		panel_9_14.setBackground(Color.WHITE);
		panel_9_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_14.setBounds(0, 465, 135, 32);
		panel_7.add(panel_9_14);

		cbAdmittingNurse15 = new JCheckBox();
		cbAdmittingNurse15.setBackground(Color.WHITE);
		cbAdmittingNurse15.setText("");
		panel_9_14.add(cbAdmittingNurse15);

		final JPanel panel_9_15 = new JPanel();
		panel_9_15.setBackground(Color.WHITE);
		panel_9_15.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_15.setBounds(0, 496, 135, 32);
		panel_7.add(panel_9_15);

		cbAdmittingNurse16 = new JCheckBox();
		cbAdmittingNurse16.setBackground(Color.WHITE);
		cbAdmittingNurse16.setText("");
		panel_9_15.add(cbAdmittingNurse16);

		final JPanel panel_9_16 = new JPanel();
		panel_9_16.setBackground(Color.WHITE);
		panel_9_16.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_16.setBounds(0, 527, 135, 32);
		panel_7.add(panel_9_16);

		cbAdmittingNurse17 = new JCheckBox();
		cbAdmittingNurse17.setBackground(Color.WHITE);
		cbAdmittingNurse17.setText("");
		panel_9_16.add(cbAdmittingNurse17);

		final JPanel panel_9_17 = new JPanel();
		panel_9_17.setBackground(Color.WHITE);
		panel_9_17.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_17.setBounds(0, 558, 135, 32);
		panel_7.add(panel_9_17);

		cbAdmittingNurse18 = new JCheckBox();
		cbAdmittingNurse18.setBackground(Color.WHITE);
		cbAdmittingNurse18.setText("");
		panel_9_17.add(cbAdmittingNurse18);

		final JPanel panel_9_18 = new JPanel();
		panel_9_18.setBackground(Color.WHITE);
		panel_9_18.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_18.setBounds(0, 589, 135, 32);
		panel_7.add(panel_9_18);

		cbAdmittingNurse19 = new JCheckBox();
		cbAdmittingNurse19.setBackground(Color.WHITE);
		cbAdmittingNurse19.setText("");
		panel_9_18.add(cbAdmittingNurse19);

		final JPanel panel_9_19 = new JPanel();
		panel_9_19.setBackground(Color.WHITE);
		panel_9_19.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_19.setBounds(0, 620, 135, 32);
		panel_7.add(panel_9_19);

		cbAdmittingNurse20 = new JCheckBox();
		cbAdmittingNurse20.setBackground(Color.WHITE);
		cbAdmittingNurse20.setText("");
		panel_9_19.add(cbAdmittingNurse20);

		final JPanel panel_9_20 = new JPanel();
		panel_9_20.setBackground(Color.WHITE);
		panel_9_20.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_20.setBounds(0, 651, 135, 32);
		panel_7.add(panel_9_20);

		cbAdmittingNurse21 = new JCheckBox();
		cbAdmittingNurse21.setBackground(Color.WHITE);
		cbAdmittingNurse21.setText("");
		panel_9_20.add(cbAdmittingNurse21);

		final JPanel panel_9_21 = new JPanel();
		panel_9_21.setBackground(Color.WHITE);
		panel_9_21.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_21.setBounds(0, 682, 135, 32);
		panel_7.add(panel_9_21);

		cbAdmittingNurse22 = new JCheckBox();
		cbAdmittingNurse22.setBackground(Color.WHITE);
		cbAdmittingNurse22.setText("");
		panel_9_21.add(cbAdmittingNurse22);

		final JPanel panel_9_22 = new JPanel();
		panel_9_22.setBackground(Color.WHITE);
		panel_9_22.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_22.setBounds(0, 713, 135, 32);
		panel_7.add(panel_9_22);

		cbAdmittingNurse23 = new JCheckBox();
		cbAdmittingNurse23.setBackground(Color.WHITE);
		cbAdmittingNurse23.setText("");
		panel_9_22.add(cbAdmittingNurse23);

		final JPanel panel_9_23 = new JPanel();
		panel_9_23.setBackground(Color.WHITE);
		panel_9_23.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_23.setBounds(0, 744, 135, 32);
		panel_7.add(panel_9_23);

		cbAdmittingNurse24 = new JCheckBox();
		cbAdmittingNurse24.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
			}
		});
		cbAdmittingNurse24.setBackground(Color.WHITE);
		cbAdmittingNurse24.setText("");
		panel_9_23.add(cbAdmittingNurse24);

		final JPanel panel_9_24 = new JPanel();
		panel_9_24.setBackground(Color.WHITE);
		panel_9_24.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_24.setBounds(0, 775, 135, 32);
		panel_7.add(panel_9_24);

		cbAdmittingNurse25 = new JCheckBox();
		cbAdmittingNurse25.setBackground(Color.WHITE);
		cbAdmittingNurse25.setText("");
		panel_9_24.add(cbAdmittingNurse25);

		final JPanel panel_9_25 = new JPanel();
		panel_9_25.setBackground(Color.WHITE);
		panel_9_25.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_25.setBounds(0, 806, 135, 32);
		panel_7.add(panel_9_25);

		cbAdmittingNurse26 = new JCheckBox();
		cbAdmittingNurse26.setBackground(Color.WHITE);
		cbAdmittingNurse26.setText("");
		panel_9_25.add(cbAdmittingNurse26);

		final JPanel panel_9_26 = new JPanel();
		panel_9_26.setBackground(Color.WHITE);
		panel_9_26.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_26.setBounds(0, 837, 135, 32);
		panel_7.add(panel_9_26);

		cbAdmittingNurse27 = new JCheckBox();
		cbAdmittingNurse27.setBackground(Color.WHITE);
		cbAdmittingNurse27.setText("");
		panel_9_26.add(cbAdmittingNurse27);

		final JPanel panel_9_27 = new JPanel();
		panel_9_27.setBackground(Color.WHITE);
		panel_9_27.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_27.setBounds(0, 868, 135, 32);
		panel_7.add(panel_9_27);

		cbAdmittingNurse28 = new JCheckBox();
		cbAdmittingNurse28.setBackground(Color.WHITE);
		cbAdmittingNurse28.setText("");
		panel_9_27.add(cbAdmittingNurse28);

		final JPanel panel_9_28 = new JPanel();
		panel_9_28.setBackground(Color.WHITE);
		panel_9_28.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_28.setBounds(0, 899, 135, 32);
		panel_7.add(panel_9_28);

		cbAdmittingNurse29 = new JCheckBox();
		cbAdmittingNurse29.setBackground(Color.WHITE);
		cbAdmittingNurse29.setText("");
		panel_9_28.add(cbAdmittingNurse29);

		final JPanel panel_9_29 = new JPanel();
		panel_9_29.setBackground(Color.WHITE);
		panel_9_29.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_29.setBounds(0, 930, 135, 32);
		panel_7.add(panel_9_29);

		cbAdmittingNurse30 = new JCheckBox();
		cbAdmittingNurse30.setBackground(Color.WHITE);
		cbAdmittingNurse30.setText("");
		panel_9_29.add(cbAdmittingNurse30);

		final JPanel panel_9_30 = new JPanel();
		panel_9_30.setBackground(Color.WHITE);
		panel_9_30.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_30.setBounds(0, 961, 135, 32);
		panel_7.add(panel_9_30);

		cbAdmittingNurse31 = new JCheckBox();
		cbAdmittingNurse31.setBackground(Color.WHITE);
		cbAdmittingNurse31.setText("");
		panel_9_30.add(cbAdmittingNurse31);

		final JPanel panel_9_31 = new JPanel();
		panel_9_31.setBackground(Color.WHITE);
		panel_9_31.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_31.setBounds(0, 992, 135, 32);
		panel_7.add(panel_9_31);

		cbAdmittingNurse32 = new JCheckBox();
		cbAdmittingNurse32.setBackground(Color.WHITE);
		cbAdmittingNurse32.setText("");
		panel_9_31.add(cbAdmittingNurse32);

		final JPanel panel_9_32 = new JPanel();
		panel_9_32.setBackground(Color.WHITE);
		panel_9_32.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_32.setBounds(0, 1023, 135, 32);
		panel_7.add(panel_9_32);

		cbAdmittingNurse33 = new JCheckBox();
		cbAdmittingNurse33.setBackground(Color.WHITE);
		cbAdmittingNurse33.setText("");
		panel_9_32.add(cbAdmittingNurse33);

		final JPanel panel_9_33 = new JPanel();
		panel_9_33.setBackground(Color.WHITE);
		panel_9_33.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_33.setBounds(0, 1054, 135, 32);
		panel_7.add(panel_9_33);

		cbAdmittingNurse34 = new JCheckBox();
		cbAdmittingNurse34.setBackground(Color.WHITE);
		cbAdmittingNurse34.setText("");
		panel_9_33.add(cbAdmittingNurse34);

		final JPanel panel_9_34 = new JPanel();
		panel_9_34.setBackground(Color.WHITE);
		panel_9_34.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_34.setBounds(0, 1085, 135, 32);
		panel_7.add(panel_9_34);

		cbAdmittingNurse35 = new JCheckBox();
		cbAdmittingNurse35.setBackground(Color.WHITE);
		cbAdmittingNurse35.setText("");
		panel_9_34.add(cbAdmittingNurse35);

		final JPanel panel_9_35 = new JPanel();
		panel_9_35.setBackground(Color.WHITE);
		panel_9_35.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_35.setBounds(0, 1116, 135, 32);
		panel_7.add(panel_9_35);

		cbAdmittingNurse36 = new JCheckBox();
		cbAdmittingNurse36.setBackground(Color.WHITE);
		cbAdmittingNurse36.setText("");
		panel_9_35.add(cbAdmittingNurse36);

		final JPanel panel_9_36 = new JPanel();
		panel_9_36.setBackground(Color.WHITE);
		panel_9_36.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_36.setBounds(0, 1147, 135, 32);
		panel_7.add(panel_9_36);

		cbAdmittingNurse37 = new JCheckBox();
		cbAdmittingNurse37.setBackground(Color.WHITE);
		cbAdmittingNurse37.setText("");
		panel_9_36.add(cbAdmittingNurse37);

		final JPanel panel_9_37 = new JPanel();
		panel_9_37.setBackground(Color.WHITE);
		panel_9_37.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_37.setBounds(0, 1178, 135, 32);
		panel_7.add(panel_9_37);

		cbAdmittingNurse38 = new JCheckBox();
		cbAdmittingNurse38.setBackground(Color.WHITE);
		cbAdmittingNurse38.setText("");
		panel_9_37.add(cbAdmittingNurse38);

		final JPanel panel_9_38 = new JPanel();
		panel_9_38.setBackground(Color.WHITE);
		panel_9_38.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_38.setBounds(0, 1209, 135, 32);
		panel_7.add(panel_9_38);

		cbAdmittingNurse39 = new JCheckBox();
		cbAdmittingNurse39.setBackground(Color.WHITE);
		cbAdmittingNurse39.setText("");
		panel_9_38.add(cbAdmittingNurse39);

		final JPanel panel_9_39 = new JPanel();
		panel_9_39.setBackground(Color.WHITE);
		panel_9_39.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_39.setBounds(0, 1240, 135, 32);
		panel_7.add(panel_9_39);

		cbAdmittingNurse40 = new JCheckBox();
		cbAdmittingNurse40.setBackground(Color.WHITE);
		cbAdmittingNurse40.setText("");
		panel_9_39.add(cbAdmittingNurse40);

		final JPanel panel_7_1 = new JPanel();
		panel_7_1.setBackground(Color.WHITE);
		panel_7_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1.setLayout(null);
		panel_7_1.setBounds(628, 1, 135, 1272);
		panel_3.add(panel_7_1);

		final JPanel panel_8_1 = new JPanel();
		panel_8_1.setBackground(Color.WHITE);
		panel_8_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1.setBounds(0, 0, 135, 32);
		panel_7_1.add(panel_8_1);

		final JLabel admittingNurseLabel_1 = new JLabel();
		admittingNurseLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		admittingNurseLabel_1.setText("Supervisor");
		panel_8_1.add(admittingNurseLabel_1);

		final JPanel panel_9_40 = new JPanel();
		panel_9_40.setBackground(Color.WHITE);
		panel_9_40.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_40.setBounds(0, 31, 135, 32);
		panel_7_1.add(panel_9_40);

		cbSuperVisor1 = new JCheckBox();
		cbSuperVisor1.setBackground(Color.WHITE);
		cbSuperVisor1.setText("");
		panel_9_40.add(cbSuperVisor1);

		final JPanel panel_9_1_1 = new JPanel();
		panel_9_1_1.setBackground(Color.WHITE);
		panel_9_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1.setBounds(0, 62, 135, 32);
		panel_7_1.add(panel_9_1_1);

		cbSuperVisor2 = new JCheckBox();
		cbSuperVisor2.setBackground(Color.WHITE);
		cbSuperVisor2.setText("");
		panel_9_1_1.add(cbSuperVisor2);

		final JPanel panel_9_2_1 = new JPanel();
		panel_9_2_1.setBackground(Color.WHITE);
		panel_9_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1.setBounds(0, 93, 135, 32);
		panel_7_1.add(panel_9_2_1);

		cbSuperVisor3 = new JCheckBox();
		cbSuperVisor3.setBackground(Color.WHITE);
		cbSuperVisor3.setText("");
		panel_9_2_1.add(cbSuperVisor3);

		final JPanel panel_9_3_1 = new JPanel();
		panel_9_3_1.setBackground(Color.WHITE);
		panel_9_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1.setBounds(0, 124, 135, 32);
		panel_7_1.add(panel_9_3_1);

		cbSuperVisor4 = new JCheckBox();
		cbSuperVisor4.setBackground(Color.WHITE);
		cbSuperVisor4.setText("");
		panel_9_3_1.add(cbSuperVisor4);

		final JPanel panel_9_4_1 = new JPanel();
		panel_9_4_1.setBackground(Color.WHITE);
		panel_9_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_1.setBounds(0, 155, 135, 32);
		panel_7_1.add(panel_9_4_1);

		cbSuperVisor5 = new JCheckBox();
		cbSuperVisor5.setBackground(Color.WHITE);
		cbSuperVisor5.setText("");
		panel_9_4_1.add(cbSuperVisor5);

		final JPanel panel_9_5_1 = new JPanel();
		panel_9_5_1.setBackground(Color.WHITE);
		panel_9_5_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_1.setBounds(0, 186, 135, 32);
		panel_7_1.add(panel_9_5_1);

		cbSuperVisor6 = new JCheckBox();
		cbSuperVisor6.setBackground(Color.WHITE);
		cbSuperVisor6.setText("");
		panel_9_5_1.add(cbSuperVisor6);

		final JPanel panel_9_6_1 = new JPanel();
		panel_9_6_1.setBackground(Color.WHITE);
		panel_9_6_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_6_1.setBounds(0, 217, 135, 32);
		panel_7_1.add(panel_9_6_1);

		cbSuperVisor7 = new JCheckBox();
		cbSuperVisor7.setBackground(Color.WHITE);
		cbSuperVisor7.setText("");
		panel_9_6_1.add(cbSuperVisor7);

		final JPanel panel_9_7_1 = new JPanel();
		panel_9_7_1.setBackground(Color.WHITE);
		panel_9_7_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_7_1.setBounds(0, 248, 135, 32);
		panel_7_1.add(panel_9_7_1);

		cbSuperVisor8 = new JCheckBox();
		cbSuperVisor8.setBackground(Color.WHITE);
		cbSuperVisor8.setText("");
		panel_9_7_1.add(cbSuperVisor8);

		final JPanel panel_9_8_1 = new JPanel();
		panel_9_8_1.setBackground(Color.WHITE);
		panel_9_8_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_8_1.setBounds(0, 279, 135, 32);
		panel_7_1.add(panel_9_8_1);

		cbSuperVisor9 = new JCheckBox();
		cbSuperVisor9.setBackground(Color.WHITE);
		cbSuperVisor9.setText("");
		panel_9_8_1.add(cbSuperVisor9);

		final JPanel panel_9_9_1 = new JPanel();
		panel_9_9_1.setBackground(Color.WHITE);
		panel_9_9_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_9_1.setBounds(0, 310, 135, 32);
		panel_7_1.add(panel_9_9_1);

		cbSuperVisor10 = new JCheckBox();
		cbSuperVisor10.setBackground(Color.WHITE);
		cbSuperVisor10.setText("");
		panel_9_9_1.add(cbSuperVisor10);

		final JPanel panel_9_10_1 = new JPanel();
		panel_9_10_1.setBackground(Color.WHITE);
		panel_9_10_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_10_1.setBounds(0, 341, 135, 32);
		panel_7_1.add(panel_9_10_1);

		cbSuperVisor11 = new JCheckBox();
		cbSuperVisor11.setBackground(Color.WHITE);
		cbSuperVisor11.setText("");
		panel_9_10_1.add(cbSuperVisor11);

		final JPanel panel_9_11_1 = new JPanel();
		panel_9_11_1.setBackground(Color.WHITE);
		panel_9_11_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_11_1.setBounds(0, 372, 135, 32);
		panel_7_1.add(panel_9_11_1);

		cbSuperVisor12 = new JCheckBox();
		cbSuperVisor12.setBackground(Color.WHITE);
		cbSuperVisor12.setText("");
		panel_9_11_1.add(cbSuperVisor12);

		final JPanel panel_9_12_1 = new JPanel();
		panel_9_12_1.setBackground(Color.WHITE);
		panel_9_12_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_12_1.setBounds(0, 403, 135, 32);
		panel_7_1.add(panel_9_12_1);

		cbSuperVisor13 = new JCheckBox();
		cbSuperVisor13.setBackground(Color.WHITE);
		cbSuperVisor13.setText("");
		panel_9_12_1.add(cbSuperVisor13);

		final JPanel panel_9_13_1 = new JPanel();
		panel_9_13_1.setBackground(Color.WHITE);
		panel_9_13_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_13_1.setBounds(0, 434, 135, 32);
		panel_7_1.add(panel_9_13_1);

		cbSuperVisor14 = new JCheckBox();
		cbSuperVisor14.setBackground(Color.WHITE);
		cbSuperVisor14.setText("");
		panel_9_13_1.add(cbSuperVisor14);

		final JPanel panel_9_14_1 = new JPanel();
		panel_9_14_1.setBackground(Color.WHITE);
		panel_9_14_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_14_1.setBounds(0, 465, 135, 32);
		panel_7_1.add(panel_9_14_1);

		cbSuperVisor15 = new JCheckBox();
		cbSuperVisor15.setBackground(Color.WHITE);
		cbSuperVisor15.setText("");
		panel_9_14_1.add(cbSuperVisor15);

		final JPanel panel_9_15_1 = new JPanel();
		panel_9_15_1.setBackground(Color.WHITE);
		panel_9_15_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_15_1.setBounds(0, 496, 135, 32);
		panel_7_1.add(panel_9_15_1);

		cbSuperVisor16 = new JCheckBox();
		cbSuperVisor16.setBackground(Color.WHITE);
		cbSuperVisor16.setText("");
		panel_9_15_1.add(cbSuperVisor16);

		final JPanel panel_9_16_1 = new JPanel();
		panel_9_16_1.setBackground(Color.WHITE);
		panel_9_16_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_16_1.setBounds(0, 527, 135, 32);
		panel_7_1.add(panel_9_16_1);

		cbSuperVisor17 = new JCheckBox();
		cbSuperVisor17.setBackground(Color.WHITE);
		cbSuperVisor17.setText("");
		panel_9_16_1.add(cbSuperVisor17);

		final JPanel panel_9_17_1 = new JPanel();
		panel_9_17_1.setBackground(Color.WHITE);
		panel_9_17_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_17_1.setBounds(0, 558, 135, 32);
		panel_7_1.add(panel_9_17_1);

		cbSuperVisor18 = new JCheckBox();
		cbSuperVisor18.setBackground(Color.WHITE);
		cbSuperVisor18.setText("");
		panel_9_17_1.add(cbSuperVisor18);

		final JPanel panel_9_18_1 = new JPanel();
		panel_9_18_1.setBackground(Color.WHITE);
		panel_9_18_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_18_1.setBounds(0, 589, 135, 32);
		panel_7_1.add(panel_9_18_1);

		cbSuperVisor19 = new JCheckBox();
		cbSuperVisor19.setBackground(Color.WHITE);
		cbSuperVisor19.setText("");
		panel_9_18_1.add(cbSuperVisor19);

		final JPanel panel_9_19_1 = new JPanel();
		panel_9_19_1.setBackground(Color.WHITE);
		panel_9_19_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_19_1.setBounds(0, 620, 135, 32);
		panel_7_1.add(panel_9_19_1);

		cbSuperVisor20 = new JCheckBox();
		cbSuperVisor20.setBackground(Color.WHITE);
		cbSuperVisor20.setText("");
		panel_9_19_1.add(cbSuperVisor20);

		final JPanel panel_9_20_1 = new JPanel();
		panel_9_20_1.setBackground(Color.WHITE);
		panel_9_20_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_20_1.setBounds(0, 651, 135, 32);
		panel_7_1.add(panel_9_20_1);

		cbSuperVisor21 = new JCheckBox();
		cbSuperVisor21.setBackground(Color.WHITE);
		cbSuperVisor21.setText("");
		panel_9_20_1.add(cbSuperVisor21);

		final JPanel panel_9_21_1 = new JPanel();
		panel_9_21_1.setBackground(Color.WHITE);
		panel_9_21_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_21_1.setBounds(0, 682, 135, 32);
		panel_7_1.add(panel_9_21_1);

		cbSuperVisor22 = new JCheckBox();
		cbSuperVisor22.setBackground(Color.WHITE);
		cbSuperVisor22.setText("");
		panel_9_21_1.add(cbSuperVisor22);

		final JPanel panel_9_22_1 = new JPanel();
		panel_9_22_1.setBackground(Color.WHITE);
		panel_9_22_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_22_1.setBounds(0, 713, 135, 32);
		panel_7_1.add(panel_9_22_1);

		cbSuperVisor23 = new JCheckBox();
		cbSuperVisor23.setBackground(Color.WHITE);
		cbSuperVisor23.setText("");
		panel_9_22_1.add(cbSuperVisor23);

		final JPanel panel_9_23_1 = new JPanel();
		panel_9_23_1.setBackground(Color.WHITE);
		panel_9_23_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_23_1.setBounds(0, 744, 135, 32);
		panel_7_1.add(panel_9_23_1);

		cbSuperVisor24 = new JCheckBox();
		cbSuperVisor24.setBackground(Color.WHITE);
		cbSuperVisor24.setText("");
		panel_9_23_1.add(cbSuperVisor24);

		final JPanel panel_9_24_1 = new JPanel();
		panel_9_24_1.setBackground(Color.WHITE);
		panel_9_24_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_24_1.setBounds(0, 775, 135, 32);
		panel_7_1.add(panel_9_24_1);

		cbSuperVisor25 = new JCheckBox();
		cbSuperVisor25.setBackground(Color.WHITE);
		cbSuperVisor25.setText("");
		panel_9_24_1.add(cbSuperVisor25);

		final JPanel panel_9_25_1 = new JPanel();
		panel_9_25_1.setBackground(Color.WHITE);
		panel_9_25_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_25_1.setBounds(0, 806, 135, 32);
		panel_7_1.add(panel_9_25_1);

		cbSuperVisor26 = new JCheckBox();
		cbSuperVisor26.setBackground(Color.WHITE);
		cbSuperVisor26.setText("");
		panel_9_25_1.add(cbSuperVisor26);

		final JPanel panel_9_26_1 = new JPanel();
		panel_9_26_1.setBackground(Color.WHITE);
		panel_9_26_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_26_1.setBounds(0, 837, 135, 32);
		panel_7_1.add(panel_9_26_1);

		cbSuperVisor27 = new JCheckBox();
		cbSuperVisor27.setBackground(Color.WHITE);
		cbSuperVisor27.setText("");
		panel_9_26_1.add(cbSuperVisor27);

		final JPanel panel_9_27_1 = new JPanel();
		panel_9_27_1.setBackground(Color.WHITE);
		panel_9_27_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_27_1.setBounds(0, 868, 135, 32);
		panel_7_1.add(panel_9_27_1);

		cbSuperVisor28 = new JCheckBox();
		cbSuperVisor28.setBackground(Color.WHITE);
		cbSuperVisor28.setText("");
		panel_9_27_1.add(cbSuperVisor28);

		final JPanel panel_9_28_1 = new JPanel();
		panel_9_28_1.setBackground(Color.WHITE);
		panel_9_28_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_28_1.setBounds(0, 899, 135, 32);
		panel_7_1.add(panel_9_28_1);

		cbSuperVisor29 = new JCheckBox();
		cbSuperVisor29.setBackground(Color.WHITE);
		cbSuperVisor29.setText("");
		panel_9_28_1.add(cbSuperVisor29);

		final JPanel panel_9_29_1 = new JPanel();
		panel_9_29_1.setBackground(Color.WHITE);
		panel_9_29_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_29_1.setBounds(0, 930, 135, 32);
		panel_7_1.add(panel_9_29_1);

		cbSuperVisor30 = new JCheckBox();
		cbSuperVisor30.setBackground(Color.WHITE);
		cbSuperVisor30.setText("");
		panel_9_29_1.add(cbSuperVisor30);

		final JPanel panel_9_30_1 = new JPanel();
		panel_9_30_1.setBackground(Color.WHITE);
		panel_9_30_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_30_1.setBounds(0, 961, 135, 32);
		panel_7_1.add(panel_9_30_1);

		cbSuperVisor31 = new JCheckBox();
		cbSuperVisor31.setBackground(Color.WHITE);
		cbSuperVisor31.setText("");
		panel_9_30_1.add(cbSuperVisor31);

		final JPanel panel_9_31_1 = new JPanel();
		panel_9_31_1.setBackground(Color.WHITE);
		panel_9_31_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_31_1.setBounds(0, 992, 135, 32);
		panel_7_1.add(panel_9_31_1);

		cbSuperVisor32 = new JCheckBox();
		cbSuperVisor32.setBackground(Color.WHITE);
		cbSuperVisor32.setText("");
		panel_9_31_1.add(cbSuperVisor32);

		final JPanel panel_9_32_1 = new JPanel();
		panel_9_32_1.setBackground(Color.WHITE);
		panel_9_32_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_32_1.setBounds(0, 1023, 135, 32);
		panel_7_1.add(panel_9_32_1);

		cbSuperVisor33 = new JCheckBox();
		cbSuperVisor33.setBackground(Color.WHITE);
		cbSuperVisor33.setText("");
		panel_9_32_1.add(cbSuperVisor33);

		final JPanel panel_9_33_1 = new JPanel();
		panel_9_33_1.setBackground(Color.WHITE);
		panel_9_33_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_33_1.setBounds(0, 1054, 135, 32);
		panel_7_1.add(panel_9_33_1);

		cbSuperVisor34 = new JCheckBox();
		cbSuperVisor34.setBackground(Color.WHITE);
		cbSuperVisor34.setText("");
		panel_9_33_1.add(cbSuperVisor34);

		final JPanel panel_9_34_1 = new JPanel();
		panel_9_34_1.setBackground(Color.WHITE);
		panel_9_34_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_34_1.setBounds(0, 1085, 135, 32);
		panel_7_1.add(panel_9_34_1);

		cbSuperVisor35 = new JCheckBox();
		cbSuperVisor35.setBackground(Color.WHITE);
		cbSuperVisor35.setText("");
		panel_9_34_1.add(cbSuperVisor35);

		final JPanel panel_9_35_1 = new JPanel();
		panel_9_35_1.setBackground(Color.WHITE);
		panel_9_35_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_35_1.setBounds(0, 1116, 135, 32);
		panel_7_1.add(panel_9_35_1);

		cbSuperVisor36 = new JCheckBox();
		cbSuperVisor36.setBackground(Color.WHITE);
		cbSuperVisor36.setText("");
		panel_9_35_1.add(cbSuperVisor36);

		final JPanel panel_9_36_1 = new JPanel();
		panel_9_36_1.setBackground(Color.WHITE);
		panel_9_36_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_36_1.setBounds(0, 1147, 135, 32);
		panel_7_1.add(panel_9_36_1);

		cbSuperVisor37 = new JCheckBox();
		cbSuperVisor37.setBackground(Color.WHITE);
		cbSuperVisor37.setText("");
		panel_9_36_1.add(cbSuperVisor37);

		final JPanel panel_9_37_1 = new JPanel();
		panel_9_37_1.setBackground(Color.WHITE);
		panel_9_37_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_37_1.setBounds(0, 1178, 135, 32);
		panel_7_1.add(panel_9_37_1);

		cbSuperVisor38 = new JCheckBox();
		cbSuperVisor38.setBackground(Color.WHITE);
		cbSuperVisor38.setText("");
		panel_9_37_1.add(cbSuperVisor38);

		final JPanel panel_9_38_1 = new JPanel();
		panel_9_38_1.setBackground(Color.WHITE);
		panel_9_38_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_38_1.setBounds(0, 1209, 135, 32);
		panel_7_1.add(panel_9_38_1);

		cbSuperVisor39 = new JCheckBox();
		cbSuperVisor39.setBackground(Color.WHITE);
		cbSuperVisor39.setText("");
		panel_9_38_1.add(cbSuperVisor39);

		final JPanel panel_9_39_1 = new JPanel();
		panel_9_39_1.setBackground(Color.WHITE);
		panel_9_39_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_39_1.setBounds(0, 1240, 135, 32);
		panel_7_1.add(panel_9_39_1);

		cbSuperVisor40 = new JCheckBox();
		cbSuperVisor40.setBackground(Color.WHITE);
		cbSuperVisor40.setText("");
		panel_9_39_1.add(cbSuperVisor40);

		final JPanel panel_7_1_1 = new JPanel();
		panel_7_1_1.setBackground(Color.WHITE);
		panel_7_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBounds(762, 1, 135, 1272);
		panel_3.add(panel_7_1_1);

		final JPanel panel_8_1_1 = new JPanel();
		panel_8_1_1.setBackground(Color.WHITE);
		panel_8_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1.setBounds(0, 0, 135, 32);
		panel_7_1_1.add(panel_8_1_1);

		final JLabel admittingNurseLabel_1_1 = new JLabel();
		admittingNurseLabel_1_1.setBackground(Color.WHITE);
		admittingNurseLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		admittingNurseLabel_1_1.setText("Nursing Office");
		panel_8_1_1.add(admittingNurseLabel_1_1);

		final JPanel panel_9_40_1 = new JPanel();
		panel_9_40_1.setBackground(Color.WHITE);
		panel_9_40_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_40_1.setBounds(0, 31, 135, 32);
		panel_7_1_1.add(panel_9_40_1);

		cbNursingOffice1 = new JCheckBox();
		cbNursingOffice1.setBackground(Color.WHITE);
		cbNursingOffice1.setText("");
		panel_9_40_1.add(cbNursingOffice1);

		final JPanel panel_9_1_1_1 = new JPanel();
		panel_9_1_1_1.setBackground(Color.WHITE);
		panel_9_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1.setBounds(0, 62, 135, 32);
		panel_7_1_1.add(panel_9_1_1_1);

		cbNursingOffice2 = new JCheckBox();
		cbNursingOffice2.setBackground(Color.WHITE);
		cbNursingOffice2.setText("");
		panel_9_1_1_1.add(cbNursingOffice2);

		final JPanel panel_9_2_1_1 = new JPanel();
		panel_9_2_1_1.setBackground(Color.WHITE);
		panel_9_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_1.setBounds(0, 93, 135, 32);
		panel_7_1_1.add(panel_9_2_1_1);

		cbNursingOffice3 = new JCheckBox();
		cbNursingOffice3.setBackground(Color.WHITE);
		cbNursingOffice3.setText("");
		panel_9_2_1_1.add(cbNursingOffice3);

		final JPanel panel_9_3_1_1 = new JPanel();
		panel_9_3_1_1.setBackground(Color.WHITE);
		panel_9_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_1.setBounds(0, 124, 135, 32);
		panel_7_1_1.add(panel_9_3_1_1);

		cbNursingOffice4 = new JCheckBox();
		cbNursingOffice4.setBackground(Color.WHITE);
		cbNursingOffice4.setText("");
		panel_9_3_1_1.add(cbNursingOffice4);

		final JPanel panel_9_4_1_1 = new JPanel();
		panel_9_4_1_1.setBackground(Color.WHITE);
		panel_9_4_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4_1_1.setBounds(0, 155, 135, 32);
		panel_7_1_1.add(panel_9_4_1_1);

		cbNursingOffice5 = new JCheckBox();
		cbNursingOffice5.setBackground(Color.WHITE);
		cbNursingOffice5.setText("");
		panel_9_4_1_1.add(cbNursingOffice5);

		final JPanel panel_9_5_1_1 = new JPanel();
		panel_9_5_1_1.setBackground(Color.WHITE);
		panel_9_5_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_5_1_1.setBounds(0, 186, 135, 32);
		panel_7_1_1.add(panel_9_5_1_1);

		cbNursingOffice6 = new JCheckBox();
		cbNursingOffice6.setBackground(Color.WHITE);
		cbNursingOffice6.setText("");
		panel_9_5_1_1.add(cbNursingOffice6);

		final JPanel panel_9_6_1_1 = new JPanel();
		panel_9_6_1_1.setBackground(Color.WHITE);
		panel_9_6_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_6_1_1.setBounds(0, 217, 135, 32);
		panel_7_1_1.add(panel_9_6_1_1);

		cbNursingOffice7 = new JCheckBox();
		cbNursingOffice7.setBackground(Color.WHITE);
		cbNursingOffice7.setText("");
		panel_9_6_1_1.add(cbNursingOffice7);

		final JPanel panel_9_7_1_1 = new JPanel();
		panel_9_7_1_1.setBackground(Color.WHITE);
		panel_9_7_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_7_1_1.setBounds(0, 248, 135, 32);
		panel_7_1_1.add(panel_9_7_1_1);

		cbNursingOffice8 = new JCheckBox();
		cbNursingOffice8.setBackground(Color.WHITE);
		cbNursingOffice8.setText("");
		panel_9_7_1_1.add(cbNursingOffice8);

		final JPanel panel_9_8_1_1 = new JPanel();
		panel_9_8_1_1.setBackground(Color.WHITE);
		panel_9_8_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_8_1_1.setBounds(0, 279, 135, 32);
		panel_7_1_1.add(panel_9_8_1_1);

		cbNursingOffice9 = new JCheckBox();
		cbNursingOffice9.setBackground(Color.WHITE);
		cbNursingOffice9.setText("");
		panel_9_8_1_1.add(cbNursingOffice9);

		final JPanel panel_9_9_1_1 = new JPanel();
		panel_9_9_1_1.setBackground(Color.WHITE);
		panel_9_9_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_9_1_1.setBounds(0, 310, 135, 32);
		panel_7_1_1.add(panel_9_9_1_1);

		cbnNrsingOffice10 = new JCheckBox();
		cbnNrsingOffice10.setBackground(Color.WHITE);
		cbnNrsingOffice10.setText("");
		panel_9_9_1_1.add(cbnNrsingOffice10);

		final JPanel panel_9_10_1_1 = new JPanel();
		panel_9_10_1_1.setBackground(Color.WHITE);
		panel_9_10_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_10_1_1.setBounds(0, 341, 135, 32);
		panel_7_1_1.add(panel_9_10_1_1);

		cbNursingOffice11 = new JCheckBox();
		cbNursingOffice11.setBackground(Color.WHITE);
		cbNursingOffice11.setText("");
		panel_9_10_1_1.add(cbNursingOffice11);

		final JPanel panel_9_11_1_1 = new JPanel();
		panel_9_11_1_1.setBackground(Color.WHITE);
		panel_9_11_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_11_1_1.setBounds(0, 372, 135, 32);
		panel_7_1_1.add(panel_9_11_1_1);

		cbNursingOffice12 = new JCheckBox();
		cbNursingOffice12.setBackground(Color.WHITE);
		cbNursingOffice12.setText("");
		panel_9_11_1_1.add(cbNursingOffice12);

		final JPanel panel_9_12_1_1 = new JPanel();
		panel_9_12_1_1.setBackground(Color.WHITE);
		panel_9_12_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_12_1_1.setBounds(0, 403, 135, 32);
		panel_7_1_1.add(panel_9_12_1_1);

		cbNursingOffice13 = new JCheckBox();
		cbNursingOffice13.setBackground(Color.WHITE);
		cbNursingOffice13.setText("");
		panel_9_12_1_1.add(cbNursingOffice13);

		final JPanel panel_9_13_1_1 = new JPanel();
		panel_9_13_1_1.setBackground(Color.WHITE);
		panel_9_13_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_13_1_1.setBounds(0, 434, 135, 32);
		panel_7_1_1.add(panel_9_13_1_1);

		cbNursingOffice14 = new JCheckBox();
		cbNursingOffice14.setBackground(Color.WHITE);
		cbNursingOffice14.setText("");
		panel_9_13_1_1.add(cbNursingOffice14);

		final JPanel panel_9_14_1_1 = new JPanel();
		panel_9_14_1_1.setBackground(Color.WHITE);
		panel_9_14_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_14_1_1.setBounds(0, 465, 135, 32);
		panel_7_1_1.add(panel_9_14_1_1);

		cbNursingOffice15 = new JCheckBox();
		cbNursingOffice15.setBackground(Color.WHITE);
		cbNursingOffice15.setText("");
		panel_9_14_1_1.add(cbNursingOffice15);

		final JPanel panel_9_15_1_1 = new JPanel();
		panel_9_15_1_1.setBackground(Color.WHITE);
		panel_9_15_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_15_1_1.setBounds(0, 496, 135, 32);
		panel_7_1_1.add(panel_9_15_1_1);

		cbNursingOffice16 = new JCheckBox();
		cbNursingOffice16.setBackground(Color.WHITE);
		cbNursingOffice16.setText("");
		panel_9_15_1_1.add(cbNursingOffice16);

		final JPanel panel_9_16_1_1 = new JPanel();
		panel_9_16_1_1.setBackground(Color.WHITE);
		panel_9_16_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_16_1_1.setBounds(0, 527, 135, 32);
		panel_7_1_1.add(panel_9_16_1_1);

		cbNursingOffice17 = new JCheckBox();
		cbNursingOffice17.setBackground(Color.WHITE);
		cbNursingOffice17.setText("");
		panel_9_16_1_1.add(cbNursingOffice17);

		final JPanel panel_9_17_1_1 = new JPanel();
		panel_9_17_1_1.setBackground(Color.WHITE);
		panel_9_17_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_17_1_1.setBounds(0, 558, 135, 32);
		panel_7_1_1.add(panel_9_17_1_1);

		cbNursingOffice18 = new JCheckBox();
		cbNursingOffice18.setBackground(Color.WHITE);
		cbNursingOffice18.setText("");
		panel_9_17_1_1.add(cbNursingOffice18);

		final JPanel panel_9_18_1_1 = new JPanel();
		panel_9_18_1_1.setBackground(Color.WHITE);
		panel_9_18_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_18_1_1.setBounds(0, 589, 135, 32);
		panel_7_1_1.add(panel_9_18_1_1);

		cbNursingOffice19 = new JCheckBox();
		cbNursingOffice19.setBackground(Color.WHITE);
		cbNursingOffice19.setText("");
		panel_9_18_1_1.add(cbNursingOffice19);

		final JPanel panel_9_19_1_1 = new JPanel();
		panel_9_19_1_1.setBackground(Color.WHITE);
		panel_9_19_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_19_1_1.setBounds(0, 620, 135, 32);
		panel_7_1_1.add(panel_9_19_1_1);

		cbNursingOffice20 = new JCheckBox();
		cbNursingOffice20.setBackground(Color.WHITE);
		cbNursingOffice20.setText("");
		panel_9_19_1_1.add(cbNursingOffice20);

		final JPanel panel_9_20_1_1 = new JPanel();
		panel_9_20_1_1.setBackground(Color.WHITE);
		panel_9_20_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_20_1_1.setBounds(0, 651, 135, 32);
		panel_7_1_1.add(panel_9_20_1_1);

		cbNursingOffice21 = new JCheckBox();
		cbNursingOffice21.setBackground(Color.WHITE);
		cbNursingOffice21.setText("");
		panel_9_20_1_1.add(cbNursingOffice21);

		final JPanel panel_9_21_1_1 = new JPanel();
		panel_9_21_1_1.setBackground(Color.WHITE);
		panel_9_21_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_21_1_1.setBounds(0, 682, 135, 32);
		panel_7_1_1.add(panel_9_21_1_1);

		cbNursingOffice22 = new JCheckBox();
		cbNursingOffice22.setBackground(Color.WHITE);
		cbNursingOffice22.setText("");
		panel_9_21_1_1.add(cbNursingOffice22);

		final JPanel panel_9_22_1_1 = new JPanel();
		panel_9_22_1_1.setBackground(Color.WHITE);
		panel_9_22_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_22_1_1.setBounds(0, 713, 135, 32);
		panel_7_1_1.add(panel_9_22_1_1);

		cbNursingOffice23 = new JCheckBox();
		cbNursingOffice23.setBackground(Color.WHITE);
		cbNursingOffice23.setText("");
		panel_9_22_1_1.add(cbNursingOffice23);

		final JPanel panel_9_23_1_1 = new JPanel();
		panel_9_23_1_1.setBackground(Color.WHITE);
		panel_9_23_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_23_1_1.setBounds(0, 744, 135, 32);
		panel_7_1_1.add(panel_9_23_1_1);

		cbNursingOffice24 = new JCheckBox();
		cbNursingOffice24.setBackground(Color.WHITE);
		cbNursingOffice24.setText("");
		panel_9_23_1_1.add(cbNursingOffice24);

		final JPanel panel_9_24_1_1 = new JPanel();
		panel_9_24_1_1.setBackground(Color.WHITE);
		panel_9_24_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_24_1_1.setBounds(0, 775, 135, 32);
		panel_7_1_1.add(panel_9_24_1_1);

		cbNursingOffice25 = new JCheckBox();
		cbNursingOffice25.setBackground(Color.WHITE);
		cbNursingOffice25.setText("");
		panel_9_24_1_1.add(cbNursingOffice25);

		final JPanel panel_9_25_1_1 = new JPanel();
		panel_9_25_1_1.setBackground(Color.WHITE);
		panel_9_25_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_25_1_1.setBounds(0, 806, 135, 32);
		panel_7_1_1.add(panel_9_25_1_1);

		cbNursingOffice26 = new JCheckBox();
		cbNursingOffice26.setBackground(Color.WHITE);
		cbNursingOffice26.setText("");
		panel_9_25_1_1.add(cbNursingOffice26);

		final JPanel panel_9_26_1_1 = new JPanel();
		panel_9_26_1_1.setBackground(Color.WHITE);
		panel_9_26_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_26_1_1.setBounds(0, 837, 135, 32);
		panel_7_1_1.add(panel_9_26_1_1);

		cbNursingOffice27 = new JCheckBox();
		cbNursingOffice27.setBackground(Color.WHITE);
		cbNursingOffice27.setText("");
		panel_9_26_1_1.add(cbNursingOffice27);

		final JPanel panel_9_27_1_1 = new JPanel();
		panel_9_27_1_1.setBackground(Color.WHITE);
		panel_9_27_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_27_1_1.setBounds(0, 868, 135, 32);
		panel_7_1_1.add(panel_9_27_1_1);

		cbNursingOffice28 = new JCheckBox();
		cbNursingOffice28.setBackground(Color.WHITE);
		cbNursingOffice28.setText("");
		panel_9_27_1_1.add(cbNursingOffice28);

		final JPanel panel_9_28_1_1 = new JPanel();
		panel_9_28_1_1.setBackground(Color.WHITE);
		panel_9_28_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_28_1_1.setBounds(0, 899, 135, 32);
		panel_7_1_1.add(panel_9_28_1_1);

		cbNursingOffice29 = new JCheckBox();
		cbNursingOffice29.setBackground(Color.WHITE);
		cbNursingOffice29.setText("");
		panel_9_28_1_1.add(cbNursingOffice29);

		final JPanel panel_9_29_1_1 = new JPanel();
		panel_9_29_1_1.setBackground(Color.WHITE);
		panel_9_29_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_29_1_1.setBounds(0, 930, 135, 32);
		panel_7_1_1.add(panel_9_29_1_1);

		cbNursingOffice30 = new JCheckBox();
		cbNursingOffice30.setBackground(Color.WHITE);
		cbNursingOffice30.setText("");
		panel_9_29_1_1.add(cbNursingOffice30);

		final JPanel panel_9_30_1_1 = new JPanel();
		panel_9_30_1_1.setBackground(Color.WHITE);
		panel_9_30_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_30_1_1.setBounds(0, 961, 135, 32);
		panel_7_1_1.add(panel_9_30_1_1);

		cbNursingOffice31 = new JCheckBox();
		cbNursingOffice31.setBackground(Color.WHITE);
		cbNursingOffice31.setText("");
		panel_9_30_1_1.add(cbNursingOffice31);

		final JPanel panel_9_31_1_1 = new JPanel();
		panel_9_31_1_1.setBackground(Color.WHITE);
		panel_9_31_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_31_1_1.setBounds(0, 992, 135, 32);
		panel_7_1_1.add(panel_9_31_1_1);

		cbNursingOffice32 = new JCheckBox();
		cbNursingOffice32.setBackground(Color.WHITE);
		cbNursingOffice32.setText("");
		panel_9_31_1_1.add(cbNursingOffice32);

		final JPanel panel_9_32_1_1 = new JPanel();
		panel_9_32_1_1.setBackground(Color.WHITE);
		panel_9_32_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_32_1_1.setBounds(0, 1023, 135, 32);
		panel_7_1_1.add(panel_9_32_1_1);

		cbNursingOffice33 = new JCheckBox();
		cbNursingOffice33.setBackground(Color.WHITE);
		cbNursingOffice33.setText("");
		panel_9_32_1_1.add(cbNursingOffice33);

		final JPanel panel_9_33_1_1 = new JPanel();
		panel_9_33_1_1.setBackground(Color.WHITE);
		panel_9_33_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_33_1_1.setBounds(0, 1054, 135, 32);
		panel_7_1_1.add(panel_9_33_1_1);

		cbNursingOffice34 = new JCheckBox();
		cbNursingOffice34.setBackground(Color.WHITE);
		cbNursingOffice34.setText("");
		panel_9_33_1_1.add(cbNursingOffice34);

		final JPanel panel_9_34_1_1 = new JPanel();
		panel_9_34_1_1.setBackground(Color.WHITE);
		panel_9_34_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_34_1_1.setBounds(0, 1085, 135, 32);
		panel_7_1_1.add(panel_9_34_1_1);

		cbNursingOffice35 = new JCheckBox();
		cbNursingOffice35.setBackground(Color.WHITE);
		cbNursingOffice35.setText("");
		panel_9_34_1_1.add(cbNursingOffice35);

		final JPanel panel_9_35_1_1 = new JPanel();
		panel_9_35_1_1.setBackground(Color.WHITE);
		panel_9_35_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_35_1_1.setBounds(0, 1116, 135, 32);
		panel_7_1_1.add(panel_9_35_1_1);

		cbNursingOffice36 = new JCheckBox();
		cbNursingOffice36.setBackground(Color.WHITE);
		cbNursingOffice36.setText("");
		panel_9_35_1_1.add(cbNursingOffice36);

		final JPanel panel_9_36_1_1 = new JPanel();
		panel_9_36_1_1.setBackground(Color.WHITE);
		panel_9_36_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_36_1_1.setBounds(0, 1147, 135, 32);
		panel_7_1_1.add(panel_9_36_1_1);

		cbNursingOffice37 = new JCheckBox();
		cbNursingOffice37.setBackground(Color.WHITE);
		cbNursingOffice37.setText("");
		panel_9_36_1_1.add(cbNursingOffice37);

		final JPanel panel_9_37_1_1 = new JPanel();
		panel_9_37_1_1.setBackground(Color.WHITE);
		panel_9_37_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_37_1_1.setBounds(0, 1178, 135, 32);
		panel_7_1_1.add(panel_9_37_1_1);

		cbNursingOffice38 = new JCheckBox();
		cbNursingOffice38.setBackground(Color.WHITE);
		cbNursingOffice38.setText("");
		panel_9_37_1_1.add(cbNursingOffice38);

		final JPanel panel_9_38_1_1 = new JPanel();
		panel_9_38_1_1.setBackground(Color.WHITE);
		panel_9_38_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_38_1_1.setBounds(0, 1209, 135, 32);
		panel_7_1_1.add(panel_9_38_1_1);

		cbNursingOffice39 = new JCheckBox();
		cbNursingOffice39.setBackground(Color.WHITE);
		cbNursingOffice39.setText("");
		panel_9_38_1_1.add(cbNursingOffice39);

		final JPanel panel_9_39_1_1 = new JPanel();
		panel_9_39_1_1.setBackground(Color.WHITE);
		panel_9_39_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_39_1_1.setBounds(0, 1240, 135, 32);
		panel_7_1_1.add(panel_9_39_1_1);

		cbNursingOffice40 = new JCheckBox();
		cbNursingOffice40.setBackground(Color.WHITE);
		cbNursingOffice40.setText("");
		panel_9_39_1_1.add(cbNursingOffice40);

		final JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		panel_10.setLayout(null);
		panel_10.setBounds(0, 1279, 897, 86);
		panel_3.add(panel_10);

		final JLabel noteLabel = new JLabel();
		noteLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		noteLabel.setText("NOTE:");
		noteLabel.setBounds(10, 10, 45, 16);
		panel_10.add(noteLabel);

		final JLabel admittingNurseMustLabel = new JLabel();
		admittingNurseMustLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		admittingNurseMustLabel.setVerticalAlignment(SwingConstants.TOP);
		admittingNurseMustLabel
				.setText("<html><p>Admitting nurse must assure all items are checked and correct Supervisor must double check to assure items are correct and chart is complete and Nurse Office must spot check to assure items are correct and chart is complete. Once spot checked by the Nursing Office form is removed from the chart and placed in the Nursing Office Quality Assurance files.</p></html>");
		admittingNurseMustLabel.setBounds(72, 10, 799, 53);
		panel_10.add(admittingNurseMustLabel);

		doLoad();

	}

	public void doLoad() {
		doUpdate();
	}

	public int doSave() {
		ResidentAssessmentFormPage18 refResidentAssessmentFormPage18 = new ResidentAssessmentFormPage18();
		refResidentAssessmentFormPage18
				.setSerial(Global.currentResidentAssessmentFormPage18Key);
		refResidentAssessmentFormPage18.setFormId(Global.currentMsjnKey);
		refResidentAssessmentFormPage18.setNursingOffice40(cbNursingOffice40
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice39(cbNursingOffice39
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice38(cbNursingOffice38
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice37(cbNursingOffice37
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice36(cbNursingOffice36
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice35(cbNursingOffice35
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice34(cbNursingOffice34
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice33(cbNursingOffice33
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice32(cbNursingOffice32
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice31(cbNursingOffice31
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice30(cbNursingOffice30
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice29(cbNursingOffice29
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice28(cbNursingOffice28
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice27(cbNursingOffice27
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice26(cbNursingOffice26
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice25(cbNursingOffice25
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice24(cbNursingOffice24
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice23(cbNursingOffice23
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice22(cbNursingOffice22
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice21(cbNursingOffice21
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice20(cbNursingOffice20
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice19(cbNursingOffice19
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice18(cbNursingOffice18
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice17(cbNursingOffice17
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice16(cbNursingOffice16
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice15(cbNursingOffice15
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice14(cbNursingOffice14
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice13(cbNursingOffice13
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice12(cbNursingOffice12
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice11(cbNursingOffice11
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice10(cbnNrsingOffice10
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice9(cbNursingOffice9
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice8(cbNursingOffice8
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice7(cbNursingOffice7
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice6(cbNursingOffice6
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice5(cbNursingOffice5
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice4(cbNursingOffice4
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice3(cbNursingOffice3
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice2(cbNursingOffice2
				.isSelected());
		refResidentAssessmentFormPage18.setNursingOffice1(cbNursingOffice1
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor40(cbSuperVisor40
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor39(cbSuperVisor39
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor38(cbSuperVisor38
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor37(cbSuperVisor37
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor36(cbSuperVisor36
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor35(cbSuperVisor35
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor34(cbSuperVisor34
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor33(cbSuperVisor33
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor32(cbSuperVisor32
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor31(cbSuperVisor31
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor30(cbSuperVisor30
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor29(cbSuperVisor29
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor28(cbSuperVisor28
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor27(cbSuperVisor27
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor26(cbSuperVisor26
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor25(cbSuperVisor25
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor24(cbSuperVisor24
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor23(cbSuperVisor23
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor22(cbSuperVisor22
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor21(cbSuperVisor21
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor20(cbSuperVisor20
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor19(cbSuperVisor19
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor18(cbSuperVisor18
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor17(cbSuperVisor17
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor16(cbSuperVisor16
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor15(cbSuperVisor15
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor14(cbSuperVisor14
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor13(cbSuperVisor13
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor12(cbSuperVisor12
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor11(cbSuperVisor11
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor10(cbSuperVisor10
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor9(cbSuperVisor9
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor8(cbSuperVisor8
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor7(cbSuperVisor7
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor6(cbSuperVisor6
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor5(cbSuperVisor5
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor4(cbSuperVisor4
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor3(cbSuperVisor3
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor2(cbSuperVisor2
				.isSelected());
		refResidentAssessmentFormPage18.setSuperVisor1(cbSuperVisor1
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse40(cbAdmittingNurse40
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse39(cbAdmittingNurse39
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse38(cbAdmittingNurse38
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse37(cbAdmittingNurse37
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse36(cbAdmittingNurse36
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse35(cbAdmittingNurse35
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse34(cbAdmittingNurse34
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse33(cbAdmittingNurse33
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse32(cbAdmittingNurse32
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse31(cbAdmittingNurse31
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse30(cbAdmittingNurse30
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse29(cbAdmittingNurse29
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse28(cbAdmittingNurse28
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse27(cbAdmittingNurse27
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse26(cbAdmittingNurse26
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse25(cbAdmittingNurse25
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse24(cbAdmittingNurse24
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse23(cbAdmittingNurse23
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse22(cbAdmittingNurse22
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse21(cbAdmittingNurse21
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse20(cbAdmittingNurse20
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse19(cbAdmittingNurse19
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse18(cbAdmittingNurse18
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse17(cbAdmittingNurse17
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse16(cbAdmittingNurse16
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse15(cbAdmittingNurse15
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse14(cbAdmittingNurse14
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse13(cbAdmittingNurse13
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse12(cbAdmittingNurse12
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse11(cbAdmittingNurse11
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse10(cbAdmittingNurse10
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse9(cbAdmittingNurse9
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse8(cbAdmittingNurse8
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse7(cbAdmittingNurse7
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse6(cbAdmittingNurse6
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse5(cbAdmittingNurse5
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse4(cbAdmittingNurse4
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse3(cbAdmittingNurse3
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse2(cbAdmittingNurse2
				.isSelected());
		refResidentAssessmentFormPage18.setAdmittingNurse1(cbAdmittingNurse1
				.isSelected());
		refResidentAssessmentFormPage18.setAdmitDate(MedrexClientManager
				.getServerTime());
		refResidentAssessmentFormPage18.setRoom(txtRoom.getText());
		refResidentAssessmentFormPage18.setName(txtName.getText());

		try {
			Global.currentResidentAssessmentFormPage18Key = MedrexClientManager
					.getInstance().insertOrUpdateResidentAssessmentFormPage18(
							refResidentAssessmentFormPage18);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Global.currentResidentAssessmentFormPage18Key;
	}

	public void doUpdate() {
		int resId = Global.currentResidenceKey;
		ResidentMain rm = null;
		TempRoomHistory roomHist = null;
		try {
			rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
			roomHist = MedrexClientManager.getInstance()
					.getCurrentRoomForResident(resId);
			txtName.setText(rm.getUserName() + " " + rm.getUserPass());
			/* TODO: Migrating to room history ----- Done */
			// txtRoom.setText(rm.getRoom());
			if (roomHist != null) {
				txtRoom.setText(roomHist.getRoom());
			}
		} catch (Exception e) {
		}
		CensusStatus refCensusStatus = null;
		try {
			refCensusStatus = MedrexClientManager.getInstance()
					.getCensusLastAdmission(Global.currentResidenceKey);
		} catch (Exception e) {
		}
		if (refCensusStatus != null) {
			dcAdmitDate.setDate(refCensusStatus.getTimestamp());
		}

		ResidentAssessmentFormPage18 refResidentAssessmentFormPage18 = null;

		if (Global.currentMsjnKey != 0) {
			try {
				refResidentAssessmentFormPage18 = MedrexClientManager
						.getInstance().getResidentAssessmentFormPage18(
								Global.currentMsjnKey);
			} catch (Exception e) {
			}
			Global.currentResidentAssessmentFormPage18Key = refResidentAssessmentFormPage18
					.getSerial();
			cbNursingOffice40.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice40());
			cbNursingOffice39.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice39());
			cbNursingOffice38.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice38());
			cbNursingOffice37.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice37());
			cbNursingOffice36.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice36());
			cbNursingOffice35.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice35());
			cbNursingOffice34.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice34());
			cbNursingOffice33.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice33());
			cbNursingOffice32.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice32());
			cbNursingOffice31.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice31());
			cbNursingOffice30.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice30());
			cbNursingOffice29.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice29());
			cbNursingOffice28.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice28());
			cbNursingOffice27.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice27());
			cbNursingOffice26.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice26());
			cbNursingOffice25.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice25());
			cbNursingOffice24.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice24());
			cbNursingOffice23.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice23());
			cbNursingOffice22.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice22());
			cbNursingOffice21.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice21());
			cbNursingOffice20.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice20());
			cbNursingOffice19.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice19());
			cbNursingOffice18.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice18());
			cbNursingOffice17.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice17());
			cbNursingOffice16.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice16());
			cbNursingOffice15.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice15());
			cbNursingOffice14.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice14());
			cbNursingOffice13.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice13());
			cbNursingOffice12.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice12());
			cbNursingOffice11.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice11());
			cbnNrsingOffice10.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice10());
			cbNursingOffice9.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice9());
			cbNursingOffice8.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice8());
			cbNursingOffice7.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice7());
			cbNursingOffice6.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice6());
			cbNursingOffice5.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice5());
			cbNursingOffice4.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice4());
			cbNursingOffice3.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice3());
			cbNursingOffice2.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice2());
			cbNursingOffice1.setSelected(refResidentAssessmentFormPage18
					.isNursingOffice1());
			cbSuperVisor40.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor40());
			cbSuperVisor39.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor39());
			cbSuperVisor38.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor38());
			cbSuperVisor37.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor37());
			cbSuperVisor36.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor36());
			cbSuperVisor35.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor35());
			cbSuperVisor34.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor34());
			cbSuperVisor33.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor33());
			cbSuperVisor32.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor32());
			cbSuperVisor31.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor31());
			cbSuperVisor30.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor30());
			cbSuperVisor29.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor29());
			cbSuperVisor28.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor28());
			cbSuperVisor27.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor27());
			cbSuperVisor26.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor26());
			cbSuperVisor25.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor25());
			cbSuperVisor24.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor24());
			cbSuperVisor23.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor23());
			cbSuperVisor22.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor22());
			cbSuperVisor21.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor21());
			cbSuperVisor20.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor20());
			cbSuperVisor19.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor19());
			cbSuperVisor18.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor18());
			cbSuperVisor17.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor17());
			cbSuperVisor16.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor16());
			cbSuperVisor15.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor15());
			cbSuperVisor14.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor14());
			cbSuperVisor13.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor13());
			cbSuperVisor12.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor12());
			cbSuperVisor11.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor11());
			cbSuperVisor10.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor10());
			cbSuperVisor9.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor9());
			cbSuperVisor8.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor8());
			cbSuperVisor7.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor7());
			cbSuperVisor6.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor6());
			cbSuperVisor5.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor5());
			cbSuperVisor4.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor4());
			cbSuperVisor3.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor3());
			cbSuperVisor2.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor2());
			cbSuperVisor1.setSelected(refResidentAssessmentFormPage18
					.isSuperVisor1());
			cbAdmittingNurse40.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse40());
			cbAdmittingNurse39.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse39());
			cbAdmittingNurse38.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse38());
			cbAdmittingNurse37.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse37());
			cbAdmittingNurse36.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse36());
			cbAdmittingNurse35.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse35());
			cbAdmittingNurse34.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse34());
			cbAdmittingNurse33.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse33());
			cbAdmittingNurse32.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse32());
			cbAdmittingNurse31.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse31());
			cbAdmittingNurse30.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse30());
			cbAdmittingNurse29.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse29());
			cbAdmittingNurse28.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse28());
			cbAdmittingNurse27.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse27());
			cbAdmittingNurse26.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse26());
			cbAdmittingNurse25.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse25());
			cbAdmittingNurse24.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse24());
			cbAdmittingNurse23.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse23());
			cbAdmittingNurse22.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse22());
			cbAdmittingNurse21.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse21());
			cbAdmittingNurse20.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse20());
			cbAdmittingNurse19.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse19());
			cbAdmittingNurse18.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse18());
			cbAdmittingNurse17.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse17());
			cbAdmittingNurse16.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse16());
			cbAdmittingNurse15.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse15());
			cbAdmittingNurse14.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse14());
			cbAdmittingNurse13.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse13());
			cbAdmittingNurse12.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse12());
			cbAdmittingNurse11.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse11());
			cbAdmittingNurse10.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse10());
			cbAdmittingNurse9.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse9());
			cbAdmittingNurse8.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse8());
			cbAdmittingNurse7.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse7());
			cbAdmittingNurse6.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse6());
			cbAdmittingNurse5.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse5());
			cbAdmittingNurse4.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse4());
			cbAdmittingNurse3.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse3());
			cbAdmittingNurse2.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse2());
			cbAdmittingNurse1.setSelected(refResidentAssessmentFormPage18
					.isAdmittingNurse1());
			dcAdmitDate.setDate(refResidentAssessmentFormPage18.getAdmitDate());
			txtName.setText(refResidentAssessmentFormPage18.getName());
			txtRoom.setText(refResidentAssessmentFormPage18.getRoom());
		}

	}

	public boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;

		if (!FieldValidation.isEmpty(temp = FieldValidation
				.isNonEmptyAlphaField(txtName, "Resident Name", 0, 25))) {
			vRes.addAllFrom(temp);
		}

		// System.out.println(FieldValidation.getMessages(vRes.getMessages()));
		if (!FieldValidation.isEmpty(vRes)) {
			FieldValidation.Msgbox(vRes, "Resident Assessment Form: Page 18");
			return false;
		} else {
			return true;
		}
	}

}
