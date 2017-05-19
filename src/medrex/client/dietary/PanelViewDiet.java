package medrex.client.dietary;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.admin.DietPlan;
import medrex.commons.vo.dietary.DietPlanByDate;

import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;

public class PanelViewDiet extends PopUpView {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4719941389193711381L;
	private JxButton dinnerPlusButton;
	private JxButton lunchPlusButton;
	private JxButton breakPlusButton;
	private String date;
	private int serial = 0;
	private JLabel lblDateTitle;
	private JxComboBox cmbBreakfast;
	private JxComboBox cmbLunch;
	private JxComboBox cmbDinner;
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);

	public PanelViewDiet(final String date) {
		super();
		this.date = date;

		setSize(310, 215);
		setBorder(new LineBorder(DEF_COL, 1, false));
		setLayout(null);
		setBackground(Color.WHITE);
		// panelSubMain.setPreferredSize(new Dimension(628, 108));

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 310, 215);
		add(panel);

		final JLabel breakfastLabel = new JLabel();
		breakfastLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		breakfastLabel.setBackground(Color.WHITE);
		breakfastLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		breakfastLabel.setText("Breakfast:");
		breakfastLabel.setBounds(24, 55, 60, 25);
		panel.add(breakfastLabel);

		cmbBreakfast = new JxComboBox();
		// cmbBreakfast.setModel(new DefaultComboBoxModel(new
		// String[]{"BREAKFAST", "LUNCH", "DINNER"}));
		cmbBreakfast.setBackground(Color.WHITE);
		cmbBreakfast.setForeground(DEF_COL);
		cmbBreakfast.setArc(0.4f);
		cmbBreakfast.setBorder(new LineBorder(DEF_COL, 1, false));
		cmbBreakfast.setFont(new Font("Tahoma", Font.BOLD, 12));
		cmbBreakfast.setBounds(90, 55, 150, 29);
		panel.add(cmbBreakfast);

		final JLabel lunchLabel = new JLabel();
		lunchLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		lunchLabel.setBackground(Color.WHITE);
		lunchLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		lunchLabel.setText("Lunch:");
		lunchLabel.setBounds(24, 90, 60, 25);
		panel.add(lunchLabel);

		cmbLunch = new JxComboBox();
		// cmbLunch.setModel(new DefaultComboBoxModel(new String[]{"BREAKFAST",
		// "LUNCH", "DINNER"}));
		cmbLunch.setBackground(Color.WHITE);
		cmbLunch.setForeground(DEF_COL);
		cmbLunch.setArc(0.4f);
		cmbLunch.setBorder(new LineBorder(DEF_COL, 1, false));
		cmbLunch.setFont(new Font("Tahoma", Font.BOLD, 12));
		cmbLunch.setBounds(90, 90, 150, 29);
		panel.add(cmbLunch);

		final JLabel dinnerLabel = new JLabel();
		dinnerLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		dinnerLabel.setBackground(Color.WHITE);
		dinnerLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		dinnerLabel.setText("Dinner:");
		dinnerLabel.setBounds(24, 125, 60, 25);
		panel.add(dinnerLabel);

		cmbDinner = new JxComboBox();
		// cmbDinner.setModel(new DefaultComboBoxModel(new String[]{"BREAKFAST",
		// "LUNCH", "DINNER"}));
		cmbDinner.setBackground(Color.WHITE);
		cmbDinner.setForeground(DEF_COL);
		cmbDinner.setArc(0.4f);
		cmbDinner.setBorder(new LineBorder(DEF_COL, 1, false));
		cmbDinner.setFont(new Font("Tahoma", Font.BOLD, 12));
		cmbDinner.setBounds(90, 125, 150, 29);
		panel.add(cmbDinner);

		final JxButton saveButton = new JxButton(0.4f);
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (doSave()) {
					close();
				}
			}
		});
		saveButton.setBackground(Color.WHITE);
		saveButton.setForeground(DEF_COL);
		saveButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.setText("Save");
		saveButton.setBounds(84, 175, 95, 30);
		panel.add(saveButton);

		final JxButton cancelButton = new JxButton(0.4f);
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		cancelButton.setBackground(Color.WHITE);
		cancelButton.setForeground(DEF_COL);
		cancelButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setText("Cancel");
		cancelButton.setBounds(185, 175, 95, 30);
		panel.add(cancelButton);

		lblDateTitle = new JLabel();
		lblDateTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblDateTitle.setBounds(0, 0, 310, 35);
		panel.add(lblDateTitle);
		// lblTitle.setPreferredSize(new Dimension(791, 35));
		lblDateTitle.setText("01/01/2009");
		lblDateTitle.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont()
				.deriveFont(28f));
		lblDateTitle.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());

		breakPlusButton = new JxButton(0.4f);
		breakPlusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtils.openInDialog(new PanelPlusDietInfo(cmbBreakfast
						.getSelectedItem()
						+ ""));
			}
		});
		breakPlusButton.setBackground(Color.WHITE);
		breakPlusButton.setForeground(DEF_COL);
		breakPlusButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		breakPlusButton.setFont(new Font("", Font.BOLD, 20));
		breakPlusButton.setText("+");
		breakPlusButton.setBounds(245, 56, 35, 30);
		panel.add(breakPlusButton);

		lunchPlusButton = new JxButton(0.4f);
		lunchPlusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtils.openInDialog(new PanelPlusDietInfo(cmbLunch
						.getSelectedItem()
						+ ""));
			}
		});
		lunchPlusButton.setBackground(Color.WHITE);
		lunchPlusButton.setForeground(DEF_COL);
		lunchPlusButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		lunchPlusButton.setFont(new Font("", Font.BOLD, 20));
		lunchPlusButton.setText("+");
		lunchPlusButton.setBounds(245, 91, 35, 30);
		panel.add(lunchPlusButton);

		dinnerPlusButton = new JxButton(0.4f);
		dinnerPlusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtils.openInDialog(new PanelPlusDietInfo(cmbDinner
						.getSelectedItem()
						+ ""));
			}
		});
		dinnerPlusButton.setBackground(Color.WHITE);
		dinnerPlusButton.setForeground(DEF_COL);
		dinnerPlusButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		dinnerPlusButton.setFont(new Font("", Font.BOLD, 20));
		dinnerPlusButton.setText("+");
		dinnerPlusButton.setBounds(245, 126, 35, 30);
		panel.add(dinnerPlusButton);

		doUpdate();
	}

	private void doUpdate() {
		List breakList = null;
		List dinnerList = null;
		List lunchList = null;
		List tempBreakList = new ArrayList();
		List tempDinnerkList = new ArrayList();
		List tempLunchkList = new ArrayList();

		lblDateTitle.setText(date + "");
		try {
			breakList = MedrexClientManager.getInstance()
					.getDietPlanByCategory("Breakfast");
			dinnerList = MedrexClientManager.getInstance()
					.getDietPlanByCategory("Dinner");
			lunchList = MedrexClientManager.getInstance()
					.getDietPlanByCategory("Lunch");
		} catch (Exception ex) {

		}
		Iterator<DietPlan> it = breakList.iterator();
		while (it.hasNext()) {
			DietPlan d = it.next();
			tempBreakList.add(d.getDietName());
		}
		Iterator<DietPlan> dinnerit = dinnerList.iterator();
		while (dinnerit.hasNext()) {
			DietPlan d = dinnerit.next();
			tempDinnerkList.add(d.getDietName());
		}
		Iterator<DietPlan> lunchit = lunchList.iterator();
		while (lunchit.hasNext()) {
			DietPlan d = lunchit.next();
			tempLunchkList.add(d.getDietName());
		}
		cmbBreakfast
				.setModel(new DefaultComboBoxModel(tempBreakList.toArray()));
		cmbDinner.setModel(new DefaultComboBoxModel(tempDinnerkList.toArray()));
		cmbLunch.setModel(new DefaultComboBoxModel(tempLunchkList.toArray()));
		try {
			DietPlanByDate dietPlanByDate = MedrexClientManager.getInstance()
					.getDietPlanByDate(date);
			if (dietPlanByDate != null) {
				serial = dietPlanByDate.getSerial();
				cmbBreakfast.setSelectedItem(dietPlanByDate.getBreakfast());
				cmbDinner.setSelectedItem(dietPlanByDate.getDinner());
				cmbLunch.setSelectedItem(dietPlanByDate.getLunch());
			} else {
				serial = 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private boolean doSave() {
		DietPlanByDate dietPlanByDate = new DietPlanByDate();
		boolean bool = false;
		try {
			dietPlanByDate.setSerial(serial);
			dietPlanByDate.setDietDate(new Date(date));
			dietPlanByDate.setBreakfast(cmbBreakfast.getSelectedItem() + "");
			dietPlanByDate.setDinner(cmbDinner.getSelectedItem() + "");
			dietPlanByDate.setLunch(cmbLunch.getSelectedItem() + "");
			int serial = MedrexClientManager.getInstance()
					.insertOrUpdateDietPlanByDate(dietPlanByDate);
			if (serial != 0) {
				bool = true;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			bool = false;
		}
		return bool;
	}

	@Override
	public String getTitle() {
		return "Diet List";
	}
}
