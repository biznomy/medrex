package medrex.client.carelog;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.GlobalSecurity;
import medrex.client.utils.SwingUtils;
import medrex.client.utils.controls.ChooseResidentList;
import medrex.commons.MedrexMain;
import medrex.commons.enums.SubAppTypes;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.careLog.CareLogMaster;
import medrex.commons.vo.others.Users;

import com.jgoodies.looks.plastic.Plastic3DLookAndFeel;
import com.sX.swing.JxButton;

public class PanelChooseCareLog extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JxButton panelLocomotionInUnit;
	private JButton btnUp;
	private JButton btnDown;
	private JButton btnPrevious;
	private JButton btnClose;
	private JPanel panel;

	private List<CareLogMaster> careLogMaster = null;
	private ChooseResidentList residentList;
	private int currentResidentKey = 0;

	public PanelChooseCareLog(final int residentId) {
		super();
		this.currentResidentKey = residentId;

		setLayout(new BorderLayout());
		// Global.panelChooseCareLog = this;

		// setBackground(new Color(176, 224, 230));
		setBackground(new Color(231, 239, 242));
		setPreferredSize(new Dimension(868, 768));
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});

		panel = new JPanel();
		// panel.setBackground(new Color(176, 224, 230));
		panel.setBackground(new Color(231, 239, 242));
		panel.setOpaque(false);
		panel.setLayout(null);
		add(panel);

		residentList = new ChooseResidentList();
		residentList.setFixedCellHeight(31);
		residentList.setFixedCellMargin(10);
		residentList.getJListComponent().setForeground(new Color(5, 65, 94));
		residentList.getJListComponent().setBackground(
				new Color(206, 221, 224, 250));
		residentList.getJListComponent().setFont(
				new Font("Dialog", Font.BOLD, 16));
		residentList.setBounds(161, 204, 632, 410);
		residentList.setPreferredSize(residentList.getBounds().getSize());
		residentList.setCellRenderer(residentList.new JxListCellRenderer() {
			@Override
			protected String getText(Object value) {
				/*
				 * if (value instanceof CareLog) { CareLog rm = (CareLog) value;
				 * Users user = null; try { user =
				 * MedrexClientManager.getInstance().getUser(rm.getDoneBy()); }
				 * catch (Exception e) {
				 * 
				 * } return rm.getDoneDate().toString() + " , " +
				 * user.getUserName(); } else { return super.getText(value); }
				 */

				if (value instanceof CareLogMaster) {
					CareLogMaster careLogMaster = (CareLogMaster) value;
					Users user = null;
					try {
						user = MedrexClientManager.getInstance().getUser(
								careLogMaster.getUserId());
					} catch (Exception e) {

					}
					return careLogMaster.getDate().toString() + " , "
							+ user.getUserName();
				} else {
					return super.getText(value);
				}

			}
		});
		residentList.getJListComponent().addListSelectionListener(
				new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent e) {
						if (!e.getValueIsAdjusting()) {
							CareLogMaster careLogMaster = (CareLogMaster) residentList
									.getJListComponent().getSelectedValue();
							if (careLogMaster != null) {
								PanelCareLogApplication panel = new PanelCareLogApplication(
										currentResidentKey, careLogMaster
												.getSerial());
								JDialog window = SwingUtils.wrapInDialog(panel);
								window.setUndecorated(true);
								window.setSize(Toolkit.getDefaultToolkit()
										.getScreenSize());
								window.setLocation(0, 0);
								panel.setDialog(window);
								close();
								window.setVisible(true);
							}
						}
					}
				});
		panel.add(residentList);
		// label_1.setEnabled(false);

		btnPrevious = new JButton(new ImageIcon("img/BACK.png"));
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		btnPrevious.setBounds(162, 637, 93, 29);
		panel.add(btnPrevious);

		btnClose = new JButton(new ImageIcon("img/close.png"));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		btnClose.setBounds(659, 637, 93, 29);
		panel.add(btnClose);

		panelLocomotionInUnit = new JxButton();
		panelLocomotionInUnit.setArc(0.6f);
		panelLocomotionInUnit.setForeground(new Color(5, 65, 94));
		panelLocomotionInUnit.setBackground(new Color(206, 221, 224, 250));
		panelLocomotionInUnit.setBorder(new LineBorder(new Color(5, 65, 94), 2,
				false));
		panelLocomotionInUnit.setLayout(null);
		panelLocomotionInUnit.setBackground(Color.WHITE);
		panelLocomotionInUnit.setText("NEW CARE LOG ENTRY");
		panelLocomotionInUnit.setBounds(161, 105, 601, 62);
		panelLocomotionInUnit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (GlobalSecurity.isUpdatePriviledge(SubAppTypes.CARELOG)) {
					/* New Care Log */
					PanelCareLogApplication panel = new PanelCareLogApplication(
							currentResidentKey, 0);
					JDialog window = SwingUtils.wrapInDialog(panel);
					window.setUndecorated(true);
					window.setSize(Toolkit.getDefaultToolkit().getScreenSize());
					window.setLocation(0, 0);
					panel.setDialog(window);
					close();
					window.setVisible(true);
				}
			}
		});

		panel.add(panelLocomotionInUnit);
		doLoad();
	}

	public void doUpdate() {
		if (getTopLevelAncestor() != null) {
			getTopLevelAncestor().repaint();
		} else {
			this.repaint();
		}
		doLoad();
		btnClose.setText("");
	}

	public void doLoad() {
		doSearch();
	}

	public void doSearch() {
		try {
			careLogMaster = MedrexClientManager.getInstance()
					.getCareLogMasterForResident(currentResidentKey);
			residentList.setListData(careLogMaster.toArray());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] a) {
		new MedrexMain().generalInitializations();
		try {
			UIManager.setLookAndFeel(new Plastic3DLookAndFeel());
		} catch (Exception e) {
			e.printStackTrace();
		}
		SwingUtils.wrapInFrame(new PanelChooseCareLog(12)).setVisible(true);
	}

	@Override
	public String getTitle() {
		return "Choose Care Log";
	}
}