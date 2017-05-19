package medrex.commons.vo.masterList;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "PhoneType")
public class PhoneType extends MasterList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5605324777554913404L;
}
