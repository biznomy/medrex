package medrex.client.MedicationAndTreatment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medicationCart.MedicationView;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderMedication;
import medrex.server.dao.physicianOrders.physicianOrderNewScreen.PhysicianOrderMedicationDao;

public class PanelMedicationHistory extends JPanel {
	private PanelMedicationGrid[] panelGrid = null;

	public PanelMedicationHistory(PhysicianOrderMedication medView) {
		super();
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setVgap(0);
		flowLayout_2.setHgap(0);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		setLayout(flowLayout_2);
		panelGrid = new PanelMedicationGrid[5];
		setBackground(Color.WHITE);
		
		final JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setBackground(Color.WHITE);
		add(panel);

		final JLabel label = new JLabel();
		label.setFont(new Font("Dialog",Font.BOLD,14));
		label.setForeground(new Color(198,67,37));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setText(medView.getMedication());
		panel.add(label);
		
		
		final JPanel gridPanel = new JPanel();
//		gridPanel.setBorder(new LineBorder(Color.black, 1, false));
		final FlowLayout flowLayout_1 = new FlowLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		flowLayout_1.setVgap(0);
		flowLayout_1.setHgap(0);
		gridPanel.setLayout(flowLayout_1);
		gridPanel.setBackground(Color.WHITE);
		add(gridPanel);
		System.out.println("frequency:"+medView.getFrequency1());
		List<String> list = new ArrayList<String>();
		try {
			list = PhysicianOrderMedicationDao.getInstance().getTimeSlot(medView.getFrequency1());
		} catch (MedrexException e) {
			e.printStackTrace();
		}
		
		Iterator<String> itr = list.iterator();
		
		for(int i = 0 ;i< medView.getFrequency1() ; i++){
			String medVw  = list.get(i);
			panelGrid[i] = new PanelMedicationGrid(medVw+""); 
			panelGrid[i].setPreferredSize(new Dimension(400,30));
			gridPanel.setPreferredSize(new Dimension(500,30*5));
			gridPanel.add(panelGrid[i]);
		}
		
		System.out.println(gridPanel.getPreferredSize());
		panel.setPreferredSize(new Dimension(155,gridPanel.getPreferredSize().height));
		
		
	}

}
