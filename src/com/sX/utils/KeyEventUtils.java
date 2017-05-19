package com.sX.utils;

import java.awt.event.KeyEvent;

public final class KeyEventUtils {
	public static boolean isPrintable(KeyEvent e) {
		if (e != null) {
			return isPrintable(e.getKeyCode());
		} else {
			return false;
		}
	}

	public static boolean isPrintable(int keyCode) {
		if (isAlphaNumeric(keyCode) || isSpecialChar(keyCode)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isAlphaNumeric(KeyEvent e) {
		if (e != null) {
			return isAlphaNumeric(e.getKeyCode());
		} else {
			return false;
		}
	}

	public static boolean isAlphaNumeric(int keyCode) {
		if (isAlphabet(keyCode) || isNumeric(keyCode)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isAlphabet(KeyEvent e) {
		if (e != null) {
			return isAlphabet(e.getKeyCode());
		} else {
			return false;
		}
	}

	public static boolean isAlphabet(int keyCode) {
		switch (keyCode) {
		case KeyEvent.VK_A:
		case KeyEvent.VK_B:
		case KeyEvent.VK_C:
		case KeyEvent.VK_D:
		case KeyEvent.VK_E:
		case KeyEvent.VK_F:
		case KeyEvent.VK_G:
		case KeyEvent.VK_H:
		case KeyEvent.VK_I:
		case KeyEvent.VK_J:
		case KeyEvent.VK_K:
		case KeyEvent.VK_L:
		case KeyEvent.VK_M:
		case KeyEvent.VK_N:
		case KeyEvent.VK_O:
		case KeyEvent.VK_P:
		case KeyEvent.VK_Q:
		case KeyEvent.VK_R:
		case KeyEvent.VK_S:
		case KeyEvent.VK_T:
		case KeyEvent.VK_U:
		case KeyEvent.VK_V:
		case KeyEvent.VK_W:
		case KeyEvent.VK_X:
		case KeyEvent.VK_Y:
		case KeyEvent.VK_Z:
			return true;
		default:
			return false;
		}
	}

	public static boolean isSpecialChar(KeyEvent e) {
		if (e != null) {
			return isSpecialChar(e.getKeyCode());
		} else {
			return false;
		}
	}

	public static boolean isSpecialChar(int keyCode) {
		switch (keyCode) {
		case KeyEvent.VK_AMPERSAND:
		case KeyEvent.VK_ASTERISK:
		case KeyEvent.VK_AT:
		case KeyEvent.VK_BACK_QUOTE:
		case KeyEvent.VK_BACK_SLASH:
		case KeyEvent.VK_BRACELEFT:
		case KeyEvent.VK_BRACERIGHT:
		case KeyEvent.VK_CIRCUMFLEX:
		case KeyEvent.VK_CLOSE_BRACKET:
		case KeyEvent.VK_COLON:
		case KeyEvent.VK_COMMA:
		case KeyEvent.VK_DECIMAL:
		case KeyEvent.VK_DIVIDE:
		case KeyEvent.VK_DOLLAR:
		case KeyEvent.VK_EQUALS:
		case KeyEvent.VK_EURO_SIGN:
		case KeyEvent.VK_EXCLAMATION_MARK:
		case KeyEvent.VK_LEFT_PARENTHESIS:
		case KeyEvent.VK_MINUS:
		case KeyEvent.VK_NUMBER_SIGN:
		case KeyEvent.VK_OPEN_BRACKET:
		case KeyEvent.VK_PERIOD:
		case KeyEvent.VK_PLUS:
		case KeyEvent.VK_QUOTE:
		case KeyEvent.VK_QUOTEDBL:
		case KeyEvent.VK_RIGHT_PARENTHESIS:
		case KeyEvent.VK_SEMICOLON:
		case KeyEvent.VK_SLASH:
		case KeyEvent.VK_UNDERSCORE:
			return true;
		default:
			return false;
		}
	}

	public static boolean isNumeric(KeyEvent e) {
		if (e != null) {
			return isNumeric(e.getKeyCode());
		} else {
			return false;
		}
	}

	public static boolean isNumeric(int keyCode) {
		switch (keyCode) {
		case KeyEvent.VK_0:
		case KeyEvent.VK_1:
		case KeyEvent.VK_2:
		case KeyEvent.VK_3:
		case KeyEvent.VK_4:
		case KeyEvent.VK_5:
		case KeyEvent.VK_6:
		case KeyEvent.VK_7:
		case KeyEvent.VK_8:
		case KeyEvent.VK_9:
			return true;
		default:
			return false;
		}
	}
}
