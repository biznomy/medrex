package medrex.commons.vo.masterList;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "MaritalStatus")
public class MaritalStatus extends MasterList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1855942271282835266L;
}
