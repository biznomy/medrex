package medrex.client.main.resident.census;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.census.ui.PanelCensusAdmission;
import medrex.client.census.ui.PanelCensusDischarge;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;

import com.sX.swing.JxButton;
import com.sX.swing.JxTable;

public class PanelCensusResident extends JPanel {

	private PanelCensusStatusResident panelCensusStatusResident;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Color DEF_COLOR = new Color(49, 107, 127);
	private JxTable table;
	private CensusJTable CensusTable;

	JxButton btnAdmission;
	JxButton btnDischarge;
	JxButton btnSignIn;
	JxButton btnSignOut;
	JxButton btnOther;

	/**
	 * Create the panel
	 */
	public PanelCensusResident() {
		super();
		// Global.panelCensusResident = this;
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(698, 396));
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		add(panel, BorderLayout.CENTER);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(DEF_COLOR, 1, false));
		scrollPane.setBounds(10, 10, 678, 216);
		panel.add(scrollPane);

		table = new JxTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (e.getClickCount() > 1) {

					int id = new Integer((String) CensusTable.getValueAt(table
							.getSelectedRow(), 6)).intValue();
					String type = (String) CensusTable.getValueAt(table
							.getSelectedRow(), 7);
					Global.currentCensusStatusId = id;
					// FrameCensusNotes frameCensusNotes = new
					// FrameCensusNotes();
					// frameCensusNotes.setVisible(true);

					if (type.equalsIgnoreCase("Admission")) {
						medrex.client.census.ui.PanelCensusAdmission panelCensusAdmission = new PanelCensusAdmission(
								false);
						panelCensusAdmission.updateData();
						panelCensusAdmission.setBounds(0, 0, 800, 600);
						medrex.client.utils.SwingUtils
								.openInDialog(panelCensusAdmission);

					} else if (type.equalsIgnoreCase("Discharge")) {
						medrex.client.census.ui.PanelCensusDischarge panelCensusDischarge = new PanelCensusDischarge(
								false);
						panelCensusDischarge.updateData();
						panelCensusDischarge.setBounds(0, 0, 800, 600);
						medrex.client.utils.SwingUtils
								.openInDialog(panelCensusDischarge);

					} else if (type.equalsIgnoreCase("Sign Out")) {
						medrex.client.census.ui.PanelCensusSignOut panelCensusSignOut = new medrex.client.census.ui.PanelCensusSignOut(
								false);
						panelCensusSignOut.updateData();
						panelCensusSignOut.setBounds(0, 0, 800, 600);
						medrex.client.utils.SwingUtils
								.openInDialog(panelCensusSignOut);
					} else if (type.equalsIgnoreCase("Sign In")) {
						medrex.client.census.ui.PanelCensusSignIn panelCensusSignIn = new medrex.client.census.ui.PanelCensusSignIn(
								false);
						panelCensusSignIn.updateData();
						panelCensusSignIn.setBounds(0, 0, 800, 600);
						medrex.client.utils.SwingUtils
								.openInDialog(panelCensusSignIn);
						// } else if (type.equalsIgnoreCase("Other")) {
						// medrex.client.census.ui.PanelCensusHospital
						// panelCensusHospital = new
						// medrex.client.census.ui.PanelCensusHospital(false);
						// panelCensusHospital.updateData();
						// panelCensusHospital.setBounds(0, 0, 800, 600);
						// medrex.client.utils.SwingUtils
						// .openInDialog(panelCensusHospital);
					}

					updateCensusJTable();
				}
			}
		});
		CensusTable = new CensusJTable();
		table.setModel(CensusTable);

		scrollPane.setViewportView(table);

		panelCensusStatusResident = new PanelCensusStatusResident();
		panelCensusStatusResident.setForeground(DEF_COLOR);
		panelCensusStatusResident.setHorizontalAlignment(SwingConstants.RIGHT);
		panelCensusStatusResident.repaint();
		panelCensusStatusResident.setBackground(Color.WHITE);
		panelCensusStatusResident.setBounds(10, 232, 244, 145);
		panel.add(panelCensusStatusResident);

		btnAdmission = new JxButton();
		btnAdmission.setArc(0.4f);
		btnAdmission.setBackground(Color.WHITE);
		btnAdmission.setForeground(DEF_COLOR);
		btnAdmission.setBorder(new LineBorder(new Color(180, 188, 193), 1,
				false));
		btnAdmission.setFont(new Font("", Font.BOLD, 12));
		btnAdmission.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.currentCensusStatusId = 0;
				// PanelCountAuditFloorWise p = new PanelCountAuditFloorWise();
				// medrex.client.utils.SwingUtils.openInDialogforJPanel(p);

				medrex.client.census.ui.PanelCensusAdmission panelCensusAdmission = new PanelCensusAdmission(
						false);
				panelCensusAdmission.setBounds(0, 0, 800, 600);
				medrex.client.utils.SwingUtils
						.openInDialog(panelCensusAdmission);

				// Global.frameCensusForms = new FrameCensusForms();
				// medrex.client.utils.SwingUtils.center(Global.frameCensusForms);
				// Global.frameCensusForms.showAdmission();
				// Global.frameCensusForms.setModal(true);
				// Global.frameCensusForms.setVisible(true);
				//			
				updateCensusJTable();
			}
		});
		btnAdmission.setText("Admission");
		btnAdmission.setBounds(323, 232, 111, 26);
		panel.add(btnAdmission);

		btnDischarge = new JxButton();
		btnDischarge.setArc(0.4f);
		btnDischarge.setBackground(Color.WHITE);
		btnDischarge.setForeground(DEF_COLOR);
		btnDischarge.setBorder(new LineBorder(new Color(180, 188, 193), 1,
				false));
		btnDischarge.setFont(new Font("", Font.BOLD, 12));

		btnDischarge.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.currentCensusStatusId = 0;
				// PanelCountAuditFloorWise p = new PanelCountAuditFloorWise();
				// medrex.client.utils.SwingUtils.openInDialogforJPanel(p);

				medrex.client.census.ui.PanelCensusDischarge panelCensusDischarge = new PanelCensusDischarge(
						false);
				panelCensusDischarge.setBounds(0, 0, 800, 600);
				medrex.client.utils.SwingUtils
						.openInDialog(panelCensusDischarge);

				// Global.frameCensusForms = new FrameCensusForms();
				// medrex.client.utils.SwingUtils.center(Global.frameCensusForms);
				// Global.frameCensusForms.showAdmission();
				// Global.frameCensusForms.setModal(true);
				// Global.frameCensusForms.setVisible(true);
				updateCensusJTable();
			}
		});
		btnDischarge.setText("Discharge");
		btnDischarge.setBounds(323, 264, 111, 26);
		panel.add(btnDischarge);

		btnSignIn = new JxButton();
		btnSignIn.setArc(0.4f);
		btnSignIn.setBackground(Color.WHITE);
		btnSignIn.setForeground(DEF_COLOR);
		btnSignIn.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnSignIn.setFont(new Font("", Font.BOLD, 12));
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.currentCensusStatusId = 0;
				// PanelCountAuditFloorWise p = new PanelCountAuditFloorWise();
				// medrex.client.utils.SwingUtils.openInDialogforJPanel(p);
				medrex.client.census.ui.PanelCensusSignIn panelCensusSignIn = new medrex.client.census.ui.PanelCensusSignIn(
						false);
				panelCensusSignIn.updateData();
				panelCensusSignIn.setBounds(0, 0, 800, 600);
				medrex.client.utils.SwingUtils.openInDialog(panelCensusSignIn);

				updateCensusJTable();
			}
		});
		btnSignIn.setText("Sign In");
		btnSignIn.setBounds(323, 296, 111, 26);
		panel.add(btnSignIn);

		btnSignOut = new JxButton();
		btnSignOut.setArc(0.4f);
		btnSignOut.setBackground(Color.WHITE);
		btnSignOut.setForeground(DEF_COLOR);
		btnSignOut
				.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnSignOut.setFont(new Font("", Font.BOLD, 12));
		btnSignOut.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				System.out.println("Hello from sign out");
				Global.currentCensusStatusId = 0;
				// PanelCountAuditFloorWise p = new PanelCountAuditFloorWise();
				// medrex.client.utils.SwingUtils.openInDialogforJPanel(p);
				medrex.client.census.ui.PanelCensusSignOut panelCensusSignOut = new medrex.client.census.ui.PanelCensusSignOut(
						false);
				panelCensusSignOut.updateData();
				panelCensusSignOut.setBounds(0, 0, 800, 600);
				medrex.client.utils.SwingUtils.openInDialog(panelCensusSignOut);
				updateCensusJTable();
			}
		});
		btnSignOut.setText("Sign Out");
		btnSignOut.setBounds(323, 330, 111, 26);
		panel.add(btnSignOut);

		btnOther = new JxButton();
		btnOther.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				System.out.println("Hello from");
				Global.currentCensusStatusId = 0;
				medrex.client.census.ui.PanelCensusHospital panelCensusHospital = new medrex.client.census.ui.PanelCensusHospital(
						false);
				panelCensusHospital.updateData();
				panelCensusHospital.setBounds(0, 0, 550, 130);
				medrex.client.utils.SwingUtils
						.openInDialog(panelCensusHospital);
				updateCensusJTable();
			}
		});
		btnOther.setText("Discharge from Hospital");
		btnOther.setArc(0.4f);
		btnOther.setBackground(Color.WHITE);
		btnOther.setForeground(DEF_COLOR);
		btnOther.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnOther.setBounds(323, 362, 178, 26);
		btnOther.setFont(new Font("", Font.BOLD, 12));
		panel.add(btnOther);

		doUpdate();
	}

	public void doUpdate() {
		updateCensusJTable();

		panelCensusStatusResident.repaint();

	}

	private void setButtons(boolean a, boolean d, boolean si, boolean so,
			boolean fromH) {
		// System.out.println(a + ", " + d + ", " + si + ", " + so);
		btnAdmission.setEnabled(a);

		btnDischarge.setEnabled(d);
		btnSignIn.setEnabled(d && si);

		btnSignOut.setEnabled(d && so);
		btnOther.setEnabled(fromH);
	}

	public void updateButtons() {
		setButtons(!panelCensusStatusResident.isAdmittedOrDischarged(),
				panelCensusStatusResident.isAdmittedOrDischarged(),
				!panelCensusStatusResident.isSignedInOrOut(),
				panelCensusStatusResident.isSignedInOrOut(),
				panelCensusStatusResident.isDischargedToHospital());
	}

	public void updateCensusJTable() {
		panelCensusStatusResident.doUpdate();
		updateButtons();
		List CensusRecords = new ArrayList();
		if (Global.currentResidenceKey != 0) {
			try {
				CensusRecords = MedrexClientManager.getInstance()
						.getCensusStatuss("desc", Global.currentResidenceKey);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		CensusTable.setNewList(CensusRecords);
		CensusTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();

	}
	// public static void main(String[] a) {
	// SwingUtils.wrapInFrame(new PanelCensusResident()).setVisible(true);
	// }
}