package medrex.commons.vo.resident;

import java.io.Serializable;

public class DoctorsReport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4512872318716387901L;
	private String doctors;
	private String phoneNumber;
	private String doctorType;
	private String address;
	private String city;
	private String state;

	public String getDoctors() {
		return doctors;
	}

	public void setDoctors(String doctors) {
		this.doctors = doctors;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDoctorType() {
		return doctorType;
	}

	public void setDoctorType(String doctorType) {
		this.doctorType = doctorType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
