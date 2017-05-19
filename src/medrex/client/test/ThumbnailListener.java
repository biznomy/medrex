package medrex.client.test;

import java.awt.event.MouseEvent;
import java.util.EventListener;

public interface ThumbnailListener extends EventListener {
	void thumbnailClicked(int index, MouseEvent e);

	void thumbnailDoubleClicked(int index, MouseEvent e);

	void thumbnailMouseOver(int index, MouseEvent e);

	void thumbnailMouseOut(int index, MouseEvent e);
}