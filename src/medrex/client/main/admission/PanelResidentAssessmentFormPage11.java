package medrex.client.main.admission;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldValidation;
import medrex.client.utils.SwingUtils;
import medrex.commons.intf.Form;
import medrex.commons.vo.admission.ResidentAssessmentFormPage11;
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
import com.sX.swing.JxText;
import com.sX.swing.JxTextA;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelResidentAssessmentFormPage11 extends JxPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7196776759414944885L;

	Theme theme = new BlackOverWhiteTheme();

	Font font_Plain = new Font("Arial", Font.PLAIN, 11);
	Font font_Bold = new Font("Arial", Font.BOLD, 11);

	private JxCheckBox chNa;
	private JxLabel lblFoleySize;
	private JxLabel lblCatherType;
	private JxCheckBox cbObstructiveCheckBox;
	private JxPanel panelMain;
	private JxRadioButton rbUTINo;
	private JxRadioButton rbUTIYes;
	private JxText textField;
	private JxLabel lblRoom;
	private JxDateChooser dcNurseVisit;
	private JxLabel dateLabel;
	private JxComboBox cmbNurse;
	private JxLabel ifSoWhatLabel;
	private JxPanel panel_2;
	private ButtonGroup bgUTI = new ButtonGroup();
	private JxLabel lblResidentName;
	JxCheckBox txtExclusionsUrinary;
	JxCheckBox cbExclusionsUrinary;
	JxCheckBox cbExclusionsContamination;
	JxCheckBox cbExclusionsTerminal;
	// JxComboBox cmbNurse1;
	// JxCheckBox cbConditionsNotApply;
	JxCheckBox cbConditionNotApplyHasUTI;
	JxCheckBox cbConditionNotApplyNoUTI;
	JxComboBox cmbNurse2;
	JxDateChooser dateChooser;
	private JXLayer<JxPanel> layerContent;
	private LockableUI layerUI;
	private JxLabel lblImage;
	private JxPanel panelGlass;
	private JxCheckBox onlyIfCantCheckBox;

	public PanelResidentAssessmentFormPage11() {
		super();

		Global.panelResidentAssessmentFormPage11 = this;
		setLayout(null);

		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(930, 900));

		final JxLabel incontinenceAssessmentLabel = new JxLabel();
		incontinenceAssessmentLabel.setTheme(theme);
		incontinenceAssessmentLabel.setFontSize(18);

		incontinenceAssessmentLabel.setFontStyle(Font.BOLD);
		incontinenceAssessmentLabel
				.setText("INDWELLING URINARY CATHETER ASSESSMENT");
		incontinenceAssessmentLabel.setBounds(230, 10, 500, 16);
		add(incontinenceAssessmentLabel);

		panelMain = new JxPanel();
		panelMain.setTheme(theme);

		panelMain.setLayout(null);
		panelMain.setOpaque(false);
		panelMain.setBounds(32, 28, 898, 801);
		panelMain.setPreferredSize(new Dimension(898, 801));

		panelGlass = new JxPanel();

		panelGlass.setOpaque(false);
		panelGlass.setLayout(null);
		panelGlass.setBounds(0, 0, 920, 838);

		lblImage = new JxLabel(new ImageIcon("img//residentassessment//NA.png"));
		lblImage.setBounds(200, 100, 500, 500);
		// lblImage.setBorder(new LineBorder(Color.BLACK));

		layerUI = new LockableUI(new BufferedImageOpEffect(new GrayFilter()));
		// layerUI.getLayer().add(lblImage);
		layerContent = new JXLayer<JxPanel>(panelMain);
		// layerContent.getGlassPane().add(panelMain);
		layerContent.setGlassPane(panelGlass);
		layerContent.getGlassPane().add(lblImage);
		layerContent.setUI(layerUI);
		layerContent.setLayout(null);
		layerContent.setBounds(0, 45, 920, 838);
		add(layerContent);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBounds(0, 0, 888, 760);
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setLayout(null);

		panelMain.add(panel);

		final JxLabel residentNameLabel = new JxLabel();
		residentNameLabel.setTheme(theme);
		residentNameLabel.setText("Resident Name:");
		residentNameLabel.setBounds(39, 26, 99, 16);
		panel.add(residentNameLabel);

		lblResidentName = new JxLabel();
		lblResidentName.setTheme(theme);

		lblResidentName.setBounds(144, 24, 243, 20);
		panel.add(lblResidentName);

		final JxLabel residentNameLabel_1 = new JxLabel();
		residentNameLabel_1.setTheme(theme);
		residentNameLabel_1.setText("Date :");
		residentNameLabel_1.setBounds(420, 27, 48, 16);
		panel.add(residentNameLabel_1);

		dateChooser = new JxDateChooser();
		dateChooser.setTheme(theme);

		dateChooser.setFontSize(12);
		dateChooser.setFontStyle(Font.BOLD);
		dateChooser.setDateFormatString("MM/dd/yyyy");
		dateChooser.setBounds(474, 22, 151, 20);
		panel.add(dateChooser);

		final JxTextA thePurposeOfTextArea = new JxTextA();
		thePurposeOfTextArea.setTheme(theme);

		thePurposeOfTextArea.setWrapStyleWord(true);
		thePurposeOfTextArea.setEditable(false);
		thePurposeOfTextArea.setLineWrap(true);
		thePurposeOfTextArea
				.setText("The purpose of this assessment is to determine if there is clinical justification to support the initiation and/or continued need for catheter use or if the catheter can be removed successfully.");
		thePurposeOfTextArea.setBounds(39, 73, 772, 47);
		panel.add(thePurposeOfTextArea);

		final JxLabel exclusionscheckAllLabel = new JxLabel();
		exclusionscheckAllLabel.setTheme(theme);

		exclusionscheckAllLabel.setFontSize(12);
		exclusionscheckAllLabel.setFontStyle(Font.BOLD);
		exclusionscheckAllLabel.setText("Exclusions: (check all that apply)");
		exclusionscheckAllLabel.setBounds(39, 151, 236, 14);
		panel.add(exclusionscheckAllLabel);

		cbExclusionsUrinary = new JxCheckBox();
		cbExclusionsUrinary.setTheme(theme);

		cbExclusionsUrinary.setText("Neurogenic Bladder");
		cbExclusionsUrinary.setBounds(39, 185, 243, 18);
		panel.add(cbExclusionsUrinary);

		cbExclusionsContamination = new JxCheckBox();
		cbExclusionsContamination.setTheme(theme);

		cbExclusionsContamination
				.setText("Presence of Stage III or IV pressure ulcer.");
		cbExclusionsContamination.setBounds(39, 209, 711, 18);
		panel.add(cbExclusionsContamination);

		cbExclusionsTerminal = new JxCheckBox();
		cbExclusionsTerminal.setTheme(theme);

		cbExclusionsTerminal
				.setText("Terminal illness or severe impairment associated with intractable pain.");
		cbExclusionsTerminal.setBounds(39, 233, 711, 18);
		panel.add(cbExclusionsTerminal);

		// cmbNurse1 = new JxComboBox();
		// cmbNurse1.setTheme (theme);

		// cmbNurse1.setBounds(474, 319, 151, 21);
		// panel.add(cmbNurse1);

		/*
		 * cbConditionsNotApply = new JxCheckBox();
		 * cbConditionsNotApply.setFont(new Font("Dialog", Font.BOLD, 12));
		 * cbConditionsNotApply.setBackground(Color.WHITE); cbConditionsNotApply
		 * .setText(
		 * "<html>One or more of the above conditions does not apply. Further assessment is indicated to determine if the indwelling catheter can be removed<br> successfully.</html>"
		 * ); cbConditionsNotApply.setBounds(10, 383, 870, 29);
		 * panel.add(cbConditionsNotApply);
		 */

		cbConditionNotApplyHasUTI = new JxCheckBox();
		cbConditionNotApplyHasUTI.setTheme(theme);

		cbConditionNotApplyHasUTI.setBounds(39, 331, 20, 18);
		panel.add(cbConditionNotApplyHasUTI);

		final JxLabel theResidentHasLabel = new JxLabel();
		theResidentHasLabel.setTheme(theme);

		theResidentHasLabel.setText("The resident has signs/symptoms of a UTI");
		theResidentHasLabel.setBounds(76, 335, 392, 14);
		panel.add(theResidentHasLabel);

		final JxLabel uacsResultsLabel = new JxLabel();
		uacsResultsLabel.setTheme(theme);

		uacsResultsLabel.setText("UA/C&S results");
		uacsResultsLabel.setBounds(39, 375, 99, 14);
		panel.add(uacsResultsLabel);

		textField = new JxText();
		textField.setTheme(theme);

		textField.setBounds(167, 375, 392, 21);
		panel.add(textField);

		cbConditionNotApplyNoUTI = new JxCheckBox();
		cbConditionNotApplyNoUTI.setTheme(theme);

		cbConditionNotApplyNoUTI.setBounds(39, 470, 20, 18);
		panel.add(cbConditionNotApplyNoUTI);

		final JxLabel theResidentDoesLabel = new JxLabel();
		theResidentDoesLabel.setTheme(theme);

		theResidentDoesLabel
				.setText("The resident does not have signs / symptoms of UTI");
		theResidentDoesLabel.setBounds(76, 470, 442, 14);
		panel.add(theResidentDoesLabel);

		final JxLabel ifTheResidentLabel = new JxLabel();
		ifTheResidentLabel.setTheme(theme);

		ifTheResidentLabel
				.setText("If the resident does not have a UTI or , upon completion of treatment for a UTI, consult the physician for catheter removal.");
		ifTheResidentLabel.setBounds(39, 509, 620, 14);
		panel.add(ifTheResidentLabel);

		final JxLabel ifPositiveForLabel = new JxLabel();
		ifPositiveForLabel.setTheme(theme);

		ifPositiveForLabel
				.setText("If positive for a UTI, has treatment been ordered by physician ?");
		ifPositiveForLabel.setBounds(39, 423, 348, 14);
		panel.add(ifPositiveForLabel);

		rbUTIYes = new JxRadioButton();
		rbUTIYes.setTheme(theme);

		bgUTI.add(rbUTIYes);
		rbUTIYes.setActionCommand("1");

		rbUTIYes.setText("Yes");
		rbUTIYes.setBounds(420, 423, 48, 18);
		panel.add(rbUTIYes);

		rbUTINo = new JxRadioButton();
		rbUTINo.setTheme(theme);

		bgUTI.add(rbUTINo);

		rbUTINo.setText("No");
		rbUTINo.setBounds(474, 423, 41, 18);
		panel.add(rbUTINo);

		final JxLabel ifTheResidentLabel_1 = new JxLabel();
		ifTheResidentLabel_1.setTheme(theme);

		ifTheResidentLabel_1
				.setText("If the resident is unable to void for 4 hours after the removal of the catheter, Reinsert,Assess for bladder distention  and notify the physician");
		ifTheResidentLabel_1.setBounds(39, 554, 711, 14);
		panel.add(ifTheResidentLabel_1);

		final JxLabel ifTheResidentLabel_1_1 = new JxLabel();
		ifTheResidentLabel_1_1.setTheme(theme);

		ifTheResidentLabel_1_1
				.setText("If the resident has voided, assess the voiding pattern , amount voided, assess for bladder distention and the characteristics of urine.");
		ifTheResidentLabel_1_1.setBounds(39, 592, 812, 14);
		panel.add(ifTheResidentLabel_1_1);

		final JxLabel ifTheResidentLabel_1_1_1 = new JxLabel();
		ifTheResidentLabel_1_1_1.setTheme(theme);

		ifTheResidentLabel_1_1_1
				.setText("If the resident is experiencing incontinence, complete the Incontinence Management Assessment");
		ifTheResidentLabel_1_1_1.setBounds(39, 632, 620, 14);
		panel.add(ifTheResidentLabel_1_1_1);

		cmbNurse2 = new JxComboBox();
		cmbNurse2.setTheme(theme);

		cmbNurse2.setBounds(474, 689, 151, 21);
		panel.add(cmbNurse2);

		final JxLabel nurseLabel_1 = new JxLabel();
		nurseLabel_1.setTheme(theme);

		nurseLabel_1.setText("Nurse");
		nurseLabel_1.setBounds(583, 716, 41, 14);
		panel.add(nurseLabel_1);

		final JxLabel roomLabel = new JxLabel();
		roomLabel.setTheme(theme);
		roomLabel.setText("Room :");
		roomLabel.setBounds(667, 27, 54, 14);
		panel.add(roomLabel);

		lblRoom = new JxLabel();
		lblRoom.setTheme(theme);
		lblRoom.setBounds(714, 25, 77, 18);

		lblRoom.setFontStyle(Font.BOLD);
		panel.add(lblRoom);

		final JxLabel catheterTypeLabel = new JxLabel();
		catheterTypeLabel.setTheme(theme);

		catheterTypeLabel.setFontSize(12);
		catheterTypeLabel.setFontStyle(Font.BOLD);
		catheterTypeLabel.setText("Catheter Type:");
		catheterTypeLabel.setBounds(40, 125, 99, 14);
		panel.add(catheterTypeLabel);

		cbObstructiveCheckBox = new JxCheckBox();
		cbObstructiveCheckBox.setTheme(theme);

		cbObstructiveCheckBox
				.setText("Obstructive uropathy with urinary retention.");
		cbObstructiveCheckBox.setBounds(39, 254, 306, 22);
		panel.add(cbObstructiveCheckBox);

		lblCatherType = new JxLabel();
		lblCatherType.setTheme(theme);

		lblCatherType.setFontSize(12);
		lblCatherType.setFontStyle(Font.BOLD);
		lblCatherType.setText("");
		lblCatherType.setBounds(136, 126, 86, 14);
		panel.add(lblCatherType);

		lblFoleySize = new JxLabel();
		lblFoleySize.setTheme(theme);

		lblFoleySize.setFontSize(12);
		lblFoleySize.setFontStyle(Font.BOLD);
		lblFoleySize.setText("");
		lblFoleySize.setBounds(228, 126, 54, 14);
		panel.add(lblFoleySize);

		/*
		 * final JxLabel oneOrMoreLabel = new JxLabel(); oneOrMoreLabel.setTheme
		 * (theme);oneOrMoreLabel.setText(
		 * "One or more of the above conditions apply. The indwelling catheter is clinically appropriate"
		 * ); oneOrMoreLabel.setBounds(39, 324, 586, 16);
		 * panel.add(oneOrMoreLabel);
		 */

		chNa = new JxCheckBox();
		chNa.setTheme(theme);

		chNa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chNa.isSelected()) {
					JOptionPane.showMessageDialog(null,
							"Assess To Remove Catheter");
				}
			}
		});

		chNa.setText("N/A");
		chNa.setBounds(39, 278, 118, 24);
		panel.add(chNa);

		panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setBounds(0, 766, 898, 30);
		panelMain.add(panel_2);
		panel_2.setLayout(null);

		ifSoWhatLabel = new JxLabel();
		ifSoWhatLabel.setTheme(theme);

		ifSoWhatLabel.setText("Nurse Signature:");
		ifSoWhatLabel.setBounds(21, 5, 91, 16);
		panel_2.add(ifSoWhatLabel);

		cmbNurse = new JxComboBox();
		cmbNurse.setTheme(theme);

		cmbNurse.setBounds(123, 4, 205, 20);
		panel_2.add(cmbNurse);

		dateLabel = new JxLabel();
		dateLabel.setTheme(theme);

		dateLabel.setText("Date :");
		dateLabel.setBounds(595, 5, 42, 16);
		panel_2.add(dateLabel);

		dcNurseVisit = new JxDateChooser();
		dcNurseVisit.setTheme(theme);
		dcNurseVisit.setDate(MedrexClientManager.getServerTime());
		dcNurseVisit.setDateFormatString("MM/dd/yyyy");
		dcNurseVisit.setBounds(628, 1, 168, 26);
		panel_2.add(dcNurseVisit);

		final PanelloggedInUser panel_1 = new PanelloggedInUser();
		panel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_1.setBounds(118, 3, 291, 24);
		panel_2.add(panel_1);

		onlyIfCantCheckBox = new JxCheckBox();
		onlyIfCantCheckBox.setTheme(theme);
		onlyIfCantCheckBox
				.setActionCommand("Only If Can<html><body><h1>' </h1></body></html>t");
		/*
		 * onlyIfCantCheckBox.addMouseListener(new MouseAdapter() { public void
		 * mouseClicked(final MouseEvent arg0) { if
		 * (onlyIfCantCheckBox.isSelected()) { enablePage(); } else {
		 * disablePage(); } } });
		 */
		onlyIfCantCheckBox.setEnabled(false);

		onlyIfCantCheckBox.setText("Only If Cantheter");
		onlyIfCantCheckBox.setBounds(30, 20, 119, 22);
		add(onlyIfCantCheckBox);

		doLoad();
	}

	public void doLoad() {
		fillCombos();
		doUpdate();
		PanelResidentAssessmentFormPage1 refp1 = Global.panelResidentAssessmentFormPage1;

		if (refp1.isCatheter()) {
			enablePage();
			if (refp1.getCatherType().equalsIgnoreCase("Foley")) {
				lblFoleySize.setText(refp1.getFoleySize() + "");
				lblCatherType.setText(refp1.getCatherType());
			} else {
				lblCatherType.setText(refp1.getCatherType());
				lblFoleySize.setText("");
			}
		} else {
			disablePage();
			lblCatherType.setText("");
			lblFoleySize.setText("");
		}
	}

	private void enablePage() {
		layerUI.setLocked(false);
		lblImage.setVisible(false);
		onlyIfCantCheckBox.setSelected(false);
	}

	private void disablePage() {
		layerUI.setLocked(true);
		lblImage.setVisible(true);
		onlyIfCantCheckBox.setSelected(true);
	}

	public void fillCombos() {
		/*
		 * cmbNurse1.setModel(new javax.swing.DefaultComboBoxModel(new String[]
		 * { "Julie", "Sue", "Mary", "Jenny" })); cmbNurse2.setModel(new
		 * javax.swing.DefaultComboBoxModel(new String[] { "Julie", "Sue",
		 * "Mary", "Jenny" }));
		 */
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
		// try {
		// List<Nurse>
		// nurList=MedrexClientManager.getInstance().getNurseRecords();
		// Iterator<Nurse> i= nurList.iterator();
		// while(i.hasNext()){
		// Nurse nur=i.next();
		// cmbNurse.addItem(nur.getNurseSurName()+" , "+nur.getNurseName());
		// cmbNurse1.addItem(nur.getNurseSurName()+" , "+nur.getNurseName());
		// cmbNurse2.addItem(nur.getNurseSurName()+" , "+nur.getNurseName());
		// cmbNurse2.setVisible(false);
		// cmbNurse.setVisible(false);
		// }
		// }catch (Exception e) {
		// }
	}

	public void doUpdate() {
		int resId = Global.currentResidenceKey;
		TempRoomHistory roomHist = null;
		ResidentMain rm = null;
		try {
			rm = MedrexClientManager.getInstance().getResident(resId);
			roomHist = MedrexClientManager.getInstance()
					.getCurrentRoomForResident(resId);
			lblResidentName.setText(rm.getUserName() + " " + rm.getUserPass());
			/* TODO: Migrating to room history */
			// lblRoom.setText(rm.getRoom());
			if (roomHist != null) {
				lblRoom.setText(roomHist.getRoom());
			}
		} catch (Exception e) {

		}

		if (Global.currentResidentAssessmentFormKey == 0) {
			Global.currentResidentAssessmentFormPage11Key = 0;
			dateChooser.setDate(MedrexClientManager.getServerTime());

			cbExclusionsUrinary.setSelected(false);
			cbObstructiveCheckBox.setSelected(false);
			cbExclusionsContamination.setSelected(false);
			cbExclusionsTerminal.setSelected(false);
			// cmbNurse1.setSelectedItem("");
			// cbConditionsNotApply.setSelected(false);
			cbConditionNotApplyHasUTI.setSelected(false);
			cbConditionNotApplyNoUTI.setSelected(false);
			SwingUtils.setSelectedButton(bgUTI, 0);
			cmbNurse2.setSelectedItem("");
			// txtExclusionsUrinary.setText("");

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
			 * .getSerial());
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
			ResidentAssessmentFormPage11 rafp11 = null;
			try {
				rafp11 = MedrexClientManager.getInstance()
						.getResidentAssessmentFormPage11(
								Global.currentResidentAssessmentFormKey);
			} catch (Exception e) {

			}
			Global.currentResidentAssessmentFormPage11Key = rafp11.getSerial();

			dcNurseVisit.setDate(rafp11.getNurseVisit());
			cmbNurse.setSelectedItem(rafp11.getNurse());

			dateChooser.setDate(rafp11.getDateAssessment());
			cbExclusionsUrinary.setSelected(rafp11.isExclusionUrinary());
			cbExclusionsContamination.setSelected(rafp11
					.isExclusionContamination());
			cbExclusionsTerminal.setSelected(rafp11.isExclusionTerminal());
			// cbConditionsApply.setSelected(rafp11.isConditionApply());
			// cmbNurse1.setSelectedItem(rafp11.getNurse1());
			// cbConditionsNotApply.setSelected(rafp11.isConditionNotApply());
			cbConditionNotApplyHasUTI.setSelected(rafp11
					.isConditionNotApplyUTI());
			cbConditionNotApplyNoUTI.setSelected(rafp11
					.isConditionNotApplyNoUTI());
			SwingUtils.setSelectedButton(bgUTI, rafp11.getPositiveUTI());
			cmbNurse2.setSelectedItem(rafp11.getNurse2());
			// txtExclusionsUrinary.setText(rafp11.)
			lblResidentName.setText(rafp11.getResidentName());
			cbObstructiveCheckBox.setSelected(rafp11.isObstructive());

		}

	}

	public int doSave() {
		ResidentAssessmentFormPage11 rafp11 = new ResidentAssessmentFormPage11();

		rafp11.setSerial(Global.currentResidentAssessmentFormPage11Key);
		rafp11.setFormId(Global.currentResidentAssessmentFormKey);

		rafp11.setNurseVisit(dcNurseVisit.getDate());
		rafp11.setNurse((String) cmbNurse.getSelectedItem());

		rafp11.setDateAssessment(dateChooser.getDate());
		rafp11.setExclusionUrinary(cbExclusionsUrinary.isSelected());
		rafp11
				.setExclusionContamination(cbExclusionsContamination
						.isSelected());
		rafp11.setExclusionTerminal(cbExclusionsTerminal.isSelected());
		rafp11.setObstructive(cbObstructiveCheckBox.isSelected());
		// rafp11.setConditionNotApply(cbConditionsNotApply.isSelected());
		// rafp11.setNurse1((String) cmbNurse1.getSelectedItem());
		rafp11.setConditionNotApplyUTI(cbConditionNotApplyHasUTI.isSelected());
		rafp11.setConditionNotApplyNoUTI(cbConditionNotApplyNoUTI.isSelected());
		rafp11.setPositiveUTI(SwingUtils.getSelectedButton(bgUTI));
		rafp11.setNurse2((String) cmbNurse2.getSelectedItem());
		rafp11.setResidentName(lblResidentName.getText());

		try {
			Global.currentResidentAssessmentFormPage11Key = MedrexClientManager
					.getInstance().insertOrUpdateResidentAssessmentFormPage11(
							rafp11);
			return (0);
		} catch (Exception e) {
			return (0);

		}
	}

	public boolean doValidate() {
		// TODO Auto-generated method stub
		ValidationResult vRes = new ValidationResult();
		// System.out.println(FieldValidation.getMessages(vRes.getMessages()));
		if (!FieldValidation.isEmpty(vRes)) {
			FieldValidation.Msgbox(vRes, "Resident Assessment Form: Page 11");
			return false;
		} else {
			return true;
		}
	}

}
