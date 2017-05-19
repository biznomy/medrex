package medrex.client.census.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.PanelResidentInformation;
import medrex.client.utils.FieldValidation;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.census.AdmissionFromSubHead;
import medrex.commons.vo.census.AdmissionTransportation;
import medrex.commons.vo.census.CensusStatus;

import org.jdesktop.jxlayer.JXLayer;
import org.jdesktop.jxlayer.plaf.effect.BufferedImageOpEffect;
import org.jdesktop.jxlayer.plaf.ext.LockableUI;

import com.jgoodies.validation.ValidationResult;
import com.jhlabs.image.OpacityFilter;
import com.sX.swing.AbstractBindableListModel;
import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTextField;
import com.toedter.calendar.JDateChooser;

public class PanelCensusDischarge extends PopUpView {
	private JLabel dateLabel_Old;
	private JLabel dateLabel_New;
	private JToggleButton btnExpired;
	private JToggleButton btnOutOfPass;
	private ButtonGroup bgDischargeType = new ButtonGroup();
	private JToggleButton btnEr;
	private JToggleButton btnDischarge;
	private JxTextField txtDischargedToName;
	private JLabel dateLabel_2;
	private JxComboBox cmbAmPm;
	private JxComboBox cmbMinutes;
	private JxComboBox cmbHours;
	private JLabel dateLabel_1;
	private JDateChooser dcCurrentDate;
	private JLabel dateLabel;
	private JxPanel panelContent;
	private Date currentDate;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel panelMain;
	private JPanel panelSubMain;
	private PanelResidentInformation panelRight;
	private JPanel panelFooter;
	private JxButton btnCancel;
	private JxButton btnSave;
	private JLabel lblTitle;

	private JxButton btnNotes;
	private JRadioButton rbHospital;
	private JRadioButton rbHome;
	private JRadioButton rbOther;
	private JRadioButton rbCommunity;
	private ButtonGroup bgTo;
	private ChangeListener fromChangeListener;
	private JLabel dateLabel_4;
	private JLabel dateLabel_3;
	private JxTextField txtTransportation;
	private JTextArea txtNotes;
	private LockableUI layerUI;
	private JXLayer<JPanel> layerContent;
	private final boolean isMain;
	private JLabel dateLabel_Title;

	public PanelCensusDischarge(boolean isMain) {
		super();
		this.isMain = isMain;
		// setLayout(new BorderLayout());
		setLayout(null);
		setBorder(new EmptyBorder(10, 72, 75, 5));
		currentDate = MedrexClientManager.getServerTime();
		setBackground(GuiModes.CHANGE_SCREEN.getDefaultBackgroundColor());
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});
		setPreferredSize(new Dimension(868, 516));

		panelMain = new JPanel();
		panelMain.setBounds(72, 10, 790, 496);
		// final BorderLayout borderLayout = new BorderLayout();
		// borderLayout.setVgap(10);
		// borderLayout.setHgap(10);
		// panelMain.setLayout(borderLayout);
		panelMain.setLayout(null);
		panelMain.setOpaque(false);
		add(panelMain);

		lblTitle = new JLabel();
		// lblTitle.setPreferredSize(new Dimension(791, 35));
		lblTitle.setBounds(0, 0, 791, 35);
		lblTitle.setText("Fill in Discharge Details:");
		lblTitle.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont()
				.deriveFont(28f));
		lblTitle.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		panelMain.add(lblTitle, BorderLayout.NORTH);

		panelSubMain = new JPanel();
		panelSubMain.setLayout(null);
		panelSubMain.setOpaque(false);
		// panelSubMain.setPreferredSize(new Dimension(628, 108));
		panelSubMain.setBounds(0, 45, 606, 394);
		panelMain.add(panelSubMain, BorderLayout.CENTER);

		// setSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
		// setPreferredSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
		// setSize(500,360);
		// panelMain.setBounds(SwingUtils.centerRectangle(this.getBounds(),
		// panelMain.getBounds()));

		panelRight = new PanelResidentInformation();
		if (isMain) {
			panelRight.setResident(Global.panelCensusMain.getResident());
			panelRight.setForeground(GuiModes.CHANGE_SCREEN
					.getControlForegroundColor());
			panelRight.setOpaque(false);
			// panelRight.setPreferredSize(new Dimension(175, 275));
			panelRight.setBounds(610, 45, 175, 394);
		}
		panelMain.add(panelRight, BorderLayout.EAST);

		panelFooter = new JPanel();
		panelFooter.setLayout(new BorderLayout());
		panelFooter.setOpaque(false);
		// panelFooter.setPreferredSize(new Dimension(0, 103));
		panelFooter.setBounds(0, 445, 791, 51);
		panelMain.add(panelFooter, BorderLayout.SOUTH);

		final JPanel panelFooterLeft = new JPanel();
		panelFooterLeft.setOpaque(false);
		final FlowLayout flowLayout_1 = new FlowLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panelFooterLeft.setLayout(flowLayout_1);
		panelFooter.add(panelFooterLeft);

		final JPanel panelKeyboard = new JPanel();
		panelKeyboard.setVisible(false);
		panelKeyboard.setOpaque(false);
		panelKeyboard.setLayout(null);
		panelKeyboard.setBounds(10, 329, 187, 93);
		panelKeyboard.setPreferredSize(new Dimension(187, 93));
		panelFooterLeft.add(panelKeyboard);

		final JLabel label = new JLabel();
		label.setIcon(new ImageIcon("img\\keyboard1.gif"));
		label.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		label.setText("");
		label.setBounds(0, 0, 187, 62);
		panelKeyboard.add(label);

		final JLabel clickLabel = new JLabel();
		clickLabel.setHorizontalAlignment(SwingConstants.CENTER);
		clickLabel.setFont(new Font("", Font.BOLD, 14));
		clickLabel.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		clickLabel.setText("Click here for Keyboard");
		clickLabel.setBounds(0, 68, 187, 25);
		panelKeyboard.add(clickLabel);

		final JPanel panelFooterRight = new JPanel();
		panelFooterRight.setOpaque(false);
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setHgap(10);
		flowLayout.setVgap(10);
		panelFooterRight.setLayout(flowLayout);
		panelFooter.add(panelFooterRight);

		btnSave = new JxButton();
		btnSave.setArc(0.2f);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (doValidate()) {
					if (doSave()) {
						// Global.frameCensusFormsNew.showCensusStatus();
						if (PanelCensusDischarge.this.isMain) {
							Global.panelCensusMain
									.changeCard(PanelCensusMain.DEFAULT);
						} else {
							doClose();
						}
					}
				}
			}
		});
		btnSave.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		btnSave.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		btnSave.setHorizontalAlignment(SwingConstants.CENTER);
		btnSave.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		btnSave.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		btnSave.setText("SAVE");
		btnSave.setPreferredSize(new Dimension(100, 31));
		// btnSave.setBounds(99, 329, 200, 31);
		panelFooterRight.add(btnSave);

		btnNotes = new JxButton();
		btnNotes.setArc(0.2f);
		btnNotes.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		btnNotes.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		btnNotes.setHorizontalAlignment(SwingConstants.CENTER);
		btnNotes.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		btnNotes.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		btnNotes.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameCensusNotes frameCensusNotes = new FrameCensusNotes();
				SwingUtils.center(frameCensusNotes);
				frameCensusNotes.setVisible(true);
			}
		});
		btnNotes.setText("NOTES");
		btnNotes.setPreferredSize(new Dimension(100, 31));
		btnNotes.setVisible(false);
		// btnNotes.setBounds(603, 505, 100, 31);
		panelFooterRight.add(btnNotes);
		btnCancel = new JxButton();
		btnCancel.setArc(0.2f);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				// Global.frameCensusFormsNew.showCensusStatus();
				if (PanelCensusDischarge.this.isMain) {
					if (!layerUI.isLocked()) {
						Global.panelCensusMain
								.changeCard(PanelCensusMain.DEFAULT);
					} else {
						Global.panelCensusMain
								.changeCard(PanelCensusMain.HISTORY);
					}
				} else {
					doClose();
				}
			}
		});
		btnCancel.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		btnCancel.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		btnCancel.setHorizontalAlignment(SwingConstants.CENTER);
		btnCancel.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		btnCancel.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		btnCancel.setText("CANCEL");
		btnCancel.setPreferredSize(new Dimension(100, 31));
		// btnCancel.setBounds(517, 329, 200, 31);
		panelFooterRight.add(btnCancel);

		/*
		 * btnClose = new JxButton(); btnClose.setArc(0.2f);
		 * btnClose.setBackground
		 * (GuiModes.CHANGE_SCREEN.getControlBackgroundColor());
		 * btnClose.setForeground
		 * (GuiModes.CHANGE_SCREEN.getControlForegroundColor());
		 * btnClose.setHorizontalAlignment(SwingConstants.CENTER);
		 * btnClose.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		 * btnClose.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		 * btnClose.addActionListener(new ActionListener() { public void
		 * actionPerformed(final ActionEvent e) { System.exit(0); } });
		 * btnClose.setText("CLOSE"); btnClose.setPreferredSize(new
		 * Dimension(100, 31)); // btnClose.setBounds(709, 505, 100, 31);
		 * panelFooterRight.add(btnClose);
		 * 
		 * btnPrevious = new JxButton(); btnPrevious.setArc(0.2f);
		 * btnPrevious.setBackground
		 * (GuiModes.CHANGE_SCREEN.getControlBackgroundColor());
		 * btnPrevious.setForeground
		 * (GuiModes.CHANGE_SCREEN.getControlForegroundColor());
		 * btnPrevious.setHorizontalAlignment(SwingConstants.CENTER);
		 * btnPrevious.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		 * btnPrevious.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		 * btnPrevious.addActionListener(new ActionListener() { public void
		 * actionPerformed(final ActionEvent e) { //
		 * Global.frameCensusFormsNew.showCensusStatus();
		 * Global.panelCensusMain.changeCard(PanelCountAuditMain.DEFAULT); } });
		 * btnPrevious.setText("BACK"); btnPrevious.setPreferredSize(new
		 * Dimension(100, 31)); // btnPrevious.setBounds(603, 505, 100, 31);
		 * panelFooterRight.add(btnPrevious);
		 */

		panelContent = new JxPanel();
		panelContent.setBounds(0, 0, 596, 306);
		// panelContent.setBounds(0, 0, 596, 309);
		panelContent.setPreferredSize(new Dimension(528, 143));
		panelContent.setBackground(GuiModes.CHANGE_SCREEN
				.getDefaultBackgroundColor());
		panelContent.setBorder(new LineBorder(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor(), 2, false));
		panelContent.setArc(1.0f);
		panelContent.setOpaque(false);
		panelContent.setLayout(null);
		panelContent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				panelContent.requestFocus();
			}
		});
		// panelSubMain.add(panelContent);

		layerUI = new LockableUI(new BufferedImageOpEffect(new OpacityFilter()));
		layerContent = new JXLayer<JPanel>(panelContent);
		layerContent.setUI(layerUI);
		layerContent.setLayout(null);
		layerContent.setBounds(0, 0, 596, 309);
		panelSubMain.add(layerContent);

		if (Global.currentLoggedInUserType.equals("Administrator")) {
			dateLabel = new JLabel();
			dateLabel.setBounds(20, 275, 48, 31);
			dateLabel.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
			dateLabel.setForeground(GuiModes.CHANGE_SCREEN
					.getDefaultForegroundColor());
			dateLabel.setText("Date");
			panelContent.add(dateLabel);

			dcCurrentDate = new JDateChooser();
			dcCurrentDate.setDateFormatString("MM/dd/yyyy");
			dcCurrentDate.setBounds(74, 275, 150, 31);
			dcCurrentDate.setBackground(GuiModes.CHANGE_SCREEN
					.getControlBackgroundColor());
			dcCurrentDate.setForeground(GuiModes.CHANGE_SCREEN
					.getControlForegroundColor());
			dcCurrentDate.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
			dcCurrentDate.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
			dcCurrentDate.setDate(currentDate);
			panelContent.add(dcCurrentDate);

			dateLabel_Old = new JLabel();
			dateLabel_Old.setBounds(241, 275, 48, 31);
			dateLabel_Old.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
			dateLabel_Old.setForeground(GuiModes.CHANGE_SCREEN
					.getDefaultForegroundColor());
			dateLabel_Old.setText("Time");
			panelContent.add(dateLabel_Old);

			cmbHours = new JxComboBox();
			cmbHours.setBounds(293, 275, 63, 31);
			cmbHours.setArc(0.2f);
			cmbHours.setBackground(GuiModes.CHANGE_SCREEN
					.getControlBackgroundColor());
			cmbHours.setForeground(GuiModes.CHANGE_SCREEN
					.getControlForegroundColor());
			cmbHours.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
			cmbHours.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
			cmbHours.setModel(new DefaultComboBoxModel(new String[] { "01",
					"02", "03", "04", "05", "06", "07", "08", "09", "10", "11",
					"12" }));
			SimpleDateFormat df = new SimpleDateFormat("hh");
			cmbHours.setSelectedItem(df.format(currentDate));
			panelContent.add(cmbHours);

			cmbMinutes = new JxComboBox();
			cmbMinutes.setBounds(374, 273, 63, 31);
			cmbMinutes.setArc(0.2f);
			cmbMinutes.setModel(new DefaultComboBoxModel(new String[] { "00",
					"01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
					"11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
					"21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
					"31", "32", "33", "34", "35", "36", "37", "38", "39", "40",
					"41", "42", "43", "44", "45", "46", "47", "48", "49", "50",
					"51", "52", "53", "54", "55", "56", "57", "58", "59" }));
			cmbMinutes.setBackground(GuiModes.CHANGE_SCREEN
					.getControlBackgroundColor());
			cmbMinutes.setForeground(GuiModes.CHANGE_SCREEN
					.getControlForegroundColor());
			cmbMinutes.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
			cmbMinutes.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
			df = new SimpleDateFormat("mm");
			cmbMinutes.setSelectedItem(df.format(currentDate));
			panelContent.add(cmbMinutes);

			final JLabel label_2 = new JLabel();
			label_2.setBounds(362, 275, 6, 31);
			label_2.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
			label_2.setText(":");
			panelContent.add(label_2);

			cmbAmPm = new JxComboBox();
			cmbAmPm.setBounds(449, 275, 63, 31);
			cmbAmPm.setArc(0.2f);
			cmbAmPm.setBackground(GuiModes.CHANGE_SCREEN
					.getControlBackgroundColor());
			cmbAmPm.setForeground(GuiModes.CHANGE_SCREEN
					.getControlForegroundColor());
			cmbAmPm.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
			cmbAmPm.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
			cmbAmPm.setModel(new DefaultComboBoxModel(
					new String[] { "AM", "PM" }));
			df = new SimpleDateFormat("a");
			cmbAmPm.setSelectedItem(df.format(currentDate));
			panelContent.add(cmbAmPm);

		}

		dateLabel_2 = new JLabel();
		dateLabel_2.setBounds(20, 10, 48, 31);
		dateLabel_2.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		dateLabel_2.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		dateLabel_2.setText("To");
		panelContent.add(dateLabel_2);

		dateLabel_4 = new JLabel();
		dateLabel_4.setBounds(20, 45, 48, 31);
		dateLabel_4.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		dateLabel_4.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		dateLabel_4.setText("Name");
		panelContent.add(dateLabel_4);

		txtDischargedToName = new JxTextField();
		txtDischargedToName.setBounds(74, 45, 512, 31);
		txtDischargedToName.setArc(0.2f);
		txtDischargedToName.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		txtDischargedToName.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		txtDischargedToName.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		txtDischargedToName
				.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtDischargedToName
				.setModel(new AbstractBindableListModel<String, AdmissionFromSubHead>() {
					private int getHeadId() {
						return SwingUtils.getSelectedButton(bgTo);
					}

					@Override
					public void addElement(String key) {
						int headId = getHeadId();
						AdmissionFromSubHead ref = new AdmissionFromSubHead();
						ref.setName(key);
						ref.setHeadId(headId);
						if (headId != 0) {
							try {
								List tmpList = MedrexClientManager
										.getInstance()
										.getAdmissionFromSubHeads(headId, key);
								if (tmpList == null || tmpList.size() == 0) {
									MedrexClientManager
											.getInstance()
											.insertOrUpdateAdmissionFromSubHead(
													ref);
								}
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					}

					@Override
					public List<AdmissionFromSubHead> getValues(String key) {
						this.records = null;
						int headId = getHeadId();
						if (headId != 0) {
							try {
								this.records = MedrexClientManager
										.getInstance()
										.getAdmissionFromSubHeads(headId,
												key + "%");
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
						return this.records;
					}

					@Override
					public String toString(AdmissionFromSubHead val) {
						return val.getName();
					}
				});

		panelContent.add(txtDischargedToName);

		fromChangeListener = new ChangeListener() {
			public void stateChanged(final ChangeEvent arg0) {
				if (SwingUtils.getSelectedButton(bgTo) != 0
						&& Global.currentCensusStatusId == 0) {
					txtDischargedToName.setText("");
					txtDischargedToName.setEnabled(true);
				} else {
					txtDischargedToName.setEnabled(false);
				}
			}
		};

		dateLabel_3 = new JLabel();
		dateLabel_3.setBounds(20, 90, 130, 31);
		dateLabel_3.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		dateLabel_3.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		dateLabel_3.setText("Transportation");

		panelContent.add(dateLabel_3);

		txtTransportation = new JxTextField();
		txtTransportation.setBounds(156, 90, 430, 31);
		txtTransportation.setArc(0.2f);
		txtTransportation.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		txtTransportation.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		txtTransportation.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		txtTransportation.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtTransportation
				.setModel(new AbstractBindableListModel<String, AdmissionTransportation>() {
					@Override
					public void addElement(String key) {
						AdmissionTransportation ref = new AdmissionTransportation();
						ref.setName(key);
						try {
							List tmpList = MedrexClientManager.getInstance()
									.getAdmissionTransportations(key);
							if (tmpList == null || tmpList.size() == 0) {
								MedrexClientManager.getInstance()
										.insertOrUpdateAdmissionTransportation(
												ref);
							}
						} catch (Exception e) {
							e.printStackTrace();
						}
					}

					@Override
					public List<AdmissionTransportation> getValues(String key) {
						this.records = null;
						try {
							this.records = MedrexClientManager.getInstance()
									.getAdmissionTransportations(key + "%");
						} catch (Exception e) {
							e.printStackTrace();
						}
						return this.records;
					}

					@Override
					public String toString(AdmissionTransportation val) {
						return val.getName();
					}
				});
		panelContent.add(txtTransportation);

		bgTo = new ButtonGroup();

		rbHospital = new JRadioButton();
		rbHospital.addChangeListener(fromChangeListener);
		bgTo.add(rbHospital);
		rbHospital.setActionCommand("1");
		rbHospital.setContentAreaFilled(false);
		rbHospital.setFocusPainted(false);
		rbHospital.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		rbHospital.setOpaque(false);
		rbHospital.setText("Hospital");
		rbHospital.setFont(new Font("Dialog", Font.PLAIN, 18));
		rbHospital.setBounds(74, 10, 95, 24);
		panelContent.add(rbHospital);

		rbHome = new JRadioButton();
		rbHome.addChangeListener(new ChangeListener() {
			public void stateChanged(final ChangeEvent evt) {
				if (rbHome.isSelected()) {
					txtDischargedToName.setText("Residents Home");
					txtDischargedToName.setEnabled(false);
				} else {
					txtDischargedToName.setText("");
					txtDischargedToName.setEnabled(true);
				}
			}
		});
		rbHome.addChangeListener(fromChangeListener);
		bgTo.add(rbHome);
		rbHome.setHideActionText(false);
		rbHome.setActionCommand("2");
		rbHome.setContentAreaFilled(false);
		rbHome.setFocusPainted(false);
		rbHome
				.setForeground(GuiModes.CHANGE_SCREEN
						.getDefaultForegroundColor());
		rbHome.setOpaque(false);
		rbHome.setText("Home");
		rbHome.setFont(new Font("Dialog", Font.PLAIN, 18));
		rbHome.setBounds(175, 10, 74, 24);
		panelContent.add(rbHome);

		rbOther = new JRadioButton();
		rbOther.addChangeListener(fromChangeListener);
		bgTo.add(rbOther);
		rbOther.setActionCommand("3");
		rbOther.setContentAreaFilled(false);
		rbOther.setFocusPainted(false);
		rbOther.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		rbOther.setOpaque(false);
		rbOther.setText("Other Facility");
		rbOther.setFont(new Font("Dialog", Font.PLAIN, 18));
		rbOther.setBounds(255, 10, 150, 24);
		panelContent.add(rbOther);

		rbCommunity = new JRadioButton();
		rbCommunity.addChangeListener(fromChangeListener);
		bgTo.add(rbCommunity);
		rbCommunity.setActionCommand("4");
		rbCommunity.setContentAreaFilled(false);
		rbCommunity.setFocusPainted(false);
		rbCommunity.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		rbCommunity.setOpaque(false);
		rbCommunity.setText("Other");
		rbCommunity.setFont(new Font("Dialog", Font.PLAIN, 18));
		rbCommunity.setBounds(411, 10, 139, 24);
		panelContent.add(rbCommunity);

		btnDischarge = new JToggleButton();
		btnDischarge.setBorder(new CompoundBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder(), new EmptyBorder(0, 10, 0, 0)));
		btnDischarge.setHideActionText(false);
		btnDischarge.setContentAreaFilled(true);
		bgDischargeType.add(btnDischarge);
		btnDischarge.setActionCommand("1");
		btnDischarge.setBounds(38, 200, 164, 31);
		btnDischarge.setIconTextGap(10);
		btnDischarge.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnDischarge.setHorizontalAlignment(SwingConstants.LEFT);
		btnDischarge.setText("DISCHARGE");
		btnDischarge.setBackground(GuiModes.CHANGE_SCREEN
				.getDefaultBackgroundColor());
		btnDischarge.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		btnDischarge.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		btnDischarge.setSelectedIcon(new ImageIcon("img/tick_mark.png"));
		btnDischarge.setIcon(new ImageIcon("img/blank.png"));
		panelContent.add(btnDischarge);

		btnEr = new JToggleButton();
		bgDischargeType.add(btnEr);
		btnEr.setActionCommand("2");
		btnEr.setBounds(312, 200, 129, 31);
		btnEr.setIconTextGap(10);
		btnEr.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnEr.setHorizontalAlignment(SwingConstants.LEFT);
		btnEr.setText("E R");
		btnEr.setBorder(new CompoundBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder(), new EmptyBorder(0, 10, 0, 0)));
		btnEr.setBackground(GuiModes.CHANGE_SCREEN.getDefaultBackgroundColor());
		btnEr.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		btnEr.setForeground(GuiModes.CHANGE_SCREEN.getDefaultForegroundColor());
		btnEr.setSelectedIcon(new ImageIcon("img/tick_mark.png"));
		btnEr.setIcon(new ImageIcon("img/blank.png"));
		btnEr.setVisible(false);
		panelContent.add(btnEr);

		btnOutOfPass = new JToggleButton();
		bgDischargeType.add(btnOutOfPass);
		btnOutOfPass.setActionCommand("3");
		btnOutOfPass.setBounds(38, 240, 165, 31);
		btnOutOfPass.setIconTextGap(10);
		btnOutOfPass.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnOutOfPass.setHorizontalAlignment(SwingConstants.LEFT);
		btnOutOfPass.setText("OUT ON PASS");
		btnOutOfPass.setBorder(new CompoundBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder(), new EmptyBorder(0, 10, 0, 0)));
		btnOutOfPass.setBackground(GuiModes.CHANGE_SCREEN
				.getDefaultBackgroundColor());
		btnOutOfPass.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		btnOutOfPass.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		btnOutOfPass.setSelectedIcon(new ImageIcon("img/tick_mark.png"));
		btnOutOfPass.setIcon(new ImageIcon("img/blank.png"));
		panelContent.add(btnOutOfPass);

		btnExpired = new JToggleButton();
		bgDischargeType.add(btnExpired);
		btnExpired.setActionCommand("4");
		btnExpired.setBounds(312, 240, 129, 31);
		btnExpired.setIconTextGap(10);
		btnExpired.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnExpired.setHorizontalAlignment(SwingConstants.LEFT);
		btnExpired.setText("EXPIRED");
		btnExpired.setBorder(new CompoundBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder(), new EmptyBorder(0, 10, 0, 0)));
		btnExpired.setBackground(GuiModes.CHANGE_SCREEN
				.getDefaultBackgroundColor());
		btnExpired.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		btnExpired.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		btnExpired.setSelectedIcon(new ImageIcon("img/tick_mark.png"));
		btnExpired.setIcon(new ImageIcon("img/blank.png"));
		panelContent.add(btnExpired);

		// panelContent.add(dateLabel_5);

		dateLabel_4 = new JLabel();
		dateLabel_4.setBounds(20, 135, 130, 31);
		dateLabel_4.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		dateLabel_4.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		dateLabel_4.setText("Notes");

		panelContent.add(dateLabel_4);

		JScrollPane scrollPaneArea = new JScrollPane();
		scrollPaneArea.setBounds(156, 135, 430, 57);
		panelContent.add(scrollPaneArea);

		txtNotes = new JTextArea();
		txtNotes.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		txtNotes.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		txtNotes.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		txtNotes.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtNotes.setBounds(156, 171, 430, 57);
		panelContent.add(txtNotes);
		scrollPaneArea.setViewportView(txtNotes);

		dateLabel_Title = new JLabel();
		dateLabel_Title.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		dateLabel_Title.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		dateLabel_Title.setBounds(20, 275, 130, 31);
		panelContent.add(dateLabel_Title);

		dateLabel_1 = new JLabel();
		dateLabel_1.setText("");
		dateLabel_1.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		dateLabel_1.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		dateLabel_1.setBounds(175, 275, 375, 31);
		panelContent.add(dateLabel_1);

		updateData();
	}

	protected void doUpdate() {
		int w = getWidth();
		int h = getHeight() - 76 - 20;
		float wF = ((float) w / 868);
		float hF = ((float) h / 516);
		// 72, 10, 790, 496
		panelMain.setBounds((int) (72 * wF), (int) (10 * hF), (int) (790 * wF),
				(int) (496 * hF));
		// 0, 0, 791, 35
		lblTitle.setBounds(0, 0, (int) (791 * wF), (int) (35 * hF));
		// 0, 45, 606, 394
		panelSubMain.setBounds(0, (int) (45 * hF), (int) (606 * wF),
				(int) (394 * hF));
		// 610, 45, 175, 394
		panelRight.setBounds((int) (610 * wF), (int) (45 * hF),
				(int) (175 * wF), (int) (394 * hF));
		// 0, 445, 791, 51
		panelFooter.setBounds((int) (0 * wF), (int) (445 * hF),
				(int) (791 * wF), (int) (51 * hF));
		// 0, 0, 596, 309
		layerContent.setBounds(SwingUtils.centerRectangle(panelSubMain
				.getBounds(), new Rectangle(0, 0, 596, 309)));
		panelContent.setSize(596, 309);

		if (getTopLevelAncestor() != null) {
			getTopLevelAncestor().repaint();
		} else {
			this.repaint();
		}
		updateData();
		btnSave.setText("");
		btnSave.setText("SAVE");
	}

	public void updateData() {
		CensusStatus ref = null;

		if (Global.currentCensusStatusId != 0) {
			try {
				if (isMain) {
					ref = MedrexClientManager.getInstance().getCensusStatus(
							Global.currentCensusStatusId,
							Global.panelCensusMain.getResident().getSerial());
				} else {
					ref = MedrexClientManager.getInstance().getCensusStatus(
							Global.currentCensusStatusId,
							Global.currentResidenceKey);
				}
				if (ref.getTypeName().equalsIgnoreCase("Discharge")) {
					// dcCurrentDate.setDate(ref.getDateAndTime());
					// SimpleDateFormat df = new SimpleDateFormat("hh");
					// cmbHours.setSelectedItem(df.format(ref.getDateAndTime()));
					// df.applyPattern("mm");
					// cmbMinutes.setSelectedItem(df.format(ref.getDateAndTime()));
					// df.applyPattern("a");
					// cmbAmPm.setSelectedItem(df.format(ref.getDateAndTime()));
					// ref.getDischargeType();

					SwingUtils.setSelectedButton(bgTo, ref.getFromId());

					AdmissionFromSubHead afsh = MedrexClientManager
							.getInstance().getAdmissionFromSubHead(
									ref.getFromSubId());
					String a = afsh.getName();
					txtDischargedToName.setText(a);

					if (ref.getFromTransport() != 0) {
						AdmissionTransportation aft = MedrexClientManager
								.getInstance().getAdmissionTransportation(
										ref.getFromTransport());
						txtTransportation.setText(aft.getName());
					}
					// if(ref.getDischargeType()==1){
					// btnDischarge.setEnabled(true);
					// }
					// if(ref.getDischargeType()==2){
					// btnOutOfPass.setEnabled(true);
					// }
					// if(ref.getDischargeType()==3){
					// btnEr.setEnabled(true);
					// }
					// if(ref.getDischargeType()==4){
					// btnExpired.setEnabled(true);
					// }

					SwingUtils.setSelectedButton(bgDischargeType, ref
							.getDischargeType());

					txtNotes.setText(ref.getNotes());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			// panelContent.setEnabled(false);
			// cmbHours.setEnabled(false);
			// cmbAmPm.setEnabled(false);
			// cmbMinutes.setEnabled(false);
			//			
			// dcCurrentDate.setFocusable(false);
			// dcCurrentDate.remove(dcCurrentDate.getComponent(0));
			// dcCurrentDate.setFocusable(false);
			// final JTextFieldDateEditor dateEditor = (JTextFieldDateEditor)
			// dcCurrentDate.getDateEditor();
			// dateEditor.setEditable(false);
			// final CaretListener[] caretListeners =
			// dateEditor.getCaretListeners();
			// for(int i = 0; i < caretListeners.length; i++) {
			// dateEditor.removeCaretListener(caretListeners[i]);
			// }
			// dateEditor.setBackground(GuiModes.CHANGE_SCREEN.getControlBackgroundColor());
			// dateEditor.setForeground(GuiModes.CHANGE_SCREEN.getControlForegroundColor());
			//			
			// panelContent.setFocusable(false);

			btnNotes.setVisible(true);
			btnCancel.setText("DONE");
			if (Global.currentLoggedInUserType.equals("Administrator")) {
				SimpleDateFormat df = new SimpleDateFormat("hh");
				layerUI.setLocked(false);
				btnSave.setVisible(true);
				cmbHours.setVisible(true);
				cmbHours.setSelectedItem(df.format(ref.getDateAndTime()));
				cmbAmPm.setVisible(true);
				df = new SimpleDateFormat("a");
				cmbAmPm.setSelectedItem(df.format(ref.getDateAndTime()));
				cmbMinutes.setVisible(true);
				df = new SimpleDateFormat("mm");
				cmbMinutes.setSelectedItem(df.format(ref.getDateAndTime()));
				dcCurrentDate.setVisible(true);
				dcCurrentDate.setDate(ref.getDateAndTime());
				dateLabel_Old.setVisible(true);
				dateLabel.setVisible(true);
			} else {
				dateLabel_Title.setText("Discharged On");
				layerUI.setLocked(true);
				btnSave.setVisible(false);
				dateLabel_1.setText(ref.getDateAndTime().toString());
			}

		} else {
			/*
			 * btnSave.setVisible(true); btnNotes.setVisible(false);
			 * btnCancel.setText("CANCEL");
			 * 
			 * currentDate = null; currentDate =
			 * MedrexClientManager.getServerTime();
			 */

			// panelContent.remove(dcCurrentDate);
			//
			// dcCurrentDate = new JDateChooser();
			// dcCurrentDate.setBounds(74, 20, 150, 31);
			// dcCurrentDate.setBackground(GuiModes.CHANGE_SCREEN
			// .getControlBackgroundColor());
			// dcCurrentDate.setForeground(GuiModes.CHANGE_SCREEN
			// .getControlForegroundColor());
			// dcCurrentDate.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
			// dcCurrentDate.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
			// dcCurrentDate.setDateFormatString("yyyy/MM/dd");
			// panelContent.add(dcCurrentDate);
			// dcCurrentDate.setDate(currentDate);
			//
			// SimpleDateFormat df = new SimpleDateFormat("hh");
			// cmbHours.setSelectedItem(df.format(currentDate));
			// df = new SimpleDateFormat("mm");
			// cmbMinutes.setSelectedItem(df.format(currentDate));
			// df = new SimpleDateFormat("a");
			// cmbAmPm.setSelectedItem(df.format(currentDate));
			Global.currentCenusStatusNextId = 0;
			layerUI.setLocked(false);
		}
	}

	public boolean doSave() {
		int currentResidenceKey = 0;
		boolean bool = false;
		CensusStatus ref = new CensusStatus();
		if (isMain) {
			currentResidenceKey = Global.panelCensusMain.getResident()
					.getSerial();
		} else {
			currentResidenceKey = Global.currentResidenceKey;
		}
		ref.setResidentId(currentResidenceKey);
		ref.setAdministeredBy(Global.currentLoggedInUserKey);
		ref.setTypeName("Discharge");

		if (Global.currentLoggedInUserType.equals("Administrator")) {
			Date d = dcCurrentDate.getDate();
			int hrs;
			hrs = Integer.parseInt((String) cmbHours.getSelectedItem());
			if (((String) cmbAmPm.getSelectedItem()).equalsIgnoreCase("PM"))
				if (hrs != 12) {
					hrs += 12;
				}
			d.setHours(hrs);
			d.setMinutes(Integer
					.parseInt((String) cmbMinutes.getSelectedItem()));
			// if (!(d.before(new Date()))) {
			// JOptionPane.showMessageDialog(null,
			// "Discharge date can not be greater then current date");
			// return false;
			// } else {
			// System.out.println("Date is:"+d);
			ref.setDateAndTime(d);
			// }

		} else {
			ref.setDateAndTime(MedrexClientManager.getServerTime());
		}
		ref.setAdministeredBy(Global.currentLoggedInUserKey);
		ref.setFromId(SwingUtils.getSelectedButton(bgTo));

		AdmissionFromSubHead refAdmSubHead = new AdmissionFromSubHead();
		refAdmSubHead.setName(txtDischargedToName.getText());
		refAdmSubHead.setHeadId(SwingUtils.getSelectedButton(bgTo));
		try {
			List tmpList = MedrexClientManager.getInstance()
					.getAdmissionFromSubHeads(refAdmSubHead.getHeadId(),
							txtDischargedToName.getText());
			if (tmpList == null || tmpList.size() == 0) {
				MedrexClientManager.getInstance()
						.insertOrUpdateAdmissionFromSubHead(refAdmSubHead);
			} else {
				refAdmSubHead = (AdmissionFromSubHead) tmpList.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		ref.setFromSubId(refAdmSubHead.getSerial());

		AdmissionTransportation refAdmTpt = new AdmissionTransportation();
		refAdmTpt.setName(txtTransportation.getText());
		if (!refAdmTpt.getName().equals("")) {
			try {
				List tmpList = MedrexClientManager.getInstance()
						.getAdmissionTransportations(
								txtTransportation.getText());
				if (tmpList != null && tmpList.size() > 0) {
					refAdmTpt = (AdmissionTransportation) tmpList.get(0);
				} else {
					MedrexClientManager.getInstance()
							.insertOrUpdateAdmissionTransportation(refAdmTpt);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		ref.setFromTransport(refAdmTpt.getSerial());

		ref.setDischargeType(SwingUtils.getSelectedButton(bgDischargeType));
		ref.setSerial(Global.currentCensusStatusId);

		ref.setCurrentCenusStatusPrevId(Global.currentCenusStatusPrevId);
		ref.setCurrentCenusStatusNextId(Global.currentCenusStatusNextId);

		ref.setNotes(txtNotes.getText());

		CensusStatus refSignOutRec = null;
		CensusStatus refSignInRec = null;
		try {
			refSignOutRec = MedrexClientManager.getInstance()
					.getCensusLastSignOut(currentResidenceKey);
			refSignInRec = MedrexClientManager.getInstance()
					.getCensusLastSignIn(currentResidenceKey);
		} catch (Exception e) {
		}
		if ((refSignOutRec != null && refSignInRec == null)
				|| (refSignOutRec != null && refSignInRec != null && refSignOutRec
						.getDateAndTime().after(refSignInRec.getDateAndTime()))) {
			CensusStatus refSignIn = new CensusStatus();
			Date dateTimeStamp = refSignIn.getTimestamp();
			refSignIn.setTimestamp(ref.getTimestamp());
			ref.setTimestamp(dateTimeStamp);
			refSignIn.setResidentId(currentResidenceKey);

			Calendar cal = Calendar.getInstance();
			cal.setTime(ref.getDateAndTime());
			cal.add(Calendar.SECOND, -1);
			refSignIn.setDateAndTime(cal.getTime());

			refSignIn.setAdministeredBy(Global.currentLoggedInUserKey);
			refSignIn.setTypeName("Sign In");
			refSignIn.setSerial(0);
			try {
				MedrexClientManager.getInstance().insertOrUpdateCensusStatus(
						refSignIn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		try {
			int num = 0;
			if (ref.getDateAndTime().after(MedrexClientManager.getServerTime())) {
				num = JOptionPane
						.showConfirmDialog(
								this,
								"You have choosen greater than current time, \n Are you sure?",
								"Regarding Admission Time",
								JOptionPane.YES_NO_OPTION);
			}
			if (num != 1 && num != -1) {
				if (Global.currentLoggedInUserType.equals("Administrator")) {
					Date d = dcCurrentDate.getDate();
					int hrs;
					hrs = Integer.parseInt((String) cmbHours.getSelectedItem());
					if (((String) cmbAmPm.getSelectedItem())
							.equalsIgnoreCase("PM"))
						if (hrs != 12) {
							hrs += 12;
						}
					d.setHours(hrs);
					d.setMinutes(Integer.parseInt((String) cmbMinutes
							.getSelectedItem()));
					ref.setDateAndTime(d);
				} else {
					ref.setDateAndTime(MedrexClientManager.getServerTime());
				}
				MedrexClientManager.getInstance().insertOrUpdateCensusStatus(
						ref);
				// update top right resident information
				if (Global.panelCensusMain != null) {
					Global.panelCensusMain.setResident(MedrexClientManager
							.getInstance().getResident(currentResidenceKey));
				}
				bool = true;
			}
		} catch (MedrexException e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
			bool = false;
			// e.printStackTrace();
		} catch (RemoteException re) {
			bool = false;
		}
		return bool;
	}

	public boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;
		// Date curDate = MedrexClientManager.getServerTime();
		// Date d = dcCurrentDate.getDate();
		// int hrs;
		// hrs = Integer.parseInt((String) cmbHours.getSelectedItem());
		// if (((String) cmbAmPm.getSelectedItem()).equalsIgnoreCase("PM"))
		// hrs += 12;
		// d.setHours(hrs);
		// d.setMinutes(Integer.parseInt((String)
		// cmbMinutes.getSelectedItem()));
		//
		// if (d.compareTo(MedrexClientManager.getServerTime()) > 0) {
		// vRes.addError("Future Date and Time is not allowed.");
		// }

		int toId = SwingUtils.getSelectedButton(bgTo);
		if (toId == 0) {
			vRes.addError("To Field is mandatory.");
		}
		if (toId != 2 && toId != 4) {
			if (txtDischargedToName.getText() == null
					|| txtDischargedToName.getText() == ""
					|| txtDischargedToName.getText().length() == 0) {
				vRes.addError("Name Field is mandatory.");
			}
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(
				bgDischargeType, "Discharge Type"))) {
			vRes.addAllFrom(temp);
		}
		if (!FieldValidation.isEmpty(vRes)) {
			FieldValidation.Msgbox(vRes, "Census Admission Record");
			return false;
		} else {
			// JOptionPane.showMessageDialog(this, "Saved successfully!!!");
			return true;
		}
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Discharge Details";
	}

	public void doClose() {
		close();
	}
}
