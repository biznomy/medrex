package com.sX.swing.notes;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.loading.FrameMedrexMessage;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.NotesCategories;
import medrex.commons.vo.admin.TriggerWord;
import medrex.commons.vo.medication.Templates;
import medrex.commons.vo.messages.MessagesRecord;
import medrex.commons.vo.notes.Notes;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.progressNotes.ProgressNotes;

import com.sX.awt.Direction;
import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxPanel;
import com.sX.swing.htmlpad.JxHtmlPad;

public class JxNotesEditor extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8076237118832298435L;
	private ButtonGroup bgYesNo = new ButtonGroup();
	private JRadioButton rbYes;
	private JLabel sawThePatientLabel;
	private JList templatesList_1;
	private static final Color DEF_COLOR = new Color(49, 104, 127);
	private JxComboBox cmbFormType;
	private Notes notes = null;
	private List<Templates> temList = new ArrayList<Templates>();
	private List<Notes> notList = new ArrayList<Notes>();
	private JList templatesList;
	private JxHtmlPad templateNotes;
	private JList latestNotesList;
	private JxButton cancelButton;
	private JxButton okButton;
	String allTriggeredWord = "";
	private int sendCount = 0;
	private boolean cancel;
	// private Notes notesMain;

	private JList templateCategoryList;
	private CheckListItem checkListItems[];
	private List<NotesCategories> notesCatList;
	// If true then categories list and label will display otherwise not.
	private boolean isCategories;
	private JRadioButton rbNo;
	private int patientSeen;
	private JTextField[] txtList;
	// private JTextField txtList2;
	// private JTextField txtList3;
	// private JTextField txtList4;
	// private JTextField txtList5;
	// private JTextArea txtUser5;
	// private JTextArea txtUser4;
	// private JTextArea txtUser3;
	// private JTextArea txtUser2;
	private JTextArea[] txtUsers;

	private static final int MAX_NOTES = 5;

	private JxButton allNotesButton;
	private JxButton templateButton;

	public JxNotesEditor(Notes notes, boolean isCategories) {
		super();
		this.notes = notes;
		this.isCategories = isCategories;
		setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		setLayout(null);

		final JxPanel panelMain = new JxPanel();
		panelMain.setArc(0.0f);
		panelMain.setBackground(Color.WHITE);
		panelMain.setLayout(null);
		panelMain.setBounds(0, 0, ((int) (Toolkit.getDefaultToolkit()
				.getScreenSize()).getWidth()) - 15, ((int) (Toolkit
				.getDefaultToolkit().getScreenSize()).getHeight()) - 30);

		panelMain.setLinearGradient(new Color(28, 93, 113), new Color(246, 248,
				250), Direction.TOP_RIGHT_TO_BOTTOM_LEFT);
		add(panelMain);

		final JPanel panel = new JPanel();
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		flowLayout.setHgap(20);
		panel.setLayout(flowLayout);
		panel.setOpaque(false);
		panel.setBounds(10, panelMain.getBounds().height - 50, ((int) (Toolkit
				.getDefaultToolkit().getScreenSize()).getWidth()) - 45,
				((int) (Toolkit.getDefaultToolkit().getScreenSize())
						.getHeight()) - 600);
		panelMain.add(panel);

		okButton = new JxButton();
		okButton.setPreferredSize(new Dimension(120, 30));
		panel.add(okButton);
		okButton.setForeground(DEF_COLOR);
		okButton.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		okButton.setFont(new Font("", Font.BOLD, 12));
		okButton.setBackground(Color.WHITE);
		okButton.setArc(0.4f);
		okButton.setText("Save");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				cancel = false;
				if (doSave()) {
					dispose();
				}
			}
		});

		cancelButton = new JxButton();
		cancelButton.setPreferredSize(new Dimension(120, 30));
		panel.add(cancelButton);
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				cancel = true;
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

		allNotesButton = new JxButton();
		allNotesButton.setPreferredSize(new Dimension(120, 30));
		panel.add(allNotesButton);
		allNotesButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				JxAllNotesPages notesPanel = new JxAllNotesPages();
				/*
				 * JFrame frame = SwingUtils.wrapInFrame(notesPanel);
				 * frame.setAlwaysOnTop(true); //frame.requestFocus();
				 * //frame.setAlwaysOnTop(true); frame.setVisible(true);
				 */

				JDialog dialog = SwingUtils.wrapInDialog(notesPanel);
				dialog.setVisible(true);
				dialog.setFocusable(true);
				dialog.setAlwaysOnTop(true);
				dialog.setEnabled(true);

			}
		});
		allNotesButton.setForeground(DEF_COLOR);
		allNotesButton.setBorder(new LineBorder(new Color(180, 188, 193), 1,
				false));
		allNotesButton.setFont(new Font("", Font.BOLD, 12));
		allNotesButton.setBackground(Color.WHITE);
		allNotesButton.setArc(0.4f);
		allNotesButton.setText("ALL Notes");

		templateButton = new JxButton();
		templateButton.setPreferredSize(new Dimension(120, 30));
		panel.add(templateButton);
		templateButton.setForeground(DEF_COLOR);
		templateButton.setBorder(new LineBorder(new Color(180, 188, 193), 1,
				false));
		templateButton.setFont(new Font("", Font.BOLD, 12));
		templateButton.setBackground(Color.WHITE);
		templateButton.setArc(0.4f);
		templateButton.setText("Template");

		final JLabel notesLabel = new JLabel();
		notesLabel.setForeground(SystemColor.desktop);
		notesLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		notesLabel.setText("Notes");
		notesLabel.setBounds(20, 10, 354, 25);
		panelMain.add(notesLabel);

		/*
		 * final JPanel panelControls = new JPanel();
		 * panelControls.setBounds(700, 410, 464, 223);
		 * panelControls.setBackground(Color.RED); panelMain.add(panelControls);
		 */

		final ImagePanel panelLatestNotes = new ImagePanel(new ImageIcon(
				"img/notes.jpg").getImage());
		panelLatestNotes.setBackground(Color.WHITE);
		panelLatestNotes.setLayout(null);
		panelLatestNotes.setBounds(700, 40, 464, 300);
		panelMain.add(panelLatestNotes);

		// final FlowLayout flowLayout_12 = new FlowLayout();
		// flowLayout_12.setAlignment(FlowLayout.RIGHT);
		// suresh

		txtList = new JTextField[MAX_NOTES];
		txtUsers = new JTextArea[MAX_NOTES];

		for (int i = 0; i < MAX_NOTES; i++) {
			final int ii = i;
			txtList[i] = new JTextField();
			// txtList.setBorder(new LineBorder(Color.black, 1, false));
			txtList[i].setBounds(108, 85 + (i * 43), 356, 38);
			txtList[i].setOpaque(false);
			txtList[i].setEditable(false);
			txtList[i].setFont(new Font("Tahoma", Font.BOLD, 9));
			txtList[i].setBorder(null);
			txtList[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					JOptionPane.showMessageDialog(null, txtList[ii].getText());
					// showMessageDialog(txtList[ii].getText());
				}
			});
			panelLatestNotes.add(txtList[i]);

			txtUsers[i] = new JTextArea();
			txtUsers[i].setText("");
			txtUsers[i].setOpaque(false);
			// txtUser1.setBorder(new LineBorder(Color.black, 1, false));
			txtUsers[i].setBounds(5, 85 + (i * 43), 97, 38);
			// txtUsers[i].setEditable(false);
			txtUsers[i].setLineWrap(true);
			txtUsers[i].setFont(new Font("Tahoma", Font.BOLD, 9));
			panelLatestNotes.add(txtUsers[i]);
		}

		latestNotesList = new JList();
		latestNotesList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (e.getClickCount() == 2) {
					getResentNotesText();
				}
			}
		});
		latestNotesList.setForeground(SystemColor.BLACK);
		latestNotesList.setFont(new Font("", Font.BOLD, 12));
		// latestNotesList.setBorder(new LineBorder(SystemColor.desktop, 1,
		// false));
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
					// System.out.println("Notes Text is:"+note.getNoteText());

					String txtLabel = note.getNoteText();
					System.out
							.println("***************************************************"
									+ note.getNoteText());
					if (txtLabel != null) {
						txtLabel = txtLabel.replaceAll("<(.)+>", "");
						txtLabel = txtLabel.replaceAll("\n", " ");
						txtLabel = txtLabel.replaceAll("( )+", " ");
						txtLabel = txtLabel.trim();
						renderer.setText(txtLabel);
					}
				}
				return renderer;
			}
		});
		latestNotesList.setPreferredSize(new Dimension(200, 190));

		JScrollPane latestNotesScrollPane = new JScrollPane();
		latestNotesScrollPane.setBounds(15, 15, 330, 250);
		latestNotesScrollPane.setBorder(new LineBorder(SystemColor.desktop, 0,
				false));
		latestNotesScrollPane.setViewportView(latestNotesList);

		// final JxPanel panelTemplates = new JxPanel();
		// panelTemplates.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 1,
		// false));
		// listContainer.add(panelTemplates);
		// panelTemplates.setPreferredSize(new Dimension(200, 190));
		// panelTemplates.setArc(0f);
		// panelTemplates.setForeground(Color.WHITE);
		// panelTemplates.setLayout(null);
		// panelTemplates.setBounds(300, 410, 210, 220);
		// panelTemplates.setLinearGradient(new Color(255,255,255), new
		// Color(255,255,255), Direction.TOP_LEFT_TO_BOTTOM_RIGHT);

		// templatesList = new JList();
		// templatesList.addMouseListener(new MouseAdapter(){
		// public void mouseClicked(final MouseEvent e){
		// if(e.getClickCount()==2){
		// getTemplatesText();
		// }
		// }});
		// templatesList.setForeground(SystemColor.desktop);
		// templatesList.setFont(new Font("", Font.BOLD, 12));
		// templatesList.setBorder(new LineBorder(SystemColor.desktop, 0,
		// false));
		//		
		// JScrollPane templatesScrollPane = new JScrollPane();
		// templatesScrollPane.setBounds(15, 15, 330, 260);
		// templatesScrollPane.setBorder(new LineBorder(SystemColor.desktop, 0,
		// false));
		// templatesList.setPreferredSize(new Dimension(200, 190));
		// templatesScrollPane.setViewportView(templatesList);
		// panelTemplates.add(templatesScrollPane);

		/*
		 * final JxPanel panelLatestNotes = new JxPanel();
		 * panelLatestNotes.setBounds(21, 238, 307, 38);
		 * panelSuresh.add(panelLatestNotes); panelSuresh.add(panelLatestNotes);
		 * panelLatestNotes.setBorder(new LineBorder(ColorConstants.DEF_COLOR,
		 * 1, false)); panelLatestNotes.setPreferredSize(new Dimension(200,
		 * 190)); panelLatestNotes.setArc(0.0f);
		 * panelLatestNotes.setForeground(Color.WHITE);
		 * panelLatestNotes.setLayout(null);
		 * panelLatestNotes.setLinearGradient(new Color(255,255,255), new
		 * Color(255,255,255), Direction.TOP_LEFT_TO_BOTTOM_RIGHT);
		 * //panelSuresh.add(panelLatestNotes);
		 */

		final JxPanel panelMainInner = new JxPanel();
		panelMainInner.setCurvedView(false);
		panelMainInner.setBackground(Color.WHITE);
		panelMainInner.setLayout(null);
		panelMainInner.setBounds(10, 40, ((int) (Toolkit.getDefaultToolkit()
				.getScreenSize()).getWidth()) - 40, ((int) (Toolkit
				.getDefaultToolkit().getScreenSize()).getHeight()) - 120);
		panelMainInner.setLinearGradient(new Color(155, 182, 193), new Color(
				255, 255, 255), Direction.BOTTOM_RIGHT_TO_TOP_LEFT);
		panelMain.add(panelMainInner);

		templateNotes = new JxHtmlPad();
		templateNotes.setBorder(new LineBorder(SystemColor.desktop, 1, false));
		// templateNotes.setBounds(30, 20,
		// ((int)(Toolkit.getDefaultToolkit().getScreenSize()).getWidth()) -
		// 700, ((int)(Toolkit.getDefaultToolkit().getScreenSize()).getHeight())
		// - 500);
		templateNotes.setBounds(0, 0, ((int) (Toolkit.getDefaultToolkit()
				.getScreenSize()).getWidth()) - 700, ((int) (Toolkit
				.getDefaultToolkit().getScreenSize()).getHeight()) - 300);
		panelMainInner.add(templateNotes);

		JPanel listPanel = new JPanel();
		listPanel.setOpaque(false);
		final FlowLayout flowLayout_11 = new FlowLayout();
		flowLayout_11.setAlignment(FlowLayout.CENTER);
		flowLayout_11.setHgap(50);
		listPanel.setLayout(flowLayout_11);
		listPanel.setBounds(30, 20, 200, 400);
		panelMain.add(listPanel);

		JPanel listContainer = new JPanel();
		listContainer.setOpaque(false);
		final FlowLayout flowLayout_1 = new FlowLayout();
		flowLayout_1.setAlignment(FlowLayout.RIGHT);
		flowLayout_1.setHgap(50);
		listContainer.setLayout(flowLayout_1);
		listContainer.setBounds(30, 380, ((int) (Toolkit.getDefaultToolkit()
				.getScreenSize()).getWidth()) - 100, ((int) (Toolkit
				.getDefaultToolkit().getScreenSize()).getHeight()) - 80);
		panelMainInner.add(listContainer);

		final JPanel panelLatestNoteCombo = new JPanel();
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setAlignment(FlowLayout.RIGHT);
		flowLayout_2.setHgap(0);
		panelLatestNoteCombo.setLayout(flowLayout_2);
		panelLatestNoteCombo.setPreferredSize(new Dimension(((int) (Toolkit
				.getDefaultToolkit().getScreenSize()).getWidth()) - 100, 31));
		panelLatestNoteCombo.setOpaque(false);
		listContainer.add(panelLatestNoteCombo);

		final JLabel label_1 = new JLabel();
		if (isCategories) {
			label_1.setPreferredSize(new Dimension(250, 30));
		} else {
			label_1.setPreferredSize(new Dimension(0, 0));
		}
		label_1.setText("");
		panelLatestNoteCombo.add(label_1);

		// final JLabel formTypeLabel = new JLabel();
		// formTypeLabel.setPreferredSize(new Dimension(350, 30));
		// formTypeLabel.setForeground(SystemColor.desktop);
		// formTypeLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		// formTypeLabel.setText("Please Select Form Type");
		// formTypeLabel.setBounds(450, 380, 300, 26);
		// listLabelContainer.add(formTypeLabel);

		cmbFormType = new JxComboBox();
		cmbFormType.setPreferredSize(new Dimension(225, 25));
		panelLatestNoteCombo.add(cmbFormType);

		cmbFormType.setForeground(DEF_COLOR);
		cmbFormType.setFont(new Font("Tahoma", Font.BOLD, 11));
		cmbFormType.setArc(0.7f);
		cmbFormType.setBorder(new LineBorder(DEF_COLOR, 1, false));
		cmbFormType.setBackground(Color.WHITE);
		cmbFormType.setBounds(600, 350, 250, 25);
		cmbFormType.setModel(new DefaultComboBoxModel(new String[] {
				"Social/Service", "Doctors", "Activity" }));
		cmbFormType.setVisible(false);

		JPanel listLabelContainer = new JPanel();
		listLabelContainer.setOpaque(false);
		listLabelContainer.setPreferredSize(new Dimension(((int) (Toolkit
				.getDefaultToolkit().getScreenSize()).getWidth()) - 100, 30));
		final FlowLayout flowLayout2 = new FlowLayout();
		flowLayout2.setAlignment(FlowLayout.LEFT);
		flowLayout2.setHgap(0);
		listLabelContainer.setLayout(flowLayout2);
		listLabelContainer.setBounds(0, 0, ((int) (Toolkit.getDefaultToolkit()
				.getScreenSize()).getWidth()) - 100, ((int) (Toolkit
				.getDefaultToolkit().getScreenSize()).getHeight()) - 720);
		listContainer.add(listLabelContainer);

		final JxPanel panelTemplateCategory = new JxPanel();
		panelTemplateCategory.setBorder(new LineBorder(
				ColorConstants.DEF_COLOR, 1, false));
		panelTemplateCategory.setLayout(null);
		panelTemplateCategory.setPreferredSize(new Dimension(200, 190));
		panelTemplateCategory.setArc(0f);
		panelTemplateCategory.setForeground(Color.WHITE);
		// panelTemplateCategory.setLayout(null);
		panelTemplateCategory.setBounds(30, 410, 210, 220);
		panelTemplateCategory.setLinearGradient(new Color(255, 255, 255),
				new Color(255, 255, 255), Direction.TOP_LEFT_TO_BOTTOM_RIGHT);
		panelTemplateCategory.setVisible(false);

		if (isCategories) {
			listContainer.add(panelTemplateCategory);
		}

		templateCategoryList = new JList();
		// Use a CheckListRenderer (see below)
		// to renderer list cells

		templateCategoryList.setCellRenderer(new CheckListRenderer());
		templateCategoryList
				.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		// Add a mouse listener to handle changing selection

		templateCategoryList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent event) {
				JList list = (JList) event.getSource();

				// Get index of item clicked

				int index = list.locationToIndex(event.getPoint());
				CheckListItem item = (CheckListItem) list.getModel()
						.getElementAt(index);

				// Toggle selected state

				item.setSelected(!item.isSelected());
				// Repaint cell

				list.repaint(list.getCellBounds(index, index));
			}
		});
		templateCategoryList.setPreferredSize(new Dimension(200, 190));
		templateCategoryList.setForeground(SystemColor.desktop);
		templateCategoryList.setFont(new Font("", Font.BOLD, 12));

		final JScrollPane templateCategoryScrollPane = new JScrollPane();
		templateCategoryScrollPane.setBounds(15, 15, 200, 190);
		templateCategoryScrollPane.setPreferredSize(new Dimension(200, 190));
		panelTemplateCategory.add(templateCategoryScrollPane);
		templateCategoryScrollPane.setBorder(new LineBorder(
				SystemColor.desktop, 0, false));
		templateCategoryScrollPane.setViewportView(templateCategoryList);

		if (!isCategories) {
			final JPanel panelDoctor = new JPanel();
			panelDoctor.setBackground(Color.WHITE);
			panelDoctor.setLayout(null);
			panelDoctor.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 1,
					false));
			panelDoctor.setOpaque(true);
			panelDoctor.setPreferredSize(new Dimension(200, 190));
			listContainer.add(panelDoctor);

			sawThePatientLabel = new JLabel();
			sawThePatientLabel.setBounds(30, 10, 150, 20);
			sawThePatientLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
			sawThePatientLabel.setForeground(SystemColor.desktop);
			panelDoctor.add(sawThePatientLabel);
			sawThePatientLabel.setText("Saw the Patient?");

			rbYes = new JRadioButton();
			rbYes.setActionCommand("1");
			bgYesNo.add(rbYes);
			rbYes.setFont(new Font("Tahoma", Font.BOLD, 12));
			rbYes.setForeground(SystemColor.desktop);
			rbYes.setBackground(Color.WHITE);
			rbYes.setBounds(40, 50, 46, 24);
			panelDoctor.add(rbYes);
			rbYes.setText("Yes");

			rbNo = new JRadioButton();
			rbNo.setActionCommand("2");
			bgYesNo.add(rbNo);
			rbNo.setFont(new Font("Tahoma", Font.BOLD, 12));
			rbNo.setForeground(SystemColor.desktop);
			rbNo.setBackground(Color.WHITE);
			rbNo.setBounds(100, 50, 40, 24);
			rbNo.setText("No");
			panelDoctor.add(rbNo);
		}

		/*
		 * final JLabel label = new JLabel(); label.setPreferredSize(new
		 * Dimension(300, 30)); label.setForeground(SystemColor.desktop);
		 * label.setFont(new Font("Tahoma", Font.BOLD, 14)); //
		 * label.setText("Template Categories"); label.setText("Categories");
		 * label.setBounds(100, 380, 148, 22); if(isCategories){
		 * listLabelContainer.add(label); }
		 */

		// final JLabel templatesLabel = new JLabel();
		// templatesLabel.setPreferredSize(new Dimension(250, 30));
		// templatesLabel.setForeground(SystemColor.desktop);
		// templatesLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		// templatesLabel.setText("Templates");
		// templatesLabel.setBounds(370, 380, 150, 26);
		// listLabelContainer.add(templatesLabel);
		/*
		 * final JLabel latestNotesLabel = new JLabel();
		 * latestNotesLabel.setPreferredSize(new Dimension(350, 30));
		 * latestNotesLabel.setForeground(SystemColor.desktop);
		 * latestNotesLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		 * latestNotesLabel.setText("Latest Notes");
		 * latestNotesLabel.setBounds(600, 380, 163, 26);
		 * listLabelContainer.add(latestNotesLabel);
		 * cmbFormType.addActionListener(new ActionListener(){ public void
		 * actionPerformed(ActionEvent e) { updateNotesByCategory(); } });
		 */

		// setModal(true);
		// setAlwaysOnTop(true);
		doUpdateNotes();
		updateData();
		// fillCombo();

		getResentNotesText();
	}

	private void fillCombo() {
		try {
			List<NotesCategories> notesList = MedrexClientManager.getInstance()
					.getAllNotesCategories();

			cmbFormType.setModel(new DefaultComboBoxModel(notesList.toArray()));
		} catch (RemoteException e) {

			e.printStackTrace();
		} catch (MedrexException e) {

			e.printStackTrace();
		}
	}

	public void updateNotesByCategory() {
		List<Notes> latestNotes = new ArrayList<Notes>();
		try {
			latestNotes = MedrexClientManager.getInstance().getLatestNotes(
					(NotesCategories) cmbFormType.getSelectedItem());
			setNotList(latestNotes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		latestNotesList.setListData(latestNotes.toArray());

	}

	public void updateData() {
		// List<Templates> globalTempList = new ArrayList<Templates>();
		notesCatList = new ArrayList<NotesCategories>();

		// try{
		// globalTempList =
		// MedrexClientManager.getInstance().getTemplate(this.notes.getFormName());
		// setTemList(globalTempList);
		// }catch(Exception e){}
		// templatesList.setModel(new
		// DefaultComboBoxModel(globalTempList.toArray()));
		if (Global.currentProgressNotesKey != 0) {
			ProgressNotes ar = null;
			try {
				ar = MedrexClientManager.getInstance().getProgressNotes(
						Global.currentProgressNotesKey);
				if (ar != null) {
					setPatientSeen(ar.getPatientSeen());
				}

			} catch (Exception e) {
			}
		}
		SwingUtils.setSelectedButton(bgYesNo, getPatientSeen());
		try {
			notesCatList = MedrexClientManager.getInstance()
					.getNotesCategories(this.notes.getFormName());

			checkListItems = new CheckListItem[notesCatList.size()];
			for (int i = 0; i < notesCatList.size(); i++) {
				NotesCategories nc = notesCatList.get(i);
				checkListItems[i] = new CheckListItem(nc.getNoteCategory());

			}
			DefaultListModel model = new DefaultListModel();
			for (CheckListItem item : checkListItems) {
				model.addElement(item);
			}
			templateCategoryList.setModel(model);

		} catch (Exception e) {
		}
		if (notes.getNotesCategories() != null) {

			List<NotesCategories> selectedNotes = null;
			try {
				selectedNotes = MedrexClientManager.getInstance()
						.getNoteCategories(notes.getSerial());
				if (selectedNotes != null) {

					notes.setNotesCategories(selectedNotes);

				}
			} catch (MedrexException e) {

				e.printStackTrace();
			} catch (RemoteException e) {

				e.printStackTrace();
			}

			for (int i = 0; i < notesCatList.size(); i++) {

				NotesCategories note = notesCatList.get(i);
				CheckListItem item = checkListItems[i];
				if (selectedNotes != null) {
					for (int k = 0; k < selectedNotes.size(); k++) {
						NotesCategories selNote = selectedNotes.get(k);
						if (note.equals(selNote)) {
							item.setSelected(true);
						}
					}
				}
			}

		}

		templateNotes.setFormattedText(notes.getNoteText());
	}

	private boolean doSave() {

		List<NotesCategories> selectedNotesCat = new ArrayList<NotesCategories>();
		if (notesCatList != null) {
			for (int i = 0; i < notesCatList.size(); i++) {
				NotesCategories notesCat = notesCatList.get(i);
				CheckListItem item = checkListItems[i];
				if (item.isSelected()) {

					selectedNotesCat.add(notesCat);
				}
			}
		}
		/*
		 * suresh if(selectedNotesCat.size() <= 0 && isCategories){
		 * JOptionPane.showMessageDialog(this,
		 * "Please enter category, contact to admin."); return false; }else{
		 */
		notes.setNoteText(templateNotes.getFormattedText());
		notes.setNotesCategories(selectedNotesCat);
		matchTriggerWord(notes.getNoteText());
		setNotesMain(notes);
		setPatientSeen(SwingUtils.getSelectedButton(bgYesNo));
		return true;
		// }

	}

	public static void showMessageDialog(String message) {
		try {
			FrameMedrexMessage dialog = new FrameMedrexMessage(message);
			dialog.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			SwingUtils.center(dialog);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void matchTriggerWord(String notes) {

		String str = notes;
		String nonStr = removeHTML(str);
		List listFromTrigger = null;
		try {
			try {
				listFromTrigger = MedrexClientManager.getInstance()
						.getTriggerWordList();
			} catch (MedrexException e) {

				e.printStackTrace();
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		List listFromNotes = new ArrayList();
		String wordFromNotes = "";
		String wordFromTrigger = "";
		StringTokenizer temp = new StringTokenizer(nonStr);
		while (temp.hasMoreElements()) {
			listFromNotes.add(temp.nextToken(" "));
		}
		Iterator it = listFromNotes.iterator();
		while (it.hasNext()) {
			wordFromNotes = (String) it.next();
			Iterator it2 = listFromTrigger.iterator();
			while (it2.hasNext()) {
				wordFromTrigger = (String) it2.next();
				if (wordFromNotes.equalsIgnoreCase(wordFromTrigger)) {
					allTriggeredWord += wordFromNotes + ", ";
					++sendCount;
				}
			}
		}

	}

	public String getTriggerWord() {
		return allTriggeredWord;
	}

	public static String removeHTML(String htmlString) {
		// Remove HTML tag from java String
		String noHTMLString = htmlString.replaceAll("\\<.*?\\>", "");
		noHTMLString = noHTMLString.replaceAll("\\.", "");
		noHTMLString = noHTMLString.replaceAll(",", "");

		// Remove Carriage return from java String
		noHTMLString = noHTMLString.replaceAll("\r", "");

		// Remove New line from java string and replace html break
		noHTMLString = noHTMLString.replaceAll("\n", " ");
		noHTMLString = noHTMLString.replaceAll("\'", "&#39;");
		noHTMLString = noHTMLString.replaceAll("\"", "&quot;");
		// noHTMLString = noHTMLString.replaceAll(".", " ");
		return noHTMLString;
	}

	public void sendMail(String str) {
		if (sendCount > 0) {
			try {
				StringTokenizer stk = new StringTokenizer(str);
				String finalTriWord = null;
				while (stk.hasMoreTokens()) {
					String tempTriWord = stk.nextToken(", ");
					if (finalTriWord == null) {
						finalTriWord = tempTriWord + ", ";
					} else {
						if (!finalTriWord.contains(tempTriWord)) {
							finalTriWord += tempTriWord + ", ";
						}
					}
				}
				SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
				String tempStr = "";
				List<TriggerWord> twList = MedrexClientManager.getInstance()
						.getTriggerWordCreatedAndModifiedDate(finalTriWord);
				for (TriggerWord tw : twList) {
					tempStr += "<html><b>Trigger Word: </b>" + tw.getWord()
					// +
							// ",<html><b>Created Date: </b>"+sdf.format(tw.getTriggerWordCreatedDate())
							// +",<html><b>Modified Date: </b>"+
							// sdf.format(tw.getTriggerWordModifiedDate())
							+ "\n";
				}

				str = "<html><b>Form Name: </b>" + notes.getFormName();
				String strDate = sdf.format(MedrexClientManager.getInstance()
						.getServerTime());
				str += "\n<html><b>Date: </b>" + strDate + "\n\n";
				str += tempStr;

				str += "\n<html><b>User Name: </b>"
						+ Global.currentUserLastName + ", "
						+ Global.currentUserFirstName;

				MessagesRecord ref = new MessagesRecord();
				ref.setSenderId(Global.currentLoggedInUserKey);
				ref.setMessage(str + "\nfound while saving Notes.");
				ref.setReceiverId(0);
				ref.setSubject("Trigger Word found by :"
						+ Global.currentLoggedInUserName);
				ref.setTimeRecord(new Date());
				ref.setType("TriggerAlert");
				ref.setNew(true);
				List<Users> toUserList = new ArrayList<Users>();

				System.out.println("tempTriWord: " + finalTriWord);
				toUserList = MedrexClientManager.getInstance()
						.getUsersAccordingToTriggerWords(finalTriWord);
				// toUserList = MedrexClientManager.getInstance()
				// .getUserListFromDepartment("Administrator");

				MedrexClientManager.getInstance().insertOrUpdateMessagesRecord(
						ref, toUserList);
				System.out.println("Mail Sent");
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	private void getResentNotesText() {
		List nList = getNotList();
		Iterator<Notes> it = nList.iterator();
		nList.size();

		for (int i = 0; i < MAX_NOTES && i < nList.size(); i++) {
			String newline = "\n";
			String username = Global.currentUserLastName + ", "
					+ Global.currentUserFirstName;
			txtList[i]
					.setText(removeHTML(((Notes) nList.get(i)).getNoteText()));
			txtUsers[i].setText(removeHTML(((Notes) nList.get(i))
					.getCreatedDate().toString())
					+ newline + username);
		}

		while (it.hasNext()) {
			Notes n = it.next();
			// txtList.setText(removeHTML(n.getNoteText()));
			/*
			 * txtList2.setText(removeHTML(n.getNoteText()));
			 * txtList3.setText(removeHTML(n.getNoteText()));
			 * txtList4.setText(removeHTML(n.getNoteText()));
			 */

			if ((latestNotesList.getSelectedValue() + "").equalsIgnoreCase(n
					.getNoteText())) {
				// templateNotes.setFormattedText(n.getNoteText());
				JOptionPane.showMessageDialog(this, removeHTML(n.getNoteText())
						.trim(), "Latest Notes",
						JOptionPane.INFORMATION_MESSAGE);
				/*
				 * PanelNotesViewer panel = new PanelNotesViewer();
				 * panel.setNoteText(removeHTML(n.getNoteText()).trim());
				 * JDialog frm = new JDialog(); frm.getContentPane().add(panel);
				 * frm.setSize(400,400); frm.setModal(true);
				 * frm.setVisible(true);
				 */
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

	private void doUpdateNotes() {
		List<Notes> latestNotes = new ArrayList<Notes>();
		new ArrayList<Notes>();
		try {
			latestNotes = MedrexClientManager.getInstance().getLatestNotes(
					this.notes.getFormName(), this.notes.getUserId(),/*
																	 * (NotesCategories
																	 * )
																	 * cmbFormType
																	 * .
																	 * getSelectedItem
																	 * ()
																	 */null);
			// System.out.println("Latest Notes Are:");
			// for(Notes latestNote : latestNotes){
			// if(latestNotes != null){
			// tempLatestNotes.add(latestNote);
			// System.out.println("latest notes are :"+latestNote.getNoteText());
			// }
			// }
			setNotList(latestNotes);
		} catch (Exception e) {
			e.printStackTrace();
		}

		latestNotesList.setListData(latestNotes.toArray());
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

	@Override
	public String getTitle() {
		return "Notes";
	}

	public boolean isCancel() {
		return cancel;
	}

	public void setCancel(boolean cancel) {
		this.cancel = cancel;
	}

	public Notes getNotesMain() {
		// return notesMain;
		return notes;
	}

	public void setNotesMain(Notes notesMain) {
		// this.notesMain = notesMain;
		this.notes = notesMain;
	}

	public JxHtmlPad getTemplateNotes() {
		return templateNotes;
	}

	public void setTemplateNotes(JxHtmlPad templateNotes) {
		this.templateNotes = templateNotes;
	}

	public int getPatientSeen() {
		return patientSeen;
	}

	public void setPatientSeen(int patientSeen) {
		this.patientSeen = patientSeen;
	}

}

/**
 * for adding check boxes to the List of template category
 * 
 */
class CheckListItem {
	private String label;
	private boolean isSelected = false;

	public CheckListItem(String label) {
		this.label = label;
	}

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	@Override
	public String toString() {
		return label;
	}
}

class CheckListRenderer extends JCheckBox implements ListCellRenderer {
	/**
	 * 
	 */
	private static final long serialVersionUID = 295884524061424694L;

	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isSelected, boolean hasFocus) {
		setEnabled(list.isEnabled());
		setSelected(((CheckListItem) value).isSelected());
		setFont(list.getFont());
		setBackground(list.getBackground());
		setForeground(new Color(0, 78, 152));
		setText(value.toString());
		/*
		 * final JLabel renderer = (JLabel)
		 * super.getListCellRendererComponent()new JLabel();
		 * renderer.setHorizontalAlignment(SwingConstants.LEFT); if(value
		 * instanceof Notes) { Notes note = (Notes) value; String txtLabel =
		 * note.getNoteText(); txtLabel = txtLabel.replaceAll("<(.)+>", "");
		 * txtLabel = txtLabel.replaceAll("\n", " "); txtLabel =
		 * txtLabel.replaceAll("( )+", " "); txtLabel = txtLabel.trim();
		 * renderer.setText(txtLabel); }
		 */
		return this;
	}

}

class ImagePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7285304438017332248L;
	private Image img;

	public ImagePanel(String img) {
		this(new ImageIcon(img).getImage());
	}

	public ImagePanel(Image img) {
		this.img = img;
		Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
		setPreferredSize(size);
		setMinimumSize(size);
		setMaximumSize(size);
		setSize(size);
		setLayout(null);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
}
