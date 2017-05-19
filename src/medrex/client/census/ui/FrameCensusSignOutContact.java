package medrex.client.census.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.controls.PhoneField;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.masterList.Relation;
import medrex.commons.vo.resident.ResidentContact;
import medrex.commons.vo.resident.ResidentContactPhone;

import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxDrawPanel;

/**
 * @author D S Naruka
 * 
 */
public class FrameCensusSignOutContact extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3770260925553441711L;
	private PhoneField txtPhoneNumber;
	private JxComboBox cmbRelationship;
	private JTextField txtLastName;
	private JTextField txtFirstName;
	private JxDrawPanel panelSignature;

	public FrameCensusSignOutContact() {
		super();
		setSize(new Dimension(321, 302));
		setFocusableWindowState(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setUndecorated(false);
		setResizable(false);
		setName("censusContactInfo");
		setModal(true);
		setAlwaysOnTop(true);
		setTitle("Contact Info");

		final JPanel panel = new JPanel();
		panel
				.setBackground(GuiModes.DESIGNER_FORMS
						.getDefaultBackgroundColor());
		panel.setLayout(null);
		getContentPane().add(panel, BorderLayout.CENTER);

		final JLabel firstNameLabel = new JLabel();
		firstNameLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		firstNameLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		firstNameLabel.setText("First Name");
		firstNameLabel.setBounds(10, 8, 104, 25);
		panel.add(firstNameLabel);

		txtFirstName = new JTextField();
		txtFirstName.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		txtFirstName.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		txtFirstName.setBounds(115, 8, 191, 25);
		panel.add(txtFirstName);

		final JLabel lastNameLabel = new JLabel();
		lastNameLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		lastNameLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		lastNameLabel.setText("Last Name");
		lastNameLabel.setBounds(10, 39, 104, 25);
		panel.add(lastNameLabel);

		txtLastName = new JTextField();
		txtLastName.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		txtLastName.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		txtLastName.setBounds(115, 39, 191, 25);
		panel.add(txtLastName);

		cmbRelationship = new JxComboBox();
		cmbRelationship.setBackground(Color.WHITE);
		cmbRelationship.setArc(0.4f);
		cmbRelationship.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		cmbRelationship.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "Mother", "Father", "Brother", "Sister",
						"Brother-In-Law", "Sister-In-Law", "Case Manager",
						"Friend", "Daughter", "Son", "Other" }));
		cmbRelationship.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		cmbRelationship.setBounds(115, 70, 191, 25);
		panel.add(cmbRelationship);

		final JLabel relationshipLabel = new JLabel();
		relationshipLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		relationshipLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		relationshipLabel.setText("Relationship");
		relationshipLabel.setBounds(10, 70, 104, 25);
		panel.add(relationshipLabel);

		txtPhoneNumber = new PhoneField();
		txtPhoneNumber.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		txtPhoneNumber.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		txtPhoneNumber.setBounds(115, 101, 191, 25);
		panel.add(txtPhoneNumber);

		final JLabel phoneLabel = new JLabel();
		phoneLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		phoneLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		phoneLabel.setText("Phone");
		phoneLabel.setBounds(10, 101, 104, 25);
		panel.add(phoneLabel);

		final JLabel signatureLabel = new JLabel();
		signatureLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		signatureLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		signatureLabel.setText("Signature");
		signatureLabel.setBounds(10, 132, 104, 25);
		panel.add(signatureLabel);

		final JPanel panelSign = new JPanel();
		panelSign.setBorder(new CompoundBorder(GuiModes.DESIGNER_FORMS
				.getControlBorder(), new EmptyBorder(0, 0, 0, 0)));
		panelSign.setLayout(new BorderLayout());
		panelSign.setBounds(115, 132, 191, 63);
		panel.add(panelSign);

		panelSignature = new JxDrawPanel(296, 128);
		panelSign.add(panelSignature, BorderLayout.CENTER);

		final JxButton btnOk = new JxButton();
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {

				if (doValidate()) {

					Global.tmpContact = new ResidentContact();
					Global.tmpContactPhone = new ResidentContactPhone();

					Global.tmpContact.setLastName(txtLastName.getText());
					Global.tmpContact.setFirstName(txtFirstName.getText());
					int id = 0;
					try {
						id = MedrexClientManager.getInstance().getMasterList(
								Relation.class,
								cmbRelationship.getSelectedItem().toString()
										.trim());
					} catch (Exception e) {
					}
					Relation relation = new Relation();
					relation.setId(id);
					relation.setMsterName(cmbRelationship.getSelectedItem()
							.toString().trim());
					Global.tmpContact.setRelationship(relation);
					Global.tmpContact.setSignature(panelSignature
							.getImageIcon());
					Global.tmpContactPhone
							.setNumber(txtPhoneNumber.getNumber());

					doClose();
				}
			}
		});
		btnOk.setArc(0.2f);
		btnOk.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		btnOk
				.setForeground(GuiModes.DESIGNER_FORMS
						.getControlForegroundColor());
		btnOk
				.setBackground(GuiModes.DESIGNER_FORMS
						.getControlBackgroundColor());
		btnOk.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnOk.setText("Ok");
		btnOk.setBounds(153, 232, 73, 26);
		panel.add(btnOk);

		final JxButton btnCancel = new JxButton();
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doClose();
			}
		});
		btnCancel.setArc(0.2f);
		btnCancel.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		btnCancel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnCancel.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnCancel.setText("Cancel");
		btnCancel.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnCancel.setBounds(232, 232, 73, 26);
		panel.add(btnCancel);

		doUpdate();
	}

	public void doUpdate() {
		if (Global.tmpContact != null) {
			txtFirstName.setText(Global.tmpContact.getFirstName());
			txtLastName.setText(Global.tmpContact.getLastName());
			cmbRelationship.setSelectedItem(Global.tmpContact.getRelationship()
					.toString());
			if (Global.tmpContactPhone != null) {
				txtPhoneNumber.setNumber(Global.tmpContactPhone.getNumber());
			}

		}
	}

	public String getFirstName() {
		return txtFirstName.getText();
	}

	public String getLastName() {
		return txtLastName.getText();
	}

	public String getRelationship() {
		return cmbRelationship.getSelectedItem().toString();
	}

	public String getPhone() {
		return txtPhoneNumber.getNumber();
	}

	public ImageIcon getSignature() {
		return panelSignature.getImageIcon();
	}

	public void setValues(String firstName, String lastName,
			String relationship, String phoneNumber, ImageIcon signature) {
		try {
			txtFirstName.setText(firstName);
			txtLastName.setText(lastName);
			if (relationship != null) {
				cmbRelationship.setSelectedItem(relationship);
			}
			txtPhoneNumber.setNumber(phoneNumber);
			panelSignature.setImagefromImageIcon(signature);
		} catch (Exception e) {

		}
	}

	public void doClose() {
		this.dispose();
	}

	boolean doValidate() {
		String msg = "";
		if (txtFirstName.getText().equalsIgnoreCase("")) {
			msg += "Please Enter First Name \n";
		}
		System.out.println(cmbRelationship.getSelectedItem());
		if ((cmbRelationship.getSelectedItem() == null)) {
			msg += "Please Enter Relationship \n";
		}
		if (txtPhoneNumber.getNumber().equals("")) {
			msg += "Please Enter Phone Number \n";
		}
		if (!msg.equals("")) {
			JOptionPane.showMessageDialog(this, msg,
					"Please Enter Contact Info", JOptionPane.OK_OPTION);
			return false;
		}
		return true;
	}

}
