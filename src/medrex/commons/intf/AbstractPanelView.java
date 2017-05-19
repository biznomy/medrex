/**
 * 
 */
package medrex.commons.intf;

import java.util.List;

import javax.swing.JPanel;

import medrex.client.utils.events.ViewEvent;
import medrex.client.utils.events.ViewEventListener;

/**
 * @author Dev
 * 
 */
public abstract class AbstractPanelView extends JPanel implements View1 {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5130756787919785175L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * medrex.commons.intf.View1#addViewEventListener(medrex.client.utils.events
	 * .ViewEventListener)
	 */
	public void addViewEventListener(ViewEventListener l) {
		if (l != null) {
			listenerList.add(ViewEventListener.class, l);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see medrex.commons.intf.View1#fireViewEvent(int, java.lang.Object[])
	 */
	public void fireViewEvent(int action, Object... param) {
		ViewEvent viewEvent = new ViewEvent(action, param);
		ViewEventListener[] listeners = getListeners(ViewEventListener.class);
		for (ViewEventListener l : listeners) {
			l.actionPerformed(viewEvent);
		}
	}

	public List<DataObject> getDataObjects() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDataObjects(List<DataObject> dataObjectList) {
		// TODO Auto-generated method stub

	}

	public Form getForm(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public void showForm(int index) {
		// TODO Auto-generated method stub
	}

	public void refresh() {
		// TODO Auto-generated method stub
	}
}
