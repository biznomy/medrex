package com.sX.swing;

import java.util.List;

public interface JxListModel<Key, Value> extends Model<Value>,
		javax.swing.ListModel {
	public List<Value> getValues(String str, Key key);

	public Value getElementAt(int index);

	public int getSize();

	public String toString(Value val);

	public void addElement(Key key);
}
