package medrex.client.MedicationAndTreatment.RoutineMedication.MedicationScheduler;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderMedication;

/**
 * 
 * @author Mayank Chandela this class is for displaying panel showing the
 *         information about one particular medication its cautionary and
 *         contains grids for 1 week as defined by the number of time slots.
 * 
 */
public class PanelMedicationHistory extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3233031722664395034L;
	private PanelMedicationGrid[] panelGrid = null;

	public PanelMedicationHistory(PhysicianOrderMedication medView,
			Calendar calendar) {
		super();
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setVgap(0);
		flowLayout_2.setHgap(0);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		setLayout(flowLayout_2);
		setBackground(Color.WHITE);

		final JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setBackground(Color.WHITE);
		add(panel);

		final JLabel label = new JLabel();
		label.setFont(new Font("Dialog", Font.BOLD, 14));
		label.setForeground(new Color(198, 67, 37));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setText(medView.getMedication());
		panel.add(label, BorderLayout.NORTH);

		final JPanel gridPanel = new JPanel();
		// gridPanel.setBorder(new LineBorder(Color.black, 1, false));
		final FlowLayout flowLayout_1 = new FlowLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		flowLayout_1.setVgap(0);
		flowLayout_1.setHgap(0);
		gridPanel.setLayout(flowLayout_1);
		gridPanel.setBackground(Color.WHITE);
		add(gridPanel);

		List<String> list = new ArrayList<String>();
		try {
			list = MedrexClientManager.getInstance().getTimeSlot(
					medView.getFrequency1());
		} catch (Exception e) {
			e.printStackTrace();
		}
		list.iterator();
		panelGrid = new PanelMedicationGrid[list.size()];
		for (int i = 0; i < list.size(); i++) {
			String slot = list.get(i);
			panelGrid[i] = new PanelMedicationGrid(medView.getSerial(), slot,
					calendar);
			panelGrid[i].setPreferredSize(new Dimension(500, 30));
			gridPanel.setPreferredSize(new Dimension(500, 30 * list.size()));
			gridPanel.add(panelGrid[i]);
		}
		panel.setPreferredSize(new Dimension(155,
				gridPanel.getPreferredSize().height));

		final JTextArea lblcaution = new JTextArea();
		lblcaution.setBackground(Color.WHITE);
		lblcaution.setEditable(false);
		lblcaution.setWrapStyleWord(true);
		lblcaution.setLineWrap(true);
		lblcaution.setForeground(ColorConstants.MED_COLOR);
		lblcaution.setFont(new Font("Dialog", Font.PLAIN, 8));
		panel.add(lblcaution, BorderLayout.CENTER);
		try {
			if (medView != null) {
				lblcaution.setText(""
						+ MedrexClientManager.getInstance().getCautionaryName(
								medView.getMedicationId()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
