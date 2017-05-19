package medrex.commons.vo.masterList;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Status")
public class Status extends MasterList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7113902103451681364L;
}
