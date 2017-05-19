package medrex.commons.vo.masterList;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "EmptyComboItem")
public class EmptyComboItem extends MasterList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -461461379707508621L;
}
