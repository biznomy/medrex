package com.sX.swing;

import java.awt.BorderLayout;

import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;

import medrex.commons.vo.notes.Notes;

import com.sX.swing.notes.JxNotesEditor;

public class JxTextArea extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5326008709735375917L;
	private Notes notes;// = new Notes();
	private JEditorPane textPane = new JEditorPane();
	private Border $__border;
	private JxNotesEditor editor;
	private JRootPane rootPane;
	private JScrollPane scrollPane;
	private HTMLDocument document;

	public JxTextArea() {
		super();
		setLayout(new BorderLayout());

		// rootPane = new JRootPane();
		// super.add(rootPane);
		// rootPane.getContentPane().setLayout(new BorderLayout());
		// rootPane.setOpaque(false);

		notes = new Notes();
		scrollPane = new JScrollPane();
		// scrollPane.setBounds(0, 0, getWidth() - getHeight(), getHeight());
		add(scrollPane, BorderLayout.CENTER);

		HTMLEditorKit editorKit = new HTMLEditorKit();
		document = (HTMLDocument) editorKit.createDefaultDocument();

		textPane = new JTextPane(document);
		textPane.setContentType("text/html");
		// textPane.setBounds(0, 0, getWidth() - getHeight(), getHeight());
		textPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		// this.add(textPane, BorderLayout.CENTER);
		scrollPane.setViewportView(textPane);

		setBackground(getBackground());
		setForeground(getForeground());
		setBorder($__border);
		setFont(getFont());

		updateData();

	}

	private void updateData() {
		notes.setNoteText(textPane.getText());
	}

	public void setNotes(Notes note) {
		this.notes = note;
		if (this.notes != null) {
			textPane.setText(this.notes.getNoteText());
		} else {
			this.setNotes(new Notes());
		}
	}

	public Notes getNotes() {
		return notes;
	}

	public String getText() {
		return textPane.getText();
	}

	public void setEditable(boolean bool) {
		if (bool = true) {
			textPane.setEditable(false);
		} else {
			textPane.setEditable(true);
		}
	}
}
