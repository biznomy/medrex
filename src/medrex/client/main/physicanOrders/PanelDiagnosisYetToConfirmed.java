package medrex.client.main.physicanOrders;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;
import medrex.commons.intf.PopUpView;

import com.sX.swing.JxButton;

public class PanelDiagnosisYetToConfirmed extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4204084252962739707L;
	/**
	 * @param args
	 */
	private boolean isAccepted;

	public boolean isAccepted() {
		return isAccepted;
	}

	public void setAccepted(boolean isAccepted) {
		this.isAccepted = isAccepted;
	}

	public static void main(String[] args) {
		SwingUtils.openInDialog(new PanelDiagnosisYetToConfirmed(null));
	}

	public PanelDiagnosisYetToConfirmed(List<String> notConfirmedYetList) {
		super();
		setLayout(null);
		setBackground(Color.WHITE);
		setBorder(new LineBorder(Color.black, 1, false));
		setSize(500, 320);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane
				.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 1, false));
		scrollPane.setBounds(49, 57, 390, 163);
		add(scrollPane);

		final JList jlist = new JList(notConfirmedYetList.toArray());
		jlist.setForeground(ColorConstants.DEF_COLOR);
		jlist.setFont(new Font("Arial", Font.BOLD, 12));
		scrollPane.setViewportView(jlist);

		final JCheckBox iConfirmAllCheckBox = new JCheckBox();
		iConfirmAllCheckBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		iConfirmAllCheckBox.setBackground(Color.WHITE);
		iConfirmAllCheckBox.setForeground(ColorConstants.DEF_COLOR);
		iConfirmAllCheckBox.setText("I CONFIRM ALL DIAGNOSIS AS LISTED ABOVE");
		iConfirmAllCheckBox.setBounds(49, 234, 330, 19);
		add(iConfirmAllCheckBox);

		final JxButton confirmAllButton = new JxButton();
		confirmAllButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		confirmAllButton.setArc(0.4f);
		confirmAllButton.setForeground(ColorConstants.DEF_COLOR);
		confirmAllButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (iConfirmAllCheckBox.isSelected()) {
					setAccepted(true);
					close();
				} else {
					setAccepted(false);
					JOptionPane.showMessageDialog(null, "Please Acknowledge");
				}
			}
		});
		confirmAllButton.setBackground(Color.WHITE);
		confirmAllButton.setText("Confirm All");
		confirmAllButton.setBounds(169, 259, 128, 30);
		add(confirmAllButton);

		final JLabel diagnosisLabel = new JLabel();
		diagnosisLabel.setForeground(ColorConstants.DEF_COLOR);
		diagnosisLabel.setFont(new Font("Arial", Font.BOLD, 16));
		diagnosisLabel.setHorizontalAlignment(SwingConstants.CENTER);
		diagnosisLabel.setText("DIAGNOSIS");
		diagnosisLabel.setBounds(140, 15, 187, 30);
		add(diagnosisLabel);
	}

	@Override
	public String getTitle() {

		return "Diagnosis Yet To Be Confirmed";
	}

}
