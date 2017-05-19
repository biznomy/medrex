package medrex.client.main.nursesNote;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;
import javax.swing.text.JTextComponent;

import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.vo.medication.DailySkilledNursesNotesRow;

import com.sX.frameFactory.FrameFactory;
import com.toedter.calendar.JDateChooser;

public class PanelDailySkilledNursesNotesRow extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1133755112886482318L;
	private JTextField txtSignature;
	private JTextField txtComment;
	private JDateChooser txtDateTime;
	int serial;
	int key;

	public PanelDailySkilledNursesNotesRow(int num) {

		super();
		// List<DailySkilledNursesNotesRow> rows=null;
		setLayout(null);
		setBounds(0, 0, 1122, 30);

		final JPanel panelRow = new JPanel();
		panelRow.setBorder(new LineBorder(Color.black, 1, false));
		panelRow.setBackground(Color.WHITE);
		panelRow.setLayout(null);
		panelRow.setBounds(0, 0, 1122, 30);
		add(panelRow);

		final JPanel PanelDateTime1 = new JPanel();
		PanelDateTime1.setBorder(new LineBorder(Color.black, 1, false));
		PanelDateTime1.setLayout(null);
		PanelDateTime1.setBounds(0, 0, 130, 30);
		panelRow.add(PanelDateTime1);

		/*
		 * 
		 * dcAssessmentDate = new JDateChooser();
		 * dcAssessmentDate.setDateFormatString("MM/dd/yyyy");
		 * dcAssessmentDate.setBackground(Color.WHITE);
		 * ((JTextComponent)dcAssessmentDate
		 * .getComponent(1)).setFocusable(false);
		 * dcAssessmentDate.remove(dcAssessmentDate.getComponent(0));
		 */
		txtDateTime = new JDateChooser();
		txtDateTime.setBackground(Color.WHITE);
		txtDateTime.setDateFormatString("yyyy/MM/dd hh:mm a");
		txtDateTime.setFocusable(false);
		((JTextComponent) txtDateTime.getComponent(1)).setFocusable(false);
		txtDateTime.remove(txtDateTime.getComponent(0));

		// txtDateTime.remove(txtDateTime.getComponent(1));
		txtDateTime.setBorder(new LineBorder(Color.black, 1, false));
		// txtDateTime.setDateFormatString("yyyy/MM/dd hh:mm a");
		txtDateTime.setBounds(25, 0, 104, 30);
		PanelDateTime1.add(txtDateTime);

		final JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.currentDailySkilledNursesNotesRow = getValueObject();
				openDialog();
			}
		});
		button.setBorder(new LineBorder(Color.black, 1, false));
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBackground(Color.WHITE);
		button.setText("+");
		button.setBounds(0, 0, 25, 30);
		PanelDateTime1.add(button);

		final JPanel PanelComment1 = new JPanel();
		PanelComment1.setBorder(new LineBorder(Color.black, 1, false));
		PanelComment1.setLayout(null);
		PanelComment1.setBounds(129, 0, 760, 30);
		panelRow.add(PanelComment1);

		txtComment = new JTextField();
		txtComment.setBackground(Color.WHITE);
		txtComment.setEditable(false);
		txtComment.setBorder(new LineBorder(Color.black, 1, false));
		txtComment.setBounds(0, 0, 760, 30);
		PanelComment1.add(txtComment);

		txtSignature = new JTextField();
		txtSignature.setBackground(Color.WHITE);
		txtSignature.setEditable(false);
		txtSignature.setBorder(new LineBorder(Color.black, 1, false));
		txtSignature.setBounds(888, 0, 234, 30);
		panelRow.add(txtSignature);
		serial = num;
		updateData(null);
	}

	public void updateData(DailySkilledNursesNotesRow row) {
		setValueObject(row);
	}

	private void openDialog() {
		FrameDailySkilledNursesNotesDialog frame = (FrameDailySkilledNursesNotesDialog) FrameFactory
				.createWindowOfType(FrameDailySkilledNursesNotesDialog.class);
		frame.setModal(true);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		PanelDailySkilledNursesNotedDialog dialogPanel = new PanelDailySkilledNursesNotedDialog();
		SwingUtils.center(frame);
		frame.getContentPane().add(dialogPanel, BorderLayout.CENTER);
		frame.setVisible(true);
		// setValueObject(Global.currentDoctorsProgressNotesFormRow);

		setValueObject(Global.currentDailySkilledNursesNotesRow);
		// Global.currentDoctorsProgressNotesFormRow = null;
		Global.currentDailySkilledNursesNotesRow = null;
	}

	public DailySkilledNursesNotesRow getValueObject() {
		if (txtDateTime.getDate() == null && txtComment.getText().equals("")
				&& txtSignature.getText().equals("")) {
			return null;
		} else {
			DailySkilledNursesNotesRow row = new DailySkilledNursesNotesRow();
			row.setSerial(key);
			row.setRowSerial(serial);
			row.setFormSerial(Global.currentDailySkilledNursesNotesForm2Key);
			if (!txtDateTime.getDate().equals("")) {
				row.setDateRecord(txtDateTime.getDate());
			}
			row.setComments(txtComment.getText());
			row.setSignature(txtSignature.getText());
			System.out.println("Row Values are" + row.getComments());
			System.out.println("Row Object is" + row);
			return row;

		}

	}

	public void setValueObject(DailySkilledNursesNotesRow ref) {
		// System.out.println("Ref is"+ref);
		if (ref != null) {
			if (ref.getSerial() != 0) {
				key = ref.getSerial();
			}
			// if (ref.getDateRecord() != null) {
			txtDateTime.setDate(ref.getDateRecord());
			// }
			txtComment.setText(ref.getComments());
			txtSignature.setText(ref.getSignature());
		}

	}

	public void doSave() {
		DailySkilledNursesNotesRow r = getValueObject();
		if (r != null) {
			Global.panelDailySkilledNursesNotesForm2.rows.add(r);
		}
	}
}
