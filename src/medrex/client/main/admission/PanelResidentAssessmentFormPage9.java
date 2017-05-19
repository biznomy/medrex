package medrex.client.main.admission;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.BorderUIResource.CompoundBorderUIResource;
import javax.swing.plaf.basic.BasicBorders;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldValidation;
import medrex.client.utils.SwingUtils;
import medrex.commons.intf.Form;
import medrex.commons.vo.admission.ResidentAssessmentFormPage9;
import medrex.commons.vo.notes.Notes;
import medrex.commons.vo.others.Nurse;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;

import org.jdesktop.jxlayer.JXLayer;
import org.jdesktop.jxlayer.plaf.effect.BufferedImageOpEffect;
import org.jdesktop.jxlayer.plaf.ext.LockableUI;

import com.jgoodies.validation.ValidationResult;
import com.jhlabs.image.GrayFilter;
import com.sX.swing.JxCheckBox;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxRadioButton;
import com.sX.swing.JxTextA;
import com.sX.swing.notes.JxNotes;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelResidentAssessmentFormPage9 extends JxPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3099639698782745742L;
	Theme theme = new BlackOverWhiteTheme();
	Font font_Plain = new Font("Arial", Font.PLAIN, 11);
	Font font_Bold = new Font("Arial", Font.BOLD, 11);
	Insets margin = new Insets(0, 2, 0, 0);
	Border border = new CompoundBorderUIResource(new LineBorder(Color.BLACK),
			new BasicBorders.MarginBorder());

	private JxRadioButton rbQ9ANo;
	private JxRadioButton rbQ9AYes;
	private JxPanel layer;
	private JxPanel panelMain;
	public JxCheckBox cbNA;
	private JxDateChooser dcNurseVisit;
	private JxLabel dateLabel;
	private JxComboBox cmbNurse;
	private JxLabel ifSoWhatLabel;
	private JxPanel panel_5;
	private JxRadioButton rbQ10No;
	private JxRadioButton rbQ10Yes;
	private JxRadioButton rbQ9No;
	private JxRadioButton rbQ9Yes;
	private JxRadioButton rbQ8No;
	private JxRadioButton rbQ8Yes;
	private JxRadioButton rbQ7No;
	private JxRadioButton rbQ7Yes;
	private JxNotes txtQ6;
	private JxRadioButton rbQ6No;
	private JxRadioButton rbQ6Yes;
	private JxRadioButton rbQ5No;
	private JxRadioButton rbQ5Yes;
	private JxNotes txtQ4;
	private JxRadioButton rbQ4No;
	private JxRadioButton rbQ4Yes;
	private JxRadioButton rbQ3No;
	private ButtonGroup bgQ10 = new ButtonGroup();
	private ButtonGroup bgQ9 = new ButtonGroup();
	private ButtonGroup bgQ8 = new ButtonGroup();
	private ButtonGroup bgQ7 = new ButtonGroup();
	private ButtonGroup bgQ6 = new ButtonGroup();
	private ButtonGroup bgQ5 = new ButtonGroup();
	private ButtonGroup bgQ4 = new ButtonGroup();
	private ButtonGroup bgQ3 = new ButtonGroup();
	private ButtonGroup bgQ9A = new ButtonGroup();
	private JxComboBox cmbQ2;
	JxLabel lblName;
	JxLabel lblRoomNum;
	JxComboBox cmbQ1;
	private JxRadioButton rbQ3Yes;
	private JxNotes txtQ3;
	private JxNotes txtQ41;
	private JXLayer<JxPanel> layerContent;
	private LockableUI layerUI;
	private Notes notesTq3;
	private Notes notesQ4;
	private Notes notesQ6;
	// If true then categories list and label will display otherwise not.
	private boolean isCategories = true;

	public PanelResidentAssessmentFormPage9() {
		super();

		Global.panelResidentAssessmentFormPage9 = this;
		setLayout(null);

		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(930, 1150));
		setSize(930, 1150);

		final JxLabel incontinenceAssessmentLabel = new JxLabel();
		incontinenceAssessmentLabel.setTheme(theme);

		incontinenceAssessmentLabel.setFontStyle(Font.BOLD);
		incontinenceAssessmentLabel.setFontSize(18);

		incontinenceAssessmentLabel.setText("INCONTINENCE ASSESSMENT");
		incontinenceAssessmentLabel.setBounds(340, 10, 281, 16);
		add(incontinenceAssessmentLabel);

		panelMain = new JxPanel();
		panelMain.setTheme(theme);
		// panelMain.setPreferredSize(new Dimension(930, 1200));
		panelMain.setBorder(new LineBorder(Color.black, 1, false));
		panelMain.setLayout(null);

		panelMain.setBounds(15, 50, 895, 1051);
		add(panelMain);

		layerUI = new LockableUI(new BufferedImageOpEffect(new GrayFilter()));
		layerContent = new JXLayer<JxPanel>(panelMain);
		// layerContent.getGlassPane().add(panelMain);
		layerContent.setUI(layerUI);
		layerContent.setLayout(null);
		layerContent.setBounds(15, 44, 925, 1106);
		add(layerContent);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setLayout(null);

		panel_1.setBounds(10, 10, 878, 32);
		panelMain.add(panel_1);

		final JxLabel residentNameLabel = new JxLabel();
		residentNameLabel.setTheme(theme);

		residentNameLabel.setText("Resident Name :");
		residentNameLabel.setBounds(10, 10, 112, 16);
		panel_1.add(residentNameLabel);

		lblName = new JxLabel();
		lblName.setTheme(theme);
		lblName.setFontStyle(Font.BOLD);

		lblName.setBounds(125, 8, 235, 20);
		panel_1.add(lblName);

		final JxLabel roomidLabel = new JxLabel();
		roomidLabel.setTheme(theme);

		roomidLabel.setText("Room/ID#:");
		roomidLabel.setBounds(476, 10, 66, 16);
		panel_1.add(roomidLabel);

		lblRoomNum = new JxLabel();
		lblRoomNum.setTheme(theme);
		lblRoomNum.setFontStyle(Font.BOLD);

		lblRoomNum.setBounds(570, 8, 154, 20);
		panel_1.add(lblRoomNum);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);

		panel_2.setLayout(null);
		panel_2.setBounds(10, 48, 878, 32);
		panelMain.add(panel_2);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setText("1. How long has resident been incontinent of urine?");
		label.setBounds(10, 10, 405, 16);
		panel_2.add(label);

		cmbQ1 = new JxComboBox();
		cmbQ1.setTheme(theme);

		cmbQ1.setBounds(476, 6, 249, 25);
		panel_2.add(cmbQ1);

		final JxPanel panel_2_1 = new JxPanel();
		panel_2_1.setTheme(theme);
		panel_2_1.setLayout(null);

		panel_2_1.setBounds(10, 86, 878, 32);
		panelMain.add(panel_2_1);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);

		label_1.setText("2. How long has resident been incontinent of stool?");
		label_1.setBounds(10, 10, 405, 16);
		panel_2_1.add(label_1);

		cmbQ2 = new JxComboBox();
		cmbQ2.setTheme(theme);

		cmbQ2.setBounds(476, 6, 249, 25);
		panel_2_1.add(cmbQ2);

		final JxPanel panel_2_1_1 = new JxPanel();
		panel_2_1_1.setTheme(theme);
		panel_2_1_1.setLayout(null);

		panel_2_1_1.setBounds(10, 124, 878, 115);
		panelMain.add(panel_2_1_1);

		final JxLabel label_1_1 = new JxLabel();
		label_1_1.setTheme(theme);

		label_1_1.setText("3. Is there a known reason for the incontinence ?");
		label_1_1.setBounds(10, 10, 405, 16);
		panel_2_1_1.add(label_1_1);

		rbQ3Yes = new JxRadioButton();
		rbQ3Yes.setTheme(theme);

		rbQ3Yes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtQ3.setEditableNotes(true);
			}
		});
		rbQ3Yes.setActionCommand("1");
		bgQ3.add(rbQ3Yes);

		rbQ3Yes.setText("Yes");
		rbQ3Yes.setBounds(475, 10, 56, 24);
		panel_2_1_1.add(rbQ3Yes);

		rbQ3No = new JxRadioButton();
		rbQ3No.setTheme(theme);

		rbQ3No.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtQ3.setEditableNotes(false);
			}
		});
		bgQ3.add(rbQ3No);
		rbQ3No.setActionCommand("2");

		rbQ3No.setText("No");
		rbQ3No.setBounds(564, 10, 56, 24);
		panel_2_1_1.add(rbQ3No);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);

		panel_3.setLayout(null);
		panel_3.setBounds(10, 40, 858, 65);
		panel_2_1_1.add(panel_3);

		final JxLabel ifYesExplainLabel = new JxLabel();
		ifYesExplainLabel.setTheme(theme);
		ifYesExplainLabel.setText("If Yes, explain");
		ifYesExplainLabel.setBounds(10, 10, 89, 16);
		panel_3.add(ifYesExplainLabel);

		// final JScrollPane scrollPane = new JScrollPane();
		// scrollPane.setBounds(105, 10, 743, 45);
		// panel_3.add(scrollPane);

		notesTq3 = new Notes();
		notesTq3.setFormName("Resident Assessment Form");
		notesTq3.setUserId(Global.currentLoggedInUserKey);
		notesTq3.setNoteText("");

		txtQ3 = new JxNotes(isCategories);
		txtQ3.setFont(font_Plain);
		// scrollPane.setViewportView(txtQ3);
		txtQ3.setNotes(notesTq3);
		txtQ3.setBorder(new LineBorder(Color.black, 1, false));
		// txtQ3.setWrapStyleWord(true);
		// txtQ3.setLineWrap(true);
		txtQ3.setBounds(105, 10, 743, 45);
		txtQ3.setEditableNotes(false);
		// panel_3.add(txtQ3);

		final JxPanel panel_2_1_1_1 = new JxPanel();
		panel_2_1_1_1.setTheme(theme);
		panel_2_1_1_1.setLayout(null);

		panel_2_1_1_1.setBounds(10, 245, 878, 115);
		panelMain.add(panel_2_1_1_1);

		final JxLabel label_1_1_1 = new JxLabel();
		label_1_1_1.setTheme(theme);

		label_1_1_1.setText("4. Is there an unusual elimination pattern ?");
		label_1_1_1.setBounds(10, 10, 405, 16);
		panel_2_1_1_1.add(label_1_1_1);

		rbQ4Yes = new JxRadioButton();
		rbQ4Yes.setTheme(theme);

		rbQ4Yes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent arg0) {
				txtQ4.setEditableNotes(true);
			}
		});
		bgQ4.add(rbQ4Yes);

		rbQ4Yes.setActionCommand("1");
		rbQ4Yes.setText("Yes");
		rbQ4Yes.setBounds(475, 10, 56, 24);
		panel_2_1_1_1.add(rbQ4Yes);

		rbQ4No = new JxRadioButton();
		rbQ4No.setTheme(theme);
		rbQ4No.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtQ4.setNotes(notesQ4);
				txtQ4.setEditableNotes(false);
			}
		});
		bgQ4.add(rbQ4No);

		rbQ4No.setActionCommand("2");
		rbQ4No.setText("No");
		rbQ4No.setBounds(564, 10, 56, 24);
		panel_2_1_1_1.add(rbQ4No);

		final JxPanel panel_3_1 = new JxPanel();
		panel_3_1.setTheme(theme);
		panel_3_1.setLayout(null);

		panel_3_1.setBounds(10, 40, 858, 65);
		panel_2_1_1_1.add(panel_3_1);

		final JxLabel ifYesExplainLabel_1 = new JxLabel();
		ifYesExplainLabel_1.setTheme(theme);

		ifYesExplainLabel_1.setText("If Yes, explain");
		ifYesExplainLabel_1.setBounds(10, 10, 89, 16);
		panel_3_1.add(ifYesExplainLabel_1);

		// final JScrollPane scrollPane1 = new JScrollPane();
		// scrollPane1.setBounds(105, 10, 743, 45);
		// panel_3_1.add(scrollPane1);

		notesQ4 = new Notes();
		notesQ4.setFormName("Resident Assessment Form");
		notesQ4.setUserId(Global.currentLoggedInUserKey);
		notesQ4.setNoteText("");

		txtQ4 = new JxNotes(isCategories);
		// scrollPane1.setViewportView(txtQ4);
		txtQ4.setBorder(new LineBorder(Color.black, 1, false));
		// txtQ4.setWrapStyleWord(true);
		// txtQ4.setLineWrap(true);
		txtQ4.setBounds(105, 10, 743, 45);
		txtQ4.setEditableNotes(false);
		// panel_3_1.add(txtQ4);

		final JxPanel panel_2_1_1_1_1 = new JxPanel();
		panel_2_1_1_1_1.setTheme(theme);
		panel_2_1_1_1_1.setLayout(null);

		panel_2_1_1_1_1.setBounds(10, 366, 878, 41);
		panelMain.add(panel_2_1_1_1_1);

		final JxLabel label_1_1_1_1 = new JxLabel();
		label_1_1_1_1.setTheme(theme);

		label_1_1_1_1.setText("5. Is there a history of enema/laxative use ?");
		label_1_1_1_1.setBounds(10, 10, 405, 16);
		panel_2_1_1_1_1.add(label_1_1_1_1);

		rbQ5Yes = new JxRadioButton();
		rbQ5Yes.setTheme(theme);

		bgQ5.add(rbQ5Yes);

		rbQ5Yes.setActionCommand("1");
		rbQ5Yes.setText("Yes");
		rbQ5Yes.setBounds(475, 10, 56, 24);
		panel_2_1_1_1_1.add(rbQ5Yes);

		rbQ5No = new JxRadioButton();
		rbQ5No.setTheme(theme);

		bgQ5.add(rbQ5No);

		rbQ5No.setActionCommand("2");
		rbQ5No.setText("No");
		rbQ5No.setBounds(564, 10, 56, 24);
		panel_2_1_1_1_1.add(rbQ5No);

		final JxPanel panel_2_1_1_1_2 = new JxPanel();
		panel_2_1_1_1_2.setTheme(theme);
		panel_2_1_1_1_2.setLayout(null);

		panel_2_1_1_1_2.setBounds(10, 413, 878, 115);
		panelMain.add(panel_2_1_1_1_2);

		final JxLabel label_1_1_1_2 = new JxLabel();
		label_1_1_1_2.setTheme(theme);

		label_1_1_1_2.setText("6. Is there a history of bladder disorder ?");
		label_1_1_1_2.setBounds(10, 10, 405, 16);
		panel_2_1_1_1_2.add(label_1_1_1_2);

		rbQ6Yes = new JxRadioButton();
		rbQ6Yes.setTheme(theme);

		rbQ6Yes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtQ6.setEditableNotes(true);
			}
		});
		bgQ6.add(rbQ6Yes);

		rbQ6Yes.setActionCommand("1");
		rbQ6Yes.setText("Yes");
		rbQ6Yes.setBounds(475, 10, 56, 24);
		panel_2_1_1_1_2.add(rbQ6Yes);

		rbQ6No = new JxRadioButton();
		rbQ6No.setTheme(theme);

		rbQ6No.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtQ6.setNotes(notesQ6);
				txtQ6.setEditableNotes(false);
			}
		});
		bgQ6.add(rbQ6No);

		rbQ6No.setActionCommand("2");
		rbQ6No.setText("No");
		rbQ6No.setBounds(564, 10, 56, 24);
		panel_2_1_1_1_2.add(rbQ6No);

		final JxPanel panel_3_1_1 = new JxPanel();
		panel_3_1_1.setTheme(theme);
		panel_3_1_1.setLayout(null);

		panel_3_1_1.setBounds(10, 40, 858, 65);
		panel_2_1_1_1_2.add(panel_3_1_1);

		final JxLabel ifYesExplainLabel_1_1 = new JxLabel();
		ifYesExplainLabel_1_1.setTheme(theme);

		ifYesExplainLabel_1_1.setText("If Yes, explain");
		ifYesExplainLabel_1_1.setBounds(10, 10, 89, 16);
		panel_3_1_1.add(ifYesExplainLabel_1_1);

		// final JScrollPane scrollPane2 = new JScrollPane();
		// scrollPane2.setBounds(105, 10, 743, 45);
		// panel_3_1_1.add(scrollPane2);
		//		

		notesQ6 = new Notes();
		notesQ6.setFormName("Resident Assessment Form");
		notesQ6.setUserId(Global.currentLoggedInUserKey);
		notesQ6.setNoteText("");

		txtQ6 = new JxNotes(isCategories);
		// scrollPane2.setViewportView(txtQ6);
		txtQ6.setBorder(new LineBorder(Color.black, 1, false));
		// txtQ6.setWrapStyleWord(true);
		// txtQ6.setLineWrap(true);
		txtQ6.setBounds(105, 10, 743, 45);
		txtQ6.setEditableNotes(false);
		// panel_3_1_1.add(txtQ6);

		final JxPanel panel_2_1_1_1_1_1 = new JxPanel();
		panel_2_1_1_1_1_1.setTheme(theme);
		panel_2_1_1_1_1_1.setLayout(null);

		panel_2_1_1_1_1_1.setBounds(10, 534, 878, 41);
		panelMain.add(panel_2_1_1_1_1_1);

		final JxLabel label_1_1_1_1_1 = new JxLabel();
		label_1_1_1_1_1.setTheme(theme);

		label_1_1_1_1_1.setText("7. Does resident feel the need to void ?");
		label_1_1_1_1_1.setBounds(10, 10, 405, 16);
		panel_2_1_1_1_1_1.add(label_1_1_1_1_1);

		rbQ7Yes = new JxRadioButton();
		rbQ7Yes.setTheme(theme);

		bgQ7.add(this.rbQ7Yes);

		rbQ7Yes.setActionCommand("1");
		rbQ7Yes.setText("Yes");
		rbQ7Yes.setBounds(475, 10, 56, 24);
		panel_2_1_1_1_1_1.add(this.rbQ7Yes);

		rbQ7No = new JxRadioButton();
		rbQ7No.setTheme(theme);

		bgQ7.add(rbQ7No);

		rbQ7No.setActionCommand("2");
		rbQ7No.setText("No");
		rbQ7No.setBounds(564, 10, 56, 24);
		panel_2_1_1_1_1_1.add(rbQ7No);

		final JxPanel panel_2_1_1_1_1_1_1 = new JxPanel();
		panel_2_1_1_1_1_1_1.setTheme(theme);
		panel_2_1_1_1_1_1_1.setLayout(null);

		panel_2_1_1_1_1_1_1.setBounds(10, 581, 878, 41);
		panelMain.add(panel_2_1_1_1_1_1_1);

		final JxLabel label_1_1_1_1_1_1 = new JxLabel();
		label_1_1_1_1_1_1.setTheme(theme);

		label_1_1_1_1_1_1
				.setText("8. Dose resident feel the need to defecate ?");
		label_1_1_1_1_1_1.setBounds(10, 10, 405, 16);
		panel_2_1_1_1_1_1_1.add(label_1_1_1_1_1_1);

		rbQ8Yes = new JxRadioButton();
		rbQ8Yes.setTheme(theme);

		bgQ8.add(rbQ8Yes);

		rbQ8Yes.setActionCommand("1");
		rbQ8Yes.setText("Yes");
		rbQ8Yes.setBounds(475, 10, 56, 24);
		panel_2_1_1_1_1_1_1.add(rbQ8Yes);

		rbQ8No = new JxRadioButton();
		rbQ8No.setTheme(theme);

		bgQ8.add(rbQ8No);

		rbQ8No.setActionCommand("2");
		rbQ8No.setText("No");
		rbQ8No.setBounds(564, 10, 56, 24);
		panel_2_1_1_1_1_1_1.add(rbQ8No);

		final JxPanel panel_2_1_1_1_1_1_1_1 = new JxPanel();
		panel_2_1_1_1_1_1_1_1.setTheme(theme);
		panel_2_1_1_1_1_1_1_1.setLayout(null);

		panel_2_1_1_1_1_1_1_1.setBounds(10, 628, 878, 255);
		panelMain.add(panel_2_1_1_1_1_1_1_1);

		rbQ9Yes = new JxRadioButton();
		rbQ9Yes.setTheme(theme);

		rbQ9Yes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent arg0) {
				rbQ9AYes.setEnabled(true);
				rbQ9ANo.setEnabled(true);
				/* ERROR: A possiblity of NullPointerException */
				Global.panelResidentAssessmentFormPage10.setEnable(false);
			}
		});
		bgQ9.add(rbQ9Yes);

		rbQ9Yes.setActionCommand("1");
		rbQ9Yes.setText("Yes");
		rbQ9Yes.setBounds(475, 10, 56, 24);
		panel_2_1_1_1_1_1_1_1.add(rbQ9Yes);

		rbQ9No = new JxRadioButton();
		rbQ9No.setTheme(theme);

		rbQ9No.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				rbQ9AYes.setEnabled(false);
				rbQ9ANo.setEnabled(false);
				bgQ9A.clearSelection();
				/* ERROR: A possiblity of NullPointerException */
				Global.panelResidentAssessmentFormPage10.setEnable(true);
			}
		});
		bgQ9.add(rbQ9No);

		rbQ9No.setActionCommand("2");
		rbQ9No.setText("No");
		rbQ9No.setBounds(564, 10, 56, 24);
		panel_2_1_1_1_1_1_1_1.add(rbQ9No);

		final JxTextA txtQ9 = new JxTextA();
		txtQ9.setTheme(theme);

		txtQ9.setFontSize(13);

		txtQ9
				.setText("9. Does resident hava a diagnosis or condition that may inhibit elimination or continence training (e.g. spinal cord injury, debilitating terminal illness, comatose, urethral blockage, loss of bladder sensation, severe dementia, etc.) ?");
		txtQ9.setWrapStyleWord(true);
		txtQ9.setLineWrap(true);
		txtQ9.setEditable(false);
		txtQ9.setBounds(10, 14, 441, 66);
		panel_2_1_1_1_1_1_1_1.add(txtQ9);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);

		label_2.setText("New JxLabel");
		label_2.setBounds(37, 66, 258, 14);
		panel_2_1_1_1_1_1_1_1.add(label_2);

		final JxLabel ifYesAnserLabel = new JxLabel();
		ifYesAnserLabel.setTheme(theme);

		ifYesAnserLabel
				.setText("If Yes, answer question 9A. Do not answer question 11");
		ifYesAnserLabel.setBounds(10, 86, 441, 14);
		panel_2_1_1_1_1_1_1_1.add(ifYesAnserLabel);

		final JxTextA txtQ9_1 = new JxTextA();
		txtQ9_1.setTheme(theme);

		txtQ9_1.setFontSize(13);
		txtQ9_1.setWrapStyleWord(true);
		txtQ9_1
				.setText("9A. Does resident currently use an external catheter or intermittent catheterization and wish to continue with this method ?");
		txtQ9_1.setLineWrap(true);
		txtQ9_1.setEditable(false);

		txtQ9_1.setBounds(10, 112, 441, 32);
		panel_2_1_1_1_1_1_1_1.add(txtQ9_1);

		final JxLabel ifYesIncludeLabel = new JxLabel();
		ifYesIncludeLabel.setTheme(theme);

		ifYesIncludeLabel
				.setText("If Yes, Has MEDICAL RATIONALE FOR USE AND REQUIRES CARE PLAN ");
		ifYesIncludeLabel.setBounds(10, 154, 441, 14);
		panel_2_1_1_1_1_1_1_1.add(ifYesIncludeLabel);

		final JxLabel ifYesIncludeLabel_1 = new JxLabel();
		ifYesIncludeLabel_1.setTheme(theme);

		ifYesIncludeLabel_1
				.setText("If No, Include use of absorbent products in care plan.");
		ifYesIncludeLabel_1.setBounds(10, 180, 426, 14);
		panel_2_1_1_1_1_1_1_1.add(ifYesIncludeLabel_1);

		final JxLabel ifYesIncludeLabel_1_1 = new JxLabel();
		ifYesIncludeLabel_1_1.setTheme(theme);

		ifYesIncludeLabel_1_1.setText("Do not answer question 11.");
		ifYesIncludeLabel_1_1.setBounds(10, 195, 426, 14);
		panel_2_1_1_1_1_1_1_1.add(ifYesIncludeLabel_1_1);

		final JxLabel ifYesIncludeLabel_1_2 = new JxLabel();
		ifYesIncludeLabel_1_2.setTheme(theme);

		ifYesIncludeLabel_1_2.setText("If No, continue with question 10.");
		ifYesIncludeLabel_1_2.setBounds(10, 225, 426, 14);
		panel_2_1_1_1_1_1_1_1.add(ifYesIncludeLabel_1_2);

		rbQ9AYes = new JxRadioButton();
		rbQ9AYes.setTheme(theme);

		rbQ9AYes.setActionCommand("1");

		rbQ9AYes.setText("Yes");
		bgQ9A.add(rbQ9AYes);
		rbQ9AYes.setBounds(475, 108, 67, 22);
		panel_2_1_1_1_1_1_1_1.add(rbQ9AYes);

		rbQ9ANo = new JxRadioButton();
		rbQ9ANo.setTheme(theme);
		rbQ9ANo.setActionCommand("2");

		rbQ9ANo.setText("No");
		bgQ9A.add(rbQ9ANo);
		rbQ9ANo.setBounds(564, 108, 56, 22);
		panel_2_1_1_1_1_1_1_1.add(rbQ9ANo);

		final JxPanel panel_2_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_2_1_1_1_1_1_1_1_1.setTheme(theme);

		panel_2_1_1_1_1_1_1_1_1.setLayout(null);

		panel_2_1_1_1_1_1_1_1_1.setBounds(10, 889, 878, 107);
		panelMain.add(panel_2_1_1_1_1_1_1_1_1);

		rbQ10Yes = new JxRadioButton();
		rbQ10Yes.setTheme(theme);

		bgQ10.add(rbQ10Yes);

		rbQ10Yes.setActionCommand("1");
		rbQ10Yes.setText("Yes");
		rbQ10Yes.setBounds(475, 10, 56, 24);
		panel_2_1_1_1_1_1_1_1_1.add(rbQ10Yes);

		rbQ10No = new JxRadioButton();
		rbQ10No.setTheme(theme);

		bgQ10.add(rbQ10No);

		rbQ10No.setActionCommand("2");
		rbQ10No.setText("No");
		rbQ10No.setBounds(564, 10, 56, 24);
		panel_2_1_1_1_1_1_1_1_1.add(rbQ10No);

		final JxTextA txtQ9_2 = new JxTextA();
		txtQ9_2.setTheme(theme);

		txtQ9_2.setFontSize(13);
		txtQ9_2.setWrapStyleWord(true);
		txtQ9_2
				.setText("10. Does resident have desire to participate in continence training ?");
		txtQ9_2.setLineWrap(true);
		txtQ9_2.setEditable(false);

		txtQ9_2.setBounds(10, 14, 441, 24);
		panel_2_1_1_1_1_1_1_1_1.add(txtQ9_2);

		final JxLabel ifYesAnserLabel_1 = new JxLabel();
		ifYesAnserLabel_1.setTheme(theme);

		ifYesAnserLabel_1.setText("If Yes, complete question 11");
		ifYesAnserLabel_1.setBounds(10, 40, 441, 14);
		panel_2_1_1_1_1_1_1_1_1.add(ifYesAnserLabel_1);

		final JxLabel ifYesIncludeLabel_2 = new JxLabel();
		ifYesIncludeLabel_2.setTheme(theme);

		ifYesIncludeLabel_2
				.setText("If No, plan of care to include absorbant products.");
		ifYesIncludeLabel_2.setBounds(10, 60, 426, 14);
		panel_2_1_1_1_1_1_1_1_1.add(ifYesIncludeLabel_2);

		final JxLabel ifYesIncludeLabel_1_2_1 = new JxLabel();
		ifYesIncludeLabel_1_2_1.setTheme(theme);

		ifYesIncludeLabel_1_2_1.setText("Do not answer question 11");
		ifYesIncludeLabel_1_2_1.setBounds(10, 80, 426, 14);
		panel_2_1_1_1_1_1_1_1_1.add(ifYesIncludeLabel_1_2_1);

		panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setLayout(null);

		panel_5.setBounds(10, 1002, 853, 30);
		panelMain.add(panel_5);

		ifSoWhatLabel = new JxLabel();
		ifSoWhatLabel.setTheme(theme);

		ifSoWhatLabel.setText("Nurse Signature:");
		ifSoWhatLabel.setBounds(10, 5, 91, 16);
		panel_5.add(ifSoWhatLabel);

		cmbNurse = new JxComboBox();
		cmbNurse.setTheme(theme);

		cmbNurse.setBounds(123, 4, 205, 20);

		panel_5.add(cmbNurse);

		dateLabel = new JxLabel();
		dateLabel.setTheme(theme);

		dateLabel.setText("Date :");
		dateLabel.setBounds(532, 5, 42, 16);
		panel_5.add(dateLabel);

		dcNurseVisit = new JxDateChooser();
		dcNurseVisit.setTheme(theme);

		dcNurseVisit.setDateFormatString("MM/dd/yyyy");
		dcNurseVisit.setDate(MedrexClientManager.getServerTime());
		;
		// dcNurseVisit.setToolTipText(MedrexClientManager.getServerTime().toString());

		dcNurseVisit.setBounds(565, 1, 168, 26);
		panel_5.add(dcNurseVisit);

		final PanelloggedInUser panel = new PanelloggedInUser();
		panel.setBounds(120, 0, 331, 23);
		panel_5.add(panel);

		cbNA = new JxCheckBox();
		cbNA.setTheme(theme);

		cbNA.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				setDisable();
			}
		});

		cbNA.setText("N/A");
		cbNA.setBounds(32, 30, 43, 24);
		add(cbNA);
		doLoad();

	}

	public void setDisable() {
		if (cbNA.isSelected()) {
			layerUI.setLocked(true);
		} else {
			layerUI.setLocked(false);
		}
	}

	public void doLoad() {
		rbQ9AYes.setEnabled(false);
		rbQ9ANo.setEnabled(false);
		fillCombos();
		doUpdate();
		if (Global.panelResidentAssessmentFormPage1 != null) {
			PanelResidentAssessmentFormPage1 refp1 = Global.panelResidentAssessmentFormPage1;
			if ((refp1.isContinent()) && refp1 != null) {
				layerUI.setLocked(true);
				cbNA.setSelected(true);
			} else {
				cbNA.setSelected(false);
				layerUI.setLocked(false);
			}
		} else {
			layerUI.setLocked(false);
		}
	}

	public void fillCombos() {
		cmbQ1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "",
				"Less Than a Week", "More Than a Week", "A Month Or More" }));

		cmbQ2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "",
				"Less Than a Week", "More Than a Week", "A Month Or More" }));

		// UserLogon ul = new UserLogon();
		// try {
		// ul = MedrexClientManager.getInstance().getcurrentUserLogon();
		// } catch (RemoteException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (MedrexException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// Users user = new Users();
		// try {
		// user = MedrexClientManager.getInstance().getUser(ul.getUserId());
		// } catch (RemoteException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (MedrexException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// cmbNurse.addItem(user.getUserName());

		try {
			List<Nurse> nurList = MedrexClientManager.getInstance()
					.getNurseRecords();
			Iterator<Nurse> i = nurList.iterator();
			while (i.hasNext()) {
				Nurse nur = i.next();
				cmbNurse.addItem(nur.getNurseSurName() + " , "
						+ nur.getNurseName());
				cmbNurse.setVisible(false);
			}
		} catch (Exception e) {
		}
	}

	public void doUpdate() {
		int resId = Global.currentResidenceKey;
		ResidentMain rm = null;
		try {
			rm = MedrexClientManager.getInstance().getResident(resId);
			lblName.setText(rm.getUserName() + " " + rm.getUserPass());
			/* TODO: Migrating to room history */
			// lblRoomNum.setText(rm.getRoom());
		} catch (Exception e) {

		}

		if (Global.currentResidentAssessmentFormKey == 0) {

			TempRoomHistory roomHist = null;
			try {
				roomHist = MedrexClientManager.getInstance()
						.getCurrentRoomForResident(resId);
			} catch (Exception e) {
				e.printStackTrace();
			}
			/* TODO: Migrating to room history ----- Done */
			if (roomHist != null) {
				lblRoomNum.setText(roomHist.getRoom());
			}

			Global.currentResidentAssessmentFormPage9Key = 0;

			SwingUtils.setSelectedButton(bgQ3, 0);
			SwingUtils.setSelectedButton(bgQ4, 0);
			SwingUtils.setSelectedButton(bgQ5, 0);
			SwingUtils.setSelectedButton(bgQ6, 0);
			SwingUtils.setSelectedButton(bgQ7, 0);
			SwingUtils.setSelectedButton(bgQ8, 0);
			SwingUtils.setSelectedButton(bgQ9, 0);
			SwingUtils.setSelectedButton(bgQ9A, 0);
			SwingUtils.setSelectedButton(bgQ10, 0);

			cmbQ1.setSelectedItem("");
			cmbQ2.setSelectedItem("");
			txtQ3.setNotes(notesTq3);
			txtQ4.setNotes(notesQ4);
			txtQ6.setNotes(notesQ6);
			// cbNA.setSelected(false);

			/*
			 * Users users = null;
			 * 
			 * try { users =MedrexClientManager.getInstance().getUser(Global.
			 * currentLoggedInUserKey);
			 * 
			 * if (users.getUserType().equalsIgnoreCase("Nurse")) {
			 * 
			 * Nurse n = (Nurse)
			 * MedrexClientManager.getInstance().getNurseRecord(users
			 * .getUserId());
			 * 
			 * cmbNurse.removeAllItems();
			 * 
			 * cmbNurse.addItem(n.getNurseName() + " " + n.getNurseSurName());
			 * 
			 * }
			 * 
			 * else { cmbNurse.removeAllItems();
			 * 
			 * cmbNurse.addItem(""); } } catch (Exception e) {
			 * e.printStackTrace(); }
			 */

		} else {
			ResidentAssessmentFormPage9 rafp9 = null;
			try {
				rafp9 = MedrexClientManager.getInstance()
						.getResidentAssessmentFormPage9(
								Global.currentResidentAssessmentFormKey);
			} catch (Exception e) {

			}
			Global.currentResidentAssessmentFormPage9Key = rafp9.getSerial();

			System.out.println("bool :" + rafp9.isEnable());

			cbNA.setSelected(rafp9.isEnable());

			dcNurseVisit.setDate(rafp9.getNurseVisit());
			// dcNurseVisit.setToolTipText(rafp9.getNurseVisit().toString());
			cmbNurse.setSelectedItem(rafp9.getNurse());

			// SwingUtils.setSelectedButton(bgQ3, rafp9.getAnswerQ3());

			switch (rafp9.getAnswerQ3()) {
			case 1:
				rbQ3Yes.setSelected(true);
				txtQ3.setEditableNotes(true);
				txtQ3.setNotes(txtQ3.getNotes());

				break;
			case 2:
				rbQ3No.setSelected(true);
				txtQ3.setEditableNotes(false);

				break;
			}

			// SwingUtils.setSelectedButton(bgQ4, rafp9.getAnswerQ4());
			switch (rafp9.getAnswerQ4()) {
			case 1:
				rbQ4Yes.setSelected(true);
				txtQ4.setEditableNotes(true);
				txtQ4.setNotes(txtQ4.getNotes());

				break;
			case 2:
				rbQ4No.setSelected(true);
				txtQ4.setEditableNotes(false);

				break;
			}

			SwingUtils.setSelectedButton(bgQ5, rafp9.getAnswerQ5());
			SwingUtils.setSelectedButton(bgQ6, rafp9.getAnswerQ6());

			switch (rafp9.getAnswerQ6()) {
			case 1:
				rbQ6Yes.setSelected(true);
				txtQ6.setEditableNotes(true);
				txtQ6.setNotes(txtQ6.getNotes());

				break;
			case 2:
				rbQ6No.setSelected(true);
				txtQ6.setEditableNotes(false);

				break;
			}

			SwingUtils.setSelectedButton(bgQ7, rafp9.getAnswerQ7());
			SwingUtils.setSelectedButton(bgQ8, rafp9.getAnswerQ8());
			SwingUtils.setSelectedButton(bgQ9, rafp9.getAnswerQ9());
			SwingUtils.setSelectedButton(bgQ9A, rafp9.getAnswerQ9A());
			SwingUtils.setSelectedButton(bgQ10, rafp9.getAnswerQ10());

			if (rafp9.getAnswerQ9() == 1) {
				rbQ9AYes.setEnabled(true);
				rbQ9ANo.setEnabled(true);
			}

			cmbQ1.setSelectedItem(rafp9.getAnswerQ1Text());
			cmbQ2.setSelectedItem(rafp9.getAnswerQ2Text());
			txtQ3.setNotes(rafp9.getAnswerQ3Text());
			txtQ4.setNotes(rafp9.getAnswerQ4Text());
			txtQ6.setNotes(rafp9.getAnswerQ6Text());
			lblName.setText(rafp9.getResidentName());
			lblRoomNum.setText(rafp9.getRoomNo());
			setDisable();

		}

	}

	public int doSave() {
		ResidentAssessmentFormPage9 rafp9 = new ResidentAssessmentFormPage9();

		rafp9.setSerial(Global.currentResidentAssessmentFormPage9Key);
		rafp9.setFormId(Global.currentResidentAssessmentFormKey);

		rafp9.setNurseVisit(dcNurseVisit.getDate());
		rafp9.setNurse((String) cmbNurse.getSelectedItem());

		rafp9.setAnswerQ3(SwingUtils.getSelectedButton(bgQ3));
		rafp9.setAnswerQ4(SwingUtils.getSelectedButton(bgQ4));
		rafp9.setAnswerQ5(SwingUtils.getSelectedButton(bgQ5));
		rafp9.setAnswerQ6(SwingUtils.getSelectedButton(bgQ6));
		rafp9.setAnswerQ7(SwingUtils.getSelectedButton(bgQ7));
		rafp9.setAnswerQ8(SwingUtils.getSelectedButton(bgQ8));
		rafp9.setAnswerQ9(SwingUtils.getSelectedButton(bgQ9));
		rafp9.setAnswerQ9A(SwingUtils.getSelectedButton(bgQ9A));
		rafp9.setAnswerQ10(SwingUtils.getSelectedButton(bgQ10));

		rafp9.setAnswerQ1Text((String) cmbQ1.getSelectedItem());
		rafp9.setAnswerQ2Text((String) cmbQ2.getSelectedItem());
		rafp9.setAnswerQ3Text(txtQ3.getNotes());
		rafp9.setAnswerQ4Text(txtQ4.getNotes());
		rafp9.setAnswerQ6Text(txtQ6.getNotes());
		rafp9.setEnable(cbNA.isSelected());
		rafp9.setResidentName(lblName.getText());
		rafp9.setRoomNo(lblRoomNum.getText());

		try {
			Global.currentResidentAssessmentFormPage9Key = MedrexClientManager
					.getInstance().insertOrUpdateResidentAssessmentFormPage9(
							rafp9);

			// for sending trigger word message
			String str = txtQ3.getTriggerWord();
			if (str == null) {
				str = txtQ4.getTriggerWord();
			} else {
				str += txtQ4.getTriggerWord();
			}
			if (str == null) {
				str = txtQ6.getTriggerWord();
			} else {
				str += txtQ6.getTriggerWord();
			}

			if (str != null) {
				txtQ6.sendMail(str);
			}

			return (0);
		} catch (Exception e) {
			return (0);

		}
	}

	public boolean doValidate() {
		// TODO Auto-generated method stub
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;

		// if (!FieldValidation.isEmpty(temp =
		// FieldValidation.isNonEmptyAlphaField(
		// lblName, "Resident Name", 0, 25))) {
		// vRes.addAllFrom(temp);
		// }
		if (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(
				cmbQ1, "Incontinent of urine"))) {
			vRes.addAllFrom(temp);
		}
		if (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(
				cmbQ2, "Incontinent of stool"))) {
			vRes.addAllFrom(temp);
		}

		// System.out.println(FieldValidation.getMessages(vRes.getMessages()));
		if (!FieldValidation.isEmpty(vRes)) {
			FieldValidation.Msgbox(vRes, "Resident Assessment Form: Page 9");
			return false;
		} else {
			return true;
		}
	}

}
