package medrex.client.MedicationAndTreatment.RoutineMedication.MedicationScheduler;

import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.RemoteException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import medrex.client.MedicationAndTreatment.RoutineMedication.PanelCautionPopUp;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medicationCart.MedicationView;

import com.sX.awt.Direction;
import com.sX.swing.JxPanel;

public class PanelMedication extends JxPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6812652393270721693L;
	private JLabel userLabel;
	private JTextArea txtCaution;
	private JLabel lblRoute;
	private JLabel lblDose;
	private JLabel imageLabel;
	private JLabel lblMedication;
	private JLabel lblFrequency;
	private int rowNo = 0;
	private static final Color BACKGROUND = new Color(231, 234, 234);
	private static final Color FOREGROUND = new Color(0, 69, 97);
	private static final Border BORDER = new LineBorder(
			new Color(122, 154, 167), 2, false);
	MedicationView row = null;
	private boolean pressed;
	private boolean rollOver;
	private String medicationType;
	private Color color = new Color(194, 211, 217);
	private MedicationView currentMedication;
	private JLabel statusLabel;
	private String route;
	private MedicationView medicationView;

	public PanelMedication() {
		super();
		setDoubleBuffered(true);
		setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		setLayout(null);
		setArc(0.4f);
		setBackground(Color.WHITE);
		setSize(401, 76);
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if ("RM".equalsIgnoreCase(PanelMedication.this.medicationType)) {
					Global.frameMedicationDashboard
							.setCurrentMedication(PanelMedication.this.currentMedication);
					System.out.println("medication view on  "
							+ medicationView.getStatus());
					if (medicationView.getStatus() != 0) {
						JOptionPane.showMessageDialog(null,
								"This medicine already given !!!!!!");
					} else {
						PanelCautionPopUp cautionPopup = new PanelCautionPopUp(
								"RM");
						SwingUtils.openInDialog(cautionPopup);
					}
				}
				if ("PRN".equalsIgnoreCase(PanelMedication.this.medicationType)) {
					Global.frameMedicationDashboard
							.setCurrentMedication(PanelMedication.this.currentMedication);
					PanelCautionPopUp cautionPopup = new PanelCautionPopUp(
							"PRN");
					SwingUtils.openInDialog(cautionPopup);
				}
			}
		});
		final JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(10, 3, 154, 31);
		add(panel);

		lblMedication = new JLabel();
		lblMedication.setBounds(80, 5, 70, 19);
		panel.add(lblMedication);
		lblMedication.setText("Asprin");
		lblMedication.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMedication.setForeground(new Color(198, 67, 37));

		statusLabel = new JLabel();
		statusLabel.setOpaque(false);
		statusLabel.setBounds(5, 5, 23, 22);
		panel.add(statusLabel);
		statusLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		statusLabel.setForeground(ColorConstants.DEF_COLOR);
		statusLabel.setBackground(Color.WHITE);
		statusLabel.setText("");

		userLabel = new JLabel();
		userLabel.setOpaque(false);
		userLabel.setText("");
		userLabel.setBounds(28, 5, 46, 22);
		userLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		userLabel.setForeground(new Color(198, 67, 37));
		panel.add(userLabel);

		final JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(164, 3, 35, 31);
		add(panel_1);

		lblDose = new JLabel();
		lblDose.setForeground(new Color(198, 67, 37));
		lblDose.setText("75 MG");
		lblDose.setBounds(0, 0, 35, 31);
		panel_1.add(lblDose);

		final JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(349, 3, 50, 31);
		add(panel_2);

		lblFrequency = new JLabel();
		lblFrequency.setBounds(0, 5, 45, 16);
		panel_2.add(lblFrequency);
		lblFrequency.setText("2x Daily");
		lblFrequency.setForeground(new Color(198, 67, 37));

		final JPanel panel_1_1 = new JPanel();
		panel_1_1.setOpaque(false);
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(200, 3, 148, 31);
		add(panel_1_1);

		lblRoute = new JLabel();
		lblRoute.setText("Route");
		lblRoute.setBounds(23, 5, 125, 16);
		lblRoute.setForeground(ColorConstants.MED_COLOR);
		lblRoute.setForeground(new Color(198, 67, 37));
		panel_1_1.add(lblRoute);

		txtCaution = new JTextArea();
		txtCaution.setBounds(10, 35, 389, 34);
		add(txtCaution);
		txtCaution.setEditable(false);
		txtCaution.setOpaque(false);
		txtCaution.setForeground(ColorConstants.MED_COLOR);
		txtCaution.setLineWrap(true);

	}

	public void doAccept() {

	}

	public void doDecline() {

	}

	public void updateLabels(MedicationView medView) {
		if (medView != null) {
			medicationView = medView;
			lblMedication.setText(medView.getMedication());
			lblDose.setText(medView.getDosage() + "");
			lblFrequency.setText(medView.getFrequency() + "");
			currentMedication = medView;
			lblDose.setText(medView.getDosage() + "");
			System.out.println("*********************************"
					+ medView.getDosage());
			lblRoute.setText(medView.getRoute());
			int userid = medView.getUserid();
			String username = null;
			try {

				username = MedrexClientManager.getInstance().getUserNameById(
						userid);

			} catch (RemoteException e) {
				e.printStackTrace();
			} catch (MedrexException e) {
				e.printStackTrace();
			}
			try {
				String coustionName = MedrexClientManager.getInstance()
						.getCautionaryName(medView.getMedicationId());
				// routeList = (List)
				// MedrexClientManager.getInstance().getPhysicianOrderMedication(medView.getFormId());
				txtCaution.setText(coustionName);
			} catch (RemoteException e) {
				e.printStackTrace();
			} catch (MedrexException e) {
				e.printStackTrace();
			}
			if (medView.getStatus() == 1) {

				statusLabel.setText("G");
				statusLabel.setIcon(new ImageIcon("img/tick.jpg"));
				userLabel.setText(username);

			}
			if (medView.getStatus() == 2) {
				statusLabel.setText("NG");
				statusLabel.setIcon(new ImageIcon("img/cross.jpg"));
			}
			if (medView.getStatus() == 3) {
				statusLabel.setText("PR");

			}
		}
	}

	public void UpdateMedicationStatus(String status) {
	}

	@Override
	protected void processMouseEvent(MouseEvent e) {
		super.processMouseEvent(e);
		switch (e.getID()) {
		case MouseEvent.MOUSE_ENTERED:
			// System.out.println("Entered");
			rollOver = (true && isEnabled());
			// Global.panelResidentMainAcutites.setImage(panel_6.getImage());
			repaint();

			break;
		case MouseEvent.MOUSE_EXITED:
			// System.out.println("Exited");
			// rollOver=false;
			rollOver = (false && isEnabled());
			// Global.panelResidentMainAcutites.setImage(null);
			repaint();
			break;
		case MouseEvent.MOUSE_PRESSED:
			// System.out.println("Pressed");
			pressed = true;
			break;
		case MouseEvent.MOUSE_RELEASED:
			// System.out.println("Released");
			if (pressed && rollOver) {
				super.processMouseEvent(new MouseEvent((Component) e
						.getSource(), MouseEvent.MOUSE_CLICKED, e.getWhen(), e
						.getModifiers(), e.getX(), e.getY(), 1, e
						.isPopupTrigger(), e.getButton()));
			}
			pressed = false;
			break;

		}
	}

	public String getMedicationType() {
		return medicationType;
	}

	public void setMedicationType(String medicationType) {
		this.medicationType = medicationType;
	}

	@Override
	public void paintComponent(Graphics g) {
		// System.out.println("paint called ; rollOver="+rollOver);
		if (!rollOver) {
			setLinearGradient(Color.WHITE, Color.WHITE, Direction.LEFT_TO_RIGHT);
			super.paintComponent(g);
		} else {
			setLinearGradient(color, ColorConstants.GradientBright,
					Direction.LEFT_TO_RIGHT);
			super.paintComponent(g);
		}

	}

	public static void main(String arg[]) {
		SwingUtils.wrapInDialog(new PanelMedication()).setVisible(true);
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

}
