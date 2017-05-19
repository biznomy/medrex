package medrex.client.census.countAudit;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.constants.Global;
import medrex.client.utils.controls.ChooseResidentList;
import medrex.commons.enums.GuiModes;

import com.sX.swing.JxButton;

public class PanelCountAuditFloors extends JPanel {

	private JPanel countAuditControls;
	private ChooseResidentList lstFloors;
	private JxButton btnHistory;
	private JLabel lblChooseFloor;

	private static final long serialVersionUID = 1L;

	public PanelCountAuditFloors() {
		super();
		setLayout(null);
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});
		setPreferredSize(new Dimension(868, 592));

		countAuditControls = new JPanel();
		countAuditControls.setOpaque(false);
		countAuditControls.setBounds(288, 66, 356, 372);
		countAuditControls.setLayout(null);
		add(countAuditControls);

		lblChooseFloor = new JLabel();
		lblChooseFloor.setHorizontalAlignment(SwingConstants.CENTER);
		lblChooseFloor.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		lblChooseFloor.setFont(new Font("", Font.BOLD, 28));
		lblChooseFloor.setText("CHOOSE FLOOR");
		lblChooseFloor.setBounds(0, 0, 294, 52);
		countAuditControls.add(lblChooseFloor);

		lstFloors = new ChooseResidentList();
		// lstFloors.setBorder(new
		// LineBorder(GuiModes.DESIGNER_SCREEN.getControlForegroundColor(), 2,
		// false));
		lstFloors.setFont(GuiModes.DESIGNER_SCREEN.getControlFont().deriveFont(
				16f));
		lstFloors.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		lstFloors.setBackground(Color.WHITE);
		lstFloors.setFixedCellHeight(52);
		lstFloors.setFixedCellMargin(10);
		lstFloors.setBounds(0, 58, 356, 248);
		lstFloors.getJListComponent().setForeground(
				GuiModes.DESIGNER_SCREEN.getControlForegroundColor());
		lstFloors.getJListComponent().setBackground(Color.WHITE);
		lstFloors.getJListComponent().setFont(
				GuiModes.DESIGNER_SCREEN.getControlFont().deriveFont(16f));
		// lstFloors.getJListComponent().setForeground(new Color(5, 65, 94));
		// lstFloors.getJListComponent().setBackground(new Color(206, 221, 224,
		// 250));
		// lstFloors.getJListComponent().setFont(new Font("Dialog", Font.BOLD,
		// 16));
		lstFloors.setPreferredSize(lstFloors.getBounds().getSize());
		lstFloors.setCellRenderer(lstFloors.new JxListCellRenderer() {
			@Override
			protected String getText(Object value) {
				return super.getText(value);
			}
		});
		lstFloors.getJListComponent().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 1) {
					String str = (String) lstFloors.getJListComponent()
							.getSelectedValue();
					Global.panelCountAuditMain.setFloorType(str);
					Global.panelCountAuditMain
							.changeCard(PanelCountAuditMain.FLOOR_WISE);
				}
			}
		});
		countAuditControls.add(lstFloors);

		btnHistory = new JxButton();
		btnHistory.setArc(0.2f);
		btnHistory.setText("VIEW REPORTS");
		btnHistory.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (btnHistory.isEnabled()) {
					Global.panelCountAuditMain.setFloorType(null);
					Global.panelCountAuditMain
							.changeCard(PanelCountAuditMain.REPORTS);
				}
			}
		});
		btnHistory.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		btnHistory.setFont(GuiModes.DESIGNER_SCREEN.getControlFont()
				.deriveFont(16f));
		btnHistory.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		btnHistory.setBackground(Color.WHITE);
		btnHistory.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor(), 2, false));
		btnHistory.setLayout(null);
		btnHistory.setBounds(0, 316, 294, 52);

		countAuditControls.add(btnHistory);

		updateList();
	}

	protected void doUpdate() {
		int w = getWidth();
		int h = getHeight();
		float wF = ((float) w / 868);
		float hF = ((float) h / 592);
		// 288, 66, 356, 372
		countAuditControls.setLocation((int) (288 * wF), (int) (66 * hF));

		if (getTopLevelAncestor() != null) {
			getTopLevelAncestor().repaint();
		} else {
			this.repaint();
		}
	}

	private void updateList() {
		List<String> floorList = new ArrayList<String>();

		floorList.add("1st floor");
		floorList.add("2nd floor");

		lstFloors.setListData(floorList.toArray());
	}
}