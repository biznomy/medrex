package medrex.client.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;

import medrex.client.PanelImage;
import medrex.commons.vo.resident.ResidentMain;

public class PanelResidentInformation extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1350240049704627045L;
	private PanelImage rPhoto;
	private JLabel rSexRoomNo;
	private JLabel rName;
	private ResidentMain resident;

	public PanelResidentInformation() {
		super();
		// addComponentListener(new ComponentAdapter() {
		// public void componentResized(ComponentEvent e) {
		// doResize();
		// }
		// });
		setLayout(null);

		rName = new JLabel();
		rName.setHorizontalAlignment(SwingConstants.CENTER);
		rName.setFont(new Font("Dialog", Font.BOLD, 24));
		rName.setText("JOHN GRATES");
		rName.setBounds(0, 0, 200, 20);
		add(rName);

		rSexRoomNo = new JLabel();
		rSexRoomNo.setHorizontalAlignment(SwingConstants.CENTER);
		rSexRoomNo.setFont(new Font("Dialog", Font.PLAIN, 20));
		rSexRoomNo.setText("Male, #102-2");
		rSexRoomNo.setBounds(0, 28, 200, 16);
		add(rSexRoomNo);

		rPhoto = new PanelImage();
		rPhoto.setCurvedView(true);
		rPhoto.setArc(1f);
		rPhoto.setBounds(0, 52, 200, 200);
		add(rPhoto);

		setPreferredSize(new Dimension(200, 252));
		setResident(null);
		setOpaque(false);
	}

	// public void doResize() {
	// doResize(false, false);
	// }

	protected void doResize(boolean rN, boolean rS) {
		int h = getHeight();
		int w = getWidth();
		rName.setLocation(0, 0);
		rName.setSize(w, (rN) ? (int) (1.8f * h * 20 / 252) : h * 20 / 252);

		rSexRoomNo.setLocation(0, rName.getHeight() + (h * 8 / 252));
		rSexRoomNo
				.setSize(w, (rS) ? (int) (1.8f * h * 16 / 252) : h * 16 / 252);

		rPhoto.setLocation(0, rSexRoomNo.getY() + rSexRoomNo.getHeight()
				+ (h * 8 / 252));
		rPhoto.setSize(w, w);
		setPreferredSize(new Dimension(w, rPhoto.getY() + w));
		// System.out.println("h: " + h + ", Nh: " + rName.getHeight() +
		// ", Sh: " + rSexRoomNo.getHeight() + ", Ph:" + rPhoto.getHeight());
	}

	/**
	 * @param resident
	 *            the resident to set
	 */
	public void setResident(ResidentMain resident) {
		this.resident = resident;
		boolean rN = false, rS = false;
		if (resident != null) {
			String name = (resident.getUserName() + " " + resident
					.getUserPass()).toUpperCase();
			if (SwingUtilities.computeStringWidth(rName.getFontMetrics(rName
					.getFont()), name) > rName.getWidth()) {
				rN = true;
			}
			rName.setText("<html><p align=center>" + name);
			/* TODO: Migrating to room history */
			/*
			 * String sR = resident.getSex() + ", " + resident.getRoom(); if
			 * (SwingUtilities.computeStringWidth(rSexRoomNo
			 * .getFontMetrics(rSexRoomNo.getFont()), sR) > rSexRoomNo
			 * .getWidth()) { rN = true; }
			 * rSexRoomNo.setText("<html><p align=center>" + sR);
			 */
			Image img = null;
			if (resident.getImg() != null) {
				img = resident.getImg().getImage();
			}
			rPhoto.setImage(img);
			rPhoto.repaint();
			setVisible(true);
		} else {
			rName.setText("");
			rSexRoomNo.setText("");
			rPhoto.setImage(null);
			rPhoto.repaint();
			setVisible(false);
			rN = rS = false;
		}
		doResize(rN, rS);
		this.repaint();
	}

	/**
	 * @return the resident
	 */
	public ResidentMain getResident() {
		return resident;
	}

	@Override
	public void setForeground(Color fg) {
		super.setForeground(fg);
		try {
			rName.setForeground(fg);
			rSexRoomNo.setForeground(fg);
			rPhoto.setForeground(fg);
			rPhoto.setBorder(new LineBorder(fg, 1, false));
		} catch (Exception e) {
			// e.printStackTrace();
		}
	}
}
