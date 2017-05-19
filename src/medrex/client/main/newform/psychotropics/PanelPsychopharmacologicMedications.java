package medrex.client.main.newform.psychotropics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.commons.intf.Form;

public class PanelPsychopharmacologicMedications extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 649235138036932059L;

	public PanelPsychopharmacologicMedications() {
		super();
		setBorder(new LineBorder(Color.black, 1, false));
		setLayout(null);
		setPreferredSize(new Dimension(800, 1000));
		setBackground(new Color(254, 252, 252));

		final JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setOpaque(false);
		panel.setLayout(null);
		panel.setBounds(5, 5, 795, 995);
		add(panel);

		final JLabel label = new JLabel();
		label.setForeground(new Color(128, 64, 64));
		label.setFont(new Font("Arial", Font.BOLD, 12));
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setText("Plaza HealthCare and Rehabilitation Center");
		label.setBounds(200, 10, 308, 16);
		panel.add(label);

		final JLabel appendix1Label = new JLabel();
		appendix1Label.setForeground(new Color(128, 64, 64));
		appendix1Label.setFont(new Font("Arial", Font.BOLD, 12));
		appendix1Label.setHorizontalAlignment(SwingConstants.LEFT);
		appendix1Label.setText("APPENDIX 1");
		appendix1Label.setBounds(280, 45, 89, 14);
		panel.add(appendix1Label);

		final JLabel label_1 = new JLabel();
		label_1.setForeground(new Color(128, 64, 64));
		label_1.setFont(new Font("Arial", Font.BOLD, 12));
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setText("PSYCHOPHARMACOLOGIC MEDICATIONS ");
		label_1.setBounds(200, 80, 308, 14);
		panel.add(label_1);

		final JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setLayout(null);
		panel_1.setBounds(10, 115, 780, 164);
		panel.add(panel_1);

		final JLabel label_2 = new JLabel();
		label_2.setForeground(new Color(128, 64, 64));
		label_2.setFont(new Font("Arial", Font.BOLD, 14));
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setText("<html><body><u>ANITIDEPRESSANT MEDICATIONS</u>");
		label_2.setBounds(200, 5, 291, 26);
		panel_1.add(label_2);

		final JLabel tricyclicsLabel = new JLabel();
		tricyclicsLabel.setForeground(new Color(128, 64, 64));
		tricyclicsLabel.setFont(new Font("Arial", Font.BOLD, 12));
		tricyclicsLabel.setText("Tricyclics");
		tricyclicsLabel.setBounds(280, 35, 69, 14);
		panel_1.add(tricyclicsLabel);

		final JLabel label_3 = new JLabel();
		label_3.setForeground(new Color(128, 64, 64));
		label_3.setFont(new Font("Arial", Font.PLAIN, 12));
		label_3
				.setText("Anafranil Avently  HCL  Elavil  Limbitrol  Norpramin  Pamelor  Sinequan  Surmontil  Tofranil  Vivactil");
		label_3.setBounds(10, 55, 556, 14);
		panel_1.add(label_3);

		final JLabel ssrisLabel = new JLabel();
		ssrisLabel.setForeground(new Color(128, 64, 64));
		ssrisLabel.setFont(new Font("Arial", Font.BOLD, 12));
		ssrisLabel.setText("SSRIs");
		ssrisLabel.setBounds(295, 75, 54, 14);
		panel_1.add(ssrisLabel);

		final JLabel label_4 = new JLabel();
		label_4.setForeground(new Color(128, 64, 64));
		label_4.setFont(new Font("Arial", Font.PLAIN, 12));
		label_4
				.setText("Celexa  Loxapro  Luvox  Paxil  Pexeva  Prozac  Sarafem  Sysbyax  Zoloft");
		label_4.setBounds(55, 95, 422, 14);
		panel_1.add(label_4);

		final JLabel miscellaneousLabel = new JLabel();
		miscellaneousLabel.setForeground(new Color(128, 64, 64));
		miscellaneousLabel.setFont(new Font("Arial", Font.BOLD, 12));
		miscellaneousLabel.setText("MISCELLANEOUS");
		miscellaneousLabel.setBounds(270, 120, 121, 14);
		panel_1.add(miscellaneousLabel);

		final JLabel label_5 = new JLabel();
		label_5.setForeground(new Color(128, 64, 64));
		label_5.setFont(new Font("Arial", Font.PLAIN, 12));
		label_5
				.setText("Cymbalta  Desyrel  Effexor  Remeron  Serzone  Wellbutrin");
		label_5.setBounds(101, 140, 487, 14);
		panel_1.add(label_5);

		final JPanel panel_1_1 = new JPanel();
		panel_1_1.setOpaque(false);
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(10, 300, 780, 141);
		panel.add(panel_1_1);

		final JLabel label_2_1 = new JLabel();
		label_2_1.setForeground(new Color(128, 64, 64));
		label_2_1.setFont(new Font("Arial", Font.BOLD, 14));
		label_2_1.setText("<html><body><u>ANITIPSYCHOTIC MEDICATIONS</u>");
		label_2_1.setBounds(200, 5, 291, 26);
		panel_1_1.add(label_2_1);

		final JLabel tricyclicsLabel_1 = new JLabel();
		tricyclicsLabel_1.setForeground(new Color(128, 64, 64));
		tricyclicsLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		tricyclicsLabel_1.setText("Atypical/Other");
		tricyclicsLabel_1.setBounds(280, 37, 102, 14);
		panel_1_1.add(tricyclicsLabel_1);

		final JLabel label_3_1 = new JLabel();
		label_3_1.setForeground(new Color(128, 64, 64));
		label_3_1.setFont(new Font("Arial", Font.PLAIN, 12));
		label_3_1
				.setText("Abilify  Clozaril  Geodon  Risperdal  Seroquel  Zyprexa");
		label_3_1.setBounds(101, 55, 465, 14);
		panel_1_1.add(label_3_1);

		final JLabel ssrisLabel_1 = new JLabel();
		ssrisLabel_1.setForeground(new Color(128, 64, 64));
		ssrisLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		ssrisLabel_1.setText("Typical");
		ssrisLabel_1.setBounds(295, 75, 54, 14);
		panel_1_1.add(ssrisLabel_1);

		final JLabel label_4_1 = new JLabel();
		label_4_1.setForeground(new Color(128, 64, 64));
		label_4_1.setFont(new Font("Arial", Font.PLAIN, 12));
		label_4_1
				.setText("haldol  Loxitane  Mellaril  Moban  Navane  Orap  Prochloperazine  Prolixin  Stelazine");
		label_4_1.setBounds(55, 95, 487, 14);
		panel_1_1.add(label_4_1);

		final JLabel miscellaneousLabel_1 = new JLabel();
		miscellaneousLabel_1.setForeground(new Color(128, 64, 64));
		miscellaneousLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		miscellaneousLabel_1.setText("Thorazine  trilafon");
		miscellaneousLabel_1.setBounds(270, 120, 121, 14);
		panel_1_1.add(miscellaneousLabel_1);

		final JPanel panel_1_2 = new JPanel();
		panel_1_2.setOpaque(false);
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(10, 465, 780, 116);
		panel.add(panel_1_2);

		final JLabel label_2_2 = new JLabel();
		label_2_2.setForeground(new Color(128, 64, 64));
		label_2_2.setFont(new Font("Arial", Font.BOLD, 14));
		label_2_2.setText("<html><body><u>ANXIOLYTIC MEDICATIONS</u>");
		label_2_2.setBounds(200, 5, 291, 26);
		panel_1_2.add(label_2_2);

		final JLabel tricyclicsLabel_2 = new JLabel();
		tricyclicsLabel_2.setForeground(new Color(128, 64, 64));
		tricyclicsLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		tricyclicsLabel_2.setText("Benzodiazepines");
		tricyclicsLabel_2.setBounds(245, 35, 106, 14);
		panel_1_2.add(tricyclicsLabel_2);

		final JLabel label_3_2 = new JLabel();
		label_3_2.setForeground(new Color(128, 64, 64));
		label_3_2.setFont(new Font("Arial", Font.PLAIN, 12));
		label_3_2
				.setText("Ativan  Centrax  klonopin  Librium  Paxipam  Serax  Tranxene  Valium  Xaniz  ");
		label_3_2.setBounds(10, 55, 556, 14);
		panel_1_2.add(label_3_2);

		final JLabel ssrisLabel_2 = new JLabel();
		ssrisLabel_2.setForeground(new Color(128, 64, 64));
		ssrisLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		ssrisLabel_2.setText("Miscellaneous");
		ssrisLabel_2.setBounds(255, 75, 129, 14);
		panel_1_2.add(ssrisLabel_2);

		final JLabel label_4_2 = new JLabel();
		label_4_2.setForeground(new Color(128, 64, 64));
		label_4_2.setText("Buspar  Atarax  Vistaril");
		label_4_2.setBounds(240, 95, 329, 14);
		panel_1_2.add(label_4_2);

		final JPanel panel_1_3 = new JPanel();
		panel_1_3.setOpaque(false);
		panel_1_3.setLayout(null);
		panel_1_3.setBounds(10, 605, 780, 77);
		panel.add(panel_1_3);

		final JLabel label_2_3 = new JLabel();
		label_2_3.setForeground(new Color(128, 64, 64));
		label_2_3.setFont(new Font("Arial", Font.BOLD, 14));
		label_2_3.setText("<html><body><u>MOOD STABILIZERS/ANTICONVULSANTS");
		label_2_3.setBounds(200, 5, 291, 26);
		panel_1_3.add(label_2_3);

		final JLabel label_3_3 = new JLabel();
		label_3_3.setForeground(new Color(128, 64, 64));
		label_3_3.setFont(new Font("Arial", Font.PLAIN, 12));
		label_3_3
				.setText("Depakote  Neurontin  Lithium  Tegretol  Lamictal  Keppra  Mysoline  Valproic Acid");
		label_3_3.setBounds(10, 30, 556, 14);
		panel_1_3.add(label_3_3);

		final JLabel ssrisLabel_3 = new JLabel();
		ssrisLabel_3.setForeground(new Color(128, 64, 64));
		ssrisLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		ssrisLabel_3.setText("Pnenobarbital  Dilantin");
		ssrisLabel_3.setBounds(175, 50, 159, 14);
		panel_1_3.add(ssrisLabel_3);

		final JPanel panel_1_4 = new JPanel();
		panel_1_4.setOpaque(false);
		panel_1_4.setLayout(null);
		panel_1_4.setBounds(10, 715, 780, 84);
		panel.add(panel_1_4);

		final JLabel label_2_4 = new JLabel();
		label_2_4.setForeground(new Color(128, 64, 64));
		label_2_4.setFont(new Font("Arial", Font.BOLD, 14));
		label_2_4.setText("<html><body><u>SEDATIVE/HYPNOTICS");
		label_2_4.setBounds(200, 5, 291, 26);
		panel_1_4.add(label_2_4);

		final JLabel label_3_4 = new JLabel();
		label_3_4.setForeground(new Color(128, 64, 64));
		label_3_4.setFont(new Font("Arial", Font.PLAIN, 12));
		label_3_4
				.setText("Ambien  Ativan  Benadryl  ChloralHydrate  Dalmane  Desyrel  Halcion  Klonopin");
		label_3_4.setBounds(10, 30, 556, 14);
		panel_1_4.add(label_3_4);

		final JLabel label_4_4 = new JLabel();
		label_4_4.setForeground(new Color(128, 64, 64));
		label_4_4.setText("Lunesta  Prosom  Restoril  Rozerem  Sonata  Xanax");
		label_4_4.setBounds(80, 50, 422, 14);
		panel_1_4.add(label_4_4);

	}

	public static void main(String args[]) {
		try {
			UIManager
					.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JScrollPane scroller = new JScrollPane();
		PanelPsychopharmacologicMedications panel = new PanelPsychopharmacologicMedications();
		scroller.setViewportView(panel);
		JFrame frm = new JFrame("Frame");
		frm.setSize(new Dimension(java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize()));
		frm.add(scroller);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setState(JFrame.MAXIMIZED_BOTH);
		frm.setVisible(true);

	}

	@Override
	public void doLoad() {
		// TODO Auto-generated method stub

	}

	@Override
	public int doSave() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void doUpdate() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean doValidate() {
		// TODO Auto-generated method stub
		return false;
	}

}
