package medrex.client.test.ra.controller;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.test.ra.ui.PanelRARecordAdd;
import medrex.client.utils.SwingUtils;
import medrex.client.utils.events.ViewEvent;
import medrex.client.utils.events.ViewEventListener;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.AbstractPanelView;
import medrex.commons.intf.Controller1;
import medrex.commons.intf.DataObject;
import medrex.commons.intf.Form;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.ra.RAFPg1Sec1;
import medrex.commons.vo.ra.RAFPg1Sec2;
import medrex.commons.vo.ra.RAPg2Sec1;
import medrex.commons.vo.ra.RAPg2Sec2;
import medrex.commons.vo.ra.RARecord;

public class ControllerRAAdd implements Controller1, ViewEventListener {

	private ControllerRA controllerRA;
	private AbstractPanelView view;
	private List<Controller1> controllerList = null;
	private List<DataObject> listDataObjects = null;

	private int serial;
	private String formName;
	private int residenceKey;

	public ControllerRAAdd(ControllerRA controllerRA) {
		this.controllerRA = controllerRA;
		controllerList = new ArrayList<Controller1>();
		controllerList.add(new ControllerRAFPg1());
		controllerList.add(new ControllerRAFPg2());
	}

	public void dispose() {

	}

	public void disposeView() {

	}

	public List<DataObject> getDataObjects() {
		listDataObjects = new ArrayList<DataObject>();

		List<Controller1> listControllers = getAllControllers();
		for (Controller1 controller1 : listControllers) {
			List<DataObject> listDataObj = controller1.getDataObjects();
			for (DataObject dataObject : listDataObj) {
				listDataObjects.add(dataObject);
			}
		}
		RARecord raRecord = new RARecord();
		raRecord.setSerial(serial);
		raRecord.setFormName(formName);
		raRecord.setResidentId(residenceKey);
		listDataObjects.add(raRecord);
		return listDataObjects;
	}

	public int getSerial() {
		return serial;
	}

	public AbstractPanelView getView() {
		if ((view) == null || serial == 0) {
			view = new PanelRARecordAdd() {
				@Override
				public Form getForm(int index) {
					switch (index) {
					default:
					case 1:
						return (Form) getController(ControllerRAFPg1.class)
								.getView();
					case 2:
						return (Form) getController(ControllerRAFPg2.class)
								.getView();
					}
				}
			};
			(view).addViewEventListener(this);
		}
		(view).showForm(1);
		return view;
	}

	public void actionPerformed(ViewEvent event) {
		if (event != null) {
			switch (event.getAction()) {
			case ViewEvent.LOAD: {

			}
				break;

			case ViewEvent.NEW: {

			}
				break;

			case ViewEvent.SAVE: {
				save();
			}
				break;

			case ViewEvent.DELETE: {

			}
				break;
			}
		}
	}

	public void save() {
		try {
			MedrexClientManager.getInstance().saveRAFPages(getDataObjects());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setDataObject(List<DataObject> dataObjects) {
		List<DataObject> dataObjectControllerMain = new ArrayList<DataObject>();
		List<DataObject> dataObjectController1 = new ArrayList<DataObject>();
		List<DataObject> dataObjectController2 = new ArrayList<DataObject>();
		if (dataObjects != null) {
			for (DataObject dataObj : dataObjects) {
				if (dataObj.getClass() == RARecord.class) {
					RARecord raRecord = (RARecord) dataObj;
					dataObjectControllerMain.add(raRecord);
				}
				if (dataObj.getClass() == RAFPg1Sec1.class) {
					RAFPg1Sec1 raPg1Sec1 = (RAFPg1Sec1) dataObj;
					dataObjectController1.add(raPg1Sec1);
				}
				if (dataObj.getClass() == RAFPg1Sec2.class) {
					RAFPg1Sec2 raPg1Sec2 = (RAFPg1Sec2) dataObj;
					dataObjectController1.add(raPg1Sec2);
				}
				if (dataObj.getClass() == RAPg2Sec1.class) {
					RAPg2Sec1 raPg2Sec1 = (RAPg2Sec1) dataObj;
					dataObjectController2.add(raPg2Sec1);
				}
				if (dataObj.getClass() == RAPg2Sec2.class) {
					RAPg2Sec2 raPg2Sec2 = (RAPg2Sec2) dataObj;
					dataObjectController2.add(raPg2Sec2);
				}
			}
		}
		controllerRA.setDataObject(dataObjectControllerMain);
		ControllerRAFPg1 controllerRAFPg1 = (ControllerRAFPg1) getController(ControllerRAFPg1.class);
		controllerRAFPg1.setDataObject(dataObjectController1);
		ControllerRAFPg2 controllerRAFPg2 = (ControllerRAFPg2) getController(ControllerRAFPg2.class);
		controllerRAFPg2.setDataObject(dataObjectController2);
	}

	public void setSerial(int serial) {
		this.serial = serial;
		load();
	}

	public List<String> validate(Object bean, String field) {
		return null;
	}

	public List<Controller1> getAllControllers() {
		return controllerList;
	}

	public void showView() {
		SwingUtils.openInDialog((PopUpView) getView());
	}

	public Controller1 getController(Class controllerCls) {
		for (Controller1 controller : controllerList) {
			if (controller.getClass() == controllerCls) {
				return controller;
			}
		}
		return null;
	}

	public void load() {
		List<DataObject> dataObjectList = null;
		try {
			dataObjectList = MedrexClientManager.getInstance().getRARecord(
					serial);
			setDataObject(dataObjectList);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MedrexException e) {
			e.printStackTrace();
		}

	}

	public void delete() {
		// TODO Auto-generated method stub

	}

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public int getResidenceKey() {
		return residenceKey;
	}

	public void setResidenceKey(int residenceKey) {
		this.residenceKey = residenceKey;
	}

}
