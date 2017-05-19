package medrex.client.room;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import medrex.client.constants.Global;
import medrex.client.main.resident.personalInfo.ControllerRoomList;
import medrex.client.utils.SwingUtils;
import medrex.client.utils.controls.JxTableMedrex;

import com.sX.awt.Direction;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxPanel;

public class PanelRoomPopUpFloorPlan extends JxPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4474605408652713419L;
	private JPanel panel;
	private JxTableMedrex table;
	private ControllerRoomList controllerRoomList;
	private JxComboBox cmbFloorType;
	private JPanel panel_2;
	private static final Color DEF_COLOR = new Color(49, 104, 127);
	private static final Color back = new Color(204, 218, 223);
	private static final Color shallow = new Color(207, 218, 224);
	private static final Color dark = new Color(129, 151, 164);
	PanelFirstFloorSouthWing pf1 = null;
	PanelRoomMainNorthWing pf2 = null;
	private PanelSecondFloorSouthWing pf3 = null;
	private Date date;
	private PanelMainAndNorthWing pf4 = null;

	public PanelRoomPopUpFloorPlan(final ControllerRoomList controllerRoomList,
			Date date) {
		super();
		this.controllerRoomList = controllerRoomList;
		this.date = date;
		// Global.panelRoomPopUpFloorPlan=this;
		setLayout(null);
		setBorder(null);
		setArc(0);
		setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
				.getDefaultToolkit().getScreenSize().height);
		setLinearGradient(shallow, dark, Direction.LEFT_TO_RIGHT);
		setLayout(new BorderLayout());
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(200, 100));
		panel.setBounds(5, 5, 1350, 34);
		panel.setOpaque(false);
		panel.setLayout(null);
		panel.setBackground(back);
		setOpaque(false);
		add(panel, BorderLayout.NORTH);

		final JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(351, 53, 311, 33);
		panel.add(panel_1);
		SimpleDateFormat df = new SimpleDateFormat("MMM dd, yyyy , h:mm a");

		final JLabel fLabel_1 = new JLabel();
		fLabel_1.setText("New JLabel");
		fLabel_1.setForeground(Color.WHITE);
		fLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		fLabel_1.setText(df.format(date));
		panel_1.add(fLabel_1);

		final JLabel fLabel = new JLabel();
		fLabel.setBounds(668, 53, 70, 33);
		panel.add(fLabel);
		fLabel.setForeground(Color.WHITE);
		fLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		fLabel.setText("FLOOR #");

		cmbFloorType = new JxComboBox();
		cmbFloorType.setOpaque(false);
		cmbFloorType.setBounds(757, 53, 226, 25);
		panel.add(cmbFloorType);
		cmbFloorType.setBackground(Color.WHITE);
		cmbFloorType.setForeground(DEF_COLOR);
		cmbFloorType.setArc(0.4f);
		cmbFloorType.setBorder(new LineBorder(DEF_COLOR, 1, false));
		cmbFloorType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateRoomSubCategory();
			}
		});

		final JLabel plazaHealthCareLabel = new JLabel();
		plazaHealthCareLabel.setFont(new Font("", Font.BOLD, 22));
		plazaHealthCareLabel.setForeground(DEF_COLOR);
		plazaHealthCareLabel.setText("Plaza Health Care Floor Plan");
		plazaHealthCareLabel.setBounds(549, 10, 314, 37);
		panel.add(plazaHealthCareLabel);
		panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setLayout(new FlowLayout());
		panel_2.setBounds(5, 45, 897, 253);
		add(panel_2, BorderLayout.CENTER);

		updateRoomCategoryCombo();
	}

	public void updateRoomCategoryCombo() {
		cmbFloorType.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "1st floor south wing", "Main North Wing",
						"2nd floor South Wing", "Main and north wing" }));

		cmbFloorType.setSelectedIndex(0);
	}

	public void updateRoomSubCategory() {
		if ("1st floor south wing".equalsIgnoreCase(cmbFloorType
				.getSelectedItem()
				+ "")) {
			// if(pf1==null){
			pf1 = new PanelFirstFloorSouthWing(date);
			panel_2.removeAll();
			panel_2.add(pf1, BorderLayout.CENTER);
			repaint();
			// }
			// else{
			// panel_2.removeAll();
			// panel_2.add(pf1,BorderLayout.CENTER);
			// repaint();
			// }
		}
		if ("Main North Wing".equalsIgnoreCase(cmbFloorType.getSelectedItem()
				+ "")) {
			// if(pf2==null){

			pf2 = new PanelRoomMainNorthWing(date);
			panel_2.removeAll();
			panel_2.add(pf2, BorderLayout.CENTER);
			repaint();
			// }
			// else{
			// panel_2.removeAll();
			// panel_2.add(pf2,BorderLayout.CENTER);
			// repaint();
			// }

			// pf.setPreferredSize(new Dimension(1200,800));
			// System.out.println("width"+pf.getBounds()+"Height"+pf.getHeight());
			// pf.setLayout(null);
			// pf.setPreferredSize(new Dimension(1200,800));
			// pf.setBounds(scrollPane.getBounds().x,scrollPane.getBounds().y,getWidth(),getHeight());
			// scrollPane.setVisible(false);
			// pf.setBounds(10,50,Toolkit.getDefaultToolkit().getScreenSize().width-200,Toolkit.getDefaultToolkit().getScreenSize().height-80);
			// this.getParent().setSize(Toolkit.getDefaultToolkit().getScreenSize().width,Toolkit.getDefaultToolkit().getScreenSize().height-80);
			// this.add(pf);
			// scrollPane.setViewportView(pf);
		}
		if ("2nd floor South Wing".equalsIgnoreCase(cmbFloorType
				.getSelectedItem()
				+ "")) {

			// if(pf3==null){
			pf3 = new PanelSecondFloorSouthWing(date);
			panel_2.removeAll();
			panel_2.add(pf3, BorderLayout.CENTER);
			repaint();
			// }
			// else{
			// panel_2.removeAll();
			// panel_2.add(pf3,BorderLayout.CENTER);
			// repaint();
			// }
		}
		if ("Main and north wing".equalsIgnoreCase(cmbFloorType
				.getSelectedItem()
				+ "")) {
			// if(pf4==null){
			pf4 = new PanelMainAndNorthWing(date);
			panel_2.removeAll();
			panel_2.add(pf4, BorderLayout.CENTER);
			repaint();
			// }
			// else{
			// panel_2.removeAll();
			// panel_2.add(pf4,BorderLayout.CENTER);
			// repaint();
			// }
		}
	}

	public void doUpdateRoomAndFloorType() {
		// System.out.println("=================================");
		controllerRoomList.setFloorType(cmbFloorType.getSelectedItem() + "");
		controllerRoomList.setRoom(Global.selectedRoom);
		// System.out.println("Room: "+ controllerRoomList.getRoom());
		// Global.selectedFloor=cmbFloorType.getSelectedItem()+"";
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
				new PanelRoomPopUpFloorPlan(new ControllerRoomList(),
						new Date())).setVisible(true);
	}
}
