package medrex.client.admin;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.admin.alert.FrameAlertSetting;
import medrex.client.admin.formConfig.PanelFormTree;

import medrex.client.admin.nursingHome.PanelNursingHomeInfo;
import medrex.client.admin.password.PanelPasswordSetting;
import medrex.client.admin.screenSaver.FrameScreenSaver;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;

public class PanelAdministrationDefault extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8466811924529145845L;
	private JLabel lblMasterSchedule;
	private JxPanel panelMasterSchedule;
	private JLabel lblFormManager;
	private JLabel lblAmbulation;
	private JxPanel panelAmbulation;
	private JLabel lblPassword;
	private JxPanel btnPassword;
	private JxPanel btnNursingHome;
	private JxPanel btnTriggerWords;
	private JxPanel btnAlert;
	private JxPanel panelScreenSaver;
	private JPanel censusControls;
	private JxPanel panelFormScheduler;
	private JxButton btnUserLogon;
	private JxButton btnSecurity;
	private JLabel cnaNameLabel;
	private JxPanel panelTemplets;
	private JxPanel panelResentNotes;
	private JLabel lblFormScheduler;
	private JLabel lblScreenSaver;
	private JLabel lblNotes;
	private JLabel lblTemplates;
	private JxPanel panelDietPlan;
	private JLabel lblDietPlan;
	private JxPanel panelDietList;
	private JLabel lblDietList;
	private JxPanel btnMedication;
	private JxPanel btnTreatment;
	private JxPanel btnFormConfig;
	private JxPanel btnFormManager;
	private JLabel lblFormConfig;
	private Component panelFormManager;

	public PanelAdministrationDefault() {
		super();
		setLayout(null);
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});
		setPreferredSize(new Dimension(968, 592));

		censusControls = new JPanel();
		censusControls.setOpaque(false);
		censusControls.setBounds(72, 10, 896, 485);
		censusControls.setLayout(null);
		add(censusControls);

		cnaNameLabel = new JLabel();
		cnaNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cnaNameLabel.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		cnaNameLabel.setFont(new Font("", Font.BOLD, 28));
		cnaNameLabel.setText("");
		cnaNameLabel.setBounds(0, 0, 356, 52);
		censusControls.add(cnaNameLabel);

		panelFormScheduler = new JxPanel(1.0f);
		panelFormScheduler.setLayout(null);
		panelFormScheduler.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent arg0) {
				if (panelFormScheduler.isEnabled()) {
					Global.panelAdministrationMain
							.changeCard(PanelAdministrationMain.FORM_SCHEDULER);
				}
			}
		});
		panelFormScheduler.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		panelFormScheduler.setBackground(Color.WHITE);
		panelFormScheduler.setBounds(0, 0, 180, 100);
		censusControls.add(panelFormScheduler);

		lblFormScheduler = new JLabel(new ImageIcon("img\\admin\\scheduler.png"));
		lblFormScheduler.setText("<html>FORM <br>SCHEDULER</html>");
		lblFormScheduler.setFont(new Font("", Font.BOLD, 14));
		lblFormScheduler.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		lblFormScheduler.setBackground(Color.WHITE);
		lblFormScheduler.setBounds(0, 0, 180, 100);
		panelFormScheduler.add(lblFormScheduler);

		btnUserLogon = new JxButton();
		btnUserLogon.setVisible(false);
		btnUserLogon.setArc(0.2f);
		btnUserLogon.setText("USER LOGON");
		btnUserLogon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (btnUserLogon.isEnabled()) {
					Global.panelAdministrationMain
							.changeCard(PanelAdministrationMain.USER_LOGON);
				}
			}
		});
		btnUserLogon.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		btnUserLogon.setFont(GuiModes.DESIGNER_SCREEN.getControlFont()
				.deriveFont(16f));
		btnUserLogon.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		btnUserLogon.setBackground(Color.WHITE);
		btnUserLogon.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		btnUserLogon.setLayout(null);
		btnUserLogon.setBounds(550, 326, 83, 52);
		censusControls.add(btnUserLogon);

		btnSecurity = new JxButton();
		btnSecurity.setVisible(false);
		btnSecurity.setArc(0.2f);
		btnSecurity.setText("SECURITY");
		btnSecurity.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (btnSecurity.isEnabled()) {
					Global.panelAdministrationMain
							.changeCard(PanelAdministrationMain.SECURITY);
				}
			}
		});
		btnSecurity.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		btnSecurity.setFont(GuiModes.DESIGNER_SCREEN.getControlFont()
				.deriveFont(16f));
		btnSecurity.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		btnSecurity.setBackground(Color.WHITE);
		btnSecurity.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		btnSecurity.setLayout(null);
		btnSecurity.setBounds(460, 326, 83, 52);
		censusControls.add(btnSecurity);

		panelScreenSaver = new JxPanel(1.0f);
		panelScreenSaver.setLayout(null);
		panelScreenSaver.setBackground(Color.WHITE);
		panelScreenSaver.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		panelScreenSaver.setVisible(true);
		panelScreenSaver.setBounds(0, 110, 180, 100);
		panelScreenSaver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				// if (btnScreenSaver.isEnabled()) {
				// Global.panelAdministrationMain.changeCard(PanelAdministrationMain.SCREEN_SAVER);
				// }
				FrameScreenSaver panelScreenSaver = new FrameScreenSaver();
				panelScreenSaver.setModal(true);
				panelScreenSaver.setVisible(true);
			}
		});
		censusControls.add(panelScreenSaver);

		lblScreenSaver = new JLabel(new ImageIcon("img\\admin\\screensaver.png"));
		lblScreenSaver.setText("<html>SCREEN SAVER <br>SETTING</html>");
		lblScreenSaver.setFont(new Font("", Font.BOLD, 14));
		lblScreenSaver.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		lblScreenSaver.setBackground(Color.WHITE);
		lblScreenSaver.setBounds(0, 0, 180, 100);
		panelScreenSaver.add(lblScreenSaver);

		panelTemplets = new JxPanel(1.0f);
		panelTemplets.setLayout(null);
		panelTemplets.setBackground(Color.WHITE);
		panelTemplets.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		panelTemplets.setVisible(true);
		panelTemplets.setBounds(200, 110, 180, 100);
		panelTemplets.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (panelFormScheduler.isEnabled()) {
					Global.panelAdministrationMain
							.changeCard(PanelAdministrationMain.TEMPLATE);
				}
			}
		});
		censusControls.add(panelTemplets);

		lblTemplates = new JLabel(new ImageIcon("img\\admin\\template.png"));
		lblTemplates.setText("TEMPLATES");
		lblTemplates.setFont(GuiModes.DESIGNER_SCREEN.getControlFont()
				.deriveFont(14f));
		lblTemplates.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		lblTemplates.setBackground(Color.WHITE);
		lblTemplates.setBounds(0, 0, 180, 100);
		panelTemplets.add(lblTemplates);

		panelResentNotes = new JxPanel(1.0f);
		panelResentNotes.setLayout(null);
		panelResentNotes.setBounds(200, 0, 180, 100);
		add(panelResentNotes);
		add(panelResentNotes);
		panelResentNotes.setBackground(Color.WHITE);
		panelResentNotes.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		panelResentNotes.setVisible(true);
		// btnResentNotes.setArc(0.2f);
		// btnResentNotes.setText("NOTES CATEGORIES");
		panelResentNotes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (panelFormScheduler.isEnabled()) {
					Global.panelAdministrationMain
							.changeCard(PanelAdministrationMain.NOTE_CATEGORIES);
				}
			}
		});
		censusControls.add(panelResentNotes);

		lblNotes = new JLabel(new ImageIcon("img\\admin\\notecategory.png"));
		lblNotes.setText("<html>NOTES <br>CATEGORIES</html>");
		lblNotes.setFont(GuiModes.DESIGNER_SCREEN.getControlFont().deriveFont(
				14f));
		lblNotes.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		lblNotes.setBackground(Color.WHITE);
		lblNotes.setBounds(0, 0, 180, 100);
		panelResentNotes.add(lblNotes);

		panelDietPlan = new JxPanel(1.0f);
		panelDietPlan.setLayout(null);
		panelDietPlan.setBounds(400, 0, 180, 100);
		add(panelDietPlan);
		panelDietPlan.setBackground(Color.WHITE);
		panelDietPlan.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		panelDietPlan.setVisible(true);
		// btnResentNotes.setArc(0.2f);
		// btnResentNotes.setText("NOTES CATEGORIES");
		panelDietPlan.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (panelFormScheduler.isEnabled()) {
					Global.panelAdministrationMain
							.changeCard(PanelAdministrationMain.DIET_PLAN);
				}
			}
		});
		censusControls.add(panelDietPlan);

		lblDietPlan = new JLabel(new ImageIcon("img\\admin\\dietPlanAdmin.jpg"));
		lblDietPlan.setText("DIET PLAN");
		lblDietPlan.setFont(GuiModes.DESIGNER_SCREEN.getControlFont()
				.deriveFont(14f));
		lblDietPlan.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		lblDietPlan.setBackground(Color.WHITE);
		lblDietPlan.setBounds(0, 0, 180, 100);
		panelDietPlan.add(lblDietPlan);

		panelDietList = new JxPanel(1.0f);
		panelDietList.setLayout(null);
		panelDietList.setBounds(400, 110, 180, 100);
		add(panelDietList);
		panelDietList.setBackground(Color.WHITE);
		panelDietList.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		panelDietList.setVisible(true);
		panelDietList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (panelFormScheduler.isEnabled()) {
					Global.panelAdministrationMain
							.changeCard(PanelAdministrationMain.DIET_LIST);
				}
			}
		});
		censusControls.add(panelDietList);

		lblDietList = new JLabel(new ImageIcon("img\\admin\\dietListAdmin.jpg"));
		lblDietList.setText("DIET LIST");
		lblDietList.setFont(GuiModes.DESIGNER_SCREEN.getControlFont()
				.deriveFont(14f));
		lblDietList.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		lblDietList.setBackground(Color.WHITE);
		lblDietList.setBounds(0, 0, 180, 100);
		panelDietList.add(lblDietList);

		btnAlert = new JxPanel(1.0f);
		btnAlert.setFont(new Font("", Font.BOLD, 16));
		btnAlert.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		btnAlert.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				FrameAlertSetting frameAlertSetting = new FrameAlertSetting();
				frameAlertSetting.setModal(true);
				frameAlertSetting.setVisible(true);
			}
		});
		btnAlert.setBackground(Color.WHITE);
		btnAlert.setBorder(new LineBorder(new Color(8, 68, 95), 2, false));
		btnAlert.setVisible(true);
		btnAlert.setArc(0.6f);
		// btnAlert.setText("ALERT");
		btnAlert.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		btnAlert.setBounds(0, 220, 180, 100);
		censusControls.add(btnAlert);

		lblDietList = new JLabel(new ImageIcon("img\\admin\\alertAdmin.gif"));
		lblDietList.setText("ALERT");
		lblDietList.setFont(GuiModes.DESIGNER_SCREEN.getControlFont()
				.deriveFont(14f));
		lblDietList.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		lblDietList.setBackground(Color.WHITE);
		lblDietList.setBounds(0, 0, 180, 100);
		btnAlert.add(lblDietList);

		btnTriggerWords = new JxPanel(1.0f);
		btnTriggerWords.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (btnTriggerWords.isEnabled()) {
					Global.panelAdministrationMain
							.changeCard(PanelAdministrationMain.TRIGGER_WORD);
				}
			}
		});
		btnTriggerWords.setFont(new Font("", Font.BOLD, 16));
		btnTriggerWords.setBackground(Color.WHITE);
		btnTriggerWords
				.setBorder(new LineBorder(new Color(8, 68, 95), 2, false));
		btnTriggerWords.setVisible(true);
		btnTriggerWords.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		btnTriggerWords.setArc(0.6f);
		// btnTriggerWords.setText("TRIGGER WORDS");
		btnTriggerWords.setBounds(200, 220, 180, 100);
		censusControls.add(btnTriggerWords);

		lblDietList = new JLabel(new ImageIcon("img\\admin\\trigerWordAdmin.jpg"));
		lblDietList.setText("TRIGGER WORDS");
		lblDietList.setFont(GuiModes.DESIGNER_SCREEN.getControlFont()
				.deriveFont(14f));
		lblDietList.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		lblDietList.setBackground(Color.WHITE);
		lblDietList.setBounds(0, 0, 180, 100);
		btnTriggerWords.add(lblDietList);

		btnMedication = new JxPanel(1.0f);
		btnMedication.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (btnMedication.isEnabled()) {
					Global.panelAdministrationMain
							.changeCard(PanelAdministrationMain.MEDICATION);
				}
			}
		});
		btnMedication.setFont(new Font("", Font.BOLD, 16));
		btnMedication.setBackground(Color.WHITE);
		btnMedication.setBorder(new LineBorder(new Color(8, 68, 95), 2, false));
		btnMedication.setVisible(true);
		btnMedication.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		btnMedication.setArc(0.6f);
		// btnMedication.setText("Medication");
		btnMedication.setBounds(400, 220, 180, 100);
		censusControls.add(btnMedication);

		lblDietList = new JLabel(new ImageIcon("img\\admin\\medicationAdmin.jpg"));
		lblDietList.setText("MEDICATION");
		lblDietList.setFont(GuiModes.DESIGNER_SCREEN.getControlFont()
				.deriveFont(14f));
		lblDietList.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		lblDietList.setBackground(Color.WHITE);
		lblDietList.setBounds(0, 0, 180, 100);
		btnMedication.add(lblDietList);

		// SURESH

		btnTreatment = new JxPanel(1.0f);
		btnTreatment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (btnTreatment.isEnabled()) {
					Global.panelAdministrationMain
							.changeCard(PanelAdministrationMain.TREATMENT);
				}
			}
		});

		btnTreatment.setFont(new Font("", Font.BOLD, 16));
		btnTreatment.setBackground(Color.WHITE);
		btnTreatment.setBorder(new LineBorder(new Color(8, 68, 95), 2, false));
		btnTreatment.setVisible(true);
		btnTreatment.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		btnTreatment.setArc(0.6f);
		// btnMedication.setText("Medication");
		btnTreatment.setBounds(600, 108, 180, 100);
		censusControls.add(btnTreatment);

		lblDietList = new JLabel(new ImageIcon("img\\admin\\treatmentAdmin.jpg"));
		btnTreatment.add(lblDietList);
		lblDietList.setText("TREATMENT");
		lblDietList.setFont(GuiModes.DESIGNER_SCREEN.getControlFont()
				.deriveFont(14f));
		lblDietList.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		lblDietList.setBackground(Color.WHITE);
		lblDietList.setBounds(0, 0, 180, 100);

		btnNursingHome = new JxPanel(1.0f);
		btnNursingHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
			
				if (btnNursingHome.isEnabled()) {										
				PanelNursingHomeInfo nhInfo = (PanelNursingHomeInfo) FrameFactory
							.createWindowOfType(PanelNursingHomeInfo.class);
					SwingUtils.center(nhInfo);
					nhInfo.setModal(true);
					nhInfo.setVisible(true);
				}
			}
		});
		btnNursingHome.setBackground(Color.WHITE);
		btnNursingHome
				.setBorder(new LineBorder(new Color(8, 68, 95), 2, false));
		btnNursingHome.setArc(0.6f);
		btnNursingHome.setFont(new Font("", Font.BOLD, 16));
		btnNursingHome.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		// btnNursingHome.setText("NURSING HOME");
		btnNursingHome.setBounds(0, 330, 180, 100);
		censusControls.add(btnNursingHome);

		lblDietList = new JLabel(new ImageIcon("img\\admin\\nursingHomeAdmin.jpg"));
		lblDietList.setText("NURSING HOME");
		lblDietList.setFont(GuiModes.DESIGNER_SCREEN.getControlFont()
				.deriveFont(14f));
		lblDietList.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		lblDietList.setBackground(Color.WHITE);
		lblDietList.setBounds(0, 0, 180, 100);
		btnNursingHome.add(lblDietList);

		btnPassword = new JxPanel();
		btnPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (btnPassword.isEnabled()) {
					PanelPasswordSetting pass = (PanelPasswordSetting) FrameFactory
							.createWindowOfType(PanelPasswordSetting.class);
					SwingUtils.center(pass);
					pass.setModal(true);
					pass.setVisible(true);
				}
			}
		});
		btnPassword.setBackground(Color.WHITE);
		btnPassword.setBorder(new LineBorder(new Color(8, 68, 95), 2, false));
		btnPassword.setArc(0.6f);
		btnPassword.setFont(new Font("", Font.BOLD, 16));
		btnPassword.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		btnPassword.setBorder(new LineBorder(new Color(8, 68, 95), 2, false));
		btnPassword.setArc(0.6f);
		btnPassword.setBounds(200, 332, 180, 100);
		censusControls.add(btnPassword);

		lblPassword = new JLabel(new ImageIcon("img/admin/password.png"));
		lblPassword.setFont(GuiModes.DESIGNER_SCREEN.getControlFont()
				.deriveFont(14f));
		lblPassword.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		lblPassword.setBackground(Color.WHITE);
		lblPassword.setText("<html>PASSWORD <br>SETTING</html>");
		btnPassword.add(lblPassword);

		btnFormConfig = new JxPanel();
		btnFormConfig.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (btnFormConfig.isEnabled()) {
					PanelFormTree cfgForm = (PanelFormTree) FrameFactory
							.createWindowOfType(PanelFormTree.class);
					SwingUtils.center(cfgForm);
					cfgForm.setModal(true);
					cfgForm.setVisible(true);
				}
			}
		});
		btnFormConfig.setBackground(Color.WHITE);
		btnFormConfig.setBorder(new LineBorder(new Color(8, 68, 95), 2, false));
		btnFormConfig.setArc(0.6f);
		btnFormConfig.setFont(new Font("", Font.BOLD, 16));
		btnFormConfig.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		btnFormConfig.setBorder(new LineBorder(new Color(8, 68, 95), 2, false));
		btnFormConfig.setArc(0.6f);
		btnFormConfig.setBounds(400, 330, 180, 100);
		censusControls.add(btnFormConfig);

		lblFormConfig = new JLabel(new ImageIcon("img\\admin\\Form.png"));
		lblFormConfig.setFont(GuiModes.DESIGNER_SCREEN.getControlFont()
				.deriveFont(14f));
		lblFormConfig.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		lblFormConfig.setBackground(Color.WHITE);
		lblFormConfig.setText("<html>FORM <br>CONFIGURATION</html>");
		btnFormConfig.add(lblFormConfig);

		panelAmbulation = new JxPanel(1.0f);
		panelAmbulation.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (panelAmbulation.isEnabled()) {
					Global.panelAdministrationMain
							.changeCard(PanelAdministrationMain.AMBULATION_WEIGHT);
				}
			}
		});
		panelAmbulation.setBackground(Color.WHITE);
		panelAmbulation.setLayout(null);
		panelAmbulation.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		panelAmbulation.setVisible(true);
		panelAmbulation.setBounds(600, 0, 180, 100);
		censusControls.add(panelAmbulation);

		lblAmbulation = new JLabel(new ImageIcon("img\\admin\\Ambulation1.jpg"));
		lblAmbulation.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAmbulation.setFont(GuiModes.DESIGNER_SCREEN.getControlFont()
				.deriveFont(14f));
		lblAmbulation.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		lblAmbulation.setBackground(Color.WHITE);
		lblAmbulation.setText("<html>AMBULATION <br>WEIGHT</html>");
		lblAmbulation.setBounds(0, 0, 180, 100);
		panelAmbulation.add(lblAmbulation);

		/*panelMasterSchedule = new JxPanel();
		panelMasterSchedule.setBackground(Color.WHITE);
		panelMasterSchedule.setBorder(new LineBorder(new Color(8, 68, 95), 2,
				false));
		panelMasterSchedule.setLayout(null);
		panelMasterSchedule.setBounds(600, 220, 180, 100);
		censusControls.add(panelMasterSchedule);

		lblMasterSchedule = new JLabel("   ");
		lblMasterSchedule.setText("  MASTER SCHEDULE");
		lblMasterSchedule.setBounds(0, 0, 180, 100);
		panelMasterSchedule.add(lblMasterSchedule);

		lblMasterSchedule.setFont(GuiModes.DESIGNER_SCREEN.getControlFont()
				.deriveFont(14f));
		lblMasterSchedule.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());

		panelMasterSchedule.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				//PanelMasterScheduleMain panelMasterScheduleMain = new PanelMasterScheduleMain();
				//SwingUtils.openInDialog(panelMasterScheduleMain);

				
				 * if (panelMasterSchedule.isEnabled()) {
				 * Global.panelAdministrationMain
				 * .changeCard(PanelAdministrationMain.MASTER_SCHEDULE); }
				 
			}
		});*/

		final JxPanel panelFormManager = new JxPanel(1.0f);
		panelFormManager.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (panelFormManager.isEnabled()) {
					PanelSqlImport panelSqlImport = new PanelSqlImport();
					SwingUtils.openInDialog(panelSqlImport);

				}
			}
		});
		panelFormManager.setBackground(Color.WHITE);
		panelFormManager.setLayout(null);
		panelFormManager.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		panelFormManager.setVisible(true);
		panelFormManager.setBounds(600, 220, 180, 100);
		censusControls.add(panelFormManager);

		lblFormManager = new JLabel("   ");
		lblFormManager.setBounds(0, 0, 120, 30);
		panelFormManager.add(lblFormManager);
		lblFormManager.setBackground(Color.WHITE);
		lblFormManager.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFormManager.setText("    IMPORT SQL");
	}

	protected void doUpdate() {
		int w = getWidth();
		int h = getHeight();
		float wF = ((float) w / 868);
		float hF = ((float) h / 592);

		// System.out.println("w:" + w + ", h:" + h + ", wF:" + wF + ", hF:" +
		// hF);
		censusControls.setLocation((int) (72 * wF), (int) (1 * hF));
		if (getTopLevelAncestor() != null) {
			getTopLevelAncestor().repaint();
		} else {
			this.repaint();
		}

	}

	public static void main(String[] args) {
		PanelAdministrationDefault panelAdmin = new PanelAdministrationDefault();
		JDialog dialog = SwingUtils.wrapInDialog(panelAdmin);
		dialog.setVisible(true);
		dialog.setFocusable(true);
		dialog.setAlwaysOnTop(true);
		dialog.setEnabled(true);

	}

}
