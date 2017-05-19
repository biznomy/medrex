package medrex.commons.vo.masterList;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "DoctorTypes")
public class DoctorTypes extends MasterList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9059357655469902789L;
}
