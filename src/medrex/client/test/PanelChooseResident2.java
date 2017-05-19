package medrex.client.test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.RoundRectangle2D;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.main.PanelResidentInformation;
import medrex.client.utils.controls.ChooseResidentList;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;

public class PanelChooseResident2 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2302690718559659268L;
	private PanelResidentInformation panelResiInfo;
	private ChooseResidentList residentList;
	private JPanel topTabArea;
	private JPanel topTabsPanel;
	private JPanel topBlueStrip;
	private JPanel defaultPanel;
	private JPanel panel_4;
	private JTextField txtChooseResident;
	private JLabel logLabel;
	private JLabel lastLoginLabel;
	private JxButton nextButton;

	public PanelChooseResident2() {
		super();
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});
		setLayout(null);
		setPreferredSize(new Dimension(868, 768));

		topTabArea = new JPanel();
		topTabArea.setLayout(new BorderLayout(0, 0));
		topTabArea.setOpaque(false);
		topTabArea.setBounds(0, 0, 868, 138);
		add(topTabArea);

		topTabsPanel = new JPanel();
		topTabsPanel.setOpaque(false);
		topTabsPanel.setLayout(null);
		topTabsPanel.setPreferredSize(new Dimension(868, 40));
		topTabArea.add(topTabsPanel, BorderLayout.SOUTH);

		topBlueStrip = new JPanel();
		topBlueStrip.setLayout(new GridLayout(0, 2));
		topBlueStrip.setBackground(new Color(28, 93, 113));
		topBlueStrip.setBounds(0, 138, 868, 38);
		add(topBlueStrip);

		lastLoginLabel = new JLabel();
		lastLoginLabel.setForeground(Color.WHITE);
		lastLoginLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont()
				.deriveFont(16));
		lastLoginLabel.setBorder(new EmptyBorder(0, 100, 0, 0));
		topBlueStrip.add(lastLoginLabel);
		lastLoginLabel.setText("<html><b>Last Login:</b> 2009-05-01 08:30 AM");

		logLabel = new JLabel();
		logLabel.setBorder(new EmptyBorder(0, 0, 0, 50));
		logLabel.setForeground(Color.WHITE);
		logLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont()
				.deriveFont(16));
		logLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		topBlueStrip.add(logLabel);
		logLabel.setText("Log off   |   Support   |   Help");

		defaultPanel = new JPanel();
		defaultPanel.setLayout(null);
		defaultPanel.setBorder(new EmptyBorder(20, 0, 0, 10));
		defaultPanel.setOpaque(false);
		defaultPanel.setBounds(0, 176, 868, 592);
		add(defaultPanel);

		panel_4 = new JPanel();
		panel_4.setOpaque(false);
		panel_4.setLayout(null);
		panel_4.setBounds(157, 10, 420, 464);
		defaultPanel.add(panel_4);

		final JLabel chooseResidentLabel = new JLabel();
		chooseResidentLabel.setHorizontalAlignment(SwingConstants.CENTER);
		chooseResidentLabel.setText("CHOOSE RESIDENT");
		chooseResidentLabel.setForeground(new Color(5, 65, 94));
		chooseResidentLabel.setFont(new Font("Dialog", Font.PLAIN, 28));
		chooseResidentLabel.setBounds(0, 0, 420, 35);
		panel_4.add(chooseResidentLabel);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(5, 65, 94), 1, false));
		panel_5.setBackground(Color.WHITE);
		panel_5.setArc(0.6f);
		panel_5.setBounds(10, 50, 400, 30);
		panel_4.add(panel_5);

		txtChooseResident = new JTextField();
		txtChooseResident.setForeground(new Color(5, 65, 94));
		txtChooseResident.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtChooseResident.setBounds(5, 5, 390, 20);
		txtChooseResident.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtChooseResident.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(final KeyEvent e) {
				doSearch();
			}
		});
		panel_5.add(txtChooseResident);

		residentList = new ChooseResidentList();
		// residentList.setListData(new String[] {"BEVAN MICHAEL",
		// "GILCHRIST ADAM", "BEVAN MICHAEL", "GILCHRIST ADAM", "BEVAN MICHAEL",
		// "GILCHRIST ADAM"});
		residentList.getJListComponent().setForeground(new Color(5, 65, 94));
		residentList.getJListComponent().setBackground(
				new Color(206, 221, 224, 250));
		residentList.getJListComponent().setFont(
				new Font("Dialog", Font.BOLD, 16));
		residentList.setBounds(10, 102, 400, 369);
		residentList.setPreferredSize(residentList.getBounds().getSize());
		// residentList.setFixedCellHeight(100);
		// residentList.setFixedCellMargin(0);
		residentList.setCellRenderer(residentList.new JxListCellRenderer() {

			@Override
			public Component getListCellRendererComponent(JList list,
					Object value, int index, final boolean isSelected,
					final boolean cellHasFocus) {

				final JxPanel cell = new JxPanel() {
					/**
					 * 
					 */
					private static final long serialVersionUID = 4562240223101736579L;

					public Color alphaColor(Color color, int alpha) {
						return new Color(color.getRed(), color.getGreen(),
								color.getBlue(), alpha);
					}

					@Override
					public void paint(Graphics g) {
						setOpaque(false);
						super.setBorder(null);
						super.paint(g);
						super.setBorder(this.getBorder());
						Graphics2D g2 = (Graphics2D) g;
						g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
								RenderingHints.VALUE_ANTIALIAS_ON);

						GradientPaint bg = null;
						if (isSelected) {
							g2.setBackground(new Color(206, 221, 224, 250));
							bg = new GradientPaint(new Point(0, 0), this
									.getForeground().darker(), new Point(this
									.getWidth() - 50, 0), alphaColor(new Color(
									206, 221, 224, 250), 255));
							g2.setPaint(bg);
							g2.fill(new RoundRectangle2D.Double(0, 0,
									getWidth(), getHeight(), super.getArc()
											* super.getScale(), super.getArc()
											* super.getScale()));
							// g2.fill(this.getShape());
							super.paintChildren(g);
							// this.drawBorder(g2);
						} else {
							bg = new GradientPaint(new Point(0, 0), this
									.getBackground().brighter(), new Point(0,
									this.getHeight()), this.getBackground()
									.darker());
							g2.setPaint(bg);
							g2.fill(this.getShape());
							super.paintChildren(g);
							this.drawBorder(g2);
						}
					}
				};
				cell.setLayout(null);
				cell.setForeground(list.getForeground());
				cell.setBackground(list.getBackground());
				cell.setBorder(new LineBorder(list.getForeground(), 1, false));
				cell.setSize(list.getWidth(), list.getFixedCellHeight()
						- residentList.getFixedCellMargin());
				cell.setLocation(0, 0);
				cell.setArc(0.6f);

				JPanel renderer = new JPanel();
				renderer.setLayout(null);
				renderer.setBorder(new EmptyBorder(0, 0, 0, residentList
						.getFixedCellMargin()));
				renderer.setSize(list.getWidth(), list.getFixedCellHeight());
				renderer.setOpaque(false);
				renderer.add(cell);

				JLabel cellLabel = new JLabel();
				cellLabel.setBorder(new EmptyBorder(0, 10, 0, 10));
				cellLabel.setFont(list.getFont());
				cellLabel.setSize(list.getWidth() - (int) (cell.getArc() * 10),
						list.getFixedCellHeight()
								- residentList.getFixedCellMargin()
								- (int) (cell.getArc() * 10));
				cellLabel.setLocation((int) (cell.getArc() * 10 / 2),
						(int) (cell.getArc() * 10 / 2));
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

			@Override
			protected String getText(Object value) {
				if (value instanceof ResidentMain) {
					ResidentMain resi = (ResidentMain) value;
					return resi.getUserPass() + ", " + resi.getUserName();
				} else {
					return super.getText(value);
				}
			}
		});
		residentList.getJListComponent().addListSelectionListener(
				new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent e) {
						if (!e.getValueIsAdjusting()) {
							ResidentMain resi = (ResidentMain) residentList
									.getJListComponent().getSelectedValue();
							panelResiInfo.setResident(resi);
						} else {
							panelResiInfo.setResident(null);
						}
						nextButton.setVisible(panelResiInfo.isVisible());
					}
				});
		panel_4.add(residentList);

		panelResiInfo = new PanelResidentInformation();
		panelResiInfo.setForeground(new Color(5, 65, 94));
		panelResiInfo.setBounds(618, 112, 200, 362);
		defaultPanel.add(panelResiInfo);

		nextButton = new JxButton();
		nextButton.setArc(0.6f);
		nextButton.setText("NEXT >>");
		nextButton.setFont(new Font("Dialog", Font.BOLD, 12));
		nextButton.setForeground(new Color(5, 65, 94));
		nextButton.setBorder(new LineBorder(new Color(5, 65, 94), 1, false));
		nextButton.setBackground(Color.WHITE);
		nextButton.setBounds(618, 480, 106, 36);
		defaultPanel.add(nextButton);
		nextButton.setVisible(false);
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (getSelectedResident() != null) {
					doNext();
				}
			}
		});

		doUpdate();
	}

	protected void doNext() {
		// TODO Auto-generated method stub
		System.out.println("Override doNext() method");
	}

	@Override
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(new Color(32, 63, 84));
		g2.fillRect(0, getHeight() - 76, getWidth(), 76);
		super.paint(g);
	}

	public void doUpdate() {
		topTabArea.setSize(getWidth(), topTabArea.getHeight());
		topBlueStrip.setSize(getWidth(), topBlueStrip.getHeight());
		defaultPanel.setSize(getWidth(), getHeight() - defaultPanel.getY());
		panel_4.setLocation((defaultPanel.getWidth() - panel_4.getWidth()) / 2,
				panel_4.getY());
		panelResiInfo.setLocation((int) (defaultPanel.getWidth() * 0.98f)
				- panelResiInfo.getWidth(), panelResiInfo.getY());
		nextButton.setLocation((int) (defaultPanel.getWidth() * 0.98f)
				- panelResiInfo.getWidth(), nextButton.getY());
		this.repaint();
		doSearch();
	}

	protected void doSearch() {
		List residents = new ArrayList();
		try {
			if (txtChooseResident != null) {
				if (!txtChooseResident.getText().equalsIgnoreCase("")) {
					residents = MedrexClientManager.getInstance().getResidents(
							txtChooseResident.getText(), "", "", "All");
				} else {
					residents = MedrexClientManager.getInstance()
							.getResidentMain();
				}
			} else {
				residents = MedrexClientManager.getInstance().getResidentMain();
			}
			residentList.setListData(residents.toArray());
		} catch (Exception e) {
			// e.printStackTrace();
		}
	}

	public ResidentMain getSelectedResident() {
		return (ResidentMain) residentList.getJListComponent()
				.getSelectedValue();
	}
}
