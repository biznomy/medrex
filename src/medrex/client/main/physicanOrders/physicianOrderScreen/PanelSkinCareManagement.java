package medrex.client.main.physicanOrders.physicianOrderScreen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.constants.Global;
import medrex.commons.enums.ColorConstants;

import com.sX.swing.JxPanel;

public class PanelSkinCareManagement extends JxPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4990024700542849278L;
	private JButton btDelete;
	private JButton btSave;
	private JButton btAddNew;
	private JRadioButton rbSkinTear;
	private JRadioButton rbStableHeel;
	private JRadioButton rbSurgicalWound;
	private JRadioButton rbFungalYeast;
	private JRadioButton rbStage4;
	private JRadioButton rbStage3;
	private JRadioButton rbStage2;
	private JRadioButton rbStage1;
	private ButtonGroup BGfUNGAL = new ButtonGroup();
	private ButtonGroup BGStages = new ButtonGroup();

	public PanelSkinCareManagement() {
		super();
		setBorder(new LineBorder(ColorConstants.DEF_COLOR));
		setBackground(Color.WHITE);
		setArc(1.0f);
		setLayout(new BorderLayout());

		final JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(500, 0));
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.CENTER);

		rbStage1 = new JRadioButton();
		rbStage1.setForeground(ColorConstants.DEF_COLOR);
		BGStages.add(rbStage1);
		rbStage1.setBackground(Color.WHITE);
		rbStage1.setText("STAGE 1");
		rbStage1.setBounds(50, 50, 80, 20);
		panel.add(rbStage1);

		rbStage2 = new JRadioButton();
		rbStage2.setForeground(ColorConstants.DEF_COLOR);

		BGStages.add(rbStage2);
		rbStage2.setBackground(Color.WHITE);
		rbStage2.setText("STAGE 2");
		rbStage2.setBounds(160, 50, 80, 20);
		panel.add(rbStage2);

		rbStage3 = new JRadioButton();
		rbStage3.setForeground(ColorConstants.DEF_COLOR);
		BGStages.add(rbStage3);
		rbStage3.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
			}
		});
		rbStage3.setBackground(Color.WHITE);
		rbStage3.setText("STAGE 3");
		rbStage3.setBounds(270, 50, 80, 20);
		panel.add(rbStage3);

		rbStage4 = new JRadioButton();
		rbStage4.setForeground(ColorConstants.DEF_COLOR);
		BGStages.add(rbStage4);
		rbStage4.setBackground(Color.WHITE);
		rbStage4.setText("STAGE 4");
		rbStage4.setBounds(380, 50, 80, 20);
		panel.add(rbStage4);

		rbFungalYeast = new JRadioButton();
		rbFungalYeast.setForeground(ColorConstants.DEF_COLOR);
		BGfUNGAL.add(rbFungalYeast);
		rbFungalYeast.setBackground(Color.WHITE);
		rbFungalYeast.setText("FUNGAL/YEAST INFECTION");
		rbFungalYeast.setBounds(50, 120, 190, 20);
		panel.add(rbFungalYeast);

		rbStableHeel = new JRadioButton();
		rbStableHeel.setForeground(ColorConstants.DEF_COLOR);
		BGfUNGAL.add(rbStableHeel);
		rbStableHeel.setBackground(Color.WHITE);
		rbStableHeel.setText("STABLE HEEL ULLER");
		rbStableHeel.setBounds(50, 150, 190, 20);
		panel.add(rbStableHeel);

		rbSurgicalWound = new JRadioButton();
		rbSurgicalWound.setForeground(ColorConstants.DEF_COLOR);
		BGfUNGAL.add(rbSurgicalWound);
		rbSurgicalWound.setBackground(Color.WHITE);
		rbSurgicalWound.setText("SUGICAL WOUND");
		rbSurgicalWound.setBounds(50, 180, 190, 20);
		panel.add(rbSurgicalWound);

		rbSkinTear = new JRadioButton();
		rbSkinTear.setForeground(ColorConstants.DEF_COLOR);
		BGfUNGAL.add(rbSkinTear);
		rbSkinTear.setBackground(Color.WHITE);
		rbSkinTear.setText("SKIN TEARS");
		rbSkinTear.setBounds(50, 210, 190, 20);
		panel.add(rbSkinTear);

		btAddNew = new JButton();
		btAddNew.setForeground(ColorConstants.DEF_COLOR);
		btAddNew.setBackground(Color.WHITE);
		btAddNew.setText("ADD NEW");
		btAddNew.setBounds(270, 237, 88, 20);
		panel.add(btAddNew);

		btSave = new JButton();
		btSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				Global.framePhysicianOrder.dispose();
			}
		});
		btSave.setForeground(ColorConstants.DEF_COLOR);
		btSave.setBackground(Color.WHITE);
		btSave.setText("SAVE");
		btSave.setBounds(380, 237, 88, 20);
		panel.add(btSave);

		btDelete = new JButton();
		btDelete.setForeground(ColorConstants.DEF_COLOR);
		btDelete.setBackground(Color.WHITE);
		btDelete.setText("DELETE");
		btDelete.setBounds(490, 237, 80, 20);
		panel.add(btDelete);

		final JLabel skinCareManagemrntLabel = new JLabel();
		skinCareManagemrntLabel.setForeground(ColorConstants.DEF_COLOR);
		skinCareManagemrntLabel.setHorizontalAlignment(SwingConstants.CENTER);
		skinCareManagemrntLabel.setFont(new Font("", Font.BOLD, 20));
		skinCareManagemrntLabel.setPreferredSize(new Dimension(0, 50));
		skinCareManagemrntLabel.setText("Skin Care Management");
		add(skinCareManagemrntLabel, BorderLayout.NORTH);
	}

}
