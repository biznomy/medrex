package medrex.client.census.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.CaretListener;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.PanelResidentInformation;
import medrex.client.main.resident.contactinfo.ControllerResidentInfoContact;
import medrex.client.utils.FieldValidation;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.census.SignOutTo;
import medrex.commons.vo.masterList.Relation;
import medrex.commons.vo.resident.ResidentContact;
import medrex.commons.vo.resident.ResidentContactPhone;
import medrex.commons.vo.resident.ResidentMain;

import org.jdesktop.jxlayer.JXLayer;
import org.jdesktop.jxlayer.plaf.effect.BufferedImageOpEffect;
import org.jdesktop.jxlayer.plaf.ext.LockableUI;

import com.jgoodies.validation.ValidationResult;
import com.jhlabs.image.OpacityFilter;
import com.sX.swing.AbstractBindableListModel;
import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxDrawPanel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTextField;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;

public class PanelCensusSignOut extends PopUpView {

	private JLabel chooseMedicineLabel_4;
	private JLabel chooseMedicineLabel;
	private JLabel lblRelationship_1;
	private JDateChooser dcAnticipatedDate;
	private JLabel chooseMedicineLabel_2;
	private JTextField txtResponsiblePartyPhone;
	private JTextField txtResponsiblePartyHandPhone;
	private JLabel lblPhone;
	private JLabel lblHandPhone;
	private JLabel lblRelationship;
	private JTextField txtResponsiblePartyRelation;
	private JxTextField txtResponsiblePartyName;
	private JLabel lblName;
	private JLabel chooseMedicineLabel_1;
	private JxTextField txtTo;
	private JLabel dateLabel_2;
	private JxComboBox cmbSignOutAmPm;
	private JLabel label_2;
	private JxComboBox cmbSignOutMinutes;
	private JxComboBox cmbSignOutHours;
	private JLabel dateLabel_1;
	private JDateChooser dcSignOutDate;
	private JLabel dateLabel;
	private JxPanel panelContent;
	private JPanel panelMain;

	private static final long serialVersionUID = 1L;

	public static final Color GREEN = new Color(34, 139, 34);
	public static final Color RED = Color.RED;
	public static final Color GRAY = Color.GRAY;
	public static final Color DEFAULT = Color.BLACK;
	private Date currentDate;
	private SignOutTo refSignOutTo;
	// private HashMap MapTo;
	// private List ListTo;

	boolean drawMode;

	int x;

	int y;
	private JPanel panelSubMain;
	private JxButton btnCancel;
	private JxButton btnSave;
	private JLabel lblTitle;
	private PanelResidentInformation panelRight;
	private JPanel panelFooter;
	private JLabel chooseMedicineLabel_3;

	private HashMap<String, Integer> timeMap = new HashMap<String, Integer>();
	private HashMap<Integer, String> timeRevMap = new HashMap<Integer, String>();
	private JxComboBox cmbAnticpatedMinutes;

	private JxButton btnNotes;
	private LockableUI layerUI;
	private JXLayer<JPanel> layerContent;
	private JxDrawPanel signatureCom;
	private Timer timeUpdater;
	private boolean isMain;
	private int resiCtcId;

	public PanelCensusSignOut(boolean isMain) {
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
		lblTitle.setText("Fill in Sign Out Details:");
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
						if (PanelCensusSignOut.this.isMain) {
							Global.panelCensusMain
									.changeCard(PanelCensusMain.DEFAULT);
						} else {
							close();
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
				if (PanelCensusSignOut.this.isMain) {
					if (!layerUI.isLocked()) {
						Global.panelCensusMain
								.changeCard(PanelCensusMain.DEFAULT);
					} else {
						Global.panelCensusMain
								.changeCard(PanelCensusMain.HISTORY);
					}
				} else {
					close();
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
		panelContent.setBounds(0, 0, 596, 363);
		// panelContent.setPreferredSize(new Dimension(610, 325));
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
		layerContent.setBounds(0, 0, 596, 363);
		panelSubMain.add(layerContent);
		// if (Global.currentLoggedInUserType.equals("Administrator"))
		// {
		dateLabel = new JLabel();
		dateLabel.setBounds(20, 322, 67, 31);
		dateLabel.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		dateLabel.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		dateLabel.setText("Date");
		panelContent.add(dateLabel);

		dcSignOutDate = new JDateChooser();
		dcSignOutDate.setDateFormatString("MM/dd/yyyy");
		dcSignOutDate.setBounds(90, 322, 150, 31);
		dcSignOutDate.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		dcSignOutDate.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		dcSignOutDate.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		dcSignOutDate.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		dcSignOutDate.setDate(currentDate);
		panelContent.add(dcSignOutDate);

		dateLabel_1 = new JLabel();
		dateLabel_1.setBounds(260, 322, 56, 31);
		dateLabel_1.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		dateLabel_1.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		dateLabel_1.setText("Time");
		panelContent.add(dateLabel_1);

		cmbSignOutHours = new JxComboBox();
		cmbSignOutHours.setBounds(322, 322, 63, 31);
		cmbSignOutHours.setArc(0.2f);
		cmbSignOutHours.setModel(new DefaultComboBoxModel(new String[] { "01",
				"02", "03", "04", "05", "06", "07", "08", "09", "10", "11",
				"12" }));
		cmbSignOutHours.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		cmbSignOutHours.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		cmbSignOutHours.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		cmbSignOutHours.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		SimpleDateFormat df = new SimpleDateFormat("hh");
		cmbSignOutHours.setSelectedItem(df.format(currentDate));
		cmbSignOutHours.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent e) {
				updateAnticipatedTime();
			}
		});
		panelContent.add(cmbSignOutHours);

		cmbSignOutMinutes = new JxComboBox();
		cmbSignOutMinutes.setBounds(399, 322, 63, 31);
		cmbSignOutMinutes.setArc(0.2f);
		cmbSignOutMinutes.setModel(new DefaultComboBoxModel(new String[] {
				"00", "01", "02", "03", "04", "05", "06", "07", "08", "09",
				"10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
				"20", "21", "22", "23", "24", "25", "26", "27", "28", "29",
				"30", "31", "32", "33", "34", "35", "36", "37", "38", "39",
				"40", "41", "42", "43", "45", "46", "47", "48", "49", "50",
				"51", "52", "53", "54", "55", "56", "57", "58", "59" }));
		cmbSignOutMinutes.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		cmbSignOutMinutes.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		cmbSignOutMinutes.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		cmbSignOutMinutes.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		df = new SimpleDateFormat("mm");
		cmbSignOutMinutes.setSelectedItem(df.format(currentDate));
		cmbSignOutMinutes.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent e) {
				updateAnticipatedTime();
			}
		});
		panelContent.add(cmbSignOutMinutes);

		label_2 = new JLabel();
		label_2.setBounds(385, 322, 6, 31);
		label_2.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		label_2.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		;
		label_2.setText(":");
		panelContent.add(label_2);

		cmbSignOutAmPm = new JxComboBox();
		cmbSignOutAmPm.setBounds(476, 322, 61, 31);
		cmbSignOutAmPm.setArc(0.2f);
		cmbSignOutAmPm.setModel(new DefaultComboBoxModel(new String[] { "AM",
				"PM" }));
		cmbSignOutAmPm.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		cmbSignOutAmPm.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		cmbSignOutAmPm.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		cmbSignOutAmPm.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		df = new SimpleDateFormat("a");
		cmbSignOutAmPm.setSelectedItem(df.format(currentDate));
		cmbSignOutAmPm.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent e) {
				updateAnticipatedTime();
			}
		});
		panelContent.add(cmbSignOutAmPm);

		// }

		dateLabel_2 = new JLabel();
		dateLabel_2.setBounds(20, 10, 56, 31);
		dateLabel_2.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		dateLabel_2.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		dateLabel_2.setText("To");
		panelContent.add(dateLabel_2);

		txtTo = new JxTextField();
		txtTo.setBounds(90, 10, 458, 31);
		txtTo.setArc(0.2f);
		txtTo.setBackground(GuiModes.CHANGE_SCREEN.getControlBackgroundColor());
		txtTo.setForeground(GuiModes.CHANGE_SCREEN.getControlForegroundColor());
		txtTo.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		txtTo.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtTo.setModel(new AbstractBindableListModel<String, SignOutTo>() {
			@Override
			public void addElement(String key) {
				SignOutTo ref = new SignOutTo();
				ref.setName(key);
				try {
					List tmpList = MedrexClientManager.getInstance()
							.getSignOutTos(key);
					if (tmpList == null || tmpList.size() == 0) {
						MedrexClientManager.getInstance()
								.insertOrUpdateSignOutTo(ref);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			@Override
			public List<SignOutTo> getValues(String key) {
				this.records = null;
				try {
					this.records = MedrexClientManager.getInstance()
							.getSignOutTos(key + "%");
					System.out.println(records.size());
				} catch (Exception e) {
					e.printStackTrace();
				}
				return this.records;
			}

			@Override
			public String toString(SignOutTo val) {
				return val.getName();
			}
		});
		txtTo.addPropertyChangeListener(JxTextField.ITEM_CHANGED,
				new PropertyChangeListener() {
					public void propertyChange(PropertyChangeEvent evt) {
						refSignOutTo = (SignOutTo) evt.getNewValue();
					}
				});
		panelContent.add(txtTo);

		chooseMedicineLabel_1 = new JLabel();
		chooseMedicineLabel_1.setBounds(20, 45, 167, 31);
		chooseMedicineLabel_1.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		chooseMedicineLabel_1.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		chooseMedicineLabel_1.setText("Responsible Party");
		panelContent.add(chooseMedicineLabel_1);

		lblName = new JLabel();
		lblName.setBounds(20, 80, 67, 31);
		lblName.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		lblName.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		lblName.setText("Name");
		panelContent.add(lblName);

		txtResponsiblePartyName = new JxTextField();
		txtResponsiblePartyName.setBounds(126, 80, 422, 31);
		txtResponsiblePartyName.setArc(0.2f);
		txtResponsiblePartyName.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		txtResponsiblePartyName.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		txtResponsiblePartyName
				.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		txtResponsiblePartyName.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtResponsiblePartyName
				.setModel(new AbstractBindableListModel<String, Object>() {

					// public void addElement(String key) {
					// ResponsibleParty ref = new ResponsibleParty();
					// ref.setResidentId(Global.panelCensusMain.getResident().getSerial());
					// ref.setLastName(key);
					// try {
					// List tmpList =
					// MedrexClientManager.getInstance().getResponsiblePartys(Global.panelCensusMain.getResident().getSerial(),
					// key);
					// if(tmpList == null || tmpList.size() == 0) {
					// ref = doPrompt(ref);
					// MedrexClientManager.getInstance().insertOrUpdateResponsibleParty(ref);
					// txtResponsiblePartyName.fireObjectChanged(ref);
					// }
					// } catch (Exception e) {
					// e.printStackTrace();
					// }
					// }
					@Override
					public void addElement(String key) {
						String fName = key;
						fName = fName.replaceAll("([a-zA-z0-9])+, ", "");
						key = key.replaceAll(", ([a-zA-z0-9])+", "");
						ResidentContact ref = new ResidentContact();
						if (PanelCensusSignOut.this.isMain) {
							Global.currentResidenceKey = Global.panelCensusMain
									.getResident().getSerial();
						}
						if (PanelCensusSignOut.this.isMain) {
							ResidentMain resmain = new ResidentMain();
							resmain.setSerial(Global.panelCensusMain
									.getResident().getSerial());
							ref.setResidentId(resmain);

							// ref.setResidentId(Global.panelCensusMain
							// .getResident().getSerial());
						} else {
							ResidentMain resmain = new ResidentMain();
							resmain.setSerial(Global.currentResidenceKey);
							ref.setResidentId(resmain);

							// ref.setResidentId(Global.currentResidenceKey);
						}
						ref.setFirstName(fName);
						ref.setLastName(key);
						try {

							List tmpList = null;

							if (PanelCensusSignOut.this.isMain) {
								tmpList = MedrexClientManager.getInstance()
										.getResidentContactsWithSignature(
												Global.panelCensusMain
														.getResident()
														.getSerial(), key);
							} else {
								tmpList = MedrexClientManager
										.getInstance()
										.getResidentContactsWithSignature(
												Global.currentResidenceKey, key);
							}
							if (tmpList == null || tmpList.size() == 0) {
								Object[] refObj = doPrompt(ref);
								if (Global.tmpContact != null) {
									ResidentContact ctcRef = (ResidentContact) refObj[0];
									if (PanelCensusSignOut.this.isMain) {
										ResidentMain resmain = new ResidentMain();
										resmain
												.setSerial(Global.panelCensusMain
														.getResident()
														.getSerial());
										ctcRef.setResidentId(resmain);

										// ctcRef
										// .setResidentId(Global.panelCensusMain
										// .getResident()
										// .getSerial());
									} else {
										ResidentMain resmain = new ResidentMain();
										resmain
												.setSerial(Global.currentResidenceKey);
										ctcRef.setResidentId(resmain);

										// ctcRef
										// .setResidentId(Global.currentResidenceKey);
									}

									ResidentContactPhone ctcPhone = (ResidentContactPhone) refObj[1];
									int serial = (new ControllerResidentInfoContact())
											.insertOrUpdateCensusResidentContact(
													ctcRef.getFirstName(),
													ctcRef.getLastName(),
													ctcRef.getRelationship()
															+ "", ctcPhone
															.getNumber(),
													ctcRef.getSignature());
									// MedrexClientManager.getInstance().insertOrUpdateResidentContact(ref);
									ctcRef.setSerial(serial);
									txtResponsiblePartyName
											.fireObjectChanged(ctcRef);
								}
							}
						} catch (Exception e) {
							e.printStackTrace();
						}
					}

					@Override
					public List<Object> getValues(String key) {
						new ArrayList();
						this.records = null;
						try {
							// this.records =
							// MedrexClientManager.getInstance().getResponsiblePartys(Global.panelCensusMain.getResident().getSerial(),
							// key + "%");
							if (PanelCensusSignOut.this.isMain) {
								// key = key.replaceAll(", ", "");
								System.out.println("Key is :" + key);
								this.records = MedrexClientManager
										.getInstance()
										.getResidentContactsWithSignature(
												Global.panelCensusMain
														.getResident()
														.getSerial(), key + "%");
							} else {
								key = key.replaceAll(", ([a-zA-z0-9])+", "");
								this.records = MedrexClientManager
										.getInstance()
										.getResidentContactsWithSignature(
												Global.currentResidenceKey,
												key + "%");
							}
						}
						// if(resiContacts != null && resiContacts.size() >
						// 0) {
						// this.records.addAll(resiContacts);
						// }
						catch (Exception e) {
							e.printStackTrace();
						}
						return this.records;
					}

					@Override
					public String toString(Object val) {
						// if(val instanceof ResponsibleParty) {
						// ResponsibleParty resP = (ResponsibleParty) val;
						// return resP.getLastName() + ", " +
						// resP.getFirstName();
						// }
						if (val instanceof ResidentContact) {
							ResidentContact resiC = (ResidentContact) val;
							return resiC.getLastName() + ", "
									+ resiC.getFirstName();
						}
						return val.toString();
					}
				});
		// txtResponsiblePartyName.addCaretListener(new CaretListener(){
		// public void caretUpdate(CaretEvent e) {
		// txtResponsiblePartyName.getText();
		// }
		// });
		txtResponsiblePartyName.addPropertyChangeListener(
				JxTextField.ITEM_CHANGED, new PropertyChangeListener() {
					public void propertyChange(PropertyChangeEvent evt) {
						Object obj = evt.getNewValue();
						// if(obj instanceof ResponsibleParty) {
						// ResponsibleParty ref = (ResponsibleParty) obj;
						// txtResponsiblePartyName.setText(ref.getLastName() +
						// ", " + ref.getFirstName());
						// txtResponsiblePartyRelation.setText(ref.getRelationship());
						// txtResponsiblePartyPhone.setNumber(ref.getContactNumber());
						// }
						if (obj instanceof ResidentContact) {
							ResidentContact ref = (ResidentContact) obj;
							txtResponsiblePartyRelation.setText(ref
									.getRelationship().toString());
							signatureCom.setImagefromImageIcon(ref
									.getSignature());
							// System.out.println("sign: " +
							// ref.getSignature());
							txtResponsiblePartyPhone.setText("");
							try {
								ResidentContactPhone ctcPh = MedrexClientManager
										.getInstance()
										.getResidentContactPhonePrimary(
												ref.getSerial());
								if ((ctcPh.getType().toString()
										.equals("Landline(Home)"))
										|| (ctcPh.getType().toString()
												.equals("Landline(Office)"))) {
									txtResponsiblePartyPhone.setText(ctcPh
											.getNumber());
								}
								if (ctcPh.getType().toString().equals(
										"HandPhone")) {
									txtResponsiblePartyHandPhone.setText(ctcPh
											.getNumber());
								}
							} catch (Exception e) {
								// e.printStackTrace();
							}
						}

						if (obj instanceof Object[]) {
							Object[] objArr = (Object[]) obj;
							ResidentContact ref = (ResidentContact) objArr[0];
							txtResponsiblePartyRelation.setText(ref
									.getRelationship().toString());
							signatureCom.setImagefromImageIcon(ref
									.getSignature());
							// System.out.println("sign[]: " +
							// ref.getSignature());

							ResidentContactPhone refPhone = (ResidentContactPhone) objArr[1];
							if ((refPhone.getType().toString()
									.equals("Landline(Home)"))
									|| (refPhone.getType().toString()
											.equals("Landline(Office)"))) {
								txtResponsiblePartyPhone.setText(refPhone
										.getNumber());
							}
							if (refPhone.getType().toString().equals(
									"HandPhone")) {
								txtResponsiblePartyHandPhone.setText(refPhone
										.getNumber());
							}
						}
					}
				});
		panelContent.add(txtResponsiblePartyName);

		txtResponsiblePartyRelation = new JTextField();
		txtResponsiblePartyRelation.setBounds(126, 120, 211, 31);
		txtResponsiblePartyRelation.setEditable(false);
		txtResponsiblePartyRelation.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		txtResponsiblePartyRelation.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		txtResponsiblePartyRelation.setFont(GuiModes.CHANGE_SCREEN
				.getControlFont());
		txtResponsiblePartyRelation.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		panelContent.add(txtResponsiblePartyRelation);

		lblRelationship = new JLabel();
		lblRelationship.setBounds(20, 120, 100, 31);
		lblRelationship.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		lblRelationship.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		lblRelationship.setText("Relationship");
		panelContent.add(lblRelationship);

		lblPhone = new JLabel();
		lblPhone.setBounds(20, 160, 67, 31);
		lblPhone.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		lblPhone.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		lblPhone.setText("Phone");
		panelContent.add(lblPhone);

		txtResponsiblePartyPhone = new JTextField();
		txtResponsiblePartyPhone.setBounds(126, 160, 211, 31);
		txtResponsiblePartyPhone.setEditable(false);
		txtResponsiblePartyPhone.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		txtResponsiblePartyPhone.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		txtResponsiblePartyPhone.setFont(GuiModes.CHANGE_SCREEN
				.getControlFont());
		txtResponsiblePartyPhone.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		panelContent.add(txtResponsiblePartyPhone);

		lblHandPhone = new JLabel();
		lblHandPhone.setBounds(20, 200, 114, 31);
		lblHandPhone.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		lblHandPhone.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		lblHandPhone.setText("Hand Phone");
		panelContent.add(lblHandPhone);

		txtResponsiblePartyHandPhone = new JTextField();
		txtResponsiblePartyHandPhone.setBounds(126, 200, 211, 31);
		txtResponsiblePartyHandPhone.setEditable(false);
		txtResponsiblePartyHandPhone.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		txtResponsiblePartyHandPhone.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		txtResponsiblePartyHandPhone.setFont(GuiModes.CHANGE_SCREEN
				.getControlFont());
		txtResponsiblePartyHandPhone.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		panelContent.add(txtResponsiblePartyHandPhone);

		chooseMedicineLabel_2 = new JLabel();
		chooseMedicineLabel_2.setBounds(20, 240, 220, 31);
		chooseMedicineLabel_2.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		chooseMedicineLabel_2.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		chooseMedicineLabel_2.setText("How long are you going out");
		panelContent.add(chooseMedicineLabel_2);

		chooseMedicineLabel_3 = new JLabel();
		chooseMedicineLabel_3.setBounds(19, 280, 280, 31);
		chooseMedicineLabel_3.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		chooseMedicineLabel_3.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		chooseMedicineLabel_3.setText("Anticipated Date Of Return");
		panelContent.add(chooseMedicineLabel_3);

		dcAnticipatedDate = new JDateChooser();
		dcAnticipatedDate.setDateFormatString("MM/dd/yyyy hh:mm:ss a");
		dcAnticipatedDate.setBounds(250, 280, 288, 31);
		// dcAnticipatedDate.getComponent(0).setEnabled(false);
		dcAnticipatedDate.remove(dcAnticipatedDate.getComponent(0));
		dcAnticipatedDate.setFocusable(false);
		final JTextFieldDateEditor dateEditor = (JTextFieldDateEditor) dcAnticipatedDate
				.getDateEditor();
		dateEditor.setEditable(false);
		final CaretListener[] caretListeners = dateEditor.getCaretListeners();
		for (int i = 0; i < caretListeners.length; i++) {
			dateEditor.removeCaretListener(caretListeners[i]);
		}
		dateEditor.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		dateEditor.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		// dcAnticipatedDate.setEnabled(false);
		dcAnticipatedDate.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		dcAnticipatedDate.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		dcAnticipatedDate.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		dcAnticipatedDate.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		panelContent.add(dcAnticipatedDate);

		lblRelationship_1 = new JLabel();
		lblRelationship_1.setBounds(350, 130, 100, 31);
		lblRelationship_1.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		lblRelationship_1.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		lblRelationship_1.setText("Signature");
		panelContent.add(lblRelationship_1);

		// signatureCom = new JxDrawPanel(196, 68);
		// signatureCom.setBounds(352, 168, 196, 68);
		// signatureCom.setBackground(Color.WHITE);
		// signatureCom.setBorder(new
		// CompoundBorder(GuiModes.CHANGE_SCREEN.getControlBorder(), new
		// EmptyBorder(1,1,1,1)));
		// panelContent.add(signatureCom);

		// dcSignOutDate.setDate(currentDate);
		// dcAnticipatedDate.setDate(currentDate);
		// SimpleDateFormat df = new SimpleDateFormat("hh");
		// cmbSignOutHours.setSelectedItem(df.format(currentDate));
		// df.applyPattern("mm");
		// cmbSignOutMinutes.setSelectedItem(df.format(currentDate));
		// df.applyPattern("a");
		// cmbSignOutAmPm.setSelectedItem(df.format(currentDate));

		cmbAnticpatedMinutes = new JxComboBox();
		cmbAnticpatedMinutes.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent e) {
				updateAnticipatedTime();
			}
		});
		cmbAnticpatedMinutes.setBounds(260, 240, 203, 31);
		cmbAnticpatedMinutes.setArc(0.2f);
		cmbAnticpatedMinutes.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		cmbAnticpatedMinutes.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		cmbAnticpatedMinutes.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		cmbAnticpatedMinutes.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		panelContent.add(cmbAnticpatedMinutes);

		final JPanel panel = new JPanel();
		panel.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		panel.setLayout(null);
		panel.setBounds(352, 163, 196, 68);
		panelContent.add(panel);

		signatureCom = new JxDrawPanel(189, 62);
		signatureCom.setBounds(3, 3, 189, 62);
		signatureCom.setEnabled(false);
		panel.add(signatureCom);
		signatureCom.setBackground(Color.WHITE);
		signatureCom.setBorder(new CompoundBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder(), new EmptyBorder(1, 1, 1, 1)));

		chooseMedicineLabel = new JLabel();
		chooseMedicineLabel.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		chooseMedicineLabel.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		chooseMedicineLabel.setBounds(20, 322, 130, 31);
		panelContent.add(chooseMedicineLabel);

		chooseMedicineLabel_4 = new JLabel();
		chooseMedicineLabel_4.setText("");
		chooseMedicineLabel_4.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		chooseMedicineLabel_4.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		chooseMedicineLabel_4.setBounds(167, 322, 380, 31);
		panelContent.add(chooseMedicineLabel_4);

		// setSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
		// setPreferredSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
		// panelMain.setBounds(0,0,500,360);
		// panelMain.setBounds(SwingUtils.centerRectangle(this.getBounds(),
		// panelMain.getBounds()));
		// panelContent.setBounds(10, 136, 1031, 578);
		// dateLabel.setBounds(20, 20, 67, 31);
		// dcSignOutDate.setBounds(90, 20, 150, 31);
		// dcSignOutDate.getCalendarButton().setPreferredSize(null);
		// dcSignOutDate.getCalendarButton().setMinimumSize(null);
		// dcSignOutDate.getCalendarButton().setMaximumSize(null);
		// dateLabel_1.setBounds(281, 20, 56, 31);
		// cmbSignOutHours.setBounds(343, 20, 63, 31);
		// cmbSignOutMinutes.setBounds(418, 20, 63, 31);
		// label_2.setBounds(409, 20, 6, 31);
		// cmbSignOutAmPm.setBounds(487, 20, 61, 31);
		// dateLabel_2.setBounds(20, 57, 56, 31);
		// txtTo.setBounds(90, 57, 458, 31);
		// chooseMedicineLabel_1.setBounds(20, 94, 426, 31);
		// lblName.setBounds(20, 131, 67, 31);
		// txtResponsiblePartyName.setBounds(90, 131, 150, 31);
		// txtResponsiblePartyRelation.setBounds(352, 130, 196, 31);
		// lblRelationship.setBounds(246, 131, 100, 31);
		// lblPhone.setBounds(20, 168, 67, 31);
		// txtResponsiblePartyPhone.setBounds(90, 168, 150, 31);
		// chooseMedicineLabel_2.setBounds(20, 205, 248, 31);
		// dcAnticipatedDate.setBounds(90, 242, 185, 31);
		// dcAnticipatedDate.getCalendarButton().setMinimumSize(null);
		// dcAnticipatedDate.getCalendarButton().setMaximumSize(null);
		// dcAnticipatedDate.getCalendarButton().setPreferredSize(null);
		// dateLabel_4.setBounds(281, 239, 56, 31);
		// cmbAnticipatedHours.setBounds(343, 238, 63, 31);
		// label_3.setBounds(409, 238, 6, 31);
		// cmbAnticipatedMinutes.setBounds(418, 238, 63, 31);
		// cmbAnticipatedAmPm.setBounds(487, 238, 61, 31);
		// dateLabel_3.setBounds(20, 242, 56, 31);
		// lblRelationship_1.setBounds(246, 168, 100, 31);
		// panel.setBounds(352, 167, 196, 55);
		// panelKeyboard.setVisible(false);

		fillCombos();

		timeUpdater = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateAnticipatedTime();
			}
		});
		updateData();
		timeUpdater.setRepeats(true);

	}

	protected void updateAnticipatedTime() {
		int h = 0, m = 0;
		// if(Global.currentLoggedInUserType.equals("Administrator")){
		Date tmpDate = dcSignOutDate.getDate();
		h = Integer.parseInt(cmbSignOutHours.getSelectedItem().toString());
		m = Integer.parseInt(cmbSignOutMinutes.getSelectedItem().toString());
		m += timeMap.get(cmbAnticpatedMinutes.getSelectedItem());
		if ((cmbSignOutAmPm.getSelectedItem() + "").contains("PM")) {
			h += 12;
		}
		tmpDate.setHours(h);
		tmpDate.setMinutes(m);
		dcAnticipatedDate.setDate(tmpDate);
		// }

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
		// 0, 0, 610, 325
		layerContent.setBounds(SwingUtils.centerRectangle(panelSubMain
				.getBounds(), new Rectangle(0, 0, 596, 363)));
		panelContent.setSize(596, 363);

		if (getTopLevelAncestor() != null) {
			getTopLevelAncestor().repaint();
		} else {
			this.repaint();
		}
		// updateToCombo();

		btnSave.setText("");
		btnSave.setText("SAVE");
	}

	private int getSignOutToId() {
		int signOutToId = 0;
		List headList;
		try {
			headList = MedrexClientManager.getInstance().getSignOutTos(
					txtTo.getText());
		} catch (Exception e) {
			e.printStackTrace();
			return signOutToId;
		}
		if (headList != null && headList.size() > 0) {
			signOutToId = ((SignOutTo) headList.get(0)).getSerial();
		}
		return signOutToId;
	}

	private void fillCombos() {
		String[] key = new String[] { "15 mins.", "30 mins.", "45 mins.",
				"1 hr.", "1 hr. 15 mins.", "1 hr. 30 mins.", "1 hr. 45 mins.",
				"2 hrs.", "2 hrs. 15 mins.", "2 hrs. 30 mins.",
				"2 hrs. 45 mins.", "3 hrs.", "3 hrs. 15 mins.",
				"3 hrs. 30 mins.", "3 hrs. 45 mins.", "4 hrs.",
				"4 hrs. 15 mins.", "4 hrs. 30 mins.", "4 hrs. 45 mins.",
				"5 hrs.", "5 hrs. 15 mins.", "5 hrs. 30 mins.",
				"5 hrs. 45 mins.", "6 hrs.", "6 hrs. 15 mins.",
				"6 hrs. 30 mins.", "6 hrs. 45 mins.", "7 hrs.",
				"7 hrs. 15 mins.", "7 hrs. 30 mins.", "7 hrs. 45 mins.",
				"8 hrs." };
		cmbAnticpatedMinutes.setModel(new DefaultComboBoxModel(key));

		timeMap.clear();
		timeRevMap.clear();
		for (int i = 0, value = 15; i < key.length; i++, value += 15) {
			timeMap.put(key[i], new Integer(value));
			timeRevMap.put(new Integer(value), key[i]);
		}

		cmbAnticpatedMinutes.setSelectedItem("15 mins.");
		updateAnticipatedTime();
	}

	/*
	 * private void updateToCombo() { Iterator i = null; MapTo = null; try {
	 * txtTo.removeAllItems(); txtTo.insertItemAt("Select", 0); MapTo = new
	 * HashMap(); ListTo = SignOutToDAO.getInstance().getSignOutTos(); i =
	 * ListTo.iterator(); while(i.hasNext()) { SignOutTo ref = (SignOutTo)
	 * i.next(); txtTo.addItem(ref.getName()); MapTo.put(ref.getName(),
	 * ref.getSerial()); } } catch (MedrexException e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); } txtTo.addItem("Add new...");
	 * txtTo.setSelectedIndex(0); }
	 */

	// private ResponsibleParty doPrompt(ResponsibleParty ref) {
	// BeanEditor editor = null;
	// try {
	// editor = BeanEditor.getInstance(ref);
	// } catch (Exception e1) {
	// e1.printStackTrace();
	// }
	//		
	// editor.setFieldVisible("serial", false);
	// editor.setFieldVisible("residentId", false);
	// editor.setFieldComponent("contactNumber", new PhoneField(), "getNumber",
	// "setNumber", String.class);
	//		
	// final JDialog dialog = editor.getDialog();
	// SwingUtils.center(dialog);
	// dialog.setVisible(true);
	//		
	// ResponsibleParty retRef = ref;
	// retRef = (ResponsibleParty) editor.getBean();
	// return retRef;
	// }
	private Object[] doPrompt(ResidentContact ref) {

		ResidentContactPhone refCtcPhone = new ResidentContactPhone();

		Global.tmpContact = null;
		Global.tmpContactPhone = null;
		FrameCensusSignOutContact dialog = new FrameCensusSignOutContact();
		SwingUtils.center(dialog);
		if (ref != null) {
			// System.out.println("ref.getRelationship(): "+
			// ref.getRelationship());
			resiCtcId = ref.getSerial();
			dialog.setValues(ref.getFirstName(), ref.getLastName(), ref
					.getRelationship().toString(), "", ref.getSignature());
		}

		dialog.setVisible(true);

		ref = Global.tmpContact;
		refCtcPhone = Global.tmpContactPhone;

		return new Object[] { ref, refCtcPhone };
	}

	public boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		if (txtTo.getText() == null || txtTo.getText() == ""
				|| txtTo.getText().length() == 0) {
			vRes.addError("To Field is mandatory.");
		}
		if (txtResponsiblePartyName.getText() == null
				|| txtResponsiblePartyName.getText() == ""
				|| txtResponsiblePartyName.getText().length() == 0) {
			vRes.addError("Resposible Party Field is mandatory.");
		}

		if (!FieldValidation.isEmpty(vRes)) {
			FieldValidation.Msgbox(vRes, "Admission Record");
			return false;
		} else {
			// JOptionPane.showMessageDialog(this, "Saved successfully!!!");
			return true;
		}
	}

	public void updateData() {
		CensusStatus ref = null;

		if (Global.currentCensusStatusId != 0) {
			btnNotes.setVisible(true);
			btnSave.setVisible(false);
			layerUI.setLocked(true);
			btnCancel.setText("DONE");
			timeUpdater.stop();

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
				if (ref.getTypeName().equalsIgnoreCase("Sign Out")) {
					// dcSignOutDate.setDate(ref.getDateAndTime());
					// dcAnticipatedDate.setDate(ref.getAnticipatedDateAndTime());
					// SimpleDateFormat df = new SimpleDateFormat("hh");
					// cmbSignOutHours.setSelectedItem(df.format(ref
					// .getDateAndTime()));
					// //
					// cmbAnticipatedHours.setSelectedItem(df.format(ref.getDateAndTime()));
					// // df.applyPattern("mm");
					// cmbSignOutMinutes.setSelectedItem(df.format(ref
					// .getDateAndTime()));
					// //
					// cmbAnticipatedMinutes.setSelectedItem(df.format(ref.getDateAndTime()));
					// // df.applyPattern("a");
					// cmbSignOutAmPm.setSelectedItem(df.format(ref
					// .getDateAndTime()));
					// //
					// cmbAnticipatedAmPm.setSelectedItem(df.format(ref.getDateAndTime()));

					SignOutTo sot = MedrexClientManager.getInstance()
							.getSignOutTo(ref.getSignOutToId());
					txtTo.setText(sot.getName());

					ResidentContact resiCtc = MedrexClientManager.getInstance()
							.getResidentContact(ref.getResidentContactId());
					txtResponsiblePartyName.setText(resiCtc.getLastName()
							+ ", " + resiCtc.getFirstName());
					txtResponsiblePartyRelation.setText(resiCtc
							.getRelationship()
							+ "");

					resiCtcId = resiCtc.getSerial();

					signatureCom.setImagefromImageIcon(resiCtc.getSignature());

					try {
						ResidentContactPhone ctcPh = MedrexClientManager
								.getInstance().getResidentContactPhonePrimary(
										resiCtc.getSerial());
						if ((ctcPh.getType().toString()
								.equals("Landline(Home)"))
								|| (ctcPh.getType().toString()
										.equals("Landline(Office)"))) {
							txtResponsiblePartyPhone.setText(ctcPh.getNumber());
						}
						if (ctcPh.getType().toString().equals("HandPhone")) {
							txtResponsiblePartyHandPhone.setText(ctcPh
									.getNumber());
						}
						// txtResponsiblePartyRelation.setText(ctcPh.getNumber());
						// txtResponsiblePartyPhone.updateUI();
					} catch (Exception e) {
						// e.printStackTrace();
					}

					cmbAnticpatedMinutes.setFocusable(false);
					cmbAnticpatedMinutes.setSelectedItem(timeRevMap.get(ref
							.getAnticipatedMins()));

					// ResidentContactPhone resiCtcPhone =
					// MedrexClientManager.getInstance()
					// .getResidentContactPhonePrimary(ref
					// .getResidentContactId());
					// txtResponsiblePartyPhone
					// .setNumber(resiCtcPhone.getNumber());
					if (Global.currentLoggedInUserType.equals("Administrator")) {
						SimpleDateFormat df = new SimpleDateFormat("hh");
						cmbSignOutHours.setVisible(true);
						cmbSignOutHours.setSelectedItem(df.format(ref
								.getDateAndTime()));
						df = new SimpleDateFormat("mm");
						cmbSignOutMinutes.setVisible(true);
						cmbSignOutMinutes.setSelectedItem(df.format(ref
								.getDateAndTime()));
						df = new SimpleDateFormat("a");
						cmbSignOutAmPm.setVisible(true);
						cmbSignOutAmPm.setSelectedItem(df.format(ref
								.getDateAndTime()));
						label_2.setVisible(true);
						dateLabel_1.setVisible(true);
						dateLabel.setVisible(true);
						dcSignOutDate.setVisible(true);
						btnSave.setVisible(true);
						layerUI.setLocked(false);
						dcSignOutDate.setDate(ref.getDateAndTime());
					} else {
						chooseMedicineLabel.setText("Signed Out On");
						chooseMedicineLabel_4.setText(ref.getDateAndTime()
								.toString());
						btnSave.setVisible(false);
						layerUI.setLocked(true);
					}

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {

			timeUpdater.start();
			btnNotes.setVisible(false);
			resiCtcId = 0;

			btnCancel.setText("CANCEL");
			cmbAnticpatedMinutes.setFocusable(true);
		}
		if (!Global.currentLoggedInUserType.equals("Administrator")) {
			chooseMedicineLabel.setText("Signed Out On");
			chooseMedicineLabel_4.setText(dcSignOutDate.getDate() + "");
			dcSignOutDate.setVisible(false);
			dateLabel.setVisible(false);
			dateLabel_1.setVisible(false);
			cmbSignOutHours.setVisible(false);
			cmbSignOutMinutes.setVisible(false);
			label_2.setVisible(false);
			cmbSignOutAmPm.setVisible(false);
		}

	}

	public boolean doSave() {
		boolean bool = false;
		// Date d = dcSignOutDate.getDate();
		// int hrs = Integer.parseInt((String)
		// cmbSignOutHours.getSelectedItem());
		// if (((String)
		// cmbSignOutAmPm.getSelectedItem()).equalsIgnoreCase("PM")) {
		// hrs += 12;
		// }
		// d.setHours(hrs);
		// d.setMinutes(Integer.parseInt((String) cmbSignOutMinutes
		// .getSelectedItem()));

		CensusStatus ref = new CensusStatus();
		if (isMain) {
			ref.setResidentId(Global.panelCensusMain.getResident().getSerial());
		} else {
			ref.setResidentId(Global.currentResidenceKey);
		}

		if (Global.currentLoggedInUserType.equals("Administrator")) {
			Date d = dcSignOutDate.getDate();
			int hrs;
			hrs = Integer.parseInt((String) cmbSignOutHours.getSelectedItem());
			if (((String) cmbSignOutAmPm.getSelectedItem())
					.equalsIgnoreCase("PM"))
				if (hrs != 12)
					hrs += 12;
			d.setHours(hrs);
			d.setMinutes(Integer.parseInt((String) cmbSignOutMinutes
					.getSelectedItem()));
			ref.setDateAndTime(d);
		} else {
			ref.setDateAndTime(MedrexClientManager.getServerTime());
		}
		ref.setAdministeredBy(Global.currentLoggedInUserKey);
		ref.setTypeName("Sign Out");

		/*
		 * if(txtResponsiblePartyPhone.getNumber().equalsIgnoreCase("") ||
		 * txtResponsiblePartyRelation.getText().equalsIgnoreCase("")) { String
		 * key = txtResponsiblePartyName.getText(); ResponsibleParty refResp =
		 * new ResponsibleParty();
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * refResp.setResidentId(Global.panelCensusMain.getResident().getSerial()
		 * ); refResp.setLastName(key); try { List tmpList =
		 * MedrexClientManager.getInstance().getResponsiblePartys
		 * (Global.panelCensusMain.getResident().getSerial(), key); if(tmpList
		 * == null || tmpList.size() == 0) { refResp = doPrompt(refResp);
		 * MedrexClientManager
		 * .getInstance().insertOrUpdateResponsibleParty(refResp);
		 * txtResponsiblePartyName.fireObjectChanged(refResp); } } catch
		 * (Exception e) { e.printStackTrace(); } }
		 */

		ResidentContact refResp = new ResidentContact();
		refResp.setSerial(resiCtcId);
		// if (txtResponsiblePartyPhone.getNumber().equalsIgnoreCase("")
		// || txtResponsiblePartyRelation.getText().equalsIgnoreCase("")) {
		String key = txtResponsiblePartyName.getText();

		// key = key.replaceAll(", ([a-zA-z0-9])+", "");
		if (isMain) {
			ResidentMain resmain = new ResidentMain();
			resmain.setSerial(Global.panelCensusMain.getResident().getSerial());
			refResp.setResidentId(resmain);

			// refResp.setResidentId(Global.panelCensusMain.getResident()
			// .getSerial());
		} else {
			ResidentMain resmain = new ResidentMain();
			resmain.setSerial(Global.currentResidenceKey);
			refResp.setResidentId(resmain);

			// refResp.setResidentId(Global.currentResidenceKey);
		}
		key = key.replaceAll(" ", "");
		String lastName = key.substring(0, key.lastIndexOf(","));
		String firstName = key
				.substring(key.lastIndexOf(",") + 1, key.length());

		refResp.setFirstName(firstName);
		refResp.setLastName(lastName);

		// System.out.println("txtResponsiblePartyRelation: "+txtResponsiblePartyRelation.getText());
		int id = 0;
		try {
			id = MedrexClientManager.getInstance().getMasterList(
					Relation.class,
					txtResponsiblePartyRelation.getText().trim());
		} catch (Exception e) {
		}
		Relation relation = new Relation();
		relation.setId(id);
		refResp.setRelationship(relation);

		if (isMain) {
			Global.currentResidenceKey = Global.panelCensusMain.getResident()
					.getSerial();
		}
		try {
			List tmpList = null;
			if (isMain) {
				tmpList = MedrexClientManager.getInstance()
						.getResidentContacts(
								Global.panelCensusMain.getResident()
										.getSerial(), key);
			} else {
				tmpList = MedrexClientManager.getInstance()
						.getResidentContacts(Global.currentResidenceKey, key);
			}

			// System.out.println(tmpList + ", " +
			// Global.panelCensusMain.getResident().getSerial() + ", " + key);
			if (tmpList == null || tmpList.size() == 0) {
				if (txtResponsiblePartyRelation.getText().equalsIgnoreCase("")) {
					Object[] refObj = doPrompt(refResp);
					if (Global.tmpContact != null) {
						ResidentContact ctcRef = Global.tmpContact;
						ResidentContactPhone ctcPhone = (ResidentContactPhone) refObj[1];
						System.out
								.println("ctcRef.getRelationship().toString():"
										+ ctcRef.getRelationship().toString());
						System.out.println("ctcPhone: " + ctcPhone.getNumber());
						int serial = (new ControllerResidentInfoContact())
								.insertOrUpdateCensusResidentContact(ctcRef
										.getFirstName(), ctcRef.getLastName(),
										ctcRef.getRelationship().toString(),
										ctcPhone.getNumber(), ctcRef
												.getSignature());

						refResp.setSerial(serial);
						// refResp = doPrompt(refResp);
						// MedrexClientManager.getInstance().insertOrUpdateResidentContact(refResp);
						txtResponsiblePartyName.fireObjectChanged(refResp);
					} else {
						JOptionPane.showMessageDialog(null,
								"Please fill in contact details");
						return false;
					}
				} else {
					ResidentContact cont = MedrexClientManager.getInstance()
							.getResidentContact(refResp.getLastName(),
									refResp.getFirstName());
					refResp.setSerial(cont.getSerial());
				}

			} else if (tmpList.size() > 0) {
				refResp = (ResidentContact) tmpList.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// }
		System.out.println("refResp.getSerial(): " + refResp.getSerial());
		ref.setResidentContactId(refResp.getSerial());

		// d = dcAnticipatedDate.getDate();
		// hrs = Integer.parseInt((String) cmbSignOutHours.getSelectedItem());
		// if(((String)
		// cmbAnticipatedAmPm.getSelectedItem()).equalsIgnoreCase("PM")) { hrs
		// += 12; }
		// d.setHours(hrs);
		// d.setMinutes(Integer.parseInt((String)
		// cmbAnticipatedMinutes.getSelectedItem()));
		ref.setAnticipatedDateAndTime(dcAnticipatedDate.getDate());
		ref.setAnticipatedMins(timeMap.get(cmbAnticpatedMinutes
				.getSelectedItem()));

		SignOutTo refSignOutTo_01 = new SignOutTo();
		refSignOutTo_01.setName(txtTo.getText());
		try {
			List tmpList = MedrexClientManager.getInstance().getSignOutTos(
					txtTo.getText());
			if (tmpList == null || tmpList.size() == 0) {
				MedrexClientManager.getInstance().insertOrUpdateSignOutTo(
						refSignOutTo_01);
			} else {
				refSignOutTo_01 = (SignOutTo) tmpList.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		ref.setSignOutToId(refSignOutTo_01.getSerial());
		ref.setSerial(Global.currentCensusStatusId);

		ref.setCurrentCenusStatusPrevId(Global.currentCenusStatusPrevId);
		ref.setCurrentCenusStatusNextId(Global.currentCenusStatusNextId);

		ref.setSignature(signatureCom.getImageIcon());
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
			if (num != 1) {
				MedrexClientManager.getInstance().insertOrUpdateCensusStatus(
						ref);
				bool = true;
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

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Sign Out";
	}

}