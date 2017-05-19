package medrex.commons.vo.masterList;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "ProviderTypes")
public class ProviderTypes extends MasterList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8952179641328730444L;
}
