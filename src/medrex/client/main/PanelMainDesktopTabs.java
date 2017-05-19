package medrex.client.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.rmi.RemoteException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;

import com.jgoodies.looks.plastic.Plastic3DLookAndFeel;
import com.sX.swing.JxButton;

public class PanelMainDesktopTabs extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1339159526246799239L;
	private JPanel tabContainer;
	private JPanel tabView;
	private String[] tabs = new String[] { "resident_information.png",
			"admissions_details.png", "activities.png",
			"medication_treatment.png", "dietary.png", "consultant.png",
			"progress_notes.png", "lab_special.png", "history_physical.png",
			"phyicians_orders.png", "ot-pt-act.png", "misc.png",
			"CAREPLAN.png", "alert.png",
			"mds.png",
			// "social_services.png", "ur_discharge.png",
			"assessment.png", "monthly_summaries.png", "dental_podiatry.png",
			"psych.png", "flow_sheets.png", "mDSPending.png", "DIALYSIS.png",
			"NURSES_NOTES.png",
	// ,"scan.png"
	};
	private String[] tabsName = new String[] { "RESIDENT INFORMATION",
			"ADMISSION DETAILS", "ACTIVITIES", "MEDICATION & TREATMENT",
			"DIETARY", "CONSULTANT", "PROGRESS NOTES", "LAB & SPECIAL REPORTS",
			"HISTORY & PHYSICAL", "PHYSICIAN ORDERS", "OT-PT-ACT-SPEECH",
			"MISC", "CARE PLAN", "ALERT", "MDS", "ASSESSMENTS",
			"MONTHLY SUMMARIES", "DENTAL & PODIATRY", "PSYCH", "FLOW SHEETS",
			"MDS 3.0", "DIALYSIS", "NURSES NOTES" };
	private JLabel[] tabLabels;

	private Color[] tabColors = new Color[] { new Color(244, 193, 7),
			new Color(165, 219, 4), new Color(224, 150, 159),
			new Color(206, 65, 43), new Color(195, 229, 6),
			new Color(134, 134, 104), new Color(115, 115, 196),
			new Color(128, 111, 130), new Color(188, 7, 13),
			new Color(238, 136, 44), new Color(222, 62, 12),
			new Color(62, 156, 127), new Color(206, 64, 42),
			new Color(33, 135, 161), new Color(237, 145, 160),
			new Color(113, 149, 37), new Color(179, 211, 212),
			new Color(33, 135, 161), new Color(94, 192, 63),
			new Color(135, 134, 76), new Color(237, 145, 160),
			new Color(134, 134, 104), new Color(206, 65, 43) };

	private int oldIndex;
	private JLabel lblResidentName;
	private JLabel lblRoomNum;
	private JLabel tabNameLabel;
	private JxButton indexButton;
	private final static Color DEFAULT_FOREGROUND_COLOR = Color.BLACK;
	public static final String TABINDEX = "TabIndex";
	private final static int TAB_WIDTH = 108;
	private final static int TAB_HEIGHT = 37;
	private final static int TAB_SPACE = 16;
	public static int TAB_COUNT;
	public static final int INDEX_TAB_BTN = -10;
	public static final Color INDEX_TAB_COL = new Color(188, 224, 13);

	public PanelMainDesktopTabs() {
		super();
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(final ComponentEvent e) {
				doResize();
			}
		});
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});
		setLayout(null);
		setPreferredSize(new Dimension(1024, 109));
		setOpaque(false);

		TAB_COUNT = tabs.length;

		tabContainer = new JPanel();
		tabContainer.setLayout(null);
		tabContainer.setBounds(0, 0, 1024, 75);
		tabContainer.setOpaque(false);
		add(tabContainer);

		tabView = new JPanel();
		tabView.setBackground(Color.WHITE);
		tabView.setLayout(null);
		tabView.setBounds(0, 74, 1024, 33);
		add(tabView);

		tabNameLabel = new JLabel();
		tabNameLabel.setForeground(DEFAULT_FOREGROUND_COLOR);
		tabNameLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		tabNameLabel.setText("New JLabel");
		tabNameLabel.setBounds(300, 0, 400, 33);
		tabView.add(tabNameLabel);

		final JLabel residentNameLabel = new JLabel();
		residentNameLabel.setForeground(DEFAULT_FOREGROUND_COLOR);
		residentNameLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		residentNameLabel.setHorizontalAlignment(SwingConstants.LEADING);
		residentNameLabel.setText("RESIDENT NAME:");
		residentNameLabel.setBounds(641, 0, 100, 33);
		tabView.add(residentNameLabel);

		lblResidentName = new JLabel();
		lblResidentName.setText("New JLabel");
		lblResidentName.setForeground(DEFAULT_FOREGROUND_COLOR);
		lblResidentName.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblResidentName.setBounds(747, 0, 136, 33);
		tabView.add(lblResidentName);

		final JLabel roomNumLabel = new JLabel();
		roomNumLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		roomNumLabel.setForeground(DEFAULT_FOREGROUND_COLOR);
		roomNumLabel.setText("ROOM NUM:");
		roomNumLabel.setBounds(889, 0, 68, 33);
		tabView.add(roomNumLabel);

		lblRoomNum = new JLabel();
		lblRoomNum.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblRoomNum.setForeground(DEFAULT_FOREGROUND_COLOR);
		lblRoomNum.setText("000");
		lblRoomNum.setBounds(963, 0, 51, 33);
		tabView.add(lblRoomNum);

		indexButton = new JxButton();
		indexButton.setArc(1f);
		indexButton.setFont(new Font("Dialog", Font.BOLD, 12));
		indexButton.setForeground(DEFAULT_FOREGROUND_COLOR);
		indexButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				handleTabClick(INDEX_TAB_BTN);
			}
		});
		indexButton.setText("INDEX");
		indexButton.setBounds(10, 5, 68, 23);
		tabView.add(indexButton);

		tabLabels = new JLabel[tabs.length];
		for (int i = 0; i < 11; i++) {
			final int index = i;
			tabLabels[i] = new JLabel(new ImageIcon("img/residentmaintabs/" + tabs[i]));
			tabLabels[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					// System.out.println("index of tab clicked :"+index);
					handleTabClick(index);
				}
			});
			tabLabels[i].setText("");
			tabLabels[i].setSize(TAB_WIDTH, TAB_HEIGHT);
			tabContainer.add(tabLabels[i]);
		}
		for (int i = 11; i < tabs.length; i++) {
			final int index = i;
			tabLabels[i] = new JLabel(new ImageIcon("img/residentmaintabs/" + tabs[i]));
			tabLabels[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					// System.out.println("index of tab clicked :"+index);
					handleTabClick(index);
				}
			});
			tabLabels[i].setText("");
			tabLabels[i].setSize(TAB_WIDTH, TAB_HEIGHT);
			tabContainer.add(tabLabels[i]);
		}
		reAdjustTabLocation();
		handleTabClick(0);
	}

	public void doUpdate() {
		if (Global.currentResidenceKey != 0) {
			ResidentMain resident;
			try {
				resident = MedrexClientManager.getInstance().getResident(
						Global.currentResidenceKey);
				lblResidentName.setText(resident.getUserPass() + ", "
						+ resident.getUserName());
				// lblRoomNum.setText(resident.getRoom());
				// ------------------------------------getting from room history
				TempRoomHistory roomHist = null;
				try {
					roomHist = MedrexClientManager.getInstance()
							.getLastRoomHistory(resident.getSerial());
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (MedrexException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String room = "";
				if (roomHist != null) {
					if (roomHist.getStartDate() != null
							&& roomHist.getEndDate() != null) {
						room = "";
					} else {
						room = roomHist.getRoom();
					}
				}
				lblRoomNum.setText(room);
				// -------------------------------------
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			lblResidentName.setText("");
			lblRoomNum.setText("");
		}
	}

	private void reAdjustTabLocation() {
		int w = this.getSize().width;
		for (int i = 0, row = 0, curW = 0, x = 0, y = 0, tabC = 0, rowT = 0, aW = w - 22; i < tabs.length; i++) {
			x = 11 + (row * 36) + ((i - tabC) * (TAB_WIDTH - TAB_SPACE));
			y = tabContainer.getHeight() - ((row + 1) * TAB_HEIGHT);
			curW = x + (TAB_WIDTH);
			tabLabels[i].setLocation(x, y);
			if (curW + (TAB_WIDTH - TAB_SPACE) > aW) {
				row++;
				tabC = i + 1;
				rowT = i - rowT + 1;
				aW = x + TAB_WIDTH - 22;
				if (aW < TAB_WIDTH) {
					aW = TAB_WIDTH;
				}
			}
		}
	}

	private void handleTabClick(int index) {
		if (index > 0 && Global.IS_DEMO) {
			JOptionPane.showMessageDialog(this,
					"This functionality is not available!!!", "Medrex",
					JOptionPane.INFORMATION_MESSAGE);
			handleTabClick(0);
			return;
		}

		for (int k = 0; k < tabsName.length; k++) {
			if (index == k) {
				tabNameLabel.setText(tabsName[k]);
			}
		}
		if (index == INDEX_TAB_BTN) {
			int i = 0;
			for (i = 0; i < tabLabels.length; i++) {
				tabContainer.setComponentZOrder(tabLabels[i], tabContainer
						.getComponentCount() - 1);
			}
			tabView.setBackground(INDEX_TAB_COL);
			indexButton.setBackground(INDEX_TAB_COL);
			tabContainer.setComponentZOrder(tabLabels[0], 0);
			this.firePropertyChange(TABINDEX, oldIndex, index);
			oldIndex = index;
			tabContainer.repaint();
		} else {
			tabContainer.setBackground(tabColors[index]);
			int i = 0;
			for (i = 0; i < tabLabels.length; i++) {
				tabContainer.setComponentZOrder(tabLabels[i], tabContainer
						.getComponentCount() - 1);
			}

			tabView.setBackground(tabColors[index]);
			indexButton.setBackground(tabColors[index]);
			tabContainer.setComponentZOrder(tabLabels[index], 0);
			this.firePropertyChange(TABINDEX, oldIndex, index);
			oldIndex = index;
			tabContainer.repaint();
		}
	}

	public void doResize() {

		tabContainer.setSize(this.getSize().width, this.getSize().height
				- tabView.getSize().height);
		reAdjustTabLocation();
		tabView
				.setLocation(0, this.getSize().height
						- tabView.getSize().height);
		tabView.setSize(this.getSize().width, tabView.getSize().height);

	}

	public int getCurrentSelectedIndex() {
		return oldIndex;
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(new Plastic3DLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(1024, 139);
		frame.getContentPane().add(new PanelMainDesktopTabs(),
				BorderLayout.CENTER);
		frame.setVisible(true);
	}

	public void setIndex(int index) {
		setTab(index);
	}

	private void setTab(int index) {
		for (int k = 0; k < tabsName.length; k++) {
			if (index == k) {
				tabNameLabel.setText(tabsName[k]);
			}
		}
		if (index == INDEX_TAB_BTN) {
			int i = 0;
			for (i = 0; i < tabLabels.length; i++) {
				tabContainer.setComponentZOrder(tabLabels[i], tabContainer
						.getComponentCount() - 1);
			}
			tabView.setBackground(INDEX_TAB_COL);
			indexButton.setBackground(INDEX_TAB_COL);
			tabContainer.setComponentZOrder(tabLabels[0], 0);
			// this.firePropertyChange(TABINDEX, oldIndex, index);
			oldIndex = index;
			tabContainer.repaint();
		} else {
			tabContainer.setBackground(tabColors[index]);
			int i = 0;
			for (i = 0; i < tabLabels.length; i++) {
				tabContainer.setComponentZOrder(tabLabels[i], tabContainer
						.getComponentCount() - 1);
			}

			tabView.setBackground(tabColors[index]);
			indexButton.setBackground(tabColors[index]);
			tabContainer.setComponentZOrder(tabLabels[index], 0);
			// this.firePropertyChange(TABINDEX, oldIndex, index);
			oldIndex = index;
			tabContainer.repaint();
		}

	}
}