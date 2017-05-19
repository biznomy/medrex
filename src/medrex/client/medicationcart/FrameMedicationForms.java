package medrex.client.medicationcart;

import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.WindowConstants;

import medrex.client.constants.Global;

public class FrameMedicationForms extends JDialog {
	private static final long serialVersionUID = 1L;
	Toolkit toolkit = null;

	public PanelMedicationNurseNotes panelMedicationNurseNotes;
	public PanelPhysicianOrder panelMedicationPhysicianOrders;

	public FrameMedicationForms() {
		super();
		toolkit = Toolkit.getDefaultToolkit();
		setUndecorated(true);
		setModal(true);
		getContentPane().setLayout(new BorderLayout());
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Global.frameMedicationForms = this;
		setSize(toolkit.getScreenSize());
		setPreferredSize(toolkit.getScreenSize());
		setBounds(0, 0, toolkit.getScreenSize().width,
				toolkit.getScreenSize().height);
		setResizable(false);

		panelMedicationPhysicianOrders = getPanelMedicationPhysicianOrders();

	}

	private PanelMedicationNurseNotes getPanelMedicationNurseNotes() {
		if (panelMedicationNurseNotes == null) {
			panelMedicationNurseNotes = new PanelMedicationNurseNotes();
			panelMedicationNurseNotes.setBounds(0, 0,
					toolkit.getScreenSize().width,
					toolkit.getScreenSize().height);
			getContentPane().add(panelMedicationNurseNotes);
			panelMedicationNurseNotes.setVisible(false);
		}
		return panelMedicationNurseNotes;
	}

	private PanelPhysicianOrder getPanelMedicationPhysicianOrders() {
		if (panelMedicationPhysicianOrders == null) {
			panelMedicationPhysicianOrders = new PanelPhysicianOrder();
			panelMedicationPhysicianOrders.setBounds(0, 0, toolkit
					.getScreenSize().width, toolkit.getScreenSize().height);
			Global.panelPhysicianOrder = panelMedicationPhysicianOrders;
			Global.panelPhysicianOrder.updateData();
			getContentPane().add(panelMedicationPhysicianOrders);
			panelMedicationPhysicianOrders.setVisible(true);
		}
		return panelMedicationPhysicianOrders;
	}

	public void showNurseNotes() {
		if (panelMedicationNurseNotes == null) {
			panelMedicationNurseNotes = getPanelMedicationNurseNotes();
		}
		if (panelMedicationPhysicianOrders != null) {
			this.getContentPane().remove(panelMedicationPhysicianOrders);
			panelMedicationPhysicianOrders = null;
		}
		setTitle("Nurse Notes");
		panelMedicationNurseNotes.doUpdate(Global.currentMedicationPhyOrder,
				Global.currentMedicationNurNotes);
		panelMedicationNurseNotes.setVisible(true);
		panelMedicationNurseNotes.repaint();
		this.getContentPane().repaint();
		this.repaint();
		this.setVisible(true);
	}

	public void showPhysicianOrders() {
		setTitle("Physician Orders");
		getContentPane().add(panelMedicationPhysicianOrders);
		this.getContentPane().repaint();
		this.repaint();
		this.setVisible(true);
	}

	public void showMedication() {
		if (Global.panelMedicationDesktop != null) {
			Global.panelMedicationDesktop.firePropertyChange("DISPLAY_TAB",
					false, true);
			Global.panelMedicationDesktop.repaint();
			Global.panelMedicationDesktop.updateUI();
			Global.panelMedicationDesktop.setVisible(true);
		}

		this.setVisible(false);
		Global.frameMedicationForms.dispose();
		Global.frameMedicationForms = null;
	}
}
