package medrex.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import medrex.client.admin.userLogon.ControllerUserLogon;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.MedrexMain;
import medrex.commons.enums.GuiModes;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxButton;
import com.sX.swing.JxFrame;

public class FrameMedrexServerMessage extends JxFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -527567328727951348L;
	private JxButton btnLogOf;
	private JxButton btnReconnect;

	public FrameMedrexServerMessage() {
		super();
		setSize(340, 140);
		setTitle("Medrex Server Message");
		setResizable(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		SwingUtils.center(this);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		getContentPane().add(panel, BorderLayout.CENTER);

		final JLabel canNotConnectLabel = new JLabel();
		canNotConnectLabel.setForeground(SystemColor.desktop);
		canNotConnectLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		canNotConnectLabel.setText("Can Not Connect to Medrex Server");
		canNotConnectLabel.setBounds(24, 16, 289, 30);
		panel.add(canNotConnectLabel);

		btnReconnect = new JxButton();
		btnReconnect.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				MedrexClientManager.setArgs(Global.arguments);
				MedrexClientManager.connect();
				if (MedrexClientManager.isConnected()) {
					if (Global.currentLoggedInUserKey == 0) {
						try {
							(new MedrexMain()).generalInitializations();
							FrameSplash frameSplash = (FrameSplash) FrameFactory
									.createWindowOfType(FrameSplash.class);
							frameSplash.setVisible(true);

							FrameLogin frame = (FrameLogin) FrameFactory
									.createWindowOfType(FrameLogin.class);

							frame.setVisible(true);
							frameSplash.dispose();
							closeMe();
						} catch (Exception ex) {
							ex.printStackTrace();
						}
					} else {
						closeMe();

					}
				}
			}
		});
		btnReconnect.setText("Reconnect");
		btnReconnect.setBackground(GuiModes.DESIGNER_FORMS
				.getDefaultBackgroundColor());
		btnReconnect.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		btnReconnect.setArc(0.4f);
		btnReconnect.setBounds(87, 57, 75, 30);
		panel.add(btnReconnect);

		btnLogOf = new JxButton();
		btnLogOf.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (Global.currentLoggedInUserKey != 0) {
					(new ControllerUserLogon()).logoutUpdate();
				} else {
					closeMe();
				}

			}
		});

		if (Global.currentLoggedInUserKey != 0) {
			btnLogOf.setText("Log off");
		} else {
			btnLogOf.setText("Close");
		}

		btnLogOf.setBackground(GuiModes.DESIGNER_FORMS
				.getDefaultBackgroundColor());
		btnLogOf.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		btnLogOf.setArc(0.4f);
		btnLogOf.setBounds(187, 57, 75, 30);
		btnLogOf.setEnabled(true);
		panel.add(btnLogOf);
		this.setVisible(true);
	}

	public void closeMe() {
		this.dispose();
	}

}
