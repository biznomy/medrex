package medrex.client.test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import java.awt.geom.RoundRectangle2D.Double;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import medrex.commons.enums.GuiModes;

import com.blogofbug.swing.components.ImageLabel;
import com.sX.swing.JxComponent;

public class ImageSlider extends JxComponent implements ThumbnailListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1161268390197739370L;

	private JPanel sliderPanel;

	public List<Object[]> dataList;

	private JScrollPane scrollableArea;
	private int scrollAmount;

	private Timer timer;

	private boolean animationOn;
	private boolean negativePositive;
	// private int enlargeSize;
	private int normalSize;

	private JButton btnRight;

	private JButton btnLeft;

	private Double shape;

	private Border $__border;

	private int orientation;

	private JPanel midPanel;

	private final static ImageIcon ICO_UP;
	private final static ImageIcon ICO_DOWN;
	private final static ImageIcon ICO_LEFT;
	private final static ImageIcon ICO_RIGHT;

	static {
		ICO_UP = new ImageIcon("img/icons/up.png");
		ICO_DOWN = new ImageIcon("img/icons/down.png");
		ICO_LEFT = new ImageIcon("img/icons/left.png");
		ICO_RIGHT = new ImageIcon("img/icons/right.png");
	}

	// private GridLayout sliderLayout;

	public ImageSlider() {
		super();
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(600, 211));

		super.setArc(1.f);
		normalSize = 64;
		scrollAmount = normalSize + 4;

		// final JPanel panel = new JPanel();
		// panel.setPreferredSize(new Dimension(0, 211));
		// panel.setLayout(new BorderLayout());
		// add(panel, BorderLayout.CENTER);

		scrollableArea = new JScrollPane();
		scrollableArea
				.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollableArea
				.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollableArea.setOpaque(false);
		scrollableArea.getViewport().setOpaque(false);
		scrollableArea.setBorder(new EmptyBorder(0, 0, 0, 0));
		add(scrollableArea, BorderLayout.CENTER);

		btnRight = new JButton();
		btnRight.setMargin(new Insets(0, 0, 0, 0));
		btnRight.setText("");
		btnRight.setFocusPainted(false);
		// btnRight.setArc(super.getArc());
		btnRight.setPreferredSize(new Dimension(21, 0));
		btnRight.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(final MouseEvent e) {
				negativePositive = true;
				doAnimate(true);
			}

			@Override
			public void mouseReleased(final MouseEvent e) {
				negativePositive = true;
				doSlide();
				doAnimate(false);
			}
		});

		add(btnRight, BorderLayout.EAST);

		btnLeft = new JButton();
		btnLeft.setMargin(new Insets(0, 0, 0, 0));
		btnLeft.setText("");
		btnLeft.setFocusPainted(false);
		// btnLeft.setArc(super.getArc());
		btnLeft.setPreferredSize(new Dimension(21, 0));
		btnLeft.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(final MouseEvent e) {
				negativePositive = false;
				doAnimate(true);
			}

			@Override
			public void mouseReleased(final MouseEvent e) {
				negativePositive = false;
				doSlide();
				doAnimate(false);
			}
		});
		add(btnLeft, BorderLayout.WEST);

		dataList = new ArrayList<Object[]>();

		midPanel = new JPanel();
		midPanel.setOpaque(false);
		midPanel.setLayout(null);
		scrollableArea.setViewportView(midPanel);

		sliderPanel = new JPanel();
		sliderPanel.setBounds(0, 0, 200, 200);
		sliderPanel.setAutoscrolls(true);
		sliderPanel.setOpaque(false);
		sliderPanel.setLayout(new FlowLayout(SwingConstants.LEFT, 10, 10));
		// sliderLayout = new GridLayout(1, 0);
		// sliderPanel.setLayout(sliderLayout);
		// scrollableArea.setViewportView(sliderPanel);
		midPanel.add(sliderPanel);

		timer = new Timer(100, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doSlide();
			}
		});
		timer.setInitialDelay(0);
		timer.setRepeats(true);

		// addThumbnailListener(this);

		setBackground(this.getBackground());
		setForeground(this.getForeground());
		setArc(this.getArc());

		setOrientation(SwingConstants.HORIZONTAL);
	}

	@Override
	public void paintComponent(Graphics g) {
		setOpaque(false);

		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setColor(getBackground());

		shape = new RoundRectangle2D.Double(0, 0, getWidth() - 1,
				getHeight() - 1, getArc() * getScale(), getArc() * getScale());
		g2.fill(shape);

		int margin = (int) (getArc() * getScale() / 4);
		super.setBorder(new CompoundBorder($__border, new EmptyBorder(margin,
				margin, margin, margin)));
		// g2.clip(shape);
		super.paintComponent(g);
	}

	// protected void drawBorder(Graphics2D g2) {
	// // draw the border
	// g2.setColor(getBorderColor());
	// g2.setStroke(new BasicStroke(getBorderWidth()));
	// g2.draw(shape);
	// }

	@Override
	public void setBorder(Border border) {
		super.setBorder(null);
		this.$__border = border;
	}

	private void doAnimate(boolean onOff) {
		if (!animationOn && onOff) {
			timer.start();
			animationOn = true;
		}
		// else {
		if (animationOn && !onOff) {
			timer.stop();
			animationOn = false;
		}
	}

	private void doSlide() {
		boolean leftOrRight = negativePositive;
		int val = 0;
		if (orientation == SwingConstants.HORIZONTAL) {
			val = scrollableArea.getHorizontalScrollBar().getValue();
		} else {
			val = scrollableArea.getVerticalScrollBar().getValue();
		}
		// right
		if (leftOrRight) {
			val += scrollAmount;
		} // left
		else {
			val -= scrollAmount;
		}

		if (orientation == SwingConstants.HORIZONTAL) {
			scrollableArea.getHorizontalScrollBar().setValue(val);
		} else {
			scrollableArea.getVerticalScrollBar().setValue(val);
		}
	}

	public void insertElement(BufferedImage image, String label) {
		final int index = dataList.size();
		Object[] valArr = new Object[2];
		valArr[0] = image;
		valArr[1] = label;

		final JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setLayout(new BorderLayout(5, 5));

		final JLabel txtLabel = new JLabel();
		txtLabel.setText(label);
		txtLabel.setForeground(this.getForeground());
		txtLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(txtLabel, BorderLayout.SOUTH);

		ImageLabel com = new ImageLabel(new ImageIcon(image), normalSize,
				normalSize);
		com.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				fireThumbnailClicked(index, e);
			}

			@Override
			public void mouseEntered(final MouseEvent e) {
				fireThumbnailMouseOver(index, e);
			}

			@Override
			public void mouseExited(final MouseEvent e) {
				fireThumbnailMouseOut(index, e);
			}

		});
		com.setBorder(new LineBorder(this.getForeground(), 1, false));
		dataList.add(valArr);

		panel.add(com, BorderLayout.CENTER);

		sliderPanel.add(panel);
		reSize();
	}

	public void removeAllElements() {
		dataList.clear();
		sliderPanel.removeAll();
		reSize();
	}

	private void reSize() {
		int n = dataList.size();
		int factor = (orientation == SwingConstants.HORIZONTAL) ? this
				.getHeight() : this.getWidth();
		factor = 10;
		int normalS = (orientation == SwingConstants.HORIZONTAL) ? this
				.getHeight()
				- factor : this.getWidth() - factor;
		int wOrH = (normalS + factor) * n;
		int dec = (n - 1) * factor;
		Dimension panSize = (orientation == SwingConstants.HORIZONTAL) ? new Dimension(
				wOrH - dec, normalS)
				: new Dimension(normalS, wOrH - dec);
		// Dimension panSliderSize = (orientation == SwingConstants.HORIZONTAL)
		// ? new Dimension(wOrH, normalS) : new Dimension(normalS, wOrH);
		Dimension butSize = (orientation == SwingConstants.HORIZONTAL) ? new Dimension(
				26, 0)
				: new Dimension(0, 26);
		Dimension itemSize = new Dimension(normalS - factor, normalS - factor);

		// System.out.println("nodes:" + n);
		// System.out.println("normalS:" + normalS);
		// System.out.println("wOrH:" + wOrH);
		// System.out.println("panSliderSize:" + + panSliderSize.width + ", " +
		// panSliderSize.height);
		// System.out.println("panSize:" + panSize.width + ", " +
		// panSize.height);
		midPanel.setPreferredSize(panSize);
		midPanel.setSize(panSize);
		sliderPanel.setPreferredSize(panSize);
		sliderPanel.setSize(panSize);
		btnRight.setPreferredSize(butSize);
		btnLeft.setPreferredSize(butSize);
		midPanel.setLocation(0, 0);

		normalSize = normalS;

		// sliderPanel.setBorder(new LineBorder(Color.GREEN));
		// midPanel.setBorder(new LineBorder(Color.RED));

		// if(orientation == SwingConstants.HORIZONTAL) {
		// midPanel.setPreferredSize(new Dimension((normalSize + 30)* n,
		// this.getHeight() - 16));
		// midPanel.setSize(new Dimension((normalSize + 30)* n, this.getHeight()
		// - 16));
		// sliderPanel.setPreferredSize(new Dimension((normalSize + 30)* n,
		// normalSize + 20));
		// sliderPanel.setSize(new Dimension((normalSize + 30)* n, normalSize +
		// 20));
		// // itemSize = new Dimension(this.getHeight() - 6, this.getHeight() -
		// 16);
		//
		// int normalSize = 0;
		// normalSize = (this.normalSize > this.getHeight()) ? this.getHeight()
		// : this.normalSize;
		// normalSize -= 26;
		//
		// itemSize = new Dimension(normalSize, normalSize + 20);
		// butSize = new Dimension(26, 0);
		// btnRight.setPreferredSize(butSize);
		// btnLeft.setPreferredSize(butSize);
		// } else {
		// midPanel.setPreferredSize(new Dimension(this.getWidth() - 16,
		// (normalSize +30)* n));
		// midPanel.setSize(new Dimension((normalSize + 30)* n, this.getHeight()
		// - 16));
		// sliderPanel.setPreferredSize(new Dimension(normalSize + 20,
		// (normalSize + 30)* n));
		// sliderPanel.setSize(new Dimension(normalSize + 20, (normalSize + 30)*
		// n));
		// // itemSize = new Dimension(this.getWidth() - 16, this.getWidth() -
		// 6);
		//
		// int normalSize = 0;
		// normalSize = (this.normalSize > this.getWidth()) ? this.getWidth() :
		// this.normalSize;
		// normalSize -= 26;
		// itemSize = new Dimension(normalSize, normalSize + 20);
		// butSize = new Dimension(0, 26);
		// btnRight.setPreferredSize(butSize);
		// btnLeft.setPreferredSize(butSize);
		// }

		Component[] com = sliderPanel.getComponents();
		for (int i = 0; i < com.length; i++) {
			JComponent item = (JComponent) com[i];
			item.setPreferredSize(itemSize);
		}
	}

	// event handler
	public void addThumbnailListener(ThumbnailListener l) {
		listenerList.add(ThumbnailListener.class, l);
	}

	protected void fireThumbnailClicked(int index, MouseEvent e) {
		ThumbnailListener[] listeners = this
				.getListeners(ThumbnailListener.class);
		for (int i = 0; i < listeners.length; i++) {
			if (e.getClickCount() == 1) {
				listeners[i].thumbnailClicked(index, e);
			}
			if (e.getClickCount() == 2) {
				listeners[i].thumbnailDoubleClicked(index, e);
			}
		}
	}

	protected void fireThumbnailMouseOver(int index, MouseEvent e) {
		ThumbnailListener[] listeners = this
				.getListeners(ThumbnailListener.class);
		for (int i = 0; i < listeners.length; i++) {
			listeners[i].thumbnailMouseOver(index, e);
		}
	}

	protected void fireThumbnailMouseOut(int index, MouseEvent e) {
		ThumbnailListener[] listeners = this
				.getListeners(ThumbnailListener.class);
		for (int i = 0; i < listeners.length; i++) {
			listeners[i].thumbnailMouseOut(index, e);
		}
	}

	public void thumbnailClicked(int index, MouseEvent e) {
		System.out.println("Clicked:" + index);
	}

	public void thumbnailDoubleClicked(int index, MouseEvent e) {
		System.out.println("DblClicked:" + index);
	}

	public void thumbnailMouseOver(int index, MouseEvent e) {
		System.out.println("Over:" + index);
	}

	public void thumbnailMouseOut(int index, MouseEvent e) {
		System.out.println("Out:" + index);
	}

	//
	@Override
	public void setBackground(Color bg) {
		super.setBackground(bg);

		if (bg != null) {
			if (btnLeft != null) {
				btnLeft.setBackground(bg);
				btnLeft.setBorder(new LineBorder(bg.darker(), 1, false));
			}
			if (btnRight != null) {
				btnRight.setBackground(bg);
				btnRight.setBorder(new LineBorder(bg.darker(), 1, false));
			}
		}
		if (sliderPanel != null) {
			sliderPanel.setBackground(bg);
		}
		if (scrollableArea != null) {
			scrollableArea.setBackground(bg);
		}
	}

	@Override
	public void setArc(float arc) {
		super.setArc(arc);

		if (btnLeft != null) {
			// btnLeft.setArc(arc / 2);
		}
		if (btnRight != null) {
			// btnRight.setArc(arc / 2);
		}
	}

	@Override
	public void setForeground(Color fg) {
		super.setForeground(fg);

		if (btnLeft != null) {
			btnLeft.setForeground(fg);
		}
		if (btnRight != null) {
			btnRight.setForeground(fg);
		}
		if (sliderPanel != null) {
			sliderPanel.setForeground(fg);
		}
		if (scrollableArea != null) {
			scrollableArea.setForeground(fg);
		}
	}

	public int getScrollAmount() {
		return scrollAmount;
	}

	public void setScrollAmount(int scrollAmount) {
		this.scrollAmount = scrollAmount;
	}

	// public int getEnlargeSize() {
	// return enlargeSize;
	// }
	//
	// public void setEnlargeSize(int enlargeSize) {
	// this.enlargeSize = enlargeSize;
	// sliderPanel.setEnlargedSize(enlargeSize);
	// }

	public int getNormalSize() {
		return normalSize;
	}

	public void setNormalSize(int normalSize) {
		this.normalSize = normalSize;
		// sliderPanel.setNormalSize(normalSize);
		this.reSize();
	}

	/**
	 * @param orientation
	 *            the orientation to set
	 */
	public void setOrientation(int orientation) {
		this.orientation = orientation;
		remove(btnRight);
		remove(btnLeft);
		if (orientation == SwingConstants.HORIZONTAL) {
			this.add(btnRight, BorderLayout.EAST);
			this.add(btnLeft, BorderLayout.WEST);
			btnLeft.setIcon(ICO_LEFT);
			btnRight.setIcon(ICO_RIGHT);
			// sliderLayout.setRows(1);
			// sliderLayout.setColumns(0);
		} else {
			this.add(btnRight, BorderLayout.SOUTH);
			this.add(btnLeft, BorderLayout.NORTH);
			btnLeft.setIcon(ICO_UP);
			btnRight.setIcon(ICO_DOWN);
			// sliderLayout.setColumns(1);
			// sliderLayout.setRows(0);
		}
		reSize();
		// sliderPanel.setLayout(sliderLayout);
		sliderPanel.updateUI();
	}

	/**
	 * @return the orientation
	 */
	public int getOrientation() {
		return orientation;
	}

	public static void main(String[] args) {

		String[] imgPath = new String[] { "PainMgtRecord.png",
				"NurseTreatmentNotes.png", "NurseMedicationNotes.png",
				"MedicationAdmn.png", "MedicationPRN.png",
				"MedicationRoutine.png", "TreatmentPRN.png",
				"TreatmentRoutine.png", "PressureSoreRecord.png" };

		String[] formName = new String[] { "Pain Management Record",
				"Nurse Treatment Notes", "Nurse Medication Notes",
				"Medication Adminisration Record", "Medication PRN Record",
				"Medication Routine Record", "Treatment PRN Record",
				"Treatment Routine Record", "Pressure Sore Record" };

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(1024, 1000);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setOpaque(false);
		panel.setLayout(null);
		frame.getContentPane().add(panel, BorderLayout.CENTER);

		// final JxPanel panel_3 = new JxPanel();
		// panel_3.setLayout(null);
		// panel_3.setBounds(10, 10, 673, 407);
		// panel_3.setBackground(GuiModes.DESIGNER_SCREEN.getDefaultBackgroundColor());
		// panel.add(panel_3);

		final ImageSlider thumbComp2 = new ImageSlider();
		thumbComp2.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		thumbComp2.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		thumbComp2.setOrientation(SwingConstants.VERTICAL);
		thumbComp2.setBounds(10, 10, 200, 600);
		// thumbComp2.setBounds(10, 10, 680, 144);
		thumbComp2.setArc(1.f);
		// thumbComp2.setEnlargeSize(350);
		// thumbComp2.setNormalSize(300);
		panel.add(thumbComp2);

		for (int i = 0; i < imgPath.length; i++) {
			BufferedImage img = new BufferedImage(100, 100,
					BufferedImage.TYPE_INT_RGB);
			try {
				img = ImageIO.read(new File("img/formThumbnails/Medication/"
						+ imgPath[i]));
				thumbComp2.insertElement(img, formName[i]);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		frame.setVisible(true);
	}
}