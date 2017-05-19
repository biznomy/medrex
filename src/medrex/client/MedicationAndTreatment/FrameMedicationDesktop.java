package medrex.client.MedicationAndTreatment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import medrex.client.MedicationAndTreatment.PRNmedication.PanelMedicationPRNDesktop;
import medrex.client.MedicationAndTreatment.PRNmedication.PanelMedicationPRNResidentInfo;
import medrex.client.MedicationAndTreatment.RoutineMedication.PanelMedicationCaution;
import medrex.client.MedicationAndTreatment.RoutineMedication.PanelMedicationMainDesktop;
import medrex.client.MedicationAndTreatment.RoutineMedication.PanelMedicationResidentInfo;
import medrex.client.MedicationAndTreatment.RoutineTreatment.PanelTreatmentMainDesktop;
import medrex.client.MedicationAndTreatment.RoutineTreatment.PanelTreatmentResidentInfo;
import medrex.client.constants.Global;
import medrex.commons.vo.medicationCart.MedicationView;

public class FrameMedicationDesktop extends JFrame {

	/**
	 * @author Suresh Prasad Rai This Frame is responsible for hamdling events
	 *         happining in treatment and to provide with requested panels.
	 */
	private static final long serialVersionUID = 1L;
	// index of the screen

	private int currentIndex = 1;

	// floorType selected in first screen

	private String floorType = "";

	public int getCurrentIndex() {
		return currentIndex;
	}

	public String getFloorType() {
		return floorType;
	}

	public void setFloorType(String floorType) {
		this.floorType = floorType;
	}

	public void setCurrentIndex(int currentIndex) {
		this.currentIndex = currentIndex;
	}

	// Panels Used In Medication
	private PanelMedicationCaution panelMedicationCaution;
	private PanelMedicationResidentInfo panelMedicationResidentInfo;
	private PanelMedicationMainDesktop panelMedicationMainDesktop;
	private PanelMedicationDashBoard panelMedicationDashBoard;
	private PanelMedicationPRNDesktop panelMedicationPRNDesktop;
	private PanelMedicationPRNResidentInfo panelMedicationPRNResidentInfo;
	private MedicationView currentMedication;
	private PanelTreatmentResidentInfo panelTreatmentResidentInfo;

	// for treatment record
	private PanelTreatmentMainDesktop panelTreatmentMainDesktop;

	public FrameMedicationDesktop() {
		super();
		setTitle("Medication Cart");
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				Global.frameMedicationDashboard = null;
			}

		});
		Global.frameMedicationDashboard = this;
		getContentPane().setBackground(Color.GRAY);
		getContentPane().removeAll();
		getContentPane().add(getPanel(getCurrentIndex()), BorderLayout.CENTER);
		setSize(new Dimension(
				Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
						.getDefaultToolkit().getScreenSize().height - 0));
		setVisible(true);

	}

	public JPanel getPanel(int index) {
		switch (index) {
		case 1:
			return getPanelMedicationDashboard();
		case 2:
			return getPanelMedicationMainDesktop();
		case 3:
			return getPanelMedicationResidentInfo();
		case 4:
			return getPanelMedicationCaution();
		case 5:
			return getPanelMedicationPRNDesktop();
		case 6:
			return getPanelMedicationPRNResidentInfo();

			// for treatments
		case 7:
			return getPanelTreatmentMainDesktop();

		case 8:
			return getPanelTreatmentResidentInfo();
		default:
			return new JPanel();
		}
	}

	public void reDrawTheFrame() {

		getContentPane().removeAll();
		JPanel panel = getPanel(getCurrentIndex());
		panel.repaint();
		panel.setVisible(true);
		getContentPane().add(panel, BorderLayout.CENTER);
		repaint();
		setVisible(true);

	}

	private PanelMedicationCaution getPanelMedicationCaution() {
		// if(panelMedicationCaution == null){
		// System.out.println("currentMedication after setting Medication :"+this.getCurrentMedication());
		panelMedicationCaution = new PanelMedicationCaution(this, this
				.getCurrentMedication());
		// }
		return panelMedicationCaution;
	}

	private PanelMedicationResidentInfo getPanelMedicationResidentInfo() {
		// if(panelMedicationResidentInfo == null){
		panelMedicationResidentInfo = new PanelMedicationResidentInfo(this);
		// }
		return panelMedicationResidentInfo;
	}

	private PanelMedicationMainDesktop getPanelMedicationMainDesktop() {
		// if(panelMedicationMainDesktop == null){
		panelMedicationMainDesktop = new PanelMedicationMainDesktop(this,
				floorType);
		// }
		return panelMedicationMainDesktop;
	}

	private PanelMedicationDashBoard getPanelMedicationDashboard() {
		// if(panelMedicationDashBoard == null){
		panelMedicationDashBoard = new PanelMedicationDashBoard(this);
		// }
		return panelMedicationDashBoard;
	}

	private JPanel getPanelMedicationPRNDesktop() {
		// if(panelMedicationMainDesktop == null){
		panelMedicationPRNDesktop = new PanelMedicationPRNDesktop(this,
				floorType);
		// }
		return panelMedicationPRNDesktop;
	}

	private JPanel getPanelMedicationPRNResidentInfo() {
		// if(panelMedicationPRNResidentInfo == null){
		panelMedicationPRNResidentInfo = new PanelMedicationPRNResidentInfo(
				this);
		// }
		return panelMedicationPRNResidentInfo;
	}

	private JPanel getPanelTreatmentMainDesktop() {
		panelTreatmentMainDesktop = new PanelTreatmentMainDesktop(this,
				floorType);
		return panelTreatmentMainDesktop;
	}

	private PanelTreatmentResidentInfo getPanelTreatmentResidentInfo() {
		// if(panelMedicationResidentInfo == null){
		panelTreatmentResidentInfo = new PanelTreatmentResidentInfo(this);
		// }
		return panelTreatmentResidentInfo;
	}

	public static void main(String ar[]) {
		FrameMedicationDesktop frame = new FrameMedicationDesktop();
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getPanel(frame.getCurrentIndex()),
				BorderLayout.CENTER);
		frame
				.setSize(new Dimension(Toolkit.getDefaultToolkit()
						.getScreenSize()));
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		Global.frameMedicationDashboard = frame;
	}

	public void setCurrentMedication(MedicationView currentMedication) {
		this.currentMedication = currentMedication;
	}

	public MedicationView getCurrentMedication() {
		return this.currentMedication;
	}

	public void updateResidentInfoScreen() {
		panelMedicationResidentInfo.showMedicationPanel();
	}

}
