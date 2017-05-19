package medrex.commons.vo.ptOtSt;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import medrex.commons.vo.notes.Notes;

@Entity
@Table(name = "PtOtStSpeechDailyRecord")
public class PtOtStSpeechDailyRecord implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4878768882401512874L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "coSignLicDate")
	private Date coSignLicDate;
	@Column(name = "licenseNo03")
	private String licenseNo03;
	@Column(name = "signature03")
	private String signature03;
	@Column(name = "frequency")
	private String frequency;
	@Column(name = "printTherapInitials03")
	private String printTherapInitials03;
	@Column(name = "licenseNo02")
	private String licenseNo02;
	@Column(name = "signature02")
	private String signature02;
	@Column(name = "printTherapInitials02")
	private String printTherapInitials02;
	@Column(name = "coSignLic")
	private String coSignLic;
	@Column(name = "licenseNo01")
	private String licenseNo01;
	@Column(name = "signature01")
	private String signature01;
	@Column(name = "printTherapInitials01")
	private String printTherapInitials01;
	@Column(name = "coSignNa")
	private boolean coSignNa;
	// Saturday

	@Column(name = "initialsSat")
	private String initialsSat;
	// @OneToOne(cascade=CascadeType.ALL)
	@Column(name = "totalMinSat")
	private String totalMinSat;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "incidentsSat")
	private Notes incidentsSat;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "other01Sat")
	private Notes other01Sat;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sdr92532Sat")
	private Notes sdr92532Sat;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sdr92507Sat")
	private Notes sdr92507Sat;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sdr92506Sat")
	private Notes sdr92506Sat;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sdr92526Saturday")
	private Notes sdr92526Saturday;
	// @OneToOne(cascade=CascadeType.ALL)
	@Column(name = "sdr92610Satuday")
	private Boolean sdr92610Satuday;
	@Column(name = "dateSaturday")
	private Date dateSaturday;

	// Friday

	@Column(name = "initialsFri")
	private String initialsFri;
	// @OneToOne(cascade=CascadeType.ALL)
	@Column(name = "totalMinFri")
	private String totalMinFri;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "incidentsFri")
	private Notes incidentsFri;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "other01Fri")
	private Notes other01Fri;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sdr92532Fri")
	private Notes sdr92532Fri;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sdr92507Fri")
	private Notes sdr92507Fri;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sdr92506Fri")
	private Notes sdr92506Fri;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sdr92526Friday")
	private Notes sdr92526Friday;
	// @OneToOne(cascade=CascadeType.ALL)
	@Column(name = "sdr92610Friday")
	private Boolean sdr92610Friday;
	@Column(name = "dateFriday")
	private Date dateFriday;

	// Thursday

	@Column(name = "initialsThu")
	private String initialsThu;
	// @OneToOne(cascade=CascadeType.ALL)
	@Column(name = "totalMinThu")
	private String totalMinThu;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "incidentsThu")
	private Notes incidentsThu;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "other01Thu")
	private Notes other01Thu;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sdr92532Thu")
	private Notes sdr92532Thu;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sdr92507Thu")
	private Notes sdr92507Thu;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sdr92506Thu")
	private Notes sdr92506Thu;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sdr92526Thursday")
	private Notes sdr92526Thursday;
	// @OneToOne(cascade=CascadeType.ALL)
	@Column(name = "sdr92610Thursday")
	private Boolean sdr92610Thursday;
	@Column(name = "dateThursday")
	private Date dateThursday;
	// Wednesday

	@Column(name = "initialsWed")
	private String initialsWed;
	// @OneToOne(cascade=CascadeType.ALL)
	@Column(name = "totalMinWed")
	private String totalMinWed;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "incidentsWed")
	private Notes incidentsWed;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "other01Wed")
	private Notes other01Wed;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sdr92532Wed")
	private Notes sdr92532Wed;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sdr92507Wed")
	private Notes sdr92507Wed;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sdr92506Wed")
	private Notes sdr92506Wed;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sdr92526Wednesday")
	private Notes sdr92526Wednesday;
	// @OneToOne(cascade=CascadeType.ALL)
	@Column(name = "sdr92610Wednesday")
	private Boolean sdr92610Wednesday;
	@Column(name = "dateWednesday")
	private Date dateWednesday;
	// tuesday

	@Column(name = "initialsTue")
	private String initialsTue;
	// @OneToOne(cascade=CascadeType.ALL)
	@Column(name = "totalMinTue")
	private String totalMinTue;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "incidentsTue")
	private Notes incidentsTue;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "other01Tue")
	private Notes other01Tue;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sdr92532Tue")
	private Notes sdr92532Tue;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sdr92507Tue")
	private Notes sdr92507Tue;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sdr92506Tue")
	private Notes sdr92506Tue;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sdr92526Tuesday")
	private Notes sdr92526Tuesday;
	// @OneToOne(cascade=CascadeType.ALL)
	@Column(name = "sdr92610Tuesday")
	private Boolean sdr92610Tuesday;
	@Column(name = "dateTuesday")
	private Date dateTuesday;
	// monday

	@Column(name = "initialsMon")
	private String initialsMon;
	// @OneToOne(cascade=CascadeType.ALL)
	@Column(name = "totalMinMon")
	private String totalMinMon;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "incidentsMon")
	private Notes incidentsMon;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "other01Mon")
	private Notes other01Mon;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sdr92532Mon")
	private Notes sdr92532Mon;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sdr92507Mon")
	private Notes sdr92507Mon;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sdr92506Mon")
	private Notes sdr92506Mon;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sdr92526Monday")
	private Notes sdr92526Monday;
	// @OneToOne(cascade=CascadeType.ALL)
	@Column(name = "sdr92610Monday")
	private Boolean sdr92610Monday;
	@Column(name = "dateMonday")
	private Date dateMonday;
	// sunday

	@Column(name = "initialsSun")
	private String initialsSun;
	// @OneToOne(cascade=CascadeType.ALL)
	@Column(name = "totalMinSun")
	private String totalMinSun;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "incidentsSun")
	private Notes incidentsSun;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "other01Sun")
	private Notes other01Sun;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sdr92532Sun")
	private Notes sdr92532Sun;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sdr92507Sun")
	private Notes sdr92507Sun;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sdr92506Sun")
	private Notes sdr92506Sun;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sdr92526Sunday")
	private Notes sdr92526Sunday;
	// @OneToOne(cascade=CascadeType.ALL)
	@Column(name = "sdr92610Sunday")
	private Boolean sdr92610Sunday;
	@Column(name = "dateSunday")
	private Date dateSunday;

	@Column(name = "otherRowField01")
	private String otherRowField01;
	@Column(name = "precautions")
	private String precautions;
	@Column(name = "dx")
	private String dx;
	@Column(name = "otherField")
	private String otherField;
	@Column(name = "other")
	private boolean other;
	@Column(name = "hmo")
	private boolean hmo;
	@Column(name = "medB")
	private boolean medB;
	@Column(name = "medA")
	private boolean medA;
	@Column(name = "hicNo")
	private String hicNo;

	public Date getCoSignLicDate() {
		return this.coSignLicDate;
	}

	public void setCoSignLicDate(Date coSignLicDate) {
		this.coSignLicDate = coSignLicDate;
	}

	public String getLicenseNo03() {
		return this.licenseNo03;
	}

	public void setLicenseNo03(String licenseNo03) {
		this.licenseNo03 = licenseNo03;
	}

	public String getSignature03() {
		return this.signature03;
	}

	public void setSignature03(String signature03) {
		this.signature03 = signature03;
	}

	public String getPrintTherapInitials03() {
		return this.printTherapInitials03;
	}

	public void setPrintTherapInitials03(String printTherapInitials03) {
		this.printTherapInitials03 = printTherapInitials03;
	}

	public String getLicenseNo02() {
		return this.licenseNo02;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public void setLicenseNo02(String licenseNo02) {
		this.licenseNo02 = licenseNo02;
	}

	public String getSignature02() {
		return this.signature02;
	}

	public void setSignature02(String signature02) {
		this.signature02 = signature02;
	}

	public String getPrintTherapInitials02() {
		return this.printTherapInitials02;
	}

	public void setPrintTherapInitials02(String printTherapInitials02) {
		this.printTherapInitials02 = printTherapInitials02;
	}

	public String getCoSignLic() {
		return this.coSignLic;
	}

	public void setCoSignLic(String coSignLic) {
		this.coSignLic = coSignLic;
	}

	public String getLicenseNo01() {
		return this.licenseNo01;
	}

	public void setLicenseNo01(String licenseNo01) {
		this.licenseNo01 = licenseNo01;
	}

	public String getSignature01() {
		return this.signature01;
	}

	public void setSignature01(String signature01) {
		this.signature01 = signature01;
	}

	public String getPrintTherapInitials01() {
		return this.printTherapInitials01;
	}

	public void setPrintTherapInitials01(String printTherapInitials01) {
		this.printTherapInitials01 = printTherapInitials01;
	}

	public boolean isCoSignNa() {
		return this.coSignNa;
	}

	public void setCoSignNa(boolean coSignNa) {
		this.coSignNa = coSignNa;
	}

	public Date getDateSaturday() {
		return this.dateSaturday;
	}

	public void setDateSaturday(Date dateSaturday) {
		this.dateSaturday = dateSaturday;
	}

	public Date getDateFriday() {
		return this.dateFriday;
	}

	public void setDateFriday(Date dateFriday) {
		this.dateFriday = dateFriday;
	}

	public Date getDateThursday() {
		return this.dateThursday;
	}

	public void setDateThursday(Date dateThursday) {
		this.dateThursday = dateThursday;
	}

	public Date getDateWednesday() {
		return this.dateWednesday;
	}

	public void setDateWednesday(Date dateWednesday) {
		this.dateWednesday = dateWednesday;
	}

	public Date getDateTuesday() {
		return this.dateTuesday;
	}

	public void setDateTuesday(Date dateTuesday) {
		this.dateTuesday = dateTuesday;
	}

	public Date getDateMonday() {
		return this.dateMonday;
	}

	public void setDateMonday(Date dateMonday) {
		this.dateMonday = dateMonday;
	}

	public Date getDateSunday() {
		return this.dateSunday;
	}

	public void setDateSunday(Date dateSunday) {
		this.dateSunday = dateSunday;
	}

	public String getOtherRowField01() {
		return this.otherRowField01;
	}

	public void setOtherRowField01(String otherRowField01) {
		this.otherRowField01 = otherRowField01;
	}

	public String getPrecautions() {
		return this.precautions;
	}

	public void setPrecautions(String precautions) {
		this.precautions = precautions;
	}

	public String getDx() {
		return this.dx;
	}

	public void setDx(String dx) {
		this.dx = dx;
	}

	public String getOtherField() {
		return this.otherField;
	}

	public void setOtherField(String otherField) {
		this.otherField = otherField;
	}

	public boolean isOther() {
		return this.other;
	}

	public void setOther(boolean other) {
		this.other = other;
	}

	public boolean isHmo() {
		return this.hmo;
	}

	public void setHmo(boolean hmo) {
		this.hmo = hmo;
	}

	public boolean isMedB() {
		return this.medB;
	}

	public void setMedB(boolean medB) {
		this.medB = medB;
	}

	public boolean isMedA() {
		return this.medA;
	}

	public void setMedA(boolean medA) {
		this.medA = medA;
	}

	public String getHicNo() {
		return this.hicNo;
	}

	public void setHicNo(String hicNo) {
		this.hicNo = hicNo;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public Notes getIncidentsSat() {
		return incidentsSat;
	}

	public void setIncidentsSat(Notes incidentsSat) {
		this.incidentsSat = incidentsSat;
	}

	public Notes getOther01Sat() {
		return other01Sat;
	}

	public void setOther01Sat(Notes other01Sat) {
		this.other01Sat = other01Sat;
	}

	public Notes getSdr92532Sat() {
		return sdr92532Sat;
	}

	public void setSdr92532Sat(Notes sdr92532Sat) {
		this.sdr92532Sat = sdr92532Sat;
	}

	public Notes getSdr92507Sat() {
		return sdr92507Sat;
	}

	public void setSdr92507Sat(Notes sdr92507Sat) {
		this.sdr92507Sat = sdr92507Sat;
	}

	public Notes getSdr92506Sat() {
		return sdr92506Sat;
	}

	public void setSdr92506Sat(Notes sdr92506Sat) {
		this.sdr92506Sat = sdr92506Sat;
	}

	public Notes getSdr92526Saturday() {
		return sdr92526Saturday;
	}

	public void setSdr92526Saturday(Notes sdr92526Saturday) {
		this.sdr92526Saturday = sdr92526Saturday;
	}

	public Notes getIncidentsFri() {
		return incidentsFri;
	}

	public void setIncidentsFri(Notes incidentsFri) {
		this.incidentsFri = incidentsFri;
	}

	public Notes getOther01Fri() {
		return other01Fri;
	}

	public void setOther01Fri(Notes other01Fri) {
		this.other01Fri = other01Fri;
	}

	public Notes getSdr92532Fri() {
		return sdr92532Fri;
	}

	public void setSdr92532Fri(Notes sdr92532Fri) {
		this.sdr92532Fri = sdr92532Fri;
	}

	public Notes getSdr92507Fri() {
		return sdr92507Fri;
	}

	public void setSdr92507Fri(Notes sdr92507Fri) {
		this.sdr92507Fri = sdr92507Fri;
	}

	public Notes getSdr92506Fri() {
		return sdr92506Fri;
	}

	public void setSdr92506Fri(Notes sdr92506Fri) {
		this.sdr92506Fri = sdr92506Fri;
	}

	public Notes getSdr92526Friday() {
		return sdr92526Friday;
	}

	public void setSdr92526Friday(Notes sdr92526Friday) {
		this.sdr92526Friday = sdr92526Friday;
	}

	public void setIncidentsThu(Notes incidentsThu) {
		this.incidentsThu = incidentsThu;
	}

	public Notes getOther01Thu() {
		return other01Thu;
	}

	public void setOther01Thu(Notes other01Thu) {
		this.other01Thu = other01Thu;
	}

	public Notes getSdr92532Thu() {
		return sdr92532Thu;
	}

	public void setSdr92532Thu(Notes sdr92532Thu) {
		this.sdr92532Thu = sdr92532Thu;
	}

	public Notes getSdr92507Thu() {
		return sdr92507Thu;
	}

	public void setSdr92507Thu(Notes sdr92507Thu) {
		this.sdr92507Thu = sdr92507Thu;
	}

	public Notes getSdr92506Thu() {
		return sdr92506Thu;
	}

	public void setSdr92506Thu(Notes sdr92506Thu) {
		this.sdr92506Thu = sdr92506Thu;
	}

	public Notes getSdr92526Thursday() {
		return sdr92526Thursday;
	}

	public void setSdr92526Thursday(Notes sdr92526Thursday) {
		this.sdr92526Thursday = sdr92526Thursday;
	}

	public void setIncidentsWed(Notes incidentsWed) {
		this.incidentsWed = incidentsWed;
	}

	public Notes getOther01Wed() {
		return other01Wed;
	}

	public void setOther01Wed(Notes other01Wed) {
		this.other01Wed = other01Wed;
	}

	public Notes getSdr92532Wed() {
		return sdr92532Wed;
	}

	public void setSdr92532Wed(Notes sdr92532Wed) {
		this.sdr92532Wed = sdr92532Wed;
	}

	public Notes getSdr92507Wed() {
		return sdr92507Wed;
	}

	public void setSdr92507Wed(Notes sdr92507Wed) {
		this.sdr92507Wed = sdr92507Wed;
	}

	public Notes getSdr92506Wed() {
		return sdr92506Wed;
	}

	public void setSdr92506Wed(Notes sdr92506Wed) {
		this.sdr92506Wed = sdr92506Wed;
	}

	public Notes getSdr92526Wednesday() {
		return sdr92526Wednesday;
	}

	public void setSdr92526Wednesday(Notes sdr92526Wednesday) {
		this.sdr92526Wednesday = sdr92526Wednesday;
	}

	public void setIncidentsTue(Notes incidentsTue) {
		this.incidentsTue = incidentsTue;
	}

	public Notes getOther01Tue() {
		return other01Tue;
	}

	public void setOther01Tue(Notes other01Tue) {
		this.other01Tue = other01Tue;
	}

	public Notes getSdr92532Tue() {
		return sdr92532Tue;
	}

	public void setSdr92532Tue(Notes sdr92532Tue) {
		this.sdr92532Tue = sdr92532Tue;
	}

	public Notes getSdr92507Tue() {
		return sdr92507Tue;
	}

	public void setSdr92507Tue(Notes sdr92507Tue) {
		this.sdr92507Tue = sdr92507Tue;
	}

	public Notes getSdr92506Tue() {
		return sdr92506Tue;
	}

	public void setSdr92506Tue(Notes sdr92506Tue) {
		this.sdr92506Tue = sdr92506Tue;
	}

	public Notes getSdr92526Tuesday() {
		return sdr92526Tuesday;
	}

	public void setSdr92526Tuesday(Notes sdr92526Tuesday) {
		this.sdr92526Tuesday = sdr92526Tuesday;
	}

	public Notes getIncidentsMon() {
		return incidentsMon;
	}

	public void setIncidentsMon(Notes incidentsMon) {
		this.incidentsMon = incidentsMon;
	}

	public Notes getOther01Mon() {
		return other01Mon;
	}

	public void setOther01Mon(Notes other01Mon) {
		this.other01Mon = other01Mon;
	}

	public Notes getSdr92532Mon() {
		return sdr92532Mon;
	}

	public void setSdr92532Mon(Notes sdr92532Mon) {
		this.sdr92532Mon = sdr92532Mon;
	}

	public Notes getSdr92507Mon() {
		return sdr92507Mon;
	}

	public void setSdr92507Mon(Notes sdr92507Mon) {
		this.sdr92507Mon = sdr92507Mon;
	}

	public Notes getSdr92506Mon() {
		return sdr92506Mon;
	}

	public void setSdr92506Mon(Notes sdr92506Mon) {
		this.sdr92506Mon = sdr92506Mon;
	}

	public Notes getSdr92526Monday() {
		return sdr92526Monday;
	}

	public void setSdr92526Monday(Notes sdr92526Monday) {
		this.sdr92526Monday = sdr92526Monday;
	}

	public void setInitialsSat(String initialsSat) {
		this.initialsSat = initialsSat;
	}

	public String getInitialsFri() {
		return initialsFri;
	}

	public void setInitialsFri(String initialsFri) {
		this.initialsFri = initialsFri;
	}

	public String getInitialsThu() {
		return initialsThu;
	}

	public void setInitialsThu(String initialsThu) {
		this.initialsThu = initialsThu;
	}

	public String getInitialsWed() {
		return initialsWed;
	}

	public void setInitialsWed(String initialsWed) {
		this.initialsWed = initialsWed;
	}

	public String getInitialsTue() {
		return initialsTue;
	}

	public void setInitialsTue(String initialsTue) {
		this.initialsTue = initialsTue;
	}

	public String getInitialsMon() {
		return initialsMon;
	}

	public void setInitialsMon(String initialsMon) {
		this.initialsMon = initialsMon;
	}

	public String getInitialsSun() {
		return initialsSun;
	}

	public void setInitialsSun(String initialsSun) {
		this.initialsSun = initialsSun;
	}

	public String getTotalMinSat() {
		return totalMinSat;
	}

	public void setTotalMinSat(String totalMinSat) {
		this.totalMinSat = totalMinSat;
	}

	public String getTotalMinFri() {
		return totalMinFri;
	}

	public void setTotalMinFri(String totalMinFri) {
		this.totalMinFri = totalMinFri;
	}

	public String getTotalMinThu() {
		return totalMinThu;
	}

	public void setTotalMinThu(String totalMinThu) {
		this.totalMinThu = totalMinThu;
	}

	public String getTotalMinWed() {
		return totalMinWed;
	}

	public void setTotalMinWed(String totalMinWed) {
		this.totalMinWed = totalMinWed;
	}

	public String getTotalMinTue() {
		return totalMinTue;
	}

	public void setTotalMinTue(String totalMinTue) {
		this.totalMinTue = totalMinTue;
	}

	public String getTotalMinMon() {
		return totalMinMon;
	}

	public void setTotalMinMon(String totalMinMon) {
		this.totalMinMon = totalMinMon;
	}

	public String getTotalMinSun() {
		return totalMinSun;
	}

	public void setTotalMinSun(String totalMinSun) {
		this.totalMinSun = totalMinSun;
	}

	public String getInitialsSat() {
		return initialsSat;
	}

	public Notes getIncidentsThu() {
		return incidentsThu;
	}

	public Notes getIncidentsWed() {
		return incidentsWed;
	}

	public Notes getIncidentsTue() {
		return incidentsTue;
	}

	public Notes getIncidentsSun() {
		return incidentsSun;
	}

	public void setIncidentsSun(Notes incidentsSun) {
		this.incidentsSun = incidentsSun;
	}

	public Notes getOther01Sun() {
		return other01Sun;
	}

	public void setOther01Sun(Notes other01Sun) {
		this.other01Sun = other01Sun;
	}

	public Notes getSdr92532Sun() {
		return sdr92532Sun;
	}

	public void setSdr92532Sun(Notes sdr92532Sun) {
		this.sdr92532Sun = sdr92532Sun;
	}

	public Notes getSdr92507Sun() {
		return sdr92507Sun;
	}

	public void setSdr92507Sun(Notes sdr92507Sun) {
		this.sdr92507Sun = sdr92507Sun;
	}

	public Notes getSdr92506Sun() {
		return sdr92506Sun;
	}

	public void setSdr92506Sun(Notes sdr92506Sun) {
		this.sdr92506Sun = sdr92506Sun;
	}

	public Notes getSdr92526Sunday() {
		return sdr92526Sunday;
	}

	public void setSdr92526Sunday(Notes sdr92526Sunday) {
		this.sdr92526Sunday = sdr92526Sunday;
	}

	public Boolean getSdr92610Satuday() {
		return sdr92610Satuday;
	}

	public void setSdr92610Satuday(Boolean sdr92610Satuday) {
		this.sdr92610Satuday = sdr92610Satuday;
	}

	public Boolean getSdr92610Friday() {
		return sdr92610Friday;
	}

	public void setSdr92610Friday(Boolean sdr92610Friday) {
		this.sdr92610Friday = sdr92610Friday;
	}

	public Boolean getSdr92610Thursday() {
		return sdr92610Thursday;
	}

	public void setSdr92610Thursday(Boolean sdr92610Thursday) {
		this.sdr92610Thursday = sdr92610Thursday;
	}

	public Boolean getSdr92610Wednesday() {
		return sdr92610Wednesday;
	}

	public void setSdr92610Wednesday(Boolean sdr92610Wednesday) {
		this.sdr92610Wednesday = sdr92610Wednesday;
	}

	public Boolean getSdr92610Tuesday() {
		return sdr92610Tuesday;
	}

	public void setSdr92610Tuesday(Boolean sdr92610Tuesday) {
		this.sdr92610Tuesday = sdr92610Tuesday;
	}

	public Boolean getSdr92610Monday() {
		return sdr92610Monday;
	}

	public void setSdr92610Monday(Boolean sdr92610Monday) {
		this.sdr92610Monday = sdr92610Monday;
	}

	public Boolean getSdr92610Sunday() {
		return sdr92610Sunday;
	}

	public void setSdr92610Sunday(Boolean sdr92610Sunday) {
		this.sdr92610Sunday = sdr92610Sunday;
	}
}
