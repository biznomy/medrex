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
import medrex.commons.vo.historyAndPhysical.WeeklyWeightsFormRow;

import com.sX.frameFactory.FrameFactory;

public class PanelWeeklyWeightsFormRow extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1357266947054235679L;
	/**
	 * Create the panel
	 * 
	 */

	int serial;
	int key;

	JTextField txtName;
	JTextField txtRoom;
	JTextField txtPhysician;
	JTextField txtWPrior;
	JTextField txtW1;
	JTextField txtW2;
	JTextField txtW3;
	JTextField txtW4;
	JTextField txtWeights;
	JTextField txtScaleUsed;

	public PanelWeeklyWeightsFormRow(int num) {
		super();

		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(1500, 30));
		setLayout(null);

		final JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 1500, 30);
		add(panel_1);

		final JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 0, 248, 30);
		panel_1.add(panel_2);

		txtName = new JTextField();
		txtName.setBackground(Color.WHITE);
		txtName.setEditable(false);
		txtName.setBounds(36, 5, 202, 21);
		panel_2.add(txtName);

		final JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				WeeklyWeightsFormRow row = getValueObject();
				Global.currentWeeklyWeightsFormRow = row;
				openDialog();
			}
		});

		button.setText("+");
		button.setBounds(0, 2, 33, 26);
		panel_2.add(button);

		final JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(245, 0, 96, 30);
		panel_1.add(panel_2_1);

		txtRoom = new JTextField();
		txtRoom.setBackground(Color.WHITE);
		txtRoom.setEditable(false);
		txtRoom.setBounds(10, 4, 79, 21);
		panel_2_1.add(txtRoom);

		final JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBackground(Color.WHITE);
		panel_2_1_1.setBounds(338, 0, 146, 30);
		panel_1.add(panel_2_1_1);

		txtPhysician = new JTextField();
		txtPhysician.setBackground(Color.WHITE);
		txtPhysician.setEditable(false);
		txtPhysician.setBounds(10, 4, 126, 21);
		panel_2_1_1.add(txtPhysician);

		final JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1.setBounds(482, 0, 146, 30);
		panel_1.add(panel_2_1_1_1);

		txtWPrior = new JTextField();
		txtWPrior.setBackground(Color.WHITE);
		txtWPrior.setEditable(false);
		txtWPrior.setBounds(10, 4, 126, 21);
		panel_2_1_1_1.add(txtWPrior);

		final JPanel panel_2_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1_1.setBounds(626, 0, 146, 30);
		panel_1.add(panel_2_1_1_1_1);

		txtW1 = new JTextField();
		txtW1.setBackground(Color.WHITE);
		txtW1.setEditable(false);
		txtW1.setBounds(10, 4, 126, 21);
		panel_2_1_1_1_1.add(txtW1);

		final JPanel panel_2_1_1_1_2 = new JPanel();
		panel_2_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_2.setLayout(null);
		panel_2_1_1_1_2.setBackground(Color.WHITE);
		panel_2_1_1_1_2.setBounds(770, 0, 146, 30);
		panel_1.add(panel_2_1_1_1_2);

		txtW2 = new JTextField();
		txtW2.setBackground(Color.WHITE);
		txtW2.setEditable(false);
		txtW2.setBounds(10, 4, 126, 21);
		panel_2_1_1_1_2.add(txtW2);

		final JPanel panel_2_1_1_1_3 = new JPanel();
		panel_2_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_3.setLayout(null);
		panel_2_1_1_1_3.setBackground(Color.WHITE);
		panel_2_1_1_1_3.setBounds(913, 0, 146, 30);
		panel_1.add(panel_2_1_1_1_3);

		txtW3 = new JTextField();
		txtW3.setBackground(Color.WHITE);
		txtW3.setEditable(false);
		txtW3.setBounds(10, 4, 126, 21);
		panel_2_1_1_1_3.add(txtW3);

		final JPanel panel_2_1_1_1_4 = new JPanel();
		panel_2_1_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_4.setLayout(null);
		panel_2_1_1_1_4.setBackground(Color.WHITE);
		panel_2_1_1_1_4.setBounds(1058, 0, 146, 30);
		panel_1.add(panel_2_1_1_1_4);

		txtW4 = new JTextField();
		txtW4.setBackground(Color.WHITE);
		txtW4.setEditable(false);
		txtW4.setBounds(10, 4, 126, 21);
		panel_2_1_1_1_4.add(txtW4);

		final JPanel panel_2_1_1_2 = new JPanel();
		panel_2_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_2.setLayout(null);
		panel_2_1_1_2.setBackground(Color.WHITE);
		panel_2_1_1_2.setBounds(1202, 0, 105, 30);
		panel_1.add(panel_2_1_1_2);

		txtScaleUsed = new JTextField();
		txtScaleUsed.setBackground(Color.WHITE);
		txtScaleUsed.setEditable(false);
		txtScaleUsed.setBounds(10, 4, 79, 21);
		panel_2_1_1_2.add(txtScaleUsed);

		final JPanel panel_2_1_1_2_1 = new JPanel();
		panel_2_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_2_1.setLayout(null);
		panel_2_1_1_2_1.setBackground(Color.WHITE);
		panel_2_1_1_2_1.setBounds(1305, 0, 163, 30);
		panel_1.add(panel_2_1_1_2_1);

		txtWeights = new JTextField();
		txtWeights.setBackground(Color.WHITE);
		txtWeights.setEditable(false);
		txtWeights.setBounds(10, 4, 143, 21);
		panel_2_1_1_2_1.add(txtWeights);

		serial = num;

		updateData(null);
	}

	public void updateData(WeeklyWeightsFormRow row) {
		// key = serial;
		setValueObject(row);
	}

	public void doSave() {
		WeeklyWeightsFormRow r = getValueObject();
		if (r != null) {
			Global.panelWeeklyWeightsForm.rows.add(r);
		}
	}

	private WeeklyWeightsFormRow getValueObject() {
		if (txtName.getText().equals("") && txtPhysician.getText().equals("")
				&& txtRoom.getText().equals("")
				&& txtScaleUsed.getText().equals("")
				&& txtW1.getText().equals("") && txtW2.getText().equals("")
				&& txtW3.getText().equals("") && txtW4.getText().equals("")
				&& txtWeights.getText().equals("")
				&& txtWPrior.getText().equals("")) {
			return null;
		} else {

			WeeklyWeightsFormRow row = new WeeklyWeightsFormRow();
			row.setRowSerial(serial);
			row.setSerial(key);
			row.setFormSerial(Global.currentWeeklyWeightsFormKey);
			row.setName(txtName.getText());
			row.setPhysician(txtPhysician.getText());
			row.setRoom(txtRoom.getText());
			row.setScaleUsed(txtScaleUsed.getText());
			row.setWeight(txtWeights.getText());
			row.setWeight1(txtW1.getText());
			row.setWeight2(txtW2.getText());
			row.setWeight3(txtW3.getText());
			row.setWeight4(txtW4.getText());
			row.setWeightPrior(txtWPrior.getText());
			return row;
		}
	}

	private void setValueObject(WeeklyWeightsFormRow ref) {
		if (ref != null) {
			if (ref.getSerial() != 0) {
				key = ref.getSerial();
			}
			txtName.setText(ref.getName());
			txtPhysician.setText(ref.getPhysician());
			txtRoom.setText(ref.getRoom());
			txtScaleUsed.setText(ref.getScaleUsed());
			txtW1.setText(ref.getWeight1());
			txtW2.setText(ref.getWeight2());
			txtW3.setText(ref.getWeight3());
			txtW4.setText(ref.getWeight4());
			txtWeights.setText(ref.getWeight());
			txtWPrior.setText(ref.getWeightPrior());
		}
	}

	private void openDialog() {
		FrameWeeklyWeightsFormRowDialog frame = (FrameWeeklyWeightsFormRowDialog) FrameFactory
				.createWindowOfType(FrameWeeklyWeightsFormRowDialog.class);

		frame.setModal(true);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		PanelWeeklyWeightsFormRowDialog dialogpanel = new PanelWeeklyWeightsFormRowDialog();

		frame.setSize(dialogpanel.getSize().width,
				dialogpanel.getSize().height + 40);
		SwingUtils.center(frame);
		frame.getContentPane().add(dialogpanel);
		frame.setVisible(true);
		setValueObject(Global.currentWeeklyWeightsFormRow);
		Global.currentWeeklyWeightsFormRow = null;
	}
}