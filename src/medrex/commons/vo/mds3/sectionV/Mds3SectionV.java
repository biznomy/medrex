package medrex.commons.vo.mds3.sectionV;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mds3SectionV")
public class Mds3SectionV implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5746227771494283785L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "V0100A")
	private String v0100A;

	@Column(name = "V0100B")
	private String v0100B;

	@Column(name = "V0100C")
	private Date v0100C;

	@Column(name = "V0100D")
	private String v0100D;

	@Column(name = "V0100E")
	private String v0100E;

	@Column(name = "V0100F")
	private String v0100F;

	public String getV0100A() {
		return v0100A;
	}

	public void setV0100A(String v0100a) {
		v0100A = v0100a;
	}

	public String getV0100B() {
		return v0100B;
	}

	public void setV0100B(String v0100b) {
		v0100B = v0100b;
	}

	public Date getV0100C() {
		return v0100C;
	}

	public void setV0100C(Date v0100c) {
		v0100C = v0100c;
	}

	public String getV0100D() {
		return v0100D;
	}

	public void setV0100D(String v0100d) {
		v0100D = v0100d;
	}

	public String getV0100E() {
		return v0100E;
	}

	public void setV0100E(String v0100e) {
		v0100E = v0100e;
	}

	public String getV0100F() {
		return v0100F;
	}

	public void setV0100F(String v0100f) {
		v0100F = v0100f;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	@Column(name = "V0200A_01A")
	private boolean v0200A_01A;
	@Column(name = "V0200A_01B")
	private boolean v0200A_01B;

	@Column(name = "V0200A_02A")
	private boolean v0200A_02A;
	@Column(name = "V0200A_02B")
	private boolean v0200A_02B;

	@Column(name = "V0200A_03A")
	private boolean v0200A_03A;
	@Column(name = "V0200A_03B")
	private boolean v0200A_03B;

	@Column(name = "V0200A_04A")
	private boolean v0200A_04A;
	@Column(name = "V0200A_04B")
	private boolean v0200A_04B;

	@Column(name = "V0200A_05A")
	private boolean v0200A_05A;
	@Column(name = "V0200A_05B")
	private boolean v0200A_05B;

	@Column(name = "V0200A_06A")
	private boolean v0200A_06A;
	@Column(name = "V0200A_06B")
	private boolean v0200A_06B;

	@Column(name = "V0200A_07A")
	private boolean v0200A_07A;
	@Column(name = "V0200A_07B")
	private boolean v0200A_07B;

	@Column(name = "V0200A_08A")
	private boolean v0200A_08A;
	@Column(name = "V0200A_08B")
	private boolean v0200A_08B;

	@Column(name = "V0200A_09A")
	private boolean v0200A_09A;
	@Column(name = "V0200A_09B")
	private boolean v0200A_09B;

	@Column(name = "V0200A_10A")
	private boolean v0200A_10A;
	@Column(name = "V0200A_10B")
	private boolean v0200A_10B;

	@Column(name = "V0200A_11A")
	private boolean v0200A_11A;
	@Column(name = "V0200A_11B")
	private boolean v0200A_11B;

	@Column(name = "V0200A_12A")
	private boolean v0200A_12A;
	@Column(name = "V0200A_12B")
	private boolean v0200A_12B;

	@Column(name = "V0200A_13A")
	private boolean v0200A_13A;
	@Column(name = "V0200A_13B")
	private boolean v0200A_13B;

	@Column(name = "V0200A_14A")
	private boolean v0200A_14A;
	@Column(name = "V0200A_14B")
	private boolean v0200A_14B;

	@Column(name = "V0200A_15A")
	private boolean v0200A_15A;
	@Column(name = "V0200A_15B")
	private boolean v0200A_15B;

	@Column(name = "V0200A_16A")
	private boolean v0200A_16A;
	@Column(name = "V0200A_16B")
	private boolean v0200A_16B;

	@Column(name = "V0200A_17A")
	private boolean v0200A_17A;
	@Column(name = "V0200A_17B")
	private boolean v0200A_17B;

	@Column(name = "V0200A_18A")
	private boolean v0200A_18A;
	@Column(name = "V0200A_18B")
	private boolean v0200A_18B;

	@Column(name = "V0200A_19A")
	private boolean v0200A_19A;
	@Column(name = "V0200A_19B")
	private boolean v0200A_19B;

	@Column(name = "V0200A_20A")
	private boolean v0200A_20A;
	@Column(name = "V0200A_20B")
	private boolean v0200A_20B;

	@Column(name = "V0200B")
	private Date v0200B;

	@Column(name = "V0200C")
	private Date v0200C;

	public int getSerial() {
		return serial;
	}

	public boolean isV0200A_01A() {
		return v0200A_01A;
	}

	public void setV0200A_01A(boolean v0200a_01a) {
		v0200A_01A = v0200a_01a;
	}

	public boolean isV0200A_01B() {
		return v0200A_01B;
	}

	public void setV0200A_01B(boolean v0200a_01b) {
		v0200A_01B = v0200a_01b;
	}

	public boolean isV0200A_02A() {
		return v0200A_02A;
	}

	public void setV0200A_02A(boolean v0200a_02a) {
		v0200A_02A = v0200a_02a;
	}

	public boolean isV0200A_02B() {
		return v0200A_02B;
	}

	public void setV0200A_02B(boolean v0200a_02b) {
		v0200A_02B = v0200a_02b;
	}

	public boolean isV0200A_03A() {
		return v0200A_03A;
	}

	public void setV0200A_03A(boolean v0200a_03a) {
		v0200A_03A = v0200a_03a;
	}

	public boolean isV0200A_03B() {
		return v0200A_03B;
	}

	public void setV0200A_03B(boolean v0200a_03b) {
		v0200A_03B = v0200a_03b;
	}

	public boolean isV0200A_04A() {
		return v0200A_04A;
	}

	public void setV0200A_04A(boolean v0200a_04a) {
		v0200A_04A = v0200a_04a;
	}

	public boolean isV0200A_04B() {
		return v0200A_04B;
	}

	public void setV0200A_04B(boolean v0200a_04b) {
		v0200A_04B = v0200a_04b;
	}

	public boolean isV0200A_05A() {
		return v0200A_05A;
	}

	public void setV0200A_05A(boolean v0200a_05a) {
		v0200A_05A = v0200a_05a;
	}

	public boolean isV0200A_05B() {
		return v0200A_05B;
	}

	public void setV0200A_05B(boolean v0200a_05b) {
		v0200A_05B = v0200a_05b;
	}

	public boolean isV0200A_06A() {
		return v0200A_06A;
	}

	public void setV0200A_06A(boolean v0200a_06a) {
		v0200A_06A = v0200a_06a;
	}

	public boolean isV0200A_06B() {
		return v0200A_06B;
	}

	public void setV0200A_06B(boolean v0200a_06b) {
		v0200A_06B = v0200a_06b;
	}

	public boolean isV0200A_07A() {
		return v0200A_07A;
	}

	public void setV0200A_07A(boolean v0200a_07a) {
		v0200A_07A = v0200a_07a;
	}

	public boolean isV0200A_07B() {
		return v0200A_07B;
	}

	public void setV0200A_07B(boolean v0200a_07b) {
		v0200A_07B = v0200a_07b;
	}

	public boolean isV0200A_08A() {
		return v0200A_08A;
	}

	public void setV0200A_08A(boolean v0200a_08a) {
		v0200A_08A = v0200a_08a;
	}

	public boolean isV0200A_08B() {
		return v0200A_08B;
	}

	public void setV0200A_08B(boolean v0200a_08b) {
		v0200A_08B = v0200a_08b;
	}

	public boolean isV0200A_09A() {
		return v0200A_09A;
	}

	public void setV0200A_09A(boolean v0200a_09a) {
		v0200A_09A = v0200a_09a;
	}

	public boolean isV0200A_09B() {
		return v0200A_09B;
	}

	public void setV0200A_09B(boolean v0200a_09b) {
		v0200A_09B = v0200a_09b;
	}

	public boolean isV0200A_10A() {
		return v0200A_10A;
	}

	public void setV0200A_10A(boolean v0200a_10a) {
		v0200A_10A = v0200a_10a;
	}

	public boolean isV0200A_10B() {
		return v0200A_10B;
	}

	public void setV0200A_10B(boolean v0200a_10b) {
		v0200A_10B = v0200a_10b;
	}

	public boolean isV0200A_11A() {
		return v0200A_11A;
	}

	public void setV0200A_11A(boolean v0200a_11a) {
		v0200A_11A = v0200a_11a;
	}

	public boolean isV0200A_11B() {
		return v0200A_11B;
	}

	public void setV0200A_11B(boolean v0200a_11b) {
		v0200A_11B = v0200a_11b;
	}

	public boolean isV0200A_12A() {
		return v0200A_12A;
	}

	public void setV0200A_12A(boolean v0200a_12a) {
		v0200A_12A = v0200a_12a;
	}

	public boolean isV0200A_12B() {
		return v0200A_12B;
	}

	public void setV0200A_12B(boolean v0200a_12b) {
		v0200A_12B = v0200a_12b;
	}

	public boolean isV0200A_13A() {
		return v0200A_13A;
	}

	public void setV0200A_13A(boolean v0200a_13a) {
		v0200A_13A = v0200a_13a;
	}

	public boolean isV0200A_13B() {
		return v0200A_13B;
	}

	public void setV0200A_13B(boolean v0200a_13b) {
		v0200A_13B = v0200a_13b;
	}

	public boolean isV0200A_14A() {
		return v0200A_14A;
	}

	public void setV0200A_14A(boolean v0200a_14a) {
		v0200A_14A = v0200a_14a;
	}

	public boolean isV0200A_14B() {
		return v0200A_14B;
	}

	public void setV0200A_14B(boolean v0200a_14b) {
		v0200A_14B = v0200a_14b;
	}

	public boolean isV0200A_15A() {
		return v0200A_15A;
	}

	public void setV0200A_15A(boolean v0200a_15a) {
		v0200A_15A = v0200a_15a;
	}

	public boolean isV0200A_15B() {
		return v0200A_15B;
	}

	public void setV0200A_15B(boolean v0200a_15b) {
		v0200A_15B = v0200a_15b;
	}

	public boolean isV0200A_16A() {
		return v0200A_16A;
	}

	public void setV0200A_16A(boolean v0200a_16a) {
		v0200A_16A = v0200a_16a;
	}

	public boolean isV0200A_16B() {
		return v0200A_16B;
	}

	public void setV0200A_16B(boolean v0200a_16b) {
		v0200A_16B = v0200a_16b;
	}

	public boolean isV0200A_17A() {
		return v0200A_17A;
	}

	public void setV0200A_17A(boolean v0200a_17a) {
		v0200A_17A = v0200a_17a;
	}

	public boolean isV0200A_17B() {
		return v0200A_17B;
	}

	public void setV0200A_17B(boolean v0200a_17b) {
		v0200A_17B = v0200a_17b;
	}

	public boolean isV0200A_18A() {
		return v0200A_18A;
	}

	public void setV0200A_18A(boolean v0200a_18a) {
		v0200A_18A = v0200a_18a;
	}

	public boolean isV0200A_18B() {
		return v0200A_18B;
	}

	public void setV0200A_18B(boolean v0200a_18b) {
		v0200A_18B = v0200a_18b;
	}

	public boolean isV0200A_19A() {
		return v0200A_19A;
	}

	public void setV0200A_19A(boolean v0200a_19a) {
		v0200A_19A = v0200a_19a;
	}

	public boolean isV0200A_19B() {
		return v0200A_19B;
	}

	public void setV0200A_19B(boolean v0200a_19b) {
		v0200A_19B = v0200a_19b;
	}

	public boolean isV0200A_20A() {
		return v0200A_20A;
	}

	public void setV0200A_20A(boolean v0200a_20a) {
		v0200A_20A = v0200a_20a;
	}

	public boolean isV0200A_20B() {
		return v0200A_20B;
	}

	public void setV0200A_20B(boolean v0200a_20b) {
		v0200A_20B = v0200a_20b;
	}

	public Date getV0200B() {
		return v0200B;
	}

	public void setV0200B(Date v0200b) {
		v0200B = v0200b;
	}

	public Date getV0200C() {
		return v0200C;
	}

	public void setV0200C(Date v0200c) {
		v0200C = v0200c;
	}

}
