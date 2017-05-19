package medrex.client.census.countAudit;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

import medrex.client.census.ui.FrameCensusNotes;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.census.countAudit.CountAudit;
import medrex.commons.vo.census.countAudit.CountAuditFloor;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;

public class PanelCountAuditFloorWise extends JPanel {

	private JxTable table;
	private JLabel lblPresentValue;
	private JLabel lblTotalValue;
	private ButtonGroup bgFrom = new ButtonGroup();
	// private JxComboBox cmbAmPm;
	// private JxComboBox cmbMinutes;
	// private JxComboBox cmbHours;
	// private JLabel dateLabel_1;
	// private JDateChooser dcAdmissionDate;
	// private JLabel dateLabel;
	private JxPanel panelContent;

	private static final long serialVersionUID = 1L;

	private Date currentDate;
	private JPanel panelMain;
	private JPanel panelSubMain;
	private JPanel panelFooter;
	private JxButton btnCancel;
	private JxButton btnSave;
	private JLabel lblTitle;
	private JxButton btnNotes;
	// private JXLayer<JPanel> layerContent;
	// private LockableUI layerUI;
	private CountAuditFloorWiseTableModal tableModal;
	private JCheckBox iConfirmThatCheckBox;

	public PanelCountAuditFloorWise() {
		super();

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
		lblTitle.setText("1st Floor Count Audit Details:");
		lblTitle.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont()
				.deriveFont(28f));
		lblTitle.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		panelMain.add(lblTitle, BorderLayout.NORTH);

		panelSubMain = new JPanel();
		panelSubMain.setLayout(null);
		panelSubMain.setOpaque(false);
		// panelSubMain.setPreferredSize(new Dimension(628, 108));
		panelSubMain.setBounds(0, 45, 791, 394);
		panelMain.add(panelSubMain, BorderLayout.CENTER);

		// setSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
		// setPreferredSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
		// setSize(500,360);
		// panelMain.setBounds(SwingUtils.centerRectangle(this.getBounds(),
		// panelMain.getBounds()));
		// panelRight.setPreferredSize(new Dimension(175, 275));

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
					doSave();
					// Global.frameCensusFormsNew.showCensusStatus();
					Global.panelCountAuditMain
							.changeCard(PanelCountAuditMain.DEFAULT);
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
				// if (!layerUI.isLocked()) {
				Global.currentCountAuditKey = 0;
				Global.panelCountAuditMain
						.changeCard(PanelCountAuditMain.DEFAULT);
				// } else {
				// Global.panelCountAuditMain
				// .changeCard(PanelCountAuditMain.REPORTS);
				// }
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
		panelFooterRight.add(btnCancel);

		panelContent = new JxPanel();
		panelContent.setBounds(0, 0, 700, 341);
		panelContent.setPreferredSize(new Dimension(700, 292));
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

		// layerUI = new LockableUI(new BufferedImageOpEffect(new
		// OpacityFilter()));
		// layerContent = new JXLayer<JPanel>(panelContent);
		// layerContent.setUI(layerUI);
		// layerContent.setLayout(null);
		// layerContent.setBounds(0, 0, 700, 292);
		// panelSubMain.add(layerContent);

		final JLabel lblTotal = new JLabel();
		lblTotal.setBounds(20, 15, 48, 31);
		lblTotal.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		lblTotal.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		lblTotal.setText("Total:");
		panelContent.add(lblTotal);

		final JLabel lblPresent = new JLabel();
		lblPresent.setBounds(303, 15, 70, 31);
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
		lblPresentValue.setBounds(379, 15, 59, 31);
		panelContent.add(lblPresentValue);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(GuiModes.CHANGE_SCREEN
				.getDefaultBackgroundColor());
		scrollPane.getViewport().setBackground(
				GuiModes.CHANGE_SCREEN.getDefaultBackgroundColor());
		scrollPane.setBounds(20, 52, 658, 216);
		scrollPane.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		panelContent.add(scrollPane);

		tableModal = new CountAuditFloorWiseTableModal();
		tableModal.addTableModelListener(new TableModelListener() {
			public void tableChanged(TableModelEvent e) {
				if (e.getColumn() == 2) {
					updatePresentCount();
				}
			}
		});

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
		selectAllCheckBox.setBounds(549, 15, 111, 31);
		panelContent.add(selectAllCheckBox);

		iConfirmThatCheckBox = new JCheckBox();
		iConfirmThatCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent e) {
				btnSave.setEnabled(iConfirmThatCheckBox.isSelected());
				if (iConfirmThatCheckBox.isSelected()) {
					btnSave.setBackground(GuiModes.CHANGE_SCREEN
							.getControlBackgroundColor());
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
		iConfirmThatCheckBox.setBounds(20, 291, 658, 40);
		panelContent.add(iConfirmThatCheckBox);

		iConfirmThatCheckBox.setSelected(true);
		iConfirmThatCheckBox.setSelected(false);

		doUpdate();
		updateTable();
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
		// 0, 445, 791, 51
		panelFooter.setBounds((int) (0 * wF), (int) (445 * hF),
				(int) (791 * wF), (int) (51 * hF));
		// 0, 0, 700, 292
		// layerContent.setBounds(SwingUtils.centerRectangle(panelSubMain.getBounds(),
		// new Rectangle(0, 0, 700, 341)));
		panelContent.setSize(700, 341);

		if (getTopLevelAncestor() != null) {
			getTopLevelAncestor().repaint();
		} else {
			this.repaint();
		}
		fillCombos();
	}

	public void fillCombos() {
		lblTitle.setText(Global.panelCountAuditMain.getFloorType()
				+ " Details:");
	}

	private void updateTable() {
		List<CountAuditFloor> records = new ArrayList<CountAuditFloor>();

		if (Global.currentCountAuditKey == 0) {
			List<ResidentMain> residentList = new ArrayList<ResidentMain>();

			try {
				residentList = MedrexClientManager.getInstance().getResidents(
						Global.panelCountAuditMain.getFloorType());
			} catch (Exception e) {
				e.printStackTrace();
			}

			Iterator<ResidentMain> itr = residentList.iterator();
			while (itr.hasNext()) {
				ResidentMain resident = itr.next();
				CountAuditFloor ref = new CountAuditFloor();
				ref.setResidentId(resident.getSerial());
				ref.setPresent(false);
				ref.setReason("");
				records.add(ref);
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
		}
		if (records != null) {
			lblTotalValue.setText(records.size() + "");
		}
		tableModal.setRecords(records);
		tableModal.fireTableDataChanged();
		tableModal.fireTableStructureChanged();
		table.repaint();

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

	public void doSave() {
		List<CountAuditFloor> floorAudits = tableModal.getRecords();
		Iterator<CountAuditFloor> itr = floorAudits.iterator();

		while (itr.hasNext()) {
			CountAuditFloor ref = itr.next();
			try {
				MedrexClientManager.getInstance()
						.insertOrUpdateCountAuditFloor(ref);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		CountAudit audit = new CountAudit();
		audit.setSerial(Global.currentCountAuditKey);
		audit.setAuditedBy(Global.currentLoggedInUserKey);
		audit.setDateAndTime(MedrexClientManager.getServerTime());
		audit.setFloor(Global.panelCountAuditMain.getFloorType());
		audit.setAuditedFloors(floorAudits);

		try {
			MedrexClientManager.getInstance().insertOrUpdateCountAudit(audit);
		} catch (Exception e) {
			e.printStackTrace();
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
}