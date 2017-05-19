package medrex.client.dietary;

import java.awt.Color;
import java.awt.Font;
import java.util.Iterator;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.commons.enums.GuiModes;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.admin.DietPlan;

public class PanelPlusDietInfo extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7073575368667266193L;
	private JLabel lblDesert;
	private JLabel lblMain;
	private JLabel lblVegetables;
	private JLabel lblCereals;
	private JLabel lblLiquids;
	private JLabel desertLabel;
	private JLabel mainLabel;
	private JLabel vegetablesLabel;
	private JLabel cerealsLabel;
	private JLabel liquidsLabel;
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);
	private String str;

	public PanelPlusDietInfo(String str) {
		super();

		this.str = str;
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
		breakfastLabel.setHorizontalAlignment(SwingConstants.CENTER);
		breakfastLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		breakfastLabel.setBackground(Color.WHITE);
		breakfastLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		breakfastLabel.setText(str + " Informations");
		breakfastLabel.setBounds(10, 10, 290, 25);
		panel.add(breakfastLabel);

		liquidsLabel = new JLabel();
		liquidsLabel.setForeground(new Color(0, 0, 0));
		liquidsLabel.setBackground(Color.WHITE);
		liquidsLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		liquidsLabel.setText("Liquids: ");
		liquidsLabel.setBounds(10, 45, 74, 25);
		panel.add(liquidsLabel);

		cerealsLabel = new JLabel();
		cerealsLabel.setForeground(new Color(0, 0, 0));
		cerealsLabel.setBackground(Color.WHITE);
		cerealsLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		cerealsLabel.setText("Cereals:  ");
		cerealsLabel.setBounds(10, 85, 74, 25);
		panel.add(cerealsLabel);

		vegetablesLabel = new JLabel();
		vegetablesLabel.setForeground(new Color(0, 0, 0));
		vegetablesLabel.setBackground(Color.WHITE);
		vegetablesLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		vegetablesLabel.setText("Vegetables: ");
		vegetablesLabel.setBounds(10, 120, 74, 25);
		panel.add(vegetablesLabel);

		mainLabel = new JLabel();
		mainLabel.setForeground(new Color(0, 0, 0));
		mainLabel.setBackground(Color.WHITE);
		mainLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		mainLabel.setText("Main: ");
		mainLabel.setBounds(10, 155, 74, 25);
		panel.add(mainLabel);

		desertLabel = new JLabel();
		desertLabel.setForeground(new Color(0, 0, 0));
		desertLabel.setBackground(Color.WHITE);
		desertLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		desertLabel.setText("Desert: ");
		desertLabel.setBounds(10, 185, 74, 25);
		panel.add(desertLabel);

		lblLiquids = new JLabel();
		lblLiquids.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		lblLiquids.setBackground(Color.WHITE);
		lblLiquids.setFont(new Font("Dialog", Font.BOLD, 12));
		lblLiquids.setBounds(90, 45, 210, 25);
		panel.add(lblLiquids);

		lblCereals = new JLabel();
		lblCereals.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		lblCereals.setBackground(Color.WHITE);
		lblCereals.setFont(new Font("Dialog", Font.BOLD, 12));
		lblCereals.setBounds(90, 85, 210, 25);
		panel.add(lblCereals);

		lblVegetables = new JLabel();
		lblVegetables.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		lblVegetables.setBackground(Color.WHITE);
		lblVegetables.setFont(new Font("Dialog", Font.BOLD, 12));
		lblVegetables.setBounds(90, 120, 210, 25);
		panel.add(lblVegetables);

		lblMain = new JLabel();
		lblMain.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		lblMain.setBackground(Color.WHITE);
		lblMain.setFont(new Font("Dialog", Font.BOLD, 12));
		lblMain.setBounds(90, 155, 210, 25);
		panel.add(lblMain);

		lblDesert = new JLabel();
		lblDesert.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		lblDesert.setBackground(Color.WHITE);
		lblDesert.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDesert.setBounds(90, 185, 210, 25);
		panel.add(lblDesert);

		doUpdate();
	}

	private void doUpdate() {
		List<DietPlan> list = null;
		try {
			if (str != null) {
				list = MedrexClientManager.getInstance().getDietPlanByDietName(
						str);
			}
		} catch (Exception ex) {

		}
		if (list != null) {
			Iterator<DietPlan> it = list.iterator();
			while (it.hasNext()) {
				DietPlan d = it.next();
				lblLiquids.setText(d.getLiquidsQuery());
				lblCereals.setText(d.getCerealsQuery());
				lblVegetables.setText(d.getVegetablesQuery());
				lblMain.setText(d.getMainQuery());
				lblDesert.setText(d.getDesertQuery());
			}
		}
	}

	@Override
	public String getTitle() {
		return "Diet Plan Info";
	}

}
