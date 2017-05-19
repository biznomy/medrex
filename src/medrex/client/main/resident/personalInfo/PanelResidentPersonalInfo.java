package medrex.client.main.resident.personalInfo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.plaf.BorderUIResource.CompoundBorderUIResource;
import javax.swing.plaf.basic.BasicBorders;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldFormatter;
import medrex.client.utils.MsgBox;
import medrex.client.utils.PresentationModel;
import medrex.client.utils.SwingUtils;
import medrex.client.utils.Utils;
import medrex.client.utils.controls.PhoneField;
import medrex.client.utils.controls.SsnField;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.masterList.Citizen;
import medrex.commons.vo.masterList.Language;
import medrex.commons.vo.masterList.MaritalStatus;
import medrex.commons.vo.masterList.MasterList;
import medrex.commons.vo.masterList.Origin;
import medrex.commons.vo.masterList.Religion;
import medrex.commons.vo.masterList.Sex;
import medrex.commons.vo.masterList.State;
import medrex.commons.vo.masterList.Status;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.styles.BalloonTipStyle;
import net.java.balloontip.styles.RoundedBalloonStyle;
import net.java.balloontip.utils.ToolTipUtils;

import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxText;
import com.sX.theme.BlueOverWhiteTheme;
import com.sX.theme.Theme;
import com.toedter.calendar.JSpinnerDateEditor;

public class PanelResidentPersonalInfo extends JxPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3762366588662039863L;
	Font font = new Font("Arial", Font.BOLD, 11);
	// Insets margin = new Insets(0, 2, 0, 0);
	// Border border = new CompoundBorderUIResource(new LineBorder(Color.BLACK),
	// new BasicBorders.MarginBorder());
	Color background = Color.WHITE;
	Color foreground = Color.BLACK;

	Theme theme = new BlueOverWhiteTheme();

	private JxButton roomButton;
	private static final Color DEF_COLOR = new Color(49, 104, 127);

	private JxLabel errorLabel;

	private JxPanel errorPanel;

	private JxText txtName;

	private JxText txtLastName;

	private JxComboBox cmbSex;

	private JxText txtNickName;

	private JxComboBox cmbMaritalStatus;

	private JxText txtAddress;

	private JxText txtCity;

	private JxComboBox cmbState;

	private JxText txtZip;

	private JxDateChooser dateChooser;

	private PhoneField txtHomePhone;

	private PhoneField txtWorkPhone;

	private PhoneField txtCell;

	private SsnField txtSS1;

	private JxComboBox cmbLanguage;

	// private JxText txtSS2;

	private JxText txtBirthPlace;

	private JxComboBox cmbCitizen;

	private JxComboBox cmbReligion;

	private JxComboBox cmbRoomFirst;

	private JxComboBox cmbStatus;

	private medrex.client.PanelImage panel_3;

	private JxLabel roomLabel_1;

	private JxText floorType;

	private JxLabel roomLabel_2;

	private JxText txtRoom;

	private BufferedImage image = null;

	private List occupiedRoomList = null;

	ImageIcon imageIcon = null;

	private Map presentationMap;

	private PresentationModel presentationModel;

	private ControllerResidentPersonalInfo residentPersonalInfoController;

	private ControllerRoomList controllerRoomList;

	private String[] strSubCat1 = { "101-1", "101-2", "102-1", "102-2",
			"103-1", "103-2", "104-1", "104-2", "104-3", "104-4", "105-1",
			"105-2", "106-1", "106-2", "107-1", "107-2", "108-1", "108-2",
			"109-1", "109-2" };

	private String[] strSubCat2 = { "110-1", "110-2", "110-3", "110-4",
			"111-1", "111-2", "112-1", "112-2", "113-1", "113-2", "114-1",
			"114-2", "115-1", "115-2", "116-1", "116-2", "117-1", "117-2",
			"118-1", "118-2", "119-1", "119-2", "120-1", "120-2", "121-1",
			"121-2", "122-1", "122-2", "123-1", "123-2", "124", "125", "126-1",
			"126-2", "127-1", "127-2", "128", "128", "129-1", "129-2", "129-3" };

	private String[] strSubCat3 = { "201", "202", "203-1", "203-2", "204-1",
			"204-2", "205-1", "205-2", "206-1", "206-2", "206-3", "206-4",
			"207-1", "207-2", "208-1", "208-2", "209-1", "209-2", "210-1",
			"210-2", "211-1", "211-2" };

	private String[] strSubCat4 = { "212-1", "212-2", "212-3", "212-4",
			"213-1", "213-2", "213-3", "213-4", "214-1", "214-2", "215-1",
			"215-2", "216-1", "216-2", "217-1", "217-2", "218-1", "218-2",
			"219-1", "219-2", "220-1", "220-2", "221-1", "221-2", "222-1",
			"222-2", "223-1", "223-2", "224-1", "224-2", "225-1", "225-2",
			"226-1", "226-2", "227-1", "227-2", "228-1", "228-2", "229",
			"230-1", "230-2", "231-1", "231-2", "232-1", "232-2", "232-3" };

	long version;

	private JxComboBox cmbOrigin;

	public PanelResidentPersonalInfo() {
		super();
		setName("");

		residentPersonalInfoController = new ControllerResidentPersonalInfo();
		controllerRoomList = new ControllerRoomList();
		presentationMap = new HashMap();

		setPreferredSize(new Dimension(698, 551));
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});

		setLayout(null);
		setBackground(Color.WHITE);

		final JxLabel residentInformationLabel = new JxLabel();
		residentInformationLabel.setTheme(theme);
		residentInformationLabel
				.setHorizontalTextPosition(SwingConstants.CENTER);
		residentInformationLabel.setHorizontalAlignment(SwingConstants.CENTER);

		residentInformationLabel.setFontSize(14);
		residentInformationLabel.setFontStyle(Font.BOLD);
		residentInformationLabel.setForeground(DEF_COLOR);
		residentInformationLabel.setText("RESIDENT INFORMATION");
		residentInformationLabel.setBounds(0, 0, 698, 16);
		add(residentInformationLabel);

		errorPanel = new JxPanel();
		errorPanel.setTheme(theme);
		errorPanel.setLayout(null);

		errorPanel.setBounds(10, 15, 495, 20);
		add(errorPanel);
		errorLabel = new JxLabel();
		errorLabel.setTheme(theme);
		errorLabel.setBounds(0, 0, 495, 20);
		errorPanel.add(errorLabel);

		errorLabel.setFontSize(14);
		errorLabel.setFontStyle(Font.BOLD);
		errorLabel.setForeground(Color.RED);

		final JxLabel firstNameLabel = new JxLabel();
		firstNameLabel.setTheme(theme);
		firstNameLabel.setForeground(DEF_COLOR);
		firstNameLabel.setText("FIRST NAME");
		firstNameLabel.setBounds(10, 40, 71, 20);
		firstNameLabel.setFontStyle(Font.BOLD);
		add(firstNameLabel);

		txtName = new JxText();
		txtName.setTheme(theme);

		new CompoundBorderUIResource(new LineBorder(Color.BLACK, 1, false),
				new BasicBorders.MarginBorder());

		txtName.setForeground(DEF_COLOR);
		presentationMap.put("userName", txtName);
		/*
		 * txtName.setBackground(background); txtName.setForeground(foreground);
		 */
		txtName.setBounds(87, 41, 155, 20);
		add(txtName);

		final JxLabel lastNameLabel = new JxLabel();
		lastNameLabel.setTheme(theme);

		lastNameLabel.setForeground(DEF_COLOR);
		lastNameLabel.setText("LAST NAME");
		lastNameLabel.setBounds(258, 41, 71, 20);
		lastNameLabel.setFontStyle(Font.BOLD);
		add(lastNameLabel);

		txtLastName = new JxText();
		txtLastName.setTheme(theme);

		new CompoundBorderUIResource(new LineBorder(Color.BLACK, 1, false),
				new BasicBorders.MarginBorder());

		txtLastName.setForeground(DEF_COLOR);
		presentationMap.put("userPass", txtLastName);
		txtLastName.setBounds(350, 45, 155, 20);
		add(txtLastName);

		final JxButton saveButton = new JxButton();
		saveButton.setTheme(theme);
		saveButton
				.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));

		saveButton.setForeground(DEF_COLOR);

		saveButton.setArc(0.4f);
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSave();
				// Global.panelMainDesktopTmp.updateResidentList();

			}
		});
		saveButton.setText("SAVE");
		saveButton.setBounds(222, 372, 60, 20);
		add(saveButton);

		final JxButton cancelButton = new JxButton();
		cancelButton.setTheme(theme);

		cancelButton.setForeground(DEF_COLOR);
		cancelButton.setText("CANCEL");
		cancelButton.setBounds(360, 372, 60, 20);
		cancelButton.setArc(0.4f);
		add(cancelButton);

		final JxButton photoButton = new JxButton();
		photoButton.setTheme(theme);
		photoButton.setForeground(DEF_COLOR);
		photoButton
				.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));

		photoButton.setArc(0.4f);
		photoButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				// if (Global.currentResidenceKey == 0) {
				// JOptionPane.showMessageDialog(null,
				// "Please save resident first");
				// } else {
				// try {
				// (new File("C:\\ImagesLTC\\")).mkdir();
				// } catch (Exception fe) {
				// fe.printStackTrace();
				// }
				// JFileChooser fileChooser = new JFileChooser();
				// fileChooser.addChoosableFileFilter(new LTCImageFilter());
				// fileChooser.showOpenDialog(null);
				// File jpgFile = fileChooser.getSelectedFile();
				// if (jpgFile.exists()) {
				// LTC.copyfile(jpgFile.getPath(), "C:\\ImagesLTC\\"
				// + Global.currentResidenceKey + ".jpg");
				// }

				JFileChooser fileChooser = new JFileChooser();
				// fileChooser.addChoosableFileFilter(new LTCImageFilter());
				fileChooser.showOpenDialog(PanelResidentPersonalInfo.this);
				File jpgFile = fileChooser.getSelectedFile();
				// String imageName=jpgFile.getName();
				//				
				// System.out.println("image extenstion:
				// "+imageName.substring(imageName.indexOf("."),
				// imageName.length()));

				// System.out.println("size of image file: "+ jpgFile.length());
				if (jpgFile != null) {
					jpgFile.length();
					// if (imageSize <= 43353) {
					String path = jpgFile.getPath();
					if (path != null) {
						File inputFile = new File(path);
						if (jpgFile.exists()) {
							try {
								Image img = ImageIO.read(inputFile);
								if (img != null) {
									imageIcon = new ImageIcon(img);
									image = Utils
											.getBufferedImageFromImageicon(imageIcon);
									panel_3.setImage(image);
									panel_3.repaint();
								}

							} catch (IOException e1) {
								e1.printStackTrace();
							}
							panel_3.repaint();
						}
					}
					// } else {
					// JOptionPane.showMessageDialog(photoButton,
					// "Image size can not more than 42 Kb.");
					// }
				}

			}
		});

		photoButton.setText("PHOTO");
		photoButton.setBounds(531, 175, 127, 20);
		add(photoButton);

		final JxLabel sexLabel = new JxLabel();
		sexLabel.setTheme(theme);

		sexLabel.setForeground(DEF_COLOR);
		sexLabel.setText("SEX");
		sexLabel.setBounds(400, 145, 29, 20);
		sexLabel.setFontStyle(Font.BOLD);
		add(sexLabel);

		cmbSex = new JxComboBox();
		cmbSex.setTheme(theme);

		cmbSex.setForeground(DEF_COLOR);
		presentationMap.put("sex", cmbSex);
		// cmbSex.setArc(0.4f);

		cmbSex.setBounds(430, 145, 75, 20);
		add(cmbSex);

		final JxLabel nicknameLabel = new JxLabel();
		nicknameLabel.setTheme(theme);

		nicknameLabel.setText("NICK NAME");
		nicknameLabel.setForeground(DEF_COLOR);
		nicknameLabel.setBounds(10, 67, 71, 20);
		nicknameLabel.setFontStyle(Font.BOLD);
		add(nicknameLabel);

		txtNickName = new JxText();
		txtNickName.setTheme(theme);

		new CompoundBorderUIResource(new LineBorder(Color.BLACK, 1, false),
				new BasicBorders.MarginBorder());

		txtNickName.setForeground(DEF_COLOR);
		txtNickName.setBounds(87, 67, 155, 20);
		add(txtNickName);

		final JxLabel maritalStatusLabel = new JxLabel();
		maritalStatusLabel.setTheme(theme);

		maritalStatusLabel.setForeground(DEF_COLOR);
		maritalStatusLabel.setText("MARITAL STATUS");
		maritalStatusLabel.setBounds(258, 67, 100, 20);
		maritalStatusLabel.setFontStyle(Font.BOLD);
		add(maritalStatusLabel);

		cmbMaritalStatus = new JxComboBox();
		cmbMaritalStatus.setTheme(theme);

		cmbMaritalStatus.setForeground(DEF_COLOR);
		presentationMap.put("maritalStatus", cmbMaritalStatus);

		// cmbMaritalStatus.setArc(0.4f);
		cmbMaritalStatus.setBounds(360, 67, 145, 20);
		add(cmbMaritalStatus);

		final JxLabel addressLabel = new JxLabel();
		addressLabel.setTheme(theme);

		addressLabel.setForeground(DEF_COLOR);
		addressLabel.setText("ADDRESS");
		addressLabel.setBounds(10, 93, 66, 20);
		addressLabel.setFontStyle(Font.BOLD);
		add(addressLabel);

		txtAddress = new JxText();
		txtAddress.setTheme(theme);

		new CompoundBorderUIResource(new LineBorder(Color.BLACK, 1, false),
				new BasicBorders.MarginBorder());

		txtAddress.setForeground(DEF_COLOR);
		presentationMap.put("address", txtAddress);
		txtAddress.setBounds(87, 93, 419, 20);
		add(txtAddress);

		final JxLabel cityLabel = new JxLabel();
		cityLabel.setTheme(theme);

		cityLabel.setForeground(DEF_COLOR);
		cityLabel.setText("CITY");
		cityLabel.setBounds(10, 119, 34, 20);
		cityLabel.setFontStyle(Font.BOLD);
		add(cityLabel);

		txtCity = new JxText();
		txtCity.setTheme(theme);

		new CompoundBorderUIResource(new LineBorder(Color.BLACK, 1, false),
				new BasicBorders.MarginBorder());

		txtCity.setForeground(DEF_COLOR);
		presentationMap.put("city", txtCity);
		txtCity.setBounds(87, 119, 110, 20);
		add(txtCity);

		final JxLabel stateLabel = new JxLabel();
		stateLabel.setTheme(theme);

		stateLabel.setForeground(DEF_COLOR);
		stateLabel.setText("STATE");
		stateLabel.setBounds(222, 119, 47, 20);
		stateLabel.setFontStyle(Font.BOLD);
		add(stateLabel);

		cmbState = new JxComboBox();
		cmbState.setTheme(theme);

		cmbState.setForeground(DEF_COLOR);
		stateLabel.setForeground(DEF_COLOR);
		presentationMap.put("state", cmbState);

		// cmbState.setArc(0.4f);
		cmbState.setBounds(310, 119, 84, 20);
		add(cmbState);

		final JxLabel zipLabel = new JxLabel();
		zipLabel.setTheme(theme);

		zipLabel.setForeground(DEF_COLOR);
		zipLabel.setText("ZIP");
		zipLabel.setBounds(400, 119, 29, 20);
		zipLabel.setFontStyle(Font.BOLD);
		add(zipLabel);

		txtZip = new JxText(FieldFormatter.ZIP);
		txtZip.setTheme(theme);

		txtZip.setForeground(DEF_COLOR);

		new CompoundBorderUIResource(new LineBorder(Color.BLACK, 1, false),
				new BasicBorders.MarginBorder());
		presentationMap.put("zip", txtZip);
		txtZip.setBounds(430, 119, 75, 20);
		add(txtZip);

		JSpinnerDateEditor dateEditor = new JSpinnerDateEditor();
		dateChooser = new JxDateChooser(dateEditor);
		dateChooser.setTheme(theme);

		dateChooser.setForeground(DEF_COLOR);
		presentationMap.put("dob", dateChooser);

		dateChooser.setDateFormatString("MM/dd/yyyy");
		dateChooser.setForeground(DEF_COLOR);
		dateEditor.setForeground(DEF_COLOR);
		dateEditor.setBackground(Color.white);

		dateChooser.setBounds(87, 145, 110, 20);
		add(dateChooser);

		final JxLabel dobLabel = new JxLabel();
		dobLabel.setTheme(theme);

		dobLabel.setForeground(DEF_COLOR);
		dobLabel.setText("DOB");
		dobLabel.setBounds(10, 145, 66, 20);
		dobLabel.setFontStyle(Font.BOLD);
		add(dobLabel);

		final JxLabel homePhoneLabel = new JxLabel();
		homePhoneLabel.setTheme(theme);

		homePhoneLabel.setForeground(DEF_COLOR);
		homePhoneLabel.setText("HOME PHONE");
		homePhoneLabel.setBounds(10, 175, 77, 20);
		homePhoneLabel.setFontStyle(Font.BOLD);
		add(homePhoneLabel);

		txtHomePhone = new PhoneField();
		txtHomePhone.setFont(font);
		txtHomePhone.setForeground(DEF_COLOR);
		presentationMap.put("home", txtHomePhone);
		txtHomePhone.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtHomePhone.setBounds(87, 176, 110, 20);
		add(txtHomePhone);

		final JxLabel workPhoneLabel = new JxLabel();
		workPhoneLabel.setTheme(theme);

		workPhoneLabel.setForeground(DEF_COLOR);
		workPhoneLabel.setText("WORK PHONE");
		workPhoneLabel.setBounds(222, 175, 84, 20);
		workPhoneLabel.setFontStyle(Font.BOLD);
		add(workPhoneLabel);

		txtWorkPhone = new PhoneField();
		txtWorkPhone.setFont(font);
		txtWorkPhone.setForeground(DEF_COLOR);
		presentationMap.put("work", txtWorkPhone);
		txtWorkPhone.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtWorkPhone.setBounds(310, 176, 84, 20);
		add(txtWorkPhone);

		final JxLabel cellLabel = new JxLabel();
		cellLabel.setTheme(theme);

		cellLabel.setForeground(DEF_COLOR);
		cellLabel.setText("CELL");
		cellLabel.setBounds(400, 175, 29, 20);
		cellLabel.setFontStyle(Font.BOLD);
		add(cellLabel);

		txtCell = new PhoneField();
		txtCell.setFont(font);
		txtCell.setForeground(DEF_COLOR);
		presentationMap.put("cell", txtCell);
		txtCell.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtCell.setBounds(430, 176, 75, 20);
		add(txtCell);

		final JxLabel ssNoLabel = new JxLabel();
		ssNoLabel.setTheme(theme);

		ssNoLabel.setForeground(DEF_COLOR);
		ssNoLabel.setText("SS NUMBER");
		ssNoLabel.setBounds(10, 201, 77, 16);
		ssNoLabel.setFontStyle(Font.BOLD);
		add(ssNoLabel);

		txtSS1 = new SsnField();
		txtSS1.setFont(font);
		txtSS1.setForeground(DEF_COLOR);
		presentationMap.put("ss1", txtSS1);
		txtSS1.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtSS1.setBounds(87, 202, 110, 20);
		add(txtSS1);

		// txtSS2 = new JxText();
		// txtSS2.setTheme (theme);
		// txtSS2.setBounds(134, 243, 47, 20);
		// add(txtSS2);
		// txtSS2.setVisible(false);

		final JxLabel birthPlaceLabel = new JxLabel();
		birthPlaceLabel.setTheme(theme);

		birthPlaceLabel.setForeground(DEF_COLOR);
		birthPlaceLabel.setText("BIRTH PLACE");
		birthPlaceLabel.setBounds(222, 145, 84, 20);
		birthPlaceLabel.setFontStyle(Font.BOLD);
		add(birthPlaceLabel);

		txtBirthPlace = new JxText();
		txtBirthPlace.setTheme(theme);

		new CompoundBorderUIResource(new LineBorder(Color.BLACK, 1, false),
				new BasicBorders.MarginBorder());

		txtBirthPlace.setForeground(DEF_COLOR);
		presentationMap.put("birthPlace", txtBirthPlace);
		txtBirthPlace.setBounds(310, 145, 84, 20);
		add(txtBirthPlace);

		final JxLabel citizenLabel = new JxLabel();
		citizenLabel.setTheme(theme);

		citizenLabel.setForeground(DEF_COLOR);
		citizenLabel.setText("CITIZEN");
		citizenLabel.setBounds(10, 227, 66, 20);
		citizenLabel.setFontStyle(Font.BOLD);
		add(citizenLabel);

		cmbCitizen = new JxComboBox();
		cmbCitizen.setTheme(theme);

		cmbCitizen.setForeground(DEF_COLOR);
		presentationMap.put("citizen", cmbCitizen);

		// cmbCitizen.setArc(0.4f);
		cmbCitizen.setBounds(87, 228, 110, 20);
		add(cmbCitizen);

		final JxLabel religionLabel = new JxLabel();
		religionLabel.setTheme(theme);

		religionLabel.setForeground(DEF_COLOR);
		religionLabel.setText("RELIGION");
		religionLabel.setBounds(222, 202, 66, 20);
		religionLabel.setFontStyle(Font.BOLD);
		add(religionLabel);

		cmbReligion = new JxComboBox();
		cmbReligion.setTheme(theme);

		cmbReligion.setForeground(DEF_COLOR);
		presentationMap.put("religion", cmbReligion);

		// cmbReligion.setArc(0.4f);
		cmbReligion.setBounds(310, 202, 195, 20);
		add(cmbReligion);

		final JxLabel roomLabel = new JxLabel();
		roomLabel.setTheme(theme);
		roomLabel.setVisible(false);

		roomLabel.setForeground(DEF_COLOR);
		roomLabel.setText("ROOM #");
		roomLabel.setBounds(10, 305, 66, 20);
		roomLabel.setFontStyle(Font.BOLD);

		add(roomLabel);

		cmbRoomFirst = new JxComboBox();
		cmbRoomFirst.setTheme(theme);

		cmbRoomFirst.setForeground(DEF_COLOR);

		// cmbRoomFirst.setArc(0.4f);
		cmbRoomFirst.setVisible(false);
		cmbRoomFirst.setBounds(87, 305, 110, 20);
		add(cmbRoomFirst);

		final JxLabel statusLabel = new JxLabel();
		statusLabel.setTheme(theme);

		statusLabel.setForeground(DEF_COLOR);
		statusLabel.setText("STATUS:");
		statusLabel.setBounds(531, 228, 66, 16);
		statusLabel.setFontStyle(Font.BOLD);

		add(statusLabel);

		cmbOrigin = new JxComboBox();
		cmbOrigin.setTheme(theme);

		cmbOrigin.setForeground(DEF_COLOR);
		presentationMap.put("origin", cmbOrigin);

		// cmbOrigin.setArc(0.4f);
		cmbOrigin.setBounds(310, 228, 195, 20);
		add(cmbOrigin);

		panel_3 = new medrex.client.PanelImage();
		panel_3.setArc(0.4f);
		panel_3.setBounds(531, 43, 128, 128);
		panel_3.setForeground(DEF_COLOR);
		panel_3.setCurvedView(true);
		panel_3.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		add(panel_3);

		roomLabel_1 = new JxLabel();
		roomLabel_1.setTheme(theme);

		roomLabel_1.setForeground(DEF_COLOR);
		roomLabel_1.setText("FLOOR #");
		roomLabel_1.setBounds(10, 279, 66, 20);
		roomLabel_1.setFontStyle(Font.BOLD);
		// roomLabel_1.setVisible(false);
		add(roomLabel_1);

		/*
		 * cmbFloorType = new JxComboBox(); cmbFloorType.setTheme (theme);
		 * presentationMap.put("floorType", cmbFloorType);
		 * 
		 * cmbFloorType.setForeground(DEF_COLOR); cmbFloorType.setArc(0.4f);
		 * cmbFloorType.addItemListener(new ItemListener() { public void
		 * itemStateChanged(final ItemEvent arg0) {
		 * updateRoomSubCategoryCombo(); } }); cmbFloorType.setBounds(87, 353,
		 * 141, 25); add(cmbFloorType);
		 */

		floorType = new JxText();
		floorType.setTheme(theme);

		new CompoundBorderUIResource(new LineBorder(Color.BLACK, 1, false),
				new BasicBorders.MarginBorder());

		floorType.setForeground(DEF_COLOR);

		floorType.setBounds(87, 280, 110, 20);
		floorType.setEditable(false);
		add(floorType);

		roomLabel_2 = new JxLabel();
		roomLabel_2.setTheme(theme);

		roomLabel_2.setForeground(DEF_COLOR);
		roomLabel_2.setText("ROOM #");
		roomLabel_2.setBounds(222, 279, 60, 20);
		roomLabel_2.setFontStyle(Font.BOLD);
		add(roomLabel_2);

		txtRoom = new JxText();
		txtRoom.setTheme(theme);

		new CompoundBorderUIResource(
				new LineBorder(Color.LIGHT_GRAY, 0, false),
				new BasicBorders.MarginBorder());

		txtRoom.setForeground(DEF_COLOR);
		// presentationMap.put("room", txtRoom);

		txtRoom.setBounds(310, 280, 195, 20);
		txtRoom.setEditable(false);

		BalloonTipStyle edgedLook = new RoundedBalloonStyle(1, 1, new Color(
				255, 255, 102), Color.BLACK);
		String textString = "<html>"
				+ "<BR><B>To Change Room of This Resident</B>"
				+ "<BR><B>Please go to ROOM tab  </B>" + "</html>";
		final BalloonTip bt = new BalloonTip(txtRoom, textString, edgedLook,
				false);
		ToolTipUtils.balloonToToolTip(bt, 500, 3000);

		add(txtRoom);

		final JxLabel languageLabel = new JxLabel();
		languageLabel.setTheme(theme);

		languageLabel.setForeground(DEF_COLOR);
		languageLabel.setText("LANGUAGE");
		languageLabel.setBounds(10, 253, 66, 20);
		languageLabel.setFontStyle(Font.BOLD);
		add(languageLabel);

		cmbLanguage = new JxComboBox();
		cmbLanguage.setTheme(theme);

		cmbLanguage.setForeground(DEF_COLOR);
		presentationMap.put("language", cmbLanguage);

		// cmbLanguage.setArc(0.4f);
		cmbLanguage.setBounds(87, 254, 110, 20);
		add(cmbLanguage);

		cmbStatus = new JxComboBox();
		cmbStatus.setTheme(theme);

		cmbStatus.setForeground(DEF_COLOR);
		presentationMap.put("type", cmbStatus);

		// cmbStatus.setArc(0.4f);
		cmbStatus.setBounds(531, 254, 127, 20);
		add(cmbStatus);

		updateData();

		presentationModel = new PresentationModel(presentationMap,
				ResidentMain.class, residentPersonalInfoController, errorLabel);

		final JxLabel originLabel = new JxLabel();
		originLabel.setTheme(theme);

		originLabel.setForeground(DEF_COLOR);
		originLabel.setText("ORIGIN");
		originLabel.setBounds(222, 228, 66, 20);
		originLabel.setFontStyle(Font.BOLD);
		add(originLabel);

		roomButton = new JxButton();
		roomButton.setTheme(theme);
		roomButton
				.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));

		roomButton.setForeground(DEF_COLOR);

		roomButton.setArc(0.4f);
		roomButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (getResidentExistInHouse()) {
					SwingUtils.openInDialog(new PanelRoomPopUp(
							controllerRoomList));
					doUpdateFloorsAndRooms();
				}
			}
		});
		roomButton.setText("+");
		roomButton.setBounds(222, 305, 47, 20);
		add(roomButton);
		roomButton.setVisible(false);

		presentationModel.validateAll();
	}

	public void doUpdate() {
		fillCombos();
		// updateRoomCategoryCombo();
		updateData();
	}

	public void doUpdateFloorsAndRooms() {
		String floor = controllerRoomList.getFloorType();
		String room = controllerRoomList.getRoom();
		if (room != null) {
			room = room.replaceAll("<(.)+>", "");
		}
		if (floor != null) {
			floorType.setText(floor);
		}
		if (room != null) {
			txtRoom.setText(room);

		}

	}

	public boolean getResidentExistInHouse() {
		int currentResidentSerial = residentPersonalInfoController
				.getCurrentResidenceSerial();
		boolean bool = false;
		if (currentResidentSerial != 0) {

			try {
				bool = MedrexClientManager.getInstance()
						.getResidentExistInHouse(currentResidentSerial);
			} catch (Exception e) {
			}
			if (bool == false) {
				JOptionPane.showMessageDialog(null,
						"Room can be allotted for InHouse Resident only.");
				bool = false;
			} else {
				bool = true;
			}
		}
		return bool;
	}

	public void fillCombos() {

		/*
		 * cmbSex.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
		 * " ", "Male", "Female" }));
		 */
		/*
		 * cmbLanguage.setModel(new javax.swing.DefaultComboBoxModel(new
		 * String[] { " ", "English", "Spanish","Other" }));
		 */

		/*
		 * cmbMaritalStatus.setModel(new javax.swing.DefaultComboBoxModel( new
		 * String[] { " ", "Married", "Single", "Separated", "Divorced",
		 * "Widow", "Never Married", "Living With Partner", "Other" }));
		 */

		/*
		 * cmbState.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
		 * " ", "Alabama", "Alaska", "Arizona", "Arkansas", "California",
		 * "Colorado", "Connecticut", "Delaware", "Florida", "Georgia",
		 * "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas",
		 * "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts",
		 * "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana",
		 * "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico",
		 * "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma",
		 * "Oregon", "Pennsylvania", "Rhode Island", "South Carolina",
		 * "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia",
		 * "Washington", "West Virginia", "Wisconsin", "Wyoming" }));
		 */

		/*
		 * cmbCitizen.setModel(new javax.swing.DefaultComboBoxModel(new String[]
		 * { " ", "US CITIZEN", "NON US CITIZEN" }));
		 */

		/*
		 * cmbReligion.setModel(new javax.swing.DefaultComboBoxModel(new
		 * String[] { " ", "Baptist", "Catholic", "PENTECOSTAL", "Protestant",
		 * "NonSectarian", "Methodist", "Jewish", "APOSTOLIC", "Christian",
		 * "Lutheran", "Other" }));
		 */

		/*
		 * cmbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[]
		 * { " ", "Active", "Inactive" }));
		 */

		/*
		 * cmbOrigin.setModel(new javax.swing.DefaultComboBoxModel(new String[]
		 * { " ", "Hispanic", "Black, not of Hispanic origin",
		 * "White, not of Hispanic origin","Other" }));
		 */

		// lblPic.getGraphics().drawImage(myimg, 0, 0, this);
		// List<MasterList> emptyComboItems = new ArrayList<MasterList>();
		List<MasterList> maritailComboItems = new ArrayList<MasterList>();
		List<MasterList> stateComboItems = new ArrayList<MasterList>();
		List<MasterList> sexComboItems = new ArrayList<MasterList>();
		List<MasterList> citizenComboItems = new ArrayList<MasterList>();
		List<MasterList> religionComboItems = new ArrayList<MasterList>();
		List<MasterList> languageComboItems = new ArrayList<MasterList>();
		List<MasterList> origionComboItems = new ArrayList<MasterList>();
		List<MasterList> statusComboItems = new ArrayList<MasterList>();

		try {
			// emptyComboItems =
			// MedrexClientManager.getInstance().getMasterListRecords(EmptyComboItem.class);
			maritailComboItems = MedrexClientManager.getInstance()
					.getMasterListRecords(MaritalStatus.class);
			stateComboItems = MedrexClientManager.getInstance()
					.getMasterListRecords(State.class);
			sexComboItems = MedrexClientManager.getInstance()
					.getMasterListRecords(Sex.class);
			citizenComboItems = MedrexClientManager.getInstance()
					.getMasterListRecords(Citizen.class);
			religionComboItems = MedrexClientManager.getInstance()
					.getMasterListRecords(Religion.class);
			languageComboItems = MedrexClientManager.getInstance()
					.getMasterListRecords(Language.class);
			origionComboItems = MedrexClientManager.getInstance()
					.getMasterListRecords(Origin.class);
			statusComboItems = MedrexClientManager.getInstance()
					.getMasterListRecords(Status.class);
		} catch (Exception e) {

		}

		cmbMaritalStatus.removeAllItems();
		for (int i = 0; i < maritailComboItems.size(); i++) {
			MasterList m = maritailComboItems.get(i);
			cmbMaritalStatus.addItem(m);
		}
		MaritalStatus ms = new MaritalStatus();
		ms.setId(0);
		ms.setMsterName(" ");
		cmbMaritalStatus.insertItemAt(ms, 0);
		cmbMaritalStatus.setSelectedIndex(0);

		cmbState.removeAllItems();
		for (int i = 0; i < stateComboItems.size(); i++) {
			MasterList m = stateComboItems.get(i);
			cmbState.addItem(m);
		}
		State st = new State();
		st.setId(0);
		st.setMsterName(" ");
		cmbState.insertItemAt(st, 0);
		cmbState.setSelectedIndex(0);

		cmbSex.removeAllItems();
		for (int i = 0; i < sexComboItems.size(); i++) {
			MasterList m = sexComboItems.get(i);
			cmbSex.addItem(m);
		}
		Sex s = new Sex();
		s.setId(0);
		s.setMsterName(" ");
		cmbSex.insertItemAt(s, 0);
		cmbSex.setSelectedIndex(0);

		cmbCitizen.removeAllItems();
		for (int i = 0; i < citizenComboItems.size(); i++) {
			MasterList m = citizenComboItems.get(i);
			cmbCitizen.addItem(m);
		}
		Citizen cit = new Citizen();
		cit.setId(0);
		cit.setMsterName(" ");
		cmbCitizen.insertItemAt(cit, 0);
		cmbCitizen.setSelectedIndex(0);

		cmbReligion.removeAllItems();
		for (int i = 0; i < religionComboItems.size(); i++) {
			MasterList m = religionComboItems.get(i);
			cmbReligion.addItem(m);
		}
		Religion rel = new Religion();
		rel.setId(0);
		rel.setMsterName(" ");
		cmbReligion.insertItemAt(rel, 0);
		cmbReligion.setSelectedIndex(0);

		cmbLanguage.removeAllItems();
		for (int i = 0; i < languageComboItems.size(); i++) {
			MasterList m = languageComboItems.get(i);
			cmbLanguage.addItem(m);
		}
		Language lang = new Language();
		lang.setId(0);
		lang.setMsterName(" ");
		cmbLanguage.insertItemAt(lang, 0);
		cmbLanguage.setSelectedIndex(0);

		cmbOrigin.removeAllItems();
		for (int i = 0; i < origionComboItems.size(); i++) {
			MasterList m = origionComboItems.get(i);
			cmbOrigin.addItem(m);
		}
		Origin or = new Origin();
		or.setId(0);
		or.setMsterName(" ");
		cmbOrigin.insertItemAt(or, 0);
		cmbOrigin.setSelectedIndex(0);

		cmbStatus.removeAllItems();
		for (int i = 0; i < statusComboItems.size(); i++) {
			MasterList m = statusComboItems.get(i);
			cmbStatus.addItem(m);
		}
		Status stu = new Status();
		stu.setId(0);
		stu.setMsterName(" ");
		cmbStatus.insertItemAt(stu, 0);
		cmbStatus.setSelectedIndex(0);

		// cmbMaritalStatus.setModel(new
		// javax.swing.DefaultComboBoxModel(maritailComboItems.toArray()));
		// cmbState.setModel(new
		// javax.swing.DefaultComboBoxModel(stateComboItems.toArray()));
		// cmbSex.setModel(new
		// javax.swing.DefaultComboBoxModel(sexComboItems.toArray()));
		// cmbCitizen.setModel(new
		// javax.swing.DefaultComboBoxModel(citizenComboItems.toArray()));
		// cmbReligion.setModel(new
		// javax.swing.DefaultComboBoxModel(religionComboItems.toArray()));
		// cmbLanguage.setModel(new
		// javax.swing.DefaultComboBoxModel(languageComboItems.toArray()));
		// cmbOrigin.setModel(new
		// javax.swing.DefaultComboBoxModel(origionComboItems.toArray()));
		// cmbStatus.setModel(new
		// javax.swing.DefaultComboBoxModel(statusComboItems.toArray()));

	}

	public void updateData() {
		TempRoomHistory roomHist = null;
		ResidentMain resMain = null;
		int currentResidentSerial = 0;
		currentResidentSerial = residentPersonalInfoController
				.getCurrentResidenceSerial();

		if (currentResidentSerial != 0) {
			try {
				resMain = MedrexClientManager.getInstance().getResident(
						currentResidentSerial);
				roomHist = MedrexClientManager.getInstance()
						.getLastRoomHistory(currentResidentSerial);
				version = resMain.getVersion();
			} catch (Exception e) {
				e.printStackTrace();
				resMain = new ResidentMain();
				version = 0;
			}
		} else {
			resMain = new ResidentMain();
		}
		try {
			resMain = residentPersonalInfoController.getCurrentResident();
		} catch (MedrexException me) {
			JOptionPane.showMessageDialog(null, me.getMessage());
		}
		fillCombos();
		// updateRoomCategoryCombo();
		try {
			// floorType.setText(resMain.getFloorType());
			// updateRoomSubCategoryCombo();
			// cmbRoom.setSelectedItem(resMain.getRoom());
			// txtRoom.setText(resMain.getRoom());
			if (roomHist.getStartDate() != null
					&& roomHist.getEndDate() != null) {
				floorType.setText("");
				txtRoom.setText("");
			} else {
				floorType.setText(roomHist.getFloor());
				txtRoom.setText(roomHist.getRoom());
			}
		} catch (Exception e1) {
			// e1.printStackTrace();
		}

		txtName.setText(resMain.getUserName());
		txtLastName.setText(resMain.getUserPass());

		txtNickName.setText(resMain.getNickName());
		txtAddress.setText(resMain.getAddress());
		txtCity.setText(resMain.getCity());
		txtZip.setText(resMain.getZip());
		try {
			// System.out.println(resMain.getDob().toString() + "^^");
			dateChooser.setDate(resMain.getDob());
		} catch (Exception e) {
			// e.printStackTrace();
		}

		txtHomePhone.setNumber(resMain.getHome());
		txtWorkPhone.setNumber(resMain.getWork());
		txtCell.setNumber(resMain.getCell());
		txtSS1.setNumber(resMain.getSs1());
		// txtSS2.setText(resMain.getSs2());
		txtBirthPlace.setText(resMain.getBirthPlace());

		if (resMain.getCitizen() != null) {
			cmbCitizen.setSelectedItem(resMain.getCitizen());
		} else {
			cmbCitizen.setSelectedIndex(0);
		}

		cmbMaritalStatus.setSelectedItem(resMain.getMaritalStatus());
		cmbReligion.setSelectedItem(resMain.getReligion());
		cmbSex.setSelectedItem(resMain.getSex());
		cmbState.setSelectedItem(resMain.getState());
		// cmbRoomFirst.setSelectedItem(resMain.getRoom());
		cmbStatus.setSelectedItem(resMain.getType());
		cmbLanguage.setSelectedItem(resMain.getLanguage());
		cmbOrigin.setSelectedItem(resMain.getOrigin());

		ImageIcon ic = resMain.getImg();
		if (ic != null) {
			panel_3.setImage(Utils.getBufferedImageFromImageicon(resMain
					.getImg()));
		} else {
			panel_3.setImage(null);
		}

		if (Global.currentResidenceKey == 0) {
			cmbCitizen.setSelectedIndex(0);
			// cmbFloorType.setSelectedIndex(1);
			cmbMaritalStatus.setSelectedIndex(0);
			cmbSex.setSelectedIndex(0);
			cmbState.setSelectedIndex(0);
			cmbReligion.setSelectedIndex(0);
			cmbLanguage.setSelectedIndex(0);
			cmbOrigin.setSelectedIndex(0);
			cmbStatus.setSelectedIndex(0);
		}

		this.revalidate();
		this.updateUI();
		this.repaint();

		panel_3.repaint();

		// }

		// String[] rooms = LTC.getRooms(resMain.getRoom());
		// cmbRoomFirst.setModel(new DefaultComboBoxModel(rooms));
		presentationModel = new PresentationModel(presentationMap,
				ResidentMain.class, residentPersonalInfoController, errorLabel);
		presentationModel.validateAll();
	}

	/*
	 * public void updateRoomCategoryCombo() { cmbFloorType.setModel(new
	 * javax.swing.DefaultComboBoxModel( new String[] { " ",
	 * "1st floor south wing", "Main North Wing", "2nd floor South Wing",
	 * "Main and north wing" }));
	 * 
	 * cmbFloorType.setSelectedIndex(0); updateRoomSubCategoryCombo(); }
	 */

	public void updateRoomSubCategoryCombo() {

		/*
		 * if (cmbFloorType.getSelectedItem().equals("1st floor south wing")) {
		 * cmbRoom.removeAllItems(); for (int i = 0; i < strSubCat1.length; i++)
		 * { cmbRoom.addItem(strSubCat1[i]); } }
		 * 
		 * else if (cmbFloorType.getSelectedItem().equals("Main North Wing")) {
		 * cmbRoom.removeAllItems(); for (int i = 0; i < strSubCat2.length; i++)
		 * { cmbRoom.addItem(strSubCat2[i]); } }
		 * 
		 * else if
		 * (cmbFloorType.getSelectedItem().equals("2nd floor South Wing")) {
		 * cmbRoom.removeAllItems(); for (int i = 0; i < strSubCat3.length; i++)
		 * { cmbRoom.addItem(strSubCat3[i]); } }
		 * 
		 * else if
		 * (cmbFloorType.getSelectedItem().equals("Main and north wing")) {
		 * cmbRoom.removeAllItems(); for (int i = 0; i < strSubCat4.length; i++)
		 * { cmbRoom.addItem(strSubCat4[i]); } }
		 */

		try {
			occupiedRoomList = residentPersonalInfoController.getOccupiedRoom();
			Iterator itr = occupiedRoomList.iterator();
			while (itr.hasNext()) {
				String room = itr.next() + "";
				if (room != null) {
					// cmbRoom.removeItem(room);
				}

			}
		} catch (MedrexException me) {
			JOptionPane.showMessageDialog(null, me.getMessage());
		}

		int currentResidentSerial = residentPersonalInfoController
				.getCurrentResidenceSerial();
		if (currentResidentSerial != 0) {
			try {
				MedrexClientManager.getInstance().getResident(
						currentResidentSerial);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void doSave() {
		ResidentMain rm = null;
		if (residentPersonalInfoController.getCurrentResidenceSerial() == 0) {
			rm = new ResidentMain();
			rm.setSerial(0);
		} else {
			try {
				rm = residentPersonalInfoController.getCurrentResident();
				rm = new ResidentMain();
				// rm.setSerial(residentPersonalInfoController.getCurrentResidenceSerial());
			} catch (Exception ee) {
			}
		}

		/*
		 * if (cmbFloorType.getSelectedItem() == null) { rm.setFloorType(""); }
		 * else { rm.setFloorType((String) cmbFloorType.getSelectedItem()); }
		 */
		/* TODO: Migrating to room history */
		// rm.setFloorType(floorType.getText().trim());
		/*
		 * if (cmbRoom.getSelectedItem() == null) { rm.setRoom(""); } else {
		 * rm.setRoom((String) cmbRoom.getSelectedItem()); }
		 */

		/* TODO: Migrating to room history */
		// rm.setRoom(txtRoom.getText().trim());
		rm.setVersion(version);

		rm.setUserName(txtName.getText().trim());
		rm.setUserPass(txtLastName.getText().trim());

		rm.setAddress(txtAddress.getText().trim());
		rm.setBirthPlace(txtBirthPlace.getText().trim());

		rm.setCell(txtCell.getNumber().trim());

		Citizen cit = new Citizen();
		cit.setMsterName(" ");
		if (cmbCitizen.getSelectedItem() == null) {
			rm.setCitizen(cit);
		} else {
			rm.setCitizen((Citizen) cmbCitizen.getSelectedItem());
		}

		rm.setCity(txtCity.getText().trim());
		rm.setHome(txtHomePhone.getNumber().trim());

		if (cmbMaritalStatus.getSelectedItem() == null) {
			rm.setMaritalStatus(null);
		} else {
			rm.setMaritalStatus((MaritalStatus) cmbMaritalStatus
					.getSelectedItem());
		}
		rm.setNickName(txtNickName.getText().trim());

		// rm.setRoom((String) cmbRoomFirst.getSelectedItem());

		if (cmbSex.getSelectedItem() == null) {
			rm.setSex(null);
		} else {
			rm.setSex((Sex) cmbSex.getSelectedItem());
		}

		rm.setSs1(txtSS1.getNumber().trim());
		// rm.setSs2(txtSS2.getText().trim());
		if (cmbState.getSelectedItem() == null) {
			rm.setState(null);
		} else {
			rm.setState((State) cmbState.getSelectedItem());
		}

		rm.setWork(txtWorkPhone.getNumber().trim());
		rm.setZip(txtZip.getText().trim());
		if (cmbReligion.getSelectedItem() == null) {
			rm.setReligion(null);
		} else {
			rm.setReligion((Religion) cmbReligion.getSelectedItem());
		}

		rm.setLanguage(cmbLanguage.getSelectedItem() == null ? null
				: (Language) cmbLanguage.getSelectedItem());
		rm.setOrigin(cmbOrigin.getSelectedItem() == null ? null
				: (Origin) cmbOrigin.getSelectedItem());

		Date dd = MedrexClientManager.getServerTime();
		try {
			dd = dateChooser.getDate();
		} catch (Exception ge) {

		}
		rm.setDob(dd);

		if (cmbStatus.getSelectedItem() == null) {
			rm.setType(null);
		} else {
			rm.setType((Status) cmbStatus.getSelectedItem());
		}

		rm.setImg(imageIcon);

		List errors = residentPersonalInfoController.doValidate(rm, "");

		if (errors.size() > 0) {
			MsgBox m = new MsgBox();
			Iterator itr = errors.iterator();
			String strError = "";
			while (itr.hasNext()) {
				strError += (String) itr.next() + "\n";
			}
			m.addPrompt(strError);
			m.setTitle("Error Saving Resident Info");
			m.setVisible(true);
		} else {
			try {
				residentPersonalInfoController.insertOrUpdateResidentMain(rm);
				JOptionPane.showMessageDialog(this, "Saved successfully");
			} catch (MedrexException me) {
				JOptionPane.showMessageDialog(null, me.getMessage());
			}

		}
	}
}
