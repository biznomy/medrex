package medrex.commons.vo.monthlySummary;

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

@Entity
@Table(name = "MonthlySummaryPage4")
public class MonthlySummaryPage4 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 546271454285774298L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "residentId")
	private int residentId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "formId")
	private MonthlySummaryRecord formId;

	@Column(name = "pleasure117")
	private String pleasure117;

	@Column(name = "pleasure311")
	private String pleasure311;

	@Column(name = "pleasure73")
	private String pleasure73;

	@Column(name = "tPN117")
	private String tPN117;

	@Column(name = "tPN311")
	private String tPN311;

	@Column(name = "tPN73")
	private String tPN73;

	@Column(name = "gT117")
	private String gT117;

	@Column(name = "gT311")
	private String gT311;

	@Column(name = "gT73")
	private String gT73;

	@Column(name = "snack117")
	private String snack117;

	@Column(name = "snack311")
	private String snack311;

	@Column(name = "snack73")
	private String snack73;

	@Column(name = "total117")
	private String total117;

	@Column(name = "total311")
	private String total311;

	@Column(name = "total73")
	private String total73;

	@Column(name = "limited117")
	private String limited117;

	@Column(name = "limited311")
	private String limited311;

	@Column(name = "limited73")
	private String limited73;

	@Column(name = "independent117")
	private String independent117;

	@Column(name = "independent311")
	private String independent311;

	@Column(name = "independent73")
	private String independent73;

	@Column(name = "toiletingTotal117")
	private boolean toiletingTotal117;

	@Column(name = "transferTotal117")
	private boolean transferTotal117;

	@Column(name = "bedTotal117")
	private boolean bedTotal117;

	@Column(name = "toiletingExtensive2117")
	private boolean toiletingExtensive2117;

	@Column(name = "transferExtensive2117")
	private boolean transferExtensive2117;

	@Column(name = "bedExtensive2117")
	private boolean bedExtensive2117;

	@Column(name = "toiletingExtensive1117")
	private boolean toiletingExtensive1117;

	@Column(name = "transferExtensive1117")
	private boolean transferExtensive1117;

	@Column(name = "bedExtensive117")
	private boolean bedExtensive117;

	@Column(name = "toiletingLimited117")
	private boolean toiletingLimited117;

	@Column(name = "transferLimited117")
	private boolean transferLimited117;

	@Column(name = "bedLimited117")
	private boolean bedLimited117;

	@Column(name = "toiletingIndependent117")
	private boolean toiletingIndependent117;

	@Column(name = "transferIndependent117")
	private boolean transferIndependent117;

	@Column(name = "bedIndependent117")
	private boolean bedIndependent117;

	@Column(name = "toiletingTotal311")
	private boolean toiletingTotal311;

	@Column(name = "transferTotal311")
	private boolean transferTotal311;

	@Column(name = "bedTotal311")
	private boolean bedTotal311;

	@Column(name = "toiletingExtensive2311")
	private boolean toiletingExtensive2311;

	@Column(name = "transferExtensive2311")
	private boolean transferExtensive2311;

	@Column(name = "bedExtensive2311")
	private boolean bedExtensive2311;

	@Column(name = "toiletingExtensive1311")
	private boolean toiletingExtensive1311;

	@Column(name = "transferExtensive1311")
	private boolean transferExtensive1311;

	@Column(name = "bedExtensive1311")
	private boolean bedExtensive1311;

	@Column(name = "toiletingLimited311")
	private boolean toiletingLimited311;

	@Column(name = "transferLimited311")
	private boolean transferLimited311;

	@Column(name = "bedLimited311")
	private boolean bedLimited311;

	@Column(name = "toiletingIndependent311")
	private boolean toiletingIndependent311;

	@Column(name = "transferIndependent311")
	private boolean transferIndependent311;

	@Column(name = "bedIndependent311")
	private boolean bedIndependent311;

	@Column(name = "toiletingTotal73")
	private boolean toiletingTotal73;

	@Column(name = "transferTotal73")
	private boolean transferTotal73;

	@Column(name = "bedTotal73")
	private boolean bedTotal73;

	@Column(name = "toiletingExtensive273")
	private boolean toiletingExtensive273;

	@Column(name = "transferExtensive273")
	private boolean transferExtensive273;

	@Column(name = "bedExtensive273")
	private boolean bedExtensive273;

	@Column(name = "toiletingExtensive173")
	private boolean toiletingExtensive173;

	@Column(name = "transferExtensive173")
	private boolean transferExtensive173;

	@Column(name = "bedExtensive173")
	private boolean bedExtensive173;

	@Column(name = "toiletingLimited73")
	private boolean toiletingLimited73;

	@Column(name = "transferLimited73")
	private boolean transferLimited73;

	@Column(name = "bedLimited73")
	private boolean bedLimited73;

	@Column(name = "toiletingIndependent73")
	private boolean toiletingIndependent73;

	@Column(name = "transferIndependent73")
	private boolean transferIndependent73;

	@Column(name = "bedIndependent73")
	private boolean bedIndependent73;

	@Column(name = "areaOtherIntervention")
	private String areaOtherIntervention;

	@Column(name = "otherSkilled5117")
	private String otherSkilled5117;

	@Column(name = "otherSkilled5311")
	private String otherSkilled5311;

	@Column(name = "otherSkilled573")
	private String otherSkilled573;

	@Column(name = "otherSkilled4117")
	private String otherSkilled4117;

	@Column(name = "otherSkilled4311")
	private String otherSkilled4311;

	@Column(name = "otherSkilled473")
	private String otherSkilled473;

	@Column(name = "otherSkilled3117")
	private String otherSkilled3117;

	@Column(name = "otherSkilled3311")
	private String otherSkilled3311;

	@Column(name = "otherSkilled373")
	private String otherSkilled373;

	@Column(name = "otherSkilled2117")
	private String otherSkilled2117;

	@Column(name = "otherSkilled2311")
	private String otherSkilled2311;

	@Column(name = "otherSkilled273")
	private String otherSkilled273;

	@Column(name = "otherSkilled1117")
	private String otherSkilled1117;

	@Column(name = "otherSkilled1311")
	private String otherSkilled1311;

	@Column(name = "otherSkilled173")
	private String otherSkilled173;

	@Column(name = "otherSkilled5")
	private String otherSkilled5;

	@Column(name = "otherSkilled4")
	private String otherSkilled4;

	@Column(name = "otherSkilled3")
	private String otherSkilled3;

	@Column(name = "otherSkilled2")
	private String otherSkilled2;

	@Column(name = "otherSkilled1")
	private String otherSkilled1;

	@Column(name = "areaSkinIntervention")
	private String areaSkinIntervention;

	@Column(name = "wound117")
	private String wound117;

	@Column(name = "wound311")
	private String wound311;

	@Column(name = "wound73")
	private String wound73;

	@Column(name = "newSkin117")
	private String newSkin117;

	@Column(name = "newSkin311")
	private String newSkin311;

	@Column(name = "newSkin73")
	private String newSkin73;

	@Column(name = "sutures117")
	private String sutures117;

	@Column(name = "sutures311")
	private String sutures311;

	@Column(name = "sutures73")
	private String sutures73;

	@Column(name = "skinIntact117")
	private String skinIntact117;

	@Column(name = "skinIntact311")
	private String skinIntact311;

	@Column(name = "skinIntact73")
	private String skinIntact73;

	@Column(name = "areaRespirationIntervention")
	private String areaRespirationIntervention;

	@Column(name = "trachCare117")
	private String trachCare117;

	@Column(name = "trachCare311")
	private String trachCare311;

	@Column(name = "trachCare73")
	private String trachCare73;

	@Column(name = "suctioned117")
	private String suctioned117;

	@Column(name = "suctioned311")
	private String suctioned311;

	@Column(name = "suctioned73")
	private String suctioned73;

	@Column(name = "angina117")
	private String angina117;

	@Column(name = "angina311")
	private String angina311;

	@Column(name = "angina73")
	private String angina73;

	@Column(name = "heart117")
	private String heart117;

	@Column(name = "heart311")
	private String heart311;

	@Column(name = "heart73")
	private String heart73;

	@Column(name = "crackles117")
	private String crackles117;

	@Column(name = "crackles311")
	private String crackles311;

	@Column(name = "crackles73")
	private String crackles73;

	@Column(name = "lungs117")
	private String lungs117;

	@Column(name = "lungs311")
	private String lungs311;

	@Column(name = "lungs73")
	private String lungs73;

	@Column(name = "breath117")
	private String breath117;

	@Column(name = "breath311")
	private String breath311;

	@Column(name = "breath73")
	private String breath73;

	@Column(name = "areaVitalIntervention")
	private String areaVitalIntervention;

	@Column(name = "o2117")
	private String o2117;

	@Column(name = "o2311")
	private String o2311;

	@Column(name = "o273")
	private String o273;

	@Column(name = "temp117")
	private String temp117;

	@Column(name = "temp311")
	private String temp311;

	@Column(name = "temp73")
	private String temp73;

	@Column(name = "respirations117")
	private String respirations117;

	@Column(name = "respirations311")
	private String respirations311;

	@Column(name = "respirations73")
	private String respirations73;

	@Column(name = "pulse117")
	private String pulse117;

	@Column(name = "pulse311")
	private String pulse311;

	@Column(name = "pulse73")
	private String pulse73;

	@Column(name = "bP117")
	private String bP117;

	@Column(name = "bP311")
	private String bP311;

	@Column(name = "bP73")
	private String bP73;

	@Column(name = "room")
	private String room;

	@Column(name = "residentName")
	private String residentName;

	@Column(name = "date")
	private Date date;

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

	public MonthlySummaryRecord getFormId() {
		return formId;
	}

	public void setFormId(MonthlySummaryRecord formId) {
		this.formId = formId;
	}

	public String getPleasure117() {
		return pleasure117;
	}

	public void setPleasure117(String pleasure117) {
		this.pleasure117 = pleasure117;
	}

	public String getPleasure311() {
		return pleasure311;
	}

	public void setPleasure311(String pleasure311) {
		this.pleasure311 = pleasure311;
	}

	public String getPleasure73() {
		return pleasure73;
	}

	public void setPleasure73(String pleasure73) {
		this.pleasure73 = pleasure73;
	}

	public String getTPN117() {
		return tPN117;
	}

	public void setTPN117(String tpn117) {
		tPN117 = tpn117;
	}

	public String getTPN311() {
		return tPN311;
	}

	public void setTPN311(String tpn311) {
		tPN311 = tpn311;
	}

	public String getTPN73() {
		return tPN73;
	}

	public void setTPN73(String tpn73) {
		tPN73 = tpn73;
	}

	public String getGT117() {
		return gT117;
	}

	public void setGT117(String gt117) {
		gT117 = gt117;
	}

	public String getGT311() {
		return gT311;
	}

	public void setGT311(String gt311) {
		gT311 = gt311;
	}

	public String getGT73() {
		return gT73;
	}

	public void setGT73(String gt73) {
		gT73 = gt73;
	}

	public String getSnack117() {
		return snack117;
	}

	public void setSnack117(String snack117) {
		this.snack117 = snack117;
	}

	public String getSnack311() {
		return snack311;
	}

	public void setSnack311(String snack311) {
		this.snack311 = snack311;
	}

	public String getSnack73() {
		return snack73;
	}

	public void setSnack73(String snack73) {
		this.snack73 = snack73;
	}

	public String getTotal117() {
		return total117;
	}

	public void setTotal117(String total117) {
		this.total117 = total117;
	}

	public String getTotal311() {
		return total311;
	}

	public void setTotal311(String total311) {
		this.total311 = total311;
	}

	public String getTotal73() {
		return total73;
	}

	public void setTotal73(String total73) {
		this.total73 = total73;
	}

	public String getLimited117() {
		return limited117;
	}

	public void setLimited117(String limited117) {
		this.limited117 = limited117;
	}

	public String getLimited311() {
		return limited311;
	}

	public void setLimited311(String limited311) {
		this.limited311 = limited311;
	}

	public String getLimited73() {
		return limited73;
	}

	public void setLimited73(String limited73) {
		this.limited73 = limited73;
	}

	public String getIndependent117() {
		return independent117;
	}

	public void setIndependent117(String independent117) {
		this.independent117 = independent117;
	}

	public String getIndependent311() {
		return independent311;
	}

	public void setIndependent311(String independent311) {
		this.independent311 = independent311;
	}

	public String getIndependent73() {
		return independent73;
	}

	public void setIndependent73(String independent73) {
		this.independent73 = independent73;
	}

	public boolean isToiletingTotal117() {
		return toiletingTotal117;
	}

	public void setToiletingTotal117(boolean toiletingTotal117) {
		this.toiletingTotal117 = toiletingTotal117;
	}

	public boolean isTransferTotal117() {
		return transferTotal117;
	}

	public void setTransferTotal117(boolean transferTotal117) {
		this.transferTotal117 = transferTotal117;
	}

	public boolean isBedTotal117() {
		return bedTotal117;
	}

	public void setBedTotal117(boolean bedTotal117) {
		this.bedTotal117 = bedTotal117;
	}

	public boolean isToiletingExtensive2117() {
		return toiletingExtensive2117;
	}

	public void setToiletingExtensive2117(boolean toiletingExtensive2117) {
		this.toiletingExtensive2117 = toiletingExtensive2117;
	}

	public boolean isTransferExtensive2117() {
		return transferExtensive2117;
	}

	public void setTransferExtensive2117(boolean transferExtensive2117) {
		this.transferExtensive2117 = transferExtensive2117;
	}

	public boolean isBedExtensive2117() {
		return bedExtensive2117;
	}

	public void setBedExtensive2117(boolean bedExtensive2117) {
		this.bedExtensive2117 = bedExtensive2117;
	}

	public boolean isToiletingExtensive1117() {
		return toiletingExtensive1117;
	}

	public void setToiletingExtensive1117(boolean toiletingExtensive1117) {
		this.toiletingExtensive1117 = toiletingExtensive1117;
	}

	public boolean isTransferExtensive1117() {
		return transferExtensive1117;
	}

	public void setTransferExtensive1117(boolean transferExtensive1117) {
		this.transferExtensive1117 = transferExtensive1117;
	}

	public boolean isBedExtensive117() {
		return bedExtensive117;
	}

	public void setBedExtensive117(boolean bedExtensive117) {
		this.bedExtensive117 = bedExtensive117;
	}

	public boolean isToiletingLimited117() {
		return toiletingLimited117;
	}

	public void setToiletingLimited117(boolean toiletingLimited117) {
		this.toiletingLimited117 = toiletingLimited117;
	}

	public boolean isTransferLimited117() {
		return transferLimited117;
	}

	public void setTransferLimited117(boolean transferLimited117) {
		this.transferLimited117 = transferLimited117;
	}

	public boolean isBedLimited117() {
		return bedLimited117;
	}

	public void setBedLimited117(boolean bedLimited117) {
		this.bedLimited117 = bedLimited117;
	}

	public boolean isToiletingIndependent117() {
		return toiletingIndependent117;
	}

	public void setToiletingIndependent117(boolean toiletingIndependent117) {
		this.toiletingIndependent117 = toiletingIndependent117;
	}

	public boolean isTransferIndependent117() {
		return transferIndependent117;
	}

	public void setTransferIndependent117(boolean transferIndependent117) {
		this.transferIndependent117 = transferIndependent117;
	}

	public boolean isBedIndependent117() {
		return bedIndependent117;
	}

	public void setBedIndependent117(boolean bedIndependent117) {
		this.bedIndependent117 = bedIndependent117;
	}

	public boolean isToiletingTotal311() {
		return toiletingTotal311;
	}

	public void setToiletingTotal311(boolean toiletingTotal311) {
		this.toiletingTotal311 = toiletingTotal311;
	}

	public boolean isTransferTotal311() {
		return transferTotal311;
	}

	public void setTransferTotal311(boolean transferTotal311) {
		this.transferTotal311 = transferTotal311;
	}

	public boolean isBedTotal311() {
		return bedTotal311;
	}

	public void setBedTotal311(boolean bedTotal311) {
		this.bedTotal311 = bedTotal311;
	}

	public boolean isToiletingExtensive2311() {
		return toiletingExtensive2311;
	}

	public void setToiletingExtensive2311(boolean toiletingExtensive2311) {
		this.toiletingExtensive2311 = toiletingExtensive2311;
	}

	public boolean isTransferExtensive2311() {
		return transferExtensive2311;
	}

	public void setTransferExtensive2311(boolean transferExtensive2311) {
		this.transferExtensive2311 = transferExtensive2311;
	}

	public boolean isBedExtensive2311() {
		return bedExtensive2311;
	}

	public void setBedExtensive2311(boolean bedExtensive2311) {
		this.bedExtensive2311 = bedExtensive2311;
	}

	public boolean isToiletingExtensive1311() {
		return toiletingExtensive1311;
	}

	public void setToiletingExtensive1311(boolean toiletingExtensive1311) {
		this.toiletingExtensive1311 = toiletingExtensive1311;
	}

	public boolean isTransferExtensive1311() {
		return transferExtensive1311;
	}

	public void setTransferExtensive1311(boolean transferExtensive1311) {
		this.transferExtensive1311 = transferExtensive1311;
	}

	public boolean isBedExtensive1311() {
		return bedExtensive1311;
	}

	public void setBedExtensive1311(boolean bedExtensive1311) {
		this.bedExtensive1311 = bedExtensive1311;
	}

	public boolean isToiletingLimited311() {
		return toiletingLimited311;
	}

	public void setToiletingLimited311(boolean toiletingLimited311) {
		this.toiletingLimited311 = toiletingLimited311;
	}

	public boolean isTransferLimited311() {
		return transferLimited311;
	}

	public void setTransferLimited311(boolean transferLimited311) {
		this.transferLimited311 = transferLimited311;
	}

	public boolean isBedLimited311() {
		return bedLimited311;
	}

	public void setBedLimited311(boolean bedLimited311) {
		this.bedLimited311 = bedLimited311;
	}

	public boolean isToiletingIndependent311() {
		return toiletingIndependent311;
	}

	public void setToiletingIndependent311(boolean toiletingIndependent311) {
		this.toiletingIndependent311 = toiletingIndependent311;
	}

	public boolean isTransferIndependent311() {
		return transferIndependent311;
	}

	public void setTransferIndependent311(boolean transferIndependent311) {
		this.transferIndependent311 = transferIndependent311;
	}

	public boolean isBedIndependent311() {
		return bedIndependent311;
	}

	public void setBedIndependent311(boolean bedIndependent311) {
		this.bedIndependent311 = bedIndependent311;
	}

	public boolean isToiletingTotal73() {
		return toiletingTotal73;
	}

	public void setToiletingTotal73(boolean toiletingTotal73) {
		this.toiletingTotal73 = toiletingTotal73;
	}

	public boolean isTransferTotal73() {
		return transferTotal73;
	}

	public void setTransferTotal73(boolean transferTotal73) {
		this.transferTotal73 = transferTotal73;
	}

	public boolean isBedTotal73() {
		return bedTotal73;
	}

	public void setBedTotal73(boolean bedTotal73) {
		this.bedTotal73 = bedTotal73;
	}

	public boolean isToiletingExtensive273() {
		return toiletingExtensive273;
	}

	public void setToiletingExtensive273(boolean toiletingExtensive273) {
		this.toiletingExtensive273 = toiletingExtensive273;
	}

	public boolean isTransferExtensive273() {
		return transferExtensive273;
	}

	public void setTransferExtensive273(boolean transferExtensive273) {
		this.transferExtensive273 = transferExtensive273;
	}

	public boolean isBedExtensive273() {
		return bedExtensive273;
	}

	public void setBedExtensive273(boolean bedExtensive273) {
		this.bedExtensive273 = bedExtensive273;
	}

	public boolean isToiletingExtensive173() {
		return toiletingExtensive173;
	}

	public void setToiletingExtensive173(boolean toiletingExtensive173) {
		this.toiletingExtensive173 = toiletingExtensive173;
	}

	public boolean isTransferExtensive173() {
		return transferExtensive173;
	}

	public void setTransferExtensive173(boolean transferExtensive173) {
		this.transferExtensive173 = transferExtensive173;
	}

	public boolean isBedExtensive173() {
		return bedExtensive173;
	}

	public void setBedExtensive173(boolean bedExtensive173) {
		this.bedExtensive173 = bedExtensive173;
	}

	public boolean isToiletingLimited73() {
		return toiletingLimited73;
	}

	public void setToiletingLimited73(boolean toiletingLimited73) {
		this.toiletingLimited73 = toiletingLimited73;
	}

	public boolean isTransferLimited73() {
		return transferLimited73;
	}

	public void setTransferLimited73(boolean transferLimited73) {
		this.transferLimited73 = transferLimited73;
	}

	public boolean isBedLimited73() {
		return bedLimited73;
	}

	public void setBedLimited73(boolean bedLimited73) {
		this.bedLimited73 = bedLimited73;
	}

	public boolean isToiletingIndependent73() {
		return toiletingIndependent73;
	}

	public void setToiletingIndependent73(boolean toiletingIndependent73) {
		this.toiletingIndependent73 = toiletingIndependent73;
	}

	public boolean isTransferIndependent73() {
		return transferIndependent73;
	}

	public void setTransferIndependent73(boolean transferIndependent73) {
		this.transferIndependent73 = transferIndependent73;
	}

	public boolean isBedIndependent73() {
		return bedIndependent73;
	}

	public void setBedIndependent73(boolean bedIndependent73) {
		this.bedIndependent73 = bedIndependent73;
	}

	public String getAreaOtherIntervention() {
		return areaOtherIntervention;
	}

	public void setAreaOtherIntervention(String areaOtherIntervention) {
		this.areaOtherIntervention = areaOtherIntervention;
	}

	public String getOtherSkilled5117() {
		return otherSkilled5117;
	}

	public void setOtherSkilled5117(String otherSkilled5117) {
		this.otherSkilled5117 = otherSkilled5117;
	}

	public String getOtherSkilled5311() {
		return otherSkilled5311;
	}

	public void setOtherSkilled5311(String otherSkilled5311) {
		this.otherSkilled5311 = otherSkilled5311;
	}

	public String getOtherSkilled573() {
		return otherSkilled573;
	}

	public void setOtherSkilled573(String otherSkilled573) {
		this.otherSkilled573 = otherSkilled573;
	}

	public String getOtherSkilled4117() {
		return otherSkilled4117;
	}

	public void setOtherSkilled4117(String otherSkilled4117) {
		this.otherSkilled4117 = otherSkilled4117;
	}

	public String getOtherSkilled4311() {
		return otherSkilled4311;
	}

	public void setOtherSkilled4311(String otherSkilled4311) {
		this.otherSkilled4311 = otherSkilled4311;
	}

	public String getOtherSkilled473() {
		return otherSkilled473;
	}

	public void setOtherSkilled473(String otherSkilled473) {
		this.otherSkilled473 = otherSkilled473;
	}

	public String getOtherSkilled3117() {
		return otherSkilled3117;
	}

	public void setOtherSkilled3117(String otherSkilled3117) {
		this.otherSkilled3117 = otherSkilled3117;
	}

	public String getOtherSkilled3311() {
		return otherSkilled3311;
	}

	public void setOtherSkilled3311(String otherSkilled3311) {
		this.otherSkilled3311 = otherSkilled3311;
	}

	public String getOtherSkilled373() {
		return otherSkilled373;
	}

	public void setOtherSkilled373(String otherSkilled373) {
		this.otherSkilled373 = otherSkilled373;
	}

	public String getOtherSkilled2117() {
		return otherSkilled2117;
	}

	public void setOtherSkilled2117(String otherSkilled2117) {
		this.otherSkilled2117 = otherSkilled2117;
	}

	public String getOtherSkilled2311() {
		return otherSkilled2311;
	}

	public void setOtherSkilled2311(String otherSkilled2311) {
		this.otherSkilled2311 = otherSkilled2311;
	}

	public String getOtherSkilled273() {
		return otherSkilled273;
	}

	public void setOtherSkilled273(String otherSkilled273) {
		this.otherSkilled273 = otherSkilled273;
	}

	public String getOtherSkilled1117() {
		return otherSkilled1117;
	}

	public void setOtherSkilled1117(String otherSkilled1117) {
		this.otherSkilled1117 = otherSkilled1117;
	}

	public String getOtherSkilled1311() {
		return otherSkilled1311;
	}

	public void setOtherSkilled1311(String otherSkilled1311) {
		this.otherSkilled1311 = otherSkilled1311;
	}

	public String getOtherSkilled173() {
		return otherSkilled173;
	}

	public void setOtherSkilled173(String otherSkilled173) {
		this.otherSkilled173 = otherSkilled173;
	}

	public String getOtherSkilled5() {
		return otherSkilled5;
	}

	public void setOtherSkilled5(String otherSkilled5) {
		this.otherSkilled5 = otherSkilled5;
	}

	public String getOtherSkilled4() {
		return otherSkilled4;
	}

	public void setOtherSkilled4(String otherSkilled4) {
		this.otherSkilled4 = otherSkilled4;
	}

	public String getOtherSkilled3() {
		return otherSkilled3;
	}

	public void setOtherSkilled3(String otherSkilled3) {
		this.otherSkilled3 = otherSkilled3;
	}

	public String getOtherSkilled2() {
		return otherSkilled2;
	}

	public void setOtherSkilled2(String otherSkilled2) {
		this.otherSkilled2 = otherSkilled2;
	}

	public String getOtherSkilled1() {
		return otherSkilled1;
	}

	public void setOtherSkilled1(String otherSkilled1) {
		this.otherSkilled1 = otherSkilled1;
	}

	public String getAreaSkinIntervention() {
		return areaSkinIntervention;
	}

	public void setAreaSkinIntervention(String areaSkinIntervention) {
		this.areaSkinIntervention = areaSkinIntervention;
	}

	public String getWound117() {
		return wound117;
	}

	public void setWound117(String wound117) {
		this.wound117 = wound117;
	}

	public String getWound311() {
		return wound311;
	}

	public void setWound311(String wound311) {
		this.wound311 = wound311;
	}

	public String getWound73() {
		return wound73;
	}

	public void setWound73(String wound73) {
		this.wound73 = wound73;
	}

	public String getNewSkin117() {
		return newSkin117;
	}

	public void setNewSkin117(String newSkin117) {
		this.newSkin117 = newSkin117;
	}

	public String getNewSkin311() {
		return newSkin311;
	}

	public void setNewSkin311(String newSkin311) {
		this.newSkin311 = newSkin311;
	}

	public String getNewSkin73() {
		return newSkin73;
	}

	public void setNewSkin73(String newSkin73) {
		this.newSkin73 = newSkin73;
	}

	public String getSutures117() {
		return sutures117;
	}

	public void setSutures117(String sutures117) {
		this.sutures117 = sutures117;
	}

	public String getSutures311() {
		return sutures311;
	}

	public void setSutures311(String sutures311) {
		this.sutures311 = sutures311;
	}

	public String getSutures73() {
		return sutures73;
	}

	public void setSutures73(String sutures73) {
		this.sutures73 = sutures73;
	}

	public String getSkinIntact117() {
		return skinIntact117;
	}

	public void setSkinIntact117(String skinIntact117) {
		this.skinIntact117 = skinIntact117;
	}

	public String getSkinIntact311() {
		return skinIntact311;
	}

	public void setSkinIntact311(String skinIntact311) {
		this.skinIntact311 = skinIntact311;
	}

	public String getSkinIntact73() {
		return skinIntact73;
	}

	public void setSkinIntact73(String skinIntact73) {
		this.skinIntact73 = skinIntact73;
	}

	public String getAreaRespirationIntervention() {
		return areaRespirationIntervention;
	}

	public void setAreaRespirationIntervention(
			String areaRespirationIntervention) {
		this.areaRespirationIntervention = areaRespirationIntervention;
	}

	public String getTrachCare117() {
		return trachCare117;
	}

	public void setTrachCare117(String trachCare117) {
		this.trachCare117 = trachCare117;
	}

	public String getTrachCare311() {
		return trachCare311;
	}

	public void setTrachCare311(String trachCare311) {
		this.trachCare311 = trachCare311;
	}

	public String getTrachCare73() {
		return trachCare73;
	}

	public void setTrachCare73(String trachCare73) {
		this.trachCare73 = trachCare73;
	}

	public String getSuctioned117() {
		return suctioned117;
	}

	public void setSuctioned117(String suctioned117) {
		this.suctioned117 = suctioned117;
	}

	public String getSuctioned311() {
		return suctioned311;
	}

	public void setSuctioned311(String suctioned311) {
		this.suctioned311 = suctioned311;
	}

	public String getSuctioned73() {
		return suctioned73;
	}

	public void setSuctioned73(String suctioned73) {
		this.suctioned73 = suctioned73;
	}

	public String getAngina117() {
		return angina117;
	}

	public void setAngina117(String angina117) {
		this.angina117 = angina117;
	}

	public String getAngina311() {
		return angina311;
	}

	public void setAngina311(String angina311) {
		this.angina311 = angina311;
	}

	public String getAngina73() {
		return angina73;
	}

	public void setAngina73(String angina73) {
		this.angina73 = angina73;
	}

	public String getHeart117() {
		return heart117;
	}

	public void setHeart117(String heart117) {
		this.heart117 = heart117;
	}

	public String getHeart311() {
		return heart311;
	}

	public void setHeart311(String heart311) {
		this.heart311 = heart311;
	}

	public String getHeart73() {
		return heart73;
	}

	public void setHeart73(String heart73) {
		this.heart73 = heart73;
	}

	public String getCrackles117() {
		return crackles117;
	}

	public void setCrackles117(String crackles117) {
		this.crackles117 = crackles117;
	}

	public String getCrackles311() {
		return crackles311;
	}

	public void setCrackles311(String crackles311) {
		this.crackles311 = crackles311;
	}

	public String getCrackles73() {
		return crackles73;
	}

	public void setCrackles73(String crackles73) {
		this.crackles73 = crackles73;
	}

	public String getLungs117() {
		return lungs117;
	}

	public void setLungs117(String lungs117) {
		this.lungs117 = lungs117;
	}

	public String getLungs311() {
		return lungs311;
	}

	public void setLungs311(String lungs311) {
		this.lungs311 = lungs311;
	}

	public String getLungs73() {
		return lungs73;
	}

	public void setLungs73(String lungs73) {
		this.lungs73 = lungs73;
	}

	public String getBreath117() {
		return breath117;
	}

	public void setBreath117(String breath117) {
		this.breath117 = breath117;
	}

	public String getBreath311() {
		return breath311;
	}

	public void setBreath311(String breath311) {
		this.breath311 = breath311;
	}

	public String getBreath73() {
		return breath73;
	}

	public void setBreath73(String breath73) {
		this.breath73 = breath73;
	}

	public String getAreaVitalIntervention() {
		return areaVitalIntervention;
	}

	public void setAreaVitalIntervention(String areaVitalIntervention) {
		this.areaVitalIntervention = areaVitalIntervention;
	}

	public String getO2117() {
		return o2117;
	}

	public void setO2117(String o2117) {
		this.o2117 = o2117;
	}

	public String getO2311() {
		return o2311;
	}

	public void setO2311(String o2311) {
		this.o2311 = o2311;
	}

	public String getO273() {
		return o273;
	}

	public void setO273(String o273) {
		this.o273 = o273;
	}

	public String getTemp117() {
		return temp117;
	}

	public void setTemp117(String temp117) {
		this.temp117 = temp117;
	}

	public String getTemp311() {
		return temp311;
	}

	public void setTemp311(String temp311) {
		this.temp311 = temp311;
	}

	public String getTemp73() {
		return temp73;
	}

	public void setTemp73(String temp73) {
		this.temp73 = temp73;
	}

	public String getRespirations117() {
		return respirations117;
	}

	public void setRespirations117(String respirations117) {
		this.respirations117 = respirations117;
	}

	public String getRespirations311() {
		return respirations311;
	}

	public void setRespirations311(String respirations311) {
		this.respirations311 = respirations311;
	}

	public String getRespirations73() {
		return respirations73;
	}

	public void setRespirations73(String respirations73) {
		this.respirations73 = respirations73;
	}

	public String getPulse117() {
		return pulse117;
	}

	public void setPulse117(String pulse117) {
		this.pulse117 = pulse117;
	}

	public String getPulse311() {
		return pulse311;
	}

	public void setPulse311(String pulse311) {
		this.pulse311 = pulse311;
	}

	public String getPulse73() {
		return pulse73;
	}

	public void setPulse73(String pulse73) {
		this.pulse73 = pulse73;
	}

	public String getBP117() {
		return bP117;
	}

	public void setBP117(String bp117) {
		bP117 = bp117;
	}

	public String getBP311() {
		return bP311;
	}

	public void setBP311(String bp311) {
		bP311 = bp311;
	}

	public String getBP73() {
		return bP73;
	}

	public void setBP73(String bp73) {
		bP73 = bp73;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
