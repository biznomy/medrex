package medrex.commons.vo.monthlySummary;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "InventoryPersonalEffect")
public class InventoryPersonalEffect implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -362735137550203346L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "residentId")
	private int residentId;

	@Column(name = "formId")
	private int formId;

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	@Column(name = "valuesOthers")
	private String valuesOthers;

	@Column(name = "valuesGlasses")
	private String valuesGlasses;

	@Column(name = "valuesDentures")
	private String valuesDentures;

	@Column(name = "valuesHearingAid")
	private String valuesHearingAid;

	@Column(name = "valuesTravellingBags")
	private String valuesTravellingBags;

	@Column(name = "valuesShavingKit")
	private String valuesShavingKit;

	@Column(name = "valuesSlippers")
	private String valuesSlippers;

	@Column(name = "valuesRobes")
	private String valuesRobes;

	@Column(name = "valuesPajamas")
	private String valuesPajamas;

	@Column(name = "valuesMensHandkerChie")
	private String valuesMensHandkerChie;

	@Column(name = "valuesBeltSuspenders")
	private String valuesBeltSuspenders;

	@Column(name = "valuesTies")
	private String valuesTies;

	@Column(name = "valuesUnderShirts")
	private String valuesUnderShirts;

	@Column(name = "valuesShorts")
	private String valuesShorts;

	@Column(name = "valuesSocks")
	private String valuesSocks;

	@Column(name = "valuesMensGloves")
	private String valuesMensGloves;

	@Column(name = "valuesMensShoes")
	private String valuesMensShoes;

	@Column(name = "valuesMensHats")
	private String valuesMensHats;

	@Column(name = "valuesSportJackets")
	private String valuesSportJackets;

	@Column(name = "valuesSlacks")
	private String valuesSlacks;

	@Column(name = "valuesTopCoats")
	private String valuesTopCoats;

	@Column(name = "valuesMensSuit")
	private String valuesMensSuit;

	@Column(name = "valuesOverNightCase")
	private String valuesOverNightCase;

	@Column(name = "valuesPocketBooks")
	private String valuesPocketBooks;

	@Column(name = "valuesHouseSlippers")
	private String valuesHouseSlippers;

	@Column(name = "valuesHouseCoats")
	private String valuesHouseCoats;

	@Column(name = "valuesNightGowns")
	private String valuesNightGowns;

	@Column(name = "valuesBrassiers")
	private String valuesBrassiers;

	@Column(name = "valuesFoundationGarments")
	private String valuesFoundationGarments;

	@Column(name = "valuesSlips")
	private String valuesSlips;

	@Column(name = "valuesLadiesHandkerChiefs")
	private String valuesLadiesHandkerChiefs;

	@Column(name = "valuesHose")
	private String valuesHose;

	@Column(name = "valuesGloves")
	private String valuesGloves;

	@Column(name = "valuesLadiesSweaters")
	private String valuesLadiesSweaters;

	@Column(name = "valuesBlouses")
	private String valuesBlouses;

	@Column(name = "valueLadiesHats")
	private String valueLadiesHats;

	@Column(name = "valueLadiesShoes")
	private String valueLadiesShoes;

	@Column(name = "valueFirs")
	private String valueFirs;

	@Column(name = "valueCoats")
	private String valueCoats;

	@Column(name = "valueLadiesSuit")
	private String valueLadiesSuit;

	@Column(name = "valueDresses")
	private String valueDresses;

	@Column(name = "descriptionOthers")
	private String descriptionOthers;

	@Column(name = "descriptionGlasses")
	private String descriptionGlasses;

	@Column(name = "descriptionDentures")
	private String descriptionDentures;

	@Column(name = "descriptionHearingAid")
	private String descriptionHearingAid;

	@Column(name = "descriptionTravellingBags")
	private String descriptionTravellingBags;

	@Column(name = "descriptionShavingKit")
	private String descriptionShavingKit;

	@Column(name = "descriptionSlippers")
	private String descriptionSlippers;

	@Column(name = "descriptionRobes")
	private String descriptionRobes;

	@Column(name = "descriptionPajamas")
	private String descriptionPajamas;

	@Column(name = "descriptionMensHandkerChiefs")
	private String descriptionMensHandkerChiefs;

	@Column(name = "descriptionBeltSuspenders")
	private String descriptionBeltSuspenders;

	@Column(name = "descriptionTies")
	private String descriptionTies;

	@Column(name = "descriptionShorts")
	private String descriptionShorts;

	@Column(name = "howRecieved14")
	private String howRecieved14;

	@Column(name = "howRecieved13")
	private String howRecieved13;

	@Column(name = "howRecieved12")
	private String howRecieved12;

	@Column(name = "howRecieved11")
	private String howRecieved11;

	@Column(name = "howRecieved10")
	private String howRecieved10;

	@Column(name = "howRecieved9")
	private String howRecieved9;

	@Column(name = "howRecieved8")
	private String howRecieved8;

	@Column(name = "howRecieved7")
	private String howRecieved7;

	@Column(name = "howRecieved6")
	private String howRecieved6;

	@Column(name = "howRecieved5")
	private String howRecieved5;

	@Column(name = "howRecieved4")
	private String howRecieved4;

	@Column(name = "howRecieved3")
	private String howRecieved3;

	@Column(name = "howRecieved2")
	private String howRecieved2;

	@Column(name = "howRecieved1")
	private String howRecieved1;

	@Column(name = "orginalItem14")
	private String orginalItem14;

	@Column(name = "orginalItem13")
	private String orginalItem13;

	@Column(name = "orginalItem12")
	private String orginalItem12;

	@Column(name = "orginalItem11")
	private String orginalItem11;

	@Column(name = "orginalItem10")
	private String orginalItem10;

	@Column(name = "orginalItem9")
	private String orginalItem9;

	@Column(name = "orginalItem8")
	private String orginalItem8;

	@Column(name = "orginalItem7")
	private String orginalItem7;

	@Column(name = "orginalItem6")
	private String orginalItem6;

	@Column(name = "orginalItem5")
	private String orginalItem5;

	@Column(name = "orginalItem4")
	private String orginalItem4;

	@Column(name = "orginalItem3")
	private String orginalItem3;

	@Column(name = "orginalItem2")
	private String orginalItem2;

	@Column(name = "orginalItem1")
	private String orginalItem1;

	@Column(name = "originalDate14")
	private Date originalDate14;

	@Column(name = "originalDate13")
	private Date originalDate13;

	@Column(name = "originalDate12")
	private Date originalDate12;

	@Column(name = "originalDate11")
	private Date originalDate11;

	@Column(name = "originalDate10")
	private Date originalDate10;

	@Column(name = "originalDate9")
	private Date originalDate9;

	@Column(name = "originalDate8")
	private Date originalDate8;

	@Column(name = "originalDate7")
	private Date originalDate7;

	@Column(name = "originalDate6")
	private Date originalDate6;

	@Column(name = "originalDate5")
	private Date originalDate5;

	@Column(name = "originalDate4")
	private Date originalDate4;

	@Column(name = "originalDate3")
	private Date originalDate3;

	@Column(name = "originalDate2")
	private Date originalDate2;

	@Column(name = "originalDate1")
	private Date originalDate1;

	@Column(name = "descriptionLadiesHandkerChiefs")
	private String descriptionLadiesHandkerChiefs;

	@Column(name = "descriptionHose")
	private String descriptionHose;

	@Column(name = "descriptionGloves")
	private String descriptionGloves;

	@Column(name = "descriptionLadiesSweaters")
	private String descriptionLadiesSweaters;

	@Column(name = "descriptionBlouses")
	private String descriptionBlouses;

	@Column(name = "descriptionLadiesHats")
	private String descriptionLadiesHats;

	@Column(name = "descriptionLadiesShoes")
	private String descriptionLadiesShoes;

	@Column(name = "descriptionFirs")
	private String descriptionFirs;

	@Column(name = "descriptionCoats")
	private String descriptionCoats;

	@Column(name = "descriptionLadiesSuit")
	private String descriptionLadiesSuit;

	@Column(name = "descriptionDresses")
	private String descriptionDresses;

	@Column(name = "dischargeResponsiblePartyDate")
	private Date dischargeResponsiblePartyDate;

	@Column(name = "signResponsiblePartyOnDischarge")
	private String signResponsiblePartyOnDischarge;

	@Column(name = "quantityOthers")
	private String quantityOthers;

	@Column(name = "quantityGlasses")
	private String quantityGlasses;

	@Column(name = "quantityDentures")
	private String quantityDentures;

	@Column(name = "quantityHearingAid")
	private String quantityHearingAid;

	@Column(name = "quantityTravellingBags")
	private String quantityTravellingBags;

	@Column(name = "quantityShavingKit")
	private String quantityShavingKit;

	@Column(name = "quantitySlippers")
	private String quantitySlippers;

	@Column(name = "quantityRobes")
	private String quantityRobes;

	@Column(name = "quantityPajamas")
	private String quantityPajamas;

	@Column(name = "quantityMensHandkerChiefs")
	private String quantityMensHandkerChiefs;

	@Column(name = "quantityBeltsSuspenders")
	private String quantityBeltsSuspenders;

	@Column(name = "quantityTies")
	private String quantityTies;

	@Column(name = "quantityUnderShirts")
	private String quantityUnderShirts;

	@Column(name = "quantityShort")
	private String quantityShort;

	@Column(name = "quantitySocks")
	private String quantitySocks;

	@Column(name = "quantityMensGloves")
	private String quantityMensGloves;

	@Column(name = "quantityMensShoes")
	private String quantityMensShoes;

	@Column(name = "quantityMensHats")
	private String quantityMensHats;

	@Column(name = "quantitySportJackets")
	private String quantitySportJackets;

	@Column(name = "quantitySlacks")
	private String quantitySlacks;

	@Column(name = "quantityTopCoats")
	private String quantityTopCoats;

	@Column(name = "quantityMensSuit")
	private String quantityMensSuit;

	@Column(name = "quantityOvernightCase")
	private String quantityOvernightCase;

	@Column(name = "quantityPocketBooks")
	private String quantityPocketBooks;

	@Column(name = "quantityHouseSlippers")
	private String quantityHouseSlippers;

	@Column(name = "quantityHouseCoats")
	private String quantityHouseCoats;

	@Column(name = "quantityNightGowns")
	private String quantityNightGowns;

	@Column(name = "quantityBrasiers")
	private String quantityBrasiers;

	@Column(name = "quantityFoundationGarments")
	private String quantityFoundationGarments;

	@Column(name = "quantitySlips")
	private String quantitySlips;

	@Column(name = "quantityLadiesHandkerChiefs")
	private String quantityLadiesHandkerChiefs;

	@Column(name = "quantityHose")
	private String quantityHose;

	@Column(name = "quantityGloves")
	private String quantityGloves;

	@Column(name = "quantityLadiesSweaters")
	private String quantityLadiesSweaters;

	@Column(name = "quantityBlouses")
	private String quantityBlouses;

	@Column(name = "quantityLadiesHats")
	private String quantityLadiesHats;

	@Column(name = "quantityLadiesShoes")
	private String quantityLadiesShoes;

	@Column(name = "quantityFIR")
	private String quantityFIR;

	@Column(name = "quantityCoats")
	private String quantityCoats;

	@Column(name = "quantityLadiesSuit")
	private String quantityLadiesSuit;

	@Column(name = "quantityDresses")
	private String quantityDresses;

	@Column(name = "dateOfInventory")
	private Date dateOfInventory;

	@Column(name = "roomNumber")
	private String roomNumber;

	@Column(name = "patientName")
	private String patientName;

	@Column(name = "admissionTitleDate")
	private Date admissionTitleDate;

	@Column(name = "signResponsiblePartyOnAddmission")
	private String signResponsiblePartyOnAddmission;

	@Column(name = "quantityOther1")
	private String quantityOther1;

	@Column(name = "articleOther1")
	private String articleOther1;

	@Column(name = "quantityOther2")
	private String quantityOther2;

	@Column(name = "articleOther2")
	private String articleOther2;

	@Column(name = "quantityOther3")
	private String quantityOther3;

	@Column(name = "articleOther3")
	private String articleOther3;

	@Column(name = "quantityOther4")
	private String quantityOther4;

	@Column(name = "articleOther4")
	private String articleOther4;

	@Column(name = "quantityOther5")
	private String quantityOther5;

	@Column(name = "articleOther5")
	private String articleOther5;

	@Column(name = "quantityOther6")
	private String quantityOther6;

	@Column(name = "articleOther6")
	private String articleOther6;

	@Column(name = "quantityOther7")
	private String quantityOther7;

	@Column(name = "articleOther7")
	private String articleOther7;

	@Column(name = "quantityOther8")
	private String quantityOther8;

	@Column(name = "articleOther8")
	private String articleOther8;

	@Column(name = "quantityOther9")
	private String quantityOther9;

	@Column(name = "articleOther9")
	private String articleOther9;

	@Column(name = "remarks")
	private String remarks;

	public String getValuesOthers() {
		return this.valuesOthers;
	}

	public void setValuesOthers(String valuesOthers) {
		this.valuesOthers = valuesOthers;
	}

	public String getValuesGlasses() {
		return this.valuesGlasses;
	}

	public void setValuesGlasses(String valuesGlasses) {
		this.valuesGlasses = valuesGlasses;
	}

	public String getValuesDentures() {
		return this.valuesDentures;
	}

	public void setValuesDentures(String valuesDentures) {
		this.valuesDentures = valuesDentures;
	}

	public String getValuesHearingAid() {
		return this.valuesHearingAid;
	}

	public void setValuesHearingAid(String valuesHearingAid) {
		this.valuesHearingAid = valuesHearingAid;
	}

	public String getValuesTravellingBags() {
		return this.valuesTravellingBags;
	}

	public void setValuesTravellingBags(String valuesTravellingBags) {
		this.valuesTravellingBags = valuesTravellingBags;
	}

	public String getValuesShavingKit() {
		return this.valuesShavingKit;
	}

	public void setValuesShavingKit(String valuesShavingKit) {
		this.valuesShavingKit = valuesShavingKit;
	}

	public String getValuesSlippers() {
		return this.valuesSlippers;
	}

	public void setValuesSlippers(String valuesSlippers) {
		this.valuesSlippers = valuesSlippers;
	}

	public String getValuesRobes() {
		return this.valuesRobes;
	}

	public void setValuesRobes(String valuesRobes) {
		this.valuesRobes = valuesRobes;
	}

	public String getValuesPajamas() {
		return this.valuesPajamas;
	}

	public void setValuesPajamas(String valuesPajamas) {
		this.valuesPajamas = valuesPajamas;
	}

	public String getValuesMensHandkerChie() {
		return this.valuesMensHandkerChie;
	}

	public void setValuesMensHandkerChie(String valuesMensHandkerChie) {
		this.valuesMensHandkerChie = valuesMensHandkerChie;
	}

	public String getValuesBeltSuspenders() {
		return this.valuesBeltSuspenders;
	}

	public void setValuesBeltSuspenders(String valuesBeltSuspenders) {
		this.valuesBeltSuspenders = valuesBeltSuspenders;
	}

	public String getValuesTies() {
		return this.valuesTies;
	}

	public void setValuesTies(String valuesTies) {
		this.valuesTies = valuesTies;
	}

	public String getValuesUnderShirts() {
		return this.valuesUnderShirts;
	}

	public void setValuesUnderShirts(String valuesUnderShirts) {
		this.valuesUnderShirts = valuesUnderShirts;
	}

	public String getValuesShorts() {
		return this.valuesShorts;
	}

	public void setValuesShorts(String valuesShorts) {
		this.valuesShorts = valuesShorts;
	}

	public String getValuesSocks() {
		return this.valuesSocks;
	}

	public void setValuesSocks(String valuesSocks) {
		this.valuesSocks = valuesSocks;
	}

	public String getValuesMensGloves() {
		return this.valuesMensGloves;
	}

	public void setValuesMensGloves(String valuesMensGloves) {
		this.valuesMensGloves = valuesMensGloves;
	}

	public String getValuesMensShoes() {
		return this.valuesMensShoes;
	}

	public void setValuesMensShoes(String valuesMensShoes) {
		this.valuesMensShoes = valuesMensShoes;
	}

	public String getValuesMensHats() {
		return this.valuesMensHats;
	}

	public void setValuesMensHats(String valuesMensHats) {
		this.valuesMensHats = valuesMensHats;
	}

	public String getValuesSportJackets() {
		return this.valuesSportJackets;
	}

	public void setValuesSportJackets(String valuesSportJackets) {
		this.valuesSportJackets = valuesSportJackets;
	}

	public String getValuesSlacks() {
		return this.valuesSlacks;
	}

	public void setValuesSlacks(String valuesSlacks) {
		this.valuesSlacks = valuesSlacks;
	}

	public String getValuesTopCoats() {
		return this.valuesTopCoats;
	}

	public void setValuesTopCoats(String valuesTopCoats) {
		this.valuesTopCoats = valuesTopCoats;
	}

	public String getValuesMensSuit() {
		return this.valuesMensSuit;
	}

	public void setValuesMensSuit(String valuesMensSuit) {
		this.valuesMensSuit = valuesMensSuit;
	}

	public String getValuesOverNightCase() {
		return this.valuesOverNightCase;
	}

	public void setValuesOverNightCase(String valuesOverNightCase) {
		this.valuesOverNightCase = valuesOverNightCase;
	}

	public String getValuesPocketBooks() {
		return this.valuesPocketBooks;
	}

	public void setValuesPocketBooks(String valuesPocketBooks) {
		this.valuesPocketBooks = valuesPocketBooks;
	}

	public String getValuesHouseSlippers() {
		return this.valuesHouseSlippers;
	}

	public void setValuesHouseSlippers(String valuesHouseSlippers) {
		this.valuesHouseSlippers = valuesHouseSlippers;
	}

	public String getValuesHouseCoats() {
		return this.valuesHouseCoats;
	}

	public void setValuesHouseCoats(String valuesHouseCoats) {
		this.valuesHouseCoats = valuesHouseCoats;
	}

	public String getValuesNightGowns() {
		return this.valuesNightGowns;
	}

	public void setValuesNightGowns(String valuesNightGowns) {
		this.valuesNightGowns = valuesNightGowns;
	}

	public String getValuesBrassiers() {
		return this.valuesBrassiers;
	}

	public void setValuesBrassiers(String valuesBrassiers) {
		this.valuesBrassiers = valuesBrassiers;
	}

	public String getValuesFoundationGarments() {
		return this.valuesFoundationGarments;
	}

	public void setValuesFoundationGarments(String valuesFoundationGarments) {
		this.valuesFoundationGarments = valuesFoundationGarments;
	}

	public String getValuesSlips() {
		return this.valuesSlips;
	}

	public void setValuesSlips(String valuesSlips) {
		this.valuesSlips = valuesSlips;
	}

	public String getValuesLadiesHandkerChiefs() {
		return this.valuesLadiesHandkerChiefs;
	}

	public void setValuesLadiesHandkerChiefs(String valuesLadiesHandkerChiefs) {
		this.valuesLadiesHandkerChiefs = valuesLadiesHandkerChiefs;
	}

	public String getValuesHose() {
		return this.valuesHose;
	}

	public void setValuesHose(String valuesHose) {
		this.valuesHose = valuesHose;
	}

	public String getValuesGloves() {
		return this.valuesGloves;
	}

	public void setValuesGloves(String valuesGloves) {
		this.valuesGloves = valuesGloves;
	}

	public String getValuesLadiesSweaters() {
		return this.valuesLadiesSweaters;
	}

	public void setValuesLadiesSweaters(String valuesLadiesSweaters) {
		this.valuesLadiesSweaters = valuesLadiesSweaters;
	}

	public String getValuesBlouses() {
		return this.valuesBlouses;
	}

	public void setValuesBlouses(String valuesBlouses) {
		this.valuesBlouses = valuesBlouses;
	}

	public String getValueLadiesHats() {
		return this.valueLadiesHats;
	}

	public void setValueLadiesHats(String valueLadiesHats) {
		this.valueLadiesHats = valueLadiesHats;
	}

	public String getValueLadiesShoes() {
		return this.valueLadiesShoes;
	}

	public void setValueLadiesShoes(String valueLadiesShoes) {
		this.valueLadiesShoes = valueLadiesShoes;
	}

	public String getValueFirs() {
		return this.valueFirs;
	}

	public void setValueFirs(String valueFirs) {
		this.valueFirs = valueFirs;
	}

	public String getValueCoats() {
		return this.valueCoats;
	}

	public void setValueCoats(String valueCoats) {
		this.valueCoats = valueCoats;
	}

	public String getValueLadiesSuit() {
		return this.valueLadiesSuit;
	}

	public void setValueLadiesSuit(String valueLadiesSuit) {
		this.valueLadiesSuit = valueLadiesSuit;
	}

	public String getValueDresses() {
		return this.valueDresses;
	}

	public void setValueDresses(String valueDresses) {
		this.valueDresses = valueDresses;
	}

	public String getDescriptionOthers() {
		return this.descriptionOthers;
	}

	public void setDescriptionOthers(String descriptionOthers) {
		this.descriptionOthers = descriptionOthers;
	}

	public String getDescriptionGlasses() {
		return this.descriptionGlasses;
	}

	public void setDescriptionGlasses(String descriptionGlasses) {
		this.descriptionGlasses = descriptionGlasses;
	}

	public String getDescriptionDentures() {
		return this.descriptionDentures;
	}

	public void setDescriptionDentures(String descriptionDentures) {
		this.descriptionDentures = descriptionDentures;
	}

	public String getDescriptionHearingAid() {
		return this.descriptionHearingAid;
	}

	public void setDescriptionHearingAid(String descriptionHearingAid) {
		this.descriptionHearingAid = descriptionHearingAid;
	}

	public String getDescriptionTravellingBags() {
		return this.descriptionTravellingBags;
	}

	public void setDescriptionTravellingBags(String descriptionTravellingBags) {
		this.descriptionTravellingBags = descriptionTravellingBags;
	}

	public String getDescriptionShavingKit() {
		return this.descriptionShavingKit;
	}

	public void setDescriptionShavingKit(String descriptionShavingKit) {
		this.descriptionShavingKit = descriptionShavingKit;
	}

	public String getDescriptionSlippers() {
		return this.descriptionSlippers;
	}

	public void setDescriptionSlippers(String descriptionSlippers) {
		this.descriptionSlippers = descriptionSlippers;
	}

	public String getDescriptionRobes() {
		return this.descriptionRobes;
	}

	public void setDescriptionRobes(String descriptionRobes) {
		this.descriptionRobes = descriptionRobes;
	}

	public String getDescriptionPajamas() {
		return this.descriptionPajamas;
	}

	public void setDescriptionPajamas(String descriptionPajamas) {
		this.descriptionPajamas = descriptionPajamas;
	}

	public String getDescriptionMensHandkerChiefs() {
		return this.descriptionMensHandkerChiefs;
	}

	public void setDescriptionMensHandkerChiefs(
			String descriptionMensHandkerChiefs) {
		this.descriptionMensHandkerChiefs = descriptionMensHandkerChiefs;
	}

	public String getDescriptionBeltSuspenders() {
		return this.descriptionBeltSuspenders;
	}

	public void setDescriptionBeltSuspenders(String descriptionBeltSuspenders) {
		this.descriptionBeltSuspenders = descriptionBeltSuspenders;
	}

	public String getDescriptionTies() {
		return this.descriptionTies;
	}

	public void setDescriptionTies(String descriptionTies) {
		this.descriptionTies = descriptionTies;
	}

	public String getDescriptionShorts() {
		return this.descriptionShorts;
	}

	public void setDescriptionShorts(String descriptionShorts) {
		this.descriptionShorts = descriptionShorts;
	}

	public String getHowRecieved14() {
		return this.howRecieved14;
	}

	public void setHowRecieved14(String howRecieved14) {
		this.howRecieved14 = howRecieved14;
	}

	public String getHowRecieved13() {
		return this.howRecieved13;
	}

	public void setHowRecieved13(String howRecieved13) {
		this.howRecieved13 = howRecieved13;
	}

	public String getHowRecieved12() {
		return this.howRecieved12;
	}

	public void setHowRecieved12(String howRecieved12) {
		this.howRecieved12 = howRecieved12;
	}

	public String getHowRecieved11() {
		return this.howRecieved11;
	}

	public void setHowRecieved11(String howRecieved11) {
		this.howRecieved11 = howRecieved11;
	}

	public String getHowRecieved10() {
		return this.howRecieved10;
	}

	public void setHowRecieved10(String howRecieved10) {
		this.howRecieved10 = howRecieved10;
	}

	public String getHowRecieved9() {
		return this.howRecieved9;
	}

	public void setHowRecieved9(String howRecieved9) {
		this.howRecieved9 = howRecieved9;
	}

	public String getHowRecieved8() {
		return this.howRecieved8;
	}

	public void setHowRecieved8(String howRecieved8) {
		this.howRecieved8 = howRecieved8;
	}

	public String getHowRecieved7() {
		return this.howRecieved7;
	}

	public void setHowRecieved7(String howRecieved7) {
		this.howRecieved7 = howRecieved7;
	}

	public String getHowRecieved6() {
		return this.howRecieved6;
	}

	public void setHowRecieved6(String howRecieved6) {
		this.howRecieved6 = howRecieved6;
	}

	public String getHowRecieved5() {
		return this.howRecieved5;
	}

	public void setHowRecieved5(String howRecieved5) {
		this.howRecieved5 = howRecieved5;
	}

	public String getHowRecieved4() {
		return this.howRecieved4;
	}

	public void setHowRecieved4(String howRecieved4) {
		this.howRecieved4 = howRecieved4;
	}

	public String getHowRecieved3() {
		return this.howRecieved3;
	}

	public void setHowRecieved3(String howRecieved3) {
		this.howRecieved3 = howRecieved3;
	}

	public String getHowRecieved2() {
		return this.howRecieved2;
	}

	public void setHowRecieved2(String howRecieved2) {
		this.howRecieved2 = howRecieved2;
	}

	public String getHowRecieved1() {
		return this.howRecieved1;
	}

	public void setHowRecieved1(String howRecieved1) {
		this.howRecieved1 = howRecieved1;
	}

	public String getOrginalItem14() {
		return this.orginalItem14;
	}

	public void setOrginalItem14(String orginalItem14) {
		this.orginalItem14 = orginalItem14;
	}

	public String getOrginalItem13() {
		return this.orginalItem13;
	}

	public void setOrginalItem13(String orginalItem13) {
		this.orginalItem13 = orginalItem13;
	}

	public String getOrginalItem12() {
		return this.orginalItem12;
	}

	public void setOrginalItem12(String orginalItem12) {
		this.orginalItem12 = orginalItem12;
	}

	public String getOrginalItem11() {
		return this.orginalItem11;
	}

	public void setOrginalItem11(String orginalItem11) {
		this.orginalItem11 = orginalItem11;
	}

	public String getOrginalItem10() {
		return this.orginalItem10;
	}

	public void setOrginalItem10(String orginalItem10) {
		this.orginalItem10 = orginalItem10;
	}

	public String getOrginalItem9() {
		return this.orginalItem9;
	}

	public void setOrginalItem9(String orginalItem9) {
		this.orginalItem9 = orginalItem9;
	}

	public String getOrginalItem8() {
		return this.orginalItem8;
	}

	public void setOrginalItem8(String orginalItem8) {
		this.orginalItem8 = orginalItem8;
	}

	public String getOrginalItem7() {
		return this.orginalItem7;
	}

	public void setOrginalItem7(String orginalItem7) {
		this.orginalItem7 = orginalItem7;
	}

	public String getOrginalItem6() {
		return this.orginalItem6;
	}

	public void setOrginalItem6(String orginalItem6) {
		this.orginalItem6 = orginalItem6;
	}

	public String getOrginalItem5() {
		return this.orginalItem5;
	}

	public void setOrginalItem5(String orginalItem5) {
		this.orginalItem5 = orginalItem5;
	}

	public String getOrginalItem4() {
		return this.orginalItem4;
	}

	public void setOrginalItem4(String orginalItem4) {
		this.orginalItem4 = orginalItem4;
	}

	public String getOrginalItem3() {
		return this.orginalItem3;
	}

	public void setOrginalItem3(String orginalItem3) {
		this.orginalItem3 = orginalItem3;
	}

	public String getOrginalItem2() {
		return this.orginalItem2;
	}

	public void setOrginalItem2(String orginalItem2) {
		this.orginalItem2 = orginalItem2;
	}

	public String getOrginalItem1() {
		return this.orginalItem1;
	}

	public void setOrginalItem1(String orginalItem1) {
		this.orginalItem1 = orginalItem1;
	}

	public Date getOriginalDate14() {
		return this.originalDate14;
	}

	public void setOriginalDate14(Date originalDate14) {
		this.originalDate14 = originalDate14;
	}

	public Date getOriginalDate13() {
		return this.originalDate13;
	}

	public void setOriginalDate13(Date originalDate13) {
		this.originalDate13 = originalDate13;
	}

	public Date getOriginalDate12() {
		return this.originalDate12;
	}

	public void setOriginalDate12(Date originalDate12) {
		this.originalDate12 = originalDate12;
	}

	public Date getOriginalDate11() {
		return this.originalDate11;
	}

	public void setOriginalDate11(Date originalDate11) {
		this.originalDate11 = originalDate11;
	}

	public Date getOriginalDate10() {
		return this.originalDate10;
	}

	public void setOriginalDate10(Date originalDate10) {
		this.originalDate10 = originalDate10;
	}

	public Date getOriginalDate9() {
		return this.originalDate9;
	}

	public void setOriginalDate9(Date originalDate9) {
		this.originalDate9 = originalDate9;
	}

	public Date getOriginalDate8() {
		return this.originalDate8;
	}

	public void setOriginalDate8(Date originalDate8) {
		this.originalDate8 = originalDate8;
	}

	public Date getOriginalDate7() {
		return this.originalDate7;
	}

	public void setOriginalDate7(Date originalDate7) {
		this.originalDate7 = originalDate7;
	}

	public Date getOriginalDate6() {
		return this.originalDate6;
	}

	public void setOriginalDate6(Date originalDate6) {
		this.originalDate6 = originalDate6;
	}

	public Date getOriginalDate5() {
		return this.originalDate5;
	}

	public void setOriginalDate5(Date originalDate5) {
		this.originalDate5 = originalDate5;
	}

	public Date getOriginalDate4() {
		return this.originalDate4;
	}

	public void setOriginalDate4(Date originalDate4) {
		this.originalDate4 = originalDate4;
	}

	public Date getOriginalDate3() {
		return this.originalDate3;
	}

	public void setOriginalDate3(Date originalDate3) {
		this.originalDate3 = originalDate3;
	}

	public Date getOriginalDate2() {
		return this.originalDate2;
	}

	public void setOriginalDate2(Date originalDate2) {
		this.originalDate2 = originalDate2;
	}

	public Date getOriginalDate1() {
		return this.originalDate1;
	}

	public void setOriginalDate1(Date originalDate1) {
		this.originalDate1 = originalDate1;
	}

	public String getDescriptionLadiesHandkerChiefs() {
		return this.descriptionLadiesHandkerChiefs;
	}

	public void setDescriptionLadiesHandkerChiefs(
			String descriptionLadiesHandkerChiefs) {
		this.descriptionLadiesHandkerChiefs = descriptionLadiesHandkerChiefs;
	}

	public String getDescriptionHose() {
		return this.descriptionHose;
	}

	public void setDescriptionHose(String descriptionHose) {
		this.descriptionHose = descriptionHose;
	}

	public String getDescriptionGloves() {
		return this.descriptionGloves;
	}

	public void setDescriptionGloves(String descriptionGloves) {
		this.descriptionGloves = descriptionGloves;
	}

	public String getDescriptionLadiesSweaters() {
		return this.descriptionLadiesSweaters;
	}

	public void setDescriptionLadiesSweaters(String descriptionLadiesSweaters) {
		this.descriptionLadiesSweaters = descriptionLadiesSweaters;
	}

	public String getDescriptionBlouses() {
		return this.descriptionBlouses;
	}

	public void setDescriptionBlouses(String descriptionBlouses) {
		this.descriptionBlouses = descriptionBlouses;
	}

	public String getDescriptionLadiesHats() {
		return this.descriptionLadiesHats;
	}

	public void setDescriptionLadiesHats(String descriptionLadiesHats) {
		this.descriptionLadiesHats = descriptionLadiesHats;
	}

	public String getDescriptionLadiesShoes() {
		return this.descriptionLadiesShoes;
	}

	public void setDescriptionLadiesShoes(String descriptionLadiesShoes) {
		this.descriptionLadiesShoes = descriptionLadiesShoes;
	}

	public String getDescriptionFirs() {
		return this.descriptionFirs;
	}

	public void setDescriptionFirs(String descriptionFirs) {
		this.descriptionFirs = descriptionFirs;
	}

	public String getDescriptionCoats() {
		return this.descriptionCoats;
	}

	public void setDescriptionCoats(String descriptionCoats) {
		this.descriptionCoats = descriptionCoats;
	}

	public String getDescriptionLadiesSuit() {
		return this.descriptionLadiesSuit;
	}

	public void setDescriptionLadiesSuit(String descriptionLadiesSuit) {
		this.descriptionLadiesSuit = descriptionLadiesSuit;
	}

	public String getDescriptionDresses() {
		return this.descriptionDresses;
	}

	public void setDescriptionDresses(String descriptionDresses) {
		this.descriptionDresses = descriptionDresses;
	}

	public Date getDischargeResponsiblePartyDate() {
		return this.dischargeResponsiblePartyDate;
	}

	public void setDischargeResponsiblePartyDate(
			Date dischargeResponsiblePartyDate) {
		this.dischargeResponsiblePartyDate = dischargeResponsiblePartyDate;
	}

	public String getSignResponsiblePartyOnDischarge() {
		return this.signResponsiblePartyOnDischarge;
	}

	public void setSignResponsiblePartyOnDischarge(
			String signResponsiblePartyOnDischarge) {
		this.signResponsiblePartyOnDischarge = signResponsiblePartyOnDischarge;
	}

	public String getQuantityOthers() {
		return this.quantityOthers;
	}

	public void setQuantityOthers(String quantityOthers) {
		this.quantityOthers = quantityOthers;
	}

	public String getQuantityGlasses() {
		return this.quantityGlasses;
	}

	public void setQuantityGlasses(String quantityGlasses) {
		this.quantityGlasses = quantityGlasses;
	}

	public String getQuantityDentures() {
		return this.quantityDentures;
	}

	public void setQuantityDentures(String quantityDentures) {
		this.quantityDentures = quantityDentures;
	}

	public String getQuantityHearingAid() {
		return this.quantityHearingAid;
	}

	public void setQuantityHearingAid(String quantityHearingAid) {
		this.quantityHearingAid = quantityHearingAid;
	}

	public String getQuantityTravellingBags() {
		return this.quantityTravellingBags;
	}

	public void setQuantityTravellingBags(String quantityTravellingBags) {
		this.quantityTravellingBags = quantityTravellingBags;
	}

	public String getQuantityShavingKit() {
		return this.quantityShavingKit;
	}

	public void setQuantityShavingKit(String quantityShavingKit) {
		this.quantityShavingKit = quantityShavingKit;
	}

	public String getQuantitySlippers() {
		return this.quantitySlippers;
	}

	public void setQuantitySlippers(String quantitySlippers) {
		this.quantitySlippers = quantitySlippers;
	}

	public String getQuantityRobes() {
		return this.quantityRobes;
	}

	public void setQuantityRobes(String quantityRobes) {
		this.quantityRobes = quantityRobes;
	}

	public String getQuantityPajamas() {
		return this.quantityPajamas;
	}

	public void setQuantityPajamas(String quantityPajamas) {
		this.quantityPajamas = quantityPajamas;
	}

	public String getQuantityMensHandkerChiefs() {
		return this.quantityMensHandkerChiefs;
	}

	public void setQuantityMensHandkerChiefs(String quantityMensHandkerChiefs) {
		this.quantityMensHandkerChiefs = quantityMensHandkerChiefs;
	}

	public String getQuantityBeltsSuspenders() {
		return this.quantityBeltsSuspenders;
	}

	public void setQuantityBeltsSuspenders(String quantityBeltsSuspenders) {
		this.quantityBeltsSuspenders = quantityBeltsSuspenders;
	}

	public String getQuantityTies() {
		return this.quantityTies;
	}

	public void setQuantityTies(String quantityTies) {
		this.quantityTies = quantityTies;
	}

	public String getQuantityUnderShirts() {
		return this.quantityUnderShirts;
	}

	public void setQuantityUnderShirts(String quantityUnderShirts) {
		this.quantityUnderShirts = quantityUnderShirts;
	}

	public String getQuantityShort() {
		return this.quantityShort;
	}

	public void setQuantityShort(String quantityShort) {
		this.quantityShort = quantityShort;
	}

	public String getQuantitySocks() {
		return this.quantitySocks;
	}

	public void setQuantitySocks(String quantitySocks) {
		this.quantitySocks = quantitySocks;
	}

	public String getQuantityMensGloves() {
		return this.quantityMensGloves;
	}

	public void setQuantityMensGloves(String quantityMensGloves) {
		this.quantityMensGloves = quantityMensGloves;
	}

	public String getQuantityMensShoes() {
		return this.quantityMensShoes;
	}

	public void setQuantityMensShoes(String quantityMensShoes) {
		this.quantityMensShoes = quantityMensShoes;
	}

	public String getQuantityMensHats() {
		return this.quantityMensHats;
	}

	public void setQuantityMensHats(String quantityMensHats) {
		this.quantityMensHats = quantityMensHats;
	}

	public String getQuantitySportJackets() {
		return this.quantitySportJackets;
	}

	public void setQuantitySportJackets(String quantitySportJackets) {
		this.quantitySportJackets = quantitySportJackets;
	}

	public String getQuantitySlacks() {
		return this.quantitySlacks;
	}

	public void setQuantitySlacks(String quantitySlacks) {
		this.quantitySlacks = quantitySlacks;
	}

	public String getQuantityTopCoats() {
		return this.quantityTopCoats;
	}

	public void setQuantityTopCoats(String quantityTopCoats) {
		this.quantityTopCoats = quantityTopCoats;
	}

	public String getQuantityMensSuit() {
		return this.quantityMensSuit;
	}

	public void setQuantityMensSuit(String quantityMensSuit) {
		this.quantityMensSuit = quantityMensSuit;
	}

	public String getQuantityOvernightCase() {
		return this.quantityOvernightCase;
	}

	public void setQuantityOvernightCase(String quantityOvernightCase) {
		this.quantityOvernightCase = quantityOvernightCase;
	}

	public String getQuantityPocketBooks() {
		return this.quantityPocketBooks;
	}

	public void setQuantityPocketBooks(String quantityPocketBooks) {
		this.quantityPocketBooks = quantityPocketBooks;
	}

	public String getQuantityHouseSlippers() {
		return this.quantityHouseSlippers;
	}

	public void setQuantityHouseSlippers(String quantityHouseSlippers) {
		this.quantityHouseSlippers = quantityHouseSlippers;
	}

	public String getQuantityHouseCoats() {
		return this.quantityHouseCoats;
	}

	public void setQuantityHouseCoats(String quantityHouseCoats) {
		this.quantityHouseCoats = quantityHouseCoats;
	}

	public String getQuantityNightGowns() {
		return this.quantityNightGowns;
	}

	public void setQuantityNightGowns(String quantityNightGowns) {
		this.quantityNightGowns = quantityNightGowns;
	}

	public String getQuantityBrasiers() {
		return this.quantityBrasiers;
	}

	public void setQuantityBrasiers(String quantityBrasiers) {
		this.quantityBrasiers = quantityBrasiers;
	}

	public String getQuantityFoundationGarments() {
		return this.quantityFoundationGarments;
	}

	public void setQuantityFoundationGarments(String quantityFoundationGarments) {
		this.quantityFoundationGarments = quantityFoundationGarments;
	}

	public String getQuantitySlips() {
		return this.quantitySlips;
	}

	public void setQuantitySlips(String quantitySlips) {
		this.quantitySlips = quantitySlips;
	}

	public String getQuantityLadiesHandkerChiefs() {
		return this.quantityLadiesHandkerChiefs;
	}

	public void setQuantityLadiesHandkerChiefs(
			String quantityLadiesHandkerChiefs) {
		this.quantityLadiesHandkerChiefs = quantityLadiesHandkerChiefs;
	}

	public String getQuantityHose() {
		return this.quantityHose;
	}

	public void setQuantityHose(String quantityHose) {
		this.quantityHose = quantityHose;
	}

	public String getQuantityGloves() {
		return this.quantityGloves;
	}

	public void setQuantityGloves(String quantityGloves) {
		this.quantityGloves = quantityGloves;
	}

	public String getQuantityLadiesSweaters() {
		return this.quantityLadiesSweaters;
	}

	public void setQuantityLadiesSweaters(String quantityLadiesSweaters) {
		this.quantityLadiesSweaters = quantityLadiesSweaters;
	}

	public String getQuantityBlouses() {
		return this.quantityBlouses;
	}

	public void setQuantityBlouses(String quantityBlouses) {
		this.quantityBlouses = quantityBlouses;
	}

	public String getQuantityLadiesHats() {
		return this.quantityLadiesHats;
	}

	public void setQuantityLadiesHats(String quantityLadiesHats) {
		this.quantityLadiesHats = quantityLadiesHats;
	}

	public String getQuantityLadiesShoes() {
		return this.quantityLadiesShoes;
	}

	public void setQuantityLadiesShoes(String quantityLadiesShoes) {
		this.quantityLadiesShoes = quantityLadiesShoes;
	}

	public String getQuantityFIR() {
		return this.quantityFIR;
	}

	public void setQuantityFIR(String quantityFIR) {
		this.quantityFIR = quantityFIR;
	}

	public String getQuantityCoats() {
		return this.quantityCoats;
	}

	public void setQuantityCoats(String quantityCoats) {
		this.quantityCoats = quantityCoats;
	}

	public String getQuantityLadiesSuit() {
		return this.quantityLadiesSuit;
	}

	public void setQuantityLadiesSuit(String quantityLadiesSuit) {
		this.quantityLadiesSuit = quantityLadiesSuit;
	}

	public String getQuantityDresses() {
		return this.quantityDresses;
	}

	public void setQuantityDresses(String quantityDresses) {
		this.quantityDresses = quantityDresses;
	}

	public Date getDateOfInventory() {
		return this.dateOfInventory;
	}

	public void setDateOfInventory(Date dateOfInventory) {
		this.dateOfInventory = dateOfInventory;
	}

	public String getRoomNumber() {
		return this.roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getPatientName() {
		return this.patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Date getAdmissionTitleDate() {
		return this.admissionTitleDate;
	}

	public void setAdmissionTitleDate(Date admissionTitleDate) {
		this.admissionTitleDate = admissionTitleDate;
	}

	public String getSignResponsiblePartyOnAddmission() {
		return this.signResponsiblePartyOnAddmission;
	}

	public void setSignResponsiblePartyOnAddmission(
			String signResponsiblePartyOnAddmission) {
		this.signResponsiblePartyOnAddmission = signResponsiblePartyOnAddmission;
	}

	public String getQuantityOther1() {
		return this.quantityOther1;
	}

	public void setQuantityOther1(String quantityOther1) {
		this.quantityOther1 = quantityOther1;
	}

	public String getArticleOther1() {
		return this.articleOther1;
	}

	public void setArticleOther1(String articleOther1) {
		this.articleOther1 = articleOther1;
	}

	public String getQuantityOther2() {
		return this.quantityOther2;
	}

	public void setQuantityOther2(String quantityOther2) {
		this.quantityOther2 = quantityOther2;
	}

	public String getArticleOther2() {
		return this.articleOther2;
	}

	public void setArticleOther2(String articleOther2) {
		this.articleOther2 = articleOther2;
	}

	public String getQuantityOther3() {
		return this.quantityOther3;
	}

	public void setQuantityOther3(String quantityOther3) {
		this.quantityOther3 = quantityOther3;
	}

	public String getArticleOther3() {
		return this.articleOther3;
	}

	public void setArticleOther3(String articleOther3) {
		this.articleOther3 = articleOther3;
	}

	public String getQuantityOther4() {
		return this.quantityOther4;
	}

	public void setQuantityOther4(String quantityOther4) {
		this.quantityOther4 = quantityOther4;
	}

	public String getArticleOther4() {
		return this.articleOther4;
	}

	public void setArticleOther4(String articleOther4) {
		this.articleOther4 = articleOther4;
	}

	public String getQuantityOther5() {
		return this.quantityOther5;
	}

	public void setQuantityOther5(String quantityOther5) {
		this.quantityOther5 = quantityOther5;
	}

	public String getArticleOther5() {
		return this.articleOther5;
	}

	public void setArticleOther5(String articleOther5) {
		this.articleOther5 = articleOther5;
	}

	public String getQuantityOther6() {
		return this.quantityOther6;
	}

	public void setQuantityOther6(String quantityOther6) {
		this.quantityOther6 = quantityOther6;
	}

	public String getArticleOther6() {
		return this.articleOther6;
	}

	public void setArticleOther6(String articleOther6) {
		this.articleOther6 = articleOther6;
	}

	public String getQuantityOther7() {
		return this.quantityOther7;
	}

	public void setQuantityOther7(String quantityOther7) {
		this.quantityOther7 = quantityOther7;
	}

	public String getArticleOther7() {
		return this.articleOther7;
	}

	public void setArticleOther7(String articleOther7) {
		this.articleOther7 = articleOther7;
	}

	public String getQuantityOther8() {
		return this.quantityOther8;
	}

	public void setQuantityOther8(String quantityOther8) {
		this.quantityOther8 = quantityOther8;
	}

	public String getArticleOther8() {
		return this.articleOther8;
	}

	public void setArticleOther8(String articleOther8) {
		this.articleOther8 = articleOther8;
	}

	public String getQuantityOther9() {
		return this.quantityOther9;
	}

	public void setQuantityOther9(String quantityOther9) {
		this.quantityOther9 = quantityOther9;
	}

	public String getArticleOther9() {
		return this.articleOther9;
	}

	public void setArticleOther9(String articleOther9) {
		this.articleOther9 = articleOther9;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
