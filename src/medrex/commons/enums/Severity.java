package medrex.commons.enums;

import java.awt.Color;
import java.io.Serializable;

public enum Severity implements Serializable {
	NONE(Color.GRAY), NORMAL(Color.BLACK), WARNING(Color.ORANGE), ERROR(
			Color.RED), EXCEPTION(Color.RED), REDHIGHLIGHT(Color.RED), EVERGREEN(
			new Color(34, 139, 34));

	private Color color;

	private Severity(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return this.color;
	}
}
