package medrex.client.census.countAudit;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashMap;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import medrex.client.admin.userLogon.ControllerUserLogon;
import medrex.client.constants.Global;
import medrex.client.main.PanelResidentInfoHoriz;
import medrex.client.utils.controls.DateTimePanel;
import medrex.commons.enums.GuiModes;

public class PanelCountAuditMain extends JPanel {
	private static final long serialVersionUID = 1L;

	public static final String DEFAULT = "DEFAULT";
	public static final String FLOOR_WISE = "FLOOR_WISE";
	public static final String REPORTS = "REPORTS";

	private static HashMap<String, JPanel> cards;

	private JPanel defaultPanel;
	private JPanel topTabArea;
	private JPanel topTabsPanel;
	private JPanel topBlueStrip;
	private String floorType;

	private CardLayout defaultCardLayout;
	private JPanel currentCard;

	private PanelResidentInfoHoriz panelResidentInfo;

	public PanelCountAuditMain() {
		super();
		Global.panelCountAuditMain = this;
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});
		setLayout(null);
		// setLayout(new BorderLayout());
		setPreferredSize(new Dimension(868, 768));

		cards = new HashMap<String, JPanel>();
		// ////////////////////////////////////////////////////
		topTabArea = new JPanel();
		topTabArea.setLayout(new BorderLayout(0, 0));
		topTabArea.setOpaque(false);
		topTabArea.setBounds(0, 0, 868, 138);
		add(topTabArea);

		topTabsPanel = new JPanel();
		topTabsPanel.setOpaque(false);
		topTabsPanel.setLayout(null);
		topTabsPanel.setPreferredSize(new Dimension(868, 40));
		// topTabArea.add(topTabsPanel, BorderLayout.SOUTH);

		final JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(9, 9, 9, 9));
		panel.setLayout(new BorderLayout());
		panel.setOpaque(false);
		panel.setPreferredSize(new Dimension(556, 120));
		topTabArea.add(panel, BorderLayout.EAST);

		panelResidentInfo = new PanelResidentInfoHoriz();
		panelResidentInfo.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		panelResidentInfo.setOpaque(false);
		panel.add(panelResidentInfo, BorderLayout.CENTER);

		final DateTimePanel timerPanel = new DateTimePanel();
		timerPanel.setFont(GuiModes.CHANGE_SCREEN.getControlFont().deriveFont(
				18f).deriveFont(Font.PLAIN));
		timerPanel.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		timerPanel.setPreferredSize(new Dimension(150, 100));
		panel.add(timerPanel, BorderLayout.WEST);

		topBlueStrip = new JPanel();
		topBlueStrip.setLayout(new GridLayout(0, 2));
		topBlueStrip.setBackground(new Color(28, 93, 113));
		topBlueStrip.setBounds(0, 138, 868, 38);
		add(topBlueStrip);

		final JLabel lastLoginLabel = new JLabel();
		lastLoginLabel.setForeground(Color.WHITE);
		lastLoginLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont()
				.deriveFont(16));
		lastLoginLabel.setBorder(new EmptyBorder(0, 100, 0, 0));
		lastLoginLabel.setText("<html><b>Last Login:</b> 2009-05-01 08:30 AM");
		topBlueStrip.add(lastLoginLabel);

		final JLabel logLabel = new JLabel();
		logLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent arg0) {
				(new ControllerUserLogon()).logoutUpdate();
			}
		});
		logLabel.setBorder(new EmptyBorder(0, 0, 0, 50));
		logLabel.setForeground(Color.WHITE);
		logLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont()
				.deriveFont(16));
		logLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		logLabel.setText("Log off       ");
		topBlueStrip.add(logLabel);
		// /////////////////////////////////////////////
		defaultCardLayout = new CardLayout();

		defaultPanel = new JPanel();
		defaultPanel.setLayout(defaultCardLayout);
		defaultPanel.setBorder(new EmptyBorder(20, 0, 0, 8));
		defaultPanel.setOpaque(false);
		defaultPanel.setBounds(0, 176, 868, 592);
		defaultPanel.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
				doUpdate();
			}
		});
		add(defaultPanel);
	}

	@Override
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(new Color(32, 63, 84));
		g2.fillRect(0, getHeight() - 76, getWidth(), 76);
		super.paint(g);
	}

	protected void doUpdate() {
		// System.out.println("getWidth:" + getWidth());
		topTabArea.setSize(getWidth(), topTabArea.getHeight());
		topBlueStrip.setSize(getWidth(), topBlueStrip.getHeight());
		defaultPanel.setSize(getWidth(), getHeight() - defaultPanel.getY());
		// topTabArea.repaint();
		// topBlueStrip.repaint();
		if (currentCard != null) {
			currentCard.setSize(defaultPanel.getWidth(), defaultPanel
					.getHeight());
			currentCard.firePropertyChange("DISPLAY_TAB", false, true);
		}
		if (getTopLevelAncestor() != null) {
			getTopLevelAncestor().repaint();
		} else {
			this.repaint();
		}
	}

	private JPanel getCard(String name) {
		if (name == PanelCountAuditMain.DEFAULT) {
			return new PanelCountAuditFloors();
		} else if (name == PanelCountAuditMain.FLOOR_WISE) {
			return new PanelCountAuditFloorWise();
		} else if (name == PanelCountAuditMain.REPORTS) {
			return new PanelCountAuditHistory();
		} else {
			return null;
		}
	}

	public void changeCard(String name) {
		currentCard = null;
		// if(cards.get(name) == null) {
		JPanel card = getCard(name);
		// cards.put(name, card);
		card.setOpaque(false);
		defaultPanel.removeAll();
		defaultPanel.add(card, name);
		currentCard = card;
		card = null;
		// }
		defaultCardLayout.show(defaultPanel, name);
		defaultPanel.requestFocus();
		doUpdate();
	}

	public void setFloorType(String fString) {
		this.floorType = fString;
	}

	public String getFloorType() {
		return floorType;
	}
}