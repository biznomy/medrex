package medrex.client.main.resident;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JViewport;

import medrex.client.constants.Global;
import medrex.client.constants.GlobalSecurity;
import medrex.client.main.physicanOrders.physicianOrderScreen.PanelPhysicianOrderDetails;
import medrex.client.main.physicanOrders.physicianOrderScreen.PanelPhysicianOrderDetails.DiagonisMode;
import medrex.client.main.resident.ADL.PanelResidentADLScheduling;
import medrex.client.main.resident.allergies.PanelResidentAllergies;
import medrex.client.main.resident.census.PanelCensusResident;
import medrex.client.main.resident.changeRoom.PanelChangeRoomForm;
import medrex.client.main.resident.contactinfo.PanelResidentInfoContactMain;
import medrex.client.main.resident.diagnosis.PanelResidentDiagnosis;
import medrex.client.main.resident.personalInfo.PanelResidentPersonalInfo;
import medrex.client.main.resident.physician.PanelPhysicianTableForm;
import medrex.client.main.resident.provider.PanelResidentProviderRecord;
import medrex.client.main.resident.scan.PanelScanForm;
import medrex.client.main.resident.vital.PanelVitalForm;
import medrex.client.main.resident.weight.PanelWeightForm;
import medrex.client.main.resident.wounds.PanelWoundForm;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.SubAppTypes;

import com.sX.swing.JxPanel;

public class PanelResidentInfoGeneral extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8299690756345227820L;
	private JxPanel panelView;
	private JPanel panelTabs;
	public static int TAB_COUNT;

	private static final ImageIcon[] imgDefTabIcon = new ImageIcon[] {
			new ImageIcon("img/residenttabs/PERSONAL_INFO.png"),
			new ImageIcon("img/residenttabs/PAYER_INFO.png"),
			new ImageIcon("img/residenttabs/CONTACT_INFO.png"),
			new ImageIcon("img/residenttabs/PHYSICIANS.png"),
			new ImageIcon("img/residenttabs/PROVIDERS.png"),
			new ImageIcon("img/residenttabs/CENSUS.png"),
			new ImageIcon("img/residenttabs/DIAGNOSIS.png"),
			new ImageIcon("img/residenttabs/SCAN.png"),
			new ImageIcon("img/residenttabs/Room_high.png"),
			new ImageIcon("img/residenttabs/Allergies.png"),
			new ImageIcon("img/residenttabs/ADLScheduling.png"),
			new ImageIcon("img/residenttabs/Vital.png"),
			new ImageIcon("img/residenttabs/Weight.png"),
			new ImageIcon("img/residenttabs/Wounds.png") };

	private static final ImageIcon[] imgSelTabIcon = new ImageIcon[] {
			new ImageIcon("img/residenttabs/PERSONAL_INFO_high.png"),
			new ImageIcon("img/residenttabs/PAYER_INFO_high.png"),
			new ImageIcon("img/residenttabs/CONTACT_INFO_high.png"),
			new ImageIcon("img/residenttabs/PHYSICIANS_high.png"),
			new ImageIcon("img/residenttabs/PROVIDERS_high.png"),
			new ImageIcon("img/residenttabs/CENSUS_high.png"),
			new ImageIcon("img/residenttabs/DIAGNOSIS_high.png"),
			new ImageIcon("img/residenttabs/SCAN_high.png"),
			new ImageIcon("img/residenttabs/Room.png"),
			new ImageIcon("img/residenttabs/AllergiesHigh.png"),
			new ImageIcon("img/residenttabs/ADLSchedulingHigh.png"),
			new ImageIcon("img/residenttabs/VitalHigh.png"),
			new ImageIcon("img/residenttabs/WeightHigh.png"),
			new ImageIcon("img/residenttabs/WoundsHigh.png") };

	private JLabel tabLabels[];
	private JPanel tabViews[];
	private JViewport view;

	public PanelResidentInfoGeneral() {
		super();
		setPreferredSize(new Dimension(718, 500));
		setOpaque(false);
		setLayout(null);
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});

		TAB_COUNT = imgDefTabIcon.length;
		final JPanel panel = new JPanel();
		panel.setBounds(0, 20, 718, 448);
		panel.setSize(718, 500);
		panel.setLayout(null);
		panel.setOpaque(false);
		add(panel);

		SwingUtils.centerRectangle(this.getBounds(), panel.getBounds());

		panelTabs = new JPanel();
		panelTabs.setLayout(null);
		panelTabs.setBounds(0, 0, 718, 66);
		panelTabs.setOpaque(false);
		panel.add(panelTabs);

		tabLabels = new JLabel[TAB_COUNT];
		for (int i = 0, x = 7, y = 36; i < TAB_COUNT; i++) {
			final int index = i;
			tabLabels[i] = new JLabel(imgDefTabIcon[i]);
			Dimension size = new Dimension(imgDefTabIcon[i].getIconWidth(),
					imgDefTabIcon[i].getIconHeight());
			tabLabels[i].setSize(size);
			tabLabels[i].setPreferredSize(tabLabels[i].getSize());
			tabLabels[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					handleTabs(index);
				}
			});
			panelTabs.add(tabLabels[i]);

			/*
			 * reset x and y index when initiating next row (not calculating row
			 * here as the no. of tabs are static, but not dynamic) y index is
			 * maitained manually, so not calculated anywhere.
			 */
			if (i == 9) {
				x = 23;
				y = 6;
			}

			// setting location for the tab
			tabLabels[i].setLocation(x, y);

			/*
			 * updating x index ( required after setting location only )
			 */
			x += size.width - 12;
		}

		panelView = new JxPanel(1f);
		panelView.setLayout(null);
		panelView.setBounds(0, 67, 718, 410);
		panelView.setBackground(Color.WHITE);
		panelView.setBorder(null);
		panel.add(panelView);

		view = new JViewport();
		view.setBounds(0, 0, 718, 411);
		view.setOpaque(false);
		panelView.add(view);

		tabViews = new JPanel[TAB_COUNT];
		// doUpdate();
	}

	public void handleTabs(int index) {
		if (index > 0 && Global.IS_DEMO) {
			JOptionPane.showMessageDialog(this,
					"This functionality is not available!!!", "Medrex",
					JOptionPane.INFORMATION_MESSAGE);
			handleTabs(0);
			return;
		}

		for (int i = 0; i < tabLabels.length; i++) {
			panelTabs.setComponentZOrder(tabLabels[i], panelTabs
					.getComponentCount() - 1);
			tabLabels[i].setIcon(imgDefTabIcon[i]);
		}
		panelTabs.setComponentZOrder(tabLabels[index], 0);
		tabLabels[index].setIcon(imgSelTabIcon[index]);
		panelTabs.repaint();
		displayTabs(index);
	}

	public void displayTabs(int index) {
		// if (tabViews[index] == null) {
		tabViews[index] = getTab(index);
		// }
		tabViews[index].setOpaque(false);
		tabViews[index].firePropertyChange("DISPLAY_TAB", false, true);
		view.setView(tabViews[index]);
	}

	public void doUpdate() {
		// System.out.println("Global.currentInnerTab: "+Global.currentInnerTab);
		if (Global.currentInnerTab != 0) {
			handleTabs(Global.currentInnerTab);
		} else {
			handleTabs(0);
		}

	}

	public JPanel getTab(int index) {
		// System.out.println("index: "+index);
		if (Global.currentMainTab == 2) {
			index = 0;
		}
		Global.currentInnerTab = index;
		if (Global.currentResidenceKey == 0) {
			return (new PanelResidentPersonalInfo());
		}

		switch (index) {
		case 0:
			return (new PanelResidentPersonalInfo());
		case 1:
			if (Global.currentResidentStatus.equals("Active")) {
				if (GlobalSecurity
						.isViewPriviledge(SubAppTypes.RESIDENT_INFORMATION_PAYERINFO)) {
					JPanel panel = (new medrex.client.main.resident.payerInfoNew.PanelResidentInfoPayerMain());
					return panel;
				} else {
					handleTabs(0);
					return (new PanelResidentPersonalInfo());
				}
			}

			/*
			 * if(Global.currentResidentStatus.equals("Active")){ return (new
			 * medrex
			 * .client.main.resident.payerInfoNew.PanelResidentInfoPayerMain());
			 * // return (new PanelResidentInfoPayerMain()); }else{ return (new
			 * PanelResidentPersonalInfo()); }
			 */
		case 2:
			if (Global.currentResidentStatus.equals("Active")) {
				if (GlobalSecurity
						.isViewPriviledge(SubAppTypes.RESIDENT_INFORMATION_CONTACTINFO)) {
					JPanel panel = (new PanelResidentInfoContactMain(0));
					return panel;
				} else {
					handleTabs(0);
					return (new PanelResidentPersonalInfo());
				}
			}

			/*
			 * if(Global.currentResidentStatus.equals("Active")){ return (new
			 * PanelResidentInfoContactMain()); }else{ return (new
			 * PanelResidentPersonalInfo()); }
			 */

		case 3:
			if (Global.currentResidentStatus.equals("Active")) {
				if (GlobalSecurity
						.isViewPriviledge(SubAppTypes.RESIDENT_INFORMATION_PHYSICIAN)) {
					JPanel panel = (new PanelPhysicianTableForm());
					return panel;
				} else {
					handleTabs(0);
					return (new PanelResidentPersonalInfo());
				}
			}

			/*
			 * if(Global.currentResidentStatus.equals("Active")){ return (new
			 * PanelPhysicianTableForm()); }else{ return (new
			 * PanelResidentPersonalInfo()); }
			 */

		case 4:
			if (Global.currentResidentStatus.equals("Active")) {
				if (GlobalSecurity
						.isViewPriviledge(SubAppTypes.RESIDENT_INFORMATION_PROVIDERS)) {
					JPanel panel = (new PanelResidentProviderRecord());
					return panel;
				} else {
					handleTabs(0);
					return (new PanelResidentPersonalInfo());
				}
			}

			/*
			 * if(Global.currentResidentStatus.equals("Active")){ return (new
			 * PanelResidentProviderRecord()); }else{ return (new
			 * PanelResidentPersonalInfo()); }
			 */

		case 5:
			if (Global.currentResidentStatus.equals("Active")) {
				if (GlobalSecurity
						.isViewPriviledge(SubAppTypes.RESIDENT_INFORMATION_CENSUS)) {
					JPanel panel = (new PanelCensusResident());
					return panel;
				} else {
					handleTabs(0);
					return (new PanelResidentPersonalInfo());
				}
			}

			/*
			 * if(Global.currentResidentStatus.equals("Active")){ return (new
			 * PanelCensusResident()); }else{ return (new
			 * PanelResidentPersonalInfo()); }
			 */

		case 6:
			if (Global.currentResidentStatus.equals("Active")) {
				if (GlobalSecurity
						.isViewPriviledge(SubAppTypes.RESIDENT_INFORMATION_DIAGNOSIS)) {
					PanelPhysicianOrderDetails.mode = DiagonisMode.RESIDENT_DIAGONIS;
					JPanel panel = (new PanelResidentDiagnosis());
					return panel;
				} else {
					handleTabs(0);
					
					
					return (new PanelResidentPersonalInfo());
				}
			}

			/*
			 * if(Global.currentResidentStatus.equals("Active")){
			 * System.out.println("Creating Diagnosis: " +
			 * MedrexClientManager.getServerTime()); JPanel panel = (new
			 * PanelResidentDiagnosis());
			 * System.out.println("Created Diagnosis: " +
			 * MedrexClientManager.getServerTime()); return panel; }else{ return
			 * (new PanelResidentPersonalInfo()); }
			 */

		case 7:
			if (Global.currentResidentStatus.equals("Active")) {
				if (GlobalSecurity
						.isViewPriviledge(SubAppTypes.RESIDENT_INFORMATION_SCAN)) {
					JPanel panel = (new PanelScanForm());
					return panel;
				} else {
					handleTabs(0);
					return (new PanelResidentPersonalInfo());
				}
			}
			/*
			 * if(Global.currentResidentStatus.equals("Active")){ return (new
			 * PanelScanForm()); }else{ return (new
			 * PanelResidentPersonalInfo()); }
			 */
		case 8:
			if (Global.currentResidentStatus.equals("Active")) {
				if (GlobalSecurity
						.isViewPriviledge(SubAppTypes.RESIDENT_INFORMATION_ROOM)) {
					JPanel panel = (new PanelChangeRoomForm());
					return panel;
				} else {
					handleTabs(0);
					return (new PanelResidentPersonalInfo());
				}
			}

			/*
			 * if(Global.currentResidentStatus.equals("Active")){ return (new
			 * PanelChangeRoomForm()); }else{ return (new
			 * PanelResidentPersonalInfo()); }
			 */
		case 9:
			if (Global.currentResidentStatus.equals("Active")) {
				if (GlobalSecurity
						.isViewPriviledge(SubAppTypes.RESIDENT_INFORMATION_ALLERGIES)) {
					JPanel panel = (new PanelResidentAllergies());
					return panel;
				} else {
					handleTabs(0);
					return (new PanelResidentPersonalInfo());
				}
			}

			/*
			 * if(Global.currentResidentStatus.equals("Active")){ JPanel panel =
			 * (new PanelResidentAllergies()); return panel; }else{ return (new
			 * PanelResidentPersonalInfo()); }
			 */

		case 10:

			if (Global.currentResidentStatus.equals("Active")) {
				if (GlobalSecurity
						.isViewPriviledge(SubAppTypes.RESIDENT_INFORMATION_SCHEDULING)) {
					JPanel panel = (new PanelResidentADLScheduling());
					return panel;
				} else {
					handleTabs(0);
					return (new PanelResidentPersonalInfo());
				}
			}

			/*
			 * if(Global.currentResidentStatus.equals("Active")){ JPanel panel =
			 * (new PanelResidentADLScheduling()); return panel; }else{ return
			 * (new PanelResidentPersonalInfo()); }
			 */
		case 11:

			if (Global.currentResidentStatus.equals("Active")) {
				if (GlobalSecurity
						.isViewPriviledge(SubAppTypes.RESIDENT_INFORMATION_VITAL)) {
					JPanel panel = (new PanelVitalForm());
					return panel;
				} else {
					handleTabs(0);
					return (new PanelResidentPersonalInfo());
				}
			}

			/*
			 * if(Global.currentResidentStatus.equals("Active")){ JPanel panel =
			 * (new PanelVitalForm()); return panel; }else{ return (new
			 * PanelResidentPersonalInfo()); }
			 */
		case 12:

			if (Global.currentResidentStatus.equals("Active")) {
				if (GlobalSecurity
						.isViewPriviledge(SubAppTypes.RESIDENT_INFORMATION_WEIGHT)) {
					JPanel panel = (new PanelWeightForm());
					return panel;
				} else {
					handleTabs(0);
					return (new PanelResidentPersonalInfo());
				}
			}

			/*
			 * if(Global.currentResidentStatus.equals("Active")){ JPanel panel =
			 * (new PanelWeightForm()); return panel; }else{ return (new
			 * PanelResidentPersonalInfo()); }
			 */
		case 13:
			if (Global.currentResidentStatus.equals("Active")) {
				if (GlobalSecurity
						.isViewPriviledge(SubAppTypes.RESIDENT_INFORMATION_WOUNDS)) {
					JPanel panel = (new PanelWoundForm());
					return panel;
				} else {
					handleTabs(0);
					return (new PanelResidentPersonalInfo());
				}
			}

			/*
			 * if(Global.currentResidentStatus.equals("Active")){ JPanel panel =
			 * (new PanelWoundForm()); return panel; }else{ return (new
			 * PanelResidentPersonalInfo()); }
			 */

		default:
			return (new JPanel());
		}
	}

	public static void main(String arg[]) {
		SwingUtils.wrapInFrame(new PanelResidentInfoGeneral()).setVisible(true);
	}
}
