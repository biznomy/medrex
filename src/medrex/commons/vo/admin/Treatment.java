package medrex.commons.vo.admin;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Treatmentadmin")
public class Treatment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7358835541648984455L;
	@Id
	@Column(name = "ndc")
	private long ndc;
	@Column(name = "code")
	private String code;
	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String description;
	@Column(name = "routeName")
	private String routeName;
	@Column(name = "coustionary")
	private String coustionary;

	public long getNdc() {
		return ndc;
	}

	public void setNdc(Long ndc) {
		this.ndc = ndc;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public String getCoustionary() {
		return coustionary;
	}

	public void setCoustionary(String coustionary) {
		this.coustionary = coustionary;
	}

}
