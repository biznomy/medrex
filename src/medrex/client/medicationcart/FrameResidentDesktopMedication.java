package medrex.client.medicationcart;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.border.EtchedBorder;

import medrex.client.constants.Global;
import medrex.client.main.FrameMainOptions;

import com.sX.frameFactory.FrameFactory;

public class FrameResidentDesktopMedication extends JFrame {

	// private PanelResidentDesktopMedication panelResidentDesktopMedication;
	private PanelMedicationDesktop panelResidentDesktopMedication;
	private static final long serialVersionUID = 1L;

	public FrameResidentDesktopMedication() {
		super();
		setUndecorated(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		getContentPane().setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(new BorderLayout());
		Global.frameResidentDesktopMedication = this;

		addWindowFocusListener(new WindowFocusListener() {
			public void windowGainedFocus(final WindowEvent arg0) {

			}

			public void windowLostFocus(final WindowEvent arg0) {
			}
		});
		addFocusListener(new FocusAdapter() {

			@Override
			public void focusGained(final FocusEvent arg0) {

			}
		});
		setTitle("Long Term Care");

		// panelResidentDesktopMedication = new
		// PanelResidentDesktopMedication();
		panelResidentDesktopMedication = new PanelMedicationDesktop();
		panelResidentDesktopMedication.setBorder(new EtchedBorder(
				EtchedBorder.LOWERED));
		panelResidentDesktopMedication
				.setPreferredSize(new Dimension(800, 614));
		getContentPane().add(panelResidentDesktopMedication,
				BorderLayout.CENTER);
	}

	public void openMainOptions() {
		FrameMainOptions frameMainOptions = (FrameMainOptions) FrameFactory
				.createWindowOfType(FrameMainOptions.class);
		frameMainOptions.setVisible(true);
		this.dispose();
	}
}
