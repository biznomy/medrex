package medrex.client.medicationcart;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import medrex.client.constants.Global;
import medrex.client.utils.MsgBoxTouchScreen;
import medrex.client.utils.SwingUtils;

public class FrameMedicationNotes extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4494961004333392825L;
	private JButton btnCancel;
	private JButton btnAccept;
	private JTextArea txtNurseNotes;
	private String nurseNotes;

	public FrameMedicationNotes() {
		super();
		Global.frameMedicationNotes = this;
		setUndecorated(true);
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		setModal(true);
		getContentPane().setLayout(null);
		getGlassPane().setBackground(Color.DARK_GRAY);
		getContentPane().setBackground(new Color(176, 224, 230));

		final JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 865, 455);
		panel.setBounds(SwingUtils.centerRectangle(this.getBounds(), panel
				.getBounds()));
		panel.setBackground(new Color(176, 224, 230));
		getContentPane().add(panel);

		final JLabel lblNotes = new JLabel();
		lblNotes.setFont(new Font("", Font.BOLD, 22));
		lblNotes.setText("Notes");
		lblNotes.setBounds(10, 10, 179, 46);
		panel.add(lblNotes);

		txtNurseNotes = new JTextArea();
		txtNurseNotes.setFont(new Font("", Font.BOLD, 18));
		txtNurseNotes.setBorder(new LineBorder(Color.BLUE, 5, false));
		txtNurseNotes.setMargin(new Insets(3, 3, 3, 3));
		txtNurseNotes.setBounds(10, 62, 848, 283);
		panel.add(txtNurseNotes);

		final JPanel keyBoardPanel = new JPanel();
		keyBoardPanel.setBackground(new Color(176, 224, 230));
		keyBoardPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent arg0) {
				try {

					Runtime
							.getRuntime()
							.exec(
									"C:\\Program Files\\Click-N-Type\\Click-N-Type.exe");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,
							"please install on virtual keyboard");
				}
			}
		});
		keyBoardPanel.setLayout(null);
		keyBoardPanel.setBounds(10, 351, 187, 93);
		panel.add(keyBoardPanel);

		final JLabel label = new JLabel(new ImageIcon("img\\keyboard1.gif"));
		label.setBounds(0, 0, 187, 62);
		keyBoardPanel.add(label);

		final JLabel clickLabel = new JLabel();
		clickLabel.setBounds(0, 68, 187, 25);
		keyBoardPanel.add(clickLabel);
		clickLabel.setBackground(new Color(176, 224, 230));
		clickLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		clickLabel.setText(" Click here for Keyboard");

		btnAccept = new JButton();
		btnAccept.setBorder(new LineBorder(new Color(34, 139, 34), 5, false));
		btnAccept.setText("Ok");
		btnAccept.setBounds(658, 365, 200, 80);
		btnAccept = new JButton();
		btnAccept.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (txtNurseNotes.getText().length() > 0) {
					nurseNotes = txtNurseNotes.getText();
					disposeMe();
				} else {
					MsgBoxTouchScreen.ShowPrompt(
							"Notes Field must not be empty!!!", "Nurse Notes");
				}
			}
		});
		btnAccept.setForeground(new Color(34, 139, 34));
		btnAccept.setBorder(new LineBorder(new Color(34, 139, 34), 5, false));
		btnAccept.setFont(new Font("", Font.BOLD, 28));
		btnAccept.setText("Ok");
		btnAccept.setBounds(506, 351, 157, 71);
		panel.add(btnAccept);

		btnCancel = new JButton();
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				nurseNotes = "";
				disposeMe();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnCancel.setForeground(Color.RED);
		btnCancel.setBorder(new LineBorder(Color.RED, 5, false));
		btnCancel.setText("Cancel");
		btnCancel.setBounds(669, 351, 189, 71);
		panel.add(btnCancel);
	}

	public void disposeMe() {
		this.dispose();
		setVisible(false);
	}

	public JDialog getFrame() {
		return this;
	}

	public String getNurseNotes() {
		return nurseNotes + "";
	}
}
