package medrex.client.main.admission;

import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import medrex.client.constants.Global;

public class FrameResidentAssessmentFormPage19Dialog extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3679918574634071910L;
	public static final long SerialVersionUID = 1L;

	public FrameResidentAssessmentFormPage19Dialog() {
		super();
		Global.FrameResidentAssessmentFormPage19Dialog = this;
		setResizable(true);
		setTitle("NEUROLOGICAL ASSESSMENT");
		setBounds(100, 100, 602, 600);
		setPreferredSize(getSize());

		final JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);

		final JPanel panel = new medrex.client.main.admission.PanelResidentAssessmentFormPage19Dialog();
		scrollPane.setViewportView(panel);
		// getContentPane().add(panel,BorderLayout.CENTER);
	}

}
