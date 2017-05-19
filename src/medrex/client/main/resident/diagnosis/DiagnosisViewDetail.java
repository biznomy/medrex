package medrex.client.main.resident.diagnosis;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.resident.ResidentDiagnosis;

import com.sX.swing.JxButton;
import com.toedter.calendar.JDateChooser;

public class DiagnosisViewDetail extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3411967569609443975L;
	private JLabel lblConfirmOrDiscontinueBy1;
	private JLabel lblConfirmOrDiscontinueBy;
	private JLabel lblAddedBy;
	private static final Color DEF_COLOR = new Color(49, 107, 127);

	private JLabel lblStatus;
	private JLabel lblDiagnosis;
	private int id;
	private ResidentDiagnosis rd = null;

	private JDateChooser addedDate;

	public DiagnosisViewDetail(int id) {
		super();
		setPreferredSize(new Dimension(410, 290));
		setBackground(Color.WHITE);
		setLayout(null);
		setSize(406, 288);

		this.id = id;

		final JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 406, 288);
		add(panel);

		final JLabel diagnosisInfoLabel = new JLabel();
		diagnosisInfoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		diagnosisInfoLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		diagnosisInfoLabel.setBounds(10, 0, 386, 21);
		diagnosisInfoLabel.setText("Diagnosis Info");
		diagnosisInfoLabel.setForeground(DEF_COLOR);
		panel.add(diagnosisInfoLabel);

		final JLabel diagnosisLabel = new JLabel();
		diagnosisLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		diagnosisLabel.setText("Diagnosis:");
		diagnosisLabel.setBounds(10, 27, 70, 21);
		diagnosisLabel.setForeground(DEF_COLOR);
		panel.add(diagnosisLabel);

		lblDiagnosis = new JLabel();
		lblDiagnosis.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDiagnosis.setText("");
		lblDiagnosis.setBounds(86, 27, 244, 21);
		lblDiagnosis.setForeground(DEF_COLOR);
		panel.add(lblDiagnosis);

		final JLabel statusLabel = new JLabel();
		statusLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		statusLabel.setText("Status:");
		statusLabel.setBounds(10, 66, 54, 21);
		statusLabel.setForeground(DEF_COLOR);
		panel.add(statusLabel);

		lblStatus = new JLabel();
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStatus.setText("");
		lblStatus.setBounds(86, 65, 140, 21);
		lblStatus.setForeground(DEF_COLOR);
		panel.add(lblStatus);

		final JLabel changeAddedDateLabel = new JLabel();
		changeAddedDateLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		changeAddedDateLabel.setText("Change Added Date:");
		changeAddedDateLabel.setBounds(10, 105, 150, 21);
		changeAddedDateLabel.setForeground(DEF_COLOR);
		panel.add(changeAddedDateLabel);

		addedDate = new JDateChooser();
		addedDate.setDateFormatString("MM/dd/yyyy");
		addedDate.setBounds(166, 105, 105, 21);
		panel.add(addedDate);

		final JxButton changeButton = new JxButton(0.4f);
		changeButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doChage();
				close();
			}
		});
		changeButton.setText("Change");
		changeButton.setForeground(DEF_COLOR);
		changeButton.setBackground(Color.WHITE);
		changeButton.setFont(new Font("Dialog", Font.BOLD, 11));
		changeButton.setBounds(166, 230, 75, 27);
		panel.add(changeButton);

		final JxButton cancelButton = new JxButton(0.4f);
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		cancelButton.setText("Cancel");
		cancelButton.setForeground(DEF_COLOR);
		cancelButton.setBackground(Color.WHITE);
		cancelButton.setFont(new Font("Dialog", Font.BOLD, 11));
		cancelButton.setBounds(258, 231, 75, 24);
		panel.add(cancelButton);

		final JLabel addedByLabel = new JLabel();
		addedByLabel.setText("Added By:");
		addedByLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		addedByLabel.setForeground(DEF_COLOR);
		addedByLabel.setBounds(10, 143, 140, 21);
		panel.add(addedByLabel);

		lblAddedBy = new JLabel();
		lblAddedBy.setText("");
		lblAddedBy.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAddedBy.setForeground(DEF_COLOR);
		lblAddedBy.setBounds(166, 146, 230, 18);
		panel.add(lblAddedBy);

		lblConfirmOrDiscontinueBy = new JLabel();
		lblConfirmOrDiscontinueBy
				.setText("<html>Confirmed / <br>DiscontinuedBy:</html> ");
		lblConfirmOrDiscontinueBy.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblConfirmOrDiscontinueBy.setForeground(DEF_COLOR);
		lblConfirmOrDiscontinueBy.setBounds(10, 170, 140, 50);
		panel.add(lblConfirmOrDiscontinueBy);

		lblConfirmOrDiscontinueBy1 = new JLabel();
		lblConfirmOrDiscontinueBy1.setText("");
		lblConfirmOrDiscontinueBy1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblConfirmOrDiscontinueBy1.setForeground(DEF_COLOR);
		lblConfirmOrDiscontinueBy1.setBounds(166, 173, 230, 18);
		panel.add(lblConfirmOrDiscontinueBy1);

		doUpdate();
	}

	private void doChage() {
		rd.setDateCreated(addedDate.getDate());
		try {
			MedrexClientManager.getInstance().insertOrUpdateResidentDiagnosis(
					rd);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void doUpdate() {
		try {
			rd = MedrexClientManager.getInstance().getResidentDiagnosis(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (rd != null) {
			lblDiagnosis.setText(rd.getName());
			addedDate.setDate(rd.getDateCreated());
			if (rd.isDiscontinued()) {
				lblStatus.setText("Discontinue"); // Discontinue
				if (rd.getDiscontinueBy() != null) {
					lblConfirmOrDiscontinueBy1.setText(rd.getDiscontinueBy()
							.getUserName());
				}
			} else {
				lblStatus.setText(rd.isConfirmed() ? "Confirmed"
						: "Not Confirmed"); // C - Confirmed, NC - Not Confirmed
				if (rd.getConfirmedBy() != null) {
					lblConfirmOrDiscontinueBy1.setText(rd.getConfirmedBy()
							.getUserName());
				}
			}
			if (rd.getAddedBy() != null) {
				lblAddedBy.setText(rd.getAddedBy().getUserName());
			}
		}
	}

	@Override
	public String getTitle() {
		return "Diagnosis View";
	}

}
