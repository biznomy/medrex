package medrex.commons.vo.masterList;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "MedicareDays")
public class MedicareDays extends MasterList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5280175353150061430L;
}
