package medrex.client.test.ra.controller;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.test.ra.ui.PanelRAMain;
import medrex.client.utils.events.ViewEvent;
import medrex.client.utils.events.ViewEventListener;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.AbstractPanelView;
import medrex.commons.intf.Controller1;
import medrex.commons.intf.DataObject;
import medrex.commons.intf.FormController;
import medrex.commons.intf.View1;
import medrex.commons.vo.ra.RARecord;

public class ControllerRA implements FormController, ViewEventListener {

	private List<Controller1> controllerList;
	private AbstractPanelView view;
	private int serial;
	private int residentkey;

	public ControllerRA() {
		residentkey = Global.currentResidenceKey;
		controllerList = new ArrayList<Controller1>();
		controllerList.add(new ControllerRAAdd(this));
	}

	public void dispose() {

	}

	public void disposeView() {

	}

	public List<DataObject> getDataObjects() {
		List<DataObject> dataObjects = ((View1) getView()).getDataObjects();
		/*
		 * RARecord raRecord = null; if(dataObjects!=null){ for(DataObject
		 * dataObj: dataObjects){ if(dataObj.getClass()==RARecord.class){
		 * raRecord = (RARecord)dataObj; } } if(raRecord!=null){
		 * raRecord.setSerial(serial); } } dataObjects.add(raRecord);
		 */

		return dataObjects;
	}

	public int getSerial() {
		return serial;
	}

	public AbstractPanelView getView() {
		if (view == null) {
			view = new PanelRAMain();
			(view).addViewEventListener(this);
			load();
			(view).refresh();
		}
		return view;
	}

	public void actionPerformed(ViewEvent event) {
		if (event != null) {
			switch (event.getAction()) {
			case ViewEvent.LOAD: {
				ControllerRAAdd contadd = (ControllerRAAdd) getController(ControllerRAAdd.class);
				Object[] obj = event.getParameters();
				int serial = Integer.parseInt(obj[0] + "");
				contadd.setSerial(serial);
				contadd.showView();
				load();
				getView().refresh();
			}
				break;

			case ViewEvent.NEW: {
				controllerList.clear();
				controllerList.add(new ControllerRAAdd(this));
				ControllerRAAdd contadd = (ControllerRAAdd) getController(ControllerRAAdd.class);
				Object[] obj = event.getParameters();
				String formName = obj[0] + "";
				contadd.setFormName(formName);
				contadd.setSerial(0);
				contadd.setResidenceKey(residentkey);
				contadd.showView();
				load();
				getView().refresh();
			}
				break;

			case ViewEvent.SAVE: {

			}
				break;

			case ViewEvent.DELETE: {
				Object[] obj = event.getParameters();
				int serial = Integer.parseInt(obj[0] + "");
				setSerial(serial);
				delete();
				load();
				getView().refresh();
			}
				break;
			}
		}
	}

	public void save() {

	}

	public void setDataObject(List<DataObject> dataObjects) {
		((View1) getView()).setDataObjects(dataObjects);
		/*
		 * if(dataObjects!=null){ RARecord raRecord = null; for(DataObject
		 * dataObj: dataObjects){ if(dataObj.getClass()==RARecord.class){
		 * raRecord = (RARecord)dataObj; } } if(raRecord!=null){
		 * setSerial(raRecord.getSerial()); } }
		 */
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
		return controllerList;
	}

	public Controller1 getController(Class controllerCls) {
		for (Controller1 controller1 : controllerList) {
			if (controller1.getClass() == controllerCls) {
				return controller1;
			}
		}
		return null;
	}

	public void load() {
		List<RARecord> raList = new ArrayList<RARecord>();
		List<DataObject> dataObjects = new ArrayList<DataObject>();
		try {
			raList = MedrexClientManager.getInstance().getRARecordList(
					residentkey);
			for (RARecord raRecord : raList) {
				dataObjects.add(raRecord);
			}
			setDataObject(dataObjects);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MedrexException e) {
			e.printStackTrace();
		}
	}

	public void delete() {
		try {
			MedrexClientManager.getInstance().deleteRARecord(serial);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
