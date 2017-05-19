package com.sX.swing.notes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;

import medrex.client.utils.SwingUtils;
import medrex.commons.vo.notes.Notes;

public class JxNotes extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4165925874107818069L;
	private static JFrame frame;
	private JButton button_1;
	private HTMLDocument document;
	private JEditorPane textPane = new JEditorPane();
	private JRootPane rootPane;
	private JScrollPane scrollPane;
	private Notes notes;
	private JxNotesEditor editor = null;
	private boolean editableNotes = true;
	// If true then categories list and label will display otherwise not.
	private boolean isCategories;

	/**
	 * @author Vinod Kumar
	 */
	public JxNotes(final boolean isCategories) {
		// notes = new Notes();
		this.isCategories = isCategories;
		setSize(124, 124);
		setPreferredSize(getSize());
		setLayout(new BorderLayout());

		rootPane = new JRootPane();
		super.add(rootPane);
		rootPane.getContentPane().setLayout(new BorderLayout());
		rootPane.setOpaque(false);

		scrollPane = new JScrollPane();
		scrollPane.getHorizontalScrollBar().addAdjustmentListener(
				new AdjustmentListener() {
					public void adjustmentValueChanged(AdjustmentEvent e) {
						doRelocate();
					}
				});
		scrollPane.getVerticalScrollBar().addAdjustmentListener(
				new AdjustmentListener() {
					public void adjustmentValueChanged(AdjustmentEvent e) {
						doRelocate();
					}
				});
		add(scrollPane, BorderLayout.CENTER);

		HTMLEditorKit editorKit = new HTMLEditorKit();
		document = (HTMLDocument) editorKit.createDefaultDocument();
		textPane = new JTextPane(document);
		textPane.setContentType("text/html");

		textPane.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				doRelocate();
			}
		});
		textPane.setBackground(Color.white);
		textPane.setEditable(false);
		scrollPane.setViewportView(textPane);

		rootPane.getLayeredPane().setVisible(true);

		button_1 = new JButton();
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				updateData();
				editor = new JxNotesEditor(notes, isCategories);
				editor.setSize(Toolkit.getDefaultToolkit().getScreenSize());
				editor.setTitle("JxNotesEditor");
				editor.setAlwaysOnTop(true);
				editor.setFocusable(true);
				editor.enable(true);
				editor.setVisible(true);
				editor.getFocusOwner().setFocusable(true);
				textPane.setText(notes.getNoteText());
			}
		});
		button_1.setText("+");
		button_1.setBounds(100, 100, 20, 20);
		rootPane.getLayeredPane().add(button_1, BorderLayout.PAGE_END);

		this.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				doRelocate();
			}
		});

	}

	public void setEditableNotes(boolean editableNotes) {
		button_1.setEnabled(editableNotes);
	}

	public String getTriggerWord() {
		String str = null;
		if (editor != null) {
			str = editor.getTriggerWord();
		}
		return str;
	}

	public void sendMail(String str) {
		editor.sendMail(str);
	}

	private void updateData() {
		this.setNotes(notes);
		notes.setNoteText(textPane.getText());

	}

	protected void doRelocate() {
		int w = getWidth();
		int h = getHeight();

		button_1.setLocation(w - button_1.getWidth() - 2, h
				- button_1.getHeight() - 2);
		if (scrollPane.getVerticalScrollBar() != null
				&& scrollPane.getVerticalScrollBar().isVisible()) {
			int adjW = scrollPane.getVerticalScrollBar().getWidth();
			button_1.setLocation(button_1.getX() - adjW, button_1.getY());
		}
		if (scrollPane.getHorizontalScrollBar() != null
				&& scrollPane.getHorizontalScrollBar().isVisible()) {
			int adjH = scrollPane.getHorizontalScrollBar().getHeight();
			button_1.setLocation(button_1.getX(), button_1.getY() - adjH);
		}
	}

	/*
	 * public static void main(String[] args) { try {
	 * UIManager.setLookAndFeel(new Plastic3DLookAndFeel()); } catch
	 * (UnsupportedLookAndFeelException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } frame = new JFrame("JxNotesEditor");
	 * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 * frame.setSize(620,500); frame.setContentPane(new JxNotes());
	 * frame.setVisible(true); }
	 */

	@Override
	public JRootPane getRootPane() {
		return rootPane;
	}

	public Container getContentPane() {
		return rootPane.getContentPane();
	}

	public Component getGlassPane() {
		return rootPane.getGlassPane();
	}

	protected JLayeredPane getLayeredPane() {
		return rootPane.getLayeredPane();
	}

	public void setContentPane(Container arg0) {
		rootPane.setContentPane(arg0);
	}

	public void setGlassPane(Component arg0) {
		rootPane.setGlassPane(arg0);
	}

	public void setLayeredPane(JLayeredPane arg0) {
		rootPane.setLayeredPane(arg0);
	}

	@Override
	protected void addImpl(Component comp, Object constraints, int index) {
		if (comp == rootPane) {
			super.addImpl(comp, constraints, index);
		} else {
			getContentPane().add(comp, constraints, index);
		}
	}

	@Override
	public Component add(Component comp, int index) {
		return rootPane.getContentPane().add(comp, index);
	}

	@Override
	public void add(Component comp, Object constraints, int index) {
		rootPane.getContentPane().add(comp, constraints, index);
	}

	@Override
	public void add(Component comp, Object constraints) {
		rootPane.getContentPane().add(comp, constraints);
	}

	@Override
	public Component add(Component comp) {
		return rootPane.getContentPane().add(comp);
	}

	@Override
	public Component add(String name, Component comp) {
		return rootPane.getContentPane().add(name, comp);
	}

	public Notes getNotes() {
		return notes;
	}

	public void setNotes(Notes notes) {
		this.notes = notes;
		if (this.notes != null) {
			textPane.setText(this.notes.getNoteText());
		} else {
			this.setNotes(new Notes());
		}
	}

	public static void main(String arg[]) {
		SwingUtils.wrapInDialog(new JxNotes(true)).setVisible(true);
	}
}
