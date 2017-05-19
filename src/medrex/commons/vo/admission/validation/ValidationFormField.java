package medrex.commons.vo.admission.validation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import medrex.commons.vo.alert.FormConfigAlert;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "ValidationFormFields")
public class ValidationFormField implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 837366221627523761L;

	public ValidationFormField() {
		validationFormFields = new ArrayList<FormFieldValidation>();
		alert = new FormConfigAlert();
	}

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "labelOfField")
	private String labelOfField;

	@Column(name = "componentName")
	private String componentName;

	@Column(name = "dataTypeOfComponent")
	private String dataTypeOfComponent;

	@Column(name = "dataTyeOfField")
	private String dataTyeOfField;

	@OneToMany(fetch = FetchType.EAGER)
	@Cascade( { CascadeType.ALL })
	@JoinColumn(name = "validationFormFieldsId")
	private List<FormFieldValidation> validationFormFields;

	@OneToOne(fetch = FetchType.EAGER)
	@Cascade( { CascadeType.ALL })
	@JoinColumn(name = "alertId")
	private FormConfigAlert alert;

	public FormConfigAlert getAlert() {
		return alert;
	}

	public void setAlert(FormConfigAlert alert) {
		this.alert = alert;
	}

	public List<FormFieldValidation> getValidationFormFields() {
		return validationFormFields;
	}

	public void setValidationFormFields(
			List<FormFieldValidation> validationFormFields) {
		this.validationFormFields = validationFormFields;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getLabelOfField() {
		return labelOfField;
	}

	public void setLabelOfField(String labelOfField) {
		this.labelOfField = labelOfField;
	}

	public String getComponentName() {
		return componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	public String getDataTypeOfComponent() {
		return dataTypeOfComponent;
	}

	public void setDataTypeOfComponent(String dataTypeOfComponent) {
		this.dataTypeOfComponent = dataTypeOfComponent;
	}

	public String getDataTyeOfField() {
		return dataTyeOfField;
	}

	public void setDataTyeOfField(String dataTyeOfField) {
		this.dataTyeOfField = dataTyeOfField;
	}
}
