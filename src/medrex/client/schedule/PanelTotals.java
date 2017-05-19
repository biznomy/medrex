package medrex.client.schedule;

import java.awt.Color;
import java.awt.Font;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


import com.sX.swing.JxLabel;

import medrex.commons.enums.GuiModes;

public class PanelTotals extends JPanel {
	/**
	 * 
	 */
	private  final long serialVersionUID = 8583310666189475079L;
	private  int tothours = 0;
	public JLabel lbltotal;
	public  JxLabel labelTotCount[] = new JxLabel[28];
	public  HashMap<Integer,String> totalMap[] = new HashMap[28];

	PanelTotals(int tothours,String label) {

		this.tothours = tothours;
		setSize(PanelScheduleAdd.CELL_WIDTH * 28
				+ PanelScheduleAdd.LEFT_CELL_WIDTH,
				PanelScheduleAdd.CELL_HEIGHT);
		setLayout(null);
		setBorder(new LineBorder(Color.black, 1, false));

		JPanel panelTotal = new JPanel();
		panelTotal.setBackground(Color.WHITE);
		panelTotal.setBounds(0, 0, PanelScheduleAdd.LEFT_CELL_WIDTH, 25);
		panelTotal.setLayout(null);
		panelTotal.setBorder(new LineBorder(Color.black, 1));
		add(panelTotal);

		lbltotal = new JLabel();
		lbltotal.setHorizontalAlignment(SwingConstants.CENTER);
		lbltotal.setText(label);
		lbltotal.setFont(new Font("Arial", Font.BOLD, 12));
		lbltotal.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		panelTotal.add(lbltotal);
		lbltotal.setBounds(0, 0, PanelScheduleAdd.LEFT_CELL_WIDTH, 25);

		for (int i = 0, j = 1; i < 28; i++, j++) {
			totalMap[i]= new HashMap<Integer,String>();
			JPanel panelTotCount = new JPanel();
			labelTotCount[i] = new JxLabel();
			labelTotCount[i].setText(tothours + "");
			panelTotCount.add(labelTotCount[i]);
			// labelTotCount.setBackground(PanelMasterScheduleMain.getBackgroundColor(i));
			// labelTotCount.setBorder(new LineBorder(Color.black,1,false));
			labelTotCount[i]
					.setBounds(
							j
									* (PanelScheduleAdd.CELL_WIDTH)
									+ (PanelScheduleAdd.LEFT_CELL_ToDYNAMIC_PANEL_WIDTH),
							0, PanelScheduleAdd.CELL_WIDTH,
							PanelScheduleAdd.CELL_HEIGHT);
			labelTotCount[i].setFont(new Font("Arial", Font.PLAIN, 11));
			panelTotCount.setBorder(new LineBorder(Color.black, 1, false));
			panelTotCount
					.setBounds(
							PanelScheduleAdd.CELL_WIDTH
									+ (j * (PanelScheduleAdd.CELL_WIDTH))
									+ (PanelScheduleAdd.LEFT_CELL_ToDYNAMIC_PANEL_WIDTH),
							0, PanelScheduleAdd.CELL_WIDTH,
							PanelScheduleAdd.CELL_HEIGHT);
			// panelTotCount.setBackground(PanelMasterScheduleMain.getBackgroundColor(i));
			labelTotCount[i].setForeground(GuiModes.DESIGNER_FORMS
					.getControlForegroundColor());
			panelTotCount.setBackground(PanelScheduleAdd
					.getBackgroundColor(i));
			// panelCount.setOpaque(false);
			// panelCount.setBackground(Color.WHITE);

			add(panelTotCount);
		}
	}

	public  void setTotalHours(int index, int user, String shift){
		int d1n=0;
		int d2n=0;
		int d1s=0;
		int d2s=0;
		int e1n=0;
		int e2n=0;
		int e1s=0;
		int e2s=0;
		int n1n=0;
		int n2n=0;
		int n1s=0;
		int n2s=0;
		
		
		totalMap[index].remove(new Integer(user));
		totalMap[index].put(new Integer(user),shift);
		Iterator<Integer> i = totalMap[index].keySet().iterator();
		while(i.hasNext()){
			String shiftInMap = totalMap[index].get(i.next());
			if (shiftInMap.contains("D1N")) d1n=d1n+1;
			if (shiftInMap.contains("D2N")) d2n=d2n+1;
			if (shiftInMap.contains("D1S")) d1s=d1s+1;
			if (shiftInMap.contains("D2S")) d2s=d2s+1;
			if (shiftInMap.contains("E1N")) e1n=e1n+1;
			if (shiftInMap.contains("E2N")) e2n=e2n+1;
			if (shiftInMap.contains("E1S")) e1s=e1s+1;
			if (shiftInMap.contains("E2S")) e2s=e2s+1;
			if (shiftInMap.contains("N1N")) n1n=n1n+1;
			if (shiftInMap.contains("N2N")) n2n=n2n+1;
			if (shiftInMap.contains("N1S")) n1s=n1s+1;
			if (shiftInMap.contains("N2S")) n2s=n2s+1;
		}
		
		labelTotCount[index].setText(d1n+d2n+d1s+d2s+e1n+e2n+e1s+e2s+n1n+n2n+n1s+n2s+"");
		labelTotCount[index].setToolTipText("<HTML> Day - 1st Floor - North "+d1n+
				"<BR> Day - 2nd Floor -North"+d2n+
				"<BR> Day - 1st Floor -South"+d1s+
				"<BR> Day - 2nd Floor -South"+d2s+
				"<BR> Evening - 1st Floor - North "+e1n+
				"<BR> Evening - 2nd Floor -North"+e2n+
				"<BR> Evening - 1st Floor -South"+e1s+
				"<BR> Evening - 2nd Floor -South"+e2s+
				"<BR> Night - 1st Floor - North "+n1n+
				"<BR> Night - 2nd Floor -North"+n2n+
				"<BR> Night - 1st Floor -South"+n1s+
				"<BR> Night - 2nd Floor -South"+n2s
				);
//		System.out.println("<HTML> Day - 1st Floor - North "+d1n+
//				"<BR> Day - 2nd Floor -North"+d2n+
//				"<BR> Day - 1st Floor -South"+d1s+
//				"<BR> Day - 2nd Floor -South"+d2s+
//				"<BR> Evening - 1st Floor - North "+e1n+
//				"<BR> Evening - 2nd Floor -North"+e2n+
//				"<BR> Evening - 1st Floor -South"+e1s+
//				"<BR> Evening - 2nd Floor -South"+e2s+
//				"<BR> Night - 1st Floor - North "+n1n+
//				"<BR> Night - 2nd Floor -North"+n2n+
//				"<BR> Night - 1st Floor -South"+n1s+
//				"<BR> Night - 2nd Floor -South"+n2s		);
	}
}
