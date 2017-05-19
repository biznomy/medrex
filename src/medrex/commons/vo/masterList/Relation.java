package medrex.commons.vo.masterList;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Relation")
public class Relation extends MasterList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6346530943046556910L;
}
