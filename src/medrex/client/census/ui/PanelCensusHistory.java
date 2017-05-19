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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.PanelResidentInformation;
import medrex.client.main.resident.census.CensusJTable;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;

public class PanelCensusHistory extends JPanel {

	private PanelResidentInformation panelRight;
	private JPanel panelSubMain;
	private JxButton btnPrevious;
	private JxButton btnDelete;
	private JxPanel panelContent;
	private JPanel panelMain;

	private static final long serialVersionUID = 1L;

	public static final Color GREEN = new Color(34, 139, 34);
	public static final Color RED = Color.RED;
	public static final Color GRAY = Color.GRAY;
	public static final Color DEFAULT = Color.BLACK;
	private Date currentDate;
	private JPanel panelFooter;
	private JxTable table;
	private medrex.client.main.resident.census.CensusJTable censusJTableModal;
	private JLabel lblTitle;

	public PanelCensusHistory() {
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
		lblTitle.setText("Census History:");
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
		panelRight.setResident(Global.panelCensusMain.getResident());
		panelRight.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		panelRight.setOpaque(false);
		// panelRight.setPreferredSize(new Dimension(175, 275));
		panelRight.setBounds(610, 45, 175, 394);
		// panelMain.add(panelRight, BorderLayout.EAST);

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
		 */
		btnPrevious = new JxButton();
		btnPrevious.setArc(0.2f);
		btnPrevious.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		btnPrevious.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		btnPrevious.setHorizontalAlignment(SwingConstants.CENTER);
		btnPrevious.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		btnPrevious.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.panelCensusMain.changeCard(PanelCensusMain.DEFAULT);
			}
		});
		btnPrevious.setText("BACK");
		btnPrevious.setPreferredSize(new Dimension(100, 31));
		// btnPrevious.setBounds(603, 505, 100, 31);
		panelFooterRight.add(btnPrevious);

		panelContent = new JxPanel();
		panelContent.setBounds(0, 0, 780, 319);
		// panelContent.setPreferredSize(new Dimension(780, 319));
		panelContent.setBackground(GuiModes.CHANGE_SCREEN
				.getDefaultBackgroundColor());
		panelContent.setBorder(new LineBorder(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor(), 2, false));
		panelContent.setArc(1.0f);
		panelContent.setOpaque(false);
		panelContent.setLayout(new BorderLayout());
		panelContent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				panelContent.requestFocus();
			}
		});
		panelSubMain.add(panelContent);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor(), 1, false));
		// scrollPane.setBounds(10, 10, 678, 216);
		panelContent.add(scrollPane);

		table = new JxTable();
		table.setRowHeight(21);
		table.setRowMargin(2);
		table.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont().deriveFont(12f)
				.deriveFont(Font.PLAIN));
		censusJTableModal = new CensusJTable();
		table.setModel(censusJTableModal);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					// String strId = (String) censusJTableModal.getValueAt(
					// table.getSelectedRow(), 8);
					// if(!strId.equalsIgnoreCase("")){
					// int topId = new Integer(strId).intValue();
					// System.out.println("topId: "+topId);
					// }
					// String strId1 = (String) censusJTableModal.getValueAt(
					// table.getSelectedRow(), 9);
					// if(!strId1.equalsIgnoreCase("")){
					// int bottomId = new Integer(strId1).intValue();
					// System.out.println("bottomId: "+bottomId);
					// }
					int id = 0;
					int prevSerial = 0;
					int nextSerial = 0;

					String serialStr = (String) censusJTableModal.getValueAt(
							table.getSelectedRow(), 6);
					if (serialStr != null) {
						id = new Integer(serialStr).intValue();
					}

					String preStr = (String) censusJTableModal.getValueAt(table
							.getSelectedRow() + 1, 6);
					String nextStr = (String) censusJTableModal.getValueAt(
							table.getSelectedRow() - 1, 6);
					if (!preStr.equalsIgnoreCase("")) {
						prevSerial = new Integer(preStr).intValue();
					}
					if (!nextStr.equalsIgnoreCase("")) {
						nextSerial = new Integer(nextStr).intValue();
					}

					// System.out.println("prevSerial: "+ prevSerial);
					// System.out.println("nextSerial: "+ nextSerial);

					String type = (String) censusJTableModal.getValueAt(table
							.getSelectedRow(), 7);
					Global.currentCensusStatusId = id;
					Global.currentCenusStatusPrevId = prevSerial;
					Global.currentCenusStatusNextId = nextSerial;

					// FrameCensusNotes frameCensusNotes = new
					// FrameCensusNotes();
					// frameCensusNotes.setVisible(true);

					if (type.equalsIgnoreCase("Admission")) {
						Global.panelCensusMain
								.changeCard(PanelCensusMain.ADMISSION);
					} else if (type.equalsIgnoreCase("Discharge")) {
						Global.panelCensusMain
								.changeCard(PanelCensusMain.DISCHARGE);
					} else if (type.equalsIgnoreCase("Sign Out")) {
						int signoutStatus = Integer.parseInt(censusJTableModal
								.getValueAt(table.getSelectedRow(), 8)
								+ "");
						if (signoutStatus == 1) {
							Global.panelCensusMain
									.changeCard(PanelCensusMain.ER);
						} else {
							Global.panelCensusMain
									.changeCard(PanelCensusMain.SIGN_OUT);
						}
					} else if (type.equalsIgnoreCase("Sign In")) {
						Global.panelCensusMain
								.changeCard(PanelCensusMain.SIGN_IN);
					}

				} else if (evt.getClickCount() == 1) {
					System.out.println("single click");
				}
			}
		});

		scrollPane.setViewportView(table);

		btnDelete = new JxButton();
		btnDelete.setArc(0.2f);
		btnDelete.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		btnDelete.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		btnDelete.setHorizontalAlignment(SwingConstants.CENTER);
		btnDelete.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		btnDelete.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (table.getSelectedRow() == 0) {
					int serial = new Integer((String) censusJTableModal
							.getValueAt(table.getSelectedRow(), 6)).intValue();
					System.out.println("census serial:" + serial
							+ ", residentKey:"
							+ Global.panelCensusMain.getResident().getSerial());
					if (serial != 0) {
						try {
							CensusStatus ref = MedrexClientManager
									.getInstance().getCensusStatus(
											serial,
											Global.panelCensusMain
													.getResident().getSerial());
							ref.setCurrentStatus("History");
							int residentId = ref.getResidentId();
							if (ref != null) {
								ResidentMain res = null;
								MedrexClientManager.getInstance()
										.deleteCensusStatus(serial);
								res = MedrexClientManager.getInstance()
										.getResident(residentId);
								// update top right resident information
								Global.panelCensusMain.setResident(res);

							}

						} catch (MedrexException e1) {
							JOptionPane
									.showMessageDialog(null, e1.getMessage());
							e1.printStackTrace();
						} catch (RemoteException re) {

						}
					}
					System.out.println("serial: " + serial);
					updateCensusJTable();

				} else {
					JOptionPane.showMessageDialog(null,
							"Can only delete last census entry", "Message",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnDelete.setText("DELETE");
		btnDelete.setPreferredSize(new Dimension(100, 31));
		// btnPrevious.setBounds(603, 505, 100, 31);
		panelFooterRight.add(btnDelete);
		if (Global.currentLoggedInUserType.equals("Administrator")) {
			btnDelete.setVisible(true);
		} else {
			btnDelete.setVisible(false);
		}

		updateCensusJTable();
	}

	public void updateCensusJTable() {
		List censusRecords = new ArrayList();
		if (Global.panelCensusMain.getResident().getSerial() != 0) {
			try {
				censusRecords = MedrexClientManager.getInstance()
						.getCensusStatuss(
								"desc",
								Global.panelCensusMain.getResident()
										.getSerial());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		censusJTableModal.setNewList(censusRecords);
		censusJTableModal.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}

	protected void doUpdate() {
		int w = getWidth();
		int h = getHeight();
		float wF = ((float) w / 868);
		float hF = ((float) h / 592);
		// 72, 40, 791, 477
		panelMain.setBounds((int) (72 * wF), (int) (40 * hF), (int) (791 * wF),
				(int) (477 * hF));
		// 0, 0, 791, 35
		lblTitle.setBounds(0, 0, (int) (791 * wF), (int) (35 * hF));
		// 0, 45, 606, 319
		panelSubMain.setBounds(0, (int) (45 * hF), (int) (781 * wF),
				(int) (319 * hF));
		// 610, 45, 175, 319
		// panelRight.setBounds((int) (610 * wF), (int) (45 * hF), (int) (175 *
		// wF), (int) (319 * hF));
		// 0, 374, 791, 103
		panelFooter.setBounds((int) (0 * wF), (int) (374 * hF),
				(int) (791 * wF), (int) (103 * hF));
		// 0, 0, 666, 325
		panelContent.setBounds(SwingUtils.centerRectangle(panelSubMain
				.getBounds(), new Rectangle(0, 0, 780, 319)));

		if (getTopLevelAncestor() != null) {
			getTopLevelAncestor().repaint();
		} else {
			this.repaint();
		}
		// updateData();
		updateCensusJTable();
		// btnSave.setText("");
		// btnSave.setText("SAVE");
	}

}