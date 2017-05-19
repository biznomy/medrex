package com.sX.swing;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ListDataListener;

public abstract class AbstractBindableListModel<Key, Value> extends
		BindableListModel<Key, Value> {
	protected List<Value> records;

	public AbstractBindableListModel() {
		records = new ArrayList<Value>();
	}

	public Value getElementAt(int index) {
		if (records == null)
			return null;
		else {
			if (index >= 0 && index < records.size()) {
				return records.get(index);
			} else {
				throw new IllegalArgumentException("Invalid index: " + index);
			}
		}
	}

	public int getSize() {
		if (records == null)
			return 0;
		else
			return records.size();
	}

	public abstract List<Value> getValues(Key key);

	public abstract String toString(Value val);

	public abstract void addElement(String key);

	public void addListDataListener(ListDataListener l) {
	}

	public void removeListDataListener(ListDataListener l) {
	}

	public boolean isAddAllowable() {
		return true;
	}

	public boolean isDeleteAllowable() {
		return false;
	}

	public boolean isEditAllowable() {
		return false;
	}

	public boolean isViewAllowable() {
		return false;
	}
}
