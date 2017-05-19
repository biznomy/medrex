package medrex.client.main.physicanOrders.physicianOrderScreen;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.dataObj.physicianOrders.Fungal;
import medrex.commons.dataObj.physicianOrders.SkinTears;
import medrex.commons.dataObj.physicianOrders.Stage1;
import medrex.commons.dataObj.physicianOrders.Stage2;
import medrex.commons.dataObj.physicianOrders.Stage3or4;
import medrex.commons.dataObj.physicianOrders.Ulcer;
import medrex.commons.dataObj.physicianOrders.Wound;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderRecord;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderTreatment;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;
import com.toedter.calendar.JDateChooser;

public class PanelPhysicianOrderTreatment extends JxPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5297431692615483882L;
	private JCheckBox cbOther;
	private JCheckBox cbProtectiveBarrier;
	private JCheckBox cbFoamDressing;
	private JCheckBox cbDays;
	private JCheckBox cbHydrocolloid;
	private JCheckBox cbSkinSealants;
	private JCheckBox cbApplyProtective;
	private JLabel lLocation;
	private JTextField txtLocation;
	private JCheckBox cbWoundPhysician;
	private JCheckBox cbTp;
	private JCheckBox cbChairCushion;
	private JCheckBox cbWeeklyWoundEval;
	private JCheckBox cbSpecialityMattress;
	private JCheckBox cbWeeklySkinAssessment;
	private JCheckBox cbNutritional;
	private JRadioButton rbSkinTear;
	private JRadioButton rbStableHeel;
	private JRadioButton rbSurgicalWound;
	private JRadioButton rbFungalYeast;
	private JRadioButton rbStage4;
	private JRadioButton rbStage3;
	private JRadioButton rbStage2;
	private JRadioButton rbStage1;
	private ButtonGroup bgSkinInfection = new ButtonGroup();
	private ButtonGroup bgStages = new ButtonGroup();
	private JPanel panel_stage;
	private JPanel panel_skinInfection;

	private Map<String, Integer> map = new HashMap<String, Integer>();

	public PanelPhysicianOrderTreatment() {
		super();
		setPreferredSize(new Dimension(900, 800));
		Global.panelPhysicianOrderTreatment = this;
		setBorder(new LineBorder(ColorConstants.DEF_COLOR));
		setBackground(Color.WHITE);
		setArc(1.0f);
		setLayout(new BorderLayout());

		final JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.CENTER);

		rbStage1 = new JRadioButton();
		rbStage1.setActionCommand("1");
		rbStage1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				CardLayout cl = (CardLayout) (panel_stage.getLayout());
				cl.show(panel_stage, "stage1");
			}
		});
		rbStage1.setForeground(ColorConstants.DEF_COLOR);
		rbStage1.setFont(new Font("Tahoma", Font.BOLD, 10));
		bgStages.add(rbStage1);
		rbStage1.setBackground(Color.WHITE);
		rbStage1.setText("STAGE 1");
		rbStage1.setBounds(50, 0, 80, 20);
		panel.add(rbStage1);

		rbStage2 = new JRadioButton();
		rbStage2.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				CardLayout c2 = (CardLayout) (panel_stage.getLayout());

				c2.show(panel_stage, "stage2");
			}
		});
		rbStage2.setActionCommand("2");
		rbStage2.setForeground(ColorConstants.DEF_COLOR);
		rbStage2.setFont(new Font("Tahoma", Font.BOLD, 10));
		bgStages.add(rbStage2);
		rbStage2.setBackground(Color.WHITE);
		rbStage2.setText("STAGE 2");
		rbStage2.setBounds(157, 0, 80, 20);
		panel.add(rbStage2);

		rbStage3 = new JRadioButton();
		rbStage3.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				CardLayout c3 = (CardLayout) (panel_stage.getLayout());
				c3.show(panel_stage, "stage3or4");
			}
		});
		rbStage3.setActionCommand("3");
		rbStage3.setForeground(ColorConstants.DEF_COLOR);
		rbStage3.setFont(new Font("Tahoma", Font.BOLD, 10));
		bgStages.add(rbStage3);

		rbStage3.setBackground(Color.WHITE);
		rbStage3.setText("STAGE 3");
		rbStage3.setBounds(261, 0, 80, 20);
		panel.add(rbStage3);

		rbStage4 = new JRadioButton();
		rbStage4.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				CardLayout cl = (CardLayout) (panel_stage.getLayout());
				cl.show(panel_stage, "stage3or4");
			}
		});
		rbStage4.setActionCommand("4");
		rbStage4.setForeground(ColorConstants.DEF_COLOR);
		rbStage4.setFont(new Font("Tahoma", Font.BOLD, 10));
		bgStages.add(rbStage4);
		rbStage4.setBackground(Color.WHITE);
		rbStage4.setText("STAGE 4");
		rbStage4.setBounds(362, 0, 80, 20);
		panel.add(rbStage4);

		panel_skinInfection = new JPanel();
		panel_skinInfection.setLayout(new CardLayout());
		panel_skinInfection.setOpaque(false);
		panel_skinInfection.add(new PanelSkinInfectionFungal(), "fungal");
		panel_skinInfection.add(new PanelSkinInfectionUlcer(), "ulcer");
		panel_skinInfection.add(new PanelSkinInfectionWound(), "wound");
		panel_skinInfection
				.add(new PanelSkinInfectionSkinTears(), "skin_tears");
		panel_skinInfection.setBounds(50, 182, 533, 128);
		panel.add(panel_skinInfection);

		rbFungalYeast = new JRadioButton();
		rbFungalYeast.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				CardLayout c = (CardLayout) (panel_skinInfection.getLayout());
				c.show(panel_skinInfection, "fungal");
			}
		});
		rbFungalYeast.setActionCommand("1");
		rbFungalYeast.setForeground(ColorConstants.DEF_COLOR);
		rbFungalYeast.setFont(new Font("Tahoma", Font.BOLD, 10));
		bgSkinInfection.add(rbFungalYeast);
		rbFungalYeast.setBackground(Color.WHITE);
		rbFungalYeast.setText("FUNGAL/YEAST INFECTION");
		rbFungalYeast.setBounds(50, 160, 171, 20);
		panel.add(rbFungalYeast);

		rbStableHeel = new JRadioButton();
		rbStableHeel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				CardLayout c = (CardLayout) (panel_skinInfection.getLayout());
				c.show(panel_skinInfection, "ulcer");
			}
		});
		rbStableHeel.setActionCommand("2");
		rbStableHeel.setForeground(ColorConstants.DEF_COLOR);
		rbStableHeel.setFont(new Font("Tahoma", Font.BOLD, 10));
		bgSkinInfection.add(rbStableHeel);
		rbStableHeel.setBackground(Color.WHITE);
		rbStableHeel.setText("STABLE HEEL ULCER");
		rbStableHeel.setBounds(227, 160, 138, 20);
		panel.add(rbStableHeel);

		rbSurgicalWound = new JRadioButton();
		rbSurgicalWound.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				CardLayout c = (CardLayout) (panel_skinInfection.getLayout());
				c.show(panel_skinInfection, "wound");
			}
		});
		rbSurgicalWound.setActionCommand("3");
		rbSurgicalWound.setForeground(ColorConstants.DEF_COLOR);
		rbSurgicalWound.setFont(new Font("Tahoma", Font.BOLD, 10));
		bgSkinInfection.add(rbSurgicalWound);
		rbSurgicalWound.setBackground(Color.WHITE);
		rbSurgicalWound.setText("SUGICAL WOUND");
		rbSurgicalWound.setBounds(371, 160, 114, 20);
		panel.add(rbSurgicalWound);

		rbSkinTear = new JRadioButton();
		bgSkinInfection.add(rbSkinTear);
		rbSkinTear.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				CardLayout c = (CardLayout) (panel_skinInfection.getLayout());
				c.show(panel_skinInfection, "skin_tears");
			}
		});
		rbSkinTear.setActionCommand("4");
		rbSkinTear.setForeground(ColorConstants.DEF_COLOR);
		rbSkinTear.setFont(new Font("Tahoma", Font.BOLD, 10));
		rbSkinTear.setBackground(Color.WHITE);
		rbSkinTear.setText("SKIN TEARS");
		rbSkinTear.setBounds(491, 160, 92, 20);
		panel.add(rbSkinTear);

		cbNutritional = new JCheckBox();
		cbNutritional.setForeground(ColorConstants.DEF_COLOR);
		cbNutritional.setFont(new Font("Tahoma", Font.BOLD, 10));
		cbNutritional.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
			}
		});

		cbNutritional.setBackground(Color.WHITE);
		cbNutritional.setText("NUTRITIONAL CONSULT");
		cbNutritional.setBounds(50, 320, 158, 20);
		panel.add(cbNutritional);

		cbWeeklySkinAssessment = new JCheckBox();
		cbWeeklySkinAssessment.setForeground(ColorConstants.DEF_COLOR);
		cbWeeklySkinAssessment.setFont(new Font("Tahoma", Font.BOLD, 10));
		cbWeeklySkinAssessment.setBackground(Color.WHITE);
		cbWeeklySkinAssessment.setText("WEEKLY SKIN ASSESSMENT");
		cbWeeklySkinAssessment.setBounds(233, 320, 178, 20);
		panel.add(cbWeeklySkinAssessment);

		cbSpecialityMattress = new JCheckBox();
		cbSpecialityMattress.setForeground(ColorConstants.DEF_COLOR);
		cbSpecialityMattress.setFont(new Font("Tahoma", Font.BOLD, 10));
		cbSpecialityMattress.setBackground(Color.WHITE);
		cbSpecialityMattress.setText("SPECIALITY MATTRESS");
		cbSpecialityMattress.setBounds(412, 320, 149, 20);
		panel.add(cbSpecialityMattress);

		cbWoundPhysician = new JCheckBox();
		cbWoundPhysician.setForeground(ColorConstants.DEF_COLOR);
		cbWoundPhysician.setFont(new Font("Tahoma", Font.BOLD, 10));
		cbWoundPhysician.setBackground(Color.WHITE);
		cbWoundPhysician.setText("WOUND PHYSICIAN CONSULT");
		cbWoundPhysician.setBounds(50, 346, 186, 20);
		panel.add(cbWoundPhysician);

		cbWeeklyWoundEval = new JCheckBox();
		cbWeeklyWoundEval.setForeground(ColorConstants.DEF_COLOR);
		cbWeeklyWoundEval.setFont(new Font("Tahoma", Font.BOLD, 10));
		cbWeeklyWoundEval.setBackground(Color.WHITE);
		cbWeeklyWoundEval.setText("WEEKLY WOUND EVAL");
		cbWeeklyWoundEval.setBounds(236, 346, 153, 20);
		panel.add(cbWeeklyWoundEval);

		cbChairCushion = new JCheckBox();
		cbChairCushion.setBackground(Color.WHITE);
		cbChairCushion.setForeground(ColorConstants.DEF_COLOR);
		cbChairCushion.setFont(new Font("Tahoma", Font.BOLD, 10));
		cbChairCushion.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
			}
		});
		cbChairCushion.setText("CHAIR CUSHION");
		cbChairCushion.setBounds(443, 346, 116, 20);
		panel.add(cbChairCushion);

		cbTp = new JCheckBox();
		cbTp.setBackground(Color.WHITE);
		cbTp.setForeground(ColorConstants.DEF_COLOR);
		cbTp.setFont(new Font("Tahoma", Font.BOLD, 10));
		cbTp.setText("TP");
		cbTp.setBounds(392, 346, 45, 20);
		panel.add(cbTp);

		final JLabel skinCareManagemrntLabel = new JLabel();
		skinCareManagemrntLabel.setForeground(ColorConstants.DEF_COLOR);
		skinCareManagemrntLabel.setHorizontalAlignment(SwingConstants.CENTER);
		skinCareManagemrntLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		skinCareManagemrntLabel.setPreferredSize(new Dimension(0, 50));
		skinCareManagemrntLabel.setText("SKIN CARE MANAGEMENT");
		add(skinCareManagemrntLabel, BorderLayout.NORTH);

		final JxButton btnAddNew = new JxButton();
		btnAddNew.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				setBlankField();
			}

		});
		btnAddNew.setBackground(Color.WHITE);
		btnAddNew.setForeground(ColorConstants.DEF_COLOR);
		btnAddNew.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAddNew.setArc(0.4f);
		btnAddNew.setText("Add New");
		btnAddNew.setBounds(102, 372, 75, 21);
		panel.add(btnAddNew);

		final JxButton saveButton = new JxButton();
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
		saveButton.setBounds(236, 372, 75, 21);
		panel.add(saveButton);

		final JxButton deleteButton = new JxButton();
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
		deleteButton.setBounds(362, 372, 75, 21);
		panel.add(deleteButton);

		panel_stage = new JPanel();
		panel_stage.setLayout(new CardLayout());
		panel_stage.setOpaque(false);
		panel_stage.add(new PanelTreatmentStage1(), "stage1");
		panel_stage.add(new PanelTreatmentStage2(), "stage2");
		panel_stage.add(new PanelTreatmentStage3or4(), "stage3or4");
		panel_stage.add(new PanelTreatmentStage3or4(), "stage3or4");
		panel_stage.setBounds(50, 22, 546, 140);
		panel.add(panel_stage);

		fillCombos();

	}

	private void fillCombos() {
		List<Object[]> list = null;
		try {
			list = MedrexClientManager.getInstance().getMedicationFrequencies();
		} catch (Exception e) {

			e.printStackTrace();
		}
		Iterator<Object[]> it = list.iterator();
		while (it.hasNext()) {

			Object obj[] = it.next();
			map.put(obj[1].toString(), (Integer) obj[0]);
		}
	}

	public void doDelete() {
		try {
			if (Global.currentPhysicianOrderRecordKey != 0
					&& Global.currentPhysicianOrderTreatmentKey != 0) {
				MedrexClientManager.getInstance().deletePhysicianOrderRecord(
						Global.currentPhysicianOrderRecordKey);
				MedrexClientManager.getInstance()
						.deletePhysicianOrderTreatment(
								Global.currentPhysicianOrderTreatmentKey);

			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();

	}

	public void doSave() {

		PhysicianOrderTreatment refPhyTreat = new PhysicianOrderTreatment();

		Component[] comps = panel_stage.getComponents();
		for (Component com : comps) {
			if (com instanceof PanelTreatmentStage1 && com.isVisible()) {
				PanelTreatmentStage1 panel = (PanelTreatmentStage1) com;
				panel.doSave();
				Stage1 stage = panel.getStage1();
				refPhyTreat.setLocation(stage.getLocation());
				refPhyTreat.setApplyProtective(stage.isApplyProtective());
				refPhyTreat.setSkinSealants(stage.isSkinSealants());
				refPhyTreat.setHydrocolloid(stage.isHydrocolloid());
				refPhyTreat.setDays(stage.isDays());
				refPhyTreat.setFoamDressing(stage.isFoamDressing());
				refPhyTreat.setProtectiveBarrier(stage.isProtectiveBarrier());
				refPhyTreat.setOther(stage.isOther());
			}

			if (com instanceof PanelTreatmentStage2 && com.isVisible()) {
				PanelTreatmentStage2 panel = (PanelTreatmentStage2) com;
				panel.doSave();
				Stage2 stage = panel.getStage2();
				refPhyTreat.setGranulatingTissue(stage.getDays());
				refPhyTreat.setLocation(stage.getLocation());
				refPhyTreat.setApplyNoSting(stage.isApplyNoSting());
				refPhyTreat.setCleanseArea(stage.isCleanseArea());
				refPhyTreat.setHydrocolloid(stage.isHydrocolloid());
				refPhyTreat.setFoamDressing(stage.isFoamDressing());
				refPhyTreat.setDaysAndPrn(stage.isDaysAndPrn());
				refPhyTreat.setHydrogel(stage.isHydrogel());
			}

			if (com instanceof PanelTreatmentStage3or4 && com.isVisible()) {
				PanelTreatmentStage3or4 panel = (PanelTreatmentStage3or4) com;
				panel.doSave();
				Stage3or4 stage = panel.getStage3or4();
				refPhyTreat.setAllevyn(stage.isAllevyn());
				refPhyTreat.setSantyl(stage.isSantyl());
				refPhyTreat.setCovrsite(stage.isCovrsite());
				refPhyTreat.setCddDaily(stage.isCddDaily());
				refPhyTreat.setOther3or4(stage.isOther3or4());
				refPhyTreat.setOtherTxt(stage.getOtherTxt());
				refPhyTreat.setSilver(stage.isSilver());
				refPhyTreat.setChange(stage.getChangeTxt());
				refPhyTreat.setHydrogelWith(stage.isHydrogelWith());
				refPhyTreat.setCdd(stage.isCdd());
				refPhyTreat.setQ(stage.getQ());
				refPhyTreat.setCovrsiteWound(stage.isCovrsiteWound());
				refPhyTreat.setWoundOther(stage.isWoundOther());
				refPhyTreat.setWoundOtherTxt(stage.getWoundOtherTxt());
			}
		}

		Component[] compInfect = panel_skinInfection.getComponents();
		for (Component comInfection : compInfect) {
			if (comInfection instanceof PanelSkinInfectionFungal
					&& comInfection.isVisible()) {
				PanelSkinInfectionFungal panel = (PanelSkinInfectionFungal) comInfection;
				panel.doSave();
				Fungal infection = panel.getFungal();
				refPhyTreat.setAntifungal(infection.getAntifungal());
				refPhyTreat.setCleanse(infection.isCleanse());
			}

			if (comInfection instanceof PanelSkinInfectionUlcer
					&& comInfection.isVisible()) {
				PanelSkinInfectionUlcer panel = (PanelSkinInfectionUlcer) comInfection;
				panel.doSave();
				Ulcer infection = panel.getUlcer();
				refPhyTreat.setOffLoad(infection.isOffLoad());
				refPhyTreat.setHeelLift(infection.isHeelLift());
				refPhyTreat.setBarrierFilm(infection.isBarrierFilm());
			}

			if (comInfection instanceof PanelSkinInfectionWound
					&& comInfection.isVisible()) {
				PanelSkinInfectionWound panel = (PanelSkinInfectionWound) comInfection;
				panel.doSave();
				Wound infection = panel.getWound();
				refPhyTreat.setOta(infection.isOta());
				refPhyTreat.setShift(infection.isShift());
				refPhyTreat.setCleanseNs(infection.isCleanseNs());
				refPhyTreat.setRemoveStaples(infection.isRemoveStaples());
				refPhyTreat.setLocationWound(infection.getLocationWound());
				refPhyTreat.setDailyBid(infection.getDailyBid());
				refPhyTreat.setDateOn(infection.getOn());

			}
			if (comInfection instanceof PanelSkinInfectionSkinTears
					&& comInfection.isVisible()) {
				PanelSkinInfectionSkinTears panel = (PanelSkinInfectionSkinTears) comInfection;
				panel.doSave();
				SkinTears infection = panel.getSkinTears();
				refPhyTreat.setMiscellaneous(infection.isMiscellaneous());
				refPhyTreat.setCapillaryRefill(infection.isCapillaryRefill());
				refPhyTreat.setPedalPulse(infection.isPedalPulse());
				refPhyTreat.setLocationSkinTears(infection
						.getLocationSkinTears());
				refPhyTreat.setFrequencyRefill(infection.getFrequencyRefill());
				refPhyTreat.setLocationPedalPulse(infection
						.getLocationPedalPulse());
				refPhyTreat.setFrequencyPedalPulse(infection
						.getFrequencyPedalPulse());

			}

		}

		refPhyTreat.setStage(SwingUtils.getSelectedButton(bgStages));
		refPhyTreat.setSerial(Global.currentPhysicianOrderTreatmentKey);
		refPhyTreat.setResidentId(Global.currentResidenceKey);
		refPhyTreat.setSkinInfection(SwingUtils
				.getSelectedButton(bgSkinInfection));
		refPhyTreat.setNutritional(cbNutritional.isSelected());
		refPhyTreat
				.setWeeklySkinAssessment(cbWeeklySkinAssessment.isSelected());
		refPhyTreat.setSpecialityMattress(cbSpecialityMattress.isSelected());
		refPhyTreat.setWoundPhysician(cbWoundPhysician.isSelected());
		refPhyTreat.setWeeklyWoundEval(cbWeeklyWoundEval.isSelected());
		refPhyTreat.setTp(cbTp.isSelected());
		refPhyTreat.setChairCushion(cbChairCushion.isSelected());

		try {
			Global.currentPhysicianOrderTreatmentKey = MedrexClientManager
					.getInstance().insertOrUpdatePhysicianOrderTreat(
							refPhyTreat);
		} catch (Exception e) {
			e.printStackTrace();
		}
		PhysicianOrderRecord physRec = new PhysicianOrderRecord();
		physRec.setDateCreated(MedrexClientManager.getServerTime());
		physRec.setLastModified(MedrexClientManager.getServerTime());
		physRec.setFormId(Global.currentPhysicianOrderTreatmentKey);
		physRec.setFormType("Treatment");
	//	physRec.setResidentId(Global.currentResidenceKey);
		
	    ResidentMain resmain = null;
		try{
			resmain = MedrexClientManager.getInstance().getResident(Global.currentResidenceKey);
			
		}
		
		catch (Exception e) {
                
                  e.printStackTrace();


		 
		}
		physRec.setResidents(resmain);
		physRec.setStatus("");
		//physRec.setUser(Global.currentLoggedInUserKey);
		Users user = null;
		try{
			user = MedrexClientManager.getInstance().getUser(Global.currentLoggedInUserKey);
			
		}
		
		catch (Exception e) {
                  e.printStackTrace();


		 
		}
		 
		physRec.setUser(user);
		physRec.setSerial(Global.currentPhysicianOrderRecordKey);
		System.out.println("Selected Button Text Is:"
				+ SwingUtils.getSelectedButtonName(bgStages, SwingUtils
						.getSelectedButton(bgStages)));
		physRec.setTitle(SwingUtils.getSelectedButtonName(bgStages, SwingUtils
				.getSelectedButton(bgStages)));
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

	public void setValueObject(PhysicianOrderTreatment treatment) {
		SwingUtils.setSelectedButton(bgStages, treatment.getStage());
		SwingUtils.setSelectedButton(bgSkinInfection, treatment
				.getSkinInfection());
		cbNutritional.setSelected(treatment.getNutritional());
		cbChairCushion.setSelected(treatment.getChairCushion());
		cbSpecialityMattress.setSelected(treatment.getSpecialityMattress());
		cbTp.setSelected(treatment.getTp());
		cbWeeklySkinAssessment.setSelected(treatment.getWeeklySkinAssessment());
		cbWeeklyWoundEval.setSelected(treatment.getWeeklyWoundEval());
		cbWoundPhysician.setSelected(treatment.getWoundPhysician());
		Component[] comps = panel_stage.getComponents();
		for (Component com : comps) {
			if (com instanceof PanelTreatmentStage1 && com.isVisible()) {
				PanelTreatmentStage1 panel = (PanelTreatmentStage1) com;
				Stage1 stage = new Stage1();
				stage.setApplyProtective(treatment.getApplyProtective());
				stage.setDays(treatment.isDays());
				stage.setFoamDressing(treatment.getFoamDressing());
				stage.setHydrocolloid(treatment.getHydrocolloid());
				stage.setLocation(treatment.getLocation());
				stage.setOther(treatment.getOther());
				stage.setProtectiveBarrier(treatment.getProtectiveBarrier());
				stage.setSkinSealants(treatment.getSkinSealants());
				panel.setStage1(stage);
				panel.doUpdate();
			}
			if (com instanceof PanelTreatmentStage2 && com.isVisible()) {
				PanelTreatmentStage2 panel = (PanelTreatmentStage2) com;
				Stage2 stage = new Stage2();
				stage.setGranulatingTissue(treatment.getGranulatingTissue());
				stage.setLocation(treatment.getLocation());
				stage.setApplyNoSting(treatment.isApplyNoSting());
				stage.setCleanseArea(treatment.isCleanseArea());
				stage.setHydrocolloid(treatment.getHydrocolloid());
				stage.setFoamDressing(treatment.getFoamDressing());
				stage.setDaysAndPrn(treatment.isDaysAndPrn());
				stage.setHydrogel(treatment.isHydrogel());
				panel.setStage2(stage);
				panel.doUpdate();
			}
			if (com instanceof PanelTreatmentStage3or4 && com.isVisible()) {
				PanelTreatmentStage3or4 panel = (PanelTreatmentStage3or4) com;
				Stage3or4 stage = new Stage3or4();
				stage.setAllevyn(treatment.isAllevyn());
				stage.setSantyl(treatment.isSantyl());
				stage.setCovrsite(treatment.isCovrsite());
				stage.setCddDaily(treatment.isCddDaily());
				stage.setOther3or4(treatment.isOther3or4());
				stage.setOtherTxt(treatment.getOtherTxt());
				stage.setSilver(treatment.isSilver());
				stage.setChangeTxt(treatment.getChange());
				stage.setHydrogelWith(treatment.isHydrogelWith());
				stage.setCdd(treatment.isCdd());
				stage.setQ(treatment.getQ());
				stage.setCovrsiteWound(treatment.isCovrsiteWound());
				stage.setWoundOther(treatment.isWoundOther());
				stage.setWoundOtherTxt(treatment.getWoundOtherTxt());
				panel.setStage3or4(stage);
				panel.doUpdate();
			}
		}

		Component[] comp = panel_skinInfection.getComponents();
		for (Component c : comp) {
			if (c instanceof PanelSkinInfectionFungal && c.isVisible()) {
				PanelSkinInfectionFungal panel = (PanelSkinInfectionFungal) c;
				Fungal infection = new Fungal();
				infection.setAntifungal(treatment.getAntifungal());
				infection.setCleanse(treatment.isCleanse());
				panel.setFungal(infection);
				panel.doUpdate();
			}

			if (c instanceof PanelSkinInfectionUlcer && c.isVisible()) {
				PanelSkinInfectionUlcer panel = (PanelSkinInfectionUlcer) c;
				Ulcer infection = new Ulcer();
				infection.setOffLoad(treatment.isOffLoad());
				infection.setHeelLift(treatment.isHeelLift());
				infection.setBarrierFilm(treatment.isBarrierFilm());
				panel.setUlcer(infection);
				panel.doUpdate();
			}

			if (c instanceof PanelSkinInfectionWound && c.isVisible()) {
				PanelSkinInfectionWound panel = (PanelSkinInfectionWound) c;
				Wound infection = new Wound();
				infection.setOta(treatment.isOta());
				infection.setShift(treatment.isShift());
				infection.setCleanseNs(treatment.isCleanseNs());
				infection.setRemoveStaples(treatment.isRemoveStaples());
				infection.setLocationWound(treatment.getLocationWound());
				infection.setDailyBid(treatment.getDailyBid());
				infection.setOn(treatment.getDateOn());

				panel.setWound(infection);
				panel.doUpdate();
			}

			if (c instanceof PanelSkinInfectionSkinTears && c.isVisible()) {
				PanelSkinInfectionSkinTears panel = (PanelSkinInfectionSkinTears) c;
				SkinTears infection = new SkinTears();
				infection.setMiscellaneous(treatment.isMiscellaneous());
				infection.setCapillaryRefill(treatment.isCapillaryRefill());
				infection.setPedalPulse(treatment.isPedalPulse());
				infection
						.setLocationSkinTears(treatment.getLocationSkinTears());
				infection.setFrequencyRefill(treatment.getFrequencyRefill());
				infection.setLocationPedalPulse(treatment
						.getLocationPedalPulse());
				infection.setFrequencyPedalPulse(treatment
						.getFrequencyPedalPulse());
				panel.setSkinTears(infection);
				panel.doUpdate();
			}

		}
	}

	public void setBlankField() {
		Global.currentPhysicianOrderRecordKey = 0;
		Global.currentPhysicianOrderTreatmentKey = 0;
		// SwingUtils.setSelectedButton(bgSkinInfection,0);
		// SwingUtils.setSelectedButton(bgStages, 0);
		/**
		 * TODO: swing util is not setting radio button set selected false temp
		 * select false of radio buttons
		 */
		rbStage1.setSelected(false);
		rbStage2.setSelected(false);
		rbStage3.setSelected(false);
		rbStage4.setSelected(false);

		rbFungalYeast.setSelected(false);
		rbSkinTear.setSelected(false);
		rbStableHeel.setSelected(false);
		rbSurgicalWound.setSelected(false);

		cbChairCushion.setSelected(false);
		cbNutritional.setSelected(false);
		cbSpecialityMattress.setSelected(false);
		cbTp.setSelected(false);
		cbWeeklySkinAssessment.setSelected(false);
		cbWeeklyWoundEval.setSelected(false);
		cbWoundPhysician.setSelected(false);
		setChildBlankField();
		setInfectionBlankField();

	}

	public void setInfectionBlankField() {
		Component[] compInfection1 = panel_skinInfection.getComponents();
		for (Component compSkin1 : compInfection1) {
			if (compSkin1 instanceof JPanel) {
				JPanel panel1 = (JPanel) compSkin1;
				Component[] compInfection2 = panel1.getComponents();
				for (Component compSkin2 : compInfection2) {
					JPanel skinPanel = (JPanel) compSkin2;
					Component[] compInfection3 = skinPanel.getComponents();
					for (Component compSkin3 : compInfection3) {
						if (compSkin3 instanceof JCheckBox)
							((JCheckBox) compSkin3).setSelected(false);
						else if (compSkin3 instanceof JTextField)
							((JTextField) compSkin3).setText("");
						else if (compSkin3 instanceof JComboBox)
							((JComboBox) compSkin3).setSelectedItem("");
						else if (compSkin3 instanceof JDateChooser)
							((JDateChooser) compSkin3).setDate(null);
					}
				}

			}
		}

	}

	public void setChildBlankField() {
		Component[] comps = panel_stage.getComponents();
		for (Component com : comps) {
			if (com instanceof JPanel) {
				JPanel panel = (JPanel) com;
				Component[] coms = panel.getComponents();
				for (Component c : coms) {
					JPanel stagePanel = (JPanel) c;
					Component[] components = stagePanel.getComponents();
					for (Component co : components) {
						if (co instanceof JCheckBox)
							((JCheckBox) co).setSelected(false);
						else if (co instanceof JTextField)
							((JTextField) co).setText("");
						// else if(co instanceof JButtonGroup)
						// SwingUtils.setSelectedButton((JButtonGroup)co,-1);
					}
				}
			}
		}
	}
}
