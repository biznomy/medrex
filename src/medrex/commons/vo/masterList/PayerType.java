package medrex.commons.vo.masterList;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "PayerType")
public class PayerType extends MasterList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4367716771227413572L;
}
