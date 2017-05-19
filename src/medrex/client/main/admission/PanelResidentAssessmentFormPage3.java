package medrex.client.main.admission;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Iterator;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.BorderUIResource.CompoundBorderUIResource;
import javax.swing.plaf.basic.BasicBorders;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldValidation;
import medrex.client.utils.SwingUtils;
import medrex.commons.intf.Form;
import medrex.commons.vo.admission.ResidentAssessmentFormPage3;
import medrex.commons.vo.others.Nurse;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;

import com.jgoodies.validation.ValidationResult;
import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxRadioButton;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelResidentAssessmentFormPage3 extends JxPanel implements Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5934582329080111194L;
	Font font_arial_plain = new Font("Arial", Font.PLAIN, 11);
	Font font_arial_Bold = new Font("Arial", Font.BOLD, 11);
	Insets margin_2L = new Insets(0, 2, 0, 0);
	Border border = new CompoundBorderUIResource(new LineBorder(Color.BLACK),
			new BasicBorders.MarginBorder());
	Color background_White = Color.WHITE;
	Color foreground_Black = Color.BLACK;

	private JxLabel locationLabel;
	private JxText txtAbnormality;
	private JxText txtLocation;
	private JxLabel lblRoom;
	private JxLabel lblResidentName;
	private JxLabel lblHumanImg;
	private JFrame frm;
	private static ImageIcon humanImg[] = new ImageIcon[] {
			new ImageIcon("img/human1/0.jpg"), // 0
			new ImageIcon("img/human1/1.jpg"), // 1
			new ImageIcon("img/human1/2.jpg"), // 2
			new ImageIcon("img/human1/3.jpg"), // 3
			new ImageIcon("img/human1/4.jpg"), // 4
			new ImageIcon("img/human1/5.jpg"), // 5
			new ImageIcon("img/human1/6.jpg"), // 6
			new ImageIcon("img/human1/7.jpg"), // 7
			new ImageIcon("img/human1/8.jpg"), // 8
			new ImageIcon("img/human1/9.jpg"), // 9
			new ImageIcon("img/human1/10.jpg"), // 10
			new ImageIcon("img/human1/11.jpg"), // 11
			new ImageIcon("img/human1/12.jpg"), // 12
			new ImageIcon("img/human1/13.jpg"), // 13
			new ImageIcon("img/human1/14.jpg"), // 14
			new ImageIcon("img/human1/15.jpg"), // 15
			new ImageIcon("img/human1/16.jpg"), // 16
			new ImageIcon("img/human1/17.jpg"), // 17
			new ImageIcon("img/human1/18.jpg"), // 18
			new ImageIcon("img/human1/19.jpg"), // 19
			new ImageIcon("img/human1/20.jpg"), // 20
			new ImageIcon("img/human1/21.jpg"), // 21
			new ImageIcon("img/human1/22.jpg"), // 21
			new ImageIcon("img/human1/23.jpg") // 21
	};

	private short MAX_COL = 10;
	private JxDateChooser dcNurseVisit;
	private JxLabel dateLabel;
	private JxComboBox cmbNurse;
	private JxLabel ifSoWhatLabel;
	private JxPanel panel_10;
	private ButtonGroup bgAppearance = new ButtonGroup();
	private ButtonGroup bgTemp = new ButtonGroup();
	private ButtonGroup bgTurgor = new ButtonGroup();
	private ButtonGroup bgColor = new ButtonGroup();
	// creates form level design settings

	JxRadioButton rbColorPink;
	JxRadioButton rbColorPale;
	JxRadioButton rbColorJaundice;
	JxRadioButton rbColorCyanotic;
	JxRadioButton rbColorAshen;
	JxRadioButton rbColorFlushed;

	JxRadioButton rbTurgorGood;
	JxRadioButton rbTurgorSlow;

	JxRadioButton rbTempCool;
	JxRadioButton rbTempHot;
	JxRadioButton rbTempWarm;
	JxRadioButton rbTempDiaphoretic;

	JxRadioButton rbAppearanceST;
	JxRadioButton rbAppearanceB;
	JxRadioButton rbAppearanceINC;
	private int num = 0;
	PanelPressureSoreAssessment panelPressureSoreAssessmentNum1;
	/*
	 * PanelPressureSoreAssessment panelPressureSoreAssessmentNum2;
	 * PanelPressureSoreAssessment panelPressureSoreAssessmentNum3;
	 * PanelPressureSoreAssessment panelPressureSoreAssessmentNum4;
	 * PanelPressureSoreAssessment panelPressureSoreAssessmentNum5;
	 * PanelPressureSoreAssessment panelPressureSoreAssessmentNum6;
	 * PanelPressureSoreAssessment panelPressureSoreAssessmentNum7;
	 * PanelPressureSoreAssessment panelPressureSoreAssessmentNum8;
	 * PanelPressureSoreAssessment panelPressureSoreAssessmentNum9;
	 * PanelPressureSoreAssessment panelPressureSoreAssessmentNum10;
	 */

	PanelPressureSoreAssessment panelPressureSoreAssessmentArr[];
	private JxLabel lbl;
	private PanelPressureSoreAssessment currentColumn;
	private int col = 0;
	private static JxPanel panelHuman;

	public PanelResidentAssessmentFormPage3() {
		super();
		Theme theme = new BlackOverWhiteTheme();
		// this.image = image;
		// this.x = x;
		// this.y = y;
		setBorder(new LineBorder(Color.black, 1, false));

		Global.panelResidentAssessmentFormPage3 = this;
		setLayout(null);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(930, 750));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setOpaque(false);

		panel.setLayout(null);
		panel.setBounds(0, 0, 920, 19);
		add(panel);

		final JxLabel skinAssessmentLabel = new JxLabel();

		skinAssessmentLabel.setForeground(new Color(255, 255, 255));

		skinAssessmentLabel.setFontSize(14);
		skinAssessmentLabel.setFontStyle(Font.BOLD);
		skinAssessmentLabel.setText("SKIN ASSESSMENT");
		skinAssessmentLabel.setBounds(684, 0, 168, 26);
		panel.add(skinAssessmentLabel);

		final JxLabel residentNameLabel = new JxLabel();
		residentNameLabel.setTheme(theme);

		residentNameLabel.setText("Resident Name :");
		residentNameLabel.setBounds(108, 0, 89, 14);
		panel.add(residentNameLabel);

		lblResidentName = new JxLabel();
		lblResidentName.setTheme(theme);
		lblResidentName.setFontStyle(Font.BOLD);
		lblResidentName.setBounds(207, 0, 230, 18);
		panel.add(lblResidentName);

		final JxLabel roomLabel = new JxLabel();
		roomLabel.setTheme(theme);

		roomLabel.setText("Room # :");
		roomLabel.setBounds(493, 0, 54, 14);
		panel.add(roomLabel);

		lblRoom = new JxLabel();
		lblRoom.setTheme(theme);
		lblRoom.setFontStyle(Font.BOLD);

		lblRoom.setBounds(553, 0, 77, 18);
		panel.add(lblRoom);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setOpaque(false);
		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1.setBounds(0, 20, 920, 155);
		add(panel_1);

		panel_1.setLayout(null);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);

		panel_4.setOpaque(false);

		panel_4.setLayout(null);
		panel_4.setBounds(2, 2, 900, 30);
		panel_1.add(panel_4);

		final JxLabel skinColorLabel = new JxLabel();
		skinColorLabel.setTheme(theme);

		skinColorLabel.setText("Skin Color :");
		skinColorLabel.setBounds(10, 10, 80, 16);
		panel_4.add(skinColorLabel);

		rbColorPink = new JxRadioButton();
		rbColorPink.setTheme(theme);

		bgColor.add(rbColorPink);

		rbColorPink.setText("Pink");
		rbColorPink.setActionCommand("1");
		rbColorPink.setBounds(129, 7, 67, 24);
		panel_4.add(rbColorPink);

		rbColorPale = new JxRadioButton();
		rbColorPale.setTheme(theme);

		bgColor.add(rbColorPale);
		rbColorPale.setActionCommand("2");

		rbColorPale.setText("Pale");
		rbColorPale.setBounds(202, 6, 67, 24);
		panel_4.add(rbColorPale);

		rbColorJaundice = new JxRadioButton();
		rbColorJaundice.setTheme(theme);

		rbColorJaundice.setActionCommand("3");
		bgColor.add(rbColorJaundice);

		rbColorJaundice.setText("Jaundice");
		rbColorJaundice.setBounds(292, 6, 101, 24);
		panel_4.add(rbColorJaundice);

		rbColorCyanotic = new JxRadioButton();
		rbColorCyanotic.setTheme(theme);

		rbColorCyanotic.setActionCommand("4");
		bgColor.add(rbColorCyanotic);

		rbColorCyanotic.setText("Cyanotic");
		rbColorCyanotic.setBounds(399, 6, 80, 24);
		panel_4.add(rbColorCyanotic);

		rbColorAshen = new JxRadioButton();
		rbColorAshen.setTheme(theme);

		rbColorAshen.setActionCommand("5");
		bgColor.add(rbColorAshen);

		rbColorAshen.setText("Ashen");
		rbColorAshen.setBounds(506, 6, 67, 24);
		panel_4.add(rbColorAshen);

		rbColorFlushed = new JxRadioButton();
		rbColorFlushed.setTheme(theme);

		rbColorFlushed.setActionCommand("6");
		bgColor.add(rbColorFlushed);

		rbColorFlushed.setText("Flushed");
		rbColorFlushed.setBounds(603, 6, 80, 24);
		panel_4.add(rbColorFlushed);

		final JxPanel panel_4_1 = new JxPanel();
		panel_4_1.setTheme(theme);
		panel_4_1.setOpaque(false);
		panel_4_1.setLayout(null);

		panel_4_1.setBounds(2, 29, 900, 30);
		panel_1.add(panel_4_1);

		final JxLabel skinColorLabel_1 = new JxLabel();
		skinColorLabel_1.setTheme(theme);

		skinColorLabel_1.setFontSize(12);
		skinColorLabel_1.setFontStyle(Font.BOLD);
		skinColorLabel_1.setText("Skin Turgor :");
		skinColorLabel_1.setBounds(10, 10, 80, 16);
		panel_4_1.add(skinColorLabel_1);

		rbTurgorGood = new JxRadioButton();
		rbTurgorGood.setTheme(theme);

		rbTurgorGood.setActionCommand("1");
		bgTurgor.add(rbTurgorGood);

		rbTurgorGood.setText("Good");
		rbTurgorGood.setBounds(129, 7, 67, 24);
		panel_4_1.add(rbTurgorGood);

		rbTurgorSlow = new JxRadioButton();
		rbTurgorSlow.setTheme(theme);

		rbTurgorSlow.setActionCommand("2");
		bgTurgor.add(rbTurgorSlow);

		rbTurgorSlow.setText("Slow to return to normal position");
		rbTurgorSlow.setBounds(202, 6, 288, 24);
		panel_4_1.add(rbTurgorSlow);

		final JxPanel panel_4_2 = new JxPanel();
		panel_4_2.setTheme(theme);
		panel_4_2.setOpaque(false);
		panel_4_2.setLayout(null);

		panel_4_2.setBounds(2, 58, 900, 30);
		panel_1.add(panel_4_2);

		final JxLabel skinColorLabel_2 = new JxLabel();
		skinColorLabel_2.setTheme(theme);

		skinColorLabel_2.setFontSize(12);
		skinColorLabel_2.setFontStyle(Font.BOLD);
		skinColorLabel_2.setText("Skin Temperature :");
		skinColorLabel_2.setBounds(10, 10, 114, 16);
		panel_4_2.add(skinColorLabel_2);

		rbTempCool = new JxRadioButton();
		rbTempCool.setTheme(theme);

		rbTempCool.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtLocation.setEnabled(true);
				txtLocation.requestFocus();
			}
		});
		rbTempCool.setActionCommand("1");
		bgTemp.add(rbTempCool);

		rbTempCool.setText("Cool");
		rbTempCool.setBounds(130, 6, 67, 24);
		panel_4_2.add(rbTempCool);

		rbTempHot = new JxRadioButton();
		rbTempHot.setTheme(theme);

		rbTempHot.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtLocation.setEnabled(true);
				locationLabel.setVisible(true);
				locationLabel.setVisible(true);
				txtLocation.requestFocus();
			}
		});
		rbTempHot.setActionCommand("2");
		bgTemp.add(rbTempHot);

		rbTempHot.setText("Hot");
		rbTempHot.setBounds(202, 6, 67, 24);
		panel_4_2.add(rbTempHot);

		rbTempWarm = new JxRadioButton();
		rbTempWarm.setTheme(theme);

		rbTempWarm.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (rbTempWarm.isSelected()) {
					txtLocation.setVisible(true);
					txtLocation.requestFocus();
					locationLabel.setVisible(true);
				}
			}
		});
		rbTempWarm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtLocation.setEnabled(true);
				locationLabel.setVisible(true);
				txtLocation.requestFocus();
			}
		});
		rbTempWarm.setActionCommand("3");
		bgTemp.add(rbTempWarm);

		rbTempWarm.setText("Warm");
		rbTempWarm.setBounds(292, 6, 101, 24);
		panel_4_2.add(rbTempWarm);

		rbTempDiaphoretic = new JxRadioButton();
		rbTempDiaphoretic.setTheme(theme);

		rbTempDiaphoretic.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (rbTempDiaphoretic.isSelected()) {
					txtLocation.setVisible(false);
					locationLabel.setVisible(false);

				}
			}
		});
		rbTempDiaphoretic.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				txtLocation.setEnabled(false);
				txtLocation.setText("");
			}
		});
		rbTempDiaphoretic.setActionCommand("4");
		bgTemp.add(rbTempDiaphoretic);

		rbTempDiaphoretic.setText("Diaphoretic");
		rbTempDiaphoretic.setBounds(399, 6, 114, 24);
		panel_4_2.add(rbTempDiaphoretic);

		locationLabel = new JxLabel();
		locationLabel.setTheme(theme);

		locationLabel.setText("Location: ");
		locationLabel.setBounds(519, 10, 55, 16);
		panel_4_2.add(locationLabel);

		txtLocation = new JxText();
		txtLocation.setTheme(theme);

		txtLocation.setEnabled(false);
		txtLocation.setBounds(580, 8, 186, 18);
		panel_4_2.add(txtLocation);

		final JxPanel panel_4_2_1 = new JxPanel();
		panel_4_2_1.setTheme(theme);
		panel_4_2_1.setOpaque(false);
		panel_4_2_1.setLayout(null);

		panel_4_2_1.setBounds(2, 87, 915, 30);
		panel_1.add(panel_4_2_1);

		final JxLabel skinColorLabel_2_1 = new JxLabel();
		skinColorLabel_2_1.setTheme(theme);

		skinColorLabel_2_1.setFontSize(12);
		skinColorLabel_2_1.setFontStyle(Font.BOLD);
		skinColorLabel_2_1.setText("Abnormality :");
		skinColorLabel_2_1.setBounds(10, 10, 87, 16);
		panel_4_2_1.add(skinColorLabel_2_1);

		rbAppearanceST = new JxRadioButton();
		rbAppearanceST.setTheme(theme);

		rbAppearanceST.setActionCommand("1");
		bgAppearance.add(rbAppearanceST);

		rbAppearanceST.setText("ST = SKIN TEAR");
		rbAppearanceST.setBounds(303, 7, 100, 23);
		panel_4_2_1.add(rbAppearanceST);

		rbAppearanceB = new JxRadioButton();
		rbAppearanceB.setTheme(theme);

		rbAppearanceB.setActionCommand("2");
		bgAppearance.add(rbAppearanceB);

		rbAppearanceB.setText("B = Bruise");
		rbAppearanceB.setBounds(403, 7, 70, 24);
		panel_4_2_1.add(rbAppearanceB);

		rbAppearanceINC = new JxRadioButton();
		rbAppearanceINC.setTheme(theme);

		rbAppearanceINC.setActionCommand("3");
		bgAppearance.add(rbAppearanceINC);

		rbAppearanceINC.setText("INC = Incision");
		rbAppearanceINC.setBounds(474, 7, 87, 24);
		panel_4_2_1.add(rbAppearanceINC);

		final JxRadioButton woundRadioButton = new JxRadioButton();
		woundRadioButton.setTheme(theme);

		woundRadioButton.setActionCommand("4");
		bgAppearance.add(woundRadioButton);

		woundRadioButton.setText("W = Wound");
		woundRadioButton.setBounds(562, 7, 77, 24);
		panel_4_2_1.add(woundRadioButton);

		final JxRadioButton rashRadioButton = new JxRadioButton();
		rashRadioButton.setTheme(theme);

		bgAppearance.add(rashRadioButton);

		rashRadioButton.setActionCommand("5");
		rashRadioButton.setText("R = Rash");
		rashRadioButton.setBounds(645, 7, 74, 24);
		panel_4_2_1.add(rashRadioButton);

		final JxRadioButton noAbnormalitiesRadioButton = new JxRadioButton();
		noAbnormalitiesRadioButton.setTheme(theme);

		bgAppearance.add(noAbnormalitiesRadioButton);
		noAbnormalitiesRadioButton.setActionCommand("7");

		noAbnormalitiesRadioButton.setText("No Abnormalities");
		noAbnormalitiesRadioButton.setBounds(810, 8, 102, 22);
		panel_4_2_1.add(noAbnormalitiesRadioButton);

		txtAbnormality = new JxText();
		txtAbnormality.setTheme(theme);

		txtAbnormality.setMargin(new Insets(1, 5, 2, 1));
		txtAbnormality.setBorder(new LineBorder(Color.black, 1, false));
		txtAbnormality.setBounds(100, 9, 159, 18);
		txtAbnormality.setMargin(new Insets(0, 3, 0, 0));
		Border myBorder = new CompoundBorderUIResource(new LineBorder(
				Color.BLACK, 1, false), new BasicBorders.MarginBorder());

		txtAbnormality.setBorder(myBorder);

		panel_4_2_1.add(txtAbnormality);

		final JxButton btnAbnormalityConfirm = new JxButton();
		btnAbnormalityConfirm.setTheme(theme);

		btnAbnormalityConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {

				if (txtAbnormality.getText().equalsIgnoreCase("")) {
					FrameAbnormality frame = new FrameAbnormality();
					SwingUtils.center(frame);
					frame.setVisible(true);

					Object[] objArray = frame.getSelectedValues();
					txtAbnormality.setText("");
					if (objArray != null) {
						int sizeofArr = objArray.length;

						for (Object o : objArray) {
							if (sizeofArr > 1) {
								txtAbnormality.setText(txtAbnormality.getText()
										+ o.toString() + ",");
								// String ToolTip =
								// txtAbnormality.getText()+o.toString()+",";
								/*
								 * for(int i=0;i<=ToolTip.length();i++) { String
								 * ToolTip1 = ToolTip.replace(';',' '); }
								 */
								// txtAbnormality.setToolTipText(txtAbnormality.getText()+o.toString());
								txtAbnormality.setToolTipText(txtAbnormality
										.getText()
										+ o.toString() + ",");
							} else {
								txtAbnormality.setText(txtAbnormality.getText()
										+ o.toString());
								txtAbnormality.setToolTipText(txtAbnormality
										.getText()
										+ o.toString());
							}
						}
					}
				} else {
					FrameAbnormality frame = new FrameAbnormality();
					SwingUtils.center(frame);
					frame.setSelectedValues(updateAbnormility(txtAbnormality
							.getText()));
					frame.updateListValues();
					frame.setVisible(true);
					Object[] objArray = frame.getSelectedValues();
					txtAbnormality.setText("");
					if (objArray != null) {
						int sizeofArr = objArray.length;

						for (Object o : objArray) {
							if (sizeofArr > 1) {
								txtAbnormality.setText(txtAbnormality.getText()
										+ o.toString() + ",");
								// txtAbnormality.setToolTipText(txtAbnormality.getText()+o.toString());
								txtAbnormality.setToolTipText(txtAbnormality
										.getText()
										+ o.toString() + ",");
							} else {
								txtAbnormality.setText(txtAbnormality.getText()
										+ o.toString());
								txtAbnormality.setToolTipText(txtAbnormality
										.getText()
										+ o.toString());
							}
						}
					}

				}
			}
		});
		btnAbnormalityConfirm.setText("");
		btnAbnormalityConfirm.setBounds(263, 9, 24, 18);
		panel_4_2_1.add(btnAbnormalityConfirm);

		final JxRadioButton erythemaRadioButton = new JxRadioButton();
		erythemaRadioButton.setTheme(theme);

		erythemaRadioButton.setBounds(720, 10, 88, 18);
		panel_4_2_1.add(erythemaRadioButton);
		erythemaRadioButton.setActionCommand("6");
		bgAppearance.add(erythemaRadioButton);

		erythemaRadioButton.setText("Er = Erythema");

		final JxLabel drawAnXLabel = new JxLabel();
		drawAnXLabel.setTheme(theme);

		drawAnXLabel.setFontStyle(Font.BOLD);
		drawAnXLabel
				.setText("Draw an X on diagram with corresponding # for each pressure sore, wound, skin tear, bruise or incision.");
		drawAnXLabel.setBounds(10, 129, 838, 16);
		panel_1.add(drawAnXLabel);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);

		panel_2.setFontSize(12);
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				requestFocus();
			}
		});
		panel_2.setOpaque(true);
		panel_2.setBorder(new LineBorder(Color.black, 1, false));

		panel_2.setLayout(null);
		panel_2.setBounds(0, 181, 662, 326);
		add(panel_2);

		panelPressureSoreAssessmentArr = new PanelPressureSoreAssessment[MAX_COL];
		for (int i = 0; i < panelPressureSoreAssessmentArr.length; i++) {
			final int index = i;
			panelPressureSoreAssessmentArr[i] = new PanelPressureSoreAssessment(
					i + 1);
			panelPressureSoreAssessmentArr[i].setBounds(126 + (53 * i), 60, 37,
					266);
			panelPressureSoreAssessmentArr[i]
					.addPropertyChangeListener(new PropertyChangeListener() {
						public void propertyChange(final PropertyChangeEvent evt) {
							if (evt
									.getPropertyName()
									.equals(
											PanelPressureSoreAssessment.PROPERTY_SITENUM_CHANGED)) {
								// col=(Integer) evt.getOldValue();
								doSelectHuman((Integer) evt.getNewValue(),
										index);
								// System.out.println("Human no:"+(Integer)
								// evt.getNewValue());
							}
						}
					});
			// panelPressureSoreAssessmentArr[i].cmbSiteNum.addMouseListener(new
			// MouseAdapter(){
			// // public void mouseClicked(MouseEvent e) {
			// // doSelectHuman(e.)
			// // }
			// });
			panel_2.add(panelPressureSoreAssessmentArr[i]);
		}

		/*
		 * panelPressureSoreAssessmentNum1 = new PanelPressureSoreAssessment(1);
		 * panelPressureSoreAssessmentNum1.addPropertyChangeListener(new
		 * PropertyChangeListener() { public void propertyChange(final
		 * PropertyChangeEvent evt) {
		 * if(evt.getPropertyName().equals(PanelPressureSoreAssessment
		 * .PROPERTY_SITENUM_CHANGED)) {
		 * doSelectHuman((Integer)evt.getNewValue()); } } });
		 * panelPressureSoreAssessmentNum1.addFocusListener(new FocusAdapter() {
		 * public void focusGained(final FocusEvent e) {
		 * panelPressureSoreAssessmentNum1.doHighlight(); } public void
		 * focusLost(final FocusEvent e) {
		 * panelPressureSoreAssessmentNum1.doHighlight(); } });
		 * panelPressureSoreAssessmentNum1.setBounds(123, 60, 55, 290);
		 * panel_2.add(panelPressureSoreAssessmentNum1);
		 */

		/*
		 * panelPressureSoreAssessmentNum4 = new PanelPressureSoreAssessment(4);
		 * panelPressureSoreAssessmentNum4.setPreferredSize(new Dimension(55,
		 * 290));
		 * 
		 * panelPressureSoreAssessmentNum4.setBounds(285, 60, 55, 290);
		 * panel_2.add(panelPressureSoreAssessmentNum4);
		 * 
		 * panelPressureSoreAssessmentNum2 = new PanelPressureSoreAssessment(2);
		 * panelPressureSoreAssessmentNum2.setBounds(177, 60, 55, 290);
		 * panel_2.add(panelPressureSoreAssessmentNum2);
		 * 
		 * panelPressureSoreAssessmentNum3 = new PanelPressureSoreAssessment(3);
		 * panelPressureSoreAssessmentNum3.setBounds(230, 60, 55, 290);
		 * panel_2.add(panelPressureSoreAssessmentNum3);
		 * 
		 * panelPressureSoreAssessmentNum5 = new PanelPressureSoreAssessment(5);
		 * panelPressureSoreAssessmentNum5.setPreferredSize(new Dimension(55,
		 * 290)); panelPressureSoreAssessmentNum5.setBounds(338, 60, 55, 290);
		 * panel_2.add(panelPressureSoreAssessmentNum5);
		 * 
		 * panelPressureSoreAssessmentNum6 = new PanelPressureSoreAssessment(6);
		 * panelPressureSoreAssessmentNum6.setPreferredSize(new Dimension(55,
		 * 290)); panelPressureSoreAssessmentNum6.setBounds(392, 60, 55, 290);
		 * panel_2.add(panelPressureSoreAssessmentNum6);
		 * 
		 * panelPressureSoreAssessmentNum7 = new PanelPressureSoreAssessment(7);
		 * panelPressureSoreAssessmentNum7.setPreferredSize(new Dimension(55,
		 * 290)); panelPressureSoreAssessmentNum7.setBounds(445, 60, 55, 290);
		 * panel_2.add(panelPressureSoreAssessmentNum7);
		 * 
		 * panelPressureSoreAssessmentNum8 = new PanelPressureSoreAssessment(8);
		 * panelPressureSoreAssessmentNum8.setPreferredSize(new Dimension(55,
		 * 290)); panelPressureSoreAssessmentNum8.setBounds(498, 60, 55, 290);
		 * panel_2.add(panelPressureSoreAssessmentNum8);
		 * 
		 * panelPressureSoreAssessmentNum9 = new PanelPressureSoreAssessment(9);
		 * panelPressureSoreAssessmentNum9.setPreferredSize(new Dimension(55,
		 * 290)); panelPressureSoreAssessmentNum9.setBounds(553, 60, 55, 290);
		 * panel_2.add(panelPressureSoreAssessmentNum9);
		 * 
		 * panelPressureSoreAssessmentNum10 = new
		 * PanelPressureSoreAssessment(10);
		 * panelPressureSoreAssessmentNum10.setPreferredSize(new Dimension(55,
		 * 290)); panelPressureSoreAssessmentNum10.setBounds(606, 60, 55, 290);
		 * panel_2.add(panelPressureSoreAssessmentNum10);
		 */
		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);

		panel_5.setFontSize(12);
		panel_5.setOpaque(false);
		panel_5.setLayout(null);
		panel_5.setBackground(Color.BLACK);
		panel_5.setBounds(0, 0, 670, 26);
		panel_2.add(panel_5);

		final JxLabel skinAssessmentLabel_1 = new JxLabel();
		skinAssessmentLabel_1.setTheme(theme);
		skinAssessmentLabel_1.setForeground(new Color(255, 255, 255));

		skinAssessmentLabel_1.setFontSize(14);
		skinAssessmentLabel_1.setFontStyle(Font.BOLD);
		skinAssessmentLabel_1.setText("PRESSURE SORE ASSESSMENT");
		skinAssessmentLabel_1.setBounds(230, 0, 238, 26);
		panel_5.add(skinAssessmentLabel_1);

		final JxLabel documentEachSiteLabel = new JxLabel();
		documentEachSiteLabel.setTheme(theme);

		documentEachSiteLabel.setFontStyle(Font.BOLD);
		documentEachSiteLabel
				.setText("Document each site separately by number");
		documentEachSiteLabel.setBounds(10, 21, 589, 16);
		panel_2.add(documentEachSiteLabel);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setOpaque(false);

		panel_6.setLayout(null);
		panel_6.setBounds(0, 60, 125, 290);
		panel_2.add(panel_6);

		final JxLabel siteNumberLabel = new JxLabel();
		siteNumberLabel.setTheme(theme);

		siteNumberLabel.setBorder(new LineBorder(Color.black, 1, false));
		siteNumberLabel.setText(" Site Number:");
		siteNumberLabel.setBounds(0, 0, 125, 25);
		panel_6.add(siteNumberLabel);
		// final BalloonTip BTip = new BalloonTip(siteNumberLabel,
		// "Select site..",
		// new RoundedBalloonStyle(10, 10, new
		// Color(230,240,250),medrex.commons.enums.ColorConstants.DEF_COLOR),
		// BalloonTip.Orientation.RIGHT_ABOVE,
		// BalloonTip.AttachLocation.NORTHEAST,
		// 20, 20,
		// true);
		// TimingUtils.showTimedBalloon(BTip, 5000);

		final JxLabel siteNumberLabel_1 = new JxLabel();
		siteNumberLabel_1.setTheme(theme);

		siteNumberLabel_1.setBorder(new LineBorder(Color.black, 1, false));
		siteNumberLabel_1.setText(" Stage :");
		siteNumberLabel_1.setBounds(0, 22, 125, 25);
		panel_6.add(siteNumberLabel_1);

		final JxLabel siteNumberLabel_1_1 = new JxLabel();
		siteNumberLabel_1_1.setTheme(theme);

		siteNumberLabel_1_1.setBorder(new LineBorder(Color.black, 1, false));
		siteNumberLabel_1_1.setText(" Shape :");
		siteNumberLabel_1_1.setBounds(0, 44, 125, 25);
		panel_6.add(siteNumberLabel_1_1);

		final JxLabel siteNumberLabel_1_1_1 = new JxLabel();
		siteNumberLabel_1_1_1.setTheme(theme);

		siteNumberLabel_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		siteNumberLabel_1_1_1.setText(" Length :");
		siteNumberLabel_1_1_1.setBounds(0, 66, 125, 25);
		panel_6.add(siteNumberLabel_1_1_1);

		final JxLabel siteNumberLabel_1_1_1_1 = new JxLabel();
		siteNumberLabel_1_1_1_1.setTheme(theme);

		siteNumberLabel_1_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		siteNumberLabel_1_1_1_1.setText(" Width:");
		siteNumberLabel_1_1_1_1.setBounds(0, 88, 125, 25);
		panel_6.add(siteNumberLabel_1_1_1_1);

		final JxLabel siteNumberLabel_1_1_1_1_1 = new JxLabel();
		siteNumberLabel_1_1_1_1_1.setTheme(theme);

		siteNumberLabel_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		siteNumberLabel_1_1_1_1_1.setText(" Depth:");
		siteNumberLabel_1_1_1_1_1.setBounds(0, 110, 125, 25);
		panel_6.add(siteNumberLabel_1_1_1_1_1);

		final JxLabel siteNumberLabel_1_1_1_1_2 = new JxLabel();
		siteNumberLabel_1_1_1_1_2.setTheme(theme);

		siteNumberLabel_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1,
				false));
		siteNumberLabel_1_1_1_1_2.setText(" Tunneling:");
		siteNumberLabel_1_1_1_1_2.setBounds(0, 132, 125, 25);
		panel_6.add(siteNumberLabel_1_1_1_1_2);

		final JxLabel siteNumberLabel_1_1_1_1_3 = new JxLabel();
		siteNumberLabel_1_1_1_1_3.setTheme(theme);

		siteNumberLabel_1_1_1_1_3.setBorder(new LineBorder(Color.black, 1,
				false));
		siteNumberLabel_1_1_1_1_3.setText(" Appearance:");
		siteNumberLabel_1_1_1_1_3.setBounds(0, 154, 125, 25);
		panel_6.add(siteNumberLabel_1_1_1_1_3);

		final JxLabel siteNumberLabel_1_1_1_1_4 = new JxLabel();
		siteNumberLabel_1_1_1_1_4.setTheme(theme);

		siteNumberLabel_1_1_1_1_4.setBorder(new LineBorder(Color.black, 1,
				false));
		siteNumberLabel_1_1_1_1_4.setText(" Drainage Type:");
		siteNumberLabel_1_1_1_1_4.setBounds(0, 176, 125, 25);
		panel_6.add(siteNumberLabel_1_1_1_1_4);

		final JxLabel siteNumberLabel_1_1_1_1_5 = new JxLabel();
		siteNumberLabel_1_1_1_1_5.setTheme(theme);

		siteNumberLabel_1_1_1_1_5.setBorder(new LineBorder(Color.black, 1,
				false));
		siteNumberLabel_1_1_1_1_5.setText(" Drainage Amount:");
		siteNumberLabel_1_1_1_1_5.setBounds(0, 198, 125, 25);
		panel_6.add(siteNumberLabel_1_1_1_1_5);

		final JxLabel siteNumberLabel_1_1_1_1_6 = new JxLabel();
		siteNumberLabel_1_1_1_1_6.setTheme(theme);

		siteNumberLabel_1_1_1_1_6.setBorder(new LineBorder(Color.black, 1,
				false));
		siteNumberLabel_1_1_1_1_6.setText(" Odor:");
		siteNumberLabel_1_1_1_1_6.setBounds(0, 220, 125, 25);
		panel_6.add(siteNumberLabel_1_1_1_1_6);

		final JxLabel siteNumberLabel_1_1_1_1_7 = new JxLabel();
		siteNumberLabel_1_1_1_1_7.setTheme(theme);

		siteNumberLabel_1_1_1_1_7.setBorder(new LineBorder(Color.black, 1,
				false));
		siteNumberLabel_1_1_1_1_7.setText(" Healing:");
		siteNumberLabel_1_1_1_1_7.setBounds(0, 242, 125, 25);
		panel_6.add(siteNumberLabel_1_1_1_1_7);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setOpaque(false);

		panel_7.setLayout(null);
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setBounds(0, 507, 662, 164);
		add(panel_7);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);
		panel_8.setOpaque(false);
		panel_8.setBorder(new LineBorder(Color.black, 1, false));

		panel_8.setLayout(null);
		panel_8.setBounds(0, 0, 110, 30);
		panel_7.add(panel_8);

		final JxLabel shapeLabel = new JxLabel();
		shapeLabel.setTheme(theme);

		shapeLabel.setText("Shape");
		shapeLabel.setBounds(21, 10, 45, 16);
		panel_8.add(shapeLabel);

		final JxPanel panel_8_1 = new JxPanel();
		panel_8_1.setTheme(theme);
		panel_8_1.setOpaque(false);
		panel_8_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1.setLayout(null);

		panel_8_1.setBounds(108, 0, 110, 30);
		panel_7.add(panel_8_1);

		final JxLabel shapeLabel_1 = new JxLabel();
		shapeLabel_1.setTheme(theme);

		shapeLabel_1.setText("Appearance % of");
		shapeLabel_1.setBounds(8, 7, 102, 16);
		panel_8_1.add(shapeLabel_1);

		final JxPanel panel_8_1_1 = new JxPanel();
		panel_8_1_1.setTheme(theme);
		panel_8_1_1.setOpaque(false);
		panel_8_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1.setLayout(null);

		panel_8_1_1.setBounds(216, 0, 110, 30);
		panel_7.add(panel_8_1_1);

		final JxLabel shapeLabel_1_1 = new JxLabel();
		shapeLabel_1_1.setTheme(theme);

		shapeLabel_1_1.setText("Drainage Type");
		shapeLabel_1_1.setBounds(15, 7, 90, 16);
		panel_8_1_1.add(shapeLabel_1_1);

		final JxPanel panel_8_1_1_1 = new JxPanel();
		panel_8_1_1_1.setTheme(theme);
		panel_8_1_1_1.setOpaque(false);
		panel_8_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1.setLayout(null);

		panel_8_1_1_1.setBounds(324, 0, 110, 30);
		panel_7.add(panel_8_1_1_1);

		final JxLabel shapeLabel_1_1_1 = new JxLabel();
		shapeLabel_1_1_1.setTheme(theme);

		shapeLabel_1_1_1.setText("Drainage Amt.");
		shapeLabel_1_1_1.setBounds(15, 7, 90, 16);
		panel_8_1_1_1.add(shapeLabel_1_1_1);

		final JxPanel panel_8_1_1_1_1 = new JxPanel();
		panel_8_1_1_1_1.setTheme(theme);
		panel_8_1_1_1_1.setOpaque(false);
		panel_8_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_1.setLayout(null);

		panel_8_1_1_1_1.setBounds(433, 0, 110, 30);
		panel_7.add(panel_8_1_1_1_1);

		final JxLabel shapeLabel_1_1_1_1 = new JxLabel();
		shapeLabel_1_1_1_1.setTheme(theme);

		shapeLabel_1_1_1_1.setText("Odor");
		shapeLabel_1_1_1_1.setBounds(35, 7, 46, 16);
		panel_8_1_1_1_1.add(shapeLabel_1_1_1_1);

		final JxPanel panel_8_1_1_1_2 = new JxPanel();
		panel_8_1_1_1_2.setTheme(theme);
		panel_8_1_1_1_2.setOpaque(false);
		panel_8_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1_1_2.setLayout(null);

		panel_8_1_1_1_2.setBounds(542, 0, 119, 30);
		panel_7.add(panel_8_1_1_1_2);

		final JxLabel shapeLabel_1_1_1_2 = new JxLabel();
		shapeLabel_1_1_1_2.setTheme(theme);

		shapeLabel_1_1_1_2.setText("Healing");
		shapeLabel_1_1_1_2.setBounds(35, 7, 56, 16);
		panel_8_1_1_1_2.add(shapeLabel_1_1_1_2);

		final JxPanel panel_9 = new JxPanel();
		panel_9.setTheme(theme);
		panel_9.setOpaque(false);
		panel_9.setLayout(null);

		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setBounds(0, 29, 110, 135);
		panel_7.add(panel_9);

		final JxLabel oOvalLabel = new JxLabel();
		oOvalLabel.setTheme(theme);

		oOvalLabel.setText("O = Oval");
		oOvalLabel.setBounds(10, 10, 90, 16);
		panel_9.add(oOvalLabel);

		final JxLabel oOvalLabel_1 = new JxLabel();
		oOvalLabel_1.setTheme(theme);

		oOvalLabel_1.setText("S = Straight");
		oOvalLabel_1.setBounds(10, 32, 90, 16);
		panel_9.add(oOvalLabel_1);

		final JxLabel oOvalLabel_1_1 = new JxLabel();
		oOvalLabel_1_1.setTheme(theme);

		oOvalLabel_1_1.setText("I = Irregular");
		oOvalLabel_1_1.setBounds(10, 54, 90, 16);
		panel_9.add(oOvalLabel_1_1);

		final JxLabel oOvalLabel_1_2 = new JxLabel();
		oOvalLabel_1_2.setTheme(theme);
		oOvalLabel_1_2.setBounds(10, 75, 90, 16);
		panel_9.add(oOvalLabel_1_2);

		final JxLabel rRoundLabel = new JxLabel();
		rRoundLabel.setTheme(theme);

		rRoundLabel.setText("R = Round");
		rRoundLabel.setBounds(10, 76, 90, 16);
		panel_9.add(rRoundLabel);

		final JxPanel panel_9_1 = new JxPanel();
		panel_9_1.setTheme(theme);
		panel_9_1.setOpaque(false);
		panel_9_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1.setLayout(null);

		panel_9_1.setBounds(108, 29, 110, 135);
		panel_7.add(panel_9_1);

		final JxLabel oOvalLabel_2 = new JxLabel();
		oOvalLabel_2.setTheme(theme);

		oOvalLabel_2.setText("P = Pink");
		oOvalLabel_2.setBounds(10, 10, 90, 16);
		panel_9_1.add(oOvalLabel_2);

		final JxLabel oOvalLabel_1_3 = new JxLabel();
		oOvalLabel_1_3.setTheme(theme);

		oOvalLabel_1_3.setText("R = Red");
		oOvalLabel_1_3.setBounds(10, 32, 90, 16);
		panel_9_1.add(oOvalLabel_1_3);

		final JxLabel oOvalLabel_1_1_1 = new JxLabel();
		oOvalLabel_1_1_1.setTheme(theme);

		oOvalLabel_1_1_1.setText("B = Brown");
		oOvalLabel_1_1_1.setBounds(10, 54, 90, 16);
		panel_9_1.add(oOvalLabel_1_1_1);

		final JxLabel oOvalLabel_1_2_1 = new JxLabel();
		oOvalLabel_1_2_1.setTheme(theme);

		oOvalLabel_1_2_1.setText("E = Eschar");
		oOvalLabel_1_2_1.setBounds(10, 75, 90, 16);
		panel_9_1.add(oOvalLabel_1_2_1);

		final JxLabel sSloughLabel = new JxLabel();
		sSloughLabel.setTheme(theme);

		sSloughLabel.setText("S = Slough");
		sSloughLabel.setBounds(10, 97, 90, 16);
		panel_9_1.add(sSloughLabel);

		final JxPanel panel_9_1_1 = new JxPanel();
		panel_9_1_1.setTheme(theme);
		panel_9_1_1.setOpaque(false);
		panel_9_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1.setLayout(null);

		panel_9_1_1.setBounds(216, 29, 110, 135);
		panel_7.add(panel_9_1_1);

		final JxLabel oOvalLabel_2_1 = new JxLabel();
		oOvalLabel_2_1.setTheme(theme);

		oOvalLabel_2_1.setText("O = None");
		oOvalLabel_2_1.setBounds(10, 10, 90, 16);
		panel_9_1_1.add(oOvalLabel_2_1);

		final JxLabel oOvalLabel_1_3_1 = new JxLabel();
		oOvalLabel_1_3_1.setTheme(theme);

		oOvalLabel_1_3_1.setText("B = Bloody");
		oOvalLabel_1_3_1.setBounds(10, 32, 90, 16);
		panel_9_1_1.add(oOvalLabel_1_3_1);

		final JxLabel oOvalLabel_1_1_1_1 = new JxLabel();
		oOvalLabel_1_1_1_1.setTheme(theme);

		oOvalLabel_1_1_1_1.setText("P = Purulent");
		oOvalLabel_1_1_1_1.setBounds(10, 54, 90, 16);
		panel_9_1_1.add(oOvalLabel_1_1_1_1);

		final JxLabel oOvalLabel_1_2_1_1 = new JxLabel();
		oOvalLabel_1_2_1_1.setTheme(theme);

		oOvalLabel_1_2_1_1.setText("S = Serous");
		oOvalLabel_1_2_1_1.setBounds(10, 75, 90, 16);
		panel_9_1_1.add(oOvalLabel_1_2_1_1);

		final JxPanel panel_9_1_1_1 = new JxPanel();
		panel_9_1_1_1.setTheme(theme);
		panel_9_1_1_1.setOpaque(false);
		panel_9_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1.setLayout(null);

		panel_9_1_1_1.setBounds(324, 29, 110, 135);
		panel_7.add(panel_9_1_1_1);

		final JxLabel oOvalLabel_2_1_1 = new JxLabel();
		oOvalLabel_2_1_1.setTheme(theme);

		oOvalLabel_2_1_1.setText("O = None");
		oOvalLabel_2_1_1.setBounds(10, 10, 90, 16);
		panel_9_1_1_1.add(oOvalLabel_2_1_1);

		final JxLabel oOvalLabel_1_3_1_1 = new JxLabel();
		oOvalLabel_1_3_1_1.setTheme(theme);

		oOvalLabel_1_3_1_1.setText("S = Scant");
		oOvalLabel_1_3_1_1.setBounds(10, 32, 90, 16);
		panel_9_1_1_1.add(oOvalLabel_1_3_1_1);

		final JxLabel oOvalLabel_1_1_1_1_1 = new JxLabel();
		oOvalLabel_1_1_1_1_1.setTheme(theme);

		oOvalLabel_1_1_1_1_1.setText("M = Moderate");
		oOvalLabel_1_1_1_1_1.setBounds(10, 54, 90, 16);
		panel_9_1_1_1.add(oOvalLabel_1_1_1_1_1);

		final JxLabel oOvalLabel_1_2_1_1_1 = new JxLabel();
		oOvalLabel_1_2_1_1_1.setTheme(theme);

		oOvalLabel_1_2_1_1_1.setText("L = Large");
		oOvalLabel_1_2_1_1_1.setBounds(10, 75, 90, 16);
		panel_9_1_1_1.add(oOvalLabel_1_2_1_1_1);

		final JxPanel panel_9_1_1_1_1 = new JxPanel();
		panel_9_1_1_1_1.setTheme(theme);
		panel_9_1_1_1_1.setOpaque(false);
		panel_9_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_1.setLayout(null);

		panel_9_1_1_1_1.setBounds(433, 29, 110, 135);
		panel_7.add(panel_9_1_1_1_1);

		final JxLabel oOvalLabel_2_1_1_1 = new JxLabel();
		oOvalLabel_2_1_1_1.setTheme(theme);

		oOvalLabel_2_1_1_1.setText("O = None");
		oOvalLabel_2_1_1_1.setBounds(10, 10, 90, 16);
		panel_9_1_1_1_1.add(oOvalLabel_2_1_1_1);

		final JxLabel oOvalLabel_1_3_1_1_1 = new JxLabel();
		oOvalLabel_1_3_1_1_1.setTheme(theme);

		oOvalLabel_1_3_1_1_1.setText("F = Foul");
		oOvalLabel_1_3_1_1_1.setBounds(10, 32, 90, 16);
		panel_9_1_1_1_1.add(oOvalLabel_1_3_1_1_1);

		final JxPanel panel_9_1_1_1_2 = new JxPanel();
		panel_9_1_1_1_2.setTheme(theme);
		panel_9_1_1_1_2.setOpaque(false);
		panel_9_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_2.setLayout(null);

		panel_9_1_1_1_2.setBounds(542, 29, 119, 135);
		panel_7.add(panel_9_1_1_1_2);

		final JxLabel oOvalLabel_2_1_1_2 = new JxLabel();
		oOvalLabel_2_1_1_2.setTheme(theme);

		oOvalLabel_2_1_1_2.setText("I = Improved");
		oOvalLabel_2_1_1_2.setBounds(10, 10, 90, 16);
		panel_9_1_1_1_2.add(oOvalLabel_2_1_1_2);

		final JxLabel oOvalLabel_1_3_1_1_2 = new JxLabel();
		oOvalLabel_1_3_1_1_2.setTheme(theme);

		oOvalLabel_1_3_1_1_2.setText("U = Unchanged");
		oOvalLabel_1_3_1_1_2.setBounds(10, 32, 90, 16);
		panel_9_1_1_1_2.add(oOvalLabel_1_3_1_1_2);

		final JxLabel oOvalLabel_1_1_1_1_1_1 = new JxLabel();
		oOvalLabel_1_1_1_1_1_1.setTheme(theme);

		oOvalLabel_1_1_1_1_1_1.setText("W = Worsened");
		oOvalLabel_1_1_1_1_1_1.setBounds(10, 54, 90, 16);
		panel_9_1_1_1_2.add(oOvalLabel_1_1_1_1_1_1);

		final JxLabel naLabel = new JxLabel();
		naLabel.setTheme(theme);

		naLabel.setText("N / A");
		naLabel.setBounds(10, 76, 90, 16);
		panel_9_1_1_1_2.add(naLabel);

		panelHuman = new JxPanel();
		panelHuman.setTheme(theme);

		panelHuman.setOpaque(true);
		panelHuman.setLayout(null);

		panelHuman.setBorder(new LineBorder(Color.black, 1, false));
		panelHuman.setBounds(661, 181, 259, 490);

		add(panelHuman);
		lbl = new JxLabel(new ImageIcon("img/residentassessment/spot.png"));
		// if(Global.currentResidentAssessmentFormPage3Key==0){
		// final BalloonTip balloonTip = new BalloonTip(lbl,
		// "Select the site and click on the wounded portion.",
		// new RoundedBalloonStyle(10, 10, new
		// Color(230,240,250),medrex.commons.enums.ColorConstants.DEF_COLOR),
		// BalloonTip.Orientation.LEFT_ABOVE,
		// BalloonTip.AttachLocation.ALIGNED,
		// 20, 20,
		// true);
		// TimingUtils.showTimedBalloon(balloonTip, 10000);
		// }
		lbl.setBounds(0, 0, 20, 20);
		lbl.setVisible(true);
		panelHuman.add(lbl);
		lblHumanImg = new JxLabel(new ImageIcon("img/human1/0.gif"));
		lblHumanImg.setTheme(theme);

		lblHumanImg.setBounds(0, 0, 256, 490);
		lblHumanImg.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				Point clickedPoint = e.getLocationOnScreen();
				Point pt = panelHuman.getLocationOnScreen();
				int x = (clickedPoint.x - pt.x - 10);
				int y = (clickedPoint.y - pt.y - 10);
				currentColumn.setCoorX(x);
				currentColumn.setCoorY(y);
				// System.out.println("Clicked Point is("+x+","+y+")");
				// int i=0;
				// for(i=0;i<p.length;i++);
				// p[i]=new Point(x,y);
				lbl.setLocation(x, y);
				lbl.setVisible(true);
			}
		});
		// lblHumanImg.setIcon(new ImageIcon("img/human1/0.gif"));
		panelHuman.add(lblHumanImg);
		panelHuman.setComponentZOrder(lbl, 0);

		panel_10 = new JxPanel();
		panel_10.setTheme(theme);
		panel_10.setOpaque(false);
		panel_10.setLayout(null);

		panel_10.setBounds(10, 680, 910, 30);
		add(panel_10);

		ifSoWhatLabel = new JxLabel();
		ifSoWhatLabel.setTheme(theme);

		ifSoWhatLabel.setText("Nurse Signature:");
		ifSoWhatLabel.setBounds(0, 5, 91, 16);
		panel_10.add(ifSoWhatLabel);

		cmbNurse = new JxComboBox();
		cmbNurse.setTheme(theme);

		cmbNurse.setBounds(123, 4, 205, 20);
		cmbNurse.setVisible(false);
		panel_10.add(cmbNurse);

		dateLabel = new JxLabel();
		dateLabel.setTheme(theme);

		dateLabel.setText("Date :");
		dateLabel.setBounds(443, 6, 42, 16);
		panel_10.add(dateLabel);

		dcNurseVisit = new JxDateChooser();
		dcNurseVisit.setTheme(theme);
		dcNurseVisit.setDate(MedrexClientManager.getServerTime());
		dcNurseVisit.setDateFormatString("MM/dd/yyyy");
		dcNurseVisit.setBounds(487, 4, 161, 26);
		panel_10.add(dcNurseVisit);

		final PanelloggedInUser panel_3 = new PanelloggedInUser();
		panel_3.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_3.setBounds(86, 1, 336, 28);
		panel_10.add(panel_3);

		// panel_3.setBounds(119, -2, 316, 24);
		// panel_10.add(panel_3);

		doLoad();
	}

	// public void paint(Graphics g) {
	// // JxLabel lblImage=new JxLabel(new ImageIcon("img/cross.jpg"));
	// // ImageIcon image=new ImageIcon("img/cross.jpg");
	// // this.add(lblImage);
	// // g.drawImage(, 0, 0, null);
	//	    
	// }
	// public static void mian()

	public String[] updateAbnormility(String nor) {
		// List<String> abList = new ArrayList<String>();
		String str[] = nor.split(",");
		// System.out.println("selected Values are:");
		// for(int i = 0 ;i<str.length ;i++){
		// System.out.println(str[i]);

		// }
		return str;
	}

	public void doLoad() {
		fillCombos();
		// doUpdate();
		doSelectHuman(0, 0);
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
				Nurse nur = i.next();
				cmbNurse.addItem(nur.getNurseSurName() + " , "
						+ nur.getNurseName());
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
		// System.out.println("Global.currentResidentAssessmentFormKey"+Global.currentResidentAssessmentFormKey);
		if (Global.currentResidentAssessmentFormKey == 0) {
			// Global.currentResidentAssessmentFormPage3Key = 0;

			SwingUtils.setSelectedButton(bgColor, 0);
			SwingUtils.setSelectedButton(bgTurgor, 0);
			SwingUtils.setSelectedButton(bgTemp, 0);
			SwingUtils.setSelectedButton(bgAppearance, 0);

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
			ResidentAssessmentFormPage3 rafp3 = null;
			try {
				rafp3 = MedrexClientManager.getInstance()
						.getResidentAssessmentFormPage3(
								Global.currentResidentAssessmentFormKey);
			} catch (Exception e) {

			}
			// System.out.println("Global.currentResidentAssessmentFormPage3Key"+rafp3.getSerial());
			Global.currentResidentAssessmentFormPage3Key = rafp3.getSerial();

			SwingUtils.setSelectedButton(bgColor, rafp3.getSkinColor());
			SwingUtils.setSelectedButton(bgTurgor, rafp3.getSkinTurgor());
			SwingUtils.setSelectedButton(bgTemp, rafp3.getSkinTemprature());
			SwingUtils.setSelectedButton(bgAppearance, rafp3
					.getSkinAppearance());

			dcNurseVisit.setDate(rafp3.getNurseVisit());

			cmbNurse.setSelectedItem(rafp3.getNurse());
			txtLocation.setText(rafp3.getLocation());
			txtAbnormality.setText(rafp3.getAbnormality());
		}

		/*
		 * panelPressureSoreAssessmentNum1.updateData();
		 * panelPressureSoreAssessmentNum2.updateData();
		 * panelPressureSoreAssessmentNum3.updateData();
		 * panelPressureSoreAssessmentNum4.updateData();
		 * panelPressureSoreAssessmentNum5.updateData();
		 * panelPressureSoreAssessmentNum6.updateData();
		 * panelPressureSoreAssessmentNum7.updateData();
		 * panelPressureSoreAssessmentNum8.updateData();
		 * panelPressureSoreAssessmentNum9.updateData();
		 * panelPressureSoreAssessmentNum10.updateData();
		 */
		for (int i = 0; i < panelPressureSoreAssessmentArr.length; i++) {
			panelPressureSoreAssessmentArr[i].updateData();
		}
	}

	public int doSave() {
		ResidentAssessmentFormPage3 rafp3 = new ResidentAssessmentFormPage3();
		rafp3.setSerial(Global.currentResidentAssessmentFormPage3Key);
		rafp3.setFormId(Global.currentResidentAssessmentFormKey);

		rafp3.setSkinColor(SwingUtils.getSelectedButton(bgColor));
		rafp3.setSkinTurgor(SwingUtils.getSelectedButton(bgTurgor));
		rafp3.setSkinTemprature(SwingUtils.getSelectedButton(bgTemp));
		rafp3.setSkinAppearance(SwingUtils.getSelectedButton(bgAppearance));

		rafp3.setNurseVisit(dcNurseVisit.getDate());
		rafp3.setNurse((String) cmbNurse.getSelectedItem());
		rafp3.setLocation(txtLocation.getText());

		rafp3.setAbnormality(txtAbnormality.getText());

		try {
			Global.currentResidentAssessmentFormPage3Key = MedrexClientManager
					.getInstance().insertOrUpdateResidentAssessmentFormPage3(
							rafp3);

		} catch (Exception e) {

		}
		/*
		 * panelPressureSoreAssessmentNum1.doSave();
		 * panelPressureSoreAssessmentNum2.doSave();
		 * panelPressureSoreAssessmentNum3.doSave();
		 * panelPressureSoreAssessmentNum4.doSave();
		 * panelPressureSoreAssessmentNum5.doSave();
		 * panelPressureSoreAssessmentNum6.doSave();
		 * panelPressureSoreAssessmentNum7.doSave();
		 * panelPressureSoreAssessmentNum8.doSave();
		 * panelPressureSoreAssessmentNum9.doSave();
		 * panelPressureSoreAssessmentNum10.doSave();
		 */
		if (Global.currentResidentAssessmentFormPage3Key != 0) {
			for (int i = 0; i < panelPressureSoreAssessmentArr.length; i++) {
				panelPressureSoreAssessmentArr[i].doSave();
			}
		}

		return (0);
	}

	public void selectSite(int n) {
		currentColumn = panelPressureSoreAssessmentArr[n];
		int x = currentColumn.getCoorX();
		int y = currentColumn.getCoorY();
		// System.out.println("X in selected site:"+x);
		// System.out.println("Y in selected site:"+y);
		lbl.setLocation(x, y);

	}

	public void doSelectHuman(int n, int index) {
		// System.out.println(n + ": " + humanImg[n].getDescription());
		selectSite(index);
		lblHumanImg.setIcon(humanImg[n]);
		lblHumanImg.repaint();
		// System.out.println("ImgHeight: " + lblHumanImg.getSize().height);

	}

	/*
	 * public static void main(String arg[]){ JFrame frm=new JFrame();
	 * frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frm.add(new
	 * PanelResidentAssessmentFormPage3()); frm.setVisible(true);
	 * frm.setSize(1000,800); }
	 */

	public boolean doValidate() {
		// TODO Auto-generated method stub
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;

		// if (!FieldValidation.isEmpty(temp =
		// FieldValidation.isNonEmptyAlphaField(lblResidentName,
		// "Resident Name", 0, 25))) {
		// vRes.addAllFrom(temp);
		// }
		if (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(
				bgColor, "Skin Color"))) {
			vRes.addAllFrom(temp);
		}
		// System.out.println(FieldValidation.getMessages(vRes.getMessages()));
		if (!FieldValidation.isEmpty(vRes)) {
			FieldValidation.Msgbox(vRes, "Resident Assessment Form: Page 3");
			return false;
		} else {
			num++;
			return true;
		}
	}
}
