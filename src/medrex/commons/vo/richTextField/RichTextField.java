package medrex.commons.vo.richTextField;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RichTextField")
public class RichTextField implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4954203498117833828L;

	@Id
	@GeneratedValue
	@Column(name = "rtfId")
	private int id;

	@Column(name = "rtfName")
	private String rtfName;

	@Column(name = "rtfType")
	private String rtfType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRtfName() {
		return rtfName;
	}

	public void setRtfName(String rtfName) {
		this.rtfName = rtfName;
	}

	public String getRtfType() {
		return rtfType;
	}

	public void setRtfType(String rtfType) {
		this.rtfType = rtfType;
	}
	// public String toString() {
	// return getRtfName();
	// }

}
