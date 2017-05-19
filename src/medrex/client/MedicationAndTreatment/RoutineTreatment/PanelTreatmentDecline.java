package medrex.client.MedicationAndTreatment.RoutineTreatment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;
import medrex.commons.intf.PopUpView;

import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;

public class PanelTreatmentDecline extends PopUpView {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2886327376956443360L;

	public PanelTreatmentDecline() {
		super();
		setLayout(new BorderLayout());

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
		label.setText("Medication");
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
		reasonForDeclineLabel.setText("Reason For Decline");
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

		final JTextArea textArea = new JTextArea();
		textArea.setForeground(ColorConstants.DEF_COLOR);
		textArea.setFont(new Font("", Font.BOLD, 12));
		scrollPane.setViewportView(textArea);

		final JPanel panel_2 = new JPanel();
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setVgap(20);
		flowLayout_2.setHgap(50);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_2.setLayout(flowLayout_2);
		panel_2.setPreferredSize(new Dimension(0, 100));
		panel_2.setBackground(Color.WHITE);
		add(panel_2, BorderLayout.SOUTH);

		final JxComboBox comboBox = new JxComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "",
				"REFUSED", "LOA", "OTHER", "NPO", "HELD" }));
		comboBox.setName("");
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox.setArc(0.4f);
		comboBox.setForeground(ColorConstants.DEF_COLOR);
		comboBox.setBackground(Color.WHITE);
		comboBox.setPreferredSize(new Dimension(150, 30));
		panel_2.add(comboBox);

		final JxButton enterButton = new JxButton();
		enterButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
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

	public static void main(String ar[]) {
		SwingUtils.wrapInDialog(new PanelTreatmentDecline()).setVisible(true);
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Declining Medication";
	}

}
