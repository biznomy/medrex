package medrex.client.main.resident.weight;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.admission.message.MessageSender;
import medrex.client.utils.FieldFormatter;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;
import medrex.commons.enums.GuiModes;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.resident.ResidentWeight;

import com.jgoodies.validation.ValidationResult;
import com.jgoodies.validation.util.PropertyValidationSupport;
import com.sX.swing.JxButton;
import com.toedter.calendar.JDateChooser;

public class PanelWeightPopUp extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6496753420241653444L;
	// private JxLayeredPanel panelLayer;
	private JTextField txtAmbulationType;
	private JRadioButton rbHoyerLift;
	private JRadioButton rbWalker;
	private JRadioButton rbBedScale;
	private JRadioButton rbChair;
	private JRadioButton rbWheelChair;
	private JDateChooser dcDate;
	private JFormattedTextField txtWeight;
	private ButtonGroup bgTraveller = new ButtonGroup();

	/**
	 * @param args
	 */
	public PanelWeightPopUp() {
		super();
		setLayout(new BorderLayout());
		setSize(new Dimension(410, 250));
		setBorder(new LineBorder(ColorConstants.DEF_COLOR, 4));
		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		add(panel, BorderLayout.CENTER);

		final JLabel dateLabel = new JLabel();
		dateLabel.setFont(new Font("Dailog", Font.BOLD, 12));
		dateLabel.setForeground(ColorConstants.DEF_COLOR);
		dateLabel.setText("Date");
		dateLabel.setBounds(38, 27, 66, 16);
		panel.add(dateLabel);

		final JLabel weightLabel = new JLabel();
		weightLabel.setForeground(ColorConstants.DEF_COLOR);
		weightLabel.setFont(new Font("Dailog", Font.BOLD, 12));
		weightLabel.setText("Weight");
		weightLabel.setBounds(38, 60, 66, 16);
		panel.add(weightLabel);

		dcDate = new JDateChooser();
		dcDate.setDateFormatString("MM/dd/yyyy");
		dcDate.setDate(MedrexClientManager.getServerTime());
		dcDate.setBounds(226, 23, 118, 20);
		panel.add(dcDate);

		txtWeight = new JFormattedTextField(FieldFormatter.FLOAT3DizitWithPrec1);
		txtWeight.setBounds(226, 59, 120, 20);
		txtWeight.setForeground(ColorConstants.DEF_COLOR);
		panel.add(txtWeight);

		final JxButton saveButton = new JxButton();
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (doValidate()) {
					doSave();
				} else {
					JOptionPane.showMessageDialog(null,
							"Please Re-weigh The Resident");
				}
				close();
			}
		});
		saveButton.setBackground(Color.WHITE);
		saveButton.setArc(0.4f);
		saveButton.setForeground(ColorConstants.DEF_COLOR);
		saveButton
				.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.setText("Save");
		saveButton.setBounds(38, 132, 118, 26);
		panel.add(saveButton);

		final JxButton cancelButton = new JxButton();
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		cancelButton.setBackground(Color.WHITE);
		cancelButton.setForeground(ColorConstants.DEF_COLOR);
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setBorder(new LineBorder(new Color(180, 188, 193), 1,
				false));
		cancelButton.setArc(0.4f);
		cancelButton.setText("Cancel");
		cancelButton.setForeground(ColorConstants.DEF_COLOR);
		cancelButton.setBounds(226, 132, 118, 26);
		panel.add(cancelButton);

		final JLabel ambulationTypeLabel = new JLabel();
		ambulationTypeLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		ambulationTypeLabel.setText("Ambulation Type");
		ambulationTypeLabel.setForeground(ColorConstants.DEF_COLOR);
		ambulationTypeLabel.setBounds(38, 97, 118, 14);
		panel.add(ambulationTypeLabel);

		txtAmbulationType = new JTextField();
		txtAmbulationType.setBounds(226, 95, 120, 20);
		panel.add(txtAmbulationType);
		txtAmbulationType.setEnabled(false);
		txtAmbulationType.setEditable(true);
		txtAmbulationType.setForeground(ColorConstants.DEF_COLOR);

		final JPanel panelAmbulation = new JPanel();
		panelAmbulation.setOpaque(false);
		panelAmbulation.setLayout(null);
		panelAmbulation.setPreferredSize(new Dimension(0, 50));
		panelAmbulation.setBounds(0, 164, 402, 37);
		panel.add(panelAmbulation);

		rbWheelChair = new JRadioButton();
		rbWheelChair.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (rbWheelChair.isSelected()) {
					txtAmbulationType.setText(getAmbulationWeight() + "");
				}
			}
		});
		rbWheelChair.setBackground(Color.WHITE);
		rbWheelChair.setActionCommand("1");
		bgTraveller.add(rbWheelChair);
		rbWheelChair.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		rbWheelChair.setFont(new Font("", Font.BOLD, 12));
		rbWheelChair.setOpaque(false);
		rbWheelChair.setText("Weel Chair");
		rbWheelChair.setBounds(10, 15, 89, 24);
		panelAmbulation.add(rbWheelChair);

		rbChair = new JRadioButton();
		rbChair.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (rbChair.isSelected()) {
					txtAmbulationType.setText(getAmbulationWeight() + "");
				}
			}
		});
		rbChair.setBackground(Color.WHITE);
		rbChair.setActionCommand("2");
		rbChair.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		rbChair.setFont(new Font("", Font.BOLD, 12));
		bgTraveller.add(rbChair);
		rbChair.setOpaque(false);
		rbChair.setText("Chair");
		rbChair.setBounds(95, 15, 55, 24);
		panelAmbulation.add(rbChair);

		rbBedScale = new JRadioButton();
		rbBedScale.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (rbBedScale.isSelected()) {
					txtAmbulationType.setText(getAmbulationWeight() + "");
				}
			}
		});
		rbBedScale.setBackground(Color.WHITE);
		rbBedScale.setActionCommand("3");
		rbBedScale.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		bgTraveller.add(rbBedScale);
		rbBedScale.setFont(new Font("", Font.BOLD, 12));
		rbBedScale.setOpaque(false);
		rbBedScale.setText("Bed Scale");
		rbBedScale.setBounds(156, 15, 82, 24);
		panelAmbulation.add(rbBedScale);

		rbWalker = new JRadioButton();
		rbWalker.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (rbWalker.isSelected()) {
					txtAmbulationType.setText(getAmbulationWeight() + "");
				}
			}
		});
		rbWalker.setBackground(Color.WHITE);
		rbWalker.setActionCommand("4");
		rbWalker.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		rbWalker.setFont(new Font("", Font.BOLD, 12));
		bgTraveller.add(rbWalker);
		rbWalker.setOpaque(false);
		rbWalker.setText("Walker");
		rbWalker.setBounds(244, 15, 68, 24);
		panelAmbulation.add(rbWalker);

		rbHoyerLift = new JRadioButton();
		rbHoyerLift.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (rbHoyerLift.isSelected()) {
					txtAmbulationType.setText(getAmbulationWeight() + "");
				}
			}
		});
		rbHoyerLift.setBackground(Color.WHITE);
		rbHoyerLift.setActionCommand("5");
		rbHoyerLift.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		rbHoyerLift.setFont(new Font("", Font.BOLD, 12));
		bgTraveller.add(rbHoyerLift);
		rbHoyerLift.setOpaque(false);
		rbHoyerLift.setText("Hoyer Lift");
		rbHoyerLift.setBounds(315, 15, 89, 24);
		panelAmbulation.add(rbHoyerLift);

		// panelLayer = new JxLayeredPanel();
		// panelLayer.setOpaque(false);
		// panelLayer.setBackground(Color.WHITE);
		// panelLayer.setLayout(null);
		// panelLayer.setBounds(226, 97, 133, 29);
		// panel.add(panelLayer);

		doUpdate();

	}

	private boolean doValidate() {
		try {
			ResidentWeight resWeight = MedrexClientManager.getInstance()
					.getResidentLatestWeight(Global.currentResidenceKey);
			if (resWeight != null) {
				double weight = resWeight.getWeight();
				if (!txtWeight.getText().equalsIgnoreCase("")) {
					if ((Double.parseDouble(txtWeight.getText()) < (weight - 5.0) || Double
							.parseDouble(txtWeight.getText()) > (weight + 5.0))) {
						return false;
					}
				}
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
		return true;
	}

	private void doUpdate() {
		// panelLayer.setLocked(true);
		if (Global.currentResidentWeightKey != 0) {
			ResidentWeight rw = null;
			try {
				rw = MedrexClientManager.getInstance().getResidentWeightRecord(
						Global.currentResidentWeightKey);
			} catch (Exception e) {

				e.printStackTrace();
			}
			txtWeight.setText(rw.getWeight() + "");
			dcDate.setDate(rw.getDateOfCreation());
		} else {
			txtAmbulationType.setText(0.0 + "");
		}

	}

	private void doSave() {
		ResidentWeight rw = new ResidentWeight();
		rw.setDateOfCreation(dcDate.getDate());
		if (!txtWeight.getText().equalsIgnoreCase("")) {
			rw.setWeight(Double.parseDouble(txtWeight.getText()));
		} else {
			rw.setWeight(0.0);
		}
		try {
			rw.setUser(MedrexClientManager.getInstance().getUser(
					Global.currentLoggedInUserKey));
		} catch (Exception e) {

			e.printStackTrace();
		}
		rw.setResidentId(Global.currentResidenceKey);
		rw.setSerial(Global.currentResidentWeightKey);
		try {
			Global.currentResidentWeightKey = MedrexClientManager.getInstance()
					.insertOrUpdateResidentWeight(rw);
		} catch (Exception e) {

			e.printStackTrace();
		}
		saveAlertMessages("Resident Weight Info !!!!");
	}

	public static void main(String[] args) {
		medrex.client.utils.SwingUtils.wrapInDialog(new PanelWeightPopUp())
				.setVisible(true);
	}

	public double getAmbulationWeight() {
		double weight = 0.0;
		if (SwingUtils.getSelectedButton(bgTraveller) == 1) {
			weight = 20.0;
		}
		if (SwingUtils.getSelectedButton(bgTraveller) == 2) {
			weight = 4.0;
		}
		if (SwingUtils.getSelectedButton(bgTraveller) == 3) {
			weight = 30.0;
		}
		if (SwingUtils.getSelectedButton(bgTraveller) == 4) {
			weight = 4.4;
		}
		if (SwingUtils.getSelectedButton(bgTraveller) == 5) {
			weight = 100.0;
		}
		return weight;
	}

	@Override
	public String getTitle() {

		return "Weight";
	}

	private void saveAlertMessages(String formName) {
		List<ValidationResult> vResList = new ArrayList<ValidationResult>();
		// for previous one month.
		int previousMonths = 1;
		ValidationResult vResOneMonth = null;
		ValidationResult vResSixMonth = null;
		try {
			ResidentWeight resWeightOneMonthBefore = MedrexClientManager
					.getInstance().getPreviousResidentWeightRecord(
							Global.currentResidenceKey, previousMonths);
			if (resWeightOneMonthBefore != null) {
				double weight = resWeightOneMonthBefore.getWeight();
				double perc = (weight * 0.05);
				double minRange = weight - perc;
				double maxRange = weight + perc;
				vResOneMonth = checkWeightRange(txtWeight, "Weight", minRange,
						maxRange, weight, perc, "One");
			}
			// for previous six months
			previousMonths = 6;
			ResidentWeight resWeightSixMonthsBefore = MedrexClientManager
					.getInstance().getPreviousResidentWeightRecord(
							Global.currentResidenceKey, previousMonths);
			if (resWeightSixMonthsBefore != null) {
				double weight = resWeightSixMonthsBefore.getWeight();
				double perc = (weight * 0.10);
				double minRange = weight - perc;
				double maxRange = weight + perc;
				vResSixMonth = checkWeightRange(txtWeight, "Weight", minRange,
						maxRange, weight, perc, "Six");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (vResSixMonth != null) {
			vResOneMonth.addWarning(vResSixMonth.getMessagesText());
		}
		if (vResOneMonth != null) {
			vResList.add(vResOneMonth);
		}

		/**
		 * Message Sender -class for sending messages containing Methods -
		 * getRecievers, send Message
		 **/
		MessageSender.sendMessage(vResList, formName, "Administrator");

	}

	public ValidationResult checkWeightRange(JTextField f, String name,
			double min, double max, double previousWeight, double changeperc,
			String months) {
		PropertyValidationSupport supp = new PropertyValidationSupport(f, name);
		if (!("".equalsIgnoreCase(f.getText()))) {
			double value = Double.parseDouble(f.getText());
			if (!((value > min) && (value < max)))

				if (months.equalsIgnoreCase("One")) {
					supp.addWarning(name, "has been changed from "
							+ previousWeight + " to " + value + " in last "
							+ months + " Month by : " + changeperc
							+ " Unit (5%)");
				}
			if (months.equalsIgnoreCase("Six")) {
				supp.addWarning(name, "has been changed from " + previousWeight
						+ " to " + value + " in last " + months
						+ " Month by : " + changeperc + " Unit (10%)");
			}

		}

		return supp.getResult();
	}
}
