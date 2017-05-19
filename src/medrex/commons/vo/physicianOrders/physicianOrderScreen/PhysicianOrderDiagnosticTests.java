package medrex.commons.vo.physicianOrders.physicianOrderScreen;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PhysicianOrderDiagnosticTests")
public class PhysicianOrderDiagnosticTests implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 112557297679113117L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "residentId")
	private int residentId;

	@Column(name = "Mbs")
	private boolean Mbs;

	@Column(name = "Pft")
	private boolean Pft;

	@Column(name = "Eeg")
	private boolean Eeg;

	@Column(name = "Emg")
	private boolean Emg;

	@Column(name = "Tee")
	private boolean Tee;

	@Column(name = "Echo")
	private boolean Echo;

	@Column(name = "Colonoscope")
	private boolean Colonoscope;

	@Column(name = "CarotidUs")
	private boolean CarotidUs;

	@Column(name = "Mammogram")
	private boolean Mammogram;

	@Column(name = "Mra")
	private boolean Mra;

	@Column(name = "Egd")
	private boolean Egd;

	@Column(name = "Mri")
	private boolean Mri;

	@Column(name = "PetScan")
	private boolean PetScan;

	@Column(name = "Venois")
	private boolean Venois;

	@Column(name = "Aterial")
	private boolean Aterial;

	@Column(name = "SymptomatologyClinical")
	private String SymptomatologyClinical;

	@Column(name = "CTScan")
	private boolean CTScan;

	@Column(name = "ScheduleAt")
	private String ScheduleAt;

	@Column(name = "ScheduleFor")
	private String ScheduleFor;

	@Column(name = "Symptomatology")
	private String Symptomatology;

	@Column(name = "Doppler")
	private String Doppler;

	@Column(name = "US")
	private String US;

	@Column(name = "Xray")
	private String Xray;

	@Column(name = "ScheduleForDc")
	private Date ScheduleForDC;

	public int getSerial() {
		return serial;
	}

	public int getResidentId() {
		return residentId;
	}

	public boolean isMbs() {
		return Mbs;
	}

	public boolean isPft() {
		return Pft;
	}

	public boolean isEeg() {
		return Eeg;
	}

	public boolean isEmg() {
		return Emg;
	}

	public boolean isTee() {
		return Tee;
	}

	public boolean isEcho() {
		return Echo;
	}

	public boolean isColonoscope() {
		return Colonoscope;
	}

	public boolean isMammogram() {
		return Mammogram;
	}

	public boolean isMra() {
		return Mra;
	}

	public boolean isEgd() {
		return Egd;
	}

	public boolean isMri() {
		return Mri;
	}

	public boolean isPetScan() {
		return PetScan;
	}

	public boolean isVenois() {
		return Venois;
	}

	public boolean isAterial() {
		return Aterial;
	}

	public String getScheduleAt() {
		return ScheduleAt;
	}

	public String getSymptomatology() {
		return Symptomatology;
	}

	public String getDoppler() {
		return Doppler;
	}

	public String getUS() {
		return US;
	}

	public String getXray() {
		return Xray;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public void setMbs(boolean mbs) {
		Mbs = mbs;
	}

	public void setPft(boolean pft) {
		Pft = pft;
	}

	public void setEeg(boolean eeg) {
		Eeg = eeg;
	}

	public void setEmg(boolean emg) {
		Emg = emg;
	}

	public void setTee(boolean tee) {
		Tee = tee;
	}

	public void setEcho(boolean echo) {
		Echo = echo;
	}

	public void setColonoscope(boolean colonoscope) {
		Colonoscope = colonoscope;
	}

	public void setMammogram(boolean mammogram) {
		Mammogram = mammogram;
	}

	public void setMra(boolean mra) {
		Mra = mra;
	}

	public void setEgd(boolean egd) {
		Egd = egd;
	}

	public void setMri(boolean mri) {
		Mri = mri;
	}

	public void setPetScan(boolean petScan) {
		PetScan = petScan;
	}

	public void setVenois(boolean venois) {
		Venois = venois;
	}

	public void setAterial(boolean aterial) {
		Aterial = aterial;
	}

	public void setScheduleAt(String scheduleAt) {
		ScheduleAt = scheduleAt;
	}

	public void setSymptomatology(String symptomatology) {
		Symptomatology = symptomatology;
	}

	public void setDoppler(String doppler) {
		Doppler = doppler;
	}

	public void setUS(String us) {
		US = us;
	}

	public void setXray(String xray) {
		Xray = xray;
	}

	public void setCarotidUs(boolean carotidUs) {
		CarotidUs = carotidUs;
	}

	public boolean isCarotidUs() {
		return CarotidUs;
	}

	public void setCTScan(boolean CTscan) {
		CTScan = CTscan;
	}

	public boolean isCTScan() {
		return CTScan;
	}

	public void setSymptomatologyClinical(String symptomatologyClinical) {
		SymptomatologyClinical = symptomatologyClinical;
	}

	public String getSymptomatologyClinical() {
		return SymptomatologyClinical;
	}

	public void setScheduleForDC(Date scheduleForDC) {
		ScheduleForDC = scheduleForDC;
	}

	public Date getScheduleForDC() {
		return ScheduleForDC;
	}

	public void setScheduleFor(String scheduleFor) {
		ScheduleFor = scheduleFor;
	}

	public String getScheduleFor() {
		return ScheduleFor;
	}

}
