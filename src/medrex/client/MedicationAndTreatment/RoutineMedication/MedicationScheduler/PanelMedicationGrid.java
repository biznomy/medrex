package medrex.client.MedicationAndTreatment.RoutineMedication.MedicationScheduler;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.enums.ColorConstants;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.styles.RoundedBalloonStyle;
import net.java.balloontip.utils.TimingUtils;

/**
 * @author Mayank Chandela this panel is used to display one week information
 *         about the medication taken or not.
 */
public class PanelMedicationGrid extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4561478670393159733L;
	private JLabel[] dayLabel = new JLabel[7];
	private BalloonTip BTip;

	/**
	 * @param medicationSerial
	 *            - serial of the medication as supplied from medication History
	 *            panel.
	 * @param slot
	 *            - slot time associated with one grid.(for ex : 09:00 AM)
	 * @param calendar
	 *            - current calendar as given from medication scheduler panel.
	 */
	public PanelMedicationGrid(int medicationSerial, String slot,
			Calendar calendar) {
		super();
		setMaximumSize(new Dimension(100, 100));
		setBackground(Color.WHITE);
		setLayout(new GridLayout(0, 8));

		final JLabel hourLabel = new JLabel();
		hourLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		hourLabel.setBorder(new LineBorder(Color.black, 1, false));
		hourLabel.setHorizontalAlignment(SwingConstants.CENTER);
		hourLabel.setForeground(ColorConstants.DEF_COLOR);
		hourLabel.setText(slot);
		add(hourLabel);

		for (int i = 0; i < 7; i++) {
			dayLabel[i] = new JLabel();
			dayLabel[i].setFont(new Font("Tahoma", Font.BOLD, 12));
			dayLabel[i].setBorder(new LineBorder(Color.black, 1, false));
			dayLabel[i].setHorizontalAlignment(SwingConstants.CENTER);
			add(dayLabel[i]);
		}

		doUpdateStatus(medicationSerial, slot, calendar);
	}

	/**
	 * 
	 * @param medicationSerial
	 * @param slot
	 * @param calendar
	 *            this method will update the grid for one week by sending
	 *            calendar with start and end date current resident,current
	 *            medication and slot
	 */
	@SuppressWarnings("deprecation")
	private void doUpdateStatus(int medicationSerial, String slot,
			Calendar calendar) {
		refreshList();
		// System.out.print("slot : "+slot+"\n");
		// System.out.println("Calendar start Date:"+calendar.get(Calendar.DATE));
		List<Object[]> statusList = new ArrayList<Object[]>();
		try {

			/*
			 * this method will return the list for one week by sending calendar
			 * with start and end date current resident,current medication and
			 * slot obj[7] will return the current date obj[5] will return the
			 * status from calculated medication obj[3] will return the first
			 * date from the 7 days list. we will get a counter variable(first
			 * date to update) to set the date(obj[3] date - calendar(starting
			 * date))
			 */
			System.out.println("fdsfdsfs");
			statusList = MedrexClientManager.getInstance()
					.getMedicationStatusForWeek(calendar, slot,
							Global.currentResidenceKey, medicationSerial);
			System.out.println("sdfdsfdsfds");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Iterator<Object[]> it = statusList.iterator();
		// System.out.println("Calendar start Date:"+calendar.get(Calendar.DATE));
		while (it.hasNext()) {
			Object[] obj = it.next();
			int status = (Integer) obj[5];

			final Date timeStamp = (Date) obj[7];
			System.out.println("status:" + status);
			System.out.println("FirstDate:" + (((Date) obj[3]).getDate()));
			System.out.println("Calendar Date:" + calendar.get(Calendar.DATE));
			if (((Date) obj[3]).getDate() >= calendar.get(Calendar.DATE)) {
				final int counter = ((Date) obj[3]).getDate()
						- calendar.get(Calendar.DATE);
				if (status == 0) {
					if (dayLabel[counter].getIcon() == null) {
						dayLabel[counter]
								.setIcon(new ImageIcon("img/cross.jpg"));
					}
				}
				if (status == 1) {
					dayLabel[counter].setIcon(new ImageIcon("img/tick.jpg"));
					dayLabel[counter].setText("G");
					dayLabel[counter].addMouseListener(new MouseAdapter() {
						@Override
						public void mouseEntered(MouseEvent e) {
							String msg = "Given At :" + timeStamp;
							System.out.println(msg);
							BTip = new BalloonTip(dayLabel[counter], msg,
									new RoundedBalloonStyle(10, 10,
											Color.WHITE,
											ColorConstants.DEF_COLOR),
									BalloonTip.Orientation.LEFT_ABOVE,
									BalloonTip.AttachLocation.NORTHWEST, 20,
									20, false);
							TimingUtils.showTimedBalloon(BTip, 1000);
						}

						@Override
						public void mouseExited(MouseEvent e) {
							if (BTip.isVisible()) {
								BTip.setVisible(false);
								BTip = null;
							}
						}
					});
				}
				if (status == 2) {
					dayLabel[counter].setIcon(new ImageIcon("img/tick.jpg"));
					dayLabel[counter].setText("NG");
					dayLabel[counter].addMouseListener(new MouseAdapter() {
						@Override
						public void mouseEntered(MouseEvent e) {

							String msg = "Not Given At :" + timeStamp;
							BTip = new BalloonTip(dayLabel[counter], msg,
									new RoundedBalloonStyle(10, 10,
											Color.WHITE,
											ColorConstants.DEF_COLOR),
									BalloonTip.Orientation.LEFT_ABOVE,
									BalloonTip.AttachLocation.NORTHWEST, 20,
									20, false);
							TimingUtils.showTimedBalloon(BTip, 1000);
						}

						@Override
						public void mouseExited(MouseEvent e) {
							if (BTip.isVisible()) {
								BTip.setVisible(false);
								BTip = null;
							}
						}
					});
				}
				if (status == 3) {
					dayLabel[counter].setIcon(new ImageIcon("img/tick.jpg"));
					dayLabel[counter].setText("PR");
					dayLabel[counter].addMouseListener(new MouseAdapter() {
						@Override
						public void mouseEntered(MouseEvent e) {

							String msg = "Prepared At:" + timeStamp;
							BTip = new BalloonTip(dayLabel[counter], msg,
									new RoundedBalloonStyle(10, 10,
											Color.WHITE,
											ColorConstants.DEF_COLOR),
									BalloonTip.Orientation.LEFT_ABOVE,
									BalloonTip.AttachLocation.NORTHWEST, 20,
									20, false);
							TimingUtils.showTimedBalloon(BTip, 1000);
						}

						@Override
						public void mouseExited(MouseEvent e) {
							if (BTip.isVisible()) {
								BTip.setVisible(false);
								BTip = null;
							}
						}
					});
				}
			}

			if (((Date) obj[3]).getDate() < calendar.get(Calendar.DATE)) {

				int tmp = calendar.get(Calendar.DATE)
						- ((Date) obj[3]).getDate();
				int maxDate = calendar.getActualMaximum(Calendar.DATE);
				System.out.println("Month" + calendar.get(Calendar.MONTH));
				System.out.println("tmp:" + tmp);
				System.out.println("maxDate:" + maxDate);
				final int counter = maxDate - tmp;
				if (status == 0) {
					if (dayLabel[counter].getIcon() == null) {
						dayLabel[counter]
								.setIcon(new ImageIcon("img/cross.jpg"));
					}
				}
				if (status == 1) {
					dayLabel[counter].setIcon(new ImageIcon("img/tick.jpg"));
					dayLabel[counter].setText("G");
					dayLabel[counter].addMouseListener(new MouseAdapter() {
						@Override
						public void mouseEntered(MouseEvent e) {
							String msg = "Given At :" + timeStamp;
							BTip = new BalloonTip(dayLabel[counter], msg,
									new RoundedBalloonStyle(10, 10,
											Color.WHITE,
											ColorConstants.DEF_COLOR),
									BalloonTip.Orientation.LEFT_ABOVE,
									BalloonTip.AttachLocation.NORTHWEST, 20,
									20, false);
							TimingUtils.showTimedBalloon(BTip, 1000);
						}

						@Override
						public void mouseExited(MouseEvent e) {
							if (BTip.isVisible()) {
								BTip.setVisible(false);
								BTip = null;
							}
						}
					});
				}
				if (status == 2) {
					dayLabel[counter].setIcon(new ImageIcon("img/tick.jpg"));
					dayLabel[counter].setText("NG");
					dayLabel[counter].addMouseListener(new MouseAdapter() {
						@Override
						public void mouseEntered(MouseEvent e) {

							String msg = "Not Given At :" + timeStamp;
							BTip = new BalloonTip(dayLabel[counter], msg,
									new RoundedBalloonStyle(10, 10,
											Color.WHITE,
											ColorConstants.DEF_COLOR),
									BalloonTip.Orientation.LEFT_ABOVE,
									BalloonTip.AttachLocation.NORTHWEST, 20,
									20, false);
							TimingUtils.showTimedBalloon(BTip, 1000);
						}

						@Override
						public void mouseExited(MouseEvent e) {
							if (BTip.isVisible()) {
								BTip.setVisible(false);
								BTip = null;
							}
						}
					});
				}
				if (status == 3) {
					dayLabel[counter].setIcon(new ImageIcon("img/tick.jpg"));
					dayLabel[counter].setText("PR");
					dayLabel[counter].addMouseListener(new MouseAdapter() {
						@Override
						public void mouseEntered(MouseEvent e) {

							String msg = "Prepared At:" + timeStamp;
							BTip = new BalloonTip(dayLabel[counter], msg,
									new RoundedBalloonStyle(10, 10,
											Color.WHITE,
											ColorConstants.DEF_COLOR),
									BalloonTip.Orientation.LEFT_ABOVE,
									BalloonTip.AttachLocation.NORTHWEST, 20,
									20, false);
							TimingUtils.showTimedBalloon(BTip, 1000);
						}

						@Override
						public void mouseExited(MouseEvent e) {
							if (BTip.isVisible()) {
								BTip.setVisible(false);
								BTip = null;
							}
						}
					});
				}
			}
		}

	}

	private void refreshList() {
		for (int i = 0; i < 7; i++) {
			dayLabel[i].repaint();
			dayLabel[i].setText("");
			dayLabel[i].removeAll();
			dayLabel[i].setIcon(new ImageIcon("img/cross.jpg"));
			dayLabel[i].repaint();
			this.updateUI();
		}
	}
}
