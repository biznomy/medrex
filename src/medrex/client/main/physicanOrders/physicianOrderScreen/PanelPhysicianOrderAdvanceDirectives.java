package medrex.client.main.physicanOrders.physicianOrderScreen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderAdvanceDirectives;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderRecord;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;
import com.sX.theme.BlueOverWhiteTheme;

import com.sX.swing.JxButton;
import com.sX.swing.JxLabel;
import com.sX.swing.JxText;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxCheckBox;
import com.sX.swing.JxRadioButton;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxTextA;
import com.sX.swing.JxPanel;


public class PanelPhysicianOrderAdvanceDirectives extends JxPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3678819641964266370L;
	private JxComboBox cmbDNH;
	private JxPanel panelDNR;
	private JxComboBox cmbDNR;
	private JxCheckBox cbAdvanceDirectivesReviewed;
	private JxCheckBox cbNotInterested;
	private JxCheckBox cbWishesToDiscuss;
	private JxCheckBox cbWillPronde;
	private JxCheckBox cbOnFile;
	private JxComboBox cmbAdvancedDirectives;
	private JxPanel panel_1;
	private JxLabel wishesLabel;
	private JxTextA txtWishes;

	public PanelPhysicianOrderAdvanceDirectives() {
		super();
		Global.panelPhysicianOrdersAdvanceDirectives = this;
		setBorder(new LineBorder(ColorConstants.DEF_COLOR, 1));
		setArc(1.0f);

		setBackground(Color.WHITE);
		setLayout(new BorderLayout());
		
		BlueOverWhiteTheme theme = new BlueOverWhiteTheme();

		final JxLabel advanceDirectivesLabel = new JxLabel();
		advanceDirectivesLabel.setTheme (theme);
		advanceDirectivesLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		advanceDirectivesLabel.setHorizontalAlignment(SwingConstants.CENTER);

advanceDirectivesLabel.setFontStyle(Font.BOLD);
		advanceDirectivesLabel.setPreferredSize(new Dimension(0, 50));
		advanceDirectivesLabel.setText("ADVANCED DIRECTIVES");
		add(advanceDirectivesLabel, BorderLayout.NORTH);

		final JxPanel panel = new JxPanel();
		panel.setTheme (theme);
		panel.setLayout(null);

panel.setFontSize(12);
panel.setFontStyle(Font.BOLD);

		add(panel, BorderLayout.CENTER);

		final JxLabel hasAdvancedDirectiveLabel = new JxLabel();
		hasAdvancedDirectiveLabel.setTheme (theme);
		hasAdvancedDirectiveLabel.setForeground(ColorConstants.DEF_COLOR);

hasAdvancedDirectiveLabel.setFontSize(12);
hasAdvancedDirectiveLabel.setFontStyle(Font.BOLD);
		hasAdvancedDirectiveLabel.setBounds(30, 25, 178, 16);
		hasAdvancedDirectiveLabel.setText("Has Advanced Directive");
		panel.add(hasAdvancedDirectiveLabel);

		cmbAdvancedDirectives = new JxComboBox();
		cmbAdvancedDirectives.setTheme (theme);
		cmbAdvancedDirectives.setModel(new DefaultComboBoxModel(new String[] {
				"", "Yes", "No" }));

		cmbAdvancedDirectives.setBounds(268, 25, 127, 18);
		panel.add(cmbAdvancedDirectives);

		cbOnFile = new JxCheckBox();
		cbOnFile.setTheme (theme);
		cbOnFile.setForeground(ColorConstants.DEF_COLOR);

cbOnFile.setFontSize(12);
cbOnFile.setFontStyle(Font.BOLD);

		cbOnFile.setText("On File");
		cbOnFile.setBounds(72, 60, 118, 18);
		panel.add(cbOnFile);

		cbWillPronde = new JxCheckBox();
		cbWillPronde.setTheme (theme);
		cbWillPronde.setForeground(ColorConstants.DEF_COLOR);

cbWillPronde.setFontSize(12);
cbWillPronde.setFontStyle(Font.BOLD);

		cbWillPronde.setText("Will Provide");
		cbWillPronde.setBounds(72, 90, 118, 18);
		panel.add(cbWillPronde);

		cbWishesToDiscuss = new JxCheckBox();
		cbWishesToDiscuss.setTheme (theme);
		cbWishesToDiscuss.setForeground(ColorConstants.DEF_COLOR);

cbWishesToDiscuss.setFontSize(12);
cbWishesToDiscuss.setFontStyle(Font.BOLD);

		cbWishesToDiscuss.setText("Wishes to Discuss");
		cbWishesToDiscuss.setBounds(72, 120, 164, 18);
		panel.add(cbWishesToDiscuss);

		cbNotInterested = new JxCheckBox();
		cbNotInterested.setTheme (theme);
		cbNotInterested.setForeground(ColorConstants.DEF_COLOR);

cbNotInterested.setFontSize(12);
cbNotInterested.setFontStyle(Font.BOLD);

		cbNotInterested.setText("Present");
		cbNotInterested.setBounds(72, 150, 215, 18);
		panel.add(cbNotInterested);

		cbAdvanceDirectivesReviewed = new JxCheckBox();
		cbAdvanceDirectivesReviewed.setTheme (theme);
		cbAdvanceDirectivesReviewed.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				boolean a = cbAdvanceDirectivesReviewed.isSelected();
				if (a) {
					panel_1.setVisible(true);
				} else {
					panel_1.setVisible(false);
				}

			}
		});
		cbAdvanceDirectivesReviewed.setForeground(ColorConstants.DEF_COLOR);

cbAdvanceDirectivesReviewed.setFontSize(12);
cbAdvanceDirectivesReviewed.setFontStyle(Font.BOLD);

		cbAdvanceDirectivesReviewed
				.setText("<HTML><BODY>Advanced Directive Reviewed by D/W MD <br> Orders Reflect Residents Wishes <BODY><HTML>");
		cbAdvanceDirectivesReviewed.setBounds(72, 180, 317, 38);
		panel.add(cbAdvanceDirectivesReviewed);

		panelDNR = new JxPanel();
		panelDNR.setTheme (theme);
		panelDNR.setLayout(null);

		panelDNR.setBounds(30, 248, 456, 69);
		panel.add(panelDNR);

		final JxLabel dnrStatusLabel = new JxLabel();
		dnrStatusLabel.setTheme (theme);
		dnrStatusLabel.setForeground(ColorConstants.DEF_COLOR);

dnrStatusLabel.setFontSize(12);
dnrStatusLabel.setFontStyle(Font.BOLD);
		dnrStatusLabel.setBounds(0, 5, 131, 16);
		dnrStatusLabel.setText("DNR Status");
		panelDNR.add(dnrStatusLabel);

		cmbDNR = new JxComboBox();
		cmbDNR.setTheme (theme);
		cmbDNR.setModel(new DefaultComboBoxModel(new String[] { "",
				"FULL CODE", "DNR" }));

		cmbDNR.setBounds(234, 5, 127, 18);
		panelDNR.add(cmbDNR);

		final JxLabel dnhLabel = new JxLabel();
		dnhLabel.setTheme (theme);
		dnhLabel.setForeground(ColorConstants.DEF_COLOR);

dnhLabel.setFontSize(12);
dnhLabel.setFontStyle(Font.BOLD);
		dnhLabel.setText("DNH");
		dnhLabel.setBounds(0, 43, 66, 16);
		panelDNR.add(dnhLabel);

		cmbDNH = new JxComboBox();
		cmbDNH.setTheme (theme);
		cmbDNH.setModel(new DefaultComboBoxModel(
				new String[] { "", "Yes", "No" }));

		cmbDNH.setBounds(234, 43, 127, 18);
		panelDNR.add(cmbDNH);

		final JxButton btSave = new JxButton();
		btSave.setTheme (theme);

		btSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				doSave();
				Global.framePhysicianOrder.dispose();

			}
		});
		btSave.setForeground(ColorConstants.DEF_COLOR);

btSave.setFontSize(12);
btSave.setFontStyle(Font.BOLD);
		btSave.setArc(0.4f);
		btSave.setText("Save");
		btSave.setBounds(170, 340, 75, 21);
		panel.add(btSave);

		final JxButton btAddNew = new JxButton();
		btAddNew.setTheme (theme);

		btAddNew.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				setBlankField();
				Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();
			}
		});
		btAddNew.setForeground(ColorConstants.DEF_COLOR);

btAddNew.setFontSize(12);
btAddNew.setFontStyle(Font.BOLD);
		btAddNew.setArc(0.4f);
		btAddNew.setText("Add New");
		btAddNew.setBounds(70, 340, 75, 21);
		panel.add(btAddNew);

		final JxButton btDelete = new JxButton();
		btDelete.setTheme (theme);

		btDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doDelete();
			}
		});
		btDelete.setForeground(ColorConstants.DEF_COLOR);

btDelete.setFontSize(12);
btDelete.setFontStyle(Font.BOLD);
		btDelete.setArc(0.4f);
		btDelete.setText("Delete");
		btDelete.setBounds(270, 340, 75, 21);
		panel.add(btDelete);

		panel_1 = new JxPanel();
		panel_1.setTheme (theme);

		panel_1.setLayout(null);
		panel_1.setVisible(false);
		panel_1.setBounds(453, 180, 215, 56);
		panel.add(panel_1);

		wishesLabel = new JxLabel();
		wishesLabel.setTheme (theme);
		wishesLabel.setForeground(ColorConstants.DEF_COLOR);

wishesLabel.setFontSize(12);
wishesLabel.setFontStyle(Font.BOLD);
		wishesLabel.setText("Wishes");
		wishesLabel.setBounds(0, 0, 52, 16);
		panel_1.add(wishesLabel);

		txtWishes = new JxTextA();		
		txtWishes.setBorder(new LineBorder(Color.black, 1, true));
		txtWishes.setTheme (theme);
		txtWishes.setBounds(0, 18, 205, 30);
		txtWishes.setWrapStyleWord(true);
		panel_1.add(txtWishes);

	}

	public void doDelete() {
		try {
			if (Global.currentPhysicianOrderRecordKey != 0
					&& Global.currentPhysicianOrderAdvanceDirectivesKey != 0) {
				MedrexClientManager.getInstance().deletePhysicianOrderRecord(
						Global.currentPhysicianOrderRecordKey);
				MedrexClientManager
						.getInstance()
						.deletePhysicianOrderAdvanceDirectives(
								Global.currentPhysicianOrderAdvanceDirectivesKey);

			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();
		setBlankField();

	}

	public void doSave() {
	
		PhysicianOrderAdvanceDirectives phyadvance = new PhysicianOrderAdvanceDirectives();
		phyadvance.setAdvancedDirective(cmbAdvancedDirectives.getSelectedItem()
				.toString());
		phyadvance.setDNH(cmbDNH.getSelectedItem().toString());
		phyadvance.setDNR(cmbDNR.getSelectedItem().toString());
		phyadvance.setAdvanceDirectivesReviewed(cbAdvanceDirectivesReviewed
				.isSelected());
		phyadvance.setNotInterested(cbNotInterested.isSelected());
		phyadvance.setOnFile(cbOnFile.isSelected());
		phyadvance.setSerial(Global.currentPhysicianOrderAdvanceDirectivesKey);
		phyadvance.setWillPronde(cbWillPronde.isSelected());
		phyadvance.setWishesToDiscuss(cbWishesToDiscuss.isSelected());
		phyadvance.setWishes(txtWishes.getText());
		phyadvance.setResidentId(Global.currentResidenceKey);
		try {
			Global.currentPhysicianOrderAdvanceDirectivesKey = MedrexClientManager
					.getInstance()
					.insertOrUpdatePhysicianOrderAdvanceDirectives(phyadvance);
		} catch (Exception e1) {

			e1.printStackTrace();
		}

		PhysicianOrderRecord physRec = new PhysicianOrderRecord();
		physRec.setDateCreated(MedrexClientManager.getServerTime());
		physRec.setLastModified(MedrexClientManager.getServerTime());
		physRec.setFormId(Global.currentPhysicianOrderAdvanceDirectivesKey);
		physRec.setFormType("Advance Directives");
		
		
		//physRec.setResidentId(Global.currentResidenceKey);
		ResidentMain resmain = null;
		try{
			resmain = MedrexClientManager.getInstance().getResident(Global.currentResidenceKey);
			
		}
		
		catch (Exception e) {
			e.printStackTrace();
		 
		}
		physRec.setResidents(resmain);
		physRec.setStatus("");
		physRec.setTitle(cmbDNR.getSelectedItem().toString());
		
		Users user = null;
		try{
			user = MedrexClientManager.getInstance().getUser(Global.currentLoggedInUserKey);
			
		}
		
		catch (Exception e) {
			e.printStackTrace();
		 
		}
		//physRec.setUser(Global.currentLoggedInUserKey);
		physRec.setUser(user);
		physRec.setSerial(Global.currentPhysicianOrderRecordKey);

		try {
			Global.currentPhysicianOrderRecordKey = MedrexClientManager
					.getInstance().insertOrUpdatePhysicianOrderRecord(physRec);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (Global.panelPhysicianOrderDetails != null) {
			Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();
		}
		setBlankField();

	}

	private void setBlankField() {
		Global.currentPhysicianOrderRecordKey = 0;
		Global.currentPhysicianOrderAdvanceDirectivesKey = 0;

		cmbAdvancedDirectives.setSelectedItem("");
		cmbDNH.setSelectedItem("");
		cmbDNR.setSelectedItem("");
		cbAdvanceDirectivesReviewed.setSelected(false);
		cbNotInterested.setSelected(false);
		cbOnFile.setSelected(false);
		cbWillPronde.setSelected(false);
		cbWishesToDiscuss.setSelected(false);
		txtWishes.setText("");

	}

	public void setValueObject(PhysicianOrderAdvanceDirectives adv) {

		cmbAdvancedDirectives.setSelectedItem(adv.getAdvancedDirective());
		cmbDNH.setSelectedItem(adv.getDNH());
		cmbDNR.setSelectedItem(adv.getDNR());
		cbAdvanceDirectivesReviewed.setSelected(adv
				.isAdvanceDirectivesReviewed());
		cbNotInterested.setSelected(adv.isNotInterested());
		cbOnFile.setSelected(adv.isOnFile());
		cbWillPronde.setSelected(adv.isWillPronde());
		cbWishesToDiscuss.setSelected(adv.isWishesToDiscuss());
		txtWishes.setText(adv.getWishes());
	}

}
