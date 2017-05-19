package medrex.client.admin;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashMap;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import medrex.client.FrameLogin;
import medrex.client.admin.ambulation.PanelAmbulationWeightMain;
import medrex.client.admin.diet.list.PanelDietListMain;
import medrex.client.admin.diet.plan.PanelDietPlanMain;
import medrex.client.admin.formScheduler.PanelFormSchedulerMain;

import medrex.client.admin.medication.PanelMedicationMain;
import medrex.client.admin.noteCategories.PanelNoteCategoriesMain;
import medrex.client.admin.security.PanelSecurity;
import medrex.client.admin.template.PanelTemplateMain;
import medrex.client.admin.treatment.PanelTreatmentMain;
import medrex.client.admin.triggerWords.PanelTriggerWordsMain;
import medrex.client.admin.userLogon.ControllerUserLogon;
import medrex.client.admin.userLogon.PanelUserLogon;
import medrex.client.constants.Global;
import medrex.client.main.PanelResidentInfoHoriz;
import medrex.client.utils.controls.DateTimePanel;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.frameFactory.FrameFactory;

public class PanelAdministrationMain extends JPanel {
	private static final long serialVersionUID = 1L;

	public static final String DEFAULT = "DEFAULT";
	public static final String USER_LOGON = "USER_LOGON";
	public static final String FORM_SCHEDULER = "FORM_SCHEDULER";
	public static final String SECURITY = "SECURITY";
	public static final String SCREEN_SAVER = "SCREEN_SAVER";
	public static final String TEMPLATE = "TEMPLATE";
	public static final String NOTE_CATEGORIES = "NOTE_CATEGORIES";
	public static final String DIET_PLAN = "DIET_PLAN";
	public static final String DIET_LIST = "DIET_LIST";
	public static final String TRIGGER_WORD = "TRIGGER_WORD";
	public static final String MEDICATION = "MEDICATION";
	public static final String TREATMENT = "TREATMENT";
	public static final String AMBULATION_WEIGHT = "AMBULATION_WEIGHT";
	public static final String MASTER_SCHEDULE = "MASTER_SCHEDULE";
	public static final String IMPORT_SQL = "IMPORT_SQL";

	private static HashMap<String, JPanel> cards;

	private JPanel defaultPanel;
	private JPanel topTabArea;
	private JPanel topTabsPanel;
	private JPanel topBlueStrip;
	private ResidentMain resident;

	private CardLayout defaultCardLayout;
	private JPanel currentCard;

	//private PanelResidentInfoHoriz panelResidentInfo;

	public PanelAdministrationMain() {
		super();
		Global.panelAdministrationMain = this;
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});
		setLayout(null);
		// setLayout(new BorderLayout());
		setPreferredSize(new Dimension(868, 768));

		cards = new HashMap<String, JPanel>();
		// ////////////////////////////////////////////////////
		topTabArea = new JPanel();
		topTabArea.setLayout(new BorderLayout(0, 0));
		topTabArea.setOpaque(false);
		topTabArea.setBounds(0, 0, 868, 138);
		add(topTabArea);

		topTabsPanel = new JPanel();
		topTabsPanel.setOpaque(false);
		topTabsPanel.setLayout(null);
		topTabsPanel.setPreferredSize(new Dimension(868, 40));
		// topTabArea.add(topTabsPanel, BorderLayout.SOUTH);

		final JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(9, 9, 9, 9));
		panel.setLayout(new BorderLayout());
		panel.setOpaque(false);
		panel.setPreferredSize(new Dimension(556, 120));
		topTabArea.add(panel, BorderLayout.EAST);

		/*panelResidentInfo = new PanelResidentInfoHoriz();
		panelResidentInfo.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		panelResidentInfo.setOpaque(false);
		panel.add(panelResidentInfo, BorderLayout.CENTER);*/

		final DateTimePanel timerPanel = new DateTimePanel();
		timerPanel.setFont(GuiModes.CHANGE_SCREEN.getControlFont().deriveFont(
				18f).deriveFont(Font.PLAIN));
		timerPanel.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		timerPanel.setPreferredSize(new Dimension(150, 100));
		panel.add(timerPanel, BorderLayout.WEST);

		topBlueStrip = new JPanel();
		topBlueStrip.setLayout(new GridLayout(0, 2));
		topBlueStrip.setBackground(new Color(28, 93, 113));
		topBlueStrip.setBounds(0, 138, 868, 38);
		add(topBlueStrip);

		final JLabel lastLoginLabel = new JLabel();
		lastLoginLabel.setForeground(Color.WHITE);
		lastLoginLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont()
				.deriveFont(16));
		lastLoginLabel.setBorder(new EmptyBorder(0, 100, 0, 0));
		lastLoginLabel.setText("<html><b>Welcome </b>"
				+ Global.currentUserLastName + ", "
				+ Global.currentUserFirstName);
		topBlueStrip.add(lastLoginLabel);

		final JLabel logLabel = new JLabel();
		logLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent arg0) {
				(new ControllerUserLogon()).logoutUpdate();
				FrameFactory.closeAll();
				FrameLogin frame = (FrameLogin) FrameFactory
						.createWindowOfType(FrameLogin.class);
				Global.currentMainTab = 1;
				frame.setVisible(true);
			}
		});
		logLabel.setBorder(new EmptyBorder(0, 0, 0, 50));
		logLabel.setForeground(Color.WHITE);
		logLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont()
				.deriveFont(16));
		logLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		logLabel.setText("Log off       ");
		topBlueStrip.add(logLabel);
		// /////////////////////////////////////////////
		defaultCardLayout = new CardLayout();

		defaultPanel = new JPanel();
		defaultPanel.setLayout(defaultCardLayout);
		defaultPanel.setBorder(new EmptyBorder(20, 0, 0, 8));
		defaultPanel.setOpaque(false);
		defaultPanel.setBounds(0, 176, 868, 592);
		defaultPanel.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
				doUpdate();
			}
		});
		add(defaultPanel);
	}

	@Override
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(new Color(32, 63, 84));
		g2.fillRect(0, getHeight() - 76, getWidth(), 76);
		super.paint(g);
	}

	protected void doUpdate() {
		// System.out.println("getWidth:" + getWidth());
		topTabArea.setSize(getWidth(), topTabArea.getHeight());
		topBlueStrip.setSize(getWidth(), topBlueStrip.getHeight());
		defaultPanel.setSize(getWidth(), getHeight() - defaultPanel.getY());
		// topTabArea.repaint();
		// topBlueStrip.repaint();
		if (currentCard != null) {
			currentCard.setSize(defaultPanel.getWidth(), defaultPanel
					.getHeight());
			currentCard.firePropertyChange("DISPLAY_TAB", false, true);
		}
		if (getTopLevelAncestor() != null) {
			getTopLevelAncestor().repaint();
		} else {
			this.repaint();
		}
	}

	private JPanel getCard(String name) {
		if (name.equalsIgnoreCase(PanelAdministrationMain.DEFAULT)) {
			// final PanelAdministrationDefault panelAdministrationDefault =
			// panelAdministrationDefault;
			// final PanelAdministrationDefault panelAdministrationDefault_1 =
			// panelAdministrationDefault_1;
			// final PanelAdministrationDefault panelAdministrationDefault =
			// panelAdministrationDefault;
			// final PanelAdministrationDefault panelAdministrationDefault_1 =
			// panelAdministrationDefault_1;

			// final PanelAdministrationDefault panelAdministrationDefault =
			// panelAdministrationDefault;

			// final PanelAdministrationDefault panelAdministrationDefault =
			// panelAdministrationDefault;
			//final PanelAdministrationDefault panelAdministrationDefault = panelAdministrationDefault;
			//final PanelAdministrationDefault panelAdministrationDefault = panelAdministrationDefault;
			return new PanelAdministrationDefault();
		} else if (name == PanelAdministrationMain.FORM_SCHEDULER) {
			return new PanelFormSchedulerMain();
		} else if (name == PanelAdministrationMain.USER_LOGON) {
			return new PanelUserLogon();
		} else if (name == PanelAdministrationMain.SECURITY) {
			return new PanelSecurity();
		}/*
		 * else if (name == PanelAdministrationMain.SCREEN_SAVER) { return new
		 * PanelScreenSaver(); }
		 */
		else if (name == PanelAdministrationMain.TEMPLATE) {
			return new PanelTemplateMain();
		} else if (name == PanelAdministrationMain.NOTE_CATEGORIES) {
			return new PanelNoteCategoriesMain();
		} else if (name == PanelAdministrationMain.DIET_PLAN) {
			return new PanelDietPlanMain();
		} else if (name == PanelAdministrationMain.DIET_LIST) {
			return new PanelDietListMain();
		} else if (name == PanelAdministrationMain.TRIGGER_WORD) {
			return new PanelTriggerWordsMain();
		} else if (name == PanelAdministrationMain.MEDICATION) {
			return new PanelMedicationMain();
		} else if (name == PanelAdministrationMain.TREATMENT) {
			return new PanelTreatmentMain();
		} else if (name == PanelAdministrationMain.AMBULATION_WEIGHT) {
			return new PanelAmbulationWeightMain();
		} else if (name == PanelAdministrationMain.IMPORT_SQL) {
			return new PanelSqlImport();
		} else {
			return new JPanel();
		}
	}

	public void changeCard(String name) {
		currentCard = null;
		// if(cards.get(name) == null) {
		JPanel card = getCard(name);
		// cards.put(name, card);
		card.setOpaque(false);
		defaultPanel.removeAll();
		defaultPanel.add(card, name);
		currentCard = card;
		card = null;
		// }
		defaultCardLayout.show(defaultPanel, name);
		defaultPanel.requestFocus();
		doUpdate();
	}

	/**
	 * @param resident
	 *            the resident to set
	 */
	/*public void setResident(ResidentMain resident) {
		this.resident = resident;
		if (panelResidentInfo != null) {
			panelResidentInfo.setResident(resident);
		}
	}*/

	/**
	 * @return the resident
	 */
	public ResidentMain getResident() {
		return resident;
	}
}