package medrex.client.test.ra.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import medrex.commons.intf.AbstractPanelView;
import medrex.commons.intf.DataObject;
import medrex.commons.intf.Form;
import medrex.commons.vo.ra.RAPg2Sec1;
import medrex.commons.vo.ra.RAPg2Sec2;

import com.toedter.calendar.JDateChooser;

public class PanelRAFPg2 extends AbstractPanelView implements Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7505380075436057491L;
	private JDateChooser dob;
	private JComboBox cmbState;

	private List<DataObject> dataObjects;

	public PanelRAFPg2() {
		super();

		setLayout(null);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(300, 300));

		final JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 300, 300);
		add(panel);

		final JLabel raPage2Label = new JLabel();
		raPage2Label.setHorizontalAlignment(SwingConstants.CENTER);
		raPage2Label.setFont(new Font("Tahoma", Font.BOLD, 16));
		raPage2Label.setText("RA Page2");
		raPage2Label.setBounds(0, 0, 300, 28);
		panel.add(raPage2Label);

		final JLabel stateLabel = new JLabel();
		stateLabel.setText("State: ");
		stateLabel.setBounds(10, 34, 59, 28);
		panel.add(stateLabel);

		cmbState = new JComboBox();
		cmbState.setModel(new DefaultComboBoxModel(new String[] { "Delhi",
				"Utter Pradesh", "Hariyana" }));
		cmbState.setBackground(Color.WHITE);
		cmbState.setBounds(94, 34, 131, 21);
		panel.add(cmbState);

		final JLabel dobLabel = new JLabel();
		dobLabel.setText("DOB:");
		dobLabel.setBounds(10, 99, 71, 28);
		panel.add(dobLabel);

		dob = new JDateChooser();
		dob.setBounds(94, 99, 131, 28);
		panel.add(dob);

	}

	public void doLoad() {

	}

	@Override
	public List<DataObject> getDataObjects() {
		dataObjects = new ArrayList<DataObject>();

		RAPg2Sec1 raPg2Sec1 = new RAPg2Sec1();
		raPg2Sec1.setState(cmbState.getSelectedItem() + "");
		dataObjects.add(raPg2Sec1);

		RAPg2Sec2 raPg2Sec2 = new RAPg2Sec2();
		raPg2Sec2.setDob(dob.getDate());
		dataObjects.add(raPg2Sec2);
		return dataObjects;
	}

	@Override
	public void setDataObjects(List<DataObject> dataObjectList) {
		if (dataObjectList != null) {
			RAPg2Sec1 raPg2Sec1 = null;
			RAPg2Sec2 raPg2Sec2 = null;
			for (DataObject dataObj : dataObjectList) {
				if (dataObj.getClass() == RAPg2Sec1.class) {
					raPg2Sec1 = (RAPg2Sec1) dataObj;
				}
				if (dataObj.getClass() == RAPg2Sec2.class) {
					raPg2Sec2 = (RAPg2Sec2) dataObj;
				}
			}
			if (raPg2Sec1 != null) {
				cmbState.setSelectedItem(raPg2Sec1.getState());
			}
			if (raPg2Sec2 != null) {
				dob.setDate(raPg2Sec2.getDob());
			}
		}
	}

	public int doSave() {
		return 0;
	}

	public void doUpdate() {

	}

	public boolean doValidate() {
		return false;
	}

}
