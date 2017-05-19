package medrex.client.census.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

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
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.census.CensusStatus;

import org.jdesktop.jxlayer.JXLayer;
import org.jdesktop.jxlayer.plaf.effect.BufferedImageOpEffect;
import org.jdesktop.jxlayer.plaf.ext.LockableUI;

import com.jhlabs.image.OpacityFilter;
import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxPanel;
import com.toedter.calendar.JDateChooser;

public class PanelCensusER extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5933272563995603604L;
	private LockableUI layerUI;
	private JXLayer<JPanel> layerContent;
	private JLabel dateLabel_2;
	private JxComboBox cmbErAmPm;
	private JLabel label_2;
	private JxComboBox cmbErMinutes;
	private JxComboBox cmbErHours;

	private JLabel dateLabel_1;
	private JDateChooser dcErDate;
	private JLabel dateLabel;
	private JxPanel panelContent;
	private JPanel panelMain;

	private JPanel panelSubMain;
	private JxButton btnCancel;
	private JxButton btnSave;
	private JLabel lblTitle;

	private HashMap<String, Integer> timeMap = new HashMap<String, Integer>();
	private HashMap<Integer, String> timeRevMap = new HashMap<Integer, String>();

	private boolean isMain;
	private Date currentDate;
	private JPanel panelFooter;

	public PanelCensusER(boolean isMain) {
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
		panelMain.setBounds(72, 0, 790, 150);
		panelMain.setLayout(null);
		panelMain.setOpaque(false);
		add(panelMain);

		lblTitle = new JLabel();
		lblTitle.setBounds(0, 0, 791, 35);
		lblTitle.setText("ER:");
		lblTitle.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont()
				.deriveFont(28f));
		lblTitle.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		panelMain.add(lblTitle, BorderLayout.NORTH);

		panelSubMain = new JPanel();
		panelSubMain.setLayout(null);
		panelSubMain.setOpaque(false);
		panelSubMain.setBounds(0, 45, 606, 80);
		panelMain.add(panelSubMain, BorderLayout.CENTER);

		panelFooter = new JPanel();
		panelFooter.setLayout(new BorderLayout());
		panelFooter.setOpaque(false);
		panelFooter.setBounds(0, 150, 791, 51);
		panelMain.add(panelFooter, BorderLayout.SOUTH);

		final JPanel panelFooterLeft = new JPanel();
		panelFooterLeft.setOpaque(false);
		final FlowLayout flowLayout_1 = new FlowLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panelFooterLeft.setLayout(flowLayout_1);

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
				// if (doValidate()) {
				if (doSave()) {
					// Global.frameCensusFormsNew.showCensusStatus();
					if (PanelCensusER.this.isMain) {
						Global.panelCensusMain
								.changeCard(PanelCensusMain.DEFAULT);
					} else {
						close();
					}
				}
				// }
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

		btnCancel = new JxButton();
		btnCancel.setArc(0.2f);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				// Global.frameCensusFormsNew.showCensusStatus();
				if (PanelCensusER.this.isMain) {
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

		panelContent = new JxPanel();
		panelContent.setBounds(0, 0, 596, 80);
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
		panelSubMain.add(panelContent);

		layerUI = new LockableUI(new BufferedImageOpEffect(new OpacityFilter()));
		layerContent = new JXLayer<JPanel>(panelContent);
		layerContent.setUI(layerUI);
		layerContent.setLayout(null);
		layerContent.setBounds(0, 0, 596, 80);
		panelSubMain.add(layerContent);
		dateLabel = new JLabel();
		dateLabel.setBounds(20, 0, 67, 31);
		dateLabel.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		dateLabel.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		dateLabel.setText("Date");
		panelContent.add(dateLabel);

		dcErDate = new JDateChooser();
		dcErDate.setDateFormatString("MM/dd/yyyy");
		dcErDate.setBounds(90, 5, 150, 31);
		dcErDate.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		dcErDate.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		dcErDate.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		dcErDate.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		dcErDate.setDate(currentDate);
		panelContent.add(dcErDate);

		dateLabel_1 = new JLabel();
		dateLabel_1.setBounds(260, 0, 56, 31);
		dateLabel_1.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		dateLabel_1.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		dateLabel_1.setText("Time");
		panelContent.add(dateLabel_1);

		cmbErHours = new JxComboBox();
		cmbErHours.setBounds(322, 5, 63, 31);
		cmbErHours.setArc(0.2f);
		cmbErHours.setModel(new DefaultComboBoxModel(new String[] { "01", "02",
				"03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
		cmbErHours.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		cmbErHours.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		cmbErHours.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		cmbErHours.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		SimpleDateFormat df = new SimpleDateFormat("hh");
		cmbErHours.setSelectedItem(df.format(currentDate));
		panelContent.add(cmbErHours);

		cmbErMinutes = new JxComboBox();
		cmbErMinutes.setBounds(399, 5, 63, 31);
		cmbErMinutes.setArc(0.2f);
		cmbErMinutes.setModel(new DefaultComboBoxModel(new String[] { "00",
				"01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
				"11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
				"21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
				"31", "32", "33", "34", "35", "36", "37", "38", "39", "40",
				"41", "42", "43", "45", "46", "47", "48", "49", "50", "51",
				"52", "53", "54", "55", "56", "57", "58", "59" }));
		cmbErMinutes.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		cmbErMinutes.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		cmbErMinutes.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		cmbErMinutes.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		df = new SimpleDateFormat("mm");
		cmbErMinutes.setSelectedItem(df.format(currentDate));
		panelContent.add(cmbErMinutes);

		label_2 = new JLabel();
		label_2.setBounds(385, 5, 6, 31);
		label_2.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		label_2.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		;
		label_2.setText(":");
		panelContent.add(label_2);

		cmbErAmPm = new JxComboBox();
		cmbErAmPm.setBounds(476, 5, 61, 31);
		cmbErAmPm.setArc(0.2f);
		cmbErAmPm
				.setModel(new DefaultComboBoxModel(new String[] { "AM", "PM" }));
		cmbErAmPm.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		cmbErAmPm.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		cmbErAmPm.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		cmbErAmPm.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		df = new SimpleDateFormat("a");
		cmbErAmPm.setSelectedItem(df.format(currentDate));
		panelContent.add(cmbErAmPm);

		fillCombos();
		updateData();

	}

	private boolean doSave() {
		boolean bool = false;
		CensusStatus censusStatus = new CensusStatus();
		if (isMain) {
			censusStatus.setResidentId(Global.panelCensusMain.getResident()
					.getSerial());
		} else {
			censusStatus.setResidentId(Global.currentResidenceKey);
		}

		Date d = dcErDate.getDate();
		int hrs;
		hrs = Integer.parseInt((String) cmbErHours.getSelectedItem());
		if (((String) cmbErAmPm.getSelectedItem()).equalsIgnoreCase("PM"))
			if (hrs != 12)
				hrs += 12;
		d.setHours(hrs);
		d.setMinutes(Integer.parseInt((String) cmbErMinutes.getSelectedItem()));

		censusStatus.setDateAndTime(d);

		censusStatus.setAdministeredBy(Global.currentLoggedInUserKey);
		censusStatus.setTypeName("Sign Out");

		censusStatus.setEr(true);
		censusStatus.setSerial(Global.currentCensusStatusId);

		censusStatus
				.setCurrentCenusStatusPrevId(Global.currentCenusStatusPrevId);
		censusStatus
				.setCurrentCenusStatusNextId(Global.currentCenusStatusNextId);

		try {
			int num = 0;
			if (censusStatus.getDateAndTime().after(
					MedrexClientManager.getServerTime())) {
				num = JOptionPane
						.showConfirmDialog(
								this,
								"You have choosen greater than current time, \n Are you sure?",
								"Regarding Er Time", JOptionPane.YES_NO_OPTION);
			}
			if (num != 1) {
				MedrexClientManager.getInstance().insertOrUpdateCensusStatus(
						censusStatus);
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

	private void updateData() {
		layerUI.setLocked(false);
		CensusStatus ref = null;
		if (Global.currentCensusStatusId != 0) {
			try {
				if (isMain) {
					if (Global.currentCensusStatusId != 0) {
						ref = MedrexClientManager.getInstance()
								.getCensusStatus(
										Global.currentCensusStatusId,
										Global.panelCensusMain.getResident()
												.getSerial());
					}

				} else {
					ref = MedrexClientManager.getInstance().getCensusStatus(
							Global.currentCensusStatusId,
							Global.currentResidenceKey);
				}
				if (ref.getTypeName().equalsIgnoreCase("Sign Out")
						&& ref.isEr()) {
					if (Global.currentLoggedInUserType.equals("Administrator")) {
						SimpleDateFormat df = new SimpleDateFormat("hh");
						cmbErHours.setVisible(true);
						cmbErHours.setSelectedItem(df.format(ref
								.getDateAndTime()));
						df = new SimpleDateFormat("mm");
						cmbErMinutes.setVisible(true);
						cmbErMinutes.setSelectedItem(df.format(ref
								.getDateAndTime()));
						df = new SimpleDateFormat("a");
						cmbErAmPm.setSelectedItem(df.format(ref
								.getDateAndTime()));
						dcErDate.setDate(ref.getDateAndTime());
					}
				}
			} catch (Exception ex) {

			}
		}

	}

	protected void doUpdate() {
		int w = getWidth();
		int h = getHeight() - 76 - 20;
		float wF = ((float) w / 868);
		float hF = ((float) h / 90);
		// 72, 10, 790, 496
		panelMain.setBounds((int) (72 * wF), (30), (int) (790 * wF),
				(int) (150 * hF));
		// 0, 0, 791, 35
		// lblTitle.setBounds(0, 0, (int) (791 * wF), (int) (35 * hF));
		// 0, 45, 606, 394
		panelSubMain.setBounds(0, (40), (int) (606 * wF), (int) (80 * hF));
		// 610, 45, 175, 394
		panelContent.setSize(596, 80);

		if (getTopLevelAncestor() != null) {
			getTopLevelAncestor().repaint();
		} else {
			this.repaint();
		}
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

		timeMap.clear();
		timeRevMap.clear();
		for (int i = 0, value = 15; i < key.length; i++, value += 15) {
			timeMap.put(key[i], new Integer(value));
			timeRevMap.put(new Integer(value), key[i]);
		}
	}

	@Override
	public String getTitle() {
		return "ER";
	}
}
