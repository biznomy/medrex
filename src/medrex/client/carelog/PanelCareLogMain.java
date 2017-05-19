package medrex.client.carelog;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashMap;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import medrex.client.constants.Global;
import medrex.commons.vo.resident.ResidentMain;

public class PanelCareLogMain extends JPanel {
	private static final long serialVersionUID = 1L;

	public static final String DEFAULT = "DEFAULT";
	public static final String LEVEL_A = "LEVEL_A";
	public static final String LEVEL_B = "LEVEL_B";

	private static HashMap<String, JPanel> cards;

	private JLabel bedMobilityLabel;
	private JPanel defaultPanel;
	private JPanel topTabArea;
	private JPanel topTabsPanel;
	private JLabel lblTopTabs;
	private JPanel topBlueStrip;
	private ResidentMain resident;

	private CardLayout defaultCardLayout;
	private JPanel currentCard;

	public PanelCareLogMain() {
		super();
		Global.panelCareLogMain = this;
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});
		// setLayout(null);
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(868, 768));

		cards = new HashMap<String, JPanel>();

		// topTabArea = new JPanel();
		// topTabArea.setLayout(new BorderLayout(0,0));
		// topTabArea.setOpaque(false);
		// topTabArea.setBounds(0, 0, 868, 138);
		// add(topTabArea);
		//
		// topTabsPanel = new JPanel();
		// topTabsPanel.setOpaque(false);
		// topTabsPanel.setLayout(null);
		// topTabsPanel.setPreferredSize(new Dimension(868, 40));
		// topTabArea.add(topTabsPanel, BorderLayout.SOUTH);
		//
		// topBlueStrip = new JPanel();
		// topBlueStrip.setLayout(new GridLayout(0, 2));
		// topBlueStrip.setBackground(new Color(28, 93, 113));
		// topBlueStrip.setBounds(0, 138, 868, 38);
		// add(topBlueStrip);
		//
		// final JLabel lastLoginLabel = new JLabel();
		// lastLoginLabel.setForeground(Color.WHITE);
		// lastLoginLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont().deriveFont(16));
		// lastLoginLabel.setBorder(new EmptyBorder(0, 100, 0, 0));
		// lastLoginLabel.setText("<html><b>Last Login:</b> 2009-05-01 08:30 AM");
		// topBlueStrip.add(lastLoginLabel);
		//
		// final JLabel logLabel = new JLabel();
		// logLabel.setBorder(new EmptyBorder(0, 0, 0, 50));
		// logLabel.setForeground(Color.WHITE);
		// logLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont().deriveFont(16));
		// logLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		// logLabel.setText("Log off   |   Support   |   Help");
		// topBlueStrip.add(logLabel);

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

	// public void paint(Graphics g) {
	// Graphics2D g2 = (Graphics2D) g;
	// g2.setColor(new Color(32, 63, 84));
	// g2.fillRect(0, getHeight()- 76, getWidth(), 76);
	// super.paint(g);
	// }

	protected void doUpdate() {
		// topTabArea.setSize(getWidth(), topTabArea.getHeight());
		// topBlueStrip.setSize(getWidth(), topBlueStrip.getHeight());
		// defaultPanel.setSize(getWidth(), getHeight() - defaultPanel.getY());
		// topTabArea.repaint();
		// topBlueStrip.repaint();
		if (currentCard != null) {
			currentCard.firePropertyChange("DISPLAY_TAB", false, true);
		}
		if (getTopLevelAncestor() != null) {
			getTopLevelAncestor().repaint();
		} else {
			this.repaint();
		}
	}

	private JPanel getCard(String name) {
		if (name == PanelCareLogMain.DEFAULT) {
			final PanelChooseCareLog panel = new PanelChooseCareLog(12);
			// panel.setResident(this.getResident());
			return panel;
		} else if (name == PanelCareLogMain.LEVEL_A) {
			return new medrex.client.carelog.PanelCareLogLevelA();
		} else if (name == PanelCareLogMain.LEVEL_B) {
			return new JPanel();
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

	/**
	 * @param resident
	 *            the resident to set
	 */
	public void setResident(ResidentMain resident) {
		this.resident = resident;
	}

	/**
	 * @return the resident
	 */
	public ResidentMain getResident() {
		return resident;
	}
}