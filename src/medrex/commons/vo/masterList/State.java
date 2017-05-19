package medrex.commons.vo.masterList;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "State")
public class State extends MasterList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8549968921415659018L;
}
