package medrex.client.main.newform.psychotropics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.commons.intf.Form;

public class PanelInstructionForConductingTheResidentExamination extends JPanel
		implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4292133890114942374L;
	private static final Object Constraints = null;

	public PanelInstructionForConductingTheResidentExamination() {
		super();
		setBorder(new LineBorder(Color.black, 1, false));
		setLayout(null);
		setPreferredSize(new Dimension(800, 1000));
		setBackground(new Color(252, 252, 252));

		final JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setLayout(null);
		panel.setBounds(0, 0, 780, 1000);
		add(panel);

		final JLabel label = new JLabel();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setText("INSTRUCTION FOR CONDUCTING THE RESIDENT EXAMINATION");
		label.setBounds(88, 10, 539, 23);
		panel.add(label);

		final JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setLayout(null);
		panel_1.setBounds(69, 10, 558, 23);
		panel.add(panel_1);

		JSeparator horizontal = new JSeparator(JSeparator.HORIZONTAL);
		horizontal.setBounds(10, 39, 728, 2);
		panel.add(horizontal, Constraints);

		final JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setLayout(null);
		panel_2.setBounds(20, 47, 718, 37);
		panel.add(panel_2);

		final JLabel label_1 = new JLabel();
		label_1
				.setText("<html><body>Complete examination procedures before making actual movement rating.The chair to be used in this ex-<br> aminaton should be firm and without arms ");

		label_1.setBounds(0, 0, 718, 35);
		panel_2.add(label_1);

		final JPanel panel_3 = new JPanel();
		panel_3.setOpaque(false);
		panel_3.setLayout(null);
		panel_3.setBounds(20, 95, 718, 83);
		panel.add(panel_3);

		final JLabel label_2 = new JLabel();
		label_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_2.setText(" A. FACIAL AND ORAL MOVEMENTS");
		label_2.setBounds(10, 10, 464, 21);
		panel_3.add(label_2);

		final JLabel label_3 = new JLabel();
		label_3
				.setText("- Ask resident to open mouth.Observe tongue at rest within mouth.Do this twice");
		label_3.setBounds(10, 38, 642, 14);
		panel_3.add(label_3);

		final JLabel label_4 = new JLabel();
		label_4
				.setText("- Ask resident to protrude tongue.Observe abnormalities of tongue movements.");
		label_4.setBounds(10, 58, 642, 14);
		panel_3.add(label_4);

		final JPanel panel_4 = new JPanel();
		panel_4.setOpaque(false);
		panel_4.setLayout(null);
		panel_4.setBounds(20, 195, 718, 167);
		panel.add(panel_4);

		final JLabel label_5 = new JLabel();
		label_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_5.setText("B. EXTREMITY MOVEMENTS");
		label_5.setBounds(10, 10, 499, 22);
		panel_4.add(label_5);

		final JLabel label_6 = new JLabel();
		label_6
				.setText("- Flex and extend residents's left and right arms,one at a time.Notice any rigidity.");
		label_6.setBounds(10, 38, 593, 14);
		panel_4.add(label_6);

		final JLabel label_7 = new JLabel();
		label_7
				.setText("<html><body>- Ask resident to extend both arms outstretched in front with palms down.Observe trunk,legs,<br>  and mouth.");
		label_7.setBounds(10, 55, 582, 29);
		panel_4.add(label_7);

		final JLabel label_8 = new JLabel();
		label_8
				.setText("<html><body>- Have resident walk a few paces,turn,and walkback to chair,Observe hands and galt.Do this <br>twice. ");
		label_8.setBounds(10, 90, 562, 22);
		panel_4.add(label_8);

		final JLabel label_9 = new JLabel();
		label_9
				.setText("<html><body>Ask resident to tap thumb with each finger as rapidly as possible for 10-15 seconds with both<br> left and right hand observe facial and leg movements");
		label_9.setBounds(10, 120, 672, 32);
		panel_4.add(label_9);

		final JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(20, 522, 718, -98);
		panel.add(panel_5);

		final JPanel panel_6 = new JPanel();
		panel_6.setOpaque(false);
		panel_6.setLayout(null);
		panel_6.setBounds(20, 375, 718, 167);
		panel.add(panel_6);

		final JLabel label_10 = new JLabel();
		label_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_10.setText("C. TRUNK MOVEMENTS");
		label_10.setBounds(10, 10, 321, 14);
		panel_6.add(label_10);

		final JLabel label_11 = new JLabel();
		label_11
				.setText("-Ask resident to stand up.Observe in profile all body areas.");
		label_11.setBounds(10, 38, 660, 14);
		panel_6.add(label_11);

		final JLabel label_12 = new JLabel();
		label_12
				.setText("<html><body>- Have resident sit in chair with hands on knees,legs slightly apart,and feet flat o floor.Observe<br> entire body for movements.");
		label_12.setBounds(10, 58, 660, 48);
		panel_6.add(label_12);

		final JLabel label_13 = new JLabel();
		label_13
				.setText("<html><body> - Ask resident to sit with hands hanging unsupported.If male,between knees or if female in dress,<br>haging over knees.Observe hands and other body areas.");
		label_13.setBounds(10, 112, 660, 45);
		panel_6.add(label_13);

		final JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setOpaque(false);
		panel_7.setBounds(20, 555, 718, 98);
		panel.add(panel_7);

		final JLabel label_14 = new JLabel();
		label_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_14.setText("D.  GLOBAL JUDGEMENTS");
		label_14.setBounds(10, 10, 446, 14);
		panel_7.add(label_14);

		final JLabel label_15 = new JLabel();
		label_15
				.setText("<html><body> - Ask resident if he/she notices any movement in mouth,face,hands,or feet,If YES,ask to what<br> extend they currently interfere with activities.");
		label_15.setBounds(10, 30, 659, 43);
		panel_7.add(label_15);

		final JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setOpaque(false);
		panel_8.setBounds(20, 670, 718, 98);
		panel.add(panel_8);

		final JLabel label_16 = new JLabel();
		label_16.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_16.setText("E.  DENTAL STATUS");
		label_16.setBounds(10, 10, 563, 14);
		panel_8.add(label_16);

		final JLabel label_17 = new JLabel();
		label_17.setText("- Remove any material from mouth.");
		label_17.setBounds(10, 35, 634, 14);
		panel_8.add(label_17);

		final JLabel label_18 = new JLabel();
		label_18
				.setText("<html><body> - Ask resident about current condition of teeth,i.e.,partial,dentures.Do either bother resident<br> now?");
		label_18.setBounds(10, 55, 654, 33);
		panel_8.add(label_18);

		JSeparator horizontal1 = new JSeparator(JSeparator.HORIZONTAL);
		horizontal1.setBounds(10, 800, 728, 2);
		panel.add(horizontal1, Constraints);

		JSeparator horizontal2 = new JSeparator(JSeparator.HORIZONTAL);
		horizontal2.setBounds(10, 805, 728, 2);
		panel.add(horizontal2, Constraints);

		JSeparator horizontal3 = new JSeparator(JSeparator.HORIZONTAL);
		horizontal3.setBounds(10, 940, 728, 2);
		panel.add(horizontal3, Constraints);

		JSeparator horizontal4 = new JSeparator(JSeparator.HORIZONTAL);
		horizontal4.setBounds(10, 945, 728, 2);
		panel.add(horizontal4, Constraints);

		final JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setOpaque(false);
		panel_9.setBounds(10, 820, 728, 114);
		panel.add(panel_9);

		final JLabel label_19 = new JLabel();
		label_19.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_19.setText("Interpretation Of AIMS score:");
		label_19.setBounds(10, 5, 485, 14);
		panel_9.add(label_19);

		final JLabel label_20 = new JLabel();
		label_20.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_20.setText("0-1=LOW RISK Of MOVEMENTS DISORDER");
		label_20.setBounds(10, 25, 665, 14);
		panel_9.add(label_20);

		final JLabel label_21 = new JLabel();
		label_21
				.setText("2 in only of of seven body areas=BORDERLINE,OBSERVE CLOSELY");
		label_21.setBounds(10, 45, 636, 14);
		panel_9.add(label_21);

		final JLabel label_22 = new JLabel();
		label_22
				.setText("2 in two or more of seven body areas=REFERRAL FOR COMPLETE NEUROLOGICAL EXAM");
		label_22.setBounds(10, 60, 636, 14);
		panel_9.add(label_22);

		final JLabel label_23 = new JLabel();
		label_23
				.setText("3 or 4 in only one body area=REFERRAL FOR COMPLETE NEUROLOGICAL EXAM");
		label_23.setBounds(10, 80, 677, 14);
		panel_9.add(label_23);

		final JLabel label_24 = new JLabel();
		label_24.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_24.setHorizontalAlignment(SwingConstants.CENTER);
		label_24
				.setText("<html><body> SIGN AND DATE THE COMPLETED AIMS FORM.<BR> FILE IN THE RESIDENT'S CHART");
		label_24.setBounds(127, 953, 549, 37);
		panel.add(label_24);

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
		PanelInstructionForConductingTheResidentExamination panel = new PanelInstructionForConductingTheResidentExamination();
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
