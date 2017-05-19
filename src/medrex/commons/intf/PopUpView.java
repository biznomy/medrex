package medrex.commons.intf;

import javax.swing.JDialog;

public abstract class PopUpView extends AbstractPanelView {

	/**
	 * 
	 */
	private static final long serialVersionUID = -309449445850633549L;
	private JDialog dialog;

	public abstract String getTitle();

	public void close() {
		dialog.dispose();
	}

	public void setDialog(JDialog dialog) {

		this.dialog = dialog;
	}

	public JDialog getDialog() {
		return dialog;
	}
}
