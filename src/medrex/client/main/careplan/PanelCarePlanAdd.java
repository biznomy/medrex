package medrex.client.main.careplan;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import medrex.client.PanelImage;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.mds.ui.PanelMDSPage;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.carePlan.CarePlan;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;

public class PanelCarePlanAdd extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7674385027799502185L;
	private JComboBox cmbStatus;
	private JScrollPane scrollPane;

	private Color DEF_BACK_COL = new Color(24, 86, 110);
	private Color DEF_BUT_BACK = new Color(130, 163, 175);
	private Color DEF_BUT_FORE = new Color(8, 68, 95);

	private JComboBox cmbFormType;
	private PanelCarePlan1 panelCarePlan1;

	private int serial = 0;
	private Date datecreated;
	private PanelImage panel;

	public PanelCarePlanAdd() {
		super();

		setPreferredSize(new Dimension(1024, 700));
		setBackground(DEF_BACK_COL);
		setLayout(null);

		final JLabel typeOfFormLabel = new JLabel();
		typeOfFormLabel.setFont(new Font("", Font.BOLD, 12));
		typeOfFormLabel.setText("TYPE OF FORM");
		typeOfFormLabel.setBounds(453, 17, 61, 16);
		typeOfFormLabel.setVisible(false);
		add(typeOfFormLabel);

		cmbFormType = new JComboBox();
		cmbFormType.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				doFormChanged();
			}
		});

		cmbFormType.setBounds(520, 13, 83, 25);
		cmbFormType.setVisible(false);
		add(cmbFormType);

		final JxButton saveButton = new JxButton();
		saveButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		saveButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSave();
				Global.frameCarePlanAddNew.dispose();
			}
		});
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.setText("Save");
		saveButton.setBounds(28, 13, 106, 26);
		add(saveButton);

		final JxButton cancelButton = new JxButton();
		cancelButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		cancelButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.frameCarePlanAddNew.dispose();
			}
		});
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setText("Cancel");
		cancelButton.setBounds(140, 13, 106, 26);
		add(cancelButton);

		cmbStatus = new JComboBox();
		cmbStatus.setBounds(506, 49, 90, 25);
		cmbStatus.setVisible(false);
		add(cmbStatus);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 81, 975, 600);
		add(scrollPane);
		panelCarePlan1 = new PanelCarePlan1();

		panel = new PanelImage();
		panel.setArc(0.4f);
		panel.setCurvedView(true);
		panel.setBorder(PanelMDSPage.DEFAULT_BORDER);
		panel.setBounds(909, 5, 92, 74);
		add(panel);

		fillCombos();
		updateData();

	}

	public void fillCombos() {
		cmbFormType.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "Care Plan 1" }));

		cmbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Complete", "Incomplete" }));
	}

	public void updateData() {
		if (Global.currentCarePlanKey == 0) {
			cmbFormType.setEnabled(false);
			cmbFormType.setSelectedItem(Global.currentCarePalnForm);
			datecreated = MedrexClientManager.getServerTime();
		} else {
			CarePlan carePlan = null;
			try {
				carePlan = MedrexClientManager.getInstance().getCarePlan(
						Global.currentCarePlanKey);
				serial = carePlan.getSerial();
				datecreated = carePlan.getDateCreated();
				cmbFormType.setSelectedItem(carePlan.getFormType());

			} catch (Exception e) {
			}

		}
		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Care Plan 1")) {
			doFormChanged();
		}
		if (Global.currentResidenceKey != 0) {
			ResidentMain resi = null;
			try {
				resi = MedrexClientManager.getInstance().getResident(
						Global.currentResidenceKey);
			} catch (Exception e) {
				e.printStackTrace();
			}
			ImageIcon ico = resi.getImg();
			if (ico != null) {
				panel.setImage(ico.getImage());
			}
		}
	}

	public void doFormChanged() {

		if (((String) cmbFormType.getSelectedItem())
				.equalsIgnoreCase("Care Plan 1")) {

			if (Global.currentCarePlanKey != 0) {
				CarePlan carePlan = null;
				try {
					carePlan = MedrexClientManager.getInstance().getCarePlan(
							Global.currentCarePlanKey);
					Global.currentCarePalnRecordKey = carePlan.getFormId();
				} catch (Exception e) {
				}
			} else {
				Global.currentCarePalnRecordKey = 0;
			}
			scrollPane.setViewportView(panelCarePlan1);
			scrollPane.updateUI();
			Global.panelCarePaln1.updateData();
		}

	}

	public void doSave() {
		CarePlan carePlan = new CarePlan();
		carePlan.setFormId(0);

		if (cmbFormType.getSelectedItem().equals("Care Plan 1")) {
			Global.panelCarePaln1.doSave();
		}
		if (serial != 0) {
			carePlan.setSerial(serial);
		}

		carePlan.setResidentId(Global.currentResidenceKey);
		carePlan.setFormType((String) cmbFormType.getSelectedItem());
		carePlan.setFormId(Global.currentCarePalnRecordKey);
		carePlan.setUser(Global.currentLoggedInUserName);

		carePlan.setDateCreated(Global.currentCarePlanDate);
		carePlan.setNotes("note");
		carePlan.setDateCreated(datecreated);
		carePlan.setDateModified(MedrexClientManager.getServerTime());
		try {
			Global.currentCarePlanKey = MedrexClientManager.getInstance()
					.insertOrUpdateCarePlan(carePlan);
		} catch (Exception e) {
		}

	}

}
