package medrex.client.admin.nursingHome;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;
import javax.swing.JComboBox;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.main.resident.personalInfo.PanelResidentPersonalInfo;
import medrex.client.utils.MedrexValidation;
import medrex.client.utils.PresentationModel;
import medrex.client.utils.Utils;
import medrex.client.utils.controls.PhoneField;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.Controller;
import medrex.commons.vo.admin.NursingHome;
import medrex.commons.vo.masterList.MasterList;
import medrex.commons.vo.masterList.State;
import medrex.commons.vo.resident.ResidentMain;

import com.jgoodies.validation.util.ValidationUtils;
import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxText;
import com.sX.theme.BlueOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelNursingHomeInfo extends JDialog implements Controller {
	private JxLabel lblFacility;
	private JxText txtFacility;
	private PhoneField txtFax;
	private JxText txtMedicaid;
	private JxText txtMedicare;
	private JxText txtEIN;
	private JxText txtWebsite;
	private JxText txtEMail;
	private PhoneField txtPhone;
	private JxText txtZip;
	private JxComboBox cmbState;
	private JxText txtCity;
	private JxText txtAddresss;
	private JxButton btnCancel;
	private JxButton btnSave;
	private JxText txtNPI;
	private JxText txtCompanyName;
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);
	private Map<String,JComponent> presentationMap;
	private PresentationModel presentationModel;
	private List<String> errorList;
	ImageIcon imageIcon = null;
	private BufferedImage image = null;
	private medrex.client.PanelImage panel_Image;
 	
	public PanelNursingHomeInfo() {
		super();
	    setTitle("Nursing Home Information");
		presentationMap = new HashMap<String, JComponent>();
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		setBackground(Color.WHITE);
		setLayout(null);
		setSize(588, 731);
		Theme blueOverWhiteTheme = new BlueOverWhiteTheme();
		 
		List<MasterList> stateComboItems = new ArrayList<MasterList>();
		try {
			stateComboItems = MedrexClientManager.getInstance()
					.getMasterListRecords(State.class);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		final JxPanel panel = new JxPanel();
		panel.setBounds(0, 0, 580, 697);
		getContentPane().add(panel);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);

		final JxLabel nursingHomeInformationLabel = new JxLabel();
		nursingHomeInformationLabel.setForeground(DEF_COL);
		nursingHomeInformationLabel.setTheme(blueOverWhiteTheme);
		nursingHomeInformationLabel.setFont(new Font("", Font.BOLD, 22));
		nursingHomeInformationLabel.setText("Nursing Home Information");
		 
		nursingHomeInformationLabel.setBounds(143, 21, 293, 29);
		panel.add(nursingHomeInformationLabel);

		final JxLabel lblCompanyName = new JxLabel();
		lblCompanyName.setForeground(DEF_COL);
		lblCompanyName.setText("Company Name");
		lblCompanyName.setTheme(blueOverWhiteTheme);
		lblCompanyName.setBounds(51, 89, 98, 21);
		panel.add(lblCompanyName);

		final JxLabel addressLabel = new JxLabel();
		addressLabel.setForeground(DEF_COL);
		addressLabel.setText("Address");
		addressLabel.setTheme(blueOverWhiteTheme);
		addressLabel.setBounds(51, 131, 66, 16);
		panel.add(addressLabel);

		
		txtCompanyName = new JxText();
		 txtCompanyName.setBounds(143, 87, 356, 21);
	    presentationMap.put("name", txtCompanyName);	
	    txtCompanyName.setTheme(blueOverWhiteTheme);
	    panel.add(txtCompanyName);

		btnSave = new JxButton();
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (doSave()) {
					PanelNursingHomeInfo.this.dispose();
				}
			}
		});
		btnSave.setBackground(Color.WHITE);
		btnSave.setForeground(DEF_COL);
		btnSave.setArc(0.4f);
		btnSave.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
	       
		btnSave.setTheme(blueOverWhiteTheme);
		btnSave.setFont(new Font("", Font.BOLD, 12));
		btnSave.setText("Save");
		btnSave.setBounds(120, 650, 106, 26);
		panel.add(btnSave);

		btnCancel = new JxButton();
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				PanelNursingHomeInfo.this.dispose();
			}
		});
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setArc(0.4f);
		btnCancel.setForeground(DEF_COL);
		btnCancel.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		 btnCancel.setTheme(blueOverWhiteTheme);
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.setText("Cancel");
		btnCancel.setBounds(250, 650, 106, 26);
		panel.add(btnCancel);

		txtAddresss = new JxText();
		txtAddresss.setTheme(blueOverWhiteTheme);
		txtAddresss.setBounds(143, 126, 356, 21);
		presentationMap.put("address", txtAddresss);
		panel.add(txtAddresss);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(51, 165, 458, 33);
		panel.add(panel_1);

		final JxLabel cityLabel = new JxLabel();
		cityLabel.setForeground(DEF_COL);
		cityLabel.setTheme(blueOverWhiteTheme);
		cityLabel.setBounds(0, 0, 54, 21);
		panel_1.add(cityLabel);
		cityLabel.setText("City");

		txtCity = new JxText();
		txtCity.setTheme(blueOverWhiteTheme);
	    txtCity.setBounds(92, 0, 79, 21);
	    presentationMap.put("city",txtCity);
		panel_1.add(txtCity);

		final JxLabel stateLabel = new JxLabel();
		stateLabel.setForeground(DEF_COL);
		stateLabel.setTheme(blueOverWhiteTheme);
		stateLabel.setBounds(178, 0, 34, 14);
		panel_1.add(stateLabel);
		stateLabel.setText("State");

		cmbState = new JxComboBox();
		cmbState.setTheme(blueOverWhiteTheme);
		cmbState.setBackground(Color.WHITE);
		cmbState.setBounds(215, 0, 114, 21);
	   
		panel_1.add(cmbState);
		
		cmbState.removeAllItems();
		for (int i = 0; i < stateComboItems.size(); i++) {
			MasterList m = stateComboItems.get(i);
			cmbState.addItem(m);
		}
	
		State st = new State();
		st.setId(0);
		st.setMsterName(" ");
		cmbState.insertItemAt(st, 0);
		cmbState.setSelectedIndex(0);	cmbState.setTheme(blueOverWhiteTheme); 
		presentationMap.put("state", cmbState);
		

		final JxLabel cityLabel_1 = new JxLabel();
		cityLabel_1.setForeground(DEF_COL);
		cityLabel_1.setTheme(blueOverWhiteTheme);
		cityLabel_1.setBounds(335, 0, 34, 14);
		panel_1.add(cityLabel_1);
		cityLabel_1.setText("Zip");

		txtZip = new JxText();
		txtZip.setTheme(blueOverWhiteTheme);
		txtZip.setBounds(375, 0, 73, 21);
		presentationMap.put("zip",txtZip);
		panel_1.add(txtZip);

		final JxPanel panel_1_1 = new JxPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(51, 204, 458, 25);
		panel.add(panel_1_1);

		final JxLabel cityLabel_2 = new JxLabel();
		cityLabel_2.setForeground(DEF_COL);
		cityLabel_2.setTheme(blueOverWhiteTheme);
		cityLabel_2.setText("Phone #");
		cityLabel_2.setBounds(0, 0, 54, 21);
		panel_1_1.add(cityLabel_2); 

		txtPhone = new PhoneField();txtPhone.setForeground(DEF_COL);
		txtPhone.setBorder(new LineBorder(DEF_COL, 1, false));
		txtPhone.setBounds(92, 0, 116, 21);
		presentationMap.put("phone",txtPhone);
		panel_1_1.add(txtPhone);

		final JxLabel stateLabel_1 = new JxLabel();
		stateLabel_1.setForeground(DEF_COL);
		stateLabel_1.setText("Fax#");
		stateLabel_1.setTheme(blueOverWhiteTheme);
		stateLabel_1.setBounds(215, 0, 34, 21);
		panel_1_1.add(stateLabel_1);

		txtFax = new PhoneField();txtFax.setForeground(DEF_COL);
		txtFax.setBounds(258, 0, 116, 21);presentationMap.put("phone",txtFax);
		panel_1_1.add(txtFax);

		final JxPanel panel_1_2 = new JxPanel();
		panel_1_2.setBackground(Color.WHITE);
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(50, 235, 458, 25);
		panel.add(panel_1_2);

		final JxLabel cityLabel_3 = new JxLabel();cityLabel_3.setTheme(blueOverWhiteTheme);
		cityLabel_3.setForeground(DEF_COL);
		cityLabel_3.setText("E-mail");
		cityLabel_3.setBounds(0, 0, 54, 21);
		panel_1_2.add(cityLabel_3);

		txtEMail = new JxText();
		txtEMail.setForeground(DEF_COL);
		txtEMail.setBounds(92, 0, 356, 21);
		presentationMap.put("email",txtEMail);
		 
		panel_1_2.add(txtEMail);

		final JxPanel panel_1_2_1 = new JxPanel();
		panel_1_2_1.setBackground(Color.WHITE);
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setBounds(50, 270, 458, 25);
		panel.add(panel_1_2_1);

		final JxLabel cityLabel_3_1 = new JxLabel();
		cityLabel_3_1.setForeground(DEF_COL);
		cityLabel_3_1.setTheme(blueOverWhiteTheme);
		cityLabel_3_1.setText("Website");
		cityLabel_3_1.setBounds(0, 0, 54, 21);
		panel_1_2_1.add(cityLabel_3_1);

		txtWebsite = new JxText();
		 txtWebsite.setTheme(blueOverWhiteTheme);
		txtWebsite.setBounds(92, 0, 356, 21);
		presentationMap.put("website", txtWebsite);
		 
		panel_1_2_1.add(txtWebsite);

		final JxPanel panel_1_2_1_1 = new JxPanel();
		panel_1_2_1_1.setBackground(Color.WHITE);
		panel_1_2_1_1.setLayout(null);
		panel_1_2_1_1.setBounds(50, 305, 458, 25);
		panel.add(panel_1_2_1_1);

		final JxLabel cityLabel_3_1_1 = new JxLabel();cityLabel_3_1_1.setTheme(blueOverWhiteTheme);
		cityLabel_3_1_1.setForeground(DEF_COL);
		cityLabel_3_1_1.setText("EIN#");
		cityLabel_3_1_1.setBounds(0, 0, 54, 21);
		panel_1_2_1_1.add(cityLabel_3_1_1);

		txtEIN = new JxText();txtEIN.setForeground(DEF_COL);
		txtEIN.setBounds(92, 0, 356, 21); 
		presentationMap.put("ein",txtEIN);
		txtEIN.setBorder(new LineBorder(DEF_COL, 1, false));
		panel_1_2_1_1.add(txtEIN);

		final JxPanel panel_1_2_1_1_1 = new JxPanel();panel_1_2_1_1_1.setForeground(DEF_COL);
		panel_1_2_1_1_1.setBackground(Color.WHITE);
		panel_1_2_1_1_1.setLayout(null);
		panel_1_2_1_1_1.setBounds(50, 340, 458, 25);
		panel.add(panel_1_2_1_1_1);

		final JxLabel npiLabel = new JxLabel();npiLabel.setTheme(blueOverWhiteTheme);
		npiLabel.setForeground(DEF_COL);
		npiLabel.setBounds(0, 0, 54, 21);
		panel_1_2_1_1_1.add(npiLabel);
		npiLabel.setText("NPI #");
		npiLabel.setForeground(DEF_COL);
	 
		txtNPI = new JxText();txtNPI.setTheme(blueOverWhiteTheme);
		txtNPI.setBounds(92, 0, 356, 21); 
		presentationMap.put("npi",txtNPI);
 
		panel_1_2_1_1_1.add(txtNPI);
		txtNPI.setForeground(DEF_COL);

		final JxPanel panel_1_2_1_1_1_1 = new JxPanel();
		panel_1_2_1_1_1_1.setBackground(Color.WHITE);
		panel_1_2_1_1_1_1.setLayout(null);
		panel_1_2_1_1_1_1.setBounds(50, 375, 458, 25);
		panel.add(panel_1_2_1_1_1_1);

		final JxLabel npiLabel_1 = new JxLabel();npiLabel_1.setTheme(blueOverWhiteTheme);
		npiLabel_1.setForeground(DEF_COL);
		npiLabel_1.setText("Medicare#");
		
		npiLabel_1.setBounds(0, 0, 86, 21);
		panel_1_2_1_1_1_1.add(npiLabel_1);

		txtMedicare = new JxText();txtMedicare.setTheme(blueOverWhiteTheme);
		presentationMap.put("medicare", txtMedicare);
		txtMedicare.setBounds(92, 0, 356, 21);  
		panel_1_2_1_1_1_1.add(txtMedicare);

		final JxPanel panel_1_2_1_1_1_1_1 = new JxPanel();
		panel_1_2_1_1_1_1_1.setBackground(Color.WHITE);
		panel_1_2_1_1_1_1_1.setLayout(null);
		panel_1_2_1_1_1_1_1.setBounds(50, 410, 458, 25);
		panel.add(panel_1_2_1_1_1_1_1);

		final JxLabel npiLabel_1_1 = new JxLabel();npiLabel_1_1.setTheme(blueOverWhiteTheme);
		npiLabel_1_1.setForeground(DEF_COL);
		npiLabel_1_1.setText("Medicaid#");
		npiLabel_1_1.setBounds(0, 0, 86, 21);
		panel_1_2_1_1_1_1_1.add(npiLabel_1_1);

		txtMedicaid = new JxText();txtMedicaid.setTheme(blueOverWhiteTheme);
		presentationMap.put("medicade", txtMedicaid);
		txtMedicaid.setBounds(92, 0, 356, 21); 
		panel_1_2_1_1_1_1_1.add(txtMedicaid);

		final JxPanel jxPanel = new JxPanel();
		jxPanel.setBackground(Color.WHITE);
		jxPanel.setLayout(null);
		jxPanel.setBounds(51, 477, 428, 167);
		panel.add(jxPanel);

		final JxLabel logoImageUploadJxLabel = new JxLabel();
		logoImageUploadJxLabel.setForeground(DEF_COL);
		logoImageUploadJxLabel.setTheme(blueOverWhiteTheme);
		logoImageUploadJxLabel.setText("Logo Image Upload"); 
		logoImageUploadJxLabel.setBounds(0, 0, 116, 21);
		jxPanel.add(logoImageUploadJxLabel);

	    panel_Image = new medrex.client.PanelImage();
		panel_Image.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		panel_Image.setArc(0.4f);
		panel_Image.setForeground(DEF_COL);
		panel_Image.setCurvedView(true);
		panel_Image.setBounds(133, 0, 128, 128);
		jxPanel.add(panel_Image);

		final JxButton btnPhotoButton = new JxButton();
		btnPhotoButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				 

				JFileChooser fileChooser = new JFileChooser();
				 
				fileChooser.showOpenDialog(PanelNursingHomeInfo.this);
				File jpgFile = fileChooser.getSelectedFile();
				 
				if (jpgFile != null) {
					long imageSize = jpgFile.length();
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
									panel_Image.setImage(image);
									panel_Image.repaint();
								}

							} catch (IOException e1) {
								e1.printStackTrace();
							}
							panel_Image.repaint();
						}
					}
					// } else {
					// JOptionPane.showMessageDialog(photoButton,
					// "Image size can not more than 42 Kb.");
					// }
				}

			}
		});


		btnPhotoButton.setText("PHOTO ");
		btnPhotoButton.setForeground(DEF_COL);
		btnPhotoButton.setBounds(133, 133, 127, 20);
		jxPanel.add(btnPhotoButton);

		final JxLabel lblErrorDisplay = new JxLabel();
		lblErrorDisplay.setForeground(new Color(255, 0, 0));
		lblErrorDisplay.setFont(new Font("Arial", Font.PLAIN, 14));
		lblErrorDisplay.setText("");
		lblErrorDisplay.setBounds(51, 52, 467, 25);
		panel.add(lblErrorDisplay);
		
		final JxPanel panel_1_2_1_1_1_1_1_1 = new JxPanel();
		panel_1_2_1_1_1_1_1_1.setLayout(null);
		panel_1_2_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_1_2_1_1_1_1_1_1.setBounds(51, 441, 458, 25);
		panel.add(panel_1_2_1_1_1_1_1_1);
		
		lblFacility = new JxLabel();
		lblFacility.setForeground(DEF_COL);
		lblFacility.setText("Facility");
		lblFacility.setBounds(0, 0, 86, 21);
		panel_1_2_1_1_1_1_1_1.add(lblFacility);

		txtFacility = new JxText();
		txtFacility.setBounds(92, 0, 356, 21);
		panel_1_2_1_1_1_1_1_1.add(txtFacility);
	    //presentationModel.validateAll();
		
		doLoad();
		Iterator ii=presentationMap.keySet().iterator();
		while (ii.hasNext()) {
			String object = (String) ii.next();
			 
		}
		
		presentationModel = new PresentationModel(presentationMap,NursingHome.class,this,lblErrorDisplay);

		

		
	}

	private void doLoad() {
		NursingHome nh = null;
		try {
			nh = MedrexClientManager.getInstance().getNursingHomeInfo(1);
		} catch (RemoteException e) {
		 
			e.printStackTrace();
		} catch (MedrexException e) {
			 
			e.printStackTrace();
		}
		if (nh == null) {
			txtCompanyName.setText("");
		 
			//txtAreaAddress.setText("");
			txtAddresss.setText("");
			txtCity.setText("");
			cmbState.setSelectedItem(null);
			 txtZip.setText("");
		   txtPhone.setNumber("");
		    txtFax.setNumber("");
		   txtEMail.setText("");
		   txtWebsite.setText("");
		   txtEIN.setText("");
		   txtNPI.setText("");
		   txtMedicare.setText("");
		   txtMedicaid.setText("");
			txtFacility.setText("");
			
			
		      } else {
		    	  
			txtCompanyName.setText(nh.getName());
			txtAddresss.setText(nh.getAddress());
			//txtAreaAddress.setText(nh.getAddress());
			txtCity.setText(nh.getNpi());
			cmbState.setSelectedItem(nh.getState());
		    txtZip.setText(nh.getZip());
		   txtPhone.setNumber(nh.getPhone());
		    txtFax.setNumber(nh.getFax());
		   txtEMail.setText(nh.getEmail());
		   txtWebsite.setText(nh.getWebsite());
		   txtEIN.setText(nh.getEin());
		   txtNPI.setText(nh.getNpi());
		   txtMedicare.setText(nh.getMedicare());
		   txtMedicaid.setText(nh.getMedicade());
		 
		   
		   txtFacility.setText(nh.getFacility());
		   
			ImageIcon ic = nh.getImg();
			if (ic != null) {
				panel_Image.setImage(Utils.getBufferedImageFromImageicon(nh
						.getImg()));
			} else {
				 
				panel_Image.setImage(null);
			}
			
			
			
		}
	}

	
	protected boolean doSave() {
		NursingHome nh = null;
		try {
			nh = MedrexClientManager.getInstance().getNursingHomeInfo(1);
		} catch (RemoteException e1) {
			 
			e1.printStackTrace();
		} catch (MedrexException e1) {
		 
			e1.printStackTrace();
		}
		if(nh == null) {
			nh = new NursingHome();
		}
//		nh.setSerial(1);
		nh.setName(txtCompanyName.getText());
		nh.setFacility(txtFacility.getText());
		
		//nh.setAddress(txtAreaAddress.getText());
		nh.setAddress(txtAddresss.getText().trim());
		nh.setCity(txtCity.getText().trim());
		 // retrive the value from combobox of state
		
		if (cmbState.getSelectedItem() == null) {
			nh.setState(null);
		} else {
			nh.setState((State) cmbState.getSelectedItem());
		}
		
		 nh.setZip(txtZip.getText().trim());
		 nh.setPhone(txtPhone.getNumber());
		 nh.setFax(txtFax.getNumber());
		 nh.setEmail(txtEMail.getText());
		 nh.setWebsite(txtWebsite.getText());
		 nh.setNpi(txtNPI.getText());
		 nh.setMedicare(txtMedicare.getText());
		 nh.setMedicade(txtMedicaid.getText());
		 nh.setImg(imageIcon);
		 
		 
		 try {
		
			MedrexClientManager.getInstance().insertOrUpdateNursinhHome(nh);
			/* imageIcon = nh.getImg();
			 String dir = "data/nursinghome/" + "1" +"";
			 medrex.server.util.Utils.saveImageTo("main.jpg", dir, imageIcon,110,300);*/
		} catch (RemoteException e) {
		 
			e.printStackTrace();
		} catch (MedrexException e) {
	 
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public List<String> doValidate(Object bean, String field) {
		
		NursingHome nh = (NursingHome) bean;
		MedrexValidation medrexValidation = new MedrexValidation();
		errorList = new ArrayList();
		
	 

		if (field.equals("name") || field.equals("")) {
			medrexValidation.checkRangeValidation(nh.getName(), 3, 25,
					"Company Name", errorList);
		}
		
		if (field.equals("address") || field.equals("")) {
			medrexValidation.checkRangeValidation(nh.getAddress(), 5, 50,
					"Address", errorList);
		}
		
		if (field.equals("city") || field.equals("")) {
			medrexValidation.checkRangeValidation(nh.getCity(), 3, 25, "City",
					errorList);
		}
		
		if (field.equals("state") || field.equals("")) {
			if(nh.getState()!=null){
				medrexValidation.checkRequiredValidation(nh.getState().toString().trim(),
						"State", errorList);
			}
			
		}
		
		if (field.equals("zip") || field.equals("")) {
			medrexValidation.checkRangeValidation(nh.getZip(), 5, 10, "Zip",
					errorList);
		}
		
		if (field.equals("phone") || field.equals("")) {
			if(!nh.getPhone().equals("")){
				medrexValidation.checkSizeValidation(nh.getPhone(), 10, 10,
						"Phone", errorList);
			}
			
		}
		
		if (field.equals("fax") || field.equals("")) {
			if(!nh.getPhone().equals("")){
				medrexValidation.checkSizeValidation(nh.getFax(), 10, 10,
						"Fax", errorList);
			}
			
		}
		
		if(field.equals("email")|| field.equals("")){
			 
		   medrexValidation.checkEmailValidation(nh.getEmail(), "E-Mail", errorList);
			 
		}
		
		if(field.equals("website")|| field.equals("")){
			 
			   medrexValidation.checkWebsiteValidation(nh.getWebsite(), "Website", errorList);
				 
			}
	    
		
		return errorList;
	}
	
	


}
