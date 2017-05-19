package medrex.client.MedicationAndTreatment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import medrex.client.constants.Global;
import medrex.client.loading.FrameMedrexMessage;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;

import com.sX.awt.Direction;
import com.sX.swing.JxPanel;
import com.sX.swing.JxToggleButton;

/**
 * @author Mayank chandela This class is Used to toggle between the choice of
 *         medication and PRN.
 */
public class PanelMedicationDashBoard extends JxPanel {

	private JPanel panelFloors;
	private JPanel panelNextCancel;
	private JPanel panelRoutinePrn;
	private JPanel panelMedicationTreatment;
	private JPanel panelWings;
	private JxToggleButton btnTreatment;
	private JxToggleButton btnNext;
	private JPanel panelSecFloor;
	private JPanel panelFirstFloor;
	private JxToggleButton btnMedication;
	private JxToggleButton btnSecondFloor;
	private JxToggleButton btnSecondWing;
	private JxToggleButton btnFirstWing;
	private JxToggleButton btnFirstFloor;
	// private ButtonGroup bgMedicationTreatmentSecondFloor = new ButtonGroup();
	// private ButtonGroup bgMedicationTreatmentFirstFloor = new ButtonGroup();
	// private ButtonGroup bgFirstSecondWingSecondFloor = new ButtonGroup();
	// private ButtonGroup bgFirstSecondWingFirstFloor = new ButtonGroup();

	// button group

	private ButtonGroup bgFloor = new ButtonGroup();
	private ButtonGroup bgWing = new ButtonGroup();
	private ButtonGroup bgMedicationtreatment = new ButtonGroup();
	private ButtonGroup bgRoutinePrn = new ButtonGroup();

	private static final long serialVersionUID = 1L;
	private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private int width = (int) screenSize.getWidth();
	private int height = (int) screenSize.getHeight();

	private static final Border BORDER = new LineBorder(
			new Color(122, 154, 167), 2, false);
	private static final Color BACKGROUND = new Color(206, 221, 224, 250);
	private static final Color FOREGROUND = new Color(0, 69, 97);
	private static final Font FONT = new Font("Dialog", Font.BOLD, 13)
			.deriveFont(13.5f);
	FrameMedicationDesktop parentFrame = null;
	private JxToggleButton btnCancelMedication;
	private JxToggleButton btnCancel;

	public PanelMedicationDashBoard(
			FrameMedicationDesktop frameMedicationDesktop) {
		setBackground(Color.WHITE);
		this.parentFrame = frameMedicationDesktop;
		setBounds(0, 0, 700, 685);
		setArc(0f);
		setLinearGradient(ColorConstants.GradientBright, new Color(148, 178,
				188), Direction.BOTTOM_TO_TOP);

		final JPanel panel = new JPanel();
		panel.setOpaque(false);
		add(panel);

		final JLabel medicationcartLabel = new JLabel();
		medicationcartLabel.setFont(new Font("Arial", Font.BOLD, 26));
		medicationcartLabel.setText("Medication And Treatment Cart");
		panel.add(medicationcartLabel);

		panelFloors = new JPanel();
		final GridLayout gridLayout = new GridLayout(1, 0);
		gridLayout.setVgap(50);
		gridLayout.setHgap(100);
		panelFloors.setLayout(gridLayout);
		panelFloors.setPreferredSize(new Dimension(800, 100));
		panelFloors.setOpaque(false);

		add(panelFloors);
		panelFirstFloor = new JPanel();
		final BorderLayout borderLayout = new BorderLayout();
		panelFirstFloor.setLayout(borderLayout);
		panelFirstFloor.setPreferredSize(new Dimension(400, 50));
		panelFirstFloor.setOpaque(false);
		panelFloors.add(panelFirstFloor);
		// panel_6.setLinearGradient(ColorConstants.GradientBright, new
		// Color(148,178,188),Direction.LEFT_TO_RIGHT);

		final JxPanel panel_8 = new JxPanel();
		panelFirstFloor.add(panel_8);
		panel_8.setArc(1f);
		panel_8.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 2));
		panel_8.setBackground(Color.WHITE);
		panel_8.setLayout(new BorderLayout());

		btnFirstFloor = new JxToggleButton("");
		bgFloor.add(btnFirstFloor);
		btnFirstFloor.setActionCommand("1");
		btnFirstFloor.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				if (bgFloor.getSelection() != null) {
					showWingPanel();
				}
			}
		});
		btnFirstFloor.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		btnFirstFloor.setFont(FONT);
		btnFirstFloor.setBorderPainted(false);
		btnFirstFloor.setArc(0.6f);
		btnFirstFloor.setBorder(BORDER);
		btnFirstFloor.setBackground(BACKGROUND);
		btnFirstFloor.setForeground(FOREGROUND);
		btnFirstFloor.setRolloverEnabled(true);
		btnFirstFloor.setHorizontalAlignment(SwingConstants.CENTER);
		btnFirstFloor.setText("First Floor");
		panel_8.add(btnFirstFloor);

		panelSecFloor = new JPanel();
		panelSecFloor.setLayout(new GridLayout(1, 0));
		panelSecFloor.setPreferredSize(new Dimension(800, 50));
		panelSecFloor.setOpaque(false);
		panelFloors.add(panelSecFloor);
		// panel_6_1.setLinearGradient(ColorConstants.GradientBright, new
		// Color(148,178,188),Direction.LEFT_TO_RIGHT);

		final JxPanel panel_8_1 = new JxPanel();
		panelSecFloor.add(panel_8_1);
		panel_8_1.setArc(1f);
		panel_8_1.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 2));
		panel_8_1.setBackground(Color.WHITE);
		panel_8_1.setLayout(new BorderLayout());

		btnSecondFloor = new JxToggleButton("");
		btnSecondFloor.setActionCommand("2");
		btnSecondFloor.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				showWingPanel();
			}
		});
		btnSecondFloor.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		bgFloor.add(btnSecondFloor);
		btnSecondFloor.setFont(FONT);
		btnSecondFloor.setBorderPainted(false);
		btnSecondFloor.setArc(0.6f);
		btnSecondFloor.setBorder(BORDER);
		btnSecondFloor.setBackground(BACKGROUND);
		btnSecondFloor.setForeground(FOREGROUND);
		btnSecondFloor.setRolloverEnabled(true);
		btnSecondFloor.setHorizontalAlignment(SwingConstants.CENTER);
		btnSecondFloor.setText("Second Floor");
		panel_8_1.add(btnSecondFloor);

		final FlowLayout flowLayout_1 = new FlowLayout();
		flowLayout_1.setVgap(5);

		final JLabel medicationLabel = new JLabel();
		medicationLabel.setForeground(FOREGROUND);
		medicationLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		medicationLabel
				.setText("<html><body><center>Routine Medication<br> And <br>Treatment");
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setVgap(20);

		panelWings = new JPanel();
		final GridLayout gridLayout_1 = new GridLayout(1, 0);
		gridLayout_1.setVgap(50);
		gridLayout_1.setHgap(100);
		panelWings.setLayout(gridLayout_1);
		panelWings.setOpaque(false);
		panelWings.setBackground(Color.WHITE);
		panelWings.setPreferredSize(new Dimension(800, 100));
		add(panelWings);

		final JxPanel panel_9 = new JxPanel();
		panelWings.add(panel_9);
		panel_9.setArc(1f);
		panel_9.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 2));
		panel_9.setBackground(Color.WHITE);
		panel_9.setLayout(new BorderLayout());

		btnFirstWing = new JxToggleButton();
		bgWing.add(btnFirstWing);
		btnFirstWing.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				showMedicationTreatment();
			}
		});
		btnFirstWing.setActionCommand("1");
		btnFirstWing.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		btnFirstWing.setFont(FONT);
		btnFirstWing.setBorderPainted(false);
		btnFirstWing.setArc(0.6f);
		btnFirstWing.setBorder(BORDER);
		btnFirstWing.setBackground(BACKGROUND);
		btnFirstWing.setForeground(FOREGROUND);
		btnFirstWing.setRolloverEnabled(true);
		btnFirstWing.setHorizontalAlignment(SwingConstants.CENTER);
		btnFirstWing.setText("First Wing");
		panel_9.add(btnFirstWing);

		final JxPanel panel_9_1 = new JxPanel();
		panelWings.add(panel_9_1);
		panel_9_1.setArc(1f);
		panel_9_1.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 2));
		panel_9_1.setBackground(Color.WHITE);
		panel_9_1.setLayout(new BorderLayout());

		btnSecondWing = new JxToggleButton();
		bgWing.add(btnSecondWing);
		btnSecondWing.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				showMedicationTreatment();
			}
		});
		btnSecondWing.setActionCommand("2");
		btnSecondWing.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		btnSecondWing.setFont(FONT);
		btnSecondWing.setBorderPainted(false);
		btnSecondWing.setArc(0.6f);
		btnSecondWing.setBorder(BORDER);
		btnSecondWing.setBackground(BACKGROUND);
		btnSecondWing.setForeground(FOREGROUND);
		btnSecondWing.setRolloverEnabled(true);
		btnSecondWing.setHorizontalAlignment(SwingConstants.CENTER);
		btnSecondWing.setText("Second Wing");
		panel_9_1.add(btnSecondWing);

		// -------------------------------- Medication
		// /PRN-----------------------------------------------------------

		panelMedicationTreatment = new JPanel();
		panelMedicationTreatment.setPreferredSize(new Dimension(800, 100));
		final GridLayout gridLayout_2 = new GridLayout(1, 0);
		gridLayout_2.setVgap(50);
		gridLayout_2.setHgap(100);
		panelMedicationTreatment.setLayout(gridLayout_2);
		panelMedicationTreatment.setOpaque(false);
		add(panelMedicationTreatment);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setLayout(new BorderLayout());
		panel_2.setPreferredSize(new Dimension(250, 70));
		panel_2.setArc(1f);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 2));
		panelMedicationTreatment.add(panel_2);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setLayout(new BorderLayout());
		panel_5.setPreferredSize(new Dimension(250, 70));
		panel_5.setBackground(Color.WHITE);
		panel_5.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 2));
		panel_5.setArc(1f);
		panelMedicationTreatment.add(panel_5);

		btnMedication = new JxToggleButton("Medication");
		btnMedication.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				showRoutinePrn();
			}
		});
		btnMedication.setActionCommand("1");
		btnMedication.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		btnMedication.setLayout(flowLayout_1);
		btnMedication.setFont(FONT);
		btnMedication.setBorderPainted(false);
		btnMedication.setArc(0.6f);
		btnMedication.setBorder(BORDER);
		btnMedication.setBackground(BACKGROUND);
		btnMedication.setForeground(FOREGROUND);
		btnMedication.setRolloverEnabled(true);
		btnMedication.setHorizontalAlignment(SwingConstants.CENTER);
		bgMedicationtreatment.add(btnMedication);
		btnMedication.setPreferredSize(new Dimension(250, 70));
		panel_2.add(btnMedication);

		btnTreatment = new JxToggleButton();
		btnTreatment.setText("Treatment");
		btnTreatment.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				showRoutinePrn();
			}
		});
		btnTreatment.setActionCommand("2");
		btnTreatment.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		btnTreatment.setLayout(flowLayout_2);
		bgMedicationtreatment.add(btnTreatment);
		btnTreatment.setFont(FONT);
		btnTreatment.setBorderPainted(false);
		btnTreatment.setArc(0.6f);
		btnTreatment.setBorder(BORDER);
		btnTreatment.setBackground(BACKGROUND);
		btnTreatment.setForeground(FOREGROUND);
		btnTreatment.setRolloverEnabled(true);
		btnTreatment.setHorizontalAlignment(SwingConstants.CENTER);
		btnTreatment.setPreferredSize(new Dimension(200, 70));
		panel_5.add(btnTreatment);

		// --------------------------------Routine / PRN
		// ---------------------------------------------------

		panelRoutinePrn = new JPanel();
		panelRoutinePrn.setPreferredSize(new Dimension(800, 100));
		final GridLayout gridLayout5 = new GridLayout(1, 0);
		gridLayout5.setVgap(50);
		gridLayout5.setHgap(100);
		panelRoutinePrn.setLayout(gridLayout5);
		panelRoutinePrn.setOpaque(false);
		add(panelRoutinePrn);

		final JxPanel panelRoutine = new JxPanel();
		panelRoutine.setLayout(new BorderLayout());
		panelRoutine.setPreferredSize(new Dimension(250, 70));
		panelRoutine.setArc(1f);
		panelRoutine.setBackground(Color.WHITE);
		panelRoutine.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 2));
		panelRoutinePrn.add(panelRoutine);

		final JxPanel panelPrn = new JxPanel();
		panelPrn.setLayout(new BorderLayout());
		panelPrn.setPreferredSize(new Dimension(250, 70));
		panelPrn.setBackground(Color.WHITE);
		panelPrn.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 2));
		panelPrn.setArc(1f);
		panelRoutinePrn.add(panelPrn);

		JxToggleButton btnRoutine = new JxToggleButton();
		bgRoutinePrn.add(btnRoutine);
		btnRoutine.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				showNextCancel();
			}
		});
		btnRoutine.setActionCommand("1");
		btnRoutine.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		btnRoutine.setLayout(flowLayout_1);
		btnRoutine.setFont(FONT);
		btnRoutine.setBorderPainted(false);
		btnRoutine.setArc(0.6f);
		btnRoutine.setBorder(BORDER);
		btnRoutine.setBackground(BACKGROUND);
		btnRoutine.setForeground(FOREGROUND);
		btnRoutine.setRolloverEnabled(true);
		btnRoutine.setHorizontalAlignment(SwingConstants.CENTER);
		btnRoutine.setPreferredSize(new Dimension(250, 70));
		btnRoutine.setText("Routine");
		panelRoutine.add(btnRoutine);

		final JLabel prnLabel = new JLabel();
		prnLabel.setForeground(FOREGROUND);
		prnLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		prnLabel.setText("PRN");

		JxToggleButton btnPrn = new JxToggleButton();
		bgRoutinePrn.add(btnPrn);
		btnPrn.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				showNextCancel();
			}
		});
		btnPrn.setActionCommand("2");
		btnPrn.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		btnPrn.setLayout(flowLayout_2);
		btnPrn.setFont(FONT);
		btnPrn.setBorderPainted(false);
		btnPrn.setArc(0.6f);
		btnPrn.setBorder(BORDER);
		btnPrn.setBackground(BACKGROUND);
		btnPrn.setForeground(FOREGROUND);
		btnPrn.setRolloverEnabled(true);
		btnPrn.setHorizontalAlignment(SwingConstants.CENTER);
		btnPrn.setPreferredSize(new Dimension(200, 70));
		btnPrn.add(prnLabel);
		panelPrn.add(btnPrn);

		// --------------------------------Next / Cancel
		// ---------------------------------------------------

		panelNextCancel = new JPanel();
		final GridLayout gridLayout_3 = new GridLayout(1, 0);
		gridLayout_3.setVgap(50);
		gridLayout_3.setHgap(100);
		panelNextCancel.setLayout(gridLayout_3);
		panelNextCancel.setOpaque(false);
		panelNextCancel.setPreferredSize(new Dimension(800, 100));
		panelNextCancel.setBackground(Color.WHITE);
		add(panelNextCancel);
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setVgap(20);
		flowLayout.setHgap(100);
		setLayout(flowLayout);

		final JxPanel panelNext = new JxPanel();
		panelNext.setLayout(new BorderLayout());
		panelNext.setPreferredSize(new Dimension(400, 70));
		panelNext.setArc(1f);
		panelNext.setBackground(Color.WHITE);
		panelNext.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 2));
		panelNextCancel.add(panelNext);

		final JxPanel panelCancel = new JxPanel();
		panelCancel.setLayout(new BorderLayout());
		panelCancel.setPreferredSize(new Dimension(400, 70));
		panelCancel.setArc(1f);
		panelCancel.setBackground(Color.WHITE);
		panelCancel.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 2));
		panelNextCancel.add(panelCancel);

		btnNext = new JxToggleButton();
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				/*
				 * if ( (bgMedicationtreatment.isSelected(null))){
				 * showMessageDialog("SELECT MEDICATION OR PRN"); return; } if
				 * ((
				 * bgMedicationtreatment.getSelection().getActionCommand()=="1"
				 * ||
				 * bgMedicationtreatment.getSelection().getActionCommand()=="2")
				 * && (bgFloor.isSelected(null))){
				 * showMessageDialog("PLEASE SELECT FLOOR FIRST"); return; }
				 * if((bgFloor.getSelection().getActionCommand()=="1" ||
				 * bgFloor.getSelection().getActionCommand()=="2") &&(
				 * (bgFirstSecondWingFirstFloor.isSelected(null)) &&
				 * (bgFirstSecondWingSecondFloor.isSelected(null)))){
				 * showMessageDialog("PLEASE SELECT WING FIRST"); return; }
				 * if((bgFirstSecondWingFirstFloor.getSelection()!= null)
				 * &&(bgFirstSecondWingFirstFloor
				 * .getSelection().getActionCommand()=="1" ||
				 * bgFirstSecondWingFirstFloor
				 * .getSelection().getActionCommand()=="2") &&
				 * (bgMedicationTreatmentFirstFloor.isSelected(null))){
				 * showMessageDialog("PLEASE SELECT MEDICATION OR TREATMENT");
				 * return; } if((bgFirstSecondWingSecondFloor.getSelection()!=
				 * null) &&
				 * (bgFirstSecondWingSecondFloor.getSelection().getActionCommand
				 * ()=="1" ||
				 * bgFirstSecondWingSecondFloor.getSelection().getActionCommand
				 * ()=="2") &&
				 * (bgMedicationTreatmentSecondFloor.isSelected(null))){
				 * showMessageDialog("PLEASE SELECT MEDICATION OR TREATMENT");
				 * return; } else{
				 */
				if (bgFloor.getSelection() != null
						&& bgWing.getSelection() != null) {
					String floorType = "";
					if (bgFloor.getSelection().getActionCommand() == "1"
							&& bgWing.getSelection().getActionCommand() == "1") {
						floorType = "1st Floor South Wing";
					}
					if (bgFloor.getSelection().getActionCommand() == "1"
							&& bgWing.getSelection().getActionCommand() == "2") {
						floorType = "Main North Wing";
					}
					if (bgFloor.getSelection().getActionCommand() == "2"
							&& bgWing.getSelection().getActionCommand() == "2") {
						floorType = "2nd Floor South Wing";
					}
					if (bgFloor.getSelection().getActionCommand() == "2"
							&& bgWing.getSelection().getActionCommand() == "1") {
						floorType = "Main And North Wing";
					}
					System.out.println(floorType);

					// here floor type is finalized

					// now checking if its medication or treatment

					if (bgMedicationtreatment.getSelection() != null
							&& bgMedicationtreatment.getSelection()
									.getActionCommand() == "1") {
						parentFrame.setFloorType(floorType);
						if (bgMedicationtreatment.getSelection() != null
								&& bgMedicationtreatment.getSelection()
										.getActionCommand() == "1") {

							if (bgRoutinePrn.getSelection().getActionCommand() == "1") {
								parentFrame.setCurrentIndex(2);
							} else {
								parentFrame.setCurrentIndex(5);
							}
						}
						// treatment
						if (bgMedicationtreatment.getSelection() != null
								&& bgMedicationtreatment.getSelection()
										.getActionCommand() == "2") {
							parentFrame.setCurrentIndex(7);
						}
						parentFrame.reDrawTheFrame();
					} else {
						// for PRN Resident Screen

						parentFrame.setFloorType(floorType);
						parentFrame.setCurrentIndex(5);
						parentFrame.reDrawTheFrame();
					}
				}
			}
		});
		btnNext.setPreferredSize(new Dimension(200, 50));
		btnNext.setForeground(ColorConstants.DEF_COLOR);
		btnNext.setFont(new Font("", Font.BOLD, 14));
		btnNext.setText("Next");
		btnNext.setFont(FONT);
		btnNext.setBorderPainted(false);
		btnNext.setBorder(BORDER);
		btnNext.setBackground(Color.WHITE);
		btnNext.setRolloverEnabled(true);
		panelNext.add(btnNext);

		btnCancel = new JxToggleButton();
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.frameMedicationDashboard.dispose();
			}
		});
		btnCancel.setPreferredSize(new Dimension(200, 50));
		btnCancel.setForeground(ColorConstants.DEF_COLOR);
		btnCancel.setFont(new Font("", Font.BOLD, 14));
		btnCancel.setText("Cancel");
		btnCancel.setFont(FONT);
		btnCancel.setBorderPainted(false);
		btnCancel.setBorder(BORDER);
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setRolloverEnabled(true);
		panelCancel.add(btnCancel);

		setAllPanelInvisible();

	}

	protected void showWingPanel() {
		panelFloors.setVisible(true);
		panelWings.setVisible(true);
		panelMedicationTreatment.setVisible(false);
		panelRoutinePrn.setVisible(false);
		panelNextCancel.setVisible(false);

		bgWing.clearSelection();
		bgMedicationtreatment.clearSelection();
		bgRoutinePrn.clearSelection();

	}

	protected void showMedicationTreatment() {
		panelFloors.setVisible(true);
		panelWings.setVisible(true);
		panelMedicationTreatment.setVisible(true);
		panelRoutinePrn.setVisible(false);
		panelNextCancel.setVisible(false);

		bgMedicationtreatment.clearSelection();
		bgRoutinePrn.clearSelection();
	}

	protected void showRoutinePrn() {
		panelFloors.setVisible(true);
		panelWings.setVisible(true);
		panelMedicationTreatment.setVisible(true);
		panelRoutinePrn.setVisible(true);
		panelNextCancel.setVisible(false);

		bgRoutinePrn.clearSelection();
	}

	protected void showNextCancel() {
		panelFloors.setVisible(true);
		panelWings.setVisible(true);
		panelMedicationTreatment.setVisible(true);
		panelRoutinePrn.setVisible(true);
		panelNextCancel.setVisible(true);
	}

	private void setAllPanelInvisible() {
		panelFloors.setVisible(true);
		panelWings.setVisible(false);
		panelMedicationTreatment.setVisible(false);
		panelRoutinePrn.setVisible(false);
		panelNextCancel.setVisible(false);

	}

	public static void main(String ar[]) {
		JFrame frm = new JFrame("Medication Dash Board");
		frm.getContentPane().add(new PanelMedicationDashBoard(null));
		frm.setSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}

	protected void showMessageDialog(String message) {
		try {
			FrameMedrexMessage dialog = new FrameMedrexMessage(message);
			dialog.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			SwingUtils.center(dialog);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
