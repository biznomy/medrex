package medrex.commons.intf;

import java.util.List;

import javax.swing.JComponent;

public interface Controller1 {

	public void showView();

	public JComponent getView();

	public void dispose();

	public void disposeView();

	public List<String> validate(Object bean, String field);

	public void setSerial(int serial);

	public int getSerial();

	public List<DataObject> getDataObjects();

	public void setDataObject(List<DataObject> dataObject);

	public void save();

	public void load();

	public void delete();

	public List<Controller1> getAllControllers();

	public Controller1 getController(Class controllerCls);

}
