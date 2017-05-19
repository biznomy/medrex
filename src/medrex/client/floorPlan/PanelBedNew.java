package medrex.client.floorPlan;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import medrex.client.PanelImage;
import medrex.client.constants.Global;
import medrex.client.utils.Utils;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.masterList.Sex;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.styles.RoundedBalloonStyle;
import net.java.balloontip.utils.TimingUtils;

import com.sX.awt.Direction;
import com.sX.swing.JxPanel;

public class PanelBedNew extends JxPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3385675818869234208L;
	private JPanel panel;
	private static Color red = new Color(198, 67, 37);
	private Color color = new Color(194, 211, 217);
	private boolean pressed;
	private boolean rollOver;
	private boolean isSelected;
	private boolean isBedHold;
	private String residentName;
	private String roomNo;
	private String status;
	private Sex gender;
	private JLabel roomLabel;
	private JLabel statusLabel;
	private ImageIcon image;
	private JPanel label;
	private Color lightRed = Color.pink;
	private PanelImage panelImage;

	public PanelBedNew() {
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
		label.setLayout(new BorderLayout());
		label.setOpaque(false);
		label.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(final MouseEvent arg0) {
				if (arg0.getClickCount() == 2 && residentName == null) {
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
		panel.add(label, BorderLayout.CENTER);

		roomLabel = new JLabel();
		roomLabel.setBackground(Color.WHITE);
		label.add(roomLabel);
		roomLabel.setForeground(red);
		label.setComponentZOrder(roomLabel, 0);

		roomLabel.setIconTextGap(0);
		roomLabel.setText("101-1");
		roomLabel.setHorizontalAlignment(0);

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

	}

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName, ImageIcon imageIcon) {
		this.residentName = residentName;
		panelImage = new PanelImage();
		if (imageIcon != null) {
			panelImage.setImage(Utils.getBufferedImageFromImageicon(imageIcon));
		}
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
		// residentLabel.setText(residentName);
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

			roomLabel.setForeground(red);

		} else {
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
			if (residentName != null) {
				if (!residentName.equalsIgnoreCase("")) {
					String msg = residentName;
					BTip = new BalloonTip(this, msg, new RoundedBalloonStyle(
							10, 10, Color.WHITE, ColorConstants.DEF_COLOR),
							BalloonTip.Orientation.LEFT_ABOVE,
							BalloonTip.AttachLocation.NORTHWEST, 20, 20, false);

					TimingUtils.showTimedBalloon(BTip, 0);

					return true;
				}
			} else {
				BTip = new BalloonTip(this, "ROOM IS AVAILABLE",
						new RoundedBalloonStyle(10, 10, Color.WHITE,
								ColorConstants.DEF_COLOR),
						BalloonTip.Orientation.LEFT_ABOVE,
						BalloonTip.AttachLocation.NORTHWEST, 20, 20, false);
				TimingUtils.showTimedBalloon(BTip, 0);

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
		/* if on panel bed its roll over or it is selected */

		if ((rollOver && hasMouse()) || isSelected) {

			if (residentName == null) {
				setLinearGradient(Color.WHITE, Color.WHITE,
						Direction.TOP_LEFT_TO_BOTTOM_RIGHT);
				roomLabel.setForeground(Color.WHITE);
				super.paintComponent(g);

			} else {
				roomLabel.setForeground(ColorConstants.DEF_COLOR);
				setLinearGradient(color, ColorConstants.GradientBright,
						Direction.TOP_LEFT_TO_BOTTOM_RIGHT);
				super.paintComponent(g);
			}
		} else {
			/* if room is blank */
			if (residentName == null) {
				setLinearGradient(Color.WHITE, Color.WHITE,
						Direction.LEFT_TO_RIGHT);
				roomLabel.setForeground(ColorConstants.DEF_COLOR);
				super.paintComponent(g);

			}
			/* if room is not blank */
			else {
				/* if gender is female then set background color as red */
				if (getGender() != null
						&& getGender().getMsterName()
								.equalsIgnoreCase("Female")) {
					roomLabel.setForeground(Color.WHITE);
					setLinearGradient(lightRed, Color.RED,
							Direction.TOP_LEFT_TO_BOTTOM_RIGHT);
					super.paintComponent(g);
				}
				/* if gender is male then set background color as blue */
				if (getGender() != null
						&& getGender().getMsterName().equalsIgnoreCase("Male")) {
					roomLabel.setForeground(Color.WHITE);
					setLinearGradient(new Color(128, 170, 249), new Color(0, 0,
							255), Direction.TOP_LEFT_TO_BOTTOM_RIGHT);
					super.paintComponent(g);
				}
			}
		}
	}

	public Sex getGender() {
		return gender;
	}

	public void setGender(Sex sex) {
		this.gender = sex;
	}

	public boolean isBedHold() {
		return isBedHold;
	}

	public void setBedHold(boolean isBedHold) {
		this.isBedHold = isBedHold;

	}
	/*
	 * public static void main(String args[]){ JFrame frm=new JFrame("Bed");
	 * frm.getContentPane().setLayout(null);
	 * 
	 * PanelBedNew pb=new PanelBedNew(); // pb.setBedHold(true); //
	 * pb.setResidentName(null); // pb.setResidentName("Andreu Lydia"); //
	 * pb.setRoomNo("101-2"); // pb.setStatus("Status-Occupied");
	 * pb.setImage(new ImageIcon("img//BedOccupied1.png"));
	 * frm.getContentPane().add(pb); frm.setSize(new Dimension(380,350));
	 * frm.setVisible(true); frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 * 
	 * 
	 * // SwingUtils.wrapInDialog(new BedPanel()).setVisible(true); }
	 */
}
