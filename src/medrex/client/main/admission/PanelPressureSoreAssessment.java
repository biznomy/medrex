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
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldFormatter;
import medrex.client.utils.controls.PainSiteAppearanceButton;
import medrex.commons.vo.medication.PressureSoreAssessment;

import com.sX.swing.widgets.JClockButton;

public class PanelPressureSoreAssessment extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7162268437820010355L;
	public static final String PROPERTY_SITENUM_CHANGED = "PROPERTY_SITENUM_CHANGED";
	public static final String PROPERTY_FOCUS_GAINED = "PROPERTY_FOCUS_GAINED";
	private final PanelPressureSoreAssessment This_Panel;

	private final Color COLOR_HIGH = new Color(255, 102, 102);
	private final Color COLOR_NORM = Color.WHITE;
	private final Border BORDER_HIGH = new LineBorder(COLOR_HIGH, 1, false);
	private Border BORDER_NORM; // = new LineBorder(Color.BLACK,1 , false);

	private boolean stillHasFocus = false;

	private JComboBox cmbHealing;
	private JComboBox cmbOdor;
	private JComboBox cmbDrainageAmount;
	private JComboBox cmbDrainageType;
	private JComboBox cmbAppearance;

	private JFormattedTextField txtLength;
	private JFormattedTextField txtWidth;
	private JFormattedTextField txtDepth;
	private JClockButton btnTunneling;

	// private JComboBox cmbTunneling;
	// private JComboBox cmbDepth;
	// private JComboBox cmbWidth;
	// private JComboBox cmbLength;
	JComboBox cmbSiteNum;
	JComboBox cmbStage;
	JComboBox cmbShape;

	int pressureSoreSiteNumber;
	int pressureSoreFormSerial;
	int coorX;
	int coorY;
	private PainSiteAppearanceButton painSiteApp;

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

	public PanelPressureSoreAssessment(int pSSNum) {
		super();
		setOpaque(false);
		This_Panel = this;

		setBorder(BORDER_HIGH);
		setSize(40, 266);

		pressureSoreSiteNumber = pSSNum;
		setLayout(null);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(40, 266));

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
				// Global.siteNumber=pressureSoreSiteNumber;
				// Global.panelResidentAssessmentFormPage3.selectSite(Global.siteNumber);
				// System.out.println("Coordinate x:"+getCoorX());
				// System.out.println("Coordinate y:"+getCoorY());

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
				// setCoorX(0);
				// setCoorY(0);
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
		cmbSiteNum.setBounds(1, 1, 37, 23);
		add(cmbSiteNum);

		BORDER_NORM = cmbSiteNum.getBorder();

		cmbStage = new JComboBox();
		cmbStage.setOpaque(false);
		cmbStage.addFocusListener(new FocusAdapter() {
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
		cmbStage.setFocusCycleRoot(true);
		cmbStage.setBackground(Color.WHITE);
		cmbStage.setBounds(1, 23, 37, 23);
		add(cmbStage);

		cmbShape = new JComboBox();
		cmbShape.setOpaque(false);
		cmbShape.addFocusListener(new FocusAdapter() {
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
		cmbShape.setBackground(Color.WHITE);
		cmbShape.setBounds(1, 45, 36, 23);
		add(cmbShape);

		txtLength = new JFormattedTextField(FieldFormatter.MAX3);
		txtLength.addFocusListener(new FocusAdapter() {
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
		txtLength.setOpaque(true);
		txtLength.setBackground(Color.WHITE);
		txtLength.setBounds(1, 67, 36, 23);
		add(txtLength);

		/*
		 * cmbLength = new JComboBox(); cmbLength.setOpaque(false);
		 * cmbLength.addFocusListener(new FocusAdapter() { public void
		 * focusGained(final FocusEvent e) { stillHasFocus = true;
		 * doHighlight(); }
		 * 
		 * public void focusLost(final FocusEvent e) { stillHasFocus = false;
		 * doHighlight(); } }); cmbLength.setBackground(Color.WHITE);
		 * cmbLength.setBounds(1, 67, 38, 23); add(cmbLength);
		 */

		txtWidth = new JFormattedTextField(FieldFormatter.MAX3);
		txtWidth.addFocusListener(new FocusAdapter() {
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
		txtWidth.setOpaque(true);
		txtWidth.setBounds(1, 89, 36, 23);
		add(txtWidth);

		/*
		 * cmbWidth = new JComboBox(); cmbWidth.setOpaque(false);
		 * cmbWidth.addFocusListener(new FocusAdapter() { public void
		 * focusGained(final FocusEvent e) { stillHasFocus = true;
		 * doHighlight(); }
		 * 
		 * public void focusLost(final FocusEvent e) { stillHasFocus = false;
		 * doHighlight(); } }); cmbWidth.setBackground(Color.WHITE);
		 * cmbWidth.setBounds(1, 89, 38, 23); add(cmbWidth);
		 */

		txtDepth = new JFormattedTextField(FieldFormatter.MAX3);
		txtDepth.addFocusListener(new FocusAdapter() {
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
		txtDepth.setOpaque(true);
		txtDepth.setBounds(1, 111, 36, 23);
		add(txtDepth);

		/*
		 * cmbDepth = new JComboBox(); cmbDepth.setOpaque(false);
		 * cmbDepth.addFocusListener(new FocusAdapter() { public void
		 * focusGained(final FocusEvent e) { stillHasFocus = true;
		 * doHighlight(); }
		 * 
		 * public void focusLost(final FocusEvent e) { stillHasFocus = false;
		 * doHighlight(); } }); cmbDepth.setBackground(Color.WHITE);
		 * cmbDepth.setBounds(1, 111, 38, 23); add(cmbDepth);
		 */

		btnTunneling = new JClockButton();
		btnTunneling.addFocusListener(new FocusAdapter() {
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
		btnTunneling.setOpaque(true);
		btnTunneling.setBounds(1, 133, 36, 23);
		add(btnTunneling);

		/*
		 * cmbTunneling = new JComboBox(); cmbTunneling.setOpaque(false);
		 * cmbTunneling.addFocusListener(new FocusAdapter() { public void
		 * focusGained(final FocusEvent e) { stillHasFocus = true;
		 * doHighlight(); }
		 * 
		 * public void focusLost(final FocusEvent e) { stillHasFocus = false;
		 * doHighlight(); } }); cmbTunneling.setBackground(Color.WHITE);
		 * cmbTunneling.setBounds(1, 133, 38, 23); add(cmbTunneling);
		 */

		painSiteApp = new PainSiteAppearanceButton();
		painSiteApp.setBorder(new LineBorder(Color.black, 1, false));
		painSiteApp.addFocusListener(new FocusAdapter() {
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
		painSiteApp.setOpaque(false);
		painSiteApp.setBounds(1, 156, 36, 23);
		add(painSiteApp);

		/*
		 * cmbAppearance = new JComboBox(); cmbAppearance.setOpaque(false);
		 * cmbAppearance.addFocusListener(new FocusAdapter() { public void
		 * focusGained(final FocusEvent e) { stillHasFocus = true;
		 * doHighlight(); }
		 * 
		 * public void focusLost(final FocusEvent e) { stillHasFocus = false;
		 * doHighlight(); } }); cmbAppearance.setBackground(Color.WHITE);
		 * cmbAppearance.setBounds(1, 156, 37, 23); add(cmbAppearance);
		 */

		cmbDrainageType = new JComboBox();
		cmbDrainageType.setOpaque(false);
		cmbDrainageType.addFocusListener(new FocusAdapter() {
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
		cmbDrainageType.setBackground(Color.WHITE);
		cmbDrainageType.setBounds(1, 177, 37, 23);
		add(cmbDrainageType);

		cmbDrainageAmount = new JComboBox();
		cmbDrainageAmount.setOpaque(false);
		cmbDrainageAmount.addFocusListener(new FocusAdapter() {
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
		cmbDrainageAmount.setBackground(Color.WHITE);
		cmbDrainageAmount.setBounds(1, 198, 37, 23);
		add(cmbDrainageAmount);

		cmbOdor = new JComboBox();
		cmbOdor.setOpaque(false);
		cmbOdor.addFocusListener(new FocusAdapter() {
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
		cmbOdor.setBackground(Color.WHITE);
		cmbOdor.setBounds(1, 221, 37, 23);
		add(cmbOdor);

		cmbHealing = new JComboBox();
		cmbHealing.setFocusCycleRoot(true);
		cmbHealing.setOpaque(false);
		cmbHealing.addFocusListener(new FocusAdapter() {
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
		cmbHealing.setBackground(Color.WHITE);
		cmbHealing.setBounds(1, 242, 37, 23);
		add(cmbHealing);

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
				"12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
				"22", "23" }));
		cmbStage.setModel(new DefaultComboBoxModel(new String[] { " ", "1",
				"2", "3", "4", "N/A" }));
		cmbShape.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				" ", "O", "S", "I", "R" }));
		/*
		 * cmbLength.setModel(new javax.swing.DefaultComboBoxModel(new String[]
		 * { " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
		 * "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
		 * "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34",
		 * "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45",
		 * "46", "47", "48", "49", "50" }));
		 * 
		 * cmbWidth.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
		 * " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
		 * "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
		 * "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34",
		 * "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45",
		 * "46", "47", "48", "49", "50" }));
		 * 
		 * cmbDepth.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
		 * "", "1", "2", "3", "4", "5" }));
		 * 
		 * cmbTunneling.setModel(new javax.swing.DefaultComboBoxModel( new
		 * String[] { "", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		 */

		/*
		 * cmbAppearance.setModel(new javax.swing.DefaultComboBoxModel( new
		 * String[] { "", "P", "R", "B", "E", "S" }));
		 */

		cmbDrainageType.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "", "O", "B", "P", "S" }));
		cmbDrainageAmount.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "", "O", "S", "M", "L" }));
		cmbOdor.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"", "O", "F" }));
		cmbHealing.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"", "I", "U", "W", "N/A" }));
	}

	public void updateData() {
		if (Global.currentResidentAssessmentFormKey == 0) {
			pressureSoreFormSerial = 0;
			cmbSiteNum.setSelectedItem("");
			cmbShape.setSelectedItem("");
			cmbStage.setSelectedItem("");
			// cmbLength.setSelectedItem("");
			// cmbWidth.setSelectedItem("");
			// cmbDepth.setSelectedItem("");
			// cmbTunneling.setSelectedItem("");
			// cmbAppearance.setSelectedItem("");
			cmbDrainageType.setSelectedItem("");
			cmbDrainageAmount.setSelectedItem("");
			cmbOdor.setSelectedItem("");
			cmbHealing.setSelectedItem("");

		} else {
			PressureSoreAssessment psa = null;

			/*
			 * cmbSiteNum.setSelectedItem(""); cmbShape.setSelectedItem("");
			 * cmbStage.setSelectedItem(""); cmbLength.setSelectedItem("");
			 * cmbWidth.setSelectedItem(""); cmbDepth.setSelectedItem("");
			 * cmbTunneling.setSelectedItem("");
			 * cmbAppearance.setSelectedItem("");
			 * cmbDrainageType.setSelectedItem("");
			 * cmbDrainageAmount.setSelectedItem("");
			 * cmbOdor.setSelectedItem(""); cmbHealing.setSelectedItem("");
			 */

			try {
				// System.out.println("key is :" +
				// Global.currentResidentAssessmentFormPage3Key + "form num : "
				// + pressureSoreSiteNumber);
				psa = MedrexClientManager.getInstance()
						.getPressureSoreAssessment(
								Global.currentResidentAssessmentFormPage3Key,
								pressureSoreSiteNumber);
			} catch (Exception e) {
				e.printStackTrace();
			}
			setCoorX(psa.getX());
			setCoorY(psa.getY());
			pressureSoreFormSerial = psa.getSerial();
			cmbSiteNum.setSelectedItem(psa.getSiteNum());
			cmbShape.setSelectedItem(psa.getShape());
			cmbStage.setSelectedItem(psa.getStage());

			txtLength.setValue(psa.getLength());
			txtWidth.setValue(psa.getWidth());
			txtDepth.setValue(psa.getDepth());
			btnTunneling.setValue(psa.getTunneling());

			painSiteApp.setPinkValue(psa.getRed());
			painSiteApp.setRedValue(psa.getRed());
			painSiteApp.setBrownValue(psa.getBrown());
			painSiteApp.setEscharValue(psa.getEschar());
			painSiteApp.setSloughValue(psa.getSlough());

			// cmbLength.setSelectedItem(psa.getLength());
			// cmbWidth.setSelectedItem(psa.getWidth());
			// cmbDepth.setSelectedItem(psa.getDepth());
			// cmbTunneling.setSelectedItem(psa.getTunneling());
			// cmbAppearance.setSelectedItem(psa.getAppearance());
			cmbDrainageType.setSelectedItem(psa.getDrainageType());
			cmbDrainageAmount.setSelectedItem(psa.getDrainageAmount());
			cmbOdor.setSelectedItem(psa.getOdor());
			cmbHealing.setSelectedItem(psa.getHealing());
		}
	}

	public void doSave() {
		// System.out.println("Global.currentResidentAssessmentFormPage3Key: "+Global.currentResidentAssessmentFormPage3Key);
		// System.out.println("pressureSoreSiteNumber : "+pressureSoreSiteNumber);
		PressureSoreAssessment psa = new PressureSoreAssessment();

		psa.setSerial(pressureSoreFormSerial);
		psa.setFormId(Global.currentResidentAssessmentFormPage3Key);
		psa.setFormNum(pressureSoreSiteNumber);
		psa.setX(coorX);
		psa.setY(coorY);
		psa.setStage((String) cmbStage.getSelectedItem());
		psa.setSiteNum((String) cmbSiteNum.getSelectedItem());
		psa.setShape((String) cmbShape.getSelectedItem());

		psa.setLength(txtLength.getText());
		psa.setWidth(txtWidth.getText());
		psa.setDepth(txtDepth.getText());
		psa.setTunneling(btnTunneling.getValue());

		psa.setPink(painSiteApp.getPinkValue());
		psa.setRed(painSiteApp.getRedValue());
		psa.setBrown(painSiteApp.getBrownValue());
		psa.setEschar(painSiteApp.getEscharValue());
		psa.setSlough(painSiteApp.getSloughValue());

		// System.out.println("PinkValue: "+ painSiteApp.getPinkValue());
		// System.out.println("RedValue: "+ painSiteApp.getRedValue());
		// System.out.println("BrownValue: "+ painSiteApp.getBrownValue());
		// System.out.println("EscharValue: "+ painSiteApp.getEscharValue());
		// System.out.println("SloughValue: "+ painSiteApp.getSloughValue());

		// psa.setLength((String) cmbLength.getSelectedItem());
		// psa.setWidth((String) cmbWidth.getSelectedItem());
		// psa.setDepth((String) cmbDepth.getSelectedItem());
		// psa.setTunneling((String) cmbTunneling.getSelectedItem());
		// psa.setAppearance((String) cmbAppearance.getSelectedItem());
		psa.setDrainageType((String) cmbDrainageType.getSelectedItem());
		psa.setDrainageAmount((String) cmbDrainageAmount.getSelectedItem());
		psa.setOdor((String) cmbOdor.getSelectedItem());
		psa.setHealing((String) cmbHealing.getSelectedItem());
		try {
			Global.currentPressureSoreRecordFormKey = MedrexClientManager
					.getInstance().insertOrUpdatePressureSoreAssessment(psa);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void doHighlight() {
		if (stillHasFocus) {
			setBorder(BORDER_HIGH);
			cmbSiteNum.setBackground(COLOR_HIGH);
			cmbShape.setBackground(COLOR_HIGH);
			cmbStage.setBackground(COLOR_HIGH);

			txtLength.setBackground(COLOR_HIGH);
			txtWidth.setBackground(COLOR_HIGH);
			txtDepth.setBackground(COLOR_HIGH);
			btnTunneling.setBackground(COLOR_HIGH);
			painSiteApp.setBackground(COLOR_HIGH);

			// cmbLength.setBackground(COLOR_HIGH);
			// cmbWidth.setBackground(COLOR_HIGH);
			// cmbDepth.setBackground(COLOR_HIGH);
			// cmbTunneling.setBackground(COLOR_HIGH);
			// cmbAppearance.setBackground(COLOR_HIGH);
			cmbDrainageType.setBackground(COLOR_HIGH);
			cmbDrainageAmount.setBackground(COLOR_HIGH);
			cmbOdor.setBackground(COLOR_HIGH);
			cmbHealing.setBackground(COLOR_HIGH);
			firePropertyEvent();
		} else {
			setBorder(BORDER_NORM);
			cmbSiteNum.setBackground(COLOR_NORM);
			cmbShape.setBackground(COLOR_NORM);
			cmbStage.setBackground(COLOR_NORM);

			txtLength.setBackground(COLOR_NORM);
			txtWidth.setBackground(COLOR_NORM);
			txtDepth.setBackground(COLOR_NORM);
			btnTunneling.setBackground(COLOR_NORM);
			painSiteApp.setBackground(COLOR_NORM);

			// cmbLength.setBackground(COLOR_NORM);
			// cmbWidth.setBackground(COLOR_NORM);
			// cmbDepth.setBackground(COLOR_NORM);
			// cmbTunneling.setBackground(COLOR_NORM);
			// cmbAppearance.setBackground(COLOR_NORM);
			cmbDrainageType.setBackground(COLOR_NORM);
			cmbDrainageAmount.setBackground(COLOR_NORM);
			cmbOdor.setBackground(COLOR_NORM);
			cmbHealing.setBackground(COLOR_NORM);
			fireNull();
		}
	}

	public void doEnable(boolean b) {
		if (b) { // enable All
			// cmbSiteNum.setEnabled(true);
			cmbShape.setEnabled(true);
			cmbStage.setEnabled(true);

			txtLength.setEnabled(true);
			txtWidth.setEnabled(true);
			txtDepth.setEnabled(true);
			btnTunneling.setEnabled(true);
			painSiteApp.setEnabled(true);

			// cmbLength.setEnabled(true);
			// cmbWidth.setEnabled(true);
			// cmbDepth.setEnabled(true);
			// cmbTunneling.setEnabled(true);
			// cmbAppearance.setEnabled(true);
			cmbDrainageType.setEnabled(true);
			cmbDrainageAmount.setEnabled(true);
			cmbOdor.setEnabled(true);
			cmbHealing.setEnabled(true);
		} else {
			// cmbSiteNum.setEnabled(false);
			cmbShape.setEnabled(false);
			cmbStage.setEnabled(false);

			txtLength.setEnabled(false);
			txtWidth.setEnabled(false);
			txtDepth.setEnabled(false);
			btnTunneling.setEnabled(false);
			painSiteApp.setEnabled(false);

			// cmbLength.setEnabled(false);
			// cmbWidth.setEnabled(false);
			// cmbDepth.setEnabled(false);
			// cmbTunneling.setEnabled(false);
			// cmbAppearance.setEnabled(false);
			cmbDrainageType.setEnabled(false);
			cmbDrainageAmount.setEnabled(false);
			cmbOdor.setEnabled(false);
			cmbHealing.setEnabled(false);
		}
	}

	public void firePropertyEvent() {
		// System.out.println("pressureSoreSiteNumber"+pressureSoreSiteNumber);
		// Global.siteNumber=pressureSoreSiteNumber;
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
