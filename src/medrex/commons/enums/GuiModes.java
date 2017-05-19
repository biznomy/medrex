package medrex.commons.enums;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JComponent;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public enum GuiModes {
	DESIGNER_SCREEN(Color.WHITE, new Color(24, 86, 110), new Font("Dialog",
			Font.PLAIN, 12), new Color(8, 68, 95), new Color(130, 163, 175),
			new LineBorder(new Color(8, 68, 95), 1, false), new Font("Dialog",
					Font.BOLD, 12)),

	DESIGNER_FORMS(new Color(24, 86, 110), Color.WHITE, new Font("Dialog",
			Font.PLAIN, 12), new Color(49, 104, 127), Color.WHITE,
			new LineBorder(new Color(180, 188, 193), 1, false), new Font(
					"Dialog", Font.BOLD, 12)),

	TOUCH_SCREEN(Color.BLACK, new Color(176, 224, 230), new Font("Dialog",
			Font.BOLD, 48), Color.BLACK, Color.WHITE, new LineBorder(
			Color.BLUE, 5, false), new Font("Dialog", Font.BOLD, 18)),

	NORM_SCREEN(Color.BLACK, null, new Font("Dialog", Font.BOLD, 18),
			Color.BLACK, Color.WHITE, null, new Font("Dialog", Font.PLAIN, 11)),

	CHANGE_SCREEN(new Color(8, 68, 95), new Color(231, 239, 242), new Font(
			"Dialog", Font.PLAIN, 18), new Color(8, 68, 95), Color.WHITE,
			new LineBorder(new Color(8, 68, 95), 2, false), new Font("Dialog",
					Font.PLAIN, 18));
	// panels
	private Color defaultForegroundColor;
	private Color defaultBackgroundColor;
	private Font defaultFont;

	// control
	private Color controlForegroundColor;
	private Color controlBackgroundColor;
	private Border controlBorder;
	private Font controlFont;

	// static varibles
	public static final Border DEFAULT_NORM_COM_BORDER = new LineBorder(
			SystemColor.controlDkShadow, 1, false);

	// constructors
	private GuiModes() {
	}

	private GuiModes(Color defaultForegroundColor,
			Color defaultBackgroundColor, Font defaultFont,
			Color controlForegroundColor, Color controlBackgroundColor,
			Border controlBorder, Font controlFont) {
		this.defaultForegroundColor = defaultForegroundColor;
		this.defaultBackgroundColor = defaultBackgroundColor;
		this.defaultFont = defaultFont;
		this.controlForegroundColor = controlForegroundColor;
		this.controlBackgroundColor = controlBackgroundColor;
		this.controlBorder = controlBorder;
		this.controlFont = controlFont;
	}

	// custom methods
	public void applyGui(JComponent com) {
		if (com != null) {
			com.setFont(this.controlFont);
			com.setBorder(((this.controlBorder != null) ? this.controlBorder
					: DEFAULT_NORM_COM_BORDER));
			com.setBackground(this.controlBackgroundColor);
			com.setForeground(this.controlForegroundColor);
		}
	}

	// getters and setters
	public Color getControlBackgroundColor() {
		return controlBackgroundColor;
	}

	public void setControlBackgroundColor(Color controlBackgroundColor) {
		this.controlBackgroundColor = controlBackgroundColor;
	}

	public Border getControlBorder() {
		return controlBorder;
	}

	public void setControlBorder(Border controlBorder) {
		this.controlBorder = controlBorder;
	}

	public Font getControlFont() {
		return controlFont;
	}

	public void setControlFont(Font controlFont) {
		this.controlFont = controlFont;
	}

	public Color getControlForegroundColor() {
		return controlForegroundColor;
	}

	public void setControlForegroundColor(Color controlForegroundColor) {
		this.controlForegroundColor = controlForegroundColor;
	}

	public Color getDefaultBackgroundColor() {
		return defaultBackgroundColor;
	}

	public void setDefaultBackgroundColor(Color defaultBackgroundColor) {
		this.defaultBackgroundColor = defaultBackgroundColor;
	}

	public Font getDefaultFont() {
		return defaultFont;
	}

	public void setDefaultFont(Font defaultFont) {
		this.defaultFont = defaultFont;
	}

	public Color getDefaultForegroundColor() {
		return defaultForegroundColor;
	}

	public void setDefaultForegroundColor(Color defaultForegroundColor) {
		this.defaultForegroundColor = defaultForegroundColor;
	}

}
