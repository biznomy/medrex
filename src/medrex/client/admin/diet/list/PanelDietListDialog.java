package medrex.client.admin.diet.list;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.enums.GuiModes;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.admin.DietList;

import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;

public class PanelDietListDialog extends PopUpView {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2041700014702495975L;
	private static final Color DEF_COLOR = new Color(49, 104, 127);
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);
	private JxComboBox cmbCategory;
	private JTextField txtName;

	public PanelDietListDialog() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(400, 180));
		setSize(400, 180);
		setForeground(GuiModes.DESIGNER_FORMS.getDefaultForegroundColor());
		setBackground(GuiModes.DESIGNER_FORMS.getDefaultBackgroundColor());
		setFont(GuiModes.DESIGNER_FORMS.getDefaultFont());

		final JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setLayout(null);
		panel.setBounds(0, 0, 400, 180);
		add(panel);

		final JxButton saveButton = new JxButton();
		saveButton.setArc(0.4f);
		saveButton.setBackground(Color.WHITE);
		saveButton.setForeground(DEF_COL);
		saveButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (doSave()) {
					close();
				}
			}
		});
		saveButton.setText("Save");
		saveButton.setBounds(153, 128, 85, 25);
		panel.add(saveButton);

		final JxButton cancelButton = new JxButton();
		cancelButton.setArc(0.4f);
		cancelButton.setBackground(Color.WHITE);
		cancelButton.setForeground(DEF_COL);
		cancelButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		cancelButton.setText("Cancel");
		cancelButton.setBounds(267, 128, 85, 25);
		panel.add(cancelButton);

		cmbCategory = new JxComboBox();
		cmbCategory.setModel(new DefaultComboBoxModel(new String[] { "LIQUIDS",
				"CEREALS", "VEGETABLES", "MAIN", "DESERT" }));
		cmbCategory.setBackground(Color.WHITE);
		cmbCategory.setForeground(DEF_COLOR);
		cmbCategory.setArc(0.4f);
		cmbCategory.setBorder(new LineBorder(DEF_COLOR, 1, false));
		cmbCategory.setBounds(72, 78, 280, 25);
		panel.add(cmbCategory);

		txtName = new JTextField();
		txtName.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		txtName.setBorder(new LineBorder(SystemColor.desktop, 1, false));
		txtName.setBounds(72, 32, 280, 25);
		panel.add(txtName);

		final JLabel lblDietName = new JLabel();
		lblDietName.setForeground(SystemColor.desktop);
		lblDietName.setText("Name");
		lblDietName.setBackground(Color.WHITE);
		lblDietName.setFont(new Font("", Font.BOLD, 12));
		lblDietName.setHorizontalAlignment(SwingConstants.CENTER);
		lblDietName.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDietName.setBounds(0, 36, 66, 16);
		panel.add(lblDietName);

		final JLabel lblCategory = new JLabel();
		lblCategory.setForeground(SystemColor.desktop);
		lblCategory.setText("Category");
		lblCategory.setBackground(Color.WHITE);
		lblCategory.setFont(new Font("", Font.BOLD, 12));
		lblCategory.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategory.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCategory.setBounds(0, 82, 66, 16);
		panel.add(lblCategory);

		final JLabel lblDiet = new JLabel();
		lblDiet.setForeground(SystemColor.desktop);
		lblDiet.setText("Diet");
		lblDiet.setBackground(Color.WHITE);
		lblDiet.setFont(new Font("", Font.BOLD, 12));
		lblDiet.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiet.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDiet.setBounds(10, 0, 375, 30);
		panel.add(lblDiet);

		doUpdate();
	}

	private void doUpdate() {
		if (Global.currentDietListKey != 0) {
			DietList diet = null;
			try {
				diet = MedrexClientManager.getInstance().getDiet(
						Global.currentDietListKey);
			} catch (Exception ex) {

			}
			txtName.setText(diet.getName());
			cmbCategory.setSelectedItem(diet.getCategory());
		}
	}

	protected boolean doSave() {
		boolean bool = false;
		DietList diet = new DietList();
		try {
			diet.setSerial(Global.currentDietListKey);
			diet.setName(txtName.getText());
			diet.setCategory(cmbCategory.getSelectedItem() + "");
			int serial = MedrexClientManager.getInstance()
					.insertOrUpdateDietList(diet);
			if (serial != 0) {
				bool = true;
			}
		} catch (Exception ex) {
			bool = false;
		}
		return bool;
	}

	@Override
	public String getTitle() {
		return "Diet List";
	}

}
