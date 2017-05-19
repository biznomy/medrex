package medrex.client.census.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.constants.Global;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;

public class PanelCensusIn extends JPanel {

	private JxButton btnEr;
	private PanelCensusStatusResident panelCensusStatus;
	private JPanel censusControls;
	private JxButton btnAdmission;
	private JxButton btnDischarge;
	private JxButton btnSignOut;
	private JxButton btnSignIn;
	private JxButton btnHistory;
	private JLabel cnaNameLabel;

	private static final long serialVersionUID = 1L;

	private ResidentMain resident;

	// private PanelResidentInformation panelResiInfo;

	public PanelCensusIn() {
		super();
		setLayout(null);
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});
		setPreferredSize(new Dimension(868, 592));

		censusControls = new JPanel();
		censusControls.setOpaque(false);
		censusControls.setBounds(72, 10, 356, 410);
		censusControls.setLayout(null);
		add(censusControls);

		cnaNameLabel = new JLabel();
		cnaNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cnaNameLabel.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		cnaNameLabel.setFont(new Font("", Font.BOLD, 28));
		cnaNameLabel.setText("CHOOSE CENSUS");
		cnaNameLabel.setBounds(0, 0, 356, 52);
		censusControls.add(cnaNameLabel);

		btnAdmission = new JxButton();
		btnAdmission.setArc(0.2f);
		btnAdmission.setText("ADMISSION");
		btnAdmission.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent arg0) {
				if (btnAdmission.isEnabled()) {
					Global.currentCensusStatusId = 0;
					Global.panelCensusMain
							.changeCard(PanelCensusMain.ADMISSION);
				}
			}
		});
		btnAdmission.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		btnAdmission.setFont(GuiModes.DESIGNER_SCREEN.getControlFont()
				.deriveFont(16f));
		btnAdmission.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		btnAdmission.setBackground(Color.WHITE);
		btnAdmission.setBounds(0, 58, 356, 52);
		censusControls.add(btnAdmission);

		btnDischarge = new JxButton();
		btnDischarge.setArc(0.2f);
		btnDischarge.setText("DISCHARGE");
		btnDischarge.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (btnDischarge.isEnabled()) {
					Global.currentCensusStatusId = 0;
					Global.panelCensusMain
							.changeCard(PanelCensusMain.DISCHARGE);
				}
			}
		});
		btnDischarge.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		btnDischarge.setFont(GuiModes.DESIGNER_SCREEN.getControlFont()
				.deriveFont(16f));
		btnDischarge.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		btnDischarge.setBackground(Color.WHITE);
		btnDischarge.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		btnDischarge.setLayout(null);
		btnDischarge.setBounds(0, 116, 356, 52);
		censusControls.add(btnDischarge);

		btnSignIn = new JxButton();
		btnSignIn.setArc(0.2f);
		btnSignIn.setText("SIGN IN");
		btnSignIn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (btnSignIn.isEnabled()) {
					Global.currentCensusStatusId = 0;
					Global.panelCensusMain.changeCard(PanelCensusMain.SIGN_IN);
				}
			}
		});
		btnSignIn.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		btnSignIn.setFont(GuiModes.DESIGNER_SCREEN.getControlFont().deriveFont(
				16f));
		btnSignIn.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		btnSignIn.setBackground(Color.WHITE);
		btnSignIn.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		btnSignIn.setLayout(null);
		btnSignIn.setBounds(0, 174, 356, 52);
		censusControls.add(btnSignIn);

		btnSignOut = new JxButton();
		btnSignOut.setArc(0.2f);
		btnSignOut.setText("SIGN OUT");
		btnSignOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (btnSignOut.isEnabled()) {
					Global.currentCensusStatusId = 0;
					Global.panelCensusMain.changeCard(PanelCensusMain.SIGN_OUT);
				}
			}
		});
		btnSignOut.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		btnSignOut.setFont(GuiModes.DESIGNER_SCREEN.getControlFont()
				.deriveFont(16f));
		btnSignOut.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		btnSignOut.setBackground(Color.WHITE);
		btnSignOut.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		btnSignOut.setLayout(null);
		btnSignOut.setBounds(0, 232, 356, 52);
		censusControls.add(btnSignOut);

		btnEr = new JxButton();
		btnEr.setArc(0.2f);
		btnEr.setText("ER");
		btnEr.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (btnEr.isEnabled()) {
					Global.currentCensusStatusId = 0;
					Global.panelCensusMain.changeCard(PanelCensusMain.ER);
				}
			}
		});
		btnEr
				.setFont(GuiModes.DESIGNER_SCREEN.getControlFont().deriveFont(
						16f));
		btnEr.setBackground(Color.WHITE);
		btnEr.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		btnEr.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		btnEr.setLayout(null);
		btnEr.setBounds(0, 290, 356, 52);
		censusControls.add(btnEr);

		btnHistory = new JxButton();
		btnHistory.setArc(0.2f);
		btnHistory.setText("VIEW RESIDENT HISTORY");
		btnHistory.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (btnHistory.isEnabled()) {
					Global.currentCensusStatusId = 0;
					Global.panelCensusMain.changeCard(PanelCensusMain.HISTORY);
				}
			}
		});
		btnHistory.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		btnHistory.setFont(GuiModes.DESIGNER_SCREEN.getControlFont()
				.deriveFont(16f));
		btnHistory.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		btnHistory.setBackground(Color.WHITE);
		btnHistory.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		btnHistory.setLayout(null);
		btnHistory.setBounds(0, 348, 356, 52);
		// btnHistory.setEnabled(false);
		censusControls.add(btnHistory);

		panelCensusStatus = new PanelCensusStatusResident();
		panelCensusStatus.setResident(resident);
		panelCensusStatus.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		panelCensusStatus.setFont(GuiModes.DESIGNER_SCREEN.getControlFont()
				.deriveFont(16f).deriveFont(Font.BOLD));
		panelCensusStatus.setBounds(434, 158, 345, 188);
		add(panelCensusStatus);

		// panelResiInfo = new PanelResidentInformation();
		// panelResiInfo.setForeground(GuiModes.DESIGNER_SCREEN
		// .getControlForegroundColor());
		// panelResiInfo.setResident(resident);
		// panelResiInfo.setBounds(635, 61, 223, 491);
		// add(panelResiInfo);

	}

	protected void doUpdate() {
		int w = getWidth();
		int h = getHeight();
		float wF = ((float) w / 868);
		float hF = ((float) h / 592);
		// System.out.println("w:" + w + ", h:" + h + ", wF:" + wF + ", hF:" +
		// hF);
		censusControls.setLocation((int) (72 * wF), (int) (10 * hF));
		panelCensusStatus.setLocation((int) (434 * wF), (int) (158 * hF));
		// panelResiInfo.setLocation((int) (635 * wF), (int) (61 * hF));
		if (getTopLevelAncestor() != null) {
			getTopLevelAncestor().repaint();
		} else {
			this.repaint();
		}
		panelCensusStatus.doUpdate();

		updateStatus();
		btnAdmission.setText("");
		btnAdmission.setText("ADMISSION");
		panelCensusStatus.setResident(null);
		panelCensusStatus.setResident(resident);

		// panelResiInfo.setResident(null);
		// panelResiInfo.setResident(resident);
	}

	private void setButtons(boolean a, boolean d, boolean si, boolean so) {
		// System.out.println(a + ", " + d + ", " + si + ", " + so);
		btnAdmission.setEnabled(a);
		if (a)
			btnAdmission.setBackground(Color.WHITE);
		else
			btnAdmission.setBackground(Color.LIGHT_GRAY);
		btnDischarge.setEnabled(d);
		if (d)
			btnDischarge.setBackground(Color.WHITE);
		else
			btnDischarge.setBackground(Color.LIGHT_GRAY);
		btnSignIn.setEnabled(d && si);
		if (d && si)
			btnSignIn.setBackground(Color.WHITE);
		else
			btnSignIn.setBackground(Color.LIGHT_GRAY);
		btnSignOut.setEnabled(d && so);
		btnEr.setEnabled(d && so);
		if (d && so) {
			btnSignOut.setBackground(Color.WHITE);
			btnEr.setBackground(Color.WHITE);
		} else {
			btnSignOut.setBackground(Color.LIGHT_GRAY);
			btnEr.setBackground(Color.LIGHT_GRAY);
		}
	}

	public void updateStatus() {
		panelCensusStatus.doUpdate();
		// if (Global.currentCensusStatus != null) {
		setButtons(!panelCensusStatus.isAdmittedOrDischarged(),
				panelCensusStatus.isAdmittedOrDischarged(), !panelCensusStatus
						.isSignedInOrOut(), panelCensusStatus.isSignedInOrOut());
		// }
		// else {
		// setButtons(true, false, false, false);
		// }
	}

	// dev updated: doSignInOut is now obselete
	/*
	 * private void doSignInOut(boolean status) { CensusStatus ref = new
	 * CensusStatus(); ref.setResidentId(Global.currentResidenceKey); String
	 * typeName = ""; if(status) { typeName = "Sign In"; } else { typeName =
	 * "Sign Out"; } ref.setTypeName(typeName); ref.setAdministeredBy(0);
	 * ref.setDateAndTime(MedrexClientManager.getServerTime()); try {
	 * CensusStatusDAO.getInstance().insertOrUpdateCensusStatus(ref); } catch
	 * (Exception e) { } }
	 */
	/**
	 * @param resident
	 *            the resident to set
	 */
	public void setResident(ResidentMain resident) {
		this.resident = resident;
		doUpdate();
	}

	/**
	 * @return the resident
	 */
	public ResidentMain getResident() {
		return resident;
	}
}