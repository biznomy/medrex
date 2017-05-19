package medrex.client.census.ui;

import java.awt.BorderLayout;
import java.awt.Color;
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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

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
import com.sX.swing.JxPanel;
import com.sX.swing.JxTextField;
import com.toedter.calendar.JDateChooser;

public class PanelCensusSignIn extends PopUpView {

	private JLabel lblName_New2;
	private JLabel lblName_New1;
	private PanelResidentInformation panelRight;
	private JPanel panelSubMain;
	private JxTextField txtResponsiblePartyName;
	private JLabel lblName;
	private JxComboBox cmbSignInAmPm;
	private JLabel label_2;
	private JxComboBox cmbSignInMinutes;
	private JxComboBox cmbSignInHours;
	private JLabel dateLabel_1;
	private JDateChooser dcSignInDate;
	private JLabel dateLabel;
	private JxPanel panelContent;
	private JPanel panelMain;

	private static final long serialVersionUID = 1L;

	public static final Color GREEN = new Color(34, 139, 34);
	public static final Color RED = Color.RED;
	public static final Color GRAY = Color.GRAY;
	public static final Color DEFAULT = Color.BLACK;
	private Date currentDate;
	private JxButton btnCancel;
	private JxButton btnSave;
	private JxButton btnNotes;
	private JPanel panelFooter;
	private JLabel lblTitle;
	private LockableUI layerUI;
	private JXLayer<JPanel> layerContent;

	boolean isMain;

	public PanelCensusSignIn(boolean isMain) {
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
		lblTitle.setText("Fill in Sign In Details:");
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
						if (PanelCensusSignIn.this.isMain) {
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
				if (PanelCensusSignIn.this.isMain) {
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
		panelContent.setBounds(0, 0, 528, 90);
		// panelContent.setBounds(0, 0, 528, 108);
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
		layerContent.setBounds(0, 0, 528, 108);
		panelSubMain.add(layerContent);
		if (Global.currentLoggedInUserType.equals("Administrator")) {
			dateLabel = new JLabel();
			dateLabel.setBounds(31, 60, 50, 31);
			dateLabel.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
			dateLabel.setForeground(GuiModes.CHANGE_SCREEN
					.getDefaultForegroundColor());
			dateLabel.setText("Date");
			panelContent.add(dateLabel);

			dcSignInDate = new JDateChooser();
			dcSignInDate.setBounds(87, 58, 150, 30);
			dcSignInDate.setDateFormatString("MM/dd/yyyy");
			dcSignInDate.setBackground(GuiModes.CHANGE_SCREEN
					.getControlBackgroundColor());
			dcSignInDate.setForeground(GuiModes.CHANGE_SCREEN
					.getControlForegroundColor());
			dcSignInDate.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
			dcSignInDate.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
			dcSignInDate.getDateEditor().setEnabled(true);
			dcSignInDate.setDate(currentDate);
			panelContent.add(dcSignInDate);

			dateLabel_1 = new JLabel();
			dateLabel_1.setBounds(253, 60, 50, 31);
			dateLabel_1.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
			dateLabel_1.setForeground(GuiModes.CHANGE_SCREEN
					.getDefaultForegroundColor());
			dateLabel_1.setText("Time");
			panelContent.add(dateLabel_1);

			cmbSignInHours = new JxComboBox();
			cmbSignInHours.setBounds(309, 58, 63, 31);
			cmbSignInHours.setArc(0.2f);
			cmbSignInHours.setModel(new DefaultComboBoxModel(new String[] {
					"01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
					"11", "12" }));
			cmbSignInHours.setBackground(GuiModes.CHANGE_SCREEN
					.getControlBackgroundColor());
			cmbSignInHours.setForeground(GuiModes.CHANGE_SCREEN
					.getControlForegroundColor());
			cmbSignInHours.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
			cmbSignInHours.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
			SimpleDateFormat df = new SimpleDateFormat("hh");
			cmbSignInHours.setSelectedItem(df.format(currentDate));
			panelContent.add(cmbSignInHours);

			cmbSignInMinutes = new JxComboBox();
			cmbSignInMinutes.setBounds(378, 58, 60, 31);
			cmbSignInMinutes.setArc(0.2f);
			cmbSignInMinutes.setModel(new DefaultComboBoxModel(new String[] {
					"00", "01", "02", "03", "04", "05", "06", "07", "08", "09",
					"10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
					"20", "21", "22", "23", "24", "25", "26", "27", "28", "29",
					"30", "31", "32", "33", "34", "35", "36", "37", "38", "39",
					"40", "41", "42", "43", "45", "46", "47", "48", "49", "50",
					"51", "52", "53", "54", "55", "56", "57", "58", "59" }));
			cmbSignInMinutes.setBackground(GuiModes.CHANGE_SCREEN
					.getControlBackgroundColor());
			cmbSignInMinutes.setForeground(GuiModes.CHANGE_SCREEN
					.getControlForegroundColor());
			cmbSignInMinutes.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
			cmbSignInMinutes.setBorder(GuiModes.CHANGE_SCREEN
					.getControlBorder());
			df = new SimpleDateFormat("mm");
			cmbSignInMinutes.setSelectedItem(df.format(currentDate));
			panelContent.add(cmbSignInMinutes);

			label_2 = new JLabel();
			label_2.setBounds(444, 60, 5, 31);
			label_2.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
			label_2.setText(":");
			panelContent.add(label_2);

			cmbSignInAmPm = new JxComboBox();
			cmbSignInAmPm.setBounds(455, 58, 63, 31);
			cmbSignInAmPm.setArc(0.2f);
			cmbSignInAmPm.setModel(new DefaultComboBoxModel(new String[] {
					"AM", "PM" }));
			cmbSignInAmPm.setBackground(GuiModes.CHANGE_SCREEN
					.getControlBackgroundColor());
			cmbSignInAmPm.setForeground(GuiModes.CHANGE_SCREEN
					.getControlForegroundColor());
			cmbSignInAmPm.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
			cmbSignInAmPm.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
			df = new SimpleDateFormat("a");
			cmbSignInAmPm.setSelectedItem(df.format(currentDate));
			panelContent.add(cmbSignInAmPm);

		}

		lblName = new JLabel();
		lblName.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		lblName.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		lblName.setText("Name of Person");
		panelContent.add(lblName);

		txtResponsiblePartyName = new JxTextField();
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
						ResidentContact ref = new ResidentContact();
						if (PanelCensusSignIn.this.isMain) {
							Global.currentResidenceKey = Global.panelCensusMain
									.getResident().getSerial();
						}
						if (PanelCensusSignIn.this.isMain) {
							ResidentMain resmain = new ResidentMain();
							resmain.setSerial(Global.panelCensusMain
									.getResident().getSerial());
							ref.setResidentId(resmain);

							// ref.setResidentId(Global.panelCensusMain
							// .getResident().getSerial());
						} else {
							// ref.setResidentId(Global.currentResidenceKey);
							ResidentMain resmain = new ResidentMain();
							resmain.setSerial(Global.currentResidenceKey);
							ref.setResidentId(resmain);
						}
						ref.setLastName(key);
						try {

							List tmpList = null;

							if (PanelCensusSignIn.this.isMain) {
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
									if (PanelCensusSignIn.this.isMain) {
										ResidentMain resmain = new ResidentMain();
										resmain
												.setSerial(Global.panelCensusMain
														.getResident()
														.getSerial());
										ref.setResidentId(resmain);

										// ctcRef
										// .setResidentId(Global.panelCensusMain
										// .getResident()
										// .getSerial());
									} else {
										ResidentMain resmain = new ResidentMain();
										resmain
												.setSerial(Global.currentResidenceKey);
										ref.setResidentId(resmain);

										// ctcRef
										// .setResidentId(Global.currentResidenceKey);
									}

									ResidentContactPhone ctcPhone = (ResidentContactPhone) refObj[1];
									int serial = (new ControllerResidentInfoContact())
											.insertOrUpdateCensusResidentContact(
													ctcRef.getFirstName(),
													ctcRef.getLastName(),
													ctcRef.getRelationship()
															.toString(),
													ctcPhone.getNumber(),
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

						List resiContacts = new ArrayList();
						this.records = null;
						try {
							// this.records =
							// MedrexClientManager.getInstance().getResponsiblePartys(Global.panelCensusMain.getResident().getSerial(),
							// key + "%");
							if (PanelCensusSignIn.this.isMain) {
								resiContacts = MedrexClientManager
										.getInstance()
										.getResidentContacts(
												Global.panelCensusMain
														.getResident()
														.getSerial(), key + "%");
							} else {
								resiContacts = MedrexClientManager
										.getInstance().getResidentContacts(
												Global.currentResidenceKey,
												key + "%");
							}
							if (resiContacts != null && resiContacts.size() > 0) {
								this.records = resiContacts;
							}

						} catch (Exception e) {
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
		panelContent.add(txtResponsiblePartyName);

		// dateLabel.setBounds(20, 20, 48, 31);
		// dcSignInDate.setBounds(74, 20, 165, 31);
		// dateLabel_1.setBounds(245, 20, 48, 31);
		// cmbSignInHours.setBounds(299, 20, 63, 31);
		// cmbSignInMinutes.setBounds(374, 20, 63, 31);
		// label_2.setBounds(365, 19, 6, 31);
		// cmbSignInAmPm.setBounds(443, 20, 63, 31);
		lblName.setBounds(20, 15, 149, 31);
		txtResponsiblePartyName.setBounds(175, 15, 331, 31);

		lblName_New1 = new JLabel();
		lblName_New1.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		lblName_New1.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		lblName_New1.setBounds(20, 60, 120, 31);
		panelContent.add(lblName_New1);

		lblName_New2 = new JLabel();
		lblName_New2.setText("");
		lblName_New2.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		lblName_New2.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		lblName_New2.setBounds(175, 60, 330, 31);
		panelContent.add(lblName_New2);

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
		// 0, 0, 528, 108
		layerContent.setBounds(SwingUtils.centerRectangle(panelSubMain
				.getBounds(), new Rectangle(0, 0, 528, 108)));
		panelContent.setSize(528, 108);

		if (getTopLevelAncestor() != null) {
			getTopLevelAncestor().repaint();
		} else {
			this.repaint();
		}
		updateData();
		btnSave.setText("");
		btnSave.setText("SAVE");
	}

	public boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		// Date d = dcSignInDate.getDate(), curDate =
		// MedrexClientManager.getServerTime();
		// int hrs;
		// hrs = Integer.parseInt((String) cmbSignInHours.getSelectedItem());
		// if (((String)
		// cmbSignInAmPm.getSelectedItem()).equalsIgnoreCase("PM"))
		// hrs += 12;
		// d.setHours(hrs);
		// d.setMinutes(Integer.parseInt((String) cmbSignInMinutes
		// .getSelectedItem()));
		//
		// if (d.compareTo(MedrexClientManager.getServerTime()) > 0) {
		// vRes.addError("Future Date and Time is not allowed.");
		// }
		if (txtResponsiblePartyName.getText() == null
				|| txtResponsiblePartyName.getText() == "") {
			vRes.addError("Name of Person is mandatory.");
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

		// dcSignInDate.setDate(currentDate);
		// SimpleDateFormat df = new SimpleDateFormat("hh");
		// cmbSignInHours.setSelectedItem(df.format(currentDate));
		// df.applyPattern("mm");
		// cmbSignInMinutes.setSelectedItem(df.format(currentDate));
		// df.applyPattern("a");
		// cmbSignInAmPm.setSelectedItem(df.format(currentDate));

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
				if (ref.getTypeName().equalsIgnoreCase("Sign In")) {
					// dcSignInDate.setDate(ref.getDateAndTime());
					// df = new SimpleDateFormat("hh");
					// cmbSignInHours.setSelectedItem(df.format(ref
					// .getDateAndTime()));
					// df.applyPattern("mm");
					// cmbSignInMinutes.setSelectedItem(df.format(ref
					// .getDateAndTime()));
					// df.applyPattern("a");
					// cmbSignInAmPm.setSelectedItem(df.format(ref
					// .getDateAndTime()));
					if (ref.getResidentContactId() != 0) {
						ResidentContact resCtc = MedrexClientManager
								.getInstance().getResidentContact(
										ref.getResidentContactId());
						txtResponsiblePartyName.setText(resCtc.getLastName());// +
						// ", "+
						// resCtc.getFirstName());
						btnSave.setVisible(false);
						btnNotes.setVisible(true);
					}

				}
			} catch (Exception e) {
				// e.printStackTrace();
			}

			if (Global.currentLoggedInUserType.equals("Administrator")) {
				dcSignInDate.setVisible(true);
				dcSignInDate.setDate(ref.getDateAndTime());
				cmbSignInHours.setVisible(true);
				SimpleDateFormat df = new SimpleDateFormat("hh");
				cmbSignInHours.setSelectedItem(df.format(ref.getDateAndTime()));
				cmbSignInMinutes.setVisible(true);
				df = new SimpleDateFormat("mm");
				cmbSignInMinutes.setSelectedItem(df
						.format(ref.getDateAndTime()));
				cmbSignInAmPm.setVisible(true);
				df = new SimpleDateFormat("a");
				cmbSignInAmPm.setSelectedItem(df.format(ref.getDateAndTime()));
				// dateLabel_1.setVisible(false);
				label_2.setVisible(false);
				dateLabel.setVisible(true);
				btnNotes.setVisible(true);
				btnSave.setVisible(true);
				btnCancel.setText("DONE");
				layerUI.setLocked(false);
			} else {
				lblName_New1.setText("Signed In On");
				lblName_New2.setText(ref.getDateAndTime().toString());
				layerUI.setLocked(true);
				btnSave.setVisible(false);
			}
		} else {
			// layerUI.setLocked(false);
			btnNotes.setVisible(false);
			// btnSave.setVisible(true);
			btnCancel.setText("CANCEL");

			try {
				if (isMain) {
					ref = MedrexClientManager.getInstance().getCensusStatus(
							Global.panelCensusMain.getResident().getSerial(),
							"Sign Out");
				} else {
					ref = MedrexClientManager.getInstance().getCensusStatus(
							Global.currentResidenceKey, "Sign Out");
				}
				if (ref != null) {
					ResidentContact resCtc = null;
					if (ref.getResidentContactId() != 0) {
						resCtc = MedrexClientManager.getInstance()
								.getResidentContact(ref.getResidentContactId());
					}
					if (resCtc != null) {
						txtResponsiblePartyName.setText(resCtc.getLastName()
								+ ", " + resCtc.getFirstName());
					}
				}

			} catch (Exception e) {
				// e.printStackTrace();
			}
		}
	}

	public boolean doSave() {
		boolean bool = false;
		// Date d = dcSignInDate.getDate();
		// int hrs = Integer.parseInt((String)
		// cmbSignInHours.getSelectedItem());
		// if (((String)
		// cmbSignInAmPm.getSelectedItem()).equalsIgnoreCase("PM")) {
		// hrs += 12;
		// }
		// d.setHours(hrs);
		// d.setMinutes(Integer.parseInt((String) cmbSignInMinutes
		// .getSelectedItem()));

		CensusStatus ref = new CensusStatus();
		if (isMain) {
			ref.setResidentId(Global.panelCensusMain.getResident().getSerial());
		} else {
			ref.setResidentId(Global.currentResidenceKey);
		}

		if (Global.currentLoggedInUserType.equals("Administrator")) {
			Date d = dcSignInDate.getDate();
			int hrs;
			hrs = Integer.parseInt((String) cmbSignInHours.getSelectedItem());
			if (((String) cmbSignInAmPm.getSelectedItem())
					.equalsIgnoreCase("PM"))
				if (hrs != 12)
					hrs += 12;
			d.setHours(hrs);
			d.setMinutes(Integer.parseInt((String) cmbSignInMinutes
					.getSelectedItem()));
			ref.setDateAndTime(d);
		} else {
			ref.setDateAndTime(MedrexClientManager.getServerTime());
		}
		ref.setAdministeredBy(Global.currentLoggedInUserKey);
		ref.setTypeName("Sign In");
		ref.setSerial(Global.currentCensusStatusId);

		ref.setCurrentCenusStatusPrevId(Global.currentCenusStatusPrevId);
		ref.setCurrentCenusStatusNextId(Global.currentCenusStatusNextId);

		ResidentContact refResp = new ResidentContact();
		// if (txtResponsiblePartyPhone.getNumber().equalsIgnoreCase("")
		// || txtResponsiblePartyRelation.getText().equalsIgnoreCase("")) {
		String key = txtResponsiblePartyName.getText();

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
		// System.out.println("key is"+key);
		if (!(key.length() <= 0)) {
			String lastName = key.substring(0, key.lastIndexOf(","));
			// String firstName = key.substring(key.lastIndexOf(",")+1,
			// key.length());
			key = lastName;
		} else {
			key = "";
		}
		refResp.setLastName(key);
		// System.out.println("key is"+key);
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
			if (tmpList == null || tmpList.size() == 0) {
				Object[] refObj = doPrompt(refResp);
				if (Global.tmpContact != null) {
					ResidentContact ctcRef = (ResidentContact) refObj[0];
					ResidentContactPhone ctcPhone = (ResidentContactPhone) refObj[1];
					int serial = (new ControllerResidentInfoContact())
							.insertOrUpdateCensusResidentContact(ctcRef
									.getFirstName(), ctcRef.getLastName(),
									ctcRef.getRelationship().toString(),
									ctcPhone.getNumber(), ctcRef.getSignature());
					refResp.setSerial(serial);
					// refResp = doPrompt(refResp);
					// MedrexClientManager.getInstance().insertOrUpdateResidentContact(refResp);
					txtResponsiblePartyName.fireObjectChanged(refResp);
				} else {
					JOptionPane.showMessageDialog(null,
							"Please fill in contact details");
					return false;
				}
			} else if (tmpList.size() > 0) {
				refResp = (ResidentContact) tmpList.get(0);
			}
		} catch (Exception e) {
			// e.printStackTrace();
		}
		// }

		ref.setResidentContactId(refResp.getSerial());

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

	private Object[] doPrompt(ResidentContact ref) {

		ResidentContactPhone refCtcPhone = new ResidentContactPhone();

		Global.tmpContact = null;
		Global.tmpContactPhone = null;
		FrameCensusSignOutContact dialog = new FrameCensusSignOutContact();
		SwingUtils.center(dialog);

		System.out.println("relation: " + ref.getRelationship());
		if (ref != null) {
			dialog.setValues(ref.getFirstName(), ref.getLastName(), "", "", ref
					.getSignature());
		}

		dialog.setVisible(true);

		ref = Global.tmpContact;
		refCtcPhone = Global.tmpContactPhone;

		return new Object[] { ref, refCtcPhone };
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Sign In";
	}

}
