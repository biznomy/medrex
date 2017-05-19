package medrex.client.main.physicanOrders.physicianOrderScreen;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;

import com.sX.swing.JxPanel;
import com.sX.swing.JxRadioButton;
import com.sX.swing.JxText;

public class PanelRespiratoryTherapyStage1 extends JPanel 
{
	private JxRadioButton rbpulseOxymetry;
	private JxRadioButton rbSob;
	private JxRadioButton rbpnrFor;
	private JxRadioButton rbContinous;
	private JxComboBox cmbVia;
	private ButtonGroup bg1 = new ButtonGroup();
	private ButtonGroup bg2= new ButtonGroup();
	
	public PanelRespiratoryTherapyStage1() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);

		final JxPanel jxPanel = new JxPanel();
		jxPanel.setBackground(Color.WHITE);
		jxPanel.setLayout(null);
		jxPanel.setBounds(10, 10, 605, 153);
		add(jxPanel);

		final JxPanel jxPanel_1 = new JxPanel();
		jxPanel_1.setBackground(Color.WHITE);
		jxPanel_1.setLayout(null);
		jxPanel_1.setBounds(10, 10, 585, 31);
		jxPanel.add(jxPanel_1);

		final JxLabel lminuteJxLabel = new JxLabel();
		lminuteJxLabel.setText("L/MINUTE");
		lminuteJxLabel.setBounds(10, 10, 53, 14);
		jxPanel_1.add(lminuteJxLabel);

		final JxText jxText = new JxText();
		jxText.setBounds(69, 5, 63, 21);
		jxPanel_1.add(jxText);

		final JxLabel viaJxLabel = new JxLabel();
		viaJxLabel.setText("VIA");
		viaJxLabel.setBounds(167, 10, 39, 14);
		jxPanel_1.add(viaJxLabel);

		cmbVia = new JxComboBox();
		cmbVia.setModel(new DefaultComboBoxModel(new String[] { "", "NASAL CANNULA", "VENTIMASK", "NRB", "TRACH COLLAR" }));
		cmbVia.setBackground(Color.WHITE);
		cmbVia.setBounds(212, 7, 92, 21);
		jxPanel_1.add(cmbVia);

		final JxPanel jxPanel_2 = new JxPanel();
		jxPanel_2.setBackground(Color.WHITE);
		jxPanel_2.setLayout(null);
		jxPanel_2.setBounds(10, 47, 585, 90);
		jxPanel.add(jxPanel_2);

		rbContinous = new JxRadioButton();
		rbContinous.setBackground(Color.WHITE);
		rbContinous.setText("CONTINOUS");
		bg1.add(rbContinous);
		rbContinous.setBounds(74, 10, 88, 18);		
		jxPanel_2.add(rbContinous);

		final JxPanel jxPanel_3 = new JxPanel();
		jxPanel_3.setBackground(Color.WHITE);
		jxPanel_3.setLayout(null);
		jxPanel_3.setBounds(63, 41, 512, 38);
		jxPanel_2.add(jxPanel_3);

		rbpnrFor = new JxRadioButton();
		rbpnrFor.setBackground(Color.WHITE);
		rbpnrFor.setBounds(11, 10, 82, 18);
		bg1.add(rbpnrFor);
		jxPanel_3.add(rbpnrFor);		
		rbpnrFor.setText("PNR FOR");

		rbSob = new JxRadioButton();
		rbSob.setBackground(Color.WHITE);
		rbSob.setBounds(140, 10, 53, 18);
		bg2.add(rbSob);
		jxPanel_3.add(rbSob);
		rbSob.setText("SOB");
		
		rbpulseOxymetry = new JxRadioButton();
		rbpulseOxymetry.setBackground(Color.WHITE);
		rbpulseOxymetry.setBounds(211, 10, 101, 18);
		bg2.add(rbpulseOxymetry);
		jxPanel_3.add(rbpulseOxymetry);
		rbpulseOxymetry.setText("Pulse Oxymetry");

		final JxLabel jxLabel = new JxLabel();
		jxLabel.setBounds(318, 10, 29, 14);
		jxPanel_3.add(jxLabel);
		jxLabel.setText("<=");

		final JxText jxText_1 = new JxText();
		jxText_1.setBounds(353, 5, 47, 21);
		jxPanel_3.add(jxText_1);

		final JxLabel jxLabel_1 = new JxLabel();
		jxLabel_1.setText("%");
		jxLabel_1.setBounds(408, 10, 29, 14);
		jxPanel_3.add(jxLabel_1);
	}

}
