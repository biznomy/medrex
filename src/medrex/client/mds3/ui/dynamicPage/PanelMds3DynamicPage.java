package medrex.client.mds3.ui.dynamicPage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Iterator;

import javax.swing.JPanel;

import medrex.client.mds3.general.Form;
import medrex.client.mds3.general.Mds3ItemSet;
import medrex.client.mds3.general.Mds3SubSection;

public class PanelMds3DynamicPage extends JPanel implements Form,
		medrex.commons.intf.Form {
	/**
	 * Author Suresh P Rai
	 */
	Mds3ItemSet itemSet;
	int page;
	private static final long serialVersionUID = 1L;

	public PanelMds3DynamicPage(final Mds3ItemSet itemSet, int page) {
		super();
		setLayout(null);
		setBackground(Color.WHITE);
		setOpaque(true);
		this.itemSet = itemSet;
		this.page = page;
		setPreferredSize(new Dimension(941, 1350));
		// setBackground(Color.WHITE);
		final JPanel panel = new JPanel();
		panel.setBounds(50, 5, 841, 1350);
		// panel.setBorder(new LineBorder(Mds3Constants.BORDER_LIGHTGRAY, 1,
		// false));
		panel.setBackground(Color.WHITE);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		panel.setPreferredSize(new Dimension(841, 1350));
		add(panel);

		Iterator itr = itemSet.getPages().get(page + "").getSubSections()
				.iterator();
		while (itr.hasNext()) {
			panel.add((JPanel) itr.next());
		}
		panel.setVisible(true);

		repaint();

		// }
	}

	@Override
	public void doLoad() {
		// TODO Auto-generated method stub

	}

	@Override
	public int doSave() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void doUpdate() {
		// TODO Auto-generated method stub
		Iterator itr = itemSet.getPages().get(page + "").getSubSections()
				.iterator();
		while (itr.hasNext()) {
			((Mds3SubSection) itr.next()).doUpdate();
		}

	}

	@Override
	public boolean doValidate() {
		// TODO Auto-generated method stub
		return false;
	}
}
