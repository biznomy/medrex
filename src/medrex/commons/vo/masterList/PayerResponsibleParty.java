package medrex.commons.vo.masterList;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "ResponsibleParty")
public class PayerResponsibleParty extends MasterList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8139231680205959773L;
}
