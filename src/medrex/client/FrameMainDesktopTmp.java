package medrex.client;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import medrex.client.constants.Global;
import medrex.client.main.FrameMainOptions;
import medrex.client.main.PanelMainDesktop;
import medrex.commons.enums.ResidentTabs;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxFrame;

public class FrameMainDesktopTmp extends JxFrame {

	private JButton btnClose;
	private JButton btnMin;
	private JPanel controlBox;
	private PanelMainDesktop panelMainDesktopTmp;
	private Toolkit toolkit;
	private Rectangle areaOnScreen;
	private static final long serialVersionUID = 1L;

	/**
	 * Create the frame
	 */
	public FrameMainDesktopTmp() {
		super();
		Global.frameMainDesktopTmp = this;
		setUndecorated(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

		// addWindowFocusListener(new WindowFocusListener() {
		// public void windowGainedFocus(final WindowEvent arg0) {
		// doMainWindowFocusGained();
		// }
		// public void windowLostFocus(final WindowEvent arg0) {
		// }
		// });
		setTitle("Long Term Care");
		toolkit = Toolkit.getDefaultToolkit();

		panelMainDesktopTmp = new PanelMainDesktop();
		// panelMainDesktopTmp.addMouseMotionListener(new MouseMotionAdapter() {
		// public void mouseMoved(final MouseEvent e) {
		// processClipBoxMouseEvent(e);
		// }
		// });
		// addMouseMotionListener(new MouseMotionAdapter() {
		// public void mouseMoved(final MouseEvent e) {
		// processClipBoxMouseEvent(e);
		// }
		// });
		getContentPane().add(panelMainDesktopTmp, BorderLayout.CENTER);
		// panelMainDesktopTmp.add(getControlBox());
		final JPanel glassPane = new JPanel();
		setGlassPane(glassPane);
		glassPane.setLayout(new FlowLayout(SwingConstants.RIGHT, 0, 0));
		glassPane.setOpaque(false);
		glassPane.add(getControlBox());
		getGlassPane().setVisible(true);

		initGUI();

		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(final ComponentEvent e) {
				// getContentPane().setSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
				// doRedraw();
			}
		});

		Dimension scrSize = toolkit.getScreenSize();
		areaOnScreen = new Rectangle();
		areaOnScreen.x = scrSize.width - controlBox.getWidth();
		areaOnScreen.y = controlBox.getY();
		areaOnScreen.height = controlBox.getHeight();
		areaOnScreen.width = controlBox.getWidth();
	}

	// public void doMainWindowFocusGained(){
	// SwingUtils.focusChild();
	// }

	protected void processClipBoxMouseEvent(MouseEvent e) {
		if (e.getXOnScreen() >= areaOnScreen.x
				&& e.getYOnScreen() >= areaOnScreen.y
				&& e.getXOnScreen() <= (areaOnScreen.x + areaOnScreen.width)
				&& e.getYOnScreen() <= (areaOnScreen.y + areaOnScreen.height)) {
			getGlassPane().setVisible(true);
		} else {
			getGlassPane().setVisible(false);
		}
	}

	public void initGUI() {
		setBounds(0, 0, 1024, 768);
		setSize(toolkit.getScreenSize());
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}

	public void openMainOptions() {
		FrameMainOptions frameMainOptions;
		if (Global.frameMainOptions != null) {
			frameMainOptions = Global.frameMainOptions;
		} else {
			frameMainOptions = (FrameMainOptions) FrameFactory
					.createWindowOfType(FrameMainOptions.class);
		}
		this.dispose();
		frameMainOptions.setVisible(true);
	}

	public void doRedraw() {
		System.out.println("doRedraw in FrameMainDesktopTmp");
		panelMainDesktopTmp.doUpdate();
		panelMainDesktopTmp.setSize(getContentPane().getSize().width,
				getContentPane().getSize().height);

	}

	/**
	 * @return
	 */
	protected JPanel getControlBox() {
		if (controlBox == null) {
			controlBox = new JPanel();
			final FlowLayout flowLayout = new FlowLayout();
			flowLayout.setAlignment(FlowLayout.RIGHT);
			flowLayout.setVgap(2);
			flowLayout.setHgap(2);
			controlBox.setLayout(flowLayout);
			controlBox.setBounds(956, 0, 62, 32);
			controlBox.setPreferredSize(new Dimension(62, 32));
			controlBox.add(getBtnMin());
			controlBox.add(getBtnClose());
			controlBox.setOpaque(false);
		}
		return controlBox;
	}

	/**
	 * @return
	 */
	protected JButton getBtnMin() {
		if (btnMin == null) {
			btnMin = new JButton();
			btnMin.addActionListener(new ActionListener() {
				public void actionPerformed(final ActionEvent e) {
					FrameMainDesktopTmp.this.setState(Frame.ICONIFIED);
					// if(Global.frameMainOptions != null) {
					// Global.currentMainTab = 1;
					// Global.frameMainOptions.setFocusableWindowState(true);
					// Global.frameMainOptions.requestFocusInWindow();
					// Global.frameMainOptions.requestFocus();
					// }
				}
			});
			btnMin.setIcon(new ImageIcon("img/icons/mini.JPG"));
			ImageIcon icon = new ImageIcon("img/icons/mini1.JPG");
			btnMin.setRolloverIcon(icon);
			btnMin.setPressedIcon(icon);
			btnMin.setPreferredSize(new Dimension(28, 28));
			btnMin.setFocusPainted(false);
			btnMin.setMargin(new Insets(0, 0, 0, 0));
			btnMin.setText("");
		}
		return btnMin;
	}

	/**
	 * @return
	 */
	protected JButton getBtnClose() {
		if (btnClose == null) {
			btnClose = new JButton();
			btnClose.addActionListener(new ActionListener() {
				public void actionPerformed(final ActionEvent e) {
					FrameMainDesktopTmp.this.dispose();
				}
			});
			btnClose.setIcon(new ImageIcon("img/icons/close.JPG"));
			ImageIcon icon = new ImageIcon("img/icons/close1.JPG");
			btnClose.setRolloverIcon(icon);
			btnClose.setPressedIcon(icon);
			btnClose.setPreferredSize(new Dimension(28, 28));
			btnClose.setFocusPainted(false);
			btnClose.setMargin(new Insets(0, 0, 0, 0));
			btnClose.setText("");
		}
		return btnClose;
	}

	public void openMainDesktopTmpWithPanel(ResidentTabs tabName,
			String formName) {
		panelMainDesktopTmp.openDesktopMainWithPanel(tabName, formName);
	}

	// public void dispose() {
	// super.dispose();
	// if(Global.frameMainOptions != null) {
	// Global.currentMainTab = 2;
	// Global.frameMainOptions.setFocusableWindowState(true);
	// Global.frameMainOptions.requestFocusInWindow();
	// Global.frameMainOptions.requestFocus();
	// }
	// }
	//
	// public void setVisible(boolean b) {
	// if(Global.frameMainOptions != null) {
	// Global.frameMainOptions.setFocusableWindowState(false);
	// }
	// super.setVisible(b);
	// }

}
