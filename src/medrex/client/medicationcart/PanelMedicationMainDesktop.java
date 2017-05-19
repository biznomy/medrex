package medrex.client.medicationcart;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import medrex.client.FrameLogin;
import medrex.client.admin.userLogon.ControllerUserLogon;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.PanelResidentInfoHoriz;
import medrex.client.main.PanelResidentInformation;
import medrex.client.utils.controls.DateTimePanel;
import medrex.client.utils.controls.MedicationResidentList;
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;

import com.sX.frameFactory.FrameFactory;

public class PanelMedicationMainDesktop extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel defaultPanel;
	private JPanel topTabArea;
	private JPanel topTabsPanel;
	private JPanel topBlueStrip;
	private PanelResidentInfoHoriz panelResidentInfo;
	private JLabel lastLoginLabel;
	private PanelResidentInformation panelResiInfo;
	private MedicationResidentList currentList;
	private MedicationResidentList historyList;
	private ArrayList<Object[]> newElements;
	public static SimpleDateFormat TIME_FORMATTER = new SimpleDateFormat(
			"hh:mm a");

	public PanelMedicationMainDesktop() {
		super();
		setLayout(null);

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

		lastLoginLabel = new JLabel();
		lastLoginLabel.setForeground(Color.WHITE);
		lastLoginLabel.setBorder(new EmptyBorder(0, 100, 0, 0));
		lastLoginLabel.setText("<html><b>Welcome </b>"
				+ Global.currentUserLastName + ", "
				+ Global.currentUserFirstName);
		lastLoginLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont()
				.deriveFont(16));
		topBlueStrip.add(lastLoginLabel);

		final JLabel logLabel = new JLabel();
		logLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent arg0) {
				(new ControllerUserLogon()).logoutUpdate();
				FrameFactory.closeAll();
				FrameLogin frame = (FrameLogin) FrameFactory
						.createWindowOfType(FrameLogin.class);
				Global.currentMainTab = 1;
				frame.setVisible(true);
			}
		});
		logLabel.setBorder(new EmptyBorder(0, 0, 0, 50));
		logLabel.setForeground(Color.WHITE);
		logLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont()
				.deriveFont(16));
		logLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		logLabel.setText("Log off       ");
		topBlueStrip.add(logLabel);

		defaultPanel = new JPanel();
		defaultPanel.setLayout(null);
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

		panelResiInfo = new PanelResidentInformation();
		panelResiInfo.setForeground(new Color(5, 65, 94));
		panelResiInfo.setBounds(795, 72, 40, 367);
		defaultPanel.add(panelResiInfo);

		historyList = new MedicationResidentList();
		historyList.getJListComponent().setForeground(new Color(5, 65, 94));
		historyList.getJListComponent().setBackground(
				new Color(206, 221, 224, 250));
		historyList.getJListComponent().setFont(
				new Font("Dialog", Font.BOLD, 16));
		historyList.setBounds(173, 72, 616, 164);
		historyList.setPreferredSize(historyList.getBounds().getSize());
		historyList.setCellRenderer(historyList.new JxListCellRenderer() {
			@Override
			protected String getLeftValue(Object value) {
				if (value instanceof Object[]) {
					Object values[] = (Object[]) value;
					if (values[0] != null) {
						return (String) values[0];
					}
				}
				return super.getLeftValue(value);
			}

			@Override
			protected String getRightValue(Object value) {
				if (value instanceof Object[]) {
					Object values[] = (Object[]) value;
					if (values[1] != null) {
						return (String) values[1];
					}
				}
				return super.getRightValue(value);
			}
		});
		defaultPanel.add(historyList);

		final JLabel chooseResidentLabel = new JLabel();
		chooseResidentLabel.setHorizontalAlignment(SwingConstants.CENTER);
		chooseResidentLabel.setFont(new Font("Dialog", Font.PLAIN, 28));
		chooseResidentLabel.setText("Medication Cart");
		chooseResidentLabel.setBounds(169, 31, 666, 35);
		chooseResidentLabel.setForeground(new Color(5, 65, 94));
		defaultPanel.add(chooseResidentLabel);

		currentList = new MedicationResidentList();
		currentList.setBounds(173, 278, 616, 164);
		currentList.getJListComponent().setForeground(new Color(5, 65, 94));
		currentList.getJListComponent().setBackground(
				new Color(206, 221, 224, 250));
		currentList.getJListComponent().setFont(
				new Font("Dialog", Font.BOLD, 16));
		currentList.setPreferredSize(currentList.getBounds().getSize());
		currentList.setCellRenderer(currentList.new JxListCellRenderer() {
			@Override
			protected String getLeftValue(Object value) {
				if (value instanceof Object[]) {
					Object values[] = (Object[]) value;
					if (values[0] != null) {
						return (String) values[0];
					}
				}
				return super.getLeftValue(value);
			}

			@Override
			protected String getRightValue(Object value) {
				if (value instanceof Object[]) {
					Object values[] = (Object[]) value;
					if (values[3] != null) {
						return (String) values[3];
					}
				}
				return super.getRightValue(value);
			}
		});
		currentList.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(final PropertyChangeEvent evt) {
				if (evt.getPropertyName().equalsIgnoreCase(
						"ListSelectionChanged")) {
					Object selObj = evt.getNewValue();
					if (selObj instanceof Object[]) {
						Object[] selValue = (Object[]) selObj;
						Global.currentResidenceKey = ((Integer) selValue[4])
								.intValue();
					} else {

					}
				} else if (evt.getPropertyName().equalsIgnoreCase(
						"ListDoubleClicked")) {
					Object selObj = evt.getNewValue();
					if (selObj instanceof Object[]) {
						Object[] selValue = (Object[]) selObj;
						Global.currentResidenceKey = ((Integer) selValue[4])
								.intValue();
						Global.frameMedicationForms = new FrameMedicationForms();
						Global.frameMedicationForms.showPhysicianOrders();
						showCurrentSlotList();
						showHistryList();
					} else {
					}
				}
			}
		});
		defaultPanel.add(currentList);
		doLoad();

		final Timer timer = new Timer(30 * 1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doLoad();
			}
		});
		timer.setRepeats(true);
		timer.setCoalesce(true);
		timer.start();
	}

	private void doLoad() {
		showCurrentSlotList();
		showHistryList();
	}

	private void showHistryList() {
		List currentResidentList = new ArrayList();
		try {
			currentResidentList = MedrexClientManager.getInstance()
					.getMedicationHistoryTimes();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Iterator it = currentResidentList.iterator();
		newElements = new ArrayList<Object[]>();
		while (it.hasNext()) {
			Object[] obj = new Object[5];
			Object[] o = (Object[]) it.next();
			obj[0] = o[0];

			obj[1] = TIME_FORMATTER.format(o[1]).toString();

			newElements.add(obj);
		}

		historyList.setListData(newElements.toArray());
	}

	private void showCurrentSlotList() {
		List currentResidentList = new ArrayList();
		try {
			currentResidentList = MedrexClientManager.getInstance()
					.getCurrentSlotTime("");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Iterator it = currentResidentList.iterator();
		newElements = new ArrayList<Object[]>();
		while (it.hasNext()) {
			Object[] obj = new Object[5];
			Object[] o = (Object[]) it.next();
			obj[0] = o[0];
			String str1 = null, str2 = null;
			if (o[1] != null) {
				obj[1] = TIME_FORMATTER.format(o[1]).toString();
				str1 = (String) obj[1];
			}
			if (o[2] != null) {
				obj[2] = TIME_FORMATTER.format(o[2]).toString();
				str2 = (String) obj[2];
			}

			obj[3] = getHighlightedTimeSelection(str1, str2);
			obj[4] = ((Integer) o[3]).intValue();
			newElements.add(obj);
		}

		currentList.setListData(newElements.toArray());
	}

	protected void doUpdate() {
		topTabArea.setSize(getWidth(), topTabArea.getHeight());
		topBlueStrip.setSize(getWidth(), topBlueStrip.getHeight());
		defaultPanel.setSize(getWidth(), getHeight() - defaultPanel.getY());
		panelResiInfo.setLocation((int) (defaultPanel.getWidth() * 0.98f)
				- panelResiInfo.getWidth(), panelResiInfo.getY());
		this.repaint();
	}

	private String getHighlightedTimeSelection(String currentSlot,
			String nextSlot) {
		String tmp = "<html><body>";
		if (currentSlot != null) {
			tmp += "<font color='#ff0000'>" + currentSlot.toString()
					+ "</font>";
		}
		if (currentSlot != null && nextSlot != null) {
			tmp += " | ";
		}
		if (nextSlot != null) {
			tmp += nextSlot.toString();
		}
		tmp += "</body></html>";
		return tmp;
	}

}
