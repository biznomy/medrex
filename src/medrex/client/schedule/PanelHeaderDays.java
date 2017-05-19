package medrex.client.schedule;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import medrex.commons.enums.GuiModes;

public class PanelHeaderDays extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1824676501790405119L;

	PanelHeaderDays() {
		setSize(PanelScheduleAdd.CELL_WIDTH * 30
				+ PanelScheduleAdd.LEFT_CELL_WIDTH,
				PanelScheduleAdd.CELL_HEIGHT);
		setLayout(null);

		JPanel panelUser = new JPanel();
		panelUser.setBackground(Color.WHITE);
		panelUser.setBounds(0, 0, PanelScheduleAdd.LEFT_CELL_WIDTH, 25);
		panelUser.setLayout(null);
		panelUser.setBorder(new LineBorder(Color.black, 1));
		add(panelUser);

		JLabel lblUser = new JLabel();
		lblUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser.setText("User");
		lblUser.setFont(new Font("Arial", Font.BOLD, 12));
		lblUser.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		panelUser.add(lblUser);
		lblUser.setBounds(0, 0, PanelScheduleAdd.LEFT_CELL_WIDTH, 25);

		for (int i = 0, j = 2; i < 28; i++, j++) {
			JPanel panelCountDays = new JPanel();
			JLabel labelCount = new JLabel();
			String day = "";
			switch (i % 7) {
			case 0:
				day = "S";
				break;
			case 1:
				day = "M";
				break;
			case 2:
				day = "T";
				break;
			case 3:
				day = "W";
				break;
			case 4:
				day = "T";
				break;
			case 5:
				day = "F";
				break;
			case 6:
				day = "S";
				break;

			}
			labelCount.setText(day);
			panelCountDays.add(labelCount);
			labelCount.setFont(new Font("Arial", Font.BOLD, 12));
			// panelCount.setBorder(new
			// LineBorder(PanelMasterScheduleMain.getBackgroundColor(i)));
			panelCountDays.setBounds((j * PanelScheduleAdd.CELL_WIDTH)
					+ (PanelScheduleAdd.LEFT_CELL_ToDYNAMIC_PANEL_WIDTH), 0,
					PanelScheduleAdd.CELL_WIDTH, PanelScheduleAdd.CELL_HEIGHT);
			panelCountDays.setBackground(PanelScheduleAdd
					.getBackgroundColor(i));
			labelCount.setForeground(GuiModes.DESIGNER_FORMS
					.getControlForegroundColor());
			// panelCount.setOpaque(false);
			// panelCount.setBackground(Color.WHITE);

			add(panelCountDays);
		}
	}

}
