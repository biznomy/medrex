package medrex.commons.vo.masterList;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Sex")
public class Sex extends MasterList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 70951549273170832L;
}
