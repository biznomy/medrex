package medrex.commons.vo.masterList;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Language")
public class Language extends MasterList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7873798815930994035L;
}
