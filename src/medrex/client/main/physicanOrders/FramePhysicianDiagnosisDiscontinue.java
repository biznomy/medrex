package medrex.client.main.physicanOrders;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldValidation;
import medrex.client.utils.SwingUtils;
import medrex.commons.vo.others.Users;

import com.jgoodies.validation.ValidationResult;
import com.toedter.calendar.JDateChooser;

public class FramePhysicianDiagnosisDiscontinue extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7222344399180944926L;
	private JTextArea txtRemarks;
	private JDateChooser dcEndDate;
	private boolean canceled;
	private Users discontinueUser;

	// private Date endDate;
	// private String remarks;

	public FramePhysicianDiagnosisDiscontinue() {
		super();
		setResizable(false);
		canceled = true;
		setModal(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Physician Diagnosis Discontinue");
		setSize(500, 235);
		SwingUtils.center(this);

		final JPanel panel = new JPanel();
		panel.setLayout(null);
		getContentPane().add(panel, BorderLayout.CENTER);

		final JLabel remarksLabel = new JLabel();
		remarksLabel.setText("Remarks");
		remarksLabel.setBounds(10, 42, 64, 14);
		panel.add(remarksLabel);

		txtRemarks = new JTextArea();
		txtRemarks.setBorder(new BevelBorder(BevelBorder.LOWERED));
		txtRemarks.setBounds(10, 62, 472, 104);
		panel.add(txtRemarks);

		final JLabel diagnosisEndDateLabel = new JLabel();
		diagnosisEndDateLabel.setText("Diagnosis End Date");
		diagnosisEndDateLabel.setBounds(10, 10, 122, 26);
		panel.add(diagnosisEndDateLabel);

		dcEndDate = new JDateChooser();
		dcEndDate.setDateFormatString("MM/dd/yyyy");
		dcEndDate.setBounds(138, 10, 149, 24);
		panel.add(dcEndDate);

		final JButton okButton = new JButton();
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (doValidate()) {
					disposeMe();
					canceled = false;
				}
			}
		});
		okButton.setFont(new Font("Dialog", Font.BOLD, 12));
		okButton.setText("Ok");
		okButton.setBounds(387, 172, 95, 24);
		panel.add(okButton);

		getUser();
	}

	private boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;
		if (dcEndDate.getDate() == null) {
			vRes.addError("End Date Field must not be empty");
		}
		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtRemarks, "Remarks Field"))) {
			vRes.addAllFrom(temp);
		}
		if (!FieldValidation.isEmpty(vRes)) {
			FieldValidation.Msgbox(vRes, "Physician Diagnosis Discontinue");
			return false;
		} else {
			return true;
		}
	}

	private void getUser() {
		Users user = null;
		try {
			user = MedrexClientManager.getInstance().getUser(
					Global.currentLoggedInUserKey);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		setDiscontinueUser(user);
	}

	private void disposeMe() {
		dispose();
		canceled = true;
	}

	public boolean isCanceled() {
		return canceled;
	}

	public Date getEndDate() {
		return dcEndDate.getDate();
	}

	public String getRemarks() {
		return txtRemarks.getText();
	}

	public Users getDiscontinueUser() {
		return discontinueUser;
	}

	public void setDiscontinueUser(Users discontinueUser) {
		this.discontinueUser = discontinueUser;
	}
}