package medrex.client.utils.controls;

import medrex.client.utils.MedrexTableModel;
import medrex.commons.intf.ControllerTableModel;

import com.sX.swing.JxTable;

public class JxTableMedrex extends JxTable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8202326117310350462L;
	MedrexTableModel medrexTableModel = null;

	public JxTableMedrex(ControllerTableModel controllerTableModel) {
		medrexTableModel = new MedrexTableModel(controllerTableModel);
		setModel(medrexTableModel);
	}

	public void update() {
		medrexTableModel.fireTableStructureChanged();
		updateUI();
		repaint();
	}

}
