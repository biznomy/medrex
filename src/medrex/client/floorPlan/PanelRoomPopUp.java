package medrex.client.floorPlan;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import medrex.client.constants.Global;
import medrex.client.main.resident.personalInfo.ControllerRoomList;
import medrex.client.utils.SwingUtils;
import medrex.client.utils.controls.JxTableMedrex;

import com.sX.awt.Direction;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxLayeredPanel;
import com.sX.swing.JxPanel;

public class PanelRoomPopUp extends JxPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2883561223495207692L;
	private JPanel floorPanel;
	private JxTableMedrex table;
	private ControllerRoomList controllerRoomList;
	private JxComboBox cmbFloorType;
	private JPanel containerPanel;
	private static final Color DEF_COLOR = new Color(49, 104, 127);
	private static final Color back = new Color(204, 218, 223);
	private static final Color shallow = new Color(207, 218, 224);
	private static final Color dark = new Color(129, 151, 164);

	private Color darkRed = Color.RED;
	private Color lightRed = Color.pink;
	private Color darkYellow = new Color(204, 204, 0);
	private Color lightYellow = new Color(255, 255, 187);
	private Color color = new Color(194, 211, 217);

	private Date date;
	private PanelFirstFloor pf1;
	private JPanel glassPane;
	private PanelSecondFloor pf2;
	private Map<String, Integer> residentId = new HashMap<String, Integer>();
	private JxLayeredPanel rootPanel;

	public PanelRoomPopUp(final ControllerRoomList controllerRoomList, Date date) {
		super();
		setLayout(new BorderLayout());
		this.controllerRoomList = controllerRoomList;
		this.date = date;
		Global.panelRoomPopUpFloorPlan = this;
		setLayout(new BorderLayout());
		setBorder(null);
		setArc(0);
		setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
				.getDefaultToolkit().getScreenSize().height);
		setLinearGradient(shallow, dark, Direction.LEFT_TO_RIGHT);

		rootPanel = new JxLayeredPanel();
		rootPanel.setLayout(new BorderLayout());
		rootPanel.setOpaque(false);
		add(rootPanel);

		floorPanel = new JPanel();
		floorPanel.setPreferredSize(new Dimension(300, 500));
		floorPanel.setOpaque(false);
		floorPanel.setLayout(null);
		// add(floorPanel,BorderLayout.WEST);
		rootPanel.setGlassPane(floorPanel);
		rootPanel.getGlassPane().setVisible(true);

		// glassPane = new JPanel();
		// glassPane.setBounds(0, 0, 200, 100);
		// glassPane.add(floorPanel);
		// add(glassPane);

		final JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(325, 5, 275, 30);
		floorPanel.add(panel_1);
		SimpleDateFormat df = new SimpleDateFormat("MMM dd, yyyy , h:mm a");

		final JLabel fLabel = new JLabel();
		fLabel.setBounds(23, 314, 70, 33);
		floorPanel.add(fLabel);
		fLabel.setForeground(medrex.commons.enums.ColorConstants.DEF_COLOR);
		fLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		fLabel.setText("FLOOR #");

		cmbFloorType = new JxComboBox();
		cmbFloorType.setOpaque(false);
		cmbFloorType.setBounds(120, 318, 180, 25);
		floorPanel.add(cmbFloorType);
		cmbFloorType.setBackground(Color.WHITE);
		cmbFloorType.setForeground(DEF_COLOR);
		cmbFloorType.setArc(0.4f);
		cmbFloorType.setBorder(new LineBorder(DEF_COLOR, 1, false));
		cmbFloorType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateRoomSubCategory();
			}
		});

		final JLabel fLabel_1 = new JLabel();
		fLabel_1.setBounds(68, 267, 167, 19);
		floorPanel.add(fLabel_1);
		fLabel_1.setText("New JLabel");
		fLabel_1.setForeground(medrex.commons.enums.ColorConstants.DEF_COLOR);
		fLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		fLabel_1.setText(df.format(date));

		final JxPanel panelOccupied = new JxPanel();
		panelOccupied.setBorder(new LineBorder(Color.black, 1, false));
		panelOccupied.setArc(0.4f);
		panelOccupied.setBounds(68, 103, 29, 19);
		panelOccupied.setLinearGradient(lightRed, darkRed,
				Direction.LEFT_TO_RIGHT);
		floorPanel.add(panelOccupied);

		final JxPanel panelAvailable = new JxPanel();
		panelAvailable.setBorder(new LineBorder(Color.black, 1, false));
		panelAvailable.setArc(0.4f);
		panelAvailable.setBounds(68, 140, 29, 19);
		panelAvailable.setLinearGradient(Color.WHITE, Color.WHITE,
				Direction.LEFT_TO_RIGHT);
		floorPanel.add(panelAvailable);

		// final JxPanel panelBedHold = new JxPanel();
		// panelBedHold.setBorder(new LineBorder(Color.black, 1, false));
		// panelBedHold.setArc(0.4f);
		// panelBedHold.setBounds(68, 182, 29, 19);
		// panelBedHold.setLinearGradient(lightYellow, darkYellow,
		// Direction.LEFT_TO_RIGHT);
		// floorPanel.add(panelBedHold);

		final JLabel labelOccupied = new JLabel();
		labelOccupied.setText("Occupied-F");
		labelOccupied.setFont(new Font("Arial", Font.BOLD, 14));
		labelOccupied.setBounds(133, 103, 125, 19);
		labelOccupied
				.setForeground(medrex.commons.enums.ColorConstants.DEF_COLOR);
		floorPanel.add(labelOccupied);

		final JLabel labelAvailable = new JLabel();
		labelAvailable.setText("Available");
		labelAvailable.setFont(new Font("Arial", Font.BOLD, 14));
		labelAvailable.setBounds(133, 140, 146, 19);
		labelAvailable
				.setForeground(medrex.commons.enums.ColorConstants.DEF_COLOR);
		floorPanel.add(labelAvailable);

		final JLabel labelOccupied_1 = new JLabel();
		labelOccupied_1.setFont(new Font("Arial", Font.BOLD, 14));
		labelOccupied_1.setText("Occupied-M");
		labelOccupied_1
				.setForeground(medrex.commons.enums.ColorConstants.DEF_COLOR);
		labelOccupied_1.setBounds(133, 70, 125, 19);

		floorPanel.add(labelOccupied_1);

		final JxPanel panelOccupied_1 = new JxPanel();
		panelOccupied_1.setBorder(new LineBorder(Color.black, 1, false));
		panelOccupied_1.setArc(0.4f);
		panelOccupied_1.setBounds(68, 70, 29, 19);
		panelOccupied_1.setLinearGradient(new Color(128, 170, 249), new Color(
				0, 0, 255), Direction.LEFT_TO_RIGHT);
		floorPanel.add(panelOccupied_1);

		// final JLabel labelBedHold = new JLabel();
		// labelBedHold.setText("Bed Hold");
		// labelBedHold.setFont(new Font("Dialog", Font.BOLD, 14));
		// labelBedHold.setForeground(medrex.commons.enums.ColorConstants.DEF_COLOR);
		// labelBedHold.setBounds(133, 182, 135, 19);
		// floorPanel.add(labelBedHold);

		containerPanel = new JPanel();
		containerPanel.setOpaque(false);
		containerPanel.setLayout(new BorderLayout());
		// add(containerPanel,BorderLayout.CENTER);
		rootPanel.add(containerPanel);

		updateRoomCategoryCombo();

	}

	public void updateRoomCategoryCombo() {
		cmbFloorType.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "1st floor Plan", "Second Floor Plan" }));

		cmbFloorType.setSelectedIndex(0);
	}

	public void updateRoomSubCategory() {

		if ("1st floor Plan".equalsIgnoreCase(cmbFloorType.getSelectedItem()
				+ "")) {

			pf1 = new PanelFirstFloor(controllerRoomList, date);
			containerPanel.removeAll();
			containerPanel.add(pf1, BorderLayout.CENTER);
			repaint();
		}
		if ("Second Floor Plan".equalsIgnoreCase(cmbFloorType.getSelectedItem()
				+ "")) {

			pf2 = new PanelSecondFloor(controllerRoomList, date);
			containerPanel.removeAll();
			containerPanel.add(pf2, BorderLayout.CENTER);
			repaint();
		}

	}

	public void doUpdateRoomAndFloorType() {
		// System.out.println("=========================================================================");
		controllerRoomList.setRoom(Global.selectedRoom);

		if (Global.panelChangeRoomForm != null) {
			Global.panelChangeRoomForm.doUpdateFloorsAndRooms();
			Global.frameRoomGraphicalView.dispose();
		}
	}

	public String getTitle() {
		return "Room List";
	}

	public static void main(String a[]) {
		SwingUtils.wrapInDialog(
				new PanelRoomPopUp(new ControllerRoomList(), new Date()))
				.setVisible(true);
	}
}
