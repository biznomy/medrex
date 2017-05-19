package medrex.client.MedicationAndTreatment.PRNmedication;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.enums.ColorConstants;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.medicationCart.MedicationView;
import medrex.commons.vo.medicationCart.PRNmedication;

import com.sX.swing.JxButton;

public class PanelMedicationPRNReason extends PopUpView {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4845200461629515235L;
	private MedicationView medication = null;
	private JTextArea txtReason;

	public PanelMedicationPRNReason(MedicationView currentMedication) {
		super();
		setLayout(new BorderLayout());

		this.medication = currentMedication;
		setSize(500, 544);
		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setFont(new Font("", Font.BOLD, 16));
		final FlowLayout flowLayout = new FlowLayout();
		panel.setLayout(flowLayout);
		panel.setPreferredSize(new Dimension(200, 40));
		add(panel, BorderLayout.NORTH);

		final JLabel label = new JLabel();
		label.setFont(new Font("Dialog", Font.BOLD, 16));
		label.setForeground(ColorConstants.MED_COLOR);
		label.setText(medication.getMedication());
		panel.add(label);

		final JPanel panel_1 = new JPanel();
		final BorderLayout borderLayout = new BorderLayout();
		borderLayout.setVgap(20);
		borderLayout.setHgap(20);
		panel_1.setLayout(borderLayout);
		panel_1.setBackground(Color.WHITE);
		add(panel_1, BorderLayout.CENTER);

		final JLabel reasonForDeclineLabel = new JLabel();
		reasonForDeclineLabel.setHorizontalAlignment(SwingConstants.CENTER);
		reasonForDeclineLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		reasonForDeclineLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		reasonForDeclineLabel.setForeground(ColorConstants.DEF_COLOR);
		reasonForDeclineLabel.setText("Reason For PRN Medication");
		panel_1.add(reasonForDeclineLabel, BorderLayout.NORTH);

		JPanel scrollPanel = new JPanel();
		scrollPanel.setLayout(new FlowLayout());
		scrollPanel.setOpaque(false);
		panel_1.add(scrollPanel, BorderLayout.CENTER);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(400, 300));
		scrollPane
				.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 1, false));
		scrollPanel.add(scrollPane);

		txtReason = new JTextArea();
		txtReason.setForeground(ColorConstants.DEF_COLOR);
		txtReason.setFont(new Font("", Font.BOLD, 12));
		scrollPane.setViewportView(txtReason);

		final JPanel panel_2 = new JPanel();
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setVgap(20);
		flowLayout_2.setHgap(50);
		panel_2.setLayout(flowLayout_2);
		panel_2.setPreferredSize(new Dimension(0, 100));
		panel_2.setBackground(Color.WHITE);
		add(panel_2, BorderLayout.SOUTH);

		final JxButton enterButton = new JxButton();
		enterButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSave();
				Global.frameMedicationDashboard.setCurrentIndex(1);
				Global.frameMedicationDashboard.reDrawTheFrame();
				close();
			}
		});
		enterButton.setArc(0.4f);
		enterButton.setForeground(ColorConstants.DEF_COLOR);
		enterButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		enterButton.setBackground(Color.WHITE);
		enterButton.setPreferredSize(new Dimension(150, 30));
		enterButton.setText("ENTER");
		panel_2.add(enterButton);
	}

	protected void doSave() {
		PRNmedication prn = new PRNmedication();
		prn.setResidentId(Global.currentResidenceKey);
		prn.setMedicationName(medication.getMedication());
		prn.setDosage("" + medication.getDosage());
		prn.setFrequency(medication.getFrequency());
		prn.setMedSerial(medication.getMedicationId());
		prn.setRoute(medication.getRoute());
		prn.setResonForPrn(txtReason.getText());
		prn.setTimeStamp(MedrexClientManager.getServerTime());
		try {
			prn.setUser(MedrexClientManager.getInstance().getUser(
					Global.currentLoggedInUserKey));
			MedrexClientManager.getInstance().insertOrUpdatePRN(prn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Giving PRN Medication";
	}

}
