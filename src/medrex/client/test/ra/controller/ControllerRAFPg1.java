package medrex.client.test.ra.controller;

import java.util.List;

import javax.swing.JComponent;

import medrex.client.test.ra.ui.PanelRAFPg1;
import medrex.commons.intf.AbstractPanelView;
import medrex.commons.intf.Controller;
import medrex.commons.intf.Controller1;
import medrex.commons.intf.DataObject;
import medrex.commons.intf.PageController;
import medrex.commons.intf.View1;
import medrex.commons.vo.ra.RAFPg1Sec1;

public class ControllerRAFPg1 implements PageController, Controller {

	private JComponent view;
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
		RAFPg1Sec1 raPg1Sec1 = null;
		if (dataObjects != null) {
			for (DataObject dataObj : dataObjects) {
				if (dataObj.getClass() == RAFPg1Sec1.class) {
					raPg1Sec1 = (RAFPg1Sec1) dataObj;
				}
			}
			if (raPg1Sec1 != null) {
				raPg1Sec1.setRafpg1Serial(serial);
			}
		}
		dataObjects.add(raPg1Sec1);

		return dataObjects;
	}

	public int getSerial() {
		return serial;
	}

	public AbstractPanelView getView() {
		if (view == null) {
			view = new PanelRAFPg1();
		}
		return (AbstractPanelView) view;
	}

	public void save() {

	}

	public void setDataObject(List<DataObject> dataObjects) {
		((View1) getView()).setDataObjects(dataObjects);
		if (dataObjects != null) {
			RAFPg1Sec1 raPg1Sec1 = null;
			for (DataObject dataObj : dataObjects) {
				if (dataObj.getClass() == RAFPg1Sec1.class) {
					raPg1Sec1 = (RAFPg1Sec1) dataObj;
				}
			}
			if (raPg1Sec1 != null) {
				setSerial(raPg1Sec1.getRafpg1Serial());
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

	}

	public void delete() {
		// TODO Auto-generated method stub

	}

	public List<String> doValidate(Object bean, String field) {
		// TODO Auto-generated method stub
		return null;
	}
}
