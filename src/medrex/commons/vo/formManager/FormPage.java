package medrex.commons.vo.formManager;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FormPage")
public class FormPage {

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "pageName")
	private int pageNo;

	@Column(name = "className")
	private String className;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof FormPage) {
			FormPage formPage = (FormPage) obj;
			if (this.getSerial() == formPage.getSerial()) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}
