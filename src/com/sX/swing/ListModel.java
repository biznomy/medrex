package com.sX.swing;

import java.util.List;

public interface ListModel<Key, Value> extends Model<Value>,
		javax.swing.ListModel {
	public List<Value> getValues(Key key);

	public Value getElementAt(int index);

	public int getSize();

	public String toString(Value val);

	public void addElement(Key key);
}
