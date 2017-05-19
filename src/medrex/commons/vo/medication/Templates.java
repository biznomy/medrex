package medrex.commons.vo.medication;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Templates")
public class Templates implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9030256284729427344L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "templateText")
	private String templateText;
	@Column(name = "type")
	private String type;
	@Column(name = "templateName")
	private String templateName;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getTemplateText() {
		return templateText;
	}

	public void setTemplateText(String templateText) {
		this.templateText = templateText;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	@Override
	public String toString() {
		return this.templateName.toString();
	}
}
