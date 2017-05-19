package medrex.client.MedicationAndTreatment.RoutineTreatment;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import medrex.commons.enums.ColorConstants;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.physician.PhysicianForm;
import medrex.commons.vo.resident.ResidentAllergies;
import medrex.commons.vo.resident.ResidentDiagnosis;

import com.sX.swing.JxButton;

public class PanelResidentInfoTreatmentPopUp extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8952700442054812341L;
	private static final Border BORDER = new LineBorder(
			new Color(122, 154, 167), 2, false);
	private static final Color BACKGROUND = new Color(206, 221, 224, 250);
	private static final Color FOREGROUND = new Color(0, 69, 97);
	private static final Font FONT = new Font("Dialog", Font.BOLD, 13)
			.deriveFont(13.5f);
	private JxButton okButton;
	private JButton button;
	private String name;
	private List listOfObject = new ArrayList();
	private JLabel lblDetails;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	public PanelResidentInfoTreatmentPopUp(String name, List listOfObject) {
		super();
		this.name = name;
		this.listOfObject = listOfObject;
		setLayout(null);
		setSize(350, 338);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 350, 338);
		this.add(panel);

		okButton = new JxButton();
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		okButton.setText("OK");
		okButton.setFont(FONT);
		okButton.setBorderPainted(false);
		okButton.setArc(0.6f);
		okButton.setBorder(BORDER);
		okButton.setBackground(BACKGROUND);
		okButton.setForeground(FOREGROUND);
		okButton.setRolloverEnabled(true);
		okButton.setHorizontalAlignment(SwingConstants.CENTER);
		okButton.setBounds(102, 243, 91, 32);
		panel.add(okButton);

		lblDetails = new JLabel();
		lblDetails.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDetails.setPreferredSize(new Dimension(50, 50));
		lblDetails.setForeground(ColorConstants.DEF_COLOR);
		lblDetails.setText("<HTML><BODY>");

		if (this.name == "Diagnosis") {
			Iterator<ResidentDiagnosis> it = listOfObject.iterator();
			while (it.hasNext()) {
				ResidentDiagnosis dia = it.next();
				lblDetails.setText(lblDetails.getText() + dia.getName()
						+ "<BR>");
			}
		}
		if (this.name == "Allergies") {
			Iterator<ResidentAllergies> itr = listOfObject.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
				ResidentAllergies alli = itr.next();
				lblDetails.setText(lblDetails.getText() + alli.getName()
						+ "<BR>");
			}
		}
		if (this.name == "physician") {
			Iterator<PhysicianForm> phy = listOfObject.iterator();
			while (phy.hasNext()) {
				PhysicianForm phydata = phy.next();
				if (phydata.getPhyName() != null) {
					lblDetails.setText(lblDetails.getText()
							+ phydata.getPhyName() + "<BR>");
				}
			}
		}
		lblDetails.setBounds(34, 43, 223, 182);
		panel.add(lblDetails);

		final JLabel lblHeading = new JLabel();
		lblHeading.setFont(new Font("Dialog", Font.BOLD, 14));
		lblHeading.setForeground(ColorConstants.MED_COLOR);
		lblHeading.setText(this.getName());
		lblHeading.setBounds(87, 10, 120, 21);
		panel.add(lblHeading);
	}

	@Override
	public String getTitle() {
		return null;
	}

}
