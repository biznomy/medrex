package com.sX.swing.notes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.commons.vo.admin.NotesCategories;
import medrex.commons.vo.medication.Templates;
import medrex.commons.vo.notes.Notes;

import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.htmlpad.JxHtmlPad;

public class JxNotesEditor11 extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1683842708390126288L;
	private static final Color DEF_COLOR = new Color(49, 104, 127);
	private JxHtmlPad templateNotes;
	private JList templatesList;
	private JList latestNotesList;
	private JxComboBox cmbCategories;
	private JxButton okButton;
	private JxButton cancelButton;
	private Notes notes = null;
	private List<Templates> temList = new ArrayList<Templates>();
	private List<Notes> notList = new ArrayList<Notes>();

	/**
	 * @author Vinod Kumar
	 */
	public JxNotesEditor11(Notes notes) {
		this.notes = notes;

		final JPanel defaultPanel = new JPanel();
		defaultPanel.setLayout(null);
		getContentPane().add(defaultPanel, BorderLayout.CENTER);
		defaultPanel.setBackground(Color.white);

		templateNotes = new JxHtmlPad();
		templateNotes.setBorder(new LineBorder(SystemColor.desktop, 1, false));
		templateNotes.setBounds(0, 0, 400, 540);
		defaultPanel.add(templateNotes);

		final JLabel templatesLabel = new JLabel();
		templatesLabel.setForeground(SystemColor.desktop);
		templatesLabel.setFont(new Font("", Font.BOLD, 12));
		templatesLabel.setText("Templates");
		templatesLabel.setBounds(480, 10, 66, 16);
		defaultPanel.add(templatesLabel);

		templatesList = new JList();
		templatesList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (e.getClickCount() == 2) {
					getTemplatesText();
				}
			}
		});
		templatesList.setForeground(SystemColor.desktop);
		templatesList.setFont(new Font("", Font.BOLD, 12));
		templatesList.setBorder(new LineBorder(SystemColor.desktop, 1, false));

		JScrollPane templatesScrollPane = new JScrollPane();
		templatesScrollPane.setBounds(420, 30, 220, 200);
		templatesScrollPane.setViewportView(templatesList);
		defaultPanel.add(templatesScrollPane);

		final JLabel categoriesLabel = new JLabel();
		categoriesLabel.setForeground(SystemColor.desktop);
		categoriesLabel.setFont(new Font("", Font.BOLD, 12));
		categoriesLabel.setText("Categories");
		categoriesLabel.setBounds(420, 245, 86, 16);
		defaultPanel.add(categoriesLabel);

		cmbCategories = new JxComboBox();
		cmbCategories.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent e) {
				doUpdateNotes();
			}
		});
		cmbCategories.setForeground(DEF_COLOR);
		cmbCategories.setFont(new Font("Tahoma", Font.BOLD, 11));
		cmbCategories.setArc(0.4f);
		cmbCategories.setBorder(new LineBorder(DEF_COLOR, 1, false));
		cmbCategories.setBackground(Color.WHITE);
		cmbCategories.setBounds(490, 245, 150, 25);
		defaultPanel.add(cmbCategories);

		final JLabel latestNotesLabel = new JLabel();
		latestNotesLabel.setForeground(SystemColor.desktop);
		latestNotesLabel.setFont(new Font("", Font.BOLD, 12));
		latestNotesLabel.setText("Latest Notes");
		latestNotesLabel.setBounds(480, 280, 86, 16);
		defaultPanel.add(latestNotesLabel);

		latestNotesList = new JList();
		latestNotesList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (e.getClickCount() == 2) {
					getResentNotesText();
				}
			}
		});
		latestNotesList.setForeground(SystemColor.desktop);
		latestNotesList.setFont(new Font("", Font.BOLD, 12));
		latestNotesList
				.setBorder(new LineBorder(SystemColor.desktop, 1, false));
		latestNotesList.setCellRenderer(new DefaultListCellRenderer() {
			@Override
			public Component getListCellRendererComponent(JList list,
					Object value, int index, boolean isSelected,
					boolean cellHasFocus) {
				final JLabel renderer = (JLabel) super
						.getListCellRendererComponent(list, value, index,
								isSelected, cellHasFocus);
				renderer.setHorizontalAlignment(SwingConstants.LEFT);
				if (value instanceof Notes) {
					Notes note = (Notes) value;
					String txtLabel = note.getNoteText();
					txtLabel = txtLabel.replaceAll("<(.)+>", "");
					txtLabel = txtLabel.replaceAll("\n", " ");
					txtLabel = txtLabel.replaceAll("( )+", " ");
					txtLabel = txtLabel.trim();
					renderer.setText(txtLabel);
				}
				return renderer;
			}
		});
		latestNotesList.setPreferredSize(new Dimension(200, 190));

		JScrollPane latestNotesScrollPane = new JScrollPane();
		latestNotesScrollPane.setBounds(420, 300, 220, 200);
		latestNotesScrollPane.setViewportView(latestNotesList);
		defaultPanel.add(latestNotesScrollPane);

		okButton = new JxButton();
		okButton.setForeground(DEF_COLOR);
		okButton.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		okButton.setFont(new Font("", Font.BOLD, 12));
		okButton.setBackground(Color.WHITE);
		okButton.setArc(0.4f);
		okButton.setText("Ok");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (doSave()) {
					dispose();
				}
			}
		});
		okButton.setBounds(440, 510, 85, 30);
		defaultPanel.add(okButton);

		cancelButton = new JxButton();
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				dispose();
			}
		});
		cancelButton.setForeground(DEF_COLOR);
		cancelButton.setBorder(new LineBorder(new Color(180, 188, 193), 1,
				false));
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setBackground(Color.WHITE);
		cancelButton.setArc(0.4f);
		cancelButton.setText("Cancel");
		cancelButton.setBounds(555, 510, 85, 30);
		defaultPanel.add(cancelButton);

		setModal(true);
		setAlwaysOnTop(true);

		updateData();
	}

	private void getResentNotesText() {
		List nList = getNotList();
		Iterator<Notes> it = nList.iterator();
		while (it.hasNext()) {
			Notes n = it.next();
			if ((latestNotesList.getSelectedValue() + "").equalsIgnoreCase(n
					.getNoteText())) {
				templateNotes.setFormattedText(n.getNoteText());
			}
		}
	}

	private void getTemplatesText() {
		List tList = null;
		tList = getTemList();
		Iterator<Templates> it = tList.iterator();
		while (it.hasNext()) {
			Templates t = it.next();
			if ((templatesList.getSelectedValue() + "").equalsIgnoreCase(t
					.getTemplateName())) {
				templateNotes.setFormattedText(t.getTemplateText());
			}
		}

	}

	private void updateData() {
		List<Templates> globalTempList = new ArrayList<Templates>();
		List<NotesCategories> notesCatList = new ArrayList<NotesCategories>();
		try {
			globalTempList = MedrexClientManager.getInstance().getTemplate(
					this.notes.getFormName());
			setTemList(globalTempList);
		} catch (Exception e) {
		}
		templatesList.setModel(new DefaultComboBoxModel(globalTempList
				.toArray()));

		try {
			notesCatList = MedrexClientManager.getInstance()
					.getNotesCategories(this.notes.getFormName());
			cmbCategories.removeAllItems();
			for (int i = 0; i < notesCatList.size(); i++) {
				NotesCategories nc = notesCatList.get(i);
				cmbCategories.addItem(nc);
			}

		} catch (Exception e) {
		}
		if (notes.getNotesCategories() != null) {
			cmbCategories.setSelectedItem(notes.getNotesCategories());
		}

		templateNotes.setFormattedText(notes.getNoteText());
	}

	private void doUpdateNotes() {
		List<Notes> latestNotes = new ArrayList<Notes>();
		new ArrayList<Notes>();
		try {
			latestNotes = MedrexClientManager.getInstance().getLatestNotes(
					this.notes.getFormName(), this.notes.getUserId(),
					(NotesCategories) cmbCategories.getSelectedItem());
			setNotList(latestNotes);
		} catch (Exception e) {
		}
		latestNotesList
				.setModel(new DefaultComboBoxModel(latestNotes.toArray()));

	}

	private boolean doSave() {
		if (cmbCategories.getSelectedItem() == null) {
			JOptionPane.showMessageDialog(this,
					"Please enter category, contact to admin.");
			return false;
		} else {
			notes.setNoteText(templateNotes.getFormattedText());
			// notes.setNotesCategories((NotesCategories)
			// cmbCategories.getSelectedItem());
			return true;
		}
	}

	public List<Templates> getTemList() {
		return temList;
	}

	public void setTemList(List<Templates> temList) {
		this.temList = temList;
	}

	public List<Notes> getNotList() {
		return notList;
	}

	public void setNotList(List<Notes> notList) {
		this.notList = notList;
	}
}
