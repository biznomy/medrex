package medrex.commons.intf;

import java.util.List;

import medrex.client.utils.events.ViewEventListener;

public interface View1 {

	public List<DataObject> getDataObjects();

	public void setDataObjects(List<DataObject> dataObjectList);

	public void addViewEventListener(ViewEventListener l);

	public void fireViewEvent(int action, Object... param);

	public Form getForm(int index);

	public void showForm(int index);

	public void refresh();
}
