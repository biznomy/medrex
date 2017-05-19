package medrex.client.main.resident.payerInfoNew;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

import medrex.client.PanelImage;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.utils.FieldFormatter;
import medrex.client.utils.MsgBox;
import medrex.client.utils.PresentationModel;
import medrex.commons.enums.GuiModes;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.resident.ResidentPayerNew;

import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.toedter.calendar.JDateChooser;

public class PanelResidentInfoPayerAdd extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2959634230536513606L;
	private JPanel panel_3;
	private JPanel panel_2;
	private JFormattedTextField txtFullDays;
	private JFormattedTextField txtCoInsDays;
	private JLabel startDateLabel;
	private JLabel errorLabel;
	private JPanel errorPanel;
	private JxComboBox cmbInsurance;

	private JDateChooser dateStart;
	private JDateChooser dateEnd;

	public Map myMap;
	private PresentationModel presentationModel;

	private ControllerResidentInfoPayer residentInfoPayerController;
	private ControllerResidentInfoPayerMain residentInfoPayerMainController;

	private static final Color DEF_COLOR = new Color(49, 104, 127);

	private List<String> arrInfo = new ArrayList<String>();

	/**
	 * Create the panel
	 */

	public PanelResidentInfoPayerAdd(
			final ControllerResidentInfoPayer residentInfoPayerController,
			String medicaidNum, String medicalRecordNum, String insurance,
			String secondaryInsurance, boolean boolPrivate, int insCount) {
		super();
		setLayout(new BorderLayout());

		myMap = new HashMap();
		this.residentInfoPayerController = residentInfoPayerController;

		setBackground(Color.WHITE);
		setBounds(1100, 100, 402, 249);

		arrInfo.add(" ");
		if (boolPrivate) {
			arrInfo.add("Private");
		}
		if (medicaidNum != null && !medicaidNum.equals("")) {
			arrInfo.add("Medicaid");
		}
		if (medicalRecordNum != null && !medicalRecordNum.equals("")) {
			arrInfo.add("Medicare");
		}
		if (insurance != null && !insurance.equals("")
				&& !insurance.equals("null") && !insurance.equals(" ")) {
			arrInfo.add("Insurance");
		}

		if (secondaryInsurance != null && !secondaryInsurance.equals("")
				&& !secondaryInsurance.equals("null")
				&& !secondaryInsurance.equals(" ")) {
			arrInfo.add("secondaryInsurance");
		}

		Date currentDate = new java.util.Date();
		Date endDate = MedrexClientManager.getServerTime();
		if (insCount == 0) {
			endDate.setDate(currentDate.getDate() + 100);
		} else {
			endDate.setDate(currentDate.getDate() + insCount);
		}

		final PanelImage panel = new PanelImage();
		panel.setCurvedView(true);
		panel.setArc(0.6f);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		add(panel);

		final JPanel panel_6 = new JPanel();
		panel_6.setLayout(new FlowLayout());
		panel_6.setBackground(Color.WHITE);
		add(panel_6);

		errorPanel = new JPanel();
		errorPanel.setPreferredSize(new Dimension(380, 20));
		panel_6.add(errorPanel);
		errorPanel.setLayout(null);
		errorPanel.setBackground(Color.WHITE);

		errorLabel = new JLabel();
		errorLabel.setBounds(6, -4, 372, 20);
		errorPanel.add(errorLabel);
		errorLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		errorLabel.setForeground(Color.RED);

		final JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(380, 25));
		panel_6.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);

		final JLabel payerTypeLabel = new JLabel();
		payerTypeLabel.setBounds(4, 2, 118, 16);
		panel_1.add(payerTypeLabel);
		payerTypeLabel.setForeground(DEF_COLOR);
		payerTypeLabel.setFont(new Font("", Font.BOLD, 12));
		payerTypeLabel.setText("INFO");

		cmbInsurance = new JxComboBox();
		cmbInsurance.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				if (cmbInsurance.getSelectedItem().toString().equalsIgnoreCase(
						"Medicare")) {
					panel_2.setVisible(true);
					panel_3.setVisible(true);

					repaint();
					myMap.put("fulldays", txtFullDays);
					myMap.put("coinsdate", txtCoInsDays);
					presentationModel = new PresentationModel(myMap,
							ResidentPayerNew.class,
							residentInfoPayerController, errorLabel);

					presentationModel.validateAll();
				} else {
					repaint();
					panel_2.setVisible(false);
					panel_3.setVisible(false);
					myMap.remove("fulldays");
					myMap.remove("coinsdate");
				}
			}
		});
		cmbInsurance.setBounds(134, 2, 201, 24);
		panel_1.add(cmbInsurance);
		myMap.put("insuranceType", cmbInsurance);
		cmbInsurance.setArc(0.4f);
		cmbInsurance.setBackground(Color.WHITE);
		cmbInsurance.setForeground(DEF_COLOR);
		cmbInsurance.setModel(new javax.swing.DefaultComboBoxModel(arrInfo
				.toArray()));

		panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(380, 20));
		panel_6.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setVisible(false);

		final JLabel fullLabel = new JLabel();
		fullLabel.setBounds(4, 3, 84, 14);
		panel_2.add(fullLabel);
		fullLabel.setFont(new Font("", Font.BOLD, 12));
		fullLabel.setForeground(DEF_COLOR);
		fullLabel.setText("FULL DAYS");
		//

		txtFullDays = new JFormattedTextField(FieldFormatter.MAX2);
		txtFullDays.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(final KeyEvent arg0) {
				addDate();
			}
		});
		// myMap.put("fulldays", txtFullDays);
		txtFullDays.setForeground(DEF_COLOR);
		txtFullDays.setBounds(134, 1, 201, 18);
		panel_2.add(txtFullDays);

		panel_3 = new JPanel();
		panel_3.setPreferredSize(new Dimension(380, 20));
		panel_6.add(panel_3);

		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setVisible(false);

		final JLabel coLabel = new JLabel();
		coLabel.setBounds(4, 3, 96, 14);
		panel_3.add(coLabel);
		coLabel.setFont(new Font("", Font.BOLD, 12));
		coLabel.setForeground(DEF_COLOR);
		coLabel.setText("CO INS. DAYS");

		txtCoInsDays = new JFormattedTextField(FieldFormatter.MAX2);
		txtCoInsDays.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(final KeyEvent arg0) {
				addDate();
			}
		});
		txtCoInsDays.setBounds(134, 1, 201, 18);
		txtCoInsDays.setForeground(DEF_COLOR);
		panel_3.add(txtCoInsDays);
		// myMap.put("coinsdate", txtCoInsDays);

		final JPanel panel_4 = new JPanel();
		panel_4.setPreferredSize(new Dimension(380, 20));
		panel_6.add(panel_4);
		panel_4.setBackground(Color.WHITE);
		panel_4.setLayout(null);

		startDateLabel = new JLabel();
		startDateLabel.setBounds(4, 2, 118, 16);
		panel_4.add(startDateLabel);
		startDateLabel.setForeground(DEF_COLOR);
		startDateLabel.setFont(new Font("", Font.BOLD, 12));
		startDateLabel.setText("START DATE");

		dateStart = new JDateChooser();
		dateStart.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(final PropertyChangeEvent arg0) {
				addDate();

			}
		});

		dateStart.setBounds(134, 1, 199, 20);
		dateStart.setForeground(DEF_COLOR);

		panel_4.add(dateStart);
		myMap.put("dateStart", dateStart);
		dateStart.setBackground(Color.WHITE);
		dateStart.setForeground(DEF_COLOR);
		dateStart.setDateFormatString("MM/dd/yyyy");

		final JPanel panel_5 = new JPanel();
		panel_5.setPreferredSize(new Dimension(380, 25));
		panel_6.add(panel_5);
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);

		final JLabel endDateLabel = new JLabel();
		endDateLabel.setBounds(4, 1, 118, 16);
		panel_5.add(endDateLabel);
		endDateLabel.setForeground(DEF_COLOR);
		endDateLabel.setFont(new Font("", Font.BOLD, 12));
		endDateLabel.setText("END DATE");

		dateEnd = new JDateChooser();
		dateEnd.setBounds(134, 3, 201, 20);
		panel_5.add(dateEnd);
		myMap.put("endDate", dateEnd);
		dateEnd.setBackground(Color.WHITE);
		dateEnd.setForeground(DEF_COLOR);
		dateEnd.setDateFormatString("MM/dd/yyyy");

		dateEnd.setMinSelectableDate(currentDate);
		dateEnd.setMaxSelectableDate(endDate);

		final JPanel panel_7 = new JPanel();
		panel_7.setPreferredSize(new Dimension(380, 40));
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_6.add(panel_7);

		final JxButton btnSave = new JxButton();
		btnSave.setBounds(47, 7, 83, 26);
		panel_7.add(btnSave);
		btnSave.setArc(0.4f);
		btnSave.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnSave.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnSave.setFont(new Font("", Font.BOLD, 12));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (doSave()) {
					close();
				}

			}
		});
		btnSave.setText("Save");

		final JxButton btnCancel = new JxButton();
		btnCancel.setBounds(221, 7, 83, 26);
		panel_7.add(btnCancel);
		btnCancel.setArc(0.4f);
		btnCancel.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnCancel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		btnCancel.setText("Cancel");
		presentationModel = new PresentationModel(myMap,
				ResidentPayerNew.class, residentInfoPayerController, errorLabel);

		presentationModel.validateAll();

		updateData();

	}

	public void updateData() {
		if (residentInfoPayerController.getSelectedPayer() != -1) {
			ResidentPayerNew rp = residentInfoPayerController
					.getCurrentResidentPayer();
			cmbInsurance.setSelectedItem(rp.getInsuranceType() + "");
			// cmbInsurance.se
			dateStart.setDate(rp.getDateStart());
			dateEnd.setDate(rp.getEndDate());
			txtFullDays.setText(rp.getFulldays() + "");
			txtCoInsDays.setText(rp.getCoinsdate() + "");
		}
		presentationModel.validateAll();
	}

	public void addDate() {
		if ((!txtFullDays.getText().equalsIgnoreCase(""))
				&& (!txtCoInsDays.getText().equalsIgnoreCase(""))
				&& (dateStart.getDate() != null)) {
			int fullday = Integer.parseInt(txtFullDays.getText());
			int coinsday = Integer.parseInt(txtCoInsDays.getText());

			int totalDays = 0;
			totalDays = fullday + coinsday;

			Date startDate = dateStart.getDate();

			Calendar c = Calendar.getInstance();
			c.setTime(startDate);
			c.add(Calendar.DATE, totalDays);
			dateEnd.setDate(c.getTime());
			dateEnd.setEnabled(false);

			// System.out.println("Full days is **********" + c.getTime());
			// System.out.println("Full days is **********" + coinsday);
			// System.out.println("Full days is **********" + fullday);
			//	
		}
	}

	public boolean doSave() {
		ResidentPayerNew rp = new ResidentPayerNew();

		rp.setInsuranceType(cmbInsurance.getSelectedItem() + "");
		rp.setDateStart(dateStart.getDate());
		rp.setEndDate(dateEnd.getDate());
		// if(txtFullDays.getText()!= null){

		// }
		// if(txtCoInsDays.getText()!=null){

		// }
		System.out.println("rp.getInsuranceType(): " + rp.getInsuranceType()
				+ " : " + txtFullDays.getText());
		if (rp.getInsuranceType().equalsIgnoreCase("Medicare")) {
			System.out.println("rp : " + rp.getInsuranceType());
			rp.setFulldays(txtFullDays.getText());
			rp.setCoinsdate(txtCoInsDays.getText());
		} else {
			rp.setFulldays(" ");
			rp.setCoinsdate(" ");
		}
		if (cmbInsurance.getSelectedItem().toString().equalsIgnoreCase(
				"Medicare")) {

		}

		List errors = residentInfoPayerController.doValidate(rp, "");
		if (errors.size() > 0) {
			MsgBox m = new MsgBox();
			Iterator itr = errors.iterator();
			String strError = "";
			while (itr.hasNext()) {
				strError += (String) itr.next() + "\n";
			}
			m.addPrompt(strError);
			m.setTitle("Error to save payer Info");
			m.setVisible(true);
			return false;
		} else {
			residentInfoPayerController.insertOrUpdateResidentPayer(rp);
			return true;
		}

	}

	@Override
	public String getTitle() {
		return "Add New Info";
	}

}
