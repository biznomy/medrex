package medrex.client.main.admission;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;
import javax.swing.text.JTextComponent;

import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.vo.admission.ResidentAssessmentFormPage19Col;

import com.sX.frameFactory.FrameFactory;
import com.toedter.calendar.JDateChooser;

public class PanelResidentAssessmentFormPageCol19 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2353231531378580386L;
	private JTextField txtNurseInitial;
	private JTextField txtRtLowerExtremity;
	private JTextField txtRtUpperExtrimity;
	private JTextField txtLtLowerExtrimity;
	private JTextField txtLtUpperExtrimity;
	private JTextField txtNoSpeech;
	private JTextField txtIncomprehensibleSpeech;
	private JTextField txtInappropriateWords;
	private JTextField txtConfusedConversation;
	private JTextField txtSpeechOriented;
	private JTextField txtComatose;
	private JTextField txtStuporous;
	private JTextField txtDrowsy;
	private JTextField txtAlert;
	private JTextField txtDoesNotOpen;
	private JTextField txtOpensToPain;
	private JTextField txtOpensToSpeech;
	private JTextField txtOpenSpontaneously;
	private JTextField txtLPupilReact;
	private JTextField txtLPupilSize;
	private JTextField txtRPupilReact;
	private JTextField txtRPupilSize;
	private JTextField txtIrregular;
	private JTextField txtShallow;
	private JTextField txtNormal;
	private JTextField txtRespiration;
	private JTextField txtPulse;
	private JTextField txtTemprature;
	private JTextField txtBloodPressure;
	private JTextField txtTime;
	private JDateChooser dcAssessmentDate;
	int serial;
	int key;

	public PanelResidentAssessmentFormPageCol19(int num) {
		super();
		setBackground(Color.WHITE);
		setLayout(null);

		final JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 360, 992);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(1, 1, 46, 21);
		panel.add(panel_1);

		/*
		 * final JButton btnShowDialog = new JButton();
		 * btnShowDialog.addActionListener(new ActionListener() { public void
		 * actionPerformed(final ActionEvent arg0) {
		 * Global.currentResidentAssessmentFormPage19Col=getValueObject();
		 * openDialog(); }
		 * 
		 * });
		 * 
		 * btnShowDialog.setBounds(1, 1, 46, 20); btnShowDialog.setText("+");
		 * panel_1.add(btnShowDialog);
		 */

		final JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(1, 22, 354, 23);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);

		dcAssessmentDate = new JDateChooser();
		dcAssessmentDate.setDateFormatString("MM/dd/yyyy");
		dcAssessmentDate.setBackground(Color.WHITE);
		((JTextComponent) dcAssessmentDate.getComponent(1)).setFocusable(false);
		dcAssessmentDate.remove(dcAssessmentDate.getComponent(0));
		dcAssessmentDate.setBounds(2, 0, 342, 19);
		panel_1_1.add(dcAssessmentDate);
		// dcAssessmentDate.setEnabled(false);

		final JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBounds(1, 45, 354, 23);
		panel.add(panel_1_1_1);

		txtTime = new JTextField();
		txtTime.setBackground(Color.WHITE);
		txtTime.setEditable(false);
		txtTime.setBounds(2, 0, 342, 20);
		panel_1_1_1.add(txtTime);

		final JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBounds(1, 73, 354, 28);
		panel.add(panel_1_1_1_1);

		txtBloodPressure = new JTextField();
		txtBloodPressure.setBackground(Color.WHITE);
		txtBloodPressure.setEditable(false);
		txtBloodPressure.setBounds(2, 4, 342, 21);
		panel_1_1_1_1.add(txtBloodPressure);

		final JPanel panel_1_1_1_2 = new JPanel();
		panel_1_1_1_2.setBackground(Color.WHITE);
		panel_1_1_1_2.setLayout(null);
		panel_1_1_1_2.setBounds(1, 105, 354, 28);
		panel.add(panel_1_1_1_2);

		txtTemprature = new JTextField();
		txtTemprature.setBackground(Color.WHITE);
		txtTemprature.setEditable(false);
		txtTemprature.setBounds(2, 0, 342, 21);
		panel_1_1_1_2.add(txtTemprature);

		final JPanel panel_1_1_1_3 = new JPanel();
		panel_1_1_1_3.setBackground(Color.WHITE);
		panel_1_1_1_3.setLayout(null);
		panel_1_1_1_3.setBounds(1, 137, 354, 23);
		panel.add(panel_1_1_1_3);

		txtPulse = new JTextField();
		txtPulse.setBackground(Color.WHITE);
		txtPulse.setEditable(false);
		txtPulse.setBounds(2, 0, 342, 20);
		panel_1_1_1_3.add(txtPulse);

		final JPanel panel_1_1_1_4 = new JPanel();
		panel_1_1_1_4.setBackground(Color.WHITE);
		panel_1_1_1_4.setLayout(null);
		panel_1_1_1_4.setBounds(1, 160, 354, 29);
		panel.add(panel_1_1_1_4);

		txtRespiration = new JTextField();
		txtRespiration.setBackground(Color.WHITE);
		txtRespiration.setEditable(false);
		txtRespiration.setBounds(2, 3, 342, 20);
		panel_1_1_1_4.add(txtRespiration);

		final JPanel panel_1_1_1_5 = new JPanel();
		panel_1_1_1_5.setBackground(Color.WHITE);
		panel_1_1_1_5.setLayout(null);
		panel_1_1_1_5.setBounds(1, 195, 354, 32);
		panel.add(panel_1_1_1_5);

		txtNormal = new JTextField();
		txtNormal.setBackground(Color.WHITE);
		txtNormal.setEditable(false);
		txtNormal.setBounds(2, 0, 342, 22);
		panel_1_1_1_5.add(txtNormal);

		final JPanel panel_1_1_1_6 = new JPanel();
		panel_1_1_1_6.setBackground(Color.WHITE);
		panel_1_1_1_6.setLayout(null);
		panel_1_1_1_6.setBounds(1, 222, 354, 35);
		panel.add(panel_1_1_1_6);

		txtShallow = new JTextField();
		txtShallow.setBackground(Color.WHITE);
		txtShallow.setEditable(false);
		txtShallow.setBounds(2, 5, 18, 20);
		panel_1_1_1_6.add(txtShallow);

		txtIrregular = new JTextField();
		txtIrregular.setBackground(Color.WHITE);
		txtIrregular.setEditable(false);
		txtIrregular.setBounds(24, 5, 18, 20);
		panel_1_1_1_6.add(txtIrregular);

		final JPanel panel_1_1_1_7 = new JPanel();
		panel_1_1_1_7.setBackground(Color.WHITE);
		panel_1_1_1_7.setLayout(null);
		panel_1_1_1_7.setBounds(1, 262, 354, 32);
		panel.add(panel_1_1_1_7);

		txtRPupilSize = new JTextField();
		txtRPupilSize.setBackground(Color.WHITE);
		txtRPupilSize.setEditable(false);
		txtRPupilSize.setBounds(2, 5, 18, 20);
		panel_1_1_1_7.add(txtRPupilSize);

		txtRPupilReact = new JTextField();
		txtRPupilReact.setBackground(Color.WHITE);
		txtRPupilReact.setEditable(false);
		txtRPupilReact.setBounds(25, 5, 18, 20);
		panel_1_1_1_7.add(txtRPupilReact);

		final JPanel panel_1_1_1_8 = new JPanel();
		panel_1_1_1_8.setBackground(Color.WHITE);
		panel_1_1_1_8.setLayout(null);
		panel_1_1_1_8.setBounds(1, 292, 354, 34);
		panel.add(panel_1_1_1_8);

		txtLPupilSize = new JTextField();
		txtLPupilSize.setBackground(Color.WHITE);
		txtLPupilSize.setEditable(false);
		txtLPupilSize.setBounds(2, 10, 18, 20);
		panel_1_1_1_8.add(txtLPupilSize);

		txtLPupilReact = new JTextField();
		txtLPupilReact.setBackground(Color.WHITE);
		txtLPupilReact.setEditable(false);
		txtLPupilReact.setBounds(25, 10, 18, 20);
		panel_1_1_1_8.add(txtLPupilReact);

		final JPanel panel_1_1_1_12 = new JPanel();
		panel_1_1_1_12.setBackground(Color.WHITE);
		panel_1_1_1_12.setLayout(null);
		panel_1_1_1_12.setBounds(1, 406, 354, 29);
		panel.add(panel_1_1_1_12);

		txtOpenSpontaneously = new JTextField();
		txtOpenSpontaneously.setBackground(Color.WHITE);
		txtOpenSpontaneously.setEditable(false);
		txtOpenSpontaneously.setBounds(2, 0, 41, 21);
		panel_1_1_1_12.add(txtOpenSpontaneously);

		final JPanel panel_1_1_1_13 = new JPanel();
		panel_1_1_1_13.setBackground(Color.WHITE);
		panel_1_1_1_13.setLayout(null);
		panel_1_1_1_13.setBounds(1, 435, 354, 29);
		panel.add(panel_1_1_1_13);

		txtOpensToSpeech = new JTextField();
		txtOpensToSpeech.setBackground(Color.WHITE);
		txtOpensToSpeech.setEditable(false);
		txtOpensToSpeech.setBounds(2, 0, 41, 21);
		panel_1_1_1_13.add(txtOpensToSpeech);

		final JPanel panel_1_1_1_14 = new JPanel();
		panel_1_1_1_14.setBackground(Color.WHITE);
		panel_1_1_1_14.setLayout(null);
		panel_1_1_1_14.setBounds(1, 464, 354, 29);
		panel.add(panel_1_1_1_14);

		txtOpensToPain = new JTextField();
		txtOpensToPain.setBackground(Color.WHITE);
		txtOpensToPain.setEditable(false);
		txtOpensToPain.setBounds(2, 0, 41, 21);
		panel_1_1_1_14.add(txtOpensToPain);

		final JPanel panel_1_1_1_15 = new JPanel();
		panel_1_1_1_15.setBackground(Color.WHITE);
		panel_1_1_1_15.setLayout(null);
		panel_1_1_1_15.setBounds(1, 493, 46, 26);
		panel.add(panel_1_1_1_15);

		txtDoesNotOpen = new JTextField();
		txtDoesNotOpen.setBackground(Color.WHITE);
		txtDoesNotOpen.setEditable(false);
		txtDoesNotOpen.setBounds(2, 0, 41, 21);
		panel_1_1_1_15.add(txtDoesNotOpen);

		final JPanel panel_1_1_1_16 = new JPanel();
		panel_1_1_1_16.setBackground(Color.WHITE);
		panel_1_1_1_16.setLayout(null);
		panel_1_1_1_16.setBounds(1, 520, 46, 24);
		panel.add(panel_1_1_1_16);

		txtAlert = new JTextField();
		txtAlert.setBackground(Color.WHITE);
		txtAlert.setEditable(false);
		txtAlert.setBounds(2, 0, 41, 21);
		panel_1_1_1_16.add(txtAlert);

		final JPanel panel_1_1_1_17 = new JPanel();
		panel_1_1_1_17.setBackground(Color.WHITE);
		panel_1_1_1_17.setLayout(null);
		panel_1_1_1_17.setBounds(1, 548, 46, 24);
		panel.add(panel_1_1_1_17);

		txtDrowsy = new JTextField();
		txtDrowsy.setBackground(Color.WHITE);
		txtDrowsy.setEditable(false);
		txtDrowsy.setBounds(2, 0, 41, 21);
		panel_1_1_1_17.add(txtDrowsy);

		final JPanel panel_1_1_1_18 = new JPanel();
		panel_1_1_1_18.setBackground(Color.WHITE);
		panel_1_1_1_18.setLayout(null);
		panel_1_1_1_18.setBounds(1, 576, 46, 29);
		panel.add(panel_1_1_1_18);

		txtStuporous = new JTextField();
		txtStuporous.setBackground(Color.WHITE);
		txtStuporous.setEditable(false);
		txtStuporous.setBounds(2, 0, 41, 21);
		panel_1_1_1_18.add(txtStuporous);

		final JPanel panel_1_1_1_19 = new JPanel();
		panel_1_1_1_19.setBackground(Color.WHITE);
		panel_1_1_1_19.setLayout(null);
		panel_1_1_1_19.setBounds(1, 605, 46, 29);
		panel.add(panel_1_1_1_19);

		txtComatose = new JTextField();
		txtComatose.setBackground(Color.WHITE);
		txtComatose.setEditable(false);
		txtComatose.setBounds(2, 0, 41, 21);
		panel_1_1_1_19.add(txtComatose);

		final JPanel panel_1_1_1_20 = new JPanel();
		panel_1_1_1_20.setBackground(Color.WHITE);
		panel_1_1_1_20.setLayout(null);
		panel_1_1_1_20.setBounds(1, 638, 46, 29);
		panel.add(panel_1_1_1_20);

		txtSpeechOriented = new JTextField();
		txtSpeechOriented.setBackground(Color.WHITE);
		txtSpeechOriented.setEditable(false);
		txtSpeechOriented.setBounds(2, 0, 41, 21);
		panel_1_1_1_20.add(txtSpeechOriented);

		final JPanel panel_1_1_1_21 = new JPanel();
		panel_1_1_1_21.setBackground(Color.WHITE);
		panel_1_1_1_21.setLayout(null);
		panel_1_1_1_21.setBounds(1, 667, 46, 29);
		panel.add(panel_1_1_1_21);

		txtConfusedConversation = new JTextField();
		txtConfusedConversation.setBackground(Color.WHITE);
		txtConfusedConversation.setEditable(false);
		txtConfusedConversation.setBounds(2, 0, 41, 21);
		panel_1_1_1_21.add(txtConfusedConversation);

		final JPanel panel_1_1_1_22 = new JPanel();
		panel_1_1_1_22.setBackground(Color.WHITE);
		panel_1_1_1_22.setLayout(null);
		panel_1_1_1_22.setBounds(1, 696, 46, 29);
		panel.add(panel_1_1_1_22);

		txtInappropriateWords = new JTextField();
		txtInappropriateWords.setBackground(Color.WHITE);
		txtInappropriateWords.setEditable(false);
		txtInappropriateWords.setBounds(2, 0, 41, 21);
		panel_1_1_1_22.add(txtInappropriateWords);

		final JPanel panel_1_1_1_23 = new JPanel();
		panel_1_1_1_23.setBackground(Color.WHITE);
		panel_1_1_1_23.setLayout(null);
		panel_1_1_1_23.setBounds(1, 725, 46, 29);
		panel.add(panel_1_1_1_23);

		txtIncomprehensibleSpeech = new JTextField();
		txtIncomprehensibleSpeech.setBackground(Color.WHITE);
		txtIncomprehensibleSpeech.setEditable(false);
		txtIncomprehensibleSpeech.setBounds(2, 0, 41, 21);
		panel_1_1_1_23.add(txtIncomprehensibleSpeech);

		final JPanel panel_1_1_1_24 = new JPanel();
		panel_1_1_1_24.setBackground(Color.WHITE);
		panel_1_1_1_24.setLayout(null);
		panel_1_1_1_24.setBounds(1, 754, 46, 29);
		panel.add(panel_1_1_1_24);

		txtNoSpeech = new JTextField();
		txtNoSpeech.setBackground(Color.WHITE);
		txtNoSpeech.setEditable(false);
		txtNoSpeech.setBounds(2, 0, 41, 21);
		panel_1_1_1_24.add(txtNoSpeech);

		final JPanel panel_1_1_1_25 = new JPanel();
		panel_1_1_1_25.setBackground(Color.WHITE);
		panel_1_1_1_25.setLayout(null);
		panel_1_1_1_25.setBounds(1, 783, 46, 29);
		panel.add(panel_1_1_1_25);

		txtLtUpperExtrimity = new JTextField();
		txtLtUpperExtrimity.setBackground(Color.WHITE);
		txtLtUpperExtrimity.setEditable(false);
		txtLtUpperExtrimity.setBounds(2, 0, 41, 21);
		panel_1_1_1_25.add(txtLtUpperExtrimity);

		final JPanel panel_1_1_1_26 = new JPanel();
		panel_1_1_1_26.setBackground(Color.WHITE);
		panel_1_1_1_26.setLayout(null);
		panel_1_1_1_26.setBounds(1, 812, 46, 29);
		panel.add(panel_1_1_1_26);

		txtLtLowerExtrimity = new JTextField();
		txtLtLowerExtrimity.setBackground(Color.WHITE);
		txtLtLowerExtrimity.setEditable(false);
		txtLtLowerExtrimity.setBounds(2, 0, 41, 21);
		panel_1_1_1_26.add(txtLtLowerExtrimity);

		final JPanel panel_1_1_1_27 = new JPanel();
		panel_1_1_1_27.setBackground(Color.WHITE);
		panel_1_1_1_27.setLayout(null);
		panel_1_1_1_27.setBounds(1, 841, 46, 29);
		panel.add(panel_1_1_1_27);

		txtRtUpperExtrimity = new JTextField();
		txtRtUpperExtrimity.setBackground(Color.WHITE);
		txtRtUpperExtrimity.setEditable(false);
		txtRtUpperExtrimity.setBounds(2, 0, 41, 21);
		panel_1_1_1_27.add(txtRtUpperExtrimity);

		final JPanel panel_1_1_1_28 = new JPanel();
		panel_1_1_1_28.setBackground(Color.WHITE);
		panel_1_1_1_28.setLayout(null);
		panel_1_1_1_28.setBounds(1, 870, 46, 29);
		panel.add(panel_1_1_1_28);

		txtRtLowerExtremity = new JTextField();
		txtRtLowerExtremity.setBackground(Color.WHITE);
		txtRtLowerExtremity.setEditable(false);
		txtRtLowerExtremity.setBounds(2, 0, 41, 21);
		panel_1_1_1_28.add(txtRtLowerExtremity);

		final JPanel panel_1_1_1_31 = new JPanel();
		panel_1_1_1_31.setBackground(Color.WHITE);
		panel_1_1_1_31.setLayout(null);
		panel_1_1_1_31.setBounds(1, 957, 46, 29);
		panel.add(panel_1_1_1_31);

		txtNurseInitial = new JTextField();
		txtNurseInitial.setBackground(Color.WHITE);
		txtNurseInitial.setEditable(false);
		txtNurseInitial.setBounds(2, 3, 41, 21);
		panel_1_1_1_31.add(txtNurseInitial);

		serial = num;
		updateData(null);
	}

	public void updateData(ResidentAssessmentFormPage19Col col) {
		setValueObject(col);
	}

	private ResidentAssessmentFormPage19Col getValueObject() {
		ResidentAssessmentFormPage19Col col = new ResidentAssessmentFormPage19Col();
		if (dcAssessmentDate.getDate() == null && txtTime.getText().equals("")
				&& txtBloodPressure.getText().equals("")
				&& txtTemprature.getText().equals("")
				&& txtPulse.getText().equals("")
				&& txtRespiration.getText().equals("")
				&& txtNormal.getText().equals("")
				&& txtShallow.getText().equals("")
				&& txtIrregular.getText().equals("")
				&& txtRPupilSize.getText().equals("")
				&& txtRPupilReact.getText().equals("")
				&& txtLPupilSize.getText().equals("")
				&& txtLPupilReact.getText().equals("")
				&& txtOpenSpontaneously.getText().equals("")
				&& txtOpensToSpeech.getText().equals("")
				&& txtOpensToPain.getText().equals("")
				&& txtDoesNotOpen.getText().equals("")
				&& txtAlert.getText().equals("")
				&& txtDrowsy.getText().equals("")
				&& txtStuporous.getText().equals("")
				&& txtComatose.getText().equals("")
				&& txtSpeechOriented.getText().equals("")
				&& txtConfusedConversation.getText().equals("")
				&& txtInappropriateWords.getText().equals("")
				&& txtIncomprehensibleSpeech.getText().equals("")
				&& txtNoSpeech.getText().equals("")
				&& txtLtUpperExtrimity.getText().equals("")
				&& txtLtLowerExtrimity.getText().equals("")
				&& txtRtUpperExtrimity.getText().equals("")
				&& txtRtLowerExtremity.getText().equals("")
				&& txtNurseInitial.getText().equals("")) {
			return null;
		} else {
			col.setSerial(key);
			col.setColSerial(serial);
			col.setFormSerial(Global.currentResidentAssessmentFormPage19Key);
			col.setDateOfAssessment(dcAssessmentDate.getDate());
			col.setTimeOfAssessment(txtTime.getText());
			col.setBloodPressure(txtBloodPressure.getText());
			col.setTemprature(txtTemprature.getText());
			col.setPulse(txtPulse.getText());
			col.setRespiration(txtRespiration.getText());
			col.setNormal(txtNormal.getText());
			col.setShallow(txtShallow.getText());
			col.setIrregular(txtIrregular.getText());
			col.setRPupilSize(txtRPupilSize.getText());
			col.setRPupilReact(txtRPupilReact.getText());
			col.setRPupilSize(txtLPupilSize.getText());
			col.setLPupilReact(txtLPupilReact.getText());
			col.setOpensSpontaneously(txtOpenSpontaneously.getText());
			col.setOpensToSpeech(txtOpensToSpeech.getText());
			col.setOpensToPain(txtOpensToPain.getText());
			col.setDoesNotOpen(txtDoesNotOpen.getText());
			col.setAlert(txtAlert.getText());
			col.setDrowsy(txtDrowsy.getText());
			col.setStuporous(txtStuporous.getText());
			col.setComatose(txtComatose.getText());
			col.setSpeechOriented(txtSpeechOriented.getText());
			col.setConfusedConversation(txtConfusedConversation.getText());
			col.setInappropriateWords(txtInappropriateWords.getText());
			col.setIncomprehensibleSpeech(txtIncomprehensibleSpeech.getText());
			col.setNoSpeech(txtNoSpeech.getText());
			col.setLtUpperExtremity(txtLtUpperExtrimity.getText());
			col.setLtLowerExtremity(txtLtLowerExtrimity.getText());
			col.setRtUpperExtremity(txtRtUpperExtrimity.getText());
			col.setRtLowerExtremity(txtRtLowerExtremity.getText());
			col.setNurseInitial(txtNurseInitial.getText());
			return col;
		}
	}

	private void setValueObject(ResidentAssessmentFormPage19Col col) {
		if (col != null) {
			if (col.getSerial() != 0) {
				key = col.getSerial();
			}
			if (col.getDateOfAssessment() != null) {
				dcAssessmentDate.setDate(col.getDateOfAssessment());
			}
			dcAssessmentDate.setDate(col.getDateOfAssessment());
			txtTime.setText(col.getTimeOfAssessment());
			txtBloodPressure.setText(col.getBloodPressure());
			txtTemprature.setText(col.getTemprature());
			txtPulse.setText(col.getPulse());
			txtRespiration.setText(col.getRespiration());
			txtNormal.setText(col.getNormal());
			txtShallow.setText(col.getShallow());
			txtIrregular.setText(col.getIrregular());
			txtRPupilSize.setText(col.getRPupilSize());
			txtRPupilReact.setText(col.getRPupilReact());
			txtLPupilSize.setText(col.getRPupilSize());
			txtLPupilReact.setText(col.getLPupilReact());
			txtOpenSpontaneously.setText(col.getOpensSpontaneously());
			txtOpensToSpeech.setText(col.getOpensToSpeech());
			txtOpensToPain.setText(col.getOpensToPain());
			txtDoesNotOpen.setText(col.getDoesNotOpen());
			txtAlert.setText(col.getAlert());
			txtDrowsy.setText(col.getDrowsy());
			txtStuporous.setText(col.getStuporous());
			txtComatose.setText(col.getComatose());
			txtSpeechOriented.setText(col.getSpeechOriented());
			txtConfusedConversation.setText(col.getConfusedConversation());
			txtInappropriateWords.setText(col.getInappropriateWords());
			txtIncomprehensibleSpeech.setText(col.getIncomprehensibleSpeech());
			txtNoSpeech.setText(col.getNoSpeech());
			txtLtUpperExtrimity.setText(col.getLtUpperExtremity());
			txtLtLowerExtrimity.setText(col.getLtLowerExtremity());
			txtRtUpperExtrimity.setText(col.getRtUpperExtremity());
			txtRtLowerExtremity.setText(col.getRtLowerExtremity());
			txtNurseInitial.setText(col.getNurseInitial());
		}
	}

	public void doSave() {
		ResidentAssessmentFormPage19Col col = getValueObject();
		// System.out.println(col+"");
		// System.out.println(col.getDateOfAssessment());
		// System.out.println(col.getTimeOfAssessment());
		if (col != null) {
			Global.panelResidentAssessmentFormPage19.columns.add(col);
		}
	}

	private void openDialog() {
		// System.out.println("Opening Dialog");
		FrameResidentAssessmentFormPage19Dialog frame = (FrameResidentAssessmentFormPage19Dialog) FrameFactory
				.createWindowOfType(FrameResidentAssessmentFormPage19Dialog.class);
		// System.out.println("Dialog is:"+frame);
		frame.setModal(true);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		// PanelResidentAssessmentFormPage19Dialog dialogPanel=new
		// PanelResidentAssessmentFormPage19Dialog();
		// frame.setSize(dialogPanel.getWidth(),dialogPanel.getHeight());
		SwingUtils.center(frame);
		// frame.getContentPane().add(dialogPanel));
		frame.setVisible(true);
		setValueObject(Global.currentResidentAssessmentFormPage19Col);
		Global.currentResidentAssessmentFormPage19Col = null;
	}

	// public static void main(String[] args) {
	// PanelResidentAssessmentFormPageCol19 com = new
	// PanelResidentAssessmentFormPageCol19(0);
	// com.setSize(100, 800);
	// com.setPreferredSize(com.getSize());
	// SwingUtils.wrapInFrame(com).setVisible(true);
	// }
}
