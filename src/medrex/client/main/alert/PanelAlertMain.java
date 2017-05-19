package medrex.client.main.alert;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JViewport;
import javax.swing.border.EmptyBorder;

import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;

import com.sX.swing.JxPanel;

public class PanelAlertMain extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8357582517961507925L;
	private JxPanel panelView;
	private JPanel panelTabs;
	public static int TAB_COUNT;
	private static final ImageIcon[] imgDefTabIcon = new ImageIcon[] {
			new ImageIcon("img/tabs/CONFIGURE_ALERT.png"),
			new ImageIcon("img/tabs/PENDING_ALERT.png") };
	private static final ImageIcon[] imgSelTabIcon = new ImageIcon[] {
			new ImageIcon("img/tabs/CONFIGURE_ALERT_HIGH.png"),
			new ImageIcon("img/tabs/PENDING_ALERT_HIGH.png") };

	private JLabel tabLabels[];
	private JPanel tabViews[];
	private JViewport view;
	private int currentIndex;

	public PanelAlertMain(final String str) {
		super();
		setPreferredSize(new Dimension(718, 448));
		setOpaque(false);
		setLayout(null);
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate(str);
				}
			}
		});

		TAB_COUNT = imgDefTabIcon.length;
		final JPanel panel = new JPanel();
		panel.setBounds(0, 0, 718, 448);
		panel.setSize(718, 448);
		panel.setLayout(null);
		panel.setOpaque(false);
		add(panel);

		SwingUtils.centerRectangle(this.getBounds(), panel.getBounds());

		panelTabs = new JPanel();
		panelTabs.setLayout(null);
		panelTabs.setBounds(0, 0, 718, 32);
		panelTabs.setOpaque(false);
		panel.add(panelTabs);

		tabLabels = new JLabel[TAB_COUNT];
		for (int i = 0; i < TAB_COUNT; i++) {
			final int index = i;
			tabLabels[i] = new JLabel(imgDefTabIcon[i]);
			tabLabels[i].setBounds(7 + (105 * i), 3, 120, 30);
			tabLabels[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					handleTabs(index, str);
				}
			});
			panelTabs.add(tabLabels[i]);
		}

		panelView = new JxPanel(1f);
		panelView.setLayout(null);
		panelView.setBounds(0, 32, 718, 418);
		panelView.setBackground(Color.WHITE);
		panelView.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.add(panelView);

		view = new JViewport();
		view.setBounds(0, 0, 718, 418);
		view.setOpaque(false);
		panelView.add(view);

		tabViews = new JPanel[TAB_COUNT];
		currentIndex = 0;
		doUpdate(str);
	}

	public void handleTabs(int index, String str) {
		System.out.println("index is :" + index);
		if (index > 1) {
			index = 0;
		}
		for (int i = 0; i < tabLabels.length; i++) {
			panelTabs.setComponentZOrder(tabLabels[i], panelTabs
					.getComponentCount() - 1);
			tabLabels[i].setIcon(imgDefTabIcon[i]);
		}
		panelTabs.setComponentZOrder(tabLabels[index], 0);
		tabLabels[index].setIcon(imgSelTabIcon[index]);
		panelTabs.repaint();
		displayTabs(index, str);
	}

	public void displayTabs(int index, String str) {
		// if (tabViews[index] == null) {
		tabViews[index] = getTab(index, str);
		// }
		tabViews[index].setOpaque(false);
		tabViews[index].firePropertyChange("DISPLAY_TAB", false, true);
		view.setView(tabViews[index]);
	}

	public void doUpdate(String str) {
		if (Global.currentInnerTab != 0) {
			handleTabs(Global.currentInnerTab, str);
		} else {
			handleTabs(0, str);
		}
	}

	public JPanel getTab(int index, String str) {

		// if(Global.currentResidenceKey == 0){
		// return (new PanelAlert(str));
		// }
		if (Global.currentMainTab == 2) {
			index = 0;
		}
		Global.currentInnerTab = index;

		switch (index) {
		case 0:
			return (new PanelAlert(str));
		case 1:
			// if(Global.currentResidentStatus.equals("Active")) {
			return (new PanelPendingAlert(str));
			// return (new PanelResidentInfoPayerMain());
			// }else{
			// return (new PanelPendingAlert(str));
			// }
		default:
			return (new JPanel());
		}
	}

	public void setTab(int index, String str) {
		this.currentIndex = index;
		displayTabs(currentIndex, str);
	}
}
