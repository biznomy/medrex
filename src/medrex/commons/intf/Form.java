package medrex.commons.intf;

import java.io.Serializable;

public interface Form extends Serializable {
	/**
	 * doLoad: to prepare the form before presenting it,
	 */
	public void doLoad();

	/**
	 * doSave: to save the data of the form
	 */
	public int doSave();

	/**
	 * doUpdate: to load the form in sync state with the dataBase. or doUpdate:
	 * can also be used to load a form after presenting a form with a pre-loader
	 * in a multi-threading environment.
	 */
	public void doUpdate();

	/**
	 * doValidate: to validate the form before saving
	 */
	public boolean doValidate();
}
