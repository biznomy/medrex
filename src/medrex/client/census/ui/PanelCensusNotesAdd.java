package medrex.client.census.ui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.census.CensusNotes;

import com.sX.swing.JxButton;

public class PanelCensusNotesAdd extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5982642077049184353L;
	private JxButton btnClose;
	private JxButton btnSave;
	private JTextArea txtNotes;

	public PanelCensusNotesAdd() {
		super();
		// setLayout(new BorderLayout());
		setLayout(null);
		setBorder(new EmptyBorder(40, 72, 75, 5));
		setBackground(GuiModes.CHANGE_SCREEN.getDefaultBackgroundColor());
		setPreferredSize(new Dimension(700, 500));

		final JScrollPane scrollPaneArea = new JScrollPane();
		scrollPaneArea.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		scrollPaneArea.setBounds(10, 10, 680, 411);
		add(scrollPaneArea);

		txtNotes = new JTextArea();
		txtNotes.setFont(GuiModes.CHANGE_SCREEN.getControlFont()
				.deriveFont(16f));
		txtNotes.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		txtNotes.setLineWrap(true);
		txtNotes.setWrapStyleWord(true);
		scrollPaneArea.setViewportView(txtNotes);

		btnSave = new JxButton();
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				doSaveNotes();
			}
		});
		btnSave.setPreferredSize(new Dimension(100, 31));
		btnSave.setArc(0.2f);
		btnSave.setText("SAVE");

		btnSave.setBounds(220, 439, 124, 35);
		btnSave.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		btnSave.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		btnSave.setHorizontalAlignment(SwingConstants.CENTER);
		btnSave.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		btnSave.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());

		add(btnSave);

		btnClose = new JxButton();
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.frameCensusNotesAdd.dispose();
			}
		});
		btnClose.setPreferredSize(new Dimension(100, 31));
		btnClose.setArc(0.2f);
		btnClose.setText("CLOSE");
		btnClose.setBounds(354, 439, 124, 35);

		btnClose.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		btnClose.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		btnClose.setHorizontalAlignment(SwingConstants.CENTER);
		btnClose.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		btnClose.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());

		add(btnClose);

		if (Global.currentCensusNotesKey != 0) {
			try {
				CensusNotes censusNotes = MedrexClientManager.getInstance()
						.getCensusNotes(Global.currentCensusNotesKey);
				txtNotes.setText(censusNotes.getNotes());
			} catch (Exception e) {

			}
		}

	}

	public void doSaveNotes() {
		if (!txtNotes.getText().trim().equalsIgnoreCase("")) {
			CensusNotes censusNotes = new CensusNotes();
			censusNotes.setNotes(txtNotes.getText());
			censusNotes.setSerial(Global.currentCensusNotesKey);
			censusNotes.setStatusid(Global.currentCensusStatusId);
			censusNotes.setNotesDate(MedrexClientManager.getServerTime());
			censusNotes.setUsername(Global.currentLoggedInUserName);
			try {
				MedrexClientManager.getInstance().insertOrUpdateCensusNotes(
						censusNotes);
			} catch (Exception e) {

			}
			txtNotes.setText("");
			Global.frameCensusNotesAdd.dispose();
		} else {
			JOptionPane.showMessageDialog(null, "Please enter Notes");
		}
	}

}
