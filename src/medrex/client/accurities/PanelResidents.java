package medrex.client.accurities;

import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import medrex.client.constants.Global;
import medrex.commons.dataObj.Rooms;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm3Row;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.awt.Direction;
import com.sX.swing.JxPanel;

public class PanelResidents extends JxPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3656302081826907919L;
	private JCheckBox cbResident;
	private JLabel lblResidentName;
	// private JLabel lblSex;
	// private JLabel lblLanguage;
	private JLabel lblRoom;
	private boolean pressed;
	private boolean rollOver;
	private Color color = new Color(194, 211, 217);
	private static final Color BACKGROUND = new Color(231, 234, 234);
	private static final Color FOREGROUND = new Color(0, 69, 97);
	private static final Border BORDER = new LineBorder(
			new Color(122, 154, 167), 2, false);
	PhysicianOrderForm3Row row = null;
	private JPanel backPanel;
	// private PanelImage panel_6;
	private ResidentMain rm = null;
	private Image image;

	public PanelResidents() {
		super();
		setArc(1.0f);
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {

			}
		});
		Global.panelResidentAcuities = this;
		setDoubleBuffered(true);
		setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		setLayout(null);
		setBackground(Color.WHITE);
		setSize(532, 25);

		backPanel = new JPanel();
		backPanel.setOpaque(false);
		backPanel.setBackground(Color.WHITE);
		backPanel.setLayout(null);
		backPanel.setBounds(343, 5, 158, 17);
		add(backPanel);

		final JLabel doctorLabel = new JLabel();
		doctorLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		doctorLabel.setText("Room");
		doctorLabel.setForeground(ColorConstants.DEF_COLOR);
		doctorLabel.setBounds(5, 0, 54, 14);
		backPanel.add(doctorLabel);

		lblRoom = new JLabel();
		lblRoom.setText("101-1");
		lblRoom.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRoom.setForeground(new Color(198, 67, 37));
		lblRoom.setBounds(70, 0, 88, 16);
		backPanel.add(lblRoom);

		/*
		 * final JPanel panel_1 = new JPanel(); panel_1.setOpaque(false);
		 * panel_1.setBackground(Color.WHITE); panel_1.setLayout(null);
		 * panel_1.setBounds(174, 33, 165, 32); add(panel_1);
		 * 
		 * final JLabel raLabel = new JLabel(); raLabel.setFont(new
		 * Font("Tahoma", Font.BOLD, 12)); raLabel.setText("Language");
		 * raLabel.setForeground(ColorConstants.DEF_COLOR); raLabel.setBounds(5,
		 * 5, 74, 14); panel_1.add(raLabel);
		 * 
		 * lblLanguage = new JLabel(); lblLanguage.setText("English");
		 * lblLanguage.setForeground(new Color(198,67,37));
		 * lblLanguage.setBounds(95, 4, 72, 16); panel_1.add(lblLanguage);
		 */

		/*
		 * final JPanel panel_2 = new JPanel(); panel_2.setOpaque(false);
		 * panel_2.setBackground(Color.WHITE); panel_2.setLayout(null);
		 * panel_2.setBounds(343, 33, 158, 32); add(panel_2);
		 * 
		 * final JLabel prnnLabel = new JLabel(); prnnLabel.setFont(new
		 * Font("Tahoma", Font.BOLD, 12)); prnnLabel.setText("Sex");
		 * prnnLabel.setForeground(ColorConstants.DEF_COLOR);
		 * prnnLabel.setBounds(5, 5, 54, 14); panel_2.add(prnnLabel);
		 * 
		 * lblSex = new JLabel(); lblSex.setText("Male");
		 * lblSex.setForeground(new Color(198,67,37)); lblSex.setBounds(77, 5,
		 * 77, 16); panel_2.add(lblSex);
		 */

		lblResidentName = new JLabel();
		lblResidentName.setOpaque(false);
		lblResidentName.setText("Andreu Lydia");
		lblResidentName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblResidentName.setForeground(new Color(198, 67, 37));
		lblResidentName.setBounds(35, 5, 302, 14);
		add(lblResidentName);

		/*
		 * panel_6 = new PanelImage(); panel_6.addMouseListener(new
		 * MouseAdapter() { public void mouseEntered(final MouseEvent arg0) {
		 * Global.panelResidentMainAcutites.setImage(panel_6.getImage()); }
		 * public void mouseExited(final MouseEvent e) {
		 * Global.panelResidentMainAcutites.setImage(null); } });
		 * panel_6.setOpaque(false); panel_6.setBounds(508, 10, 57, 55);
		 * add(panel_6); panel_6.setBorder(new LineBorder(new Color(180, 188,
		 * 193), 1, false)); panel_6.setCurvedView(true); panel_6.setArc(1f);
		 */

		cbResident = new JCheckBox();
		cbResident.setMargin(new Insets(1, 1, 1, 1));
		cbResident.setOpaque(false);
		cbResident.setBackground(Color.WHITE);
		cbResident.setText("");
		cbResident.setBounds(10, 5, 20, 16);
		add(cbResident);
		setBorder(null);

	}

	public void doUpdate(Rooms room) {
		repaint();
		lblResidentName.setText(room.getResmain().getUserPass() + " , "
				+ room.getResmain().getUserName());
		lblRoom.setText(room.getCurrentRoom());
		// lblLanguage.setText(room.getResmain().getLanguage()+"");
		// lblSex.setText(room.getResmain().getSex()+"");

		/*
		 * if (room.getResmain().getImg() != null) {
		 * panel_6.setImage(Utils.getBufferedImageFromImageicon
		 * (room.getResmain().getImg())); } else { panel_6.setImage(null); }
		 */
	}

	public void setSelectedResident(boolean val) {
		cbResident.setSelected(val);
	}

	public static void main(String args[]) {
		JFrame frm = new JFrame("New Frame");
		frm.setLayout(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PanelResidents p = new PanelResidents();
		p.setBounds(50, 50, 600, 175);
		frm.getContentPane().add(p);
		frm.setSize(new Dimension(600, 175));
		frm.setVisible(true);
	}

	@Override
	protected void processMouseEvent(MouseEvent e) {
		super.processMouseEvent(e);
		switch (e.getID()) {
		case MouseEvent.MOUSE_ENTERED:
			// System.out.println("Entered");
			rollOver = (true && isEnabled());
			// Global.panelResidentMainAcutites.setImage(panel_6.getImage());
			repaint();

			break;
		case MouseEvent.MOUSE_EXITED:
			// System.out.println("Exited");
			// rollOver=false;
			rollOver = (false && isEnabled());
			// Global.panelResidentMainAcutites.setImage(null);
			repaint();
			break;
		case MouseEvent.MOUSE_PRESSED:
			// System.out.println("Pressed");
			pressed = true;
			break;
		case MouseEvent.MOUSE_RELEASED:
			// System.out.println("Released");
			if (!cbResident.isSelected())
				cbResident.setSelected(true);
			else
				cbResident.setSelected(false);
			if (pressed && rollOver) {
				super.processMouseEvent(new MouseEvent((Component) e
						.getSource(), MouseEvent.MOUSE_CLICKED, e.getWhen(), e
						.getModifiers(), e.getX(), e.getY(), 1, e
						.isPopupTrigger(), e.getButton()));
			}
			pressed = false;
			break;

		}
	}

	@Override
	public void paintComponent(Graphics g) {
		// System.out.println("paint called ; rollOver="+rollOver);
		if (!rollOver) {
			setLinearGradient(Color.WHITE, Color.WHITE, Direction.LEFT_TO_RIGHT);
			super.paintComponent(g);
		} else {
			setLinearGradient(color, ColorConstants.GradientBright,
					Direction.LEFT_TO_RIGHT);
			super.paintComponent(g);
		}

	}
}
