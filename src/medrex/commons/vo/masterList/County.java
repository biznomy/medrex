package medrex.commons.vo.masterList;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "County")
public class County extends MasterList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 339371464906612881L;
}
