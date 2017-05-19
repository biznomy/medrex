package medrex.client.main.physicanOrders.physicianOrderScreen;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import medrex.commons.dataObj.physicianOrders.Stage3or4;
import medrex.commons.enums.ColorConstants;

public class PanelTreatmentStage3or4 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7263502986695957558L;
	private JCheckBox cbCddDaily;
	private JTextField txtQ;
	private JCheckBox cbSilver;
	private JCheckBox cbOther3or4;
	private JCheckBox cbCovrsite;
	private JCheckBox cbSantyl;
	private JTextField txtWoundOther;
	private JCheckBox cbWoundOther;
	private JCheckBox cbCovrsiteWound;
	private JCheckBox cbAllevyn;
	private JTextField txtChange;
	private JTextField txtOther;
	private JCheckBox cbHydrogelWith;
	private Container bgDays;
	private AbstractButton cbCdd;
	private Stage3or4 stage3or4;

	public PanelTreatmentStage3or4() {
		super();
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(535, 145));
		setLayout(null);

		final JPanel panel_stage3or4 = new JPanel();
		panel_stage3or4.setPreferredSize(new Dimension(535, 145));
		panel_stage3or4.setOpaque(false);
		panel_stage3or4.setBackground(Color.WHITE);
		panel_stage3or4.setLayout(null);
		panel_stage3or4.setBounds(0, 0, 535, 145);
		add(panel_stage3or4);

		final JLabel lblStage3or4 = new JLabel();
		lblStage3or4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblStage3or4.setForeground(ColorConstants.DEF_COLOR);
		lblStage3or4.setText("Stage 3 or 4 with Necrotic/Slough Tissue");
		lblStage3or4.setBounds(10, 0, 288, 14);
		panel_stage3or4.add(lblStage3or4);

		cbSantyl = new JCheckBox();
		cbSantyl.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cbSantyl.setForeground(ColorConstants.DEF_COLOR);
		cbSantyl.setBackground(Color.WHITE);
		cbSantyl.setText("Santyl with ");
		cbSantyl.setBounds(10, 20, 94, 18);
		panel_stage3or4.add(cbSantyl);

		cbCovrsite = new JCheckBox();
		cbCovrsite.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cbCovrsite.setForeground(ColorConstants.DEF_COLOR);
		cbCovrsite.setBackground(Color.WHITE);
		cbCovrsite.setText("CovRsite");
		cbCovrsite.setBounds(110, 20, 70, 18);
		panel_stage3or4.add(cbCovrsite);

		txtOther = new JTextField();
		txtOther.setBounds(406, 19, 105, 18);
		panel_stage3or4.add(txtOther);

		cbOther3or4 = new JCheckBox();
		cbOther3or4.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				enableComponent();
			}

			public void enableComponent() {
				if (cbOther3or4.isSelected())
					txtOther.setEnabled(true);
				else
					txtOther.setEnabled(false);

			}
		});
		cbOther3or4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cbOther3or4.setForeground(ColorConstants.DEF_COLOR);
		cbOther3or4.setBackground(Color.WHITE);
		cbOther3or4.setText("Other");
		cbOther3or4.setBounds(306, 21, 94, 18);
		panel_stage3or4.add(cbOther3or4);

		final JLabel lblStage3or4_1 = new JLabel();
		lblStage3or4_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblStage3or4_1.setForeground(ColorConstants.DEF_COLOR);
		lblStage3or4_1.setText("Stage 3 or 4 with increased bacterial load");
		lblStage3or4_1.setBounds(10, 43, 288, 14);
		panel_stage3or4.add(lblStage3or4_1);

		cbSilver = new JCheckBox();
		cbSilver.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cbSilver.setForeground(ColorConstants.DEF_COLOR);
		cbSilver.setBackground(Color.WHITE);
		cbSilver.setText("Silver impregnated dressing");
		cbSilver.setBounds(10, 60, 159, 18);
		panel_stage3or4.add(cbSilver);

		final JLabel changeLabel = new JLabel();
		changeLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		changeLabel.setForeground(ColorConstants.DEF_COLOR);
		changeLabel.setText("CHANGE");
		changeLabel.setBounds(192, 63, 47, 14);
		panel_stage3or4.add(changeLabel);

		final JLabel lblPrn = new JLabel();
		lblPrn.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPrn.setForeground(ColorConstants.DEF_COLOR);
		lblPrn.setText("PRN");
		lblPrn.setBounds(357, 62, 54, 14);
		panel_stage3or4.add(lblPrn);

		txtChange = new JTextField();
		txtChange.setBounds(246, 59, 105, 18);
		panel_stage3or4.add(txtChange);

		final JLabel lblStage3or4_1_1 = new JLabel();
		lblStage3or4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblStage3or4_1_1.setForeground(ColorConstants.DEF_COLOR);
		lblStage3or4_1_1.setText("Wound/Clean and Beefy Red");
		lblStage3or4_1_1.setBounds(10, 84, 288, 14);
		panel_stage3or4.add(lblStage3or4_1_1);

		cbCdd = new JCheckBox();
		cbCdd.setForeground(ColorConstants.DEF_COLOR);
		cbCdd.setBackground(Color.WHITE);
		cbCdd.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cbCdd.setText("CDD");
		cbCdd.setBounds(110, 100, 70, 18);
		panel_stage3or4.add(cbCdd);

		cbHydrogelWith = new JCheckBox();
		cbHydrogelWith.setForeground(ColorConstants.DEF_COLOR);
		cbHydrogelWith.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cbHydrogelWith.setBackground(Color.WHITE);
		cbHydrogelWith.setText("Hydrogel with");
		cbHydrogelWith.setBounds(10, 100, 94, 18);
		panel_stage3or4.add(cbHydrogelWith);

		cbAllevyn = new JCheckBox();
		cbAllevyn.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cbAllevyn.setForeground(ColorConstants.DEF_COLOR);
		cbAllevyn.setBackground(Color.WHITE);
		cbAllevyn.setText("Allevyn");
		cbAllevyn.setBounds(10, 120, 94, 18);
		panel_stage3or4.add(cbAllevyn);

		cbCovrsiteWound = new JCheckBox();
		cbCovrsiteWound.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cbCovrsiteWound.setForeground(ColorConstants.DEF_COLOR);
		cbCovrsiteWound.setBackground(Color.WHITE);
		cbCovrsiteWound.setText("Coversite");
		cbCovrsiteWound.setBounds(110, 120, 94, 18);
		panel_stage3or4.add(cbCovrsiteWound);

		cbWoundOther = new JCheckBox();
		cbWoundOther.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				enableComponents();
			}

			public void enableComponents() {
				if (cbWoundOther.isSelected())
					txtWoundOther.setEnabled(true);
				else
					txtWoundOther.setEnabled(false);

			}
		});
		cbWoundOther.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cbWoundOther.setForeground(ColorConstants.DEF_COLOR);
		cbWoundOther.setBackground(Color.WHITE);
		cbWoundOther.setText("Other");
		cbWoundOther.setBounds(221, 120, 65, 18);
		panel_stage3or4.add(cbWoundOther);

		txtWoundOther = new JTextField();
		txtWoundOther.setBounds(290, 120, 105, 18);
		panel_stage3or4.add(txtWoundOther);

		final JLabel qLabel = new JLabel();
		qLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		qLabel.setForeground(ColorConstants.DEF_COLOR);
		qLabel.setText("Q");
		qLabel.setBounds(191, 100, 24, 14);
		panel_stage3or4.add(qLabel);

		txtQ = new JTextField();
		txtQ.setBounds(221, 100, 79, 18);
		panel_stage3or4.add(txtQ);

		final JLabel qLabel_1 = new JLabel();
		qLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		qLabel_1.setForeground(ColorConstants.DEF_COLOR);
		qLabel_1.setText("days and PRN");
		qLabel_1.setBounds(306, 100, 73, 14);
		panel_stage3or4.add(qLabel_1);

		cbCddDaily = new JCheckBox();
		cbCddDaily.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cbCddDaily.setForeground(ColorConstants.DEF_COLOR);
		cbCddDaily.setBackground(Color.WHITE);
		cbCddDaily.setText("CDD Daily/PRn");
		cbCddDaily.setBounds(191, 20, 94, 18);
		panel_stage3or4.add(cbCddDaily);

	}

	public void doSave() {
		Stage3or4 refStage3or4 = new Stage3or4();

		refStage3or4.setSantyl(cbSantyl.isSelected());
		refStage3or4.setCovrsite(cbCovrsite.isSelected());
		refStage3or4.setCddDaily(cbCddDaily.isSelected());
		refStage3or4.setOther3or4(cbOther3or4.isSelected());
		refStage3or4.setOtherTxt(txtOther.getText());
		refStage3or4.setSilver(cbSilver.isSelected());
		refStage3or4.setChangeTxt(txtChange.getText());
		refStage3or4.setHydrogelWith(cbHydrogelWith.isSelected());
		refStage3or4.setCdd(cbCdd.isSelected());
		refStage3or4.setQ(txtQ.getText());
		refStage3or4.setAllevyn(cbAllevyn.isSelected());
		refStage3or4.setCovrsiteWound(cbCovrsiteWound.isSelected());
		refStage3or4.setWoundOther(cbWoundOther.isSelected());
		refStage3or4.setWoundOtherTxt(txtWoundOther.getText());

		setStage3or4(refStage3or4);

	}

	public Stage3or4 getStage3or4() {
		return stage3or4;
	}

	public void setStage3or4(Stage3or4 stage3or4) {
		this.stage3or4 = stage3or4;
	}

	public void doUpdate() {

		cbSantyl.setSelected(this.stage3or4.isSantyl());
		cbSilver.setSelected(this.stage3or4.isSilver());
		cbCovrsiteWound.setSelected(this.stage3or4.isCovrsiteWound());
		cbCddDaily.setSelected(this.stage3or4.isCddDaily());
		cbOther3or4.setSelected(this.stage3or4.isOther3or4());
		txtOther.setText(this.stage3or4.getOtherTxt());
		txtChange.setText(this.stage3or4.getChangeTxt());
		cbHydrogelWith.setSelected(this.stage3or4.isHydrogelWith());
		cbCdd.setSelected(this.stage3or4.isCdd());
		txtQ.setText(this.stage3or4.getQ());
		cbAllevyn.setSelected(this.stage3or4.isAllevyn());
		cbCovrsiteWound.setSelected(this.stage3or4.isCovrsiteWound());
		cbWoundOther.setSelected(this.stage3or4.isWoundOther());
		txtWoundOther.setText(this.stage3or4.getWoundOtherTxt());

	}
}
