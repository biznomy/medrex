package medrex.commons.vo.monthlySummary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ParentalNutritionalOrder")
public class ParentalNutritionalOrder {

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "txtLabCbfComment")
	private int txtLabCbfComment;
	@Column(name = "dcTo")
	private int dcTo;
	@Column(name = "dcFrom")
	private int dcFrom;
	@Column(name = "txtOrderedValid")
	private int txtOrderedValid;
	@Column(name = "txtDate")
	private int txtDate;
	@Column(name = "txtDateOrdered")
	private int txtDateOrdered;
	@Column(name = "txtRnSignature")
	private int txtRnSignature;
	@Column(name = "txtMdSignature")
	private int txtMdSignature;
	@Column(name = "txtRnName")
	private int txtRnName;
	@Column(name = "txtMdName")
	private int txtMdName;
	@Column(name = "txtOtherAdditive")
	private int txtOtherAdditive;
	@Column(name = "txtMviAdult")
	private int txtMviAdult;
	@Column(name = "txtRegularHumenInsulin")
	private int txtRegularHumenInsulin;
	@Column(name = "txtMultiraceCone")
	private int txtMultiraceCone;
	@Column(name = "txtCalciumGluconate")
	private int txtCalciumGluconate;
	@Column(name = "txtMagnesiumSulphate")
	private int txtMagnesiumSulphate;
	@Column(name = "txtPotassiumAcetate")
	private int txtPotassiumAcetate;
	@Column(name = "txtPotassiumChloride")
	private int txtPotassiumChloride;
	@Column(name = "txtPorassiumPhosphate")
	private int txtPorassiumPhosphate;
	@Column(name = "txtSodiumPhosphate")
	private int txtSodiumPhosphate;
	@Column(name = "txtSodiumAcetate")
	private int txtSodiumAcetate;
	@Column(name = "txtSodiumChloride")
	private int txtSodiumChloride;
	@Column(name = "txt1HrTaper")
	private int txt1HrTaper;
	@Column(name = "txtTotalVolume")
	private int txtTotalVolume;
	@Column(name = "txtOver")
	private int txtOver;
	@Column(name = "txt1hrRamp")
	private int txt1hrRamp;
	@Column(name = "txtFatEmulsion")
	private int txtFatEmulsion;
	@Column(name = "txtDextrose")
	private int txtDextrose;
	@Column(name = "txtAminoAcids")
	private int txtAminoAcids;
	@Column(name = "txtBaseSolution")
	private int txtBaseSolution;
	@Column(name = "txtPtWgt")
	private int txtPtWgt;

	public int getSerial() {
		return serial;
	}

	public int getTxtLabCbfComment() {
		return txtLabCbfComment;
	}

	public int getDcTo() {
		return dcTo;
	}

	public int getDcFrom() {
		return dcFrom;
	}

	public int getTxtOrderedValid() {
		return txtOrderedValid;
	}

	public int getTxtDate() {
		return txtDate;
	}

	public int getTxtDateOrdered() {
		return txtDateOrdered;
	}

	public int getTxtRnSignature() {
		return txtRnSignature;
	}

	public int getTxtMdSignature() {
		return txtMdSignature;
	}

	public int getTxtRnName() {
		return txtRnName;
	}

	public int getTxtMdName() {
		return txtMdName;
	}

	public int getTxtOtherAdditive() {
		return txtOtherAdditive;
	}

	public int getTxtMviAdult() {
		return txtMviAdult;
	}

	public int getTxtRegularHumenInsulin() {
		return txtRegularHumenInsulin;
	}

	public int getTxtMultiraceCone() {
		return txtMultiraceCone;
	}

	public int getTxtCalciumGluconate() {
		return txtCalciumGluconate;
	}

	public int getTxtMagnesiumSulphate() {
		return txtMagnesiumSulphate;
	}

	public int getTxtPotassiumAcetate() {
		return txtPotassiumAcetate;
	}

	public int getTxtPotassiumChloride() {
		return txtPotassiumChloride;
	}

	public int getTxtPorassiumPhosphate() {
		return txtPorassiumPhosphate;
	}

	public int getTxtSodiumPhosphate() {
		return txtSodiumPhosphate;
	}

	public int getTxtSodiumAcetate() {
		return txtSodiumAcetate;
	}

	public int getTxtSodiumChloride() {
		return txtSodiumChloride;
	}

	public int getTxt1HrTaper() {
		return txt1HrTaper;
	}

	public int getTxtTotalVolume() {
		return txtTotalVolume;
	}

	public int getTxtOver() {
		return txtOver;
	}

	public int getTxt1hrRamp() {
		return txt1hrRamp;
	}

	public int getTxtFatEmulsion() {
		return txtFatEmulsion;
	}

	public int getTxtDextrose() {
		return txtDextrose;
	}

	public int getTxtAminoAcids() {
		return txtAminoAcids;
	}

	public int getTxtBaseSolution() {
		return txtBaseSolution;
	}

	public int getTxtPtWgt() {
		return txtPtWgt;
	}

	public int getTxtRm() {
		return txtRm;
	}

	public int getTxtPatientName() {
		return txtPatientName;
	}

	public int getTxtFaculty() {
		return txtFaculty;
	}

	public int getTxtUnit() {
		return txtUnit;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public void setTxtLabCbfComment(int txtLabCbfComment) {
		this.txtLabCbfComment = txtLabCbfComment;
	}

	public void setDcTo(int dcTo) {
		this.dcTo = dcTo;
	}

	public void setDcFrom(int dcFrom) {
		this.dcFrom = dcFrom;
	}

	public void setTxtOrderedValid(int txtOrderedValid) {
		this.txtOrderedValid = txtOrderedValid;
	}

	public void setTxtDate(int txtDate) {
		this.txtDate = txtDate;
	}

	public void setTxtDateOrdered(int txtDateOrdered) {
		this.txtDateOrdered = txtDateOrdered;
	}

	public void setTxtRnSignature(int txtRnSignature) {
		this.txtRnSignature = txtRnSignature;
	}

	public void setTxtMdSignature(int txtMdSignature) {
		this.txtMdSignature = txtMdSignature;
	}

	public void setTxtRnName(int txtRnName) {
		this.txtRnName = txtRnName;
	}

	public void setTxtMdName(int txtMdName) {
		this.txtMdName = txtMdName;
	}

	public void setTxtOtherAdditive(int txtOtherAdditive) {
		this.txtOtherAdditive = txtOtherAdditive;
	}

	public void setTxtMviAdult(int txtMviAdult) {
		this.txtMviAdult = txtMviAdult;
	}

	public void setTxtRegularHumenInsulin(int txtRegularHumenInsulin) {
		this.txtRegularHumenInsulin = txtRegularHumenInsulin;
	}

	public void setTxtMultiraceCone(int txtMultiraceCone) {
		this.txtMultiraceCone = txtMultiraceCone;
	}

	public void setTxtCalciumGluconate(int txtCalciumGluconate) {
		this.txtCalciumGluconate = txtCalciumGluconate;
	}

	public void setTxtMagnesiumSulphate(int txtMagnesiumSulphate) {
		this.txtMagnesiumSulphate = txtMagnesiumSulphate;
	}

	public void setTxtPotassiumAcetate(int txtPotassiumAcetate) {
		this.txtPotassiumAcetate = txtPotassiumAcetate;
	}

	public void setTxtPotassiumChloride(int txtPotassiumChloride) {
		this.txtPotassiumChloride = txtPotassiumChloride;
	}

	public void setTxtPorassiumPhosphate(int txtPorassiumPhosphate) {
		this.txtPorassiumPhosphate = txtPorassiumPhosphate;
	}

	public void setTxtSodiumPhosphate(int txtSodiumPhosphate) {
		this.txtSodiumPhosphate = txtSodiumPhosphate;
	}

	public void setTxtSodiumAcetate(int txtSodiumAcetate) {
		this.txtSodiumAcetate = txtSodiumAcetate;
	}

	public void setTxtSodiumChloride(int txtSodiumChloride) {
		this.txtSodiumChloride = txtSodiumChloride;
	}

	public void setTxt1HrTaper(int txt1HrTaper) {
		this.txt1HrTaper = txt1HrTaper;
	}

	public void setTxtTotalVolume(int txtTotalVolume) {
		this.txtTotalVolume = txtTotalVolume;
	}

	public void setTxtOver(int txtOver) {
		this.txtOver = txtOver;
	}

	public void setTxt1hrRamp(int txt1hrRamp) {
		this.txt1hrRamp = txt1hrRamp;
	}

	public void setTxtFatEmulsion(int txtFatEmulsion) {
		this.txtFatEmulsion = txtFatEmulsion;
	}

	public void setTxtDextrose(int txtDextrose) {
		this.txtDextrose = txtDextrose;
	}

	public void setTxtAminoAcids(int txtAminoAcids) {
		this.txtAminoAcids = txtAminoAcids;
	}

	public void setTxtBaseSolution(int txtBaseSolution) {
		this.txtBaseSolution = txtBaseSolution;
	}

	public void setTxtPtWgt(int txtPtWgt) {
		this.txtPtWgt = txtPtWgt;
	}

	public void setTxtRm(int txtRm) {
		this.txtRm = txtRm;
	}

	public void setTxtPatientName(int txtPatientName) {
		this.txtPatientName = txtPatientName;
	}

	public void setTxtFaculty(int txtFaculty) {
		this.txtFaculty = txtFaculty;
	}

	public void setTxtUnit(int txtUnit) {
		this.txtUnit = txtUnit;
	}

	@Column(name = "txtRm")
	private int txtRm;
	@Column(name = "txtPatientName")
	private int txtPatientName;
	@Column(name = "txtFaculty")
	private int txtFaculty;
	@Column(name = "txtUnit")
	private int txtUnit;

}
