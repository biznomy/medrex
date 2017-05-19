package medrex.client.main.MonthlySummary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.intf.Form;
import medrex.commons.vo.monthlySummary.InventoryPersonalEffect;

import com.toedter.calendar.JDateChooser;

public class PanelInventoryPersonalEffect extends JPanel implements Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4911050719748123999L;
	private JTextArea txtRemarks;
	private JTextField txtValuesOthers;
	private JTextField txtValuesGlasses;
	private JTextField txtValuesDentures;
	private JTextField txtValuesHearingAid;
	private JTextField txtValuesTravellingBags;
	private JTextField txtValuesShavingKit;
	private JTextField txtValuesSlippers;
	private JTextField txtValuesRobes;
	private JTextField txtValuesPajamas;
	private JTextField txtValuesMensHandkerChie;
	private JTextField txtValuesBeltSuspenders;
	private JTextField txtValuesTies;
	private JTextField txtValuesUnderShirts;
	private JTextField txtValuesShorts;
	private JTextField txtValuesSocks;
	private JTextField txtValuesMensGloves;
	private JTextField txtValuesMensShoes;
	private JTextField txtValuesMensHats;
	private JTextField txtValuesSportJackets;
	private JTextField txtValuesSlacks;
	private JTextField txtValuesTopCoats;
	private JTextField txtValuesMensSuit;
	private JTextField txtValuesOverNightCase;
	private JTextField txtValuesPocketBooks;
	private JTextField txtValuesHouseSlippers;
	private JTextField txtValuesHouseCoats;
	private JTextField txtValuesNightGowns;
	private JTextField txtValuesBrassiers;
	private JTextField txtValuesFoundationGarments;
	private JTextField txtValuesSlips;
	private JTextField txtValuesLadiesHandkerChiefs;
	private JTextField txtValuesHose;
	private JTextField txtValuesGloves;
	private JTextField txtValuesLadiesSweaters;
	private JTextField txtValuesBlouses;
	private JTextField txtValueLadiesHats;
	private JTextField txtValueLadiesShoes;
	private JTextField txtValueFirs;
	private JTextField txtValueCoats;
	private JTextField txtValueLadiesSuit;
	private JTextField txtValueDresses;
	private JTextField txtDescriptionOthers;
	private JTextField txtDescriptionGlasses;
	private JTextField txtDescriptionDentures;
	private JTextField txtDescriptionHearingAid;
	private JTextField txtDescriptionTravellingBags;
	private JTextField txtDescriptionShavingKit;
	private JTextField txtDescriptionSlippers;
	private JTextField txtDescriptionRobes;
	private JTextField txtDescriptionPajamas;
	private JTextField txtDescriptionMensHandkerChiefs;
	private JTextField txtDescriptionBeltSuspenders;
	private JTextField txtDescriptionTies;
	private JTextField txtDescriptionShorts;
	private JTextField txtHowRecieved14;
	private JTextField txtHowRecieved13;
	private JTextField txtHowRecieved12;
	private JTextField txtHowRecieved11;
	private JTextField txtHowRecieved10;
	private JTextField txtHowRecieved9;
	private JTextField txtHowRecieved8;
	private JTextField txtHowRecieved7;
	private JTextField txtHowRecieved6;
	private JTextField txtHowRecieved5;
	private JTextField txtHowRecieved4;
	private JTextField txtHowRecieved3;
	private JTextField txtHowRecieved2;
	private JTextField txtHowRecieved1;
	private JTextField txtOrginalItem14;
	private JTextField txtOrginalItem13;
	private JTextField txtOrginalItem12;
	private JTextField txtOrginalItem11;
	private JTextField txtOrginalItem10;
	private JTextField txtOrginalItem9;
	private JTextField txtOrginalItem8;
	private JTextField txtOrginalItem7;
	private JTextField txtOrginalItem6;
	private JTextField txtOrginalItem5;
	private JTextField txtOrginalItem4;
	private JTextField txtOrginalItem3;
	private JTextField txtOrginalItem2;
	private JTextField txtOrginalItem1;
	private JDateChooser dcOriginalDate14;
	private JDateChooser dcOriginalDate13;
	private JDateChooser dcOriginalDate12;
	private JDateChooser dcOriginalDate11;
	private JDateChooser dcOriginalDate10;
	private JDateChooser dcOriginalDate9;
	private JDateChooser dcOriginalDate8;
	private JDateChooser dcOriginalDate7;
	private JDateChooser dcOriginalDate6;
	private JDateChooser dcOriginalDate5;
	private JDateChooser dcOriginalDate4;
	private JDateChooser dcOriginalDate3;
	private JDateChooser dcOriginalDate2;
	private JDateChooser dcOriginalDate1;
	private JTextField txtDescriptionLadiesHandkerChiefs;
	private JTextField txtDescriptionHose;
	private JTextField txtDescriptionGloves;
	private JTextField txtDescriptionLadiesSweaters;
	private JTextField txtDescriptionBlouses;
	private JTextField txtDescriptionLadiesHats;
	private JTextField txtDescriptionLadiesShoes;
	private JTextField txtDescriptionFirs;
	private JTextField txtDescriptionCoats;
	private JTextField txtDescriptionLadiesSuit;
	private JTextField txtDescriptionDresses;
	private JDateChooser dcDischargeResponsiblePartyDate;
	private JTextField txtSignResponsiblePartyOnDischarge;
	private JTextField txtQuantityOthers;
	private JTextField txtQuantityGlasses;
	private JTextField txtQuantityDentures;
	private JTextField txtQuantityHearingAid;
	private JTextField txtQuantityTravellingBags;
	private JTextField txtQuantityShavingKit;
	private JTextField txtQuantitySlippers;
	private JTextField txtQuantityRobes;
	private JTextField txtQuantityPajamas;
	private JTextField txtQuantityMensHandkerChiefs;
	private JTextField txtQuantityBeltsSuspenders;
	private JTextField txtQuantityTies;
	private JTextField txtQuantityUnderShirts;
	private JTextField txtQuantityShort;
	private JTextField txtQuantitySocks;
	private JTextField txtQuantityMensGloves;
	private JTextField txtQuantityMensShoes;
	private JTextField txtQuantityMensHats;
	private JTextField txtQuantitySportJackets;
	private JTextField txtQuantitySlacks;
	private JTextField txtQuantityTopCoats;
	private JTextField txtQuantityMensSuit;
	private JTextField txtQuantityOvernightCase;
	private JTextField txtQuantityPocketBooks;
	private JTextField txtQuantityHouseSlippers;
	private JTextField txtQuantityHouseCoats;
	private JTextField txtQuantityNightGowns;
	private JTextField txtQuantityBrasiers;
	private JTextField txtQuantityFoundationGarments;
	private JTextField txtQuantitySlips;
	private JTextField txtQuantityLadiesHandkerChiefs;
	private JTextField txtQuantityHose;
	private JTextField txtQuantityGloves;
	private JTextField txtQuantityLadiesSweaters;
	private JTextField txtQuantityBlouses;
	private JTextField txtQuantityLadiesHats;
	private JTextField txtQuantityLadiesShoes;
	private JTextField txtQuantityFIR;
	private JTextField txtQuantityCoats;
	private JTextField txtQuantityLadiesSuit;
	private JTextField txtQuantityDresses;
	private JDateChooser dcDateOfInventory;
	private JTextField txtRoomNumber;
	private JTextField txtPatientName;
	private JDateChooser dcAdmissionTitleDate;
	private JComponent txtSignTitleOnAddmission;
	private JComponent dcDischargeTitleDate;
	private JComponent txtSignTitleOnDischarge;
	private JComponent dcAddmissionResponsiblePartyDate;
	private JTextField txtSignResponsiblePartyOnAddmission;

	public PanelInventoryPersonalEffect() {
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(1000, 1200));

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(10, 10, 939, 1155);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 940, 1155);
		panel.add(panel_1);

		final JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBackground(Color.WHITE);
		panel_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBounds(0, 64, 938, 32);
		panel_1.add(panel_2_1_1);

		final JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setBounds(0, 0, 92, 32);
		panel_2_1_1.add(panel_5);

		final JLabel qtyLabel = new JLabel();
		qtyLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		qtyLabel.setText("QTY.");
		qtyLabel.setBounds(10, 10, 54, 14);
		panel_5.add(qtyLabel);

		final JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setLayout(null);
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setBounds(91, 0, 271, 32);
		panel_2_1_1.add(panel_6);

		final JLabel articlesLabel = new JLabel();
		articlesLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		articlesLabel.setText("ARTICLES");
		articlesLabel.setBounds(70, 10, 57, 12);
		panel_6.add(articlesLabel);

		final JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setBounds(361, 0, 55, 32);
		panel_2_1_1.add(panel_7);

		final JLabel dateOfInventoryLabel_1 = new JLabel();
		dateOfInventoryLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		dateOfInventoryLabel_1.setBorder(new LineBorder(Color.black, 1, false));
		dateOfInventoryLabel_1.setBounds(414, 0, 425, 32);
		panel_2_1_1.add(dateOfInventoryLabel_1);
		dateOfInventoryLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		dateOfInventoryLabel_1.setText("DESCRIPTION");

		final JLabel valueLabel = new JLabel();
		valueLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		valueLabel.setText("VALUE");
		valueLabel.setBounds(856, 9, 54, 14);
		panel_2_1_1.add(valueLabel);

		final JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setBackground(Color.WHITE);
		panel_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_2.setLayout(null);
		panel_2_1_2.setBounds(0, 0, 938, 32);
		panel_1.add(panel_2_1_2);

		final JLabel patientNameLabel_1_1 = new JLabel();
		patientNameLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		patientNameLabel_1_1.setText("Patient Name");
		patientNameLabel_1_1.setBounds(10, 0, 144, 32);
		panel_2_1_2.add(patientNameLabel_1_1);

		final JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(Color.WHITE);
		panel_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1.setLayout(null);
		panel_4_1.setBounds(415, 0, 523, 32);
		panel_2_1_2.add(panel_4_1);

		final JLabel dateOfInventoryLabel_2 = new JLabel();
		dateOfInventoryLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		dateOfInventoryLabel_2.setText("INVENTORY OF PERSONAL EFFECTS");
		dateOfInventoryLabel_2.setBounds(10, 0, 293, 22);
		panel_4_1.add(dateOfInventoryLabel_2);

		txtPatientName = new JTextField();
		txtPatientName.setBounds(116, 7, 271, 18);
		panel_2_1_2.add(txtPatientName);

		final JPanel panel_2_1_2_1 = new JPanel();
		panel_2_1_2_1.setBackground(Color.WHITE);
		panel_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_2_1.setLayout(null);
		panel_2_1_2_1.setBounds(0, 32, 938, 32);
		panel_1.add(panel_2_1_2_1);

		final JLabel patientNameLabel_1_1_1 = new JLabel();
		patientNameLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		patientNameLabel_1_1_1.setText("Room Number");
		patientNameLabel_1_1_1.setBounds(10, 0, 137, 32);
		panel_2_1_2_1.add(patientNameLabel_1_1_1);

		final JPanel panel_4_1_2 = new JPanel();
		panel_4_1_2.setBackground(Color.WHITE);
		panel_4_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1_2.setLayout(null);
		panel_4_1_2.setBounds(415, 0, 523, 32);
		panel_2_1_2_1.add(panel_4_1_2);

		final JLabel dateOfInventoryLabel_2_2 = new JLabel();
		dateOfInventoryLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		dateOfInventoryLabel_2_2.setText("DATE OF INVENTORY");
		dateOfInventoryLabel_2_2.setBounds(10, 0, 293, 22);
		panel_4_1_2.add(dateOfInventoryLabel_2_2);

		dcDateOfInventory = new JDateChooser();
		dcDateOfInventory.setBackground(Color.WHITE);
		dcDateOfInventory.setBorder(new LineBorder(Color.black, 1, false));
		dcDateOfInventory.setBounds(330, 5, 169, 20);
		panel_4_1_2.add(dcDateOfInventory);

		txtRoomNumber = new JTextField();
		txtRoomNumber.setBounds(116, 7, 271, 18);
		panel_2_1_2_1.add(txtRoomNumber);

		final JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setBounds(0, 96, 938, 18);
		panel_1.add(panel_2);

		final JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setBounds(0, 0, 92, 18);
		panel_2.add(panel_3);

		txtQuantityDresses = new JTextField();
		txtQuantityDresses.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityDresses.setBounds(0, 0, 92, 18);
		panel_3.add(txtQuantityDresses);

		final JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setBounds(91, 0, 271, 18);
		panel_2.add(panel_4);

		final JLabel dressesLabel_1 = new JLabel();
		dressesLabel_1.setBounds(31, 2, 217, 14);
		dressesLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		dressesLabel_1.setText("DRESSES");
		panel_4.add(dressesLabel_1);

		final JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setBounds(361, 0, 55, 18);
		panel_2.add(panel_8);

		final JTextField textField_13_9 = new JTextField();
		textField_13_9.setFocusable(false);
		textField_13_9.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_9.setBounds(-1, 0, 56, 18);
		panel_8.add(textField_13_9);

		txtDescriptionDresses = new JTextField();
		txtDescriptionDresses.setBorder(new LineBorder(Color.black, 1, false));
		txtDescriptionDresses.setBounds(414, 0, 425, 18);
		panel_2.add(txtDescriptionDresses);

		txtValueDresses = new JTextField();
		txtValueDresses.setBorder(new LineBorder(Color.black, 1, false));
		txtValueDresses.setBounds(838, 0, 100, 18);
		panel_2.add(txtValueDresses);

		final JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(0, 114, 938, 18);
		panel_1.add(panel_2_1);

		final JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1.setBounds(0, 0, 92, 18);
		panel_2_1.add(panel_3_1);

		txtQuantityLadiesSuit = new JTextField();
		txtQuantityLadiesSuit.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityLadiesSuit.setBounds(0, 0, 92, 18);
		panel_3_1.add(txtQuantityLadiesSuit);

		final JPanel panel_4_2 = new JPanel();
		panel_4_2.setBackground(Color.WHITE);
		panel_4_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_2.setLayout(null);
		panel_4_2.setBounds(91, 0, 271, 18);
		panel_2_1.add(panel_4_2);

		final JLabel dressesLabel_1_1 = new JLabel();
		dressesLabel_1_1.setText("LADIES SUITS");
		dressesLabel_1_1.setBounds(31, 2, 217, 14);
		panel_4_2.add(dressesLabel_1_1);

		final JPanel panel_8_1 = new JPanel();
		panel_8_1.setLayout(null);
		panel_8_1.setBackground(Color.WHITE);
		panel_8_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1.setBounds(361, 0, 55, 18);
		panel_2_1.add(panel_8_1);

		final JTextField textField_13_10 = new JTextField();
		textField_13_10.setFocusable(false);
		textField_13_10.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_10.setBounds(0, 0, 55, 18);
		panel_8_1.add(textField_13_10);

		txtDescriptionLadiesSuit = new JTextField();
		txtDescriptionLadiesSuit
				.setBorder(new LineBorder(Color.black, 1, false));
		txtDescriptionLadiesSuit.setBounds(414, 0, 425, 18);
		panel_2_1.add(txtDescriptionLadiesSuit);

		txtValueLadiesSuit = new JTextField();
		txtValueLadiesSuit.setBorder(new LineBorder(Color.black, 1, false));
		txtValueLadiesSuit.setBounds(838, 0, 100, 18);
		panel_2_1.add(txtValueLadiesSuit);

		final JPanel panel_2_2 = new JPanel();
		panel_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_2.setLayout(null);
		panel_2_2.setBounds(0, 132, 938, 18);
		panel_1.add(panel_2_2);

		final JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBackground(Color.WHITE);
		panel_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2.setBounds(0, 0, 92, 18);
		panel_2_2.add(panel_3_2);

		txtQuantityCoats = new JTextField();
		txtQuantityCoats.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityCoats.setBounds(0, 0, 92, 18);
		panel_3_2.add(txtQuantityCoats);

		final JPanel panel_4_3 = new JPanel();
		panel_4_3.setBackground(Color.WHITE);
		panel_4_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_3.setLayout(null);
		panel_4_3.setBounds(91, 0, 271, 18);
		panel_2_2.add(panel_4_3);

		final JLabel dressesLabel_1_2 = new JLabel();
		dressesLabel_1_2.setBackground(Color.WHITE);
		dressesLabel_1_2.setText("COATS");
		dressesLabel_1_2.setBounds(31, 2, 217, 14);
		panel_4_3.add(dressesLabel_1_2);

		final JPanel panel_8_2 = new JPanel();
		panel_8_2.setLayout(null);
		panel_8_2.setBackground(Color.WHITE);
		panel_8_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2.setBounds(361, 0, 55, 18);
		panel_2_2.add(panel_8_2);

		final JTextField textField_13_11 = new JTextField();
		textField_13_11.setFocusable(false);
		textField_13_11.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11.setBounds(0, 0, 55, 18);
		panel_8_2.add(textField_13_11);

		txtDescriptionCoats = new JTextField();
		txtDescriptionCoats.setBorder(new LineBorder(Color.black, 1, false));
		txtDescriptionCoats.setBounds(414, 0, 425, 18);
		panel_2_2.add(txtDescriptionCoats);

		txtValueCoats = new JTextField();
		txtValueCoats.setBorder(new LineBorder(Color.black, 1, false));
		txtValueCoats.setBounds(838, 0, 100, 18);
		panel_2_2.add(txtValueCoats);

		final JPanel panel_2_3 = new JPanel();
		panel_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_3.setLayout(null);
		panel_2_3.setBounds(0, 150, 938, 18);
		panel_1.add(panel_2_3);

		final JPanel panel_3_3 = new JPanel();
		panel_3_3.setLayout(null);
		panel_3_3.setBackground(Color.WHITE);
		panel_3_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_3.setBounds(0, 0, 92, 18);
		panel_2_3.add(panel_3_3);

		txtQuantityFIR = new JTextField();
		txtQuantityFIR.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityFIR.setBounds(0, 0, 92, 18);
		panel_3_3.add(txtQuantityFIR);

		final JPanel panel_4_4 = new JPanel();
		panel_4_4.setBackground(Color.WHITE);
		panel_4_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_4.setLayout(null);
		panel_4_4.setBounds(91, 0, 271, 18);
		panel_2_3.add(panel_4_4);

		final JLabel dressesLabel_1_3 = new JLabel();
		dressesLabel_1_3.setText("FIRS");
		dressesLabel_1_3.setBounds(31, 2, 217, 14);
		panel_4_4.add(dressesLabel_1_3);

		final JPanel panel_8_3 = new JPanel();
		panel_8_3.setLayout(null);
		panel_8_3.setBackground(Color.WHITE);
		panel_8_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_3.setBounds(361, 0, 55, 18);
		panel_2_3.add(panel_8_3);

		final JTextField textField_13_11_1 = new JTextField();
		textField_13_11_1.setFocusable(false);
		textField_13_11_1.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_1.setBounds(0, 0, 55, 18);
		panel_8_3.add(textField_13_11_1);

		txtDescriptionFirs = new JTextField();
		txtDescriptionFirs.setBorder(new LineBorder(Color.black, 1, false));
		txtDescriptionFirs.setBounds(414, 0, 425, 18);
		panel_2_3.add(txtDescriptionFirs);

		txtValueFirs = new JTextField();
		txtValueFirs.setBorder(new LineBorder(Color.black, 1, false));
		txtValueFirs.setBounds(838, 0, 100, 18);
		panel_2_3.add(txtValueFirs);

		final JPanel panel_2_4 = new JPanel();
		panel_2_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_4.setLayout(null);
		panel_2_4.setBounds(0, 168, 938, 18);
		panel_1.add(panel_2_4);

		final JPanel panel_3_4 = new JPanel();
		panel_3_4.setLayout(null);
		panel_3_4.setBackground(Color.WHITE);
		panel_3_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_4.setBounds(0, 0, 92, 18);
		panel_2_4.add(panel_3_4);

		txtQuantityLadiesShoes = new JTextField();
		txtQuantityLadiesShoes.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityLadiesShoes.setBounds(0, 0, 92, 18);
		panel_3_4.add(txtQuantityLadiesShoes);

		final JPanel panel_4_5 = new JPanel();
		panel_4_5.setBackground(Color.WHITE);
		panel_4_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_5.setLayout(null);
		panel_4_5.setBounds(91, 0, 271, 18);
		panel_2_4.add(panel_4_5);

		final JLabel dressesLabel_1_4 = new JLabel();
		dressesLabel_1_4.setText("LADIES SHOES");
		dressesLabel_1_4.setBounds(31, 2, 217, 14);
		panel_4_5.add(dressesLabel_1_4);

		final JPanel panel_8_4 = new JPanel();
		panel_8_4.setLayout(null);
		panel_8_4.setBackground(Color.WHITE);
		panel_8_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_4.setBounds(361, 0, 55, 18);
		panel_2_4.add(panel_8_4);

		final JTextField textField_13_11_2 = new JTextField();
		textField_13_11_2.setFocusable(false);
		textField_13_11_2.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_2.setBounds(0, 0, 55, 18);
		panel_8_4.add(textField_13_11_2);

		txtDescriptionLadiesShoes = new JTextField();
		txtDescriptionLadiesShoes.setBorder(new LineBorder(Color.black, 1,
				false));
		txtDescriptionLadiesShoes.setBounds(414, 0, 425, 18);
		panel_2_4.add(txtDescriptionLadiesShoes);

		txtValueLadiesShoes = new JTextField();
		txtValueLadiesShoes.setBorder(new LineBorder(Color.black, 1, false));
		txtValueLadiesShoes.setBounds(838, 0, 100, 18);
		panel_2_4.add(txtValueLadiesShoes);

		final JPanel panel_2_5 = new JPanel();
		panel_2_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_5.setLayout(null);
		panel_2_5.setBounds(0, 186, 938, 18);
		panel_1.add(panel_2_5);

		final JPanel panel_3_5 = new JPanel();
		panel_3_5.setLayout(null);
		panel_3_5.setBackground(Color.WHITE);
		panel_3_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_5.setBounds(0, 0, 92, 18);
		panel_2_5.add(panel_3_5);

		txtQuantityLadiesHats = new JTextField();
		txtQuantityLadiesHats.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityLadiesHats.setBounds(0, 0, 92, 18);
		panel_3_5.add(txtQuantityLadiesHats);

		final JPanel panel_4_6 = new JPanel();
		panel_4_6.setBackground(Color.WHITE);
		panel_4_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_6.setLayout(null);
		panel_4_6.setBounds(91, 0, 271, 18);
		panel_2_5.add(panel_4_6);

		final JLabel dressesLabel_1_5 = new JLabel();
		dressesLabel_1_5.setText("LADIES HATS");
		dressesLabel_1_5.setBounds(31, 2, 217, 14);
		panel_4_6.add(dressesLabel_1_5);

		final JPanel panel_8_5 = new JPanel();
		panel_8_5.setLayout(null);
		panel_8_5.setBackground(Color.WHITE);
		panel_8_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_5.setBounds(361, 0, 55, 18);
		panel_2_5.add(panel_8_5);

		final JTextField textField_13_11_3 = new JTextField();
		textField_13_11_3.setFocusable(false);
		textField_13_11_3.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_3.setBounds(0, 0, 55, 18);
		panel_8_5.add(textField_13_11_3);

		txtDescriptionLadiesHats = new JTextField();
		txtDescriptionLadiesHats
				.setBorder(new LineBorder(Color.black, 1, false));
		txtDescriptionLadiesHats.setBounds(414, 0, 425, 18);
		panel_2_5.add(txtDescriptionLadiesHats);

		txtValueLadiesHats = new JTextField();
		txtValueLadiesHats.setBorder(new LineBorder(Color.black, 1, false));
		txtValueLadiesHats.setBounds(838, 0, 100, 18);
		panel_2_5.add(txtValueLadiesHats);

		final JPanel panel_2_6 = new JPanel();
		panel_2_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_6.setLayout(null);
		panel_2_6.setBounds(0, 204, 938, 18);
		panel_1.add(panel_2_6);

		final JPanel panel_3_6 = new JPanel();
		panel_3_6.setLayout(null);
		panel_3_6.setBackground(Color.WHITE);
		panel_3_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_6.setBounds(0, 0, 92, 18);
		panel_2_6.add(panel_3_6);

		txtQuantityBlouses = new JTextField();
		txtQuantityBlouses.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityBlouses.setBounds(0, 0, 92, 18);
		panel_3_6.add(txtQuantityBlouses);

		final JPanel panel_4_7 = new JPanel();
		panel_4_7.setBackground(Color.WHITE);
		panel_4_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_7.setLayout(null);
		panel_4_7.setBounds(91, 0, 271, 18);
		panel_2_6.add(panel_4_7);

		final JLabel dressesLabel_1_6 = new JLabel();
		dressesLabel_1_6.setText("BLOUSES");
		dressesLabel_1_6.setBounds(31, 2, 217, 14);
		panel_4_7.add(dressesLabel_1_6);

		final JPanel panel_8_6 = new JPanel();
		panel_8_6.setFocusable(false);
		panel_8_6.setLayout(null);
		panel_8_6.setBackground(Color.WHITE);
		panel_8_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_6.setBounds(361, 0, 55, 18);
		panel_2_6.add(panel_8_6);

		txtDescriptionBlouses = new JTextField();
		txtDescriptionBlouses.setBorder(new LineBorder(Color.black, 1, false));
		txtDescriptionBlouses.setBounds(414, 0, 425, 18);
		panel_2_6.add(txtDescriptionBlouses);

		txtValuesBlouses = new JTextField();
		txtValuesBlouses.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesBlouses.setBounds(838, 0, 100, 18);
		panel_2_6.add(txtValuesBlouses);

		final JPanel panel_2_7 = new JPanel();
		panel_2_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_7.setLayout(null);
		panel_2_7.setBounds(0, 222, 938, 18);
		panel_1.add(panel_2_7);

		final JPanel panel_3_7 = new JPanel();
		panel_3_7.setLayout(null);
		panel_3_7.setBackground(Color.WHITE);
		panel_3_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_7.setBounds(0, 0, 92, 18);
		panel_2_7.add(panel_3_7);

		txtQuantityLadiesSweaters = new JTextField();
		txtQuantityLadiesSweaters.setBorder(new LineBorder(Color.black, 1,
				false));
		txtQuantityLadiesSweaters.setBounds(0, 0, 92, 18);
		panel_3_7.add(txtQuantityLadiesSweaters);

		final JPanel panel_4_8 = new JPanel();
		panel_4_8.setBackground(Color.WHITE);
		panel_4_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_8.setLayout(null);
		panel_4_8.setBounds(91, 0, 271, 18);
		panel_2_7.add(panel_4_8);

		final JLabel dressesLabel_1_7 = new JLabel();
		dressesLabel_1_7.setText("LADIES SWEATERS");
		dressesLabel_1_7.setBounds(31, 2, 217, 14);
		panel_4_8.add(dressesLabel_1_7);

		final JPanel panel_8_7 = new JPanel();
		panel_8_7.setLayout(null);
		panel_8_7.setBackground(Color.WHITE);
		panel_8_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_7.setBounds(361, 0, 55, 18);
		panel_2_7.add(panel_8_7);

		final JTextField textField_13_11_4 = new JTextField();
		textField_13_11_4.setFocusable(false);
		textField_13_11_4.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_4.setBounds(0, 0, 55, 18);
		panel_8_7.add(textField_13_11_4);

		txtDescriptionLadiesSweaters = new JTextField();
		txtDescriptionLadiesSweaters.setBorder(new LineBorder(Color.black, 1,
				false));
		txtDescriptionLadiesSweaters.setBounds(414, 0, 425, 18);
		panel_2_7.add(txtDescriptionLadiesSweaters);

		txtValuesLadiesSweaters = new JTextField();
		txtValuesLadiesSweaters
				.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesLadiesSweaters.setBounds(838, 0, 100, 18);
		panel_2_7.add(txtValuesLadiesSweaters);

		final JPanel panel_2_8 = new JPanel();
		panel_2_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_8.setLayout(null);
		panel_2_8.setBounds(0, 240, 938, 18);
		panel_1.add(panel_2_8);

		final JPanel panel_3_8 = new JPanel();
		panel_3_8.setLayout(null);
		panel_3_8.setBackground(Color.WHITE);
		panel_3_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_8.setBounds(0, 0, 92, 18);
		panel_2_8.add(panel_3_8);

		txtQuantityGloves = new JTextField();
		txtQuantityGloves.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityGloves.setBounds(0, 0, 92, 18);
		panel_3_8.add(txtQuantityGloves);

		final JPanel panel_4_9 = new JPanel();
		panel_4_9.setBackground(Color.WHITE);
		panel_4_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_9.setLayout(null);
		panel_4_9.setBounds(91, 0, 271, 18);
		panel_2_8.add(panel_4_9);

		final JLabel dressesLabel_1_8 = new JLabel();
		dressesLabel_1_8.setText("GLOVES");
		dressesLabel_1_8.setBounds(31, 2, 217, 14);
		panel_4_9.add(dressesLabel_1_8);

		final JPanel panel_8_8 = new JPanel();
		panel_8_8.setLayout(null);
		panel_8_8.setBackground(Color.WHITE);
		panel_8_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_8.setBounds(361, 0, 55, 18);
		panel_2_8.add(panel_8_8);

		final JTextField textField_13_11_6 = new JTextField();
		textField_13_11_6.setFocusable(false);
		textField_13_11_6.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_6.setBounds(0, 0, 55, 18);
		panel_8_8.add(textField_13_11_6);

		txtDescriptionGloves = new JTextField();
		txtDescriptionGloves.setBorder(new LineBorder(Color.black, 1, false));
		txtDescriptionGloves.setBounds(414, 0, 425, 18);
		panel_2_8.add(txtDescriptionGloves);

		txtValuesGloves = new JTextField();
		txtValuesGloves.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesGloves.setBounds(838, 0, 100, 18);
		panel_2_8.add(txtValuesGloves);

		final JPanel panel_2_9 = new JPanel();
		panel_2_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_9.setLayout(null);
		panel_2_9.setBounds(0, 258, 938, 18);
		panel_1.add(panel_2_9);

		final JPanel panel_3_9 = new JPanel();
		panel_3_9.setLayout(null);
		panel_3_9.setBackground(Color.WHITE);
		panel_3_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_9.setBounds(0, 0, 92, 18);
		panel_2_9.add(panel_3_9);

		txtQuantityHose = new JTextField();
		txtQuantityHose.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityHose.setBounds(0, 0, 92, 18);
		panel_3_9.add(txtQuantityHose);

		final JPanel panel_4_10 = new JPanel();
		panel_4_10.setBackground(Color.WHITE);
		panel_4_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_10.setLayout(null);
		panel_4_10.setBounds(91, 0, 271, 18);
		panel_2_9.add(panel_4_10);

		final JLabel dressesLabel_1_9 = new JLabel();
		dressesLabel_1_9.setText("HOSE");
		dressesLabel_1_9.setBounds(31, 2, 217, 14);
		panel_4_10.add(dressesLabel_1_9);

		final JPanel panel_8_9 = new JPanel();
		panel_8_9.setLayout(null);
		panel_8_9.setBackground(Color.WHITE);
		panel_8_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_9.setBounds(361, 0, 55, 18);
		panel_2_9.add(panel_8_9);

		final JTextField textField_13_11_5 = new JTextField();
		textField_13_11_5.setFocusable(false);
		textField_13_11_5.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_5.setBounds(0, 0, 55, 18);
		panel_8_9.add(textField_13_11_5);

		txtDescriptionHose = new JTextField();
		txtDescriptionHose.setBorder(new LineBorder(Color.black, 1, false));
		txtDescriptionHose.setBounds(414, 0, 425, 18);
		panel_2_9.add(txtDescriptionHose);

		txtValuesHose = new JTextField();
		txtValuesHose.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesHose.setBounds(838, 0, 100, 18);
		panel_2_9.add(txtValuesHose);

		final JPanel panel_2_10 = new JPanel();
		panel_2_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10.setLayout(null);
		panel_2_10.setBounds(0, 276, 938, 18);
		panel_1.add(panel_2_10);

		final JPanel panel_3_10 = new JPanel();
		panel_3_10.setLayout(null);
		panel_3_10.setBackground(Color.WHITE);
		panel_3_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10.setBounds(0, 0, 92, 18);
		panel_2_10.add(panel_3_10);

		txtQuantityLadiesHandkerChiefs = new JTextField();
		txtQuantityLadiesHandkerChiefs.setBorder(new LineBorder(Color.black, 1,
				false));
		txtQuantityLadiesHandkerChiefs.setBounds(0, 0, 92, 18);
		panel_3_10.add(txtQuantityLadiesHandkerChiefs);

		final JPanel panel_4_11 = new JPanel();
		panel_4_11.setBackground(Color.WHITE);
		panel_4_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11.setLayout(null);
		panel_4_11.setBounds(91, 0, 271, 18);
		panel_2_10.add(panel_4_11);

		final JLabel dressesLabel_1_10 = new JLabel();
		dressesLabel_1_10.setText("LADIES HADKERCHIEFS");
		dressesLabel_1_10.setBounds(31, 2, 217, 14);
		panel_4_11.add(dressesLabel_1_10);

		final JPanel panel_8_10 = new JPanel();
		panel_8_10.setLayout(null);
		panel_8_10.setBackground(Color.WHITE);
		panel_8_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10.setBounds(361, 0, 55, 18);
		panel_2_10.add(panel_8_10);

		final JTextField textField_13_11_7 = new JTextField();
		textField_13_11_7.setFocusable(false);
		textField_13_11_7.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_7.setBounds(0, 0, 55, 18);
		panel_8_10.add(textField_13_11_7);

		txtDescriptionLadiesHandkerChiefs = new JTextField();
		txtDescriptionLadiesHandkerChiefs.setBorder(new LineBorder(Color.black,
				1, false));
		txtDescriptionLadiesHandkerChiefs.setBounds(414, 0, 425, 18);
		panel_2_10.add(txtDescriptionLadiesHandkerChiefs);

		txtValuesLadiesHandkerChiefs = new JTextField();
		txtValuesLadiesHandkerChiefs.setBorder(new LineBorder(Color.black, 1,
				false));
		txtValuesLadiesHandkerChiefs.setBounds(838, 0, 100, 18);
		panel_2_10.add(txtValuesLadiesHandkerChiefs);

		final JPanel panel_2_10_1 = new JPanel();
		panel_2_10_1.setBackground(Color.WHITE);
		panel_2_10_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_1.setLayout(null);
		panel_2_10_1.setBounds(0, 294, 938, 18);
		panel_1.add(panel_2_10_1);

		final JPanel panel_3_10_1 = new JPanel();
		panel_3_10_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_1.setLayout(null);
		panel_3_10_1.setBounds(0, 0, 92, 18);
		panel_2_10_1.add(panel_3_10_1);

		txtQuantitySlips = new JTextField();
		txtQuantitySlips.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantitySlips.setBounds(0, 0, 92, 18);
		panel_3_10_1.add(txtQuantitySlips);

		final JPanel panel_4_11_1 = new JPanel();
		panel_4_11_1.setBackground(Color.WHITE);
		panel_4_11_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_1.setLayout(null);
		panel_4_11_1.setBounds(91, 0, 271, 18);
		panel_2_10_1.add(panel_4_11_1);

		final JLabel dressesLabel_1_10_1 = new JLabel();
		dressesLabel_1_10_1.setText("SLIPS");
		dressesLabel_1_10_1.setBounds(31, 2, 217, 14);
		panel_4_11_1.add(dressesLabel_1_10_1);

		final JPanel panel_8_10_1 = new JPanel();
		panel_8_10_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_1.setLayout(null);
		panel_8_10_1.setBounds(361, 0, 55, 18);
		panel_2_10_1.add(panel_8_10_1);

		final JTextField textField_13_11_7_1 = new JTextField();
		textField_13_11_7_1.setFocusable(false);
		textField_13_11_7_1.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_7_1.setBounds(0, 0, 55, 18);
		panel_8_10_1.add(textField_13_11_7_1);

		txtValuesSlips = new JTextField();
		txtValuesSlips.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesSlips.setBounds(838, 0, 100, 18);
		panel_2_10_1.add(txtValuesSlips);

		final JLabel acquiredAfterOriginalLabel = new JLabel();
		acquiredAfterOriginalLabel.setText("ACQUIRED AFTER ORIGINAL ENTRY");
		acquiredAfterOriginalLabel.setBounds(560, 2, 204, 14);
		panel_2_10_1.add(acquiredAfterOriginalLabel);

		final JPanel panel_2_10_1_1 = new JPanel();
		panel_2_10_1_1.setBackground(Color.WHITE);
		panel_2_10_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_1_1.setLayout(null);
		panel_2_10_1_1.setBounds(0, 312, 938, 18);
		panel_1.add(panel_2_10_1_1);

		final JPanel panel_3_10_1_1 = new JPanel();
		panel_3_10_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_1_1.setLayout(null);
		panel_3_10_1_1.setBounds(0, 0, 92, 18);
		panel_2_10_1_1.add(panel_3_10_1_1);

		txtQuantityFoundationGarments = new JTextField();
		txtQuantityFoundationGarments.setBorder(new LineBorder(Color.black, 1,
				false));
		txtQuantityFoundationGarments.setBounds(0, 0, 92, 18);
		panel_3_10_1_1.add(txtQuantityFoundationGarments);

		final JPanel panel_4_11_1_1 = new JPanel();
		panel_4_11_1_1.setBackground(Color.WHITE);
		panel_4_11_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_1_1.setLayout(null);
		panel_4_11_1_1.setBounds(91, 0, 271, 18);
		panel_2_10_1_1.add(panel_4_11_1_1);

		final JLabel dressesLabel_1_10_1_1 = new JLabel();
		dressesLabel_1_10_1_1.setText("FOUNDATION GARMENTS");
		dressesLabel_1_10_1_1.setBounds(31, 2, 217, 14);
		panel_4_11_1_1.add(dressesLabel_1_10_1_1);

		final JPanel panel_8_10_1_1 = new JPanel();
		panel_8_10_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_1_1.setLayout(null);
		panel_8_10_1_1.setBounds(361, 0, 55, 18);
		panel_2_10_1_1.add(panel_8_10_1_1);

		final JTextField textField_13_11_7_1_1 = new JTextField();
		textField_13_11_7_1_1.setFocusable(false);
		textField_13_11_7_1_1.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_7_1_1.setBounds(0, 0, 55, 18);
		panel_8_10_1_1.add(textField_13_11_7_1_1);

		txtValuesFoundationGarments = new JTextField();
		txtValuesFoundationGarments.setBorder(new LineBorder(Color.black, 1,
				false));
		txtValuesFoundationGarments.setBounds(838, 0, 100, 18);
		panel_2_10_1_1.add(txtValuesFoundationGarments);

		final JLabel acquiredAfterOriginalLabel_1 = new JLabel();
		acquiredAfterOriginalLabel_1
				.setHorizontalAlignment(SwingConstants.CENTER);
		acquiredAfterOriginalLabel_1.setBorder(new LineBorder(Color.black, 1,
				false));
		acquiredAfterOriginalLabel_1.setText("DATE");
		acquiredAfterOriginalLabel_1.setBounds(415, 0, 74, 18);
		panel_2_10_1_1.add(acquiredAfterOriginalLabel_1);

		final JLabel acquiredAfterOriginalLabel_1_1 = new JLabel();
		acquiredAfterOriginalLabel_1_1
				.setHorizontalAlignment(SwingConstants.CENTER);
		acquiredAfterOriginalLabel_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		acquiredAfterOriginalLabel_1_1.setText("ITEM");
		acquiredAfterOriginalLabel_1_1.setBounds(488, 0, 230, 18);
		panel_2_10_1_1.add(acquiredAfterOriginalLabel_1_1);

		final JLabel acquiredAfterOriginalLabel_1_2 = new JLabel();
		acquiredAfterOriginalLabel_1_2
				.setHorizontalAlignment(SwingConstants.CENTER);
		acquiredAfterOriginalLabel_1_2.setBorder(new LineBorder(Color.black, 1,
				false));
		acquiredAfterOriginalLabel_1_2.setText("HOW RECEIVED");
		acquiredAfterOriginalLabel_1_2.setBounds(717, 0, 122, 18);
		panel_2_10_1_1.add(acquiredAfterOriginalLabel_1_2);

		final JPanel panel_2_10_1_1_1 = new JPanel();
		panel_2_10_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_1_1_1.setLayout(null);
		panel_2_10_1_1_1.setBounds(0, 330, 938, 18);
		panel_1.add(panel_2_10_1_1_1);

		final JPanel panel_3_10_1_1_1 = new JPanel();
		panel_3_10_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_1_1_1.setLayout(null);
		panel_3_10_1_1_1.setBounds(0, 0, 92, 18);
		panel_2_10_1_1_1.add(panel_3_10_1_1_1);

		txtQuantityBrasiers = new JTextField();
		txtQuantityBrasiers.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityBrasiers.setBounds(0, 0, 92, 18);
		panel_3_10_1_1_1.add(txtQuantityBrasiers);

		final JPanel panel_4_11_1_1_1 = new JPanel();
		panel_4_11_1_1_1.setBackground(Color.WHITE);
		panel_4_11_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_1_1_1.setLayout(null);
		panel_4_11_1_1_1.setBounds(91, 0, 271, 18);
		panel_2_10_1_1_1.add(panel_4_11_1_1_1);

		final JLabel dressesLabel_1_10_1_1_1 = new JLabel();
		dressesLabel_1_10_1_1_1.setText("BRASSIERS");
		dressesLabel_1_10_1_1_1.setBounds(31, 2, 217, 14);
		panel_4_11_1_1_1.add(dressesLabel_1_10_1_1_1);

		final JPanel panel_8_10_1_1_1 = new JPanel();
		panel_8_10_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_1_1_1.setLayout(null);
		panel_8_10_1_1_1.setBounds(361, 0, 55, 18);
		panel_2_10_1_1_1.add(panel_8_10_1_1_1);

		final JTextField textField_13_11_7_1_1_1 = new JTextField();
		textField_13_11_7_1_1_1.setFocusable(false);
		textField_13_11_7_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_7_1_1_1.setBounds(0, 0, 55, 18);
		panel_8_10_1_1_1.add(textField_13_11_7_1_1_1);

		txtValuesBrassiers = new JTextField();
		txtValuesBrassiers.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesBrassiers.setBounds(838, 0, 100, 18);
		panel_2_10_1_1_1.add(txtValuesBrassiers);

		dcOriginalDate1 = new JDateChooser();
		dcOriginalDate1.setBackground(Color.WHITE);
		dcOriginalDate1.setBorder(new LineBorder(Color.black, 1, false));
		dcOriginalDate1.setBounds(414, -1, 76, 20);
		panel_2_10_1_1_1.add(dcOriginalDate1);

		txtOrginalItem1 = new JTextField();
		txtOrginalItem1.setBorder(new LineBorder(Color.black, 1, false));
		txtOrginalItem1.setText("");
		txtOrginalItem1.setBounds(488, 0, 230, 18);
		panel_2_10_1_1_1.add(txtOrginalItem1);

		txtHowRecieved1 = new JTextField();
		txtHowRecieved1.setBorder(new LineBorder(Color.black, 1, false));
		txtHowRecieved1.setText("");
		txtHowRecieved1.setBounds(717, 0, 122, 18);
		panel_2_10_1_1_1.add(txtHowRecieved1);

		final JPanel panel_2_10_1_1_1_1 = new JPanel();
		panel_2_10_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_1_1_1_1.setLayout(null);
		panel_2_10_1_1_1_1.setBounds(0, 348, 938, 18);
		panel_1.add(panel_2_10_1_1_1_1);

		final JPanel panel_3_10_1_1_1_1 = new JPanel();
		panel_3_10_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_1_1_1_1.setLayout(null);
		panel_3_10_1_1_1_1.setBounds(0, 0, 92, 18);
		panel_2_10_1_1_1_1.add(panel_3_10_1_1_1_1);

		txtQuantityNightGowns = new JTextField();
		txtQuantityNightGowns.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityNightGowns.setBounds(0, 0, 92, 18);
		panel_3_10_1_1_1_1.add(txtQuantityNightGowns);

		final JPanel panel_4_11_1_1_1_1 = new JPanel();
		panel_4_11_1_1_1_1.setBackground(Color.WHITE);
		panel_4_11_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_1_1_1_1.setLayout(null);
		panel_4_11_1_1_1_1.setBounds(91, 0, 271, 18);
		panel_2_10_1_1_1_1.add(panel_4_11_1_1_1_1);

		final JLabel dressesLabel_1_10_1_1_1_1 = new JLabel();
		dressesLabel_1_10_1_1_1_1.setText("NIGHT GOWNS");
		dressesLabel_1_10_1_1_1_1.setBounds(31, 2, 217, 14);
		panel_4_11_1_1_1_1.add(dressesLabel_1_10_1_1_1_1);

		final JPanel panel_8_10_1_1_1_1 = new JPanel();
		panel_8_10_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_1_1_1_1.setLayout(null);
		panel_8_10_1_1_1_1.setBounds(361, 0, 55, 18);
		panel_2_10_1_1_1_1.add(panel_8_10_1_1_1_1);

		final JTextField textField_13_11_7_1_1_1_1 = new JTextField();
		textField_13_11_7_1_1_1_1.setFocusable(false);
		textField_13_11_7_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		textField_13_11_7_1_1_1_1.setBounds(0, 0, 55, 18);
		panel_8_10_1_1_1_1.add(textField_13_11_7_1_1_1_1);

		txtValuesNightGowns = new JTextField();
		txtValuesNightGowns.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesNightGowns.setBounds(838, 0, 100, 18);
		panel_2_10_1_1_1_1.add(txtValuesNightGowns);

		dcOriginalDate2 = new JDateChooser();
		dcOriginalDate2.setBackground(Color.WHITE);
		dcOriginalDate2.setBorder(new LineBorder(Color.black, 1, false));
		dcOriginalDate2.setBounds(414, -1, 76, 20);
		panel_2_10_1_1_1_1.add(dcOriginalDate2);

		txtOrginalItem2 = new JTextField();
		txtOrginalItem2.setBorder(new LineBorder(Color.black, 1, false));
		txtOrginalItem2.setBounds(488, 0, 230, 18);
		panel_2_10_1_1_1_1.add(txtOrginalItem2);

		txtHowRecieved2 = new JTextField();
		txtHowRecieved2.setBorder(new LineBorder(Color.black, 1, false));
		txtHowRecieved2.setBounds(717, 0, 122, 18);
		panel_2_10_1_1_1_1.add(txtHowRecieved2);

		final JPanel panel_2_10_1_1_1_2 = new JPanel();
		panel_2_10_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_1_1_1_2.setLayout(null);
		panel_2_10_1_1_1_2.setBounds(0, 366, 938, 18);
		panel_1.add(panel_2_10_1_1_1_2);

		final JPanel panel_3_10_1_1_1_2 = new JPanel();
		panel_3_10_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_1_1_1_2.setLayout(null);
		panel_3_10_1_1_1_2.setBounds(0, 0, 92, 18);
		panel_2_10_1_1_1_2.add(panel_3_10_1_1_1_2);

		txtQuantityHouseCoats = new JTextField();
		txtQuantityHouseCoats.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityHouseCoats.setBounds(0, 0, 92, 18);
		panel_3_10_1_1_1_2.add(txtQuantityHouseCoats);

		final JPanel panel_4_11_1_1_1_2 = new JPanel();
		panel_4_11_1_1_1_2.setBackground(Color.WHITE);
		panel_4_11_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_1_1_1_2.setLayout(null);
		panel_4_11_1_1_1_2.setBounds(91, 0, 271, 18);
		panel_2_10_1_1_1_2.add(panel_4_11_1_1_1_2);

		final JLabel dressesLabel_1_10_1_1_1_2 = new JLabel();
		dressesLabel_1_10_1_1_1_2.setText("HOUSE COAT /ROBES");
		dressesLabel_1_10_1_1_1_2.setBounds(31, 2, 217, 14);
		panel_4_11_1_1_1_2.add(dressesLabel_1_10_1_1_1_2);

		final JPanel panel_8_10_1_1_1_2 = new JPanel();
		panel_8_10_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_1_1_1_2.setLayout(null);
		panel_8_10_1_1_1_2.setBounds(361, 0, 55, 18);
		panel_2_10_1_1_1_2.add(panel_8_10_1_1_1_2);

		final JTextField textField_13_11_7_1_1_1_2 = new JTextField();
		textField_13_11_7_1_1_1_2.setFocusable(false);
		textField_13_11_7_1_1_1_2.setBorder(new LineBorder(Color.black, 1,
				false));
		textField_13_11_7_1_1_1_2.setBounds(0, 0, 55, 18);
		panel_8_10_1_1_1_2.add(textField_13_11_7_1_1_1_2);

		txtValuesHouseCoats = new JTextField();
		txtValuesHouseCoats.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesHouseCoats.setBounds(838, 0, 100, 18);
		panel_2_10_1_1_1_2.add(txtValuesHouseCoats);

		dcOriginalDate3 = new JDateChooser();
		dcOriginalDate3.setBackground(Color.WHITE);
		dcOriginalDate3.setBorder(new LineBorder(Color.black, 1, false));
		dcOriginalDate3.setBounds(414, -1, 76, 20);
		panel_2_10_1_1_1_2.add(dcOriginalDate3);

		txtOrginalItem3 = new JTextField();
		txtOrginalItem3.setBorder(new LineBorder(Color.black, 1, false));
		txtOrginalItem3.setBounds(488, 0, 230, 18);
		panel_2_10_1_1_1_2.add(txtOrginalItem3);

		txtHowRecieved3 = new JTextField();
		txtHowRecieved3.setBorder(new LineBorder(Color.black, 1, false));
		txtHowRecieved3.setBounds(717, 0, 122, 18);
		panel_2_10_1_1_1_2.add(txtHowRecieved3);

		final JPanel panel_2_10_1_1_1_3 = new JPanel();
		panel_2_10_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_1_1_1_3.setLayout(null);
		panel_2_10_1_1_1_3.setBounds(0, 384, 938, 18);
		panel_1.add(panel_2_10_1_1_1_3);

		final JPanel panel_3_10_1_1_1_3 = new JPanel();
		panel_3_10_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_1_1_1_3.setLayout(null);
		panel_3_10_1_1_1_3.setBounds(0, 0, 92, 18);
		panel_2_10_1_1_1_3.add(panel_3_10_1_1_1_3);

		txtQuantityHouseSlippers = new JTextField();
		txtQuantityHouseSlippers
				.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityHouseSlippers.setBounds(0, 0, 92, 18);
		panel_3_10_1_1_1_3.add(txtQuantityHouseSlippers);

		final JPanel panel_4_11_1_1_1_3 = new JPanel();
		panel_4_11_1_1_1_3.setBackground(Color.WHITE);
		panel_4_11_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_1_1_1_3.setLayout(null);
		panel_4_11_1_1_1_3.setBounds(91, 0, 271, 18);
		panel_2_10_1_1_1_3.add(panel_4_11_1_1_1_3);

		final JLabel dressesLabel_1_10_1_1_1_3 = new JLabel();
		dressesLabel_1_10_1_1_1_3.setText("HOUSE SLIPPERS");
		dressesLabel_1_10_1_1_1_3.setBounds(31, 2, 217, 14);
		panel_4_11_1_1_1_3.add(dressesLabel_1_10_1_1_1_3);

		final JPanel panel_8_10_1_1_1_3 = new JPanel();
		panel_8_10_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_1_1_1_3.setLayout(null);
		panel_8_10_1_1_1_3.setBounds(361, 0, 55, 18);
		panel_2_10_1_1_1_3.add(panel_8_10_1_1_1_3);

		final JTextField textField_13_11_7_1_1_1_3 = new JTextField();
		textField_13_11_7_1_1_1_3.setFocusable(false);
		textField_13_11_7_1_1_1_3.setBorder(new LineBorder(Color.black, 1,
				false));
		textField_13_11_7_1_1_1_3.setBounds(0, 0, 55, 18);
		panel_8_10_1_1_1_3.add(textField_13_11_7_1_1_1_3);

		txtValuesHouseSlippers = new JTextField();
		txtValuesHouseSlippers.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesHouseSlippers.setBounds(838, 0, 100, 18);
		panel_2_10_1_1_1_3.add(txtValuesHouseSlippers);

		dcOriginalDate4 = new JDateChooser();
		dcOriginalDate4.setBackground(Color.WHITE);
		dcOriginalDate4.setBorder(new LineBorder(Color.black, 1, false));
		dcOriginalDate4.setBounds(414, -1, 76, 20);
		panel_2_10_1_1_1_3.add(dcOriginalDate4);

		txtOrginalItem4 = new JTextField();
		txtOrginalItem4.setBorder(new LineBorder(Color.black, 1, false));
		txtOrginalItem4.setBounds(488, 0, 230, 18);
		panel_2_10_1_1_1_3.add(txtOrginalItem4);

		txtHowRecieved4 = new JTextField();
		txtHowRecieved4.setBorder(new LineBorder(Color.black, 1, false));
		txtHowRecieved4.setBounds(717, 0, 122, 18);
		panel_2_10_1_1_1_3.add(txtHowRecieved4);

		final JPanel panel_2_10_1_1_1_4 = new JPanel();
		panel_2_10_1_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_1_1_1_4.setLayout(null);
		panel_2_10_1_1_1_4.setBounds(0, 402, 938, 18);
		panel_1.add(panel_2_10_1_1_1_4);

		final JPanel panel_3_10_1_1_1_4 = new JPanel();
		panel_3_10_1_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_1_1_1_4.setLayout(null);
		panel_3_10_1_1_1_4.setBounds(0, 0, 92, 18);
		panel_2_10_1_1_1_4.add(panel_3_10_1_1_1_4);

		txtQuantityPocketBooks = new JTextField();
		txtQuantityPocketBooks.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityPocketBooks.setBounds(0, 0, 92, 18);
		panel_3_10_1_1_1_4.add(txtQuantityPocketBooks);

		final JPanel panel_4_11_1_1_1_4 = new JPanel();
		panel_4_11_1_1_1_4.setBackground(Color.WHITE);
		panel_4_11_1_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_1_1_1_4.setLayout(null);
		panel_4_11_1_1_1_4.setBounds(91, 0, 271, 18);
		panel_2_10_1_1_1_4.add(panel_4_11_1_1_1_4);

		final JLabel dressesLabel_1_10_1_1_1_4 = new JLabel();
		dressesLabel_1_10_1_1_1_4.setText("POCKET BOOKS");
		dressesLabel_1_10_1_1_1_4.setBounds(31, 2, 217, 14);
		panel_4_11_1_1_1_4.add(dressesLabel_1_10_1_1_1_4);

		final JPanel panel_8_10_1_1_1_4 = new JPanel();
		panel_8_10_1_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_1_1_1_4.setLayout(null);
		panel_8_10_1_1_1_4.setBounds(361, 0, 55, 18);
		panel_2_10_1_1_1_4.add(panel_8_10_1_1_1_4);

		final JTextField textField_13_11_7_1_1_1_4 = new JTextField();
		textField_13_11_7_1_1_1_4.setFocusable(false);
		textField_13_11_7_1_1_1_4.setBorder(new LineBorder(Color.black, 1,
				false));
		textField_13_11_7_1_1_1_4.setBounds(0, 0, 55, 18);
		panel_8_10_1_1_1_4.add(textField_13_11_7_1_1_1_4);

		txtValuesPocketBooks = new JTextField();
		txtValuesPocketBooks.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesPocketBooks.setBounds(838, 0, 100, 18);
		panel_2_10_1_1_1_4.add(txtValuesPocketBooks);

		dcOriginalDate5 = new JDateChooser();
		dcOriginalDate5.setBackground(Color.WHITE);
		dcOriginalDate5.setBorder(new LineBorder(Color.black, 1, false));
		dcOriginalDate5.setBounds(414, -1, 76, 20);
		panel_2_10_1_1_1_4.add(dcOriginalDate5);

		txtOrginalItem5 = new JTextField();
		txtOrginalItem5.setBorder(new LineBorder(Color.black, 1, false));
		txtOrginalItem5.setBounds(488, 0, 230, 18);
		panel_2_10_1_1_1_4.add(txtOrginalItem5);

		txtHowRecieved5 = new JTextField();
		txtHowRecieved5.setBorder(new LineBorder(Color.black, 1, false));
		txtHowRecieved5.setBounds(717, 0, 122, 18);
		panel_2_10_1_1_1_4.add(txtHowRecieved5);

		final JPanel panel_2_10_1_1_1_5 = new JPanel();
		panel_2_10_1_1_1_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_1_1_1_5.setLayout(null);
		panel_2_10_1_1_1_5.setBounds(0, 420, 938, 18);
		panel_1.add(panel_2_10_1_1_1_5);

		final JPanel panel_3_10_1_1_1_5 = new JPanel();
		panel_3_10_1_1_1_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_1_1_1_5.setLayout(null);
		panel_3_10_1_1_1_5.setBounds(0, 0, 92, 18);
		panel_2_10_1_1_1_5.add(panel_3_10_1_1_1_5);

		txtQuantityOvernightCase = new JTextField();
		txtQuantityOvernightCase
				.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityOvernightCase.setBounds(0, 0, 92, 18);
		panel_3_10_1_1_1_5.add(txtQuantityOvernightCase);

		final JPanel panel_4_11_1_1_1_5 = new JPanel();
		panel_4_11_1_1_1_5.setBackground(Color.WHITE);
		panel_4_11_1_1_1_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_1_1_1_5.setLayout(null);
		panel_4_11_1_1_1_5.setBounds(91, 0, 271, 18);
		panel_2_10_1_1_1_5.add(panel_4_11_1_1_1_5);

		final JLabel dressesLabel_1_10_1_1_1_5 = new JLabel();
		dressesLabel_1_10_1_1_1_5.setText("OVERNIGHT CASE");
		dressesLabel_1_10_1_1_1_5.setBounds(31, 2, 217, 14);
		panel_4_11_1_1_1_5.add(dressesLabel_1_10_1_1_1_5);

		final JPanel panel_8_10_1_1_1_5 = new JPanel();
		panel_8_10_1_1_1_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_1_1_1_5.setLayout(null);
		panel_8_10_1_1_1_5.setBounds(361, 0, 55, 18);
		panel_2_10_1_1_1_5.add(panel_8_10_1_1_1_5);

		final JTextField textField_13_11_7_1_1_1_5 = new JTextField();
		textField_13_11_7_1_1_1_5.setFocusable(false);
		textField_13_11_7_1_1_1_5.setBorder(new LineBorder(Color.black, 1,
				false));
		textField_13_11_7_1_1_1_5.setBounds(0, 0, 55, 18);
		panel_8_10_1_1_1_5.add(textField_13_11_7_1_1_1_5);

		txtValuesOverNightCase = new JTextField();
		txtValuesOverNightCase.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesOverNightCase.setBounds(838, 0, 100, 18);
		panel_2_10_1_1_1_5.add(txtValuesOverNightCase);

		dcOriginalDate6 = new JDateChooser();
		dcOriginalDate6.setBackground(Color.WHITE);
		dcOriginalDate6.setBorder(new LineBorder(Color.black, 1, false));
		dcOriginalDate6.setBounds(414, -1, 76, 20);
		panel_2_10_1_1_1_5.add(dcOriginalDate6);

		txtOrginalItem6 = new JTextField();
		txtOrginalItem6.setBorder(new LineBorder(Color.black, 1, false));
		txtOrginalItem6.setBounds(488, 0, 230, 18);
		panel_2_10_1_1_1_5.add(txtOrginalItem6);

		txtHowRecieved6 = new JTextField();
		txtHowRecieved6.setBorder(new LineBorder(Color.black, 1, false));
		txtHowRecieved6.setBounds(717, 0, 122, 18);
		panel_2_10_1_1_1_5.add(txtHowRecieved6);

		final JPanel panel_2_10_1_1_1_6 = new JPanel();
		panel_2_10_1_1_1_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_1_1_1_6.setLayout(null);
		panel_2_10_1_1_1_6.setBounds(0, 438, 938, 18);
		panel_1.add(panel_2_10_1_1_1_6);

		final JPanel panel_3_10_1_1_1_6 = new JPanel();
		panel_3_10_1_1_1_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_1_1_1_6.setLayout(null);
		panel_3_10_1_1_1_6.setBounds(0, 0, 92, 18);
		panel_2_10_1_1_1_6.add(panel_3_10_1_1_1_6);

		txtQuantityMensSuit = new JTextField();
		txtQuantityMensSuit.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityMensSuit.setBounds(0, 0, 92, 18);
		panel_3_10_1_1_1_6.add(txtQuantityMensSuit);

		final JPanel panel_4_11_1_1_1_6 = new JPanel();
		panel_4_11_1_1_1_6.setBackground(Color.WHITE);
		panel_4_11_1_1_1_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_1_1_1_6.setLayout(null);
		panel_4_11_1_1_1_6.setBounds(91, 0, 271, 18);
		panel_2_10_1_1_1_6.add(panel_4_11_1_1_1_6);

		final JLabel dressesLabel_1_10_1_1_1_6 = new JLabel();
		dressesLabel_1_10_1_1_1_6.setText("MEN'S SUIT");
		dressesLabel_1_10_1_1_1_6.setBounds(31, 2, 217, 14);
		panel_4_11_1_1_1_6.add(dressesLabel_1_10_1_1_1_6);

		final JPanel panel_8_10_1_1_1_6 = new JPanel();
		panel_8_10_1_1_1_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_1_1_1_6.setLayout(null);
		panel_8_10_1_1_1_6.setBounds(361, 0, 55, 18);
		panel_2_10_1_1_1_6.add(panel_8_10_1_1_1_6);

		final JTextField textField_13_11_7_1_1_1_6 = new JTextField();
		textField_13_11_7_1_1_1_6.setFocusable(false);
		textField_13_11_7_1_1_1_6.setBorder(new LineBorder(Color.black, 1,
				false));
		textField_13_11_7_1_1_1_6.setBounds(0, 0, 55, 18);
		panel_8_10_1_1_1_6.add(textField_13_11_7_1_1_1_6);

		txtValuesMensSuit = new JTextField();
		txtValuesMensSuit.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesMensSuit.setBounds(838, 0, 100, 18);
		panel_2_10_1_1_1_6.add(txtValuesMensSuit);

		dcOriginalDate7 = new JDateChooser();
		dcOriginalDate7.setBackground(Color.WHITE);
		dcOriginalDate7.setBorder(new LineBorder(Color.black, 1, false));
		dcOriginalDate7.setBounds(414, -1, 76, 20);
		panel_2_10_1_1_1_6.add(dcOriginalDate7);

		txtOrginalItem7 = new JTextField();
		txtOrginalItem7.setBorder(new LineBorder(Color.black, 1, false));
		txtOrginalItem7.setBounds(488, 0, 230, 18);
		panel_2_10_1_1_1_6.add(txtOrginalItem7);

		txtHowRecieved7 = new JTextField();
		txtHowRecieved7.setBorder(new LineBorder(Color.black, 1, false));
		txtHowRecieved7.setBounds(717, 0, 122, 18);
		panel_2_10_1_1_1_6.add(txtHowRecieved7);

		final JPanel panel_2_10_1_1_1_7 = new JPanel();
		panel_2_10_1_1_1_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_1_1_1_7.setLayout(null);
		panel_2_10_1_1_1_7.setBounds(0, 456, 938, 18);
		panel_1.add(panel_2_10_1_1_1_7);

		final JPanel panel_3_10_1_1_1_7 = new JPanel();
		panel_3_10_1_1_1_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_1_1_1_7.setLayout(null);
		panel_3_10_1_1_1_7.setBounds(0, 0, 92, 18);
		panel_2_10_1_1_1_7.add(panel_3_10_1_1_1_7);

		txtQuantityTopCoats = new JTextField();
		txtQuantityTopCoats.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityTopCoats.setBounds(0, 0, 92, 18);
		panel_3_10_1_1_1_7.add(txtQuantityTopCoats);

		final JPanel panel_4_11_1_1_1_7 = new JPanel();
		panel_4_11_1_1_1_7.setBackground(Color.WHITE);
		panel_4_11_1_1_1_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_1_1_1_7.setLayout(null);
		panel_4_11_1_1_1_7.setBounds(91, 0, 271, 18);
		panel_2_10_1_1_1_7.add(panel_4_11_1_1_1_7);

		final JLabel dressesLabel_1_10_1_1_1_7 = new JLabel();
		dressesLabel_1_10_1_1_1_7.setText("TOP COATS");
		dressesLabel_1_10_1_1_1_7.setBounds(31, 2, 217, 14);
		panel_4_11_1_1_1_7.add(dressesLabel_1_10_1_1_1_7);

		final JPanel panel_8_10_1_1_1_7 = new JPanel();
		panel_8_10_1_1_1_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_1_1_1_7.setLayout(null);
		panel_8_10_1_1_1_7.setBounds(361, 0, 55, 18);
		panel_2_10_1_1_1_7.add(panel_8_10_1_1_1_7);

		final JTextField textField_13_11_7_1_1_1_7 = new JTextField();
		textField_13_11_7_1_1_1_7.setFocusable(false);
		textField_13_11_7_1_1_1_7.setBorder(new LineBorder(Color.black, 1,
				false));
		textField_13_11_7_1_1_1_7.setBounds(0, 0, 55, 18);
		panel_8_10_1_1_1_7.add(textField_13_11_7_1_1_1_7);

		txtValuesTopCoats = new JTextField();
		txtValuesTopCoats.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesTopCoats.setBounds(838, 0, 100, 18);
		panel_2_10_1_1_1_7.add(txtValuesTopCoats);

		dcOriginalDate8 = new JDateChooser();
		dcOriginalDate8.setBackground(Color.WHITE);
		dcOriginalDate8.setBorder(new LineBorder(Color.black, 1, false));
		dcOriginalDate8.setBounds(414, -1, 76, 20);
		panel_2_10_1_1_1_7.add(dcOriginalDate8);

		txtOrginalItem8 = new JTextField();
		txtOrginalItem8.setBorder(new LineBorder(Color.black, 1, false));
		txtOrginalItem8.setBounds(488, 0, 230, 18);
		panel_2_10_1_1_1_7.add(txtOrginalItem8);

		txtHowRecieved8 = new JTextField();
		txtHowRecieved8.setBorder(new LineBorder(Color.black, 1, false));
		txtHowRecieved8.setBounds(717, 0, 122, 18);
		panel_2_10_1_1_1_7.add(txtHowRecieved8);

		final JPanel panel_2_10_1_1_1_8 = new JPanel();
		panel_2_10_1_1_1_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_1_1_1_8.setLayout(null);
		panel_2_10_1_1_1_8.setBounds(0, 474, 938, 18);
		panel_1.add(panel_2_10_1_1_1_8);

		final JPanel panel_3_10_1_1_1_8 = new JPanel();
		panel_3_10_1_1_1_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_1_1_1_8.setLayout(null);
		panel_3_10_1_1_1_8.setBounds(0, 0, 92, 18);
		panel_2_10_1_1_1_8.add(panel_3_10_1_1_1_8);

		txtQuantitySlacks = new JTextField();
		txtQuantitySlacks.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantitySlacks.setBounds(0, 0, 92, 18);
		panel_3_10_1_1_1_8.add(txtQuantitySlacks);

		final JPanel panel_4_11_1_1_1_8 = new JPanel();
		panel_4_11_1_1_1_8.setBackground(Color.WHITE);
		panel_4_11_1_1_1_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_1_1_1_8.setLayout(null);
		panel_4_11_1_1_1_8.setBounds(91, 0, 271, 18);
		panel_2_10_1_1_1_8.add(panel_4_11_1_1_1_8);

		final JLabel dressesLabel_1_10_1_1_1_8 = new JLabel();
		dressesLabel_1_10_1_1_1_8.setText("SLACKS");
		dressesLabel_1_10_1_1_1_8.setBounds(31, 2, 217, 14);
		panel_4_11_1_1_1_8.add(dressesLabel_1_10_1_1_1_8);

		final JPanel panel_8_10_1_1_1_8 = new JPanel();
		panel_8_10_1_1_1_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_1_1_1_8.setLayout(null);
		panel_8_10_1_1_1_8.setBounds(361, 0, 55, 18);
		panel_2_10_1_1_1_8.add(panel_8_10_1_1_1_8);

		final JTextField textField_13_11_7_1_1_1_8 = new JTextField();
		textField_13_11_7_1_1_1_8.setFocusable(false);
		textField_13_11_7_1_1_1_8.setBorder(new LineBorder(Color.black, 1,
				false));
		textField_13_11_7_1_1_1_8.setBounds(0, 0, 55, 18);
		panel_8_10_1_1_1_8.add(textField_13_11_7_1_1_1_8);

		txtValuesSlacks = new JTextField();
		txtValuesSlacks.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesSlacks.setBounds(838, 0, 100, 18);
		panel_2_10_1_1_1_8.add(txtValuesSlacks);

		dcOriginalDate9 = new JDateChooser();
		dcOriginalDate9.setBackground(Color.WHITE);
		dcOriginalDate9.setBorder(new LineBorder(Color.black, 1, false));
		dcOriginalDate9.setBounds(414, -1, 76, 20);
		panel_2_10_1_1_1_8.add(dcOriginalDate9);

		txtOrginalItem9 = new JTextField();
		txtOrginalItem9.setBorder(new LineBorder(Color.black, 1, false));
		txtOrginalItem9.setBounds(488, 0, 230, 18);
		panel_2_10_1_1_1_8.add(txtOrginalItem9);

		txtHowRecieved9 = new JTextField();
		txtHowRecieved9.setBorder(new LineBorder(Color.black, 1, false));
		txtHowRecieved9.setBounds(717, 0, 122, 18);
		panel_2_10_1_1_1_8.add(txtHowRecieved9);

		final JPanel panel_2_10_1_1_1_9 = new JPanel();
		panel_2_10_1_1_1_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_1_1_1_9.setLayout(null);
		panel_2_10_1_1_1_9.setBounds(0, 492, 938, 18);
		panel_1.add(panel_2_10_1_1_1_9);

		final JPanel panel_3_10_1_1_1_9 = new JPanel();
		panel_3_10_1_1_1_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_1_1_1_9.setLayout(null);
		panel_3_10_1_1_1_9.setBounds(0, 0, 92, 18);
		panel_2_10_1_1_1_9.add(panel_3_10_1_1_1_9);

		txtQuantitySportJackets = new JTextField();
		txtQuantitySportJackets
				.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantitySportJackets.setBounds(0, 0, 92, 18);
		panel_3_10_1_1_1_9.add(txtQuantitySportJackets);

		final JPanel panel_4_11_1_1_1_9 = new JPanel();
		panel_4_11_1_1_1_9.setBackground(Color.WHITE);
		panel_4_11_1_1_1_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_1_1_1_9.setLayout(null);
		panel_4_11_1_1_1_9.setBounds(91, 0, 271, 18);
		panel_2_10_1_1_1_9.add(panel_4_11_1_1_1_9);

		final JLabel dressesLabel_1_10_1_1_1_9 = new JLabel();
		dressesLabel_1_10_1_1_1_9.setText("SPORT JACKETS");
		dressesLabel_1_10_1_1_1_9.setBounds(31, 2, 217, 14);
		panel_4_11_1_1_1_9.add(dressesLabel_1_10_1_1_1_9);

		final JPanel panel_8_10_1_1_1_9 = new JPanel();
		panel_8_10_1_1_1_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_1_1_1_9.setLayout(null);
		panel_8_10_1_1_1_9.setBounds(361, 0, 55, 18);
		panel_2_10_1_1_1_9.add(panel_8_10_1_1_1_9);

		final JTextField textField_13_11_7_1_1_1_9 = new JTextField();
		textField_13_11_7_1_1_1_9.setFocusable(false);
		textField_13_11_7_1_1_1_9.setBorder(new LineBorder(Color.black, 1,
				false));
		textField_13_11_7_1_1_1_9.setBounds(0, 0, 55, 18);
		panel_8_10_1_1_1_9.add(textField_13_11_7_1_1_1_9);

		txtValuesSportJackets = new JTextField();
		txtValuesSportJackets.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesSportJackets.setBounds(838, 0, 100, 18);
		panel_2_10_1_1_1_9.add(txtValuesSportJackets);

		dcOriginalDate10 = new JDateChooser();
		dcOriginalDate10.setBackground(Color.WHITE);
		dcOriginalDate10.setBorder(new LineBorder(Color.black, 1, false));
		dcOriginalDate10.setBounds(414, -1, 76, 20);
		panel_2_10_1_1_1_9.add(dcOriginalDate10);

		txtOrginalItem10 = new JTextField();
		txtOrginalItem10.setBorder(new LineBorder(Color.black, 1, false));
		txtOrginalItem10.setBounds(488, 0, 230, 18);
		panel_2_10_1_1_1_9.add(txtOrginalItem10);

		txtHowRecieved10 = new JTextField();
		txtHowRecieved10.setBorder(new LineBorder(Color.black, 1, false));
		txtHowRecieved10.setBounds(717, 0, 122, 18);
		panel_2_10_1_1_1_9.add(txtHowRecieved10);

		final JPanel panel_2_10_1_1_1_10 = new JPanel();
		panel_2_10_1_1_1_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_1_1_1_10.setLayout(null);
		panel_2_10_1_1_1_10.setBounds(0, 510, 938, 18);
		panel_1.add(panel_2_10_1_1_1_10);

		final JPanel panel_3_10_1_1_1_10 = new JPanel();
		panel_3_10_1_1_1_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_1_1_1_10.setLayout(null);
		panel_3_10_1_1_1_10.setBounds(0, 0, 92, 18);
		panel_2_10_1_1_1_10.add(panel_3_10_1_1_1_10);

		txtQuantityMensHats = new JTextField();
		txtQuantityMensHats.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityMensHats.setBounds(0, 0, 92, 18);
		panel_3_10_1_1_1_10.add(txtQuantityMensHats);

		final JPanel panel_4_11_1_1_1_10 = new JPanel();
		panel_4_11_1_1_1_10.setBackground(Color.WHITE);
		panel_4_11_1_1_1_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_1_1_1_10.setLayout(null);
		panel_4_11_1_1_1_10.setBounds(91, 0, 271, 18);
		panel_2_10_1_1_1_10.add(panel_4_11_1_1_1_10);

		final JLabel dressesLabel_1_10_1_1_1_10 = new JLabel();
		dressesLabel_1_10_1_1_1_10.setText("MEN'S HATS");
		dressesLabel_1_10_1_1_1_10.setBounds(31, 2, 217, 14);
		panel_4_11_1_1_1_10.add(dressesLabel_1_10_1_1_1_10);

		final JPanel panel_8_10_1_1_1_10 = new JPanel();
		panel_8_10_1_1_1_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_1_1_1_10.setLayout(null);
		panel_8_10_1_1_1_10.setBounds(361, 0, 55, 18);
		panel_2_10_1_1_1_10.add(panel_8_10_1_1_1_10);

		final JTextField textField_13_11_7_1_1_1_10 = new JTextField();
		textField_13_11_7_1_1_1_10.setFocusable(false);
		textField_13_11_7_1_1_1_10.setBorder(new LineBorder(Color.black, 1,
				false));
		textField_13_11_7_1_1_1_10.setBounds(0, 0, 55, 18);
		panel_8_10_1_1_1_10.add(textField_13_11_7_1_1_1_10);

		txtValuesMensHats = new JTextField();
		txtValuesMensHats.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesMensHats.setBounds(838, 0, 100, 18);
		panel_2_10_1_1_1_10.add(txtValuesMensHats);

		dcOriginalDate11 = new JDateChooser();
		dcOriginalDate11.setBackground(Color.WHITE);
		dcOriginalDate11.setBorder(new LineBorder(Color.black, 1, false));
		dcOriginalDate11.setBounds(414, -1, 76, 20);
		panel_2_10_1_1_1_10.add(dcOriginalDate11);

		txtOrginalItem11 = new JTextField();
		txtOrginalItem11.setBorder(new LineBorder(Color.black, 1, false));
		txtOrginalItem11.setBounds(488, 0, 230, 18);
		panel_2_10_1_1_1_10.add(txtOrginalItem11);

		txtHowRecieved11 = new JTextField();
		txtHowRecieved11.setBorder(new LineBorder(Color.black, 1, false));
		txtHowRecieved11.setBounds(717, 0, 122, 18);
		panel_2_10_1_1_1_10.add(txtHowRecieved11);

		final JPanel panel_2_10_1_1_1_11 = new JPanel();
		panel_2_10_1_1_1_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_1_1_1_11.setLayout(null);
		panel_2_10_1_1_1_11.setBounds(0, 528, 938, 18);
		panel_1.add(panel_2_10_1_1_1_11);

		final JPanel panel_3_10_1_1_1_11 = new JPanel();
		panel_3_10_1_1_1_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_1_1_1_11.setLayout(null);
		panel_3_10_1_1_1_11.setBounds(0, 0, 92, 18);
		panel_2_10_1_1_1_11.add(panel_3_10_1_1_1_11);

		txtQuantityMensShoes = new JTextField();
		txtQuantityMensShoes.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityMensShoes.setBounds(0, 0, 92, 18);
		panel_3_10_1_1_1_11.add(txtQuantityMensShoes);

		final JPanel panel_4_11_1_1_1_11 = new JPanel();
		panel_4_11_1_1_1_11.setBackground(Color.WHITE);
		panel_4_11_1_1_1_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_1_1_1_11.setLayout(null);
		panel_4_11_1_1_1_11.setBounds(91, 0, 271, 18);
		panel_2_10_1_1_1_11.add(panel_4_11_1_1_1_11);

		final JLabel dressesLabel_1_10_1_1_1_11 = new JLabel();
		dressesLabel_1_10_1_1_1_11.setText("MEN'S SHOES");
		dressesLabel_1_10_1_1_1_11.setBounds(31, 2, 217, 14);
		panel_4_11_1_1_1_11.add(dressesLabel_1_10_1_1_1_11);

		final JPanel panel_8_10_1_1_1_11 = new JPanel();
		panel_8_10_1_1_1_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_1_1_1_11.setLayout(null);
		panel_8_10_1_1_1_11.setBounds(361, 0, 55, 18);
		panel_2_10_1_1_1_11.add(panel_8_10_1_1_1_11);

		final JTextField textField_13_11_7_1_1_1_11 = new JTextField();
		textField_13_11_7_1_1_1_11.setFocusable(false);
		textField_13_11_7_1_1_1_11.setBorder(new LineBorder(Color.black, 1,
				false));
		textField_13_11_7_1_1_1_11.setBounds(0, 0, 55, 18);
		panel_8_10_1_1_1_11.add(textField_13_11_7_1_1_1_11);

		txtValuesMensShoes = new JTextField();
		txtValuesMensShoes.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesMensShoes.setBounds(838, 0, 100, 18);
		panel_2_10_1_1_1_11.add(txtValuesMensShoes);

		dcOriginalDate12 = new JDateChooser();
		dcOriginalDate12.setBackground(Color.WHITE);
		dcOriginalDate12.setBorder(new LineBorder(Color.black, 1, false));
		dcOriginalDate12.setBounds(414, -1, 76, 20);
		panel_2_10_1_1_1_11.add(dcOriginalDate12);

		txtOrginalItem12 = new JTextField();
		txtOrginalItem12.setBorder(new LineBorder(Color.black, 1, false));
		txtOrginalItem12.setBounds(488, 0, 230, 18);
		panel_2_10_1_1_1_11.add(txtOrginalItem12);

		txtHowRecieved12 = new JTextField();
		txtHowRecieved12.setBorder(new LineBorder(Color.black, 1, false));
		txtHowRecieved12.setBounds(717, 0, 122, 18);
		panel_2_10_1_1_1_11.add(txtHowRecieved12);

		final JPanel panel_2_10_1_1_1_12 = new JPanel();
		panel_2_10_1_1_1_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_1_1_1_12.setLayout(null);
		panel_2_10_1_1_1_12.setBounds(0, 546, 938, 18);
		panel_1.add(panel_2_10_1_1_1_12);

		final JPanel panel_3_10_1_1_1_12 = new JPanel();
		panel_3_10_1_1_1_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_1_1_1_12.setLayout(null);
		panel_3_10_1_1_1_12.setBounds(0, 0, 92, 18);
		panel_2_10_1_1_1_12.add(panel_3_10_1_1_1_12);

		txtQuantityMensGloves = new JTextField();
		txtQuantityMensGloves.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityMensGloves.setBounds(0, 0, 92, 18);
		panel_3_10_1_1_1_12.add(txtQuantityMensGloves);

		final JPanel panel_4_11_1_1_1_12 = new JPanel();
		panel_4_11_1_1_1_12.setBackground(Color.WHITE);
		panel_4_11_1_1_1_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_1_1_1_12.setLayout(null);
		panel_4_11_1_1_1_12.setBounds(91, 0, 271, 18);
		panel_2_10_1_1_1_12.add(panel_4_11_1_1_1_12);

		final JLabel dressesLabel_1_10_1_1_1_12 = new JLabel();
		dressesLabel_1_10_1_1_1_12.setText("MEN'S GLOVES");
		dressesLabel_1_10_1_1_1_12.setBounds(31, 2, 217, 14);
		panel_4_11_1_1_1_12.add(dressesLabel_1_10_1_1_1_12);

		final JPanel panel_8_10_1_1_1_12 = new JPanel();
		panel_8_10_1_1_1_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_1_1_1_12.setLayout(null);
		panel_8_10_1_1_1_12.setBounds(361, 0, 55, 18);
		panel_2_10_1_1_1_12.add(panel_8_10_1_1_1_12);

		final JTextField textField_13_11_7_1_1_1_12 = new JTextField();
		textField_13_11_7_1_1_1_12.setFocusable(false);
		textField_13_11_7_1_1_1_12.setBorder(new LineBorder(Color.black, 1,
				false));
		textField_13_11_7_1_1_1_12.setBounds(0, 0, 55, 18);
		panel_8_10_1_1_1_12.add(textField_13_11_7_1_1_1_12);

		txtValuesMensGloves = new JTextField();
		txtValuesMensGloves.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesMensGloves.setBounds(838, 0, 100, 18);
		panel_2_10_1_1_1_12.add(txtValuesMensGloves);

		dcOriginalDate13 = new JDateChooser();
		dcOriginalDate13.setBackground(Color.WHITE);
		dcOriginalDate13.setBorder(new LineBorder(Color.black, 1, false));
		dcOriginalDate13.setBounds(414, -1, 76, 20);
		panel_2_10_1_1_1_12.add(dcOriginalDate13);

		txtOrginalItem13 = new JTextField();
		txtOrginalItem13.setBorder(new LineBorder(Color.black, 1, false));
		txtOrginalItem13.setBounds(488, 0, 230, 18);
		panel_2_10_1_1_1_12.add(txtOrginalItem13);

		txtHowRecieved13 = new JTextField();
		txtHowRecieved13.setBorder(new LineBorder(Color.black, 1, false));
		txtHowRecieved13.setBounds(717, 0, 122, 18);
		panel_2_10_1_1_1_12.add(txtHowRecieved13);

		final JPanel panel_2_10_1_1_1_13 = new JPanel();
		panel_2_10_1_1_1_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_1_1_1_13.setLayout(null);
		panel_2_10_1_1_1_13.setBounds(0, 564, 938, 18);
		panel_1.add(panel_2_10_1_1_1_13);

		final JPanel panel_3_10_1_1_1_13 = new JPanel();
		panel_3_10_1_1_1_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_1_1_1_13.setLayout(null);
		panel_3_10_1_1_1_13.setBounds(0, 0, 92, 18);
		panel_2_10_1_1_1_13.add(panel_3_10_1_1_1_13);

		txtQuantitySocks = new JTextField();
		txtQuantitySocks.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantitySocks.setBounds(0, 0, 92, 18);
		panel_3_10_1_1_1_13.add(txtQuantitySocks);

		final JPanel panel_4_11_1_1_1_13 = new JPanel();
		panel_4_11_1_1_1_13.setBackground(Color.WHITE);
		panel_4_11_1_1_1_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_1_1_1_13.setLayout(null);
		panel_4_11_1_1_1_13.setBounds(91, 0, 271, 18);
		panel_2_10_1_1_1_13.add(panel_4_11_1_1_1_13);

		final JLabel dressesLabel_1_10_1_1_1_13 = new JLabel();
		dressesLabel_1_10_1_1_1_13.setText("SOCKS");
		dressesLabel_1_10_1_1_1_13.setBounds(31, 2, 217, 14);
		panel_4_11_1_1_1_13.add(dressesLabel_1_10_1_1_1_13);

		final JPanel panel_8_10_1_1_1_13 = new JPanel();
		panel_8_10_1_1_1_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_1_1_1_13.setLayout(null);
		panel_8_10_1_1_1_13.setBounds(361, 0, 55, 18);
		panel_2_10_1_1_1_13.add(panel_8_10_1_1_1_13);

		final JTextField textField_13_11_7_1_1_1_13 = new JTextField();
		textField_13_11_7_1_1_1_13.setFocusable(false);
		textField_13_11_7_1_1_1_13.setBorder(new LineBorder(Color.black, 1,
				false));
		textField_13_11_7_1_1_1_13.setBounds(0, 0, 55, 18);
		panel_8_10_1_1_1_13.add(textField_13_11_7_1_1_1_13);

		txtValuesSocks = new JTextField();
		txtValuesSocks.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesSocks.setBounds(838, 0, 100, 18);
		panel_2_10_1_1_1_13.add(txtValuesSocks);

		dcOriginalDate14 = new JDateChooser();
		dcOriginalDate14.setBackground(Color.WHITE);
		dcOriginalDate14.setBorder(new LineBorder(Color.black, 1, false));
		dcOriginalDate14.setBounds(414, -1, 76, 20);
		panel_2_10_1_1_1_13.add(dcOriginalDate14);

		txtOrginalItem14 = new JTextField();
		txtOrginalItem14.setBorder(new LineBorder(Color.black, 1, false));
		txtOrginalItem14.setBounds(488, 0, 230, 18);
		panel_2_10_1_1_1_13.add(txtOrginalItem14);

		txtHowRecieved14 = new JTextField();
		txtHowRecieved14.setBorder(new LineBorder(Color.black, 1, false));
		txtHowRecieved14.setBounds(717, 0, 122, 18);
		panel_2_10_1_1_1_13.add(txtHowRecieved14);

		final JPanel panel_2_10_2 = new JPanel();
		panel_2_10_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_2.setLayout(null);
		panel_2_10_2.setBounds(0, 582, 938, 18);
		panel_1.add(panel_2_10_2);

		final JPanel panel_3_10_2 = new JPanel();
		panel_3_10_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_2.setLayout(null);
		panel_3_10_2.setBounds(0, 0, 92, 18);
		panel_2_10_2.add(panel_3_10_2);

		txtQuantityShort = new JTextField();
		txtQuantityShort.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityShort.setBounds(0, 0, 92, 18);
		panel_3_10_2.add(txtQuantityShort);

		final JPanel panel_4_11_2 = new JPanel();
		panel_4_11_2.setBackground(Color.WHITE);
		panel_4_11_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_2.setLayout(null);
		panel_4_11_2.setBounds(91, 0, 271, 18);
		panel_2_10_2.add(panel_4_11_2);

		final JLabel dressesLabel_1_10_2 = new JLabel();
		dressesLabel_1_10_2.setText("SHORTS");
		dressesLabel_1_10_2.setBounds(31, 2, 217, 14);
		panel_4_11_2.add(dressesLabel_1_10_2);

		final JPanel panel_8_10_2 = new JPanel();
		panel_8_10_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_2.setLayout(null);
		panel_8_10_2.setBounds(361, 0, 55, 18);
		panel_2_10_2.add(panel_8_10_2);

		final JTextField textField_13_11_7_2 = new JTextField();
		textField_13_11_7_2.setFocusable(false);
		textField_13_11_7_2.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_7_2.setBounds(0, 0, 55, 18);
		panel_8_10_2.add(textField_13_11_7_2);

		txtDescriptionShorts = new JTextField();
		txtDescriptionShorts.setBorder(new LineBorder(Color.black, 1, false));
		txtDescriptionShorts.setBounds(414, 0, 425, 18);
		panel_2_10_2.add(txtDescriptionShorts);

		txtValuesShorts = new JTextField();
		txtValuesShorts.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesShorts.setBounds(838, 0, 100, 18);
		panel_2_10_2.add(txtValuesShorts);

		final JPanel panel_2_10_1_2 = new JPanel();
		panel_2_10_1_2.setBackground(Color.WHITE);
		panel_2_10_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_1_2.setLayout(null);
		panel_2_10_1_2.setBounds(0, 600, 938, 18);
		panel_1.add(panel_2_10_1_2);

		final JPanel panel_3_10_1_2 = new JPanel();
		panel_3_10_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_1_2.setLayout(null);
		panel_3_10_1_2.setBounds(0, 0, 92, 18);
		panel_2_10_1_2.add(panel_3_10_1_2);

		txtQuantityUnderShirts = new JTextField();
		txtQuantityUnderShirts.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityUnderShirts.setBounds(0, 0, 92, 18);
		panel_3_10_1_2.add(txtQuantityUnderShirts);

		final JPanel panel_4_11_1_2 = new JPanel();
		panel_4_11_1_2.setBackground(Color.WHITE);
		panel_4_11_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_1_2.setLayout(null);
		panel_4_11_1_2.setBounds(91, 0, 271, 18);
		panel_2_10_1_2.add(panel_4_11_1_2);

		final JLabel dressesLabel_1_10_1_2 = new JLabel();
		dressesLabel_1_10_1_2.setText("UNDER SHIRTS");
		dressesLabel_1_10_1_2.setBounds(31, 2, 217, 14);
		panel_4_11_1_2.add(dressesLabel_1_10_1_2);

		final JPanel panel_8_10_1_2 = new JPanel();
		panel_8_10_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_1_2.setLayout(null);
		panel_8_10_1_2.setBounds(361, 0, 55, 18);
		panel_2_10_1_2.add(panel_8_10_1_2);

		final JTextField textField_13_11_7_1_2 = new JTextField();
		textField_13_11_7_1_2.setFocusable(false);
		textField_13_11_7_1_2.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_7_1_2.setBounds(0, 0, 55, 18);
		panel_8_10_1_2.add(textField_13_11_7_1_2);

		txtValuesUnderShirts = new JTextField();
		txtValuesUnderShirts.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesUnderShirts.setBounds(838, 0, 100, 18);
		panel_2_10_1_2.add(txtValuesUnderShirts);

		final JLabel acquiredAfterOriginalLabel_2 = new JLabel();
		acquiredAfterOriginalLabel_2
				.setText("NOTES ON ARTICLES(List of items damaged or lost,etc.)");
		acquiredAfterOriginalLabel_2.setBounds(501, 2, 313, 14);
		panel_2_10_1_2.add(acquiredAfterOriginalLabel_2);

		final JPanel panel_2_10_2_1 = new JPanel();
		panel_2_10_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_2_1.setLayout(null);
		panel_2_10_2_1.setBounds(0, 618, 938, 18);
		panel_1.add(panel_2_10_2_1);

		final JPanel panel_3_10_2_1 = new JPanel();
		panel_3_10_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_2_1.setLayout(null);
		panel_3_10_2_1.setBounds(0, 0, 92, 18);
		panel_2_10_2_1.add(panel_3_10_2_1);

		txtQuantityTies = new JTextField();
		txtQuantityTies.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityTies.setBounds(0, 0, 92, 18);
		panel_3_10_2_1.add(txtQuantityTies);

		final JPanel panel_4_11_2_1 = new JPanel();
		panel_4_11_2_1.setBackground(Color.WHITE);
		panel_4_11_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_2_1.setLayout(null);
		panel_4_11_2_1.setBounds(91, 0, 271, 18);
		panel_2_10_2_1.add(panel_4_11_2_1);

		final JLabel dressesLabel_1_10_2_1 = new JLabel();
		dressesLabel_1_10_2_1.setText("TIES");
		dressesLabel_1_10_2_1.setBounds(31, 2, 217, 14);
		panel_4_11_2_1.add(dressesLabel_1_10_2_1);

		final JPanel panel_8_10_2_1 = new JPanel();
		panel_8_10_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_2_1.setLayout(null);
		panel_8_10_2_1.setBounds(361, 0, 55, 18);
		panel_2_10_2_1.add(panel_8_10_2_1);

		final JTextField textField_13_11_7_2_1 = new JTextField();
		textField_13_11_7_2_1.setFocusable(false);
		textField_13_11_7_2_1.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_7_2_1.setBounds(0, 0, 55, 18);
		panel_8_10_2_1.add(textField_13_11_7_2_1);

		txtDescriptionTies = new JTextField();
		txtDescriptionTies.setBorder(new LineBorder(Color.black, 1, false));
		txtDescriptionTies.setBounds(414, 0, 425, 18);
		panel_2_10_2_1.add(txtDescriptionTies);

		txtValuesTies = new JTextField();
		txtValuesTies.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesTies.setBounds(838, 0, 100, 18);
		panel_2_10_2_1.add(txtValuesTies);

		final JPanel panel_2_10_2_2 = new JPanel();
		panel_2_10_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_2_2.setLayout(null);
		panel_2_10_2_2.setBounds(0, 636, 938, 18);
		panel_1.add(panel_2_10_2_2);

		final JPanel panel_3_10_2_2 = new JPanel();
		panel_3_10_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_2_2.setLayout(null);
		panel_3_10_2_2.setBounds(0, 0, 92, 18);
		panel_2_10_2_2.add(panel_3_10_2_2);

		txtQuantityBeltsSuspenders = new JTextField();
		txtQuantityBeltsSuspenders.setBorder(new LineBorder(Color.black, 1,
				false));
		txtQuantityBeltsSuspenders.setBounds(0, 0, 92, 18);
		panel_3_10_2_2.add(txtQuantityBeltsSuspenders);

		final JPanel panel_4_11_2_2 = new JPanel();
		panel_4_11_2_2.setBackground(Color.WHITE);
		panel_4_11_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_2_2.setLayout(null);
		panel_4_11_2_2.setBounds(91, 0, 271, 18);
		panel_2_10_2_2.add(panel_4_11_2_2);

		final JLabel dressesLabel_1_10_2_2 = new JLabel();
		dressesLabel_1_10_2_2.setText("BELTS SUSPENDERS");
		dressesLabel_1_10_2_2.setBounds(31, 2, 217, 14);
		panel_4_11_2_2.add(dressesLabel_1_10_2_2);

		final JPanel panel_8_10_2_2 = new JPanel();
		panel_8_10_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_2_2.setLayout(null);
		panel_8_10_2_2.setBounds(361, 0, 55, 18);
		panel_2_10_2_2.add(panel_8_10_2_2);

		final JTextField textField_13_11_7_2_2 = new JTextField();
		textField_13_11_7_2_2.setFocusable(false);
		textField_13_11_7_2_2.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_7_2_2.setBounds(0, 0, 55, 18);
		panel_8_10_2_2.add(textField_13_11_7_2_2);

		txtDescriptionBeltSuspenders = new JTextField();
		txtDescriptionBeltSuspenders.setBorder(new LineBorder(Color.black, 1,
				false));
		txtDescriptionBeltSuspenders.setBounds(414, 0, 425, 18);
		panel_2_10_2_2.add(txtDescriptionBeltSuspenders);

		txtValuesBeltSuspenders = new JTextField();
		txtValuesBeltSuspenders
				.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesBeltSuspenders.setBounds(838, 0, 100, 18);
		panel_2_10_2_2.add(txtValuesBeltSuspenders);

		final JPanel panel_2_10_2_3 = new JPanel();
		panel_2_10_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_2_3.setLayout(null);
		panel_2_10_2_3.setBounds(0, 654, 938, 18);
		panel_1.add(panel_2_10_2_3);

		final JPanel panel_3_10_2_3 = new JPanel();
		panel_3_10_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_2_3.setLayout(null);
		panel_3_10_2_3.setBounds(0, 0, 92, 18);
		panel_2_10_2_3.add(panel_3_10_2_3);

		txtQuantityMensHandkerChiefs = new JTextField();
		txtQuantityMensHandkerChiefs.setBorder(new LineBorder(Color.black, 1,
				false));
		txtQuantityMensHandkerChiefs.setBounds(0, 0, 92, 18);
		panel_3_10_2_3.add(txtQuantityMensHandkerChiefs);

		final JPanel panel_4_11_2_3 = new JPanel();
		panel_4_11_2_3.setBackground(Color.WHITE);
		panel_4_11_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_2_3.setLayout(null);
		panel_4_11_2_3.setBounds(91, 0, 271, 18);
		panel_2_10_2_3.add(panel_4_11_2_3);

		final JLabel dressesLabel_1_10_2_3 = new JLabel();
		dressesLabel_1_10_2_3.setText("MEN'S HANDKERCHIEFS");
		dressesLabel_1_10_2_3.setBounds(31, 2, 217, 14);
		panel_4_11_2_3.add(dressesLabel_1_10_2_3);

		final JPanel panel_8_10_2_3 = new JPanel();
		panel_8_10_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_2_3.setLayout(null);
		panel_8_10_2_3.setBounds(361, 0, 55, 18);
		panel_2_10_2_3.add(panel_8_10_2_3);

		final JTextField textField_13_11_7_2_3 = new JTextField();
		textField_13_11_7_2_3.setFocusable(false);
		textField_13_11_7_2_3.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_7_2_3.setBounds(0, 0, 55, 18);
		panel_8_10_2_3.add(textField_13_11_7_2_3);

		txtDescriptionMensHandkerChiefs = new JTextField();
		txtDescriptionMensHandkerChiefs.setBorder(new LineBorder(Color.black,
				1, false));
		txtDescriptionMensHandkerChiefs.setBounds(414, 0, 425, 18);
		panel_2_10_2_3.add(txtDescriptionMensHandkerChiefs);

		txtValuesMensHandkerChie = new JTextField();
		txtValuesMensHandkerChie
				.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesMensHandkerChie.setBounds(838, 0, 100, 18);
		panel_2_10_2_3.add(txtValuesMensHandkerChie);

		final JPanel panel_2_10_2_4 = new JPanel();
		panel_2_10_2_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_2_4.setLayout(null);
		panel_2_10_2_4.setBounds(0, 672, 938, 18);
		panel_1.add(panel_2_10_2_4);

		final JPanel panel_3_10_2_4 = new JPanel();
		panel_3_10_2_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_2_4.setLayout(null);
		panel_3_10_2_4.setBounds(0, 0, 92, 18);
		panel_2_10_2_4.add(panel_3_10_2_4);

		txtQuantityPajamas = new JTextField();
		txtQuantityPajamas.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityPajamas.setBounds(0, 0, 92, 18);
		panel_3_10_2_4.add(txtQuantityPajamas);

		final JPanel panel_4_11_2_4 = new JPanel();
		panel_4_11_2_4.setBackground(Color.WHITE);
		panel_4_11_2_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_2_4.setLayout(null);
		panel_4_11_2_4.setBounds(91, 0, 271, 18);
		panel_2_10_2_4.add(panel_4_11_2_4);

		final JLabel dressesLabel_1_10_2_4 = new JLabel();
		dressesLabel_1_10_2_4.setText("PAJAMAS");
		dressesLabel_1_10_2_4.setBounds(31, 2, 217, 14);
		panel_4_11_2_4.add(dressesLabel_1_10_2_4);

		final JPanel panel_8_10_2_4 = new JPanel();
		panel_8_10_2_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_2_4.setLayout(null);
		panel_8_10_2_4.setBounds(361, 0, 55, 18);
		panel_2_10_2_4.add(panel_8_10_2_4);

		final JTextField textField_13_11_7_2_4 = new JTextField();
		textField_13_11_7_2_4.setFocusable(false);
		textField_13_11_7_2_4.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_7_2_4.setBounds(0, 0, 55, 18);
		panel_8_10_2_4.add(textField_13_11_7_2_4);

		txtDescriptionPajamas = new JTextField();
		txtDescriptionPajamas.setBorder(new LineBorder(Color.black, 1, false));
		txtDescriptionPajamas.setBounds(414, 0, 425, 18);
		panel_2_10_2_4.add(txtDescriptionPajamas);

		txtValuesPajamas = new JTextField();
		txtValuesPajamas.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesPajamas.setBounds(838, 0, 100, 18);
		panel_2_10_2_4.add(txtValuesPajamas);

		final JPanel panel_2_10_2_5 = new JPanel();
		panel_2_10_2_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_2_5.setLayout(null);
		panel_2_10_2_5.setBounds(0, 690, 938, 18);
		panel_1.add(panel_2_10_2_5);

		final JPanel panel_3_10_2_5 = new JPanel();
		panel_3_10_2_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_2_5.setLayout(null);
		panel_3_10_2_5.setBounds(0, 0, 92, 18);
		panel_2_10_2_5.add(panel_3_10_2_5);

		txtQuantityRobes = new JTextField();
		txtQuantityRobes.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityRobes.setBounds(0, 0, 92, 18);
		panel_3_10_2_5.add(txtQuantityRobes);

		final JPanel panel_4_11_2_5 = new JPanel();
		panel_4_11_2_5.setBackground(Color.WHITE);
		panel_4_11_2_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_2_5.setLayout(null);
		panel_4_11_2_5.setBounds(91, 0, 271, 18);
		panel_2_10_2_5.add(panel_4_11_2_5);

		final JLabel dressesLabel_1_10_2_5 = new JLabel();
		dressesLabel_1_10_2_5.setText("ROBES");
		dressesLabel_1_10_2_5.setBounds(31, 2, 217, 14);
		panel_4_11_2_5.add(dressesLabel_1_10_2_5);

		final JPanel panel_8_10_2_5 = new JPanel();
		panel_8_10_2_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_2_5.setLayout(null);
		panel_8_10_2_5.setBounds(361, 0, 55, 18);
		panel_2_10_2_5.add(panel_8_10_2_5);

		final JTextField textField_13_11_7_2_5 = new JTextField();
		textField_13_11_7_2_5.setFocusable(false);
		textField_13_11_7_2_5.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_7_2_5.setBounds(0, 0, 55, 18);
		panel_8_10_2_5.add(textField_13_11_7_2_5);

		txtDescriptionRobes = new JTextField();
		txtDescriptionRobes.setBorder(new LineBorder(Color.black, 1, false));
		txtDescriptionRobes.setBounds(414, 0, 425, 18);
		panel_2_10_2_5.add(txtDescriptionRobes);

		txtValuesRobes = new JTextField();
		txtValuesRobes.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesRobes.setBounds(838, 0, 100, 18);
		panel_2_10_2_5.add(txtValuesRobes);

		final JPanel panel_2_10_2_6 = new JPanel();
		panel_2_10_2_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_2_6.setLayout(null);
		panel_2_10_2_6.setBounds(0, 708, 938, 18);
		panel_1.add(panel_2_10_2_6);

		final JPanel panel_3_10_2_6 = new JPanel();
		panel_3_10_2_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_2_6.setLayout(null);
		panel_3_10_2_6.setBounds(0, 0, 92, 18);
		panel_2_10_2_6.add(panel_3_10_2_6);

		txtQuantitySlippers = new JTextField();
		txtQuantitySlippers.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantitySlippers.setBounds(0, 0, 92, 18);
		panel_3_10_2_6.add(txtQuantitySlippers);

		final JPanel panel_4_11_2_6 = new JPanel();
		panel_4_11_2_6.setBackground(Color.WHITE);
		panel_4_11_2_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_2_6.setLayout(null);
		panel_4_11_2_6.setBounds(91, 0, 271, 18);
		panel_2_10_2_6.add(panel_4_11_2_6);

		final JLabel dressesLabel_1_10_2_6 = new JLabel();
		dressesLabel_1_10_2_6.setText("SLIPPERS");
		dressesLabel_1_10_2_6.setBounds(31, 2, 217, 14);
		panel_4_11_2_6.add(dressesLabel_1_10_2_6);

		final JPanel panel_8_10_2_6 = new JPanel();
		panel_8_10_2_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_2_6.setLayout(null);
		panel_8_10_2_6.setBounds(361, 0, 55, 18);
		panel_2_10_2_6.add(panel_8_10_2_6);

		final JTextField textField_13_11_7_2_6 = new JTextField();
		textField_13_11_7_2_6.setFocusable(false);
		textField_13_11_7_2_6.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_7_2_6.setBounds(0, 0, 55, 18);
		panel_8_10_2_6.add(textField_13_11_7_2_6);

		txtDescriptionSlippers = new JTextField();
		txtDescriptionSlippers.setBorder(new LineBorder(Color.black, 1, false));
		txtDescriptionSlippers.setBounds(414, 0, 425, 18);
		panel_2_10_2_6.add(txtDescriptionSlippers);

		txtValuesSlippers = new JTextField();
		txtValuesSlippers.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesSlippers.setBounds(838, 0, 100, 18);
		panel_2_10_2_6.add(txtValuesSlippers);

		final JPanel panel_2_10_2_7 = new JPanel();
		panel_2_10_2_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_2_7.setLayout(null);
		panel_2_10_2_7.setBounds(0, 726, 938, 18);
		panel_1.add(panel_2_10_2_7);

		final JPanel panel_3_10_2_7 = new JPanel();
		panel_3_10_2_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_2_7.setLayout(null);
		panel_3_10_2_7.setBounds(0, 0, 92, 18);
		panel_2_10_2_7.add(panel_3_10_2_7);

		txtQuantityShavingKit = new JTextField();
		txtQuantityShavingKit.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityShavingKit.setBounds(0, 0, 92, 18);
		panel_3_10_2_7.add(txtQuantityShavingKit);

		final JPanel panel_4_11_2_7 = new JPanel();
		panel_4_11_2_7.setBackground(Color.WHITE);
		panel_4_11_2_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_2_7.setLayout(null);
		panel_4_11_2_7.setBounds(91, 0, 271, 18);
		panel_2_10_2_7.add(panel_4_11_2_7);

		final JLabel dressesLabel_1_10_2_7 = new JLabel();
		dressesLabel_1_10_2_7.setText("SHAVING KIT");
		dressesLabel_1_10_2_7.setBounds(31, 2, 217, 14);
		panel_4_11_2_7.add(dressesLabel_1_10_2_7);

		final JPanel panel_8_10_2_7 = new JPanel();
		panel_8_10_2_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_2_7.setLayout(null);
		panel_8_10_2_7.setBounds(361, 0, 55, 18);
		panel_2_10_2_7.add(panel_8_10_2_7);

		final JTextField textField_13_11_7_2_7 = new JTextField();
		textField_13_11_7_2_7.setFocusable(false);
		textField_13_11_7_2_7.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_7_2_7.setBounds(0, 0, 55, 18);
		panel_8_10_2_7.add(textField_13_11_7_2_7);

		txtDescriptionShavingKit = new JTextField();
		txtDescriptionShavingKit
				.setBorder(new LineBorder(Color.black, 1, false));
		txtDescriptionShavingKit.setBounds(414, 0, 425, 18);
		panel_2_10_2_7.add(txtDescriptionShavingKit);

		txtValuesShavingKit = new JTextField();
		txtValuesShavingKit.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesShavingKit.setBounds(838, 0, 100, 18);
		panel_2_10_2_7.add(txtValuesShavingKit);

		final JPanel panel_2_10_2_8 = new JPanel();
		panel_2_10_2_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_2_8.setLayout(null);
		panel_2_10_2_8.setBounds(0, 744, 938, 18);
		panel_1.add(panel_2_10_2_8);

		final JPanel panel_3_10_2_8 = new JPanel();
		panel_3_10_2_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_2_8.setLayout(null);
		panel_3_10_2_8.setBounds(0, 0, 92, 18);
		panel_2_10_2_8.add(panel_3_10_2_8);

		txtQuantityTravellingBags = new JTextField();
		txtQuantityTravellingBags.setBorder(new LineBorder(Color.black, 1,
				false));
		txtQuantityTravellingBags.setBounds(0, 0, 92, 18);
		panel_3_10_2_8.add(txtQuantityTravellingBags);

		final JPanel panel_4_11_2_8 = new JPanel();
		panel_4_11_2_8.setBackground(Color.WHITE);
		panel_4_11_2_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_2_8.setLayout(null);
		panel_4_11_2_8.setBounds(91, 0, 271, 18);
		panel_2_10_2_8.add(panel_4_11_2_8);

		final JLabel dressesLabel_1_10_2_8 = new JLabel();
		dressesLabel_1_10_2_8.setText("TRAVELLING BAGS");
		dressesLabel_1_10_2_8.setBounds(31, 2, 217, 14);
		panel_4_11_2_8.add(dressesLabel_1_10_2_8);

		final JPanel panel_8_10_2_8 = new JPanel();
		panel_8_10_2_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_2_8.setLayout(null);
		panel_8_10_2_8.setBounds(361, 0, 55, 18);
		panel_2_10_2_8.add(panel_8_10_2_8);

		final JTextField textField_13_11_7_2_8 = new JTextField();
		textField_13_11_7_2_8.setFocusable(false);
		textField_13_11_7_2_8.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_7_2_8.setBounds(0, 0, 55, 18);
		panel_8_10_2_8.add(textField_13_11_7_2_8);

		txtDescriptionTravellingBags = new JTextField();
		txtDescriptionTravellingBags.setBorder(new LineBorder(Color.black, 1,
				false));
		txtDescriptionTravellingBags.setBounds(414, 0, 425, 18);
		panel_2_10_2_8.add(txtDescriptionTravellingBags);

		txtValuesTravellingBags = new JTextField();
		txtValuesTravellingBags
				.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesTravellingBags.setBounds(838, 0, 100, 18);
		panel_2_10_2_8.add(txtValuesTravellingBags);

		final JPanel panel_2_10_2_9 = new JPanel();
		panel_2_10_2_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_2_9.setLayout(null);
		panel_2_10_2_9.setBounds(0, 762, 938, 18);
		panel_1.add(panel_2_10_2_9);

		final JPanel panel_3_10_2_9 = new JPanel();
		panel_3_10_2_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_2_9.setLayout(null);
		panel_3_10_2_9.setBounds(0, 0, 92, 18);
		panel_2_10_2_9.add(panel_3_10_2_9);

		txtQuantityHearingAid = new JTextField();
		txtQuantityHearingAid.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityHearingAid.setBounds(0, 0, 92, 18);
		panel_3_10_2_9.add(txtQuantityHearingAid);

		final JPanel panel_4_11_2_9 = new JPanel();
		panel_4_11_2_9.setBackground(Color.WHITE);
		panel_4_11_2_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_2_9.setLayout(null);
		panel_4_11_2_9.setBounds(91, 0, 271, 18);
		panel_2_10_2_9.add(panel_4_11_2_9);

		final JLabel dressesLabel_1_10_2_9 = new JLabel();
		dressesLabel_1_10_2_9.setText("HEARING AID");
		dressesLabel_1_10_2_9.setBounds(31, 2, 217, 14);
		panel_4_11_2_9.add(dressesLabel_1_10_2_9);

		final JPanel panel_8_10_2_9 = new JPanel();
		panel_8_10_2_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_2_9.setLayout(null);
		panel_8_10_2_9.setBounds(361, 0, 55, 18);
		panel_2_10_2_9.add(panel_8_10_2_9);

		final JTextField textField_13_11_7_2_9 = new JTextField();
		textField_13_11_7_2_9.setFocusable(false);
		textField_13_11_7_2_9.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_7_2_9.setBounds(0, 0, 55, 18);
		panel_8_10_2_9.add(textField_13_11_7_2_9);

		txtDescriptionHearingAid = new JTextField();
		txtDescriptionHearingAid
				.setBorder(new LineBorder(Color.black, 1, false));
		txtDescriptionHearingAid.setBounds(414, 0, 425, 18);
		panel_2_10_2_9.add(txtDescriptionHearingAid);

		txtValuesHearingAid = new JTextField();
		txtValuesHearingAid.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesHearingAid.setBounds(838, 0, 100, 18);
		panel_2_10_2_9.add(txtValuesHearingAid);

		final JPanel panel_2_10_2_10 = new JPanel();
		panel_2_10_2_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_2_10.setLayout(null);
		panel_2_10_2_10.setBounds(0, 780, 938, 18);
		panel_1.add(panel_2_10_2_10);

		final JPanel panel_3_10_2_10 = new JPanel();
		panel_3_10_2_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_2_10.setLayout(null);
		panel_3_10_2_10.setBounds(0, 0, 92, 18);
		panel_2_10_2_10.add(panel_3_10_2_10);

		txtQuantityDentures = new JTextField();
		txtQuantityDentures.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityDentures.setBounds(0, 0, 92, 18);
		panel_3_10_2_10.add(txtQuantityDentures);

		final JPanel panel_4_11_2_10 = new JPanel();
		panel_4_11_2_10.setBackground(Color.WHITE);
		panel_4_11_2_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_2_10.setLayout(null);
		panel_4_11_2_10.setBounds(91, 0, 271, 18);
		panel_2_10_2_10.add(panel_4_11_2_10);

		final JLabel dressesLabel_1_10_2_10 = new JLabel();
		dressesLabel_1_10_2_10.setText("DENTURES");
		dressesLabel_1_10_2_10.setBounds(31, 2, 217, 14);
		panel_4_11_2_10.add(dressesLabel_1_10_2_10);

		final JPanel panel_8_10_2_10 = new JPanel();
		panel_8_10_2_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_2_10.setLayout(null);
		panel_8_10_2_10.setBounds(361, 0, 55, 18);
		panel_2_10_2_10.add(panel_8_10_2_10);

		final JTextField textField_13_11_7_2_10 = new JTextField();
		textField_13_11_7_2_10.setFocusable(false);
		textField_13_11_7_2_10.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_7_2_10.setBounds(0, 0, 55, 18);
		panel_8_10_2_10.add(textField_13_11_7_2_10);

		txtDescriptionDentures = new JTextField();
		txtDescriptionDentures.setBorder(new LineBorder(Color.black, 1, false));
		txtDescriptionDentures.setBounds(414, 0, 425, 18);
		panel_2_10_2_10.add(txtDescriptionDentures);

		txtValuesDentures = new JTextField();
		txtValuesDentures.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesDentures.setBounds(838, 0, 100, 18);
		panel_2_10_2_10.add(txtValuesDentures);

		final JPanel panel_2_10_2_11 = new JPanel();
		panel_2_10_2_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_2_11.setLayout(null);
		panel_2_10_2_11.setBounds(0, 798, 938, 18);
		panel_1.add(panel_2_10_2_11);

		final JPanel panel_3_10_2_11 = new JPanel();
		panel_3_10_2_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_2_11.setLayout(null);
		panel_3_10_2_11.setBounds(0, 0, 92, 18);
		panel_2_10_2_11.add(panel_3_10_2_11);

		txtQuantityGlasses = new JTextField();
		txtQuantityGlasses.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityGlasses.setBounds(0, 0, 92, 18);
		panel_3_10_2_11.add(txtQuantityGlasses);

		final JPanel panel_4_11_2_11 = new JPanel();
		panel_4_11_2_11.setBackground(Color.WHITE);
		panel_4_11_2_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_2_11.setLayout(null);
		panel_4_11_2_11.setBounds(91, 0, 271, 18);
		panel_2_10_2_11.add(panel_4_11_2_11);

		final JLabel dressesLabel_1_10_2_11 = new JLabel();
		dressesLabel_1_10_2_11.setText("GLASSES");
		dressesLabel_1_10_2_11.setBounds(31, 2, 217, 14);
		panel_4_11_2_11.add(dressesLabel_1_10_2_11);

		final JPanel panel_8_10_2_11 = new JPanel();
		panel_8_10_2_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_2_11.setLayout(null);
		panel_8_10_2_11.setBounds(361, 0, 55, 18);
		panel_2_10_2_11.add(panel_8_10_2_11);

		final JTextField textField_13_11_7_2_11 = new JTextField();
		textField_13_11_7_2_11.setFocusable(false);
		textField_13_11_7_2_11.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_7_2_11.setBounds(0, 0, 55, 18);
		panel_8_10_2_11.add(textField_13_11_7_2_11);

		txtDescriptionGlasses = new JTextField();
		txtDescriptionGlasses.setBorder(new LineBorder(Color.black, 1, false));
		txtDescriptionGlasses.setBounds(414, 0, 425, 18);
		panel_2_10_2_11.add(txtDescriptionGlasses);

		txtValuesGlasses = new JTextField();
		txtValuesGlasses.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesGlasses.setBounds(838, 0, 100, 18);
		panel_2_10_2_11.add(txtValuesGlasses);

		final JPanel panel_2_10_2_12 = new JPanel();
		panel_2_10_2_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_2_12.setLayout(null);
		panel_2_10_2_12.setBounds(0, 816, 938, 18);
		panel_1.add(panel_2_10_2_12);

		final JPanel panel_3_10_2_12 = new JPanel();
		panel_3_10_2_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_2_12.setLayout(null);
		panel_3_10_2_12.setBounds(0, 0, 92, 18);
		panel_2_10_2_12.add(panel_3_10_2_12);

		txtQuantityOthers = new JTextField();
		txtQuantityOthers.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityOthers.setBounds(0, 0, 92, 18);
		panel_3_10_2_12.add(txtQuantityOthers);

		final JPanel panel_4_11_2_12 = new JPanel();
		panel_4_11_2_12.setBackground(Color.WHITE);
		panel_4_11_2_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_2_12.setLayout(null);
		panel_4_11_2_12.setBounds(91, 0, 271, 18);
		panel_2_10_2_12.add(panel_4_11_2_12);

		final JLabel dressesLabel_1_10_2_12 = new JLabel();
		dressesLabel_1_10_2_12.setText("OTHERS");
		dressesLabel_1_10_2_12.setBounds(31, 2, 217, 14);
		panel_4_11_2_12.add(dressesLabel_1_10_2_12);

		final JPanel panel_8_10_2_12 = new JPanel();
		panel_8_10_2_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_2_12.setLayout(null);
		panel_8_10_2_12.setBounds(361, 0, 55, 18);
		panel_2_10_2_12.add(panel_8_10_2_12);

		final JTextField textField_13_11_7_2_12 = new JTextField();
		textField_13_11_7_2_12.setFocusable(false);
		textField_13_11_7_2_12.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_7_2_12.setBounds(0, 0, 55, 18);
		panel_8_10_2_12.add(textField_13_11_7_2_12);

		txtDescriptionOthers = new JTextField();
		txtDescriptionOthers.setBorder(new LineBorder(Color.black, 1, false));
		txtDescriptionOthers.setBounds(414, 0, 425, 18);
		panel_2_10_2_12.add(txtDescriptionOthers);

		txtValuesOthers = new JTextField();
		txtValuesOthers.setBorder(new LineBorder(Color.black, 1, false));
		txtValuesOthers.setBounds(838, 0, 100, 18);
		panel_2_10_2_12.add(txtValuesOthers);

		final JPanel panel_2_10_2_13 = new JPanel();
		panel_2_10_2_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_2_13.setLayout(null);
		panel_2_10_2_13.setBounds(0, 834, 938, 18);
		panel_1.add(panel_2_10_2_13);

		final JPanel panel_3_10_2_13 = new JPanel();
		panel_3_10_2_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_2_13.setLayout(null);
		panel_3_10_2_13.setBounds(0, 0, 92, 18);
		panel_2_10_2_13.add(panel_3_10_2_13);

		final JTextField txtQuantityOther1 = new JTextField();
		txtQuantityOther1.setFocusable(false);
		txtQuantityOther1.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityOther1.setBounds(0, 0, 92, 18);
		panel_3_10_2_13.add(txtQuantityOther1);

		final JPanel panel_4_11_2_13 = new JPanel();
		panel_4_11_2_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_2_13.setLayout(null);
		panel_4_11_2_13.setBounds(91, 0, 271, 18);
		panel_2_10_2_13.add(panel_4_11_2_13);

		final JTextField txtArticleOther1 = new JTextField();
		txtArticleOther1.setFocusable(false);
		txtArticleOther1.setText("");
		txtArticleOther1.setBorder(new LineBorder(Color.BLACK, 1));
		txtArticleOther1.setBounds(0, 0, 271, 18);
		panel_4_11_2_13.add(txtArticleOther1);

		final JPanel panel_8_10_2_13 = new JPanel();
		panel_8_10_2_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_2_13.setLayout(null);
		panel_8_10_2_13.setBounds(361, 0, 55, 18);
		panel_2_10_2_13.add(panel_8_10_2_13);

		final JTextField textField_13_11_7_2_13 = new JTextField();
		textField_13_11_7_2_13.setFocusable(false);
		textField_13_11_7_2_13.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_7_2_13.setBounds(0, 0, 55, 18);
		panel_8_10_2_13.add(textField_13_11_7_2_13);

		final JTextField textField_11_1_13 = new JTextField();
		textField_11_1_13.setFocusable(false);
		textField_11_1_13.setBorder(new LineBorder(Color.black, 1, false));
		textField_11_1_13.setBounds(414, 0, 425, 18);
		panel_2_10_2_13.add(textField_11_1_13);

		final JTextField textField_1_10_2_13 = new JTextField();
		textField_1_10_2_13.setFocusable(false);
		textField_1_10_2_13.setBorder(new LineBorder(Color.black, 1, false));
		textField_1_10_2_13.setBounds(838, 0, 100, 18);
		panel_2_10_2_13.add(textField_1_10_2_13);

		final JPanel panel_2_10_2_14 = new JPanel();
		panel_2_10_2_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_2_14.setLayout(null);
		panel_2_10_2_14.setBounds(0, 852, 938, 18);
		panel_1.add(panel_2_10_2_14);

		final JPanel panel_3_10_2_14 = new JPanel();
		panel_3_10_2_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_2_14.setLayout(null);
		panel_3_10_2_14.setBounds(0, 0, 92, 18);
		panel_2_10_2_14.add(panel_3_10_2_14);

		final JTextField txtQuantityOther2 = new JTextField();
		txtQuantityOther2.setFocusable(false);
		txtQuantityOther2.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityOther2.setBounds(0, 0, 92, 18);
		panel_3_10_2_14.add(txtQuantityOther2);

		final JPanel panel_4_11_2_14 = new JPanel();
		panel_4_11_2_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_2_14.setLayout(null);
		panel_4_11_2_14.setBounds(91, 0, 271, 18);
		panel_2_10_2_14.add(panel_4_11_2_14);

		final JTextField txtArticleOther2 = new JTextField();
		txtArticleOther2.setFocusable(false);
		txtArticleOther2.setBorder(new LineBorder(Color.BLACK, 1, false));
		txtArticleOther2.setBounds(0, 0, 271, 18);
		panel_4_11_2_14.add(txtArticleOther2);

		final JPanel panel_8_10_2_14 = new JPanel();
		panel_8_10_2_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_2_14.setLayout(null);
		panel_8_10_2_14.setBounds(361, 0, 55, 18);
		panel_2_10_2_14.add(panel_8_10_2_14);

		final JTextField textField_13_11_7_2_14 = new JTextField();
		textField_13_11_7_2_14.setFocusable(false);
		textField_13_11_7_2_14.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_7_2_14.setBounds(0, 0, 55, 18);
		panel_8_10_2_14.add(textField_13_11_7_2_14);

		final JTextField textField_11_1_14 = new JTextField();
		textField_11_1_14.setFocusable(false);
		textField_11_1_14.setBorder(new LineBorder(Color.black, 1, false));
		textField_11_1_14.setBounds(414, 0, 425, 18);
		panel_2_10_2_14.add(textField_11_1_14);

		final JTextField textField_1_10_2_14 = new JTextField();
		textField_1_10_2_14.setFocusable(false);
		textField_1_10_2_14.setBorder(new LineBorder(Color.black, 1, false));
		textField_1_10_2_14.setBounds(838, 0, 100, 18);
		panel_2_10_2_14.add(textField_1_10_2_14);

		final JPanel panel_2_10_2_15 = new JPanel();
		panel_2_10_2_15.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_2_15.setLayout(null);
		panel_2_10_2_15.setBounds(0, 870, 938, 18);
		panel_1.add(panel_2_10_2_15);

		final JPanel panel_3_10_2_15 = new JPanel();
		panel_3_10_2_15.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_2_15.setLayout(null);
		panel_3_10_2_15.setBounds(0, 0, 92, 18);
		panel_2_10_2_15.add(panel_3_10_2_15);

		final JTextField txtQuantityOther3 = new JTextField();
		txtQuantityOther3.setFocusable(false);
		txtQuantityOther3.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityOther3.setBounds(0, 0, 92, 18);
		panel_3_10_2_15.add(txtQuantityOther3);

		final JPanel panel_4_11_2_15 = new JPanel();
		panel_4_11_2_15.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_2_15.setLayout(null);
		panel_4_11_2_15.setBounds(91, 0, 271, 18);
		panel_2_10_2_15.add(panel_4_11_2_15);

		final JTextField txtArticleOther3 = new JTextField();
		txtArticleOther3.setFocusable(false);
		txtArticleOther3.setBorder(new LineBorder(Color.BLACK, 1, false));
		txtArticleOther3.setBounds(0, 0, 271, 18);
		panel_4_11_2_15.add(txtArticleOther3);

		final JPanel panel_8_10_2_15 = new JPanel();
		panel_8_10_2_15.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_2_15.setLayout(null);
		panel_8_10_2_15.setBounds(361, 0, 55, 18);
		panel_2_10_2_15.add(panel_8_10_2_15);

		final JTextField textField_13_11_7_2_15 = new JTextField();
		textField_13_11_7_2_15.setFocusable(false);
		textField_13_11_7_2_15.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_7_2_15.setBounds(0, 0, 55, 18);
		panel_8_10_2_15.add(textField_13_11_7_2_15);

		final JTextField textField_11_1_15 = new JTextField();
		textField_11_1_15.setFocusable(false);
		textField_11_1_15.setBorder(new LineBorder(Color.black, 1, false));
		textField_11_1_15.setBounds(414, 0, 425, 18);
		panel_2_10_2_15.add(textField_11_1_15);

		final JTextField textField_1_10_2_15 = new JTextField();
		textField_1_10_2_15.setFocusable(false);
		textField_1_10_2_15.setBorder(new LineBorder(Color.black, 1, false));
		textField_1_10_2_15.setBounds(838, 0, 100, 18);
		panel_2_10_2_15.add(textField_1_10_2_15);

		final JPanel panel_2_10_2_16 = new JPanel();
		panel_2_10_2_16.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_2_16.setLayout(null);
		panel_2_10_2_16.setBounds(0, 888, 938, 18);
		panel_1.add(panel_2_10_2_16);

		final JPanel panel_3_10_2_16 = new JPanel();
		panel_3_10_2_16.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_2_16.setLayout(null);
		panel_3_10_2_16.setBounds(0, 0, 92, 18);
		panel_2_10_2_16.add(panel_3_10_2_16);

		final JTextField txtQuantityOther4 = new JTextField();
		txtQuantityOther4.setFocusable(false);
		txtQuantityOther4.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityOther4.setBounds(0, 0, 92, 18);
		panel_3_10_2_16.add(txtQuantityOther4);

		final JPanel panel_4_11_2_16 = new JPanel();
		panel_4_11_2_16.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_2_16.setLayout(null);
		panel_4_11_2_16.setBounds(91, 0, 271, 18);
		panel_2_10_2_16.add(panel_4_11_2_16);

		final JTextField txtArticleOther4 = new JTextField();
		txtArticleOther4.setFocusable(false);
		txtArticleOther4.setBorder(new LineBorder(Color.BLACK, 1, false));
		txtArticleOther4.setBounds(0, 0, 271, 18);
		panel_4_11_2_16.add(txtArticleOther4);

		final JPanel panel_8_10_2_16 = new JPanel();
		panel_8_10_2_16.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_2_16.setLayout(null);
		panel_8_10_2_16.setBounds(361, 0, 55, 18);
		panel_2_10_2_16.add(panel_8_10_2_16);

		final JTextField textField_13_11_7_2_16 = new JTextField();
		textField_13_11_7_2_16.setFocusable(false);
		textField_13_11_7_2_16.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_7_2_16.setBounds(0, 0, 55, 18);
		panel_8_10_2_16.add(textField_13_11_7_2_16);

		final JTextField textField_11_1_16 = new JTextField();
		textField_11_1_16.setFocusable(false);
		textField_11_1_16.setBorder(new LineBorder(Color.black, 1, false));
		textField_11_1_16.setBounds(414, 0, 425, 18);
		panel_2_10_2_16.add(textField_11_1_16);

		final JTextField textField_1_10_2_16 = new JTextField();
		textField_1_10_2_16.setFocusable(false);
		textField_1_10_2_16.setBorder(new LineBorder(Color.black, 1, false));
		textField_1_10_2_16.setBounds(838, 0, 100, 18);
		panel_2_10_2_16.add(textField_1_10_2_16);

		final JPanel panel_2_10_2_17 = new JPanel();
		panel_2_10_2_17.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_2_17.setLayout(null);
		panel_2_10_2_17.setBounds(0, 906, 938, 18);
		panel_1.add(panel_2_10_2_17);

		final JPanel panel_3_10_2_17 = new JPanel();
		panel_3_10_2_17.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_2_17.setLayout(null);
		panel_3_10_2_17.setBounds(0, 0, 92, 18);
		panel_2_10_2_17.add(panel_3_10_2_17);

		final JTextField txtQuantityOther5 = new JTextField();
		txtQuantityOther5.setFocusable(false);
		txtQuantityOther5.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityOther5.setBounds(0, 0, 92, 18);
		panel_3_10_2_17.add(txtQuantityOther5);

		final JPanel panel_4_11_2_17 = new JPanel();
		panel_4_11_2_17.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_2_17.setLayout(null);
		panel_4_11_2_17.setBounds(91, 0, 271, 18);
		panel_2_10_2_17.add(panel_4_11_2_17);

		final JTextField txtArticleOther5 = new JTextField();
		txtArticleOther5.setFocusable(false);
		txtArticleOther5.setBorder(new LineBorder(Color.BLACK, 1, false));
		txtArticleOther5.setBounds(0, 0, 271, 18);
		panel_4_11_2_17.add(txtArticleOther5);

		final JPanel panel_8_10_2_17 = new JPanel();
		panel_8_10_2_17.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_2_17.setLayout(null);
		panel_8_10_2_17.setBounds(361, 0, 55, 18);
		panel_2_10_2_17.add(panel_8_10_2_17);

		final JTextField textField_13_11_7_2_17 = new JTextField();
		textField_13_11_7_2_17.setFocusable(false);
		textField_13_11_7_2_17.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_7_2_17.setBounds(0, 0, 55, 18);
		panel_8_10_2_17.add(textField_13_11_7_2_17);

		final JTextField textField_11_1_17 = new JTextField();
		textField_11_1_17.setFocusable(false);
		textField_11_1_17.setBorder(new LineBorder(Color.black, 1, false));
		textField_11_1_17.setBounds(414, 0, 425, 18);
		panel_2_10_2_17.add(textField_11_1_17);

		final JTextField textField_1_10_2_17 = new JTextField();
		textField_1_10_2_17.setFocusable(false);
		textField_1_10_2_17.setBorder(new LineBorder(Color.black, 1, false));
		textField_1_10_2_17.setBounds(838, 0, 100, 18);
		panel_2_10_2_17.add(textField_1_10_2_17);

		final JPanel panel_2_10_2_18 = new JPanel();
		panel_2_10_2_18.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_2_18.setLayout(null);
		panel_2_10_2_18.setBounds(0, 924, 938, 18);
		panel_1.add(panel_2_10_2_18);

		final JPanel panel_3_10_2_18 = new JPanel();
		panel_3_10_2_18.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_2_18.setLayout(null);
		panel_3_10_2_18.setBounds(0, 0, 92, 18);
		panel_2_10_2_18.add(panel_3_10_2_18);

		final JTextField txtQuantityOther6 = new JTextField();
		txtQuantityOther6.setFocusable(false);
		txtQuantityOther6.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityOther6.setBounds(0, 0, 92, 18);
		panel_3_10_2_18.add(txtQuantityOther6);

		final JPanel panel_4_11_2_18 = new JPanel();
		panel_4_11_2_18.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_2_18.setLayout(null);
		panel_4_11_2_18.setBounds(91, 0, 271, 18);
		panel_2_10_2_18.add(panel_4_11_2_18);

		final JTextField txtArticleOther6 = new JTextField();
		txtArticleOther6.setFocusable(false);
		txtArticleOther6.setBorder(new LineBorder(Color.BLACK, 1, false));
		txtArticleOther6.setBounds(0, 0, 271, 18);
		panel_4_11_2_18.add(txtArticleOther6);

		final JPanel panel_8_10_2_18 = new JPanel();
		panel_8_10_2_18.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_2_18.setLayout(null);
		panel_8_10_2_18.setBounds(361, 0, 55, 18);
		panel_2_10_2_18.add(panel_8_10_2_18);

		final JTextField textField_13_11_7_2_18 = new JTextField();
		textField_13_11_7_2_18.setFocusable(false);
		textField_13_11_7_2_18.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_7_2_18.setBounds(0, 0, 55, 18);
		panel_8_10_2_18.add(textField_13_11_7_2_18);

		final JTextField textField_11_1_18 = new JTextField();
		textField_11_1_18.setFocusable(false);
		textField_11_1_18.setBorder(new LineBorder(Color.black, 1, false));
		textField_11_1_18.setBounds(414, 0, 425, 18);
		panel_2_10_2_18.add(textField_11_1_18);

		final JTextField textField_1_10_2_18 = new JTextField();
		textField_1_10_2_18.setFocusable(false);
		textField_1_10_2_18.setBorder(new LineBorder(Color.black, 1, false));
		textField_1_10_2_18.setBounds(838, 0, 100, 18);
		panel_2_10_2_18.add(textField_1_10_2_18);

		final JPanel panel_2_10_2_19 = new JPanel();
		panel_2_10_2_19.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_2_19.setLayout(null);
		panel_2_10_2_19.setBounds(0, 942, 938, 18);
		panel_1.add(panel_2_10_2_19);

		final JPanel panel_3_10_2_19 = new JPanel();
		panel_3_10_2_19.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_2_19.setLayout(null);
		panel_3_10_2_19.setBounds(0, 0, 92, 18);
		panel_2_10_2_19.add(panel_3_10_2_19);

		final JTextField txtQuantityOther7 = new JTextField();
		txtQuantityOther7.setFocusable(false);
		txtQuantityOther7.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityOther7.setBounds(0, 0, 92, 18);
		panel_3_10_2_19.add(txtQuantityOther7);

		final JPanel panel_8_10_2_19 = new JPanel();
		panel_8_10_2_19.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_2_19.setLayout(null);
		panel_8_10_2_19.setBounds(361, 0, 55, 18);
		panel_2_10_2_19.add(panel_8_10_2_19);

		final JTextField textField_13_11_7_2_19 = new JTextField();
		textField_13_11_7_2_19.setFocusable(false);
		textField_13_11_7_2_19.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_7_2_19.setBounds(0, 0, 55, 18);
		panel_8_10_2_19.add(textField_13_11_7_2_19);

		final JTextField textField_11_1_19 = new JTextField();
		textField_11_1_19.setFocusable(false);
		textField_11_1_19.setBorder(new LineBorder(Color.black, 1, false));
		textField_11_1_19.setBounds(414, 0, 425, 18);
		panel_2_10_2_19.add(textField_11_1_19);

		final JTextField textField_1_10_2_19 = new JTextField();
		textField_1_10_2_19.setFocusable(false);
		textField_1_10_2_19.setBorder(new LineBorder(Color.black, 1, false));
		textField_1_10_2_19.setBounds(838, 0, 100, 18);
		panel_2_10_2_19.add(textField_1_10_2_19);

		final JTextField txtArticleOther7 = new JTextField();
		txtArticleOther7.setFocusable(false);
		txtArticleOther7.setBorder(new LineBorder(Color.BLACK, 1, false));
		txtArticleOther7.setBounds(91, 0, 272, 18);
		panel_2_10_2_19.add(txtArticleOther7);

		final JPanel panel_2_10_2_20 = new JPanel();
		panel_2_10_2_20.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_2_20.setLayout(null);
		panel_2_10_2_20.setBounds(0, 960, 938, 18);
		panel_1.add(panel_2_10_2_20);

		final JPanel panel_3_10_2_20 = new JPanel();
		panel_3_10_2_20.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_2_20.setLayout(null);
		panel_3_10_2_20.setBounds(0, 0, 92, 18);
		panel_2_10_2_20.add(panel_3_10_2_20);

		final JTextField txtQuantityOther8 = new JTextField();
		txtQuantityOther8.setFocusable(false);
		txtQuantityOther8.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityOther8.setBounds(0, 0, 92, 18);
		panel_3_10_2_20.add(txtQuantityOther8);

		final JPanel panel_4_11_2_20 = new JPanel();
		panel_4_11_2_20.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_2_20.setLayout(null);
		panel_4_11_2_20.setBounds(91, 0, 271, 18);
		panel_2_10_2_20.add(panel_4_11_2_20);

		final JTextField txtArticleOther8 = new JTextField();
		txtArticleOther8.setFocusable(false);
		txtArticleOther8.setBorder(new LineBorder(Color.BLACK, 1, false));
		txtArticleOther8.setBounds(0, 0, 271, 18);
		panel_4_11_2_20.add(txtArticleOther8);

		final JPanel panel_8_10_2_20 = new JPanel();
		panel_8_10_2_20.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_2_20.setLayout(null);
		panel_8_10_2_20.setBounds(361, 0, 55, 18);
		panel_2_10_2_20.add(panel_8_10_2_20);

		final JTextField textField_13_11_7_2_20 = new JTextField();
		textField_13_11_7_2_20.setFocusable(false);
		textField_13_11_7_2_20.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_7_2_20.setBounds(0, 0, 55, 18);
		panel_8_10_2_20.add(textField_13_11_7_2_20);

		final JTextField textField_11_1_20 = new JTextField();
		textField_11_1_20.setFocusable(false);
		textField_11_1_20.setBorder(new LineBorder(Color.black, 1, false));
		textField_11_1_20.setBounds(414, 0, 425, 18);
		panel_2_10_2_20.add(textField_11_1_20);

		final JTextField textField_1_10_2_20 = new JTextField();
		textField_1_10_2_20.setFocusable(false);
		textField_1_10_2_20.setBorder(new LineBorder(Color.black, 1, false));
		textField_1_10_2_20.setBounds(838, 0, 100, 18);
		panel_2_10_2_20.add(textField_1_10_2_20);

		final JPanel panel_2_10_2_21 = new JPanel();
		panel_2_10_2_21.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_10_2_21.setLayout(null);
		panel_2_10_2_21.setBounds(0, 978, 938, 18);
		panel_1.add(panel_2_10_2_21);

		final JPanel panel_3_10_2_21 = new JPanel();
		panel_3_10_2_21.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_10_2_21.setLayout(null);
		panel_3_10_2_21.setBounds(0, 0, 92, 18);
		panel_2_10_2_21.add(panel_3_10_2_21);

		final JTextField txtQuantityOther9 = new JTextField();
		txtQuantityOther9.setFocusable(false);
		txtQuantityOther9.setBorder(new LineBorder(Color.black, 1, false));
		txtQuantityOther9.setBounds(0, 0, 92, 18);
		panel_3_10_2_21.add(txtQuantityOther9);

		final JPanel panel_4_11_2_21 = new JPanel();
		panel_4_11_2_21.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_11_2_21.setLayout(null);
		panel_4_11_2_21.setBounds(91, 0, 271, 18);
		panel_2_10_2_21.add(panel_4_11_2_21);

		final JTextField txtArticleOther9 = new JTextField();
		txtArticleOther9.setFocusable(false);
		txtArticleOther9.setBorder(new LineBorder(Color.BLACK, 1, false));
		txtArticleOther9.setBounds(0, 0, 271, 18);
		panel_4_11_2_21.add(txtArticleOther9);

		final JPanel panel_8_10_2_21 = new JPanel();
		panel_8_10_2_21.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_10_2_21.setLayout(null);
		panel_8_10_2_21.setBounds(361, 0, 55, 18);
		panel_2_10_2_21.add(panel_8_10_2_21);

		final JTextField textField_13_11_7_2_21 = new JTextField();
		textField_13_11_7_2_21.setFocusable(false);
		textField_13_11_7_2_21.setBorder(new LineBorder(Color.black, 1, false));
		textField_13_11_7_2_21.setBounds(0, 0, 55, 18);
		panel_8_10_2_21.add(textField_13_11_7_2_21);

		final JTextField textField_11_1_21 = new JTextField();
		textField_11_1_21.setFocusable(false);
		textField_11_1_21.setBorder(new LineBorder(Color.black, 1, false));
		textField_11_1_21.setBounds(414, 0, 425, 18);
		panel_2_10_2_21.add(textField_11_1_21);

		final JTextField textField_1_10_2_21 = new JTextField();
		textField_1_10_2_21.setFocusable(false);
		textField_1_10_2_21.setBorder(new LineBorder(Color.black, 1, false));
		textField_1_10_2_21.setBounds(838, 0, 100, 18);
		panel_2_10_2_21.add(textField_1_10_2_21);

		final JPanel panel_2_1_2_2 = new JPanel();
		panel_2_1_2_2.setBackground(Color.WHITE);
		panel_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_2_2.setLayout(null);
		panel_2_1_2_2.setBounds(0, 996, 938, 32);
		panel_1.add(panel_2_1_2_2);

		final JLabel patientNameLabel_1_1_2 = new JLabel();
		patientNameLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		patientNameLabel_1_1_2.setText("REMARKS");
		patientNameLabel_1_1_2.setBounds(10, 0, 144, 32);
		panel_2_1_2_2.add(patientNameLabel_1_1_2);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(103, 5, 825, 22);
		panel_2_1_2_2.add(scrollPane);

		txtRemarks = new JTextArea();
		txtRemarks.setBorder(new LineBorder(Color.black, 1, false));
		scrollPane.setViewportView(txtRemarks);

		final JPanel panel_2_1_2_2_1 = new JPanel();
		panel_2_1_2_2_1.setBackground(Color.WHITE);
		panel_2_1_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_2_2_1.setLayout(null);
		panel_2_1_2_2_1.setBounds(0, 1028, 938, 32);
		panel_1.add(panel_2_1_2_2_1);

		final JLabel patientNameLabel_1_1_2_1 = new JLabel();
		patientNameLabel_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		patientNameLabel_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		patientNameLabel_1_1_2_1.setText("CERTIFICATION OF RECIEPT");
		patientNameLabel_1_1_2_1.setBounds(10, 0, 846, 32);
		panel_2_1_2_2_1.add(patientNameLabel_1_1_2_1);

		final JPanel panel_2_1_2_3 = new JPanel();
		panel_2_1_2_3.setBackground(Color.WHITE);
		panel_2_1_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_2_3.setLayout(null);
		panel_2_1_2_3.setBounds(0, 1060, 938, 32);
		panel_1.add(panel_2_1_2_3);

		final JLabel patientNameLabel_1_1_3 = new JLabel();
		patientNameLabel_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		patientNameLabel_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		patientNameLabel_1_1_3.setText("ON ADMISSION");
		patientNameLabel_1_1_3.setBounds(10, 0, 378, 32);
		panel_2_1_2_3.add(patientNameLabel_1_1_3);

		final JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setBackground(Color.WHITE);
		panel_4_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1_1.setLayout(null);
		panel_4_1_1.setBounds(459, 0, 479, 32);
		panel_2_1_2_3.add(panel_4_1_1);

		final JLabel dateOfInventoryLabel_2_1 = new JLabel();
		dateOfInventoryLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		dateOfInventoryLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		dateOfInventoryLabel_2_1.setText("ON DISCHARGE");
		dateOfInventoryLabel_2_1.setBounds(10, 0, 449, 22);
		panel_4_1_1.add(dateOfInventoryLabel_2_1);

		final JPanel panel_2_1_2_4 = new JPanel();
		panel_2_1_2_4.setBackground(Color.WHITE);
		panel_2_1_2_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_2_4.setLayout(null);
		panel_2_1_2_4.setBounds(0, 1091, 938, 32);
		panel_1.add(panel_2_1_2_4);

		final JLabel patientNameLabel_1_1_4 = new JLabel();
		patientNameLabel_1_1_4.setText("SIGNED");
		patientNameLabel_1_1_4.setBounds(10, 0, 37, 32);
		panel_2_1_2_4.add(patientNameLabel_1_1_4);

		final JPanel panel_4_1_3 = new JPanel();
		panel_4_1_3.setBackground(Color.WHITE);
		panel_4_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1_3.setLayout(null);
		panel_4_1_3.setBounds(459, 0, 479, 32);
		panel_2_1_2_4.add(panel_4_1_3);

		final JLabel patientNameLabel_1_1_4_1 = new JLabel();
		patientNameLabel_1_1_4_1.setText("SIGNED");
		patientNameLabel_1_1_4_1.setBounds(10, 0, 37, 32);
		panel_4_1_3.add(patientNameLabel_1_1_4_1);

		final JLabel patientOrResponsibleLabel_1 = new JLabel();
		patientOrResponsibleLabel_1.setText("PATIENT OR RESPONSIBLE PARTY");
		patientOrResponsibleLabel_1.setBounds(53, 9, 173, 14);
		panel_4_1_3.add(patientOrResponsibleLabel_1);

		txtSignResponsiblePartyOnDischarge = new JTextField();
		txtSignResponsiblePartyOnDischarge.setBorder(new LineBorder(
				Color.black, 1, false));
		txtSignResponsiblePartyOnDischarge.setBounds(249, 7, 129, 18);
		panel_4_1_3.add(txtSignResponsiblePartyOnDischarge);

		dcDischargeResponsiblePartyDate = new JDateChooser();
		dcDischargeResponsiblePartyDate.setBackground(Color.WHITE);
		dcDischargeResponsiblePartyDate.setBorder(new LineBorder(Color.black,
				1, false));
		dcDischargeResponsiblePartyDate.setBounds(384, 7, 74, 18);
		panel_4_1_3.add(dcDischargeResponsiblePartyDate);

		final JLabel patientOrResponsibleLabel = new JLabel();
		patientOrResponsibleLabel.setText("PATIENT OR RESPONSIBLE PARTY");
		patientOrResponsibleLabel.setBounds(53, 9, 173, 14);
		panel_2_1_2_4.add(patientOrResponsibleLabel);

		txtSignResponsiblePartyOnAddmission = new JTextField();
		txtSignResponsiblePartyOnAddmission.setBorder(new LineBorder(
				Color.black, 1, false));
		txtSignResponsiblePartyOnAddmission.setBounds(232, 7, 127, 18);
		panel_2_1_2_4.add(txtSignResponsiblePartyOnAddmission);

		dcAddmissionResponsiblePartyDate = new JDateChooser();
		dcAddmissionResponsiblePartyDate.setBackground(Color.WHITE);
		dcAddmissionResponsiblePartyDate.setBorder(new LineBorder(Color.black,
				1, false));
		dcAddmissionResponsiblePartyDate.setBounds(365, 7, 74, 18);
		panel_2_1_2_4.add(dcAddmissionResponsiblePartyDate);

		final JPanel panel_2_1_2_4_1 = new JPanel();
		panel_2_1_2_4_1.setBackground(Color.WHITE);
		panel_2_1_2_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_2_4_1.setLayout(null);
		panel_2_1_2_4_1.setBounds(0, 1122, 938, 32);
		panel_1.add(panel_2_1_2_4_1);

		final JLabel patientNameLabel_1_1_4_2 = new JLabel();
		patientNameLabel_1_1_4_2.setText("SIGNED");
		patientNameLabel_1_1_4_2.setBounds(10, 0, 37, 32);
		panel_2_1_2_4_1.add(patientNameLabel_1_1_4_2);

		final JPanel panel_4_1_3_1 = new JPanel();
		panel_4_1_3_1.setBackground(Color.WHITE);
		panel_4_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1_3_1.setLayout(null);
		panel_4_1_3_1.setBounds(459, 0, 479, 32);
		panel_2_1_2_4_1.add(panel_4_1_3_1);

		final JLabel patientNameLabel_1_1_4_1_1 = new JLabel();
		patientNameLabel_1_1_4_1_1.setText("SIGNED");
		patientNameLabel_1_1_4_1_1.setBounds(10, 0, 37, 32);
		panel_4_1_3_1.add(patientNameLabel_1_1_4_1_1);

		final JLabel patientOrResponsibleLabel_1_1 = new JLabel();
		patientOrResponsibleLabel_1_1.setText("TITLE");
		patientOrResponsibleLabel_1_1.setBounds(53, 9, 173, 14);
		panel_4_1_3_1.add(patientOrResponsibleLabel_1_1);

		txtSignTitleOnDischarge = new JTextField();
		txtSignTitleOnDischarge
				.setBorder(new LineBorder(Color.black, 1, false));
		txtSignTitleOnDischarge.setBounds(249, 7, 129, 18);
		panel_4_1_3_1.add(txtSignTitleOnDischarge);

		dcDischargeTitleDate = new JDateChooser();
		dcDischargeTitleDate.setBackground(Color.WHITE);
		dcDischargeTitleDate.setBorder(new LineBorder(Color.black, 1, false));
		dcDischargeTitleDate.setBounds(384, 7, 74, 18);
		panel_4_1_3_1.add(dcDischargeTitleDate);

		final JLabel patientOrResponsibleLabel_2 = new JLabel();
		patientOrResponsibleLabel_2.setText("TITLE");
		patientOrResponsibleLabel_2.setBounds(53, 9, 173, 14);
		panel_2_1_2_4_1.add(patientOrResponsibleLabel_2);

		txtSignTitleOnAddmission = new JTextField();
		txtSignTitleOnAddmission
				.setBorder(new LineBorder(Color.black, 1, false));
		txtSignTitleOnAddmission.setBounds(232, 7, 127, 18);
		panel_2_1_2_4_1.add(txtSignTitleOnAddmission);

		dcAdmissionTitleDate = new JDateChooser();
		dcAdmissionTitleDate.setBackground(Color.WHITE);
		dcAdmissionTitleDate.setBorder(new LineBorder(Color.black, 1, false));
		dcAdmissionTitleDate.setBounds(365, 7, 74, 18);
		panel_2_1_2_4_1.add(dcAdmissionTitleDate);

		doUpdate();
	}

	public static void main(String[] args) {

	}

	public void doLoad() {

	}

	public int doSave() {
		InventoryPersonalEffect refResidentInventoryPersonalEffect = new InventoryPersonalEffect();
		refResidentInventoryPersonalEffect
				.setResidentId(Global.currentResidenceKey);
		refResidentInventoryPersonalEffect
				.setSerial(Global.currentInventoryPersonalEffectFormKey);
		refResidentInventoryPersonalEffect.setFormId(Global.currentMsjnKey);
		refResidentInventoryPersonalEffect.setValuesOthers(txtValuesOthers
				.getText());
		refResidentInventoryPersonalEffect.setValuesGlasses(txtValuesGlasses
				.getText());
		refResidentInventoryPersonalEffect.setValuesDentures(txtValuesDentures
				.getText());
		refResidentInventoryPersonalEffect
				.setValuesHearingAid(txtValuesHearingAid.getText());
		refResidentInventoryPersonalEffect
				.setValuesTravellingBags(txtValuesTravellingBags.getText());
		refResidentInventoryPersonalEffect
				.setValuesShavingKit(txtValuesShavingKit.getText());
		refResidentInventoryPersonalEffect.setValuesSlippers(txtValuesSlippers
				.getText());
		refResidentInventoryPersonalEffect.setValuesRobes(txtValuesRobes
				.getText());
		refResidentInventoryPersonalEffect.setValuesPajamas(txtValuesPajamas
				.getText());
		refResidentInventoryPersonalEffect
				.setValuesMensHandkerChie(txtValuesMensHandkerChie.getText());
		refResidentInventoryPersonalEffect
				.setValuesBeltSuspenders(txtValuesBeltSuspenders.getText());
		refResidentInventoryPersonalEffect.setValuesTies(txtValuesTies
				.getText());
		refResidentInventoryPersonalEffect
				.setValuesUnderShirts(txtValuesUnderShirts.getText());
		refResidentInventoryPersonalEffect.setValuesShorts(txtValuesShorts
				.getText());
		refResidentInventoryPersonalEffect.setValuesSocks(txtValuesSocks
				.getText());
		refResidentInventoryPersonalEffect
				.setValuesMensGloves(txtValuesMensGloves.getText());
		refResidentInventoryPersonalEffect
				.setValuesMensShoes(txtValuesMensShoes.getText());
		refResidentInventoryPersonalEffect.setValuesMensHats(txtValuesMensHats
				.getText());
		refResidentInventoryPersonalEffect
				.setValuesSportJackets(txtValuesSportJackets.getText());
		refResidentInventoryPersonalEffect.setValuesSlacks(txtValuesSlacks
				.getText());
		refResidentInventoryPersonalEffect.setValuesTopCoats(txtValuesTopCoats
				.getText());
		refResidentInventoryPersonalEffect.setValuesMensSuit(txtValuesMensSuit
				.getText());
		refResidentInventoryPersonalEffect
				.setValuesOverNightCase(txtValuesOverNightCase.getText());
		refResidentInventoryPersonalEffect
				.setValuesPocketBooks(txtValuesPocketBooks.getText());
		refResidentInventoryPersonalEffect
				.setValuesHouseSlippers(txtValuesHouseSlippers.getText());
		refResidentInventoryPersonalEffect
				.setValuesHouseCoats(txtValuesHouseCoats.getText());
		refResidentInventoryPersonalEffect
				.setValuesNightGowns(txtValuesNightGowns.getText());
		refResidentInventoryPersonalEffect
				.setValuesBrassiers(txtValuesBrassiers.getText());
		refResidentInventoryPersonalEffect
				.setValuesFoundationGarments(txtValuesFoundationGarments
						.getText());
		refResidentInventoryPersonalEffect.setValuesSlips(txtValuesSlips
				.getText());
		refResidentInventoryPersonalEffect
				.setValuesLadiesHandkerChiefs(txtValuesLadiesHandkerChiefs
						.getText());
		refResidentInventoryPersonalEffect.setValuesHose(txtValuesHose
				.getText());
		refResidentInventoryPersonalEffect.setValuesGloves(txtValuesGloves
				.getText());
		refResidentInventoryPersonalEffect
				.setValuesLadiesSweaters(txtValuesLadiesSweaters.getText());
		refResidentInventoryPersonalEffect.setValuesBlouses(txtValuesBlouses
				.getText());
		refResidentInventoryPersonalEffect
				.setValueLadiesHats(txtValueLadiesHats.getText());
		refResidentInventoryPersonalEffect
				.setValueLadiesShoes(txtValueLadiesShoes.getText());
		refResidentInventoryPersonalEffect.setValueFirs(txtValueFirs.getText());
		refResidentInventoryPersonalEffect.setValueCoats(txtValueCoats
				.getText());
		refResidentInventoryPersonalEffect
				.setValueLadiesSuit(txtValueLadiesSuit.getText());
		refResidentInventoryPersonalEffect.setValueDresses(txtValueDresses
				.getText());
		refResidentInventoryPersonalEffect
				.setDescriptionOthers(txtDescriptionOthers.getText());
		refResidentInventoryPersonalEffect
				.setDescriptionGlasses(txtDescriptionGlasses.getText());
		refResidentInventoryPersonalEffect
				.setDescriptionDentures(txtDescriptionDentures.getText());
		refResidentInventoryPersonalEffect
				.setDescriptionHearingAid(txtDescriptionHearingAid.getText());
		refResidentInventoryPersonalEffect
				.setDescriptionTravellingBags(txtDescriptionTravellingBags
						.getText());
		refResidentInventoryPersonalEffect
				.setDescriptionShavingKit(txtDescriptionShavingKit.getText());
		refResidentInventoryPersonalEffect
				.setDescriptionSlippers(txtDescriptionSlippers.getText());
		refResidentInventoryPersonalEffect
				.setDescriptionRobes(txtDescriptionRobes.getText());
		refResidentInventoryPersonalEffect
				.setDescriptionPajamas(txtDescriptionPajamas.getText());
		refResidentInventoryPersonalEffect
				.setDescriptionMensHandkerChiefs(txtDescriptionMensHandkerChiefs
						.getText());
		refResidentInventoryPersonalEffect
				.setDescriptionBeltSuspenders(txtDescriptionBeltSuspenders
						.getText());
		refResidentInventoryPersonalEffect
				.setDescriptionTies(txtDescriptionTies.getText());
		refResidentInventoryPersonalEffect
				.setDescriptionShorts(txtDescriptionShorts.getText());
		refResidentInventoryPersonalEffect.setHowRecieved14(txtHowRecieved14
				.getText());
		refResidentInventoryPersonalEffect.setHowRecieved13(txtHowRecieved13
				.getText());
		refResidentInventoryPersonalEffect.setHowRecieved12(txtHowRecieved12
				.getText());
		refResidentInventoryPersonalEffect.setHowRecieved11(txtHowRecieved11
				.getText());
		refResidentInventoryPersonalEffect.setHowRecieved10(txtHowRecieved10
				.getText());
		refResidentInventoryPersonalEffect.setHowRecieved9(txtHowRecieved9
				.getText());
		refResidentInventoryPersonalEffect.setHowRecieved8(txtHowRecieved8
				.getText());
		refResidentInventoryPersonalEffect.setHowRecieved7(txtHowRecieved7
				.getText());
		refResidentInventoryPersonalEffect.setHowRecieved6(txtHowRecieved6
				.getText());
		refResidentInventoryPersonalEffect.setHowRecieved5(txtHowRecieved5
				.getText());
		refResidentInventoryPersonalEffect.setHowRecieved4(txtHowRecieved4
				.getText());
		refResidentInventoryPersonalEffect.setHowRecieved3(txtHowRecieved3
				.getText());
		refResidentInventoryPersonalEffect.setHowRecieved2(txtHowRecieved2
				.getText());
		refResidentInventoryPersonalEffect.setHowRecieved1(txtHowRecieved1
				.getText());
		refResidentInventoryPersonalEffect.setOrginalItem14(txtOrginalItem14
				.getText());
		refResidentInventoryPersonalEffect.setOrginalItem13(txtOrginalItem13
				.getText());
		refResidentInventoryPersonalEffect.setOrginalItem12(txtOrginalItem12
				.getText());
		refResidentInventoryPersonalEffect.setOrginalItem11(txtOrginalItem11
				.getText());
		refResidentInventoryPersonalEffect.setOrginalItem10(txtOrginalItem10
				.getText());
		refResidentInventoryPersonalEffect.setOrginalItem9(txtOrginalItem9
				.getText());
		refResidentInventoryPersonalEffect.setOrginalItem8(txtOrginalItem8
				.getText());
		refResidentInventoryPersonalEffect.setOrginalItem7(txtOrginalItem7
				.getText());
		refResidentInventoryPersonalEffect.setOrginalItem6(txtOrginalItem6
				.getText());
		refResidentInventoryPersonalEffect.setOrginalItem5(txtOrginalItem5
				.getText());
		refResidentInventoryPersonalEffect.setOrginalItem4(txtOrginalItem4
				.getText());
		refResidentInventoryPersonalEffect.setOrginalItem3(txtOrginalItem3
				.getText());
		refResidentInventoryPersonalEffect.setOrginalItem2(txtOrginalItem2
				.getText());
		refResidentInventoryPersonalEffect.setOrginalItem1(txtOrginalItem1
				.getText());
		refResidentInventoryPersonalEffect.setOriginalDate14(dcOriginalDate14
				.getDate());
		refResidentInventoryPersonalEffect.setOriginalDate13(dcOriginalDate13
				.getDate());
		refResidentInventoryPersonalEffect.setOriginalDate12(dcOriginalDate12
				.getDate());
		refResidentInventoryPersonalEffect.setOriginalDate11(dcOriginalDate11
				.getDate());
		refResidentInventoryPersonalEffect.setOriginalDate10(dcOriginalDate10
				.getDate());
		refResidentInventoryPersonalEffect.setOriginalDate9(dcOriginalDate9
				.getDate());
		refResidentInventoryPersonalEffect.setOriginalDate8(dcOriginalDate8
				.getDate());
		refResidentInventoryPersonalEffect.setOriginalDate7(dcOriginalDate7
				.getDate());
		refResidentInventoryPersonalEffect.setOriginalDate6(dcOriginalDate6
				.getDate());
		refResidentInventoryPersonalEffect.setOriginalDate5(dcOriginalDate5
				.getDate());
		refResidentInventoryPersonalEffect.setOriginalDate4(dcOriginalDate4
				.getDate());
		refResidentInventoryPersonalEffect.setOriginalDate3(dcOriginalDate3
				.getDate());
		refResidentInventoryPersonalEffect.setOriginalDate2(dcOriginalDate2
				.getDate());
		refResidentInventoryPersonalEffect.setOriginalDate1(dcOriginalDate1
				.getDate());
		refResidentInventoryPersonalEffect
				.setDescriptionLadiesHandkerChiefs(txtDescriptionLadiesHandkerChiefs
						.getText());
		refResidentInventoryPersonalEffect
				.setDescriptionHose(txtDescriptionHose.getText());
		refResidentInventoryPersonalEffect
				.setDescriptionGloves(txtDescriptionGloves.getText());
		refResidentInventoryPersonalEffect
				.setDescriptionLadiesSweaters(txtDescriptionLadiesSweaters
						.getText());
		refResidentInventoryPersonalEffect
				.setDescriptionBlouses(txtDescriptionBlouses.getText());
		refResidentInventoryPersonalEffect
				.setDescriptionLadiesHats(txtDescriptionLadiesHats.getText());
		refResidentInventoryPersonalEffect
				.setDescriptionLadiesShoes(txtDescriptionLadiesShoes.getText());
		refResidentInventoryPersonalEffect
				.setDescriptionFirs(txtDescriptionFirs.getText());
		refResidentInventoryPersonalEffect
				.setDescriptionCoats(txtDescriptionCoats.getText());
		refResidentInventoryPersonalEffect
				.setDescriptionLadiesSuit(txtDescriptionLadiesSuit.getText());
		refResidentInventoryPersonalEffect
				.setDescriptionDresses(txtDescriptionDresses.getText());
		refResidentInventoryPersonalEffect
				.setDischargeResponsiblePartyDate(dcDischargeResponsiblePartyDate
						.getDate());
		refResidentInventoryPersonalEffect
				.setSignResponsiblePartyOnDischarge(txtSignResponsiblePartyOnDischarge
						.getText());
		refResidentInventoryPersonalEffect.setQuantityOthers(txtQuantityOthers
				.getText());
		refResidentInventoryPersonalEffect
				.setQuantityGlasses(txtQuantityGlasses.getText());
		refResidentInventoryPersonalEffect
				.setQuantityDentures(txtQuantityDentures.getText());
		refResidentInventoryPersonalEffect
				.setQuantityHearingAid(txtQuantityHearingAid.getText());
		refResidentInventoryPersonalEffect
				.setQuantityTravellingBags(txtQuantityTravellingBags.getText());
		refResidentInventoryPersonalEffect
				.setQuantityShavingKit(txtQuantityShavingKit.getText());
		refResidentInventoryPersonalEffect
				.setQuantitySlippers(txtQuantitySlippers.getText());
		refResidentInventoryPersonalEffect.setQuantityRobes(txtQuantityRobes
				.getText());
		refResidentInventoryPersonalEffect
				.setQuantityPajamas(txtQuantityPajamas.getText());
		refResidentInventoryPersonalEffect
				.setQuantityMensHandkerChiefs(txtQuantityMensHandkerChiefs
						.getText());
		refResidentInventoryPersonalEffect
				.setQuantityBeltsSuspenders(txtQuantityBeltsSuspenders
						.getText());
		refResidentInventoryPersonalEffect.setQuantityTies(txtQuantityTies
				.getText());
		refResidentInventoryPersonalEffect
				.setQuantityUnderShirts(txtQuantityUnderShirts.getText());
		refResidentInventoryPersonalEffect.setQuantityShort(txtQuantityShort
				.getText());
		refResidentInventoryPersonalEffect.setQuantitySocks(txtQuantitySocks
				.getText());
		refResidentInventoryPersonalEffect
				.setQuantityMensGloves(txtQuantityMensGloves.getText());
		refResidentInventoryPersonalEffect
				.setQuantityMensShoes(txtQuantityMensShoes.getText());
		refResidentInventoryPersonalEffect
				.setQuantityMensHats(txtQuantityMensHats.getText());
		refResidentInventoryPersonalEffect
				.setQuantitySportJackets(txtQuantitySportJackets.getText());
		refResidentInventoryPersonalEffect.setQuantitySlacks(txtQuantitySlacks
				.getText());
		refResidentInventoryPersonalEffect
				.setQuantityTopCoats(txtQuantityTopCoats.getText());
		refResidentInventoryPersonalEffect
				.setQuantityMensSuit(txtQuantityMensSuit.getText());
		refResidentInventoryPersonalEffect
				.setQuantityOvernightCase(txtQuantityOvernightCase.getText());
		refResidentInventoryPersonalEffect
				.setQuantityPocketBooks(txtQuantityPocketBooks.getText());
		refResidentInventoryPersonalEffect
				.setQuantityHouseSlippers(txtQuantityHouseSlippers.getText());
		refResidentInventoryPersonalEffect
				.setQuantityHouseCoats(txtQuantityHouseCoats.getText());
		refResidentInventoryPersonalEffect
				.setQuantityNightGowns(txtQuantityNightGowns.getText());
		refResidentInventoryPersonalEffect
				.setQuantityBrasiers(txtQuantityBrasiers.getText());
		refResidentInventoryPersonalEffect
				.setQuantityFoundationGarments(txtQuantityFoundationGarments
						.getText());
		refResidentInventoryPersonalEffect.setQuantitySlips(txtQuantitySlips
				.getText());
		refResidentInventoryPersonalEffect
				.setQuantityLadiesHandkerChiefs(txtQuantityLadiesHandkerChiefs
						.getText());
		refResidentInventoryPersonalEffect.setQuantityHose(txtQuantityHose
				.getText());
		refResidentInventoryPersonalEffect.setQuantityGloves(txtQuantityGloves
				.getText());
		refResidentInventoryPersonalEffect
				.setQuantityLadiesSweaters(txtQuantityLadiesSweaters.getText());
		refResidentInventoryPersonalEffect
				.setQuantityBlouses(txtQuantityBlouses.getText());
		refResidentInventoryPersonalEffect
				.setQuantityLadiesHats(txtQuantityLadiesHats.getText());
		refResidentInventoryPersonalEffect
				.setQuantityLadiesShoes(txtQuantityLadiesShoes.getText());
		refResidentInventoryPersonalEffect.setQuantityFIR(txtQuantityFIR
				.getText());
		refResidentInventoryPersonalEffect.setQuantityCoats(txtQuantityCoats
				.getText());
		refResidentInventoryPersonalEffect
				.setQuantityLadiesSuit(txtQuantityLadiesSuit.getText());
		refResidentInventoryPersonalEffect
				.setQuantityDresses(txtQuantityDresses.getText());
		refResidentInventoryPersonalEffect.setDateOfInventory(dcDateOfInventory
				.getDate());
		refResidentInventoryPersonalEffect.setRoomNumber(txtRoomNumber
				.getText());
		refResidentInventoryPersonalEffect.setPatientName(txtPatientName
				.getText());
		refResidentInventoryPersonalEffect
				.setAdmissionTitleDate(dcAdmissionTitleDate.getDate());
		refResidentInventoryPersonalEffect
				.setSignResponsiblePartyOnAddmission(txtSignResponsiblePartyOnAddmission
						.getText());
		/*
		 * refResidentInventoryPersonalEffect.setQuantityOther1(txtQuantityOther1
		 * .getText());
		 * refResidentInventoryPersonalEffect.setArticleOther1(txtArticleOther1
		 * .getText());
		 * refResidentInventoryPersonalEffect.setQuantityOther2(txtQuantityOther2
		 * .getText());
		 * refResidentInventoryPersonalEffect.setArticleOther2(txtArticleOther2
		 * .getText());
		 * refResidentInventoryPersonalEffect.setQuantityOther3(txtQuantityOther3
		 * .getText());
		 * refResidentInventoryPersonalEffect.setArticleOther3(txtArticleOther3
		 * .getText());
		 * refResidentInventoryPersonalEffect.setQuantityOther4(txtQuantityOther4
		 * .getText());
		 * refResidentInventoryPersonalEffect.setArticleOther4(txtArticleOther4
		 * .getText());
		 * refResidentInventoryPersonalEffect.setQuantityOther5(txtQuantityOther5
		 * .getText());
		 * refResidentInventoryPersonalEffect.setArticleOther5(txtArticleOther5
		 * .getText());
		 * refResidentInventoryPersonalEffect.setQuantityOther6(txtQuantityOther6
		 * .getText());
		 * refResidentInventoryPersonalEffect.setArticleOther6(txtArticleOther6
		 * .getText());
		 * refResidentInventoryPersonalEffect.setQuantityOther7(txtQuantityOther7
		 * .getText());
		 * refResidentInventoryPersonalEffect.setArticleOther7(txtArticleOther7
		 * .getText());
		 * refResidentInventoryPersonalEffect.setQuantityOther8(txtQuantityOther8
		 * .getText());
		 * refResidentInventoryPersonalEffect.setArticleOther8(txtArticleOther8
		 * .getText());
		 * refResidentInventoryPersonalEffect.setQuantityOther9(txtQuantityOther9
		 * .getText());
		 * refResidentInventoryPersonalEffect.setArticleOther9(txtArticleOther9
		 * .getText());
		 */
		refResidentInventoryPersonalEffect.setRemarks(txtRemarks.getText());

		try {
			Global.currentInventoryPersonalEffectFormKey = MedrexClientManager
					.getInstance()
					.insertOrUpdateResidentInventoryPersonalEffect(
							refResidentInventoryPersonalEffect);
		} catch (Exception e) {
		}
		return Global.currentInventoryPersonalEffectFormKey;
	}

	public void doUpdate() {
		InventoryPersonalEffect refResidentInventoryPersonalEffect = null;

		if (Global.currentMsjnKey != 0) {
			try {
				refResidentInventoryPersonalEffect = MedrexClientManager
						.getInstance().getResidentInventoryPersonalEffect(
								Global.currentMsjnKey);
			} catch (Exception e) {
				e.printStackTrace();
			}
			Global.currentInventoryPersonalEffectFormKey = refResidentInventoryPersonalEffect
					.getSerial();
			txtValuesOthers.setText(refResidentInventoryPersonalEffect
					.getValuesOthers());
			txtValuesGlasses.setText(refResidentInventoryPersonalEffect
					.getValuesGlasses());
			txtValuesDentures.setText(refResidentInventoryPersonalEffect
					.getValuesDentures());
			txtValuesHearingAid.setText(refResidentInventoryPersonalEffect
					.getValuesHearingAid());
			txtValuesTravellingBags.setText(refResidentInventoryPersonalEffect
					.getValuesTravellingBags());
			txtValuesShavingKit.setText(refResidentInventoryPersonalEffect
					.getValuesShavingKit());
			txtValuesSlippers.setText(refResidentInventoryPersonalEffect
					.getValuesSlippers());
			txtValuesRobes.setText(refResidentInventoryPersonalEffect
					.getValuesRobes());
			txtValuesPajamas.setText(refResidentInventoryPersonalEffect
					.getValuesPajamas());
			txtValuesMensHandkerChie.setText(refResidentInventoryPersonalEffect
					.getValuesMensHandkerChie());
			txtValuesBeltSuspenders.setText(refResidentInventoryPersonalEffect
					.getValuesBeltSuspenders());
			txtValuesTies.setText(refResidentInventoryPersonalEffect
					.getValuesTies());
			txtValuesUnderShirts.setText(refResidentInventoryPersonalEffect
					.getValuesUnderShirts());
			txtValuesShorts.setText(refResidentInventoryPersonalEffect
					.getValuesShorts());
			txtValuesSocks.setText(refResidentInventoryPersonalEffect
					.getValuesSocks());
			txtValuesMensGloves.setText(refResidentInventoryPersonalEffect
					.getValuesMensGloves());
			txtValuesMensShoes.setText(refResidentInventoryPersonalEffect
					.getValuesMensShoes());
			txtValuesMensHats.setText(refResidentInventoryPersonalEffect
					.getValuesMensHats());
			txtValuesSportJackets.setText(refResidentInventoryPersonalEffect
					.getValuesSportJackets());
			txtValuesSlacks.setText(refResidentInventoryPersonalEffect
					.getValuesSlacks());
			txtValuesTopCoats.setText(refResidentInventoryPersonalEffect
					.getValuesTopCoats());
			txtValuesMensSuit.setText(refResidentInventoryPersonalEffect
					.getValuesMensSuit());
			txtValuesOverNightCase.setText(refResidentInventoryPersonalEffect
					.getValuesOverNightCase());
			txtValuesPocketBooks.setText(refResidentInventoryPersonalEffect
					.getValuesPocketBooks());
			txtValuesHouseSlippers.setText(refResidentInventoryPersonalEffect
					.getValuesHouseSlippers());
			txtValuesHouseCoats.setText(refResidentInventoryPersonalEffect
					.getValuesHouseCoats());
			txtValuesNightGowns.setText(refResidentInventoryPersonalEffect
					.getValuesNightGowns());
			txtValuesBrassiers.setText(refResidentInventoryPersonalEffect
					.getValuesBrassiers());
			txtValuesFoundationGarments
					.setText(refResidentInventoryPersonalEffect
							.getValuesFoundationGarments());
			txtValuesSlips.setText(refResidentInventoryPersonalEffect
					.getValuesSlips());
			txtValuesLadiesHandkerChiefs
					.setText(refResidentInventoryPersonalEffect
							.getValuesLadiesHandkerChiefs());
			txtValuesHose.setText(refResidentInventoryPersonalEffect
					.getValuesHose());
			txtValuesGloves.setText(refResidentInventoryPersonalEffect
					.getValuesGloves());
			txtValuesLadiesSweaters.setText(refResidentInventoryPersonalEffect
					.getValuesLadiesSweaters());
			txtValuesBlouses.setText(refResidentInventoryPersonalEffect
					.getValuesBlouses());
			txtValueLadiesHats.setText(refResidentInventoryPersonalEffect
					.getValueLadiesHats());
			txtValueLadiesShoes.setText(refResidentInventoryPersonalEffect
					.getValueLadiesShoes());
			txtValueFirs.setText(refResidentInventoryPersonalEffect
					.getValueFirs());
			txtValueCoats.setText(refResidentInventoryPersonalEffect
					.getValueCoats());
			txtValueLadiesSuit.setText(refResidentInventoryPersonalEffect
					.getValueLadiesSuit());
			txtValueDresses.setText(refResidentInventoryPersonalEffect
					.getValueDresses());
			txtDescriptionOthers.setText(refResidentInventoryPersonalEffect
					.getDescriptionOthers());
			txtDescriptionGlasses.setText(refResidentInventoryPersonalEffect
					.getDescriptionGlasses());
			txtDescriptionDentures.setText(refResidentInventoryPersonalEffect
					.getDescriptionDentures());
			txtDescriptionHearingAid.setText(refResidentInventoryPersonalEffect
					.getDescriptionHearingAid());
			txtDescriptionTravellingBags
					.setText(refResidentInventoryPersonalEffect
							.getDescriptionTravellingBags());
			txtDescriptionShavingKit.setText(refResidentInventoryPersonalEffect
					.getDescriptionShavingKit());
			txtDescriptionSlippers.setText(refResidentInventoryPersonalEffect
					.getDescriptionSlippers());
			txtDescriptionRobes.setText(refResidentInventoryPersonalEffect
					.getDescriptionRobes());
			txtDescriptionPajamas.setText(refResidentInventoryPersonalEffect
					.getDescriptionPajamas());
			txtDescriptionMensHandkerChiefs
					.setText(refResidentInventoryPersonalEffect
							.getDescriptionMensHandkerChiefs());
			txtDescriptionBeltSuspenders
					.setText(refResidentInventoryPersonalEffect
							.getDescriptionBeltSuspenders());
			txtDescriptionTies.setText(refResidentInventoryPersonalEffect
					.getDescriptionTies());
			txtDescriptionShorts.setText(refResidentInventoryPersonalEffect
					.getDescriptionShorts());
			txtHowRecieved14.setText(refResidentInventoryPersonalEffect
					.getHowRecieved14());
			txtHowRecieved13.setText(refResidentInventoryPersonalEffect
					.getHowRecieved13());
			txtHowRecieved12.setText(refResidentInventoryPersonalEffect
					.getHowRecieved12());
			txtHowRecieved11.setText(refResidentInventoryPersonalEffect
					.getHowRecieved11());
			txtHowRecieved10.setText(refResidentInventoryPersonalEffect
					.getHowRecieved10());
			txtHowRecieved9.setText(refResidentInventoryPersonalEffect
					.getHowRecieved9());
			txtHowRecieved8.setText(refResidentInventoryPersonalEffect
					.getHowRecieved8());
			txtHowRecieved7.setText(refResidentInventoryPersonalEffect
					.getHowRecieved7());
			txtHowRecieved6.setText(refResidentInventoryPersonalEffect
					.getHowRecieved6());
			txtHowRecieved5.setText(refResidentInventoryPersonalEffect
					.getHowRecieved5());
			txtHowRecieved4.setText(refResidentInventoryPersonalEffect
					.getHowRecieved4());
			txtHowRecieved3.setText(refResidentInventoryPersonalEffect
					.getHowRecieved3());
			txtHowRecieved2.setText(refResidentInventoryPersonalEffect
					.getHowRecieved2());
			txtHowRecieved1.setText(refResidentInventoryPersonalEffect
					.getHowRecieved1());
			txtOrginalItem14.setText(refResidentInventoryPersonalEffect
					.getOrginalItem14());
			txtOrginalItem13.setText(refResidentInventoryPersonalEffect
					.getOrginalItem13());
			txtOrginalItem12.setText(refResidentInventoryPersonalEffect
					.getOrginalItem12());
			txtOrginalItem11.setText(refResidentInventoryPersonalEffect
					.getOrginalItem11());
			txtOrginalItem10.setText(refResidentInventoryPersonalEffect
					.getOrginalItem10());
			txtOrginalItem9.setText(refResidentInventoryPersonalEffect
					.getOrginalItem9());
			txtOrginalItem8.setText(refResidentInventoryPersonalEffect
					.getOrginalItem8());
			txtOrginalItem7.setText(refResidentInventoryPersonalEffect
					.getOrginalItem7());
			txtOrginalItem6.setText(refResidentInventoryPersonalEffect
					.getOrginalItem6());
			txtOrginalItem5.setText(refResidentInventoryPersonalEffect
					.getOrginalItem5());
			txtOrginalItem4.setText(refResidentInventoryPersonalEffect
					.getOrginalItem4());
			txtOrginalItem3.setText(refResidentInventoryPersonalEffect
					.getOrginalItem3());
			txtOrginalItem2.setText(refResidentInventoryPersonalEffect
					.getOrginalItem2());
			txtOrginalItem1.setText(refResidentInventoryPersonalEffect
					.getOrginalItem1());
			dcOriginalDate14.setDate(refResidentInventoryPersonalEffect
					.getOriginalDate14());
			dcOriginalDate13.setDate(refResidentInventoryPersonalEffect
					.getOriginalDate13());
			dcOriginalDate12.setDate(refResidentInventoryPersonalEffect
					.getOriginalDate12());
			dcOriginalDate11.setDate(refResidentInventoryPersonalEffect
					.getOriginalDate11());
			dcOriginalDate10.setDate(refResidentInventoryPersonalEffect
					.getOriginalDate10());
			dcOriginalDate9.setDate(refResidentInventoryPersonalEffect
					.getOriginalDate9());
			dcOriginalDate8.setDate(refResidentInventoryPersonalEffect
					.getOriginalDate8());
			dcOriginalDate7.setDate(refResidentInventoryPersonalEffect
					.getOriginalDate7());
			dcOriginalDate6.setDate(refResidentInventoryPersonalEffect
					.getOriginalDate6());
			dcOriginalDate5.setDate(refResidentInventoryPersonalEffect
					.getOriginalDate5());
			dcOriginalDate4.setDate(refResidentInventoryPersonalEffect
					.getOriginalDate4());
			dcOriginalDate3.setDate(refResidentInventoryPersonalEffect
					.getOriginalDate3());
			dcOriginalDate2.setDate(refResidentInventoryPersonalEffect
					.getOriginalDate2());
			dcOriginalDate1.setDate(refResidentInventoryPersonalEffect
					.getOriginalDate1());
			txtDescriptionLadiesHandkerChiefs
					.setText(refResidentInventoryPersonalEffect
							.getDescriptionLadiesHandkerChiefs());
			txtDescriptionHose.setText(refResidentInventoryPersonalEffect
					.getDescriptionHose());
			txtDescriptionGloves.setText(refResidentInventoryPersonalEffect
					.getDescriptionGloves());
			txtDescriptionLadiesSweaters
					.setText(refResidentInventoryPersonalEffect
							.getDescriptionLadiesSweaters());
			txtDescriptionBlouses.setText(refResidentInventoryPersonalEffect
					.getDescriptionBlouses());
			txtDescriptionLadiesHats.setText(refResidentInventoryPersonalEffect
					.getDescriptionLadiesHats());
			txtDescriptionLadiesShoes
					.setText(refResidentInventoryPersonalEffect
							.getDescriptionLadiesShoes());
			txtDescriptionFirs.setText(refResidentInventoryPersonalEffect
					.getDescriptionFirs());
			txtDescriptionCoats.setText(refResidentInventoryPersonalEffect
					.getDescriptionCoats());
			txtDescriptionLadiesSuit.setText(refResidentInventoryPersonalEffect
					.getDescriptionLadiesSuit());
			txtDescriptionDresses.setText(refResidentInventoryPersonalEffect
					.getDescriptionDresses());
			dcDischargeResponsiblePartyDate
					.setDate(refResidentInventoryPersonalEffect
							.getDischargeResponsiblePartyDate());
			txtSignResponsiblePartyOnDischarge
					.setText(refResidentInventoryPersonalEffect
							.getSignResponsiblePartyOnDischarge());
			txtQuantityOthers.setText(refResidentInventoryPersonalEffect
					.getQuantityOthers());
			txtQuantityGlasses.setText(refResidentInventoryPersonalEffect
					.getQuantityGlasses());
			txtQuantityDentures.setText(refResidentInventoryPersonalEffect
					.getQuantityDentures());
			txtQuantityHearingAid.setText(refResidentInventoryPersonalEffect
					.getQuantityHearingAid());
			txtQuantityTravellingBags
					.setText(refResidentInventoryPersonalEffect
							.getQuantityTravellingBags());
			txtQuantityShavingKit.setText(refResidentInventoryPersonalEffect
					.getQuantityShavingKit());
			txtQuantitySlippers.setText(refResidentInventoryPersonalEffect
					.getQuantitySlippers());
			txtQuantityRobes.setText(refResidentInventoryPersonalEffect
					.getQuantityRobes());
			txtQuantityPajamas.setText(refResidentInventoryPersonalEffect
					.getQuantityPajamas());
			txtQuantityMensHandkerChiefs
					.setText(refResidentInventoryPersonalEffect
							.getQuantityMensHandkerChiefs());
			txtQuantityBeltsSuspenders
					.setText(refResidentInventoryPersonalEffect
							.getQuantityBeltsSuspenders());
			txtQuantityTies.setText(refResidentInventoryPersonalEffect
					.getQuantityTies());
			txtQuantityUnderShirts.setText(refResidentInventoryPersonalEffect
					.getQuantityUnderShirts());
			txtQuantityShort.setText(refResidentInventoryPersonalEffect
					.getQuantityShort());
			txtQuantitySocks.setText(refResidentInventoryPersonalEffect
					.getQuantitySocks());
			txtQuantityMensGloves.setText(refResidentInventoryPersonalEffect
					.getQuantityMensGloves());
			txtQuantityMensShoes.setText(refResidentInventoryPersonalEffect
					.getQuantityMensShoes());
			txtQuantityMensHats.setText(refResidentInventoryPersonalEffect
					.getQuantityMensHats());
			txtQuantitySportJackets.setText(refResidentInventoryPersonalEffect
					.getQuantitySportJackets());
			txtQuantitySlacks.setText(refResidentInventoryPersonalEffect
					.getQuantitySlacks());
			txtQuantityTopCoats.setText(refResidentInventoryPersonalEffect
					.getQuantityTopCoats());
			txtQuantityMensSuit.setText(refResidentInventoryPersonalEffect
					.getQuantityMensSuit());
			txtQuantityOvernightCase.setText(refResidentInventoryPersonalEffect
					.getQuantityOvernightCase());
			txtQuantityPocketBooks.setText(refResidentInventoryPersonalEffect
					.getQuantityPocketBooks());
			txtQuantityHouseSlippers.setText(refResidentInventoryPersonalEffect
					.getQuantityHouseSlippers());
			txtQuantityHouseCoats.setText(refResidentInventoryPersonalEffect
					.getQuantityHouseCoats());
			txtQuantityNightGowns.setText(refResidentInventoryPersonalEffect
					.getQuantityNightGowns());
			txtQuantityBrasiers.setText(refResidentInventoryPersonalEffect
					.getQuantityBrasiers());
			txtQuantityFoundationGarments
					.setText(refResidentInventoryPersonalEffect
							.getQuantityFoundationGarments());
			txtQuantitySlips.setText(refResidentInventoryPersonalEffect
					.getQuantitySlips());
			txtQuantityLadiesHandkerChiefs
					.setText(refResidentInventoryPersonalEffect
							.getQuantityLadiesHandkerChiefs());
			txtQuantityHose.setText(refResidentInventoryPersonalEffect
					.getQuantityHose());
			txtQuantityGloves.setText(refResidentInventoryPersonalEffect
					.getQuantityGloves());
			txtQuantityLadiesSweaters
					.setText(refResidentInventoryPersonalEffect
							.getQuantityLadiesSweaters());
			txtQuantityBlouses.setText(refResidentInventoryPersonalEffect
					.getQuantityBlouses());
			txtQuantityLadiesHats.setText(refResidentInventoryPersonalEffect
					.getQuantityLadiesHats());
			txtQuantityLadiesShoes.setText(refResidentInventoryPersonalEffect
					.getQuantityLadiesShoes());
			txtQuantityFIR.setText(refResidentInventoryPersonalEffect
					.getQuantityFIR());
			txtQuantityCoats.setText(refResidentInventoryPersonalEffect
					.getQuantityCoats());
			txtQuantityLadiesSuit.setText(refResidentInventoryPersonalEffect
					.getQuantityLadiesSuit());
			txtQuantityDresses.setText(refResidentInventoryPersonalEffect
					.getQuantityDresses());
			dcDateOfInventory.setDate(refResidentInventoryPersonalEffect
					.getDateOfInventory());
			txtRoomNumber.setText(refResidentInventoryPersonalEffect
					.getRoomNumber());
			txtPatientName.setText(refResidentInventoryPersonalEffect
					.getPatientName());
			dcAdmissionTitleDate.setDate(refResidentInventoryPersonalEffect
					.getAdmissionTitleDate());
			txtSignResponsiblePartyOnAddmission
					.setText(refResidentInventoryPersonalEffect
							.getSignResponsiblePartyOnAddmission());
			/*
			 * txtQuantityOther1.setText(refResidentInventoryPersonalEffect.getQuantityOther1
			 * ());txtArticleOther1.setText(refResidentInventoryPersonalEffect.
			 * getArticleOther1());
			 * txtQuantityOther2.setText(refResidentInventoryPersonalEffect
			 * .getQuantityOther2());
			 * txtArticleOther2.setText(refResidentInventoryPersonalEffect
			 * .getArticleOther2());
			 * txtQuantityOther3.setText(refResidentInventoryPersonalEffect
			 * .getQuantityOther3());
			 * txtArticleOther3.setText(refResidentInventoryPersonalEffect
			 * .getArticleOther3());
			 * txtQuantityOther4.setText(refResidentInventoryPersonalEffect
			 * .getQuantityOther4());
			 * txtArticleOther4.setText(refResidentInventoryPersonalEffect
			 * .getArticleOther4());
			 * txtQuantityOther5.setText(refResidentInventoryPersonalEffect
			 * .getQuantityOther5());
			 * txtArticleOther5.setText(refResidentInventoryPersonalEffect
			 * .getArticleOther5());
			 * txtQuantityOther6.setText(refResidentInventoryPersonalEffect
			 * .getQuantityOther6());
			 * txtArticleOther6.setText(refResidentInventoryPersonalEffect
			 * .getArticleOther6());
			 * txtQuantityOther7.setText(refResidentInventoryPersonalEffect
			 * .getQuantityOther7());
			 * txtArticleOther7.setText(refResidentInventoryPersonalEffect
			 * .getArticleOther7());
			 * txtQuantityOther8.setText(refResidentInventoryPersonalEffect
			 * .getQuantityOther8());
			 * txtArticleOther8.setText(refResidentInventoryPersonalEffect
			 * .getArticleOther8());
			 * txtQuantityOther9.setText(refResidentInventoryPersonalEffect
			 * .getQuantityOther9());
			 * txtArticleOther9.setText(refResidentInventoryPersonalEffect
			 * .getArticleOther9());
			 */
			txtRemarks.setText(refResidentInventoryPersonalEffect.getRemarks());
		}
	}

	public boolean doValidate() {
		return true;
	}

}
