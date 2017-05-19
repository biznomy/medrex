package medrex.client.schedule;

import java.awt.Color;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import medrex.commons.enums.GuiModes;

public class PanelFromDateToToDate extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6340106184070304232L;
	private JLabel txtToDate;
	private JLabel txtFromDate;
	private Date fromDate;
	private Date toDate;
	private static DateFormat dateFormat;

	public PanelFromDateToToDate(Date fromDate, Date toDate) {
		setSize(PanelScheduleAdd.CELL_WIDTH * 28
				+ PanelScheduleAdd.LEFT_CELL_WIDTH,
				PanelScheduleAdd.CELL_HEIGHT);
		setLayout(null);
		dateFormat = new SimpleDateFormat("MMMM dd,yyyy ");

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);

		panel.setLayout(null);
		panel.setBounds(280, 0, 479, 25);
		add(panel);
		setBackground(Color.WHITE);

		this.fromDate = fromDate;
		this.toDate = toDate;

		String from = dateFormat.format(fromDate);
		String to = dateFormat.format(toDate);

		txtFromDate = new JLabel();
		txtFromDate.setHorizontalAlignment(SwingConstants.RIGHT);
		txtFromDate.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		txtFromDate.setFont(new Font("Arial", Font.BOLD, 14));
		txtFromDate.setBounds(48, 0, 160, 25);
		txtFromDate.setText(from);
		panel.add(txtFromDate);

		txtToDate = new JLabel();
		txtToDate.setHorizontalAlignment(SwingConstants.LEFT);
		txtToDate.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		txtToDate.setFont(new Font("Arial", Font.BOLD, 14));
		txtToDate.setBounds(220, 0, 160, 25);
		txtToDate.setText(to);
		panel.add(txtToDate);

		final JLabel label = new JLabel();
		label
				.setForeground(GuiModes.DESIGNER_FORMS
						.getControlForegroundColor());
		label.setFont(new Font("Arial", Font.BOLD, 14));
		label.setText("-");
		label.setBounds(208, 0, 12, 25);
		panel.add(label);

		/*
		 * final JLabel label = new JLabel(); label.setText("-");
		 * label.setForeground(GuiModes.DESIGNER_FORMS
		 * .getControlForegroundColor()); label.setBounds(260, 0, 10, 25);
		 * panel.add(label);
		 */

	}

}
