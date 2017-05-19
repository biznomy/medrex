package medrex.client.main.admission;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.admission.PainAssessment;

public class PanelPainAssessment extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1423200640732442090L;
	public static final String PROPERTY_SITENUM_CHANGED = "PROPERTY_SITENUM_CHANGED";
	public static final String PROPERTY_FOCUS_GAINED = "PROPERTY_FOCUS_GAINED";
	private final PanelPainAssessment This_Panel;

	private final Color COLOR_HIGH = new Color(255, 102, 102);
	private final Color COLOR_NORM = Color.WHITE;
	private final Border BORDER_HIGH = new LineBorder(COLOR_HIGH, 1, false);
	private Border BORDER_NORM; // = new LineBorder(Color.BLACK,1 , false);

	private boolean stillHasFocus = false;

	JComboBox cmbSiteNum;
	JComboBox cmbStage;

	int painAssessmentSiteNumber;
	int painAssessmentFormSerial;
	int coorX;
	int coorY;
	private JComboBox cmbPainOnset;
	private JComboBox cmbDuration;
	private JComboBox cmbQuality;
	private JComboBox cmbExihibits;
	private JComboBox cmbNonPharmacolotical;
	private JComboBox cmbPainEffects;
	private JComboBox cmbExacerbatingFactors;

	public void setCoorX(int coorX) {
		this.coorX = coorX;
	}

	public void setCoorY(int coorY) {
		this.coorY = coorY;
	}

	public int getCoorX() {
		return coorX;
	}

	public int getCoorY() {
		return coorY;
	}

	public PanelPainAssessment(int pSSNum) {
		super();
		setOpaque(false);
		This_Panel = this;

		setBorder(BORDER_HIGH);
		setSize(40, 266);

		painAssessmentSiteNumber = pSSNum;
		setLayout(null);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(86, 518));

		cmbSiteNum = new JComboBox();
		cmbSiteNum.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent e) {
				firePropertyEvent();
			}
		});
		cmbSiteNum.setOpaque(false);
		cmbSiteNum.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				firePropertyEvent();
			}
		});
		cmbSiteNum.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(final FocusEvent e) {
				stillHasFocus = true;
				doHighlight();
			}

			@Override
			public void focusLost(final FocusEvent e) {
				stillHasFocus = false;
				doHighlight();
			}
		});
		cmbSiteNum.setRenderer(new DefaultListCellRenderer() {
			@Override
			public Component getListCellRendererComponent(JList list,
					Object value, int index, boolean isSelected,
					boolean cellHasFocus) {
				JLabel renderer = (JLabel) super.getListCellRendererComponent(
						list, value, index, isSelected, cellHasFocus);
				if (cellHasFocus || isSelected) {
					if (index != 0 && index != -1) {
						fireIndex(Integer.parseInt((String) value));
					} else {
						fireNull();
					}
				}
				return renderer;
			}
		});
		cmbSiteNum.setBackground(Color.WHITE);
		cmbSiteNum.setBounds(1, 1, 80, 25);
		add(cmbSiteNum);

		BORDER_NORM = cmbSiteNum.getBorder();

		/*
		 * cmbStage = new JComboBox(); cmbStage.setOpaque(false);
		 * cmbStage.addFocusListener(new FocusAdapter() { public void
		 * focusGained(final FocusEvent e) { stillHasFocus = true;
		 * doHighlight(); }
		 * 
		 * public void focusLost(final FocusEvent e) { stillHasFocus = false;
		 * doHighlight(); } }); cmbStage.setFocusCycleRoot(true);
		 * cmbStage.setBackground(Color.WHITE); cmbStage.setBounds(1, 55, 80,
		 * 25); add(cmbStage);
		 */

		cmbPainOnset = new JComboBox();
		cmbPainOnset.setBounds(1, 55, 80, 25);
		cmbPainOnset.setBackground(Color.WHITE);
		add(cmbPainOnset);

		cmbDuration = new JComboBox();
		cmbDuration.setBounds(1, 110, 80, 25);
		cmbDuration.setBackground(Color.WHITE);
		add(cmbDuration);

		cmbQuality = new JComboBox();
		cmbQuality.setBounds(1, 165, 80, 25);
		cmbQuality.setBackground(Color.WHITE);
		add(cmbQuality);

		cmbExihibits = new JComboBox();
		cmbExihibits.setBounds(1, 220, 80, 25);
		cmbExihibits.setBackground(Color.WHITE);
		add(cmbExihibits);

		/*
		 * cmbNonPharmacolotical = new JComboBox();
		 * cmbNonPharmacolotical.setBackground(Color.WHITE);
		 * cmbNonPharmacolotical.setBounds(1, 330, 80, 25);
		 * add(cmbNonPharmacolotical);
		 */

		cmbPainEffects = new JComboBox();
		cmbPainEffects.setBackground(Color.WHITE);
		cmbPainEffects.setBounds(1, 330, 80, 25);
		add(cmbPainEffects);

		cmbExacerbatingFactors = new JComboBox();
		cmbExacerbatingFactors.setBackground(Color.WHITE);
		cmbExacerbatingFactors.setBounds(1, 275, 80, 25);
		add(cmbExacerbatingFactors);

		fillCombos();
		doEnable(false);
		stillHasFocus = true;
		doHighlight();
		stillHasFocus = false;
		doHighlight();

		// updateData();
	}

	public void fillCombos() {

		cmbSiteNum.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				" ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
				"12", "13", "14", "15", "16", "17", "18", "19", "20" }));

		// cmbStage.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
		// " ", "1", "2", "3", "4" }));

		cmbPainOnset.setModel(new DefaultComboBoxModel(new String[] { " ",
				"Acute", "Chronic", "Sudden", "Gradual" }));

		cmbDuration.setModel(new DefaultComboBoxModel(new String[] { " ",
				"Constant", "Changing", "Intermittent" }));

		cmbQuality.setModel(new DefaultComboBoxModel(new String[] { " ",
				"Dull", "Sharp", "Ache", "Throbbing", "Pulling", "Burning",
				"Stabbing", "Shooting", "Tightness", "Cramping", "Tingling",
				"Generalized", "Neuropathic Spasms" }));

		cmbExacerbatingFactors.setModel(new DefaultComboBoxModel(new String[] {
				" ", "Movement", "Truning", "Therapy", "Sitting", "Eating",
				"Resting" }));

		cmbPainEffects.setModel(new DefaultComboBoxModel(new String[] { " ",
				"Activities of Daily Living", "Appetite", "Walking",
				"Mood or Emotions", "Concentration", "Sleep/Rest", "Sitting",
				"Standing", "Lying", "Socialization", "Continence",
				"Pain Has No Negative Effect" }));

		// cmbNonPharmacolotical.setModel(new DefaultComboBoxModel(new String[]
		// {
		// " ", "Ice to Affected Area",
		// "Heat to Affected Area", "Tens", "Reposition",
		// "Elevation of Extremity", "Acupuncture",
		// "Message", "Spirtual/Meditation", "Music", "Neurolytic Ttechnique",
		// "Visual Imagery"}));

		cmbExihibits.setModel(new DefaultComboBoxModel(new String[] { " ",
				"Crying", "Moaning", "Grimacing", "Grinding Teeth", "Yelling",
				"Pacing", "Irritability", "Change in Gait", "Agitation",
				"Resistant", "Rubbing Motion", "Decreased Activity" }));
	}

	public void updateData() {
		if (Global.currentResidentAssessmentFormKey == 0) {
			painAssessmentFormSerial = 0;
			cmbSiteNum.setSelectedItem("");
			// cmbStage.setSelectedItem("");
			cmbPainOnset.setSelectedItem("");
			cmbDuration.setSelectedItem("");
			cmbQuality.setSelectedItem("");
			cmbExacerbatingFactors.setSelectedItem("");
			cmbPainEffects.setSelectedItem("");
			// cmbNonPharmacolotical.setSelectedItem("");
			cmbExihibits.setSelectedItem("");

		} else {
			PainAssessment painass = null;
			try {
				painass = MedrexClientManager.getInstance().getPainAssessment(
						Global.currentResidentAssessmentFormPage7Key,
						painAssessmentSiteNumber);
			} catch (Exception e) {
				e.printStackTrace();
			}
			setCoorX(painass.getX());
			setCoorY(painass.getY());
			painAssessmentFormSerial = painass.getSerial();
			cmbSiteNum.setSelectedItem(painass.getSiteNum());
			// cmbStage.setSelectedItem(painass.getStage());
			cmbPainOnset.setSelectedItem(painass.getPainOnset());
			cmbDuration.setSelectedItem(painass.getDuration());
			cmbQuality.setSelectedItem(painass.getQuality());
			cmbExacerbatingFactors.setSelectedItem(painass
					.getExacerbatingFactors());
			cmbPainEffects.setSelectedItem(painass.getPainEffects());
			// cmbNonPharmacolotical.setSelectedItem(painass.getNonPharmacolotical());
			cmbExihibits.setSelectedItem(painass.getExihibits());

		}
	}

	public void doSave() {
		PainAssessment painass = new PainAssessment();

		painass.setSerial(painAssessmentFormSerial);
		painass.setFormId(Global.currentResidentAssessmentFormPage7Key);
		painass.setFormNum(painAssessmentSiteNumber);
		painass.setX(coorX);
		painass.setY(coorY);
		// painass.setStage((String) cmbStage.getSelectedItem());
		painass.setSiteNum((String) cmbSiteNum.getSelectedItem());
		// painass.setStage((String)cmbStage.getSelectedItem());
		painass.setPainOnset((String) cmbPainOnset.getSelectedItem());
		painass.setDuration((String) cmbDuration.getSelectedItem());
		painass.setQuality((String) cmbQuality.getSelectedItem());
		painass.setExacerbatingFactors((String) cmbExacerbatingFactors
				.getSelectedItem());
		painass.setPainEffects((String) cmbPainEffects.getSelectedItem());
		// painass.setNonPharmacolotical((String)cmbNonPharmacolotical.getSelectedItem());
		painass.setExihibits((String) cmbExihibits.getSelectedItem());

		try {
			Global.currentPainAssessmentFormKey = MedrexClientManager
					.getInstance().insertOrUpdatePainAssessment(painass);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void doHighlight() {
		if (stillHasFocus) {
			setBorder(BORDER_HIGH);
			cmbSiteNum.setBackground(COLOR_HIGH);
			// cmbStage.setBackground(COLOR_HIGH);
			cmbPainOnset.setBackground(COLOR_HIGH);
			cmbDuration.setBackground(COLOR_HIGH);
			cmbQuality.setBackground(COLOR_HIGH);
			cmbExacerbatingFactors.setBackground(COLOR_HIGH);
			cmbPainEffects.setBackground(COLOR_HIGH);
			// cmbNonPharmacolotical.setBackground(COLOR_HIGH);
			cmbExihibits.setBackground(COLOR_HIGH);

			firePropertyEvent();
		} else {
			setBorder(BORDER_NORM);
			cmbSiteNum.setBackground(COLOR_NORM);
			// cmbStage.setBackground(COLOR_NORM);
			cmbPainOnset.setBackground(COLOR_NORM);
			cmbDuration.setBackground(COLOR_NORM);
			cmbQuality.setBackground(COLOR_NORM);
			cmbExacerbatingFactors.setBackground(COLOR_NORM);
			cmbPainEffects.setBackground(COLOR_NORM);
			// cmbNonPharmacolotical.setBackground(COLOR_NORM);
			cmbExihibits.setBackground(COLOR_NORM);

			fireNull();
		}
	}

	public void doEnable(boolean b) {
		if (b) { // enable All
			// cmbStage.setEnabled(true);
			cmbPainOnset.setEnabled(true);
			cmbDuration.setEnabled(true);
			cmbQuality.setEnabled(true);
			cmbExacerbatingFactors.setEnabled(true);
			cmbPainEffects.setEnabled(true);
			// cmbNonPharmacolotical.setEnabled(true);
			cmbExihibits.setEnabled(true);
		} else {
			// cmbStage.setEnabled(false);
			cmbPainOnset.setEnabled(false);
			cmbDuration.setEnabled(false);
			cmbQuality.setEnabled(false);
			cmbExacerbatingFactors.setEnabled(false);
			cmbPainEffects.setEnabled(false);
			// cmbNonPharmacolotical.setEnabled(false);
			cmbExihibits.setEnabled(false);
		}
	}

	public void firePropertyEvent() {
		if (cmbSiteNum.getSelectedItem().toString().equalsIgnoreCase(" ")) {
			fireNull();
			doEnable(false);
		} else {
			This_Panel.firePropertyChange(PROPERTY_SITENUM_CHANGED, 0, Integer
					.parseInt(cmbSiteNum.getSelectedItem().toString()));
			doEnable(true);
		}
	}

	public void fireNull() {
		fireIndex(0);
	}

	public void fireIndex(int i) {
		This_Panel.firePropertyChange(PROPERTY_SITENUM_CHANGED, -1, i);
	}
}
