package medrex.client.MedicationAndTreatment;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.commons.enums.ColorConstants;

public class PanelMedicationGrid extends JPanel{
	public PanelMedicationGrid(String slot) {
		super();
		setBackground(Color.WHITE);
		setLayout(new GridLayout(0, 8));

		final JLabel hourLabel = new JLabel();
		hourLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		hourLabel.setBorder(new LineBorder(Color.black, 1, false));
		hourLabel.setHorizontalAlignment(SwingConstants.CENTER);
		hourLabel.setForeground(ColorConstants.DEF_COLOR);
		hourLabel.setText(slot);
		add(hourLabel);

		final JLabel xLabel = new JLabel();
		xLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		xLabel.setBorder(new LineBorder(Color.black, 1, false));
		xLabel.setHorizontalAlignment(SwingConstants.CENTER);
		xLabel.setText("X");
		add(xLabel);

		final JLabel xLabel_1 = new JLabel();
		xLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		xLabel_1.setBorder(new LineBorder(Color.black, 1, false));
		xLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		xLabel_1.setText("X");
		add(xLabel_1);

		final JLabel xLabel_2 = new JLabel();
		xLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		xLabel_2.setBorder(new LineBorder(Color.black, 1, false));
		xLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		xLabel_2.setText("X");
		add(xLabel_2);

		final JLabel xLabel_3 = new JLabel();
		xLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		xLabel_3.setBorder(new LineBorder(Color.black, 1, false));
		xLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		xLabel_3.setText("X");
		add(xLabel_3);

		final JLabel xLabel_4 = new JLabel();
		xLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		xLabel_4.setBorder(new LineBorder(Color.black, 1, false));
		xLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		xLabel_4.setText("X");
		add(xLabel_4);

		final JLabel xLabel_5 = new JLabel();
		xLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		xLabel_5.setBorder(new LineBorder(Color.black, 1, false));
		xLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		xLabel_5.setText("X");
		add(xLabel_5);

		final JLabel xLabel_6 = new JLabel();
		xLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		xLabel_6.setBorder(new LineBorder(Color.black, 1, false));
		xLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		xLabel_6.setText("X");
		add(xLabel_6);
	}

	
}
