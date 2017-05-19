package medrex.client.dietary;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.dietary.DietPlanByDate;

import com.sX.swing.JxButton;

public class PanelDietryView extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7771012314362499745L;
	private JLabel dinnerLabel;
	private JLabel lunchLabel;
	private JLabel breakFastLabel;
	private JButton viewButton;

	public PanelDietryView(final Date date) {
		super();
		setLayout(null);
		// setOpaque(false);
		setBackground(Color.WHITE);
		breakFastLabel = new JLabel();
		breakFastLabel.setText("");
		breakFastLabel.setForeground(ColorConstants.DEF_COLOR);
		breakFastLabel.setBounds(2, 4, 45, 15);
		add(breakFastLabel);

		lunchLabel = new JLabel();
		lunchLabel.setForeground(ColorConstants.DEF_COLOR);
		lunchLabel.setText("");
		lunchLabel.setBounds(57, 4, 45, 15);
		add(lunchLabel);

		dinnerLabel = new JLabel();
		dinnerLabel.setForeground(ColorConstants.DEF_COLOR);
		dinnerLabel.setText("");
		dinnerLabel.setBounds(2, 19, 45, 15);
		add(dinnerLabel);

		viewButton = new JxButton(0.4f);
		viewButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				SimpleDateFormat df = new SimpleDateFormat("MMMM dd, yyyy");

				String str = df.format(date);
				// System.out.println(str);
				SwingUtils.openInDialog(new PanelViewDiet(str));
				doUpdateDietInfo(date);
			}
		});
		viewButton.setText("+");
		viewButton.setBackground(Color.WHITE);
		viewButton.setForeground(ColorConstants.DEF_COLOR);
		viewButton
				.setBorder(new LineBorder(ColorConstants.BORDER_COL, 1, false));
		viewButton.setFont(new Font("", Font.BOLD, 10));
		viewButton.setBounds(55, 19, 45, 14);
		viewButton.setEnabled(false);
		add(viewButton);
		doUpdateDietInfo(date);
	}

	@Override
	public void setEnabled(boolean enabled) {
		super.setEnabled(enabled);
		viewButton.setEnabled(enabled);

	}

	private void doUpdateDietInfo(Date date) {
		try {
			DietPlanByDate dietPlanByDate = null;
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MMM dd, yyyy");
			if (date != null) {
				dietPlanByDate = MedrexClientManager.getInstance()
						.getDietPlanByDate(df.format(date) + "");
			}
			if (dietPlanByDate != null) {
				// System.out.println(dietPlanByDate.getBreakfast());
				// System.out.println(dietPlanByDate.getLunch());
				// System.out.println(dietPlanByDate.getDinner());
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
	// public static void main(String arg[]){
	// JFrame frm=new JFrame("my Panel");
	// // frm.getContentPane().add(new PanelDietryView());
	// frm.setVisible(true);
	// frm.setSize(100, 100);
	// }

}
