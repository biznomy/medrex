/**
 * 
 */
package medrex.client.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Point2D;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JViewport;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.constants.GlobalSecurity;
import medrex.client.main.MonthlySummary.PanelMonthlySummaryRecord;
import medrex.client.main.activity.PanelActivitysRecord;
import medrex.client.main.admission.PanelAdmissionsRecord;
import medrex.client.main.alert.PanelAlertMain;
import medrex.client.main.careplan.PanelCarePlan;
import medrex.client.main.consultant.PanelConsultant;
import medrex.client.main.dialysis.PanelDialysisRecord;
import medrex.client.main.dietary.PanelDietary;
import medrex.client.main.historyandphysical.PanelHistoryAndPhysical;
import medrex.client.main.index.PanelIndexMain;
import medrex.client.main.labReports.PanelLabReports;
import medrex.client.main.labspecial.PanelLabSpecial;
import medrex.client.main.medication.PanelMedicationTreatmentForm;
import medrex.client.main.nursesNote.PaneNursesNoteRecord;
import medrex.client.main.pendingForms.PanelPendingForms;
import medrex.client.main.physicanOrders.PanelPhysicianOrders;
import medrex.client.main.progressNotes.PanelProgressNotes;
import medrex.client.main.ptOtSt.PanelPtOtSt;
import medrex.client.main.resident.PanelResidentInfoGeneral;
import medrex.client.mds3.ui.PanelMds3Record;
import medrex.commons.MedrexMain;
import medrex.commons.enums.ResidentTabs;
import medrex.commons.enums.SubAppTypes;
import medrex.commons.vo.resident.ResidentMain;

import com.jgoodies.looks.plastic.Plastic3DLookAndFeel;
import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxPanel;
import com.sX.swing.JxScrollBar;

/**
 * @author D S Naruka
 */
public class PanelMainDesktop extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6814394966132089918L;
	private JLabel lblLogo;
	private JLabel lblLeftSideBar;
	private JPanel panelLeftSideBar;
	private JPanel panelView;
	private PanelMainDesktopTabs panelTabs;
	private JPanel panel;
	private JViewport view;
	private JPanel[] tabPanels;
	private JList residentList;
	private JxComboBox selectionCombo;
	private JTextField txtSearch;
	private ResidentMain resident;
	private PanelResidentInfoHoriz panelResidentInfo;
	private int currentIndex = 0;
	private int tabIndex = 0;

	public PanelMainDesktop() {
		super();
		Global.panelMainDesktopTmp = this;
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(final ComponentEvent e) {
				doResize();
			}
		});
		setBorder(new LineBorder(Color.black, 1, false));
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(1024, 768));

		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(232, 240, 245));
		panel.setBounds(0, 0, 1024, 209);
		add(panel);

		panelTabs = new PanelMainDesktopTabs();
		panelTabs.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent event) {
				if (event.getPropertyName().equals(
						PanelMainDesktopTabs.TABINDEX)) {
					currentIndex = 0;
					displayTab((Integer) event.getNewValue());
				}
			}
		});
		panelTabs.setBounds(0, 102, 1024, 109);
		panel.add(panelTabs);

		lblLogo = new JLabel(new ImageIcon("img/medrexLogo.png"));
		lblLogo.setPreferredSize(new Dimension(202, 92));
		lblLogo.setText("");
		lblLogo.setBounds(30, 5, 202, 92);
		panel.add(lblLogo);

		panelResidentInfo = new PanelResidentInfoHoriz();
		panelResidentInfo.setBounds(636, 0, 388, 100);
		panel.add(panelResidentInfo);
		panelResidentInfo.setPreferredSize(new Dimension(388, 100));

		// final JPanel imagePanel = new JPanel();
		// imagePanel.setBounds(689, 5, 335, 92);
		// imagePanel.setBorder(new EmptyBorder(868, 5, 9, 9));
		// imagePanel.setLayout(new BorderLayout());
		// imagePanel.setOpaque(false);
		// imagePanel.setPreferredSize(new Dimension(556, 120));
		// panel.add(imagePanel, BorderLayout.EAST);
		//		
		// panelResidentInfo = new PanelResidentInfoHoriz();
		// panelResidentInfo.setForeground(GuiModes.CHANGE_SCREEN.getControlForegroundColor());
		// panelResidentInfo.setOpaque(false);
		// imagePanel.add(panelResidentInfo, BorderLayout.WEST);

		panelView = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2 = (Graphics2D) g;
				g2.setColor(this.getBackground());
				g2.fillRect(0, 0, this.getWidth(), this.getHeight());
				Color grad_top = new Color(232, 240, 245, 226);
				Color grad_bot = new Color(79, 105, 125, 226);
				GradientPaint bgGradientPaint = new GradientPaint(new Point(
						this.getWidth(), 0), grad_top, new Point(this
						.getWidth(), 518), grad_bot);
				g2.setBackground(this.getBackground());
				g2.setPaint(bgGradientPaint);
				g2.fillRect(0, 0, this.getWidth(), 518);
			}
		};
		panelView.setLayout(null);
		panelView.setBounds(0, 209, 1024, 555);
		panelView.setBackground(new Color(36, 67, 89));
		add(panelView);

		panelLeftSideBar = new JPanel();
		panelLeftSideBar.setLayout(null);
		panelLeftSideBar.setOpaque(false);
		panelLeftSideBar.setBounds(0, 209, 278, 555);
		add(panelLeftSideBar);
		setComponentZOrder(panelLeftSideBar, 0);

		lblLeftSideBar = new JLabel(new ImageIcon("img/sidePanel.png"));
		lblLeftSideBar.setLayout(null);
		lblLeftSideBar.setBounds(0, 0, 278, 518);
		panelLeftSideBar.add(lblLeftSideBar);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(5, 45, 74), 1, false));
		panel_5.setBackground(Color.WHITE);
		panel_5.setArc(0.6f);
		panel_5.setBounds(15, 7, 160, 30);
		lblLeftSideBar.add(panel_5);

		txtSearch = new JTextField();
		txtSearch.setForeground(new Color(5, 40, 70));
		txtSearch.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtSearch.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtSearch.setBounds(5, 5, 155, 25);
		txtSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(final KeyEvent e) {
				doSearch();
			}
		});
		panel_5.add(txtSearch);

		selectionCombo = new JxComboBox();
		selectionCombo.setBounds(19, 50, 138, 25);
		selectionCombo.setBackground(new Color(212, 219, 222));
		selectionCombo.setForeground(new Color(8, 68, 95));
		selectionCombo.setArc(0.6f);
		selectionCombo.setFocusable(false);
		selectionCombo.setBorder(new LineBorder(new Color(129, 156, 167), 1,
				false));
		selectionCombo.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "All", "Active", "Inactive" }));
		selectionCombo.setSelectedItem("Active");
		selectionCombo.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				updateResidentList();
				if (Global.currentResidenceArgument == 0) {
					try {
						residentList.setSelectedIndex(0);
					} catch (Exception e) {

					}
				} else {
					setSelected(Global.currentResidenceArgument);
				}
				doUpdate();
			}
		});
		lblLeftSideBar.add(selectionCombo);

		final JLabel label_1 = new JLabel(new ImageIcon("img/resiList.png"));
		label_1.setLayout(null);
		label_1.setBounds(19, 85, 138, 383);
		lblLeftSideBar.add(label_1);

		final JxButton btnAddNewResi = new JxButton();
		btnAddNewResi.setText("ADD NEW RESIDENT");
		btnAddNewResi.setBounds(19, 483, 119, 22);
		btnAddNewResi.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnAddNewResi.setBackground(new Color(130, 163, 175));
		btnAddNewResi.setForeground(new Color(8, 68, 95));
		lblLeftSideBar.add(btnAddNewResi);
		btnAddNewResi.setFocusPainted(false);
		btnAddNewResi.setArc(0.6f);
		btnAddNewResi.setBorder(new LineBorder(new Color(8, 68, 95), 2, false));
		btnAddNewResi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				residentList.setSelectedIndex(-1);
				Global.currentResidenceKey = 0;
				doUpdate();
				panelResidentInfo.setResident(null);
			}
		});

		final JxButton btnBack = new JxButton();
		btnBack.setText("BACK");
		btnBack.setBounds(146, 483, 53, 22);
		btnBack.setBackground(new Color(130, 163, 175));
		btnBack.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnBack.setForeground(new Color(8, 68, 95));
		lblLeftSideBar.add(btnBack);
		btnBack.setBorderPainted(false);
		btnBack.setArc(0.6f);
		btnBack.setBorder(new LineBorder(new Color(8, 68, 95), 2, false));
		/*
		 * btnBack.addActionListener(new ActionListener() { // @Override public
		 * void actionPerformed(ActionEvent e) {
		 * Global.frameMainDesktopTmp.openMainOptions(); } });
		 */

		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (Global.frameMainOptions != null) {
					Global.currentMainTab = 1;
					// Global.frameMainDesktopTmp.setFocusableWindowState(true);
					// Global.frameMainOptions.requestFocusInWindow();
					// Global.frameMainOptions.requestFocus();
					// Global.frameMainDesktopTmp.setState(JFrame.ICONIFIED);
					Global.frameMainDesktopTmp.openMainOptions();
				}
			}
		});

		final JScrollPane scrollPane = new JScrollPane();
		JScrollBar scroll = scrollPane.getVerticalScrollBar();
		scroll.setUnitIncrement(100);
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setBounds(1, 16, 135, 350);
		scrollPane.setOpaque(false);
		scrollPane.setBorder(null);
		label_1.add(scrollPane);

		residentList = new JList();
		residentList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// residentList.setBounds(1, 16, 135, 350);
		residentList.setFixedCellHeight(19);
		residentList.setOpaque(false);
		scrollPane.setViewportView(residentList);

		// residentList.setListData(new String[] { "Michael Edwards",
		// "David Howard", "Leon Fried", "Rose Davis" });
		residentList.setCellRenderer(new DefaultListCellRenderer() {

			public final Color SELECTION_BG1_COLOR = new Color(146, 175, 186);
			// public final Color SELECTION_BG2_COLOR = new Color(48, 104 ,125);
			public final Color SELECTION_BG2_COLOR = new Color(83, 128, 146);
			public final Color SELECTION_TXT_COLOR = Color.WHITE;
			public final Color DEFAULT_TXT_COLOR = new Color(8, 68, 95);
			public final Font DEFAULT_TXT_FONT = new Font("Dialog", Font.BOLD,
					12);

			@Override
			public Component getListCellRendererComponent(final JList list,
					Object value, int index, boolean isSelected,
					boolean cellHasFocus) {
				JPanel renderer = new JPanel() {
					@Override
					public void paintComponent(Graphics g) {
						super.paintComponent(g);
						Graphics2D g2 = (Graphics2D) g;
						g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
								RenderingHints.VALUE_ANTIALIAS_ON);
						Color bright = SELECTION_BG1_COLOR;// alphaColor(SELECTION_BG1_COLOR,175);
						Color darker = SELECTION_BG2_COLOR;// alphaColor(SELECTION_BG2_COLOR,0);
						GradientPaint highlight = new GradientPaint(
								new Point2D.Float(0, getHeight()), bright,
								new Point2D.Float(getWidth(), getHeight()),
								darker);
						if (this.isOpaque()) {
							g2.setPaint(highlight);
							g2.fillRect(0, 0, getWidth(), getWidth());
						}
					}

					private Color alphaColor(Color c, int alpha) {
						return new Color(c.getRed(), c.getGreen(), c.getBlue(),
								alpha);
					}
				};
				renderer.setLayout(null);
				JLabel label = new JLabel();
				label.setFont(DEFAULT_TXT_FONT);
				label.setBounds(11, 0, list.getBounds().width, list
						.getFixedCellHeight());
				renderer.add(label);
				if (isSelected || cellHasFocus) {
					renderer.setOpaque(true);
					renderer.setEnabled(false);
					label.setForeground(SELECTION_TXT_COLOR);
					renderer.setBackground(SELECTION_BG2_COLOR);
				} else {
					renderer.setOpaque(false);
					label.setForeground(DEFAULT_TXT_COLOR);
				}
				if (value instanceof ResidentMain) {
					ResidentMain rObj = (ResidentMain) value;
					label.setText(rObj.getUserPass() + ", "
							+ rObj.getUserName());
				}
				return renderer;
			}
		});
		residentList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				Object obj = residentList.getSelectedValue();
				if (obj != null) {
					ResidentMain resident = (ResidentMain) obj;
					Global.currentResidenceKey = resident.getSerial();
					// System.out.println("Status: "+resident.getType().toString());
					Global.currentResidentStatus = resident.getType()
							.toString();
					panelResidentInfo.setResident(resident);
					panelResidentInfo.updateUI();
					displayTab(panelTabs.getCurrentSelectedIndex());
				} else {
					Global.currentResidenceKey = 0;
				}
			}
		});

		JxScrollBar scrollBar = new JxScrollBar();
		scrollBar.setArcx(0.5f);
		scrollBar.setArcy(0.7f);
		scrollBar.setUnitIncrement(20);
		scrollBar.setBackground(new Color(166, 187, 196));
		scrollBar.setGradientColor1(new Color(214, 221, 224));
		scrollBar.setGradientColor2(new Color(121, 156, 170));
		scrollBar.setBorder(new LineBorder(new Color(129, 156, 167), 1, false));
		scrollBar.setBounds(163, 87, 14, 380);
		scrollPane.setVerticalScrollBar(scrollBar);
		lblLeftSideBar.add(scrollBar);

		tabPanels = new JPanel[PanelMainDesktopTabs.TAB_COUNT];

		view = new JViewport();
		view.setBounds(279, 0, 745, 555);
		view.setOpaque(false);
		panelView.add(view);

		updateResidentList();
		// doUpdate();
	}

	public void openDesktopMainWithPanel(ResidentTabs tabName, String formName) {
		currentIndex = tabName.Id - 1;

		panelTabs.setIndex(currentIndex);
		displayTab(currentIndex);
		if (currentIndex == 19) {
			currentIndex += 1;
		}

		// System.out.println("tab and forms are :" + tabName.Name +", " +
		// formName + "index is :" + currentIndex);

		if (currentIndex == 2) {
			PanelActivitysRecord pActivitysRecord = (PanelActivitysRecord) tabPanels[currentIndex];
			pActivitysRecord.openNewForm(formName);
		}
		if (currentIndex == 3) {
			PanelMedicationTreatmentForm pTreatmentForm = (PanelMedicationTreatmentForm) tabPanels[currentIndex];
			pTreatmentForm.openNewForm(formName);
		}
		if (currentIndex == 4) {
			PanelDietary pDietary = (PanelDietary) tabPanels[currentIndex];
			pDietary.openNewForm(formName);
		}
		if (currentIndex == 5) {
			PanelConsultant pConsultant = (PanelConsultant) tabPanels[currentIndex];
			pConsultant.openNewForm(formName);
		}
		if (currentIndex == 6) {
			PanelProgressNotes pProgressNotes = (PanelProgressNotes) tabPanels[currentIndex];
			pProgressNotes.openNewForm(formName);
		}
		if (currentIndex == 7) {
			PanelLabSpecial pLabSpecial = new PanelLabSpecial();
			pLabSpecial.openNewForm(formName);
		}
		if (currentIndex == 8) {
			PanelHistoryAndPhysical pHistoryAndPhysical = (PanelHistoryAndPhysical) tabPanels[currentIndex];
			pHistoryAndPhysical.openNewForm(formName);
		}
		if (currentIndex == 9) {
			PanelPhysicianOrders ppPhysicianOrders = (PanelPhysicianOrders) tabPanels[currentIndex];
			ppPhysicianOrders.openNewForm(formName);
		}
		if (currentIndex == 10) {
			PanelPtOtSt ppOtSt = new PanelPtOtSt();
			ppOtSt.openNewForm(formName);
		}
		if (currentIndex == 11) {
			panelTabs.setIndex(currentIndex);
		}
		if (currentIndex == 12) {
			panelTabs.setIndex(currentIndex);
		}
		if (currentIndex == 13) {
			panelTabs.setIndex(currentIndex);
		}
		if (currentIndex == 14) {

		}
		if (currentIndex == 15) {
			PanelAdmissionsRecord pAdmissionsRecord = (PanelAdmissionsRecord) tabPanels[currentIndex];
			pAdmissionsRecord.openNewForm(formName);
			panelTabs.setIndex(currentIndex);
		}
		if (currentIndex == 17) {

		}

	}

	public void displayTab(int index) {
		// System.out.println("displayTab("+index+") in PanelMainDesktop");
		tabIndex = index;
		if (currentIndex != 0) {
			index = currentIndex;
		}
		if (index >= 0) {
			// if (tabPanels[index] == null) {
			tabPanels[index] = getTab(index);
			// }
			Global.currentResidentTabs = ResidentTabs.getResidentTab(index + 1);
			tabPanels[index].setOpaque(false);
			panelTabs.firePropertyChange("DISPLAY_TAB", false, true);
			tabPanels[index].firePropertyChange("DISPLAY_TAB", false, true);
			view.setView(tabPanels[index]);
		} else if (index == PanelMainDesktopTabs.INDEX_TAB_BTN) {
			panelTabs.firePropertyChange("DISPLAY_TAB", false, true);
			JPanel panel = new PanelIndexMain();
			panel.firePropertyChange("DISPLAY_TAB", false, true);
			panel.setOpaque(false);
			view.setView(panel);
		}
	}

	public void doResize() {
		// System.out.println("doResize in PanelMainDesktop");

		int w = getSize().width;
		int h = getSize().height;
		panel.setSize(w, panel.getSize().height);
		panelTabs.setSize(w, panelTabs.getSize().height);
		panelResidentInfo.setLocation(w - panelResidentInfo.getSize().width
				- 60, panelResidentInfo.getY());
		panelView.setSize(w, h - panelTabs.getSize().height - 1);
		panelLeftSideBar.setSize(panelLeftSideBar.getSize().width, h);
		// doUpdate();
	}

	public JPanel getTab(int index) {
		// System.out.println("indx is"+index);
		switch (index) {
		case 0:
			panelTabs.setIndex(0);
			return new PanelResidentInfoGeneral();

		case 1:
			if (GlobalSecurity.isViewPriviledge(SubAppTypes.ADMISSION_RECORDS)) {
				if (Global.currentResidentStatus.equals("Active")) {
					return new PanelPendingForms();
				} else {
					return (new PanelResidentInfoGeneral());
				}
			} else {
				return new PanelResidentInfoGeneral();
			}
		case 2:
			if (GlobalSecurity.isViewPriviledge(SubAppTypes.ACTIVITY)) {
				if (Global.currentResidentStatus.equals("Active")) {
					return new PanelActivitysRecord();
				} else {
					return (new PanelResidentInfoGeneral());
				}
			} else {
				return new PanelResidentInfoGeneral();
			}
		case 3:
			if (GlobalSecurity
					.isViewPriviledge(SubAppTypes.MEDICATION_TREATMENT)) {
				if (Global.currentResidentStatus.equals("Active")) {
					return new PanelMedicationTreatmentForm();
				} else {
					return (new PanelResidentInfoGeneral());
				}
			} else {
				return new PanelResidentInfoGeneral();
			}
		case 4:
			// if (GlobalSecurity.isViewPriviledge(SubAppTypes.DIETARY)) {
			if (Global.currentResidentStatus.equals("Active")) {
				return new PanelDietary();
			} else {
				return (new PanelResidentInfoGeneral());
			}
			/*
			 * } else { return new PanelResidentInfoGeneral(); }
			 */
		case 5:
			if (GlobalSecurity.isViewPriviledge(SubAppTypes.CONSULTANT)) {
				if (Global.currentResidentStatus.equals("Active")) {
					return new PanelConsultant();
				} else {
					return (new PanelResidentInfoGeneral());
				}
			} else {
				return new PanelResidentInfoGeneral();
			}
		case 6:
			if (GlobalSecurity.isViewPriviledge(SubAppTypes.PROGRESS_NOTES)) {
				if (Global.currentResidentStatus.equals("Active")) {
					return new PanelProgressNotes();
				} else {
					return (new PanelResidentInfoGeneral());
				}
			} else {
				return new PanelResidentInfoGeneral();
			}
		case 7:
			if (GlobalSecurity
					.isViewPriviledge(SubAppTypes.LAB_SPECIAL_REPORTS)) {
				if (Global.currentResidentStatus.equals("Active")) {
					return new PanelLabSpecial();
				} else {
					return (new PanelResidentInfoGeneral());
				}
			} else {
				return new PanelResidentInfoGeneral();
			}
		case 8:
			if (GlobalSecurity.isViewPriviledge(SubAppTypes.HISTORY_PHYSICAL)) {
				if (Global.currentResidentStatus.equals("Active")) {
					return new PanelHistoryAndPhysical();
				} else {
					return (new PanelResidentInfoGeneral());
				}
			} else {
				return new PanelResidentInfoGeneral();
			}
		case 9:
			if (GlobalSecurity.isViewPriviledge(SubAppTypes.PHYSICIAN_ORDERS)) {
				if (Global.currentResidentStatus.equals("Active")) {
					return new PanelPhysicianOrders();
				} else {
					return (new PanelResidentInfoGeneral());
				}
			} else {
				return new PanelResidentInfoGeneral();
			}
		case 10:
			if (GlobalSecurity.isViewPriviledge(SubAppTypes.OTPTACT_SPEECH)) {
				if (Global.currentResidentStatus.equals("Active")) {
					return new PanelPtOtSt();
				} else {
					return (new PanelResidentInfoGeneral());
				}
			} else {
				return new PanelResidentInfoGeneral();
			}
		case 11:
			if (Global.currentResidentStatus.equals("Active")) {
				return new PanelLabReports();
			} else {
				return (new PanelResidentInfoGeneral());
			}
		case 12:
			if (GlobalSecurity.isViewPriviledge(SubAppTypes.CARE_PLAN)) {
				if (Global.currentResidentStatus.equals("Active")) {
					return new PanelCarePlan();
				} else {
					return (new PanelResidentInfoGeneral());
				}
			} else {
				return new PanelResidentInfoGeneral();
			}
		case 13:
			// if (GlobalSecurity.isViewPriviledge(SubAppTypes.ALERT)) {
			if (Global.currentResidentStatus.equals("Active")) {
				return new PanelAlertMain("Resident Alert");
			} else {
				return (new PanelResidentInfoGeneral());
			}
			// }
			// else {
			// return new PanelResidentInfoGeneral();
			// }
		case 14:

		case 15:
			if (Global.currentResidentStatus.equals("Active")) {
				return new PanelAdmissionsRecord();
			} else {
				return (new PanelResidentInfoGeneral());
			}
		case 16:
			if (Global.currentResidentStatus.equals("Active")) {
				return new PanelMonthlySummaryRecord();
			} else {
				return (new PanelResidentInfoGeneral());
			}
		case 18:

			/*
			 * case 20: if
			 * (GlobalSecurity.isViewPriviledge(SubAppTypes.MDS_PENDING)) {
			 * if(Global.currentResidentStatus.equals("Active")){ return new
			 * PanelMDSPending(); }else{ return (new
			 * PanelResidentInfoGeneral()); } } else { return new
			 * PanelResidentInfoGeneral(); }
			 */

		case 20:
			if (GlobalSecurity.isViewPriviledge(SubAppTypes.MDS)) {
				if (Global.currentResidentStatus.equals("Active")) {
					return new PanelMds3Record();
				} else {
					return (new PanelResidentInfoGeneral());
				}
			} else {
				return new PanelResidentInfoGeneral();
			}
		case 21:
			if (Global.currentResidentStatus.equals("Active")) {
				return new PanelDialysisRecord();
			} else {
				return (new PanelResidentInfoGeneral());
			}
		case 22:
			if (Global.currentResidentStatus.equals("Active")) {
				return new PaneNursesNoteRecord();
			} else {
				return (new PanelResidentInfoGeneral());
			}
		default:
			return new JPanel();
		}
	}

	public void updateResidentList() {
		// System.out.println("updateResidentList in PanelMainDesktop");

		List rList = new ArrayList();
		try {
			rList = MedrexClientManager.getInstance().getResidentMain(
					selectionCombo.getSelectedItem().toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		residentList.setListData(rList.toArray());
		doSearch();
		// doUpdate();
	}

	public void doUpdate() {
		// System.out.println("doUpdate in PanelMainDesktop");
		// System.out.println("Global.currentResidenceArgument: "+Global.currentResidenceArgument+
		// " Global.currentResidenceKey: "+Global.currentResidenceKey);
		if (Global.currentResidenceArgument == 0
				&& Global.currentResidenceKey != 0) {
			residentList.setSelectedIndex(0);
		} else {
			if (Global.currentResidenceKey == 0) {
				residentList.setSelectedIndex(-1);
				tabIndex = 0;
			}
			if (Global.currentResidenceArgument != 0
					&& Global.currentResidenceKey != 0) {
				setSelected(Global.currentResidenceArgument);
			}
			/*
			 * if(Global.currentResidenceArgument!=0){
			 * setSelected(Global.currentResidenceArgument); }
			 */
		}
		// System.out.println("Global.currentMainTab: "+Global.currentMainTab +
		// "tabIndex: "+ tabIndex);
		if (Global.currentMainTab == 2) {
			tabIndex = 0;
			residentList.setSelectedIndex(0);
		}
		Global.currentMainTab = 0;
		displayTab(tabIndex);
	}

	protected void doSearch() {
		// System.out.println("doSearch in PanelMainDesktop");
		List residents = new ArrayList();
		try {
			if (txtSearch != null) {
				residents = MedrexClientManager.getInstance().getResidents(
						txtSearch.getText(), "", "",
						selectionCombo.getSelectedItem() + "");
			} else {
				residents = MedrexClientManager.getInstance().getResidentMain();
			}
			residentList.setListData(residents.toArray());
			residentList.setSelectedIndex(0);
		} catch (Exception e) {
		}
	}

	public static void main(String[] a) {
		(new MedrexMain()).generalInitializations();
		try {
			UIManager.setLookAndFeel(new Plastic3DLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		JFrame frame = new JFrame();

		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(1024, 798);
		frame.getContentPane().add(new PanelMainDesktop(), BorderLayout.CENTER);
		frame.setVisible(true);
	}

	public void setSelected(int currentResidenceKey) {
		try {
			Global.currentResidenceKey = currentResidenceKey;
			if (currentResidenceKey != 0) {
				ResidentMain resi = MedrexClientManager.getInstance()
						.getResident(currentResidenceKey);
				residentList.setSelectedValue(resi, true);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// /**
	// * @param resident
	// * the resident to set
	// */
	// public void setResident(ResidentMain resident) {
	// this.resident = resident;
	// if(panelResidentInfo != null) {
	// panelResidentInfo.setResident(resident);
	// }
	// }
	//
	// /**
	// * @return the resident
	// */
	// public ResidentMain getResident() {
	// return resident;
	// }
}
