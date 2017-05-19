package medrex.client.census.ui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldValidation;
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.census.CensusStatus;

import com.jgoodies.validation.ValidationResult;
import com.sX.swing.JxButton;

public class PanelCensusHospital extends PopUpView {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9006472714114482214L;
	private JTextArea txtNotes;
	private final boolean isMain;
	private JxButton btnSave;
	private JxButton btnCancel;

	public PanelCensusHospital(boolean isMain) {
		super();
		setLayout(null);
		this.isMain = isMain;
		setBackground(GuiModes.CHANGE_SCREEN.getDefaultBackgroundColor());
		final JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(GuiModes.CHANGE_SCREEN.getDefaultBackgroundColor());
		panel.setBounds(10, 10, 523, 150);
		add(panel);

		final JLabel notesLabel = new JLabel();
		notesLabel.setFont(new Font("Dialog", Font.PLAIN, 28));
		notesLabel.setText("Notes");
		notesLabel.setFont(GuiModes.CHANGE_SCREEN.getDefaultFont());
		notesLabel.setForeground(GuiModes.CHANGE_SCREEN
				.getDefaultForegroundColor());
		notesLabel.setBounds(10, 26, 94, 27);
		panel.add(notesLabel);

		txtNotes = new JTextArea();
		txtNotes.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		txtNotes.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		txtNotes.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		txtNotes.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtNotes.setBounds(110, 13, 403, 57);
		panel.add(txtNotes);

		btnCancel = new JxButton();
		btnCancel.setArc(0.2f);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doClose();
			}
		});
		btnCancel.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		btnCancel.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		btnCancel.setHorizontalAlignment(SwingConstants.CENTER);
		btnCancel.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		btnCancel.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		btnCancel.setText("Cancel");
		btnCancel.setBounds(318, 83, 100, 31);
		panel.add(btnCancel);

		btnSave = new JxButton();
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (doValidate()) {
					if (doSave()) {
						// Global.frameCensusFormsNew.showCensusStatus();
						if (PanelCensusHospital.this.isMain) {
							Global.panelCensusMain
									.changeCard(PanelCensusMain.DEFAULT);
						} else {
							close();
						}
					}
				}
			}
		});
		btnSave.setArc(0.2f);
		btnSave.setBackground(GuiModes.CHANGE_SCREEN
				.getControlBackgroundColor());
		btnSave.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		btnSave.setHorizontalAlignment(SwingConstants.CENTER);
		btnSave.setFont(GuiModes.CHANGE_SCREEN.getControlFont());
		btnSave.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		btnSave.setText("Save");
		btnSave.setBounds(183, 83, 100, 31);
		panel.add(btnSave);

		updateData();
	}

	protected boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		if (txtNotes.getText() == null) {
			vRes.addError("Notes is mandatory.");
		}

		if (!FieldValidation.isEmpty(vRes)) {
			FieldValidation.Msgbox(vRes, "Discharge to Other");
			return false;
		} else {
			// JOptionPane.showMessageDialog(this, "Saved successfully!!!");
			return true;
		}
	}

	protected boolean doSave() {
		int currentResidenceKey = 0;
		CensusStatus cs = null;
		if (isMain) {
			currentResidenceKey = Global.panelCensusMain.getResident()
					.getSerial();
		} else {
			currentResidenceKey = Global.currentResidenceKey;
		}
		System.out.println("key is " + currentResidenceKey);
		try {
			cs = MedrexClientManager.getInstance().getCensusLastDischarge(
					currentResidenceKey);
			MedrexClientManager.getInstance()
					.deleteCensusStatus(cs.getSerial());
		} catch (RemoteException e1) {
			e1.printStackTrace();
		} catch (MedrexException e1) {
			e1.printStackTrace();
		}

		cs.setSerial(0);
		cs
				.setNotes("Previously discharged to hospital and then discharged from hospital for following reason\n "
						+ txtNotes.getText());
		// cs.setSerial(Global.currentCensusStatusId);
		cs.setTypeName("Discharge");
		cs.setResidentId(currentResidenceKey);
		cs.setAdministeredBy(Global.currentLoggedInUserKey);
		cs.setFromId(4);
		try {
			MedrexClientManager.getInstance().insertOrUpdateCensusStatus(cs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	protected void doClose() {
		close();

	}

	@Override
	public String getTitle() {
		return "Discharge to Other";
	}

	public void updateData() {
		System.out.println("Hello");
		if (Global.currentCensusStatusId != 0) {
			CensusStatus cs = new CensusStatus();
			try {
				cs = MedrexClientManager.getInstance().getCensusStatus(
						Global.currentResidenceKey, "Other");
			} catch (RemoteException e) {
				e.printStackTrace();
			} catch (MedrexException e) {
				e.printStackTrace();
			}
			txtNotes.setText(cs.getNotes());
		}
	}

}
