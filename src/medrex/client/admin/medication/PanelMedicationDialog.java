package medrex.client.admin.medication;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.admin.Medication;

import com.sX.swing.JxButton;

public class PanelMedicationDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2251818751437236012L;
	private JTextField txtCautionary;
	private JTextField txtRouteName;
	private JTextArea textAreaDescription;
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);
	private JTextField txtNDC;
	private JTextField txtMedName;

	private String mode;

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if (this.mode == "Add New") {
			txtNDC.setEditable(true);
		} else {
			txtNDC.setEditable(false);
		}
	}

	public PanelMedicationDialog() {
		super();
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(400, 290));
		setSize(400, 290);
		setForeground(GuiModes.DESIGNER_FORMS.getDefaultForegroundColor());
		setBackground(GuiModes.DESIGNER_FORMS.getDefaultBackgroundColor());
		setFont(GuiModes.DESIGNER_FORMS.getDefaultFont());

		final JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setLayout(null);
		panel.setBounds(0, 0, 400, 272);
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
					dispose();
				}
			}
		});
		saveButton.setText("Save");
		saveButton.setBounds(155, 203, 85, 25);
		panel.add(saveButton);

		final JxButton cancelButton = new JxButton();
		cancelButton.setArc(0.4f);
		cancelButton.setBackground(Color.WHITE);
		cancelButton.setForeground(DEF_COL);
		cancelButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				dispose();
			}
		});
		cancelButton.setText("Cancel");
		cancelButton.setBounds(264, 203, 85, 25);
		panel.add(cancelButton);

		txtNDC = new JTextField();
		txtNDC.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		txtNDC.setBorder(new LineBorder(BORDER_COL, 1, false));
		txtNDC.setBounds(105, 49, 247, 25);
		panel.add(txtNDC);

		final JLabel lblMedCode = new JLabel();
		lblMedCode.setForeground(DEF_COL);
		lblMedCode.setText("NDC");
		lblMedCode.setBackground(Color.WHITE);
		lblMedCode.setFont(new Font("", Font.BOLD, 12));
		lblMedCode.setHorizontalAlignment(SwingConstants.LEFT);
		lblMedCode.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMedCode.setBounds(20, 53, 66, 16);
		panel.add(lblMedCode);

		txtMedName = new JTextField();
		txtMedName.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		txtMedName.setBorder(new LineBorder(BORDER_COL, 1, false));
		txtMedName.setBounds(105, 80, 247, 25);
		panel.add(txtMedName);

		final JLabel lblMedName = new JLabel();
		lblMedName.setForeground(DEF_COL);
		lblMedName.setText("Name");
		lblMedName.setBackground(Color.WHITE);
		lblMedName.setFont(new Font("", Font.BOLD, 12));
		lblMedName.setHorizontalAlignment(SwingConstants.LEFT);
		lblMedName.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMedName.setBounds(20, 83, 66, 16);
		panel.add(lblMedName);

		final JLabel lblDescription = new JLabel();
		lblDescription.setForeground(DEF_COL);
		lblDescription.setText("Description");
		lblDescription.setBackground(Color.WHITE);
		lblDescription.setFont(new Font("", Font.BOLD, 12));
		lblDescription.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescription.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDescription.setBounds(20, 172, 66, 16);
		panel.add(lblDescription);

		final JLabel lblDiet = new JLabel();
		lblDiet.setForeground(DEF_COL);
		lblDiet.setText("Medication");
		lblDiet.setBackground(Color.WHITE);
		lblDiet.setFont(new Font("", Font.BOLD, 16));
		lblDiet.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiet.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDiet.setBounds(10, 0, 375, 43);
		panel.add(lblDiet);

		textAreaDescription = new JTextArea();
		textAreaDescription.setBorder(new LineBorder(BORDER_COL, 1, false));
		textAreaDescription.setBounds(105, 169, 247, 25);
		panel.add(textAreaDescription);

		final JLabel lblDescription_1 = new JLabel();
		lblDescription_1.setText("Route Name");
		lblDescription_1.setForeground(DEF_COL);
		lblDescription_1.setBackground(Color.WHITE);
		lblDescription_1.setFont(new Font("", Font.BOLD, 12));
		lblDescription_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescription_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDescription_1.setBounds(20, 116, 79, 16);
		panel.add(lblDescription_1);

		txtRouteName = new JTextField();
		txtRouteName.setBorder(new LineBorder(new Color(180, 188, 193), 1,
				false));
		txtRouteName.setBounds(105, 111, 247, 25);
		panel.add(txtRouteName);

		final JLabel lblDescription_1_1 = new JLabel();
		lblDescription_1_1.setForeground(DEF_COL);
		lblDescription_1_1.setFont(new Font("", Font.BOLD, 12));
		lblDescription_1_1.setText("Cautionary");
		lblDescription_1_1.setBounds(20, 144, 79, 16);
		panel.add(lblDescription_1_1);

		txtCautionary = new JTextField();
		txtCautionary.setBorder(new LineBorder(new Color(180, 188, 193), 1,
				false));
		txtCautionary.setBounds(105, 141, 247, 25);
		panel.add(txtCautionary);

		doUpdate();
	}

	public boolean doSave() {
		boolean bool = false;
		Medication medication = new Medication();
		medication.setNdc(Long.parseLong(txtNDC.getText()));
		medication.setCode("");
		medication.setName(txtMedName.getText());
		medication.setCoustionary(txtCautionary.getText());
		medication.setName(txtMedName.getText());
		medication.setRouteName(txtRouteName.getText());
		medication.setDescription(textAreaDescription.getText());
		try {
			Long serial = MedrexClientManager.getInstance()
					.insertOrUpdateMedications(medication);
			if (serial != 0) {
				bool = true;
			}
		} catch (Exception ex) {
			bool = false;
		}
		return bool;
	}

	public void doUpdate() {
		Medication med = null;
		if (Global.currentMedicationKey != 0) {
			try {
				med = MedrexClientManager.getInstance().getMedication(
						Global.currentMedicationKey);
			} catch (Exception ex) {

			}
			txtNDC.setText(med.getNdc() + "");
			txtMedName.setText(med.getName());
			txtCautionary.setText(med.getCoustionary());
			txtRouteName.setText(med.getRouteName());
			textAreaDescription.setText(med.getDescription());
		} else {
			txtNDC.setText("");
			txtMedName.setText("");
			txtCautionary.setText("");
			txtRouteName.setText("");
			textAreaDescription.setText("");
		}
	}

}
