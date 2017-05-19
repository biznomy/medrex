/**
 * 
 */
package medrex.client.utils.events;

/**
 * @author D S Naruka
 */
public class ViewEvent {

	public static final int NEW = 1;
	public static final int SAVE = 2;
	public static final int LOAD = 3;
	public static final int DELETE = 4;

	private int action;
	private Object[] parameters;

	public ViewEvent(int action, Object... param) {
		this.action = action;
		this.parameters = param;
	}

	public int getAction() {
		return action;
	}

	public Object[] getParameters() {
		return parameters;
	}
}
