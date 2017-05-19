package medrex.commons.vo.medication;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PressureSoreAssessment")
public class PressureSoreAssessment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6448310203166770505L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "formId")
	private int formId;
	@Column(name = "formNum")
	private int formNum;
	@Column(name = "siteNum")
	private String siteNum;
	@Column(name = "stage")
	private String stage;
	@Column(name = "shape")
	private String shape;
	@Column(name = "length")
	private String length;
	@Column(name = "width")
	private String width;
	@Column(name = "depth")
	private String depth;
	@Column(name = "tunneling")
	private int tunneling;
	@Column(name = "drainageType")
	private String drainageType;
	@Column(name = "drainageAmount")
	private String drainageAmount;
	@Column(name = "odor")
	private String odor;
	@Column(name = "healing")
	private String healing;
	@Column(name = "CoordinateX")
	private int x;
	@Column(name = "CoordinateY")
	private int y;
	@Column(name = "pink")
	private int pink;
	@Column(name = "red")
	private int red;
	@Column(name = "brown")
	private int brown;
	@Column(name = "eschar")
	private int eschar;
	@Column(name = "slough")
	private int slough;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public int getFormNum() {
		return formNum;
	}

	public void setFormNum(int formNum) {
		this.formNum = formNum;
	}

	public String getSiteNum() {
		return siteNum;
	}

	public void setSiteNum(String siteNum) {
		this.siteNum = siteNum;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getDepth() {
		return depth;
	}

	public void setDepth(String depth) {
		this.depth = depth;
	}

	public int getTunneling() {
		return tunneling;
	}

	public void setTunneling(int tunneling) {
		this.tunneling = tunneling;
	}

	public String getDrainageType() {
		return drainageType;
	}

	public void setDrainageType(String drainageType) {
		this.drainageType = drainageType;
	}

	public String getDrainageAmount() {
		return drainageAmount;
	}

	public void setDrainageAmount(String drainageAmount) {
		this.drainageAmount = drainageAmount;
	}

	public String getOdor() {
		return odor;
	}

	public void setOdor(String odor) {
		this.odor = odor;
	}

	public String getHealing() {
		return healing;
	}

	public void setHealing(String healing) {
		this.healing = healing;
	}

	public int getPink() {
		return pink;
	}

	public void setPink(int pink) {
		this.pink = pink;
	}

	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public int getBrown() {
		return brown;
	}

	public void setBrown(int brown) {
		this.brown = brown;
	}

	public int getEschar() {
		return eschar;
	}

	public void setEschar(int eschar) {
		this.eschar = eschar;
	}

	public int getSlough() {
		return slough;
	}

	public void setSlough(int slough) {
		this.slough = slough;
	}
}
