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
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import medrex.client.PanelImage;

import com.sX.swing.JxPanel;

public class ChooseResidentList extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -965610722304565813L;
	private PanelImage downButton;
	private PanelImage upButton;
	private JList list_1;
	private JScrollPane scrollPane_1;
	private ChooseResidentList scrListPanel;
	private int fixedCellHeight;
	private int fixedCellMargin;
	private final ListCellRenderer cellRenderer = new JxListCellRenderer();

	public class JxListCellRenderer implements ListCellRenderer {
		public Component getListCellRendererComponent(JList list, Object value,
				int index, final boolean isSelected, final boolean cellHasFocus) {

			final JxPanel cell = new JxPanel() {
				/**
				 * 
				 */
				private static final long serialVersionUID = 855475693906794070L;

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

			JLabel cellLabel = new JLabel();
			cellLabel.setBorder(new EmptyBorder(0, 10, 0, 10));
			cellLabel.setFont(list.getFont());
			cellLabel.setSize(list.getWidth() - (int) (cell.getArc() * 10),
					list.getFixedCellHeight() - getFixedCellMargin()
							- (int) (cell.getArc() * 10));
			cellLabel.setLocation((int) (cell.getArc() * 10 / 2), (int) (cell
					.getArc() * 10 / 2));
			cell.add(cellLabel);

			if (isSelected) {
				cellLabel.setForeground(list.getBackground());
				cellLabel.setBackground(list.getForeground());
			} else {
				cellLabel.setForeground(list.getForeground());
				cellLabel.setBackground(list.getBackground());
			}
			cellLabel.setText(getText(value));

			return renderer;
		}

		protected String getText(Object value) {
			return value.toString();
		}
	}

	public ChooseResidentList() {
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
}
