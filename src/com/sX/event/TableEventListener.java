package com.sX.event;

import java.awt.event.MouseEvent;
import java.util.EventListener;

public interface TableEventListener extends EventListener {
	public void mouseClick(int row, int column, MouseEvent event);
}
