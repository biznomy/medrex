package medrex.client.main.physicanOrders.physicianOrderScreen;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderRecord;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderTherapyTest;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;

public class PanelPhysicianOrderTherapyTest extends JxPanel {
	
	private JPanel panel_stage1;
	private JPanel panel_stage2;
	private JPanel panel_stage3n4;
	/**
	 * 
	 */
	private static final long serialVersionUID = -1276076710476267481L;
	private JRadioButton rbStage1;
	private JRadioButton rbStage2;
	private JRadioButton rbStage3;
	private JRadioButton rbStage4;
	private JTextField txtIncludeMeds;
	private JTextField txtIvf;
	private JTextField txtTpn;
	private JTextField txtOrders;
	private JTextField txtDuration;
	private JTextField txtRequiredLabs;
	private JTextField txtLineType;
	private JTextField txtCareOfLine;
	private JTextField txtDsg;
	private JTextField txtInsertionSite;
	private ButtonGroup bgStages; ;
	private JPanel panel_stage;
	private static int id=0;

	public PanelPhysicianOrderTherapyTest() {
		super();
		bgStages= new ButtonGroup();
		setPreferredSize(new Dimension(900, 800));
		Global.panelPhysicianOrderTherapyTest=this;
		setBorder(new LineBorder(ColorConstants.DEF_COLOR));
		setBackground(Color.WHITE);
		setArc(1.0f);
		setLayout(new BorderLayout());

		final JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.CENTER);

		final JLabel physicianOrderTherapyLabel = new JLabel();
		physicianOrderTherapyLabel.setBackground(Color.WHITE);
		physicianOrderTherapyLabel.setForeground(ColorConstants.DEF_COLOR);
		physicianOrderTherapyLabel
				.setHorizontalAlignment(SwingConstants.CENTER);
		physicianOrderTherapyLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		physicianOrderTherapyLabel.setPreferredSize(new Dimension(0, 50));
		physicianOrderTherapyLabel.setText("INTRAVENOUS THERAPY");
		add(physicianOrderTherapyLabel, BorderLayout.NORTH);

		panel_stage = new JPanel();
		panel_stage.setLayout(new FlowLayout());
		panel_stage.setPreferredSize(new Dimension(700, 350));
		panel_stage.setOpaque(false);
		panel_stage.setBounds(103, 67, 710, 411);
		panel.add(panel_stage);
		
		
		
		panel_stage1 = new JPanel();
		panel_stage1.setPreferredSize(new Dimension(650, 100));
		panel_stage.add(panel_stage1);
		panel_stage1.setBackground(Color.WHITE);
		panel_stage1.setLayout(null);
		panel_stage1.setOpaque(false);

		final JLabel includeIvMedsLabel = new JLabel();
		includeIvMedsLabel.setForeground(ColorConstants.DEF_COLOR);
		includeIvMedsLabel.setFont(new Font("", Font.BOLD, 12));
		includeIvMedsLabel.setText("INCLUDE IV MEDS");
		includeIvMedsLabel.setBounds(100, 10, 120, 16);
		panel_stage1.add(includeIvMedsLabel);

		final JLabel ivfLabel = new JLabel();
		ivfLabel.setForeground(ColorConstants.DEF_COLOR);
		ivfLabel.setFont(new Font("", Font.BOLD, 12));
		ivfLabel.setText("IVF");
		ivfLabel.setBounds(100, 40, 120, 16);
		panel_stage1.add(ivfLabel);

		final JLabel tpnLabel = new JLabel();
		tpnLabel.setForeground(ColorConstants.DEF_COLOR);
		tpnLabel.setFont(new Font("", Font.BOLD, 12));
		tpnLabel.setText("TPN");
		tpnLabel.setBounds(100, 70, 120, 16);
		panel_stage1.add(tpnLabel);

		txtIncludeMeds = new JTextField();
		txtIncludeMeds.setForeground(ColorConstants.DEF_COLOR);
		txtIncludeMeds.setBounds(250, 10, 120, 16);
		panel_stage1.add(txtIncludeMeds);

		txtIvf = new JTextField();
		txtIvf.setForeground(ColorConstants.DEF_COLOR);
		txtIvf.setBorder(new LineBorder(Color.black, 1, false));
		txtIvf.setBounds(250, 40, 120, 16);
		panel_stage1.add(txtIvf);

		txtTpn = new JTextField();
		txtTpn.setForeground(ColorConstants.DEF_COLOR);
		txtTpn.setBorder(new LineBorder(Color.black, 1, false));
		txtTpn.setBounds(250, 70, 120, 16);
		panel_stage1.add(txtTpn);
		
		
		
		panel_stage2 = new JPanel();
		panel_stage2.setPreferredSize(new Dimension(650, 100));
		panel_stage.add(panel_stage2);
		panel_stage2.setBackground(Color.WHITE);
		panel_stage2.setLayout(null);
		panel_stage2.setOpaque(false);

		final JLabel ordersLabel = new JLabel();
		ordersLabel.setForeground(ColorConstants.DEF_COLOR);
		ordersLabel.setFont(new Font("", Font.BOLD, 12));
		ordersLabel.setText("ORDERS");
		ordersLabel.setBounds(100, 10, 120, 16);
		panel_stage2.add(ordersLabel);

		final JLabel durationLabel = new JLabel();
		durationLabel.setForeground(ColorConstants.DEF_COLOR);
		durationLabel.setFont(new Font("", Font.BOLD, 12));
		durationLabel.setText("DURATION");
		durationLabel.setBounds(100, 40, 120, 16);
		panel_stage2.add(durationLabel);

		final JLabel requiredLabsLabel = new JLabel();
		requiredLabsLabel.setForeground(ColorConstants.DEF_COLOR);
		requiredLabsLabel.setFont(new Font("", Font.BOLD, 12));
		requiredLabsLabel.setText("REQUIRED LABS");
		requiredLabsLabel.setBounds(100, 70, 120, 16);
		panel_stage2.add(requiredLabsLabel);

		txtOrders = new JTextField();
		txtOrders.setForeground(ColorConstants.DEF_COLOR);
		txtOrders.setBorder(new LineBorder(Color.black, 1, false));
		txtOrders.setBounds(250, 10, 120, 16);
		panel_stage2.add(txtOrders);

		txtDuration = new JTextField();
		txtDuration.setForeground(ColorConstants.DEF_COLOR);
		txtDuration.setBorder(new LineBorder(Color.black, 1, false));
		txtDuration.setBounds(250, 40, 120, 16);
		panel_stage2.add(txtDuration);

		txtRequiredLabs = new JTextField();
		txtRequiredLabs.setForeground(ColorConstants.DEF_COLOR);
		txtRequiredLabs.setBorder(new LineBorder(Color.black, 1, false));
		txtRequiredLabs.setBounds(250, 70, 120, 16);
		panel_stage2.add(txtRequiredLabs);
		
		
		
		panel_stage3n4 = new JPanel();
		panel_stage3n4.setPreferredSize(new Dimension(650, 150));
		panel_stage.add(panel_stage3n4);
		panel_stage3n4.setBackground(Color.WHITE);
		panel_stage3n4.setLayout(null);
		panel_stage3n4.setOpaque(false);

		final JLabel lineTypeLabel = new JLabel();
		lineTypeLabel.setForeground(ColorConstants.DEF_COLOR);
		lineTypeLabel.setFont(new Font("", Font.BOLD, 12));
		lineTypeLabel.setText("LINE TYPE");
		lineTypeLabel.setBounds(100, 10, 120, 16);
		panel_stage3n4.add(lineTypeLabel);

		final JLabel careOfLineLabel = new JLabel();
		careOfLineLabel.setForeground(ColorConstants.DEF_COLOR);
		careOfLineLabel.setFont(new Font("", Font.BOLD, 12));
		careOfLineLabel.setText("CARE OF LINE");
		careOfLineLabel.setBounds(100, 40, 120, 16);
		panel_stage3n4.add(careOfLineLabel);

		final JLabel dsgLabel = new JLabel();
		dsgLabel.setForeground(ColorConstants.DEF_COLOR);
		dsgLabel.setFont(new Font("", Font.BOLD, 12));
		dsgLabel.setText("DSG");
		dsgLabel.setBounds(100, 70, 120, 16);
		panel_stage3n4.add(dsgLabel);

		final JLabel insertionSiteLabel = new JLabel();
		insertionSiteLabel.setForeground(ColorConstants.DEF_COLOR);
		insertionSiteLabel.setFont(new Font("", Font.BOLD, 12));
		insertionSiteLabel.setText("INSERTION SITE");
		insertionSiteLabel.setBounds(100, 100, 120, 16);
		panel_stage3n4.add(insertionSiteLabel);

		txtLineType = new JTextField();
		txtLineType.setForeground(ColorConstants.DEF_COLOR);
		txtLineType.setBorder(new LineBorder(Color.black, 1, false));
		txtLineType.setBounds(250, 10, 120, 16);
		panel_stage3n4.add(txtLineType);

		txtCareOfLine = new JTextField();
		txtCareOfLine.setForeground(ColorConstants.DEF_COLOR);
		txtCareOfLine.setBorder(new LineBorder(Color.black, 1, false));
		txtCareOfLine.setBounds(250, 40, 120, 16);
		panel_stage3n4.add(txtCareOfLine);

		txtDsg = new JTextField();
		txtDsg.setForeground(ColorConstants.DEF_COLOR);
		txtDsg.setBorder(new LineBorder(Color.black, 1, false));
		txtDsg.setBounds(250, 70, 120, 16);
		panel_stage3n4.add(txtDsg);

		txtInsertionSite = new JTextField();
		txtInsertionSite.setForeground(ColorConstants.DEF_COLOR);
		txtInsertionSite.setBorder(new LineBorder(Color.black, 1, false));
		txtInsertionSite.setBounds(250, 100, 120, 16);
		panel_stage3n4.add(txtInsertionSite);

		final JPanel panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(650, 50));
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_stage.add(panel_2);
		
		

		final JxButton btnAddNew = new JxButton();
		btnAddNew.setBounds(50, 5, 120, 30);
		panel_2.add(btnAddNew);
		btnAddNew.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				setBlankField();
				Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();
			}

		});
		btnAddNew.setBackground(Color.WHITE);
		btnAddNew.setForeground(ColorConstants.DEF_COLOR);
		btnAddNew.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAddNew.setArc(0.4f);
		btnAddNew.setText("Add New");

		final JxButton saveButton = new JxButton();
		saveButton.setBounds(200, 5, 120, 30);
		panel_2.add(saveButton);
		saveButton.setBackground(Color.WHITE);
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				 doSave();
				Global.framePhysicianOrder.dispose();
			}

		});
		saveButton.setForeground(ColorConstants.DEF_COLOR);
		saveButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		saveButton.setArc(0.4f);
		saveButton.setText("Save");

		final JxButton deleteButton = new JxButton();
		deleteButton.setBounds(350, 5, 120, 30);
		panel_2.add(deleteButton);
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				 doDelete();
				 setBlankField();
			}

		});
		deleteButton.setBackground(Color.WHITE);
		deleteButton.setForeground(ColorConstants.DEF_COLOR);
		deleteButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		deleteButton.setArc(0.4f);
		deleteButton.setText("Delete");

		final JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(700, 50));
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(101, 10, 712, 40);
		panel.add(panel_1);

		rbStage1 = new JRadioButton();
		rbStage1.setBounds(50, 5, 120, 30);
		panel_1.add(rbStage1);
		rbStage1.setActionCommand("1");
		rbStage1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				doSelection();
			}
		});
		rbStage1.setForeground(ColorConstants.DEF_COLOR);
		rbStage1.setFont(new Font("Tahoma", Font.BOLD, 10));
		rbStage1.setSelected(true);
		bgStages.add(rbStage1);
		rbStage1.setBackground(Color.WHITE);
		rbStage1.setText("Central");

		rbStage2 = new JRadioButton();
		rbStage2.setActionCommand("2");
		rbStage2.setBounds(200, 5, 120, 30);
		panel_1.add(rbStage2);
		rbStage2.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				doSelection();
			}
		});
//		rbStage2.setActionCommand("2");
		rbStage2.setForeground(ColorConstants.DEF_COLOR);
		rbStage2.setFont(new Font("Tahoma", Font.BOLD, 10));
		rbStage2.setSelected(true);
		bgStages.add(rbStage2);
		rbStage2.setBackground(Color.WHITE);
		rbStage2.setText("PICC");

		rbStage3 = new JRadioButton();
		rbStage3.setActionCommand("3");
		rbStage3.setBounds(350, 5, 120, 30);
		panel_1.add(rbStage3);
		rbStage3.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSelection();
			}
		});
//		rbStage3.setActionCommand("3");
		rbStage3.setForeground(ColorConstants.DEF_COLOR);
		rbStage3.setFont(new Font("Tahoma", Font.BOLD, 10));
		rbStage3.setSelected(true);
		bgStages.add(rbStage3);

		rbStage3.setBackground(Color.WHITE);
		rbStage3.setText("Peripheral");

		rbStage4 = new JRadioButton();
		rbStage4.setBounds(500, 5, 120, 30);
		panel_1.add(rbStage4);
		rbStage4.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSelection();
			}
		});
		rbStage4.setActionCommand("4");
		rbStage4.setForeground(ColorConstants.DEF_COLOR);
		rbStage4.setFont(new Font("Tahoma", Font.BOLD, 10));
		rbStage4.setSelected(true);
		bgStages.add(rbStage4);

		rbStage4.setBackground(Color.WHITE);
		rbStage4.setText("Portacath");
		
		doSelection();
		//Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();
		
		
		
	}
	
private void doSelection() {
		
		
		if(rbStage1.isSelected()){
			panel_stage1.setVisible(true);
			panel_stage2.setVisible(false);
			panel_stage3n4.setVisible(false);
		}
		
		if(rbStage2.isSelected()){
			panel_stage1.setVisible(false);
			panel_stage2.setVisible(true);
			panel_stage3n4.setVisible(false);
		}
		
		if(rbStage3.isSelected()){
			panel_stage1.setVisible(false);
			panel_stage2.setVisible(false);
			panel_stage3n4.setVisible(true);
		}
		
		if(rbStage4.isSelected()){
			panel_stage1.setVisible(false);
			panel_stage2.setVisible(false);
			panel_stage3n4.setVisible(true);
		}
		
}

	private void setBlankField() {
		Global.currentPhysicianOrderRecordKey = 0;
		Global.currentPhysicianOrderTherapyTestkey = 0;
		
		txtCareOfLine.setText("");
		txtDsg.setText("");
		txtDuration.setText("");
		txtIncludeMeds.setText("");
		txtInsertionSite.setText("");
		txtIvf.setText("");
		txtLineType.setText("");
		txtOrders.setText("");
		txtRequiredLabs.setText("");
		txtTpn.setText("");
		
	}
	
	
	public void doSave() {
		
		PhysicianOrderTherapyTest phytherapy = new PhysicianOrderTherapyTest();
		phytherapy.setSerial(id);
		
		ResidentMain residentMain=null;
		
		try {
			residentMain=MedrexClientManager.getInstance().getResident(Global.currentResidenceKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
		phytherapy.setResidents(residentMain);
		phytherapy.setStages(SwingUtils.getSelectedButton(bgStages));
		phytherapy.setCareOfLine(txtCareOfLine.getText());
		phytherapy.setDsg(txtDsg.getText());
		phytherapy.setDuration(txtDuration.getText());
		phytherapy.setIncludeMeds(txtIncludeMeds.getText());
		phytherapy.setInsertionSite(txtInsertionSite.getText());
		phytherapy.setIvf(txtIvf.getText());
		phytherapy.setLineType(txtLineType.getText());
		phytherapy.setOrders(txtOrders.getText());
		phytherapy.setRequiredLabs(txtRequiredLabs.getText());
		phytherapy.setTpn(txtTpn.getText());
		
		
		
		
		try{
			Global.currentPhysicianOrderTherapyTestkey= MedrexClientManager
			.getInstance().insertOrUpdatePhysicianOrderTherapyTest(phytherapy);
		}
		catch (RemoteException e) {

			e.printStackTrace();
		} catch (MedrexException e) {

			e.printStackTrace();
		}
		
		PhysicianOrderRecord phyortherapy = new PhysicianOrderRecord();
		phyortherapy.setDateCreated(MedrexClientManager.getServerTime());
		phyortherapy.setLastModified(MedrexClientManager.getServerTime());
		phyortherapy.setFormId(Global.currentPhysicianOrderTherapyTestkey);
		phyortherapy.setFormType("INTRAVENOUSTHERAPY");
		
		ResidentMain resmain = null;
		try{
			resmain = MedrexClientManager.getInstance().getResident(Global.currentResidenceKey);
		}
		
		catch (Exception e) {
		 
		}
		phyortherapy.setResidents(resmain);
		
		phyortherapy.setStatus("");
		phyortherapy
				.setTitle(txtCareOfLine.getText());
		
		Users user = null;
		try{
			user = MedrexClientManager.getInstance().getUser(Global.currentLoggedInUserKey);
		}
		catch (Exception e) {
		}
		phyortherapy.setUser(user);
		phyortherapy.setTitle("IV Therapy");
		phyortherapy.setSerial(Global.currentPhysicianOrderRecordKey);
		try {
			Global.currentPhysicianOrderRecordKey = MedrexClientManager
					.getInstance().insertOrUpdatePhysicianOrderRecord(phyortherapy);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (Global.panelPhysicianOrderDetails != null) {
			Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();
		}
		setBlankField();
	}
	

	private void doDelete() {
		
		try {
			if (Global.currentPhysicianOrderRecordKey != 0
					&& Global.currentPhysicianOrderTherapyTestkey != 0) {
				MedrexClientManager.getInstance().deletePhysicianOrderRecord(
						Global.currentPhysicianOrderRecordKey);
				MedrexClientManager.getInstance()
						.deletePhysicianOrderTherapyTest(
								Global.currentPhysicianOrderTherapyTestkey);

			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();

	}
	
	public   void setValueObjectTh(PhysicianOrderTherapyTest therapy){
		
		txtCareOfLine.setText(therapy.getCareOfLine());
		txtDsg.setText(therapy.getDsg());
		txtDuration.setText(therapy.getDuration());
		txtIncludeMeds.setText(therapy.getIncludeMeds());
		txtInsertionSite.setText(therapy.getInsertionSite());
		txtIvf.setText(therapy.getIvf());
		txtLineType.setText(therapy.getLineType());
		txtOrders.setText(therapy.getOrders());
		txtRequiredLabs.setText(therapy.getRequiredLabs());
		txtTpn.setText(therapy.getTpn());
		SwingUtils.setSelectedButton(bgStages, therapy.getStages());
		id=therapy.getSerial();
		
		
		}
}
