package com.sX.swing;

public interface Model<Value> {
	public Value getElementAt(int index);

	public String toString(Value obj);
}
