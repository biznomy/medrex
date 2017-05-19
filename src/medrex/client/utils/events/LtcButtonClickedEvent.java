package medrex.client.utils.events;

import java.util.EventObject;

public class LtcButtonClickedEvent extends EventObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5177113034214425511L;
	public int val;
	public int level;

	public LtcButtonClickedEvent(Object source, int val, int level) {
		super(source);
		this.val = val;
		this.level = level;
	}

}
