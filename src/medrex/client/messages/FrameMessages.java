package medrex.client.messages;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.border.EtchedBorder;

import medrex.client.constants.Global;
import medrex.client.main.FrameMainOptions;

import com.sX.frameFactory.FrameFactory;

public class FrameMessages extends JFrame {

	private PanelMessages panelMessages;
	private static final long serialVersionUID = 1L;
	public HashMap otherKeys;

	public FrameMessages() {
		super();
		Global.frameMessages = this;
		setBounds(new Rectangle(0, 0, 1350, 950));
		getContentPane().setBackground(Color.LIGHT_GRAY);

		// addWindowFocusListener(new WindowFocusListener() {
		// public void windowGainedFocus(final WindowEvent arg0) {
		// doMainWindowFocusGained();
		// }
		// public void windowLostFocus(final WindowEvent arg0) {
		// }
		// });
		// addFocusListener(new FocusAdapter() {
		//			
		// public void focusGained(final FocusEvent arg0) {
		//				
		// }
		// });
		setTitle("Long Term Care");

		panelMessages = new PanelMessages();
		panelMessages.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		panelMessages.setPreferredSize(new Dimension(1350, 950));
		getContentPane().add(panelMessages, BorderLayout.CENTER);

	}

	// public void doMainWindowFocusGained(){
	// SwingUtils.focusChild();
	// }

	public void openMainOptions() {
		System.out.println("vinod======");
		FrameMainOptions frameMainOptions = (FrameMainOptions) FrameFactory
				.createWindowOfType(FrameMainOptions.class);
		frameMainOptions.setVisible(true);
		this.dispose();
		System.out.println("vinod======++++++++++++++++");
	}

}
