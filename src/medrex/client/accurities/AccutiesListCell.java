package medrex.client.accurities;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.census.countAudit.CountAudit;

import com.sX.swing.JxButton;

public class AccutiesListCell extends JPanel implements ListCellRenderer {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4674813978373296807L;
	private JLabel lblSecondFloorStatus;
	private JLabel lblFirstFloorStatus;
	private JLabel dateLabel;
	private JxButton secondFloorButton;
	private JxButton firstFloorButton;
	private JLabel selRectagle;
	private Date date;

	public static final Color BORDER_COL = new Color(180, 188, 193);
	private static final Color DEF_COLOR = new Color(49, 104, 127);
	public static final Color DEF_COL = new Color(49, 104, 127);

	public AccutiesListCell(Date date) {
		this.date = date;
		setLayout(null);
		setSize(610, 50);
		add(getSelRectagle());
		add(getFirstFloorButton());
		add(getSecondFloorButton());
		setBackground(Color.WHITE);
		add(getDateLabel());
		add(getLblFirstFloorStatus());
		add(getLblSecondFloorStatus());
		updateFloorStatus(date);
	}

	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isSelected, boolean cellHasFocus) {

		if (value instanceof Object[]) {
			Object values[] = (Object[]) value;
			if (values[1] != null) {
				dateLabel.setText((String) values[1]);
			}
		} else {
			if (value != null) {
				dateLabel.setText((String) value);
			}
		}

		setComponentOrientation(list.getComponentOrientation());

		selRectagle.setVisible(isSelected);
		setBackground(list.getBackground());
		setForeground(list.getForeground());

		Border border = null;
		if (cellHasFocus) {
			if (isSelected) {
				border = UIManager
						.getBorder("List.focusSelectedCellHighlightBorder");
			}
			if (border == null) {
				border = UIManager.getBorder("List.focusCellHighlightBorder");
			}
		} else {
			border = new EmptyBorder(1, 1, 1, 1);
		}

		setEnabled(list.isEnabled());
		setFont(list.getFont());
		int tmpInt = (list.getBounds().width - 20) / 2;
		dateLabel.setBounds(10, 10, tmpInt, 30);
		selRectagle.setSize(list.getBounds().width - 10, 40);
		return this;
	}

	protected JLabel getSelRectagle() {
		if (selRectagle == null) {
			selRectagle = new JLabel();
			selRectagle.setBackground(Color.WHITE);
			selRectagle.setBorder(new LineBorder(new Color(51, 102, 204), 2,
					true));
			selRectagle.setFont(new Font("", Font.BOLD, 16));
			selRectagle.setText("");
			selRectagle.setBounds(3, 3, 600, 44);
		}
		return selRectagle;
	}

	/**
	 * @return
	 */
	protected JxButton getFirstFloorButton() {
		if (firstFloorButton == null) {
			firstFloorButton = new JxButton(0.4f);
			firstFloorButton.addActionListener(new ActionListener() {
				public void actionPerformed(final ActionEvent e) {
					SwingUtils.openInDialog(new PanelFloorWiseAccuties(
							"1st floor", dateLabel.getText()));
					updateFloorStatus(new Date(dateLabel.getText()));
				}
			});
			firstFloorButton.setText("1st Floor");
			firstFloorButton.setBounds(480, 6, 106, 18);
			firstFloorButton.setBackground(Color.WHITE);
			firstFloorButton.setForeground(DEF_COL);
			firstFloorButton.setBorder(new LineBorder(BORDER_COL, 1, false));
			firstFloorButton.setFont(new Font("", Font.BOLD, 12));
		}
		return firstFloorButton;
	}

	/**
	 * @return
	 */
	protected JxButton getSecondFloorButton() {
		if (secondFloorButton == null) {
			secondFloorButton = new JxButton(0.4f);
			secondFloorButton.addActionListener(new ActionListener() {
				public void actionPerformed(final ActionEvent e) {
					SwingUtils.openInDialog(new PanelFloorWiseAccuties(
							"2nd floor", dateLabel.getText()));
					updateFloorStatus(new Date(dateLabel.getText()));
				}
			});
			secondFloorButton.setText("2nd Floor");
			secondFloorButton.setBounds(480, 26, 106, 18);
			secondFloorButton.setBackground(Color.WHITE);
			secondFloorButton.setForeground(DEF_COL);
			secondFloorButton.setBorder(new LineBorder(BORDER_COL, 1, false));
			secondFloorButton.setFont(new Font("", Font.BOLD, 12));
		}
		return secondFloorButton;
	}

	/**
	 * @return
	 */
	protected JLabel getDateLabel() {
		if (dateLabel == null) {
			dateLabel = new JLabel();
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MMM dd, yyyy");
			df.format(date);
			dateLabel.setText(df.format(date) + "");
			dateLabel.setForeground(GuiModes.DESIGNER_FORMS
					.getControlForegroundColor());
			dateLabel.setBackground(Color.WHITE);
			dateLabel.setHorizontalAlignment(SwingConstants.CENTER);
			dateLabel.setFont(new Font("Dialog", Font.PLAIN, 28));
			dateLabel.setBounds(73, 5, 208, 40);
		}
		return dateLabel;
	}

	/**
	 * @return
	 */
	protected JLabel getLblFirstFloorStatus() {
		if (lblFirstFloorStatus == null) {
			lblFirstFloorStatus = new JLabel();
			lblFirstFloorStatus.setIcon(new ImageIcon("img/cross.jpg"));
			lblFirstFloorStatus.setBounds(450, 6, 30, 18);
		}
		return lblFirstFloorStatus;
	}

	/**
	 * @return
	 */
	protected JLabel getLblSecondFloorStatus() {
		if (lblSecondFloorStatus == null) {
			lblSecondFloorStatus = new JLabel();
			lblSecondFloorStatus.setIcon(new ImageIcon("img/cross.jpg"));
			lblSecondFloorStatus.setBounds(450, 26, 30, 18);
		}
		return lblSecondFloorStatus;
	}

	public void updateFloorStatus(Date d) {
		List<CountAudit> list = null;
		try {
			list = MedrexClientManager.getInstance().getCountAudits();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Iterator<CountAudit> it = list.iterator();
		while (it.hasNext()) {
			CountAudit countAudit = it.next();
			if (countAudit.getFloor().equalsIgnoreCase("1st floor")
					&& d.equals(countAudit.getDateAndTime())) {
				lblFirstFloorStatus.setIcon(new ImageIcon("img/tick.jpg"));
			}
			if (countAudit.getFloor().equalsIgnoreCase("2nd floor")
					&& d.equals(countAudit.getDateAndTime())) {
				lblSecondFloorStatus.setIcon(new ImageIcon("img/tick.jpg"));
			}
		}

	}
}
