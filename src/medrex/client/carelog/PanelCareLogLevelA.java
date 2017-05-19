package medrex.client.carelog;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.constants.GlobalCNA;
import medrex.client.constants.GlobalCareLog;
import medrex.client.constants.GlobalSecurity;
import medrex.client.utils.events.LtcButtonClickedEvent;
import medrex.client.utils.events.LtcButtonListener;
import medrex.commons.enums.GuiModes;
import medrex.commons.enums.SubAppTypes;
import medrex.commons.vo.careLog.CareLog;
import medrex.commons.vo.careLog.CareLogOption;
import medrex.commons.vo.resident.ResidentMain;

public class PanelCareLogLevelA extends JPanel implements LtcButtonListener {

	private JLabel label_11;
	private JButton btnClose;
	private JButton btnPrevious;
	private JLabel bmFrequencyLabel_1;
	private JPanel panel_7;
	private PanelCareLogButtonA panelCareLogButtonsA[];
	private PanelCareLogButton panelCareLogSubButtons[];
	private JPanel panel_1;

	JLabel lblADL;
	int size;
	int selected;

	List careLogSubOptions;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLabel chooseResidentLabel;

	private JPanel panel;

	public PanelCareLogLevelA() {
		super();
		Global.panelCareLogLevelA = this;

		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(1350, 1000));
		setLayout(null);

		panel = new JPanel();
		panel.setBackground(new Color(231, 239, 242));
		panel.setLayout(null);
		panel.setBounds(0, 0, 1332, 1000);
		add(panel);
		// chooseResidentLabel.setText("RESIDENT DETAILS");

		ResidentMain rm = null;

		try {
			rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
		} catch (Exception e) {

			System.out.println(rm.getUserName());

		}

		lblADL = new JLabel();
		lblADL.setFont(new Font("Dialog", Font.BOLD, 20));
		lblADL
				.setForeground(GuiModes.CHANGE_SCREEN
						.getControlForegroundColor());
		lblADL.setBounds(20, 45, 628, 35);
		panel.add(lblADL);

		panel_1 = new JPanel();
		panel_1.setBackground(new Color(231, 239, 242));
		panel_1.setLayout(null);
		panel_1.setBounds(18, 86, 902, 564);
		panel.add(panel_1);

		btnPrevious = new JButton(new ImageIcon("img\\carelog\\back.png"));
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				Global.frameCareLogCategory.showCareLogMain(0);
			}
		});
		btnPrevious.setBounds(716, 20, 93, 29);
		panel.add(btnPrevious);

		btnClose = new JButton(new ImageIcon("img\\carelog\\close.png"));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				/*
				 * new ControllerUserLogon().logoutUpdate(); System.exit(0);
				 */
				Global.frameCareLogCategory.showCareLogMain(0);
			}
		});
		btnClose.setBounds(852, 20, 93, 29);
		panel.add(btnClose);

		label_11 = new JLabel(new ImageIcon("img\\question.jpg"));
		label_11.setBorder(new LineBorder(Color.BLUE, 5, false));
		label_11.setBounds(10, 78, 35, 35);
		label_11.setVisible(false);
		panel.add(label_11);

		label_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent arg0) {
//				FrameToolTip toolTip = new FrameToolTip(
//						GlobalCNA.toolTipText[GlobalCNA.currentADL][0],
//						GlobalCNA.toolTipText[GlobalCNA.currentADL][1]);
//				toolTip.setVisible(true);
			}
		});
		// label_2.setText("New JLabel");
		// label_3.setText("New JLabel");
		// label_4.setText("New JLabel");

		panel_7 = new JPanel();
		panel_7.setBounds(490, 10, 120, 54);
		panel.add(panel_7);
		panel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				doSave();
			}
		});

		panel_7.setVisible(false);

		panel_7.setBorder(new LineBorder(Color.BLUE, 5, false));
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);

		bmFrequencyLabel_1 = new JLabel();
		bmFrequencyLabel_1.setFont(new Font("Dialog", Font.BOLD, 16));
		bmFrequencyLabel_1.setText("SAVE");
		bmFrequencyLabel_1.setBounds(33, 20, 59, 16);
		panel_7.add(bmFrequencyLabel_1);

		chooseResidentLabel = new JLabel();
		chooseResidentLabel.setBounds(20, 4, 621, 35);
		panel.add(chooseResidentLabel);
		chooseResidentLabel.setFont(new Font("", Font.BOLD, 28));
		chooseResidentLabel.setBackground(new Color(231, 239, 242));
		chooseResidentLabel.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		chooseResidentLabel.setText(rm.getUserName() + " " + rm.getUserPass()
		/* TODO: Migrating to room history */
		+ " ," + rm.getSex()/* + " ,#" + rm.getRoom() */);

		selected = -1;
		updateSelections();

	}

	public void updateSelections() {
		int y = 0;
		if (panelCareLogButtonsA != null) {
			panel_1.removeAll();
		}
		if (GlobalCareLog.currentCareLogOptionKey != 0) {
			CareLogOption clo = GlobalCareLog
					.getCareLogOptionWithNum(GlobalCareLog.currentCareLogOptionKey);
			lblADL.setText(clo.getTitle());
			String[] options = clo.getOptions();
			size = options.length;
			panelCareLogButtonsA = new PanelCareLogButtonA[size];
			int x = 0;
			y = 0;
			for (int i = 0; i < size; i++) {
				panelCareLogButtonsA[i] = new PanelCareLogButtonA("", 1);
				panelCareLogButtonsA[i].setBounds(x, y, 200, 85);
				panelCareLogButtonsA[i].setTitleText(options[i]);
				panelCareLogButtonsA[i].careLogNum = i;
				panelCareLogButtonsA[i].addLtcButtonListener(this);
				x = x + 220;
				if (x > 660) {
					x = 0;
					y = y + 90;
				}
				panel_1.add(panelCareLogButtonsA[i]);
			}

			y = y + 150;
			careLogSubOptions = GlobalCareLog
					.getCareLogOptionsWithParentNum(clo.getCareLogNum());
			if (careLogSubOptions.size() > 0) {
				panelCareLogSubButtons = new PanelCareLogButton[careLogSubOptions
						.size()];
				x = 0;
				for (int i = 0; i < careLogSubOptions.size(); i++) {
					CareLogOption subClo = (CareLogOption) careLogSubOptions
							.get(i);
					panelCareLogSubButtons[i] = new PanelCareLogButton(subClo
							.getImg(), 2);
					panelCareLogSubButtons[i].setBounds(x, y, 200, 150);
					panelCareLogSubButtons[i].setTitleText(subClo.getTitle());
					panelCareLogSubButtons[i].careLogNum = subClo
							.getCareLogNum();
					panelCareLogSubButtons[i].addLtcButtonListener(this);
					x = x + 220;
					if (x > 660) {
						x = 0;
						y = y + 155;
					}
					panel_1.add(panelCareLogSubButtons[i]);
				}
			}

			deselectAll();
			if (GlobalCareLog.currentCareLogKey != 0) {
				CareLog cl = null;
				try {
					cl = MedrexClientManager.getInstance().getCareLog(
							GlobalCareLog.currentCareLogKey);
				} catch (Exception e) {

				}
				int val = -1;
				switch (GlobalCareLog.currentCareLogOptionKey) {
				case 1:
					val = cl.getVal1();
					break;
				case 2:
					val = cl.getVal2();
					break;
				case 3:
					val = cl.getVal3();
					break;
				case 4:
					val = cl.getVal4();
					break;
				case 5:
					val = cl.getVal5();
					break;
				case 6:
					val = cl.getVal6();
					break;
				case 7:
					val = cl.getVal7();
					break;
				case 8:
					val = cl.getVal8();
					break;
				case 9:
					val = cl.getVal9();
					break;
				case 10:
					val = cl.getVal10();
					break;
				case 11:
					val = cl.getVal11();
					break;
				case 12:
					val = cl.getVal12();
					break;
				case 13:
					val = cl.getVal13();
					break;
				case 14:
					val = cl.getVal14();
					break;
				case 15:
					val = cl.getVal15();
					break;
				case 16:
					val = cl.getVal16();
					break;
				case 17:
					val = cl.getVal17();
					break;
				case 18:
					val = cl.getVal18();
					break;
				case 19:
					val = cl.getVal19();
					break;
				case 20:
					val = cl.getVal20();
					break;
				}

				if (val != -1) {
					panelCareLogButtonsA[val].showResults("");
					selected = val;
				}

			}
			updateResults();
		}
	}

	public void updateResults() {
		if (GlobalCareLog.currentCareLogKey == 0) {
			for (int i = 0; i < careLogSubOptions.size(); i++) {
				panelCareLogSubButtons[i].hideResults();
			}
		} else {

			CareLog cl = null;
			try {
				cl = MedrexClientManager.getInstance().getCareLog(
						GlobalCareLog.currentCareLogKey);
			} catch (Exception e) {

			}

			for (int i = 0; i < careLogSubOptions.size(); i++) {
				int val = -1;
				CareLogOption clo = (CareLogOption) careLogSubOptions.get(i);
				switch (clo.getCareLogNum()) {
				case 1:
					val = cl.getVal1();
					break;
				case 2:
					val = cl.getVal2();
					break;
				case 3:
					val = cl.getVal3();
					break;
				case 4:
					val = cl.getVal4();
					break;
				case 5:
					val = cl.getVal5();
					break;
				case 6:
					val = cl.getVal6();
					break;
				case 7:
					val = cl.getVal7();
					break;
				case 8:
					val = cl.getVal8();
					break;
				case 9:
					val = cl.getVal9();
					break;
				case 10:
					val = cl.getVal10();
					break;
				case 11:
					val = cl.getVal11();
					break;
				case 12:
					val = cl.getVal12();
					break;
				case 13:
					val = cl.getVal13();
					break;
				case 14:
					val = cl.getVal14();
					break;
				case 15:
					val = cl.getVal15();
					break;
				case 16:
					val = cl.getVal16();
					break;
				case 17:
					val = cl.getVal17();
					break;
				case 18:
					val = cl.getVal18();
					break;
				case 19:
					val = cl.getVal19();
					break;
				case 20:
					val = cl.getVal20();
					break;

				}
				if (val != -1) {
					String[] options = clo.getOptions();
					panelCareLogSubButtons[i].showResults(options[val]);
				}
			}
		}
	}

	public void ltcButtonClicked(LtcButtonClickedEvent evt) {

		if (evt.level == 2) {
			// PanelCareLogButton abc = (PanelCareLogButton) (evt.getSource());
			int a = evt.val;
			GlobalCareLog.getCareLogOptionWithNum(a);
			GlobalCareLog.currentCareLogSubOptionKey = a;
			Global.frameCareLogCategory.showCareLogLevelB();
			// JOptionPane.showMessageDialog(null, "clicked")
		} else {
			deselectAll();
			int a = evt.val;
			selected = a;
			panelCareLogButtonsA[a].showResults("");
			doSave();
			// JOptionPane.showMessageDialog(null, "clicked");
		}
	}

	public void deselectAll() {

		for (int i = 0; i < panelCareLogButtonsA.length; i++) {
			panelCareLogButtonsA[i].hideResults();
		}
		selected = -1;
	}

	public void load() {
		GlobalCNA.currentADLA = GlobalCNA.results[GlobalCNA.currentADL][0];
		GlobalCNA.currentADLB = GlobalCNA.results[GlobalCNA.currentADL][1];

	}

	public void doSave() {
		if (GlobalSecurity.isUpdatePriviledge(SubAppTypes.CARELOG)) {
			if (selected != -1) {
				if (GlobalCareLog.currentCareLogKey == 0) {
					CareLog cl = new CareLog();
					cl.setDoneBy(Global.currentLoggedInUserKey);
					cl.setResidentId(Global.currentResidenceKey);
					cl.setDoneDate(MedrexClientManager.getServerTime());
					cl.setVal1(-1);
					cl.setVal2(-1);
					cl.setVal3(-1);
					cl.setVal4(-1);
					cl.setVal5(-1);
					cl.setVal6(-1);
					cl.setVal7(-1);
					cl.setVal8(-1);
					cl.setVal9(-1);
					cl.setVal10(-1);
					cl.setVal11(-1);
					cl.setVal12(-1);
					cl.setVal13(-1);
					cl.setVal14(-1);
					cl.setVal15(-1);
					cl.setVal16(-1);
					cl.setVal17(-1);
					cl.setVal18(-1);
					cl.setVal19(-1);
					cl.setVal20(-1);
					try {
						GlobalCareLog.currentCareLogKey = MedrexClientManager
								.getInstance().insertOrUpdateCareLog(cl);
					} catch (Exception e) {

					}
				} else {
					CareLog cl = null;
					try {
						cl = MedrexClientManager.getInstance().getCareLog(
								GlobalCareLog.currentCareLogKey);
					} catch (Exception e) {

					}
					// System.out.println("GlobalCareLog.currentCareLogOptionKey: "+GlobalCareLog.currentCareLogOptionKey+" ====: "+
					// selected);
					switch (GlobalCareLog.currentCareLogOptionKey) {
					case 1:
						cl.setVal1(selected);
						break;
					case 2:
						cl.setVal2(selected);
						break;
					case 3:
						cl.setVal3(selected);
						break;
					case 4:
						cl.setVal4(selected);
						break;
					case 5:
						cl.setVal5(selected);
						break;
					case 6:
						cl.setVal6(selected);
						break;
					case 7:
						cl.setVal7(selected);
						break;
					case 8:
						cl.setVal8(selected);
						break;
					case 9:
						cl.setVal9(selected);
						break;
					case 10:
						cl.setVal10(selected);
						break;
					case 11:
						cl.setVal11(selected);
						break;
					case 12:
						cl.setVal12(selected);
						break;
					case 13:
						cl.setVal13(selected);
						break;
					case 14:
						cl.setVal14(selected);
						break;
					case 15:
						cl.setVal15(selected);
						break;
					case 16:
						cl.setVal16(selected);
						break;
					case 17:
						cl.setVal17(selected);
						break;
					case 18:
						cl.setVal18(selected);
						break;
					case 19:
						cl.setVal19(selected);
						break;
					case 20:
						cl.setVal20(selected);
						break;

					}

					try {
						MedrexClientManager.getInstance()
								.insertOrUpdateCareLog(cl);
					} catch (Exception e) {

					}

				}
			}
		}
		Global.frameCareLogCategory.showCareLogMain(0);
	}
}