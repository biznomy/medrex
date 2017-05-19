package medrex.client.admin.diet.plan;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.commons.enums.GuiModes;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.admin.DietList;

import com.sX.swing.JxButton;

public class PanelDietPlanEditor extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6828629005431679306L;
	private JScrollPane scrollPane;
	private JxButton clearButton;
	private JxButton orButton;
	private JxButton andButton;
	private JxButton buttonType;
	private JLabel lblTitle;
	private JPanel buttonPanel;
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);
	private String bType;

	public PanelDietPlanEditor(final String bType) {
		super();
		this.bType = bType;
		setLayout(null);
		setPreferredSize(new Dimension(220, 330));
		setSize(220, 330);
		setForeground(GuiModes.DESIGNER_FORMS.getDefaultForegroundColor());
		setBackground(GuiModes.DESIGNER_FORMS.getDefaultBackgroundColor());
		setFont(GuiModes.DESIGNER_FORMS.getDefaultFont());

		final JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setLayout(null);
		panel.setBounds(0, 0, 220, 325);
		add(panel);

		andButton = new JxButton();
		andButton.setArc(0.4f);
		andButton.setBackground(Color.WHITE);
		andButton.setForeground(DEF_COL);
		andButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		andButton.setFont(new Font("", Font.BOLD, 12));
		andButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				firePropertyChange("andButton", bType, "AND");
			}
		});
		andButton.setText("AND");
		andButton.setBounds(15, 261, 85, 25);
		panel.add(andButton);

		orButton = new JxButton();
		orButton.setArc(0.4f);
		orButton.setBackground(Color.WHITE);
		orButton.setForeground(DEF_COL);
		orButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		orButton.setFont(new Font("", Font.BOLD, 12));
		orButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				firePropertyChange("orButton", bType, "OR");
			}
		});
		orButton.setText("OR");
		orButton.setBounds(119, 261, 85, 25);
		panel.add(orButton);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 5, 215, 250);
		panel.add(panel_1);

		lblTitle = new JLabel();
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setForeground(SystemColor.desktop);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTitle.setText(bType);
		lblTitle.setBounds(0, 0, 215, 20);
		panel_1.add(lblTitle);

		buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.WHITE);
		buttonPanel.setLayout(null);

		addButtonType();

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(SystemColor.desktop, 1, false));
		scrollPane.setViewportView(buttonPanel);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(0, 23, 215, 217);
		scrollPane.setAutoscrolls(true);
		panel_1.add(scrollPane);

		clearButton = new JxButton();
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				firePropertyChange("clearButton", bType, "CLEAR");
			}
		});
		clearButton.setText("CLEAR");
		clearButton.setArc(0.4f);
		clearButton.setBackground(Color.WHITE);
		clearButton.setForeground(DEF_COL);
		clearButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		clearButton.setFont(new Font("", Font.BOLD, 12));
		clearButton.setBounds(66, 292, 85, 25);
		panel.add(clearButton);
	}

	private void addButtonType() {
		List<DietList> dietList = null;
		try {
			dietList = MedrexClientManager.getInstance().getDietByCategory(
					bType);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (dietList != null) {
			Iterator<DietList> it = dietList.iterator();
			int y = 5;
			while (it.hasNext()) {
				DietList diet = it.next();
				final String str = diet.getName();
				buttonType = new JxButton();
				buttonType.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firePropertyChange("dietType", bType, str);// button
						// name,
						// category,
						// value
					}
				});
				buttonType.setArc(0.4f);
				buttonType.setBackground(Color.WHITE);
				buttonType.setForeground(DEF_COL);
				buttonType.setBorder(new LineBorder(BORDER_COL, 1, false));
				buttonType.setFont(new Font("", Font.BOLD, 12));
				buttonType.setText(str);
				buttonType.setBounds(5, y, 180, 29);
				buttonPanel.add(buttonType);
				y = y + 36;
			}
			buttonPanel.setSize(180, y);
			buttonPanel.setPreferredSize(buttonPanel.getSize());
		}

	}

	@Override
	public String getTitle() {
		return "Diet Plan Editor";
	}

}
