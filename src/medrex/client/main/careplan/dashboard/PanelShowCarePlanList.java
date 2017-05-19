package medrex.client.main.careplan.dashboard;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admission.analyzer.CarePlanAnalyzerBean;

public class PanelShowCarePlanList extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7678545005136941363L;
	private JLabel label;

	public PanelShowCarePlanList(int residentId) {
		super();
		setLayout(null);
		setSize(760, 474);
		setModal(true);
		setAlwaysOnTop(true);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 760, 441);

		add(panel);

		final JLabel carePlanListLabel = new JLabel();
		carePlanListLabel.setFont(new Font("", Font.BOLD, 16));
		carePlanListLabel.setText("Care Plan List");
		carePlanListLabel.setBounds(287, 25, 154, 47);
		panel.add(carePlanListLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(49, 87, 646, 283);
		panel.add(scrollPane);

		final JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(49, 87, 687, 326);
		panel.add(panel_1);
		scrollPane.setViewportView(panel_1);

		label = new JLabel();
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setText("");
		label.setBounds(10, 10, 623, 260);
		panel_1.add(label);

		final JButton okButton = new JButton();
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				PanelShowCarePlanList.this.dispose();
			}
		});
		okButton.setText("OK");
		okButton.setBounds(311, 393, 106, 26);
		panel.add(okButton);

		doLoad(residentId);
	}

	private void doLoad(int residentId) {
		List<CarePlanAnalyzerBean> list = new ArrayList<CarePlanAnalyzerBean>();
		try {
			list = MedrexClientManager.getInstance()
					.getCarePlanAnalyzerByResidentId(residentId);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("List size + " + list.size());
		Iterator it = list.iterator();
		String str = "<html> ";
		while (it.hasNext()) {
			CarePlanAnalyzerBean carePlanRecord = (CarePlanAnalyzerBean) it
					.next();
			str = str + carePlanRecord.getFormName() + ", "
					+ carePlanRecord.getFormSubName() + ", "
					+ carePlanRecord.getMessage() + "<Br>";
		}
		label.setText(str + "</html>");
	}

	@Override
	public String getTitle() {
		return "Care Plan List";
	}

}
