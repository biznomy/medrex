package medrex.client.schedule;

import java.awt.Color;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.schedule.ScheduleConstants.ScheduleMode;
import medrex.commons.enums.GuiModes;

public class PanelHeaderCount extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5530964232587911299L;
	private Date fromDate;
	private GregorianCalendar cal;
	public JLabel[] labelCount;

	PanelHeaderCount(Date fromDate) {
		setSize(PanelScheduleAdd.CELL_WIDTH * 30
				+ PanelScheduleAdd.LEFT_CELL_WIDTH,
				PanelScheduleAdd.CELL_HEIGHT);
		setLayout(null);
		this.cal = new GregorianCalendar();
		this.fromDate = fromDate;
		this.cal.setTime(fromDate);

		JPanel panelCountLeftPanel = new JPanel();
		panelCountLeftPanel.setBackground(Color.WHITE);
		panelCountLeftPanel.setBounds(0, 0, PanelScheduleAdd.LEFT_CELL_WIDTH,
				25);
		panelCountLeftPanel.setLayout(null);
		panelCountLeftPanel.setBorder(new LineBorder(Color.black, 1));
		add(panelCountLeftPanel);

		JLabel lblCountLeftLabel = new JLabel();

		lblCountLeftLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblCountLeftLabel.setText("");
		lblCountLeftLabel.setFont(new Font("Arial", Font.BOLD, 12));
		panelCountLeftPanel.add(lblCountLeftLabel);
		lblCountLeftLabel.setBounds(0, 0, PanelScheduleAdd.LEFT_CELL_WIDTH, 25);

		labelCount = new JLabel[28];
		for (int i = 0, j = 2, k = cal.get(Calendar.DATE); i < 28; i++, j++, k++) {
			JPanel panelCount = new JPanel();
			labelCount[i] = new JLabel();
			DateFormat dateFormat;
			if (PanelScheduleAdd.scheduleMode != ScheduleMode.MASTER_SCHEDULE) {
				dateFormat = new SimpleDateFormat("MM/dd");
			}
			else{
				dateFormat = new SimpleDateFormat("dd");
			}


			String dateString = dateFormat.format(cal.getTime());
			labelCount[i].setText(dateString);
			labelCount[i].setFont(new Font("Arial", Font.BOLD, 12));
			// labelCount[i].setText((i+1)+"");
			panelCount.add(labelCount[i]);
			// panelCount.setBorder(new
			// LineBorder(PanelMasterScheduleMain.getBackgroundColor(i)));
			panelCount.setBounds((j * PanelScheduleAdd.CELL_WIDTH)
					+ (PanelScheduleAdd.LEFT_CELL_ToDYNAMIC_PANEL_WIDTH), 0,
					PanelScheduleAdd.CELL_WIDTH, PanelScheduleAdd.CELL_HEIGHT);
			panelCount.setBackground(PanelScheduleAdd
					.getBackgroundColor(i));
			labelCount[i].setForeground(GuiModes.DESIGNER_FORMS
					.getControlForegroundColor());
			// panelCount.setOpaque(false);
			// panelCount.setBackground(Color.WHITE);

			add(panelCount);
			cal.add(Calendar.DATE, 1);
		}
		
		JPanel panelCount = new JPanel();
		JLabel labelCount = new JLabel();
		labelCount.setText("Total");
		labelCount.setFont(new Font("Arial", Font.BOLD, 12));
		// labelCount[i].setText((i+1)+"");
		panelCount.add(labelCount);
		// panelCount.setBorder(new
		// LineBorder(PanelMasterScheduleMain.getBackgroundColor(i)));
		panelCount.setBounds((30 * PanelScheduleAdd.CELL_WIDTH)
				+ (PanelScheduleAdd.LEFT_CELL_ToDYNAMIC_PANEL_WIDTH), 0,
				PanelScheduleAdd.CELL_WIDTH, PanelScheduleAdd.CELL_HEIGHT);
		panelCount.setBackground(Color.WHITE);
		labelCount.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		// panelCount.setOpaque(false);
		// panelCount.setBackground(Color.WHITE);

		add(panelCount);
	
		
		
		
		
		
		
		
		
		
		
	}

}
