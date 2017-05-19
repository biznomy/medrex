package medrex.commons.vo.masterList;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Religion")
public class Religion extends MasterList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -496198917762049900L;
}
