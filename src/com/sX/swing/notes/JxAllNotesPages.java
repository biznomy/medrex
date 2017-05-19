package com.sX.swing.notes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.JTableHeader;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.notes.Notes;
import medrex.commons.vo.others.Users;

import com.sX.awt.Direction;
import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;
import com.sX.utils.SwingUtils;
import com.toedter.calendar.JDateChooser;

public class JxAllNotesPages extends PopUpView {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3204317465626283651L;
	private ButtonGroup bgNotes = new ButtonGroup();
	private JDateChooser dcDateTo;
	private JDateChooser dcDatefrom;
	private JxButton cancelButton;
	private JxTable table;
	private NotesJTable NotesTable;
	// private JxButton filterButton;
	static int startIndex = 0;
	static int userid = 0;

	final JButton next = new JButton("next");
	final JButton prev = new JButton("prev");

	public JxAllNotesPages() {
		super();
		setLayout(new BorderLayout());
		setSize(Toolkit.getDefaultToolkit().getScreenSize().width - 15, Toolkit
				.getDefaultToolkit().getScreenSize().height - 30);

		final JxPanel panelAllNotes = new JxPanel();
		panelAllNotes.setArc(0.0f);
		panelAllNotes.setBackground(Color.WHITE);
		panelAllNotes.setLayout(null);
		panelAllNotes.setSize(
				Toolkit.getDefaultToolkit().getScreenSize().width - 15, Toolkit
						.getDefaultToolkit().getScreenSize().height - 30);
		panelAllNotes.setLinearGradient(new Color(28, 93, 113), new Color(246,
				248, 250), Direction.BOTTOM_TO_TOP);
		add(panelAllNotes, BorderLayout.CENTER);

		dcDatefrom = new JDateChooser();
		dcDatefrom.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(final PropertyChangeEvent arg0) {
				startIndex = 0;
				Date dcfrom = dcDatefrom.getDate();
				updateNotesRecordJTable(userid, dcfrom, null, startIndex);
			}
		});
		dcDatefrom.setDateFormatString("MM/dd/yyyy");
		dcDatefrom.setBounds(520, 30, 141, 22);
		panelAllNotes.add(dcDatefrom);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(105, 82, 944, 345);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		panelAllNotes.add(scrollPane);

		JPanel buttonPanel = new JPanel();
		panelAllNotes.add(buttonPanel, BorderLayout.NORTH);
		panelAllNotes.add(scrollPane, BorderLayout.CENTER);

		table = new JxTable();
		NotesTable = new NotesJTable();
		JTableHeader header = table.getTableHeader();
		header.setBackground(new Color(147, 193, 85));
		header.setPreferredSize(new Dimension(0, 50));
		header.setBorder(null);
		table.setModel(NotesTable);
		scrollPane.setViewportView(table);
		panelAllNotes.add(scrollPane);

		final JLabel allNLabel = new JLabel();
		allNLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		allNLabel.setText("ALL Notes");
		allNLabel.setBounds(107, 25, 115, 32);
		panelAllNotes.add(allNLabel);

		final JRadioButton radioButton = new JRadioButton();
		radioButton.setActionCommand("0");
		bgNotes.add(radioButton);
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				String command = radioButton.getActionCommand().toString();
				if (command == "0") {
					int userid = 0;
					startIndex = 0;
					updateNotesRecordJTable(userid, null, null, startIndex);
				}

			}
		});
		radioButton.setBackground(Color.WHITE);
		radioButton.setOpaque(false);
		radioButton.setText("");
		radioButton.setBounds(188, 30, 27, 23);
		panelAllNotes.add(radioButton);

		final JLabel allNLabel_1 = new JLabel();
		allNLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		allNLabel_1.setText("My Notes");
		allNLabel_1.setBounds(262, 25, 79, 32);
		panelAllNotes.add(allNLabel_1);

		final JRadioButton radioButton_1 = new JRadioButton();
		radioButton_1.setActionCommand("1");
		bgNotes.add(radioButton_1);
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				radioButton_1.getActionCommand().toString();
				startIndex = 0;
				int userid = Global.currentLoggedInUserKey;
				// int userid = 7;
				updateNotesRecordJTable(userid, null, null, startIndex);
			}
		});
		radioButton_1.setBackground(Color.WHITE);
		radioButton_1.setOpaque(false);
		radioButton_1.setText("");
		radioButton_1.setBounds(336, 30, 27, 22);
		panelAllNotes.add(radioButton_1);

		final JLabel dateLabel = new JLabel();
		dateLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		dateLabel.setText("Date ranging from");
		dateLabel.setBounds(380, 34, 126, 14);
		panelAllNotes.add(dateLabel);

		final JLabel dateLabel_1 = new JLabel();
		dateLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		dateLabel_1.setText("to");
		dateLabel_1.setBounds(672, 34, 22, 14);
		panelAllNotes.add(dateLabel_1);

		final JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(934, 30, 115, 23);
		panelAllNotes.add(comboBox);

		final JLabel dateLabel_2 = new JLabel();
		dateLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		dateLabel_2.setText("Discipline");
		dateLabel_2.setBounds(859, 31, 68, 14);
		panelAllNotes.add(dateLabel_2);

		dcDateTo = new JDateChooser();
		dcDateTo.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(final PropertyChangeEvent arg0) {

				Date dcfrom = dcDatefrom.getDate();
				Date dcto = dcDateTo.getDate();
				startIndex = 0;
				updateNotesRecordJTable(userid, dcfrom, dcto, startIndex);

			}
		});
		dcDateTo.setDateFormatString("MM/dd/yyyy");
		dcDateTo.setBounds(700, 31, 141, 22);
		panelAllNotes.add(dcDateTo);

		cancelButton = new JxButton();
		cancelButton.setPreferredSize(new Dimension(120, 30));
		panelAllNotes.add(cancelButton);
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				// dispose();
			}
		});
		cancelButton.setBorder(new LineBorder(new Color(180, 188, 193), 1,
				false));
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setBackground(Color.WHITE);
		cancelButton.setArc(0.4f);
		cancelButton.setText("Cancel");

		radioButton.setSelected(true);
		final JButton prev = new JButton("prev");
		prev.setBounds(487, 442, 59, 26);
		panelAllNotes.add(prev);
		prev.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				startIndex = startIndex - 10;
				if (startIndex <= 0) {
					prev.setEnabled(false);
				}
				updateNotesRecordJTable(userid, null, null, startIndex);

			}
		});

		final JButton next = new JButton("next");
		next.setBounds(579, 442, 59, 26);
		panelAllNotes.add(next);
		next.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				// startindex=startindex+10;
				startIndex = startIndex + 10;
				if (startIndex > 0) {
					prev.setEnabled(true);
				}
				updateNotesRecordJTable(userid, null, null, startIndex);

			}
		});
		if (startIndex == 0) {
			prev.setEnabled(false);
		} else {
			prev.setEnabled(true);
		}

		updateNotesRecordJTable(userid, null, null, startIndex);
	}

	public static void main(String[] args) {
		JxAllNotesPages notesPanel = new JxAllNotesPages();

		JFrame frame = SwingUtils.wrapInFrame(notesPanel);

		frame.setVisible(true);
	}

	public void updateNotesRecordJTable(int userid, Date dcfrom, Date dcto,
			int startindex) {
		List<Notes> notesRec = new ArrayList<Notes>();
		Date dFrom = dcDatefrom.getDate();
		dcDateTo.getDate();
		int start_index = startindex;
		try {
			/*
			 * notesRec = (ArrayList<Notes>)
			 * NotesDao.getInstance().getNotesList( userid, dFrom, dcto,
			 * start_index);
			 */

			notesRec = MedrexClientManager.getInstance().getNotesList(userid,
					dFrom, dcto, start_index);

		} catch (Exception e) {

		}
		NotesTable.setNewList(notesRec);
		NotesTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}

	class NotesJTable extends AbstractTableModel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1996994525332386087L;

		private String[] columnNames = { "Date", "User Name", "Discipline",
				"Notes" };

		public List<Notes> notesRecords;

		int n = 0;

		NotesJTable(List<Notes> nNotesRecords) {
			notesRecords = nNotesRecords;

		}

		NotesJTable() {
			notesRecords = new ArrayList<Notes>();

		}

		public int getColumnCount() {
			return columnNames.length;
		}

		public int getRowCount() {
			return (notesRecords.size());
		}

		public void setRowCount(int count) {
			n = n + count;
		}

		public void setNewList(List<Notes> nNotesRec) {
			notesRecords = nNotesRec;
		}

		@Override
		public String getColumnName(int col) {
			return columnNames[col];
		}

		public Object getValueAt(int row, int col) {
			try {
				Object o = notesRecords.get(row);
				SimpleDateFormat df = new SimpleDateFormat();
				df.applyPattern("MM / dd / yyyy  hh:mm a");
				if (o instanceof Notes) {
					Notes rc = (Notes) o;
					if (col == 0) {
						return (df.format(rc.getCreatedDate()) + "");
					}
					if (col == 1) {
						int userSerial = rc.getUserId();
						String username = "";
						try {
							if (userSerial != 0) {
								Users users = MedrexClientManager.getInstance()
										.getUser(userSerial);
								username = users.getUserName();
							}
						} catch (Exception e) {

						}
						return username;
						// return (rc.getUserId());

					}

					if (col == 2) {
						if (rc.getNotesCategories().size() != 0) {
							return rc.getNotesCategories().toString();
						}
						return "No Category";
					}

					if (col == 3) {
						return (rc.getNoteText());
					}
					return ("");

				} else {

					return ("");

				}
			} catch (Exception e) {
				return ("");
			}
		}
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

}