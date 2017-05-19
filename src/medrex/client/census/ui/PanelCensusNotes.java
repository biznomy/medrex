package medrex.client.census.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.resident.census.CensusNotesJTable;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.census.CensusNotes;

import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;

public class PanelCensusNotes extends JPanel {

	private JxButton btnClose;
	private JxButton btnAddNotes;
	private JPanel panelSubMain;
	private JxPanel panelContent;
	private JPanel panelMain;
	final JTextArea txtNotes;

	private static final long serialVersionUID = 1L;

	public static final Color GREEN = new Color(34, 139, 34);
	public static final Color RED = Color.RED;
	public static final Color GRAY = Color.GRAY;
	public static final Color DEFAULT = Color.BLACK;
	private Date currentDate;
	private JxTable table;
	private medrex.client.main.resident.census.CensusNotesJTable censusJTableModal;
	private JLabel lblTitle;

	public PanelCensusNotes() {
		super();
		// setLayout(new BorderLayout());
		setLayout(null);
		setBorder(new EmptyBorder(40, 72, 75, 5));
		currentDate = MedrexClientManager.getServerTime();
		setBackground(GuiModes.CHANGE_SCREEN.getDefaultBackgroundColor());
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});
		setPreferredSize(new Dimension(800, 400));

		panelMain = new JPanel();
		panelMain.setBounds(0, 0, 800, 400);
		// final BorderLayout borderLayout = new BorderLayout();
		// borderLayout.setVgap(10);
		// borderLayout.setHgap(10);
		// panelMain.setLayout(borderLayout);
		panelMain.setLayout(null);
		panelMain.setOpaque(false);
		add(panelMain);

		lblTitle = new JLabel();
		// lblTitle.setPreferredSize(new Dimension(791, 35));
		lblTitle.setBounds(10, 4, 780, 35);
		lblTitle.setText("Census Notes:");
		lblTitle.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont()
				.deriveFont(28f));
		lblTitle.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		panelMain.add(lblTitle, BorderLayout.NORTH);

		panelSubMain = new JPanel();
		panelSubMain.setLayout(null);
		panelSubMain.setOpaque(false);
		// panelSubMain.setPreferredSize(new Dimension(628, 108));
		panelSubMain.setBounds(10, 45, 780, 345);
		panelMain.add(panelSubMain, BorderLayout.CENTER);

		// setSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
		// setPreferredSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
		// setSize(500,360);
		// panelMain.setBounds(SwingUtils.centerRectangle(this.getBounds(),
		// panelMain.getBounds()));
		try {
			// panelRight.setPreferredSize(new Dimension(175, 275));
		} catch (Exception e) {

		}
		// panelFooter.setPreferredSize(new Dimension(0, 103));
		/*
		 * final JPanel panelKeyboard = new JPanel();
		 * panelKeyboard.setVisible(false); panelKeyboard.setOpaque(false);
		 * panelKeyboard.setLayout(null); panelKeyboard.setBounds(10, 329, 187,
		 * 93); panelKeyboard.setPreferredSize(new Dimension(187, 93));
		 * panelFooterLeft.add(panelKeyboard);
		 * 
		 * final JLabel label = new JLabel(); label.setIcon(new
		 * ImageIcon("img\\keyboard1.gif"));
		 * label.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		 * label.setText(""); label.setBounds(0, 0, 187, 62);
		 * panelKeyboard.add(label);
		 * 
		 * final JLabel clickLabel = new JLabel();
		 * clickLabel.setHorizontalAlignment(SwingConstants.CENTER);
		 * clickLabel.setFont(new Font("", Font.BOLD, 14));
		 * clickLabel.setForeground
		 * (GuiModes.CHANGE_SCREEN.getDefaultForegroundColor());
		 * clickLabel.setText("Click here for Keyboard");
		 * clickLabel.setBounds(0, 68, 187, 25); panelKeyboard.add(clickLabel);
		 */
		/*
		 * btnCancel = new JxButton(); btnCancel.setArc(0.2f);
		 * btnCancel.addActionListener(new ActionListener() { public void
		 * actionPerformed(final ActionEvent e) { //
		 * Global.frameCensusFormsNew.showCensusStatus();
		 * Global.panelCensusMain.changeCard(PanelCountAuditMain.DEFAULT); } });
		 * btnCancel
		 * .setBackground(GuiModes.CHANGE_SCREEN.getControlBackgroundColor());
		 * btnCancel
		 * .setForeground(GuiModes.CHANGE_SCREEN.getControlForegroundColor());
		 * btnCancel.setHorizontalAlignment(SwingConstants.CENTER);
		 * btnCancel.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		 * btnCancel.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		 * btnCancel.setText("CANCEL"); btnCancel.setPreferredSize(new
		 * Dimension(100, 31)); // btnCancel.setBounds(517, 329, 200, 31);
		 * panelFooterRight.add(btnCancel);
		 * 
		 * btnSave = new JxButton(); btnSave.setArc(0.2f);
		 * btnSave.addActionListener(new ActionListener() { public void
		 * actionPerformed(final ActionEvent e) { if(doValidate()) { doSave();
		 * // Global.frameCensusFormsNew.showCensusStatus();
		 * Global.panelCensusMain.changeCard(PanelCountAuditMain.DEFAULT); } }
		 * }); btnSave
		 * .setBackground(GuiModes.CHANGE_SCREEN.getControlBackgroundColor());
		 * btnSave
		 * .setForeground(GuiModes.CHANGE_SCREEN.getControlForegroundColor());
		 * btnSave.setHorizontalAlignment(SwingConstants.CENTER);
		 * btnSave.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		 * btnSave.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		 * btnSave.setText("SAVE"); btnSave.setPreferredSize(new Dimension(100,
		 * 31)); // btnSave.setBounds(99, 329, 200, 31);
		 * panelFooterRight.add(btnSave);
		 */

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
		 * panel_3.add(btnClose);
		 */
		// btnPrevious.setBounds(603, 505, 100, 31);
		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor(), 1, false));
		scrollPane.setBounds(10, 0, 760, 252);
		panelSubMain.add(scrollPane);

		table = new JxTable();
		table.setRowHeight(24);
		table.setRowMargin(2);
		table.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont().deriveFont(14f));
		censusJTableModal = new CensusNotesJTable();
		table.setModel(censusJTableModal);

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (e.getClickCount() > 1) {
					int id = new Integer((String) censusJTableModal.getValueAt(
							table.getSelectedRow(), 3)).intValue();
					if (id != 0) {
						Global.currentCensusNotesKey = id;
						FrameCensusNotesAdd frameCensusNotesAdd = new FrameCensusNotesAdd();
						frameCensusNotesAdd.setModal(true);
						frameCensusNotesAdd.setVisible(true);

						updateCensusJTable();
					}
				}
			}
		});

		scrollPane.setViewportView(table);

		JScrollPane scrollPaneArea = new JScrollPane();
		scrollPaneArea.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		scrollPaneArea.setBounds(10, 258, 629, 77);
		panelSubMain.add(scrollPaneArea);

		txtNotes = new JTextArea();
		txtNotes.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		txtNotes.setFont(GuiModes.CHANGE_SCREEN.getControlFont()
				.deriveFont(16f));
		txtNotes.setWrapStyleWord(true);
		txtNotes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent arg0) {
				if (arg0.getClickCount() > 1) {
					Global.currentCensusNotesKey = 0;
					FrameCensusNotesAdd frameCensusNotesAdd = new FrameCensusNotesAdd();
					frameCensusNotesAdd.setModal(true);
					frameCensusNotesAdd.setVisible(true);

					updateCensusJTable();
				}

			}
		});
		txtNotes.setLineWrap(true);
		txtNotes.setBounds(10, 225, 455, 34);
		panelSubMain.add(txtNotes);
		scrollPaneArea.setViewportView(txtNotes);

		btnAddNotes = new JxButton();
		btnAddNotes.setPreferredSize(new Dimension(100, 31));
		btnAddNotes.setArc(0.2f);
		btnAddNotes.setText("ADD NOTES");
		btnAddNotes.setBounds(645, 258, 125, 35);
		btnAddNotes.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		btnAddNotes.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		btnAddNotes.setHorizontalAlignment(SwingConstants.CENTER);
		btnAddNotes.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		btnAddNotes.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());

		btnAddNotes.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				doSaveNotes();
			}
		});
		panelSubMain.add(btnAddNotes);

		btnClose = new JxButton();
		btnClose.setPreferredSize(new Dimension(100, 31));
		btnClose.setArc(0.2f);
		btnClose.setText("CLOSE");
		btnClose.setBounds(645, 300, 125, 35);
		btnClose.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		btnClose.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		btnClose.setHorizontalAlignment(SwingConstants.CENTER);
		btnClose.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		btnClose.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());

		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				doClose();
			}
		});
		panelSubMain.add(btnClose);

		updateCensusJTable();
	}

	public void doSaveNotes() {
		if (!txtNotes.getText().trim().equalsIgnoreCase("")) {
			CensusNotes censusNotes = new CensusNotes();
			censusNotes.setNotes(txtNotes.getText());
			censusNotes.setSerial(0);
			censusNotes.setStatusid(Global.currentCensusStatusId);
			censusNotes.setNotesDate(MedrexClientManager.getServerTime());
			censusNotes.setUsername(Global.currentLoggedInUserName);
			try {
				MedrexClientManager.getInstance().insertOrUpdateCensusNotes(
						censusNotes);
			} catch (Exception e) {

			}
			txtNotes.setText("");
			updateCensusJTable();
		} else {
			JOptionPane.showMessageDialog(null, "Please enter Notes");
		}
	}

	public void doClose() {
		Global.frameCensusNotes.dispose();
	}

	public void updateCensusJTable() {
		List censusRecords = new ArrayList();
		if (Global.currentCensusStatusId != 0) {
			try {
				censusRecords = MedrexClientManager.getInstance()
						.getCensusNotesForStatus(Global.currentCensusStatusId);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		censusJTableModal.setNewList(censusRecords);

		censusJTableModal.fireTableStructureChanged();
		table.updateUI();
		table.repaint();

	}

	protected void doUpdate() {

		if (getTopLevelAncestor() != null) {
			getTopLevelAncestor().repaint();
		} else {
			this.repaint();
		}
		// updateData();
		updateCensusJTable();
		// btnSave.setText("");
		// btnSave.setText("SAVE");
	}

}
