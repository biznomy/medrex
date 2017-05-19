package medrex.client.mds3.ui.subSections.sectionC;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.mds3.SectionC.Mds3SectionC;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelC1300 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3922873677795122915L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbC1300B;
	private JxComboBox cmbC1300D;
	private JxComboBox cmbC1300C;
	private JxComboBox cmbC1300A;

	public PanelC1300() {
		super();
		setPreferredSize(new Dimension(840, 300));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setBounds(0, 0, 840, 300);
		final FlowLayout flowLayout_22 = new FlowLayout();
		flowLayout_22.setVgap(0);
		flowLayout_22.setHgap(0);
		panel_5.setLayout(flowLayout_22);

		panel_5.setPreferredSize(new Dimension(840, 300));
		add(panel_5);

		final JxPanel panel_5_1_1_2_2_1 = new JxPanel();
		panel_5_1_1_2_2_1.setTheme(theme);
		panel_5_1_1_2_2_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1_2_2_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_20 = new FlowLayout();
		flowLayout_20.setHgap(10);
		flowLayout_20.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2_2_1.setLayout(flowLayout_20);
		panel_5_1_1_2_2_1.setPreferredSize(new Dimension(840, 30));
		panel_5.add(panel_5_1_1_2_2_1);

		final JxLabel a0100Label_1_1_2_2_1 = new JxLabel();
		a0100Label_1_1_2_2_1.setTheme(theme);

		a0100Label_1_1_2_2_1.setFontSize(12);
		a0100Label_1_1_2_2_1.setFontStyle(Font.BOLD);
		a0100Label_1_1_2_2_1.setText("Delirium");
		panel_5_1_1_2_2_1.add(a0100Label_1_1_2_2_1);

		final JxPanel panel_5_1_1_2_2_1_1 = new JxPanel();
		panel_5_1_1_2_2_1_1.setTheme(theme);
		panel_5_1_1_2_2_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1_2_2_1_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_21 = new FlowLayout();
		flowLayout_21.setHgap(10);
		flowLayout_21.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2_2_1_1.setLayout(flowLayout_21);
		panel_5_1_1_2_2_1_1.setPreferredSize(new Dimension(840, 30));
		panel_5.add(panel_5_1_1_2_2_1_1);

		final JxLabel a0100Label_1_1_2_2_1_1 = new JxLabel();
		a0100Label_1_1_2_2_1_1.setTheme(theme);

		a0100Label_1_1_2_2_1_1.setFontSize(12);
		a0100Label_1_1_2_2_1_1.setFontStyle(Font.BOLD);
		a0100Label_1_1_2_2_1_1
				.setText("C1300. Signs and symptoms of Delirium ( from CAM  )");
		panel_5_1_1_2_2_1_1.add(a0100Label_1_1_2_2_1_1);

		final JxPanel panel_5_1_1_2_2_1_1_1 = new JxPanel();
		panel_5_1_1_2_2_1_1_1.setTheme(theme);
		panel_5_1_1_2_2_1_1_1.setLayout(null);
		panel_5_1_1_2_2_1_1_1.setOpaque(false);
		panel_5_1_1_2_2_1_1_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		panel_5_1_1_2_2_1_1_1.setPreferredSize(new Dimension(840, 20));
		panel_5.add(panel_5_1_1_2_2_1_1_1);

		final JxLabel a0100Label_1_1_2_2_1_1_1 = new JxLabel();
		a0100Label_1_1_2_2_1_1_1.setTheme(theme);
		a0100Label_1_1_2_2_1_1_1.setBounds(11, 3, 527, 14);
		a0100Label_1_1_2_2_1_1_1
				.setText("<html>Code <b>after completing </b>Brief interview for Mental Status or staff assessment , and reviewing medical record");
		panel_5_1_1_2_2_1_1_1.add(a0100Label_1_1_2_2_1_1_1);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);

		panel_6.setLayout(null);
		panel_6.setPreferredSize(new Dimension(840, 220));
		panel_5.add(panel_6);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setOpaque(false);
		panel_7.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_7.setLayout(null);
		panel_7.setBounds(0, 0, 197, 220);
		panel_6.add(panel_7);

		final JxLabel codingLabel = new JxLabel();
		codingLabel.setTheme(theme);

		codingLabel.setFontSize(12);
		codingLabel.setFontStyle(Font.BOLD);
		codingLabel.setText("Coding :");
		codingLabel.setBounds(10, 35, 49, 14);
		panel_7.add(codingLabel);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);
		label.setText("<html>0. &nbsp <b>Behavior not present");
		label.setBounds(20, 55, 167, 14);
		panel_7.add(label);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);
		label_1
				.setText("<html>1. &nbsp <b>Behavior continuously<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;present , does not <br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;fluctuate");
		label_1.setBounds(20, 75, 167, 42);
		panel_7.add(label_1);

		final JxLabel label_1_1 = new JxLabel();
		label_1_1.setTheme(theme);
		label_1_1
				.setText("<html>2. &nbsp <b>Behavior present<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;fluctuates</b>(comes and <br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;goes , changes in severity)");
		label_1_1.setBounds(20, 117, 167, 42);
		panel_7.add(label_1_1);

		final JxPanel panel_9 = new JxPanel();
		panel_9.setTheme(theme);
		panel_9.setLayout(null);
		panel_9.setOpaque(false);
		panel_9.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_9.setBounds(196, 0, 644, 17);
		panel_6.add(panel_9);

		final JxLabel enterCodeInLabel = new JxLabel();
		enterCodeInLabel.setTheme(theme);
		enterCodeInLabel.setBounds(30, 1, 111, 14);

		enterCodeInLabel.setFontStyle(Font.BOLD);
		enterCodeInLabel.setText("Enter Code in Boxes");
		panel_9.add(enterCodeInLabel);

		final JxPanel panel_10 = new JxPanel();
		panel_10.setTheme(theme);
		panel_10.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_10.setLayout(null);
		panel_10.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_10.setBounds(196, 16, 39, 204);
		panel_6.add(panel_10);

		cmbC1300A = new JxComboBox();
		cmbC1300A.setTheme(theme);
		cmbC1300A.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2" }));

		cmbC1300A.setBounds(2, 10, 34, 21);
		panel_10.add(cmbC1300A);

		cmbC1300B = new JxComboBox();
		cmbC1300B.setTheme(theme);
		cmbC1300B.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2" }));

		cmbC1300B.setBounds(2, 51, 34, 21);
		panel_10.add(cmbC1300B);

		cmbC1300C = new JxComboBox();
		cmbC1300C.setTheme(theme);
		cmbC1300C.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2" }));

		cmbC1300C.setBounds(2, 103, 34, 21);
		panel_10.add(cmbC1300C);

		cmbC1300D = new JxComboBox();
		cmbC1300D.setTheme(theme);
		cmbC1300D.setModel(new DefaultComboBoxModel(new String[] { "" }));

		cmbC1300D.setBounds(2, 173, 34, 21);
		panel_10.add(cmbC1300D);

		final JxPanel panel_11 = new JxPanel();
		panel_11.setTheme(theme);
		final FlowLayout flowLayout_25 = new FlowLayout();
		flowLayout_25.setHgap(30);
		flowLayout_25.setAlignment(FlowLayout.LEFT);
		panel_11.setLayout(flowLayout_25);
		panel_11.setOpaque(false);
		panel_11.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_11.setBounds(234, 16, 606, 40);
		panel_6.add(panel_11);

		final JxLabel aInattentionLabel = new JxLabel();
		aInattentionLabel.setTheme(theme);
		aInattentionLabel
				.setText("<html><b>A.</b> &nbsp<b>Inattention - </b> Did the resident have difficulty focusing attention (easily distracted, out of touch or <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; dificulty following what was said)?");
		panel_11.add(aInattentionLabel);

		final JxPanel panel_11_1 = new JxPanel();
		panel_11_1.setTheme(theme);
		final FlowLayout flowLayout_26 = new FlowLayout();
		flowLayout_26.setHgap(30);
		flowLayout_26.setAlignment(FlowLayout.LEFT);
		panel_11_1.setLayout(flowLayout_26);
		panel_11_1.setOpaque(false);
		panel_11_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_11_1.setBounds(234, 55, 606, 40);
		panel_6.add(panel_11_1);

		final JxLabel aInattentionLabel_1 = new JxLabel();
		aInattentionLabel_1.setTheme(theme);
		aInattentionLabel_1
				.setText("<html><b>B.</b> &nbsp <b>Disorganized thinking -</b> was the resident thinking disorganized or incoherent(rambling or irrelevant<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; conversation, unclear or illogical flow of ideas, or unpredictable switching from subject to subject)?");
		panel_11_1.add(aInattentionLabel_1);

		final JxPanel panel_11_2 = new JxPanel();
		panel_11_2.setTheme(theme);
		final FlowLayout flowLayout_27 = new FlowLayout();
		flowLayout_27.setHgap(30);
		flowLayout_27.setAlignment(FlowLayout.LEFT);
		panel_11_2.setLayout(flowLayout_27);
		panel_11_2.setOpaque(false);
		panel_11_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_11_2.setBounds(234, 94, 606, 81);
		panel_6.add(panel_11_2);

		final JxLabel aInattentionLabel_1_1 = new JxLabel();
		aInattentionLabel_1_1.setTheme(theme);
		aInattentionLabel_1_1
				.setText("<html><b>C. </b> &nbsp<b> Altered level of consciousness</b> - Dis the resident have altered level of consciousness(eg. <b>vigilant</b>-<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; startled easily to any sound or touch ;<b>lethargic</b>- repeatedly dozed off when being asked questions, but<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; responded to voice or touch ; <b>stuporous</b> - very difficult to arouse and keep aroused for the interview;<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>comatose</b> - could not be aroused");
		panel_11_2.add(aInattentionLabel_1_1);

		final JxPanel panel_11_3 = new JxPanel();
		panel_11_3.setTheme(theme);
		final FlowLayout flowLayout_28 = new FlowLayout();
		flowLayout_28.setAlignment(FlowLayout.LEFT);
		flowLayout_28.setHgap(30);
		panel_11_3.setLayout(flowLayout_28);
		panel_11_3.setOpaque(false);
		panel_11_3.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_11_3.setBounds(234, 174, 606, 46);
		panel_6.add(panel_11_3);

		final JxLabel aInattentionLabel_1_2 = new JxLabel();
		aInattentionLabel_1_2.setTheme(theme);
		aInattentionLabel_1_2
				.setText("<html><b>D.</b> &nbsp<b> Psycomotor Retardation -</b> Did the resident have an unusaually decreased level of activity such as <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;sluggishness , starting into space , staying in one position, moving very slowly");
		panel_11_3.add(aInattentionLabel_1_2);
		doUpdate();

	}

	public static void main(String ar[]) {
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
		PanelC1300 panel = new PanelC1300();
		scroller.setViewportView(panel);
		JFrame frm = new JFrame("Frame");
		frm.setSize(new Dimension(java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize()));
		frm.add(scroller);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setState(JFrame.MAXIMIZED_BOTH);
		frm.setVisible(true);

		// SwingUtils.openInDialogforJxPanel().setVisible(true);
	}

	public void doSave() {
		Mds3SectionC sectionC = (Mds3SectionC) Mds3Controller.getInstance()
				.getSection(Mds3SectionC.class);
		Object obj1 = cmbC1300A.getSelectedItem();
		if (obj1 != null) {
			sectionC.setC1300A(cmbC1300A.getSelectedItem().toString());
		} else {
			sectionC.setC1300A("");
		}
		Object obj2 = cmbC1300B.getSelectedItem();
		if (obj2 != null) {
			sectionC.setC1300B(cmbC1300B.getSelectedItem().toString());
		} else {
			sectionC.setC1300B("");
		}
		Object obj3 = cmbC1300C.getSelectedItem();
		if (obj3 != null) {
			sectionC.setC1300C(cmbC1300C.getSelectedItem().toString());
		} else {
			sectionC.setC1300C("");
		}
		Object obj4 = cmbC1300D.getSelectedItem();
		if (obj4 != null) {
			sectionC.setC1300D(cmbC1300D.getSelectedItem().toString());
		} else {
			sectionC.setC1300D("");
		}
	}

	public void doUpdate() {
		Mds3SectionC mds3sectionC = (Mds3SectionC) Mds3Controller.getInstance()
				.getSection(Mds3SectionC.class);
		cmbC1300A.setSelectedItem(mds3sectionC.getC1300A());
		cmbC1300B.setSelectedItem(mds3sectionC.getC1300B());
		cmbC1300C.setSelectedItem(mds3sectionC.getC1300C());
		cmbC1300D.setSelectedItem(mds3sectionC.getC1300D());
	}

}
