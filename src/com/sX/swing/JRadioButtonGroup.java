/**
 * 
 */
package com.sX.swing;

import java.util.Collection;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

/**
 * @author D S Naruka
 * 
 */
public class JRadioButtonGroup extends JToggleButtonGroup<JRadioButton> {

	private ButtonGroup buttonGroup;

	public JRadioButtonGroup() {
		buttonGroup = new ButtonGroup();
	}

	@Override
	public void add(int index, JRadioButton component) {
		super.add(index, component);
		buttonGroup.add(component);
	}

	@Override
	public void add(JRadioButton component) {
		super.add(component);
		buttonGroup.add(component);
	}

	@Override
	public void addAll(Collection<? extends JRadioButton> collection) {
		super.addAll(collection);
		for (JRadioButton component : collection) {
			buttonGroup.add(component);
		}
	}

	@Override
	public void addAll(int index, Collection<? extends JRadioButton> collection) {
		super.addAll(index, collection);
		for (JRadioButton component : collection) {
			buttonGroup.add(component);
		}
	}

	@Override
	public void clear() {
		super.clear();
		buttonGroup = new ButtonGroup();
	}

	@Override
	public void reset() {
		super.reset();
		buttonGroup = new ButtonGroup();
	}
}
