package medrex.commons.vo.masterList;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Insurance")
public class Insurance extends MasterList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4015489648527036022L;
}
