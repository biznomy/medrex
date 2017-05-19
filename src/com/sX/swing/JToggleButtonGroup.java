/**
 * 
 */
package com.sX.swing;

import java.util.Iterator;

import javax.swing.JToggleButton;

/**
 * @author D S Naruka
 * 
 */
public class JToggleButtonGroup<T extends JToggleButton> extends
		ComponentGroup<T> {

	public JToggleButtonGroup() {
		super();
	}

	private int getBinaryValue(int value) {
		return (int) Math.pow(2, value - 1);
	}

	protected int getValue(T component) {
		int value = getComponentValue(component);
		if (value > 0) {
			return getBinaryValue(value);
		}
		return 0;
	}

	protected int getComponentValue(T component) {
		if (component == null) {
			throw new IllegalArgumentException("component can't be null");
		}

		int value = 0;

		if (hasValidActionCommand(component)) {
			value = Integer.parseInt(component.getActionCommand(), 10);
		} else {
			value = indexOf(component) + 1;
		}

		return value;
	}

	protected boolean hasValidActionCommand(T component) {
		if (component == null) {
			throw new IllegalArgumentException("component can't be null");
		}

		if (component.getActionCommand() != null
				&& component.getActionCommand().length() > 0) {
			try {
				int ac = Integer.parseInt(component.getActionCommand(), 10);
				if (ac > 0) {
					return true;
				}
			} catch (Exception e) {
				// e.printStackTrace();
				return false;
			}
		}

		return false;
	}

	public int getValue() {
		int value = 0;

		for (T component : components) {
			if (component.isSelected()) {
				value += getValue(component);
			}
		}

		return value;
	}

	public void setValue(int value) {
		selectComponent(calculateMsv(value), value);
	}

	private void selectComponent(int msv, int value) {
		if (msv > 0) {
			selectComponentWithValue(msv);
			value = (int) (value - Math.pow(2, msv - 1));
			msv = calculateMsv(value);
			selectComponent(msv, value);
		}
	}

	private void selectComponentWithValue(int value) {
		int index = value - 1;
		/* TODO index calculation is a bit messy here */
		if (components.size() > index) {
			T component = get(index);
			if (component != null) {
				component.setSelected(true);
			} else {
				Iterator<T> itr = iterator();
				while (itr.hasNext()) {
					T com = itr.next();
					if (getValue(com) == value) {
						com.setSelected(true);
						return;
					}
				}
			}
		}
	}

	private int calculateMsv(int value) {
		return (int) Math.ceil((Math.log(value + 1) / Math.log(2)));
	}
}
