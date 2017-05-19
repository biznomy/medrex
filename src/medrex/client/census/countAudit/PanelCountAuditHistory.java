package medrex.client.census.countAudit;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.census.countAudit.CountAudit;

import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;

public class PanelCountAuditHistory extends JPanel {

	private JPanel panelSubMain;
	private JxButton btnPrevious;
	private JxPanel panelContent;
	private JPanel panelMain;

	private static final long serialVersionUID = 1L;

	public static final Color GREEN = new Color(34, 139, 34);
	public static final Color RED = Color.RED;
	public static final Color GRAY = Color.GRAY;
	public static final Color DEFAULT = Color.BLACK;
	private Date currentDate;
	private JPanel panelFooter;
	private JxTable table;
	private CountAuditHistoryTableModal tableModal;
	private JLabel lblTitle;

	public PanelCountAuditHistory() {
		super();
		// setLayout(new BorderLayout());
		setLayout(null);
		setBorder(new EmptyBorder(10, 72, 75, 5));
		currentDate = MedrexClientManager.getServerTime();
		setBackground(GuiModes.CHANGE_SCREEN.getDefaultBackgroundColor());
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});
		setPreferredSize(new Dimension(868, 516));

		panelMain = new JPanel();
		panelMain.setBounds(72, 10, 790, 496);
		// final BorderLayout borderLayout = new BorderLayout();
		// borderLayout.setVgap(10);
		// borderLayout.setHgap(10);
		// panelMain.setLayout(borderLayout);
		panelMain.setLayout(null);
		panelMain.setOpaque(false);
		add(panelMain);

		lblTitle = new JLabel();
		// lblTitle.setPreferredSize(new Dimension(791, 35));
		lblTitle.setBounds(0, 0, 791, 35);
		lblTitle.setText("Census History:");
		lblTitle.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont()
				.deriveFont(28f));
		lblTitle.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		panelMain.add(lblTitle, BorderLayout.NORTH);

		panelSubMain = new JPanel();
		panelSubMain.setLayout(null);
		panelSubMain.setOpaque(false);
		panelSubMain.setBounds(0, 45, 791, 394);
		panelMain.add(panelSubMain, BorderLayout.CENTER);

		panelFooter = new JPanel();
		panelFooter.setLayout(new BorderLayout());
		panelFooter.setOpaque(false);
		panelFooter.setBounds(0, 445, 791, 51);
		panelMain.add(panelFooter, BorderLayout.SOUTH);

		final JPanel panelFooterLeft = new JPanel();
		panelFooterLeft.setOpaque(false);
		final FlowLayout flowLayout_1 = new FlowLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panelFooterLeft.setLayout(flowLayout_1);
		panelFooter.add(panelFooterLeft);

		final JPanel panelKeyboard = new JPanel();
		panelKeyboard.setVisible(false);
		panelKeyboard.setOpaque(false);
		panelKeyboard.setLayout(null);
		panelKeyboard.setBounds(10, 329, 187, 93);
		panelKeyboard.setPreferredSize(new Dimension(187, 93));
		panelFooterLeft.add(panelKeyboard);

		final JLabel label = new JLabel();
		label.setIcon(new ImageIcon("img\\keyboard1.gif"));
		label.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		label.setText("");
		label.setBounds(0, 0, 187, 62);
		panelKeyboard.add(label);

		final JLabel clickLabel = new JLabel();
		clickLabel.setHorizontalAlignment(SwingConstants.CENTER);
		clickLabel.setFont(new Font("", Font.BOLD, 14));
		clickLabel.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		clickLabel.setText("Click here for Keyboard");
		clickLabel.setBounds(0, 68, 187, 25);
		panelKeyboard.add(clickLabel);

		final JPanel panelFooterRight = new JPanel();
		panelFooterRight.setOpaque(false);
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setHgap(10);
		flowLayout.setVgap(10);
		panelFooterRight.setLayout(flowLayout);
		panelFooter.add(panelFooterRight);

		/*
		 * btnClose = new JxButton(); btnClose.setArc(0.2f);
		 * btnClose.setBackground
		 * (GuiModes.CHANGE_SCREEN.getControlBackgroundColor());
		 * btnClose.setForeground
		 * (GuiModes.CHANGE_SCREEN.getControlForegroundColor());
		 * btnClose.setHorizontalAlignment(SwingConstants.CENTER);
		 * btnClose.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		 * btnClose.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		 * btnClose.addActionListener(new ActionListener() { public void
		 * actionPerformed(final ActionEvent e) { System.exit(0); } });
		 * btnClose.setText("CLOSE"); btnClose.setPreferredSize(new
		 * Dimension(100, 31)); // btnClose.setBounds(709, 505, 100, 31);
		 * panelFooterRight.add(btnClose);
		 */
		btnPrevious = new JxButton();
		btnPrevious.setArc(0.2f);
		btnPrevious.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		btnPrevious.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		btnPrevious.setHorizontalAlignment(SwingConstants.CENTER);
		btnPrevious.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		btnPrevious.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.panelCountAuditMain
						.changeCard(PanelCountAuditMain.DEFAULT);
			}
		});
		btnPrevious.setText("BACK");
		btnPrevious.setPreferredSize(new Dimension(100, 31));
		// btnPrevious.setBounds(603, 505, 100, 31);
		panelFooterRight.add(btnPrevious);

		panelContent = new JxPanel();
		panelContent.setBounds(0, 0, 780, 319);
		// panelContent.setPreferredSize(new Dimension(780, 319));
		panelContent.setBackground(GuiModes.CHANGE_SCREEN
				.getDefaultBackgroundColor());
		panelContent.setBorder(new LineBorder(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor(), 2, false));
		panelContent.setArc(1.0f);
		panelContent.setOpaque(false);
		panelContent.setLayout(new BorderLayout());
		panelContent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				panelContent.requestFocus();
			}
		});
		panelSubMain.add(panelContent);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor(), 1, false));
		// scrollPane.setBounds(10, 10, 678, 216);
		panelContent.add(scrollPane);

		table = new JxTable();
		table.setRowHeight(21);
		table.setRowMargin(2);
		table.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont().deriveFont(12f)
				.deriveFont(Font.PLAIN));
		tableModal = new CountAuditHistoryTableModal();
		table.setModel(tableModal);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					int id = (Integer) tableModal.getValueAt(table
							.getSelectedRow(), 6);
					String type = (String) tableModal.getValueAt(table
							.getSelectedRow(), 1);
					Global.currentCountAuditKey = id;
					Global.panelCountAuditMain.setFloorType(type);
					Global.panelCountAuditMain
							.changeCard(PanelCountAuditMain.FLOOR_WISE);
				}
			}
		});

		scrollPane.setViewportView(table);
		updateTable();
	}

	public void updateTable() {
		List<CountAudit> list = new ArrayList<CountAudit>();
		try {
			list = MedrexClientManager.getInstance().getCountAudits();
		} catch (Exception e) {
			e.printStackTrace();
		}
		tableModal.setNewList(list);
		tableModal.fireTableDataChanged();
		tableModal.fireTableStructureChanged();
		table.repaint();
	}

	protected void doUpdate() {
		int w = getWidth();
		int h = getHeight();
		float wF = ((float) w / 868);
		float hF = ((float) h / 592);
		// 72, 40, 791, 477
		panelMain.setBounds((int) (72 * wF), (int) (40 * hF), (int) (791 * wF),
				(int) (477 * hF));
		// 0, 0, 791, 35
		lblTitle.setBounds(0, 0, (int) (791 * wF), (int) (35 * hF));
		// 0, 45, 606, 319
		panelSubMain.setBounds(0, (int) (45 * hF), (int) (781 * wF),
				(int) (319 * hF));
		// 610, 45, 175, 319
		// panelRight.setBounds((int) (610 * wF), (int) (45 * hF), (int) (175 *
		// wF), (int) (319 * hF));
		// 0, 374, 791, 103
		panelFooter.setBounds((int) (0 * wF), (int) (374 * hF),
				(int) (791 * wF), (int) (103 * hF));
		// 0, 0, 666, 325
		panelContent.setBounds(SwingUtils.centerRectangle(panelSubMain
				.getBounds(), new Rectangle(0, 0, 780, 319)));

		if (getTopLevelAncestor() != null) {
			getTopLevelAncestor().repaint();
		} else {
			this.repaint();
		}

		updateTable();
	}
}