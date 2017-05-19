/**
 * 
 */
package medrex.commons.dataObj;

import javax.swing.Icon;

/**
 * @author D S Naruka
 * 
 */
public class CareLogValue {
	// private int serial;
	private String title;
	private Icon icon;
	private int value;
	private int level;
	private boolean multipleAllowed;

	/* accessors and mutators */
	// public int getSerial() {
	// return serial;
	// }
	// public void setSerial(int serial) {
	// this.serial = serial;
	// }
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Icon getIcon() {
		return icon;
	}

	public void setIcon(Icon icon) {
		this.icon = icon;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public boolean isMultipleAllowed() {
		return multipleAllowed;
	}

	public void setMultipleAllowed(boolean multipleAllowed) {
		this.multipleAllowed = multipleAllowed;
	}

	@Override
	public String toString() {
		return this.getTitle();
	}
}
