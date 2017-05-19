package medrex.commons.vo.admin;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "config")
public class Config implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1360592041470981192L;

	@Id
	@GeneratedValue
	@Column(name = "configId")
	private int id;

	@Column(name = "typeName")
	private String typeName;

	@Column(name = "configValue")
	private String configValue;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getConfigValue() {
		return configValue;
	}

	public void setConfigValue(String configValue) {
		this.configValue = configValue;
	}

}
