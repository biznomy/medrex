package medrex.client.mds3.general;

public interface Form {
	/**
	 * doLoad: to prepare the form before presenting it,
	 */
	public void doLoad();

	/**
	 * doSave: to save the data of the form
	 */
	public int doSave();

	/**
	 * doUpdate: to load the form
	 */
	public void doUpdate();

	/**
	 * doValidate: to validate the form before saving
	 */
	public boolean doValidate();
}
