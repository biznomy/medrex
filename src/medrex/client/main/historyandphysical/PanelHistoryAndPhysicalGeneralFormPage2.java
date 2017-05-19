package medrex.client.main.historyandphysical;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.intf.Form;
import medrex.commons.vo.historyAndPhysical.HistoryAndPhysicalGeneralFormPage2;

import com.toedter.calendar.JDateChooser;

public class PanelHistoryAndPhysicalGeneralFormPage2 extends JPanel implements
		Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = 867577705348593260L;
	private JTextArea txtAssessment;
	private JTextArea txtMentalStatus;
	private JTextField txtNeuro;
	private JTextField txtExt;
	private JTextField txtBruits;
	private JTextField txtNodes;
	private JTextField txtBreast;
	private JTextField txtAbdomen;
	private JTextArea txtHeart;
	private JTextArea txtChest;
	private JTextField txtSkin;
	private JTextField txtGeneral;
	private JTextField txtWT;
	private JTextField txtHT;
	JTextField txtBP;
	JTextArea txtHeent;
	JDateChooser dateChooser;
	JTextField txtPhysician;

	/**
	 * Create the panel
	 */
	public PanelHistoryAndPhysicalGeneralFormPage2() {
		super();
		Global.panelHistoryAndPhysicalGeneralFormPage2 = this;
		setBorder(new LineBorder(new Color(0, 128, 0), 1, false));
		setSize(1200, 950);
		// Global.panelDoctorsProgressNotesForm = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(800, 950));
		setLayout(null);

		final JLabel plazaHealthCareLabel = new JLabel();
		plazaHealthCareLabel.setText("HISTORY & PHYSICAL PAGE 2");
		plazaHealthCareLabel.setBounds(550, 10, 213, 16);
		add(plazaHealthCareLabel);

		final JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 45, 780, 895);
		add(panel_1);

		final JLabel bpLabel = new JLabel();
		bpLabel.setText("BP");
		bpLabel.setBounds(10, 10, 54, 14);
		panel_1.add(bpLabel);

		txtBP = new JTextField();
		txtBP.setBounds(35, 8, 168, 18);
		panel_1.add(txtBP);

		final JLabel htLabel = new JLabel();
		htLabel.setText("HT");
		htLabel.setBounds(229, 10, 26, 14);
		panel_1.add(htLabel);

		txtHT = new JTextField();
		txtHT.setBounds(252, 8, 168, 18);
		panel_1.add(txtHT);

		final JLabel wtLabel = new JLabel();
		wtLabel.setText("WT");
		wtLabel.setBounds(456, 10, 26, 14);
		panel_1.add(wtLabel);

		txtWT = new JTextField();
		txtWT.setBounds(488, 8, 168, 18);
		panel_1.add(txtWT);

		final JLabel generalLabel = new JLabel();
		generalLabel.setText("GENERAL");
		generalLabel.setBounds(10, 44, 54, 14);
		panel_1.add(generalLabel);

		txtGeneral = new JTextField();
		txtGeneral.setBounds(82, 42, 688, 18);
		panel_1.add(txtGeneral);

		final JLabel generalLabel_1 = new JLabel();
		generalLabel_1.setText("HEENT");
		generalLabel_1.setBounds(10, 69, 54, 14);
		panel_1.add(generalLabel_1);

		txtHeent = new JTextArea();
		txtHeent.setWrapStyleWord(true);
		txtHeent.setLineWrap(true);
		txtHeent.setBorder(new LineBorder(Color.black, 1, false));
		txtHeent.setBounds(82, 66, 688, 45);
		panel_1.add(txtHeent);

		final JLabel generalLabel_1_1 = new JLabel();
		generalLabel_1_1.setText("SKIN");
		generalLabel_1_1.setBounds(10, 122, 54, 14);
		panel_1.add(generalLabel_1_1);

		txtSkin = new JTextField();
		txtSkin.setBounds(82, 121, 688, 18);
		panel_1.add(txtSkin);

		final JLabel generalLabel_1_1_1 = new JLabel();
		generalLabel_1_1_1.setText("CHEST");
		generalLabel_1_1_1.setBounds(10, 148, 54, 14);
		panel_1.add(generalLabel_1_1_1);

		txtChest = new JTextArea();
		txtChest.setWrapStyleWord(true);
		txtChest.setLineWrap(true);
		txtChest.setBorder(new LineBorder(Color.black, 1, false));
		txtChest.setBounds(82, 144, 688, 45);
		panel_1.add(txtChest);

		final JLabel generalLabel_1_1_1_1 = new JLabel();
		generalLabel_1_1_1_1.setText("HEART");
		generalLabel_1_1_1_1.setBounds(10, 199, 54, 14);
		panel_1.add(generalLabel_1_1_1_1);

		txtHeart = new JTextArea();
		txtHeart.setBorder(new LineBorder(Color.black, 1, false));
		txtHeart.setWrapStyleWord(true);
		txtHeart.setLineWrap(true);
		txtHeart.setBounds(82, 199, 688, 45);
		panel_1.add(txtHeart);

		final JLabel generalLabel_1_1_1_1_1 = new JLabel();
		generalLabel_1_1_1_1_1.setText("ABDOMEN");
		generalLabel_1_1_1_1_1.setBounds(10, 253, 54, 14);
		panel_1.add(generalLabel_1_1_1_1_1);

		txtAbdomen = new JTextField();
		txtAbdomen.setBounds(82, 250, 688, 18);
		panel_1.add(txtAbdomen);

		final JLabel generalLabel_1_1_1_1_1_1 = new JLabel();
		generalLabel_1_1_1_1_1_1.setText("BREAST");
		generalLabel_1_1_1_1_1_1.setBounds(10, 275, 54, 14);
		panel_1.add(generalLabel_1_1_1_1_1_1);

		txtBreast = new JTextField();
		txtBreast.setBounds(82, 272, 688, 18);
		panel_1.add(txtBreast);

		final JLabel generalLabel_1_1_1_1_1_1_1 = new JLabel();
		generalLabel_1_1_1_1_1_1_1.setText("NODES");
		generalLabel_1_1_1_1_1_1_1.setBounds(10, 300, 54, 14);
		panel_1.add(generalLabel_1_1_1_1_1_1_1);

		txtNodes = new JTextField();
		txtNodes.setBounds(82, 296, 688, 18);
		panel_1.add(txtNodes);

		final JLabel generalLabel_1_1_1_1_1_1_1_1 = new JLabel();
		generalLabel_1_1_1_1_1_1_1_1.setText("BRUITS");
		generalLabel_1_1_1_1_1_1_1_1.setBounds(10, 325, 54, 14);
		panel_1.add(generalLabel_1_1_1_1_1_1_1_1);

		txtBruits = new JTextField();
		txtBruits.setBounds(82, 322, 688, 18);
		panel_1.add(txtBruits);

		final JLabel generalLabel_1_1_1_1_1_1_1_1_1 = new JLabel();
		generalLabel_1_1_1_1_1_1_1_1_1.setText("EXT");
		generalLabel_1_1_1_1_1_1_1_1_1.setBounds(10, 350, 54, 14);
		panel_1.add(generalLabel_1_1_1_1_1_1_1_1_1);

		txtExt = new JTextField();
		txtExt.setBounds(82, 346, 688, 18);
		panel_1.add(txtExt);

		final JLabel generalLabel_1_1_1_1_1_1_1_1_1_1 = new JLabel();
		generalLabel_1_1_1_1_1_1_1_1_1_1.setText("NEURO");
		generalLabel_1_1_1_1_1_1_1_1_1_1.setBounds(10, 370, 54, 14);
		panel_1.add(generalLabel_1_1_1_1_1_1_1_1_1_1);

		txtNeuro = new JTextField();
		txtNeuro.setBounds(82, 369, 688, 18);
		panel_1.add(txtNeuro);

		final JLabel generalLabel_1_1_1_1_1_1_1_1_1_1_1 = new JLabel();
		generalLabel_1_1_1_1_1_1_1_1_1_1_1.setText("MENTAL STATUS");
		generalLabel_1_1_1_1_1_1_1_1_1_1_1.setBounds(10, 390, 92, 14);
		panel_1.add(generalLabel_1_1_1_1_1_1_1_1_1_1_1);

		txtMentalStatus = new JTextArea();
		txtMentalStatus.setBorder(new LineBorder(Color.black, 1, false));
		txtMentalStatus.setWrapStyleWord(true);
		txtMentalStatus.setLineWrap(true);
		txtMentalStatus.setBounds(170, 393, 600, 57);
		panel_1.add(txtMentalStatus);

		final JLabel generalLabel_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel();
		generalLabel_1_1_1_1_1_1_1_1_1_1_1_1.setText("ASSESSMENT AND PLAN");
		generalLabel_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(10, 458, 136, 14);
		panel_1.add(generalLabel_1_1_1_1_1_1_1_1_1_1_1_1);

		txtAssessment = new JTextArea();
		txtAssessment.setBorder(new LineBorder(Color.black, 1, false));
		txtAssessment.setWrapStyleWord(true);
		txtAssessment.setLineWrap(true);
		txtAssessment.setBounds(170, 456, 600, 57);
		panel_1.add(txtAssessment);

		final JLabel dateLabel = new JLabel();
		dateLabel.setText("Date");
		dateLabel.setBounds(10, 579, 54, 14);
		panel_1.add(dateLabel);

		dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("MM/dd/yyyy");
		dateChooser.setBounds(82, 574, 121, 18);
		panel_1.add(dateChooser);

		final JLabel physiciansSignatureLabel = new JLabel();
		physiciansSignatureLabel.setText("PHYSICIAN'S SIGNATURE");
		physiciansSignatureLabel.setBounds(347, 579, 156, 14);
		panel_1.add(physiciansSignatureLabel);

		txtPhysician = new JTextField();
		txtPhysician.setBounds(522, 576, 248, 21);
		panel_1.add(txtPhysician);

		fillCombos();
		updateData();

	}

	public void fillCombos() {

	}

	public void updateData() {
		try {
			MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
		} catch (Exception e) {

		}

		if (Global.currentHistoryAndPhysicalGeneralFormPage1Key == 0) {
			Global.currentHistoryAndPhysicalGeneralFormPage2Key = 0;
			txtBP.setText("");
			txtHT.setText("");
			txtWT.setText("");
			txtGeneral.setText("");
			txtHeent.setText("");
			txtSkin.setText("");
			txtChest.setText("");
			txtHeart.setText("");
			txtAbdomen.setText("");
			txtBreast.setText("");
			txtNodes.setText("");
			txtBruits.setText("");
			txtExt.setText("");
			txtNeuro.setText("");
			txtMentalStatus.setText("");
			txtAssessment.setText("");
			dateChooser.setDate(null);
			txtPhysician.setText("");

		} else {
			HistoryAndPhysicalGeneralFormPage2 hapgfp2 = null;
			try {
				hapgfp2 = MedrexClientManager
						.getInstance()
						.getHistoryAndPhysicalGeneralFormPage2(
								Global.currentHistoryAndPhysicalGeneralFormPage1Key);

				Global.currentHistoryAndPhysicalGeneralFormPage2Key = hapgfp2
						.getSerial();
			} catch (Exception e) {

			}
			txtBP.setText(hapgfp2.getBp());
			txtHT.setText(hapgfp2.getHt());
			txtWT.setText(hapgfp2.getWt());
			txtGeneral.setText(hapgfp2.getGeneral());
			txtHeent.setText(hapgfp2.getHeent());
			txtSkin.setText(hapgfp2.getSkin());
			txtChest.setText(hapgfp2.getChest());
			txtHeart.setText(hapgfp2.getHeart());
			txtAbdomen.setText(hapgfp2.getAbdomen());
			txtBreast.setText(hapgfp2.getBreast());
			txtNodes.setText(hapgfp2.getNodes());
			txtBruits.setText(hapgfp2.getBruits());
			txtExt.setText(hapgfp2.getExt());
			txtNeuro.setText(hapgfp2.getNeuro());
			txtMentalStatus.setText(hapgfp2.getMentalStatus());
			txtAssessment.setText(hapgfp2.getAssessment());
			dateChooser.setDate(hapgfp2.getDateRecord());
			txtPhysician.setText(hapgfp2.getPhysicianSignature());

		}

	}

	public int doSave() {
		HistoryAndPhysicalGeneralFormPage2 hapgfp2 = new HistoryAndPhysicalGeneralFormPage2();

		hapgfp2.setSerial(Global.currentHistoryAndPhysicalGeneralFormPage2Key);
		hapgfp2.setFormId(Global.currentHistoryAndPhysicalGeneralFormPage1Key);

		hapgfp2.setBp(txtBP.getText());
		hapgfp2.setHt(txtHT.getText());

		hapgfp2.setWt(txtWT.getText());
		hapgfp2.setGeneral(txtGeneral.getText());
		hapgfp2.setHeent(txtHeent.getText());
		hapgfp2.setSkin(txtSkin.getText());
		hapgfp2.setChest(txtChest.getText());
		hapgfp2.setHeart(txtHeart.getText());
		hapgfp2.setAbdomen(txtAbdomen.getText());
		hapgfp2.setBreast(txtBreast.getText());
		hapgfp2.setNodes(txtNodes.getText());
		hapgfp2.setBruits(txtBruits.getText());

		hapgfp2.setExt(txtExt.getText());
		hapgfp2.setNeuro(txtNeuro.getText());
		hapgfp2.setMentalStatus(txtMentalStatus.getText());
		hapgfp2.setAssessment(txtAssessment.getText());
		hapgfp2.setDateRecord(dateChooser.getDate());
		hapgfp2.setPhysicianSignature(txtPhysician.getText());

		try {
			Global.currentHistoryAndPhysicalGeneralFormPage2Key = MedrexClientManager
					.getInstance()
					.insertOrUpdateHistoryAndPhysicalGeneralFormPage2(hapgfp2);
		} catch (Exception e) {
		}
		return Global.currentHistoryAndPhysicalGeneralFormPage2Key;

	}

	public void doLoad() {

	}

	public void doUpdate() {
		updateData();

	}

	public boolean doValidate() {
		return true;
	}

}
