package medrex.client.utils.events;

import java.util.EventListener;

public interface LtcButtonListener extends EventListener {
	public void ltcButtonClicked(LtcButtonClickedEvent evt);
}
