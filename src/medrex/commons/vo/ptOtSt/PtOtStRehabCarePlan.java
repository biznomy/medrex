package medrex.commons.vo.ptOtSt;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PtOtStRehabCarePlan")
public class PtOtStRehabCarePlan implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1327029567872876211L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "interOther")
	private String interOther;
	@Column(name = "goalsOther")
	private String goalsOther;
	@Column(name = "probOther")
	private String probOther;
	@Column(name = "outField01")
	private String outField01;
	@Column(name = "outcomes01")
	private String outcomes01;
	@Column(name = "interDischarge")
	private boolean interDischarge;
	@Column(name = "interPosturalEdu")
	private boolean interPosturalEdu;
	@Column(name = "interEquipmentNeeds")
	private boolean interEquipmentNeeds;
	@Column(name = "interPatientCaregiver")
	private boolean interPatientCaregiver;
	@Column(name = "interStairs")
	private boolean interStairs;
	@Column(name = "interGait")
	private boolean interGait;
	@Column(name = "interTransfer")
	private boolean interTransfer;
	@Column(name = "interAdl")
	private boolean interAdl;
	@Column(name = "interEndurance")
	private boolean interEndurance;
	@Column(name = "interBalance")
	private boolean interBalance;
	@Column(name = "interTherapeutic")
	private boolean interTherapeutic;
	@Column(name = "targDate01")
	private Date targDate01;
	@Column(name = "goalsSafetyAwarePercent")
	private String goalsSafetyAwarePercent;
	@Column(name = "goalsSafetyAware")
	private boolean goalsSafetyAware;
	@Column(name = "goalsMobStairUsing")
	private String goalsMobStairUsing;
	@Column(name = "goalsMobStairSteps")
	private String goalsMobStairSteps;
	@Column(name = "goalsAmbulateUsing")
	private String goalsAmbulateUsing;
	@Column(name = "goalsAmublateIf")
	private String goalsAmublateIf;
	@Column(name = "goalsAmbulate")
	private boolean goalsAmbulate;
	@Column(name = "goalsMobChair")
	private String goalsMobChair;
	@Column(name = "goalsMobToilet")
	private String goalsMobToilet;
	@Column(name = "goalsMob")
	private boolean goalsMob;
	@Column(name = "goalsAdlField")
	private String goalsAdlField;
	@Column(name = "goalsAdl")
	private boolean goalsAdl;
	@Column(name = "goalsEnduranceTo")
	private String goalsEnduranceTo;
	@Column(name = "goalsEndurance")
	private boolean goalsEndurance;
	@Column(name = "goalsBalanceTo")
	private String goalsBalanceTo;
	@Column(name = "goalsBalance")
	private boolean goalsBalance;
	@Column(name = "goalsRomBy")
	private String goalsRomBy;
	@Column(name = "goalsRomOf")
	private String goalsRomOf;
	@Column(name = "goalsStrengthUeLe")
	private String goalsStrengthUeLe;
	@Column(name = "goalsStrengthOf")
	private String goalsStrengthOf;
	@Column(name = "goalsStrength")
	private boolean goalsStrength;
	@Column(name = "probDecSafetyAware")
	private boolean probDecSafetyAware;
	@Column(name = "probDecMob")
	private boolean probDecMob;
	@Column(name = "probDecAdl")
	private boolean probDecAdl;
	@Column(name = "probDecEndurance")
	private boolean probDecEndurance;
	@Column(name = "probDecBalance")
	private boolean probDecBalance;
	@Column(name = "probDecRom")
	private boolean probDecRom;
	@Column(name = "probDecStrength")
	private boolean probDecStrength;
	@Column(name = "carePlanNo01")
	private String carePlanNo01;
	@Column(name = "carePlanDate01")
	private Date carePlanDate01;

	public String getInterOther() {
		return this.interOther;
	}

	public void setInterOther(String interOther) {
		this.interOther = interOther;
	}

	public String getGoalsOther() {
		return this.goalsOther;
	}

	public void setGoalsOther(String goalsOther) {
		this.goalsOther = goalsOther;
	}

	public String getProbOther() {
		return this.probOther;
	}

	public void setProbOther(String probOther) {
		this.probOther = probOther;
	}

	public String getOutField01() {
		return this.outField01;
	}

	public void setOutField01(String outField01) {
		this.outField01 = outField01;
	}

	public String getOutcomes01() {
		return this.outcomes01;
	}

	public void setOutcomes01(String outcomes01) {
		this.outcomes01 = outcomes01;
	}

	public boolean isInterDischarge() {
		return this.interDischarge;
	}

	public void setInterDischarge(boolean interDischarge) {
		this.interDischarge = interDischarge;
	}

	public boolean isInterPosturalEdu() {
		return this.interPosturalEdu;
	}

	public void setInterPosturalEdu(boolean interPosturalEdu) {
		this.interPosturalEdu = interPosturalEdu;
	}

	public boolean isInterEquipmentNeeds() {
		return this.interEquipmentNeeds;
	}

	public void setInterEquipmentNeeds(boolean interEquipmentNeeds) {
		this.interEquipmentNeeds = interEquipmentNeeds;
	}

	public boolean isInterPatientCaregiver() {
		return this.interPatientCaregiver;
	}

	public void setInterPatientCaregiver(boolean interPatientCaregiver) {
		this.interPatientCaregiver = interPatientCaregiver;
	}

	public boolean isInterStairs() {
		return this.interStairs;
	}

	public void setInterStairs(boolean interStairs) {
		this.interStairs = interStairs;
	}

	public boolean isInterGait() {
		return this.interGait;
	}

	public void setInterGait(boolean interGait) {
		this.interGait = interGait;
	}

	public boolean isInterTransfer() {
		return this.interTransfer;
	}

	public void setInterTransfer(boolean interTransfer) {
		this.interTransfer = interTransfer;
	}

	public boolean isInterAdl() {
		return this.interAdl;
	}

	public void setInterAdl(boolean interAdl) {
		this.interAdl = interAdl;
	}

	public boolean isInterEndurance() {
		return this.interEndurance;
	}

	public void setInterEndurance(boolean interEndurance) {
		this.interEndurance = interEndurance;
	}

	public boolean isInterBalance() {
		return this.interBalance;
	}

	public void setInterBalance(boolean interBalance) {
		this.interBalance = interBalance;
	}

	public boolean isInterTherapeutic() {
		return this.interTherapeutic;
	}

	public void setInterTherapeutic(boolean interTherapeutic) {
		this.interTherapeutic = interTherapeutic;
	}

	public Date getTargDate01() {
		return this.targDate01;
	}

	public void setTargDate01(Date targDate01) {
		this.targDate01 = targDate01;
	}

	public String getGoalsSafetyAwarePercent() {
		return this.goalsSafetyAwarePercent;
	}

	public void setGoalsSafetyAwarePercent(String goalsSafetyAwarePercent) {
		this.goalsSafetyAwarePercent = goalsSafetyAwarePercent;
	}

	public boolean isGoalsSafetyAware() {
		return this.goalsSafetyAware;
	}

	public void setGoalsSafetyAware(boolean goalsSafetyAware) {
		this.goalsSafetyAware = goalsSafetyAware;
	}

	public String getGoalsMobStairUsing() {
		return this.goalsMobStairUsing;
	}

	public void setGoalsMobStairUsing(String goalsMobStairUsing) {
		this.goalsMobStairUsing = goalsMobStairUsing;
	}

	public String getGoalsMobStairSteps() {
		return this.goalsMobStairSteps;
	}

	public void setGoalsMobStairSteps(String goalsMobStairSteps) {
		this.goalsMobStairSteps = goalsMobStairSteps;
	}

	public String getGoalsAmbulateUsing() {
		return this.goalsAmbulateUsing;
	}

	public void setGoalsAmbulateUsing(String goalsAmbulateUsing) {
		this.goalsAmbulateUsing = goalsAmbulateUsing;
	}

	public String getGoalsAmublateIf() {
		return this.goalsAmublateIf;
	}

	public void setGoalsAmublateIf(String goalsAmublateIf) {
		this.goalsAmublateIf = goalsAmublateIf;
	}

	public boolean isGoalsAmbulate() {
		return this.goalsAmbulate;
	}

	public void setGoalsAmbulate(boolean goalsAmbulate) {
		this.goalsAmbulate = goalsAmbulate;
	}

	public String getGoalsMobChair() {
		return this.goalsMobChair;
	}

	public void setGoalsMobChair(String goalsMobChair) {
		this.goalsMobChair = goalsMobChair;
	}

	public String getGoalsMobToilet() {
		return this.goalsMobToilet;
	}

	public void setGoalsMobToilet(String goalsMobToilet) {
		this.goalsMobToilet = goalsMobToilet;
	}

	public boolean isGoalsMob() {
		return this.goalsMob;
	}

	public void setGoalsMob(boolean goalsMob) {
		this.goalsMob = goalsMob;
	}

	public String getGoalsAdlField() {
		return this.goalsAdlField;
	}

	public void setGoalsAdlField(String goalsAdlField) {
		this.goalsAdlField = goalsAdlField;
	}

	public boolean isGoalsAdl() {
		return this.goalsAdl;
	}

	public void setGoalsAdl(boolean goalsAdl) {
		this.goalsAdl = goalsAdl;
	}

	public String getGoalsEnduranceTo() {
		return this.goalsEnduranceTo;
	}

	public void setGoalsEnduranceTo(String goalsEnduranceTo) {
		this.goalsEnduranceTo = goalsEnduranceTo;
	}

	public boolean isGoalsEndurance() {
		return this.goalsEndurance;
	}

	public void setGoalsEndurance(boolean goalsEndurance) {
		this.goalsEndurance = goalsEndurance;
	}

	public String getGoalsBalanceTo() {
		return this.goalsBalanceTo;
	}

	public void setGoalsBalanceTo(String goalsBalanceTo) {
		this.goalsBalanceTo = goalsBalanceTo;
	}

	public boolean isGoalsBalance() {
		return this.goalsBalance;
	}

	public void setGoalsBalance(boolean goalsBalance) {
		this.goalsBalance = goalsBalance;
	}

	public String getGoalsRomBy() {
		return this.goalsRomBy;
	}

	public void setGoalsRomBy(String goalsRomBy) {
		this.goalsRomBy = goalsRomBy;
	}

	public String getGoalsRomOf() {
		return this.goalsRomOf;
	}

	public void setGoalsRomOf(String goalsRomOf) {
		this.goalsRomOf = goalsRomOf;
	}

	public String getGoalsStrengthUeLe() {
		return this.goalsStrengthUeLe;
	}

	public void setGoalsStrengthUeLe(String goalsStrengthUeLe) {
		this.goalsStrengthUeLe = goalsStrengthUeLe;
	}

	public String getGoalsStrengthOf() {
		return this.goalsStrengthOf;
	}

	public void setGoalsStrengthOf(String goalsStrengthOf) {
		this.goalsStrengthOf = goalsStrengthOf;
	}

	public boolean isGoalsStrength() {
		return this.goalsStrength;
	}

	public void setGoalsStrength(boolean goalsStrength) {
		this.goalsStrength = goalsStrength;
	}

	public boolean isProbDecSafetyAware() {
		return this.probDecSafetyAware;
	}

	public void setProbDecSafetyAware(boolean probDecSafetyAware) {
		this.probDecSafetyAware = probDecSafetyAware;
	}

	public boolean isProbDecMob() {
		return this.probDecMob;
	}

	public void setProbDecMob(boolean probDecMob) {
		this.probDecMob = probDecMob;
	}

	public boolean isProbDecAdl() {
		return this.probDecAdl;
	}

	public void setProbDecAdl(boolean probDecAdl) {
		this.probDecAdl = probDecAdl;
	}

	public boolean isProbDecEndurance() {
		return this.probDecEndurance;
	}

	public void setProbDecEndurance(boolean probDecEndurance) {
		this.probDecEndurance = probDecEndurance;
	}

	public boolean isProbDecBalance() {
		return this.probDecBalance;
	}

	public void setProbDecBalance(boolean probDecBalance) {
		this.probDecBalance = probDecBalance;
	}

	public boolean isProbDecRom() {
		return this.probDecRom;
	}

	public void setProbDecRom(boolean probDecRom) {
		this.probDecRom = probDecRom;
	}

	public boolean isProbDecStrength() {
		return this.probDecStrength;
	}

	public void setProbDecStrength(boolean probDecStrength) {
		this.probDecStrength = probDecStrength;
	}

	public String getCarePlanNo01() {
		return this.carePlanNo01;
	}

	public void setCarePlanNo01(String carePlanNo01) {
		this.carePlanNo01 = carePlanNo01;
	}

	public Date getCarePlanDate01() {
		return this.carePlanDate01;
	}

	public void setCarePlanDate01(Date carePlanDate01) {
		this.carePlanDate01 = carePlanDate01;
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

}
