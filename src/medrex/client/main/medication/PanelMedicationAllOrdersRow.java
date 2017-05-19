package medrex.client.main.medication;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.commons.vo.medication.NurseMedicationNotesFormRow;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm3Row;

public class PanelMedicationAllOrdersRow extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2082899298594929443L;
	private JLabel lblStatus;
	private JLabel lblMedication;
	private static final Color GREEN = new Color(34, 139, 34);
	private static final Color RED = Color.RED;
	public int id;

	public PanelMedicationAllOrdersRow() {
		setSize(new Dimension(550, 100));
		setBorder(new LineBorder(Color.BLUE, 5, false));
		setLayout(null);
		setBackground(Color.WHITE);

		lblMedication = new JLabel();
		lblMedication.setFont(new Font("", Font.PLAIN, 24));
		// label.setText("Asprin - 125mg - 2");
		lblMedication.setBounds(10, 10, 530, 43);
		add(lblMedication);

		lblStatus = new JLabel();
		lblStatus.setText("");
		lblStatus.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStatus.setFont(new Font("", Font.BOLD, 14));
		// declinedLabel.setText("DECLINED on Nov 04, 2008 at 04:55 PM");
		lblStatus.setBounds(10, 71, 530, 19);
		add(lblStatus);
	}

	public void doUpdate(Object value1, Object value2) {
		if (value1 instanceof PhysicianOrderForm3Row) {
			if (value1 != null) {
				PhysicianOrderForm3Row ref = (PhysicianOrderForm3Row) value1;
				lblMedication.setText(ref.getPhyMedication() + " - "
						+ ref.getPhyDosage() + " - " + ref.getPhyFrequency());
			}
			if (value2 != null) {
				NurseMedicationNotesFormRow refNurse = (NurseMedicationNotesFormRow) value2;
				SimpleDateFormat df = new SimpleDateFormat("MMM dd, yyyy");
				if (refNurse.getDateRecord() != null) {
					lblStatus.setText(refNurse.getResult() + " on "
							+ df.format(refNurse.getDateRecord()) + " at "
							+ refNurse.getTimeRecord());
					lblStatus.setForeground(refNurse.getResult()
							.equalsIgnoreCase("Accepted") ? GREEN : RED);
				}
			}
		} else {
			if (value1 != null) {
				lblMedication.setText((String) value1);
			}
			if (value2 != null) {
				lblStatus.setText((String) value1);
			}
			if (value1 == null && value2 == null) {
				lblMedication.setText("");
				lblStatus.setText("");
			}
		}
		lblMedication.setSize(this.getSize().width - 20, lblMedication
				.getSize().height);
		lblStatus
				.setSize(this.getSize().width - 20, lblStatus.getSize().height);
	}

	public JLabel getLblMedication() {
		return lblMedication;
	}

	public JLabel getLblStatus() {
		return lblStatus;
	}

	public void setLblMedication(JLabel lblMedication) {
		this.lblMedication = lblMedication;
	}

	public void setLblStatus(JLabel lblStatus) {
		this.lblStatus = lblStatus;
	}
}
