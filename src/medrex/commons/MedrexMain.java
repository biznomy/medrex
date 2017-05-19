package medrex.commons;

import javax.swing.UIManager;

public class MedrexMain {

	public void generalInitializations() {
		try {

			UIManager
					.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
