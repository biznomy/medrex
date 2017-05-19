/**
 * 
 */
package medrex.commons.vo.general;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import medrex.commons.intf.ValueObject;

/**
 * @author D S Naruka
 */

@Entity
@Table(name = "Icd9")
public class Icd9 implements ValueObject, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2699014983556103299L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "code")
	private String code;

	@Column(name = "name")
	private String name;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
