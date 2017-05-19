package medrex.client.MedicationAndTreatment.RoutineTreatment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;
import medrex.commons.intf.PopUpView;

import com.sX.swing.JxButton;
import com.sX.swing.widgets.PanelFaceScale;

public class PanelTreatmentPainAssessment extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6061563613744073263L;
	private JPanel scale;
	private JComboBox cmbScale;
	public static Color selectedColor = new Color(194, 194, 194);
	private int score = 0;
	private JTextArea txtComment;
	private JButton btnEnter;
	private JPanel panel;
	private JSlider slider;
	private JPanel sliderPanel;
	private JComponent faceScale;
	private JLabel lblPainAssessment;

	public PanelTreatmentPainAssessment() {
		super();
		setBorder(new LineBorder(Color.black, 1, false));
		// setPreferredSize(new Dimension(1000, 700));
		setBackground(Color.WHITE);
		final BorderLayout borderLayout = new BorderLayout();
		setLayout(borderLayout);
		setSize(Toolkit.getDefaultToolkit().getScreenSize().width - 5, Toolkit
				.getDefaultToolkit().getScreenSize().height - 15);

		panel = new JPanel();
		panel.setPreferredSize(new Dimension(0, 200));
		add(panel, BorderLayout.NORTH);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		add(panel);

		cmbScale = new JComboBox();
		cmbScale.setFont(new Font("Dialog", Font.BOLD, 14));
		cmbScale.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (cmbScale.getSelectedItem().toString().equalsIgnoreCase(
						"FACE")) {
					dochangeScale("FACE");
				}
				if (cmbScale.getSelectedItem().toString().equalsIgnoreCase(
						"NUMERICAL")) {
					dochangeScale("NUMERICAL");
				}

			}
		});
		cmbScale.setForeground(ColorConstants.DEF_COLOR);
		cmbScale.setModel(new DefaultComboBoxModel(new String[] { "", "FACE",
				"NUMERICAL" }));

		cmbScale.setBackground(Color.WHITE);
		cmbScale.setBounds(22, 17, 149, 25);
		panel.add(cmbScale);

		lblPainAssessment = new JLabel();
		lblPainAssessment.setForeground(ColorConstants.DEF_COLOR);
		lblPainAssessment.setText("PAIN SCALE VALUE :");
		lblPainAssessment.setFont(new Font("Dialog", Font.BOLD, 16));
		lblPainAssessment.setBounds(22, 127, 246, 25);
		panel.add(lblPainAssessment);

		JPanel panelTemp = new JPanel();
		panelTemp.setBackground(Color.WHITE);
		panelTemp.setPreferredSize(new Dimension(0, 500));
		panelTemp.setLayout(new BorderLayout());
		add(panelTemp, BorderLayout.SOUTH);

		final JLabel Jlabel = new JLabel();
		Jlabel.setFont(new Font("", Font.BOLD, 17));
		Jlabel.setForeground(ColorConstants.DEF_COLOR);
		Jlabel.setPreferredSize(new Dimension(0, 50));
		Jlabel.setHorizontalAlignment(SwingConstants.CENTER);
		panelTemp.add(Jlabel, BorderLayout.NORTH);
		Jlabel.setText("COMMENT");
		Jlabel.setBackground(Color.WHITE);

		final JTextArea txtComment = new JTextArea();
		txtComment.setForeground(Color.BLACK);
		txtComment.setPreferredSize(new Dimension(600, 300));
		txtComment.setBackground(Color.WHITE);
		txtComment.setBorder(new LineBorder(Color.BLACK, 1));

		JPanel panelTextArea = new JPanel();
		panelTextArea.setBackground(Color.WHITE);
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setVgap(20);
		flowLayout.setHgap(500);
		panelTextArea.setForeground(ColorConstants.DEF_COLOR);
		panelTextArea.setLayout(flowLayout);
		panelTextArea.setPreferredSize(new Dimension(400, 100));
		panelTextArea.add(txtComment);

		panelTemp.add(panelTextArea);

		final JxButton btnEnter = new JxButton();
		btnEnter.addActionListener(new ActionListener() {

			public void actionPerformed(final ActionEvent arg0) {
				setScore(PanelTreatmentPainAssessment.this.score);
				close();
			}
		});
		btnEnter.setText("ENTER");
		btnEnter.setArc(0.4f);
		btnEnter.setForeground(ColorConstants.DEF_COLOR);
		btnEnter.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEnter.setBackground(Color.WHITE);
		btnEnter.setPreferredSize(new Dimension(150, 30));
		panelTextArea.add(btnEnter);
		createUIforScale("FACE");
		// createUIforScale("NUMERICAL");

	}

	protected void dochangeScale(String scaleType) {
		if ("FACE".equalsIgnoreCase(scaleType)) {
			// System.out.println("count is:"+panel.getComponentCount());
			panel.remove(2);
			createUIforScale("FACE");
			repaint();

		}
		if ("NUMERICAL".equalsIgnoreCase(scaleType)) {
			// System.out.println("count is:"+panel.getComponentCount());
			panel.remove(2);
			createUIforScale("NUMERICAL");
			repaint();
		}

	}

	private void createUIforScale(String scaleType) {
		if ("FACE".equalsIgnoreCase(scaleType)) {
			System.out.println("creating FACE GUI");
			faceScale = new JPanel();
			faceScale.setLayout(new BorderLayout());
			// faceScale.setBorder(new LineBorder(Color.black, 1, false));
			faceScale.setBackground(Color.WHITE);
			faceScale.setBounds(318, 17, 732, 197);
			this.panel.add(faceScale);

			final JPanel panel_2 = new JPanel();
			panel_2.setBackground(Color.WHITE);
			panel_2.setPreferredSize(new Dimension(0, 30));
			faceScale.add(panel_2, BorderLayout.NORTH);

			final JLabel wongBakerLabel = new JLabel();
			panel_2.add(wongBakerLabel);
			wongBakerLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
			wongBakerLabel.setHorizontalAlignment(SwingConstants.CENTER);
			wongBakerLabel.setText("Wong - Baker FACES Pain Rating Scale");

			scale = new JPanel();
			scale.setBackground(Color.WHITE);
			scale.setLayout(new GridLayout(0, 6));
			faceScale.add(scale, BorderLayout.CENTER);

			final JLabel smiley1 = new JLabel(new ImageIcon(
					"img//widgets//smiley1.png"));
			scale.add(smiley1);
			smiley1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(final MouseEvent e) {
					if (e.getClickCount() == 2) {
						doSave(0);
					}
				}
			});
			smiley1.setText("");

			final JLabel smiley2 = new JLabel(new ImageIcon(
					"img//widgets//smiley2.png"));
			scale.add(smiley2);
			smiley2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(final MouseEvent e) {
					if (e.getClickCount() == 2) {
						doSave(2);
					}
				}
			});
			smiley2.setText("");

			final JLabel smiley3 = new JLabel(new ImageIcon(
					"img//widgets//smiley3.png"));
			scale.add(smiley3);
			smiley3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(final MouseEvent e) {
					if (e.getClickCount() == 2) {
						doSave(4);
					}
				}
			});
			smiley3.setText("");

			final JLabel smiley4 = new JLabel(new ImageIcon(
					"img//widgets//smiley4.png"));
			scale.add(smiley4);
			smiley4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(final MouseEvent e) {
					if (e.getClickCount() == 2) {
						doSave(6);
					}
				}
			});
			smiley4.setText("");

			final JLabel smiley5 = new JLabel(new ImageIcon(
					"img//widgets//smiley5.png"));
			scale.add(smiley5);
			smiley5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(final MouseEvent e) {
					if (e.getClickCount() == 2) {
						doSave(8);
					}
				}
			});
			smiley5.setText("");

			final JLabel smiley6 = new JLabel(new ImageIcon(
					"img//widgets//smiley6.png"));
			scale.add(smiley6);
			smiley6.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(final MouseEvent e) {
					if (e.getClickCount() == 2) {
						doSave(10);
					}
				}
			});
			smiley6.setText("");

			final JLabel noHurtLabel = new JLabel();
			scale.add(noHurtLabel);
			noHurtLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
			noHurtLabel.setHorizontalAlignment(SwingConstants.CENTER);
			noHurtLabel.setHorizontalTextPosition(SwingConstants.LEADING);
			noHurtLabel.setText("<Html><body><center>0<br>No Hurt");

			final JLabel hurtsLabel = new JLabel();
			scale.add(hurtsLabel);
			hurtsLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
			hurtsLabel.setHorizontalAlignment(SwingConstants.CENTER);
			hurtsLabel
					.setText("<html><Body><center>2<br>Hurts Little<br> Bit</body></html>");

			final JLabel hurtsLittleMoreLabel = new JLabel();
			scale.add(hurtsLittleMoreLabel);
			hurtsLittleMoreLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
			hurtsLittleMoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
			hurtsLittleMoreLabel
					.setText("<html><body><center>4<br>Hurts Little <br>More</body></html>");

			final JLabel hurtsEvenMoreLabel = new JLabel();
			scale.add(hurtsEvenMoreLabel);
			hurtsEvenMoreLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
			hurtsEvenMoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
			hurtsEvenMoreLabel
					.setText("<html><body><center>6<br>Hurts Even <br>More");

			final JLabel hurtsWholeLotLabel = new JLabel();
			scale.add(hurtsWholeLotLabel);
			hurtsWholeLotLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
			hurtsWholeLotLabel.setHorizontalAlignment(SwingConstants.CENTER);
			hurtsWholeLotLabel
					.setText("<html><body><center>8<br>Hurts Whole <br>Lot");

			final JLabel hurtsWorstLabel = new JLabel();
			scale.add(hurtsWorstLabel);
			hurtsWorstLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
			hurtsWorstLabel.setHorizontalAlignment(SwingConstants.CENTER);
			hurtsWorstLabel.setText("<html><body><center>10<br>Hurts Worst");
			this.panel.setVisible(true);
		}
		if ("NUMERICAL".equalsIgnoreCase(scaleType)) {
			// System.out.println("count is:"+panel.getComponentCount());
			System.out.println("creating Numerical GUI");
			sliderPanel = new JPanel();
			sliderPanel.setBackground(Color.WHITE);
			sliderPanel.setLayout(new BorderLayout());
			sliderPanel.setPreferredSize(new Dimension(200, 300));
			sliderPanel.setBounds(318, 17, 732, 197);
			// sliderPanel.setBackground(Color.BLACK);

			JLabel Northlabel = new JLabel("0-10 Numeric Pain Intensity Scale");
			Northlabel.setHorizontalAlignment(SwingConstants.CENTER);
			Northlabel.setFont(new Font("Dialog", Font.BOLD, 18));
			Northlabel.setBackground(Color.WHITE);
			Northlabel.setOpaque(false);
			sliderPanel.add(Northlabel, BorderLayout.NORTH);

			JLabel l1 = new JLabel("<html><body><center>No <br>Pain");
			l1.setFont(new Font("Dialog", Font.BOLD, 15));
			l1.setPreferredSize(new Dimension(80, 20));

			JLabel l2 = new JLabel("<html><body><center>Moderate <br>Pain");
			l2.setFont(new Font("Dialog", Font.BOLD, 15));
			l2.setHorizontalAlignment(FlowLayout.LEFT);

			JLabel l3 = new JLabel(
					"<html><body><center>Worst Possible <br>Pain");
			l3.setFont(new Font("Dialog", Font.BOLD, 15));

			JPanel panelWest = new JPanel();
			panelWest.setPreferredSize(new Dimension(20, 100));
			panelWest.setOpaque(false);
			sliderPanel.add(panelWest, BorderLayout.WEST);

			JPanel panelEast = new JPanel();
			panelEast.setPreferredSize(new Dimension(20, 100));
			panelEast.setOpaque(false);
			sliderPanel.add(panelEast, BorderLayout.EAST);

			JPanel panelSouth = new JPanel();
			panelSouth.setLayout(new BorderLayout(0, 20));
			panelSouth.add(l1, BorderLayout.WEST);
			panelSouth.add(l2, BorderLayout.CENTER);
			panelSouth.add(l3, BorderLayout.EAST);
			panelSouth.setOpaque(false);

			sliderPanel.add(panelSouth, BorderLayout.SOUTH);

			slider = new JSlider();
			slider.setPreferredSize(new Dimension(450, 100));
			slider.setMaximum(10);
			slider.setMinimum(0);
			slider.setValue(0);
			slider.setPaintTrack(true);
			slider.setPaintTicks(true);
			slider.setPaintLabels(true);
			slider.setMinorTickSpacing(1);
			slider.setMajorTickSpacing(1);
			slider.setOpaque(false);
			sliderPanel.add(slider);

			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					PanelTreatmentPainAssessment.this.lblPainAssessment
							.setText(slider.getValue() + "");
					if (slider.getValue() != -1) {
						setScore(slider.getValue());
						lblPainAssessment.setText("PAIN SCALE VALUE : "
								+ slider.getValue());
					}
				}
			});
			this.panel.add(sliderPanel);
			this.panel.updateUI();
		}

	}

	protected void doSave(int painValue) {

		setScore(painValue);
		lblPainAssessment.setText("PAIN SCALE VALUE : "
				+ Integer.toString(painValue));
		// close();

	}

	public static void main(String[] args) {
		SwingUtils.wrapInDialog(new PanelTreatmentPainAssessment()).setVisible(
				true);

	}

	public static Color getSelectedColor() {
		return selectedColor;
	}

	public static void setSelectedColor(Color selectedColor) {
		PanelFaceScale.selectedColor = selectedColor;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String getTitle() {

		return "Face Scale - Wong";
	}
}
