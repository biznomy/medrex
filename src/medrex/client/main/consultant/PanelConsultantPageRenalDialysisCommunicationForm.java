package medrex.client.main.consultant;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import medrex.commons.enums.GuiModes;

import com.sX.swing.JxButton;

;

public class PanelConsultantPageRenalDialysisCommunicationForm extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3915799618231162219L;
	private Color DEF_BUT_BACK = new Color(130, 163, 175);
	private Color DEF_BUT_FORE = new Color(8, 68, 95);

	/**
	 * Create the panel
	 */
	public PanelConsultantPageRenalDialysisCommunicationForm() {
		super();
		setPreferredSize(new Dimension(815, 35));
		setLayout(null);

		final JxButton btn1 = new JxButton();
		btn1
				.setBackground(GuiModes.DESIGNER_SCREEN
						.getControlBackgroundColor());
		btn1
				.setForeground(GuiModes.DESIGNER_SCREEN
						.getControlForegroundColor());
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				// Global.panelConsultantAdd.showRenalDialysisCommunicationFormPage(1);
			}
		});
		btn1.setText("1");
		btn1.setBounds(145, 5, 41, 25);
		add(btn1);

		final JxButton btn2 = new JxButton();
		btn2
				.setBackground(GuiModes.DESIGNER_SCREEN
						.getControlBackgroundColor());
		btn2
				.setForeground(GuiModes.DESIGNER_SCREEN
						.getControlForegroundColor());
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				// Global.panelConsultantAdd.showRenalDialysisCommunicationFormPage(2);
			}
		});
		btn2.setText("2");
		btn2.setBounds(192, 5, 41, 25);
		add(btn2);
	}

}