package medrex.client.main.historyandphysical;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.vo.historyAndPhysical.CumulativeDiagnosisFormRow;

import com.sX.frameFactory.FrameFactory;

public class PanelCumulativeDiagnosisFormRow extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1833084538093802149L;
	/**
	 * Create the panel
	 */

	JTextField txtData1;
	JTextField txtData2;
	JTextField txtData3;

	int key;
	int serial;

	public PanelCumulativeDiagnosisFormRow(int num) {
		super();
		setBorder(new LineBorder(Color.black, 1, false));
		// Global.panelCumulativeDiagnosisFormRow = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(650, 30));
		setLayout(null);

		final JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 135, 30);
		add(panel);

		txtData1 = new JTextField();
		txtData1.setBounds(39, 5, 86, 20);
		panel.add(txtData1);

		final JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				CumulativeDiagnosisFormRow row = getValueObject();
				Global.currentCumulativeDiagnosisFormRow = row;
				openDialog();
			}
		});
		button.setText("+");
		button.setBounds(1, 1, 28, 28);
		panel.add(button);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1.setLayout(null);
		panel_1.setBounds(134, 0, 341, 30);
		add(panel_1);

		txtData2 = new JTextField();
		txtData2.setBounds(10, 5, 321, 20);
		panel_1.add(txtData2);

		final JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(474, 0, 176, 30);
		add(panel_2);

		txtData3 = new JTextField();
		txtData3.setBounds(10, 5, 156, 20);
		panel_2.add(txtData3);
		serial = num;
		updateData(null);
	}

	public void setValueObject(CumulativeDiagnosisFormRow ref) {
		if (ref != null) {
			if (ref.getSerial() != 0) {
				key = ref.getSerial();
			}
			txtData1.setText(ref.getData1());
			txtData2.setText(ref.getData2());
			txtData3.setText(ref.getData3());
		}
	}

	public CumulativeDiagnosisFormRow getValueObject() {
		if (txtData1.getText().equals("") && txtData2.getText().equals("")
				&& txtData3.getText().equals("")) {
			return null;
		} else {
			CumulativeDiagnosisFormRow row = new CumulativeDiagnosisFormRow();
			row.setFormSerial(Global.currentCumulativeDiagnosisFormKey);
			row.setRowSerial(serial);
			row.setSerial(key);
			row.setData1(txtData1.getText());
			row.setData2(txtData2.getText());
			row.setData3(txtData3.getText());
			return row;
		}
	}

	public void updateData(CumulativeDiagnosisFormRow row) {
		// key = serial;
		setValueObject(row);
	}

	private void openDialog() {
		FrameCumulativeDiagnosisFormRowDialog frame = (FrameCumulativeDiagnosisFormRowDialog) FrameFactory
				.createWindowOfType(FrameCumulativeDiagnosisFormRowDialog.class);
		frame.setModal(true);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		SwingUtils.center(frame);
		frame.setVisible(true);

		setValueObject(Global.currentCumulativeDiagnosisFormRow);
		Global.currentCumulativeDiagnosisFormRow = null;
	}

	public void doSave() {
		CumulativeDiagnosisFormRow r = getValueObject();
		if (r != null) {
			Global.panelCumulativeDiagnosisForm.rows.add(r);
		}
	}
}