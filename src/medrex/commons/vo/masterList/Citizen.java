package medrex.commons.vo.masterList;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Citizen")
public class Citizen extends MasterList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5409747844463812900L;
}
