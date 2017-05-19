package com.sX.swing.htmlpad;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;


//import com.inet.jortho.FileUserDictionary;
//import com.inet.jortho.SpellChecker;

//import com.swtdesigner.SwingResourceManager;

/**
 * @author D S Naruka
 */
public class JxHtmlPad extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7810688622267163461L;
	private HTMLDocument document;
	private JEditorPane textPane = new JEditorPane();

	/** Listener for the edits on the current document. */
	protected UndoableEditListener undoHandler = new UndoHandler();

	/** UndoManager that we add edits to. */
	protected UndoManager undo = new UndoManager();

	private UndoAction undoAction = new UndoAction();
	private RedoAction redoAction = new RedoAction();

	private Action cutAction = new DefaultEditorKit.CutAction();
	private Action copyAction = new DefaultEditorKit.CopyAction();
	private Action pasteAction = new DefaultEditorKit.PasteAction();

	private Action boldAction = new StyledEditorKit.BoldAction();
	private Action underlineAction = new StyledEditorKit.UnderlineAction();
	private Action italicAction = new StyledEditorKit.ItalicAction();

	private Action insertBreakAction = new DefaultEditorKit.InsertBreakAction();
	private HTMLEditorKit.InsertHTMLTextAction unorderedListAction = new HTMLEditorKit.InsertHTMLTextAction(
			"Bullets", "<li> </li>", HTML.Tag.UL, HTML.Tag.LI, HTML.Tag.BODY,
			HTML.Tag.UL);

	
	// private HTMLEditorKit.InsertHTMLTextAction bulletAction
	// = new HTMLEditorKit.InsertHTMLTextAction("Bullets",
	// "<li> </li>",HTML.Tag.UL,HTML.Tag.LI);

	/* inner class for actions */
	class SubscriptAction extends StyledEditorKit.StyledTextAction {

		public SubscriptAction() {
			super(StyleConstants.Subscript.toString());
		}

		public void actionPerformed(ActionEvent ae) {
			JEditorPane editor = getEditor(ae);
			if (editor != null) {
				StyledEditorKit kit = getStyledEditorKit(editor);
				MutableAttributeSet attr = kit.getInputAttributes();
				boolean subscript = (StyleConstants.isSubscript(attr)) ? false
						: true;
				SimpleAttributeSet sas = new SimpleAttributeSet();
				StyleConstants.setSubscript(sas, subscript);
				setCharacterAttributes(editor, sas, false);
			}
		}
	}

	class SuperscriptAction extends StyledEditorKit.StyledTextAction {

		public SuperscriptAction() {
			super(StyleConstants.Superscript.toString());
		}

		public void actionPerformed(ActionEvent ae) {
			JEditorPane editor = getEditor(ae);
			if (editor != null) {
				StyledEditorKit kit = getStyledEditorKit(editor);
				MutableAttributeSet attr = kit.getInputAttributes();
				boolean superscript = (StyleConstants.isSuperscript(attr)) ? false
						: true;
				SimpleAttributeSet sas = new SimpleAttributeSet();
				StyleConstants.setSuperscript(sas, superscript);
				setCharacterAttributes(editor, sas, false);
			}
		}
	}

	class StrikeThroughAction extends StyledEditorKit.StyledTextAction {

		public StrikeThroughAction() {
			super(StyleConstants.StrikeThrough.toString());
		}

		public void actionPerformed(ActionEvent ae) {
			JEditorPane editor = getEditor(ae);
			if (editor != null) {
				StyledEditorKit kit = getStyledEditorKit(editor);
				MutableAttributeSet attr = kit.getInputAttributes();
				boolean strikeThrough = (StyleConstants.isStrikeThrough(attr)) ? false
						: true;
				SimpleAttributeSet sas = new SimpleAttributeSet();
				StyleConstants.setStrikeThrough(sas, strikeThrough);
				setCharacterAttributes(editor, sas, false);
			}
		}
	}

	class FontChooserAction extends StyledEditorKit.StyledTextAction {
		public FontChooserAction() {
			super(StyleConstants.FontFamily.toString());
		}

		public void actionPerformed(ActionEvent ae) {
			JEditorPane editor = getEditor(ae);
			if (editor != null) {
				StyledEditorKit kit = getStyledEditorKit(editor);
				MutableAttributeSet attr = kit.getInputAttributes();
				// SimpleAttributeSet sas = new SimpleAttributeSet();

				JFontChooser fontChooser = new JFontChooser(null, true,
						textPane.getFont());
				fontChooser.showFontDialog();
				Font font = fontChooser.getSelectedFont();
				Color color = fontChooser.getSelectedColor();
				if (font != null) {
					StyleConstants.setFontFamily(attr, font.getFamily());
					StyleConstants.setFontSize(attr, font.getSize());

					switch (font.getStyle()) {
					case Font.BOLD + Font.ITALIC:
						StyleConstants.setBold(attr, true);
						StyleConstants.setItalic(attr, true);
						break;
					case Font.BOLD:
						StyleConstants.setBold(attr, true);
						break;
					case Font.ITALIC:
						StyleConstants.setItalic(attr, true);
						break;
					case Font.PLAIN:
						StyleConstants.setBold(attr, false);
						StyleConstants.setItalic(attr, false);

						break;
					}
				}
				if (color != null) {
					StyleConstants.setForeground(attr, color);
				}
				setCharacterAttributes(editor, attr, false);
			}
		}
	}

	class HTMLFileFilter extends javax.swing.filechooser.FileFilter {

		@Override
		public boolean accept(File f) {
			return ((f.isDirectory()) || (f.getName().toLowerCase().indexOf(
					".htm") > 0));
		}

		@Override
		public String getDescription() {
			return "html";
		}
	}

	class UndoHandler implements UndoableEditListener {

		/**
		 * Messaged when the Document has created an edit, the edit is added to
		 * <code>undo</code>, an instance of UndoManager.
		 */
		public void undoableEditHappened(UndoableEditEvent e) {
			undo.addEdit(e.getEdit());
			undoAction.update();
			redoAction.update();
		}
	}

	class UndoAction extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 4293224358148590760L;

		public UndoAction() {
			super("Undo");
			setEnabled(false);
		}

		public void actionPerformed(ActionEvent e) {
			try {
				undo.undo();
			} catch (CannotUndoException ex) {
				System.out.println("Unable to undo: " + ex);
				ex.printStackTrace();
			}
			update();
			redoAction.update();
		}

		protected void update() {
			if (undo.canUndo()) {
				setEnabled(true);
				putValue(Action.NAME, undo.getUndoPresentationName());
			} else {
				setEnabled(false);
				putValue(Action.NAME, "Undo");
			}
		}
	}

	class RedoAction extends AbstractAction {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1049241490593106134L;

		public RedoAction() {
			super("Redo");
			setEnabled(false);
		}

		public void actionPerformed(ActionEvent e) {
			try {
				undo.redo();
			} catch (CannotRedoException ex) {
				System.err.println("Unable to redo: " + ex);
				ex.printStackTrace();
			}
			update();
			undoAction.update();
		}

		protected void update() {
			if (undo.canRedo()) {
				setEnabled(true);
				putValue(Action.NAME, undo.getRedoPresentationName());
			} else {
				setEnabled(false);
				putValue(Action.NAME, "Redo");
			}
		}
	}

	public JxHtmlPad() {
		HTMLEditorKit editorKit = new HTMLEditorKit();
		document = (HTMLDocument) editorKit.createDefaultDocument();

		setLayout(new BorderLayout());
		final JPanel contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		add(contentPane, BorderLayout.CENTER);

		JToolBar editorControlPanel = new JToolBar();
		editorControlPanel.setBackground(Color.WHITE);
		JToolBar alignPanel = new JToolBar();
		alignPanel.setBackground(Color.WHITE);

		/* JButtons */
		JButton cutButton = new JButton(cutAction);
		cutButton.setBorder(new EmptyBorder(0, 0, 0, 0));
		cutButton.setMinimumSize(new Dimension(0, 0));
		cutButton.setPreferredSize(new Dimension(100, 0));
		cutButton.setIcon(new ImageIcon("img/icons/Cut.png"));
		cutButton.setFocusPainted(false);

		JButton copyButton = new JButton(copyAction);
		copyButton.setBorder(new EmptyBorder(0, 0, 0, 0));
		copyButton.setIcon(new ImageIcon("img/icons/Copy.png"));
		copyButton.setFocusPainted(false);

		JButton pasteButton = new JButton(pasteAction);
		pasteButton.setBorder(new EmptyBorder(0, 0, 0, 0));
		pasteButton.setIcon(new ImageIcon("img/icons/Paste.png"));
		pasteButton.setFocusPainted(false);

		JButton boldButton = new JButton(boldAction);
		boldButton.setBorder(new EmptyBorder(0, 0, 0, 0));
		boldButton.setIcon(new ImageIcon("img/icons/bold.PNG"));
		boldButton.setFocusPainted(false);

		JButton italicButton = new JButton(italicAction);
		italicButton.setBorder(new EmptyBorder(0, 0, 0, 0));
		italicButton.setIcon(new ImageIcon("img/icons/italic.PNG"));
		italicButton.setFocusPainted(false);

		cutButton.setText("");
		copyButton.setText("");
		pasteButton.setText("");

		boldButton.setText("");
		italicButton.setText("");

		editorControlPanel.add(cutButton);
		editorControlPanel.addSeparator();
		editorControlPanel.add(copyButton);
		editorControlPanel.addSeparator();
		editorControlPanel.add(pasteButton);
		editorControlPanel.addSeparator();
		editorControlPanel.add(boldButton);
		editorControlPanel.addSeparator();
		editorControlPanel.add(italicButton);

		JButton subscriptButton = new JButton(new SubscriptAction());
		JButton superscriptButton = new JButton(new SuperscriptAction());
		JButton strikeThroughButton = new JButton(new StrikeThroughAction());

		subscriptButton.setText("Subscript");
		superscriptButton.setText("Superscript");
		strikeThroughButton.setText("StrikeThrough");

		subscriptButton.setIcon(new ImageIcon("subscript.gif"));
		superscriptButton.setIcon(new ImageIcon("superscript.gif"));
		strikeThroughButton.setIcon(new ImageIcon("strikethough.gif"));

		JToolBar specialPanel = new JToolBar();

		specialPanel.add(subscriptButton);
		specialPanel.add(superscriptButton);
		specialPanel.add(strikeThroughButton);

		JButton leftAlignButton = new JButton(
				new StyledEditorKit.AlignmentAction("Left Align",
						StyleConstants.ALIGN_LEFT));
		leftAlignButton.setBackground(Color.WHITE);

		JButton centerButton = new JButton(new StyledEditorKit.AlignmentAction(
				"Center", StyleConstants.ALIGN_CENTER));
		centerButton.setBackground(Color.WHITE);

		JButton rightAlignButton = new JButton(
				new StyledEditorKit.AlignmentAction("Right Align",
						StyleConstants.ALIGN_RIGHT));
		rightAlignButton.setBackground(Color.WHITE);
		JButton colorButton = new JButton(new StyledEditorKit.AlignmentAction(
				"Right Align", StyleConstants.ALIGN_RIGHT));

		colorButton.setIcon(new ImageIcon("color.gif"));

		leftAlignButton.setText("Left Align");
		centerButton.setText("Center");
		rightAlignButton.setText("Right Align");

		alignPanel.add(leftAlignButton);
		alignPanel.addSeparator();
		alignPanel.add(centerButton);
		alignPanel.addSeparator();
		alignPanel.add(rightAlignButton);
		alignPanel.addSeparator();

		textPane = new JTextPane(document);
		textPane.setPreferredSize(new Dimension(0, 0));
		textPane.setContentType("text/html");
		document.addUndoableEditListener(undoHandler);
		resetUndoManager();

		// // Create user dictionary in the current working directory of your
		// application
		// SpellChecker.setUserDictionaryProvider( new FileUserDictionary() );
		//        
		// // Load the configuration from the file dictionaries.cnf and
		// // use the current locale or the first language as default
		// try {
		// SpellChecker.registerDictionaries( new URL("file", null, "./"), null
		// );
		// } catch (MalformedURLException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// // enable the spell checking on the text component with all features
		// SpellChecker.register( textPane );

		JScrollPane scrollPane = new JScrollPane(textPane);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension scrollPaneSize = new Dimension(5 * screenSize.width / 8,
				5 * screenSize.height / 8);
		scrollPane.setPreferredSize(scrollPaneSize);

		JPanel toolPanel = new JPanel();
		toolPanel.setLayout(new GridLayout(0, 1));
		toolPanel.add(editorControlPanel);

		editorControlPanel.addSeparator();

		JButton underlineButton = new JButton(underlineAction);
		underlineButton.setBorder(new EmptyBorder(0, 0, 0, 0));
		underlineButton.setIcon(new ImageIcon("img/icons/underline.PNG"));
		underlineButton.setText("");
		underlineButton.setFocusPainted(false);
		editorControlPanel.add(underlineButton);

		JButton bulletsButton = new JButton(unorderedListAction);
		bulletsButton.setBorder(new EmptyBorder(0, 0, 0, 0));
		bulletsButton.setIcon(new ImageIcon("img/icons/bullet.PNG"));
		bulletsButton.setText("");
		bulletsButton.setFocusPainted(false);
		editorControlPanel.addSeparator();
		editorControlPanel.add(bulletsButton);

		JButton fontChooser = new JButton(new FontChooserAction());
		fontChooser.setBorder(new EmptyBorder(0, 0, 0, 0));
		fontChooser.setIcon(new ImageIcon("img/icons/font.PNG"));
		fontChooser.setFocusPainted(false);
		editorControlPanel.addSeparator();
		editorControlPanel.add(fontChooser);
		fontChooser.setText("");
		// toolPanel.add(specialPanel);
		toolPanel.add(alignPanel);

		final JButton checkSpellingButton = new JButton();
		checkSpellingButton.setBackground(Color.WHITE);
		checkSpellingButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (e.getSource() == checkSpellingButton) {
					// run RapidSpell
				}

			}
		});
		checkSpellingButton.setText("Check Spelling");
		alignPanel.add(checkSpellingButton);

		// final JButton printToConsoleButton = new JButton();
		// alignPanel.add(printToConsoleButton);
		// printToConsoleButton.addActionListener(new ActionListener() {
		// public void actionPerformed(final ActionEvent arg0) {
		// System.out.println("Formatted:" + JxHtmlPad.this.getFormattedText());
		// System.out.println("\nPlain:" + JxHtmlPad.this.getText());
		// }
		// });
		// printToConsoleButton.setText("Print to Console");
		contentPane.add(toolPanel, BorderLayout.NORTH);
		contentPane.add(scrollPane, BorderLayout.CENTER);
	}

	protected void resetUndoManager() {
		undo.discardAllEdits();
		undoAction.update();
		redoAction.update();
	}

	public void selectAll() {
		textPane.selectAll();
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Test JxHtmlPad");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(753, 497);

		frame.setContentPane(new JxHtmlPad());
		frame.setVisible(true);
	}

	public String getFormattedText() {
		return textPane.getText();
	}

	public void setFormattedText(String text) {
		textPane.setText(text);
	}

	public String getText() {
		String txt = getFormattedText();
		txt = txt.replaceAll("<{1}[--0-9a-z\"/:= ]+>{1}", "");
		txt = txt.replaceAll("[\t ]+", " ");
		txt = txt.replaceAll("\n([ ])+", "\n");
		txt = txt.replaceAll("(\n)+", "\n");
		return txt;
	}
}
