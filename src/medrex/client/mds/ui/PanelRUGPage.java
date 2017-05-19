package medrex.client.mds.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import medrex.client.constants.Global;
import medrex.commons.intf.PopUpView;

public class PanelRUGPage extends PopUpView {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8193769806157428625L;
	private JLabel lblR;
	private JLabel lblRPES;
	private JLabel lblTotalADL;
	int value;

	public PanelRUGPage() {

		super();

		this.value = value;
		setBackground(Color.WHITE);
		setLayout(null);
		setSize(470, 310);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 468, 304);
		add(panel);

		final JLabel rugIiiLabel = new JLabel();
		rugIiiLabel.setFont(new Font("", Font.BOLD, 20));
		rugIiiLabel.setText("RUG - III Group");
		rugIiiLabel.setBounds(147, 34, 189, 38);
		panel.add(rugIiiLabel);

		final JLabel totalAdlScoreLabel = new JLabel();
		totalAdlScoreLabel.setText("Total ADL Score");
		totalAdlScoreLabel.setBounds(46, 106, 108, 24);
		panel.add(totalAdlScoreLabel);

		lblTotalADL = new JLabel();
		lblTotalADL.setText("");
		lblTotalADL.setBounds(200, 110, 66, 16);
		panel.add(lblTotalADL);

		final JLabel rehabilitationPlusExtensiveLabel = new JLabel();
		rehabilitationPlusExtensiveLabel
				.setText("REHABILITATION PLUS EXTENSIVE SERVICES :");
		rehabilitationPlusExtensiveLabel.setBounds(46, 151, 268, 24);
		panel.add(rehabilitationPlusExtensiveLabel);

		final JLabel rehabilitationLabel = new JLabel();
		rehabilitationLabel.setToolTipText("");
		rehabilitationLabel.setText("REHABILITATION :");
		rehabilitationLabel.setBounds(46, 203, 108, 16);
		panel.add(rehabilitationLabel);

		lblRPES = new JLabel();
		lblRPES.setText("");
		lblRPES.setBounds(345, 155, 66, 16);
		panel.add(lblRPES);

		lblR = new JLabel();
		lblR.setText("");
		lblR.setBounds(186, 203, 66, 16);
		panel.add(lblR);

		final JButton okButton = new JButton();
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		okButton.setText("OK");
		okButton.setBounds(160, 250, 106, 26);
		panel.add(okButton);

		doLoad();

	}

	private void doLoad() {
		lblTotalADL.setText(Global.totalADL + "");
		lblTotalADL.setText(value + "");
		System.out.println("value=====================" + value);
		// lblTotalADL.setText(value);
		lblRPES.setText(Global.currentRFPS);
		lblR.setText(Global.currentRehab);
	}

	@Override
	public String getTitle() {
		return "RUG - III Group";
	}

}
