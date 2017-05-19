package medrex.client.medicationcart;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import medrex.client.FrameLogin;
import medrex.client.admin.userLogon.ControllerUserLogon;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.PanelResidentInformation;
import medrex.client.utils.controls.ChooseResidentList;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;

public class PanelChooseResident extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7882720046180555123L;
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

	public PanelChooseResident() {
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
		lastLoginLabel.setText("<html><b>Welcome </b>"
				+ Global.currentUserLastName + ", "
				+ Global.currentUserFirstName);

		logLabel = new JLabel();
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
		topBlueStrip.add(logLabel);
		logLabel.setText("Log off ");

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
		residentList.setCellRenderer(residentList.new JxListCellRenderer() {
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
						// nextButton.setVisible(panelResiInfo.isVisible());
					}
				});
		residentList.getJListComponent().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 1) {
					doNext();
				}
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				doNext();
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
		doLoad();
		doSearch();
		txtChooseResident.requestFocus();
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

	public void doLoad() {
		txtChooseResident.setText("");
	}
}
