package medrex.client.main.admission;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
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
import medrex.commons.vo.admission.ResidentAssessmentFormPage8;
import medrex.commons.vo.others.Nurse;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;

import com.jgoodies.validation.ValidationResult;
import com.sX.swing.JxCheckBox;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxRadioButton;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelResidentAssessmentFormPage8 extends JxPanel implements Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3974552592396378897L;

	Theme theme = new BlackOverWhiteTheme();

	Font font = new Font("Arial", Font.PLAIN, 11);
	Insets margin = new Insets(0, 2, 0, 0);
	Border border = new CompoundBorderUIResource(new LineBorder(Color.BLACK),
			new BasicBorders.MarginBorder());
	Color background = Color.WHITE;
	Color foreground = Color.BLACK;

	private JxLabel lblRoom;
	private JxLabel lblResidentName;
	private JxDateChooser dcNurseVisit;
	private JxLabel dateLabel;
	private JxLabel ifSoWhatLabel_1;
	private JxText txtPainMedOther;
	private ButtonGroup bgPainManagement = new ButtonGroup();
	private ButtonGroup bgQ2 = new ButtonGroup();
	private ButtonGroup bgQ1 = new ButtonGroup();

	private JxCheckBox cbPainMedicationOther;
	private JxCheckBox cbPainMedicationIndigestion;
	private JxCheckBox cbPainMedicationConstipation;
	private JxCheckBox cbPainMedicationNausea;
	private JxCheckBox cbPainMedicationSedation;

	JxText txtPharmaMedication1;
	JxText txtPharmaDose1;
	JxText txtPharmaRoute1;
	JxText txtPharmaFrequency1;
	JxText txtPharmaIdentity1;

	JxText txtPharmaMedication2;
	JxText txtPharmaDose2;
	JxText txtPharmaRoute2;
	JxText txtPharmaFrequency2;
	JxText txtPharmaIdentity2;

	JxText txtPharmaMedication3;
	JxText txtPharmaDose3;
	JxText txtPharmaRoute3;
	JxText txtPharmaFrequency3;
	JxText txtPharmaIdentity3;

	JxText txtPharmaMedication;

	private JxRadioButton rbQ2Yes;
	private JxRadioButton rbQ2No;

	public PanelResidentAssessmentFormPage8() {
		super();

		Global.panelResidentAssessmentFormPage8 = this;
		setLayout(null);
		setBorder(new LineBorder(Color.black, 1, true));
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(930, 510));

		final JxLabel nonPharmacologicalLabel_1 = new JxLabel();
		nonPharmacologicalLabel_1.setTheme(theme);

		nonPharmacologicalLabel_1.setText("Pharmacological :");
		nonPharmacologicalLabel_1.setBounds(61, 62, 156, 16);
		add(nonPharmacologicalLabel_1);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);

		panel_3.setLayout(null);
		panel_3.setBounds(61, 84, 859, 154);
		add(panel_3);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);

		panel_4.setLayout(null);
		panel_4.setBounds(0, 30, 148, 109);
		panel_3.add(panel_4);

		final JxLabel medicationLabel = new JxLabel();
		medicationLabel.setTheme(theme);

		medicationLabel.setText("Medication");
		medicationLabel.setBounds(30, 0, 66, 16);
		panel_4.add(medicationLabel);

		txtPharmaMedication1 = new JxText();
		txtPharmaMedication1.setTheme(theme);

		txtPharmaMedication1.setBackground(background);
		txtPharmaMedication1.setForeground(foreground);
		txtPharmaMedication1.setMargin(margin);
		txtPharmaMedication1.setBorder(border);
		txtPharmaMedication1.setBounds(10, 22, 128, 20);
		panel_4.add(txtPharmaMedication1);

		txtPharmaMedication2 = new JxText();
		txtPharmaMedication2.setTheme(theme);

		txtPharmaMedication2.setBackground(background);
		txtPharmaMedication2.setForeground(foreground);
		txtPharmaMedication2.setMargin(margin);
		txtPharmaMedication2.setBorder(border);
		txtPharmaMedication2.setBounds(10, 48, 128, 20);
		panel_4.add(txtPharmaMedication2);

		txtPharmaMedication3 = new JxText();
		txtPharmaMedication3.setTheme(theme);

		txtPharmaMedication3.setBackground(background);
		txtPharmaMedication3.setForeground(foreground);
		txtPharmaMedication3.setMargin(margin);
		txtPharmaMedication3.setBorder(border);
		txtPharmaMedication3.setBounds(10, 74, 128, 20);
		panel_4.add(txtPharmaMedication3);

		final JxPanel panel_4_1 = new JxPanel();
		panel_4_1.setTheme(theme);
		panel_4_1.setLayout(null);

		panel_4_1.setBounds(148, 30, 148, 109);
		panel_3.add(panel_4_1);

		final JxLabel medicationLabel_1 = new JxLabel();
		medicationLabel_1.setTheme(theme);

		medicationLabel_1.setText("Dose");
		medicationLabel_1.setBounds(45, 0, 66, 16);
		panel_4_1.add(medicationLabel_1);

		txtPharmaDose1 = new JxText();
		txtPharmaDose1.setTheme(theme);

		txtPharmaDose1.setBackground(background);
		txtPharmaDose1.setForeground(foreground);
		txtPharmaDose1.setMargin(margin);
		txtPharmaDose1.setBorder(border);
		txtPharmaDose1.setBounds(10, 22, 128, 20);
		panel_4_1.add(txtPharmaDose1);

		txtPharmaDose2 = new JxText();
		txtPharmaDose2.setTheme(theme);

		txtPharmaDose2.setBackground(background);
		txtPharmaDose2.setForeground(foreground);
		txtPharmaDose2.setMargin(margin);
		txtPharmaDose2.setBorder(border);
		txtPharmaDose2.setBounds(10, 48, 128, 20);
		panel_4_1.add(txtPharmaDose2);

		txtPharmaDose3 = new JxText();
		txtPharmaDose3.setTheme(theme);

		txtPharmaDose3.setBackground(background);
		txtPharmaDose3.setForeground(foreground);
		txtPharmaDose3.setMargin(margin);
		txtPharmaDose3.setBorder(border);
		txtPharmaDose3.setBounds(10, 74, 128, 20);
		panel_4_1.add(txtPharmaDose3);

		final JxPanel panel_4_1_1 = new JxPanel();
		panel_4_1_1.setTheme(theme);
		panel_4_1_1.setLayout(null);

		panel_4_1_1.setBounds(295, 30, 148, 109);
		panel_3.add(panel_4_1_1);

		final JxLabel medicationLabel_1_1 = new JxLabel();
		medicationLabel_1_1.setTheme(theme);

		medicationLabel_1_1.setText("Route");
		medicationLabel_1_1.setBounds(45, 0, 66, 16);
		panel_4_1_1.add(medicationLabel_1_1);

		txtPharmaRoute1 = new JxText();
		txtPharmaRoute1.setTheme(theme);

		txtPharmaRoute1.setBackground(background);
		txtPharmaRoute1.setForeground(foreground);
		txtPharmaRoute1.setMargin(margin);
		txtPharmaRoute1.setBorder(border);
		txtPharmaRoute1.setBounds(10, 22, 128, 20);
		panel_4_1_1.add(txtPharmaRoute1);

		txtPharmaRoute2 = new JxText();
		txtPharmaRoute2.setTheme(theme);

		txtPharmaRoute2.setBackground(background);
		txtPharmaRoute2.setForeground(foreground);
		txtPharmaRoute2.setMargin(margin);
		txtPharmaRoute2.setBorder(border);
		txtPharmaRoute2.setBounds(10, 48, 128, 20);
		panel_4_1_1.add(txtPharmaRoute2);

		txtPharmaRoute3 = new JxText();
		txtPharmaRoute3.setTheme(theme);

		txtPharmaRoute3.setBackground(background);
		txtPharmaRoute3.setForeground(foreground);
		txtPharmaRoute3.setMargin(margin);
		txtPharmaRoute3.setBorder(border);
		txtPharmaRoute3.setBounds(10, 74, 128, 20);
		panel_4_1_1.add(txtPharmaRoute3);

		final JxPanel panel_4_1_1_1 = new JxPanel();
		panel_4_1_1_1.setTheme(theme);
		panel_4_1_1_1.setLayout(null);

		panel_4_1_1_1.setBounds(443, 30, 148, 109);
		panel_3.add(panel_4_1_1_1);

		final JxLabel medicationLabel_1_1_1 = new JxLabel();
		medicationLabel_1_1_1.setTheme(theme);

		medicationLabel_1_1_1.setText("Frequency");
		medicationLabel_1_1_1.setBounds(45, 0, 66, 16);
		panel_4_1_1_1.add(medicationLabel_1_1_1);

		txtPharmaFrequency1 = new JxText();
		txtPharmaFrequency1.setTheme(theme);

		txtPharmaFrequency1.setBackground(background);
		txtPharmaFrequency1.setForeground(foreground);
		txtPharmaFrequency1.setMargin(margin);
		txtPharmaFrequency1.setBorder(border);
		txtPharmaFrequency1.setBounds(10, 22, 128, 20);
		panel_4_1_1_1.add(txtPharmaFrequency1);

		txtPharmaFrequency2 = new JxText();
		txtPharmaFrequency2.setTheme(theme);

		txtPharmaFrequency2.setBackground(background);
		txtPharmaFrequency2.setForeground(foreground);
		txtPharmaFrequency2.setMargin(margin);
		txtPharmaFrequency2.setBorder(border);
		txtPharmaFrequency2.setBounds(10, 48, 128, 20);
		panel_4_1_1_1.add(txtPharmaFrequency2);

		txtPharmaFrequency3 = new JxText();
		txtPharmaFrequency3.setTheme(theme);

		txtPharmaFrequency3.setBackground(background);
		txtPharmaFrequency3.setForeground(foreground);
		txtPharmaFrequency3.setMargin(margin);
		txtPharmaFrequency3.setBorder(border);
		txtPharmaFrequency3.setBounds(10, 74, 128, 20);
		panel_4_1_1_1.add(txtPharmaFrequency3);

		final JxPanel panel_4_1_1_1_1 = new JxPanel();
		panel_4_1_1_1_1.setTheme(theme);
		panel_4_1_1_1_1.setLayout(null);

		panel_4_1_1_1_1.setBounds(590, 5, 264, 134);
		panel_3.add(panel_4_1_1_1_1);

		final JxLabel medicationLabel_1_1_1_1 = new JxLabel();
		medicationLabel_1_1_1_1.setTheme(theme);

		medicationLabel_1_1_1_1.setText("Identify if Ordered as ");
		medicationLabel_1_1_1_1.setBounds(50, 0, 121, 16);
		panel_4_1_1_1_1.add(medicationLabel_1_1_1_1);

		txtPharmaIdentity1 = new JxText();
		txtPharmaIdentity1.setTheme(theme);

		txtPharmaIdentity1.setBackground(background);
		txtPharmaIdentity1.setForeground(foreground);
		txtPharmaIdentity1.setMargin(margin);
		txtPharmaIdentity1.setBorder(border);
		txtPharmaIdentity1.setBounds(10, 46, 244, 20);
		panel_4_1_1_1_1.add(txtPharmaIdentity1);

		txtPharmaIdentity2 = new JxText();
		txtPharmaIdentity2.setTheme(theme);

		txtPharmaIdentity2.setBackground(background);
		txtPharmaIdentity2.setForeground(foreground);
		txtPharmaIdentity2.setMargin(margin);
		txtPharmaIdentity2.setBorder(border);
		txtPharmaIdentity2.setBounds(10, 74, 244, 20);
		panel_4_1_1_1_1.add(txtPharmaIdentity2);

		txtPharmaIdentity3 = new JxText();
		txtPharmaIdentity3.setTheme(theme);

		txtPharmaIdentity3.setBackground(background);
		txtPharmaIdentity3.setForeground(foreground);
		txtPharmaIdentity3.setMargin(margin);
		txtPharmaIdentity3.setBorder(border);
		txtPharmaIdentity3.setBounds(10, 100, 244, 20);
		panel_4_1_1_1_1.add(txtPharmaIdentity3);

		final JxLabel medicationLabel_1_1_1_1_1 = new JxLabel();
		medicationLabel_1_1_1_1_1.setTheme(theme);

		medicationLabel_1_1_1_1_1.setText("Scheduled, Breakthrough, PRN");
		medicationLabel_1_1_1_1_1.setBounds(27, 22, 197, 16);
		panel_4_1_1_1_1.add(medicationLabel_1_1_1_1_1);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);

		panel_5.setLayout(null);
		panel_5.setBounds(61, 250, 859, 106);
		add(panel_5);

		final JxLabel haveYouHadLabel = new JxLabel();
		haveYouHadLabel.setTheme(theme);

		haveYouHadLabel
				.setText("Have you had any side effects from pain medication ?");
		haveYouHadLabel.setBounds(10, 10, 325, 16);
		panel_5.add(haveYouHadLabel);

		final JxRadioButton rbQ1Yes = new JxRadioButton();
		rbQ1Yes.setTheme(theme);

		rbQ1Yes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cbPainMedicationSedation.setEnabled(true);
				cbPainMedicationNausea.setEnabled(true);
				cbPainMedicationConstipation.setEnabled(true);
				cbPainMedicationIndigestion.setEnabled(true);
				cbPainMedicationOther.setEnabled(true);
				txtPainMedOther.setEnabled(true);
			};
		});
		bgQ1.add(rbQ1Yes);
		rbQ1Yes.setActionCommand("1");

		rbQ1Yes.setText("Yes");
		rbQ1Yes.setBounds(374, 10, 58, 16);
		panel_5.add(rbQ1Yes);

		final JxRadioButton rbQ1No = new JxRadioButton();
		rbQ1No.setTheme(theme);

		rbQ1No.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				cbPainMedicationSedation.setSelected(false);
				cbPainMedicationNausea.setSelected(false);
				cbPainMedicationConstipation.setSelected(false);
				cbPainMedicationIndigestion.setSelected(false);
				cbPainMedicationOther.setSelected(false);
				txtPainMedOther.setText("");

				cbPainMedicationSedation.setEnabled(false);
				cbPainMedicationNausea.setEnabled(false);
				cbPainMedicationConstipation.setEnabled(false);
				cbPainMedicationIndigestion.setEnabled(false);
				cbPainMedicationOther.setEnabled(false);
				txtPainMedOther.setEnabled(false);
			};
		});
		bgQ1.add(rbQ1No);
		rbQ1No.setActionCommand("2");

		rbQ1No.setText("No");
		rbQ1No.setBounds(456, 10, 58, 16);
		panel_5.add(rbQ1No);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setLayout(null);

		panel_6.setBounds(10, 29, 839, 26);
		panel_5.add(panel_6);

		cbPainMedicationSedation = new JxCheckBox();
		cbPainMedicationSedation.setTheme(theme);

		cbPainMedicationSedation.setText("Sedation");
		cbPainMedicationSedation.setBounds(10, 0, 84, 24);
		panel_6.add(cbPainMedicationSedation);

		cbPainMedicationNausea = new JxCheckBox();
		cbPainMedicationNausea.setTheme(theme);

		cbPainMedicationNausea.setText("Nausea");
		cbPainMedicationNausea.setBounds(150, 0, 68, 24);
		panel_6.add(cbPainMedicationNausea);

		cbPainMedicationConstipation = new JxCheckBox();
		cbPainMedicationConstipation.setTheme(theme);

		cbPainMedicationConstipation.setText("Constipation");
		cbPainMedicationConstipation.setBounds(270, 0, 96, 24);
		panel_6.add(cbPainMedicationConstipation);

		cbPainMedicationIndigestion = new JxCheckBox();
		cbPainMedicationIndigestion.setTheme(theme);

		cbPainMedicationIndigestion.setText("Indigestion");
		cbPainMedicationIndigestion.setBounds(420, 0, 96, 24);
		panel_6.add(cbPainMedicationIndigestion);

		final JxPanel panel_1_1 = new JxPanel();
		panel_1_1.setTheme(theme);
		panel_1_1.setLayout(null);

		panel_1_1.setBounds(10, 61, 763, 26);
		panel_5.add(panel_1_1);

		cbPainMedicationOther = new JxCheckBox();
		cbPainMedicationOther.setTheme(theme);

		cbPainMedicationOther.setText("Other");
		cbPainMedicationOther.setBounds(10, 0, 84, 24);
		panel_1_1.add(cbPainMedicationOther);

		txtPainMedOther = new JxText();
		txtPainMedOther.setTheme(theme);

		txtPainMedOther.setBackground(background);
		txtPainMedOther.setForeground(foreground);
		txtPainMedOther.setMargin(margin);
		txtPainMedOther.setBorder(border);
		txtPainMedOther.setBounds(100, 2, 353, 20);
		panel_1_1.add(txtPainMedOther);

		final JxPanel panel_5_1 = new JxPanel();
		panel_5_1.setTheme(theme);
		panel_5_1.setLayout(null);

		panel_5_1.setBounds(61, 370, 859, 67);
		add(panel_5_1);

		final JxLabel haveYouHadLabel_1 = new JxLabel();
		haveYouHadLabel_1.setTheme(theme);

		haveYouHadLabel_1
				.setText("Are you receiving any medications to alleviate side effects");
		haveYouHadLabel_1.setBounds(10, 10, 358, 16);
		panel_5_1.add(haveYouHadLabel_1);

		rbQ2Yes = new JxRadioButton();
		rbQ2Yes.setTheme(theme);

		rbQ2Yes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtPharmaMedication.setEnabled(true);
				txtPharmaMedication.requestFocus();
			}
		});
		bgQ2.add(rbQ2Yes);
		rbQ2Yes.setActionCommand("1");

		rbQ2Yes.setText("Yes");
		rbQ2Yes.setBounds(374, 10, 58, 16);
		panel_5_1.add(rbQ2Yes);

		rbQ2No = new JxRadioButton();
		rbQ2No.setTheme(theme);

		rbQ2No.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtPharmaMedication.setText("");
				txtPharmaMedication.setEnabled(false);
			}
		});
		bgQ2.add(rbQ2No);
		rbQ2No.setActionCommand("2");

		rbQ2No.setText("No");
		rbQ2No.setBounds(456, 10, 58, 16);
		panel_5_1.add(rbQ2No);

		final JxPanel panel_1_1_1 = new JxPanel();
		panel_1_1_1.setTheme(theme);
		panel_1_1_1.setLayout(null);

		panel_1_1_1.setBounds(10, 30, 763, 26);
		panel_5_1.add(panel_1_1_1);

		txtPharmaMedication = new JxText();
		txtPharmaMedication.setTheme(theme);

		txtPharmaMedication.setBackground(background);
		txtPharmaMedication.setForeground(foreground);
		txtPharmaMedication.setMargin(margin);
		txtPharmaMedication.setBorder(border);
		txtPharmaMedication.setBounds(130, 3, 436, 20);
		txtPharmaMedication.setEnabled(false);
		panel_1_1_1.add(txtPharmaMedication);

		final JxLabel ifSoWhatLabel = new JxLabel();
		ifSoWhatLabel.setTheme(theme);

		ifSoWhatLabel.setText("if so, what ?");
		ifSoWhatLabel.setBounds(10, 5, 114, 16);
		panel_1_1_1.add(ifSoWhatLabel);

		ifSoWhatLabel_1 = new JxLabel();
		ifSoWhatLabel_1.setTheme(theme);

		ifSoWhatLabel_1.setText("Nurse Signature:");
		ifSoWhatLabel_1.setBounds(61, 470, 91, 16);
		add(ifSoWhatLabel_1);

		dateLabel = new JxLabel();
		dateLabel.setTheme(theme);

		dateLabel.setText("Date :");
		dateLabel.setBounds(473, 470, 42, 16);
		add(dateLabel);

		dcNurseVisit = new JxDateChooser();
		dcNurseVisit.setTheme(theme);

		dcNurseVisit.setDate(MedrexClientManager.getServerTime());
		dcNurseVisit.setDateFormatString("MM/dd/yyyy");
		dcNurseVisit.setBounds(521, 465, 168, 24);
		add(dcNurseVisit);

		final JxLabel residentNameLabel = new JxLabel();
		residentNameLabel.setTheme(theme);

		residentNameLabel.setText("Resident Name :");
		residentNameLabel.setBounds(157, 21, 91, 14);
		add(residentNameLabel);

		lblResidentName = new JxLabel();
		lblResidentName.setTheme(theme);

		lblResidentName.setFontStyle(Font.BOLD);
		lblResidentName.setBounds(254, 19, 168, 18);
		add(lblResidentName);

		final JxLabel roomLabel = new JxLabel();
		roomLabel.setTheme(theme);

		roomLabel.setText("Room # :");
		roomLabel.setBounds(473, 21, 54, 14);
		add(roomLabel);

		lblRoom = new JxLabel();
		lblRoom.setTheme(theme);
		lblRoom.setFontStyle(Font.BOLD);
		lblRoom.setBounds(533, 19, 77, 18);
		add(lblRoom);

		doLoad();

		final PanelloggedInUser panel_7 = new PanelloggedInUser();
		panel_7.setFont(font);
		panel_7.setBounds(158, 465, 286, 24);
		add(panel_7);
	}

	public void doLoad() {
		fillCombos();
		doUpdate();
	}

	public void fillCombos() {
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
				i.next();
			}
		} catch (Exception e) {
		}
	}

	public void doUpdate() {
		int resId = Global.currentResidenceKey;
		ResidentMain rm = null;
		TempRoomHistory roomHist = null;
		try {
			rm = MedrexClientManager.getInstance().getResident(resId);
			roomHist = MedrexClientManager.getInstance()
					.getCurrentRoomForResident(resId);
		} catch (Exception e) {
		}
		lblResidentName.setText(rm.getUserPass() + " " + rm.getUserName());
		/* TODO: Migrating to room history ----- Done */
		// txtRoom.setText(rm.getRoom());
		if (roomHist != null) {
			lblRoom.setText(roomHist.getRoom());
		}
		if (Global.currentResidentAssessmentFormKey == 0) {
			Global.currentResidentAssessmentFormPage8Key = 0;

			SwingUtils.setSelectedButton(bgQ1, 0);
			SwingUtils.setSelectedButton(bgQ2, 0);
			// txtExaOther.setText("");
			// txtNonPharmaOther.setText("");

			txtPharmaMedication1.setText("");
			txtPharmaDose1.setText("");
			txtPharmaRoute1.setText("");
			txtPharmaFrequency1.setText("");
			txtPharmaIdentity1.setText("");

			txtPharmaMedication2.setText("");
			txtPharmaDose2.setText("");
			txtPharmaRoute2.setText("");
			txtPharmaFrequency2.setText("");
			txtPharmaIdentity2.setText("");

			txtPharmaMedication3.setText("");
			txtPharmaDose3.setText("");
			txtPharmaRoute3.setText("");
			txtPharmaFrequency3.setText("");
			txtPharmaIdentity3.setText("");

			cbPainMedicationOther.setSelected(false);
			cbPainMedicationIndigestion.setSelected(false);
			cbPainMedicationConstipation.setSelected(false);
			cbPainMedicationNausea.setSelected(false);
			cbPainMedicationSedation.setSelected(false);
			// txtPainMedicationOther.setText("");

			txtPharmaMedication.setText("");

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
			ResidentAssessmentFormPage8 refResidentAssessmentFormPage8 = null;
			try {
				refResidentAssessmentFormPage8 = MedrexClientManager
						.getInstance().getResidentAssessmentFormPage8(
								Global.currentResidentAssessmentFormKey);
			} catch (Exception e) {

			}
			Global.currentResidentAssessmentFormPage8Key = refResidentAssessmentFormPage8
					.getSerial();

			dcNurseVisit
					.setDate(refResidentAssessmentFormPage8.getNurseVisit());
			// cmbNurse.setSelectedItem(refResidentAssessmentFormPage8.getNurse());
			// txtExOther.setText(refResidentAssessmentFormPage8.getExOther());
			// txtNonPhOther.setText(refResidentAssessmentFormPage8
			// .getNonPhOther());
			txtPainMedOther.setText(refResidentAssessmentFormPage8
					.getPainMedOther());
			SwingUtils.setSelectedButton(bgPainManagement,
					refResidentAssessmentFormPage8.getPainManagement());

			switch (refResidentAssessmentFormPage8.getQ2()) {
			case 1:
				rbQ2Yes.setSelected(true);
				txtPharmaMedication.setEditable(true);
				txtPharmaMedication.setText(refResidentAssessmentFormPage8
						.getQ2()
						+ "");

				break;
			case 2:
				rbQ2No.setSelected(true);
				txtPharmaMedication.setEditable(false);

				break;
			}

			// SwingUtils.setSelectedButton(bgQ2,
			// refResidentAssessmentFormPage8.getQ2());

			SwingUtils.setSelectedButton(bgQ1, refResidentAssessmentFormPage8
					.getQ1());
			cbPainMedicationOther.setSelected(refResidentAssessmentFormPage8
					.isPainMedicationOther());
			cbPainMedicationIndigestion
					.setSelected(refResidentAssessmentFormPage8
							.isPainMedicationIndigestion());
			cbPainMedicationConstipation
					.setSelected(refResidentAssessmentFormPage8
							.isPainMedicationConstipation());
			cbPainMedicationNausea.setSelected(refResidentAssessmentFormPage8
					.isPainMedicationNausea());
			cbPainMedicationSedation.setSelected(refResidentAssessmentFormPage8
					.isPainMedicationSedation());
			// cbNonPharmaOther.setSelected(refResidentAssessmentFormPage8
			// .isNonPharmaOther());
			// cbNonPharmaVisual.setSelected(refResidentAssessmentFormPage8
			// .isNonPharmaVisual());
			// cbNonPharmaNeurolytic.setSelected(refResidentAssessmentFormPage8
			// .isNonPharmaNeurolytic());
			// cbNonPharmaMusic.setSelected(refResidentAssessmentFormPage8
			// .isNonPharmaMusic());
			// cbNonPharmaSpiritual.setSelected(refResidentAssessmentFormPage8
			// .isNonPharmaSpiritual());
			// cbNonPharmaMassage.setSelected(refResidentAssessmentFormPage8
			// .isNonPharmaMassage());
			// cbNonPharmaAcupuncture.setSelected(refResidentAssessmentFormPage8
			// .isNonPharmaAcupuncture());
			// cbNonPharmaElevation.setSelected(refResidentAssessmentFormPage8
			// .isNonPharmaElevation());
			// cbNonPharmaReposition.setSelected(refResidentAssessmentFormPage8
			// .isNonPharmaReposition());
			// cbNonPharmaTens.setSelected(refResidentAssessmentFormPage8
			// .isNonPharmaTens());
			// cbNonPharmaHeat.setSelected(refResidentAssessmentFormPage8
			// .isNonPharmaHeat());
			// cbNonPharmaIce.setSelected(refResidentAssessmentFormPage8
			// .isNonPharmaIce());
			// cbEffectsPain.setSelected(refResidentAssessmentFormPage8
			// .isEffectsPain());
			// cbEffectsContinence.setSelected(refResidentAssessmentFormPage8
			// .isEffectsContinence());
			// cbEffectsSocialization.setSelected(refResidentAssessmentFormPage8
			// .isEffectsSocialization());
			// cbEffectsLying.setSelected(refResidentAssessmentFormPage8
			// .isEffectsLying());
			// cbEffectsStanding.setSelected(refResidentAssessmentFormPage8
			// .isEffectsStanding());
			// cbEffectsSitting.setSelected(refResidentAssessmentFormPage8
			// .isEffectsSitting());
			// cbEffectsSleep.setSelected(refResidentAssessmentFormPage8
			// .isEffectsSleep());
			// cbEffectsConcentration.setSelected(refResidentAssessmentFormPage8
			// .isEffectsConcentration());
			// cbEffectsMood.setSelected(refResidentAssessmentFormPage8
			// .isEffectsMood());
			// cbEffectsWalking.setSelected(refResidentAssessmentFormPage8
			// .isEffectsWalking());
			// cbEffectsAppetite.setSelected(refResidentAssessmentFormPage8
			// .isEffectsAppetite());
			// cbEffectsActivities.setSelected(refResidentAssessmentFormPage8
			// .isEffectsActivities());
			// cbExaOther.setSelected(refResidentAssessmentFormPage8.isExaOther());
			// cbExaResting.setSelected(refResidentAssessmentFormPage8
			// .isExaResting());
			// cbExaEating.setSelected(refResidentAssessmentFormPage8
			// .isExaEating());
			// cbExaSitting.setSelected(refResidentAssessmentFormPage8
			// .isExaSitting());
			// cbExaTherapy.setSelected(refResidentAssessmentFormPage8
			// .isExaTherapy());
			// cbExaTurning.setSelected(refResidentAssessmentFormPage8
			// .isExaTurning());
			// cbExaMovement.setSelected(refResidentAssessmentFormPage8
			// .isExaMovement());
			txtPharmaMedication1.setText(refResidentAssessmentFormPage8
					.getPharmaMedication1());
			txtPharmaDose1.setText(refResidentAssessmentFormPage8
					.getPharmaDose1());
			txtPharmaRoute1.setText(refResidentAssessmentFormPage8
					.getPharmaRoute1());
			txtPharmaFrequency1.setText(refResidentAssessmentFormPage8
					.getPharmaFrequency1());
			txtPharmaIdentity1.setText(refResidentAssessmentFormPage8
					.getPharmaIdentity1());
			txtPharmaMedication2.setText(refResidentAssessmentFormPage8
					.getPharmaMedication2());
			txtPharmaDose2.setText(refResidentAssessmentFormPage8
					.getPharmaDose2());
			txtPharmaRoute2.setText(refResidentAssessmentFormPage8
					.getPharmaRoute2());
			txtPharmaFrequency2.setText(refResidentAssessmentFormPage8
					.getPharmaFrequency2());
			txtPharmaIdentity2.setText(refResidentAssessmentFormPage8
					.getPharmaIdentity2());
			txtPharmaMedication3.setText(refResidentAssessmentFormPage8
					.getPharmaMedication3());
			txtPharmaDose3.setText(refResidentAssessmentFormPage8
					.getPharmaDose3());
			txtPharmaRoute3.setText(refResidentAssessmentFormPage8
					.getPharmaRoute3());
			txtPharmaFrequency3.setText(refResidentAssessmentFormPage8
					.getPharmaFrequency3());
			txtPharmaIdentity3.setText(refResidentAssessmentFormPage8
					.getPharmaIdentity3());
			txtPharmaMedication.setText(refResidentAssessmentFormPage8
					.getPharmaMedication());

		}

	}

	public int doSave() {
		ResidentAssessmentFormPage8 rafp8 = new ResidentAssessmentFormPage8();

		rafp8.setSerial(Global.currentResidentAssessmentFormPage8Key);
		rafp8.setFormId(Global.currentResidentAssessmentFormKey);

		rafp8.setNurseVisit(dcNurseVisit.getDate());
		rafp8.setPainMedOther(txtPainMedOther.getText());
		rafp8.setPainManagement(SwingUtils.getSelectedButton(bgPainManagement));
		rafp8.setQ2(SwingUtils.getSelectedButton(bgQ2));
		rafp8.setQ1(SwingUtils.getSelectedButton(bgQ1));
		rafp8.setPainMedicationOther(cbPainMedicationOther.isSelected());
		rafp8.setPainMedicationIndigestion(cbPainMedicationIndigestion
				.isSelected());
		rafp8.setPainMedicationConstipation(cbPainMedicationConstipation
				.isSelected());
		rafp8.setPainMedicationNausea(cbPainMedicationNausea.isSelected());
		rafp8.setPainMedicationSedation(cbPainMedicationSedation.isSelected());
		rafp8.setPharmaMedication1(txtPharmaMedication1.getText());
		rafp8.setPharmaDose1(txtPharmaDose1.getText());
		rafp8.setPharmaRoute1(txtPharmaRoute1.getText());
		rafp8.setPharmaFrequency1(txtPharmaFrequency1.getText());
		rafp8.setPharmaIdentity1(txtPharmaIdentity1.getText());
		rafp8.setPharmaMedication2(txtPharmaMedication2.getText());
		rafp8.setPharmaDose2(txtPharmaDose2.getText());
		rafp8.setPharmaRoute2(txtPharmaRoute2.getText());
		rafp8.setPharmaFrequency2(txtPharmaFrequency2.getText());
		rafp8.setPharmaIdentity2(txtPharmaIdentity2.getText());
		rafp8.setPharmaMedication3(txtPharmaMedication3.getText());
		rafp8.setPharmaDose3(txtPharmaDose3.getText());
		rafp8.setPharmaRoute3(txtPharmaRoute3.getText());
		rafp8.setPharmaFrequency3(txtPharmaFrequency3.getText());
		rafp8.setPharmaIdentity3(txtPharmaIdentity3.getText());
		rafp8.setPharmaMedication(txtPharmaMedication.getText());

		try {
			Global.currentResidentAssessmentFormPage8Key = MedrexClientManager
					.getInstance().insertOrUpdateResidentAssessmentFormPage8(
							rafp8);
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
			FieldValidation.Msgbox(vRes, "Resident Assessment Form: Page 8");
			return false;
		} else {
			return true;
		}
	}

}
