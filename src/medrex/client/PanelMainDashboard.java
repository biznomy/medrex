package medrex.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JViewport;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import medrex.client.MedicationAndTreatment.FrameMedicationDesktop;
import medrex.client.admin.PanelAdministrationMain;
import medrex.client.admin.security.PanelSecurity;
import medrex.client.admin.userLogon.PanelUserLogon;
import medrex.client.carelog.PanelChooseCareLog;
import medrex.client.census.PanelChooseCensusResident;
import medrex.client.census.ui.PanelCensusMain;
import medrex.client.constants.Global;
import medrex.client.constants.GlobalSecurity;
import medrex.client.dietary.PanelDietaryMain;
import medrex.client.globalAlert.GlobalAlertMain;
import medrex.client.loading.FrameMedrexMessage;
import medrex.client.main.FrameMainOptions;
import medrex.client.main.PanelDashboard;
import medrex.client.masterList.PanelMasterList;
import medrex.client.messages.PanelMessages;
import medrex.client.providers.PanelProvidersRecord;
import medrex.client.schedule.PanelScheduleMain;
import medrex.client.users.PanelUsers;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.SubAppTypes;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxToggleButton;

public class PanelMainDashboard extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6030866633361214595L;

	private JLabel logoLabel;

	private static final Border BORDER = new LineBorder(
			new Color(122, 154, 167), 2, false);

	private static final Color BACKGROUND = new Color(206, 221, 224, 250);

	private static final Color FOREGROUND = new Color(0, 69, 97);

	private static final Font FONT = new Font("Dialog", Font.BOLD, 13)
			.deriveFont(13.5f);

	private JxToggleButton[] btnDashboard;

	private String[] btnAction;

	private JPanel botLeftPanel;

	private JPanel[] tabPanels;

	private JPanel defPanel;

	private JPanel thisPanel;

	private int curIndex;

	private JViewport view;

	private FrameMainOptions frameMainOptions;

	public PanelMainDashboard(FrameMainOptions frame) {
		super();
		setLayout(null);
		frameMainOptions = frame;
		Global.panelMainDashboard = this;
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				doResize();
			}
		});
		setPreferredSize(new Dimension(1024, 768));
		setBackground(new Color(231, 239, 242));

		final JPanel leftPanel = new JPanel();
		leftPanel.setLayout(null);
		leftPanel.setOpaque(false);
		leftPanel.setBounds(0, 0, 274, 768);
		add(leftPanel);

		final JLabel label = new JLabel(new ImageIcon(
				"img/dashboard/leftPanel.png"));
		label.setBounds(0, 0, 274, 768);
		label.setText("");
		leftPanel.add(label);
		leftPanel.setComponentZOrder(label, 0);

		defPanel = new JPanel();
		defPanel.setBounds(156, 0, 868, 768);
		defPanel.setOpaque(false);
		defPanel.setLayout(new BorderLayout(0, 0));
		add(defPanel);

		view = new JViewport();
		view.setIgnoreRepaint(false);
		view.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
				view.repaint();
			}
		});
		view.setOpaque(false);
		defPanel.add(view, BorderLayout.NORTH);

		btnAction = new String[] { "DASHBOARD", "RESIDENTS", /* "CNA ADMIN", */
		"REPORTS", "CENSUS", "CARE LOG", "USERS", "PROVIDERS", "MEDICATION", /*
																			 * "ACCUTIES",
																			 */
		"DIETARY", "ALERT", "SECURITY", "USER LOGON", "MESSAGES",
				"MASTER LIST", "SCHEDULE", "ADMIN" };

		final ButtonGroup bgGroup = new ButtonGroup();

		botLeftPanel = new JPanel();
		botLeftPanel.setBackground(new Color(7, 74, 101));
		botLeftPanel.setOpaque(true);
		botLeftPanel.setBounds(0, 762, 274, 28);
		add(botLeftPanel);

		logoLabel = new JLabel(new ImageIcon("img/medrexLogo.png"));
		logoLabel.setBounds(60, 15, 202, 92);
		logoLabel.setText("");
		add(logoLabel);
		setComponentZOrder(defPanel, 3);
		setComponentZOrder(botLeftPanel, 2);
		setComponentZOrder(leftPanel, 1);
		setComponentZOrder(logoLabel, 0);

		btnDashboard = new JxToggleButton[btnAction.length];
		for (int i = 0; i < btnAction.length; i++) {
			final int index = i;
			btnDashboard[i] = new JxToggleButton(btnAction[i]);
			btnDashboard[i].setFont(FONT);
			btnDashboard[i].setBounds(20, 142 + (i * 32), 108, 28);
			btnDashboard[i].setBorderPainted(false);
			btnDashboard[i].setArc(0.6f);
			btnDashboard[i].setBorder(BORDER);
			btnDashboard[i].setBackground(BACKGROUND);
			btnDashboard[i].setForeground(FOREGROUND);
			btnDashboard[i].setRolloverEnabled(true);
			btnDashboard[i].setHorizontalAlignment(SwingConstants.LEFT);
			bgGroup.add(btnDashboard[i]);
			label.add(btnDashboard[i]);
			// btnDashboard[i].addItemListener(new ItemListener() {
			// public void itemStateChanged(ItemEvent e) {
			// if (e.getStateChange() == ItemEvent.SELECTED) {
			// displayTab(index);
			// }
			// }
			// });
			btnDashboard[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseExited(MouseEvent e) {
					label.repaint();
				}
			});
			btnDashboard[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					displayTab(index);
				}
			});

		}

		tabPanels = new JPanel[btnAction.length];
		curIndex = 0;
		thisPanel = this;
		btnDashboard[0].setSelected(true);
		displayTab(0);
	}

	public void selectAndOpenButton(int i) {
		btnDashboard[i].setSelected(true);
		displayTab(i);
	}

	public void doResize() {
		int h = getHeight();
		Dimension viewSize = new Dimension(getWidth() - defPanel.getX(), h);

		tabPanels[curIndex].setPreferredSize(viewSize);
		botLeftPanel.setSize(botLeftPanel.getWidth(), h - botLeftPanel.getY());
		defPanel.setSize(viewSize);
		defPanel.setPreferredSize(viewSize);
		view.setViewSize(viewSize);
		view.setPreferredSize(viewSize);
		view.setSize(viewSize);

		tabPanels[curIndex].firePropertyChange("DISPLAY_TAB", false, true);
		defPanel.firePropertyChange("DISPLAY_TAB", false, true);

		if (getTopLevelAncestor() != null) {
			getTopLevelAncestor().repaint();
		} else {
			defPanel.updateUI();
		}
	}

	public void displayTab(int index) {
		// System.out.println("Index is:"+index);
		if (index != 0 && index != 3 && index != 4 && index != 14
				&& index != 15 && index > 1 && Global.IS_DEMO) {
			JOptionPane.showMessageDialog(this,
					"This functionality is not available!!!", "Medrex",
					JOptionPane.INFORMATION_MESSAGE);
			btnDashboard[0].setSelected(true);
			return;
		}
		if (tabPanels[index] == null || index == 1 || index == 10
				|| index == 15 || index == 11 || index == 13 || index == 7
				|| index == 8 || index == 0 || index == 14) {
			tabPanels[index] = getTab(index);
			// if("Administrator".equalsIgnoreCase(Global.currentLoggedInUserType)
			// && index == 10)) {
			// tabPanels[index] = null;
			// }
		}
		tabPanels[index].setSize(view.getSize());
		view.setView(tabPanels[index]);
		tabPanels[index].setOpaque(false);
		curIndex = index;
		doResize();
	}

	public void setView(JComponent com) {
		this.view.setView(com);
		com.setOpaque(false);
		doResize();
		com.firePropertyChange("DISPLAY_TAB", false, true);
	}

	public JPanel getTab(int index) {
		switch (index) {
		case 0:
			return new PanelDashboard();

		case 1:
			/*
			 * if (GlobalSecurity.isViewPriviledge(SubAppTypes.MAIN_RESIDENT)) {
			 * Global.currentResidenceArgument = 0;
			 * frameMainOptions.openMainDesktopTmp();
			 * btnDashboard[0].setSelected(true); }else { return new
			 * PanelDashboard(); }
			 */

			Global.currentResidenceArgument = 0;
			frameMainOptions.openMainDesktopTmp();
			btnDashboard[0].setSelected(true);

			return new PanelDashboard();

			/* Commented CNA ADMIN */
			// case 2:
			//
			// if (GlobalSecurity.isViewPriviledge(SubAppTypes.CNA)) {
			// return new PanelChooseResident() {
			// protected void doNext() {
			// Global.currentResidenceKey = getSelectedResident()
			// .getSerial();
			// new FrameCNACategory().setVisible(true);
			// }
			// };
			// } else {
			// return new PanelDashboard();
			// }
		case 2:
			/*
			 * if (GlobalSecurity.isViewPriviledge(SubAppTypes.REPORTS)) {
			 * return new PanelLabReportMails(); } else {
			 */

			btnDashboard[0].setSelected(true);
			return new PanelDashboard();
			// }
		case 3:
			if (GlobalSecurity.isViewPriviledge(SubAppTypes.CENSUS)) {
				return new PanelChooseCensusResident() {
					/**
					 * 
					 */
					private static final long serialVersionUID = 1647903521871069096L;
					private PanelCensusMain censusMain;

					public PanelCensusMain getForm() {
						return new PanelCensusMain();
					}

					@Override
					protected void doNext() {
						if (censusMain == null) {
							censusMain = getForm();
						}
						view.setView(censusMain);
						censusMain.setResident(this.getSelectedResident());
						censusMain.setOpaque(false);
						censusMain.changeCard(PanelCensusMain.DEFAULT);
						doResize();
						censusMain.firePropertyChange("DISPLAY_TAB", false,
								true);
						// Global.currentResidentObj =
						// this.getSelectedResident();
						// new FrameCensus().setVisible(true);
					}
				};
			} else {

				btnDashboard[0].setSelected(true);
				return new PanelDashboard();
			}
		case 4:
			if (GlobalSecurity.isViewPriviledge(SubAppTypes.CARELOG)) {
				return new PanelChooseResident() {
					/**
					 * 
					 */
					private static final long serialVersionUID = 5327545460154358240L;
					private PanelChooseCareLog careLogPanel;

					@Override
					protected void doNext() {
						Global.currentResidenceKey = getSelectedResident()
								.getSerial();

						// new FrameCareLogCategory().setVisible(true);
						// JDialog window = SwingUtils.wrapInDialog(new
						// PanelCareLogApplication());
						// window.setUndecorated(true);
						// window.setSize(Toolkit.getDefaultToolkit().getScreenSize());
						// window.setVisible(true);

						careLogPanel = null;
						careLogPanel = new PanelChooseCareLog(
								Global.currentResidenceKey);
						JDialog window = SwingUtils.wrapInDialog(careLogPanel);
						window.setUndecorated(true);
						window.setSize(Toolkit.getDefaultToolkit()
								.getScreenSize());
						window.setLocation(0, 0);
						careLogPanel.setDialog(window);
						window.setVisible(true);
					}
				};
			}
			btnDashboard[0].setSelected(true);
			return new PanelDashboard();

		case 5:
			if (GlobalSecurity.isViewPriviledge(SubAppTypes.USERS)) {
				return new PanelUsers();
			} else {
				btnDashboard[0].setSelected(true);
				return new PanelDashboard();
			}

		case 6:
			if (GlobalSecurity.isViewPriviledge(SubAppTypes.PROVIDERS)) {
				return new PanelProvidersRecord();
			} else {
				btnDashboard[0].setSelected(true);
				return new PanelDashboard();
			}

		case 7:
			if (GlobalSecurity.isViewPriviledge(SubAppTypes.MEDICATION_CART)) {
				// frameMainOptions.openResidentDesktopMedication();
				// return new JPanel();
				// Global.frameMedicationDashboard = null;
				if (Global.frameMedicationDashboard == null) {
					FrameMedicationDesktop frame = (FrameMedicationDesktop) FrameFactory
							.getInstance().createWindowOfType(
									FrameMedicationDesktop.class);
					Global.frameMedicationDashboard = frame;
				} else {
					Global.frameMedicationDashboard
							.setState(JFrame.MAXIMIZED_BOTH);
					Global.frameMedicationDashboard.setVisible(true);
				}

				// return new PanelMedicationMainDesktop();
				// return new PanelMedicationDesktop();
				btnDashboard[0].setSelected(true);
				return new PanelDashboard();

			} else {
				btnDashboard[0].setSelected(true);
				return new PanelDashboard();
			}
			// case 9:
			// return new PanelAccuritiesMain();

		case 8:
			/*
			 * if (GlobalSecurity.isViewPriviledge(SubAppTypes.DIETARY)) {
			 * return new PanelDietaryMain(); } else {
			 * btnDashboard[0].setSelected(true); return new PanelDashboard(); }
			 */
			return new PanelDietaryMain();

		case 9:
			if (GlobalSecurity.isViewPriviledge(SubAppTypes.ALERT)) {
				return new GlobalAlertMain();
			} else {
				btnDashboard[0].setSelected(true);
				return new PanelDashboard();
			}
			// return new GlobalAlertMain();

		case 10:
			if (Global.currentLoggedInUserType
					.equalsIgnoreCase("Administrator")) {
				return new PanelSecurity();
			} else {
				showMessageDialog("You are not authorized to access the facility!");
				btnDashboard[0].setSelected(true);
				return new PanelDashboard();
			}

		case 11:
			if (GlobalSecurity.isViewPriviledge(SubAppTypes.USERLOGON)) {
				return new PanelUserLogon();
			} else {
				btnDashboard[0].setSelected(true);
				return new PanelDashboard();
			}

		case 12:
			if (GlobalSecurity.isViewPriviledge(SubAppTypes.MESSAGES)) {
				return new PanelMessages();
			} else {
				btnDashboard[0].setSelected(true);
				return new PanelDashboard();
			}

		case 13:
			if (GlobalSecurity.isViewPriviledge(SubAppTypes.MASTERLIST)) {
				return new PanelMasterList();
			} else {
				btnDashboard[0].setSelected(true);
				return new PanelDashboard();
			}

		case 15:
			if (GlobalSecurity.isViewPriviledge(SubAppTypes.ADMIN)) {
				PanelAdministrationMain panelRef = new PanelAdministrationMain();
				panelRef.changeCard(PanelAdministrationMain.DEFAULT);
				return panelRef;
			} else {
				btnDashboard[0].setSelected(true);
				return new PanelDashboard();
			}
		case 14:
			return new PanelScheduleMain();

		default:
			return new JPanel();
		}
	}

	/*
	 * public static void main(String[] a) { new
	 * MedrexMain().generalInitializations(); try { UIManager.setLookAndFeel(new
	 * Plastic3DLookAndFeel()); Global.ltcServer.getAdmissionsRecords(0); }
	 * catch (Exception e) { e.printStackTrace(); } final PanelMainDashboard
	 * panel = new PanelMainDashboard( (FrameMainOptions)
	 * FrameFactory.createWindowOfType(FrameMainOptions.class)); JFrame f =
	 * SwingUtils.wrapInFrame(panel); f.setVisible(true); }
	 */

	public static void showMessageDialog(String message) {
		try {
			FrameMedrexMessage dialog = new FrameMedrexMessage(message);
			dialog.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			SwingUtils.center(dialog);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
