package medrex.client.carelog;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.WindowConstants;

import medrex.client.constants.Global;

public class FrameCareLogCategory extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application
	 * 
	 * @param args
	 */

	/**
	 * Create the dialog
	 */
	medrex.client.carelog.PanelChooseCareLog panelChooseCareLog;
	PanelCareLogApplication panelCareLog;
	PanelCareLogLevelA panelCareLogLevelA;
	PanelCareLogLevelB panelCareLogLevelB;

	// PanelCNALevelB panelCNALevelB;

	public FrameCareLogCategory() {
		super();
		getContentPane().setLayout(null);
		setUndecorated(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Global.frameCareLogCategory = this;
		setTitle("Care Log");
		setModal(true);
		setSize(new Dimension(1024, 768));
		setBounds(0, 0, 1024, 768);
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		// this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// panelCareLog = new PanelCareLogCategory();
		panelCareLog = new PanelCareLogApplication(12, 0);
		// panelCareLog.setBounds(0, 0, 1350, 1000);
		panelCareLog.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		getContentPane().add(panelCareLog);
		panelChooseCareLog = new medrex.client.carelog.PanelChooseCareLog(12);
		panelChooseCareLog.setBounds(0, 0, 1350, 1000);
		getContentPane().add(panelChooseCareLog);
		panelCareLogLevelA = new PanelCareLogLevelA();
		panelCareLogLevelA.setBounds(0, 0, 1350, 1000);
		getContentPane().add(panelCareLogLevelA);
		panelCareLogLevelB = new PanelCareLogLevelB();
		panelCareLogLevelB.setBounds(0, 0, 1350, 1000);
		getContentPane().add(panelCareLogLevelB);
		// panelCareLogLevelB = new PanelCareLogLevelB();
		// panelCareLogLevelB.setBounds(0, 0, 1350, 1000);
		// getContentPane().add(panelCareLogLevelB);
		showChooseCareLog();
	}

	public void showCareLogMain(int careLogMasterSerial) {
		hideAll();
		panelCareLog.setVisible(true);
		// panelCareLog.updateResults();
	}

	public void hideAll() {
		panelCareLog.setVisible(false);
		panelCareLogLevelA.setVisible(false);
		// panelCareLogLevelB.setVisible(false);
		panelChooseCareLog.setVisible(false);
		panelCareLogLevelB.setVisible(false);
	}

	public void showCareLogLevelA() {
		hideAll();
		panelCareLogLevelA.load();
		panelCareLogLevelA.updateSelections();
		panelCareLogLevelA.setVisible(true);
	}

	public void showCareLogLevelB() {
		hideAll();
		panelCareLogLevelB.load();
		panelCareLogLevelB.updateSelections();
		panelCareLogLevelB.setVisible(true);
	}

	public void backCareLogLevelA() {
		hideAll();
		panelCareLogLevelA.updateSelections();
		panelCareLogLevelA.setVisible(true);

	}

	// public void showCareLogLevelB(){
	// hideAll();
	// panelCareLogLevelB.init();
	// panelCareLogLevelB.setVisible(true);
	// panelCareLogLevelB.updateSelections();

	// }

	public void showChooseCareLog() {
		hideAll();

		panelChooseCareLog.setVisible(true);
		System.out.println("in frame residence key "
				+ Global.currentResidenceKey);
		panelChooseCareLog.doLoad();
		// panelChooseCareLog.updateSelections();

	}

	public void openResidentDesktop() {
		// FrameResidentDesktopCareLog frameResidentDesktopCareLog=new
		// FrameResidentDesktopCareLog();
		// frameResidentDesktopCareLog.setUndecorated(true);
		// frameResidentDesktopCareLog.setVisible(true);
		this.dispose();

	}

}
