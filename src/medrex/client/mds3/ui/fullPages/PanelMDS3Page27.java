package medrex.client.mds3.ui.fullPages;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.commons.enums.ColorConstants;

public class PanelMDS3Page27 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3014203943092134778L;

	public PanelMDS3Page27() {
		super();

		setLayout(null);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(840, 1170));

		final JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 840, 25);
		panel_2.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel_2.setLayout(null);
		panel_2.setPreferredSize(new Dimension(840, 25));
		add(panel_2);

		final JPanel panel_3 = new JPanel();
		panel_3.setBackground(ColorConstants.MDS_FONT_COLOR);
		final FlowLayout flowLayout_1 = new FlowLayout();
		flowLayout_1.setVgap(2);
		flowLayout_1.setHgap(10);
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_3.setLayout(flowLayout_1);
		panel_3.setBounds(3, 3, 231, 18);
		panel_2.add(panel_3);

		final JLabel sectionALabel = new JLabel();
		sectionALabel.setForeground(Color.WHITE);
		sectionALabel.setFont(new Font("Arial", Font.BOLD, 16));
		sectionALabel.setText("Section O");
		panel_3.add(sectionALabel);

		final JPanel panel_4 = new JPanel();
		panel_4.setBackground(ColorConstants.MDS_BACK_COLOR);
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setVgap(2);
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_4.setLayout(flowLayout);
		panel_4.setBounds(246, 2, 592, 22);
		panel_2.add(panel_4);

		final JLabel identificationInformationLabel = new JLabel();
		identificationInformationLabel
				.setForeground(ColorConstants.MDS_FONT_COLOR);
		identificationInformationLabel
				.setFont(new Font("Arial", Font.BOLD, 16));
		identificationInformationLabel
				.setHorizontalAlignment(SwingConstants.LEFT);
		identificationInformationLabel
				.setText("Special Treatments, Procedures, and programs");
		panel_4.add(identificationInformationLabel);

		final JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 31, 840, 604);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1.setLayout(null);
		panel_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_1.setBounds(0, 0, 840, 45);
		panel.add(panel_1);

		final JLabel o0100SpecialTreatmentsLabel = new JLabel();
		o0100SpecialTreatmentsLabel.setFont(new Font("Arial", Font.BOLD, 12));
		o0100SpecialTreatmentsLabel
				.setText("O0100. Special Treatments, Procedures, and Programs");
		o0100SpecialTreatmentsLabel.setBounds(10, 7, 347, 14);
		panel_1.add(o0100SpecialTreatmentsLabel);

		final JLabel checkAllLabel = new JLabel();
		checkAllLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		checkAllLabel
				.setText("<html><body> Check all of the following treatments, procedures, and programs that were performed during the last <b> 14 days </b>");
		checkAllLabel.setBounds(10, 27, 618, 14);
		panel_1.add(checkAllLabel);

		final JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBounds(0, 44, 840, 111);
		panel.add(panel_5);

		final JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setBackground(Color.WHITE);
		panel_6.setLayout(null);
		panel_6.setBounds(0, 0, 641, 111);
		panel_5.add(panel_6);

		final JLabel label = new JLabel();
		label.setFont(new Font("Arial", Font.BOLD, 12));
		label.setText("1.   While NOT a Resident");
		label.setBounds(10, 10, 228, 14);
		panel_6.add(label);

		final JLabel performedLabel = new JLabel();
		performedLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		performedLabel
				.setText("<html><body> performed <b> while NOT a resident </b> of this facility and within the <b> last 14days. </b> Only check column 1 if <br> resident entered (admission or reentry) IN THE LAST 14 DAYS. If resident last entered 14 or more days <br> ago, leave column 1 blank");
		performedLabel.setBounds(27, 26, 564, 42);
		panel_6.add(performedLabel);

		final JLabel label_1 = new JLabel();
		label_1.setFont(new Font("Arial", Font.PLAIN, 12));
		label_1
				.setText("<html><body><b> 2. &nbsp While a resident </b> <br> &nbsp &nbsp &nbsp Performed <b> while a resident </b> ot this facility and within the <b> last 14 days</b>");
		label_1.setBounds(10, 76, 394, 32);
		panel_6.add(label_1);

		final JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_10.setLayout(null);
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(640, 86, 200, 25);
		panel_5.add(panel_10);

		final JLabel checkAllThatLabel = new JLabel();
		checkAllThatLabel.setFont(new Font("Arial", Font.BOLD, 12));
		checkAllThatLabel.setText("Check all that apply");
		checkAllThatLabel.setBounds(42, 4, 127, 14);
		panel_10.add(checkAllThatLabel);

		final JPanel panel_7 = new JPanel();
		panel_7.setBounds(640, 0, 200, 87);
		panel_5.add(panel_7);
		panel_7.setBackground(Color.WHITE);
		panel_7.setLayout(null);

		final JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_8.setBounds(0, 0, 100, 87);
		panel_7.add(panel_8);
		panel_8.setLayout(null);
		panel_8.setBackground(ColorConstants.MDS_BACK_COLOR);

		final JLabel nbspnbsp1Label = new JLabel();
		nbspnbsp1Label.setFont(new Font("Arial", Font.PLAIN, 12));
		nbspnbsp1Label
				.setText("<html><body>&nbsp &nbsp &nbsp &nbsp &nbsp<b> 1. <br> While NOT a</b> <br> &nbsp <b> Resident </b>");
		nbspnbsp1Label.setBounds(13, 20, 70, 54);
		panel_8.add(nbspnbsp1Label);

		final JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_9.setBounds(99, 0, 101, 87);
		panel_7.add(panel_9);
		panel_9.setLayout(null);
		panel_9.setBackground(ColorConstants.MDS_BACK_COLOR);

		final JLabel nbspnbspLabel = new JLabel();
		nbspnbspLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		nbspnbspLabel
				.setText("<html><body> &nbsp &nbsp &nbsp <b> 2. </b><br>  &nbsp <b> While a <br> Resident </b>");
		nbspnbspLabel.setBounds(20, 20, 66, 57);
		panel_9.add(nbspnbspLabel);

		final JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBackground(Color.WHITE);
		panel_11.setBounds(0, 155, 840, 70);
		panel.add(panel_11);

		final JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_12.setLayout(null);
		panel_12.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_12.setBounds(0, 0, 840, 21);
		panel_11.add(panel_12);

		final JLabel cancerTreatmentsLabel = new JLabel();
		cancerTreatmentsLabel.setFont(new Font("Arial", Font.BOLD, 12));
		cancerTreatmentsLabel.setText("Cancer Treatments");
		cancerTreatmentsLabel.setBounds(10, 4, 288, 14);
		panel_12.add(cancerTreatmentsLabel);

		final JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_13.setLayout(null);
		panel_13.setBackground(Color.WHITE);
		panel_13.setBounds(0, 20, 641, 25);
		panel_11.add(panel_13);

		final JLabel aChemotherapyLabel = new JLabel();
		aChemotherapyLabel.setFont(new Font("Arial", Font.BOLD, 12));
		aChemotherapyLabel.setText("A.  Chemotherapy");
		aChemotherapyLabel.setBounds(10, 7, 187, 14);
		panel_13.add(aChemotherapyLabel);

		final JPanel panel_14 = new JPanel();
		panel_14.setBackground(Color.WHITE);
		panel_14.setLayout(null);
		panel_14.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_14.setBounds(0, 44, 641, 26);
		panel_11.add(panel_14);

		final JLabel bRadiationLabel = new JLabel();
		bRadiationLabel.setFont(new Font("Arial", Font.BOLD, 12));
		bRadiationLabel.setText("B.  Radiation");
		bRadiationLabel.setBounds(10, 7, 146, 14);
		panel_14.add(bRadiationLabel);

		final JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_15.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_15.setLayout(null);
		panel_15.setBounds(640, 20, 100, 50);
		panel_11.add(panel_15);

		final JCheckBox checkBox = new JCheckBox();
		checkBox.setBackground(Color.WHITE);
		checkBox.setText("New JCheckBox");
		checkBox.setBounds(40, 5, 17, 17);
		panel_15.add(checkBox);

		final JCheckBox checkBox_1 = new JCheckBox();
		checkBox_1.setBackground(Color.WHITE);
		checkBox_1.setText("New JCheckBox");
		checkBox_1.setBounds(40, 28, 17, 17);
		panel_15.add(checkBox_1);

		final JPanel panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_16.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_16.setLayout(null);
		panel_16.setBounds(739, 20, 101, 50);
		panel_11.add(panel_16);

		final JCheckBox checkBox_2 = new JCheckBox();
		checkBox_2.setBackground(Color.WHITE);
		checkBox_2.setText("New JCheckBox");
		checkBox_2.setBounds(40, 5, 17, 17);
		panel_16.add(checkBox_2);

		final JCheckBox checkBox_3 = new JCheckBox();
		checkBox_3.setBackground(Color.WHITE);
		checkBox_3.setText("New JCheckBox");
		checkBox_3.setBounds(40, 28, 17, 17);
		panel_16.add(checkBox_3);

		final JPanel panel_17 = new JPanel();
		panel_17.setBackground(Color.WHITE);
		panel_17.setLayout(null);
		panel_17.setBounds(0, 224, 840, 145);
		panel.add(panel_17);

		final JPanel panel_18 = new JPanel();
		panel_18.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_18.setLayout(null);
		panel_18.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_18.setBounds(0, 0, 840, 21);
		panel_17.add(panel_18);

		final JLabel respiratoryTreatmentsLabel = new JLabel();
		respiratoryTreatmentsLabel.setFont(new Font("Arial", Font.BOLD, 12));
		respiratoryTreatmentsLabel.setText("Respiratory Treatments");
		respiratoryTreatmentsLabel.setBounds(10, 4, 271, 14);
		panel_18.add(respiratoryTreatmentsLabel);

		final JPanel panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_19.setBackground(Color.WHITE);
		panel_19.setLayout(null);
		panel_19.setBounds(0, 20, 641, 26);
		panel_17.add(panel_19);

		final JLabel cOxygenTherapyLabel = new JLabel();
		cOxygenTherapyLabel.setFont(new Font("Arial", Font.BOLD, 12));
		cOxygenTherapyLabel.setText("C.  Oxygen therapy");
		cOxygenTherapyLabel.setBounds(10, 7, 193, 14);
		panel_19.add(cOxygenTherapyLabel);

		final JPanel panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_20.setLayout(null);
		panel_20.setBackground(Color.WHITE);
		panel_20.setBounds(0, 45, 641, 26);
		panel_17.add(panel_20);

		final JLabel dSuctioningLabel = new JLabel();
		dSuctioningLabel.setFont(new Font("Arial", Font.BOLD, 12));
		dSuctioningLabel.setText("D.  Suctioning");
		dSuctioningLabel.setBounds(10, 7, 158, 14);
		panel_20.add(dSuctioningLabel);

		final JPanel panel_21 = new JPanel();
		panel_21.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_21.setLayout(null);
		panel_21.setBackground(Color.WHITE);
		panel_21.setBounds(0, 70, 641, 26);
		panel_17.add(panel_21);

		final JLabel eTracheostomyCareLabel = new JLabel();
		eTracheostomyCareLabel.setFont(new Font("Arial", Font.BOLD, 12));
		eTracheostomyCareLabel.setText("E.  Tracheostomy care");
		eTracheostomyCareLabel.setBounds(10, 7, 246, 14);
		panel_21.add(eTracheostomyCareLabel);

		final JPanel panel_22 = new JPanel();
		panel_22.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_22.setLayout(null);
		panel_22.setBackground(Color.WHITE);
		panel_22.setBounds(0, 95, 641, 26);
		panel_17.add(panel_22);

		final JLabel fVentilatorOrLabel = new JLabel();
		fVentilatorOrLabel.setFont(new Font("Arial", Font.BOLD, 12));
		fVentilatorOrLabel.setText("F.  Ventilator or respirator");
		fVentilatorOrLabel.setBounds(10, 7, 214, 14);
		panel_22.add(fVentilatorOrLabel);

		final JPanel panel_23 = new JPanel();
		panel_23.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_23.setLayout(null);
		panel_23.setBackground(Color.WHITE);
		panel_23.setBounds(0, 120, 641, 25);
		panel_17.add(panel_23);

		final JLabel gBipapcpapLabel = new JLabel();
		gBipapcpapLabel.setFont(new Font("Arial", Font.BOLD, 12));
		gBipapcpapLabel.setText("G. BiPAP/CPAP");
		gBipapcpapLabel.setBounds(10, 7, 232, 14);
		panel_23.add(gBipapcpapLabel);

		final JPanel panel_24 = new JPanel();
		panel_24.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_24.setLayout(null);
		panel_24.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_24.setBounds(640, 20, 101, 125);
		panel_17.add(panel_24);

		final JCheckBox checkBox_4 = new JCheckBox();
		checkBox_4.setBackground(Color.WHITE);
		checkBox_4.setText("New JCheckBox");
		checkBox_4.setBounds(40, 5, 17, 17);
		panel_24.add(checkBox_4);

		final JCheckBox checkBox_6 = new JCheckBox();
		checkBox_6.setBackground(Color.WHITE);
		checkBox_6.setText("New JCheckBox");
		checkBox_6.setBounds(40, 28, 17, 17);
		panel_24.add(checkBox_6);

		final JCheckBox checkBox_7 = new JCheckBox();
		checkBox_7.setBackground(Color.WHITE);
		checkBox_7.setText("New JCheckBox");
		checkBox_7.setBounds(40, 54, 17, 17);
		panel_24.add(checkBox_7);

		final JCheckBox checkBox_8 = new JCheckBox();
		checkBox_8.setBackground(Color.WHITE);
		checkBox_8.setText("New JCheckBox");
		checkBox_8.setBounds(40, 77, 17, 17);
		panel_24.add(checkBox_8);

		final JCheckBox checkBox_9 = new JCheckBox();
		checkBox_9.setBackground(Color.WHITE);
		checkBox_9.setText("New JCheckBox");
		checkBox_9.setBounds(40, 102, 17, 17);
		panel_24.add(checkBox_9);

		final JPanel panel_25 = new JPanel();
		panel_25.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_25.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_25.setLayout(null);
		panel_25.setBounds(740, 20, 100, 125);
		panel_17.add(panel_25);

		final JCheckBox checkBox_5 = new JCheckBox();
		checkBox_5.setBackground(Color.WHITE);
		checkBox_5.setText("New JCheckBox");
		checkBox_5.setBounds(40, 5, 17, 17);
		panel_25.add(checkBox_5);

		final JCheckBox checkBox_10 = new JCheckBox();
		checkBox_10.setBackground(Color.WHITE);
		checkBox_10.setText("New JCheckBox");
		checkBox_10.setBounds(40, 28, 17, 17);
		panel_25.add(checkBox_10);

		final JCheckBox checkBox_11 = new JCheckBox();
		checkBox_11.setBackground(Color.WHITE);
		checkBox_11.setText("New JCheckBox");
		checkBox_11.setBounds(40, 54, 17, 17);
		panel_25.add(checkBox_11);

		final JCheckBox checkBox_12 = new JCheckBox();
		checkBox_12.setBackground(Color.WHITE);
		checkBox_12.setText("New JCheckBox");
		checkBox_12.setBounds(40, 77, 17, 17);
		panel_25.add(checkBox_12);

		final JCheckBox checkBox_13 = new JCheckBox();
		checkBox_13.setBackground(Color.WHITE);
		checkBox_13.setText("New JCheckBox");
		checkBox_13.setBounds(40, 102, 17, 17);
		panel_25.add(checkBox_13);

		final JPanel panel_26 = new JPanel();
		panel_26.setLayout(null);
		panel_26.setBounds(0, 369, 840, 190);
		panel.add(panel_26);
		panel_26.setBackground(Color.WHITE);

		final JPanel panel_27 = new JPanel();
		panel_27.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_27.setLayout(null);
		panel_27.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_27.setBounds(0, 0, 840, 21);
		panel_26.add(panel_27);

		final JLabel otherLabel = new JLabel();
		otherLabel.setFont(new Font("Arial", Font.BOLD, 12));
		otherLabel.setText("Other");
		otherLabel.setBounds(10, 4, 54, 14);
		panel_27.add(otherLabel);

		final JPanel panel_28 = new JPanel();
		panel_28.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_28.setLayout(null);
		panel_28.setBackground(Color.WHITE);
		panel_28.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_28.setBounds(0, 20, 641, 26);
		panel_26.add(panel_28);

		final JLabel hIvMedicationLabel = new JLabel();
		hIvMedicationLabel.setFont(new Font("Arial", Font.BOLD, 12));
		hIvMedicationLabel.setText("H.  IV medication");
		hIvMedicationLabel.setBounds(10, 7, 183, 14);
		panel_28.add(hIvMedicationLabel);

		final JPanel panel_29 = new JPanel();
		panel_29.setBackground(Color.WHITE);
		panel_29.setLayout(null);
		panel_29.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_29.setBounds(0, 45, 641, 26);
		panel_26.add(panel_29);

		final JLabel iTransfusionsLabel = new JLabel();
		iTransfusionsLabel.setFont(new Font("Arial", Font.BOLD, 12));
		iTransfusionsLabel.setText("I.  Transfusions");
		iTransfusionsLabel.setBounds(10, 7, 260, 14);
		panel_29.add(iTransfusionsLabel);

		final JPanel panel_30 = new JPanel();
		panel_30.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_30.setLayout(null);
		panel_30.setBackground(Color.WHITE);
		panel_30.setBounds(0, 70, 641, 26);
		panel_26.add(panel_30);

		final JLabel jDialysisLabel = new JLabel();
		jDialysisLabel.setFont(new Font("Arial", Font.BOLD, 12));
		jDialysisLabel.setText("J.  Dialysis");
		jDialysisLabel.setBounds(10, 7, 261, 14);
		panel_30.add(jDialysisLabel);

		final JPanel panel_31 = new JPanel();
		panel_31.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_31.setLayout(null);
		panel_31.setBackground(Color.WHITE);
		panel_31.setBounds(0, 95, 641, 26);
		panel_26.add(panel_31);

		final JLabel kHospiceCareLabel = new JLabel();
		kHospiceCareLabel.setFont(new Font("Arial", Font.BOLD, 12));
		kHospiceCareLabel.setText("K.  Hospice care");
		kHospiceCareLabel.setBounds(10, 7, 231, 14);
		panel_31.add(kHospiceCareLabel);

		final JPanel panel_32 = new JPanel();
		panel_32.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_32.setLayout(null);
		panel_32.setBackground(Color.WHITE);
		panel_32.setBounds(0, 120, 641, 26);
		panel_26.add(panel_32);

		final JLabel lRespiteCareLabel = new JLabel();
		lRespiteCareLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lRespiteCareLabel.setText("L.  Respite care");
		lRespiteCareLabel.setBounds(10, 7, 192, 14);
		panel_32.add(lRespiteCareLabel);

		final JPanel panel_33 = new JPanel();
		panel_33.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_33.setLayout(null);
		panel_33.setBackground(Color.WHITE);
		panel_33.setBounds(0, 145, 641, 45);
		panel_26.add(panel_33);

		final JLabel mIsolationLabel = new JLabel();
		mIsolationLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		mIsolationLabel
				.setText("<html><body><b> M. Isolation or quarantine for active infection disease </b> (does not include standard body/ fluid <br> &nbsp &nbsp &nbsp precautions )");
		mIsolationLabel.setBounds(10, 7, 533, 38);
		panel_33.add(mIsolationLabel);

		final JPanel panel_34 = new JPanel();
		panel_34.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_34.setLayout(null);
		panel_34.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_34.setBounds(640, 20, 101, 170);
		panel_26.add(panel_34);

		final JCheckBox checkBox_14 = new JCheckBox();
		checkBox_14.setBackground(Color.WHITE);
		checkBox_14.setText("New JCheckBox");
		checkBox_14.setBounds(40, 5, 17, 17);
		panel_34.add(checkBox_14);

		final JCheckBox checkBox_15 = new JCheckBox();
		checkBox_15.setBackground(Color.WHITE);
		checkBox_15.setText("New JCheckBox");
		checkBox_15.setBounds(40, 28, 17, 17);
		panel_34.add(checkBox_15);

		final JCheckBox checkBox_16 = new JCheckBox();
		checkBox_16.setBackground(Color.WHITE);
		checkBox_16.setText("New JCheckBox");
		checkBox_16.setBounds(40, 54, 17, 17);
		panel_34.add(checkBox_16);

		final JCheckBox checkBox_17 = new JCheckBox();
		checkBox_17.setBackground(Color.WHITE);
		checkBox_17.setText("New JCheckBox");
		checkBox_17.setBounds(40, 77, 17, 17);
		panel_34.add(checkBox_17);

		final JCheckBox checkBox_18 = new JCheckBox();
		checkBox_18.setBackground(Color.WHITE);
		checkBox_18.setText("New JCheckBox");
		checkBox_18.setBounds(40, 140, 17, 17);
		panel_34.add(checkBox_18);

		final JPanel panel_35 = new JPanel();
		panel_35.setLayout(null);
		panel_35.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_35.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_35.setBounds(740, 20, 100, 170);
		panel_26.add(panel_35);

		final JCheckBox checkBox_19 = new JCheckBox();
		checkBox_19.setBackground(Color.WHITE);
		checkBox_19.setText("New JCheckBox");
		checkBox_19.setBounds(40, 5, 17, 17);
		panel_35.add(checkBox_19);

		final JCheckBox checkBox_20 = new JCheckBox();
		checkBox_20.setBackground(Color.WHITE);
		checkBox_20.setText("New JCheckBox");
		checkBox_20.setBounds(40, 28, 17, 17);
		panel_35.add(checkBox_20);

		final JCheckBox checkBox_21 = new JCheckBox();
		checkBox_21.setBackground(Color.WHITE);
		checkBox_21.setText("New JCheckBox");
		checkBox_21.setBounds(40, 54, 17, 17);
		panel_35.add(checkBox_21);

		final JCheckBox checkBox_22 = new JCheckBox();
		checkBox_22.setBackground(Color.WHITE);
		checkBox_22.setText("New JCheckBox");
		checkBox_22.setBounds(40, 77, 17, 17);
		panel_35.add(checkBox_22);

		final JCheckBox checkBox_23 = new JCheckBox();
		checkBox_23.setBackground(Color.WHITE);
		checkBox_23.setText("New JCheckBox");
		checkBox_23.setBounds(40, 104, 17, 17);
		panel_35.add(checkBox_23);

		final JCheckBox checkBox_24 = new JCheckBox();
		checkBox_24.setBackground(Color.WHITE);
		checkBox_24.setText("New JCheckBox");
		checkBox_24.setBounds(40, 140, 17, 17);
		panel_35.add(checkBox_24);

		final JPanel panel_36 = new JPanel();
		panel_36.setLayout(null);
		panel_36.setBackground(Color.WHITE);
		panel_36.setBounds(0, 559, 840, 45);
		panel.add(panel_36);

		final JPanel panel_37 = new JPanel();
		panel_37.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_37.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_37.setLayout(null);
		panel_37.setBounds(0, 0, 840, 21);
		panel_36.add(panel_37);

		final JLabel noneOfTheLabel = new JLabel();
		noneOfTheLabel.setFont(new Font("Arial", Font.BOLD, 12));
		noneOfTheLabel.setText("None of the Above");
		noneOfTheLabel.setBounds(10, 4, 224, 14);
		panel_37.add(noneOfTheLabel);

		final JPanel panel_38 = new JPanel();
		panel_38.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_38.setBackground(Color.WHITE);
		panel_38.setLayout(null);
		panel_38.setBounds(0, 20, 641, 25);
		panel_36.add(panel_38);

		final JLabel zNoneOfLabel = new JLabel();
		zNoneOfLabel.setFont(new Font("Arial", Font.BOLD, 12));
		zNoneOfLabel.setText("Z.  None of the above");
		zNoneOfLabel.setBounds(10, 7, 267, 14);
		panel_38.add(zNoneOfLabel);

		final JPanel panel_39 = new JPanel();
		panel_39.setLayout(null);
		panel_39.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_39.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_39.setBounds(640, 20, 101, 25);
		panel_36.add(panel_39);

		final JCheckBox checkBox_25 = new JCheckBox();
		checkBox_25.setBackground(Color.WHITE);
		checkBox_25.setText("New JCheckBox");
		checkBox_25.setBounds(40, 5, 17, 17);
		panel_39.add(checkBox_25);

		final JPanel panel_40 = new JPanel();
		panel_40.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_40.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_40.setLayout(null);
		panel_40.setBounds(740, 20, 100, 25);
		panel_36.add(panel_40);

		final JCheckBox checkBox_26 = new JCheckBox();
		checkBox_26.setBackground(Color.WHITE);
		checkBox_26.setText("New JCheckBox");
		checkBox_26.setBounds(40, 5, 17, 17);
		panel_40.add(checkBox_26);

		final JPanel panel_41 = new JPanel();
		panel_41.setBackground(Color.WHITE);
		panel_41.setLayout(null);
		panel_41.setBounds(0, 635, 840, 290);
		add(panel_41);

		final JPanel panel_42 = new JPanel();
		panel_42.setLayout(null);
		panel_42.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_42.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_42.setBounds(0, 0, 840, 31);
		panel_41.add(panel_42);

		final JLabel o0250InfluenzaVaccineLabel = new JLabel();
		o0250InfluenzaVaccineLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		o0250InfluenzaVaccineLabel
				.setText("<html><body><b>O0250. Influenza Vaccine </b> - Refer to current version of RAI manual for current flu season and reporting period ");
		o0250InfluenzaVaccineLabel.setBounds(10, 7, 670, 14);
		panel_42.add(o0250InfluenzaVaccineLabel);

		final JPanel panel_O0250A = new JPanel();
		panel_O0250A.setBackground(Color.WHITE);
		panel_O0250A.setLayout(null);
		panel_O0250A.setBounds(0, 30, 840, 60);
		panel_41.add(panel_O0250A);

		final JPanel panel_45 = new JPanel();
		panel_45.setLayout(null);
		panel_45.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_45.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_45.setBounds(0, 0, 71, 60);
		panel_O0250A.add(panel_45);

		final JLabel enterCodeLabel_1 = new JLabel();
		enterCodeLabel_1.setFont(new Font("Arial", Font.PLAIN, 11));
		enterCodeLabel_1.setText("Enter Code");
		enterCodeLabel_1.setBounds(10, 10, 54, 14);
		panel_45.add(enterCodeLabel_1);

		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1" }));
		comboBox_1.setBounds(12, 30, 43, 17);
		panel_45.add(comboBox_1);

		final JPanel panel_43 = new JPanel();
		panel_43.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_43.setBackground(Color.WHITE);
		panel_43.setLayout(null);
		panel_43.setBounds(70, 0, 770, 60);
		panel_O0250A.add(panel_43);

		final JLabel aDidLabel = new JLabel();
		aDidLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		aDidLabel
				.setText("<html><body><b>A. </b>  Did the <b> resident receive the influenza vaccine in this facility </b> for this year's Influenza season ?");
		aDidLabel.setBounds(10, 10, 554, 14);
		panel_43.add(aDidLabel);

		final JLabel label_2 = new JLabel();
		label_2.setFont(new Font("Arial", Font.PLAIN, 12));
		label_2
				.setText("<html><body>0. &nbsp<b>  No </b>  Skip to O0250C, If Influenza vaccine not received, state reason");
		label_2.setBounds(25, 28, 492, 14);
		panel_43.add(label_2);

		final JLabel label_3 = new JLabel();
		label_3.setFont(new Font("Arial", Font.PLAIN, 12));
		label_3
				.setText("<html><body> 1. &nbsp<b> Yes </b> Continue to O0250B, Date vaccine received");
		label_3.setBounds(25, 42, 390, 14);
		panel_43.add(label_3);

		final JPanel panel_O0250B = new JPanel();
		panel_O0250B.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_O0250B.setLayout(null);
		panel_O0250B.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_O0250B.setBounds(0, 89, 840, 71);
		panel_41.add(panel_O0250B);

		final JPanel panel_47 = new JPanel();
		panel_47.setBounds(70, 0, 770, 71);
		panel_O0250B.add(panel_47);
		panel_47.setForeground(Color.WHITE);
		panel_47.setBackground(Color.WHITE);
		panel_47.setLayout(null);
		panel_47.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));

		final JLabel bDateLabel = new JLabel();
		bDateLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		bDateLabel
				.setText("<html><body><b> B.  Date vaccine received  </b>  Complete date and skip to O0300A, Is the resident's Pneumococcal vaccination up to date ?");
		bDateLabel.setBounds(10, 10, 718, 14);
		panel_47.add(bDateLabel);

		final JTextField textField = new JTextField();
		textField.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		textField.setBounds(25, 30, 21, 18);
		panel_47.add(textField);

		final JLabel monthLabel = new JLabel();
		monthLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		monthLabel.setText("Month");
		monthLabel.setBounds(32, 50, 54, 14);
		panel_47.add(monthLabel);

		final JTextField textField_1 = new JTextField();
		textField_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		textField_1.setBounds(45, 30, 20, 18);
		panel_47.add(textField_1);

		final JLabel label_4 = new JLabel();
		label_4.setText("-");
		label_4.setBounds(71, 32, 54, 14);
		panel_47.add(label_4);

		final JTextField textField_2 = new JTextField();
		textField_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		textField_2.setBounds(81, 30, 20, 18);
		panel_47.add(textField_2);

		final JTextField textField_3 = new JTextField();
		textField_3.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		textField_3.setBounds(100, 30, 21, 18);
		panel_47.add(textField_3);

		final JTextField textField_4 = new JTextField();
		textField_4.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		textField_4.setBounds(141, 30, 20, 18);
		panel_47.add(textField_4);

		final JLabel label_5 = new JLabel();
		label_5.setText("-");
		label_5.setBounds(131, 32, 4, 14);
		panel_47.add(label_5);

		final JTextField textField_5 = new JTextField();
		textField_5.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		textField_5.setBounds(160, 30, 21, 18);
		panel_47.add(textField_5);

		final JTextField textField_6 = new JTextField();
		textField_6.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		textField_6.setBounds(180, 30, 21, 18);
		panel_47.add(textField_6);

		final JTextField textField_7 = new JTextField();
		textField_7.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		textField_7.setBounds(200, 30, 21, 18);
		panel_47.add(textField_7);

		final JLabel dayLabel = new JLabel();
		dayLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		dayLabel.setText("Day");
		dayLabel.setBounds(91, 50, 54, 14);
		panel_47.add(dayLabel);

		final JLabel yearLabel = new JLabel();
		yearLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		yearLabel.setText("Year");
		yearLabel.setBounds(168, 50, 54, 14);
		panel_47.add(yearLabel);

		final JPanel panel_O0250C = new JPanel();
		panel_O0250C.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_O0250C.setLayout(null);
		panel_O0250C.setBackground(Color.WHITE);
		panel_O0250C.setBounds(0, 159, 840, 131);
		panel_41.add(panel_O0250C);

		final JPanel panel_49 = new JPanel();
		panel_49.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_49.setLayout(null);
		panel_49.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_49.setBounds(0, 0, 71, 131);
		panel_O0250C.add(panel_49);

		final JLabel enterCodeLabel = new JLabel();
		enterCodeLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		enterCodeLabel.setText("Enter Code");
		enterCodeLabel.setBounds(10, 40, 67, 14);
		panel_49.add(enterCodeLabel);

		final JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "", "1", "2",
				"3", "4", "5", "6", "9" }));
		comboBox.setBounds(12, 58, 43, 17);
		panel_49.add(comboBox);

		final JPanel panel_50 = new JPanel();
		panel_50.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_50.setLayout(null);
		panel_50.setBackground(Color.WHITE);
		panel_50.setBounds(70, 0, 770, 131);
		panel_O0250C.add(panel_50);

		final JLabel cIfInfluenzaLabel = new JLabel();
		cIfInfluenzaLabel.setFont(new Font("Arial", Font.BOLD, 12));
		cIfInfluenzaLabel
				.setText("C.  If influenza vaccine not received, state reason :");
		cIfInfluenzaLabel.setBounds(10, 10, 350, 14);
		panel_50.add(cIfInfluenzaLabel);

		final JLabel label_6 = new JLabel();
		label_6.setFont(new Font("Arial", Font.PLAIN, 12));
		label_6
				.setText("<html><body>1. &nbsp <b> Resident not in facility </b> during this year's flu season");
		label_6.setBounds(25, 28, 313, 14);
		panel_50.add(label_6);

		final JLabel label_7 = new JLabel();
		label_7.setFont(new Font("Arial", Font.PLAIN, 12));
		label_7
				.setText("<html><body>2. &nbsp<b> Received outside of this facility </b>");
		label_7.setBounds(25, 42, 313, 14);
		panel_50.add(label_7);

		final JLabel label_8 = new JLabel();
		label_8.setFont(new Font("Arial", Font.PLAIN, 12));
		label_8
				.setText("<html><body>3. &nbsp <b> Not eligible </b> - medical contraindication ");
		label_8.setBounds(25, 56, 335, 14);
		panel_50.add(label_8);

		final JLabel label_9 = new JLabel();
		label_9.setText("<html><body>4. &nbsp <b> Offered and declined </b>");
		label_9.setBounds(26, 70, 138, 14);
		panel_50.add(label_9);

		final JLabel label_10 = new JLabel();
		label_10.setText("<html><body>5. &nbsp <b> Not Offered </b>");
		label_10.setBounds(26, 84, 202, 14);
		panel_50.add(label_10);

		final JLabel label_11 = new JLabel();
		label_11.setFont(new Font("Arial", Font.PLAIN, 12));
		label_11
				.setText("<html><body>6. &nbsp <b> Inability to obtain vaccine </b> due to a declared shortage");
		label_11.setBounds(25, 98, 369, 14);
		panel_50.add(label_11);

		final JLabel label_12 = new JLabel();
		label_12.setFont(new Font("Arial", Font.PLAIN, 12));
		label_12.setText("<html><body>9. &nbsp <b> None of the above </b>");
		label_12.setBounds(26, 112, 313, 14);
		panel_50.add(label_12);

		final JPanel panel_51 = new JPanel();
		panel_51.setBackground(Color.WHITE);
		panel_51.setLayout(null);
		panel_51.setBounds(0, 925, 840, 170);
		add(panel_51);

		final JPanel panel_52 = new JPanel();
		panel_52.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_52.setLayout(null);
		panel_52.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_52.setBounds(0, 0, 840, 31);
		panel_51.add(panel_52);

		final JLabel o0300PneumococcalVaccineLabel = new JLabel();
		o0300PneumococcalVaccineLabel.setFont(new Font("Arial", Font.BOLD, 12));
		o0300PneumococcalVaccineLabel.setText("O0300.  Pneumococcal Vaccine");
		o0300PneumococcalVaccineLabel.setBounds(10, 7, 357, 14);
		panel_52.add(o0300PneumococcalVaccineLabel);

		final JPanel panel_O0300A = new JPanel();
		panel_O0300A.setBackground(Color.WHITE);
		panel_O0300A.setLayout(null);
		panel_O0300A.setBounds(0, 30, 840, 60);
		panel_51.add(panel_O0300A);

		final JPanel panel_54 = new JPanel();
		panel_54.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_54.setLayout(null);
		panel_54.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_54.setBounds(0, 0, 71, 61);
		panel_O0300A.add(panel_54);

		final JLabel enterCodeLabel_2 = new JLabel();
		enterCodeLabel_2.setFont(new Font("Arial", Font.PLAIN, 11));
		enterCodeLabel_2.setText("Enter Code");
		enterCodeLabel_2.setBounds(10, 10, 54, 14);
		panel_54.add(enterCodeLabel_2);

		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1" }));
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setBounds(12, 30, 43, 17);
		panel_54.add(comboBox_2);

		final JPanel panel_55 = new JPanel();
		panel_55.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_55.setLayout(null);
		panel_55.setBackground(Color.WHITE);
		panel_55.setBounds(70, 0, 770, 61);
		panel_O0300A.add(panel_55);

		final JLabel anbspLabel = new JLabel();
		anbspLabel
				.setText("<html><body><b> A.</b> &nbsp<b>Is the resident's Pneumococcal vaccination up to date ? </b> ");
		anbspLabel.setBounds(10, 10, 382, 14);
		panel_55.add(anbspLabel);

		final JLabel label_13 = new JLabel();
		label_13.setFont(new Font("Arial", Font.PLAIN, 12));
		label_13
				.setText("<html><body>0. &nbsp <b> No </b> Continue to O0300B, if Pneumococcal vaccine not received, state reason");
		label_13.setBounds(25, 30, 483, 14);
		panel_55.add(label_13);

		final JLabel label_14 = new JLabel();
		label_14.setFont(new Font("Arial", Font.PLAIN, 12));
		label_14
				.setText("<html><body>1. &nbsp <b> Yes </b> Skip to O0400, Therapies");
		label_14.setBounds(25, 44, 329, 14);
		panel_55.add(label_14);

		final JPanel panel_O0300B = new JPanel();
		panel_O0300B.setLayout(null);
		panel_O0300B.setBackground(Color.WHITE);
		panel_O0300B.setBounds(0, 90, 840, 80);
		panel_51.add(panel_O0300B);

		final JPanel panel_57 = new JPanel();
		panel_57.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_57.setLayout(null);
		panel_57.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_57.setBounds(0, 0, 71, 80);
		panel_O0300B.add(panel_57);

		final JLabel enterCodeLabel_3 = new JLabel();
		enterCodeLabel_3.setFont(new Font("Arial", Font.PLAIN, 11));
		enterCodeLabel_3.setText("Enter Code");
		enterCodeLabel_3.setBounds(10, 22, 54, 14);
		panel_57.add(enterCodeLabel_3);

		final JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBackground(Color.WHITE);
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] { "", "1",
				"2", "3" }));
		comboBox_3.setBounds(12, 42, 43, 17);
		panel_57.add(comboBox_3);

		final JPanel panel_58 = new JPanel();
		panel_58.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_58.setLayout(null);
		panel_58.setBackground(Color.WHITE);
		panel_58.setBounds(70, 0, 770, 80);
		panel_O0300B.add(panel_58);

		final JLabel bIfLabel = new JLabel();
		bIfLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		bIfLabel
				.setText("<html><body><b> B.</b>&nbsp<b>  If pneumococcal vaccine not received, state reason : </b>");
		bIfLabel.setBounds(10, 10, 424, 14);
		panel_58.add(bIfLabel);

		final JLabel label_15 = new JLabel();
		label_15.setFont(new Font("Arial", Font.PLAIN, 12));
		label_15
				.setText("<html><body>1. &nbsp<b> Not eligible </b> - medical contraindication");
		label_15.setBounds(25, 30, 348, 14);
		panel_58.add(label_15);

		final JLabel label_16 = new JLabel();
		label_16.setText("<html><body>2. &nbsp<b> Offered and declined</b>");
		label_16.setBounds(25, 45, 306, 14);
		panel_58.add(label_16);

		final JLabel label_17 = new JLabel();
		label_17.setText("<html><body>3. &nbsp <b> Not offered</b>");
		label_17.setBounds(25, 60, 132, 14);
		panel_58.add(label_17);
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
		PanelMDS3Page27 panel = new PanelMDS3Page27();
		scroller.setViewportView(panel);
		JFrame frm = new JFrame("Frame");
		frm.setSize(new Dimension(java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize()));
		frm.add(scroller);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setState(JFrame.MAXIMIZED_BOTH);
		frm.setVisible(true);

	}
}
