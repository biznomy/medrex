package medrex.client.room;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import medrex.client.PanelImage;
import medrex.client.constants.Global;
import medrex.client.utils.Utils;
import medrex.commons.enums.ColorConstants;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.styles.RoundedBalloonStyle;
import net.java.balloontip.utils.TimingUtils;

import com.sX.awt.Direction;
import com.sX.swing.JxPanel;

public class PanelBed extends JxPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3610647283601571769L;
	private JPanel panel;
	private JPanel panel_3;
	private JPanel panel_2;
	private JPanel panel_1;
	private static Color green = new Color(49, 104, 127);
	private static Color red = new Color(198, 67, 37);
	private Color color = new Color(194, 211, 217);
	private boolean pressed;
	private boolean rollOver;
	private boolean isSelected;
	private String residentName;
	private String roomNo;
	private String status;
	private JLabel residentLabel;
	private JLabel roomLabel;
	private JLabel statusLabel;
	private ImageIcon image;
	private JPanel label;
	private Component roomLabel2;
	private Color darkRed = Color.RED;
	private Color lightRed = Color.pink;
	private PanelImage panelImage;

	public PanelBed() {
		super();
		setBorder(new LineBorder(Color.RED, 2));
		setLayout(new BorderLayout());
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {

			}
		});
		setBackground(Color.WHITE);
		setArc(0.4f);
		setDoubleBuffered(true);
		setCurvedView(true);
		setLocation(10, 10);
		setSize(73, 68);
		setEnabled(true);
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				System.out.println("Cliked once");
				if (e.getClickCount() == 2) {
					System.out.println("Cliked");
					Global.selectedRoom = roomLabel.getText();
					Global.panelRoomPopUpFloorPlan.doUpdateRoomAndFloorType();
					Global.frameRoomGraphicalView.dispose();
				}
			}
		});

		panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {

			}
		});
		panel.setLayout(new BorderLayout());
		panel.setBackground(Color.WHITE);
		panel.setOpaque(false);
		add(panel);

		label = new JPanel();
		label.setLayout(null);
		// label.setIconTextGap(0);
		label.setOpaque(false);
		label.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(final MouseEvent arg0) {
				if (arg0.getClickCount() == 2
						&& residentLabel.getText().equalsIgnoreCase("")) {
					Global.selectedRoom = roomLabel.getText();
					Global.panelRoomPopUpFloorPlan.doUpdateRoomAndFloorType();
					Global.frameRoomGraphicalView.dispose();

				}
				if (!isSelected) {
					setBorder(new LineBorder(ColorConstants.DEF_COLOR));
					isSelected = true;
				} else {
					setBorder(null);
					isSelected = false;
				}
			}

			@Override
			public void mouseEntered(final MouseEvent e) {
				setGradientView(true);
			}
		});
		// label.setLayout(new BorderLayout());
		// label.add(residentLabel,BorderLayout.NORTH);
		// label.add(roomLabel,BorderLayout.SOUTH);
		panel.add(label, BorderLayout.CENTER);
		residentLabel = new JLabel();
		residentLabel.setBounds(0, 0, 71, 12);
		label.add(residentLabel);
		residentLabel.setText("");
		// andreuLydiaLabel.setBounds(40, 0, 118, 16);
		residentLabel.setForeground(red);
		// residentLabel.setFont(new Font("tahoma",Font.BOLD,10));
		residentLabel.setHorizontalAlignment(0);

		// panel_3 = new JPanel();
		// panel_3.setBorder(new MatteBorder(1, 1, 1, 1, Color.black));
		// panel_3.setBackground(Color.RED);
		// panel_3.setBounds(48, 4, 7, 19);
		// label.add(panel_3);
		// room.setBounds(60, 70, 118, 14);

		// panel_1 = new JPanel();
		// panel_1.setBorder(new LineBorder(Color.black, 1, false));
		// panel_1.setBackground(Color.RED);
		// panel_1.setBounds(3, 0, 10, 22);
		// label.add(panel_1);

		// panel_2 = new JPanel();
		// panel_2.setBorder(new MatteBorder(1, 0, 1, 0, Color.black));
		// panel_2.setLayout(null);
		// panel_2.setBackground(Color.RED);
		// panel_2.setBounds(5, 6, 44, 14);
		// label.add(panel_2);
		roomLabel2 = new JLabel(new ImageIcon("img\\BedOccupied1.png"));
		roomLabel2.setBackground(Color.WHITE);
		roomLabel2.setBounds(0, 10, 61, 56);
		label.add(roomLabel2);
		// roomLabel2.setIconTextGap(0);
		// roomLabel2.setText("101-1");
		// roomLabel2.setForeground(Color.RED);
		// roomLabel2.setHorizontalAlignment(0);

		roomLabel = new JLabel();
		roomLabel.setBackground(Color.WHITE);
		roomLabel.setBounds(5, 15, 48, 12);
		label.add(roomLabel);
		roomLabel.setForeground(red);
		label.setComponentZOrder(roomLabel2, 0);
		label.setComponentZOrder(roomLabel, 0);

		roomLabel.setIconTextGap(0);
		roomLabel.setText("101-1");
		roomLabel.setHorizontalAlignment(0);
		// panel.add(roomLabel,BorderLayout.SOUTH);

	}

	public void setGradientView(boolean isGradient) {
		if (isGradient) {
			rollOver = true;
			repaint();
		}
	}

	public ImageIcon getImage() {
		return image;
	}

	public void setImage(ImageIcon image) {
		this.image = image;
		// System.out.println(image);
		// label.setIcon(image);
	}

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName, ImageIcon imageIcon) {
		this.residentName = residentName;
		residentLabel.setText(residentName);
		panelImage = new PanelImage();
		if (imageIcon != null) {
			panelImage.setImage(Utils.getBufferedImageFromImageicon(imageIcon));
		}
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
		residentLabel.setText(residentName);
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
		roomLabel.setText(roomNo);
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
		statusLabel.setText(status);
	}

	public void setBedOccupied(boolean val) {
		if (val) {
			// panel_1.setBackground(Color.RED);
			// panel_2.setBackground(Color.RED);
			// panel_3.setBackground(Color.RED);
			// roomLabel.setForeground(ColorConstants.DEF_COLOR);
			roomLabel.setForeground(red);
			// roomLabel.setFont(new Font("tahoma",Font.BOLD,12));
		} else {
			// panel_1.setBackground(SystemColor.inactiveCaptionText);
			// panel_2.setBackground(SystemColor.inactiveCaptionText);
			// panel_3.setBackground(SystemColor.inactiveCaptionText);
			roomLabel.setForeground(ColorConstants.DEF_COLOR);
			this.setBorder(new LineBorder(null));
		}
	}

	@Override
	protected void processMouseEvent(MouseEvent e) {
		super.processMouseEvent(e);
		switch (e.getID()) {
		case MouseEvent.MOUSE_ENTERED:

			rollOver = (true && isEnabled());
			repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e2) {

				e2.printStackTrace();
			}

			break;
		case MouseEvent.MOUSE_EXITED:
			rollOver = (false && isEnabled());
			repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e2) {

				e2.printStackTrace();
			}
			break;
		case MouseEvent.MOUSE_PRESSED:
			pressed = true;
			break;
		case MouseEvent.MOUSE_RELEASED:
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

	private boolean hasMouse() {

		Point mouseLocation = MouseInfo.getPointerInfo().getLocation();
		Point myLocation = getLocationOnScreen();
		int maxX = myLocation.x + getWidth();
		int maxY = myLocation.y + getHeight();

		if (myLocation.x < mouseLocation.x && mouseLocation.x < maxX
				&& myLocation.y < mouseLocation.y && mouseLocation.y < maxY) {
			BalloonTip BTip = null;
			if (!residentLabel.getText().equalsIgnoreCase("")) {
				String msg = residentLabel.getText();
				BTip = new BalloonTip(this, msg, new RoundedBalloonStyle(10,
						10, Color.WHITE, ColorConstants.DEF_COLOR),
						BalloonTip.Orientation.LEFT_ABOVE,
						BalloonTip.AttachLocation.NORTHWEST, 20, 20, false);
				// BTip.setLayout(new BorderLayout());
				// BTip.setSize(150, 70);
				// panelImage.setBounds(10, 10, 30, 30);
				// BTip.setComponentZOrder(BTip.getComponent(1), 0);
				// BTip.setComponentZOrder(BTip.getComponent(0), 0);
				// BTip.add(panelImage);
				TimingUtils.showTimedBalloon(BTip, 0);
				// BTip.setLayout(new BorderLayout());
				// i.setImage();
				// BTip.set
				return true;
			} else {
				BTip = new BalloonTip(this, "ROOM IS AVAILABLE",
						new RoundedBalloonStyle(10, 10, Color.WHITE,
								ColorConstants.DEF_COLOR),
						BalloonTip.Orientation.LEFT_ABOVE,
						BalloonTip.AttachLocation.NORTHWEST, 20, 20, false);
				TimingUtils.showTimedBalloon(BTip, 0);
				// BTip.setLayout(new BorderLayout());
				// BTip.add(new JLabel(new
				// ImageIcon("img/medrexSmallLogo.png")),BorderLayout.EAST);
				return true;
			}
		}
		return false;
	}

	@Override
	public void paintComponent(Graphics g) {

		if (pressed) {
			if (!isSelected) {
				isSelected = true;
			} else {
				setBorder(null);
				isSelected = false;
			}
		}
		if ((rollOver && hasMouse()) || isSelected) {
			if (residentLabel.getText().equalsIgnoreCase("")) {
				setLinearGradient(lightRed, darkRed, Direction.LEFT_TO_RIGHT);
				roomLabel.setForeground(Color.WHITE);
				super.paintComponent(g);
			} else {
				setLinearGradient(color, ColorConstants.GradientBright,
						Direction.LEFT_TO_RIGHT);
				super.paintComponent(g);
			}
		} else {
			setLinearGradient(Color.WHITE, Color.WHITE, Direction.LEFT_TO_RIGHT);
			super.paintComponent(g);
			roomLabel.setForeground(ColorConstants.DEF_COLOR);
		}

	}

	public static void main(String args[]) {
		JFrame frm = new JFrame("Bed");
		frm.getContentPane().setLayout(null);
		PanelBed pb = new PanelBed();
		// pb.setResidentName("Andreu Lydia");
		// pb.setRoomNo("101-2");
		// pb.setStatus("Status-Occupied");
		pb.setImage(new ImageIcon("img//BedOccupied1.png"));
		frm.getContentPane().add(pb);
		frm.setSize(new Dimension(380, 350));
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// SwingUtils.wrapInDialog(new BedPanel()).setVisible(true);
	}
}
