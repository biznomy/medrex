package medrex.client.main.physicanOrders.progressNotes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.vo.physicianOrders.ProgressNotes2;

import com.sX.frameFactory.FrameFactory;

public class PanelProgressNotes2 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8661942717640096753L;
	private JTextArea txtArea;
	private JPanel panel_3;
	int serial;
	private FrameProgressNotes2Dialog frameProgressNotes2Dialog;
	boolean drawMode;
	int x;
	int y;

	/**
	 * Create the panel
	 */
	public PanelProgressNotes2() {
		super();
		Global.panelProgressNotes2 = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(809, 800));
		setLayout(null);

		panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBorder(new LineBorder(Color.BLACK, 1, false));
		panel_3.setLayout(null);
		panel_3.setBounds(10, 72, 789, 360);

		panel_3.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(final MouseEvent arg0) {
				if (drawMode = true) {
					panel_3.getGraphics().drawLine(x, y, arg0.getX(),
							arg0.getY());
					x = arg0.getX();
					y = arg0.getY();
				}
			}
		});

		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(final MouseEvent arg0) {
				drawMode = true;
				x = arg0.getX();
				y = arg0.getY();
			}

			@Override
			public void mouseReleased(final MouseEvent e) {
				drawMode = false;
			}
		});

		add(panel_3);

		final JLabel prescriptionLabel = new JLabel();
		prescriptionLabel.setFont(new Font("", Font.BOLD, 20));
		prescriptionLabel.setText("PROGRESS NOTES");
		prescriptionLabel.setBounds(10, 10, 259, 34);
		add(prescriptionLabel);

		final JLabel notesLabel = new JLabel();
		notesLabel.setText("Notes");
		notesLabel.setBounds(10, 50, 122, 16);
		add(notesLabel);

		final JLabel notesLabel_1 = new JLabel();
		notesLabel_1.setText("Notes");
		notesLabel_1.setBounds(10, 449, 66, 16);
		add(notesLabel_1);

		final JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(10, 471, 789, 191);
		add(panel_2);

		txtArea = new JTextArea();
		txtArea.setBorder(new LineBorder(Color.black, 1, false));
		txtArea.setBounds(0, 0, 789, 191);
		panel_2.add(txtArea);

		final JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				frameProgressNotes2Dialog = (FrameProgressNotes2Dialog) FrameFactory
						.createWindowOfType(FrameProgressNotes2Dialog.class);
				SwingUtils.center(frameProgressNotes2Dialog);
				frameProgressNotes2Dialog.setTitle("Add New Medication");
				frameProgressNotes2Dialog.setModal(true);
				frameProgressNotes2Dialog.setVisible(true);
			}
		});
		button.setText("+");
		button.setBounds(760, 679, 39, 26);
		add(button);

		updateData();
	}

	public void updateData() {
		if (Global.currentPanelProgressNotesKey != 0) {
			ProgressNotes2 panelProgressNotes = null;

			try {
				panelProgressNotes = MedrexClientManager.getInstance()
						.getPanelProgressNote(
								Global.currentPanelProgressNotesKey);
				Global.selectedMedication = panelProgressNotes;
			} catch (Exception e) {

			}
			txtArea.setText(panelProgressNotes.getDoctorNotes());

		} else {
			// txtPhyMedicationD_1.setText("");
			// txtAa.setText("");
			// cmbFreq.setSelectedItem("");
			// cmbRR.setSelectedItem("");
			// txtPrn.setText("");
			// dcDateDC.setDate(null);
			// dcOrderDate.setDate(null);
			txtArea.setText("");
		}
	}

	public void doSave() {
		ProgressNotes2 panelProgressNotes = new ProgressNotes2();
		panelProgressNotes.setSerial(Global.currentPanelProgressNotesKey);
		if (Global.selectedMedication != null) {
			panelProgressNotes.setMedication(Global.selectedMedication
					.getMedication());
			panelProgressNotes.setAa(Global.selectedMedication.getAa());
			panelProgressNotes.setFrequency(Global.selectedMedication
					.getFrequency());
			panelProgressNotes.setRa(Global.selectedMedication.getRa());
			panelProgressNotes.setPrn(Global.selectedMedication.getPrn());
			panelProgressNotes.setDcDate(Global.selectedMedication.getDcDate());
			panelProgressNotes.setOrderDate(Global.selectedMedication
					.getOrderDate());
		}
		panelProgressNotes.setDoctorNotes(txtArea.getText());

		try {
			Global.currentPanelProgressNotesKey = MedrexClientManager
					.getInstance().insertOrUpdatePanelProgressNotes(
							panelProgressNotes);
		} catch (Exception e) {
		}
	}

	// public boolean doValidate() {
	// ValidationResult vRes = new ValidationResult();
	// ValidationResult temp;
	//
	// if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
	// txtPhyMedicationD_1, "Medication Field"))) {
	// vRes.addAllFrom(temp);
	// }
	// if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
	// txtAa, "Dosage Field"))) {
	// vRes.addAllFrom(temp);
	// }
	// if (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(cmbRR,
	// "Route Field"))) {
	// vRes.addAllFrom(temp);
	// }
	// if (!FieldValidation.isEmpty(temp =
	// FieldValidation.isAnySelected(cmbFreq, "Frequency Field"))) {
	// vRes.addAllFrom(temp);
	// }
	//		
	//		
	// if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(txtAa,
	// "Amount Administered Field"))) {
	// vRes.addAllFrom(temp);
	// }
	//		
	//		
	// if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
	// txtAa, "PRN Indicator Field"))) {
	// vRes.addAllFrom(temp);
	// }
	//		
	//		
	// if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmptyDate(
	// dcDateDC, "D/C Date Field"))) {
	// vRes.addAllFrom(temp);
	// }
	//		
	// if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmptyDate(
	// dcOrderDate, "Order Date Field"))) {
	// vRes.addAllFrom(temp);
	// }
	//		
	// System.out.println(FieldValidation.getMessages(vRes.getMessages()));
	//
	// if (!FieldValidation.isEmpty(vRes)) {
	// FieldValidation.Msgbox(vRes, "Physician ");
	// return false;
	// } else {
	//
	// //JOptionPane.showMessageDialog(this, "Saved successfully");
	// return true;
	// }
	//
	// }
}
