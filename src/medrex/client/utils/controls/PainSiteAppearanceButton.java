/**
 * 
 */
package medrex.client.utils.controls;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.jgoodies.looks.plastic.Plastic3DLookAndFeel;
import com.sX.utils.SwingUtils;

/**
 * @author D S Naruka
 * 
 */
public class PainSiteAppearanceButton extends JComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5381813528088050773L;
	private JPanel panelChart;
	private JPopupMenu popup;
	private JPanel popupPanel;
	private JSlider sliderPink;
	private JSlider sliderRed;
	private JSlider sliderBrown;
	private JSlider sliderEschar;
	private JSlider sliderSlough;

	private JLabel lblPink;
	private JLabel lblRed;
	final JLabel lblTotal = new JLabel();
	private JLabel lblBrown;
	private JLabel lblEschar;
	private JLabel lblSlough;
	private JSlider lastExceptionSlider;
	private JButton okButton;

	/* Pink Red Brown Eschar Slough Total */
	private static final Color[] bgColors = { Color.PINK, Color.RED,
			Color.DARK_GRAY, Color.BLUE, Color.GREEN, Color.WHITE };
	private static final Color[] fgColors = { Color.BLACK, Color.WHITE,
			Color.WHITE, Color.WHITE, Color.BLACK, Color.WHITE };
	private static final String[] txt = { "P", "R", "B", "E", "S", "" };

	/**
	 * 
	 */
	public PainSiteAppearanceButton() {
		popup = new JPopupMenu();
		popupPanel = new JPanel();
		popupPanel.setBackground(Color.WHITE);
		popupPanel.setSize(292, 340);
		popupPanel.setLocation(0, 0);
		popupPanel.setLayout(null);
		popupPanel.setPreferredSize(popupPanel.getSize());

		this.setLayout(null);
		// add(popupPanel);
		popup.add(popupPanel);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(10, 57, 270, 41);
		popupPanel.add(panel);

		final JLabel pinkLabel = new JLabel();
		pinkLabel.setBounds(51, 0, 46, 41);
		panel.add(pinkLabel);
		pinkLabel.setText("Pink");

		lblPink = new JLabel();
		lblPink.setBounds(103, 0, 41, 41);
		panel.add(lblPink);
		lblPink.setText("(20%)");

		sliderPink = new JSlider();
		sliderPink.setBackground(Color.WHITE);
		// sliderPink.setE
		sliderPink.setBounds(150, 0, 120, 41);
		panel.add(sliderPink);
		sliderPink.setInverted(false);
		sliderPink.setOrientation(SwingConstants.HORIZONTAL);
		sliderPink.setPaintTrack(true);
		sliderPink.setPaintTicks(true);
		sliderPink.setPaintLabels(true);
		sliderPink.setMinorTickSpacing(5);
		sliderPink.setMajorTickSpacing(25);
		sliderPink.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				manageTotalExcept(sliderPink);
			}
		});

		final JPanel panel_3 = new JPanel();
		panel_3.setBackground(bgColors[0]);
		panel_3.setLayout(null);
		panel_3.setBounds(10, 10, 21, 21);
		panel.add(panel_3);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(10, 104, 270, 41);
		popupPanel.add(panel_1);

		final JLabel redLabel = new JLabel();
		redLabel.setBounds(51, 0, 46, 41);
		panel_1.add(redLabel);
		redLabel.setText("Red");

		lblRed = new JLabel();
		lblRed.setText("(20%)");
		lblRed.setBounds(103, 0, 41, 41);
		panel_1.add(lblRed);

		sliderRed = new JSlider();
		sliderRed.setBackground(Color.WHITE);
		sliderRed.setBounds(150, 0, 120, 41);
		panel_1.add(sliderRed);
		sliderRed.setPaintTicks(true);
		sliderRed.setPaintLabels(true);
		sliderRed.setMinorTickSpacing(5);
		sliderRed.setMajorTickSpacing(25);
		sliderRed.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				manageTotalExcept(sliderRed);
			}
		});

		final JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(bgColors[1]);
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(10, 10, 21, 21);
		panel_1.add(panel_3_1);

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(10, 151, 270, 41);
		popupPanel.add(panel_2);

		final JLabel brownLabel = new JLabel();
		brownLabel.setBounds(51, 0, 46, 41);
		panel_2.add(brownLabel);
		brownLabel.setText("Brown");

		lblBrown = new JLabel();
		lblBrown.setText("(20%)");
		lblBrown.setBounds(103, 0, 41, 41);
		panel_2.add(lblBrown);

		sliderBrown = new JSlider();
		sliderBrown.setBackground(Color.WHITE);
		sliderBrown.setBounds(150, 0, 120, 41);
		panel_2.add(sliderBrown);
		sliderBrown.setPaintLabels(true);
		sliderBrown.setMajorTickSpacing(25);
		sliderBrown.setMinorTickSpacing(5);
		sliderBrown.setPaintTrack(true);
		sliderBrown.setPaintTicks(true);
		sliderBrown.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				manageTotalExcept(sliderBrown);
			}
		});

		final JPanel panel_3_2 = new JPanel();
		panel_3_2.setBackground(bgColors[2]);
		panel_3_2.setLayout(null);
		panel_3_2.setBounds(10, 10, 21, 21);
		panel_2.add(panel_3_2);

		final JPanel panelEschar = new JPanel();
		panelEschar.setBackground(Color.WHITE);
		panelEschar.setLayout(null);
		panelEschar.setBounds(10, 198, 270, 41);
		popupPanel.add(panelEschar);

		final JLabel escharLabel = new JLabel();
		escharLabel.setBounds(51, 0, 46, 41);
		panelEschar.add(escharLabel);
		escharLabel.setText("Eschar");

		lblEschar = new JLabel();
		lblEschar.setText("(20%)");
		lblEschar.setBounds(103, 0, 41, 41);
		panelEschar.add(lblEschar);

		sliderEschar = new JSlider();
		sliderEschar.setBackground(Color.WHITE);
		sliderEschar.setBounds(150, 0, 120, 41);
		panelEschar.add(sliderEschar);
		sliderEschar.setMinorTickSpacing(5);
		sliderEschar.setMajorTickSpacing(25);
		sliderEschar.setPaintLabels(true);
		sliderEschar.setPaintTicks(true);
		sliderEschar.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				manageTotalExcept(sliderEschar);
			}
		});

		final JPanel panel_3_3 = new JPanel();
		panel_3_3.setBackground(bgColors[3]);
		panel_3_3.setLayout(null);
		panel_3_3.setBounds(10, 10, 21, 21);
		panelEschar.add(panel_3_3);

		final JPanel panelSlough = new JPanel();
		panelSlough.setBackground(Color.WHITE);
		panelSlough.setLayout(null);
		panelSlough.setBounds(10, 245, 270, 41);
		popupPanel.add(panelSlough);

		final JLabel sloughLabel = new JLabel();
		sloughLabel.setBounds(51, 0, 46, 41);
		panelSlough.add(sloughLabel);
		sloughLabel.setText("Slough");

		lblSlough = new JLabel();
		lblSlough.setText("(20%)");
		lblSlough.setBounds(103, 0, 41, 41);
		panelSlough.add(lblSlough);

		sliderSlough = new JSlider();
		sliderSlough.setBackground(Color.WHITE);
		sliderSlough.setBounds(150, 0, 120, 41);
		panelSlough.add(sliderSlough);
		sliderSlough.setPaintLabels(true);
		sliderSlough.setPaintTicks(true);
		sliderSlough.setMinorTickSpacing(5);
		sliderSlough.setMajorTickSpacing(25);
		sliderSlough.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				manageTotalExcept(sliderSlough);
			}
		});

		final JPanel panel_3_4 = new JPanel();
		panel_3_4.setBackground(bgColors[4]);
		panel_3_4.setLayout(null);
		panel_3_4.setBounds(10, 10, 21, 21);
		panelSlough.add(panel_3_4);

		final JPanel panelTotal = new JPanel();
		panelTotal.setBackground(Color.WHITE);
		panelTotal.setLayout(null);
		panelTotal.setBounds(10, 292, 270, 41);
		popupPanel.add(panelTotal);

		final JLabel totalLabel = new JLabel();
		totalLabel.setText("Total");
		totalLabel.setBounds(51, 0, 46, 41);
		panelTotal.add(totalLabel);

		// lblTotal = new JLabel();
		lblTotal.setText("(100%)");
		lblTotal.setBounds(103, 0, 41, 41);
		panelTotal.add(lblTotal);

		okButton = new JButton();
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isValidate();
			}
		});
		okButton.setText("OK");
		okButton.setBounds(185, 10, 75, 21);
		panelTotal.add(okButton);

		final JPanel panel_3_5 = new JPanel();
		panel_3_5.setBackground(bgColors[5]);
		panel_3_5.setLayout(null);
		panel_3_5.setBounds(10, 10, 21, 21);
		panelTotal.add(panel_3_5);

		panelChart = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = -1043635384502893060L;

			@Override
			public void paint(Graphics g) {
				super.setOpaque(false);
				super.paint(g);
				drawChart(g, 1, 1, this.getWidth() - 2, this.getHeight() - 2);
			}
		};
		panelChart.setLayout(null);
		panelChart.setBorder(new LineBorder(Color.BLACK, 1, false));
		panelChart.setBounds(10, 10, 270, 41);
		popupPanel.add(panelChart);

		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				togglePopup();
			}
		});

		resetValues();
		setBackground(Color.WHITE);
	}

	private void resetValues() {
		sliderPink.setValue(0);
		sliderRed.setValue(0);
		sliderBrown.setValue(0);
		sliderEschar.setValue(0);
		sliderSlough.setValue(0);
	}

	private void isValidate() {
		int total = sliderPink.getValue() + sliderRed.getValue()
				+ sliderBrown.getValue() + sliderEschar.getValue()
				+ sliderSlough.getValue();
		if (total != 100) {
			JOptionPane.showMessageDialog(popup,
					"Total Appearance must be 100 %");
			popup.setVisible(true);
		} else {
			popup.setVisible(false);
		}
	}

	private void manageTotalExcept(JSlider exception) {
		lastExceptionSlider = exception;

		int totalOfRest = 0;

		for (JSlider slider : new JSlider[] { sliderPink, sliderRed,
				sliderBrown, sliderEschar, sliderSlough }) {
			if (exception != slider) {
				totalOfRest += slider.getValue();
			}
		}

		int extent = 100 - totalOfRest;
		if (exception.getExtent() > 0 && lastExceptionSlider != exception) {
			exception.setExtent(0);
		}
		if (exception.getValue() > extent) {
			exception.setValue(extent);
			exception.updateUI();
		}
		if (exception.getExtent() != extent && exception.getExtent() != 0) {
			exception.setExtent(extent);
		}

		int total = totalOfRest + exception.getValue();

		lblPink.setText("(" + sliderPink.getValue() + "%)");
		lblRed.setText("(" + sliderRed.getValue() + "%)");
		lblBrown.setText("(" + sliderBrown.getValue() + "%)");
		lblEschar.setText("(" + sliderEschar.getValue() + "%)");
		lblSlough.setText("(" + sliderSlough.getValue() + "%)");
		lblTotal.setText("(" + total + "%)");
		this.repaint();
		panelChart.repaint();
	}

	private void togglePopup() {
		if (popup != null && this.isEnabled()) {
			if (popup.isShowing()) {
				popup.setVisible(false);
			} else {
				this.remove(popup);
				this.add(popup);
				popup.show(this, 0, this.getHeight());
			}
		}
	}

	@Override
	public void paint(Graphics g) {
		super.setOpaque(false);
		super.paint(g);
		drawChart(g, 1, 1, this.getWidth() - 2, this.getHeight() - 2);
	}

	private void drawChart(Graphics g, int x, int y, int totalW, int totalH) {
		Graphics2D g2 = (Graphics2D) g;

		int[] values = { sliderPink.getValue(), sliderRed.getValue(),
				sliderBrown.getValue(), sliderEschar.getValue(),
				sliderSlough.getValue() };

		g2.setColor(bgColors[5]);
		g2.fill(new Rectangle2D.Float(x, y, totalW, totalH));

		double w = 0, h = totalH;
		for (int i = 0; i < values.length; i++) {
			int value = values[i];
			double width = ((value * totalW) / 100);
			Color bg = bgColors[i];
			Color fg = fgColors[i];
			String text = txt[i];

			g2.setColor(bg);
			g2.fill(new Rectangle2D.Double(w + x, y, width, h));

			float fw = g2.getFontMetrics().stringWidth(text);
			float fh = g2.getFontMetrics().getAscent();

			float textx = (float) (width - fw) / 2;
			float texty = (float) (h / 2) + (fh / 2);

			if (fw < width) {
				g2.setColor(fg);
				g2.drawString(text, (float) (w + textx) + x, texty + y);
			}

			w += width;
		}
	}

	public int getPinkValue() {
		return sliderPink.getValue();
	}

	public void setPinkValue(int pinkValue) {
		sliderPink.setValue(pinkValue);
	}

	public int getRedValue() {
		return sliderRed.getValue();
	}

	public void setRedValue(int redValue) {
		sliderRed.setValue(redValue);
	}

	public int getBrownValue() {
		return sliderBrown.getValue();
	}

	public void setBrownValue(int brownValue) {
		sliderBrown.setValue(brownValue);
	}

	public int getEscharValue() {
		return sliderEschar.getValue();
	}

	public void setEscharValue(int escharValue) {
		sliderEschar.setValue(escharValue);
	}

	public int getSloughValue() {
		return sliderSlough.getValue();
	}

	public void setSloughValue(int sloughValue) {
		sliderSlough.setValue(sloughValue);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(new Plastic3DLookAndFeel());
		} catch (Exception e) {
			e.printStackTrace();
		}

		JPanel panel = new JPanel();
		panel.setSize(600, 600);
		panel.setPreferredSize(panel.getSize());
		panel.setLayout(null);

		PainSiteAppearanceButton btn = new PainSiteAppearanceButton();
		btn.setSize(38, 23);
		btn.setBorder(new LineBorder(Color.RED, 1, false));
		btn.setLocation(150, 150);
		panel.add(btn);

		JFrame frame = SwingUtils.wrapInFrame(panel);
		frame.setVisible(true);
	}

}
