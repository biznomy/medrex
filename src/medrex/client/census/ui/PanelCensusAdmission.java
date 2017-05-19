package medrex.client.census.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.floorPlan.PanelRoomPopUp;
import medrex.client.main.PanelResidentInformation;
import medrex.client.main.resident.personalInfo.ControllerRoomList;
import medrex.client.utils.FieldValidation;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.census.AdmissionFromSubHead;
import medrex.commons.vo.census.AdmissionTransportation;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;

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

public class PanelCensusAdmission extends PopUpView {

	private JLabel dateLabel_11;
	private JLabel dateLabel_New;
	private ButtonGroup bgFrom = new ButtonGroup();
	private JLabel dateLabel_4;
	private JRadioButton rbCommunity;
	private JRadioButton rbOther;
	private JRadioButton rbHome;
	private JRadioButton rbHospital;
	private JxTextField txtAdmissionTransportation;
	private JLabel dateLabel_3;
	private JxTextField txtAdmissionFromSubHead;
	private JLabel dateLabel_2;
	private JxComboBox cmbAmPm;
	private JxComboBox cmbMinutes;
	private JxComboBox cmbHours;
	private JLabel dateLabel_1;
	private JDateChooser dcAdmissionDate;
	private JLabel dateLabel;
	private JxPanel panelContent;

	private static final long serialVersionUID = 1L;

	private Date currentDate;
	private JPanel panelMain;
	private JPanel panelSubMain;
	private PanelResidentInformation panelRight;
	private JPanel panelFooter;
	private JxButton btnCancel;
	private JxButton btnSave;
	private JLabel lblTitle;
	private ChangeListener fromChangeListener;
	private JxButton btnNotes;
	private JXLayer<JPanel> layerContent;
	private LockableUI layerUI;
	private final boolean isMain;
	private JLabel label_2;

	private ControllerRoomList controllerRoomList;

	/**
	 * for mapping the room with wing
	 * 
	 * @param isMain
	 */

	private static String[] strSubCat1 = { "101-1", "101-2", "102-1", "102-2",
			"103-1", "103-2", "104-1", "104-2", "104-3", "104-4", "105-1",
			"105-2", "106-1", "106-2", "107-1", "107-2", "108-1", "108-2",
			"109-1", "109-2", "109-3", "109-4" };

	private static String[] strSubCat2 = { "110-1", "110-2", "110-3", "110-4",
			"111-1", "111-2", "112-1", "112-2", "113-1", "113-2", "114-1",
			"114-2", "115-1", "115-2", "116-1", "116-2", "117-1", "117-2",
			"118-1", "118-2", "119-1", "119-2", "120-1", "120", "120-2",
			"121-1", "121-2", "122-1", "122-2", "123-1", "123-2", "124", "125",
			"126-1", "126-2", "127-1", "127-2", "128", "129-1", "129-2",
			"129-3" };

	private static String[] strSubCat3 = { "201", "202", "203-1", "203-2",
			"204-1", "204-2", "205-1", "205-2", "206-1", "206-2", "206-3",
			"206-4", "207-1", "207-2", "208-1", "208-2", "209-1", "209-2",
			"210-1", "210-2", "211-1", "211-2" };

	private static String[] strSubCat4 = { "212-1", "212-2", "212-3", "212-4",
			"213-1", "213-2", "213-3", "213-4", "214-1", "214-2", "215-1",
			"215-2", "216-1", "216-2", "217-1", "217-2", "218-1", "218-2",
			"219-1", "219-2", "220-1", "220-2", "221-1", "221-2", "222-1",
			"222-2", "223-1", "223-2", "224-1", "224-2", "225-1", "225-2",
			"226-1", "226-2", "227-1", "227-2", "228-1", "228-2", "229",
			"230-1", "230-2", "231-1", "231-2", "232-1", "232-2", "232-3" };

	public PanelCensusAdmission(final boolean isMain) {
		super();
		controllerRoomList = new ControllerRoomList();
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
		lblTitle.setText("Fill in Admission Details:");
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
						if (PanelCensusAdmission.this.isMain) {
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
				// SwingUtils.wrapInDialog(new PanelCensusNotes(),
				// "Census Notes").setVisible(true);
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
				if (PanelCensusAdmission.this.isMain) {
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
		panelContent.setBounds(0, 0, 528, 189);
		// panelContent.setBounds(0, 0, 528, 143);
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
		layerContent.setBounds(0, 0, 528, 189);
		panelSubMain.add(layerContent);

		if (Global.currentLoggedInUserType.equals("Administrator")) {
			dateLabel = new JLabel();
			dateLabel.setBounds(20, 145, 48, 31);
			dateLabel.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
			dateLabel.setForeground(GuiModes.CHANGE_SCREEN
					.getDefaultForegroundColor());
			dateLabel.setText("Date");
			panelContent.add(dateLabel);

			dcAdmissionDate = new JDateChooser();
			dcAdmissionDate.setDateFormatString("MM/dd/yyyy");
			dcAdmissionDate.setBounds(74, 147, 150, 31);
			dcAdmissionDate.setBackground(GuiModes.CHANGE_SCREEN
					.getControlBackgroundColor());
			dcAdmissionDate.setForeground(GuiModes.CHANGE_SCREEN
					.getControlForegroundColor());
			dcAdmissionDate.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
			dcAdmissionDate
					.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
			dcAdmissionDate.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
			dcAdmissionDate.setDate(currentDate);
			panelContent.add(dcAdmissionDate);

			dateLabel_1 = new JLabel();
			dateLabel_1.setBounds(230, 145, 48, 31);
			dateLabel_1.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
			dateLabel_1.setForeground(GuiModes.CHANGE_SCREEN
					.getDefaultForegroundColor());
			dateLabel_1.setText("Time");
			panelContent.add(dateLabel_1);

			cmbHours = new JxComboBox();
			cmbHours.setBounds(284, 145, 63, 31);
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
			cmbMinutes.setBounds(363, 145, 63, 31);
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

			label_2 = new JLabel();
			label_2.setBounds(353, 145, 6, 31);
			label_2.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
			label_2.setForeground(GuiModes.CHANGE_SCREEN
					.getDefaultForegroundColor());
			label_2.setText(":");
			panelContent.add(label_2);

			cmbAmPm = new JxComboBox();
			cmbAmPm.setBounds(443, 145, 63, 31);
			cmbAmPm.setArc(0.2f);
			cmbAmPm.setModel(new DefaultComboBoxModel(
					new String[] { "AM", "PM" }));
			cmbAmPm.setBackground(GuiModes.CHANGE_SCREEN
					.getControlBackgroundColor());
			cmbAmPm.setForeground(GuiModes.CHANGE_SCREEN
					.getControlForegroundColor());
			cmbAmPm.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
			cmbAmPm.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
			df = new SimpleDateFormat("a");
			cmbAmPm.setSelectedItem(df.format(currentDate));
			panelContent.add(cmbAmPm);

		}

		dateLabel_2 = new JLabel();
		dateLabel_2.setBounds(20, 15, 48, 31);
		dateLabel_2.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		dateLabel_2.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		dateLabel_2.setText("From");
		panelContent.add(dateLabel_2);

		txtAdmissionFromSubHead = new JxTextField();
		txtAdmissionFromSubHead.setBounds(74, 55, 242, 31);
		txtAdmissionFromSubHead.setArc(0.2f);
		txtAdmissionFromSubHead.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		txtAdmissionFromSubHead.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		txtAdmissionFromSubHead
				.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		txtAdmissionFromSubHead.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtAdmissionFromSubHead.setEnabled(false);
		txtAdmissionFromSubHead
				.setModel(new AbstractBindableListModel<String, AdmissionFromSubHead>() {
					private int getHeadId() {
						// int headId = 0;
						// List headList;
						// try {
						// headList =
						// MedrexClientManager.getInstance().getAdmissionFromHeads(txtAdmissionFromHead.getText());
						// }
						// catch (Exception e) {
						// e.printStackTrace();
						// return headId;
						// }
						// if(headList != null && headList.size() > 0) {
						// headId =
						// ((AdmissionFromHead)headList.get(0)).getSerial();
						// }
						// return headId;
						return SwingUtils.getSelectedButton(bgFrom);
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
		panelContent.add(txtAdmissionFromSubHead);

		fromChangeListener = new ChangeListener() {
			public void stateChanged(final ChangeEvent arg0) {
				if (SwingUtils.getSelectedButton(bgFrom) != 0
						&& Global.currentCensusStatusId == 0) {
					txtAdmissionFromSubHead.setText("");
					txtAdmissionFromSubHead.setEnabled(true);
				} else {
					txtAdmissionFromSubHead.setEnabled(false);
				}
			}
		};

		dateLabel_3 = new JLabel();
		dateLabel_3.setBounds(20, 100, 130, 31);
		dateLabel_3.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		dateLabel_3.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		dateLabel_3.setText("Transportation");

		panelContent.add(dateLabel_3);

		txtAdmissionTransportation = new JxTextField();
		txtAdmissionTransportation.setBounds(156, 100, 242, 31);
		txtAdmissionTransportation.setArc(0.2f);
		txtAdmissionTransportation.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		txtAdmissionTransportation.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		txtAdmissionTransportation.setFont(GuiModes.CHANGE_SCREEN
				.getControlFont());
		txtAdmissionTransportation.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtAdmissionTransportation.setFont(GuiModes.CHANGE_SCREEN
				.getDefaultFont());
		txtAdmissionTransportation.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtAdmissionTransportation
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
		panelContent.add(txtAdmissionTransportation);

		rbHospital = new JRadioButton();
		rbHospital.addChangeListener(fromChangeListener);
		bgFrom.add(rbHospital);
		rbHospital.setActionCommand("1");
		rbHospital.setContentAreaFilled(false);
		rbHospital.setFocusPainted(false);
		rbHospital.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		rbHospital.setOpaque(false);
		rbHospital.setText("Hospital");
		rbHospital.setFont(new Font("Dialog", Font.PLAIN, 18));
		rbHospital.setBounds(74, 15, 95, 24);
		panelContent.add(rbHospital);

		rbHome = new JRadioButton();
		rbHome.addChangeListener(new ChangeListener() {
			public void stateChanged(final ChangeEvent evt) {
				if (rbHome.isSelected()) {
					txtAdmissionFromSubHead.setText("Residents Home");
					txtAdmissionFromSubHead.setEnabled(false);
				} else {
					txtAdmissionFromSubHead.setText("");
					txtAdmissionFromSubHead.setEnabled(true);
				}
			}
		});
		bgFrom.add(rbHome);
		rbHome.setActionCommand("2");
		rbHome.setContentAreaFilled(false);
		rbHome.setFocusPainted(false);
		rbHome
				.setForeground(GuiModes.CHANGE_SCREEN
						.getDefaultForegroundColor());
		rbHome.setOpaque(false);
		rbHome.setText("Home");
		rbHome.setFont(new Font("Dialog", Font.PLAIN, 18));
		rbHome.setBounds(175, 15, 74, 24);
		panelContent.add(rbHome);

		rbOther = new JRadioButton();
		rbOther.addChangeListener(fromChangeListener);
		bgFrom.add(rbOther);
		rbOther.setActionCommand("3");
		rbOther.setContentAreaFilled(false);
		rbOther.setFocusPainted(false);
		rbOther.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		rbOther.setOpaque(false);
		rbOther.setText("Other Facility");
		rbOther.setFont(new Font("Dialog", Font.PLAIN, 18));
		rbOther.setBounds(255, 15, 124, 24);
		panelContent.add(rbOther);

		rbCommunity = new JRadioButton();
		rbCommunity.addChangeListener(fromChangeListener);
		bgFrom.add(rbCommunity);
		rbCommunity.setActionCommand("4");
		rbCommunity.setContentAreaFilled(false);
		rbCommunity.setFocusPainted(false);
		rbCommunity.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		rbCommunity.setOpaque(false);
		rbCommunity.setText("Other");
		rbCommunity.setFont(new Font("Dialog", Font.PLAIN, 18));
		rbCommunity.setBounds(385, 15, 107, 24);
		panelContent.add(rbCommunity);

		dateLabel_4 = new JLabel();
		dateLabel_4.setBounds(20, 55, 48, 31);
		dateLabel_4.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		dateLabel_4.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		dateLabel_4.setText("Name");
		panelContent.add(dateLabel_4);

		dateLabel_New = new JLabel();
		dateLabel_New.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		dateLabel_New.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		dateLabel_New.setText("");
		dateLabel_New.setBounds(156, 145, 336, 31);
		panelContent.add(dateLabel_New);

		dateLabel_11 = new JLabel();
		dateLabel_11.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		dateLabel_11.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		dateLabel_11.setBounds(20, 145, 107, 31);
		panelContent.add(dateLabel_11);

		// Global.currentCenusStatusNextId = 0;

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
		// 0, 0, 528, 189
		layerContent.setBounds(SwingUtils.centerRectangle(panelSubMain
				.getBounds(), new Rectangle(0, 0, 528, 190)));
		panelContent.setSize(528, 190);

		if (getTopLevelAncestor() != null) {
			getTopLevelAncestor().repaint();
		} else {
			this.repaint();
		}
		fillCombos();
		updateData();
	}

	public void fillCombos() {
		/*
		 * updateHeadCombo(); //updateSubHeadCombo(); updateTransportCombo();
		 */}

	/*
	 * public void updateHeadCombo() { Iterator i = null; MapHead = null; try {
	 * cmbAdmissionFromHead.removeAllItems();
	 * cmbAdmissionFromHead.insertItemAt("Select", 0); MapHead = new HashMap();
	 * FromHead = AdmissionFromHeadDAO.getInstance().getAdmissionFromHeads(); i
	 * = FromHead.iterator(); while(i.hasNext()) { AdmissionFromHead ref =
	 * (AdmissionFromHead) i.next();
	 * cmbAdmissionFromHead.addItem(ref.getName()); MapHead.put(ref.getName(),
	 * ref.getSerial()); } } catch (MedrexException e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); }
	 * cmbAdmissionFromHead.addItem("Add new...");
	 * cmbAdmissionFromHead.setSelectedIndex(0); } public void
	 * updateSubHeadCombo() { Iterator i = null; MapSubHead = null; try {
	 * cmbAdmissionFromSubHead.removeAllItems();
	 * cmbAdmissionFromSubHead.insertItemAt("Select", 0); MapSubHead = new
	 * HashMap(); if (cmbAdmissionFromHead.getSelectedItem() != null) { if
	 * (cmbAdmissionFromHead.getSelectedItem().toString() == "Select" ||
	 * currentFromHeadId == -1) { cmbAdmissionFromSubHead.setSelectedIndex(0); }
	 * else { FromSubHead =
	 * AdmissionFromSubHeadDAO.getInstance().getAdmissionFromSubHeads
	 * (currentFromHeadId); i = FromSubHead.iterator(); while(i.hasNext()) {
	 * AdmissionFromSubHead ref = (AdmissionFromSubHead) i.next();
	 * cmbAdmissionFromSubHead.addItem(ref.getName());
	 * MapSubHead.put(ref.getName(), ref.getSerial()); } } } } catch (Exception
	 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
	 * cmbAdmissionFromSubHead.addItem("Add new...");
	 * cmbAdmissionFromSubHead.setSelectedIndex(0); } public void
	 * updateTransportCombo() { Iterator i = null; MapTransportation = null;
	 * cmbAdmissionTransportation.removeAllItems();
	 * cmbAdmissionTransportation.insertItemAt("Select", 0); MapTransportation =
	 * new HashMap(); try { FromTransportation =
	 * AdmissionTransportationDAO.getInstance
	 * ().getAdmissionTransportations(Global.currentResidenceKey); i =
	 * FromTransportation.iterator(); while(i.hasNext()) {
	 * AdmissionTransportation ref = (AdmissionTransportation) i.next();
	 * cmbAdmissionTransportation.addItem(ref.getName());
	 * MapTransportation.put(ref.getName(), ref.getSerial()); } } catch
	 * (MedrexException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } cmbAdmissionTransportation.addItem("Add new...");
	 * cmbAdmissionTransportation.setSelectedIndex(0); }
	 */public void updateData() {
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
				if (ref.getTypeName().equalsIgnoreCase("Admission")) {
					// dcAdmissionDate.setDate(ref.getDateAndTime());
					// SimpleDateFormat df = new SimpleDateFormat("hh");
					// cmbHours.setSelectedItem(df.format(ref.getDateAndTime()));
					// df.applyPattern("mm");
					// cmbMinutes.setSelectedItem(df.format(ref.getDateAndTime()));
					// df.applyPattern("a");
					// cmbAmPm.setSelectedItem(df.format(ref.getDateAndTime()));
					// AdmissionFromHead afh =
					// MedrexClientManager.getInstance().getAdmissionFromHead(ref.getFromId());
					// txtAdmissionFromHead.setText(afh.getName());
					SwingUtils.setSelectedButton(bgFrom, ref.getFromId());
					// updateSubHeadCombo();
					AdmissionFromSubHead afsh = MedrexClientManager
							.getInstance().getAdmissionFromSubHead(
									ref.getFromSubId());
					String a = afsh.getName();
					txtAdmissionFromSubHead.setText(a);
					if (ref.getFromTransport() != 0) {
						AdmissionTransportation aft = MedrexClientManager
								.getInstance().getAdmissionTransportation(
										ref.getFromTransport());
						txtAdmissionTransportation.setText(aft.getName());
					}
				}
			} catch (Exception e) {
				// e.printStackTrace();
			}
			// panelContent.setEnabled(false);
			// cmbHours.setEnabled(false);
			// cmbAmPm.setEnabled(false);
			// cmbMinutes.setEnabled(false);
			// //txtAdmissionFromSubHead.setEnabled(false);
			// //txtAdmissionTransportation.setEnabled(false);
			//			
			// dcAdmissionDate.setFocusable(false);
			// dcAdmissionDate.remove(dcAdmissionDate.getComponent(0));
			// dcAdmissionDate.setFocusable(false);
			// final JTextFieldDateEditor dateEditor = (JTextFieldDateEditor)
			// dcAdmissionDate.getDateEditor();
			// dateEditor.setEditable(false);
			// final CaretListener[] caretListeners =
			// dateEditor.getCaretListeners();
			// for(int i = 0; i < caretListeners.length; i++) {
			// dateEditor.removeCaretListener(caretListeners[i]);
			// }
			// dateEditor.setBackground(GuiModes.CHANGE_SCREEN.getControlBackgroundColor());
			// dateEditor.setForeground(GuiModes.CHANGE_SCREEN.getControlForegroundColor());
			//			
			// rbHospital.setEnabled(false);
			// rbHome.setEnabled(false);
			// rbOther.setEnabled(false);
			// rbCommunity.setEnabled(false);
			//			
			// panelContent.setFocusable(false);

			if (Global.currentLoggedInUserType.equals("Administrator")) {
				btnSave.setVisible(true);
				layerUI.setLocked(false);
				dcAdmissionDate.setVisible(true);
				dcAdmissionDate.setDate(ref.getDateAndTime());
				cmbHours.setVisible(true);
				SimpleDateFormat df = new SimpleDateFormat("hh");
				cmbHours.setSelectedItem(df.format(ref.getDateAndTime()));
				cmbMinutes.setVisible(true);
				df = new SimpleDateFormat("mm");
				cmbMinutes.setSelectedItem(df.format(ref.getDateAndTime()));
				cmbAmPm.setVisible(true);
				df = new SimpleDateFormat("a");
				cmbAmPm.setSelectedItem(df.format(ref.getDateAndTime()));
				dateLabel_1.setVisible(true);
				dateLabel.setVisible(true);
				btnNotes.setVisible(true);
			} else {
				dateLabel_11.setText("Admitted On");
				btnSave.setVisible(false);
				layerUI.setLocked(true);
				dateLabel_New.setText(ref.getDateAndTime().toString());
				btnNotes.setVisible(true);
				btnCancel.setText("DONE");
			}

		} else {

			// rbHospital.setEnabled(true);
			// rbHome.setEnabled(true);
			// rbOther.setEnabled(true);
			// rbCommunity.setEnabled(true);
			//
			// panelContent.setEnabled(true);
			// panelContent.setFocusable(true);
			/*
			 * btnSave.setVisible(true); btnNotes.setVisible(false);
			 * btnCancel.setText("CANCEL"); layerUI.setLocked(false);
			 */
		}
	}

	public void doClose() {
		close();
	}

	public boolean doSave() {
		boolean bool = false;

		CensusStatus ref = new CensusStatus();
		ref.setTypeName("Admission");
		if (isMain) {
			ref.setResidentId(Global.panelCensusMain.getResident().getSerial());
		} else {
			ref.setResidentId(Global.currentResidenceKey);
		}

		if (Global.currentLoggedInUserType.equals("Administrator")) {
			Date d = dcAdmissionDate.getDate();
			int hrs;
			hrs = Integer.parseInt((String) cmbHours.getSelectedItem());
			if (((String) cmbAmPm.getSelectedItem()).equalsIgnoreCase("PM"))
				if (hrs != 12)
					hrs += 12;
			d.setHours(hrs);
			d.setMinutes(Integer
					.parseInt((String) cmbMinutes.getSelectedItem()));
			ref.setDateAndTime(d);
		} else {
			ref.setDateAndTime(MedrexClientManager.getServerTime());
		}

		// AdmissionFromHead refAdmHead = new AdmissionFromHead();
		// refAdmHead.setName(txtAdmissionFromHead.getText());
		// try {
		// List tmpList =
		// MedrexClientManager.getInstance().getAdmissionFromHeads(txtAdmissionFromHead.getText());
		// if(tmpList == null || tmpList.size() == 0) {
		// MedrexClientManager.getInstance().insertOrUpdateAdmissionFromHead(refAdmHead);
		// } else {
		// refAdmHead = (AdmissionFromHead) tmpList.get(0);
		// }
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// ref.setFromId(refAdmHead.getSerial());

		ref.setFromId(SwingUtils.getSelectedButton(bgFrom));

		if (txtAdmissionFromSubHead.getText() != null
				&& txtAdmissionFromSubHead.getText().length() != 0) {
			AdmissionFromSubHead refAdmSubHead = new AdmissionFromSubHead();
			refAdmSubHead.setName(txtAdmissionFromSubHead.getText());
			refAdmSubHead.setHeadId(SwingUtils.getSelectedButton(bgFrom));
			try {
				List tmpList = MedrexClientManager.getInstance()
						.getAdmissionFromSubHeads(refAdmSubHead.getHeadId(),
								txtAdmissionFromSubHead.getText());
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
		}

		if (txtAdmissionTransportation.getText() != null
				&& txtAdmissionTransportation.getText().length() != 0) {
			AdmissionTransportation refAdmTpt = new AdmissionTransportation();
			refAdmTpt.setName(txtAdmissionTransportation.getText());
			if (!refAdmTpt.getName().equals("")) {
				try {
					List tmpList = MedrexClientManager.getInstance()
							.getAdmissionTransportations(
									txtAdmissionTransportation.getText());
					if (tmpList != null && tmpList.size() > 0) {
						refAdmTpt = (AdmissionTransportation) tmpList.get(0);
					} else {
						MedrexClientManager.getInstance()
								.insertOrUpdateAdmissionTransportation(
										refAdmTpt);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			ref.setFromTransport(refAdmTpt.getSerial());
		}
		ref.setAdministeredBy(Global.currentLoggedInUserKey);
		ref.setSerial(Global.currentCensusStatusId);

		ref.setCurrentCenusStatusPrevId(Global.currentCenusStatusPrevId);
		ref.setCurrentCenusStatusNextId(Global.currentCenusStatusNextId);
		try {
			ResidentMain res = MedrexClientManager.getInstance().getResident(
					ref.getResidentId());
			// if(res.getRoom()!=null){
			// String room = res.getRoom();
			// MedrexClientManager.getInstance().insertOrUpdateCensusStatus(ref);
			// ResidentMain res1 =
			// MedrexClientManager.getInstance().getResident(ref.getResidentId());
			// res1.setRoom(room);
			// MedrexClientManager.getInstance().insertOrUpdateResidentMain(res);
			// }else{

			// if(room!=null){

			String room = null;
			String floor = null;
			TempRoomHistory roomHist = null;
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
				int censAdmissionId = Global.currentCensusStatusId;
				if (censAdmissionId != 0) {
					roomHist = MedrexClientManager
							.getInstance()
							.getRoomHistoryAccToCensusAdmission(censAdmissionId);
					floor = roomHist.getFloor();
					room = roomHist.getRoom();
					roomHist.setStartDate(ref.getDateAndTime());
				} else {
					// SwingUtils.openInDialog(new
					// PanelRoomPopUp(controllerRoomList));
					// floor = controllerRoomList.getFloorType();
					// room = controllerRoomList.getRoom();

					JDialog dialog = new JDialog();
					dialog.setModal(true);
					dialog.add(new PanelRoomPopUp(controllerRoomList, ref
							.getDateAndTime()));
					dialog.setSize(
							Toolkit.getDefaultToolkit().getScreenSize().width,
							Toolkit.getDefaultToolkit().getScreenSize().height);
					Global.frameRoomGraphicalView = dialog;
					Global.frameRoomGraphicalView.setVisible(true);

					// floor = controllerRoomList.getFloorType();
					room = controllerRoomList.getRoom();
					// System.out.println("Floor:"+controllerRoomList.getFloorType()+", room:"+controllerRoomList.getRoom());
					roomHist = new TempRoomHistory();
					roomHist.setResidentId(res.getSerial());
					roomHist.setStartDate(ref.getDateAndTime());
				}

				// MedrexClientManager.getInstance().insertOrUpdateCensusStatus(ref);
				/*
				 * if(res.getRoom()==null){ SwingUtils.openInDialog(new
				 * PanelRoomPopUp(controllerRoomList)); floor =
				 * controllerRoomList.getFloorType(); room =
				 * controllerRoomList.getRoom(); }else{ floor =
				 * res.getFloorType(); room = res.getRoom(); }
				 */
				if (room != null) {
					room = room.replaceAll("<(.)+>", "");
				}
				/*
				 * res.setFloorType(floor); res.setRoom(room);
				 */

				floor = null;
				if (!("".equalsIgnoreCase(room))) {
					floor = getFloor(room);
				}
				roomHist.setFloor(floor);
				roomHist.setRoom(room);
			}

			if (room != null) {
				res = MedrexClientManager.getInstance().getResident(
						ref.getResidentId());

				/*
				 * res.setFloorType(floor); res.setRoom(room);
				 */
				res.setAdmittedOn(ref.getDateAndTime());
				MedrexClientManager.getInstance().insertOrUpdateResidentMain(
						res);
				int censusAdmissId = MedrexClientManager.getInstance()
						.insertOrUpdateCensusStatus(ref);
				if (roomHist.getCensusAdmissionId() == 0) {
					roomHist.setCensusAdmissionId(censusAdmissId);
				}
				MedrexClientManager.getInstance().insertOrUpdateRoomHistory(
						roomHist);

				// MedrexClientManager.getInstance().insertOrUpdateResidentMain(res);
				/*
				 * //Room History System.out.println("floor: "+floor+" room: "+
				 * room +" serial: "+ serial); RoomHistory roomHistory = new
				 * RoomHistory(); roomHistory.setCensusId(ref.getSerial());
				 * roomHistory.setResidentId(serial);
				 * roomHistory.setFloor(floor); roomHistory.setRoom(room);
				 * roomHistory.setStartDate(ref.getDateAndTime());
				 * 
				 * int roomserial =
				 * MedrexClientManager.getInstance().insertOrUpdateRoomHistory
				 * (roomHistory);
				 */

				bool = true;
			}

			// update top right resident information
			if (Global.panelCensusMain != null) {
				Global.panelCensusMain.setResident(res);
			}

		} catch (MedrexException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			bool = false;
			// e.printStackTrace();
		} catch (RemoteException re) {
			bool = false;
		}
		return bool;
	}

	public boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		// Date d = dcAdmissionDate.getDate();
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
		// if(cmbAdmissionFromHead.getSelectedItem() == "Select" ||
		// cmbAdmissionFromHead.getSelectedItem() == "Add new...") {
		// vRes.addError("From Field is mandatory."); }
		// if(txtAdmissionFromHead.getText() == null ||
		// txtAdmissionFromHead.getText() == "") {
		// vRes.addError("From Field is mandatory."); }
		int fromId = SwingUtils.getSelectedButton(bgFrom);
		if (fromId == 0) {
			vRes.addError("From Field is mandatory.");
		}
		if (fromId != 2 && fromId != 4) {
			if (txtAdmissionFromSubHead.getText() == null
					|| txtAdmissionFromSubHead.getText() == ""
					|| txtAdmissionFromSubHead.getText().length() == 0) {
				vRes.addError("Name Field is mandatory.");
			}
		}
		// if(cmbAdmissionFromSubHead.getSelectedItem() == "Select" ||
		// cmbAdmissionFromSubHead.getSelectedItem() == "Add new...") {
		// vRes.addError("From Sub Field is mandatory."); }
		// if(cmbAdmissionTransportation.getSelectedItem() == "Select" ||
		// cmbAdmissionTransportation.getSelectedItem() == "Add new...") {
		// vRes.addError("Transportation Field is mandatory."); }
		// if(cmbAdmissionTransportation.getText() == null ||
		// cmbAdmissionTransportation.getText() == "") {
		// vRes.addError("Transportation Field is mandatory."); }
		if (!FieldValidation.isEmpty(vRes)) {
			FieldValidation.Msgbox(vRes, "Census Admission");
			return false;
		} else {
			// JOptionPane.showMessageDialog(this, "Saved successfully!!!",
			// "Census Admission", JOptionPane.INFORMATION_MESSAGE);
			return true;
		}
	}

	/**
	 * to map the room no with wing
	 */

	private static String getFloor(String room) {
		String floor = null;
		for (int i = 0; i < strSubCat1.length; i++) {
			if (strSubCat1[i].equalsIgnoreCase(room)) {
				floor = "1st floor south wing";
				return floor;
			}
		}
		for (int i = 0; i < strSubCat2.length; i++) {
			if (strSubCat2[i].equalsIgnoreCase(room)) {
				floor = "Main North Wing";
				return floor;
			}
		}
		for (int i = 0; i < strSubCat3.length; i++) {
			if (strSubCat3[i].equalsIgnoreCase(room)) {
				floor = "2nd floor South Wing";
				return floor;
			}
		}
		for (int i = 0; i < strSubCat4.length; i++) {
			if (strSubCat4[i].equalsIgnoreCase(room)) {
				floor = "Main and north wing";
				return floor;
			}
		}
		return null;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Admission Details";
	}
}