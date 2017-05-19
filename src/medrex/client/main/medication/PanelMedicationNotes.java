package medrex.client.main.medication;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.util.Iterator;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.medication.MedicationNotes;
import medrex.commons.vo.medication.Templates;
import medrex.commons.vo.notes.Notes;

import com.sX.swing.htmlpad.JxHtmlPad;
import com.sX.swing.notes.JxNotes;

public class PanelMedicationNotes extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5987565912235655207L;
	private JList latestNotesList;
	private JList templatesList;
	private JxHtmlPad medicationNotes;
	private JButton button_1;
	private JxNotes notes;
	// If true then categories list and label will display otherwise not.
	private boolean isCategories = true;

	public PanelMedicationNotes() {
		super();

		Global.panelMedicationNotes = this;
		setPreferredSize(new Dimension(970, 580));
		setBounds(0, 0, 970, 580);
		setLayout(null);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 970, 580);
		add(panel);

		final JLabel notesLabel = new JLabel();
		notesLabel.setForeground(SystemColor.desktop);
		notesLabel.setFont(new Font("", Font.BOLD, 12));
		notesLabel.setText("Notes");
		notesLabel.setBounds(300, 10, 66, 16);
		panel.add(notesLabel);

		Notes defaultNotes = new Notes();
		defaultNotes.setFormName("Notes");
		defaultNotes.setUserId(Global.currentLoggedInUserKey);
		defaultNotes.setNoteText("");

		notes = new JxNotes(isCategories);
		notes.setNotes(defaultNotes);
		notes.setBounds(10, 35, 800, 480);
		panel.add(notes);

		updateData();
	}

	public void fillLists() {
		String strArr[] = new String[0];
		List tempList = null;
		try {
			tempList = MedrexClientManager.getInstance().getAllTemplates();
			Iterator itr = tempList.iterator();
			strArr = new String[tempList.size()];
			int i = 0;
			while (itr.hasNext()) {
				Templates templates = (Templates) itr.next();
				strArr[i] = templates.getTemplateText();
				i++;
			}
		} catch (Exception e) {

		}
		templatesList.setModel(new DefaultComboBoxModel(strArr));

		try {
			tempList = MedrexClientManager.getInstance().getTemplatesNoteText(
					Global.currentLoggedInUserKey, Global.currentResidenceKey);
			Iterator itr = tempList.iterator();
			strArr = new String[tempList.size()];
			int i = 0;
			while (itr.hasNext()) {
				// strArr [i]= medicationNotes.getNotesText();
				i++;
			}
		} catch (Exception e) {

		}
		latestNotesList.setModel(new DefaultComboBoxModel(strArr));
	}

	public void getTemplatesText() {
		medicationNotes.setFormattedText(templatesList.getSelectedValue() + "");
	}

	public void getLatestNotesText() {
		medicationNotes.setFormattedText(latestNotesList.getSelectedValue()
				+ "");
	}

	public void doSave() {
		try {
			MedrexClientManager.getInstance().insertOrUpdateNotes(
					notes.getNotes());
		} catch (Exception e) {
		}
		MedicationNotes mNotes = new MedicationNotes();
		if (Global.currentMedicationNotesFormKey != 0) {
			mNotes.setSerial(Global.currentMedicationNotesFormKey);
		}
		mNotes.setResidentId(Global.currentResidenceKey);
		mNotes.setUserId(Global.currentLoggedInUserKey);
		mNotes.setNotesDate(MedrexClientManager.getServerTime());
		mNotes.setNotes(notes.getNotes());
		try {
			Global.currentMedicationNotesFormKey = MedrexClientManager
					.getInstance().insertOrUpdateMedicationNotes(mNotes);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// JxNotesEditor ne = new JxNotesEditor(notes.getNotes());
		// ne.sendMail(ne.getTriggerWord());
		String str = notes.getTriggerWord();
		if (str != null) {
			notes.sendMail(str);
		}
	}

	public void updateData() {
		if (Global.currentMedicationNotesFormKey != 0) {
			MedicationNotes mNotes = null;
			try {
				mNotes = MedrexClientManager.getInstance().getMedicationNotes(
						Global.currentMedicationNotesFormKey);
			} catch (Exception e) {
			}
			notes.setNotes(mNotes.getNotes());
		}
	}

}
