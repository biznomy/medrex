package medrex.client.main.scan;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;

public class FrameScanPageAdd extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3824075569748539906L;
	private JComboBox cmbFormPageType;
	// public FrameScanFormAdd frameScanFormAdd;
	private boolean cancel;

	public FrameScanPageAdd() {
		super();
		setResizable(false);
		setTitle("LTC");
		setModal(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		SwingUtils.center(this);

		cancel = true;

		setSize(new Dimension(318, 77));
		getContentPane().setLayout(null);
		getContentPane().setBackground(UIManager.getColor("Button.background"));

		cmbFormPageType = new JComboBox();
		cmbFormPageType.setBounds(10, 10, 237, 26);
		getContentPane().add(cmbFormPageType);

		final JButton saveButton = new JButton();
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				Global.currentScanFormname = (String) cmbFormPageType
						.getSelectedItem();
				disposeMe();
				cancel = false;
			}
		});
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.setText("Ok");
		saveButton.setBounds(253, 10, 51, 26);
		getContentPane().add(saveButton);
	}

	public Object[] getListData() {
		ComboBoxModel model = cmbFormPageType.getModel();
		Object[] o = new Object[model.getSize()];
		for (int i = 0; i < model.getSize(); i++) {
			o[i] = model.getElementAt(i);
		}
		return o;
	}

	public void setListData(Object[] o) {
		cmbFormPageType.setModel(new DefaultComboBoxModel(o));
	}

	public void disposeMe() {
		dispose();
		cancel = true;
	}

	public boolean isCancel() {
		return cancel;
	}

	public void setCancel(boolean cancel) {
		this.cancel = cancel;
	}
}
