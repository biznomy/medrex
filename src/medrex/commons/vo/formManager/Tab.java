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
 * @author Mayank Chandela
 * 
 *         The Entity responsible for changes in The main tabs in Resident
 *         Screen
 */
@Entity
@Table(name = "Tab")
public class Tab {

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "tabName")
	private String TabName;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getTabName() {
		return TabName;
	}

	public void setTabName(String tabName) {
		TabName = tabName;
	}

	@ManyToMany(targetEntity = medrex.commons.vo.formManager.Form.class, cascade = { CascadeType.REFRESH }, fetch = FetchType.EAGER)
	@JoinTable(name = "tab_form", joinColumns = { @JoinColumn(name = "tab_serial") }, inverseJoinColumns = { @JoinColumn(name = "form_serial") })
	private List<Form> forms;

	public List<Form> getForms() {
		return forms;
	}

	public void setForms(List<Form> forms) {
		this.forms = forms;
	}

}
