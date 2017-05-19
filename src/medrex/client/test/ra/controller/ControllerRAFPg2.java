package medrex.client.test.ra.controller;

import java.util.List;

import medrex.client.test.ra.ui.PanelRAFPg2;
import medrex.commons.intf.AbstractPanelView;
import medrex.commons.intf.Controller1;
import medrex.commons.intf.DataObject;
import medrex.commons.intf.PageController;
import medrex.commons.intf.View1;
import medrex.commons.vo.ra.RAPg2Sec1;

public class ControllerRAFPg2 implements PageController {

	private AbstractPanelView view;
	private int serial;

	private int currentSerial;

	public int getCurrentSerial() {
		return currentSerial;
	}

	public void setCurrentSerial(int currentSerial) {
		this.currentSerial = currentSerial;
	}

	public void dispose() {

	}

	public void disposeView() {

	}

	public List<DataObject> getDataObjects() {
		List<DataObject> dataObjects = ((View1) getView()).getDataObjects();
		RAPg2Sec1 raPg2Sec1 = null;
		if (dataObjects != null) {
			for (DataObject dataObj : dataObjects) {
				if (dataObj.getClass() == RAPg2Sec1.class) {
					raPg2Sec1 = (RAPg2Sec1) dataObj;
				}
			}
			if (raPg2Sec1 != null) {
				raPg2Sec1.setRapg2Serial(serial);
			}
		}
		dataObjects.add(raPg2Sec1);
		return dataObjects;
		// return ((View1)getView()).getDataObjects();
	}

	public int getSerial() {
		return serial;
	}

	public AbstractPanelView getView() {
		if (view == null) {
			view = new PanelRAFPg2();
		}
		return view;
	}

	public void save() {

	}

	public void setDataObject(List<DataObject> dataObjects) {
		((View1) getView()).setDataObjects(dataObjects);
		if (dataObjects != null) {
			RAPg2Sec1 raPg2Sec1 = null;
			for (DataObject dataObj : dataObjects) {
				if (dataObj.getClass() == RAPg2Sec1.class) {
					raPg2Sec1 = (RAPg2Sec1) dataObj;
				}
			}
			if (raPg2Sec1 != null) {
				setSerial(raPg2Sec1.getRapg2Serial());
			}
		}
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public void showView() {

	}

	public List<String> validate(Object bean, String field) {
		return null;
	}

	public List<Controller1> getAllControllers() {
		return null;
	}

	public Controller1 getController(Class controllerCls) {
		return null;
	}

	public void load() {
		// TODO Auto-generated method stub

	}

	public void delete() {
		// TODO Auto-generated method stub

	}
}
