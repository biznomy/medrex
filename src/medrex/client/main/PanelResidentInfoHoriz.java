package medrex.client.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.rmi.RemoteException;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;

import medrex.client.PanelImage;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.ResidentPayerNew;
import medrex.commons.vo.resident.TempRoomHistory;

public class PanelResidentInfoHoriz extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1189097997533342505L;
	private JLabel lblPayerStatus;
	private PanelImage rPhoto;
	private JLabel rSexRoomNo;
	private JLabel rName;
	private ResidentMain resident;
	private boolean isDNR;

	public PanelResidentInfoHoriz() {
		super();
		// addComponentListener(new ComponentAdapter() {
		// public void componentResized(ComponentEvent e) {
		// doResize();
		// }
		// });
		setLayout(null);

		rName = new JLabel();
		rName.setVerticalAlignment(SwingConstants.TOP);
		rName.setHorizontalAlignment(SwingConstants.RIGHT);
		rName.setFont(new Font("Dialog", Font.BOLD, 24));
		rName.setText("JOHN GRATES");
		rName.setBounds(0, 34, 262, 28);
		add(rName);

		rSexRoomNo = new JLabel();
		rSexRoomNo.setHorizontalAlignment(SwingConstants.RIGHT);
		rSexRoomNo.setFont(new Font("Dialog", Font.PLAIN, 20));
		rSexRoomNo.setText("Male, #102-2");
		rSexRoomNo.setBounds(0, 0, 262, 28);
		add(rSexRoomNo);

		lblPayerStatus = new JLabel();
		lblPayerStatus.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPayerStatus.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblPayerStatus.setText("Medicaid");
		lblPayerStatus.setBounds(0, 68, 262, 30);
		add(lblPayerStatus);

		rPhoto = new PanelImage();
		rPhoto.setCurvedView(true);
		rPhoto.setArc(1f);
		rPhoto.setBounds(268, 0, 100, 100);
		add(rPhoto);

		setPreferredSize(new Dimension(388, 120));
		setResident(null);
		setOpaque(false);
	}

	// public void doResize() {
	// doResize(false, false);
	// }

	/*
	 * protected void doResize(boolean rN, boolean rS) { int h = getHeight();
	 * int w = getWidth(); rName.setLocation(0, 0); rName.setSize(w, (rN) ?
	 * (int) (1.8f h 20 / 252) : h 20 / 252);
	 * 
	 * rSexRoomNo.setLocation(0, rName.getHeight() + (h 8 / 252)); rSexRoomNo
	 * .setSize(w, (rS) ? (int) (1.8f h 16 / 252) : h 16 / 252);
	 * 
	 * rPhoto.setLocation(0, rSexRoomNo.getY() + rSexRoomNo.getHeight() + (h 8 /
	 * 252)); rPhoto.setSize(w, w); setPreferredSize(new Dimension(w,
	 * rPhoto.getY() + w)); // System.out.println("h: " + h + ", Nh: " +
	 * rName.getHeight() + // ", Sh: " + rSexRoomNo.getHeight() + ", Ph:" +
	 * rPhoto.getHeight()); }
	 */

	/**
	 * @param resident
	 *            the resident to set
	 */
	public void setResident(ResidentMain resident) {
		this.resident = resident;
		if (resident != null) {
			String name = (resident.getUserName() + " " + resident
					.getUserPass()).toUpperCase();
			if (SwingUtilities.computeStringWidth(rName.getFontMetrics(rName
					.getFont()), name) > rName.getWidth()) {
			}
			rName.setText("<html><p align=right>" + name);
			TempRoomHistory roomHist = null;
			try {
				roomHist = MedrexClientManager.getInstance()
						.getLastRoomHistory(resident.getSerial());
			} catch (RemoteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (MedrexException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			String room = "";
			if (roomHist != null) {
				if (roomHist.getStartDate() != null
						&& roomHist.getEndDate() != null) {
					room = "";
				} else {
					room = roomHist.getRoom();
				}
			}

			String sR = resident.getSex() + ", " + room;

			if (SwingUtilities.computeStringWidth(rSexRoomNo
					.getFontMetrics(rSexRoomNo.getFont()), sR) > rSexRoomNo
					.getWidth()) {
			}
			rSexRoomNo.setText("<html><p align=right>" + sR);
			ResidentMain resMain2 = null;
			ResidentPayerNew payernew = null;
			try {
				resMain2 = MedrexClientManager.getInstance().getResident(
						resident.getSerial());
				payernew = MedrexClientManager.getInstance()
						.getPayerInfoStatusNewByResidentId(resMain2);
				isDNR = MedrexClientManager.getInstance().isDNR(
						Global.currentResidenceKey);
				if (isDNR) {
					rPhoto.setDNR(true);
				} else {
					rPhoto.setDNR(false);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			Image img = null;
			if (resMain2.getImg() != null) {
				img = resMain2.getImg().getImage();
			}
			if (payernew != null) {
				String payerType = payernew.getInsuranceType();
				lblPayerStatus.setText("<html><p align=right>" + payerType);
			} else {
				lblPayerStatus.setText("");
			}

			rPhoto.setImage(img);
			rPhoto.repaint();
			setVisible(true);
		} else {
			lblPayerStatus.setText("");
			rName.setText("");
			rSexRoomNo.setText("");
			rPhoto.setImage(null);
			rPhoto.repaint();
			setVisible(true);
		
		}
		// doResize(rN, rS);
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
			lblPayerStatus.setForeground(fg);
			rPhoto.setBorder(new LineBorder(fg, 1, false));
		} catch (Exception e) {
			// e.printStackTrace();
		}
	}
}
