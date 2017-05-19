package medrex.client.main.careplan;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.WindowConstants;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.vo.carePlan.CarePlanRecord;

public class FrameCarePlanGoalsTip extends JDialog {

	private JList list;

	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FrameCarePlanGoalsTip dialog = new FrameCarePlanGoalsTip(null);
			dialog.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Create the dialog
	 */
	public FrameCarePlanGoalsTip(CarePlanRecord careplanrecord) {
		super();
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		getContentPane().setBackground(Color.GRAY);
		// Global.frameCarePlanAddNew = this;
		setResizable(false);
		setTitle("LTC");
		setSize(869, 420);
		SwingUtils.center(this);

		List careplanrecords = new ArrayList();

		try {
			careplanrecords = MedrexClientManager.getInstance()
					.getAllCarePlanMatchingThisCarePlan(careplanrecord,
							Global.currentLoggedInUserName);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// setSize(new Dimension(1024, 768));
		// setBounds(100, 100, 1024, 768);
		Iterator i = careplanrecords.iterator();
		List temp = new ArrayList();
		while (i.hasNext()) {
			CarePlanRecord cpr = (CarePlanRecord) i.next();
			temp.add(cpr.getGoals());
		}

		list = new JList();
		list.setListData(temp.toArray());

		getContentPane().add(list, BorderLayout.CENTER);

		//
	}
}
