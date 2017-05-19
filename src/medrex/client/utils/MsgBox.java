package medrex.client.utils;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.jgoodies.validation.ValidationResult;
import com.jgoodies.validation.util.DefaultValidationResultModel;
import com.jgoodies.validation.view.ValidationResultViewFactory;

public final class MsgBox extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4371083045612875250L;
	private JButton okButton;
	private JPanel msgPanel;
	private List<String> errorList = null;

	/**
	 * @param args
	 */

	public MsgBox() {
		this(new JFrame());
	}

	public MsgBox(Window owner) {
		super(owner);
		getContentPane().setLayout(null);

		setPreferredSize(new Dimension(537, 189));
		setLocationRelativeTo(null);
		setBounds(0, 0, 537, 223);

		msgPanel = new JPanel();
		msgPanel.setLayout(null);
		msgPanel.setBounds(10, 10, 509, 139);
		getContentPane().add(msgPanel);

		okButton = new JButton();
		okButton.addActionListener(this);
		okButton.setText("Ok");
		okButton.setBounds(217, 155, 95, 24);
		getContentPane().add(okButton);
		setModal(true);
		SwingUtils.center(this);
	}

	public MsgBox(List<String> errorList) {
		super();
		getContentPane().setLayout(null);

		setPreferredSize(new Dimension(537, 189));
		setLocationRelativeTo(null);
		setBounds(0, 0, 537, 223);
		this.errorList = errorList;
		msgPanel = new JPanel();
		msgPanel.setLayout(null);
		msgPanel.setBounds(10, 10, 509, 139);
		getContentPane().add(msgPanel);

		okButton = new JButton();
		okButton.addActionListener(this);
		okButton.setText("Ok");
		okButton.setBounds(217, 155, 95, 24);
		getContentPane().add(okButton);

		SwingUtils.center(this);
		setModal(true);

	}

	public void actionPerformed(final ActionEvent e) {
		if (e.getActionCommand().equals("Ok")) {
			dispose();
		}
	}

	public void addPrompt(String prompt) {
		DefaultValidationResultModel resModal = new DefaultValidationResultModel();
		ValidationResult vr = new ValidationResult();
		vr.addWarning(prompt);
		resModal.setResult(vr);
		JComponent com = ValidationResultViewFactory
				.createReportTextPane(resModal);
		com.setBounds(new Rectangle(0, 0, msgPanel.getWidth(), msgPanel
				.getHeight()));
		msgPanel.add(com);
	}

	public void addValidationResult(ValidationResult vr) {
		DefaultValidationResultModel resModal = new DefaultValidationResultModel();
		resModal.setResult(vr);
		JComponent com = ValidationResultViewFactory.createReportList(resModal);
		com.setBounds(new Rectangle(0, 0, msgPanel.getWidth(), msgPanel
				.getHeight()));
		msgPanel.add(com);
	}

	public void addErrorList(List<String> errors) {
		Iterator itr = errors.iterator();
		String strError = "";
		while (itr.hasNext()) {
			strError += (String) itr.next() + "\n";
		}
		addPrompt(strError);
	}

}
