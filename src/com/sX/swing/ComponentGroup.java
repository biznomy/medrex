/**
 * 
 */
package com.sX.swing;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author D S Naruka
 * 
 */
public abstract class ComponentGroup<T extends Component> {
	protected List<T> components;

	public ComponentGroup() {
		components = new ArrayList<T>();
	}

	public void add(T component) {
		components.add(component);
	}

	public void add(int index, T component) {
		components.add(index, component);
	}

	public void addAll(Collection<? extends T> collection) {
		components.addAll(collection);
	}

	public void addAll(int index, Collection<? extends T> collection) {
		components.addAll(index, collection);
	}

	public void clear() {
		components.clear();
	}

	public boolean contains(T component) {
		return components.contains(component);
	}

	public boolean containsAll(Collection<? extends T> collection) {
		return components.containsAll(collection);
	}

	public T get(int index) {
		return components.get(index);
	}

	public int indexOf(T component) {
		return components.indexOf(component);
	}

	public Iterator<T> iterator() {
		return components.iterator();
	}

	public int lastIndexOf(T com) {
		return components.lastIndexOf(components);
	}

	public void remove(T component) {
		components.remove(component);
	}

	public void remove(int index) {
		components.remove(index);
	}

	public void removeAll(Collection<? extends T> collection) {
		components.removeAll(collection);
	}

	public void reset() {
		components = new ArrayList<T>();
	}

	public void retainAll(Collection<? extends T> collection) {
		components.retainAll(collection);
	}
}
