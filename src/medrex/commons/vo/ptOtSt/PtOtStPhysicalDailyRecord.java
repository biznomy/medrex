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
@Table(name = "PtOtStPhysicalDailyRecord")
public class PtOtStPhysicalDailyRecord implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6463107818846091022L;
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
	@Column(name = "coSignNa")
	private boolean coSignNa;
	@Column(name = "initialsSat")
	private String initialsSat;
	@Column(name = "totalMinSat")
	private String totalMinSat;
	// saturday
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
	@JoinColumn(name = "pdr97530Sat")
	private Notes pdr97530Sat;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pdr97116Sat")
	private Notes pdr97116Sat;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pdr97112Sat")
	private Notes pdr97112Sat;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pdr97110Saturday")
	private Notes pdr97110Saturday;
	@Column(name = "pdr97001Satuday")
	private boolean pdr97001Satuday;

	@Column(name = "dateSaturday")
	private Date dateSaturday;
	@Column(name = "initialsFri")
	private String initialsFri;
	@Column(name = "totalMinFri")
	private String totalMinFri;

	// friday
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
	@JoinColumn(name = "pdr97530Fri")
	private Notes pdr97530Fri;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pdr97116Fri")
	private Notes pdr97116Fri;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pdr97112Fri")
	private Notes pdr97112Fri;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pdr97110Friday")
	private Notes pdr97110Friday;
	@Column(name = "pdr97001Friday")
	private boolean pdr97001Friday;

	@Column(name = "dateFriday")
	private Date dateFriday;
	@Column(name = "initialsThu")
	private String initialsThu;
	@Column(name = "totalMinThu")
	private String totalMinThu;

	// thursday
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
	@JoinColumn(name = "pdr97530Thu")
	private Notes pdr97530Thu;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pdr97116Thu")
	private Notes pdr97116Thu;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pdr97112Thu")
	private Notes pdr97112Thu;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pdr97110Thursday")
	private Notes pdr97110Thursday;
	@Column(name = "pdr97001Thursday")
	private boolean pdr97001Thursday;

	@Column(name = "dateThursday")
	private Date dateThursday;
	@Column(name = "initialsWed")
	private String initialsWed;
	@Column(name = "totalMinWed")
	private String totalMinWed;

	// wednesday
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
	@JoinColumn(name = "pdr97530Wed")
	private Notes pdr97530Wed;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pdr97116Wed")
	private Notes pdr97116Wed;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pdr97112Wed")
	private Notes pdr97112Wed;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pdr97110Wednesday")
	private Notes pdr97110Wednesday;
	@Column(name = "pdr97001Wednesday")
	private boolean pdr97001Wednesday;

	@Column(name = "dateWednesday")
	private Date dateWednesday;
	@Column(name = "initialsTue")
	private String initialsTue;
	@Column(name = "totalMinTue")
	private String totalMinTue;

	// tuesday
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
	@JoinColumn(name = "pdr97530Tue")
	private Notes pdr97530Tue;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pdr97116Tue")
	private Notes pdr97116Tue;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pdr97112Tue")
	private Notes pdr97112Tue;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pdr97110Tuesday")
	private Notes pdr97110Tuesday;
	@Column(name = "pdr97001Tuesday")
	private boolean pdr97001Tuesday;

	@Column(name = "dateTuesday")
	private Date dateTuesday;
	@Column(name = "initialsMon")
	private String initialsMon;
	@Column(name = "totalMinMon")
	private String totalMinMon;

	// monday
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
	@JoinColumn(name = "pdr97530Mon")
	private Notes pdr97530Mon;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pdr97116Mon")
	private Notes pdr97116Mon;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pdr97112Mon")
	private Notes pdr97112Mon;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pdr97110Monday")
	private Notes pdr97110Monday;
	@Column(name = "pdr97001Monday")
	private boolean pdr97001Monday;

	@Column(name = "dateMonday")
	private Date dateMonday;
	@Column(name = "initialsSun")
	private String initialsSun;
	@Column(name = "totalMinSun")
	private String totalMinSun;

	// sunday
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
	@JoinColumn(name = "pdr97530Sun")
	private Notes pdr97530Sun;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pdr97116Sun")
	private Notes pdr97116Sun;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pdr97112Sun")
	private Notes pdr97112Sun;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pdr97110Sunday")
	private Notes pdr97110Sunday;
	@Column(name = "pdr97001Sunday")
	private boolean pdr97001Sunday;

	@Column(name = "dateSunday")
	private Date dateSunday;
	@Column(name = "otherRowField02")
	private String otherRowField02;
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

	public String getInitialsSat() {
		return this.initialsSat;
	}

	public void setInitialsSat(String initialsSat) {
		this.initialsSat = initialsSat;
	}

	public String getTotalMinSat() {
		return this.totalMinSat;
	}

	public void setTotalMinSat(String totalMinSat) {
		this.totalMinSat = totalMinSat;
	}

	public Date getDateSaturday() {
		return this.dateSaturday;
	}

	public void setDateSaturday(Date dateSaturday) {
		this.dateSaturday = dateSaturday;
	}

	public String getInitialsFri() {
		return this.initialsFri;
	}

	public void setInitialsFri(String initialsFri) {
		this.initialsFri = initialsFri;
	}

	public String getTotalMinFri() {
		return this.totalMinFri;
	}

	public void setTotalMinFri(String totalMinFri) {
		this.totalMinFri = totalMinFri;
	}

	public Date getDateFriday() {
		return this.dateFriday;
	}

	public void setDateFriday(Date dateFriday) {
		this.dateFriday = dateFriday;
	}

	public String getInitialsThu() {
		return this.initialsThu;
	}

	public void setInitialsThu(String initialsThu) {
		this.initialsThu = initialsThu;
	}

	public String getTotalMinThu() {
		return this.totalMinThu;
	}

	public void setTotalMinThu(String totalMinThu) {
		this.totalMinThu = totalMinThu;
	}

	public Date getDateThursday() {
		return this.dateThursday;
	}

	public void setDateThursday(Date dateThursday) {
		this.dateThursday = dateThursday;
	}

	public String getInitialsWed() {
		return this.initialsWed;
	}

	public void setInitialsWed(String initialsWed) {
		this.initialsWed = initialsWed;
	}

	public String getTotalMinWed() {
		return this.totalMinWed;
	}

	public void setTotalMinWed(String totalMinWed) {
		this.totalMinWed = totalMinWed;
	}

	public Date getDateWednesday() {
		return this.dateWednesday;
	}

	public void setDateWednesday(Date dateWednesday) {
		this.dateWednesday = dateWednesday;
	}

	public String getInitialsTue() {
		return this.initialsTue;
	}

	public void setInitialsTue(String initialsTue) {
		this.initialsTue = initialsTue;
	}

	public String getTotalMinTue() {
		return this.totalMinTue;
	}

	public void setTotalMinTue(String totalMinTue) {
		this.totalMinTue = totalMinTue;
	}

	public Date getDateTuesday() {
		return this.dateTuesday;
	}

	public void setDateTuesday(Date dateTuesday) {
		this.dateTuesday = dateTuesday;
	}

	public String getInitialsMon() {
		return this.initialsMon;
	}

	public void setInitialsMon(String initialsMon) {
		this.initialsMon = initialsMon;
	}

	public String getTotalMinMon() {
		return this.totalMinMon;
	}

	public void setTotalMinMon(String totalMinMon) {
		this.totalMinMon = totalMinMon;
	}

	public Date getDateMonday() {
		return this.dateMonday;
	}

	public void setDateMonday(Date dateMonday) {
		this.dateMonday = dateMonday;
	}

	public String getInitialsSun() {
		return this.initialsSun;
	}

	public void setInitialsSun(String initialsSun) {
		this.initialsSun = initialsSun;
	}

	public String getTotalMinSun() {
		return this.totalMinSun;
	}

	public void setTotalMinSun(String totalMinSun) {
		this.totalMinSun = totalMinSun;
	}

	public Date getDateSunday() {
		return this.dateSunday;
	}

	public void setDateSunday(Date dateSunday) {
		this.dateSunday = dateSunday;
	}

	public String getOtherRowField02() {
		return this.otherRowField02;
	}

	public void setOtherRowField02(String otherRowField02) {
		this.otherRowField02 = otherRowField02;
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

	public Notes getPdr97530Sat() {
		return pdr97530Sat;
	}

	public void setPdr97530Sat(Notes pdr97530Sat) {
		this.pdr97530Sat = pdr97530Sat;
	}

	public Notes getPdr97116Sat() {
		return pdr97116Sat;
	}

	public void setPdr97116Sat(Notes pdr97116Sat) {
		this.pdr97116Sat = pdr97116Sat;
	}

	public Notes getPdr97112Sat() {
		return pdr97112Sat;
	}

	public void setPdr97112Sat(Notes pdr97112Sat) {
		this.pdr97112Sat = pdr97112Sat;
	}

	public Notes getPdr97110Saturday() {
		return pdr97110Saturday;
	}

	public void setPdr97110Saturday(Notes pdr97110Saturday) {
		this.pdr97110Saturday = pdr97110Saturday;
	}

	public boolean isPdr97001Satuday() {
		return pdr97001Satuday;
	}

	public void setPdr97001Satuday(boolean pdr97001Satuday) {
		this.pdr97001Satuday = pdr97001Satuday;
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

	public Notes getPdr97530Fri() {
		return pdr97530Fri;
	}

	public void setPdr97530Fri(Notes pdr97530Fri) {
		this.pdr97530Fri = pdr97530Fri;
	}

	public Notes getPdr97116Fri() {
		return pdr97116Fri;
	}

	public void setPdr97116Fri(Notes pdr97116Fri) {
		this.pdr97116Fri = pdr97116Fri;
	}

	public Notes getPdr97112Fri() {
		return pdr97112Fri;
	}

	public void setPdr97112Fri(Notes pdr97112Fri) {
		this.pdr97112Fri = pdr97112Fri;
	}

	public Notes getPdr97110Friday() {
		return pdr97110Friday;
	}

	public void setPdr97110Friday(Notes pdr97110Friday) {
		this.pdr97110Friday = pdr97110Friday;
	}

	public boolean isPdr97001Friday() {
		return pdr97001Friday;
	}

	public void setPdr97001Friday(boolean pdr97001Friday) {
		this.pdr97001Friday = pdr97001Friday;
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

	public Notes getPdr97530Thu() {
		return pdr97530Thu;
	}

	public void setPdr97530Thu(Notes pdr97530Thu) {
		this.pdr97530Thu = pdr97530Thu;
	}

	public Notes getPdr97116Thu() {
		return pdr97116Thu;
	}

	public void setPdr97116Thu(Notes pdr97116Thu) {
		this.pdr97116Thu = pdr97116Thu;
	}

	public Notes getPdr97112Thu() {
		return pdr97112Thu;
	}

	public void setPdr97112Thu(Notes pdr97112Thu) {
		this.pdr97112Thu = pdr97112Thu;
	}

	public Notes getPdr97110Thursday() {
		return pdr97110Thursday;
	}

	public void setPdr97110Thursday(Notes pdr97110Thursday) {
		this.pdr97110Thursday = pdr97110Thursday;
	}

	public boolean isPdr97001Thursday() {
		return pdr97001Thursday;
	}

	public void setPdr97001Thursday(boolean pdr97001Thursday) {
		this.pdr97001Thursday = pdr97001Thursday;
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

	public Notes getPdr97530Wed() {
		return pdr97530Wed;
	}

	public void setPdr97530Wed(Notes pdr97530Wed) {
		this.pdr97530Wed = pdr97530Wed;
	}

	public Notes getPdr97116Wed() {
		return pdr97116Wed;
	}

	public void setPdr97116Wed(Notes pdr97116Wed) {
		this.pdr97116Wed = pdr97116Wed;
	}

	public Notes getPdr97112Wed() {
		return pdr97112Wed;
	}

	public void setPdr97112Wed(Notes pdr97112Wed) {
		this.pdr97112Wed = pdr97112Wed;
	}

	public Notes getPdr97110Wednesday() {
		return pdr97110Wednesday;
	}

	public void setPdr97110Wednesday(Notes pdr97110Wednesday) {
		this.pdr97110Wednesday = pdr97110Wednesday;
	}

	public boolean isPdr97001Wednesday() {
		return pdr97001Wednesday;
	}

	public void setPdr97001Wednesday(boolean pdr97001Wednesday) {
		this.pdr97001Wednesday = pdr97001Wednesday;
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

	public Notes getPdr97530Tue() {
		return pdr97530Tue;
	}

	public void setPdr97530Tue(Notes pdr97530Tue) {
		this.pdr97530Tue = pdr97530Tue;
	}

	public Notes getPdr97116Tue() {
		return pdr97116Tue;
	}

	public void setPdr97116Tue(Notes pdr97116Tue) {
		this.pdr97116Tue = pdr97116Tue;
	}

	public Notes getPdr97112Tue() {
		return pdr97112Tue;
	}

	public void setPdr97112Tue(Notes pdr97112Tue) {
		this.pdr97112Tue = pdr97112Tue;
	}

	public Notes getPdr97110Tuesday() {
		return pdr97110Tuesday;
	}

	public void setPdr97110Tuesday(Notes pdr97110Tuesday) {
		this.pdr97110Tuesday = pdr97110Tuesday;
	}

	public boolean isPdr97001Tuesday() {
		return pdr97001Tuesday;
	}

	public void setPdr97001Tuesday(boolean pdr97001Tuesday) {
		this.pdr97001Tuesday = pdr97001Tuesday;
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

	public Notes getPdr97530Mon() {
		return pdr97530Mon;
	}

	public void setPdr97530Mon(Notes pdr97530Mon) {
		this.pdr97530Mon = pdr97530Mon;
	}

	public Notes getPdr97116Mon() {
		return pdr97116Mon;
	}

	public void setPdr97116Mon(Notes pdr97116Mon) {
		this.pdr97116Mon = pdr97116Mon;
	}

	public Notes getPdr97112Mon() {
		return pdr97112Mon;
	}

	public void setPdr97112Mon(Notes pdr97112Mon) {
		this.pdr97112Mon = pdr97112Mon;
	}

	public Notes getPdr97110Monday() {
		return pdr97110Monday;
	}

	public void setPdr97110Monday(Notes pdr97110Monday) {
		this.pdr97110Monday = pdr97110Monday;
	}

	public boolean isPdr97001Monday() {
		return pdr97001Monday;
	}

	public void setPdr97001Monday(boolean pdr97001Monday) {
		this.pdr97001Monday = pdr97001Monday;
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

	public Notes getPdr97530Sun() {
		return pdr97530Sun;
	}

	public void setPdr97530Sun(Notes pdr97530Sun) {
		this.pdr97530Sun = pdr97530Sun;
	}

	public Notes getPdr97116Sun() {
		return pdr97116Sun;
	}

	public void setPdr97116Sun(Notes pdr97116Sun) {
		this.pdr97116Sun = pdr97116Sun;
	}

	public Notes getPdr97112Sun() {
		return pdr97112Sun;
	}

	public void setPdr97112Sun(Notes pdr97112Sun) {
		this.pdr97112Sun = pdr97112Sun;
	}

	public Notes getPdr97110Sunday() {
		return pdr97110Sunday;
	}

	public void setPdr97110Sunday(Notes pdr97110Sunday) {
		this.pdr97110Sunday = pdr97110Sunday;
	}

	public boolean isPdr97001Sunday() {
		return pdr97001Sunday;
	}

	public void setPdr97001Sunday(boolean pdr97001Sunday) {
		this.pdr97001Sunday = pdr97001Sunday;
	}

}
