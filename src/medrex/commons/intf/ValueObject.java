package medrex.commons.intf;

import java.io.Serializable;

public interface ValueObject extends Serializable {
	int getSerial();

	void setSerial(int serial);
}
