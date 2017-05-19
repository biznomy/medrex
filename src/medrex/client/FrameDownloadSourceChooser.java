package medrex.client;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import medrex.client.constants.Global;

public class FrameDownloadSourceChooser extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6179047716472136814L;

	public FrameDownloadSourceChooser() {
		super();
		setLayout(null);
		Global.frameDownloadSourceChooser = this;
		setBackground(new Color(232, 240, 242));
		setSize(new Dimension(400, 230));
		setModal(true);
		setTitle("Download Source");

		final JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 10, 366, 172);
		panel.setBackground(new Color(232, 240, 242));
		add(panel);

		final JLabel downloadFromLabel = new JLabel();
		downloadFromLabel.setText("Download From");
		downloadFromLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		downloadFromLabel.setBounds(24, 46, 96, 16);
		panel.add(downloadFromLabel);

		final JButton internetButton = new JButton();
		internetButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.selectedSource = "Internet";
				Global.frameDownloadSourceChooser.dispose();
			}
		});
		internetButton.setText("Internet");
		internetButton.setBounds(158, 27, 158, 24);
		panel.add(internetButton);

		final JButton button_1 = new JButton();
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.selectedSource = "Local Server";
				Global.frameDownloadSourceChooser.dispose();
			}
		});
		button_1.setText("Local Server");
		button_1.setBounds(158, 72, 158, 24);
		panel.add(button_1);

		final JButton cancelButton = new JButton();
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				System.exit(0);
			}
		});
		cancelButton.setText("Cancel");
		cancelButton.setBounds(199, 123, 95, 24);
		panel.add(cancelButton);
	}

}
