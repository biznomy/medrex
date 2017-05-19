package medrex.commons.vo.masterList;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Origin")
public class Origin extends MasterList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7766639728917100739L;
}
