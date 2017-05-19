package medrex.commons.vo;

import java.io.Serializable;

import javax.swing.ImageIcon;

public class TestObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7054784343865594018L;

	String name;

	ImageIcon abcd;

	public ImageIcon getAbcd() {
		return abcd;
	}

	public void setAbcd(ImageIcon abcd) {
		this.abcd = abcd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
