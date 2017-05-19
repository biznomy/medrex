package medrex.client.accurities;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

import medrex.client.census.countAudit.CountAuditFloorWiseTableModal;
import medrex.client.census.ui.FrameCensusNotes;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.loading.FrameLoading;
import medrex.client.utils.SwingUtils;
import medrex.client.utils.Utils;
import medrex.commons.dataObj.Rooms;
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.accurities.Accurities;
import medrex.commons.vo.census.countAudit.CountAudit;
import medrex.commons.vo.census.countAudit.CountAuditFloor;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.schedule.UserSchedule;
import medrex.server.dao.schedule.UserScheduleDAO;

import com.sX.swing.JxButton;
import com.sX.swing.JxLiquidButton;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;

public class PanelFloorWiseAccuties extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4409077642274382800L;
	private JLabel lblUserType;
	private JList orthopedicCareList_1;
	private JPanel panelFooterRight;
	private JScrollPane scrollPane;
	private JScrollPane scrollPaneMain;
	private JLabel lblDoneBy;
	private JLabel doneByLabel;
	private JList tList;
	private JList woList;
	private JList ivList;
	private JList o2List;
	private JxLiquidButton tButton;
	private JxLiquidButton woButton;
	private JxLiquidButton ivButton;
	private JxLiquidButton o2Button;
	private List residentList = null;
	private FrameAccuritiesListAdd frameAccuritiesListAdd;
	private String strListData[] = new String[0];
	private String floor;
	private String date;
	private JxTable table;
	private JLabel lblPresentValue;
	private JLabel lblTotalValue;
	private ButtonGroup bgFrom = new ButtonGroup();
	private JxPanel panelContent;
	private Date currentDate;
	private JPanel panelMain;
	private JPanel panelSubMain;
	private JPanel panelFooter;
	private JxLiquidButton btnCancel;
	private JxLiquidButton btnSave;
	private JLabel lblTitle;
	private JxButton btnNotes;
	private CountAuditFloorWiseTableModal tableModal;
	private JCheckBox iConfirmThatCheckBox;
	private JxLiquidButton tracheotomyButton;
	private JxLiquidButton respiratoryServicesButton;
	private JxLiquidButton orthopedicCareButton;
	private JList orthopedicCareList;
	private JxLiquidButton advancedNeuroCareButton;
	private JList advancedNeuroCareList;
	private JList respiratoryServicesList;
	private JList tracheotomyList;
	private JPanel panelAcuit;
	private JPanel panel;
	private FrameLoading fl;
	private JxLiquidButton headTraumaButton;
	private JList headTraumaList;

	// private JxButton cancelButton;
	// private JxButton saveButton;
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);
	private static final Color DEF_COLOR = new Color(49, 104, 127);
	private static final Color BACK_COLOR = new Color(232, 240, 245);

	public PanelFloorWiseAccuties(final String floor, final String date) {
		super();
		this.floor = floor;
		this.date = date;
		setBackground(BACK_COLOR);
		setSize(1250, 700);
		// setSize(700,700);
		// setSize(new Dimension(
		// Toolkit.getDefaultToolkit().getScreenSize().width-20, Toolkit
		// .getDefaultToolkit().getScreenSize().height-75));

		setBorder(new LineBorder(DEF_COL, 1, false));
		setLayout(null);
		// setBackground(Color.WHITE);

		panelMain = new JPanel();
		panelMain.setLayout(new BorderLayout());
		panelMain.setBounds(25, 315, 1220, 390);
		panelMain.setOpaque(false);
		add(panelMain);

		panelSubMain = new JPanel();
		panelSubMain.setPreferredSize(new Dimension(0, 51));
		panelSubMain.setLayout(new GridLayout(0, 2));
		panelSubMain.setOpaque(false);
		// panelSubMain.setPreferredSize(new Dimension(628, 108));
		panelMain.add(panelSubMain, BorderLayout.SOUTH);

		panelFooter = new JPanel();
		// panelFooter.setBounds(0, 290, 750, 51);
		panelSubMain.add(panelFooter);
		panelFooter.setLayout(new BorderLayout());
		panelFooter.setOpaque(false);
		// panelFooter.setPreferredSize(new Dimension(0, 103));

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

		panelFooterRight = new JPanel();
		panelSubMain.add(panelFooterRight);
		panelFooterRight.setOpaque(false);
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		flowLayout.setHgap(10);
		flowLayout.setVgap(10);
		panelFooterRight.setLayout(flowLayout);

		btnSave = new JxLiquidButton();
		btnSave.setArc(0.2f);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (doValidate()) {
					fl = new FrameLoading(PanelFloorWiseAccuties.this
							.getDialog(), "Saving");
					fl.setTitle("Saving acuities");
					javax.swing.SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							fl.callNotify();
						}
					});
					new Thread(new Runnable() {
						public void run() {
							doSaveCountAudit();
							doSaveAccuties();
							fl.dispose();
						}
					}).start();
					fl.setVisible(true);
					// doSaveCountAudit();
					// doSaveAccuties();
					close();
				}
			}
		});
		btnSave.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		btnSave.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		btnSave.setHorizontalAlignment(SwingConstants.CENTER);
		// btnSave.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		// btnSave.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		btnSave.setFont(new Font("", Font.PLAIN, 18));
		btnSave.setBackground(new Color(5, 69, 100));
		btnSave.setForeground(Color.WHITE);
		btnSave.setText("Save");
		btnSave.setPreferredSize(new Dimension(120, 28));
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
		btnCancel = new JxLiquidButton();
		btnCancel.setArc(0.2f);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.currentCountAuditKey = 0;
				close();
			}
		});
		btnCancel.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		btnCancel.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		btnCancel.setHorizontalAlignment(SwingConstants.CENTER);
		btnCancel.setFont(new Font("", Font.PLAIN, 18));
		btnCancel.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		btnCancel.setBackground(new Color(5, 69, 100));
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setText("Cancel");
		btnCancel.setPreferredSize(new Dimension(120, 28));
		panelFooterRight.add(btnCancel);

		tableModal = new CountAuditFloorWiseTableModal();
		tableModal.addTableModelListener(new TableModelListener() {
			public void tableChanged(TableModelEvent e) {
				if (e.getColumn() == 2) {
					updatePresentCount();
				}
			}
		});

		panelContent = new JxPanel();
		// panelContent.setBounds(0, 0, 1210, 330);
		panelMain.add(panelContent);
		panelContent.setPreferredSize(new Dimension(700, 292));
		panelContent.setBackground(Color.WHITE);
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

		final JLabel lblTotal = new JLabel();
		lblTotal.setBounds(10, 15, 48, 31);
		lblTotal.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		lblTotal.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		lblTotal.setText("Total:");
		panelContent.add(lblTotal);

		final JLabel lblPresent = new JLabel();
		lblPresent.setBounds(258, 15, 70, 31);
		lblPresent.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		lblPresent.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		lblPresent.setText("Present:");
		panelContent.add(lblPresent);

		lblTotalValue = new JLabel();
		lblTotalValue.setText("10");
		lblTotalValue.setBounds(84, 15, 100, 31);
		lblTotalValue.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		lblTotalValue.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		panelContent.add(lblTotalValue);

		lblPresentValue = new JLabel();
		lblPresentValue.setText("8");
		lblPresentValue.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		lblPresentValue.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		lblPresentValue.setBounds(334, 15, 59, 31);
		panelContent.add(lblPresentValue);

		scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		// scrollPane.setBounds(10, 52, 1200, 216);
		scrollPane.setBounds(10, 52, Toolkit.getDefaultToolkit()
				.getScreenSize().width - 140, 250);
		scrollPane.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		panelContent.add(scrollPane);

		table = new JxTable();
		table.setModel(tableModal);
		scrollPane.setViewportView(table);

		final JCheckBox selectAllCheckBox = new JCheckBox();
		selectAllCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent evt) {
				checkAll(selectAllCheckBox.isSelected());
			}
		});
		selectAllCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		selectAllCheckBox.setFocusPainted(false);
		selectAllCheckBox.setOpaque(false);
		selectAllCheckBox.setText("Select All");
		selectAllCheckBox.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		selectAllCheckBox.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		selectAllCheckBox.setBounds(451, 15, 111, 31);
		panelContent.add(selectAllCheckBox);

		iConfirmThatCheckBox = new JCheckBox();
		iConfirmThatCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent e) {
				btnSave.setEnabled(iConfirmThatCheckBox.isSelected());
				if (iConfirmThatCheckBox.isSelected()) {
					// btnSave.setBackground(GuiModes.CHANGE_SCREEN.getControlBackgroundColor());
					btnSave.setBackground(new Color(5, 69, 100));
				} else {
					btnSave.setBackground(new Color(150, 150, 150));
				}
			}
		});
		iConfirmThatCheckBox.setOpaque(false);
		iConfirmThatCheckBox.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		iConfirmThatCheckBox.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		iConfirmThatCheckBox.setText("I, " + Global.currentLoggedInUserName
				+ " confirm that there are " + 0 + " residents.");
		iConfirmThatCheckBox.setBounds(20, 305, 658, 40);
		panelContent.add(iConfirmThatCheckBox);

		iConfirmThatCheckBox.setSelected(true);
		iConfirmThatCheckBox.setSelected(false);

		lblTitle = new JLabel();
		lblTitle.setBounds(25, 0, 700, 35);
		add(lblTitle);
		// lblTitle.setPreferredSize(new Dimension(791, 35));
		lblTitle.setText("1st Floor Details:");
		lblTitle.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont()
				.deriveFont(28f));
		lblTitle.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());

		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panelContent.setOpaque(false);

		doneByLabel = new JLabel();
		doneByLabel.setText("Done By :");
		doneByLabel.setBounds(650, 18, 84, 25);
		doneByLabel.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		doneByLabel.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		panelContent.add(doneByLabel);

		lblDoneBy = new JLabel();
		lblDoneBy.setText("");
		// lblDoneBy.setBounds(921, 15, 279, 25);
		lblDoneBy.setBounds(741, 15, 238, 25);
		lblDoneBy.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		lblDoneBy.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		panelContent.add(lblDoneBy);
		panel.setBackground(Color.WHITE);
		panel.setBounds(25, 32, 1220, 275);
		add(panel);

		panelAcuit = new JPanel();
		panelAcuit.setOpaque(false);
		panelAcuit.setBackground(Color.WHITE);
		panelAcuit.setLayout(null);
		panelAcuit.setBounds(0, 0, 1210, 250);
		panelAcuit.setPreferredSize(new Dimension(1210, 250));

		scrollPaneMain = new JScrollPane();
		scrollPaneMain.setBackground(Color.WHITE);
		panel.add(scrollPaneMain);
		scrollPaneMain.setViewportView(panelAcuit);
		scrollPaneMain.getViewport().setBackground(Color.white);

		o2List = new JList();
		o2List.setFont(new Font("", Font.BOLD, 12));
		o2List.setForeground(DEF_COL);
		o2List.setBorder(new LineBorder(DEF_COL, 1, false));

		JScrollPane listScrollPane = new JScrollPane();
		listScrollPane.setBounds(10, 36, 130, 210);
		panelAcuit.add(listScrollPane);
		listScrollPane.setViewportView(o2List);

		o2Button = new JxLiquidButton(0.4f);
		o2Button.setBounds(10, 5, 130, 25);
		panelAcuit.add(o2Button);
		o2Button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.currentAccuritiesListKey = 1;
				frameAccuritiesListAdd = new FrameAccuritiesListAdd(
						Global.currentAccuritiesListKey, floor, date,
						"Oxygen Therapy");
				SwingUtils.center(frameAccuritiesListAdd);
				frameAccuritiesListAdd.setTitle("Acuities List Add");
				frameAccuritiesListAdd.setModal(true);
				frameAccuritiesListAdd.setVisible(true);
				fillList();
			}
		});
		// o2Button.setBackground(Color.WHITE);
		// o2Button.setForeground(DEF_COL);
		o2Button.setBackground(new Color(30, 100, 120));
		o2Button.setForeground(Color.WHITE);
		// o2Button.setBorder(new LineBorder(BORDER_COL, 1, false));
		o2Button.setFont(new Font("", Font.BOLD, 12));
		o2Button.setText("Oxygen therapy");

		ivList = new JList();
		ivList.setFont(new Font("", Font.BOLD, 12));
		ivList.setForeground(DEF_COL);
		ivList.setBorder(new LineBorder(DEF_COL, 1, false));
		JScrollPane listScrollPane1 = new JScrollPane();
		listScrollPane1.setBounds(146, 36, 130, 210);
		panelAcuit.add(listScrollPane1);
		listScrollPane1.setViewportView(ivList);

		ivButton = new JxLiquidButton(0.4f);
		ivButton.setBounds(146, 5, 130, 25);
		panelAcuit.add(ivButton);
		ivButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.currentAccuritiesListKey = 2;
				frameAccuritiesListAdd = new FrameAccuritiesListAdd(
						Global.currentAccuritiesListKey, floor, date, ivButton
								.getText());
				SwingUtils.center(frameAccuritiesListAdd);
				frameAccuritiesListAdd.setTitle("Acuities List Add");
				frameAccuritiesListAdd.setModal(true);
				frameAccuritiesListAdd.setVisible(true);
				fillList();
			}
		});
		// ivButton.setBackground(Color.WHITE);
		ivButton.setBackground(new Color(30, 100, 120));
		ivButton.setForeground(Color.WHITE);
		// ivButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		ivButton.setFont(new Font("", Font.BOLD, 12));
		ivButton.setText("IV therapy");

		woList = new JList();
		woList.setFont(new Font("", Font.BOLD, 12));
		woList.setForeground(DEF_COL);
		woList.setBorder(new LineBorder(DEF_COL, 1, false));
		JScrollPane listScrollPane2 = new JScrollPane();
		listScrollPane2.setBounds(282, 36, 130, 210);
		panelAcuit.add(listScrollPane2);
		listScrollPane2.setViewportView(woList);

		woButton = new JxLiquidButton(0.4f);
		woButton.setBounds(282, 5, 130, 25);
		panelAcuit.add(woButton);
		woButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.currentAccuritiesListKey = 3;
				frameAccuritiesListAdd = new FrameAccuritiesListAdd(
						Global.currentAccuritiesListKey, floor, date,
						"Wound care");
				SwingUtils.center(frameAccuritiesListAdd);
				frameAccuritiesListAdd.setTitle("Acuities List Add");
				frameAccuritiesListAdd.setModal(true);
				frameAccuritiesListAdd.setVisible(true);
				fillList();
			}
		});
		// woButton.setBackground(Color.WHITE);
		// woButton.setForeground(DEF_COL);
		woButton.setBackground(new Color(30, 100, 120));
		woButton.setForeground(Color.WHITE);
		// woButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		woButton.setFont(new Font("", Font.BOLD, 12));
		woButton.setText("Wound care");

		tList = new JList();
		tList.setBorder(new LineBorder(DEF_COL, 1, false));
		tList.setFont(new Font("", Font.BOLD, 12));
		tList.setForeground(DEF_COL);
		JScrollPane listScrollPane3 = new JScrollPane();
		listScrollPane3.setBounds(418, 36, 124, 210);
		panelAcuit.add(listScrollPane3);
		listScrollPane3.setViewportView(tList);

		tButton = new JxLiquidButton(0.4f);
		tButton.setBounds(418, 5, 124, 25);
		panelAcuit.add(tButton);
		tButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.currentAccuritiesListKey = 4;
				frameAccuritiesListAdd = new FrameAccuritiesListAdd(
						Global.currentAccuritiesListKey, floor, date,
						"Tube feeding");
				SwingUtils.center(frameAccuritiesListAdd);
				frameAccuritiesListAdd.setTitle("Acuities List Add");
				frameAccuritiesListAdd.setModal(true);
				frameAccuritiesListAdd.setVisible(true);
				fillList();
			}
		});
		// tButton.setBackground(Color.WHITE);
		// tButton.setForeground(DEF_COL);
		tButton.setBackground(new Color(30, 100, 120));
		tButton.setForeground(Color.WHITE);
		// tButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		tButton.setFont(new Font("", Font.BOLD, 12));
		tButton.setText("Tube feeding");

		tracheotomyList = new JList();
		tracheotomyList.setBorder(new LineBorder(DEF_COL, 1, false));
		tracheotomyList.setFont(new Font("", Font.BOLD, 12));
		tracheotomyList.setForeground(DEF_COL);
		JScrollPane listScrollPane4 = new JScrollPane();
		listScrollPane4.setBounds(548, 36, 130, 210);
		panelAcuit.add(listScrollPane4);
		listScrollPane4.setViewportView(tracheotomyList);

		tracheotomyButton = new JxLiquidButton(0.4f);
		tracheotomyButton.setBounds(548, 5, 130, 25);
		panelAcuit.add(tracheotomyButton);
		tracheotomyButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.currentAccuritiesListKey = 5;
				frameAccuritiesListAdd = new FrameAccuritiesListAdd(
						Global.currentAccuritiesListKey, floor, date,
						"Tracheotomy");
				SwingUtils.center(frameAccuritiesListAdd);
				frameAccuritiesListAdd.setTitle("Acuities List Add");
				frameAccuritiesListAdd.setModal(true);
				frameAccuritiesListAdd.setVisible(true);
				fillList();
			}
		});
		// tracheotomyButton.setBackground(Color.WHITE);
		// tracheotomyButton.setForeground(DEF_COL);
		tracheotomyButton.setBackground(new Color(30, 100, 120));
		tracheotomyButton.setForeground(Color.WHITE);
		// tracheotomyButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		tracheotomyButton.setFont(new Font("", Font.BOLD, 12));
		tracheotomyButton.setText("Tracheotomy");

		respiratoryServicesList = new JList();
		respiratoryServicesList.setBorder(new LineBorder(DEF_COL, 1, false));
		respiratoryServicesList.setFont(new Font("", Font.BOLD, 12));
		respiratoryServicesList.setForeground(DEF_COL);
		JScrollPane listScrollPane5 = new JScrollPane();
		listScrollPane5.setBounds(684, 36, 130, 210);
		panelAcuit.add(listScrollPane5);
		listScrollPane5.setViewportView(respiratoryServicesList);

		respiratoryServicesButton = new JxLiquidButton(0.4f);
		respiratoryServicesButton.setBounds(684, 5, 130, 25);
		panelAcuit.add(respiratoryServicesButton);
		respiratoryServicesButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.currentAccuritiesListKey = 6;
				frameAccuritiesListAdd = new FrameAccuritiesListAdd(
						Global.currentAccuritiesListKey, floor, date,
						"Respiratory services");
				SwingUtils.center(frameAccuritiesListAdd);
				frameAccuritiesListAdd.setTitle("Acuities List Add");
				frameAccuritiesListAdd.setModal(true);
				frameAccuritiesListAdd.setVisible(true);
				fillList();
			}
		});
		// respiratoryServicesButton.setBackground(Color.WHITE);
		// respiratoryServicesButton.setForeground(DEF_COL);
		respiratoryServicesButton.setBackground(new Color(30, 100, 120));
		respiratoryServicesButton.setForeground(Color.WHITE);
		// respiratoryServicesButton.setBorder(new LineBorder(BORDER_COL, 1,
		// false));
		respiratoryServicesButton.setFont(new Font("", Font.BOLD, 12));
		respiratoryServicesButton.setText("Respiratory services");

		advancedNeuroCareList = new JList();
		advancedNeuroCareList.setBorder(new LineBorder(DEF_COL, 1, false));
		advancedNeuroCareList.setFont(new Font("", Font.BOLD, 12));
		advancedNeuroCareList.setForeground(DEF_COL);
		JScrollPane listScrollPane6 = new JScrollPane();
		listScrollPane6.setBounds(820, 36, 130, 210);
		panelAcuit.add(listScrollPane6);
		listScrollPane6.setViewportView(advancedNeuroCareList);

		advancedNeuroCareButton = new JxLiquidButton(0.4f);
		advancedNeuroCareButton.setBounds(820, 5, 130, 25);
		panelAcuit.add(advancedNeuroCareButton);
		advancedNeuroCareButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.currentAccuritiesListKey = 7;
				frameAccuritiesListAdd = new FrameAccuritiesListAdd(
						Global.currentAccuritiesListKey, floor, date,
						"Advanced neuro care");
				SwingUtils.center(frameAccuritiesListAdd);
				frameAccuritiesListAdd.setTitle("Acuities List Add");
				frameAccuritiesListAdd.setModal(true);
				frameAccuritiesListAdd.setVisible(true);
				fillList();
			}
		});
		// advancedNeuroCareButton.setBackground(Color.WHITE);
		// advancedNeuroCareButton.setForeground(DEF_COL);
		advancedNeuroCareButton.setBackground(new Color(30, 100, 120));
		advancedNeuroCareButton.setForeground(Color.WHITE);
		// advancedNeuroCareButton.setBorder(new LineBorder(BORDER_COL, 1,
		// false));
		advancedNeuroCareButton.setFont(new Font("", Font.BOLD, 12));
		advancedNeuroCareButton.setText("Advanced neuro care");

		orthopedicCareList = new JList();
		orthopedicCareList.setBorder(new LineBorder(DEF_COL, 1, false));
		orthopedicCareList.setFont(new Font("", Font.BOLD, 12));
		orthopedicCareList.setForeground(DEF_COL);
		JScrollPane listScrollPane7 = new JScrollPane();
		listScrollPane7.setBounds(956, 36, 124, 210);
		panelAcuit.add(listScrollPane7);
		listScrollPane7.setViewportView(orthopedicCareList);

		orthopedicCareButton = new JxLiquidButton(0.4f);
		orthopedicCareButton.setBounds(956, 5, 124, 25);
		panelAcuit.add(orthopedicCareButton);
		orthopedicCareButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.currentAccuritiesListKey = 8;
				frameAccuritiesListAdd = new FrameAccuritiesListAdd(
						Global.currentAccuritiesListKey, floor, date,
						"Orthopedic care");
				SwingUtils.center(frameAccuritiesListAdd);
				frameAccuritiesListAdd.setTitle("Acuities List Add");
				frameAccuritiesListAdd.setModal(true);
				frameAccuritiesListAdd.setVisible(true);
				fillList();
			}
		});
		// orthopedicCareButton.setBackground(Color.WHITE);
		// orthopedicCareButton.setForeground(DEF_COL);

		orthopedicCareButton.setBackground(new Color(30, 100, 120));
		orthopedicCareButton.setForeground(Color.WHITE);
		// orthopedicCareButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		orthopedicCareButton.setFont(new Font("", Font.BOLD, 12));
		orthopedicCareButton.setText("Orthopedic care");

		headTraumaList = new JList();
		headTraumaList.setBorder(new LineBorder(DEF_COL, 1, false));
		headTraumaList.setFont(new Font("", Font.BOLD, 12));
		headTraumaList.setForeground(DEF_COL);

		final JScrollPane listScrollPane7_1 = new JScrollPane();
		listScrollPane7_1.setBounds(1086, 36, 131, 210);
		panelAcuit.add(listScrollPane7_1);
		listScrollPane7_1.setViewportView(headTraumaList);

		headTraumaButton = new JxLiquidButton(0.4f);
		headTraumaButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				Global.currentAccuritiesListKey = 9;
				frameAccuritiesListAdd = new FrameAccuritiesListAdd(
						Global.currentAccuritiesListKey, floor, date,
						"Head Trauma");
				SwingUtils.center(frameAccuritiesListAdd);
				frameAccuritiesListAdd.setTitle("Acuities List Add");
				frameAccuritiesListAdd.setModal(true);
				frameAccuritiesListAdd.setVisible(true);
				fillList();
			}
		});
		headTraumaButton.setText("Head Trauma");
		headTraumaButton.setBounds(1086, 5, 126, 25);
		headTraumaButton.setBackground(new Color(30, 100, 120));
		headTraumaButton.setForeground(Color.WHITE);
		headTraumaButton.setFont(new Font("", Font.BOLD, 12));
		panelAcuit.add(headTraumaButton);

		final JLabel dateLabel = new JLabel();
		dateLabel.setText(date + " 11:59 PM");
		dateLabel.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		dateLabel.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		dateLabel.setBounds(243, 7, 300, 21);
		add(dateLabel);
		setDefaultLayout();

		getNurseOrCNAshift();

		doUpdateList();
		fillList();
		doUpdate();
		updateTable();

		final JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(731, 2, 514, 30);
		add(panel_1);

		lblUserType = new JLabel();
		lblUserType.setBounds(0, 0, 514, 30);
		lblUserType.setText("");
		panel_1.add(lblUserType);

	}

	/*
	 * public enum UserType { Nurse, CNA } UserType usertype;
	 * 
	 * public void getuserType(UserType userType){ this.usertype=userType; }
	 */

	private void getNurseOrCNAshift() {
		List<UserSchedule> userSchedule = null;
		Date d;
		DateFormat df = new SimpleDateFormat("MMM dd, yyyy");
		try {

			d = df.parse(date);
			userSchedule = new ArrayList<UserSchedule>();
			userSchedule = UserScheduleDAO.getInstance()
					.getNurseOrCNAShiftReords(d);
			for (UserSchedule u : userSchedule) {
				System.out.println("u.getSerial()" + u.getSerial());
				System.out.println("u.getDate()" + u.getDate());
				//u.getUserType();

				/*
				 * switch (userType) { case "Nurse":
				 * 
				 * 
				 * 
				 * 
				 * 
				 * System.out.println("January"); break;
				 * 
				 * case "CNA":
				 * 
				 * 
				 * 
				 * 
				 * break; default: System.out.println("Invalid userType.");
				 * break; }
				 */

				System.out.println("u.getShift()" + u.getShift());
				// System.out.println( "u.getTot()"+u.getTotshift());

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String args[]) {
		SwingUtils.openInDialogforJPanel(new PanelFloorWiseAccuties("", ""))
				.setVisible(true);
	}

	private void doUpdateList() {
		Date d;
		List accList = null;
		DateFormat df = new SimpleDateFormat("MMM dd, yyyy");
		try {
			d = df.parse(date);
			accList = MedrexClientManager.getInstance()
					.getAccuritiesListByDate(d, floor);

		} catch (Exception e) {
			e.printStackTrace();
		}
		if (accList != null) {
			Global.accuritiesList = accList;
		}
	}

	public void fillList() {
		List accList = Global.accuritiesList;
		System.out.println("accList: " + accList.size());
		ResidentMain res = null;
		int i = 0;
		int typeId = 0;
		setEditable(true);
		Date accDate = null;
		try {
			accDate = new SimpleDateFormat("MMM dd, yyyy").parse(date);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		Date curDate = MedrexClientManager.getServerTime();

		if (accList != null) {
			o2List.removeAll();
			ivList.removeAll();
			woList.removeAll();
			tList.removeAll();
			orthopedicCareList.removeAll();
			headTraumaList.removeAll();
			advancedNeuroCareList.removeAll();
			respiratoryServicesList.removeAll();
			tracheotomyList.removeAll();

			List o2 = new ArrayList<String>();
			List iv = new ArrayList<String>();
			List wo = new ArrayList<String>();
			List t = new ArrayList<String>();
			List orthopedicCare = new ArrayList<String>();
			List headTrauma = new ArrayList<String>();
			List advancedNeuroCare = new ArrayList<String>();
			List respiratoryServices = new ArrayList<String>();
			List tracheotomy = new ArrayList<String>();

			strListData = new String[accList.size()];
			Iterator itr = accList.iterator();
			while (itr.hasNext()) {
				Accurities acc = (Accurities) itr.next();
				typeId = acc.getTypeId();
				try {
					res = MedrexClientManager.getInstance().getResident(
							acc.getResidentId());
				} catch (Exception e) {
					e.printStackTrace();
				}
				String resName = res.getUserPass() + ", " + res.getUserName();
				i++;

				if (typeId == 1) {
					o2.add(resName);
				}
				if (typeId == 2) {
					iv.add(resName);
				}
				if (typeId == 3) {
					wo.add(resName);
				}
				if (typeId == 4) {
					t.add(resName);
				}
				if (typeId == 5) {
					tracheotomy.add(resName);
				}
				if (typeId == 6) {
					respiratoryServices.add(resName);
				}
				if (typeId == 7) {
					advancedNeuroCare.add(resName);
				}
				if (typeId == 8) {
					orthopedicCare.add(resName);
				}
				if (typeId == 9) {
					headTrauma.add(resName);
				}
			}
			o2List.setModel(new DefaultComboBoxModel(o2.toArray()));
			ivList.setModel(new DefaultComboBoxModel(iv.toArray()));
			woList.setModel(new DefaultComboBoxModel(wo.toArray()));
			tList.setModel(new DefaultComboBoxModel(t.toArray()));
			tracheotomyList.setModel(new DefaultComboBoxModel(tracheotomy
					.toArray()));
			respiratoryServicesList.setModel(new DefaultComboBoxModel(
					respiratoryServices.toArray()));
			advancedNeuroCareList.setModel(new DefaultComboBoxModel(
					advancedNeuroCare.toArray()));
			orthopedicCareList.setModel(new DefaultComboBoxModel(orthopedicCare
					.toArray()));
			headTraumaList.setModel(new DefaultComboBoxModel(headTrauma
					.toArray()));

			if (Utils.DateDifference(curDate, accDate) > 1) {
				setEditable(false);
			}
		}
		if ("Administrator".equalsIgnoreCase(Global.currentLoggedInUserType)) {
			setEditable(true);
		}
	}

	@Override
	public String getTitle() {
		return "Acuities Floor Wise";
	}

	protected void doUpdate() {
		int w = getWidth();
		int h = getHeight() - 76 - 20;
		if (getTopLevelAncestor() != null) {
			getTopLevelAncestor().repaint();
		} else {
			this.repaint();
		}
		fillTitleLabels();
	}

	public void fillTitleLabels() {
		lblTitle.setText(floor + " Details:");
	}

	private void updateTable() {
		Date d = null;
		d = new Date(date);
		// for setting time 11:59:59 PM.
		d.setHours(23);
		d.setMinutes(59);
		d.setSeconds(59);

		List<CountAuditFloor> records = new ArrayList<CountAuditFloor>();
		try {
			int countAuditSerial = MedrexClientManager.getInstance()
					.getCountAuditSeialByDateFloor(d, floor);
			Global.currentCountAuditKey = countAuditSerial;

		} catch (Exception e) {
			e.printStackTrace();
		}

		if (Global.currentCountAuditKey == 0) {
			List<Rooms> residentList = new ArrayList<Rooms>();

			try {

				System.out.println("date: " + d);
				if (floor.equalsIgnoreCase("1st floor")) {
					residentList = MedrexClientManager.getInstance()
							.getFirstFloorResidents(d);
				}
				if (floor.equalsIgnoreCase("2nd floor")) {
					residentList = MedrexClientManager.getInstance()
							.getSecondFloorResidents(d);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (residentList != null) {
				Iterator<Rooms> itr = residentList.iterator();
				while (itr.hasNext()) {
					Rooms room = itr.next();
					CountAuditFloor ref = new CountAuditFloor();
					ref.setResidentId(room.getResmain().getSerial());
					ref.setPresent(false);
					ref.setReason("");
					records.add(ref);
				}
			}
		} else {
			CountAudit refCountAudit = null;
			try {
				refCountAudit = MedrexClientManager.getInstance()
						.getCountAudit(Global.currentCountAuditKey);
			} catch (Exception e) {
				e.printStackTrace();
			}
			records = refCountAudit.getAuditedFloors();
			Users user = null;
			try {
				user = MedrexClientManager.getInstance().getUser(
						refCountAudit.getAuditedBy());
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MedrexException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			lblDoneBy.setText(user.getUserName());
		}
		if (records != null) {
			lblTotalValue.setText(records.size() + "");
		}
		tableModal.setSelectedDate(d);
		tableModal.setRecords(records);
		tableModal.fireTableDataChanged();
		tableModal.fireTableStructureChanged();
		table.repaint();
		table.setFont(new Font("", Font.BOLD, 12));

		updatePresentCount();
	}

	private void updatePresentCount() {
		List<CountAuditFloor> list = tableModal.getRecords();
		int presentCounter = 0;
		for (CountAuditFloor ref : list) {
			if (ref != null && ref.isPresent()) {
				presentCounter++;
			}
		}
		lblPresentValue.setText(presentCounter + "");
		iConfirmThatCheckBox.setText("I, " + Global.currentLoggedInUserName
				+ " confirm that there are " + presentCounter + " residents.");
	}

	private void checkAll(boolean checkBool) {
		List<CountAuditFloor> list = tableModal.getRecords();
		int presentCounter = 0;
		for (CountAuditFloor ref : list) {
			if (ref != null) {
				presentCounter++;
				ref.setPresent(checkBool);
			}
		}
		if (checkBool) {
			lblPresentValue.setText(presentCounter + "");
			iConfirmThatCheckBox.setText("I, " + Global.currentLoggedInUserName
					+ " confirm that there are " + presentCounter
					+ " residents.");
		} else {
			lblPresentValue.setText("0");
			iConfirmThatCheckBox.setText("I, " + Global.currentLoggedInUserName
					+ " confirm that there are " + 0 + " residents.");
		}
	}

	public void doSaveCountAudit() {
		List<CountAuditFloor> floorAudits = tableModal.getRecords();
		/*
		 * Iterator<CountAuditFloor> itr = floorAudits.iterator();
		 * 
		 * while(itr.hasNext()) { CountAuditFloor ref = itr.next(); try {
		 * MedrexClientManager.getInstance().insertOrUpdateCountAuditFloor(ref);
		 * } catch (Exception e) { e.printStackTrace(); } }
		 */

		CountAudit audit = new CountAudit();
		audit.setSerial(Global.currentCountAuditKey);
		audit.setAuditedBy(Global.currentLoggedInUserKey);
		// audit.setDateAndTime(MedrexClientManager.getServerTime());
		Date d;
		DateFormat df = new SimpleDateFormat("MMM dd, yyyy", Locale.US);

		audit.setFloor(floor);
		audit.setAuditedFloors(floorAudits);

		try {
			d = df.parse(date);
			audit.setDateAndTime(d);
			MedrexClientManager.getInstance().insertOrUpdateCountAudit(audit);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void setEditable(boolean value) {
		o2Button.setEnabled(value);
		ivButton.setEnabled(value);
		woButton.setEnabled(value);
		tButton.setEnabled(value);
		tracheotomyButton.setEnabled(value);
		respiratoryServicesButton.setEnabled(value);
		advancedNeuroCareButton.setEnabled(value);
		orthopedicCareButton.setEnabled(value);
		headTraumaButton.setEnabled(value);
		iConfirmThatCheckBox.setEnabled(value);
		// btnSave.setEnabled(value);
	}

	public void doSaveAccuties() {
		// Accurities accurities = new Accurities();
		List<Accurities> accList = Global.accuritiesList;
		if (accList != null) {
			// Iterator itr = accList.iterator();
			// while(itr.hasNext()){
			// accurities = (Accurities) itr.next();
			// // System.out.println("serial: "+accurities.getSerial());
			// accurities.setFloor(floor);
			Date d;
			DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);

			try {
				d = df.parse(date);
				// accurities.setDate(d);
				MedrexClientManager.getInstance().insertOrUpdateAccurities(
						accList, floor, d);
				// Global.currentAccuritiesKey=MedrexClientManager.getInstance().insertOrUpdateAccurities(accurities);
			} catch (Exception e) {

			}
			// }
		}

	}

	public boolean doValidate() {
		boolean isValid = true;
		List<CountAuditFloor> list = tableModal.getRecords();
		for (CountAuditFloor ref : list) {
			if (ref != null && !ref.isPresent()) {
				if (ref.getReason() == null
						|| "".equalsIgnoreCase(ref.getReason())) {
					isValid = false;
					break;
				}
			}
		}
		if (!isValid) {
			JOptionPane
					.showMessageDialog(
							null,
							"Reason for all unchecked entries is mandatory.\n Please fill all of them!!!",
							"Count Audit", JOptionPane.ERROR_MESSAGE);
		}
		return isValid;
	}

	public void setDefaultLayout() {

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screenSize.width - 20, screenSize.height - 75);
		Dimension rootPanelSize = getSize();
		setPreferredSize(getSize());
		panel.setSize(rootPanelSize.width - 50, panel.getHeight());
		panel.setPreferredSize(panel.getSize());
		panelMain.setSize(rootPanelSize.width - 50, panelMain.getHeight());
		panelMain.setPreferredSize(panelMain.getSize());
	}
}
