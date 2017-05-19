package medrex.client.utils.controls;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import javax.swing.text.PlainDocument;

public class ComboDocument extends PlainDocument {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9173140139024394017L;

	public static enum EditorMode {
		AUTO_COMPLETE_IGNORE_INVALID, AUTO_COMPLETE_ALLOW_INVALID, AUTO_COMPLETE_ADD_INVALID;
	}

	JComboBox comboBox;
	ComboBoxModel model;
	JTextComponent editor;
	EditorMode mode;
	private Object currentItem;
	// flag to indicate if setSelectedItem has been called
	// subsequent calls to remove/insertString should be ignored
	boolean selecting = false;

	public ComboDocument(final JComboBox comboBox) {
		this.comboBox = comboBox;
		model = comboBox.getModel();
		editor = (JTextComponent) comboBox.getEditor().getEditorComponent();
		mode = EditorMode.AUTO_COMPLETE_IGNORE_INVALID;
		currentItem = null;
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!selecting)
					highlightCompletedText(0);
			}
		});
		editor.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					if (mode == EditorMode.AUTO_COMPLETE_ADD_INVALID) {
						comboBox.requestFocus();
					}
				}
				if (comboBox.isDisplayable())
					comboBox.setPopupVisible(true);
			}
		});
		editor.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(final FocusEvent e) {
				if (mode == EditorMode.AUTO_COMPLETE_ADD_INVALID) {
					if (currentItem != null) {
						comboBox.addItem(currentItem.toString());
						comboBox.setPopupVisible(false);
						comboBox.setSelectedItem(currentItem.toString());
						comboBox.repaint();
						comboBox.firePropertyChange("AddNew", comboBox
								.getItemCount() - 1, comboBox.getItemCount());
						currentItem = null;
					} else {
						comboBox.setSelectedIndex(0);
						comboBox.firePropertyChange("AddNull", comboBox
								.getItemCount() - 1, comboBox.getItemCount());
					}
				}
			}
		});
	}

	@Override
	public void remove(int offs, int len) throws BadLocationException {
		// return immediately when selecting an item
		if (selecting)
			return;
		super.remove(offs, len);
	}

	@Override
	public void insertString(int offs, String str, AttributeSet a)
			throws BadLocationException {
		// return immediately when selecting an item
		if (selecting)
			return;
		// insert the string into the document
		super.insertString(offs, str, a);
		// lookup and select a matching item
		Object item = lookupItem(getText(0, getLength()));
		if (item != null) {
			setSelectedItem(item);
		} else {
			if (mode == EditorMode.AUTO_COMPLETE_ALLOW_INVALID) {
				// allow new item if there is no match
				item = getText(0, getLength());
			} else if (mode == EditorMode.AUTO_COMPLETE_ADD_INVALID) {
				// allow new item if there is no match
				currentItem = item = getText(0, getLength());
			} else {
				// keep old item selected if there is no match
				item = comboBox.getSelectedItem();
				// imitate no insert (later on offs will be incremented by
				// str.length(): selection won't move forward)
				offs = offs - str.length();
				// provide feedback to the user that his input has been received
				// but can not be accepted
				comboBox.getToolkit().beep(); // when available use:
				// UIManager.getLookAndFeel().provideErrorFeedback(comboBox);
			}
		}
		setText(item.toString());
		// select the completed part
		highlightCompletedText(offs + str.length());
	}

	private void setText(String text) throws BadLocationException {
		// remove all text and insert the completed string
		super.remove(0, getLength());
		super.insertString(0, text, null);
	}

	private void highlightCompletedText(int start) {
		editor.setSelectionStart(start);
		editor.setSelectionEnd(getLength());
	}

	private void setSelectedItem(Object item) {
		selecting = true;
		model.setSelectedItem(item);
		selecting = false;
	}

	private Object lookupItem(String pattern) {
		Object selectedItem = model.getSelectedItem();
		// only search for a different item if the currently selected does not
		// match
		if (selectedItem != null
				&& startsWithIgnoreCase(selectedItem.toString(), pattern)) {
			return selectedItem;
		} else {
			// iterate over all items
			for (int i = 0, n = model.getSize(); i < n; i++) {
				Object currentItem = model.getElementAt(i);
				// current item starts with the pattern?
				if (startsWithIgnoreCase(currentItem.toString(), pattern)) {
					return currentItem;
				}
			}
		}
		// no item starts with the pattern => return null
		return null;
	}

	// checks if str1 starts with str2 - ignores case
	private boolean startsWithIgnoreCase(String str1, String str2) {
		return str1.toUpperCase().startsWith(str2.toUpperCase());
	}

	public EditorMode getMode() {
		return mode;
	}

	public void setMode(EditorMode mode) {
		this.mode = mode;
	}
}
