package medrex.client.main.nursesNote;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.intf.Form;
import medrex.commons.vo.medication.DailySkilledNursesNotes;
import medrex.commons.vo.resident.ResidentMain;

public class PanelDailySkilledNursesNotes extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3407341467337345686L;
	private JCheckBox cbIntramuscularInjectionsE;
	private JCheckBox cbIntramuscularInjectionsD;
	private JCheckBox cbStatisUlcersE;
	private JCheckBox cbStatisUlcersD;
	private JCheckBox cbWoundCareDressingE;
	private JCheckBox cbWoundCareDressingD;
	private JCheckBox cbObserveSsxInfectionE;
	private JCheckBox cbObserveSsxInfectionD;
	private JPanel panel_8_30_6;
	private JCheckBox cbMDOrdersE;
	private JCheckBox cbMDOrdersD;
	private JCheckBox cbAlertN;
	private JPanel panel_8_30_5;
	private JPanel panel_8_30_4;
	private JPanel panel_8_30_3;
	private JPanel panel_8_30_2;

	// --------Copied

	private JCheckBox cbAppetiteGoodE;
	private JCheckBox cbAppetiteGoodD;
	private JCheckBox cbAppetiteGoodN;
	private JCheckBox cbAppetiteFairE;
	private JCheckBox cbAppetiteFairD;
	private JCheckBox cbAppetiteFairN;
	private JCheckBox cbAppetitePoorN;
	private JCheckBox cbAppetiteE;
	private JCheckBox cbAppetiteD;
	private JCheckBox cbAppetiteN;
	private JCheckBox cbOrthoticsE;
	private JCheckBox cbOrthoticsD;
	private JCheckBox cbOrthoticsN;
	private JCheckBox cbBracesE;
	private JCheckBox cbBracesD;
	private JCheckBox cbBracesN;
	private JCheckBox cbRespiratoryN;
	private JCheckBox cbNursingRehabilitationE;
	private JCheckBox cbNursingRehabilitationD;
	private JCheckBox cbNursingRehabilitationN;
	private JCheckBox cbTherapyN;
	private JCheckBox cbRespiratoryE;
	private JCheckBox cbRespiratoryD;
	private JCheckBox cbTherapyE;
	private JCheckBox cbTherapyD;
	private JCheckBox cbAppetitePoorE;
	private JCheckBox cbAppetitePoorD;

	// ----copied

	private JCheckBox cbChillsE;
	private JCheckBox cbChillsD;
	private JCheckBox cbChillsN;
	private JCheckBox cbCyanosisN;
	private JCheckBox cbCyanosisE;
	private JCheckBox cbCyanosisD;
	private JCheckBox cbSkinWnlE;
	private JCheckBox cbSkinWnlD;
	private JCheckBox cbSkinWnlN;
	private JCheckBox cbAbnormalTurgorE;
	private JCheckBox cbAbnormalTurgorD;
	private JCheckBox cbAbnormalTurgorN;
	private JCheckBox cbRashItchingN;
	private JCheckBox cbRashItchingE;
	private JCheckBox cbRashItchingD;
	private JCheckBox cbFlushingSkinE;
	private JCheckBox cbFlushingSkinD;
	private JCheckBox cbFlushingSkinN;
	private JCheckBox cbClammyE;
	private JCheckBox cbClammyD;
	private JCheckBox cbClammyN;
	private JCheckBox cbPallorE;
	private JCheckBox cbPallorD;
	private JCheckBox cbPallorN;
	private JCheckBox cbJaundicedN;
	private JCheckBox cbJaundicedE;
	private JCheckBox cbJaundicedD;
	private JPanel panel_3;

	// -------------copied

	private JCheckBox cbGuWnlE;
	private JCheckBox cbGuWnlD;
	private JCheckBox cbGuWnlN;
	private JCheckBox cbDischargeE;
	private JCheckBox cbDischargeN;
	private JCheckBox cbOdorE;
	private JCheckBox cbOdorD;
	private JCheckBox cbOdorN;
	private JCheckBox cbSedimentE;
	private JCheckBox cbSedimentN;
	private JCheckBox cbDiscolouredE;
	private JCheckBox cbDiscolouredD;
	private JCheckBox cbDiscolouredN;
	private JCheckBox cbCathelerE;
	private JCheckBox cbCathelerD;
	private JCheckBox cbCathelerN;
	private JCheckBox cbHematuriaE;
	private JCheckBox cbHematuriaD;
	private JCheckBox cbHematuriaN;
	private JCheckBox cbFrequencyUrgencyD;
	private JCheckBox cbFrequencyUrgencyE;
	private JCheckBox cbFrequencyUrgencyN;
	private JCheckBox cbDistentionRetentionE;
	private JCheckBox cbDistentionRetentionD;
	private JCheckBox cbDistentionRetentionN;
	private JCheckBox cbBurningE;
	private JCheckBox cbBurningD;
	private JCheckBox cbBurningN;
	private JPanel PanelGuWnlN;

	// -------copied

	private JLabel eLabel;
	private JLabel nlabel;
	private JTextField txtESignature;
	private JTextField txtDSignature;
	private JTextField txtNsignature;
	private JLabel NameLabel;

	// -------copied

	private JTextField txtSignatureTitle5;
	private JTextField txtSignatureTitle4;
	private JTextField txtSignatureTitle3;
	private JTextField txtSignatureTitle2;
	private JTextField txtSignatureTitle1;
	private JTextField txtComment5;
	private JTextField txtComment4;
	private JTextField txtComment3;
	private JTextField txtComment2;
	private JTextField txtComment1;
	private JTextField txtDateTime5;
	private JTextField txtDateTime4;
	private JTextField txtDateTime3;
	private JTextField txtDateTime2;
	private JTextField txtDateTime1;

	// --------copied

	private JTextField txtRoomBed;
	private JTextField txtAttendingPhysician;
	private JTextField txtMiddleName;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JLabel dailySkilledNursesLabel;
	private JLabel dateLabel;
	private JTextField txtDate;
	private JLabel tempratureLabel;
	private JTextField txtTemprature;
	private JLabel pulseLabel;
	private JTextField txtPulse;
	private JTextField txtRespiration;
	private JTextField txtBloodPressure;
	private JCheckBox cbAlertD;
	private JCheckBox cbAlertE;
	private JCheckBox cbOrientedToN;
	private JCheckBox cbOrientedToD;
	private JCheckBox cbOrientedToE;
	private JCheckBox cbPersonN;
	private JCheckBox cbPersonD;
	private JCheckBox cbPersonE;
	private JCheckBox cbPlaceN;
	private JCheckBox cbPlaceD;
	private JCheckBox cbPlaceE;
	private JCheckBox cbTimeN;
	private JCheckBox cbTimeD;
	private JCheckBox cbTimeE;
	private JCheckBox cbAnxiousAgitatedN;
	private JCheckBox cbAnxiousAgitatedD;
	private JCheckBox cbAnxiousAgitatedE;
	private JCheckBox cbRestlessLethargicN;
	private JCheckBox cbRestlessLethargicD;
	private JCheckBox cbRestlessLethargicE;
	private JCheckBox cbAbnormalSleepN;
	private JCheckBox cbAbnormalSleepD;
	private JCheckBox cbAbnormalSleepE;
	private JCheckBox cbForgetfulConfusedN;
	private JCheckBox cbForgetfulConfusedD;
	private JCheckBox cbForgetfulConfusedE;
	private JCheckBox cbHallucinationDelusionN;
	private JCheckBox cbHallucinationDelusionD;
	private JCheckBox cbHallucinationDelusionE;
	private JCheckBox cbRegularRhythmN;
	private JCheckBox cbRegularRhythmD;
	private JCheckBox cbRegularRhythmE;
	private JCheckBox cbRadialApicalIrregularN;
	private JCheckBox cbRadialApicalIrregularD;
	private JCheckBox cbRadialApicalIrregularE;
	private JCheckBox cbChestPainN;
	private JCheckBox cbChestPainD;
	private JCheckBox cbChestPainE;
	private JCheckBox cbPedalLtRtN;
	private JCheckBox cbPedalLtRtD;
	private JCheckBox cbPedalLtRtE;
	private JCheckBox cbPitting1N;
	private JCheckBox cbPitting1D;
	private JCheckBox cbPitting1E;
	private JCheckBox cbPitting2N;
	private JCheckBox cbPitting2D;
	private JCheckBox cbPitting2E;
	private JCheckBox cbPitting3N;
	private JCheckBox cbPitting3D;
	private JCheckBox cbPitting3E;
	private JCheckBox cbPitting4N;
	private JCheckBox cbPitting4D;
	private JCheckBox cbPitting4E;
	private JCheckBox cbAbnormalPeriheralPulsesN;
	private JCheckBox cbAbnormalPeriheralPulsesD;
	private JCheckBox cbAbnormalPeriheralPulsesE;
	private JCheckBox cbCardiovascularWnlN;
	private JCheckBox cbCardiovascularWnlD;
	private JCheckBox cbCardiovascularWnlE;
	private JCheckBox cbNauseaVomittingN;
	private JCheckBox cbNauseaVomittingD;
	private JCheckBox cbNauseaVomittingE;
	private JCheckBox cbEpigasticDistressN;
	private JCheckBox cbEpigasticDistressD;
	private JCheckBox cbEpigasticDistressE;
	private JCheckBox cbDifficaultySwallowingN;
	private JCheckBox cbDifficaultySwallowingD;
	private JCheckBox cbDifficaultySwallowingE;
	private JCheckBox cbAbdominalDistentonN;
	private JCheckBox cbAbdominalDistentonD;
	private JCheckBox cbAbdominalDistentonE;
	private JCheckBox cbDiarrheaN;
	private JCheckBox cbDiarrheaD;
	private JCheckBox cbDiarrheaE;
	private JCheckBox cbConstipationN;
	private JCheckBox cbConstipationD;
	private JCheckBox cbConstipationE;
	private JCheckBox cbBowelSoundsN;
	private JCheckBox cbBowelSoundsD;
	private JCheckBox cbBowelSoundsE;
	private JCheckBox cbPresentN;
	private JCheckBox cbPresentD;
	private JCheckBox cbPresentE;
	private JCheckBox cbAbsentN;
	private JCheckBox cbAbsentD;
	private JCheckBox cbAbsentE;
	private JCheckBox cbHyperActiveN;
	private JCheckBox cbHyperActiveD;
	private JCheckBox cbHyperActiveE;
	private JCheckBox cbHypoActiveN;
	private JCheckBox cbHypoActiveD;
	private JCheckBox cbHypoActiveE;
	private JCheckBox cbBalanceGaitUnsteadyN;
	private JCheckBox cbBalanceGaitUnsteadyD;
	private JCheckBox cbBalanceGaitUnsteadyE;
	private JCheckBox cbParalysisN;
	private JCheckBox cbParalysisD;
	private JCheckBox cbParalysisE;
	private JCheckBox cbMusculoSkeketalWnlN;
	private JCheckBox cbMusculoSkeketalWnlD;
	private JCheckBox cbMusculoSkeketalWnlE;
	private JCheckBox cbSynCopeN;
	private JCheckBox cbSynCopeD;
	private JCheckBox cbSynCopeE;
	private JCheckBox cbHeadAcheN;
	private JCheckBox cbHeadAcheD;
	private JCheckBox cbHeadAcheE;
	private JCheckBox cbDecreasedGraspE;
	private JCheckBox cbNervousSystemRtN;
	private JCheckBox cbNervousSystemRtD;
	private JCheckBox cbNervousSystemRtE;
	private JCheckBox cbNervousSystemLtN;
	private JCheckBox cbNervousSystemLtD;
	private JCheckBox cbNervousSystemLtE;
	private JCheckBox cbDecresedMovementE;
	private JCheckBox cbRueLueN;
	private JCheckBox cbRueLueD;
	private JCheckBox cbRueLueE;
	private JCheckBox cbRleLLeN;
	private JCheckBox cbRleLLeD;
	private JCheckBox cbRleLLeE;
	private JCheckBox cbAbnormalPupilReactionE;
	private JCheckBox cbAbnormalReactionRightN;
	private JCheckBox cbAbnormalReactionRightD;
	private JCheckBox cbAbnormalReactionRightE;
	private JCheckBox cbAbnormalReactionLeftN;
	private JCheckBox cbAbnormalReactionLeftD;
	private JCheckBox cbAbnormalReactionLeftE;
	private JCheckBox cbTremorsN;
	private JCheckBox cbTremorsD;
	private JCheckBox cbTremorsE;
	private JCheckBox cbVertigoN;
	private JCheckBox cbVertigoD;
	private JCheckBox cbVertigoE;
	private JCheckBox cbNervousSystemWnlN;
	private JCheckBox cbNervousSystemWnlD;
	private JCheckBox cbNervousSystemWnlE;
	private JCheckBox cbLeboredBreathingD;
	private JCheckBox cbLeboredBreathingE;
	private JCheckBox cbLeboredBreathingN;
	private JCheckBox cbShallowRespirationN;
	private JCheckBox cbShallowRespirationD;
	private JCheckBox cbShallowRespirationE;
	private JCheckBox cbRatesRhonchiN;
	private JCheckBox cbRatesRhonchiD;
	private JCheckBox cbRatesRhonchiE;
	private JCheckBox cbWheezingN;
	private JCheckBox cbWheezingD;
	private JCheckBox cbWheezingE;
	private JCheckBox cbCoughN;
	private JCheckBox cbCoughD;
	private JCheckBox cbCoughE;
	private JCheckBox cbDyspneaSobN;
	private JCheckBox cbDyspneaSobD;
	private JCheckBox cbDyspneaSobE;
	private JCheckBox cbQ2LpmN;
	private JCheckBox cbQ2LpmD;
	private JCheckBox cbQ2LpmE;
	private JCheckBox cbPrnN;
	private JCheckBox cbPrnD;
	private JCheckBox cbPrnE;
	private JCheckBox cbContinousN;
	private JCheckBox cbContinousD;
	private JCheckBox cbContinousE;
	private JCheckBox cbS2O2N;
	private JCheckBox cbS2O2D;
	private JCheckBox cbS2O2E;
	private JCheckBox cbSuctioningN;
	private JCheckBox cbSuctioningD;
	private JCheckBox cbSuctioningE;
	private JCheckBox cbTrachCareN;
	private JCheckBox cbTrachCareD;
	private JCheckBox cbTrachCareE;
	private JCheckBox cbVentCareN;
	private JCheckBox cbVentCareD;
	private JCheckBox cbVentCareE;
	private JCheckBox cbLungsClearN;
	private JCheckBox cbRespiratoryWnlN;
	private JCheckBox cbLungsClearD;
	private JCheckBox cbLungsClearE;
	private JCheckBox cbRespiratoryWnlE;
	private JCheckBox cbRespiratoryWnlD;
	private JCheckBox cbLeboredBreathingD_1;
	private JCheckBox cbLeboredBreathingE_1;
	private JCheckBox cbLeboredBreathingN_1;
	private JCheckBox cbShallowRespirationN_1;
	private JCheckBox cbShallowRespirationD_1;
	private JCheckBox cbShallowRespirationE_1;
	private JCheckBox cbRatesRhonchiN_1;
	private JCheckBox cbRatesRhonchiD_1;
	private JCheckBox cbRatesRhonchiE_1;
	private JCheckBox cbWheezingN_1;
	private JCheckBox cbWheezingD_1;
	private JCheckBox cbWheezingE_1;
	private JCheckBox cbCoughN_1;
	private JCheckBox cbCoughD_1;
	private JCheckBox cbCoughE_1;
	private JCheckBox cbDyspneaSobN_1;
	private JCheckBox cbDyspneaSobD_1;
	private JCheckBox cbDyspneaSobE_1;
	private JCheckBox cbQ2LpmN_1;
	private JCheckBox cbQ2LpmD_1;
	private JCheckBox cbQ2LpmE_1;
	private JCheckBox cbPrnN_1;
	private JCheckBox cbPrnD_1;
	private JCheckBox cbPrnE_1;
	private JCheckBox cbOriginN;
	private JCheckBox cbOriginD;
	private JCheckBox cbOriginE;
	private JCheckBox cbLocationN;
	private JCheckBox cbLocationD;
	private JCheckBox cbLocationE;
	private JCheckBox cbIntensityN;
	private JCheckBox cbIntensityD;
	private JCheckBox cbIntensityE;
	private JCheckBox cbNoneN;
	private JCheckBox cbNoneD;
	private JCheckBox cbNoneE;
	private AbstractButton cbMDNotifiedD;
	private JCheckBox cbMDNotifiedE;
	private JCheckBox cbMDNotifiedN;
	private JCheckBox cbSkilledObservationAssessmentN;
	private JCheckBox cbSkilledObservationAssessmentD;
	private JCheckBox cbSkilledObservationAssessmentE;
	private JCheckBox cbDiabeticManagementN;
	private JCheckBox cbDiabeticManagementD;
	private JCheckBox cbDiabeticManagementE;
	private JCheckBox cbGlucometerReadingN;
	private JCheckBox cbGlucometerReadingD;
	private JCheckBox cbGlucometerReadingE;
	private JCheckBox cbDehaydrationN;
	private JCheckBox cbDehaydrationD;
	private JCheckBox cbDehaydrationE;
	private JCheckBox cbManagementTeachingN;
	private JCheckBox cbManagementTeachingD;
	private JCheckBox cbManagementTeachingE;
	private JCheckBox cbDialysisManagementN;
	private JCheckBox cbDialysisManagementD;
	private JCheckBox cbDialysisManagementE;
	private JCheckBox cbSideEffectN;
	private JCheckBox cbSideEffectD;
	private JCheckBox cbSideEffectE;
	private JCheckBox cbMDOrdersN;
	private JCheckBox cbTranslusionD;
	private JCheckBox cbTranslusionE;
	private JCheckBox cbTranslusionN;
	private JCheckBox cbCareN;
	private JCheckBox cbCareD;
	private JCheckBox cbCareE;
	private JCheckBox cbInjectableMedsN;
	private JCheckBox cbInjectableMedsD;
	private JCheckBox cbInjectableMedsE;
	private JCheckBox cbCareTeachN;
	private JCheckBox cbCareTeachD;
	private JCheckBox cbCareTeachE;
	private JCheckBox cbDietTeachingN;
	private JCheckBox cbDietTeachingD;
	private JCheckBox cbDietTeachingE;
	private JCheckBox cbBowelBladderTrainingN;
	private JCheckBox cbBowelBladderTrainingD;
	private JCheckBox cbBowelBladderTrainingE;
	private JCheckBox cbSitesN;
	private JCheckBox cbSitesD;
	private JCheckBox cbSitesE;
	private JCheckBox cbObserveSsxInfectionN;
	private JCheckBox cbPressureUlcerCareD;
	private JCheckBox cbPressureUlcerCareE;
	private JCheckBox cbPressureUlcerCareN;
	private JCheckBox cbTracheostomyCareN;
	private JCheckBox cbTracheostomyCareD;
	private JCheckBox cbTracheostomyCareE;
	private JCheckBox cbPainSuctiongN;
	private JCheckBox cbPainSuctiongD;
	private JCheckBox cbPainSuctiongE;
	private JCheckBox cbMedicationN;
	private JCheckBox cbMedicationD;
	private JCheckBox cbMedicationE;
	private JCheckBox cbFeedingHydrationN;
	private JCheckBox cbFeedingHydrationD;
	private JCheckBox cbFeedingHydrationE;
	private JCheckBox cbIntramuscularInjectionsN;
	private JCheckBox cbTubeFeedingN;
	private JCheckBox cbTubeFeedingD;
	private JCheckBox cbTubeFeedingE;
	private JCheckBox cbPainManagementN;
	private JCheckBox cbPainManagementD;
	private JCheckBox cbPainManagementE;
	private JCheckBox cbWoundCareDressingN;
	private JCheckBox cbStatisUlcersN;
	private JCheckBox cbDischargeD;
	private JCheckBox cbSedimentD;

	// --------copied

	public static Color PanelColor = Color.WHITE;

	public PanelDailySkilledNursesNotes() {
		super();
		Global.panelDailySkilledNursesNotes = this;
		setPreferredSize(new Dimension(1130, 1675));
		setLayout(null);
		setBackground(Color.WHITE);
		setBounds(0, 0, 1132, 1684);
		// setBounds(0,0,1125,1545);

		final JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setLayout(null);
		panel.setBounds(0, 0, 1122, 50);
		panel.setBackground(PanelColor);
		add(panel);

		dailySkilledNursesLabel = new JLabel();
		dailySkilledNursesLabel.setFont(new Font("", Font.BOLD, 20));
		dailySkilledNursesLabel.setText("DAILY SKILLED NURSES NOTES");
		dailySkilledNursesLabel.setBounds(369, 10, 316, 30);
		panel.add(dailySkilledNursesLabel);

		final JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 56, 1122, 50);
		add(panel_1);

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 224, 50);
		panel_1.add(panel_2);

		dateLabel = new JLabel();
		dateLabel.setText("DATE");
		dateLabel.setBounds(33, 15, 73, 16);
		panel_2.add(dateLabel);

		txtDate = new JTextField();
		txtDate.setBounds(112, 13, 87, 20);
		panel_2.add(txtDate);

		final JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(224, 0, 224, 50);
		panel_1.add(panel_2_1);

		tempratureLabel = new JLabel();
		tempratureLabel.setText("TEMPRATURE");
		tempratureLabel.setBounds(10, 15, 87, 16);
		panel_2_1.add(tempratureLabel);

		txtTemprature = new JTextField();
		txtTemprature.setBounds(116, 13, 87, 20);
		panel_2_1.add(txtTemprature);

		final JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(Color.WHITE);
		panel_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_2.setLayout(null);
		panel_2_2.setBounds(448, 0, 224, 50);
		panel_1.add(panel_2_2);

		pulseLabel = new JLabel();
		pulseLabel.setText("PULSE");
		pulseLabel.setBounds(44, 15, 66, 16);
		panel_2_2.add(pulseLabel);

		txtPulse = new JTextField();
		txtPulse.setBounds(116, 13, 87, 20);
		panel_2_2.add(txtPulse);

		final JPanel panel_2_3 = new JPanel();
		panel_2_3.setBackground(Color.WHITE);
		panel_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_3.setLayout(null);
		panel_2_3.setBounds(672, 0, 224, 50);
		panel_1.add(panel_2_3);

		final JLabel respirationLabel = new JLabel();
		respirationLabel.setText("RESPIRATION");
		respirationLabel.setBounds(10, 15, 77, 16);
		panel_2_3.add(respirationLabel);

		txtRespiration = new JTextField();
		txtRespiration.setBounds(115, 13, 87, 20);
		panel_2_3.add(txtRespiration);

		final JPanel panel_2_3_1 = new JPanel();
		panel_2_3_1.setBackground(Color.WHITE);
		panel_2_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_3_1.setLayout(null);
		panel_2_3_1.setBounds(896, 0, 224, 50);
		panel_1.add(panel_2_3_1);

		final JLabel bloodPressureLabel = new JLabel();
		bloodPressureLabel.setText("BLOOD PRESSURE");
		bloodPressureLabel.setBounds(10, 15, 98, 16);
		panel_2_3_1.add(bloodPressureLabel);

		txtBloodPressure = new JTextField();
		txtBloodPressure.setBounds(114, 13, 87, 20);
		panel_2_3_1.add(txtBloodPressure);

		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setLayout(null);
		panel_3.setBounds(0, 112, 1122, 1564);
		// panel_3.setBounds(0, 112, 1122, 1542);
		panel_3.setBackground(PanelColor);
		add(panel_3);

		final JPanel panel_4 = new JPanel();
		panel_4.setBackground(PanelColor);
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setLayout(null);
		panel_4.setBounds(0, 10, 1122, 27);
		panel_3.add(panel_4);

		final JLabel xAllAplicableLabel = new JLabel();
		xAllAplicableLabel
				.setText("(x) All Aplicable Boxes Circle All Appropriate Item(s) Separated By\"/\".Signature And Title Of Nurse For Appropriate Shifts");
		xAllAplicableLabel.setBounds(94, 5, 938, 16);
		panel_4.add(xAllAplicableLabel);

		final JLabel dLabel = new JLabel();
		dLabel.setText("DIRECTIONS");
		dLabel.setBounds(10, 5, 93, 16);
		panel_4.add(dLabel);

		final JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setLayout(null);
		panel_5.setBounds(0, 37, 280, 420);
		panel_3.add(panel_5);

		final JPanel panel_6 = new JPanel();
		panel_6.setBackground(PanelColor);
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setLayout(null);
		panel_6.setBounds(0, 0, 178, 30);
		panel_5.add(panel_6);

		final JPanel panel_6_1 = new JPanel();
		panel_6_1.setBackground(Color.BLACK);
		panel_6_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1.setLayout(null);
		panel_6_1.setBounds(0, 30, 280, 30);
		panel_5.add(panel_6_1);

		final JLabel mentalStatusLabel = new JLabel();
		mentalStatusLabel.setForeground(Color.WHITE);
		mentalStatusLabel.setText("Mental Status");
		mentalStatusLabel.setBounds(81, 10, 115, 16);
		panel_6_1.add(mentalStatusLabel);

		final JPanel panel_6_2 = new JPanel();
		panel_6_2.setBackground(PanelColor);
		panel_6_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_2.setLayout(null);
		panel_6_2.setBounds(0, 60, 178, 30);
		panel_5.add(panel_6_2);

		final JLabel alertLabel = new JLabel();
		alertLabel.setText("Alert");
		alertLabel.setBounds(10, 8, 66, 16);
		panel_6_2.add(alertLabel);

		final JPanel panel_6_3 = new JPanel();
		panel_6_3.setBackground(PanelColor);
		panel_6_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_3.setLayout(null);
		panel_6_3.setBounds(0, 90, 178, 30);
		panel_5.add(panel_6_3);

		final JLabel alertLabel_1 = new JLabel();
		alertLabel_1.setText("Oriented To");
		alertLabel_1.setBounds(10, 8, 66, 16);
		panel_6_3.add(alertLabel_1);

		final JPanel panel_6_4 = new JPanel();
		panel_6_4.setBackground(PanelColor);
		panel_6_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4.setLayout(null);
		panel_6_4.setBounds(0, 120, 178, 30);
		panel_5.add(panel_6_4);

		final JLabel alertLabel_2 = new JLabel();
		alertLabel_2.setText("Person");
		alertLabel_2.setBounds(46, 8, 66, 16);
		panel_6_4.add(alertLabel_2);

		final JPanel panel_6_5 = new JPanel();
		panel_6_5.setBackground(PanelColor);
		panel_6_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_5.setLayout(null);
		panel_6_5.setBounds(0, 150, 178, 30);
		panel_5.add(panel_6_5);

		final JLabel alertLabel_3 = new JLabel();
		alertLabel_3.setText("Place");
		alertLabel_3.setBounds(46, 8, 66, 16);
		panel_6_5.add(alertLabel_3);

		final JPanel panel_6_6 = new JPanel();
		panel_6_6.setBackground(PanelColor);
		panel_6_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_6.setLayout(null);
		panel_6_6.setBounds(0, 180, 178, 30);
		panel_5.add(panel_6_6);

		final JLabel alertLabel_4 = new JLabel();
		alertLabel_4.setText("Time");
		alertLabel_4.setBounds(46, 8, 66, 16);
		panel_6_6.add(alertLabel_4);

		final JPanel panel_6_7 = new JPanel();
		panel_6_7.setBackground(PanelColor);
		panel_6_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_7.setLayout(null);
		panel_6_7.setBounds(0, 210, 178, 30);
		panel_5.add(panel_6_7);

		final JLabel alertLabel_5 = new JLabel();
		alertLabel_5.setText("Anxious/Agitated");
		alertLabel_5.setBounds(10, 8, 127, 16);
		panel_6_7.add(alertLabel_5);

		final JPanel panel_6_8 = new JPanel();
		panel_6_8.setBackground(PanelColor);
		panel_6_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_8.setLayout(null);
		panel_6_8.setBounds(0, 240, 178, 30);
		panel_5.add(panel_6_8);

		final JLabel alertLabel_6 = new JLabel();
		alertLabel_6.setText("RestLess / Lethargic");
		alertLabel_6.setBounds(10, 8, 138, 16);
		panel_6_8.add(alertLabel_6);

		final JPanel panel_6_9 = new JPanel();
		panel_6_9.setBackground(PanelColor);
		panel_6_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_9.setLayout(null);
		panel_6_9.setBounds(0, 270, 178, 30);
		panel_5.add(panel_6_9);

		final JLabel alertLabel_7 = new JLabel();
		alertLabel_7.setText("Abnormal Sleep Pattern");
		alertLabel_7.setBounds(10, 8, 158, 16);
		panel_6_9.add(alertLabel_7);

		final JPanel panel_6_10 = new JPanel();
		panel_6_10.setBackground(PanelColor);
		panel_6_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_10.setLayout(null);
		panel_6_10.setBounds(0, 300, 178, 30);
		panel_5.add(panel_6_10);

		final JLabel alertLabel_8 = new JLabel();
		alertLabel_8.setText("ForgetFul / Confused");
		alertLabel_8.setBounds(10, 8, 126, 16);
		panel_6_10.add(alertLabel_8);

		final JPanel panel_6_11 = new JPanel();
		panel_6_11.setBackground(Color.WHITE);
		panel_6_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_11.setLayout(null);
		panel_6_11.setBounds(0, 330, 178, 30);
		panel_5.add(panel_6_11);

		final JLabel alertLabel_9 = new JLabel();
		alertLabel_9.setText("Hallucination/Delusion");
		alertLabel_9.setBounds(10, 8, 138, 16);
		panel_6_11.add(alertLabel_9);

		final JPanel panel_6_12 = new JPanel();
		panel_6_12.setBackground(PanelColor);
		panel_6_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_12.setLayout(null);
		panel_6_12.setBounds(0, 360, 178, 30);
		panel_5.add(panel_6_12);

		final JPanel panel_6_13 = new JPanel();
		panel_6_13.setBackground(PanelColor);
		panel_6_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_13.setLayout(null);
		panel_6_13.setBounds(0, 390, 178, 30);
		panel_5.add(panel_6_13);

		final JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBounds(178, 0, 102, 30);
		panel_5.add(panel_7);

		final JPanel panel_8 = new JPanel();
		panel_8.setBackground(PanelColor);
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setBounds(0, 0, 34, 30);
		panel_7.add(panel_8);

		JLabel nlabel = new JLabel();
		nlabel.setText("N");
		panel_8.add(nlabel);

		final JPanel panel_8_1 = new JPanel();
		panel_8_1.setBackground(PanelColor);
		panel_8_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1.setBounds(34, 0, 34, 30);
		panel_7.add(panel_8_1);

		final JLabel nLabel_1 = new JLabel();
		nLabel_1.setText("D");
		panel_8_1.add(nLabel_1);

		final JPanel panel_8_2 = new JPanel();
		panel_8_2.setBackground(PanelColor);
		panel_8_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2.setBounds(68, 0, 34, 30);
		panel_7.add(panel_8_2);

		final JLabel nLabel_2 = new JLabel();
		nLabel_2.setText("E");
		panel_8_2.add(nLabel_2);

		final JPanel panel_7_2 = new JPanel();
		panel_7_2.setLayout(null);
		panel_7_2.setBounds(178, 60, 102, 30);
		panel_5.add(panel_7_2);

		final JPanel panel_8_6 = new JPanel();
		panel_8_6.setBackground(PanelColor);
		panel_8_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_6.setBounds(0, 0, 34, 30);
		panel_7_2.add(panel_8_6);

		cbAlertN = new JCheckBox();
		cbAlertN.setBackground(PanelColor);
		cbAlertN.setText("");
		panel_8_6.add(cbAlertN);

		final JPanel panel_8_7 = new JPanel();
		panel_8_7.setBackground(PanelColor);
		panel_8_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_7.setBounds(34, 0, 34, 30);
		panel_7_2.add(panel_8_7);

		cbAlertD = new JCheckBox();
		cbAlertD.setBackground(PanelColor);
		cbAlertD.setText("");
		panel_8_7.add(cbAlertD);

		final JPanel panel_8_8 = new JPanel();
		panel_8_8.setBackground(PanelColor);
		panel_8_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_8.setBounds(68, 0, 34, 30);
		panel_7_2.add(panel_8_8);

		cbAlertE = new JCheckBox();
		cbAlertE.setBackground(PanelColor);
		cbAlertE.setText("");
		panel_8_8.add(cbAlertE);

		final JPanel panel_7_3 = new JPanel();
		panel_7_3.setLayout(null);
		panel_7_3.setBounds(178, 90, 102, 30);
		panel_5.add(panel_7_3);

		final JPanel panel_8_9 = new JPanel();
		panel_8_9.setBackground(PanelColor);
		panel_8_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_9.setBounds(0, 0, 34, 30);
		panel_7_3.add(panel_8_9);

		cbOrientedToN = new JCheckBox();
		cbOrientedToN.setBackground(PanelColor);
		cbOrientedToN.setText("");
		panel_8_9.add(cbOrientedToN);

		final JPanel panel_8_10 = new JPanel();
		panel_8_10.setBackground(PanelColor);
		panel_8_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10.setBounds(34, 0, 34, 30);
		panel_7_3.add(panel_8_10);

		cbOrientedToD = new JCheckBox();
		cbOrientedToD.setBackground(PanelColor);
		cbOrientedToD.setText("");
		panel_8_10.add(cbOrientedToD);

		final JPanel panel_8_11 = new JPanel();
		panel_8_11.setBackground(PanelColor);
		panel_8_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_11.setBounds(68, 0, 34, 30);
		panel_7_3.add(panel_8_11);

		cbOrientedToE = new JCheckBox();
		cbOrientedToE.setBackground(PanelColor);
		cbOrientedToE.setText("");
		panel_8_11.add(cbOrientedToE);

		final JPanel panel_7_4 = new JPanel();
		panel_7_4.setLayout(null);
		panel_7_4.setBounds(178, 120, 102, 30);
		panel_5.add(panel_7_4);

		final JPanel panel_8_12 = new JPanel();
		panel_8_12.setBackground(PanelColor);
		panel_8_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_12.setBounds(0, 0, 34, 30);
		panel_7_4.add(panel_8_12);

		cbPersonN = new JCheckBox();
		cbPersonN.setBackground(PanelColor);
		cbPersonN.setText("");
		panel_8_12.add(cbPersonN);

		final JPanel panel_8_13 = new JPanel();
		panel_8_13.setBackground(PanelColor);
		panel_8_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_13.setBounds(34, 0, 34, 30);
		panel_7_4.add(panel_8_13);

		cbPersonD = new JCheckBox();
		cbPersonD.setBackground(PanelColor);
		cbPersonD.setText("");
		panel_8_13.add(cbPersonD);

		final JPanel panel_8_14 = new JPanel();
		panel_8_14.setBackground(PanelColor);
		panel_8_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_14.setBounds(68, 0, 34, 30);
		panel_7_4.add(panel_8_14);

		cbPersonE = new JCheckBox();
		cbPersonE.setBackground(PanelColor);
		cbPersonE.setText("");
		panel_8_14.add(cbPersonE);

		final JPanel panel_7_5 = new JPanel();
		panel_7_5.setLayout(null);
		panel_7_5.setBounds(178, 150, 102, 30);
		panel_5.add(panel_7_5);

		final JPanel panel_8_15 = new JPanel();
		panel_8_15.setBackground(PanelColor);
		panel_8_15.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_15.setBounds(0, 0, 34, 30);
		panel_7_5.add(panel_8_15);

		cbPlaceN = new JCheckBox();
		cbPlaceN.setBackground(PanelColor);
		cbPlaceN.setText("");
		panel_8_15.add(cbPlaceN);

		final JPanel panel_8_16 = new JPanel();
		panel_8_16.setBackground(PanelColor);
		panel_8_16.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_16.setBounds(34, 0, 34, 30);
		panel_7_5.add(panel_8_16);

		cbPlaceD = new JCheckBox();
		cbPlaceD.setBackground(PanelColor);
		cbPlaceD.setText("");
		panel_8_16.add(cbPlaceD);

		final JPanel panel_8_17 = new JPanel();
		panel_8_17.setBackground(PanelColor);
		panel_8_17.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_17.setBounds(68, 0, 34, 30);
		panel_7_5.add(panel_8_17);

		cbPlaceE = new JCheckBox();
		cbPlaceE.setBackground(PanelColor);
		cbPlaceE.setText("");
		panel_8_17.add(cbPlaceE);

		final JPanel panel_7_6 = new JPanel();
		panel_7_6.setLayout(null);
		panel_7_6.setBounds(178, 180, 102, 30);
		panel_5.add(panel_7_6);

		final JPanel panel_8_18 = new JPanel();
		panel_8_18.setBackground(PanelColor);
		panel_8_18.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_18.setBounds(0, 0, 34, 30);
		panel_7_6.add(panel_8_18);

		cbTimeN = new JCheckBox();
		cbTimeN.setBackground(PanelColor);
		cbTimeN.setText("");
		panel_8_18.add(cbTimeN);

		final JPanel panel_8_19 = new JPanel();
		panel_8_19.setBackground(PanelColor);
		panel_8_19.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_19.setBounds(34, 0, 34, 30);
		panel_7_6.add(panel_8_19);

		cbTimeD = new JCheckBox();
		cbTimeD.setBackground(PanelColor);
		cbTimeD.setText("");
		panel_8_19.add(cbTimeD);

		final JPanel panel_8_20 = new JPanel();
		panel_8_20.setBackground(PanelColor);
		panel_8_20.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_20.setBounds(68, 0, 34, 30);
		panel_7_6.add(panel_8_20);

		cbTimeE = new JCheckBox();
		cbTimeE.setBackground(PanelColor);
		cbTimeE.setText("");
		panel_8_20.add(cbTimeE);

		final JPanel panel_7_7 = new JPanel();
		panel_7_7.setLayout(null);
		panel_7_7.setBounds(178, 210, 102, 30);
		panel_5.add(panel_7_7);

		final JPanel panel_8_22 = new JPanel();
		panel_8_22.setBackground(PanelColor);
		panel_8_22.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_22.setBounds(0, 0, 34, 30);
		panel_7_7.add(panel_8_22);

		cbAnxiousAgitatedN = new JCheckBox();
		cbAnxiousAgitatedN.setBackground(PanelColor);
		cbAnxiousAgitatedN.setText("");
		panel_8_22.add(cbAnxiousAgitatedN);

		final JPanel panel_8_23 = new JPanel();
		panel_8_23.setBackground(PanelColor);
		panel_8_23.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_23.setBounds(34, 0, 34, 30);
		panel_7_7.add(panel_8_23);

		cbAnxiousAgitatedD = new JCheckBox();
		cbAnxiousAgitatedD.setBackground(PanelColor);
		cbAnxiousAgitatedD.setText("");
		panel_8_23.add(cbAnxiousAgitatedD);

		final JPanel panel_8_24 = new JPanel();
		panel_8_24.setBackground(PanelColor);
		panel_8_24.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_24.setBounds(68, 0, 34, 30);
		panel_7_7.add(panel_8_24);

		cbAnxiousAgitatedE = new JCheckBox();
		cbAnxiousAgitatedE.setBackground(PanelColor);
		cbAnxiousAgitatedE.setText("");
		panel_8_24.add(cbAnxiousAgitatedE);

		final JPanel panel_7_8 = new JPanel();
		panel_7_8.setLayout(null);
		panel_7_8.setBounds(178, 240, 102, 30);
		panel_5.add(panel_7_8);

		final JPanel panel_8_21 = new JPanel();
		panel_8_21.setBackground(PanelColor);
		panel_8_21.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_21.setBounds(0, 0, 34, 30);
		panel_7_8.add(panel_8_21);

		cbRestlessLethargicN = new JCheckBox();
		cbRestlessLethargicN.setBackground(PanelColor);
		cbRestlessLethargicN.setText("");
		panel_8_21.add(cbRestlessLethargicN);

		final JPanel panel_8_25 = new JPanel();
		panel_8_25.setBackground(PanelColor);
		panel_8_25.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_25.setBounds(34, 0, 34, 30);
		panel_7_8.add(panel_8_25);

		cbRestlessLethargicD = new JCheckBox();
		cbRestlessLethargicD.setBackground(PanelColor);
		cbRestlessLethargicD.setText("");
		panel_8_25.add(cbRestlessLethargicD);

		final JPanel panel_8_26 = new JPanel();
		panel_8_26.setBackground(PanelColor);
		panel_8_26.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_26.setBounds(68, 0, 34, 30);
		panel_7_8.add(panel_8_26);

		cbRestlessLethargicE = new JCheckBox();
		cbRestlessLethargicE.setBackground(PanelColor);
		cbRestlessLethargicE.setText("");
		panel_8_26.add(cbRestlessLethargicE);

		final JPanel panel_7_9 = new JPanel();
		panel_7_9.setLayout(null);
		panel_7_9.setBounds(178, 270, 102, 30);
		panel_5.add(panel_7_9);

		final JPanel panel_8_27 = new JPanel();
		panel_8_27.setBackground(PanelColor);
		panel_8_27.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_27.setBounds(0, 0, 34, 30);
		panel_7_9.add(panel_8_27);

		cbAbnormalSleepN = new JCheckBox();
		cbAbnormalSleepN.setBackground(PanelColor);
		cbAbnormalSleepN.setText("");
		panel_8_27.add(cbAbnormalSleepN);

		final JPanel panel_8_28 = new JPanel();
		panel_8_28.setBackground(PanelColor);
		panel_8_28.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_28.setBounds(34, 0, 34, 30);
		panel_7_9.add(panel_8_28);

		cbAbnormalSleepD = new JCheckBox();
		cbAbnormalSleepD.setBackground(PanelColor);
		cbAbnormalSleepD.setText("");
		panel_8_28.add(cbAbnormalSleepD);

		final JPanel panel_8_29 = new JPanel();
		panel_8_29.setBackground(PanelColor);
		panel_8_29.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_29.setBounds(68, 0, 34, 30);
		panel_7_9.add(panel_8_29);

		cbAbnormalSleepE = new JCheckBox();
		cbAbnormalSleepE.setBackground(PanelColor);
		cbAbnormalSleepE.setText("");
		panel_8_29.add(cbAbnormalSleepE);

		final JPanel panel_7_10 = new JPanel();
		panel_7_10.setLayout(null);
		panel_7_10.setBounds(178, 300, 102, 30);
		panel_5.add(panel_7_10);

		final JPanel panel_8_33 = new JPanel();
		panel_8_33.setBackground(PanelColor);
		panel_8_33.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_33.setBounds(0, 0, 34, 30);
		panel_7_10.add(panel_8_33);

		cbForgetfulConfusedN = new JCheckBox();
		cbForgetfulConfusedN.setBackground(PanelColor);
		cbForgetfulConfusedN.setText("");
		panel_8_33.add(cbForgetfulConfusedN);

		final JPanel panel_8_34 = new JPanel();
		panel_8_34.setBackground(PanelColor);
		panel_8_34.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_34.setBounds(34, 0, 34, 30);
		panel_7_10.add(panel_8_34);

		cbForgetfulConfusedD = new JCheckBox();
		cbForgetfulConfusedD.setBackground(PanelColor);
		cbForgetfulConfusedD.setText("");
		panel_8_34.add(cbForgetfulConfusedD);

		final JPanel panel_8_35 = new JPanel();
		panel_8_35.setBackground(PanelColor);
		panel_8_35.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_35.setBounds(68, 0, 34, 30);
		panel_7_10.add(panel_8_35);

		cbForgetfulConfusedE = new JCheckBox();
		cbForgetfulConfusedE.setBackground(PanelColor);
		cbForgetfulConfusedE.setText("");
		panel_8_35.add(cbForgetfulConfusedE);

		final JPanel panel_7_11 = new JPanel();
		panel_7_11.setLayout(null);
		panel_7_11.setBounds(178, 330, 102, 30);
		panel_5.add(panel_7_11);

		final JPanel panel_8_30 = new JPanel();
		panel_8_30.setBackground(PanelColor);
		panel_8_30.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_30.setBounds(0, 0, 34, 30);
		panel_7_11.add(panel_8_30);

		cbHallucinationDelusionN = new JCheckBox();
		cbHallucinationDelusionN.setBackground(PanelColor);
		cbHallucinationDelusionN.setText("");
		panel_8_30.add(cbHallucinationDelusionN);

		final JPanel panel_8_31 = new JPanel();
		panel_8_31.setBackground(PanelColor);
		panel_8_31.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_31.setBounds(34, 0, 34, 30);
		panel_7_11.add(panel_8_31);

		cbHallucinationDelusionD = new JCheckBox();
		cbHallucinationDelusionD.setBackground(PanelColor);
		cbHallucinationDelusionD.setText("");
		panel_8_31.add(cbHallucinationDelusionD);

		final JPanel panel_8_32 = new JPanel();
		panel_8_32.setBackground(PanelColor);
		panel_8_32.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_32.setBounds(68, 0, 34, 30);
		panel_7_11.add(panel_8_32);

		cbHallucinationDelusionE = new JCheckBox();
		cbHallucinationDelusionE.setBackground(PanelColor);
		cbHallucinationDelusionE.setText("");
		panel_8_32.add(cbHallucinationDelusionE);

		final JPanel panel_7_12 = new JPanel();
		panel_7_12.setLayout(null);
		panel_7_12.setBounds(178, 360, 102, 30);
		panel_5.add(panel_7_12);

		final JPanel panel_8_36 = new JPanel();
		panel_8_36.setBackground(PanelColor);
		panel_8_36.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_36.setBounds(0, 0, 34, 30);
		panel_7_12.add(panel_8_36);

		final JPanel panel_8_37 = new JPanel();
		panel_8_37.setBackground(PanelColor);
		panel_8_37.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_37.setBounds(34, 0, 34, 30);
		panel_7_12.add(panel_8_37);

		final JPanel panel_8_38 = new JPanel();
		panel_8_38.setBackground(PanelColor);
		panel_8_38.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_38.setBounds(68, 0, 34, 30);
		panel_7_12.add(panel_8_38);

		final JPanel panel_7_13 = new JPanel();
		panel_7_13.setLayout(null);
		panel_7_13.setBounds(178, 390, 102, 30);
		panel_5.add(panel_7_13);

		final JPanel panel_8_39 = new JPanel();
		panel_8_39.setBackground(PanelColor);
		panel_8_39.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_39.setBounds(0, 0, 34, 30);
		panel_7_13.add(panel_8_39);

		final JPanel panel_8_40 = new JPanel();
		panel_8_40.setBackground(PanelColor);
		panel_8_40.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_40.setBounds(34, 0, 34, 30);
		panel_7_13.add(panel_8_40);

		final JPanel panel_8_41 = new JPanel();
		panel_8_41.setBackground(PanelColor);
		panel_8_41.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_41.setBounds(68, 0, 34, 30);
		panel_7_13.add(panel_8_41);

		final JPanel panel_5_3 = new JPanel();
		panel_5_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_3.setLayout(null);
		panel_5_3.setBounds(280, 37, 280, 420);
		panel_3.add(panel_5_3);

		final JPanel panel_6_14 = new JPanel();
		panel_6_14.setBackground(PanelColor);
		panel_6_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_14.setLayout(null);
		panel_6_14.setBounds(0, 0, 178, 30);
		panel_5_3.add(panel_6_14);

		final JPanel panel_6_1_1 = new JPanel();
		panel_6_1_1.setBackground(Color.BLACK);
		panel_6_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBounds(0, 30, 280, 30);
		panel_5_3.add(panel_6_1_1);

		final JLabel mentalStatusLabel_1 = new JLabel();
		mentalStatusLabel_1.setForeground(Color.WHITE);
		mentalStatusLabel_1.setText("Cardiovascular");
		mentalStatusLabel_1.setBounds(81, 10, 115, 16);
		panel_6_1_1.add(mentalStatusLabel_1);

		final JPanel panel_6_2_1 = new JPanel();
		panel_6_2_1.setBackground(PanelColor);
		panel_6_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_2_1.setLayout(null);
		panel_6_2_1.setBounds(0, 60, 178, 30);
		panel_5_3.add(panel_6_2_1);

		final JLabel alertLabel_10 = new JLabel();
		alertLabel_10.setText("Regular Rhythm");
		alertLabel_10.setBounds(10, 8, 112, 16);
		panel_6_2_1.add(alertLabel_10);

		final JPanel panel_6_3_1 = new JPanel();
		panel_6_3_1.setBackground(PanelColor);
		panel_6_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_3_1.setLayout(null);
		panel_6_3_1.setBounds(0, 90, 178, 30);
		panel_5_3.add(panel_6_3_1);

		final JLabel alertLabel_1_1 = new JLabel();
		alertLabel_1_1.setText("Radial/Apical Irregular");
		alertLabel_1_1.setBounds(10, 8, 134, 16);
		panel_6_3_1.add(alertLabel_1_1);

		final JPanel panel_6_4_1 = new JPanel();
		panel_6_4_1.setBackground(PanelColor);
		panel_6_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_1.setLayout(null);
		panel_6_4_1.setBounds(0, 120, 178, 30);
		panel_5_3.add(panel_6_4_1);

		final JLabel alertLabel_2_1 = new JLabel();
		alertLabel_2_1.setText("Chest Pain ");
		alertLabel_2_1.setBounds(46, 8, 66, 16);
		panel_6_4_1.add(alertLabel_2_1);

		final JPanel panel_6_5_1 = new JPanel();
		panel_6_5_1.setBackground(PanelColor);
		panel_6_5_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_5_1.setLayout(null);
		panel_6_5_1.setBounds(0, 150, 178, 30);
		panel_5_3.add(panel_6_5_1);

		final JLabel alertLabel_3_1 = new JLabel();
		alertLabel_3_1.setText("Ederna");
		alertLabel_3_1.setBounds(46, 8, 66, 16);
		panel_6_5_1.add(alertLabel_3_1);

		final JPanel panel_6_6_1 = new JPanel();
		panel_6_6_1.setBackground(PanelColor);
		panel_6_6_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_6_1.setLayout(null);
		panel_6_6_1.setBounds(0, 180, 178, 30);
		panel_5_3.add(panel_6_6_1);

		final JLabel alertLabel_4_1 = new JLabel();
		alertLabel_4_1.setText("Pedal Lt/Rt");
		alertLabel_4_1.setBounds(46, 8, 66, 16);
		panel_6_6_1.add(alertLabel_4_1);

		final JPanel panel_6_7_1 = new JPanel();
		panel_6_7_1.setBackground(PanelColor);
		panel_6_7_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_7_1.setLayout(null);
		panel_6_7_1.setBounds(0, 210, 178, 30);
		panel_5_3.add(panel_6_7_1);

		final JLabel alertLabel_5_1 = new JLabel();
		alertLabel_5_1.setText("Pitting+1");
		alertLabel_5_1.setBounds(10, 8, 127, 16);
		panel_6_7_1.add(alertLabel_5_1);

		final JPanel panel_6_8_1 = new JPanel();
		panel_6_8_1.setBackground(PanelColor);
		panel_6_8_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_8_1.setLayout(null);
		panel_6_8_1.setBounds(0, 240, 178, 30);
		panel_5_3.add(panel_6_8_1);

		final JLabel alertLabel_6_1 = new JLabel();
		alertLabel_6_1.setText("+2");
		alertLabel_6_1.setBounds(46, 8, 104, 16);
		panel_6_8_1.add(alertLabel_6_1);

		final JPanel panel_6_9_1 = new JPanel();
		panel_6_9_1.setBackground(PanelColor);
		panel_6_9_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_9_1.setLayout(null);
		panel_6_9_1.setBounds(0, 270, 178, 30);
		panel_5_3.add(panel_6_9_1);

		final JLabel alertLabel_7_1 = new JLabel();
		alertLabel_7_1.setText("+3");
		alertLabel_7_1.setBounds(46, 8, 81, 16);
		panel_6_9_1.add(alertLabel_7_1);

		final JPanel panel_6_10_1 = new JPanel();
		panel_6_10_1.setBackground(PanelColor);
		panel_6_10_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_10_1.setLayout(null);
		panel_6_10_1.setBounds(0, 300, 178, 30);
		panel_5_3.add(panel_6_10_1);

		final JLabel alertLabel_8_1 = new JLabel();
		alertLabel_8_1.setText("+4");
		alertLabel_8_1.setBounds(46, 8, 79, 16);
		panel_6_10_1.add(alertLabel_8_1);

		final JPanel panel_6_11_1 = new JPanel();
		panel_6_11_1.setBackground(PanelColor);
		panel_6_11_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_11_1.setLayout(null);
		panel_6_11_1.setBounds(0, 330, 178, 30);
		panel_5_3.add(panel_6_11_1);

		final JLabel alertLabel_9_1 = new JLabel();
		alertLabel_9_1.setText("Abnormal Peripheral Pulses");
		alertLabel_9_1.setBounds(10, 8, 168, 16);
		panel_6_11_1.add(alertLabel_9_1);

		final JPanel panel_6_12_1 = new JPanel();
		panel_6_12_1.setBackground(PanelColor);
		panel_6_12_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_12_1.setLayout(null);
		panel_6_12_1.setBounds(0, 360, 178, 30);
		panel_5_3.add(panel_6_12_1);

		final JLabel alertLabel_9_1_2 = new JLabel();
		alertLabel_9_1_2.setText("WNL");
		alertLabel_9_1_2.setBounds(10, 8, 138, 16);
		panel_6_12_1.add(alertLabel_9_1_2);

		final JPanel panel_6_13_1 = new JPanel();
		panel_6_13_1.setBackground(PanelColor);
		panel_6_13_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_13_1.setLayout(null);
		panel_6_13_1.setBounds(0, 390, 178, 30);
		panel_5_3.add(panel_6_13_1);

		final JPanel panel_7_1 = new JPanel();
		panel_7_1.setLayout(null);
		panel_7_1.setBounds(178, 0, 102, 30);
		panel_5_3.add(panel_7_1);

		final JPanel panel_8_3 = new JPanel();
		panel_8_3.setBackground(PanelColor);
		panel_8_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3.setBounds(0, 0, 34, 30);
		panel_7_1.add(panel_8_3);

		final JLabel nLabel_3 = new JLabel();
		nLabel_3.setText("N");
		panel_8_3.add(nLabel_3);

		final JPanel panel_8_1_1 = new JPanel();
		panel_8_1_1.setBackground(PanelColor);
		panel_8_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1.setBounds(34, 0, 34, 30);
		panel_7_1.add(panel_8_1_1);

		final JLabel nLabel_1_1 = new JLabel();
		nLabel_1_1.setText("D");
		panel_8_1_1.add(nLabel_1_1);

		final JPanel panel_8_2_1 = new JPanel();
		panel_8_2_1.setBackground(PanelColor);
		panel_8_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_1.setBounds(68, 0, 34, 30);
		panel_7_1.add(panel_8_2_1);

		final JLabel nLabel_2_1 = new JLabel();
		nLabel_2_1.setText("E");
		panel_8_2_1.add(nLabel_2_1);

		final JPanel panel_7_2_1 = new JPanel();
		panel_7_2_1.setLayout(null);
		panel_7_2_1.setBounds(178, 60, 102, 30);
		panel_5_3.add(panel_7_2_1);

		final JPanel panel_8_6_1 = new JPanel();
		panel_8_6_1.setBackground(PanelColor);
		panel_8_6_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_6_1.setBounds(0, 0, 34, 30);
		panel_7_2_1.add(panel_8_6_1);

		cbRegularRhythmN = new JCheckBox();
		cbRegularRhythmN.setBackground(PanelColor);
		cbRegularRhythmN.setText("");
		panel_8_6_1.add(cbRegularRhythmN);

		final JPanel panel_8_7_1 = new JPanel();
		panel_8_7_1.setBackground(PanelColor);
		panel_8_7_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_7_1.setBounds(34, 0, 34, 30);
		panel_7_2_1.add(panel_8_7_1);

		cbRegularRhythmD = new JCheckBox();
		cbRegularRhythmD.setBackground(PanelColor);
		cbRegularRhythmD.setText("");
		panel_8_7_1.add(cbRegularRhythmD);

		final JPanel panel_8_8_1 = new JPanel();
		panel_8_8_1.setBackground(PanelColor);
		panel_8_8_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_8_1.setBounds(68, 0, 34, 30);
		panel_7_2_1.add(panel_8_8_1);

		cbRegularRhythmE = new JCheckBox();
		cbRegularRhythmE.setBackground(PanelColor);
		cbRegularRhythmE.setText("");
		panel_8_8_1.add(cbRegularRhythmE);

		final JPanel panel_7_3_1 = new JPanel();
		panel_7_3_1.setLayout(null);
		panel_7_3_1.setBounds(178, 90, 102, 30);
		panel_5_3.add(panel_7_3_1);

		final JPanel panel_8_9_1 = new JPanel();
		panel_8_9_1.setBackground(PanelColor);
		panel_8_9_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_9_1.setBounds(0, 0, 34, 30);
		panel_7_3_1.add(panel_8_9_1);

		cbRadialApicalIrregularN = new JCheckBox();
		cbRadialApicalIrregularN.setBackground(PanelColor);
		cbRadialApicalIrregularN.setText("");
		panel_8_9_1.add(cbRadialApicalIrregularN);

		final JPanel panel_8_10_1 = new JPanel();
		panel_8_10_1.setBackground(PanelColor);
		panel_8_10_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_1.setBounds(34, 0, 34, 30);
		panel_7_3_1.add(panel_8_10_1);

		cbRadialApicalIrregularD = new JCheckBox();
		cbRadialApicalIrregularD.setBackground(PanelColor);
		cbRadialApicalIrregularD.setText("");
		panel_8_10_1.add(cbRadialApicalIrregularD);

		final JPanel panel_8_11_1 = new JPanel();
		panel_8_11_1.setBackground(PanelColor);
		panel_8_11_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_11_1.setBounds(68, 0, 34, 30);
		panel_7_3_1.add(panel_8_11_1);

		cbRadialApicalIrregularE = new JCheckBox();
		cbRadialApicalIrregularE.setBackground(PanelColor);
		cbRadialApicalIrregularE.setText("");
		panel_8_11_1.add(cbRadialApicalIrregularE);

		final JPanel panel_7_4_1 = new JPanel();
		panel_7_4_1.setLayout(null);
		panel_7_4_1.setBounds(178, 120, 102, 30);
		panel_5_3.add(panel_7_4_1);

		final JPanel panel_8_12_1 = new JPanel();
		panel_8_12_1.setBackground(PanelColor);
		panel_8_12_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_12_1.setBounds(0, 0, 34, 30);
		panel_7_4_1.add(panel_8_12_1);

		cbChestPainN = new JCheckBox();
		cbChestPainN.setBackground(PanelColor);
		cbChestPainN.setText("");
		panel_8_12_1.add(cbChestPainN);

		final JPanel panel_8_13_1 = new JPanel();
		panel_8_13_1.setBackground(PanelColor);
		panel_8_13_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_13_1.setBounds(34, 0, 34, 30);
		panel_7_4_1.add(panel_8_13_1);

		cbChestPainD = new JCheckBox();
		cbChestPainD.setBackground(PanelColor);
		cbChestPainD.setText("");
		panel_8_13_1.add(cbChestPainD);

		final JPanel panel_8_14_1 = new JPanel();
		panel_8_14_1.setBackground(PanelColor);
		panel_8_14_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_14_1.setBounds(68, 0, 34, 30);
		panel_7_4_1.add(panel_8_14_1);

		cbChestPainE = new JCheckBox();
		cbChestPainE.setBackground(PanelColor);
		cbChestPainE.setText("");
		panel_8_14_1.add(cbChestPainE);

		final JPanel panel_7_5_1 = new JPanel();
		panel_7_5_1.setBackground(Color.BLACK);
		panel_7_5_1.setLayout(null);
		panel_7_5_1.setBounds(178, 150, 102, 30);
		panel_5_3.add(panel_7_5_1);

		final JPanel panel_7_6_1 = new JPanel();
		panel_7_6_1.setLayout(null);
		panel_7_6_1.setBounds(178, 180, 102, 30);
		panel_5_3.add(panel_7_6_1);

		final JPanel panel_8_18_1 = new JPanel();
		panel_8_18_1.setBackground(PanelColor);
		panel_8_18_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_18_1.setBounds(0, 0, 34, 30);
		panel_7_6_1.add(panel_8_18_1);

		cbPedalLtRtN = new JCheckBox();
		cbPedalLtRtN.setBackground(PanelColor);
		cbPedalLtRtN.setText("");
		panel_8_18_1.add(cbPedalLtRtN);

		final JPanel panel_8_19_1 = new JPanel();
		panel_8_19_1.setBackground(PanelColor);
		panel_8_19_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_19_1.setBounds(34, 0, 34, 30);
		panel_7_6_1.add(panel_8_19_1);

		cbPedalLtRtD = new JCheckBox();
		cbPedalLtRtD.setBackground(PanelColor);
		cbPedalLtRtD.setText("");
		panel_8_19_1.add(cbPedalLtRtD);

		final JPanel panel_8_20_1 = new JPanel();
		panel_8_20_1.setBackground(PanelColor);
		panel_8_20_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_20_1.setBounds(68, 0, 34, 30);
		panel_7_6_1.add(panel_8_20_1);

		cbPedalLtRtE = new JCheckBox();
		cbPedalLtRtE.setBackground(PanelColor);
		cbPedalLtRtE.setText("");
		panel_8_20_1.add(cbPedalLtRtE);

		final JPanel panel_7_7_1 = new JPanel();
		panel_7_7_1.setLayout(null);
		panel_7_7_1.setBounds(178, 210, 102, 30);
		panel_5_3.add(panel_7_7_1);

		final JPanel panel_8_22_1 = new JPanel();
		panel_8_22_1.setBackground(PanelColor);
		panel_8_22_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_22_1.setBounds(0, 0, 34, 30);
		panel_7_7_1.add(panel_8_22_1);

		cbPitting1N = new JCheckBox();
		cbPitting1N.setBackground(PanelColor);
		cbPitting1N.setText("");
		panel_8_22_1.add(cbPitting1N);

		final JPanel panel_8_23_1 = new JPanel();
		panel_8_23_1.setBackground(PanelColor);
		panel_8_23_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_23_1.setBounds(34, 0, 34, 30);
		panel_7_7_1.add(panel_8_23_1);

		cbPitting1D = new JCheckBox();
		cbPitting1D.setBackground(PanelColor);
		cbPitting1D.setText("");
		panel_8_23_1.add(cbPitting1D);

		final JPanel panel_8_24_1 = new JPanel();
		panel_8_24_1.setBackground(PanelColor);
		panel_8_24_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_24_1.setBounds(68, 0, 34, 30);
		panel_7_7_1.add(panel_8_24_1);

		cbPitting1E = new JCheckBox();
		cbPitting1E.setBackground(PanelColor);
		cbPitting1E.setText("");
		panel_8_24_1.add(cbPitting1E);

		final JPanel panel_7_8_1 = new JPanel();
		panel_7_8_1.setLayout(null);
		panel_7_8_1.setBounds(178, 240, 102, 30);
		panel_5_3.add(panel_7_8_1);

		final JPanel panel_8_21_1 = new JPanel();
		panel_8_21_1.setBackground(PanelColor);
		panel_8_21_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_21_1.setBounds(0, 0, 34, 30);
		panel_7_8_1.add(panel_8_21_1);

		cbPitting2N = new JCheckBox();
		cbPitting2N.setBackground(PanelColor);
		cbPitting2N.setText("");
		panel_8_21_1.add(cbPitting2N);

		final JPanel panel_8_25_1 = new JPanel();
		panel_8_25_1.setBackground(PanelColor);
		panel_8_25_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_25_1.setBounds(34, 0, 34, 30);
		panel_7_8_1.add(panel_8_25_1);

		cbPitting2D = new JCheckBox();
		cbPitting2D.setBackground(PanelColor);
		cbPitting2D.setText("");
		panel_8_25_1.add(cbPitting2D);

		final JPanel panel_8_26_1 = new JPanel();
		panel_8_26_1.setBackground(PanelColor);
		panel_8_26_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_26_1.setBounds(68, 0, 34, 30);
		panel_7_8_1.add(panel_8_26_1);

		cbPitting2E = new JCheckBox();
		cbPitting2E.setBackground(PanelColor);
		cbPitting2E.setText("");
		panel_8_26_1.add(cbPitting2E);

		final JPanel panel_7_9_1 = new JPanel();
		panel_7_9_1.setLayout(null);
		panel_7_9_1.setBounds(178, 270, 102, 30);
		panel_5_3.add(panel_7_9_1);

		final JPanel panel_8_27_1 = new JPanel();
		panel_8_27_1.setBackground(PanelColor);
		panel_8_27_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_27_1.setBounds(0, 0, 34, 30);
		panel_7_9_1.add(panel_8_27_1);

		cbPitting3N = new JCheckBox();
		cbPitting3N.setBackground(PanelColor);
		cbPitting3N.setText("");
		panel_8_27_1.add(cbPitting3N);

		final JPanel panel_8_28_1 = new JPanel();
		panel_8_28_1.setBackground(PanelColor);
		panel_8_28_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_28_1.setBounds(34, 0, 34, 30);
		panel_7_9_1.add(panel_8_28_1);

		cbPitting3D = new JCheckBox();
		cbPitting3D.setBackground(PanelColor);
		cbPitting3D.setText("");
		panel_8_28_1.add(cbPitting3D);

		final JPanel panel_8_29_1 = new JPanel();
		panel_8_29_1.setBackground(PanelColor);
		panel_8_29_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_29_1.setBounds(68, 0, 34, 30);
		panel_7_9_1.add(panel_8_29_1);

		cbPitting3E = new JCheckBox();
		cbPitting3E.setBackground(PanelColor);
		cbPitting3E.setText("");
		panel_8_29_1.add(cbPitting3E);

		final JPanel panel_7_10_1 = new JPanel();
		panel_7_10_1.setLayout(null);
		panel_7_10_1.setBounds(178, 300, 102, 30);
		panel_5_3.add(panel_7_10_1);

		final JPanel panel_8_33_1 = new JPanel();
		panel_8_33_1.setBackground(PanelColor);
		panel_8_33_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_33_1.setBounds(0, 0, 34, 30);
		panel_7_10_1.add(panel_8_33_1);

		cbPitting4N = new JCheckBox();
		cbPitting4N.setBackground(PanelColor);
		cbPitting4N.setText("");
		panel_8_33_1.add(cbPitting4N);

		final JPanel panel_8_34_1 = new JPanel();
		panel_8_34_1.setBackground(PanelColor);
		panel_8_34_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_34_1.setBounds(34, 0, 34, 30);
		panel_7_10_1.add(panel_8_34_1);

		cbPitting4D = new JCheckBox();
		cbPitting4D.setBackground(PanelColor);
		cbPitting4D.setText("");
		panel_8_34_1.add(cbPitting4D);

		final JPanel panel_8_35_1 = new JPanel();
		panel_8_35_1.setBackground(PanelColor);
		panel_8_35_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_35_1.setBounds(68, 0, 34, 30);
		panel_7_10_1.add(panel_8_35_1);

		cbPitting4E = new JCheckBox();
		cbPitting4E.setBackground(PanelColor);
		cbPitting4E.setText("");
		panel_8_35_1.add(cbPitting4E);

		final JPanel panel_7_11_1 = new JPanel();
		panel_7_11_1.setLayout(null);
		panel_7_11_1.setBounds(178, 330, 102, 30);
		panel_5_3.add(panel_7_11_1);

		final JPanel panel_8_30_1 = new JPanel();
		panel_8_30_1.setBackground(PanelColor);
		panel_8_30_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_30_1.setBounds(0, 0, 34, 30);
		panel_7_11_1.add(panel_8_30_1);

		cbAbnormalPeriheralPulsesN = new JCheckBox();
		cbAbnormalPeriheralPulsesN.setBackground(PanelColor);
		cbAbnormalPeriheralPulsesN.setText("");
		panel_8_30_1.add(cbAbnormalPeriheralPulsesN);

		final JPanel panel_8_31_1 = new JPanel();
		panel_8_31_1.setBackground(PanelColor);
		panel_8_31_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_31_1.setBounds(34, 0, 34, 30);
		panel_7_11_1.add(panel_8_31_1);

		cbAbnormalPeriheralPulsesD = new JCheckBox();
		cbAbnormalPeriheralPulsesD.setBackground(PanelColor);
		cbAbnormalPeriheralPulsesD.setText("");
		panel_8_31_1.add(cbAbnormalPeriheralPulsesD);

		final JPanel panel_8_32_1 = new JPanel();
		panel_8_32_1.setBackground(PanelColor);
		panel_8_32_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_32_1.setBounds(68, 0, 34, 30);
		panel_7_11_1.add(panel_8_32_1);

		cbAbnormalPeriheralPulsesE = new JCheckBox();
		cbAbnormalPeriheralPulsesE.setBackground(PanelColor);
		cbAbnormalPeriheralPulsesE.setText("");
		panel_8_32_1.add(cbAbnormalPeriheralPulsesE);

		final JPanel panel_7_12_1 = new JPanel();
		panel_7_12_1.setLayout(null);
		panel_7_12_1.setBounds(178, 360, 102, 30);
		panel_5_3.add(panel_7_12_1);

		final JPanel panel_8_36_1 = new JPanel();
		panel_8_36_1.setBackground(PanelColor);
		panel_8_36_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_36_1.setBounds(0, 0, 34, 30);
		panel_7_12_1.add(panel_8_36_1);

		cbCardiovascularWnlN = new JCheckBox();
		cbCardiovascularWnlN.setBackground(PanelColor);
		cbCardiovascularWnlN.setText("");
		panel_8_36_1.add(cbCardiovascularWnlN);

		final JPanel panel_8_37_1 = new JPanel();
		panel_8_37_1.setBackground(PanelColor);
		panel_8_37_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_37_1.setBounds(34, 0, 34, 30);
		panel_7_12_1.add(panel_8_37_1);

		cbCardiovascularWnlD = new JCheckBox();
		cbCardiovascularWnlD.setBackground(PanelColor);
		cbCardiovascularWnlD.setText("");
		panel_8_37_1.add(cbCardiovascularWnlD);

		final JPanel panel_8_38_1 = new JPanel();
		panel_8_38_1.setBackground(PanelColor);
		panel_8_38_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_38_1.setBounds(68, 0, 34, 30);
		panel_7_12_1.add(panel_8_38_1);

		cbCardiovascularWnlE = new JCheckBox();
		cbCardiovascularWnlE.setBackground(PanelColor);
		cbCardiovascularWnlE.setText("");
		panel_8_38_1.add(cbCardiovascularWnlE);

		final JPanel panel_7_13_1 = new JPanel();
		panel_7_13_1.setLayout(null);
		panel_7_13_1.setBounds(178, 390, 102, 30);
		panel_5_3.add(panel_7_13_1);

		final JPanel panel_8_39_1 = new JPanel();
		panel_8_39_1.setBackground(PanelColor);
		panel_8_39_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_39_1.setBounds(0, 0, 34, 30);
		panel_7_13_1.add(panel_8_39_1);

		final JPanel panel_8_40_1 = new JPanel();
		panel_8_40_1.setBackground(PanelColor);
		panel_8_40_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_40_1.setBounds(34, 0, 34, 30);
		panel_7_13_1.add(panel_8_40_1);

		final JPanel panel_8_41_1 = new JPanel();
		panel_8_41_1.setBackground(PanelColor);
		panel_8_41_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_41_1.setBounds(68, 0, 34, 30);
		panel_7_13_1.add(panel_8_41_1);

		final JPanel panel_5_1 = new JPanel();
		panel_5_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1.setLayout(null);
		panel_5_1.setBounds(560, 37, 281, 480);
		panel_3.add(panel_5_1);

		final JPanel panel_6_15 = new JPanel();
		panel_6_15.setBackground(PanelColor);
		panel_6_15.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_15.setLayout(null);
		panel_6_15.setBounds(0, 0, 178, 30);
		panel_5_1.add(panel_6_15);

		final JPanel panel_6_1_2 = new JPanel();
		panel_6_1_2.setBackground(Color.BLACK);
		panel_6_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_2.setLayout(null);
		panel_6_1_2.setBounds(0, 30, 280, 30);
		panel_5_1.add(panel_6_1_2);

		final JLabel mentalStatusLabel_2 = new JLabel();
		mentalStatusLabel_2.setForeground(Color.WHITE);
		mentalStatusLabel_2.setText("GL");
		mentalStatusLabel_2.setBounds(81, 10, 115, 16);
		panel_6_1_2.add(mentalStatusLabel_2);

		final JPanel panel_6_2_2 = new JPanel();
		panel_6_2_2.setBackground(PanelColor);
		panel_6_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_2_2.setLayout(null);
		panel_6_2_2.setBounds(0, 60, 178, 30);
		panel_5_1.add(panel_6_2_2);

		final JLabel alertLabel_11 = new JLabel();
		alertLabel_11.setText("Nausea/ Vomiting");
		alertLabel_11.setBounds(10, 8, 158, 16);
		panel_6_2_2.add(alertLabel_11);

		final JPanel panel_6_3_2 = new JPanel();
		panel_6_3_2.setBackground(PanelColor);
		panel_6_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_3_2.setLayout(null);
		panel_6_3_2.setBounds(0, 90, 178, 30);
		panel_5_1.add(panel_6_3_2);

		final JLabel alertLabel_1_2 = new JLabel();
		alertLabel_1_2.setText("Epigastic Distress");
		alertLabel_1_2.setBounds(10, 8, 130, 16);
		panel_6_3_2.add(alertLabel_1_2);

		final JPanel panel_6_4_2 = new JPanel();
		panel_6_4_2.setBackground(PanelColor);
		panel_6_4_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_2.setLayout(null);
		panel_6_4_2.setBounds(0, 120, 178, 30);
		panel_5_1.add(panel_6_4_2);

		final JLabel alertLabel_2_2 = new JLabel();
		alertLabel_2_2.setText("Difficulty Swallowing");
		alertLabel_2_2.setBounds(10, 8, 102, 16);
		panel_6_4_2.add(alertLabel_2_2);

		final JPanel panel_6_5_2 = new JPanel();
		panel_6_5_2.setBackground(PanelColor);
		panel_6_5_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_5_2.setLayout(null);
		panel_6_5_2.setBounds(0, 150, 178, 30);
		panel_5_1.add(panel_6_5_2);

		final JLabel alertLabel_3_2 = new JLabel();
		alertLabel_3_2.setText("Abdominal Distention");
		alertLabel_3_2.setBounds(10, 8, 102, 16);
		panel_6_5_2.add(alertLabel_3_2);

		final JPanel panel_6_6_2 = new JPanel();
		panel_6_6_2.setBackground(PanelColor);
		panel_6_6_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_6_2.setLayout(null);
		panel_6_6_2.setBounds(0, 180, 178, 30);
		panel_5_1.add(panel_6_6_2);

		final JLabel alertLabel_4_2 = new JLabel();
		alertLabel_4_2.setText("Diarrhea");
		alertLabel_4_2.setBounds(10, 8, 102, 16);
		panel_6_6_2.add(alertLabel_4_2);

		final JPanel panel_6_7_2 = new JPanel();
		panel_6_7_2.setBackground(PanelColor);
		panel_6_7_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_7_2.setLayout(null);
		panel_6_7_2.setBounds(0, 210, 178, 30);
		panel_5_1.add(panel_6_7_2);

		final JLabel alertLabel_5_2 = new JLabel();
		alertLabel_5_2.setText("Constipation");
		alertLabel_5_2.setBounds(10, 8, 127, 16);
		panel_6_7_2.add(alertLabel_5_2);

		final JPanel panel_6_8_2 = new JPanel();
		panel_6_8_2.setBackground(PanelColor);
		panel_6_8_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_8_2.setLayout(null);
		panel_6_8_2.setBounds(0, 240, 178, 30);
		panel_5_1.add(panel_6_8_2);

		final JLabel alertLabel_6_2 = new JLabel();
		alertLabel_6_2.setText("Bowel Sounds");
		alertLabel_6_2.setBounds(10, 8, 138, 16);
		panel_6_8_2.add(alertLabel_6_2);

		final JPanel panel_6_9_2 = new JPanel();
		panel_6_9_2.setBackground(PanelColor);
		panel_6_9_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_9_2.setLayout(null);
		panel_6_9_2.setBounds(0, 270, 178, 30);
		panel_5_1.add(panel_6_9_2);

		final JLabel alertLabel_7_2 = new JLabel();
		alertLabel_7_2.setText("Present");
		alertLabel_7_2.setBounds(10, 8, 158, 16);
		panel_6_9_2.add(alertLabel_7_2);

		final JPanel panel_6_10_2 = new JPanel();
		panel_6_10_2.setBackground(PanelColor);
		panel_6_10_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_10_2.setLayout(null);
		panel_6_10_2.setBounds(0, 300, 178, 30);
		panel_5_1.add(panel_6_10_2);

		final JLabel alertLabel_8_2 = new JLabel();
		alertLabel_8_2.setText("Absent");
		alertLabel_8_2.setBounds(10, 8, 126, 16);
		panel_6_10_2.add(alertLabel_8_2);

		final JPanel panel_6_11_2 = new JPanel();
		panel_6_11_2.setBackground(PanelColor);
		panel_6_11_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_11_2.setLayout(null);
		panel_6_11_2.setBounds(0, 330, 178, 30);
		panel_5_1.add(panel_6_11_2);

		final JLabel alertLabel_9_2 = new JLabel();
		alertLabel_9_2.setText("HyperActive");
		alertLabel_9_2.setBounds(10, 8, 138, 16);
		panel_6_11_2.add(alertLabel_9_2);

		final JPanel panel_6_12_2 = new JPanel();
		panel_6_12_2.setBackground(PanelColor);
		panel_6_12_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_12_2.setLayout(null);
		panel_6_12_2.setBounds(0, 360, 178, 30);
		panel_5_1.add(panel_6_12_2);

		final JLabel alertLabel_9_2_1 = new JLabel();
		alertLabel_9_2_1.setText("HypoActive");
		alertLabel_9_2_1.setBounds(10, 8, 138, 16);
		panel_6_12_2.add(alertLabel_9_2_1);

		final JPanel panel_6_13_2 = new JPanel();
		panel_6_13_2.setBackground(PanelColor);
		panel_6_13_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_13_2.setLayout(null);
		panel_6_13_2.setBounds(0, 390, 178, 30);
		panel_5_1.add(panel_6_13_2);

		final JPanel panel_7_14 = new JPanel();
		panel_7_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_14.setLayout(null);
		panel_7_14.setBounds(178, 0, 102, 30);
		panel_5_1.add(panel_7_14);

		final JPanel panel_8_4 = new JPanel();
		panel_8_4.setBackground(PanelColor);
		panel_8_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_4.setBounds(0, 0, 34, 30);
		panel_7_14.add(panel_8_4);

		final JLabel nLabel_4 = new JLabel();
		nLabel_4.setText("N");
		panel_8_4.add(nLabel_4);

		final JPanel panel_8_1_2 = new JPanel();
		panel_8_1_2.setBackground(PanelColor);
		panel_8_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2.setBounds(34, 0, 34, 30);
		panel_7_14.add(panel_8_1_2);

		final JLabel nLabel_1_2 = new JLabel();
		nLabel_1_2.setText("D");
		panel_8_1_2.add(nLabel_1_2);

		final JPanel panel_8_2_2 = new JPanel();
		panel_8_2_2.setBackground(PanelColor);
		panel_8_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_2.setBounds(68, 0, 34, 30);
		panel_7_14.add(panel_8_2_2);

		final JLabel nLabel_2_2 = new JLabel();
		nLabel_2_2.setText("E");
		panel_8_2_2.add(nLabel_2_2);

		final JPanel panel_7_2_2 = new JPanel();
		panel_7_2_2.setLayout(null);
		panel_7_2_2.setBounds(178, 60, 102, 30);
		panel_5_1.add(panel_7_2_2);

		final JPanel panel_8_6_2 = new JPanel();
		panel_8_6_2.setBackground(PanelColor);
		panel_8_6_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_6_2.setBounds(0, 0, 34, 30);
		panel_7_2_2.add(panel_8_6_2);

		cbNauseaVomittingN = new JCheckBox();
		cbNauseaVomittingN.setBackground(PanelColor);
		cbNauseaVomittingN.setText("");
		panel_8_6_2.add(cbNauseaVomittingN);

		final JPanel panel_8_7_2 = new JPanel();
		panel_8_7_2.setBackground(PanelColor);
		panel_8_7_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_7_2.setBounds(34, 0, 34, 30);
		panel_7_2_2.add(panel_8_7_2);

		cbNauseaVomittingD = new JCheckBox();
		cbNauseaVomittingD.setBackground(PanelColor);
		cbNauseaVomittingD.setText("");
		panel_8_7_2.add(cbNauseaVomittingD);

		final JPanel panel_8_8_2 = new JPanel();
		panel_8_8_2.setBackground(PanelColor);
		panel_8_8_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_8_2.setBounds(68, 0, 34, 30);
		panel_7_2_2.add(panel_8_8_2);

		cbNauseaVomittingE = new JCheckBox();
		cbNauseaVomittingE.setBackground(PanelColor);
		cbNauseaVomittingE.setText("");
		panel_8_8_2.add(cbNauseaVomittingE);

		final JPanel panel_7_3_2 = new JPanel();
		panel_7_3_2.setLayout(null);
		panel_7_3_2.setBounds(178, 90, 102, 30);
		panel_5_1.add(panel_7_3_2);

		final JPanel panel_8_9_2 = new JPanel();
		panel_8_9_2.setBackground(PanelColor);
		panel_8_9_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_9_2.setBounds(0, 0, 34, 30);
		panel_7_3_2.add(panel_8_9_2);

		cbEpigasticDistressN = new JCheckBox();
		cbEpigasticDistressN.setBackground(PanelColor);
		cbEpigasticDistressN.setText("");
		panel_8_9_2.add(cbEpigasticDistressN);

		final JPanel panel_8_10_2 = new JPanel();
		panel_8_10_2.setBackground(PanelColor);
		panel_8_10_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_2.setBounds(34, 0, 34, 30);
		panel_7_3_2.add(panel_8_10_2);

		cbEpigasticDistressD = new JCheckBox();
		cbEpigasticDistressD.setBackground(PanelColor);
		cbEpigasticDistressD.setText("");
		panel_8_10_2.add(cbEpigasticDistressD);

		final JPanel panel_8_11_2 = new JPanel();
		panel_8_11_2.setBackground(PanelColor);
		panel_8_11_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_11_2.setBounds(68, 0, 34, 30);
		panel_7_3_2.add(panel_8_11_2);

		cbEpigasticDistressE = new JCheckBox();
		cbEpigasticDistressE.setBackground(PanelColor);
		cbEpigasticDistressE.setText("");
		panel_8_11_2.add(cbEpigasticDistressE);

		final JPanel panel_7_4_2 = new JPanel();
		panel_7_4_2.setLayout(null);
		panel_7_4_2.setBounds(178, 120, 102, 30);
		panel_5_1.add(panel_7_4_2);

		final JPanel panel_8_12_2 = new JPanel();
		panel_8_12_2.setBackground(PanelColor);
		panel_8_12_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_12_2.setBounds(0, 0, 34, 30);
		panel_7_4_2.add(panel_8_12_2);

		cbDifficaultySwallowingN = new JCheckBox();
		cbDifficaultySwallowingN.setBackground(PanelColor);
		cbDifficaultySwallowingN.setText("");
		panel_8_12_2.add(cbDifficaultySwallowingN);

		final JPanel panel_8_13_2 = new JPanel();
		panel_8_13_2.setBackground(PanelColor);
		panel_8_13_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_13_2.setBounds(34, 0, 34, 30);
		panel_7_4_2.add(panel_8_13_2);

		cbDifficaultySwallowingD = new JCheckBox();
		cbDifficaultySwallowingD.setBackground(PanelColor);
		cbDifficaultySwallowingD.setText("");
		panel_8_13_2.add(cbDifficaultySwallowingD);

		final JPanel panel_8_14_2 = new JPanel();
		panel_8_14_2.setBackground(PanelColor);
		panel_8_14_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_14_2.setBounds(68, 0, 34, 30);
		panel_7_4_2.add(panel_8_14_2);

		cbDifficaultySwallowingE = new JCheckBox();
		cbDifficaultySwallowingE.setBackground(PanelColor);
		cbDifficaultySwallowingE.setText("");
		panel_8_14_2.add(cbDifficaultySwallowingE);

		final JPanel panel_7_5_2 = new JPanel();
		panel_7_5_2.setLayout(null);
		panel_7_5_2.setBounds(178, 150, 102, 30);
		panel_5_1.add(panel_7_5_2);

		final JPanel panel_8_15_2 = new JPanel();
		panel_8_15_2.setBackground(PanelColor);
		panel_8_15_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_15_2.setBounds(0, 0, 34, 30);
		panel_7_5_2.add(panel_8_15_2);

		cbAbdominalDistentonN = new JCheckBox();
		cbAbdominalDistentonN.setBackground(PanelColor);
		cbAbdominalDistentonN.setText("");
		panel_8_15_2.add(cbAbdominalDistentonN);

		final JPanel panel_8_16_2 = new JPanel();
		panel_8_16_2.setBackground(PanelColor);
		panel_8_16_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_16_2.setBounds(34, 0, 34, 30);
		panel_7_5_2.add(panel_8_16_2);

		cbAbdominalDistentonD = new JCheckBox();
		cbAbdominalDistentonD.setText("");
		cbAbdominalDistentonD.setBackground(PanelColor);
		panel_8_16_2.add(cbAbdominalDistentonD);

		final JPanel panel_8_17_2 = new JPanel();
		panel_8_17_2.setBackground(PanelColor);
		panel_8_17_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_17_2.setBounds(68, 0, 34, 30);
		panel_7_5_2.add(panel_8_17_2);

		cbAbdominalDistentonE = new JCheckBox();
		cbAbdominalDistentonE.setBackground(PanelColor);
		cbAbdominalDistentonE.setText("");
		panel_8_17_2.add(cbAbdominalDistentonE);

		final JPanel panel_7_6_2 = new JPanel();
		panel_7_6_2.setLayout(null);
		panel_7_6_2.setBounds(178, 180, 102, 30);
		panel_5_1.add(panel_7_6_2);

		final JPanel panel_8_18_2 = new JPanel();
		panel_8_18_2.setBackground(PanelColor);
		panel_8_18_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_18_2.setBounds(0, 0, 34, 30);
		panel_7_6_2.add(panel_8_18_2);

		cbDiarrheaN = new JCheckBox();
		cbDiarrheaN.setBackground(PanelColor);
		cbDiarrheaN.setText("");
		panel_8_18_2.add(cbDiarrheaN);

		final JPanel panel_8_19_2 = new JPanel();
		panel_8_19_2.setBackground(PanelColor);
		panel_8_19_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_19_2.setBounds(34, 0, 34, 30);
		panel_7_6_2.add(panel_8_19_2);

		cbDiarrheaD = new JCheckBox();
		cbDiarrheaD.setBackground(PanelColor);
		cbDiarrheaD.setText("");
		panel_8_19_2.add(cbDiarrheaD);

		final JPanel panel_8_20_2 = new JPanel();
		panel_8_20_2.setBackground(PanelColor);
		panel_8_20_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_20_2.setBounds(68, 0, 34, 30);
		panel_7_6_2.add(panel_8_20_2);

		cbDiarrheaE = new JCheckBox();
		cbDiarrheaE.setBackground(PanelColor);
		cbDiarrheaE.setText("");
		panel_8_20_2.add(cbDiarrheaE);

		final JPanel panel_7_7_2 = new JPanel();
		panel_7_7_2.setLayout(null);
		panel_7_7_2.setBounds(178, 210, 102, 30);
		panel_5_1.add(panel_7_7_2);

		final JPanel panel_8_22_2 = new JPanel();
		panel_8_22_2.setBackground(PanelColor);
		panel_8_22_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_22_2.setBounds(0, 0, 34, 30);
		panel_7_7_2.add(panel_8_22_2);

		cbConstipationN = new JCheckBox();
		cbConstipationN.setBackground(PanelColor);
		cbConstipationN.setText("");
		panel_8_22_2.add(cbConstipationN);

		final JPanel panel_8_23_2 = new JPanel();
		panel_8_23_2.setBackground(PanelColor);
		panel_8_23_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_23_2.setBounds(34, 0, 34, 30);
		panel_7_7_2.add(panel_8_23_2);

		cbConstipationD = new JCheckBox();
		cbConstipationD.setBackground(PanelColor);
		cbConstipationD.setText("");
		panel_8_23_2.add(cbConstipationD);

		final JPanel panel_8_24_2 = new JPanel();
		panel_8_24_2.setBackground(PanelColor);
		panel_8_24_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_24_2.setBounds(68, 0, 34, 30);
		panel_7_7_2.add(panel_8_24_2);

		cbConstipationE = new JCheckBox();
		cbConstipationE.setBackground(PanelColor);
		cbConstipationE.setText("");
		panel_8_24_2.add(cbConstipationE);

		final JPanel panel_7_8_2 = new JPanel();
		panel_7_8_2.setLayout(null);
		panel_7_8_2.setBounds(178, 240, 102, 30);
		panel_5_1.add(panel_7_8_2);

		final JPanel panel_8_21_2 = new JPanel();
		panel_8_21_2.setBackground(PanelColor);
		panel_8_21_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_21_2.setBounds(0, 0, 34, 30);
		panel_7_8_2.add(panel_8_21_2);

		cbBowelSoundsN = new JCheckBox();
		cbBowelSoundsN.setBackground(PanelColor);
		cbBowelSoundsN.setText("");
		panel_8_21_2.add(cbBowelSoundsN);

		final JPanel panel_8_25_2 = new JPanel();
		panel_8_25_2.setBackground(PanelColor);
		panel_8_25_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_25_2.setBounds(34, 0, 34, 30);
		panel_7_8_2.add(panel_8_25_2);

		cbBowelSoundsD = new JCheckBox();
		cbBowelSoundsD.setBackground(PanelColor);
		cbBowelSoundsD.setText("");
		panel_8_25_2.add(cbBowelSoundsD);

		final JPanel panel_8_26_2 = new JPanel();
		panel_8_26_2.setBackground(PanelColor);
		panel_8_26_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_26_2.setBounds(68, 0, 34, 30);
		panel_7_8_2.add(panel_8_26_2);

		cbBowelSoundsE = new JCheckBox();
		cbBowelSoundsE.setBackground(PanelColor);
		cbBowelSoundsE.setText("");
		panel_8_26_2.add(cbBowelSoundsE);

		final JPanel panel_7_9_2 = new JPanel();
		panel_7_9_2.setLayout(null);
		panel_7_9_2.setBounds(178, 270, 102, 30);
		panel_5_1.add(panel_7_9_2);

		final JPanel panel_8_27_2 = new JPanel();
		panel_8_27_2.setBackground(PanelColor);
		panel_8_27_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_27_2.setBounds(0, 0, 34, 30);
		panel_7_9_2.add(panel_8_27_2);

		cbPresentN = new JCheckBox();
		cbPresentN.setBackground(PanelColor);
		cbPresentN.setText("");
		panel_8_27_2.add(cbPresentN);

		final JPanel panel_8_28_2 = new JPanel();
		panel_8_28_2.setBackground(PanelColor);
		panel_8_28_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_28_2.setBounds(34, 0, 34, 30);
		panel_7_9_2.add(panel_8_28_2);

		cbPresentD = new JCheckBox();
		cbPresentD.setBackground(PanelColor);
		cbPresentD.setText("");
		panel_8_28_2.add(cbPresentD);

		final JPanel panel_8_29_2 = new JPanel();
		panel_8_29_2.setBackground(PanelColor);
		panel_8_29_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_29_2.setBounds(68, 0, 34, 30);
		panel_7_9_2.add(panel_8_29_2);

		cbPresentE = new JCheckBox();
		cbPresentE.setBackground(PanelColor);
		cbPresentE.setText("");
		panel_8_29_2.add(cbPresentE);

		final JPanel panel_7_10_2 = new JPanel();
		panel_7_10_2.setLayout(null);
		panel_7_10_2.setBounds(178, 300, 102, 30);
		panel_5_1.add(panel_7_10_2);

		final JPanel panel_8_33_2 = new JPanel();
		panel_8_33_2.setBackground(PanelColor);
		panel_8_33_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_33_2.setBounds(0, 0, 34, 30);
		panel_7_10_2.add(panel_8_33_2);

		cbAbsentN = new JCheckBox();
		cbAbsentN.setBackground(PanelColor);
		cbAbsentN.setText("");
		panel_8_33_2.add(cbAbsentN);

		final JPanel panel_8_34_2 = new JPanel();
		panel_8_34_2.setBackground(PanelColor);
		panel_8_34_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_34_2.setBounds(34, 0, 34, 30);
		panel_7_10_2.add(panel_8_34_2);

		cbAbsentD = new JCheckBox();
		cbAbsentD.setBackground(PanelColor);
		cbAbsentD.setText("");
		panel_8_34_2.add(cbAbsentD);

		final JPanel panel_8_35_2 = new JPanel();
		panel_8_35_2.setBackground(PanelColor);
		panel_8_35_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_35_2.setBounds(68, 0, 34, 30);
		panel_7_10_2.add(panel_8_35_2);

		cbAbsentE = new JCheckBox();
		cbAbsentE.setBackground(PanelColor);
		cbAbsentE.setText("");
		panel_8_35_2.add(cbAbsentE);

		final JPanel panel_7_11_2 = new JPanel();
		panel_7_11_2.setLayout(null);
		panel_7_11_2.setBounds(178, 330, 102, 30);
		panel_5_1.add(panel_7_11_2);

		panel_8_30_2 = new JPanel();
		panel_8_30_2.setBackground(PanelColor);
		panel_8_30_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_30_2.setBounds(0, 0, 34, 30);
		panel_7_11_2.add(panel_8_30_2);

		cbHyperActiveN = new JCheckBox();
		cbHyperActiveN.setBackground(PanelColor);
		cbHyperActiveN.setText("");
		panel_8_30_2.add(cbHyperActiveN);

		final JPanel panel_8_31_2 = new JPanel();
		panel_8_31_2.setBackground(PanelColor);
		panel_8_31_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_31_2.setBounds(34, 0, 34, 30);
		panel_7_11_2.add(panel_8_31_2);

		cbHyperActiveD = new JCheckBox();
		cbHyperActiveD.setBackground(PanelColor);
		cbHyperActiveD.setText("");
		panel_8_31_2.add(cbHyperActiveD);

		final JPanel panel_8_32_2 = new JPanel();
		panel_8_32_2.setBackground(PanelColor);
		panel_8_32_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_32_2.setBounds(68, 0, 34, 30);
		panel_7_11_2.add(panel_8_32_2);

		cbHyperActiveE = new JCheckBox();
		cbHyperActiveE.setBackground(PanelColor);
		cbHyperActiveE.setText("");
		panel_8_32_2.add(cbHyperActiveE);

		final JPanel panel_7_12_2 = new JPanel();
		panel_7_12_2.setLayout(null);
		panel_7_12_2.setBounds(178, 360, 102, 30);
		panel_5_1.add(panel_7_12_2);

		final JPanel panel_8_36_2 = new JPanel();
		panel_8_36_2.setBackground(PanelColor);
		panel_8_36_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_36_2.setBounds(0, 0, 34, 30);
		panel_7_12_2.add(panel_8_36_2);

		cbHypoActiveN = new JCheckBox();
		cbHypoActiveN.setBackground(Color.WHITE);
		cbHypoActiveN.setText("");
		panel_8_36_2.add(cbHypoActiveN);

		final JPanel panel_8_37_2 = new JPanel();
		panel_8_37_2.setBackground(PanelColor);
		panel_8_37_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_37_2.setBounds(34, 0, 34, 30);
		panel_7_12_2.add(panel_8_37_2);

		cbHypoActiveD = new JCheckBox();
		cbHypoActiveD.setBackground(Color.WHITE);
		cbHypoActiveD.setText("");
		panel_8_37_2.add(cbHypoActiveD);

		final JPanel panel_8_38_2 = new JPanel();
		panel_8_38_2.setBackground(PanelColor);
		panel_8_38_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_38_2.setBounds(68, 0, 34, 30);
		panel_7_12_2.add(panel_8_38_2);

		cbHypoActiveE = new JCheckBox();
		cbHypoActiveE.setBackground(Color.WHITE);
		cbHypoActiveE.setText("");
		panel_8_38_2.add(cbHypoActiveE);

		final JPanel panel_7_13_2 = new JPanel();
		panel_7_13_2.setLayout(null);
		panel_7_13_2.setBounds(178, 390, 102, 30);
		panel_5_1.add(panel_7_13_2);

		final JPanel panel_8_39_2 = new JPanel();
		panel_8_39_2.setBackground(PanelColor);
		panel_8_39_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_39_2.setBounds(0, 0, 34, 30);
		panel_7_13_2.add(panel_8_39_2);

		final JPanel panel_8_40_2 = new JPanel();
		panel_8_40_2.setBackground(PanelColor);
		panel_8_40_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_40_2.setBounds(34, 0, 34, 30);
		panel_7_13_2.add(panel_8_40_2);

		final JPanel panel_8_41_2 = new JPanel();
		panel_8_41_2.setBackground(PanelColor);
		panel_8_41_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_41_2.setBounds(68, 0, 34, 30);
		panel_7_13_2.add(panel_8_41_2);

		final JPanel panel_6_13_2_1 = new JPanel();
		panel_6_13_2_1.setBackground(PanelColor);
		panel_6_13_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_13_2_1.setLayout(null);
		panel_6_13_2_1.setBounds(0, 420, 178, 30);
		panel_5_1.add(panel_6_13_2_1);

		final JPanel panel_6_13_2_2 = new JPanel();
		panel_6_13_2_2.setBackground(PanelColor);
		panel_6_13_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_13_2_2.setLayout(null);
		panel_6_13_2_2.setBounds(0, 450, 178, 30);
		panel_5_1.add(panel_6_13_2_2);

		final JPanel panel_8_39_2_1 = new JPanel();
		panel_8_39_2_1.setBackground(PanelColor);
		panel_8_39_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_39_2_1.setBounds(178, 420, 34, 30);
		panel_5_1.add(panel_8_39_2_1);

		final JPanel panel_8_39_2_2 = new JPanel();
		panel_8_39_2_2.setBackground(PanelColor);
		panel_8_39_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_39_2_2.setBounds(178, 450, 34, 30);
		panel_5_1.add(panel_8_39_2_2);

		final JPanel panel_8_39_2_3 = new JPanel();
		panel_8_39_2_3.setBackground(PanelColor);
		panel_8_39_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_39_2_3.setBounds(212, 420, 34, 30);
		panel_5_1.add(panel_8_39_2_3);

		final JPanel panel_8_39_2_4 = new JPanel();
		panel_8_39_2_4.setBackground(PanelColor);
		panel_8_39_2_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_39_2_4.setBounds(246, 420, 34, 30);
		panel_5_1.add(panel_8_39_2_4);

		final JPanel panel_8_39_2_5 = new JPanel();
		panel_8_39_2_5.setBackground(PanelColor);
		panel_8_39_2_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_39_2_5.setBounds(212, 450, 34, 30);
		panel_5_1.add(panel_8_39_2_5);

		final JPanel panel_8_39_2_6 = new JPanel();
		panel_8_39_2_6.setBackground(PanelColor);
		panel_8_39_2_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_39_2_6.setBounds(246, 450, 34, 30);
		panel_5_1.add(panel_8_39_2_6);

		final JPanel panel_5_3_1 = new JPanel();
		panel_5_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_3_1.setLayout(null);
		panel_5_3_1.setBounds(841, 37, 281, 600);
		panel_3.add(panel_5_3_1);

		final JPanel panel_6_14_1 = new JPanel();
		panel_6_14_1.setBackground(Color.WHITE);
		panel_6_14_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_14_1.setLayout(null);
		panel_6_14_1.setBounds(0, 0, 178, 30);
		panel_5_3_1.add(panel_6_14_1);

		final JPanel panel_6_1_1_1 = new JPanel();
		panel_6_1_1_1.setBackground(Color.BLACK);
		panel_6_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_1.setLayout(null);
		panel_6_1_1_1.setBounds(0, 30, 280, 30);
		panel_5_3_1.add(panel_6_1_1_1);

		final JLabel mentalStatusLabel_1_1 = new JLabel();
		mentalStatusLabel_1_1.setForeground(Color.WHITE);
		mentalStatusLabel_1_1.setText("MusculoSkeletal");
		mentalStatusLabel_1_1.setBounds(81, 10, 115, 16);
		panel_6_1_1_1.add(mentalStatusLabel_1_1);

		final JPanel panel_6_2_1_1 = new JPanel();
		panel_6_2_1_1.setBackground(Color.WHITE);
		panel_6_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_2_1_1.setLayout(null);
		panel_6_2_1_1.setBounds(0, 60, 178, 30);
		panel_5_3_1.add(panel_6_2_1_1);

		final JLabel alertLabel_10_1 = new JLabel();
		alertLabel_10_1.setText("Balance/Gait Unsteady");
		alertLabel_10_1.setBounds(10, 8, 126, 16);
		panel_6_2_1_1.add(alertLabel_10_1);

		final JPanel panel_6_3_1_1 = new JPanel();
		panel_6_3_1_1.setBackground(Color.WHITE);
		panel_6_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_3_1_1.setLayout(null);
		panel_6_3_1_1.setBounds(0, 90, 178, 30);
		panel_5_3_1.add(panel_6_3_1_1);

		final JLabel alertLabel_1_1_1 = new JLabel();
		alertLabel_1_1_1.setText("Paralysis");
		alertLabel_1_1_1.setBounds(10, 8, 66, 16);
		panel_6_3_1_1.add(alertLabel_1_1_1);

		final JPanel panel_6_4_1_1 = new JPanel();
		panel_6_4_1_1.setBackground(Color.WHITE);
		panel_6_4_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_1_1.setLayout(null);
		panel_6_4_1_1.setBounds(0, 120, 178, 30);
		panel_5_3_1.add(panel_6_4_1_1);

		final JLabel alertLabel_2_1_1 = new JLabel();
		alertLabel_2_1_1.setText("WNL");
		alertLabel_2_1_1.setBounds(46, 8, 66, 16);
		panel_6_4_1_1.add(alertLabel_2_1_1);

		final JPanel panel_6_5_1_1 = new JPanel();
		panel_6_5_1_1.setBackground(Color.BLACK);
		panel_6_5_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_5_1_1.setLayout(null);
		panel_6_5_1_1.setBounds(0, 150, 280, 30);
		panel_5_3_1.add(panel_6_5_1_1);

		final JLabel nervousSystemLabel = new JLabel();
		nervousSystemLabel.setForeground(Color.WHITE);
		nervousSystemLabel.setText("Nervous System");
		nervousSystemLabel.setBounds(85, 10, 117, 14);
		panel_6_5_1_1.add(nervousSystemLabel);

		final JPanel panel_6_6_1_1 = new JPanel();
		panel_6_6_1_1.setBackground(Color.WHITE);
		panel_6_6_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_6_1_1.setLayout(null);
		panel_6_6_1_1.setBounds(0, 180, 178, 30);
		panel_5_3_1.add(panel_6_6_1_1);

		final JLabel alertLabel_4_1_1 = new JLabel();
		alertLabel_4_1_1.setText("SysnCope");
		alertLabel_4_1_1.setBounds(10, 8, 102, 16);
		panel_6_6_1_1.add(alertLabel_4_1_1);

		final JPanel panel_6_7_1_1 = new JPanel();
		panel_6_7_1_1.setBackground(Color.WHITE);
		panel_6_7_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_7_1_1.setLayout(null);
		panel_6_7_1_1.setBounds(0, 210, 178, 30);
		panel_5_3_1.add(panel_6_7_1_1);

		final JLabel alertLabel_5_1_1 = new JLabel();
		alertLabel_5_1_1.setText("Headache");
		alertLabel_5_1_1.setBounds(10, 8, 127, 16);
		panel_6_7_1_1.add(alertLabel_5_1_1);

		final JPanel panel_6_8_1_1 = new JPanel();
		panel_6_8_1_1.setBackground(Color.WHITE);
		panel_6_8_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_8_1_1.setLayout(null);
		panel_6_8_1_1.setBounds(0, 240, 178, 30);
		panel_5_3_1.add(panel_6_8_1_1);

		final JLabel alertLabel_6_1_1 = new JLabel();
		alertLabel_6_1_1.setText("Decreased Grasp");
		alertLabel_6_1_1.setBounds(10, 8, 138, 16);
		panel_6_8_1_1.add(alertLabel_6_1_1);

		final JPanel panel_6_9_1_1 = new JPanel();
		panel_6_9_1_1.setBackground(Color.WHITE);
		panel_6_9_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_9_1_1.setLayout(null);
		panel_6_9_1_1.setBounds(0, 270, 178, 30);
		panel_5_3_1.add(panel_6_9_1_1);

		final JLabel alertLabel_7_1_1 = new JLabel();
		alertLabel_7_1_1.setText("Rt");
		alertLabel_7_1_1.setBounds(10, 8, 56, 16);
		panel_6_9_1_1.add(alertLabel_7_1_1);

		final JPanel panel_6_10_1_1 = new JPanel();
		panel_6_10_1_1.setBackground(Color.WHITE);
		panel_6_10_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_10_1_1.setLayout(null);
		panel_6_10_1_1.setBounds(0, 300, 178, 30);
		panel_5_3_1.add(panel_6_10_1_1);

		final JLabel alertLabel_8_1_1 = new JLabel();
		alertLabel_8_1_1.setText("Lt");
		alertLabel_8_1_1.setBounds(10, 8, 126, 16);
		panel_6_10_1_1.add(alertLabel_8_1_1);

		final JPanel panel_6_11_1_1 = new JPanel();
		panel_6_11_1_1.setBackground(Color.WHITE);
		panel_6_11_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_11_1_1.setLayout(null);
		panel_6_11_1_1.setBounds(0, 330, 178, 30);
		panel_5_3_1.add(panel_6_11_1_1);

		final JLabel alertLabel_9_1_1 = new JLabel();
		alertLabel_9_1_1.setText("Decreased Movement");
		alertLabel_9_1_1.setBounds(10, 8, 138, 16);
		panel_6_11_1_1.add(alertLabel_9_1_1);

		final JPanel panel_6_12_1_1 = new JPanel();
		panel_6_12_1_1.setBackground(Color.WHITE);
		panel_6_12_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_12_1_1.setLayout(null);
		panel_6_12_1_1.setBounds(0, 360, 178, 30);
		panel_5_3_1.add(panel_6_12_1_1);

		final JLabel alertLabel_7_1_1_1 = new JLabel();
		alertLabel_7_1_1_1.setText("RUE");
		alertLabel_7_1_1_1.setBounds(10, 10, 56, 16);
		panel_6_12_1_1.add(alertLabel_7_1_1_1);

		final JLabel alertLabel_7_1_1_2 = new JLabel();
		alertLabel_7_1_1_2.setText("LUE");
		alertLabel_7_1_1_2.setBounds(98, 11, 56, 16);
		panel_6_12_1_1.add(alertLabel_7_1_1_2);

		final JPanel panel_6_13_1_1 = new JPanel();
		panel_6_13_1_1.setBackground(Color.WHITE);
		panel_6_13_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_13_1_1.setLayout(null);
		panel_6_13_1_1.setBounds(0, 390, 178, 30);
		panel_5_3_1.add(panel_6_13_1_1);

		final JLabel alertLabel_7_1_1_3 = new JLabel();
		alertLabel_7_1_1_3.setText("RLE");
		alertLabel_7_1_1_3.setBounds(10, 10, 56, 16);
		panel_6_13_1_1.add(alertLabel_7_1_1_3);

		final JLabel alertLabel_7_1_1_4 = new JLabel();
		alertLabel_7_1_1_4.setText("LLE");
		alertLabel_7_1_1_4.setBounds(98, 11, 56, 16);
		panel_6_13_1_1.add(alertLabel_7_1_1_4);

		final JPanel panel_7_1_1 = new JPanel();
		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBounds(178, 0, 102, 30);
		panel_5_3_1.add(panel_7_1_1);

		final JPanel panel_8_3_1 = new JPanel();
		panel_8_3_1.setBackground(Color.WHITE);
		panel_8_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3_1.setBounds(0, 0, 34, 30);
		panel_7_1_1.add(panel_8_3_1);

		final JLabel nLabel_3_1 = new JLabel();
		nLabel_3_1.setText("N");
		panel_8_3_1.add(nLabel_3_1);

		final JPanel panel_8_1_1_1 = new JPanel();
		panel_8_1_1_1.setBackground(Color.WHITE);
		panel_8_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1.setBounds(34, 0, 34, 30);
		panel_7_1_1.add(panel_8_1_1_1);

		final JLabel nLabel_1_1_1 = new JLabel();
		nLabel_1_1_1.setText("D");
		panel_8_1_1_1.add(nLabel_1_1_1);

		final JPanel panel_8_2_1_1 = new JPanel();
		panel_8_2_1_1.setBackground(Color.WHITE);
		panel_8_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_1_1.setBounds(68, 0, 34, 30);
		panel_7_1_1.add(panel_8_2_1_1);

		final JLabel nLabel_2_1_1 = new JLabel();
		nLabel_2_1_1.setBackground(Color.WHITE);
		nLabel_2_1_1.setText("E");
		panel_8_2_1_1.add(nLabel_2_1_1);

		final JPanel panel_7_2_1_1 = new JPanel();
		panel_7_2_1_1.setLayout(null);
		panel_7_2_1_1.setBounds(178, 60, 102, 30);
		panel_5_3_1.add(panel_7_2_1_1);

		final JPanel panel_8_6_1_1 = new JPanel();
		panel_8_6_1_1.setBackground(Color.WHITE);
		panel_8_6_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_6_1_1.setBounds(0, 0, 34, 30);
		panel_7_2_1_1.add(panel_8_6_1_1);

		cbBalanceGaitUnsteadyN = new JCheckBox();
		cbBalanceGaitUnsteadyN.setBackground(Color.WHITE);
		cbBalanceGaitUnsteadyN.setText("");
		panel_8_6_1_1.add(cbBalanceGaitUnsteadyN);

		final JPanel panel_8_7_1_1 = new JPanel();
		panel_8_7_1_1.setBackground(Color.WHITE);
		panel_8_7_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_7_1_1.setBounds(34, 0, 34, 30);
		panel_7_2_1_1.add(panel_8_7_1_1);

		cbBalanceGaitUnsteadyD = new JCheckBox();
		cbBalanceGaitUnsteadyD.setBackground(Color.WHITE);
		cbBalanceGaitUnsteadyD.setText("");
		panel_8_7_1_1.add(cbBalanceGaitUnsteadyD);

		final JPanel panel_8_8_1_1 = new JPanel();
		panel_8_8_1_1.setBackground(Color.WHITE);
		panel_8_8_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_8_1_1.setBounds(68, 0, 34, 30);
		panel_7_2_1_1.add(panel_8_8_1_1);

		cbBalanceGaitUnsteadyE = new JCheckBox();
		cbBalanceGaitUnsteadyE.setBackground(Color.WHITE);
		cbBalanceGaitUnsteadyE.setText("");
		panel_8_8_1_1.add(cbBalanceGaitUnsteadyE);

		final JPanel panel_7_3_1_1 = new JPanel();
		panel_7_3_1_1.setLayout(null);
		panel_7_3_1_1.setBounds(178, 90, 102, 30);
		panel_5_3_1.add(panel_7_3_1_1);

		final JPanel panel_8_9_1_1 = new JPanel();
		panel_8_9_1_1.setBackground(Color.WHITE);
		panel_8_9_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_9_1_1.setBounds(0, 0, 34, 30);
		panel_7_3_1_1.add(panel_8_9_1_1);

		cbParalysisN = new JCheckBox();
		cbParalysisN.setBackground(Color.WHITE);
		cbParalysisN.setText("");
		panel_8_9_1_1.add(cbParalysisN);

		final JPanel panel_8_10_1_1 = new JPanel();
		panel_8_10_1_1.setBackground(Color.WHITE);
		panel_8_10_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_1_1.setBounds(34, 0, 34, 30);
		panel_7_3_1_1.add(panel_8_10_1_1);

		cbParalysisD = new JCheckBox();
		cbParalysisD.setBackground(Color.WHITE);
		cbParalysisD.setText("");
		panel_8_10_1_1.add(cbParalysisD);

		final JPanel panel_8_11_1_1 = new JPanel();
		panel_8_11_1_1.setBackground(Color.WHITE);
		panel_8_11_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_11_1_1.setBounds(68, 0, 34, 30);
		panel_7_3_1_1.add(panel_8_11_1_1);

		cbParalysisE = new JCheckBox();
		cbParalysisE.setBackground(Color.WHITE);
		cbParalysisE.setText("");
		panel_8_11_1_1.add(cbParalysisE);

		final JPanel panel_7_4_1_1 = new JPanel();
		panel_7_4_1_1.setLayout(null);
		panel_7_4_1_1.setBounds(178, 120, 102, 30);
		panel_5_3_1.add(panel_7_4_1_1);

		final JPanel panel_8_12_1_1 = new JPanel();
		panel_8_12_1_1.setBackground(Color.WHITE);
		panel_8_12_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_12_1_1.setBounds(0, 0, 34, 30);
		panel_7_4_1_1.add(panel_8_12_1_1);

		cbMusculoSkeketalWnlN = new JCheckBox();
		cbMusculoSkeketalWnlN.setBackground(Color.WHITE);
		cbMusculoSkeketalWnlN.setText("");
		panel_8_12_1_1.add(cbMusculoSkeketalWnlN);

		final JPanel panel_8_13_1_1 = new JPanel();
		panel_8_13_1_1.setBackground(Color.WHITE);
		panel_8_13_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_13_1_1.setBounds(34, 0, 34, 30);
		panel_7_4_1_1.add(panel_8_13_1_1);

		cbMusculoSkeketalWnlD = new JCheckBox();
		cbMusculoSkeketalWnlD.setBackground(Color.WHITE);
		cbMusculoSkeketalWnlD.setText("");
		panel_8_13_1_1.add(cbMusculoSkeketalWnlD);

		final JPanel panel_8_14_1_1 = new JPanel();
		panel_8_14_1_1.setBackground(Color.WHITE);
		panel_8_14_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_14_1_1.setBounds(68, 0, 34, 30);
		panel_7_4_1_1.add(panel_8_14_1_1);

		cbMusculoSkeketalWnlE = new JCheckBox();
		cbMusculoSkeketalWnlE.setBackground(Color.WHITE);
		cbMusculoSkeketalWnlE.setText("");
		panel_8_14_1_1.add(cbMusculoSkeketalWnlE);

		final JPanel panel_7_5_1_1 = new JPanel();
		panel_7_5_1_1.setBackground(Color.WHITE);
		panel_7_5_1_1.setLayout(null);
		panel_7_5_1_1.setBounds(288, 150, -8, 30);
		panel_5_3_1.add(panel_7_5_1_1);

		final JPanel panel_7_6_1_1 = new JPanel();
		panel_7_6_1_1.setLayout(null);
		panel_7_6_1_1.setBounds(178, 180, 102, 30);
		panel_5_3_1.add(panel_7_6_1_1);

		final JPanel panel_8_18_1_1 = new JPanel();
		panel_8_18_1_1.setBackground(Color.WHITE);
		panel_8_18_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_18_1_1.setBounds(0, 0, 34, 30);
		panel_7_6_1_1.add(panel_8_18_1_1);

		cbSynCopeN = new JCheckBox();
		cbSynCopeN.setBackground(Color.WHITE);
		cbSynCopeN.setText("");
		panel_8_18_1_1.add(cbSynCopeN);

		final JPanel panel_8_19_1_1 = new JPanel();
		panel_8_19_1_1.setBackground(Color.WHITE);
		panel_8_19_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_19_1_1.setBounds(34, 0, 34, 30);
		panel_7_6_1_1.add(panel_8_19_1_1);

		cbSynCopeD = new JCheckBox();
		cbSynCopeD.setBackground(Color.WHITE);
		cbSynCopeD.setText("");
		panel_8_19_1_1.add(cbSynCopeD);

		final JPanel panel_8_20_1_1 = new JPanel();
		panel_8_20_1_1.setBackground(Color.WHITE);
		panel_8_20_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_20_1_1.setBounds(68, 0, 34, 30);
		panel_7_6_1_1.add(panel_8_20_1_1);

		cbSynCopeE = new JCheckBox();
		cbSynCopeE.setBackground(Color.WHITE);
		cbSynCopeE.setText("");
		panel_8_20_1_1.add(cbSynCopeE);

		final JPanel panel_7_7_1_1 = new JPanel();
		panel_7_7_1_1.setLayout(null);
		panel_7_7_1_1.setBounds(178, 210, 102, 30);
		panel_5_3_1.add(panel_7_7_1_1);

		final JPanel panel_8_22_1_1 = new JPanel();
		panel_8_22_1_1.setBackground(Color.WHITE);
		panel_8_22_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_22_1_1.setBounds(0, 0, 34, 30);
		panel_7_7_1_1.add(panel_8_22_1_1);

		cbHeadAcheN = new JCheckBox();
		cbHeadAcheN.setBackground(Color.WHITE);
		cbHeadAcheN.setText("");
		panel_8_22_1_1.add(cbHeadAcheN);

		final JPanel panel_8_23_1_1 = new JPanel();
		panel_8_23_1_1.setBackground(Color.WHITE);
		panel_8_23_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_23_1_1.setBounds(34, 0, 34, 30);
		panel_7_7_1_1.add(panel_8_23_1_1);

		cbHeadAcheD = new JCheckBox();
		cbHeadAcheD.setBackground(Color.WHITE);
		cbHeadAcheD.setText("");
		panel_8_23_1_1.add(cbHeadAcheD);

		final JPanel panel_8_24_1_1 = new JPanel();
		panel_8_24_1_1.setBackground(Color.WHITE);
		panel_8_24_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_24_1_1.setBounds(68, 0, 34, 30);
		panel_7_7_1_1.add(panel_8_24_1_1);

		cbHeadAcheE = new JCheckBox();
		cbHeadAcheE.setBackground(Color.WHITE);
		cbHeadAcheE.setText("");
		panel_8_24_1_1.add(cbHeadAcheE);

		final JPanel panel_7_8_1_1 = new JPanel();
		panel_7_8_1_1.setLayout(null);
		panel_7_8_1_1.setBounds(178, 240, 102, 30);
		panel_5_3_1.add(panel_7_8_1_1);

		final JPanel panel_8_21_1_1 = new JPanel();
		panel_8_21_1_1.setBackground(Color.BLACK);
		panel_8_21_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_21_1_1.setBounds(0, 0, 68, 30);
		panel_7_8_1_1.add(panel_8_21_1_1);

		final JPanel panel_8_25_1_1 = new JPanel();
		panel_8_25_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_25_1_1.setBounds(34, 0, 34, 30);
		panel_7_8_1_1.add(panel_8_25_1_1);

		final JPanel panel_8_26_1_1 = new JPanel();
		panel_8_26_1_1.setBackground(Color.WHITE);
		panel_8_26_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_26_1_1.setBounds(68, 0, 34, 30);
		panel_7_8_1_1.add(panel_8_26_1_1);

		cbDecreasedGraspE = new JCheckBox();
		cbDecreasedGraspE.setBackground(Color.WHITE);
		cbDecreasedGraspE.setText("");
		panel_8_26_1_1.add(cbDecreasedGraspE);

		final JPanel panel_7_9_1_1 = new JPanel();
		panel_7_9_1_1.setLayout(null);
		panel_7_9_1_1.setBounds(178, 270, 102, 30);
		panel_5_3_1.add(panel_7_9_1_1);

		final JPanel panel_8_27_1_1 = new JPanel();
		panel_8_27_1_1.setBackground(Color.WHITE);
		panel_8_27_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_27_1_1.setBounds(0, 0, 34, 30);
		panel_7_9_1_1.add(panel_8_27_1_1);

		cbNervousSystemRtN = new JCheckBox();
		cbNervousSystemRtN.setBackground(Color.WHITE);
		cbNervousSystemRtN.setText("");
		panel_8_27_1_1.add(cbNervousSystemRtN);

		final JPanel panel_8_28_1_1 = new JPanel();
		panel_8_28_1_1.setBackground(Color.WHITE);
		panel_8_28_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_28_1_1.setBounds(34, 0, 34, 30);
		panel_7_9_1_1.add(panel_8_28_1_1);

		cbNervousSystemRtD = new JCheckBox();
		cbNervousSystemRtD.setBackground(Color.WHITE);
		cbNervousSystemRtD.setText("");
		panel_8_28_1_1.add(cbNervousSystemRtD);

		final JPanel panel_8_29_1_1 = new JPanel();
		panel_8_29_1_1.setBackground(Color.WHITE);
		panel_8_29_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_29_1_1.setBounds(68, 0, 34, 30);
		panel_7_9_1_1.add(panel_8_29_1_1);

		cbNervousSystemRtE = new JCheckBox();
		cbNervousSystemRtE.setBackground(Color.WHITE);
		cbNervousSystemRtE.setText("");
		panel_8_29_1_1.add(cbNervousSystemRtE);

		final JPanel panel_7_10_1_1 = new JPanel();
		panel_7_10_1_1.setLayout(null);
		panel_7_10_1_1.setBounds(178, 300, 102, 30);
		panel_5_3_1.add(panel_7_10_1_1);

		final JPanel panel_8_33_1_1 = new JPanel();
		panel_8_33_1_1.setBackground(Color.WHITE);
		panel_8_33_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_33_1_1.setBounds(0, 0, 34, 30);
		panel_7_10_1_1.add(panel_8_33_1_1);

		cbNervousSystemLtN = new JCheckBox();
		cbNervousSystemLtN.setBackground(Color.WHITE);
		cbNervousSystemLtN.setText("");
		panel_8_33_1_1.add(cbNervousSystemLtN);

		final JPanel panel_8_34_1_1 = new JPanel();
		panel_8_34_1_1.setBackground(Color.WHITE);
		panel_8_34_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_34_1_1.setBounds(34, 0, 34, 30);
		panel_7_10_1_1.add(panel_8_34_1_1);

		cbNervousSystemLtD = new JCheckBox();
		cbNervousSystemLtD.setBackground(Color.WHITE);
		cbNervousSystemLtD.setText("");
		panel_8_34_1_1.add(cbNervousSystemLtD);

		final JPanel panel_8_35_1_1 = new JPanel();
		panel_8_35_1_1.setBackground(Color.WHITE);
		panel_8_35_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_35_1_1.setBounds(68, 0, 34, 30);
		panel_7_10_1_1.add(panel_8_35_1_1);

		cbNervousSystemLtE = new JCheckBox();
		cbNervousSystemLtE.setBackground(Color.WHITE);
		cbNervousSystemLtE.setText("");
		panel_8_35_1_1.add(cbNervousSystemLtE);

		final JPanel panel_7_11_1_1 = new JPanel();
		panel_7_11_1_1.setLayout(null);
		panel_7_11_1_1.setBounds(178, 330, 102, 30);
		panel_5_3_1.add(panel_7_11_1_1);

		final JPanel panel_8_30_1_1 = new JPanel();
		panel_8_30_1_1.setBackground(Color.BLACK);
		panel_8_30_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_30_1_1.setBounds(0, 0, 68, 30);
		panel_7_11_1_1.add(panel_8_30_1_1);

		final JPanel panel_8_31_1_1 = new JPanel();
		panel_8_31_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_31_1_1.setBounds(34, 0, 34, 30);
		panel_7_11_1_1.add(panel_8_31_1_1);

		final JPanel panel_8_32_1_1 = new JPanel();
		panel_8_32_1_1.setBackground(Color.WHITE);
		panel_8_32_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_32_1_1.setBounds(68, 0, 34, 30);
		panel_7_11_1_1.add(panel_8_32_1_1);

		cbDecresedMovementE = new JCheckBox();
		cbDecresedMovementE.setBackground(Color.WHITE);
		cbDecresedMovementE.setText("");
		panel_8_32_1_1.add(cbDecresedMovementE);

		final JPanel panel_7_12_1_1 = new JPanel();
		panel_7_12_1_1.setLayout(null);
		panel_7_12_1_1.setBounds(178, 360, 102, 30);
		panel_5_3_1.add(panel_7_12_1_1);

		final JPanel panel_8_36_1_1 = new JPanel();
		panel_8_36_1_1.setBackground(Color.WHITE);
		panel_8_36_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_36_1_1.setBounds(0, 0, 34, 30);
		panel_7_12_1_1.add(panel_8_36_1_1);

		cbRueLueN = new JCheckBox();
		cbRueLueN.setBackground(Color.WHITE);
		cbRueLueN.setText("");
		panel_8_36_1_1.add(cbRueLueN);

		final JPanel panel_8_37_1_1 = new JPanel();
		panel_8_37_1_1.setBackground(Color.WHITE);
		panel_8_37_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_37_1_1.setBounds(34, 0, 34, 30);
		panel_7_12_1_1.add(panel_8_37_1_1);

		cbRueLueD = new JCheckBox();
		cbRueLueD.setBackground(Color.WHITE);
		cbRueLueD.setText("");
		panel_8_37_1_1.add(cbRueLueD);

		final JPanel panel_8_38_1_1 = new JPanel();
		panel_8_38_1_1.setBackground(Color.WHITE);
		panel_8_38_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_38_1_1.setBounds(68, 0, 34, 30);
		panel_7_12_1_1.add(panel_8_38_1_1);

		// ----------To Be Continued---------mayank
		cbRueLueE = new JCheckBox();
		cbRueLueE.setBackground(Color.WHITE);
		cbRueLueE.setText("");
		panel_8_38_1_1.add(cbRueLueE);

		final JPanel panel_7_13_1_1 = new JPanel();
		panel_7_13_1_1.setLayout(null);
		panel_7_13_1_1.setBounds(178, 390, 102, 30);
		panel_5_3_1.add(panel_7_13_1_1);

		final JPanel panel_8_39_1_1 = new JPanel();
		panel_8_39_1_1.setBackground(Color.WHITE);
		panel_8_39_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_39_1_1.setBounds(0, 0, 34, 30);
		panel_7_13_1_1.add(panel_8_39_1_1);

		cbRleLLeN = new JCheckBox();
		cbRleLLeN.setBackground(Color.WHITE);
		cbRleLLeN.setText("");
		panel_8_39_1_1.add(cbRleLLeN);

		final JPanel panel_8_40_1_1 = new JPanel();
		panel_8_40_1_1.setBackground(Color.WHITE);
		panel_8_40_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_40_1_1.setBounds(34, 0, 34, 30);
		panel_7_13_1_1.add(panel_8_40_1_1);

		cbRleLLeD = new JCheckBox();
		cbRleLLeD.setBackground(Color.WHITE);
		cbRleLLeD.setText("");
		panel_8_40_1_1.add(cbRleLLeD);

		final JPanel panel_8_41_1_1 = new JPanel();
		panel_8_41_1_1.setBackground(Color.WHITE);
		panel_8_41_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_41_1_1.setBounds(68, 0, 34, 30);
		panel_7_13_1_1.add(panel_8_41_1_1);

		cbRleLLeE = new JCheckBox();
		cbRleLLeE.setBackground(Color.WHITE);
		cbRleLLeE.setText("");
		panel_8_41_1_1.add(cbRleLLeE);

		final JPanel panel_6_11_1_1_1 = new JPanel();
		panel_6_11_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_11_1_1_1.setLayout(null);
		panel_6_11_1_1_1.setBounds(0, 420, 178, 30);
		panel_6_11_1_1_1.setBackground(PanelColor);
		panel_5_3_1.add(panel_6_11_1_1_1);

		final JLabel alertLabel_9_1_1_1 = new JLabel();
		alertLabel_9_1_1_1.setText("Abnormal Pupil Reaction");
		alertLabel_9_1_1_1.setBounds(10, 8, 138, 16);
		panel_6_11_1_1_1.add(alertLabel_9_1_1_1);

		final JPanel panel_6_11_1_1_2 = new JPanel();
		panel_6_11_1_1_2.setBackground(PanelColor);
		panel_6_11_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_11_1_1_2.setLayout(null);
		panel_6_11_1_1_2.setBounds(0, 450, 178, 30);
		panel_5_3_1.add(panel_6_11_1_1_2);

		final JLabel alertLabel_9_1_1_2 = new JLabel();
		alertLabel_9_1_1_2.setText("Right");
		alertLabel_9_1_1_2.setBounds(10, 8, 138, 16);
		panel_6_11_1_1_2.add(alertLabel_9_1_1_2);

		final JPanel panel_6_11_1_1_3 = new JPanel();
		panel_6_11_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_11_1_1_3.setBackground(PanelColor);
		panel_6_11_1_1_3.setLayout(null);
		panel_6_11_1_1_3.setBounds(0, 480, 178, 30);
		panel_5_3_1.add(panel_6_11_1_1_3);

		final JLabel alertLabel_9_1_1_3 = new JLabel();
		alertLabel_9_1_1_3.setText("Left");
		alertLabel_9_1_1_3.setBounds(10, 8, 138, 16);
		panel_6_11_1_1_3.add(alertLabel_9_1_1_3);

		final JPanel panel_6_11_1_1_4 = new JPanel();
		panel_6_11_1_1_4.setBackground(PanelColor);
		panel_6_11_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_11_1_1_4.setLayout(null);
		panel_6_11_1_1_4.setBounds(0, 510, 178, 30);
		panel_5_3_1.add(panel_6_11_1_1_4);

		final JLabel alertLabel_9_1_1_4 = new JLabel();
		alertLabel_9_1_1_4.setText("Tremors");
		alertLabel_9_1_1_4.setBounds(10, 8, 138, 16);
		panel_6_11_1_1_4.add(alertLabel_9_1_1_4);

		final JPanel panel_6_11_1_1_5 = new JPanel();
		panel_6_11_1_1_5.setBackground(PanelColor);
		panel_6_11_1_1_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_11_1_1_5.setLayout(null);
		panel_6_11_1_1_5.setBounds(0, 540, 178, 30);
		panel_5_3_1.add(panel_6_11_1_1_5);

		final JLabel alertLabel_9_1_1_5 = new JLabel();
		alertLabel_9_1_1_5.setText("Vertigo");
		alertLabel_9_1_1_5.setBounds(10, 8, 138, 16);
		panel_6_11_1_1_5.add(alertLabel_9_1_1_5);

		final JPanel panel_6_11_1_1_6 = new JPanel();
		panel_6_11_1_1_6.setBackground(PanelColor);
		panel_6_11_1_1_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_11_1_1_6.setLayout(null);
		panel_6_11_1_1_6.setBounds(0, 570, 178, 30);
		panel_5_3_1.add(panel_6_11_1_1_6);

		final JLabel alertLabel_9_1_1_6 = new JLabel();
		alertLabel_9_1_1_6.setText("WNL");
		alertLabel_9_1_1_6.setBounds(10, 8, 138, 16);
		panel_6_11_1_1_6.add(alertLabel_9_1_1_6);

		final JPanel panel_7_13_1_1_1 = new JPanel();
		panel_7_13_1_1_1.setBackground(PanelColor);
		panel_7_13_1_1_1.setLayout(null);
		panel_7_13_1_1_1.setBounds(178, 420, 102, 30);
		panel_5_3_1.add(panel_7_13_1_1_1);

		final JPanel panel_8_39_1_1_1 = new JPanel();
		panel_8_39_1_1_1.setBackground(Color.BLACK);
		panel_8_39_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_39_1_1_1.setBounds(0, 0, 69, 30);
		panel_7_13_1_1_1.add(panel_8_39_1_1_1);

		final JPanel panel_8_41_1_1_1 = new JPanel();
		panel_8_41_1_1_1.setBackground(PanelColor);
		panel_8_41_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_41_1_1_1.setBounds(68, 0, 34, 30);
		panel_7_13_1_1_1.add(panel_8_41_1_1_1);

		cbAbnormalPupilReactionE = new JCheckBox();
		cbAbnormalPupilReactionE.setBackground(PanelColor);
		cbAbnormalPupilReactionE.setText("");
		panel_8_41_1_1_1.add(cbAbnormalPupilReactionE);

		final JPanel panel_7_13_1_1_2 = new JPanel();
		panel_7_13_1_1_2.setBackground(PanelColor);
		panel_7_13_1_1_2.setLayout(null);
		panel_7_13_1_1_2.setBounds(178, 450, 102, 30);
		panel_5_3_1.add(panel_7_13_1_1_2);

		final JPanel panel_8_39_1_1_2 = new JPanel();
		panel_8_39_1_1_2.setBackground(PanelColor);
		panel_8_39_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_39_1_1_2.setBounds(0, 0, 34, 30);
		panel_7_13_1_1_2.add(panel_8_39_1_1_2);

		cbAbnormalReactionRightN = new JCheckBox();
		cbAbnormalReactionRightN.setText("");
		cbAbnormalReactionRightN.setBackground(PanelColor);
		panel_8_39_1_1_2.add(cbAbnormalReactionRightN);

		final JPanel panel_8_40_1_1_2 = new JPanel();
		panel_8_40_1_1_2.setBackground(PanelColor);
		panel_8_40_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_40_1_1_2.setBounds(34, 0, 34, 30);
		panel_7_13_1_1_2.add(panel_8_40_1_1_2);

		cbAbnormalReactionRightD = new JCheckBox();
		cbAbnormalReactionRightD.setBackground(PanelColor);
		cbAbnormalReactionRightD.setText("");
		panel_8_40_1_1_2.add(cbAbnormalReactionRightD);

		final JPanel panel_8_41_1_1_2 = new JPanel();
		panel_8_41_1_1_2.setBackground(Color.WHITE);
		panel_8_41_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_41_1_1_2.setBounds(68, 0, 34, 30);
		panel_7_13_1_1_2.add(panel_8_41_1_1_2);

		cbAbnormalReactionRightE = new JCheckBox();
		cbAbnormalReactionRightE.setBackground(Color.WHITE);
		cbAbnormalReactionRightE.setText("");
		panel_8_41_1_1_2.add(cbAbnormalReactionRightE);

		final JPanel panel_7_13_1_1_3 = new JPanel();
		panel_7_13_1_1_3.setLayout(null);
		panel_7_13_1_1_3.setBounds(178, 480, 102, 30);
		panel_5_3_1.add(panel_7_13_1_1_3);

		final JPanel panel_8_39_1_1_3 = new JPanel();
		panel_8_39_1_1_3.setBackground(Color.WHITE);
		panel_8_39_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_39_1_1_3.setBounds(0, 0, 34, 30);
		panel_7_13_1_1_3.add(panel_8_39_1_1_3);

		cbAbnormalReactionLeftN = new JCheckBox();
		cbAbnormalReactionLeftN.setBackground(Color.WHITE);
		cbAbnormalReactionLeftN.setText("");
		panel_8_39_1_1_3.add(cbAbnormalReactionLeftN);

		final JPanel panel_8_40_1_1_3 = new JPanel();
		panel_8_40_1_1_3.setBackground(Color.WHITE);
		panel_8_40_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_40_1_1_3.setBounds(34, 0, 34, 30);
		panel_7_13_1_1_3.add(panel_8_40_1_1_3);

		cbAbnormalReactionLeftD = new JCheckBox();
		cbAbnormalReactionLeftD.setBackground(Color.WHITE);
		cbAbnormalReactionLeftD.setText("");
		panel_8_40_1_1_3.add(cbAbnormalReactionLeftD);

		final JPanel panel_8_41_1_1_3 = new JPanel();
		panel_8_41_1_1_3.setBackground(Color.WHITE);
		panel_8_41_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_41_1_1_3.setBounds(68, 0, 34, 30);
		panel_7_13_1_1_3.add(panel_8_41_1_1_3);

		cbAbnormalReactionLeftE = new JCheckBox();
		cbAbnormalReactionLeftE.setBackground(Color.WHITE);
		cbAbnormalReactionLeftE.setText("");
		panel_8_41_1_1_3.add(cbAbnormalReactionLeftE);

		final JPanel panel_7_13_1_1_4 = new JPanel();
		panel_7_13_1_1_4.setLayout(null);
		panel_7_13_1_1_4.setBounds(178, 510, 102, 30);
		panel_5_3_1.add(panel_7_13_1_1_4);

		final JPanel panel_8_39_1_1_4 = new JPanel();
		panel_8_39_1_1_4.setBackground(PanelColor);
		panel_8_39_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_39_1_1_4.setBounds(0, 0, 34, 30);
		panel_7_13_1_1_4.add(panel_8_39_1_1_4);

		cbTremorsN = new JCheckBox();
		cbTremorsN.setBackground(Color.WHITE);
		cbTremorsN.setText("");
		panel_8_39_1_1_4.add(cbTremorsN);

		final JPanel panel_8_40_1_1_4 = new JPanel();
		panel_8_40_1_1_4.setBackground(PanelColor);
		panel_8_40_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_40_1_1_4.setBounds(34, 0, 34, 30);
		panel_7_13_1_1_4.add(panel_8_40_1_1_4);

		cbTremorsD = new JCheckBox();
		cbTremorsD.setBackground(PanelColor);
		cbTremorsD.setText("");
		panel_8_40_1_1_4.add(cbTremorsD);

		final JPanel panel_8_41_1_1_4 = new JPanel();
		panel_8_41_1_1_4.setBackground(PanelColor);
		panel_8_41_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_41_1_1_4.setBounds(68, 0, 34, 30);
		panel_7_13_1_1_4.add(panel_8_41_1_1_4);

		cbTremorsE = new JCheckBox();
		cbTremorsE.setBackground(PanelColor);
		cbTremorsE.setText("");
		panel_8_41_1_1_4.add(cbTremorsE);

		final JPanel panel_7_13_1_1_5 = new JPanel();
		panel_7_13_1_1_5.setBackground(PanelColor);
		panel_7_13_1_1_5.setLayout(null);
		panel_7_13_1_1_5.setBounds(178, 540, 102, 30);
		panel_5_3_1.add(panel_7_13_1_1_5);

		final JPanel panel_8_39_1_1_5 = new JPanel();
		panel_8_39_1_1_5.setBackground(PanelColor);
		panel_8_39_1_1_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_39_1_1_5.setBounds(0, 0, 34, 30);
		panel_7_13_1_1_5.add(panel_8_39_1_1_5);

		cbVertigoN = new JCheckBox();
		cbVertigoN.setBackground(PanelColor);
		cbVertigoN.setText("");
		panel_8_39_1_1_5.add(cbVertigoN);

		final JPanel panel_8_40_1_1_5 = new JPanel();
		panel_8_40_1_1_5.setBackground(PanelColor);
		panel_8_40_1_1_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_40_1_1_5.setBounds(34, 0, 34, 30);
		panel_7_13_1_1_5.add(panel_8_40_1_1_5);

		cbVertigoD = new JCheckBox();
		cbVertigoD.setBackground(Color.WHITE);
		cbVertigoD.setText("");
		panel_8_40_1_1_5.add(cbVertigoD);

		final JPanel panel_8_41_1_1_5 = new JPanel();
		panel_8_41_1_1_5.setBackground(PanelColor);
		panel_8_41_1_1_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_41_1_1_5.setBounds(68, 0, 34, 30);
		panel_7_13_1_1_5.add(panel_8_41_1_1_5);

		cbVertigoE = new JCheckBox();
		cbVertigoE.setBackground(PanelColor);
		cbVertigoE.setText("");
		panel_8_41_1_1_5.add(cbVertigoE);

		final JPanel panel_7_13_1_1_6 = new JPanel();
		panel_7_13_1_1_6.setLayout(null);
		panel_7_13_1_1_6.setBounds(178, 570, 102, 30);
		panel_5_3_1.add(panel_7_13_1_1_6);

		final JPanel panel_8_39_1_1_6 = new JPanel();
		panel_8_39_1_1_6.setBackground(PanelColor);
		panel_8_39_1_1_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_39_1_1_6.setBounds(0, 0, 34, 30);
		panel_7_13_1_1_6.add(panel_8_39_1_1_6);

		cbNervousSystemWnlN = new JCheckBox();
		cbNervousSystemWnlN.setBackground(PanelColor);
		cbNervousSystemWnlN.setText("");
		panel_8_39_1_1_6.add(cbNervousSystemWnlN);

		final JPanel panel_8_40_1_1_6 = new JPanel();
		panel_8_40_1_1_6.setBackground(PanelColor);
		panel_8_40_1_1_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_40_1_1_6.setBounds(34, 0, 34, 30);
		panel_7_13_1_1_6.add(panel_8_40_1_1_6);

		cbNervousSystemWnlD = new JCheckBox();
		cbNervousSystemWnlD.setBackground(PanelColor);
		cbNervousSystemWnlD.setText("");
		panel_8_40_1_1_6.add(cbNervousSystemWnlD);

		final JPanel panel_8_41_1_1_6 = new JPanel();
		panel_8_41_1_1_6.setBackground(PanelColor);
		panel_8_41_1_1_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_41_1_1_6.setBounds(68, 0, 34, 30);
		panel_7_13_1_1_6.add(panel_8_41_1_1_6);

		cbNervousSystemWnlE = new JCheckBox();
		cbNervousSystemWnlE.setBackground(Color.WHITE);
		cbNervousSystemWnlE.setText("");
		panel_8_41_1_1_6.add(cbNervousSystemWnlE);

		final JPanel panel_5_1_1 = new JPanel();
		panel_5_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1.setLayout(null);
		panel_5_1_1.setBounds(0, 456, 281, 480);
		panel_3.add(panel_5_1_1);

		final JPanel panel_6_15_1 = new JPanel();
		panel_6_15_1.setBackground(Color.WHITE);
		panel_6_15_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_15_1.setLayout(null);
		panel_6_15_1.setBounds(0, 30, 178, 30);
		panel_5_1_1.add(panel_6_15_1);

		final JLabel alertLabel_11_1_1 = new JLabel();
		alertLabel_11_1_1.setText("Lebored Breathing");
		alertLabel_11_1_1.setBounds(10, 10, 158, 16);
		panel_6_15_1.add(alertLabel_11_1_1);

		final JPanel panel_6_2_2_1 = new JPanel();
		panel_6_2_2_1.setBackground(Color.WHITE);
		panel_6_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_2_2_1.setLayout(null);
		panel_6_2_2_1.setBounds(0, 60, 178, 30);
		panel_5_1_1.add(panel_6_2_2_1);

		final JLabel alertLabel_11_1 = new JLabel();
		alertLabel_11_1.setText("Shallow Respiration");
		alertLabel_11_1.setBounds(10, 8, 158, 16);
		panel_6_2_2_1.add(alertLabel_11_1);

		final JPanel panel_6_3_2_1 = new JPanel();
		panel_6_3_2_1.setBackground(Color.WHITE);
		panel_6_3_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_3_2_1.setLayout(null);
		panel_6_3_2_1.setBounds(0, 90, 178, 30);
		panel_5_1_1.add(panel_6_3_2_1);

		final JLabel alertLabel_1_2_1 = new JLabel();
		alertLabel_1_2_1.setText("Rates / Rhonchi");
		alertLabel_1_2_1.setBounds(10, 8, 130, 16);
		panel_6_3_2_1.add(alertLabel_1_2_1);

		final JPanel panel_6_4_2_1 = new JPanel();
		panel_6_4_2_1.setBackground(Color.WHITE);
		panel_6_4_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_2_1.setLayout(null);
		panel_6_4_2_1.setBounds(0, 120, 178, 30);
		panel_5_1_1.add(panel_6_4_2_1);

		final JLabel alertLabel_2_2_1 = new JLabel();
		alertLabel_2_2_1.setText("Wheezing");
		alertLabel_2_2_1.setBounds(10, 8, 102, 16);
		panel_6_4_2_1.add(alertLabel_2_2_1);

		final JPanel panel_6_5_2_1 = new JPanel();
		panel_6_5_2_1.setBackground(Color.WHITE);
		panel_6_5_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_5_2_1.setLayout(null);
		panel_6_5_2_1.setBounds(0, 150, 178, 30);
		panel_5_1_1.add(panel_6_5_2_1);

		final JLabel alertLabel_3_2_1 = new JLabel();
		alertLabel_3_2_1.setText("Cough");
		alertLabel_3_2_1.setBounds(10, 8, 102, 16);
		panel_6_5_2_1.add(alertLabel_3_2_1);

		final JPanel panel_6_6_2_1 = new JPanel();
		panel_6_6_2_1.setBackground(Color.WHITE);
		panel_6_6_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_6_2_1.setLayout(null);
		panel_6_6_2_1.setBounds(0, 180, 178, 30);
		panel_5_1_1.add(panel_6_6_2_1);

		final JLabel alertLabel_4_2_1 = new JLabel();
		alertLabel_4_2_1.setText("Dyspnea / SOB");
		alertLabel_4_2_1.setBounds(10, 8, 102, 16);
		panel_6_6_2_1.add(alertLabel_4_2_1);

		final JPanel panel_6_7_2_1 = new JPanel();
		panel_6_7_2_1.setBackground(Color.WHITE);
		panel_6_7_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_7_2_1.setLayout(null);
		panel_6_7_2_1.setBounds(0, 210, 178, 30);
		panel_5_1_1.add(panel_6_7_2_1);

		final JLabel alertLabel_5_2_1 = new JLabel();
		alertLabel_5_2_1.setText("Q2              LPM");
		alertLabel_5_2_1.setBounds(10, 8, 127, 16);
		panel_6_7_2_1.add(alertLabel_5_2_1);

		final JPanel panel_6_8_2_1 = new JPanel();
		panel_6_8_2_1.setBackground(Color.WHITE);
		panel_6_8_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_8_2_1.setLayout(null);
		panel_6_8_2_1.setBounds(0, 240, 178, 30);
		panel_5_1_1.add(panel_6_8_2_1);

		final JLabel alertLabel_6_2_1 = new JLabel();
		alertLabel_6_2_1.setText("PRN");
		alertLabel_6_2_1.setBounds(37, 8, 111, 16);
		panel_6_8_2_1.add(alertLabel_6_2_1);

		final JPanel panel_6_9_2_1 = new JPanel();
		panel_6_9_2_1.setBackground(Color.WHITE);
		panel_6_9_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_9_2_1.setLayout(null);
		panel_6_9_2_1.setBounds(0, 270, 178, 30);
		panel_5_1_1.add(panel_6_9_2_1);

		final JLabel alertLabel_7_2_1 = new JLabel();
		alertLabel_7_2_1.setText("CONTINOUS");
		alertLabel_7_2_1.setBounds(36, 8, 132, 16);
		panel_6_9_2_1.add(alertLabel_7_2_1);

		final JPanel panel_6_10_2_1 = new JPanel();
		panel_6_10_2_1.setBackground(Color.WHITE);
		panel_6_10_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_10_2_1.setLayout(null);
		panel_6_10_2_1.setBounds(0, 300, 178, 30);
		panel_5_1_1.add(panel_6_10_2_1);

		final JLabel alertLabel_8_2_1 = new JLabel();
		alertLabel_8_2_1.setText("S2O2        %         %        %");
		alertLabel_8_2_1.setBounds(10, 8, 140, 16);
		panel_6_10_2_1.add(alertLabel_8_2_1);

		final JPanel panel_6_11_2_1 = new JPanel();
		panel_6_11_2_1.setBackground(Color.WHITE);
		panel_6_11_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_11_2_1.setLayout(null);
		panel_6_11_2_1.setBounds(0, 330, 178, 30);
		panel_5_1_1.add(panel_6_11_2_1);

		final JLabel alertLabel_9_2_2 = new JLabel();
		alertLabel_9_2_2.setText("Suctioning");
		alertLabel_9_2_2.setBounds(10, 8, 138, 16);
		panel_6_11_2_1.add(alertLabel_9_2_2);

		final JPanel panel_6_12_2_1 = new JPanel();
		panel_6_12_2_1.setBackground(Color.WHITE);
		panel_6_12_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_12_2_1.setLayout(null);
		panel_6_12_2_1.setBounds(0, 360, 178, 30);
		panel_5_1_1.add(panel_6_12_2_1);

		final JLabel alertLabel_9_2_1_1 = new JLabel();
		alertLabel_9_2_1_1.setText("Trach Care");
		alertLabel_9_2_1_1.setBounds(10, 8, 138, 16);
		panel_6_12_2_1.add(alertLabel_9_2_1_1);

		final JPanel panel_6_13_2_3 = new JPanel();
		panel_6_13_2_3.setBackground(Color.WHITE);
		panel_6_13_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_13_2_3.setLayout(null);
		panel_6_13_2_3.setBounds(0, 390, 178, 30);
		panel_5_1_1.add(panel_6_13_2_3);

		final JLabel ventCareLabel = new JLabel();
		ventCareLabel.setText("Vent Care");
		ventCareLabel.setBounds(10, 10, 138, 16);
		panel_6_13_2_3.add(ventCareLabel);

		final JPanel panel_7_14_1 = new JPanel();
		panel_7_14_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_14_1.setLayout(null);
		panel_7_14_1.setBounds(178, 30, 102, 30);
		panel_5_1_1.add(panel_7_14_1);

		final JPanel panel_8_4_1 = new JPanel();
		panel_8_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_4_1.setBounds(0, 30, 34, 30);
		panel_7_14_1.add(panel_8_4_1);

		final JLabel nLabel_4_1 = new JLabel();
		nLabel_4_1.setText("New JLabel");
		panel_8_4_1.add(nLabel_4_1);

		final JPanel panel_8_1_2_1 = new JPanel();
		panel_8_1_2_1.setBackground(Color.WHITE);
		panel_8_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2_1.setBounds(34, 0, 34, 30);
		panel_7_14_1.add(panel_8_1_2_1);

		cbLeboredBreathingD = new JCheckBox();
		cbLeboredBreathingD.setBackground(Color.WHITE);
		cbLeboredBreathingD.setText("");
		panel_8_1_2_1.add(cbLeboredBreathingD);

		final JPanel panel_8_2_2_1 = new JPanel();
		panel_8_2_2_1.setBackground(Color.WHITE);
		panel_8_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_2_1.setBounds(68, 0, 34, 30);
		panel_7_14_1.add(panel_8_2_2_1);

		cbLeboredBreathingE = new JCheckBox();
		cbLeboredBreathingE.setBackground(Color.WHITE);
		cbLeboredBreathingE.setText("");
		panel_8_2_2_1.add(cbLeboredBreathingE);

		final JPanel panel_8_6_2_1_1 = new JPanel();
		panel_8_6_2_1_1.setBackground(Color.WHITE);
		panel_8_6_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_6_2_1_1.setBounds(0, 0, 34, 30);
		panel_7_14_1.add(panel_8_6_2_1_1);

		cbLeboredBreathingN = new JCheckBox();
		cbLeboredBreathingN.setBackground(Color.WHITE);
		cbLeboredBreathingN.setText("");
		panel_8_6_2_1_1.add(cbLeboredBreathingN);

		final JPanel panel_7_2_2_1 = new JPanel();
		panel_7_2_2_1.setBackground(Color.WHITE);
		panel_7_2_2_1.setLayout(null);
		panel_7_2_2_1.setBounds(178, 60, 102, 30);
		panel_5_1_1.add(panel_7_2_2_1);

		final JPanel panel_8_6_2_1 = new JPanel();
		panel_8_6_2_1.setBackground(Color.WHITE);
		panel_7_2_2_1.setBackground(PanelColor);
		panel_8_6_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_6_2_1.setBounds(0, 0, 34, 30);
		panel_7_2_2_1.add(panel_8_6_2_1);

		cbShallowRespirationN = new JCheckBox();
		cbShallowRespirationN.setBackground(Color.WHITE);
		cbShallowRespirationN.setText("");
		panel_8_6_2_1.add(cbShallowRespirationN);

		final JPanel panel_8_7_2_1 = new JPanel();
		panel_8_7_2_1.setBackground(PanelColor);
		panel_8_7_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_7_2_1.setBounds(34, 0, 34, 30);
		panel_7_2_2_1.add(panel_8_7_2_1);

		cbShallowRespirationD = new JCheckBox();
		cbShallowRespirationD.setText("");
		cbShallowRespirationD.setBackground(PanelColor);

		panel_8_7_2_1.add(cbShallowRespirationD);

		final JPanel panel_8_8_2_1 = new JPanel();
		panel_8_8_2_1.setBackground(PanelColor);
		panel_8_8_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_8_2_1.setBounds(68, 0, 34, 30);
		panel_7_2_2_1.add(panel_8_8_2_1);

		cbShallowRespirationE = new JCheckBox();
		cbShallowRespirationE.setText("");
		cbShallowRespirationE.setBackground(PanelColor);
		panel_8_8_2_1.add(cbShallowRespirationE);

		final JPanel panel_7_3_2_1 = new JPanel();
		panel_7_3_2_1.setBackground(PanelColor);
		panel_7_3_2_1.setLayout(null);
		panel_7_3_2_1.setBounds(178, 90, 102, 30);
		panel_5_1_1.add(panel_7_3_2_1);

		final JPanel panel_8_9_2_1 = new JPanel();
		panel_8_9_2_1.setBackground(PanelColor);
		panel_8_9_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_9_2_1.setBounds(0, 0, 34, 30);
		panel_7_3_2_1.add(panel_8_9_2_1);

		cbRatesRhonchiN = new JCheckBox();
		cbRatesRhonchiN.setBackground(PanelColor);
		cbRatesRhonchiN.setText("");
		panel_8_9_2_1.add(cbRatesRhonchiN);

		final JPanel panel_8_10_2_1 = new JPanel();
		panel_8_10_2_1.setBackground(PanelColor);
		panel_8_10_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_2_1.setBounds(34, 0, 34, 30);
		panel_7_3_2_1.add(panel_8_10_2_1);

		cbRatesRhonchiD = new JCheckBox();
		cbRatesRhonchiD.setBackground(Color.WHITE);
		cbRatesRhonchiD.setText("");
		panel_8_10_2_1.add(cbRatesRhonchiD);

		final JPanel panel_8_11_2_1 = new JPanel();
		panel_8_11_2_1.setBackground(PanelColor);
		panel_8_11_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_11_2_1.setBounds(68, 0, 34, 30);
		panel_7_3_2_1.add(panel_8_11_2_1);

		cbRatesRhonchiE = new JCheckBox();
		cbRatesRhonchiE.setText("");
		cbRatesRhonchiE.setBackground(PanelColor);
		panel_8_11_2_1.add(cbRatesRhonchiE);

		final JPanel panel_7_4_2_1 = new JPanel();
		panel_7_4_2_1.setBackground(PanelColor);
		panel_7_4_2_1.setLayout(null);
		panel_7_4_2_1.setBounds(178, 120, 102, 30);
		panel_5_1_1.add(panel_7_4_2_1);

		final JPanel panel_8_12_2_1 = new JPanel();
		panel_8_12_2_1.setBackground(PanelColor);
		panel_8_12_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_12_2_1.setBounds(0, 0, 34, 30);
		panel_7_4_2_1.add(panel_8_12_2_1);

		cbWheezingN = new JCheckBox();
		cbWheezingN.setBackground(PanelColor);
		cbWheezingN.setText("");
		panel_8_12_2_1.add(cbWheezingN);

		final JPanel panel_8_13_2_1 = new JPanel();
		panel_8_13_2_1.setBackground(PanelColor);
		panel_8_13_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_13_2_1.setBounds(34, 0, 34, 30);
		panel_7_4_2_1.add(panel_8_13_2_1);

		cbWheezingD = new JCheckBox();
		cbWheezingD.setBackground(PanelColor);
		cbWheezingD.setText("");
		panel_8_13_2_1.add(cbWheezingD);

		final JPanel panel_8_14_2_1 = new JPanel();
		panel_8_14_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_14_2_1.setBackground(PanelColor);
		panel_8_14_2_1.setBounds(68, 0, 34, 30);
		panel_7_4_2_1.add(panel_8_14_2_1);

		cbWheezingE = new JCheckBox();
		cbWheezingE.setText("");
		cbWheezingE.setBackground(PanelColor);
		panel_8_14_2_1.add(cbWheezingE);

		final JPanel panel_7_5_2_1 = new JPanel();
		panel_7_5_2_1.setBackground(PanelColor);
		panel_7_5_2_1.setLayout(null);
		panel_7_5_2_1.setBounds(178, 150, 102, 30);
		panel_5_1_1.add(panel_7_5_2_1);

		final JPanel panel_8_15_2_1 = new JPanel();
		panel_8_15_2_1.setBackground(PanelColor);
		panel_8_15_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_15_2_1.setBounds(0, 0, 34, 30);
		panel_7_5_2_1.add(panel_8_15_2_1);

		cbCoughN = new JCheckBox();
		cbCoughN.setBackground(PanelColor);
		cbCoughN.setText("");
		panel_8_15_2_1.add(cbCoughN);

		final JPanel panel_8_16_2_1 = new JPanel();
		panel_8_16_2_1.setBackground(PanelColor);
		panel_8_16_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_16_2_1.setBounds(34, 0, 34, 30);
		panel_7_5_2_1.add(panel_8_16_2_1);

		cbCoughD = new JCheckBox();
		cbCoughD.setText("");
		cbCoughD.setBackground(PanelColor);
		panel_8_16_2_1.add(cbCoughD);

		final JPanel panel_8_17_2_1 = new JPanel();
		panel_8_17_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_17_2_1.setBackground(PanelColor);
		panel_8_17_2_1.setBounds(68, 0, 34, 30);
		panel_7_5_2_1.add(panel_8_17_2_1);

		cbCoughE = new JCheckBox();
		cbCoughE.setText("");
		cbCoughE.setBackground(PanelColor);
		panel_8_17_2_1.add(cbCoughE);

		final JPanel panel_7_6_2_1 = new JPanel();
		panel_7_6_2_1.setBackground(PanelColor);
		panel_7_6_2_1.setLayout(null);
		panel_7_6_2_1.setBounds(178, 180, 102, 30);
		panel_5_1_1.add(panel_7_6_2_1);

		final JPanel panel_8_18_2_1 = new JPanel();
		panel_8_18_2_1.setBackground(PanelColor);
		panel_8_18_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_18_2_1.setBounds(0, 0, 34, 30);
		panel_7_6_2_1.add(panel_8_18_2_1);

		cbDyspneaSobN = new JCheckBox();
		cbDyspneaSobN.setText("");
		cbDyspneaSobN.setBackground(PanelColor);
		panel_8_18_2_1.add(cbDyspneaSobN);

		final JPanel panel_8_19_2_1 = new JPanel();
		panel_8_19_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_19_2_1.setBackground(PanelColor);
		panel_8_19_2_1.setBounds(34, 0, 34, 30);
		panel_7_6_2_1.add(panel_8_19_2_1);

		cbDyspneaSobD = new JCheckBox();
		cbDyspneaSobD.setBackground(PanelColor);
		cbDyspneaSobD.setText("");
		panel_8_19_2_1.add(cbDyspneaSobD);

		final JPanel panel_8_20_2_1 = new JPanel();
		panel_8_20_2_1.setBackground(PanelColor);
		panel_8_20_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_20_2_1.setBounds(68, 0, 34, 30);
		panel_7_6_2_1.add(panel_8_20_2_1);

		cbDyspneaSobE = new JCheckBox();
		cbDyspneaSobE.setBackground(PanelColor);
		cbDyspneaSobE.setText("");
		panel_8_20_2_1.add(cbDyspneaSobE);

		final JPanel panel_7_7_2_1 = new JPanel();
		panel_7_7_2_1.setBackground(PanelColor);
		panel_7_7_2_1.setLayout(null);
		panel_7_7_2_1.setBounds(178, 210, 102, 30);
		panel_5_1_1.add(panel_7_7_2_1);

		final JPanel panel_8_22_2_1 = new JPanel();
		panel_8_22_2_1.setBackground(PanelColor);
		panel_8_22_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_22_2_1.setBounds(0, 0, 34, 30);
		panel_7_7_2_1.add(panel_8_22_2_1);

		cbQ2LpmN = new JCheckBox();
		cbQ2LpmN.setBackground(PanelColor);
		cbQ2LpmN.setText("");
		panel_8_22_2_1.add(cbQ2LpmN);

		final JPanel panel_8_23_2_1 = new JPanel();
		panel_8_23_2_1.setBackground(PanelColor);
		panel_8_23_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_23_2_1.setBounds(34, 0, 34, 30);
		panel_7_7_2_1.add(panel_8_23_2_1);

		cbQ2LpmD = new JCheckBox();
		cbQ2LpmD.setBackground(PanelColor);
		cbQ2LpmD.setText("");
		panel_8_23_2_1.add(cbQ2LpmD);

		final JPanel panel_8_24_2_1 = new JPanel();
		panel_8_24_2_1.setBackground(PanelColor);
		panel_8_24_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_24_2_1.setBounds(68, 0, 34, 30);
		panel_7_7_2_1.add(panel_8_24_2_1);

		cbQ2LpmE = new JCheckBox();
		cbQ2LpmE.setBackground(PanelColor);
		cbQ2LpmE.setText("");
		panel_8_24_2_1.add(cbQ2LpmE);

		final JPanel panel_7_8_2_1 = new JPanel();
		panel_7_8_2_1.setBackground(PanelColor);
		panel_7_8_2_1.setLayout(null);
		panel_7_8_2_1.setBounds(178, 240, 102, 30);
		panel_5_1_1.add(panel_7_8_2_1);

		final JPanel panel_8_21_2_1 = new JPanel();
		panel_8_21_2_1.setBackground(PanelColor);
		panel_8_21_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_21_2_1.setBounds(0, 0, 34, 30);
		panel_7_8_2_1.add(panel_8_21_2_1);

		cbPrnN = new JCheckBox();
		cbPrnN.setBackground(PanelColor);
		cbPrnN.setText("");
		panel_8_21_2_1.add(cbPrnN);

		final JPanel panel_8_25_2_1 = new JPanel();
		panel_8_25_2_1.setBackground(PanelColor);
		panel_8_25_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_25_2_1.setBounds(34, 0, 34, 30);
		panel_7_8_2_1.add(panel_8_25_2_1);

		cbPrnD = new JCheckBox();
		cbPrnD.setBackground(PanelColor);
		cbPrnD.setText("");
		panel_8_25_2_1.add(cbPrnD);

		final JPanel panel_8_26_2_1 = new JPanel();
		panel_8_26_2_1.setBackground(PanelColor);
		panel_8_26_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_26_2_1.setBounds(68, 0, 34, 30);
		panel_7_8_2_1.add(panel_8_26_2_1);

		cbPrnE = new JCheckBox();
		cbPrnE.setBackground(PanelColor);
		cbPrnE.setText("");
		panel_8_26_2_1.add(cbPrnE);

		final JPanel panel_7_9_2_1 = new JPanel();
		panel_7_9_2_1.setBackground(PanelColor);
		panel_7_9_2_1.setLayout(null);
		panel_7_9_2_1.setBounds(178, 270, 102, 30);
		panel_5_1_1.add(panel_7_9_2_1);

		final JPanel panel_8_27_2_1 = new JPanel();
		panel_8_27_2_1.setBackground(PanelColor);
		panel_8_27_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_27_2_1.setBounds(0, 0, 34, 30);
		panel_7_9_2_1.add(panel_8_27_2_1);

		cbContinousN = new JCheckBox();
		cbContinousN.setText("");
		cbContinousN.setBackground(PanelColor);
		panel_8_27_2_1.add(cbContinousN);

		final JPanel panel_8_28_2_1 = new JPanel();
		panel_8_28_2_1.setBackground(Color.WHITE);
		panel_8_28_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_28_2_1.setBounds(34, 0, 34, 30);
		panel_7_9_2_1.add(panel_8_28_2_1);

		cbContinousD = new JCheckBox();
		cbContinousD.setBackground(Color.WHITE);
		cbContinousD.setText("");
		panel_8_28_2_1.add(cbContinousD);

		final JPanel panel_8_29_2_1 = new JPanel();
		panel_8_29_2_1.setBackground(Color.WHITE);
		panel_8_29_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_29_2_1.setBounds(68, 0, 34, 30);
		panel_7_9_2_1.add(panel_8_29_2_1);

		cbContinousE = new JCheckBox();
		cbContinousE.setBackground(Color.WHITE);
		cbContinousE.setText("");
		panel_8_29_2_1.add(cbContinousE);

		final JPanel panel_7_10_2_1 = new JPanel();
		panel_7_10_2_1.setLayout(null);
		panel_7_10_2_1.setBounds(178, 300, 102, 30);
		panel_5_1_1.add(panel_7_10_2_1);

		final JPanel panel_8_33_2_1 = new JPanel();
		panel_8_33_2_1.setBackground(Color.WHITE);
		panel_8_33_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_33_2_1.setBounds(0, 0, 34, 30);
		panel_7_10_2_1.add(panel_8_33_2_1);

		cbS2O2N = new JCheckBox();
		cbS2O2N.setBackground(Color.WHITE);
		cbS2O2N.setText("");
		panel_8_33_2_1.add(cbS2O2N);

		final JPanel panel_8_34_2_1 = new JPanel();
		panel_8_34_2_1.setBackground(Color.WHITE);
		panel_8_34_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_34_2_1.setBounds(34, 0, 34, 30);
		panel_7_10_2_1.add(panel_8_34_2_1);

		cbS2O2D = new JCheckBox();
		cbS2O2D.setBackground(Color.WHITE);
		cbS2O2D.setText("");
		panel_8_34_2_1.add(cbS2O2D);

		final JPanel panel_8_35_2_1 = new JPanel();
		panel_8_35_2_1.setBackground(Color.WHITE);
		panel_8_35_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_35_2_1.setBounds(68, 0, 34, 30);
		panel_7_10_2_1.add(panel_8_35_2_1);

		cbS2O2E = new JCheckBox();
		cbS2O2E.setBackground(Color.WHITE);
		cbS2O2E.setText("");
		panel_8_35_2_1.add(cbS2O2E);

		final JPanel panel_7_11_2_1 = new JPanel();
		panel_7_11_2_1.setLayout(null);
		panel_7_11_2_1.setBounds(178, 330, 102, 30);
		panel_5_1_1.add(panel_7_11_2_1);

		panel_8_30_3 = new JPanel();
		panel_8_30_3.setBackground(Color.WHITE);
		panel_8_30_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_30_3.setBounds(0, 0, 34, 30);
		panel_7_11_2_1.add(panel_8_30_3);

		cbSuctioningN = new JCheckBox();
		cbSuctioningN.setBackground(Color.WHITE);
		cbSuctioningN.setText("");
		panel_8_30_3.add(cbSuctioningN);

		final JPanel panel_8_31_2_1 = new JPanel();
		panel_8_31_2_1.setBackground(Color.WHITE);
		panel_8_31_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_31_2_1.setBounds(34, 0, 34, 30);
		panel_7_11_2_1.add(panel_8_31_2_1);

		cbSuctioningD = new JCheckBox();
		cbSuctioningD.setBackground(Color.WHITE);
		cbSuctioningD.setText("");
		panel_8_31_2_1.add(cbSuctioningD);

		final JPanel panel_8_32_2_1 = new JPanel();
		panel_8_32_2_1.setBackground(Color.WHITE);
		panel_8_32_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_32_2_1.setBounds(68, 0, 34, 30);
		panel_7_11_2_1.add(panel_8_32_2_1);

		cbSuctioningE = new JCheckBox();
		cbSuctioningE.setBackground(Color.WHITE);
		cbSuctioningE.setText("");
		panel_8_32_2_1.add(cbSuctioningE);

		final JPanel panel_7_12_2_1 = new JPanel();
		panel_7_12_2_1.setLayout(null);
		panel_7_12_2_1.setBounds(178, 360, 102, 30);
		panel_5_1_1.add(panel_7_12_2_1);

		final JPanel panel_8_36_2_1 = new JPanel();
		panel_8_36_2_1.setBackground(Color.WHITE);
		panel_8_36_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_36_2_1.setBounds(0, 0, 34, 30);
		panel_7_12_2_1.add(panel_8_36_2_1);

		cbTrachCareN = new JCheckBox();
		cbTrachCareN.setBackground(Color.WHITE);
		cbTrachCareN.setText("");
		panel_8_36_2_1.add(cbTrachCareN);

		final JPanel panel_8_37_2_1 = new JPanel();
		panel_8_37_2_1.setBackground(Color.WHITE);
		panel_8_37_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_37_2_1.setBounds(34, 0, 34, 30);
		panel_7_12_2_1.add(panel_8_37_2_1);

		cbTrachCareD = new JCheckBox();
		cbTrachCareD.setBackground(Color.WHITE);
		cbTrachCareD.setText("");
		panel_8_37_2_1.add(cbTrachCareD);

		final JPanel panel_8_38_2_1 = new JPanel();
		panel_8_38_2_1.setBackground(Color.WHITE);
		panel_8_38_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_38_2_1.setBounds(68, 0, 34, 30);
		panel_7_12_2_1.add(panel_8_38_2_1);

		cbTrachCareE = new JCheckBox();
		cbTrachCareE.setBackground(Color.WHITE);
		cbTrachCareE.setText("");
		panel_8_38_2_1.add(cbTrachCareE);

		final JPanel panel_7_13_2_1 = new JPanel();
		panel_7_13_2_1.setLayout(null);
		panel_7_13_2_1.setBounds(178, 390, 102, 30);
		panel_5_1_1.add(panel_7_13_2_1);

		final JPanel panel_8_39_2_7 = new JPanel();
		panel_8_39_2_7.setBackground(Color.WHITE);
		panel_8_39_2_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_39_2_7.setBounds(0, 0, 34, 30);
		panel_7_13_2_1.add(panel_8_39_2_7);

		cbVentCareN = new JCheckBox();
		cbVentCareN.setBackground(Color.WHITE);
		cbVentCareN.setText("");
		panel_8_39_2_7.add(cbVentCareN);

		final JPanel panel_8_40_2_1 = new JPanel();
		panel_8_40_2_1.setBackground(Color.WHITE);
		panel_8_40_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_40_2_1.setBounds(34, 0, 34, 30);
		panel_7_13_2_1.add(panel_8_40_2_1);

		cbVentCareD = new JCheckBox();
		cbVentCareD.setText("");
		cbVentCareD.setBackground(PanelColor);
		panel_8_40_2_1.add(cbVentCareD);

		final JPanel panel_8_41_2_1 = new JPanel();
		panel_8_41_2_1.setBackground(Color.WHITE);
		panel_8_41_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_41_2_1.setBounds(68, 0, 34, 30);
		panel_7_13_2_1.add(panel_8_41_2_1);

		cbVentCareE = new JCheckBox();
		cbVentCareE.setBackground(Color.WHITE);
		cbVentCareE.setText("");
		panel_8_41_2_1.add(cbVentCareE);

		final JPanel panel_6_13_2_1_1 = new JPanel();
		panel_6_13_2_1_1.setBackground(Color.WHITE);
		panel_6_13_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_13_2_1_1.setLayout(null);
		panel_6_13_2_1_1.setBounds(0, 420, 178, 30);
		panel_5_1_1.add(panel_6_13_2_1_1);

		final JLabel alertLabel_9_2_1_1_1 = new JLabel();
		alertLabel_9_2_1_1_1.setText("Lungs Clear");
		alertLabel_9_2_1_1_1.setBounds(10, 10, 138, 16);
		panel_6_13_2_1_1.add(alertLabel_9_2_1_1_1);

		final JPanel panel_6_13_2_2_1 = new JPanel();
		panel_6_13_2_2_1.setBackground(Color.WHITE);
		panel_6_13_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_13_2_2_1.setLayout(null);
		panel_6_13_2_2_1.setBounds(0, 450, 178, 30);
		panel_5_1_1.add(panel_6_13_2_2_1);

		final JLabel alertLabel_9_2_1_1_2 = new JLabel();
		alertLabel_9_2_1_1_2.setText("WNL");
		alertLabel_9_2_1_1_2.setBounds(10, 10, 138, 16);
		panel_6_13_2_2_1.add(alertLabel_9_2_1_1_2);

		final JPanel panel_8_39_2_1_1 = new JPanel();
		panel_8_39_2_1_1.setBackground(Color.WHITE);
		panel_8_39_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_39_2_1_1.setBounds(178, 420, 34, 30);
		panel_5_1_1.add(panel_8_39_2_1_1);

		cbLungsClearN = new JCheckBox();
		cbLungsClearN.setText("");
		panel_8_39_2_1_1.add(cbLungsClearN);
		cbLungsClearN.setBackground(PanelColor);

		final JPanel panel_8_39_2_2_1 = new JPanel();
		panel_8_39_2_2_1.setBackground(Color.WHITE);
		panel_8_39_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_39_2_2_1.setBounds(178, 450, 34, 30);
		panel_5_1_1.add(panel_8_39_2_2_1);

		cbRespiratoryWnlN = new JCheckBox();
		cbRespiratoryWnlN.setActionCommand("");
		cbRespiratoryWnlN.setText("");
		panel_8_39_2_2_1.add(cbRespiratoryWnlN);
		cbRespiratoryWnlN.setBackground(PanelColor);

		final JPanel panel_8_39_2_3_1 = new JPanel();
		panel_8_39_2_3_1.setBackground(Color.WHITE);
		panel_8_39_2_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_39_2_3_1.setBounds(212, 420, 34, 30);
		panel_5_1_1.add(panel_8_39_2_3_1);

		cbLungsClearD = new JCheckBox();
		cbLungsClearD.setBackground(Color.WHITE);
		cbLungsClearD.setActionCommand("");
		cbLungsClearD.setText("");
		panel_8_39_2_3_1.add(cbLungsClearD);

		final JPanel panel_8_39_2_4_1 = new JPanel();
		panel_8_39_2_4_1.setBackground(Color.WHITE);
		panel_8_39_2_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_39_2_4_1.setBounds(246, 420, 34, 30);
		panel_5_1_1.add(panel_8_39_2_4_1);

		cbLungsClearE = new JCheckBox();
		cbLungsClearE.setBackground(Color.WHITE);
		cbLungsClearE.setText("");
		panel_8_39_2_4_1.add(cbLungsClearE);

		final JPanel panel_8_39_2_5_1 = new JPanel();
		panel_8_39_2_5_1.setBackground(Color.WHITE);
		panel_8_39_2_5_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_39_2_5_1.setBounds(212, 450, 34, 30);
		panel_5_1_1.add(panel_8_39_2_5_1);

		cbRespiratoryWnlE = new JCheckBox();
		cbRespiratoryWnlE.setBackground(Color.WHITE);
		panel_8_39_2_5_1.add(cbRespiratoryWnlE);
		cbRespiratoryWnlE.setActionCommand("");
		cbRespiratoryWnlE.setText("");

		final JPanel panel_8_39_2_6_1 = new JPanel();
		panel_8_39_2_6_1.setBackground(Color.WHITE);
		panel_8_39_2_6_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_39_2_6_1.setBounds(246, 450, 34, 30);
		panel_5_1_1.add(panel_8_39_2_6_1);

		cbRespiratoryWnlD = new JCheckBox();
		cbRespiratoryWnlD.setBackground(Color.WHITE);
		cbRespiratoryWnlD.setActionCommand("");
		cbRespiratoryWnlD.setText("");
		panel_8_39_2_6_1.add(cbRespiratoryWnlD);
		cbRespiratoryWnlN.setBackground(PanelColor);
		cbRespiratoryWnlN.setBackground(PanelColor);

		final JPanel panel_6_1_2_1 = new JPanel();
		panel_6_1_2_1.setBackground(Color.BLACK);
		panel_6_1_2_1.setBounds(0, 0, 280, 30);
		panel_5_1_1.add(panel_6_1_2_1);
		panel_6_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_2_1.setLayout(null);

		final JLabel mentalStatusLabel_2_1 = new JLabel();
		mentalStatusLabel_2_1.setForeground(Color.WHITE);
		mentalStatusLabel_2_1.setText("Respiration");
		mentalStatusLabel_2_1.setBounds(81, 10, 115, 16);
		panel_6_1_2_1.add(mentalStatusLabel_2_1);

		final JPanel panel_5_1_1_1 = new JPanel();
		panel_5_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1.setLayout(null);
		panel_5_1_1_1.setBounds(280, 456, 281, 480);
		panel_3.add(panel_5_1_1_1);

		final JPanel panel_6_15_1_1 = new JPanel();
		panel_6_15_1_1.setBackground(Color.WHITE);
		panel_6_15_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_15_1_1.setLayout(null);
		panel_6_15_1_1.setBounds(0, 30, 178, 30);
		panel_5_1_1_1.add(panel_6_15_1_1);

		final JLabel alertLabel_11_1_1_1 = new JLabel();
		alertLabel_11_1_1_1.setText("Unclear Speech");
		alertLabel_11_1_1_1.setBounds(10, 10, 158, 16);
		panel_6_15_1_1.add(alertLabel_11_1_1_1);

		final JPanel panel_6_2_2_1_1 = new JPanel();
		panel_6_2_2_1_1.setBackground(Color.WHITE);
		panel_6_2_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_2_2_1_1.setLayout(null);
		panel_6_2_2_1_1.setBounds(0, 60, 178, 30);
		panel_5_1_1_1.add(panel_6_2_2_1_1);

		final JLabel alertLabel_11_1_2 = new JLabel();
		alertLabel_11_1_2.setText("Unable to Speak");
		alertLabel_11_1_2.setBounds(10, 8, 158, 16);
		panel_6_2_2_1_1.add(alertLabel_11_1_2);

		final JPanel panel_6_3_2_1_1 = new JPanel();
		panel_6_3_2_1_1.setBackground(PanelColor);
		panel_6_3_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_3_2_1_1.setLayout(null);
		panel_6_3_2_1_1.setBounds(0, 90, 178, 30);
		panel_5_1_1_1.add(panel_6_3_2_1_1);

		final JLabel alertLabel_1_2_1_1 = new JLabel();
		alertLabel_1_2_1_1.setText("Unable to Make Self");
		alertLabel_1_2_1_1.setBounds(10, 8, 130, 16);
		panel_6_3_2_1_1.add(alertLabel_1_2_1_1);

		final JPanel panel_6_4_2_1_1 = new JPanel();
		panel_6_4_2_1_1.setBackground(PanelColor);
		panel_6_4_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_2_1_1.setLayout(null);
		panel_6_4_2_1_1.setBounds(0, 120, 178, 30);
		panel_5_1_1_1.add(panel_6_4_2_1_1);

		final JLabel alertLabel_2_2_1_1 = new JLabel();
		alertLabel_2_2_1_1.setText("Understood");
		alertLabel_2_2_1_1.setBounds(10, 8, 102, 16);
		panel_6_4_2_1_1.add(alertLabel_2_2_1_1);

		final JPanel panel_6_5_2_1_1 = new JPanel();
		panel_6_5_2_1_1.setBackground(PanelColor);
		panel_6_5_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_5_2_1_1.setLayout(null);
		panel_6_5_2_1_1.setBounds(0, 150, 178, 30);
		panel_5_1_1_1.add(panel_6_5_2_1_1);

		final JLabel alertLabel_3_2_1_1 = new JLabel();
		alertLabel_3_2_1_1.setText("Unable To Hear");
		alertLabel_3_2_1_1.setBounds(10, 8, 102, 16);
		panel_6_5_2_1_1.add(alertLabel_3_2_1_1);

		final JPanel panel_6_6_2_1_1 = new JPanel();
		panel_6_6_2_1_1.setBackground(PanelColor);
		panel_6_6_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_6_2_1_1.setLayout(null);
		panel_6_6_2_1_1.setBounds(0, 180, 178, 30);
		panel_5_1_1_1.add(panel_6_6_2_1_1);

		final JLabel alertLabel_4_2_1_1 = new JLabel();
		alertLabel_4_2_1_1.setText("Unable To See");
		alertLabel_4_2_1_1.setBounds(10, 8, 102, 16);
		panel_6_6_2_1_1.add(alertLabel_4_2_1_1);

		final JPanel panel_6_7_2_1_1 = new JPanel();
		panel_6_7_2_1_1.setBackground(PanelColor);
		panel_6_7_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_7_2_1_1.setLayout(null);
		panel_6_7_2_1_1.setBounds(0, 210, 178, 30);
		panel_5_1_1_1.add(panel_6_7_2_1_1);

		final JLabel alertLabel_5_2_1_1 = new JLabel();
		alertLabel_5_2_1_1.setText("Decreased Tactile Sensation");
		alertLabel_5_2_1_1.setBounds(10, 8, 158, 16);
		panel_6_7_2_1_1.add(alertLabel_5_2_1_1);

		final JPanel panel_6_8_2_1_1 = new JPanel();
		panel_6_8_2_1_1.setBackground(PanelColor);
		panel_6_8_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_8_2_1_1.setLayout(null);
		panel_6_8_2_1_1.setBounds(0, 240, 178, 30);
		panel_5_1_1_1.add(panel_6_8_2_1_1);

		final JLabel alertLabel_6_2_1_1 = new JLabel();
		alertLabel_6_2_1_1.setText("WNL");
		alertLabel_6_2_1_1.setBounds(37, 8, 111, 16);
		panel_6_8_2_1_1.add(alertLabel_6_2_1_1);

		final JPanel panel_6_9_2_1_1 = new JPanel();
		panel_6_9_2_1_1.setBackground(PanelColor);
		panel_6_9_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_9_2_1_1.setLayout(null);
		panel_6_9_2_1_1.setBounds(0, 270, 178, 30);
		panel_5_1_1_1.add(panel_6_9_2_1_1);

		final JPanel panel_6_10_2_1_1 = new JPanel();
		panel_6_10_2_1_1.setBackground(Color.BLACK);
		panel_6_10_2_1_1.setForeground(Color.BLACK);
		panel_6_10_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_10_2_1_1.setLayout(null);
		panel_6_10_2_1_1.setBounds(0, 300, 280, 30);
		panel_5_1_1_1.add(panel_6_10_2_1_1);

		final JLabel alertLabel_8_2_1_1 = new JLabel();
		alertLabel_8_2_1_1.setForeground(Color.WHITE);
		alertLabel_8_2_1_1.setText("Pain");
		alertLabel_8_2_1_1.setBounds(84, 10, 140, 16);
		panel_6_10_2_1_1.add(alertLabel_8_2_1_1);

		final JPanel panel_6_11_2_1_1 = new JPanel();
		panel_6_11_2_1_1.setBackground(Color.WHITE);
		panel_6_11_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_11_2_1_1.setLayout(null);
		panel_6_11_2_1_1.setBounds(0, 330, 178, 30);
		panel_5_1_1_1.add(panel_6_11_2_1_1);

		final JLabel alertLabel_9_2_2_1 = new JLabel();
		alertLabel_9_2_2_1.setText("Origin");
		alertLabel_9_2_2_1.setBounds(10, 8, 138, 16);
		panel_6_11_2_1_1.add(alertLabel_9_2_2_1);

		final JPanel panel_6_12_2_1_1 = new JPanel();
		panel_6_12_2_1_1.setBackground(Color.WHITE);
		panel_6_12_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_12_2_1_1.setLayout(null);
		panel_6_12_2_1_1.setBounds(0, 360, 178, 30);
		panel_5_1_1_1.add(panel_6_12_2_1_1);

		final JLabel alertLabel_9_2_1_1_3 = new JLabel();
		alertLabel_9_2_1_1_3.setText("Location");
		alertLabel_9_2_1_1_3.setBounds(10, 8, 138, 16);
		panel_6_12_2_1_1.add(alertLabel_9_2_1_1_3);

		final JPanel panel_6_13_2_3_1 = new JPanel();
		panel_6_13_2_3_1.setBackground(Color.WHITE);
		panel_6_13_2_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_13_2_3_1.setLayout(null);
		panel_6_13_2_3_1.setBounds(0, 390, 178, 30);
		panel_5_1_1_1.add(panel_6_13_2_3_1);

		final JLabel ventCareLabel_1 = new JLabel();
		ventCareLabel_1.setText("Intensity(1-10)");
		ventCareLabel_1.setBounds(10, 10, 138, 16);
		panel_6_13_2_3_1.add(ventCareLabel_1);

		final JPanel panel_7_14_1_1 = new JPanel();
		panel_7_14_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_14_1_1.setLayout(null);
		panel_7_14_1_1.setBounds(178, 30, 102, 30);
		panel_5_1_1_1.add(panel_7_14_1_1);

		final JPanel panel_8_4_1_1 = new JPanel();
		panel_8_4_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_4_1_1.setBounds(0, 30, 34, 30);
		panel_7_14_1_1.add(panel_8_4_1_1);

		final JLabel nLabel_4_1_1 = new JLabel();
		nLabel_4_1_1.setText("New JLabel");
		panel_8_4_1_1.add(nLabel_4_1_1);

		final JPanel panel_8_1_2_1_1 = new JPanel();
		panel_8_1_2_1_1.setBackground(Color.WHITE);
		panel_8_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2_1_1.setBounds(34, 0, 34, 30);
		panel_7_14_1_1.add(panel_8_1_2_1_1);

		cbLeboredBreathingD_1 = new JCheckBox();
		cbLeboredBreathingD_1.setText("");
		cbLeboredBreathingD_1.setBackground(PanelColor);
		panel_8_1_2_1_1.add(cbLeboredBreathingD_1);

		final JPanel panel_8_2_2_1_1 = new JPanel();
		panel_8_2_2_1_1.setBackground(PanelColor);
		panel_8_2_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_2_1_1.setBounds(68, 0, 34, 30);
		panel_7_14_1_1.add(panel_8_2_2_1_1);

		cbLeboredBreathingE_1 = new JCheckBox();
		cbLeboredBreathingE_1.setText("");
		cbLeboredBreathingE_1.setBackground(PanelColor);
		panel_8_2_2_1_1.add(cbLeboredBreathingE_1);

		final JPanel panel_8_6_2_1_1_1 = new JPanel();
		panel_8_6_2_1_1_1.setBackground(PanelColor);
		panel_8_6_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_6_2_1_1_1.setBounds(0, 0, 34, 30);
		panel_7_14_1_1.add(panel_8_6_2_1_1_1);

		cbLeboredBreathingN_1 = new JCheckBox();
		cbLeboredBreathingN_1.setBackground(PanelColor);
		cbLeboredBreathingN_1.setText("");
		panel_8_6_2_1_1_1.add(cbLeboredBreathingN_1);

		final JPanel panel_7_2_2_1_1 = new JPanel();
		panel_7_2_2_1_1.setBackground(PanelColor);
		panel_7_2_2_1_1.setLayout(null);
		panel_7_2_2_1_1.setBounds(178, 60, 102, 30);
		panel_5_1_1_1.add(panel_7_2_2_1_1);

		final JPanel panel_8_6_2_1_2 = new JPanel();
		panel_8_6_2_1_2.setBackground(PanelColor);
		panel_8_6_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_6_2_1_2.setBounds(0, 0, 34, 30);
		panel_7_2_2_1_1.add(panel_8_6_2_1_2);

		cbShallowRespirationN_1 = new JCheckBox();
		cbShallowRespirationN_1.setText("");
		cbShallowRespirationN_1.setBackground(PanelColor);
		panel_8_6_2_1_2.add(cbShallowRespirationN_1);

		final JPanel panel_8_7_2_1_1 = new JPanel();
		panel_8_7_2_1_1.setBackground(PanelColor);
		panel_8_7_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_7_2_1_1.setBounds(34, 0, 34, 30);
		panel_7_2_2_1_1.add(panel_8_7_2_1_1);

		cbShallowRespirationD_1 = new JCheckBox();
		cbShallowRespirationD_1.setText("");
		cbShallowRespirationD_1.setBackground(PanelColor);
		panel_8_7_2_1_1.add(cbShallowRespirationD_1);

		final JPanel panel_8_8_2_1_1 = new JPanel();
		panel_8_8_2_1_1.setBackground(PanelColor);
		panel_8_8_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_8_2_1_1.setBounds(68, 0, 34, 30);
		panel_7_2_2_1_1.add(panel_8_8_2_1_1);

		cbShallowRespirationE_1 = new JCheckBox();
		cbShallowRespirationE_1.setText("");
		cbShallowRespirationE_1.setBackground(PanelColor);
		panel_8_8_2_1_1.add(cbShallowRespirationE_1);

		final JPanel panel_7_3_2_1_1 = new JPanel();
		panel_7_3_2_1_1.setBackground(PanelColor);
		panel_7_3_2_1_1.setLayout(null);
		panel_7_3_2_1_1.setBounds(178, 90, 102, 30);
		panel_5_1_1_1.add(panel_7_3_2_1_1);

		final JPanel panel_8_9_2_1_1 = new JPanel();
		panel_8_9_2_1_1.setBackground(PanelColor);
		panel_8_9_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_9_2_1_1.setBounds(0, 0, 34, 30);
		panel_7_3_2_1_1.add(panel_8_9_2_1_1);

		cbRatesRhonchiN_1 = new JCheckBox();
		cbRatesRhonchiN_1.setBackground(PanelColor);
		cbRatesRhonchiN_1.setText("");
		panel_8_9_2_1_1.add(cbRatesRhonchiN_1);

		final JPanel panel_8_10_2_1_1 = new JPanel();
		panel_8_10_2_1_1.setBackground(PanelColor);
		panel_8_10_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_2_1_1.setBounds(34, 0, 34, 30);
		panel_7_3_2_1_1.add(panel_8_10_2_1_1);

		cbRatesRhonchiD_1 = new JCheckBox();
		cbRatesRhonchiD_1.setBackground(PanelColor);
		cbRatesRhonchiD_1.setText("");
		panel_8_10_2_1_1.add(cbRatesRhonchiD_1);

		final JPanel panel_8_11_2_1_1 = new JPanel();
		panel_8_11_2_1_1.setBackground(PanelColor);
		panel_8_11_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_11_2_1_1.setBounds(68, 0, 34, 30);
		panel_7_3_2_1_1.add(panel_8_11_2_1_1);

		cbRatesRhonchiE_1 = new JCheckBox();
		cbRatesRhonchiE_1.setText("");
		cbRatesRhonchiE_1.setBackground(PanelColor);
		panel_8_11_2_1_1.add(cbRatesRhonchiE_1);

		final JPanel panel_7_4_2_1_1 = new JPanel();
		panel_7_4_2_1_1.setBackground(PanelColor);
		panel_7_4_2_1_1.setLayout(null);
		panel_7_4_2_1_1.setBounds(178, 120, 102, 30);
		panel_5_1_1_1.add(panel_7_4_2_1_1);

		final JPanel panel_8_12_2_1_1 = new JPanel();
		panel_8_12_2_1_1.setBackground(PanelColor);
		panel_8_12_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_12_2_1_1.setBounds(0, 0, 34, 30);
		panel_7_4_2_1_1.add(panel_8_12_2_1_1);

		cbWheezingN_1 = new JCheckBox();
		cbWheezingN_1.setBackground(PanelColor);
		cbWheezingN_1.setText("");
		panel_8_12_2_1_1.add(cbWheezingN_1);

		final JPanel panel_8_13_2_1_1 = new JPanel();
		panel_8_13_2_1_1.setBackground(PanelColor);
		panel_8_13_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_13_2_1_1.setBounds(34, 0, 34, 30);
		panel_7_4_2_1_1.add(panel_8_13_2_1_1);

		cbWheezingD_1 = new JCheckBox();
		cbWheezingD_1.setBackground(PanelColor);
		cbWheezingD_1.setText("");
		panel_8_13_2_1_1.add(cbWheezingD_1);

		final JPanel panel_8_14_2_1_1 = new JPanel();
		panel_8_14_2_1_1.setBackground(PanelColor);
		panel_8_14_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_14_2_1_1.setBounds(68, 0, 34, 30);
		panel_7_4_2_1_1.add(panel_8_14_2_1_1);

		cbWheezingE_1 = new JCheckBox();
		cbWheezingE_1.setText("");
		cbWheezingE_1.setBackground(PanelColor);
		panel_8_14_2_1_1.add(cbWheezingE_1);

		final JPanel panel_7_5_2_1_1 = new JPanel();
		panel_7_5_2_1_1.setBackground(PanelColor);
		panel_7_5_2_1_1.setLayout(null);
		panel_7_5_2_1_1.setBounds(178, 150, 102, 30);
		panel_5_1_1_1.add(panel_7_5_2_1_1);

		final JPanel panel_8_15_2_1_1 = new JPanel();
		panel_8_15_2_1_1.setBackground(PanelColor);
		panel_8_15_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_15_2_1_1.setBounds(0, 0, 34, 30);
		panel_7_5_2_1_1.add(panel_8_15_2_1_1);

		cbCoughN_1 = new JCheckBox();
		cbCoughN_1.setBackground(PanelColor);
		cbCoughN_1.setText("");
		panel_8_15_2_1_1.add(cbCoughN_1);

		final JPanel panel_8_16_2_1_1 = new JPanel();
		panel_8_16_2_1_1.setBackground(PanelColor);
		panel_8_16_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_16_2_1_1.setBounds(34, 0, 34, 30);
		panel_7_5_2_1_1.add(panel_8_16_2_1_1);

		cbCoughD_1 = new JCheckBox();
		cbCoughD_1.setBackground(PanelColor);
		cbCoughD_1.setText("");
		panel_8_16_2_1_1.add(cbCoughD_1);

		final JPanel panel_8_17_2_1_1 = new JPanel();
		panel_8_17_2_1_1.setBackground(PanelColor);
		panel_8_17_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_17_2_1_1.setBounds(68, 0, 34, 30);
		panel_7_5_2_1_1.add(panel_8_17_2_1_1);

		cbCoughE_1 = new JCheckBox();
		cbCoughE_1.setText("");
		cbCoughE_1.setBackground(PanelColor);
		panel_8_17_2_1_1.add(cbCoughE_1);

		final JPanel panel_7_6_2_1_1 = new JPanel();
		panel_7_6_2_1_1.setBackground(PanelColor);
		panel_7_6_2_1_1.setLayout(null);
		panel_7_6_2_1_1.setBounds(178, 180, 102, 30);
		panel_5_1_1_1.add(panel_7_6_2_1_1);

		final JPanel panel_8_18_2_1_1 = new JPanel();
		panel_8_18_2_1_1.setBackground(PanelColor);
		panel_8_18_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_18_2_1_1.setBounds(0, 0, 34, 30);
		panel_7_6_2_1_1.add(panel_8_18_2_1_1);

		cbDyspneaSobN_1 = new JCheckBox();
		cbDyspneaSobN_1.setText("");
		cbDyspneaSobN_1.setBackground(PanelColor);
		panel_8_18_2_1_1.add(cbDyspneaSobN_1);

		final JPanel panel_8_19_2_1_1 = new JPanel();
		panel_8_19_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_19_2_1_1.setBackground(PanelColor);
		panel_8_19_2_1_1.setBounds(34, 0, 34, 30);
		panel_7_6_2_1_1.add(panel_8_19_2_1_1);

		cbDyspneaSobD_1 = new JCheckBox();
		cbDyspneaSobD_1.setText("");
		cbDyspneaSobD_1.setBackground(PanelColor);
		panel_8_19_2_1_1.add(cbDyspneaSobD_1);

		final JPanel panel_8_20_2_1_1 = new JPanel();
		panel_8_20_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_20_2_1_1.setBackground(PanelColor);
		panel_8_20_2_1_1.setBounds(68, 0, 34, 30);
		panel_7_6_2_1_1.add(panel_8_20_2_1_1);

		cbDyspneaSobE_1 = new JCheckBox();
		cbDyspneaSobE_1.setBackground(PanelColor);
		cbDyspneaSobE_1.setText("");
		panel_8_20_2_1_1.add(cbDyspneaSobE_1);

		final JPanel panel_7_7_2_1_1 = new JPanel();
		panel_7_7_2_1_1.setBackground(PanelColor);
		panel_7_7_2_1_1.setLayout(null);
		panel_7_7_2_1_1.setBounds(178, 210, 102, 30);
		panel_5_1_1_1.add(panel_7_7_2_1_1);

		final JPanel panel_8_22_2_1_1 = new JPanel();
		panel_8_22_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_22_2_1_1.setBackground(PanelColor);
		panel_8_22_2_1_1.setBounds(0, 0, 34, 30);
		panel_7_7_2_1_1.add(panel_8_22_2_1_1);

		cbQ2LpmN_1 = new JCheckBox();
		cbQ2LpmN_1.setText("");
		cbQ2LpmN_1.setBackground(PanelColor);
		panel_8_22_2_1_1.add(cbQ2LpmN_1);

		final JPanel panel_8_23_2_1_1 = new JPanel();
		panel_8_23_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_23_2_1_1.setBackground(PanelColor);
		panel_8_23_2_1_1.setBounds(34, 0, 34, 30);
		panel_7_7_2_1_1.add(panel_8_23_2_1_1);

		cbQ2LpmD_1 = new JCheckBox();
		cbQ2LpmD_1.setText("");
		cbQ2LpmD_1.setBackground(PanelColor);
		panel_8_23_2_1_1.add(cbQ2LpmD_1);

		final JPanel panel_8_24_2_1_1 = new JPanel();
		panel_8_24_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_24_2_1_1.setBackground(PanelColor);
		panel_8_24_2_1_1.setBounds(68, 0, 34, 30);
		panel_7_7_2_1_1.add(panel_8_24_2_1_1);

		cbQ2LpmE_1 = new JCheckBox();
		cbQ2LpmE_1.setText("");
		cbQ2LpmE_1.setBackground(PanelColor);
		panel_8_24_2_1_1.add(cbQ2LpmE_1);

		final JPanel panel_7_8_2_1_1 = new JPanel();
		panel_7_8_2_1_1.setLayout(null);
		panel_7_8_2_1_1.setBackground(PanelColor);
		panel_7_8_2_1_1.setBounds(178, 240, 102, 30);
		panel_5_1_1_1.add(panel_7_8_2_1_1);

		final JPanel panel_8_21_2_1_1 = new JPanel();
		panel_8_21_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_21_2_1_1.setBackground(PanelColor);
		panel_8_21_2_1_1.setBounds(0, 0, 34, 30);
		panel_7_8_2_1_1.add(panel_8_21_2_1_1);

		cbPrnN_1 = new JCheckBox();
		cbPrnN_1.setBackground(Color.WHITE);
		cbPrnN_1.setText("");
		panel_8_21_2_1_1.add(cbPrnN_1);

		final JPanel panel_8_25_2_1_1 = new JPanel();
		panel_8_25_2_1_1.setBackground(PanelColor);
		panel_8_25_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_25_2_1_1.setBounds(34, 0, 34, 30);
		panel_7_8_2_1_1.add(panel_8_25_2_1_1);

		cbPrnD_1 = new JCheckBox();
		cbPrnD_1.setBackground(PanelColor);
		cbPrnD_1.setText("");
		panel_8_25_2_1_1.add(cbPrnD_1);

		final JPanel panel_8_26_2_1_1 = new JPanel();
		panel_8_26_2_1_1.setBackground(PanelColor);
		panel_8_26_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_26_2_1_1.setBounds(68, 0, 34, 30);
		panel_7_8_2_1_1.add(panel_8_26_2_1_1);

		cbPrnE_1 = new JCheckBox();
		cbPrnE_1.setBackground(PanelColor);
		cbPrnE_1.setText("");
		panel_8_26_2_1_1.add(cbPrnE_1);

		final JPanel panel_7_9_2_1_1 = new JPanel();
		panel_7_9_2_1_1.setLayout(null);
		panel_7_9_2_1_1.setBounds(178, 270, 102, 30);
		panel_5_1_1_1.add(panel_7_9_2_1_1);

		final JPanel panel_8_27_2_1_1 = new JPanel();
		panel_8_27_2_1_1.setBackground(Color.WHITE);
		panel_8_27_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_27_2_1_1.setBounds(0, 0, 34, 30);
		panel_7_9_2_1_1.add(panel_8_27_2_1_1);

		final JPanel panel_8_28_2_1_1 = new JPanel();
		panel_8_28_2_1_1.setBackground(Color.WHITE);
		panel_8_28_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_28_2_1_1.setBounds(34, 0, 34, 30);
		panel_7_9_2_1_1.add(panel_8_28_2_1_1);

		final JPanel panel_8_29_2_1_1 = new JPanel();
		panel_8_29_2_1_1.setBackground(Color.WHITE);
		panel_8_29_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_29_2_1_1.setBounds(68, 0, 34, 30);
		panel_7_9_2_1_1.add(panel_8_29_2_1_1);

		final JPanel panel_7_11_2_1_1 = new JPanel();
		panel_7_11_2_1_1.setLayout(null);
		panel_7_11_2_1_1.setBackground(PanelColor);
		panel_7_11_2_1_1.setBounds(178, 330, 102, 30);
		panel_5_1_1_1.add(panel_7_11_2_1_1);

		panel_8_30_4 = new JPanel();
		panel_8_30_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_30_4.setBackground(PanelColor);
		panel_8_30_4.setBounds(0, 0, 34, 30);
		panel_7_11_2_1_1.add(panel_8_30_4);

		cbOriginN = new JCheckBox();
		cbOriginN.setBackground(PanelColor);
		cbOriginN.setText("");
		panel_8_30_4.add(cbOriginN);

		final JPanel panel_8_31_2_1_1 = new JPanel();
		panel_8_31_2_1_1.setBackground(PanelColor);
		panel_8_31_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_31_2_1_1.setBounds(34, 0, 34, 30);
		panel_7_11_2_1_1.add(panel_8_31_2_1_1);

		cbOriginD = new JCheckBox();
		cbOriginD.setBackground(PanelColor);
		cbOriginD.setText("");
		panel_8_31_2_1_1.add(cbOriginD);

		final JPanel panel_8_32_2_1_1 = new JPanel();
		panel_8_32_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_32_2_1_1.setBounds(68, 0, 34, 30);
		panel_8_32_2_1_1.setBackground(PanelColor);
		panel_7_11_2_1_1.add(panel_8_32_2_1_1);

		cbOriginE = new JCheckBox();
		cbOriginE.setText("");
		cbOriginE.setBackground(PanelColor);
		panel_8_32_2_1_1.add(cbOriginE);

		final JPanel panel_7_12_2_1_1 = new JPanel();
		panel_7_12_2_1_1.setBackground(PanelColor);
		panel_7_12_2_1_1.setLayout(null);
		panel_7_12_2_1_1.setBounds(178, 360, 102, 30);
		panel_5_1_1_1.add(panel_7_12_2_1_1);

		final JPanel panel_8_36_2_1_1 = new JPanel();
		panel_8_36_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_36_2_1_1.setBackground(PanelColor);
		panel_8_36_2_1_1.setBounds(0, 0, 34, 30);
		panel_7_12_2_1_1.add(panel_8_36_2_1_1);

		cbLocationN = new JCheckBox();
		cbLocationN.setText("");
		cbLocationN.setBackground(PanelColor);
		panel_8_36_2_1_1.add(cbLocationN);

		final JPanel panel_8_37_2_1_1 = new JPanel();
		panel_8_37_2_1_1.setBackground(PanelColor);
		panel_8_37_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_37_2_1_1.setBounds(34, 0, 34, 30);
		panel_7_12_2_1_1.add(panel_8_37_2_1_1);

		cbLocationD = new JCheckBox();
		cbLocationD.setBackground(PanelColor);
		cbLocationD.setText("");
		panel_8_37_2_1_1.add(cbLocationD);

		final JPanel panel_8_38_2_1_1 = new JPanel();
		panel_8_38_2_1_1.setBackground(PanelColor);
		panel_8_38_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_38_2_1_1.setBounds(68, 0, 34, 30);
		panel_7_12_2_1_1.add(panel_8_38_2_1_1);

		cbLocationE = new JCheckBox();
		cbLocationE.setBackground(PanelColor);
		cbLocationE.setText("");
		panel_8_38_2_1_1.add(cbLocationE);

		final JPanel panel_7_13_2_1_1 = new JPanel();
		panel_7_13_2_1_1.setBackground(PanelColor);
		panel_7_13_2_1_1.setLayout(null);
		panel_7_13_2_1_1.setBounds(178, 390, 102, 30);
		panel_5_1_1_1.add(panel_7_13_2_1_1);

		final JPanel panel_8_39_2_7_1 = new JPanel();
		panel_8_39_2_7_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_39_2_7_1.setBackground(PanelColor);
		panel_8_39_2_7_1.setBounds(0, 0, 34, 30);
		panel_7_13_2_1_1.add(panel_8_39_2_7_1);

		cbIntensityN = new JCheckBox();
		cbIntensityN.setText("");
		cbIntensityN.setBackground(PanelColor);
		panel_8_39_2_7_1.add(cbIntensityN);

		final JPanel panel_8_40_2_1_1 = new JPanel();
		panel_8_40_2_1_1.setBackground(PanelColor);
		panel_8_40_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_40_2_1_1.setBounds(34, 0, 34, 30);
		panel_7_13_2_1_1.add(panel_8_40_2_1_1);

		cbIntensityD = new JCheckBox();
		cbIntensityD.setText("");
		cbIntensityD.setBackground(PanelColor);
		panel_8_40_2_1_1.add(cbIntensityD);

		final JPanel panel_8_41_2_1_1 = new JPanel();
		panel_8_41_2_1_1.setBackground(PanelColor);
		panel_8_41_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_41_2_1_1.setBounds(68, 0, 34, 30);
		panel_7_13_2_1_1.add(panel_8_41_2_1_1);

		cbIntensityE = new JCheckBox();
		cbIntensityE.setBackground(PanelColor);
		cbIntensityE.setText("");
		panel_8_41_2_1_1.add(cbIntensityE);

		final JPanel panel_6_13_2_1_1_1 = new JPanel();
		panel_6_13_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_13_2_1_1_1.setBackground(PanelColor);
		panel_6_13_2_1_1_1.setLayout(null);
		panel_6_13_2_1_1_1.setBounds(0, 420, 178, 30);
		panel_5_1_1_1.add(panel_6_13_2_1_1_1);

		final JLabel alertLabel_9_2_1_1_1_1 = new JLabel();
		alertLabel_9_2_1_1_1_1.setText("None");
		alertLabel_9_2_1_1_1_1.setBounds(10, 10, 138, 16);
		panel_6_13_2_1_1_1.add(alertLabel_9_2_1_1_1_1);

		final JPanel panel_6_13_2_2_1_1 = new JPanel();
		panel_6_13_2_2_1_1.setBackground(PanelColor);
		panel_6_13_2_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_13_2_2_1_1.setLayout(null);
		panel_6_13_2_2_1_1.setBounds(0, 450, 178, 30);
		panel_5_1_1_1.add(panel_6_13_2_2_1_1);

		final JPanel panel_8_39_2_1_1_1 = new JPanel();
		panel_8_39_2_1_1_1.setBackground(PanelColor);
		panel_8_39_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_39_2_1_1_1.setBounds(178, 420, 34, 30);
		panel_5_1_1_1.add(panel_8_39_2_1_1_1);

		cbNoneN = new JCheckBox();
		cbNoneN.setBackground(PanelColor);
		cbNoneN.setText("");
		panel_8_39_2_1_1_1.add(cbNoneN);

		final JPanel panel_8_39_2_2_1_1 = new JPanel();
		panel_8_39_2_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_39_2_2_1_1.setBackground(PanelColor);
		panel_8_39_2_2_1_1.setBounds(178, 450, 34, 30);
		panel_5_1_1_1.add(panel_8_39_2_2_1_1);

		final JPanel panel_8_39_2_3_1_1 = new JPanel();
		panel_8_39_2_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_39_2_3_1_1.setBackground(PanelColor);
		panel_8_39_2_3_1_1.setBounds(212, 420, 34, 30);
		panel_5_1_1_1.add(panel_8_39_2_3_1_1);

		cbNoneD = new JCheckBox();
		cbNoneD.setText("");
		cbNoneD.setBackground(PanelColor);
		panel_8_39_2_3_1_1.add(cbNoneD);

		final JPanel panel_8_39_2_4_1_1 = new JPanel();
		panel_8_39_2_4_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_39_2_4_1_1.setBackground(PanelColor);
		panel_8_39_2_4_1_1.setBounds(246, 420, 34, 30);
		panel_5_1_1_1.add(panel_8_39_2_4_1_1);

		cbNoneE = new JCheckBox();
		cbNoneE.setBackground(PanelColor);
		cbNoneE.setText("");
		panel_8_39_2_4_1_1.add(cbNoneE);

		final JPanel panel_8_39_2_5_1_1 = new JPanel();
		panel_8_39_2_5_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_39_2_5_1_1.setBackground(PanelColor);
		panel_8_39_2_5_1_1.setBounds(212, 450, 34, 30);
		panel_5_1_1_1.add(panel_8_39_2_5_1_1);

		final JPanel panel_8_39_2_6_1_1 = new JPanel();
		panel_8_39_2_6_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_39_2_6_1_1.setBackground(PanelColor);
		panel_8_39_2_6_1_1.setBounds(246, 450, 34, 30);
		panel_5_1_1_1.add(panel_8_39_2_6_1_1);

		final JPanel panel_6_1_2_1_1 = new JPanel();
		panel_6_1_2_1_1.setBackground(Color.BLACK);
		panel_6_1_2_1_1.setBackground(PanelColor);
		panel_6_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_2_1_1.setLayout(null);
		panel_6_1_2_1_1.setBounds(0, 0, 280, 30);
		panel_5_1_1_1.add(panel_6_1_2_1_1);

		final JLabel mentalStatusLabel_2_1_1 = new JLabel();
		mentalStatusLabel_2_1_1.setForeground(Color.WHITE);
		mentalStatusLabel_2_1_1.setText("Sensory");
		mentalStatusLabel_2_1_1.setBounds(81, 10, 115, 16);
		panel_6_1_2_1_1.add(mentalStatusLabel_2_1_1);

		final JPanel panel_5_1_1_2 = new JPanel();
		panel_5_1_1_2.setBackground(Color.WHITE);
		panel_5_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_2.setLayout(null);
		panel_5_1_1_2.setBounds(0, 938, 281, 363);
		panel_3.add(panel_5_1_1_2);

		final JPanel panel_6_15_1_2 = new JPanel();
		panel_6_15_1_2.setBackground(PanelColor);
		panel_6_15_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_15_1_2.setLayout(null);
		panel_6_15_1_2.setBounds(0, 30, 178, 30);
		panel_5_1_1_2.add(panel_6_15_1_2);

		final JLabel alertLabel_11_1_1_2 = new JLabel();
		alertLabel_11_1_1_2.setText("ND Notified");
		alertLabel_11_1_1_2.setBounds(10, 10, 158, 16);
		panel_6_15_1_2.add(alertLabel_11_1_1_2);

		final JPanel panel_6_2_2_1_2 = new JPanel();
		panel_6_2_2_1_2.setBackground(PanelColor);
		panel_6_2_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_2_2_1_2.setLayout(null);
		panel_6_2_2_1_2.setBounds(0, 60, 178, 30);
		panel_5_1_1_2.add(panel_6_2_2_1_2);

		final JLabel alertLabel_11_1_3 = new JLabel();
		alertLabel_11_1_3.setText("Skilled Observation & ");
		alertLabel_11_1_3.setBounds(10, 8, 158, 16);
		panel_6_2_2_1_2.add(alertLabel_11_1_3);

		final JPanel panel_6_3_2_1_2 = new JPanel();
		panel_6_3_2_1_2.setBackground(PanelColor);
		panel_6_3_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_3_2_1_2.setLayout(null);
		panel_6_3_2_1_2.setBounds(0, 90, 178, 30);
		panel_5_1_1_2.add(panel_6_3_2_1_2);

		final JLabel alertLabel_1_2_1_2 = new JLabel();
		alertLabel_1_2_1_2.setText("Assessment");
		alertLabel_1_2_1_2.setBounds(10, 8, 130, 16);
		panel_6_3_2_1_2.add(alertLabel_1_2_1_2);

		final JPanel panel_6_4_2_1_2 = new JPanel();
		panel_6_4_2_1_2.setBackground(PanelColor);
		panel_6_4_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_2_1_2.setLayout(null);
		panel_6_4_2_1_2.setBounds(0, 120, 178, 30);
		panel_5_1_1_2.add(panel_6_4_2_1_2);

		final JLabel alertLabel_2_2_1_2 = new JLabel();
		alertLabel_2_2_1_2.setText("Diabetic Management");
		alertLabel_2_2_1_2.setBounds(10, 8, 140, 16);
		panel_6_4_2_1_2.add(alertLabel_2_2_1_2);

		final JPanel panel_6_5_2_1_2 = new JPanel();
		panel_6_5_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_5_2_1_2.setBackground(PanelColor);
		panel_6_5_2_1_2.setLayout(null);
		panel_6_5_2_1_2.setBounds(0, 150, 178, 30);
		panel_5_1_1_2.add(panel_6_5_2_1_2);

		final JLabel alertLabel_3_2_1_2 = new JLabel();
		alertLabel_3_2_1_2.setText("GlucoMeter Readings");
		alertLabel_3_2_1_2.setBounds(10, 8, 102, 16);
		panel_6_5_2_1_2.add(alertLabel_3_2_1_2);

		final JPanel panel_6_6_2_1_2 = new JPanel();
		panel_6_6_2_1_2.setBackground(PanelColor);
		panel_6_6_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_6_2_1_2.setLayout(null);
		panel_6_6_2_1_2.setBounds(0, 180, 178, 30);
		panel_5_1_1_2.add(panel_6_6_2_1_2);

		final JLabel alertLabel_4_2_1_2 = new JLabel();
		alertLabel_4_2_1_2.setText("Dehydration Fluid Intake");
		alertLabel_4_2_1_2.setBounds(10, 8, 102, 16);
		panel_6_6_2_1_2.add(alertLabel_4_2_1_2);

		final JPanel panel_6_7_2_1_2 = new JPanel();
		panel_6_7_2_1_2.setBackground(PanelColor);
		panel_6_7_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_7_2_1_2.setLayout(null);
		panel_6_7_2_1_2.setBounds(0, 210, 178, 30);
		panel_5_1_1_2.add(panel_6_7_2_1_2);

		final JLabel alertLabel_5_2_1_2 = new JLabel();
		alertLabel_5_2_1_2.setText("Chemotherapy");
		alertLabel_5_2_1_2.setBounds(10, 8, 127, 16);
		panel_6_7_2_1_2.add(alertLabel_5_2_1_2);

		final JPanel panel_6_8_2_1_2 = new JPanel();
		panel_6_8_2_1_2.setBackground(PanelColor);
		panel_6_8_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_8_2_1_2.setLayout(null);
		panel_6_8_2_1_2.setBounds(0, 240, 178, 30);
		panel_5_1_1_2.add(panel_6_8_2_1_2);

		final JLabel alertLabel_6_2_1_2 = new JLabel();
		alertLabel_6_2_1_2.setText("Management / Teaching");
		alertLabel_6_2_1_2.setBounds(10, 8, 138, 16);
		panel_6_8_2_1_2.add(alertLabel_6_2_1_2);

		final JPanel panel_6_9_2_1_2 = new JPanel();
		panel_6_9_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_9_2_1_2.setBackground(PanelColor);
		panel_6_9_2_1_2.setLayout(null);
		panel_6_9_2_1_2.setBounds(0, 270, 178, 30);
		panel_5_1_1_2.add(panel_6_9_2_1_2);

		final JLabel alertLabel_7_2_1_1 = new JLabel();
		alertLabel_7_2_1_1.setText("Dialysis Management");
		alertLabel_7_2_1_1.setBounds(10, 8, 158, 16);
		panel_6_9_2_1_2.add(alertLabel_7_2_1_1);

		final JPanel panel_6_10_2_1_2 = new JPanel();
		panel_6_10_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_10_2_1_2.setBackground(PanelColor);
		panel_6_10_2_1_2.setLayout(null);
		panel_6_10_2_1_2.setBounds(0, 300, 178, 30);
		panel_5_1_1_2.add(panel_6_10_2_1_2);

		final JLabel alertLabel_8_2_1_2 = new JLabel();
		alertLabel_8_2_1_2.setText("Observe Medication");
		alertLabel_8_2_1_2.setBounds(10, 8, 140, 16);
		panel_6_10_2_1_2.add(alertLabel_8_2_1_2);

		final JPanel panel_6_11_2_1_2 = new JPanel();
		panel_6_11_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_11_2_1_2.setBackground(PanelColor);
		panel_6_11_2_1_2.setLayout(null);
		panel_6_11_2_1_2.setBounds(0, 330, 178, 30);
		panel_5_1_1_2.add(panel_6_11_2_1_2);

		final JLabel alertLabel_9_2_2_2 = new JLabel();
		alertLabel_9_2_2_2.setText("Side Effect / Teach");
		alertLabel_9_2_2_2.setBounds(10, 8, 138, 16);
		panel_6_11_2_1_2.add(alertLabel_9_2_2_2);

		final JPanel panel_7_14_1_2 = new JPanel();
		panel_7_14_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_14_1_2.setBackground(PanelColor);
		panel_7_14_1_2.setLayout(null);
		panel_7_14_1_2.setBounds(178, 30, 102, 30);
		panel_5_1_1_2.add(panel_7_14_1_2);

		final JPanel panel_8_4_1_2 = new JPanel();
		panel_8_4_1_2.setBackground(PanelColor);
		panel_8_4_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_4_1_2.setBounds(0, 30, 34, 30);
		panel_7_14_1_2.add(panel_8_4_1_2);

		final JLabel nLabel_4_1_2 = new JLabel();
		nLabel_4_1_2.setText("New JLabel");
		panel_8_4_1_2.add(nLabel_4_1_2);

		final JPanel panel_8_1_2_1_2 = new JPanel();
		panel_8_1_2_1_2.setBackground(PanelColor);
		panel_8_1_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2_1_2.setBounds(34, 0, 34, 30);
		panel_7_14_1_2.add(panel_8_1_2_1_2);

		cbMDNotifiedD = new JCheckBox();
		cbMDNotifiedD.setBackground(PanelColor);
		cbMDNotifiedD.setText("");
		panel_8_1_2_1_2.add(cbMDNotifiedD);

		final JPanel panel_8_2_2_1_2 = new JPanel();
		panel_8_2_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_2_1_2.setBackground(PanelColor);
		panel_8_2_2_1_2.setBounds(68, 0, 34, 30);
		panel_7_14_1_2.add(panel_8_2_2_1_2);

		cbMDNotifiedE = new JCheckBox();
		cbMDNotifiedE.setBackground(PanelColor);
		cbMDNotifiedE.setText("");
		panel_8_2_2_1_2.add(cbMDNotifiedE);

		final JPanel panel_8_6_2_1_1_2 = new JPanel();
		panel_8_6_2_1_1_2.setBackground(PanelColor);
		panel_8_6_2_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_6_2_1_1_2.setBounds(0, 0, 34, 30);
		panel_7_14_1_2.add(panel_8_6_2_1_1_2);

		cbMDNotifiedN = new JCheckBox();
		cbMDNotifiedN.setBackground(PanelColor);
		cbMDNotifiedN.setText("");
		panel_8_6_2_1_1_2.add(cbMDNotifiedN);

		final JPanel panel_7_3_2_1_2 = new JPanel();
		panel_7_3_2_1_2.setLayout(null);
		panel_7_3_2_1_2.setBackground(PanelColor);
		panel_7_3_2_1_2.setBounds(178, 90, 102, 30);
		panel_5_1_1_2.add(panel_7_3_2_1_2);

		final JPanel panel_8_9_2_1_2 = new JPanel();
		panel_8_9_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_9_2_1_2.setBackground(PanelColor);
		panel_8_9_2_1_2.setBounds(0, 0, 34, 30);
		panel_7_3_2_1_2.add(panel_8_9_2_1_2);

		cbSkilledObservationAssessmentN = new JCheckBox();
		cbSkilledObservationAssessmentN.setText("");
		cbSkilledObservationAssessmentN.setBackground(PanelColor);
		panel_8_9_2_1_2.add(cbSkilledObservationAssessmentN);

		final JPanel panel_8_10_2_1_2 = new JPanel();
		panel_8_10_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_2_1_2.setBackground(PanelColor);
		panel_8_10_2_1_2.setBounds(34, 0, 34, 30);
		panel_7_3_2_1_2.add(panel_8_10_2_1_2);

		cbSkilledObservationAssessmentD = new JCheckBox();
		cbSkilledObservationAssessmentD.setText("");
		cbSkilledObservationAssessmentD.setBackground(PanelColor);
		panel_8_10_2_1_2.add(cbSkilledObservationAssessmentD);

		final JPanel panel_8_11_2_1_2 = new JPanel();
		panel_8_11_2_1_2.setBackground(PanelColor);
		panel_8_11_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_11_2_1_2.setBounds(68, 0, 34, 30);
		panel_7_3_2_1_2.add(panel_8_11_2_1_2);

		cbSkilledObservationAssessmentE = new JCheckBox();
		cbSkilledObservationAssessmentE.setBackground(PanelColor);
		cbSkilledObservationAssessmentE.setText("");
		panel_8_11_2_1_2.add(cbSkilledObservationAssessmentE);

		final JPanel panel_7_4_2_1_2 = new JPanel();
		panel_7_4_2_1_2.setLayout(null);
		panel_7_4_2_1_2.setBackground(PanelColor);
		panel_7_4_2_1_2.setBounds(178, 120, 102, 30);
		panel_5_1_1_2.add(panel_7_4_2_1_2);

		final JPanel panel_8_12_2_1_2 = new JPanel();
		panel_8_12_2_1_2.setBackground(PanelColor);
		panel_8_12_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_12_2_1_2.setBounds(0, 0, 34, 30);
		panel_7_4_2_1_2.add(panel_8_12_2_1_2);

		cbDiabeticManagementN = new JCheckBox();
		cbDiabeticManagementN.setText("");
		cbDiabeticManagementN.setBackground(PanelColor);
		panel_8_12_2_1_2.add(cbDiabeticManagementN);

		final JPanel panel_8_13_2_1_2 = new JPanel();
		panel_8_13_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_13_2_1_2.setBackground(PanelColor);
		panel_8_13_2_1_2.setBounds(34, 0, 34, 30);
		panel_7_4_2_1_2.add(panel_8_13_2_1_2);

		cbDiabeticManagementD = new JCheckBox();
		cbDiabeticManagementD.setText("");
		cbDiabeticManagementD.setBackground(PanelColor);
		panel_8_13_2_1_2.add(cbDiabeticManagementD);

		final JPanel panel_8_14_2_1_2 = new JPanel();
		panel_8_14_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_14_2_1_2.setBackground(PanelColor);
		panel_8_14_2_1_2.setBounds(68, 0, 34, 30);
		panel_7_4_2_1_2.add(panel_8_14_2_1_2);

		cbDiabeticManagementE = new JCheckBox();
		cbDiabeticManagementE.setText("");
		cbDiabeticManagementE.setBackground(PanelColor);
		panel_8_14_2_1_2.add(cbDiabeticManagementE);

		final JPanel panel_7_5_2_1_2 = new JPanel();
		panel_7_5_2_1_2.setLayout(null);
		panel_7_5_2_1_2.setBackground(PanelColor);
		panel_7_5_2_1_2.setBounds(178, 150, 102, 30);
		panel_5_1_1_2.add(panel_7_5_2_1_2);

		final JPanel panel_8_15_2_1_2 = new JPanel();
		panel_8_15_2_1_2.setBackground(PanelColor);
		panel_8_15_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_15_2_1_2.setBounds(0, 0, 34, 30);
		panel_7_5_2_1_2.add(panel_8_15_2_1_2);

		cbGlucometerReadingN = new JCheckBox();
		cbGlucometerReadingN.setText("");
		cbGlucometerReadingN.setBackground(PanelColor);
		panel_8_15_2_1_2.add(cbGlucometerReadingN);

		final JPanel panel_8_16_2_1_2 = new JPanel();
		panel_8_16_2_1_2.setBackground(PanelColor);
		panel_8_16_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_16_2_1_2.setBounds(34, 0, 34, 30);
		panel_7_5_2_1_2.add(panel_8_16_2_1_2);

		cbGlucometerReadingD = new JCheckBox();
		cbGlucometerReadingD.setText("");
		cbGlucometerReadingD.setBackground(PanelColor);
		panel_8_16_2_1_2.add(cbGlucometerReadingD);

		final JPanel panel_8_17_2_1_2 = new JPanel();
		panel_8_17_2_1_2.setBackground(PanelColor);
		panel_8_17_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_17_2_1_2.setBounds(68, 0, 34, 30);
		panel_7_5_2_1_2.add(panel_8_17_2_1_2);

		cbGlucometerReadingE = new JCheckBox();
		cbGlucometerReadingE.setText("");
		cbGlucometerReadingE.setBackground(PanelColor);
		panel_8_17_2_1_2.add(cbGlucometerReadingE);

		final JPanel panel_7_6_2_1_2 = new JPanel();
		panel_7_6_2_1_2.setLayout(null);
		panel_7_6_2_1_2.setBackground(PanelColor);
		panel_7_6_2_1_2.setBounds(178, 180, 102, 30);
		panel_5_1_1_2.add(panel_7_6_2_1_2);

		final JPanel panel_8_18_2_1_2 = new JPanel();
		panel_8_18_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_18_2_1_2.setBackground(PanelColor);
		panel_8_18_2_1_2.setBounds(0, 0, 34, 30);
		panel_7_6_2_1_2.add(panel_8_18_2_1_2);

		cbDehaydrationN = new JCheckBox();
		cbDehaydrationN.setText("");
		cbDehaydrationN.setBackground(PanelColor);
		panel_8_18_2_1_2.add(cbDehaydrationN);

		final JPanel panel_8_19_2_1_2 = new JPanel();
		panel_8_19_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_19_2_1_2.setBackground(PanelColor);
		panel_8_19_2_1_2.setBounds(34, 0, 34, 30);
		panel_7_6_2_1_2.add(panel_8_19_2_1_2);

		cbDehaydrationD = new JCheckBox();
		cbDehaydrationD.setText("");
		cbDehaydrationD.setBackground(PanelColor);
		panel_8_19_2_1_2.add(cbDehaydrationD);

		final JPanel panel_8_20_2_1_2 = new JPanel();
		panel_8_20_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_20_2_1_2.setBackground(PanelColor);
		panel_8_20_2_1_2.setBounds(68, 0, 34, 30);
		panel_7_6_2_1_2.add(panel_8_20_2_1_2);

		cbDehaydrationE = new JCheckBox();
		cbDehaydrationE.setText("");
		cbDehaydrationE.setBackground(PanelColor);
		panel_8_20_2_1_2.add(cbDehaydrationE);

		final JPanel panel_7_7_2_1_2 = new JPanel();
		panel_7_7_2_1_2.setLayout(null);
		panel_7_7_2_1_2.setBackground(Color.BLACK);
		panel_7_7_2_1_2.setBounds(178, 210, 102, 30);
		panel_5_1_1_2.add(panel_7_7_2_1_2);

		final JPanel panel_7_8_2_1_2 = new JPanel();
		panel_7_8_2_1_2.setLayout(null);
		panel_7_8_2_1_2.setBackground(PanelColor);
		panel_7_8_2_1_2.setBounds(178, 240, 102, 30);
		panel_5_1_1_2.add(panel_7_8_2_1_2);

		final JPanel panel_8_21_2_1_2 = new JPanel();
		panel_8_21_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_21_2_1_2.setBackground(PanelColor);
		panel_8_21_2_1_2.setBounds(0, 0, 34, 30);
		panel_7_8_2_1_2.add(panel_8_21_2_1_2);

		cbManagementTeachingN = new JCheckBox();
		cbManagementTeachingN.setText("");
		cbManagementTeachingN.setBackground(PanelColor);
		panel_8_21_2_1_2.add(cbManagementTeachingN);

		final JPanel panel_8_25_2_1_2 = new JPanel();
		panel_8_25_2_1_2.setBackground(PanelColor);
		panel_8_25_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_25_2_1_2.setBounds(34, 0, 34, 30);
		panel_7_8_2_1_2.add(panel_8_25_2_1_2);

		cbManagementTeachingD = new JCheckBox();
		cbManagementTeachingD.setText("");
		cbManagementTeachingD.setBackground(PanelColor);
		panel_8_25_2_1_2.add(cbManagementTeachingD);

		final JPanel panel_8_26_2_1_2 = new JPanel();
		panel_8_26_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_26_2_1_2.setBackground(PanelColor);
		panel_8_26_2_1_2.setBounds(68, 0, 34, 30);
		panel_7_8_2_1_2.add(panel_8_26_2_1_2);

		cbManagementTeachingE = new JCheckBox();
		cbManagementTeachingE.setText("");
		cbManagementTeachingE.setBackground(PanelColor);
		panel_8_26_2_1_2.add(cbManagementTeachingE);

		final JPanel panel_7_9_2_1_2 = new JPanel();
		panel_7_9_2_1_2.setBackground(PanelColor);
		panel_7_9_2_1_2.setLayout(null);
		panel_7_9_2_1_2.setBounds(178, 270, 102, 30);
		panel_5_1_1_2.add(panel_7_9_2_1_2);

		final JPanel panel_8_27_2_1_2 = new JPanel();
		panel_8_27_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_27_2_1_2.setBackground(PanelColor);
		panel_8_27_2_1_2.setBounds(0, 0, 34, 30);
		panel_7_9_2_1_2.add(panel_8_27_2_1_2);

		cbDialysisManagementN = new JCheckBox();
		cbDialysisManagementN.setBackground(PanelColor);
		cbDialysisManagementN.setText("");
		panel_8_27_2_1_2.add(cbDialysisManagementN);

		final JPanel panel_8_28_2_1_2 = new JPanel();
		panel_8_28_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_28_2_1_2.setBackground(PanelColor);
		panel_8_28_2_1_2.setBounds(34, 0, 34, 30);
		panel_7_9_2_1_2.add(panel_8_28_2_1_2);

		cbDialysisManagementD = new JCheckBox();
		cbDialysisManagementD.setBackground(PanelColor);
		cbDialysisManagementD.setText("");
		panel_8_28_2_1_2.add(cbDialysisManagementD);

		final JPanel panel_8_29_2_1_2 = new JPanel();
		panel_8_29_2_1_2.setBackground(PanelColor);
		panel_8_29_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_29_2_1_2.setBounds(68, 0, 34, 30);
		panel_7_9_2_1_2.add(panel_8_29_2_1_2);

		cbDialysisManagementE = new JCheckBox();
		cbDialysisManagementE.setBackground(PanelColor);
		cbDialysisManagementE.setText("");
		panel_8_29_2_1_2.add(cbDialysisManagementE);

		final JPanel panel_7_10_2_1_1 = new JPanel();
		panel_7_10_2_1_1.setBackground(Color.BLACK);
		panel_7_10_2_1_1.setLayout(null);
		panel_7_10_2_1_1.setBounds(178, 300, 102, 30);
		panel_5_1_1_2.add(panel_7_10_2_1_1);

		final JPanel panel_7_11_2_1_2 = new JPanel();
		panel_7_11_2_1_2.setLayout(null);
		panel_7_11_2_1_2.setBackground(PanelColor);
		panel_7_11_2_1_2.setBounds(178, 330, 102, 30);
		panel_5_1_1_2.add(panel_7_11_2_1_2);

		panel_8_30_5 = new JPanel();
		panel_8_30_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_30_5.setBackground(PanelColor);
		panel_8_30_5.setBounds(0, 0, 34, 30);
		panel_7_11_2_1_2.add(panel_8_30_5);

		cbSideEffectN = new JCheckBox();
		cbSideEffectN.setText("");
		cbSideEffectN.setBackground(PanelColor);
		panel_8_30_5.add(cbSideEffectN);

		final JPanel panel_8_31_2_1_2 = new JPanel();
		panel_8_31_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_31_2_1_2.setBackground(PanelColor);
		panel_8_31_2_1_2.setBounds(34, 0, 34, 30);
		panel_7_11_2_1_2.add(panel_8_31_2_1_2);

		cbSideEffectD = new JCheckBox();
		cbSideEffectD.setText("");
		cbSideEffectD.setBackground(PanelColor);
		panel_8_31_2_1_2.add(cbSideEffectD);

		final JPanel panel_8_32_2_1_2 = new JPanel();
		panel_8_32_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_32_2_1_2.setBackground(PanelColor);
		panel_8_32_2_1_2.setBounds(68, 0, 34, 30);
		panel_7_11_2_1_2.add(panel_8_32_2_1_2);

		cbSideEffectE = new JCheckBox();
		cbSideEffectE.setText("");
		cbSideEffectE.setBackground(PanelColor);
		panel_8_32_2_1_2.add(cbSideEffectE);

		final JPanel panel_6_1_2_1_2 = new JPanel();
		panel_6_1_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_2_1_2.setBackground(PanelColor);
		panel_6_1_2_1_2.setLayout(null);
		panel_6_1_2_1_2.setBounds(0, 29, 280, 1);
		panel_5_1_1_2.add(panel_6_1_2_1_2);

		final JPanel panel_6_15_1_2_1 = new JPanel();
		panel_6_15_1_2_1.setBackground(PanelColor);
		panel_6_15_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_15_1_2_1.setLayout(null);
		panel_6_15_1_2_1.setBounds(0, 0, 178, 30);
		panel_5_1_1_2.add(panel_6_15_1_2_1);

		final JLabel alertLabel_11_1_1_2_1 = new JLabel();
		alertLabel_11_1_1_2_1.setText("MD Orders");
		alertLabel_11_1_1_2_1.setBounds(10, 10, 158, 16);
		panel_6_15_1_2_1.add(alertLabel_11_1_1_2_1);

		final JPanel panel_7_14_1_2_1 = new JPanel();
		panel_7_14_1_2_1.setBackground(PanelColor);
		panel_7_14_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_14_1_2_1.setLayout(null);
		panel_7_14_1_2_1.setBounds(178, 0, 102, 30);
		panel_5_1_1_2.add(panel_7_14_1_2_1);

		final JPanel panel_8_4_1_2_1 = new JPanel();
		panel_8_4_1_2_1.setBackground(PanelColor);
		panel_8_4_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_4_1_2_1.setBounds(0, 30, 34, 30);
		panel_7_14_1_2_1.add(panel_8_4_1_2_1);

		final JLabel nLabel_4_1_2_1 = new JLabel();
		nLabel_4_1_2_1.setText("New JLabel");
		panel_8_4_1_2_1.add(nLabel_4_1_2_1);

		final JPanel panel_8_1_2_1_2_1 = new JPanel();
		panel_8_1_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2_1_2_1.setBackground(PanelColor);
		panel_8_1_2_1_2_1.setBounds(34, 0, 34, 30);
		panel_7_14_1_2_1.add(panel_8_1_2_1_2_1);

		cbMDOrdersD = new JCheckBox();
		cbMDOrdersD.setText("");
		cbMDOrdersD.setBackground(PanelColor);
		panel_8_1_2_1_2_1.add(cbMDOrdersD);

		final JPanel panel_8_2_2_1_2_1 = new JPanel();
		panel_8_2_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_2_1_2_1.setBackground(PanelColor);
		panel_8_2_2_1_2_1.setBounds(68, 0, 34, 30);
		panel_7_14_1_2_1.add(panel_8_2_2_1_2_1);

		cbMDOrdersE = new JCheckBox();
		cbMDOrdersE.setText("");
		cbMDOrdersE.setBackground(PanelColor);
		panel_8_2_2_1_2_1.add(cbMDOrdersE);

		final JPanel panel_8_6_2_1_1_2_1 = new JPanel();
		panel_8_6_2_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_6_2_1_1_2_1.setBackground(PanelColor);
		panel_8_6_2_1_1_2_1.setBounds(0, 0, 34, 30);
		panel_7_14_1_2_1.add(panel_8_6_2_1_1_2_1);

		cbMDOrdersN = new JCheckBox();
		cbMDOrdersN.setText("");
		cbMDOrdersN.setBackground(PanelColor);
		panel_8_6_2_1_1_2_1.add(cbMDOrdersN);

		final JPanel panel_9 = new JPanel();
		panel_9.setBounds(178, 60, 102, 30);
		panel_9.setBackground(Color.BLACK);
		panel_5_1_1_2.add(panel_9);

		final JPanel panel_5_1_1_2_1 = new JPanel();
		panel_5_1_1_2_1.setBackground(Color.WHITE);
		panel_5_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_2_1.setLayout(null);
		panel_5_1_1_2_1.setBounds(280, 938, 281, 363);
		panel_3.add(panel_5_1_1_2_1);

		final JPanel panel_6_15_1_2_2 = new JPanel();
		panel_6_15_1_2_2.setBackground(Color.WHITE);
		panel_6_15_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_15_1_2_2.setLayout(null);
		panel_6_15_1_2_2.setBounds(0, 30, 178, 30);
		panel_5_1_1_2_1.add(panel_6_15_1_2_2);

		final JLabel alertLabel_11_1_1_2_2 = new JLabel();
		alertLabel_11_1_1_2_2.setText("Translusion");
		alertLabel_11_1_1_2_2.setBounds(10, 10, 158, 16);
		panel_6_15_1_2_2.add(alertLabel_11_1_1_2_2);

		final JPanel panel_6_2_2_1_2_1 = new JPanel();
		panel_6_2_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_2_2_1_2_1.setBackground(PanelColor);
		panel_6_2_2_1_2_1.setLayout(null);
		panel_6_2_2_1_2_1.setBounds(0, 60, 178, 30);
		panel_5_1_1_2_1.add(panel_6_2_2_1_2_1);

		final JLabel alertLabel_11_1_3_1 = new JLabel();
		alertLabel_11_1_3_1.setText("Galt Training / Prosthesis");
		alertLabel_11_1_3_1.setBounds(10, 8, 158, 16);
		panel_6_2_2_1_2_1.add(alertLabel_11_1_3_1);

		final JPanel panel_6_3_2_1_2_1 = new JPanel();
		panel_6_3_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_3_2_1_2_1.setBackground(PanelColor);
		panel_6_3_2_1_2_1.setLayout(null);
		panel_6_3_2_1_2_1.setBounds(0, 90, 178, 30);
		panel_5_1_1_2_1.add(panel_6_3_2_1_2_1);

		final JLabel alertLabel_1_2_1_2_1 = new JLabel();
		alertLabel_1_2_1_2_1.setText("Care");
		alertLabel_1_2_1_2_1.setBounds(10, 8, 130, 16);
		panel_6_3_2_1_2_1.add(alertLabel_1_2_1_2_1);

		final JPanel panel_6_4_2_1_2_1 = new JPanel();
		panel_6_4_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_2_1_2_1.setBackground(PanelColor);
		panel_6_4_2_1_2_1.setLayout(null);
		panel_6_4_2_1_2_1.setBounds(0, 120, 178, 30);
		panel_5_1_1_2_1.add(panel_6_4_2_1_2_1);

		final JLabel alertLabel_2_2_1_2_1 = new JLabel();
		alertLabel_2_2_1_2_1.setText("Self Administration of");
		alertLabel_2_2_1_2_1.setBounds(10, 8, 140, 16);
		panel_6_4_2_1_2_1.add(alertLabel_2_2_1_2_1);

		final JPanel panel_6_5_2_1_2_1 = new JPanel();
		panel_6_5_2_1_2_1.setBackground(PanelColor);
		panel_6_5_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_5_2_1_2_1.setLayout(null);
		panel_6_5_2_1_2_1.setBounds(0, 150, 178, 30);
		panel_5_1_1_2_1.add(panel_6_5_2_1_2_1);

		final JLabel alertLabel_3_2_1_2_1 = new JLabel();
		alertLabel_3_2_1_2_1.setText("Injectable Meds");
		alertLabel_3_2_1_2_1.setBounds(10, 8, 102, 16);
		panel_6_5_2_1_2_1.add(alertLabel_3_2_1_2_1);

		final JPanel panel_6_6_2_1_2_1 = new JPanel();
		panel_6_6_2_1_2_1.setBackground(PanelColor);
		panel_6_6_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_6_2_1_2_1.setLayout(null);
		panel_6_6_2_1_2_1.setBounds(0, 180, 178, 30);
		panel_5_1_1_2_1.add(panel_6_6_2_1_2_1);

		final JLabel alertLabel_4_2_1_2_1 = new JLabel();
		alertLabel_4_2_1_2_1.setText("Terminal Illness");
		alertLabel_4_2_1_2_1.setBounds(10, 8, 102, 16);
		panel_6_6_2_1_2_1.add(alertLabel_4_2_1_2_1);

		final JPanel panel_6_7_2_1_2_1 = new JPanel();
		panel_6_7_2_1_2_1.setBackground(PanelColor);
		panel_6_7_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_7_2_1_2_1.setLayout(null);
		panel_6_7_2_1_2_1.setBounds(0, 210, 178, 30);
		panel_5_1_1_2_1.add(panel_6_7_2_1_2_1);

		final JLabel alertLabel_5_2_1_2_1 = new JLabel();
		alertLabel_5_2_1_2_1.setText("Care / Teach");
		alertLabel_5_2_1_2_1.setBounds(10, 8, 127, 16);
		panel_6_7_2_1_2_1.add(alertLabel_5_2_1_2_1);

		final JPanel panel_6_8_2_1_2_1 = new JPanel();
		panel_6_8_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_8_2_1_2_1.setBackground(PanelColor);
		panel_6_8_2_1_2_1.setLayout(null);
		panel_6_8_2_1_2_1.setBounds(0, 240, 178, 30);
		panel_5_1_1_2_1.add(panel_6_8_2_1_2_1);

		final JLabel alertLabel_6_2_1_2_1 = new JLabel();
		alertLabel_6_2_1_2_1.setText("Diet Teaching");
		alertLabel_6_2_1_2_1.setBounds(10, 8, 138, 16);
		panel_6_8_2_1_2_1.add(alertLabel_6_2_1_2_1);

		final JPanel panel_6_9_2_1_2_1 = new JPanel();
		panel_6_9_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_9_2_1_2_1.setBackground(PanelColor);
		panel_6_9_2_1_2_1.setLayout(null);
		panel_6_9_2_1_2_1.setBounds(0, 270, 178, 30);
		panel_5_1_1_2_1.add(panel_6_9_2_1_2_1);

		final JLabel alertLabel_7_2_1_1_1 = new JLabel();
		alertLabel_7_2_1_1_1.setText("Bowel & Bladder Training");
		alertLabel_7_2_1_1_1.setBounds(10, 8, 158, 16);
		panel_6_9_2_1_2_1.add(alertLabel_7_2_1_1_1);

		final JPanel panel_6_10_2_1_2_1 = new JPanel();
		panel_6_10_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_10_2_1_2_1.setBackground(PanelColor);
		panel_6_10_2_1_2_1.setLayout(null);
		panel_6_10_2_1_2_1.setBounds(0, 300, 178, 30);
		panel_5_1_1_2_1.add(panel_6_10_2_1_2_1);

		final JLabel alertLabel_8_2_1_2_1 = new JLabel();
		alertLabel_8_2_1_2_1.setText("Teach / Care IV Catheter");
		alertLabel_8_2_1_2_1.setBounds(10, 8, 140, 16);
		panel_6_10_2_1_2_1.add(alertLabel_8_2_1_2_1);

		final JPanel panel_6_11_2_1_2_1 = new JPanel();
		panel_6_11_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_11_2_1_2_1.setBackground(PanelColor);
		panel_6_11_2_1_2_1.setLayout(null);
		panel_6_11_2_1_2_1.setBounds(0, 330, 178, 30);
		panel_5_1_1_2_1.add(panel_6_11_2_1_2_1);

		final JLabel alertLabel_9_2_2_2_1 = new JLabel();
		alertLabel_9_2_2_2_1.setText("Sites");
		alertLabel_9_2_2_2_1.setBounds(10, 8, 138, 16);
		panel_6_11_2_1_2_1.add(alertLabel_9_2_2_2_1);

		final JPanel panel_7_14_1_2_2 = new JPanel();
		panel_7_14_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_14_1_2_2.setBackground(PanelColor);
		panel_7_14_1_2_2.setLayout(null);
		panel_7_14_1_2_2.setBounds(178, 30, 102, 30);
		panel_5_1_1_2_1.add(panel_7_14_1_2_2);

		final JPanel panel_8_4_1_2_2 = new JPanel();
		panel_8_4_1_2_2.setBackground(PanelColor);
		panel_8_4_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_4_1_2_2.setBounds(0, 30, 34, 30);
		panel_7_14_1_2_2.add(panel_8_4_1_2_2);

		final JLabel nLabel_4_1_2_2 = new JLabel();
		nLabel_4_1_2_2.setText("New JLabel");
		panel_8_4_1_2_2.add(nLabel_4_1_2_2);

		final JPanel panel_8_1_2_1_2_2 = new JPanel();
		panel_8_1_2_1_2_2.setBackground(PanelColor);
		panel_8_1_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2_1_2_2.setBounds(34, 0, 34, 30);
		panel_7_14_1_2_2.add(panel_8_1_2_1_2_2);

		cbTranslusionD = new JCheckBox();
		cbTranslusionD.setText("");
		cbTranslusionD.setBackground(PanelColor);
		panel_8_1_2_1_2_2.add(cbTranslusionD);

		final JPanel panel_8_2_2_1_2_2 = new JPanel();
		panel_8_2_2_1_2_2.setBackground(PanelColor);
		panel_8_2_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_2_1_2_2.setBounds(68, 0, 34, 30);
		panel_7_14_1_2_2.add(panel_8_2_2_1_2_2);

		cbTranslusionE = new JCheckBox();
		cbTranslusionE.setBackground(PanelColor);
		cbTranslusionE.setText("");
		panel_8_2_2_1_2_2.add(cbTranslusionE);

		final JPanel panel_8_6_2_1_1_2_2 = new JPanel();
		panel_8_6_2_1_1_2_2.setBackground(PanelColor);
		panel_8_6_2_1_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_6_2_1_1_2_2.setBounds(0, 0, 34, 30);
		panel_7_14_1_2_2.add(panel_8_6_2_1_1_2_2);

		cbTranslusionN = new JCheckBox();
		cbTranslusionN.setBackground(PanelColor);
		cbTranslusionN.setText("");
		panel_8_6_2_1_1_2_2.add(cbTranslusionN);

		final JPanel panel_7_3_2_1_2_1 = new JPanel();
		panel_7_3_2_1_2_1.setBackground(PanelColor);
		panel_7_3_2_1_2_1.setLayout(null);
		panel_7_3_2_1_2_1.setBounds(178, 90, 102, 30);
		panel_5_1_1_2_1.add(panel_7_3_2_1_2_1);

		final JPanel panel_8_9_2_1_2_1 = new JPanel();
		panel_8_9_2_1_2_1.setBackground(PanelColor);
		panel_8_9_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_9_2_1_2_1.setBounds(0, 0, 34, 30);
		panel_7_3_2_1_2_1.add(panel_8_9_2_1_2_1);

		cbCareN = new JCheckBox();
		cbCareN.setBackground(PanelColor);
		cbCareN.setText("");
		panel_8_9_2_1_2_1.add(cbCareN);

		final JPanel panel_8_10_2_1_2_1 = new JPanel();
		panel_8_10_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_2_1_2_1.setBackground(PanelColor);
		panel_8_10_2_1_2_1.setBounds(34, 0, 34, 30);
		panel_7_3_2_1_2_1.add(panel_8_10_2_1_2_1);

		cbCareD = new JCheckBox();
		cbCareD.setBackground(PanelColor);
		cbCareD.setText("");
		panel_8_10_2_1_2_1.add(cbCareD);

		final JPanel panel_8_11_2_1_2_1 = new JPanel();
		panel_8_11_2_1_2_1.setBackground(PanelColor);
		panel_8_11_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_11_2_1_2_1.setBounds(68, 0, 34, 30);
		panel_7_3_2_1_2_1.add(panel_8_11_2_1_2_1);

		cbCareE = new JCheckBox();
		cbCareE.setText("");
		cbCareE.setBackground(PanelColor);
		panel_8_11_2_1_2_1.add(cbCareE);

		final JPanel panel_7_4_2_1_2_1 = new JPanel();
		panel_7_4_2_1_2_1.setBackground(Color.BLACK);
		panel_7_4_2_1_2_1.setLayout(null);
		panel_7_4_2_1_2_1.setBounds(178, 120, 102, 30);
		panel_5_1_1_2_1.add(panel_7_4_2_1_2_1);

		final JPanel panel_7_5_2_1_2_1 = new JPanel();
		panel_7_5_2_1_2_1.setBackground(PanelColor);
		panel_7_5_2_1_2_1.setLayout(null);
		panel_7_5_2_1_2_1.setBounds(178, 150, 102, 30);
		panel_5_1_1_2_1.add(panel_7_5_2_1_2_1);

		final JPanel panel_8_15_2_1_2_1 = new JPanel();
		panel_8_15_2_1_2_1.setBackground(PanelColor);
		panel_8_15_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_15_2_1_2_1.setBounds(0, 0, 34, 30);
		panel_7_5_2_1_2_1.add(panel_8_15_2_1_2_1);

		cbInjectableMedsN = new JCheckBox();
		cbInjectableMedsN.setBackground(PanelColor);
		cbInjectableMedsN.setText("");
		panel_8_15_2_1_2_1.add(cbInjectableMedsN);

		final JPanel panel_8_16_2_1_2_1 = new JPanel();
		panel_8_16_2_1_2_1.setBackground(PanelColor);
		panel_8_16_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_16_2_1_2_1.setBounds(34, 0, 34, 30);
		panel_7_5_2_1_2_1.add(panel_8_16_2_1_2_1);

		cbInjectableMedsD = new JCheckBox();
		cbInjectableMedsD.setBackground(PanelColor);
		cbInjectableMedsD.setText("");
		panel_8_16_2_1_2_1.add(cbInjectableMedsD);

		final JPanel panel_8_17_2_1_2_1 = new JPanel();
		panel_8_17_2_1_2_1.setBackground(PanelColor);
		panel_8_17_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_17_2_1_2_1.setBounds(68, 0, 34, 30);
		panel_7_5_2_1_2_1.add(panel_8_17_2_1_2_1);

		cbInjectableMedsE = new JCheckBox();
		cbInjectableMedsE.setBackground(PanelColor);
		cbInjectableMedsE.setText("");
		panel_8_17_2_1_2_1.add(cbInjectableMedsE);

		final JPanel panel_7_6_2_1_2_1 = new JPanel();
		panel_7_6_2_1_2_1.setLayout(null);
		panel_7_6_2_1_2_1.setBackground(Color.BLACK);
		panel_7_6_2_1_2_1.setBounds(178, 180, 102, 30);
		panel_5_1_1_2_1.add(panel_7_6_2_1_2_1);

		final JPanel panel_7_7_2_1_2_1 = new JPanel();
		panel_7_7_2_1_2_1.setLayout(null);
		panel_7_7_2_1_2_1.setBackground(PanelColor);
		panel_7_7_2_1_2_1.setBounds(178, 210, 102, 30);
		panel_5_1_1_2_1.add(panel_7_7_2_1_2_1);

		final JPanel panel_7_6_2_1_2_1_1 = new JPanel();
		panel_7_6_2_1_2_1_1.setBackground(PanelColor);
		panel_7_6_2_1_2_1_1.setLayout(null);
		panel_7_6_2_1_2_1_1.setBounds(0, 0, 102, 30);
		panel_7_7_2_1_2_1.add(panel_7_6_2_1_2_1_1);

		final JPanel panel_8_18_2_1_2_1_1 = new JPanel();
		panel_8_18_2_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_18_2_1_2_1_1.setBackground(PanelColor);
		panel_8_18_2_1_2_1_1.setBounds(0, 0, 34, 30);
		panel_7_6_2_1_2_1_1.add(panel_8_18_2_1_2_1_1);

		cbCareTeachN = new JCheckBox();
		cbCareTeachN.setText("");
		cbCareTeachN.setBackground(PanelColor);
		panel_8_18_2_1_2_1_1.add(cbCareTeachN);

		final JPanel panel_8_19_2_1_2_1_1 = new JPanel();
		panel_8_19_2_1_2_1_1.setBackground(PanelColor);
		panel_8_19_2_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_19_2_1_2_1_1.setBounds(34, 0, 34, 30);
		panel_7_6_2_1_2_1_1.add(panel_8_19_2_1_2_1_1);

		cbCareTeachD = new JCheckBox();
		cbCareTeachD.setText("");
		cbCareTeachD.setBackground(PanelColor);
		panel_8_19_2_1_2_1_1.add(cbCareTeachD);

		final JPanel panel_8_20_2_1_2_1_1 = new JPanel();
		panel_8_20_2_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_20_2_1_2_1_1.setBackground(PanelColor);
		panel_8_20_2_1_2_1_1.setBounds(68, 0, 34, 30);
		panel_7_6_2_1_2_1_1.add(panel_8_20_2_1_2_1_1);

		cbCareTeachE = new JCheckBox();
		cbCareTeachE.setText("");
		cbCareTeachE.setBackground(PanelColor);
		panel_8_20_2_1_2_1_1.add(cbCareTeachE);

		final JPanel panel_7_8_2_1_2_1 = new JPanel();
		panel_7_8_2_1_2_1.setBackground(PanelColor);
		panel_7_8_2_1_2_1.setLayout(null);
		panel_7_8_2_1_2_1.setBounds(178, 240, 102, 30);
		panel_5_1_1_2_1.add(panel_7_8_2_1_2_1);

		final JPanel panel_8_21_2_1_2_1 = new JPanel();
		panel_8_21_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_21_2_1_2_1.setBackground(PanelColor);
		panel_8_21_2_1_2_1.setBounds(0, 0, 34, 30);
		panel_7_8_2_1_2_1.add(panel_8_21_2_1_2_1);

		cbDietTeachingN = new JCheckBox();
		cbDietTeachingN.setText("");
		cbDietTeachingN.setBackground(PanelColor);
		panel_8_21_2_1_2_1.add(cbDietTeachingN);

		final JPanel panel_8_25_2_1_2_1 = new JPanel();
		panel_8_25_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_25_2_1_2_1.setBackground(PanelColor);
		panel_8_25_2_1_2_1.setBounds(34, 0, 34, 30);
		panel_7_8_2_1_2_1.add(panel_8_25_2_1_2_1);

		cbDietTeachingD = new JCheckBox();
		cbDietTeachingD.setText("");
		cbDietTeachingD.setBackground(PanelColor);
		panel_8_25_2_1_2_1.add(cbDietTeachingD);

		final JPanel panel_8_26_2_1_2_1 = new JPanel();
		panel_8_26_2_1_2_1.setBackground(PanelColor);
		panel_8_26_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_26_2_1_2_1.setBounds(68, 0, 34, 30);
		panel_7_8_2_1_2_1.add(panel_8_26_2_1_2_1);

		cbDietTeachingE = new JCheckBox();
		cbDietTeachingE.setText("");
		cbDietTeachingE.setBackground(PanelColor);
		panel_8_26_2_1_2_1.add(cbDietTeachingE);

		final JPanel panel_7_9_2_1_2_1 = new JPanel();
		panel_7_9_2_1_2_1.setLayout(null);
		panel_7_9_2_1_2_1.setBackground(PanelColor);
		panel_7_9_2_1_2_1.setBounds(178, 270, 102, 30);
		panel_5_1_1_2_1.add(panel_7_9_2_1_2_1);

		final JPanel panel_8_27_2_1_2_1 = new JPanel();
		panel_8_27_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_27_2_1_2_1.setBackground(PanelColor);
		panel_8_27_2_1_2_1.setBounds(0, 0, 34, 30);
		panel_7_9_2_1_2_1.add(panel_8_27_2_1_2_1);

		cbBowelBladderTrainingN = new JCheckBox();
		cbBowelBladderTrainingN.setBackground(PanelColor);
		cbBowelBladderTrainingN.setText("");
		panel_8_27_2_1_2_1.add(cbBowelBladderTrainingN);

		final JPanel panel_8_28_2_1_2_1 = new JPanel();
		panel_8_28_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_28_2_1_2_1.setBackground(PanelColor);
		panel_8_28_2_1_2_1.setBounds(34, 0, 34, 30);
		panel_7_9_2_1_2_1.add(panel_8_28_2_1_2_1);

		cbBowelBladderTrainingD = new JCheckBox();
		cbBowelBladderTrainingD.setText("");
		cbBowelBladderTrainingD.setBackground(PanelColor);
		panel_8_28_2_1_2_1.add(cbBowelBladderTrainingD);

		final JPanel panel_8_29_2_1_2_1 = new JPanel();
		panel_8_29_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_29_2_1_2_1.setBackground(PanelColor);
		panel_8_29_2_1_2_1.setBounds(68, 0, 34, 30);
		panel_7_9_2_1_2_1.add(panel_8_29_2_1_2_1);

		cbBowelBladderTrainingE = new JCheckBox();
		cbBowelBladderTrainingE.setBackground(PanelColor);
		cbBowelBladderTrainingE.setText("");
		panel_8_29_2_1_2_1.add(cbBowelBladderTrainingE);

		final JPanel panel_7_10_2_1_1_1 = new JPanel();
		panel_7_10_2_1_1_1.setLayout(null);
		panel_7_10_2_1_1_1.setBackground(Color.BLACK);
		panel_7_10_2_1_1_1.setBounds(178, 300, 102, 30);
		panel_5_1_1_2_1.add(panel_7_10_2_1_1_1);

		final JPanel panel_7_11_2_1_2_1 = new JPanel();
		panel_7_11_2_1_2_1.setLayout(null);
		panel_7_11_2_1_2_1.setBackground(PanelColor);
		panel_7_11_2_1_2_1.setBounds(178, 330, 102, 30);
		panel_5_1_1_2_1.add(panel_7_11_2_1_2_1);

		panel_8_30_6 = new JPanel();
		panel_8_30_6.setBackground(Color.WHITE);
		panel_8_30_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_30_6.setBounds(0, 0, 34, 30);
		panel_7_11_2_1_2_1.add(panel_8_30_6);

		cbSitesN = new JCheckBox();
		cbSitesN.setText("");
		cbSitesN.setBackground(PanelColor);
		panel_8_30_6.add(cbSitesN);

		final JPanel panel_8_31_2_1_2_1 = new JPanel();
		panel_8_31_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_31_2_1_2_1.setBackground(PanelColor);
		panel_8_31_2_1_2_1.setBounds(34, 0, 34, 30);
		panel_7_11_2_1_2_1.add(panel_8_31_2_1_2_1);

		cbSitesD = new JCheckBox();
		cbSitesD.setText("");
		cbSitesD.setBackground(PanelColor);
		panel_8_31_2_1_2_1.add(cbSitesD);

		final JPanel panel_8_32_2_1_2_1 = new JPanel();
		panel_8_32_2_1_2_1.setBackground(PanelColor);
		panel_8_32_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_32_2_1_2_1.setBounds(68, 0, 34, 30);
		panel_7_11_2_1_2_1.add(panel_8_32_2_1_2_1);

		cbSitesE = new JCheckBox();
		cbSitesE.setBackground(PanelColor);
		cbSitesE.setText("");
		panel_8_32_2_1_2_1.add(cbSitesE);

		final JPanel panel_6_1_2_1_2_1 = new JPanel();
		panel_6_1_2_1_2_1.setBackground(PanelColor);
		panel_6_1_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_2_1_2_1.setLayout(null);
		panel_6_1_2_1_2_1.setBounds(0, 29, 280, 1);
		panel_5_1_1_2_1.add(panel_6_1_2_1_2_1);

		final JPanel panel_6_15_1_2_1_1 = new JPanel();
		panel_6_15_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_15_1_2_1_1.setBackground(PanelColor);
		panel_6_15_1_2_1_1.setLayout(null);
		panel_6_15_1_2_1_1.setBounds(0, 0, 178, 30);
		panel_5_1_1_2_1.add(panel_6_15_1_2_1_1);

		final JLabel alertLabel_11_1_1_2_1_1 = new JLabel();
		alertLabel_11_1_1_2_1_1.setText("Observe S/SX Infection");
		alertLabel_11_1_1_2_1_1.setBounds(10, 10, 158, 16);
		panel_6_15_1_2_1_1.add(alertLabel_11_1_1_2_1_1);

		final JPanel panel_7_14_1_2_1_1 = new JPanel();
		panel_7_14_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_14_1_2_1_1.setLayout(null);
		panel_7_14_1_2_1_1.setBackground(PanelColor);
		panel_7_14_1_2_1_1.setBounds(178, 0, 102, 30);
		panel_5_1_1_2_1.add(panel_7_14_1_2_1_1);

		final JPanel panel_8_4_1_2_1_1 = new JPanel();
		panel_8_4_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_4_1_2_1_1.setBackground(PanelColor);
		panel_8_4_1_2_1_1.setBounds(0, 30, 34, 30);
		panel_7_14_1_2_1_1.add(panel_8_4_1_2_1_1);

		final JLabel nLabel_4_1_2_1_1 = new JLabel();
		nLabel_4_1_2_1_1.setText("");
		panel_8_4_1_2_1_1.add(nLabel_4_1_2_1_1);

		final JPanel panel_8_1_2_1_2_1_1 = new JPanel();
		panel_8_1_2_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2_1_2_1_1.setBackground(PanelColor);
		panel_8_1_2_1_2_1_1.setBounds(34, 0, 34, 30);
		panel_7_14_1_2_1_1.add(panel_8_1_2_1_2_1_1);

		cbObserveSsxInfectionD = new JCheckBox();
		cbObserveSsxInfectionD.setBackground(PanelColor);
		cbObserveSsxInfectionD.setText("");
		panel_8_1_2_1_2_1_1.add(cbObserveSsxInfectionD);

		final JPanel panel_8_2_2_1_2_1_1 = new JPanel();
		panel_8_2_2_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_2_1_2_1_1.setBackground(PanelColor);
		panel_8_2_2_1_2_1_1.setBounds(68, 0, 34, 30);
		panel_7_14_1_2_1_1.add(panel_8_2_2_1_2_1_1);

		cbObserveSsxInfectionE = new JCheckBox();
		cbObserveSsxInfectionE.setBackground(PanelColor);
		cbObserveSsxInfectionE.setText("");
		panel_8_2_2_1_2_1_1.add(cbObserveSsxInfectionE);

		final JPanel panel_8_6_2_1_1_2_1_1 = new JPanel();
		panel_8_6_2_1_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_6_2_1_1_2_1_1.setBackground(PanelColor);
		panel_8_6_2_1_1_2_1_1.setBounds(0, 0, 34, 30);
		panel_7_14_1_2_1_1.add(panel_8_6_2_1_1_2_1_1);

		cbObserveSsxInfectionN = new JCheckBox();
		cbObserveSsxInfectionN.setBackground(PanelColor);
		cbObserveSsxInfectionN.setText("");
		panel_8_6_2_1_1_2_1_1.add(cbObserveSsxInfectionN);

		final JPanel panel_9_1 = new JPanel();
		panel_9_1.setBackground(Color.BLACK);
		panel_9_1.setBounds(178, 60, 102, 30);
		panel_5_1_1_2_1.add(panel_9_1);

		final JPanel panel_5_1_1_2_2 = new JPanel();
		panel_5_1_1_2_2.setBackground(Color.WHITE);
		panel_5_1_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_2_2.setLayout(null);
		panel_5_1_1_2_2.setBounds(560, 938, 281, 363);
		panel_3.add(panel_5_1_1_2_2);

		final JPanel panel_6_15_1_2_3 = new JPanel();
		panel_6_15_1_2_3.setBackground(PanelColor);
		panel_6_15_1_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_15_1_2_3.setLayout(null);
		panel_6_15_1_2_3.setBounds(0, 30, 178, 30);
		panel_5_1_1_2_2.add(panel_6_15_1_2_3);

		final JLabel alertLabel_11_1_1_2_3 = new JLabel();
		alertLabel_11_1_1_2_3.setText("Pressure Ulser Care");
		alertLabel_11_1_1_2_3.setBounds(10, 10, 158, 16);
		panel_6_15_1_2_3.add(alertLabel_11_1_1_2_3);

		final JPanel panel_6_2_2_1_2_2 = new JPanel();
		panel_6_2_2_1_2_2.setBackground(PanelColor);
		panel_6_2_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_2_2_1_2_2.setLayout(null);
		panel_6_2_2_1_2_2.setBounds(0, 60, 178, 30);
		panel_5_1_1_2_2.add(panel_6_2_2_1_2_2);

		final JLabel alertLabel_11_1_3_2 = new JLabel();
		alertLabel_11_1_3_2.setText("Statis Ulser");
		alertLabel_11_1_3_2.setBounds(10, 8, 158, 16);
		panel_6_2_2_1_2_2.add(alertLabel_11_1_3_2);

		final JPanel panel_6_3_2_1_2_2 = new JPanel();
		panel_6_3_2_1_2_2.setBackground(PanelColor);
		panel_6_3_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_3_2_1_2_2.setLayout(null);
		panel_6_3_2_1_2_2.setBounds(0, 90, 178, 30);
		panel_5_1_1_2_2.add(panel_6_3_2_1_2_2);

		final JLabel alertLabel_1_2_1_2_2 = new JLabel();
		alertLabel_1_2_1_2_2.setText("Tracheostomy Care");
		alertLabel_1_2_1_2_2.setBounds(10, 8, 130, 16);
		panel_6_3_2_1_2_2.add(alertLabel_1_2_1_2_2);

		final JPanel panel_6_4_2_1_2_2 = new JPanel();
		panel_6_4_2_1_2_2.setBackground(PanelColor);
		panel_6_4_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_2_1_2_2.setLayout(null);
		panel_6_4_2_1_2_2.setBounds(0, 120, 178, 30);
		panel_5_1_1_2_2.add(panel_6_4_2_1_2_2);

		final JLabel alertLabel_2_2_1_2_2 = new JLabel();
		alertLabel_2_2_1_2_2.setText("Suctioning");
		alertLabel_2_2_1_2_2.setBounds(10, 8, 140, 16);
		panel_6_4_2_1_2_2.add(alertLabel_2_2_1_2_2);

		final JPanel panel_6_5_2_1_2_2 = new JPanel();
		panel_6_5_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_5_2_1_2_2.setBackground(PanelColor);
		panel_6_5_2_1_2_2.setLayout(null);
		panel_6_5_2_1_2_2.setBounds(0, 150, 178, 30);
		panel_5_1_1_2_2.add(panel_6_5_2_1_2_2);

		final JLabel alertLabel_3_2_1_2_2 = new JLabel();
		alertLabel_3_2_1_2_2.setText("IV Medication");
		alertLabel_3_2_1_2_2.setBounds(10, 8, 102, 16);
		panel_6_5_2_1_2_2.add(alertLabel_3_2_1_2_2);

		final JPanel panel_6_6_2_1_2_2 = new JPanel();
		panel_6_6_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_6_2_1_2_2.setBackground(PanelColor);
		panel_6_6_2_1_2_2.setLayout(null);
		panel_6_6_2_1_2_2.setBounds(0, 180, 178, 30);
		panel_5_1_1_2_2.add(panel_6_6_2_1_2_2);

		final JLabel alertLabel_4_2_1_2_2 = new JLabel();
		alertLabel_4_2_1_2_2.setText("IV Feeding / Hydration");
		alertLabel_4_2_1_2_2.setBounds(10, 8, 102, 16);
		panel_6_6_2_1_2_2.add(alertLabel_4_2_1_2_2);

		final JPanel panel_6_7_2_1_2_2 = new JPanel();
		panel_6_7_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_7_2_1_2_2.setBackground(PanelColor);
		panel_6_7_2_1_2_2.setLayout(null);
		panel_6_7_2_1_2_2.setBounds(0, 210, 178, 30);
		panel_5_1_1_2_2.add(panel_6_7_2_1_2_2);

		final JLabel alertLabel_5_2_1_2_2 = new JLabel();
		alertLabel_5_2_1_2_2.setText("Intramuscular Injections");
		alertLabel_5_2_1_2_2.setBounds(10, 8, 127, 16);
		panel_6_7_2_1_2_2.add(alertLabel_5_2_1_2_2);

		final JPanel panel_6_8_2_1_2_2 = new JPanel();
		panel_6_8_2_1_2_2.setBackground(PanelColor);
		panel_6_8_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_8_2_1_2_2.setLayout(null);
		panel_6_8_2_1_2_2.setBounds(0, 240, 178, 30);
		panel_5_1_1_2_2.add(panel_6_8_2_1_2_2);

		final JLabel alertLabel_6_2_1_2_2 = new JLabel();
		alertLabel_6_2_1_2_2.setText("Tube Feeding");
		alertLabel_6_2_1_2_2.setBounds(10, 8, 138, 16);
		panel_6_8_2_1_2_2.add(alertLabel_6_2_1_2_2);

		final JPanel panel_6_9_2_1_2_2 = new JPanel();
		panel_6_9_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_9_2_1_2_2.setBackground(PanelColor);
		panel_6_9_2_1_2_2.setLayout(null);
		panel_6_9_2_1_2_2.setBounds(0, 270, 178, 30);
		panel_5_1_1_2_2.add(panel_6_9_2_1_2_2);

		final JLabel alertLabel_7_2_1_1_2 = new JLabel();
		alertLabel_7_2_1_1_2.setText("Pain Management");
		alertLabel_7_2_1_1_2.setBounds(10, 8, 158, 16);
		panel_6_9_2_1_2_2.add(alertLabel_7_2_1_1_2);

		final JPanel panel_6_10_2_1_2_2 = new JPanel();
		panel_6_10_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_10_2_1_2_2.setBackground(PanelColor);
		panel_6_10_2_1_2_2.setLayout(null);
		panel_6_10_2_1_2_2.setBounds(0, 300, 178, 30);
		panel_5_1_1_2_2.add(panel_6_10_2_1_2_2);

		final JPanel panel_6_11_2_1_2_2 = new JPanel();
		panel_6_11_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_11_2_1_2_2.setBackground(PanelColor);
		panel_6_11_2_1_2_2.setLayout(null);
		panel_6_11_2_1_2_2.setBounds(0, 330, 178, 30);
		panel_5_1_1_2_2.add(panel_6_11_2_1_2_2);

		final JPanel panel_7_14_1_2_3 = new JPanel();
		panel_7_14_1_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_14_1_2_3.setBackground(PanelColor);
		panel_7_14_1_2_3.setLayout(null);
		panel_7_14_1_2_3.setBounds(178, 30, 102, 30);
		panel_5_1_1_2_2.add(panel_7_14_1_2_3);

		final JPanel panel_8_4_1_2_3 = new JPanel();
		panel_8_4_1_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_4_1_2_3.setBackground(PanelColor);
		panel_8_4_1_2_3.setBounds(0, 30, 34, 30);
		panel_7_14_1_2_3.add(panel_8_4_1_2_3);

		final JLabel nLabel_4_1_2_3 = new JLabel();
		nLabel_4_1_2_3.setText("New JLabel");
		panel_8_4_1_2_3.add(nLabel_4_1_2_3);

		final JPanel panel_8_1_2_1_2_3 = new JPanel();
		panel_8_1_2_1_2_3.setBackground(PanelColor);
		panel_8_1_2_1_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2_1_2_3.setBounds(34, 0, 34, 30);
		panel_7_14_1_2_3.add(panel_8_1_2_1_2_3);

		cbPressureUlcerCareD = new JCheckBox();
		cbPressureUlcerCareD.setBackground(PanelColor);
		cbPressureUlcerCareD.setText("");
		panel_8_1_2_1_2_3.add(cbPressureUlcerCareD);

		final JPanel panel_8_2_2_1_2_3 = new JPanel();
		panel_8_2_2_1_2_3.setBackground(PanelColor);
		panel_8_2_2_1_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_2_1_2_3.setBounds(68, 0, 34, 30);
		panel_7_14_1_2_3.add(panel_8_2_2_1_2_3);

		cbPressureUlcerCareE = new JCheckBox();
		cbPressureUlcerCareE.setBackground(PanelColor);
		cbPressureUlcerCareE.setText("");
		panel_8_2_2_1_2_3.add(cbPressureUlcerCareE);

		final JPanel panel_8_6_2_1_1_2_3 = new JPanel();
		panel_8_6_2_1_1_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_6_2_1_1_2_3.setBackground(PanelColor);
		panel_8_6_2_1_1_2_3.setBounds(0, 0, 34, 30);
		panel_7_14_1_2_3.add(panel_8_6_2_1_1_2_3);

		cbPressureUlcerCareN = new JCheckBox();
		cbPressureUlcerCareN.setText("");
		cbPressureUlcerCareN.setBackground(PanelColor);
		panel_8_6_2_1_1_2_3.add(cbPressureUlcerCareN);

		final JPanel panel_7_3_2_1_2_2 = new JPanel();
		panel_7_3_2_1_2_2.setLayout(null);
		panel_7_3_2_1_2_2.setBackground(PanelColor);
		panel_7_3_2_1_2_2.setBounds(178, 90, 102, 30);
		panel_5_1_1_2_2.add(panel_7_3_2_1_2_2);

		final JPanel panel_8_9_2_1_2_2 = new JPanel();
		panel_8_9_2_1_2_2.setBackground(PanelColor);
		panel_8_9_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_9_2_1_2_2.setBounds(0, 0, 34, 30);
		panel_7_3_2_1_2_2.add(panel_8_9_2_1_2_2);

		cbTracheostomyCareN = new JCheckBox();
		cbTracheostomyCareN.setBackground(PanelColor);
		cbTracheostomyCareN.setText("");
		panel_8_9_2_1_2_2.add(cbTracheostomyCareN);

		final JPanel panel_8_10_2_1_2_2 = new JPanel();
		panel_8_10_2_1_2_2.setBackground(PanelColor);
		panel_8_10_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_2_1_2_2.setBounds(34, 0, 34, 30);
		panel_7_3_2_1_2_2.add(panel_8_10_2_1_2_2);

		cbTracheostomyCareD = new JCheckBox();
		cbTracheostomyCareD.setBackground(PanelColor);
		cbTracheostomyCareD.setText("");
		panel_8_10_2_1_2_2.add(cbTracheostomyCareD);

		final JPanel panel_8_11_2_1_2_2 = new JPanel();
		panel_8_11_2_1_2_2.setBackground(PanelColor);
		panel_8_11_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_11_2_1_2_2.setBounds(68, 0, 34, 30);
		panel_7_3_2_1_2_2.add(panel_8_11_2_1_2_2);

		cbTracheostomyCareE = new JCheckBox();
		cbTracheostomyCareE.setText("");
		cbTracheostomyCareE.setBackground(PanelColor);
		panel_8_11_2_1_2_2.add(cbTracheostomyCareE);

		final JPanel panel_7_4_2_1_2_2 = new JPanel();
		panel_7_4_2_1_2_2.setBackground(PanelColor);
		panel_7_4_2_1_2_2.setLayout(null);
		panel_7_4_2_1_2_2.setBounds(178, 120, 102, 30);
		panel_5_1_1_2_2.add(panel_7_4_2_1_2_2);

		final JPanel panel_8_12_2_1_2_1 = new JPanel();
		panel_8_12_2_1_2_1.setBackground(PanelColor);
		panel_8_12_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_12_2_1_2_1.setBounds(0, 0, 34, 30);
		panel_7_4_2_1_2_2.add(panel_8_12_2_1_2_1);

		cbPainSuctiongN = new JCheckBox();
		cbPainSuctiongN.setBackground(PanelColor);
		cbPainSuctiongN.setText("");
		panel_8_12_2_1_2_1.add(cbPainSuctiongN);

		final JPanel panel_8_13_2_1_2_1 = new JPanel();
		panel_8_13_2_1_2_1.setBackground(PanelColor);
		panel_8_13_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_13_2_1_2_1.setBounds(34, 0, 34, 30);
		panel_7_4_2_1_2_2.add(panel_8_13_2_1_2_1);

		cbPainSuctiongD = new JCheckBox();
		cbPainSuctiongD.setBackground(PanelColor);
		cbPainSuctiongD.setText("");
		panel_8_13_2_1_2_1.add(cbPainSuctiongD);

		final JPanel panel_8_14_2_1_2_1 = new JPanel();
		panel_8_14_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_14_2_1_2_1.setBackground(PanelColor);
		panel_8_14_2_1_2_1.setBounds(68, 0, 34, 30);
		panel_7_4_2_1_2_2.add(panel_8_14_2_1_2_1);

		cbPainSuctiongE = new JCheckBox();
		cbPainSuctiongE.setText("");
		cbPainSuctiongE.setBackground(PanelColor);
		panel_8_14_2_1_2_1.add(cbPainSuctiongE);

		final JPanel panel_7_5_2_1_2_2 = new JPanel();
		panel_7_5_2_1_2_2.setLayout(null);
		panel_7_5_2_1_2_2.setBackground(PanelColor);
		panel_7_5_2_1_2_2.setBounds(178, 150, 102, 30);
		panel_5_1_1_2_2.add(panel_7_5_2_1_2_2);

		final JPanel panel_8_15_2_1_2_2 = new JPanel();
		panel_8_15_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_15_2_1_2_2.setBackground(PanelColor);
		panel_8_15_2_1_2_2.setBounds(0, 0, 34, 30);
		panel_7_5_2_1_2_2.add(panel_8_15_2_1_2_2);

		cbMedicationN = new JCheckBox();
		cbMedicationN.setBackground(PanelColor);
		cbMedicationN.setText("");
		panel_8_15_2_1_2_2.add(cbMedicationN);

		final JPanel panel_8_16_2_1_2_2 = new JPanel();
		panel_8_16_2_1_2_2.setBackground(PanelColor);
		panel_8_16_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_16_2_1_2_2.setBounds(34, 0, 34, 30);
		panel_7_5_2_1_2_2.add(panel_8_16_2_1_2_2);

		cbMedicationD = new JCheckBox();
		cbMedicationD.setText("");
		cbMedicationD.setBackground(PanelColor);
		panel_8_16_2_1_2_2.add(cbMedicationD);

		final JPanel panel_8_17_2_1_2_2 = new JPanel();
		panel_8_17_2_1_2_2.setBackground(PanelColor);
		panel_8_17_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_17_2_1_2_2.setBounds(68, 0, 34, 30);
		panel_7_5_2_1_2_2.add(panel_8_17_2_1_2_2);

		cbMedicationE = new JCheckBox();
		cbMedicationE.setText("");
		cbMedicationE.setBackground(PanelColor);
		panel_8_17_2_1_2_2.add(cbMedicationE);

		final JPanel panel_7_6_2_1_2_2 = new JPanel();
		panel_7_6_2_1_2_2.setBackground(PanelColor);
		panel_7_6_2_1_2_2.setLayout(null);
		panel_7_6_2_1_2_2.setBounds(178, 180, 102, 30);
		panel_5_1_1_2_2.add(panel_7_6_2_1_2_2);

		final JPanel panel_8_18_2_1_2_1 = new JPanel();
		panel_8_18_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_18_2_1_2_1.setBackground(PanelColor);
		panel_8_18_2_1_2_1.setBounds(0, 0, 34, 30);
		panel_7_6_2_1_2_2.add(panel_8_18_2_1_2_1);

		cbFeedingHydrationN = new JCheckBox();
		cbFeedingHydrationN.setText("");
		cbFeedingHydrationN.setBackground(PanelColor);
		panel_8_18_2_1_2_1.add(cbFeedingHydrationN);

		final JPanel panel_8_19_2_1_2_1 = new JPanel();
		panel_8_19_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_19_2_1_2_1.setBackground(PanelColor);
		panel_8_19_2_1_2_1.setBounds(34, 0, 34, 30);
		panel_7_6_2_1_2_2.add(panel_8_19_2_1_2_1);

		cbFeedingHydrationD = new JCheckBox();
		cbFeedingHydrationD.setBackground(PanelColor);
		cbFeedingHydrationD.setText("");
		panel_8_19_2_1_2_1.add(cbFeedingHydrationD);

		final JPanel panel_8_20_2_1_2_1 = new JPanel();
		panel_8_20_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_20_2_1_2_1.setBackground(PanelColor);
		panel_8_20_2_1_2_1.setBounds(68, 0, 34, 30);
		panel_7_6_2_1_2_2.add(panel_8_20_2_1_2_1);

		cbFeedingHydrationE = new JCheckBox();
		cbFeedingHydrationE.setText("");
		cbFeedingHydrationE.setBackground(PanelColor);
		panel_8_20_2_1_2_1.add(cbFeedingHydrationE);

		final JPanel panel_7_7_2_1_2_2 = new JPanel();
		panel_7_7_2_1_2_2.setLayout(null);
		panel_7_7_2_1_2_2.setBackground(PanelColor);
		panel_7_7_2_1_2_2.setBounds(178, 210, 102, 30);
		panel_5_1_1_2_2.add(panel_7_7_2_1_2_2);

		final JPanel panel_7_14_1_2_1_2_2 = new JPanel();
		panel_7_14_1_2_1_2_2.setBackground(PanelColor);
		panel_7_14_1_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_14_1_2_1_2_2.setLayout(null);
		panel_7_14_1_2_1_2_2.setBounds(0, 0, 102, 30);
		panel_7_7_2_1_2_2.add(panel_7_14_1_2_1_2_2);

		final JPanel panel_8_4_1_2_1_2_2 = new JPanel();
		panel_8_4_1_2_1_2_2.setBackground(PanelColor);
		panel_8_4_1_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_4_1_2_1_2_2.setBounds(0, 30, 34, 30);
		panel_7_14_1_2_1_2_2.add(panel_8_4_1_2_1_2_2);

		final JLabel nLabel_4_1_2_1_2_2 = new JLabel();
		nLabel_4_1_2_1_2_2.setText("New JLabel");
		panel_8_4_1_2_1_2_2.add(nLabel_4_1_2_1_2_2);

		final JPanel panel_8_1_2_1_2_1_2_2 = new JPanel();
		panel_8_1_2_1_2_1_2_2.setBackground(PanelColor);
		panel_8_1_2_1_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2_1_2_1_2_2.setBounds(34, 0, 34, 30);
		panel_7_14_1_2_1_2_2.add(panel_8_1_2_1_2_1_2_2);

		cbIntramuscularInjectionsD = new JCheckBox();
		cbIntramuscularInjectionsD.setBackground(PanelColor);
		cbIntramuscularInjectionsD.setText("");
		panel_8_1_2_1_2_1_2_2.add(cbIntramuscularInjectionsD);

		final JPanel panel_8_2_2_1_2_1_2_2 = new JPanel();
		panel_8_2_2_1_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_2_1_2_1_2_2.setBackground(PanelColor);
		panel_8_2_2_1_2_1_2_2.setBounds(68, 0, 34, 30);
		panel_7_14_1_2_1_2_2.add(panel_8_2_2_1_2_1_2_2);

		cbIntramuscularInjectionsE = new JCheckBox();
		cbIntramuscularInjectionsE.setText("");
		cbIntramuscularInjectionsE.setBackground(PanelColor);
		panel_8_2_2_1_2_1_2_2.add(cbIntramuscularInjectionsE);

		final JPanel panel_8_6_2_1_1_2_1_2_2 = new JPanel();
		panel_8_6_2_1_1_2_1_2_2.setBackground(PanelColor);
		panel_8_6_2_1_1_2_1_2_2
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_6_2_1_1_2_1_2_2.setBounds(0, 0, 34, 30);
		panel_7_14_1_2_1_2_2.add(panel_8_6_2_1_1_2_1_2_2);

		cbIntramuscularInjectionsN = new JCheckBox();
		cbIntramuscularInjectionsN.setBackground(PanelColor);
		cbIntramuscularInjectionsN.setText("");
		panel_8_6_2_1_1_2_1_2_2.add(cbIntramuscularInjectionsN);

		final JPanel panel_7_8_2_1_2_2 = new JPanel();
		panel_7_8_2_1_2_2.setBackground(PanelColor);
		panel_7_8_2_1_2_2.setLayout(null);
		panel_7_8_2_1_2_2.setBounds(178, 240, 102, 30);
		panel_5_1_1_2_2.add(panel_7_8_2_1_2_2);

		final JPanel panel_8_21_2_1_2_2 = new JPanel();
		panel_8_21_2_1_2_2.setBackground(PanelColor);
		panel_8_21_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_21_2_1_2_2.setBounds(0, 0, 34, 30);
		panel_7_8_2_1_2_2.add(panel_8_21_2_1_2_2);

		cbTubeFeedingN = new JCheckBox();
		cbTubeFeedingN.setBackground(PanelColor);
		cbTubeFeedingN.setText("");
		panel_8_21_2_1_2_2.add(cbTubeFeedingN);

		final JPanel panel_8_25_2_1_2_2 = new JPanel();
		panel_8_25_2_1_2_2.setBackground(PanelColor);
		panel_8_25_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_25_2_1_2_2.setBounds(34, 0, 34, 30);
		panel_7_8_2_1_2_2.add(panel_8_25_2_1_2_2);

		cbTubeFeedingD = new JCheckBox();
		cbTubeFeedingD.setBackground(PanelColor);
		cbTubeFeedingD.setText("");
		panel_8_25_2_1_2_2.add(cbTubeFeedingD);

		final JPanel panel_8_26_2_1_2_2 = new JPanel();
		panel_8_26_2_1_2_2.setBackground(PanelColor);
		panel_8_26_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_26_2_1_2_2.setBounds(68, 0, 34, 30);
		panel_7_8_2_1_2_2.add(panel_8_26_2_1_2_2);

		cbTubeFeedingE = new JCheckBox();
		cbTubeFeedingE.setBackground(PanelColor);
		cbTubeFeedingE.setText("");
		panel_8_26_2_1_2_2.add(cbTubeFeedingE);

		final JPanel panel_7_9_2_1_2_2 = new JPanel();
		panel_7_9_2_1_2_2.setBackground(PanelColor);
		panel_7_9_2_1_2_2.setLayout(null);
		panel_7_9_2_1_2_2.setBounds(178, 270, 102, 30);
		panel_5_1_1_2_2.add(panel_7_9_2_1_2_2);

		final JPanel panel_8_27_2_1_2_2 = new JPanel();
		panel_8_27_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_27_2_1_2_2.setBackground(PanelColor);
		panel_8_27_2_1_2_2.setBounds(0, 0, 34, 30);
		panel_7_9_2_1_2_2.add(panel_8_27_2_1_2_2);

		cbPainManagementN = new JCheckBox();
		cbPainManagementN.setText("");
		cbPainManagementN.setBackground(PanelColor);
		panel_8_27_2_1_2_2.add(cbPainManagementN);

		final JPanel panel_8_28_2_1_2_2 = new JPanel();
		panel_8_28_2_1_2_2.setBackground(PanelColor);
		panel_8_28_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_28_2_1_2_2.setBounds(34, 0, 34, 30);
		panel_7_9_2_1_2_2.add(panel_8_28_2_1_2_2);

		cbPainManagementD = new JCheckBox();
		cbPainManagementD.setBackground(PanelColor);
		cbPainManagementD.setText("");
		panel_8_28_2_1_2_2.add(cbPainManagementD);

		final JPanel panel_8_29_2_1_2_2 = new JPanel();
		panel_8_29_2_1_2_2.setBackground(PanelColor);
		panel_8_29_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_29_2_1_2_2.setBounds(68, 0, 34, 30);
		panel_7_9_2_1_2_2.add(panel_8_29_2_1_2_2);

		cbPainManagementE = new JCheckBox();
		cbPainManagementE.setBackground(PanelColor);
		cbPainManagementE.setText("");
		panel_8_29_2_1_2_2.add(cbPainManagementE);

		final JPanel panel_7_10_2_1_1_2 = new JPanel();
		panel_7_10_2_1_1_2.setBackground(PanelColor);
		panel_7_10_2_1_1_2.setLayout(null);
		panel_7_10_2_1_1_2.setBounds(178, 300, 102, 30);
		panel_5_1_1_2_2.add(panel_7_10_2_1_1_2);

		final JPanel panel_8_27_2_1_2_2_1 = new JPanel();
		panel_8_27_2_1_2_2_1.setBackground(PanelColor);
		panel_8_27_2_1_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_27_2_1_2_2_1.setBounds(0, 0, 34, 30);
		panel_7_10_2_1_1_2.add(panel_8_27_2_1_2_2_1);

		final JPanel panel_8_27_2_1_2_2_1_1 = new JPanel();
		panel_8_27_2_1_2_2_1_1.setBackground(PanelColor);
		panel_8_27_2_1_2_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_27_2_1_2_2_1_1.setBounds(34, 0, 34, 30);
		panel_7_10_2_1_1_2.add(panel_8_27_2_1_2_2_1_1);

		final JPanel panel_8_27_2_1_2_2_1_2 = new JPanel();
		panel_8_27_2_1_2_2_1_2.setBackground(PanelColor);
		panel_8_27_2_1_2_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_27_2_1_2_2_1_2.setBounds(68, 0, 34, 30);
		panel_7_10_2_1_1_2.add(panel_8_27_2_1_2_2_1_2);

		final JPanel panel_6_1_2_1_2_2 = new JPanel();
		panel_6_1_2_1_2_2.setBackground(PanelColor);
		panel_6_1_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_2_1_2_2.setLayout(null);
		panel_6_1_2_1_2_2.setBounds(0, 29, 280, 1);
		panel_5_1_1_2_2.add(panel_6_1_2_1_2_2);

		final JPanel panel_6_15_1_2_1_2 = new JPanel();
		panel_6_15_1_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_15_1_2_1_2.setBackground(PanelColor);
		panel_6_15_1_2_1_2.setLayout(null);
		panel_6_15_1_2_1_2.setBounds(0, 0, 178, 30);
		panel_5_1_1_2_2.add(panel_6_15_1_2_1_2);

		final JLabel alertLabel_11_1_1_2_1_2 = new JLabel();
		alertLabel_11_1_1_2_1_2.setText("Wound Care Dressing");
		alertLabel_11_1_1_2_1_2.setBounds(10, 10, 158, 16);
		panel_6_15_1_2_1_2.add(alertLabel_11_1_1_2_1_2);

		final JPanel panel_7_14_1_2_1_2 = new JPanel();
		panel_7_14_1_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_14_1_2_1_2.setBackground(PanelColor);
		panel_7_14_1_2_1_2.setLayout(null);
		panel_7_14_1_2_1_2.setBounds(178, 0, 102, 30);
		panel_5_1_1_2_2.add(panel_7_14_1_2_1_2);

		final JPanel panel_8_4_1_2_1_2 = new JPanel();
		panel_8_4_1_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_4_1_2_1_2.setBackground(PanelColor);
		panel_8_4_1_2_1_2.setBounds(0, 30, 34, 30);
		panel_7_14_1_2_1_2.add(panel_8_4_1_2_1_2);

		final JLabel nLabel_4_1_2_1_2 = new JLabel();
		nLabel_4_1_2_1_2.setText("Pressure Ulser Care");
		panel_8_4_1_2_1_2.add(nLabel_4_1_2_1_2);

		final JPanel panel_8_1_2_1_2_1_2 = new JPanel();
		panel_8_1_2_1_2_1_2.setBackground(PanelColor);
		panel_8_1_2_1_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2_1_2_1_2.setBounds(34, 0, 34, 30);
		panel_7_14_1_2_1_2.add(panel_8_1_2_1_2_1_2);

		cbWoundCareDressingD = new JCheckBox();
		cbWoundCareDressingD.setBackground(PanelColor);
		cbWoundCareDressingD.setText("");
		panel_8_1_2_1_2_1_2.add(cbWoundCareDressingD);

		final JPanel panel_8_2_2_1_2_1_2 = new JPanel();
		panel_8_2_2_1_2_1_2.setBackground(PanelColor);
		panel_8_2_2_1_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_2_1_2_1_2.setBounds(68, 0, 34, 30);
		panel_7_14_1_2_1_2.add(panel_8_2_2_1_2_1_2);

		cbWoundCareDressingE = new JCheckBox();
		cbWoundCareDressingE.setBackground(PanelColor);
		cbWoundCareDressingE.setText("");
		panel_8_2_2_1_2_1_2.add(cbWoundCareDressingE);

		final JPanel panel_8_6_2_1_1_2_1_2 = new JPanel();
		panel_8_6_2_1_1_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_6_2_1_1_2_1_2.setBackground(PanelColor);
		panel_8_6_2_1_1_2_1_2.setBounds(0, 0, 34, 30);
		panel_7_14_1_2_1_2.add(panel_8_6_2_1_1_2_1_2);

		cbWoundCareDressingN = new JCheckBox();
		cbWoundCareDressingN.setText("");
		cbWoundCareDressingN.setBackground(PanelColor);
		panel_8_6_2_1_1_2_1_2.add(cbWoundCareDressingN);

		final JPanel panel_7_14_1_2_1_2_1 = new JPanel();
		panel_7_14_1_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_14_1_2_1_2_1.setBackground(PanelColor);
		panel_7_14_1_2_1_2_1.setLayout(null);
		panel_7_14_1_2_1_2_1.setBounds(178, 60, 102, 30);
		panel_5_1_1_2_2.add(panel_7_14_1_2_1_2_1);

		final JPanel panel_8_4_1_2_1_2_1 = new JPanel();
		panel_8_4_1_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_4_1_2_1_2_1.setBackground(PanelColor);
		panel_8_4_1_2_1_2_1.setBounds(0, 30, 34, 30);
		panel_7_14_1_2_1_2_1.add(panel_8_4_1_2_1_2_1);

		final JLabel nLabel_4_1_2_1_2_1 = new JLabel();
		nLabel_4_1_2_1_2_1.setText("Statis Ulser");
		panel_8_4_1_2_1_2_1.add(nLabel_4_1_2_1_2_1);

		final JPanel panel_8_1_2_1_2_1_2_1 = new JPanel();
		panel_8_1_2_1_2_1_2_1.setBackground(PanelColor);
		panel_8_1_2_1_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_2_1_2_1_2_1.setBounds(34, 0, 34, 30);
		panel_7_14_1_2_1_2_1.add(panel_8_1_2_1_2_1_2_1);

		cbStatisUlcersD = new JCheckBox();
		cbStatisUlcersD.setText("");
		cbStatisUlcersD.setBackground(PanelColor);
		panel_8_1_2_1_2_1_2_1.add(cbStatisUlcersD);

		final JPanel panel_8_2_2_1_2_1_2_1 = new JPanel();
		panel_8_2_2_1_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2_2_1_2_1_2_1.setBackground(PanelColor);
		panel_8_2_2_1_2_1_2_1.setBounds(68, 0, 34, 30);
		panel_7_14_1_2_1_2_1.add(panel_8_2_2_1_2_1_2_1);

		cbStatisUlcersE = new JCheckBox();
		cbStatisUlcersE.setText("");
		cbStatisUlcersE.setBackground(PanelColor);
		panel_8_2_2_1_2_1_2_1.add(cbStatisUlcersE);

		final JPanel panel_8_6_2_1_1_2_1_2_1 = new JPanel();
		panel_8_6_2_1_1_2_1_2_1.setBackground(PanelColor);
		panel_8_6_2_1_1_2_1_2_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_6_2_1_1_2_1_2_1.setBounds(0, 0, 34, 30);
		panel_7_14_1_2_1_2_1.add(panel_8_6_2_1_1_2_1_2_1);

		cbStatisUlcersN = new JCheckBox();
		cbStatisUlcersN.setText("");
		cbStatisUlcersN.setBackground(PanelColor);
		panel_8_6_2_1_1_2_1_2_1.add(cbStatisUlcersN);

		final JPanel panel_7_10_2_1_1_2_1 = new JPanel();
		panel_7_10_2_1_1_2_1.setLayout(null);
		panel_7_10_2_1_1_2_1.setBounds(178, 330, 102, 30);
		panel_5_1_1_2_2.add(panel_7_10_2_1_1_2_1);

		final JPanel panel_8_27_2_1_2_2_1_3 = new JPanel();
		panel_8_27_2_1_2_2_1_3.setBackground(PanelColor);
		panel_8_27_2_1_2_2_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_27_2_1_2_2_1_3.setBounds(0, 0, 34, 30);
		panel_7_10_2_1_1_2_1.add(panel_8_27_2_1_2_2_1_3);

		final JPanel panel_8_27_2_1_2_2_1_1_1 = new JPanel();
		panel_8_27_2_1_2_2_1_1_1.setBackground(PanelColor);
		panel_8_27_2_1_2_2_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_27_2_1_2_2_1_1_1.setBounds(34, 0, 34, 30);
		panel_7_10_2_1_1_2_1.add(panel_8_27_2_1_2_2_1_1_1);

		final JPanel panel_8_27_2_1_2_2_1_2_1 = new JPanel();
		panel_8_27_2_1_2_2_1_2_1.setBackground(PanelColor);
		panel_8_27_2_1_2_2_1_2_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_27_2_1_2_2_1_2_1.setBounds(68, 0, 34, 30);
		panel_7_10_2_1_1_2_1.add(panel_8_27_2_1_2_2_1_2_1);

		// ------copied

		final JPanel PanelSkinMain = new JPanel();
		PanelSkinMain.setBorder(new LineBorder(Color.black, 1, false));
		PanelSkinMain.setLayout(null);
		// PanelSkinMain.setBounds(32, 10, 281, 300);
		PanelSkinMain.setBounds(841, 637, 281, 300);
		panel_3.add(PanelSkinMain);

		final JPanel PanelJaundiced = new JPanel();
		PanelJaundiced.setBackground(Color.WHITE);
		PanelJaundiced.setBorder(new LineBorder(Color.black, 1, false));
		PanelJaundiced.setLayout(null);
		PanelJaundiced.setBounds(0, 30, 178, 30);
		PanelSkinMain.add(PanelJaundiced);

		final JLabel LabelJaundiced = new JLabel();
		LabelJaundiced.setText("Jaundiced");
		LabelJaundiced.setBounds(10, 10, 158, 16);
		PanelJaundiced.add(LabelJaundiced);

		final JPanel PanelCynosis = new JPanel();
		PanelCynosis.setBackground(Color.WHITE);
		PanelCynosis.setBorder(new LineBorder(Color.black, 1, false));
		PanelCynosis.setLayout(null);
		PanelCynosis.setBounds(0, 60, 178, 30);
		PanelSkinMain.add(PanelCynosis);

		final JLabel LabelCyanosis = new JLabel();
		LabelCyanosis.setText("Cyanosis");
		LabelCyanosis.setBounds(10, 8, 158, 16);
		PanelCynosis.add(LabelCyanosis);

		final JPanel PanelPallor = new JPanel();
		PanelPallor.setBackground(Color.WHITE);
		PanelPallor.setBorder(new LineBorder(Color.black, 1, false));
		PanelPallor.setLayout(null);
		PanelPallor.setBounds(0, 90, 178, 30);
		PanelSkinMain.add(PanelPallor);

		final JLabel labelPallor = new JLabel();
		labelPallor.setText("Pallor");
		labelPallor.setBounds(10, 8, 130, 16);
		PanelPallor.add(labelPallor);

		final JPanel PanelClammy = new JPanel();
		PanelClammy.setBackground(Color.WHITE);
		PanelClammy.setBorder(new LineBorder(Color.black, 1, false));
		PanelClammy.setLayout(null);
		PanelClammy.setBounds(0, 120, 178, 30);
		PanelSkinMain.add(PanelClammy);

		final JLabel LabelClammy = new JLabel();
		LabelClammy.setText("Clammy");
		LabelClammy.setBounds(10, 8, 140, 16);
		PanelClammy.add(LabelClammy);

		final JPanel PanelChills = new JPanel();
		PanelChills.setBackground(Color.WHITE);
		PanelChills.setBorder(new LineBorder(Color.black, 1, false));
		PanelChills.setLayout(null);
		PanelChills.setBounds(0, 150, 178, 30);
		PanelSkinMain.add(PanelChills);

		final JLabel LabelChills = new JLabel();
		LabelChills.setText("Chills");
		LabelChills.setBounds(10, 10, 140, 16);
		PanelChills.add(LabelChills);

		final JPanel PanelFlushing = new JPanel();
		PanelFlushing.setBackground(Color.WHITE);
		PanelFlushing.setBorder(new LineBorder(Color.black, 1, false));
		PanelFlushing.setLayout(null);
		PanelFlushing.setBounds(0, 180, 178, 30);
		PanelSkinMain.add(PanelFlushing);

		final JLabel labelFlush = new JLabel();
		labelFlush.setText("Flushing Of Skin");
		labelFlush.setBounds(10, 8, 102, 16);
		PanelFlushing.add(labelFlush);

		final JPanel PanelRash = new JPanel();
		PanelRash.setBackground(Color.WHITE);
		PanelRash.setBorder(new LineBorder(Color.black, 1, false));
		PanelRash.setLayout(null);
		PanelRash.setBounds(0, 210, 178, 30);
		PanelSkinMain.add(PanelRash);

		final JLabel labelRash = new JLabel();
		labelRash.setText("Rash / Itching");
		labelRash.setBounds(10, 8, 127, 16);
		PanelRash.add(labelRash);

		final JPanel PanelAbnormalTugor = new JPanel();
		PanelAbnormalTugor.setBackground(Color.WHITE);
		PanelAbnormalTugor.setBorder(new LineBorder(Color.black, 1, false));
		PanelAbnormalTugor.setLayout(null);
		PanelAbnormalTugor.setBounds(0, 240, 178, 30);
		PanelSkinMain.add(PanelAbnormalTugor);

		final JLabel LabelAbnormalTurgor = new JLabel();
		LabelAbnormalTurgor.setText("Abnormal Turgor / Elasticity");
		LabelAbnormalTurgor.setBounds(10, 8, 138, 16);
		PanelAbnormalTugor.add(LabelAbnormalTurgor);

		final JPanel panelSkinWNL = new JPanel();
		panelSkinWNL.setBackground(Color.WHITE);
		panelSkinWNL.setBorder(new LineBorder(Color.black, 1, false));
		panelSkinWNL.setLayout(null);
		panelSkinWNL.setBounds(0, 270, 178, 30);
		PanelSkinMain.add(panelSkinWNL);

		final JLabel LabelskinWNL = new JLabel();
		LabelskinWNL.setText("WNL");
		LabelskinWNL.setBounds(10, 8, 158, 16);
		panelSkinWNL.add(LabelskinWNL);

		final JPanel PanelJaundicedCB = new JPanel();
		PanelJaundicedCB.setBorder(new LineBorder(Color.black, 1, false));
		PanelJaundicedCB.setLayout(null);
		PanelJaundicedCB.setBounds(178, 30, 102, 30);
		PanelSkinMain.add(PanelJaundicedCB);

		final JPanel PanelJaundicedD = new JPanel();
		PanelJaundicedD.setBackground(Color.WHITE);
		PanelJaundicedD.setBorder(new LineBorder(Color.black, 1, false));
		PanelJaundicedD.setBounds(34, 0, 34, 30);
		PanelJaundicedCB.add(PanelJaundicedD);

		cbJaundicedD = new JCheckBox();
		cbJaundicedD.setBackground(Color.WHITE);
		cbJaundicedD.setText("");
		PanelJaundicedD.add(cbJaundicedD);

		final JPanel PanelJaundicedE = new JPanel();
		PanelJaundicedE.setBackground(Color.WHITE);
		PanelJaundicedE.setBorder(new LineBorder(Color.black, 1, false));
		PanelJaundicedE.setBounds(68, 0, 34, 30);
		PanelJaundicedCB.add(PanelJaundicedE);

		cbJaundicedE = new JCheckBox();
		cbJaundicedE.setBackground(Color.WHITE);
		cbJaundicedE.setText("");
		PanelJaundicedE.add(cbJaundicedE);

		final JPanel PanelJaundicedN = new JPanel();
		PanelJaundicedN.setBackground(Color.WHITE);
		PanelJaundicedN.setBorder(new LineBorder(Color.black, 1, false));
		PanelJaundicedN.setBounds(0, 0, 34, 30);
		PanelJaundicedCB.add(PanelJaundicedN);

		cbJaundicedN = new JCheckBox();
		cbJaundicedN.setBackground(Color.WHITE);
		cbJaundicedN.setText("");
		PanelJaundicedN.add(cbJaundicedN);

		final JPanel PanelPallorCB = new JPanel();
		PanelPallorCB.setLayout(null);
		PanelPallorCB.setBounds(178, 90, 102, 30);
		PanelSkinMain.add(PanelPallorCB);

		final JPanel PanelPallorN = new JPanel();
		PanelPallorN.setBackground(Color.WHITE);
		PanelPallorN.setBorder(new LineBorder(Color.black, 1, false));
		PanelPallorN.setBounds(0, 0, 34, 30);
		PanelPallorCB.add(PanelPallorN);

		cbPallorN = new JCheckBox();
		cbPallorN.setBackground(Color.WHITE);
		cbPallorN.setText("");
		PanelPallorN.add(cbPallorN);

		final JPanel PanelPallorD = new JPanel();
		PanelPallorD.setBackground(Color.WHITE);
		PanelPallorD.setBorder(new LineBorder(Color.black, 1, false));
		PanelPallorD.setBounds(34, 0, 34, 30);
		PanelPallorCB.add(PanelPallorD);

		cbPallorD = new JCheckBox();
		cbPallorD.setBackground(Color.WHITE);
		cbPallorD.setText("");
		PanelPallorD.add(cbPallorD);

		final JPanel PanelPallorE = new JPanel();
		PanelPallorE.setBackground(Color.WHITE);
		PanelPallorE.setBorder(new LineBorder(Color.black, 1, false));
		PanelPallorE.setBounds(68, 0, 34, 30);
		PanelPallorCB.add(PanelPallorE);

		cbPallorE = new JCheckBox();
		cbPallorE.setBackground(Color.WHITE);
		cbPallorE.setText("");
		PanelPallorE.add(cbPallorE);

		final JPanel PanelClammyCB = new JPanel();
		PanelClammyCB.setLayout(null);
		PanelClammyCB.setBounds(178, 120, 102, 30);
		PanelSkinMain.add(PanelClammyCB);

		final JPanel PanelClammyN = new JPanel();
		PanelClammyN.setBackground(Color.WHITE);
		PanelClammyN.setBorder(new LineBorder(Color.black, 1, false));
		PanelClammyN.setBounds(0, 0, 34, 30);
		PanelClammyCB.add(PanelClammyN);

		cbClammyN = new JCheckBox();
		cbClammyN.setBackground(Color.WHITE);
		cbClammyN.setText("");
		PanelClammyN.add(cbClammyN);

		final JPanel PanelClammyD = new JPanel();
		PanelClammyD.setBackground(Color.WHITE);
		PanelClammyD.setBorder(new LineBorder(Color.black, 1, false));
		PanelClammyD.setBounds(34, 0, 34, 30);
		PanelClammyCB.add(PanelClammyD);

		cbClammyD = new JCheckBox();
		cbClammyD.setBackground(Color.WHITE);
		cbClammyD.setText("");
		PanelClammyD.add(cbClammyD);

		final JPanel PanelClammyE = new JPanel();
		PanelClammyE.setBackground(Color.WHITE);
		PanelClammyE.setBorder(new LineBorder(Color.black, 1, false));
		PanelClammyE.setBounds(68, 0, 34, 30);
		PanelClammyCB.add(PanelClammyE);

		cbClammyE = new JCheckBox();
		cbClammyE.setBackground(Color.WHITE);
		cbClammyE.setText("");
		PanelClammyE.add(cbClammyE);

		final JPanel PanelChillsCB = new JPanel();
		PanelChillsCB.setLayout(null);
		PanelChillsCB.setBounds(178, 150, 102, 30);
		PanelSkinMain.add(PanelChillsCB);

		final JPanel PanelChillsN = new JPanel();
		PanelChillsN.setBackground(Color.WHITE);
		PanelChillsN.setBorder(new LineBorder(Color.black, 1, false));
		PanelChillsN.setBounds(0, 0, 34, 30);
		PanelChillsCB.add(PanelChillsN);

		cbChillsN = new JCheckBox();
		cbChillsN.setBackground(Color.WHITE);
		cbChillsN.setText("");
		PanelChillsN.add(cbChillsN);

		final JPanel PanelChillsD = new JPanel();
		PanelChillsD.setBackground(Color.WHITE);
		PanelChillsD.setBorder(new LineBorder(Color.black, 1, false));
		PanelChillsD.setBounds(34, 0, 34, 30);
		PanelChillsCB.add(PanelChillsD);

		cbChillsD = new JCheckBox();
		cbChillsD.setBackground(Color.WHITE);
		cbChillsD.setText("");
		PanelChillsD.add(cbChillsD);

		final JPanel PanelChillsE = new JPanel();
		PanelChillsE.setBackground(Color.WHITE);
		PanelChillsE.setBorder(new LineBorder(Color.black, 1, false));
		PanelChillsE.setBounds(68, 0, 34, 30);
		PanelChillsCB.add(PanelChillsE);

		cbChillsE = new JCheckBox();
		cbChillsE.setBackground(Color.WHITE);
		cbChillsE.setText("");
		PanelChillsE.add(cbChillsE);

		final JPanel PanelFlushingCB = new JPanel();
		PanelFlushingCB.setLayout(null);
		PanelFlushingCB.setBounds(178, 180, 102, 30);
		PanelSkinMain.add(PanelFlushingCB);

		final JPanel PanelFlushingN = new JPanel();
		PanelFlushingN.setBackground(Color.WHITE);
		PanelFlushingN.setBorder(new LineBorder(Color.black, 1, false));
		PanelFlushingN.setBounds(0, 0, 34, 30);
		PanelFlushingCB.add(PanelFlushingN);

		cbFlushingSkinN = new JCheckBox();
		cbFlushingSkinN.setBackground(Color.WHITE);
		cbFlushingSkinN.setText("");
		PanelFlushingN.add(cbFlushingSkinN);

		final JPanel PanelFlushingD = new JPanel();
		PanelFlushingD.setBackground(Color.WHITE);
		PanelFlushingD.setBorder(new LineBorder(Color.black, 1, false));
		PanelFlushingD.setBounds(34, 0, 34, 30);
		PanelFlushingCB.add(PanelFlushingD);

		cbFlushingSkinD = new JCheckBox();
		cbFlushingSkinD.setBackground(Color.WHITE);
		cbFlushingSkinD.setText("");
		PanelFlushingD.add(cbFlushingSkinD);

		final JPanel PanelFlushingE = new JPanel();
		PanelFlushingE.setBackground(Color.WHITE);
		PanelFlushingE.setBorder(new LineBorder(Color.black, 1, false));
		PanelFlushingE.setBounds(68, 0, 34, 30);
		PanelFlushingCB.add(PanelFlushingE);

		cbFlushingSkinE = new JCheckBox();
		cbFlushingSkinE.setBackground(Color.WHITE);
		cbFlushingSkinE.setText("");
		PanelFlushingE.add(cbFlushingSkinE);

		final JPanel PanelRashCB = new JPanel();
		PanelRashCB.setBorder(new LineBorder(Color.black, 1, false));
		PanelRashCB.setLayout(null);
		PanelRashCB.setBounds(178, 210, 102, 30);
		PanelSkinMain.add(PanelRashCB);

		final JPanel PanelRashD = new JPanel();
		PanelRashD.setBackground(Color.WHITE);
		PanelRashD.setBorder(new LineBorder(Color.black, 1, false));
		PanelRashD.setBounds(34, 0, 34, 30);
		PanelRashCB.add(PanelRashD);

		cbRashItchingD = new JCheckBox();
		cbRashItchingD.setBackground(Color.WHITE);
		cbRashItchingD.setText("");
		PanelRashD.add(cbRashItchingD);

		final JPanel PanelRashE = new JPanel();
		PanelRashE.setBackground(Color.WHITE);
		PanelRashE.setBorder(new LineBorder(Color.black, 1, false));
		PanelRashE.setBounds(68, 0, 34, 30);
		PanelRashCB.add(PanelRashE);

		cbRashItchingE = new JCheckBox();
		cbRashItchingE.setBackground(Color.WHITE);
		cbRashItchingE.setText("");
		PanelRashE.add(cbRashItchingE);

		final JPanel PanelRashN = new JPanel();
		PanelRashN.setBackground(Color.WHITE);
		PanelRashN.setBorder(new LineBorder(Color.black, 1, false));
		PanelRashN.setBounds(0, 0, 34, 30);
		PanelRashCB.add(PanelRashN);

		cbRashItchingN = new JCheckBox();
		cbRashItchingN.setBackground(Color.WHITE);
		cbRashItchingN.setText("");
		PanelRashN.add(cbRashItchingN);

		final JPanel PanelAbnormalTurgorCB = new JPanel();
		PanelAbnormalTurgorCB.setLayout(null);
		PanelAbnormalTurgorCB.setBounds(178, 240, 102, 30);
		PanelSkinMain.add(PanelAbnormalTurgorCB);

		final JPanel PanelAbnormalN = new JPanel();
		PanelAbnormalN.setBackground(Color.WHITE);
		PanelAbnormalN.setBorder(new LineBorder(Color.black, 1, false));
		PanelAbnormalN.setBounds(0, 0, 34, 30);
		PanelAbnormalTurgorCB.add(PanelAbnormalN);

		cbAbnormalTurgorN = new JCheckBox();
		cbAbnormalTurgorN.setBackground(Color.WHITE);
		cbAbnormalTurgorN.setText("");
		PanelAbnormalN.add(cbAbnormalTurgorN);

		final JPanel PanelAbnormalD = new JPanel();
		PanelAbnormalD.setBackground(Color.WHITE);
		PanelAbnormalD.setBorder(new LineBorder(Color.black, 1, false));
		PanelAbnormalD.setBounds(34, 0, 34, 30);
		PanelAbnormalTurgorCB.add(PanelAbnormalD);

		cbAbnormalTurgorD = new JCheckBox();
		cbAbnormalTurgorD.setBackground(Color.WHITE);
		cbAbnormalTurgorD.setText("");
		PanelAbnormalD.add(cbAbnormalTurgorD);

		final JPanel PanelAbnormalE = new JPanel();
		PanelAbnormalE.setBackground(Color.WHITE);
		PanelAbnormalE.setBorder(new LineBorder(Color.black, 1, false));
		PanelAbnormalE.setBounds(68, 0, 34, 30);
		PanelAbnormalTurgorCB.add(PanelAbnormalE);

		cbAbnormalTurgorE = new JCheckBox();
		cbAbnormalTurgorE.setBackground(Color.WHITE);
		cbAbnormalTurgorE.setText("");
		PanelAbnormalE.add(cbAbnormalTurgorE);

		final JPanel panelSkinWNLCB = new JPanel();
		panelSkinWNLCB.setLayout(null);
		panelSkinWNLCB.setBounds(178, 270, 102, 30);
		PanelSkinMain.add(panelSkinWNLCB);

		final JPanel panelSkinWNLN = new JPanel();
		panelSkinWNLN.setBackground(Color.WHITE);
		panelSkinWNLN.setBorder(new LineBorder(Color.black, 1, false));
		panelSkinWNLN.setBounds(0, 0, 34, 30);
		panelSkinWNLCB.add(panelSkinWNLN);

		cbSkinWnlN = new JCheckBox();
		cbSkinWnlN.setBackground(Color.WHITE);
		cbSkinWnlN.setText("");
		panelSkinWNLN.add(cbSkinWnlN);

		final JPanel panelSkinWNLD = new JPanel();
		panelSkinWNLD.setBackground(Color.WHITE);
		panelSkinWNLD.setBorder(new LineBorder(Color.black, 1, false));
		panelSkinWNLD.setBounds(34, 0, 34, 30);
		panelSkinWNLCB.add(panelSkinWNLD);

		cbSkinWnlD = new JCheckBox();
		cbSkinWnlD.setBackground(Color.WHITE);
		cbSkinWnlD.setText("");
		panelSkinWNLD.add(cbSkinWnlD);

		final JPanel panelSkinWNLE = new JPanel();
		panelSkinWNLE.setBackground(Color.WHITE);
		panelSkinWNLE.setBorder(new LineBorder(Color.black, 1, false));
		panelSkinWNLE.setBounds(68, 0, 34, 30);
		panelSkinWNLCB.add(panelSkinWNLE);

		cbSkinWnlE = new JCheckBox();
		cbSkinWnlE.setBackground(Color.WHITE);
		cbSkinWnlE.setText("");
		panelSkinWNLE.add(cbSkinWnlE);

		final JPanel panelSkin = new JPanel();
		panelSkin.setBackground(Color.BLACK);
		panelSkin.setBorder(new LineBorder(Color.black, 1, false));
		panelSkin.setLayout(null);
		panelSkin.setBounds(0, 0, 280, 30);
		PanelSkinMain.add(panelSkin);

		final JLabel LabelSkin = new JLabel();
		LabelSkin.setForeground(Color.WHITE);
		LabelSkin.setText("Skin");
		LabelSkin.setBounds(114, 10, 82, 16);
		panelSkin.add(LabelSkin);

		final JPanel PanelCynosisCB = new JPanel();
		PanelCynosisCB.setBorder(new LineBorder(Color.black, 1, false));
		PanelCynosisCB.setLayout(null);
		PanelCynosisCB.setBounds(178, 60, 102, 30);
		PanelSkinMain.add(PanelCynosisCB);

		final JPanel PanelCynosisD = new JPanel();
		PanelCynosisD.setBackground(Color.WHITE);
		PanelCynosisD.setBorder(new LineBorder(Color.black, 1, false));
		PanelCynosisD.setBounds(34, 0, 34, 30);
		PanelCynosisCB.add(PanelCynosisD);

		cbCyanosisD = new JCheckBox();
		cbCyanosisD.setBackground(Color.WHITE);
		cbCyanosisD.setText("");
		PanelCynosisD.add(cbCyanosisD);

		final JPanel PanelCynosisE = new JPanel();
		PanelCynosisE.setBackground(Color.WHITE);
		PanelCynosisE.setBorder(new LineBorder(Color.black, 1, false));
		PanelCynosisE.setBounds(68, 0, 34, 30);
		PanelCynosisCB.add(PanelCynosisE);

		cbCyanosisE = new JCheckBox();
		cbCyanosisE.setBackground(Color.WHITE);
		cbCyanosisE.setText("");
		PanelCynosisE.add(cbCyanosisE);

		final JPanel PanelCynosisN = new JPanel();
		PanelCynosisN.setBackground(Color.WHITE);
		PanelCynosisN.setBorder(new LineBorder(Color.black, 1, false));
		PanelCynosisN.setBounds(0, 0, 34, 30);
		PanelCynosisCB.add(PanelCynosisN);

		cbCyanosisN = new JCheckBox();
		cbCyanosisN.setBackground(Color.WHITE);
		cbCyanosisN.setText("");
		PanelCynosisN.add(cbCyanosisN);

		// ---------copied

		therapy();

		// ---------copied

		GUScreen();

		// ---------copied

		signature();

		// ---------copied
		comments();

		// ---------copied

		recordPanel();
	}

	public void recordPanel() {
		final JPanel PanelRecordNoMain = new JPanel();
		PanelRecordNoMain.setLayout(null);
		// PanelRecordNoMain.setBounds(10, 27, 1122, 50);
		PanelRecordNoMain.setBounds(0, 1510, 1122, 50);
		panel_3.add(PanelRecordNoMain);

		final JPanel PanelNames = new JPanel();
		PanelNames.setBackground(Color.WHITE);
		PanelNames.setBorder(new LineBorder(Color.black, 1, false));
		PanelNames.setLayout(null);
		PanelNames.setBounds(0, 0, 528, 50);
		PanelRecordNoMain.add(PanelNames);

		final JLabel namesLabel = new JLabel();
		namesLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		namesLabel.setText("Name");
		namesLabel.setBounds(10, 5, 48, 14);
		PanelNames.add(namesLabel);

		final JLabel lastNameLabel = new JLabel();
		lastNameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lastNameLabel.setText("Last Name");
		lastNameLabel.setBounds(97, 5, 71, 14);
		PanelNames.add(lastNameLabel);

		final JLabel firstNameLabel = new JLabel();
		firstNameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		firstNameLabel.setText("First Name");
		firstNameLabel.setBounds(249, 6, 71, 14);
		PanelNames.add(firstNameLabel);

		final JLabel middleNameLabel = new JLabel();
		middleNameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		middleNameLabel.setText("Middle Name");
		middleNameLabel.setBounds(400, 5, 86, 14);
		PanelNames.add(middleNameLabel);

		txtLastName = new JTextField();
		txtLastName.setBackground(Color.WHITE);
		txtLastName.setEditable(false);
		txtLastName.setBounds(69, 20, 117, 21);
		PanelNames.add(txtLastName);

		txtFirstName = new JTextField();
		txtFirstName.setBackground(Color.WHITE);
		txtFirstName.setEditable(false);
		txtFirstName.setBounds(225, 20, 117, 21);
		PanelNames.add(txtFirstName);

		txtMiddleName = new JTextField();
		txtMiddleName.setBackground(Color.WHITE);
		txtMiddleName.setEditable(false);
		txtMiddleName.setBounds(389, 20, 117, 21);
		PanelNames.add(txtMiddleName);

		final JPanel PanelPhysician = new JPanel();
		PanelPhysician.setBackground(Color.WHITE);
		PanelPhysician.setBorder(new LineBorder(Color.black, 1, false));
		PanelPhysician.setLayout(null);
		PanelPhysician.setBounds(528, 0, 228, 50);
		PanelRecordNoMain.add(PanelPhysician);

		final JLabel attendingPhysicianLabel = new JLabel();
		attendingPhysicianLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		attendingPhysicianLabel.setText("Attending Physician");
		attendingPhysicianLabel.setBounds(43, 5, 157, 14);
		PanelPhysician.add(attendingPhysicianLabel);

		txtAttendingPhysician = new JTextField();
		txtAttendingPhysician.setEditable(true);
		txtAttendingPhysician.setBounds(25, 20, 193, 21);
		PanelPhysician.add(txtAttendingPhysician);

		final JPanel PanelRecord = new JPanel();
		PanelRecord.setBackground(Color.WHITE);
		PanelRecord.setBorder(new LineBorder(Color.black, 1, false));
		PanelRecord.setLayout(null);
		PanelRecord.setBounds(756, 0, 194, 50);
		PanelRecordNoMain.add(PanelRecord);

		final JLabel recordNoLabel = new JLabel();
		recordNoLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		recordNoLabel.setText("Record No");
		recordNoLabel.setBounds(50, 5, 83, 14);
		PanelRecord.add(recordNoLabel);

		final JTextField textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);
		textField.setBounds(10, 20, 174, 21);
		PanelRecord.add(textField);

		final JPanel PanelRoomBed = new JPanel();
		PanelRoomBed.setBackground(Color.WHITE);
		PanelRoomBed.setBorder(new LineBorder(Color.black, 1, false));
		PanelRoomBed.setLayout(null);
		PanelRoomBed.setBounds(950, 0, 172, 50);
		PanelRecordNoMain.add(PanelRoomBed);

		final JLabel roomBedLabel = new JLabel();
		roomBedLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		roomBedLabel.setText("Room / Bed");
		roomBedLabel.setBounds(43, 5, 85, 14);
		PanelRoomBed.add(roomBedLabel);

		txtRoomBed = new JTextField();
		txtRoomBed.setBackground(Color.WHITE);
		txtRoomBed.setEditable(false);
		txtRoomBed.setBounds(10, 20, 152, 21);
		PanelRoomBed.add(txtRoomBed);
	}

	public void comments() {
		final JPanel CommentPanel = new JPanel();
		CommentPanel.setBorder(new LineBorder(Color.black, 1, false));
		CommentPanel.setLayout(null);
		CommentPanel.setBounds(0, 1330, 1122, 180);
		panel_3.add(CommentPanel);

		final JPanel DateTimePanel = new JPanel();
		DateTimePanel.setBackground(Color.BLACK);
		DateTimePanel.setForeground(Color.WHITE);
		DateTimePanel.setBounds(0, 0, 130, 30);
		CommentPanel.add(DateTimePanel);
		DateTimePanel.setLayout(null);

		final JLabel dateTimeLabel = new JLabel();
		dateTimeLabel.setForeground(Color.WHITE);
		dateTimeLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		dateTimeLabel.setText("Date / Time");
		dateTimeLabel.setBounds(10, 10, 110, 14);
		DateTimePanel.add(dateTimeLabel);

		final JPanel CommentsPanel = new JPanel();
		CommentsPanel.setBackground(Color.BLACK);
		CommentsPanel.setLayout(null);
		CommentsPanel.setBounds(130, 0, 760, 30);
		CommentPanel.add(CommentsPanel);

		final JLabel commentsLabel = new JLabel();
		commentsLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		commentsLabel.setForeground(Color.WHITE);
		commentsLabel.setText("COMMENTS");
		commentsLabel.setBounds(332, 10, 137, 14);
		CommentsPanel.add(commentsLabel);

		final JPanel SignatureTitlePanel = new JPanel();
		SignatureTitlePanel.setBackground(Color.BLACK);
		SignatureTitlePanel.setLayout(null);
		SignatureTitlePanel.setBounds(891, 0, 231, 30);
		CommentPanel.add(SignatureTitlePanel);

		final JLabel signaturetitleLabel = new JLabel();
		signaturetitleLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		signaturetitleLabel.setForeground(Color.WHITE);
		signaturetitleLabel.setText("Signature  /  Title");
		signaturetitleLabel.setBounds(10, 10, 211, 14);
		SignatureTitlePanel.add(signaturetitleLabel);

		final JPanel PanelDateTime1 = new JPanel();
		PanelDateTime1.setBorder(new LineBorder(Color.black, 1, false));
		PanelDateTime1.setLayout(null);
		PanelDateTime1.setBounds(0, 30, 130, 30);
		CommentPanel.add(PanelDateTime1);

		txtDateTime1 = new JTextField();
		txtDateTime1.setBorder(new LineBorder(Color.black, 1, false));
		txtDateTime1.setBounds(0, 0, 130, 30);
		PanelDateTime1.add(txtDateTime1);

		final JPanel PanelDateTime2 = new JPanel();
		PanelDateTime2.setBorder(new LineBorder(Color.black, 1, false));
		PanelDateTime2.setLayout(null);
		PanelDateTime2.setBounds(0, 60, 130, 30);
		CommentPanel.add(PanelDateTime2);

		txtDateTime2 = new JTextField();
		txtDateTime2.setBorder(new LineBorder(Color.black, 1, false));
		txtDateTime2.setBounds(0, 0, 130, 30);
		PanelDateTime2.add(txtDateTime2);

		final JPanel PanelDateTime3 = new JPanel();
		PanelDateTime3.setBorder(new LineBorder(Color.black, 1, false));
		PanelDateTime3.setLayout(null);
		PanelDateTime3.setBounds(0, 90, 130, 30);
		CommentPanel.add(PanelDateTime3);

		txtDateTime3 = new JTextField();
		txtDateTime3.setBorder(new LineBorder(Color.black, 1, false));
		txtDateTime3.setBounds(0, 0, 130, 30);
		PanelDateTime3.add(txtDateTime3);

		final JPanel PanelDateTime4 = new JPanel();
		PanelDateTime4.setBorder(new LineBorder(Color.black, 1, false));
		PanelDateTime4.setLayout(null);
		PanelDateTime4.setBounds(0, 120, 130, 30);
		CommentPanel.add(PanelDateTime4);

		txtDateTime4 = new JTextField();
		txtDateTime4.setBorder(new LineBorder(Color.black, 1, false));
		txtDateTime4.setBounds(0, 0, 130, 30);
		PanelDateTime4.add(txtDateTime4);

		final JPanel PanelDateTime5 = new JPanel();
		PanelDateTime5.setBorder(new LineBorder(Color.black, 1, false));
		PanelDateTime5.setLayout(null);
		PanelDateTime5.setBounds(0, 150, 130, 30);
		CommentPanel.add(PanelDateTime5);

		txtDateTime5 = new JTextField();
		txtDateTime5.setBorder(new LineBorder(Color.black, 1, false));
		txtDateTime5.setBounds(0, 0, 130, 30);
		PanelDateTime5.add(txtDateTime5);

		final JPanel PanelComment1 = new JPanel();
		PanelComment1.setBorder(new LineBorder(Color.black, 1, false));
		PanelComment1.setLayout(null);
		PanelComment1.setBounds(130, 30, 760, 30);
		CommentPanel.add(PanelComment1);

		txtComment1 = new JTextField();
		txtComment1.setBorder(new LineBorder(Color.black, 1, false));
		txtComment1.setBounds(0, 0, 760, 30);
		PanelComment1.add(txtComment1);

		final JPanel PanelComment2 = new JPanel();
		PanelComment2.setBorder(new LineBorder(Color.black, 1, false));
		PanelComment2.setLayout(null);
		PanelComment2.setBounds(130, 60, 760, 30);
		CommentPanel.add(PanelComment2);

		txtComment2 = new JTextField();
		txtComment2.setBorder(new LineBorder(Color.black, 1, false));
		txtComment2.setBounds(0, 0, 760, 30);
		PanelComment2.add(txtComment2);

		final JPanel PanelComment3 = new JPanel();
		PanelComment3.setBorder(new LineBorder(Color.black, 1, false));
		PanelComment3.setLayout(null);
		PanelComment3.setBounds(130, 90, 760, 30);
		CommentPanel.add(PanelComment3);

		txtComment3 = new JTextField();
		txtComment3.setBorder(new LineBorder(Color.black, 1, false));
		txtComment3.setBounds(0, 0, 760, 30);
		PanelComment3.add(txtComment3);

		final JPanel PanelComment4 = new JPanel();
		PanelComment4.setBorder(new LineBorder(Color.black, 1, false));
		PanelComment4.setLayout(null);
		PanelComment4.setBounds(130, 120, 760, 30);
		CommentPanel.add(PanelComment4);

		txtComment4 = new JTextField();
		txtComment4.setBorder(new LineBorder(Color.black, 1, false));
		txtComment4.setBounds(0, 0, 760, 30);
		PanelComment4.add(txtComment4);

		final JPanel PanelComment5 = new JPanel();
		PanelComment5.setBorder(new LineBorder(Color.black, 1, false));
		PanelComment5.setLayout(null);
		PanelComment5.setBounds(130, 150, 760, 30);
		CommentPanel.add(PanelComment5);

		txtComment5 = new JTextField();
		txtComment5.setBorder(new LineBorder(Color.black, 1, false));
		txtComment5.setBounds(0, 0, 760, 30);
		PanelComment5.add(txtComment5);

		final JPanel PanelSignatureTitle1 = new JPanel();
		PanelSignatureTitle1.setBorder(new LineBorder(Color.black, 1, false));
		PanelSignatureTitle1.setLayout(null);
		PanelSignatureTitle1.setBounds(890, 30, 231, 30);
		CommentPanel.add(PanelSignatureTitle1);

		txtSignatureTitle1 = new JTextField();
		txtSignatureTitle1.setBorder(new LineBorder(Color.black, 1, false));
		txtSignatureTitle1.setBounds(0, 0, 231, 30);
		PanelSignatureTitle1.add(txtSignatureTitle1);

		final JPanel PanelSignatureTitle2 = new JPanel();
		PanelSignatureTitle2.setBorder(new LineBorder(Color.black, 1, false));
		PanelSignatureTitle2.setLayout(null);
		PanelSignatureTitle2.setBounds(890, 60, 231, 30);
		CommentPanel.add(PanelSignatureTitle2);

		txtSignatureTitle2 = new JTextField();
		txtSignatureTitle2.setBorder(new LineBorder(Color.black, 1, false));
		txtSignatureTitle2.setBounds(0, 0, 231, 30);
		PanelSignatureTitle2.add(txtSignatureTitle2);

		final JPanel PanelSignatureTitle3 = new JPanel();
		PanelSignatureTitle3.setBorder(new LineBorder(Color.black, 1, false));
		PanelSignatureTitle3.setLayout(null);
		PanelSignatureTitle3.setBounds(890, 90, 231, 30);
		CommentPanel.add(PanelSignatureTitle3);

		txtSignatureTitle3 = new JTextField();
		txtSignatureTitle3.setBorder(new LineBorder(Color.black, 1, false));
		txtSignatureTitle3.setBounds(0, 0, 231, 30);
		PanelSignatureTitle3.add(txtSignatureTitle3);

		final JPanel PanelSignatureTitle4 = new JPanel();
		PanelSignatureTitle4.setBorder(new LineBorder(Color.black, 1, false));
		PanelSignatureTitle4.setLayout(null);
		PanelSignatureTitle4.setBounds(890, 120, 231, 30);
		CommentPanel.add(PanelSignatureTitle4);

		txtSignatureTitle4 = new JTextField();
		txtSignatureTitle4.setBorder(new LineBorder(Color.black, 1, false));
		txtSignatureTitle4.setBounds(0, 0, 231, 30);
		PanelSignatureTitle4.add(txtSignatureTitle4);

		final JPanel PanelSignatureTitle5 = new JPanel();
		PanelSignatureTitle5.setBorder(new LineBorder(Color.black, 1, false));
		PanelSignatureTitle5.setLayout(null);
		PanelSignatureTitle5.setBounds(890, 150, 231, 30);
		CommentPanel.add(PanelSignatureTitle5);

		txtSignatureTitle5 = new JTextField();
		txtSignatureTitle5.setBorder(new LineBorder(Color.black, 1, false));
		txtSignatureTitle5.setBounds(0, 0, 231, 30);
		PanelSignatureTitle5.add(txtSignatureTitle5);

	}

	public void signature() {
		final JPanel PanelSignatureMain = new JPanel();
		PanelSignatureMain.setBounds(0, 1300, 1122, 30);
		panel_3.add(PanelSignatureMain);
		PanelSignatureMain.setLayout(null);
		// PanelSignatureMain.setBounds(10, 47, 1122, 30);

		final JPanel PanelSignature = new JPanel();
		PanelSignature.setBackground(Color.WHITE);
		PanelSignature.setBorder(new LineBorder(Color.black, 1, false));
		PanelSignature.setLayout(null);
		PanelSignature.setBounds(0, 0, 180, 30);
		PanelSignatureMain.add(PanelSignature);

		NameLabel = new JLabel();
		NameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		NameLabel.setText("Signature / Title");
		NameLabel.setBounds(10, 10, 160, 14);
		PanelSignature.add(NameLabel);

		final JPanel PanelN = new JPanel();
		PanelN.setBackground(Color.WHITE);
		PanelN.setBorder(new LineBorder(Color.black, 1, false));
		PanelN.setLayout(null);
		PanelN.setBounds(180, 0, 314, 30);
		PanelSignatureMain.add(PanelN);

		nlabel = new JLabel();
		nlabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		nlabel.setText("N");
		nlabel.setBounds(10, 10, 23, 14);
		PanelN.add(nlabel);

		txtNsignature = new JTextField();
		txtNsignature.setBounds(39, 5, 265, 21);
		PanelN.add(txtNsignature);

		final JPanel PanelD = new JPanel();
		PanelD.setBackground(Color.WHITE);
		PanelD.setBorder(new LineBorder(Color.black, 1, false));
		PanelD.setLayout(null);
		PanelD.setBounds(493, 0, 314, 30);
		PanelSignatureMain.add(PanelD);

		final JLabel label_1 = new JLabel();
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setText("D:");
		label_1.setBounds(10, 10, 21, 14);
		PanelD.add(label_1);

		txtDSignature = new JTextField();
		txtDSignature.setBounds(37, 5, 267, 21);
		PanelD.add(txtDSignature);

		final JPanel PanelE = new JPanel();
		PanelE.setBackground(Color.WHITE);
		PanelE.setBorder(new LineBorder(Color.black, 1, false));
		PanelE.setLayout(null);
		PanelE.setBounds(807, 0, 314, 30);
		PanelSignatureMain.add(PanelE);

		eLabel = new JLabel();
		eLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		eLabel.setText("E:");
		eLabel.setBounds(10, 10, 19, 14);
		PanelE.add(eLabel);

		txtESignature = new JTextField();
		txtESignature.setBounds(35, 5, 269, 21);
		PanelE.add(txtESignature);

	}

	public void GUScreen() {
		final JPanel PanelGUMain = new JPanel();
		PanelGUMain.setBounds(560, 516, 281, 420);
		panel_3.add(PanelGUMain);
		PanelGUMain.setBorder(new LineBorder(Color.black, 1, false));
		PanelGUMain.setLayout(null);
		// PanelGUMain.setBounds(560, 517, 281, 420);

		final JPanel PanelBurning = new JPanel();
		PanelBurning.setBackground(Color.WHITE);
		PanelBurning.setBorder(new LineBorder(Color.black, 1, false));
		PanelBurning.setLayout(null);
		PanelBurning.setBounds(0, 30, 178, 30);
		PanelGUMain.add(PanelBurning);

		final JLabel BurningLabel = new JLabel();
		BurningLabel.setText("Burning");
		BurningLabel.setBounds(10, 10, 158, 16);
		PanelBurning.add(BurningLabel);

		final JPanel PanelDistention = new JPanel();
		PanelDistention.setBackground(Color.WHITE);
		PanelDistention.setBorder(new LineBorder(Color.black, 1, false));
		PanelDistention.setLayout(null);
		PanelDistention.setBounds(0, 60, 178, 30);
		PanelGUMain.add(PanelDistention);

		final JLabel DistentionLabel = new JLabel();
		DistentionLabel.setText("Distention / Retention");
		DistentionLabel.setBounds(10, 8, 158, 16);
		PanelDistention.add(DistentionLabel);

		final JPanel PanelFrequency = new JPanel();
		PanelFrequency.setBackground(Color.WHITE);
		PanelFrequency.setBorder(new LineBorder(Color.black, 1, false));
		PanelFrequency.setLayout(null);
		PanelFrequency.setBounds(0, 90, 178, 30);
		PanelGUMain.add(PanelFrequency);

		final JLabel FrequencyLabel = new JLabel();
		FrequencyLabel.setText("Frequency / Urgency");
		FrequencyLabel.setBounds(10, 8, 130, 16);
		PanelFrequency.add(FrequencyLabel);

		final JPanel PanelHematuria = new JPanel();
		PanelHematuria.setBackground(Color.WHITE);
		PanelHematuria.setBorder(new LineBorder(Color.black, 1, false));
		PanelHematuria.setLayout(null);
		PanelHematuria.setBounds(0, 120, 178, 30);
		PanelGUMain.add(PanelHematuria);

		final JLabel HematuriaLabel = new JLabel();
		HematuriaLabel.setText("Hematuria");
		HematuriaLabel.setBounds(10, 8, 102, 16);
		PanelHematuria.add(HematuriaLabel);

		final JPanel PanelCatheler = new JPanel();
		PanelCatheler.setBackground(Color.WHITE);
		PanelCatheler.setBorder(new LineBorder(Color.black, 1, false));
		PanelCatheler.setLayout(null);
		PanelCatheler.setBounds(0, 150, 178, 30);
		PanelGUMain.add(PanelCatheler);

		final JLabel CathelerLabel = new JLabel();
		CathelerLabel.setText("Catheler");
		CathelerLabel.setBounds(10, 8, 102, 16);
		PanelCatheler.add(CathelerLabel);

		final JPanel PanelUrine = new JPanel();
		PanelUrine.setBackground(Color.WHITE);
		PanelUrine.setBorder(new LineBorder(Color.black, 1, false));
		PanelUrine.setLayout(null);
		PanelUrine.setBounds(0, 180, 178, 30);
		PanelGUMain.add(PanelUrine);

		final JLabel UrineLabel = new JLabel();
		UrineLabel.setText("Urine");
		UrineLabel.setBounds(10, 8, 102, 16);
		PanelUrine.add(UrineLabel);

		final JPanel PanelDiscoloured = new JPanel();
		PanelDiscoloured.setBackground(Color.WHITE);
		PanelDiscoloured.setBorder(new LineBorder(Color.black, 1, false));
		PanelDiscoloured.setLayout(null);
		PanelDiscoloured.setBounds(0, 210, 178, 30);
		PanelGUMain.add(PanelDiscoloured);

		final JLabel LabelDiscoloured = new JLabel();
		LabelDiscoloured.setText("Discoloured");
		LabelDiscoloured.setBounds(37, 8, 131, 16);
		PanelDiscoloured.add(LabelDiscoloured);

		final JPanel PanelSediment = new JPanel();
		PanelSediment.setBackground(Color.WHITE);
		PanelSediment.setBorder(new LineBorder(Color.black, 1, false));
		PanelSediment.setLayout(null);
		PanelSediment.setBounds(0, 240, 178, 30);
		PanelGUMain.add(PanelSediment);

		final JLabel SedimentLabel = new JLabel();
		SedimentLabel.setText("Sediment");
		SedimentLabel.setBounds(37, 8, 131, 16);
		PanelSediment.add(SedimentLabel);

		final JPanel PanelOdor = new JPanel();
		PanelOdor.setBackground(Color.WHITE);
		PanelOdor.setBorder(new LineBorder(Color.black, 1, false));
		PanelOdor.setLayout(null);
		PanelOdor.setBounds(0, 270, 178, 30);
		PanelGUMain.add(PanelOdor);

		final JLabel OdorLabel = new JLabel();
		OdorLabel.setText("Odor");
		OdorLabel.setBounds(37, 10, 131, 16);
		PanelOdor.add(OdorLabel);

		final JPanel PanelDischarge = new JPanel();
		PanelDischarge.setBackground(Color.WHITE);
		PanelDischarge.setBorder(new LineBorder(Color.black, 1, false));
		PanelDischarge.setLayout(null);
		PanelDischarge.setBounds(0, 300, 178, 30);
		PanelGUMain.add(PanelDischarge);

		final JLabel DischargeLabel = new JLabel();
		DischargeLabel.setText("Discharge");
		DischargeLabel.setBounds(35, 10, 133, 16);
		PanelDischarge.add(DischargeLabel);

		final JPanel PanelGuWnl = new JPanel();
		PanelGuWnl.setBackground(Color.WHITE);
		PanelGuWnl.setBorder(new LineBorder(Color.black, 1, false));
		PanelGuWnl.setLayout(null);
		PanelGuWnl.setBounds(0, 330, 178, 30);
		PanelGUMain.add(PanelGuWnl);

		final JLabel GuWnlLabel = new JLabel();
		GuWnlLabel.setText("WNL");
		GuWnlLabel.setBounds(10, 8, 138, 16);
		PanelGuWnl.add(GuWnlLabel);

		final JPanel PanelGUBlank1 = new JPanel();
		PanelGUBlank1.setBackground(Color.WHITE);
		PanelGUBlank1.setBorder(new LineBorder(Color.black, 1, false));
		PanelGUBlank1.setLayout(null);
		PanelGUBlank1.setBounds(0, 360, 178, 30);
		PanelGUMain.add(PanelGUBlank1);

		final JPanel PanelGUBlank2 = new JPanel();
		PanelGUBlank2.setBackground(Color.WHITE);
		PanelGUBlank2.setBorder(new LineBorder(Color.black, 1, false));
		PanelGUBlank2.setLayout(null);
		PanelGUBlank2.setBounds(0, 390, 178, 30);
		PanelGUMain.add(PanelGUBlank2);

		final JPanel PanelBurningCB = new JPanel();
		PanelBurningCB.setBorder(new LineBorder(Color.black, 1, false));
		PanelBurningCB.setLayout(null);
		PanelBurningCB.setBounds(178, 30, 102, 30);
		PanelGUMain.add(PanelBurningCB);

		final JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setBounds(0, 30, 34, 30);
		PanelBurningCB.add(panel_10);

		final JLabel label = new JLabel();
		label.setText("New JLabel");
		panel_10.add(label);

		final JPanel PanelBurningD = new JPanel();
		PanelBurningD.setBackground(Color.WHITE);
		PanelBurningD.setBorder(new LineBorder(Color.black, 1, false));
		PanelBurningD.setBounds(34, 0, 34, 30);
		PanelBurningCB.add(PanelBurningD);

		cbBurningD = new JCheckBox();
		cbBurningD.setBackground(Color.WHITE);
		cbBurningD.setText("");
		PanelBurningD.add(cbBurningD);

		final JPanel PanelBurningE = new JPanel();
		PanelBurningE.setBackground(Color.WHITE);
		PanelBurningE.setBorder(new LineBorder(Color.black, 1, false));
		PanelBurningE.setBounds(68, 0, 34, 30);
		PanelBurningCB.add(PanelBurningE);

		cbBurningE = new JCheckBox();
		cbBurningE.setBackground(Color.WHITE);
		cbBurningE.setText("");
		PanelBurningE.add(cbBurningE);

		final JPanel PanelBurningN = new JPanel();
		PanelBurningN.setBackground(Color.WHITE);
		PanelBurningN.setBorder(new LineBorder(Color.black, 1, false));
		PanelBurningN.setBounds(0, 0, 34, 30);
		PanelBurningCB.add(PanelBurningN);

		cbBurningN = new JCheckBox();
		cbBurningN.setBackground(Color.WHITE);
		cbBurningN.setText("");
		PanelBurningN.add(cbBurningN);

		final JPanel PanelDistentionCB = new JPanel();
		PanelDistentionCB.setLayout(null);
		PanelDistentionCB.setBounds(178, 60, 102, 30);
		PanelGUMain.add(PanelDistentionCB);

		final JPanel PanelDistentionN = new JPanel();
		PanelDistentionN.setBackground(Color.WHITE);
		PanelDistentionN.setBorder(new LineBorder(Color.black, 1, false));
		PanelDistentionN.setBounds(0, 0, 34, 30);
		PanelDistentionCB.add(PanelDistentionN);

		cbDistentionRetentionN = new JCheckBox();
		cbDistentionRetentionN.setBackground(Color.WHITE);
		cbDistentionRetentionN.setText("");
		PanelDistentionN.add(cbDistentionRetentionN);

		final JPanel PanelDistentionD = new JPanel();
		PanelDistentionD.setBackground(Color.WHITE);
		PanelDistentionD.setBorder(new LineBorder(Color.black, 1, false));
		PanelDistentionD.setBounds(34, 0, 34, 30);
		PanelDistentionCB.add(PanelDistentionD);

		cbDistentionRetentionD = new JCheckBox();
		cbDistentionRetentionD.setBackground(Color.WHITE);
		cbDistentionRetentionD.setText("");
		PanelDistentionD.add(cbDistentionRetentionD);

		final JPanel PanelDistentionE = new JPanel();
		PanelDistentionE.setBackground(Color.WHITE);
		PanelDistentionE.setBorder(new LineBorder(Color.black, 1, false));
		PanelDistentionE.setBounds(68, 0, 34, 30);
		PanelDistentionCB.add(PanelDistentionE);

		cbDistentionRetentionE = new JCheckBox();
		cbDistentionRetentionE.setBackground(Color.WHITE);
		cbDistentionRetentionE.setText("");
		PanelDistentionE.add(cbDistentionRetentionE);

		final JPanel PanelFrequencyCB = new JPanel();
		PanelFrequencyCB.setLayout(null);
		PanelFrequencyCB.setBounds(178, 90, 102, 30);
		PanelGUMain.add(PanelFrequencyCB);

		final JPanel PanelFrequencyN = new JPanel();
		PanelFrequencyN.setBackground(Color.WHITE);
		PanelFrequencyN.setBorder(new LineBorder(Color.black, 1, false));
		PanelFrequencyN.setBounds(0, 0, 34, 30);
		PanelFrequencyCB.add(PanelFrequencyN);

		cbFrequencyUrgencyN = new JCheckBox();
		cbFrequencyUrgencyN.setBackground(Color.WHITE);
		cbFrequencyUrgencyN.setText("");
		PanelFrequencyN.add(cbFrequencyUrgencyN);

		final JPanel PanelFrequencyD = new JPanel();
		PanelFrequencyD.setBackground(Color.WHITE);
		PanelFrequencyD.setBorder(new LineBorder(Color.black, 1, false));
		PanelFrequencyD.setBounds(34, 0, 34, 30);
		PanelFrequencyCB.add(PanelFrequencyD);

		cbFrequencyUrgencyD = new JCheckBox();
		cbFrequencyUrgencyD.setBackground(Color.WHITE);
		cbFrequencyUrgencyD.setText("");
		PanelFrequencyD.add(cbFrequencyUrgencyD);

		final JPanel PanelFrequencyE = new JPanel();
		PanelFrequencyE.setBackground(Color.WHITE);
		PanelFrequencyE.setBorder(new LineBorder(Color.black, 1, false));
		PanelFrequencyE.setBounds(68, 0, 34, 30);
		PanelFrequencyCB.add(PanelFrequencyE);

		cbFrequencyUrgencyE = new JCheckBox();
		cbFrequencyUrgencyE.setBackground(Color.WHITE);
		cbFrequencyUrgencyE.setText("");
		PanelFrequencyE.add(cbFrequencyUrgencyE);

		final JPanel PanelHematuriaCB = new JPanel();
		PanelHematuriaCB.setLayout(null);
		PanelHematuriaCB.setBounds(178, 120, 102, 30);
		PanelGUMain.add(PanelHematuriaCB);

		final JPanel PanelHematuriaN = new JPanel();
		PanelHematuriaN.setBackground(Color.WHITE);
		PanelHematuriaN.setBorder(new LineBorder(Color.black, 1, false));
		PanelHematuriaN.setBounds(0, 0, 34, 30);
		PanelHematuriaCB.add(PanelHematuriaN);

		cbHematuriaN = new JCheckBox();
		cbHematuriaN.setBackground(Color.WHITE);
		cbHematuriaN.setText("");
		PanelHematuriaN.add(cbHematuriaN);

		final JPanel PanelHematuriaD = new JPanel();
		PanelHematuriaD.setBackground(Color.WHITE);
		PanelHematuriaD.setBorder(new LineBorder(Color.black, 1, false));
		PanelHematuriaD.setBounds(34, 0, 34, 30);
		PanelHematuriaCB.add(PanelHematuriaD);

		cbHematuriaD = new JCheckBox();
		cbHematuriaD.setBackground(Color.WHITE);
		cbHematuriaD.setText("");
		PanelHematuriaD.add(cbHematuriaD);

		final JPanel PanelHematuriaE = new JPanel();
		PanelHematuriaE.setBackground(Color.WHITE);
		PanelHematuriaE.setBorder(new LineBorder(Color.black, 1, false));
		PanelHematuriaE.setBounds(68, 0, 34, 30);
		PanelHematuriaCB.add(PanelHematuriaE);

		cbHematuriaE = new JCheckBox();
		cbHematuriaE.setBackground(Color.WHITE);
		cbHematuriaE.setText("");
		PanelHematuriaE.add(cbHematuriaE);

		final JPanel PanelCathelerCB = new JPanel();
		PanelCathelerCB.setLayout(null);
		PanelCathelerCB.setBounds(178, 150, 102, 30);
		PanelGUMain.add(PanelCathelerCB);

		final JPanel PanelCathelerN = new JPanel();
		PanelCathelerN.setBackground(Color.WHITE);
		PanelCathelerN.setBorder(new LineBorder(Color.black, 1, false));
		PanelCathelerN.setBounds(0, 0, 34, 30);
		PanelCathelerCB.add(PanelCathelerN);

		cbCathelerN = new JCheckBox();
		cbCathelerN.setBackground(Color.WHITE);
		cbCathelerN.setText("");
		PanelCathelerN.add(cbCathelerN);

		final JPanel PanelCathelerD = new JPanel();
		PanelCathelerD.setBackground(Color.WHITE);
		PanelCathelerD.setBorder(new LineBorder(Color.black, 1, false));
		PanelCathelerD.setBounds(34, 0, 34, 30);
		PanelCathelerCB.add(PanelCathelerD);

		cbCathelerD = new JCheckBox();
		cbCathelerD.setBackground(Color.WHITE);
		cbCathelerD.setText("");
		PanelCathelerD.add(cbCathelerD);

		final JPanel PanelCathelerE = new JPanel();
		PanelCathelerE.setBackground(Color.WHITE);
		PanelCathelerE.setBorder(new LineBorder(Color.black, 1, false));
		PanelCathelerE.setBounds(68, 0, 34, 30);
		PanelCathelerCB.add(PanelCathelerE);

		cbCathelerE = new JCheckBox();
		cbCathelerE.setBackground(Color.WHITE);
		cbCathelerE.setText("");
		PanelCathelerE.add(cbCathelerE);

		final JPanel PanelUrineCB = new JPanel();
		PanelUrineCB.setBackground(Color.BLACK);
		PanelUrineCB.setLayout(null);
		PanelUrineCB.setBounds(178, 180, 102, 30);
		PanelGUMain.add(PanelUrineCB);

		final JPanel PanelDiscolouredCB = new JPanel();
		PanelDiscolouredCB.setLayout(null);
		PanelDiscolouredCB.setBounds(178, 210, 102, 30);
		PanelGUMain.add(PanelDiscolouredCB);

		final JPanel PanelDiscolouredN = new JPanel();
		PanelDiscolouredN.setBackground(Color.WHITE);
		PanelDiscolouredN.setBorder(new LineBorder(Color.black, 1, false));
		PanelDiscolouredN.setBounds(0, 0, 34, 30);
		PanelDiscolouredCB.add(PanelDiscolouredN);

		cbDiscolouredN = new JCheckBox();
		cbDiscolouredN.setBackground(Color.WHITE);
		cbDiscolouredN.setText("");
		PanelDiscolouredN.add(cbDiscolouredN);

		final JPanel PanelDiscolouredD = new JPanel();
		PanelDiscolouredD.setBackground(Color.WHITE);
		PanelDiscolouredD.setBorder(new LineBorder(Color.black, 1, false));
		PanelDiscolouredD.setBounds(34, 0, 34, 30);
		PanelDiscolouredCB.add(PanelDiscolouredD);

		cbDiscolouredD = new JCheckBox();
		cbDiscolouredD.setBackground(Color.WHITE);
		cbDiscolouredD.setText("");
		PanelDiscolouredD.add(cbDiscolouredD);

		final JPanel PanelDiscolouredE = new JPanel();
		PanelDiscolouredE.setBackground(Color.WHITE);
		PanelDiscolouredE.setBorder(new LineBorder(Color.black, 1, false));
		PanelDiscolouredE.setBounds(68, 0, 34, 30);
		PanelDiscolouredCB.add(PanelDiscolouredE);

		cbDiscolouredE = new JCheckBox();
		cbDiscolouredE.setBackground(Color.WHITE);
		cbDiscolouredE.setText("");
		PanelDiscolouredE.add(cbDiscolouredE);

		final JPanel PanelSedimentCB = new JPanel();
		PanelSedimentCB.setLayout(null);
		PanelSedimentCB.setBounds(178, 240, 102, 30);
		PanelGUMain.add(PanelSedimentCB);

		final JPanel PanelSedimentN = new JPanel();
		PanelSedimentN.setBackground(Color.WHITE);
		PanelSedimentN.setBorder(new LineBorder(Color.black, 1, false));
		PanelSedimentN.setBounds(0, 0, 34, 30);
		PanelSedimentCB.add(PanelSedimentN);

		cbSedimentN = new JCheckBox();
		cbSedimentN.setBackground(Color.WHITE);
		cbSedimentN.setText("");
		PanelSedimentN.add(cbSedimentN);

		final JPanel PanelSedimentD = new JPanel();
		PanelSedimentD.setBackground(Color.WHITE);
		PanelSedimentD.setBorder(new LineBorder(Color.black, 1, false));
		PanelSedimentD.setBounds(34, 0, 34, 30);
		PanelSedimentCB.add(PanelSedimentD);

		cbSedimentD = new JCheckBox();
		cbSedimentD.setBackground(Color.WHITE);
		cbSedimentD.setText("");
		PanelSedimentD.add(cbSedimentD);

		final JPanel PanelSedimentE = new JPanel();
		PanelSedimentE.setBackground(Color.WHITE);
		PanelSedimentE.setBorder(new LineBorder(Color.black, 1, false));
		PanelSedimentE.setBounds(68, 0, 34, 30);
		PanelSedimentCB.add(PanelSedimentE);

		cbSedimentE = new JCheckBox();
		cbSedimentE.setBackground(Color.WHITE);
		cbSedimentE.setText("");
		PanelSedimentE.add(cbSedimentE);

		final JPanel PanelOdorCB = new JPanel();
		PanelOdorCB.setLayout(null);
		PanelOdorCB.setBounds(178, 270, 102, 30);
		PanelGUMain.add(PanelOdorCB);

		final JPanel PanelOdorN = new JPanel();
		PanelOdorN.setBackground(Color.WHITE);
		PanelOdorN.setBorder(new LineBorder(Color.black, 1, false));
		PanelOdorN.setBounds(0, 0, 34, 30);
		PanelOdorCB.add(PanelOdorN);

		cbOdorN = new JCheckBox();
		cbOdorN.setBackground(Color.WHITE);
		cbOdorN.setText("");
		PanelOdorN.add(cbOdorN);

		final JPanel PanelOdorD = new JPanel();
		PanelOdorD.setBackground(Color.WHITE);
		PanelOdorD.setBorder(new LineBorder(Color.black, 1, false));
		PanelOdorD.setBounds(34, 0, 34, 30);
		PanelOdorCB.add(PanelOdorD);

		cbOdorD = new JCheckBox();
		cbOdorD.setBackground(Color.WHITE);
		cbOdorD.setText("");
		PanelOdorD.add(cbOdorD);

		final JPanel PanelOdorE = new JPanel();
		PanelOdorE.setBackground(Color.WHITE);
		PanelOdorE.setBorder(new LineBorder(Color.black, 1, false));
		PanelOdorE.setBounds(68, 0, 34, 30);
		PanelOdorCB.add(PanelOdorE);

		cbOdorE = new JCheckBox();
		cbOdorE.setBackground(Color.WHITE);
		cbOdorE.setText("");
		PanelOdorE.add(cbOdorE);

		final JPanel PanelGuWnlCB = new JPanel();
		PanelGuWnlCB.setLayout(null);
		PanelGuWnlCB.setBounds(178, 330, 102, 30);
		PanelGUMain.add(PanelGuWnlCB);

		PanelGuWnlN = new JPanel();
		PanelGuWnlN.setBackground(Color.WHITE);
		PanelGuWnlN.setBorder(new LineBorder(Color.black, 1, false));
		PanelGuWnlN.setBounds(0, 0, 34, 30);
		PanelGuWnlCB.add(PanelGuWnlN);

		cbGuWnlN = new JCheckBox();
		cbGuWnlN.setBackground(Color.WHITE);
		cbGuWnlN.setText("");
		PanelGuWnlN.add(cbGuWnlN);

		final JPanel PanelGuWnlD = new JPanel();
		PanelGuWnlD.setBackground(Color.WHITE);
		PanelGuWnlD.setBorder(new LineBorder(Color.black, 1, false));
		PanelGuWnlD.setBounds(34, 0, 34, 30);
		PanelGuWnlCB.add(PanelGuWnlD);

		cbGuWnlD = new JCheckBox();
		cbGuWnlD.setBackground(Color.WHITE);
		cbGuWnlD.setText("");
		PanelGuWnlD.add(cbGuWnlD);

		final JPanel PanelGuWnlE = new JPanel();
		PanelGuWnlE.setBackground(Color.WHITE);
		PanelGuWnlE.setBorder(new LineBorder(Color.black, 1, false));
		PanelGuWnlE.setBounds(68, 0, 34, 30);
		PanelGuWnlCB.add(PanelGuWnlE);

		cbGuWnlE = new JCheckBox();
		cbGuWnlE.setBackground(Color.WHITE);
		cbGuWnlE.setText("");
		PanelGuWnlE.add(cbGuWnlE);

		final JPanel PanelGUBlank1CB = new JPanel();
		PanelGUBlank1CB.setLayout(null);
		PanelGUBlank1CB.setBounds(178, 360, 102, 30);
		PanelGUMain.add(PanelGUBlank1CB);

		final JPanel PanelGUBlank3 = new JPanel();
		PanelGUBlank3.setBackground(Color.WHITE);
		PanelGUBlank3.setBorder(new LineBorder(Color.black, 1, false));
		PanelGUBlank3.setBounds(0, 0, 34, 30);
		PanelGUBlank1CB.add(PanelGUBlank3);

		final JPanel PanelGUBlank4 = new JPanel();
		PanelGUBlank4.setBackground(Color.WHITE);
		PanelGUBlank4.setBorder(new LineBorder(Color.black, 1, false));
		PanelGUBlank4.setBounds(34, 0, 34, 30);
		PanelGUBlank1CB.add(PanelGUBlank4);

		final JPanel PanelGUBlank5 = new JPanel();
		PanelGUBlank5.setBackground(Color.WHITE);
		PanelGUBlank5.setBorder(new LineBorder(Color.black, 1, false));
		PanelGUBlank5.setBounds(68, 0, 34, 30);
		PanelGUBlank1CB.add(PanelGUBlank5);

		final JPanel PanelGUBlank2CB = new JPanel();
		PanelGUBlank2CB.setLayout(null);
		PanelGUBlank2CB.setBounds(178, 390, 102, 30);
		PanelGUMain.add(PanelGUBlank2CB);

		final JPanel PanelGUBlank6 = new JPanel();
		PanelGUBlank6.setBackground(Color.WHITE);
		PanelGUBlank6.setBorder(new LineBorder(Color.black, 1, false));
		PanelGUBlank6.setBounds(0, 0, 34, 30);
		PanelGUBlank2CB.add(PanelGUBlank6);

		final JPanel PanelGUBlank7 = new JPanel();
		PanelGUBlank7.setBackground(Color.WHITE);
		PanelGUBlank7.setBorder(new LineBorder(Color.black, 1, false));
		PanelGUBlank7.setBounds(34, 0, 34, 30);
		PanelGUBlank2CB.add(PanelGUBlank7);

		final JPanel PanelGUBlank8 = new JPanel();
		PanelGUBlank8.setBackground(Color.WHITE);
		PanelGUBlank8.setBorder(new LineBorder(Color.black, 1, false));
		PanelGUBlank8.setBounds(68, 0, 34, 30);
		PanelGUBlank2CB.add(PanelGUBlank8);

		final JPanel PanelGU = new JPanel();
		PanelGU.setBackground(Color.BLACK);
		PanelGU.setBorder(new LineBorder(Color.black, 1, false));
		PanelGU.setLayout(null);
		PanelGU.setBounds(0, 0, 280, 30);
		PanelGUMain.add(PanelGU);

		final JLabel labelGU = new JLabel();
		labelGU.setForeground(Color.WHITE);
		labelGU.setText("GU");
		labelGU.setBounds(112, 10, 84, 16);
		PanelGU.add(labelGU);

		final JPanel PanelDischargeCB = new JPanel();
		PanelDischargeCB.setLayout(null);
		PanelDischargeCB.setBounds(178, 300, 102, 30);
		PanelGUMain.add(PanelDischargeCB);

		final JPanel PanelDischargeN = new JPanel();
		PanelDischargeN.setBackground(Color.WHITE);
		PanelDischargeN.setBorder(new LineBorder(Color.black, 1, false));
		PanelDischargeN.setBounds(0, 0, 34, 30);
		PanelDischargeCB.add(PanelDischargeN);

		cbDischargeN = new JCheckBox();
		cbDischargeN.setBackground(Color.WHITE);
		cbDischargeN.setText("");
		PanelDischargeN.add(cbDischargeN);

		final JPanel PanelDischargeD = new JPanel();
		PanelDischargeD.setBackground(Color.WHITE);
		PanelDischargeD.setBorder(new LineBorder(Color.black, 1, false));
		PanelDischargeD.setBounds(34, 0, 34, 30);
		PanelDischargeCB.add(PanelDischargeD);

		cbDischargeD = new JCheckBox();
		cbDischargeD.setBackground(Color.WHITE);
		cbDischargeD.setText("");
		PanelDischargeD.add(cbDischargeD);

		final JPanel PanelDischargeE = new JPanel();
		PanelDischargeE.setBackground(Color.WHITE);
		PanelDischargeE.setBorder(new LineBorder(Color.black, 1, false));
		PanelDischargeE.setBounds(68, 0, 34, 30);
		PanelDischargeCB.add(PanelDischargeE);

		cbDischargeE = new JCheckBox();
		cbDischargeE.setBackground(Color.WHITE);
		cbDischargeE.setText("");
		PanelDischargeE.add(cbDischargeE);

	}

	public void therapy() {
		final JPanel PanelTherapyMain = new JPanel();
		PanelTherapyMain.setBackground(Color.WHITE);
		PanelTherapyMain.setBorder(new LineBorder(Color.black, 1, false));
		PanelTherapyMain.setLayout(null);
		PanelTherapyMain.setBounds(841, 938, 281, 363);
		PanelTherapyMain.setBounds(841, 938, 281, 363);
		panel_3.add(PanelTherapyMain);
		// add(PanelTherapyMain);
		final JPanel panelRehabilitation = new JPanel();
		panelRehabilitation.setBackground(Color.WHITE);
		panelRehabilitation.setBorder(new LineBorder(Color.black, 1, false));
		panelRehabilitation.setLayout(null);
		panelRehabilitation.setBounds(0, 30, 178, 30);
		PanelTherapyMain.add(panelRehabilitation);

		final JLabel LabelNuursingRehabilitation = new JLabel();
		LabelNuursingRehabilitation.setText("Nursing Rehabilitation");
		LabelNuursingRehabilitation.setBounds(10, 10, 158, 16);
		panelRehabilitation.add(LabelNuursingRehabilitation);

		final JPanel panelRespiratory = new JPanel();
		panelRespiratory.setBackground(Color.WHITE);
		panelRespiratory.setBorder(new LineBorder(Color.black, 1, false));
		panelRespiratory.setLayout(null);
		panelRespiratory.setBounds(0, 60, 178, 30);
		PanelTherapyMain.add(panelRespiratory);

		final JLabel labelRespiratory = new JLabel();
		labelRespiratory.setText("Respiratory");
		labelRespiratory.setBounds(10, 8, 158, 16);
		panelRespiratory.add(labelRespiratory);

		final JPanel PanelBraces = new JPanel();
		PanelBraces.setBackground(Color.WHITE);
		PanelBraces.setBorder(new LineBorder(Color.black, 1, false));
		PanelBraces.setLayout(null);
		PanelBraces.setBounds(0, 90, 178, 30);
		PanelTherapyMain.add(PanelBraces);

		final JLabel labelBraces = new JLabel();
		labelBraces.setText("Braces, Casts, Splints");
		labelBraces.setBounds(10, 8, 130, 16);
		PanelBraces.add(labelBraces);

		final JPanel panelOrthotics = new JPanel();
		panelOrthotics.setBackground(Color.WHITE);
		panelOrthotics.setBorder(new LineBorder(Color.black, 1, false));
		panelOrthotics.setLayout(null);
		panelOrthotics.setBounds(0, 120, 178, 30);
		PanelTherapyMain.add(panelOrthotics);

		final JLabel labelOrthotics = new JLabel();
		labelOrthotics.setText("Orthotics");
		labelOrthotics.setBounds(10, 8, 140, 16);
		panelOrthotics.add(labelOrthotics);

		final JPanel panelBlank1 = new JPanel();
		panelBlank1.setBackground(Color.WHITE);
		panelBlank1.setBorder(new LineBorder(Color.black, 1, false));
		panelBlank1.setLayout(null);
		panelBlank1.setBounds(0, 150, 178, 30);
		PanelTherapyMain.add(panelBlank1);

		final JPanel panelAppetite = new JPanel();
		panelAppetite.setBackground(Color.WHITE);
		panelAppetite.setBorder(new LineBorder(Color.black, 1, false));
		panelAppetite.setLayout(null);
		panelAppetite.setBounds(0, 180, 178, 30);
		PanelTherapyMain.add(panelAppetite);

		final JLabel LabellAppetite = new JLabel();
		LabellAppetite.setText("Appetite");
		LabellAppetite.setBounds(10, 8, 102, 16);
		panelAppetite.add(LabellAppetite);

		final JPanel panelPoor = new JPanel();
		panelPoor.setBackground(Color.WHITE);
		panelPoor.setBorder(new LineBorder(Color.black, 1, false));
		panelPoor.setLayout(null);
		panelPoor.setBounds(0, 210, 178, 30);
		PanelTherapyMain.add(panelPoor);

		final JLabel LabelPoor = new JLabel();
		LabelPoor.setText("Poor");
		LabelPoor.setBounds(36, 8, 101, 16);
		panelPoor.add(LabelPoor);

		final JPanel PanelFair = new JPanel();
		PanelFair.setBackground(Color.WHITE);
		PanelFair.setBorder(new LineBorder(Color.black, 1, false));
		PanelFair.setLayout(null);
		PanelFair.setBounds(0, 240, 178, 30);
		PanelTherapyMain.add(PanelFair);

		final JLabel LabelFair = new JLabel();
		LabelFair.setText("Fair");
		LabelFair.setBounds(34, 8, 114, 16);
		PanelFair.add(LabelFair);

		final JPanel panelGood = new JPanel();
		panelGood.setBackground(Color.WHITE);
		panelGood.setBorder(new LineBorder(Color.black, 1, false));
		panelGood.setLayout(null);
		panelGood.setBounds(0, 270, 178, 30);
		PanelTherapyMain.add(panelGood);

		final JLabel LabelGood = new JLabel();
		LabelGood.setText("Good");
		LabelGood.setBounds(33, 8, 135, 16);
		panelGood.add(LabelGood);

		final JPanel PanelBlank2 = new JPanel();
		PanelBlank2.setBackground(Color.WHITE);
		PanelBlank2.setBorder(new LineBorder(Color.black, 1, false));
		PanelBlank2.setLayout(null);
		PanelBlank2.setBounds(0, 300, 178, 30);
		PanelTherapyMain.add(PanelBlank2);

		final JPanel PanelBlank3 = new JPanel();
		PanelBlank3.setBackground(Color.WHITE);
		PanelBlank3.setBorder(new LineBorder(Color.black, 1, false));
		PanelBlank3.setLayout(null);
		PanelBlank3.setBounds(0, 330, 178, 30);
		PanelTherapyMain.add(PanelBlank3);

		final JPanel PanelNursingCB = new JPanel();
		PanelNursingCB.setBorder(new LineBorder(Color.black, 1, false));
		PanelNursingCB.setLayout(null);
		PanelNursingCB.setBounds(178, 30, 102, 30);
		PanelTherapyMain.add(PanelNursingCB);

		final JPanel PanelNursingD = new JPanel();
		PanelNursingD.setBackground(Color.WHITE);
		PanelNursingD.setBorder(new LineBorder(Color.black, 1, false));
		PanelNursingD.setBounds(34, 0, 34, 30);
		PanelNursingCB.add(PanelNursingD);

		cbNursingRehabilitationD = new JCheckBox();
		cbNursingRehabilitationD.setBackground(Color.WHITE);
		cbNursingRehabilitationD.setText("");
		PanelNursingD.add(cbNursingRehabilitationD);

		final JPanel PanelNursingE = new JPanel();
		PanelNursingE.setBackground(Color.WHITE);
		PanelNursingE.setBorder(new LineBorder(Color.black, 1, false));
		PanelNursingE.setBounds(68, 0, 34, 30);
		PanelNursingCB.add(PanelNursingE);

		cbNursingRehabilitationE = new JCheckBox();
		cbNursingRehabilitationE.setBackground(Color.WHITE);
		cbNursingRehabilitationE.setText("");
		PanelNursingE.add(cbNursingRehabilitationE);

		final JPanel PanelNursingN = new JPanel();
		PanelNursingN.setBackground(Color.WHITE);
		PanelNursingN.setBorder(new LineBorder(Color.black, 1, false));
		PanelNursingN.setBounds(0, 0, 34, 30);
		PanelNursingCB.add(PanelNursingN);

		cbNursingRehabilitationN = new JCheckBox();
		cbNursingRehabilitationN.setBackground(Color.WHITE);
		cbNursingRehabilitationN.setText("");
		PanelNursingN.add(cbNursingRehabilitationN);

		final JPanel PanelBracesMain = new JPanel();
		PanelBracesMain.setLayout(null);
		PanelBracesMain.setBounds(178, 90, 102, 30);
		PanelTherapyMain.add(PanelBracesMain);

		final JPanel PanelBracesN = new JPanel();
		PanelBracesN.setBackground(Color.WHITE);
		PanelBracesN.setBorder(new LineBorder(Color.black, 1, false));
		PanelBracesN.setBounds(0, 0, 34, 30);
		PanelBracesMain.add(PanelBracesN);

		cbBracesN = new JCheckBox();
		cbBracesN.setBackground(Color.WHITE);
		cbBracesN.setText("");
		PanelBracesN.add(cbBracesN);

		final JPanel PanelBracesD = new JPanel();
		PanelBracesD.setBackground(Color.WHITE);
		PanelBracesD.setBorder(new LineBorder(Color.black, 1, false));
		PanelBracesD.setBounds(34, 0, 34, 30);
		PanelBracesMain.add(PanelBracesD);

		cbBracesD = new JCheckBox();
		cbBracesD.setBackground(Color.WHITE);
		cbBracesD.setText("");
		PanelBracesD.add(cbBracesD);

		final JPanel PanelBracesE = new JPanel();
		PanelBracesE.setBackground(Color.WHITE);
		PanelBracesE.setBorder(new LineBorder(Color.black, 1, false));
		PanelBracesE.setBounds(68, 0, 34, 30);
		PanelBracesMain.add(PanelBracesE);

		cbBracesE = new JCheckBox();
		cbBracesE.setBackground(Color.WHITE);
		cbBracesE.setText("");
		PanelBracesE.add(cbBracesE);

		final JPanel PanelOrthoticsCB = new JPanel();
		PanelOrthoticsCB.setLayout(null);
		PanelOrthoticsCB.setBounds(178, 120, 102, 30);
		PanelTherapyMain.add(PanelOrthoticsCB);

		final JPanel PanelOrthoticsN = new JPanel();
		PanelOrthoticsN.setBackground(Color.WHITE);
		PanelOrthoticsN.setBorder(new LineBorder(Color.black, 1, false));
		PanelOrthoticsN.setBounds(0, 0, 34, 30);
		PanelOrthoticsCB.add(PanelOrthoticsN);

		cbOrthoticsN = new JCheckBox();
		cbOrthoticsN.setBackground(Color.WHITE);
		cbOrthoticsN.setText("");
		PanelOrthoticsN.add(cbOrthoticsN);

		final JPanel PanelOrthoticsD = new JPanel();
		PanelOrthoticsD.setBackground(Color.WHITE);
		PanelOrthoticsD.setBorder(new LineBorder(Color.black, 1, false));
		PanelOrthoticsD.setBounds(34, 0, 34, 30);
		PanelOrthoticsCB.add(PanelOrthoticsD);

		cbOrthoticsD = new JCheckBox();
		cbOrthoticsD.setBackground(Color.WHITE);
		cbOrthoticsD.setText("");
		PanelOrthoticsD.add(cbOrthoticsD);

		final JPanel PanelOrthoticsE = new JPanel();
		PanelOrthoticsE.setBackground(Color.WHITE);
		PanelOrthoticsE.setBorder(new LineBorder(Color.black, 1, false));
		PanelOrthoticsE.setBounds(68, 0, 34, 30);
		PanelOrthoticsCB.add(PanelOrthoticsE);

		cbOrthoticsE = new JCheckBox();
		cbOrthoticsE.setBackground(Color.WHITE);
		cbOrthoticsE.setText("");
		PanelOrthoticsE.add(cbOrthoticsE);

		final JPanel PanelBlankCB1 = new JPanel();
		PanelBlankCB1.setLayout(null);
		PanelBlankCB1.setBounds(178, 150, 102, 30);
		PanelTherapyMain.add(PanelBlankCB1);

		final JPanel panelBlank11 = new JPanel();
		panelBlank11.setBackground(Color.WHITE);
		panelBlank11.setBorder(new LineBorder(Color.black, 1, false));
		panelBlank11.setBounds(0, 0, 34, 30);
		PanelBlankCB1.add(panelBlank11);

		final JPanel PanelBlank12 = new JPanel();
		PanelBlank12.setBackground(Color.WHITE);
		PanelBlank12.setBorder(new LineBorder(Color.black, 1, false));
		PanelBlank12.setBounds(34, 0, 34, 30);
		PanelBlankCB1.add(PanelBlank12);

		final JPanel PanelBlank13 = new JPanel();
		PanelBlank13.setBackground(Color.WHITE);
		PanelBlank13.setBorder(new LineBorder(Color.black, 1, false));
		PanelBlank13.setBounds(68, 0, 34, 30);
		PanelBlankCB1.add(PanelBlank13);

		final JPanel PanelAppetiteCB = new JPanel();
		PanelAppetiteCB.setLayout(null);
		PanelAppetiteCB.setBounds(178, 180, 102, 30);
		PanelTherapyMain.add(PanelAppetiteCB);

		final JPanel PanelAppetiteN = new JPanel();
		PanelAppetiteN.setBackground(Color.WHITE);
		PanelAppetiteN.setBorder(new LineBorder(Color.black, 1, false));
		PanelAppetiteN.setBounds(0, 0, 34, 30);
		PanelAppetiteCB.add(PanelAppetiteN);

		cbAppetiteN = new JCheckBox();
		cbAppetiteN.setBackground(Color.WHITE);
		cbAppetiteN.setText("");
		PanelAppetiteN.add(cbAppetiteN);

		final JPanel PanelAppetiteD = new JPanel();
		PanelAppetiteD.setBackground(Color.WHITE);
		PanelAppetiteD.setBorder(new LineBorder(Color.black, 1, false));
		PanelAppetiteD.setBounds(34, 0, 34, 30);
		PanelAppetiteCB.add(PanelAppetiteD);

		cbAppetiteD = new JCheckBox();
		cbAppetiteD.setBackground(Color.WHITE);
		cbAppetiteD.setText("");
		PanelAppetiteD.add(cbAppetiteD);

		final JPanel PanelAppetiteE = new JPanel();
		PanelAppetiteE.setBackground(Color.WHITE);
		PanelAppetiteE.setBorder(new LineBorder(Color.black, 1, false));
		PanelAppetiteE.setBounds(68, 0, 34, 30);
		PanelAppetiteCB.add(PanelAppetiteE);

		cbAppetiteE = new JCheckBox();
		cbAppetiteE.setBackground(Color.WHITE);
		cbAppetiteE.setText("");
		PanelAppetiteE.add(cbAppetiteE);

		final JPanel PanelPoorCB = new JPanel();
		PanelPoorCB.setBounds(178, 210, 102, 30);
		PanelTherapyMain.add(PanelPoorCB);
		PanelPoorCB.setBorder(new LineBorder(Color.black, 1, false));
		PanelPoorCB.setLayout(null);

		final JPanel PanelAppetitePoorD = new JPanel();
		PanelAppetitePoorD.setBackground(Color.WHITE);
		PanelAppetitePoorD.setBorder(new LineBorder(Color.black, 1, false));
		PanelAppetitePoorD.setBounds(34, 0, 34, 30);
		PanelPoorCB.add(PanelAppetitePoorD);

		cbAppetitePoorD = new JCheckBox();
		cbAppetitePoorD.setBackground(Color.WHITE);
		cbAppetitePoorD.setText("");
		PanelAppetitePoorD.add(cbAppetitePoorD);

		final JPanel PanelAppetitePoorE = new JPanel();
		PanelAppetitePoorE.setBackground(Color.WHITE);
		PanelAppetitePoorE.setBorder(new LineBorder(Color.black, 1, false));
		PanelAppetitePoorE.setBounds(68, 0, 34, 30);
		PanelPoorCB.add(PanelAppetitePoorE);

		cbAppetitePoorE = new JCheckBox();
		cbAppetitePoorE.setBackground(Color.WHITE);
		cbAppetitePoorE.setText("");
		PanelAppetitePoorE.add(cbAppetitePoorE);

		final JPanel PanelAppetitePoorN = new JPanel();
		PanelAppetitePoorN.setBackground(Color.WHITE);
		PanelAppetitePoorN.setBorder(new LineBorder(Color.black, 1, false));
		PanelAppetitePoorN.setBounds(0, 0, 34, 30);
		PanelPoorCB.add(PanelAppetitePoorN);

		cbAppetitePoorN = new JCheckBox();
		cbAppetitePoorN.setBackground(Color.WHITE);
		cbAppetitePoorN.setText("");
		PanelAppetitePoorN.add(cbAppetitePoorN);

		final JPanel PanelFairCB = new JPanel();
		PanelFairCB.setLayout(null);
		PanelFairCB.setBounds(178, 240, 102, 30);
		PanelTherapyMain.add(PanelFairCB);

		final JPanel PanelAppetiteFairN = new JPanel();
		PanelAppetiteFairN.setBackground(Color.WHITE);
		PanelAppetiteFairN.setBorder(new LineBorder(Color.black, 1, false));
		PanelAppetiteFairN.setBounds(0, 0, 34, 30);
		PanelFairCB.add(PanelAppetiteFairN);

		cbAppetiteFairN = new JCheckBox();
		cbAppetiteFairN.setBackground(Color.WHITE);
		cbAppetiteFairN.setText("");
		PanelAppetiteFairN.add(cbAppetiteFairN);

		final JPanel PanelAppetiteFairD = new JPanel();
		PanelAppetiteFairD.setBackground(Color.WHITE);
		PanelAppetiteFairD.setBorder(new LineBorder(Color.black, 1, false));
		PanelAppetiteFairD.setBounds(34, 0, 34, 30);
		PanelFairCB.add(PanelAppetiteFairD);

		cbAppetiteFairD = new JCheckBox();
		cbAppetiteFairD.setBackground(Color.WHITE);
		cbAppetiteFairD.setText("");
		PanelAppetiteFairD.add(cbAppetiteFairD);

		final JPanel PanelAppetiteFairE = new JPanel();
		PanelAppetiteFairE.setBackground(Color.WHITE);
		PanelAppetiteFairE.setBorder(new LineBorder(Color.black, 1, false));
		PanelAppetiteFairE.setBounds(68, 0, 34, 30);
		PanelFairCB.add(PanelAppetiteFairE);

		cbAppetiteFairE = new JCheckBox();
		cbAppetiteFairE.setBackground(Color.WHITE);
		cbAppetiteFairE.setText("");
		PanelAppetiteFairE.add(cbAppetiteFairE);

		final JPanel PanelGoodCB = new JPanel();
		PanelGoodCB.setLayout(null);
		PanelGoodCB.setBounds(178, 270, 102, 30);
		PanelTherapyMain.add(PanelGoodCB);

		final JPanel PanelAppetiteGoodN = new JPanel();
		PanelAppetiteGoodN.setBackground(Color.WHITE);
		PanelAppetiteGoodN.setBorder(new LineBorder(Color.black, 1, false));
		PanelAppetiteGoodN.setBounds(0, 0, 34, 30);
		PanelGoodCB.add(PanelAppetiteGoodN);

		cbAppetiteGoodN = new JCheckBox();
		cbAppetiteGoodN.setBackground(Color.WHITE);
		cbAppetiteGoodN.setText("");
		PanelAppetiteGoodN.add(cbAppetiteGoodN);

		final JPanel PanelAppetiteGoodD = new JPanel();
		PanelAppetiteGoodD.setBackground(Color.WHITE);
		PanelAppetiteGoodD.setBorder(new LineBorder(Color.black, 1, false));
		PanelAppetiteGoodD.setBounds(34, 0, 34, 30);
		PanelGoodCB.add(PanelAppetiteGoodD);

		cbAppetiteGoodD = new JCheckBox();
		cbAppetiteGoodD.setBackground(Color.WHITE);
		cbAppetiteGoodD.setText("");
		PanelAppetiteGoodD.add(cbAppetiteGoodD);

		final JPanel PanelAppetiteGoodE = new JPanel();
		PanelAppetiteGoodE.setBackground(Color.WHITE);
		PanelAppetiteGoodE.setBorder(new LineBorder(Color.black, 1, false));
		PanelAppetiteGoodE.setBounds(68, 0, 34, 30);
		PanelGoodCB.add(PanelAppetiteGoodE);

		cbAppetiteGoodE = new JCheckBox();
		cbAppetiteGoodE.setBackground(Color.WHITE);
		cbAppetiteGoodE.setText("");
		PanelAppetiteGoodE.add(cbAppetiteGoodE);

		final JPanel PanelBlankCB2 = new JPanel();
		PanelBlankCB2.setLayout(null);
		PanelBlankCB2.setBounds(178, 300, 102, 30);
		PanelTherapyMain.add(PanelBlankCB2);

		final JPanel PanelBlank4 = new JPanel();
		PanelBlank4.setBackground(Color.WHITE);
		PanelBlank4.setBorder(new LineBorder(Color.black, 1, false));
		PanelBlank4.setBounds(0, 0, 34, 30);
		PanelBlankCB2.add(PanelBlank4);

		final JPanel PanelBlank5 = new JPanel();
		PanelBlank5.setBackground(Color.WHITE);
		PanelBlank5.setBorder(new LineBorder(Color.black, 1, false));
		PanelBlank5.setBounds(34, 0, 34, 30);
		PanelBlankCB2.add(PanelBlank5);

		final JPanel PanelBlank6 = new JPanel();
		PanelBlank6.setBackground(Color.WHITE);
		PanelBlank6.setBorder(new LineBorder(Color.black, 1, false));
		PanelBlank6.setBounds(68, 0, 34, 30);
		PanelBlankCB2.add(PanelBlank6);

		final JPanel panelTherapy = new JPanel();
		panelTherapy.setBackground(Color.WHITE);
		panelTherapy.setBorder(new LineBorder(Color.black, 1, false));
		panelTherapy.setLayout(null);
		panelTherapy.setBounds(0, 0, 178, 30);
		PanelTherapyMain.add(panelTherapy);

		final JLabel LabelTherapy = new JLabel();
		LabelTherapy.setText("Therapy");
		LabelTherapy.setBounds(10, 10, 158, 16);
		panelTherapy.add(LabelTherapy);

		final JPanel PanelTherapyCB = new JPanel();
		PanelTherapyCB.setBorder(new LineBorder(Color.black, 1, false));
		PanelTherapyCB.setLayout(null);
		PanelTherapyCB.setBounds(178, 0, 102, 30);
		PanelTherapyMain.add(PanelTherapyCB);

		final JPanel PanelTherapyD = new JPanel();
		PanelTherapyD.setBackground(Color.WHITE);
		PanelTherapyD.setBorder(new LineBorder(Color.black, 1, false));
		PanelTherapyD.setBounds(34, 0, 34, 30);
		PanelTherapyCB.add(PanelTherapyD);

		cbTherapyD = new JCheckBox();
		cbTherapyD.setBackground(Color.WHITE);
		cbTherapyD.setText("");
		PanelTherapyD.add(cbTherapyD);

		final JPanel PanelTherapyE = new JPanel();
		PanelTherapyE.setBackground(Color.WHITE);
		PanelTherapyE.setBorder(new LineBorder(Color.black, 1, false));
		PanelTherapyE.setBounds(68, 0, 34, 30);
		PanelTherapyCB.add(PanelTherapyE);

		cbTherapyE = new JCheckBox();
		cbTherapyE.setBackground(Color.WHITE);
		cbTherapyE.setText("");
		PanelTherapyE.add(cbTherapyE);

		final JPanel PanelTherapyN = new JPanel();
		PanelTherapyN.setBackground(Color.WHITE);
		PanelTherapyN.setBorder(new LineBorder(Color.black, 1, false));
		PanelTherapyN.setBounds(0, 0, 34, 30);
		PanelTherapyCB.add(PanelTherapyN);

		cbTherapyN = new JCheckBox();
		cbTherapyN.setBackground(Color.WHITE);
		cbTherapyN.setText("");
		PanelTherapyN.add(cbTherapyN);

		final JPanel PanelRespiratoryCB = new JPanel();
		PanelRespiratoryCB.setBorder(new LineBorder(Color.black, 1, false));
		PanelRespiratoryCB.setLayout(null);
		PanelRespiratoryCB.setBounds(178, 60, 102, 30);
		PanelTherapyMain.add(PanelRespiratoryCB);

		final JPanel PanelRespiratoryD = new JPanel();
		PanelRespiratoryD.setBackground(Color.WHITE);
		PanelRespiratoryD.setBorder(new LineBorder(Color.black, 1, false));
		PanelRespiratoryD.setBounds(34, 0, 34, 30);
		PanelRespiratoryCB.add(PanelRespiratoryD);

		cbRespiratoryD = new JCheckBox();
		cbRespiratoryD.setBackground(Color.WHITE);
		cbRespiratoryD.setText("");
		PanelRespiratoryD.add(cbRespiratoryD);

		final JPanel PanelRespiratoryE = new JPanel();
		PanelRespiratoryE.setBackground(Color.WHITE);
		PanelRespiratoryE.setBorder(new LineBorder(Color.black, 1, false));
		PanelRespiratoryE.setBounds(68, 0, 34, 30);
		PanelRespiratoryCB.add(PanelRespiratoryE);

		cbRespiratoryE = new JCheckBox();
		cbRespiratoryE.setBackground(Color.WHITE);
		cbRespiratoryE.setText("");
		PanelRespiratoryE.add(cbRespiratoryE);

		final JPanel PanelRespiratoryN = new JPanel();
		PanelRespiratoryN.setBackground(Color.WHITE);
		PanelRespiratoryN.setBorder(new LineBorder(Color.black, 1, false));
		PanelRespiratoryN.setBounds(0, 0, 34, 30);
		PanelRespiratoryCB.add(PanelRespiratoryN);

		cbRespiratoryN = new JCheckBox();
		cbRespiratoryN.setBackground(Color.WHITE);
		cbRespiratoryN.setText("");
		PanelRespiratoryN.add(cbRespiratoryN);

		final JPanel PanelBlankCB3 = new JPanel();
		PanelBlankCB3.setLayout(null);
		PanelBlankCB3.setBounds(178, 330, 102, 30);
		PanelTherapyMain.add(PanelBlankCB3);

		final JPanel PanelBlank7 = new JPanel();
		PanelBlank7.setBackground(Color.WHITE);
		PanelBlank7.setBorder(new LineBorder(Color.black, 1, false));
		PanelBlank7.setBounds(0, 0, 34, 30);
		PanelBlankCB3.add(PanelBlank7);

		final JPanel PanelBlank8 = new JPanel();
		PanelBlank8.setBackground(Color.WHITE);
		PanelBlank8.setBorder(new LineBorder(Color.black, 1, false));
		PanelBlank8.setBounds(34, 0, 34, 30);
		PanelBlankCB3.add(PanelBlank8);

		final JPanel PanelBlank9 = new JPanel();
		PanelBlank9.setBackground(Color.WHITE);
		PanelBlank9.setBorder(new LineBorder(Color.black, 1, false));
		PanelBlank9.setBounds(68, 0, 34, 30);
		PanelBlankCB3.add(PanelBlank9);
		// updateData();

	}

	// Updation And Saving Methods

	public void doUpdate() {
		updateData();
	}

	public void doLoad() {

	}

	public void updateData() {
		try {
			ResidentMain rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
			System.out.println("resident main " + rm);
			txtMiddleName.setText("");
			txtLastName.setText(rm.getUserPass());
			txtFirstName.setText(rm.getUserName());
			/* TODO: Migrating to room history */
			// txtRoomBed.setText(rm.getRoom());
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		DailySkilledNursesNotes refDailySkilledNursesNotes = null;
		if (Global.currentDailySkilledNursesNotesKey != 0) {
			try {
				// System.out.println(Global.currentDailySkilledNursesNotesKey);
				refDailySkilledNursesNotes = MedrexClientManager.getInstance()
						.getDailySkilledNursesNotes(
								Global.currentDailySkilledNursesNotesKey);
			} catch (Exception e) {
				e.printStackTrace();
			}
			cbIntramuscularInjectionsE.setSelected(refDailySkilledNursesNotes
					.isIntramuscularInjectionsE());
			cbIntramuscularInjectionsD.setSelected(refDailySkilledNursesNotes
					.isIntramuscularInjectionsD());
			cbStatisUlcersE.setSelected(refDailySkilledNursesNotes
					.isStatisUlcersE());
			cbStatisUlcersD.setSelected(refDailySkilledNursesNotes
					.isStatisUlcersD());
			cbWoundCareDressingE.setSelected(refDailySkilledNursesNotes
					.isWoundCareDressingE());
			cbWoundCareDressingD.setSelected(refDailySkilledNursesNotes
					.isWoundCareDressingD());
			cbObserveSsxInfectionE.setSelected(refDailySkilledNursesNotes
					.isObserveSsxInfectionE());
			cbObserveSsxInfectionD.setSelected(refDailySkilledNursesNotes
					.isObserveSsxInfectionD());
			cbMDOrdersE.setSelected(refDailySkilledNursesNotes.isMDOrdersE());
			cbMDOrdersD.setSelected(refDailySkilledNursesNotes.isMDOrdersD());
			cbAlertN.setSelected(refDailySkilledNursesNotes.isAlertN());
			cbAppetiteGoodE.setSelected(refDailySkilledNursesNotes
					.isAppetiteGoodE());
			cbAppetiteGoodD.setSelected(refDailySkilledNursesNotes
					.isAppetiteGoodD());
			cbAppetiteGoodN.setSelected(refDailySkilledNursesNotes
					.isAppetiteGoodN());
			cbAppetiteFairE.setSelected(refDailySkilledNursesNotes
					.isAppetiteFairE());
			cbAppetiteFairD.setSelected(refDailySkilledNursesNotes
					.isAppetiteFairD());
			cbAppetiteFairN.setSelected(refDailySkilledNursesNotes
					.isAppetiteFairN());
			cbAppetitePoorN.setSelected(refDailySkilledNursesNotes
					.isAppetitePoorN());
			cbAppetiteE.setSelected(refDailySkilledNursesNotes.isAppetiteE());
			cbAppetiteD.setSelected(refDailySkilledNursesNotes.isAppetiteD());
			cbAppetiteN.setSelected(refDailySkilledNursesNotes.isAppetiteN());
			cbOrthoticsE.setSelected(refDailySkilledNursesNotes.isOrthoticsE());
			cbOrthoticsD.setSelected(refDailySkilledNursesNotes.isOrthoticsD());
			cbOrthoticsN.setSelected(refDailySkilledNursesNotes.isOrthoticsN());
			cbBracesE.setSelected(refDailySkilledNursesNotes.isBracesE());
			cbBracesD.setSelected(refDailySkilledNursesNotes.isBracesD());
			cbBracesN.setSelected(refDailySkilledNursesNotes.isBracesN());
			cbRespiratoryN.setSelected(refDailySkilledNursesNotes
					.isRespiratoryN());
			cbNursingRehabilitationE.setSelected(refDailySkilledNursesNotes
					.isNursingRehabilitationE());
			cbNursingRehabilitationD.setSelected(refDailySkilledNursesNotes
					.isNursingRehabilitationD());
			cbNursingRehabilitationN.setSelected(refDailySkilledNursesNotes
					.isNursingRehabilitationN());
			cbTherapyN.setSelected(refDailySkilledNursesNotes.isTherapyN());
			cbRespiratoryE.setSelected(refDailySkilledNursesNotes
					.isRespiratoryE());
			cbRespiratoryD.setSelected(refDailySkilledNursesNotes
					.isRespiratoryD());
			cbTherapyE.setSelected(refDailySkilledNursesNotes.isTherapyE());
			cbTherapyD.setSelected(refDailySkilledNursesNotes.isTherapyD());
			cbAppetitePoorE.setSelected(refDailySkilledNursesNotes
					.isAppetitePoorE());
			cbAppetitePoorD.setSelected(refDailySkilledNursesNotes
					.isAppetitePoorD());
			cbChillsE.setSelected(refDailySkilledNursesNotes.isChillsE());
			cbChillsD.setSelected(refDailySkilledNursesNotes.isChillsD());
			cbChillsN.setSelected(refDailySkilledNursesNotes.isChillsN());
			cbCyanosisN.setSelected(refDailySkilledNursesNotes.isCyanosisN());
			cbCyanosisE.setSelected(refDailySkilledNursesNotes.isCyanosisE());
			cbCyanosisD.setSelected(refDailySkilledNursesNotes.isCyanosisD());
			cbSkinWnlE.setSelected(refDailySkilledNursesNotes.isSkinWnlE());
			cbSkinWnlD.setSelected(refDailySkilledNursesNotes.isSkinWnlD());
			cbSkinWnlN.setSelected(refDailySkilledNursesNotes.isSkinWnlN());
			cbAbnormalTurgorE.setSelected(refDailySkilledNursesNotes
					.isAbnormalTurgorE());
			cbAbnormalTurgorD.setSelected(refDailySkilledNursesNotes
					.isAbnormalTurgorD());
			cbAbnormalTurgorN.setSelected(refDailySkilledNursesNotes
					.isAbnormalTurgorN());
			cbRashItchingN.setSelected(refDailySkilledNursesNotes
					.isRashItchingN());
			cbRashItchingE.setSelected(refDailySkilledNursesNotes
					.isRashItchingE());
			cbRashItchingD.setSelected(refDailySkilledNursesNotes
					.isRashItchingD());
			cbFlushingSkinE.setSelected(refDailySkilledNursesNotes
					.isFlushingSkinE());
			cbFlushingSkinD.setSelected(refDailySkilledNursesNotes
					.isFlushingSkinD());
			cbFlushingSkinN.setSelected(refDailySkilledNursesNotes
					.isFlushingSkinN());
			cbClammyE.setSelected(refDailySkilledNursesNotes.isClammyE());
			cbClammyD.setSelected(refDailySkilledNursesNotes.isClammyD());
			cbClammyN.setSelected(refDailySkilledNursesNotes.isClammyN());
			cbPallorE.setSelected(refDailySkilledNursesNotes.isPallorE());
			cbPallorD.setSelected(refDailySkilledNursesNotes.isPallorD());
			cbPallorN.setSelected(refDailySkilledNursesNotes.isPallorN());
			cbJaundicedN.setSelected(refDailySkilledNursesNotes.isJaundicedN());
			cbJaundicedE.setSelected(refDailySkilledNursesNotes.isJaundicedE());
			cbJaundicedD.setSelected(refDailySkilledNursesNotes.isJaundicedD());
			cbGuWnlE.setSelected(refDailySkilledNursesNotes.isGuWnlE());
			cbGuWnlD.setSelected(refDailySkilledNursesNotes.isGuWnlD());
			cbGuWnlN.setSelected(refDailySkilledNursesNotes.isGuWnlN());
			cbDischargeE.setSelected(refDailySkilledNursesNotes.isDischargeE());
			cbDischargeN.setSelected(refDailySkilledNursesNotes.isDischargeN());
			cbOdorE.setSelected(refDailySkilledNursesNotes.isOdorE());
			cbOdorD.setSelected(refDailySkilledNursesNotes.isOdorD());
			cbOdorN.setSelected(refDailySkilledNursesNotes.isOdorN());
			cbSedimentE.setSelected(refDailySkilledNursesNotes.isSedimentE());
			cbSedimentN.setSelected(refDailySkilledNursesNotes.isSedimentN());
			cbDiscolouredE.setSelected(refDailySkilledNursesNotes
					.isDiscolouredE());
			cbDiscolouredD.setSelected(refDailySkilledNursesNotes
					.isDiscolouredD());
			cbDiscolouredN.setSelected(refDailySkilledNursesNotes
					.isDiscolouredN());
			cbCathelerE.setSelected(refDailySkilledNursesNotes.isCathelerE());
			cbCathelerD.setSelected(refDailySkilledNursesNotes.isCathelerD());
			cbCathelerN.setSelected(refDailySkilledNursesNotes.isCathelerN());
			cbHematuriaE.setSelected(refDailySkilledNursesNotes.isHematuriaE());
			cbHematuriaD.setSelected(refDailySkilledNursesNotes.isHematuriaD());
			cbHematuriaN.setSelected(refDailySkilledNursesNotes.isHematuriaN());
			cbFrequencyUrgencyD.setSelected(refDailySkilledNursesNotes
					.isFrequencyUrgencyD());
			cbFrequencyUrgencyE.setSelected(refDailySkilledNursesNotes
					.isFrequencyUrgencyE());
			cbFrequencyUrgencyN.setSelected(refDailySkilledNursesNotes
					.isFrequencyUrgencyN());
			cbDistentionRetentionE.setSelected(refDailySkilledNursesNotes
					.isDistentionRetentionE());
			cbDistentionRetentionD.setSelected(refDailySkilledNursesNotes
					.isDistentionRetentionD());
			cbDistentionRetentionN.setSelected(refDailySkilledNursesNotes
					.isDistentionRetentionN());
			cbBurningE.setSelected(refDailySkilledNursesNotes.isBurningE());
			cbBurningD.setSelected(refDailySkilledNursesNotes.isBurningD());
			cbBurningN.setSelected(refDailySkilledNursesNotes.isBurningN());
			txtESignature.setText(refDailySkilledNursesNotes.getESignature());
			txtDSignature.setText(refDailySkilledNursesNotes.getDSignature());
			txtNsignature.setText(refDailySkilledNursesNotes.getNsignature());
			txtSignatureTitle5.setText(refDailySkilledNursesNotes
					.getSignatureTitle5());
			txtSignatureTitle4.setText(refDailySkilledNursesNotes
					.getSignatureTitle4());
			txtSignatureTitle3.setText(refDailySkilledNursesNotes
					.getSignatureTitle3());
			txtSignatureTitle2.setText(refDailySkilledNursesNotes
					.getSignatureTitle2());
			txtSignatureTitle1.setText(refDailySkilledNursesNotes
					.getSignatureTitle1());
			txtComment5.setText(refDailySkilledNursesNotes.getComment5());
			txtComment4.setText(refDailySkilledNursesNotes.getComment4());
			txtComment3.setText(refDailySkilledNursesNotes.getComment3());
			txtComment2.setText(refDailySkilledNursesNotes.getComment2());
			txtComment1.setText(refDailySkilledNursesNotes.getComment1());
			txtDateTime5.setText(refDailySkilledNursesNotes.getDateTime5());
			txtDateTime4.setText(refDailySkilledNursesNotes.getDateTime4());
			txtDateTime3.setText(refDailySkilledNursesNotes.getDateTime3());
			txtDateTime2.setText(refDailySkilledNursesNotes.getDateTime2());
			txtDateTime1.setText(refDailySkilledNursesNotes.getDateTime1());
			txtDate.setText(refDailySkilledNursesNotes.getDate());
			txtTemprature.setText(refDailySkilledNursesNotes.getTemprature());
			txtPulse.setText(refDailySkilledNursesNotes.getPulse());
			txtRespiration.setText(refDailySkilledNursesNotes.getRespiration());
			txtBloodPressure.setText(refDailySkilledNursesNotes
					.getBloodPressure());
			cbAlertD.setSelected(refDailySkilledNursesNotes.isAlertD());
			cbAlertE.setSelected(refDailySkilledNursesNotes.isAlertE());
			cbOrientedToN.setSelected(refDailySkilledNursesNotes
					.isOrientedToN());
			cbOrientedToD.setSelected(refDailySkilledNursesNotes
					.isOrientedToD());
			cbOrientedToE.setSelected(refDailySkilledNursesNotes
					.isOrientedToE());
			cbPersonN.setSelected(refDailySkilledNursesNotes.isPersonN());
			cbPersonD.setSelected(refDailySkilledNursesNotes.isPersonD());
			cbPersonE.setSelected(refDailySkilledNursesNotes.isPersonE());
			cbPlaceN.setSelected(refDailySkilledNursesNotes.isPlaceN());
			cbPlaceD.setSelected(refDailySkilledNursesNotes.isPlaceD());
			cbPlaceE.setSelected(refDailySkilledNursesNotes.isPlaceE());
			cbTimeN.setSelected(refDailySkilledNursesNotes.isTimeN());
			cbTimeD.setSelected(refDailySkilledNursesNotes.isTimeD());
			cbTimeE.setSelected(refDailySkilledNursesNotes.isTimeE());
			cbAnxiousAgitatedN.setSelected(refDailySkilledNursesNotes
					.isAnxiousAgitatedN());
			cbAnxiousAgitatedD.setSelected(refDailySkilledNursesNotes
					.isAnxiousAgitatedD());
			cbAnxiousAgitatedE.setSelected(refDailySkilledNursesNotes
					.isAnxiousAgitatedE());
			cbRestlessLethargicN.setSelected(refDailySkilledNursesNotes
					.isRestlessLethargicN());
			cbRestlessLethargicD.setSelected(refDailySkilledNursesNotes
					.isRestlessLethargicD());
			cbRestlessLethargicE.setSelected(refDailySkilledNursesNotes
					.isRestlessLethargicE());
			cbAbnormalSleepN.setSelected(refDailySkilledNursesNotes
					.isAbnormalSleepN());
			cbAbnormalSleepD.setSelected(refDailySkilledNursesNotes
					.isAbnormalSleepD());
			cbAbnormalSleepE.setSelected(refDailySkilledNursesNotes
					.isAbnormalSleepE());
			cbForgetfulConfusedN.setSelected(refDailySkilledNursesNotes
					.isForgetfulConfusedN());
			cbForgetfulConfusedD.setSelected(refDailySkilledNursesNotes
					.isForgetfulConfusedD());
			cbForgetfulConfusedE.setSelected(refDailySkilledNursesNotes
					.isForgetfulConfusedE());
			cbHallucinationDelusionN.setSelected(refDailySkilledNursesNotes
					.isHallucinationDelusionN());
			cbHallucinationDelusionD.setSelected(refDailySkilledNursesNotes
					.isHallucinationDelusionD());
			cbHallucinationDelusionE.setSelected(refDailySkilledNursesNotes
					.isHallucinationDelusionE());
			cbRegularRhythmN.setSelected(refDailySkilledNursesNotes
					.isRegularRhythmN());
			cbRegularRhythmD.setSelected(refDailySkilledNursesNotes
					.isRegularRhythmD());
			cbRegularRhythmE.setSelected(refDailySkilledNursesNotes
					.isRegularRhythmE());
			cbRadialApicalIrregularN.setSelected(refDailySkilledNursesNotes
					.isRadialApicalIrregularN());
			cbRadialApicalIrregularD.setSelected(refDailySkilledNursesNotes
					.isRadialApicalIrregularD());
			cbRadialApicalIrregularE.setSelected(refDailySkilledNursesNotes
					.isRadialApicalIrregularE());
			cbChestPainN.setSelected(refDailySkilledNursesNotes.isChestPainN());
			cbChestPainD.setSelected(refDailySkilledNursesNotes.isChestPainD());
			cbChestPainE.setSelected(refDailySkilledNursesNotes.isChestPainE());
			cbPedalLtRtN.setSelected(refDailySkilledNursesNotes.isPedalLtRtN());
			cbPedalLtRtD.setSelected(refDailySkilledNursesNotes.isPedalLtRtD());
			cbPedalLtRtE.setSelected(refDailySkilledNursesNotes.isPedalLtRtE());
			cbPitting1N.setSelected(refDailySkilledNursesNotes.isPitting1N());
			cbPitting1D.setSelected(refDailySkilledNursesNotes.isPitting1D());
			cbPitting1E.setSelected(refDailySkilledNursesNotes.isPitting1E());
			cbPitting2N.setSelected(refDailySkilledNursesNotes.isPitting2N());
			cbPitting2D.setSelected(refDailySkilledNursesNotes.isPitting2D());
			cbPitting2E.setSelected(refDailySkilledNursesNotes.isPitting2E());
			cbPitting3N.setSelected(refDailySkilledNursesNotes.isPitting3N());
			cbPitting3D.setSelected(refDailySkilledNursesNotes.isPitting3D());
			cbPitting3E.setSelected(refDailySkilledNursesNotes.isPitting3E());
			cbPitting4N.setSelected(refDailySkilledNursesNotes.isPitting4N());
			cbPitting4D.setSelected(refDailySkilledNursesNotes.isPitting4D());
			cbPitting4E.setSelected(refDailySkilledNursesNotes.isPitting4E());
			cbAbnormalPeriheralPulsesN.setSelected(refDailySkilledNursesNotes
					.isAbnormalPeriheralPulsesN());
			cbAbnormalPeriheralPulsesD.setSelected(refDailySkilledNursesNotes
					.isAbnormalPeriheralPulsesD());
			cbAbnormalPeriheralPulsesE.setSelected(refDailySkilledNursesNotes
					.isAbnormalPeriheralPulsesE());
			cbCardiovascularWnlN.setSelected(refDailySkilledNursesNotes
					.isCardiovascularWnlN());
			cbCardiovascularWnlD.setSelected(refDailySkilledNursesNotes
					.isCardiovascularWnlD());
			cbCardiovascularWnlE.setSelected(refDailySkilledNursesNotes
					.isCardiovascularWnlE());
			cbNauseaVomittingN.setSelected(refDailySkilledNursesNotes
					.isNauseaVomittingN());
			cbNauseaVomittingD.setSelected(refDailySkilledNursesNotes
					.isNauseaVomittingD());
			cbNauseaVomittingE.setSelected(refDailySkilledNursesNotes
					.isNauseaVomittingE());
			cbEpigasticDistressN.setSelected(refDailySkilledNursesNotes
					.isEpigasticDistressN());
			cbEpigasticDistressD.setSelected(refDailySkilledNursesNotes
					.isEpigasticDistressD());
			cbEpigasticDistressE.setSelected(refDailySkilledNursesNotes
					.isEpigasticDistressE());
			cbDifficaultySwallowingN.setSelected(refDailySkilledNursesNotes
					.isDifficaultySwallowingN());
			cbDifficaultySwallowingD.setSelected(refDailySkilledNursesNotes
					.isDifficaultySwallowingD());
			cbDifficaultySwallowingE.setSelected(refDailySkilledNursesNotes
					.isDifficaultySwallowingE());
			cbAbdominalDistentonN.setSelected(refDailySkilledNursesNotes
					.isAbdominalDistentonN());
			cbAbdominalDistentonD.setSelected(refDailySkilledNursesNotes
					.isAbdominalDistentonD());
			cbAbdominalDistentonE.setSelected(refDailySkilledNursesNotes
					.isAbdominalDistentonE());
			cbDiarrheaN.setSelected(refDailySkilledNursesNotes.isDiarrheaN());
			cbDiarrheaD.setSelected(refDailySkilledNursesNotes.isDiarrheaD());
			cbDiarrheaE.setSelected(refDailySkilledNursesNotes.isDiarrheaE());
			cbConstipationN.setSelected(refDailySkilledNursesNotes
					.isConstipationN());
			cbConstipationD.setSelected(refDailySkilledNursesNotes
					.isConstipationD());
			cbConstipationE.setSelected(refDailySkilledNursesNotes
					.isConstipationE());
			cbBowelSoundsN.setSelected(refDailySkilledNursesNotes
					.isBowelSoundsN());
			cbBowelSoundsD.setSelected(refDailySkilledNursesNotes
					.isBowelSoundsD());
			cbBowelSoundsE.setSelected(refDailySkilledNursesNotes
					.isBowelSoundsE());
			cbPresentN.setSelected(refDailySkilledNursesNotes.isPresentN());
			cbPresentD.setSelected(refDailySkilledNursesNotes.isPresentD());
			cbPresentE.setSelected(refDailySkilledNursesNotes.isPresentE());
			cbAbsentN.setSelected(refDailySkilledNursesNotes.isAbsentN());
			cbAbsentD.setSelected(refDailySkilledNursesNotes.isAbsentD());
			cbAbsentE.setSelected(refDailySkilledNursesNotes.isAbsentE());
			cbHyperActiveN.setSelected(refDailySkilledNursesNotes
					.isHyperActiveN());
			cbHyperActiveD.setSelected(refDailySkilledNursesNotes
					.isHyperActiveD());
			cbHyperActiveE.setSelected(refDailySkilledNursesNotes
					.isHyperActiveE());
			cbHypoActiveN.setSelected(refDailySkilledNursesNotes
					.isHypoActiveN());
			cbHypoActiveD.setSelected(refDailySkilledNursesNotes
					.isHypoActiveD());
			cbHypoActiveE.setSelected(refDailySkilledNursesNotes
					.isHypoActiveE());
			cbBalanceGaitUnsteadyN.setSelected(refDailySkilledNursesNotes
					.isBalanceGaitUnsteadyN());
			cbBalanceGaitUnsteadyD.setSelected(refDailySkilledNursesNotes
					.isBalanceGaitUnsteadyD());
			cbBalanceGaitUnsteadyE.setSelected(refDailySkilledNursesNotes
					.isBalanceGaitUnsteadyE());
			cbParalysisN.setSelected(refDailySkilledNursesNotes.isParalysisN());
			cbParalysisD.setSelected(refDailySkilledNursesNotes.isParalysisD());
			cbParalysisE.setSelected(refDailySkilledNursesNotes.isParalysisE());
			cbMusculoSkeketalWnlN.setSelected(refDailySkilledNursesNotes
					.isMusculoSkeketalWnlN());
			cbMusculoSkeketalWnlD.setSelected(refDailySkilledNursesNotes
					.isMusculoSkeketalWnlD());
			cbMusculoSkeketalWnlE.setSelected(refDailySkilledNursesNotes
					.isMusculoSkeketalWnlE());
			cbSynCopeN.setSelected(refDailySkilledNursesNotes.isSynCopeN());
			cbSynCopeD.setSelected(refDailySkilledNursesNotes.isSynCopeD());
			cbSynCopeE.setSelected(refDailySkilledNursesNotes.isSynCopeE());
			cbHeadAcheN.setSelected(refDailySkilledNursesNotes.isHeadAcheN());
			cbHeadAcheD.setSelected(refDailySkilledNursesNotes.isHeadAcheD());
			cbHeadAcheE.setSelected(refDailySkilledNursesNotes.isHeadAcheE());
			cbDecreasedGraspE.setSelected(refDailySkilledNursesNotes
					.isDecreasedGraspE());
			cbNervousSystemRtN.setSelected(refDailySkilledNursesNotes
					.isNervousSystemRtN());
			cbNervousSystemRtD.setSelected(refDailySkilledNursesNotes
					.isNervousSystemRtD());
			cbNervousSystemRtE.setSelected(refDailySkilledNursesNotes
					.isNervousSystemRtE());
			cbNervousSystemLtN.setSelected(refDailySkilledNursesNotes
					.isNervousSystemLtN());
			cbNervousSystemLtD.setSelected(refDailySkilledNursesNotes
					.isNervousSystemLtD());
			cbNervousSystemLtE.setSelected(refDailySkilledNursesNotes
					.isNervousSystemLtE());
			cbDecresedMovementE.setSelected(refDailySkilledNursesNotes
					.isDecresedMovementE());
			cbRueLueN.setSelected(refDailySkilledNursesNotes.isRueLueN());
			cbRueLueD.setSelected(refDailySkilledNursesNotes.isRueLueD());
			cbRueLueE.setSelected(refDailySkilledNursesNotes.isRueLueE());
			cbRleLLeN.setSelected(refDailySkilledNursesNotes.isRleLLeN());
			cbRleLLeD.setSelected(refDailySkilledNursesNotes.isRleLLeD());
			cbRleLLeE.setSelected(refDailySkilledNursesNotes.isRleLLeE());
			cbAbnormalPupilReactionE.setSelected(refDailySkilledNursesNotes
					.isAbnormalPupilReactionE());
			cbAbnormalReactionRightN.setSelected(refDailySkilledNursesNotes
					.isAbnormalReactionRightN());
			cbAbnormalReactionRightD.setSelected(refDailySkilledNursesNotes
					.isAbnormalReactionRightD());
			cbAbnormalReactionRightE.setSelected(refDailySkilledNursesNotes
					.isAbnormalReactionRightE());
			cbAbnormalReactionLeftN.setSelected(refDailySkilledNursesNotes
					.isAbnormalReactionLeftN());
			cbAbnormalReactionLeftD.setSelected(refDailySkilledNursesNotes
					.isAbnormalReactionLeftD());
			cbAbnormalReactionLeftE.setSelected(refDailySkilledNursesNotes
					.isAbnormalReactionLeftE());
			cbTremorsN.setSelected(refDailySkilledNursesNotes.isTremorsN());
			cbTremorsD.setSelected(refDailySkilledNursesNotes.isTremorsD());
			cbTremorsE.setSelected(refDailySkilledNursesNotes.isTremorsE());
			cbVertigoN.setSelected(refDailySkilledNursesNotes.isVertigoN());
			cbVertigoD.setSelected(refDailySkilledNursesNotes.isVertigoD());
			cbVertigoE.setSelected(refDailySkilledNursesNotes.isVertigoE());
			cbNervousSystemWnlN.setSelected(refDailySkilledNursesNotes
					.isNervousSystemWnlN());
			cbNervousSystemWnlD.setSelected(refDailySkilledNursesNotes
					.isNervousSystemWnlD());
			cbNervousSystemWnlE.setSelected(refDailySkilledNursesNotes
					.isNervousSystemWnlE());
			cbLeboredBreathingD.setSelected(refDailySkilledNursesNotes
					.isLeboredBreathingD());
			cbLeboredBreathingE.setSelected(refDailySkilledNursesNotes
					.isLeboredBreathingE());
			cbLeboredBreathingN.setSelected(refDailySkilledNursesNotes
					.isLeboredBreathingN());
			cbShallowRespirationN.setSelected(refDailySkilledNursesNotes
					.isShallowRespirationN());
			cbShallowRespirationD.setSelected(refDailySkilledNursesNotes
					.isShallowRespirationD());
			cbShallowRespirationE.setSelected(refDailySkilledNursesNotes
					.isShallowRespirationE());
			cbRatesRhonchiN.setSelected(refDailySkilledNursesNotes
					.isRatesRhonchiN());
			cbRatesRhonchiD.setSelected(refDailySkilledNursesNotes
					.isRatesRhonchiD());
			cbRatesRhonchiE.setSelected(refDailySkilledNursesNotes
					.isRatesRhonchiE());
			cbWheezingN.setSelected(refDailySkilledNursesNotes.isWheezingN());
			cbWheezingD.setSelected(refDailySkilledNursesNotes.isWheezingD());
			cbWheezingE.setSelected(refDailySkilledNursesNotes.isWheezingE());
			cbCoughN.setSelected(refDailySkilledNursesNotes.isCoughN());
			cbCoughD.setSelected(refDailySkilledNursesNotes.isCoughD());
			cbCoughE.setSelected(refDailySkilledNursesNotes.isCoughE());
			cbDyspneaSobN.setSelected(refDailySkilledNursesNotes
					.isDyspneaSobN());
			cbDyspneaSobD.setSelected(refDailySkilledNursesNotes
					.isDyspneaSobD());
			cbDyspneaSobE.setSelected(refDailySkilledNursesNotes
					.isDyspneaSobE());
			cbQ2LpmN.setSelected(refDailySkilledNursesNotes.isQ2LpmN());
			cbQ2LpmD.setSelected(refDailySkilledNursesNotes.isQ2LpmD());
			cbQ2LpmE.setSelected(refDailySkilledNursesNotes.isQ2LpmE());
			cbPrnN.setSelected(refDailySkilledNursesNotes.isPrnN());
			cbPrnD.setSelected(refDailySkilledNursesNotes.isPrnD());
			cbPrnE.setSelected(refDailySkilledNursesNotes.isPrnE());
			cbContinousN.setSelected(refDailySkilledNursesNotes.isContinousN());
			cbContinousD.setSelected(refDailySkilledNursesNotes.isContinousD());
			cbContinousE.setSelected(refDailySkilledNursesNotes.isContinousE());
			cbS2O2N.setSelected(refDailySkilledNursesNotes.isS2O2N());
			cbS2O2D.setSelected(refDailySkilledNursesNotes.isS2O2D());
			cbS2O2E.setSelected(refDailySkilledNursesNotes.isS2O2E());
			cbSuctioningN.setSelected(refDailySkilledNursesNotes
					.isSuctioningN());
			cbSuctioningD.setSelected(refDailySkilledNursesNotes
					.isSuctioningD());
			cbSuctioningE.setSelected(refDailySkilledNursesNotes
					.isSuctioningE());
			cbTrachCareN.setSelected(refDailySkilledNursesNotes.isTrachCareN());
			cbTrachCareD.setSelected(refDailySkilledNursesNotes.isTrachCareD());
			cbTrachCareE.setSelected(refDailySkilledNursesNotes.isTrachCareE());
			cbVentCareN.setSelected(refDailySkilledNursesNotes.isVentCareN());
			cbVentCareD.setSelected(refDailySkilledNursesNotes.isVentCareD());
			cbVentCareE.setSelected(refDailySkilledNursesNotes.isVentCareE());
			cbLungsClearN.setSelected(refDailySkilledNursesNotes
					.isLungsClearN());
			cbRespiratoryWnlN.setSelected(refDailySkilledNursesNotes
					.isRespiratoryWnlN());
			cbLungsClearD.setSelected(refDailySkilledNursesNotes
					.isLungsClearD());
			cbLungsClearE.setSelected(refDailySkilledNursesNotes
					.isLungsClearE());
			cbRespiratoryWnlE.setSelected(refDailySkilledNursesNotes
					.isRespiratoryWnlE());
			cbRespiratoryWnlD.setSelected(refDailySkilledNursesNotes
					.isRespiratoryWnlD());
			cbOriginN.setSelected(refDailySkilledNursesNotes.isOriginN());
			cbOriginD.setSelected(refDailySkilledNursesNotes.isOriginD());
			cbOriginE.setSelected(refDailySkilledNursesNotes.isOriginE());
			cbLocationN.setSelected(refDailySkilledNursesNotes.isLocationN());
			cbLocationD.setSelected(refDailySkilledNursesNotes.isLocationD());
			cbLocationE.setSelected(refDailySkilledNursesNotes.isLocationE());
			cbIntensityN.setSelected(refDailySkilledNursesNotes.isIntensityN());
			cbIntensityD.setSelected(refDailySkilledNursesNotes.isIntensityD());
			cbIntensityE.setSelected(refDailySkilledNursesNotes.isIntensityE());
			cbNoneN.setSelected(refDailySkilledNursesNotes.isNoneN());
			cbNoneD.setSelected(refDailySkilledNursesNotes.isNoneD());
			cbNoneE.setSelected(refDailySkilledNursesNotes.isNoneE());
			cbMDNotifiedE.setSelected(refDailySkilledNursesNotes
					.isMDNotifiedE());
			cbMDNotifiedN.setSelected(refDailySkilledNursesNotes
					.isMDNotifiedN());
			cbSkilledObservationAssessmentN
					.setSelected(refDailySkilledNursesNotes
							.isSkilledObservationAssessmentN());
			cbSkilledObservationAssessmentD
					.setSelected(refDailySkilledNursesNotes
							.isSkilledObservationAssessmentD());
			cbSkilledObservationAssessmentE
					.setSelected(refDailySkilledNursesNotes
							.isSkilledObservationAssessmentE());
			cbDiabeticManagementN.setSelected(refDailySkilledNursesNotes
					.isDiabeticManagementN());
			cbDiabeticManagementD.setSelected(refDailySkilledNursesNotes
					.isDiabeticManagementD());
			cbDiabeticManagementE.setSelected(refDailySkilledNursesNotes
					.isDiabeticManagementE());
			cbGlucometerReadingN.setSelected(refDailySkilledNursesNotes
					.isGlucometerReadingN());
			cbGlucometerReadingD.setSelected(refDailySkilledNursesNotes
					.isGlucometerReadingD());
			cbGlucometerReadingE.setSelected(refDailySkilledNursesNotes
					.isGlucometerReadingE());
			cbDehaydrationN.setSelected(refDailySkilledNursesNotes
					.isDehaydrationN());
			cbDehaydrationD.setSelected(refDailySkilledNursesNotes
					.isDehaydrationD());
			cbDehaydrationE.setSelected(refDailySkilledNursesNotes
					.isDehaydrationE());
			cbManagementTeachingN.setSelected(refDailySkilledNursesNotes
					.isManagementTeachingN());
			cbManagementTeachingD.setSelected(refDailySkilledNursesNotes
					.isManagementTeachingD());
			cbManagementTeachingE.setSelected(refDailySkilledNursesNotes
					.isManagementTeachingE());
			cbDialysisManagementN.setSelected(refDailySkilledNursesNotes
					.isDialysisManagementN());
			cbDialysisManagementD.setSelected(refDailySkilledNursesNotes
					.isDialysisManagementD());
			cbDialysisManagementE.setSelected(refDailySkilledNursesNotes
					.isDialysisManagementE());
			cbSideEffectN.setSelected(refDailySkilledNursesNotes
					.isSideEffectN());
			cbSideEffectD.setSelected(refDailySkilledNursesNotes
					.isSideEffectD());
			cbSideEffectE.setSelected(refDailySkilledNursesNotes
					.isSideEffectE());
			cbMDOrdersN.setSelected(refDailySkilledNursesNotes.isMDOrdersN());
			cbTranslusionD.setSelected(refDailySkilledNursesNotes
					.isTranslusionD());
			cbTranslusionE.setSelected(refDailySkilledNursesNotes
					.isTranslusionE());
			cbTranslusionN.setSelected(refDailySkilledNursesNotes
					.isTranslusionN());
			cbCareN.setSelected(refDailySkilledNursesNotes.isCareN());
			cbCareD.setSelected(refDailySkilledNursesNotes.isCareD());
			cbCareE.setSelected(refDailySkilledNursesNotes.isCareE());
			cbInjectableMedsN.setSelected(refDailySkilledNursesNotes
					.isInjectableMedsN());
			cbInjectableMedsD.setSelected(refDailySkilledNursesNotes
					.isInjectableMedsD());
			cbInjectableMedsE.setSelected(refDailySkilledNursesNotes
					.isInjectableMedsE());
			cbCareTeachN.setSelected(refDailySkilledNursesNotes.isCareTeachN());
			cbCareTeachD.setSelected(refDailySkilledNursesNotes.isCareTeachD());
			cbCareTeachE.setSelected(refDailySkilledNursesNotes.isCareTeachE());
			cbDietTeachingN.setSelected(refDailySkilledNursesNotes
					.isDietTeachingN());
			cbDietTeachingD.setSelected(refDailySkilledNursesNotes
					.isDietTeachingD());
			cbDietTeachingE.setSelected(refDailySkilledNursesNotes
					.isDietTeachingE());
			cbBowelBladderTrainingN.setSelected(refDailySkilledNursesNotes
					.isBowelBladderTrainingN());
			cbBowelBladderTrainingD.setSelected(refDailySkilledNursesNotes
					.isBowelBladderTrainingD());
			cbBowelBladderTrainingE.setSelected(refDailySkilledNursesNotes
					.isBowelBladderTrainingE());
			cbSitesN.setSelected(refDailySkilledNursesNotes.isSitesN());
			cbSitesD.setSelected(refDailySkilledNursesNotes.isSitesD());
			cbSitesE.setSelected(refDailySkilledNursesNotes.isSitesE());
			cbObserveSsxInfectionN.setSelected(refDailySkilledNursesNotes
					.isObserveSsxInfectionN());
			cbPressureUlcerCareD.setSelected(refDailySkilledNursesNotes
					.isPressureUlcerCareD());
			cbPressureUlcerCareE.setSelected(refDailySkilledNursesNotes
					.isPressureUlcerCareE());
			cbPressureUlcerCareN.setSelected(refDailySkilledNursesNotes
					.isPressureUlcerCareN());
			cbTracheostomyCareN.setSelected(refDailySkilledNursesNotes
					.isTracheostomyCareN());
			cbTracheostomyCareD.setSelected(refDailySkilledNursesNotes
					.isTracheostomyCareD());
			cbTracheostomyCareE.setSelected(refDailySkilledNursesNotes
					.isTracheostomyCareE());
			cbPainSuctiongN.setSelected(refDailySkilledNursesNotes
					.isPainSuctiongN());
			cbPainSuctiongD.setSelected(refDailySkilledNursesNotes
					.isPainSuctiongD());
			cbPainSuctiongE.setSelected(refDailySkilledNursesNotes
					.isPainSuctiongE());
			cbMedicationN.setSelected(refDailySkilledNursesNotes
					.isMedicationN());
			cbMedicationD.setSelected(refDailySkilledNursesNotes
					.isMedicationD());
			cbMedicationE.setSelected(refDailySkilledNursesNotes
					.isMedicationE());
			cbFeedingHydrationN.setSelected(refDailySkilledNursesNotes
					.isFeedingHydrationN());
			cbFeedingHydrationD.setSelected(refDailySkilledNursesNotes
					.isFeedingHydrationD());
			cbFeedingHydrationE.setSelected(refDailySkilledNursesNotes
					.isFeedingHydrationE());
			cbIntramuscularInjectionsN.setSelected(refDailySkilledNursesNotes
					.isIntramuscularInjectionsN());
			cbTubeFeedingN.setSelected(refDailySkilledNursesNotes
					.isTubeFeedingN());
			cbTubeFeedingD.setSelected(refDailySkilledNursesNotes
					.isTubeFeedingD());
			cbTubeFeedingE.setSelected(refDailySkilledNursesNotes
					.isTubeFeedingE());
			cbPainManagementN.setSelected(refDailySkilledNursesNotes
					.isPainManagementN());
			cbPainManagementD.setSelected(refDailySkilledNursesNotes
					.isPainManagementD());
			cbPainManagementE.setSelected(refDailySkilledNursesNotes
					.isPainManagementE());
			cbWoundCareDressingN.setSelected(refDailySkilledNursesNotes
					.isWoundCareDressingN());
			cbStatisUlcersN.setSelected(refDailySkilledNursesNotes
					.isStatisUlcersN());
			cbSedimentD.setSelected(refDailySkilledNursesNotes.isSedimentD());
			cbDischargeD.setSelected(refDailySkilledNursesNotes.isDischargeD());
		}

	}

	public boolean doValidate() {

		return true;
	}

	public int doSave() {
		DailySkilledNursesNotes refDailySkilledNursesNotes = new DailySkilledNursesNotes();
		refDailySkilledNursesNotes
				.setSerial(Global.currentDailySkilledNursesNotesKey);

		refDailySkilledNursesNotes
				.setIntramuscularInjectionsE(cbIntramuscularInjectionsE
						.isSelected());
		refDailySkilledNursesNotes
				.setIntramuscularInjectionsD(cbIntramuscularInjectionsD
						.isSelected());
		refDailySkilledNursesNotes.setStatisUlcersE(cbStatisUlcersE
				.isSelected());
		refDailySkilledNursesNotes.setStatisUlcersD(cbStatisUlcersD
				.isSelected());
		refDailySkilledNursesNotes.setWoundCareDressingE(cbWoundCareDressingE
				.isSelected());
		refDailySkilledNursesNotes.setWoundCareDressingD(cbWoundCareDressingD
				.isSelected());
		refDailySkilledNursesNotes
				.setObserveSsxInfectionE(cbObserveSsxInfectionE.isSelected());
		refDailySkilledNursesNotes
				.setObserveSsxInfectionD(cbObserveSsxInfectionD.isSelected());
		refDailySkilledNursesNotes.setMDOrdersE(cbMDOrdersE.isSelected());
		refDailySkilledNursesNotes.setMDOrdersD(cbMDOrdersD.isSelected());
		refDailySkilledNursesNotes.setAlertN(cbAlertN.isSelected());
		refDailySkilledNursesNotes.setAppetiteGoodE(cbAppetiteGoodE
				.isSelected());
		refDailySkilledNursesNotes.setAppetiteGoodD(cbAppetiteGoodD
				.isSelected());
		refDailySkilledNursesNotes.setAppetiteGoodN(cbAppetiteGoodN
				.isSelected());
		refDailySkilledNursesNotes.setAppetiteFairE(cbAppetiteFairE
				.isSelected());
		refDailySkilledNursesNotes.setAppetiteFairD(cbAppetiteFairD
				.isSelected());
		refDailySkilledNursesNotes.setAppetiteFairN(cbAppetiteFairN
				.isSelected());
		refDailySkilledNursesNotes.setAppetitePoorN(cbAppetitePoorN
				.isSelected());
		refDailySkilledNursesNotes.setAppetiteE(cbAppetiteE.isSelected());
		refDailySkilledNursesNotes.setAppetiteD(cbAppetiteD.isSelected());
		refDailySkilledNursesNotes.setAppetiteN(cbAppetiteN.isSelected());
		refDailySkilledNursesNotes.setOrthoticsE(cbOrthoticsE.isSelected());
		refDailySkilledNursesNotes.setOrthoticsD(cbOrthoticsD.isSelected());
		refDailySkilledNursesNotes.setOrthoticsN(cbOrthoticsN.isSelected());
		refDailySkilledNursesNotes.setBracesE(cbBracesE.isSelected());
		refDailySkilledNursesNotes.setBracesD(cbBracesD.isSelected());
		refDailySkilledNursesNotes.setBracesN(cbBracesN.isSelected());
		refDailySkilledNursesNotes.setRespiratoryN(cbRespiratoryN.isSelected());
		refDailySkilledNursesNotes
				.setNursingRehabilitationE(cbNursingRehabilitationE
						.isSelected());
		refDailySkilledNursesNotes
				.setNursingRehabilitationD(cbNursingRehabilitationD
						.isSelected());
		refDailySkilledNursesNotes
				.setNursingRehabilitationN(cbNursingRehabilitationN
						.isSelected());
		refDailySkilledNursesNotes.setTherapyN(cbTherapyN.isSelected());
		refDailySkilledNursesNotes.setRespiratoryE(cbRespiratoryE.isSelected());
		refDailySkilledNursesNotes.setRespiratoryD(cbRespiratoryD.isSelected());
		refDailySkilledNursesNotes.setTherapyE(cbTherapyE.isSelected());
		refDailySkilledNursesNotes.setTherapyD(cbTherapyD.isSelected());
		refDailySkilledNursesNotes.setAppetitePoorE(cbAppetitePoorE
				.isSelected());
		refDailySkilledNursesNotes.setAppetitePoorD(cbAppetitePoorD
				.isSelected());
		refDailySkilledNursesNotes.setChillsE(cbChillsE.isSelected());
		refDailySkilledNursesNotes.setChillsD(cbChillsD.isSelected());
		refDailySkilledNursesNotes.setChillsN(cbChillsN.isSelected());
		refDailySkilledNursesNotes.setCyanosisN(cbCyanosisN.isSelected());
		refDailySkilledNursesNotes.setCyanosisE(cbCyanosisE.isSelected());
		refDailySkilledNursesNotes.setCyanosisD(cbCyanosisD.isSelected());
		refDailySkilledNursesNotes.setSkinWnlE(cbSkinWnlE.isSelected());
		refDailySkilledNursesNotes.setSkinWnlD(cbSkinWnlD.isSelected());
		refDailySkilledNursesNotes.setSkinWnlN(cbSkinWnlN.isSelected());
		refDailySkilledNursesNotes.setAbnormalTurgorE(cbAbnormalTurgorE
				.isSelected());
		refDailySkilledNursesNotes.setAbnormalTurgorD(cbAbnormalTurgorD
				.isSelected());
		refDailySkilledNursesNotes.setAbnormalTurgorN(cbAbnormalTurgorN
				.isSelected());
		refDailySkilledNursesNotes.setRashItchingN(cbRashItchingN.isSelected());
		refDailySkilledNursesNotes.setRashItchingE(cbRashItchingE.isSelected());
		refDailySkilledNursesNotes.setRashItchingD(cbRashItchingD.isSelected());
		refDailySkilledNursesNotes.setFlushingSkinE(cbFlushingSkinE
				.isSelected());
		refDailySkilledNursesNotes.setFlushingSkinD(cbFlushingSkinD
				.isSelected());
		refDailySkilledNursesNotes.setFlushingSkinN(cbFlushingSkinN
				.isSelected());
		refDailySkilledNursesNotes.setClammyE(cbClammyE.isSelected());
		refDailySkilledNursesNotes.setClammyD(cbClammyD.isSelected());
		refDailySkilledNursesNotes.setClammyN(cbClammyN.isSelected());
		refDailySkilledNursesNotes.setPallorE(cbPallorE.isSelected());
		refDailySkilledNursesNotes.setPallorD(cbPallorD.isSelected());
		refDailySkilledNursesNotes.setPallorN(cbPallorN.isSelected());
		refDailySkilledNursesNotes.setJaundicedN(cbJaundicedN.isSelected());
		refDailySkilledNursesNotes.setJaundicedE(cbJaundicedE.isSelected());
		refDailySkilledNursesNotes.setJaundicedD(cbJaundicedD.isSelected());
		refDailySkilledNursesNotes.setGuWnlE(cbGuWnlE.isSelected());
		refDailySkilledNursesNotes.setGuWnlD(cbGuWnlD.isSelected());
		refDailySkilledNursesNotes.setGuWnlN(cbGuWnlN.isSelected());
		refDailySkilledNursesNotes.setDischargeE(cbDischargeE.isSelected());
		refDailySkilledNursesNotes.setDischargeN(cbDischargeN.isSelected());
		refDailySkilledNursesNotes.setOdorE(cbOdorE.isSelected());
		refDailySkilledNursesNotes.setOdorD(cbOdorD.isSelected());
		refDailySkilledNursesNotes.setOdorN(cbOdorN.isSelected());
		refDailySkilledNursesNotes.setSedimentE(cbSedimentE.isSelected());
		refDailySkilledNursesNotes.setSedimentN(cbSedimentN.isSelected());
		refDailySkilledNursesNotes.setDiscolouredE(cbDiscolouredE.isSelected());
		refDailySkilledNursesNotes.setDiscolouredD(cbDiscolouredD.isSelected());
		refDailySkilledNursesNotes.setDiscolouredN(cbDiscolouredN.isSelected());
		refDailySkilledNursesNotes.setCathelerE(cbCathelerE.isSelected());
		refDailySkilledNursesNotes.setCathelerD(cbCathelerD.isSelected());
		refDailySkilledNursesNotes.setCathelerN(cbCathelerN.isSelected());
		refDailySkilledNursesNotes.setHematuriaE(cbHematuriaE.isSelected());
		refDailySkilledNursesNotes.setHematuriaD(cbHematuriaD.isSelected());
		refDailySkilledNursesNotes.setHematuriaN(cbHematuriaN.isSelected());
		refDailySkilledNursesNotes.setFrequencyUrgencyD(cbFrequencyUrgencyD
				.isSelected());
		refDailySkilledNursesNotes.setFrequencyUrgencyE(cbFrequencyUrgencyE
				.isSelected());
		refDailySkilledNursesNotes.setFrequencyUrgencyN(cbFrequencyUrgencyN
				.isSelected());
		refDailySkilledNursesNotes
				.setDistentionRetentionE(cbDistentionRetentionE.isSelected());
		refDailySkilledNursesNotes
				.setDistentionRetentionD(cbDistentionRetentionD.isSelected());
		refDailySkilledNursesNotes
				.setDistentionRetentionN(cbDistentionRetentionN.isSelected());
		refDailySkilledNursesNotes.setBurningE(cbBurningE.isSelected());
		refDailySkilledNursesNotes.setBurningD(cbBurningD.isSelected());
		refDailySkilledNursesNotes.setBurningN(cbBurningN.isSelected());
		refDailySkilledNursesNotes.setESignature(txtESignature.getText());
		refDailySkilledNursesNotes.setDSignature(txtDSignature.getText());
		refDailySkilledNursesNotes.setNsignature(txtNsignature.getText());
		refDailySkilledNursesNotes.setSignatureTitle5(txtSignatureTitle5
				.getText());
		refDailySkilledNursesNotes.setSignatureTitle4(txtSignatureTitle4
				.getText());
		refDailySkilledNursesNotes.setSignatureTitle3(txtSignatureTitle3
				.getText());
		refDailySkilledNursesNotes.setSignatureTitle2(txtSignatureTitle2
				.getText());
		refDailySkilledNursesNotes.setSignatureTitle1(txtSignatureTitle1
				.getText());
		refDailySkilledNursesNotes.setComment5(txtComment5.getText());
		refDailySkilledNursesNotes.setComment4(txtComment4.getText());
		refDailySkilledNursesNotes.setComment3(txtComment3.getText());
		refDailySkilledNursesNotes.setComment2(txtComment2.getText());
		refDailySkilledNursesNotes.setComment1(txtComment1.getText());
		refDailySkilledNursesNotes.setDateTime5(txtDateTime5.getText());
		refDailySkilledNursesNotes.setDateTime4(txtDateTime4.getText());
		refDailySkilledNursesNotes.setDateTime3(txtDateTime3.getText());
		refDailySkilledNursesNotes.setDateTime2(txtDateTime2.getText());
		refDailySkilledNursesNotes.setDateTime1(txtDateTime1.getText());
		// refDailySkilledNursesNotes.setRoomBed(txtRoomBed.getText());
		// refDailySkilledNursesNotes.setAttendingPhysician(txtAttendingPhysician.getText());
		// refDailySkilledNursesNotes.setMiddleName(txtMiddleName.getText());
		// refDailySkilledNursesNotes.setFirstName(txtFirstName.getText());
		// refDailySkilledNursesNotes.setLastName(txtLastName.getText());
		refDailySkilledNursesNotes.setDate(txtDate.getText());
		refDailySkilledNursesNotes.setTemprature(txtTemprature.getText());
		refDailySkilledNursesNotes.setPulse(txtPulse.getText());
		refDailySkilledNursesNotes.setRespiration(txtRespiration.getText());
		refDailySkilledNursesNotes.setBloodPressure(txtBloodPressure.getText());
		refDailySkilledNursesNotes.setAlertD(cbAlertD.isSelected());
		refDailySkilledNursesNotes.setAlertE(cbAlertE.isSelected());
		refDailySkilledNursesNotes.setOrientedToN(cbOrientedToN.isSelected());
		refDailySkilledNursesNotes.setOrientedToD(cbOrientedToD.isSelected());
		refDailySkilledNursesNotes.setOrientedToE(cbOrientedToE.isSelected());
		refDailySkilledNursesNotes.setPersonN(cbPersonN.isSelected());
		refDailySkilledNursesNotes.setPersonD(cbPersonD.isSelected());
		refDailySkilledNursesNotes.setPersonE(cbPersonE.isSelected());
		refDailySkilledNursesNotes.setPlaceN(cbPlaceN.isSelected());
		refDailySkilledNursesNotes.setPlaceD(cbPlaceD.isSelected());
		refDailySkilledNursesNotes.setPlaceE(cbPlaceE.isSelected());
		refDailySkilledNursesNotes.setTimeN(cbTimeN.isSelected());
		refDailySkilledNursesNotes.setTimeD(cbTimeD.isSelected());
		refDailySkilledNursesNotes.setTimeE(cbTimeE.isSelected());
		refDailySkilledNursesNotes.setAnxiousAgitatedN(cbAnxiousAgitatedN
				.isSelected());
		refDailySkilledNursesNotes.setAnxiousAgitatedD(cbAnxiousAgitatedD
				.isSelected());
		refDailySkilledNursesNotes.setAnxiousAgitatedE(cbAnxiousAgitatedE
				.isSelected());
		refDailySkilledNursesNotes.setRestlessLethargicN(cbRestlessLethargicN
				.isSelected());
		refDailySkilledNursesNotes.setRestlessLethargicD(cbRestlessLethargicD
				.isSelected());
		refDailySkilledNursesNotes.setRestlessLethargicE(cbRestlessLethargicE
				.isSelected());
		refDailySkilledNursesNotes.setAbnormalSleepN(cbAbnormalSleepN
				.isSelected());
		refDailySkilledNursesNotes.setAbnormalSleepD(cbAbnormalSleepD
				.isSelected());
		refDailySkilledNursesNotes.setAbnormalSleepE(cbAbnormalSleepE
				.isSelected());
		refDailySkilledNursesNotes.setForgetfulConfusedN(cbForgetfulConfusedN
				.isSelected());
		refDailySkilledNursesNotes.setForgetfulConfusedD(cbForgetfulConfusedD
				.isSelected());
		refDailySkilledNursesNotes.setForgetfulConfusedE(cbForgetfulConfusedE
				.isSelected());
		refDailySkilledNursesNotes
				.setHallucinationDelusionN(cbHallucinationDelusionN
						.isSelected());
		refDailySkilledNursesNotes
				.setHallucinationDelusionD(cbHallucinationDelusionD
						.isSelected());
		refDailySkilledNursesNotes
				.setHallucinationDelusionE(cbHallucinationDelusionE
						.isSelected());
		refDailySkilledNursesNotes.setRegularRhythmN(cbRegularRhythmN
				.isSelected());
		refDailySkilledNursesNotes.setRegularRhythmD(cbRegularRhythmD
				.isSelected());
		refDailySkilledNursesNotes.setRegularRhythmE(cbRegularRhythmE
				.isSelected());
		refDailySkilledNursesNotes
				.setRadialApicalIrregularN(cbRadialApicalIrregularN
						.isSelected());
		refDailySkilledNursesNotes
				.setRadialApicalIrregularD(cbRadialApicalIrregularD
						.isSelected());
		refDailySkilledNursesNotes
				.setRadialApicalIrregularE(cbRadialApicalIrregularE
						.isSelected());
		refDailySkilledNursesNotes.setChestPainN(cbChestPainN.isSelected());
		refDailySkilledNursesNotes.setChestPainD(cbChestPainD.isSelected());
		refDailySkilledNursesNotes.setChestPainE(cbChestPainE.isSelected());
		refDailySkilledNursesNotes.setPedalLtRtN(cbPedalLtRtN.isSelected());
		refDailySkilledNursesNotes.setPedalLtRtD(cbPedalLtRtD.isSelected());
		refDailySkilledNursesNotes.setPedalLtRtE(cbPedalLtRtE.isSelected());
		refDailySkilledNursesNotes.setPitting1N(cbPitting1N.isSelected());
		refDailySkilledNursesNotes.setPitting1D(cbPitting1D.isSelected());
		refDailySkilledNursesNotes.setPitting1E(cbPitting1E.isSelected());
		refDailySkilledNursesNotes.setPitting2N(cbPitting2N.isSelected());
		refDailySkilledNursesNotes.setPitting2D(cbPitting2D.isSelected());
		refDailySkilledNursesNotes.setPitting2E(cbPitting2E.isSelected());
		refDailySkilledNursesNotes.setPitting3N(cbPitting3N.isSelected());
		refDailySkilledNursesNotes.setPitting3D(cbPitting3D.isSelected());
		refDailySkilledNursesNotes.setPitting3E(cbPitting3E.isSelected());
		refDailySkilledNursesNotes.setPitting4N(cbPitting4N.isSelected());
		refDailySkilledNursesNotes.setPitting4D(cbPitting4D.isSelected());
		refDailySkilledNursesNotes.setPitting4E(cbPitting4E.isSelected());
		refDailySkilledNursesNotes
				.setAbnormalPeriheralPulsesN(cbAbnormalPeriheralPulsesN
						.isSelected());
		refDailySkilledNursesNotes
				.setAbnormalPeriheralPulsesD(cbAbnormalPeriheralPulsesD
						.isSelected());
		refDailySkilledNursesNotes
				.setAbnormalPeriheralPulsesE(cbAbnormalPeriheralPulsesE
						.isSelected());
		refDailySkilledNursesNotes.setCardiovascularWnlN(cbCardiovascularWnlN
				.isSelected());
		refDailySkilledNursesNotes.setCardiovascularWnlD(cbCardiovascularWnlD
				.isSelected());
		refDailySkilledNursesNotes.setCardiovascularWnlE(cbCardiovascularWnlE
				.isSelected());
		refDailySkilledNursesNotes.setNauseaVomittingN(cbNauseaVomittingN
				.isSelected());
		refDailySkilledNursesNotes.setNauseaVomittingD(cbNauseaVomittingD
				.isSelected());
		refDailySkilledNursesNotes.setNauseaVomittingE(cbNauseaVomittingE
				.isSelected());
		refDailySkilledNursesNotes.setEpigasticDistressN(cbEpigasticDistressN
				.isSelected());
		refDailySkilledNursesNotes.setEpigasticDistressD(cbEpigasticDistressD
				.isSelected());
		refDailySkilledNursesNotes.setEpigasticDistressE(cbEpigasticDistressE
				.isSelected());
		refDailySkilledNursesNotes
				.setDifficaultySwallowingN(cbDifficaultySwallowingN
						.isSelected());
		refDailySkilledNursesNotes
				.setDifficaultySwallowingD(cbDifficaultySwallowingD
						.isSelected());
		refDailySkilledNursesNotes
				.setDifficaultySwallowingE(cbDifficaultySwallowingE
						.isSelected());
		refDailySkilledNursesNotes.setAbdominalDistentonN(cbAbdominalDistentonN
				.isSelected());
		refDailySkilledNursesNotes.setAbdominalDistentonD(cbAbdominalDistentonD
				.isSelected());
		refDailySkilledNursesNotes.setAbdominalDistentonE(cbAbdominalDistentonE
				.isSelected());
		refDailySkilledNursesNotes.setDiarrheaN(cbDiarrheaN.isSelected());
		refDailySkilledNursesNotes.setDiarrheaD(cbDiarrheaD.isSelected());
		refDailySkilledNursesNotes.setDiarrheaE(cbDiarrheaE.isSelected());
		refDailySkilledNursesNotes.setConstipationN(cbConstipationN
				.isSelected());
		refDailySkilledNursesNotes.setConstipationD(cbConstipationD
				.isSelected());
		refDailySkilledNursesNotes.setConstipationE(cbConstipationE
				.isSelected());
		refDailySkilledNursesNotes.setBowelSoundsN(cbBowelSoundsN.isSelected());
		refDailySkilledNursesNotes.setBowelSoundsD(cbBowelSoundsD.isSelected());
		refDailySkilledNursesNotes.setBowelSoundsE(cbBowelSoundsE.isSelected());
		refDailySkilledNursesNotes.setPresentN(cbPresentN.isSelected());
		refDailySkilledNursesNotes.setPresentD(cbPresentD.isSelected());
		refDailySkilledNursesNotes.setPresentE(cbPresentE.isSelected());
		refDailySkilledNursesNotes.setAbsentN(cbAbsentN.isSelected());
		refDailySkilledNursesNotes.setAbsentD(cbAbsentD.isSelected());
		refDailySkilledNursesNotes.setAbsentE(cbAbsentE.isSelected());
		refDailySkilledNursesNotes.setHyperActiveN(cbHyperActiveN.isSelected());
		refDailySkilledNursesNotes.setHyperActiveD(cbHyperActiveD.isSelected());
		refDailySkilledNursesNotes.setHyperActiveE(cbHyperActiveE.isSelected());
		refDailySkilledNursesNotes.setHypoActiveN(cbHypoActiveN.isSelected());
		refDailySkilledNursesNotes.setHypoActiveD(cbHypoActiveD.isSelected());
		refDailySkilledNursesNotes.setHypoActiveE(cbHypoActiveE.isSelected());
		refDailySkilledNursesNotes
				.setBalanceGaitUnsteadyN(cbBalanceGaitUnsteadyN.isSelected());
		refDailySkilledNursesNotes
				.setBalanceGaitUnsteadyD(cbBalanceGaitUnsteadyD.isSelected());
		refDailySkilledNursesNotes
				.setBalanceGaitUnsteadyE(cbBalanceGaitUnsteadyE.isSelected());
		refDailySkilledNursesNotes.setParalysisN(cbParalysisN.isSelected());
		refDailySkilledNursesNotes.setParalysisD(cbParalysisD.isSelected());
		refDailySkilledNursesNotes.setParalysisE(cbParalysisE.isSelected());
		refDailySkilledNursesNotes.setMusculoSkeketalWnlN(cbMusculoSkeketalWnlN
				.isSelected());
		refDailySkilledNursesNotes.setMusculoSkeketalWnlD(cbMusculoSkeketalWnlD
				.isSelected());
		refDailySkilledNursesNotes.setMusculoSkeketalWnlE(cbMusculoSkeketalWnlE
				.isSelected());
		refDailySkilledNursesNotes.setSynCopeN(cbSynCopeN.isSelected());
		refDailySkilledNursesNotes.setSynCopeD(cbSynCopeD.isSelected());
		refDailySkilledNursesNotes.setSynCopeE(cbSynCopeE.isSelected());
		refDailySkilledNursesNotes.setHeadAcheN(cbHeadAcheN.isSelected());
		refDailySkilledNursesNotes.setHeadAcheD(cbHeadAcheD.isSelected());
		refDailySkilledNursesNotes.setHeadAcheE(cbHeadAcheE.isSelected());
		refDailySkilledNursesNotes.setDecreasedGraspE(cbDecreasedGraspE
				.isSelected());
		refDailySkilledNursesNotes.setNervousSystemRtN(cbNervousSystemRtN
				.isSelected());
		refDailySkilledNursesNotes.setNervousSystemRtD(cbNervousSystemRtD
				.isSelected());
		refDailySkilledNursesNotes.setNervousSystemRtE(cbNervousSystemRtE
				.isSelected());
		refDailySkilledNursesNotes.setNervousSystemLtN(cbNervousSystemLtN
				.isSelected());
		refDailySkilledNursesNotes.setNervousSystemLtD(cbNervousSystemLtD
				.isSelected());
		refDailySkilledNursesNotes.setNervousSystemLtE(cbNervousSystemLtE
				.isSelected());
		refDailySkilledNursesNotes.setDecresedMovementE(cbDecresedMovementE
				.isSelected());
		refDailySkilledNursesNotes.setRueLueN(cbRueLueN.isSelected());
		refDailySkilledNursesNotes.setRueLueD(cbRueLueD.isSelected());
		refDailySkilledNursesNotes.setRueLueE(cbRueLueE.isSelected());
		refDailySkilledNursesNotes.setRleLLeN(cbRleLLeN.isSelected());
		refDailySkilledNursesNotes.setRleLLeD(cbRleLLeD.isSelected());
		refDailySkilledNursesNotes.setRleLLeE(cbRleLLeE.isSelected());
		refDailySkilledNursesNotes
				.setAbnormalPupilReactionE(cbAbnormalPupilReactionE
						.isSelected());
		refDailySkilledNursesNotes
				.setAbnormalReactionRightN(cbAbnormalReactionRightN
						.isSelected());
		refDailySkilledNursesNotes
				.setAbnormalReactionRightD(cbAbnormalReactionRightD
						.isSelected());
		refDailySkilledNursesNotes
				.setAbnormalReactionRightE(cbAbnormalReactionRightE
						.isSelected());
		refDailySkilledNursesNotes
				.setAbnormalReactionLeftN(cbAbnormalReactionLeftN.isSelected());
		refDailySkilledNursesNotes
				.setAbnormalReactionLeftD(cbAbnormalReactionLeftD.isSelected());
		refDailySkilledNursesNotes
				.setAbnormalReactionLeftE(cbAbnormalReactionLeftE.isSelected());
		refDailySkilledNursesNotes.setTremorsN(cbTremorsN.isSelected());
		refDailySkilledNursesNotes.setTremorsD(cbTremorsD.isSelected());
		refDailySkilledNursesNotes.setTremorsE(cbTremorsE.isSelected());
		refDailySkilledNursesNotes.setVertigoN(cbVertigoN.isSelected());
		refDailySkilledNursesNotes.setVertigoD(cbVertigoD.isSelected());
		refDailySkilledNursesNotes.setVertigoE(cbVertigoE.isSelected());
		refDailySkilledNursesNotes.setNervousSystemWnlN(cbNervousSystemWnlN
				.isSelected());
		refDailySkilledNursesNotes.setNervousSystemWnlD(cbNervousSystemWnlD
				.isSelected());
		refDailySkilledNursesNotes.setNervousSystemWnlE(cbNervousSystemWnlE
				.isSelected());
		refDailySkilledNursesNotes.setLeboredBreathingD(cbLeboredBreathingD
				.isSelected());
		refDailySkilledNursesNotes.setLeboredBreathingE(cbLeboredBreathingE
				.isSelected());
		refDailySkilledNursesNotes.setLeboredBreathingN(cbLeboredBreathingN
				.isSelected());
		refDailySkilledNursesNotes.setShallowRespirationN(cbShallowRespirationN
				.isSelected());
		refDailySkilledNursesNotes.setShallowRespirationD(cbShallowRespirationD
				.isSelected());
		refDailySkilledNursesNotes.setShallowRespirationE(cbShallowRespirationE
				.isSelected());
		refDailySkilledNursesNotes.setRatesRhonchiN(cbRatesRhonchiN
				.isSelected());
		refDailySkilledNursesNotes.setRatesRhonchiD(cbRatesRhonchiD
				.isSelected());
		refDailySkilledNursesNotes.setRatesRhonchiE(cbRatesRhonchiE
				.isSelected());
		refDailySkilledNursesNotes.setWheezingN(cbWheezingN.isSelected());
		refDailySkilledNursesNotes.setWheezingD(cbWheezingD.isSelected());
		refDailySkilledNursesNotes.setWheezingE(cbWheezingE.isSelected());
		refDailySkilledNursesNotes.setCoughN(cbCoughN.isSelected());
		refDailySkilledNursesNotes.setCoughD(cbCoughD.isSelected());
		refDailySkilledNursesNotes.setCoughE(cbCoughE.isSelected());
		refDailySkilledNursesNotes.setDyspneaSobN(cbDyspneaSobN.isSelected());
		refDailySkilledNursesNotes.setDyspneaSobD(cbDyspneaSobD.isSelected());
		refDailySkilledNursesNotes.setDyspneaSobE(cbDyspneaSobE.isSelected());
		refDailySkilledNursesNotes.setQ2LpmN(cbQ2LpmN.isSelected());
		refDailySkilledNursesNotes.setQ2LpmD(cbQ2LpmD.isSelected());
		refDailySkilledNursesNotes.setQ2LpmE(cbQ2LpmE.isSelected());
		refDailySkilledNursesNotes.setPrnN(cbPrnN.isSelected());
		refDailySkilledNursesNotes.setPrnD(cbPrnD.isSelected());
		refDailySkilledNursesNotes.setPrnE(cbPrnE.isSelected());
		refDailySkilledNursesNotes.setContinousN(cbContinousN.isSelected());
		refDailySkilledNursesNotes.setContinousD(cbContinousD.isSelected());
		refDailySkilledNursesNotes.setContinousE(cbContinousE.isSelected());
		refDailySkilledNursesNotes.setS2O2N(cbS2O2N.isSelected());
		refDailySkilledNursesNotes.setS2O2D(cbS2O2D.isSelected());
		refDailySkilledNursesNotes.setS2O2E(cbS2O2E.isSelected());
		refDailySkilledNursesNotes.setSuctioningN(cbSuctioningN.isSelected());
		refDailySkilledNursesNotes.setSuctioningD(cbSuctioningD.isSelected());
		refDailySkilledNursesNotes.setSuctioningE(cbSuctioningE.isSelected());
		refDailySkilledNursesNotes.setTrachCareN(cbTrachCareN.isSelected());
		refDailySkilledNursesNotes.setTrachCareD(cbTrachCareD.isSelected());
		refDailySkilledNursesNotes.setTrachCareE(cbTrachCareE.isSelected());
		refDailySkilledNursesNotes.setVentCareN(cbVentCareN.isSelected());
		refDailySkilledNursesNotes.setVentCareD(cbVentCareD.isSelected());
		refDailySkilledNursesNotes.setVentCareE(cbVentCareE.isSelected());
		refDailySkilledNursesNotes.setLungsClearN(cbLungsClearN.isSelected());
		refDailySkilledNursesNotes.setRespiratoryWnlN(cbRespiratoryWnlN
				.isSelected());
		refDailySkilledNursesNotes.setLungsClearD(cbLungsClearD.isSelected());
		refDailySkilledNursesNotes.setLungsClearE(cbLungsClearE.isSelected());
		refDailySkilledNursesNotes.setRespiratoryWnlE(cbRespiratoryWnlE
				.isSelected());
		refDailySkilledNursesNotes.setRespiratoryWnlD(cbRespiratoryWnlD
				.isSelected());
		refDailySkilledNursesNotes.setOriginN(cbOriginN.isSelected());
		refDailySkilledNursesNotes.setOriginD(cbOriginD.isSelected());
		refDailySkilledNursesNotes.setOriginE(cbOriginE.isSelected());
		refDailySkilledNursesNotes.setLocationN(cbLocationN.isSelected());
		refDailySkilledNursesNotes.setLocationD(cbLocationD.isSelected());
		refDailySkilledNursesNotes.setLocationE(cbLocationE.isSelected());
		refDailySkilledNursesNotes.setIntensityN(cbIntensityN.isSelected());
		refDailySkilledNursesNotes.setIntensityD(cbIntensityD.isSelected());
		refDailySkilledNursesNotes.setIntensityE(cbIntensityE.isSelected());
		refDailySkilledNursesNotes.setNoneN(cbNoneN.isSelected());
		refDailySkilledNursesNotes.setNoneD(cbNoneD.isSelected());
		refDailySkilledNursesNotes.setNoneE(cbNoneE.isSelected());
		refDailySkilledNursesNotes.setMDNotifiedE(cbMDNotifiedE.isSelected());
		refDailySkilledNursesNotes.setMDNotifiedN(cbMDNotifiedN.isSelected());
		refDailySkilledNursesNotes
				.setSkilledObservationAssessmentN(cbSkilledObservationAssessmentN
						.isSelected());
		refDailySkilledNursesNotes
				.setSkilledObservationAssessmentD(cbSkilledObservationAssessmentD
						.isSelected());
		refDailySkilledNursesNotes
				.setSkilledObservationAssessmentE(cbSkilledObservationAssessmentE
						.isSelected());
		refDailySkilledNursesNotes.setDiabeticManagementN(cbDiabeticManagementN
				.isSelected());
		refDailySkilledNursesNotes.setDiabeticManagementD(cbDiabeticManagementD
				.isSelected());
		refDailySkilledNursesNotes.setDiabeticManagementE(cbDiabeticManagementE
				.isSelected());
		refDailySkilledNursesNotes.setGlucometerReadingN(cbGlucometerReadingN
				.isSelected());
		refDailySkilledNursesNotes.setGlucometerReadingD(cbGlucometerReadingD
				.isSelected());
		refDailySkilledNursesNotes.setGlucometerReadingE(cbGlucometerReadingE
				.isSelected());
		refDailySkilledNursesNotes.setDehaydrationN(cbDehaydrationN
				.isSelected());
		refDailySkilledNursesNotes.setDehaydrationD(cbDehaydrationD
				.isSelected());
		refDailySkilledNursesNotes.setDehaydrationE(cbDehaydrationE
				.isSelected());
		refDailySkilledNursesNotes.setManagementTeachingN(cbManagementTeachingN
				.isSelected());
		refDailySkilledNursesNotes.setManagementTeachingD(cbManagementTeachingD
				.isSelected());
		refDailySkilledNursesNotes.setManagementTeachingE(cbManagementTeachingE
				.isSelected());
		refDailySkilledNursesNotes.setDialysisManagementN(cbDialysisManagementN
				.isSelected());
		refDailySkilledNursesNotes.setDialysisManagementD(cbDialysisManagementD
				.isSelected());
		refDailySkilledNursesNotes.setDialysisManagementE(cbDialysisManagementE
				.isSelected());
		refDailySkilledNursesNotes.setSideEffectN(cbSideEffectN.isSelected());
		refDailySkilledNursesNotes.setSideEffectD(cbSideEffectD.isSelected());
		refDailySkilledNursesNotes.setSideEffectE(cbSideEffectE.isSelected());
		refDailySkilledNursesNotes.setMDOrdersN(cbMDOrdersN.isSelected());
		refDailySkilledNursesNotes.setTranslusionD(cbTranslusionD.isSelected());
		refDailySkilledNursesNotes.setTranslusionE(cbTranslusionE.isSelected());
		refDailySkilledNursesNotes.setTranslusionN(cbTranslusionN.isSelected());
		refDailySkilledNursesNotes.setCareN(cbCareN.isSelected());
		refDailySkilledNursesNotes.setCareD(cbCareD.isSelected());
		refDailySkilledNursesNotes.setCareE(cbCareE.isSelected());
		refDailySkilledNursesNotes.setInjectableMedsN(cbInjectableMedsN
				.isSelected());
		refDailySkilledNursesNotes.setInjectableMedsD(cbInjectableMedsD
				.isSelected());
		refDailySkilledNursesNotes.setInjectableMedsE(cbInjectableMedsE
				.isSelected());
		refDailySkilledNursesNotes.setCareTeachN(cbCareTeachN.isSelected());
		refDailySkilledNursesNotes.setCareTeachD(cbCareTeachD.isSelected());
		refDailySkilledNursesNotes.setCareTeachE(cbCareTeachE.isSelected());
		refDailySkilledNursesNotes.setDietTeachingN(cbDietTeachingN
				.isSelected());
		refDailySkilledNursesNotes.setDietTeachingD(cbDietTeachingD
				.isSelected());
		refDailySkilledNursesNotes.setDietTeachingE(cbDietTeachingE
				.isSelected());
		refDailySkilledNursesNotes
				.setBowelBladderTrainingN(cbBowelBladderTrainingN.isSelected());
		refDailySkilledNursesNotes
				.setBowelBladderTrainingD(cbBowelBladderTrainingD.isSelected());
		refDailySkilledNursesNotes
				.setBowelBladderTrainingE(cbBowelBladderTrainingE.isSelected());
		refDailySkilledNursesNotes.setSitesN(cbSitesN.isSelected());
		refDailySkilledNursesNotes.setSitesD(cbSitesD.isSelected());
		refDailySkilledNursesNotes.setSitesE(cbSitesE.isSelected());
		refDailySkilledNursesNotes
				.setObserveSsxInfectionN(cbObserveSsxInfectionN.isSelected());
		refDailySkilledNursesNotes.setPressureUlcerCareD(cbPressureUlcerCareD
				.isSelected());
		refDailySkilledNursesNotes.setPressureUlcerCareE(cbPressureUlcerCareE
				.isSelected());
		refDailySkilledNursesNotes.setPressureUlcerCareN(cbPressureUlcerCareN
				.isSelected());
		refDailySkilledNursesNotes.setTracheostomyCareN(cbTracheostomyCareN
				.isSelected());
		refDailySkilledNursesNotes.setTracheostomyCareD(cbTracheostomyCareD
				.isSelected());
		refDailySkilledNursesNotes.setTracheostomyCareE(cbTracheostomyCareE
				.isSelected());
		refDailySkilledNursesNotes.setPainSuctiongN(cbPainSuctiongN
				.isSelected());
		refDailySkilledNursesNotes.setPainSuctiongD(cbPainSuctiongD
				.isSelected());
		refDailySkilledNursesNotes.setPainSuctiongE(cbPainSuctiongE
				.isSelected());
		refDailySkilledNursesNotes.setMedicationN(cbMedicationN.isSelected());
		refDailySkilledNursesNotes.setMedicationD(cbMedicationD.isSelected());
		refDailySkilledNursesNotes.setMedicationE(cbMedicationE.isSelected());
		refDailySkilledNursesNotes.setFeedingHydrationN(cbFeedingHydrationN
				.isSelected());
		refDailySkilledNursesNotes.setFeedingHydrationD(cbFeedingHydrationD
				.isSelected());
		refDailySkilledNursesNotes.setFeedingHydrationE(cbFeedingHydrationE
				.isSelected());
		refDailySkilledNursesNotes
				.setIntramuscularInjectionsN(cbIntramuscularInjectionsN
						.isSelected());
		refDailySkilledNursesNotes.setTubeFeedingN(cbTubeFeedingN.isSelected());
		refDailySkilledNursesNotes.setTubeFeedingD(cbTubeFeedingD.isSelected());
		refDailySkilledNursesNotes.setTubeFeedingE(cbTubeFeedingE.isSelected());
		refDailySkilledNursesNotes.setPainManagementN(cbPainManagementN
				.isSelected());
		refDailySkilledNursesNotes.setPainManagementD(cbPainManagementD
				.isSelected());
		refDailySkilledNursesNotes.setPainManagementE(cbPainManagementE
				.isSelected());
		refDailySkilledNursesNotes.setWoundCareDressingN(cbWoundCareDressingN
				.isSelected());
		refDailySkilledNursesNotes.setStatisUlcersN(cbStatisUlcersN
				.isSelected());
		refDailySkilledNursesNotes.setSedimentD(cbSedimentD.isSelected());
		refDailySkilledNursesNotes.setDischargeD(cbDischargeD.isSelected());

		try {
			Global.currentDailySkilledNursesNotesKey = MedrexClientManager
					.getInstance().insertOrUpdateDailySkilledNursesNotes(
							refDailySkilledNursesNotes);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
