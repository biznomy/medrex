package medrex.client.main.labspecial;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelLabSpecialpageReasonSForm extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel
	 */
	public PanelLabSpecialpageReasonSForm() {
		super();
		setPreferredSize(new Dimension(900, 35));
		setLayout(null);

		final JButton btn1 = new JButton();
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				// Global.panelLabSpecialAdd.showActivityFormPage(1);
			}
		});
		btn1.setText("1");
		btn1.setBounds(145, 5, 41, 25);
		add(btn1);

		final JButton btn2 = new JButton();
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				// Global.panelLabSpecialAdd.showActivityFormPage(2);
			}
		});
		btn2.setText("2");
		btn2.setBounds(192, 5, 41, 25);
		add(btn2);
	}

}