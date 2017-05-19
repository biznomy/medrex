package medrex.client.accurities;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.utils.SwingUtils;
import medrex.commons.vo.census.countAudit.CountAudit;

import com.sX.swing.JxButton;

public class AccutiesView extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7325465710352803005L;
	Date date;
	private JxButton btnSecFloor;
	private JxButton btnFirstFloor;
	private JLabel labelSecFloor;
	private JLabel labelFirstFloor;
	private SimpleDateFormat df;
	private static Color BACK_COLOR = new Color(231, 239, 242);
	private static Color FONT_COLOR = new Color(5, 65, 94);

	@Override
	public void setEnabled(boolean enabled) {
		df = new SimpleDateFormat("MMMM dd, yyyy");
		// System.out.println("\n\nAccuties View setEnabled Called for the date"+df.format(date)+"enabled"+enabled);
		super.setEnabled(enabled);
		btnFirstFloor.setEnabled(enabled);
		// labelFirstFloor.setVisible(enabled);
		// labelSecFloor.setVisible(enabled);
		btnSecFloor.setEnabled(enabled);
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		// this.setVisible(visible);
		labelFirstFloor.setVisible(visible);
		labelSecFloor.setVisible(visible);
	}

	public AccutiesView(final Date date) {
		super();
		this.date = date;
		// setVisible(false);
		setLayout(null);
		setSize(new Dimension(103, 39));
		setBackground(Color.WHITE);

		btnFirstFloor = new JxButton(0.4f);
		btnFirstFloor.setEnabled(false);
		btnFirstFloor.setGlassyPainted(true);
		btnFirstFloor.setBackground(BACK_COLOR);
		btnFirstFloor.setForeground(FONT_COLOR);
		btnFirstFloor.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				df = new SimpleDateFormat("MMMM dd, yyyy");
				String str = df.format(date);
				SwingUtils.openInDialog(new PanelFloorWiseAccuties("1st floor",
						str));
				updateFloorStatus(new Date(str));
			}
		});
		btnFirstFloor.setText("Floor-1");
		// btnFirstFloor.setBackground(Color.WHITE);
		// btnFirstFloor.setForeground(ColorConstants.DEF_COLOR);
		// btnFirstFloor.setBorder(new LineBorder(ColorConstants.BORDER_COL, 1,
		// false));
		btnFirstFloor.setFont(new Font("", Font.BOLD, 10));
		btnFirstFloor.setBounds(35, 0, 62, 16);
		add(btnFirstFloor);

		btnSecFloor = new JxButton(0.4f);
		btnSecFloor.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				SimpleDateFormat df = new SimpleDateFormat("MMMM dd, yyyy");
				String str = df.format(date);
				SwingUtils.openInDialog(new PanelFloorWiseAccuties("2nd floor",
						str));
				updateFloorStatus(new Date(str));
			}
		});
		btnSecFloor.setText("Floor-2");
		btnSecFloor.setEnabled(false);
		btnSecFloor.setGlassyPainted(true);
		btnSecFloor.setBackground(BACK_COLOR);
		btnSecFloor.setForeground(FONT_COLOR);
		// btnSecFloor.setBackground(Color.WHITE);
		// btnSecFloor.setForeground(ColorConstants.DEF_COLOR);
		// btnSecFloor.setBorder(new LineBorder(ColorConstants.BORDER_COL, 1,
		// false));
		btnSecFloor.setFont(new Font("", Font.BOLD, 10));
		btnSecFloor.setBounds(35, 18, 62, 16);
		add(btnSecFloor);

		labelFirstFloor = new JLabel();
		labelFirstFloor.setIcon(new ImageIcon("img/cross.jpg"));
		labelFirstFloor.setVisible(false);
		labelFirstFloor.setText("");
		labelFirstFloor.setBounds(10, 0, 22, 16);
		add(labelFirstFloor);

		labelSecFloor = new JLabel();
		labelSecFloor.setVisible(false);
		labelSecFloor.setIcon(new ImageIcon("img/cross.jpg"));
		labelSecFloor.setText("");
		labelSecFloor.setBounds(10, 18, 22, 16);
		add(labelSecFloor);
		updateFloorStatus(date);
	}

	public void updateFloorStatus(Date d) {
		List<CountAudit> list = null;
		try {
			// list = MedrexClientManager.getInstance().getCountAudits();
			list = MedrexClientManager.getInstance().getCountAudits(d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (list.size() != 0) {
			Iterator<CountAudit> it = list.iterator();
			while (it.hasNext()) {
				CountAudit countAudit = it.next();
				if (countAudit.getFloor().equalsIgnoreCase("1st floor")) {
					labelFirstFloor.setIcon(new ImageIcon("img/tick.jpg"));
				}
				if (countAudit.getFloor().equalsIgnoreCase("2nd floor")) {
					labelSecFloor.setIcon(new ImageIcon("img/tick.jpg"));
				}
			}
		}

	}

	public static void main(String ar[]) {
		SwingUtils.wrapInDialog(new AccutiesView(null)).setVisible(true);
	}

}
