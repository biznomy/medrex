package medrex.client.carelog;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.constants.GlobalCareLog;
import medrex.client.utils.events.LtcButtonClickedEvent;
import medrex.client.utils.events.LtcButtonListener;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.careLog.CareLog;
import medrex.commons.vo.careLog.CareLogOption;
import medrex.commons.vo.resident.ResidentMain;

public class PanelCareLogCategory extends JPanel implements LtcButtonListener {

	private JButton btnClose;
	private JButton btnPrevious;
	private JPanel panel_1;
	private JLabel cnaNameLabel;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLabel chooseResidentLabel;

	private JPanel panel;

	private PanelCareLogButton panelCareLogButtons[];

	private List careLogOptions;

	public PanelCareLogCategory() {
		super();
		setLayout(new BorderLayout());
		Global.panelCareLogCategory = this;

		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(1350, 1000));

		panel = new JPanel();
		panel.setBackground(new Color(231, 239, 242));
		panel.setLayout(null);
		add(panel);

		GlobalCareLog.initialize();

		panel_1 = new JPanel();
		panel_1.setBackground(new Color(231, 239, 242));
		panel_1.setLayout(null);
		panel_1.setBounds(65, 80, 902, 751);
		panel.add(panel_1);

		ResidentMain rm = null;

		try {
			rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
		} catch (Exception e) {

			System.out.println(rm.getUserName());

		}

		cnaNameLabel = new JLabel();
		cnaNameLabel.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		cnaNameLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		cnaNameLabel.setText("CHOOSE CARE LOG");
		cnaNameLabel.setBounds(353, 37, 300, 35);
		panel.add(cnaNameLabel);

		btnPrevious = new JButton(new ImageIcon("img\\carelog\\back.png"));
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.frameCareLogCategory.showChooseCareLog();
			}
		});
		btnPrevious.setBounds(716, 20, 93, 29);
		panel.add(btnPrevious);

		btnClose = new JButton(new ImageIcon("img\\carelog\\close.png"));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				/*
				 * new ControllerUserLogon().logoutUpdate(); System.exit(0);
				 */
				Global.frameCareLogCategory.showChooseCareLog();
			}
		});
		btnClose.setBounds(852, 20, 93, 29);
		panel.add(btnClose);
		// GlobalCNA.initializeToolTips();
		chooseResidentLabel = new JLabel();
		chooseResidentLabel.setVisible(false);
		chooseResidentLabel.setBounds(15, 913, 732, 46);
		panel.add(chooseResidentLabel);
		chooseResidentLabel.setFont(new Font("", Font.BOLD, 28));
		chooseResidentLabel.setBackground(Color.WHITE);
		chooseResidentLabel.setText(rm.getUserName() + " " + rm.getUserPass()
		/* TODO: Migrating to room history */
		+ " ," + rm.getSex()/* + " ,#" + rm.getRoom() */);

		careLogOptions = GlobalCareLog.getCareLogOptionsWithParentNum(0);
		panelCareLogButtons = new PanelCareLogButton[careLogOptions.size()];
		int x = 0;
		int y = 0;
		for (int i = 0; i < careLogOptions.size(); i++) {
			CareLogOption clo = (CareLogOption) careLogOptions.get(i);
			panelCareLogButtons[i] = new PanelCareLogButton(clo.getImg(), 1);
			panelCareLogButtons[i].setBounds(x, y, 200, 150);
			panelCareLogButtons[i].setTitleText(clo.getTitle());
			panelCareLogButtons[i].careLogNum = clo.getCareLogNum();
			panelCareLogButtons[i].addLtcButtonListener(this);
			x = x + 220;
			if (x > 660) {
				x = 0;
				y = y + 155;
			}
			panel_1.add(panelCareLogButtons[i]);
		}
	}

	public void ltcButtonClicked(LtcButtonClickedEvent evt) {
		int a = evt.val;
		GlobalCareLog.getCareLogOptionWithNum(a);
		GlobalCareLog.currentCareLogOptionKey = a;
		Global.frameCareLogCategory.showCareLogLevelA();
		// JOptionPane.showMessageDialog(null, "clicked");
	}

	public void updateResults() {
		if (GlobalCareLog.currentCareLogKey == 0) {
			for (int i = 0; i < careLogOptions.size(); i++) {
				panelCareLogButtons[i].hideResults();
			}
		} else {

			CareLog cl = null;
			try {
				cl = MedrexClientManager.getInstance().getCareLog(
						GlobalCareLog.currentCareLogKey);
			} catch (Exception e) {

			}

			for (int i = 0; i < careLogOptions.size(); i++) {
				int val = -1;
				CareLogOption clo = (CareLogOption) careLogOptions.get(i);
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
					panelCareLogButtons[i].showResults(options[val]);
				}
			}

		}

	}

}