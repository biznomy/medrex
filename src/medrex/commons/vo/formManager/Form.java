package medrex.commons.vo.formManager;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * 
 * @author Mayank Chandela
 * 
 *         This Entity is responsible for business operation on the forms
 *         associated with the Tabs in the Resident Screen.
 * 
 */
@Entity
@Table(name = "Form")
public class Form {

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "formName")
	private String formName;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	/**
	 * This is to add many to many relationship between tabs and the forms in
	 * the intermediate table id's will be stored as TabId and FormId
	 * 
	 */
	@ManyToMany(mappedBy = "forms", fetch = FetchType.EAGER)
	private List<Tab> tabs;

	public List<Tab> getTabs() {
		return tabs;
	}

	public void setTabs(List<Tab> tabs) {
		this.tabs = tabs;
	}

	@ManyToMany(targetEntity = medrex.commons.vo.formManager.FormPage.class, cascade = { CascadeType.REFRESH }, fetch = FetchType.LAZY)
	@JoinTable(name = "form_formPage", joinColumns = { @JoinColumn(name = "form_serial") }, inverseJoinColumns = { @JoinColumn(name = "formPage_serial") })
	private List<FormPage> formPages;

	public List<FormPage> getFormPages() {
		return formPages;
	}

	public void setFormPages(List<FormPage> formPages) {
		this.formPages = formPages;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Form) {
			Form form = (Form) obj;
			if (this.getSerial() == form.getSerial()) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}
