package medrex.client.utils.controls;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import medrex.client.PanelImage;

import com.sX.swing.JxPanel;

public class MedicationResidentList extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2967322933001411762L;
	private PanelImage downButton;
	private PanelImage upButton;
	private JList list_1;
	private JScrollPane scrollPane_1;
	private MedicationResidentList scrListPanel;
	private int fixedCellHeight;
	private int fixedCellMargin;
	private final ListCellRenderer cellRenderer = new JxListCellRenderer();
	private Object[] items;
	public JLabel cellLabelpreviousSlot;

	public class JxListCellRenderer implements ListCellRenderer {

		protected boolean on;

		public Component getListCellRendererComponent(JList list,
				final Object value, int index, final boolean isSelected,
				final boolean cellHasFocus) {

			final JxPanel cell = new JxPanel() {
				/**
				 * 
				 */
				private static final long serialVersionUID = 8917522463383232226L;

				@Override
				public void paint(Graphics g) {
					super.paint(g);
					setOpaque(false);
					Graphics2D g2 = (Graphics2D) g;
					g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
							RenderingHints.VALUE_ANTIALIAS_ON);

					GradientPaint bg = null;
					if (isSelected) {
						bg = new GradientPaint(new Point(0, 0), this
								.getForeground().brighter(), new Point(0, this
								.getHeight()), this.getForeground().darker());
					} else {
						bg = new GradientPaint(new Point(0, 0), this
								.getBackground().brighter(), new Point(0, this
								.getHeight()), this.getBackground().darker());
					}
					g2.setPaint(bg);
					g2.fill(this.getShape());
					this.drawBorder(g2);
					super.paintChildren(g);
				}
			};
			cell.setLayout(null);
			cell.setForeground(list.getForeground());
			cell.setBackground(list.getBackground());
			cell.setBorder(new LineBorder(list.getForeground(), 1, false));
			cell.setSize(list.getWidth(), list.getFixedCellHeight()
					- getFixedCellMargin());
			cell.setLocation(0, 0);
			cell.setArc(0.6f);

			JPanel renderer = new JPanel();
			renderer.setLayout(null);
			renderer.setBorder(new EmptyBorder(0, 0, 0, getFixedCellMargin()));
			renderer.setSize(list.getWidth(), list.getFixedCellHeight());
			renderer.setOpaque(false);
			renderer.add(cell);

			JLabel cellLabelLeft = new JLabel();
			cellLabelLeft.setBorder(new EmptyBorder(0, 10, 0, 10));
			cellLabelLeft.setFont(list.getFont());
			cellLabelLeft.setSize(list.getWidth() / 2
					- (int) (cell.getArc() * 10) - getFixedCellMargin(), list
					.getFixedCellHeight()
					- getFixedCellMargin() - (int) (cell.getArc() * 10));
			cellLabelLeft.setLocation((int) (cell.getArc() * 10 / 2),
					(int) (cell.getArc() * 10 / 2));
			cell.add(cellLabelLeft);

			if (isSelected) {
				cellLabelLeft.setForeground(list.getBackground());
				cellLabelLeft.setBackground(list.getForeground());
			} else {
				cellLabelLeft.setForeground(list.getForeground());
				cellLabelLeft.setBackground(list.getBackground());
			}
			cellLabelLeft.setText(getLeftValue(value));

			JLabel cellLabelRight = new JLabel();
			cellLabelRight.setHorizontalAlignment(SwingConstants.RIGHT);
			cellLabelRight.setBorder(new EmptyBorder(0, 10, 0, 10));
			cellLabelRight.setFont(list.getFont());
			cellLabelRight.setSize(list.getWidth() / 2
					- (int) (cell.getArc() * 10) - getFixedCellMargin(), list
					.getFixedCellHeight()
					- getFixedCellMargin() - (int) (cell.getArc() * 10));
			cellLabelRight.setLocation(cellLabelRight.getWidth()
					+ getFixedCellMargin(), (int) (cell.getArc() * 10 / 2));
			cell.add(cellLabelRight);

			if (isSelected) {
				cellLabelRight.setForeground(list.getBackground());
				cellLabelRight.setBackground(list.getForeground());
			} else {
				cellLabelRight.setForeground(list.getForeground());
				cellLabelRight.setBackground(list.getBackground());
			}
			cellLabelRight.setText(getRightValue(value));

			JLabel cellLabelCenter = new JLabel();
			cellLabelCenter.setHorizontalAlignment(SwingConstants.RIGHT);
			cellLabelCenter.setBorder(new EmptyBorder(0, 10, 0, 10));
			cellLabelCenter.setFont(list.getFont());
			cellLabelCenter.setSize(list.getWidth() / 2
					- (int) (cell.getArc() * 10) - getFixedCellMargin(), list
					.getFixedCellHeight()
					- getFixedCellMargin() - (int) (cell.getArc() * 10));
			cellLabelCenter.setLocation(cellLabelLeft.getLocation().x + 40,
					cellLabelLeft.getLocation().y);
			cell.add(cellLabelCenter);

			if (isSelected) {
				cellLabelCenter.setForeground(list.getBackground());
				cellLabelCenter.setBackground(list.getForeground());
			} else {
				cellLabelCenter.setForeground(list.getForeground());
				cellLabelCenter.setBackground(list.getBackground());
			}
			cellLabelCenter.setText(getCenterValue(value));

			cellLabelpreviousSlot = new JLabel();

			/*
			 * Timer timer2 = new Timer(101000,new ActionListener(){ public void
			 * actionPerformed(ActionEvent e) {
			 * 
			 * cellLabelpreviousSlot.setText(getPreviousSlotValue(value)); } })
			 * ; timer2.setRepeats(true); timer2.setCoalesce(true);
			 * timer2.start();
			 */

			cellLabelpreviousSlot.setHorizontalAlignment(SwingConstants.RIGHT);
			cellLabelpreviousSlot.setBorder(new EmptyBorder(0, 10, 0, 10));
			cellLabelpreviousSlot.setFont(list.getFont());
			cellLabelpreviousSlot.setSize(list.getWidth() / 4
					- (int) (cell.getArc() * 10) - getFixedCellMargin(), list
					.getFixedCellHeight()
					- getFixedCellMargin() - (int) (cell.getArc() * 10));
			cellLabelpreviousSlot.setLocation(cellLabelCenter.getLocation().x
					+ cellLabelCenter.getWidth() - 40, cellLabelCenter
					.getLocation().y);
			/*
			 * Timer timer = new Timer(1000,new ActionListener(){ public void
			 * actionPerformed(ActionEvent e) { SwingUtilities.invokeLater(new
			 * Runnable(){
			 * 
			 * 
			 * public void run() {
			 * 
			 * doBlink(); }
			 * 
			 * private void doBlink() {
			 * 
			 * if(on){ System.out.println("action Done");
			 * cellLabelpreviousSlot.setText(""); repaint(); updateUI();
			 * cellLabelpreviousSlot.repaint();
			 * cellLabelpreviousSlot.updateUI(); // } else{
			 * cellLabelpreviousSlot.setText(getPreviousSlotValue(value));
			 * repaint(); updateUI(); cellLabelpreviousSlot.repaint();
			 * cellLabelpreviousSlot.updateUI(); } on = !on;
			 * 
			 * }
			 * 
			 * }); } }) ; timer.setRepeats(true); timer.setCoalesce(true);
			 * timer.start();
			 */
			cell.add(cellLabelpreviousSlot);
			cellLabelpreviousSlot.setText(getPreviousSlotValue(value));
			// new Flasher(cellLabelpreviousSlot);

			if (isSelected) {
				cellLabelpreviousSlot.setForeground(list.getBackground());
				cellLabelpreviousSlot.setBackground(list.getForeground());
			} else {
				cellLabelpreviousSlot.setForeground(list.getForeground());
				cellLabelpreviousSlot.setBackground(list.getBackground());
			}
			// cellLabelpreviousSlot.setText(getPreviousSlotValue(value));

			return renderer;
		}

		protected void doSetText() {
			// TODO Auto-generated method stub

		}

		protected void doSetTextBlank() {
			// TODO Auto-generated method stub

		}

		protected String getLeftValue(Object value) {
			return value.toString();
		}

		protected String getRightValue(Object value) {
			return value.toString();
		}

		protected String getCenterValue(Object value) {
			return value.toString();
		}

		protected String getPreviousSlotValue(Object value) {
			return value.toString();
		}
	}

	public MedicationResidentList() {
		super();
		setOpaque(false);
		scrListPanel = this;
		setLayout(null);
		upButton = new PanelImage();
		upButton.setArc(0.6f);
		upButton.setCurvedView(true);
		upButton.setOpaque(false);
		upButton.setBackgroundImage("img/dashboard/c_upButton.png");
		upButton.setBounds(744, 0, 56, 56);
		downButton = new PanelImage();
		downButton.setArc(0.6f);
		downButton.setCurvedView(true);
		downButton.setOpaque(false);
		downButton.setBackgroundImage("img/dashboard/c_downButton.png");
		downButton.setBounds(744, 194, 56, 56);

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane_1.setOpaque(false);
		scrollPane_1.getViewport().setOpaque(false);
		scrollPane_1.setBounds(0, 0, 738, 250);

		list_1 = new JList();
		list_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		list_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (e.getClickCount() == 2) {
					scrListPanel.firePropertyChange("ListDoubleClicked",
							new Integer(list_1.getSelectedIndex()), list_1
									.getSelectedValue());
				}
			}
		});
		list_1.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(final ListSelectionEvent e) {
				scrListPanel.firePropertyChange("ListSelectionChanged",
						new Integer(list_1.getSelectedIndex()), list_1
								.getSelectedValue());
			}
		});
		list_1.setOpaque(false);

		setOpaque(false);
		// setBounds(0, 0, 800, 250);

		scrollPane_1.getVerticalScrollBar().setBlockIncrement(
				fixedCellHeight + fixedCellMargin);

		upButton.setOpaque(true);
		upButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				scrollPane_1.getVerticalScrollBar().setValue(
						scrollPane_1.getVerticalScrollBar().getValue()
								- scrollPane_1.getSize().height);
				// scrollPane_1.getVerticalScrollBar().setValue(scrollPane_1.getVerticalScrollBar().getValue()
				// - fixedCellHeight - fixedCellMargin);
			}
		});
		add(upButton);

		downButton.setOpaque(true);
		downButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				scrollPane_1.getVerticalScrollBar().setValue(
						scrollPane_1.getVerticalScrollBar().getValue()
								+ scrollPane_1.getSize().height);
				// scrollPane_1.getVerticalScrollBar().setValue(scrollPane_1.getVerticalScrollBar().getValue()
				// + fixedCellHeight + fixedCellMargin);
			}
		});
		add(downButton);

		scrollPane_1
				.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1
				.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		add(scrollPane_1);

		// list_1.setFixedCellWidth(738);
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		fixedCellMargin = 10;
		setFixedCellHeight(31);
		list_1.setAutoscrolls(false);
		scrollPane_1.setViewportView(list_1);
		setCellRenderer(cellRenderer);
		setBounds(0, 0, 800, 250);
	}

	public void setCellRenderer(ListCellRenderer cell) {
		if (cell instanceof JComponent) {
			JComponent comCell = (JComponent) cell;
			comCell.setOpaque(false);
			comCell.setSize(list_1.getSize().width, comCell.getSize().height);
			list_1.setFixedCellHeight(comCell.getSize().height);
			list_1.setFixedCellWidth(comCell.getSize().width);
			// list_1.setFixedCellHeight(50);
		}
		list_1.setCellRenderer(cell);
	}

	public void setListData(Object[] items) {
		list_1.setListData(items);
		this.items = items;
	}

	public Object[] getListData() {
		return this.items;
	}

	@Override
	public void setBounds(int x, int y, int width, int height) {
		super.setBounds(x, y, width, height);
		Rectangle r = new Rectangle(new Rectangle(x, y, width, height));
		try {
			scrollPane_1.setLocation(0, 0);
			scrollPane_1.setSize(r.width - upButton.getSize().width - 6,
					r.height);
			upButton.setLocation(r.width - upButton.getSize().width, 0);
			downButton.setLocation(r.width - upButton.getSize().width, r.height
					- upButton.getSize().height - fixedCellMargin);
		} catch (Exception e) {
		}
	}

	@Override
	public void setSize(Dimension d) {
		super.setSize(d);
		try {
			scrollPane_1.setLocation(0, 0);
			scrollPane_1.setSize(d.width - upButton.getSize().width
					- fixedCellMargin, d.height);
			upButton.setLocation(d.width - upButton.getSize().width, 0);
			downButton.setLocation(d.width - upButton.getSize().width, d.height
					- upButton.getSize().height);
		} catch (Exception e) {
		}
	}

	@Override
	public void firePropertyChange(String propertyName, Object oldValue,
			Object newValue) {
		super.firePropertyChange(propertyName, oldValue, newValue);
	}

	public void setSelectedItem(Object o) {
		if (o == null)
			list_1.setSelectedIndex(-1);
		else
			list_1.setSelectedValue(o, true);
	}

	public void setFixedCellHeight(int fixedCellHeight) {
		this.fixedCellHeight = fixedCellHeight;
		list_1.setFixedCellHeight(fixedCellHeight + fixedCellMargin);
		upButton.setSize(fixedCellHeight, fixedCellHeight);
		downButton.setSize(fixedCellHeight, fixedCellHeight);
	}

	public int getFixedCellHeight() {
		return fixedCellHeight;
	}

	/**
	 * @param fixedCellMargin
	 *            the fixedCellMargin to set
	 */
	public void setFixedCellMargin(int fixedCellMargin) {
		this.fixedCellMargin = fixedCellMargin;
	}

	/**
	 * @return the fixedCellMargin
	 */
	public int getFixedCellMargin() {
		return fixedCellMargin;
	}

	public JList getJListComponent() {
		return list_1;
	}

	public void clearSelection() {
		list_1.clearSelection();
	}

	/*
	 * class Flasher extends Thread{ JLabel label; public Flasher(JLabel label){
	 * this.label = label; this.start(); } public void run() { String mLabel =
	 * this.label.getText();
	 * 
	 * try { while (true) { Thread.sleep(2000); String current =
	 * this.label.getText(); // if (current.equalsIgnoreCase(mLabel)) {
	 * cellLabelpreviousSlot.setText(""); // } } } catch (InterruptedException
	 * ex) { ex.printStackTrace(); } finally {
	 * cellLabelpreviousSlot.setText(mLabel);
	 * 
	 * } } }
	 */

}
