package medrex.commons.vo.ra;

import java.io.Serializable;

import medrex.commons.intf.DataObject;

public class RAFPg1Sec2 implements Serializable, DataObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 844432973408517026L;
	private int communicationSkill;
	private String communicationNotes;
	private boolean useToilet;
	private boolean useBedPan;
	private boolean urinal;
	private boolean bedSideCommode;
	private String languageSpoken;
	private String cityAndState;
	private String languageNotes;

	public int getCommunicationSkill() {
		return communicationSkill;
	}

	public void setCommunicationSkill(int communicationSkill) {
		this.communicationSkill = communicationSkill;
	}

	public String getCommunicationNotes() {
		return communicationNotes;
	}

	public void setCommunicationNotes(String communicationNotes) {
		this.communicationNotes = communicationNotes;
	}

	public boolean isUseToilet() {
		return useToilet;
	}

	public void setUsesToilet(boolean useToilet) {
		this.useToilet = useToilet;
	}

	public boolean isUseBedPan() {
		return useBedPan;
	}

	public void setUsesBedPan(boolean useBedPan) {
		this.useBedPan = useBedPan;
	}

	public boolean isUrinal() {
		return urinal;
	}

	public void setUrinal(boolean urinal) {
		this.urinal = urinal;
	}

	public boolean isBedSideCommode() {
		return bedSideCommode;
	}

	public void setBedSideCommode(boolean bedSideCommode) {
		this.bedSideCommode = bedSideCommode;
	}

	public String getLanguageSpoken() {
		return languageSpoken;
	}

	public void setLanguageSpoken(String languageSpoken) {
		this.languageSpoken = languageSpoken;
	}

	public String getCityAndState() {
		return cityAndState;
	}

	public void setCityAndState(String cityAndState) {
		this.cityAndState = cityAndState;
	}

	public String getLanguageNotes() {
		return languageNotes;
	}

	public void setLanguageNotes(String languageNotes) {
		this.languageNotes = languageNotes;
	}
}
