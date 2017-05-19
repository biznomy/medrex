package medrex.client.admin.screenSaver;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.WindowConstants;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.Config;

public class FrameScreenSaver extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 216723206160565395L;
	private JButton btnCancel;
	private JButton btnSubmit;
	private JTextField txtSeconds;
	SpinnerNumberModel model;
	final JSpinner spinner;

	public FrameScreenSaver() {
		super();
		setBackground(Color.WHITE);
		setBounds(0, 0, 272, 219);
		// setPreferredSize(new Dimension(300, 250));
		setBackground(Color.WHITE);
		setTitle("Screen Saver Settings");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		SwingUtils.center(this);
		setLayout(null);

		final JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 272, 197);
		add(panel);

		final JLabel screenSaverSettingsLabel = new JLabel();
		screenSaverSettingsLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		screenSaverSettingsLabel.setBounds(59, 35, 188, 25);
		screenSaverSettingsLabel.setText("Screen Saver Settings");
		screenSaverSettingsLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		panel.add(screenSaverSettingsLabel);

		model = new SpinnerNumberModel();
		model.setMinimum(1);
		spinner = new JSpinner(model);
		spinner.setBackground(Color.WHITE);
		JSpinner.DefaultEditor editor = new JSpinner.DefaultEditor(spinner);
		spinner.setEditor(editor);
		spinner.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		spinner.setBounds(84, 83, 94, 25);
		panel.add(spinner);

		final JLabel waitForLabel = new JLabel();
		waitForLabel.setText("Wait for");
		waitForLabel.setBounds(36, 88, 54, 14);
		waitForLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		panel.add(waitForLabel);

		final JLabel secondsLabel = new JLabel();
		secondsLabel.setText("Minutes");
		secondsLabel.setBounds(193, 88, 54, 14);
		secondsLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		panel.add(secondsLabel);

		btnSubmit = new JButton();
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					setTime();
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (MedrexException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				FrameScreenSaver.this.dispose();
			}
		});
		btnSubmit.setText("ok");
		btnSubmit.setFocusable(false);
		btnSubmit.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnSubmit.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnSubmit.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnSubmit.setFont(new Font("", Font.BOLD, 12));
		btnSubmit.setBounds(84, 129, 75, 21);
		panel.add(btnSubmit);

		try {
			updateData();
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (MedrexException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	private void updateData() throws RemoteException, MedrexException {
		Config config = MedrexClientManager.getInstance()
				.getScreenSaverConfig();
		spinner.setValue(Integer.parseInt(config.getConfigValue()));
	}

	protected void setTime() throws RemoteException, MedrexException {
		String obj = spinner.getValue().toString();
		int time = Integer.parseInt(obj);
		Config config = MedrexClientManager.getInstance()
				.getScreenSaverConfig();
		if (config == null) {
			config = new Config();
		}
		config.setConfigValue(Integer.toString(time));
		config.setTypeName("ScreenSaver");
		MedrexClientManager.getInstance().insertOrUpdateScreenSaverConfig(
				config);
		// MedrexClientManager.getInstance().insertorupdate
		// FileOutputStream out;
		// PrintStream p;
		// try
		// {
		// out = new FileOutputStream("screenSaver/time.txt");
		// p = new PrintStream( out );
		// p.println (time);
		// p.close();
		// }
		// catch (Exception e)
		// {
		// System.err.println ("Error writing to file");
		// }
		// // Global.currentScreenSaverTime = time;
	}
}
