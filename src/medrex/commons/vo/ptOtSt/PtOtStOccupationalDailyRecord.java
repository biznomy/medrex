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
import medrex.commons.vo.richTextField.RichTextField;

@Entity
@Table(name = "PtOtStOccupationalDailyRecord")
public class PtOtStOccupationalDailyRecord implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5149141880396050940L;
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
	@Column(name = "cosignNa")
	private boolean cosignNa;
	@Column(name = "initialsSat")
	private String initialsSat;
	@Column(name = "totalMinSat")
	private String totalMinSat;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "incidentsSat")
	private Notes incidentsSat;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "other02Sat")
	private Notes other02Sat;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "other01Sat")
	private Notes other01Sat;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "odr97535Sat")
	private Notes odr97535Sat;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "odr97530Sat")
	private Notes odr97530Sat;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "odr97112Sat")
	private Notes odr97112Sat;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "odr97110Saturday")
	private Notes odr97110Saturday;

	@Column(name = "odr97003Satuday")
	private boolean odr97003Satuday;

	@Column(name = "dateSaturday")
	private Date dateSaturday;
	@Column(name = "initialsFri")
	private String initialsFri;
	@Column(name = "totalMinFri")
	private String totalMinFri;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "incidentsFri")
	private Notes incidentsFri;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "other02Fri")
	private Notes other02Fri;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "other01Fri")
	private Notes other01Fri;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "odr97535Fri")
	private Notes odr97535Fri;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "odr97530Fri")
	private Notes odr97530Fri;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "odr97112Fri")
	private Notes odr97112Fri;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "odr97110Friday")
	private Notes odr97110Friday;

	@Column(name = "odr97003Friday")
	private boolean odr97003Friday;

	@Column(name = "dateFriday")
	private Date dateFriday;
	@Column(name = "initialsThu")
	private String initialsThu;
	@Column(name = "totalMinThu")
	private String totalMinThu;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "incidentsThu")
	private Notes incidentsThu;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "other02Thu")
	private Notes other02Thu;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "other01Thu")
	private Notes other01Thu;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "odr97535Thu")
	private Notes odr97535Thu;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "odr97530Thu")
	private Notes odr97530Thu;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "odr97112Thu")
	private Notes odr97112Thu;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "odr97110Thursday")
	private Notes odr97110Thursday;

	@Column(name = "odr97003Thursday")
	private boolean odr97003Thursday;

	@Column(name = "dateThursday")
	private Date dateThursday;
	@Column(name = "initialsWed")
	private String initialsWed;
	@Column(name = "totalMinWed")
	private String totalMinWed;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "incidentsWed")
	private Notes incidentsWed;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "other02Wed")
	private Notes other02Wed;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "other01Wed")
	private Notes other01Wed;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "odr97535Wed")
	private Notes odr97535Wed;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "odr97530Wed")
	private Notes odr97530Wed;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "odr97112Wed")
	private Notes odr97112Wed;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "odr97110Wednesday")
	private Notes odr97110Wednesday;

	@Column(name = "odr97003Wednesday")
	private boolean odr97003Wednesday;

	@Column(name = "dateWednesday")
	private Date dateWednesday;
	@Column(name = "initialsTue")
	private String initialsTue;
	@Column(name = "totalMinTue")
	private String totalMinTue;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "incidentsTue")
	private Notes incidentsTue;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "other02Tue")
	private Notes other02Tue;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "other01Tue")
	private Notes other01Tue;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "odr97535Tue")
	private Notes odr97535Tue;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "odr97530Tue")
	private Notes odr97530Tue;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "odr97112Tue")
	private Notes odr97112Tue;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "odr97110Tuesday")
	private Notes odr97110Tuesday;

	@Column(name = "odr97003Tuesday")
	private boolean odr97003Tuesday;

	@Column(name = "dateTuesday")
	private Date dateTuesday;
	@Column(name = "initialsMon")
	private String initialsMon;
	@Column(name = "totalMinMon")
	private String totalMinMon;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "incidentsMon")
	private Notes incidentsMon;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "other02Mon")
	private Notes other02Mon;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "other01Mon")
	private Notes other01Mon;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "odr97535Mon")
	private Notes odr97535Mon;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "odr97530Mon")
	private Notes odr97530Mon;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "odr97112Mon")
	private Notes odr97112Mon;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "odr97110Monday")
	private Notes odr97110Monday;

	@Column(name = "odr97003Monday")
	private boolean odr97003Monday;
	@Column(name = "dateMonday")
	private Date dateMonday;
	@Column(name = "initialsSun")
	private String initialsSun;
	@Column(name = "totalMinSun")
	private String totalMinSun;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "incidentsSun")
	private Notes incidentsSun;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "other02Sun")
	private Notes other02Sun;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "other01Sun")
	private Notes other01Sun;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "odr97535Sun")
	private Notes odr97535Sun;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "odr97530Sun")
	private Notes odr97530Sun;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "odr97112Sun")
	private Notes odr97112Sun;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "odr97110Sunday")
	private Notes odr97110Sunday;

	@Column(name = "odr97003Sunday")
	private boolean odr97003Sunday;

	@Column(name = "dateSunday")
	private Date dateSunday;
	@Column(name = "otherRowField02")
	private String otherRowField02;
	@Column(name = "otherRowField01")
	private String otherRowField01;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "precautions")
	private RichTextField precautions;

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
	@Column(name = "frequency")
	private String frequency;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public Date getCoSignLicDate() {
		return coSignLicDate;
	}

	public void setCoSignLicDate(Date coSignLicDate) {
		this.coSignLicDate = coSignLicDate;
	}

	public String getLicenseNo03() {
		return licenseNo03;
	}

	public void setLicenseNo03(String licenseNo03) {
		this.licenseNo03 = licenseNo03;
	}

	public String getSignature03() {
		return signature03;
	}

	public void setSignature03(String signature03) {
		this.signature03 = signature03;
	}

	public String getPrintTherapInitials03() {
		return printTherapInitials03;
	}

	public void setPrintTherapInitials03(String printTherapInitials03) {
		this.printTherapInitials03 = printTherapInitials03;
	}

	public String getLicenseNo02() {
		return licenseNo02;
	}

	public void setLicenseNo02(String licenseNo02) {
		this.licenseNo02 = licenseNo02;
	}

	public String getSignature02() {
		return signature02;
	}

	public void setSignature02(String signature02) {
		this.signature02 = signature02;
	}

	public String getPrintTherapInitials02() {
		return printTherapInitials02;
	}

	public void setPrintTherapInitials02(String printTherapInitials02) {
		this.printTherapInitials02 = printTherapInitials02;
	}

	public String getCoSignLic() {
		return coSignLic;
	}

	public void setCoSignLic(String coSignLic) {
		this.coSignLic = coSignLic;
	}

	public String getLicenseNo01() {
		return licenseNo01;
	}

	public void setLicenseNo01(String licenseNo01) {
		this.licenseNo01 = licenseNo01;
	}

	public String getSignature01() {
		return signature01;
	}

	public void setSignature01(String signature01) {
		this.signature01 = signature01;
	}

	public String getPrintTherapInitials01() {
		return printTherapInitials01;
	}

	public void setPrintTherapInitials01(String printTherapInitials01) {
		this.printTherapInitials01 = printTherapInitials01;
	}

	public boolean isCosignNa() {
		return cosignNa;
	}

	public void setCosignNa(boolean cosignNa) {
		this.cosignNa = cosignNa;
	}

	public String getInitialsSat() {
		return initialsSat;
	}

	public void setInitialsSat(String initialsSat) {
		this.initialsSat = initialsSat;
	}

	public String getTotalMinSat() {
		return totalMinSat;
	}

	public void setTotalMinSat(String totalMinSat) {
		this.totalMinSat = totalMinSat;
	}

	public Notes getIncidentsSat() {
		return incidentsSat;
	}

	public void setIncidentsSat(Notes incidentsSat) {
		this.incidentsSat = incidentsSat;
	}

	public Notes getOther02Sat() {
		return other02Sat;
	}

	public void setOther02Sat(Notes other02Sat) {
		this.other02Sat = other02Sat;
	}

	public Notes getOther01Sat() {
		return other01Sat;
	}

	public void setOther01Sat(Notes other01Sat) {
		this.other01Sat = other01Sat;
	}

	public Notes getOdr97535Sat() {
		return odr97535Sat;
	}

	public void setOdr97535Sat(Notes odr97535Sat) {
		this.odr97535Sat = odr97535Sat;
	}

	public Notes getOdr97530Sat() {
		return odr97530Sat;
	}

	public void setOdr97530Sat(Notes odr97530Sat) {
		this.odr97530Sat = odr97530Sat;
	}

	public Notes getOdr97112Sat() {
		return odr97112Sat;
	}

	public void setOdr97112Sat(Notes odr97112Sat) {
		this.odr97112Sat = odr97112Sat;
	}

	public Notes getOdr97110Saturday() {
		return odr97110Saturday;
	}

	public void setOdr97110Saturday(Notes odr97110Saturday) {
		this.odr97110Saturday = odr97110Saturday;
	}

	public boolean isOdr97003Satuday() {
		return odr97003Satuday;
	}

	public void setOdr97003Satuday(boolean odr97003Satuday) {
		this.odr97003Satuday = odr97003Satuday;
	}

	public Date getDateSaturday() {
		return dateSaturday;
	}

	public void setDateSaturday(Date dateSaturday) {
		this.dateSaturday = dateSaturday;
	}

	public String getInitialsFri() {
		return initialsFri;
	}

	public void setInitialsFri(String initialsFri) {
		this.initialsFri = initialsFri;
	}

	public String getTotalMinFri() {
		return totalMinFri;
	}

	public void setTotalMinFri(String totalMinFri) {
		this.totalMinFri = totalMinFri;
	}

	public Notes getIncidentsFri() {
		return incidentsFri;
	}

	public void setIncidentsFri(Notes incidentsFri) {
		this.incidentsFri = incidentsFri;
	}

	public Notes getOther02Fri() {
		return other02Fri;
	}

	public void setOther02Fri(Notes other02Fri) {
		this.other02Fri = other02Fri;
	}

	public Notes getOther01Fri() {
		return other01Fri;
	}

	public void setOther01Fri(Notes other01Fri) {
		this.other01Fri = other01Fri;
	}

	public Notes getOdr97535Fri() {
		return odr97535Fri;
	}

	public void setOdr97535Fri(Notes odr97535Fri) {
		this.odr97535Fri = odr97535Fri;
	}

	public Notes getOdr97530Fri() {
		return odr97530Fri;
	}

	public void setOdr97530Fri(Notes odr97530Fri) {
		this.odr97530Fri = odr97530Fri;
	}

	public Notes getOdr97112Fri() {
		return odr97112Fri;
	}

	public void setOdr97112Fri(Notes odr97112Fri) {
		this.odr97112Fri = odr97112Fri;
	}

	public Notes getOdr97110Friday() {
		return odr97110Friday;
	}

	public void setOdr97110Friday(Notes odr97110Friday) {
		this.odr97110Friday = odr97110Friday;
	}

	public boolean isOdr97003Friday() {
		return odr97003Friday;
	}

	public void setOdr97003Friday(boolean odr97003Friday) {
		this.odr97003Friday = odr97003Friday;
	}

	public Date getDateFriday() {
		return dateFriday;
	}

	public void setDateFriday(Date dateFriday) {
		this.dateFriday = dateFriday;
	}

	public String getInitialsThu() {
		return initialsThu;
	}

	public void setInitialsThu(String initialsThu) {
		this.initialsThu = initialsThu;
	}

	public String getTotalMinThu() {
		return totalMinThu;
	}

	public void setTotalMinThu(String totalMinThu) {
		this.totalMinThu = totalMinThu;
	}

	public Notes getIncidentsThu() {
		return incidentsThu;
	}

	public void setIncidentsThu(Notes incidentsThu) {
		this.incidentsThu = incidentsThu;
	}

	public Notes getOther02Thu() {
		return other02Thu;
	}

	public void setOther02Thu(Notes other02Thu) {
		this.other02Thu = other02Thu;
	}

	public Notes getOther01Thu() {
		return other01Thu;
	}

	public void setOther01Thu(Notes other01Thu) {
		this.other01Thu = other01Thu;
	}

	public Notes getOdr97535Thu() {
		return odr97535Thu;
	}

	public void setOdr97535Thu(Notes odr97535Thu) {
		this.odr97535Thu = odr97535Thu;
	}

	public Notes getOdr97530Thu() {
		return odr97530Thu;
	}

	public void setOdr97530Thu(Notes odr97530Thu) {
		this.odr97530Thu = odr97530Thu;
	}

	public Notes getOdr97112Thu() {
		return odr97112Thu;
	}

	public void setOdr97112Thu(Notes odr97112Thu) {
		this.odr97112Thu = odr97112Thu;
	}

	public Notes getOdr97110Thursday() {
		return odr97110Thursday;
	}

	public void setOdr97110Thursday(Notes odr97110Thursday) {
		this.odr97110Thursday = odr97110Thursday;
	}

	public boolean isOdr97003Thursday() {
		return odr97003Thursday;
	}

	public void setOdr97003Thursday(boolean odr97003Thursday) {
		this.odr97003Thursday = odr97003Thursday;
	}

	public Date getDateThursday() {
		return dateThursday;
	}

	public void setDateThursday(Date dateThursday) {
		this.dateThursday = dateThursday;
	}

	public String getInitialsWed() {
		return initialsWed;
	}

	public void setInitialsWed(String initialsWed) {
		this.initialsWed = initialsWed;
	}

	public String getTotalMinWed() {
		return totalMinWed;
	}

	public void setTotalMinWed(String totalMinWed) {
		this.totalMinWed = totalMinWed;
	}

	public Notes getIncidentsWed() {
		return incidentsWed;
	}

	public void setIncidentsWed(Notes incidentsWed) {
		this.incidentsWed = incidentsWed;
	}

	public Notes getOther02Wed() {
		return other02Wed;
	}

	public void setOther02Wed(Notes other02Wed) {
		this.other02Wed = other02Wed;
	}

	public Notes getOther01Wed() {
		return other01Wed;
	}

	public void setOther01Wed(Notes other01Wed) {
		this.other01Wed = other01Wed;
	}

	public Notes getOdr97535Wed() {
		return odr97535Wed;
	}

	public void setOdr97535Wed(Notes odr97535Wed) {
		this.odr97535Wed = odr97535Wed;
	}

	public Notes getOdr97530Wed() {
		return odr97530Wed;
	}

	public void setOdr97530Wed(Notes odr97530Wed) {
		this.odr97530Wed = odr97530Wed;
	}

	public Notes getOdr97112Wed() {
		return odr97112Wed;
	}

	public void setOdr97112Wed(Notes odr97112Wed) {
		this.odr97112Wed = odr97112Wed;
	}

	public Notes getOdr97110Wednesday() {
		return odr97110Wednesday;
	}

	public void setOdr97110Wednesday(Notes odr97110Wednesday) {
		this.odr97110Wednesday = odr97110Wednesday;
	}

	public boolean isOdr97003Wednesday() {
		return odr97003Wednesday;
	}

	public void setOdr97003Wednesday(boolean odr97003Wednesday) {
		this.odr97003Wednesday = odr97003Wednesday;
	}

	public Date getDateWednesday() {
		return dateWednesday;
	}

	public void setDateWednesday(Date dateWednesday) {
		this.dateWednesday = dateWednesday;
	}

	public String getInitialsTue() {
		return initialsTue;
	}

	public void setInitialsTue(String initialsTue) {
		this.initialsTue = initialsTue;
	}

	public String getTotalMinTue() {
		return totalMinTue;
	}

	public void setTotalMinTue(String totalMinTue) {
		this.totalMinTue = totalMinTue;
	}

	public Notes getIncidentsTue() {
		return incidentsTue;
	}

	public void setIncidentsTue(Notes incidentsTue) {
		this.incidentsTue = incidentsTue;
	}

	public Notes getOther02Tue() {
		return other02Tue;
	}

	public void setOther02Tue(Notes other02Tue) {
		this.other02Tue = other02Tue;
	}

	public Notes getOther01Tue() {
		return other01Tue;
	}

	public void setOther01Tue(Notes other01Tue) {
		this.other01Tue = other01Tue;
	}

	public Notes getOdr97535Tue() {
		return odr97535Tue;
	}

	public void setOdr97535Tue(Notes odr97535Tue) {
		this.odr97535Tue = odr97535Tue;
	}

	public Notes getOdr97530Tue() {
		return odr97530Tue;
	}

	public void setOdr97530Tue(Notes odr97530Tue) {
		this.odr97530Tue = odr97530Tue;
	}

	public Notes getOdr97112Tue() {
		return odr97112Tue;
	}

	public void setOdr97112Tue(Notes odr97112Tue) {
		this.odr97112Tue = odr97112Tue;
	}

	public Notes getOdr97110Tuesday() {
		return odr97110Tuesday;
	}

	public void setOdr97110Tuesday(Notes odr97110Tuesday) {
		this.odr97110Tuesday = odr97110Tuesday;
	}

	public boolean isOdr97003Tuesday() {
		return odr97003Tuesday;
	}

	public void setOdr97003Tuesday(boolean odr97003Tuesday) {
		this.odr97003Tuesday = odr97003Tuesday;
	}

	public Date getDateTuesday() {
		return dateTuesday;
	}

	public void setDateTuesday(Date dateTuesday) {
		this.dateTuesday = dateTuesday;
	}

	public String getInitialsMon() {
		return initialsMon;
	}

	public void setInitialsMon(String initialsMon) {
		this.initialsMon = initialsMon;
	}

	public String getTotalMinMon() {
		return totalMinMon;
	}

	public void setTotalMinMon(String totalMinMon) {
		this.totalMinMon = totalMinMon;
	}

	public Notes getIncidentsMon() {
		return incidentsMon;
	}

	public void setIncidentsMon(Notes incidentsMon) {
		this.incidentsMon = incidentsMon;
	}

	public Notes getOther02Mon() {
		return other02Mon;
	}

	public void setOther02Mon(Notes other02Mon) {
		this.other02Mon = other02Mon;
	}

	public Notes getOther01Mon() {
		return other01Mon;
	}

	public void setOther01Mon(Notes other01Mon) {
		this.other01Mon = other01Mon;
	}

	public Notes getOdr97535Mon() {
		return odr97535Mon;
	}

	public void setOdr97535Mon(Notes odr97535Mon) {
		this.odr97535Mon = odr97535Mon;
	}

	public Notes getOdr97530Mon() {
		return odr97530Mon;
	}

	public void setOdr97530Mon(Notes odr97530Mon) {
		this.odr97530Mon = odr97530Mon;
	}

	public Notes getOdr97112Mon() {
		return odr97112Mon;
	}

	public void setOdr97112Mon(Notes odr97112Mon) {
		this.odr97112Mon = odr97112Mon;
	}

	public Notes getOdr97110Monday() {
		return odr97110Monday;
	}

	public void setOdr97110Monday(Notes odr97110Monday) {
		this.odr97110Monday = odr97110Monday;
	}

	public boolean isOdr97003Monday() {
		return odr97003Monday;
	}

	public void setOdr97003Monday(boolean odr97003Monday) {
		this.odr97003Monday = odr97003Monday;
	}

	public Date getDateMonday() {
		return dateMonday;
	}

	public void setDateMonday(Date dateMonday) {
		this.dateMonday = dateMonday;
	}

	public String getInitialsSun() {
		return initialsSun;
	}

	public void setInitialsSun(String initialsSun) {
		this.initialsSun = initialsSun;
	}

	public String getTotalMinSun() {
		return totalMinSun;
	}

	public void setTotalMinSun(String totalMinSun) {
		this.totalMinSun = totalMinSun;
	}

	public Notes getIncidentsSun() {
		return incidentsSun;
	}

	public void setIncidentsSun(Notes incidentsSun) {
		this.incidentsSun = incidentsSun;
	}

	public Notes getOther02Sun() {
		return other02Sun;
	}

	public void setOther02Sun(Notes other02Sun) {
		this.other02Sun = other02Sun;
	}

	public Notes getOther01Sun() {
		return other01Sun;
	}

	public void setOther01Sun(Notes other01Sun) {
		this.other01Sun = other01Sun;
	}

	public Notes getOdr97535Sun() {
		return odr97535Sun;
	}

	public void setOdr97535Sun(Notes odr97535Sun) {
		this.odr97535Sun = odr97535Sun;
	}

	public Notes getOdr97530Sun() {
		return odr97530Sun;
	}

	public void setOdr97530Sun(Notes odr97530Sun) {
		this.odr97530Sun = odr97530Sun;
	}

	public Notes getOdr97112Sun() {
		return odr97112Sun;
	}

	public void setOdr97112Sun(Notes odr97112Sun) {
		this.odr97112Sun = odr97112Sun;
	}

	public Notes getOdr97110Sunday() {
		return odr97110Sunday;
	}

	public void setOdr97110Sunday(Notes odr97110Sunday) {
		this.odr97110Sunday = odr97110Sunday;
	}

	public boolean isOdr97003Sunday() {
		return odr97003Sunday;
	}

	public void setOdr97003Sunday(boolean odr97003Sunday) {
		this.odr97003Sunday = odr97003Sunday;
	}

	public Date getDateSunday() {
		return dateSunday;
	}

	public void setDateSunday(Date dateSunday) {
		this.dateSunday = dateSunday;
	}

	public String getOtherRowField02() {
		return otherRowField02;
	}

	public void setOtherRowField02(String otherRowField02) {
		this.otherRowField02 = otherRowField02;
	}

	public String getOtherRowField01() {
		return otherRowField01;
	}

	public void setOtherRowField01(String otherRowField01) {
		this.otherRowField01 = otherRowField01;
	}

	public RichTextField getPrecautions() {
		return precautions;
	}

	public void setPrecautions(RichTextField precautions) {
		this.precautions = precautions;
	}

	public String getDx() {
		return dx;
	}

	public void setDx(String dx) {
		this.dx = dx;
	}

	public String getOtherField() {
		return otherField;
	}

	public void setOtherField(String otherField) {
		this.otherField = otherField;
	}

	public boolean isOther() {
		return other;
	}

	public void setOther(boolean other) {
		this.other = other;
	}

	public boolean isHmo() {
		return hmo;
	}

	public void setHmo(boolean hmo) {
		this.hmo = hmo;
	}

	public boolean isMedB() {
		return medB;
	}

	public void setMedB(boolean medB) {
		this.medB = medB;
	}

	public boolean isMedA() {
		return medA;
	}

	public void setMedA(boolean medA) {
		this.medA = medA;
	}

	public String getHicNo() {
		return hicNo;
	}

	public void setHicNo(String hicNo) {
		this.hicNo = hicNo;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

}
