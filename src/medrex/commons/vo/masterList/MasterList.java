package medrex.commons.vo.masterList;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "mType", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("Master")
public class MasterList implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6674466187313613550L;

	@Id
	@GeneratedValue
	@Column(name = "masterId")
	private int id;

	@Column(name = "msterName")
	private String msterName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMsterName() {
		return msterName;
	}

	public void setMsterName(String msterName) {
		this.msterName = msterName;
	}

	@Override
	public String toString() {
		return getMsterName();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MasterList) {
			MasterList mList = (MasterList) obj;
			if (this.getId() == mList.getId()
					&& this.getMsterName().equals(mList.getMsterName())) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}
