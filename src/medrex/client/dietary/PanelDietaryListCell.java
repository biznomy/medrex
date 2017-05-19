package medrex.client.dietary;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
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
import medrex.commons.vo.dietary.DietPlanByDate;

import com.sX.swing.JxButton;

public class PanelDietaryListCell extends JPanel implements ListCellRenderer {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3300980928276617330L;
	private JxButton viewButton;
	private JLabel dinnerLabel;
	private JLabel lunchLabel;
	private JLabel breakFastLabel;
	private JLabel dateLabel;
	private JLabel selRectagle;
	private Date date;

	public static final Color BORDER_COL = new Color(180, 188, 193);
	public static final Color DEF_COL = new Color(49, 104, 127);

	public PanelDietaryListCell(Date date) {
		this.date = date;
		setLayout(null);
		setSize(610, 60);
		add(getSelRectagle());
		setBackground(Color.WHITE);
		add(getDateLabel());
		add(getBreakFastLabel());
		add(getLunchLabel());
		add(getDinnerLabel());
		add(getViewButton());
		setToolTipText("");
		doUpdateDietInfo(date);
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
			selRectagle.setBounds(3, 0, 600, 60);
		}
		return selRectagle;
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
			dateLabel.setBounds(10, 3, 208, 58);
		}
		return dateLabel;
	}

	/**
	 * @return
	 */
	protected JLabel getBreakFastLabel() {
		if (breakFastLabel == null) {
			breakFastLabel = new JLabel();
			breakFastLabel.setForeground(GuiModes.DESIGNER_FORMS
					.getControlForegroundColor());
			breakFastLabel.setBackground(Color.WHITE);
			breakFastLabel.setFont(new Font("Dialog", Font.BOLD, 12));
			breakFastLabel.setText("Breakfast");
			breakFastLabel.setBounds(321, 5, 161, 14);
		}
		return breakFastLabel;
	}

	/**
	 * @return
	 */
	protected JLabel getLunchLabel() {
		if (lunchLabel == null) {
			lunchLabel = new JLabel();
			lunchLabel.setText("Lunch");
			lunchLabel.setForeground(GuiModes.DESIGNER_FORMS
					.getControlForegroundColor());
			lunchLabel.setBackground(Color.WHITE);
			lunchLabel.setFont(new Font("Dialog", Font.BOLD, 12));
			lunchLabel.setBounds(321, 22, 161, 14);
		}
		return lunchLabel;
	}

	/**
	 * @return
	 */
	protected JLabel getDinnerLabel() {
		if (dinnerLabel == null) {
			dinnerLabel = new JLabel();
			dinnerLabel.setForeground(GuiModes.DESIGNER_FORMS
					.getControlForegroundColor());
			dinnerLabel.setBackground(Color.WHITE);
			dinnerLabel.setFont(new Font("Dialog", Font.BOLD, 12));
			dinnerLabel.setText("Dinner");
			dinnerLabel.setBounds(321, 40, 161, 14);
		}
		return dinnerLabel;
	}

	/**
	 * @return
	 */
	protected JButton getViewButton() {
		if (viewButton == null) {
			viewButton = new JxButton(0.4f);
			viewButton.addActionListener(new ActionListener() {
				public void actionPerformed(final ActionEvent e) {
					SwingUtils.openInDialog(new PanelViewDiet(dateLabel
							.getText()));
					doUpdateDietInfo(new Date(dateLabel.getText()));
				}
			});
			viewButton.setBackground(Color.WHITE);
			viewButton.setForeground(DEF_COL);
			viewButton.setBorder(new LineBorder(BORDER_COL, 1, false));
			viewButton.setFont(new Font("", Font.BOLD, 12));
			viewButton.setText("View");
			viewButton.setBounds(488, 12, 89, 34);
		}
		return viewButton;
	}

	private void doUpdateDietInfo(Date date) {
		try {
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MMM dd, yyyy");
			df.format(date);
			DietPlanByDate dietPlanByDate = MedrexClientManager.getInstance()
					.getDietPlanByDate(df.format(date) + "");
			if (dietPlanByDate != null) {
				breakFastLabel.setText(dietPlanByDate.getBreakfast());
				dinnerLabel.setText(dietPlanByDate.getDinner());
				lunchLabel.setText(dietPlanByDate.getLunch());
			} else {
				breakFastLabel.setText("");
				lunchLabel.setText("");
				dinnerLabel.setText("");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
