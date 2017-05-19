package medrex.client.admin.formConfig;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;

import medrex.client.utils.SwingUtils;
import medrex.commons.intf.PopUpView;

import com.sX.swing.JxButton;

public class PanelCheckBoxPupup extends PopUpView {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6353880160404911321L;
	private ButtonGroup bgMenDatory = new ButtonGroup();
	private ButtonGroup bgEnable = new ButtonGroup();
	private ButtonGroup bgCheck = new ButtonGroup();
	private JPanel panelMendatory;
	private JRadioButton rbYes;
	private JRadioButton rbNo;
	private JRadioButton rbEnabledYes;
	private JRadioButton rbEnabledNo;
	private static final Color DEF_COLOR = new Color(49, 104, 127);
	private static final Color BORDER_COL = new Color(180, 188, 193);

	public PanelCheckBoxPupup() {
		super();
		setLayout(null);
		setSize(490, 210);
		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 496, 211);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(SystemColor.desktop, 2, false));
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(14, 10, 462, 24);
		panel.add(panel_1);

		final JLabel checkBoxValidationLabel = new JLabel();
		checkBoxValidationLabel.setForeground(DEF_COLOR);
		checkBoxValidationLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		checkBoxValidationLabel.setBounds(158, 5, 151, 14);
		checkBoxValidationLabel.setText("Check Box Validation");
		panel_1.add(checkBoxValidationLabel);

		final JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setLayout(null);
		panel_2.setBounds(0, 40, 486, 173);
		panel.add(panel_2);

		panelMendatory = new JPanel();
		panelMendatory.setBounds(15, 10, 461, 102);
		panel_2.add(panelMendatory);
		panelMendatory.setLayout(null);
		panelMendatory.setBackground(Color.WHITE);
		panelMendatory.setBorder(new LineBorder(DEF_COLOR, 2, false));

		final JLabel isMendatoryLabel = new JLabel();
		isMendatoryLabel.setForeground(DEF_COLOR);
		isMendatoryLabel.setFont(new Font("", Font.BOLD, 12));
		isMendatoryLabel.setText("MANDATORY ? ");
		isMendatoryLabel.setBounds(40, 10, 131, 16);
		panelMendatory.add(isMendatoryLabel);

		rbYes = new JRadioButton();
		rbYes.setSelected(true);
		rbYes.setForeground(DEF_COLOR);
		rbYes.setFont(new Font("Tahoma", Font.BOLD, 12));
		rbYes.setActionCommand("1");
		bgMenDatory.add(rbYes);
		rbYes.setBackground(Color.WHITE);
		rbYes.setText("Yes");
		rbYes.setBounds(221, 11, 88, 18);
		panelMendatory.add(rbYes);

		rbNo = new JRadioButton();
		rbNo.setForeground(DEF_COLOR);
		rbNo.setFont(new Font("Tahoma", Font.BOLD, 12));
		rbNo.setActionCommand("0");
		bgMenDatory.add(rbNo);
		rbNo.setBackground(Color.WHITE);
		rbNo.setText("No");
		rbNo.setBounds(354, 11, 88, 18);
		panelMendatory.add(rbNo);

		final JLabel isMendatoryLabel_1 = new JLabel();
		isMendatoryLabel_1.setForeground(DEF_COLOR);
		isMendatoryLabel_1.setFont(new Font("", Font.BOLD, 12));
		isMendatoryLabel_1.setText("IS ENABLED ?");
		isMendatoryLabel_1.setBounds(40, 45, 131, 16);
		panelMendatory.add(isMendatoryLabel_1);

		rbEnabledYes = new JRadioButton();
		rbEnabledYes.setSelected(true);
		rbEnabledYes.setActionCommand("1");
		bgEnable.add(rbEnabledYes);
		rbEnabledYes.setForeground(DEF_COLOR);
		rbEnabledYes.setFont(new Font("Tahoma", Font.BOLD, 12));
		rbEnabledYes.setBackground(Color.WHITE);
		rbEnabledYes.setText("Yes");
		rbEnabledYes.setBounds(221, 47, 88, 18);
		panelMendatory.add(rbEnabledYes);

		rbEnabledNo = new JRadioButton();
		rbEnabledNo.setActionCommand("2");
		rbEnabledNo.setForeground(DEF_COLOR);
		bgEnable.add(rbEnabledNo);
		rbEnabledNo.setFont(new Font("Tahoma", Font.BOLD, 12));
		rbEnabledNo.setBackground(Color.WHITE);
		rbEnabledNo.setText("No");
		rbEnabledNo.setBounds(354, 47, 88, 18);
		panelMendatory.add(rbEnabledNo);

		final JLabel ischecked = new JLabel();
		ischecked.setForeground(DEF_COLOR);
		ischecked.setFont(new Font("", Font.BOLD, 12));
		ischecked.setText("IS CHECKED ?");
		ischecked.setBounds(40, 80, 131, 16);
		panelMendatory.add(ischecked);

		rbEnabledYes = new JRadioButton();
		rbEnabledYes.setSelected(true);
		rbEnabledYes.setActionCommand("1");
		bgCheck.add(rbEnabledYes);
		rbEnabledYes.setForeground(DEF_COLOR);
		rbEnabledYes.setFont(new Font("Tahoma", Font.BOLD, 12));
		rbEnabledYes.setBackground(Color.WHITE);
		rbEnabledYes.setText("Yes");
		rbEnabledYes.setBounds(221, 80, 88, 18);
		panelMendatory.add(rbEnabledYes);

		rbEnabledNo = new JRadioButton();
		rbEnabledNo.setActionCommand("2");
		rbEnabledNo.setForeground(DEF_COLOR);
		bgCheck.add(rbEnabledNo);
		rbEnabledNo.setFont(new Font("Tahoma", Font.BOLD, 12));
		rbEnabledNo.setBackground(Color.WHITE);
		rbEnabledNo.setText("No");
		rbEnabledNo.setBounds(354, 80, 88, 18);
		panelMendatory.add(rbEnabledNo);

		final JPanel panel_8 = new JPanel();
		panel_8.setBounds(15, 118, 461, 45);
		panel_2.add(panel_8);
		panel_8.setBackground(Color.WHITE);
		panel_8.setLayout(null);
		panel_8.setBorder(new LineBorder(SystemColor.desktop, 2, false));

		final JxButton saveButton = new JxButton();
		saveButton.setArc(0.4f);
		saveButton.setBackground(Color.WHITE);
		saveButton.setForeground(DEF_COLOR);
		saveButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.setBounds(60, 10, 75, 21);
		saveButton.setText("Save");
		panel_8.add(saveButton);

		final JxButton cancelButton = new JxButton();
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		cancelButton.setArc(0.4f);
		cancelButton.setBackground(Color.WHITE);
		cancelButton.setForeground(DEF_COLOR);
		cancelButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setText("Cancel");
		cancelButton.setBounds(190, 10, 75, 21);
		panel_8.add(cancelButton);

		final JxButton alertInfoButton = new JxButton();
		alertInfoButton.setArc(0.4f);
		alertInfoButton.setBackground(Color.WHITE);
		alertInfoButton.setForeground(DEF_COLOR);
		alertInfoButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		alertInfoButton.setFont(new Font("", Font.BOLD, 12));
		alertInfoButton.setText("Alert Info");
		alertInfoButton.setBounds(329, 10, 75, 21);
		panel_8.add(alertInfoButton);
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String args[]) {
		PanelCheckBoxPupup panelCheckBoxPupup = new PanelCheckBoxPupup();
		SwingUtils.openInDialog(panelCheckBoxPupup);
	}

}
