package medrex.client.utils.controls;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TouchscreenList extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6517274396687922733L;
	private JButton downButton;
	private JButton upButton;
	private JList list_1;
	private JScrollPane scrollPane_1;
	private TouchscreenList scrListPanel;

	public TouchscreenList() {
		super();
		scrListPanel = this;
		setLayout(null);
		upButton = new JButton();
		upButton.setBounds(744, 0, 56, 56);
		downButton = new JButton();
		downButton.setBounds(744, 194, 56, 56);
		scrollPane_1 = new JScrollPane() {

			/**
			 * 
			 */
			private static final long serialVersionUID = -8395695302037461441L;

		};
		scrollPane_1.setBounds(0, 0, 738, 250);
		list_1 = new JList();
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

		setOpaque(false);
		// setBounds(0, 0, 800, 250);

		upButton.setOpaque(true);
		upButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				scrollPane_1.getVerticalScrollBar().setValue(
						scrollPane_1.getVerticalScrollBar().getValue()
								- scrollPane_1.getSize().height);
			}
		});
		upButton.setIcon(new ImageIcon("img\\up.gif"));
		upButton.setText("");
		add(upButton);

		downButton.setOpaque(true);
		downButton.setIcon(new ImageIcon("img\\down.gif"));
		downButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				scrollPane_1.getVerticalScrollBar().setValue(
						scrollPane_1.getVerticalScrollBar().getValue()
								+ scrollPane_1.getSize().height);
			}
		});
		downButton.setText("");
		add(downButton);

		scrollPane_1
				.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1
				.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		add(scrollPane_1);

		list_1.setFixedCellWidth(738);
		list_1.setFixedCellHeight(50);
		list_1.setAutoscrolls(false);
		scrollPane_1.setViewportView(list_1);

		setBounds(0, 0, 800, 250);
	}

	public void setCellRenderer(ListCellRenderer cell) {
		if (cell instanceof Component) {
			((Component) cell).setSize(list_1.getSize().width,
					((Component) cell).getSize().height);
			list_1.setFixedCellHeight(((Component) cell).getSize().height);
			list_1.setFixedCellWidth(((Component) cell).getSize().width);
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
					- upButton.getSize().height);
		} catch (Exception e) {
		}
	}

	@Override
	public void setSize(Dimension d) {
		super.setSize(d);
		try {
			scrollPane_1.setLocation(0, 0);
			scrollPane_1.setSize(d.width - upButton.getSize().width - 6,
					d.height);
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
}
